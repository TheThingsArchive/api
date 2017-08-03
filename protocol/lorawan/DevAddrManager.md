# API Reference

## .lorawan.DevAddrManager

The Device Addresses in the network are issued by the NetworkServer

### Methods

#### `GetDevAddr`

Request a device address

- Request: [`DevAddrRequest`](#lorawandevaddrrequest)
- Response: [`DevAddrResponse`](#lorawandevaddrresponse)

#### `GetPrefixes`

Get all prefixes that are in use or available

- Request: [`PrefixesRequest`](#lorawanprefixesrequest)
- Response: [`PrefixesResponse`](#lorawanprefixesresponse)

## Messages

### `.lorawan.DevAddrRequest`

| **Name** | **Type** | **Description** |
| -------- | -------- | --------------- |
| `usage` | _repeated_ `string` | The usage constraints (see activation_constraints in device.proto) |

### `.lorawan.DevAddrResponse`

| **Name** | **Type** | **Description** |
| -------- | -------- | --------------- |
| `dev_addr` | `bytes` |  |

### `.lorawan.PrefixesRequest`

### `.lorawan.PrefixesResponse`

| **Name** | **Type** | **Description** |
| -------- | -------- | --------------- |
| `prefixes` | _repeated_ [`PrefixMapping`](#lorawanprefixesresponseprefixmapping) | The prefixes that are in use or available |

### `.lorawan.PrefixesResponse.PrefixMapping`

| **Name** | **Type** | **Description** |
| -------- | -------- | --------------- |
| `prefix` | `string` | The prefix that can be used |
| `usage` | _repeated_ `string` | Usage constraints of this prefix (see activation_constraints in device.proto) |

