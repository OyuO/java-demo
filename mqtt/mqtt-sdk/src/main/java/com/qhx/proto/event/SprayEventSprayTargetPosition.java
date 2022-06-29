// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: spray_event.proto

package com.qhx.proto.event;

/**
 * <pre>
 * 喷洒目标位置
 * </pre>
 *
 * Protobuf type {@code qhx.proto.weve.event.spray.SprayEventSprayTargetPosition}
 */
public final class SprayEventSprayTargetPosition extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:qhx.proto.weve.event.spray.SprayEventSprayTargetPosition)
    SprayEventSprayTargetPositionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SprayEventSprayTargetPosition.newBuilder() to construct.
  private SprayEventSprayTargetPosition(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SprayEventSprayTargetPosition() {
    position_ = java.util.Collections.emptyList();
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new SprayEventSprayTargetPosition();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SprayEventSprayTargetPosition(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new NullPointerException();
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

            seq_ = input.readUInt32();
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              position_ = new java.util.ArrayList<SprayEventSprayTargetPoint>();
              mutable_bitField0_ |= 0x00000001;
            }
            position_.add(
                input.readMessage(SprayEventSprayTargetPoint.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        position_ = java.util.Collections.unmodifiableList(position_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return SprayEventOuterClass.internal_static_qhx_proto_weve_event_spray_SprayEventSprayTargetPosition_descriptor;
  }

  @Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return SprayEventOuterClass.internal_static_qhx_proto_weve_event_spray_SprayEventSprayTargetPosition_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            SprayEventSprayTargetPosition.class, Builder.class);
  }

  public static final int SEQ_FIELD_NUMBER = 1;
  private int seq_;
  /**
   * <pre>
   * 帧数
   * </pre>
   *
   * <code>uint32 seq = 1;</code>
   * @return The seq.
   */
  @Override
  public int getSeq() {
    return seq_;
  }

  public static final int POSITION_FIELD_NUMBER = 2;
  private java.util.List<SprayEventSprayTargetPoint> position_;
  /**
   * <pre>
   * 每一帧图像对应的所有喷洒目标点
   * </pre>
   *
   * <code>repeated .qhx.proto.weve.event.spray.SprayEventSprayTargetPoint position = 2;</code>
   */
  @Override
  public java.util.List<SprayEventSprayTargetPoint> getPositionList() {
    return position_;
  }
  /**
   * <pre>
   * 每一帧图像对应的所有喷洒目标点
   * </pre>
   *
   * <code>repeated .qhx.proto.weve.event.spray.SprayEventSprayTargetPoint position = 2;</code>
   */
  @Override
  public java.util.List<? extends SprayEventSprayTargetPointOrBuilder>
      getPositionOrBuilderList() {
    return position_;
  }
  /**
   * <pre>
   * 每一帧图像对应的所有喷洒目标点
   * </pre>
   *
   * <code>repeated .qhx.proto.weve.event.spray.SprayEventSprayTargetPoint position = 2;</code>
   */
  @Override
  public int getPositionCount() {
    return position_.size();
  }
  /**
   * <pre>
   * 每一帧图像对应的所有喷洒目标点
   * </pre>
   *
   * <code>repeated .qhx.proto.weve.event.spray.SprayEventSprayTargetPoint position = 2;</code>
   */
  @Override
  public SprayEventSprayTargetPoint getPosition(int index) {
    return position_.get(index);
  }
  /**
   * <pre>
   * 每一帧图像对应的所有喷洒目标点
   * </pre>
   *
   * <code>repeated .qhx.proto.weve.event.spray.SprayEventSprayTargetPoint position = 2;</code>
   */
  @Override
  public SprayEventSprayTargetPointOrBuilder getPositionOrBuilder(
      int index) {
    return position_.get(index);
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
    if (seq_ != 0) {
      output.writeUInt32(1, seq_);
    }
    for (int i = 0; i < position_.size(); i++) {
      output.writeMessage(2, position_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (seq_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, seq_);
    }
    for (int i = 0; i < position_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, position_.get(i));
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
    if (!(obj instanceof SprayEventSprayTargetPosition)) {
      return super.equals(obj);
    }
    SprayEventSprayTargetPosition other = (SprayEventSprayTargetPosition) obj;

    if (getSeq()
        != other.getSeq()) return false;
    if (!getPositionList()
        .equals(other.getPositionList())) return false;
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
    hash = (37 * hash) + SEQ_FIELD_NUMBER;
    hash = (53 * hash) + getSeq();
    if (getPositionCount() > 0) {
      hash = (37 * hash) + POSITION_FIELD_NUMBER;
      hash = (53 * hash) + getPositionList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static SprayEventSprayTargetPosition parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static SprayEventSprayTargetPosition parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static SprayEventSprayTargetPosition parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static SprayEventSprayTargetPosition parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static SprayEventSprayTargetPosition parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static SprayEventSprayTargetPosition parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static SprayEventSprayTargetPosition parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static SprayEventSprayTargetPosition parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static SprayEventSprayTargetPosition parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static SprayEventSprayTargetPosition parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static SprayEventSprayTargetPosition parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static SprayEventSprayTargetPosition parseFrom(
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
  public static Builder newBuilder(SprayEventSprayTargetPosition prototype) {
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
   * 喷洒目标位置
   * </pre>
   *
   * Protobuf type {@code qhx.proto.weve.event.spray.SprayEventSprayTargetPosition}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:qhx.proto.weve.event.spray.SprayEventSprayTargetPosition)
          SprayEventSprayTargetPositionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return SprayEventOuterClass.internal_static_qhx_proto_weve_event_spray_SprayEventSprayTargetPosition_descriptor;
    }

    @Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SprayEventOuterClass.internal_static_qhx_proto_weve_event_spray_SprayEventSprayTargetPosition_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SprayEventSprayTargetPosition.class, Builder.class);
    }

    // Construct using com.qhx.proto.event.SprayEventSprayTargetPosition.newBuilder()
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
        getPositionFieldBuilder();
      }
    }
    @Override
    public Builder clear() {
      super.clear();
      seq_ = 0;

      if (positionBuilder_ == null) {
        position_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        positionBuilder_.clear();
      }
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return SprayEventOuterClass.internal_static_qhx_proto_weve_event_spray_SprayEventSprayTargetPosition_descriptor;
    }

    @Override
    public SprayEventSprayTargetPosition getDefaultInstanceForType() {
      return SprayEventSprayTargetPosition.getDefaultInstance();
    }

    @Override
    public SprayEventSprayTargetPosition build() {
      SprayEventSprayTargetPosition result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public SprayEventSprayTargetPosition buildPartial() {
      SprayEventSprayTargetPosition result = new SprayEventSprayTargetPosition(this);
      int from_bitField0_ = bitField0_;
      result.seq_ = seq_;
      if (positionBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          position_ = java.util.Collections.unmodifiableList(position_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.position_ = position_;
      } else {
        result.position_ = positionBuilder_.build();
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
      if (other instanceof SprayEventSprayTargetPosition) {
        return mergeFrom((SprayEventSprayTargetPosition)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(SprayEventSprayTargetPosition other) {
      if (other == SprayEventSprayTargetPosition.getDefaultInstance()) return this;
      if (other.getSeq() != 0) {
        setSeq(other.getSeq());
      }
      if (positionBuilder_ == null) {
        if (!other.position_.isEmpty()) {
          if (position_.isEmpty()) {
            position_ = other.position_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePositionIsMutable();
            position_.addAll(other.position_);
          }
          onChanged();
        }
      } else {
        if (!other.position_.isEmpty()) {
          if (positionBuilder_.isEmpty()) {
            positionBuilder_.dispose();
            positionBuilder_ = null;
            position_ = other.position_;
            bitField0_ = (bitField0_ & ~0x00000001);
            positionBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPositionFieldBuilder() : null;
          } else {
            positionBuilder_.addAllMessages(other.position_);
          }
        }
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
      SprayEventSprayTargetPosition parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (SprayEventSprayTargetPosition) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int seq_ ;
    /**
     * <pre>
     * 帧数
     * </pre>
     *
     * <code>uint32 seq = 1;</code>
     * @return The seq.
     */
    @Override
    public int getSeq() {
      return seq_;
    }
    /**
     * <pre>
     * 帧数
     * </pre>
     *
     * <code>uint32 seq = 1;</code>
     * @param value The seq to set.
     * @return This builder for chaining.
     */
    public Builder setSeq(int value) {
      
      seq_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 帧数
     * </pre>
     *
     * <code>uint32 seq = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSeq() {
      
      seq_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<SprayEventSprayTargetPoint> position_ =
      java.util.Collections.emptyList();
    private void ensurePositionIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        position_ = new java.util.ArrayList<SprayEventSprayTargetPoint>(position_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            SprayEventSprayTargetPoint, SprayEventSprayTargetPoint.Builder, SprayEventSprayTargetPointOrBuilder> positionBuilder_;

    /**
     * <pre>
     * 每一帧图像对应的所有喷洒目标点
     * </pre>
     *
     * <code>repeated .qhx.proto.weve.event.spray.SprayEventSprayTargetPoint position = 2;</code>
     */
    public java.util.List<SprayEventSprayTargetPoint> getPositionList() {
      if (positionBuilder_ == null) {
        return java.util.Collections.unmodifiableList(position_);
      } else {
        return positionBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * 每一帧图像对应的所有喷洒目标点
     * </pre>
     *
     * <code>repeated .qhx.proto.weve.event.spray.SprayEventSprayTargetPoint position = 2;</code>
     */
    public int getPositionCount() {
      if (positionBuilder_ == null) {
        return position_.size();
      } else {
        return positionBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * 每一帧图像对应的所有喷洒目标点
     * </pre>
     *
     * <code>repeated .qhx.proto.weve.event.spray.SprayEventSprayTargetPoint position = 2;</code>
     */
    public SprayEventSprayTargetPoint getPosition(int index) {
      if (positionBuilder_ == null) {
        return position_.get(index);
      } else {
        return positionBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * 每一帧图像对应的所有喷洒目标点
     * </pre>
     *
     * <code>repeated .qhx.proto.weve.event.spray.SprayEventSprayTargetPoint position = 2;</code>
     */
    public Builder setPosition(
        int index, SprayEventSprayTargetPoint value) {
      if (positionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePositionIsMutable();
        position_.set(index, value);
        onChanged();
      } else {
        positionBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * 每一帧图像对应的所有喷洒目标点
     * </pre>
     *
     * <code>repeated .qhx.proto.weve.event.spray.SprayEventSprayTargetPoint position = 2;</code>
     */
    public Builder setPosition(
        int index, SprayEventSprayTargetPoint.Builder builderForValue) {
      if (positionBuilder_ == null) {
        ensurePositionIsMutable();
        position_.set(index, builderForValue.build());
        onChanged();
      } else {
        positionBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 每一帧图像对应的所有喷洒目标点
     * </pre>
     *
     * <code>repeated .qhx.proto.weve.event.spray.SprayEventSprayTargetPoint position = 2;</code>
     */
    public Builder addPosition(SprayEventSprayTargetPoint value) {
      if (positionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePositionIsMutable();
        position_.add(value);
        onChanged();
      } else {
        positionBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * 每一帧图像对应的所有喷洒目标点
     * </pre>
     *
     * <code>repeated .qhx.proto.weve.event.spray.SprayEventSprayTargetPoint position = 2;</code>
     */
    public Builder addPosition(
        int index, SprayEventSprayTargetPoint value) {
      if (positionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePositionIsMutable();
        position_.add(index, value);
        onChanged();
      } else {
        positionBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * 每一帧图像对应的所有喷洒目标点
     * </pre>
     *
     * <code>repeated .qhx.proto.weve.event.spray.SprayEventSprayTargetPoint position = 2;</code>
     */
    public Builder addPosition(
        SprayEventSprayTargetPoint.Builder builderForValue) {
      if (positionBuilder_ == null) {
        ensurePositionIsMutable();
        position_.add(builderForValue.build());
        onChanged();
      } else {
        positionBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 每一帧图像对应的所有喷洒目标点
     * </pre>
     *
     * <code>repeated .qhx.proto.weve.event.spray.SprayEventSprayTargetPoint position = 2;</code>
     */
    public Builder addPosition(
        int index, SprayEventSprayTargetPoint.Builder builderForValue) {
      if (positionBuilder_ == null) {
        ensurePositionIsMutable();
        position_.add(index, builderForValue.build());
        onChanged();
      } else {
        positionBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 每一帧图像对应的所有喷洒目标点
     * </pre>
     *
     * <code>repeated .qhx.proto.weve.event.spray.SprayEventSprayTargetPoint position = 2;</code>
     */
    public Builder addAllPosition(
        Iterable<? extends SprayEventSprayTargetPoint> values) {
      if (positionBuilder_ == null) {
        ensurePositionIsMutable();
        addAll(
            values, position_);
        onChanged();
      } else {
        positionBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * 每一帧图像对应的所有喷洒目标点
     * </pre>
     *
     * <code>repeated .qhx.proto.weve.event.spray.SprayEventSprayTargetPoint position = 2;</code>
     */
    public Builder clearPosition() {
      if (positionBuilder_ == null) {
        position_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        positionBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * 每一帧图像对应的所有喷洒目标点
     * </pre>
     *
     * <code>repeated .qhx.proto.weve.event.spray.SprayEventSprayTargetPoint position = 2;</code>
     */
    public Builder removePosition(int index) {
      if (positionBuilder_ == null) {
        ensurePositionIsMutable();
        position_.remove(index);
        onChanged();
      } else {
        positionBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * 每一帧图像对应的所有喷洒目标点
     * </pre>
     *
     * <code>repeated .qhx.proto.weve.event.spray.SprayEventSprayTargetPoint position = 2;</code>
     */
    public SprayEventSprayTargetPoint.Builder getPositionBuilder(
        int index) {
      return getPositionFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * 每一帧图像对应的所有喷洒目标点
     * </pre>
     *
     * <code>repeated .qhx.proto.weve.event.spray.SprayEventSprayTargetPoint position = 2;</code>
     */
    public SprayEventSprayTargetPointOrBuilder getPositionOrBuilder(
        int index) {
      if (positionBuilder_ == null) {
        return position_.get(index);  } else {
        return positionBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * 每一帧图像对应的所有喷洒目标点
     * </pre>
     *
     * <code>repeated .qhx.proto.weve.event.spray.SprayEventSprayTargetPoint position = 2;</code>
     */
    public java.util.List<? extends SprayEventSprayTargetPointOrBuilder>
         getPositionOrBuilderList() {
      if (positionBuilder_ != null) {
        return positionBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(position_);
      }
    }
    /**
     * <pre>
     * 每一帧图像对应的所有喷洒目标点
     * </pre>
     *
     * <code>repeated .qhx.proto.weve.event.spray.SprayEventSprayTargetPoint position = 2;</code>
     */
    public SprayEventSprayTargetPoint.Builder addPositionBuilder() {
      return getPositionFieldBuilder().addBuilder(
          SprayEventSprayTargetPoint.getDefaultInstance());
    }
    /**
     * <pre>
     * 每一帧图像对应的所有喷洒目标点
     * </pre>
     *
     * <code>repeated .qhx.proto.weve.event.spray.SprayEventSprayTargetPoint position = 2;</code>
     */
    public SprayEventSprayTargetPoint.Builder addPositionBuilder(
        int index) {
      return getPositionFieldBuilder().addBuilder(
          index, SprayEventSprayTargetPoint.getDefaultInstance());
    }
    /**
     * <pre>
     * 每一帧图像对应的所有喷洒目标点
     * </pre>
     *
     * <code>repeated .qhx.proto.weve.event.spray.SprayEventSprayTargetPoint position = 2;</code>
     */
    public java.util.List<SprayEventSprayTargetPoint.Builder>
         getPositionBuilderList() {
      return getPositionFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
            SprayEventSprayTargetPoint, SprayEventSprayTargetPoint.Builder, SprayEventSprayTargetPointOrBuilder>
        getPositionFieldBuilder() {
      if (positionBuilder_ == null) {
        positionBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
                SprayEventSprayTargetPoint, SprayEventSprayTargetPoint.Builder, SprayEventSprayTargetPointOrBuilder>(
                position_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        position_ = null;
      }
      return positionBuilder_;
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


    // @@protoc_insertion_point(builder_scope:qhx.proto.weve.event.spray.SprayEventSprayTargetPosition)
  }

  // @@protoc_insertion_point(class_scope:qhx.proto.weve.event.spray.SprayEventSprayTargetPosition)
  private static final SprayEventSprayTargetPosition DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new SprayEventSprayTargetPosition();
  }

  public static SprayEventSprayTargetPosition getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SprayEventSprayTargetPosition>
      PARSER = new com.google.protobuf.AbstractParser<SprayEventSprayTargetPosition>() {
    @Override
    public SprayEventSprayTargetPosition parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SprayEventSprayTargetPosition(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SprayEventSprayTargetPosition> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<SprayEventSprayTargetPosition> getParserForType() {
    return PARSER;
  }

  @Override
  public SprayEventSprayTargetPosition getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
