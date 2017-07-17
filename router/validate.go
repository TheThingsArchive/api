// Copyright © 2017 The Things Network
// Use of this source code is governed by the MIT license that can be found in the LICENSE file.

package router

import "github.com/TheThingsNetwork/api/validate"

func (m *SubscribeRequest) Validate() error {
	return nil
}

func (m *UplinkMessage) Validate() error {
	return validate.FirstError("Invalid UplinkMessage",
		m.GetGatewayMetadata().Validate(),
		m.GetMessage().Validate(),
		m.GetProtocolMetadata().Validate(),
	)
}

func (m *DownlinkMessage) Validate() error {
	return validate.FirstError("Invalid DownlinkMessage",
		m.GetGatewayConfiguration().Validate(),
		m.GetMessage().Validate(),
		m.GetProtocolConfiguration().Validate(),
	)
}

func (m *DeviceActivationRequest) Validate() error {
	return validate.FirstError("Invalid DeviceActivationRequest",
		validate.Wrap("Invalid AppEUI", validate.AppEUI(m.GetAppEUI(), false)),
		validate.Wrap("Invalid DevEUI", validate.DevEUI(m.GetDevEUI(), false)),
		m.GetGatewayMetadata().Validate(),
		m.GetMessage().Validate(),
		m.GetProtocolMetadata().Validate(),
		m.GetActivationMetadata().Validate(),
	)
}

func (m *DeviceActivationResponse) Validate() error {
	return nil
}

func (m *GatewayStatusRequest) Validate() error {
	return validate.FirstError("Invalid GatewayStatusRequest",
		validate.Wrap("Invalid GatewayID", validate.ID(m.GetGatewayID(), false)),
	)
}

func (m *GatewayStatusResponse) Validate() error {
	return validate.FirstError("Invalid GatewayStatusResponse",
		m.GetStatus().Validate(),
	)
}

func (m *StatusRequest) Validate() error {
	return nil
}

func (m *Status) Validate() error {
	return nil
}
