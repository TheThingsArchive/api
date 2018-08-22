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
  private static volatile io.grpc.MethodDescriptor<org.thethingsnetwork.api.discovery.Announcement,
      com.google.protobuf.Empty> getAnnounceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Announce",
      requestType = org.thethingsnetwork.api.discovery.Announcement.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.thethingsnetwork.api.discovery.Announcement,
      com.google.protobuf.Empty> getAnnounceMethod() {
    io.grpc.MethodDescriptor<org.thethingsnetwork.api.discovery.Announcement, com.google.protobuf.Empty> getAnnounceMethod;
    if ((getAnnounceMethod = DiscoveryGrpc.getAnnounceMethod) == null) {
      synchronized (DiscoveryGrpc.class) {
        if ((getAnnounceMethod = DiscoveryGrpc.getAnnounceMethod) == null) {
          DiscoveryGrpc.getAnnounceMethod = getAnnounceMethod = 
              io.grpc.MethodDescriptor.<org.thethingsnetwork.api.discovery.Announcement, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "discovery.Discovery", "Announce"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.thethingsnetwork.api.discovery.Announcement.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new DiscoveryMethodDescriptorSupplier("Announce"))
                  .build();
          }
        }
     }
     return getAnnounceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.thethingsnetwork.api.discovery.GetServiceRequest,
      org.thethingsnetwork.api.discovery.AnnouncementsResponse> getGetAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAll",
      requestType = org.thethingsnetwork.api.discovery.GetServiceRequest.class,
      responseType = org.thethingsnetwork.api.discovery.AnnouncementsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.thethingsnetwork.api.discovery.GetServiceRequest,
      org.thethingsnetwork.api.discovery.AnnouncementsResponse> getGetAllMethod() {
    io.grpc.MethodDescriptor<org.thethingsnetwork.api.discovery.GetServiceRequest, org.thethingsnetwork.api.discovery.AnnouncementsResponse> getGetAllMethod;
    if ((getGetAllMethod = DiscoveryGrpc.getGetAllMethod) == null) {
      synchronized (DiscoveryGrpc.class) {
        if ((getGetAllMethod = DiscoveryGrpc.getGetAllMethod) == null) {
          DiscoveryGrpc.getGetAllMethod = getGetAllMethod = 
              io.grpc.MethodDescriptor.<org.thethingsnetwork.api.discovery.GetServiceRequest, org.thethingsnetwork.api.discovery.AnnouncementsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "discovery.Discovery", "GetAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.thethingsnetwork.api.discovery.GetServiceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.thethingsnetwork.api.discovery.AnnouncementsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DiscoveryMethodDescriptorSupplier("GetAll"))
                  .build();
          }
        }
     }
     return getGetAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.thethingsnetwork.api.discovery.GetRequest,
      org.thethingsnetwork.api.discovery.Announcement> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = org.thethingsnetwork.api.discovery.GetRequest.class,
      responseType = org.thethingsnetwork.api.discovery.Announcement.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.thethingsnetwork.api.discovery.GetRequest,
      org.thethingsnetwork.api.discovery.Announcement> getGetMethod() {
    io.grpc.MethodDescriptor<org.thethingsnetwork.api.discovery.GetRequest, org.thethingsnetwork.api.discovery.Announcement> getGetMethod;
    if ((getGetMethod = DiscoveryGrpc.getGetMethod) == null) {
      synchronized (DiscoveryGrpc.class) {
        if ((getGetMethod = DiscoveryGrpc.getGetMethod) == null) {
          DiscoveryGrpc.getGetMethod = getGetMethod = 
              io.grpc.MethodDescriptor.<org.thethingsnetwork.api.discovery.GetRequest, org.thethingsnetwork.api.discovery.Announcement>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "discovery.Discovery", "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.thethingsnetwork.api.discovery.GetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.thethingsnetwork.api.discovery.Announcement.getDefaultInstance()))
                  .setSchemaDescriptor(new DiscoveryMethodDescriptorSupplier("Get"))
                  .build();
          }
        }
     }
     return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.thethingsnetwork.api.discovery.MetadataRequest,
      com.google.protobuf.Empty> getAddMetadataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddMetadata",
      requestType = org.thethingsnetwork.api.discovery.MetadataRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.thethingsnetwork.api.discovery.MetadataRequest,
      com.google.protobuf.Empty> getAddMetadataMethod() {
    io.grpc.MethodDescriptor<org.thethingsnetwork.api.discovery.MetadataRequest, com.google.protobuf.Empty> getAddMetadataMethod;
    if ((getAddMetadataMethod = DiscoveryGrpc.getAddMetadataMethod) == null) {
      synchronized (DiscoveryGrpc.class) {
        if ((getAddMetadataMethod = DiscoveryGrpc.getAddMetadataMethod) == null) {
          DiscoveryGrpc.getAddMetadataMethod = getAddMetadataMethod = 
              io.grpc.MethodDescriptor.<org.thethingsnetwork.api.discovery.MetadataRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "discovery.Discovery", "AddMetadata"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.thethingsnetwork.api.discovery.MetadataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new DiscoveryMethodDescriptorSupplier("AddMetadata"))
                  .build();
          }
        }
     }
     return getAddMetadataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.thethingsnetwork.api.discovery.MetadataRequest,
      com.google.protobuf.Empty> getDeleteMetadataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteMetadata",
      requestType = org.thethingsnetwork.api.discovery.MetadataRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.thethingsnetwork.api.discovery.MetadataRequest,
      com.google.protobuf.Empty> getDeleteMetadataMethod() {
    io.grpc.MethodDescriptor<org.thethingsnetwork.api.discovery.MetadataRequest, com.google.protobuf.Empty> getDeleteMetadataMethod;
    if ((getDeleteMetadataMethod = DiscoveryGrpc.getDeleteMetadataMethod) == null) {
      synchronized (DiscoveryGrpc.class) {
        if ((getDeleteMetadataMethod = DiscoveryGrpc.getDeleteMetadataMethod) == null) {
          DiscoveryGrpc.getDeleteMetadataMethod = getDeleteMetadataMethod = 
              io.grpc.MethodDescriptor.<org.thethingsnetwork.api.discovery.MetadataRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "discovery.Discovery", "DeleteMetadata"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.thethingsnetwork.api.discovery.MetadataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new DiscoveryMethodDescriptorSupplier("DeleteMetadata"))
                  .build();
          }
        }
     }
     return getDeleteMetadataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.thethingsnetwork.api.discovery.GetByAppIDRequest,
      org.thethingsnetwork.api.discovery.Announcement> getGetByAppIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetByAppID",
      requestType = org.thethingsnetwork.api.discovery.GetByAppIDRequest.class,
      responseType = org.thethingsnetwork.api.discovery.Announcement.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.thethingsnetwork.api.discovery.GetByAppIDRequest,
      org.thethingsnetwork.api.discovery.Announcement> getGetByAppIDMethod() {
    io.grpc.MethodDescriptor<org.thethingsnetwork.api.discovery.GetByAppIDRequest, org.thethingsnetwork.api.discovery.Announcement> getGetByAppIDMethod;
    if ((getGetByAppIDMethod = DiscoveryGrpc.getGetByAppIDMethod) == null) {
      synchronized (DiscoveryGrpc.class) {
        if ((getGetByAppIDMethod = DiscoveryGrpc.getGetByAppIDMethod) == null) {
          DiscoveryGrpc.getGetByAppIDMethod = getGetByAppIDMethod = 
              io.grpc.MethodDescriptor.<org.thethingsnetwork.api.discovery.GetByAppIDRequest, org.thethingsnetwork.api.discovery.Announcement>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "discovery.Discovery", "GetByAppID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.thethingsnetwork.api.discovery.GetByAppIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.thethingsnetwork.api.discovery.Announcement.getDefaultInstance()))
                  .setSchemaDescriptor(new DiscoveryMethodDescriptorSupplier("GetByAppID"))
                  .build();
          }
        }
     }
     return getGetByAppIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.thethingsnetwork.api.discovery.GetByGatewayIDRequest,
      org.thethingsnetwork.api.discovery.Announcement> getGetByGatewayIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetByGatewayID",
      requestType = org.thethingsnetwork.api.discovery.GetByGatewayIDRequest.class,
      responseType = org.thethingsnetwork.api.discovery.Announcement.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.thethingsnetwork.api.discovery.GetByGatewayIDRequest,
      org.thethingsnetwork.api.discovery.Announcement> getGetByGatewayIDMethod() {
    io.grpc.MethodDescriptor<org.thethingsnetwork.api.discovery.GetByGatewayIDRequest, org.thethingsnetwork.api.discovery.Announcement> getGetByGatewayIDMethod;
    if ((getGetByGatewayIDMethod = DiscoveryGrpc.getGetByGatewayIDMethod) == null) {
      synchronized (DiscoveryGrpc.class) {
        if ((getGetByGatewayIDMethod = DiscoveryGrpc.getGetByGatewayIDMethod) == null) {
          DiscoveryGrpc.getGetByGatewayIDMethod = getGetByGatewayIDMethod = 
              io.grpc.MethodDescriptor.<org.thethingsnetwork.api.discovery.GetByGatewayIDRequest, org.thethingsnetwork.api.discovery.Announcement>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "discovery.Discovery", "GetByGatewayID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.thethingsnetwork.api.discovery.GetByGatewayIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.thethingsnetwork.api.discovery.Announcement.getDefaultInstance()))
                  .setSchemaDescriptor(new DiscoveryMethodDescriptorSupplier("GetByGatewayID"))
                  .build();
          }
        }
     }
     return getGetByGatewayIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.thethingsnetwork.api.discovery.GetByAppEUIRequest,
      org.thethingsnetwork.api.discovery.Announcement> getGetByAppEUIMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetByAppEUI",
      requestType = org.thethingsnetwork.api.discovery.GetByAppEUIRequest.class,
      responseType = org.thethingsnetwork.api.discovery.Announcement.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.thethingsnetwork.api.discovery.GetByAppEUIRequest,
      org.thethingsnetwork.api.discovery.Announcement> getGetByAppEUIMethod() {
    io.grpc.MethodDescriptor<org.thethingsnetwork.api.discovery.GetByAppEUIRequest, org.thethingsnetwork.api.discovery.Announcement> getGetByAppEUIMethod;
    if ((getGetByAppEUIMethod = DiscoveryGrpc.getGetByAppEUIMethod) == null) {
      synchronized (DiscoveryGrpc.class) {
        if ((getGetByAppEUIMethod = DiscoveryGrpc.getGetByAppEUIMethod) == null) {
          DiscoveryGrpc.getGetByAppEUIMethod = getGetByAppEUIMethod = 
              io.grpc.MethodDescriptor.<org.thethingsnetwork.api.discovery.GetByAppEUIRequest, org.thethingsnetwork.api.discovery.Announcement>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "discovery.Discovery", "GetByAppEUI"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.thethingsnetwork.api.discovery.GetByAppEUIRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.thethingsnetwork.api.discovery.Announcement.getDefaultInstance()))
                  .setSchemaDescriptor(new DiscoveryMethodDescriptorSupplier("GetByAppEUI"))
                  .build();
          }
        }
     }
     return getGetByAppEUIMethod;
  }

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
      asyncUnimplementedUnaryCall(getAnnounceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get all announcements for a specific service type
     * </pre>
     */
    public void getAll(org.thethingsnetwork.api.discovery.GetServiceRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.discovery.AnnouncementsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a specific announcement
     * </pre>
     */
    public void get(org.thethingsnetwork.api.discovery.GetRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.discovery.Announcement> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add metadata to an announement
     * </pre>
     */
    public void addMetadata(org.thethingsnetwork.api.discovery.MetadataRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getAddMetadataMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete metadata from an announcement
     * </pre>
     */
    public void deleteMetadata(org.thethingsnetwork.api.discovery.MetadataRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMetadataMethod(), responseObserver);
    }

    /**
     */
    public void getByAppID(org.thethingsnetwork.api.discovery.GetByAppIDRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.discovery.Announcement> responseObserver) {
      asyncUnimplementedUnaryCall(getGetByAppIDMethod(), responseObserver);
    }

    /**
     */
    public void getByGatewayID(org.thethingsnetwork.api.discovery.GetByGatewayIDRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.discovery.Announcement> responseObserver) {
      asyncUnimplementedUnaryCall(getGetByGatewayIDMethod(), responseObserver);
    }

    /**
     */
    public void getByAppEUI(org.thethingsnetwork.api.discovery.GetByAppEUIRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.discovery.Announcement> responseObserver) {
      asyncUnimplementedUnaryCall(getGetByAppEUIMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAnnounceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.thethingsnetwork.api.discovery.Announcement,
                com.google.protobuf.Empty>(
                  this, METHODID_ANNOUNCE)))
          .addMethod(
            getGetAllMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.thethingsnetwork.api.discovery.GetServiceRequest,
                org.thethingsnetwork.api.discovery.AnnouncementsResponse>(
                  this, METHODID_GET_ALL)))
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.thethingsnetwork.api.discovery.GetRequest,
                org.thethingsnetwork.api.discovery.Announcement>(
                  this, METHODID_GET)))
          .addMethod(
            getAddMetadataMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.thethingsnetwork.api.discovery.MetadataRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_ADD_METADATA)))
          .addMethod(
            getDeleteMetadataMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.thethingsnetwork.api.discovery.MetadataRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_METADATA)))
          .addMethod(
            getGetByAppIDMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.thethingsnetwork.api.discovery.GetByAppIDRequest,
                org.thethingsnetwork.api.discovery.Announcement>(
                  this, METHODID_GET_BY_APP_ID)))
          .addMethod(
            getGetByGatewayIDMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.thethingsnetwork.api.discovery.GetByGatewayIDRequest,
                org.thethingsnetwork.api.discovery.Announcement>(
                  this, METHODID_GET_BY_GATEWAY_ID)))
          .addMethod(
            getGetByAppEUIMethod(),
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
          getChannel().newCall(getAnnounceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get all announcements for a specific service type
     * </pre>
     */
    public void getAll(org.thethingsnetwork.api.discovery.GetServiceRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.discovery.AnnouncementsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a specific announcement
     * </pre>
     */
    public void get(org.thethingsnetwork.api.discovery.GetRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.discovery.Announcement> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add metadata to an announement
     * </pre>
     */
    public void addMetadata(org.thethingsnetwork.api.discovery.MetadataRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddMetadataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete metadata from an announcement
     * </pre>
     */
    public void deleteMetadata(org.thethingsnetwork.api.discovery.MetadataRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMetadataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getByAppID(org.thethingsnetwork.api.discovery.GetByAppIDRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.discovery.Announcement> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetByAppIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getByGatewayID(org.thethingsnetwork.api.discovery.GetByGatewayIDRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.discovery.Announcement> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetByGatewayIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getByAppEUI(org.thethingsnetwork.api.discovery.GetByAppEUIRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.discovery.Announcement> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetByAppEUIMethod(), getCallOptions()), request, responseObserver);
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
          getChannel(), getAnnounceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get all announcements for a specific service type
     * </pre>
     */
    public org.thethingsnetwork.api.discovery.AnnouncementsResponse getAll(org.thethingsnetwork.api.discovery.GetServiceRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a specific announcement
     * </pre>
     */
    public org.thethingsnetwork.api.discovery.Announcement get(org.thethingsnetwork.api.discovery.GetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add metadata to an announement
     * </pre>
     */
    public com.google.protobuf.Empty addMetadata(org.thethingsnetwork.api.discovery.MetadataRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddMetadataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete metadata from an announcement
     * </pre>
     */
    public com.google.protobuf.Empty deleteMetadata(org.thethingsnetwork.api.discovery.MetadataRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMetadataMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.thethingsnetwork.api.discovery.Announcement getByAppID(org.thethingsnetwork.api.discovery.GetByAppIDRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetByAppIDMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.thethingsnetwork.api.discovery.Announcement getByGatewayID(org.thethingsnetwork.api.discovery.GetByGatewayIDRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetByGatewayIDMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.thethingsnetwork.api.discovery.Announcement getByAppEUI(org.thethingsnetwork.api.discovery.GetByAppEUIRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetByAppEUIMethod(), getCallOptions(), request);
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
          getChannel().newCall(getAnnounceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get all announcements for a specific service type
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.api.discovery.AnnouncementsResponse> getAll(
        org.thethingsnetwork.api.discovery.GetServiceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a specific announcement
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.api.discovery.Announcement> get(
        org.thethingsnetwork.api.discovery.GetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add metadata to an announement
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> addMetadata(
        org.thethingsnetwork.api.discovery.MetadataRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddMetadataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete metadata from an announcement
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteMetadata(
        org.thethingsnetwork.api.discovery.MetadataRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMetadataMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.api.discovery.Announcement> getByAppID(
        org.thethingsnetwork.api.discovery.GetByAppIDRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetByAppIDMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.api.discovery.Announcement> getByGatewayID(
        org.thethingsnetwork.api.discovery.GetByGatewayIDRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetByGatewayIDMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.api.discovery.Announcement> getByAppEUI(
        org.thethingsnetwork.api.discovery.GetByAppEUIRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetByAppEUIMethod(), getCallOptions()), request);
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

  private static abstract class DiscoveryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DiscoveryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.thethingsnetwork.api.discovery.DiscoveryProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Discovery");
    }
  }

  private static final class DiscoveryFileDescriptorSupplier
      extends DiscoveryBaseDescriptorSupplier {
    DiscoveryFileDescriptorSupplier() {}
  }

  private static final class DiscoveryMethodDescriptorSupplier
      extends DiscoveryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DiscoveryMethodDescriptorSupplier(String methodName) {
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
      synchronized (DiscoveryGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DiscoveryFileDescriptorSupplier())
              .addMethod(getAnnounceMethod())
              .addMethod(getGetAllMethod())
              .addMethod(getGetMethod())
              .addMethod(getAddMetadataMethod())
              .addMethod(getDeleteMetadataMethod())
              .addMethod(getGetByAppIDMethod())
              .addMethod(getGetByGatewayIDMethod())
              .addMethod(getGetByAppEUIMethod())
              .build();
        }
      }
    }
    return result;
  }
}
