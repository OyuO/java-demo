// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: event_nav.proto

package com.qhx.proto.event;

public interface NavEventOdomFrameOrBuilder extends
    // @@protoc_insertion_point(interface_extends:qhx.proto.weve.event.odometry.NavEventOdomFrame)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 序号
   * </pre>
   *
   * <code>uint32 seq = 1;</code>
   * @return The seq.
   */
  int getSeq();

  /**
   * <pre>
   * 姿态信息
   * </pre>
   *
   * <code>.qhx.proto.weve.Pose pose = 2;</code>
   * @return Whether the pose field is set.
   */
  boolean hasPose();
  /**
   * <pre>
   * 姿态信息
   * </pre>
   *
   * <code>.qhx.proto.weve.Pose pose = 2;</code>
   * @return The pose.
   */
  Pose getPose();
  /**
   * <pre>
   * 姿态信息
   * </pre>
   *
   * <code>.qhx.proto.weve.Pose pose = 2;</code>
   */
  PoseOrBuilder getPoseOrBuilder();

  /**
   * <pre>
   * 已到达的最后一个路径点索引
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value waypoint_index = 3;</code>
   * @return Whether the waypointIndex field is set.
   */
  boolean hasWaypointIndex();
  /**
   * <pre>
   * 已到达的最后一个路径点索引
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value waypoint_index = 3;</code>
   * @return The waypointIndex.
   */
  com.google.protobuf.UInt32Value getWaypointIndex();
  /**
   * <pre>
   * 已到达的最后一个路径点索引
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value waypoint_index = 3;</code>
   */
  com.google.protobuf.UInt32ValueOrBuilder getWaypointIndexOrBuilder();

  /**
   * <pre>
   * 姿态信息, 经纬高
   * </pre>
   *
   * <code>.qhx.proto.weve.Pose pose_lla = 4;</code>
   * @return Whether the poseLla field is set.
   */
  boolean hasPoseLla();
  /**
   * <pre>
   * 姿态信息, 经纬高
   * </pre>
   *
   * <code>.qhx.proto.weve.Pose pose_lla = 4;</code>
   * @return The poseLla.
   */
  Pose getPoseLla();
  /**
   * <pre>
   * 姿态信息, 经纬高
   * </pre>
   *
   * <code>.qhx.proto.weve.Pose pose_lla = 4;</code>
   */
  PoseOrBuilder getPoseLlaOrBuilder();
}
