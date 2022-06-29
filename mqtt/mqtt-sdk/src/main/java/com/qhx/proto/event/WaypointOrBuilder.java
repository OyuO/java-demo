// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: task.proto

package com.qhx.proto.event;

public interface WaypointOrBuilder extends
    // @@protoc_insertion_point(interface_extends:qhx.proto.weve.Waypoint)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 索引
   * </pre>
   *
   * <code>uint32 index = 1;</code>
   * @return The index.
   */
  int getIndex();

  /**
   * <pre>
   * 平台位姿
   * </pre>
   *
   * <code>.qhx.proto.weve.Pose platform = 2;</code>
   * @return Whether the platform field is set.
   */
  boolean hasPlatform();
  /**
   * <pre>
   * 平台位姿
   * </pre>
   *
   * <code>.qhx.proto.weve.Pose platform = 2;</code>
   * @return The platform.
   */
  Pose getPlatform();
  /**
   * <pre>
   * 平台位姿
   * </pre>
   *
   * <code>.qhx.proto.weve.Pose platform = 2;</code>
   */
  PoseOrBuilder getPlatformOrBuilder();

  /**
   * <pre>
   * 载荷位姿
   * </pre>
   *
   * <code>.qhx.proto.weve.Pose payload = 3;</code>
   * @return Whether the payload field is set.
   */
  boolean hasPayload();
  /**
   * <pre>
   * 载荷位姿
   * </pre>
   *
   * <code>.qhx.proto.weve.Pose payload = 3;</code>
   * @return The payload.
   */
  Pose getPayload();
  /**
   * <pre>
   * 载荷位姿
   * </pre>
   *
   * <code>.qhx.proto.weve.Pose payload = 3;</code>
   */
  PoseOrBuilder getPayloadOrBuilder();
}
