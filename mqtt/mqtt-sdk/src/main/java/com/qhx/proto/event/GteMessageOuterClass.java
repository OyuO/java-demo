// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gte_message.proto

package com.qhx.proto.event;

public final class GteMessageOuterClass {
  private GteMessageOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_qhx_proto_weve_gte_GteMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_qhx_proto_weve_gte_GteMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_qhx_proto_weve_gte_GteMessageTest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_qhx_proto_weve_gte_GteMessageTest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\021gte_message.proto\022\022qhx.proto.weve.gte\"" +
      "(\n\nGteMessage\022\014\n\004type\030\001 \001(\r\022\014\n\004body\030\002 \001(" +
      "\014\"K\n\016GteMessageTest\022\013\n\003seq\030\001 \001(\r\022\025\n\rhal_" +
      "timestamp\030\002 \001(\r\022\025\n\rdwt_timestamp\030\003 \001(\r*j" +
      "\n\016GteMessageType\022\034\n\030GTE_MESSAGE_TYPE_UNK" +
      "NOWN\020\000\022\032\n\025GTE_MESSAGE_TYPE_TEST\020\200\010\022\036\n\032GT" +
      "E_MESSAGE_TYPE_SC_STATUS\020\006B\027\n\023com.qhx.pr" +
      "oto.eventP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_qhx_proto_weve_gte_GteMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_qhx_proto_weve_gte_GteMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_qhx_proto_weve_gte_GteMessage_descriptor,
        new String[] { "Type", "Body", });
    internal_static_qhx_proto_weve_gte_GteMessageTest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_qhx_proto_weve_gte_GteMessageTest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_qhx_proto_weve_gte_GteMessageTest_descriptor,
        new String[] { "Seq", "HalTimestamp", "DwtTimestamp", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}