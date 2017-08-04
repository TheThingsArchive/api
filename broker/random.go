// Copyright © 2017 The Things Network
// Use of this source code is governed by the MIT license that can be found in the LICENSE file.

package broker

import (
	"math/rand"
	"time"

	"github.com/TheThingsNetwork/api/gateway"
	"github.com/TheThingsNetwork/api/protocol"
	"github.com/TheThingsNetwork/api/protocol/lorawan"
	"github.com/TheThingsNetwork/ttn/utils/random"
)

func randomDeduplicatedUplinkMessage() *DeduplicatedUplinkMessage {
	appEUI := random.AppEUI()
	devEUI := random.DevEUI()
	md := make([]*gateway.RxMetadata, random.Intn(10))
	for i := range md {
		md[i] = gateway.RandomRxMetadata()
	}
	return &DeduplicatedUplinkMessage{
		AppEUI:          &appEUI,
		DevEUI:          &devEUI,
		AppID:           random.AppID(),
		DevID:           random.DevID(),
		GatewayMetadata: md,
	}
}

// RandomLoRaWANDeduplicatedJoinRequest returns randomly generated lorawan join request.
// Used for testing.
func RandomLoRaWANDeduplicatedJoinRequest(modulation ...lorawan.Modulation) *DeduplicatedUplinkMessage {
	msg := randomDeduplicatedUplinkMessage()
	msg.ProtocolMetadata = *protocol.RandomLoRaWANRxMetadata(modulation...)
	msg.Payload = lorawan.RandomPayload(lorawan.MType_JOIN_REQUEST)
	return msg
}

// RandomLoRaWANConfirmedDeduplicatedUplink returns randomly generated confirmed lorawan uplink message.
// Used for testing.
func RandomLoRaWANConfirmedDeduplicatedUplink(modulation ...lorawan.Modulation) *DeduplicatedUplinkMessage {
	msg := randomDeduplicatedUplinkMessage()
	msg.ProtocolMetadata = *protocol.RandomLoRaWANRxMetadata(modulation...)
	msg.Payload = lorawan.RandomPayload(lorawan.MType_CONFIRMED_UP)
	return msg
}

// RandomLoRaWANUnconfirmedDeduplicatedUplink returns randomly generated unconfirmed lorawan uplink message.
// Used for testing.
func RandomLoRaWANUnconfirmedDeduplicatedUplink(modulation ...lorawan.Modulation) *DeduplicatedUplinkMessage {
	msg := randomDeduplicatedUplinkMessage()
	msg.ProtocolMetadata = *protocol.RandomLoRaWANRxMetadata(modulation...)
	msg.Payload = lorawan.RandomPayload(lorawan.MType_UNCONFIRMED_UP)
	return msg
}

// RandomLoRaWANDeduplicatedUplinkMessage returns randomly generated lorawan uplink message(join request, confirmed or unconfirmed uplink).
// Used for testing.
func RandomLoRaWANDeduplicatedUplinkMessage(modulation ...lorawan.Modulation) *DeduplicatedUplinkMessage {
	switch rand.Intn(3) {
	case 0:
		return RandomLoRaWANDeduplicatedJoinRequest(modulation...)
	case 1:
		return RandomLoRaWANConfirmedDeduplicatedUplink(modulation...)
	default:
		return RandomLoRaWANUnconfirmedDeduplicatedUplink(modulation...)
	}
}

func randomDownlinkMessage() *DownlinkMessage {
	return &DownlinkMessage{
		AppEUI: random.AppEUI(),
		DevEUI: random.DevEUI(),
		AppID:  random.AppID(),
		DevID:  random.DevID(),
		DownlinkOption: &DownlinkOption{
			GatewayConfiguration:  *gateway.RandomTxConfiguration(),
			ProtocolConfiguration: *protocol.RandomTxConfiguration(),
			Score:      uint32(random.Intn(100)),
			Deadline:   int64(time.Now().Nanosecond() + random.Intn(10000)),
			GatewayID:  random.ID(),
			Identifier: random.ID(),
		},
	}
}

// RandomLoRaWANJoinAccept returns randomly generated lorawan join request.
// Used for testing.
func RandomLoRaWANJoinAccept() *DownlinkMessage {
	msg := randomDownlinkMessage()
	msg.Payload = lorawan.RandomPayload(lorawan.MType_JOIN_ACCEPT)
	return msg
}

// RandomLoRaWANConfirmedDownlink returns randomly generated confirmed lorawan uplink message.
// Used for testing.
func RandomLoRaWANConfirmedDownlink() *DownlinkMessage {
	msg := randomDownlinkMessage()
	msg.Payload = lorawan.RandomPayload(lorawan.MType_CONFIRMED_DOWN)
	return msg
}

// RandomLoRaWANUnconfirmedDownlink returns randomly generated unconfirmed lorawan uplink message.
// Used for testing.
func RandomLoRaWANUnconfirmedDownlink() *DownlinkMessage {
	msg := randomDownlinkMessage()
	msg.Payload = lorawan.RandomPayload(lorawan.MType_UNCONFIRMED_DOWN)
	return msg
}

// RandomLoRaWANDownlinkMessage returns randomly generated lorawan downlink message(join request, confirmed or unconfirmed downlink).
// Used for testing.
func RandomLoRaWANDownlinkMessage() *DownlinkMessage {
	switch rand.Intn(3) {
	case 0:
		return RandomLoRaWANJoinAccept()
	case 1:
		return RandomLoRaWANConfirmedDownlink()
	default:
		return RandomLoRaWANUnconfirmedDownlink()
	}
}

// RandomDeduplicatedUplinkMessage returns randomly generated uplink message.
// Used for testing.
func RandomDeduplicatedUplinkMessage() *DeduplicatedUplinkMessage {
	return RandomLoRaWANDeduplicatedUplinkMessage()
}

// RandomDownlinkMessage returns randomly generated downlink message.
// Used for testing.
func RandomDownlinkMessage() *DownlinkMessage {
	return RandomLoRaWANDownlinkMessage()
}
