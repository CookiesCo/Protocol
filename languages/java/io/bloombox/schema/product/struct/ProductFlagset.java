// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: structs/FlagsDescriptor.proto

package io.bloombox.schema.product.struct;

/**
 * Protobuf type {@code ProductFlagset}
 */
public  final class ProductFlagset extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ProductFlagset)
    ProductFlagsetOrBuilder {
  // Use ProductFlagset.newBuilder() to construct.
  private ProductFlagset(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ProductFlagset() {
    flags_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ProductFlagset(
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              flags_ = new java.util.ArrayList<io.bloombox.schema.product.struct.ProductFlagValue>();
              mutable_bitField0_ |= 0x00000001;
            }
            flags_.add(
                input.readMessage(io.bloombox.schema.product.struct.ProductFlagValue.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        flags_ = java.util.Collections.unmodifiableList(flags_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.bloombox.schema.product.struct.FlagsDescriptorOuterClass.internal_static_ProductFlagset_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.bloombox.schema.product.struct.FlagsDescriptorOuterClass.internal_static_ProductFlagset_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.bloombox.schema.product.struct.ProductFlagset.class, io.bloombox.schema.product.struct.ProductFlagset.Builder.class);
  }

  public static final int FLAGS_FIELD_NUMBER = 1;
  private java.util.List<io.bloombox.schema.product.struct.ProductFlagValue> flags_;
  /**
   * <code>repeated .ProductFlagValue flags = 1;</code>
   */
  public java.util.List<io.bloombox.schema.product.struct.ProductFlagValue> getFlagsList() {
    return flags_;
  }
  /**
   * <code>repeated .ProductFlagValue flags = 1;</code>
   */
  public java.util.List<? extends io.bloombox.schema.product.struct.ProductFlagValueOrBuilder> 
      getFlagsOrBuilderList() {
    return flags_;
  }
  /**
   * <code>repeated .ProductFlagValue flags = 1;</code>
   */
  public int getFlagsCount() {
    return flags_.size();
  }
  /**
   * <code>repeated .ProductFlagValue flags = 1;</code>
   */
  public io.bloombox.schema.product.struct.ProductFlagValue getFlags(int index) {
    return flags_.get(index);
  }
  /**
   * <code>repeated .ProductFlagValue flags = 1;</code>
   */
  public io.bloombox.schema.product.struct.ProductFlagValueOrBuilder getFlagsOrBuilder(
      int index) {
    return flags_.get(index);
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
    for (int i = 0; i < flags_.size(); i++) {
      output.writeMessage(1, flags_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < flags_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, flags_.get(i));
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
    if (!(obj instanceof io.bloombox.schema.product.struct.ProductFlagset)) {
      return super.equals(obj);
    }
    io.bloombox.schema.product.struct.ProductFlagset other = (io.bloombox.schema.product.struct.ProductFlagset) obj;

    boolean result = true;
    result = result && getFlagsList()
        .equals(other.getFlagsList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getFlagsCount() > 0) {
      hash = (37 * hash) + FLAGS_FIELD_NUMBER;
      hash = (53 * hash) + getFlagsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.bloombox.schema.product.struct.ProductFlagset parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.product.struct.ProductFlagset parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.product.struct.ProductFlagset parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.product.struct.ProductFlagset parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.product.struct.ProductFlagset parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.product.struct.ProductFlagset parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.product.struct.ProductFlagset parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.product.struct.ProductFlagset parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.product.struct.ProductFlagset parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.product.struct.ProductFlagset parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.product.struct.ProductFlagset parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.product.struct.ProductFlagset parseFrom(
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
  public static Builder newBuilder(io.bloombox.schema.product.struct.ProductFlagset prototype) {
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
   * Protobuf type {@code ProductFlagset}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ProductFlagset)
      io.bloombox.schema.product.struct.ProductFlagsetOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.bloombox.schema.product.struct.FlagsDescriptorOuterClass.internal_static_ProductFlagset_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.bloombox.schema.product.struct.FlagsDescriptorOuterClass.internal_static_ProductFlagset_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.bloombox.schema.product.struct.ProductFlagset.class, io.bloombox.schema.product.struct.ProductFlagset.Builder.class);
    }

    // Construct using io.bloombox.schema.product.struct.ProductFlagset.newBuilder()
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
        getFlagsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (flagsBuilder_ == null) {
        flags_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        flagsBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.bloombox.schema.product.struct.FlagsDescriptorOuterClass.internal_static_ProductFlagset_descriptor;
    }

    public io.bloombox.schema.product.struct.ProductFlagset getDefaultInstanceForType() {
      return io.bloombox.schema.product.struct.ProductFlagset.getDefaultInstance();
    }

    public io.bloombox.schema.product.struct.ProductFlagset build() {
      io.bloombox.schema.product.struct.ProductFlagset result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.bloombox.schema.product.struct.ProductFlagset buildPartial() {
      io.bloombox.schema.product.struct.ProductFlagset result = new io.bloombox.schema.product.struct.ProductFlagset(this);
      int from_bitField0_ = bitField0_;
      if (flagsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          flags_ = java.util.Collections.unmodifiableList(flags_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.flags_ = flags_;
      } else {
        result.flags_ = flagsBuilder_.build();
      }
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
      if (other instanceof io.bloombox.schema.product.struct.ProductFlagset) {
        return mergeFrom((io.bloombox.schema.product.struct.ProductFlagset)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.bloombox.schema.product.struct.ProductFlagset other) {
      if (other == io.bloombox.schema.product.struct.ProductFlagset.getDefaultInstance()) return this;
      if (flagsBuilder_ == null) {
        if (!other.flags_.isEmpty()) {
          if (flags_.isEmpty()) {
            flags_ = other.flags_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureFlagsIsMutable();
            flags_.addAll(other.flags_);
          }
          onChanged();
        }
      } else {
        if (!other.flags_.isEmpty()) {
          if (flagsBuilder_.isEmpty()) {
            flagsBuilder_.dispose();
            flagsBuilder_ = null;
            flags_ = other.flags_;
            bitField0_ = (bitField0_ & ~0x00000001);
            flagsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getFlagsFieldBuilder() : null;
          } else {
            flagsBuilder_.addAllMessages(other.flags_);
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
      io.bloombox.schema.product.struct.ProductFlagset parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.bloombox.schema.product.struct.ProductFlagset) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<io.bloombox.schema.product.struct.ProductFlagValue> flags_ =
      java.util.Collections.emptyList();
    private void ensureFlagsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        flags_ = new java.util.ArrayList<io.bloombox.schema.product.struct.ProductFlagValue>(flags_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.bloombox.schema.product.struct.ProductFlagValue, io.bloombox.schema.product.struct.ProductFlagValue.Builder, io.bloombox.schema.product.struct.ProductFlagValueOrBuilder> flagsBuilder_;

    /**
     * <code>repeated .ProductFlagValue flags = 1;</code>
     */
    public java.util.List<io.bloombox.schema.product.struct.ProductFlagValue> getFlagsList() {
      if (flagsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(flags_);
      } else {
        return flagsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .ProductFlagValue flags = 1;</code>
     */
    public int getFlagsCount() {
      if (flagsBuilder_ == null) {
        return flags_.size();
      } else {
        return flagsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .ProductFlagValue flags = 1;</code>
     */
    public io.bloombox.schema.product.struct.ProductFlagValue getFlags(int index) {
      if (flagsBuilder_ == null) {
        return flags_.get(index);
      } else {
        return flagsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .ProductFlagValue flags = 1;</code>
     */
    public Builder setFlags(
        int index, io.bloombox.schema.product.struct.ProductFlagValue value) {
      if (flagsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFlagsIsMutable();
        flags_.set(index, value);
        onChanged();
      } else {
        flagsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .ProductFlagValue flags = 1;</code>
     */
    public Builder setFlags(
        int index, io.bloombox.schema.product.struct.ProductFlagValue.Builder builderForValue) {
      if (flagsBuilder_ == null) {
        ensureFlagsIsMutable();
        flags_.set(index, builderForValue.build());
        onChanged();
      } else {
        flagsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ProductFlagValue flags = 1;</code>
     */
    public Builder addFlags(io.bloombox.schema.product.struct.ProductFlagValue value) {
      if (flagsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFlagsIsMutable();
        flags_.add(value);
        onChanged();
      } else {
        flagsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .ProductFlagValue flags = 1;</code>
     */
    public Builder addFlags(
        int index, io.bloombox.schema.product.struct.ProductFlagValue value) {
      if (flagsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFlagsIsMutable();
        flags_.add(index, value);
        onChanged();
      } else {
        flagsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .ProductFlagValue flags = 1;</code>
     */
    public Builder addFlags(
        io.bloombox.schema.product.struct.ProductFlagValue.Builder builderForValue) {
      if (flagsBuilder_ == null) {
        ensureFlagsIsMutable();
        flags_.add(builderForValue.build());
        onChanged();
      } else {
        flagsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ProductFlagValue flags = 1;</code>
     */
    public Builder addFlags(
        int index, io.bloombox.schema.product.struct.ProductFlagValue.Builder builderForValue) {
      if (flagsBuilder_ == null) {
        ensureFlagsIsMutable();
        flags_.add(index, builderForValue.build());
        onChanged();
      } else {
        flagsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ProductFlagValue flags = 1;</code>
     */
    public Builder addAllFlags(
        java.lang.Iterable<? extends io.bloombox.schema.product.struct.ProductFlagValue> values) {
      if (flagsBuilder_ == null) {
        ensureFlagsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, flags_);
        onChanged();
      } else {
        flagsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .ProductFlagValue flags = 1;</code>
     */
    public Builder clearFlags() {
      if (flagsBuilder_ == null) {
        flags_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        flagsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .ProductFlagValue flags = 1;</code>
     */
    public Builder removeFlags(int index) {
      if (flagsBuilder_ == null) {
        ensureFlagsIsMutable();
        flags_.remove(index);
        onChanged();
      } else {
        flagsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .ProductFlagValue flags = 1;</code>
     */
    public io.bloombox.schema.product.struct.ProductFlagValue.Builder getFlagsBuilder(
        int index) {
      return getFlagsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .ProductFlagValue flags = 1;</code>
     */
    public io.bloombox.schema.product.struct.ProductFlagValueOrBuilder getFlagsOrBuilder(
        int index) {
      if (flagsBuilder_ == null) {
        return flags_.get(index);  } else {
        return flagsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .ProductFlagValue flags = 1;</code>
     */
    public java.util.List<? extends io.bloombox.schema.product.struct.ProductFlagValueOrBuilder> 
         getFlagsOrBuilderList() {
      if (flagsBuilder_ != null) {
        return flagsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(flags_);
      }
    }
    /**
     * <code>repeated .ProductFlagValue flags = 1;</code>
     */
    public io.bloombox.schema.product.struct.ProductFlagValue.Builder addFlagsBuilder() {
      return getFlagsFieldBuilder().addBuilder(
          io.bloombox.schema.product.struct.ProductFlagValue.getDefaultInstance());
    }
    /**
     * <code>repeated .ProductFlagValue flags = 1;</code>
     */
    public io.bloombox.schema.product.struct.ProductFlagValue.Builder addFlagsBuilder(
        int index) {
      return getFlagsFieldBuilder().addBuilder(
          index, io.bloombox.schema.product.struct.ProductFlagValue.getDefaultInstance());
    }
    /**
     * <code>repeated .ProductFlagValue flags = 1;</code>
     */
    public java.util.List<io.bloombox.schema.product.struct.ProductFlagValue.Builder> 
         getFlagsBuilderList() {
      return getFlagsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.bloombox.schema.product.struct.ProductFlagValue, io.bloombox.schema.product.struct.ProductFlagValue.Builder, io.bloombox.schema.product.struct.ProductFlagValueOrBuilder> 
        getFlagsFieldBuilder() {
      if (flagsBuilder_ == null) {
        flagsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.bloombox.schema.product.struct.ProductFlagValue, io.bloombox.schema.product.struct.ProductFlagValue.Builder, io.bloombox.schema.product.struct.ProductFlagValueOrBuilder>(
                flags_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        flags_ = null;
      }
      return flagsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:ProductFlagset)
  }

  // @@protoc_insertion_point(class_scope:ProductFlagset)
  private static final io.bloombox.schema.product.struct.ProductFlagset DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.bloombox.schema.product.struct.ProductFlagset();
  }

  public static io.bloombox.schema.product.struct.ProductFlagset getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProductFlagset>
      PARSER = new com.google.protobuf.AbstractParser<ProductFlagset>() {
    public ProductFlagset parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ProductFlagset(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ProductFlagset> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProductFlagset> getParserForType() {
    return PARSER;
  }

  public io.bloombox.schema.product.struct.ProductFlagset getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

