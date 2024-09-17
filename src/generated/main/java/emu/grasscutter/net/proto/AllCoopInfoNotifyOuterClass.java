// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AllCoopInfoNotify.proto

package emu.grasscutter.net.proto;

public final class AllCoopInfoNotifyOuterClass {
  private AllCoopInfoNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AllCoopInfoNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AllCoopInfoNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .MainCoop main_coop_list = 8;</code>
     */
    java.util.List<emu.grasscutter.net.proto.MainCoopOuterClass.MainCoop> 
        getMainCoopListList();
    /**
     * <code>repeated .MainCoop main_coop_list = 8;</code>
     */
    emu.grasscutter.net.proto.MainCoopOuterClass.MainCoop getMainCoopList(int index);
    /**
     * <code>repeated .MainCoop main_coop_list = 8;</code>
     */
    int getMainCoopListCount();
    /**
     * <code>repeated .MainCoop main_coop_list = 8;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.MainCoopOuterClass.MainCoopOrBuilder> 
        getMainCoopListOrBuilderList();
    /**
     * <code>repeated .MainCoop main_coop_list = 8;</code>
     */
    emu.grasscutter.net.proto.MainCoopOuterClass.MainCoopOrBuilder getMainCoopListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * CmdId: 5763
   * Obf: KCAHMLALHHN
   * </pre>
   *
   * Protobuf type {@code AllCoopInfoNotify}
   */
  public static final class AllCoopInfoNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AllCoopInfoNotify)
      AllCoopInfoNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AllCoopInfoNotify.newBuilder() to construct.
    private AllCoopInfoNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AllCoopInfoNotify() {
      mainCoopList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AllCoopInfoNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AllCoopInfoNotify(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
            case 66: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                mainCoopList_ = new java.util.ArrayList<emu.grasscutter.net.proto.MainCoopOuterClass.MainCoop>();
                mutable_bitField0_ |= 0x00000001;
              }
              mainCoopList_.add(
                  input.readMessage(emu.grasscutter.net.proto.MainCoopOuterClass.MainCoop.parser(), extensionRegistry));
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          mainCoopList_ = java.util.Collections.unmodifiableList(mainCoopList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.AllCoopInfoNotifyOuterClass.internal_static_AllCoopInfoNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.AllCoopInfoNotifyOuterClass.internal_static_AllCoopInfoNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.AllCoopInfoNotifyOuterClass.AllCoopInfoNotify.class, emu.grasscutter.net.proto.AllCoopInfoNotifyOuterClass.AllCoopInfoNotify.Builder.class);
    }

    public static final int MAIN_COOP_LIST_FIELD_NUMBER = 8;
    private java.util.List<emu.grasscutter.net.proto.MainCoopOuterClass.MainCoop> mainCoopList_;
    /**
     * <code>repeated .MainCoop main_coop_list = 8;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.MainCoopOuterClass.MainCoop> getMainCoopListList() {
      return mainCoopList_;
    }
    /**
     * <code>repeated .MainCoop main_coop_list = 8;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.MainCoopOuterClass.MainCoopOrBuilder> 
        getMainCoopListOrBuilderList() {
      return mainCoopList_;
    }
    /**
     * <code>repeated .MainCoop main_coop_list = 8;</code>
     */
    @java.lang.Override
    public int getMainCoopListCount() {
      return mainCoopList_.size();
    }
    /**
     * <code>repeated .MainCoop main_coop_list = 8;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.MainCoopOuterClass.MainCoop getMainCoopList(int index) {
      return mainCoopList_.get(index);
    }
    /**
     * <code>repeated .MainCoop main_coop_list = 8;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.MainCoopOuterClass.MainCoopOrBuilder getMainCoopListOrBuilder(
        int index) {
      return mainCoopList_.get(index);
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
      for (int i = 0; i < mainCoopList_.size(); i++) {
        output.writeMessage(8, mainCoopList_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < mainCoopList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(8, mainCoopList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.AllCoopInfoNotifyOuterClass.AllCoopInfoNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.AllCoopInfoNotifyOuterClass.AllCoopInfoNotify other = (emu.grasscutter.net.proto.AllCoopInfoNotifyOuterClass.AllCoopInfoNotify) obj;

      if (!getMainCoopListList()
          .equals(other.getMainCoopListList())) return false;
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
      if (getMainCoopListCount() > 0) {
        hash = (37 * hash) + MAIN_COOP_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getMainCoopListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.AllCoopInfoNotifyOuterClass.AllCoopInfoNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AllCoopInfoNotifyOuterClass.AllCoopInfoNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AllCoopInfoNotifyOuterClass.AllCoopInfoNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AllCoopInfoNotifyOuterClass.AllCoopInfoNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AllCoopInfoNotifyOuterClass.AllCoopInfoNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AllCoopInfoNotifyOuterClass.AllCoopInfoNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AllCoopInfoNotifyOuterClass.AllCoopInfoNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AllCoopInfoNotifyOuterClass.AllCoopInfoNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AllCoopInfoNotifyOuterClass.AllCoopInfoNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AllCoopInfoNotifyOuterClass.AllCoopInfoNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AllCoopInfoNotifyOuterClass.AllCoopInfoNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AllCoopInfoNotifyOuterClass.AllCoopInfoNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.AllCoopInfoNotifyOuterClass.AllCoopInfoNotify prototype) {
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
     * CmdId: 5763
     * Obf: KCAHMLALHHN
     * </pre>
     *
     * Protobuf type {@code AllCoopInfoNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AllCoopInfoNotify)
        emu.grasscutter.net.proto.AllCoopInfoNotifyOuterClass.AllCoopInfoNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.AllCoopInfoNotifyOuterClass.internal_static_AllCoopInfoNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.AllCoopInfoNotifyOuterClass.internal_static_AllCoopInfoNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.AllCoopInfoNotifyOuterClass.AllCoopInfoNotify.class, emu.grasscutter.net.proto.AllCoopInfoNotifyOuterClass.AllCoopInfoNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.AllCoopInfoNotifyOuterClass.AllCoopInfoNotify.newBuilder()
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
          getMainCoopListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (mainCoopListBuilder_ == null) {
          mainCoopList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          mainCoopListBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.AllCoopInfoNotifyOuterClass.internal_static_AllCoopInfoNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AllCoopInfoNotifyOuterClass.AllCoopInfoNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.AllCoopInfoNotifyOuterClass.AllCoopInfoNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AllCoopInfoNotifyOuterClass.AllCoopInfoNotify build() {
        emu.grasscutter.net.proto.AllCoopInfoNotifyOuterClass.AllCoopInfoNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AllCoopInfoNotifyOuterClass.AllCoopInfoNotify buildPartial() {
        emu.grasscutter.net.proto.AllCoopInfoNotifyOuterClass.AllCoopInfoNotify result = new emu.grasscutter.net.proto.AllCoopInfoNotifyOuterClass.AllCoopInfoNotify(this);
        int from_bitField0_ = bitField0_;
        if (mainCoopListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            mainCoopList_ = java.util.Collections.unmodifiableList(mainCoopList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.mainCoopList_ = mainCoopList_;
        } else {
          result.mainCoopList_ = mainCoopListBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.AllCoopInfoNotifyOuterClass.AllCoopInfoNotify) {
          return mergeFrom((emu.grasscutter.net.proto.AllCoopInfoNotifyOuterClass.AllCoopInfoNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.AllCoopInfoNotifyOuterClass.AllCoopInfoNotify other) {
        if (other == emu.grasscutter.net.proto.AllCoopInfoNotifyOuterClass.AllCoopInfoNotify.getDefaultInstance()) return this;
        if (mainCoopListBuilder_ == null) {
          if (!other.mainCoopList_.isEmpty()) {
            if (mainCoopList_.isEmpty()) {
              mainCoopList_ = other.mainCoopList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureMainCoopListIsMutable();
              mainCoopList_.addAll(other.mainCoopList_);
            }
            onChanged();
          }
        } else {
          if (!other.mainCoopList_.isEmpty()) {
            if (mainCoopListBuilder_.isEmpty()) {
              mainCoopListBuilder_.dispose();
              mainCoopListBuilder_ = null;
              mainCoopList_ = other.mainCoopList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              mainCoopListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getMainCoopListFieldBuilder() : null;
            } else {
              mainCoopListBuilder_.addAllMessages(other.mainCoopList_);
            }
          }
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
        emu.grasscutter.net.proto.AllCoopInfoNotifyOuterClass.AllCoopInfoNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.AllCoopInfoNotifyOuterClass.AllCoopInfoNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.MainCoopOuterClass.MainCoop> mainCoopList_ =
        java.util.Collections.emptyList();
      private void ensureMainCoopListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          mainCoopList_ = new java.util.ArrayList<emu.grasscutter.net.proto.MainCoopOuterClass.MainCoop>(mainCoopList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.MainCoopOuterClass.MainCoop, emu.grasscutter.net.proto.MainCoopOuterClass.MainCoop.Builder, emu.grasscutter.net.proto.MainCoopOuterClass.MainCoopOrBuilder> mainCoopListBuilder_;

      /**
       * <code>repeated .MainCoop main_coop_list = 8;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.MainCoopOuterClass.MainCoop> getMainCoopListList() {
        if (mainCoopListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(mainCoopList_);
        } else {
          return mainCoopListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .MainCoop main_coop_list = 8;</code>
       */
      public int getMainCoopListCount() {
        if (mainCoopListBuilder_ == null) {
          return mainCoopList_.size();
        } else {
          return mainCoopListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .MainCoop main_coop_list = 8;</code>
       */
      public emu.grasscutter.net.proto.MainCoopOuterClass.MainCoop getMainCoopList(int index) {
        if (mainCoopListBuilder_ == null) {
          return mainCoopList_.get(index);
        } else {
          return mainCoopListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .MainCoop main_coop_list = 8;</code>
       */
      public Builder setMainCoopList(
          int index, emu.grasscutter.net.proto.MainCoopOuterClass.MainCoop value) {
        if (mainCoopListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMainCoopListIsMutable();
          mainCoopList_.set(index, value);
          onChanged();
        } else {
          mainCoopListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .MainCoop main_coop_list = 8;</code>
       */
      public Builder setMainCoopList(
          int index, emu.grasscutter.net.proto.MainCoopOuterClass.MainCoop.Builder builderForValue) {
        if (mainCoopListBuilder_ == null) {
          ensureMainCoopListIsMutable();
          mainCoopList_.set(index, builderForValue.build());
          onChanged();
        } else {
          mainCoopListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MainCoop main_coop_list = 8;</code>
       */
      public Builder addMainCoopList(emu.grasscutter.net.proto.MainCoopOuterClass.MainCoop value) {
        if (mainCoopListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMainCoopListIsMutable();
          mainCoopList_.add(value);
          onChanged();
        } else {
          mainCoopListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .MainCoop main_coop_list = 8;</code>
       */
      public Builder addMainCoopList(
          int index, emu.grasscutter.net.proto.MainCoopOuterClass.MainCoop value) {
        if (mainCoopListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMainCoopListIsMutable();
          mainCoopList_.add(index, value);
          onChanged();
        } else {
          mainCoopListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .MainCoop main_coop_list = 8;</code>
       */
      public Builder addMainCoopList(
          emu.grasscutter.net.proto.MainCoopOuterClass.MainCoop.Builder builderForValue) {
        if (mainCoopListBuilder_ == null) {
          ensureMainCoopListIsMutable();
          mainCoopList_.add(builderForValue.build());
          onChanged();
        } else {
          mainCoopListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MainCoop main_coop_list = 8;</code>
       */
      public Builder addMainCoopList(
          int index, emu.grasscutter.net.proto.MainCoopOuterClass.MainCoop.Builder builderForValue) {
        if (mainCoopListBuilder_ == null) {
          ensureMainCoopListIsMutable();
          mainCoopList_.add(index, builderForValue.build());
          onChanged();
        } else {
          mainCoopListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MainCoop main_coop_list = 8;</code>
       */
      public Builder addAllMainCoopList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.MainCoopOuterClass.MainCoop> values) {
        if (mainCoopListBuilder_ == null) {
          ensureMainCoopListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, mainCoopList_);
          onChanged();
        } else {
          mainCoopListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .MainCoop main_coop_list = 8;</code>
       */
      public Builder clearMainCoopList() {
        if (mainCoopListBuilder_ == null) {
          mainCoopList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          mainCoopListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .MainCoop main_coop_list = 8;</code>
       */
      public Builder removeMainCoopList(int index) {
        if (mainCoopListBuilder_ == null) {
          ensureMainCoopListIsMutable();
          mainCoopList_.remove(index);
          onChanged();
        } else {
          mainCoopListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .MainCoop main_coop_list = 8;</code>
       */
      public emu.grasscutter.net.proto.MainCoopOuterClass.MainCoop.Builder getMainCoopListBuilder(
          int index) {
        return getMainCoopListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .MainCoop main_coop_list = 8;</code>
       */
      public emu.grasscutter.net.proto.MainCoopOuterClass.MainCoopOrBuilder getMainCoopListOrBuilder(
          int index) {
        if (mainCoopListBuilder_ == null) {
          return mainCoopList_.get(index);  } else {
          return mainCoopListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .MainCoop main_coop_list = 8;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.MainCoopOuterClass.MainCoopOrBuilder> 
           getMainCoopListOrBuilderList() {
        if (mainCoopListBuilder_ != null) {
          return mainCoopListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(mainCoopList_);
        }
      }
      /**
       * <code>repeated .MainCoop main_coop_list = 8;</code>
       */
      public emu.grasscutter.net.proto.MainCoopOuterClass.MainCoop.Builder addMainCoopListBuilder() {
        return getMainCoopListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.MainCoopOuterClass.MainCoop.getDefaultInstance());
      }
      /**
       * <code>repeated .MainCoop main_coop_list = 8;</code>
       */
      public emu.grasscutter.net.proto.MainCoopOuterClass.MainCoop.Builder addMainCoopListBuilder(
          int index) {
        return getMainCoopListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.MainCoopOuterClass.MainCoop.getDefaultInstance());
      }
      /**
       * <code>repeated .MainCoop main_coop_list = 8;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.MainCoopOuterClass.MainCoop.Builder> 
           getMainCoopListBuilderList() {
        return getMainCoopListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.MainCoopOuterClass.MainCoop, emu.grasscutter.net.proto.MainCoopOuterClass.MainCoop.Builder, emu.grasscutter.net.proto.MainCoopOuterClass.MainCoopOrBuilder> 
          getMainCoopListFieldBuilder() {
        if (mainCoopListBuilder_ == null) {
          mainCoopListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.MainCoopOuterClass.MainCoop, emu.grasscutter.net.proto.MainCoopOuterClass.MainCoop.Builder, emu.grasscutter.net.proto.MainCoopOuterClass.MainCoopOrBuilder>(
                  mainCoopList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          mainCoopList_ = null;
        }
        return mainCoopListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:AllCoopInfoNotify)
    }

    // @@protoc_insertion_point(class_scope:AllCoopInfoNotify)
    private static final emu.grasscutter.net.proto.AllCoopInfoNotifyOuterClass.AllCoopInfoNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.AllCoopInfoNotifyOuterClass.AllCoopInfoNotify();
    }

    public static emu.grasscutter.net.proto.AllCoopInfoNotifyOuterClass.AllCoopInfoNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AllCoopInfoNotify>
        PARSER = new com.google.protobuf.AbstractParser<AllCoopInfoNotify>() {
      @java.lang.Override
      public AllCoopInfoNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AllCoopInfoNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AllCoopInfoNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AllCoopInfoNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.AllCoopInfoNotifyOuterClass.AllCoopInfoNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AllCoopInfoNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AllCoopInfoNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027AllCoopInfoNotify.proto\032\016MainCoop.prot" +
      "o\"6\n\021AllCoopInfoNotify\022!\n\016main_coop_list" +
      "\030\010 \003(\0132\t.MainCoopB\033\n\031emu.grasscutter.net" +
      ".protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.MainCoopOuterClass.getDescriptor(),
        });
    internal_static_AllCoopInfoNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AllCoopInfoNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AllCoopInfoNotify_descriptor,
        new java.lang.String[] { "MainCoopList", });
    emu.grasscutter.net.proto.MainCoopOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
