// Copyright © 2017 The Things Network
// Use of this source code is governed by the MIT license that can be found in the LICENSE file.

package router

import "github.com/TheThingsNetwork/ttn/core/types"

func (m *DeviceActivationRequest) GetAppEUI() (eui types.AppEUI) {
	if m != nil {
		return m.AppEUI
	}
	return
}

func (m *DeviceActivationRequest) GetDevEUI() (eui types.DevEUI) {
	if m != nil {
		return m.DevEUI
	}
	return
}
