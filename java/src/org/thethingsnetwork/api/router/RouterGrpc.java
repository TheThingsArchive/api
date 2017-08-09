package org.thethingsnetwork.api.router;

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
 * <pre>
 * The Router service provides pure network functionality
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: github.com/TheThingsNetwork/api/router/router.proto")
public final class RouterGrpc {

  private RouterGrpc() {}

  public static final String SERVICE_NAME = "router.Router";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.api.gateway.Status,
      com.google.protobuf.Empty> METHOD_GATEWAY_STATUS =
      io.grpc.MethodDescriptor.<org.thethingsnetwork.api.gateway.Status, com.google.protobuf.Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "router.Router", "GatewayStatus"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.thethingsnetwork.api.gateway.Status.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.api.router.UplinkMessage,
      com.google.protobuf.Empty> METHOD_UPLINK =
      io.grpc.MethodDescriptor.<org.thethingsnetwork.api.router.UplinkMessage, com.google.protobuf.Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "router.Router", "Uplink"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.thethingsnetwork.api.router.UplinkMessage.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.api.router.SubscribeRequest,
      org.thethingsnetwork.api.router.DownlinkMessage> METHOD_SUBSCRIBE =
      io.grpc.MethodDescriptor.<org.thethingsnetwork.api.router.SubscribeRequest, org.thethingsnetwork.api.router.DownlinkMessage>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "router.Router", "Subscribe"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.thethingsnetwork.api.router.SubscribeRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.thethingsnetwork.api.router.DownlinkMessage.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.api.router.DeviceActivationRequest,
      org.thethingsnetwork.api.router.DeviceActivationResponse> METHOD_ACTIVATE =
      io.grpc.MethodDescriptor.<org.thethingsnetwork.api.router.DeviceActivationRequest, org.thethingsnetwork.api.router.DeviceActivationResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "router.Router", "Activate"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.thethingsnetwork.api.router.DeviceActivationRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.thethingsnetwork.api.router.DeviceActivationResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RouterStub newStub(io.grpc.Channel channel) {
    return new RouterStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RouterBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RouterBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RouterFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RouterFutureStub(channel);
  }

  /**
   * <pre>
   * The Router service provides pure network functionality
   * </pre>
   */
  public static abstract class RouterImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Gateway streams status messages to Router
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.api.gateway.Status> gatewayStatus(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_GATEWAY_STATUS, responseObserver);
    }

    /**
     * <pre>
     * Gateway streams uplink messages to Router
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.api.router.UplinkMessage> uplink(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_UPLINK, responseObserver);
    }

    /**
     * <pre>
     * Gateway subscribes to downlink messages from Router
     * It is possible to open multiple subscriptions (but not recommended).
     * If you do this, you are responsible for de-duplication of downlink messages.
     * </pre>
     */
    public void subscribe(org.thethingsnetwork.api.router.SubscribeRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.router.DownlinkMessage> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SUBSCRIBE, responseObserver);
    }

    /**
     * <pre>
     * Gateway requests device activation
     * </pre>
     */
    public void activate(org.thethingsnetwork.api.router.DeviceActivationRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.router.DeviceActivationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ACTIVATE, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GATEWAY_STATUS,
            asyncClientStreamingCall(
              new MethodHandlers<
                org.thethingsnetwork.api.gateway.Status,
                com.google.protobuf.Empty>(
                  this, METHODID_GATEWAY_STATUS)))
          .addMethod(
            METHOD_UPLINK,
            asyncClientStreamingCall(
              new MethodHandlers<
                org.thethingsnetwork.api.router.UplinkMessage,
                com.google.protobuf.Empty>(
                  this, METHODID_UPLINK)))
          .addMethod(
            METHOD_SUBSCRIBE,
            asyncServerStreamingCall(
              new MethodHandlers<
                org.thethingsnetwork.api.router.SubscribeRequest,
                org.thethingsnetwork.api.router.DownlinkMessage>(
                  this, METHODID_SUBSCRIBE)))
          .addMethod(
            METHOD_ACTIVATE,
            asyncUnaryCall(
              new MethodHandlers<
                org.thethingsnetwork.api.router.DeviceActivationRequest,
                org.thethingsnetwork.api.router.DeviceActivationResponse>(
                  this, METHODID_ACTIVATE)))
          .build();
    }
  }

  /**
   * <pre>
   * The Router service provides pure network functionality
   * </pre>
   */
  public static final class RouterStub extends io.grpc.stub.AbstractStub<RouterStub> {
    private RouterStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RouterStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RouterStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RouterStub(channel, callOptions);
    }

    /**
     * <pre>
     * Gateway streams status messages to Router
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.api.gateway.Status> gatewayStatus(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(METHOD_GATEWAY_STATUS, getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Gateway streams uplink messages to Router
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.api.router.UplinkMessage> uplink(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(METHOD_UPLINK, getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Gateway subscribes to downlink messages from Router
     * It is possible to open multiple subscriptions (but not recommended).
     * If you do this, you are responsible for de-duplication of downlink messages.
     * </pre>
     */
    public void subscribe(org.thethingsnetwork.api.router.SubscribeRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.router.DownlinkMessage> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_SUBSCRIBE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gateway requests device activation
     * </pre>
     */
    public void activate(org.thethingsnetwork.api.router.DeviceActivationRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.router.DeviceActivationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ACTIVATE, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The Router service provides pure network functionality
   * </pre>
   */
  public static final class RouterBlockingStub extends io.grpc.stub.AbstractStub<RouterBlockingStub> {
    private RouterBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RouterBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RouterBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RouterBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Gateway subscribes to downlink messages from Router
     * It is possible to open multiple subscriptions (but not recommended).
     * If you do this, you are responsible for de-duplication of downlink messages.
     * </pre>
     */
    public java.util.Iterator<org.thethingsnetwork.api.router.DownlinkMessage> subscribe(
        org.thethingsnetwork.api.router.SubscribeRequest request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_SUBSCRIBE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Gateway requests device activation
     * </pre>
     */
    public org.thethingsnetwork.api.router.DeviceActivationResponse activate(org.thethingsnetwork.api.router.DeviceActivationRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ACTIVATE, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The Router service provides pure network functionality
   * </pre>
   */
  public static final class RouterFutureStub extends io.grpc.stub.AbstractStub<RouterFutureStub> {
    private RouterFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RouterFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RouterFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RouterFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Gateway requests device activation
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.api.router.DeviceActivationResponse> activate(
        org.thethingsnetwork.api.router.DeviceActivationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ACTIVATE, getCallOptions()), request);
    }
  }

  private static final int METHODID_SUBSCRIBE = 0;
  private static final int METHODID_ACTIVATE = 1;
  private static final int METHODID_GATEWAY_STATUS = 2;
  private static final int METHODID_UPLINK = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RouterImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RouterImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SUBSCRIBE:
          serviceImpl.subscribe((org.thethingsnetwork.api.router.SubscribeRequest) request,
              (io.grpc.stub.StreamObserver<org.thethingsnetwork.api.router.DownlinkMessage>) responseObserver);
          break;
        case METHODID_ACTIVATE:
          serviceImpl.activate((org.thethingsnetwork.api.router.DeviceActivationRequest) request,
              (io.grpc.stub.StreamObserver<org.thethingsnetwork.api.router.DeviceActivationResponse>) responseObserver);
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
        case METHODID_GATEWAY_STATUS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.gatewayStatus(
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
        case METHODID_UPLINK:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.uplink(
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class RouterDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.thethingsnetwork.api.router.RouterProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (RouterGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RouterDescriptorSupplier())
              .addMethod(METHOD_GATEWAY_STATUS)
              .addMethod(METHOD_UPLINK)
              .addMethod(METHOD_SUBSCRIBE)
              .addMethod(METHOD_ACTIVATE)
              .build();
        }
      }
    }
    return result;
  }
}
