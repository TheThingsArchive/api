// <auto-generated>
//     Generated by the protocol buffer compiler.  DO NOT EDIT!
//     source: github.com/TheThingsNetwork/api/protocol/lorawan/device.proto
// </auto-generated>
#pragma warning disable 1591, 0612, 3021
#region Designer generated code

using pb = global::Google.Protobuf;
using pbc = global::Google.Protobuf.Collections;
using pbr = global::Google.Protobuf.Reflection;
using scg = global::System.Collections.Generic;
namespace TheThingsNetwork.API.LoRaWANProtocol {

  /// <summary>Holder for reflection information generated from github.com/TheThingsNetwork/api/protocol/lorawan/device.proto</summary>
  public static partial class DeviceReflection {

    #region Descriptor
    /// <summary>File descriptor for github.com/TheThingsNetwork/api/protocol/lorawan/device.proto</summary>
    public static pbr::FileDescriptor Descriptor {
      get { return descriptor; }
    }
    private static pbr::FileDescriptor descriptor;

    static DeviceReflection() {
      byte[] descriptorData = global::System.Convert.FromBase64String(
          string.Concat(
            "Cj1naXRodWIuY29tL1RoZVRoaW5nc05ldHdvcmsvYXBpL3Byb3RvY29sL2xv",
            "cmF3YW4vZGV2aWNlLnByb3RvEgdsb3Jhd2FuGhtnb29nbGUvcHJvdG9idWYv",
            "ZW1wdHkucHJvdG8aLWdpdGh1Yi5jb20vZ29nby9wcm90b2J1Zi9nb2dvcHJv",
            "dG8vZ29nby5wcm90byK+AQoQRGV2aWNlSWRlbnRpZmllchJUCgdhcHBfZXVp",
            "GAEgASgMQkPi3h8GQXBwRVVJyN4fANreHzFnaXRodWIuY29tL1RoZVRoaW5n",
            "c05ldHdvcmsvdHRuL2NvcmUvdHlwZXMuQXBwRVVJElQKB2Rldl9ldWkYAiAB",
            "KAxCQ+LeHwZEZXZFVUnI3h8A2t4fMWdpdGh1Yi5jb20vVGhlVGhpbmdzTmV0",
            "d29yay90dG4vY29yZS90eXBlcy5EZXZFVUkixgYKBkRldmljZRJUCgdhcHBf",
            "ZXVpGAEgASgMQkPi3h8GQXBwRVVJyN4fANreHzFnaXRodWIuY29tL1RoZVRo",
            "aW5nc05ldHdvcmsvdHRuL2NvcmUvdHlwZXMuQXBwRVVJElQKB2Rldl9ldWkY",
            "AiABKAxCQ+LeHwZEZXZFVUnI3h8A2t4fMWdpdGh1Yi5jb20vVGhlVGhpbmdz",
            "TmV0d29yay90dG4vY29yZS90eXBlcy5EZXZFVUkSGQoGYXBwX2lkGAMgASgJ",
            "Qgni3h8FQXBwSUQSGQoGZGV2X2lkGAQgASgJQgni3h8FRGV2SUQSSAoIZGV2",
            "X2FkZHIYBSABKAxCNtreHzJnaXRodWIuY29tL1RoZVRoaW5nc05ldHdvcmsv",
            "dHRuL2NvcmUvdHlwZXMuRGV2QWRkchJJCglud2tfc19rZXkYBiABKAxCNtre",
            "HzJnaXRodWIuY29tL1RoZVRoaW5nc05ldHdvcmsvdHRuL2NvcmUvdHlwZXMu",
            "TndrU0tleRJJCglhcHBfc19rZXkYByABKAxCNtreHzJnaXRodWIuY29tL1Ro",
            "ZVRoaW5nc05ldHdvcmsvdHRuL2NvcmUvdHlwZXMuQXBwU0tleRJGCgdhcHBf",
            "a2V5GAggASgMQjXa3h8xZ2l0aHViLmNvbS9UaGVUaGluZ3NOZXR3b3JrL3R0",
            "bi9jb3JlL3R5cGVzLkFwcEtleRIQCghmX2NudF91cBgJIAEoDRISCgpmX2Nu",
            "dF9kb3duGAogASgNEhsKE2Rpc2FibGVfZl9jbnRfY2hlY2sYCyABKAgSGAoQ",
            "dXNlczMyX2JpdF9mX2NudBgMIAEoCBIeChZhY3RpdmF0aW9uX2NvbnN0cmFp",
            "bnRzGA0gASgJElAKD3VzZWRfZGV2X25vbmNlcxgOIAMoDEI32t4fM2dpdGh1",
            "Yi5jb20vVGhlVGhpbmdzTmV0d29yay90dG4vY29yZS90eXBlcy5EZXZOb25j",
            "ZRJQCg91c2VkX2FwcF9ub25jZXMYDyADKAxCN9reHzNnaXRodWIuY29tL1Ro",
            "ZVRoaW5nc05ldHdvcmsvdHRuL2NvcmUvdHlwZXMuQXBwTm9uY2USEQoJbGFz",
            "dF9zZWVuGBUgASgDMsEBCg1EZXZpY2VNYW5hZ2VyEjcKCUdldERldmljZRIZ",
            "LmxvcmF3YW4uRGV2aWNlSWRlbnRpZmllchoPLmxvcmF3YW4uRGV2aWNlEjQK",
            "CVNldERldmljZRIPLmxvcmF3YW4uRGV2aWNlGhYuZ29vZ2xlLnByb3RvYnVm",
            "LkVtcHR5EkEKDERlbGV0ZURldmljZRIZLmxvcmF3YW4uRGV2aWNlSWRlbnRp",
            "ZmllchoWLmdvb2dsZS5wcm90b2J1Zi5FbXB0eUKaAQopb3JnLnRoZXRoaW5n",
            "c25ldHdvcmsuYXBpLnByb3RvY29sLmxvcmF3YW5CEkxvUmFXQU5EZXZpY2VQ",
            "cm90b1ABWjBnaXRodWIuY29tL1RoZVRoaW5nc05ldHdvcmsvYXBpL3Byb3Rv",
            "Y29sL2xvcmF3YW6qAiRUaGVUaGluZ3NOZXR3b3JrLkFQSS5Mb1JhV0FOUHJv",
            "dG9jb2xiBnByb3RvMw=="));
      descriptor = pbr::FileDescriptor.FromGeneratedCode(descriptorData,
          new pbr::FileDescriptor[] { global::Google.Protobuf.WellKnownTypes.EmptyReflection.Descriptor, },
          new pbr::GeneratedClrTypeInfo(null, null, new pbr::GeneratedClrTypeInfo[] {
            new pbr::GeneratedClrTypeInfo(typeof(global::TheThingsNetwork.API.LoRaWANProtocol.DeviceIdentifier), global::TheThingsNetwork.API.LoRaWANProtocol.DeviceIdentifier.Parser, new[]{ "AppEui", "DevEui" }, null, null, null, null),
            new pbr::GeneratedClrTypeInfo(typeof(global::TheThingsNetwork.API.LoRaWANProtocol.Device), global::TheThingsNetwork.API.LoRaWANProtocol.Device.Parser, new[]{ "AppEui", "DevEui", "AppId", "DevId", "DevAddr", "NwkSKey", "AppSKey", "AppKey", "FCntUp", "FCntDown", "DisableFCntCheck", "Uses32BitFCnt", "ActivationConstraints", "UsedDevNonces", "UsedAppNonces", "LastSeen" }, null, null, null, null)
          }));
    }
    #endregion

  }
  #region Messages
  public sealed partial class DeviceIdentifier : pb::IMessage<DeviceIdentifier> {
    private static readonly pb::MessageParser<DeviceIdentifier> _parser = new pb::MessageParser<DeviceIdentifier>(() => new DeviceIdentifier());
    private pb::UnknownFieldSet _unknownFields;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pb::MessageParser<DeviceIdentifier> Parser { get { return _parser; } }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pbr::MessageDescriptor Descriptor {
      get { return global::TheThingsNetwork.API.LoRaWANProtocol.DeviceReflection.Descriptor.MessageTypes[0]; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    pbr::MessageDescriptor pb::IMessage.Descriptor {
      get { return Descriptor; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public DeviceIdentifier() {
      OnConstruction();
    }

    partial void OnConstruction();

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public DeviceIdentifier(DeviceIdentifier other) : this() {
      appEui_ = other.appEui_;
      devEui_ = other.devEui_;
      _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public DeviceIdentifier Clone() {
      return new DeviceIdentifier(this);
    }

    /// <summary>Field number for the "app_eui" field.</summary>
    public const int AppEuiFieldNumber = 1;
    private pb::ByteString appEui_ = pb::ByteString.Empty;
    /// <summary>
    /// The AppEUI is a unique, 8 byte identifier for the application a device belongs to.
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public pb::ByteString AppEui {
      get { return appEui_; }
      set {
        appEui_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "dev_eui" field.</summary>
    public const int DevEuiFieldNumber = 2;
    private pb::ByteString devEui_ = pb::ByteString.Empty;
    /// <summary>
    /// The DevEUI is a unique, 8 byte identifier for the device.
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public pb::ByteString DevEui {
      get { return devEui_; }
      set {
        devEui_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override bool Equals(object other) {
      return Equals(other as DeviceIdentifier);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public bool Equals(DeviceIdentifier other) {
      if (ReferenceEquals(other, null)) {
        return false;
      }
      if (ReferenceEquals(other, this)) {
        return true;
      }
      if (AppEui != other.AppEui) return false;
      if (DevEui != other.DevEui) return false;
      return Equals(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override int GetHashCode() {
      int hash = 1;
      if (AppEui.Length != 0) hash ^= AppEui.GetHashCode();
      if (DevEui.Length != 0) hash ^= DevEui.GetHashCode();
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
      if (AppEui.Length != 0) {
        output.WriteRawTag(10);
        output.WriteBytes(AppEui);
      }
      if (DevEui.Length != 0) {
        output.WriteRawTag(18);
        output.WriteBytes(DevEui);
      }
      if (_unknownFields != null) {
        _unknownFields.WriteTo(output);
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public int CalculateSize() {
      int size = 0;
      if (AppEui.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeBytesSize(AppEui);
      }
      if (DevEui.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeBytesSize(DevEui);
      }
      if (_unknownFields != null) {
        size += _unknownFields.CalculateSize();
      }
      return size;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void MergeFrom(DeviceIdentifier other) {
      if (other == null) {
        return;
      }
      if (other.AppEui.Length != 0) {
        AppEui = other.AppEui;
      }
      if (other.DevEui.Length != 0) {
        DevEui = other.DevEui;
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
            AppEui = input.ReadBytes();
            break;
          }
          case 18: {
            DevEui = input.ReadBytes();
            break;
          }
        }
      }
    }

  }

  public sealed partial class Device : pb::IMessage<Device> {
    private static readonly pb::MessageParser<Device> _parser = new pb::MessageParser<Device>(() => new Device());
    private pb::UnknownFieldSet _unknownFields;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pb::MessageParser<Device> Parser { get { return _parser; } }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pbr::MessageDescriptor Descriptor {
      get { return global::TheThingsNetwork.API.LoRaWANProtocol.DeviceReflection.Descriptor.MessageTypes[1]; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    pbr::MessageDescriptor pb::IMessage.Descriptor {
      get { return Descriptor; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public Device() {
      OnConstruction();
    }

    partial void OnConstruction();

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public Device(Device other) : this() {
      appEui_ = other.appEui_;
      devEui_ = other.devEui_;
      appId_ = other.appId_;
      devId_ = other.devId_;
      devAddr_ = other.devAddr_;
      nwkSKey_ = other.nwkSKey_;
      appSKey_ = other.appSKey_;
      appKey_ = other.appKey_;
      fCntUp_ = other.fCntUp_;
      fCntDown_ = other.fCntDown_;
      disableFCntCheck_ = other.disableFCntCheck_;
      uses32BitFCnt_ = other.uses32BitFCnt_;
      activationConstraints_ = other.activationConstraints_;
      usedDevNonces_ = other.usedDevNonces_.Clone();
      usedAppNonces_ = other.usedAppNonces_.Clone();
      lastSeen_ = other.lastSeen_;
      _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public Device Clone() {
      return new Device(this);
    }

    /// <summary>Field number for the "app_eui" field.</summary>
    public const int AppEuiFieldNumber = 1;
    private pb::ByteString appEui_ = pb::ByteString.Empty;
    /// <summary>
    /// The AppEUI is a unique, 8 byte identifier for the application a device belongs to.
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public pb::ByteString AppEui {
      get { return appEui_; }
      set {
        appEui_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "dev_eui" field.</summary>
    public const int DevEuiFieldNumber = 2;
    private pb::ByteString devEui_ = pb::ByteString.Empty;
    /// <summary>
    /// The DevEUI is a unique, 8 byte identifier for the device.
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public pb::ByteString DevEui {
      get { return devEui_; }
      set {
        devEui_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "app_id" field.</summary>
    public const int AppIdFieldNumber = 3;
    private string appId_ = "";
    /// <summary>
    /// The AppID is a unique identifier for the application a device belongs to. It can contain lowercase letters, numbers, - and _.
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public string AppId {
      get { return appId_; }
      set {
        appId_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "dev_id" field.</summary>
    public const int DevIdFieldNumber = 4;
    private string devId_ = "";
    /// <summary>
    /// The DevID is a unique identifier for the device. It can contain lowercase letters, numbers, - and _.
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public string DevId {
      get { return devId_; }
      set {
        devId_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "dev_addr" field.</summary>
    public const int DevAddrFieldNumber = 5;
    private pb::ByteString devAddr_ = pb::ByteString.Empty;
    /// <summary>
    /// The DevAddr is a dynamic, 4 byte session address for the device.
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public pb::ByteString DevAddr {
      get { return devAddr_; }
      set {
        devAddr_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "nwk_s_key" field.</summary>
    public const int NwkSKeyFieldNumber = 6;
    private pb::ByteString nwkSKey_ = pb::ByteString.Empty;
    /// <summary>
    /// The NwkSKey is a 16 byte session key that is known by the device and the network. It is used for routing and MAC related functionality.
    /// This key is negotiated during the OTAA join procedure, or statically configured using ABP.
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public pb::ByteString NwkSKey {
      get { return nwkSKey_; }
      set {
        nwkSKey_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "app_s_key" field.</summary>
    public const int AppSKeyFieldNumber = 7;
    private pb::ByteString appSKey_ = pb::ByteString.Empty;
    /// <summary>
    /// The AppSKey is a 16 byte session key that is known by the device and the application. It is used for payload encryption.
    /// This key is negotiated during the OTAA join procedure, or statically configured using ABP.
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public pb::ByteString AppSKey {
      get { return appSKey_; }
      set {
        appSKey_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "app_key" field.</summary>
    public const int AppKeyFieldNumber = 8;
    private pb::ByteString appKey_ = pb::ByteString.Empty;
    /// <summary>
    /// The AppKey is a 16 byte static key that is known by the device and the application. It is used for negotiating session keys (OTAA).
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public pb::ByteString AppKey {
      get { return appKey_; }
      set {
        appKey_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "f_cnt_up" field.</summary>
    public const int FCntUpFieldNumber = 9;
    private uint fCntUp_;
    /// <summary>
    /// FCntUp is the uplink frame counter for a device session.
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public uint FCntUp {
      get { return fCntUp_; }
      set {
        fCntUp_ = value;
      }
    }

    /// <summary>Field number for the "f_cnt_down" field.</summary>
    public const int FCntDownFieldNumber = 10;
    private uint fCntDown_;
    /// <summary>
    /// FCntDown is the downlink frame counter for a device session.
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public uint FCntDown {
      get { return fCntDown_; }
      set {
        fCntDown_ = value;
      }
    }

    /// <summary>Field number for the "disable_f_cnt_check" field.</summary>
    public const int DisableFCntCheckFieldNumber = 11;
    private bool disableFCntCheck_;
    /// <summary>
    /// The DisableFCntCheck option disables the frame counter check. Disabling this makes the device vulnerable to replay attacks, but makes ABP slightly easier.
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public bool DisableFCntCheck {
      get { return disableFCntCheck_; }
      set {
        disableFCntCheck_ = value;
      }
    }

    /// <summary>Field number for the "uses32_bit_f_cnt" field.</summary>
    public const int Uses32BitFCntFieldNumber = 12;
    private bool uses32BitFCnt_;
    /// <summary>
    /// The Uses32BitFCnt option indicates that the device keeps track of full 32 bit frame counters. As only the 16 lsb are actually transmitted, the 16 msb will have to be inferred.
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public bool Uses32BitFCnt {
      get { return uses32BitFCnt_; }
      set {
        uses32BitFCnt_ = value;
      }
    }

    /// <summary>Field number for the "activation_constraints" field.</summary>
    public const int ActivationConstraintsFieldNumber = 13;
    private string activationConstraints_ = "";
    /// <summary>
    /// The ActivationContstraints are used to allocate a device address for a device (comma-separated).
    /// There are different prefixes for `otaa`, `abp`, `world`, `local`, `private`, `testing`.
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public string ActivationConstraints {
      get { return activationConstraints_; }
      set {
        activationConstraints_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "used_dev_nonces" field.</summary>
    public const int UsedDevNoncesFieldNumber = 14;
    private static readonly pb::FieldCodec<pb::ByteString> _repeated_usedDevNonces_codec
        = pb::FieldCodec.ForBytes(114);
    private readonly pbc::RepeatedField<pb::ByteString> usedDevNonces_ = new pbc::RepeatedField<pb::ByteString>();
    /// <summary>
    /// The DevNonces that have been used in joins. This field is read-only. Reset the nonces by changing the AppKey.
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public pbc::RepeatedField<pb::ByteString> UsedDevNonces {
      get { return usedDevNonces_; }
    }

    /// <summary>Field number for the "used_app_nonces" field.</summary>
    public const int UsedAppNoncesFieldNumber = 15;
    private static readonly pb::FieldCodec<pb::ByteString> _repeated_usedAppNonces_codec
        = pb::FieldCodec.ForBytes(122);
    private readonly pbc::RepeatedField<pb::ByteString> usedAppNonces_ = new pbc::RepeatedField<pb::ByteString>();
    /// <summary>
    /// The AppNonces that have been used in joins. This field is read-only. Reset the nonces by changing the AppKey.
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public pbc::RepeatedField<pb::ByteString> UsedAppNonces {
      get { return usedAppNonces_; }
    }

    /// <summary>Field number for the "last_seen" field.</summary>
    public const int LastSeenFieldNumber = 21;
    private long lastSeen_;
    /// <summary>
    /// When the device was last seen (Unix nanoseconds)
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public long LastSeen {
      get { return lastSeen_; }
      set {
        lastSeen_ = value;
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override bool Equals(object other) {
      return Equals(other as Device);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public bool Equals(Device other) {
      if (ReferenceEquals(other, null)) {
        return false;
      }
      if (ReferenceEquals(other, this)) {
        return true;
      }
      if (AppEui != other.AppEui) return false;
      if (DevEui != other.DevEui) return false;
      if (AppId != other.AppId) return false;
      if (DevId != other.DevId) return false;
      if (DevAddr != other.DevAddr) return false;
      if (NwkSKey != other.NwkSKey) return false;
      if (AppSKey != other.AppSKey) return false;
      if (AppKey != other.AppKey) return false;
      if (FCntUp != other.FCntUp) return false;
      if (FCntDown != other.FCntDown) return false;
      if (DisableFCntCheck != other.DisableFCntCheck) return false;
      if (Uses32BitFCnt != other.Uses32BitFCnt) return false;
      if (ActivationConstraints != other.ActivationConstraints) return false;
      if(!usedDevNonces_.Equals(other.usedDevNonces_)) return false;
      if(!usedAppNonces_.Equals(other.usedAppNonces_)) return false;
      if (LastSeen != other.LastSeen) return false;
      return Equals(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override int GetHashCode() {
      int hash = 1;
      if (AppEui.Length != 0) hash ^= AppEui.GetHashCode();
      if (DevEui.Length != 0) hash ^= DevEui.GetHashCode();
      if (AppId.Length != 0) hash ^= AppId.GetHashCode();
      if (DevId.Length != 0) hash ^= DevId.GetHashCode();
      if (DevAddr.Length != 0) hash ^= DevAddr.GetHashCode();
      if (NwkSKey.Length != 0) hash ^= NwkSKey.GetHashCode();
      if (AppSKey.Length != 0) hash ^= AppSKey.GetHashCode();
      if (AppKey.Length != 0) hash ^= AppKey.GetHashCode();
      if (FCntUp != 0) hash ^= FCntUp.GetHashCode();
      if (FCntDown != 0) hash ^= FCntDown.GetHashCode();
      if (DisableFCntCheck != false) hash ^= DisableFCntCheck.GetHashCode();
      if (Uses32BitFCnt != false) hash ^= Uses32BitFCnt.GetHashCode();
      if (ActivationConstraints.Length != 0) hash ^= ActivationConstraints.GetHashCode();
      hash ^= usedDevNonces_.GetHashCode();
      hash ^= usedAppNonces_.GetHashCode();
      if (LastSeen != 0L) hash ^= LastSeen.GetHashCode();
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
      if (AppEui.Length != 0) {
        output.WriteRawTag(10);
        output.WriteBytes(AppEui);
      }
      if (DevEui.Length != 0) {
        output.WriteRawTag(18);
        output.WriteBytes(DevEui);
      }
      if (AppId.Length != 0) {
        output.WriteRawTag(26);
        output.WriteString(AppId);
      }
      if (DevId.Length != 0) {
        output.WriteRawTag(34);
        output.WriteString(DevId);
      }
      if (DevAddr.Length != 0) {
        output.WriteRawTag(42);
        output.WriteBytes(DevAddr);
      }
      if (NwkSKey.Length != 0) {
        output.WriteRawTag(50);
        output.WriteBytes(NwkSKey);
      }
      if (AppSKey.Length != 0) {
        output.WriteRawTag(58);
        output.WriteBytes(AppSKey);
      }
      if (AppKey.Length != 0) {
        output.WriteRawTag(66);
        output.WriteBytes(AppKey);
      }
      if (FCntUp != 0) {
        output.WriteRawTag(72);
        output.WriteUInt32(FCntUp);
      }
      if (FCntDown != 0) {
        output.WriteRawTag(80);
        output.WriteUInt32(FCntDown);
      }
      if (DisableFCntCheck != false) {
        output.WriteRawTag(88);
        output.WriteBool(DisableFCntCheck);
      }
      if (Uses32BitFCnt != false) {
        output.WriteRawTag(96);
        output.WriteBool(Uses32BitFCnt);
      }
      if (ActivationConstraints.Length != 0) {
        output.WriteRawTag(106);
        output.WriteString(ActivationConstraints);
      }
      usedDevNonces_.WriteTo(output, _repeated_usedDevNonces_codec);
      usedAppNonces_.WriteTo(output, _repeated_usedAppNonces_codec);
      if (LastSeen != 0L) {
        output.WriteRawTag(168, 1);
        output.WriteInt64(LastSeen);
      }
      if (_unknownFields != null) {
        _unknownFields.WriteTo(output);
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public int CalculateSize() {
      int size = 0;
      if (AppEui.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeBytesSize(AppEui);
      }
      if (DevEui.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeBytesSize(DevEui);
      }
      if (AppId.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(AppId);
      }
      if (DevId.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(DevId);
      }
      if (DevAddr.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeBytesSize(DevAddr);
      }
      if (NwkSKey.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeBytesSize(NwkSKey);
      }
      if (AppSKey.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeBytesSize(AppSKey);
      }
      if (AppKey.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeBytesSize(AppKey);
      }
      if (FCntUp != 0) {
        size += 1 + pb::CodedOutputStream.ComputeUInt32Size(FCntUp);
      }
      if (FCntDown != 0) {
        size += 1 + pb::CodedOutputStream.ComputeUInt32Size(FCntDown);
      }
      if (DisableFCntCheck != false) {
        size += 1 + 1;
      }
      if (Uses32BitFCnt != false) {
        size += 1 + 1;
      }
      if (ActivationConstraints.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(ActivationConstraints);
      }
      size += usedDevNonces_.CalculateSize(_repeated_usedDevNonces_codec);
      size += usedAppNonces_.CalculateSize(_repeated_usedAppNonces_codec);
      if (LastSeen != 0L) {
        size += 2 + pb::CodedOutputStream.ComputeInt64Size(LastSeen);
      }
      if (_unknownFields != null) {
        size += _unknownFields.CalculateSize();
      }
      return size;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void MergeFrom(Device other) {
      if (other == null) {
        return;
      }
      if (other.AppEui.Length != 0) {
        AppEui = other.AppEui;
      }
      if (other.DevEui.Length != 0) {
        DevEui = other.DevEui;
      }
      if (other.AppId.Length != 0) {
        AppId = other.AppId;
      }
      if (other.DevId.Length != 0) {
        DevId = other.DevId;
      }
      if (other.DevAddr.Length != 0) {
        DevAddr = other.DevAddr;
      }
      if (other.NwkSKey.Length != 0) {
        NwkSKey = other.NwkSKey;
      }
      if (other.AppSKey.Length != 0) {
        AppSKey = other.AppSKey;
      }
      if (other.AppKey.Length != 0) {
        AppKey = other.AppKey;
      }
      if (other.FCntUp != 0) {
        FCntUp = other.FCntUp;
      }
      if (other.FCntDown != 0) {
        FCntDown = other.FCntDown;
      }
      if (other.DisableFCntCheck != false) {
        DisableFCntCheck = other.DisableFCntCheck;
      }
      if (other.Uses32BitFCnt != false) {
        Uses32BitFCnt = other.Uses32BitFCnt;
      }
      if (other.ActivationConstraints.Length != 0) {
        ActivationConstraints = other.ActivationConstraints;
      }
      usedDevNonces_.Add(other.usedDevNonces_);
      usedAppNonces_.Add(other.usedAppNonces_);
      if (other.LastSeen != 0L) {
        LastSeen = other.LastSeen;
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
            AppEui = input.ReadBytes();
            break;
          }
          case 18: {
            DevEui = input.ReadBytes();
            break;
          }
          case 26: {
            AppId = input.ReadString();
            break;
          }
          case 34: {
            DevId = input.ReadString();
            break;
          }
          case 42: {
            DevAddr = input.ReadBytes();
            break;
          }
          case 50: {
            NwkSKey = input.ReadBytes();
            break;
          }
          case 58: {
            AppSKey = input.ReadBytes();
            break;
          }
          case 66: {
            AppKey = input.ReadBytes();
            break;
          }
          case 72: {
            FCntUp = input.ReadUInt32();
            break;
          }
          case 80: {
            FCntDown = input.ReadUInt32();
            break;
          }
          case 88: {
            DisableFCntCheck = input.ReadBool();
            break;
          }
          case 96: {
            Uses32BitFCnt = input.ReadBool();
            break;
          }
          case 106: {
            ActivationConstraints = input.ReadString();
            break;
          }
          case 114: {
            usedDevNonces_.AddEntriesFrom(input, _repeated_usedDevNonces_codec);
            break;
          }
          case 122: {
            usedAppNonces_.AddEntriesFrom(input, _repeated_usedAppNonces_codec);
            break;
          }
          case 168: {
            LastSeen = input.ReadInt64();
            break;
          }
        }
      }
    }

  }

  #endregion

}

#endregion Designer generated code
