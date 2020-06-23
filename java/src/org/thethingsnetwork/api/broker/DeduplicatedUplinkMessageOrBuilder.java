// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/TheThingsNetwork/api/broker/broker.proto

package org.thethingsnetwork.api.broker;

public interface DeduplicatedUplinkMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:broker.DeduplicatedUplinkMessage)
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
   * <code>repeated .gateway.RxMetadata gateway_metadata = 22;</code>
   */
  java.util.List<org.thethingsnetwork.api.gateway.RxMetadata> 
      getGatewayMetadataList();
  /**
   * <code>repeated .gateway.RxMetadata gateway_metadata = 22;</code>
   */
  org.thethingsnetwork.api.gateway.RxMetadata getGatewayMetadata(int index);
  /**
   * <code>repeated .gateway.RxMetadata gateway_metadata = 22;</code>
   */
  int getGatewayMetadataCount();
  /**
   * <code>repeated .gateway.RxMetadata gateway_metadata = 22;</code>
   */
  java.util.List<? extends org.thethingsnetwork.api.gateway.RxMetadataOrBuilder> 
      getGatewayMetadataOrBuilderList();
  /**
   * <code>repeated .gateway.RxMetadata gateway_metadata = 22;</code>
   */
  org.thethingsnetwork.api.gateway.RxMetadataOrBuilder getGatewayMetadataOrBuilder(
      int index);

  /**
   * <code>int64 server_time = 23;</code>
   * @return The serverTime.
   */
  long getServerTime();

  /**
   * <code>.broker.DownlinkMessage response_template = 31;</code>
   * @return Whether the responseTemplate field is set.
   */
  boolean hasResponseTemplate();
  /**
   * <code>.broker.DownlinkMessage response_template = 31;</code>
   * @return The responseTemplate.
   */
  org.thethingsnetwork.api.broker.DownlinkMessage getResponseTemplate();
  /**
   * <code>.broker.DownlinkMessage response_template = 31;</code>
   */
  org.thethingsnetwork.api.broker.DownlinkMessageOrBuilder getResponseTemplateOrBuilder();

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
