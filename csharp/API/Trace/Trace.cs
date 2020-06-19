// <auto-generated>
//     Generated by the protocol buffer compiler.  DO NOT EDIT!
//     source: github.com/TheThingsNetwork/api/trace/trace.proto
// </auto-generated>
#pragma warning disable 1591, 0612, 3021
#region Designer generated code

using pb = global::Google.Protobuf;
using pbc = global::Google.Protobuf.Collections;
using pbr = global::Google.Protobuf.Reflection;
using scg = global::System.Collections.Generic;
namespace TheThingsNetwork.API.Trace {

  /// <summary>Holder for reflection information generated from github.com/TheThingsNetwork/api/trace/trace.proto</summary>
  public static partial class TraceReflection {

    #region Descriptor
    /// <summary>File descriptor for github.com/TheThingsNetwork/api/trace/trace.proto</summary>
    public static pbr::FileDescriptor Descriptor {
      get { return descriptor; }
    }
    private static pbr::FileDescriptor descriptor;

    static TraceReflection() {
      byte[] descriptorData = global::System.Convert.FromBase64String(
          string.Concat(
            "CjFnaXRodWIuY29tL1RoZVRoaW5nc05ldHdvcmsvYXBpL3RyYWNlL3RyYWNl",
            "LnByb3RvEgV0cmFjZRotZ2l0aHViLmNvbS9nb2dvL3Byb3RvYnVmL2dvZ29w",
            "cm90by9nb2dvLnByb3RvIu8BCgVUcmFjZRISCgJpZBgBIAEoCUIG4t4fAklE",
            "EgwKBHRpbWUYAiABKAMSIQoKc2VydmljZV9pZBgDIAEoCUIN4t4fCVNlcnZp",
            "Y2VJRBIUCgxzZXJ2aWNlX25hbWUYBCABKAkSDQoFZXZlbnQYBSABKAkSLAoI",
            "bWV0YWRhdGEYBiADKAsyGi50cmFjZS5UcmFjZS5NZXRhZGF0YUVudHJ5Eh0K",
            "B3BhcmVudHMYCyADKAsyDC50cmFjZS5UcmFjZRovCg1NZXRhZGF0YUVudHJ5",
            "EgsKA2tleRgBIAEoCRINCgV2YWx1ZRgCIAEoCToCOAFCcgoeb3JnLnRoZXRo",
            "aW5nc25ldHdvcmsuYXBpLnRyYWNlQgpUcmFjZVByb3RvUAFaJWdpdGh1Yi5j",
            "b20vVGhlVGhpbmdzTmV0d29yay9hcGkvdHJhY2WqAhpUaGVUaGluZ3NOZXR3",
            "b3JrLkFQSS5UcmFjZWIGcHJvdG8z"));
      descriptor = pbr::FileDescriptor.FromGeneratedCode(descriptorData,
          new pbr::FileDescriptor[] { global::Gogoproto.GogoReflection.Descriptor, },
          new pbr::GeneratedClrTypeInfo(null, null, new pbr::GeneratedClrTypeInfo[] {
            new pbr::GeneratedClrTypeInfo(typeof(global::TheThingsNetwork.API.Trace.Trace), global::TheThingsNetwork.API.Trace.Trace.Parser, new[]{ "Id", "Time", "ServiceId", "ServiceName", "Event", "Metadata", "Parents" }, null, null, null, new pbr::GeneratedClrTypeInfo[] { null, })
          }));
    }
    #endregion

  }
  #region Messages
  /// <summary>
  /// Trace information
  /// </summary>
  public sealed partial class Trace : pb::IMessage<Trace> {
    private static readonly pb::MessageParser<Trace> _parser = new pb::MessageParser<Trace>(() => new Trace());
    private pb::UnknownFieldSet _unknownFields;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pb::MessageParser<Trace> Parser { get { return _parser; } }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pbr::MessageDescriptor Descriptor {
      get { return global::TheThingsNetwork.API.Trace.TraceReflection.Descriptor.MessageTypes[0]; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    pbr::MessageDescriptor pb::IMessage.Descriptor {
      get { return Descriptor; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public Trace() {
      OnConstruction();
    }

    partial void OnConstruction();

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public Trace(Trace other) : this() {
      id_ = other.id_;
      time_ = other.time_;
      serviceId_ = other.serviceId_;
      serviceName_ = other.serviceName_;
      event_ = other.event_;
      metadata_ = other.metadata_.Clone();
      parents_ = other.parents_.Clone();
      _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public Trace Clone() {
      return new Trace(this);
    }

    /// <summary>Field number for the "id" field.</summary>
    public const int IdFieldNumber = 1;
    private string id_ = "";
    /// <summary>
    /// Generated ID
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public string Id {
      get { return id_; }
      set {
        id_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "time" field.</summary>
    public const int TimeFieldNumber = 2;
    private long time_;
    /// <summary>
    /// Time in Unix nanoseconds
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public long Time {
      get { return time_; }
      set {
        time_ = value;
      }
    }

    /// <summary>Field number for the "service_id" field.</summary>
    public const int ServiceIdFieldNumber = 3;
    private string serviceId_ = "";
    /// <summary>
    /// The ID of the component
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public string ServiceId {
      get { return serviceId_; }
      set {
        serviceId_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "service_name" field.</summary>
    public const int ServiceNameFieldNumber = 4;
    private string serviceName_ = "";
    /// <summary>
    /// The name of the component (router/broker/handler)
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public string ServiceName {
      get { return serviceName_; }
      set {
        serviceName_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "event" field.</summary>
    public const int EventFieldNumber = 5;
    private string event_ = "";
    /// <summary>
    /// Short event name
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public string Event {
      get { return event_; }
      set {
        event_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "metadata" field.</summary>
    public const int MetadataFieldNumber = 6;
    private static readonly pbc::MapField<string, string>.Codec _map_metadata_codec
        = new pbc::MapField<string, string>.Codec(pb::FieldCodec.ForString(10, ""), pb::FieldCodec.ForString(18, ""), 50);
    private readonly pbc::MapField<string, string> metadata_ = new pbc::MapField<string, string>();
    /// <summary>
    /// metadata for the event
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public pbc::MapField<string, string> Metadata {
      get { return metadata_; }
    }

    /// <summary>Field number for the "parents" field.</summary>
    public const int ParentsFieldNumber = 11;
    private static readonly pb::FieldCodec<global::TheThingsNetwork.API.Trace.Trace> _repeated_parents_codec
        = pb::FieldCodec.ForMessage(90, global::TheThingsNetwork.API.Trace.Trace.Parser);
    private readonly pbc::RepeatedField<global::TheThingsNetwork.API.Trace.Trace> parents_ = new pbc::RepeatedField<global::TheThingsNetwork.API.Trace.Trace>();
    /// <summary>
    /// Parents of the event
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public pbc::RepeatedField<global::TheThingsNetwork.API.Trace.Trace> Parents {
      get { return parents_; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override bool Equals(object other) {
      return Equals(other as Trace);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public bool Equals(Trace other) {
      if (ReferenceEquals(other, null)) {
        return false;
      }
      if (ReferenceEquals(other, this)) {
        return true;
      }
      if (Id != other.Id) return false;
      if (Time != other.Time) return false;
      if (ServiceId != other.ServiceId) return false;
      if (ServiceName != other.ServiceName) return false;
      if (Event != other.Event) return false;
      if (!Metadata.Equals(other.Metadata)) return false;
      if(!parents_.Equals(other.parents_)) return false;
      return Equals(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override int GetHashCode() {
      int hash = 1;
      if (Id.Length != 0) hash ^= Id.GetHashCode();
      if (Time != 0L) hash ^= Time.GetHashCode();
      if (ServiceId.Length != 0) hash ^= ServiceId.GetHashCode();
      if (ServiceName.Length != 0) hash ^= ServiceName.GetHashCode();
      if (Event.Length != 0) hash ^= Event.GetHashCode();
      hash ^= Metadata.GetHashCode();
      hash ^= parents_.GetHashCode();
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
      if (Id.Length != 0) {
        output.WriteRawTag(10);
        output.WriteString(Id);
      }
      if (Time != 0L) {
        output.WriteRawTag(16);
        output.WriteInt64(Time);
      }
      if (ServiceId.Length != 0) {
        output.WriteRawTag(26);
        output.WriteString(ServiceId);
      }
      if (ServiceName.Length != 0) {
        output.WriteRawTag(34);
        output.WriteString(ServiceName);
      }
      if (Event.Length != 0) {
        output.WriteRawTag(42);
        output.WriteString(Event);
      }
      metadata_.WriteTo(output, _map_metadata_codec);
      parents_.WriteTo(output, _repeated_parents_codec);
      if (_unknownFields != null) {
        _unknownFields.WriteTo(output);
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public int CalculateSize() {
      int size = 0;
      if (Id.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(Id);
      }
      if (Time != 0L) {
        size += 1 + pb::CodedOutputStream.ComputeInt64Size(Time);
      }
      if (ServiceId.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(ServiceId);
      }
      if (ServiceName.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(ServiceName);
      }
      if (Event.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(Event);
      }
      size += metadata_.CalculateSize(_map_metadata_codec);
      size += parents_.CalculateSize(_repeated_parents_codec);
      if (_unknownFields != null) {
        size += _unknownFields.CalculateSize();
      }
      return size;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void MergeFrom(Trace other) {
      if (other == null) {
        return;
      }
      if (other.Id.Length != 0) {
        Id = other.Id;
      }
      if (other.Time != 0L) {
        Time = other.Time;
      }
      if (other.ServiceId.Length != 0) {
        ServiceId = other.ServiceId;
      }
      if (other.ServiceName.Length != 0) {
        ServiceName = other.ServiceName;
      }
      if (other.Event.Length != 0) {
        Event = other.Event;
      }
      metadata_.Add(other.metadata_);
      parents_.Add(other.parents_);
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
            Id = input.ReadString();
            break;
          }
          case 16: {
            Time = input.ReadInt64();
            break;
          }
          case 26: {
            ServiceId = input.ReadString();
            break;
          }
          case 34: {
            ServiceName = input.ReadString();
            break;
          }
          case 42: {
            Event = input.ReadString();
            break;
          }
          case 50: {
            metadata_.AddEntriesFrom(input, _map_metadata_codec);
            break;
          }
          case 90: {
            parents_.AddEntriesFrom(input, _repeated_parents_codec);
            break;
          }
        }
      }
    }

  }

  #endregion

}

#endregion Designer generated code
