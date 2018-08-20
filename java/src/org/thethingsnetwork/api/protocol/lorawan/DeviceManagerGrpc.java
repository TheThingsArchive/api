package org.thethingsnetwork.api.protocol.lorawan;

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
    comments = "Source: github.com/TheThingsNetwork/api/protocol/lorawan/device.proto")
public final class DeviceManagerGrpc {

  private DeviceManagerGrpc() {}

  public static final String SERVICE_NAME = "lorawan.DeviceManager";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.thethingsnetwork.api.protocol.lorawan.DeviceIdentifier,
      org.thethingsnetwork.api.protocol.lorawan.Device> getGetDeviceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDevice",
      requestType = org.thethingsnetwork.api.protocol.lorawan.DeviceIdentifier.class,
      responseType = org.thethingsnetwork.api.protocol.lorawan.Device.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.thethingsnetwork.api.protocol.lorawan.DeviceIdentifier,
      org.thethingsnetwork.api.protocol.lorawan.Device> getGetDeviceMethod() {
    io.grpc.MethodDescriptor<org.thethingsnetwork.api.protocol.lorawan.DeviceIdentifier, org.thethingsnetwork.api.protocol.lorawan.Device> getGetDeviceMethod;
    if ((getGetDeviceMethod = DeviceManagerGrpc.getGetDeviceMethod) == null) {
      synchronized (DeviceManagerGrpc.class) {
        if ((getGetDeviceMethod = DeviceManagerGrpc.getGetDeviceMethod) == null) {
          DeviceManagerGrpc.getGetDeviceMethod = getGetDeviceMethod = 
              io.grpc.MethodDescriptor.<org.thethingsnetwork.api.protocol.lorawan.DeviceIdentifier, org.thethingsnetwork.api.protocol.lorawan.Device>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "lorawan.DeviceManager", "GetDevice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.thethingsnetwork.api.protocol.lorawan.DeviceIdentifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.thethingsnetwork.api.protocol.lorawan.Device.getDefaultInstance()))
                  .setSchemaDescriptor(new DeviceManagerMethodDescriptorSupplier("GetDevice"))
                  .build();
          }
        }
     }
     return getGetDeviceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.thethingsnetwork.api.protocol.lorawan.Device,
      com.google.protobuf.Empty> getSetDeviceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetDevice",
      requestType = org.thethingsnetwork.api.protocol.lorawan.Device.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.thethingsnetwork.api.protocol.lorawan.Device,
      com.google.protobuf.Empty> getSetDeviceMethod() {
    io.grpc.MethodDescriptor<org.thethingsnetwork.api.protocol.lorawan.Device, com.google.protobuf.Empty> getSetDeviceMethod;
    if ((getSetDeviceMethod = DeviceManagerGrpc.getSetDeviceMethod) == null) {
      synchronized (DeviceManagerGrpc.class) {
        if ((getSetDeviceMethod = DeviceManagerGrpc.getSetDeviceMethod) == null) {
          DeviceManagerGrpc.getSetDeviceMethod = getSetDeviceMethod = 
              io.grpc.MethodDescriptor.<org.thethingsnetwork.api.protocol.lorawan.Device, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "lorawan.DeviceManager", "SetDevice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.thethingsnetwork.api.protocol.lorawan.Device.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new DeviceManagerMethodDescriptorSupplier("SetDevice"))
                  .build();
          }
        }
     }
     return getSetDeviceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.thethingsnetwork.api.protocol.lorawan.DeviceIdentifier,
      com.google.protobuf.Empty> getDeleteDeviceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteDevice",
      requestType = org.thethingsnetwork.api.protocol.lorawan.DeviceIdentifier.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.thethingsnetwork.api.protocol.lorawan.DeviceIdentifier,
      com.google.protobuf.Empty> getDeleteDeviceMethod() {
    io.grpc.MethodDescriptor<org.thethingsnetwork.api.protocol.lorawan.DeviceIdentifier, com.google.protobuf.Empty> getDeleteDeviceMethod;
    if ((getDeleteDeviceMethod = DeviceManagerGrpc.getDeleteDeviceMethod) == null) {
      synchronized (DeviceManagerGrpc.class) {
        if ((getDeleteDeviceMethod = DeviceManagerGrpc.getDeleteDeviceMethod) == null) {
          DeviceManagerGrpc.getDeleteDeviceMethod = getDeleteDeviceMethod = 
              io.grpc.MethodDescriptor.<org.thethingsnetwork.api.protocol.lorawan.DeviceIdentifier, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "lorawan.DeviceManager", "DeleteDevice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.thethingsnetwork.api.protocol.lorawan.DeviceIdentifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new DeviceManagerMethodDescriptorSupplier("DeleteDevice"))
                  .build();
          }
        }
     }
     return getDeleteDeviceMethod;
  }

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
      asyncUnimplementedUnaryCall(getGetDeviceMethod(), responseObserver);
    }

    /**
     */
    public void setDevice(org.thethingsnetwork.api.protocol.lorawan.Device request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getSetDeviceMethod(), responseObserver);
    }

    /**
     */
    public void deleteDevice(org.thethingsnetwork.api.protocol.lorawan.DeviceIdentifier request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteDeviceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetDeviceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.thethingsnetwork.api.protocol.lorawan.DeviceIdentifier,
                org.thethingsnetwork.api.protocol.lorawan.Device>(
                  this, METHODID_GET_DEVICE)))
          .addMethod(
            getSetDeviceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.thethingsnetwork.api.protocol.lorawan.Device,
                com.google.protobuf.Empty>(
                  this, METHODID_SET_DEVICE)))
          .addMethod(
            getDeleteDeviceMethod(),
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
          getChannel().newCall(getGetDeviceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setDevice(org.thethingsnetwork.api.protocol.lorawan.Device request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetDeviceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteDevice(org.thethingsnetwork.api.protocol.lorawan.DeviceIdentifier request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteDeviceMethod(), getCallOptions()), request, responseObserver);
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
          getChannel(), getGetDeviceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty setDevice(org.thethingsnetwork.api.protocol.lorawan.Device request) {
      return blockingUnaryCall(
          getChannel(), getSetDeviceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteDevice(org.thethingsnetwork.api.protocol.lorawan.DeviceIdentifier request) {
      return blockingUnaryCall(
          getChannel(), getDeleteDeviceMethod(), getCallOptions(), request);
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
          getChannel().newCall(getGetDeviceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> setDevice(
        org.thethingsnetwork.api.protocol.lorawan.Device request) {
      return futureUnaryCall(
          getChannel().newCall(getSetDeviceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteDevice(
        org.thethingsnetwork.api.protocol.lorawan.DeviceIdentifier request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteDeviceMethod(), getCallOptions()), request);
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

  private static abstract class DeviceManagerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DeviceManagerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.thethingsnetwork.api.protocol.lorawan.LoRaWANDeviceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DeviceManager");
    }
  }

  private static final class DeviceManagerFileDescriptorSupplier
      extends DeviceManagerBaseDescriptorSupplier {
    DeviceManagerFileDescriptorSupplier() {}
  }

  private static final class DeviceManagerMethodDescriptorSupplier
      extends DeviceManagerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DeviceManagerMethodDescriptorSupplier(String methodName) {
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
      synchronized (DeviceManagerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DeviceManagerFileDescriptorSupplier())
              .addMethod(getGetDeviceMethod())
              .addMethod(getSetDeviceMethod())
              .addMethod(getDeleteDeviceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
