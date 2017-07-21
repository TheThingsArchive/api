// Copyright © 2017 The Things Network
// Use of this source code is governed by the MIT license that can be found in the LICENSE file.

package protocol

import "github.com/TheThingsNetwork/api/protocol/lorawan"

// RandomTxConfiguration returns randomly generated TxConfiguration.
// Used for testing.
func RandomTxConfiguration() *TxConfiguration {
	return RandomLoRaWANTxConfiguration()
}

// RandomRxMetadata returns randomly generated RxMetadata.
// Used for testing.
func RandomRxMetadata() *RxMetadata {
	return RandomLoRaWANRxMetadata()
}

// RandomLoRaWANRxMetadata returns randomly generated LoRaWANRxMetadata.
// Used for testing.
func RandomLoRaWANRxMetadata(modulation ...lorawan.Modulation) *RxMetadata {
	return &RxMetadata{
		Protocol: &RxMetadata_LoRaWAN{
			LoRaWAN: lorawan.RandomMetadata(modulation...),
		},
	}
}

// RandomLoRaWANTxConfiguration returns randomly generated LoRaWANTxConfiguration.
// Used for testing.
func RandomLoRaWANTxConfiguration(modulation ...lorawan.Modulation) *TxConfiguration {
	return &TxConfiguration{
		Protocol: &TxConfiguration_LoRaWAN{
			LoRaWAN: lorawan.RandomTxConfiguration(modulation...),
		},
	}
}
