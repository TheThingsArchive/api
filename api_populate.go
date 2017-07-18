// Copyright © 2017 The Things Network
// Use of this source code is governed by the MIT license that can be found in the LICENSE file.

package api

import "github.com/TheThingsNetwork/api/randapi"

func NewPopulatedPercentiles(r randapi.BasicRand, easy bool) *Percentiles {
	c := randapi.NewContextual(r)
	this := newPopulatedPercentiles(c, easy)
	return this
}

func NewPopulatedRates(r randapi.BasicRand, easy bool) *Rates {
	c := randapi.NewContextual(r)
	this := newPopulatedRates(c, easy)
	return this
}

func NewPopulatedSystemStats(r randapi.BasicRand, easy bool) *SystemStats {
	c := randapi.NewContextual(r)
	this := newPopulatedSystemStats(c, easy)
	return this
}

func NewPopulatedSystemStats_Loadstats(r randapi.BasicRand, easy bool) *SystemStats_Loadstats {
	c := randapi.NewContextual(r)
	this := newPopulatedSystemStats_Loadstats(c, easy)
	return this
}

func NewPopulatedSystemStats_CPUStats(r randapi.BasicRand, easy bool) *SystemStats_CPUStats {
	c := randapi.NewContextual(r)
	this := newPopulatedSystemStats_CPUStats(c, easy)
	return this
}

func NewPopulatedSystemStats_MemoryStats(r randapi.BasicRand, easy bool) *SystemStats_MemoryStats {
	c := randapi.NewContextual(r)
	this := newPopulatedSystemStats_MemoryStats(c, easy)
	return this
}

func NewPopulatedComponentStats(r randapi.BasicRand, easy bool) *ComponentStats {
	c := randapi.NewContextual(r)
	this := newPopulatedComponentStats(c, easy)
	return this
}

func NewPopulatedComponentStats_CPUStats(r randapi.BasicRand, easy bool) *ComponentStats_CPUStats {
	c := randapi.NewContextual(r)
	this := newPopulatedComponentStats_CPUStats(c, easy)
	return this
}

func NewPopulatedComponentStats_MemoryStats(r randapi.BasicRand, easy bool) *ComponentStats_MemoryStats {
	c := randapi.NewContextual(r)
	this := newPopulatedComponentStats_MemoryStats(c, easy)
	return this
}
