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

