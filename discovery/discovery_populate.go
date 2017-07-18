// Copyright © 2017 The Things Network
// Use of this source code is governed by the MIT license that can be found in the LICENSE file.

package discovery

import "github.com/TheThingsNetwork/api/randapi"

func NewPopulatedMetadata(r randapi.BasicRand, easy bool) *Metadata {
	c := randapi.NewContextual(r)
	this := newPopulatedMetadata(c, easy)
	return this
}
func NewPopulatedMetadata_DevAddrPrefix(r randapi.BasicRand, easy bool) *Metadata_DevAddrPrefix {
	c := randapi.NewContextual(r)
	this := newPopulatedMetadata_DevAddrPrefix(c, easy)
	return this
}
func NewPopulatedMetadata_AppID(r randapi.BasicRand, easy bool) *Metadata_AppID {
	c := randapi.NewContextual(r)
	this := newPopulatedMetadata_AppID(c, easy)
	this.AppID = c.ID()
	return this
}
func NewPopulatedMetadata_AppEUI(r randapi.BasicRand, easy bool) *Metadata_AppEUI {
	c := randapi.NewContextual(r)
	this := newPopulatedMetadata_AppEUI(c, easy)
	this.AppEUI = c.AppEUI().Bytes()
	return this
}
func NewPopulatedAnnouncement(r randapi.BasicRand, easy bool) *Announcement {
	c := randapi.NewContextual(r)
	this := newPopulatedAnnouncement(c, easy)
	this.ID = c.ID()
	return this
}
func NewPopulatedGetServiceRequest(r randapi.BasicRand, easy bool) *GetServiceRequest {
	c := randapi.NewContextual(r)
	this := newPopulatedGetServiceRequest(c, easy)
	return this
}
func NewPopulatedGetRequest(r randapi.BasicRand, easy bool) *GetRequest {
	c := randapi.NewContextual(r)
	this := newPopulatedGetRequest(c, easy)
	this.ID = c.ID()
	return this
}
func NewPopulatedMetadataRequest(r randapi.BasicRand, easy bool) *MetadataRequest {
	c := randapi.NewContextual(r)
	this := newPopulatedMetadataRequest(c, easy)
	this.ID = c.ID()
	return this
}
func NewPopulatedAnnouncementsResponse(r randapi.BasicRand, easy bool) *AnnouncementsResponse {
	c := randapi.NewContextual(r)
	this := newPopulatedAnnouncementsResponse(c, easy)
	return this
}
func NewPopulatedGetByAppIDRequest(r randapi.BasicRand, easy bool) *GetByAppIDRequest {
	c := randapi.NewContextual(r)
	this := newPopulatedGetByAppIDRequest(c, easy)
	this.AppID = c.ID()
	return this
}
func NewPopulatedGetByAppEUIRequest(r randapi.BasicRand, easy bool) *GetByAppEUIRequest {
	c := randapi.NewContextual(r)
	this := newPopulatedGetByAppEUIRequest(c, easy)
	this.AppEUI = c.AppEUI()
	return this
}
