// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: structs/pricing/PricingDescriptor.proto

package io.bloombox.schema.product.struct;

/**
 * <pre>
 * -- Pricing: Typed Descriptors
 * </pre>
 *
 * Protobuf type {@code UnitPricingDescriptor}
 */
public  final class UnitPricingDescriptor extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:UnitPricingDescriptor)
    UnitPricingDescriptorOrBuilder {
  // Use UnitPricingDescriptor.newBuilder() to construct.
  private UnitPricingDescriptor(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UnitPricingDescriptor() {
    priceValue_ = 0F;
    discounts_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private UnitPricingDescriptor(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 13: {

            priceValue_ = input.readFloat();
            break;
          }
          case 18: {
            io.bloombox.schema.product.struct.PricingTierAvailability.Builder subBuilder = null;
            if (status_ != null) {
              subBuilder = status_.toBuilder();
            }
            status_ = input.readMessage(io.bloombox.schema.product.struct.PricingTierAvailability.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(status_);
              status_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
              discounts_ = new java.util.ArrayList<io.bloombox.schema.product.struct.SaleDescriptor>();
              mutable_bitField0_ |= 0x00000004;
            }
            discounts_.add(
                input.readMessage(io.bloombox.schema.product.struct.SaleDescriptor.parser(), extensionRegistry));
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
        discounts_ = java.util.Collections.unmodifiableList(discounts_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.bloombox.schema.product.struct.PricingDescriptorOuterClass.internal_static_UnitPricingDescriptor_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.bloombox.schema.product.struct.PricingDescriptorOuterClass.internal_static_UnitPricingDescriptor_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.bloombox.schema.product.struct.UnitPricingDescriptor.class, io.bloombox.schema.product.struct.UnitPricingDescriptor.Builder.class);
  }

  private int bitField0_;
  public static final int PRICE_VALUE_FIELD_NUMBER = 1;
  private float priceValue_;
  /**
   * <code>float price_value = 1;</code>
   */
  public float getPriceValue() {
    return priceValue_;
  }

  public static final int STATUS_FIELD_NUMBER = 2;
  private io.bloombox.schema.product.struct.PricingTierAvailability status_;
  /**
   * <code>.PricingTierAvailability status = 2;</code>
   */
  public boolean hasStatus() {
    return status_ != null;
  }
  /**
   * <code>.PricingTierAvailability status = 2;</code>
   */
  public io.bloombox.schema.product.struct.PricingTierAvailability getStatus() {
    return status_ == null ? io.bloombox.schema.product.struct.PricingTierAvailability.getDefaultInstance() : status_;
  }
  /**
   * <code>.PricingTierAvailability status = 2;</code>
   */
  public io.bloombox.schema.product.struct.PricingTierAvailabilityOrBuilder getStatusOrBuilder() {
    return getStatus();
  }

  public static final int DISCOUNTS_FIELD_NUMBER = 3;
  private java.util.List<io.bloombox.schema.product.struct.SaleDescriptor> discounts_;
  /**
   * <code>repeated .SaleDescriptor discounts = 3;</code>
   */
  public java.util.List<io.bloombox.schema.product.struct.SaleDescriptor> getDiscountsList() {
    return discounts_;
  }
  /**
   * <code>repeated .SaleDescriptor discounts = 3;</code>
   */
  public java.util.List<? extends io.bloombox.schema.product.struct.SaleDescriptorOrBuilder> 
      getDiscountsOrBuilderList() {
    return discounts_;
  }
  /**
   * <code>repeated .SaleDescriptor discounts = 3;</code>
   */
  public int getDiscountsCount() {
    return discounts_.size();
  }
  /**
   * <code>repeated .SaleDescriptor discounts = 3;</code>
   */
  public io.bloombox.schema.product.struct.SaleDescriptor getDiscounts(int index) {
    return discounts_.get(index);
  }
  /**
   * <code>repeated .SaleDescriptor discounts = 3;</code>
   */
  public io.bloombox.schema.product.struct.SaleDescriptorOrBuilder getDiscountsOrBuilder(
      int index) {
    return discounts_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (priceValue_ != 0F) {
      output.writeFloat(1, priceValue_);
    }
    if (status_ != null) {
      output.writeMessage(2, getStatus());
    }
    for (int i = 0; i < discounts_.size(); i++) {
      output.writeMessage(3, discounts_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (priceValue_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(1, priceValue_);
    }
    if (status_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getStatus());
    }
    for (int i = 0; i < discounts_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, discounts_.get(i));
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.bloombox.schema.product.struct.UnitPricingDescriptor)) {
      return super.equals(obj);
    }
    io.bloombox.schema.product.struct.UnitPricingDescriptor other = (io.bloombox.schema.product.struct.UnitPricingDescriptor) obj;

    boolean result = true;
    result = result && (
        java.lang.Float.floatToIntBits(getPriceValue())
        == java.lang.Float.floatToIntBits(
            other.getPriceValue()));
    result = result && (hasStatus() == other.hasStatus());
    if (hasStatus()) {
      result = result && getStatus()
          .equals(other.getStatus());
    }
    result = result && getDiscountsList()
        .equals(other.getDiscountsList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PRICE_VALUE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getPriceValue());
    if (hasStatus()) {
      hash = (37 * hash) + STATUS_FIELD_NUMBER;
      hash = (53 * hash) + getStatus().hashCode();
    }
    if (getDiscountsCount() > 0) {
      hash = (37 * hash) + DISCOUNTS_FIELD_NUMBER;
      hash = (53 * hash) + getDiscountsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.bloombox.schema.product.struct.UnitPricingDescriptor parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.product.struct.UnitPricingDescriptor parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.product.struct.UnitPricingDescriptor parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.product.struct.UnitPricingDescriptor parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.product.struct.UnitPricingDescriptor parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.product.struct.UnitPricingDescriptor parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.product.struct.UnitPricingDescriptor parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.product.struct.UnitPricingDescriptor parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.product.struct.UnitPricingDescriptor parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.product.struct.UnitPricingDescriptor parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.product.struct.UnitPricingDescriptor parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.product.struct.UnitPricingDescriptor parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.bloombox.schema.product.struct.UnitPricingDescriptor prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * -- Pricing: Typed Descriptors
   * </pre>
   *
   * Protobuf type {@code UnitPricingDescriptor}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:UnitPricingDescriptor)
      io.bloombox.schema.product.struct.UnitPricingDescriptorOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.bloombox.schema.product.struct.PricingDescriptorOuterClass.internal_static_UnitPricingDescriptor_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.bloombox.schema.product.struct.PricingDescriptorOuterClass.internal_static_UnitPricingDescriptor_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.bloombox.schema.product.struct.UnitPricingDescriptor.class, io.bloombox.schema.product.struct.UnitPricingDescriptor.Builder.class);
    }

    // Construct using io.bloombox.schema.product.struct.UnitPricingDescriptor.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getDiscountsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      priceValue_ = 0F;

      if (statusBuilder_ == null) {
        status_ = null;
      } else {
        status_ = null;
        statusBuilder_ = null;
      }
      if (discountsBuilder_ == null) {
        discounts_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
      } else {
        discountsBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.bloombox.schema.product.struct.PricingDescriptorOuterClass.internal_static_UnitPricingDescriptor_descriptor;
    }

    public io.bloombox.schema.product.struct.UnitPricingDescriptor getDefaultInstanceForType() {
      return io.bloombox.schema.product.struct.UnitPricingDescriptor.getDefaultInstance();
    }

    public io.bloombox.schema.product.struct.UnitPricingDescriptor build() {
      io.bloombox.schema.product.struct.UnitPricingDescriptor result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.bloombox.schema.product.struct.UnitPricingDescriptor buildPartial() {
      io.bloombox.schema.product.struct.UnitPricingDescriptor result = new io.bloombox.schema.product.struct.UnitPricingDescriptor(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.priceValue_ = priceValue_;
      if (statusBuilder_ == null) {
        result.status_ = status_;
      } else {
        result.status_ = statusBuilder_.build();
      }
      if (discountsBuilder_ == null) {
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          discounts_ = java.util.Collections.unmodifiableList(discounts_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.discounts_ = discounts_;
      } else {
        result.discounts_ = discountsBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.bloombox.schema.product.struct.UnitPricingDescriptor) {
        return mergeFrom((io.bloombox.schema.product.struct.UnitPricingDescriptor)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.bloombox.schema.product.struct.UnitPricingDescriptor other) {
      if (other == io.bloombox.schema.product.struct.UnitPricingDescriptor.getDefaultInstance()) return this;
      if (other.getPriceValue() != 0F) {
        setPriceValue(other.getPriceValue());
      }
      if (other.hasStatus()) {
        mergeStatus(other.getStatus());
      }
      if (discountsBuilder_ == null) {
        if (!other.discounts_.isEmpty()) {
          if (discounts_.isEmpty()) {
            discounts_ = other.discounts_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureDiscountsIsMutable();
            discounts_.addAll(other.discounts_);
          }
          onChanged();
        }
      } else {
        if (!other.discounts_.isEmpty()) {
          if (discountsBuilder_.isEmpty()) {
            discountsBuilder_.dispose();
            discountsBuilder_ = null;
            discounts_ = other.discounts_;
            bitField0_ = (bitField0_ & ~0x00000004);
            discountsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getDiscountsFieldBuilder() : null;
          } else {
            discountsBuilder_.addAllMessages(other.discounts_);
          }
        }
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.bloombox.schema.product.struct.UnitPricingDescriptor parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.bloombox.schema.product.struct.UnitPricingDescriptor) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private float priceValue_ ;
    /**
     * <code>float price_value = 1;</code>
     */
    public float getPriceValue() {
      return priceValue_;
    }
    /**
     * <code>float price_value = 1;</code>
     */
    public Builder setPriceValue(float value) {
      
      priceValue_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float price_value = 1;</code>
     */
    public Builder clearPriceValue() {
      
      priceValue_ = 0F;
      onChanged();
      return this;
    }

    private io.bloombox.schema.product.struct.PricingTierAvailability status_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.bloombox.schema.product.struct.PricingTierAvailability, io.bloombox.schema.product.struct.PricingTierAvailability.Builder, io.bloombox.schema.product.struct.PricingTierAvailabilityOrBuilder> statusBuilder_;
    /**
     * <code>.PricingTierAvailability status = 2;</code>
     */
    public boolean hasStatus() {
      return statusBuilder_ != null || status_ != null;
    }
    /**
     * <code>.PricingTierAvailability status = 2;</code>
     */
    public io.bloombox.schema.product.struct.PricingTierAvailability getStatus() {
      if (statusBuilder_ == null) {
        return status_ == null ? io.bloombox.schema.product.struct.PricingTierAvailability.getDefaultInstance() : status_;
      } else {
        return statusBuilder_.getMessage();
      }
    }
    /**
     * <code>.PricingTierAvailability status = 2;</code>
     */
    public Builder setStatus(io.bloombox.schema.product.struct.PricingTierAvailability value) {
      if (statusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        status_ = value;
        onChanged();
      } else {
        statusBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.PricingTierAvailability status = 2;</code>
     */
    public Builder setStatus(
        io.bloombox.schema.product.struct.PricingTierAvailability.Builder builderForValue) {
      if (statusBuilder_ == null) {
        status_ = builderForValue.build();
        onChanged();
      } else {
        statusBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.PricingTierAvailability status = 2;</code>
     */
    public Builder mergeStatus(io.bloombox.schema.product.struct.PricingTierAvailability value) {
      if (statusBuilder_ == null) {
        if (status_ != null) {
          status_ =
            io.bloombox.schema.product.struct.PricingTierAvailability.newBuilder(status_).mergeFrom(value).buildPartial();
        } else {
          status_ = value;
        }
        onChanged();
      } else {
        statusBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.PricingTierAvailability status = 2;</code>
     */
    public Builder clearStatus() {
      if (statusBuilder_ == null) {
        status_ = null;
        onChanged();
      } else {
        status_ = null;
        statusBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.PricingTierAvailability status = 2;</code>
     */
    public io.bloombox.schema.product.struct.PricingTierAvailability.Builder getStatusBuilder() {
      
      onChanged();
      return getStatusFieldBuilder().getBuilder();
    }
    /**
     * <code>.PricingTierAvailability status = 2;</code>
     */
    public io.bloombox.schema.product.struct.PricingTierAvailabilityOrBuilder getStatusOrBuilder() {
      if (statusBuilder_ != null) {
        return statusBuilder_.getMessageOrBuilder();
      } else {
        return status_ == null ?
            io.bloombox.schema.product.struct.PricingTierAvailability.getDefaultInstance() : status_;
      }
    }
    /**
     * <code>.PricingTierAvailability status = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.bloombox.schema.product.struct.PricingTierAvailability, io.bloombox.schema.product.struct.PricingTierAvailability.Builder, io.bloombox.schema.product.struct.PricingTierAvailabilityOrBuilder> 
        getStatusFieldBuilder() {
      if (statusBuilder_ == null) {
        statusBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.bloombox.schema.product.struct.PricingTierAvailability, io.bloombox.schema.product.struct.PricingTierAvailability.Builder, io.bloombox.schema.product.struct.PricingTierAvailabilityOrBuilder>(
                getStatus(),
                getParentForChildren(),
                isClean());
        status_ = null;
      }
      return statusBuilder_;
    }

    private java.util.List<io.bloombox.schema.product.struct.SaleDescriptor> discounts_ =
      java.util.Collections.emptyList();
    private void ensureDiscountsIsMutable() {
      if (!((bitField0_ & 0x00000004) == 0x00000004)) {
        discounts_ = new java.util.ArrayList<io.bloombox.schema.product.struct.SaleDescriptor>(discounts_);
        bitField0_ |= 0x00000004;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.bloombox.schema.product.struct.SaleDescriptor, io.bloombox.schema.product.struct.SaleDescriptor.Builder, io.bloombox.schema.product.struct.SaleDescriptorOrBuilder> discountsBuilder_;

    /**
     * <code>repeated .SaleDescriptor discounts = 3;</code>
     */
    public java.util.List<io.bloombox.schema.product.struct.SaleDescriptor> getDiscountsList() {
      if (discountsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(discounts_);
      } else {
        return discountsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .SaleDescriptor discounts = 3;</code>
     */
    public int getDiscountsCount() {
      if (discountsBuilder_ == null) {
        return discounts_.size();
      } else {
        return discountsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .SaleDescriptor discounts = 3;</code>
     */
    public io.bloombox.schema.product.struct.SaleDescriptor getDiscounts(int index) {
      if (discountsBuilder_ == null) {
        return discounts_.get(index);
      } else {
        return discountsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .SaleDescriptor discounts = 3;</code>
     */
    public Builder setDiscounts(
        int index, io.bloombox.schema.product.struct.SaleDescriptor value) {
      if (discountsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDiscountsIsMutable();
        discounts_.set(index, value);
        onChanged();
      } else {
        discountsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .SaleDescriptor discounts = 3;</code>
     */
    public Builder setDiscounts(
        int index, io.bloombox.schema.product.struct.SaleDescriptor.Builder builderForValue) {
      if (discountsBuilder_ == null) {
        ensureDiscountsIsMutable();
        discounts_.set(index, builderForValue.build());
        onChanged();
      } else {
        discountsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .SaleDescriptor discounts = 3;</code>
     */
    public Builder addDiscounts(io.bloombox.schema.product.struct.SaleDescriptor value) {
      if (discountsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDiscountsIsMutable();
        discounts_.add(value);
        onChanged();
      } else {
        discountsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .SaleDescriptor discounts = 3;</code>
     */
    public Builder addDiscounts(
        int index, io.bloombox.schema.product.struct.SaleDescriptor value) {
      if (discountsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDiscountsIsMutable();
        discounts_.add(index, value);
        onChanged();
      } else {
        discountsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .SaleDescriptor discounts = 3;</code>
     */
    public Builder addDiscounts(
        io.bloombox.schema.product.struct.SaleDescriptor.Builder builderForValue) {
      if (discountsBuilder_ == null) {
        ensureDiscountsIsMutable();
        discounts_.add(builderForValue.build());
        onChanged();
      } else {
        discountsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .SaleDescriptor discounts = 3;</code>
     */
    public Builder addDiscounts(
        int index, io.bloombox.schema.product.struct.SaleDescriptor.Builder builderForValue) {
      if (discountsBuilder_ == null) {
        ensureDiscountsIsMutable();
        discounts_.add(index, builderForValue.build());
        onChanged();
      } else {
        discountsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .SaleDescriptor discounts = 3;</code>
     */
    public Builder addAllDiscounts(
        java.lang.Iterable<? extends io.bloombox.schema.product.struct.SaleDescriptor> values) {
      if (discountsBuilder_ == null) {
        ensureDiscountsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, discounts_);
        onChanged();
      } else {
        discountsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .SaleDescriptor discounts = 3;</code>
     */
    public Builder clearDiscounts() {
      if (discountsBuilder_ == null) {
        discounts_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
      } else {
        discountsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .SaleDescriptor discounts = 3;</code>
     */
    public Builder removeDiscounts(int index) {
      if (discountsBuilder_ == null) {
        ensureDiscountsIsMutable();
        discounts_.remove(index);
        onChanged();
      } else {
        discountsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .SaleDescriptor discounts = 3;</code>
     */
    public io.bloombox.schema.product.struct.SaleDescriptor.Builder getDiscountsBuilder(
        int index) {
      return getDiscountsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .SaleDescriptor discounts = 3;</code>
     */
    public io.bloombox.schema.product.struct.SaleDescriptorOrBuilder getDiscountsOrBuilder(
        int index) {
      if (discountsBuilder_ == null) {
        return discounts_.get(index);  } else {
        return discountsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .SaleDescriptor discounts = 3;</code>
     */
    public java.util.List<? extends io.bloombox.schema.product.struct.SaleDescriptorOrBuilder> 
         getDiscountsOrBuilderList() {
      if (discountsBuilder_ != null) {
        return discountsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(discounts_);
      }
    }
    /**
     * <code>repeated .SaleDescriptor discounts = 3;</code>
     */
    public io.bloombox.schema.product.struct.SaleDescriptor.Builder addDiscountsBuilder() {
      return getDiscountsFieldBuilder().addBuilder(
          io.bloombox.schema.product.struct.SaleDescriptor.getDefaultInstance());
    }
    /**
     * <code>repeated .SaleDescriptor discounts = 3;</code>
     */
    public io.bloombox.schema.product.struct.SaleDescriptor.Builder addDiscountsBuilder(
        int index) {
      return getDiscountsFieldBuilder().addBuilder(
          index, io.bloombox.schema.product.struct.SaleDescriptor.getDefaultInstance());
    }
    /**
     * <code>repeated .SaleDescriptor discounts = 3;</code>
     */
    public java.util.List<io.bloombox.schema.product.struct.SaleDescriptor.Builder> 
         getDiscountsBuilderList() {
      return getDiscountsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.bloombox.schema.product.struct.SaleDescriptor, io.bloombox.schema.product.struct.SaleDescriptor.Builder, io.bloombox.schema.product.struct.SaleDescriptorOrBuilder> 
        getDiscountsFieldBuilder() {
      if (discountsBuilder_ == null) {
        discountsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.bloombox.schema.product.struct.SaleDescriptor, io.bloombox.schema.product.struct.SaleDescriptor.Builder, io.bloombox.schema.product.struct.SaleDescriptorOrBuilder>(
                discounts_,
                ((bitField0_ & 0x00000004) == 0x00000004),
                getParentForChildren(),
                isClean());
        discounts_ = null;
      }
      return discountsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:UnitPricingDescriptor)
  }

  // @@protoc_insertion_point(class_scope:UnitPricingDescriptor)
  private static final io.bloombox.schema.product.struct.UnitPricingDescriptor DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.bloombox.schema.product.struct.UnitPricingDescriptor();
  }

  public static io.bloombox.schema.product.struct.UnitPricingDescriptor getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UnitPricingDescriptor>
      PARSER = new com.google.protobuf.AbstractParser<UnitPricingDescriptor>() {
    public UnitPricingDescriptor parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new UnitPricingDescriptor(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UnitPricingDescriptor> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UnitPricingDescriptor> getParserForType() {
    return PARSER;
  }

  public io.bloombox.schema.product.struct.UnitPricingDescriptor getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

