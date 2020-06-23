// <auto-generated>
//     Generated by the protocol buffer compiler.  DO NOT EDIT!
//     source: github.com/TheThingsNetwork/api/protocol/protocol.proto
// </auto-generated>
#pragma warning disable 1591, 0612, 3021
#region Designer generated code

using pb = global::Google.Protobuf;
using pbc = global::Google.Protobuf.Collections;
using pbr = global::Google.Protobuf.Reflection;
using scg = global::System.Collections.Generic;
namespace TheThingsNetwork.API.Protocol {

  /// <summary>Holder for reflection information generated from github.com/TheThingsNetwork/api/protocol/protocol.proto</summary>
  public static partial class ProtocolReflection {

    #region Descriptor
    /// <summary>File descriptor for github.com/TheThingsNetwork/api/protocol/protocol.proto</summary>
    public static pbr::FileDescriptor Descriptor {
      get { return descriptor; }
    }
    private static pbr::FileDescriptor descriptor;

    static ProtocolReflection() {
      byte[] descriptorData = global::System.Convert.FromBase64String(
          string.Concat(
            "CjdnaXRodWIuY29tL1RoZVRoaW5nc05ldHdvcmsvYXBpL3Byb3RvY29sL3By",
            "b3RvY29sLnByb3RvEghwcm90b2NvbBo+Z2l0aHViLmNvbS9UaGVUaGluZ3NO",
            "ZXR3b3JrL2FwaS9wcm90b2NvbC9sb3Jhd2FuL2xvcmF3YW4ucHJvdG8iOgoH",
            "TWVzc2FnZRIjCgdsb3Jhd2FuGAEgASgLMhAubG9yYXdhbi5NZXNzYWdlSABC",
            "CgoIcHJvdG9jb2wiPgoKUnhNZXRhZGF0YRIkCgdsb3Jhd2FuGAEgASgLMhEu",
            "bG9yYXdhbi5NZXRhZGF0YUgAQgoKCHByb3RvY29sIkoKD1R4Q29uZmlndXJh",
            "dGlvbhIrCgdsb3Jhd2FuGAEgASgLMhgubG9yYXdhbi5UeENvbmZpZ3VyYXRp",
            "b25IAEIKCghwcm90b2NvbCJQChJBY3RpdmF0aW9uTWV0YWRhdGESLgoHbG9y",
            "YXdhbhgBIAEoCzIbLmxvcmF3YW4uQWN0aXZhdGlvbk1ldGFkYXRhSABCCgoI",
            "cHJvdG9jb2xCfgohb3JnLnRoZXRoaW5nc25ldHdvcmsuYXBpLnByb3RvY29s",
            "Qg1Qcm90b2NvbFByb3RvUAFaKGdpdGh1Yi5jb20vVGhlVGhpbmdzTmV0d29y",
            "ay9hcGkvcHJvdG9jb2yqAh1UaGVUaGluZ3NOZXR3b3JrLkFQSS5Qcm90b2Nv",
            "bGIGcHJvdG8z"));
      descriptor = pbr::FileDescriptor.FromGeneratedCode(descriptorData,
          new pbr::FileDescriptor[] { global::TheThingsNetwork.API.LoRaWANProtocol.LorawanReflection.Descriptor, },
          new pbr::GeneratedClrTypeInfo(null, null, new pbr::GeneratedClrTypeInfo[] {
            new pbr::GeneratedClrTypeInfo(typeof(global::TheThingsNetwork.API.Protocol.Message), global::TheThingsNetwork.API.Protocol.Message.Parser, new[]{ "Lorawan" }, new[]{ "Protocol" }, null, null, null),
            new pbr::GeneratedClrTypeInfo(typeof(global::TheThingsNetwork.API.Protocol.RxMetadata), global::TheThingsNetwork.API.Protocol.RxMetadata.Parser, new[]{ "Lorawan" }, new[]{ "Protocol" }, null, null, null),
            new pbr::GeneratedClrTypeInfo(typeof(global::TheThingsNetwork.API.Protocol.TxConfiguration), global::TheThingsNetwork.API.Protocol.TxConfiguration.Parser, new[]{ "Lorawan" }, new[]{ "Protocol" }, null, null, null),
            new pbr::GeneratedClrTypeInfo(typeof(global::TheThingsNetwork.API.Protocol.ActivationMetadata), global::TheThingsNetwork.API.Protocol.ActivationMetadata.Parser, new[]{ "Lorawan" }, new[]{ "Protocol" }, null, null, null)
          }));
    }
    #endregion

  }
  #region Messages
  public sealed partial class Message : pb::IMessage<Message> {
    private static readonly pb::MessageParser<Message> _parser = new pb::MessageParser<Message>(() => new Message());
    private pb::UnknownFieldSet _unknownFields;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pb::MessageParser<Message> Parser { get { return _parser; } }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pbr::MessageDescriptor Descriptor {
      get { return global::TheThingsNetwork.API.Protocol.ProtocolReflection.Descriptor.MessageTypes[0]; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    pbr::MessageDescriptor pb::IMessage.Descriptor {
      get { return Descriptor; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public Message() {
      OnConstruction();
    }

    partial void OnConstruction();

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public Message(Message other) : this() {
      switch (other.ProtocolCase) {
        case ProtocolOneofCase.Lorawan:
          Lorawan = other.Lorawan.Clone();
          break;
      }

      _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public Message Clone() {
      return new Message(this);
    }

    /// <summary>Field number for the "lorawan" field.</summary>
    public const int LorawanFieldNumber = 1;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public global::TheThingsNetwork.API.LoRaWANProtocol.Message Lorawan {
      get { return protocolCase_ == ProtocolOneofCase.Lorawan ? (global::TheThingsNetwork.API.LoRaWANProtocol.Message) protocol_ : null; }
      set {
        protocol_ = value;
        protocolCase_ = value == null ? ProtocolOneofCase.None : ProtocolOneofCase.Lorawan;
      }
    }

    private object protocol_;
    /// <summary>Enum of possible cases for the "protocol" oneof.</summary>
    public enum ProtocolOneofCase {
      None = 0,
      Lorawan = 1,
    }
    private ProtocolOneofCase protocolCase_ = ProtocolOneofCase.None;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public ProtocolOneofCase ProtocolCase {
      get { return protocolCase_; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void ClearProtocol() {
      protocolCase_ = ProtocolOneofCase.None;
      protocol_ = null;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override bool Equals(object other) {
      return Equals(other as Message);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public bool Equals(Message other) {
      if (ReferenceEquals(other, null)) {
        return false;
      }
      if (ReferenceEquals(other, this)) {
        return true;
      }
      if (!object.Equals(Lorawan, other.Lorawan)) return false;
      if (ProtocolCase != other.ProtocolCase) return false;
      return Equals(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override int GetHashCode() {
      int hash = 1;
      if (protocolCase_ == ProtocolOneofCase.Lorawan) hash ^= Lorawan.GetHashCode();
      hash ^= (int) protocolCase_;
      if (_unknownFields != null) {
        hash ^= _unknownFields.GetHashCode();
      }
      return hash;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override string ToString() {
      return pb::JsonFormatter.ToDiagnosticString(this);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void WriteTo(pb::CodedOutputStream output) {
      if (protocolCase_ == ProtocolOneofCase.Lorawan) {
        output.WriteRawTag(10);
        output.WriteMessage(Lorawan);
      }
      if (_unknownFields != null) {
        _unknownFields.WriteTo(output);
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public int CalculateSize() {
      int size = 0;
      if (protocolCase_ == ProtocolOneofCase.Lorawan) {
        size += 1 + pb::CodedOutputStream.ComputeMessageSize(Lorawan);
      }
      if (_unknownFields != null) {
        size += _unknownFields.CalculateSize();
      }
      return size;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void MergeFrom(Message other) {
      if (other == null) {
        return;
      }
      switch (other.ProtocolCase) {
        case ProtocolOneofCase.Lorawan:
          if (Lorawan == null) {
            Lorawan = new global::TheThingsNetwork.API.LoRaWANProtocol.Message();
          }
          Lorawan.MergeFrom(other.Lorawan);
          break;
      }

      _unknownFields = pb::UnknownFieldSet.MergeFrom(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void MergeFrom(pb::CodedInputStream input) {
      uint tag;
      while ((tag = input.ReadTag()) != 0) {
        switch(tag) {
          default:
            _unknownFields = pb::UnknownFieldSet.MergeFieldFrom(_unknownFields, input);
            break;
          case 10: {
            global::TheThingsNetwork.API.LoRaWANProtocol.Message subBuilder = new global::TheThingsNetwork.API.LoRaWANProtocol.Message();
            if (protocolCase_ == ProtocolOneofCase.Lorawan) {
              subBuilder.MergeFrom(Lorawan);
            }
            input.ReadMessage(subBuilder);
            Lorawan = subBuilder;
            break;
          }
        }
      }
    }

  }

  public sealed partial class RxMetadata : pb::IMessage<RxMetadata> {
    private static readonly pb::MessageParser<RxMetadata> _parser = new pb::MessageParser<RxMetadata>(() => new RxMetadata());
    private pb::UnknownFieldSet _unknownFields;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pb::MessageParser<RxMetadata> Parser { get { return _parser; } }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pbr::MessageDescriptor Descriptor {
      get { return global::TheThingsNetwork.API.Protocol.ProtocolReflection.Descriptor.MessageTypes[1]; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    pbr::MessageDescriptor pb::IMessage.Descriptor {
      get { return Descriptor; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public RxMetadata() {
      OnConstruction();
    }

    partial void OnConstruction();

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public RxMetadata(RxMetadata other) : this() {
      switch (other.ProtocolCase) {
        case ProtocolOneofCase.Lorawan:
          Lorawan = other.Lorawan.Clone();
          break;
      }

      _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public RxMetadata Clone() {
      return new RxMetadata(this);
    }

    /// <summary>Field number for the "lorawan" field.</summary>
    public const int LorawanFieldNumber = 1;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public global::TheThingsNetwork.API.LoRaWANProtocol.Metadata Lorawan {
      get { return protocolCase_ == ProtocolOneofCase.Lorawan ? (global::TheThingsNetwork.API.LoRaWANProtocol.Metadata) protocol_ : null; }
      set {
        protocol_ = value;
        protocolCase_ = value == null ? ProtocolOneofCase.None : ProtocolOneofCase.Lorawan;
      }
    }

    private object protocol_;
    /// <summary>Enum of possible cases for the "protocol" oneof.</summary>
    public enum ProtocolOneofCase {
      None = 0,
      Lorawan = 1,
    }
    private ProtocolOneofCase protocolCase_ = ProtocolOneofCase.None;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public ProtocolOneofCase ProtocolCase {
      get { return protocolCase_; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void ClearProtocol() {
      protocolCase_ = ProtocolOneofCase.None;
      protocol_ = null;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override bool Equals(object other) {
      return Equals(other as RxMetadata);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public bool Equals(RxMetadata other) {
      if (ReferenceEquals(other, null)) {
        return false;
      }
      if (ReferenceEquals(other, this)) {
        return true;
      }
      if (!object.Equals(Lorawan, other.Lorawan)) return false;
      if (ProtocolCase != other.ProtocolCase) return false;
      return Equals(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override int GetHashCode() {
      int hash = 1;
      if (protocolCase_ == ProtocolOneofCase.Lorawan) hash ^= Lorawan.GetHashCode();
      hash ^= (int) protocolCase_;
      if (_unknownFields != null) {
        hash ^= _unknownFields.GetHashCode();
      }
      return hash;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override string ToString() {
      return pb::JsonFormatter.ToDiagnosticString(this);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void WriteTo(pb::CodedOutputStream output) {
      if (protocolCase_ == ProtocolOneofCase.Lorawan) {
        output.WriteRawTag(10);
        output.WriteMessage(Lorawan);
      }
      if (_unknownFields != null) {
        _unknownFields.WriteTo(output);
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public int CalculateSize() {
      int size = 0;
      if (protocolCase_ == ProtocolOneofCase.Lorawan) {
        size += 1 + pb::CodedOutputStream.ComputeMessageSize(Lorawan);
      }
      if (_unknownFields != null) {
        size += _unknownFields.CalculateSize();
      }
      return size;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void MergeFrom(RxMetadata other) {
      if (other == null) {
        return;
      }
      switch (other.ProtocolCase) {
        case ProtocolOneofCase.Lorawan:
          if (Lorawan == null) {
            Lorawan = new global::TheThingsNetwork.API.LoRaWANProtocol.Metadata();
          }
          Lorawan.MergeFrom(other.Lorawan);
          break;
      }

      _unknownFields = pb::UnknownFieldSet.MergeFrom(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void MergeFrom(pb::CodedInputStream input) {
      uint tag;
      while ((tag = input.ReadTag()) != 0) {
        switch(tag) {
          default:
            _unknownFields = pb::UnknownFieldSet.MergeFieldFrom(_unknownFields, input);
            break;
          case 10: {
            global::TheThingsNetwork.API.LoRaWANProtocol.Metadata subBuilder = new global::TheThingsNetwork.API.LoRaWANProtocol.Metadata();
            if (protocolCase_ == ProtocolOneofCase.Lorawan) {
              subBuilder.MergeFrom(Lorawan);
            }
            input.ReadMessage(subBuilder);
            Lorawan = subBuilder;
            break;
          }
        }
      }
    }

  }

  public sealed partial class TxConfiguration : pb::IMessage<TxConfiguration> {
    private static readonly pb::MessageParser<TxConfiguration> _parser = new pb::MessageParser<TxConfiguration>(() => new TxConfiguration());
    private pb::UnknownFieldSet _unknownFields;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pb::MessageParser<TxConfiguration> Parser { get { return _parser; } }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pbr::MessageDescriptor Descriptor {
      get { return global::TheThingsNetwork.API.Protocol.ProtocolReflection.Descriptor.MessageTypes[2]; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    pbr::MessageDescriptor pb::IMessage.Descriptor {
      get { return Descriptor; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public TxConfiguration() {
      OnConstruction();
    }

    partial void OnConstruction();

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public TxConfiguration(TxConfiguration other) : this() {
      switch (other.ProtocolCase) {
        case ProtocolOneofCase.Lorawan:
          Lorawan = other.Lorawan.Clone();
          break;
      }

      _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public TxConfiguration Clone() {
      return new TxConfiguration(this);
    }

    /// <summary>Field number for the "lorawan" field.</summary>
    public const int LorawanFieldNumber = 1;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public global::TheThingsNetwork.API.LoRaWANProtocol.TxConfiguration Lorawan {
      get { return protocolCase_ == ProtocolOneofCase.Lorawan ? (global::TheThingsNetwork.API.LoRaWANProtocol.TxConfiguration) protocol_ : null; }
      set {
        protocol_ = value;
        protocolCase_ = value == null ? ProtocolOneofCase.None : ProtocolOneofCase.Lorawan;
      }
    }

    private object protocol_;
    /// <summary>Enum of possible cases for the "protocol" oneof.</summary>
    public enum ProtocolOneofCase {
      None = 0,
      Lorawan = 1,
    }
    private ProtocolOneofCase protocolCase_ = ProtocolOneofCase.None;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public ProtocolOneofCase ProtocolCase {
      get { return protocolCase_; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void ClearProtocol() {
      protocolCase_ = ProtocolOneofCase.None;
      protocol_ = null;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override bool Equals(object other) {
      return Equals(other as TxConfiguration);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public bool Equals(TxConfiguration other) {
      if (ReferenceEquals(other, null)) {
        return false;
      }
      if (ReferenceEquals(other, this)) {
        return true;
      }
      if (!object.Equals(Lorawan, other.Lorawan)) return false;
      if (ProtocolCase != other.ProtocolCase) return false;
      return Equals(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override int GetHashCode() {
      int hash = 1;
      if (protocolCase_ == ProtocolOneofCase.Lorawan) hash ^= Lorawan.GetHashCode();
      hash ^= (int) protocolCase_;
      if (_unknownFields != null) {
        hash ^= _unknownFields.GetHashCode();
      }
      return hash;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override string ToString() {
      return pb::JsonFormatter.ToDiagnosticString(this);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void WriteTo(pb::CodedOutputStream output) {
      if (protocolCase_ == ProtocolOneofCase.Lorawan) {
        output.WriteRawTag(10);
        output.WriteMessage(Lorawan);
      }
      if (_unknownFields != null) {
        _unknownFields.WriteTo(output);
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public int CalculateSize() {
      int size = 0;
      if (protocolCase_ == ProtocolOneofCase.Lorawan) {
        size += 1 + pb::CodedOutputStream.ComputeMessageSize(Lorawan);
      }
      if (_unknownFields != null) {
        size += _unknownFields.CalculateSize();
      }
      return size;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void MergeFrom(TxConfiguration other) {
      if (other == null) {
        return;
      }
      switch (other.ProtocolCase) {
        case ProtocolOneofCase.Lorawan:
          if (Lorawan == null) {
            Lorawan = new global::TheThingsNetwork.API.LoRaWANProtocol.TxConfiguration();
          }
          Lorawan.MergeFrom(other.Lorawan);
          break;
      }

      _unknownFields = pb::UnknownFieldSet.MergeFrom(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void MergeFrom(pb::CodedInputStream input) {
      uint tag;
      while ((tag = input.ReadTag()) != 0) {
        switch(tag) {
          default:
            _unknownFields = pb::UnknownFieldSet.MergeFieldFrom(_unknownFields, input);
            break;
          case 10: {
            global::TheThingsNetwork.API.LoRaWANProtocol.TxConfiguration subBuilder = new global::TheThingsNetwork.API.LoRaWANProtocol.TxConfiguration();
            if (protocolCase_ == ProtocolOneofCase.Lorawan) {
              subBuilder.MergeFrom(Lorawan);
            }
            input.ReadMessage(subBuilder);
            Lorawan = subBuilder;
            break;
          }
        }
      }
    }

  }

  public sealed partial class ActivationMetadata : pb::IMessage<ActivationMetadata> {
    private static readonly pb::MessageParser<ActivationMetadata> _parser = new pb::MessageParser<ActivationMetadata>(() => new ActivationMetadata());
    private pb::UnknownFieldSet _unknownFields;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pb::MessageParser<ActivationMetadata> Parser { get { return _parser; } }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pbr::MessageDescriptor Descriptor {
      get { return global::TheThingsNetwork.API.Protocol.ProtocolReflection.Descriptor.MessageTypes[3]; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    pbr::MessageDescriptor pb::IMessage.Descriptor {
      get { return Descriptor; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public ActivationMetadata() {
      OnConstruction();
    }

    partial void OnConstruction();

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public ActivationMetadata(ActivationMetadata other) : this() {
      switch (other.ProtocolCase) {
        case ProtocolOneofCase.Lorawan:
          Lorawan = other.Lorawan.Clone();
          break;
      }

      _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public ActivationMetadata Clone() {
      return new ActivationMetadata(this);
    }

    /// <summary>Field number for the "lorawan" field.</summary>
    public const int LorawanFieldNumber = 1;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public global::TheThingsNetwork.API.LoRaWANProtocol.ActivationMetadata Lorawan {
      get { return protocolCase_ == ProtocolOneofCase.Lorawan ? (global::TheThingsNetwork.API.LoRaWANProtocol.ActivationMetadata) protocol_ : null; }
      set {
        protocol_ = value;
        protocolCase_ = value == null ? ProtocolOneofCase.None : ProtocolOneofCase.Lorawan;
      }
    }

    private object protocol_;
    /// <summary>Enum of possible cases for the "protocol" oneof.</summary>
    public enum ProtocolOneofCase {
      None = 0,
      Lorawan = 1,
    }
    private ProtocolOneofCase protocolCase_ = ProtocolOneofCase.None;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public ProtocolOneofCase ProtocolCase {
      get { return protocolCase_; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void ClearProtocol() {
      protocolCase_ = ProtocolOneofCase.None;
      protocol_ = null;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override bool Equals(object other) {
      return Equals(other as ActivationMetadata);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public bool Equals(ActivationMetadata other) {
      if (ReferenceEquals(other, null)) {
        return false;
      }
      if (ReferenceEquals(other, this)) {
        return true;
      }
      if (!object.Equals(Lorawan, other.Lorawan)) return false;
      if (ProtocolCase != other.ProtocolCase) return false;
      return Equals(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override int GetHashCode() {
      int hash = 1;
      if (protocolCase_ == ProtocolOneofCase.Lorawan) hash ^= Lorawan.GetHashCode();
      hash ^= (int) protocolCase_;
      if (_unknownFields != null) {
        hash ^= _unknownFields.GetHashCode();
      }
      return hash;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override string ToString() {
      return pb::JsonFormatter.ToDiagnosticString(this);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void WriteTo(pb::CodedOutputStream output) {
      if (protocolCase_ == ProtocolOneofCase.Lorawan) {
        output.WriteRawTag(10);
        output.WriteMessage(Lorawan);
      }
      if (_unknownFields != null) {
        _unknownFields.WriteTo(output);
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public int CalculateSize() {
      int size = 0;
      if (protocolCase_ == ProtocolOneofCase.Lorawan) {
        size += 1 + pb::CodedOutputStream.ComputeMessageSize(Lorawan);
      }
      if (_unknownFields != null) {
        size += _unknownFields.CalculateSize();
      }
      return size;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void MergeFrom(ActivationMetadata other) {
      if (other == null) {
        return;
      }
      switch (other.ProtocolCase) {
        case ProtocolOneofCase.Lorawan:
          if (Lorawan == null) {
            Lorawan = new global::TheThingsNetwork.API.LoRaWANProtocol.ActivationMetadata();
          }
          Lorawan.MergeFrom(other.Lorawan);
          break;
      }

      _unknownFields = pb::UnknownFieldSet.MergeFrom(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void MergeFrom(pb::CodedInputStream input) {
      uint tag;
      while ((tag = input.ReadTag()) != 0) {
        switch(tag) {
          default:
            _unknownFields = pb::UnknownFieldSet.MergeFieldFrom(_unknownFields, input);
            break;
          case 10: {
            global::TheThingsNetwork.API.LoRaWANProtocol.ActivationMetadata subBuilder = new global::TheThingsNetwork.API.LoRaWANProtocol.ActivationMetadata();
            if (protocolCase_ == ProtocolOneofCase.Lorawan) {
              subBuilder.MergeFrom(Lorawan);
            }
            input.ReadMessage(subBuilder);
            Lorawan = subBuilder;
            break;
          }
        }
      }
    }

  }

  #endregion

}

#endregion Designer generated code
