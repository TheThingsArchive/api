package networkserver

import "github.com/TheThingsNetwork/ttn/core/types"

func (m *DevicesRequest) GetDevAddr() (addr types.DevAddr) {
	if m != nil {
		if m.DevAddr != nil {
			return *m.DevAddr
		}
	}
	return
}
