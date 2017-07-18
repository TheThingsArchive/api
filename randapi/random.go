package randapi

import (
	"io"
	"time"

	"github.com/TheThingsNetwork/ttn/core/types"
)

// BasicRand is the basic random interface
type BasicRand interface {
	Float32() float32
	Float64() float64
	Int63() int64
	Int31() int32
	Uint32() uint32
	Intn(n int) int
}

// NewContextual returns a *ContextualRand around the given BasicRand
// If the input already is a *ContextualRand, that one is returned
// If the input additionally implements io.Reader, that Reader is used
func NewContextual(basic BasicRand) *ContextualRand {
	if r, ok := basic.(*ContextualRand); ok {
		return r
	}
	r := &ContextualRand{BasicRand: basic}
	if reader, ok := basic.(io.Reader); ok {
		r.read = reader.Read
	} else {
		r.read = func(p []byte) (n int, err error) {
			n = len(p)
			for i := 0; i < n; i++ {
				p[i] = byte(r.Intn(255))
			}
			return n, nil
		}
	}
	return r
}

// ContextualRand extends BasicRand to support values in TTN's context
type ContextualRand struct {
	BasicRand
	read func(p []byte) (n int, err error)
}

func (r *ContextualRand) Read(p []byte) (n int, err error) {
	return r.read(p)
}

const validIDChars = "abcdefghijklmnopqrstuvwxyz1234567890"

func (r *ContextualRand) randomChar(alphabet string) byte { return alphabet[r.Intn(len(alphabet))] }

func (r *ContextualRand) randomChars(alphabet string, chars int) []byte {
	o := make([]byte, chars)
	for n := 0; n < chars; n++ {
		o[n] = r.randomChar(alphabet)
	}
	return o
}

func (r *ContextualRand) id(length int) string {
	o := r.randomChars(validIDChars, length)
	for n := 0; n < length/8; n++ { // max 1 out of 8 will be a dash/underscore
		l := 1 + r.Intn(length-2)
		if o[l-1] != '_' && o[l-1] != '-' && o[l+1] != '_' && o[l+1] != '-' {
			o[l] = r.randomChar("-_")
		}
	}
	return string(o)
}

// ID returns randomly generated ID
func (r *ContextualRand) ID() string {
	return r.id(2 + r.Intn(35))
}

func (r *ContextualRand) eui() (eui [8]byte) {
	r.Read(eui[:])
	return
}

// AppEUI returns a randomly generated AppEUI
func (r *ContextualRand) AppEUI() *types.AppEUI {
	eui := types.AppEUI(r.eui())
	return &eui
}

// DevEUI returns a randomly generated DevEUI
func (r *ContextualRand) DevEUI() *types.DevEUI {
	eui := types.DevEUI(r.eui())
	return &eui
}

func (r *ContextualRand) key() (key [16]byte) {
	r.Read(key[:])
	return
}

// AppKey returns a randomly generated AppKey
func (r *ContextualRand) AppKey() *types.AppKey {
	eui := types.AppKey(r.key())
	return &eui
}

// AppSKey returns a randomly generated AppSKey
func (r *ContextualRand) AppSKey() *types.AppSKey {
	eui := types.AppSKey(r.key())
	return &eui
}

// NwkSKey returns a randomly generated NwkSKey
func (r *ContextualRand) NwkSKey() *types.NwkSKey {
	eui := types.NwkSKey(r.key())
	return &eui
}

// DevAddr returns a randomly generated DevAddr
func (r *ContextualRand) DevAddr() *types.DevAddr {
	var addr types.DevAddr
	r.Read(addr[:])
	return &addr
}

var (
	ttnBirthday = time.Date(2016, 8, 21, 0, 0, 0, 0, time.UTC)
	ttnAge      = time.Since(ttnBirthday)
)

// NanoTime returns a UnixNano timestamp between TTN's birthday and now
func (r *ContextualRand) NanoTime() int64 {
	return ttnBirthday.Add(time.Duration(r.Intn(int(ttnAge)))).UnixNano()
}

var dataRates = []string{
	"SF12BW125", "SF11BW125", "SF10BW125", "SF9BW125", "SF8BW125", "SF7BW125",
	"SF7BW250", "SF12BW500", "SF11BW500", "SF10BW500", "SF9BW500", "SF8BW500",
	"SF7BW500",
}

// DataRate returns a randomly generated DataRate
func (r *ContextualRand) DataRate() string {
	return dataRates[r.Intn(len(dataRates))]
}

var codingRates = []string{"4/5", "4/6", "4/7", "4/8"}

// CodingRate returns a randomly generated CodingRate
func (r *ContextualRand) CodingRate() string {
	return codingRates[r.Intn(len(codingRates))]
}

// BitRate returns a randomly generated BitRate
func (r *ContextualRand) BitRate() uint32 {
	return 50000
}

var frequencies = []uint64{
	867100000, 867300000, 867500000, 867700000, 867900000, 868100000, 868300000,
	868500000, 868800000, 903900000, 904100000, 904300000, 904500000, 904600000,
	904700000, 904900000, 905100000, 905300000, 921800000, 922000000, 922100000,
	922200000, 922300000, 922400000, 922500000, 922600000, 922700000, 922800000,
	922900000, 923000000, 923100000, 923200000, 923300000, 923400000, 923600000,
	923800000, 924000000, 924200000, 924400000, 924500000, 924600000, 924800000,
}

// Frequency returns a random Frequency from TTN's frequency plans
func (r *ContextualRand) Frequency() uint64 {
	return frequencies[r.Intn(len(frequencies))]
}

// CFList returns a random CFList with frequencies from TTN's frequency plans
func (r *ContextualRand) CFList() (freq [5]uint64) {
	for i := 0; i < 5; i++ {
		freq[i] = frequencies[r.Intn(len(frequencies))]
	}
	return
}
