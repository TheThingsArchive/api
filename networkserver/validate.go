// Copyright © 2017 The Things Network
// Use of this source code is governed by the MIT license that can be found in the LICENSE file.

package networkserver

import (
	"github.com/TheThingsNetwork/api/protocol/lorawan"
	"github.com/TheThingsNetwork/api/validate"
)

func (m *DevicesRequest) Validate() error {
	return nil
}

func (m *DevicesResponse) Validate() error {
	return validate.FirstError("Invalid DevicesResponse",
		lorawan.ValidateDevices(m.GetResults()...),
	)
}

func (m *StatusRequest) Validate() error {
	return nil
}

func (m *Status) Validate() error {
	return nil
}
