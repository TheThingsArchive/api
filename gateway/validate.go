package gateway

import (
	"github.com/TheThingsNetwork/api/validate"
	"github.com/TheThingsNetwork/ttn/utils/errors"
)

// Location metadata errors
var (
	ErrInvalidLatitude  = errors.New("Invalid LocationMetadata: Invalid latitude")
	ErrInvalidLongitude = errors.New("Invalid LocationMetadata: Invalid longitude")
	ErrLocationZero     = errors.New("Invalid LocationMetadata: Location is zero, should be nil")
)

// Validate implements the api.Validator interface
func (m *LocationMetadata) Validate() error {
	if m == nil {
		return nil
	}
	if m.IsZero() {
		return ErrLocationZero
	}
	if m.GetLatitude() >= 90-delta || m.GetLatitude() <= -90+delta {
		return ErrInvalidLatitude
	}
	if m.GetLongitude() > 180 || m.GetLongitude() < -180 {
		return ErrInvalidLongitude
	}
	return nil
}

const delta = 0.01

// IsZero returns whether the location is close enough to zero
func (m *LocationMetadata) IsZero() bool {
	return (m.GetLatitude() > -delta && m.GetLatitude() < delta) && (m.GetLongitude() > -delta && m.GetLongitude() < delta)
}

func (m *RxMetadata) Validate() error {
	return validate.FirstError("Invalid RxMetadata",
		validate.Wrap("Invalid GatewayID", validate.ID(m.GetGatewayID(), false)),
		m.GetLocation().Validate(),
		nil, // TODO: Frequency
		nil, // TODO: Time
	)
}

func ValidateRxMetadata(m ...*RxMetadata) error {
	errs := make([]error, len(m))
	for i, m := range m {
		errs[i] = m.Validate()
	}
	return validate.FirstError("", errs...)
}

func (m *TxConfiguration) Validate() error {
	return validate.FirstError("Invalid TxConfiguration",
		nil, // TODO: Frequency
	)
}

func (m *Status) Validate() error {
	return validate.FirstError("Invalid Status",
		nil, // TODO
	)
}
