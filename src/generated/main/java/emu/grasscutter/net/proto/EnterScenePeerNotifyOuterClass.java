// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EnterScenePeerNotify.proto

package emu.grasscutter.net.proto;

public final class EnterScenePeerNotifyOuterClass {
  private EnterScenePeerNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EnterScenePeerNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EnterScenePeerNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 dest_scene_id = 1;</code>
     * @return The destSceneId.
     */
    int getDestSceneId();

    /**
     * <code>uint32 enter_scene_token = 9;</code>
     * @return The enterSceneToken.
     */
    int getEnterSceneToken();

    /**
     * <pre>
     *11 or 3
     * </pre>
     *
     * <code>uint32 peer_id = 11;</code>
     * @return The peerId.
     */
    int getPeerId();

    /**
     * <pre>
     *11 or 3
     * </pre>
     *
     * <code>uint32 host_peer_id = 3;</code>
     * @return The hostPeerId.
     */
    int getHostPeerId();
  }
  /**
   * <pre>
   * 4.6.0
   * CmdId: 20243
   * </pre>
   *
   * Protobuf type {@code EnterScenePeerNotify}
   */
  public static final class EnterScenePeerNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EnterScenePeerNotify)
      EnterScenePeerNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EnterScenePeerNotify.newBuilder() to construct.
    private EnterScenePeerNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EnterScenePeerNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EnterScenePeerNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EnterScenePeerNotify(
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
            case 8: {

              destSceneId_ = input.readUInt32();
              break;
            }
            case 24: {

              hostPeerId_ = input.readUInt32();
              break;
            }
            case 72: {

              enterSceneToken_ = input.readUInt32();
              break;
            }
            case 88: {

              peerId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.internal_static_EnterScenePeerNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.internal_static_EnterScenePeerNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.EnterScenePeerNotify.class, emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.EnterScenePeerNotify.Builder.class);
    }

    public static final int DEST_SCENE_ID_FIELD_NUMBER = 1;
    private int destSceneId_;
    /**
     * <code>uint32 dest_scene_id = 1;</code>
     * @return The destSceneId.
     */
    @java.lang.Override
    public int getDestSceneId() {
      return destSceneId_;
    }

    public static final int ENTER_SCENE_TOKEN_FIELD_NUMBER = 9;
    private int enterSceneToken_;
    /**
     * <code>uint32 enter_scene_token = 9;</code>
     * @return The enterSceneToken.
     */
    @java.lang.Override
    public int getEnterSceneToken() {
      return enterSceneToken_;
    }

    public static final int PEER_ID_FIELD_NUMBER = 11;
    private int peerId_;
    /**
     * <pre>
     *11 or 3
     * </pre>
     *
     * <code>uint32 peer_id = 11;</code>
     * @return The peerId.
     */
    @java.lang.Override
    public int getPeerId() {
      return peerId_;
    }

    public static final int HOST_PEER_ID_FIELD_NUMBER = 3;
    private int hostPeerId_;
    /**
     * <pre>
     *11 or 3
     * </pre>
     *
     * <code>uint32 host_peer_id = 3;</code>
     * @return The hostPeerId.
     */
    @java.lang.Override
    public int getHostPeerId() {
      return hostPeerId_;
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
      if (destSceneId_ != 0) {
        output.writeUInt32(1, destSceneId_);
      }
      if (hostPeerId_ != 0) {
        output.writeUInt32(3, hostPeerId_);
      }
      if (enterSceneToken_ != 0) {
        output.writeUInt32(9, enterSceneToken_);
      }
      if (peerId_ != 0) {
        output.writeUInt32(11, peerId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (destSceneId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, destSceneId_);
      }
      if (hostPeerId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, hostPeerId_);
      }
      if (enterSceneToken_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, enterSceneToken_);
      }
      if (peerId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, peerId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.EnterScenePeerNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.EnterScenePeerNotify other = (emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.EnterScenePeerNotify) obj;

      if (getDestSceneId()
          != other.getDestSceneId()) return false;
      if (getEnterSceneToken()
          != other.getEnterSceneToken()) return false;
      if (getPeerId()
          != other.getPeerId()) return false;
      if (getHostPeerId()
          != other.getHostPeerId()) return false;
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
      hash = (37 * hash) + DEST_SCENE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getDestSceneId();
      hash = (37 * hash) + ENTER_SCENE_TOKEN_FIELD_NUMBER;
      hash = (53 * hash) + getEnterSceneToken();
      hash = (37 * hash) + PEER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getPeerId();
      hash = (37 * hash) + HOST_PEER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getHostPeerId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.EnterScenePeerNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.EnterScenePeerNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.EnterScenePeerNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.EnterScenePeerNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.EnterScenePeerNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.EnterScenePeerNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.EnterScenePeerNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.EnterScenePeerNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.EnterScenePeerNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.EnterScenePeerNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.EnterScenePeerNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.EnterScenePeerNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.EnterScenePeerNotify prototype) {
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
     * CmdId: 20243
     * </pre>
     *
     * Protobuf type {@code EnterScenePeerNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EnterScenePeerNotify)
        emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.EnterScenePeerNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.internal_static_EnterScenePeerNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.internal_static_EnterScenePeerNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.EnterScenePeerNotify.class, emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.EnterScenePeerNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.EnterScenePeerNotify.newBuilder()
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
        destSceneId_ = 0;

        enterSceneToken_ = 0;

        peerId_ = 0;

        hostPeerId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.internal_static_EnterScenePeerNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.EnterScenePeerNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.EnterScenePeerNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.EnterScenePeerNotify build() {
        emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.EnterScenePeerNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.EnterScenePeerNotify buildPartial() {
        emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.EnterScenePeerNotify result = new emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.EnterScenePeerNotify(this);
        result.destSceneId_ = destSceneId_;
        result.enterSceneToken_ = enterSceneToken_;
        result.peerId_ = peerId_;
        result.hostPeerId_ = hostPeerId_;
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
        if (other instanceof emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.EnterScenePeerNotify) {
          return mergeFrom((emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.EnterScenePeerNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.EnterScenePeerNotify other) {
        if (other == emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.EnterScenePeerNotify.getDefaultInstance()) return this;
        if (other.getDestSceneId() != 0) {
          setDestSceneId(other.getDestSceneId());
        }
        if (other.getEnterSceneToken() != 0) {
          setEnterSceneToken(other.getEnterSceneToken());
        }
        if (other.getPeerId() != 0) {
          setPeerId(other.getPeerId());
        }
        if (other.getHostPeerId() != 0) {
          setHostPeerId(other.getHostPeerId());
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
        emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.EnterScenePeerNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.EnterScenePeerNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int destSceneId_ ;
      /**
       * <code>uint32 dest_scene_id = 1;</code>
       * @return The destSceneId.
       */
      @java.lang.Override
      public int getDestSceneId() {
        return destSceneId_;
      }
      /**
       * <code>uint32 dest_scene_id = 1;</code>
       * @param value The destSceneId to set.
       * @return This builder for chaining.
       */
      public Builder setDestSceneId(int value) {
        
        destSceneId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 dest_scene_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearDestSceneId() {
        
        destSceneId_ = 0;
        onChanged();
        return this;
      }

      private int enterSceneToken_ ;
      /**
       * <code>uint32 enter_scene_token = 9;</code>
       * @return The enterSceneToken.
       */
      @java.lang.Override
      public int getEnterSceneToken() {
        return enterSceneToken_;
      }
      /**
       * <code>uint32 enter_scene_token = 9;</code>
       * @param value The enterSceneToken to set.
       * @return This builder for chaining.
       */
      public Builder setEnterSceneToken(int value) {
        
        enterSceneToken_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 enter_scene_token = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearEnterSceneToken() {
        
        enterSceneToken_ = 0;
        onChanged();
        return this;
      }

      private int peerId_ ;
      /**
       * <pre>
       *11 or 3
       * </pre>
       *
       * <code>uint32 peer_id = 11;</code>
       * @return The peerId.
       */
      @java.lang.Override
      public int getPeerId() {
        return peerId_;
      }
      /**
       * <pre>
       *11 or 3
       * </pre>
       *
       * <code>uint32 peer_id = 11;</code>
       * @param value The peerId to set.
       * @return This builder for chaining.
       */
      public Builder setPeerId(int value) {
        
        peerId_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *11 or 3
       * </pre>
       *
       * <code>uint32 peer_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearPeerId() {
        
        peerId_ = 0;
        onChanged();
        return this;
      }

      private int hostPeerId_ ;
      /**
       * <pre>
       *11 or 3
       * </pre>
       *
       * <code>uint32 host_peer_id = 3;</code>
       * @return The hostPeerId.
       */
      @java.lang.Override
      public int getHostPeerId() {
        return hostPeerId_;
      }
      /**
       * <pre>
       *11 or 3
       * </pre>
       *
       * <code>uint32 host_peer_id = 3;</code>
       * @param value The hostPeerId to set.
       * @return This builder for chaining.
       */
      public Builder setHostPeerId(int value) {
        
        hostPeerId_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *11 or 3
       * </pre>
       *
       * <code>uint32 host_peer_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearHostPeerId() {
        
        hostPeerId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:EnterScenePeerNotify)
    }

    // @@protoc_insertion_point(class_scope:EnterScenePeerNotify)
    private static final emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.EnterScenePeerNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.EnterScenePeerNotify();
    }

    public static emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.EnterScenePeerNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EnterScenePeerNotify>
        PARSER = new com.google.protobuf.AbstractParser<EnterScenePeerNotify>() {
      @java.lang.Override
      public EnterScenePeerNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EnterScenePeerNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<EnterScenePeerNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EnterScenePeerNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.EnterScenePeerNotifyOuterClass.EnterScenePeerNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EnterScenePeerNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EnterScenePeerNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032EnterScenePeerNotify.proto\"o\n\024EnterSce" +
      "nePeerNotify\022\025\n\rdest_scene_id\030\001 \001(\r\022\031\n\021e" +
      "nter_scene_token\030\t \001(\r\022\017\n\007peer_id\030\013 \001(\r\022" +
      "\024\n\014host_peer_id\030\003 \001(\rB\033\n\031emu.grasscutter" +
      ".net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_EnterScenePeerNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EnterScenePeerNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EnterScenePeerNotify_descriptor,
        new java.lang.String[] { "DestSceneId", "EnterSceneToken", "PeerId", "HostPeerId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
