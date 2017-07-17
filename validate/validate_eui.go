// Copyright © 2017 The Things Network
// Use of this source code is governed by the MIT license that can be found in the LICENSE file.

package validate

import (
	"errors"

	"github.com/TheThingsNetwork/ttn/core/types"
)

// AppEUI Validation errors
var (
	ErrEmptyAppEUI = errors.New("Empty AppEUI")
)

// AppEUI validation
func AppEUI(eui types.AppEUI, allowEmpty bool) error {
	if eui.IsEmpty() {
		if allowEmpty {
			return nil
		}
		return ErrEmptyAppEUI
	}
	return nil
}

// DevEUI Validation errors
var (
	ErrEmptyDevEUI = errors.New("Empty DevEUI")
)

// DevEUI validation
func DevEUI(eui types.DevEUI, allowEmpty bool) error {
	if eui.IsEmpty() {
		if allowEmpty {
			return nil
		}
		return ErrEmptyDevEUI
	}
	return nil
}
