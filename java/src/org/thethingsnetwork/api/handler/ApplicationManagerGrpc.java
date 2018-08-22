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
  private static volatile io.grpc.MethodDescriptor<org.thethingsnetwork.api.handler.ApplicationIdentifier,
      com.google.protobuf.Empty> getRegisterApplicationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterApplication",
      requestType = org.thethingsnetwork.api.handler.ApplicationIdentifier.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.thethingsnetwork.api.handler.ApplicationIdentifier,
      com.google.protobuf.Empty> getRegisterApplicationMethod() {
    io.grpc.MethodDescriptor<org.thethingsnetwork.api.handler.ApplicationIdentifier, com.google.protobuf.Empty> getRegisterApplicationMethod;
    if ((getRegisterApplicationMethod = ApplicationManagerGrpc.getRegisterApplicationMethod) == null) {
      synchronized (ApplicationManagerGrpc.class) {
        if ((getRegisterApplicationMethod = ApplicationManagerGrpc.getRegisterApplicationMethod) == null) {
          ApplicationManagerGrpc.getRegisterApplicationMethod = getRegisterApplicationMethod = 
              io.grpc.MethodDescriptor.<org.thethingsnetwork.api.handler.ApplicationIdentifier, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "handler.ApplicationManager", "RegisterApplication"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.thethingsnetwork.api.handler.ApplicationIdentifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new ApplicationManagerMethodDescriptorSupplier("RegisterApplication"))
                  .build();
          }
        }
     }
     return getRegisterApplicationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.thethingsnetwork.api.handler.ApplicationIdentifier,
      org.thethingsnetwork.api.handler.Application> getGetApplicationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetApplication",
      requestType = org.thethingsnetwork.api.handler.ApplicationIdentifier.class,
      responseType = org.thethingsnetwork.api.handler.Application.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.thethingsnetwork.api.handler.ApplicationIdentifier,
      org.thethingsnetwork.api.handler.Application> getGetApplicationMethod() {
    io.grpc.MethodDescriptor<org.thethingsnetwork.api.handler.ApplicationIdentifier, org.thethingsnetwork.api.handler.Application> getGetApplicationMethod;
    if ((getGetApplicationMethod = ApplicationManagerGrpc.getGetApplicationMethod) == null) {
      synchronized (ApplicationManagerGrpc.class) {
        if ((getGetApplicationMethod = ApplicationManagerGrpc.getGetApplicationMethod) == null) {
          ApplicationManagerGrpc.getGetApplicationMethod = getGetApplicationMethod = 
              io.grpc.MethodDescriptor.<org.thethingsnetwork.api.handler.ApplicationIdentifier, org.thethingsnetwork.api.handler.Application>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "handler.ApplicationManager", "GetApplication"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.thethingsnetwork.api.handler.ApplicationIdentifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.thethingsnetwork.api.handler.Application.getDefaultInstance()))
                  .setSchemaDescriptor(new ApplicationManagerMethodDescriptorSupplier("GetApplication"))
                  .build();
          }
        }
     }
     return getGetApplicationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.thethingsnetwork.api.handler.Application,
      com.google.protobuf.Empty> getSetApplicationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetApplication",
      requestType = org.thethingsnetwork.api.handler.Application.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.thethingsnetwork.api.handler.Application,
      com.google.protobuf.Empty> getSetApplicationMethod() {
    io.grpc.MethodDescriptor<org.thethingsnetwork.api.handler.Application, com.google.protobuf.Empty> getSetApplicationMethod;
    if ((getSetApplicationMethod = ApplicationManagerGrpc.getSetApplicationMethod) == null) {
      synchronized (ApplicationManagerGrpc.class) {
        if ((getSetApplicationMethod = ApplicationManagerGrpc.getSetApplicationMethod) == null) {
          ApplicationManagerGrpc.getSetApplicationMethod = getSetApplicationMethod = 
              io.grpc.MethodDescriptor.<org.thethingsnetwork.api.handler.Application, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "handler.ApplicationManager", "SetApplication"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.thethingsnetwork.api.handler.Application.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new ApplicationManagerMethodDescriptorSupplier("SetApplication"))
                  .build();
          }
        }
     }
     return getSetApplicationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.thethingsnetwork.api.handler.ApplicationIdentifier,
      com.google.protobuf.Empty> getDeleteApplicationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteApplication",
      requestType = org.thethingsnetwork.api.handler.ApplicationIdentifier.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.thethingsnetwork.api.handler.ApplicationIdentifier,
      com.google.protobuf.Empty> getDeleteApplicationMethod() {
    io.grpc.MethodDescriptor<org.thethingsnetwork.api.handler.ApplicationIdentifier, com.google.protobuf.Empty> getDeleteApplicationMethod;
    if ((getDeleteApplicationMethod = ApplicationManagerGrpc.getDeleteApplicationMethod) == null) {
      synchronized (ApplicationManagerGrpc.class) {
        if ((getDeleteApplicationMethod = ApplicationManagerGrpc.getDeleteApplicationMethod) == null) {
          ApplicationManagerGrpc.getDeleteApplicationMethod = getDeleteApplicationMethod = 
              io.grpc.MethodDescriptor.<org.thethingsnetwork.api.handler.ApplicationIdentifier, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "handler.ApplicationManager", "DeleteApplication"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.thethingsnetwork.api.handler.ApplicationIdentifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new ApplicationManagerMethodDescriptorSupplier("DeleteApplication"))
                  .build();
          }
        }
     }
     return getDeleteApplicationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.thethingsnetwork.api.handler.DeviceIdentifier,
      org.thethingsnetwork.api.handler.Device> getGetDeviceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDevice",
      requestType = org.thethingsnetwork.api.handler.DeviceIdentifier.class,
      responseType = org.thethingsnetwork.api.handler.Device.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.thethingsnetwork.api.handler.DeviceIdentifier,
      org.thethingsnetwork.api.handler.Device> getGetDeviceMethod() {
    io.grpc.MethodDescriptor<org.thethingsnetwork.api.handler.DeviceIdentifier, org.thethingsnetwork.api.handler.Device> getGetDeviceMethod;
    if ((getGetDeviceMethod = ApplicationManagerGrpc.getGetDeviceMethod) == null) {
      synchronized (ApplicationManagerGrpc.class) {
        if ((getGetDeviceMethod = ApplicationManagerGrpc.getGetDeviceMethod) == null) {
          ApplicationManagerGrpc.getGetDeviceMethod = getGetDeviceMethod = 
              io.grpc.MethodDescriptor.<org.thethingsnetwork.api.handler.DeviceIdentifier, org.thethingsnetwork.api.handler.Device>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "handler.ApplicationManager", "GetDevice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.thethingsnetwork.api.handler.DeviceIdentifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.thethingsnetwork.api.handler.Device.getDefaultInstance()))
                  .setSchemaDescriptor(new ApplicationManagerMethodDescriptorSupplier("GetDevice"))
                  .build();
          }
        }
     }
     return getGetDeviceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.thethingsnetwork.api.handler.Device,
      com.google.protobuf.Empty> getSetDeviceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetDevice",
      requestType = org.thethingsnetwork.api.handler.Device.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.thethingsnetwork.api.handler.Device,
      com.google.protobuf.Empty> getSetDeviceMethod() {
    io.grpc.MethodDescriptor<org.thethingsnetwork.api.handler.Device, com.google.protobuf.Empty> getSetDeviceMethod;
    if ((getSetDeviceMethod = ApplicationManagerGrpc.getSetDeviceMethod) == null) {
      synchronized (ApplicationManagerGrpc.class) {
        if ((getSetDeviceMethod = ApplicationManagerGrpc.getSetDeviceMethod) == null) {
          ApplicationManagerGrpc.getSetDeviceMethod = getSetDeviceMethod = 
              io.grpc.MethodDescriptor.<org.thethingsnetwork.api.handler.Device, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "handler.ApplicationManager", "SetDevice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.thethingsnetwork.api.handler.Device.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new ApplicationManagerMethodDescriptorSupplier("SetDevice"))
                  .build();
          }
        }
     }
     return getSetDeviceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.thethingsnetwork.api.handler.DeviceIdentifier,
      com.google.protobuf.Empty> getDeleteDeviceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteDevice",
      requestType = org.thethingsnetwork.api.handler.DeviceIdentifier.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.thethingsnetwork.api.handler.DeviceIdentifier,
      com.google.protobuf.Empty> getDeleteDeviceMethod() {
    io.grpc.MethodDescriptor<org.thethingsnetwork.api.handler.DeviceIdentifier, com.google.protobuf.Empty> getDeleteDeviceMethod;
    if ((getDeleteDeviceMethod = ApplicationManagerGrpc.getDeleteDeviceMethod) == null) {
      synchronized (ApplicationManagerGrpc.class) {
        if ((getDeleteDeviceMethod = ApplicationManagerGrpc.getDeleteDeviceMethod) == null) {
          ApplicationManagerGrpc.getDeleteDeviceMethod = getDeleteDeviceMethod = 
              io.grpc.MethodDescriptor.<org.thethingsnetwork.api.handler.DeviceIdentifier, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "handler.ApplicationManager", "DeleteDevice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.thethingsnetwork.api.handler.DeviceIdentifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new ApplicationManagerMethodDescriptorSupplier("DeleteDevice"))
                  .build();
          }
        }
     }
     return getDeleteDeviceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.thethingsnetwork.api.handler.ApplicationIdentifier,
      org.thethingsnetwork.api.handler.DeviceList> getGetDevicesForApplicationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDevicesForApplication",
      requestType = org.thethingsnetwork.api.handler.ApplicationIdentifier.class,
      responseType = org.thethingsnetwork.api.handler.DeviceList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.thethingsnetwork.api.handler.ApplicationIdentifier,
      org.thethingsnetwork.api.handler.DeviceList> getGetDevicesForApplicationMethod() {
    io.grpc.MethodDescriptor<org.thethingsnetwork.api.handler.ApplicationIdentifier, org.thethingsnetwork.api.handler.DeviceList> getGetDevicesForApplicationMethod;
    if ((getGetDevicesForApplicationMethod = ApplicationManagerGrpc.getGetDevicesForApplicationMethod) == null) {
      synchronized (ApplicationManagerGrpc.class) {
        if ((getGetDevicesForApplicationMethod = ApplicationManagerGrpc.getGetDevicesForApplicationMethod) == null) {
          ApplicationManagerGrpc.getGetDevicesForApplicationMethod = getGetDevicesForApplicationMethod = 
              io.grpc.MethodDescriptor.<org.thethingsnetwork.api.handler.ApplicationIdentifier, org.thethingsnetwork.api.handler.DeviceList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "handler.ApplicationManager", "GetDevicesForApplication"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.thethingsnetwork.api.handler.ApplicationIdentifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.thethingsnetwork.api.handler.DeviceList.getDefaultInstance()))
                  .setSchemaDescriptor(new ApplicationManagerMethodDescriptorSupplier("GetDevicesForApplication"))
                  .build();
          }
        }
     }
     return getGetDevicesForApplicationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.thethingsnetwork.api.handler.DryDownlinkMessage,
      org.thethingsnetwork.api.handler.DryDownlinkResult> getDryDownlinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DryDownlink",
      requestType = org.thethingsnetwork.api.handler.DryDownlinkMessage.class,
      responseType = org.thethingsnetwork.api.handler.DryDownlinkResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.thethingsnetwork.api.handler.DryDownlinkMessage,
      org.thethingsnetwork.api.handler.DryDownlinkResult> getDryDownlinkMethod() {
    io.grpc.MethodDescriptor<org.thethingsnetwork.api.handler.DryDownlinkMessage, org.thethingsnetwork.api.handler.DryDownlinkResult> getDryDownlinkMethod;
    if ((getDryDownlinkMethod = ApplicationManagerGrpc.getDryDownlinkMethod) == null) {
      synchronized (ApplicationManagerGrpc.class) {
        if ((getDryDownlinkMethod = ApplicationManagerGrpc.getDryDownlinkMethod) == null) {
          ApplicationManagerGrpc.getDryDownlinkMethod = getDryDownlinkMethod = 
              io.grpc.MethodDescriptor.<org.thethingsnetwork.api.handler.DryDownlinkMessage, org.thethingsnetwork.api.handler.DryDownlinkResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "handler.ApplicationManager", "DryDownlink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.thethingsnetwork.api.handler.DryDownlinkMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.thethingsnetwork.api.handler.DryDownlinkResult.getDefaultInstance()))
                  .setSchemaDescriptor(new ApplicationManagerMethodDescriptorSupplier("DryDownlink"))
                  .build();
          }
        }
     }
     return getDryDownlinkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.thethingsnetwork.api.handler.DryUplinkMessage,
      org.thethingsnetwork.api.handler.DryUplinkResult> getDryUplinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DryUplink",
      requestType = org.thethingsnetwork.api.handler.DryUplinkMessage.class,
      responseType = org.thethingsnetwork.api.handler.DryUplinkResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.thethingsnetwork.api.handler.DryUplinkMessage,
      org.thethingsnetwork.api.handler.DryUplinkResult> getDryUplinkMethod() {
    io.grpc.MethodDescriptor<org.thethingsnetwork.api.handler.DryUplinkMessage, org.thethingsnetwork.api.handler.DryUplinkResult> getDryUplinkMethod;
    if ((getDryUplinkMethod = ApplicationManagerGrpc.getDryUplinkMethod) == null) {
      synchronized (ApplicationManagerGrpc.class) {
        if ((getDryUplinkMethod = ApplicationManagerGrpc.getDryUplinkMethod) == null) {
          ApplicationManagerGrpc.getDryUplinkMethod = getDryUplinkMethod = 
              io.grpc.MethodDescriptor.<org.thethingsnetwork.api.handler.DryUplinkMessage, org.thethingsnetwork.api.handler.DryUplinkResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "handler.ApplicationManager", "DryUplink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.thethingsnetwork.api.handler.DryUplinkMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.thethingsnetwork.api.handler.DryUplinkResult.getDefaultInstance()))
                  .setSchemaDescriptor(new ApplicationManagerMethodDescriptorSupplier("DryUplink"))
                  .build();
          }
        }
     }
     return getDryUplinkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.thethingsnetwork.api.handler.SimulatedUplinkMessage,
      com.google.protobuf.Empty> getSimulateUplinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SimulateUplink",
      requestType = org.thethingsnetwork.api.handler.SimulatedUplinkMessage.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.thethingsnetwork.api.handler.SimulatedUplinkMessage,
      com.google.protobuf.Empty> getSimulateUplinkMethod() {
    io.grpc.MethodDescriptor<org.thethingsnetwork.api.handler.SimulatedUplinkMessage, com.google.protobuf.Empty> getSimulateUplinkMethod;
    if ((getSimulateUplinkMethod = ApplicationManagerGrpc.getSimulateUplinkMethod) == null) {
      synchronized (ApplicationManagerGrpc.class) {
        if ((getSimulateUplinkMethod = ApplicationManagerGrpc.getSimulateUplinkMethod) == null) {
          ApplicationManagerGrpc.getSimulateUplinkMethod = getSimulateUplinkMethod = 
              io.grpc.MethodDescriptor.<org.thethingsnetwork.api.handler.SimulatedUplinkMessage, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "handler.ApplicationManager", "SimulateUplink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.thethingsnetwork.api.handler.SimulatedUplinkMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new ApplicationManagerMethodDescriptorSupplier("SimulateUplink"))
                  .build();
          }
        }
     }
     return getSimulateUplinkMethod;
  }

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
      asyncUnimplementedUnaryCall(getRegisterApplicationMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetApplication returns the application with the given identifier (app_id)
     * </pre>
     */
    public void getApplication(org.thethingsnetwork.api.handler.ApplicationIdentifier request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.handler.Application> responseObserver) {
      asyncUnimplementedUnaryCall(getGetApplicationMethod(), responseObserver);
    }

    /**
     * <pre>
     * SetApplication updates the settings for the application. All fields must be supplied.
     * </pre>
     */
    public void setApplication(org.thethingsnetwork.api.handler.Application request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getSetApplicationMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteApplication deletes the application with the given identifier (app_id)
     * </pre>
     */
    public void deleteApplication(org.thethingsnetwork.api.handler.ApplicationIdentifier request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteApplicationMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetDevice returns the device with the given identifier (app_id and dev_id)
     * </pre>
     */
    public void getDevice(org.thethingsnetwork.api.handler.DeviceIdentifier request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.handler.Device> responseObserver) {
      asyncUnimplementedUnaryCall(getGetDeviceMethod(), responseObserver);
    }

    /**
     * <pre>
     * SetDevice creates or updates a device. All fields must be supplied.
     * </pre>
     */
    public void setDevice(org.thethingsnetwork.api.handler.Device request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getSetDeviceMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteDevice deletes the device with the given identifier (app_id and dev_id)
     * </pre>
     */
    public void deleteDevice(org.thethingsnetwork.api.handler.DeviceIdentifier request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteDeviceMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetDevicesForApplication returns all devices that belong to the application with the given identifier (app_id)
     * </pre>
     */
    public void getDevicesForApplication(org.thethingsnetwork.api.handler.ApplicationIdentifier request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.handler.DeviceList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetDevicesForApplicationMethod(), responseObserver);
    }

    /**
     * <pre>
     * DryUplink simulates processing a downlink message and returns the result
     * </pre>
     */
    public void dryDownlink(org.thethingsnetwork.api.handler.DryDownlinkMessage request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.handler.DryDownlinkResult> responseObserver) {
      asyncUnimplementedUnaryCall(getDryDownlinkMethod(), responseObserver);
    }

    /**
     * <pre>
     * DryUplink simulates processing an uplink message and returns the result
     * </pre>
     */
    public void dryUplink(org.thethingsnetwork.api.handler.DryUplinkMessage request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.handler.DryUplinkResult> responseObserver) {
      asyncUnimplementedUnaryCall(getDryUplinkMethod(), responseObserver);
    }

    /**
     * <pre>
     * SimulateUplink simulates an uplink message
     * </pre>
     */
    public void simulateUplink(org.thethingsnetwork.api.handler.SimulatedUplinkMessage request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getSimulateUplinkMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegisterApplicationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.thethingsnetwork.api.handler.ApplicationIdentifier,
                com.google.protobuf.Empty>(
                  this, METHODID_REGISTER_APPLICATION)))
          .addMethod(
            getGetApplicationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.thethingsnetwork.api.handler.ApplicationIdentifier,
                org.thethingsnetwork.api.handler.Application>(
                  this, METHODID_GET_APPLICATION)))
          .addMethod(
            getSetApplicationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.thethingsnetwork.api.handler.Application,
                com.google.protobuf.Empty>(
                  this, METHODID_SET_APPLICATION)))
          .addMethod(
            getDeleteApplicationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.thethingsnetwork.api.handler.ApplicationIdentifier,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_APPLICATION)))
          .addMethod(
            getGetDeviceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.thethingsnetwork.api.handler.DeviceIdentifier,
                org.thethingsnetwork.api.handler.Device>(
                  this, METHODID_GET_DEVICE)))
          .addMethod(
            getSetDeviceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.thethingsnetwork.api.handler.Device,
                com.google.protobuf.Empty>(
                  this, METHODID_SET_DEVICE)))
          .addMethod(
            getDeleteDeviceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.thethingsnetwork.api.handler.DeviceIdentifier,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_DEVICE)))
          .addMethod(
            getGetDevicesForApplicationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.thethingsnetwork.api.handler.ApplicationIdentifier,
                org.thethingsnetwork.api.handler.DeviceList>(
                  this, METHODID_GET_DEVICES_FOR_APPLICATION)))
          .addMethod(
            getDryDownlinkMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.thethingsnetwork.api.handler.DryDownlinkMessage,
                org.thethingsnetwork.api.handler.DryDownlinkResult>(
                  this, METHODID_DRY_DOWNLINK)))
          .addMethod(
            getDryUplinkMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.thethingsnetwork.api.handler.DryUplinkMessage,
                org.thethingsnetwork.api.handler.DryUplinkResult>(
                  this, METHODID_DRY_UPLINK)))
          .addMethod(
            getSimulateUplinkMethod(),
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
          getChannel().newCall(getRegisterApplicationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetApplication returns the application with the given identifier (app_id)
     * </pre>
     */
    public void getApplication(org.thethingsnetwork.api.handler.ApplicationIdentifier request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.handler.Application> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetApplicationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SetApplication updates the settings for the application. All fields must be supplied.
     * </pre>
     */
    public void setApplication(org.thethingsnetwork.api.handler.Application request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetApplicationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteApplication deletes the application with the given identifier (app_id)
     * </pre>
     */
    public void deleteApplication(org.thethingsnetwork.api.handler.ApplicationIdentifier request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteApplicationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetDevice returns the device with the given identifier (app_id and dev_id)
     * </pre>
     */
    public void getDevice(org.thethingsnetwork.api.handler.DeviceIdentifier request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.handler.Device> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetDeviceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SetDevice creates or updates a device. All fields must be supplied.
     * </pre>
     */
    public void setDevice(org.thethingsnetwork.api.handler.Device request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetDeviceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteDevice deletes the device with the given identifier (app_id and dev_id)
     * </pre>
     */
    public void deleteDevice(org.thethingsnetwork.api.handler.DeviceIdentifier request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteDeviceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetDevicesForApplication returns all devices that belong to the application with the given identifier (app_id)
     * </pre>
     */
    public void getDevicesForApplication(org.thethingsnetwork.api.handler.ApplicationIdentifier request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.handler.DeviceList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetDevicesForApplicationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DryUplink simulates processing a downlink message and returns the result
     * </pre>
     */
    public void dryDownlink(org.thethingsnetwork.api.handler.DryDownlinkMessage request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.handler.DryDownlinkResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDryDownlinkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DryUplink simulates processing an uplink message and returns the result
     * </pre>
     */
    public void dryUplink(org.thethingsnetwork.api.handler.DryUplinkMessage request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.handler.DryUplinkResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDryUplinkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SimulateUplink simulates an uplink message
     * </pre>
     */
    public void simulateUplink(org.thethingsnetwork.api.handler.SimulatedUplinkMessage request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSimulateUplinkMethod(), getCallOptions()), request, responseObserver);
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
          getChannel(), getRegisterApplicationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetApplication returns the application with the given identifier (app_id)
     * </pre>
     */
    public org.thethingsnetwork.api.handler.Application getApplication(org.thethingsnetwork.api.handler.ApplicationIdentifier request) {
      return blockingUnaryCall(
          getChannel(), getGetApplicationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SetApplication updates the settings for the application. All fields must be supplied.
     * </pre>
     */
    public com.google.protobuf.Empty setApplication(org.thethingsnetwork.api.handler.Application request) {
      return blockingUnaryCall(
          getChannel(), getSetApplicationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteApplication deletes the application with the given identifier (app_id)
     * </pre>
     */
    public com.google.protobuf.Empty deleteApplication(org.thethingsnetwork.api.handler.ApplicationIdentifier request) {
      return blockingUnaryCall(
          getChannel(), getDeleteApplicationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetDevice returns the device with the given identifier (app_id and dev_id)
     * </pre>
     */
    public org.thethingsnetwork.api.handler.Device getDevice(org.thethingsnetwork.api.handler.DeviceIdentifier request) {
      return blockingUnaryCall(
          getChannel(), getGetDeviceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SetDevice creates or updates a device. All fields must be supplied.
     * </pre>
     */
    public com.google.protobuf.Empty setDevice(org.thethingsnetwork.api.handler.Device request) {
      return blockingUnaryCall(
          getChannel(), getSetDeviceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteDevice deletes the device with the given identifier (app_id and dev_id)
     * </pre>
     */
    public com.google.protobuf.Empty deleteDevice(org.thethingsnetwork.api.handler.DeviceIdentifier request) {
      return blockingUnaryCall(
          getChannel(), getDeleteDeviceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetDevicesForApplication returns all devices that belong to the application with the given identifier (app_id)
     * </pre>
     */
    public org.thethingsnetwork.api.handler.DeviceList getDevicesForApplication(org.thethingsnetwork.api.handler.ApplicationIdentifier request) {
      return blockingUnaryCall(
          getChannel(), getGetDevicesForApplicationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DryUplink simulates processing a downlink message and returns the result
     * </pre>
     */
    public org.thethingsnetwork.api.handler.DryDownlinkResult dryDownlink(org.thethingsnetwork.api.handler.DryDownlinkMessage request) {
      return blockingUnaryCall(
          getChannel(), getDryDownlinkMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DryUplink simulates processing an uplink message and returns the result
     * </pre>
     */
    public org.thethingsnetwork.api.handler.DryUplinkResult dryUplink(org.thethingsnetwork.api.handler.DryUplinkMessage request) {
      return blockingUnaryCall(
          getChannel(), getDryUplinkMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SimulateUplink simulates an uplink message
     * </pre>
     */
    public com.google.protobuf.Empty simulateUplink(org.thethingsnetwork.api.handler.SimulatedUplinkMessage request) {
      return blockingUnaryCall(
          getChannel(), getSimulateUplinkMethod(), getCallOptions(), request);
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
          getChannel().newCall(getRegisterApplicationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetApplication returns the application with the given identifier (app_id)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.api.handler.Application> getApplication(
        org.thethingsnetwork.api.handler.ApplicationIdentifier request) {
      return futureUnaryCall(
          getChannel().newCall(getGetApplicationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SetApplication updates the settings for the application. All fields must be supplied.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> setApplication(
        org.thethingsnetwork.api.handler.Application request) {
      return futureUnaryCall(
          getChannel().newCall(getSetApplicationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteApplication deletes the application with the given identifier (app_id)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteApplication(
        org.thethingsnetwork.api.handler.ApplicationIdentifier request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteApplicationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetDevice returns the device with the given identifier (app_id and dev_id)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.api.handler.Device> getDevice(
        org.thethingsnetwork.api.handler.DeviceIdentifier request) {
      return futureUnaryCall(
          getChannel().newCall(getGetDeviceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SetDevice creates or updates a device. All fields must be supplied.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> setDevice(
        org.thethingsnetwork.api.handler.Device request) {
      return futureUnaryCall(
          getChannel().newCall(getSetDeviceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteDevice deletes the device with the given identifier (app_id and dev_id)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteDevice(
        org.thethingsnetwork.api.handler.DeviceIdentifier request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteDeviceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetDevicesForApplication returns all devices that belong to the application with the given identifier (app_id)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.api.handler.DeviceList> getDevicesForApplication(
        org.thethingsnetwork.api.handler.ApplicationIdentifier request) {
      return futureUnaryCall(
          getChannel().newCall(getGetDevicesForApplicationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DryUplink simulates processing a downlink message and returns the result
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.api.handler.DryDownlinkResult> dryDownlink(
        org.thethingsnetwork.api.handler.DryDownlinkMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getDryDownlinkMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DryUplink simulates processing an uplink message and returns the result
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.api.handler.DryUplinkResult> dryUplink(
        org.thethingsnetwork.api.handler.DryUplinkMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getDryUplinkMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SimulateUplink simulates an uplink message
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> simulateUplink(
        org.thethingsnetwork.api.handler.SimulatedUplinkMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getSimulateUplinkMethod(), getCallOptions()), request);
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

  private static abstract class ApplicationManagerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ApplicationManagerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.thethingsnetwork.api.handler.HandlerProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ApplicationManager");
    }
  }

  private static final class ApplicationManagerFileDescriptorSupplier
      extends ApplicationManagerBaseDescriptorSupplier {
    ApplicationManagerFileDescriptorSupplier() {}
  }

  private static final class ApplicationManagerMethodDescriptorSupplier
      extends ApplicationManagerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ApplicationManagerMethodDescriptorSupplier(String methodName) {
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
      synchronized (ApplicationManagerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ApplicationManagerFileDescriptorSupplier())
              .addMethod(getRegisterApplicationMethod())
              .addMethod(getGetApplicationMethod())
              .addMethod(getSetApplicationMethod())
              .addMethod(getDeleteApplicationMethod())
              .addMethod(getGetDeviceMethod())
              .addMethod(getSetDeviceMethod())
              .addMethod(getDeleteDeviceMethod())
              .addMethod(getGetDevicesForApplicationMethod())
              .addMethod(getDryDownlinkMethod())
              .addMethod(getDryUplinkMethod())
              .addMethod(getSimulateUplinkMethod())
              .build();
        }
      }
    }
    return result;
  }
}
