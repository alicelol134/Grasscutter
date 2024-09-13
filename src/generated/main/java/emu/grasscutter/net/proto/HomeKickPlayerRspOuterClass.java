// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeKickPlayerRsp.proto

package emu.grasscutter.net.proto;

public final class HomeKickPlayerRspOuterClass {
  private HomeKickPlayerRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeKickPlayerRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeKickPlayerRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 7;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>bool is_kick_all = 8;</code>
     * @return The isKickAll.
     */
    boolean getIsKickAll();

    /**
     * <code>uint32 target_uid = 12;</code>
     * @return The targetUid.
     */
    int getTargetUid();
  }
  /**
   * <pre>
   * CmdId: 8823
   * </pre>
   *
   * Protobuf type {@code HomeKickPlayerRsp}
   */
  public static final class HomeKickPlayerRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeKickPlayerRsp)
      HomeKickPlayerRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeKickPlayerRsp.newBuilder() to construct.
    private HomeKickPlayerRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeKickPlayerRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeKickPlayerRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.internal_static_HomeKickPlayerRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.internal_static_HomeKickPlayerRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.HomeKickPlayerRsp.class, emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.HomeKickPlayerRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 7;
    private int retcode_;
    /**
     * <code>int32 retcode = 7;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int IS_KICK_ALL_FIELD_NUMBER = 8;
    private boolean isKickAll_;
    /**
     * <code>bool is_kick_all = 8;</code>
     * @return The isKickAll.
     */
    @java.lang.Override
    public boolean getIsKickAll() {
      return isKickAll_;
    }

    public static final int TARGET_UID_FIELD_NUMBER = 12;
    private int targetUid_;
    /**
     * <code>uint32 target_uid = 12;</code>
     * @return The targetUid.
     */
    @java.lang.Override
    public int getTargetUid() {
      return targetUid_;
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
      if (retcode_ != 0) {
        output.writeInt32(7, retcode_);
      }
      if (isKickAll_ != false) {
        output.writeBool(8, isKickAll_);
      }
      if (targetUid_ != 0) {
        output.writeUInt32(12, targetUid_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(7, retcode_);
      }
      if (isKickAll_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(8, isKickAll_);
      }
      if (targetUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, targetUid_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.HomeKickPlayerRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.HomeKickPlayerRsp other = (emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.HomeKickPlayerRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (getIsKickAll()
          != other.getIsKickAll()) return false;
      if (getTargetUid()
          != other.getTargetUid()) return false;
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + IS_KICK_ALL_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsKickAll());
      hash = (37 * hash) + TARGET_UID_FIELD_NUMBER;
      hash = (53 * hash) + getTargetUid();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.HomeKickPlayerRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.HomeKickPlayerRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.HomeKickPlayerRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.HomeKickPlayerRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.HomeKickPlayerRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.HomeKickPlayerRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.HomeKickPlayerRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.HomeKickPlayerRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.HomeKickPlayerRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.HomeKickPlayerRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.HomeKickPlayerRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.HomeKickPlayerRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.HomeKickPlayerRsp prototype) {
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
     * CmdId: 8823
     * </pre>
     *
     * Protobuf type {@code HomeKickPlayerRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeKickPlayerRsp)
        emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.HomeKickPlayerRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.internal_static_HomeKickPlayerRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.internal_static_HomeKickPlayerRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.HomeKickPlayerRsp.class, emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.HomeKickPlayerRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.HomeKickPlayerRsp.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        retcode_ = 0;

        isKickAll_ = false;

        targetUid_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.internal_static_HomeKickPlayerRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.HomeKickPlayerRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.HomeKickPlayerRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.HomeKickPlayerRsp build() {
        emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.HomeKickPlayerRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.HomeKickPlayerRsp buildPartial() {
        emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.HomeKickPlayerRsp result = new emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.HomeKickPlayerRsp(this);
        result.retcode_ = retcode_;
        result.isKickAll_ = isKickAll_;
        result.targetUid_ = targetUid_;
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
        if (other instanceof emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.HomeKickPlayerRsp) {
          return mergeFrom((emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.HomeKickPlayerRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.HomeKickPlayerRsp other) {
        if (other == emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.HomeKickPlayerRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getIsKickAll() != false) {
          setIsKickAll(other.getIsKickAll());
        }
        if (other.getTargetUid() != 0) {
          setTargetUid(other.getTargetUid());
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
              case 56: {
                retcode_ = input.readInt32();

                break;
              } // case 56
              case 64: {
                isKickAll_ = input.readBool();

                break;
              } // case 64
              case 96: {
                targetUid_ = input.readUInt32();

                break;
              } // case 96
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

      private int retcode_ ;
      /**
       * <code>int32 retcode = 7;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 7;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private boolean isKickAll_ ;
      /**
       * <code>bool is_kick_all = 8;</code>
       * @return The isKickAll.
       */
      @java.lang.Override
      public boolean getIsKickAll() {
        return isKickAll_;
      }
      /**
       * <code>bool is_kick_all = 8;</code>
       * @param value The isKickAll to set.
       * @return This builder for chaining.
       */
      public Builder setIsKickAll(boolean value) {
        
        isKickAll_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_kick_all = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsKickAll() {
        
        isKickAll_ = false;
        onChanged();
        return this;
      }

      private int targetUid_ ;
      /**
       * <code>uint32 target_uid = 12;</code>
       * @return The targetUid.
       */
      @java.lang.Override
      public int getTargetUid() {
        return targetUid_;
      }
      /**
       * <code>uint32 target_uid = 12;</code>
       * @param value The targetUid to set.
       * @return This builder for chaining.
       */
      public Builder setTargetUid(int value) {
        
        targetUid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 target_uid = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearTargetUid() {
        
        targetUid_ = 0;
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


      // @@protoc_insertion_point(builder_scope:HomeKickPlayerRsp)
    }

    // @@protoc_insertion_point(class_scope:HomeKickPlayerRsp)
    private static final emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.HomeKickPlayerRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.HomeKickPlayerRsp();
    }

    public static emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.HomeKickPlayerRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeKickPlayerRsp>
        PARSER = new com.google.protobuf.AbstractParser<HomeKickPlayerRsp>() {
      @java.lang.Override
      public HomeKickPlayerRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<HomeKickPlayerRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeKickPlayerRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.HomeKickPlayerRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeKickPlayerRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeKickPlayerRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027HomeKickPlayerRsp.proto\"M\n\021HomeKickPla" +
      "yerRsp\022\017\n\007retcode\030\007 \001(\005\022\023\n\013is_kick_all\030\010" +
      " \001(\010\022\022\n\ntarget_uid\030\014 \001(\rB\033\n\031emu.grasscut" +
      "ter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_HomeKickPlayerRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeKickPlayerRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeKickPlayerRsp_descriptor,
        new java.lang.String[] { "Retcode", "IsKickAll", "TargetUid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
