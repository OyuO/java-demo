// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: geo.proto

package com.qhx.proto.event;

/**
 * <pre>
 * 四元数
 * </pre>
 *
 * Protobuf type {@code qhx.proto.weve.Quaternion}
 */
public final class Quaternion extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:qhx.proto.weve.Quaternion)
    QuaternionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Quaternion.newBuilder() to construct.
  private Quaternion(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Quaternion() {
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new Quaternion();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Quaternion(
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
          case 9: {

            x_ = input.readDouble();
            break;
          }
          case 17: {

            y_ = input.readDouble();
            break;
          }
          case 25: {

            z_ = input.readDouble();
            break;
          }
          case 33: {

            w_ = input.readDouble();
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
    return Geo.internal_static_qhx_proto_weve_Quaternion_descriptor;
  }

  @Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return Geo.internal_static_qhx_proto_weve_Quaternion_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            Quaternion.class, Builder.class);
  }

  public static final int X_FIELD_NUMBER = 1;
  private double x_;
  /**
   * <code>double x = 1;</code>
   * @return The x.
   */
  @Override
  public double getX() {
    return x_;
  }

  public static final int Y_FIELD_NUMBER = 2;
  private double y_;
  /**
   * <code>double y = 2;</code>
   * @return The y.
   */
  @Override
  public double getY() {
    return y_;
  }

  public static final int Z_FIELD_NUMBER = 3;
  private double z_;
  /**
   * <code>double z = 3;</code>
   * @return The z.
   */
  @Override
  public double getZ() {
    return z_;
  }

  public static final int W_FIELD_NUMBER = 4;
  private double w_;
  /**
   * <code>double w = 4;</code>
   * @return The w.
   */
  @Override
  public double getW() {
    return w_;
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
    if (x_ != 0D) {
      output.writeDouble(1, x_);
    }
    if (y_ != 0D) {
      output.writeDouble(2, y_);
    }
    if (z_ != 0D) {
      output.writeDouble(3, z_);
    }
    if (w_ != 0D) {
      output.writeDouble(4, w_);
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (x_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(1, x_);
    }
    if (y_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, y_);
    }
    if (z_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, z_);
    }
    if (w_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(4, w_);
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
    if (!(obj instanceof Quaternion)) {
      return super.equals(obj);
    }
    Quaternion other = (Quaternion) obj;

    if (Double.doubleToLongBits(getX())
        != Double.doubleToLongBits(
            other.getX())) return false;
    if (Double.doubleToLongBits(getY())
        != Double.doubleToLongBits(
            other.getY())) return false;
    if (Double.doubleToLongBits(getZ())
        != Double.doubleToLongBits(
            other.getZ())) return false;
    if (Double.doubleToLongBits(getW())
        != Double.doubleToLongBits(
            other.getW())) return false;
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
    hash = (37 * hash) + X_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        Double.doubleToLongBits(getX()));
    hash = (37 * hash) + Y_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        Double.doubleToLongBits(getY()));
    hash = (37 * hash) + Z_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        Double.doubleToLongBits(getZ()));
    hash = (37 * hash) + W_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        Double.doubleToLongBits(getW()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static Quaternion parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Quaternion parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Quaternion parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Quaternion parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Quaternion parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Quaternion parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Quaternion parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Quaternion parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static Quaternion parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static Quaternion parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static Quaternion parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Quaternion parseFrom(
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
  public static Builder newBuilder(Quaternion prototype) {
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
   * 四元数
   * </pre>
   *
   * Protobuf type {@code qhx.proto.weve.Quaternion}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:qhx.proto.weve.Quaternion)
          QuaternionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Geo.internal_static_qhx_proto_weve_Quaternion_descriptor;
    }

    @Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Geo.internal_static_qhx_proto_weve_Quaternion_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Quaternion.class, Builder.class);
    }

    // Construct using com.qhx.proto.event.Quaternion.newBuilder()
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
      x_ = 0D;

      y_ = 0D;

      z_ = 0D;

      w_ = 0D;

      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return Geo.internal_static_qhx_proto_weve_Quaternion_descriptor;
    }

    @Override
    public Quaternion getDefaultInstanceForType() {
      return Quaternion.getDefaultInstance();
    }

    @Override
    public Quaternion build() {
      Quaternion result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public Quaternion buildPartial() {
      Quaternion result = new Quaternion(this);
      result.x_ = x_;
      result.y_ = y_;
      result.z_ = z_;
      result.w_ = w_;
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
      if (other instanceof Quaternion) {
        return mergeFrom((Quaternion)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(Quaternion other) {
      if (other == Quaternion.getDefaultInstance()) return this;
      if (other.getX() != 0D) {
        setX(other.getX());
      }
      if (other.getY() != 0D) {
        setY(other.getY());
      }
      if (other.getZ() != 0D) {
        setZ(other.getZ());
      }
      if (other.getW() != 0D) {
        setW(other.getW());
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
      Quaternion parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (Quaternion) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private double x_ ;
    /**
     * <code>double x = 1;</code>
     * @return The x.
     */
    @Override
    public double getX() {
      return x_;
    }
    /**
     * <code>double x = 1;</code>
     * @param value The x to set.
     * @return This builder for chaining.
     */
    public Builder setX(double value) {
      
      x_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double x = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearX() {
      
      x_ = 0D;
      onChanged();
      return this;
    }

    private double y_ ;
    /**
     * <code>double y = 2;</code>
     * @return The y.
     */
    @Override
    public double getY() {
      return y_;
    }
    /**
     * <code>double y = 2;</code>
     * @param value The y to set.
     * @return This builder for chaining.
     */
    public Builder setY(double value) {
      
      y_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double y = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearY() {
      
      y_ = 0D;
      onChanged();
      return this;
    }

    private double z_ ;
    /**
     * <code>double z = 3;</code>
     * @return The z.
     */
    @Override
    public double getZ() {
      return z_;
    }
    /**
     * <code>double z = 3;</code>
     * @param value The z to set.
     * @return This builder for chaining.
     */
    public Builder setZ(double value) {
      
      z_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double z = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearZ() {
      
      z_ = 0D;
      onChanged();
      return this;
    }

    private double w_ ;
    /**
     * <code>double w = 4;</code>
     * @return The w.
     */
    @Override
    public double getW() {
      return w_;
    }
    /**
     * <code>double w = 4;</code>
     * @param value The w to set.
     * @return This builder for chaining.
     */
    public Builder setW(double value) {
      
      w_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double w = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearW() {
      
      w_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:qhx.proto.weve.Quaternion)
  }

  // @@protoc_insertion_point(class_scope:qhx.proto.weve.Quaternion)
  private static final Quaternion DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Quaternion();
  }

  public static Quaternion getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Quaternion>
      PARSER = new com.google.protobuf.AbstractParser<Quaternion>() {
    @Override
    public Quaternion parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Quaternion(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Quaternion> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<Quaternion> getParserForType() {
    return PARSER;
  }

  @Override
  public Quaternion getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

