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

### `DeduplicatedDeviceActivationRequest`

sent to the Handler

| **Name** | **Type** | **Description** |
| -------- | -------- | --------------- |
| `activation_metadata` | [`ActivationMetadata`](#protocolactivationmetadata) |  |
| `app_eui` | `bytes` |  |
| `app_id` | `string` |  |
| `dev_eui` | `bytes` |  |
| `dev_id` | `string` |  |
| `gateway_metadata` | _repeated_ [`RxMetadata`](#gatewayrxmetadata) |  |
| `message` | [`Message`](#protocolmessage) |  |
| `payload` | `bytes` |  |
| `protocol_metadata` | [`RxMetadata`](#protocolrxmetadata) |  |
| `response_template` | [`DeviceActivationResponse`](#brokerdeviceactivationresponse) |  |
| `server_time` | `int64` |  |
| `trace` | [`Trace`](#tracetrace) |  |

### `DeduplicatedUplinkMessage`

sent to the Handler

| **Name** | **Type** | **Description** |
| -------- | -------- | --------------- |
| `app_eui` | `bytes` |  |
| `app_id` | `string` |  |
| `dev_eui` | `bytes` |  |
| `dev_id` | `string` |  |
| `gateway_metadata` | _repeated_ [`RxMetadata`](#gatewayrxmetadata) |  |
| `message` | [`Message`](#protocolmessage) |  |
| `payload` | `bytes` |  |
| `protocol_metadata` | [`RxMetadata`](#protocolrxmetadata) |  |
| `response_template` | [`DownlinkMessage`](#brokerdownlinkmessage) |  |
| `server_time` | `int64` |  |
| `trace` | [`Trace`](#tracetrace) |  |

### `DeviceActivationResponse`

sent to the Router, used as Template

| **Name** | **Type** | **Description** |
| -------- | -------- | --------------- |
| `downlink_option` | [`DownlinkOption`](#brokerdownlinkoption) |  |
| `message` | [`Message`](#protocolmessage) |  |
| `payload` | `bytes` |  |
| `trace` | [`Trace`](#tracetrace) |  |

### `DownlinkMessage`

received from the Handler, sent to the Router, used as Template

| **Name** | **Type** | **Description** |
| -------- | -------- | --------------- |
| `app_eui` | `bytes` |  |
| `app_id` | `string` |  |
| `dev_eui` | `bytes` |  |
| `dev_id` | `string` |  |
| `downlink_option` | [`DownlinkOption`](#brokerdownlinkoption) |  |
| `message` | [`Message`](#protocolmessage) |  |
| `payload` | `bytes` |  |
| `trace` | [`Trace`](#tracetrace) |  |

### `DownlinkOption`

| **Name** | **Type** | **Description** |
| -------- | -------- | --------------- |
| `deadline` | `int64` | deadline time at server represented as Unix nanoseconds |
| `gateway_configuration` | [`TxConfiguration`](#gatewaytxconfiguration) |  |
| `gateway_id` | `string` | ID of the gateway where this downlink should be sent |
| `identifier` | `string` | String that identifies this downlink option in the Router |
| `protocol_configuration` | [`TxConfiguration`](#protocoltxconfiguration) |  |
| `score` | `uint32` | Score of this downlink option. Lower is better. |

### `LocationMetadata`

| **Name** | **Type** | **Description** |
| -------- | -------- | --------------- |
| `accuracy` | `int32` | the accuracy of the location (meters) |
| `altitude` | `int32` | the altitude (meters), where 0 is the mean sea level |
| `latitude` | `float` | the north–south position (degrees; -90 to +90), where 0 is the equator, north pole is positive, south pole is negative |
| `longitude` | `float` | the east-west position (degrees; -180 to +180), where 0 is the Prime Meridian (Greenwich), east is positive , west is negative |
| `source` | [`LocationSource`](#gatewaylocationmetadatalocationsource) |  |
| `time` | `int64` | Time (unix nanoseconds) |

### `RxMetadata`

| **Name** | **Type** | **Description** |
| -------- | -------- | --------------- |
| `antennas` | _repeated_ [`Antenna`](#gatewayrxmetadataantenna) |  |
| `channel` | `uint32` |  |
| `encrypted_time` | `bytes` | Encrypted time from the Gateway FPGA |
| `frequency` | `uint64` | Frequency in Hz |
| `gateway_id` | `string` |  |
| `gateway_trusted` | `bool` | Indicates whether the gateway is trusted. Components that are able to verify gateway trust MUST do so and set this value accordingly |
| `location` | [`LocationMetadata`](#gatewaylocationmetadata) |  |
| `rf_chain` | `uint32` |  |
| `rssi` | `float` | Received signal strength in dBm |
| `snr` | `float` | Signal-to-noise-ratio in dB |
| `time` | `int64` | Time in Unix nanoseconds |
| `timestamp` | `uint32` | Timestamp (uptime of LoRa module) in microseconds with rollover |

### `Antenna`

| **Name** | **Type** | **Description** |
| -------- | -------- | --------------- |
| `antenna` | `uint32` |  |
| `channel` | `uint32` |  |
| `channel_rssi` | `float` | Received channel power in dBm |
| `encrypted_time` | `bytes` | Encrypted time from the Gateway FPGA |
| `frequency_offset` | `int64` | Frequency offset (Hz) |
| `rssi` | `float` | Received signal power in dBm |
| `rssi_standard_deviation` | `float` | Standard deviation of the RSSI |
| `snr` | `float` | Signal-to-noise-ratio in dB |

### `TxConfiguration`

| **Name** | **Type** | **Description** |
| -------- | -------- | --------------- |
| `frequency` | `uint64` | Frequency in Hz |
| `frequency_deviation` | `uint32` | FSK frequency deviation in Hz |
| `polarization_inversion` | `bool` | LoRa polarization inversion (basically always true for messages from gateway to node) |
| `power` | `int32` | Transmit power in dBm |
| `rf_chain` | `uint32` |  |
| `timestamp` | `uint32` | Timestamp (uptime of LoRa module) in microseconds with rollover |

### `DeviceActivationResponse`

| **Name** | **Type** | **Description** |
| -------- | -------- | --------------- |
| `activation_metadata` | [`ActivationMetadata`](#protocolactivationmetadata) |  |
| `downlink_option` | [`DownlinkOption`](#brokerdownlinkoption) |  |
| `message` | [`Message`](#protocolmessage) |  |
| `payload` | `bytes` |  |
| `trace` | [`Trace`](#tracetrace) |  |

### `ActivationMetadata`

| **Name** | **Type** | **Description** |
| -------- | -------- | --------------- |
| `app_eui` | `bytes` |  |
| `cf_list` | [`CFList`](#lorawancflist) |  |
| `dev_addr` | `bytes` |  |
| `dev_eui` | `bytes` |  |
| `frequency_plan` | [`FrequencyPlan`](#lorawanfrequencyplan) |  |
| `nwk_s_key` | `bytes` |  |
| `rx1_dr_offset` | `uint32` |  |
| `rx2_dr` | `uint32` |  |
| `rx_delay` | `uint32` |  |

### `Device`

| **Name** | **Type** | **Description** |
| -------- | -------- | --------------- |
| `activation_constraints` | `string` | The ActivationContstraints are used to allocate a device address for a device (comma-separated). There are different prefixes for `otaa`, `abp`, `world`, `local`, `private`, `testing`. |
| `app_eui` | `bytes` | The AppEUI is a unique, 8 byte identifier for the application a device belongs to. |
| `app_id` | `string` | FSK bit rate in bit/s |
| `app_key` | `bytes` | The AppKey is a 16 byte static key that is known by the device and the application. It is used for negotiating session keys (OTAA). |
| `app_s_key` | `bytes` | The AppSKey is a 16 byte session key that is known by the device and the application. It is used for payload encryption. This key is negotiated during the OTAA join procedure, or statically configured using ABP. |
| `dev_addr` | `bytes` | Store the full 32 bit FCnt (deprecated; do not use) |
| `dev_eui` | `bytes` | LoRa data rate - SF{spreadingfactor}BW{bandwidth} |
| `dev_id` | `string` | LoRa coding rate |
| `disable_f_cnt_check` | `bool` | The DisableFCntCheck option disables the frame counter check. Disabling this makes the device vulnerable to replay attacks, but makes ABP slightly easier. |
| `f_cnt_down` | `uint32` | FCntDown is the downlink frame counter for a device session. |
| `f_cnt_up` | `uint32` | FCntUp is the uplink frame counter for a device session. |
| `last_seen` | `int64` | When the device was last seen (Unix nanoseconds) |
| `nwk_s_key` | `bytes` | The NwkSKey is a 16 byte session key that is known by the device and the network. It is used for routing and MAC related functionality. This key is negotiated during the OTAA join procedure, or statically configured using ABP. |
| `uses32_bit_f_cnt` | `bool` | The Uses32BitFCnt option indicates that the device keeps track of full 32 bit frame counters. As only the 16 lsb are actually transmitted, the 16 msb will have to be inferred. |

### `Message`

| **Name** | **Type** | **Description** |
| -------- | -------- | --------------- |
| `join_accept_payload` | [`JoinAcceptPayload`](#lorawanjoinacceptpayload) |  |
| `join_request_payload` | [`JoinRequestPayload`](#lorawanjoinrequestpayload) |  |
| `m_hdr` | [`MHDR`](#lorawanmhdr) |  |
| `mac_payload` | [`MACPayload`](#lorawanmacpayload) |  |
| `mic` | `bytes` |  |

### `Metadata`

| **Name** | **Type** | **Description** |
| -------- | -------- | --------------- |
| `bit_rate` | `uint32` | FSK bit rate in bit/s |
| `coding_rate` | `string` | LoRa coding rate |
| `data_rate` | `string` | LoRa data rate - SF{spreadingfactor}BW{bandwidth} |
| `f_cnt` | `uint32` | Store the full 32 bit FCnt (deprecated; do not use) |
| `frequency_plan` | [`FrequencyPlan`](#lorawanfrequencyplan) |  |
| `modulation` | [`Modulation`](#lorawanmodulation) | The AppEUI is a unique, 8 byte identifier for the application a device belongs to. |

### `TxConfiguration`

| **Name** | **Type** | **Description** |
| -------- | -------- | --------------- |
| `bit_rate` | `uint32` | FSK bit rate in bit/s |
| `coding_rate` | `string` | LoRa coding rate |
| `data_rate` | `string` | LoRa data rate - SF{spreadingfactor}BW{bandwidth} |
| `f_cnt` | `uint32` | Store the full 32 bit FCnt (deprecated; do not use) |
| `modulation` | [`Modulation`](#lorawanmodulation) | The AppEUI is a unique, 8 byte identifier for the application a device belongs to. |

### `DevicesRequest`

| **Name** | **Type** | **Description** |
| -------- | -------- | --------------- |
| `dev_addr` | `bytes` | Device address from the uplink message |
| `f_cnt` | `uint32` | Frame counter from the uplink message |

### `DevicesResponse`

| **Name** | **Type** | **Description** |
| -------- | -------- | --------------- |
| `results` | _repeated_ [`Device`](#lorawandevice) |  |

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

### `ActivationMetadata`

| **Name** | **Type** | **Description** |
| -------- | -------- | --------------- |
| `lorawan` | [`ActivationMetadata`](#lorawanactivationmetadata) |  |

### `Message`

| **Name** | **Type** | **Description** |
| -------- | -------- | --------------- |
| `lorawan` | [`Message`](#lorawanmessage) |  |

### `RxMetadata`

| **Name** | **Type** | **Description** |
| -------- | -------- | --------------- |
| `lorawan` | [`Metadata`](#lorawanmetadata) |  |

### `TxConfiguration`

| **Name** | **Type** | **Description** |
| -------- | -------- | --------------- |
| `lorawan` | [`TxConfiguration`](#lorawantxconfiguration) |  |

### `Trace`

Trace information

| **Name** | **Type** | **Description** |
| -------- | -------- | --------------- |
| `event` | `string` | Short event name |
| `id` | `string` | Generated ID |
| `metadata` | _repeated_ [`MetadataEntry`](#tracetracemetadataentry) | metadata for the event |
| `parents` | _repeated_ [`Trace`](#tracetrace) | Parents of the event |
| `service_id` | `string` | The ID of the component |
| `service_name` | `string` | The name of the component (router/broker/handler) |
| `time` | `int64` | Time in Unix nanoseconds |

### `MetadataEntry`

| **Name** | **Type** | **Description** |
| -------- | -------- | --------------- |
| `key` | `string` |  |
| `value` | `string` |  |

## Enums

### `LocationSource`

| **Name** | **Description** |
| -------- | --------------- |
| `CONFIG` | The location is fixed by configuration |
| `GPS` | The location is determined by GPS |
| `IP_GEOLOCATION` | The location is estimated with IP Geolocation |
| `REGISTRY` | The location is set in and updated from a registry |
| `UNKNOWN` | The source of the location is not known or not set |

### `FrequencyPlan`

| **Name** | **Description** |
| -------- | --------------- |
| `AS_920_923` |  |
| `AS_923` |  |
| `AS_923_925` |  |
| `AU_915_928` |  |
| `CN_470_510` |  |
| `CN_779_787` |  |
| `EU_433` |  |
| `EU_863_870` |  |
| `IN_865_867` |  |
| `KR_920_923` |  |
| `US_902_928` |  |

### `Modulation`

| **Name** | **Description** |
| -------- | --------------- |
| `FSK` |  |
| `LORA` |  |
