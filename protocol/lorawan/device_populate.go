// Copyright © 2017 The Things Network
// Use of this source code is governed by the MIT license that can be found in the LICENSE file.

package lorawan

import "github.com/TheThingsNetwork/api/randapi"

func NewPopulatedDeviceIdentifier(r randapi.BasicRand, easy bool) *DeviceIdentifier {
	c := randapi.NewContextual(r)
	this := newPopulatedDeviceIdentifier(c, easy)
	this.AppEUI = c.AppEUI()
	this.DevEUI = c.DevEUI()
	return this
}

func NewPopulatedDevice(r randapi.BasicRand, easy bool) *Device {
	c := randapi.NewContextual(r)
	this := newPopulatedDevice(c, easy)
	this.AppEUI = c.AppEUI()
	this.AppID = c.ID()
	this.AppKey = c.AppKey()
	this.AppSKey = c.AppSKey()
	this.DevAddr = c.DevAddr()
	this.DevEUI = c.DevEUI()
	this.DevID = c.ID()
	this.LastSeen = c.NanoTime()
	this.NwkSKey = c.NwkSKey()
	return this
}
