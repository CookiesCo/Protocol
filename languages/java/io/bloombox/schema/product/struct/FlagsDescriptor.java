// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: structs/FlagsDescriptor.proto

package io.bloombox.schema.product.struct;

/**
 * Protobuf type {@code FlagsDescriptor}
 */
public  final class FlagsDescriptor extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:FlagsDescriptor)
    FlagsDescriptorOrBuilder {
  // Use FlagsDescriptor.newBuilder() to construct.
  private FlagsDescriptor(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FlagsDescriptor() {
    visible_ = false;
    premium_ = false;
    featured_ = false;
    lastchance_ = false;
    inhouse_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private FlagsDescriptor(
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

            visible_ = input.readBool();
            break;
          }
          case 16: {

            premium_ = input.readBool();
            break;
          }
          case 24: {

            featured_ = input.readBool();
            break;
          }
          case 32: {

            lastchance_ = input.readBool();
            break;
          }
          case 40: {

            inhouse_ = input.readBool();
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
    return io.bloombox.schema.product.struct.FlagsDescriptorOuterClass.internal_static_FlagsDescriptor_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.bloombox.schema.product.struct.FlagsDescriptorOuterClass.internal_static_FlagsDescriptor_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.bloombox.schema.product.struct.FlagsDescriptor.class, io.bloombox.schema.product.struct.FlagsDescriptor.Builder.class);
  }

  public static final int VISIBLE_FIELD_NUMBER = 1;
  private boolean visible_;
  /**
   * <code>bool visible = 1;</code>
   */
  public boolean getVisible() {
    return visible_;
  }

  public static final int PREMIUM_FIELD_NUMBER = 2;
  private boolean premium_;
  /**
   * <code>bool premium = 2;</code>
   */
  public boolean getPremium() {
    return premium_;
  }

  public static final int FEATURED_FIELD_NUMBER = 3;
  private boolean featured_;
  /**
   * <code>bool featured = 3;</code>
   */
  public boolean getFeatured() {
    return featured_;
  }

  public static final int LASTCHANCE_FIELD_NUMBER = 4;
  private boolean lastchance_;
  /**
   * <code>bool lastchance = 4;</code>
   */
  public boolean getLastchance() {
    return lastchance_;
  }

  public static final int INHOUSE_FIELD_NUMBER = 5;
  private boolean inhouse_;
  /**
   * <code>bool inhouse = 5;</code>
   */
  public boolean getInhouse() {
    return inhouse_;
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
    if (visible_ != false) {
      output.writeBool(1, visible_);
    }
    if (premium_ != false) {
      output.writeBool(2, premium_);
    }
    if (featured_ != false) {
      output.writeBool(3, featured_);
    }
    if (lastchance_ != false) {
      output.writeBool(4, lastchance_);
    }
    if (inhouse_ != false) {
      output.writeBool(5, inhouse_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (visible_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, visible_);
    }
    if (premium_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, premium_);
    }
    if (featured_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, featured_);
    }
    if (lastchance_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, lastchance_);
    }
    if (inhouse_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, inhouse_);
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
    if (!(obj instanceof io.bloombox.schema.product.struct.FlagsDescriptor)) {
      return super.equals(obj);
    }
    io.bloombox.schema.product.struct.FlagsDescriptor other = (io.bloombox.schema.product.struct.FlagsDescriptor) obj;

    boolean result = true;
    result = result && (getVisible()
        == other.getVisible());
    result = result && (getPremium()
        == other.getPremium());
    result = result && (getFeatured()
        == other.getFeatured());
    result = result && (getLastchance()
        == other.getLastchance());
    result = result && (getInhouse()
        == other.getInhouse());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + VISIBLE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getVisible());
    hash = (37 * hash) + PREMIUM_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getPremium());
    hash = (37 * hash) + FEATURED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getFeatured());
    hash = (37 * hash) + LASTCHANCE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getLastchance());
    hash = (37 * hash) + INHOUSE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getInhouse());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.bloombox.schema.product.struct.FlagsDescriptor parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.product.struct.FlagsDescriptor parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.product.struct.FlagsDescriptor parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.product.struct.FlagsDescriptor parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.product.struct.FlagsDescriptor parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.product.struct.FlagsDescriptor parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.product.struct.FlagsDescriptor parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.product.struct.FlagsDescriptor parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.product.struct.FlagsDescriptor parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.product.struct.FlagsDescriptor parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.product.struct.FlagsDescriptor parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.product.struct.FlagsDescriptor parseFrom(
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
  public static Builder newBuilder(io.bloombox.schema.product.struct.FlagsDescriptor prototype) {
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
   * Protobuf type {@code FlagsDescriptor}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:FlagsDescriptor)
      io.bloombox.schema.product.struct.FlagsDescriptorOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.bloombox.schema.product.struct.FlagsDescriptorOuterClass.internal_static_FlagsDescriptor_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.bloombox.schema.product.struct.FlagsDescriptorOuterClass.internal_static_FlagsDescriptor_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.bloombox.schema.product.struct.FlagsDescriptor.class, io.bloombox.schema.product.struct.FlagsDescriptor.Builder.class);
    }

    // Construct using io.bloombox.schema.product.struct.FlagsDescriptor.newBuilder()
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
      visible_ = false;

      premium_ = false;

      featured_ = false;

      lastchance_ = false;

      inhouse_ = false;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.bloombox.schema.product.struct.FlagsDescriptorOuterClass.internal_static_FlagsDescriptor_descriptor;
    }

    public io.bloombox.schema.product.struct.FlagsDescriptor getDefaultInstanceForType() {
      return io.bloombox.schema.product.struct.FlagsDescriptor.getDefaultInstance();
    }

    public io.bloombox.schema.product.struct.FlagsDescriptor build() {
      io.bloombox.schema.product.struct.FlagsDescriptor result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.bloombox.schema.product.struct.FlagsDescriptor buildPartial() {
      io.bloombox.schema.product.struct.FlagsDescriptor result = new io.bloombox.schema.product.struct.FlagsDescriptor(this);
      result.visible_ = visible_;
      result.premium_ = premium_;
      result.featured_ = featured_;
      result.lastchance_ = lastchance_;
      result.inhouse_ = inhouse_;
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
      if (other instanceof io.bloombox.schema.product.struct.FlagsDescriptor) {
        return mergeFrom((io.bloombox.schema.product.struct.FlagsDescriptor)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.bloombox.schema.product.struct.FlagsDescriptor other) {
      if (other == io.bloombox.schema.product.struct.FlagsDescriptor.getDefaultInstance()) return this;
      if (other.getVisible() != false) {
        setVisible(other.getVisible());
      }
      if (other.getPremium() != false) {
        setPremium(other.getPremium());
      }
      if (other.getFeatured() != false) {
        setFeatured(other.getFeatured());
      }
      if (other.getLastchance() != false) {
        setLastchance(other.getLastchance());
      }
      if (other.getInhouse() != false) {
        setInhouse(other.getInhouse());
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
      io.bloombox.schema.product.struct.FlagsDescriptor parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.bloombox.schema.product.struct.FlagsDescriptor) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean visible_ ;
    /**
     * <code>bool visible = 1;</code>
     */
    public boolean getVisible() {
      return visible_;
    }
    /**
     * <code>bool visible = 1;</code>
     */
    public Builder setVisible(boolean value) {
      
      visible_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool visible = 1;</code>
     */
    public Builder clearVisible() {
      
      visible_ = false;
      onChanged();
      return this;
    }

    private boolean premium_ ;
    /**
     * <code>bool premium = 2;</code>
     */
    public boolean getPremium() {
      return premium_;
    }
    /**
     * <code>bool premium = 2;</code>
     */
    public Builder setPremium(boolean value) {
      
      premium_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool premium = 2;</code>
     */
    public Builder clearPremium() {
      
      premium_ = false;
      onChanged();
      return this;
    }

    private boolean featured_ ;
    /**
     * <code>bool featured = 3;</code>
     */
    public boolean getFeatured() {
      return featured_;
    }
    /**
     * <code>bool featured = 3;</code>
     */
    public Builder setFeatured(boolean value) {
      
      featured_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool featured = 3;</code>
     */
    public Builder clearFeatured() {
      
      featured_ = false;
      onChanged();
      return this;
    }

    private boolean lastchance_ ;
    /**
     * <code>bool lastchance = 4;</code>
     */
    public boolean getLastchance() {
      return lastchance_;
    }
    /**
     * <code>bool lastchance = 4;</code>
     */
    public Builder setLastchance(boolean value) {
      
      lastchance_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool lastchance = 4;</code>
     */
    public Builder clearLastchance() {
      
      lastchance_ = false;
      onChanged();
      return this;
    }

    private boolean inhouse_ ;
    /**
     * <code>bool inhouse = 5;</code>
     */
    public boolean getInhouse() {
      return inhouse_;
    }
    /**
     * <code>bool inhouse = 5;</code>
     */
    public Builder setInhouse(boolean value) {
      
      inhouse_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool inhouse = 5;</code>
     */
    public Builder clearInhouse() {
      
      inhouse_ = false;
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


    // @@protoc_insertion_point(builder_scope:FlagsDescriptor)
  }

  // @@protoc_insertion_point(class_scope:FlagsDescriptor)
  private static final io.bloombox.schema.product.struct.FlagsDescriptor DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.bloombox.schema.product.struct.FlagsDescriptor();
  }

  public static io.bloombox.schema.product.struct.FlagsDescriptor getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FlagsDescriptor>
      PARSER = new com.google.protobuf.AbstractParser<FlagsDescriptor>() {
    public FlagsDescriptor parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new FlagsDescriptor(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FlagsDescriptor> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FlagsDescriptor> getParserForType() {
    return PARSER;
  }

  public io.bloombox.schema.product.struct.FlagsDescriptor getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

