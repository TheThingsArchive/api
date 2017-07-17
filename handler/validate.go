// Copyright © 2017 The Things Network
// Use of this source code is governed by the MIT license that can be found in the LICENSE file.

package handler

import "github.com/TheThingsNetwork/api/validate"

func (m *DeviceActivationResponse) Validate() error {
	return validate.FirstError("Invalid DeviceActivationResponse",
		m.GetActivationMetadata().Validate(),
		m.GetDownlinkOption().Validate(),
		m.GetMessage().Validate(),
	)
}

func (m *StatusRequest) Validate() error {
	return nil
}

func (m *Status) Validate() error {
	return nil
}

func (m *ApplicationIdentifier) Validate() error {
	return validate.FirstError("Invalid ApplicationIdentifier",
		validate.Wrap("Invalid AppID", validate.ID(m.GetAppID(), false)),
	)
}

func (m *Application) Validate() error {
	return validate.FirstError("Invalid Application",
		validate.Wrap("Invalid AppID", validate.ID(m.GetAppID(), false)),
		nil, // TODO: maybe check validity of encoders/decoders?
	)
}

func (m *DeviceIdentifier) Validate() error {
	return validate.FirstError("Invalid DeviceIdentifier",
		validate.Wrap("Invalid AppID", validate.ID(m.GetAppID(), false)),
		validate.Wrap("Invalid DevID", validate.ID(m.GetDevID(), false)),
	)
}

func (m *Device) Validate() error {
	return validate.FirstError("Invalid Device",
		validate.Wrap("Invalid AppID", validate.ID(m.GetAppID(), false)),
		validate.Wrap("Invalid DevID", validate.ID(m.GetDevID(), false)),
		nil, // TODO
	)
}

func ValidateDevice(m ...*Device) error {
	errs := make([]error, len(m))
	for i, m := range m {
		errs[i] = m.Validate()
	}
	return validate.FirstError("", errs...)
}

func (m *DeviceList) Validate() error {
	return validate.FirstError("Invalid DeviceList",
		ValidateDevice(m.GetDevices()...),
	)
}

func (m *DryDownlinkMessage) Validate() error {
	return validate.FirstError("Invalid DryDownlinkMessage",
		m.GetApp().Validate(),
	)
}

func (m *DryUplinkMessage) Validate() error {
	return validate.FirstError("Invalid DryUplinkMessage",
		m.GetApp().Validate(),
	)
}

func (m *SimulatedUplinkMessage) Validate() error {
	return validate.FirstError("Invalid SimulatedUplinkMessage",
		validate.Wrap("Invalid AppID", validate.ID(m.GetAppID(), false)),
		validate.Wrap("Invalid DevID", validate.ID(m.GetDevID(), false)),
	)
}

func (m *LogEntry) Validate() error {
	return nil
}

func (m *DryUplinkResult) Validate() error {
	return nil
}

func (m *DryDownlinkResult) Validate() error {
	return nil
}
