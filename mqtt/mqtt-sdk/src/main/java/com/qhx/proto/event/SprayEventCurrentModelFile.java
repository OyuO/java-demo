// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: spray_event.proto

package com.qhx.proto.event;

/**
 * <pre>
 * 当前使用模型消息
 * </pre>
 *
 * Protobuf type {@code qhx.proto.weve.event.spray.SprayEventCurrentModelFile}
 */
public final class SprayEventCurrentModelFile extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:qhx.proto.weve.event.spray.SprayEventCurrentModelFile)
    SprayEventCurrentModelFileOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SprayEventCurrentModelFile.newBuilder() to construct.
  private SprayEventCurrentModelFile(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SprayEventCurrentModelFile() {
    modelFile_ = "";
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new SprayEventCurrentModelFile();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SprayEventCurrentModelFile(
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
          case 10: {
            String s = input.readStringRequireUtf8();

            modelFile_ = s;
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
    return SprayEventOuterClass.internal_static_qhx_proto_weve_event_spray_SprayEventCurrentModelFile_descriptor;
  }

  @Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return SprayEventOuterClass.internal_static_qhx_proto_weve_event_spray_SprayEventCurrentModelFile_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            SprayEventCurrentModelFile.class, Builder.class);
  }

  public static final int MODEL_FILE_FIELD_NUMBER = 1;
  private volatile Object modelFile_;
  /**
   * <code>string model_file = 1;</code>
   * @return The modelFile.
   */
  @Override
  public String getModelFile() {
    Object ref = modelFile_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      modelFile_ = s;
      return s;
    }
  }
  /**
   * <code>string model_file = 1;</code>
   * @return The bytes for modelFile.
   */
  @Override
  public com.google.protobuf.ByteString
      getModelFileBytes() {
    Object ref = modelFile_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      modelFile_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getModelFileBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, modelFile_);
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getModelFileBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, modelFile_);
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
    if (!(obj instanceof SprayEventCurrentModelFile)) {
      return super.equals(obj);
    }
    SprayEventCurrentModelFile other = (SprayEventCurrentModelFile) obj;

    if (!getModelFile()
        .equals(other.getModelFile())) return false;
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
    hash = (37 * hash) + MODEL_FILE_FIELD_NUMBER;
    hash = (53 * hash) + getModelFile().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static SprayEventCurrentModelFile parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static SprayEventCurrentModelFile parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static SprayEventCurrentModelFile parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static SprayEventCurrentModelFile parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static SprayEventCurrentModelFile parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static SprayEventCurrentModelFile parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static SprayEventCurrentModelFile parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static SprayEventCurrentModelFile parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static SprayEventCurrentModelFile parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static SprayEventCurrentModelFile parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static SprayEventCurrentModelFile parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static SprayEventCurrentModelFile parseFrom(
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
  public static Builder newBuilder(SprayEventCurrentModelFile prototype) {
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
   * 当前使用模型消息
   * </pre>
   *
   * Protobuf type {@code qhx.proto.weve.event.spray.SprayEventCurrentModelFile}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:qhx.proto.weve.event.spray.SprayEventCurrentModelFile)
          SprayEventCurrentModelFileOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return SprayEventOuterClass.internal_static_qhx_proto_weve_event_spray_SprayEventCurrentModelFile_descriptor;
    }

    @Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SprayEventOuterClass.internal_static_qhx_proto_weve_event_spray_SprayEventCurrentModelFile_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SprayEventCurrentModelFile.class, Builder.class);
    }

    // Construct using com.qhx.proto.event.SprayEventCurrentModelFile.newBuilder()
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
      modelFile_ = "";

      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return SprayEventOuterClass.internal_static_qhx_proto_weve_event_spray_SprayEventCurrentModelFile_descriptor;
    }

    @Override
    public SprayEventCurrentModelFile getDefaultInstanceForType() {
      return SprayEventCurrentModelFile.getDefaultInstance();
    }

    @Override
    public SprayEventCurrentModelFile build() {
      SprayEventCurrentModelFile result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public SprayEventCurrentModelFile buildPartial() {
      SprayEventCurrentModelFile result = new SprayEventCurrentModelFile(this);
      result.modelFile_ = modelFile_;
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
      if (other instanceof SprayEventCurrentModelFile) {
        return mergeFrom((SprayEventCurrentModelFile)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(SprayEventCurrentModelFile other) {
      if (other == SprayEventCurrentModelFile.getDefaultInstance()) return this;
      if (!other.getModelFile().isEmpty()) {
        modelFile_ = other.modelFile_;
        onChanged();
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
      SprayEventCurrentModelFile parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (SprayEventCurrentModelFile) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private Object modelFile_ = "";
    /**
     * <code>string model_file = 1;</code>
     * @return The modelFile.
     */
    public String getModelFile() {
      Object ref = modelFile_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        modelFile_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string model_file = 1;</code>
     * @return The bytes for modelFile.
     */
    public com.google.protobuf.ByteString
        getModelFileBytes() {
      Object ref = modelFile_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        modelFile_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string model_file = 1;</code>
     * @param value The modelFile to set.
     * @return This builder for chaining.
     */
    public Builder setModelFile(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      modelFile_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string model_file = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearModelFile() {
      
      modelFile_ = getDefaultInstance().getModelFile();
      onChanged();
      return this;
    }
    /**
     * <code>string model_file = 1;</code>
     * @param value The bytes for modelFile to set.
     * @return This builder for chaining.
     */
    public Builder setModelFileBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      modelFile_ = value;
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


    // @@protoc_insertion_point(builder_scope:qhx.proto.weve.event.spray.SprayEventCurrentModelFile)
  }

  // @@protoc_insertion_point(class_scope:qhx.proto.weve.event.spray.SprayEventCurrentModelFile)
  private static final SprayEventCurrentModelFile DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new SprayEventCurrentModelFile();
  }

  public static SprayEventCurrentModelFile getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SprayEventCurrentModelFile>
      PARSER = new com.google.protobuf.AbstractParser<SprayEventCurrentModelFile>() {
    @Override
    public SprayEventCurrentModelFile parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SprayEventCurrentModelFile(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SprayEventCurrentModelFile> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<SprayEventCurrentModelFile> getParserForType() {
    return PARSER;
  }

  @Override
  public SprayEventCurrentModelFile getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

