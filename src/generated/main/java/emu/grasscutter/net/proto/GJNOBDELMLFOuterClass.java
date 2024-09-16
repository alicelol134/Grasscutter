// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GJNOBDELMLF.proto

package emu.grasscutter.net.proto;

public final class GJNOBDELMLFOuterClass {
  private GJNOBDELMLFOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GJNOBDELMLFOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GJNOBDELMLF)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.MapLayerInfo map_layer_info = 1;</code>
     * @return Whether the mapLayerInfo field is set.
     */
    boolean hasMapLayerInfo();
    /**
     * <code>.MapLayerInfo map_layer_info = 1;</code>
     * @return The mapLayerInfo.
     */
    emu.grasscutter.net.proto.MapLayerInfoOuterClass.MapLayerInfo getMapLayerInfo();
    /**
     * <code>.MapLayerInfo map_layer_info = 1;</code>
     */
    emu.grasscutter.net.proto.MapLayerInfoOuterClass.MapLayerInfoOrBuilder getMapLayerInfoOrBuilder();

    /**
     * <code>repeated uint32 scene_tag_id_list = 9;</code>
     * @return A list containing the sceneTagIdList.
     */
    java.util.List<java.lang.Integer> getSceneTagIdListList();
    /**
     * <code>repeated uint32 scene_tag_id_list = 9;</code>
     * @return The count of sceneTagIdList.
     */
    int getSceneTagIdListCount();
    /**
     * <code>repeated uint32 scene_tag_id_list = 9;</code>
     * @param index The index of the element to return.
     * @return The sceneTagIdList at the given index.
     */
    int getSceneTagIdList(int index);

    /**
     * <code>uint32 KCECJDKPOFB = 12;</code>
     * @return The kCECJDKPOFB.
     */
    int getKCECJDKPOFB();
  }
  /**
   * Protobuf type {@code GJNOBDELMLF}
   */
  public static final class GJNOBDELMLF extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GJNOBDELMLF)
      GJNOBDELMLFOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GJNOBDELMLF.newBuilder() to construct.
    private GJNOBDELMLF(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GJNOBDELMLF() {
      sceneTagIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GJNOBDELMLF();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GJNOBDELMLF(
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
            case 10: {
              emu.grasscutter.net.proto.MapLayerInfoOuterClass.MapLayerInfo.Builder subBuilder = null;
              if (mapLayerInfo_ != null) {
                subBuilder = mapLayerInfo_.toBuilder();
              }
              mapLayerInfo_ = input.readMessage(emu.grasscutter.net.proto.MapLayerInfoOuterClass.MapLayerInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(mapLayerInfo_);
                mapLayerInfo_ = subBuilder.buildPartial();
              }

              break;
            }
            case 72: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                sceneTagIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              sceneTagIdList_.addInt(input.readUInt32());
              break;
            }
            case 74: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                sceneTagIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                sceneTagIdList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 96: {

              kCECJDKPOFB_ = input.readUInt32();
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
          sceneTagIdList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GJNOBDELMLFOuterClass.internal_static_GJNOBDELMLF_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GJNOBDELMLFOuterClass.internal_static_GJNOBDELMLF_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GJNOBDELMLFOuterClass.GJNOBDELMLF.class, emu.grasscutter.net.proto.GJNOBDELMLFOuterClass.GJNOBDELMLF.Builder.class);
    }

    public static final int MAP_LAYER_INFO_FIELD_NUMBER = 1;
    private emu.grasscutter.net.proto.MapLayerInfoOuterClass.MapLayerInfo mapLayerInfo_;
    /**
     * <code>.MapLayerInfo map_layer_info = 1;</code>
     * @return Whether the mapLayerInfo field is set.
     */
    @java.lang.Override
    public boolean hasMapLayerInfo() {
      return mapLayerInfo_ != null;
    }
    /**
     * <code>.MapLayerInfo map_layer_info = 1;</code>
     * @return The mapLayerInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.MapLayerInfoOuterClass.MapLayerInfo getMapLayerInfo() {
      return mapLayerInfo_ == null ? emu.grasscutter.net.proto.MapLayerInfoOuterClass.MapLayerInfo.getDefaultInstance() : mapLayerInfo_;
    }
    /**
     * <code>.MapLayerInfo map_layer_info = 1;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.MapLayerInfoOuterClass.MapLayerInfoOrBuilder getMapLayerInfoOrBuilder() {
      return getMapLayerInfo();
    }

    public static final int SCENE_TAG_ID_LIST_FIELD_NUMBER = 9;
    private com.google.protobuf.Internal.IntList sceneTagIdList_;
    /**
     * <code>repeated uint32 scene_tag_id_list = 9;</code>
     * @return A list containing the sceneTagIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getSceneTagIdListList() {
      return sceneTagIdList_;
    }
    /**
     * <code>repeated uint32 scene_tag_id_list = 9;</code>
     * @return The count of sceneTagIdList.
     */
    public int getSceneTagIdListCount() {
      return sceneTagIdList_.size();
    }
    /**
     * <code>repeated uint32 scene_tag_id_list = 9;</code>
     * @param index The index of the element to return.
     * @return The sceneTagIdList at the given index.
     */
    public int getSceneTagIdList(int index) {
      return sceneTagIdList_.getInt(index);
    }
    private int sceneTagIdListMemoizedSerializedSize = -1;

    public static final int KCECJDKPOFB_FIELD_NUMBER = 12;
    private int kCECJDKPOFB_;
    /**
     * <code>uint32 KCECJDKPOFB = 12;</code>
     * @return The kCECJDKPOFB.
     */
    @java.lang.Override
    public int getKCECJDKPOFB() {
      return kCECJDKPOFB_;
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
      getSerializedSize();
      if (mapLayerInfo_ != null) {
        output.writeMessage(1, getMapLayerInfo());
      }
      if (getSceneTagIdListList().size() > 0) {
        output.writeUInt32NoTag(74);
        output.writeUInt32NoTag(sceneTagIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < sceneTagIdList_.size(); i++) {
        output.writeUInt32NoTag(sceneTagIdList_.getInt(i));
      }
      if (kCECJDKPOFB_ != 0) {
        output.writeUInt32(12, kCECJDKPOFB_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (mapLayerInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getMapLayerInfo());
      }
      {
        int dataSize = 0;
        for (int i = 0; i < sceneTagIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(sceneTagIdList_.getInt(i));
        }
        size += dataSize;
        if (!getSceneTagIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        sceneTagIdListMemoizedSerializedSize = dataSize;
      }
      if (kCECJDKPOFB_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, kCECJDKPOFB_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GJNOBDELMLFOuterClass.GJNOBDELMLF)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GJNOBDELMLFOuterClass.GJNOBDELMLF other = (emu.grasscutter.net.proto.GJNOBDELMLFOuterClass.GJNOBDELMLF) obj;

      if (hasMapLayerInfo() != other.hasMapLayerInfo()) return false;
      if (hasMapLayerInfo()) {
        if (!getMapLayerInfo()
            .equals(other.getMapLayerInfo())) return false;
      }
      if (!getSceneTagIdListList()
          .equals(other.getSceneTagIdListList())) return false;
      if (getKCECJDKPOFB()
          != other.getKCECJDKPOFB()) return false;
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
      if (hasMapLayerInfo()) {
        hash = (37 * hash) + MAP_LAYER_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getMapLayerInfo().hashCode();
      }
      if (getSceneTagIdListCount() > 0) {
        hash = (37 * hash) + SCENE_TAG_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getSceneTagIdListList().hashCode();
      }
      hash = (37 * hash) + KCECJDKPOFB_FIELD_NUMBER;
      hash = (53 * hash) + getKCECJDKPOFB();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GJNOBDELMLFOuterClass.GJNOBDELMLF parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GJNOBDELMLFOuterClass.GJNOBDELMLF parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GJNOBDELMLFOuterClass.GJNOBDELMLF parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GJNOBDELMLFOuterClass.GJNOBDELMLF parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GJNOBDELMLFOuterClass.GJNOBDELMLF parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GJNOBDELMLFOuterClass.GJNOBDELMLF parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GJNOBDELMLFOuterClass.GJNOBDELMLF parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GJNOBDELMLFOuterClass.GJNOBDELMLF parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GJNOBDELMLFOuterClass.GJNOBDELMLF parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GJNOBDELMLFOuterClass.GJNOBDELMLF parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GJNOBDELMLFOuterClass.GJNOBDELMLF parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GJNOBDELMLFOuterClass.GJNOBDELMLF parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GJNOBDELMLFOuterClass.GJNOBDELMLF prototype) {
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
     * Protobuf type {@code GJNOBDELMLF}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GJNOBDELMLF)
        emu.grasscutter.net.proto.GJNOBDELMLFOuterClass.GJNOBDELMLFOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GJNOBDELMLFOuterClass.internal_static_GJNOBDELMLF_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GJNOBDELMLFOuterClass.internal_static_GJNOBDELMLF_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GJNOBDELMLFOuterClass.GJNOBDELMLF.class, emu.grasscutter.net.proto.GJNOBDELMLFOuterClass.GJNOBDELMLF.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GJNOBDELMLFOuterClass.GJNOBDELMLF.newBuilder()
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
        if (mapLayerInfoBuilder_ == null) {
          mapLayerInfo_ = null;
        } else {
          mapLayerInfo_ = null;
          mapLayerInfoBuilder_ = null;
        }
        sceneTagIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        kCECJDKPOFB_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GJNOBDELMLFOuterClass.internal_static_GJNOBDELMLF_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GJNOBDELMLFOuterClass.GJNOBDELMLF getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GJNOBDELMLFOuterClass.GJNOBDELMLF.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GJNOBDELMLFOuterClass.GJNOBDELMLF build() {
        emu.grasscutter.net.proto.GJNOBDELMLFOuterClass.GJNOBDELMLF result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GJNOBDELMLFOuterClass.GJNOBDELMLF buildPartial() {
        emu.grasscutter.net.proto.GJNOBDELMLFOuterClass.GJNOBDELMLF result = new emu.grasscutter.net.proto.GJNOBDELMLFOuterClass.GJNOBDELMLF(this);
        int from_bitField0_ = bitField0_;
        if (mapLayerInfoBuilder_ == null) {
          result.mapLayerInfo_ = mapLayerInfo_;
        } else {
          result.mapLayerInfo_ = mapLayerInfoBuilder_.build();
        }
        if (((bitField0_ & 0x00000001) != 0)) {
          sceneTagIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.sceneTagIdList_ = sceneTagIdList_;
        result.kCECJDKPOFB_ = kCECJDKPOFB_;
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
        if (other instanceof emu.grasscutter.net.proto.GJNOBDELMLFOuterClass.GJNOBDELMLF) {
          return mergeFrom((emu.grasscutter.net.proto.GJNOBDELMLFOuterClass.GJNOBDELMLF)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GJNOBDELMLFOuterClass.GJNOBDELMLF other) {
        if (other == emu.grasscutter.net.proto.GJNOBDELMLFOuterClass.GJNOBDELMLF.getDefaultInstance()) return this;
        if (other.hasMapLayerInfo()) {
          mergeMapLayerInfo(other.getMapLayerInfo());
        }
        if (!other.sceneTagIdList_.isEmpty()) {
          if (sceneTagIdList_.isEmpty()) {
            sceneTagIdList_ = other.sceneTagIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSceneTagIdListIsMutable();
            sceneTagIdList_.addAll(other.sceneTagIdList_);
          }
          onChanged();
        }
        if (other.getKCECJDKPOFB() != 0) {
          setKCECJDKPOFB(other.getKCECJDKPOFB());
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
        emu.grasscutter.net.proto.GJNOBDELMLFOuterClass.GJNOBDELMLF parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GJNOBDELMLFOuterClass.GJNOBDELMLF) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private emu.grasscutter.net.proto.MapLayerInfoOuterClass.MapLayerInfo mapLayerInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.MapLayerInfoOuterClass.MapLayerInfo, emu.grasscutter.net.proto.MapLayerInfoOuterClass.MapLayerInfo.Builder, emu.grasscutter.net.proto.MapLayerInfoOuterClass.MapLayerInfoOrBuilder> mapLayerInfoBuilder_;
      /**
       * <code>.MapLayerInfo map_layer_info = 1;</code>
       * @return Whether the mapLayerInfo field is set.
       */
      public boolean hasMapLayerInfo() {
        return mapLayerInfoBuilder_ != null || mapLayerInfo_ != null;
      }
      /**
       * <code>.MapLayerInfo map_layer_info = 1;</code>
       * @return The mapLayerInfo.
       */
      public emu.grasscutter.net.proto.MapLayerInfoOuterClass.MapLayerInfo getMapLayerInfo() {
        if (mapLayerInfoBuilder_ == null) {
          return mapLayerInfo_ == null ? emu.grasscutter.net.proto.MapLayerInfoOuterClass.MapLayerInfo.getDefaultInstance() : mapLayerInfo_;
        } else {
          return mapLayerInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.MapLayerInfo map_layer_info = 1;</code>
       */
      public Builder setMapLayerInfo(emu.grasscutter.net.proto.MapLayerInfoOuterClass.MapLayerInfo value) {
        if (mapLayerInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          mapLayerInfo_ = value;
          onChanged();
        } else {
          mapLayerInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.MapLayerInfo map_layer_info = 1;</code>
       */
      public Builder setMapLayerInfo(
          emu.grasscutter.net.proto.MapLayerInfoOuterClass.MapLayerInfo.Builder builderForValue) {
        if (mapLayerInfoBuilder_ == null) {
          mapLayerInfo_ = builderForValue.build();
          onChanged();
        } else {
          mapLayerInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.MapLayerInfo map_layer_info = 1;</code>
       */
      public Builder mergeMapLayerInfo(emu.grasscutter.net.proto.MapLayerInfoOuterClass.MapLayerInfo value) {
        if (mapLayerInfoBuilder_ == null) {
          if (mapLayerInfo_ != null) {
            mapLayerInfo_ =
              emu.grasscutter.net.proto.MapLayerInfoOuterClass.MapLayerInfo.newBuilder(mapLayerInfo_).mergeFrom(value).buildPartial();
          } else {
            mapLayerInfo_ = value;
          }
          onChanged();
        } else {
          mapLayerInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.MapLayerInfo map_layer_info = 1;</code>
       */
      public Builder clearMapLayerInfo() {
        if (mapLayerInfoBuilder_ == null) {
          mapLayerInfo_ = null;
          onChanged();
        } else {
          mapLayerInfo_ = null;
          mapLayerInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.MapLayerInfo map_layer_info = 1;</code>
       */
      public emu.grasscutter.net.proto.MapLayerInfoOuterClass.MapLayerInfo.Builder getMapLayerInfoBuilder() {
        
        onChanged();
        return getMapLayerInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.MapLayerInfo map_layer_info = 1;</code>
       */
      public emu.grasscutter.net.proto.MapLayerInfoOuterClass.MapLayerInfoOrBuilder getMapLayerInfoOrBuilder() {
        if (mapLayerInfoBuilder_ != null) {
          return mapLayerInfoBuilder_.getMessageOrBuilder();
        } else {
          return mapLayerInfo_ == null ?
              emu.grasscutter.net.proto.MapLayerInfoOuterClass.MapLayerInfo.getDefaultInstance() : mapLayerInfo_;
        }
      }
      /**
       * <code>.MapLayerInfo map_layer_info = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.MapLayerInfoOuterClass.MapLayerInfo, emu.grasscutter.net.proto.MapLayerInfoOuterClass.MapLayerInfo.Builder, emu.grasscutter.net.proto.MapLayerInfoOuterClass.MapLayerInfoOrBuilder> 
          getMapLayerInfoFieldBuilder() {
        if (mapLayerInfoBuilder_ == null) {
          mapLayerInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.MapLayerInfoOuterClass.MapLayerInfo, emu.grasscutter.net.proto.MapLayerInfoOuterClass.MapLayerInfo.Builder, emu.grasscutter.net.proto.MapLayerInfoOuterClass.MapLayerInfoOrBuilder>(
                  getMapLayerInfo(),
                  getParentForChildren(),
                  isClean());
          mapLayerInfo_ = null;
        }
        return mapLayerInfoBuilder_;
      }

      private com.google.protobuf.Internal.IntList sceneTagIdList_ = emptyIntList();
      private void ensureSceneTagIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          sceneTagIdList_ = mutableCopy(sceneTagIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 scene_tag_id_list = 9;</code>
       * @return A list containing the sceneTagIdList.
       */
      public java.util.List<java.lang.Integer>
          getSceneTagIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(sceneTagIdList_) : sceneTagIdList_;
      }
      /**
       * <code>repeated uint32 scene_tag_id_list = 9;</code>
       * @return The count of sceneTagIdList.
       */
      public int getSceneTagIdListCount() {
        return sceneTagIdList_.size();
      }
      /**
       * <code>repeated uint32 scene_tag_id_list = 9;</code>
       * @param index The index of the element to return.
       * @return The sceneTagIdList at the given index.
       */
      public int getSceneTagIdList(int index) {
        return sceneTagIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 scene_tag_id_list = 9;</code>
       * @param index The index to set the value at.
       * @param value The sceneTagIdList to set.
       * @return This builder for chaining.
       */
      public Builder setSceneTagIdList(
          int index, int value) {
        ensureSceneTagIdListIsMutable();
        sceneTagIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 scene_tag_id_list = 9;</code>
       * @param value The sceneTagIdList to add.
       * @return This builder for chaining.
       */
      public Builder addSceneTagIdList(int value) {
        ensureSceneTagIdListIsMutable();
        sceneTagIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 scene_tag_id_list = 9;</code>
       * @param values The sceneTagIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllSceneTagIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureSceneTagIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, sceneTagIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 scene_tag_id_list = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearSceneTagIdList() {
        sceneTagIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int kCECJDKPOFB_ ;
      /**
       * <code>uint32 KCECJDKPOFB = 12;</code>
       * @return The kCECJDKPOFB.
       */
      @java.lang.Override
      public int getKCECJDKPOFB() {
        return kCECJDKPOFB_;
      }
      /**
       * <code>uint32 KCECJDKPOFB = 12;</code>
       * @param value The kCECJDKPOFB to set.
       * @return This builder for chaining.
       */
      public Builder setKCECJDKPOFB(int value) {
        
        kCECJDKPOFB_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 KCECJDKPOFB = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearKCECJDKPOFB() {
        
        kCECJDKPOFB_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GJNOBDELMLF)
    }

    // @@protoc_insertion_point(class_scope:GJNOBDELMLF)
    private static final emu.grasscutter.net.proto.GJNOBDELMLFOuterClass.GJNOBDELMLF DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GJNOBDELMLFOuterClass.GJNOBDELMLF();
    }

    public static emu.grasscutter.net.proto.GJNOBDELMLFOuterClass.GJNOBDELMLF getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GJNOBDELMLF>
        PARSER = new com.google.protobuf.AbstractParser<GJNOBDELMLF>() {
      @java.lang.Override
      public GJNOBDELMLF parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GJNOBDELMLF(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GJNOBDELMLF> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GJNOBDELMLF> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GJNOBDELMLFOuterClass.GJNOBDELMLF getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GJNOBDELMLF_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GJNOBDELMLF_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021GJNOBDELMLF.proto\032\022MapLayerInfo.proto\"" +
      "d\n\013GJNOBDELMLF\022%\n\016map_layer_info\030\001 \001(\0132\r" +
      ".MapLayerInfo\022\031\n\021scene_tag_id_list\030\t \003(\r" +
      "\022\023\n\013KCECJDKPOFB\030\014 \001(\rB\033\n\031emu.grasscutter" +
      ".net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.MapLayerInfoOuterClass.getDescriptor(),
        });
    internal_static_GJNOBDELMLF_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GJNOBDELMLF_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GJNOBDELMLF_descriptor,
        new java.lang.String[] { "MapLayerInfo", "SceneTagIdList", "KCECJDKPOFB", });
    emu.grasscutter.net.proto.MapLayerInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}