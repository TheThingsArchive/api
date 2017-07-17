package discovery

import "github.com/TheThingsNetwork/ttn/core/types"

func (m *GetByAppEUIRequest) GetAppEUI() (eui types.AppEUI) {
	if m != nil {
		if m.AppEUI != nil {
			return *m.AppEUI
		}
	}
	return
}
