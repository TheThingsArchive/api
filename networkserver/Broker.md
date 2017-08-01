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

## Messages

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

### `DeviceActivationRequest`

received from the Router

| **Name** | **Type** | **Description** |
| -------- | -------- | --------------- |
| `activation_metadata` | [`ActivationMetadata`](#protocolactivationmetadata) |  |
| `app_eui` | `bytes` |  |
| `dev_eui` | `bytes` |  |
| `downlink_options` | _repeated_ [`DownlinkOption`](#brokerdownlinkoption) |  |
| `gateway_metadata` | [`RxMetadata`](#gatewayrxmetadata) |  |
| `message` | [`Message`](#protocolmessage) |  |
| `payload` | `bytes` |  |
| `protocol_metadata` | [`RxMetadata`](#protocolrxmetadata) |  |
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

### `SubscribeRequest`

message SubscribeRequest is used by a Handler to subscribe to uplink messages

### `UplinkMessage`

received from the Router

| **Name** | **Type** | **Description** |
| -------- | -------- | --------------- |
| `app_eui` | `bytes` |  |
| `app_id` | `string` |  |
| `dev_eui` | `bytes` |  |
| `dev_id` | `string` |  |
| `downlink_options` | _repeated_ [`DownlinkOption`](#brokerdownlinkoption) |  |
| `gateway_metadata` | [`RxMetadata`](#gatewayrxmetadata) |  |
| `message` | [`Message`](#protocolmessage) |  |
| `payload` | `bytes` |  |
| `protocol_metadata` | [`RxMetadata`](#protocolrxmetadata) |  |
| `trace` | [`Trace`](#tracetrace) |  |

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

### `Empty`

A generic empty message that you can re-use to avoid defining duplicated
empty messages in your APIs.

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

