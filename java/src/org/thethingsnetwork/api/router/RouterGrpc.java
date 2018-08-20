package org.thethingsnetwork.api.router;

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
  private static volatile io.grpc.MethodDescriptor<org.thethingsnetwork.api.gateway.Status,
      com.google.protobuf.Empty> getGatewayStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GatewayStatus",
      requestType = org.thethingsnetwork.api.gateway.Status.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<org.thethingsnetwork.api.gateway.Status,
      com.google.protobuf.Empty> getGatewayStatusMethod() {
    io.grpc.MethodDescriptor<org.thethingsnetwork.api.gateway.Status, com.google.protobuf.Empty> getGatewayStatusMethod;
    if ((getGatewayStatusMethod = RouterGrpc.getGatewayStatusMethod) == null) {
      synchronized (RouterGrpc.class) {
        if ((getGatewayStatusMethod = RouterGrpc.getGatewayStatusMethod) == null) {
          RouterGrpc.getGatewayStatusMethod = getGatewayStatusMethod = 
              io.grpc.MethodDescriptor.<org.thethingsnetwork.api.gateway.Status, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "router.Router", "GatewayStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.thethingsnetwork.api.gateway.Status.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new RouterMethodDescriptorSupplier("GatewayStatus"))
                  .build();
          }
        }
     }
     return getGatewayStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.thethingsnetwork.api.router.UplinkMessage,
      com.google.protobuf.Empty> getUplinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Uplink",
      requestType = org.thethingsnetwork.api.router.UplinkMessage.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<org.thethingsnetwork.api.router.UplinkMessage,
      com.google.protobuf.Empty> getUplinkMethod() {
    io.grpc.MethodDescriptor<org.thethingsnetwork.api.router.UplinkMessage, com.google.protobuf.Empty> getUplinkMethod;
    if ((getUplinkMethod = RouterGrpc.getUplinkMethod) == null) {
      synchronized (RouterGrpc.class) {
        if ((getUplinkMethod = RouterGrpc.getUplinkMethod) == null) {
          RouterGrpc.getUplinkMethod = getUplinkMethod = 
              io.grpc.MethodDescriptor.<org.thethingsnetwork.api.router.UplinkMessage, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "router.Router", "Uplink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.thethingsnetwork.api.router.UplinkMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new RouterMethodDescriptorSupplier("Uplink"))
                  .build();
          }
        }
     }
     return getUplinkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.thethingsnetwork.api.router.SubscribeRequest,
      org.thethingsnetwork.api.router.DownlinkMessage> getSubscribeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Subscribe",
      requestType = org.thethingsnetwork.api.router.SubscribeRequest.class,
      responseType = org.thethingsnetwork.api.router.DownlinkMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.thethingsnetwork.api.router.SubscribeRequest,
      org.thethingsnetwork.api.router.DownlinkMessage> getSubscribeMethod() {
    io.grpc.MethodDescriptor<org.thethingsnetwork.api.router.SubscribeRequest, org.thethingsnetwork.api.router.DownlinkMessage> getSubscribeMethod;
    if ((getSubscribeMethod = RouterGrpc.getSubscribeMethod) == null) {
      synchronized (RouterGrpc.class) {
        if ((getSubscribeMethod = RouterGrpc.getSubscribeMethod) == null) {
          RouterGrpc.getSubscribeMethod = getSubscribeMethod = 
              io.grpc.MethodDescriptor.<org.thethingsnetwork.api.router.SubscribeRequest, org.thethingsnetwork.api.router.DownlinkMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "router.Router", "Subscribe"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.thethingsnetwork.api.router.SubscribeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.thethingsnetwork.api.router.DownlinkMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new RouterMethodDescriptorSupplier("Subscribe"))
                  .build();
          }
        }
     }
     return getSubscribeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.thethingsnetwork.api.router.DeviceActivationRequest,
      org.thethingsnetwork.api.router.DeviceActivationResponse> getActivateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Activate",
      requestType = org.thethingsnetwork.api.router.DeviceActivationRequest.class,
      responseType = org.thethingsnetwork.api.router.DeviceActivationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.thethingsnetwork.api.router.DeviceActivationRequest,
      org.thethingsnetwork.api.router.DeviceActivationResponse> getActivateMethod() {
    io.grpc.MethodDescriptor<org.thethingsnetwork.api.router.DeviceActivationRequest, org.thethingsnetwork.api.router.DeviceActivationResponse> getActivateMethod;
    if ((getActivateMethod = RouterGrpc.getActivateMethod) == null) {
      synchronized (RouterGrpc.class) {
        if ((getActivateMethod = RouterGrpc.getActivateMethod) == null) {
          RouterGrpc.getActivateMethod = getActivateMethod = 
              io.grpc.MethodDescriptor.<org.thethingsnetwork.api.router.DeviceActivationRequest, org.thethingsnetwork.api.router.DeviceActivationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "router.Router", "Activate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.thethingsnetwork.api.router.DeviceActivationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.thethingsnetwork.api.router.DeviceActivationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RouterMethodDescriptorSupplier("Activate"))
                  .build();
          }
        }
     }
     return getActivateMethod;
  }

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
      return asyncUnimplementedStreamingCall(getGatewayStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gateway streams uplink messages to Router
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.api.router.UplinkMessage> uplink(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncUnimplementedStreamingCall(getUplinkMethod(), responseObserver);
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
      asyncUnimplementedUnaryCall(getSubscribeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gateway requests device activation
     * </pre>
     */
    public void activate(org.thethingsnetwork.api.router.DeviceActivationRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.router.DeviceActivationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getActivateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGatewayStatusMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                org.thethingsnetwork.api.gateway.Status,
                com.google.protobuf.Empty>(
                  this, METHODID_GATEWAY_STATUS)))
          .addMethod(
            getUplinkMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                org.thethingsnetwork.api.router.UplinkMessage,
                com.google.protobuf.Empty>(
                  this, METHODID_UPLINK)))
          .addMethod(
            getSubscribeMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                org.thethingsnetwork.api.router.SubscribeRequest,
                org.thethingsnetwork.api.router.DownlinkMessage>(
                  this, METHODID_SUBSCRIBE)))
          .addMethod(
            getActivateMethod(),
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
          getChannel().newCall(getGatewayStatusMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Gateway streams uplink messages to Router
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.api.router.UplinkMessage> uplink(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getUplinkMethod(), getCallOptions()), responseObserver);
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
          getChannel().newCall(getSubscribeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gateway requests device activation
     * </pre>
     */
    public void activate(org.thethingsnetwork.api.router.DeviceActivationRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.router.DeviceActivationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getActivateMethod(), getCallOptions()), request, responseObserver);
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
          getChannel(), getSubscribeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gateway requests device activation
     * </pre>
     */
    public org.thethingsnetwork.api.router.DeviceActivationResponse activate(org.thethingsnetwork.api.router.DeviceActivationRequest request) {
      return blockingUnaryCall(
          getChannel(), getActivateMethod(), getCallOptions(), request);
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
          getChannel().newCall(getActivateMethod(), getCallOptions()), request);
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

  private static abstract class RouterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RouterBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.thethingsnetwork.api.router.RouterProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Router");
    }
  }

  private static final class RouterFileDescriptorSupplier
      extends RouterBaseDescriptorSupplier {
    RouterFileDescriptorSupplier() {}
  }

  private static final class RouterMethodDescriptorSupplier
      extends RouterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RouterMethodDescriptorSupplier(String methodName) {
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
      synchronized (RouterGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RouterFileDescriptorSupplier())
              .addMethod(getGatewayStatusMethod())
              .addMethod(getUplinkMethod())
              .addMethod(getSubscribeMethod())
              .addMethod(getActivateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
