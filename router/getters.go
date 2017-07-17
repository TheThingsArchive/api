package router

import "github.com/TheThingsNetwork/ttn/core/types"

func (m *DeviceActivationRequest) GetAppEUI() (eui types.AppEUI) {
	if m != nil {
		if m.AppEUI != nil {
			return *m.AppEUI
		}
	}
	return
}

func (m *DeviceActivationRequest) GetDevEUI() (eui types.DevEUI) {
	if m != nil {
		if m.DevEUI != nil {
			return *m.DevEUI
		}
	}
	return
}
