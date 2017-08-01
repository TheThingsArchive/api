# API Reference

## .broker.BrokerManager

The BrokerManager service provides configuration and monitoring functionality

### Methods

#### `GetStatus`

Network operator requests Broker status

- Request: [`StatusRequest`](#brokerstatusrequest)
- Response: [`Status`](#brokerstatus)

#### `RegisterApplicationHandler`

Handler announces a new application to Broker. This is a temporary method that will be removed
when we can push updates from the Discovery service to the routing services.

- Request: [`ApplicationHandlerRegistration`](#brokerapplicationhandlerregistration)
- Response: [`Empty`](#googleprotobufempty)

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

### `ApplicationHandlerRegistration`

| **Name** | **Type** | **Description** |
| -------- | -------- | --------------- |
| `app_id` | `string` |  |
| `handler_id` | `string` |  |

### `Status`

| **Name** | **Type** | **Description** |
| -------- | -------- | --------------- |
| `activations` | [`Rates`](#apirates) |  |
| `activations_unique` | [`Rates`](#apirates) |  |
| `component` | [`ComponentStats`](#apicomponentstats) |  |
| `connected_handlers` | `uint32` |  |
| `connected_routers` | `uint32` | Connections |
| `deduplication` | [`Percentiles`](#apipercentiles) |  |
| `downlink` | [`Rates`](#apirates) |  |
| `system` | [`SystemStats`](#apisystemstats) |  |
| `uplink` | [`Rates`](#apirates) |  |
| `uplink_unique` | [`Rates`](#apirates) |  |

### `StatusRequest`

message StatusRequest is used to request the status of this Broker

### `Empty`

A generic empty message that you can re-use to avoid defining duplicated
empty messages in your APIs.

