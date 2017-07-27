package org.thethingsnetwork.api.monitor;

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
    comments = "Source: github.com/TheThingsNetwork/api/monitor/monitor.proto")
public final class MonitorGrpc {

  private MonitorGrpc() {}

  public static final String SERVICE_NAME = "monitor.Monitor";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.api.router.Status,
      com.google.protobuf.Empty> METHOD_ROUTER_STATUS =
      io.grpc.MethodDescriptor.<org.thethingsnetwork.api.router.Status, com.google.protobuf.Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "monitor.Monitor", "RouterStatus"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.thethingsnetwork.api.router.Status.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.api.gateway.Status,
      com.google.protobuf.Empty> METHOD_GATEWAY_STATUS =
      io.grpc.MethodDescriptor.<org.thethingsnetwork.api.gateway.Status, com.google.protobuf.Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "monitor.Monitor", "GatewayStatus"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.thethingsnetwork.api.gateway.Status.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.api.router.UplinkMessage,
      com.google.protobuf.Empty> METHOD_GATEWAY_UPLINK =
      io.grpc.MethodDescriptor.<org.thethingsnetwork.api.router.UplinkMessage, com.google.protobuf.Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "monitor.Monitor", "GatewayUplink"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.thethingsnetwork.api.router.UplinkMessage.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.api.router.DownlinkMessage,
      com.google.protobuf.Empty> METHOD_GATEWAY_DOWNLINK =
      io.grpc.MethodDescriptor.<org.thethingsnetwork.api.router.DownlinkMessage, com.google.protobuf.Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "monitor.Monitor", "GatewayDownlink"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.thethingsnetwork.api.router.DownlinkMessage.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.api.broker.Status,
      com.google.protobuf.Empty> METHOD_BROKER_STATUS =
      io.grpc.MethodDescriptor.<org.thethingsnetwork.api.broker.Status, com.google.protobuf.Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "monitor.Monitor", "BrokerStatus"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.thethingsnetwork.api.broker.Status.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.api.broker.DeduplicatedUplinkMessage,
      com.google.protobuf.Empty> METHOD_BROKER_UPLINK =
      io.grpc.MethodDescriptor.<org.thethingsnetwork.api.broker.DeduplicatedUplinkMessage, com.google.protobuf.Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "monitor.Monitor", "BrokerUplink"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.thethingsnetwork.api.broker.DeduplicatedUplinkMessage.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.api.broker.DownlinkMessage,
      com.google.protobuf.Empty> METHOD_BROKER_DOWNLINK =
      io.grpc.MethodDescriptor.<org.thethingsnetwork.api.broker.DownlinkMessage, com.google.protobuf.Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "monitor.Monitor", "BrokerDownlink"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.thethingsnetwork.api.broker.DownlinkMessage.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.api.handler.Status,
      com.google.protobuf.Empty> METHOD_HANDLER_STATUS =
      io.grpc.MethodDescriptor.<org.thethingsnetwork.api.handler.Status, com.google.protobuf.Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "monitor.Monitor", "HandlerStatus"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.thethingsnetwork.api.handler.Status.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.api.broker.DeduplicatedUplinkMessage,
      com.google.protobuf.Empty> METHOD_HANDLER_UPLINK =
      io.grpc.MethodDescriptor.<org.thethingsnetwork.api.broker.DeduplicatedUplinkMessage, com.google.protobuf.Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "monitor.Monitor", "HandlerUplink"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.thethingsnetwork.api.broker.DeduplicatedUplinkMessage.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.api.broker.DownlinkMessage,
      com.google.protobuf.Empty> METHOD_HANDLER_DOWNLINK =
      io.grpc.MethodDescriptor.<org.thethingsnetwork.api.broker.DownlinkMessage, com.google.protobuf.Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "monitor.Monitor", "HandlerDownlink"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.thethingsnetwork.api.broker.DownlinkMessage.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.api.networkserver.Status,
      com.google.protobuf.Empty> METHOD_NETWORK_SERVER_STATUS =
      io.grpc.MethodDescriptor.<org.thethingsnetwork.api.networkserver.Status, com.google.protobuf.Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "monitor.Monitor", "NetworkServerStatus"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.thethingsnetwork.api.networkserver.Status.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .build();

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
      return asyncUnimplementedStreamingCall(METHOD_ROUTER_STATUS, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.api.gateway.Status> gatewayStatus(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_GATEWAY_STATUS, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.api.router.UplinkMessage> gatewayUplink(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_GATEWAY_UPLINK, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.api.router.DownlinkMessage> gatewayDownlink(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_GATEWAY_DOWNLINK, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.api.broker.Status> brokerStatus(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_BROKER_STATUS, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.api.broker.DeduplicatedUplinkMessage> brokerUplink(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_BROKER_UPLINK, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.api.broker.DownlinkMessage> brokerDownlink(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_BROKER_DOWNLINK, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.api.handler.Status> handlerStatus(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_HANDLER_STATUS, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.api.broker.DeduplicatedUplinkMessage> handlerUplink(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_HANDLER_UPLINK, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.api.broker.DownlinkMessage> handlerDownlink(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_HANDLER_DOWNLINK, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.api.networkserver.Status> networkServerStatus(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_NETWORK_SERVER_STATUS, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_ROUTER_STATUS,
            asyncClientStreamingCall(
              new MethodHandlers<
                org.thethingsnetwork.api.router.Status,
                com.google.protobuf.Empty>(
                  this, METHODID_ROUTER_STATUS)))
          .addMethod(
            METHOD_GATEWAY_STATUS,
            asyncClientStreamingCall(
              new MethodHandlers<
                org.thethingsnetwork.api.gateway.Status,
                com.google.protobuf.Empty>(
                  this, METHODID_GATEWAY_STATUS)))
          .addMethod(
            METHOD_GATEWAY_UPLINK,
            asyncClientStreamingCall(
              new MethodHandlers<
                org.thethingsnetwork.api.router.UplinkMessage,
                com.google.protobuf.Empty>(
                  this, METHODID_GATEWAY_UPLINK)))
          .addMethod(
            METHOD_GATEWAY_DOWNLINK,
            asyncClientStreamingCall(
              new MethodHandlers<
                org.thethingsnetwork.api.router.DownlinkMessage,
                com.google.protobuf.Empty>(
                  this, METHODID_GATEWAY_DOWNLINK)))
          .addMethod(
            METHOD_BROKER_STATUS,
            asyncClientStreamingCall(
              new MethodHandlers<
                org.thethingsnetwork.api.broker.Status,
                com.google.protobuf.Empty>(
                  this, METHODID_BROKER_STATUS)))
          .addMethod(
            METHOD_BROKER_UPLINK,
            asyncClientStreamingCall(
              new MethodHandlers<
                org.thethingsnetwork.api.broker.DeduplicatedUplinkMessage,
                com.google.protobuf.Empty>(
                  this, METHODID_BROKER_UPLINK)))
          .addMethod(
            METHOD_BROKER_DOWNLINK,
            asyncClientStreamingCall(
              new MethodHandlers<
                org.thethingsnetwork.api.broker.DownlinkMessage,
                com.google.protobuf.Empty>(
                  this, METHODID_BROKER_DOWNLINK)))
          .addMethod(
            METHOD_HANDLER_STATUS,
            asyncClientStreamingCall(
              new MethodHandlers<
                org.thethingsnetwork.api.handler.Status,
                com.google.protobuf.Empty>(
                  this, METHODID_HANDLER_STATUS)))
          .addMethod(
            METHOD_HANDLER_UPLINK,
            asyncClientStreamingCall(
              new MethodHandlers<
                org.thethingsnetwork.api.broker.DeduplicatedUplinkMessage,
                com.google.protobuf.Empty>(
                  this, METHODID_HANDLER_UPLINK)))
          .addMethod(
            METHOD_HANDLER_DOWNLINK,
            asyncClientStreamingCall(
              new MethodHandlers<
                org.thethingsnetwork.api.broker.DownlinkMessage,
                com.google.protobuf.Empty>(
                  this, METHODID_HANDLER_DOWNLINK)))
          .addMethod(
            METHOD_NETWORK_SERVER_STATUS,
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
          getChannel().newCall(METHOD_ROUTER_STATUS, getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.api.gateway.Status> gatewayStatus(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(METHOD_GATEWAY_STATUS, getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.api.router.UplinkMessage> gatewayUplink(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(METHOD_GATEWAY_UPLINK, getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.api.router.DownlinkMessage> gatewayDownlink(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(METHOD_GATEWAY_DOWNLINK, getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.api.broker.Status> brokerStatus(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(METHOD_BROKER_STATUS, getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.api.broker.DeduplicatedUplinkMessage> brokerUplink(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(METHOD_BROKER_UPLINK, getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.api.broker.DownlinkMessage> brokerDownlink(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(METHOD_BROKER_DOWNLINK, getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.api.handler.Status> handlerStatus(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(METHOD_HANDLER_STATUS, getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.api.broker.DeduplicatedUplinkMessage> handlerUplink(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(METHOD_HANDLER_UPLINK, getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.api.broker.DownlinkMessage> handlerDownlink(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(METHOD_HANDLER_DOWNLINK, getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.api.networkserver.Status> networkServerStatus(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(METHOD_NETWORK_SERVER_STATUS, getCallOptions()), responseObserver);
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

  private static final class MonitorDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.thethingsnetwork.api.monitor.MonitorProto.getDescriptor();
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
              .setSchemaDescriptor(new MonitorDescriptorSupplier())
              .addMethod(METHOD_ROUTER_STATUS)
              .addMethod(METHOD_GATEWAY_STATUS)
              .addMethod(METHOD_GATEWAY_UPLINK)
              .addMethod(METHOD_GATEWAY_DOWNLINK)
              .addMethod(METHOD_BROKER_STATUS)
              .addMethod(METHOD_BROKER_UPLINK)
              .addMethod(METHOD_BROKER_DOWNLINK)
              .addMethod(METHOD_HANDLER_STATUS)
              .addMethod(METHOD_HANDLER_UPLINK)
              .addMethod(METHOD_HANDLER_DOWNLINK)
              .addMethod(METHOD_NETWORK_SERVER_STATUS)
              .build();
        }
      }
    }
    return result;
  }
}
