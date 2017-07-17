// Copyright © 2017 The Things Network
// Use of this source code is governed by the MIT license that can be found in the LICENSE file.

package broker

import (
	"github.com/TheThingsNetwork/api/gateway"
	"github.com/TheThingsNetwork/api/validate"
)

func (m *ActivationChallengeRequest) Validate() error {
	return validate.FirstError("Invalid ActivationChallengeRequest",
		validate.Wrap("Invalid AppID", validate.ID(m.GetAppID(), false)),
		validate.Wrap("Invalid DevID", validate.ID(m.GetDevID(), false)),
		validate.Wrap("Invalid AppEUI", validate.AppEUI(m.GetAppEUI(), false)),
		validate.Wrap("Invalid DevEUI", validate.DevEUI(m.GetDevEUI(), false)),
		m.GetMessage().Validate(),
	)
}

func (m *ActivationChallengeResponse) Validate() error {
	return validate.FirstError("Invalid ActivationChallengeResponse",
		m.GetMessage().Validate(),
	)
}

func (m *ApplicationHandlerRegistration) Validate() error {
	return validate.FirstError("Invalid DeduplicatedDeviceActivationRequest",
		validate.Wrap("Invalid AppID", validate.ID(m.GetAppID(), false)),
		validate.Wrap("Invalid HandlerID", validate.ID(m.GetHandlerID(), false)),
	)
}

func (m *DeduplicatedDeviceActivationRequest) Validate() error {
	return validate.FirstError("Invalid DeduplicatedDeviceActivationRequest",
		validate.Wrap("Invalid AppID", validate.ID(m.GetAppID(), false)),
		validate.Wrap("Invalid DevID", validate.ID(m.GetDevID(), false)),
		validate.Wrap("Invalid AppEUI", validate.AppEUI(m.GetAppEUI(), false)),
		validate.Wrap("Invalid DevEUI", validate.DevEUI(m.GetDevEUI(), false)),
		gateway.ValidateRxMetadata(m.GetGatewayMetadata()...),
		m.GetActivationMetadata().Validate(),
		m.GetMessage().Validate(),
		m.GetProtocolMetadata().Validate(),
		m.GetResponseTemplate().Validate(),
	)
}

func (m *DeduplicatedUplinkMessage) Validate() error {
	return validate.FirstError("Invalid DeduplicatedDeviceActivationRequest",
		validate.Wrap("Invalid AppID", validate.ID(m.GetAppID(), false)),
		validate.Wrap("Invalid DevID", validate.ID(m.GetDevID(), false)),
		validate.Wrap("Invalid AppEUI", validate.AppEUI(m.GetAppEUI(), false)),
		validate.Wrap("Invalid DevEUI", validate.DevEUI(m.GetDevEUI(), false)),
		gateway.ValidateRxMetadata(m.GetGatewayMetadata()...),
		m.GetMessage().Validate(),
		m.GetProtocolMetadata().Validate(),
		m.GetResponseTemplate().Validate(),
	)
}

func (m *DeviceActivationRequest) Validate() error {
	return validate.FirstError("Invalid DeviceActivationRequest",
		validate.Wrap("Invalid AppEUI", validate.AppEUI(m.GetAppEUI(), false)),
		validate.Wrap("Invalid DevEUI", validate.DevEUI(m.GetDevEUI(), false)),
		m.GetActivationMetadata().Validate(),
		m.GetGatewayMetadata().Validate(),
		m.GetMessage().Validate(),
		m.GetProtocolMetadata().Validate(),
		ValidateDownlinkOption(m.GetDownlinkOptions()...),
	)
}

func (m *DeviceActivationResponse) Validate() error {
	return validate.FirstError("Invalid DeviceActivationResponse",
		m.GetDownlinkOption().Validate(),
		m.GetMessage().Validate(),
	)
}

func (m *DownlinkMessage) Validate() error {
	return validate.FirstError("Invalid DownlinkMessage",
		validate.Wrap("Invalid AppID", validate.ID(m.GetAppID(), false)),
		validate.Wrap("Invalid DevID", validate.ID(m.GetDevID(), false)),
		validate.Wrap("Invalid AppEUI", validate.AppEUI(m.GetAppEUI(), false)),
		validate.Wrap("Invalid DevEUI", validate.DevEUI(m.GetDevEUI(), false)),
		m.GetDownlinkOption().Validate(),
		m.GetMessage().Validate(),
	)
}

func (m *DownlinkOption) Validate() error {
	return validate.FirstError("Invalid DownlinkOption",
		validate.Wrap("Invalid GatewayID", validate.ID(m.GetGatewayID(), false)),
		m.GetGatewayConfiguration().Validate(),
		m.GetProtocolConfiguration().Validate(),
	)
}

func ValidateDownlinkOption(m ...*DownlinkOption) error {
	errs := make([]error, len(m))
	for i, m := range m {
		errs[i] = m.Validate()
	}
	return validate.FirstError("", errs...)
}

func (m *UplinkMessage) Validate() error {
	return validate.FirstError("Invalid UplinkMessage",
		validate.Wrap("Invalid AppID", validate.ID(m.GetAppID(), false)),
		validate.Wrap("Invalid DevID", validate.ID(m.GetDevID(), false)),
		validate.Wrap("Invalid AppEUI", validate.AppEUI(m.GetAppEUI(), false)),
		validate.Wrap("Invalid DevEUI", validate.DevEUI(m.GetDevEUI(), false)),
		m.GetGatewayMetadata().Validate(),
		m.GetMessage().Validate(),
		m.GetProtocolMetadata().Validate(),
		ValidateDownlinkOption(m.GetDownlinkOptions()...),
	)
}

func (m *StatusRequest) Validate() error {
	return nil
}

func (m *Status) Validate() error {
	return nil
}
