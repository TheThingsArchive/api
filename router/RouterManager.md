# API Reference

## .router.RouterManager

The RouterManager service provides configuration and monitoring functionality

### Methods

#### `GatewayStatus`

Gateway owner or network operator requests Gateway status from Router Manager
Deprecated: Use monitor API (NOC) instead of this

- Request: [`GatewayStatusRequest`](#routergatewaystatusrequest)
- Response: [`GatewayStatusResponse`](#routergatewaystatusresponse)

#### `GetStatus`

Network operator requests Router status

- Request: [`StatusRequest`](#routerstatusrequest)
- Response: [`Status`](#routerstatus)

