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
	"github.com/bluele/gcache"
	"golang.org/x/net/context" // See https://github.com/grpc/grpc-go/issues/711
	"google.golang.org/grpc"
)

// CacheSize indicates the number of components that are cached
var CacheSize = 1000

// CacheExpiration indicates the time a cached item is valid
var CacheExpiration = 5 * time.Minute

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
		lists:        make(map[string][]*discovery.Announcement),
		listsUpdated: make(map[string]time.Time),
		self:         announcement,
		tokenFunc:    tokenFunc,
		conn:         conn,
		client:       discovery.NewDiscoveryClient(conn),
	}
	client.cache = gcache.
		New(CacheSize).
		Expiration(CacheExpiration).
		LRU().
		LoaderFunc(func(k interface{}) (interface{}, error) {
			key, ok := k.(cacheKey)
			if !ok {
				return nil, fmt.Errorf("wrong type for cacheKey: %T", k)
			}
			return client.get(key.serviceName, key.id)
		}).
		Build()
	return client, nil
}

// DefaultClient is a wrapper around DiscoveryClient
type DefaultClient struct {
	sync.Mutex
	cache        gcache.Cache
	listsUpdated map[string]time.Time
	lists        map[string][]*discovery.Announcement
	self         *discovery.Announcement
	tokenFunc    func() string
	conn         *grpc.ClientConn
	client       discovery.DiscoveryClient
}

type cacheKey struct {
	serviceName string
	id          string
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

func (c *DefaultClient) get(serviceName, id string) (*discovery.Announcement, error) {
	res, err := c.client.Get(c.getContext(""), &discovery.GetRequest{
		ServiceName: serviceName,
		ID:          id,
	})
	if err != nil {
		return nil, err
	}
	return res, nil
}

func (c *DefaultClient) getAll(serviceName string) ([]*discovery.Announcement, error) {
	res, err := c.client.GetAll(c.getContext(""), &discovery.GetServiceRequest{ServiceName: serviceName})
	if err != nil {
		return nil, err
	}
	c.lists[serviceName] = res.Services
	c.listsUpdated[serviceName] = time.Now()
	for _, announcement := range res.Services {
		c.cache.Set(&cacheKey{serviceName: announcement.ServiceName, id: announcement.ID}, announcement)
	}
	return res.Services, nil
}

// Announce announces the configured announcement to the discovery server
func (c *DefaultClient) Announce(token string) error {
	_, err := c.client.Announce(c.getContext(token), c.self)
	return err
}

// GetAll returns all services of the given service type
func (c *DefaultClient) GetAll(serviceName string) ([]*discovery.Announcement, error) {
	c.Lock()
	defer c.Unlock()

	// If list initialized, return cached version
	if list, ok := c.lists[serviceName]; ok && len(list) > 0 {
		// And update if expired
		if c.listsUpdated[serviceName].Add(CacheExpiration).Before(time.Now()) {
			go func() {
				c.Lock()
				defer c.Unlock()
				c.getAll(serviceName)
			}()
		}
		return list, nil
	}

	// If list not initialized, do request
	return c.getAll(serviceName)
}

// Get returns the (cached) service annoucement for the given service type and id
func (c *DefaultClient) Get(serviceName, id string) (*discovery.Announcement, error) {
	res, err := c.cache.Get(cacheKey{serviceName, id})
	if err != nil {
		return nil, err
	}
	return res.(*discovery.Announcement), nil
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
	brokers, err := c.GetAll("broker")
	if err != nil {
		return nil, err
	}
next:
	for _, broker := range brokers {
		for _, prefix := range broker.DevAddrPrefixes() {
			if devAddr.HasPrefix(prefix) {
				announcements = append(announcements, broker)
				continue next
			}
		}
	}
	return
}

// GetAllHandlersForAppID returns all handlers that can handle the given AppID
func (c *DefaultClient) GetAllHandlersForAppID(appID string) (announcements []*discovery.Announcement, err error) {
	handlers, err := c.GetAll("handler")
	if err != nil {
		return nil, err
	}
next:
	for _, handler := range handlers {
		for _, handlerAppID := range handler.AppIDs() {
			if handlerAppID == appID {
				announcements = append(announcements, handler)
				continue next
			}
		}
	}
	return
}

// GetAllRoutersForGatewayID returns all routers that can handle the given GatewayID
func (c *DefaultClient) GetAllRoutersForGatewayID(gatewayID string) (announcements []*discovery.Announcement, err error) {
	routers, err := c.GetAll("router")
	if err != nil {
		return nil, err
	}
next:
	for _, router := range routers {
		for _, routerGatewayID := range router.GatewayIDs() {
			if routerGatewayID == gatewayID {
				announcements = append(announcements, router)
				continue next
			}
		}
	}
	return
}

// Close purges the cache and closes the connection with the Discovery server
func (c *DefaultClient) Close() error {
	c.cache.Purge()
	return c.conn.Close()
}
