// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: event.proto

package com.qhx.proto.event;

/**
 * <pre>
 * 事件来源
 * </pre>
 *
 * Protobuf enum {@code qhx.proto.weve.event.EventSource}
 */
public enum EventSource
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * 未知来源
   * </pre>
   *
   * <code>EVENT_SOURCE_UNKNOWN = 0;</code>
   */
  EVENT_SOURCE_UNKNOWN(0),
  /**
   * <pre>
   * 电源，包括电池、隔离电源、继电器等等电力基础设施
   * </pre>
   *
   * <code>EVENT_SOURCE_POWER = 1;</code>
   */
  EVENT_SOURCE_POWER(1),
  /**
   * <pre>
   * 网络，4G网关、路由、交换机等等网络基础设施
   * </pre>
   *
   * <code>EVENT_SOURCE_NETWORKING = 2;</code>
   */
  EVENT_SOURCE_NETWORKING(2),
  /**
   * <pre>
   * 安全系统，认证授权、开盖监控等安全功能
   * </pre>
   *
   * <code>EVENT_SOURCE_SECURITY = 3;</code>
   */
  EVENT_SOURCE_SECURITY(3),
  /**
   * <pre>
   * 更新系统，软件、固件更新功能
   * </pre>
   *
   * <code>EVENT_SOURCE_UPDATE = 4;</code>
   */
  EVENT_SOURCE_UPDATE(4),
  /**
   * <pre>
   * 任务系统，任务调度器
   * </pre>
   *
   * <code>EVENT_SOURCE_TASK = 5;</code>
   */
  EVENT_SOURCE_TASK(5),
  /**
   * <pre>
   * 导航系统，定位、建图、路径规划
   * </pre>
   *
   * <code>EVENT_SOURCE_NAVIGATION = 6;</code>
   */
  EVENT_SOURCE_NAVIGATION(6),
  /**
   * <pre>
   * 运动系统，运动控制与状态监视
   * </pre>
   *
   * <code>EVENT_SOURCE_MOTION = 7;</code>
   */
  EVENT_SOURCE_MOTION(7),
  /**
   * <pre>
   * 喷洒系统，喷洒控制与状态监视
   * </pre>
   *
   * <code>EVENT_SOURCE_SPRAY = 8;</code>
   */
  EVENT_SOURCE_SPRAY(8),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * 未知来源
   * </pre>
   *
   * <code>EVENT_SOURCE_UNKNOWN = 0;</code>
   */
  public static final int EVENT_SOURCE_UNKNOWN_VALUE = 0;
  /**
   * <pre>
   * 电源，包括电池、隔离电源、继电器等等电力基础设施
   * </pre>
   *
   * <code>EVENT_SOURCE_POWER = 1;</code>
   */
  public static final int EVENT_SOURCE_POWER_VALUE = 1;
  /**
   * <pre>
   * 网络，4G网关、路由、交换机等等网络基础设施
   * </pre>
   *
   * <code>EVENT_SOURCE_NETWORKING = 2;</code>
   */
  public static final int EVENT_SOURCE_NETWORKING_VALUE = 2;
  /**
   * <pre>
   * 安全系统，认证授权、开盖监控等安全功能
   * </pre>
   *
   * <code>EVENT_SOURCE_SECURITY = 3;</code>
   */
  public static final int EVENT_SOURCE_SECURITY_VALUE = 3;
  /**
   * <pre>
   * 更新系统，软件、固件更新功能
   * </pre>
   *
   * <code>EVENT_SOURCE_UPDATE = 4;</code>
   */
  public static final int EVENT_SOURCE_UPDATE_VALUE = 4;
  /**
   * <pre>
   * 任务系统，任务调度器
   * </pre>
   *
   * <code>EVENT_SOURCE_TASK = 5;</code>
   */
  public static final int EVENT_SOURCE_TASK_VALUE = 5;
  /**
   * <pre>
   * 导航系统，定位、建图、路径规划
   * </pre>
   *
   * <code>EVENT_SOURCE_NAVIGATION = 6;</code>
   */
  public static final int EVENT_SOURCE_NAVIGATION_VALUE = 6;
  /**
   * <pre>
   * 运动系统，运动控制与状态监视
   * </pre>
   *
   * <code>EVENT_SOURCE_MOTION = 7;</code>
   */
  public static final int EVENT_SOURCE_MOTION_VALUE = 7;
  /**
   * <pre>
   * 喷洒系统，喷洒控制与状态监视
   * </pre>
   *
   * <code>EVENT_SOURCE_SPRAY = 8;</code>
   */
  public static final int EVENT_SOURCE_SPRAY_VALUE = 8;


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
  public static EventSource valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static EventSource forNumber(int value) {
    switch (value) {
      case 0: return EVENT_SOURCE_UNKNOWN;
      case 1: return EVENT_SOURCE_POWER;
      case 2: return EVENT_SOURCE_NETWORKING;
      case 3: return EVENT_SOURCE_SECURITY;
      case 4: return EVENT_SOURCE_UPDATE;
      case 5: return EVENT_SOURCE_TASK;
      case 6: return EVENT_SOURCE_NAVIGATION;
      case 7: return EVENT_SOURCE_MOTION;
      case 8: return EVENT_SOURCE_SPRAY;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<EventSource>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      EventSource> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<EventSource>() {
          public EventSource findValueByNumber(int number) {
            return EventSource.forNumber(number);
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
    return EventOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final EventSource[] VALUES = values();

  public static EventSource valueOf(
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

  private EventSource(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:qhx.proto.weve.event.EventSource)
}

