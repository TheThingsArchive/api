// Copyright © 2017 The Things Network
// Use of this source code is governed by the MIT license that can be found in the LICENSE file.

package discovery

import (
	"fmt"

	"github.com/TheThingsNetwork/api/validate"
)

func (m *Metadata) Validate() error {
	return validate.FirstError("Invalid Metadata",
		nil, // TODO
	)
}

func validateServiceName(name string) error {
	switch name {
	case "router", "broker", "handler":
	default:
		return fmt.Errorf("expected [router broker handler] but was \"%s\"", name)
	}
	return nil
}

func (m *Announcement) Validate() error {
	return validate.FirstError("Invalid Announcement",
		validate.Wrap("Invalid ID", validate.ID(m.GetID(), false)),
		validate.Wrap("Invalid ServiceName", validateServiceName(m.GetServiceName())),
		nil, // TODO: rest
	)
}

func (m *GetServiceRequest) Validate() error {
	return validate.FirstError("Invalid GetServiceRequest",
		validate.Wrap("Invalid ServiceName", validateServiceName(m.GetServiceName())),
	)
}

func (m *GetRequest) Validate() error {
	return validate.FirstError("Invalid GetRequest",
		validate.Wrap("Invalid ID", validate.ID(m.GetID(), false)),
		validate.Wrap("Invalid ServiceName", validateServiceName(m.GetServiceName())),
	)
}

func (m *MetadataRequest) Validate() error {
	return validate.FirstError("Invalid MetadataRequest",
		validate.Wrap("Invalid ID", validate.ID(m.GetID(), false)),
		validate.Wrap("Invalid ServiceName", validateServiceName(m.GetServiceName())),
		m.GetMetadata().Validate(),
	)
}

func (m *AnnouncementsResponse) Validate() error {
	return nil
}

func (m *GetByAppIDRequest) Validate() error {
	return validate.FirstError("Invalid GetByAppIDRequest",
		validate.Wrap("Invalid AppID", validate.ID(m.GetAppID(), false)),
	)
}

func (m *GetByAppEUIRequest) Validate() error {
	return validate.FirstError("Invalid GetByAppEUIRequest",
		validate.Wrap("Invalid AppEUI", validate.AppEUI(m.GetAppEUI(), false)),
	)
}
