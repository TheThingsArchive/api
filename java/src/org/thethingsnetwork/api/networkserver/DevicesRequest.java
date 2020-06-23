// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/TheThingsNetwork/api/networkserver/networkserver.proto

package org.thethingsnetwork.api.networkserver;

/**
 * Protobuf type {@code networkserver.DevicesRequest}
 */
public  final class DevicesRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:networkserver.DevicesRequest)
    DevicesRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DevicesRequest.newBuilder() to construct.
  private DevicesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DevicesRequest() {
    devAddr_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DevicesRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DevicesRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {

            devAddr_ = input.readBytes();
            break;
          }
          case 16: {

            fCnt_ = input.readUInt32();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.thethingsnetwork.api.networkserver.NetworkServerProto.internal_static_networkserver_DevicesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.thethingsnetwork.api.networkserver.NetworkServerProto.internal_static_networkserver_DevicesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.thethingsnetwork.api.networkserver.DevicesRequest.class, org.thethingsnetwork.api.networkserver.DevicesRequest.Builder.class);
  }

  public static final int DEV_ADDR_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString devAddr_;
  /**
   * <pre>
   * Device address from the uplink message
   * </pre>
   *
   * <code>bytes dev_addr = 1;</code>
   * @return The devAddr.
   */
  public com.google.protobuf.ByteString getDevAddr() {
    return devAddr_;
  }

  public static final int F_CNT_FIELD_NUMBER = 2;
  private int fCnt_;
  /**
   * <pre>
   * Frame counter from the uplink message
   * </pre>
   *
   * <code>uint32 f_cnt = 2;</code>
   * @return The fCnt.
   */
  public int getFCnt() {
    return fCnt_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!devAddr_.isEmpty()) {
      output.writeBytes(1, devAddr_);
    }
    if (fCnt_ != 0) {
      output.writeUInt32(2, fCnt_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!devAddr_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, devAddr_);
    }
    if (fCnt_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, fCnt_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.thethingsnetwork.api.networkserver.DevicesRequest)) {
      return super.equals(obj);
    }
    org.thethingsnetwork.api.networkserver.DevicesRequest other = (org.thethingsnetwork.api.networkserver.DevicesRequest) obj;

    if (!getDevAddr()
        .equals(other.getDevAddr())) return false;
    if (getFCnt()
        != other.getFCnt()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + DEV_ADDR_FIELD_NUMBER;
    hash = (53 * hash) + getDevAddr().hashCode();
    hash = (37 * hash) + F_CNT_FIELD_NUMBER;
    hash = (53 * hash) + getFCnt();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.thethingsnetwork.api.networkserver.DevicesRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.thethingsnetwork.api.networkserver.DevicesRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.thethingsnetwork.api.networkserver.DevicesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.thethingsnetwork.api.networkserver.DevicesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.thethingsnetwork.api.networkserver.DevicesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.thethingsnetwork.api.networkserver.DevicesRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.thethingsnetwork.api.networkserver.DevicesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.thethingsnetwork.api.networkserver.DevicesRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.thethingsnetwork.api.networkserver.DevicesRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.thethingsnetwork.api.networkserver.DevicesRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.thethingsnetwork.api.networkserver.DevicesRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.thethingsnetwork.api.networkserver.DevicesRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.thethingsnetwork.api.networkserver.DevicesRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code networkserver.DevicesRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:networkserver.DevicesRequest)
      org.thethingsnetwork.api.networkserver.DevicesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.thethingsnetwork.api.networkserver.NetworkServerProto.internal_static_networkserver_DevicesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.thethingsnetwork.api.networkserver.NetworkServerProto.internal_static_networkserver_DevicesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.thethingsnetwork.api.networkserver.DevicesRequest.class, org.thethingsnetwork.api.networkserver.DevicesRequest.Builder.class);
    }

    // Construct using org.thethingsnetwork.api.networkserver.DevicesRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      devAddr_ = com.google.protobuf.ByteString.EMPTY;

      fCnt_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.thethingsnetwork.api.networkserver.NetworkServerProto.internal_static_networkserver_DevicesRequest_descriptor;
    }

    @java.lang.Override
    public org.thethingsnetwork.api.networkserver.DevicesRequest getDefaultInstanceForType() {
      return org.thethingsnetwork.api.networkserver.DevicesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public org.thethingsnetwork.api.networkserver.DevicesRequest build() {
      org.thethingsnetwork.api.networkserver.DevicesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.thethingsnetwork.api.networkserver.DevicesRequest buildPartial() {
      org.thethingsnetwork.api.networkserver.DevicesRequest result = new org.thethingsnetwork.api.networkserver.DevicesRequest(this);
      result.devAddr_ = devAddr_;
      result.fCnt_ = fCnt_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.thethingsnetwork.api.networkserver.DevicesRequest) {
        return mergeFrom((org.thethingsnetwork.api.networkserver.DevicesRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.thethingsnetwork.api.networkserver.DevicesRequest other) {
      if (other == org.thethingsnetwork.api.networkserver.DevicesRequest.getDefaultInstance()) return this;
      if (other.getDevAddr() != com.google.protobuf.ByteString.EMPTY) {
        setDevAddr(other.getDevAddr());
      }
      if (other.getFCnt() != 0) {
        setFCnt(other.getFCnt());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.thethingsnetwork.api.networkserver.DevicesRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.thethingsnetwork.api.networkserver.DevicesRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.ByteString devAddr_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * Device address from the uplink message
     * </pre>
     *
     * <code>bytes dev_addr = 1;</code>
     * @return The devAddr.
     */
    public com.google.protobuf.ByteString getDevAddr() {
      return devAddr_;
    }
    /**
     * <pre>
     * Device address from the uplink message
     * </pre>
     *
     * <code>bytes dev_addr = 1;</code>
     * @param value The devAddr to set.
     * @return This builder for chaining.
     */
    public Builder setDevAddr(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      devAddr_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Device address from the uplink message
     * </pre>
     *
     * <code>bytes dev_addr = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDevAddr() {
      
      devAddr_ = getDefaultInstance().getDevAddr();
      onChanged();
      return this;
    }

    private int fCnt_ ;
    /**
     * <pre>
     * Frame counter from the uplink message
     * </pre>
     *
     * <code>uint32 f_cnt = 2;</code>
     * @return The fCnt.
     */
    public int getFCnt() {
      return fCnt_;
    }
    /**
     * <pre>
     * Frame counter from the uplink message
     * </pre>
     *
     * <code>uint32 f_cnt = 2;</code>
     * @param value The fCnt to set.
     * @return This builder for chaining.
     */
    public Builder setFCnt(int value) {
      
      fCnt_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Frame counter from the uplink message
     * </pre>
     *
     * <code>uint32 f_cnt = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearFCnt() {
      
      fCnt_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:networkserver.DevicesRequest)
  }

  // @@protoc_insertion_point(class_scope:networkserver.DevicesRequest)
  private static final org.thethingsnetwork.api.networkserver.DevicesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.thethingsnetwork.api.networkserver.DevicesRequest();
  }

  public static org.thethingsnetwork.api.networkserver.DevicesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DevicesRequest>
      PARSER = new com.google.protobuf.AbstractParser<DevicesRequest>() {
    @java.lang.Override
    public DevicesRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DevicesRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DevicesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DevicesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.thethingsnetwork.api.networkserver.DevicesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

