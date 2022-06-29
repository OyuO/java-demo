// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: event_nav.proto

package com.qhx.proto.event;

public interface NavEventRobotStatusOrBuilder extends
    // @@protoc_insertion_point(interface_extends:qhx.proto.weve.event.odometry.NavEventRobotStatus)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.qhx.proto.weve.event.odometry.NavEventControlMode ctrl_mode = 1;</code>
   * @return The enum numeric value on the wire for ctrlMode.
   */
  int getCtrlModeValue();
  /**
   * <code>.qhx.proto.weve.event.odometry.NavEventControlMode ctrl_mode = 1;</code>
   * @return The ctrlMode.
   */
  NavEventControlMode getCtrlMode();

  /**
   * <code>.qhx.proto.weve.event.odometry.NavEventPoseType pose_type = 2;</code>
   * @return The enum numeric value on the wire for poseType.
   */
  int getPoseTypeValue();
  /**
   * <code>.qhx.proto.weve.event.odometry.NavEventPoseType pose_type = 2;</code>
   * @return The poseType.
   */
  NavEventPoseType getPoseType();

  /**
   * <code>float vel_x = 3;</code>
   * @return The velX.
   */
  float getVelX();

  /**
   * <code>float vel_y = 4;</code>
   * @return The velY.
   */
  float getVelY();

  /**
   * <code>float angular_vel = 5;</code>
   * @return The angularVel.
   */
  float getAngularVel();

  /**
   * <code>.qhx.proto.weve.event.odometry.NavEvenMotionStatus motion_status = 6;</code>
   * @return The enum numeric value on the wire for motionStatus.
   */
  int getMotionStatusValue();
  /**
   * <code>.qhx.proto.weve.event.odometry.NavEvenMotionStatus motion_status = 6;</code>
   * @return The motionStatus.
   */
  NavEvenMotionStatus getMotionStatus();
}