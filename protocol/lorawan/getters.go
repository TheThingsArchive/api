// Copyright © 2017 The Things Network
// Use of this source code is governed by the MIT license that can be found in the LICENSE file.

package lorawan

import "github.com/TheThingsNetwork/ttn/core/types"

func (m *DeviceIdentifier) GetAppEUI() (eui types.AppEUI) {
	if m != nil {
		return m.AppEUI
	}
	return
}

func (m *DeviceIdentifier) GetDevEUI() (eui types.DevEUI) {
	if m != nil {
		return m.DevEUI
	}
	return
}

func (m *Device) GetAppEUI() (eui types.AppEUI) {
	if m != nil {
		return m.AppEUI
	}
	return
}

func (m *Device) GetDevEUI() (eui types.DevEUI) {
	if m != nil {
		return m.DevEUI
	}
	return
}

func (m *Device) GetDevAddr() (addr types.DevAddr) {
	if m != nil {
		if m.DevAddr != nil {
			return *m.DevAddr
		}
	}
	return
}

func (m *Device) GetAppKey() (key types.AppKey) {
	if m != nil {
		if m.AppKey != nil {
			return *m.AppKey
		}
	}
	return
}

func (m *Device) GetAppSKey() (eui types.AppSKey) {
	if m != nil {
		if m.AppSKey != nil {
			return *m.AppSKey
		}
	}
	return
}

func (m *Device) GetNwkSKey() (eui types.NwkSKey) {
	if m != nil {
		if m.NwkSKey != nil {
			return *m.NwkSKey
		}
	}
	return
}

func (m *ActivationMetadata) GetAppEUI() (eui types.AppEUI) {
	if m != nil {
		return m.AppEUI
	}
	return
}

func (m *ActivationMetadata) GetDevEUI() (eui types.DevEUI) {
	if m != nil {
		return m.DevEUI
	}
	return
}

func (m *ActivationMetadata) GetDevAddr() (addr types.DevAddr) {
	if m != nil {
		if m.DevAddr != nil {
			return *m.DevAddr
		}
	}
	return
}

func (m *ActivationMetadata) GetNwkSKey() (eui types.NwkSKey) {
	if m != nil {
		if m.NwkSKey != nil {
			return *m.NwkSKey
		}
	}
	return
}
