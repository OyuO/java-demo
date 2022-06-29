// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: geo.proto

package com.qhx.proto.event;

/**
 * <pre>
 * 参考系参考基准
 * </pre>
 *
 * Protobuf enum {@code qhx.proto.weve.FrameRef}
 */
public enum FrameRef
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>FRAME_REF_UNKNOWN = 0;</code>
   */
  FRAME_REF_UNKNOWN(0, 0),
  /**
   * <pre>
   * 自身参考系
   * </pre>
   *
   * <code>FRAME_REF_BODY = 1;</code>
   */
  FRAME_REF_BODY(1, 1),
  /**
   * <pre>
   * 地心参考系
   * </pre>
   *
   * <code>FRAME_REF_EARTH_CENTER = 2;</code>
   */
  FRAME_REF_EARTH_CENTER(2, 2),
  /**
   * <pre>
   * 大地基准面参考系，椭球面
   * </pre>
   *
   * <code>FRAME_REF_EARTH_GEODETIC_DATUM = 3;</code>
   */
  FRAME_REF_EARTH_GEODETIC_DATUM(3, 3),
  /**
   * <pre>
   * 大地水准面参考系，不规则椭球面，EGM96、EGM2008
   * </pre>
   *
   * <code>FRAME_REF_EARTH_GEOID = 4;</code>
   */
  FRAME_REF_EARTH_GEOID(6, 4),
  /**
   * <pre>
   * 地形参考系，不规则椭球面
   * </pre>
   *
   * <code>FRAME_REF_EARTH_TERRAIN = 5;</code>
   */
  FRAME_REF_EARTH_TERRAIN(9, 5),
  /**
   * <pre>
   * 平台参考系
   * </pre>
   *
   * <code>FRAME_REF_PLATFORM = 16;</code>
   */
  FRAME_REF_PLATFORM(12, 16),
  /**
   * <pre>
   * 载荷参考系
   * </pre>
   *
   * <code>FRAME_REF_PAYLOAD = 17;</code>
   */
  FRAME_REF_PAYLOAD(13, 17),
  /**
   * <pre>
   * 自定义参考系
   * </pre>
   *
   * <code>FRAME_REF_POSE = 32;</code>
   */
  FRAME_REF_POSE(14, 32),
  UNRECOGNIZED(-1, -1),
  ;

  /**
   * <pre>
   * Ellipsoidal Height, 大地高程
   * </pre>
   *
   * <code>FRAME_REF_HEIGHT_ELLIPSOIDAL = 3;</code>
   */
  public static final FrameRef FRAME_REF_HEIGHT_ELLIPSOIDAL = FRAME_REF_EARTH_GEODETIC_DATUM;
  /**
   * <pre>
   * HAE 高度，Height Above Ellipsoid，Ellipsoidal Height
   * </pre>
   *
   * <code>FRAME_REF_ALT_HAE = 3;</code>
   */
  public static final FrameRef FRAME_REF_ALT_HAE = FRAME_REF_EARTH_GEODETIC_DATUM;
  /**
   * <pre>
   * Orthometric Height, 正高
   * </pre>
   *
   * <code>FRAME_REF_HEIGHT_ORTHOMETRIC = 4;</code>
   */
  public static final FrameRef FRAME_REF_HEIGHT_ORTHOMETRIC = FRAME_REF_EARTH_GEOID;
  /**
   * <pre>
   * AMSL 高度，height Above Mean Sea Level，Orthometric Height
   * </pre>
   *
   * <code>FRAME_REF_ALT_AMSL = 4;</code>
   */
  public static final FrameRef FRAME_REF_ALT_AMSL = FRAME_REF_EARTH_GEOID;
  /**
   * <pre>
   * Topographic Surface Height
   * </pre>
   *
   * <code>FRAME_REF_HEIGHT_TOPOGRAPHIC_SURFACE = 5;</code>
   */
  public static final FrameRef FRAME_REF_HEIGHT_TOPOGRAPHIC_SURFACE = FRAME_REF_EARTH_TERRAIN;
  /**
   * <pre>
   * AGL 高度，Above Ground Level
   * </pre>
   *
   * <code>FRAME_REF_ALT_AGL = 5;</code>
   */
  public static final FrameRef FRAME_REF_ALT_AGL = FRAME_REF_EARTH_TERRAIN;
  /**
   * <code>FRAME_REF_UNKNOWN = 0;</code>
   */
  public static final int FRAME_REF_UNKNOWN_VALUE = 0;
  /**
   * <pre>
   * 自身参考系
   * </pre>
   *
   * <code>FRAME_REF_BODY = 1;</code>
   */
  public static final int FRAME_REF_BODY_VALUE = 1;
  /**
   * <pre>
   * 地心参考系
   * </pre>
   *
   * <code>FRAME_REF_EARTH_CENTER = 2;</code>
   */
  public static final int FRAME_REF_EARTH_CENTER_VALUE = 2;
  /**
   * <pre>
   * 大地基准面参考系，椭球面
   * </pre>
   *
   * <code>FRAME_REF_EARTH_GEODETIC_DATUM = 3;</code>
   */
  public static final int FRAME_REF_EARTH_GEODETIC_DATUM_VALUE = 3;
  /**
   * <pre>
   * Ellipsoidal Height, 大地高程
   * </pre>
   *
   * <code>FRAME_REF_HEIGHT_ELLIPSOIDAL = 3;</code>
   */
  public static final int FRAME_REF_HEIGHT_ELLIPSOIDAL_VALUE = 3;
  /**
   * <pre>
   * HAE 高度，Height Above Ellipsoid，Ellipsoidal Height
   * </pre>
   *
   * <code>FRAME_REF_ALT_HAE = 3;</code>
   */
  public static final int FRAME_REF_ALT_HAE_VALUE = 3;
  /**
   * <pre>
   * 大地水准面参考系，不规则椭球面，EGM96、EGM2008
   * </pre>
   *
   * <code>FRAME_REF_EARTH_GEOID = 4;</code>
   */
  public static final int FRAME_REF_EARTH_GEOID_VALUE = 4;
  /**
   * <pre>
   * Orthometric Height, 正高
   * </pre>
   *
   * <code>FRAME_REF_HEIGHT_ORTHOMETRIC = 4;</code>
   */
  public static final int FRAME_REF_HEIGHT_ORTHOMETRIC_VALUE = 4;
  /**
   * <pre>
   * AMSL 高度，height Above Mean Sea Level，Orthometric Height
   * </pre>
   *
   * <code>FRAME_REF_ALT_AMSL = 4;</code>
   */
  public static final int FRAME_REF_ALT_AMSL_VALUE = 4;
  /**
   * <pre>
   * 地形参考系，不规则椭球面
   * </pre>
   *
   * <code>FRAME_REF_EARTH_TERRAIN = 5;</code>
   */
  public static final int FRAME_REF_EARTH_TERRAIN_VALUE = 5;
  /**
   * <pre>
   * Topographic Surface Height
   * </pre>
   *
   * <code>FRAME_REF_HEIGHT_TOPOGRAPHIC_SURFACE = 5;</code>
   */
  public static final int FRAME_REF_HEIGHT_TOPOGRAPHIC_SURFACE_VALUE = 5;
  /**
   * <pre>
   * AGL 高度，Above Ground Level
   * </pre>
   *
   * <code>FRAME_REF_ALT_AGL = 5;</code>
   */
  public static final int FRAME_REF_ALT_AGL_VALUE = 5;
  /**
   * <pre>
   * 平台参考系
   * </pre>
   *
   * <code>FRAME_REF_PLATFORM = 16;</code>
   */
  public static final int FRAME_REF_PLATFORM_VALUE = 16;
  /**
   * <pre>
   * 载荷参考系
   * </pre>
   *
   * <code>FRAME_REF_PAYLOAD = 17;</code>
   */
  public static final int FRAME_REF_PAYLOAD_VALUE = 17;
  /**
   * <pre>
   * 自定义参考系
   * </pre>
   *
   * <code>FRAME_REF_POSE = 32;</code>
   */
  public static final int FRAME_REF_POSE_VALUE = 32;


  public final int getNumber() {
    if (index == -1) {
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
  public static FrameRef valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static FrameRef forNumber(int value) {
    switch (value) {
      case 0: return FRAME_REF_UNKNOWN;
      case 1: return FRAME_REF_BODY;
      case 2: return FRAME_REF_EARTH_CENTER;
      case 3: return FRAME_REF_EARTH_GEODETIC_DATUM;
      case 4: return FRAME_REF_EARTH_GEOID;
      case 5: return FRAME_REF_EARTH_TERRAIN;
      case 16: return FRAME_REF_PLATFORM;
      case 17: return FRAME_REF_PAYLOAD;
      case 32: return FRAME_REF_POSE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<FrameRef>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      FrameRef> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<FrameRef>() {
          public FrameRef findValueByNumber(int number) {
            return FrameRef.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (index == -1) {
      throw new IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(index);
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return Geo.getDescriptor().getEnumTypes().get(0);
  }

  private static final FrameRef[] VALUES = getStaticValuesArray();
  private static FrameRef[] getStaticValuesArray() {
    return new FrameRef[] {
      FRAME_REF_UNKNOWN, FRAME_REF_BODY, FRAME_REF_EARTH_CENTER, FRAME_REF_EARTH_GEODETIC_DATUM, FRAME_REF_HEIGHT_ELLIPSOIDAL, FRAME_REF_ALT_HAE, FRAME_REF_EARTH_GEOID, FRAME_REF_HEIGHT_ORTHOMETRIC, FRAME_REF_ALT_AMSL, FRAME_REF_EARTH_TERRAIN, FRAME_REF_HEIGHT_TOPOGRAPHIC_SURFACE, FRAME_REF_ALT_AGL, FRAME_REF_PLATFORM, FRAME_REF_PAYLOAD, FRAME_REF_POSE, 
    };
  }
  public static FrameRef valueOf(
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

  private final int index;
  private final int value;

  private FrameRef(int index, int value) {
    this.index = index;
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:qhx.proto.weve.FrameRef)
}

