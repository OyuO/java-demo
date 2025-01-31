// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: geo.proto

package com.qhx.proto.event;

/**
 * <pre>
 * 运动旋量
 * </pre>
 *
 * Protobuf type {@code qhx.proto.weve.Twist}
 */
public final class Twist extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:qhx.proto.weve.Twist)
    TwistOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Twist.newBuilder() to construct.
  private Twist(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Twist() {
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new Twist();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Twist(
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
            Vector3.Builder subBuilder = null;
            if (linear_ != null) {
              subBuilder = linear_.toBuilder();
            }
            linear_ = input.readMessage(Vector3.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(linear_);
              linear_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            Vector3.Builder subBuilder = null;
            if (angular_ != null) {
              subBuilder = angular_.toBuilder();
            }
            angular_ = input.readMessage(Vector3.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(angular_);
              angular_ = subBuilder.buildPartial();
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
    return Geo.internal_static_qhx_proto_weve_Twist_descriptor;
  }

  @Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return Geo.internal_static_qhx_proto_weve_Twist_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            Twist.class, Builder.class);
  }

  public static final int LINEAR_FIELD_NUMBER = 1;
  private Vector3 linear_;
  /**
   * <code>.qhx.proto.weve.Vector3 linear = 1;</code>
   * @return Whether the linear field is set.
   */
  @Override
  public boolean hasLinear() {
    return linear_ != null;
  }
  /**
   * <code>.qhx.proto.weve.Vector3 linear = 1;</code>
   * @return The linear.
   */
  @Override
  public Vector3 getLinear() {
    return linear_ == null ? Vector3.getDefaultInstance() : linear_;
  }
  /**
   * <code>.qhx.proto.weve.Vector3 linear = 1;</code>
   */
  @Override
  public Vector3OrBuilder getLinearOrBuilder() {
    return getLinear();
  }

  public static final int ANGULAR_FIELD_NUMBER = 2;
  private Vector3 angular_;
  /**
   * <code>.qhx.proto.weve.Vector3 angular = 2;</code>
   * @return Whether the angular field is set.
   */
  @Override
  public boolean hasAngular() {
    return angular_ != null;
  }
  /**
   * <code>.qhx.proto.weve.Vector3 angular = 2;</code>
   * @return The angular.
   */
  @Override
  public Vector3 getAngular() {
    return angular_ == null ? Vector3.getDefaultInstance() : angular_;
  }
  /**
   * <code>.qhx.proto.weve.Vector3 angular = 2;</code>
   */
  @Override
  public Vector3OrBuilder getAngularOrBuilder() {
    return getAngular();
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
    if (linear_ != null) {
      output.writeMessage(1, getLinear());
    }
    if (angular_ != null) {
      output.writeMessage(2, getAngular());
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (linear_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getLinear());
    }
    if (angular_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getAngular());
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
    if (!(obj instanceof Twist)) {
      return super.equals(obj);
    }
    Twist other = (Twist) obj;

    if (hasLinear() != other.hasLinear()) return false;
    if (hasLinear()) {
      if (!getLinear()
          .equals(other.getLinear())) return false;
    }
    if (hasAngular() != other.hasAngular()) return false;
    if (hasAngular()) {
      if (!getAngular()
          .equals(other.getAngular())) return false;
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
    if (hasLinear()) {
      hash = (37 * hash) + LINEAR_FIELD_NUMBER;
      hash = (53 * hash) + getLinear().hashCode();
    }
    if (hasAngular()) {
      hash = (37 * hash) + ANGULAR_FIELD_NUMBER;
      hash = (53 * hash) + getAngular().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static Twist parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Twist parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Twist parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Twist parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Twist parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Twist parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Twist parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Twist parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static Twist parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static Twist parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static Twist parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Twist parseFrom(
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
  public static Builder newBuilder(Twist prototype) {
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
   * 运动旋量
   * </pre>
   *
   * Protobuf type {@code qhx.proto.weve.Twist}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:qhx.proto.weve.Twist)
          TwistOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Geo.internal_static_qhx_proto_weve_Twist_descriptor;
    }

    @Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Geo.internal_static_qhx_proto_weve_Twist_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Twist.class, Builder.class);
    }

    // Construct using com.qhx.proto.event.Twist.newBuilder()
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
      if (linearBuilder_ == null) {
        linear_ = null;
      } else {
        linear_ = null;
        linearBuilder_ = null;
      }
      if (angularBuilder_ == null) {
        angular_ = null;
      } else {
        angular_ = null;
        angularBuilder_ = null;
      }
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return Geo.internal_static_qhx_proto_weve_Twist_descriptor;
    }

    @Override
    public Twist getDefaultInstanceForType() {
      return Twist.getDefaultInstance();
    }

    @Override
    public Twist build() {
      Twist result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public Twist buildPartial() {
      Twist result = new Twist(this);
      if (linearBuilder_ == null) {
        result.linear_ = linear_;
      } else {
        result.linear_ = linearBuilder_.build();
      }
      if (angularBuilder_ == null) {
        result.angular_ = angular_;
      } else {
        result.angular_ = angularBuilder_.build();
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
      if (other instanceof Twist) {
        return mergeFrom((Twist)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(Twist other) {
      if (other == Twist.getDefaultInstance()) return this;
      if (other.hasLinear()) {
        mergeLinear(other.getLinear());
      }
      if (other.hasAngular()) {
        mergeAngular(other.getAngular());
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
      Twist parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (Twist) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private Vector3 linear_;
    private com.google.protobuf.SingleFieldBuilderV3<
            Vector3, Vector3.Builder, Vector3OrBuilder> linearBuilder_;
    /**
     * <code>.qhx.proto.weve.Vector3 linear = 1;</code>
     * @return Whether the linear field is set.
     */
    public boolean hasLinear() {
      return linearBuilder_ != null || linear_ != null;
    }
    /**
     * <code>.qhx.proto.weve.Vector3 linear = 1;</code>
     * @return The linear.
     */
    public Vector3 getLinear() {
      if (linearBuilder_ == null) {
        return linear_ == null ? Vector3.getDefaultInstance() : linear_;
      } else {
        return linearBuilder_.getMessage();
      }
    }
    /**
     * <code>.qhx.proto.weve.Vector3 linear = 1;</code>
     */
    public Builder setLinear(Vector3 value) {
      if (linearBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        linear_ = value;
        onChanged();
      } else {
        linearBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.qhx.proto.weve.Vector3 linear = 1;</code>
     */
    public Builder setLinear(
        Vector3.Builder builderForValue) {
      if (linearBuilder_ == null) {
        linear_ = builderForValue.build();
        onChanged();
      } else {
        linearBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.qhx.proto.weve.Vector3 linear = 1;</code>
     */
    public Builder mergeLinear(Vector3 value) {
      if (linearBuilder_ == null) {
        if (linear_ != null) {
          linear_ =
            Vector3.newBuilder(linear_).mergeFrom(value).buildPartial();
        } else {
          linear_ = value;
        }
        onChanged();
      } else {
        linearBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.qhx.proto.weve.Vector3 linear = 1;</code>
     */
    public Builder clearLinear() {
      if (linearBuilder_ == null) {
        linear_ = null;
        onChanged();
      } else {
        linear_ = null;
        linearBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.qhx.proto.weve.Vector3 linear = 1;</code>
     */
    public Vector3.Builder getLinearBuilder() {
      
      onChanged();
      return getLinearFieldBuilder().getBuilder();
    }
    /**
     * <code>.qhx.proto.weve.Vector3 linear = 1;</code>
     */
    public Vector3OrBuilder getLinearOrBuilder() {
      if (linearBuilder_ != null) {
        return linearBuilder_.getMessageOrBuilder();
      } else {
        return linear_ == null ?
            Vector3.getDefaultInstance() : linear_;
      }
    }
    /**
     * <code>.qhx.proto.weve.Vector3 linear = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            Vector3, Vector3.Builder, Vector3OrBuilder>
        getLinearFieldBuilder() {
      if (linearBuilder_ == null) {
        linearBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                Vector3, Vector3.Builder, Vector3OrBuilder>(
                getLinear(),
                getParentForChildren(),
                isClean());
        linear_ = null;
      }
      return linearBuilder_;
    }

    private Vector3 angular_;
    private com.google.protobuf.SingleFieldBuilderV3<
            Vector3, Vector3.Builder, Vector3OrBuilder> angularBuilder_;
    /**
     * <code>.qhx.proto.weve.Vector3 angular = 2;</code>
     * @return Whether the angular field is set.
     */
    public boolean hasAngular() {
      return angularBuilder_ != null || angular_ != null;
    }
    /**
     * <code>.qhx.proto.weve.Vector3 angular = 2;</code>
     * @return The angular.
     */
    public Vector3 getAngular() {
      if (angularBuilder_ == null) {
        return angular_ == null ? Vector3.getDefaultInstance() : angular_;
      } else {
        return angularBuilder_.getMessage();
      }
    }
    /**
     * <code>.qhx.proto.weve.Vector3 angular = 2;</code>
     */
    public Builder setAngular(Vector3 value) {
      if (angularBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        angular_ = value;
        onChanged();
      } else {
        angularBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.qhx.proto.weve.Vector3 angular = 2;</code>
     */
    public Builder setAngular(
        Vector3.Builder builderForValue) {
      if (angularBuilder_ == null) {
        angular_ = builderForValue.build();
        onChanged();
      } else {
        angularBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.qhx.proto.weve.Vector3 angular = 2;</code>
     */
    public Builder mergeAngular(Vector3 value) {
      if (angularBuilder_ == null) {
        if (angular_ != null) {
          angular_ =
            Vector3.newBuilder(angular_).mergeFrom(value).buildPartial();
        } else {
          angular_ = value;
        }
        onChanged();
      } else {
        angularBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.qhx.proto.weve.Vector3 angular = 2;</code>
     */
    public Builder clearAngular() {
      if (angularBuilder_ == null) {
        angular_ = null;
        onChanged();
      } else {
        angular_ = null;
        angularBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.qhx.proto.weve.Vector3 angular = 2;</code>
     */
    public Vector3.Builder getAngularBuilder() {
      
      onChanged();
      return getAngularFieldBuilder().getBuilder();
    }
    /**
     * <code>.qhx.proto.weve.Vector3 angular = 2;</code>
     */
    public Vector3OrBuilder getAngularOrBuilder() {
      if (angularBuilder_ != null) {
        return angularBuilder_.getMessageOrBuilder();
      } else {
        return angular_ == null ?
            Vector3.getDefaultInstance() : angular_;
      }
    }
    /**
     * <code>.qhx.proto.weve.Vector3 angular = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            Vector3, Vector3.Builder, Vector3OrBuilder>
        getAngularFieldBuilder() {
      if (angularBuilder_ == null) {
        angularBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                Vector3, Vector3.Builder, Vector3OrBuilder>(
                getAngular(),
                getParentForChildren(),
                isClean());
        angular_ = null;
      }
      return angularBuilder_;
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


    // @@protoc_insertion_point(builder_scope:qhx.proto.weve.Twist)
  }

  // @@protoc_insertion_point(class_scope:qhx.proto.weve.Twist)
  private static final Twist DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Twist();
  }

  public static Twist getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Twist>
      PARSER = new com.google.protobuf.AbstractParser<Twist>() {
    @Override
    public Twist parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Twist(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Twist> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<Twist> getParserForType() {
    return PARSER;
  }

  @Override
  public Twist getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

