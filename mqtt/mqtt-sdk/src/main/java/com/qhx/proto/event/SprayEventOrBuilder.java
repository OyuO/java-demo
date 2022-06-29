// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: spray_event.proto

package com.qhx.proto.event;

public interface SprayEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:qhx.proto.weve.event.spray.SprayEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.qhx.proto.weve.event.spray.SprayEventType type = 1;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <code>.qhx.proto.weve.event.spray.SprayEventType type = 1;</code>
   * @return The type.
   */
  SprayEventType getType();

  /**
   * <pre>
   * error message可以放在Event中
   * </pre>
   *
   * <code>bytes event_body = 2;</code>
   * @return The eventBody.
   */
  com.google.protobuf.ByteString getEventBody();
}