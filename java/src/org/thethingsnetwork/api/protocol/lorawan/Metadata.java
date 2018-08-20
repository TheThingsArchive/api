// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/TheThingsNetwork/api/protocol/lorawan/lorawan.proto

package org.thethingsnetwork.api.protocol.lorawan;

/**
 * Protobuf type {@code lorawan.Metadata}
 */
public  final class Metadata extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:lorawan.Metadata)
    MetadataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Metadata.newBuilder() to construct.
  private Metadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Metadata() {
    modulation_ = 0;
    dataRate_ = "";
    bitRate_ = 0;
    codingRate_ = "";
    fCnt_ = 0;
    frequencyPlan_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Metadata(
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
          case 88: {
            int rawValue = input.readEnum();

            modulation_ = rawValue;
            break;
          }
          case 98: {
            java.lang.String s = input.readStringRequireUtf8();

            dataRate_ = s;
            break;
          }
          case 104: {

            bitRate_ = input.readUInt32();
            break;
          }
          case 114: {
            java.lang.String s = input.readStringRequireUtf8();

            codingRate_ = s;
            break;
          }
          case 120: {

            fCnt_ = input.readUInt32();
            break;
          }
          case 128: {
            int rawValue = input.readEnum();

            frequencyPlan_ = rawValue;
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.thethingsnetwork.api.protocol.lorawan.LoRaWANProto.internal_static_lorawan_Metadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.thethingsnetwork.api.protocol.lorawan.LoRaWANProto.internal_static_lorawan_Metadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.thethingsnetwork.api.protocol.lorawan.Metadata.class, org.thethingsnetwork.api.protocol.lorawan.Metadata.Builder.class);
  }

  public static final int MODULATION_FIELD_NUMBER = 11;
  private int modulation_;
  /**
   * <code>.lorawan.Modulation modulation = 11;</code>
   */
  public int getModulationValue() {
    return modulation_;
  }
  /**
   * <code>.lorawan.Modulation modulation = 11;</code>
   */
  public org.thethingsnetwork.api.protocol.lorawan.Modulation getModulation() {
    @SuppressWarnings("deprecation")
    org.thethingsnetwork.api.protocol.lorawan.Modulation result = org.thethingsnetwork.api.protocol.lorawan.Modulation.valueOf(modulation_);
    return result == null ? org.thethingsnetwork.api.protocol.lorawan.Modulation.UNRECOGNIZED : result;
  }

  public static final int DATA_RATE_FIELD_NUMBER = 12;
  private volatile java.lang.Object dataRate_;
  /**
   * <pre>
   * LoRa data rate - SF{spreadingfactor}BW{bandwidth}
   * </pre>
   *
   * <code>string data_rate = 12;</code>
   */
  public java.lang.String getDataRate() {
    java.lang.Object ref = dataRate_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dataRate_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * LoRa data rate - SF{spreadingfactor}BW{bandwidth}
   * </pre>
   *
   * <code>string data_rate = 12;</code>
   */
  public com.google.protobuf.ByteString
      getDataRateBytes() {
    java.lang.Object ref = dataRate_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dataRate_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BIT_RATE_FIELD_NUMBER = 13;
  private int bitRate_;
  /**
   * <pre>
   * FSK bit rate in bit/s
   * </pre>
   *
   * <code>uint32 bit_rate = 13;</code>
   */
  public int getBitRate() {
    return bitRate_;
  }

  public static final int CODING_RATE_FIELD_NUMBER = 14;
  private volatile java.lang.Object codingRate_;
  /**
   * <pre>
   * LoRa coding rate
   * </pre>
   *
   * <code>string coding_rate = 14;</code>
   */
  public java.lang.String getCodingRate() {
    java.lang.Object ref = codingRate_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      codingRate_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * LoRa coding rate
   * </pre>
   *
   * <code>string coding_rate = 14;</code>
   */
  public com.google.protobuf.ByteString
      getCodingRateBytes() {
    java.lang.Object ref = codingRate_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      codingRate_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int F_CNT_FIELD_NUMBER = 15;
  private int fCnt_;
  /**
   * <pre>
   * Store the full 32 bit FCnt (deprecated; do not use)
   * </pre>
   *
   * <code>uint32 f_cnt = 15;</code>
   */
  public int getFCnt() {
    return fCnt_;
  }

  public static final int FREQUENCY_PLAN_FIELD_NUMBER = 16;
  private int frequencyPlan_;
  /**
   * <code>.lorawan.FrequencyPlan frequency_plan = 16;</code>
   */
  public int getFrequencyPlanValue() {
    return frequencyPlan_;
  }
  /**
   * <code>.lorawan.FrequencyPlan frequency_plan = 16;</code>
   */
  public org.thethingsnetwork.api.protocol.lorawan.FrequencyPlan getFrequencyPlan() {
    @SuppressWarnings("deprecation")
    org.thethingsnetwork.api.protocol.lorawan.FrequencyPlan result = org.thethingsnetwork.api.protocol.lorawan.FrequencyPlan.valueOf(frequencyPlan_);
    return result == null ? org.thethingsnetwork.api.protocol.lorawan.FrequencyPlan.UNRECOGNIZED : result;
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
    if (modulation_ != org.thethingsnetwork.api.protocol.lorawan.Modulation.LORA.getNumber()) {
      output.writeEnum(11, modulation_);
    }
    if (!getDataRateBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 12, dataRate_);
    }
    if (bitRate_ != 0) {
      output.writeUInt32(13, bitRate_);
    }
    if (!getCodingRateBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 14, codingRate_);
    }
    if (fCnt_ != 0) {
      output.writeUInt32(15, fCnt_);
    }
    if (frequencyPlan_ != org.thethingsnetwork.api.protocol.lorawan.FrequencyPlan.EU_863_870.getNumber()) {
      output.writeEnum(16, frequencyPlan_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (modulation_ != org.thethingsnetwork.api.protocol.lorawan.Modulation.LORA.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(11, modulation_);
    }
    if (!getDataRateBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(12, dataRate_);
    }
    if (bitRate_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(13, bitRate_);
    }
    if (!getCodingRateBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(14, codingRate_);
    }
    if (fCnt_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(15, fCnt_);
    }
    if (frequencyPlan_ != org.thethingsnetwork.api.protocol.lorawan.FrequencyPlan.EU_863_870.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(16, frequencyPlan_);
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
    if (!(obj instanceof org.thethingsnetwork.api.protocol.lorawan.Metadata)) {
      return super.equals(obj);
    }
    org.thethingsnetwork.api.protocol.lorawan.Metadata other = (org.thethingsnetwork.api.protocol.lorawan.Metadata) obj;

    boolean result = true;
    result = result && modulation_ == other.modulation_;
    result = result && getDataRate()
        .equals(other.getDataRate());
    result = result && (getBitRate()
        == other.getBitRate());
    result = result && getCodingRate()
        .equals(other.getCodingRate());
    result = result && (getFCnt()
        == other.getFCnt());
    result = result && frequencyPlan_ == other.frequencyPlan_;
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
    hash = (37 * hash) + MODULATION_FIELD_NUMBER;
    hash = (53 * hash) + modulation_;
    hash = (37 * hash) + DATA_RATE_FIELD_NUMBER;
    hash = (53 * hash) + getDataRate().hashCode();
    hash = (37 * hash) + BIT_RATE_FIELD_NUMBER;
    hash = (53 * hash) + getBitRate();
    hash = (37 * hash) + CODING_RATE_FIELD_NUMBER;
    hash = (53 * hash) + getCodingRate().hashCode();
    hash = (37 * hash) + F_CNT_FIELD_NUMBER;
    hash = (53 * hash) + getFCnt();
    hash = (37 * hash) + FREQUENCY_PLAN_FIELD_NUMBER;
    hash = (53 * hash) + frequencyPlan_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.thethingsnetwork.api.protocol.lorawan.Metadata parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.thethingsnetwork.api.protocol.lorawan.Metadata parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.thethingsnetwork.api.protocol.lorawan.Metadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.thethingsnetwork.api.protocol.lorawan.Metadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.thethingsnetwork.api.protocol.lorawan.Metadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.thethingsnetwork.api.protocol.lorawan.Metadata parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.thethingsnetwork.api.protocol.lorawan.Metadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.thethingsnetwork.api.protocol.lorawan.Metadata parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.thethingsnetwork.api.protocol.lorawan.Metadata parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.thethingsnetwork.api.protocol.lorawan.Metadata parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.thethingsnetwork.api.protocol.lorawan.Metadata parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.thethingsnetwork.api.protocol.lorawan.Metadata parseFrom(
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
  public static Builder newBuilder(org.thethingsnetwork.api.protocol.lorawan.Metadata prototype) {
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
   * Protobuf type {@code lorawan.Metadata}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:lorawan.Metadata)
      org.thethingsnetwork.api.protocol.lorawan.MetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.thethingsnetwork.api.protocol.lorawan.LoRaWANProto.internal_static_lorawan_Metadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.thethingsnetwork.api.protocol.lorawan.LoRaWANProto.internal_static_lorawan_Metadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.thethingsnetwork.api.protocol.lorawan.Metadata.class, org.thethingsnetwork.api.protocol.lorawan.Metadata.Builder.class);
    }

    // Construct using org.thethingsnetwork.api.protocol.lorawan.Metadata.newBuilder()
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
      modulation_ = 0;

      dataRate_ = "";

      bitRate_ = 0;

      codingRate_ = "";

      fCnt_ = 0;

      frequencyPlan_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.thethingsnetwork.api.protocol.lorawan.LoRaWANProto.internal_static_lorawan_Metadata_descriptor;
    }

    @java.lang.Override
    public org.thethingsnetwork.api.protocol.lorawan.Metadata getDefaultInstanceForType() {
      return org.thethingsnetwork.api.protocol.lorawan.Metadata.getDefaultInstance();
    }

    @java.lang.Override
    public org.thethingsnetwork.api.protocol.lorawan.Metadata build() {
      org.thethingsnetwork.api.protocol.lorawan.Metadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.thethingsnetwork.api.protocol.lorawan.Metadata buildPartial() {
      org.thethingsnetwork.api.protocol.lorawan.Metadata result = new org.thethingsnetwork.api.protocol.lorawan.Metadata(this);
      result.modulation_ = modulation_;
      result.dataRate_ = dataRate_;
      result.bitRate_ = bitRate_;
      result.codingRate_ = codingRate_;
      result.fCnt_ = fCnt_;
      result.frequencyPlan_ = frequencyPlan_;
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
      if (other instanceof org.thethingsnetwork.api.protocol.lorawan.Metadata) {
        return mergeFrom((org.thethingsnetwork.api.protocol.lorawan.Metadata)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.thethingsnetwork.api.protocol.lorawan.Metadata other) {
      if (other == org.thethingsnetwork.api.protocol.lorawan.Metadata.getDefaultInstance()) return this;
      if (other.modulation_ != 0) {
        setModulationValue(other.getModulationValue());
      }
      if (!other.getDataRate().isEmpty()) {
        dataRate_ = other.dataRate_;
        onChanged();
      }
      if (other.getBitRate() != 0) {
        setBitRate(other.getBitRate());
      }
      if (!other.getCodingRate().isEmpty()) {
        codingRate_ = other.codingRate_;
        onChanged();
      }
      if (other.getFCnt() != 0) {
        setFCnt(other.getFCnt());
      }
      if (other.frequencyPlan_ != 0) {
        setFrequencyPlanValue(other.getFrequencyPlanValue());
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
      org.thethingsnetwork.api.protocol.lorawan.Metadata parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.thethingsnetwork.api.protocol.lorawan.Metadata) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int modulation_ = 0;
    /**
     * <code>.lorawan.Modulation modulation = 11;</code>
     */
    public int getModulationValue() {
      return modulation_;
    }
    /**
     * <code>.lorawan.Modulation modulation = 11;</code>
     */
    public Builder setModulationValue(int value) {
      modulation_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.lorawan.Modulation modulation = 11;</code>
     */
    public org.thethingsnetwork.api.protocol.lorawan.Modulation getModulation() {
      @SuppressWarnings("deprecation")
      org.thethingsnetwork.api.protocol.lorawan.Modulation result = org.thethingsnetwork.api.protocol.lorawan.Modulation.valueOf(modulation_);
      return result == null ? org.thethingsnetwork.api.protocol.lorawan.Modulation.UNRECOGNIZED : result;
    }
    /**
     * <code>.lorawan.Modulation modulation = 11;</code>
     */
    public Builder setModulation(org.thethingsnetwork.api.protocol.lorawan.Modulation value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      modulation_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.lorawan.Modulation modulation = 11;</code>
     */
    public Builder clearModulation() {
      
      modulation_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object dataRate_ = "";
    /**
     * <pre>
     * LoRa data rate - SF{spreadingfactor}BW{bandwidth}
     * </pre>
     *
     * <code>string data_rate = 12;</code>
     */
    public java.lang.String getDataRate() {
      java.lang.Object ref = dataRate_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dataRate_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * LoRa data rate - SF{spreadingfactor}BW{bandwidth}
     * </pre>
     *
     * <code>string data_rate = 12;</code>
     */
    public com.google.protobuf.ByteString
        getDataRateBytes() {
      java.lang.Object ref = dataRate_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dataRate_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * LoRa data rate - SF{spreadingfactor}BW{bandwidth}
     * </pre>
     *
     * <code>string data_rate = 12;</code>
     */
    public Builder setDataRate(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      dataRate_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * LoRa data rate - SF{spreadingfactor}BW{bandwidth}
     * </pre>
     *
     * <code>string data_rate = 12;</code>
     */
    public Builder clearDataRate() {
      
      dataRate_ = getDefaultInstance().getDataRate();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * LoRa data rate - SF{spreadingfactor}BW{bandwidth}
     * </pre>
     *
     * <code>string data_rate = 12;</code>
     */
    public Builder setDataRateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      dataRate_ = value;
      onChanged();
      return this;
    }

    private int bitRate_ ;
    /**
     * <pre>
     * FSK bit rate in bit/s
     * </pre>
     *
     * <code>uint32 bit_rate = 13;</code>
     */
    public int getBitRate() {
      return bitRate_;
    }
    /**
     * <pre>
     * FSK bit rate in bit/s
     * </pre>
     *
     * <code>uint32 bit_rate = 13;</code>
     */
    public Builder setBitRate(int value) {
      
      bitRate_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * FSK bit rate in bit/s
     * </pre>
     *
     * <code>uint32 bit_rate = 13;</code>
     */
    public Builder clearBitRate() {
      
      bitRate_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object codingRate_ = "";
    /**
     * <pre>
     * LoRa coding rate
     * </pre>
     *
     * <code>string coding_rate = 14;</code>
     */
    public java.lang.String getCodingRate() {
      java.lang.Object ref = codingRate_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        codingRate_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * LoRa coding rate
     * </pre>
     *
     * <code>string coding_rate = 14;</code>
     */
    public com.google.protobuf.ByteString
        getCodingRateBytes() {
      java.lang.Object ref = codingRate_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        codingRate_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * LoRa coding rate
     * </pre>
     *
     * <code>string coding_rate = 14;</code>
     */
    public Builder setCodingRate(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      codingRate_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * LoRa coding rate
     * </pre>
     *
     * <code>string coding_rate = 14;</code>
     */
    public Builder clearCodingRate() {
      
      codingRate_ = getDefaultInstance().getCodingRate();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * LoRa coding rate
     * </pre>
     *
     * <code>string coding_rate = 14;</code>
     */
    public Builder setCodingRateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      codingRate_ = value;
      onChanged();
      return this;
    }

    private int fCnt_ ;
    /**
     * <pre>
     * Store the full 32 bit FCnt (deprecated; do not use)
     * </pre>
     *
     * <code>uint32 f_cnt = 15;</code>
     */
    public int getFCnt() {
      return fCnt_;
    }
    /**
     * <pre>
     * Store the full 32 bit FCnt (deprecated; do not use)
     * </pre>
     *
     * <code>uint32 f_cnt = 15;</code>
     */
    public Builder setFCnt(int value) {
      
      fCnt_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Store the full 32 bit FCnt (deprecated; do not use)
     * </pre>
     *
     * <code>uint32 f_cnt = 15;</code>
     */
    public Builder clearFCnt() {
      
      fCnt_ = 0;
      onChanged();
      return this;
    }

    private int frequencyPlan_ = 0;
    /**
     * <code>.lorawan.FrequencyPlan frequency_plan = 16;</code>
     */
    public int getFrequencyPlanValue() {
      return frequencyPlan_;
    }
    /**
     * <code>.lorawan.FrequencyPlan frequency_plan = 16;</code>
     */
    public Builder setFrequencyPlanValue(int value) {
      frequencyPlan_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.lorawan.FrequencyPlan frequency_plan = 16;</code>
     */
    public org.thethingsnetwork.api.protocol.lorawan.FrequencyPlan getFrequencyPlan() {
      @SuppressWarnings("deprecation")
      org.thethingsnetwork.api.protocol.lorawan.FrequencyPlan result = org.thethingsnetwork.api.protocol.lorawan.FrequencyPlan.valueOf(frequencyPlan_);
      return result == null ? org.thethingsnetwork.api.protocol.lorawan.FrequencyPlan.UNRECOGNIZED : result;
    }
    /**
     * <code>.lorawan.FrequencyPlan frequency_plan = 16;</code>
     */
    public Builder setFrequencyPlan(org.thethingsnetwork.api.protocol.lorawan.FrequencyPlan value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      frequencyPlan_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.lorawan.FrequencyPlan frequency_plan = 16;</code>
     */
    public Builder clearFrequencyPlan() {
      
      frequencyPlan_ = 0;
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


    // @@protoc_insertion_point(builder_scope:lorawan.Metadata)
  }

  // @@protoc_insertion_point(class_scope:lorawan.Metadata)
  private static final org.thethingsnetwork.api.protocol.lorawan.Metadata DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.thethingsnetwork.api.protocol.lorawan.Metadata();
  }

  public static org.thethingsnetwork.api.protocol.lorawan.Metadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Metadata>
      PARSER = new com.google.protobuf.AbstractParser<Metadata>() {
    @java.lang.Override
    public Metadata parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Metadata(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Metadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Metadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.thethingsnetwork.api.protocol.lorawan.Metadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

