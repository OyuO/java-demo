// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gte_message_sc.proto

package com.qhx.proto.event;

/**
 * Protobuf enum {@code qhx.proto.weve.gte.ScWifiAntennaControlMode}
 */
public enum ScWifiAntennaControlMode
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * 未知
   * </pre>
   *
   * <code>SC_WIFI_ANTENNA_MODE_UNKNOWN = 0;</code>
   */
  SC_WIFI_ANTENNA_MODE_UNKNOWN(0),
  /**
   * <pre>
   * 自动控制
   * </pre>
   *
   * <code>SC_WIFI_ANTENNA_MODE_AUTO = 1;</code>
   */
  SC_WIFI_ANTENNA_MODE_AUTO(1),
  /**
   * <pre>
   * 手动控制，绝对运动
   * </pre>
   *
   * <code>SC_WIFI_ANTENNA_MODE_MANUAL_ABS = 2;</code>
   */
  SC_WIFI_ANTENNA_MODE_MANUAL_ABS(2),
  /**
   * <pre>
   * 手动控制，相对运动
   * </pre>
   *
   * <code>SC_WIFI_ANTENNA_MODE_MANUAL_REL = 3;</code>
   */
  SC_WIFI_ANTENNA_MODE_MANUAL_REL(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * 未知
   * </pre>
   *
   * <code>SC_WIFI_ANTENNA_MODE_UNKNOWN = 0;</code>
   */
  public static final int SC_WIFI_ANTENNA_MODE_UNKNOWN_VALUE = 0;
  /**
   * <pre>
   * 自动控制
   * </pre>
   *
   * <code>SC_WIFI_ANTENNA_MODE_AUTO = 1;</code>
   */
  public static final int SC_WIFI_ANTENNA_MODE_AUTO_VALUE = 1;
  /**
   * <pre>
   * 手动控制，绝对运动
   * </pre>
   *
   * <code>SC_WIFI_ANTENNA_MODE_MANUAL_ABS = 2;</code>
   */
  public static final int SC_WIFI_ANTENNA_MODE_MANUAL_ABS_VALUE = 2;
  /**
   * <pre>
   * 手动控制，相对运动
   * </pre>
   *
   * <code>SC_WIFI_ANTENNA_MODE_MANUAL_REL = 3;</code>
   */
  public static final int SC_WIFI_ANTENNA_MODE_MANUAL_REL_VALUE = 3;


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
  public static ScWifiAntennaControlMode valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ScWifiAntennaControlMode forNumber(int value) {
    switch (value) {
      case 0: return SC_WIFI_ANTENNA_MODE_UNKNOWN;
      case 1: return SC_WIFI_ANTENNA_MODE_AUTO;
      case 2: return SC_WIFI_ANTENNA_MODE_MANUAL_ABS;
      case 3: return SC_WIFI_ANTENNA_MODE_MANUAL_REL;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ScWifiAntennaControlMode>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ScWifiAntennaControlMode> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ScWifiAntennaControlMode>() {
          public ScWifiAntennaControlMode findValueByNumber(int number) {
            return ScWifiAntennaControlMode.forNumber(number);
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
    return GteMessageSc.getDescriptor().getEnumTypes().get(1);
  }

  private static final ScWifiAntennaControlMode[] VALUES = values();

  public static ScWifiAntennaControlMode valueOf(
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

  private ScWifiAntennaControlMode(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:qhx.proto.weve.gte.ScWifiAntennaControlMode)
}

