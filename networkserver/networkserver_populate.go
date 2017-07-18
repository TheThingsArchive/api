// Copyright © 2017 The Things Network
// Use of this source code is governed by the MIT license that can be found in the LICENSE file.

package networkserver

import "github.com/TheThingsNetwork/api/randapi"

func NewPopulatedDevicesRequest(r randapi.BasicRand, easy bool) *DevicesRequest {
	c := randapi.NewContextual(r)
	this := newPopulatedDevicesRequest(c, easy)
	this.DevAddr = c.DevAddr()
	return this
}
func NewPopulatedDevicesResponse(r randapi.BasicRand, easy bool) *DevicesResponse {
	c := randapi.NewContextual(r)
	this := newPopulatedDevicesResponse(c, easy)
	return this
}
func NewPopulatedStatusRequest(r randapi.BasicRand, easy bool) *StatusRequest {
	c := randapi.NewContextual(r)
	this := newPopulatedStatusRequest(c, easy)
	return this
}
func NewPopulatedStatus(r randapi.BasicRand, easy bool) *Status {
	c := randapi.NewContextual(r)
	this := newPopulatedStatus(c, easy)
	return this
}
