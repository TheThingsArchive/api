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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: github.com/TheThingsNetwork/api/protocol/lorawan/device.proto")
public final class DeviceManagerGrpc {

  private DeviceManagerGrpc() {}

  public static final String SERVICE_NAME = "lorawan.DeviceManager";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.api.protocol.lorawan.DeviceIdentifier,
      org.thethingsnetwork.api.protocol.lorawan.Device> METHOD_GET_DEVICE =
      io.grpc.MethodDescriptor.<org.thethingsnetwork.api.protocol.lorawan.DeviceIdentifier, org.thethingsnetwork.api.protocol.lorawan.Device>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "lorawan.DeviceManager", "GetDevice"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.thethingsnetwork.api.protocol.lorawan.DeviceIdentifier.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.thethingsnetwork.api.protocol.lorawan.Device.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.api.protocol.lorawan.Device,
      com.google.protobuf.Empty> METHOD_SET_DEVICE =
      io.grpc.MethodDescriptor.<org.thethingsnetwork.api.protocol.lorawan.Device, com.google.protobuf.Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "lorawan.DeviceManager", "SetDevice"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.thethingsnetwork.api.protocol.lorawan.Device.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.api.protocol.lorawan.DeviceIdentifier,
      com.google.protobuf.Empty> METHOD_DELETE_DEVICE =
      io.grpc.MethodDescriptor.<org.thethingsnetwork.api.protocol.lorawan.DeviceIdentifier, com.google.protobuf.Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "lorawan.DeviceManager", "DeleteDevice"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.thethingsnetwork.api.protocol.lorawan.DeviceIdentifier.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DeviceManagerStub newStub(io.grpc.Channel channel) {
    return new DeviceManagerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DeviceManagerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DeviceManagerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DeviceManagerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DeviceManagerFutureStub(channel);
  }

  /**
   */
  public static abstract class DeviceManagerImplBase implements io.grpc.BindableService {

    /**
     */
    public void getDevice(org.thethingsnetwork.api.protocol.lorawan.DeviceIdentifier request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.protocol.lorawan.Device> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_DEVICE, responseObserver);
    }

    /**
     */
    public void setDevice(org.thethingsnetwork.api.protocol.lorawan.Device request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SET_DEVICE, responseObserver);
    }

    /**
     */
    public void deleteDevice(org.thethingsnetwork.api.protocol.lorawan.DeviceIdentifier request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_DEVICE, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_DEVICE,
            asyncUnaryCall(
              new MethodHandlers<
                org.thethingsnetwork.api.protocol.lorawan.DeviceIdentifier,
                org.thethingsnetwork.api.protocol.lorawan.Device>(
                  this, METHODID_GET_DEVICE)))
          .addMethod(
            METHOD_SET_DEVICE,
            asyncUnaryCall(
              new MethodHandlers<
                org.thethingsnetwork.api.protocol.lorawan.Device,
                com.google.protobuf.Empty>(
                  this, METHODID_SET_DEVICE)))
          .addMethod(
            METHOD_DELETE_DEVICE,
            asyncUnaryCall(
              new MethodHandlers<
                org.thethingsnetwork.api.protocol.lorawan.DeviceIdentifier,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_DEVICE)))
          .build();
    }
  }

  /**
   */
  public static final class DeviceManagerStub extends io.grpc.stub.AbstractStub<DeviceManagerStub> {
    private DeviceManagerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DeviceManagerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeviceManagerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DeviceManagerStub(channel, callOptions);
    }

    /**
     */
    public void getDevice(org.thethingsnetwork.api.protocol.lorawan.DeviceIdentifier request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.protocol.lorawan.Device> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_DEVICE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setDevice(org.thethingsnetwork.api.protocol.lorawan.Device request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SET_DEVICE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteDevice(org.thethingsnetwork.api.protocol.lorawan.DeviceIdentifier request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_DEVICE, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DeviceManagerBlockingStub extends io.grpc.stub.AbstractStub<DeviceManagerBlockingStub> {
    private DeviceManagerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DeviceManagerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeviceManagerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DeviceManagerBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.thethingsnetwork.api.protocol.lorawan.Device getDevice(org.thethingsnetwork.api.protocol.lorawan.DeviceIdentifier request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_DEVICE, getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty setDevice(org.thethingsnetwork.api.protocol.lorawan.Device request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SET_DEVICE, getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteDevice(org.thethingsnetwork.api.protocol.lorawan.DeviceIdentifier request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_DEVICE, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DeviceManagerFutureStub extends io.grpc.stub.AbstractStub<DeviceManagerFutureStub> {
    private DeviceManagerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DeviceManagerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeviceManagerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DeviceManagerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.api.protocol.lorawan.Device> getDevice(
        org.thethingsnetwork.api.protocol.lorawan.DeviceIdentifier request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_DEVICE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> setDevice(
        org.thethingsnetwork.api.protocol.lorawan.Device request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SET_DEVICE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteDevice(
        org.thethingsnetwork.api.protocol.lorawan.DeviceIdentifier request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_DEVICE, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_DEVICE = 0;
  private static final int METHODID_SET_DEVICE = 1;
  private static final int METHODID_DELETE_DEVICE = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DeviceManagerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DeviceManagerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_DEVICE:
          serviceImpl.getDevice((org.thethingsnetwork.api.protocol.lorawan.DeviceIdentifier) request,
              (io.grpc.stub.StreamObserver<org.thethingsnetwork.api.protocol.lorawan.Device>) responseObserver);
          break;
        case METHODID_SET_DEVICE:
          serviceImpl.setDevice((org.thethingsnetwork.api.protocol.lorawan.Device) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DELETE_DEVICE:
          serviceImpl.deleteDevice((org.thethingsnetwork.api.protocol.lorawan.DeviceIdentifier) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
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

  private static final class DeviceManagerDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.thethingsnetwork.api.protocol.lorawan.LoRaWANProtocolProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (DeviceManagerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DeviceManagerDescriptorSupplier())
              .addMethod(METHOD_GET_DEVICE)
              .addMethod(METHOD_SET_DEVICE)
              .addMethod(METHOD_DELETE_DEVICE)
              .build();
        }
      }
    }
    return result;
  }
}
