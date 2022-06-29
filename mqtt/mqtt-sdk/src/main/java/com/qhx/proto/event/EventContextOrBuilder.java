// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: event.proto

package com.qhx.proto.event;

public interface EventContextOrBuilder extends
    // @@protoc_insertion_point(interface_extends:qhx.proto.weve.event.EventContext)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 元数据
   * </pre>
   *
   * <code>.qhx.proto.weve.Metadata metadata = 1;</code>
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   * <pre>
   * 元数据
   * </pre>
   *
   * <code>.qhx.proto.weve.Metadata metadata = 1;</code>
   * @return The metadata.
   */
  Metadata getMetadata();
  /**
   * <pre>
   * 元数据
   * </pre>
   *
   * <code>.qhx.proto.weve.Metadata metadata = 1;</code>
   */
  MetadataOrBuilder getMetadataOrBuilder();

  /**
   * <pre>
   * 任务Id
   * </pre>
   *
   * <code>string task_id = 2;</code>
   * @return The taskId.
   */
  String getTaskId();
  /**
   * <pre>
   * 任务Id
   * </pre>
   *
   * <code>string task_id = 2;</code>
   * @return The bytes for taskId.
   */
  com.google.protobuf.ByteString
      getTaskIdBytes();

  /**
   * <pre>
   * 触发器索引
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value trigger_index = 3;</code>
   * @return Whether the triggerIndex field is set.
   */
  boolean hasTriggerIndex();
  /**
   * <pre>
   * 触发器索引
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value trigger_index = 3;</code>
   * @return The triggerIndex.
   */
  com.google.protobuf.UInt32Value getTriggerIndex();
  /**
   * <pre>
   * 触发器索引
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value trigger_index = 3;</code>
   */
  com.google.protobuf.UInt32ValueOrBuilder getTriggerIndexOrBuilder();

  /**
   * <pre>
   * 动作索引
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value action_index = 4;</code>
   * @return Whether the actionIndex field is set.
   */
  boolean hasActionIndex();
  /**
   * <pre>
   * 动作索引
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value action_index = 4;</code>
   * @return The actionIndex.
   */
  com.google.protobuf.UInt32Value getActionIndex();
  /**
   * <pre>
   * 动作索引
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value action_index = 4;</code>
   */
  com.google.protobuf.UInt32ValueOrBuilder getActionIndexOrBuilder();
}
