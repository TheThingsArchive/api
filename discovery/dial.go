// Copyright © 2017 The Things Network
// Use of this source code is governed by the MIT license that can be found in the LICENSE file.

package discovery

import (
	"errors"
	"strings"

	"github.com/TheThingsNetwork/ttn/api/pool"
	"google.golang.org/grpc"
	"google.golang.org/grpc/credentials"
)

// WithSecure returns a gRPC DialOption with TLS
func (a *Announcement) WithSecure() grpc.DialOption {
	tlsConfig, _ := a.GetTLSConfig()
	return grpc.WithTransportCredentials(credentials.NewTLS(tlsConfig))
}

// Dial the component represented by this Announcement.
// This function is blocking if the pool uses grpc.WithBlock()
func (a *Announcement) Dial(p *pool.Pool) (*grpc.ClientConn, error) {
	if p == nil {
		p = pool.Global
	}
	if a.NetAddress == "" {
		return nil, errors.New("No address known for this component")
	}
	netAddress := strings.Split(a.NetAddress, ",")[0]
	if a.Certificate == "" {
		return p.DialInsecure(netAddress)
	}
	tlsConfig, _ := a.GetTLSConfig()
	return p.DialSecure(netAddress, credentials.NewTLS(tlsConfig))
}
