package org.thethingsnetwork.api.protocol.lorawan;

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
 * The Device Addresses in the network are issued by the NetworkServer
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: github.com/TheThingsNetwork/api/protocol/lorawan/device_address.proto")
public final class DevAddrManagerGrpc {

  private DevAddrManagerGrpc() {}

  public static final String SERVICE_NAME = "lorawan.DevAddrManager";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.api.protocol.lorawan.PrefixesRequest,
      org.thethingsnetwork.api.protocol.lorawan.PrefixesResponse> METHOD_GET_PREFIXES =
      io.grpc.MethodDescriptor.<org.thethingsnetwork.api.protocol.lorawan.PrefixesRequest, org.thethingsnetwork.api.protocol.lorawan.PrefixesResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "lorawan.DevAddrManager", "GetPrefixes"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.thethingsnetwork.api.protocol.lorawan.PrefixesRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.thethingsnetwork.api.protocol.lorawan.PrefixesResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.api.protocol.lorawan.DevAddrRequest,
      org.thethingsnetwork.api.protocol.lorawan.DevAddrResponse> METHOD_GET_DEV_ADDR =
      io.grpc.MethodDescriptor.<org.thethingsnetwork.api.protocol.lorawan.DevAddrRequest, org.thethingsnetwork.api.protocol.lorawan.DevAddrResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "lorawan.DevAddrManager", "GetDevAddr"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.thethingsnetwork.api.protocol.lorawan.DevAddrRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.thethingsnetwork.api.protocol.lorawan.DevAddrResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DevAddrManagerStub newStub(io.grpc.Channel channel) {
    return new DevAddrManagerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DevAddrManagerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DevAddrManagerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DevAddrManagerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DevAddrManagerFutureStub(channel);
  }

  /**
   * <pre>
   * The Device Addresses in the network are issued by the NetworkServer
   * </pre>
   */
  public static abstract class DevAddrManagerImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Get all prefixes that are in use or available
     * </pre>
     */
    public void getPrefixes(org.thethingsnetwork.api.protocol.lorawan.PrefixesRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.protocol.lorawan.PrefixesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_PREFIXES, responseObserver);
    }

    /**
     * <pre>
     * Request a device address
     * </pre>
     */
    public void getDevAddr(org.thethingsnetwork.api.protocol.lorawan.DevAddrRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.protocol.lorawan.DevAddrResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_DEV_ADDR, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_PREFIXES,
            asyncUnaryCall(
              new MethodHandlers<
                org.thethingsnetwork.api.protocol.lorawan.PrefixesRequest,
                org.thethingsnetwork.api.protocol.lorawan.PrefixesResponse>(
                  this, METHODID_GET_PREFIXES)))
          .addMethod(
            METHOD_GET_DEV_ADDR,
            asyncUnaryCall(
              new MethodHandlers<
                org.thethingsnetwork.api.protocol.lorawan.DevAddrRequest,
                org.thethingsnetwork.api.protocol.lorawan.DevAddrResponse>(
                  this, METHODID_GET_DEV_ADDR)))
          .build();
    }
  }

  /**
   * <pre>
   * The Device Addresses in the network are issued by the NetworkServer
   * </pre>
   */
  public static final class DevAddrManagerStub extends io.grpc.stub.AbstractStub<DevAddrManagerStub> {
    private DevAddrManagerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DevAddrManagerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DevAddrManagerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DevAddrManagerStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get all prefixes that are in use or available
     * </pre>
     */
    public void getPrefixes(org.thethingsnetwork.api.protocol.lorawan.PrefixesRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.protocol.lorawan.PrefixesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_PREFIXES, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Request a device address
     * </pre>
     */
    public void getDevAddr(org.thethingsnetwork.api.protocol.lorawan.DevAddrRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.protocol.lorawan.DevAddrResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_DEV_ADDR, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The Device Addresses in the network are issued by the NetworkServer
   * </pre>
   */
  public static final class DevAddrManagerBlockingStub extends io.grpc.stub.AbstractStub<DevAddrManagerBlockingStub> {
    private DevAddrManagerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DevAddrManagerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DevAddrManagerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DevAddrManagerBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get all prefixes that are in use or available
     * </pre>
     */
    public org.thethingsnetwork.api.protocol.lorawan.PrefixesResponse getPrefixes(org.thethingsnetwork.api.protocol.lorawan.PrefixesRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_PREFIXES, getCallOptions(), request);
    }

    /**
     * <pre>
     * Request a device address
     * </pre>
     */
    public org.thethingsnetwork.api.protocol.lorawan.DevAddrResponse getDevAddr(org.thethingsnetwork.api.protocol.lorawan.DevAddrRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_DEV_ADDR, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The Device Addresses in the network are issued by the NetworkServer
   * </pre>
   */
  public static final class DevAddrManagerFutureStub extends io.grpc.stub.AbstractStub<DevAddrManagerFutureStub> {
    private DevAddrManagerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DevAddrManagerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DevAddrManagerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DevAddrManagerFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get all prefixes that are in use or available
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.api.protocol.lorawan.PrefixesResponse> getPrefixes(
        org.thethingsnetwork.api.protocol.lorawan.PrefixesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_PREFIXES, getCallOptions()), request);
    }

    /**
     * <pre>
     * Request a device address
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.api.protocol.lorawan.DevAddrResponse> getDevAddr(
        org.thethingsnetwork.api.protocol.lorawan.DevAddrRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_DEV_ADDR, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PREFIXES = 0;
  private static final int METHODID_GET_DEV_ADDR = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DevAddrManagerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DevAddrManagerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PREFIXES:
          serviceImpl.getPrefixes((org.thethingsnetwork.api.protocol.lorawan.PrefixesRequest) request,
              (io.grpc.stub.StreamObserver<org.thethingsnetwork.api.protocol.lorawan.PrefixesResponse>) responseObserver);
          break;
        case METHODID_GET_DEV_ADDR:
          serviceImpl.getDevAddr((org.thethingsnetwork.api.protocol.lorawan.DevAddrRequest) request,
              (io.grpc.stub.StreamObserver<org.thethingsnetwork.api.protocol.lorawan.DevAddrResponse>) responseObserver);
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

  private static final class DevAddrManagerDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.thethingsnetwork.api.protocol.lorawan.LoRaWANProtocolProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (DevAddrManagerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DevAddrManagerDescriptorSupplier())
              .addMethod(METHOD_GET_PREFIXES)
              .addMethod(METHOD_GET_DEV_ADDR)
              .build();
        }
      }
    }
    return result;
  }
}
