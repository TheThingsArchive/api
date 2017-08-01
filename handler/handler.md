# API Reference

## .handler.ApplicationManager

ApplicationManager manages application and device registrations on the Handler

To protect our quality of service, you can make up to 5000 calls to the
ApplicationManager API per hour. Once you go over the rate limit, you will
receive an error response.

### Methods

#### `DeleteApplication`

DeleteApplication deletes the application with the given identifier (app_id)

- Request: [`ApplicationIdentifier`](#handlerapplicationidentifier)
- Response: [`Empty`](#googleprotobufempty)

Available HTTP Endpoints:

- `DELETE` `/applications/{app_id}`

Input:

```json
{
  "app_id": "some-app-id"
}
```

Output:

```json
{}
```

#### `DeleteDevice`

DeleteDevice deletes the device with the given identifier (app_id and dev_id)

- Request: [`DeviceIdentifier`](#handlerdeviceidentifier)
- Response: [`Empty`](#googleprotobufempty)

Available HTTP Endpoints:

- `DELETE` `/applications/{app_id}/devices/{dev_id}`

Input:

```json
{
  "app_id": "some-app-id",
  "dev_id": "some-dev-id"
}
```

Output:

```json
{}
```

#### `DryDownlink`

DryUplink simulates processing a downlink message and returns the result

- Request: [`DryDownlinkMessage`](#handlerdrydownlinkmessage)
- Response: [`DryDownlinkResult`](#handlerdrydownlinkresult)

#### `DryUplink`

DryUplink simulates processing an uplink message and returns the result

- Request: [`DryUplinkMessage`](#handlerdryuplinkmessage)
- Response: [`DryUplinkResult`](#handlerdryuplinkresult)

#### `GetApplication`

GetApplication returns the application with the given identifier (app_id)

- Request: [`ApplicationIdentifier`](#handlerapplicationidentifier)
- Response: [`Application`](#handlerapplication)

Available HTTP Endpoints:

- `GET` `/applications/{app_id}`

Input:

```json
{
  "app_id": "some-app-id"
}
```

Output:

```json
{
  "app_id": "some-app-id",
  "converter": "function Converter(decoded, port) {...",
  "decoder": "function Decoder(bytes, port) {...",
  "encoder": "Encoder(object, port) {...",
  "payload_format": "",
  "register_on_join_access_key": "",
  "validator": "Validator(converted, port) {..."
}
```

#### `GetDevice`

GetDevice returns the device with the given identifier (app_id and dev_id)

- Request: [`DeviceIdentifier`](#handlerdeviceidentifier)
- Response: [`Device`](#handlerdevice)

Available HTTP Endpoints:

- `GET` `/applications/{app_id}/devices/{dev_id}`

Input:

```json
{
  "app_id": "some-app-id",
  "dev_id": "some-dev-id"
}
```

Output:

```json
{
  "altitude": 0,
  "app_id": "some-app-id",
  "attributes": {
    "key": "",
    "value": ""
  },
  "description": "Some description of the device",
  "dev_id": "some-dev-id",
  "latitude": 52.375,
  "longitude": 4.887,
  "lorawan_device": {
    "activation_constraints": "local",
    "app_eui": "0102030405060708",
    "app_id": "some-app-id",
    "app_key": "01020304050607080102030405060708",
    "app_s_key": "01020304050607080102030405060708",
    "dev_addr": "01020304",
    "dev_eui": "0102030405060708",
    "dev_id": "some-dev-id",
    "disable_f_cnt_check": false,
    "f_cnt_down": 0,
    "f_cnt_up": 0,
    "last_seen": 0,
    "nwk_s_key": "01020304050607080102030405060708",
    "uses32_bit_f_cnt": true
  }
}
```

#### `GetDevicesForApplication`

GetDevicesForApplication returns all devices that belong to the application with the given identifier (app_id)

- Request: [`ApplicationIdentifier`](#handlerapplicationidentifier)
- Response: [`DeviceList`](#handlerdevicelist)

Available HTTP Endpoints:

- `GET` `/applications/{app_id}/devices`

Input:

```json
{
  "app_id": "some-app-id"
}
```

Output:

```json
{
  "devices": {
    "altitude": 0,
    "app_id": "some-app-id",
    "attributes": {
      "key": "",
      "value": ""
    },
    "description": "Some description of the device",
    "dev_id": "some-dev-id",
    "latitude": 52.375,
    "longitude": 4.887,
    "lorawan_device": {
      "activation_constraints": "local",
      "app_eui": "0102030405060708",
      "app_id": "some-app-id",
      "app_key": "01020304050607080102030405060708",
      "app_s_key": "01020304050607080102030405060708",
      "dev_addr": "01020304",
      "dev_eui": "0102030405060708",
      "dev_id": "some-dev-id",
      "disable_f_cnt_check": false,
      "f_cnt_down": 0,
      "f_cnt_up": 0,
      "last_seen": 0,
      "nwk_s_key": "01020304050607080102030405060708",
      "uses32_bit_f_cnt": true
    }
  }
}
```

#### `RegisterApplication`

Applications should first be registered to the Handler with the `RegisterApplication` method

- Request: [`ApplicationIdentifier`](#handlerapplicationidentifier)
- Response: [`Empty`](#googleprotobufempty)

Available HTTP Endpoints:

- `POST` `/applications`

Input:

```json
{
  "app_id": "some-app-id"
}
```

Output:

```json
{}
```

#### `SetApplication`

SetApplication updates the settings for the application. All fields must be supplied.

- Request: [`Application`](#handlerapplication)
- Response: [`Empty`](#googleprotobufempty)

Available HTTP Endpoints:

- `PUT` `/applications/{app_id}`
- `POST` `/applications/{app_id}`

Input:

```json
{
  "app_id": "some-app-id",
  "converter": "function Converter(decoded, port) {...",
  "decoder": "function Decoder(bytes, port) {...",
  "encoder": "Encoder(object, port) {...",
  "payload_format": "",
  "register_on_join_access_key": "",
  "validator": "Validator(converted, port) {..."
}
```

Output:

```json
{}
```

#### `SetDevice`

SetDevice creates or updates a device. All fields must be supplied.

- Request: [`Device`](#handlerdevice)
- Response: [`Empty`](#googleprotobufempty)

Available HTTP Endpoints:

- `PUT` `/applications/{app_id}/devices/{dev_id}`
- `POST` `/applications/{app_id}/devices`
- `PUT` `/applications/{app_id}/devices`
- `POST` `/applications/{app_id}/devices/{dev_id}`

Input:

```json
{
  "altitude": 0,
  "app_id": "some-app-id",
  "attributes": {
    "key": "",
    "value": ""
  },
  "description": "Some description of the device",
  "dev_id": "some-dev-id",
  "latitude": 52.375,
  "longitude": 4.887,
  "lorawan_device": {
    "activation_constraints": "local",
    "app_eui": "0102030405060708",
    "app_id": "some-app-id",
    "app_key": "01020304050607080102030405060708",
    "app_s_key": "01020304050607080102030405060708",
    "dev_addr": "01020304",
    "dev_eui": "0102030405060708",
    "dev_id": "some-dev-id",
    "disable_f_cnt_check": false,
    "f_cnt_down": 0,
    "f_cnt_up": 0,
    "last_seen": 0,
    "nwk_s_key": "01020304050607080102030405060708",
    "uses32_bit_f_cnt": true
  }
}
```

Output:

```json
{}
```

#### `SimulateUplink`

SimulateUplink simulates an uplink message

- Request: [`SimulatedUplinkMessage`](#handlersimulateduplinkmessage)
- Response: [`Empty`](#googleprotobufempty)

## .handler.Handler

The Handler service provides pure network functionality

### Methods

#### `Activate`

- Request: [`DeduplicatedDeviceActivationRequest`](#brokerdeduplicateddeviceactivationrequest)
- Response: [`DeviceActivationResponse`](#handlerdeviceactivationresponse)

#### `ActivationChallenge`

- Request: [`ActivationChallengeRequest`](#brokeractivationchallengerequest)
- Response: [`ActivationChallengeResponse`](#brokeractivationchallengeresponse)

## .handler.HandlerManager

The HandlerManager service provides configuration and monitoring
functionality

### Methods

#### `GetStatus`

- Request: [`StatusRequest`](#handlerstatusrequest)
- Response: [`Status`](#handlerstatus)

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

### `ActivationChallengeRequest`

| **Name** | **Type** | **Description** |
| -------- | -------- | --------------- |
| `app_eui` | `bytes` |  |
| `app_id` | `string` |  |
| `dev_eui` | `bytes` |  |
| `dev_id` | `string` |  |
| `message` | [`Message`](#protocolmessage) |  |
| `payload` | `bytes` |  |

### `ActivationChallengeResponse`

| **Name** | **Type** | **Description** |
| -------- | -------- | --------------- |
| `message` | [`Message`](#protocolmessage) |  |
| `payload` | `bytes` |  |

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

### `DeviceActivationResponse`

sent to the Router, used as Template

| **Name** | **Type** | **Description** |
| -------- | -------- | --------------- |
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

### `Empty`

A generic empty message that you can re-use to avoid defining duplicated
empty messages in your APIs.

### `Application`

The Application settings

| **Name** | **Type** | **Description** |
| -------- | -------- | --------------- |
| `app_id` | `string` |  |
| `converter` | `string` | The converter is a JavaScript function that can be used to convert values in the object returned from the decoder. This can for example be useful to convert a voltage to a temperature. This function is used when the payload format is set to custom. |
| `decoder` | `string` | The decoder is a JavaScript function that decodes a byte array to an object. This function is used when the payload format is set to custom. |
| `encoder` | `string` | The encoder is a JavaScript function that encodes an object to a byte array. This function is used when the payload format is set to custom. |
| `payload_format` | `string` | The payload format indicates how payload is formatted. |
| `register_on_join_access_key` | `string` | The "register on join" access key should only be set if devices need to be registered on join |
| `validator` | `string` | The validator is a JavaScript function that checks the validity of the object returned by the decoder or converter. If validation fails, the message is dropped. This function is used when the payload format is set to custom. |

### `ApplicationIdentifier`

| **Name** | **Type** | **Description** |
| -------- | -------- | --------------- |
| `app_id` | `string` |  |

### `Device`

The Device settings

| **Name** | **Type** | **Description** |
| -------- | -------- | --------------- |
| `altitude` | `int32` |  |
| `app_id` | `string` |  |
| `attributes` | _repeated_ [`AttributesEntry`](#handlerdeviceattributesentry) |  |
| `description` | `string` |  |
| `dev_id` | `string` |  |
| `latitude` | `float` |  |
| `longitude` | `float` |  |
| `lorawan_device` | [`Device`](#lorawandevice) |  |

### `AttributesEntry`

| **Name** | **Type** | **Description** |
| -------- | -------- | --------------- |
| `key` | `string` |  |
| `value` | `string` |  |

### `DeviceActivationResponse`

| **Name** | **Type** | **Description** |
| -------- | -------- | --------------- |
| `activation_metadata` | [`ActivationMetadata`](#protocolactivationmetadata) |  |
| `downlink_option` | [`DownlinkOption`](#brokerdownlinkoption) |  |
| `message` | [`Message`](#protocolmessage) |  |
| `payload` | `bytes` |  |
| `trace` | [`Trace`](#tracetrace) |  |

### `DeviceIdentifier`

| **Name** | **Type** | **Description** |
| -------- | -------- | --------------- |
| `app_id` | `string` |  |
| `dev_id` | `string` |  |

### `DeviceList`

| **Name** | **Type** | **Description** |
| -------- | -------- | --------------- |
| `devices` | _repeated_ [`Device`](#handlerdevice) |  |

### `DryDownlinkMessage`

DryDownlinkMessage is a simulated message to test downlink processing

| **Name** | **Type** | **Description** |
| -------- | -------- | --------------- |
| `app` | [`Application`](#handlerapplication) | The Application containing the payload functions that should be executed |
| `fields` | `string` | JSON-encoded object with fields to encode |
| `payload` | `bytes` | The binary payload to use |
| `port` | `uint32` | The port number that should be passed to the payload function |

### `DryDownlinkResult`

DryDownlinkResult is the result from a downlink simulation

| **Name** | **Type** | **Description** |
| -------- | -------- | --------------- |
| `logs` | _repeated_ [`LogEntry`](#handlerlogentry) | Logs that have been generated while processing |
| `payload` | `bytes` | The payload that was encoded |

### `DryUplinkMessage`

DryUplinkMessage is a simulated message to test uplink processing

| **Name** | **Type** | **Description** |
| -------- | -------- | --------------- |
| `app` | [`Application`](#handlerapplication) | The Application containing the payload functions that should be executed |
| `payload` | `bytes` | The binary payload to use |
| `port` | `uint32` | The port number that should be passed to the payload function |

### `DryUplinkResult`

DryUplinkResult is the result from an uplink simulation

| **Name** | **Type** | **Description** |
| -------- | -------- | --------------- |
| `fields` | `string` | The decoded fields |
| `logs` | _repeated_ [`LogEntry`](#handlerlogentry) | Logs that have been generated while processing |
| `payload` | `bytes` | The binary payload |
| `valid` | `bool` | Was validation of the message successful |

### `LogEntry`

| **Name** | **Type** | **Description** |
| -------- | -------- | --------------- |
| `fields` | _repeated_ `string` | A list of JSON-encoded fields that were logged |
| `function` | `string` | The location where the log was created (what payload function) |

### `SimulatedUplinkMessage`

SimulatedUplinkMessage is a simulated uplink message

| **Name** | **Type** | **Description** |
| -------- | -------- | --------------- |
| `app_id` | `string` |  |
| `dev_id` | `string` |  |
| `payload` | `bytes` | The binary payload to use |
| `port` | `uint32` | The port number |

### `Status`

message Status is the response to the StatusRequest

| **Name** | **Type** | **Description** |
| -------- | -------- | --------------- |
| `activations` | [`Rates`](#apirates) |  |
| `component` | [`ComponentStats`](#apicomponentstats) |  |
| `downlink` | [`Rates`](#apirates) |  |
| `system` | [`SystemStats`](#apisystemstats) |  |
| `uplink` | [`Rates`](#apirates) |  |

### `StatusRequest`

message StatusRequest is used to request the status of this Handler

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
| `app_id` | `string` | The AppID is a unique identifier for the application a device belongs to. It can contain lowercase letters, numbers, - and _. |
| `app_key` | `bytes` | The AppKey is a 16 byte static key that is known by the device and the application. It is used for negotiating session keys (OTAA). |
| `app_s_key` | `bytes` | The AppSKey is a 16 byte session key that is known by the device and the application. It is used for payload encryption. This key is negotiated during the OTAA join procedure, or statically configured using ABP. |
| `dev_addr` | `bytes` | The DevAddr is a dynamic, 4 byte session address for the device. |
| `dev_eui` | `bytes` | The DevEUI is a unique, 8 byte identifier for the device. |
| `dev_id` | `string` | The DevID is a unique identifier for the device. It can contain lowercase letters, numbers, - and _. |
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
| `data_rate` | `string` | The DevEUI is a unique, 8 byte identifier for the device. |
| `f_cnt` | `uint32` | Store the full 32 bit FCnt (deprecated; do not use) |
| `frequency_plan` | [`FrequencyPlan`](#lorawanfrequencyplan) |  |
| `modulation` | [`Modulation`](#lorawanmodulation) | The AppEUI is a unique, 8 byte identifier for the application a device belongs to. |

### `TxConfiguration`

| **Name** | **Type** | **Description** |
| -------- | -------- | --------------- |
| `bit_rate` | `uint32` | The AppID is a unique identifier for the application a device belongs to. It can contain lowercase letters, numbers, - and _. |
| `coding_rate` | `string` | The DevID is a unique identifier for the device. It can contain lowercase letters, numbers, - and _. |
| `data_rate` | `string` | The DevEUI is a unique, 8 byte identifier for the device. |
| `f_cnt` | `uint32` | The DevAddr is a dynamic, 4 byte session address for the device. |
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

