package org.thethingsnetwork.api.networkserver;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: github.com/TheThingsNetwork/api/networkserver/networkserver.proto")
public final class NetworkServerGrpc {

  private NetworkServerGrpc() {}

  public static final String SERVICE_NAME = "networkserver.NetworkServer";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.api.networkserver.DevicesRequest,
      org.thethingsnetwork.api.networkserver.DevicesResponse> METHOD_GET_DEVICES =
      io.grpc.MethodDescriptor.<org.thethingsnetwork.api.networkserver.DevicesRequest, org.thethingsnetwork.api.networkserver.DevicesResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "networkserver.NetworkServer", "GetDevices"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.thethingsnetwork.api.networkserver.DevicesRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.thethingsnetwork.api.networkserver.DevicesResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.api.broker.DeduplicatedDeviceActivationRequest,
      org.thethingsnetwork.api.broker.DeduplicatedDeviceActivationRequest> METHOD_PREPARE_ACTIVATION =
      io.grpc.MethodDescriptor.<org.thethingsnetwork.api.broker.DeduplicatedDeviceActivationRequest, org.thethingsnetwork.api.broker.DeduplicatedDeviceActivationRequest>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "networkserver.NetworkServer", "PrepareActivation"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.thethingsnetwork.api.broker.DeduplicatedDeviceActivationRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.thethingsnetwork.api.broker.DeduplicatedDeviceActivationRequest.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.api.handler.DeviceActivationResponse,
      org.thethingsnetwork.api.handler.DeviceActivationResponse> METHOD_ACTIVATE =
      io.grpc.MethodDescriptor.<org.thethingsnetwork.api.handler.DeviceActivationResponse, org.thethingsnetwork.api.handler.DeviceActivationResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "networkserver.NetworkServer", "Activate"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.thethingsnetwork.api.handler.DeviceActivationResponse.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.thethingsnetwork.api.handler.DeviceActivationResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.api.broker.DeduplicatedUplinkMessage,
      org.thethingsnetwork.api.broker.DeduplicatedUplinkMessage> METHOD_UPLINK =
      io.grpc.MethodDescriptor.<org.thethingsnetwork.api.broker.DeduplicatedUplinkMessage, org.thethingsnetwork.api.broker.DeduplicatedUplinkMessage>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "networkserver.NetworkServer", "Uplink"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.thethingsnetwork.api.broker.DeduplicatedUplinkMessage.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.thethingsnetwork.api.broker.DeduplicatedUplinkMessage.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.api.broker.DownlinkMessage,
      org.thethingsnetwork.api.broker.DownlinkMessage> METHOD_DOWNLINK =
      io.grpc.MethodDescriptor.<org.thethingsnetwork.api.broker.DownlinkMessage, org.thethingsnetwork.api.broker.DownlinkMessage>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "networkserver.NetworkServer", "Downlink"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.thethingsnetwork.api.broker.DownlinkMessage.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.thethingsnetwork.api.broker.DownlinkMessage.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NetworkServerStub newStub(io.grpc.Channel channel) {
    return new NetworkServerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NetworkServerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new NetworkServerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NetworkServerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new NetworkServerFutureStub(channel);
  }

  /**
   */
  public static abstract class NetworkServerImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Broker requests devices with DevAddr and matching FCnt (or disabled FCnt check)
     * </pre>
     */
    public void getDevices(org.thethingsnetwork.api.networkserver.DevicesRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.networkserver.DevicesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_DEVICES, responseObserver);
    }

    /**
     * <pre>
     * Broker requests device activation "template" from Network Server
     * </pre>
     */
    public void prepareActivation(org.thethingsnetwork.api.broker.DeduplicatedDeviceActivationRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.broker.DeduplicatedDeviceActivationRequest> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_PREPARE_ACTIVATION, responseObserver);
    }

    /**
     * <pre>
     * Broker confirms device activation (after response from Handler)
     * </pre>
     */
    public void activate(org.thethingsnetwork.api.handler.DeviceActivationResponse request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.handler.DeviceActivationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ACTIVATE, responseObserver);
    }

    /**
     * <pre>
     * Broker informs Network Server about Uplink
     * </pre>
     */
    public void uplink(org.thethingsnetwork.api.broker.DeduplicatedUplinkMessage request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.broker.DeduplicatedUplinkMessage> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPLINK, responseObserver);
    }

    /**
     * <pre>
     * Broker informs Network Server about Downlink, NetworkServer may add MAC commands and re-set MIC
     * </pre>
     */
    public void downlink(org.thethingsnetwork.api.broker.DownlinkMessage request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.broker.DownlinkMessage> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DOWNLINK, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_DEVICES,
            asyncUnaryCall(
              new MethodHandlers<
                org.thethingsnetwork.api.networkserver.DevicesRequest,
                org.thethingsnetwork.api.networkserver.DevicesResponse>(
                  this, METHODID_GET_DEVICES)))
          .addMethod(
            METHOD_PREPARE_ACTIVATION,
            asyncUnaryCall(
              new MethodHandlers<
                org.thethingsnetwork.api.broker.DeduplicatedDeviceActivationRequest,
                org.thethingsnetwork.api.broker.DeduplicatedDeviceActivationRequest>(
                  this, METHODID_PREPARE_ACTIVATION)))
          .addMethod(
            METHOD_ACTIVATE,
            asyncUnaryCall(
              new MethodHandlers<
                org.thethingsnetwork.api.handler.DeviceActivationResponse,
                org.thethingsnetwork.api.handler.DeviceActivationResponse>(
                  this, METHODID_ACTIVATE)))
          .addMethod(
            METHOD_UPLINK,
            asyncUnaryCall(
              new MethodHandlers<
                org.thethingsnetwork.api.broker.DeduplicatedUplinkMessage,
                org.thethingsnetwork.api.broker.DeduplicatedUplinkMessage>(
                  this, METHODID_UPLINK)))
          .addMethod(
            METHOD_DOWNLINK,
            asyncUnaryCall(
              new MethodHandlers<
                org.thethingsnetwork.api.broker.DownlinkMessage,
                org.thethingsnetwork.api.broker.DownlinkMessage>(
                  this, METHODID_DOWNLINK)))
          .build();
    }
  }

  /**
   */
  public static final class NetworkServerStub extends io.grpc.stub.AbstractStub<NetworkServerStub> {
    private NetworkServerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NetworkServerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NetworkServerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NetworkServerStub(channel, callOptions);
    }

    /**
     * <pre>
     * Broker requests devices with DevAddr and matching FCnt (or disabled FCnt check)
     * </pre>
     */
    public void getDevices(org.thethingsnetwork.api.networkserver.DevicesRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.networkserver.DevicesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_DEVICES, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Broker requests device activation "template" from Network Server
     * </pre>
     */
    public void prepareActivation(org.thethingsnetwork.api.broker.DeduplicatedDeviceActivationRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.broker.DeduplicatedDeviceActivationRequest> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_PREPARE_ACTIVATION, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Broker confirms device activation (after response from Handler)
     * </pre>
     */
    public void activate(org.thethingsnetwork.api.handler.DeviceActivationResponse request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.handler.DeviceActivationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ACTIVATE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Broker informs Network Server about Uplink
     * </pre>
     */
    public void uplink(org.thethingsnetwork.api.broker.DeduplicatedUplinkMessage request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.broker.DeduplicatedUplinkMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPLINK, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Broker informs Network Server about Downlink, NetworkServer may add MAC commands and re-set MIC
     * </pre>
     */
    public void downlink(org.thethingsnetwork.api.broker.DownlinkMessage request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.broker.DownlinkMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DOWNLINK, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class NetworkServerBlockingStub extends io.grpc.stub.AbstractStub<NetworkServerBlockingStub> {
    private NetworkServerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NetworkServerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NetworkServerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NetworkServerBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Broker requests devices with DevAddr and matching FCnt (or disabled FCnt check)
     * </pre>
     */
    public org.thethingsnetwork.api.networkserver.DevicesResponse getDevices(org.thethingsnetwork.api.networkserver.DevicesRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_DEVICES, getCallOptions(), request);
    }

    /**
     * <pre>
     * Broker requests device activation "template" from Network Server
     * </pre>
     */
    public org.thethingsnetwork.api.broker.DeduplicatedDeviceActivationRequest prepareActivation(org.thethingsnetwork.api.broker.DeduplicatedDeviceActivationRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_PREPARE_ACTIVATION, getCallOptions(), request);
    }

    /**
     * <pre>
     * Broker confirms device activation (after response from Handler)
     * </pre>
     */
    public org.thethingsnetwork.api.handler.DeviceActivationResponse activate(org.thethingsnetwork.api.handler.DeviceActivationResponse request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ACTIVATE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Broker informs Network Server about Uplink
     * </pre>
     */
    public org.thethingsnetwork.api.broker.DeduplicatedUplinkMessage uplink(org.thethingsnetwork.api.broker.DeduplicatedUplinkMessage request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPLINK, getCallOptions(), request);
    }

    /**
     * <pre>
     * Broker informs Network Server about Downlink, NetworkServer may add MAC commands and re-set MIC
     * </pre>
     */
    public org.thethingsnetwork.api.broker.DownlinkMessage downlink(org.thethingsnetwork.api.broker.DownlinkMessage request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DOWNLINK, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class NetworkServerFutureStub extends io.grpc.stub.AbstractStub<NetworkServerFutureStub> {
    private NetworkServerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NetworkServerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NetworkServerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NetworkServerFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Broker requests devices with DevAddr and matching FCnt (or disabled FCnt check)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.api.networkserver.DevicesResponse> getDevices(
        org.thethingsnetwork.api.networkserver.DevicesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_DEVICES, getCallOptions()), request);
    }

    /**
     * <pre>
     * Broker requests device activation "template" from Network Server
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.api.broker.DeduplicatedDeviceActivationRequest> prepareActivation(
        org.thethingsnetwork.api.broker.DeduplicatedDeviceActivationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_PREPARE_ACTIVATION, getCallOptions()), request);
    }

    /**
     * <pre>
     * Broker confirms device activation (after response from Handler)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.api.handler.DeviceActivationResponse> activate(
        org.thethingsnetwork.api.handler.DeviceActivationResponse request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ACTIVATE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Broker informs Network Server about Uplink
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.api.broker.DeduplicatedUplinkMessage> uplink(
        org.thethingsnetwork.api.broker.DeduplicatedUplinkMessage request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPLINK, getCallOptions()), request);
    }

    /**
     * <pre>
     * Broker informs Network Server about Downlink, NetworkServer may add MAC commands and re-set MIC
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.api.broker.DownlinkMessage> downlink(
        org.thethingsnetwork.api.broker.DownlinkMessage request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DOWNLINK, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_DEVICES = 0;
  private static final int METHODID_PREPARE_ACTIVATION = 1;
  private static final int METHODID_ACTIVATE = 2;
  private static final int METHODID_UPLINK = 3;
  private static final int METHODID_DOWNLINK = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NetworkServerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(NetworkServerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_DEVICES:
          serviceImpl.getDevices((org.thethingsnetwork.api.networkserver.DevicesRequest) request,
              (io.grpc.stub.StreamObserver<org.thethingsnetwork.api.networkserver.DevicesResponse>) responseObserver);
          break;
        case METHODID_PREPARE_ACTIVATION:
          serviceImpl.prepareActivation((org.thethingsnetwork.api.broker.DeduplicatedDeviceActivationRequest) request,
              (io.grpc.stub.StreamObserver<org.thethingsnetwork.api.broker.DeduplicatedDeviceActivationRequest>) responseObserver);
          break;
        case METHODID_ACTIVATE:
          serviceImpl.activate((org.thethingsnetwork.api.handler.DeviceActivationResponse) request,
              (io.grpc.stub.StreamObserver<org.thethingsnetwork.api.handler.DeviceActivationResponse>) responseObserver);
          break;
        case METHODID_UPLINK:
          serviceImpl.uplink((org.thethingsnetwork.api.broker.DeduplicatedUplinkMessage) request,
              (io.grpc.stub.StreamObserver<org.thethingsnetwork.api.broker.DeduplicatedUplinkMessage>) responseObserver);
          break;
        case METHODID_DOWNLINK:
          serviceImpl.downlink((org.thethingsnetwork.api.broker.DownlinkMessage) request,
              (io.grpc.stub.StreamObserver<org.thethingsnetwork.api.broker.DownlinkMessage>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class NetworkServerDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.thethingsnetwork.api.networkserver.MonitorProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (NetworkServerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NetworkServerDescriptorSupplier())
              .addMethod(METHOD_GET_DEVICES)
              .addMethod(METHOD_PREPARE_ACTIVATION)
              .addMethod(METHOD_ACTIVATE)
              .addMethod(METHOD_UPLINK)
              .addMethod(METHOD_DOWNLINK)
              .build();
        }
      }
    }
    return result;
  }
}
