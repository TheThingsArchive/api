// Copyright © 2017 The Things Network
// Use of this source code is governed by the MIT license that can be found in the LICENSE file.

package broker

import "github.com/TheThingsNetwork/ttn/core/types"

func (m *DeviceActivationRequest) GetAppEUI() (eui types.AppEUI) {
	if m != nil {
		return m.AppEUI
	}
	return
}

func (m *DeduplicatedDeviceActivationRequest) GetAppEUI() (eui types.AppEUI) {
	if m != nil {
		return m.AppEUI
	}
	return
}

func (m *UplinkMessage) GetAppEUI() (eui types.AppEUI) {
	if m != nil {
		if m.AppEUI != nil {
			return *m.AppEUI
		}
	}
	return
}

func (m *DeduplicatedUplinkMessage) GetAppEUI() (eui types.AppEUI) {
	if m != nil {
		if m.AppEUI != nil {
			return *m.AppEUI
		}
	}
	return
}

func (m *DownlinkMessage) GetAppEUI() (eui types.AppEUI) {
	if m != nil {
		return m.AppEUI
	}
	return
}

func (m *ActivationChallengeRequest) GetAppEUI() (eui types.AppEUI) {
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

func (m *DeduplicatedDeviceActivationRequest) GetDevEUI() (eui types.DevEUI) {
	if m != nil {
		return m.DevEUI
	}
	return
}

func (m *UplinkMessage) GetDevEUI() (eui types.DevEUI) {
	if m != nil {
		if m.DevEUI != nil {
			return *m.DevEUI
		}
	}
	return
}

func (m *DeduplicatedUplinkMessage) GetDevEUI() (eui types.DevEUI) {
	if m != nil {
		if m.DevEUI != nil {
			return *m.DevEUI
		}
	}
	return
}

func (m *DownlinkMessage) GetDevEUI() (eui types.DevEUI) {
	if m != nil {
		return m.DevEUI
	}
	return
}

func (m *ActivationChallengeRequest) GetDevEUI() (eui types.DevEUI) {
	if m != nil {
		return m.DevEUI
	}
	return
}
