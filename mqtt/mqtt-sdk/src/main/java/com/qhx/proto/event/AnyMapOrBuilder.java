// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package com.qhx.proto.event;

public interface AnyMapOrBuilder extends
    // @@protoc_insertion_point(interface_extends:qhx.proto.weve.AnyMap)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>map&lt;string, .qhx.proto.weve.Any&gt; map = 1;</code>
   */
  int getMapCount();
  /**
   * <code>map&lt;string, .qhx.proto.weve.Any&gt; map = 1;</code>
   */
  boolean containsMap(
      String key);
  /**
   * Use {@link #getMapMap()} instead.
   */
  @Deprecated
  java.util.Map<String, Any>
  getMap();
  /**
   * <code>map&lt;string, .qhx.proto.weve.Any&gt; map = 1;</code>
   */
  java.util.Map<String, Any>
  getMapMap();
  /**
   * <code>map&lt;string, .qhx.proto.weve.Any&gt; map = 1;</code>
   */

  Any getMapOrDefault(
      String key,
      Any defaultValue);
  /**
   * <code>map&lt;string, .qhx.proto.weve.Any&gt; map = 1;</code>
   */

  Any getMapOrThrow(
      String key);
}