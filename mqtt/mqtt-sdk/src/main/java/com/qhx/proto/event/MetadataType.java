// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: metadata.proto

package com.qhx.proto.event;

/**
 * <pre>
 * 元数据类型
 * </pre>
 *
 * Protobuf enum {@code qhx.proto.weve.MetadataType}
 */
public enum MetadataType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>METADATA_TYPE_UNKNOWN = 0;</code>
   */
  METADATA_TYPE_UNKNOWN(0),
  /**
   * <pre>
   * 任务元数据
   * </pre>
   *
   * <code>METADATA_TYPE_TASK = 1;</code>
   */
  METADATA_TYPE_TASK(1),
  /**
   * <pre>
   * 触发器元数据
   * </pre>
   *
   * <code>METADATA_TYPE_TRIGGER = 2;</code>
   */
  METADATA_TYPE_TRIGGER(2),
  /**
   * <pre>
   * 动作元数据
   * </pre>
   *
   * <code>METADATA_TYPE_ACTION = 3;</code>
   */
  METADATA_TYPE_ACTION(3),
  /**
   * <pre>
   * 参考系元数据
   * </pre>
   *
   * <code>METADATA_TYPE_FRAME = 4;</code>
   */
  METADATA_TYPE_FRAME(4),
  /**
   * <pre>
   * 围栏元数据
   * </pre>
   *
   * <code>METADATA_TYPE_FENCE = 5;</code>
   */
  METADATA_TYPE_FENCE(5),
  /**
   * <pre>
   * 工作模式元数据
   * </pre>
   *
   * <code>METADATA_TYPE_PATTERN = 6;</code>
   */
  METADATA_TYPE_PATTERN(6),
  /**
   * <pre>
   * 路径点元数据
   * </pre>
   *
   * <code>METADATA_TYPE_WAYPOINT = 7;</code>
   */
  METADATA_TYPE_WAYPOINT(7),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>METADATA_TYPE_UNKNOWN = 0;</code>
   */
  public static final int METADATA_TYPE_UNKNOWN_VALUE = 0;
  /**
   * <pre>
   * 任务元数据
   * </pre>
   *
   * <code>METADATA_TYPE_TASK = 1;</code>
   */
  public static final int METADATA_TYPE_TASK_VALUE = 1;
  /**
   * <pre>
   * 触发器元数据
   * </pre>
   *
   * <code>METADATA_TYPE_TRIGGER = 2;</code>
   */
  public static final int METADATA_TYPE_TRIGGER_VALUE = 2;
  /**
   * <pre>
   * 动作元数据
   * </pre>
   *
   * <code>METADATA_TYPE_ACTION = 3;</code>
   */
  public static final int METADATA_TYPE_ACTION_VALUE = 3;
  /**
   * <pre>
   * 参考系元数据
   * </pre>
   *
   * <code>METADATA_TYPE_FRAME = 4;</code>
   */
  public static final int METADATA_TYPE_FRAME_VALUE = 4;
  /**
   * <pre>
   * 围栏元数据
   * </pre>
   *
   * <code>METADATA_TYPE_FENCE = 5;</code>
   */
  public static final int METADATA_TYPE_FENCE_VALUE = 5;
  /**
   * <pre>
   * 工作模式元数据
   * </pre>
   *
   * <code>METADATA_TYPE_PATTERN = 6;</code>
   */
  public static final int METADATA_TYPE_PATTERN_VALUE = 6;
  /**
   * <pre>
   * 路径点元数据
   * </pre>
   *
   * <code>METADATA_TYPE_WAYPOINT = 7;</code>
   */
  public static final int METADATA_TYPE_WAYPOINT_VALUE = 7;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @Deprecated
  public static MetadataType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static MetadataType forNumber(int value) {
    switch (value) {
      case 0: return METADATA_TYPE_UNKNOWN;
      case 1: return METADATA_TYPE_TASK;
      case 2: return METADATA_TYPE_TRIGGER;
      case 3: return METADATA_TYPE_ACTION;
      case 4: return METADATA_TYPE_FRAME;
      case 5: return METADATA_TYPE_FENCE;
      case 6: return METADATA_TYPE_PATTERN;
      case 7: return METADATA_TYPE_WAYPOINT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<MetadataType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      MetadataType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<MetadataType>() {
          public MetadataType findValueByNumber(int number) {
            return MetadataType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return MetadataOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final MetadataType[] VALUES = values();

  public static MetadataType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private MetadataType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:qhx.proto.weve.MetadataType)
}

