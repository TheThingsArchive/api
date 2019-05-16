// Copyright © 2017 The Things Network
// Use of this source code is governed by the MIT license that can be found in the LICENSE file.

package discoveryclient

import (
	"fmt"
	"sync"
	"time"

	"github.com/TheThingsNetwork/api/discovery"
	"github.com/TheThingsNetwork/go-utils/grpc/ttnctx"
	ttnapi "github.com/TheThingsNetwork/ttn/api"
	"github.com/TheThingsNetwork/ttn/core/types"
	"golang.org/x/net/context" // See https://github.com/grpc/grpc-go/issues/711
	"golang.org/x/sync/singleflight"
	"google.golang.org/grpc"
	"google.golang.org/grpc/codes"
)

// CacheExpiration indicates the time a cached item is valid
var CacheExpiration = time.Minute

// Client is used as the main client to the Discovery server
type Client interface {
	Announce(token string) error
	GetAll(serviceName string) ([]*discovery.Announcement, error)
	Get(serviceName, id string) (*discovery.Announcement, error)
	AddDevAddrPrefix(prefix types.DevAddrPrefix) error
	AddAppID(appID string, token string) error
	AddGatewayID(gatewayID string, token string) error
	RemoveDevAddrPrefix(prefix types.DevAddrPrefix) error
	RemoveAppID(appID string, token string) error
	RemoveGatewayID(gatewayID string, token string) error
	GetAllBrokersForDevAddr(devAddr types.DevAddr) ([]*discovery.Announcement, error)
	GetAllHandlersForAppID(appID string) ([]*discovery.Announcement, error)
	GetAllRoutersForGatewayID(gatewayID string) ([]*discovery.Announcement, error)
	Close() error
}

// NewClient returns a new Client
func NewClient(server string, announcement *discovery.Announcement, tokenFunc func() string) (Client, error) {
	conn, err := ttnapi.Dial(server)
	if err != nil {
		return nil, err
	}
	client := &DefaultClient{
		self:      announcement,
		conn:      conn,
		client:    discovery.NewDiscoveryClient(conn),
		tokenFunc: tokenFunc,
	}
	return client, nil
}

func buildAnnouncements(all []*discovery.Announcement) *announcements {
	a := announcements{
		all:               all,
		announcementsByID: make(map[string]*discovery.Announcement, len(all)),
		updatedAt:         time.Now(),
	}
	for _, announcement := range all {
		a.announcementsByID[announcement.ID] = announcement
	}
	return &a
}

type announcements struct {
	all               []*discovery.Announcement
	announcementsByID map[string]*discovery.Announcement
	updatedAt         time.Time
}

func (a *announcements) routerAnnouncements() *routerAnnouncements {
	r := routerAnnouncements{
		announcements:            a,
		announcementsByGatewayID: make(map[string][]*discovery.Announcement),
	}
	for _, announcement := range a.announcementsByID {
		for _, gatewayID := range announcement.GatewayIDs() {
			r.announcementsByGatewayID[gatewayID] = append(r.announcementsByGatewayID[gatewayID], announcement)
		}
	}
	return &r
}

type routerAnnouncements struct {
	*announcements
	announcementsByGatewayID map[string][]*discovery.Announcement
}

func (a *announcements) brokerAnnouncements() *brokerAnnouncements {
	r := brokerAnnouncements{
		announcements:                a,
		announcementsByDevAddrPrefix: make(map[types.DevAddrPrefix][]*discovery.Announcement),
	}
	for _, announcement := range a.announcementsByID {
		for _, devAddrPrefix := range announcement.DevAddrPrefixes() {
			r.announcementsByDevAddrPrefix[devAddrPrefix] = append(r.announcementsByDevAddrPrefix[devAddrPrefix], announcement)
		}
	}
	return &r
}

type brokerAnnouncements struct {
	*announcements
	announcementsByDevAddrPrefix map[types.DevAddrPrefix][]*discovery.Announcement
}

func (a *announcements) handlerAnnouncements() *handlerAnnouncements {
	r := handlerAnnouncements{
		announcements:         a,
		announcementsByAppID:  make(map[string][]*discovery.Announcement),
		announcementsByAppEUI: make(map[types.AppEUI][]*discovery.Announcement),
	}
	for _, announcement := range a.announcementsByID {
		for _, appID := range announcement.AppIDs() {
			r.announcementsByAppID[appID] = append(r.announcementsByAppID[appID], announcement)
		}
		for _, appEUI := range announcement.AppEUIs() {
			r.announcementsByAppEUI[appEUI] = append(r.announcementsByAppEUI[appEUI], announcement)
		}
	}
	return &r
}

type handlerAnnouncements struct {
	*announcements
	announcementsByAppID  map[string][]*discovery.Announcement
	announcementsByAppEUI map[types.AppEUI][]*discovery.Announcement
}

// DefaultClient is a wrapper around DiscoveryClient
type DefaultClient struct {
	self      *discovery.Announcement
	conn      *grpc.ClientConn
	client    discovery.DiscoveryClient
	tokenFunc func() string

	sync.Mutex

	fetch singleflight.Group

	router          *routerAnnouncements
	routerFetching  bool
	broker          *brokerAnnouncements
	brokerFetching  bool
	handler         *handlerAnnouncements
	handlerFetching bool
}

func (c *DefaultClient) getContext(token string) context.Context {
	if token == "" {
		token = c.tokenFunc()
	}
	ctx := context.Background()
	ctx = ttnctx.OutgoingContextWithID(ctx, c.self.ID)
	ctx = ttnctx.OutgoingContextWithServiceInfo(ctx, c.self.ServiceName, c.self.ServiceVersion, c.self.NetAddress)
	ctx = ttnctx.OutgoingContextWithToken(ctx, token)
	return ctx
}

func (c *DefaultClient) getRouter() (*routerAnnouncements, error) {
	c.Lock()
	defer c.Unlock()
	if c.router == nil {
		announcements, err := c.fetchAndProcess("router")
		if err != nil {
			return nil, err
		}
		c.router = announcements.(*routerAnnouncements)
	}
	if time.Since(c.router.updatedAt) > CacheExpiration && !c.routerFetching {
		c.routerFetching = true
		go func() {
			announcements, err := c.fetchAndProcess("router")
			c.Lock()
			if err == nil {
				c.router = announcements.(*routerAnnouncements)
			}
			c.routerFetching = false
			c.Unlock()
		}()
	}
	return c.router, nil
}

func (c *DefaultClient) getBroker() (*brokerAnnouncements, error) {
	c.Lock()
	defer c.Unlock()
	if c.broker == nil {
		announcements, err := c.fetchAndProcess("broker")
		if err != nil {
			return nil, err
		}
		c.broker = announcements.(*brokerAnnouncements)
	}
	if time.Since(c.broker.updatedAt) > CacheExpiration && !c.brokerFetching {
		c.brokerFetching = true
		go func() {
			announcements, err := c.fetchAndProcess("broker")
			c.Lock()
			if err == nil {
				c.broker = announcements.(*brokerAnnouncements)
			}
			c.brokerFetching = false
			c.Unlock()
		}()
	}
	return c.broker, nil
}

func (c *DefaultClient) getHandler() (*handlerAnnouncements, error) {
	c.Lock()
	defer c.Unlock()
	if c.handler == nil {
		announcements, err := c.fetchAndProcess("handler")
		if err != nil {
			return nil, err
		}
		c.handler = announcements.(*handlerAnnouncements)
	}
	if time.Since(c.handler.updatedAt) > CacheExpiration && !c.handlerFetching {
		c.handlerFetching = true
		go func() {
			announcements, err := c.fetchAndProcess("handler")
			c.Lock()
			if err == nil {
				c.handler = announcements.(*handlerAnnouncements)
			}
			c.handlerFetching = false
			c.Unlock()
		}()
	}
	return c.handler, nil
}

func (c *DefaultClient) fetchAndProcess(serviceName string) (interface{}, error) {
	res, err := c.client.GetAll(c.getContext(""), &discovery.GetServiceRequest{ServiceName: serviceName})
	if err != nil {
		return nil, err
	}
	switch serviceName {
	case "router":
		return buildAnnouncements(res.Services).routerAnnouncements(), nil
	case "broker":
		return buildAnnouncements(res.Services).brokerAnnouncements(), nil
	case "handler":
		return buildAnnouncements(res.Services).handlerAnnouncements(), nil
	}
	panic(fmt.Errorf("unknown service name: %s", serviceName))
}

// Announce announces the configured announcement to the discovery server
func (c *DefaultClient) Announce(token string) error {
	_, err := c.client.Announce(c.getContext(token), c.self)
	return err
}

// GetAll returns all services of the given service type
func (c *DefaultClient) GetAll(serviceName string) ([]*discovery.Announcement, error) {
	switch serviceName {
	case "router":
		all, err := c.getRouter()
		if err != nil {
			return nil, err
		}
		return all.all, nil
	case "broker":
		all, err := c.getBroker()
		if err != nil {
			return nil, err
		}
		return all.all, nil
	case "handler":
		all, err := c.getHandler()
		if err != nil {
			return nil, err
		}
		return all.all, nil
	}
	return nil, grpc.Errorf(codes.NotFound, "announcement not found")
}

// Get returns the (cached) service annoucement for the given service type and id
func (c *DefaultClient) Get(serviceName, id string) (*discovery.Announcement, error) {
	switch serviceName {
	case "router":
		all, err := c.getRouter()
		if err != nil {
			return nil, err
		}
		if announcement, ok := all.announcementsByID[id]; ok {
			return announcement, nil
		}
	case "broker":
		all, err := c.getBroker()
		if err != nil {
			return nil, err
		}
		if announcement, ok := all.announcementsByID[id]; ok {
			return announcement, nil
		}
	case "handler":
		all, err := c.getHandler()
		if err != nil {
			return nil, err
		}
		if announcement, ok := all.announcementsByID[id]; ok {
			return announcement, nil
		}
	}
	return nil, grpc.Errorf(codes.NotFound, "announcement not found")
}

// AddDevAddrPrefix adds a DevAddrPrefix to the current component
func (c *DefaultClient) AddDevAddrPrefix(prefix types.DevAddrPrefix) error {
	_, err := c.client.AddMetadata(c.getContext(""), &discovery.MetadataRequest{
		ServiceName: c.self.ServiceName,
		ID:          c.self.ID,
		Metadata: discovery.Metadata{Metadata: &discovery.Metadata_DevAddrPrefix{
			DevAddrPrefix: prefix.Bytes(),
		}},
	})
	return err
}

// AddAppID adds an AppID to the current component
func (c *DefaultClient) AddAppID(appID string, token string) error {
	_, err := c.client.AddMetadata(c.getContext(token), &discovery.MetadataRequest{
		ServiceName: c.self.ServiceName,
		ID:          c.self.ID,
		Metadata: discovery.Metadata{Metadata: &discovery.Metadata_AppID{
			AppID: appID,
		}},
	})
	return err
}

// AddGatewayID adds a GatewayID to the current component
func (c *DefaultClient) AddGatewayID(gatewayID string, token string) error {
	_, err := c.client.AddMetadata(c.getContext(token), &discovery.MetadataRequest{
		ServiceName: c.self.ServiceName,
		ID:          c.self.ID,
		Metadata: discovery.Metadata{Metadata: &discovery.Metadata_GatewayID{
			GatewayID: gatewayID,
		}},
	})
	return err
}

// RemoveDevAddrPrefix removes a DevAddrPrefix from the current component
func (c *DefaultClient) RemoveDevAddrPrefix(prefix types.DevAddrPrefix) error {
	_, err := c.client.DeleteMetadata(c.getContext(""), &discovery.MetadataRequest{
		ServiceName: c.self.ServiceName,
		ID:          c.self.ID,
		Metadata: discovery.Metadata{Metadata: &discovery.Metadata_DevAddrPrefix{
			DevAddrPrefix: prefix.Bytes(),
		}},
	})
	return err
}

// RemoveAppID removes an AppID from the current component
func (c *DefaultClient) RemoveAppID(appID string, token string) error {
	_, err := c.client.DeleteMetadata(c.getContext(token), &discovery.MetadataRequest{
		ServiceName: c.self.ServiceName,
		ID:          c.self.ID,
		Metadata: discovery.Metadata{Metadata: &discovery.Metadata_AppID{
			AppID: appID,
		}},
	})
	return err
}

// RemoveGatewayID removes a GatewayID from the current component
func (c *DefaultClient) RemoveGatewayID(gatewayID string, token string) error {
	_, err := c.client.DeleteMetadata(c.getContext(token), &discovery.MetadataRequest{
		ServiceName: c.self.ServiceName,
		ID:          c.self.ID,
		Metadata: discovery.Metadata{Metadata: &discovery.Metadata_GatewayID{
			GatewayID: gatewayID,
		}},
	})
	return err
}

// GetAllBrokersForDevAddr returns all brokers that can handle the given DevAddr
func (c *DefaultClient) GetAllBrokersForDevAddr(devAddr types.DevAddr) (announcements []*discovery.Announcement, err error) {
	all, err := c.getBroker()
	if err != nil {
		return nil, err
	}
	seen := make(map[*discovery.Announcement]struct{})
	for prefix, brokers := range all.announcementsByDevAddrPrefix {
		if devAddr.HasPrefix(prefix) {
			for _, broker := range brokers {
				if _, seen := seen[broker]; seen {
					continue
				}
				announcements = append(announcements, broker)
				seen[broker] = struct{}{}
			}
		}
	}
	return
}

// GetAllHandlersForAppID returns all handlers that can handle the given AppID
func (c *DefaultClient) GetAllHandlersForAppID(appID string) (announcements []*discovery.Announcement, err error) {
	all, err := c.getHandler()
	if err != nil {
		return nil, err
	}
	seen := make(map[*discovery.Announcement]struct{})
	for announced, handlers := range all.announcementsByAppID {
		if appID == announced {
			for _, handler := range handlers {
				if _, seen := seen[handler]; seen {
					continue
				}
				announcements = append(announcements, handler)
				seen[handler] = struct{}{}
			}
		}
	}
	return
}

// GetAllRoutersForGatewayID returns all routers that can handle the given GatewayID
func (c *DefaultClient) GetAllRoutersForGatewayID(gatewayID string) (announcements []*discovery.Announcement, err error) {
	all, err := c.getRouter()
	if err != nil {
		return nil, err
	}
	seen := make(map[*discovery.Announcement]struct{})
	for announced, routers := range all.announcementsByGatewayID {
		if gatewayID == announced {
			for _, router := range routers {
				if _, seen := seen[router]; seen {
					continue
				}
				announcements = append(announcements, router)
				seen[router] = struct{}{}
			}
		}
	}
	return
}

// Close purges the cache and closes the connection with the Discovery server
func (c *DefaultClient) Close() error {
	return c.conn.Close()
}
