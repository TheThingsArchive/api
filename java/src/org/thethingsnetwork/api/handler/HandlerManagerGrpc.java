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
 * The HandlerManager service provides configuration and monitoring
 * functionality
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: github.com/TheThingsNetwork/api/handler/handler.proto")
public final class HandlerManagerGrpc {

  private HandlerManagerGrpc() {}

  public static final String SERVICE_NAME = "handler.HandlerManager";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.thethingsnetwork.api.handler.StatusRequest,
      org.thethingsnetwork.api.handler.Status> getGetStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStatus",
      requestType = org.thethingsnetwork.api.handler.StatusRequest.class,
      responseType = org.thethingsnetwork.api.handler.Status.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.thethingsnetwork.api.handler.StatusRequest,
      org.thethingsnetwork.api.handler.Status> getGetStatusMethod() {
    io.grpc.MethodDescriptor<org.thethingsnetwork.api.handler.StatusRequest, org.thethingsnetwork.api.handler.Status> getGetStatusMethod;
    if ((getGetStatusMethod = HandlerManagerGrpc.getGetStatusMethod) == null) {
      synchronized (HandlerManagerGrpc.class) {
        if ((getGetStatusMethod = HandlerManagerGrpc.getGetStatusMethod) == null) {
          HandlerManagerGrpc.getGetStatusMethod = getGetStatusMethod = 
              io.grpc.MethodDescriptor.<org.thethingsnetwork.api.handler.StatusRequest, org.thethingsnetwork.api.handler.Status>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "handler.HandlerManager", "GetStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.thethingsnetwork.api.handler.StatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.thethingsnetwork.api.handler.Status.getDefaultInstance()))
                  .setSchemaDescriptor(new HandlerManagerMethodDescriptorSupplier("GetStatus"))
                  .build();
          }
        }
     }
     return getGetStatusMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HandlerManagerStub newStub(io.grpc.Channel channel) {
    return new HandlerManagerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HandlerManagerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new HandlerManagerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HandlerManagerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new HandlerManagerFutureStub(channel);
  }

  /**
   * <pre>
   * The HandlerManager service provides configuration and monitoring
   * functionality
   * </pre>
   */
  public static abstract class HandlerManagerImplBase implements io.grpc.BindableService {

    /**
     */
    public void getStatus(org.thethingsnetwork.api.handler.StatusRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.handler.Status> responseObserver) {
      asyncUnimplementedUnaryCall(getGetStatusMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.thethingsnetwork.api.handler.StatusRequest,
                org.thethingsnetwork.api.handler.Status>(
                  this, METHODID_GET_STATUS)))
          .build();
    }
  }

  /**
   * <pre>
   * The HandlerManager service provides configuration and monitoring
   * functionality
   * </pre>
   */
  public static final class HandlerManagerStub extends io.grpc.stub.AbstractStub<HandlerManagerStub> {
    private HandlerManagerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HandlerManagerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HandlerManagerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HandlerManagerStub(channel, callOptions);
    }

    /**
     */
    public void getStatus(org.thethingsnetwork.api.handler.StatusRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.handler.Status> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetStatusMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The HandlerManager service provides configuration and monitoring
   * functionality
   * </pre>
   */
  public static final class HandlerManagerBlockingStub extends io.grpc.stub.AbstractStub<HandlerManagerBlockingStub> {
    private HandlerManagerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HandlerManagerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HandlerManagerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HandlerManagerBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.thethingsnetwork.api.handler.Status getStatus(org.thethingsnetwork.api.handler.StatusRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetStatusMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The HandlerManager service provides configuration and monitoring
   * functionality
   * </pre>
   */
  public static final class HandlerManagerFutureStub extends io.grpc.stub.AbstractStub<HandlerManagerFutureStub> {
    private HandlerManagerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HandlerManagerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HandlerManagerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HandlerManagerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.api.handler.Status> getStatus(
        org.thethingsnetwork.api.handler.StatusRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetStatusMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_STATUS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HandlerManagerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HandlerManagerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_STATUS:
          serviceImpl.getStatus((org.thethingsnetwork.api.handler.StatusRequest) request,
              (io.grpc.stub.StreamObserver<org.thethingsnetwork.api.handler.Status>) responseObserver);
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

  private static abstract class HandlerManagerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HandlerManagerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.thethingsnetwork.api.handler.HandlerProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HandlerManager");
    }
  }

  private static final class HandlerManagerFileDescriptorSupplier
      extends HandlerManagerBaseDescriptorSupplier {
    HandlerManagerFileDescriptorSupplier() {}
  }

  private static final class HandlerManagerMethodDescriptorSupplier
      extends HandlerManagerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HandlerManagerMethodDescriptorSupplier(String methodName) {
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
      synchronized (HandlerManagerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HandlerManagerFileDescriptorSupplier())
              .addMethod(getGetStatusMethod())
              .build();
        }
      }
    }
    return result;
  }
}
