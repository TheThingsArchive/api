# API Reference

## .monitor.Monitor

### Methods

#### `BrokerDownlink`

- Request: stream of [`DownlinkMessage`](#brokerdownlinkmessage)
- Response: [`Empty`](#googleprotobufempty)

#### `BrokerStatus`

- Request: stream of [`Status`](#brokerstatus)
- Response: [`Empty`](#googleprotobufempty)

#### `BrokerUplink`

- Request: stream of [`DeduplicatedUplinkMessage`](#brokerdeduplicateduplinkmessage)
- Response: [`Empty`](#googleprotobufempty)

#### `GatewayDownlink`

- Request: stream of [`DownlinkMessage`](#routerdownlinkmessage)
- Response: [`Empty`](#googleprotobufempty)

#### `GatewayStatus`

- Request: stream of [`Status`](#gatewaystatus)
- Response: [`Empty`](#googleprotobufempty)

#### `GatewayUplink`

- Request: stream of [`UplinkMessage`](#routeruplinkmessage)
- Response: [`Empty`](#googleprotobufempty)

#### `HandlerDownlink`

- Request: stream of [`DownlinkMessage`](#brokerdownlinkmessage)
- Response: [`Empty`](#googleprotobufempty)

#### `HandlerStatus`

- Request: stream of [`Status`](#handlerstatus)
- Response: [`Empty`](#googleprotobufempty)

#### `HandlerUplink`

- Request: stream of [`DeduplicatedUplinkMessage`](#brokerdeduplicateduplinkmessage)
- Response: [`Empty`](#googleprotobufempty)

#### `NetworkServerStatus`

- Request: stream of [`Status`](#networkserverstatus)
- Response: [`Empty`](#googleprotobufempty)

#### `RouterStatus`

- Request: stream of [`Status`](#routerstatus)
- Response: [`Empty`](#googleprotobufempty)

