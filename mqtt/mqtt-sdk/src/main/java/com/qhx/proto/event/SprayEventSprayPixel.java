// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: spray_event.proto

package com.qhx.proto.event;

/**
 * <pre>
 * 像素位置
 * </pre>
 *
 * Protobuf type {@code qhx.proto.weve.event.spray.SprayEventSprayPixel}
 */
public final class SprayEventSprayPixel extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:qhx.proto.weve.event.spray.SprayEventSprayPixel)
    SprayEventSprayPixelOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SprayEventSprayPixel.newBuilder() to construct.
  private SprayEventSprayPixel(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SprayEventSprayPixel() {
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new SprayEventSprayPixel();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SprayEventSprayPixel(
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

            row_ = input.readUInt32();
            break;
          }
          case 16: {

            col_ = input.readUInt32();
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
    return SprayEventOuterClass.internal_static_qhx_proto_weve_event_spray_SprayEventSprayPixel_descriptor;
  }

  @Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return SprayEventOuterClass.internal_static_qhx_proto_weve_event_spray_SprayEventSprayPixel_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            SprayEventSprayPixel.class, Builder.class);
  }

  public static final int ROW_FIELD_NUMBER = 1;
  private int row_;
  /**
   * <pre>
   * 行
   * </pre>
   *
   * <code>uint32 row = 1;</code>
   * @return The row.
   */
  @Override
  public int getRow() {
    return row_;
  }

  public static final int COL_FIELD_NUMBER = 2;
  private int col_;
  /**
   * <pre>
   * 列
   * </pre>
   *
   * <code>uint32 col = 2;</code>
   * @return The col.
   */
  @Override
  public int getCol() {
    return col_;
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
    if (row_ != 0) {
      output.writeUInt32(1, row_);
    }
    if (col_ != 0) {
      output.writeUInt32(2, col_);
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (row_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, row_);
    }
    if (col_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, col_);
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
    if (!(obj instanceof SprayEventSprayPixel)) {
      return super.equals(obj);
    }
    SprayEventSprayPixel other = (SprayEventSprayPixel) obj;

    if (getRow()
        != other.getRow()) return false;
    if (getCol()
        != other.getCol()) return false;
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
    hash = (37 * hash) + ROW_FIELD_NUMBER;
    hash = (53 * hash) + getRow();
    hash = (37 * hash) + COL_FIELD_NUMBER;
    hash = (53 * hash) + getCol();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static SprayEventSprayPixel parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static SprayEventSprayPixel parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static SprayEventSprayPixel parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static SprayEventSprayPixel parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static SprayEventSprayPixel parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static SprayEventSprayPixel parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static SprayEventSprayPixel parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static SprayEventSprayPixel parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static SprayEventSprayPixel parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static SprayEventSprayPixel parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static SprayEventSprayPixel parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static SprayEventSprayPixel parseFrom(
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
  public static Builder newBuilder(SprayEventSprayPixel prototype) {
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
   * 像素位置
   * </pre>
   *
   * Protobuf type {@code qhx.proto.weve.event.spray.SprayEventSprayPixel}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:qhx.proto.weve.event.spray.SprayEventSprayPixel)
          SprayEventSprayPixelOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return SprayEventOuterClass.internal_static_qhx_proto_weve_event_spray_SprayEventSprayPixel_descriptor;
    }

    @Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SprayEventOuterClass.internal_static_qhx_proto_weve_event_spray_SprayEventSprayPixel_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SprayEventSprayPixel.class, Builder.class);
    }

    // Construct using com.qhx.proto.event.SprayEventSprayPixel.newBuilder()
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
      row_ = 0;

      col_ = 0;

      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return SprayEventOuterClass.internal_static_qhx_proto_weve_event_spray_SprayEventSprayPixel_descriptor;
    }

    @Override
    public SprayEventSprayPixel getDefaultInstanceForType() {
      return SprayEventSprayPixel.getDefaultInstance();
    }

    @Override
    public SprayEventSprayPixel build() {
      SprayEventSprayPixel result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public SprayEventSprayPixel buildPartial() {
      SprayEventSprayPixel result = new SprayEventSprayPixel(this);
      result.row_ = row_;
      result.col_ = col_;
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
      if (other instanceof SprayEventSprayPixel) {
        return mergeFrom((SprayEventSprayPixel)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(SprayEventSprayPixel other) {
      if (other == SprayEventSprayPixel.getDefaultInstance()) return this;
      if (other.getRow() != 0) {
        setRow(other.getRow());
      }
      if (other.getCol() != 0) {
        setCol(other.getCol());
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
      SprayEventSprayPixel parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (SprayEventSprayPixel) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int row_ ;
    /**
     * <pre>
     * 行
     * </pre>
     *
     * <code>uint32 row = 1;</code>
     * @return The row.
     */
    @Override
    public int getRow() {
      return row_;
    }
    /**
     * <pre>
     * 行
     * </pre>
     *
     * <code>uint32 row = 1;</code>
     * @param value The row to set.
     * @return This builder for chaining.
     */
    public Builder setRow(int value) {
      
      row_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 行
     * </pre>
     *
     * <code>uint32 row = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearRow() {
      
      row_ = 0;
      onChanged();
      return this;
    }

    private int col_ ;
    /**
     * <pre>
     * 列
     * </pre>
     *
     * <code>uint32 col = 2;</code>
     * @return The col.
     */
    @Override
    public int getCol() {
      return col_;
    }
    /**
     * <pre>
     * 列
     * </pre>
     *
     * <code>uint32 col = 2;</code>
     * @param value The col to set.
     * @return This builder for chaining.
     */
    public Builder setCol(int value) {
      
      col_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 列
     * </pre>
     *
     * <code>uint32 col = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCol() {
      
      col_ = 0;
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


    // @@protoc_insertion_point(builder_scope:qhx.proto.weve.event.spray.SprayEventSprayPixel)
  }

  // @@protoc_insertion_point(class_scope:qhx.proto.weve.event.spray.SprayEventSprayPixel)
  private static final SprayEventSprayPixel DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new SprayEventSprayPixel();
  }

  public static SprayEventSprayPixel getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SprayEventSprayPixel>
      PARSER = new com.google.protobuf.AbstractParser<SprayEventSprayPixel>() {
    @Override
    public SprayEventSprayPixel parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SprayEventSprayPixel(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SprayEventSprayPixel> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<SprayEventSprayPixel> getParserForType() {
    return PARSER;
  }

  @Override
  public SprayEventSprayPixel getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

