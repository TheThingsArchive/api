package org.thethingsnetwork.api.handler;

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
 * The Handler service provides pure network functionality
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: github.com/TheThingsNetwork/api/handler/handler.proto")
public final class HandlerGrpc {

  private HandlerGrpc() {}

  public static final String SERVICE_NAME = "handler.Handler";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.thethingsnetwork.api.broker.ActivationChallengeRequest,
      org.thethingsnetwork.api.broker.ActivationChallengeResponse> getActivationChallengeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ActivationChallenge",
      requestType = org.thethingsnetwork.api.broker.ActivationChallengeRequest.class,
      responseType = org.thethingsnetwork.api.broker.ActivationChallengeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.thethingsnetwork.api.broker.ActivationChallengeRequest,
      org.thethingsnetwork.api.broker.ActivationChallengeResponse> getActivationChallengeMethod() {
    io.grpc.MethodDescriptor<org.thethingsnetwork.api.broker.ActivationChallengeRequest, org.thethingsnetwork.api.broker.ActivationChallengeResponse> getActivationChallengeMethod;
    if ((getActivationChallengeMethod = HandlerGrpc.getActivationChallengeMethod) == null) {
      synchronized (HandlerGrpc.class) {
        if ((getActivationChallengeMethod = HandlerGrpc.getActivationChallengeMethod) == null) {
          HandlerGrpc.getActivationChallengeMethod = getActivationChallengeMethod = 
              io.grpc.MethodDescriptor.<org.thethingsnetwork.api.broker.ActivationChallengeRequest, org.thethingsnetwork.api.broker.ActivationChallengeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "handler.Handler", "ActivationChallenge"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.thethingsnetwork.api.broker.ActivationChallengeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.thethingsnetwork.api.broker.ActivationChallengeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HandlerMethodDescriptorSupplier("ActivationChallenge"))
                  .build();
          }
        }
     }
     return getActivationChallengeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.thethingsnetwork.api.broker.DeduplicatedDeviceActivationRequest,
      org.thethingsnetwork.api.handler.DeviceActivationResponse> getActivateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Activate",
      requestType = org.thethingsnetwork.api.broker.DeduplicatedDeviceActivationRequest.class,
      responseType = org.thethingsnetwork.api.handler.DeviceActivationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.thethingsnetwork.api.broker.DeduplicatedDeviceActivationRequest,
      org.thethingsnetwork.api.handler.DeviceActivationResponse> getActivateMethod() {
    io.grpc.MethodDescriptor<org.thethingsnetwork.api.broker.DeduplicatedDeviceActivationRequest, org.thethingsnetwork.api.handler.DeviceActivationResponse> getActivateMethod;
    if ((getActivateMethod = HandlerGrpc.getActivateMethod) == null) {
      synchronized (HandlerGrpc.class) {
        if ((getActivateMethod = HandlerGrpc.getActivateMethod) == null) {
          HandlerGrpc.getActivateMethod = getActivateMethod = 
              io.grpc.MethodDescriptor.<org.thethingsnetwork.api.broker.DeduplicatedDeviceActivationRequest, org.thethingsnetwork.api.handler.DeviceActivationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "handler.Handler", "Activate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.thethingsnetwork.api.broker.DeduplicatedDeviceActivationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.thethingsnetwork.api.handler.DeviceActivationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HandlerMethodDescriptorSupplier("Activate"))
                  .build();
          }
        }
     }
     return getActivateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HandlerStub newStub(io.grpc.Channel channel) {
    return new HandlerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HandlerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new HandlerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HandlerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new HandlerFutureStub(channel);
  }

  /**
   * <pre>
   * The Handler service provides pure network functionality
   * </pre>
   */
  public static abstract class HandlerImplBase implements io.grpc.BindableService {

    /**
     */
    public void activationChallenge(org.thethingsnetwork.api.broker.ActivationChallengeRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.broker.ActivationChallengeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getActivationChallengeMethod(), responseObserver);
    }

    /**
     */
    public void activate(org.thethingsnetwork.api.broker.DeduplicatedDeviceActivationRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.handler.DeviceActivationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getActivateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getActivationChallengeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.thethingsnetwork.api.broker.ActivationChallengeRequest,
                org.thethingsnetwork.api.broker.ActivationChallengeResponse>(
                  this, METHODID_ACTIVATION_CHALLENGE)))
          .addMethod(
            getActivateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.thethingsnetwork.api.broker.DeduplicatedDeviceActivationRequest,
                org.thethingsnetwork.api.handler.DeviceActivationResponse>(
                  this, METHODID_ACTIVATE)))
          .build();
    }
  }

  /**
   * <pre>
   * The Handler service provides pure network functionality
   * </pre>
   */
  public static final class HandlerStub extends io.grpc.stub.AbstractStub<HandlerStub> {
    private HandlerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HandlerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HandlerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HandlerStub(channel, callOptions);
    }

    /**
     */
    public void activationChallenge(org.thethingsnetwork.api.broker.ActivationChallengeRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.broker.ActivationChallengeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getActivationChallengeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void activate(org.thethingsnetwork.api.broker.DeduplicatedDeviceActivationRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.handler.DeviceActivationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getActivateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The Handler service provides pure network functionality
   * </pre>
   */
  public static final class HandlerBlockingStub extends io.grpc.stub.AbstractStub<HandlerBlockingStub> {
    private HandlerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HandlerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HandlerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HandlerBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.thethingsnetwork.api.broker.ActivationChallengeResponse activationChallenge(org.thethingsnetwork.api.broker.ActivationChallengeRequest request) {
      return blockingUnaryCall(
          getChannel(), getActivationChallengeMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.thethingsnetwork.api.handler.DeviceActivationResponse activate(org.thethingsnetwork.api.broker.DeduplicatedDeviceActivationRequest request) {
      return blockingUnaryCall(
          getChannel(), getActivateMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The Handler service provides pure network functionality
   * </pre>
   */
  public static final class HandlerFutureStub extends io.grpc.stub.AbstractStub<HandlerFutureStub> {
    private HandlerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HandlerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HandlerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HandlerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.api.broker.ActivationChallengeResponse> activationChallenge(
        org.thethingsnetwork.api.broker.ActivationChallengeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getActivationChallengeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.api.handler.DeviceActivationResponse> activate(
        org.thethingsnetwork.api.broker.DeduplicatedDeviceActivationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getActivateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ACTIVATION_CHALLENGE = 0;
  private static final int METHODID_ACTIVATE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HandlerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HandlerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ACTIVATION_CHALLENGE:
          serviceImpl.activationChallenge((org.thethingsnetwork.api.broker.ActivationChallengeRequest) request,
              (io.grpc.stub.StreamObserver<org.thethingsnetwork.api.broker.ActivationChallengeResponse>) responseObserver);
          break;
        case METHODID_ACTIVATE:
          serviceImpl.activate((org.thethingsnetwork.api.broker.DeduplicatedDeviceActivationRequest) request,
              (io.grpc.stub.StreamObserver<org.thethingsnetwork.api.handler.DeviceActivationResponse>) responseObserver);
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

  private static abstract class HandlerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HandlerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.thethingsnetwork.api.handler.HandlerProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Handler");
    }
  }

  private static final class HandlerFileDescriptorSupplier
      extends HandlerBaseDescriptorSupplier {
    HandlerFileDescriptorSupplier() {}
  }

  private static final class HandlerMethodDescriptorSupplier
      extends HandlerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HandlerMethodDescriptorSupplier(String methodName) {
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
      synchronized (HandlerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HandlerFileDescriptorSupplier())
              .addMethod(getActivationChallengeMethod())
              .addMethod(getActivateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
