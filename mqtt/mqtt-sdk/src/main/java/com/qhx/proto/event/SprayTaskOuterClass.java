// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: spray_task.proto

package com.qhx.proto.event;

public final class SprayTaskOuterClass {
  private SprayTaskOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_qhx_proto_weve_task_spray_SprayTask_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_qhx_proto_weve_task_spray_SprayTask_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_qhx_proto_weve_task_spray_SprayTaskSpraySwitch_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_qhx_proto_weve_task_spray_SprayTaskSpraySwitch_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_qhx_proto_weve_task_spray_SprayTaskPumpSwitch_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_qhx_proto_weve_task_spray_SprayTaskPumpSwitch_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_qhx_proto_weve_task_spray_SprayTaskModelConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_qhx_proto_weve_task_spray_SprayTaskModelConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_qhx_proto_weve_task_spray_SprayTaskStorageSwitch_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_qhx_proto_weve_task_spray_SprayTaskStorageSwitch_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_qhx_proto_weve_task_spray_SprayTaskRecordSwitch_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_qhx_proto_weve_task_spray_SprayTaskRecordSwitch_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\020spray_task.proto\022\031qhx.proto.weve.task." +
      "spray\"Q\n\tSprayTask\0226\n\004type\030\001 \001(\0162(.qhx.p" +
      "roto.weve.task.spray.SprayTaskType\022\014\n\004bo" +
      "dy\030\002 \001(\014\"&\n\024SprayTaskSpraySwitch\022\016\n\006stat" +
      "us\030\001 \001(\010\"%\n\023SprayTaskPumpSwitch\022\016\n\006statu" +
      "s\030\001 \001(\010\"*\n\024SprayTaskModelConfig\022\022\n\nmodel" +
      "_name\030\001 \001(\t\"(\n\026SprayTaskStorageSwitch\022\016\n" +
      "\006status\030\001 \001(\010\"\'\n\025SprayTaskRecordSwitch\022\016" +
      "\n\006status\030\001 \001(\010*\273\001\n\rSprayTaskType\022 \n\034SPRA" +
      "Y_TASK_TYPE_SPRAY_SWITCH\020\000\022\037\n\033SPRAY_TASK" +
      "_TYPE_PUMP_SWITCH\020\001\022 \n\034SPRAY_TASK_TYPE_M" +
      "ODEL_CONFIG\020\002\022\"\n\036SPRAY_TASK_TYPE_STORAGE" +
      "_SWITCH\020\003\022!\n\035SPRAY_TASK_TYPE_RECORD_SWIT" +
      "CH\020\004B\027\n\023com.qhx.proto.eventP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_qhx_proto_weve_task_spray_SprayTask_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_qhx_proto_weve_task_spray_SprayTask_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_qhx_proto_weve_task_spray_SprayTask_descriptor,
        new String[] { "Type", "Body", });
    internal_static_qhx_proto_weve_task_spray_SprayTaskSpraySwitch_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_qhx_proto_weve_task_spray_SprayTaskSpraySwitch_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_qhx_proto_weve_task_spray_SprayTaskSpraySwitch_descriptor,
        new String[] { "Status", });
    internal_static_qhx_proto_weve_task_spray_SprayTaskPumpSwitch_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_qhx_proto_weve_task_spray_SprayTaskPumpSwitch_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_qhx_proto_weve_task_spray_SprayTaskPumpSwitch_descriptor,
        new String[] { "Status", });
    internal_static_qhx_proto_weve_task_spray_SprayTaskModelConfig_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_qhx_proto_weve_task_spray_SprayTaskModelConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_qhx_proto_weve_task_spray_SprayTaskModelConfig_descriptor,
        new String[] { "ModelName", });
    internal_static_qhx_proto_weve_task_spray_SprayTaskStorageSwitch_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_qhx_proto_weve_task_spray_SprayTaskStorageSwitch_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_qhx_proto_weve_task_spray_SprayTaskStorageSwitch_descriptor,
        new String[] { "Status", });
    internal_static_qhx_proto_weve_task_spray_SprayTaskRecordSwitch_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_qhx_proto_weve_task_spray_SprayTaskRecordSwitch_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_qhx_proto_weve_task_spray_SprayTaskRecordSwitch_descriptor,
        new String[] { "Status", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
