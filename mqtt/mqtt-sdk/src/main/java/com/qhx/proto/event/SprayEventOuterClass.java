// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: spray_event.proto

package com.qhx.proto.event;

public final class SprayEventOuterClass {
  private SprayEventOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_qhx_proto_weve_event_spray_SprayEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_qhx_proto_weve_event_spray_SprayEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_qhx_proto_weve_event_spray_SprayEventImageStorageStatus_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_qhx_proto_weve_event_spray_SprayEventImageStorageStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_qhx_proto_weve_event_spray_SprayEventCurrentModelFile_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_qhx_proto_weve_event_spray_SprayEventCurrentModelFile_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_qhx_proto_weve_event_spray_SprayEventSendPointStatus_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_qhx_proto_weve_event_spray_SprayEventSendPointStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_qhx_proto_weve_event_spray_SprayEventRecordSwitchStatus_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_qhx_proto_weve_event_spray_SprayEventRecordSwitchStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_qhx_proto_weve_event_spray_SprayEventTfTransformError_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_qhx_proto_weve_event_spray_SprayEventTfTransformError_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_qhx_proto_weve_event_spray_SprayEventUdpError_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_qhx_proto_weve_event_spray_SprayEventUdpError_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_qhx_proto_weve_event_spray_SprayEventCameraNotFound_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_qhx_proto_weve_event_spray_SprayEventCameraNotFound_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_qhx_proto_weve_event_spray_SprayEventSprayPixel_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_qhx_proto_weve_event_spray_SprayEventSprayPixel_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_qhx_proto_weve_event_spray_SprayEventSprayTargetPoint_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_qhx_proto_weve_event_spray_SprayEventSprayTargetPoint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_qhx_proto_weve_event_spray_SprayEventSprayTargetPosition_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_qhx_proto_weve_event_spray_SprayEventSprayTargetPosition_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_qhx_proto_weve_event_spray_SprayEventImage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_qhx_proto_weve_event_spray_SprayEventImage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\021spray_event.proto\022\032qhx.proto.weve.even" +
      "t.spray\032\tgeo.proto\"Z\n\nSprayEvent\0228\n\004type" +
      "\030\001 \001(\0162*.qhx.proto.weve.event.spray.Spra" +
      "yEventType\022\022\n\nevent_body\030\002 \001(\014\".\n\034SprayE" +
      "ventImageStorageStatus\022\016\n\006status\030\001 \001(\010\"0" +
      "\n\032SprayEventCurrentModelFile\022\022\n\nmodel_fi" +
      "le\030\001 \001(\t\"+\n\031SprayEventSendPointStatus\022\016\n" +
      "\006status\030\001 \001(\010\".\n\034SprayEventRecordSwitchS" +
      "tatus\022\016\n\006status\030\001 \001(\010\"H\n\032SprayEventTfTra" +
      "nsformError\022\024\n\014source_frame\030\001 \001(\t\022\024\n\014tar" +
      "get_frame\030\002 \001(\t\".\n\022SprayEventUdpError\022\n\n" +
      "\002ip\030\001 \001(\007\022\014\n\004port\030\002 \001(\r\"\216\001\n\030SprayEventCa" +
      "meraNotFound\0224\n\004type\030\001 \001(\0162&.qhx.proto.w" +
      "eve.event.spray.CameraType\022<\n\010position\030\002" +
      " \001(\0162*.qhx.proto.weve.event.spray.Camera" +
      "Position\"0\n\024SprayEventSprayPixel\022\013\n\003row\030" +
      "\001 \001(\r\022\013\n\003col\030\002 \001(\r\"\203\001\n\032SprayEventSprayTa" +
      "rgetPoint\022?\n\005pixel\030\001 \001(\01320.qhx.proto.wev" +
      "e.event.spray.SprayEventSprayPixel\022$\n\005po" +
      "int\030\002 \001(\0132\025.qhx.proto.weve.Point\"v\n\035Spra" +
      "yEventSprayTargetPosition\022\013\n\003seq\030\001 \001(\r\022H" +
      "\n\010position\030\002 \003(\01326.qhx.proto.weve.event." +
      "spray.SprayEventSprayTargetPoint\"\314\001\n\017Spr" +
      "ayEventImage\022F\n\006format\030\001 \001(\01626.qhx.proto" +
      ".weve.event.spray.SprayEventSprayImageFo" +
      "rmat\022\013\n\003seq\030\002 \001(\r\022\014\n\004rows\030\003 \001(\r\022\014\n\004cols\030" +
      "\004 \001(\r\022\022\n\npixel_type\030\005 \001(\r\022\022\n\npixel_size\030" +
      "\006 \001(\r\022\022\n\nimage_size\030\007 \001(\r\022\014\n\004data\030\010 \001(\014*" +
      "\322\004\n\016SprayEventType\022\034\n\030SPRAY_EVENT_TYPE_U" +
      "NKNOWN\020\000\022\036\n\032SPRAY_EVENT_TYPE_ODOM_LOST\020\001" +
      "\022\'\n#SPRAY_EVENT_TYPE_TF_TRANSFORM_ERROR\020" +
      "\002\022.\n*SPRAY_EVENT_TYPE_ERROR_TRT_LOAD_MOD" +
      "EL_FILE\020\003\022,\n(SPRAY_EVENT_TYPE_ERROR_TRT_" +
      "INFER_EXECUTE\020\004\022!\n\035SPRAY_EVENT_TYPE_CV_E" +
      "XCEPTION\020\005\022\036\n\032SPRAY_EVENT_TYPE_UDP_ERROR" +
      "\020\006\022%\n!SPRAY_EVENT_TYPE_CAMERA_NOT_FOUND\020" +
      "\007\022$\n SPRAY_EVENT_TYPE_TARGET_POSITION\020\n\022" +
      "#\n\037SPRAY_EVENT_TYPE_IMAGE_ORIGINAL\020\013\022\037\n\033" +
      "SPRAY_EVENT_TYPE_IMAGE_MASK\020\014\022)\n%SPRAY_E" +
      "VENT_TYPE_IMAGE_STORAGE_STATUS\020\r\022\'\n#SPRA" +
      "Y_EVENT_TYPE_CURRENT_MODEL_FILE\020\016\022&\n\"SPR" +
      "AY_EVENT_TYPE_SEND_POINT_STATUS\020\017\022)\n%SPR" +
      "AY_EVENT_TYPE_RECORD_SWITCH_STATUS\020\020*~\n\n" +
      "CameraType\022\034\n\030SPRAY_CAMERA_TYPE_RS_435\020\000" +
      "\022\034\n\030SPRAY_CAMERA_TYPE_RS_265\020\001\022\031\n\025SPRAY_" +
      "CAMERA_TYPE_HIK\020\002\022\031\n\025SPRAY_CAMERA_TYPE_Z" +
      "ED\020\003*^\n\016CameraPosition\022\030\n\024CAMERA_POSITIO" +
      "N_LEFT\020\000\022\027\n\023CAMERA_POSITION_MID\020\001\022\031\n\025CAM" +
      "ERA_POSITION_RIGHT\020\002*]\n\035SprayEventSprayI" +
      "magePixelType\022\r\n\tTYPE_8UC1\020\000\022\r\n\tTYPE_8UC" +
      "3\020\001\022\016\n\nTYPE_32FC1\020\002\022\016\n\nTYPE_32FC3\020\003*G\n\032S" +
      "prayEventSprayImageFormat\022\023\n\017SPRAY_IMAGE" +
      "_RAW\020\000\022\024\n\020SPRAY_IMAGE_JPEG\020\001B\027\n\023com.qhx." +
      "proto.eventP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          Geo.getDescriptor(),
        });
    internal_static_qhx_proto_weve_event_spray_SprayEvent_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_qhx_proto_weve_event_spray_SprayEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_qhx_proto_weve_event_spray_SprayEvent_descriptor,
        new String[] { "Type", "EventBody", });
    internal_static_qhx_proto_weve_event_spray_SprayEventImageStorageStatus_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_qhx_proto_weve_event_spray_SprayEventImageStorageStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_qhx_proto_weve_event_spray_SprayEventImageStorageStatus_descriptor,
        new String[] { "Status", });
    internal_static_qhx_proto_weve_event_spray_SprayEventCurrentModelFile_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_qhx_proto_weve_event_spray_SprayEventCurrentModelFile_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_qhx_proto_weve_event_spray_SprayEventCurrentModelFile_descriptor,
        new String[] { "ModelFile", });
    internal_static_qhx_proto_weve_event_spray_SprayEventSendPointStatus_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_qhx_proto_weve_event_spray_SprayEventSendPointStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_qhx_proto_weve_event_spray_SprayEventSendPointStatus_descriptor,
        new String[] { "Status", });
    internal_static_qhx_proto_weve_event_spray_SprayEventRecordSwitchStatus_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_qhx_proto_weve_event_spray_SprayEventRecordSwitchStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_qhx_proto_weve_event_spray_SprayEventRecordSwitchStatus_descriptor,
        new String[] { "Status", });
    internal_static_qhx_proto_weve_event_spray_SprayEventTfTransformError_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_qhx_proto_weve_event_spray_SprayEventTfTransformError_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_qhx_proto_weve_event_spray_SprayEventTfTransformError_descriptor,
        new String[] { "SourceFrame", "TargetFrame", });
    internal_static_qhx_proto_weve_event_spray_SprayEventUdpError_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_qhx_proto_weve_event_spray_SprayEventUdpError_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_qhx_proto_weve_event_spray_SprayEventUdpError_descriptor,
        new String[] { "Ip", "Port", });
    internal_static_qhx_proto_weve_event_spray_SprayEventCameraNotFound_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_qhx_proto_weve_event_spray_SprayEventCameraNotFound_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_qhx_proto_weve_event_spray_SprayEventCameraNotFound_descriptor,
        new String[] { "Type", "Position", });
    internal_static_qhx_proto_weve_event_spray_SprayEventSprayPixel_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_qhx_proto_weve_event_spray_SprayEventSprayPixel_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_qhx_proto_weve_event_spray_SprayEventSprayPixel_descriptor,
        new String[] { "Row", "Col", });
    internal_static_qhx_proto_weve_event_spray_SprayEventSprayTargetPoint_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_qhx_proto_weve_event_spray_SprayEventSprayTargetPoint_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_qhx_proto_weve_event_spray_SprayEventSprayTargetPoint_descriptor,
        new String[] { "Pixel", "Point", });
    internal_static_qhx_proto_weve_event_spray_SprayEventSprayTargetPosition_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_qhx_proto_weve_event_spray_SprayEventSprayTargetPosition_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_qhx_proto_weve_event_spray_SprayEventSprayTargetPosition_descriptor,
        new String[] { "Seq", "Position", });
    internal_static_qhx_proto_weve_event_spray_SprayEventImage_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_qhx_proto_weve_event_spray_SprayEventImage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_qhx_proto_weve_event_spray_SprayEventImage_descriptor,
        new String[] { "Format", "Seq", "Rows", "Cols", "PixelType", "PixelSize", "ImageSize", "Data", });
    Geo.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}