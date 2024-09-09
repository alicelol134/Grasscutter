// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BattlePassBuySuccNotify.proto

package emu.grasscutter.net.proto;

public final class BattlePassBuySuccNotifyOuterClass {
  private BattlePassBuySuccNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BattlePassBuySuccNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BattlePassBuySuccNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 KMKIMDBFJKA = 1;</code>
     * @return The kMKIMDBFJKA.
     */
    int getKMKIMDBFJKA();

    /**
     * <code>uint32 MKEMPAAGNBA = 12;</code>
     * @return The mKEMPAAGNBA.
     */
    int getMKEMPAAGNBA();

    /**
     * <code>uint32 schedule_id = 13;</code>
     * @return The scheduleId.
     */
    int getScheduleId();

    /**
     * <code>repeated .ItemParam item_list = 15;</code>
     */
    java.util.List<emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam> 
        getItemListList();
    /**
     * <code>repeated .ItemParam item_list = 15;</code>
     */
    emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam getItemList(int index);
    /**
     * <code>repeated .ItemParam item_list = 15;</code>
     */
    int getItemListCount();
    /**
     * <code>repeated .ItemParam item_list = 15;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder> 
        getItemListOrBuilderList();
    /**
     * <code>repeated .ItemParam item_list = 15;</code>
     */
    emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder getItemListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * CmdId: 21408
   * </pre>
   *
   * Protobuf type {@code BattlePassBuySuccNotify}
   */
  public static final class BattlePassBuySuccNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BattlePassBuySuccNotify)
      BattlePassBuySuccNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BattlePassBuySuccNotify.newBuilder() to construct.
    private BattlePassBuySuccNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BattlePassBuySuccNotify() {
      itemList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BattlePassBuySuccNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.BattlePassBuySuccNotifyOuterClass.internal_static_BattlePassBuySuccNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.BattlePassBuySuccNotifyOuterClass.internal_static_BattlePassBuySuccNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.BattlePassBuySuccNotifyOuterClass.BattlePassBuySuccNotify.class, emu.grasscutter.net.proto.BattlePassBuySuccNotifyOuterClass.BattlePassBuySuccNotify.Builder.class);
    }

    public static final int KMKIMDBFJKA_FIELD_NUMBER = 1;
    private int kMKIMDBFJKA_;
    /**
     * <code>uint32 KMKIMDBFJKA = 1;</code>
     * @return The kMKIMDBFJKA.
     */
    @java.lang.Override
    public int getKMKIMDBFJKA() {
      return kMKIMDBFJKA_;
    }

    public static final int MKEMPAAGNBA_FIELD_NUMBER = 12;
    private int mKEMPAAGNBA_;
    /**
     * <code>uint32 MKEMPAAGNBA = 12;</code>
     * @return The mKEMPAAGNBA.
     */
    @java.lang.Override
    public int getMKEMPAAGNBA() {
      return mKEMPAAGNBA_;
    }

    public static final int SCHEDULE_ID_FIELD_NUMBER = 13;
    private int scheduleId_;
    /**
     * <code>uint32 schedule_id = 13;</code>
     * @return The scheduleId.
     */
    @java.lang.Override
    public int getScheduleId() {
      return scheduleId_;
    }

    public static final int ITEM_LIST_FIELD_NUMBER = 15;
    private java.util.List<emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam> itemList_;
    /**
     * <code>repeated .ItemParam item_list = 15;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam> getItemListList() {
      return itemList_;
    }
    /**
     * <code>repeated .ItemParam item_list = 15;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder> 
        getItemListOrBuilderList() {
      return itemList_;
    }
    /**
     * <code>repeated .ItemParam item_list = 15;</code>
     */
    @java.lang.Override
    public int getItemListCount() {
      return itemList_.size();
    }
    /**
     * <code>repeated .ItemParam item_list = 15;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam getItemList(int index) {
      return itemList_.get(index);
    }
    /**
     * <code>repeated .ItemParam item_list = 15;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder getItemListOrBuilder(
        int index) {
      return itemList_.get(index);
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
      if (kMKIMDBFJKA_ != 0) {
        output.writeUInt32(1, kMKIMDBFJKA_);
      }
      if (mKEMPAAGNBA_ != 0) {
        output.writeUInt32(12, mKEMPAAGNBA_);
      }
      if (scheduleId_ != 0) {
        output.writeUInt32(13, scheduleId_);
      }
      for (int i = 0; i < itemList_.size(); i++) {
        output.writeMessage(15, itemList_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (kMKIMDBFJKA_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, kMKIMDBFJKA_);
      }
      if (mKEMPAAGNBA_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, mKEMPAAGNBA_);
      }
      if (scheduleId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, scheduleId_);
      }
      for (int i = 0; i < itemList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(15, itemList_.get(i));
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.BattlePassBuySuccNotifyOuterClass.BattlePassBuySuccNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.BattlePassBuySuccNotifyOuterClass.BattlePassBuySuccNotify other = (emu.grasscutter.net.proto.BattlePassBuySuccNotifyOuterClass.BattlePassBuySuccNotify) obj;

      if (getKMKIMDBFJKA()
          != other.getKMKIMDBFJKA()) return false;
      if (getMKEMPAAGNBA()
          != other.getMKEMPAAGNBA()) return false;
      if (getScheduleId()
          != other.getScheduleId()) return false;
      if (!getItemListList()
          .equals(other.getItemListList())) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + KMKIMDBFJKA_FIELD_NUMBER;
      hash = (53 * hash) + getKMKIMDBFJKA();
      hash = (37 * hash) + MKEMPAAGNBA_FIELD_NUMBER;
      hash = (53 * hash) + getMKEMPAAGNBA();
      hash = (37 * hash) + SCHEDULE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getScheduleId();
      if (getItemListCount() > 0) {
        hash = (37 * hash) + ITEM_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getItemListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.BattlePassBuySuccNotifyOuterClass.BattlePassBuySuccNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BattlePassBuySuccNotifyOuterClass.BattlePassBuySuccNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BattlePassBuySuccNotifyOuterClass.BattlePassBuySuccNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BattlePassBuySuccNotifyOuterClass.BattlePassBuySuccNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BattlePassBuySuccNotifyOuterClass.BattlePassBuySuccNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BattlePassBuySuccNotifyOuterClass.BattlePassBuySuccNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BattlePassBuySuccNotifyOuterClass.BattlePassBuySuccNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BattlePassBuySuccNotifyOuterClass.BattlePassBuySuccNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BattlePassBuySuccNotifyOuterClass.BattlePassBuySuccNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BattlePassBuySuccNotifyOuterClass.BattlePassBuySuccNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BattlePassBuySuccNotifyOuterClass.BattlePassBuySuccNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BattlePassBuySuccNotifyOuterClass.BattlePassBuySuccNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.BattlePassBuySuccNotifyOuterClass.BattlePassBuySuccNotify prototype) {
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
     * CmdId: 21408
     * </pre>
     *
     * Protobuf type {@code BattlePassBuySuccNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BattlePassBuySuccNotify)
        emu.grasscutter.net.proto.BattlePassBuySuccNotifyOuterClass.BattlePassBuySuccNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.BattlePassBuySuccNotifyOuterClass.internal_static_BattlePassBuySuccNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.BattlePassBuySuccNotifyOuterClass.internal_static_BattlePassBuySuccNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.BattlePassBuySuccNotifyOuterClass.BattlePassBuySuccNotify.class, emu.grasscutter.net.proto.BattlePassBuySuccNotifyOuterClass.BattlePassBuySuccNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.BattlePassBuySuccNotifyOuterClass.BattlePassBuySuccNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        kMKIMDBFJKA_ = 0;

        mKEMPAAGNBA_ = 0;

        scheduleId_ = 0;

        if (itemListBuilder_ == null) {
          itemList_ = java.util.Collections.emptyList();
        } else {
          itemList_ = null;
          itemListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.BattlePassBuySuccNotifyOuterClass.internal_static_BattlePassBuySuccNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BattlePassBuySuccNotifyOuterClass.BattlePassBuySuccNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.BattlePassBuySuccNotifyOuterClass.BattlePassBuySuccNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BattlePassBuySuccNotifyOuterClass.BattlePassBuySuccNotify build() {
        emu.grasscutter.net.proto.BattlePassBuySuccNotifyOuterClass.BattlePassBuySuccNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BattlePassBuySuccNotifyOuterClass.BattlePassBuySuccNotify buildPartial() {
        emu.grasscutter.net.proto.BattlePassBuySuccNotifyOuterClass.BattlePassBuySuccNotify result = new emu.grasscutter.net.proto.BattlePassBuySuccNotifyOuterClass.BattlePassBuySuccNotify(this);
        int from_bitField0_ = bitField0_;
        result.kMKIMDBFJKA_ = kMKIMDBFJKA_;
        result.mKEMPAAGNBA_ = mKEMPAAGNBA_;
        result.scheduleId_ = scheduleId_;
        if (itemListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            itemList_ = java.util.Collections.unmodifiableList(itemList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.itemList_ = itemList_;
        } else {
          result.itemList_ = itemListBuilder_.build();
        }
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
        if (other instanceof emu.grasscutter.net.proto.BattlePassBuySuccNotifyOuterClass.BattlePassBuySuccNotify) {
          return mergeFrom((emu.grasscutter.net.proto.BattlePassBuySuccNotifyOuterClass.BattlePassBuySuccNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.BattlePassBuySuccNotifyOuterClass.BattlePassBuySuccNotify other) {
        if (other == emu.grasscutter.net.proto.BattlePassBuySuccNotifyOuterClass.BattlePassBuySuccNotify.getDefaultInstance()) return this;
        if (other.getKMKIMDBFJKA() != 0) {
          setKMKIMDBFJKA(other.getKMKIMDBFJKA());
        }
        if (other.getMKEMPAAGNBA() != 0) {
          setMKEMPAAGNBA(other.getMKEMPAAGNBA());
        }
        if (other.getScheduleId() != 0) {
          setScheduleId(other.getScheduleId());
        }
        if (itemListBuilder_ == null) {
          if (!other.itemList_.isEmpty()) {
            if (itemList_.isEmpty()) {
              itemList_ = other.itemList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureItemListIsMutable();
              itemList_.addAll(other.itemList_);
            }
            onChanged();
          }
        } else {
          if (!other.itemList_.isEmpty()) {
            if (itemListBuilder_.isEmpty()) {
              itemListBuilder_.dispose();
              itemListBuilder_ = null;
              itemList_ = other.itemList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              itemListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getItemListFieldBuilder() : null;
            } else {
              itemListBuilder_.addAllMessages(other.itemList_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
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
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 8: {
                kMKIMDBFJKA_ = input.readUInt32();

                break;
              } // case 8
              case 96: {
                mKEMPAAGNBA_ = input.readUInt32();

                break;
              } // case 96
              case 104: {
                scheduleId_ = input.readUInt32();

                break;
              } // case 104
              case 122: {
                emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam m =
                    input.readMessage(
                        emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.parser(),
                        extensionRegistry);
                if (itemListBuilder_ == null) {
                  ensureItemListIsMutable();
                  itemList_.add(m);
                } else {
                  itemListBuilder_.addMessage(m);
                }
                break;
              } // case 122
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private int kMKIMDBFJKA_ ;
      /**
       * <code>uint32 KMKIMDBFJKA = 1;</code>
       * @return The kMKIMDBFJKA.
       */
      @java.lang.Override
      public int getKMKIMDBFJKA() {
        return kMKIMDBFJKA_;
      }
      /**
       * <code>uint32 KMKIMDBFJKA = 1;</code>
       * @param value The kMKIMDBFJKA to set.
       * @return This builder for chaining.
       */
      public Builder setKMKIMDBFJKA(int value) {
        
        kMKIMDBFJKA_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 KMKIMDBFJKA = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearKMKIMDBFJKA() {
        
        kMKIMDBFJKA_ = 0;
        onChanged();
        return this;
      }

      private int mKEMPAAGNBA_ ;
      /**
       * <code>uint32 MKEMPAAGNBA = 12;</code>
       * @return The mKEMPAAGNBA.
       */
      @java.lang.Override
      public int getMKEMPAAGNBA() {
        return mKEMPAAGNBA_;
      }
      /**
       * <code>uint32 MKEMPAAGNBA = 12;</code>
       * @param value The mKEMPAAGNBA to set.
       * @return This builder for chaining.
       */
      public Builder setMKEMPAAGNBA(int value) {
        
        mKEMPAAGNBA_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 MKEMPAAGNBA = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearMKEMPAAGNBA() {
        
        mKEMPAAGNBA_ = 0;
        onChanged();
        return this;
      }

      private int scheduleId_ ;
      /**
       * <code>uint32 schedule_id = 13;</code>
       * @return The scheduleId.
       */
      @java.lang.Override
      public int getScheduleId() {
        return scheduleId_;
      }
      /**
       * <code>uint32 schedule_id = 13;</code>
       * @param value The scheduleId to set.
       * @return This builder for chaining.
       */
      public Builder setScheduleId(int value) {
        
        scheduleId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 schedule_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearScheduleId() {
        
        scheduleId_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam> itemList_ =
        java.util.Collections.emptyList();
      private void ensureItemListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          itemList_ = new java.util.ArrayList<emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam>(itemList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder> itemListBuilder_;

      /**
       * <code>repeated .ItemParam item_list = 15;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam> getItemListList() {
        if (itemListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(itemList_);
        } else {
          return itemListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .ItemParam item_list = 15;</code>
       */
      public int getItemListCount() {
        if (itemListBuilder_ == null) {
          return itemList_.size();
        } else {
          return itemListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .ItemParam item_list = 15;</code>
       */
      public emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam getItemList(int index) {
        if (itemListBuilder_ == null) {
          return itemList_.get(index);
        } else {
          return itemListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .ItemParam item_list = 15;</code>
       */
      public Builder setItemList(
          int index, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam value) {
        if (itemListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemListIsMutable();
          itemList_.set(index, value);
          onChanged();
        } else {
          itemListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam item_list = 15;</code>
       */
      public Builder setItemList(
          int index, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder builderForValue) {
        if (itemListBuilder_ == null) {
          ensureItemListIsMutable();
          itemList_.set(index, builderForValue.build());
          onChanged();
        } else {
          itemListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam item_list = 15;</code>
       */
      public Builder addItemList(emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam value) {
        if (itemListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemListIsMutable();
          itemList_.add(value);
          onChanged();
        } else {
          itemListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam item_list = 15;</code>
       */
      public Builder addItemList(
          int index, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam value) {
        if (itemListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemListIsMutable();
          itemList_.add(index, value);
          onChanged();
        } else {
          itemListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam item_list = 15;</code>
       */
      public Builder addItemList(
          emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder builderForValue) {
        if (itemListBuilder_ == null) {
          ensureItemListIsMutable();
          itemList_.add(builderForValue.build());
          onChanged();
        } else {
          itemListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam item_list = 15;</code>
       */
      public Builder addItemList(
          int index, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder builderForValue) {
        if (itemListBuilder_ == null) {
          ensureItemListIsMutable();
          itemList_.add(index, builderForValue.build());
          onChanged();
        } else {
          itemListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam item_list = 15;</code>
       */
      public Builder addAllItemList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam> values) {
        if (itemListBuilder_ == null) {
          ensureItemListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, itemList_);
          onChanged();
        } else {
          itemListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam item_list = 15;</code>
       */
      public Builder clearItemList() {
        if (itemListBuilder_ == null) {
          itemList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          itemListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam item_list = 15;</code>
       */
      public Builder removeItemList(int index) {
        if (itemListBuilder_ == null) {
          ensureItemListIsMutable();
          itemList_.remove(index);
          onChanged();
        } else {
          itemListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam item_list = 15;</code>
       */
      public emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder getItemListBuilder(
          int index) {
        return getItemListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .ItemParam item_list = 15;</code>
       */
      public emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder getItemListOrBuilder(
          int index) {
        if (itemListBuilder_ == null) {
          return itemList_.get(index);  } else {
          return itemListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .ItemParam item_list = 15;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder> 
           getItemListOrBuilderList() {
        if (itemListBuilder_ != null) {
          return itemListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(itemList_);
        }
      }
      /**
       * <code>repeated .ItemParam item_list = 15;</code>
       */
      public emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder addItemListBuilder() {
        return getItemListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.getDefaultInstance());
      }
      /**
       * <code>repeated .ItemParam item_list = 15;</code>
       */
      public emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder addItemListBuilder(
          int index) {
        return getItemListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.getDefaultInstance());
      }
      /**
       * <code>repeated .ItemParam item_list = 15;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder> 
           getItemListBuilderList() {
        return getItemListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder> 
          getItemListFieldBuilder() {
        if (itemListBuilder_ == null) {
          itemListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder>(
                  itemList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          itemList_ = null;
        }
        return itemListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:BattlePassBuySuccNotify)
    }

    // @@protoc_insertion_point(class_scope:BattlePassBuySuccNotify)
    private static final emu.grasscutter.net.proto.BattlePassBuySuccNotifyOuterClass.BattlePassBuySuccNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.BattlePassBuySuccNotifyOuterClass.BattlePassBuySuccNotify();
    }

    public static emu.grasscutter.net.proto.BattlePassBuySuccNotifyOuterClass.BattlePassBuySuccNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BattlePassBuySuccNotify>
        PARSER = new com.google.protobuf.AbstractParser<BattlePassBuySuccNotify>() {
      @java.lang.Override
      public BattlePassBuySuccNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<BattlePassBuySuccNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BattlePassBuySuccNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.BattlePassBuySuccNotifyOuterClass.BattlePassBuySuccNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BattlePassBuySuccNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BattlePassBuySuccNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035BattlePassBuySuccNotify.proto\032\017ItemPar" +
      "am.proto\"w\n\027BattlePassBuySuccNotify\022\023\n\013K" +
      "MKIMDBFJKA\030\001 \001(\r\022\023\n\013MKEMPAAGNBA\030\014 \001(\r\022\023\n" +
      "\013schedule_id\030\r \001(\r\022\035\n\titem_list\030\017 \003(\0132\n." +
      "ItemParamB\033\n\031emu.grasscutter.net.protob\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.ItemParamOuterClass.getDescriptor(),
        });
    internal_static_BattlePassBuySuccNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BattlePassBuySuccNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BattlePassBuySuccNotify_descriptor,
        new java.lang.String[] { "KMKIMDBFJKA", "MKEMPAAGNBA", "ScheduleId", "ItemList", });
    emu.grasscutter.net.proto.ItemParamOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
