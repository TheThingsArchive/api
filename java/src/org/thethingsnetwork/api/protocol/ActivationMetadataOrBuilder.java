// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/TheThingsNetwork/api/protocol/protocol.proto

package org.thethingsnetwork.api.protocol;

public interface ActivationMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protocol.ActivationMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.lorawan.ActivationMetadata lorawan = 1;</code>
   * @return Whether the lorawan field is set.
   */
  boolean hasLorawan();
  /**
   * <code>.lorawan.ActivationMetadata lorawan = 1;</code>
   * @return The lorawan.
   */
  org.thethingsnetwork.api.protocol.lorawan.ActivationMetadata getLorawan();
  /**
   * <code>.lorawan.ActivationMetadata lorawan = 1;</code>
   */
  org.thethingsnetwork.api.protocol.lorawan.ActivationMetadataOrBuilder getLorawanOrBuilder();

  public org.thethingsnetwork.api.protocol.ActivationMetadata.ProtocolCase getProtocolCase();
}
