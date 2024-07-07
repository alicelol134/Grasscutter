// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BattlePassProduct.proto

package emu.grasscutter.net.proto;

public final class BattlePassProductOuterClass {
  private BattlePassProductOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BattlePassProductOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BattlePassProduct)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string normal_product_id = 2;</code>
     * @return The normalProductId.
     */
    java.lang.String getNormalProductId();
    /**
     * <code>string normal_product_id = 2;</code>
     * @return The bytes for normalProductId.
     */
    com.google.protobuf.ByteString
        getNormalProductIdBytes();

    /**
     * <code>string upgrade_product_id = 4;</code>
     * @return The upgradeProductId.
     */
    java.lang.String getUpgradeProductId();
    /**
     * <code>string upgrade_product_id = 4;</code>
     * @return The bytes for upgradeProductId.
     */
    com.google.protobuf.ByteString
        getUpgradeProductIdBytes();

    /**
     * <code>string extra_product_id = 11;</code>
     * @return The extraProductId.
     */
    java.lang.String getExtraProductId();
    /**
     * <code>string extra_product_id = 11;</code>
     * @return The bytes for extraProductId.
     */
    com.google.protobuf.ByteString
        getExtraProductIdBytes();
  }
  /**
   * <pre>
   * Version: 4.6.0
   * Obfs: IPHAEDEDLGF
   * </pre>
   *
   * Protobuf type {@code BattlePassProduct}
   */
  public static final class BattlePassProduct extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BattlePassProduct)
      BattlePassProductOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BattlePassProduct.newBuilder() to construct.
    private BattlePassProduct(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BattlePassProduct() {
      normalProductId_ = "";
      upgradeProductId_ = "";
      extraProductId_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BattlePassProduct();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private BattlePassProduct(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              normalProductId_ = s;
              break;
            }
            case 34: {
              java.lang.String s = input.readStringRequireUtf8();

              upgradeProductId_ = s;
              break;
            }
            case 90: {
              java.lang.String s = input.readStringRequireUtf8();

              extraProductId_ = s;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.BattlePassProductOuterClass.internal_static_BattlePassProduct_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.BattlePassProductOuterClass.internal_static_BattlePassProduct_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.BattlePassProductOuterClass.BattlePassProduct.class, emu.grasscutter.net.proto.BattlePassProductOuterClass.BattlePassProduct.Builder.class);
    }

    public static final int NORMAL_PRODUCT_ID_FIELD_NUMBER = 2;
    private volatile java.lang.Object normalProductId_;
    /**
     * <code>string normal_product_id = 2;</code>
     * @return The normalProductId.
     */
    @java.lang.Override
    public java.lang.String getNormalProductId() {
      java.lang.Object ref = normalProductId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        normalProductId_ = s;
        return s;
      }
    }
    /**
     * <code>string normal_product_id = 2;</code>
     * @return The bytes for normalProductId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getNormalProductIdBytes() {
      java.lang.Object ref = normalProductId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        normalProductId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int UPGRADE_PRODUCT_ID_FIELD_NUMBER = 4;
    private volatile java.lang.Object upgradeProductId_;
    /**
     * <code>string upgrade_product_id = 4;</code>
     * @return The upgradeProductId.
     */
    @java.lang.Override
    public java.lang.String getUpgradeProductId() {
      java.lang.Object ref = upgradeProductId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        upgradeProductId_ = s;
        return s;
      }
    }
    /**
     * <code>string upgrade_product_id = 4;</code>
     * @return The bytes for upgradeProductId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getUpgradeProductIdBytes() {
      java.lang.Object ref = upgradeProductId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        upgradeProductId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int EXTRA_PRODUCT_ID_FIELD_NUMBER = 11;
    private volatile java.lang.Object extraProductId_;
    /**
     * <code>string extra_product_id = 11;</code>
     * @return The extraProductId.
     */
    @java.lang.Override
    public java.lang.String getExtraProductId() {
      java.lang.Object ref = extraProductId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        extraProductId_ = s;
        return s;
      }
    }
    /**
     * <code>string extra_product_id = 11;</code>
     * @return The bytes for extraProductId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getExtraProductIdBytes() {
      java.lang.Object ref = extraProductId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        extraProductId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(normalProductId_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, normalProductId_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(upgradeProductId_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, upgradeProductId_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(extraProductId_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 11, extraProductId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(normalProductId_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, normalProductId_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(upgradeProductId_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, upgradeProductId_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(extraProductId_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(11, extraProductId_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.BattlePassProductOuterClass.BattlePassProduct)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.BattlePassProductOuterClass.BattlePassProduct other = (emu.grasscutter.net.proto.BattlePassProductOuterClass.BattlePassProduct) obj;

      if (!getNormalProductId()
          .equals(other.getNormalProductId())) return false;
      if (!getUpgradeProductId()
          .equals(other.getUpgradeProductId())) return false;
      if (!getExtraProductId()
          .equals(other.getExtraProductId())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + NORMAL_PRODUCT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getNormalProductId().hashCode();
      hash = (37 * hash) + UPGRADE_PRODUCT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getUpgradeProductId().hashCode();
      hash = (37 * hash) + EXTRA_PRODUCT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getExtraProductId().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.BattlePassProductOuterClass.BattlePassProduct parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BattlePassProductOuterClass.BattlePassProduct parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BattlePassProductOuterClass.BattlePassProduct parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BattlePassProductOuterClass.BattlePassProduct parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BattlePassProductOuterClass.BattlePassProduct parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BattlePassProductOuterClass.BattlePassProduct parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BattlePassProductOuterClass.BattlePassProduct parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BattlePassProductOuterClass.BattlePassProduct parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BattlePassProductOuterClass.BattlePassProduct parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BattlePassProductOuterClass.BattlePassProduct parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BattlePassProductOuterClass.BattlePassProduct parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BattlePassProductOuterClass.BattlePassProduct parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.BattlePassProductOuterClass.BattlePassProduct prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
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
     * Version: 4.6.0
     * Obfs: IPHAEDEDLGF
     * </pre>
     *
     * Protobuf type {@code BattlePassProduct}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BattlePassProduct)
        emu.grasscutter.net.proto.BattlePassProductOuterClass.BattlePassProductOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.BattlePassProductOuterClass.internal_static_BattlePassProduct_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.BattlePassProductOuterClass.internal_static_BattlePassProduct_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.BattlePassProductOuterClass.BattlePassProduct.class, emu.grasscutter.net.proto.BattlePassProductOuterClass.BattlePassProduct.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.BattlePassProductOuterClass.BattlePassProduct.newBuilder()
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
      @java.lang.Override
      public Builder clear() {
        super.clear();
        normalProductId_ = "";

        upgradeProductId_ = "";

        extraProductId_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.BattlePassProductOuterClass.internal_static_BattlePassProduct_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BattlePassProductOuterClass.BattlePassProduct getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.BattlePassProductOuterClass.BattlePassProduct.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BattlePassProductOuterClass.BattlePassProduct build() {
        emu.grasscutter.net.proto.BattlePassProductOuterClass.BattlePassProduct result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BattlePassProductOuterClass.BattlePassProduct buildPartial() {
        emu.grasscutter.net.proto.BattlePassProductOuterClass.BattlePassProduct result = new emu.grasscutter.net.proto.BattlePassProductOuterClass.BattlePassProduct(this);
        result.normalProductId_ = normalProductId_;
        result.upgradeProductId_ = upgradeProductId_;
        result.extraProductId_ = extraProductId_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.BattlePassProductOuterClass.BattlePassProduct) {
          return mergeFrom((emu.grasscutter.net.proto.BattlePassProductOuterClass.BattlePassProduct)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.BattlePassProductOuterClass.BattlePassProduct other) {
        if (other == emu.grasscutter.net.proto.BattlePassProductOuterClass.BattlePassProduct.getDefaultInstance()) return this;
        if (!other.getNormalProductId().isEmpty()) {
          normalProductId_ = other.normalProductId_;
          onChanged();
        }
        if (!other.getUpgradeProductId().isEmpty()) {
          upgradeProductId_ = other.upgradeProductId_;
          onChanged();
        }
        if (!other.getExtraProductId().isEmpty()) {
          extraProductId_ = other.extraProductId_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.BattlePassProductOuterClass.BattlePassProduct parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.BattlePassProductOuterClass.BattlePassProduct) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object normalProductId_ = "";
      /**
       * <code>string normal_product_id = 2;</code>
       * @return The normalProductId.
       */
      public java.lang.String getNormalProductId() {
        java.lang.Object ref = normalProductId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          normalProductId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string normal_product_id = 2;</code>
       * @return The bytes for normalProductId.
       */
      public com.google.protobuf.ByteString
          getNormalProductIdBytes() {
        java.lang.Object ref = normalProductId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          normalProductId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string normal_product_id = 2;</code>
       * @param value The normalProductId to set.
       * @return This builder for chaining.
       */
      public Builder setNormalProductId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        normalProductId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string normal_product_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearNormalProductId() {
        
        normalProductId_ = getDefaultInstance().getNormalProductId();
        onChanged();
        return this;
      }
      /**
       * <code>string normal_product_id = 2;</code>
       * @param value The bytes for normalProductId to set.
       * @return This builder for chaining.
       */
      public Builder setNormalProductIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        normalProductId_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object upgradeProductId_ = "";
      /**
       * <code>string upgrade_product_id = 4;</code>
       * @return The upgradeProductId.
       */
      public java.lang.String getUpgradeProductId() {
        java.lang.Object ref = upgradeProductId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          upgradeProductId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string upgrade_product_id = 4;</code>
       * @return The bytes for upgradeProductId.
       */
      public com.google.protobuf.ByteString
          getUpgradeProductIdBytes() {
        java.lang.Object ref = upgradeProductId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          upgradeProductId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string upgrade_product_id = 4;</code>
       * @param value The upgradeProductId to set.
       * @return This builder for chaining.
       */
      public Builder setUpgradeProductId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        upgradeProductId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string upgrade_product_id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearUpgradeProductId() {
        
        upgradeProductId_ = getDefaultInstance().getUpgradeProductId();
        onChanged();
        return this;
      }
      /**
       * <code>string upgrade_product_id = 4;</code>
       * @param value The bytes for upgradeProductId to set.
       * @return This builder for chaining.
       */
      public Builder setUpgradeProductIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        upgradeProductId_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object extraProductId_ = "";
      /**
       * <code>string extra_product_id = 11;</code>
       * @return The extraProductId.
       */
      public java.lang.String getExtraProductId() {
        java.lang.Object ref = extraProductId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          extraProductId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string extra_product_id = 11;</code>
       * @return The bytes for extraProductId.
       */
      public com.google.protobuf.ByteString
          getExtraProductIdBytes() {
        java.lang.Object ref = extraProductId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          extraProductId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string extra_product_id = 11;</code>
       * @param value The extraProductId to set.
       * @return This builder for chaining.
       */
      public Builder setExtraProductId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        extraProductId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string extra_product_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearExtraProductId() {
        
        extraProductId_ = getDefaultInstance().getExtraProductId();
        onChanged();
        return this;
      }
      /**
       * <code>string extra_product_id = 11;</code>
       * @param value The bytes for extraProductId to set.
       * @return This builder for chaining.
       */
      public Builder setExtraProductIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        extraProductId_ = value;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:BattlePassProduct)
    }

    // @@protoc_insertion_point(class_scope:BattlePassProduct)
    private static final emu.grasscutter.net.proto.BattlePassProductOuterClass.BattlePassProduct DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.BattlePassProductOuterClass.BattlePassProduct();
    }

    public static emu.grasscutter.net.proto.BattlePassProductOuterClass.BattlePassProduct getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BattlePassProduct>
        PARSER = new com.google.protobuf.AbstractParser<BattlePassProduct>() {
      @java.lang.Override
      public BattlePassProduct parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new BattlePassProduct(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<BattlePassProduct> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BattlePassProduct> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.BattlePassProductOuterClass.BattlePassProduct getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BattlePassProduct_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BattlePassProduct_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027BattlePassProduct.proto\"d\n\021BattlePassP" +
      "roduct\022\031\n\021normal_product_id\030\002 \001(\t\022\032\n\022upg" +
      "rade_product_id\030\004 \001(\t\022\030\n\020extra_product_i" +
      "d\030\013 \001(\tB\033\n\031emu.grasscutter.net.protob\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_BattlePassProduct_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BattlePassProduct_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BattlePassProduct_descriptor,
        new java.lang.String[] { "NormalProductId", "UpgradeProductId", "ExtraProductId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
