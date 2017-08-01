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

### `.api.Percentiles`

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

### `.broker.ApplicationHandlerRegistration`

| **Name** | **Type** | **Description** |
| -------- | -------- | --------------- |
| `app_id` | `string` |  |
| `handler_id` | `string` |  |

### `.broker.Status`

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

### `.broker.StatusRequest`

message StatusRequest is used to request the status of this Broker

### `.google.protobuf.Empty`

A generic empty message that you can re-use to avoid defining duplicated
empty messages in your APIs.

