// Copyright © 2017 The Things Network
// Use of this source code is governed by the MIT license that can be found in the LICENSE file.

package lorawan

import "github.com/TheThingsNetwork/api/randapi"

func NewPopulatedMetadata(r randapi.BasicRand, easy bool) *Metadata {
	c := randapi.NewContextual(r)
	this := newPopulatedMetadata(c, easy)
	if this.Modulation == Modulation_LORA {
		this.CodingRate = c.CodingRate()
		this.DataRate = c.DataRate()
	} else {
		this.BitRate = c.BitRate()
	}
	return this
}
func NewPopulatedTxConfiguration(r randapi.BasicRand, easy bool) *TxConfiguration {
	c := randapi.NewContextual(r)
	this := newPopulatedTxConfiguration(c, easy)
	if this.Modulation == Modulation_LORA {
		this.CodingRate = c.CodingRate()
		this.DataRate = c.DataRate()
	} else {
		this.BitRate = c.BitRate()
	}
	return this
}
func NewPopulatedActivationMetadata(r randapi.BasicRand, easy bool) *ActivationMetadata {
	c := randapi.NewContextual(r)
	this := newPopulatedActivationMetadata(c, easy)
	this.AppEUI = c.AppEUI()
	this.DevAddr = c.DevAddr()
	this.DevEUI = c.DevEUI()
	this.NwkSKey = c.NwkSKey()
	return this
}
func NewPopulatedMessage(r randapi.BasicRand, easy bool) *Message {
	c := randapi.NewContextual(r)
	this := newPopulatedMessage(c, easy)
	return this
}
func NewPopulatedMessage_MACPayload(r randapi.BasicRand, easy bool) *Message_MACPayload {
	c := randapi.NewContextual(r)
	this := newPopulatedMessage_MACPayload(c, easy)
	return this
}
func NewPopulatedMessage_JoinRequestPayload(r randapi.BasicRand, easy bool) *Message_JoinRequestPayload {
	c := randapi.NewContextual(r)
	this := newPopulatedMessage_JoinRequestPayload(c, easy)
	return this
}
func NewPopulatedMessage_JoinAcceptPayload(r randapi.BasicRand, easy bool) *Message_JoinAcceptPayload {
	c := randapi.NewContextual(r)
	this := newPopulatedMessage_JoinAcceptPayload(c, easy)
	return this
}
func NewPopulatedMHDR(r randapi.BasicRand, easy bool) *MHDR {
	c := randapi.NewContextual(r)
	this := newPopulatedMHDR(c, easy)
	return this
}
func NewPopulatedMACPayload(r randapi.BasicRand, easy bool) *MACPayload {
	c := randapi.NewContextual(r)
	this := newPopulatedMACPayload(c, easy)
	return this
}
func NewPopulatedFHDR(r randapi.BasicRand, easy bool) *FHDR {
	c := randapi.NewContextual(r)
	this := newPopulatedFHDR(c, easy)
	return this
}
func NewPopulatedFCtrl(r randapi.BasicRand, easy bool) *FCtrl {
	c := randapi.NewContextual(r)
	this := newPopulatedFCtrl(c, easy)
	return this
}
func NewPopulatedMACCommand(r randapi.BasicRand, easy bool) *MACCommand {
	c := randapi.NewContextual(r)
	this := newPopulatedMACCommand(c, easy)
	return this
}
func NewPopulatedJoinRequestPayload(r randapi.BasicRand, easy bool) *JoinRequestPayload {
	c := randapi.NewContextual(r)
	this := newPopulatedJoinRequestPayload(c, easy)
	this.AppEUI = *(c.AppEUI())
	this.DevEUI = *(c.DevEUI())
	return this
}
func NewPopulatedJoinAcceptPayload(r randapi.BasicRand, easy bool) *JoinAcceptPayload {
	c := randapi.NewContextual(r)
	this := newPopulatedJoinAcceptPayload(c, easy)
	this.DevAddr = *(c.DevAddr())
	return this
}
func NewPopulatedDLSettings(r randapi.BasicRand, easy bool) *DLSettings {
	c := randapi.NewContextual(r)
	this := newPopulatedDLSettings(c, easy)
	return this
}
func NewPopulatedCFList(r randapi.BasicRand, easy bool) *CFList {
	c := randapi.NewContextual(r)
	this := new(CFList)
	if r.Intn(10) != 0 {
		this.Freq = make([]uint32, 5)
		for i, freq := range c.CFList() {
			this.Freq[i] = uint32(freq)
		}
	}
	return this
}
