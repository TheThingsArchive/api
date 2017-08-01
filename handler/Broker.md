# API Reference

## .broker.Broker

The Broker service provides pure network functionality

### Methods

#### `Activate`

Router requests device activation

- Request: [`DeviceActivationRequest`](#brokerdeviceactivationrequest)
- Response: [`DeviceActivationResponse`](#brokerdeviceactivationresponse)

#### `Associate`

Router initiates an Association with the Broker.

- Request: stream of [`UplinkMessage`](#brokeruplinkmessage)
- Response: stream of [`DownlinkMessage`](#brokerdownlinkmessage)

#### `Publish`

Handler initiates downlink stream.

- Request: stream of [`DownlinkMessage`](#brokerdownlinkmessage)
- Response: [`Empty`](#googleprotobufempty)

#### `Subscribe`

Handler subscribes to uplink stream.

- Request: [`SubscribeRequest`](#brokersubscriberequest)
- Response: stream of [`DeduplicatedUplinkMessage`](#brokerdeduplicateduplinkmessage)

