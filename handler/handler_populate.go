// Copyright © 2017 The Things Network
// Use of this source code is governed by the MIT license that can be found in the LICENSE file.

package handler

import "github.com/TheThingsNetwork/api/randapi"

func NewPopulatedDeviceActivationResponse(r randapi.BasicRand, easy bool) *DeviceActivationResponse {
	c := randapi.NewContextual(r)
	this := newPopulatedDeviceActivationResponse(c, easy)
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
func NewPopulatedApplicationIdentifier(r randapi.BasicRand, easy bool) *ApplicationIdentifier {
	c := randapi.NewContextual(r)
	this := newPopulatedApplicationIdentifier(c, easy)
	return this
}
func NewPopulatedApplication(r randapi.BasicRand, easy bool) *Application {
	c := randapi.NewContextual(r)
	this := newPopulatedApplication(c, easy)
	this.AppID = c.ID()
	return this
}
func NewPopulatedDeviceIdentifier(r randapi.BasicRand, easy bool) *DeviceIdentifier {
	c := randapi.NewContextual(r)
	this := newPopulatedDeviceIdentifier(c, easy)
	this.AppID = c.ID()
	this.DevID = c.ID()
	return this
}
func NewPopulatedDevice(r randapi.BasicRand, easy bool) *Device {
	c := randapi.NewContextual(r)
	this := newPopulatedDevice(c, easy)
	this.AppID = c.ID()
	this.DevID = c.ID()
	return this
}
func NewPopulatedDevice_LoRaWANDevice(r randapi.BasicRand, easy bool) *Device_LoRaWANDevice {
	c := randapi.NewContextual(r)
	this := newPopulatedDevice_LoRaWANDevice(c, easy)
	return this
}
func NewPopulatedDeviceList(r randapi.BasicRand, easy bool) *DeviceList {
	c := randapi.NewContextual(r)
	this := newPopulatedDeviceList(c, easy)
	return this
}
func NewPopulatedDryDownlinkMessage(r randapi.BasicRand, easy bool) *DryDownlinkMessage {
	c := randapi.NewContextual(r)
	this := newPopulatedDryDownlinkMessage(c, easy)
	return this
}
func NewPopulatedDryUplinkMessage(r randapi.BasicRand, easy bool) *DryUplinkMessage {
	c := randapi.NewContextual(r)
	this := newPopulatedDryUplinkMessage(c, easy)
	return this
}
func NewPopulatedSimulatedUplinkMessage(r randapi.BasicRand, easy bool) *SimulatedUplinkMessage {
	c := randapi.NewContextual(r)
	this := newPopulatedSimulatedUplinkMessage(c, easy)
	this.AppID = c.ID()
	this.DevID = c.ID()
	return this
}
func NewPopulatedLogEntry(r randapi.BasicRand, easy bool) *LogEntry {
	c := randapi.NewContextual(r)
	this := newPopulatedLogEntry(c, easy)
	return this
}
func NewPopulatedDryUplinkResult(r randapi.BasicRand, easy bool) *DryUplinkResult {
	c := randapi.NewContextual(r)
	this := newPopulatedDryUplinkResult(c, easy)
	return this
}
func NewPopulatedDryDownlinkResult(r randapi.BasicRand, easy bool) *DryDownlinkResult {
	c := randapi.NewContextual(r)
	this := newPopulatedDryDownlinkResult(c, easy)
	return this
}
