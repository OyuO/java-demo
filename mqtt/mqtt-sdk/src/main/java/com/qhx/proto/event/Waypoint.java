// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: task.proto

package com.qhx.proto.event;

/**
 * <pre>
 * 路径点
 * </pre>
 *
 * Protobuf type {@code qhx.proto.weve.Waypoint}
 */
public final class Waypoint extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:qhx.proto.weve.Waypoint)
    WaypointOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Waypoint.newBuilder() to construct.
  private Waypoint(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Waypoint() {
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new Waypoint();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Waypoint(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new NullPointerException();
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
          case 8: {

            index_ = input.readUInt32();
            break;
          }
          case 18: {
            Pose.Builder subBuilder = null;
            if (platform_ != null) {
              subBuilder = platform_.toBuilder();
            }
            platform_ = input.readMessage(Pose.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(platform_);
              platform_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            Pose.Builder subBuilder = null;
            if (payload_ != null) {
              subBuilder = payload_.toBuilder();
            }
            payload_ = input.readMessage(Pose.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(payload_);
              payload_ = subBuilder.buildPartial();
            }

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
    return TaskOuterClass.internal_static_qhx_proto_weve_Waypoint_descriptor;
  }

  @Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return TaskOuterClass.internal_static_qhx_proto_weve_Waypoint_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            Waypoint.class, Builder.class);
  }

  public static final int INDEX_FIELD_NUMBER = 1;
  private int index_;
  /**
   * <pre>
   * 索引
   * </pre>
   *
   * <code>uint32 index = 1;</code>
   * @return The index.
   */
  @Override
  public int getIndex() {
    return index_;
  }

  public static final int PLATFORM_FIELD_NUMBER = 2;
  private Pose platform_;
  /**
   * <pre>
   * 平台位姿
   * </pre>
   *
   * <code>.qhx.proto.weve.Pose platform = 2;</code>
   * @return Whether the platform field is set.
   */
  @Override
  public boolean hasPlatform() {
    return platform_ != null;
  }
  /**
   * <pre>
   * 平台位姿
   * </pre>
   *
   * <code>.qhx.proto.weve.Pose platform = 2;</code>
   * @return The platform.
   */
  @Override
  public Pose getPlatform() {
    return platform_ == null ? Pose.getDefaultInstance() : platform_;
  }
  /**
   * <pre>
   * 平台位姿
   * </pre>
   *
   * <code>.qhx.proto.weve.Pose platform = 2;</code>
   */
  @Override
  public PoseOrBuilder getPlatformOrBuilder() {
    return getPlatform();
  }

  public static final int PAYLOAD_FIELD_NUMBER = 3;
  private Pose payload_;
  /**
   * <pre>
   * 载荷位姿
   * </pre>
   *
   * <code>.qhx.proto.weve.Pose payload = 3;</code>
   * @return Whether the payload field is set.
   */
  @Override
  public boolean hasPayload() {
    return payload_ != null;
  }
  /**
   * <pre>
   * 载荷位姿
   * </pre>
   *
   * <code>.qhx.proto.weve.Pose payload = 3;</code>
   * @return The payload.
   */
  @Override
  public Pose getPayload() {
    return payload_ == null ? Pose.getDefaultInstance() : payload_;
  }
  /**
   * <pre>
   * 载荷位姿
   * </pre>
   *
   * <code>.qhx.proto.weve.Pose payload = 3;</code>
   */
  @Override
  public PoseOrBuilder getPayloadOrBuilder() {
    return getPayload();
  }

  private byte memoizedIsInitialized = -1;
  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (index_ != 0) {
      output.writeUInt32(1, index_);
    }
    if (platform_ != null) {
      output.writeMessage(2, getPlatform());
    }
    if (payload_ != null) {
      output.writeMessage(3, getPayload());
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (index_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, index_);
    }
    if (platform_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPlatform());
    }
    if (payload_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getPayload());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof Waypoint)) {
      return super.equals(obj);
    }
    Waypoint other = (Waypoint) obj;

    if (getIndex()
        != other.getIndex()) return false;
    if (hasPlatform() != other.hasPlatform()) return false;
    if (hasPlatform()) {
      if (!getPlatform()
          .equals(other.getPlatform())) return false;
    }
    if (hasPayload() != other.hasPayload()) return false;
    if (hasPayload()) {
      if (!getPayload()
          .equals(other.getPayload())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + INDEX_FIELD_NUMBER;
    hash = (53 * hash) + getIndex();
    if (hasPlatform()) {
      hash = (37 * hash) + PLATFORM_FIELD_NUMBER;
      hash = (53 * hash) + getPlatform().hashCode();
    }
    if (hasPayload()) {
      hash = (37 * hash) + PAYLOAD_FIELD_NUMBER;
      hash = (53 * hash) + getPayload().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static Waypoint parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Waypoint parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Waypoint parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Waypoint parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Waypoint parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Waypoint parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Waypoint parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Waypoint parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static Waypoint parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static Waypoint parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static Waypoint parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Waypoint parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(Waypoint prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * 路径点
   * </pre>
   *
   * Protobuf type {@code qhx.proto.weve.Waypoint}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:qhx.proto.weve.Waypoint)
          WaypointOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return TaskOuterClass.internal_static_qhx_proto_weve_Waypoint_descriptor;
    }

    @Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return TaskOuterClass.internal_static_qhx_proto_weve_Waypoint_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Waypoint.class, Builder.class);
    }

    // Construct using com.qhx.proto.event.Waypoint.newBuilder()
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
    @Override
    public Builder clear() {
      super.clear();
      index_ = 0;

      if (platformBuilder_ == null) {
        platform_ = null;
      } else {
        platform_ = null;
        platformBuilder_ = null;
      }
      if (payloadBuilder_ == null) {
        payload_ = null;
      } else {
        payload_ = null;
        payloadBuilder_ = null;
      }
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return TaskOuterClass.internal_static_qhx_proto_weve_Waypoint_descriptor;
    }

    @Override
    public Waypoint getDefaultInstanceForType() {
      return Waypoint.getDefaultInstance();
    }

    @Override
    public Waypoint build() {
      Waypoint result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public Waypoint buildPartial() {
      Waypoint result = new Waypoint(this);
      result.index_ = index_;
      if (platformBuilder_ == null) {
        result.platform_ = platform_;
      } else {
        result.platform_ = platformBuilder_.build();
      }
      if (payloadBuilder_ == null) {
        result.payload_ = payload_;
      } else {
        result.payload_ = payloadBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @Override
    public Builder clone() {
      return super.clone();
    }
    @Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.setField(field, value);
    }
    @Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.addRepeatedField(field, value);
    }
    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof Waypoint) {
        return mergeFrom((Waypoint)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(Waypoint other) {
      if (other == Waypoint.getDefaultInstance()) return this;
      if (other.getIndex() != 0) {
        setIndex(other.getIndex());
      }
      if (other.hasPlatform()) {
        mergePlatform(other.getPlatform());
      }
      if (other.hasPayload()) {
        mergePayload(other.getPayload());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @Override
    public final boolean isInitialized() {
      return true;
    }

    @Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Waypoint parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (Waypoint) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int index_ ;
    /**
     * <pre>
     * 索引
     * </pre>
     *
     * <code>uint32 index = 1;</code>
     * @return The index.
     */
    @Override
    public int getIndex() {
      return index_;
    }
    /**
     * <pre>
     * 索引
     * </pre>
     *
     * <code>uint32 index = 1;</code>
     * @param value The index to set.
     * @return This builder for chaining.
     */
    public Builder setIndex(int value) {
      
      index_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 索引
     * </pre>
     *
     * <code>uint32 index = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearIndex() {
      
      index_ = 0;
      onChanged();
      return this;
    }

    private Pose platform_;
    private com.google.protobuf.SingleFieldBuilderV3<
            Pose, Pose.Builder, PoseOrBuilder> platformBuilder_;
    /**
     * <pre>
     * 平台位姿
     * </pre>
     *
     * <code>.qhx.proto.weve.Pose platform = 2;</code>
     * @return Whether the platform field is set.
     */
    public boolean hasPlatform() {
      return platformBuilder_ != null || platform_ != null;
    }
    /**
     * <pre>
     * 平台位姿
     * </pre>
     *
     * <code>.qhx.proto.weve.Pose platform = 2;</code>
     * @return The platform.
     */
    public Pose getPlatform() {
      if (platformBuilder_ == null) {
        return platform_ == null ? Pose.getDefaultInstance() : platform_;
      } else {
        return platformBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 平台位姿
     * </pre>
     *
     * <code>.qhx.proto.weve.Pose platform = 2;</code>
     */
    public Builder setPlatform(Pose value) {
      if (platformBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        platform_ = value;
        onChanged();
      } else {
        platformBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * 平台位姿
     * </pre>
     *
     * <code>.qhx.proto.weve.Pose platform = 2;</code>
     */
    public Builder setPlatform(
        Pose.Builder builderForValue) {
      if (platformBuilder_ == null) {
        platform_ = builderForValue.build();
        onChanged();
      } else {
        platformBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * 平台位姿
     * </pre>
     *
     * <code>.qhx.proto.weve.Pose platform = 2;</code>
     */
    public Builder mergePlatform(Pose value) {
      if (platformBuilder_ == null) {
        if (platform_ != null) {
          platform_ =
            Pose.newBuilder(platform_).mergeFrom(value).buildPartial();
        } else {
          platform_ = value;
        }
        onChanged();
      } else {
        platformBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * 平台位姿
     * </pre>
     *
     * <code>.qhx.proto.weve.Pose platform = 2;</code>
     */
    public Builder clearPlatform() {
      if (platformBuilder_ == null) {
        platform_ = null;
        onChanged();
      } else {
        platform_ = null;
        platformBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * 平台位姿
     * </pre>
     *
     * <code>.qhx.proto.weve.Pose platform = 2;</code>
     */
    public Pose.Builder getPlatformBuilder() {
      
      onChanged();
      return getPlatformFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 平台位姿
     * </pre>
     *
     * <code>.qhx.proto.weve.Pose platform = 2;</code>
     */
    public PoseOrBuilder getPlatformOrBuilder() {
      if (platformBuilder_ != null) {
        return platformBuilder_.getMessageOrBuilder();
      } else {
        return platform_ == null ?
            Pose.getDefaultInstance() : platform_;
      }
    }
    /**
     * <pre>
     * 平台位姿
     * </pre>
     *
     * <code>.qhx.proto.weve.Pose platform = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            Pose, Pose.Builder, PoseOrBuilder>
        getPlatformFieldBuilder() {
      if (platformBuilder_ == null) {
        platformBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                Pose, Pose.Builder, PoseOrBuilder>(
                getPlatform(),
                getParentForChildren(),
                isClean());
        platform_ = null;
      }
      return platformBuilder_;
    }

    private Pose payload_;
    private com.google.protobuf.SingleFieldBuilderV3<
            Pose, Pose.Builder, PoseOrBuilder> payloadBuilder_;
    /**
     * <pre>
     * 载荷位姿
     * </pre>
     *
     * <code>.qhx.proto.weve.Pose payload = 3;</code>
     * @return Whether the payload field is set.
     */
    public boolean hasPayload() {
      return payloadBuilder_ != null || payload_ != null;
    }
    /**
     * <pre>
     * 载荷位姿
     * </pre>
     *
     * <code>.qhx.proto.weve.Pose payload = 3;</code>
     * @return The payload.
     */
    public Pose getPayload() {
      if (payloadBuilder_ == null) {
        return payload_ == null ? Pose.getDefaultInstance() : payload_;
      } else {
        return payloadBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 载荷位姿
     * </pre>
     *
     * <code>.qhx.proto.weve.Pose payload = 3;</code>
     */
    public Builder setPayload(Pose value) {
      if (payloadBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        payload_ = value;
        onChanged();
      } else {
        payloadBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * 载荷位姿
     * </pre>
     *
     * <code>.qhx.proto.weve.Pose payload = 3;</code>
     */
    public Builder setPayload(
        Pose.Builder builderForValue) {
      if (payloadBuilder_ == null) {
        payload_ = builderForValue.build();
        onChanged();
      } else {
        payloadBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * 载荷位姿
     * </pre>
     *
     * <code>.qhx.proto.weve.Pose payload = 3;</code>
     */
    public Builder mergePayload(Pose value) {
      if (payloadBuilder_ == null) {
        if (payload_ != null) {
          payload_ =
            Pose.newBuilder(payload_).mergeFrom(value).buildPartial();
        } else {
          payload_ = value;
        }
        onChanged();
      } else {
        payloadBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * 载荷位姿
     * </pre>
     *
     * <code>.qhx.proto.weve.Pose payload = 3;</code>
     */
    public Builder clearPayload() {
      if (payloadBuilder_ == null) {
        payload_ = null;
        onChanged();
      } else {
        payload_ = null;
        payloadBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * 载荷位姿
     * </pre>
     *
     * <code>.qhx.proto.weve.Pose payload = 3;</code>
     */
    public Pose.Builder getPayloadBuilder() {
      
      onChanged();
      return getPayloadFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 载荷位姿
     * </pre>
     *
     * <code>.qhx.proto.weve.Pose payload = 3;</code>
     */
    public PoseOrBuilder getPayloadOrBuilder() {
      if (payloadBuilder_ != null) {
        return payloadBuilder_.getMessageOrBuilder();
      } else {
        return payload_ == null ?
            Pose.getDefaultInstance() : payload_;
      }
    }
    /**
     * <pre>
     * 载荷位姿
     * </pre>
     *
     * <code>.qhx.proto.weve.Pose payload = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            Pose, Pose.Builder, PoseOrBuilder>
        getPayloadFieldBuilder() {
      if (payloadBuilder_ == null) {
        payloadBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                Pose, Pose.Builder, PoseOrBuilder>(
                getPayload(),
                getParentForChildren(),
                isClean());
        payload_ = null;
      }
      return payloadBuilder_;
    }
    @Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:qhx.proto.weve.Waypoint)
  }

  // @@protoc_insertion_point(class_scope:qhx.proto.weve.Waypoint)
  private static final Waypoint DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Waypoint();
  }

  public static Waypoint getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Waypoint>
      PARSER = new com.google.protobuf.AbstractParser<Waypoint>() {
    @Override
    public Waypoint parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Waypoint(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Waypoint> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<Waypoint> getParserForType() {
    return PARSER;
  }

  @Override
  public Waypoint getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

