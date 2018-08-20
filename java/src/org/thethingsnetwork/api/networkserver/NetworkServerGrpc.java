package org.thethingsnetwork.api.networkserver;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: github.com/TheThingsNetwork/api/networkserver/networkserver.proto")
public final class NetworkServerGrpc {

  private NetworkServerGrpc() {}

  public static final String SERVICE_NAME = "networkserver.NetworkServer";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.thethingsnetwork.api.networkserver.DevicesRequest,
      org.thethingsnetwork.api.networkserver.DevicesResponse> getGetDevicesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDevices",
      requestType = org.thethingsnetwork.api.networkserver.DevicesRequest.class,
      responseType = org.thethingsnetwork.api.networkserver.DevicesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.thethingsnetwork.api.networkserver.DevicesRequest,
      org.thethingsnetwork.api.networkserver.DevicesResponse> getGetDevicesMethod() {
    io.grpc.MethodDescriptor<org.thethingsnetwork.api.networkserver.DevicesRequest, org.thethingsnetwork.api.networkserver.DevicesResponse> getGetDevicesMethod;
    if ((getGetDevicesMethod = NetworkServerGrpc.getGetDevicesMethod) == null) {
      synchronized (NetworkServerGrpc.class) {
        if ((getGetDevicesMethod = NetworkServerGrpc.getGetDevicesMethod) == null) {
          NetworkServerGrpc.getGetDevicesMethod = getGetDevicesMethod = 
              io.grpc.MethodDescriptor.<org.thethingsnetwork.api.networkserver.DevicesRequest, org.thethingsnetwork.api.networkserver.DevicesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "networkserver.NetworkServer", "GetDevices"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.thethingsnetwork.api.networkserver.DevicesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.thethingsnetwork.api.networkserver.DevicesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new NetworkServerMethodDescriptorSupplier("GetDevices"))
                  .build();
          }
        }
     }
     return getGetDevicesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.thethingsnetwork.api.broker.DeduplicatedDeviceActivationRequest,
      org.thethingsnetwork.api.broker.DeduplicatedDeviceActivationRequest> getPrepareActivationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PrepareActivation",
      requestType = org.thethingsnetwork.api.broker.DeduplicatedDeviceActivationRequest.class,
      responseType = org.thethingsnetwork.api.broker.DeduplicatedDeviceActivationRequest.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.thethingsnetwork.api.broker.DeduplicatedDeviceActivationRequest,
      org.thethingsnetwork.api.broker.DeduplicatedDeviceActivationRequest> getPrepareActivationMethod() {
    io.grpc.MethodDescriptor<org.thethingsnetwork.api.broker.DeduplicatedDeviceActivationRequest, org.thethingsnetwork.api.broker.DeduplicatedDeviceActivationRequest> getPrepareActivationMethod;
    if ((getPrepareActivationMethod = NetworkServerGrpc.getPrepareActivationMethod) == null) {
      synchronized (NetworkServerGrpc.class) {
        if ((getPrepareActivationMethod = NetworkServerGrpc.getPrepareActivationMethod) == null) {
          NetworkServerGrpc.getPrepareActivationMethod = getPrepareActivationMethod = 
              io.grpc.MethodDescriptor.<org.thethingsnetwork.api.broker.DeduplicatedDeviceActivationRequest, org.thethingsnetwork.api.broker.DeduplicatedDeviceActivationRequest>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "networkserver.NetworkServer", "PrepareActivation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.thethingsnetwork.api.broker.DeduplicatedDeviceActivationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.thethingsnetwork.api.broker.DeduplicatedDeviceActivationRequest.getDefaultInstance()))
                  .setSchemaDescriptor(new NetworkServerMethodDescriptorSupplier("PrepareActivation"))
                  .build();
          }
        }
     }
     return getPrepareActivationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.thethingsnetwork.api.handler.DeviceActivationResponse,
      org.thethingsnetwork.api.handler.DeviceActivationResponse> getActivateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Activate",
      requestType = org.thethingsnetwork.api.handler.DeviceActivationResponse.class,
      responseType = org.thethingsnetwork.api.handler.DeviceActivationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.thethingsnetwork.api.handler.DeviceActivationResponse,
      org.thethingsnetwork.api.handler.DeviceActivationResponse> getActivateMethod() {
    io.grpc.MethodDescriptor<org.thethingsnetwork.api.handler.DeviceActivationResponse, org.thethingsnetwork.api.handler.DeviceActivationResponse> getActivateMethod;
    if ((getActivateMethod = NetworkServerGrpc.getActivateMethod) == null) {
      synchronized (NetworkServerGrpc.class) {
        if ((getActivateMethod = NetworkServerGrpc.getActivateMethod) == null) {
          NetworkServerGrpc.getActivateMethod = getActivateMethod = 
              io.grpc.MethodDescriptor.<org.thethingsnetwork.api.handler.DeviceActivationResponse, org.thethingsnetwork.api.handler.DeviceActivationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "networkserver.NetworkServer", "Activate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.thethingsnetwork.api.handler.DeviceActivationResponse.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.thethingsnetwork.api.handler.DeviceActivationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new NetworkServerMethodDescriptorSupplier("Activate"))
                  .build();
          }
        }
     }
     return getActivateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.thethingsnetwork.api.broker.DeduplicatedUplinkMessage,
      org.thethingsnetwork.api.broker.DeduplicatedUplinkMessage> getUplinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Uplink",
      requestType = org.thethingsnetwork.api.broker.DeduplicatedUplinkMessage.class,
      responseType = org.thethingsnetwork.api.broker.DeduplicatedUplinkMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.thethingsnetwork.api.broker.DeduplicatedUplinkMessage,
      org.thethingsnetwork.api.broker.DeduplicatedUplinkMessage> getUplinkMethod() {
    io.grpc.MethodDescriptor<org.thethingsnetwork.api.broker.DeduplicatedUplinkMessage, org.thethingsnetwork.api.broker.DeduplicatedUplinkMessage> getUplinkMethod;
    if ((getUplinkMethod = NetworkServerGrpc.getUplinkMethod) == null) {
      synchronized (NetworkServerGrpc.class) {
        if ((getUplinkMethod = NetworkServerGrpc.getUplinkMethod) == null) {
          NetworkServerGrpc.getUplinkMethod = getUplinkMethod = 
              io.grpc.MethodDescriptor.<org.thethingsnetwork.api.broker.DeduplicatedUplinkMessage, org.thethingsnetwork.api.broker.DeduplicatedUplinkMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "networkserver.NetworkServer", "Uplink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.thethingsnetwork.api.broker.DeduplicatedUplinkMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.thethingsnetwork.api.broker.DeduplicatedUplinkMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new NetworkServerMethodDescriptorSupplier("Uplink"))
                  .build();
          }
        }
     }
     return getUplinkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.thethingsnetwork.api.broker.DownlinkMessage,
      org.thethingsnetwork.api.broker.DownlinkMessage> getDownlinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Downlink",
      requestType = org.thethingsnetwork.api.broker.DownlinkMessage.class,
      responseType = org.thethingsnetwork.api.broker.DownlinkMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.thethingsnetwork.api.broker.DownlinkMessage,
      org.thethingsnetwork.api.broker.DownlinkMessage> getDownlinkMethod() {
    io.grpc.MethodDescriptor<org.thethingsnetwork.api.broker.DownlinkMessage, org.thethingsnetwork.api.broker.DownlinkMessage> getDownlinkMethod;
    if ((getDownlinkMethod = NetworkServerGrpc.getDownlinkMethod) == null) {
      synchronized (NetworkServerGrpc.class) {
        if ((getDownlinkMethod = NetworkServerGrpc.getDownlinkMethod) == null) {
          NetworkServerGrpc.getDownlinkMethod = getDownlinkMethod = 
              io.grpc.MethodDescriptor.<org.thethingsnetwork.api.broker.DownlinkMessage, org.thethingsnetwork.api.broker.DownlinkMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "networkserver.NetworkServer", "Downlink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.thethingsnetwork.api.broker.DownlinkMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.thethingsnetwork.api.broker.DownlinkMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new NetworkServerMethodDescriptorSupplier("Downlink"))
                  .build();
          }
        }
     }
     return getDownlinkMethod;
  }

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
      asyncUnimplementedUnaryCall(getGetDevicesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Broker requests device activation "template" from Network Server
     * </pre>
     */
    public void prepareActivation(org.thethingsnetwork.api.broker.DeduplicatedDeviceActivationRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.broker.DeduplicatedDeviceActivationRequest> responseObserver) {
      asyncUnimplementedUnaryCall(getPrepareActivationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Broker confirms device activation (after response from Handler)
     * </pre>
     */
    public void activate(org.thethingsnetwork.api.handler.DeviceActivationResponse request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.handler.DeviceActivationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getActivateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Broker informs Network Server about Uplink
     * </pre>
     */
    public void uplink(org.thethingsnetwork.api.broker.DeduplicatedUplinkMessage request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.broker.DeduplicatedUplinkMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getUplinkMethod(), responseObserver);
    }

    /**
     * <pre>
     * Broker informs Network Server about Downlink, NetworkServer may add MAC commands and re-set MIC
     * </pre>
     */
    public void downlink(org.thethingsnetwork.api.broker.DownlinkMessage request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.broker.DownlinkMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getDownlinkMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetDevicesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.thethingsnetwork.api.networkserver.DevicesRequest,
                org.thethingsnetwork.api.networkserver.DevicesResponse>(
                  this, METHODID_GET_DEVICES)))
          .addMethod(
            getPrepareActivationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.thethingsnetwork.api.broker.DeduplicatedDeviceActivationRequest,
                org.thethingsnetwork.api.broker.DeduplicatedDeviceActivationRequest>(
                  this, METHODID_PREPARE_ACTIVATION)))
          .addMethod(
            getActivateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.thethingsnetwork.api.handler.DeviceActivationResponse,
                org.thethingsnetwork.api.handler.DeviceActivationResponse>(
                  this, METHODID_ACTIVATE)))
          .addMethod(
            getUplinkMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.thethingsnetwork.api.broker.DeduplicatedUplinkMessage,
                org.thethingsnetwork.api.broker.DeduplicatedUplinkMessage>(
                  this, METHODID_UPLINK)))
          .addMethod(
            getDownlinkMethod(),
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
          getChannel().newCall(getGetDevicesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Broker requests device activation "template" from Network Server
     * </pre>
     */
    public void prepareActivation(org.thethingsnetwork.api.broker.DeduplicatedDeviceActivationRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.broker.DeduplicatedDeviceActivationRequest> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPrepareActivationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Broker confirms device activation (after response from Handler)
     * </pre>
     */
    public void activate(org.thethingsnetwork.api.handler.DeviceActivationResponse request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.handler.DeviceActivationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getActivateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Broker informs Network Server about Uplink
     * </pre>
     */
    public void uplink(org.thethingsnetwork.api.broker.DeduplicatedUplinkMessage request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.broker.DeduplicatedUplinkMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUplinkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Broker informs Network Server about Downlink, NetworkServer may add MAC commands and re-set MIC
     * </pre>
     */
    public void downlink(org.thethingsnetwork.api.broker.DownlinkMessage request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.broker.DownlinkMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDownlinkMethod(), getCallOptions()), request, responseObserver);
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
          getChannel(), getGetDevicesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Broker requests device activation "template" from Network Server
     * </pre>
     */
    public org.thethingsnetwork.api.broker.DeduplicatedDeviceActivationRequest prepareActivation(org.thethingsnetwork.api.broker.DeduplicatedDeviceActivationRequest request) {
      return blockingUnaryCall(
          getChannel(), getPrepareActivationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Broker confirms device activation (after response from Handler)
     * </pre>
     */
    public org.thethingsnetwork.api.handler.DeviceActivationResponse activate(org.thethingsnetwork.api.handler.DeviceActivationResponse request) {
      return blockingUnaryCall(
          getChannel(), getActivateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Broker informs Network Server about Uplink
     * </pre>
     */
    public org.thethingsnetwork.api.broker.DeduplicatedUplinkMessage uplink(org.thethingsnetwork.api.broker.DeduplicatedUplinkMessage request) {
      return blockingUnaryCall(
          getChannel(), getUplinkMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Broker informs Network Server about Downlink, NetworkServer may add MAC commands and re-set MIC
     * </pre>
     */
    public org.thethingsnetwork.api.broker.DownlinkMessage downlink(org.thethingsnetwork.api.broker.DownlinkMessage request) {
      return blockingUnaryCall(
          getChannel(), getDownlinkMethod(), getCallOptions(), request);
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
          getChannel().newCall(getGetDevicesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Broker requests device activation "template" from Network Server
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.api.broker.DeduplicatedDeviceActivationRequest> prepareActivation(
        org.thethingsnetwork.api.broker.DeduplicatedDeviceActivationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPrepareActivationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Broker confirms device activation (after response from Handler)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.api.handler.DeviceActivationResponse> activate(
        org.thethingsnetwork.api.handler.DeviceActivationResponse request) {
      return futureUnaryCall(
          getChannel().newCall(getActivateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Broker informs Network Server about Uplink
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.api.broker.DeduplicatedUplinkMessage> uplink(
        org.thethingsnetwork.api.broker.DeduplicatedUplinkMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getUplinkMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Broker informs Network Server about Downlink, NetworkServer may add MAC commands and re-set MIC
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.api.broker.DownlinkMessage> downlink(
        org.thethingsnetwork.api.broker.DownlinkMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getDownlinkMethod(), getCallOptions()), request);
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

  private static abstract class NetworkServerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NetworkServerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.thethingsnetwork.api.networkserver.NetworkServerProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("NetworkServer");
    }
  }

  private static final class NetworkServerFileDescriptorSupplier
      extends NetworkServerBaseDescriptorSupplier {
    NetworkServerFileDescriptorSupplier() {}
  }

  private static final class NetworkServerMethodDescriptorSupplier
      extends NetworkServerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    NetworkServerMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
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
              .setSchemaDescriptor(new NetworkServerFileDescriptorSupplier())
              .addMethod(getGetDevicesMethod())
              .addMethod(getPrepareActivationMethod())
              .addMethod(getActivateMethod())
              .addMethod(getUplinkMethod())
              .addMethod(getDownlinkMethod())
              .build();
        }
      }
    }
    return result;
  }
}
