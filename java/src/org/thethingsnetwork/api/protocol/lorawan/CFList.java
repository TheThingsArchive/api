// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/TheThingsNetwork/api/protocol/lorawan/lorawan.proto

package org.thethingsnetwork.api.protocol.lorawan;

/**
 * Protobuf type {@code lorawan.CFList}
 */
public  final class CFList extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:lorawan.CFList)
    CFListOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CFList.newBuilder() to construct.
  private CFList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CFList() {
    freq_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CFList(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 8: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              freq_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000001;
            }
            freq_.add(input.readUInt32());
            break;
          }
          case 10: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001) && input.getBytesUntilLimit() > 0) {
              freq_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              freq_.add(input.readUInt32());
            }
            input.popLimit(limit);
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        freq_ = java.util.Collections.unmodifiableList(freq_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.thethingsnetwork.api.protocol.lorawan.LoRaWANProtocolProto.internal_static_lorawan_CFList_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.thethingsnetwork.api.protocol.lorawan.LoRaWANProtocolProto.internal_static_lorawan_CFList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.thethingsnetwork.api.protocol.lorawan.CFList.class, org.thethingsnetwork.api.protocol.lorawan.CFList.Builder.class);
  }

  public static final int FREQ_FIELD_NUMBER = 1;
  private java.util.List<java.lang.Integer> freq_;
  /**
   * <code>repeated uint32 freq = 1;</code>
   */
  public java.util.List<java.lang.Integer>
      getFreqList() {
    return freq_;
  }
  /**
   * <code>repeated uint32 freq = 1;</code>
   */
  public int getFreqCount() {
    return freq_.size();
  }
  /**
   * <code>repeated uint32 freq = 1;</code>
   */
  public int getFreq(int index) {
    return freq_.get(index);
  }
  private int freqMemoizedSerializedSize = -1;

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
    getSerializedSize();
    if (getFreqList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(freqMemoizedSerializedSize);
    }
    for (int i = 0; i < freq_.size(); i++) {
      output.writeUInt32NoTag(freq_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < freq_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(freq_.get(i));
      }
      size += dataSize;
      if (!getFreqList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      freqMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof org.thethingsnetwork.api.protocol.lorawan.CFList)) {
      return super.equals(obj);
    }
    org.thethingsnetwork.api.protocol.lorawan.CFList other = (org.thethingsnetwork.api.protocol.lorawan.CFList) obj;

    boolean result = true;
    result = result && getFreqList()
        .equals(other.getFreqList());
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
    if (getFreqCount() > 0) {
      hash = (37 * hash) + FREQ_FIELD_NUMBER;
      hash = (53 * hash) + getFreqList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.thethingsnetwork.api.protocol.lorawan.CFList parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.thethingsnetwork.api.protocol.lorawan.CFList parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.thethingsnetwork.api.protocol.lorawan.CFList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.thethingsnetwork.api.protocol.lorawan.CFList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.thethingsnetwork.api.protocol.lorawan.CFList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.thethingsnetwork.api.protocol.lorawan.CFList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.thethingsnetwork.api.protocol.lorawan.CFList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.thethingsnetwork.api.protocol.lorawan.CFList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.thethingsnetwork.api.protocol.lorawan.CFList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.thethingsnetwork.api.protocol.lorawan.CFList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.thethingsnetwork.api.protocol.lorawan.CFList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.thethingsnetwork.api.protocol.lorawan.CFList parseFrom(
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
  public static Builder newBuilder(org.thethingsnetwork.api.protocol.lorawan.CFList prototype) {
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
   * Protobuf type {@code lorawan.CFList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:lorawan.CFList)
      org.thethingsnetwork.api.protocol.lorawan.CFListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.thethingsnetwork.api.protocol.lorawan.LoRaWANProtocolProto.internal_static_lorawan_CFList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.thethingsnetwork.api.protocol.lorawan.LoRaWANProtocolProto.internal_static_lorawan_CFList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.thethingsnetwork.api.protocol.lorawan.CFList.class, org.thethingsnetwork.api.protocol.lorawan.CFList.Builder.class);
    }

    // Construct using org.thethingsnetwork.api.protocol.lorawan.CFList.newBuilder()
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
      freq_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.thethingsnetwork.api.protocol.lorawan.LoRaWANProtocolProto.internal_static_lorawan_CFList_descriptor;
    }

    @java.lang.Override
    public org.thethingsnetwork.api.protocol.lorawan.CFList getDefaultInstanceForType() {
      return org.thethingsnetwork.api.protocol.lorawan.CFList.getDefaultInstance();
    }

    @java.lang.Override
    public org.thethingsnetwork.api.protocol.lorawan.CFList build() {
      org.thethingsnetwork.api.protocol.lorawan.CFList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.thethingsnetwork.api.protocol.lorawan.CFList buildPartial() {
      org.thethingsnetwork.api.protocol.lorawan.CFList result = new org.thethingsnetwork.api.protocol.lorawan.CFList(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        freq_ = java.util.Collections.unmodifiableList(freq_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.freq_ = freq_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.thethingsnetwork.api.protocol.lorawan.CFList) {
        return mergeFrom((org.thethingsnetwork.api.protocol.lorawan.CFList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.thethingsnetwork.api.protocol.lorawan.CFList other) {
      if (other == org.thethingsnetwork.api.protocol.lorawan.CFList.getDefaultInstance()) return this;
      if (!other.freq_.isEmpty()) {
        if (freq_.isEmpty()) {
          freq_ = other.freq_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureFreqIsMutable();
          freq_.addAll(other.freq_);
        }
        onChanged();
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
      org.thethingsnetwork.api.protocol.lorawan.CFList parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.thethingsnetwork.api.protocol.lorawan.CFList) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<java.lang.Integer> freq_ = java.util.Collections.emptyList();
    private void ensureFreqIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        freq_ = new java.util.ArrayList<java.lang.Integer>(freq_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated uint32 freq = 1;</code>
     */
    public java.util.List<java.lang.Integer>
        getFreqList() {
      return java.util.Collections.unmodifiableList(freq_);
    }
    /**
     * <code>repeated uint32 freq = 1;</code>
     */
    public int getFreqCount() {
      return freq_.size();
    }
    /**
     * <code>repeated uint32 freq = 1;</code>
     */
    public int getFreq(int index) {
      return freq_.get(index);
    }
    /**
     * <code>repeated uint32 freq = 1;</code>
     */
    public Builder setFreq(
        int index, int value) {
      ensureFreqIsMutable();
      freq_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint32 freq = 1;</code>
     */
    public Builder addFreq(int value) {
      ensureFreqIsMutable();
      freq_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint32 freq = 1;</code>
     */
    public Builder addAllFreq(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureFreqIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, freq_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint32 freq = 1;</code>
     */
    public Builder clearFreq() {
      freq_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:lorawan.CFList)
  }

  // @@protoc_insertion_point(class_scope:lorawan.CFList)
  private static final org.thethingsnetwork.api.protocol.lorawan.CFList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.thethingsnetwork.api.protocol.lorawan.CFList();
  }

  public static org.thethingsnetwork.api.protocol.lorawan.CFList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CFList>
      PARSER = new com.google.protobuf.AbstractParser<CFList>() {
    @java.lang.Override
    public CFList parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CFList(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CFList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CFList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.thethingsnetwork.api.protocol.lorawan.CFList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

