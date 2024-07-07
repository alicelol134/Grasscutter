// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RogueDiaryProgress.proto

package emu.grasscutter.net.proto;

public final class RogueDiaryProgressOuterClass {
  private RogueDiaryProgressOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RogueDiaryProgressOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RogueDiaryProgress)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 optional_card_list = 5;</code>
     * @return A list containing the optionalCardList.
     */
    java.util.List<java.lang.Integer> getOptionalCardListList();
    /**
     * <code>repeated uint32 optional_card_list = 5;</code>
     * @return The count of optionalCardList.
     */
    int getOptionalCardListCount();
    /**
     * <code>repeated uint32 optional_card_list = 5;</code>
     * @param index The index of the element to return.
     * @return The optionalCardList at the given index.
     */
    int getOptionalCardList(int index);

    /**
     * <code>uint32 cur_round = 1;</code>
     * @return The curRound.
     */
    int getCurRound();

    /**
     * <code>uint32 stage_id = 3;</code>
     * @return The stageId.
     */
    int getStageId();

    /**
     * <code>bool is_enter_dungeon = 7;</code>
     * @return The isEnterDungeon.
     */
    boolean getIsEnterDungeon();

    /**
     * <code>uint32 difficulty = 2;</code>
     * @return The difficulty.
     */
    int getDifficulty();
  }
  /**
   * <pre>
   * Obf: FKDCFIEKHGM
   * </pre>
   *
   * Protobuf type {@code RogueDiaryProgress}
   */
  public static final class RogueDiaryProgress extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:RogueDiaryProgress)
      RogueDiaryProgressOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RogueDiaryProgress.newBuilder() to construct.
    private RogueDiaryProgress(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RogueDiaryProgress() {
      optionalCardList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new RogueDiaryProgress();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RogueDiaryProgress(
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
            case 8: {

              curRound_ = input.readUInt32();
              break;
            }
            case 16: {

              difficulty_ = input.readUInt32();
              break;
            }
            case 24: {

              stageId_ = input.readUInt32();
              break;
            }
            case 40: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                optionalCardList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              optionalCardList_.addInt(input.readUInt32());
              break;
            }
            case 42: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                optionalCardList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                optionalCardList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 56: {

              isEnterDungeon_ = input.readBool();
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
          optionalCardList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.RogueDiaryProgressOuterClass.internal_static_RogueDiaryProgress_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.RogueDiaryProgressOuterClass.internal_static_RogueDiaryProgress_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.RogueDiaryProgressOuterClass.RogueDiaryProgress.class, emu.grasscutter.net.proto.RogueDiaryProgressOuterClass.RogueDiaryProgress.Builder.class);
    }

    public static final int OPTIONAL_CARD_LIST_FIELD_NUMBER = 5;
    private com.google.protobuf.Internal.IntList optionalCardList_;
    /**
     * <code>repeated uint32 optional_card_list = 5;</code>
     * @return A list containing the optionalCardList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getOptionalCardListList() {
      return optionalCardList_;
    }
    /**
     * <code>repeated uint32 optional_card_list = 5;</code>
     * @return The count of optionalCardList.
     */
    public int getOptionalCardListCount() {
      return optionalCardList_.size();
    }
    /**
     * <code>repeated uint32 optional_card_list = 5;</code>
     * @param index The index of the element to return.
     * @return The optionalCardList at the given index.
     */
    public int getOptionalCardList(int index) {
      return optionalCardList_.getInt(index);
    }
    private int optionalCardListMemoizedSerializedSize = -1;

    public static final int CUR_ROUND_FIELD_NUMBER = 1;
    private int curRound_;
    /**
     * <code>uint32 cur_round = 1;</code>
     * @return The curRound.
     */
    @java.lang.Override
    public int getCurRound() {
      return curRound_;
    }

    public static final int STAGE_ID_FIELD_NUMBER = 3;
    private int stageId_;
    /**
     * <code>uint32 stage_id = 3;</code>
     * @return The stageId.
     */
    @java.lang.Override
    public int getStageId() {
      return stageId_;
    }

    public static final int IS_ENTER_DUNGEON_FIELD_NUMBER = 7;
    private boolean isEnterDungeon_;
    /**
     * <code>bool is_enter_dungeon = 7;</code>
     * @return The isEnterDungeon.
     */
    @java.lang.Override
    public boolean getIsEnterDungeon() {
      return isEnterDungeon_;
    }

    public static final int DIFFICULTY_FIELD_NUMBER = 2;
    private int difficulty_;
    /**
     * <code>uint32 difficulty = 2;</code>
     * @return The difficulty.
     */
    @java.lang.Override
    public int getDifficulty() {
      return difficulty_;
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
      if (curRound_ != 0) {
        output.writeUInt32(1, curRound_);
      }
      if (difficulty_ != 0) {
        output.writeUInt32(2, difficulty_);
      }
      if (stageId_ != 0) {
        output.writeUInt32(3, stageId_);
      }
      if (getOptionalCardListList().size() > 0) {
        output.writeUInt32NoTag(42);
        output.writeUInt32NoTag(optionalCardListMemoizedSerializedSize);
      }
      for (int i = 0; i < optionalCardList_.size(); i++) {
        output.writeUInt32NoTag(optionalCardList_.getInt(i));
      }
      if (isEnterDungeon_ != false) {
        output.writeBool(7, isEnterDungeon_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (curRound_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, curRound_);
      }
      if (difficulty_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, difficulty_);
      }
      if (stageId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, stageId_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < optionalCardList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(optionalCardList_.getInt(i));
        }
        size += dataSize;
        if (!getOptionalCardListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        optionalCardListMemoizedSerializedSize = dataSize;
      }
      if (isEnterDungeon_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(7, isEnterDungeon_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.RogueDiaryProgressOuterClass.RogueDiaryProgress)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.RogueDiaryProgressOuterClass.RogueDiaryProgress other = (emu.grasscutter.net.proto.RogueDiaryProgressOuterClass.RogueDiaryProgress) obj;

      if (!getOptionalCardListList()
          .equals(other.getOptionalCardListList())) return false;
      if (getCurRound()
          != other.getCurRound()) return false;
      if (getStageId()
          != other.getStageId()) return false;
      if (getIsEnterDungeon()
          != other.getIsEnterDungeon()) return false;
      if (getDifficulty()
          != other.getDifficulty()) return false;
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
      if (getOptionalCardListCount() > 0) {
        hash = (37 * hash) + OPTIONAL_CARD_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getOptionalCardListList().hashCode();
      }
      hash = (37 * hash) + CUR_ROUND_FIELD_NUMBER;
      hash = (53 * hash) + getCurRound();
      hash = (37 * hash) + STAGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getStageId();
      hash = (37 * hash) + IS_ENTER_DUNGEON_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsEnterDungeon());
      hash = (37 * hash) + DIFFICULTY_FIELD_NUMBER;
      hash = (53 * hash) + getDifficulty();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.RogueDiaryProgressOuterClass.RogueDiaryProgress parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.RogueDiaryProgressOuterClass.RogueDiaryProgress parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RogueDiaryProgressOuterClass.RogueDiaryProgress parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.RogueDiaryProgressOuterClass.RogueDiaryProgress parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RogueDiaryProgressOuterClass.RogueDiaryProgress parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.RogueDiaryProgressOuterClass.RogueDiaryProgress parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RogueDiaryProgressOuterClass.RogueDiaryProgress parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.RogueDiaryProgressOuterClass.RogueDiaryProgress parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RogueDiaryProgressOuterClass.RogueDiaryProgress parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.RogueDiaryProgressOuterClass.RogueDiaryProgress parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RogueDiaryProgressOuterClass.RogueDiaryProgress parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.RogueDiaryProgressOuterClass.RogueDiaryProgress parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.RogueDiaryProgressOuterClass.RogueDiaryProgress prototype) {
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
     * Obf: FKDCFIEKHGM
     * </pre>
     *
     * Protobuf type {@code RogueDiaryProgress}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RogueDiaryProgress)
        emu.grasscutter.net.proto.RogueDiaryProgressOuterClass.RogueDiaryProgressOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.RogueDiaryProgressOuterClass.internal_static_RogueDiaryProgress_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.RogueDiaryProgressOuterClass.internal_static_RogueDiaryProgress_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.RogueDiaryProgressOuterClass.RogueDiaryProgress.class, emu.grasscutter.net.proto.RogueDiaryProgressOuterClass.RogueDiaryProgress.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.RogueDiaryProgressOuterClass.RogueDiaryProgress.newBuilder()
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
        optionalCardList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        curRound_ = 0;

        stageId_ = 0;

        isEnterDungeon_ = false;

        difficulty_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.RogueDiaryProgressOuterClass.internal_static_RogueDiaryProgress_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.RogueDiaryProgressOuterClass.RogueDiaryProgress getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.RogueDiaryProgressOuterClass.RogueDiaryProgress.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.RogueDiaryProgressOuterClass.RogueDiaryProgress build() {
        emu.grasscutter.net.proto.RogueDiaryProgressOuterClass.RogueDiaryProgress result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.RogueDiaryProgressOuterClass.RogueDiaryProgress buildPartial() {
        emu.grasscutter.net.proto.RogueDiaryProgressOuterClass.RogueDiaryProgress result = new emu.grasscutter.net.proto.RogueDiaryProgressOuterClass.RogueDiaryProgress(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          optionalCardList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.optionalCardList_ = optionalCardList_;
        result.curRound_ = curRound_;
        result.stageId_ = stageId_;
        result.isEnterDungeon_ = isEnterDungeon_;
        result.difficulty_ = difficulty_;
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
        if (other instanceof emu.grasscutter.net.proto.RogueDiaryProgressOuterClass.RogueDiaryProgress) {
          return mergeFrom((emu.grasscutter.net.proto.RogueDiaryProgressOuterClass.RogueDiaryProgress)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.RogueDiaryProgressOuterClass.RogueDiaryProgress other) {
        if (other == emu.grasscutter.net.proto.RogueDiaryProgressOuterClass.RogueDiaryProgress.getDefaultInstance()) return this;
        if (!other.optionalCardList_.isEmpty()) {
          if (optionalCardList_.isEmpty()) {
            optionalCardList_ = other.optionalCardList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureOptionalCardListIsMutable();
            optionalCardList_.addAll(other.optionalCardList_);
          }
          onChanged();
        }
        if (other.getCurRound() != 0) {
          setCurRound(other.getCurRound());
        }
        if (other.getStageId() != 0) {
          setStageId(other.getStageId());
        }
        if (other.getIsEnterDungeon() != false) {
          setIsEnterDungeon(other.getIsEnterDungeon());
        }
        if (other.getDifficulty() != 0) {
          setDifficulty(other.getDifficulty());
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
        emu.grasscutter.net.proto.RogueDiaryProgressOuterClass.RogueDiaryProgress parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.RogueDiaryProgressOuterClass.RogueDiaryProgress) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList optionalCardList_ = emptyIntList();
      private void ensureOptionalCardListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          optionalCardList_ = mutableCopy(optionalCardList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 optional_card_list = 5;</code>
       * @return A list containing the optionalCardList.
       */
      public java.util.List<java.lang.Integer>
          getOptionalCardListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(optionalCardList_) : optionalCardList_;
      }
      /**
       * <code>repeated uint32 optional_card_list = 5;</code>
       * @return The count of optionalCardList.
       */
      public int getOptionalCardListCount() {
        return optionalCardList_.size();
      }
      /**
       * <code>repeated uint32 optional_card_list = 5;</code>
       * @param index The index of the element to return.
       * @return The optionalCardList at the given index.
       */
      public int getOptionalCardList(int index) {
        return optionalCardList_.getInt(index);
      }
      /**
       * <code>repeated uint32 optional_card_list = 5;</code>
       * @param index The index to set the value at.
       * @param value The optionalCardList to set.
       * @return This builder for chaining.
       */
      public Builder setOptionalCardList(
          int index, int value) {
        ensureOptionalCardListIsMutable();
        optionalCardList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 optional_card_list = 5;</code>
       * @param value The optionalCardList to add.
       * @return This builder for chaining.
       */
      public Builder addOptionalCardList(int value) {
        ensureOptionalCardListIsMutable();
        optionalCardList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 optional_card_list = 5;</code>
       * @param values The optionalCardList to add.
       * @return This builder for chaining.
       */
      public Builder addAllOptionalCardList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureOptionalCardListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, optionalCardList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 optional_card_list = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearOptionalCardList() {
        optionalCardList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int curRound_ ;
      /**
       * <code>uint32 cur_round = 1;</code>
       * @return The curRound.
       */
      @java.lang.Override
      public int getCurRound() {
        return curRound_;
      }
      /**
       * <code>uint32 cur_round = 1;</code>
       * @param value The curRound to set.
       * @return This builder for chaining.
       */
      public Builder setCurRound(int value) {
        
        curRound_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cur_round = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearCurRound() {
        
        curRound_ = 0;
        onChanged();
        return this;
      }

      private int stageId_ ;
      /**
       * <code>uint32 stage_id = 3;</code>
       * @return The stageId.
       */
      @java.lang.Override
      public int getStageId() {
        return stageId_;
      }
      /**
       * <code>uint32 stage_id = 3;</code>
       * @param value The stageId to set.
       * @return This builder for chaining.
       */
      public Builder setStageId(int value) {
        
        stageId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 stage_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearStageId() {
        
        stageId_ = 0;
        onChanged();
        return this;
      }

      private boolean isEnterDungeon_ ;
      /**
       * <code>bool is_enter_dungeon = 7;</code>
       * @return The isEnterDungeon.
       */
      @java.lang.Override
      public boolean getIsEnterDungeon() {
        return isEnterDungeon_;
      }
      /**
       * <code>bool is_enter_dungeon = 7;</code>
       * @param value The isEnterDungeon to set.
       * @return This builder for chaining.
       */
      public Builder setIsEnterDungeon(boolean value) {
        
        isEnterDungeon_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_enter_dungeon = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsEnterDungeon() {
        
        isEnterDungeon_ = false;
        onChanged();
        return this;
      }

      private int difficulty_ ;
      /**
       * <code>uint32 difficulty = 2;</code>
       * @return The difficulty.
       */
      @java.lang.Override
      public int getDifficulty() {
        return difficulty_;
      }
      /**
       * <code>uint32 difficulty = 2;</code>
       * @param value The difficulty to set.
       * @return This builder for chaining.
       */
      public Builder setDifficulty(int value) {
        
        difficulty_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 difficulty = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearDifficulty() {
        
        difficulty_ = 0;
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


      // @@protoc_insertion_point(builder_scope:RogueDiaryProgress)
    }

    // @@protoc_insertion_point(class_scope:RogueDiaryProgress)
    private static final emu.grasscutter.net.proto.RogueDiaryProgressOuterClass.RogueDiaryProgress DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.RogueDiaryProgressOuterClass.RogueDiaryProgress();
    }

    public static emu.grasscutter.net.proto.RogueDiaryProgressOuterClass.RogueDiaryProgress getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RogueDiaryProgress>
        PARSER = new com.google.protobuf.AbstractParser<RogueDiaryProgress>() {
      @java.lang.Override
      public RogueDiaryProgress parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RogueDiaryProgress(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RogueDiaryProgress> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RogueDiaryProgress> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.RogueDiaryProgressOuterClass.RogueDiaryProgress getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RogueDiaryProgress_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RogueDiaryProgress_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030RogueDiaryProgress.proto\"\203\001\n\022RogueDiar" +
      "yProgress\022\032\n\022optional_card_list\030\005 \003(\r\022\021\n" +
      "\tcur_round\030\001 \001(\r\022\020\n\010stage_id\030\003 \001(\r\022\030\n\020is" +
      "_enter_dungeon\030\007 \001(\010\022\022\n\ndifficulty\030\002 \001(\r" +
      "B\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_RogueDiaryProgress_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RogueDiaryProgress_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RogueDiaryProgress_descriptor,
        new java.lang.String[] { "OptionalCardList", "CurRound", "StageId", "IsEnterDungeon", "Difficulty", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
