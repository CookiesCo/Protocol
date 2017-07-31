// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: base/Compression.proto
#pragma warning disable 1591, 0612, 3021
#region Designer generated code

using pb = global::Google.Protobuf;
using pbc = global::Google.Protobuf.Collections;
using pbr = global::Google.Protobuf.Reflection;
using scg = global::System.Collections.Generic;
/// <summary>Holder for reflection information generated from base/Compression.proto</summary>
public static partial class CompressionReflection {

  #region Descriptor
  /// <summary>File descriptor for base/Compression.proto</summary>
  public static pbr::FileDescriptor Descriptor {
    get { return descriptor; }
  }
  private static pbr::FileDescriptor descriptor;

  static CompressionReflection() {
    byte[] descriptorData = global::System.Convert.FromBase64String(
        string.Concat(
          "ChZiYXNlL0NvbXByZXNzaW9uLnByb3RvIlEKC0NvbXByZXNzaW9uEg8KB2Vu",
          "YWJsZWQYASABKAgSHwoEdHlwZRgCIAEoDjIRLkNvbXByZXNzaW9uLlR5cGUi",
          "EAoEVHlwZRIICgRHWklQEABCGwoXaW8uYmxvb21ib3guc2NoZW1hLmJhc2VQ",
          "AWIGcHJvdG8z"));
    descriptor = pbr::FileDescriptor.FromGeneratedCode(descriptorData,
        new pbr::FileDescriptor[] { },
        new pbr::GeneratedClrTypeInfo(null, new pbr::GeneratedClrTypeInfo[] {
          new pbr::GeneratedClrTypeInfo(typeof(global::Compression), global::Compression.Parser, new[]{ "Enabled", "Type" }, null, new[]{ typeof(global::Compression.Types.Type) }, null)
        }));
  }
  #endregion

}
#region Messages
public sealed partial class Compression : pb::IMessage<Compression> {
  private static readonly pb::MessageParser<Compression> _parser = new pb::MessageParser<Compression>(() => new Compression());
  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public static pb::MessageParser<Compression> Parser { get { return _parser; } }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public static pbr::MessageDescriptor Descriptor {
    get { return global::CompressionReflection.Descriptor.MessageTypes[0]; }
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  pbr::MessageDescriptor pb::IMessage.Descriptor {
    get { return Descriptor; }
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public Compression() {
    OnConstruction();
  }

  partial void OnConstruction();

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public Compression(Compression other) : this() {
    enabled_ = other.enabled_;
    type_ = other.type_;
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public Compression Clone() {
    return new Compression(this);
  }

  /// <summary>Field number for the "enabled" field.</summary>
  public const int EnabledFieldNumber = 1;
  private bool enabled_;
  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public bool Enabled {
    get { return enabled_; }
    set {
      enabled_ = value;
    }
  }

  /// <summary>Field number for the "type" field.</summary>
  public const int TypeFieldNumber = 2;
  private global::Compression.Types.Type type_ = 0;
  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public global::Compression.Types.Type Type {
    get { return type_; }
    set {
      type_ = value;
    }
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public override bool Equals(object other) {
    return Equals(other as Compression);
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public bool Equals(Compression other) {
    if (ReferenceEquals(other, null)) {
      return false;
    }
    if (ReferenceEquals(other, this)) {
      return true;
    }
    if (Enabled != other.Enabled) return false;
    if (Type != other.Type) return false;
    return true;
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public override int GetHashCode() {
    int hash = 1;
    if (Enabled != false) hash ^= Enabled.GetHashCode();
    if (Type != 0) hash ^= Type.GetHashCode();
    return hash;
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public override string ToString() {
    return pb::JsonFormatter.ToDiagnosticString(this);
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public void WriteTo(pb::CodedOutputStream output) {
    if (Enabled != false) {
      output.WriteRawTag(8);
      output.WriteBool(Enabled);
    }
    if (Type != 0) {
      output.WriteRawTag(16);
      output.WriteEnum((int) Type);
    }
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public int CalculateSize() {
    int size = 0;
    if (Enabled != false) {
      size += 1 + 1;
    }
    if (Type != 0) {
      size += 1 + pb::CodedOutputStream.ComputeEnumSize((int) Type);
    }
    return size;
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public void MergeFrom(Compression other) {
    if (other == null) {
      return;
    }
    if (other.Enabled != false) {
      Enabled = other.Enabled;
    }
    if (other.Type != 0) {
      Type = other.Type;
    }
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public void MergeFrom(pb::CodedInputStream input) {
    uint tag;
    while ((tag = input.ReadTag()) != 0) {
      switch(tag) {
        default:
          input.SkipLastField();
          break;
        case 8: {
          Enabled = input.ReadBool();
          break;
        }
        case 16: {
          type_ = (global::Compression.Types.Type) input.ReadEnum();
          break;
        }
      }
    }
  }

  #region Nested types
  /// <summary>Container for nested types declared in the Compression message type.</summary>
  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public static partial class Types {
    public enum Type {
      [pbr::OriginalName("GZIP")] Gzip = 0,
    }

  }
  #endregion

}

#endregion


#endregion Designer generated code
