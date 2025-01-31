// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: action.proto

package com.qhx.proto.event;

/**
 * <pre>
 * 动作
 * </pre>
 *
 * Protobuf type {@code qhx.proto.weve.Action}
 */
public final class Action extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:qhx.proto.weve.Action)
    ActionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Action.newBuilder() to construct.
  private Action(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Action() {
    actionType_ = 0;
    options_ = com.google.protobuf.ByteString.EMPTY;
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new Action();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Action(
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
          case 16: {

            priority_ = input.readUInt32();
            break;
          }
          case 26: {
            com.google.protobuf.UInt32Value.Builder subBuilder = null;
            if (waypointIndex_ != null) {
              subBuilder = waypointIndex_.toBuilder();
            }
            waypointIndex_ = input.readMessage(com.google.protobuf.UInt32Value.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(waypointIndex_);
              waypointIndex_ = subBuilder.buildPartial();
            }

            break;
          }
          case 32: {
            int rawValue = input.readEnum();

            actionType_ = rawValue;
            break;
          }
          case 42: {

            options_ = input.readBytes();
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
    return ActionOuterClass.internal_static_qhx_proto_weve_Action_descriptor;
  }

  @Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ActionOuterClass.internal_static_qhx_proto_weve_Action_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            Action.class, Builder.class);
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

  public static final int PRIORITY_FIELD_NUMBER = 2;
  private int priority_;
  /**
   * <pre>
   * 优先级（数字越小越优先）
   * </pre>
   *
   * <code>uint32 priority = 2;</code>
   * @return The priority.
   */
  @Override
  public int getPriority() {
    return priority_;
  }

  public static final int WAYPOINT_INDEX_FIELD_NUMBER = 3;
  private com.google.protobuf.UInt32Value waypointIndex_;
  /**
   * <pre>
   * 对应的路径点，若设置即表示在此路径点执行该动作
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value waypoint_index = 3;</code>
   * @return Whether the waypointIndex field is set.
   */
  @Override
  public boolean hasWaypointIndex() {
    return waypointIndex_ != null;
  }
  /**
   * <pre>
   * 对应的路径点，若设置即表示在此路径点执行该动作
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value waypoint_index = 3;</code>
   * @return The waypointIndex.
   */
  @Override
  public com.google.protobuf.UInt32Value getWaypointIndex() {
    return waypointIndex_ == null ? com.google.protobuf.UInt32Value.getDefaultInstance() : waypointIndex_;
  }
  /**
   * <pre>
   * 对应的路径点，若设置即表示在此路径点执行该动作
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value waypoint_index = 3;</code>
   */
  @Override
  public com.google.protobuf.UInt32ValueOrBuilder getWaypointIndexOrBuilder() {
    return getWaypointIndex();
  }

  public static final int ACTION_TYPE_FIELD_NUMBER = 4;
  private int actionType_;
  /**
   * <pre>
   * 动作类型
   * </pre>
   *
   * <code>.qhx.proto.weve.ActionType action_type = 4;</code>
   * @return The enum numeric value on the wire for actionType.
   */
  @Override public int getActionTypeValue() {
    return actionType_;
  }
  /**
   * <pre>
   * 动作类型
   * </pre>
   *
   * <code>.qhx.proto.weve.ActionType action_type = 4;</code>
   * @return The actionType.
   */
  @Override public ActionType getActionType() {
    @SuppressWarnings("deprecation")
    ActionType result = ActionType.valueOf(actionType_);
    return result == null ? ActionType.UNRECOGNIZED : result;
  }

  public static final int OPTIONS_FIELD_NUMBER = 5;
  private com.google.protobuf.ByteString options_;
  /**
   * <pre>
   * 动作参数
   * </pre>
   *
   * <code>bytes options = 5;</code>
   * @return The options.
   */
  @Override
  public com.google.protobuf.ByteString getOptions() {
    return options_;
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
    if (priority_ != 0) {
      output.writeUInt32(2, priority_);
    }
    if (waypointIndex_ != null) {
      output.writeMessage(3, getWaypointIndex());
    }
    if (actionType_ != ActionType.ACTION_TYPE_UNKNOWN.getNumber()) {
      output.writeEnum(4, actionType_);
    }
    if (!options_.isEmpty()) {
      output.writeBytes(5, options_);
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
    if (priority_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, priority_);
    }
    if (waypointIndex_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getWaypointIndex());
    }
    if (actionType_ != ActionType.ACTION_TYPE_UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, actionType_);
    }
    if (!options_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(5, options_);
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
    if (!(obj instanceof Action)) {
      return super.equals(obj);
    }
    Action other = (Action) obj;

    if (getIndex()
        != other.getIndex()) return false;
    if (getPriority()
        != other.getPriority()) return false;
    if (hasWaypointIndex() != other.hasWaypointIndex()) return false;
    if (hasWaypointIndex()) {
      if (!getWaypointIndex()
          .equals(other.getWaypointIndex())) return false;
    }
    if (actionType_ != other.actionType_) return false;
    if (!getOptions()
        .equals(other.getOptions())) return false;
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
    hash = (37 * hash) + PRIORITY_FIELD_NUMBER;
    hash = (53 * hash) + getPriority();
    if (hasWaypointIndex()) {
      hash = (37 * hash) + WAYPOINT_INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getWaypointIndex().hashCode();
    }
    hash = (37 * hash) + ACTION_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + actionType_;
    hash = (37 * hash) + OPTIONS_FIELD_NUMBER;
    hash = (53 * hash) + getOptions().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static Action parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Action parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Action parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Action parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Action parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Action parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Action parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Action parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static Action parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static Action parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static Action parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Action parseFrom(
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
  public static Builder newBuilder(Action prototype) {
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
   * 动作
   * </pre>
   *
   * Protobuf type {@code qhx.proto.weve.Action}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:qhx.proto.weve.Action)
          ActionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ActionOuterClass.internal_static_qhx_proto_weve_Action_descriptor;
    }

    @Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ActionOuterClass.internal_static_qhx_proto_weve_Action_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Action.class, Builder.class);
    }

    // Construct using com.qhx.proto.event.Action.newBuilder()
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

      priority_ = 0;

      if (waypointIndexBuilder_ == null) {
        waypointIndex_ = null;
      } else {
        waypointIndex_ = null;
        waypointIndexBuilder_ = null;
      }
      actionType_ = 0;

      options_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ActionOuterClass.internal_static_qhx_proto_weve_Action_descriptor;
    }

    @Override
    public Action getDefaultInstanceForType() {
      return Action.getDefaultInstance();
    }

    @Override
    public Action build() {
      Action result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public Action buildPartial() {
      Action result = new Action(this);
      result.index_ = index_;
      result.priority_ = priority_;
      if (waypointIndexBuilder_ == null) {
        result.waypointIndex_ = waypointIndex_;
      } else {
        result.waypointIndex_ = waypointIndexBuilder_.build();
      }
      result.actionType_ = actionType_;
      result.options_ = options_;
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
      if (other instanceof Action) {
        return mergeFrom((Action)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(Action other) {
      if (other == Action.getDefaultInstance()) return this;
      if (other.getIndex() != 0) {
        setIndex(other.getIndex());
      }
      if (other.getPriority() != 0) {
        setPriority(other.getPriority());
      }
      if (other.hasWaypointIndex()) {
        mergeWaypointIndex(other.getWaypointIndex());
      }
      if (other.actionType_ != 0) {
        setActionTypeValue(other.getActionTypeValue());
      }
      if (other.getOptions() != com.google.protobuf.ByteString.EMPTY) {
        setOptions(other.getOptions());
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
      Action parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (Action) e.getUnfinishedMessage();
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

    private int priority_ ;
    /**
     * <pre>
     * 优先级（数字越小越优先）
     * </pre>
     *
     * <code>uint32 priority = 2;</code>
     * @return The priority.
     */
    @Override
    public int getPriority() {
      return priority_;
    }
    /**
     * <pre>
     * 优先级（数字越小越优先）
     * </pre>
     *
     * <code>uint32 priority = 2;</code>
     * @param value The priority to set.
     * @return This builder for chaining.
     */
    public Builder setPriority(int value) {
      
      priority_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 优先级（数字越小越优先）
     * </pre>
     *
     * <code>uint32 priority = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPriority() {
      
      priority_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.UInt32Value waypointIndex_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.UInt32Value, com.google.protobuf.UInt32Value.Builder, com.google.protobuf.UInt32ValueOrBuilder> waypointIndexBuilder_;
    /**
     * <pre>
     * 对应的路径点，若设置即表示在此路径点执行该动作
     * </pre>
     *
     * <code>.google.protobuf.UInt32Value waypoint_index = 3;</code>
     * @return Whether the waypointIndex field is set.
     */
    public boolean hasWaypointIndex() {
      return waypointIndexBuilder_ != null || waypointIndex_ != null;
    }
    /**
     * <pre>
     * 对应的路径点，若设置即表示在此路径点执行该动作
     * </pre>
     *
     * <code>.google.protobuf.UInt32Value waypoint_index = 3;</code>
     * @return The waypointIndex.
     */
    public com.google.protobuf.UInt32Value getWaypointIndex() {
      if (waypointIndexBuilder_ == null) {
        return waypointIndex_ == null ? com.google.protobuf.UInt32Value.getDefaultInstance() : waypointIndex_;
      } else {
        return waypointIndexBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 对应的路径点，若设置即表示在此路径点执行该动作
     * </pre>
     *
     * <code>.google.protobuf.UInt32Value waypoint_index = 3;</code>
     */
    public Builder setWaypointIndex(com.google.protobuf.UInt32Value value) {
      if (waypointIndexBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        waypointIndex_ = value;
        onChanged();
      } else {
        waypointIndexBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * 对应的路径点，若设置即表示在此路径点执行该动作
     * </pre>
     *
     * <code>.google.protobuf.UInt32Value waypoint_index = 3;</code>
     */
    public Builder setWaypointIndex(
        com.google.protobuf.UInt32Value.Builder builderForValue) {
      if (waypointIndexBuilder_ == null) {
        waypointIndex_ = builderForValue.build();
        onChanged();
      } else {
        waypointIndexBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * 对应的路径点，若设置即表示在此路径点执行该动作
     * </pre>
     *
     * <code>.google.protobuf.UInt32Value waypoint_index = 3;</code>
     */
    public Builder mergeWaypointIndex(com.google.protobuf.UInt32Value value) {
      if (waypointIndexBuilder_ == null) {
        if (waypointIndex_ != null) {
          waypointIndex_ =
            com.google.protobuf.UInt32Value.newBuilder(waypointIndex_).mergeFrom(value).buildPartial();
        } else {
          waypointIndex_ = value;
        }
        onChanged();
      } else {
        waypointIndexBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * 对应的路径点，若设置即表示在此路径点执行该动作
     * </pre>
     *
     * <code>.google.protobuf.UInt32Value waypoint_index = 3;</code>
     */
    public Builder clearWaypointIndex() {
      if (waypointIndexBuilder_ == null) {
        waypointIndex_ = null;
        onChanged();
      } else {
        waypointIndex_ = null;
        waypointIndexBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * 对应的路径点，若设置即表示在此路径点执行该动作
     * </pre>
     *
     * <code>.google.protobuf.UInt32Value waypoint_index = 3;</code>
     */
    public com.google.protobuf.UInt32Value.Builder getWaypointIndexBuilder() {
      
      onChanged();
      return getWaypointIndexFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 对应的路径点，若设置即表示在此路径点执行该动作
     * </pre>
     *
     * <code>.google.protobuf.UInt32Value waypoint_index = 3;</code>
     */
    public com.google.protobuf.UInt32ValueOrBuilder getWaypointIndexOrBuilder() {
      if (waypointIndexBuilder_ != null) {
        return waypointIndexBuilder_.getMessageOrBuilder();
      } else {
        return waypointIndex_ == null ?
            com.google.protobuf.UInt32Value.getDefaultInstance() : waypointIndex_;
      }
    }
    /**
     * <pre>
     * 对应的路径点，若设置即表示在此路径点执行该动作
     * </pre>
     *
     * <code>.google.protobuf.UInt32Value waypoint_index = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.UInt32Value, com.google.protobuf.UInt32Value.Builder, com.google.protobuf.UInt32ValueOrBuilder> 
        getWaypointIndexFieldBuilder() {
      if (waypointIndexBuilder_ == null) {
        waypointIndexBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.UInt32Value, com.google.protobuf.UInt32Value.Builder, com.google.protobuf.UInt32ValueOrBuilder>(
                getWaypointIndex(),
                getParentForChildren(),
                isClean());
        waypointIndex_ = null;
      }
      return waypointIndexBuilder_;
    }

    private int actionType_ = 0;
    /**
     * <pre>
     * 动作类型
     * </pre>
     *
     * <code>.qhx.proto.weve.ActionType action_type = 4;</code>
     * @return The enum numeric value on the wire for actionType.
     */
    @Override public int getActionTypeValue() {
      return actionType_;
    }
    /**
     * <pre>
     * 动作类型
     * </pre>
     *
     * <code>.qhx.proto.weve.ActionType action_type = 4;</code>
     * @param value The enum numeric value on the wire for actionType to set.
     * @return This builder for chaining.
     */
    public Builder setActionTypeValue(int value) {
      
      actionType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 动作类型
     * </pre>
     *
     * <code>.qhx.proto.weve.ActionType action_type = 4;</code>
     * @return The actionType.
     */
    @Override
    public ActionType getActionType() {
      @SuppressWarnings("deprecation")
      ActionType result = ActionType.valueOf(actionType_);
      return result == null ? ActionType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * 动作类型
     * </pre>
     *
     * <code>.qhx.proto.weve.ActionType action_type = 4;</code>
     * @param value The actionType to set.
     * @return This builder for chaining.
     */
    public Builder setActionType(ActionType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      actionType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 动作类型
     * </pre>
     *
     * <code>.qhx.proto.weve.ActionType action_type = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearActionType() {
      
      actionType_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString options_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * 动作参数
     * </pre>
     *
     * <code>bytes options = 5;</code>
     * @return The options.
     */
    @Override
    public com.google.protobuf.ByteString getOptions() {
      return options_;
    }
    /**
     * <pre>
     * 动作参数
     * </pre>
     *
     * <code>bytes options = 5;</code>
     * @param value The options to set.
     * @return This builder for chaining.
     */
    public Builder setOptions(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      options_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 动作参数
     * </pre>
     *
     * <code>bytes options = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearOptions() {
      
      options_ = getDefaultInstance().getOptions();
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:qhx.proto.weve.Action)
  }

  // @@protoc_insertion_point(class_scope:qhx.proto.weve.Action)
  private static final Action DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Action();
  }

  public static Action getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Action>
      PARSER = new com.google.protobuf.AbstractParser<Action>() {
    @Override
    public Action parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Action(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Action> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<Action> getParserForType() {
    return PARSER;
  }

  @Override
  public Action getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

