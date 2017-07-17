// Copyright © 2017 The Things Network
// Use of this source code is governed by the MIT license that can be found in the LICENSE file.

package protocol

import "errors"

// ErrUnknownProtocol is returned when a protocol message contains an unknown sub-protocol
var ErrUnknownProtocol = errors.New("Unknown protocol")

func (m *Message) Validate() error {
	p := m.GetProtocol()
	if p == nil {
		return nil
	}
	switch p := p.(type) {
	case *Message_Lorawan:
		return p.Lorawan.Validate()
	default:
		return ErrUnknownProtocol
	}
}

func (m *RxMetadata) Validate() error {
	p := m.GetProtocol()
	if p == nil {
		return nil
	}
	switch p := p.(type) {
	case *RxMetadata_Lorawan:
		return p.Lorawan.Validate()
	default:
		return ErrUnknownProtocol
	}
}

func (m *TxConfiguration) Validate() error {
	p := m.GetProtocol()
	if p == nil {
		return nil
	}
	switch p := p.(type) {
	case *TxConfiguration_Lorawan:
		return p.Lorawan.Validate()
	default:
		return ErrUnknownProtocol
	}
}

func (m *ActivationMetadata) Validate() error {
	p := m.GetProtocol()
	if p == nil {
		return nil
	}
	switch p := p.(type) {
	case *ActivationMetadata_Lorawan:
		return p.Lorawan.Validate()
	default:
		return ErrUnknownProtocol
	}
}
