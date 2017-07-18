// Copyright © 2017 The Things Network
// Use of this source code is governed by the MIT license that can be found in the LICENSE file.

package router

import "github.com/TheThingsNetwork/api/randapi"

func NewPopulatedSubscribeRequest(r randapi.BasicRand, easy bool) *SubscribeRequest {
	c := randapi.NewContextual(r)
	this := newPopulatedSubscribeRequest(c, easy)
	return this
}
func NewPopulatedUplinkMessage(r randapi.BasicRand, easy bool) *UplinkMessage {
	c := randapi.NewContextual(r)
	this := newPopulatedUplinkMessage(c, easy)
	return this
}
func NewPopulatedDownlinkMessage(r randapi.BasicRand, easy bool) *DownlinkMessage {
	c := randapi.NewContextual(r)
	this := newPopulatedDownlinkMessage(c, easy)
	return this
}
func NewPopulatedDeviceActivationRequest(r randapi.BasicRand, easy bool) *DeviceActivationRequest {
	c := randapi.NewContextual(r)
	this := newPopulatedDeviceActivationRequest(c, easy)
	this.AppEUI = c.AppEUI()
	this.DevEUI = c.DevEUI()
	return this
}
func NewPopulatedDeviceActivationResponse(r randapi.BasicRand, easy bool) *DeviceActivationResponse {
	c := randapi.NewContextual(r)
	this := newPopulatedDeviceActivationResponse(c, easy)
	return this
}
func NewPopulatedGatewayStatusRequest(r randapi.BasicRand, easy bool) *GatewayStatusRequest {
	c := randapi.NewContextual(r)
	this := newPopulatedGatewayStatusRequest(c, easy)
	this.GatewayID = c.ID()
	return this
}
func NewPopulatedGatewayStatusResponse(r randapi.BasicRand, easy bool) *GatewayStatusResponse {
	c := randapi.NewContextual(r)
	this := newPopulatedGatewayStatusResponse(c, easy)
	this.LastSeen = c.NanoTime()
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
