// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: geo.proto

package com.qhx.proto.event;

public interface PolygonOrBuilder extends
    // @@protoc_insertion_point(interface_extends:qhx.proto.weve.Polygon)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .qhx.proto.weve.Point vertices = 1;</code>
   */
  java.util.List<Point>
      getVerticesList();
  /**
   * <code>repeated .qhx.proto.weve.Point vertices = 1;</code>
   */
  Point getVertices(int index);
  /**
   * <code>repeated .qhx.proto.weve.Point vertices = 1;</code>
   */
  int getVerticesCount();
  /**
   * <code>repeated .qhx.proto.weve.Point vertices = 1;</code>
   */
  java.util.List<? extends PointOrBuilder>
      getVerticesOrBuilderList();
  /**
   * <code>repeated .qhx.proto.weve.Point vertices = 1;</code>
   */
  PointOrBuilder getVerticesOrBuilder(
      int index);
}