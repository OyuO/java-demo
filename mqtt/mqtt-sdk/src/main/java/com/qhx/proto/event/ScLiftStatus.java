// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gte_message_sc.proto

package com.qhx.proto.event;

/**
 * <pre>
 * SC 举升机构状态
 * </pre>
 *
 * Protobuf enum {@code qhx.proto.weve.gte.ScLiftStatus}
 */
public enum ScLiftStatus
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * 未知
   * </pre>
   *
   * <code>SC_LIFT_STATUS_UNKNOWN = 0;</code>
   */
  SC_LIFT_STATUS_UNKNOWN(0),
  /**
   * <pre>
   * 上升到顶端
   * </pre>
   *
   * <code>SC_LIFT_STATUS_UP = 1;</code>
   */
  SC_LIFT_STATUS_UP(1),
  /**
   * <pre>
   * 下降到底部
   * </pre>
   *
   * <code>SC_LIFT_STATUS_DOWN = 2;</code>
   */
  SC_LIFT_STATUS_DOWN(2),
  /**
   * <pre>
   * 停止
   * </pre>
   *
   * <code>SC_LIFT_STATUS_STOP = 3;</code>
   */
  SC_LIFT_STATUS_STOP(3),
  /**
   * <pre>
   * 运动中
   * </pre>
   *
   * <code>SC_LIFT_STATUS_MOVING = 4;</code>
   */
  SC_LIFT_STATUS_MOVING(4),
  /**
   * <pre>
   * 错误
   * </pre>
   *
   * <code>SC_LIFT_STATUS_ERROR = 5;</code>
   */
  SC_LIFT_STATUS_ERROR(5),
  /**
   * <pre>
   * 重置
   * </pre>
   *
   * <code>SC_LIFT_STATUS_RESET = 6;</code>
   */
  SC_LIFT_STATUS_RESET(6),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * 未知
   * </pre>
   *
   * <code>SC_LIFT_STATUS_UNKNOWN = 0;</code>
   */
  public static final int SC_LIFT_STATUS_UNKNOWN_VALUE = 0;
  /**
   * <pre>
   * 上升到顶端
   * </pre>
   *
   * <code>SC_LIFT_STATUS_UP = 1;</code>
   */
  public static final int SC_LIFT_STATUS_UP_VALUE = 1;
  /**
   * <pre>
   * 下降到底部
   * </pre>
   *
   * <code>SC_LIFT_STATUS_DOWN = 2;</code>
   */
  public static final int SC_LIFT_STATUS_DOWN_VALUE = 2;
  /**
   * <pre>
   * 停止
   * </pre>
   *
   * <code>SC_LIFT_STATUS_STOP = 3;</code>
   */
  public static final int SC_LIFT_STATUS_STOP_VALUE = 3;
  /**
   * <pre>
   * 运动中
   * </pre>
   *
   * <code>SC_LIFT_STATUS_MOVING = 4;</code>
   */
  public static final int SC_LIFT_STATUS_MOVING_VALUE = 4;
  /**
   * <pre>
   * 错误
   * </pre>
   *
   * <code>SC_LIFT_STATUS_ERROR = 5;</code>
   */
  public static final int SC_LIFT_STATUS_ERROR_VALUE = 5;
  /**
   * <pre>
   * 重置
   * </pre>
   *
   * <code>SC_LIFT_STATUS_RESET = 6;</code>
   */
  public static final int SC_LIFT_STATUS_RESET_VALUE = 6;


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
  public static ScLiftStatus valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ScLiftStatus forNumber(int value) {
    switch (value) {
      case 0: return SC_LIFT_STATUS_UNKNOWN;
      case 1: return SC_LIFT_STATUS_UP;
      case 2: return SC_LIFT_STATUS_DOWN;
      case 3: return SC_LIFT_STATUS_STOP;
      case 4: return SC_LIFT_STATUS_MOVING;
      case 5: return SC_LIFT_STATUS_ERROR;
      case 6: return SC_LIFT_STATUS_RESET;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ScLiftStatus>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ScLiftStatus> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ScLiftStatus>() {
          public ScLiftStatus findValueByNumber(int number) {
            return ScLiftStatus.forNumber(number);
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
    return GteMessageSc.getDescriptor().getEnumTypes().get(2);
  }

  private static final ScLiftStatus[] VALUES = values();

  public static ScLiftStatus valueOf(
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

  private ScLiftStatus(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:qhx.proto.weve.gte.ScLiftStatus)
}

