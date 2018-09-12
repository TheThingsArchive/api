// GENERATED CODE -- DO NOT EDIT!

// Original file comments:
// Copyright © 2017 The Things Network
// Use of this source code is governed by the MIT license that can be found in the LICENSE file.
//
'use strict';
var grpc = require('grpc');
var ttn_router_router_pb = require('../router/router_pb.js');
var google_protobuf_empty_pb = require('google-protobuf/google/protobuf/empty_pb.js');

var ttn_api_pb = require('../api_pb.js');
var ttn_protocol_protocol_pb = require('../protocol/protocol_pb.js');
var ttn_gateway_gateway_pb = require('../gateway/gateway_pb.js');
var ttn_trace_trace_pb = require('../trace/trace_pb.js');

function serialize_gateway_Status(arg) {
  if (!(arg instanceof ttn_gateway_gateway_pb.Status)) {
    throw new Error('Expected argument of type gateway.Status');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_gateway_Status(buffer_arg) {
  return ttn_gateway_gateway_pb.Status.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_google_protobuf_Empty(arg) {
  if (!(arg instanceof google_protobuf_empty_pb.Empty)) {
    throw new Error('Expected argument of type google.protobuf.Empty');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_google_protobuf_Empty(buffer_arg) {
  return google_protobuf_empty_pb.Empty.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_router_DeviceActivationRequest(arg) {
  if (!(arg instanceof ttn_router_router_pb.DeviceActivationRequest)) {
    throw new Error('Expected argument of type router.DeviceActivationRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_router_DeviceActivationRequest(buffer_arg) {
  return ttn_router_router_pb.DeviceActivationRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_router_DeviceActivationResponse(arg) {
  if (!(arg instanceof ttn_router_router_pb.DeviceActivationResponse)) {
    throw new Error('Expected argument of type router.DeviceActivationResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_router_DeviceActivationResponse(buffer_arg) {
  return ttn_router_router_pb.DeviceActivationResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_router_DownlinkMessage(arg) {
  if (!(arg instanceof ttn_router_router_pb.DownlinkMessage)) {
    throw new Error('Expected argument of type router.DownlinkMessage');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_router_DownlinkMessage(buffer_arg) {
  return ttn_router_router_pb.DownlinkMessage.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_router_GatewayStatusRequest(arg) {
  if (!(arg instanceof ttn_router_router_pb.GatewayStatusRequest)) {
    throw new Error('Expected argument of type router.GatewayStatusRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_router_GatewayStatusRequest(buffer_arg) {
  return ttn_router_router_pb.GatewayStatusRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_router_GatewayStatusResponse(arg) {
  if (!(arg instanceof ttn_router_router_pb.GatewayStatusResponse)) {
    throw new Error('Expected argument of type router.GatewayStatusResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_router_GatewayStatusResponse(buffer_arg) {
  return ttn_router_router_pb.GatewayStatusResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_router_Status(arg) {
  if (!(arg instanceof ttn_router_router_pb.Status)) {
    throw new Error('Expected argument of type router.Status');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_router_Status(buffer_arg) {
  return ttn_router_router_pb.Status.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_router_StatusRequest(arg) {
  if (!(arg instanceof ttn_router_router_pb.StatusRequest)) {
    throw new Error('Expected argument of type router.StatusRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_router_StatusRequest(buffer_arg) {
  return ttn_router_router_pb.StatusRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_router_SubscribeRequest(arg) {
  if (!(arg instanceof ttn_router_router_pb.SubscribeRequest)) {
    throw new Error('Expected argument of type router.SubscribeRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_router_SubscribeRequest(buffer_arg) {
  return ttn_router_router_pb.SubscribeRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_router_UplinkMessage(arg) {
  if (!(arg instanceof ttn_router_router_pb.UplinkMessage)) {
    throw new Error('Expected argument of type router.UplinkMessage');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_router_UplinkMessage(buffer_arg) {
  return ttn_router_router_pb.UplinkMessage.deserializeBinary(new Uint8Array(buffer_arg));
}


// The Router service provides pure network functionality
var RouterService = exports.RouterService = {
  // Gateway streams status messages to Router
  gatewayStatus: {
    path: '/router.Router/GatewayStatus',
    requestStream: true,
    responseStream: false,
    requestType: ttn_gateway_gateway_pb.Status,
    responseType: google_protobuf_empty_pb.Empty,
    requestSerialize: serialize_gateway_Status,
    requestDeserialize: deserialize_gateway_Status,
    responseSerialize: serialize_google_protobuf_Empty,
    responseDeserialize: deserialize_google_protobuf_Empty,
  },
  // Gateway streams uplink messages to Router
  uplink: {
    path: '/router.Router/Uplink',
    requestStream: true,
    responseStream: false,
    requestType: ttn_router_router_pb.UplinkMessage,
    responseType: google_protobuf_empty_pb.Empty,
    requestSerialize: serialize_router_UplinkMessage,
    requestDeserialize: deserialize_router_UplinkMessage,
    responseSerialize: serialize_google_protobuf_Empty,
    responseDeserialize: deserialize_google_protobuf_Empty,
  },
  // Gateway subscribes to downlink messages from Router
  // It is possible to open multiple subscriptions (but not recommended).
  // If you do this, you are responsible for de-duplication of downlink messages.
  subscribe: {
    path: '/router.Router/Subscribe',
    requestStream: false,
    responseStream: true,
    requestType: ttn_router_router_pb.SubscribeRequest,
    responseType: ttn_router_router_pb.DownlinkMessage,
    requestSerialize: serialize_router_SubscribeRequest,
    requestDeserialize: deserialize_router_SubscribeRequest,
    responseSerialize: serialize_router_DownlinkMessage,
    responseDeserialize: deserialize_router_DownlinkMessage,
  },
  // Gateway requests device activation
  activate: {
    path: '/router.Router/Activate',
    requestStream: false,
    responseStream: false,
    requestType: ttn_router_router_pb.DeviceActivationRequest,
    responseType: ttn_router_router_pb.DeviceActivationResponse,
    requestSerialize: serialize_router_DeviceActivationRequest,
    requestDeserialize: deserialize_router_DeviceActivationRequest,
    responseSerialize: serialize_router_DeviceActivationResponse,
    responseDeserialize: deserialize_router_DeviceActivationResponse,
  },
};

exports.RouterClient = grpc.makeGenericClientConstructor(RouterService);
// The RouterManager service provides configuration and monitoring functionality
var RouterManagerService = exports.RouterManagerService = {
  // Gateway owner or network operator requests Gateway status from Router Manager
  // Deprecated: Use monitor API (NOC) instead of this
  gatewayStatus: {
    path: '/router.RouterManager/GatewayStatus',
    requestStream: false,
    responseStream: false,
    requestType: ttn_router_router_pb.GatewayStatusRequest,
    responseType: ttn_router_router_pb.GatewayStatusResponse,
    requestSerialize: serialize_router_GatewayStatusRequest,
    requestDeserialize: deserialize_router_GatewayStatusRequest,
    responseSerialize: serialize_router_GatewayStatusResponse,
    responseDeserialize: deserialize_router_GatewayStatusResponse,
  },
  // Network operator requests Router status
  getStatus: {
    path: '/router.RouterManager/GetStatus',
    requestStream: false,
    responseStream: false,
    requestType: ttn_router_router_pb.StatusRequest,
    responseType: ttn_router_router_pb.Status,
    requestSerialize: serialize_router_StatusRequest,
    requestDeserialize: deserialize_router_StatusRequest,
    responseSerialize: serialize_router_Status,
    responseDeserialize: deserialize_router_Status,
  },
};

exports.RouterManagerClient = grpc.makeGenericClientConstructor(RouterManagerService);
