package org.thethingsnetwork.api.monitor;

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
    comments = "Source: github.com/TheThingsNetwork/api/monitor/monitor.proto")
public final class MonitorGrpc {

  private MonitorGrpc() {}

  public static final String SERVICE_NAME = "monitor.Monitor";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.thethingsnetwork.api.router.Status,
      com.google.protobuf.Empty> getRouterStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RouterStatus",
      requestType = org.thethingsnetwork.api.router.Status.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<org.thethingsnetwork.api.router.Status,
      com.google.protobuf.Empty> getRouterStatusMethod() {
    io.grpc.MethodDescriptor<org.thethingsnetwork.api.router.Status, com.google.protobuf.Empty> getRouterStatusMethod;
    if ((getRouterStatusMethod = MonitorGrpc.getRouterStatusMethod) == null) {
      synchronized (MonitorGrpc.class) {
        if ((getRouterStatusMethod = MonitorGrpc.getRouterStatusMethod) == null) {
          MonitorGrpc.getRouterStatusMethod = getRouterStatusMethod = 
              io.grpc.MethodDescriptor.<org.thethingsnetwork.api.router.Status, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "monitor.Monitor", "RouterStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.thethingsnetwork.api.router.Status.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new MonitorMethodDescriptorSupplier("RouterStatus"))
                  .build();
          }
        }
     }
     return getRouterStatusMethod;
  }

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
    if ((getGatewayStatusMethod = MonitorGrpc.getGatewayStatusMethod) == null) {
      synchronized (MonitorGrpc.class) {
        if ((getGatewayStatusMethod = MonitorGrpc.getGatewayStatusMethod) == null) {
          MonitorGrpc.getGatewayStatusMethod = getGatewayStatusMethod = 
              io.grpc.MethodDescriptor.<org.thethingsnetwork.api.gateway.Status, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "monitor.Monitor", "GatewayStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.thethingsnetwork.api.gateway.Status.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new MonitorMethodDescriptorSupplier("GatewayStatus"))
                  .build();
          }
        }
     }
     return getGatewayStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.thethingsnetwork.api.router.UplinkMessage,
      com.google.protobuf.Empty> getGatewayUplinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GatewayUplink",
      requestType = org.thethingsnetwork.api.router.UplinkMessage.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<org.thethingsnetwork.api.router.UplinkMessage,
      com.google.protobuf.Empty> getGatewayUplinkMethod() {
    io.grpc.MethodDescriptor<org.thethingsnetwork.api.router.UplinkMessage, com.google.protobuf.Empty> getGatewayUplinkMethod;
    if ((getGatewayUplinkMethod = MonitorGrpc.getGatewayUplinkMethod) == null) {
      synchronized (MonitorGrpc.class) {
        if ((getGatewayUplinkMethod = MonitorGrpc.getGatewayUplinkMethod) == null) {
          MonitorGrpc.getGatewayUplinkMethod = getGatewayUplinkMethod = 
              io.grpc.MethodDescriptor.<org.thethingsnetwork.api.router.UplinkMessage, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "monitor.Monitor", "GatewayUplink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.thethingsnetwork.api.router.UplinkMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new MonitorMethodDescriptorSupplier("GatewayUplink"))
                  .build();
          }
        }
     }
     return getGatewayUplinkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.thethingsnetwork.api.router.DownlinkMessage,
      com.google.protobuf.Empty> getGatewayDownlinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GatewayDownlink",
      requestType = org.thethingsnetwork.api.router.DownlinkMessage.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<org.thethingsnetwork.api.router.DownlinkMessage,
      com.google.protobuf.Empty> getGatewayDownlinkMethod() {
    io.grpc.MethodDescriptor<org.thethingsnetwork.api.router.DownlinkMessage, com.google.protobuf.Empty> getGatewayDownlinkMethod;
    if ((getGatewayDownlinkMethod = MonitorGrpc.getGatewayDownlinkMethod) == null) {
      synchronized (MonitorGrpc.class) {
        if ((getGatewayDownlinkMethod = MonitorGrpc.getGatewayDownlinkMethod) == null) {
          MonitorGrpc.getGatewayDownlinkMethod = getGatewayDownlinkMethod = 
              io.grpc.MethodDescriptor.<org.thethingsnetwork.api.router.DownlinkMessage, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "monitor.Monitor", "GatewayDownlink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.thethingsnetwork.api.router.DownlinkMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new MonitorMethodDescriptorSupplier("GatewayDownlink"))
                  .build();
          }
        }
     }
     return getGatewayDownlinkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.thethingsnetwork.api.broker.Status,
      com.google.protobuf.Empty> getBrokerStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BrokerStatus",
      requestType = org.thethingsnetwork.api.broker.Status.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<org.thethingsnetwork.api.broker.Status,
      com.google.protobuf.Empty> getBrokerStatusMethod() {
    io.grpc.MethodDescriptor<org.thethingsnetwork.api.broker.Status, com.google.protobuf.Empty> getBrokerStatusMethod;
    if ((getBrokerStatusMethod = MonitorGrpc.getBrokerStatusMethod) == null) {
      synchronized (MonitorGrpc.class) {
        if ((getBrokerStatusMethod = MonitorGrpc.getBrokerStatusMethod) == null) {
          MonitorGrpc.getBrokerStatusMethod = getBrokerStatusMethod = 
              io.grpc.MethodDescriptor.<org.thethingsnetwork.api.broker.Status, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "monitor.Monitor", "BrokerStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.thethingsnetwork.api.broker.Status.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new MonitorMethodDescriptorSupplier("BrokerStatus"))
                  .build();
          }
        }
     }
     return getBrokerStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.thethingsnetwork.api.broker.DeduplicatedUplinkMessage,
      com.google.protobuf.Empty> getBrokerUplinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BrokerUplink",
      requestType = org.thethingsnetwork.api.broker.DeduplicatedUplinkMessage.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<org.thethingsnetwork.api.broker.DeduplicatedUplinkMessage,
      com.google.protobuf.Empty> getBrokerUplinkMethod() {
    io.grpc.MethodDescriptor<org.thethingsnetwork.api.broker.DeduplicatedUplinkMessage, com.google.protobuf.Empty> getBrokerUplinkMethod;
    if ((getBrokerUplinkMethod = MonitorGrpc.getBrokerUplinkMethod) == null) {
      synchronized (MonitorGrpc.class) {
        if ((getBrokerUplinkMethod = MonitorGrpc.getBrokerUplinkMethod) == null) {
          MonitorGrpc.getBrokerUplinkMethod = getBrokerUplinkMethod = 
              io.grpc.MethodDescriptor.<org.thethingsnetwork.api.broker.DeduplicatedUplinkMessage, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "monitor.Monitor", "BrokerUplink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.thethingsnetwork.api.broker.DeduplicatedUplinkMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new MonitorMethodDescriptorSupplier("BrokerUplink"))
                  .build();
          }
        }
     }
     return getBrokerUplinkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.thethingsnetwork.api.broker.DownlinkMessage,
      com.google.protobuf.Empty> getBrokerDownlinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BrokerDownlink",
      requestType = org.thethingsnetwork.api.broker.DownlinkMessage.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<org.thethingsnetwork.api.broker.DownlinkMessage,
      com.google.protobuf.Empty> getBrokerDownlinkMethod() {
    io.grpc.MethodDescriptor<org.thethingsnetwork.api.broker.DownlinkMessage, com.google.protobuf.Empty> getBrokerDownlinkMethod;
    if ((getBrokerDownlinkMethod = MonitorGrpc.getBrokerDownlinkMethod) == null) {
      synchronized (MonitorGrpc.class) {
        if ((getBrokerDownlinkMethod = MonitorGrpc.getBrokerDownlinkMethod) == null) {
          MonitorGrpc.getBrokerDownlinkMethod = getBrokerDownlinkMethod = 
              io.grpc.MethodDescriptor.<org.thethingsnetwork.api.broker.DownlinkMessage, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "monitor.Monitor", "BrokerDownlink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.thethingsnetwork.api.broker.DownlinkMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new MonitorMethodDescriptorSupplier("BrokerDownlink"))
                  .build();
          }
        }
     }
     return getBrokerDownlinkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.thethingsnetwork.api.handler.Status,
      com.google.protobuf.Empty> getHandlerStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HandlerStatus",
      requestType = org.thethingsnetwork.api.handler.Status.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<org.thethingsnetwork.api.handler.Status,
      com.google.protobuf.Empty> getHandlerStatusMethod() {
    io.grpc.MethodDescriptor<org.thethingsnetwork.api.handler.Status, com.google.protobuf.Empty> getHandlerStatusMethod;
    if ((getHandlerStatusMethod = MonitorGrpc.getHandlerStatusMethod) == null) {
      synchronized (MonitorGrpc.class) {
        if ((getHandlerStatusMethod = MonitorGrpc.getHandlerStatusMethod) == null) {
          MonitorGrpc.getHandlerStatusMethod = getHandlerStatusMethod = 
              io.grpc.MethodDescriptor.<org.thethingsnetwork.api.handler.Status, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "monitor.Monitor", "HandlerStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.thethingsnetwork.api.handler.Status.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new MonitorMethodDescriptorSupplier("HandlerStatus"))
                  .build();
          }
        }
     }
     return getHandlerStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.thethingsnetwork.api.broker.DeduplicatedUplinkMessage,
      com.google.protobuf.Empty> getHandlerUplinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HandlerUplink",
      requestType = org.thethingsnetwork.api.broker.DeduplicatedUplinkMessage.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<org.thethingsnetwork.api.broker.DeduplicatedUplinkMessage,
      com.google.protobuf.Empty> getHandlerUplinkMethod() {
    io.grpc.MethodDescriptor<org.thethingsnetwork.api.broker.DeduplicatedUplinkMessage, com.google.protobuf.Empty> getHandlerUplinkMethod;
    if ((getHandlerUplinkMethod = MonitorGrpc.getHandlerUplinkMethod) == null) {
      synchronized (MonitorGrpc.class) {
        if ((getHandlerUplinkMethod = MonitorGrpc.getHandlerUplinkMethod) == null) {
          MonitorGrpc.getHandlerUplinkMethod = getHandlerUplinkMethod = 
              io.grpc.MethodDescriptor.<org.thethingsnetwork.api.broker.DeduplicatedUplinkMessage, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "monitor.Monitor", "HandlerUplink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.thethingsnetwork.api.broker.DeduplicatedUplinkMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new MonitorMethodDescriptorSupplier("HandlerUplink"))
                  .build();
          }
        }
     }
     return getHandlerUplinkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.thethingsnetwork.api.broker.DownlinkMessage,
      com.google.protobuf.Empty> getHandlerDownlinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HandlerDownlink",
      requestType = org.thethingsnetwork.api.broker.DownlinkMessage.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<org.thethingsnetwork.api.broker.DownlinkMessage,
      com.google.protobuf.Empty> getHandlerDownlinkMethod() {
    io.grpc.MethodDescriptor<org.thethingsnetwork.api.broker.DownlinkMessage, com.google.protobuf.Empty> getHandlerDownlinkMethod;
    if ((getHandlerDownlinkMethod = MonitorGrpc.getHandlerDownlinkMethod) == null) {
      synchronized (MonitorGrpc.class) {
        if ((getHandlerDownlinkMethod = MonitorGrpc.getHandlerDownlinkMethod) == null) {
          MonitorGrpc.getHandlerDownlinkMethod = getHandlerDownlinkMethod = 
              io.grpc.MethodDescriptor.<org.thethingsnetwork.api.broker.DownlinkMessage, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "monitor.Monitor", "HandlerDownlink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.thethingsnetwork.api.broker.DownlinkMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new MonitorMethodDescriptorSupplier("HandlerDownlink"))
                  .build();
          }
        }
     }
     return getHandlerDownlinkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.thethingsnetwork.api.networkserver.Status,
      com.google.protobuf.Empty> getNetworkServerStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NetworkServerStatus",
      requestType = org.thethingsnetwork.api.networkserver.Status.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<org.thethingsnetwork.api.networkserver.Status,
      com.google.protobuf.Empty> getNetworkServerStatusMethod() {
    io.grpc.MethodDescriptor<org.thethingsnetwork.api.networkserver.Status, com.google.protobuf.Empty> getNetworkServerStatusMethod;
    if ((getNetworkServerStatusMethod = MonitorGrpc.getNetworkServerStatusMethod) == null) {
      synchronized (MonitorGrpc.class) {
        if ((getNetworkServerStatusMethod = MonitorGrpc.getNetworkServerStatusMethod) == null) {
          MonitorGrpc.getNetworkServerStatusMethod = getNetworkServerStatusMethod = 
              io.grpc.MethodDescriptor.<org.thethingsnetwork.api.networkserver.Status, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "monitor.Monitor", "NetworkServerStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.thethingsnetwork.api.networkserver.Status.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new MonitorMethodDescriptorSupplier("NetworkServerStatus"))
                  .build();
          }
        }
     }
     return getNetworkServerStatusMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MonitorStub newStub(io.grpc.Channel channel) {
    return new MonitorStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MonitorBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MonitorBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MonitorFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MonitorFutureStub(channel);
  }

  /**
   */
  public static abstract class MonitorImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.api.router.Status> routerStatus(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncUnimplementedStreamingCall(getRouterStatusMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.api.gateway.Status> gatewayStatus(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncUnimplementedStreamingCall(getGatewayStatusMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.api.router.UplinkMessage> gatewayUplink(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncUnimplementedStreamingCall(getGatewayUplinkMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.api.router.DownlinkMessage> gatewayDownlink(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncUnimplementedStreamingCall(getGatewayDownlinkMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.api.broker.Status> brokerStatus(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncUnimplementedStreamingCall(getBrokerStatusMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.api.broker.DeduplicatedUplinkMessage> brokerUplink(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncUnimplementedStreamingCall(getBrokerUplinkMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.api.broker.DownlinkMessage> brokerDownlink(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncUnimplementedStreamingCall(getBrokerDownlinkMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.api.handler.Status> handlerStatus(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncUnimplementedStreamingCall(getHandlerStatusMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.api.broker.DeduplicatedUplinkMessage> handlerUplink(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncUnimplementedStreamingCall(getHandlerUplinkMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.api.broker.DownlinkMessage> handlerDownlink(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncUnimplementedStreamingCall(getHandlerDownlinkMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.api.networkserver.Status> networkServerStatus(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncUnimplementedStreamingCall(getNetworkServerStatusMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRouterStatusMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                org.thethingsnetwork.api.router.Status,
                com.google.protobuf.Empty>(
                  this, METHODID_ROUTER_STATUS)))
          .addMethod(
            getGatewayStatusMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                org.thethingsnetwork.api.gateway.Status,
                com.google.protobuf.Empty>(
                  this, METHODID_GATEWAY_STATUS)))
          .addMethod(
            getGatewayUplinkMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                org.thethingsnetwork.api.router.UplinkMessage,
                com.google.protobuf.Empty>(
                  this, METHODID_GATEWAY_UPLINK)))
          .addMethod(
            getGatewayDownlinkMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                org.thethingsnetwork.api.router.DownlinkMessage,
                com.google.protobuf.Empty>(
                  this, METHODID_GATEWAY_DOWNLINK)))
          .addMethod(
            getBrokerStatusMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                org.thethingsnetwork.api.broker.Status,
                com.google.protobuf.Empty>(
                  this, METHODID_BROKER_STATUS)))
          .addMethod(
            getBrokerUplinkMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                org.thethingsnetwork.api.broker.DeduplicatedUplinkMessage,
                com.google.protobuf.Empty>(
                  this, METHODID_BROKER_UPLINK)))
          .addMethod(
            getBrokerDownlinkMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                org.thethingsnetwork.api.broker.DownlinkMessage,
                com.google.protobuf.Empty>(
                  this, METHODID_BROKER_DOWNLINK)))
          .addMethod(
            getHandlerStatusMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                org.thethingsnetwork.api.handler.Status,
                com.google.protobuf.Empty>(
                  this, METHODID_HANDLER_STATUS)))
          .addMethod(
            getHandlerUplinkMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                org.thethingsnetwork.api.broker.DeduplicatedUplinkMessage,
                com.google.protobuf.Empty>(
                  this, METHODID_HANDLER_UPLINK)))
          .addMethod(
            getHandlerDownlinkMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                org.thethingsnetwork.api.broker.DownlinkMessage,
                com.google.protobuf.Empty>(
                  this, METHODID_HANDLER_DOWNLINK)))
          .addMethod(
            getNetworkServerStatusMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                org.thethingsnetwork.api.networkserver.Status,
                com.google.protobuf.Empty>(
                  this, METHODID_NETWORK_SERVER_STATUS)))
          .build();
    }
  }

  /**
   */
  public static final class MonitorStub extends io.grpc.stub.AbstractStub<MonitorStub> {
    private MonitorStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MonitorStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MonitorStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MonitorStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.api.router.Status> routerStatus(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getRouterStatusMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.api.gateway.Status> gatewayStatus(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getGatewayStatusMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.api.router.UplinkMessage> gatewayUplink(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getGatewayUplinkMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.api.router.DownlinkMessage> gatewayDownlink(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getGatewayDownlinkMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.api.broker.Status> brokerStatus(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getBrokerStatusMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.api.broker.DeduplicatedUplinkMessage> brokerUplink(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getBrokerUplinkMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.api.broker.DownlinkMessage> brokerDownlink(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getBrokerDownlinkMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.api.handler.Status> handlerStatus(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getHandlerStatusMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.api.broker.DeduplicatedUplinkMessage> handlerUplink(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getHandlerUplinkMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.api.broker.DownlinkMessage> handlerDownlink(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getHandlerDownlinkMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.api.networkserver.Status> networkServerStatus(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getNetworkServerStatusMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class MonitorBlockingStub extends io.grpc.stub.AbstractStub<MonitorBlockingStub> {
    private MonitorBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MonitorBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MonitorBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MonitorBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class MonitorFutureStub extends io.grpc.stub.AbstractStub<MonitorFutureStub> {
    private MonitorFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MonitorFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MonitorFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MonitorFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_ROUTER_STATUS = 0;
  private static final int METHODID_GATEWAY_STATUS = 1;
  private static final int METHODID_GATEWAY_UPLINK = 2;
  private static final int METHODID_GATEWAY_DOWNLINK = 3;
  private static final int METHODID_BROKER_STATUS = 4;
  private static final int METHODID_BROKER_UPLINK = 5;
  private static final int METHODID_BROKER_DOWNLINK = 6;
  private static final int METHODID_HANDLER_STATUS = 7;
  private static final int METHODID_HANDLER_UPLINK = 8;
  private static final int METHODID_HANDLER_DOWNLINK = 9;
  private static final int METHODID_NETWORK_SERVER_STATUS = 10;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MonitorImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MonitorImplBase serviceImpl, int methodId) {
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
        case METHODID_ROUTER_STATUS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.routerStatus(
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
        case METHODID_GATEWAY_STATUS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.gatewayStatus(
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
        case METHODID_GATEWAY_UPLINK:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.gatewayUplink(
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
        case METHODID_GATEWAY_DOWNLINK:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.gatewayDownlink(
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
        case METHODID_BROKER_STATUS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.brokerStatus(
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
        case METHODID_BROKER_UPLINK:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.brokerUplink(
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
        case METHODID_BROKER_DOWNLINK:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.brokerDownlink(
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
        case METHODID_HANDLER_STATUS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.handlerStatus(
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
        case METHODID_HANDLER_UPLINK:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.handlerUplink(
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
        case METHODID_HANDLER_DOWNLINK:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.handlerDownlink(
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
        case METHODID_NETWORK_SERVER_STATUS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.networkServerStatus(
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class MonitorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MonitorBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.thethingsnetwork.api.monitor.MonitorProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Monitor");
    }
  }

  private static final class MonitorFileDescriptorSupplier
      extends MonitorBaseDescriptorSupplier {
    MonitorFileDescriptorSupplier() {}
  }

  private static final class MonitorMethodDescriptorSupplier
      extends MonitorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MonitorMethodDescriptorSupplier(String methodName) {
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
      synchronized (MonitorGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MonitorFileDescriptorSupplier())
              .addMethod(getRouterStatusMethod())
              .addMethod(getGatewayStatusMethod())
              .addMethod(getGatewayUplinkMethod())
              .addMethod(getGatewayDownlinkMethod())
              .addMethod(getBrokerStatusMethod())
              .addMethod(getBrokerUplinkMethod())
              .addMethod(getBrokerDownlinkMethod())
              .addMethod(getHandlerStatusMethod())
              .addMethod(getHandlerUplinkMethod())
              .addMethod(getHandlerDownlinkMethod())
              .addMethod(getNetworkServerStatusMethod())
              .build();
        }
      }
    }
    return result;
  }
}
