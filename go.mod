module github.com/TheThingsNetwork/api

go 1.11

replace github.com/brocaar/lorawan => github.com/ThethingsIndustries/legacy-lorawan-lib v0.0.0-20190212122748-b905ab327304

require (
	github.com/TheThingsNetwork/go-utils v0.0.0-20190331064810-aa2a11bd5910
	github.com/TheThingsNetwork/ttn/api v0.0.0-20190516081709-034d40b328bd
	github.com/TheThingsNetwork/ttn/core/types v0.0.0-20190516081709-034d40b328bd
	github.com/TheThingsNetwork/ttn/utils/errors v0.0.0-20190516081709-034d40b328bd
	github.com/TheThingsNetwork/ttn/utils/random v0.0.0-20190516081709-034d40b328bd
	github.com/TheThingsNetwork/ttn/utils/security v0.0.0-20190516081709-034d40b328bd
	github.com/apex/log v1.1.0 // indirect
	github.com/bluele/gcache v0.0.0-20190301044115-79ae3b2d8680
	github.com/brocaar/lorawan v0.0.0-20170626123636-a64aca28516d
	github.com/davecgh/go-spew v1.1.1 // indirect
	github.com/dgrijalva/jwt-go v3.2.0+incompatible // indirect
	github.com/gogo/protobuf v1.2.1
	github.com/golang/mock v1.3.1
	github.com/golang/protobuf v1.3.1
	github.com/grpc-ecosystem/go-grpc-prometheus v1.2.0 // indirect
	github.com/grpc-ecosystem/grpc-gateway v1.9.0
	github.com/jacobsa/crypto v0.0.0-20190317225127-9f44e2d11115 // indirect
	github.com/jacobsa/oglematchers v0.0.0-20150720000706-141901ea67cd // indirect
	github.com/jacobsa/oglemock v0.0.0-20150831005832-e94d794d06ff // indirect
	github.com/jacobsa/ogletest v0.0.0-20170503003838-80d50a735a11 // indirect
	github.com/jacobsa/reqtrace v0.0.0-20150505043853-245c9e0234cb // indirect
	github.com/mwitkow/go-grpc-middleware v1.0.0
	github.com/pkg/errors v0.8.1 // indirect
	github.com/pmezard/go-difflib v1.0.0 // indirect
	github.com/prometheus/client_golang v0.9.2 // indirect
	github.com/smartystreets/assertions v0.0.0-20190401211740-f487f9de1cd3
	github.com/smartystreets/goconvey v0.0.0-20190330032615-68dc04aab96a // indirect
	github.com/stretchr/testify v1.2.2 // indirect
	golang.org/x/net v0.0.0-20190514140710-3ec191127204
	google.golang.org/appengine v1.4.0 // indirect
	google.golang.org/genproto v0.0.0-20190515210553-995ef27e003f
	google.golang.org/grpc v1.20.1
)
