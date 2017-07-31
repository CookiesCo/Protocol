// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: structs/pricing/PricingDescriptor.proto
#pragma warning disable 1591, 0612, 3021
#region Designer generated code

using pb = global::Google.Protobuf;
using pbc = global::Google.Protobuf.Collections;
using pbr = global::Google.Protobuf.Reflection;
using scg = global::System.Collections.Generic;
/// <summary>Holder for reflection information generated from structs/pricing/PricingDescriptor.proto</summary>
public static partial class PricingDescriptorReflection {

  #region Descriptor
  /// <summary>File descriptor for structs/pricing/PricingDescriptor.proto</summary>
  public static pbr::FileDescriptor Descriptor {
    get { return descriptor; }
  }
  private static pbr::FileDescriptor descriptor;

  static PricingDescriptorReflection() {
    byte[] descriptorData = global::System.Convert.FromBase64String(
        string.Concat(
          "CidzdHJ1Y3RzL3ByaWNpbmcvUHJpY2luZ0Rlc2NyaXB0b3IucHJvdG8aJHN0",
          "cnVjdHMvcHJpY2luZy9TYWxlRGVzY3JpcHRvci5wcm90byI9ChdQcmljaW5n",
          "VGllckF2YWlsYWJpbGl0eRIPCgdvZmZlcmVkGAEgASgIEhEKCWF2YWlsYWJs",
          "ZRgCIAEoCCJ6ChVVbml0UHJpY2luZ0Rlc2NyaXB0b3ISEwoLcHJpY2VfdmFs",
          "dWUYASABKAISKAoGc3RhdHVzGAIgASgLMhguUHJpY2luZ1RpZXJBdmFpbGFi",
          "aWxpdHkSIgoJZGlzY291bnRzGAMgAygLMg8uU2FsZURlc2NyaXB0b3IifAoZ",
          "V2VpZ2h0ZWRQcmljaW5nRGVzY3JpcHRvchIiCgZ3ZWlnaHQYASABKA4yEi5Q",
          "cmljaW5nV2VpZ2h0VGllchIkCgR0aWVyGAIgASgLMhYuVW5pdFByaWNpbmdE",
          "ZXNjcmlwdG9yEhUKDXdlaWdodEluR3JhbXMYAyABKAIiGgoYRnJlZWJpZVBy",
          "aWNpbmdEZXNjcmlwdG9yIq8BChFQcmljaW5nRGVzY3JpcHRvchIaCgR0eXBl",
          "GAEgASgOMgwuUHJpY2luZ1R5cGUSJAoEdW5pdBgUIAEoCzIWLlVuaXRQcmlj",
          "aW5nRGVzY3JpcHRvchIsCgh3ZWlnaHRlZBgVIAEoCzIaLldlaWdodGVkUHJp",
          "Y2luZ0Rlc2NyaXB0b3ISKgoHZnJlZWJpZRgWIAEoCzIZLkZyZWViaWVQcmlj",
          "aW5nRGVzY3JpcHRvciJaCg5Qcm9kdWN0UHJpY2luZxIiCglkaXNjb3VudHMY",
          "ASADKAsyDy5TYWxlRGVzY3JpcHRvchIkCghtYW5pZmVzdBgCIAMoCzISLlBy",
          "aWNpbmdEZXNjcmlwdG9yKjIKC1ByaWNpbmdUeXBlEggKBFVOSVQQABIMCghX",
          "RUlHSFRFRBABEgsKB0ZSRUVCSUUQAiqJAQoRUHJpY2luZ1dlaWdodFRpZXIS",
          "CQoFT1RIRVIQABIICgRHUkFNEAESDAoISEFMRkdSQU0QAhIPCgtRVUFSVEVS",
          "R1JBTRADEgcKA0RVQhAEEgoKBkVJR0hUSBAFEgsKB1FVQVJURVIQBhIICgRI",
          "QUxGEAcSCQoFT1VOQ0UQCBIJCgVQT1VORBAJQiUKIWlvLmJsb29tYm94LnNj",
          "aGVtYS5wcm9kdWN0LnN0cnVjdFABYgZwcm90bzM="));
    descriptor = pbr::FileDescriptor.FromGeneratedCode(descriptorData,
        new pbr::FileDescriptor[] { global::SaleDescriptorReflection.Descriptor, },
        new pbr::GeneratedClrTypeInfo(new[] {typeof(global::PricingType), typeof(global::PricingWeightTier), }, new pbr::GeneratedClrTypeInfo[] {
          new pbr::GeneratedClrTypeInfo(typeof(global::PricingTierAvailability), global::PricingTierAvailability.Parser, new[]{ "Offered", "Available" }, null, null, null),
          new pbr::GeneratedClrTypeInfo(typeof(global::UnitPricingDescriptor), global::UnitPricingDescriptor.Parser, new[]{ "PriceValue", "Status", "Discounts" }, null, null, null),
          new pbr::GeneratedClrTypeInfo(typeof(global::WeightedPricingDescriptor), global::WeightedPricingDescriptor.Parser, new[]{ "Weight", "Tier", "WeightInGrams" }, null, null, null),
          new pbr::GeneratedClrTypeInfo(typeof(global::FreebiePricingDescriptor), global::FreebiePricingDescriptor.Parser, null, null, null, null),
          new pbr::GeneratedClrTypeInfo(typeof(global::PricingDescriptor), global::PricingDescriptor.Parser, new[]{ "Type", "Unit", "Weighted", "Freebie" }, null, null, null),
          new pbr::GeneratedClrTypeInfo(typeof(global::ProductPricing), global::ProductPricing.Parser, new[]{ "Discounts", "Manifest" }, null, null, null)
        }));
  }
  #endregion

}
#region Enums
/// <summary>
/// -- Pricing: Objects
/// </summary>
public enum PricingType {
  [pbr::OriginalName("UNIT")] Unit = 0,
  [pbr::OriginalName("WEIGHTED")] Weighted = 1,
  [pbr::OriginalName("FREEBIE")] Freebie = 2,
}

public enum PricingWeightTier {
  [pbr::OriginalName("OTHER")] Other = 0,
  [pbr::OriginalName("GRAM")] Gram = 1,
  [pbr::OriginalName("HALFGRAM")] Halfgram = 2,
  [pbr::OriginalName("QUARTERGRAM")] Quartergram = 3,
  [pbr::OriginalName("DUB")] Dub = 4,
  [pbr::OriginalName("EIGHTH")] Eighth = 5,
  [pbr::OriginalName("QUARTER")] Quarter = 6,
  [pbr::OriginalName("HALF")] Half = 7,
  [pbr::OriginalName("OUNCE")] Ounce = 8,
  [pbr::OriginalName("POUND")] Pound = 9,
}

#endregion

#region Messages
public sealed partial class PricingTierAvailability : pb::IMessage<PricingTierAvailability> {
  private static readonly pb::MessageParser<PricingTierAvailability> _parser = new pb::MessageParser<PricingTierAvailability>(() => new PricingTierAvailability());
  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public static pb::MessageParser<PricingTierAvailability> Parser { get { return _parser; } }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public static pbr::MessageDescriptor Descriptor {
    get { return global::PricingDescriptorReflection.Descriptor.MessageTypes[0]; }
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  pbr::MessageDescriptor pb::IMessage.Descriptor {
    get { return Descriptor; }
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public PricingTierAvailability() {
    OnConstruction();
  }

  partial void OnConstruction();

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public PricingTierAvailability(PricingTierAvailability other) : this() {
    offered_ = other.offered_;
    available_ = other.available_;
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public PricingTierAvailability Clone() {
    return new PricingTierAvailability(this);
  }

  /// <summary>Field number for the "offered" field.</summary>
  public const int OfferedFieldNumber = 1;
  private bool offered_;
  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public bool Offered {
    get { return offered_; }
    set {
      offered_ = value;
    }
  }

  /// <summary>Field number for the "available" field.</summary>
  public const int AvailableFieldNumber = 2;
  private bool available_;
  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public bool Available {
    get { return available_; }
    set {
      available_ = value;
    }
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public override bool Equals(object other) {
    return Equals(other as PricingTierAvailability);
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public bool Equals(PricingTierAvailability other) {
    if (ReferenceEquals(other, null)) {
      return false;
    }
    if (ReferenceEquals(other, this)) {
      return true;
    }
    if (Offered != other.Offered) return false;
    if (Available != other.Available) return false;
    return true;
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public override int GetHashCode() {
    int hash = 1;
    if (Offered != false) hash ^= Offered.GetHashCode();
    if (Available != false) hash ^= Available.GetHashCode();
    return hash;
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public override string ToString() {
    return pb::JsonFormatter.ToDiagnosticString(this);
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public void WriteTo(pb::CodedOutputStream output) {
    if (Offered != false) {
      output.WriteRawTag(8);
      output.WriteBool(Offered);
    }
    if (Available != false) {
      output.WriteRawTag(16);
      output.WriteBool(Available);
    }
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public int CalculateSize() {
    int size = 0;
    if (Offered != false) {
      size += 1 + 1;
    }
    if (Available != false) {
      size += 1 + 1;
    }
    return size;
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public void MergeFrom(PricingTierAvailability other) {
    if (other == null) {
      return;
    }
    if (other.Offered != false) {
      Offered = other.Offered;
    }
    if (other.Available != false) {
      Available = other.Available;
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
          Offered = input.ReadBool();
          break;
        }
        case 16: {
          Available = input.ReadBool();
          break;
        }
      }
    }
  }

}

/// <summary>
/// -- Pricing: Typed Descriptors
/// </summary>
public sealed partial class UnitPricingDescriptor : pb::IMessage<UnitPricingDescriptor> {
  private static readonly pb::MessageParser<UnitPricingDescriptor> _parser = new pb::MessageParser<UnitPricingDescriptor>(() => new UnitPricingDescriptor());
  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public static pb::MessageParser<UnitPricingDescriptor> Parser { get { return _parser; } }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public static pbr::MessageDescriptor Descriptor {
    get { return global::PricingDescriptorReflection.Descriptor.MessageTypes[1]; }
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  pbr::MessageDescriptor pb::IMessage.Descriptor {
    get { return Descriptor; }
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public UnitPricingDescriptor() {
    OnConstruction();
  }

  partial void OnConstruction();

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public UnitPricingDescriptor(UnitPricingDescriptor other) : this() {
    priceValue_ = other.priceValue_;
    Status = other.status_ != null ? other.Status.Clone() : null;
    discounts_ = other.discounts_.Clone();
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public UnitPricingDescriptor Clone() {
    return new UnitPricingDescriptor(this);
  }

  /// <summary>Field number for the "price_value" field.</summary>
  public const int PriceValueFieldNumber = 1;
  private float priceValue_;
  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public float PriceValue {
    get { return priceValue_; }
    set {
      priceValue_ = value;
    }
  }

  /// <summary>Field number for the "status" field.</summary>
  public const int StatusFieldNumber = 2;
  private global::PricingTierAvailability status_;
  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public global::PricingTierAvailability Status {
    get { return status_; }
    set {
      status_ = value;
    }
  }

  /// <summary>Field number for the "discounts" field.</summary>
  public const int DiscountsFieldNumber = 3;
  private static readonly pb::FieldCodec<global::SaleDescriptor> _repeated_discounts_codec
      = pb::FieldCodec.ForMessage(26, global::SaleDescriptor.Parser);
  private readonly pbc::RepeatedField<global::SaleDescriptor> discounts_ = new pbc::RepeatedField<global::SaleDescriptor>();
  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public pbc::RepeatedField<global::SaleDescriptor> Discounts {
    get { return discounts_; }
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public override bool Equals(object other) {
    return Equals(other as UnitPricingDescriptor);
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public bool Equals(UnitPricingDescriptor other) {
    if (ReferenceEquals(other, null)) {
      return false;
    }
    if (ReferenceEquals(other, this)) {
      return true;
    }
    if (PriceValue != other.PriceValue) return false;
    if (!object.Equals(Status, other.Status)) return false;
    if(!discounts_.Equals(other.discounts_)) return false;
    return true;
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public override int GetHashCode() {
    int hash = 1;
    if (PriceValue != 0F) hash ^= PriceValue.GetHashCode();
    if (status_ != null) hash ^= Status.GetHashCode();
    hash ^= discounts_.GetHashCode();
    return hash;
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public override string ToString() {
    return pb::JsonFormatter.ToDiagnosticString(this);
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public void WriteTo(pb::CodedOutputStream output) {
    if (PriceValue != 0F) {
      output.WriteRawTag(13);
      output.WriteFloat(PriceValue);
    }
    if (status_ != null) {
      output.WriteRawTag(18);
      output.WriteMessage(Status);
    }
    discounts_.WriteTo(output, _repeated_discounts_codec);
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public int CalculateSize() {
    int size = 0;
    if (PriceValue != 0F) {
      size += 1 + 4;
    }
    if (status_ != null) {
      size += 1 + pb::CodedOutputStream.ComputeMessageSize(Status);
    }
    size += discounts_.CalculateSize(_repeated_discounts_codec);
    return size;
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public void MergeFrom(UnitPricingDescriptor other) {
    if (other == null) {
      return;
    }
    if (other.PriceValue != 0F) {
      PriceValue = other.PriceValue;
    }
    if (other.status_ != null) {
      if (status_ == null) {
        status_ = new global::PricingTierAvailability();
      }
      Status.MergeFrom(other.Status);
    }
    discounts_.Add(other.discounts_);
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public void MergeFrom(pb::CodedInputStream input) {
    uint tag;
    while ((tag = input.ReadTag()) != 0) {
      switch(tag) {
        default:
          input.SkipLastField();
          break;
        case 13: {
          PriceValue = input.ReadFloat();
          break;
        }
        case 18: {
          if (status_ == null) {
            status_ = new global::PricingTierAvailability();
          }
          input.ReadMessage(status_);
          break;
        }
        case 26: {
          discounts_.AddEntriesFrom(input, _repeated_discounts_codec);
          break;
        }
      }
    }
  }

}

public sealed partial class WeightedPricingDescriptor : pb::IMessage<WeightedPricingDescriptor> {
  private static readonly pb::MessageParser<WeightedPricingDescriptor> _parser = new pb::MessageParser<WeightedPricingDescriptor>(() => new WeightedPricingDescriptor());
  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public static pb::MessageParser<WeightedPricingDescriptor> Parser { get { return _parser; } }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public static pbr::MessageDescriptor Descriptor {
    get { return global::PricingDescriptorReflection.Descriptor.MessageTypes[2]; }
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  pbr::MessageDescriptor pb::IMessage.Descriptor {
    get { return Descriptor; }
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public WeightedPricingDescriptor() {
    OnConstruction();
  }

  partial void OnConstruction();

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public WeightedPricingDescriptor(WeightedPricingDescriptor other) : this() {
    weight_ = other.weight_;
    Tier = other.tier_ != null ? other.Tier.Clone() : null;
    weightInGrams_ = other.weightInGrams_;
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public WeightedPricingDescriptor Clone() {
    return new WeightedPricingDescriptor(this);
  }

  /// <summary>Field number for the "weight" field.</summary>
  public const int WeightFieldNumber = 1;
  private global::PricingWeightTier weight_ = 0;
  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public global::PricingWeightTier Weight {
    get { return weight_; }
    set {
      weight_ = value;
    }
  }

  /// <summary>Field number for the "tier" field.</summary>
  public const int TierFieldNumber = 2;
  private global::UnitPricingDescriptor tier_;
  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public global::UnitPricingDescriptor Tier {
    get { return tier_; }
    set {
      tier_ = value;
    }
  }

  /// <summary>Field number for the "weightInGrams" field.</summary>
  public const int WeightInGramsFieldNumber = 3;
  private float weightInGrams_;
  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public float WeightInGrams {
    get { return weightInGrams_; }
    set {
      weightInGrams_ = value;
    }
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public override bool Equals(object other) {
    return Equals(other as WeightedPricingDescriptor);
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public bool Equals(WeightedPricingDescriptor other) {
    if (ReferenceEquals(other, null)) {
      return false;
    }
    if (ReferenceEquals(other, this)) {
      return true;
    }
    if (Weight != other.Weight) return false;
    if (!object.Equals(Tier, other.Tier)) return false;
    if (WeightInGrams != other.WeightInGrams) return false;
    return true;
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public override int GetHashCode() {
    int hash = 1;
    if (Weight != 0) hash ^= Weight.GetHashCode();
    if (tier_ != null) hash ^= Tier.GetHashCode();
    if (WeightInGrams != 0F) hash ^= WeightInGrams.GetHashCode();
    return hash;
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public override string ToString() {
    return pb::JsonFormatter.ToDiagnosticString(this);
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public void WriteTo(pb::CodedOutputStream output) {
    if (Weight != 0) {
      output.WriteRawTag(8);
      output.WriteEnum((int) Weight);
    }
    if (tier_ != null) {
      output.WriteRawTag(18);
      output.WriteMessage(Tier);
    }
    if (WeightInGrams != 0F) {
      output.WriteRawTag(29);
      output.WriteFloat(WeightInGrams);
    }
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public int CalculateSize() {
    int size = 0;
    if (Weight != 0) {
      size += 1 + pb::CodedOutputStream.ComputeEnumSize((int) Weight);
    }
    if (tier_ != null) {
      size += 1 + pb::CodedOutputStream.ComputeMessageSize(Tier);
    }
    if (WeightInGrams != 0F) {
      size += 1 + 4;
    }
    return size;
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public void MergeFrom(WeightedPricingDescriptor other) {
    if (other == null) {
      return;
    }
    if (other.Weight != 0) {
      Weight = other.Weight;
    }
    if (other.tier_ != null) {
      if (tier_ == null) {
        tier_ = new global::UnitPricingDescriptor();
      }
      Tier.MergeFrom(other.Tier);
    }
    if (other.WeightInGrams != 0F) {
      WeightInGrams = other.WeightInGrams;
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
          weight_ = (global::PricingWeightTier) input.ReadEnum();
          break;
        }
        case 18: {
          if (tier_ == null) {
            tier_ = new global::UnitPricingDescriptor();
          }
          input.ReadMessage(tier_);
          break;
        }
        case 29: {
          WeightInGrams = input.ReadFloat();
          break;
        }
      }
    }
  }

}

public sealed partial class FreebiePricingDescriptor : pb::IMessage<FreebiePricingDescriptor> {
  private static readonly pb::MessageParser<FreebiePricingDescriptor> _parser = new pb::MessageParser<FreebiePricingDescriptor>(() => new FreebiePricingDescriptor());
  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public static pb::MessageParser<FreebiePricingDescriptor> Parser { get { return _parser; } }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public static pbr::MessageDescriptor Descriptor {
    get { return global::PricingDescriptorReflection.Descriptor.MessageTypes[3]; }
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  pbr::MessageDescriptor pb::IMessage.Descriptor {
    get { return Descriptor; }
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public FreebiePricingDescriptor() {
    OnConstruction();
  }

  partial void OnConstruction();

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public FreebiePricingDescriptor(FreebiePricingDescriptor other) : this() {
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public FreebiePricingDescriptor Clone() {
    return new FreebiePricingDescriptor(this);
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public override bool Equals(object other) {
    return Equals(other as FreebiePricingDescriptor);
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public bool Equals(FreebiePricingDescriptor other) {
    if (ReferenceEquals(other, null)) {
      return false;
    }
    if (ReferenceEquals(other, this)) {
      return true;
    }
    return true;
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public override int GetHashCode() {
    int hash = 1;
    return hash;
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public override string ToString() {
    return pb::JsonFormatter.ToDiagnosticString(this);
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public void WriteTo(pb::CodedOutputStream output) {
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public int CalculateSize() {
    int size = 0;
    return size;
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public void MergeFrom(FreebiePricingDescriptor other) {
    if (other == null) {
      return;
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
      }
    }
  }

}

/// <summary>
/// -- Pricing: Main Descriptor
/// </summary>
public sealed partial class PricingDescriptor : pb::IMessage<PricingDescriptor> {
  private static readonly pb::MessageParser<PricingDescriptor> _parser = new pb::MessageParser<PricingDescriptor>(() => new PricingDescriptor());
  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public static pb::MessageParser<PricingDescriptor> Parser { get { return _parser; } }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public static pbr::MessageDescriptor Descriptor {
    get { return global::PricingDescriptorReflection.Descriptor.MessageTypes[4]; }
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  pbr::MessageDescriptor pb::IMessage.Descriptor {
    get { return Descriptor; }
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public PricingDescriptor() {
    OnConstruction();
  }

  partial void OnConstruction();

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public PricingDescriptor(PricingDescriptor other) : this() {
    type_ = other.type_;
    Unit = other.unit_ != null ? other.Unit.Clone() : null;
    Weighted = other.weighted_ != null ? other.Weighted.Clone() : null;
    Freebie = other.freebie_ != null ? other.Freebie.Clone() : null;
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public PricingDescriptor Clone() {
    return new PricingDescriptor(this);
  }

  /// <summary>Field number for the "type" field.</summary>
  public const int TypeFieldNumber = 1;
  private global::PricingType type_ = 0;
  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public global::PricingType Type {
    get { return type_; }
    set {
      type_ = value;
    }
  }

  /// <summary>Field number for the "unit" field.</summary>
  public const int UnitFieldNumber = 20;
  private global::UnitPricingDescriptor unit_;
  /// <summary>
  /// -- descriptors
  /// </summary>
  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public global::UnitPricingDescriptor Unit {
    get { return unit_; }
    set {
      unit_ = value;
    }
  }

  /// <summary>Field number for the "weighted" field.</summary>
  public const int WeightedFieldNumber = 21;
  private global::WeightedPricingDescriptor weighted_;
  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public global::WeightedPricingDescriptor Weighted {
    get { return weighted_; }
    set {
      weighted_ = value;
    }
  }

  /// <summary>Field number for the "freebie" field.</summary>
  public const int FreebieFieldNumber = 22;
  private global::FreebiePricingDescriptor freebie_;
  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public global::FreebiePricingDescriptor Freebie {
    get { return freebie_; }
    set {
      freebie_ = value;
    }
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public override bool Equals(object other) {
    return Equals(other as PricingDescriptor);
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public bool Equals(PricingDescriptor other) {
    if (ReferenceEquals(other, null)) {
      return false;
    }
    if (ReferenceEquals(other, this)) {
      return true;
    }
    if (Type != other.Type) return false;
    if (!object.Equals(Unit, other.Unit)) return false;
    if (!object.Equals(Weighted, other.Weighted)) return false;
    if (!object.Equals(Freebie, other.Freebie)) return false;
    return true;
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public override int GetHashCode() {
    int hash = 1;
    if (Type != 0) hash ^= Type.GetHashCode();
    if (unit_ != null) hash ^= Unit.GetHashCode();
    if (weighted_ != null) hash ^= Weighted.GetHashCode();
    if (freebie_ != null) hash ^= Freebie.GetHashCode();
    return hash;
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public override string ToString() {
    return pb::JsonFormatter.ToDiagnosticString(this);
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public void WriteTo(pb::CodedOutputStream output) {
    if (Type != 0) {
      output.WriteRawTag(8);
      output.WriteEnum((int) Type);
    }
    if (unit_ != null) {
      output.WriteRawTag(162, 1);
      output.WriteMessage(Unit);
    }
    if (weighted_ != null) {
      output.WriteRawTag(170, 1);
      output.WriteMessage(Weighted);
    }
    if (freebie_ != null) {
      output.WriteRawTag(178, 1);
      output.WriteMessage(Freebie);
    }
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public int CalculateSize() {
    int size = 0;
    if (Type != 0) {
      size += 1 + pb::CodedOutputStream.ComputeEnumSize((int) Type);
    }
    if (unit_ != null) {
      size += 2 + pb::CodedOutputStream.ComputeMessageSize(Unit);
    }
    if (weighted_ != null) {
      size += 2 + pb::CodedOutputStream.ComputeMessageSize(Weighted);
    }
    if (freebie_ != null) {
      size += 2 + pb::CodedOutputStream.ComputeMessageSize(Freebie);
    }
    return size;
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public void MergeFrom(PricingDescriptor other) {
    if (other == null) {
      return;
    }
    if (other.Type != 0) {
      Type = other.Type;
    }
    if (other.unit_ != null) {
      if (unit_ == null) {
        unit_ = new global::UnitPricingDescriptor();
      }
      Unit.MergeFrom(other.Unit);
    }
    if (other.weighted_ != null) {
      if (weighted_ == null) {
        weighted_ = new global::WeightedPricingDescriptor();
      }
      Weighted.MergeFrom(other.Weighted);
    }
    if (other.freebie_ != null) {
      if (freebie_ == null) {
        freebie_ = new global::FreebiePricingDescriptor();
      }
      Freebie.MergeFrom(other.Freebie);
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
          type_ = (global::PricingType) input.ReadEnum();
          break;
        }
        case 162: {
          if (unit_ == null) {
            unit_ = new global::UnitPricingDescriptor();
          }
          input.ReadMessage(unit_);
          break;
        }
        case 170: {
          if (weighted_ == null) {
            weighted_ = new global::WeightedPricingDescriptor();
          }
          input.ReadMessage(weighted_);
          break;
        }
        case 178: {
          if (freebie_ == null) {
            freebie_ = new global::FreebiePricingDescriptor();
          }
          input.ReadMessage(freebie_);
          break;
        }
      }
    }
  }

}

/// <summary>
/// -- Pricing: Product-level Object
/// </summary>
public sealed partial class ProductPricing : pb::IMessage<ProductPricing> {
  private static readonly pb::MessageParser<ProductPricing> _parser = new pb::MessageParser<ProductPricing>(() => new ProductPricing());
  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public static pb::MessageParser<ProductPricing> Parser { get { return _parser; } }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public static pbr::MessageDescriptor Descriptor {
    get { return global::PricingDescriptorReflection.Descriptor.MessageTypes[5]; }
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  pbr::MessageDescriptor pb::IMessage.Descriptor {
    get { return Descriptor; }
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public ProductPricing() {
    OnConstruction();
  }

  partial void OnConstruction();

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public ProductPricing(ProductPricing other) : this() {
    discounts_ = other.discounts_.Clone();
    manifest_ = other.manifest_.Clone();
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public ProductPricing Clone() {
    return new ProductPricing(this);
  }

  /// <summary>Field number for the "discounts" field.</summary>
  public const int DiscountsFieldNumber = 1;
  private static readonly pb::FieldCodec<global::SaleDescriptor> _repeated_discounts_codec
      = pb::FieldCodec.ForMessage(10, global::SaleDescriptor.Parser);
  private readonly pbc::RepeatedField<global::SaleDescriptor> discounts_ = new pbc::RepeatedField<global::SaleDescriptor>();
  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public pbc::RepeatedField<global::SaleDescriptor> Discounts {
    get { return discounts_; }
  }

  /// <summary>Field number for the "manifest" field.</summary>
  public const int ManifestFieldNumber = 2;
  private static readonly pb::FieldCodec<global::PricingDescriptor> _repeated_manifest_codec
      = pb::FieldCodec.ForMessage(18, global::PricingDescriptor.Parser);
  private readonly pbc::RepeatedField<global::PricingDescriptor> manifest_ = new pbc::RepeatedField<global::PricingDescriptor>();
  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public pbc::RepeatedField<global::PricingDescriptor> Manifest {
    get { return manifest_; }
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public override bool Equals(object other) {
    return Equals(other as ProductPricing);
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public bool Equals(ProductPricing other) {
    if (ReferenceEquals(other, null)) {
      return false;
    }
    if (ReferenceEquals(other, this)) {
      return true;
    }
    if(!discounts_.Equals(other.discounts_)) return false;
    if(!manifest_.Equals(other.manifest_)) return false;
    return true;
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public override int GetHashCode() {
    int hash = 1;
    hash ^= discounts_.GetHashCode();
    hash ^= manifest_.GetHashCode();
    return hash;
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public override string ToString() {
    return pb::JsonFormatter.ToDiagnosticString(this);
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public void WriteTo(pb::CodedOutputStream output) {
    discounts_.WriteTo(output, _repeated_discounts_codec);
    manifest_.WriteTo(output, _repeated_manifest_codec);
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public int CalculateSize() {
    int size = 0;
    size += discounts_.CalculateSize(_repeated_discounts_codec);
    size += manifest_.CalculateSize(_repeated_manifest_codec);
    return size;
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public void MergeFrom(ProductPricing other) {
    if (other == null) {
      return;
    }
    discounts_.Add(other.discounts_);
    manifest_.Add(other.manifest_);
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public void MergeFrom(pb::CodedInputStream input) {
    uint tag;
    while ((tag = input.ReadTag()) != 0) {
      switch(tag) {
        default:
          input.SkipLastField();
          break;
        case 10: {
          discounts_.AddEntriesFrom(input, _repeated_discounts_codec);
          break;
        }
        case 18: {
          manifest_.AddEntriesFrom(input, _repeated_manifest_codec);
          break;
        }
      }
    }
  }

}

#endregion


#endregion Designer generated code
