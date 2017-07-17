// Copyright © 2017 The Things Network
// Use of this source code is governed by the MIT license that can be found in the LICENSE file.

package validate

import (
	"errors"
	"regexp"
)

const (
	idExplanation = "IDs can contain lowercase letters, numbers, dashes and underscores and should have a maximum length of 36"
)

var idRegexp = regexp.MustCompile("^[0-9a-z](?:[_-]?[0-9a-z]){1,35}$")

// ValidID returns true if the given ID is a valid application or device ID
func ValidID(id string) bool {
	return idRegexp.MatchString(id)
}

// ID Validation errors
var (
	ErrEmptyID   = errors.New("Empty ID")
	ErrInvalidID = errors.New("Invalid ID: " + idExplanation)
)

// ID validation
func ID(id string, allowEmpty bool) error {
	if id == "" {
		if allowEmpty {
			return nil
		}
		return ErrEmptyID
	}
	if !ValidID(id) {
		return ErrInvalidID
	}
	return nil
}
