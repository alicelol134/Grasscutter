// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TakeBattlePassRewardReq.proto

package emu.grasscutter.net.proto;

public final class TakeBattlePassRewardReqOuterClass {
  private TakeBattlePassRewardReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TakeBattlePassRewardReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TakeBattlePassRewardReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .BattlePassRewardTakeOption take_option_list = 14;</code>
     */
    java.util.List<emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption> 
        getTakeOptionListList();
    /**
     * <code>repeated .BattlePassRewardTakeOption take_option_list = 14;</code>
     */
    emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption getTakeOptionList(int index);
    /**
     * <code>repeated .BattlePassRewardTakeOption take_option_list = 14;</code>
     */
    int getTakeOptionListCount();
    /**
     * <code>repeated .BattlePassRewardTakeOption take_option_list = 14;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOptionOrBuilder> 
        getTakeOptionListOrBuilderList();
    /**
     * <code>repeated .BattlePassRewardTakeOption take_option_list = 14;</code>
     */
    emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOptionOrBuilder getTakeOptionListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * CmdId: 29828
   * obf: OMMFIGKBKOO
   * </pre>
   *
   * Protobuf type {@code TakeBattlePassRewardReq}
   */
  public static final class TakeBattlePassRewardReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TakeBattlePassRewardReq)
      TakeBattlePassRewardReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TakeBattlePassRewardReq.newBuilder() to construct.
    private TakeBattlePassRewardReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TakeBattlePassRewardReq() {
      takeOptionList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TakeBattlePassRewardReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.TakeBattlePassRewardReqOuterClass.internal_static_TakeBattlePassRewardReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.TakeBattlePassRewardReqOuterClass.internal_static_TakeBattlePassRewardReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.TakeBattlePassRewardReqOuterClass.TakeBattlePassRewardReq.class, emu.grasscutter.net.proto.TakeBattlePassRewardReqOuterClass.TakeBattlePassRewardReq.Builder.class);
    }

    public static final int TAKE_OPTION_LIST_FIELD_NUMBER = 14;
    private java.util.List<emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption> takeOptionList_;
    /**
     * <code>repeated .BattlePassRewardTakeOption take_option_list = 14;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption> getTakeOptionListList() {
      return takeOptionList_;
    }
    /**
     * <code>repeated .BattlePassRewardTakeOption take_option_list = 14;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOptionOrBuilder> 
        getTakeOptionListOrBuilderList() {
      return takeOptionList_;
    }
    /**
     * <code>repeated .BattlePassRewardTakeOption take_option_list = 14;</code>
     */
    @java.lang.Override
    public int getTakeOptionListCount() {
      return takeOptionList_.size();
    }
    /**
     * <code>repeated .BattlePassRewardTakeOption take_option_list = 14;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption getTakeOptionList(int index) {
      return takeOptionList_.get(index);
    }
    /**
     * <code>repeated .BattlePassRewardTakeOption take_option_list = 14;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOptionOrBuilder getTakeOptionListOrBuilder(
        int index) {
      return takeOptionList_.get(index);
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
      for (int i = 0; i < takeOptionList_.size(); i++) {
        output.writeMessage(14, takeOptionList_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < takeOptionList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(14, takeOptionList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.TakeBattlePassRewardReqOuterClass.TakeBattlePassRewardReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.TakeBattlePassRewardReqOuterClass.TakeBattlePassRewardReq other = (emu.grasscutter.net.proto.TakeBattlePassRewardReqOuterClass.TakeBattlePassRewardReq) obj;

      if (!getTakeOptionListList()
          .equals(other.getTakeOptionListList())) return false;
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
      if (getTakeOptionListCount() > 0) {
        hash = (37 * hash) + TAKE_OPTION_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getTakeOptionListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.TakeBattlePassRewardReqOuterClass.TakeBattlePassRewardReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TakeBattlePassRewardReqOuterClass.TakeBattlePassRewardReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TakeBattlePassRewardReqOuterClass.TakeBattlePassRewardReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TakeBattlePassRewardReqOuterClass.TakeBattlePassRewardReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TakeBattlePassRewardReqOuterClass.TakeBattlePassRewardReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TakeBattlePassRewardReqOuterClass.TakeBattlePassRewardReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TakeBattlePassRewardReqOuterClass.TakeBattlePassRewardReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TakeBattlePassRewardReqOuterClass.TakeBattlePassRewardReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TakeBattlePassRewardReqOuterClass.TakeBattlePassRewardReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TakeBattlePassRewardReqOuterClass.TakeBattlePassRewardReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TakeBattlePassRewardReqOuterClass.TakeBattlePassRewardReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TakeBattlePassRewardReqOuterClass.TakeBattlePassRewardReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.TakeBattlePassRewardReqOuterClass.TakeBattlePassRewardReq prototype) {
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
     * CmdId: 29828
     * obf: OMMFIGKBKOO
     * </pre>
     *
     * Protobuf type {@code TakeBattlePassRewardReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TakeBattlePassRewardReq)
        emu.grasscutter.net.proto.TakeBattlePassRewardReqOuterClass.TakeBattlePassRewardReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.TakeBattlePassRewardReqOuterClass.internal_static_TakeBattlePassRewardReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.TakeBattlePassRewardReqOuterClass.internal_static_TakeBattlePassRewardReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.TakeBattlePassRewardReqOuterClass.TakeBattlePassRewardReq.class, emu.grasscutter.net.proto.TakeBattlePassRewardReqOuterClass.TakeBattlePassRewardReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.TakeBattlePassRewardReqOuterClass.TakeBattlePassRewardReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (takeOptionListBuilder_ == null) {
          takeOptionList_ = java.util.Collections.emptyList();
        } else {
          takeOptionList_ = null;
          takeOptionListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.TakeBattlePassRewardReqOuterClass.internal_static_TakeBattlePassRewardReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TakeBattlePassRewardReqOuterClass.TakeBattlePassRewardReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.TakeBattlePassRewardReqOuterClass.TakeBattlePassRewardReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TakeBattlePassRewardReqOuterClass.TakeBattlePassRewardReq build() {
        emu.grasscutter.net.proto.TakeBattlePassRewardReqOuterClass.TakeBattlePassRewardReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TakeBattlePassRewardReqOuterClass.TakeBattlePassRewardReq buildPartial() {
        emu.grasscutter.net.proto.TakeBattlePassRewardReqOuterClass.TakeBattlePassRewardReq result = new emu.grasscutter.net.proto.TakeBattlePassRewardReqOuterClass.TakeBattlePassRewardReq(this);
        int from_bitField0_ = bitField0_;
        if (takeOptionListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            takeOptionList_ = java.util.Collections.unmodifiableList(takeOptionList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.takeOptionList_ = takeOptionList_;
        } else {
          result.takeOptionList_ = takeOptionListBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.TakeBattlePassRewardReqOuterClass.TakeBattlePassRewardReq) {
          return mergeFrom((emu.grasscutter.net.proto.TakeBattlePassRewardReqOuterClass.TakeBattlePassRewardReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.TakeBattlePassRewardReqOuterClass.TakeBattlePassRewardReq other) {
        if (other == emu.grasscutter.net.proto.TakeBattlePassRewardReqOuterClass.TakeBattlePassRewardReq.getDefaultInstance()) return this;
        if (takeOptionListBuilder_ == null) {
          if (!other.takeOptionList_.isEmpty()) {
            if (takeOptionList_.isEmpty()) {
              takeOptionList_ = other.takeOptionList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureTakeOptionListIsMutable();
              takeOptionList_.addAll(other.takeOptionList_);
            }
            onChanged();
          }
        } else {
          if (!other.takeOptionList_.isEmpty()) {
            if (takeOptionListBuilder_.isEmpty()) {
              takeOptionListBuilder_.dispose();
              takeOptionListBuilder_ = null;
              takeOptionList_ = other.takeOptionList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              takeOptionListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getTakeOptionListFieldBuilder() : null;
            } else {
              takeOptionListBuilder_.addAllMessages(other.takeOptionList_);
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
              case 114: {
                emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption m =
                    input.readMessage(
                        emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption.parser(),
                        extensionRegistry);
                if (takeOptionListBuilder_ == null) {
                  ensureTakeOptionListIsMutable();
                  takeOptionList_.add(m);
                } else {
                  takeOptionListBuilder_.addMessage(m);
                }
                break;
              } // case 114
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

      private java.util.List<emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption> takeOptionList_ =
        java.util.Collections.emptyList();
      private void ensureTakeOptionListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          takeOptionList_ = new java.util.ArrayList<emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption>(takeOptionList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption, emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption.Builder, emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOptionOrBuilder> takeOptionListBuilder_;

      /**
       * <code>repeated .BattlePassRewardTakeOption take_option_list = 14;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption> getTakeOptionListList() {
        if (takeOptionListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(takeOptionList_);
        } else {
          return takeOptionListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .BattlePassRewardTakeOption take_option_list = 14;</code>
       */
      public int getTakeOptionListCount() {
        if (takeOptionListBuilder_ == null) {
          return takeOptionList_.size();
        } else {
          return takeOptionListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .BattlePassRewardTakeOption take_option_list = 14;</code>
       */
      public emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption getTakeOptionList(int index) {
        if (takeOptionListBuilder_ == null) {
          return takeOptionList_.get(index);
        } else {
          return takeOptionListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .BattlePassRewardTakeOption take_option_list = 14;</code>
       */
      public Builder setTakeOptionList(
          int index, emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption value) {
        if (takeOptionListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTakeOptionListIsMutable();
          takeOptionList_.set(index, value);
          onChanged();
        } else {
          takeOptionListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .BattlePassRewardTakeOption take_option_list = 14;</code>
       */
      public Builder setTakeOptionList(
          int index, emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption.Builder builderForValue) {
        if (takeOptionListBuilder_ == null) {
          ensureTakeOptionListIsMutable();
          takeOptionList_.set(index, builderForValue.build());
          onChanged();
        } else {
          takeOptionListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .BattlePassRewardTakeOption take_option_list = 14;</code>
       */
      public Builder addTakeOptionList(emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption value) {
        if (takeOptionListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTakeOptionListIsMutable();
          takeOptionList_.add(value);
          onChanged();
        } else {
          takeOptionListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .BattlePassRewardTakeOption take_option_list = 14;</code>
       */
      public Builder addTakeOptionList(
          int index, emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption value) {
        if (takeOptionListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTakeOptionListIsMutable();
          takeOptionList_.add(index, value);
          onChanged();
        } else {
          takeOptionListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .BattlePassRewardTakeOption take_option_list = 14;</code>
       */
      public Builder addTakeOptionList(
          emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption.Builder builderForValue) {
        if (takeOptionListBuilder_ == null) {
          ensureTakeOptionListIsMutable();
          takeOptionList_.add(builderForValue.build());
          onChanged();
        } else {
          takeOptionListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .BattlePassRewardTakeOption take_option_list = 14;</code>
       */
      public Builder addTakeOptionList(
          int index, emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption.Builder builderForValue) {
        if (takeOptionListBuilder_ == null) {
          ensureTakeOptionListIsMutable();
          takeOptionList_.add(index, builderForValue.build());
          onChanged();
        } else {
          takeOptionListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .BattlePassRewardTakeOption take_option_list = 14;</code>
       */
      public Builder addAllTakeOptionList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption> values) {
        if (takeOptionListBuilder_ == null) {
          ensureTakeOptionListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, takeOptionList_);
          onChanged();
        } else {
          takeOptionListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .BattlePassRewardTakeOption take_option_list = 14;</code>
       */
      public Builder clearTakeOptionList() {
        if (takeOptionListBuilder_ == null) {
          takeOptionList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          takeOptionListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .BattlePassRewardTakeOption take_option_list = 14;</code>
       */
      public Builder removeTakeOptionList(int index) {
        if (takeOptionListBuilder_ == null) {
          ensureTakeOptionListIsMutable();
          takeOptionList_.remove(index);
          onChanged();
        } else {
          takeOptionListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .BattlePassRewardTakeOption take_option_list = 14;</code>
       */
      public emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption.Builder getTakeOptionListBuilder(
          int index) {
        return getTakeOptionListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .BattlePassRewardTakeOption take_option_list = 14;</code>
       */
      public emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOptionOrBuilder getTakeOptionListOrBuilder(
          int index) {
        if (takeOptionListBuilder_ == null) {
          return takeOptionList_.get(index);  } else {
          return takeOptionListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .BattlePassRewardTakeOption take_option_list = 14;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOptionOrBuilder> 
           getTakeOptionListOrBuilderList() {
        if (takeOptionListBuilder_ != null) {
          return takeOptionListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(takeOptionList_);
        }
      }
      /**
       * <code>repeated .BattlePassRewardTakeOption take_option_list = 14;</code>
       */
      public emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption.Builder addTakeOptionListBuilder() {
        return getTakeOptionListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption.getDefaultInstance());
      }
      /**
       * <code>repeated .BattlePassRewardTakeOption take_option_list = 14;</code>
       */
      public emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption.Builder addTakeOptionListBuilder(
          int index) {
        return getTakeOptionListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption.getDefaultInstance());
      }
      /**
       * <code>repeated .BattlePassRewardTakeOption take_option_list = 14;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption.Builder> 
           getTakeOptionListBuilderList() {
        return getTakeOptionListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption, emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption.Builder, emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOptionOrBuilder> 
          getTakeOptionListFieldBuilder() {
        if (takeOptionListBuilder_ == null) {
          takeOptionListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption, emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption.Builder, emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOptionOrBuilder>(
                  takeOptionList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          takeOptionList_ = null;
        }
        return takeOptionListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:TakeBattlePassRewardReq)
    }

    // @@protoc_insertion_point(class_scope:TakeBattlePassRewardReq)
    private static final emu.grasscutter.net.proto.TakeBattlePassRewardReqOuterClass.TakeBattlePassRewardReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.TakeBattlePassRewardReqOuterClass.TakeBattlePassRewardReq();
    }

    public static emu.grasscutter.net.proto.TakeBattlePassRewardReqOuterClass.TakeBattlePassRewardReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TakeBattlePassRewardReq>
        PARSER = new com.google.protobuf.AbstractParser<TakeBattlePassRewardReq>() {
      @java.lang.Override
      public TakeBattlePassRewardReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<TakeBattlePassRewardReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TakeBattlePassRewardReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.TakeBattlePassRewardReqOuterClass.TakeBattlePassRewardReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TakeBattlePassRewardReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TakeBattlePassRewardReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035TakeBattlePassRewardReq.proto\032 BattleP" +
      "assRewardTakeOption.proto\"P\n\027TakeBattleP" +
      "assRewardReq\0225\n\020take_option_list\030\016 \003(\0132\033" +
      ".BattlePassRewardTakeOptionB\033\n\031emu.grass" +
      "cutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.getDescriptor(),
        });
    internal_static_TakeBattlePassRewardReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TakeBattlePassRewardReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TakeBattlePassRewardReq_descriptor,
        new java.lang.String[] { "TakeOptionList", });
    emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
