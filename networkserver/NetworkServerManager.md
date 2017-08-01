# API Reference

## .networkserver.NetworkServerManager

The NetworkServerManager service provides configuration and monitoring
functionality

### Methods

#### `GetStatus`

- Request: [`StatusRequest`](#networkserverstatusrequest)
- Response: [`Status`](#networkserverstatus)

## Messages

### `ComponentStats`

| **Name** | **Type** | **Description** |
| -------- | -------- | --------------- |
| `cpu` | [`CPUStats`](#apicomponentstatscpustats) |  |
| `gc_cpu_fraction` | `float` |  |
| `goroutines` | `uint64` |  |
| `memory` | [`MemoryStats`](#apicomponentstatsmemorystats) |  |
| `uptime` | `uint64` |  |

### `CPUStats`

| **Name** | **Type** | **Description** |
| -------- | -------- | --------------- |
| `idle` | `float` |  |
| `percentage` | `float` |  |
| `system` | `float` |  |
| `user` | `float` |  |

### `MemoryStats`

| **Name** | **Type** | **Description** |
| -------- | -------- | --------------- |
| `heap` | `uint64` |  |
| `memory` | `uint64` |  |
| `stack` | `uint64` |  |
| `swap` | `uint64` |  |

### `Percentiles`

| **Name** | **Type** | **Description** |
| -------- | -------- | --------------- |
| `percentile1` | `float` |  |
| `percentile10` | `float` |  |
| `percentile25` | `float` |  |
| `percentile5` | `float` |  |
| `percentile50` | `float` |  |
| `percentile75` | `float` |  |
| `percentile90` | `float` |  |
| `percentile95` | `float` |  |
| `percentile99` | `float` |  |

### `Rates`

| **Name** | **Type** | **Description** |
| -------- | -------- | --------------- |
| `rate1` | `float` |  |
| `rate15` | `float` |  |
| `rate5` | `float` |  |

### `SystemStats`

| **Name** | **Type** | **Description** |
| -------- | -------- | --------------- |
| `cpu` | [`CPUStats`](#apisystemstatscpustats) |  |
| `load` | [`Loadstats`](#apisystemstatsloadstats) |  |
| `memory` | [`MemoryStats`](#apisystemstatsmemorystats) |  |

### `CPUStats`

| **Name** | **Type** | **Description** |
| -------- | -------- | --------------- |
| `idle` | `float` |  |
| `percentage` | `float` |  |
| `system` | `float` |  |
| `user` | `float` |  |

### `Loadstats`

| **Name** | **Type** | **Description** |
| -------- | -------- | --------------- |
| `load1` | `float` |  |
| `load15` | `float` |  |
| `load5` | `float` |  |

### `MemoryStats`

| **Name** | **Type** | **Description** |
| -------- | -------- | --------------- |
| `available` | `uint64` |  |
| `total` | `uint64` |  |
| `used` | `uint64` |  |

### `Status`

message Status is the response to the StatusRequest

| **Name** | **Type** | **Description** |
| -------- | -------- | --------------- |
| `activations` | [`Rates`](#apirates) |  |
| `component` | [`ComponentStats`](#apicomponentstats) |  |
| `devices_per_address` | [`Percentiles`](#apipercentiles) |  |
| `downlink` | [`Rates`](#apirates) |  |
| `system` | [`SystemStats`](#apisystemstats) |  |
| `uplink` | [`Rates`](#apirates) |  |

### `StatusRequest`

message StatusRequest is used to request the status of this NetworkServer

