// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/TheThingsNetwork/api/broker/broker.proto

package org.thethingsnetwork.api.broker;

/**
 * <pre>
 * sent to the Router, used as Template
 * </pre>
 *
 * Protobuf type {@code broker.DeviceActivationResponse}
 */
public  final class DeviceActivationResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:broker.DeviceActivationResponse)
    DeviceActivationResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeviceActivationResponse.newBuilder() to construct.
  private DeviceActivationResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeviceActivationResponse() {
    payload_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DeviceActivationResponse(
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

            payload_ = input.readBytes();
            break;
          }
          case 18: {
            org.thethingsnetwork.api.protocol.Message.Builder subBuilder = null;
            if (message_ != null) {
              subBuilder = message_.toBuilder();
            }
            message_ = input.readMessage(org.thethingsnetwork.api.protocol.Message.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(message_);
              message_ = subBuilder.buildPartial();
            }

            break;
          }
          case 90: {
            org.thethingsnetwork.api.broker.DownlinkOption.Builder subBuilder = null;
            if (downlinkOption_ != null) {
              subBuilder = downlinkOption_.toBuilder();
            }
            downlinkOption_ = input.readMessage(org.thethingsnetwork.api.broker.DownlinkOption.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(downlinkOption_);
              downlinkOption_ = subBuilder.buildPartial();
            }

            break;
          }
          case 170: {
            org.thethingsnetwork.api.trace.Trace.Builder subBuilder = null;
            if (trace_ != null) {
              subBuilder = trace_.toBuilder();
            }
            trace_ = input.readMessage(org.thethingsnetwork.api.trace.Trace.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(trace_);
              trace_ = subBuilder.buildPartial();
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
    return org.thethingsnetwork.api.broker.BrokerProto.internal_static_broker_DeviceActivationResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.thethingsnetwork.api.broker.BrokerProto.internal_static_broker_DeviceActivationResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.thethingsnetwork.api.broker.DeviceActivationResponse.class, org.thethingsnetwork.api.broker.DeviceActivationResponse.Builder.class);
  }

  public static final int PAYLOAD_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString payload_;
  /**
   * <code>bytes payload = 1;</code>
   */
  public com.google.protobuf.ByteString getPayload() {
    return payload_;
  }

  public static final int MESSAGE_FIELD_NUMBER = 2;
  private org.thethingsnetwork.api.protocol.Message message_;
  /**
   * <code>.protocol.Message message = 2;</code>
   */
  public boolean hasMessage() {
    return message_ != null;
  }
  /**
   * <code>.protocol.Message message = 2;</code>
   */
  public org.thethingsnetwork.api.protocol.Message getMessage() {
    return message_ == null ? org.thethingsnetwork.api.protocol.Message.getDefaultInstance() : message_;
  }
  /**
   * <code>.protocol.Message message = 2;</code>
   */
  public org.thethingsnetwork.api.protocol.MessageOrBuilder getMessageOrBuilder() {
    return getMessage();
  }

  public static final int DOWNLINK_OPTION_FIELD_NUMBER = 11;
  private org.thethingsnetwork.api.broker.DownlinkOption downlinkOption_;
  /**
   * <code>.broker.DownlinkOption downlink_option = 11;</code>
   */
  public boolean hasDownlinkOption() {
    return downlinkOption_ != null;
  }
  /**
   * <code>.broker.DownlinkOption downlink_option = 11;</code>
   */
  public org.thethingsnetwork.api.broker.DownlinkOption getDownlinkOption() {
    return downlinkOption_ == null ? org.thethingsnetwork.api.broker.DownlinkOption.getDefaultInstance() : downlinkOption_;
  }
  /**
   * <code>.broker.DownlinkOption downlink_option = 11;</code>
   */
  public org.thethingsnetwork.api.broker.DownlinkOptionOrBuilder getDownlinkOptionOrBuilder() {
    return getDownlinkOption();
  }

  public static final int TRACE_FIELD_NUMBER = 21;
  private org.thethingsnetwork.api.trace.Trace trace_;
  /**
   * <code>.trace.Trace trace = 21;</code>
   */
  public boolean hasTrace() {
    return trace_ != null;
  }
  /**
   * <code>.trace.Trace trace = 21;</code>
   */
  public org.thethingsnetwork.api.trace.Trace getTrace() {
    return trace_ == null ? org.thethingsnetwork.api.trace.Trace.getDefaultInstance() : trace_;
  }
  /**
   * <code>.trace.Trace trace = 21;</code>
   */
  public org.thethingsnetwork.api.trace.TraceOrBuilder getTraceOrBuilder() {
    return getTrace();
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
    if (!payload_.isEmpty()) {
      output.writeBytes(1, payload_);
    }
    if (message_ != null) {
      output.writeMessage(2, getMessage());
    }
    if (downlinkOption_ != null) {
      output.writeMessage(11, getDownlinkOption());
    }
    if (trace_ != null) {
      output.writeMessage(21, getTrace());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!payload_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, payload_);
    }
    if (message_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getMessage());
    }
    if (downlinkOption_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(11, getDownlinkOption());
    }
    if (trace_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(21, getTrace());
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
    if (!(obj instanceof org.thethingsnetwork.api.broker.DeviceActivationResponse)) {
      return super.equals(obj);
    }
    org.thethingsnetwork.api.broker.DeviceActivationResponse other = (org.thethingsnetwork.api.broker.DeviceActivationResponse) obj;

    boolean result = true;
    result = result && getPayload()
        .equals(other.getPayload());
    result = result && (hasMessage() == other.hasMessage());
    if (hasMessage()) {
      result = result && getMessage()
          .equals(other.getMessage());
    }
    result = result && (hasDownlinkOption() == other.hasDownlinkOption());
    if (hasDownlinkOption()) {
      result = result && getDownlinkOption()
          .equals(other.getDownlinkOption());
    }
    result = result && (hasTrace() == other.hasTrace());
    if (hasTrace()) {
      result = result && getTrace()
          .equals(other.getTrace());
    }
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
    hash = (37 * hash) + PAYLOAD_FIELD_NUMBER;
    hash = (53 * hash) + getPayload().hashCode();
    if (hasMessage()) {
      hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
      hash = (53 * hash) + getMessage().hashCode();
    }
    if (hasDownlinkOption()) {
      hash = (37 * hash) + DOWNLINK_OPTION_FIELD_NUMBER;
      hash = (53 * hash) + getDownlinkOption().hashCode();
    }
    if (hasTrace()) {
      hash = (37 * hash) + TRACE_FIELD_NUMBER;
      hash = (53 * hash) + getTrace().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.thethingsnetwork.api.broker.DeviceActivationResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.thethingsnetwork.api.broker.DeviceActivationResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.thethingsnetwork.api.broker.DeviceActivationResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.thethingsnetwork.api.broker.DeviceActivationResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.thethingsnetwork.api.broker.DeviceActivationResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.thethingsnetwork.api.broker.DeviceActivationResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.thethingsnetwork.api.broker.DeviceActivationResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.thethingsnetwork.api.broker.DeviceActivationResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.thethingsnetwork.api.broker.DeviceActivationResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.thethingsnetwork.api.broker.DeviceActivationResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.thethingsnetwork.api.broker.DeviceActivationResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.thethingsnetwork.api.broker.DeviceActivationResponse parseFrom(
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
  public static Builder newBuilder(org.thethingsnetwork.api.broker.DeviceActivationResponse prototype) {
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
   * <pre>
   * sent to the Router, used as Template
   * </pre>
   *
   * Protobuf type {@code broker.DeviceActivationResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:broker.DeviceActivationResponse)
      org.thethingsnetwork.api.broker.DeviceActivationResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.thethingsnetwork.api.broker.BrokerProto.internal_static_broker_DeviceActivationResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.thethingsnetwork.api.broker.BrokerProto.internal_static_broker_DeviceActivationResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.thethingsnetwork.api.broker.DeviceActivationResponse.class, org.thethingsnetwork.api.broker.DeviceActivationResponse.Builder.class);
    }

    // Construct using org.thethingsnetwork.api.broker.DeviceActivationResponse.newBuilder()
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
      payload_ = com.google.protobuf.ByteString.EMPTY;

      if (messageBuilder_ == null) {
        message_ = null;
      } else {
        message_ = null;
        messageBuilder_ = null;
      }
      if (downlinkOptionBuilder_ == null) {
        downlinkOption_ = null;
      } else {
        downlinkOption_ = null;
        downlinkOptionBuilder_ = null;
      }
      if (traceBuilder_ == null) {
        trace_ = null;
      } else {
        trace_ = null;
        traceBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.thethingsnetwork.api.broker.BrokerProto.internal_static_broker_DeviceActivationResponse_descriptor;
    }

    public org.thethingsnetwork.api.broker.DeviceActivationResponse getDefaultInstanceForType() {
      return org.thethingsnetwork.api.broker.DeviceActivationResponse.getDefaultInstance();
    }

    public org.thethingsnetwork.api.broker.DeviceActivationResponse build() {
      org.thethingsnetwork.api.broker.DeviceActivationResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.thethingsnetwork.api.broker.DeviceActivationResponse buildPartial() {
      org.thethingsnetwork.api.broker.DeviceActivationResponse result = new org.thethingsnetwork.api.broker.DeviceActivationResponse(this);
      result.payload_ = payload_;
      if (messageBuilder_ == null) {
        result.message_ = message_;
      } else {
        result.message_ = messageBuilder_.build();
      }
      if (downlinkOptionBuilder_ == null) {
        result.downlinkOption_ = downlinkOption_;
      } else {
        result.downlinkOption_ = downlinkOptionBuilder_.build();
      }
      if (traceBuilder_ == null) {
        result.trace_ = trace_;
      } else {
        result.trace_ = traceBuilder_.build();
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
      if (other instanceof org.thethingsnetwork.api.broker.DeviceActivationResponse) {
        return mergeFrom((org.thethingsnetwork.api.broker.DeviceActivationResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.thethingsnetwork.api.broker.DeviceActivationResponse other) {
      if (other == org.thethingsnetwork.api.broker.DeviceActivationResponse.getDefaultInstance()) return this;
      if (other.getPayload() != com.google.protobuf.ByteString.EMPTY) {
        setPayload(other.getPayload());
      }
      if (other.hasMessage()) {
        mergeMessage(other.getMessage());
      }
      if (other.hasDownlinkOption()) {
        mergeDownlinkOption(other.getDownlinkOption());
      }
      if (other.hasTrace()) {
        mergeTrace(other.getTrace());
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
      org.thethingsnetwork.api.broker.DeviceActivationResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.thethingsnetwork.api.broker.DeviceActivationResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.ByteString payload_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes payload = 1;</code>
     */
    public com.google.protobuf.ByteString getPayload() {
      return payload_;
    }
    /**
     * <code>bytes payload = 1;</code>
     */
    public Builder setPayload(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      payload_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes payload = 1;</code>
     */
    public Builder clearPayload() {
      
      payload_ = getDefaultInstance().getPayload();
      onChanged();
      return this;
    }

    private org.thethingsnetwork.api.protocol.Message message_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.thethingsnetwork.api.protocol.Message, org.thethingsnetwork.api.protocol.Message.Builder, org.thethingsnetwork.api.protocol.MessageOrBuilder> messageBuilder_;
    /**
     * <code>.protocol.Message message = 2;</code>
     */
    public boolean hasMessage() {
      return messageBuilder_ != null || message_ != null;
    }
    /**
     * <code>.protocol.Message message = 2;</code>
     */
    public org.thethingsnetwork.api.protocol.Message getMessage() {
      if (messageBuilder_ == null) {
        return message_ == null ? org.thethingsnetwork.api.protocol.Message.getDefaultInstance() : message_;
      } else {
        return messageBuilder_.getMessage();
      }
    }
    /**
     * <code>.protocol.Message message = 2;</code>
     */
    public Builder setMessage(org.thethingsnetwork.api.protocol.Message value) {
      if (messageBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        message_ = value;
        onChanged();
      } else {
        messageBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.protocol.Message message = 2;</code>
     */
    public Builder setMessage(
        org.thethingsnetwork.api.protocol.Message.Builder builderForValue) {
      if (messageBuilder_ == null) {
        message_ = builderForValue.build();
        onChanged();
      } else {
        messageBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.protocol.Message message = 2;</code>
     */
    public Builder mergeMessage(org.thethingsnetwork.api.protocol.Message value) {
      if (messageBuilder_ == null) {
        if (message_ != null) {
          message_ =
            org.thethingsnetwork.api.protocol.Message.newBuilder(message_).mergeFrom(value).buildPartial();
        } else {
          message_ = value;
        }
        onChanged();
      } else {
        messageBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.protocol.Message message = 2;</code>
     */
    public Builder clearMessage() {
      if (messageBuilder_ == null) {
        message_ = null;
        onChanged();
      } else {
        message_ = null;
        messageBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.protocol.Message message = 2;</code>
     */
    public org.thethingsnetwork.api.protocol.Message.Builder getMessageBuilder() {
      
      onChanged();
      return getMessageFieldBuilder().getBuilder();
    }
    /**
     * <code>.protocol.Message message = 2;</code>
     */
    public org.thethingsnetwork.api.protocol.MessageOrBuilder getMessageOrBuilder() {
      if (messageBuilder_ != null) {
        return messageBuilder_.getMessageOrBuilder();
      } else {
        return message_ == null ?
            org.thethingsnetwork.api.protocol.Message.getDefaultInstance() : message_;
      }
    }
    /**
     * <code>.protocol.Message message = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.thethingsnetwork.api.protocol.Message, org.thethingsnetwork.api.protocol.Message.Builder, org.thethingsnetwork.api.protocol.MessageOrBuilder> 
        getMessageFieldBuilder() {
      if (messageBuilder_ == null) {
        messageBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.thethingsnetwork.api.protocol.Message, org.thethingsnetwork.api.protocol.Message.Builder, org.thethingsnetwork.api.protocol.MessageOrBuilder>(
                getMessage(),
                getParentForChildren(),
                isClean());
        message_ = null;
      }
      return messageBuilder_;
    }

    private org.thethingsnetwork.api.broker.DownlinkOption downlinkOption_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.thethingsnetwork.api.broker.DownlinkOption, org.thethingsnetwork.api.broker.DownlinkOption.Builder, org.thethingsnetwork.api.broker.DownlinkOptionOrBuilder> downlinkOptionBuilder_;
    /**
     * <code>.broker.DownlinkOption downlink_option = 11;</code>
     */
    public boolean hasDownlinkOption() {
      return downlinkOptionBuilder_ != null || downlinkOption_ != null;
    }
    /**
     * <code>.broker.DownlinkOption downlink_option = 11;</code>
     */
    public org.thethingsnetwork.api.broker.DownlinkOption getDownlinkOption() {
      if (downlinkOptionBuilder_ == null) {
        return downlinkOption_ == null ? org.thethingsnetwork.api.broker.DownlinkOption.getDefaultInstance() : downlinkOption_;
      } else {
        return downlinkOptionBuilder_.getMessage();
      }
    }
    /**
     * <code>.broker.DownlinkOption downlink_option = 11;</code>
     */
    public Builder setDownlinkOption(org.thethingsnetwork.api.broker.DownlinkOption value) {
      if (downlinkOptionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        downlinkOption_ = value;
        onChanged();
      } else {
        downlinkOptionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.broker.DownlinkOption downlink_option = 11;</code>
     */
    public Builder setDownlinkOption(
        org.thethingsnetwork.api.broker.DownlinkOption.Builder builderForValue) {
      if (downlinkOptionBuilder_ == null) {
        downlinkOption_ = builderForValue.build();
        onChanged();
      } else {
        downlinkOptionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.broker.DownlinkOption downlink_option = 11;</code>
     */
    public Builder mergeDownlinkOption(org.thethingsnetwork.api.broker.DownlinkOption value) {
      if (downlinkOptionBuilder_ == null) {
        if (downlinkOption_ != null) {
          downlinkOption_ =
            org.thethingsnetwork.api.broker.DownlinkOption.newBuilder(downlinkOption_).mergeFrom(value).buildPartial();
        } else {
          downlinkOption_ = value;
        }
        onChanged();
      } else {
        downlinkOptionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.broker.DownlinkOption downlink_option = 11;</code>
     */
    public Builder clearDownlinkOption() {
      if (downlinkOptionBuilder_ == null) {
        downlinkOption_ = null;
        onChanged();
      } else {
        downlinkOption_ = null;
        downlinkOptionBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.broker.DownlinkOption downlink_option = 11;</code>
     */
    public org.thethingsnetwork.api.broker.DownlinkOption.Builder getDownlinkOptionBuilder() {
      
      onChanged();
      return getDownlinkOptionFieldBuilder().getBuilder();
    }
    /**
     * <code>.broker.DownlinkOption downlink_option = 11;</code>
     */
    public org.thethingsnetwork.api.broker.DownlinkOptionOrBuilder getDownlinkOptionOrBuilder() {
      if (downlinkOptionBuilder_ != null) {
        return downlinkOptionBuilder_.getMessageOrBuilder();
      } else {
        return downlinkOption_ == null ?
            org.thethingsnetwork.api.broker.DownlinkOption.getDefaultInstance() : downlinkOption_;
      }
    }
    /**
     * <code>.broker.DownlinkOption downlink_option = 11;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.thethingsnetwork.api.broker.DownlinkOption, org.thethingsnetwork.api.broker.DownlinkOption.Builder, org.thethingsnetwork.api.broker.DownlinkOptionOrBuilder> 
        getDownlinkOptionFieldBuilder() {
      if (downlinkOptionBuilder_ == null) {
        downlinkOptionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.thethingsnetwork.api.broker.DownlinkOption, org.thethingsnetwork.api.broker.DownlinkOption.Builder, org.thethingsnetwork.api.broker.DownlinkOptionOrBuilder>(
                getDownlinkOption(),
                getParentForChildren(),
                isClean());
        downlinkOption_ = null;
      }
      return downlinkOptionBuilder_;
    }

    private org.thethingsnetwork.api.trace.Trace trace_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.thethingsnetwork.api.trace.Trace, org.thethingsnetwork.api.trace.Trace.Builder, org.thethingsnetwork.api.trace.TraceOrBuilder> traceBuilder_;
    /**
     * <code>.trace.Trace trace = 21;</code>
     */
    public boolean hasTrace() {
      return traceBuilder_ != null || trace_ != null;
    }
    /**
     * <code>.trace.Trace trace = 21;</code>
     */
    public org.thethingsnetwork.api.trace.Trace getTrace() {
      if (traceBuilder_ == null) {
        return trace_ == null ? org.thethingsnetwork.api.trace.Trace.getDefaultInstance() : trace_;
      } else {
        return traceBuilder_.getMessage();
      }
    }
    /**
     * <code>.trace.Trace trace = 21;</code>
     */
    public Builder setTrace(org.thethingsnetwork.api.trace.Trace value) {
      if (traceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        trace_ = value;
        onChanged();
      } else {
        traceBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.trace.Trace trace = 21;</code>
     */
    public Builder setTrace(
        org.thethingsnetwork.api.trace.Trace.Builder builderForValue) {
      if (traceBuilder_ == null) {
        trace_ = builderForValue.build();
        onChanged();
      } else {
        traceBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.trace.Trace trace = 21;</code>
     */
    public Builder mergeTrace(org.thethingsnetwork.api.trace.Trace value) {
      if (traceBuilder_ == null) {
        if (trace_ != null) {
          trace_ =
            org.thethingsnetwork.api.trace.Trace.newBuilder(trace_).mergeFrom(value).buildPartial();
        } else {
          trace_ = value;
        }
        onChanged();
      } else {
        traceBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.trace.Trace trace = 21;</code>
     */
    public Builder clearTrace() {
      if (traceBuilder_ == null) {
        trace_ = null;
        onChanged();
      } else {
        trace_ = null;
        traceBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.trace.Trace trace = 21;</code>
     */
    public org.thethingsnetwork.api.trace.Trace.Builder getTraceBuilder() {
      
      onChanged();
      return getTraceFieldBuilder().getBuilder();
    }
    /**
     * <code>.trace.Trace trace = 21;</code>
     */
    public org.thethingsnetwork.api.trace.TraceOrBuilder getTraceOrBuilder() {
      if (traceBuilder_ != null) {
        return traceBuilder_.getMessageOrBuilder();
      } else {
        return trace_ == null ?
            org.thethingsnetwork.api.trace.Trace.getDefaultInstance() : trace_;
      }
    }
    /**
     * <code>.trace.Trace trace = 21;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.thethingsnetwork.api.trace.Trace, org.thethingsnetwork.api.trace.Trace.Builder, org.thethingsnetwork.api.trace.TraceOrBuilder> 
        getTraceFieldBuilder() {
      if (traceBuilder_ == null) {
        traceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.thethingsnetwork.api.trace.Trace, org.thethingsnetwork.api.trace.Trace.Builder, org.thethingsnetwork.api.trace.TraceOrBuilder>(
                getTrace(),
                getParentForChildren(),
                isClean());
        trace_ = null;
      }
      return traceBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:broker.DeviceActivationResponse)
  }

  // @@protoc_insertion_point(class_scope:broker.DeviceActivationResponse)
  private static final org.thethingsnetwork.api.broker.DeviceActivationResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.thethingsnetwork.api.broker.DeviceActivationResponse();
  }

  public static org.thethingsnetwork.api.broker.DeviceActivationResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeviceActivationResponse>
      PARSER = new com.google.protobuf.AbstractParser<DeviceActivationResponse>() {
    public DeviceActivationResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new DeviceActivationResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DeviceActivationResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeviceActivationResponse> getParserForType() {
    return PARSER;
  }

  public org.thethingsnetwork.api.broker.DeviceActivationResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

