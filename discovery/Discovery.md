# API Reference

## .discovery.Discovery

The Discovery service is used to discover services within The Things Network.

### Methods

#### `AddMetadata`

Add metadata to an announement

- Request: [`MetadataRequest`](#discoverymetadatarequest)
- Response: [`Empty`](#googleprotobufempty)

#### `Announce`

Announce a component to the Discovery server.
A call to `Announce` does not processes the `metadata` field, so you can safely leave this field empty.
Adding or removing Metadata should be done with the `AddMetadata` and `DeleteMetadata` methods.

- Request: [`Announcement`](#discoveryannouncement)
- Response: [`Empty`](#googleprotobufempty)

#### `DeleteMetadata`

Delete metadata from an announcement

- Request: [`MetadataRequest`](#discoverymetadatarequest)
- Response: [`Empty`](#googleprotobufempty)

#### `Get`

Get a specific announcement

- Request: [`GetRequest`](#discoverygetrequest)
- Response: [`Announcement`](#discoveryannouncement)

Available HTTP Endpoints:

- `GET` `/announcements/{service_name}/{id}`

Input:

```json
{
  "id": "ttn-handler-eu",
  "service_name": "handler"
}
```

Output:

```json
{
  "amqp_address": "",
  "api_address": "http://eu.thethings.network:8084",
  "certificate": "-----BEGIN CERTIFICATE-----\n...",
  "description": "",
  "id": "ttn-handler-eu",
  "metadata": {
    "app_eui": "",
    "app_id": "some-app-id",
    "dev_addr_prefix": "AAAAAAA=",
    "gateway_id": ""
  },
  "mqtt_address": "",
  "net_address": "eu.thethings.network:1904",
  "public": true,
  "public_key": "-----BEGIN PUBLIC KEY-----\n...",
  "service_name": "handler",
  "service_version": "2.0.0-abcdef...",
  "url": ""
}
```

#### `GetAll`

Get all announcements for a specific service type

- Request: [`GetServiceRequest`](#discoverygetservicerequest)
- Response: [`AnnouncementsResponse`](#discoveryannouncementsresponse)

Available HTTP Endpoints:

- `GET` `/announcements/{service_name}`

Input:

```json
{
  "service_name": "handler"
}
```

Output:

```json
{
  "services": {
    "amqp_address": "",
    "api_address": "http://eu.thethings.network:8084",
    "certificate": "-----BEGIN CERTIFICATE-----\n...",
    "description": "",
    "id": "ttn-handler-eu",
    "metadata": {
      "app_eui": "",
      "app_id": "some-app-id",
      "dev_addr_prefix": "AAAAAAA=",
      "gateway_id": ""
    },
    "mqtt_address": "",
    "net_address": "eu.thethings.network:1904",
    "public": true,
    "public_key": "-----BEGIN PUBLIC KEY-----\n...",
    "service_name": "handler",
    "service_version": "2.0.0-abcdef...",
    "url": ""
  }
}
```

#### `GetByAppEUI`

- Request: [`GetByAppEUIRequest`](#discoverygetbyappeuirequest)
- Response: [`Announcement`](#discoveryannouncement)

#### `GetByAppID`

- Request: [`GetByAppIDRequest`](#discoverygetbyappidrequest)
- Response: [`Announcement`](#discoveryannouncement)

#### `GetByGatewayID`

- Request: [`GetByGatewayIDRequest`](#discoverygetbygatewayidrequest)
- Response: [`Announcement`](#discoveryannouncement)

