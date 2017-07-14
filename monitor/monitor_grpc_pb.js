// GENERATED CODE -- DO NOT EDIT!

// Original file comments:
// Copyright © 2017 The Things Network
// Use of this source code is governed by the MIT license that can be found in the LICENSE file.
//
'use strict';
var grpc = require('grpc');
var google_protobuf_empty_pb = require('google-protobuf/google/protobuf/empty_pb.js');
var ttn_gateway_gateway_pb = require('../gateway/gateway_pb.js');
var ttn_router_router_pb = require('../router/router_pb.js');
var ttn_broker_broker_pb = require('../broker/broker_pb.js');
var ttn_handler_handler_pb = require('../handler/handler_pb.js');
var ttn_networkserver_networkserver_pb = require('../networkserver/networkserver_pb.js');

function serialize_broker_DeduplicatedUplinkMessage(arg) {
  if (!(arg instanceof ttn_broker_broker_pb.DeduplicatedUplinkMessage)) {
    throw new Error('Expected argument of type broker.DeduplicatedUplinkMessage');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_broker_DeduplicatedUplinkMessage(buffer_arg) {
  return ttn_broker_broker_pb.DeduplicatedUplinkMessage.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_broker_DownlinkMessage(arg) {
  if (!(arg instanceof ttn_broker_broker_pb.DownlinkMessage)) {
    throw new Error('Expected argument of type broker.DownlinkMessage');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_broker_DownlinkMessage(buffer_arg) {
  return ttn_broker_broker_pb.DownlinkMessage.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_broker_Status(arg) {
  if (!(arg instanceof ttn_broker_broker_pb.Status)) {
    throw new Error('Expected argument of type broker.Status');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_broker_Status(buffer_arg) {
  return ttn_broker_broker_pb.Status.deserializeBinary(new Uint8Array(buffer_arg));
}

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

function serialize_handler_Status(arg) {
  if (!(arg instanceof ttn_handler_handler_pb.Status)) {
    throw new Error('Expected argument of type handler.Status');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_handler_Status(buffer_arg) {
  return ttn_handler_handler_pb.Status.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_networkserver_Status(arg) {
  if (!(arg instanceof ttn_networkserver_networkserver_pb.Status)) {
    throw new Error('Expected argument of type networkserver.Status');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_networkserver_Status(buffer_arg) {
  return ttn_networkserver_networkserver_pb.Status.deserializeBinary(new Uint8Array(buffer_arg));
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

function serialize_router_Status(arg) {
  if (!(arg instanceof ttn_router_router_pb.Status)) {
    throw new Error('Expected argument of type router.Status');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_router_Status(buffer_arg) {
  return ttn_router_router_pb.Status.deserializeBinary(new Uint8Array(buffer_arg));
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


var MonitorService = exports.MonitorService = {
  routerStatus: {
    path: '/monitor.Monitor/RouterStatus',
    requestStream: true,
    responseStream: false,
    requestType: ttn_router_router_pb.Status,
    responseType: google_protobuf_empty_pb.Empty,
    requestSerialize: serialize_router_Status,
    requestDeserialize: deserialize_router_Status,
    responseSerialize: serialize_google_protobuf_Empty,
    responseDeserialize: deserialize_google_protobuf_Empty,
  },
  gatewayStatus: {
    path: '/monitor.Monitor/GatewayStatus',
    requestStream: true,
    responseStream: false,
    requestType: ttn_gateway_gateway_pb.Status,
    responseType: google_protobuf_empty_pb.Empty,
    requestSerialize: serialize_gateway_Status,
    requestDeserialize: deserialize_gateway_Status,
    responseSerialize: serialize_google_protobuf_Empty,
    responseDeserialize: deserialize_google_protobuf_Empty,
  },
  gatewayUplink: {
    path: '/monitor.Monitor/GatewayUplink',
    requestStream: true,
    responseStream: false,
    requestType: ttn_router_router_pb.UplinkMessage,
    responseType: google_protobuf_empty_pb.Empty,
    requestSerialize: serialize_router_UplinkMessage,
    requestDeserialize: deserialize_router_UplinkMessage,
    responseSerialize: serialize_google_protobuf_Empty,
    responseDeserialize: deserialize_google_protobuf_Empty,
  },
  gatewayDownlink: {
    path: '/monitor.Monitor/GatewayDownlink',
    requestStream: true,
    responseStream: false,
    requestType: ttn_router_router_pb.DownlinkMessage,
    responseType: google_protobuf_empty_pb.Empty,
    requestSerialize: serialize_router_DownlinkMessage,
    requestDeserialize: deserialize_router_DownlinkMessage,
    responseSerialize: serialize_google_protobuf_Empty,
    responseDeserialize: deserialize_google_protobuf_Empty,
  },
  brokerStatus: {
    path: '/monitor.Monitor/BrokerStatus',
    requestStream: true,
    responseStream: false,
    requestType: ttn_broker_broker_pb.Status,
    responseType: google_protobuf_empty_pb.Empty,
    requestSerialize: serialize_broker_Status,
    requestDeserialize: deserialize_broker_Status,
    responseSerialize: serialize_google_protobuf_Empty,
    responseDeserialize: deserialize_google_protobuf_Empty,
  },
  brokerUplink: {
    path: '/monitor.Monitor/BrokerUplink',
    requestStream: true,
    responseStream: false,
    requestType: ttn_broker_broker_pb.DeduplicatedUplinkMessage,
    responseType: google_protobuf_empty_pb.Empty,
    requestSerialize: serialize_broker_DeduplicatedUplinkMessage,
    requestDeserialize: deserialize_broker_DeduplicatedUplinkMessage,
    responseSerialize: serialize_google_protobuf_Empty,
    responseDeserialize: deserialize_google_protobuf_Empty,
  },
  brokerDownlink: {
    path: '/monitor.Monitor/BrokerDownlink',
    requestStream: true,
    responseStream: false,
    requestType: ttn_broker_broker_pb.DownlinkMessage,
    responseType: google_protobuf_empty_pb.Empty,
    requestSerialize: serialize_broker_DownlinkMessage,
    requestDeserialize: deserialize_broker_DownlinkMessage,
    responseSerialize: serialize_google_protobuf_Empty,
    responseDeserialize: deserialize_google_protobuf_Empty,
  },
  handlerStatus: {
    path: '/monitor.Monitor/HandlerStatus',
    requestStream: true,
    responseStream: false,
    requestType: ttn_handler_handler_pb.Status,
    responseType: google_protobuf_empty_pb.Empty,
    requestSerialize: serialize_handler_Status,
    requestDeserialize: deserialize_handler_Status,
    responseSerialize: serialize_google_protobuf_Empty,
    responseDeserialize: deserialize_google_protobuf_Empty,
  },
  handlerUplink: {
    path: '/monitor.Monitor/HandlerUplink',
    requestStream: true,
    responseStream: false,
    requestType: ttn_broker_broker_pb.DeduplicatedUplinkMessage,
    responseType: google_protobuf_empty_pb.Empty,
    requestSerialize: serialize_broker_DeduplicatedUplinkMessage,
    requestDeserialize: deserialize_broker_DeduplicatedUplinkMessage,
    responseSerialize: serialize_google_protobuf_Empty,
    responseDeserialize: deserialize_google_protobuf_Empty,
  },
  handlerDownlink: {
    path: '/monitor.Monitor/HandlerDownlink',
    requestStream: true,
    responseStream: false,
    requestType: ttn_broker_broker_pb.DownlinkMessage,
    responseType: google_protobuf_empty_pb.Empty,
    requestSerialize: serialize_broker_DownlinkMessage,
    requestDeserialize: deserialize_broker_DownlinkMessage,
    responseSerialize: serialize_google_protobuf_Empty,
    responseDeserialize: deserialize_google_protobuf_Empty,
  },
  networkServerStatus: {
    path: '/monitor.Monitor/NetworkServerStatus',
    requestStream: true,
    responseStream: false,
    requestType: ttn_networkserver_networkserver_pb.Status,
    responseType: google_protobuf_empty_pb.Empty,
    requestSerialize: serialize_networkserver_Status,
    requestDeserialize: deserialize_networkserver_Status,
    responseSerialize: serialize_google_protobuf_Empty,
    responseDeserialize: deserialize_google_protobuf_Empty,
  },
};

exports.MonitorClient = grpc.makeGenericClientConstructor(MonitorService);
