// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: action.proto

package com.qhx.proto.event;

/**
 * <pre>
 * 下发gps数据点参数
 * </pre>
 *
 * Protobuf type {@code qhx.proto.weve.ActionDispatchGPSPoint}
 */
public final class ActionDispatchGPSPoint extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:qhx.proto.weve.ActionDispatchGPSPoint)
    ActionDispatchGPSPointOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ActionDispatchGPSPoint.newBuilder() to construct.
  private ActionDispatchGPSPoint(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ActionDispatchGPSPoint() {
    posLla_ = java.util.Collections.emptyList();
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new ActionDispatchGPSPoint();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ActionDispatchGPSPoint(
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              posLla_ = new java.util.ArrayList<Point>();
              mutable_bitField0_ |= 0x00000001;
            }
            posLla_.add(
                input.readMessage(Point.parser(), extensionRegistry));
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
        posLla_ = java.util.Collections.unmodifiableList(posLla_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ActionOuterClass.internal_static_qhx_proto_weve_ActionDispatchGPSPoint_descriptor;
  }

  @Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ActionOuterClass.internal_static_qhx_proto_weve_ActionDispatchGPSPoint_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ActionDispatchGPSPoint.class, Builder.class);
  }

  public static final int POS_LLA_FIELD_NUMBER = 1;
  private java.util.List<Point> posLla_;
  /**
   * <code>repeated .qhx.proto.weve.Point pos_lla = 1;</code>
   */
  @Override
  public java.util.List<Point> getPosLlaList() {
    return posLla_;
  }
  /**
   * <code>repeated .qhx.proto.weve.Point pos_lla = 1;</code>
   */
  @Override
  public java.util.List<? extends PointOrBuilder>
      getPosLlaOrBuilderList() {
    return posLla_;
  }
  /**
   * <code>repeated .qhx.proto.weve.Point pos_lla = 1;</code>
   */
  @Override
  public int getPosLlaCount() {
    return posLla_.size();
  }
  /**
   * <code>repeated .qhx.proto.weve.Point pos_lla = 1;</code>
   */
  @Override
  public Point getPosLla(int index) {
    return posLla_.get(index);
  }
  /**
   * <code>repeated .qhx.proto.weve.Point pos_lla = 1;</code>
   */
  @Override
  public PointOrBuilder getPosLlaOrBuilder(
      int index) {
    return posLla_.get(index);
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
    for (int i = 0; i < posLla_.size(); i++) {
      output.writeMessage(1, posLla_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < posLla_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, posLla_.get(i));
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
    if (!(obj instanceof ActionDispatchGPSPoint)) {
      return super.equals(obj);
    }
    ActionDispatchGPSPoint other = (ActionDispatchGPSPoint) obj;

    if (!getPosLlaList()
        .equals(other.getPosLlaList())) return false;
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
    if (getPosLlaCount() > 0) {
      hash = (37 * hash) + POS_LLA_FIELD_NUMBER;
      hash = (53 * hash) + getPosLlaList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ActionDispatchGPSPoint parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ActionDispatchGPSPoint parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ActionDispatchGPSPoint parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ActionDispatchGPSPoint parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ActionDispatchGPSPoint parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ActionDispatchGPSPoint parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ActionDispatchGPSPoint parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ActionDispatchGPSPoint parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ActionDispatchGPSPoint parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ActionDispatchGPSPoint parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ActionDispatchGPSPoint parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ActionDispatchGPSPoint parseFrom(
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
  public static Builder newBuilder(ActionDispatchGPSPoint prototype) {
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
   * 下发gps数据点参数
   * </pre>
   *
   * Protobuf type {@code qhx.proto.weve.ActionDispatchGPSPoint}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:qhx.proto.weve.ActionDispatchGPSPoint)
          ActionDispatchGPSPointOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ActionOuterClass.internal_static_qhx_proto_weve_ActionDispatchGPSPoint_descriptor;
    }

    @Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ActionOuterClass.internal_static_qhx_proto_weve_ActionDispatchGPSPoint_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ActionDispatchGPSPoint.class, Builder.class);
    }

    // Construct using com.qhx.proto.event.ActionDispatchGPSPoint.newBuilder()
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
        getPosLlaFieldBuilder();
      }
    }
    @Override
    public Builder clear() {
      super.clear();
      if (posLlaBuilder_ == null) {
        posLla_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        posLlaBuilder_.clear();
      }
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ActionOuterClass.internal_static_qhx_proto_weve_ActionDispatchGPSPoint_descriptor;
    }

    @Override
    public ActionDispatchGPSPoint getDefaultInstanceForType() {
      return ActionDispatchGPSPoint.getDefaultInstance();
    }

    @Override
    public ActionDispatchGPSPoint build() {
      ActionDispatchGPSPoint result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public ActionDispatchGPSPoint buildPartial() {
      ActionDispatchGPSPoint result = new ActionDispatchGPSPoint(this);
      int from_bitField0_ = bitField0_;
      if (posLlaBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          posLla_ = java.util.Collections.unmodifiableList(posLla_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.posLla_ = posLla_;
      } else {
        result.posLla_ = posLlaBuilder_.build();
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
      if (other instanceof ActionDispatchGPSPoint) {
        return mergeFrom((ActionDispatchGPSPoint)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ActionDispatchGPSPoint other) {
      if (other == ActionDispatchGPSPoint.getDefaultInstance()) return this;
      if (posLlaBuilder_ == null) {
        if (!other.posLla_.isEmpty()) {
          if (posLla_.isEmpty()) {
            posLla_ = other.posLla_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePosLlaIsMutable();
            posLla_.addAll(other.posLla_);
          }
          onChanged();
        }
      } else {
        if (!other.posLla_.isEmpty()) {
          if (posLlaBuilder_.isEmpty()) {
            posLlaBuilder_.dispose();
            posLlaBuilder_ = null;
            posLla_ = other.posLla_;
            bitField0_ = (bitField0_ & ~0x00000001);
            posLlaBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPosLlaFieldBuilder() : null;
          } else {
            posLlaBuilder_.addAllMessages(other.posLla_);
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
      ActionDispatchGPSPoint parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ActionDispatchGPSPoint) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<Point> posLla_ =
      java.util.Collections.emptyList();
    private void ensurePosLlaIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        posLla_ = new java.util.ArrayList<Point>(posLla_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            Point, Point.Builder, PointOrBuilder> posLlaBuilder_;

    /**
     * <code>repeated .qhx.proto.weve.Point pos_lla = 1;</code>
     */
    public java.util.List<Point> getPosLlaList() {
      if (posLlaBuilder_ == null) {
        return java.util.Collections.unmodifiableList(posLla_);
      } else {
        return posLlaBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .qhx.proto.weve.Point pos_lla = 1;</code>
     */
    public int getPosLlaCount() {
      if (posLlaBuilder_ == null) {
        return posLla_.size();
      } else {
        return posLlaBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .qhx.proto.weve.Point pos_lla = 1;</code>
     */
    public Point getPosLla(int index) {
      if (posLlaBuilder_ == null) {
        return posLla_.get(index);
      } else {
        return posLlaBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .qhx.proto.weve.Point pos_lla = 1;</code>
     */
    public Builder setPosLla(
        int index, Point value) {
      if (posLlaBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePosLlaIsMutable();
        posLla_.set(index, value);
        onChanged();
      } else {
        posLlaBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .qhx.proto.weve.Point pos_lla = 1;</code>
     */
    public Builder setPosLla(
        int index, Point.Builder builderForValue) {
      if (posLlaBuilder_ == null) {
        ensurePosLlaIsMutable();
        posLla_.set(index, builderForValue.build());
        onChanged();
      } else {
        posLlaBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .qhx.proto.weve.Point pos_lla = 1;</code>
     */
    public Builder addPosLla(Point value) {
      if (posLlaBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePosLlaIsMutable();
        posLla_.add(value);
        onChanged();
      } else {
        posLlaBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .qhx.proto.weve.Point pos_lla = 1;</code>
     */
    public Builder addPosLla(
        int index, Point value) {
      if (posLlaBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePosLlaIsMutable();
        posLla_.add(index, value);
        onChanged();
      } else {
        posLlaBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .qhx.proto.weve.Point pos_lla = 1;</code>
     */
    public Builder addPosLla(
        Point.Builder builderForValue) {
      if (posLlaBuilder_ == null) {
        ensurePosLlaIsMutable();
        posLla_.add(builderForValue.build());
        onChanged();
      } else {
        posLlaBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .qhx.proto.weve.Point pos_lla = 1;</code>
     */
    public Builder addPosLla(
        int index, Point.Builder builderForValue) {
      if (posLlaBuilder_ == null) {
        ensurePosLlaIsMutable();
        posLla_.add(index, builderForValue.build());
        onChanged();
      } else {
        posLlaBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .qhx.proto.weve.Point pos_lla = 1;</code>
     */
    public Builder addAllPosLla(
        Iterable<? extends Point> values) {
      if (posLlaBuilder_ == null) {
        ensurePosLlaIsMutable();
        addAll(
            values, posLla_);
        onChanged();
      } else {
        posLlaBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .qhx.proto.weve.Point pos_lla = 1;</code>
     */
    public Builder clearPosLla() {
      if (posLlaBuilder_ == null) {
        posLla_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        posLlaBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .qhx.proto.weve.Point pos_lla = 1;</code>
     */
    public Builder removePosLla(int index) {
      if (posLlaBuilder_ == null) {
        ensurePosLlaIsMutable();
        posLla_.remove(index);
        onChanged();
      } else {
        posLlaBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .qhx.proto.weve.Point pos_lla = 1;</code>
     */
    public Point.Builder getPosLlaBuilder(
        int index) {
      return getPosLlaFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .qhx.proto.weve.Point pos_lla = 1;</code>
     */
    public PointOrBuilder getPosLlaOrBuilder(
        int index) {
      if (posLlaBuilder_ == null) {
        return posLla_.get(index);  } else {
        return posLlaBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .qhx.proto.weve.Point pos_lla = 1;</code>
     */
    public java.util.List<? extends PointOrBuilder>
         getPosLlaOrBuilderList() {
      if (posLlaBuilder_ != null) {
        return posLlaBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(posLla_);
      }
    }
    /**
     * <code>repeated .qhx.proto.weve.Point pos_lla = 1;</code>
     */
    public Point.Builder addPosLlaBuilder() {
      return getPosLlaFieldBuilder().addBuilder(
          Point.getDefaultInstance());
    }
    /**
     * <code>repeated .qhx.proto.weve.Point pos_lla = 1;</code>
     */
    public Point.Builder addPosLlaBuilder(
        int index) {
      return getPosLlaFieldBuilder().addBuilder(
          index, Point.getDefaultInstance());
    }
    /**
     * <code>repeated .qhx.proto.weve.Point pos_lla = 1;</code>
     */
    public java.util.List<Point.Builder>
         getPosLlaBuilderList() {
      return getPosLlaFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
            Point, Point.Builder, PointOrBuilder>
        getPosLlaFieldBuilder() {
      if (posLlaBuilder_ == null) {
        posLlaBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
                Point, Point.Builder, PointOrBuilder>(
                posLla_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        posLla_ = null;
      }
      return posLlaBuilder_;
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


    // @@protoc_insertion_point(builder_scope:qhx.proto.weve.ActionDispatchGPSPoint)
  }

  // @@protoc_insertion_point(class_scope:qhx.proto.weve.ActionDispatchGPSPoint)
  private static final ActionDispatchGPSPoint DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ActionDispatchGPSPoint();
  }

  public static ActionDispatchGPSPoint getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ActionDispatchGPSPoint>
      PARSER = new com.google.protobuf.AbstractParser<ActionDispatchGPSPoint>() {
    @Override
    public ActionDispatchGPSPoint parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ActionDispatchGPSPoint(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ActionDispatchGPSPoint> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<ActionDispatchGPSPoint> getParserForType() {
    return PARSER;
  }

  @Override
  public ActionDispatchGPSPoint getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

