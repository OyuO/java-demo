// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: trigger.proto

package com.qhx.proto.event;

/**
 * <pre>
 * 触发器
 * </pre>
 *
 * Protobuf type {@code qhx.proto.weve.Trigger}
 */
public final class Trigger extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:qhx.proto.weve.Trigger)
    TriggerOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Trigger.newBuilder() to construct.
  private Trigger(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Trigger() {
    triggerType_ = 0;
    options_ = com.google.protobuf.ByteString.EMPTY;
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new Trigger();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Trigger(
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
            com.google.protobuf.UInt32Value.Builder subBuilder = null;
            if (actionIndex_ != null) {
              subBuilder = actionIndex_.toBuilder();
            }
            actionIndex_ = input.readMessage(com.google.protobuf.UInt32Value.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(actionIndex_);
              actionIndex_ = subBuilder.buildPartial();
            }

            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            triggerType_ = rawValue;
            break;
          }
          case 34: {

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
    return TriggerOuterClass.internal_static_qhx_proto_weve_Trigger_descriptor;
  }

  @Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return TriggerOuterClass.internal_static_qhx_proto_weve_Trigger_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            Trigger.class, Builder.class);
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

  public static final int ACTION_INDEX_FIELD_NUMBER = 2;
  private com.google.protobuf.UInt32Value actionIndex_;
  /**
   * <pre>
   * 对应的动作索引，若设置即表示该触发器触发时执行该动作
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value action_index = 2;</code>
   * @return Whether the actionIndex field is set.
   */
  @Override
  public boolean hasActionIndex() {
    return actionIndex_ != null;
  }
  /**
   * <pre>
   * 对应的动作索引，若设置即表示该触发器触发时执行该动作
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value action_index = 2;</code>
   * @return The actionIndex.
   */
  @Override
  public com.google.protobuf.UInt32Value getActionIndex() {
    return actionIndex_ == null ? com.google.protobuf.UInt32Value.getDefaultInstance() : actionIndex_;
  }
  /**
   * <pre>
   * 对应的动作索引，若设置即表示该触发器触发时执行该动作
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value action_index = 2;</code>
   */
  @Override
  public com.google.protobuf.UInt32ValueOrBuilder getActionIndexOrBuilder() {
    return getActionIndex();
  }

  public static final int TRIGGER_TYPE_FIELD_NUMBER = 3;
  private int triggerType_;
  /**
   * <pre>
   * 触发器类型
   * </pre>
   *
   * <code>.qhx.proto.weve.TriggerType trigger_type = 3;</code>
   * @return The enum numeric value on the wire for triggerType.
   */
  @Override public int getTriggerTypeValue() {
    return triggerType_;
  }
  /**
   * <pre>
   * 触发器类型
   * </pre>
   *
   * <code>.qhx.proto.weve.TriggerType trigger_type = 3;</code>
   * @return The triggerType.
   */
  @Override public TriggerType getTriggerType() {
    @SuppressWarnings("deprecation")
    TriggerType result = TriggerType.valueOf(triggerType_);
    return result == null ? TriggerType.UNRECOGNIZED : result;
  }

  public static final int OPTIONS_FIELD_NUMBER = 4;
  private com.google.protobuf.ByteString options_;
  /**
   * <pre>
   * 触发器参数
   * </pre>
   *
   * <code>bytes options = 4;</code>
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
    if (actionIndex_ != null) {
      output.writeMessage(2, getActionIndex());
    }
    if (triggerType_ != TriggerType.TRIGGER_TYPE_UNKNOWN.getNumber()) {
      output.writeEnum(3, triggerType_);
    }
    if (!options_.isEmpty()) {
      output.writeBytes(4, options_);
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
    if (actionIndex_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getActionIndex());
    }
    if (triggerType_ != TriggerType.TRIGGER_TYPE_UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, triggerType_);
    }
    if (!options_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(4, options_);
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
    if (!(obj instanceof Trigger)) {
      return super.equals(obj);
    }
    Trigger other = (Trigger) obj;

    if (getIndex()
        != other.getIndex()) return false;
    if (hasActionIndex() != other.hasActionIndex()) return false;
    if (hasActionIndex()) {
      if (!getActionIndex()
          .equals(other.getActionIndex())) return false;
    }
    if (triggerType_ != other.triggerType_) return false;
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
    if (hasActionIndex()) {
      hash = (37 * hash) + ACTION_INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getActionIndex().hashCode();
    }
    hash = (37 * hash) + TRIGGER_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + triggerType_;
    hash = (37 * hash) + OPTIONS_FIELD_NUMBER;
    hash = (53 * hash) + getOptions().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static Trigger parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Trigger parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Trigger parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Trigger parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Trigger parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Trigger parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Trigger parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Trigger parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static Trigger parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static Trigger parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static Trigger parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Trigger parseFrom(
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
  public static Builder newBuilder(Trigger prototype) {
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
   * 触发器
   * </pre>
   *
   * Protobuf type {@code qhx.proto.weve.Trigger}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:qhx.proto.weve.Trigger)
          TriggerOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return TriggerOuterClass.internal_static_qhx_proto_weve_Trigger_descriptor;
    }

    @Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return TriggerOuterClass.internal_static_qhx_proto_weve_Trigger_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Trigger.class, Builder.class);
    }

    // Construct using com.qhx.proto.event.Trigger.newBuilder()
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

      if (actionIndexBuilder_ == null) {
        actionIndex_ = null;
      } else {
        actionIndex_ = null;
        actionIndexBuilder_ = null;
      }
      triggerType_ = 0;

      options_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return TriggerOuterClass.internal_static_qhx_proto_weve_Trigger_descriptor;
    }

    @Override
    public Trigger getDefaultInstanceForType() {
      return Trigger.getDefaultInstance();
    }

    @Override
    public Trigger build() {
      Trigger result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public Trigger buildPartial() {
      Trigger result = new Trigger(this);
      result.index_ = index_;
      if (actionIndexBuilder_ == null) {
        result.actionIndex_ = actionIndex_;
      } else {
        result.actionIndex_ = actionIndexBuilder_.build();
      }
      result.triggerType_ = triggerType_;
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
      if (other instanceof Trigger) {
        return mergeFrom((Trigger)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(Trigger other) {
      if (other == Trigger.getDefaultInstance()) return this;
      if (other.getIndex() != 0) {
        setIndex(other.getIndex());
      }
      if (other.hasActionIndex()) {
        mergeActionIndex(other.getActionIndex());
      }
      if (other.triggerType_ != 0) {
        setTriggerTypeValue(other.getTriggerTypeValue());
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
      Trigger parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (Trigger) e.getUnfinishedMessage();
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

    private com.google.protobuf.UInt32Value actionIndex_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.UInt32Value, com.google.protobuf.UInt32Value.Builder, com.google.protobuf.UInt32ValueOrBuilder> actionIndexBuilder_;
    /**
     * <pre>
     * 对应的动作索引，若设置即表示该触发器触发时执行该动作
     * </pre>
     *
     * <code>.google.protobuf.UInt32Value action_index = 2;</code>
     * @return Whether the actionIndex field is set.
     */
    public boolean hasActionIndex() {
      return actionIndexBuilder_ != null || actionIndex_ != null;
    }
    /**
     * <pre>
     * 对应的动作索引，若设置即表示该触发器触发时执行该动作
     * </pre>
     *
     * <code>.google.protobuf.UInt32Value action_index = 2;</code>
     * @return The actionIndex.
     */
    public com.google.protobuf.UInt32Value getActionIndex() {
      if (actionIndexBuilder_ == null) {
        return actionIndex_ == null ? com.google.protobuf.UInt32Value.getDefaultInstance() : actionIndex_;
      } else {
        return actionIndexBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 对应的动作索引，若设置即表示该触发器触发时执行该动作
     * </pre>
     *
     * <code>.google.protobuf.UInt32Value action_index = 2;</code>
     */
    public Builder setActionIndex(com.google.protobuf.UInt32Value value) {
      if (actionIndexBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        actionIndex_ = value;
        onChanged();
      } else {
        actionIndexBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * 对应的动作索引，若设置即表示该触发器触发时执行该动作
     * </pre>
     *
     * <code>.google.protobuf.UInt32Value action_index = 2;</code>
     */
    public Builder setActionIndex(
        com.google.protobuf.UInt32Value.Builder builderForValue) {
      if (actionIndexBuilder_ == null) {
        actionIndex_ = builderForValue.build();
        onChanged();
      } else {
        actionIndexBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * 对应的动作索引，若设置即表示该触发器触发时执行该动作
     * </pre>
     *
     * <code>.google.protobuf.UInt32Value action_index = 2;</code>
     */
    public Builder mergeActionIndex(com.google.protobuf.UInt32Value value) {
      if (actionIndexBuilder_ == null) {
        if (actionIndex_ != null) {
          actionIndex_ =
            com.google.protobuf.UInt32Value.newBuilder(actionIndex_).mergeFrom(value).buildPartial();
        } else {
          actionIndex_ = value;
        }
        onChanged();
      } else {
        actionIndexBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * 对应的动作索引，若设置即表示该触发器触发时执行该动作
     * </pre>
     *
     * <code>.google.protobuf.UInt32Value action_index = 2;</code>
     */
    public Builder clearActionIndex() {
      if (actionIndexBuilder_ == null) {
        actionIndex_ = null;
        onChanged();
      } else {
        actionIndex_ = null;
        actionIndexBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * 对应的动作索引，若设置即表示该触发器触发时执行该动作
     * </pre>
     *
     * <code>.google.protobuf.UInt32Value action_index = 2;</code>
     */
    public com.google.protobuf.UInt32Value.Builder getActionIndexBuilder() {
      
      onChanged();
      return getActionIndexFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 对应的动作索引，若设置即表示该触发器触发时执行该动作
     * </pre>
     *
     * <code>.google.protobuf.UInt32Value action_index = 2;</code>
     */
    public com.google.protobuf.UInt32ValueOrBuilder getActionIndexOrBuilder() {
      if (actionIndexBuilder_ != null) {
        return actionIndexBuilder_.getMessageOrBuilder();
      } else {
        return actionIndex_ == null ?
            com.google.protobuf.UInt32Value.getDefaultInstance() : actionIndex_;
      }
    }
    /**
     * <pre>
     * 对应的动作索引，若设置即表示该触发器触发时执行该动作
     * </pre>
     *
     * <code>.google.protobuf.UInt32Value action_index = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.UInt32Value, com.google.protobuf.UInt32Value.Builder, com.google.protobuf.UInt32ValueOrBuilder> 
        getActionIndexFieldBuilder() {
      if (actionIndexBuilder_ == null) {
        actionIndexBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.UInt32Value, com.google.protobuf.UInt32Value.Builder, com.google.protobuf.UInt32ValueOrBuilder>(
                getActionIndex(),
                getParentForChildren(),
                isClean());
        actionIndex_ = null;
      }
      return actionIndexBuilder_;
    }

    private int triggerType_ = 0;
    /**
     * <pre>
     * 触发器类型
     * </pre>
     *
     * <code>.qhx.proto.weve.TriggerType trigger_type = 3;</code>
     * @return The enum numeric value on the wire for triggerType.
     */
    @Override public int getTriggerTypeValue() {
      return triggerType_;
    }
    /**
     * <pre>
     * 触发器类型
     * </pre>
     *
     * <code>.qhx.proto.weve.TriggerType trigger_type = 3;</code>
     * @param value The enum numeric value on the wire for triggerType to set.
     * @return This builder for chaining.
     */
    public Builder setTriggerTypeValue(int value) {
      
      triggerType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 触发器类型
     * </pre>
     *
     * <code>.qhx.proto.weve.TriggerType trigger_type = 3;</code>
     * @return The triggerType.
     */
    @Override
    public TriggerType getTriggerType() {
      @SuppressWarnings("deprecation")
      TriggerType result = TriggerType.valueOf(triggerType_);
      return result == null ? TriggerType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * 触发器类型
     * </pre>
     *
     * <code>.qhx.proto.weve.TriggerType trigger_type = 3;</code>
     * @param value The triggerType to set.
     * @return This builder for chaining.
     */
    public Builder setTriggerType(TriggerType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      triggerType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 触发器类型
     * </pre>
     *
     * <code>.qhx.proto.weve.TriggerType trigger_type = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTriggerType() {
      
      triggerType_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString options_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * 触发器参数
     * </pre>
     *
     * <code>bytes options = 4;</code>
     * @return The options.
     */
    @Override
    public com.google.protobuf.ByteString getOptions() {
      return options_;
    }
    /**
     * <pre>
     * 触发器参数
     * </pre>
     *
     * <code>bytes options = 4;</code>
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
     * 触发器参数
     * </pre>
     *
     * <code>bytes options = 4;</code>
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


    // @@protoc_insertion_point(builder_scope:qhx.proto.weve.Trigger)
  }

  // @@protoc_insertion_point(class_scope:qhx.proto.weve.Trigger)
  private static final Trigger DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Trigger();
  }

  public static Trigger getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Trigger>
      PARSER = new com.google.protobuf.AbstractParser<Trigger>() {
    @Override
    public Trigger parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Trigger(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Trigger> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<Trigger> getParserForType() {
    return PARSER;
  }

  @Override
  public Trigger getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

