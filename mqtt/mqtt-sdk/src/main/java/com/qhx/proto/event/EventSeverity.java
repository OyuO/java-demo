// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: event.proto

package com.qhx.proto.event;

/**
 * <pre>
 * 事件严重程度
 * </pre>
 *
 * Protobuf enum {@code qhx.proto.weve.event.EventSeverity}
 */
public enum EventSeverity
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * 系统不可用
   * </pre>
   *
   * <code>EVENT_SEVERITY_EMERGENCY = 0;</code>
   */
  EVENT_SEVERITY_EMERGENCY(0),
  /**
   * <pre>
   * 告警，需要立即处理，非关键系统故障
   * </pre>
   *
   * <code>EVENT_SEVERITY_ALERT = 1;</code>
   */
  EVENT_SEVERITY_ALERT(1),
  /**
   * <pre>
   * 危急，必须立即处理，关键系统故障
   * </pre>
   *
   * <code>EVENT_SEVERITY_CRITICAL = 2;</code>
   */
  EVENT_SEVERITY_CRITICAL(2),
  /**
   * <pre>
   * 非紧急错误，冗余系统故障
   * </pre>
   *
   * <code>EVENT_SEVERITY_ERROR = 3;</code>
   */
  EVENT_SEVERITY_ERROR(3),
  /**
   * <pre>
   * 警告，一定时间内不解决可能成为错误
   * </pre>
   *
   * <code>EVENT_SEVERITY_WARNING = 4;</code>
   */
  EVENT_SEVERITY_WARNING(4),
  /**
   * <pre>
   * 非错误但需注意的状态
   * </pre>
   *
   * <code>EVENT_SEVERITY_NOTICE = 5;</code>
   */
  EVENT_SEVERITY_NOTICE(5),
  /**
   * <pre>
   * 正常信息
   * </pre>
   *
   * <code>EVENT_SEVERITY_INFO = 6;</code>
   */
  EVENT_SEVERITY_INFO(6),
  /**
   * <pre>
   * 调试信息
   * </pre>
   *
   * <code>EVENT_SEVERITY_DEBUG = 7;</code>
   */
  EVENT_SEVERITY_DEBUG(7),
  /**
   * <pre>
   * 调试跟踪信息
   * </pre>
   *
   * <code>EVENT_SEVERITY_TRACE = 8;</code>
   */
  EVENT_SEVERITY_TRACE(8),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * 系统不可用
   * </pre>
   *
   * <code>EVENT_SEVERITY_EMERGENCY = 0;</code>
   */
  public static final int EVENT_SEVERITY_EMERGENCY_VALUE = 0;
  /**
   * <pre>
   * 告警，需要立即处理，非关键系统故障
   * </pre>
   *
   * <code>EVENT_SEVERITY_ALERT = 1;</code>
   */
  public static final int EVENT_SEVERITY_ALERT_VALUE = 1;
  /**
   * <pre>
   * 危急，必须立即处理，关键系统故障
   * </pre>
   *
   * <code>EVENT_SEVERITY_CRITICAL = 2;</code>
   */
  public static final int EVENT_SEVERITY_CRITICAL_VALUE = 2;
  /**
   * <pre>
   * 非紧急错误，冗余系统故障
   * </pre>
   *
   * <code>EVENT_SEVERITY_ERROR = 3;</code>
   */
  public static final int EVENT_SEVERITY_ERROR_VALUE = 3;
  /**
   * <pre>
   * 警告，一定时间内不解决可能成为错误
   * </pre>
   *
   * <code>EVENT_SEVERITY_WARNING = 4;</code>
   */
  public static final int EVENT_SEVERITY_WARNING_VALUE = 4;
  /**
   * <pre>
   * 非错误但需注意的状态
   * </pre>
   *
   * <code>EVENT_SEVERITY_NOTICE = 5;</code>
   */
  public static final int EVENT_SEVERITY_NOTICE_VALUE = 5;
  /**
   * <pre>
   * 正常信息
   * </pre>
   *
   * <code>EVENT_SEVERITY_INFO = 6;</code>
   */
  public static final int EVENT_SEVERITY_INFO_VALUE = 6;
  /**
   * <pre>
   * 调试信息
   * </pre>
   *
   * <code>EVENT_SEVERITY_DEBUG = 7;</code>
   */
  public static final int EVENT_SEVERITY_DEBUG_VALUE = 7;
  /**
   * <pre>
   * 调试跟踪信息
   * </pre>
   *
   * <code>EVENT_SEVERITY_TRACE = 8;</code>
   */
  public static final int EVENT_SEVERITY_TRACE_VALUE = 8;


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
  public static EventSeverity valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static EventSeverity forNumber(int value) {
    switch (value) {
      case 0: return EVENT_SEVERITY_EMERGENCY;
      case 1: return EVENT_SEVERITY_ALERT;
      case 2: return EVENT_SEVERITY_CRITICAL;
      case 3: return EVENT_SEVERITY_ERROR;
      case 4: return EVENT_SEVERITY_WARNING;
      case 5: return EVENT_SEVERITY_NOTICE;
      case 6: return EVENT_SEVERITY_INFO;
      case 7: return EVENT_SEVERITY_DEBUG;
      case 8: return EVENT_SEVERITY_TRACE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<EventSeverity>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      EventSeverity> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<EventSeverity>() {
          public EventSeverity findValueByNumber(int number) {
            return EventSeverity.forNumber(number);
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
    return EventOuterClass.getDescriptor().getEnumTypes().get(1);
  }

  private static final EventSeverity[] VALUES = values();

  public static EventSeverity valueOf(
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

  private EventSeverity(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:qhx.proto.weve.event.EventSeverity)
}

