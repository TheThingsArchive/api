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

