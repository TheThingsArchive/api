# API Reference

## .networkserver.NetworkServer

### Methods

#### `Activate`

Broker confirms device activation (after response from Handler)

- Request: [`DeviceActivationResponse`](#handlerdeviceactivationresponse)
- Response: [`DeviceActivationResponse`](#handlerdeviceactivationresponse)

#### `Downlink`

Broker informs Network Server about Downlink, NetworkServer may add MAC commands and re-set MIC

- Request: [`DownlinkMessage`](#brokerdownlinkmessage)
- Response: [`DownlinkMessage`](#brokerdownlinkmessage)

#### `GetDevices`

Broker requests devices with DevAddr and matching FCnt (or disabled FCnt check)

- Request: [`DevicesRequest`](#networkserverdevicesrequest)
- Response: [`DevicesResponse`](#networkserverdevicesresponse)

#### `PrepareActivation`

Broker requests device activation "template" from Network Server

- Request: [`DeduplicatedDeviceActivationRequest`](#brokerdeduplicateddeviceactivationrequest)
- Response: [`DeduplicatedDeviceActivationRequest`](#brokerdeduplicateddeviceactivationrequest)

#### `Uplink`

Broker informs Network Server about Uplink

- Request: [`DeduplicatedUplinkMessage`](#brokerdeduplicateduplinkmessage)
- Response: [`DeduplicatedUplinkMessage`](#brokerdeduplicateduplinkmessage)

