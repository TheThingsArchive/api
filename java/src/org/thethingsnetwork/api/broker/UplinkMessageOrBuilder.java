// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/TheThingsNetwork/api/broker/broker.proto

package org.thethingsnetwork.api.broker;

public interface UplinkMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:broker.UplinkMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bytes payload = 1;</code>
   * @return The payload.
   */
  com.google.protobuf.ByteString getPayload();

  /**
   * <code>.protocol.Message message = 2;</code>
   * @return Whether the message field is set.
   */
  boolean hasMessage();
  /**
   * <code>.protocol.Message message = 2;</code>
   * @return The message.
   */
  org.thethingsnetwork.api.protocol.Message getMessage();
  /**
   * <code>.protocol.Message message = 2;</code>
   */
  org.thethingsnetwork.api.protocol.MessageOrBuilder getMessageOrBuilder();

  /**
   * <code>bytes dev_eui = 11;</code>
   * @return The devEui.
   */
  com.google.protobuf.ByteString getDevEui();

  /**
   * <code>bytes app_eui = 12;</code>
   * @return The appEui.
   */
  com.google.protobuf.ByteString getAppEui();

  /**
   * <code>string app_id = 13;</code>
   * @return The appId.
   */
  java.lang.String getAppId();
  /**
   * <code>string app_id = 13;</code>
   * @return The bytes for appId.
   */
  com.google.protobuf.ByteString
      getAppIdBytes();

  /**
   * <code>string dev_id = 14;</code>
   * @return The devId.
   */
  java.lang.String getDevId();
  /**
   * <code>string dev_id = 14;</code>
   * @return The bytes for devId.
   */
  com.google.protobuf.ByteString
      getDevIdBytes();

  /**
   * <code>.protocol.RxMetadata protocol_metadata = 21;</code>
   * @return Whether the protocolMetadata field is set.
   */
  boolean hasProtocolMetadata();
  /**
   * <code>.protocol.RxMetadata protocol_metadata = 21;</code>
   * @return The protocolMetadata.
   */
  org.thethingsnetwork.api.protocol.RxMetadata getProtocolMetadata();
  /**
   * <code>.protocol.RxMetadata protocol_metadata = 21;</code>
   */
  org.thethingsnetwork.api.protocol.RxMetadataOrBuilder getProtocolMetadataOrBuilder();

  /**
   * <code>.gateway.RxMetadata gateway_metadata = 22;</code>
   * @return Whether the gatewayMetadata field is set.
   */
  boolean hasGatewayMetadata();
  /**
   * <code>.gateway.RxMetadata gateway_metadata = 22;</code>
   * @return The gatewayMetadata.
   */
  org.thethingsnetwork.api.gateway.RxMetadata getGatewayMetadata();
  /**
   * <code>.gateway.RxMetadata gateway_metadata = 22;</code>
   */
  org.thethingsnetwork.api.gateway.RxMetadataOrBuilder getGatewayMetadataOrBuilder();

  /**
   * <code>repeated .broker.DownlinkOption downlink_options = 31;</code>
   */
  java.util.List<org.thethingsnetwork.api.broker.DownlinkOption> 
      getDownlinkOptionsList();
  /**
   * <code>repeated .broker.DownlinkOption downlink_options = 31;</code>
   */
  org.thethingsnetwork.api.broker.DownlinkOption getDownlinkOptions(int index);
  /**
   * <code>repeated .broker.DownlinkOption downlink_options = 31;</code>
   */
  int getDownlinkOptionsCount();
  /**
   * <code>repeated .broker.DownlinkOption downlink_options = 31;</code>
   */
  java.util.List<? extends org.thethingsnetwork.api.broker.DownlinkOptionOrBuilder> 
      getDownlinkOptionsOrBuilderList();
  /**
   * <code>repeated .broker.DownlinkOption downlink_options = 31;</code>
   */
  org.thethingsnetwork.api.broker.DownlinkOptionOrBuilder getDownlinkOptionsOrBuilder(
      int index);

  /**
   * <code>.trace.Trace trace = 41;</code>
   * @return Whether the trace field is set.
   */
  boolean hasTrace();
  /**
   * <code>.trace.Trace trace = 41;</code>
   * @return The trace.
   */
  org.thethingsnetwork.api.trace.Trace getTrace();
  /**
   * <code>.trace.Trace trace = 41;</code>
   */
  org.thethingsnetwork.api.trace.TraceOrBuilder getTraceOrBuilder();
}
