// Copyright © 2017 The Things Network
// Use of this source code is governed by the MIT license that can be found in the LICENSE file.

package lorawan

import "github.com/TheThingsNetwork/api/randapi"

func NewPopulatedPrefixesRequest(r randapi.BasicRand, easy bool) *PrefixesRequest {
	c := randapi.NewContextual(r)
	this := newPopulatedPrefixesRequest(c, easy)
	return this
}
func NewPopulatedPrefixesResponse(r randapi.BasicRand, easy bool) *PrefixesResponse {
	c := randapi.NewContextual(r)
	this := newPopulatedPrefixesResponse(c, easy)
	return this
}
func NewPopulatedPrefixesResponse_PrefixMapping(r randapi.BasicRand, easy bool) *PrefixesResponse_PrefixMapping {
	c := randapi.NewContextual(r)
	this := newPopulatedPrefixesResponse_PrefixMapping(c, easy)
	return this
}
func NewPopulatedDevAddrRequest(r randapi.BasicRand, easy bool) *DevAddrRequest {
	c := randapi.NewContextual(r)
	this := newPopulatedDevAddrRequest(c, easy)
	return this
}
func NewPopulatedDevAddrResponse(r randapi.BasicRand, easy bool) *DevAddrResponse {
	c := randapi.NewContextual(r)
	this := newPopulatedDevAddrResponse(c, easy)
	this.DevAddr = c.DevAddr()
	return this
}
