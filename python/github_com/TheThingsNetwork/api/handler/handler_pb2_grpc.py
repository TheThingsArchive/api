# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
import grpc

from github_com.TheThingsNetwork.api.broker import broker_pb2 as github_dot_com_dot_TheThingsNetwork_dot_api_dot_broker_dot_broker__pb2
from github_com.TheThingsNetwork.api.handler import handler_pb2 as github_dot_com_dot_TheThingsNetwork_dot_api_dot_handler_dot_handler__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2


class HandlerStub(object):
  """The Handler service provides pure network functionality
  """

  def __init__(self, channel):
    """Constructor.

    Args:
      channel: A grpc.Channel.
    """
    self.ActivationChallenge = channel.unary_unary(
        '/handler.Handler/ActivationChallenge',
        request_serializer=github_dot_com_dot_TheThingsNetwork_dot_api_dot_broker_dot_broker__pb2.ActivationChallengeRequest.SerializeToString,
        response_deserializer=github_dot_com_dot_TheThingsNetwork_dot_api_dot_broker_dot_broker__pb2.ActivationChallengeResponse.FromString,
        )
    self.Activate = channel.unary_unary(
        '/handler.Handler/Activate',
        request_serializer=github_dot_com_dot_TheThingsNetwork_dot_api_dot_broker_dot_broker__pb2.DeduplicatedDeviceActivationRequest.SerializeToString,
        response_deserializer=github_dot_com_dot_TheThingsNetwork_dot_api_dot_handler_dot_handler__pb2.DeviceActivationResponse.FromString,
        )


class HandlerServicer(object):
  """The Handler service provides pure network functionality
  """

  def ActivationChallenge(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def Activate(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')


def add_HandlerServicer_to_server(servicer, server):
  rpc_method_handlers = {
      'ActivationChallenge': grpc.unary_unary_rpc_method_handler(
          servicer.ActivationChallenge,
          request_deserializer=github_dot_com_dot_TheThingsNetwork_dot_api_dot_broker_dot_broker__pb2.ActivationChallengeRequest.FromString,
          response_serializer=github_dot_com_dot_TheThingsNetwork_dot_api_dot_broker_dot_broker__pb2.ActivationChallengeResponse.SerializeToString,
      ),
      'Activate': grpc.unary_unary_rpc_method_handler(
          servicer.Activate,
          request_deserializer=github_dot_com_dot_TheThingsNetwork_dot_api_dot_broker_dot_broker__pb2.DeduplicatedDeviceActivationRequest.FromString,
          response_serializer=github_dot_com_dot_TheThingsNetwork_dot_api_dot_handler_dot_handler__pb2.DeviceActivationResponse.SerializeToString,
      ),
  }
  generic_handler = grpc.method_handlers_generic_handler(
      'handler.Handler', rpc_method_handlers)
  server.add_generic_rpc_handlers((generic_handler,))


class ApplicationManagerStub(object):
  """ApplicationManager manages application and device registrations on the Handler

  To protect our quality of service, you can make up to 5000 calls to the
  ApplicationManager API per hour. Once you go over the rate limit, you will
  receive an error response.
  """

  def __init__(self, channel):
    """Constructor.

    Args:
      channel: A grpc.Channel.
    """
    self.RegisterApplication = channel.unary_unary(
        '/handler.ApplicationManager/RegisterApplication',
        request_serializer=github_dot_com_dot_TheThingsNetwork_dot_api_dot_handler_dot_handler__pb2.ApplicationIdentifier.SerializeToString,
        response_deserializer=google_dot_protobuf_dot_empty__pb2.Empty.FromString,
        )
    self.GetApplication = channel.unary_unary(
        '/handler.ApplicationManager/GetApplication',
        request_serializer=github_dot_com_dot_TheThingsNetwork_dot_api_dot_handler_dot_handler__pb2.ApplicationIdentifier.SerializeToString,
        response_deserializer=github_dot_com_dot_TheThingsNetwork_dot_api_dot_handler_dot_handler__pb2.Application.FromString,
        )
    self.SetApplication = channel.unary_unary(
        '/handler.ApplicationManager/SetApplication',
        request_serializer=github_dot_com_dot_TheThingsNetwork_dot_api_dot_handler_dot_handler__pb2.Application.SerializeToString,
        response_deserializer=google_dot_protobuf_dot_empty__pb2.Empty.FromString,
        )
    self.DeleteApplication = channel.unary_unary(
        '/handler.ApplicationManager/DeleteApplication',
        request_serializer=github_dot_com_dot_TheThingsNetwork_dot_api_dot_handler_dot_handler__pb2.ApplicationIdentifier.SerializeToString,
        response_deserializer=google_dot_protobuf_dot_empty__pb2.Empty.FromString,
        )
    self.GetDevice = channel.unary_unary(
        '/handler.ApplicationManager/GetDevice',
        request_serializer=github_dot_com_dot_TheThingsNetwork_dot_api_dot_handler_dot_handler__pb2.DeviceIdentifier.SerializeToString,
        response_deserializer=github_dot_com_dot_TheThingsNetwork_dot_api_dot_handler_dot_handler__pb2.Device.FromString,
        )
    self.SetDevice = channel.unary_unary(
        '/handler.ApplicationManager/SetDevice',
        request_serializer=github_dot_com_dot_TheThingsNetwork_dot_api_dot_handler_dot_handler__pb2.Device.SerializeToString,
        response_deserializer=google_dot_protobuf_dot_empty__pb2.Empty.FromString,
        )
    self.DeleteDevice = channel.unary_unary(
        '/handler.ApplicationManager/DeleteDevice',
        request_serializer=github_dot_com_dot_TheThingsNetwork_dot_api_dot_handler_dot_handler__pb2.DeviceIdentifier.SerializeToString,
        response_deserializer=google_dot_protobuf_dot_empty__pb2.Empty.FromString,
        )
    self.GetDevicesForApplication = channel.unary_unary(
        '/handler.ApplicationManager/GetDevicesForApplication',
        request_serializer=github_dot_com_dot_TheThingsNetwork_dot_api_dot_handler_dot_handler__pb2.ApplicationIdentifier.SerializeToString,
        response_deserializer=github_dot_com_dot_TheThingsNetwork_dot_api_dot_handler_dot_handler__pb2.DeviceList.FromString,
        )
    self.DryDownlink = channel.unary_unary(
        '/handler.ApplicationManager/DryDownlink',
        request_serializer=github_dot_com_dot_TheThingsNetwork_dot_api_dot_handler_dot_handler__pb2.DryDownlinkMessage.SerializeToString,
        response_deserializer=github_dot_com_dot_TheThingsNetwork_dot_api_dot_handler_dot_handler__pb2.DryDownlinkResult.FromString,
        )
    self.DryUplink = channel.unary_unary(
        '/handler.ApplicationManager/DryUplink',
        request_serializer=github_dot_com_dot_TheThingsNetwork_dot_api_dot_handler_dot_handler__pb2.DryUplinkMessage.SerializeToString,
        response_deserializer=github_dot_com_dot_TheThingsNetwork_dot_api_dot_handler_dot_handler__pb2.DryUplinkResult.FromString,
        )
    self.SimulateUplink = channel.unary_unary(
        '/handler.ApplicationManager/SimulateUplink',
        request_serializer=github_dot_com_dot_TheThingsNetwork_dot_api_dot_handler_dot_handler__pb2.SimulatedUplinkMessage.SerializeToString,
        response_deserializer=google_dot_protobuf_dot_empty__pb2.Empty.FromString,
        )


class ApplicationManagerServicer(object):
  """ApplicationManager manages application and device registrations on the Handler

  To protect our quality of service, you can make up to 5000 calls to the
  ApplicationManager API per hour. Once you go over the rate limit, you will
  receive an error response.
  """

  def RegisterApplication(self, request, context):
    """Applications should first be registered to the Handler with the `RegisterApplication` method
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def GetApplication(self, request, context):
    """GetApplication returns the application with the given identifier (app_id)
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def SetApplication(self, request, context):
    """SetApplication updates the settings for the application. All fields must be supplied.
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def DeleteApplication(self, request, context):
    """DeleteApplication deletes the application with the given identifier (app_id)
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def GetDevice(self, request, context):
    """GetDevice returns the device with the given identifier (app_id and dev_id)
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def SetDevice(self, request, context):
    """SetDevice creates or updates a device. All fields must be supplied.
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def DeleteDevice(self, request, context):
    """DeleteDevice deletes the device with the given identifier (app_id and dev_id)
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def GetDevicesForApplication(self, request, context):
    """GetDevicesForApplication returns all devices that belong to the application with the given identifier (app_id)
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def DryDownlink(self, request, context):
    """DryUplink simulates processing a downlink message and returns the result
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def DryUplink(self, request, context):
    """DryUplink simulates processing an uplink message and returns the result
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def SimulateUplink(self, request, context):
    """SimulateUplink simulates an uplink message
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')


def add_ApplicationManagerServicer_to_server(servicer, server):
  rpc_method_handlers = {
      'RegisterApplication': grpc.unary_unary_rpc_method_handler(
          servicer.RegisterApplication,
          request_deserializer=github_dot_com_dot_TheThingsNetwork_dot_api_dot_handler_dot_handler__pb2.ApplicationIdentifier.FromString,
          response_serializer=google_dot_protobuf_dot_empty__pb2.Empty.SerializeToString,
      ),
      'GetApplication': grpc.unary_unary_rpc_method_handler(
          servicer.GetApplication,
          request_deserializer=github_dot_com_dot_TheThingsNetwork_dot_api_dot_handler_dot_handler__pb2.ApplicationIdentifier.FromString,
          response_serializer=github_dot_com_dot_TheThingsNetwork_dot_api_dot_handler_dot_handler__pb2.Application.SerializeToString,
      ),
      'SetApplication': grpc.unary_unary_rpc_method_handler(
          servicer.SetApplication,
          request_deserializer=github_dot_com_dot_TheThingsNetwork_dot_api_dot_handler_dot_handler__pb2.Application.FromString,
          response_serializer=google_dot_protobuf_dot_empty__pb2.Empty.SerializeToString,
      ),
      'DeleteApplication': grpc.unary_unary_rpc_method_handler(
          servicer.DeleteApplication,
          request_deserializer=github_dot_com_dot_TheThingsNetwork_dot_api_dot_handler_dot_handler__pb2.ApplicationIdentifier.FromString,
          response_serializer=google_dot_protobuf_dot_empty__pb2.Empty.SerializeToString,
      ),
      'GetDevice': grpc.unary_unary_rpc_method_handler(
          servicer.GetDevice,
          request_deserializer=github_dot_com_dot_TheThingsNetwork_dot_api_dot_handler_dot_handler__pb2.DeviceIdentifier.FromString,
          response_serializer=github_dot_com_dot_TheThingsNetwork_dot_api_dot_handler_dot_handler__pb2.Device.SerializeToString,
      ),
      'SetDevice': grpc.unary_unary_rpc_method_handler(
          servicer.SetDevice,
          request_deserializer=github_dot_com_dot_TheThingsNetwork_dot_api_dot_handler_dot_handler__pb2.Device.FromString,
          response_serializer=google_dot_protobuf_dot_empty__pb2.Empty.SerializeToString,
      ),
      'DeleteDevice': grpc.unary_unary_rpc_method_handler(
          servicer.DeleteDevice,
          request_deserializer=github_dot_com_dot_TheThingsNetwork_dot_api_dot_handler_dot_handler__pb2.DeviceIdentifier.FromString,
          response_serializer=google_dot_protobuf_dot_empty__pb2.Empty.SerializeToString,
      ),
      'GetDevicesForApplication': grpc.unary_unary_rpc_method_handler(
          servicer.GetDevicesForApplication,
          request_deserializer=github_dot_com_dot_TheThingsNetwork_dot_api_dot_handler_dot_handler__pb2.ApplicationIdentifier.FromString,
          response_serializer=github_dot_com_dot_TheThingsNetwork_dot_api_dot_handler_dot_handler__pb2.DeviceList.SerializeToString,
      ),
      'DryDownlink': grpc.unary_unary_rpc_method_handler(
          servicer.DryDownlink,
          request_deserializer=github_dot_com_dot_TheThingsNetwork_dot_api_dot_handler_dot_handler__pb2.DryDownlinkMessage.FromString,
          response_serializer=github_dot_com_dot_TheThingsNetwork_dot_api_dot_handler_dot_handler__pb2.DryDownlinkResult.SerializeToString,
      ),
      'DryUplink': grpc.unary_unary_rpc_method_handler(
          servicer.DryUplink,
          request_deserializer=github_dot_com_dot_TheThingsNetwork_dot_api_dot_handler_dot_handler__pb2.DryUplinkMessage.FromString,
          response_serializer=github_dot_com_dot_TheThingsNetwork_dot_api_dot_handler_dot_handler__pb2.DryUplinkResult.SerializeToString,
      ),
      'SimulateUplink': grpc.unary_unary_rpc_method_handler(
          servicer.SimulateUplink,
          request_deserializer=github_dot_com_dot_TheThingsNetwork_dot_api_dot_handler_dot_handler__pb2.SimulatedUplinkMessage.FromString,
          response_serializer=google_dot_protobuf_dot_empty__pb2.Empty.SerializeToString,
      ),
  }
  generic_handler = grpc.method_handlers_generic_handler(
      'handler.ApplicationManager', rpc_method_handlers)
  server.add_generic_rpc_handlers((generic_handler,))


class HandlerManagerStub(object):
  """The HandlerManager service provides configuration and monitoring
  functionality
  """

  def __init__(self, channel):
    """Constructor.

    Args:
      channel: A grpc.Channel.
    """
    self.GetStatus = channel.unary_unary(
        '/handler.HandlerManager/GetStatus',
        request_serializer=github_dot_com_dot_TheThingsNetwork_dot_api_dot_handler_dot_handler__pb2.StatusRequest.SerializeToString,
        response_deserializer=github_dot_com_dot_TheThingsNetwork_dot_api_dot_handler_dot_handler__pb2.Status.FromString,
        )


class HandlerManagerServicer(object):
  """The HandlerManager service provides configuration and monitoring
  functionality
  """

  def GetStatus(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')


def add_HandlerManagerServicer_to_server(servicer, server):
  rpc_method_handlers = {
      'GetStatus': grpc.unary_unary_rpc_method_handler(
          servicer.GetStatus,
          request_deserializer=github_dot_com_dot_TheThingsNetwork_dot_api_dot_handler_dot_handler__pb2.StatusRequest.FromString,
          response_serializer=github_dot_com_dot_TheThingsNetwork_dot_api_dot_handler_dot_handler__pb2.Status.SerializeToString,
      ),
  }
  generic_handler = grpc.method_handlers_generic_handler(
      'handler.HandlerManager', rpc_method_handlers)
  server.add_generic_rpc_handlers((generic_handler,))
