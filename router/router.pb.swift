// DO NOT EDIT.
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: github.com/TheThingsNetwork/api/router/router.proto
//
// For information on using the generated types, please see the documenation:
//   https://github.com/apple/swift-protobuf/

// Copyright © 2017 The Things Network
// Use of this source code is governed by the MIT license that can be found in the LICENSE file.

import Foundation
import SwiftProtobuf

// If the compiler emits an error on this type, it is because this file
// was generated by a version of the `protoc` Swift plug-in that is
// incompatible with the version of SwiftProtobuf to which you are linking.
// Please ensure that your are building against the same version of the API
// that was used to generate this file.
fileprivate struct _GeneratedWithProtocGenSwiftVersion: SwiftProtobuf.ProtobufAPIVersionCheck {
  struct _2: SwiftProtobuf.ProtobufAPIVersion_2 {}
  typealias Version = _2
}

struct Router_SubscribeRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Router_UplinkMessage {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var payload: Data {
    get {return _storage._payload}
    set {_uniqueStorage()._payload = newValue}
  }

  var message: Protocol_Message {
    get {return _storage._message ?? Protocol_Message()}
    set {_uniqueStorage()._message = newValue}
  }
  /// Returns true if `message` has been explicitly set.
  var hasMessage: Bool {return _storage._message != nil}
  /// Clears the value of `message`. Subsequent reads from it will return its default value.
  mutating func clearMessage() {_uniqueStorage()._message = nil}

  var protocolMetadata: Protocol_RxMetadata {
    get {return _storage._protocolMetadata ?? Protocol_RxMetadata()}
    set {_uniqueStorage()._protocolMetadata = newValue}
  }
  /// Returns true if `protocolMetadata` has been explicitly set.
  var hasProtocolMetadata: Bool {return _storage._protocolMetadata != nil}
  /// Clears the value of `protocolMetadata`. Subsequent reads from it will return its default value.
  mutating func clearProtocolMetadata() {_uniqueStorage()._protocolMetadata = nil}

  var gatewayMetadata: Gateway_RxMetadata {
    get {return _storage._gatewayMetadata ?? Gateway_RxMetadata()}
    set {_uniqueStorage()._gatewayMetadata = newValue}
  }
  /// Returns true if `gatewayMetadata` has been explicitly set.
  var hasGatewayMetadata: Bool {return _storage._gatewayMetadata != nil}
  /// Clears the value of `gatewayMetadata`. Subsequent reads from it will return its default value.
  mutating func clearGatewayMetadata() {_uniqueStorage()._gatewayMetadata = nil}

  var trace: Trace_Trace {
    get {return _storage._trace ?? Trace_Trace()}
    set {_uniqueStorage()._trace = newValue}
  }
  /// Returns true if `trace` has been explicitly set.
  var hasTrace: Bool {return _storage._trace != nil}
  /// Clears the value of `trace`. Subsequent reads from it will return its default value.
  mutating func clearTrace() {_uniqueStorage()._trace = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _storage = _StorageClass.defaultInstance
}

struct Router_DownlinkMessage {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var payload: Data {
    get {return _storage._payload}
    set {_uniqueStorage()._payload = newValue}
  }

  var message: Protocol_Message {
    get {return _storage._message ?? Protocol_Message()}
    set {_uniqueStorage()._message = newValue}
  }
  /// Returns true if `message` has been explicitly set.
  var hasMessage: Bool {return _storage._message != nil}
  /// Clears the value of `message`. Subsequent reads from it will return its default value.
  mutating func clearMessage() {_uniqueStorage()._message = nil}

  var protocolConfiguration: Protocol_TxConfiguration {
    get {return _storage._protocolConfiguration ?? Protocol_TxConfiguration()}
    set {_uniqueStorage()._protocolConfiguration = newValue}
  }
  /// Returns true if `protocolConfiguration` has been explicitly set.
  var hasProtocolConfiguration: Bool {return _storage._protocolConfiguration != nil}
  /// Clears the value of `protocolConfiguration`. Subsequent reads from it will return its default value.
  mutating func clearProtocolConfiguration() {_uniqueStorage()._protocolConfiguration = nil}

  var gatewayConfiguration: Gateway_TxConfiguration {
    get {return _storage._gatewayConfiguration ?? Gateway_TxConfiguration()}
    set {_uniqueStorage()._gatewayConfiguration = newValue}
  }
  /// Returns true if `gatewayConfiguration` has been explicitly set.
  var hasGatewayConfiguration: Bool {return _storage._gatewayConfiguration != nil}
  /// Clears the value of `gatewayConfiguration`. Subsequent reads from it will return its default value.
  mutating func clearGatewayConfiguration() {_uniqueStorage()._gatewayConfiguration = nil}

  var trace: Trace_Trace {
    get {return _storage._trace ?? Trace_Trace()}
    set {_uniqueStorage()._trace = newValue}
  }
  /// Returns true if `trace` has been explicitly set.
  var hasTrace: Bool {return _storage._trace != nil}
  /// Clears the value of `trace`. Subsequent reads from it will return its default value.
  mutating func clearTrace() {_uniqueStorage()._trace = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _storage = _StorageClass.defaultInstance
}

struct Router_DeviceActivationRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var payload: Data {
    get {return _storage._payload}
    set {_uniqueStorage()._payload = newValue}
  }

  var message: Protocol_Message {
    get {return _storage._message ?? Protocol_Message()}
    set {_uniqueStorage()._message = newValue}
  }
  /// Returns true if `message` has been explicitly set.
  var hasMessage: Bool {return _storage._message != nil}
  /// Clears the value of `message`. Subsequent reads from it will return its default value.
  mutating func clearMessage() {_uniqueStorage()._message = nil}

  var devEui: Data {
    get {return _storage._devEui}
    set {_uniqueStorage()._devEui = newValue}
  }

  var appEui: Data {
    get {return _storage._appEui}
    set {_uniqueStorage()._appEui = newValue}
  }

  var protocolMetadata: Protocol_RxMetadata {
    get {return _storage._protocolMetadata ?? Protocol_RxMetadata()}
    set {_uniqueStorage()._protocolMetadata = newValue}
  }
  /// Returns true if `protocolMetadata` has been explicitly set.
  var hasProtocolMetadata: Bool {return _storage._protocolMetadata != nil}
  /// Clears the value of `protocolMetadata`. Subsequent reads from it will return its default value.
  mutating func clearProtocolMetadata() {_uniqueStorage()._protocolMetadata = nil}

  var gatewayMetadata: Gateway_RxMetadata {
    get {return _storage._gatewayMetadata ?? Gateway_RxMetadata()}
    set {_uniqueStorage()._gatewayMetadata = newValue}
  }
  /// Returns true if `gatewayMetadata` has been explicitly set.
  var hasGatewayMetadata: Bool {return _storage._gatewayMetadata != nil}
  /// Clears the value of `gatewayMetadata`. Subsequent reads from it will return its default value.
  mutating func clearGatewayMetadata() {_uniqueStorage()._gatewayMetadata = nil}

  var activationMetadata: Protocol_ActivationMetadata {
    get {return _storage._activationMetadata ?? Protocol_ActivationMetadata()}
    set {_uniqueStorage()._activationMetadata = newValue}
  }
  /// Returns true if `activationMetadata` has been explicitly set.
  var hasActivationMetadata: Bool {return _storage._activationMetadata != nil}
  /// Clears the value of `activationMetadata`. Subsequent reads from it will return its default value.
  mutating func clearActivationMetadata() {_uniqueStorage()._activationMetadata = nil}

  var trace: Trace_Trace {
    get {return _storage._trace ?? Trace_Trace()}
    set {_uniqueStorage()._trace = newValue}
  }
  /// Returns true if `trace` has been explicitly set.
  var hasTrace: Bool {return _storage._trace != nil}
  /// Clears the value of `trace`. Subsequent reads from it will return its default value.
  mutating func clearTrace() {_uniqueStorage()._trace = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _storage = _StorageClass.defaultInstance
}

/// NOTE: In LoRaWAN, device activations are accepted with DownlinkMessages, so
/// this message is just an Ack.
///
/// bytes                     payload                 = 1;
/// protocol.Message          message                 = 2;
/// protocol.TxConfiguration  protocol_configuration  = 11;
/// gateway.TxConfiguration   gateway_configuration   = 12;
/// trace.Trace               trace                   = 21;
struct Router_DeviceActivationResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// message GatewayStatusRequest is used to request the status of a gateway from
/// this Router
struct Router_GatewayStatusRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var gatewayID: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Router_GatewayStatusResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var lastSeen: Int64 {
    get {return _storage._lastSeen}
    set {_uniqueStorage()._lastSeen = newValue}
  }

  var status: Gateway_Status {
    get {return _storage._status ?? Gateway_Status()}
    set {_uniqueStorage()._status = newValue}
  }
  /// Returns true if `status` has been explicitly set.
  var hasStatus: Bool {return _storage._status != nil}
  /// Clears the value of `status`. Subsequent reads from it will return its default value.
  mutating func clearStatus() {_uniqueStorage()._status = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _storage = _StorageClass.defaultInstance
}

/// message StatusRequest is used to request the status of this Router
struct Router_StatusRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// message Status is the response to the StatusRequest
struct Router_Status {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var system: Api_SystemStats {
    get {return _storage._system ?? Api_SystemStats()}
    set {_uniqueStorage()._system = newValue}
  }
  /// Returns true if `system` has been explicitly set.
  var hasSystem: Bool {return _storage._system != nil}
  /// Clears the value of `system`. Subsequent reads from it will return its default value.
  mutating func clearSystem() {_uniqueStorage()._system = nil}

  var component: Api_ComponentStats {
    get {return _storage._component ?? Api_ComponentStats()}
    set {_uniqueStorage()._component = newValue}
  }
  /// Returns true if `component` has been explicitly set.
  var hasComponent: Bool {return _storage._component != nil}
  /// Clears the value of `component`. Subsequent reads from it will return its default value.
  mutating func clearComponent() {_uniqueStorage()._component = nil}

  var gatewayStatus: Api_Rates {
    get {return _storage._gatewayStatus ?? Api_Rates()}
    set {_uniqueStorage()._gatewayStatus = newValue}
  }
  /// Returns true if `gatewayStatus` has been explicitly set.
  var hasGatewayStatus: Bool {return _storage._gatewayStatus != nil}
  /// Clears the value of `gatewayStatus`. Subsequent reads from it will return its default value.
  mutating func clearGatewayStatus() {_uniqueStorage()._gatewayStatus = nil}

  var uplink: Api_Rates {
    get {return _storage._uplink ?? Api_Rates()}
    set {_uniqueStorage()._uplink = newValue}
  }
  /// Returns true if `uplink` has been explicitly set.
  var hasUplink: Bool {return _storage._uplink != nil}
  /// Clears the value of `uplink`. Subsequent reads from it will return its default value.
  mutating func clearUplink() {_uniqueStorage()._uplink = nil}

  var downlink: Api_Rates {
    get {return _storage._downlink ?? Api_Rates()}
    set {_uniqueStorage()._downlink = newValue}
  }
  /// Returns true if `downlink` has been explicitly set.
  var hasDownlink: Bool {return _storage._downlink != nil}
  /// Clears the value of `downlink`. Subsequent reads from it will return its default value.
  mutating func clearDownlink() {_uniqueStorage()._downlink = nil}

  var activations: Api_Rates {
    get {return _storage._activations ?? Api_Rates()}
    set {_uniqueStorage()._activations = newValue}
  }
  /// Returns true if `activations` has been explicitly set.
  var hasActivations: Bool {return _storage._activations != nil}
  /// Clears the value of `activations`. Subsequent reads from it will return its default value.
  mutating func clearActivations() {_uniqueStorage()._activations = nil}

  /// Connections
  var connectedGateways: UInt32 {
    get {return _storage._connectedGateways}
    set {_uniqueStorage()._connectedGateways = newValue}
  }

  var connectedBrokers: UInt32 {
    get {return _storage._connectedBrokers}
    set {_uniqueStorage()._connectedBrokers = newValue}
  }

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _storage = _StorageClass.defaultInstance
}

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "router"

extension Router_SubscribeRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".SubscribeRequest"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Router_SubscribeRequest, rhs: Router_SubscribeRequest) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Router_UplinkMessage: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".UplinkMessage"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "payload"),
    2: .same(proto: "message"),
    11: .standard(proto: "protocol_metadata"),
    12: .standard(proto: "gateway_metadata"),
    21: .same(proto: "trace"),
  ]

  fileprivate class _StorageClass {
    var _payload: Data = SwiftProtobuf.Internal.emptyData
    var _message: Protocol_Message? = nil
    var _protocolMetadata: Protocol_RxMetadata? = nil
    var _gatewayMetadata: Gateway_RxMetadata? = nil
    var _trace: Trace_Trace? = nil

    static let defaultInstance = _StorageClass()

    private init() {}

    init(copying source: _StorageClass) {
      _payload = source._payload
      _message = source._message
      _protocolMetadata = source._protocolMetadata
      _gatewayMetadata = source._gatewayMetadata
      _trace = source._trace
    }
  }

  fileprivate mutating func _uniqueStorage() -> _StorageClass {
    if !isKnownUniquelyReferenced(&_storage) {
      _storage = _StorageClass(copying: _storage)
    }
    return _storage
  }

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    _ = _uniqueStorage()
    try withExtendedLifetime(_storage) { (_storage: _StorageClass) in
      while let fieldNumber = try decoder.nextFieldNumber() {
        switch fieldNumber {
        case 1: try decoder.decodeSingularBytesField(value: &_storage._payload)
        case 2: try decoder.decodeSingularMessageField(value: &_storage._message)
        case 11: try decoder.decodeSingularMessageField(value: &_storage._protocolMetadata)
        case 12: try decoder.decodeSingularMessageField(value: &_storage._gatewayMetadata)
        case 21: try decoder.decodeSingularMessageField(value: &_storage._trace)
        default: break
        }
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try withExtendedLifetime(_storage) { (_storage: _StorageClass) in
      if !_storage._payload.isEmpty {
        try visitor.visitSingularBytesField(value: _storage._payload, fieldNumber: 1)
      }
      if let v = _storage._message {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
      }
      if let v = _storage._protocolMetadata {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 11)
      }
      if let v = _storage._gatewayMetadata {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 12)
      }
      if let v = _storage._trace {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 21)
      }
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Router_UplinkMessage, rhs: Router_UplinkMessage) -> Bool {
    if lhs._storage !== rhs._storage {
      let storagesAreEqual: Bool = withExtendedLifetime((lhs._storage, rhs._storage)) { (_args: (_StorageClass, _StorageClass)) in
        let _storage = _args.0
        let rhs_storage = _args.1
        if _storage._payload != rhs_storage._payload {return false}
        if _storage._message != rhs_storage._message {return false}
        if _storage._protocolMetadata != rhs_storage._protocolMetadata {return false}
        if _storage._gatewayMetadata != rhs_storage._gatewayMetadata {return false}
        if _storage._trace != rhs_storage._trace {return false}
        return true
      }
      if !storagesAreEqual {return false}
    }
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Router_DownlinkMessage: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".DownlinkMessage"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "payload"),
    2: .same(proto: "message"),
    11: .standard(proto: "protocol_configuration"),
    12: .standard(proto: "gateway_configuration"),
    21: .same(proto: "trace"),
  ]

  fileprivate class _StorageClass {
    var _payload: Data = SwiftProtobuf.Internal.emptyData
    var _message: Protocol_Message? = nil
    var _protocolConfiguration: Protocol_TxConfiguration? = nil
    var _gatewayConfiguration: Gateway_TxConfiguration? = nil
    var _trace: Trace_Trace? = nil

    static let defaultInstance = _StorageClass()

    private init() {}

    init(copying source: _StorageClass) {
      _payload = source._payload
      _message = source._message
      _protocolConfiguration = source._protocolConfiguration
      _gatewayConfiguration = source._gatewayConfiguration
      _trace = source._trace
    }
  }

  fileprivate mutating func _uniqueStorage() -> _StorageClass {
    if !isKnownUniquelyReferenced(&_storage) {
      _storage = _StorageClass(copying: _storage)
    }
    return _storage
  }

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    _ = _uniqueStorage()
    try withExtendedLifetime(_storage) { (_storage: _StorageClass) in
      while let fieldNumber = try decoder.nextFieldNumber() {
        switch fieldNumber {
        case 1: try decoder.decodeSingularBytesField(value: &_storage._payload)
        case 2: try decoder.decodeSingularMessageField(value: &_storage._message)
        case 11: try decoder.decodeSingularMessageField(value: &_storage._protocolConfiguration)
        case 12: try decoder.decodeSingularMessageField(value: &_storage._gatewayConfiguration)
        case 21: try decoder.decodeSingularMessageField(value: &_storage._trace)
        default: break
        }
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try withExtendedLifetime(_storage) { (_storage: _StorageClass) in
      if !_storage._payload.isEmpty {
        try visitor.visitSingularBytesField(value: _storage._payload, fieldNumber: 1)
      }
      if let v = _storage._message {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
      }
      if let v = _storage._protocolConfiguration {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 11)
      }
      if let v = _storage._gatewayConfiguration {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 12)
      }
      if let v = _storage._trace {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 21)
      }
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Router_DownlinkMessage, rhs: Router_DownlinkMessage) -> Bool {
    if lhs._storage !== rhs._storage {
      let storagesAreEqual: Bool = withExtendedLifetime((lhs._storage, rhs._storage)) { (_args: (_StorageClass, _StorageClass)) in
        let _storage = _args.0
        let rhs_storage = _args.1
        if _storage._payload != rhs_storage._payload {return false}
        if _storage._message != rhs_storage._message {return false}
        if _storage._protocolConfiguration != rhs_storage._protocolConfiguration {return false}
        if _storage._gatewayConfiguration != rhs_storage._gatewayConfiguration {return false}
        if _storage._trace != rhs_storage._trace {return false}
        return true
      }
      if !storagesAreEqual {return false}
    }
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Router_DeviceActivationRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".DeviceActivationRequest"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "payload"),
    2: .same(proto: "message"),
    11: .standard(proto: "dev_eui"),
    12: .standard(proto: "app_eui"),
    21: .standard(proto: "protocol_metadata"),
    22: .standard(proto: "gateway_metadata"),
    23: .standard(proto: "activation_metadata"),
    31: .same(proto: "trace"),
  ]

  fileprivate class _StorageClass {
    var _payload: Data = SwiftProtobuf.Internal.emptyData
    var _message: Protocol_Message? = nil
    var _devEui: Data = SwiftProtobuf.Internal.emptyData
    var _appEui: Data = SwiftProtobuf.Internal.emptyData
    var _protocolMetadata: Protocol_RxMetadata? = nil
    var _gatewayMetadata: Gateway_RxMetadata? = nil
    var _activationMetadata: Protocol_ActivationMetadata? = nil
    var _trace: Trace_Trace? = nil

    static let defaultInstance = _StorageClass()

    private init() {}

    init(copying source: _StorageClass) {
      _payload = source._payload
      _message = source._message
      _devEui = source._devEui
      _appEui = source._appEui
      _protocolMetadata = source._protocolMetadata
      _gatewayMetadata = source._gatewayMetadata
      _activationMetadata = source._activationMetadata
      _trace = source._trace
    }
  }

  fileprivate mutating func _uniqueStorage() -> _StorageClass {
    if !isKnownUniquelyReferenced(&_storage) {
      _storage = _StorageClass(copying: _storage)
    }
    return _storage
  }

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    _ = _uniqueStorage()
    try withExtendedLifetime(_storage) { (_storage: _StorageClass) in
      while let fieldNumber = try decoder.nextFieldNumber() {
        switch fieldNumber {
        case 1: try decoder.decodeSingularBytesField(value: &_storage._payload)
        case 2: try decoder.decodeSingularMessageField(value: &_storage._message)
        case 11: try decoder.decodeSingularBytesField(value: &_storage._devEui)
        case 12: try decoder.decodeSingularBytesField(value: &_storage._appEui)
        case 21: try decoder.decodeSingularMessageField(value: &_storage._protocolMetadata)
        case 22: try decoder.decodeSingularMessageField(value: &_storage._gatewayMetadata)
        case 23: try decoder.decodeSingularMessageField(value: &_storage._activationMetadata)
        case 31: try decoder.decodeSingularMessageField(value: &_storage._trace)
        default: break
        }
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try withExtendedLifetime(_storage) { (_storage: _StorageClass) in
      if !_storage._payload.isEmpty {
        try visitor.visitSingularBytesField(value: _storage._payload, fieldNumber: 1)
      }
      if let v = _storage._message {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
      }
      if !_storage._devEui.isEmpty {
        try visitor.visitSingularBytesField(value: _storage._devEui, fieldNumber: 11)
      }
      if !_storage._appEui.isEmpty {
        try visitor.visitSingularBytesField(value: _storage._appEui, fieldNumber: 12)
      }
      if let v = _storage._protocolMetadata {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 21)
      }
      if let v = _storage._gatewayMetadata {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 22)
      }
      if let v = _storage._activationMetadata {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 23)
      }
      if let v = _storage._trace {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 31)
      }
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Router_DeviceActivationRequest, rhs: Router_DeviceActivationRequest) -> Bool {
    if lhs._storage !== rhs._storage {
      let storagesAreEqual: Bool = withExtendedLifetime((lhs._storage, rhs._storage)) { (_args: (_StorageClass, _StorageClass)) in
        let _storage = _args.0
        let rhs_storage = _args.1
        if _storage._payload != rhs_storage._payload {return false}
        if _storage._message != rhs_storage._message {return false}
        if _storage._devEui != rhs_storage._devEui {return false}
        if _storage._appEui != rhs_storage._appEui {return false}
        if _storage._protocolMetadata != rhs_storage._protocolMetadata {return false}
        if _storage._gatewayMetadata != rhs_storage._gatewayMetadata {return false}
        if _storage._activationMetadata != rhs_storage._activationMetadata {return false}
        if _storage._trace != rhs_storage._trace {return false}
        return true
      }
      if !storagesAreEqual {return false}
    }
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Router_DeviceActivationResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".DeviceActivationResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Router_DeviceActivationResponse, rhs: Router_DeviceActivationResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Router_GatewayStatusRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".GatewayStatusRequest"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "gateway_id"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      switch fieldNumber {
      case 1: try decoder.decodeSingularStringField(value: &self.gatewayID)
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.gatewayID.isEmpty {
      try visitor.visitSingularStringField(value: self.gatewayID, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Router_GatewayStatusRequest, rhs: Router_GatewayStatusRequest) -> Bool {
    if lhs.gatewayID != rhs.gatewayID {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Router_GatewayStatusResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".GatewayStatusResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "last_seen"),
    2: .same(proto: "status"),
  ]

  fileprivate class _StorageClass {
    var _lastSeen: Int64 = 0
    var _status: Gateway_Status? = nil

    static let defaultInstance = _StorageClass()

    private init() {}

    init(copying source: _StorageClass) {
      _lastSeen = source._lastSeen
      _status = source._status
    }
  }

  fileprivate mutating func _uniqueStorage() -> _StorageClass {
    if !isKnownUniquelyReferenced(&_storage) {
      _storage = _StorageClass(copying: _storage)
    }
    return _storage
  }

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    _ = _uniqueStorage()
    try withExtendedLifetime(_storage) { (_storage: _StorageClass) in
      while let fieldNumber = try decoder.nextFieldNumber() {
        switch fieldNumber {
        case 1: try decoder.decodeSingularInt64Field(value: &_storage._lastSeen)
        case 2: try decoder.decodeSingularMessageField(value: &_storage._status)
        default: break
        }
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try withExtendedLifetime(_storage) { (_storage: _StorageClass) in
      if _storage._lastSeen != 0 {
        try visitor.visitSingularInt64Field(value: _storage._lastSeen, fieldNumber: 1)
      }
      if let v = _storage._status {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
      }
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Router_GatewayStatusResponse, rhs: Router_GatewayStatusResponse) -> Bool {
    if lhs._storage !== rhs._storage {
      let storagesAreEqual: Bool = withExtendedLifetime((lhs._storage, rhs._storage)) { (_args: (_StorageClass, _StorageClass)) in
        let _storage = _args.0
        let rhs_storage = _args.1
        if _storage._lastSeen != rhs_storage._lastSeen {return false}
        if _storage._status != rhs_storage._status {return false}
        return true
      }
      if !storagesAreEqual {return false}
    }
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Router_StatusRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".StatusRequest"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Router_StatusRequest, rhs: Router_StatusRequest) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Router_Status: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Status"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "system"),
    2: .same(proto: "component"),
    11: .standard(proto: "gateway_status"),
    12: .same(proto: "uplink"),
    13: .same(proto: "downlink"),
    14: .same(proto: "activations"),
    21: .standard(proto: "connected_gateways"),
    22: .standard(proto: "connected_brokers"),
  ]

  fileprivate class _StorageClass {
    var _system: Api_SystemStats? = nil
    var _component: Api_ComponentStats? = nil
    var _gatewayStatus: Api_Rates? = nil
    var _uplink: Api_Rates? = nil
    var _downlink: Api_Rates? = nil
    var _activations: Api_Rates? = nil
    var _connectedGateways: UInt32 = 0
    var _connectedBrokers: UInt32 = 0

    static let defaultInstance = _StorageClass()

    private init() {}

    init(copying source: _StorageClass) {
      _system = source._system
      _component = source._component
      _gatewayStatus = source._gatewayStatus
      _uplink = source._uplink
      _downlink = source._downlink
      _activations = source._activations
      _connectedGateways = source._connectedGateways
      _connectedBrokers = source._connectedBrokers
    }
  }

  fileprivate mutating func _uniqueStorage() -> _StorageClass {
    if !isKnownUniquelyReferenced(&_storage) {
      _storage = _StorageClass(copying: _storage)
    }
    return _storage
  }

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    _ = _uniqueStorage()
    try withExtendedLifetime(_storage) { (_storage: _StorageClass) in
      while let fieldNumber = try decoder.nextFieldNumber() {
        switch fieldNumber {
        case 1: try decoder.decodeSingularMessageField(value: &_storage._system)
        case 2: try decoder.decodeSingularMessageField(value: &_storage._component)
        case 11: try decoder.decodeSingularMessageField(value: &_storage._gatewayStatus)
        case 12: try decoder.decodeSingularMessageField(value: &_storage._uplink)
        case 13: try decoder.decodeSingularMessageField(value: &_storage._downlink)
        case 14: try decoder.decodeSingularMessageField(value: &_storage._activations)
        case 21: try decoder.decodeSingularUInt32Field(value: &_storage._connectedGateways)
        case 22: try decoder.decodeSingularUInt32Field(value: &_storage._connectedBrokers)
        default: break
        }
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try withExtendedLifetime(_storage) { (_storage: _StorageClass) in
      if let v = _storage._system {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
      }
      if let v = _storage._component {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
      }
      if let v = _storage._gatewayStatus {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 11)
      }
      if let v = _storage._uplink {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 12)
      }
      if let v = _storage._downlink {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 13)
      }
      if let v = _storage._activations {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 14)
      }
      if _storage._connectedGateways != 0 {
        try visitor.visitSingularUInt32Field(value: _storage._connectedGateways, fieldNumber: 21)
      }
      if _storage._connectedBrokers != 0 {
        try visitor.visitSingularUInt32Field(value: _storage._connectedBrokers, fieldNumber: 22)
      }
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Router_Status, rhs: Router_Status) -> Bool {
    if lhs._storage !== rhs._storage {
      let storagesAreEqual: Bool = withExtendedLifetime((lhs._storage, rhs._storage)) { (_args: (_StorageClass, _StorageClass)) in
        let _storage = _args.0
        let rhs_storage = _args.1
        if _storage._system != rhs_storage._system {return false}
        if _storage._component != rhs_storage._component {return false}
        if _storage._gatewayStatus != rhs_storage._gatewayStatus {return false}
        if _storage._uplink != rhs_storage._uplink {return false}
        if _storage._downlink != rhs_storage._downlink {return false}
        if _storage._activations != rhs_storage._activations {return false}
        if _storage._connectedGateways != rhs_storage._connectedGateways {return false}
        if _storage._connectedBrokers != rhs_storage._connectedBrokers {return false}
        return true
      }
      if !storagesAreEqual {return false}
    }
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
