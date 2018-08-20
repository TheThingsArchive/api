// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/TheThingsNetwork/api/discovery/discovery.proto

package org.thethingsnetwork.api.discovery;

/**
 * <pre>
 * A list of announcements
 * </pre>
 *
 * Protobuf type {@code discovery.AnnouncementsResponse}
 */
public  final class AnnouncementsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:discovery.AnnouncementsResponse)
    AnnouncementsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AnnouncementsResponse.newBuilder() to construct.
  private AnnouncementsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AnnouncementsResponse() {
    services_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AnnouncementsResponse(
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              services_ = new java.util.ArrayList<org.thethingsnetwork.api.discovery.Announcement>();
              mutable_bitField0_ |= 0x00000001;
            }
            services_.add(
                input.readMessage(org.thethingsnetwork.api.discovery.Announcement.parser(), extensionRegistry));
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
        services_ = java.util.Collections.unmodifiableList(services_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.thethingsnetwork.api.discovery.DiscoveryProto.internal_static_discovery_AnnouncementsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.thethingsnetwork.api.discovery.DiscoveryProto.internal_static_discovery_AnnouncementsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.thethingsnetwork.api.discovery.AnnouncementsResponse.class, org.thethingsnetwork.api.discovery.AnnouncementsResponse.Builder.class);
  }

  public static final int SERVICES_FIELD_NUMBER = 1;
  private java.util.List<org.thethingsnetwork.api.discovery.Announcement> services_;
  /**
   * <code>repeated .discovery.Announcement services = 1;</code>
   */
  public java.util.List<org.thethingsnetwork.api.discovery.Announcement> getServicesList() {
    return services_;
  }
  /**
   * <code>repeated .discovery.Announcement services = 1;</code>
   */
  public java.util.List<? extends org.thethingsnetwork.api.discovery.AnnouncementOrBuilder> 
      getServicesOrBuilderList() {
    return services_;
  }
  /**
   * <code>repeated .discovery.Announcement services = 1;</code>
   */
  public int getServicesCount() {
    return services_.size();
  }
  /**
   * <code>repeated .discovery.Announcement services = 1;</code>
   */
  public org.thethingsnetwork.api.discovery.Announcement getServices(int index) {
    return services_.get(index);
  }
  /**
   * <code>repeated .discovery.Announcement services = 1;</code>
   */
  public org.thethingsnetwork.api.discovery.AnnouncementOrBuilder getServicesOrBuilder(
      int index) {
    return services_.get(index);
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
    for (int i = 0; i < services_.size(); i++) {
      output.writeMessage(1, services_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < services_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, services_.get(i));
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
    if (!(obj instanceof org.thethingsnetwork.api.discovery.AnnouncementsResponse)) {
      return super.equals(obj);
    }
    org.thethingsnetwork.api.discovery.AnnouncementsResponse other = (org.thethingsnetwork.api.discovery.AnnouncementsResponse) obj;

    boolean result = true;
    result = result && getServicesList()
        .equals(other.getServicesList());
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
    if (getServicesCount() > 0) {
      hash = (37 * hash) + SERVICES_FIELD_NUMBER;
      hash = (53 * hash) + getServicesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.thethingsnetwork.api.discovery.AnnouncementsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.thethingsnetwork.api.discovery.AnnouncementsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.thethingsnetwork.api.discovery.AnnouncementsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.thethingsnetwork.api.discovery.AnnouncementsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.thethingsnetwork.api.discovery.AnnouncementsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.thethingsnetwork.api.discovery.AnnouncementsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.thethingsnetwork.api.discovery.AnnouncementsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.thethingsnetwork.api.discovery.AnnouncementsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.thethingsnetwork.api.discovery.AnnouncementsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.thethingsnetwork.api.discovery.AnnouncementsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.thethingsnetwork.api.discovery.AnnouncementsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.thethingsnetwork.api.discovery.AnnouncementsResponse parseFrom(
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
  public static Builder newBuilder(org.thethingsnetwork.api.discovery.AnnouncementsResponse prototype) {
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
   * <pre>
   * A list of announcements
   * </pre>
   *
   * Protobuf type {@code discovery.AnnouncementsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:discovery.AnnouncementsResponse)
      org.thethingsnetwork.api.discovery.AnnouncementsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.thethingsnetwork.api.discovery.DiscoveryProto.internal_static_discovery_AnnouncementsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.thethingsnetwork.api.discovery.DiscoveryProto.internal_static_discovery_AnnouncementsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.thethingsnetwork.api.discovery.AnnouncementsResponse.class, org.thethingsnetwork.api.discovery.AnnouncementsResponse.Builder.class);
    }

    // Construct using org.thethingsnetwork.api.discovery.AnnouncementsResponse.newBuilder()
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
        getServicesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (servicesBuilder_ == null) {
        services_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        servicesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.thethingsnetwork.api.discovery.DiscoveryProto.internal_static_discovery_AnnouncementsResponse_descriptor;
    }

    @java.lang.Override
    public org.thethingsnetwork.api.discovery.AnnouncementsResponse getDefaultInstanceForType() {
      return org.thethingsnetwork.api.discovery.AnnouncementsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public org.thethingsnetwork.api.discovery.AnnouncementsResponse build() {
      org.thethingsnetwork.api.discovery.AnnouncementsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.thethingsnetwork.api.discovery.AnnouncementsResponse buildPartial() {
      org.thethingsnetwork.api.discovery.AnnouncementsResponse result = new org.thethingsnetwork.api.discovery.AnnouncementsResponse(this);
      int from_bitField0_ = bitField0_;
      if (servicesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          services_ = java.util.Collections.unmodifiableList(services_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.services_ = services_;
      } else {
        result.services_ = servicesBuilder_.build();
      }
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
      if (other instanceof org.thethingsnetwork.api.discovery.AnnouncementsResponse) {
        return mergeFrom((org.thethingsnetwork.api.discovery.AnnouncementsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.thethingsnetwork.api.discovery.AnnouncementsResponse other) {
      if (other == org.thethingsnetwork.api.discovery.AnnouncementsResponse.getDefaultInstance()) return this;
      if (servicesBuilder_ == null) {
        if (!other.services_.isEmpty()) {
          if (services_.isEmpty()) {
            services_ = other.services_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureServicesIsMutable();
            services_.addAll(other.services_);
          }
          onChanged();
        }
      } else {
        if (!other.services_.isEmpty()) {
          if (servicesBuilder_.isEmpty()) {
            servicesBuilder_.dispose();
            servicesBuilder_ = null;
            services_ = other.services_;
            bitField0_ = (bitField0_ & ~0x00000001);
            servicesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getServicesFieldBuilder() : null;
          } else {
            servicesBuilder_.addAllMessages(other.services_);
          }
        }
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
      org.thethingsnetwork.api.discovery.AnnouncementsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.thethingsnetwork.api.discovery.AnnouncementsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<org.thethingsnetwork.api.discovery.Announcement> services_ =
      java.util.Collections.emptyList();
    private void ensureServicesIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        services_ = new java.util.ArrayList<org.thethingsnetwork.api.discovery.Announcement>(services_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.thethingsnetwork.api.discovery.Announcement, org.thethingsnetwork.api.discovery.Announcement.Builder, org.thethingsnetwork.api.discovery.AnnouncementOrBuilder> servicesBuilder_;

    /**
     * <code>repeated .discovery.Announcement services = 1;</code>
     */
    public java.util.List<org.thethingsnetwork.api.discovery.Announcement> getServicesList() {
      if (servicesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(services_);
      } else {
        return servicesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .discovery.Announcement services = 1;</code>
     */
    public int getServicesCount() {
      if (servicesBuilder_ == null) {
        return services_.size();
      } else {
        return servicesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .discovery.Announcement services = 1;</code>
     */
    public org.thethingsnetwork.api.discovery.Announcement getServices(int index) {
      if (servicesBuilder_ == null) {
        return services_.get(index);
      } else {
        return servicesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .discovery.Announcement services = 1;</code>
     */
    public Builder setServices(
        int index, org.thethingsnetwork.api.discovery.Announcement value) {
      if (servicesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureServicesIsMutable();
        services_.set(index, value);
        onChanged();
      } else {
        servicesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .discovery.Announcement services = 1;</code>
     */
    public Builder setServices(
        int index, org.thethingsnetwork.api.discovery.Announcement.Builder builderForValue) {
      if (servicesBuilder_ == null) {
        ensureServicesIsMutable();
        services_.set(index, builderForValue.build());
        onChanged();
      } else {
        servicesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .discovery.Announcement services = 1;</code>
     */
    public Builder addServices(org.thethingsnetwork.api.discovery.Announcement value) {
      if (servicesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureServicesIsMutable();
        services_.add(value);
        onChanged();
      } else {
        servicesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .discovery.Announcement services = 1;</code>
     */
    public Builder addServices(
        int index, org.thethingsnetwork.api.discovery.Announcement value) {
      if (servicesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureServicesIsMutable();
        services_.add(index, value);
        onChanged();
      } else {
        servicesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .discovery.Announcement services = 1;</code>
     */
    public Builder addServices(
        org.thethingsnetwork.api.discovery.Announcement.Builder builderForValue) {
      if (servicesBuilder_ == null) {
        ensureServicesIsMutable();
        services_.add(builderForValue.build());
        onChanged();
      } else {
        servicesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .discovery.Announcement services = 1;</code>
     */
    public Builder addServices(
        int index, org.thethingsnetwork.api.discovery.Announcement.Builder builderForValue) {
      if (servicesBuilder_ == null) {
        ensureServicesIsMutable();
        services_.add(index, builderForValue.build());
        onChanged();
      } else {
        servicesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .discovery.Announcement services = 1;</code>
     */
    public Builder addAllServices(
        java.lang.Iterable<? extends org.thethingsnetwork.api.discovery.Announcement> values) {
      if (servicesBuilder_ == null) {
        ensureServicesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, services_);
        onChanged();
      } else {
        servicesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .discovery.Announcement services = 1;</code>
     */
    public Builder clearServices() {
      if (servicesBuilder_ == null) {
        services_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        servicesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .discovery.Announcement services = 1;</code>
     */
    public Builder removeServices(int index) {
      if (servicesBuilder_ == null) {
        ensureServicesIsMutable();
        services_.remove(index);
        onChanged();
      } else {
        servicesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .discovery.Announcement services = 1;</code>
     */
    public org.thethingsnetwork.api.discovery.Announcement.Builder getServicesBuilder(
        int index) {
      return getServicesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .discovery.Announcement services = 1;</code>
     */
    public org.thethingsnetwork.api.discovery.AnnouncementOrBuilder getServicesOrBuilder(
        int index) {
      if (servicesBuilder_ == null) {
        return services_.get(index);  } else {
        return servicesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .discovery.Announcement services = 1;</code>
     */
    public java.util.List<? extends org.thethingsnetwork.api.discovery.AnnouncementOrBuilder> 
         getServicesOrBuilderList() {
      if (servicesBuilder_ != null) {
        return servicesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(services_);
      }
    }
    /**
     * <code>repeated .discovery.Announcement services = 1;</code>
     */
    public org.thethingsnetwork.api.discovery.Announcement.Builder addServicesBuilder() {
      return getServicesFieldBuilder().addBuilder(
          org.thethingsnetwork.api.discovery.Announcement.getDefaultInstance());
    }
    /**
     * <code>repeated .discovery.Announcement services = 1;</code>
     */
    public org.thethingsnetwork.api.discovery.Announcement.Builder addServicesBuilder(
        int index) {
      return getServicesFieldBuilder().addBuilder(
          index, org.thethingsnetwork.api.discovery.Announcement.getDefaultInstance());
    }
    /**
     * <code>repeated .discovery.Announcement services = 1;</code>
     */
    public java.util.List<org.thethingsnetwork.api.discovery.Announcement.Builder> 
         getServicesBuilderList() {
      return getServicesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.thethingsnetwork.api.discovery.Announcement, org.thethingsnetwork.api.discovery.Announcement.Builder, org.thethingsnetwork.api.discovery.AnnouncementOrBuilder> 
        getServicesFieldBuilder() {
      if (servicesBuilder_ == null) {
        servicesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.thethingsnetwork.api.discovery.Announcement, org.thethingsnetwork.api.discovery.Announcement.Builder, org.thethingsnetwork.api.discovery.AnnouncementOrBuilder>(
                services_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        services_ = null;
      }
      return servicesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:discovery.AnnouncementsResponse)
  }

  // @@protoc_insertion_point(class_scope:discovery.AnnouncementsResponse)
  private static final org.thethingsnetwork.api.discovery.AnnouncementsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.thethingsnetwork.api.discovery.AnnouncementsResponse();
  }

  public static org.thethingsnetwork.api.discovery.AnnouncementsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AnnouncementsResponse>
      PARSER = new com.google.protobuf.AbstractParser<AnnouncementsResponse>() {
    @java.lang.Override
    public AnnouncementsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AnnouncementsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AnnouncementsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AnnouncementsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.thethingsnetwork.api.discovery.AnnouncementsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

