// Copyright © 2017 The Things Network
// Use of this source code is governed by the MIT license that can be found in the LICENSE file.

package broker

import "github.com/TheThingsNetwork/api/randapi"

func NewPopulatedDownlinkOption(r randapi.BasicRand, easy bool) *DownlinkOption {
	c := randapi.NewContextual(r)
	this := newPopulatedDownlinkOption(c, easy)
	this.GatewayID = c.ID()
	this.Identifier = c.ID()
	return this
}
func NewPopulatedUplinkMessage(r randapi.BasicRand, easy bool) *UplinkMessage {
	c := randapi.NewContextual(r)
	this := newPopulatedUplinkMessage(c, easy)
	this.AppEUI = c.AppEUI()
	this.AppID = c.ID()
	this.DevEUI = c.DevEUI()
	this.DevID = c.ID()
	return this
}
func NewPopulatedDownlinkMessage(r randapi.BasicRand, easy bool) *DownlinkMessage {
	c := randapi.NewContextual(r)
	this := newPopulatedDownlinkMessage(c, easy)
	this.AppEUI = c.AppEUI()
	this.AppID = c.ID()
	this.DevEUI = c.DevEUI()
	this.DevID = c.ID()
	return this
}
func NewPopulatedDeviceActivationResponse(r randapi.BasicRand, easy bool) *DeviceActivationResponse {
	c := randapi.NewContextual(r)
	this := newPopulatedDeviceActivationResponse(c, easy)
	return this
}
func NewPopulatedDeduplicatedUplinkMessage(r randapi.BasicRand, easy bool) *DeduplicatedUplinkMessage {
	c := randapi.NewContextual(r)
	this := newPopulatedDeduplicatedUplinkMessage(c, easy)
	this.AppEUI = c.AppEUI()
	this.AppID = c.ID()
	this.DevEUI = c.DevEUI()
	this.DevID = c.ID()
	this.ServerTime = c.NanoTime()
	return this
}
func NewPopulatedDeviceActivationRequest(r randapi.BasicRand, easy bool) *DeviceActivationRequest {
	c := randapi.NewContextual(r)
	this := newPopulatedDeviceActivationRequest(c, easy)
	this.AppEUI = c.AppEUI()
	this.DevEUI = c.DevEUI()
	return this
}
func NewPopulatedDeduplicatedDeviceActivationRequest(r randapi.BasicRand, easy bool) *DeduplicatedDeviceActivationRequest {
	c := randapi.NewContextual(r)
	this := newPopulatedDeduplicatedDeviceActivationRequest(c, easy)
	this.AppEUI = c.AppEUI()
	this.AppID = c.ID()
	this.DevEUI = c.DevEUI()
	this.DevID = c.ID()
	return this
}
func NewPopulatedActivationChallengeRequest(r randapi.BasicRand, easy bool) *ActivationChallengeRequest {
	c := randapi.NewContextual(r)
	this := newPopulatedActivationChallengeRequest(c, easy)
	this.AppEUI = c.AppEUI()
	this.AppID = c.ID()
	this.DevEUI = c.DevEUI()
	this.DevID = c.ID()
	return this
}
func NewPopulatedActivationChallengeResponse(r randapi.BasicRand, easy bool) *ActivationChallengeResponse {
	c := randapi.NewContextual(r)
	this := newPopulatedActivationChallengeResponse(c, easy)
	return this
}
func NewPopulatedSubscribeRequest(r randapi.BasicRand, easy bool) *SubscribeRequest {
	c := randapi.NewContextual(r)
	this := newPopulatedSubscribeRequest(c, easy)
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
func NewPopulatedApplicationHandlerRegistration(r randapi.BasicRand, easy bool) *ApplicationHandlerRegistration {
	c := randapi.NewContextual(r)
	this := newPopulatedApplicationHandlerRegistration(c, easy)
	this.AppID = c.ID()
	this.HandlerID = c.ID()
	return this
}
