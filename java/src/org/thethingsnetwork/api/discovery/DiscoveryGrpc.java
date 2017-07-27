package org.thethingsnetwork.api.discovery;

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
 * The Discovery service is used to discover services within The Things Network.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: github.com/TheThingsNetwork/api/discovery/discovery.proto")
public final class DiscoveryGrpc {

  private DiscoveryGrpc() {}

  public static final String SERVICE_NAME = "discovery.Discovery";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.api.discovery.Announcement,
      com.google.protobuf.Empty> METHOD_ANNOUNCE =
      io.grpc.MethodDescriptor.<org.thethingsnetwork.api.discovery.Announcement, com.google.protobuf.Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "discovery.Discovery", "Announce"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.thethingsnetwork.api.discovery.Announcement.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.api.discovery.GetServiceRequest,
      org.thethingsnetwork.api.discovery.AnnouncementsResponse> METHOD_GET_ALL =
      io.grpc.MethodDescriptor.<org.thethingsnetwork.api.discovery.GetServiceRequest, org.thethingsnetwork.api.discovery.AnnouncementsResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "discovery.Discovery", "GetAll"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.thethingsnetwork.api.discovery.GetServiceRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.thethingsnetwork.api.discovery.AnnouncementsResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.api.discovery.GetRequest,
      org.thethingsnetwork.api.discovery.Announcement> METHOD_GET =
      io.grpc.MethodDescriptor.<org.thethingsnetwork.api.discovery.GetRequest, org.thethingsnetwork.api.discovery.Announcement>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "discovery.Discovery", "Get"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.thethingsnetwork.api.discovery.GetRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.thethingsnetwork.api.discovery.Announcement.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.api.discovery.MetadataRequest,
      com.google.protobuf.Empty> METHOD_ADD_METADATA =
      io.grpc.MethodDescriptor.<org.thethingsnetwork.api.discovery.MetadataRequest, com.google.protobuf.Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "discovery.Discovery", "AddMetadata"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.thethingsnetwork.api.discovery.MetadataRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.api.discovery.MetadataRequest,
      com.google.protobuf.Empty> METHOD_DELETE_METADATA =
      io.grpc.MethodDescriptor.<org.thethingsnetwork.api.discovery.MetadataRequest, com.google.protobuf.Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "discovery.Discovery", "DeleteMetadata"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.thethingsnetwork.api.discovery.MetadataRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.api.discovery.GetByAppIDRequest,
      org.thethingsnetwork.api.discovery.Announcement> METHOD_GET_BY_APP_ID =
      io.grpc.MethodDescriptor.<org.thethingsnetwork.api.discovery.GetByAppIDRequest, org.thethingsnetwork.api.discovery.Announcement>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "discovery.Discovery", "GetByAppID"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.thethingsnetwork.api.discovery.GetByAppIDRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.thethingsnetwork.api.discovery.Announcement.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.api.discovery.GetByGatewayIDRequest,
      org.thethingsnetwork.api.discovery.Announcement> METHOD_GET_BY_GATEWAY_ID =
      io.grpc.MethodDescriptor.<org.thethingsnetwork.api.discovery.GetByGatewayIDRequest, org.thethingsnetwork.api.discovery.Announcement>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "discovery.Discovery", "GetByGatewayID"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.thethingsnetwork.api.discovery.GetByGatewayIDRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.thethingsnetwork.api.discovery.Announcement.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.api.discovery.GetByAppEUIRequest,
      org.thethingsnetwork.api.discovery.Announcement> METHOD_GET_BY_APP_EUI =
      io.grpc.MethodDescriptor.<org.thethingsnetwork.api.discovery.GetByAppEUIRequest, org.thethingsnetwork.api.discovery.Announcement>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "discovery.Discovery", "GetByAppEUI"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.thethingsnetwork.api.discovery.GetByAppEUIRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.thethingsnetwork.api.discovery.Announcement.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DiscoveryStub newStub(io.grpc.Channel channel) {
    return new DiscoveryStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DiscoveryBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DiscoveryBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DiscoveryFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DiscoveryFutureStub(channel);
  }

  /**
   * <pre>
   * The Discovery service is used to discover services within The Things Network.
   * </pre>
   */
  public static abstract class DiscoveryImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Announce a component to the Discovery server.
     * A call to `Announce` does not processes the `metadata` field, so you can safely leave this field empty.
     * Adding or removing Metadata should be done with the `AddMetadata` and `DeleteMetadata` methods.
     * </pre>
     */
    public void announce(org.thethingsnetwork.api.discovery.Announcement request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ANNOUNCE, responseObserver);
    }

    /**
     * <pre>
     * Get all announcements for a specific service type
     * </pre>
     */
    public void getAll(org.thethingsnetwork.api.discovery.GetServiceRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.discovery.AnnouncementsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_ALL, responseObserver);
    }

    /**
     * <pre>
     * Get a specific announcement
     * </pre>
     */
    public void get(org.thethingsnetwork.api.discovery.GetRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.discovery.Announcement> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET, responseObserver);
    }

    /**
     * <pre>
     * Add metadata to an announement
     * </pre>
     */
    public void addMetadata(org.thethingsnetwork.api.discovery.MetadataRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ADD_METADATA, responseObserver);
    }

    /**
     * <pre>
     * Delete metadata from an announcement
     * </pre>
     */
    public void deleteMetadata(org.thethingsnetwork.api.discovery.MetadataRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_METADATA, responseObserver);
    }

    /**
     */
    public void getByAppID(org.thethingsnetwork.api.discovery.GetByAppIDRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.discovery.Announcement> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_BY_APP_ID, responseObserver);
    }

    /**
     */
    public void getByGatewayID(org.thethingsnetwork.api.discovery.GetByGatewayIDRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.discovery.Announcement> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_BY_GATEWAY_ID, responseObserver);
    }

    /**
     */
    public void getByAppEUI(org.thethingsnetwork.api.discovery.GetByAppEUIRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.discovery.Announcement> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_BY_APP_EUI, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_ANNOUNCE,
            asyncUnaryCall(
              new MethodHandlers<
                org.thethingsnetwork.api.discovery.Announcement,
                com.google.protobuf.Empty>(
                  this, METHODID_ANNOUNCE)))
          .addMethod(
            METHOD_GET_ALL,
            asyncUnaryCall(
              new MethodHandlers<
                org.thethingsnetwork.api.discovery.GetServiceRequest,
                org.thethingsnetwork.api.discovery.AnnouncementsResponse>(
                  this, METHODID_GET_ALL)))
          .addMethod(
            METHOD_GET,
            asyncUnaryCall(
              new MethodHandlers<
                org.thethingsnetwork.api.discovery.GetRequest,
                org.thethingsnetwork.api.discovery.Announcement>(
                  this, METHODID_GET)))
          .addMethod(
            METHOD_ADD_METADATA,
            asyncUnaryCall(
              new MethodHandlers<
                org.thethingsnetwork.api.discovery.MetadataRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_ADD_METADATA)))
          .addMethod(
            METHOD_DELETE_METADATA,
            asyncUnaryCall(
              new MethodHandlers<
                org.thethingsnetwork.api.discovery.MetadataRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_METADATA)))
          .addMethod(
            METHOD_GET_BY_APP_ID,
            asyncUnaryCall(
              new MethodHandlers<
                org.thethingsnetwork.api.discovery.GetByAppIDRequest,
                org.thethingsnetwork.api.discovery.Announcement>(
                  this, METHODID_GET_BY_APP_ID)))
          .addMethod(
            METHOD_GET_BY_GATEWAY_ID,
            asyncUnaryCall(
              new MethodHandlers<
                org.thethingsnetwork.api.discovery.GetByGatewayIDRequest,
                org.thethingsnetwork.api.discovery.Announcement>(
                  this, METHODID_GET_BY_GATEWAY_ID)))
          .addMethod(
            METHOD_GET_BY_APP_EUI,
            asyncUnaryCall(
              new MethodHandlers<
                org.thethingsnetwork.api.discovery.GetByAppEUIRequest,
                org.thethingsnetwork.api.discovery.Announcement>(
                  this, METHODID_GET_BY_APP_EUI)))
          .build();
    }
  }

  /**
   * <pre>
   * The Discovery service is used to discover services within The Things Network.
   * </pre>
   */
  public static final class DiscoveryStub extends io.grpc.stub.AbstractStub<DiscoveryStub> {
    private DiscoveryStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DiscoveryStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DiscoveryStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DiscoveryStub(channel, callOptions);
    }

    /**
     * <pre>
     * Announce a component to the Discovery server.
     * A call to `Announce` does not processes the `metadata` field, so you can safely leave this field empty.
     * Adding or removing Metadata should be done with the `AddMetadata` and `DeleteMetadata` methods.
     * </pre>
     */
    public void announce(org.thethingsnetwork.api.discovery.Announcement request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ANNOUNCE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get all announcements for a specific service type
     * </pre>
     */
    public void getAll(org.thethingsnetwork.api.discovery.GetServiceRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.discovery.AnnouncementsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_ALL, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a specific announcement
     * </pre>
     */
    public void get(org.thethingsnetwork.api.discovery.GetRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.discovery.Announcement> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add metadata to an announement
     * </pre>
     */
    public void addMetadata(org.thethingsnetwork.api.discovery.MetadataRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ADD_METADATA, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete metadata from an announcement
     * </pre>
     */
    public void deleteMetadata(org.thethingsnetwork.api.discovery.MetadataRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_METADATA, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getByAppID(org.thethingsnetwork.api.discovery.GetByAppIDRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.discovery.Announcement> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_BY_APP_ID, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getByGatewayID(org.thethingsnetwork.api.discovery.GetByGatewayIDRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.discovery.Announcement> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_BY_GATEWAY_ID, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getByAppEUI(org.thethingsnetwork.api.discovery.GetByAppEUIRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.discovery.Announcement> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_BY_APP_EUI, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The Discovery service is used to discover services within The Things Network.
   * </pre>
   */
  public static final class DiscoveryBlockingStub extends io.grpc.stub.AbstractStub<DiscoveryBlockingStub> {
    private DiscoveryBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DiscoveryBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DiscoveryBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DiscoveryBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Announce a component to the Discovery server.
     * A call to `Announce` does not processes the `metadata` field, so you can safely leave this field empty.
     * Adding or removing Metadata should be done with the `AddMetadata` and `DeleteMetadata` methods.
     * </pre>
     */
    public com.google.protobuf.Empty announce(org.thethingsnetwork.api.discovery.Announcement request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ANNOUNCE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Get all announcements for a specific service type
     * </pre>
     */
    public org.thethingsnetwork.api.discovery.AnnouncementsResponse getAll(org.thethingsnetwork.api.discovery.GetServiceRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_ALL, getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a specific announcement
     * </pre>
     */
    public org.thethingsnetwork.api.discovery.Announcement get(org.thethingsnetwork.api.discovery.GetRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET, getCallOptions(), request);
    }

    /**
     * <pre>
     * Add metadata to an announement
     * </pre>
     */
    public com.google.protobuf.Empty addMetadata(org.thethingsnetwork.api.discovery.MetadataRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ADD_METADATA, getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete metadata from an announcement
     * </pre>
     */
    public com.google.protobuf.Empty deleteMetadata(org.thethingsnetwork.api.discovery.MetadataRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_METADATA, getCallOptions(), request);
    }

    /**
     */
    public org.thethingsnetwork.api.discovery.Announcement getByAppID(org.thethingsnetwork.api.discovery.GetByAppIDRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_BY_APP_ID, getCallOptions(), request);
    }

    /**
     */
    public org.thethingsnetwork.api.discovery.Announcement getByGatewayID(org.thethingsnetwork.api.discovery.GetByGatewayIDRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_BY_GATEWAY_ID, getCallOptions(), request);
    }

    /**
     */
    public org.thethingsnetwork.api.discovery.Announcement getByAppEUI(org.thethingsnetwork.api.discovery.GetByAppEUIRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_BY_APP_EUI, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The Discovery service is used to discover services within The Things Network.
   * </pre>
   */
  public static final class DiscoveryFutureStub extends io.grpc.stub.AbstractStub<DiscoveryFutureStub> {
    private DiscoveryFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DiscoveryFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DiscoveryFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DiscoveryFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Announce a component to the Discovery server.
     * A call to `Announce` does not processes the `metadata` field, so you can safely leave this field empty.
     * Adding or removing Metadata should be done with the `AddMetadata` and `DeleteMetadata` methods.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> announce(
        org.thethingsnetwork.api.discovery.Announcement request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ANNOUNCE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Get all announcements for a specific service type
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.api.discovery.AnnouncementsResponse> getAll(
        org.thethingsnetwork.api.discovery.GetServiceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_ALL, getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a specific announcement
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.api.discovery.Announcement> get(
        org.thethingsnetwork.api.discovery.GetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET, getCallOptions()), request);
    }

    /**
     * <pre>
     * Add metadata to an announement
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> addMetadata(
        org.thethingsnetwork.api.discovery.MetadataRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ADD_METADATA, getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete metadata from an announcement
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteMetadata(
        org.thethingsnetwork.api.discovery.MetadataRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_METADATA, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.api.discovery.Announcement> getByAppID(
        org.thethingsnetwork.api.discovery.GetByAppIDRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_BY_APP_ID, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.api.discovery.Announcement> getByGatewayID(
        org.thethingsnetwork.api.discovery.GetByGatewayIDRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_BY_GATEWAY_ID, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.api.discovery.Announcement> getByAppEUI(
        org.thethingsnetwork.api.discovery.GetByAppEUIRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_BY_APP_EUI, getCallOptions()), request);
    }
  }

  private static final int METHODID_ANNOUNCE = 0;
  private static final int METHODID_GET_ALL = 1;
  private static final int METHODID_GET = 2;
  private static final int METHODID_ADD_METADATA = 3;
  private static final int METHODID_DELETE_METADATA = 4;
  private static final int METHODID_GET_BY_APP_ID = 5;
  private static final int METHODID_GET_BY_GATEWAY_ID = 6;
  private static final int METHODID_GET_BY_APP_EUI = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DiscoveryImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DiscoveryImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ANNOUNCE:
          serviceImpl.announce((org.thethingsnetwork.api.discovery.Announcement) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_ALL:
          serviceImpl.getAll((org.thethingsnetwork.api.discovery.GetServiceRequest) request,
              (io.grpc.stub.StreamObserver<org.thethingsnetwork.api.discovery.AnnouncementsResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((org.thethingsnetwork.api.discovery.GetRequest) request,
              (io.grpc.stub.StreamObserver<org.thethingsnetwork.api.discovery.Announcement>) responseObserver);
          break;
        case METHODID_ADD_METADATA:
          serviceImpl.addMetadata((org.thethingsnetwork.api.discovery.MetadataRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DELETE_METADATA:
          serviceImpl.deleteMetadata((org.thethingsnetwork.api.discovery.MetadataRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_BY_APP_ID:
          serviceImpl.getByAppID((org.thethingsnetwork.api.discovery.GetByAppIDRequest) request,
              (io.grpc.stub.StreamObserver<org.thethingsnetwork.api.discovery.Announcement>) responseObserver);
          break;
        case METHODID_GET_BY_GATEWAY_ID:
          serviceImpl.getByGatewayID((org.thethingsnetwork.api.discovery.GetByGatewayIDRequest) request,
              (io.grpc.stub.StreamObserver<org.thethingsnetwork.api.discovery.Announcement>) responseObserver);
          break;
        case METHODID_GET_BY_APP_EUI:
          serviceImpl.getByAppEUI((org.thethingsnetwork.api.discovery.GetByAppEUIRequest) request,
              (io.grpc.stub.StreamObserver<org.thethingsnetwork.api.discovery.Announcement>) responseObserver);
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

  private static final class DiscoveryDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.thethingsnetwork.api.discovery.DiscoveryProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (DiscoveryGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DiscoveryDescriptorSupplier())
              .addMethod(METHOD_ANNOUNCE)
              .addMethod(METHOD_GET_ALL)
              .addMethod(METHOD_GET)
              .addMethod(METHOD_ADD_METADATA)
              .addMethod(METHOD_DELETE_METADATA)
              .addMethod(METHOD_GET_BY_APP_ID)
              .addMethod(METHOD_GET_BY_GATEWAY_ID)
              .addMethod(METHOD_GET_BY_APP_EUI)
              .build();
        }
      }
    }
    return result;
  }
}
