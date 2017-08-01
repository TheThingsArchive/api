# API Reference

## .lorawan.DeviceManager

### Methods

#### `DeleteDevice`

- Request: [`DeviceIdentifier`](#lorawandeviceidentifier)
- Response: [`Empty`](#googleprotobufempty)

#### `GetDevice`

- Request: [`DeviceIdentifier`](#lorawandeviceidentifier)
- Response: [`Device`](#lorawandevice)

#### `SetDevice`

- Request: [`Device`](#lorawandevice)
- Response: [`Empty`](#googleprotobufempty)

## Messages

### `.google.protobuf.Empty`

A generic empty message that you can re-use to avoid defining duplicated
empty messages in your APIs.

### `.lorawan.Device`

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

### `.lorawan.DeviceIdentifier`

| **Name** | **Type** | **Description** |
| -------- | -------- | --------------- |
| `app_eui` | `bytes` | The AppEUI is a unique, 8 byte identifier for the application a device belongs to. |
| `dev_eui` | `bytes` | The DevEUI is a unique, 8 byte identifier for the device. |

