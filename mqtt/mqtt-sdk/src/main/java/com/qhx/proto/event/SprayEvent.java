// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: spray_event.proto

package com.qhx.proto.event;

/**
 * <pre>
 * 喷洒事件
 * </pre>
 *
 * Protobuf type {@code qhx.proto.weve.event.spray.SprayEvent}
 */
public final class SprayEvent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:qhx.proto.weve.event.spray.SprayEvent)
    SprayEventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SprayEvent.newBuilder() to construct.
  private SprayEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SprayEvent() {
    type_ = 0;
    eventBody_ = com.google.protobuf.ByteString.EMPTY;
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new SprayEvent();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SprayEvent(
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
            int rawValue = input.readEnum();

            type_ = rawValue;
            break;
          }
          case 18: {

            eventBody_ = input.readBytes();
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
    return SprayEventOuterClass.internal_static_qhx_proto_weve_event_spray_SprayEvent_descriptor;
  }

  @Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return SprayEventOuterClass.internal_static_qhx_proto_weve_event_spray_SprayEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            SprayEvent.class, Builder.class);
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_;
  /**
   * <code>.qhx.proto.weve.event.spray.SprayEventType type = 1;</code>
   * @return The enum numeric value on the wire for type.
   */
  @Override public int getTypeValue() {
    return type_;
  }
  /**
   * <code>.qhx.proto.weve.event.spray.SprayEventType type = 1;</code>
   * @return The type.
   */
  @Override public SprayEventType getType() {
    @SuppressWarnings("deprecation")
    SprayEventType result = SprayEventType.valueOf(type_);
    return result == null ? SprayEventType.UNRECOGNIZED : result;
  }

  public static final int EVENT_BODY_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString eventBody_;
  /**
   * <pre>
   * error message可以放在Event中
   * </pre>
   *
   * <code>bytes event_body = 2;</code>
   * @return The eventBody.
   */
  @Override
  public com.google.protobuf.ByteString getEventBody() {
    return eventBody_;
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
    if (type_ != SprayEventType.SPRAY_EVENT_TYPE_UNKNOWN.getNumber()) {
      output.writeEnum(1, type_);
    }
    if (!eventBody_.isEmpty()) {
      output.writeBytes(2, eventBody_);
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (type_ != SprayEventType.SPRAY_EVENT_TYPE_UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, type_);
    }
    if (!eventBody_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, eventBody_);
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
    if (!(obj instanceof SprayEvent)) {
      return super.equals(obj);
    }
    SprayEvent other = (SprayEvent) obj;

    if (type_ != other.type_) return false;
    if (!getEventBody()
        .equals(other.getEventBody())) return false;
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
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (37 * hash) + EVENT_BODY_FIELD_NUMBER;
    hash = (53 * hash) + getEventBody().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static SprayEvent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static SprayEvent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static SprayEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static SprayEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static SprayEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static SprayEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static SprayEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static SprayEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static SprayEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static SprayEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static SprayEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static SprayEvent parseFrom(
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
  public static Builder newBuilder(SprayEvent prototype) {
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
   * 喷洒事件
   * </pre>
   *
   * Protobuf type {@code qhx.proto.weve.event.spray.SprayEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:qhx.proto.weve.event.spray.SprayEvent)
          SprayEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return SprayEventOuterClass.internal_static_qhx_proto_weve_event_spray_SprayEvent_descriptor;
    }

    @Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SprayEventOuterClass.internal_static_qhx_proto_weve_event_spray_SprayEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SprayEvent.class, Builder.class);
    }

    // Construct using com.qhx.proto.event.SprayEvent.newBuilder()
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
      type_ = 0;

      eventBody_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return SprayEventOuterClass.internal_static_qhx_proto_weve_event_spray_SprayEvent_descriptor;
    }

    @Override
    public SprayEvent getDefaultInstanceForType() {
      return SprayEvent.getDefaultInstance();
    }

    @Override
    public SprayEvent build() {
      SprayEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public SprayEvent buildPartial() {
      SprayEvent result = new SprayEvent(this);
      result.type_ = type_;
      result.eventBody_ = eventBody_;
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
      if (other instanceof SprayEvent) {
        return mergeFrom((SprayEvent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(SprayEvent other) {
      if (other == SprayEvent.getDefaultInstance()) return this;
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (other.getEventBody() != com.google.protobuf.ByteString.EMPTY) {
        setEventBody(other.getEventBody());
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
      SprayEvent parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (SprayEvent) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int type_ = 0;
    /**
     * <code>.qhx.proto.weve.event.spray.SprayEventType type = 1;</code>
     * @return The enum numeric value on the wire for type.
     */
    @Override public int getTypeValue() {
      return type_;
    }
    /**
     * <code>.qhx.proto.weve.event.spray.SprayEventType type = 1;</code>
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {
      
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.qhx.proto.weve.event.spray.SprayEventType type = 1;</code>
     * @return The type.
     */
    @Override
    public SprayEventType getType() {
      @SuppressWarnings("deprecation")
      SprayEventType result = SprayEventType.valueOf(type_);
      return result == null ? SprayEventType.UNRECOGNIZED : result;
    }
    /**
     * <code>.qhx.proto.weve.event.spray.SprayEventType type = 1;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(SprayEventType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.qhx.proto.weve.event.spray.SprayEventType type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      
      type_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString eventBody_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * error message可以放在Event中
     * </pre>
     *
     * <code>bytes event_body = 2;</code>
     * @return The eventBody.
     */
    @Override
    public com.google.protobuf.ByteString getEventBody() {
      return eventBody_;
    }
    /**
     * <pre>
     * error message可以放在Event中
     * </pre>
     *
     * <code>bytes event_body = 2;</code>
     * @param value The eventBody to set.
     * @return This builder for chaining.
     */
    public Builder setEventBody(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      eventBody_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * error message可以放在Event中
     * </pre>
     *
     * <code>bytes event_body = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEventBody() {
      
      eventBody_ = getDefaultInstance().getEventBody();
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


    // @@protoc_insertion_point(builder_scope:qhx.proto.weve.event.spray.SprayEvent)
  }

  // @@protoc_insertion_point(class_scope:qhx.proto.weve.event.spray.SprayEvent)
  private static final SprayEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new SprayEvent();
  }

  public static SprayEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SprayEvent>
      PARSER = new com.google.protobuf.AbstractParser<SprayEvent>() {
    @Override
    public SprayEvent parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SprayEvent(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SprayEvent> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<SprayEvent> getParserForType() {
    return PARSER;
  }

  @Override
  public SprayEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

