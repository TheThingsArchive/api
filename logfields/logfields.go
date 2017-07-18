// Copyright © 2017 The Things Network
// Use of this source code is governed by the MIT license that can be found in the LICENSE file.

// Package logfields helps extracting well-known fields from proto messages.
// It extracts fields such as IDs/EUIs, Addresses, as well as Gateway/LoRaWAN metadata.
package logfields

import (
	"github.com/TheThingsNetwork/api/broker"
	"github.com/TheThingsNetwork/api/gateway"
	"github.com/TheThingsNetwork/api/protocol"
	"github.com/TheThingsNetwork/api/protocol/lorawan"
	"github.com/TheThingsNetwork/go-utils/log"
	"github.com/TheThingsNetwork/ttn/core/types"
)

func fillBool(fields log.Fields, key string, value bool) {
	fields[key] = value
}

func fillInt(fields log.Fields, key string, value int64) {
	if value != 0 {
		fields[key] = value
	}
}

const delta = 0.0001

func fillFloat(fields log.Fields, key string, value float64) {
	if value > delta || value < -delta {
		fields[key] = value
	}
}

func fillString(fields log.Fields, key string, value string) {
	if value != "" {
		fields[key] = value
	}
}

type hasID interface {
	GetID() string
}

func fillID(fields log.Fields, m interface{}) {
	if m, ok := m.(hasID); ok {
		fillString(fields, "ID", m.GetID())
	}
}

type hasAppID interface {
	GetAppID() string
}

func fillAppID(fields log.Fields, m interface{}) {
	if m, ok := m.(hasAppID); ok {
		fillString(fields, "AppID", m.GetAppID())
	}
}

type hasDevID interface {
	GetDevID() string
}

func fillDevID(fields log.Fields, m interface{}) {
	if m, ok := m.(hasDevID); ok {
		fillString(fields, "DevID", m.GetDevID())
	}
}

type hasGatewayID interface {
	GetGatewayID() string
}

func fillGatewayID(fields log.Fields, m interface{}) {
	if m, ok := m.(hasGatewayID); ok {
		fillString(fields, "GatewayID", m.GetGatewayID())
	}
}

type hasAppEUI interface {
	GetAppEUI() types.AppEUI
}

func fillAppEUI(fields log.Fields, m interface{}) {
	if m, ok := m.(hasAppEUI); ok {
		if f := m.GetAppEUI(); !f.IsEmpty() {
			fields["AppEUI"] = f
		}
	}
}

type hasDevEUI interface {
	GetDevEUI() types.DevEUI
}

func fillDevEUI(fields log.Fields, m interface{}) {
	if m, ok := m.(hasDevEUI); ok {
		if f := m.GetDevEUI(); !f.IsEmpty() {
			fields["DevEUI"] = f
		}
	}
}

type hasServiceName interface {
	GetServiceName() string
}

func fillServiceName(fields log.Fields, m interface{}) {
	if m, ok := m.(hasServiceName); ok {
		fillString(fields, "ServiceName", m.GetServiceName())
	}
}

type hasActivationMetadata interface {
	GetActivationMetadata() *protocol.ActivationMetadata
}

func fillActivationMetadata(fields log.Fields, m interface{}) {
	if m, ok := m.(hasActivationMetadata); ok {
		if lorawan := m.GetActivationMetadata().GetLoRaWAN(); lorawan != nil {
			if f := lorawan.GetAppEUI(); !f.IsEmpty() {
				fields["AppEUI"] = f
			}
			if f := lorawan.GetDevEUI(); !f.IsEmpty() {
				fields["DevEUI"] = f
			}
			if f := lorawan.GetDevAddr(); !f.IsEmpty() {
				fields["DevAddr"] = f
			}
		}
	}
}

type hasGatewayMetadata interface {
	GetGatewayMetadata() *gateway.RxMetadata
}
type hasGatewayMetadatas interface {
	GetGatewayMetadata() []*gateway.RxMetadata
}

func fillGatewayMetadata(fields log.Fields, m interface{}) {
	if m, ok := m.(hasGatewayMetadata); ok {
		if m := m.GetGatewayMetadata(); m != nil {
			fillString(fields, "GatewayID", m.GetGatewayID())
			fillInt(fields, "Frequency", int64(m.GetFrequency()))
			fillFloat(fields, "RSSI", float64(m.GetRSSI()))
			fillFloat(fields, "SNR", float64(m.GetSNR()))
		}
	}
	if m, ok := m.(hasGatewayMetadatas); ok {
		fillInt(fields, "Gateways", int64(len(m.GetGatewayMetadata())))
	}
}

type hasMessage interface {
	GetMessage() *protocol.Message
}

func fillMessage(fields log.Fields, m interface{}) {
	if m, ok := m.(hasMessage); ok {
		if m := m.GetMessage().GetLoRaWAN(); m != nil {
			mType := m.GetMType()
			switch mType {
			case lorawan.MType_JOIN_REQUEST:
				m := m.GetJoinRequestPayload()
				if f := m.AppEUI; !f.IsEmpty() {
					fields["AppEUI"] = f
				}
				if f := m.DevEUI; !f.IsEmpty() {
					fields["DevEUI"] = f
				}
			case lorawan.MType_JOIN_ACCEPT:
			case lorawan.MType_CONFIRMED_UP, lorawan.MType_UNCONFIRMED_UP, lorawan.MType_CONFIRMED_DOWN, lorawan.MType_UNCONFIRMED_DOWN:
				if mType == lorawan.MType_CONFIRMED_UP || mType == lorawan.MType_CONFIRMED_DOWN {
					fillBool(fields, "Confirmed", true)
				} else {
					fillBool(fields, "Confirmed", false)
				}
				m := m.GetMACPayload()
				fillBool(fields, "Ack", m.Ack)
				fillBool(fields, "ADR", m.ADR)
				fillBool(fields, "ADRAckReq", m.ADRAckReq)
				if f := m.DevAddr; !f.IsEmpty() {
					fields["DevAddr"] = f
				}
				fillInt(fields, "FCnt", int64(m.FCnt))
				fillInt(fields, "FPort", int64(m.FPort))
				fillBool(fields, "FPending", m.FPending)
				fields["AppPayloadSize"] = len(m.FRMPayload)
			}
		}
	}
}

type hasProtocolMetadata interface {
	GetProtocolMetadata() *protocol.RxMetadata
}

func fillProtocolMetadata(fields log.Fields, m interface{}) {
	if m, ok := m.(hasProtocolMetadata); ok {
		if m := m.GetProtocolMetadata().GetLoRaWAN(); m != nil {
			fillString(fields, "CodingRate", m.CodingRate)
			fillString(fields, "DataRate", m.DataRate)
			fillInt(fields, "BitRate", int64(m.BitRate))
			fillInt(fields, "FCnt", int64(m.FCnt))
		}
	}
}

type hasDownlinkOption interface {
	GetDownlinkOption() *broker.DownlinkOption
}
type hasDownlinkOptions interface {
	GetDownlinkOptions() []*broker.DownlinkOption
}

func fillDownlinkOption(fields log.Fields, m interface{}) {
	if m, ok := m.(hasDownlinkOption); ok {
		if m := m.GetDownlinkOption(); m != nil {
			fillString(fields, "GatewayID", m.GetGatewayID())
			fillGatewayConfiguration(fields, m)
			fillProtocolConfiguration(fields, m)
		}
	}
	if m, ok := m.(hasDownlinkOptions); ok {
		fillInt(fields, "DownlinkOptions", int64(len(m.GetDownlinkOptions())))
	}
}

type hasGatewayConfiguration interface {
	GetGatewayConfiguration() *gateway.TxConfiguration
}

func fillGatewayConfiguration(fields log.Fields, m interface{}) {
	if m, ok := m.(hasGatewayConfiguration); ok {
		if m := m.GetGatewayConfiguration(); m != nil {
			fillInt(fields, "Frequency", int64(m.Frequency))
		}
	}
}

type hasProtocolConfiguration interface {
	GetProtocolConfiguration() *protocol.TxConfiguration
}

func fillProtocolConfiguration(fields log.Fields, m interface{}) {
	if m, ok := m.(hasProtocolConfiguration); ok {
		if m := m.GetProtocolConfiguration().GetLoRaWAN(); m != nil {
			fillString(fields, "CodingRate", m.CodingRate)
			fillString(fields, "DataRate", m.DataRate)
			fillInt(fields, "BitRate", int64(m.BitRate))
			fillInt(fields, "FCnt", int64(m.FCnt))
		}
	}
}

type hasPayload interface {
	GetPayload() []byte
}

func fillPayload(fields log.Fields, m interface{}) {
	if m, ok := m.(hasPayload); ok {
		fields["PayloadSize"] = len(m.GetPayload())
	}
}

type fillFunc func(fields log.Fields, m interface{})

var fillFuncs = []fillFunc{
	fillID,
	fillAppID,
	fillDevID,
	fillGatewayID,
	fillAppEUI,
	fillDevEUI,
	fillServiceName,
	fillActivationMetadata,
	fillGatewayMetadata,
	fillMessage,
	fillProtocolMetadata,
	fillDownlinkOption,
	fillGatewayConfiguration,
	fillProtocolConfiguration,
	fillPayload,
}

// ForMessage returns the log fields for the given message
func ForMessage(m interface{}) log.Fields {
	fields := make(log.Fields)
	for _, fill := range fillFuncs {
		fill(fields, m)
	}
	return fields
}
