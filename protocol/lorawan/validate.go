// Copyright © 2017 The Things Network
// Use of this source code is governed by the MIT license that can be found in the LICENSE file.

package lorawan

import (
	"regexp"

	"github.com/TheThingsNetwork/api/validate"
	"github.com/TheThingsNetwork/ttn/utils/errors"
)

func (m *DeviceIdentifier) Validate() error {
	return validate.FirstError("Invalid DeviceIdentifier",
		validate.Wrap("Invalid AppEUI", validate.AppEUI(m.GetAppEUI(), false)),
		validate.Wrap("Invalid DevEUI", validate.DevEUI(m.GetDevEUI(), false)),
	)
}

func (m *Device) Validate() error {
	return validate.FirstError("Invalid Device",
		validate.Wrap("Invalid AppID", validate.ID(m.GetAppID(), false)),
		validate.Wrap("Invalid DevID", validate.ID(m.GetDevID(), false)),
		validate.Wrap("Invalid AppEUI", validate.AppEUI(m.GetAppEUI(), false)),
		validate.Wrap("Invalid DevEUI", validate.DevEUI(m.GetDevEUI(), false)),
		nil, // TODO: rest
	)
}

func ValidateDevices(m ...*Device) error {
	errs := make([]error, len(m))
	for i, m := range m {
		errs[i] = m.Validate()
	}
	return validate.FirstError("", errs...)
}

var dataRateRegexp = regexp.MustCompile("^SF(7|8|9|10|11|12)BW(125|250|500)$")

var ErrUnknownModulation = errors.New("Unknown Modulation")

func validateDataRate(modulation Modulation, codingRate, dataRate string, bitRate uint32) error {
	switch modulation {
	case Modulation_LORA:
		if codingRate == "" {
			return errors.New("Empty CodingRate")
		}
		if dataRate == "" {
			return errors.New("Empty DataRate")
		}
		if !dataRateRegexp.MatchString(dataRate) {
			return errors.New("Invalid DataRate")
		}
		return nil
	case Modulation_FSK:
		if bitRate == 0 {
			return errors.New("Empty BitRate")
		}
		return nil
	default:
		return ErrUnknownModulation
	}
}

func (m *Metadata) Validate() error {
	return validate.FirstError("Invalid Metadata",
		validateDataRate(m.GetModulation(), m.GetCodingRate(), m.GetDataRate(), m.GetBitRate()),
	)
}

func (m *TxConfiguration) Validate() error {
	return validate.FirstError("Invalid TxConfiguration",
		validateDataRate(m.GetModulation(), m.GetCodingRate(), m.GetDataRate(), m.GetBitRate()),
	)
}

func (m *ActivationMetadata) Validate() error {
	return validate.FirstError("Invalid ActivationMetadata",
		validate.Wrap("Invalid AppEUI", validate.AppEUI(m.GetAppEUI(), false)),
		validate.Wrap("Invalid DevEUI", validate.DevEUI(m.GetDevEUI(), false)),
	)
}

func (m *Message) Validate() error {
	return validate.FirstError("Invalid Message",
		nil, // TODO
	)
}

func (m *MHDR) Validate() error {
	return validate.FirstError("Invalid MHDR",
		nil, // TODO
	)
}

func (m *MACPayload) Validate() error {
	return validate.FirstError("Invalid MACPayload",
		nil, // TODO
	)
}

func (m *FHDR) Validate() error {
	return validate.FirstError("Invalid FHDR",
		nil, // TODO
	)
}

func (m *FCtrl) Validate() error {
	return validate.FirstError("Invalid FCtrl",
		nil, // TODO
	)
}

func (m *MACCommand) Validate() error {
	return validate.FirstError("Invalid MACCommand",
		nil, // TODO
	)
}

func (m *JoinRequestPayload) Validate() error {
	return validate.FirstError("Invalid JoinRequestPayload",
		nil, // TODO
	)
}

func (m *JoinAcceptPayload) Validate() error {
	return validate.FirstError("Invalid JoinAcceptPayload",
		nil, // TODO
	)
}

func (m *DLSettings) Validate() error {
	return validate.FirstError("Invalid DLSettings",
		nil, // TODO
	)
}

func (m *CFList) Validate() error {
	return validate.FirstError("Invalid CFList",
		nil, // TODO
	)
}
