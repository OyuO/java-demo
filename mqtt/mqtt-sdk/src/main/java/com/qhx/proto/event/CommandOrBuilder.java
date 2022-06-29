// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: command.proto

package com.qhx.proto.event;

public interface CommandOrBuilder extends
    // @@protoc_insertion_point(interface_extends:qhx.proto.weve.Command)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 命令 Id
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The id.
   */
  String getId();
  /**
   * <pre>
   * 命令 Id
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * 命令类型
   * </pre>
   *
   * <code>.qhx.proto.weve.CommandType type = 2;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * 命令类型
   * </pre>
   *
   * <code>.qhx.proto.weve.CommandType type = 2;</code>
   * @return The type.
   */
  CommandType getType();

  /**
   * <pre>
   * 命令内容
   * </pre>
   *
   * <code>bytes body = 3;</code>
   * @return The body.
   */
  com.google.protobuf.ByteString getBody();
}