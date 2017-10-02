// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/TheThingsNetwork/api/handler/handler.proto

package org.thethingsnetwork.api.handler;

/**
 * Protobuf type {@code handler.DeviceList}
 */
public  final class DeviceList extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:handler.DeviceList)
    DeviceListOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeviceList.newBuilder() to construct.
  private DeviceList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeviceList() {
    devices_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DeviceList(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              devices_ = new java.util.ArrayList<org.thethingsnetwork.api.handler.Device>();
              mutable_bitField0_ |= 0x00000001;
            }
            devices_.add(
                input.readMessage(org.thethingsnetwork.api.handler.Device.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        devices_ = java.util.Collections.unmodifiableList(devices_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.thethingsnetwork.api.handler.HandlerProto.internal_static_handler_DeviceList_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.thethingsnetwork.api.handler.HandlerProto.internal_static_handler_DeviceList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.thethingsnetwork.api.handler.DeviceList.class, org.thethingsnetwork.api.handler.DeviceList.Builder.class);
  }

  public static final int DEVICES_FIELD_NUMBER = 1;
  private java.util.List<org.thethingsnetwork.api.handler.Device> devices_;
  /**
   * <code>repeated .handler.Device devices = 1;</code>
   */
  public java.util.List<org.thethingsnetwork.api.handler.Device> getDevicesList() {
    return devices_;
  }
  /**
   * <code>repeated .handler.Device devices = 1;</code>
   */
  public java.util.List<? extends org.thethingsnetwork.api.handler.DeviceOrBuilder> 
      getDevicesOrBuilderList() {
    return devices_;
  }
  /**
   * <code>repeated .handler.Device devices = 1;</code>
   */
  public int getDevicesCount() {
    return devices_.size();
  }
  /**
   * <code>repeated .handler.Device devices = 1;</code>
   */
  public org.thethingsnetwork.api.handler.Device getDevices(int index) {
    return devices_.get(index);
  }
  /**
   * <code>repeated .handler.Device devices = 1;</code>
   */
  public org.thethingsnetwork.api.handler.DeviceOrBuilder getDevicesOrBuilder(
      int index) {
    return devices_.get(index);
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
    for (int i = 0; i < devices_.size(); i++) {
      output.writeMessage(1, devices_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < devices_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, devices_.get(i));
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
    if (!(obj instanceof org.thethingsnetwork.api.handler.DeviceList)) {
      return super.equals(obj);
    }
    org.thethingsnetwork.api.handler.DeviceList other = (org.thethingsnetwork.api.handler.DeviceList) obj;

    boolean result = true;
    result = result && getDevicesList()
        .equals(other.getDevicesList());
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
    if (getDevicesCount() > 0) {
      hash = (37 * hash) + DEVICES_FIELD_NUMBER;
      hash = (53 * hash) + getDevicesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.thethingsnetwork.api.handler.DeviceList parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.thethingsnetwork.api.handler.DeviceList parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.thethingsnetwork.api.handler.DeviceList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.thethingsnetwork.api.handler.DeviceList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.thethingsnetwork.api.handler.DeviceList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.thethingsnetwork.api.handler.DeviceList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.thethingsnetwork.api.handler.DeviceList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.thethingsnetwork.api.handler.DeviceList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.thethingsnetwork.api.handler.DeviceList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.thethingsnetwork.api.handler.DeviceList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.thethingsnetwork.api.handler.DeviceList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.thethingsnetwork.api.handler.DeviceList parseFrom(
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
  public static Builder newBuilder(org.thethingsnetwork.api.handler.DeviceList prototype) {
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
   * Protobuf type {@code handler.DeviceList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:handler.DeviceList)
      org.thethingsnetwork.api.handler.DeviceListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.thethingsnetwork.api.handler.HandlerProto.internal_static_handler_DeviceList_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.thethingsnetwork.api.handler.HandlerProto.internal_static_handler_DeviceList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.thethingsnetwork.api.handler.DeviceList.class, org.thethingsnetwork.api.handler.DeviceList.Builder.class);
    }

    // Construct using org.thethingsnetwork.api.handler.DeviceList.newBuilder()
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
        getDevicesFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (devicesBuilder_ == null) {
        devices_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        devicesBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.thethingsnetwork.api.handler.HandlerProto.internal_static_handler_DeviceList_descriptor;
    }

    public org.thethingsnetwork.api.handler.DeviceList getDefaultInstanceForType() {
      return org.thethingsnetwork.api.handler.DeviceList.getDefaultInstance();
    }

    public org.thethingsnetwork.api.handler.DeviceList build() {
      org.thethingsnetwork.api.handler.DeviceList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.thethingsnetwork.api.handler.DeviceList buildPartial() {
      org.thethingsnetwork.api.handler.DeviceList result = new org.thethingsnetwork.api.handler.DeviceList(this);
      int from_bitField0_ = bitField0_;
      if (devicesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          devices_ = java.util.Collections.unmodifiableList(devices_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.devices_ = devices_;
      } else {
        result.devices_ = devicesBuilder_.build();
      }
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
      if (other instanceof org.thethingsnetwork.api.handler.DeviceList) {
        return mergeFrom((org.thethingsnetwork.api.handler.DeviceList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.thethingsnetwork.api.handler.DeviceList other) {
      if (other == org.thethingsnetwork.api.handler.DeviceList.getDefaultInstance()) return this;
      if (devicesBuilder_ == null) {
        if (!other.devices_.isEmpty()) {
          if (devices_.isEmpty()) {
            devices_ = other.devices_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDevicesIsMutable();
            devices_.addAll(other.devices_);
          }
          onChanged();
        }
      } else {
        if (!other.devices_.isEmpty()) {
          if (devicesBuilder_.isEmpty()) {
            devicesBuilder_.dispose();
            devicesBuilder_ = null;
            devices_ = other.devices_;
            bitField0_ = (bitField0_ & ~0x00000001);
            devicesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getDevicesFieldBuilder() : null;
          } else {
            devicesBuilder_.addAllMessages(other.devices_);
          }
        }
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
      org.thethingsnetwork.api.handler.DeviceList parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.thethingsnetwork.api.handler.DeviceList) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<org.thethingsnetwork.api.handler.Device> devices_ =
      java.util.Collections.emptyList();
    private void ensureDevicesIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        devices_ = new java.util.ArrayList<org.thethingsnetwork.api.handler.Device>(devices_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.thethingsnetwork.api.handler.Device, org.thethingsnetwork.api.handler.Device.Builder, org.thethingsnetwork.api.handler.DeviceOrBuilder> devicesBuilder_;

    /**
     * <code>repeated .handler.Device devices = 1;</code>
     */
    public java.util.List<org.thethingsnetwork.api.handler.Device> getDevicesList() {
      if (devicesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(devices_);
      } else {
        return devicesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .handler.Device devices = 1;</code>
     */
    public int getDevicesCount() {
      if (devicesBuilder_ == null) {
        return devices_.size();
      } else {
        return devicesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .handler.Device devices = 1;</code>
     */
    public org.thethingsnetwork.api.handler.Device getDevices(int index) {
      if (devicesBuilder_ == null) {
        return devices_.get(index);
      } else {
        return devicesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .handler.Device devices = 1;</code>
     */
    public Builder setDevices(
        int index, org.thethingsnetwork.api.handler.Device value) {
      if (devicesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDevicesIsMutable();
        devices_.set(index, value);
        onChanged();
      } else {
        devicesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .handler.Device devices = 1;</code>
     */
    public Builder setDevices(
        int index, org.thethingsnetwork.api.handler.Device.Builder builderForValue) {
      if (devicesBuilder_ == null) {
        ensureDevicesIsMutable();
        devices_.set(index, builderForValue.build());
        onChanged();
      } else {
        devicesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .handler.Device devices = 1;</code>
     */
    public Builder addDevices(org.thethingsnetwork.api.handler.Device value) {
      if (devicesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDevicesIsMutable();
        devices_.add(value);
        onChanged();
      } else {
        devicesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .handler.Device devices = 1;</code>
     */
    public Builder addDevices(
        int index, org.thethingsnetwork.api.handler.Device value) {
      if (devicesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDevicesIsMutable();
        devices_.add(index, value);
        onChanged();
      } else {
        devicesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .handler.Device devices = 1;</code>
     */
    public Builder addDevices(
        org.thethingsnetwork.api.handler.Device.Builder builderForValue) {
      if (devicesBuilder_ == null) {
        ensureDevicesIsMutable();
        devices_.add(builderForValue.build());
        onChanged();
      } else {
        devicesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .handler.Device devices = 1;</code>
     */
    public Builder addDevices(
        int index, org.thethingsnetwork.api.handler.Device.Builder builderForValue) {
      if (devicesBuilder_ == null) {
        ensureDevicesIsMutable();
        devices_.add(index, builderForValue.build());
        onChanged();
      } else {
        devicesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .handler.Device devices = 1;</code>
     */
    public Builder addAllDevices(
        java.lang.Iterable<? extends org.thethingsnetwork.api.handler.Device> values) {
      if (devicesBuilder_ == null) {
        ensureDevicesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, devices_);
        onChanged();
      } else {
        devicesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .handler.Device devices = 1;</code>
     */
    public Builder clearDevices() {
      if (devicesBuilder_ == null) {
        devices_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        devicesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .handler.Device devices = 1;</code>
     */
    public Builder removeDevices(int index) {
      if (devicesBuilder_ == null) {
        ensureDevicesIsMutable();
        devices_.remove(index);
        onChanged();
      } else {
        devicesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .handler.Device devices = 1;</code>
     */
    public org.thethingsnetwork.api.handler.Device.Builder getDevicesBuilder(
        int index) {
      return getDevicesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .handler.Device devices = 1;</code>
     */
    public org.thethingsnetwork.api.handler.DeviceOrBuilder getDevicesOrBuilder(
        int index) {
      if (devicesBuilder_ == null) {
        return devices_.get(index);  } else {
        return devicesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .handler.Device devices = 1;</code>
     */
    public java.util.List<? extends org.thethingsnetwork.api.handler.DeviceOrBuilder> 
         getDevicesOrBuilderList() {
      if (devicesBuilder_ != null) {
        return devicesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(devices_);
      }
    }
    /**
     * <code>repeated .handler.Device devices = 1;</code>
     */
    public org.thethingsnetwork.api.handler.Device.Builder addDevicesBuilder() {
      return getDevicesFieldBuilder().addBuilder(
          org.thethingsnetwork.api.handler.Device.getDefaultInstance());
    }
    /**
     * <code>repeated .handler.Device devices = 1;</code>
     */
    public org.thethingsnetwork.api.handler.Device.Builder addDevicesBuilder(
        int index) {
      return getDevicesFieldBuilder().addBuilder(
          index, org.thethingsnetwork.api.handler.Device.getDefaultInstance());
    }
    /**
     * <code>repeated .handler.Device devices = 1;</code>
     */
    public java.util.List<org.thethingsnetwork.api.handler.Device.Builder> 
         getDevicesBuilderList() {
      return getDevicesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.thethingsnetwork.api.handler.Device, org.thethingsnetwork.api.handler.Device.Builder, org.thethingsnetwork.api.handler.DeviceOrBuilder> 
        getDevicesFieldBuilder() {
      if (devicesBuilder_ == null) {
        devicesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.thethingsnetwork.api.handler.Device, org.thethingsnetwork.api.handler.Device.Builder, org.thethingsnetwork.api.handler.DeviceOrBuilder>(
                devices_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        devices_ = null;
      }
      return devicesBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:handler.DeviceList)
  }

  // @@protoc_insertion_point(class_scope:handler.DeviceList)
  private static final org.thethingsnetwork.api.handler.DeviceList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.thethingsnetwork.api.handler.DeviceList();
  }

  public static org.thethingsnetwork.api.handler.DeviceList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeviceList>
      PARSER = new com.google.protobuf.AbstractParser<DeviceList>() {
    public DeviceList parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new DeviceList(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DeviceList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeviceList> getParserForType() {
    return PARSER;
  }

  public org.thethingsnetwork.api.handler.DeviceList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

