package org.thethingsnetwork.api.handler;

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
 * ApplicationManager manages application and device registrations on the Handler
 * To protect our quality of service, you can make up to 5000 calls to the
 * ApplicationManager API per hour. Once you go over the rate limit, you will
 * receive an error response.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: github.com/TheThingsNetwork/api/handler/handler.proto")
public final class ApplicationManagerGrpc {

  private ApplicationManagerGrpc() {}

  public static final String SERVICE_NAME = "handler.ApplicationManager";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.api.handler.ApplicationIdentifier,
      com.google.protobuf.Empty> METHOD_REGISTER_APPLICATION =
      io.grpc.MethodDescriptor.<org.thethingsnetwork.api.handler.ApplicationIdentifier, com.google.protobuf.Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "handler.ApplicationManager", "RegisterApplication"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.thethingsnetwork.api.handler.ApplicationIdentifier.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.api.handler.ApplicationIdentifier,
      org.thethingsnetwork.api.handler.Application> METHOD_GET_APPLICATION =
      io.grpc.MethodDescriptor.<org.thethingsnetwork.api.handler.ApplicationIdentifier, org.thethingsnetwork.api.handler.Application>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "handler.ApplicationManager", "GetApplication"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.thethingsnetwork.api.handler.ApplicationIdentifier.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.thethingsnetwork.api.handler.Application.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.api.handler.Application,
      com.google.protobuf.Empty> METHOD_SET_APPLICATION =
      io.grpc.MethodDescriptor.<org.thethingsnetwork.api.handler.Application, com.google.protobuf.Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "handler.ApplicationManager", "SetApplication"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.thethingsnetwork.api.handler.Application.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.api.handler.ApplicationIdentifier,
      com.google.protobuf.Empty> METHOD_DELETE_APPLICATION =
      io.grpc.MethodDescriptor.<org.thethingsnetwork.api.handler.ApplicationIdentifier, com.google.protobuf.Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "handler.ApplicationManager", "DeleteApplication"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.thethingsnetwork.api.handler.ApplicationIdentifier.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.api.handler.DeviceIdentifier,
      org.thethingsnetwork.api.handler.Device> METHOD_GET_DEVICE =
      io.grpc.MethodDescriptor.<org.thethingsnetwork.api.handler.DeviceIdentifier, org.thethingsnetwork.api.handler.Device>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "handler.ApplicationManager", "GetDevice"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.thethingsnetwork.api.handler.DeviceIdentifier.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.thethingsnetwork.api.handler.Device.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.api.handler.Device,
      com.google.protobuf.Empty> METHOD_SET_DEVICE =
      io.grpc.MethodDescriptor.<org.thethingsnetwork.api.handler.Device, com.google.protobuf.Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "handler.ApplicationManager", "SetDevice"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.thethingsnetwork.api.handler.Device.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.api.handler.DeviceIdentifier,
      com.google.protobuf.Empty> METHOD_DELETE_DEVICE =
      io.grpc.MethodDescriptor.<org.thethingsnetwork.api.handler.DeviceIdentifier, com.google.protobuf.Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "handler.ApplicationManager", "DeleteDevice"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.thethingsnetwork.api.handler.DeviceIdentifier.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.api.handler.ApplicationIdentifier,
      org.thethingsnetwork.api.handler.DeviceList> METHOD_GET_DEVICES_FOR_APPLICATION =
      io.grpc.MethodDescriptor.<org.thethingsnetwork.api.handler.ApplicationIdentifier, org.thethingsnetwork.api.handler.DeviceList>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "handler.ApplicationManager", "GetDevicesForApplication"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.thethingsnetwork.api.handler.ApplicationIdentifier.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.thethingsnetwork.api.handler.DeviceList.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.api.handler.DryDownlinkMessage,
      org.thethingsnetwork.api.handler.DryDownlinkResult> METHOD_DRY_DOWNLINK =
      io.grpc.MethodDescriptor.<org.thethingsnetwork.api.handler.DryDownlinkMessage, org.thethingsnetwork.api.handler.DryDownlinkResult>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "handler.ApplicationManager", "DryDownlink"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.thethingsnetwork.api.handler.DryDownlinkMessage.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.thethingsnetwork.api.handler.DryDownlinkResult.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.api.handler.DryUplinkMessage,
      org.thethingsnetwork.api.handler.DryUplinkResult> METHOD_DRY_UPLINK =
      io.grpc.MethodDescriptor.<org.thethingsnetwork.api.handler.DryUplinkMessage, org.thethingsnetwork.api.handler.DryUplinkResult>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "handler.ApplicationManager", "DryUplink"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.thethingsnetwork.api.handler.DryUplinkMessage.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.thethingsnetwork.api.handler.DryUplinkResult.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.api.handler.SimulatedUplinkMessage,
      com.google.protobuf.Empty> METHOD_SIMULATE_UPLINK =
      io.grpc.MethodDescriptor.<org.thethingsnetwork.api.handler.SimulatedUplinkMessage, com.google.protobuf.Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "handler.ApplicationManager", "SimulateUplink"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.thethingsnetwork.api.handler.SimulatedUplinkMessage.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ApplicationManagerStub newStub(io.grpc.Channel channel) {
    return new ApplicationManagerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ApplicationManagerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ApplicationManagerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ApplicationManagerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ApplicationManagerFutureStub(channel);
  }

  /**
   * <pre>
   * ApplicationManager manages application and device registrations on the Handler
   * To protect our quality of service, you can make up to 5000 calls to the
   * ApplicationManager API per hour. Once you go over the rate limit, you will
   * receive an error response.
   * </pre>
   */
  public static abstract class ApplicationManagerImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Applications should first be registered to the Handler with the `RegisterApplication` method
     * </pre>
     */
    public void registerApplication(org.thethingsnetwork.api.handler.ApplicationIdentifier request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_REGISTER_APPLICATION, responseObserver);
    }

    /**
     * <pre>
     * GetApplication returns the application with the given identifier (app_id)
     * </pre>
     */
    public void getApplication(org.thethingsnetwork.api.handler.ApplicationIdentifier request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.handler.Application> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_APPLICATION, responseObserver);
    }

    /**
     * <pre>
     * SetApplication updates the settings for the application. All fields must be supplied.
     * </pre>
     */
    public void setApplication(org.thethingsnetwork.api.handler.Application request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SET_APPLICATION, responseObserver);
    }

    /**
     * <pre>
     * DeleteApplication deletes the application with the given identifier (app_id)
     * </pre>
     */
    public void deleteApplication(org.thethingsnetwork.api.handler.ApplicationIdentifier request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_APPLICATION, responseObserver);
    }

    /**
     * <pre>
     * GetDevice returns the device with the given identifier (app_id and dev_id)
     * </pre>
     */
    public void getDevice(org.thethingsnetwork.api.handler.DeviceIdentifier request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.handler.Device> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_DEVICE, responseObserver);
    }

    /**
     * <pre>
     * SetDevice creates or updates a device. All fields must be supplied.
     * </pre>
     */
    public void setDevice(org.thethingsnetwork.api.handler.Device request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SET_DEVICE, responseObserver);
    }

    /**
     * <pre>
     * DeleteDevice deletes the device with the given identifier (app_id and dev_id)
     * </pre>
     */
    public void deleteDevice(org.thethingsnetwork.api.handler.DeviceIdentifier request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_DEVICE, responseObserver);
    }

    /**
     * <pre>
     * GetDevicesForApplication returns all devices that belong to the application with the given identifier (app_id)
     * </pre>
     */
    public void getDevicesForApplication(org.thethingsnetwork.api.handler.ApplicationIdentifier request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.handler.DeviceList> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_DEVICES_FOR_APPLICATION, responseObserver);
    }

    /**
     * <pre>
     * DryUplink simulates processing a downlink message and returns the result
     * </pre>
     */
    public void dryDownlink(org.thethingsnetwork.api.handler.DryDownlinkMessage request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.handler.DryDownlinkResult> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DRY_DOWNLINK, responseObserver);
    }

    /**
     * <pre>
     * DryUplink simulates processing an uplink message and returns the result
     * </pre>
     */
    public void dryUplink(org.thethingsnetwork.api.handler.DryUplinkMessage request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.handler.DryUplinkResult> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DRY_UPLINK, responseObserver);
    }

    /**
     * <pre>
     * SimulateUplink simulates an uplink message
     * </pre>
     */
    public void simulateUplink(org.thethingsnetwork.api.handler.SimulatedUplinkMessage request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SIMULATE_UPLINK, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_REGISTER_APPLICATION,
            asyncUnaryCall(
              new MethodHandlers<
                org.thethingsnetwork.api.handler.ApplicationIdentifier,
                com.google.protobuf.Empty>(
                  this, METHODID_REGISTER_APPLICATION)))
          .addMethod(
            METHOD_GET_APPLICATION,
            asyncUnaryCall(
              new MethodHandlers<
                org.thethingsnetwork.api.handler.ApplicationIdentifier,
                org.thethingsnetwork.api.handler.Application>(
                  this, METHODID_GET_APPLICATION)))
          .addMethod(
            METHOD_SET_APPLICATION,
            asyncUnaryCall(
              new MethodHandlers<
                org.thethingsnetwork.api.handler.Application,
                com.google.protobuf.Empty>(
                  this, METHODID_SET_APPLICATION)))
          .addMethod(
            METHOD_DELETE_APPLICATION,
            asyncUnaryCall(
              new MethodHandlers<
                org.thethingsnetwork.api.handler.ApplicationIdentifier,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_APPLICATION)))
          .addMethod(
            METHOD_GET_DEVICE,
            asyncUnaryCall(
              new MethodHandlers<
                org.thethingsnetwork.api.handler.DeviceIdentifier,
                org.thethingsnetwork.api.handler.Device>(
                  this, METHODID_GET_DEVICE)))
          .addMethod(
            METHOD_SET_DEVICE,
            asyncUnaryCall(
              new MethodHandlers<
                org.thethingsnetwork.api.handler.Device,
                com.google.protobuf.Empty>(
                  this, METHODID_SET_DEVICE)))
          .addMethod(
            METHOD_DELETE_DEVICE,
            asyncUnaryCall(
              new MethodHandlers<
                org.thethingsnetwork.api.handler.DeviceIdentifier,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_DEVICE)))
          .addMethod(
            METHOD_GET_DEVICES_FOR_APPLICATION,
            asyncUnaryCall(
              new MethodHandlers<
                org.thethingsnetwork.api.handler.ApplicationIdentifier,
                org.thethingsnetwork.api.handler.DeviceList>(
                  this, METHODID_GET_DEVICES_FOR_APPLICATION)))
          .addMethod(
            METHOD_DRY_DOWNLINK,
            asyncUnaryCall(
              new MethodHandlers<
                org.thethingsnetwork.api.handler.DryDownlinkMessage,
                org.thethingsnetwork.api.handler.DryDownlinkResult>(
                  this, METHODID_DRY_DOWNLINK)))
          .addMethod(
            METHOD_DRY_UPLINK,
            asyncUnaryCall(
              new MethodHandlers<
                org.thethingsnetwork.api.handler.DryUplinkMessage,
                org.thethingsnetwork.api.handler.DryUplinkResult>(
                  this, METHODID_DRY_UPLINK)))
          .addMethod(
            METHOD_SIMULATE_UPLINK,
            asyncUnaryCall(
              new MethodHandlers<
                org.thethingsnetwork.api.handler.SimulatedUplinkMessage,
                com.google.protobuf.Empty>(
                  this, METHODID_SIMULATE_UPLINK)))
          .build();
    }
  }

  /**
   * <pre>
   * ApplicationManager manages application and device registrations on the Handler
   * To protect our quality of service, you can make up to 5000 calls to the
   * ApplicationManager API per hour. Once you go over the rate limit, you will
   * receive an error response.
   * </pre>
   */
  public static final class ApplicationManagerStub extends io.grpc.stub.AbstractStub<ApplicationManagerStub> {
    private ApplicationManagerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ApplicationManagerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ApplicationManagerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ApplicationManagerStub(channel, callOptions);
    }

    /**
     * <pre>
     * Applications should first be registered to the Handler with the `RegisterApplication` method
     * </pre>
     */
    public void registerApplication(org.thethingsnetwork.api.handler.ApplicationIdentifier request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_REGISTER_APPLICATION, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetApplication returns the application with the given identifier (app_id)
     * </pre>
     */
    public void getApplication(org.thethingsnetwork.api.handler.ApplicationIdentifier request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.handler.Application> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_APPLICATION, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SetApplication updates the settings for the application. All fields must be supplied.
     * </pre>
     */
    public void setApplication(org.thethingsnetwork.api.handler.Application request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SET_APPLICATION, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteApplication deletes the application with the given identifier (app_id)
     * </pre>
     */
    public void deleteApplication(org.thethingsnetwork.api.handler.ApplicationIdentifier request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_APPLICATION, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetDevice returns the device with the given identifier (app_id and dev_id)
     * </pre>
     */
    public void getDevice(org.thethingsnetwork.api.handler.DeviceIdentifier request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.handler.Device> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_DEVICE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SetDevice creates or updates a device. All fields must be supplied.
     * </pre>
     */
    public void setDevice(org.thethingsnetwork.api.handler.Device request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SET_DEVICE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteDevice deletes the device with the given identifier (app_id and dev_id)
     * </pre>
     */
    public void deleteDevice(org.thethingsnetwork.api.handler.DeviceIdentifier request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_DEVICE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetDevicesForApplication returns all devices that belong to the application with the given identifier (app_id)
     * </pre>
     */
    public void getDevicesForApplication(org.thethingsnetwork.api.handler.ApplicationIdentifier request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.handler.DeviceList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_DEVICES_FOR_APPLICATION, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DryUplink simulates processing a downlink message and returns the result
     * </pre>
     */
    public void dryDownlink(org.thethingsnetwork.api.handler.DryDownlinkMessage request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.handler.DryDownlinkResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DRY_DOWNLINK, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DryUplink simulates processing an uplink message and returns the result
     * </pre>
     */
    public void dryUplink(org.thethingsnetwork.api.handler.DryUplinkMessage request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.handler.DryUplinkResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DRY_UPLINK, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SimulateUplink simulates an uplink message
     * </pre>
     */
    public void simulateUplink(org.thethingsnetwork.api.handler.SimulatedUplinkMessage request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SIMULATE_UPLINK, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * ApplicationManager manages application and device registrations on the Handler
   * To protect our quality of service, you can make up to 5000 calls to the
   * ApplicationManager API per hour. Once you go over the rate limit, you will
   * receive an error response.
   * </pre>
   */
  public static final class ApplicationManagerBlockingStub extends io.grpc.stub.AbstractStub<ApplicationManagerBlockingStub> {
    private ApplicationManagerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ApplicationManagerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ApplicationManagerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ApplicationManagerBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Applications should first be registered to the Handler with the `RegisterApplication` method
     * </pre>
     */
    public com.google.protobuf.Empty registerApplication(org.thethingsnetwork.api.handler.ApplicationIdentifier request) {
      return blockingUnaryCall(
          getChannel(), METHOD_REGISTER_APPLICATION, getCallOptions(), request);
    }

    /**
     * <pre>
     * GetApplication returns the application with the given identifier (app_id)
     * </pre>
     */
    public org.thethingsnetwork.api.handler.Application getApplication(org.thethingsnetwork.api.handler.ApplicationIdentifier request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_APPLICATION, getCallOptions(), request);
    }

    /**
     * <pre>
     * SetApplication updates the settings for the application. All fields must be supplied.
     * </pre>
     */
    public com.google.protobuf.Empty setApplication(org.thethingsnetwork.api.handler.Application request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SET_APPLICATION, getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteApplication deletes the application with the given identifier (app_id)
     * </pre>
     */
    public com.google.protobuf.Empty deleteApplication(org.thethingsnetwork.api.handler.ApplicationIdentifier request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_APPLICATION, getCallOptions(), request);
    }

    /**
     * <pre>
     * GetDevice returns the device with the given identifier (app_id and dev_id)
     * </pre>
     */
    public org.thethingsnetwork.api.handler.Device getDevice(org.thethingsnetwork.api.handler.DeviceIdentifier request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_DEVICE, getCallOptions(), request);
    }

    /**
     * <pre>
     * SetDevice creates or updates a device. All fields must be supplied.
     * </pre>
     */
    public com.google.protobuf.Empty setDevice(org.thethingsnetwork.api.handler.Device request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SET_DEVICE, getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteDevice deletes the device with the given identifier (app_id and dev_id)
     * </pre>
     */
    public com.google.protobuf.Empty deleteDevice(org.thethingsnetwork.api.handler.DeviceIdentifier request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_DEVICE, getCallOptions(), request);
    }

    /**
     * <pre>
     * GetDevicesForApplication returns all devices that belong to the application with the given identifier (app_id)
     * </pre>
     */
    public org.thethingsnetwork.api.handler.DeviceList getDevicesForApplication(org.thethingsnetwork.api.handler.ApplicationIdentifier request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_DEVICES_FOR_APPLICATION, getCallOptions(), request);
    }

    /**
     * <pre>
     * DryUplink simulates processing a downlink message and returns the result
     * </pre>
     */
    public org.thethingsnetwork.api.handler.DryDownlinkResult dryDownlink(org.thethingsnetwork.api.handler.DryDownlinkMessage request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DRY_DOWNLINK, getCallOptions(), request);
    }

    /**
     * <pre>
     * DryUplink simulates processing an uplink message and returns the result
     * </pre>
     */
    public org.thethingsnetwork.api.handler.DryUplinkResult dryUplink(org.thethingsnetwork.api.handler.DryUplinkMessage request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DRY_UPLINK, getCallOptions(), request);
    }

    /**
     * <pre>
     * SimulateUplink simulates an uplink message
     * </pre>
     */
    public com.google.protobuf.Empty simulateUplink(org.thethingsnetwork.api.handler.SimulatedUplinkMessage request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SIMULATE_UPLINK, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * ApplicationManager manages application and device registrations on the Handler
   * To protect our quality of service, you can make up to 5000 calls to the
   * ApplicationManager API per hour. Once you go over the rate limit, you will
   * receive an error response.
   * </pre>
   */
  public static final class ApplicationManagerFutureStub extends io.grpc.stub.AbstractStub<ApplicationManagerFutureStub> {
    private ApplicationManagerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ApplicationManagerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ApplicationManagerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ApplicationManagerFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Applications should first be registered to the Handler with the `RegisterApplication` method
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> registerApplication(
        org.thethingsnetwork.api.handler.ApplicationIdentifier request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_REGISTER_APPLICATION, getCallOptions()), request);
    }

    /**
     * <pre>
     * GetApplication returns the application with the given identifier (app_id)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.api.handler.Application> getApplication(
        org.thethingsnetwork.api.handler.ApplicationIdentifier request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_APPLICATION, getCallOptions()), request);
    }

    /**
     * <pre>
     * SetApplication updates the settings for the application. All fields must be supplied.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> setApplication(
        org.thethingsnetwork.api.handler.Application request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SET_APPLICATION, getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteApplication deletes the application with the given identifier (app_id)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteApplication(
        org.thethingsnetwork.api.handler.ApplicationIdentifier request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_APPLICATION, getCallOptions()), request);
    }

    /**
     * <pre>
     * GetDevice returns the device with the given identifier (app_id and dev_id)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.api.handler.Device> getDevice(
        org.thethingsnetwork.api.handler.DeviceIdentifier request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_DEVICE, getCallOptions()), request);
    }

    /**
     * <pre>
     * SetDevice creates or updates a device. All fields must be supplied.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> setDevice(
        org.thethingsnetwork.api.handler.Device request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SET_DEVICE, getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteDevice deletes the device with the given identifier (app_id and dev_id)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteDevice(
        org.thethingsnetwork.api.handler.DeviceIdentifier request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_DEVICE, getCallOptions()), request);
    }

    /**
     * <pre>
     * GetDevicesForApplication returns all devices that belong to the application with the given identifier (app_id)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.api.handler.DeviceList> getDevicesForApplication(
        org.thethingsnetwork.api.handler.ApplicationIdentifier request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_DEVICES_FOR_APPLICATION, getCallOptions()), request);
    }

    /**
     * <pre>
     * DryUplink simulates processing a downlink message and returns the result
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.api.handler.DryDownlinkResult> dryDownlink(
        org.thethingsnetwork.api.handler.DryDownlinkMessage request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DRY_DOWNLINK, getCallOptions()), request);
    }

    /**
     * <pre>
     * DryUplink simulates processing an uplink message and returns the result
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.api.handler.DryUplinkResult> dryUplink(
        org.thethingsnetwork.api.handler.DryUplinkMessage request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DRY_UPLINK, getCallOptions()), request);
    }

    /**
     * <pre>
     * SimulateUplink simulates an uplink message
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> simulateUplink(
        org.thethingsnetwork.api.handler.SimulatedUplinkMessage request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SIMULATE_UPLINK, getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER_APPLICATION = 0;
  private static final int METHODID_GET_APPLICATION = 1;
  private static final int METHODID_SET_APPLICATION = 2;
  private static final int METHODID_DELETE_APPLICATION = 3;
  private static final int METHODID_GET_DEVICE = 4;
  private static final int METHODID_SET_DEVICE = 5;
  private static final int METHODID_DELETE_DEVICE = 6;
  private static final int METHODID_GET_DEVICES_FOR_APPLICATION = 7;
  private static final int METHODID_DRY_DOWNLINK = 8;
  private static final int METHODID_DRY_UPLINK = 9;
  private static final int METHODID_SIMULATE_UPLINK = 10;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ApplicationManagerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ApplicationManagerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER_APPLICATION:
          serviceImpl.registerApplication((org.thethingsnetwork.api.handler.ApplicationIdentifier) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_APPLICATION:
          serviceImpl.getApplication((org.thethingsnetwork.api.handler.ApplicationIdentifier) request,
              (io.grpc.stub.StreamObserver<org.thethingsnetwork.api.handler.Application>) responseObserver);
          break;
        case METHODID_SET_APPLICATION:
          serviceImpl.setApplication((org.thethingsnetwork.api.handler.Application) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DELETE_APPLICATION:
          serviceImpl.deleteApplication((org.thethingsnetwork.api.handler.ApplicationIdentifier) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_DEVICE:
          serviceImpl.getDevice((org.thethingsnetwork.api.handler.DeviceIdentifier) request,
              (io.grpc.stub.StreamObserver<org.thethingsnetwork.api.handler.Device>) responseObserver);
          break;
        case METHODID_SET_DEVICE:
          serviceImpl.setDevice((org.thethingsnetwork.api.handler.Device) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DELETE_DEVICE:
          serviceImpl.deleteDevice((org.thethingsnetwork.api.handler.DeviceIdentifier) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_DEVICES_FOR_APPLICATION:
          serviceImpl.getDevicesForApplication((org.thethingsnetwork.api.handler.ApplicationIdentifier) request,
              (io.grpc.stub.StreamObserver<org.thethingsnetwork.api.handler.DeviceList>) responseObserver);
          break;
        case METHODID_DRY_DOWNLINK:
          serviceImpl.dryDownlink((org.thethingsnetwork.api.handler.DryDownlinkMessage) request,
              (io.grpc.stub.StreamObserver<org.thethingsnetwork.api.handler.DryDownlinkResult>) responseObserver);
          break;
        case METHODID_DRY_UPLINK:
          serviceImpl.dryUplink((org.thethingsnetwork.api.handler.DryUplinkMessage) request,
              (io.grpc.stub.StreamObserver<org.thethingsnetwork.api.handler.DryUplinkResult>) responseObserver);
          break;
        case METHODID_SIMULATE_UPLINK:
          serviceImpl.simulateUplink((org.thethingsnetwork.api.handler.SimulatedUplinkMessage) request,
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

  private static final class ApplicationManagerDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.thethingsnetwork.api.handler.HandlerProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ApplicationManagerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ApplicationManagerDescriptorSupplier())
              .addMethod(METHOD_REGISTER_APPLICATION)
              .addMethod(METHOD_GET_APPLICATION)
              .addMethod(METHOD_SET_APPLICATION)
              .addMethod(METHOD_DELETE_APPLICATION)
              .addMethod(METHOD_GET_DEVICE)
              .addMethod(METHOD_SET_DEVICE)
              .addMethod(METHOD_DELETE_DEVICE)
              .addMethod(METHOD_GET_DEVICES_FOR_APPLICATION)
              .addMethod(METHOD_DRY_DOWNLINK)
              .addMethod(METHOD_DRY_UPLINK)
              .addMethod(METHOD_SIMULATE_UPLINK)
              .build();
        }
      }
    }
    return result;
  }
}
