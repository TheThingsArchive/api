// Copyright © 2017 The Things Network
// Use of this source code is governed by the MIT license that can be found in the LICENSE file.

package broker

import (
	"io"
	"sync"
	"sync/atomic"

	. "github.com/TheThingsNetwork/api/broker"
	"github.com/TheThingsNetwork/go-utils/grpc/ttnctx"
	"github.com/TheThingsNetwork/go-utils/log"
	"github.com/TheThingsNetwork/ttn/utils/errors"
	"github.com/gogo/protobuf/types"
	"golang.org/x/net/context"
	"google.golang.org/grpc"
	"google.golang.org/grpc/codes"
)

// NewReferenceBrokerServer creates a new reference broker server
func NewReferenceBrokerServer(bufferSize int) *ReferenceBrokerServer {
	s := &ReferenceBrokerServer{
		ctx: log.Get(),

		bufferSize: bufferSize,

		uplinkIn:    make(chan *UplinkMessage, bufferSize),
		DownlinkOut: make(map[string]*DownlinkSubscription),

		downlinkIn: make(chan *DownlinkMessage, bufferSize),
		UplinkOut:  make(map[string]*UplinkSubscription),

		Metrics: new(Metrics),
	}
	for i := 0; i < bufferSize; i++ {
		go func() {
			for {
				select {
				case <-s.uplinkIn:
					atomic.AddUint64(&s.Metrics.UplinkIn, 1)
				case <-s.downlinkIn:
					atomic.AddUint64(&s.Metrics.DownlinkIn, 1)
				}
			}
		}()
	}
	return s
}

type Metrics struct {
	UplinkIn   uint64
	DownlinkIn uint64
}

// ReferenceBrokerServer is a new reference broker server
type ReferenceBrokerServer struct {
	ctx log.Interface

	bufferSize int

	uplinkIn   chan *UplinkMessage
	downlinkIn chan *DownlinkMessage

	mu          sync.RWMutex
	DownlinkOut map[string]*DownlinkSubscription
	UplinkOut   map[string]*UplinkSubscription

	Metrics *Metrics
}

type DownlinkSubscription struct {
	Ch          chan *DownlinkMessage
	subscribers int
}

func (s *ReferenceBrokerServer) addDownlinkSubscriber(routerID string) chan *DownlinkMessage {
	s.mu.Lock()
	defer s.mu.Unlock()
	if sub, ok := s.DownlinkOut[routerID]; ok {
		sub.subscribers++
		return sub.Ch
	}
	sub := &DownlinkSubscription{
		subscribers: 1,
		Ch:          make(chan *DownlinkMessage, s.bufferSize),
	}
	s.DownlinkOut[routerID] = sub
	return sub.Ch
}

func (s *ReferenceBrokerServer) removeDownlinkSubscriber(routerID string) {
	s.mu.Lock()
	defer s.mu.Unlock()
	if sub, ok := s.DownlinkOut[routerID]; ok && sub.subscribers > 0 {
		sub.subscribers--
	}
}

type UplinkSubscription struct {
	Ch          chan *DeduplicatedUplinkMessage
	subscribers int
}

func (s *ReferenceBrokerServer) addUplinkSubscriber(handlerID string) chan *DeduplicatedUplinkMessage {
	s.mu.Lock()
	defer s.mu.Unlock()
	if sub, ok := s.UplinkOut[handlerID]; ok {
		sub.subscribers++
		return sub.Ch
	}
	sub := &UplinkSubscription{
		subscribers: 1,
		Ch:          make(chan *DeduplicatedUplinkMessage, s.bufferSize),
	}
	s.UplinkOut[handlerID] = sub
	return sub.Ch
}

func (s *ReferenceBrokerServer) removeUplinkSubscriber(handlerID string) {
	s.mu.Lock()
	defer s.mu.Unlock()
	if sub, ok := s.UplinkOut[handlerID]; ok && sub.subscribers > 0 {
		sub.subscribers--
	}
}

func (s *ReferenceBrokerServer) getAndAuthRouter(ctx context.Context) (string, error) {
	id, err := ttnctx.IDFromIncomingContext(ctx)
	if err != nil {
		return "", err
	}
	token, err := ttnctx.TokenFromIncomingContext(ctx)
	if err != nil {
		return "", err
	}
	// Actually validate token here, if failed: return nil, grpc.Errorf(codes.Unauthenticated, "Router Authentication Failed")
	s.ctx.WithFields(log.Fields{"ID": id, "Token": token}).Info("Router Authenticated")
	return id, nil
}

// Associate RPC
func (s *ReferenceBrokerServer) Associate(stream Broker_AssociateServer) error {
	routerID, err := s.getAndAuthRouter(stream.Context())
	if err != nil {
		return errors.NewErrPermissionDenied(err.Error())
	}
	ctx := s.ctx.WithField("RouterID", routerID)
	ctx.Info("Associate stream started")
	defer func() {
		if err != nil {
			ctx.WithError(err).Info("Associate stream ended")
		} else {
			ctx.Info("Associate stream ended")
		}
	}()

	sub := s.addDownlinkSubscriber(routerID)
	defer s.removeDownlinkSubscriber(routerID)

	var streamErr atomic.Value

	go func() {
		for {
			select {
			case <-stream.Context().Done():
				streamErr.Store(stream.Context().Err())
				return
			case msg, ok := <-sub:
				if !ok {
					streamErr.Store(io.EOF)
					return
				}
				err := stream.Send(msg)
				if err != nil {
					streamErr.Store(err)
					return
				}
				ctx.Info("Sent DownlinkMessage")
			}
		}
	}()

	for {
		streamErr := streamErr.Load()
		if streamErr != nil {
			return streamErr.(error)
		}
		msg, err := stream.Recv()
		if err != nil {
			return err
		}
		ctx.Info("Received UplinkMessage")
		select {
		case s.uplinkIn <- msg:
		default:
			ctx.Warn("Dropping UplinkMessage")
		}
	}
}

func (s *ReferenceBrokerServer) getAndAuthHandler(ctx context.Context) (string, error) {
	id, err := ttnctx.IDFromIncomingContext(ctx)
	if err != nil {
		return "", err
	}
	token, err := ttnctx.TokenFromIncomingContext(ctx)
	if err != nil {
		return "", err
	}
	// Actually validate token here, if failed: return nil, grpc.Errorf(codes.Unauthenticated, "Handler Authentication Failed")
	s.ctx.WithFields(log.Fields{"ID": id, "Token": token}).Info("Handler Authenticated")
	return id, nil
}

// Subscribe RPC
func (s *ReferenceBrokerServer) Subscribe(req *SubscribeRequest, stream Broker_SubscribeServer) error {
	handlerID, err := s.getAndAuthHandler(stream.Context())
	if err != nil {
		return errors.NewErrPermissionDenied(err.Error())
	}
	ctx := s.ctx.WithField("HandlerID", handlerID)
	ctx.Info("Subscribe stream started")
	defer func() {
		if err != nil {
			ctx.WithError(err).Info("Subscribe stream ended")
		} else {
			ctx.Info("Subscribe stream ended")
		}
	}()

	sub := s.addUplinkSubscriber(handlerID)
	defer s.removeUplinkSubscriber(handlerID)

	for {
		select {
		case <-stream.Context().Done():
			return stream.Context().Err()
		case msg, ok := <-sub:
			if !ok {
				return nil
			}
			err := stream.Send(msg)
			if err != nil {
				return err
			}
			ctx.Info("Sent UplinkMessage")
		}
	}
}

// Publish RPC
func (s *ReferenceBrokerServer) Publish(stream Broker_PublishServer) error {
	handlerID, err := s.getAndAuthHandler(stream.Context())
	if err != nil {
		return errors.NewErrPermissionDenied(err.Error())
	}
	ctx := s.ctx.WithField("HandlerID", handlerID)
	ctx.Info("Publish stream started")
	defer func() {
		if err != nil {
			ctx.WithError(err).Info("Publish stream ended")
		} else {
			ctx.Info("Publish stream ended")
		}
	}()
	var streamErr atomic.Value
	go func() {
		<-stream.Context().Done()
		streamErr.Store(stream.Context().Err())
	}()
	for {
		streamErr := streamErr.Load()
		if streamErr != nil {
			return streamErr.(error)
		}
		msg, err := stream.Recv()
		if err == io.EOF {
			return stream.SendAndClose(&types.Empty{})
		}
		if err != nil {
			return err
		}
		ctx.Info("Received DownlinkMessage")
		select {
		case s.downlinkIn <- msg:
		default:
			ctx.Warn("Dropping DownlinkMessage")
		}
	}
}

// Activate RPC
func (s *ReferenceBrokerServer) Activate(ctx context.Context, req *DeviceActivationRequest) (*DeviceActivationResponse, error) {
	return nil, grpc.Errorf(codes.Unimplemented, "Not implemented")
}
