// GENERATED CODE -- DO NOT EDIT!

// Original file comments:
// Copyright © 2017 The Things Network
// Use of this source code is governed by the MIT license that can be found in the LICENSE file.
//
'use strict';
var grpc = require('grpc');
var ttn_networkserver_networkserver_pb = require('../networkserver/networkserver_pb.js');

var ttn_api_pb = require('../api_pb.js');
var ttn_protocol_lorawan_device_pb = require('../protocol/lorawan/device_pb.js');
var ttn_broker_broker_pb = require('../broker/broker_pb.js');
var ttn_handler_handler_pb = require('../handler/handler_pb.js');

function serialize_broker_DeduplicatedDeviceActivationRequest(arg) {
  if (!(arg instanceof ttn_broker_broker_pb.DeduplicatedDeviceActivationRequest)) {
    throw new Error('Expected argument of type broker.DeduplicatedDeviceActivationRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_broker_DeduplicatedDeviceActivationRequest(buffer_arg) {
  return ttn_broker_broker_pb.DeduplicatedDeviceActivationRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

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

function serialize_handler_DeviceActivationResponse(arg) {
  if (!(arg instanceof ttn_handler_handler_pb.DeviceActivationResponse)) {
    throw new Error('Expected argument of type handler.DeviceActivationResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_handler_DeviceActivationResponse(buffer_arg) {
  return ttn_handler_handler_pb.DeviceActivationResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_networkserver_DevicesRequest(arg) {
  if (!(arg instanceof ttn_networkserver_networkserver_pb.DevicesRequest)) {
    throw new Error('Expected argument of type networkserver.DevicesRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_networkserver_DevicesRequest(buffer_arg) {
  return ttn_networkserver_networkserver_pb.DevicesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_networkserver_DevicesResponse(arg) {
  if (!(arg instanceof ttn_networkserver_networkserver_pb.DevicesResponse)) {
    throw new Error('Expected argument of type networkserver.DevicesResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_networkserver_DevicesResponse(buffer_arg) {
  return ttn_networkserver_networkserver_pb.DevicesResponse.deserializeBinary(new Uint8Array(buffer_arg));
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

function serialize_networkserver_StatusRequest(arg) {
  if (!(arg instanceof ttn_networkserver_networkserver_pb.StatusRequest)) {
    throw new Error('Expected argument of type networkserver.StatusRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_networkserver_StatusRequest(buffer_arg) {
  return ttn_networkserver_networkserver_pb.StatusRequest.deserializeBinary(new Uint8Array(buffer_arg));
}


var NetworkServerService = exports.NetworkServerService = {
  // Broker requests devices with DevAddr and matching FCnt (or disabled FCnt check)
  getDevices: {
    path: '/networkserver.NetworkServer/GetDevices',
    requestStream: false,
    responseStream: false,
    requestType: ttn_networkserver_networkserver_pb.DevicesRequest,
    responseType: ttn_networkserver_networkserver_pb.DevicesResponse,
    requestSerialize: serialize_networkserver_DevicesRequest,
    requestDeserialize: deserialize_networkserver_DevicesRequest,
    responseSerialize: serialize_networkserver_DevicesResponse,
    responseDeserialize: deserialize_networkserver_DevicesResponse,
  },
  // Broker requests device activation "template" from Network Server
  prepareActivation: {
    path: '/networkserver.NetworkServer/PrepareActivation',
    requestStream: false,
    responseStream: false,
    requestType: ttn_broker_broker_pb.DeduplicatedDeviceActivationRequest,
    responseType: ttn_broker_broker_pb.DeduplicatedDeviceActivationRequest,
    requestSerialize: serialize_broker_DeduplicatedDeviceActivationRequest,
    requestDeserialize: deserialize_broker_DeduplicatedDeviceActivationRequest,
    responseSerialize: serialize_broker_DeduplicatedDeviceActivationRequest,
    responseDeserialize: deserialize_broker_DeduplicatedDeviceActivationRequest,
  },
  // Broker confirms device activation (after response from Handler)
  activate: {
    path: '/networkserver.NetworkServer/Activate',
    requestStream: false,
    responseStream: false,
    requestType: ttn_handler_handler_pb.DeviceActivationResponse,
    responseType: ttn_handler_handler_pb.DeviceActivationResponse,
    requestSerialize: serialize_handler_DeviceActivationResponse,
    requestDeserialize: deserialize_handler_DeviceActivationResponse,
    responseSerialize: serialize_handler_DeviceActivationResponse,
    responseDeserialize: deserialize_handler_DeviceActivationResponse,
  },
  // Broker informs Network Server about Uplink
  uplink: {
    path: '/networkserver.NetworkServer/Uplink',
    requestStream: false,
    responseStream: false,
    requestType: ttn_broker_broker_pb.DeduplicatedUplinkMessage,
    responseType: ttn_broker_broker_pb.DeduplicatedUplinkMessage,
    requestSerialize: serialize_broker_DeduplicatedUplinkMessage,
    requestDeserialize: deserialize_broker_DeduplicatedUplinkMessage,
    responseSerialize: serialize_broker_DeduplicatedUplinkMessage,
    responseDeserialize: deserialize_broker_DeduplicatedUplinkMessage,
  },
  // Broker informs Network Server about Downlink, NetworkServer may add MAC commands and re-set MIC
  downlink: {
    path: '/networkserver.NetworkServer/Downlink',
    requestStream: false,
    responseStream: false,
    requestType: ttn_broker_broker_pb.DownlinkMessage,
    responseType: ttn_broker_broker_pb.DownlinkMessage,
    requestSerialize: serialize_broker_DownlinkMessage,
    requestDeserialize: deserialize_broker_DownlinkMessage,
    responseSerialize: serialize_broker_DownlinkMessage,
    responseDeserialize: deserialize_broker_DownlinkMessage,
  },
};

exports.NetworkServerClient = grpc.makeGenericClientConstructor(NetworkServerService);
// The NetworkServerManager service provides configuration and monitoring
// functionality
var NetworkServerManagerService = exports.NetworkServerManagerService = {
  getStatus: {
    path: '/networkserver.NetworkServerManager/GetStatus',
    requestStream: false,
    responseStream: false,
    requestType: ttn_networkserver_networkserver_pb.StatusRequest,
    responseType: ttn_networkserver_networkserver_pb.Status,
    requestSerialize: serialize_networkserver_StatusRequest,
    requestDeserialize: deserialize_networkserver_StatusRequest,
    responseSerialize: serialize_networkserver_Status,
    responseDeserialize: deserialize_networkserver_Status,
  },
};

exports.NetworkServerManagerClient = grpc.makeGenericClientConstructor(NetworkServerManagerService);
