# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: github.com/TheThingsNetwork/api/router/router.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2

from github_com.TheThingsNetwork.api import api_pb2 as github_dot_com_dot_TheThingsNetwork_dot_api_dot_api__pb2
from github_com.TheThingsNetwork.api.protocol import protocol_pb2 as github_dot_com_dot_TheThingsNetwork_dot_api_dot_protocol_dot_protocol__pb2
from github_com.TheThingsNetwork.api.gateway import gateway_pb2 as github_dot_com_dot_TheThingsNetwork_dot_api_dot_gateway_dot_gateway__pb2
from github_com.TheThingsNetwork.api.trace import trace_pb2 as github_dot_com_dot_TheThingsNetwork_dot_api_dot_trace_dot_trace__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='github.com/TheThingsNetwork/api/router/router.proto',
  package='router',
  syntax='proto3',
  serialized_options=b'\n\037org.thethingsnetwork.api.routerB\013RouterProtoP\001Z&github.com/TheThingsNetwork/api/router\252\002\033TheThingsNetwork.API.Router',
  serialized_pb=b'\n3github.com/TheThingsNetwork/api/router/router.proto\x12\x06router\x1a\x1bgoogle/protobuf/empty.proto\x1a-github.com/gogo/protobuf/gogoproto/gogo.proto\x1a)github.com/TheThingsNetwork/api/api.proto\x1a\x37github.com/TheThingsNetwork/api/protocol/protocol.proto\x1a\x35github.com/TheThingsNetwork/api/gateway/gateway.proto\x1a\x31github.com/TheThingsNetwork/api/trace/trace.proto\"\x12\n\x10SubscribeRequest\"\xcd\x01\n\rUplinkMessage\x12\x0f\n\x07payload\x18\x01 \x01(\x0c\x12\"\n\x07message\x18\x02 \x01(\x0b\x32\x11.protocol.Message\x12\x35\n\x11protocol_metadata\x18\x0b \x01(\x0b\x32\x14.protocol.RxMetadataB\x04\xc8\xde\x1f\x00\x12\x33\n\x10gateway_metadata\x18\x0c \x01(\x0b\x32\x13.gateway.RxMetadataB\x04\xc8\xde\x1f\x00\x12\x1b\n\x05trace\x18\x15 \x01(\x0b\x32\x0c.trace.Trace\"\xe3\x01\n\x0f\x44ownlinkMessage\x12\x0f\n\x07payload\x18\x01 \x01(\x0c\x12\"\n\x07message\x18\x02 \x01(\x0b\x32\x11.protocol.Message\x12?\n\x16protocol_configuration\x18\x0b \x01(\x0b\x32\x19.protocol.TxConfigurationB\x04\xc8\xde\x1f\x00\x12=\n\x15gateway_configuration\x18\x0c \x01(\x0b\x32\x18.gateway.TxConfigurationB\x04\xc8\xde\x1f\x00\x12\x1b\n\x05trace\x18\x15 \x01(\x0b\x32\x0c.trace.Trace\"\xbe\x03\n\x17\x44\x65viceActivationRequest\x12\x0f\n\x07payload\x18\x01 \x01(\x0c\x12\"\n\x07message\x18\x02 \x01(\x0b\x32\x11.protocol.Message\x12T\n\x07\x64\x65v_eui\x18\x0b \x01(\x0c\x42\x43\xe2\xde\x1f\x06\x44\x65vEUI\xc8\xde\x1f\x00\xda\xde\x1f\x31github.com/TheThingsNetwork/ttn/core/types.DevEUI\x12T\n\x07\x61pp_eui\x18\x0c \x01(\x0c\x42\x43\xe2\xde\x1f\x06\x41ppEUI\xc8\xde\x1f\x00\xda\xde\x1f\x31github.com/TheThingsNetwork/ttn/core/types.AppEUI\x12\x35\n\x11protocol_metadata\x18\x15 \x01(\x0b\x32\x14.protocol.RxMetadataB\x04\xc8\xde\x1f\x00\x12\x33\n\x10gateway_metadata\x18\x16 \x01(\x0b\x32\x13.gateway.RxMetadataB\x04\xc8\xde\x1f\x00\x12\x39\n\x13\x61\x63tivation_metadata\x18\x17 \x01(\x0b\x32\x1c.protocol.ActivationMetadata\x12\x1b\n\x05trace\x18\x1f \x01(\x0b\x32\x0c.trace.Trace\"\x1a\n\x18\x44\x65viceActivationResponse\"9\n\x14GatewayStatusRequest\x12!\n\ngateway_id\x18\x01 \x01(\tB\r\xe2\xde\x1f\tGatewayID\"Q\n\x15GatewayStatusResponse\x12\x11\n\tlast_seen\x18\x01 \x01(\x03\x12%\n\x06status\x18\x02 \x01(\x0b\x32\x0f.gateway.StatusB\x04\xc8\xde\x1f\x00\"\x0f\n\rStatusRequest\"\x88\x02\n\x06Status\x12 \n\x06system\x18\x01 \x01(\x0b\x32\x10.api.SystemStats\x12&\n\tcomponent\x18\x02 \x01(\x0b\x32\x13.api.ComponentStats\x12\"\n\x0egateway_status\x18\x0b \x01(\x0b\x32\n.api.Rates\x12\x1a\n\x06uplink\x18\x0c \x01(\x0b\x32\n.api.Rates\x12\x1c\n\x08\x64ownlink\x18\r \x01(\x0b\x32\n.api.Rates\x12\x1f\n\x0b\x61\x63tivations\x18\x0e \x01(\x0b\x32\n.api.Rates\x12\x1a\n\x12\x63onnected_gateways\x18\x15 \x01(\r\x12\x19\n\x11\x63onnected_brokers\x18\x16 \x01(\r2\x90\x02\n\x06Router\x12:\n\rGatewayStatus\x12\x0f.gateway.Status\x1a\x16.google.protobuf.Empty(\x01\x12\x39\n\x06Uplink\x12\x15.router.UplinkMessage\x1a\x16.google.protobuf.Empty(\x01\x12@\n\tSubscribe\x12\x18.router.SubscribeRequest\x1a\x17.router.DownlinkMessage0\x01\x12M\n\x08\x41\x63tivate\x12\x1f.router.DeviceActivationRequest\x1a .router.DeviceActivationResponse2\x91\x01\n\rRouterManager\x12L\n\rGatewayStatus\x12\x1c.router.GatewayStatusRequest\x1a\x1d.router.GatewayStatusResponse\x12\x32\n\tGetStatus\x12\x15.router.StatusRequest\x1a\x0e.router.StatusBv\n\x1forg.thethingsnetwork.api.routerB\x0bRouterProtoP\x01Z&github.com/TheThingsNetwork/api/router\xaa\x02\x1bTheThingsNetwork.API.Routerb\x06proto3'
  ,
  dependencies=[google_dot_protobuf_dot_empty__pb2.DESCRIPTOR,github_dot_com_dot_TheThingsNetwork_dot_api_dot_api__pb2.DESCRIPTOR,github_dot_com_dot_TheThingsNetwork_dot_api_dot_protocol_dot_protocol__pb2.DESCRIPTOR,github_dot_com_dot_TheThingsNetwork_dot_api_dot_gateway_dot_gateway__pb2.DESCRIPTOR,github_dot_com_dot_TheThingsNetwork_dot_api_dot_trace_dot_trace__pb2.DESCRIPTOR,])




_SUBSCRIBEREQUEST = _descriptor.Descriptor(
  name='SubscribeRequest',
  full_name='router.SubscribeRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=345,
  serialized_end=363,
)


_UPLINKMESSAGE = _descriptor.Descriptor(
  name='UplinkMessage',
  full_name='router.UplinkMessage',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='payload', full_name='router.UplinkMessage.payload', index=0,
      number=1, type=12, cpp_type=9, label=1,
      has_default_value=False, default_value=b"",
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='message', full_name='router.UplinkMessage.message', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='protocol_metadata', full_name='router.UplinkMessage.protocol_metadata', index=2,
      number=11, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\310\336\037\000', file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='gateway_metadata', full_name='router.UplinkMessage.gateway_metadata', index=3,
      number=12, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\310\336\037\000', file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='trace', full_name='router.UplinkMessage.trace', index=4,
      number=21, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=366,
  serialized_end=571,
)


_DOWNLINKMESSAGE = _descriptor.Descriptor(
  name='DownlinkMessage',
  full_name='router.DownlinkMessage',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='payload', full_name='router.DownlinkMessage.payload', index=0,
      number=1, type=12, cpp_type=9, label=1,
      has_default_value=False, default_value=b"",
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='message', full_name='router.DownlinkMessage.message', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='protocol_configuration', full_name='router.DownlinkMessage.protocol_configuration', index=2,
      number=11, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\310\336\037\000', file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='gateway_configuration', full_name='router.DownlinkMessage.gateway_configuration', index=3,
      number=12, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\310\336\037\000', file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='trace', full_name='router.DownlinkMessage.trace', index=4,
      number=21, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=574,
  serialized_end=801,
)


_DEVICEACTIVATIONREQUEST = _descriptor.Descriptor(
  name='DeviceActivationRequest',
  full_name='router.DeviceActivationRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='payload', full_name='router.DeviceActivationRequest.payload', index=0,
      number=1, type=12, cpp_type=9, label=1,
      has_default_value=False, default_value=b"",
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='message', full_name='router.DeviceActivationRequest.message', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='dev_eui', full_name='router.DeviceActivationRequest.dev_eui', index=2,
      number=11, type=12, cpp_type=9, label=1,
      has_default_value=False, default_value=b"",
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\336\037\006DevEUI\310\336\037\000\332\336\0371github.com/TheThingsNetwork/ttn/core/types.DevEUI', file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='app_eui', full_name='router.DeviceActivationRequest.app_eui', index=3,
      number=12, type=12, cpp_type=9, label=1,
      has_default_value=False, default_value=b"",
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\336\037\006AppEUI\310\336\037\000\332\336\0371github.com/TheThingsNetwork/ttn/core/types.AppEUI', file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='protocol_metadata', full_name='router.DeviceActivationRequest.protocol_metadata', index=4,
      number=21, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\310\336\037\000', file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='gateway_metadata', full_name='router.DeviceActivationRequest.gateway_metadata', index=5,
      number=22, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\310\336\037\000', file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='activation_metadata', full_name='router.DeviceActivationRequest.activation_metadata', index=6,
      number=23, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='trace', full_name='router.DeviceActivationRequest.trace', index=7,
      number=31, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=804,
  serialized_end=1250,
)


_DEVICEACTIVATIONRESPONSE = _descriptor.Descriptor(
  name='DeviceActivationResponse',
  full_name='router.DeviceActivationResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1252,
  serialized_end=1278,
)


_GATEWAYSTATUSREQUEST = _descriptor.Descriptor(
  name='GatewayStatusRequest',
  full_name='router.GatewayStatusRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='gateway_id', full_name='router.GatewayStatusRequest.gateway_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\336\037\tGatewayID', file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1280,
  serialized_end=1337,
)


_GATEWAYSTATUSRESPONSE = _descriptor.Descriptor(
  name='GatewayStatusResponse',
  full_name='router.GatewayStatusResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='last_seen', full_name='router.GatewayStatusResponse.last_seen', index=0,
      number=1, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='status', full_name='router.GatewayStatusResponse.status', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\310\336\037\000', file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1339,
  serialized_end=1420,
)


_STATUSREQUEST = _descriptor.Descriptor(
  name='StatusRequest',
  full_name='router.StatusRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1422,
  serialized_end=1437,
)


_STATUS = _descriptor.Descriptor(
  name='Status',
  full_name='router.Status',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='system', full_name='router.Status.system', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='component', full_name='router.Status.component', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='gateway_status', full_name='router.Status.gateway_status', index=2,
      number=11, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='uplink', full_name='router.Status.uplink', index=3,
      number=12, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='downlink', full_name='router.Status.downlink', index=4,
      number=13, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='activations', full_name='router.Status.activations', index=5,
      number=14, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='connected_gateways', full_name='router.Status.connected_gateways', index=6,
      number=21, type=13, cpp_type=3, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='connected_brokers', full_name='router.Status.connected_brokers', index=7,
      number=22, type=13, cpp_type=3, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1440,
  serialized_end=1704,
)

_UPLINKMESSAGE.fields_by_name['message'].message_type = github_dot_com_dot_TheThingsNetwork_dot_api_dot_protocol_dot_protocol__pb2._MESSAGE
_UPLINKMESSAGE.fields_by_name['protocol_metadata'].message_type = github_dot_com_dot_TheThingsNetwork_dot_api_dot_protocol_dot_protocol__pb2._RXMETADATA
_UPLINKMESSAGE.fields_by_name['gateway_metadata'].message_type = github_dot_com_dot_TheThingsNetwork_dot_api_dot_gateway_dot_gateway__pb2._RXMETADATA
_UPLINKMESSAGE.fields_by_name['trace'].message_type = github_dot_com_dot_TheThingsNetwork_dot_api_dot_trace_dot_trace__pb2._TRACE
_DOWNLINKMESSAGE.fields_by_name['message'].message_type = github_dot_com_dot_TheThingsNetwork_dot_api_dot_protocol_dot_protocol__pb2._MESSAGE
_DOWNLINKMESSAGE.fields_by_name['protocol_configuration'].message_type = github_dot_com_dot_TheThingsNetwork_dot_api_dot_protocol_dot_protocol__pb2._TXCONFIGURATION
_DOWNLINKMESSAGE.fields_by_name['gateway_configuration'].message_type = github_dot_com_dot_TheThingsNetwork_dot_api_dot_gateway_dot_gateway__pb2._TXCONFIGURATION
_DOWNLINKMESSAGE.fields_by_name['trace'].message_type = github_dot_com_dot_TheThingsNetwork_dot_api_dot_trace_dot_trace__pb2._TRACE
_DEVICEACTIVATIONREQUEST.fields_by_name['message'].message_type = github_dot_com_dot_TheThingsNetwork_dot_api_dot_protocol_dot_protocol__pb2._MESSAGE
_DEVICEACTIVATIONREQUEST.fields_by_name['protocol_metadata'].message_type = github_dot_com_dot_TheThingsNetwork_dot_api_dot_protocol_dot_protocol__pb2._RXMETADATA
_DEVICEACTIVATIONREQUEST.fields_by_name['gateway_metadata'].message_type = github_dot_com_dot_TheThingsNetwork_dot_api_dot_gateway_dot_gateway__pb2._RXMETADATA
_DEVICEACTIVATIONREQUEST.fields_by_name['activation_metadata'].message_type = github_dot_com_dot_TheThingsNetwork_dot_api_dot_protocol_dot_protocol__pb2._ACTIVATIONMETADATA
_DEVICEACTIVATIONREQUEST.fields_by_name['trace'].message_type = github_dot_com_dot_TheThingsNetwork_dot_api_dot_trace_dot_trace__pb2._TRACE
_GATEWAYSTATUSRESPONSE.fields_by_name['status'].message_type = github_dot_com_dot_TheThingsNetwork_dot_api_dot_gateway_dot_gateway__pb2._STATUS
_STATUS.fields_by_name['system'].message_type = github_dot_com_dot_TheThingsNetwork_dot_api_dot_api__pb2._SYSTEMSTATS
_STATUS.fields_by_name['component'].message_type = github_dot_com_dot_TheThingsNetwork_dot_api_dot_api__pb2._COMPONENTSTATS
_STATUS.fields_by_name['gateway_status'].message_type = github_dot_com_dot_TheThingsNetwork_dot_api_dot_api__pb2._RATES
_STATUS.fields_by_name['uplink'].message_type = github_dot_com_dot_TheThingsNetwork_dot_api_dot_api__pb2._RATES
_STATUS.fields_by_name['downlink'].message_type = github_dot_com_dot_TheThingsNetwork_dot_api_dot_api__pb2._RATES
_STATUS.fields_by_name['activations'].message_type = github_dot_com_dot_TheThingsNetwork_dot_api_dot_api__pb2._RATES
DESCRIPTOR.message_types_by_name['SubscribeRequest'] = _SUBSCRIBEREQUEST
DESCRIPTOR.message_types_by_name['UplinkMessage'] = _UPLINKMESSAGE
DESCRIPTOR.message_types_by_name['DownlinkMessage'] = _DOWNLINKMESSAGE
DESCRIPTOR.message_types_by_name['DeviceActivationRequest'] = _DEVICEACTIVATIONREQUEST
DESCRIPTOR.message_types_by_name['DeviceActivationResponse'] = _DEVICEACTIVATIONRESPONSE
DESCRIPTOR.message_types_by_name['GatewayStatusRequest'] = _GATEWAYSTATUSREQUEST
DESCRIPTOR.message_types_by_name['GatewayStatusResponse'] = _GATEWAYSTATUSRESPONSE
DESCRIPTOR.message_types_by_name['StatusRequest'] = _STATUSREQUEST
DESCRIPTOR.message_types_by_name['Status'] = _STATUS
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

SubscribeRequest = _reflection.GeneratedProtocolMessageType('SubscribeRequest', (_message.Message,), {
  'DESCRIPTOR' : _SUBSCRIBEREQUEST,
  '__module__' : 'github.com.TheThingsNetwork.api.router.router_pb2'
  # @@protoc_insertion_point(class_scope:router.SubscribeRequest)
  })
_sym_db.RegisterMessage(SubscribeRequest)

UplinkMessage = _reflection.GeneratedProtocolMessageType('UplinkMessage', (_message.Message,), {
  'DESCRIPTOR' : _UPLINKMESSAGE,
  '__module__' : 'github.com.TheThingsNetwork.api.router.router_pb2'
  # @@protoc_insertion_point(class_scope:router.UplinkMessage)
  })
_sym_db.RegisterMessage(UplinkMessage)

DownlinkMessage = _reflection.GeneratedProtocolMessageType('DownlinkMessage', (_message.Message,), {
  'DESCRIPTOR' : _DOWNLINKMESSAGE,
  '__module__' : 'github.com.TheThingsNetwork.api.router.router_pb2'
  # @@protoc_insertion_point(class_scope:router.DownlinkMessage)
  })
_sym_db.RegisterMessage(DownlinkMessage)

DeviceActivationRequest = _reflection.GeneratedProtocolMessageType('DeviceActivationRequest', (_message.Message,), {
  'DESCRIPTOR' : _DEVICEACTIVATIONREQUEST,
  '__module__' : 'github.com.TheThingsNetwork.api.router.router_pb2'
  # @@protoc_insertion_point(class_scope:router.DeviceActivationRequest)
  })
_sym_db.RegisterMessage(DeviceActivationRequest)

DeviceActivationResponse = _reflection.GeneratedProtocolMessageType('DeviceActivationResponse', (_message.Message,), {
  'DESCRIPTOR' : _DEVICEACTIVATIONRESPONSE,
  '__module__' : 'github.com.TheThingsNetwork.api.router.router_pb2'
  # @@protoc_insertion_point(class_scope:router.DeviceActivationResponse)
  })
_sym_db.RegisterMessage(DeviceActivationResponse)

GatewayStatusRequest = _reflection.GeneratedProtocolMessageType('GatewayStatusRequest', (_message.Message,), {
  'DESCRIPTOR' : _GATEWAYSTATUSREQUEST,
  '__module__' : 'github.com.TheThingsNetwork.api.router.router_pb2'
  # @@protoc_insertion_point(class_scope:router.GatewayStatusRequest)
  })
_sym_db.RegisterMessage(GatewayStatusRequest)

GatewayStatusResponse = _reflection.GeneratedProtocolMessageType('GatewayStatusResponse', (_message.Message,), {
  'DESCRIPTOR' : _GATEWAYSTATUSRESPONSE,
  '__module__' : 'github.com.TheThingsNetwork.api.router.router_pb2'
  # @@protoc_insertion_point(class_scope:router.GatewayStatusResponse)
  })
_sym_db.RegisterMessage(GatewayStatusResponse)

StatusRequest = _reflection.GeneratedProtocolMessageType('StatusRequest', (_message.Message,), {
  'DESCRIPTOR' : _STATUSREQUEST,
  '__module__' : 'github.com.TheThingsNetwork.api.router.router_pb2'
  # @@protoc_insertion_point(class_scope:router.StatusRequest)
  })
_sym_db.RegisterMessage(StatusRequest)

Status = _reflection.GeneratedProtocolMessageType('Status', (_message.Message,), {
  'DESCRIPTOR' : _STATUS,
  '__module__' : 'github.com.TheThingsNetwork.api.router.router_pb2'
  # @@protoc_insertion_point(class_scope:router.Status)
  })
_sym_db.RegisterMessage(Status)


DESCRIPTOR._options = None
_UPLINKMESSAGE.fields_by_name['protocol_metadata']._options = None
_UPLINKMESSAGE.fields_by_name['gateway_metadata']._options = None
_DOWNLINKMESSAGE.fields_by_name['protocol_configuration']._options = None
_DOWNLINKMESSAGE.fields_by_name['gateway_configuration']._options = None
_DEVICEACTIVATIONREQUEST.fields_by_name['dev_eui']._options = None
_DEVICEACTIVATIONREQUEST.fields_by_name['app_eui']._options = None
_DEVICEACTIVATIONREQUEST.fields_by_name['protocol_metadata']._options = None
_DEVICEACTIVATIONREQUEST.fields_by_name['gateway_metadata']._options = None
_GATEWAYSTATUSREQUEST.fields_by_name['gateway_id']._options = None
_GATEWAYSTATUSRESPONSE.fields_by_name['status']._options = None

_ROUTER = _descriptor.ServiceDescriptor(
  name='Router',
  full_name='router.Router',
  file=DESCRIPTOR,
  index=0,
  serialized_options=None,
  serialized_start=1707,
  serialized_end=1979,
  methods=[
  _descriptor.MethodDescriptor(
    name='GatewayStatus',
    full_name='router.Router.GatewayStatus',
    index=0,
    containing_service=None,
    input_type=github_dot_com_dot_TheThingsNetwork_dot_api_dot_gateway_dot_gateway__pb2._STATUS,
    output_type=google_dot_protobuf_dot_empty__pb2._EMPTY,
    serialized_options=None,
  ),
  _descriptor.MethodDescriptor(
    name='Uplink',
    full_name='router.Router.Uplink',
    index=1,
    containing_service=None,
    input_type=_UPLINKMESSAGE,
    output_type=google_dot_protobuf_dot_empty__pb2._EMPTY,
    serialized_options=None,
  ),
  _descriptor.MethodDescriptor(
    name='Subscribe',
    full_name='router.Router.Subscribe',
    index=2,
    containing_service=None,
    input_type=_SUBSCRIBEREQUEST,
    output_type=_DOWNLINKMESSAGE,
    serialized_options=None,
  ),
  _descriptor.MethodDescriptor(
    name='Activate',
    full_name='router.Router.Activate',
    index=3,
    containing_service=None,
    input_type=_DEVICEACTIVATIONREQUEST,
    output_type=_DEVICEACTIVATIONRESPONSE,
    serialized_options=None,
  ),
])
_sym_db.RegisterServiceDescriptor(_ROUTER)

DESCRIPTOR.services_by_name['Router'] = _ROUTER


_ROUTERMANAGER = _descriptor.ServiceDescriptor(
  name='RouterManager',
  full_name='router.RouterManager',
  file=DESCRIPTOR,
  index=1,
  serialized_options=None,
  serialized_start=1982,
  serialized_end=2127,
  methods=[
  _descriptor.MethodDescriptor(
    name='GatewayStatus',
    full_name='router.RouterManager.GatewayStatus',
    index=0,
    containing_service=None,
    input_type=_GATEWAYSTATUSREQUEST,
    output_type=_GATEWAYSTATUSRESPONSE,
    serialized_options=None,
  ),
  _descriptor.MethodDescriptor(
    name='GetStatus',
    full_name='router.RouterManager.GetStatus',
    index=1,
    containing_service=None,
    input_type=_STATUSREQUEST,
    output_type=_STATUS,
    serialized_options=None,
  ),
])
_sym_db.RegisterServiceDescriptor(_ROUTERMANAGER)

DESCRIPTOR.services_by_name['RouterManager'] = _ROUTERMANAGER

# @@protoc_insertion_point(module_scope)
