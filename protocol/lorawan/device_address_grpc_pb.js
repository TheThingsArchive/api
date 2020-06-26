// GENERATED CODE -- DO NOT EDIT!

// Original file comments:
// Copyright © 2017 The Things Network
// Use of this source code is governed by the MIT license that can be found in the LICENSE file.
//
'use strict';
var grpc = require('grpc');
var ttn_protocol_lorawan_device_address_pb = require('../../protocol/lorawan/device_address_pb.js');


function serialize_lorawan_DevAddrRequest(arg) {
  if (!(arg instanceof ttn_protocol_lorawan_device_address_pb.DevAddrRequest)) {
    throw new Error('Expected argument of type lorawan.DevAddrRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_lorawan_DevAddrRequest(buffer_arg) {
  return ttn_protocol_lorawan_device_address_pb.DevAddrRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lorawan_DevAddrResponse(arg) {
  if (!(arg instanceof ttn_protocol_lorawan_device_address_pb.DevAddrResponse)) {
    throw new Error('Expected argument of type lorawan.DevAddrResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_lorawan_DevAddrResponse(buffer_arg) {
  return ttn_protocol_lorawan_device_address_pb.DevAddrResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lorawan_PrefixesRequest(arg) {
  if (!(arg instanceof ttn_protocol_lorawan_device_address_pb.PrefixesRequest)) {
    throw new Error('Expected argument of type lorawan.PrefixesRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_lorawan_PrefixesRequest(buffer_arg) {
  return ttn_protocol_lorawan_device_address_pb.PrefixesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lorawan_PrefixesResponse(arg) {
  if (!(arg instanceof ttn_protocol_lorawan_device_address_pb.PrefixesResponse)) {
    throw new Error('Expected argument of type lorawan.PrefixesResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_lorawan_PrefixesResponse(buffer_arg) {
  return ttn_protocol_lorawan_device_address_pb.PrefixesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// The Device Addresses in the network are issued by the NetworkServer
var DevAddrManagerService = exports.DevAddrManagerService = {
  // Get all prefixes that are in use or available
  getPrefixes: {
    path: '/lorawan.DevAddrManager/GetPrefixes',
    requestStream: false,
    responseStream: false,
    requestType: ttn_protocol_lorawan_device_address_pb.PrefixesRequest,
    responseType: ttn_protocol_lorawan_device_address_pb.PrefixesResponse,
    requestSerialize: serialize_lorawan_PrefixesRequest,
    requestDeserialize: deserialize_lorawan_PrefixesRequest,
    responseSerialize: serialize_lorawan_PrefixesResponse,
    responseDeserialize: deserialize_lorawan_PrefixesResponse,
  },
  // Request a device address
  getDevAddr: {
    path: '/lorawan.DevAddrManager/GetDevAddr',
    requestStream: false,
    responseStream: false,
    requestType: ttn_protocol_lorawan_device_address_pb.DevAddrRequest,
    responseType: ttn_protocol_lorawan_device_address_pb.DevAddrResponse,
    requestSerialize: serialize_lorawan_DevAddrRequest,
    requestDeserialize: deserialize_lorawan_DevAddrRequest,
    responseSerialize: serialize_lorawan_DevAddrResponse,
    responseDeserialize: deserialize_lorawan_DevAddrResponse,
  },
};

exports.DevAddrManagerClient = grpc.makeGenericClientConstructor(DevAddrManagerService);
