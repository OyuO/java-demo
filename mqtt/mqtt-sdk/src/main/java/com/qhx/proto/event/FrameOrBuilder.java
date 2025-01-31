// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: geo.proto

package com.qhx.proto.event;

public interface FrameOrBuilder extends
    // @@protoc_insertion_point(interface_extends:qhx.proto.weve.Frame)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 索引
   * </pre>
   *
   * <code>uint32 index = 1;</code>
   * @return The index.
   */
  int getIndex();

  /**
   * <pre>
   * 地图Id
   * </pre>
   *
   * <code>string map_id = 2;</code>
   * @return The mapId.
   */
  String getMapId();
  /**
   * <pre>
   * 地图Id
   * </pre>
   *
   * <code>string map_id = 2;</code>
   * @return The bytes for mapId.
   */
  com.google.protobuf.ByteString
      getMapIdBytes();

  /**
   * <pre>
   * 参考系类型
   * </pre>
   *
   * <code>.qhx.proto.weve.FrameType frame_type = 3;</code>
   * @return The enum numeric value on the wire for frameType.
   */
  int getFrameTypeValue();
  /**
   * <pre>
   * 参考系类型
   * </pre>
   *
   * <code>.qhx.proto.weve.FrameType frame_type = 3;</code>
   * @return The frameType.
   */
  FrameType getFrameType();

  /**
   * <pre>
   * 参考基准
   * 若参考系类型为`FRAME_TYPE_REF_`前缀，则需要设置此项，否则可不设置或按照如下设置：
   * ECEF坐标对应`FRAME_REF_EARTH_CENTER`，经纬度坐标对应`FRAME_REF_EARTH_GEODETIC_DATUM`
   * </pre>
   *
   * <code>.qhx.proto.weve.FrameRef frame_ref = 4;</code>
   * @return The enum numeric value on the wire for frameRef.
   */
  int getFrameRefValue();
  /**
   * <pre>
   * 参考基准
   * 若参考系类型为`FRAME_TYPE_REF_`前缀，则需要设置此项，否则可不设置或按照如下设置：
   * ECEF坐标对应`FRAME_REF_EARTH_CENTER`，经纬度坐标对应`FRAME_REF_EARTH_GEODETIC_DATUM`
   * </pre>
   *
   * <code>.qhx.proto.weve.FrameRef frame_ref = 4;</code>
   * @return The frameRef.
   */
  FrameRef getFrameRef();

  /**
   * <pre>
   * 高度参考基准
   * 此设置仅在经纬度坐标系中有意义，在笛卡尔坐标系中一般以±z轴为高
   * </pre>
   *
   * <code>.qhx.proto.weve.FrameRef altitude_ref = 5;</code>
   * @return The enum numeric value on the wire for altitudeRef.
   */
  int getAltitudeRefValue();
  /**
   * <pre>
   * 高度参考基准
   * 此设置仅在经纬度坐标系中有意义，在笛卡尔坐标系中一般以±z轴为高
   * </pre>
   *
   * <code>.qhx.proto.weve.FrameRef altitude_ref = 5;</code>
   * @return The altitudeRef.
   */
  FrameRef getAltitudeRef();

  /**
   * <pre>
   * 自定义参考位姿
   * 若参考系类型为`FRAME_TYPE_REF_`前缀，且参考基准为`FRAME_REF_POSE`时，则需要设置此项
   * 可表示当前参考系在其父参考系中的位姿，例如当前ENU参考系的原点在WGS84的经纬度坐标
   * </pre>
   *
   * <code>.qhx.proto.weve.Pose ref_pose = 6;</code>
   * @return Whether the refPose field is set.
   */
  boolean hasRefPose();
  /**
   * <pre>
   * 自定义参考位姿
   * 若参考系类型为`FRAME_TYPE_REF_`前缀，且参考基准为`FRAME_REF_POSE`时，则需要设置此项
   * 可表示当前参考系在其父参考系中的位姿，例如当前ENU参考系的原点在WGS84的经纬度坐标
   * </pre>
   *
   * <code>.qhx.proto.weve.Pose ref_pose = 6;</code>
   * @return The refPose.
   */
  Pose getRefPose();
  /**
   * <pre>
   * 自定义参考位姿
   * 若参考系类型为`FRAME_TYPE_REF_`前缀，且参考基准为`FRAME_REF_POSE`时，则需要设置此项
   * 可表示当前参考系在其父参考系中的位姿，例如当前ENU参考系的原点在WGS84的经纬度坐标
   * </pre>
   *
   * <code>.qhx.proto.weve.Pose ref_pose = 6;</code>
   */
  PoseOrBuilder getRefPoseOrBuilder();
}
