// Copyright © 2017 The Things Network
// Use of this source code is governed by the MIT license that can be found in the LICENSE file.

package broker

import (
	"testing"

	"github.com/TheThingsNetwork/api"
	s "github.com/smartystreets/assertions"
)

type PayloadUnmarshaller interface {
	UnmarshalPayload() error
}

func TestRandomizers(t *testing.T) {
	for name, msg := range map[string]interface{}{
		"RandomLoRaWANConfirmedDeduplicatedUplink()":   RandomLoRaWANConfirmedDeduplicatedUplink(),
		"RandomLoRaWANUnconfirmedDeduplicatedUplink()": RandomLoRaWANUnconfirmedDeduplicatedUplink(),
		"RandomLoRaWANDeduplicatedJoinRequest()":       RandomLoRaWANDeduplicatedJoinRequest(),
		"RandomLoRaWANDeduplicatedUplinkMessage()":     RandomLoRaWANDeduplicatedUplinkMessage(),
		"RandomDeduplicatedUplinkMessage()":            RandomDeduplicatedUplinkMessage(),

		"RandomLoRaWANConfirmedDownlink()":   RandomLoRaWANConfirmedDownlink(),
		"RandomLoRaWANUnconfirmedDownlink()": RandomLoRaWANUnconfirmedDownlink(),
		"RandomLoRaWANJoinAccept()":          RandomLoRaWANJoinAccept(),
		"RandomLoRaWANDownlinkMessage()":     RandomLoRaWANDownlinkMessage(),
		"RandomDownlinkMessage()":            RandomDownlinkMessage(),
	} {
		t.Run(name, func(t *testing.T) {
			if v, ok := msg.(api.Validator); ok {
				t.Run("Validate", func(t *testing.T) {
					a := s.New(t)
					a.So(v.Validate(), s.ShouldBeNil)
				})
			}
			if v, ok := msg.(PayloadUnmarshaller); ok {
				t.Run("UnmarshalPayload", func(t *testing.T) {
					a := s.New(t)
					a.So(v.UnmarshalPayload(), s.ShouldBeNil)
				})
			}
		})
	}
}
