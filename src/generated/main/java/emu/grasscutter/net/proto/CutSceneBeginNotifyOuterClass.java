// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CutSceneBeginNotify.proto

package emu.grasscutter.net.proto;

public final class CutSceneBeginNotifyOuterClass {
  private CutSceneBeginNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CutSceneBeginNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CutSceneBeginNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .CutSceneExtraParam extra_param_list = 2;</code>
     */
    java.util.List<emu.grasscutter.net.proto.CutSceneExtraParamOuterClass.CutSceneExtraParam> 
        getExtraParamListList();
    /**
     * <code>repeated .CutSceneExtraParam extra_param_list = 2;</code>
     */
    emu.grasscutter.net.proto.CutSceneExtraParamOuterClass.CutSceneExtraParam getExtraParamList(int index);
    /**
     * <code>repeated .CutSceneExtraParam extra_param_list = 2;</code>
     */
    int getExtraParamListCount();
    /**
     * <code>repeated .CutSceneExtraParam extra_param_list = 2;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.CutSceneExtraParamOuterClass.CutSceneExtraParamOrBuilder> 
        getExtraParamListOrBuilderList();
    /**
     * <code>repeated .CutSceneExtraParam extra_param_list = 2;</code>
     */
    emu.grasscutter.net.proto.CutSceneExtraParamOuterClass.CutSceneExtraParamOrBuilder getExtraParamListOrBuilder(
        int index);

    /**
     * <code>bool is_wait_others = 6;</code>
     * @return The isWaitOthers.
     */
    boolean getIsWaitOthers();

    /**
     * <code>uint32 cutscene_id = 12;</code>
     * @return The cutsceneId.
     */
    int getCutsceneId();
  }
  /**
   * <pre>
   * 4.6.0
   * CmdId: 28649
   * </pre>
   *
   * Protobuf type {@code CutSceneBeginNotify}
   */
  public static final class CutSceneBeginNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CutSceneBeginNotify)
      CutSceneBeginNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CutSceneBeginNotify.newBuilder() to construct.
    private CutSceneBeginNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CutSceneBeginNotify() {
      extraParamList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CutSceneBeginNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CutSceneBeginNotify(
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
            case 18: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                extraParamList_ = new java.util.ArrayList<emu.grasscutter.net.proto.CutSceneExtraParamOuterClass.CutSceneExtraParam>();
                mutable_bitField0_ |= 0x00000001;
              }
              extraParamList_.add(
                  input.readMessage(emu.grasscutter.net.proto.CutSceneExtraParamOuterClass.CutSceneExtraParam.parser(), extensionRegistry));
              break;
            }
            case 48: {

              isWaitOthers_ = input.readBool();
              break;
            }
            case 96: {

              cutsceneId_ = input.readUInt32();
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
          extraParamList_ = java.util.Collections.unmodifiableList(extraParamList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.CutSceneBeginNotifyOuterClass.internal_static_CutSceneBeginNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.CutSceneBeginNotifyOuterClass.internal_static_CutSceneBeginNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.CutSceneBeginNotifyOuterClass.CutSceneBeginNotify.class, emu.grasscutter.net.proto.CutSceneBeginNotifyOuterClass.CutSceneBeginNotify.Builder.class);
    }

    public static final int EXTRA_PARAM_LIST_FIELD_NUMBER = 2;
    private java.util.List<emu.grasscutter.net.proto.CutSceneExtraParamOuterClass.CutSceneExtraParam> extraParamList_;
    /**
     * <code>repeated .CutSceneExtraParam extra_param_list = 2;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.CutSceneExtraParamOuterClass.CutSceneExtraParam> getExtraParamListList() {
      return extraParamList_;
    }
    /**
     * <code>repeated .CutSceneExtraParam extra_param_list = 2;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.CutSceneExtraParamOuterClass.CutSceneExtraParamOrBuilder> 
        getExtraParamListOrBuilderList() {
      return extraParamList_;
    }
    /**
     * <code>repeated .CutSceneExtraParam extra_param_list = 2;</code>
     */
    @java.lang.Override
    public int getExtraParamListCount() {
      return extraParamList_.size();
    }
    /**
     * <code>repeated .CutSceneExtraParam extra_param_list = 2;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.CutSceneExtraParamOuterClass.CutSceneExtraParam getExtraParamList(int index) {
      return extraParamList_.get(index);
    }
    /**
     * <code>repeated .CutSceneExtraParam extra_param_list = 2;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.CutSceneExtraParamOuterClass.CutSceneExtraParamOrBuilder getExtraParamListOrBuilder(
        int index) {
      return extraParamList_.get(index);
    }

    public static final int IS_WAIT_OTHERS_FIELD_NUMBER = 6;
    private boolean isWaitOthers_;
    /**
     * <code>bool is_wait_others = 6;</code>
     * @return The isWaitOthers.
     */
    @java.lang.Override
    public boolean getIsWaitOthers() {
      return isWaitOthers_;
    }

    public static final int CUTSCENE_ID_FIELD_NUMBER = 12;
    private int cutsceneId_;
    /**
     * <code>uint32 cutscene_id = 12;</code>
     * @return The cutsceneId.
     */
    @java.lang.Override
    public int getCutsceneId() {
      return cutsceneId_;
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
      for (int i = 0; i < extraParamList_.size(); i++) {
        output.writeMessage(2, extraParamList_.get(i));
      }
      if (isWaitOthers_ != false) {
        output.writeBool(6, isWaitOthers_);
      }
      if (cutsceneId_ != 0) {
        output.writeUInt32(12, cutsceneId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < extraParamList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, extraParamList_.get(i));
      }
      if (isWaitOthers_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(6, isWaitOthers_);
      }
      if (cutsceneId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, cutsceneId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.CutSceneBeginNotifyOuterClass.CutSceneBeginNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.CutSceneBeginNotifyOuterClass.CutSceneBeginNotify other = (emu.grasscutter.net.proto.CutSceneBeginNotifyOuterClass.CutSceneBeginNotify) obj;

      if (!getExtraParamListList()
          .equals(other.getExtraParamListList())) return false;
      if (getIsWaitOthers()
          != other.getIsWaitOthers()) return false;
      if (getCutsceneId()
          != other.getCutsceneId()) return false;
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
      if (getExtraParamListCount() > 0) {
        hash = (37 * hash) + EXTRA_PARAM_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getExtraParamListList().hashCode();
      }
      hash = (37 * hash) + IS_WAIT_OTHERS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsWaitOthers());
      hash = (37 * hash) + CUTSCENE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCutsceneId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.CutSceneBeginNotifyOuterClass.CutSceneBeginNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CutSceneBeginNotifyOuterClass.CutSceneBeginNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CutSceneBeginNotifyOuterClass.CutSceneBeginNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CutSceneBeginNotifyOuterClass.CutSceneBeginNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CutSceneBeginNotifyOuterClass.CutSceneBeginNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CutSceneBeginNotifyOuterClass.CutSceneBeginNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CutSceneBeginNotifyOuterClass.CutSceneBeginNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CutSceneBeginNotifyOuterClass.CutSceneBeginNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CutSceneBeginNotifyOuterClass.CutSceneBeginNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CutSceneBeginNotifyOuterClass.CutSceneBeginNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CutSceneBeginNotifyOuterClass.CutSceneBeginNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CutSceneBeginNotifyOuterClass.CutSceneBeginNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.CutSceneBeginNotifyOuterClass.CutSceneBeginNotify prototype) {
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
     * 4.6.0
     * CmdId: 28649
     * </pre>
     *
     * Protobuf type {@code CutSceneBeginNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CutSceneBeginNotify)
        emu.grasscutter.net.proto.CutSceneBeginNotifyOuterClass.CutSceneBeginNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.CutSceneBeginNotifyOuterClass.internal_static_CutSceneBeginNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.CutSceneBeginNotifyOuterClass.internal_static_CutSceneBeginNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.CutSceneBeginNotifyOuterClass.CutSceneBeginNotify.class, emu.grasscutter.net.proto.CutSceneBeginNotifyOuterClass.CutSceneBeginNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.CutSceneBeginNotifyOuterClass.CutSceneBeginNotify.newBuilder()
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
          getExtraParamListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (extraParamListBuilder_ == null) {
          extraParamList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          extraParamListBuilder_.clear();
        }
        isWaitOthers_ = false;

        cutsceneId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.CutSceneBeginNotifyOuterClass.internal_static_CutSceneBeginNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CutSceneBeginNotifyOuterClass.CutSceneBeginNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.CutSceneBeginNotifyOuterClass.CutSceneBeginNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CutSceneBeginNotifyOuterClass.CutSceneBeginNotify build() {
        emu.grasscutter.net.proto.CutSceneBeginNotifyOuterClass.CutSceneBeginNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CutSceneBeginNotifyOuterClass.CutSceneBeginNotify buildPartial() {
        emu.grasscutter.net.proto.CutSceneBeginNotifyOuterClass.CutSceneBeginNotify result = new emu.grasscutter.net.proto.CutSceneBeginNotifyOuterClass.CutSceneBeginNotify(this);
        int from_bitField0_ = bitField0_;
        if (extraParamListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            extraParamList_ = java.util.Collections.unmodifiableList(extraParamList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.extraParamList_ = extraParamList_;
        } else {
          result.extraParamList_ = extraParamListBuilder_.build();
        }
        result.isWaitOthers_ = isWaitOthers_;
        result.cutsceneId_ = cutsceneId_;
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
        if (other instanceof emu.grasscutter.net.proto.CutSceneBeginNotifyOuterClass.CutSceneBeginNotify) {
          return mergeFrom((emu.grasscutter.net.proto.CutSceneBeginNotifyOuterClass.CutSceneBeginNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.CutSceneBeginNotifyOuterClass.CutSceneBeginNotify other) {
        if (other == emu.grasscutter.net.proto.CutSceneBeginNotifyOuterClass.CutSceneBeginNotify.getDefaultInstance()) return this;
        if (extraParamListBuilder_ == null) {
          if (!other.extraParamList_.isEmpty()) {
            if (extraParamList_.isEmpty()) {
              extraParamList_ = other.extraParamList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureExtraParamListIsMutable();
              extraParamList_.addAll(other.extraParamList_);
            }
            onChanged();
          }
        } else {
          if (!other.extraParamList_.isEmpty()) {
            if (extraParamListBuilder_.isEmpty()) {
              extraParamListBuilder_.dispose();
              extraParamListBuilder_ = null;
              extraParamList_ = other.extraParamList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              extraParamListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getExtraParamListFieldBuilder() : null;
            } else {
              extraParamListBuilder_.addAllMessages(other.extraParamList_);
            }
          }
        }
        if (other.getIsWaitOthers() != false) {
          setIsWaitOthers(other.getIsWaitOthers());
        }
        if (other.getCutsceneId() != 0) {
          setCutsceneId(other.getCutsceneId());
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
        emu.grasscutter.net.proto.CutSceneBeginNotifyOuterClass.CutSceneBeginNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.CutSceneBeginNotifyOuterClass.CutSceneBeginNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.CutSceneExtraParamOuterClass.CutSceneExtraParam> extraParamList_ =
        java.util.Collections.emptyList();
      private void ensureExtraParamListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          extraParamList_ = new java.util.ArrayList<emu.grasscutter.net.proto.CutSceneExtraParamOuterClass.CutSceneExtraParam>(extraParamList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.CutSceneExtraParamOuterClass.CutSceneExtraParam, emu.grasscutter.net.proto.CutSceneExtraParamOuterClass.CutSceneExtraParam.Builder, emu.grasscutter.net.proto.CutSceneExtraParamOuterClass.CutSceneExtraParamOrBuilder> extraParamListBuilder_;

      /**
       * <code>repeated .CutSceneExtraParam extra_param_list = 2;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.CutSceneExtraParamOuterClass.CutSceneExtraParam> getExtraParamListList() {
        if (extraParamListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(extraParamList_);
        } else {
          return extraParamListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .CutSceneExtraParam extra_param_list = 2;</code>
       */
      public int getExtraParamListCount() {
        if (extraParamListBuilder_ == null) {
          return extraParamList_.size();
        } else {
          return extraParamListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .CutSceneExtraParam extra_param_list = 2;</code>
       */
      public emu.grasscutter.net.proto.CutSceneExtraParamOuterClass.CutSceneExtraParam getExtraParamList(int index) {
        if (extraParamListBuilder_ == null) {
          return extraParamList_.get(index);
        } else {
          return extraParamListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .CutSceneExtraParam extra_param_list = 2;</code>
       */
      public Builder setExtraParamList(
          int index, emu.grasscutter.net.proto.CutSceneExtraParamOuterClass.CutSceneExtraParam value) {
        if (extraParamListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureExtraParamListIsMutable();
          extraParamList_.set(index, value);
          onChanged();
        } else {
          extraParamListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .CutSceneExtraParam extra_param_list = 2;</code>
       */
      public Builder setExtraParamList(
          int index, emu.grasscutter.net.proto.CutSceneExtraParamOuterClass.CutSceneExtraParam.Builder builderForValue) {
        if (extraParamListBuilder_ == null) {
          ensureExtraParamListIsMutable();
          extraParamList_.set(index, builderForValue.build());
          onChanged();
        } else {
          extraParamListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .CutSceneExtraParam extra_param_list = 2;</code>
       */
      public Builder addExtraParamList(emu.grasscutter.net.proto.CutSceneExtraParamOuterClass.CutSceneExtraParam value) {
        if (extraParamListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureExtraParamListIsMutable();
          extraParamList_.add(value);
          onChanged();
        } else {
          extraParamListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .CutSceneExtraParam extra_param_list = 2;</code>
       */
      public Builder addExtraParamList(
          int index, emu.grasscutter.net.proto.CutSceneExtraParamOuterClass.CutSceneExtraParam value) {
        if (extraParamListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureExtraParamListIsMutable();
          extraParamList_.add(index, value);
          onChanged();
        } else {
          extraParamListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .CutSceneExtraParam extra_param_list = 2;</code>
       */
      public Builder addExtraParamList(
          emu.grasscutter.net.proto.CutSceneExtraParamOuterClass.CutSceneExtraParam.Builder builderForValue) {
        if (extraParamListBuilder_ == null) {
          ensureExtraParamListIsMutable();
          extraParamList_.add(builderForValue.build());
          onChanged();
        } else {
          extraParamListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .CutSceneExtraParam extra_param_list = 2;</code>
       */
      public Builder addExtraParamList(
          int index, emu.grasscutter.net.proto.CutSceneExtraParamOuterClass.CutSceneExtraParam.Builder builderForValue) {
        if (extraParamListBuilder_ == null) {
          ensureExtraParamListIsMutable();
          extraParamList_.add(index, builderForValue.build());
          onChanged();
        } else {
          extraParamListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .CutSceneExtraParam extra_param_list = 2;</code>
       */
      public Builder addAllExtraParamList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.CutSceneExtraParamOuterClass.CutSceneExtraParam> values) {
        if (extraParamListBuilder_ == null) {
          ensureExtraParamListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, extraParamList_);
          onChanged();
        } else {
          extraParamListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .CutSceneExtraParam extra_param_list = 2;</code>
       */
      public Builder clearExtraParamList() {
        if (extraParamListBuilder_ == null) {
          extraParamList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          extraParamListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .CutSceneExtraParam extra_param_list = 2;</code>
       */
      public Builder removeExtraParamList(int index) {
        if (extraParamListBuilder_ == null) {
          ensureExtraParamListIsMutable();
          extraParamList_.remove(index);
          onChanged();
        } else {
          extraParamListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .CutSceneExtraParam extra_param_list = 2;</code>
       */
      public emu.grasscutter.net.proto.CutSceneExtraParamOuterClass.CutSceneExtraParam.Builder getExtraParamListBuilder(
          int index) {
        return getExtraParamListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .CutSceneExtraParam extra_param_list = 2;</code>
       */
      public emu.grasscutter.net.proto.CutSceneExtraParamOuterClass.CutSceneExtraParamOrBuilder getExtraParamListOrBuilder(
          int index) {
        if (extraParamListBuilder_ == null) {
          return extraParamList_.get(index);  } else {
          return extraParamListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .CutSceneExtraParam extra_param_list = 2;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.CutSceneExtraParamOuterClass.CutSceneExtraParamOrBuilder> 
           getExtraParamListOrBuilderList() {
        if (extraParamListBuilder_ != null) {
          return extraParamListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(extraParamList_);
        }
      }
      /**
       * <code>repeated .CutSceneExtraParam extra_param_list = 2;</code>
       */
      public emu.grasscutter.net.proto.CutSceneExtraParamOuterClass.CutSceneExtraParam.Builder addExtraParamListBuilder() {
        return getExtraParamListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.CutSceneExtraParamOuterClass.CutSceneExtraParam.getDefaultInstance());
      }
      /**
       * <code>repeated .CutSceneExtraParam extra_param_list = 2;</code>
       */
      public emu.grasscutter.net.proto.CutSceneExtraParamOuterClass.CutSceneExtraParam.Builder addExtraParamListBuilder(
          int index) {
        return getExtraParamListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.CutSceneExtraParamOuterClass.CutSceneExtraParam.getDefaultInstance());
      }
      /**
       * <code>repeated .CutSceneExtraParam extra_param_list = 2;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.CutSceneExtraParamOuterClass.CutSceneExtraParam.Builder> 
           getExtraParamListBuilderList() {
        return getExtraParamListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.CutSceneExtraParamOuterClass.CutSceneExtraParam, emu.grasscutter.net.proto.CutSceneExtraParamOuterClass.CutSceneExtraParam.Builder, emu.grasscutter.net.proto.CutSceneExtraParamOuterClass.CutSceneExtraParamOrBuilder> 
          getExtraParamListFieldBuilder() {
        if (extraParamListBuilder_ == null) {
          extraParamListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.CutSceneExtraParamOuterClass.CutSceneExtraParam, emu.grasscutter.net.proto.CutSceneExtraParamOuterClass.CutSceneExtraParam.Builder, emu.grasscutter.net.proto.CutSceneExtraParamOuterClass.CutSceneExtraParamOrBuilder>(
                  extraParamList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          extraParamList_ = null;
        }
        return extraParamListBuilder_;
      }

      private boolean isWaitOthers_ ;
      /**
       * <code>bool is_wait_others = 6;</code>
       * @return The isWaitOthers.
       */
      @java.lang.Override
      public boolean getIsWaitOthers() {
        return isWaitOthers_;
      }
      /**
       * <code>bool is_wait_others = 6;</code>
       * @param value The isWaitOthers to set.
       * @return This builder for chaining.
       */
      public Builder setIsWaitOthers(boolean value) {
        
        isWaitOthers_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_wait_others = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsWaitOthers() {
        
        isWaitOthers_ = false;
        onChanged();
        return this;
      }

      private int cutsceneId_ ;
      /**
       * <code>uint32 cutscene_id = 12;</code>
       * @return The cutsceneId.
       */
      @java.lang.Override
      public int getCutsceneId() {
        return cutsceneId_;
      }
      /**
       * <code>uint32 cutscene_id = 12;</code>
       * @param value The cutsceneId to set.
       * @return This builder for chaining.
       */
      public Builder setCutsceneId(int value) {
        
        cutsceneId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cutscene_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearCutsceneId() {
        
        cutsceneId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:CutSceneBeginNotify)
    }

    // @@protoc_insertion_point(class_scope:CutSceneBeginNotify)
    private static final emu.grasscutter.net.proto.CutSceneBeginNotifyOuterClass.CutSceneBeginNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.CutSceneBeginNotifyOuterClass.CutSceneBeginNotify();
    }

    public static emu.grasscutter.net.proto.CutSceneBeginNotifyOuterClass.CutSceneBeginNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CutSceneBeginNotify>
        PARSER = new com.google.protobuf.AbstractParser<CutSceneBeginNotify>() {
      @java.lang.Override
      public CutSceneBeginNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CutSceneBeginNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CutSceneBeginNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CutSceneBeginNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.CutSceneBeginNotifyOuterClass.CutSceneBeginNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CutSceneBeginNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CutSceneBeginNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031CutSceneBeginNotify.proto\032\030CutSceneExt" +
      "raParam.proto\"q\n\023CutSceneBeginNotify\022-\n\020" +
      "extra_param_list\030\002 \003(\0132\023.CutSceneExtraPa" +
      "ram\022\026\n\016is_wait_others\030\006 \001(\010\022\023\n\013cutscene_" +
      "id\030\014 \001(\rB\033\n\031emu.grasscutter.net.protob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.CutSceneExtraParamOuterClass.getDescriptor(),
        });
    internal_static_CutSceneBeginNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CutSceneBeginNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CutSceneBeginNotify_descriptor,
        new java.lang.String[] { "ExtraParamList", "IsWaitOthers", "CutsceneId", });
    emu.grasscutter.net.proto.CutSceneExtraParamOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
