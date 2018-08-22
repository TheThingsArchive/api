package org.thethingsnetwork.api.discovery;

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
 * The DiscoveryManager service provides configuration and monitoring functionality
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: github.com/TheThingsNetwork/api/discovery/discovery.proto")
public final class DiscoveryManagerGrpc {

  private DiscoveryManagerGrpc() {}

  public static final String SERVICE_NAME = "discovery.DiscoveryManager";

  // Static method descriptors that strictly reflect the proto.
  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DiscoveryManagerStub newStub(io.grpc.Channel channel) {
    return new DiscoveryManagerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DiscoveryManagerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DiscoveryManagerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DiscoveryManagerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DiscoveryManagerFutureStub(channel);
  }

  /**
   * <pre>
   * The DiscoveryManager service provides configuration and monitoring functionality
   * </pre>
   */
  public static abstract class DiscoveryManagerImplBase implements io.grpc.BindableService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .build();
    }
  }

  /**
   * <pre>
   * The DiscoveryManager service provides configuration and monitoring functionality
   * </pre>
   */
  public static final class DiscoveryManagerStub extends io.grpc.stub.AbstractStub<DiscoveryManagerStub> {
    private DiscoveryManagerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DiscoveryManagerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DiscoveryManagerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DiscoveryManagerStub(channel, callOptions);
    }
  }

  /**
   * <pre>
   * The DiscoveryManager service provides configuration and monitoring functionality
   * </pre>
   */
  public static final class DiscoveryManagerBlockingStub extends io.grpc.stub.AbstractStub<DiscoveryManagerBlockingStub> {
    private DiscoveryManagerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DiscoveryManagerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DiscoveryManagerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DiscoveryManagerBlockingStub(channel, callOptions);
    }
  }

  /**
   * <pre>
   * The DiscoveryManager service provides configuration and monitoring functionality
   * </pre>
   */
  public static final class DiscoveryManagerFutureStub extends io.grpc.stub.AbstractStub<DiscoveryManagerFutureStub> {
    private DiscoveryManagerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DiscoveryManagerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DiscoveryManagerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DiscoveryManagerFutureStub(channel, callOptions);
    }
  }


  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DiscoveryManagerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DiscoveryManagerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
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

  private static abstract class DiscoveryManagerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DiscoveryManagerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.thethingsnetwork.api.discovery.DiscoveryProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DiscoveryManager");
    }
  }

  private static final class DiscoveryManagerFileDescriptorSupplier
      extends DiscoveryManagerBaseDescriptorSupplier {
    DiscoveryManagerFileDescriptorSupplier() {}
  }

  private static final class DiscoveryManagerMethodDescriptorSupplier
      extends DiscoveryManagerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DiscoveryManagerMethodDescriptorSupplier(String methodName) {
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
      synchronized (DiscoveryManagerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DiscoveryManagerFileDescriptorSupplier())
              .build();
        }
      }
    }
    return result;
  }
}
