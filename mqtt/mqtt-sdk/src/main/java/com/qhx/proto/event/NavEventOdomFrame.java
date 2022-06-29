// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: event_nav.proto

package com.qhx.proto.event;

/**
 * <pre>
 * Odom 消息
 * </pre>
 *
 * Protobuf type {@code qhx.proto.weve.event.odometry.NavEventOdomFrame}
 */
public final class NavEventOdomFrame extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:qhx.proto.weve.event.odometry.NavEventOdomFrame)
    NavEventOdomFrameOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NavEventOdomFrame.newBuilder() to construct.
  private NavEventOdomFrame(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NavEventOdomFrame() {
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new NavEventOdomFrame();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private NavEventOdomFrame(
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

            seq_ = input.readUInt32();
            break;
          }
          case 18: {
            Pose.Builder subBuilder = null;
            if (pose_ != null) {
              subBuilder = pose_.toBuilder();
            }
            pose_ = input.readMessage(Pose.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(pose_);
              pose_ = subBuilder.buildPartial();
            }

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
          case 34: {
            Pose.Builder subBuilder = null;
            if (poseLla_ != null) {
              subBuilder = poseLla_.toBuilder();
            }
            poseLla_ = input.readMessage(Pose.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(poseLla_);
              poseLla_ = subBuilder.buildPartial();
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
    return EventNav.internal_static_qhx_proto_weve_event_odometry_NavEventOdomFrame_descriptor;
  }

  @Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return EventNav.internal_static_qhx_proto_weve_event_odometry_NavEventOdomFrame_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            NavEventOdomFrame.class, Builder.class);
  }

  public static final int SEQ_FIELD_NUMBER = 1;
  private int seq_;
  /**
   * <pre>
   * 序号
   * </pre>
   *
   * <code>uint32 seq = 1;</code>
   * @return The seq.
   */
  @Override
  public int getSeq() {
    return seq_;
  }

  public static final int POSE_FIELD_NUMBER = 2;
  private Pose pose_;
  /**
   * <pre>
   * 姿态信息
   * </pre>
   *
   * <code>.qhx.proto.weve.Pose pose = 2;</code>
   * @return Whether the pose field is set.
   */
  @Override
  public boolean hasPose() {
    return pose_ != null;
  }
  /**
   * <pre>
   * 姿态信息
   * </pre>
   *
   * <code>.qhx.proto.weve.Pose pose = 2;</code>
   * @return The pose.
   */
  @Override
  public Pose getPose() {
    return pose_ == null ? Pose.getDefaultInstance() : pose_;
  }
  /**
   * <pre>
   * 姿态信息
   * </pre>
   *
   * <code>.qhx.proto.weve.Pose pose = 2;</code>
   */
  @Override
  public PoseOrBuilder getPoseOrBuilder() {
    return getPose();
  }

  public static final int WAYPOINT_INDEX_FIELD_NUMBER = 3;
  private com.google.protobuf.UInt32Value waypointIndex_;
  /**
   * <pre>
   * 已到达的最后一个路径点索引
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
   * 已到达的最后一个路径点索引
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
   * 已到达的最后一个路径点索引
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value waypoint_index = 3;</code>
   */
  @Override
  public com.google.protobuf.UInt32ValueOrBuilder getWaypointIndexOrBuilder() {
    return getWaypointIndex();
  }

  public static final int POSE_LLA_FIELD_NUMBER = 4;
  private Pose poseLla_;
  /**
   * <pre>
   * 姿态信息, 经纬高
   * </pre>
   *
   * <code>.qhx.proto.weve.Pose pose_lla = 4;</code>
   * @return Whether the poseLla field is set.
   */
  @Override
  public boolean hasPoseLla() {
    return poseLla_ != null;
  }
  /**
   * <pre>
   * 姿态信息, 经纬高
   * </pre>
   *
   * <code>.qhx.proto.weve.Pose pose_lla = 4;</code>
   * @return The poseLla.
   */
  @Override
  public Pose getPoseLla() {
    return poseLla_ == null ? Pose.getDefaultInstance() : poseLla_;
  }
  /**
   * <pre>
   * 姿态信息, 经纬高
   * </pre>
   *
   * <code>.qhx.proto.weve.Pose pose_lla = 4;</code>
   */
  @Override
  public PoseOrBuilder getPoseLlaOrBuilder() {
    return getPoseLla();
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
    if (pose_ != null) {
      output.writeMessage(2, getPose());
    }
    if (waypointIndex_ != null) {
      output.writeMessage(3, getWaypointIndex());
    }
    if (poseLla_ != null) {
      output.writeMessage(4, getPoseLla());
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
    if (pose_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPose());
    }
    if (waypointIndex_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getWaypointIndex());
    }
    if (poseLla_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getPoseLla());
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
    if (!(obj instanceof NavEventOdomFrame)) {
      return super.equals(obj);
    }
    NavEventOdomFrame other = (NavEventOdomFrame) obj;

    if (getSeq()
        != other.getSeq()) return false;
    if (hasPose() != other.hasPose()) return false;
    if (hasPose()) {
      if (!getPose()
          .equals(other.getPose())) return false;
    }
    if (hasWaypointIndex() != other.hasWaypointIndex()) return false;
    if (hasWaypointIndex()) {
      if (!getWaypointIndex()
          .equals(other.getWaypointIndex())) return false;
    }
    if (hasPoseLla() != other.hasPoseLla()) return false;
    if (hasPoseLla()) {
      if (!getPoseLla()
          .equals(other.getPoseLla())) return false;
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
    hash = (37 * hash) + SEQ_FIELD_NUMBER;
    hash = (53 * hash) + getSeq();
    if (hasPose()) {
      hash = (37 * hash) + POSE_FIELD_NUMBER;
      hash = (53 * hash) + getPose().hashCode();
    }
    if (hasWaypointIndex()) {
      hash = (37 * hash) + WAYPOINT_INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getWaypointIndex().hashCode();
    }
    if (hasPoseLla()) {
      hash = (37 * hash) + POSE_LLA_FIELD_NUMBER;
      hash = (53 * hash) + getPoseLla().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static NavEventOdomFrame parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static NavEventOdomFrame parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static NavEventOdomFrame parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static NavEventOdomFrame parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static NavEventOdomFrame parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static NavEventOdomFrame parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static NavEventOdomFrame parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static NavEventOdomFrame parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static NavEventOdomFrame parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static NavEventOdomFrame parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static NavEventOdomFrame parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static NavEventOdomFrame parseFrom(
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
  public static Builder newBuilder(NavEventOdomFrame prototype) {
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
   * Odom 消息
   * </pre>
   *
   * Protobuf type {@code qhx.proto.weve.event.odometry.NavEventOdomFrame}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:qhx.proto.weve.event.odometry.NavEventOdomFrame)
          NavEventOdomFrameOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return EventNav.internal_static_qhx_proto_weve_event_odometry_NavEventOdomFrame_descriptor;
    }

    @Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return EventNav.internal_static_qhx_proto_weve_event_odometry_NavEventOdomFrame_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              NavEventOdomFrame.class, Builder.class);
    }

    // Construct using com.qhx.proto.event.NavEventOdomFrame.newBuilder()
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
      seq_ = 0;

      if (poseBuilder_ == null) {
        pose_ = null;
      } else {
        pose_ = null;
        poseBuilder_ = null;
      }
      if (waypointIndexBuilder_ == null) {
        waypointIndex_ = null;
      } else {
        waypointIndex_ = null;
        waypointIndexBuilder_ = null;
      }
      if (poseLlaBuilder_ == null) {
        poseLla_ = null;
      } else {
        poseLla_ = null;
        poseLlaBuilder_ = null;
      }
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return EventNav.internal_static_qhx_proto_weve_event_odometry_NavEventOdomFrame_descriptor;
    }

    @Override
    public NavEventOdomFrame getDefaultInstanceForType() {
      return NavEventOdomFrame.getDefaultInstance();
    }

    @Override
    public NavEventOdomFrame build() {
      NavEventOdomFrame result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public NavEventOdomFrame buildPartial() {
      NavEventOdomFrame result = new NavEventOdomFrame(this);
      result.seq_ = seq_;
      if (poseBuilder_ == null) {
        result.pose_ = pose_;
      } else {
        result.pose_ = poseBuilder_.build();
      }
      if (waypointIndexBuilder_ == null) {
        result.waypointIndex_ = waypointIndex_;
      } else {
        result.waypointIndex_ = waypointIndexBuilder_.build();
      }
      if (poseLlaBuilder_ == null) {
        result.poseLla_ = poseLla_;
      } else {
        result.poseLla_ = poseLlaBuilder_.build();
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
      if (other instanceof NavEventOdomFrame) {
        return mergeFrom((NavEventOdomFrame)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(NavEventOdomFrame other) {
      if (other == NavEventOdomFrame.getDefaultInstance()) return this;
      if (other.getSeq() != 0) {
        setSeq(other.getSeq());
      }
      if (other.hasPose()) {
        mergePose(other.getPose());
      }
      if (other.hasWaypointIndex()) {
        mergeWaypointIndex(other.getWaypointIndex());
      }
      if (other.hasPoseLla()) {
        mergePoseLla(other.getPoseLla());
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
      NavEventOdomFrame parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (NavEventOdomFrame) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int seq_ ;
    /**
     * <pre>
     * 序号
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
     * 序号
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
     * 序号
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

    private Pose pose_;
    private com.google.protobuf.SingleFieldBuilderV3<
            Pose, Pose.Builder, PoseOrBuilder> poseBuilder_;
    /**
     * <pre>
     * 姿态信息
     * </pre>
     *
     * <code>.qhx.proto.weve.Pose pose = 2;</code>
     * @return Whether the pose field is set.
     */
    public boolean hasPose() {
      return poseBuilder_ != null || pose_ != null;
    }
    /**
     * <pre>
     * 姿态信息
     * </pre>
     *
     * <code>.qhx.proto.weve.Pose pose = 2;</code>
     * @return The pose.
     */
    public Pose getPose() {
      if (poseBuilder_ == null) {
        return pose_ == null ? Pose.getDefaultInstance() : pose_;
      } else {
        return poseBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 姿态信息
     * </pre>
     *
     * <code>.qhx.proto.weve.Pose pose = 2;</code>
     */
    public Builder setPose(Pose value) {
      if (poseBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        pose_ = value;
        onChanged();
      } else {
        poseBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * 姿态信息
     * </pre>
     *
     * <code>.qhx.proto.weve.Pose pose = 2;</code>
     */
    public Builder setPose(
        Pose.Builder builderForValue) {
      if (poseBuilder_ == null) {
        pose_ = builderForValue.build();
        onChanged();
      } else {
        poseBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * 姿态信息
     * </pre>
     *
     * <code>.qhx.proto.weve.Pose pose = 2;</code>
     */
    public Builder mergePose(Pose value) {
      if (poseBuilder_ == null) {
        if (pose_ != null) {
          pose_ =
            Pose.newBuilder(pose_).mergeFrom(value).buildPartial();
        } else {
          pose_ = value;
        }
        onChanged();
      } else {
        poseBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * 姿态信息
     * </pre>
     *
     * <code>.qhx.proto.weve.Pose pose = 2;</code>
     */
    public Builder clearPose() {
      if (poseBuilder_ == null) {
        pose_ = null;
        onChanged();
      } else {
        pose_ = null;
        poseBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * 姿态信息
     * </pre>
     *
     * <code>.qhx.proto.weve.Pose pose = 2;</code>
     */
    public Pose.Builder getPoseBuilder() {
      
      onChanged();
      return getPoseFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 姿态信息
     * </pre>
     *
     * <code>.qhx.proto.weve.Pose pose = 2;</code>
     */
    public PoseOrBuilder getPoseOrBuilder() {
      if (poseBuilder_ != null) {
        return poseBuilder_.getMessageOrBuilder();
      } else {
        return pose_ == null ?
            Pose.getDefaultInstance() : pose_;
      }
    }
    /**
     * <pre>
     * 姿态信息
     * </pre>
     *
     * <code>.qhx.proto.weve.Pose pose = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            Pose, Pose.Builder, PoseOrBuilder>
        getPoseFieldBuilder() {
      if (poseBuilder_ == null) {
        poseBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                Pose, Pose.Builder, PoseOrBuilder>(
                getPose(),
                getParentForChildren(),
                isClean());
        pose_ = null;
      }
      return poseBuilder_;
    }

    private com.google.protobuf.UInt32Value waypointIndex_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.UInt32Value, com.google.protobuf.UInt32Value.Builder, com.google.protobuf.UInt32ValueOrBuilder> waypointIndexBuilder_;
    /**
     * <pre>
     * 已到达的最后一个路径点索引
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
     * 已到达的最后一个路径点索引
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
     * 已到达的最后一个路径点索引
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
     * 已到达的最后一个路径点索引
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
     * 已到达的最后一个路径点索引
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
     * 已到达的最后一个路径点索引
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
     * 已到达的最后一个路径点索引
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
     * 已到达的最后一个路径点索引
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
     * 已到达的最后一个路径点索引
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

    private Pose poseLla_;
    private com.google.protobuf.SingleFieldBuilderV3<
            Pose, Pose.Builder, PoseOrBuilder> poseLlaBuilder_;
    /**
     * <pre>
     * 姿态信息, 经纬高
     * </pre>
     *
     * <code>.qhx.proto.weve.Pose pose_lla = 4;</code>
     * @return Whether the poseLla field is set.
     */
    public boolean hasPoseLla() {
      return poseLlaBuilder_ != null || poseLla_ != null;
    }
    /**
     * <pre>
     * 姿态信息, 经纬高
     * </pre>
     *
     * <code>.qhx.proto.weve.Pose pose_lla = 4;</code>
     * @return The poseLla.
     */
    public Pose getPoseLla() {
      if (poseLlaBuilder_ == null) {
        return poseLla_ == null ? Pose.getDefaultInstance() : poseLla_;
      } else {
        return poseLlaBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 姿态信息, 经纬高
     * </pre>
     *
     * <code>.qhx.proto.weve.Pose pose_lla = 4;</code>
     */
    public Builder setPoseLla(Pose value) {
      if (poseLlaBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        poseLla_ = value;
        onChanged();
      } else {
        poseLlaBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * 姿态信息, 经纬高
     * </pre>
     *
     * <code>.qhx.proto.weve.Pose pose_lla = 4;</code>
     */
    public Builder setPoseLla(
        Pose.Builder builderForValue) {
      if (poseLlaBuilder_ == null) {
        poseLla_ = builderForValue.build();
        onChanged();
      } else {
        poseLlaBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * 姿态信息, 经纬高
     * </pre>
     *
     * <code>.qhx.proto.weve.Pose pose_lla = 4;</code>
     */
    public Builder mergePoseLla(Pose value) {
      if (poseLlaBuilder_ == null) {
        if (poseLla_ != null) {
          poseLla_ =
            Pose.newBuilder(poseLla_).mergeFrom(value).buildPartial();
        } else {
          poseLla_ = value;
        }
        onChanged();
      } else {
        poseLlaBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * 姿态信息, 经纬高
     * </pre>
     *
     * <code>.qhx.proto.weve.Pose pose_lla = 4;</code>
     */
    public Builder clearPoseLla() {
      if (poseLlaBuilder_ == null) {
        poseLla_ = null;
        onChanged();
      } else {
        poseLla_ = null;
        poseLlaBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * 姿态信息, 经纬高
     * </pre>
     *
     * <code>.qhx.proto.weve.Pose pose_lla = 4;</code>
     */
    public Pose.Builder getPoseLlaBuilder() {
      
      onChanged();
      return getPoseLlaFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 姿态信息, 经纬高
     * </pre>
     *
     * <code>.qhx.proto.weve.Pose pose_lla = 4;</code>
     */
    public PoseOrBuilder getPoseLlaOrBuilder() {
      if (poseLlaBuilder_ != null) {
        return poseLlaBuilder_.getMessageOrBuilder();
      } else {
        return poseLla_ == null ?
            Pose.getDefaultInstance() : poseLla_;
      }
    }
    /**
     * <pre>
     * 姿态信息, 经纬高
     * </pre>
     *
     * <code>.qhx.proto.weve.Pose pose_lla = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            Pose, Pose.Builder, PoseOrBuilder>
        getPoseLlaFieldBuilder() {
      if (poseLlaBuilder_ == null) {
        poseLlaBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                Pose, Pose.Builder, PoseOrBuilder>(
                getPoseLla(),
                getParentForChildren(),
                isClean());
        poseLla_ = null;
      }
      return poseLlaBuilder_;
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


    // @@protoc_insertion_point(builder_scope:qhx.proto.weve.event.odometry.NavEventOdomFrame)
  }

  // @@protoc_insertion_point(class_scope:qhx.proto.weve.event.odometry.NavEventOdomFrame)
  private static final NavEventOdomFrame DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new NavEventOdomFrame();
  }

  public static NavEventOdomFrame getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NavEventOdomFrame>
      PARSER = new com.google.protobuf.AbstractParser<NavEventOdomFrame>() {
    @Override
    public NavEventOdomFrame parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new NavEventOdomFrame(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<NavEventOdomFrame> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<NavEventOdomFrame> getParserForType() {
    return PARSER;
  }

  @Override
  public NavEventOdomFrame getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

