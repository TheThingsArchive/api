// Copyright © 2017 The Things Network
// Use of this source code is governed by the MIT license that can be found in the LICENSE file.

package discovery

import (
	"crypto/tls"
	"crypto/x509"
	"errors"
	"net"
	"strings"
)

// GetTLSConfig for securely connecting with this component
func (a *Announcement) GetTLSConfig() (*tls.Config, error) {
	if a.Certificate == "" {
		return nil, nil
	}

	if a.NetAddress == "" {
		return nil, errors.New("No address known for this component")
	}
	netAddress := strings.Split(a.NetAddress, ",")[0]
	netHost, _, _ := net.SplitHostPort(netAddress)

	rootCAs := x509.NewCertPool()
	ok := rootCAs.AppendCertsFromPEM([]byte(a.Certificate))
	if !ok {
		return nil, errors.New("Could not read component certificate")
	}

	return &tls.Config{ServerName: netHost, RootCAs: rootCAs}, nil
}
