// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package com.qhx.proto.event;

public final class Common {
  private Common() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_qhx_proto_weve_DoubleList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_qhx_proto_weve_DoubleList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_qhx_proto_weve_FloatList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_qhx_proto_weve_FloatList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_qhx_proto_weve_Int32List_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_qhx_proto_weve_Int32List_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_qhx_proto_weve_Int64List_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_qhx_proto_weve_Int64List_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_qhx_proto_weve_UInt32List_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_qhx_proto_weve_UInt32List_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_qhx_proto_weve_UInt64List_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_qhx_proto_weve_UInt64List_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_qhx_proto_weve_BoolList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_qhx_proto_weve_BoolList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_qhx_proto_weve_StringList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_qhx_proto_weve_StringList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_qhx_proto_weve_BytesList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_qhx_proto_weve_BytesList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_qhx_proto_weve_AnyList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_qhx_proto_weve_AnyList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_qhx_proto_weve_AnyMap_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_qhx_proto_weve_AnyMap_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_qhx_proto_weve_AnyMap_MapEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_qhx_proto_weve_AnyMap_MapEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_qhx_proto_weve_Any_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_qhx_proto_weve_Any_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\014common.proto\022\016qhx.proto.weve\"\034\n\nDouble" +
      "List\022\016\n\006values\030\001 \003(\001\"\033\n\tFloatList\022\016\n\006val" +
      "ues\030\001 \003(\002\"\033\n\tInt32List\022\016\n\006values\030\001 \003(\005\"\033" +
      "\n\tInt64List\022\016\n\006values\030\001 \003(\003\"\034\n\nUInt32Lis" +
      "t\022\016\n\006values\030\001 \003(\r\"\034\n\nUInt64List\022\016\n\006value" +
      "s\030\001 \003(\004\"\032\n\010BoolList\022\016\n\006values\030\001 \003(\010\"\034\n\nS" +
      "tringList\022\016\n\006values\030\001 \003(\t\"\033\n\tBytesList\022\016" +
      "\n\006values\030\001 \003(\014\".\n\007AnyList\022#\n\006values\030\001 \003(" +
      "\0132\023.qhx.proto.weve.Any\"w\n\006AnyMap\022,\n\003map\030" +
      "\001 \003(\0132\037.qhx.proto.weve.AnyMap.MapEntry\032?" +
      "\n\010MapEntry\022\013\n\003key\030\001 \001(\t\022\"\n\005value\030\002 \001(\0132\023" +
      ".qhx.proto.weve.Any:\0028\001\"\301\005\n\003Any\022\020\n\006doubl" +
      "e\030\001 \001(\001H\000\022\017\n\005float\030\002 \001(\002H\000\022\017\n\005int32\030\003 \001(" +
      "\005H\000\022\017\n\005int64\030\004 \001(\003H\000\022\020\n\006uint32\030\005 \001(\rH\000\022\020" +
      "\n\006uint64\030\006 \001(\004H\000\022\016\n\004bool\030\007 \001(\010H\000\022\020\n\006stri" +
      "ng\030\010 \001(\tH\000\022\017\n\005bytes\030\t \001(\014H\000\0221\n\013double_li" +
      "st\030\n \001(\0132\032.qhx.proto.weve.DoubleListH\000\022/" +
      "\n\nfloat_list\030\013 \001(\0132\031.qhx.proto.weve.Floa" +
      "tListH\000\022/\n\nint32_list\030\014 \001(\0132\031.qhx.proto." +
      "weve.Int32ListH\000\022/\n\nint64_list\030\r \001(\0132\031.q" +
      "hx.proto.weve.Int64ListH\000\0221\n\013uint32_list" +
      "\030\016 \001(\0132\032.qhx.proto.weve.UInt32ListH\000\0221\n\013" +
      "uint64_list\030\017 \001(\0132\032.qhx.proto.weve.UInt6" +
      "4ListH\000\022-\n\tbool_list\030\020 \001(\0132\030.qhx.proto.w" +
      "eve.BoolListH\000\0221\n\013string_list\030\021 \001(\0132\032.qh" +
      "x.proto.weve.StringListH\000\022/\n\nbytes_list\030" +
      "\022 \001(\0132\031.qhx.proto.weve.BytesListH\000\022+\n\010an" +
      "y_list\030\023 \001(\0132\027.qhx.proto.weve.AnyListH\000\022" +
      ")\n\007any_map\030\024 \001(\0132\026.qhx.proto.weve.AnyMap" +
      "H\000B\007\n\005valueB\027\n\023com.qhx.proto.eventP\001b\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_qhx_proto_weve_DoubleList_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_qhx_proto_weve_DoubleList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_qhx_proto_weve_DoubleList_descriptor,
        new String[] { "Values", });
    internal_static_qhx_proto_weve_FloatList_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_qhx_proto_weve_FloatList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_qhx_proto_weve_FloatList_descriptor,
        new String[] { "Values", });
    internal_static_qhx_proto_weve_Int32List_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_qhx_proto_weve_Int32List_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_qhx_proto_weve_Int32List_descriptor,
        new String[] { "Values", });
    internal_static_qhx_proto_weve_Int64List_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_qhx_proto_weve_Int64List_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_qhx_proto_weve_Int64List_descriptor,
        new String[] { "Values", });
    internal_static_qhx_proto_weve_UInt32List_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_qhx_proto_weve_UInt32List_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_qhx_proto_weve_UInt32List_descriptor,
        new String[] { "Values", });
    internal_static_qhx_proto_weve_UInt64List_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_qhx_proto_weve_UInt64List_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_qhx_proto_weve_UInt64List_descriptor,
        new String[] { "Values", });
    internal_static_qhx_proto_weve_BoolList_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_qhx_proto_weve_BoolList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_qhx_proto_weve_BoolList_descriptor,
        new String[] { "Values", });
    internal_static_qhx_proto_weve_StringList_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_qhx_proto_weve_StringList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_qhx_proto_weve_StringList_descriptor,
        new String[] { "Values", });
    internal_static_qhx_proto_weve_BytesList_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_qhx_proto_weve_BytesList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_qhx_proto_weve_BytesList_descriptor,
        new String[] { "Values", });
    internal_static_qhx_proto_weve_AnyList_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_qhx_proto_weve_AnyList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_qhx_proto_weve_AnyList_descriptor,
        new String[] { "Values", });
    internal_static_qhx_proto_weve_AnyMap_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_qhx_proto_weve_AnyMap_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_qhx_proto_weve_AnyMap_descriptor,
        new String[] { "Map", });
    internal_static_qhx_proto_weve_AnyMap_MapEntry_descriptor =
      internal_static_qhx_proto_weve_AnyMap_descriptor.getNestedTypes().get(0);
    internal_static_qhx_proto_weve_AnyMap_MapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_qhx_proto_weve_AnyMap_MapEntry_descriptor,
        new String[] { "Key", "Value", });
    internal_static_qhx_proto_weve_Any_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_qhx_proto_weve_Any_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_qhx_proto_weve_Any_descriptor,
        new String[] { "Double", "Float", "Int32", "Int64", "Uint32", "Uint64", "Bool", "String", "Bytes", "DoubleList", "FloatList", "Int32List", "Int64List", "Uint32List", "Uint64List", "BoolList", "StringList", "BytesList", "AnyList", "AnyMap", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
