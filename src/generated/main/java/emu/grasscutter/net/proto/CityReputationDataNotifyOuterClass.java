// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CityReputationDataNotify.proto

package emu.grasscutter.net.proto;

public final class CityReputationDataNotifyOuterClass {
  private CityReputationDataNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CityReputationDataNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CityReputationDataNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .CityReputationSimpleInfo simple_info_list = 13;</code>
     */
    java.util.List<emu.grasscutter.net.proto.CityReputationSimpleInfoOuterClass.CityReputationSimpleInfo> 
        getSimpleInfoListList();
    /**
     * <code>repeated .CityReputationSimpleInfo simple_info_list = 13;</code>
     */
    emu.grasscutter.net.proto.CityReputationSimpleInfoOuterClass.CityReputationSimpleInfo getSimpleInfoList(int index);
    /**
     * <code>repeated .CityReputationSimpleInfo simple_info_list = 13;</code>
     */
    int getSimpleInfoListCount();
    /**
     * <code>repeated .CityReputationSimpleInfo simple_info_list = 13;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.CityReputationSimpleInfoOuterClass.CityReputationSimpleInfoOrBuilder> 
        getSimpleInfoListOrBuilderList();
    /**
     * <code>repeated .CityReputationSimpleInfo simple_info_list = 13;</code>
     */
    emu.grasscutter.net.proto.CityReputationSimpleInfoOuterClass.CityReputationSimpleInfoOrBuilder getSimpleInfoListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * CmdId: 27618
   * </pre>
   *
   * Protobuf type {@code CityReputationDataNotify}
   */
  public static final class CityReputationDataNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CityReputationDataNotify)
      CityReputationDataNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CityReputationDataNotify.newBuilder() to construct.
    private CityReputationDataNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CityReputationDataNotify() {
      simpleInfoList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CityReputationDataNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.CityReputationDataNotifyOuterClass.internal_static_CityReputationDataNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.CityReputationDataNotifyOuterClass.internal_static_CityReputationDataNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.CityReputationDataNotifyOuterClass.CityReputationDataNotify.class, emu.grasscutter.net.proto.CityReputationDataNotifyOuterClass.CityReputationDataNotify.Builder.class);
    }

    public static final int SIMPLE_INFO_LIST_FIELD_NUMBER = 13;
    private java.util.List<emu.grasscutter.net.proto.CityReputationSimpleInfoOuterClass.CityReputationSimpleInfo> simpleInfoList_;
    /**
     * <code>repeated .CityReputationSimpleInfo simple_info_list = 13;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.CityReputationSimpleInfoOuterClass.CityReputationSimpleInfo> getSimpleInfoListList() {
      return simpleInfoList_;
    }
    /**
     * <code>repeated .CityReputationSimpleInfo simple_info_list = 13;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.CityReputationSimpleInfoOuterClass.CityReputationSimpleInfoOrBuilder> 
        getSimpleInfoListOrBuilderList() {
      return simpleInfoList_;
    }
    /**
     * <code>repeated .CityReputationSimpleInfo simple_info_list = 13;</code>
     */
    @java.lang.Override
    public int getSimpleInfoListCount() {
      return simpleInfoList_.size();
    }
    /**
     * <code>repeated .CityReputationSimpleInfo simple_info_list = 13;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.CityReputationSimpleInfoOuterClass.CityReputationSimpleInfo getSimpleInfoList(int index) {
      return simpleInfoList_.get(index);
    }
    /**
     * <code>repeated .CityReputationSimpleInfo simple_info_list = 13;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.CityReputationSimpleInfoOuterClass.CityReputationSimpleInfoOrBuilder getSimpleInfoListOrBuilder(
        int index) {
      return simpleInfoList_.get(index);
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
      for (int i = 0; i < simpleInfoList_.size(); i++) {
        output.writeMessage(13, simpleInfoList_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < simpleInfoList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(13, simpleInfoList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.CityReputationDataNotifyOuterClass.CityReputationDataNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.CityReputationDataNotifyOuterClass.CityReputationDataNotify other = (emu.grasscutter.net.proto.CityReputationDataNotifyOuterClass.CityReputationDataNotify) obj;

      if (!getSimpleInfoListList()
          .equals(other.getSimpleInfoListList())) return false;
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
      if (getSimpleInfoListCount() > 0) {
        hash = (37 * hash) + SIMPLE_INFO_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getSimpleInfoListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.CityReputationDataNotifyOuterClass.CityReputationDataNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CityReputationDataNotifyOuterClass.CityReputationDataNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CityReputationDataNotifyOuterClass.CityReputationDataNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CityReputationDataNotifyOuterClass.CityReputationDataNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CityReputationDataNotifyOuterClass.CityReputationDataNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CityReputationDataNotifyOuterClass.CityReputationDataNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CityReputationDataNotifyOuterClass.CityReputationDataNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CityReputationDataNotifyOuterClass.CityReputationDataNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CityReputationDataNotifyOuterClass.CityReputationDataNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CityReputationDataNotifyOuterClass.CityReputationDataNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CityReputationDataNotifyOuterClass.CityReputationDataNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CityReputationDataNotifyOuterClass.CityReputationDataNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.CityReputationDataNotifyOuterClass.CityReputationDataNotify prototype) {
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
     * CmdId: 27618
     * </pre>
     *
     * Protobuf type {@code CityReputationDataNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CityReputationDataNotify)
        emu.grasscutter.net.proto.CityReputationDataNotifyOuterClass.CityReputationDataNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.CityReputationDataNotifyOuterClass.internal_static_CityReputationDataNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.CityReputationDataNotifyOuterClass.internal_static_CityReputationDataNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.CityReputationDataNotifyOuterClass.CityReputationDataNotify.class, emu.grasscutter.net.proto.CityReputationDataNotifyOuterClass.CityReputationDataNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.CityReputationDataNotifyOuterClass.CityReputationDataNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (simpleInfoListBuilder_ == null) {
          simpleInfoList_ = java.util.Collections.emptyList();
        } else {
          simpleInfoList_ = null;
          simpleInfoListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.CityReputationDataNotifyOuterClass.internal_static_CityReputationDataNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CityReputationDataNotifyOuterClass.CityReputationDataNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.CityReputationDataNotifyOuterClass.CityReputationDataNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CityReputationDataNotifyOuterClass.CityReputationDataNotify build() {
        emu.grasscutter.net.proto.CityReputationDataNotifyOuterClass.CityReputationDataNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CityReputationDataNotifyOuterClass.CityReputationDataNotify buildPartial() {
        emu.grasscutter.net.proto.CityReputationDataNotifyOuterClass.CityReputationDataNotify result = new emu.grasscutter.net.proto.CityReputationDataNotifyOuterClass.CityReputationDataNotify(this);
        int from_bitField0_ = bitField0_;
        if (simpleInfoListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            simpleInfoList_ = java.util.Collections.unmodifiableList(simpleInfoList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.simpleInfoList_ = simpleInfoList_;
        } else {
          result.simpleInfoList_ = simpleInfoListBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.CityReputationDataNotifyOuterClass.CityReputationDataNotify) {
          return mergeFrom((emu.grasscutter.net.proto.CityReputationDataNotifyOuterClass.CityReputationDataNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.CityReputationDataNotifyOuterClass.CityReputationDataNotify other) {
        if (other == emu.grasscutter.net.proto.CityReputationDataNotifyOuterClass.CityReputationDataNotify.getDefaultInstance()) return this;
        if (simpleInfoListBuilder_ == null) {
          if (!other.simpleInfoList_.isEmpty()) {
            if (simpleInfoList_.isEmpty()) {
              simpleInfoList_ = other.simpleInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureSimpleInfoListIsMutable();
              simpleInfoList_.addAll(other.simpleInfoList_);
            }
            onChanged();
          }
        } else {
          if (!other.simpleInfoList_.isEmpty()) {
            if (simpleInfoListBuilder_.isEmpty()) {
              simpleInfoListBuilder_.dispose();
              simpleInfoListBuilder_ = null;
              simpleInfoList_ = other.simpleInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              simpleInfoListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getSimpleInfoListFieldBuilder() : null;
            } else {
              simpleInfoListBuilder_.addAllMessages(other.simpleInfoList_);
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
              case 106: {
                emu.grasscutter.net.proto.CityReputationSimpleInfoOuterClass.CityReputationSimpleInfo m =
                    input.readMessage(
                        emu.grasscutter.net.proto.CityReputationSimpleInfoOuterClass.CityReputationSimpleInfo.parser(),
                        extensionRegistry);
                if (simpleInfoListBuilder_ == null) {
                  ensureSimpleInfoListIsMutable();
                  simpleInfoList_.add(m);
                } else {
                  simpleInfoListBuilder_.addMessage(m);
                }
                break;
              } // case 106
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

      private java.util.List<emu.grasscutter.net.proto.CityReputationSimpleInfoOuterClass.CityReputationSimpleInfo> simpleInfoList_ =
        java.util.Collections.emptyList();
      private void ensureSimpleInfoListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          simpleInfoList_ = new java.util.ArrayList<emu.grasscutter.net.proto.CityReputationSimpleInfoOuterClass.CityReputationSimpleInfo>(simpleInfoList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.CityReputationSimpleInfoOuterClass.CityReputationSimpleInfo, emu.grasscutter.net.proto.CityReputationSimpleInfoOuterClass.CityReputationSimpleInfo.Builder, emu.grasscutter.net.proto.CityReputationSimpleInfoOuterClass.CityReputationSimpleInfoOrBuilder> simpleInfoListBuilder_;

      /**
       * <code>repeated .CityReputationSimpleInfo simple_info_list = 13;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.CityReputationSimpleInfoOuterClass.CityReputationSimpleInfo> getSimpleInfoListList() {
        if (simpleInfoListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(simpleInfoList_);
        } else {
          return simpleInfoListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .CityReputationSimpleInfo simple_info_list = 13;</code>
       */
      public int getSimpleInfoListCount() {
        if (simpleInfoListBuilder_ == null) {
          return simpleInfoList_.size();
        } else {
          return simpleInfoListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .CityReputationSimpleInfo simple_info_list = 13;</code>
       */
      public emu.grasscutter.net.proto.CityReputationSimpleInfoOuterClass.CityReputationSimpleInfo getSimpleInfoList(int index) {
        if (simpleInfoListBuilder_ == null) {
          return simpleInfoList_.get(index);
        } else {
          return simpleInfoListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .CityReputationSimpleInfo simple_info_list = 13;</code>
       */
      public Builder setSimpleInfoList(
          int index, emu.grasscutter.net.proto.CityReputationSimpleInfoOuterClass.CityReputationSimpleInfo value) {
        if (simpleInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSimpleInfoListIsMutable();
          simpleInfoList_.set(index, value);
          onChanged();
        } else {
          simpleInfoListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .CityReputationSimpleInfo simple_info_list = 13;</code>
       */
      public Builder setSimpleInfoList(
          int index, emu.grasscutter.net.proto.CityReputationSimpleInfoOuterClass.CityReputationSimpleInfo.Builder builderForValue) {
        if (simpleInfoListBuilder_ == null) {
          ensureSimpleInfoListIsMutable();
          simpleInfoList_.set(index, builderForValue.build());
          onChanged();
        } else {
          simpleInfoListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .CityReputationSimpleInfo simple_info_list = 13;</code>
       */
      public Builder addSimpleInfoList(emu.grasscutter.net.proto.CityReputationSimpleInfoOuterClass.CityReputationSimpleInfo value) {
        if (simpleInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSimpleInfoListIsMutable();
          simpleInfoList_.add(value);
          onChanged();
        } else {
          simpleInfoListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .CityReputationSimpleInfo simple_info_list = 13;</code>
       */
      public Builder addSimpleInfoList(
          int index, emu.grasscutter.net.proto.CityReputationSimpleInfoOuterClass.CityReputationSimpleInfo value) {
        if (simpleInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSimpleInfoListIsMutable();
          simpleInfoList_.add(index, value);
          onChanged();
        } else {
          simpleInfoListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .CityReputationSimpleInfo simple_info_list = 13;</code>
       */
      public Builder addSimpleInfoList(
          emu.grasscutter.net.proto.CityReputationSimpleInfoOuterClass.CityReputationSimpleInfo.Builder builderForValue) {
        if (simpleInfoListBuilder_ == null) {
          ensureSimpleInfoListIsMutable();
          simpleInfoList_.add(builderForValue.build());
          onChanged();
        } else {
          simpleInfoListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .CityReputationSimpleInfo simple_info_list = 13;</code>
       */
      public Builder addSimpleInfoList(
          int index, emu.grasscutter.net.proto.CityReputationSimpleInfoOuterClass.CityReputationSimpleInfo.Builder builderForValue) {
        if (simpleInfoListBuilder_ == null) {
          ensureSimpleInfoListIsMutable();
          simpleInfoList_.add(index, builderForValue.build());
          onChanged();
        } else {
          simpleInfoListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .CityReputationSimpleInfo simple_info_list = 13;</code>
       */
      public Builder addAllSimpleInfoList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.CityReputationSimpleInfoOuterClass.CityReputationSimpleInfo> values) {
        if (simpleInfoListBuilder_ == null) {
          ensureSimpleInfoListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, simpleInfoList_);
          onChanged();
        } else {
          simpleInfoListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .CityReputationSimpleInfo simple_info_list = 13;</code>
       */
      public Builder clearSimpleInfoList() {
        if (simpleInfoListBuilder_ == null) {
          simpleInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          simpleInfoListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .CityReputationSimpleInfo simple_info_list = 13;</code>
       */
      public Builder removeSimpleInfoList(int index) {
        if (simpleInfoListBuilder_ == null) {
          ensureSimpleInfoListIsMutable();
          simpleInfoList_.remove(index);
          onChanged();
        } else {
          simpleInfoListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .CityReputationSimpleInfo simple_info_list = 13;</code>
       */
      public emu.grasscutter.net.proto.CityReputationSimpleInfoOuterClass.CityReputationSimpleInfo.Builder getSimpleInfoListBuilder(
          int index) {
        return getSimpleInfoListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .CityReputationSimpleInfo simple_info_list = 13;</code>
       */
      public emu.grasscutter.net.proto.CityReputationSimpleInfoOuterClass.CityReputationSimpleInfoOrBuilder getSimpleInfoListOrBuilder(
          int index) {
        if (simpleInfoListBuilder_ == null) {
          return simpleInfoList_.get(index);  } else {
          return simpleInfoListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .CityReputationSimpleInfo simple_info_list = 13;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.CityReputationSimpleInfoOuterClass.CityReputationSimpleInfoOrBuilder> 
           getSimpleInfoListOrBuilderList() {
        if (simpleInfoListBuilder_ != null) {
          return simpleInfoListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(simpleInfoList_);
        }
      }
      /**
       * <code>repeated .CityReputationSimpleInfo simple_info_list = 13;</code>
       */
      public emu.grasscutter.net.proto.CityReputationSimpleInfoOuterClass.CityReputationSimpleInfo.Builder addSimpleInfoListBuilder() {
        return getSimpleInfoListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.CityReputationSimpleInfoOuterClass.CityReputationSimpleInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .CityReputationSimpleInfo simple_info_list = 13;</code>
       */
      public emu.grasscutter.net.proto.CityReputationSimpleInfoOuterClass.CityReputationSimpleInfo.Builder addSimpleInfoListBuilder(
          int index) {
        return getSimpleInfoListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.CityReputationSimpleInfoOuterClass.CityReputationSimpleInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .CityReputationSimpleInfo simple_info_list = 13;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.CityReputationSimpleInfoOuterClass.CityReputationSimpleInfo.Builder> 
           getSimpleInfoListBuilderList() {
        return getSimpleInfoListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.CityReputationSimpleInfoOuterClass.CityReputationSimpleInfo, emu.grasscutter.net.proto.CityReputationSimpleInfoOuterClass.CityReputationSimpleInfo.Builder, emu.grasscutter.net.proto.CityReputationSimpleInfoOuterClass.CityReputationSimpleInfoOrBuilder> 
          getSimpleInfoListFieldBuilder() {
        if (simpleInfoListBuilder_ == null) {
          simpleInfoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.CityReputationSimpleInfoOuterClass.CityReputationSimpleInfo, emu.grasscutter.net.proto.CityReputationSimpleInfoOuterClass.CityReputationSimpleInfo.Builder, emu.grasscutter.net.proto.CityReputationSimpleInfoOuterClass.CityReputationSimpleInfoOrBuilder>(
                  simpleInfoList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          simpleInfoList_ = null;
        }
        return simpleInfoListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:CityReputationDataNotify)
    }

    // @@protoc_insertion_point(class_scope:CityReputationDataNotify)
    private static final emu.grasscutter.net.proto.CityReputationDataNotifyOuterClass.CityReputationDataNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.CityReputationDataNotifyOuterClass.CityReputationDataNotify();
    }

    public static emu.grasscutter.net.proto.CityReputationDataNotifyOuterClass.CityReputationDataNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CityReputationDataNotify>
        PARSER = new com.google.protobuf.AbstractParser<CityReputationDataNotify>() {
      @java.lang.Override
      public CityReputationDataNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<CityReputationDataNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CityReputationDataNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.CityReputationDataNotifyOuterClass.CityReputationDataNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CityReputationDataNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CityReputationDataNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036CityReputationDataNotify.proto\032\036CityRe" +
      "putationSimpleInfo.proto\"O\n\030CityReputati" +
      "onDataNotify\0223\n\020simple_info_list\030\r \003(\0132\031" +
      ".CityReputationSimpleInfoB\033\n\031emu.grasscu" +
      "tter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.CityReputationSimpleInfoOuterClass.getDescriptor(),
        });
    internal_static_CityReputationDataNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CityReputationDataNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CityReputationDataNotify_descriptor,
        new java.lang.String[] { "SimpleInfoList", });
    emu.grasscutter.net.proto.CityReputationSimpleInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
