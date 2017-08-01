# API Reference

## .router.Router

The Router service provides pure network functionality

### Methods

#### `Activate`

Gateway requests device activation

- Request: [`DeviceActivationRequest`](#routerdeviceactivationrequest)
- Response: [`DeviceActivationResponse`](#routerdeviceactivationresponse)

#### `GatewayStatus`

Gateway streams status messages to Router

- Request: stream of [`Status`](#gatewaystatus)
- Response: [`Empty`](#googleprotobufempty)

#### `Subscribe`

Gateway subscribes to downlink messages from Router
It is possible to open multiple subscriptions (but not recommended).
If you do this, you are responsible for de-duplication of downlink messages.

- Request: [`SubscribeRequest`](#routersubscriberequest)
- Response: stream of [`DownlinkMessage`](#routerdownlinkmessage)

#### `Uplink`

Gateway streams uplink messages to Router

- Request: stream of [`UplinkMessage`](#routeruplinkmessage)
- Response: [`Empty`](#googleprotobufempty)

