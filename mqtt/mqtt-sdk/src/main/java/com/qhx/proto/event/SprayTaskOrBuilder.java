// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: spray_task.proto

package com.qhx.proto.event;

public interface SprayTaskOrBuilder extends
    // @@protoc_insertion_point(interface_extends:qhx.proto.weve.task.spray.SprayTask)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 任务类型
   * </pre>
   *
   * <code>.qhx.proto.weve.task.spray.SprayTaskType type = 1;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * 任务类型
   * </pre>
   *
   * <code>.qhx.proto.weve.task.spray.SprayTaskType type = 1;</code>
   * @return The type.
   */
  SprayTaskType getType();

  /**
   * <code>bytes body = 2;</code>
   * @return The body.
   */
  com.google.protobuf.ByteString getBody();
}