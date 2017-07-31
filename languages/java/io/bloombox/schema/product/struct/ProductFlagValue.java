// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: structs/FlagsDescriptor.proto

package io.bloombox.schema.product.struct;

/**
 * Protobuf type {@code ProductFlagValue}
 */
public  final class ProductFlagValue extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ProductFlagValue)
    ProductFlagValueOrBuilder {
  // Use ProductFlagValue.newBuilder() to construct.
  private ProductFlagValue(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ProductFlagValue() {
    type_ = 0;
    value_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ProductFlagValue(
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
          case 8: {
            int rawValue = input.readEnum();

            type_ = rawValue;
            break;
          }
          case 16: {

            value_ = input.readBool();
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
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.bloombox.schema.product.struct.FlagsDescriptorOuterClass.internal_static_ProductFlagValue_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.bloombox.schema.product.struct.FlagsDescriptorOuterClass.internal_static_ProductFlagValue_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.bloombox.schema.product.struct.ProductFlagValue.class, io.bloombox.schema.product.struct.ProductFlagValue.Builder.class);
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_;
  /**
   * <code>.ProductFlag type = 1;</code>
   */
  public int getTypeValue() {
    return type_;
  }
  /**
   * <code>.ProductFlag type = 1;</code>
   */
  public io.bloombox.schema.product.struct.ProductFlag getType() {
    io.bloombox.schema.product.struct.ProductFlag result = io.bloombox.schema.product.struct.ProductFlag.valueOf(type_);
    return result == null ? io.bloombox.schema.product.struct.ProductFlag.UNRECOGNIZED : result;
  }

  public static final int VALUE_FIELD_NUMBER = 2;
  private boolean value_;
  /**
   * <code>bool value = 2;</code>
   */
  public boolean getValue() {
    return value_;
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
    if (type_ != io.bloombox.schema.product.struct.ProductFlag.VISIBLE.getNumber()) {
      output.writeEnum(1, type_);
    }
    if (value_ != false) {
      output.writeBool(2, value_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (type_ != io.bloombox.schema.product.struct.ProductFlag.VISIBLE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, type_);
    }
    if (value_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, value_);
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
    if (!(obj instanceof io.bloombox.schema.product.struct.ProductFlagValue)) {
      return super.equals(obj);
    }
    io.bloombox.schema.product.struct.ProductFlagValue other = (io.bloombox.schema.product.struct.ProductFlagValue) obj;

    boolean result = true;
    result = result && type_ == other.type_;
    result = result && (getValue()
        == other.getValue());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (37 * hash) + VALUE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getValue());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.bloombox.schema.product.struct.ProductFlagValue parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.product.struct.ProductFlagValue parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.product.struct.ProductFlagValue parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.product.struct.ProductFlagValue parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.product.struct.ProductFlagValue parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.product.struct.ProductFlagValue parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.product.struct.ProductFlagValue parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.product.struct.ProductFlagValue parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.product.struct.ProductFlagValue parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.product.struct.ProductFlagValue parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.product.struct.ProductFlagValue parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.product.struct.ProductFlagValue parseFrom(
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
  public static Builder newBuilder(io.bloombox.schema.product.struct.ProductFlagValue prototype) {
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
   * Protobuf type {@code ProductFlagValue}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ProductFlagValue)
      io.bloombox.schema.product.struct.ProductFlagValueOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.bloombox.schema.product.struct.FlagsDescriptorOuterClass.internal_static_ProductFlagValue_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.bloombox.schema.product.struct.FlagsDescriptorOuterClass.internal_static_ProductFlagValue_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.bloombox.schema.product.struct.ProductFlagValue.class, io.bloombox.schema.product.struct.ProductFlagValue.Builder.class);
    }

    // Construct using io.bloombox.schema.product.struct.ProductFlagValue.newBuilder()
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
      }
    }
    public Builder clear() {
      super.clear();
      type_ = 0;

      value_ = false;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.bloombox.schema.product.struct.FlagsDescriptorOuterClass.internal_static_ProductFlagValue_descriptor;
    }

    public io.bloombox.schema.product.struct.ProductFlagValue getDefaultInstanceForType() {
      return io.bloombox.schema.product.struct.ProductFlagValue.getDefaultInstance();
    }

    public io.bloombox.schema.product.struct.ProductFlagValue build() {
      io.bloombox.schema.product.struct.ProductFlagValue result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.bloombox.schema.product.struct.ProductFlagValue buildPartial() {
      io.bloombox.schema.product.struct.ProductFlagValue result = new io.bloombox.schema.product.struct.ProductFlagValue(this);
      result.type_ = type_;
      result.value_ = value_;
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
      if (other instanceof io.bloombox.schema.product.struct.ProductFlagValue) {
        return mergeFrom((io.bloombox.schema.product.struct.ProductFlagValue)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.bloombox.schema.product.struct.ProductFlagValue other) {
      if (other == io.bloombox.schema.product.struct.ProductFlagValue.getDefaultInstance()) return this;
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (other.getValue() != false) {
        setValue(other.getValue());
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
      io.bloombox.schema.product.struct.ProductFlagValue parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.bloombox.schema.product.struct.ProductFlagValue) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int type_ = 0;
    /**
     * <code>.ProductFlag type = 1;</code>
     */
    public int getTypeValue() {
      return type_;
    }
    /**
     * <code>.ProductFlag type = 1;</code>
     */
    public Builder setTypeValue(int value) {
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.ProductFlag type = 1;</code>
     */
    public io.bloombox.schema.product.struct.ProductFlag getType() {
      io.bloombox.schema.product.struct.ProductFlag result = io.bloombox.schema.product.struct.ProductFlag.valueOf(type_);
      return result == null ? io.bloombox.schema.product.struct.ProductFlag.UNRECOGNIZED : result;
    }
    /**
     * <code>.ProductFlag type = 1;</code>
     */
    public Builder setType(io.bloombox.schema.product.struct.ProductFlag value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.ProductFlag type = 1;</code>
     */
    public Builder clearType() {
      
      type_ = 0;
      onChanged();
      return this;
    }

    private boolean value_ ;
    /**
     * <code>bool value = 2;</code>
     */
    public boolean getValue() {
      return value_;
    }
    /**
     * <code>bool value = 2;</code>
     */
    public Builder setValue(boolean value) {
      
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool value = 2;</code>
     */
    public Builder clearValue() {
      
      value_ = false;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:ProductFlagValue)
  }

  // @@protoc_insertion_point(class_scope:ProductFlagValue)
  private static final io.bloombox.schema.product.struct.ProductFlagValue DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.bloombox.schema.product.struct.ProductFlagValue();
  }

  public static io.bloombox.schema.product.struct.ProductFlagValue getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProductFlagValue>
      PARSER = new com.google.protobuf.AbstractParser<ProductFlagValue>() {
    public ProductFlagValue parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ProductFlagValue(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ProductFlagValue> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProductFlagValue> getParserForType() {
    return PARSER;
  }

  public io.bloombox.schema.product.struct.ProductFlagValue getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

