// Copyright © 2017 The Things Network
// Use of this source code is governed by the MIT license that can be found in the LICENSE file.

package trace

import "github.com/TheThingsNetwork/api/validate"

func (m *Trace) Validate() error {
	return validate.FirstError("Invalid Trace",
		nil, // TODO
		ValidTrace(m.Parents...),
	)
}

func ValidTrace(m ...*Trace) error {
	errs := make([]error, len(m))
	for i, m := range m {
		errs[i] = m.Validate()
	}
	return validate.FirstError("", errs...)
}
