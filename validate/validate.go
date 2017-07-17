// Copyright © 2017 The Things Network
// Use of this source code is governed by the MIT license that can be found in the LICENSE file.

package validate

import "fmt"

// Wrap an existing error
// TODO: use new go-utils/errors package
func Wrap(msg string, err error) error {
	if err == nil {
		return nil
	}
	return fmt.Errorf(msg + ":" + err.Error())
}

// FirstError returns the first error in a list
func FirstError(wrap string, errs ...error) error {
	for _, err := range errs {
		if err != nil {
			if wrap == "" {
				return err
			}
			return Wrap(wrap, err)
		}
	}
	return nil
}
