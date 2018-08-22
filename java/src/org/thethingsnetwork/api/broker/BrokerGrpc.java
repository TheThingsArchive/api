package org.thethingsnetwork.api.broker;

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
 * The Broker service provides pure network functionality
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: github.com/TheThingsNetwork/api/broker/broker.proto")
public final class BrokerGrpc {

  private BrokerGrpc() {}

  public static final String SERVICE_NAME = "broker.Broker";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.thethingsnetwork.api.broker.UplinkMessage,
      org.thethingsnetwork.api.broker.DownlinkMessage> getAssociateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Associate",
      requestType = org.thethingsnetwork.api.broker.UplinkMessage.class,
      responseType = org.thethingsnetwork.api.broker.DownlinkMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<org.thethingsnetwork.api.broker.UplinkMessage,
      org.thethingsnetwork.api.broker.DownlinkMessage> getAssociateMethod() {
    io.grpc.MethodDescriptor<org.thethingsnetwork.api.broker.UplinkMessage, org.thethingsnetwork.api.broker.DownlinkMessage> getAssociateMethod;
    if ((getAssociateMethod = BrokerGrpc.getAssociateMethod) == null) {
      synchronized (BrokerGrpc.class) {
        if ((getAssociateMethod = BrokerGrpc.getAssociateMethod) == null) {
          BrokerGrpc.getAssociateMethod = getAssociateMethod = 
              io.grpc.MethodDescriptor.<org.thethingsnetwork.api.broker.UplinkMessage, org.thethingsnetwork.api.broker.DownlinkMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "broker.Broker", "Associate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.thethingsnetwork.api.broker.UplinkMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.thethingsnetwork.api.broker.DownlinkMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new BrokerMethodDescriptorSupplier("Associate"))
                  .build();
          }
        }
     }
     return getAssociateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.thethingsnetwork.api.broker.SubscribeRequest,
      org.thethingsnetwork.api.broker.DeduplicatedUplinkMessage> getSubscribeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Subscribe",
      requestType = org.thethingsnetwork.api.broker.SubscribeRequest.class,
      responseType = org.thethingsnetwork.api.broker.DeduplicatedUplinkMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.thethingsnetwork.api.broker.SubscribeRequest,
      org.thethingsnetwork.api.broker.DeduplicatedUplinkMessage> getSubscribeMethod() {
    io.grpc.MethodDescriptor<org.thethingsnetwork.api.broker.SubscribeRequest, org.thethingsnetwork.api.broker.DeduplicatedUplinkMessage> getSubscribeMethod;
    if ((getSubscribeMethod = BrokerGrpc.getSubscribeMethod) == null) {
      synchronized (BrokerGrpc.class) {
        if ((getSubscribeMethod = BrokerGrpc.getSubscribeMethod) == null) {
          BrokerGrpc.getSubscribeMethod = getSubscribeMethod = 
              io.grpc.MethodDescriptor.<org.thethingsnetwork.api.broker.SubscribeRequest, org.thethingsnetwork.api.broker.DeduplicatedUplinkMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "broker.Broker", "Subscribe"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.thethingsnetwork.api.broker.SubscribeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.thethingsnetwork.api.broker.DeduplicatedUplinkMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new BrokerMethodDescriptorSupplier("Subscribe"))
                  .build();
          }
        }
     }
     return getSubscribeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.thethingsnetwork.api.broker.DownlinkMessage,
      com.google.protobuf.Empty> getPublishMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Publish",
      requestType = org.thethingsnetwork.api.broker.DownlinkMessage.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<org.thethingsnetwork.api.broker.DownlinkMessage,
      com.google.protobuf.Empty> getPublishMethod() {
    io.grpc.MethodDescriptor<org.thethingsnetwork.api.broker.DownlinkMessage, com.google.protobuf.Empty> getPublishMethod;
    if ((getPublishMethod = BrokerGrpc.getPublishMethod) == null) {
      synchronized (BrokerGrpc.class) {
        if ((getPublishMethod = BrokerGrpc.getPublishMethod) == null) {
          BrokerGrpc.getPublishMethod = getPublishMethod = 
              io.grpc.MethodDescriptor.<org.thethingsnetwork.api.broker.DownlinkMessage, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "broker.Broker", "Publish"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.thethingsnetwork.api.broker.DownlinkMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new BrokerMethodDescriptorSupplier("Publish"))
                  .build();
          }
        }
     }
     return getPublishMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.thethingsnetwork.api.broker.DeviceActivationRequest,
      org.thethingsnetwork.api.broker.DeviceActivationResponse> getActivateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Activate",
      requestType = org.thethingsnetwork.api.broker.DeviceActivationRequest.class,
      responseType = org.thethingsnetwork.api.broker.DeviceActivationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.thethingsnetwork.api.broker.DeviceActivationRequest,
      org.thethingsnetwork.api.broker.DeviceActivationResponse> getActivateMethod() {
    io.grpc.MethodDescriptor<org.thethingsnetwork.api.broker.DeviceActivationRequest, org.thethingsnetwork.api.broker.DeviceActivationResponse> getActivateMethod;
    if ((getActivateMethod = BrokerGrpc.getActivateMethod) == null) {
      synchronized (BrokerGrpc.class) {
        if ((getActivateMethod = BrokerGrpc.getActivateMethod) == null) {
          BrokerGrpc.getActivateMethod = getActivateMethod = 
              io.grpc.MethodDescriptor.<org.thethingsnetwork.api.broker.DeviceActivationRequest, org.thethingsnetwork.api.broker.DeviceActivationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "broker.Broker", "Activate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.thethingsnetwork.api.broker.DeviceActivationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.thethingsnetwork.api.broker.DeviceActivationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BrokerMethodDescriptorSupplier("Activate"))
                  .build();
          }
        }
     }
     return getActivateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BrokerStub newStub(io.grpc.Channel channel) {
    return new BrokerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BrokerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BrokerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BrokerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BrokerFutureStub(channel);
  }

  /**
   * <pre>
   * The Broker service provides pure network functionality
   * </pre>
   */
  public static abstract class BrokerImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Router initiates an Association with the Broker.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.api.broker.UplinkMessage> associate(
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.broker.DownlinkMessage> responseObserver) {
      return asyncUnimplementedStreamingCall(getAssociateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Handler subscribes to uplink stream.
     * </pre>
     */
    public void subscribe(org.thethingsnetwork.api.broker.SubscribeRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.broker.DeduplicatedUplinkMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getSubscribeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Handler initiates downlink stream.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.api.broker.DownlinkMessage> publish(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncUnimplementedStreamingCall(getPublishMethod(), responseObserver);
    }

    /**
     * <pre>
     * Router requests device activation
     * </pre>
     */
    public void activate(org.thethingsnetwork.api.broker.DeviceActivationRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.broker.DeviceActivationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getActivateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAssociateMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                org.thethingsnetwork.api.broker.UplinkMessage,
                org.thethingsnetwork.api.broker.DownlinkMessage>(
                  this, METHODID_ASSOCIATE)))
          .addMethod(
            getSubscribeMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                org.thethingsnetwork.api.broker.SubscribeRequest,
                org.thethingsnetwork.api.broker.DeduplicatedUplinkMessage>(
                  this, METHODID_SUBSCRIBE)))
          .addMethod(
            getPublishMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                org.thethingsnetwork.api.broker.DownlinkMessage,
                com.google.protobuf.Empty>(
                  this, METHODID_PUBLISH)))
          .addMethod(
            getActivateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.thethingsnetwork.api.broker.DeviceActivationRequest,
                org.thethingsnetwork.api.broker.DeviceActivationResponse>(
                  this, METHODID_ACTIVATE)))
          .build();
    }
  }

  /**
   * <pre>
   * The Broker service provides pure network functionality
   * </pre>
   */
  public static final class BrokerStub extends io.grpc.stub.AbstractStub<BrokerStub> {
    private BrokerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BrokerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BrokerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BrokerStub(channel, callOptions);
    }

    /**
     * <pre>
     * Router initiates an Association with the Broker.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.api.broker.UplinkMessage> associate(
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.broker.DownlinkMessage> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getAssociateMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Handler subscribes to uplink stream.
     * </pre>
     */
    public void subscribe(org.thethingsnetwork.api.broker.SubscribeRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.broker.DeduplicatedUplinkMessage> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getSubscribeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Handler initiates downlink stream.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.api.broker.DownlinkMessage> publish(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getPublishMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Router requests device activation
     * </pre>
     */
    public void activate(org.thethingsnetwork.api.broker.DeviceActivationRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.broker.DeviceActivationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getActivateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The Broker service provides pure network functionality
   * </pre>
   */
  public static final class BrokerBlockingStub extends io.grpc.stub.AbstractStub<BrokerBlockingStub> {
    private BrokerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BrokerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BrokerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BrokerBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Handler subscribes to uplink stream.
     * </pre>
     */
    public java.util.Iterator<org.thethingsnetwork.api.broker.DeduplicatedUplinkMessage> subscribe(
        org.thethingsnetwork.api.broker.SubscribeRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getSubscribeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Router requests device activation
     * </pre>
     */
    public org.thethingsnetwork.api.broker.DeviceActivationResponse activate(org.thethingsnetwork.api.broker.DeviceActivationRequest request) {
      return blockingUnaryCall(
          getChannel(), getActivateMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The Broker service provides pure network functionality
   * </pre>
   */
  public static final class BrokerFutureStub extends io.grpc.stub.AbstractStub<BrokerFutureStub> {
    private BrokerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BrokerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BrokerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BrokerFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Router requests device activation
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.api.broker.DeviceActivationResponse> activate(
        org.thethingsnetwork.api.broker.DeviceActivationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getActivateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SUBSCRIBE = 0;
  private static final int METHODID_ACTIVATE = 1;
  private static final int METHODID_ASSOCIATE = 2;
  private static final int METHODID_PUBLISH = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BrokerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BrokerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SUBSCRIBE:
          serviceImpl.subscribe((org.thethingsnetwork.api.broker.SubscribeRequest) request,
              (io.grpc.stub.StreamObserver<org.thethingsnetwork.api.broker.DeduplicatedUplinkMessage>) responseObserver);
          break;
        case METHODID_ACTIVATE:
          serviceImpl.activate((org.thethingsnetwork.api.broker.DeviceActivationRequest) request,
              (io.grpc.stub.StreamObserver<org.thethingsnetwork.api.broker.DeviceActivationResponse>) responseObserver);
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
        case METHODID_ASSOCIATE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.associate(
              (io.grpc.stub.StreamObserver<org.thethingsnetwork.api.broker.DownlinkMessage>) responseObserver);
        case METHODID_PUBLISH:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.publish(
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class BrokerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BrokerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.thethingsnetwork.api.broker.BrokerProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Broker");
    }
  }

  private static final class BrokerFileDescriptorSupplier
      extends BrokerBaseDescriptorSupplier {
    BrokerFileDescriptorSupplier() {}
  }

  private static final class BrokerMethodDescriptorSupplier
      extends BrokerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BrokerMethodDescriptorSupplier(String methodName) {
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
      synchronized (BrokerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BrokerFileDescriptorSupplier())
              .addMethod(getAssociateMethod())
              .addMethod(getSubscribeMethod())
              .addMethod(getPublishMethod())
              .addMethod(getActivateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
