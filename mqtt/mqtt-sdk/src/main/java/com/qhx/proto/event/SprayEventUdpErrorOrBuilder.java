// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: spray_event.proto

package com.qhx.proto.event;

public interface SprayEventUdpErrorOrBuilder extends
    // @@protoc_insertion_point(interface_extends:qhx.proto.weve.event.spray.SprayEventUdpError)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 喷洒控制版的IP地址
   * </pre>
   *
   * <code>fixed32 ip = 1;</code>
   * @return The ip.
   */
  int getIp();

  /**
   * <pre>
   * 端口号
   * </pre>
   *
   * <code>uint32 port = 2;</code>
   * @return The port.
   */
  int getPort();
}
