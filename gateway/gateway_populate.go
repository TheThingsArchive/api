// Copyright © 2017 The Things Network
// Use of this source code is governed by the MIT license that can be found in the LICENSE file.

package gateway

import "github.com/TheThingsNetwork/api/randapi"

func NewPopulatedLocationMetadata(r randapi.BasicRand, easy bool) *LocationMetadata {
	c := randapi.NewContextual(r)
	this := newPopulatedLocationMetadata(c, easy)
	return this
}
func NewPopulatedRxMetadata(r randapi.BasicRand, easy bool) *RxMetadata {
	c := randapi.NewContextual(r)
	this := newPopulatedRxMetadata(c, easy)
	this.Frequency = c.Frequency()
	this.GatewayID = c.ID()
	this.Time = c.NanoTime()
	return this
}
func NewPopulatedRxMetadata_Antenna(r randapi.BasicRand, easy bool) *RxMetadata_Antenna {
	c := randapi.NewContextual(r)
	this := newPopulatedRxMetadata_Antenna(c, easy)
	return this
}
func NewPopulatedTxConfiguration(r randapi.BasicRand, easy bool) *TxConfiguration {
	c := randapi.NewContextual(r)
	this := newPopulatedTxConfiguration(c, easy)
	this.Frequency = c.Frequency()
	return this
}
func NewPopulatedStatus(r randapi.BasicRand, easy bool) *Status {
	c := randapi.NewContextual(r)
	this := newPopulatedStatus(c, easy)
	this.BootTime = c.NanoTime()
	this.Time = c.NanoTime()
	return this
}
func NewPopulatedStatus_OSMetrics(r randapi.BasicRand, easy bool) *Status_OSMetrics {
	c := randapi.NewContextual(r)
	this := newPopulatedStatus_OSMetrics(c, easy)
	return this
}
