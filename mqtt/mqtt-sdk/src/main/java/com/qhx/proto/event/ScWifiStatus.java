// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gte_message_sc.proto

package com.qhx.proto.event;

/**
 * Protobuf type {@code qhx.proto.weve.gte.ScWifiStatus}
 */
public final class ScWifiStatus extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:qhx.proto.weve.gte.ScWifiStatus)
    ScWifiStatusOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ScWifiStatus.newBuilder() to construct.
  private ScWifiStatus(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ScWifiStatus() {
    apAntMode_ = 0;
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new ScWifiStatus();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ScWifiStatus(
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

            apAntMode_ = rawValue;
            break;
          }
          case 21: {

            apAntAngle_ = input.readFloat();
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
    return GteMessageSc.internal_static_qhx_proto_weve_gte_ScWifiStatus_descriptor;
  }

  @Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return GteMessageSc.internal_static_qhx_proto_weve_gte_ScWifiStatus_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ScWifiStatus.class, Builder.class);
  }

  public static final int AP_ANT_MODE_FIELD_NUMBER = 1;
  private int apAntMode_;
  /**
   * <pre>
   * AP天线控制模式
   * </pre>
   *
   * <code>.qhx.proto.weve.gte.ScWifiAntennaControlMode ap_ant_mode = 1;</code>
   * @return The enum numeric value on the wire for apAntMode.
   */
  @Override public int getApAntModeValue() {
    return apAntMode_;
  }
  /**
   * <pre>
   * AP天线控制模式
   * </pre>
   *
   * <code>.qhx.proto.weve.gte.ScWifiAntennaControlMode ap_ant_mode = 1;</code>
   * @return The apAntMode.
   */
  @Override public ScWifiAntennaControlMode getApAntMode() {
    @SuppressWarnings("deprecation")
    ScWifiAntennaControlMode result = ScWifiAntennaControlMode.valueOf(apAntMode_);
    return result == null ? ScWifiAntennaControlMode.UNRECOGNIZED : result;
  }

  public static final int AP_ANT_ANGLE_FIELD_NUMBER = 2;
  private float apAntAngle_;
  /**
   * <pre>
   * 旋转角度 (-180, 180]
   * </pre>
   *
   * <code>float ap_ant_angle = 2;</code>
   * @return The apAntAngle.
   */
  @Override
  public float getApAntAngle() {
    return apAntAngle_;
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
    if (apAntMode_ != ScWifiAntennaControlMode.SC_WIFI_ANTENNA_MODE_UNKNOWN.getNumber()) {
      output.writeEnum(1, apAntMode_);
    }
    if (apAntAngle_ != 0F) {
      output.writeFloat(2, apAntAngle_);
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (apAntMode_ != ScWifiAntennaControlMode.SC_WIFI_ANTENNA_MODE_UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, apAntMode_);
    }
    if (apAntAngle_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(2, apAntAngle_);
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
    if (!(obj instanceof ScWifiStatus)) {
      return super.equals(obj);
    }
    ScWifiStatus other = (ScWifiStatus) obj;

    if (apAntMode_ != other.apAntMode_) return false;
    if (Float.floatToIntBits(getApAntAngle())
        != Float.floatToIntBits(
            other.getApAntAngle())) return false;
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
    hash = (37 * hash) + AP_ANT_MODE_FIELD_NUMBER;
    hash = (53 * hash) + apAntMode_;
    hash = (37 * hash) + AP_ANT_ANGLE_FIELD_NUMBER;
    hash = (53 * hash) + Float.floatToIntBits(
        getApAntAngle());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ScWifiStatus parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ScWifiStatus parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ScWifiStatus parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ScWifiStatus parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ScWifiStatus parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ScWifiStatus parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ScWifiStatus parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ScWifiStatus parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ScWifiStatus parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ScWifiStatus parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ScWifiStatus parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ScWifiStatus parseFrom(
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
  public static Builder newBuilder(ScWifiStatus prototype) {
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
   * Protobuf type {@code qhx.proto.weve.gte.ScWifiStatus}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:qhx.proto.weve.gte.ScWifiStatus)
          ScWifiStatusOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return GteMessageSc.internal_static_qhx_proto_weve_gte_ScWifiStatus_descriptor;
    }

    @Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return GteMessageSc.internal_static_qhx_proto_weve_gte_ScWifiStatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ScWifiStatus.class, Builder.class);
    }

    // Construct using com.qhx.proto.event.ScWifiStatus.newBuilder()
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
      apAntMode_ = 0;

      apAntAngle_ = 0F;

      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return GteMessageSc.internal_static_qhx_proto_weve_gte_ScWifiStatus_descriptor;
    }

    @Override
    public ScWifiStatus getDefaultInstanceForType() {
      return ScWifiStatus.getDefaultInstance();
    }

    @Override
    public ScWifiStatus build() {
      ScWifiStatus result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public ScWifiStatus buildPartial() {
      ScWifiStatus result = new ScWifiStatus(this);
      result.apAntMode_ = apAntMode_;
      result.apAntAngle_ = apAntAngle_;
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
      if (other instanceof ScWifiStatus) {
        return mergeFrom((ScWifiStatus)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ScWifiStatus other) {
      if (other == ScWifiStatus.getDefaultInstance()) return this;
      if (other.apAntMode_ != 0) {
        setApAntModeValue(other.getApAntModeValue());
      }
      if (other.getApAntAngle() != 0F) {
        setApAntAngle(other.getApAntAngle());
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
      ScWifiStatus parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ScWifiStatus) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int apAntMode_ = 0;
    /**
     * <pre>
     * AP天线控制模式
     * </pre>
     *
     * <code>.qhx.proto.weve.gte.ScWifiAntennaControlMode ap_ant_mode = 1;</code>
     * @return The enum numeric value on the wire for apAntMode.
     */
    @Override public int getApAntModeValue() {
      return apAntMode_;
    }
    /**
     * <pre>
     * AP天线控制模式
     * </pre>
     *
     * <code>.qhx.proto.weve.gte.ScWifiAntennaControlMode ap_ant_mode = 1;</code>
     * @param value The enum numeric value on the wire for apAntMode to set.
     * @return This builder for chaining.
     */
    public Builder setApAntModeValue(int value) {
      
      apAntMode_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * AP天线控制模式
     * </pre>
     *
     * <code>.qhx.proto.weve.gte.ScWifiAntennaControlMode ap_ant_mode = 1;</code>
     * @return The apAntMode.
     */
    @Override
    public ScWifiAntennaControlMode getApAntMode() {
      @SuppressWarnings("deprecation")
      ScWifiAntennaControlMode result = ScWifiAntennaControlMode.valueOf(apAntMode_);
      return result == null ? ScWifiAntennaControlMode.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * AP天线控制模式
     * </pre>
     *
     * <code>.qhx.proto.weve.gte.ScWifiAntennaControlMode ap_ant_mode = 1;</code>
     * @param value The apAntMode to set.
     * @return This builder for chaining.
     */
    public Builder setApAntMode(ScWifiAntennaControlMode value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      apAntMode_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * AP天线控制模式
     * </pre>
     *
     * <code>.qhx.proto.weve.gte.ScWifiAntennaControlMode ap_ant_mode = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearApAntMode() {
      
      apAntMode_ = 0;
      onChanged();
      return this;
    }

    private float apAntAngle_ ;
    /**
     * <pre>
     * 旋转角度 (-180, 180]
     * </pre>
     *
     * <code>float ap_ant_angle = 2;</code>
     * @return The apAntAngle.
     */
    @Override
    public float getApAntAngle() {
      return apAntAngle_;
    }
    /**
     * <pre>
     * 旋转角度 (-180, 180]
     * </pre>
     *
     * <code>float ap_ant_angle = 2;</code>
     * @param value The apAntAngle to set.
     * @return This builder for chaining.
     */
    public Builder setApAntAngle(float value) {
      
      apAntAngle_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 旋转角度 (-180, 180]
     * </pre>
     *
     * <code>float ap_ant_angle = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearApAntAngle() {
      
      apAntAngle_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:qhx.proto.weve.gte.ScWifiStatus)
  }

  // @@protoc_insertion_point(class_scope:qhx.proto.weve.gte.ScWifiStatus)
  private static final ScWifiStatus DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ScWifiStatus();
  }

  public static ScWifiStatus getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ScWifiStatus>
      PARSER = new com.google.protobuf.AbstractParser<ScWifiStatus>() {
    @Override
    public ScWifiStatus parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ScWifiStatus(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ScWifiStatus> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<ScWifiStatus> getParserForType() {
    return PARSER;
  }

  @Override
  public ScWifiStatus getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

