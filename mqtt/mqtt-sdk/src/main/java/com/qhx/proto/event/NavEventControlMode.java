// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: event_nav.proto

package com.qhx.proto.event;

/**
 * Protobuf enum {@code qhx.proto.weve.event.odometry.NavEventControlMode}
 */
public enum NavEventControlMode
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   *未知
   * </pre>
   *
   * <code>CONTROL_MODE_UNKNOWN = 0;</code>
   */
  CONTROL_MODE_UNKNOWN(0),
  /**
   * <pre>
   *离线
   * </pre>
   *
   * <code>CONTROL_MODE_OFFLINE = 1;</code>
   */
  CONTROL_MODE_OFFLINE(1),
  /**
   * <pre>
   *debug
   * </pre>
   *
   * <code>CONTROL_MODE_DEBUG = 2;</code>
   */
  CONTROL_MODE_DEBUG(2),
  /**
   * <pre>
   *遥控控制
   * </pre>
   *
   * <code>CONTROL_MODE_RC = 3;</code>
   */
  CONTROL_MODE_RC(3),
  /**
   * <pre>
   *自动控制
   * </pre>
   *
   * <code>CONTROL_MODE_GNC = 4;</code>
   */
  CONTROL_MODE_GNC(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   *未知
   * </pre>
   *
   * <code>CONTROL_MODE_UNKNOWN = 0;</code>
   */
  public static final int CONTROL_MODE_UNKNOWN_VALUE = 0;
  /**
   * <pre>
   *离线
   * </pre>
   *
   * <code>CONTROL_MODE_OFFLINE = 1;</code>
   */
  public static final int CONTROL_MODE_OFFLINE_VALUE = 1;
  /**
   * <pre>
   *debug
   * </pre>
   *
   * <code>CONTROL_MODE_DEBUG = 2;</code>
   */
  public static final int CONTROL_MODE_DEBUG_VALUE = 2;
  /**
   * <pre>
   *遥控控制
   * </pre>
   *
   * <code>CONTROL_MODE_RC = 3;</code>
   */
  public static final int CONTROL_MODE_RC_VALUE = 3;
  /**
   * <pre>
   *自动控制
   * </pre>
   *
   * <code>CONTROL_MODE_GNC = 4;</code>
   */
  public static final int CONTROL_MODE_GNC_VALUE = 4;


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
  public static NavEventControlMode valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static NavEventControlMode forNumber(int value) {
    switch (value) {
      case 0: return CONTROL_MODE_UNKNOWN;
      case 1: return CONTROL_MODE_OFFLINE;
      case 2: return CONTROL_MODE_DEBUG;
      case 3: return CONTROL_MODE_RC;
      case 4: return CONTROL_MODE_GNC;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<NavEventControlMode>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      NavEventControlMode> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<NavEventControlMode>() {
          public NavEventControlMode findValueByNumber(int number) {
            return NavEventControlMode.forNumber(number);
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
    return EventNav.getDescriptor().getEnumTypes().get(2);
  }

  private static final NavEventControlMode[] VALUES = values();

  public static NavEventControlMode valueOf(
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

  private NavEventControlMode(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:qhx.proto.weve.event.odometry.NavEventControlMode)
}

