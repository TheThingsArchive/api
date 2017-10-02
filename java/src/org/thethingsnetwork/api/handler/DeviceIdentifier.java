// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/TheThingsNetwork/api/handler/handler.proto

package org.thethingsnetwork.api.handler;

/**
 * Protobuf type {@code handler.DeviceIdentifier}
 */
public  final class DeviceIdentifier extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:handler.DeviceIdentifier)
    DeviceIdentifierOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeviceIdentifier.newBuilder() to construct.
  private DeviceIdentifier(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeviceIdentifier() {
    appId_ = "";
    devId_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DeviceIdentifier(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            appId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            devId_ = s;
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
    return org.thethingsnetwork.api.handler.HandlerProto.internal_static_handler_DeviceIdentifier_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.thethingsnetwork.api.handler.HandlerProto.internal_static_handler_DeviceIdentifier_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.thethingsnetwork.api.handler.DeviceIdentifier.class, org.thethingsnetwork.api.handler.DeviceIdentifier.Builder.class);
  }

  public static final int APP_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object appId_;
  /**
   * <code>string app_id = 1 [(.gogoproto.customname) = "AppID"];</code>
   */
  public java.lang.String getAppId() {
    java.lang.Object ref = appId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      appId_ = s;
      return s;
    }
  }
  /**
   * <code>string app_id = 1 [(.gogoproto.customname) = "AppID"];</code>
   */
  public com.google.protobuf.ByteString
      getAppIdBytes() {
    java.lang.Object ref = appId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      appId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DEV_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object devId_;
  /**
   * <code>string dev_id = 2 [(.gogoproto.customname) = "DevID"];</code>
   */
  public java.lang.String getDevId() {
    java.lang.Object ref = devId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      devId_ = s;
      return s;
    }
  }
  /**
   * <code>string dev_id = 2 [(.gogoproto.customname) = "DevID"];</code>
   */
  public com.google.protobuf.ByteString
      getDevIdBytes() {
    java.lang.Object ref = devId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      devId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getAppIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, appId_);
    }
    if (!getDevIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, devId_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getAppIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, appId_);
    }
    if (!getDevIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, devId_);
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
    if (!(obj instanceof org.thethingsnetwork.api.handler.DeviceIdentifier)) {
      return super.equals(obj);
    }
    org.thethingsnetwork.api.handler.DeviceIdentifier other = (org.thethingsnetwork.api.handler.DeviceIdentifier) obj;

    boolean result = true;
    result = result && getAppId()
        .equals(other.getAppId());
    result = result && getDevId()
        .equals(other.getDevId());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + APP_ID_FIELD_NUMBER;
    hash = (53 * hash) + getAppId().hashCode();
    hash = (37 * hash) + DEV_ID_FIELD_NUMBER;
    hash = (53 * hash) + getDevId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.thethingsnetwork.api.handler.DeviceIdentifier parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.thethingsnetwork.api.handler.DeviceIdentifier parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.thethingsnetwork.api.handler.DeviceIdentifier parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.thethingsnetwork.api.handler.DeviceIdentifier parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.thethingsnetwork.api.handler.DeviceIdentifier parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.thethingsnetwork.api.handler.DeviceIdentifier parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.thethingsnetwork.api.handler.DeviceIdentifier parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.thethingsnetwork.api.handler.DeviceIdentifier parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.thethingsnetwork.api.handler.DeviceIdentifier parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.thethingsnetwork.api.handler.DeviceIdentifier parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.thethingsnetwork.api.handler.DeviceIdentifier parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.thethingsnetwork.api.handler.DeviceIdentifier parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.thethingsnetwork.api.handler.DeviceIdentifier prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code handler.DeviceIdentifier}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:handler.DeviceIdentifier)
      org.thethingsnetwork.api.handler.DeviceIdentifierOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.thethingsnetwork.api.handler.HandlerProto.internal_static_handler_DeviceIdentifier_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.thethingsnetwork.api.handler.HandlerProto.internal_static_handler_DeviceIdentifier_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.thethingsnetwork.api.handler.DeviceIdentifier.class, org.thethingsnetwork.api.handler.DeviceIdentifier.Builder.class);
    }

    // Construct using org.thethingsnetwork.api.handler.DeviceIdentifier.newBuilder()
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
    public Builder clear() {
      super.clear();
      appId_ = "";

      devId_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.thethingsnetwork.api.handler.HandlerProto.internal_static_handler_DeviceIdentifier_descriptor;
    }

    public org.thethingsnetwork.api.handler.DeviceIdentifier getDefaultInstanceForType() {
      return org.thethingsnetwork.api.handler.DeviceIdentifier.getDefaultInstance();
    }

    public org.thethingsnetwork.api.handler.DeviceIdentifier build() {
      org.thethingsnetwork.api.handler.DeviceIdentifier result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.thethingsnetwork.api.handler.DeviceIdentifier buildPartial() {
      org.thethingsnetwork.api.handler.DeviceIdentifier result = new org.thethingsnetwork.api.handler.DeviceIdentifier(this);
      result.appId_ = appId_;
      result.devId_ = devId_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.thethingsnetwork.api.handler.DeviceIdentifier) {
        return mergeFrom((org.thethingsnetwork.api.handler.DeviceIdentifier)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.thethingsnetwork.api.handler.DeviceIdentifier other) {
      if (other == org.thethingsnetwork.api.handler.DeviceIdentifier.getDefaultInstance()) return this;
      if (!other.getAppId().isEmpty()) {
        appId_ = other.appId_;
        onChanged();
      }
      if (!other.getDevId().isEmpty()) {
        devId_ = other.devId_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.thethingsnetwork.api.handler.DeviceIdentifier parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.thethingsnetwork.api.handler.DeviceIdentifier) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object appId_ = "";
    /**
     * <code>string app_id = 1 [(.gogoproto.customname) = "AppID"];</code>
     */
    public java.lang.String getAppId() {
      java.lang.Object ref = appId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        appId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string app_id = 1 [(.gogoproto.customname) = "AppID"];</code>
     */
    public com.google.protobuf.ByteString
        getAppIdBytes() {
      java.lang.Object ref = appId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        appId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string app_id = 1 [(.gogoproto.customname) = "AppID"];</code>
     */
    public Builder setAppId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      appId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string app_id = 1 [(.gogoproto.customname) = "AppID"];</code>
     */
    public Builder clearAppId() {
      
      appId_ = getDefaultInstance().getAppId();
      onChanged();
      return this;
    }
    /**
     * <code>string app_id = 1 [(.gogoproto.customname) = "AppID"];</code>
     */
    public Builder setAppIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      appId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object devId_ = "";
    /**
     * <code>string dev_id = 2 [(.gogoproto.customname) = "DevID"];</code>
     */
    public java.lang.String getDevId() {
      java.lang.Object ref = devId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        devId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string dev_id = 2 [(.gogoproto.customname) = "DevID"];</code>
     */
    public com.google.protobuf.ByteString
        getDevIdBytes() {
      java.lang.Object ref = devId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        devId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string dev_id = 2 [(.gogoproto.customname) = "DevID"];</code>
     */
    public Builder setDevId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      devId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string dev_id = 2 [(.gogoproto.customname) = "DevID"];</code>
     */
    public Builder clearDevId() {
      
      devId_ = getDefaultInstance().getDevId();
      onChanged();
      return this;
    }
    /**
     * <code>string dev_id = 2 [(.gogoproto.customname) = "DevID"];</code>
     */
    public Builder setDevIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      devId_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:handler.DeviceIdentifier)
  }

  // @@protoc_insertion_point(class_scope:handler.DeviceIdentifier)
  private static final org.thethingsnetwork.api.handler.DeviceIdentifier DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.thethingsnetwork.api.handler.DeviceIdentifier();
  }

  public static org.thethingsnetwork.api.handler.DeviceIdentifier getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeviceIdentifier>
      PARSER = new com.google.protobuf.AbstractParser<DeviceIdentifier>() {
    public DeviceIdentifier parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new DeviceIdentifier(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DeviceIdentifier> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeviceIdentifier> getParserForType() {
    return PARSER;
  }

  public org.thethingsnetwork.api.handler.DeviceIdentifier getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

