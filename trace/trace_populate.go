// Copyright © 2017 The Things Network
// Use of this source code is governed by the MIT license that can be found in the LICENSE file.

package trace

import "github.com/TheThingsNetwork/api/randapi"

func NewPopulatedTrace(r randapi.BasicRand, easy bool) *Trace {
	c := randapi.NewContextual(r)
	this := newPopulatedTrace(c, easy)
	this.ID = c.ID()
	this.ServiceID = c.ID()
	this.Time = c.NanoTime()
	return this
}
