// Copyright © 2017 The Things Network
// Use of this source code is governed by the MIT license that can be found in the LICENSE file.

package protocol

import "github.com/TheThingsNetwork/api/randapi"

func NewPopulatedMessage(r randapi.BasicRand, easy bool) *Message {
	c := randapi.NewContextual(r)
	this := newPopulatedMessage(c, easy)
	return this
}
func NewPopulatedMessage_LoRaWAN(r randapi.BasicRand, easy bool) *Message_LoRaWAN {
	c := randapi.NewContextual(r)
	this := newPopulatedMessage_LoRaWAN(c, easy)
	return this
}
func NewPopulatedRxMetadata(r randapi.BasicRand, easy bool) *RxMetadata {
	c := randapi.NewContextual(r)
	this := newPopulatedRxMetadata(c, easy)
	return this
}
func NewPopulatedRxMetadata_LoRaWAN(r randapi.BasicRand, easy bool) *RxMetadata_LoRaWAN {
	c := randapi.NewContextual(r)
	this := newPopulatedRxMetadata_LoRaWAN(c, easy)
	return this
}
func NewPopulatedTxConfiguration(r randapi.BasicRand, easy bool) *TxConfiguration {
	c := randapi.NewContextual(r)
	this := newPopulatedTxConfiguration(c, easy)
	return this
}
func NewPopulatedTxConfiguration_LoRaWAN(r randapi.BasicRand, easy bool) *TxConfiguration_LoRaWAN {
	c := randapi.NewContextual(r)
	this := newPopulatedTxConfiguration_LoRaWAN(c, easy)
	return this
}
func NewPopulatedActivationMetadata(r randapi.BasicRand, easy bool) *ActivationMetadata {
	c := randapi.NewContextual(r)
	this := newPopulatedActivationMetadata(c, easy)
	return this
}
func NewPopulatedActivationMetadata_LoRaWAN(r randapi.BasicRand, easy bool) *ActivationMetadata_LoRaWAN {
	c := randapi.NewContextual(r)
	this := newPopulatedActivationMetadata_LoRaWAN(c, easy)
	return this
}
