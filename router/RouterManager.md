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

## Messages

### `.api.ComponentStats`

| **Name** | **Type** | **Description** |
| -------- | -------- | --------------- |
| `cpu` | [`CPUStats`](#apicomponentstatscpustats) |  |
| `gc_cpu_fraction` | `float` |  |
| `goroutines` | `uint64` |  |
| `memory` | [`MemoryStats`](#apicomponentstatsmemorystats) |  |
| `uptime` | `uint64` |  |

### `.api.ComponentStats.CPUStats`

| **Name** | **Type** | **Description** |
| -------- | -------- | --------------- |
| `idle` | `float` |  |
| `percentage` | `float` |  |
| `system` | `float` |  |
| `user` | `float` |  |

### `.api.ComponentStats.MemoryStats`

| **Name** | **Type** | **Description** |
| -------- | -------- | --------------- |
| `heap` | `uint64` |  |
| `memory` | `uint64` |  |
| `stack` | `uint64` |  |
| `swap` | `uint64` |  |

### `.api.Rates`

| **Name** | **Type** | **Description** |
| -------- | -------- | --------------- |
| `rate1` | `float` |  |
| `rate15` | `float` |  |
| `rate5` | `float` |  |

### `.api.SystemStats`

| **Name** | **Type** | **Description** |
| -------- | -------- | --------------- |
| `cpu` | [`CPUStats`](#apisystemstatscpustats) |  |
| `load` | [`Loadstats`](#apisystemstatsloadstats) |  |
| `memory` | [`MemoryStats`](#apisystemstatsmemorystats) |  |

### `.api.SystemStats.CPUStats`

| **Name** | **Type** | **Description** |
| -------- | -------- | --------------- |
| `idle` | `float` |  |
| `percentage` | `float` |  |
| `system` | `float` |  |
| `user` | `float` |  |

### `.api.SystemStats.Loadstats`

| **Name** | **Type** | **Description** |
| -------- | -------- | --------------- |
| `load1` | `float` |  |
| `load15` | `float` |  |
| `load5` | `float` |  |

### `.api.SystemStats.MemoryStats`

| **Name** | **Type** | **Description** |
| -------- | -------- | --------------- |
| `available` | `uint64` |  |
| `total` | `uint64` |  |
| `used` | `uint64` |  |

### `.gateway.LocationMetadata`

| **Name** | **Type** | **Description** |
| -------- | -------- | --------------- |
| `accuracy` | `int32` | the accuracy of the location (meters) |
| `altitude` | `int32` | the altitude (meters), where 0 is the mean sea level |
| `latitude` | `float` | the north–south position (degrees; -90 to +90), where 0 is the equator, north pole is positive, south pole is negative |
| `longitude` | `float` | the east-west position (degrees; -180 to +180), where 0 is the Prime Meridian (Greenwich), east is positive , west is negative |
| `source` | [`LocationSource`](#gatewaylocationmetadatalocationsource) |  |
| `time` | `int64` | Time (unix nanoseconds) |

### `.gateway.Status`

message Status represents a status update from a Gateway.

| **Name** | **Type** | **Description** |
| -------- | -------- | --------------- |
| `boot_time` | `int64` | Boot time in Unix nanoseconds |
| `bridge` | `string` | The value of Bridge is set by the Bridge |
| `contact_email` | `string` |  |
| `description` | `string` |  |
| `dsp` | `uint32` | Version of Gateway DSP software |
| `fpga` | `uint32` | Version of Gateway FPGA |
| `frequency_plan` | `string` | The gateway's frequency plan: one of EU_863_870, US_902_928, CN_779_787, EU_433, AU_915_928, CN_470_510, AS_923, AS_920_923, AS_923_925, KR_920_923 |
| `gateway_trusted` | `bool` | Indicates whether the gateway is trusted. Components that are able to verify gateway trust MUST do so and set this value accordingly |
| `hal` | `string` | Version of gateway driver (in X.X.X format) |
| `ip` | _repeated_ `string` |  |
| `l_pps` | `uint32` | Number of lost PPS pulses |
| `lm_nw` | `uint32` | Sequence number of the last packet received from the link testing mote |
| `lm_ok` | `uint32` | Total number of packets received from link testing mote, with CRC OK |
| `lm_st` | `uint32` | Sequence number of the first packet received from the link testing mote |
| `location` | [`LocationMetadata`](#gatewaylocationmetadata) |  |
| `messages` | _repeated_ `string` | debug or warning messages from the gateway |
| `os` | [`OSMetrics`](#gatewaystatusosmetrics) |  |
| `platform` | `string` |  |
| `router` | `string` | The value of Router is set by the Router |
| `rtt` | `uint32` | Round-trip time to the server in milliseconds |
| `rx_in` | `uint32` | Total number of received uplink packets since boot |
| `rx_ok` | `uint32` | Total number of successful (correct) uplink packets since boot |
| `time` | `int64` | Time in Unix nanoseconds |
| `timestamp` | `uint32` | Timestamp (uptime of gateway) in microseconds with rollover |
| `tx_in` | `uint32` | Total number of received downlink packets since boot |
| `tx_ok` | `uint32` | Total number of successfully sent downlink packets since boot |

### `.gateway.Status.OSMetrics`

Additional metrics from the operating system

| **Name** | **Type** | **Description** |
| -------- | -------- | --------------- |
| `cpu_percentage` | `float` |  |
| `load_1` | `float` |  |
| `load_15` | `float` |  |
| `load_5` | `float` |  |
| `memory_percentage` | `float` |  |
| `temperature` | `float` |  |

### `.router.GatewayStatusRequest`

message GatewayStatusRequest is used to request the status of a gateway from
this Router

| **Name** | **Type** | **Description** |
| -------- | -------- | --------------- |
| `gateway_id` | `string` |  |

### `.router.GatewayStatusResponse`

| **Name** | **Type** | **Description** |
| -------- | -------- | --------------- |
| `last_seen` | `int64` |  |
| `status` | [`Status`](#gatewaystatus) |  |

### `.router.Status`

message Status is the response to the StatusRequest

| **Name** | **Type** | **Description** |
| -------- | -------- | --------------- |
| `activations` | [`Rates`](#apirates) |  |
| `component` | [`ComponentStats`](#apicomponentstats) |  |
| `connected_brokers` | `uint32` |  |
| `connected_gateways` | `uint32` | Connections |
| `downlink` | [`Rates`](#apirates) |  |
| `gateway_status` | [`Rates`](#apirates) |  |
| `system` | [`SystemStats`](#apisystemstats) |  |
| `uplink` | [`Rates`](#apirates) |  |

### `.router.StatusRequest`

message StatusRequest is used to request the status of this Router

## Enums

### `.gateway.LocationMetadata.LocationSource`

| **Name** | **Description** |
| -------- | --------------- |
| `CONFIG` | The location is fixed by configuration |
| `GPS` | The location is determined by GPS |
| `IP_GEOLOCATION` | The location is estimated with IP Geolocation |
| `REGISTRY` | The location is set in and updated from a registry |
| `UNKNOWN` | The source of the location is not known or not set |

