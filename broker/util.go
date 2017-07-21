// Copyright © 2017 The Things Network
// Use of this source code is governed by the MIT license that can be found in the LICENSE file.

package broker

import "github.com/TheThingsNetwork/api/protocol"

func (m *DeduplicatedUplinkMessage) InitResponseTemplate() *DownlinkMessage {
	if m.ResponseTemplate == nil {
		m.ResponseTemplate = new(DownlinkMessage)
	}
	m.ResponseTemplate.Message = new(protocol.Message)
	m.ResponseTemplate.AppEUI = m.AppEUI
	m.ResponseTemplate.DevEUI = m.DevEUI
	m.ResponseTemplate.AppID = m.AppID
	m.ResponseTemplate.DevID = m.DevID
	return m.ResponseTemplate
}
