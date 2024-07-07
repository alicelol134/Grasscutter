// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Investigation.proto

package emu.grasscutter.net.proto;

public final class InvestigationOuterClass {
  private InvestigationOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface InvestigationOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Investigation)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 id = 6;</code>
     * @return The id.
     */
    int getId();

    /**
     * <code>uint32 total_progress = 8;</code>
     * @return The totalProgress.
     */
    int getTotalProgress();

    /**
     * <code>.Investigation.State state = 9;</code>
     * @return The enum numeric value on the wire for state.
     */
    int getStateValue();
    /**
     * <code>.Investigation.State state = 9;</code>
     * @return The state.
     */
    emu.grasscutter.net.proto.InvestigationOuterClass.Investigation.State getState();

    /**
     * <code>uint32 progress = 12;</code>
     * @return The progress.
     */
    int getProgress();
  }
  /**
   * <pre>
   * Version: 4.6.0
   * Obfs: INJKDLOLFNC
   * </pre>
   *
   * Protobuf type {@code Investigation}
   */
  public static final class Investigation extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Investigation)
      InvestigationOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Investigation.newBuilder() to construct.
    private Investigation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Investigation() {
      state_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Investigation();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Investigation(
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
            case 48: {

              id_ = input.readUInt32();
              break;
            }
            case 64: {

              totalProgress_ = input.readUInt32();
              break;
            }
            case 72: {
              int rawValue = input.readEnum();

              state_ = rawValue;
              break;
            }
            case 96: {

              progress_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.InvestigationOuterClass.internal_static_Investigation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.InvestigationOuterClass.internal_static_Investigation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.InvestigationOuterClass.Investigation.class, emu.grasscutter.net.proto.InvestigationOuterClass.Investigation.Builder.class);
    }

    /**
     * Protobuf enum {@code Investigation.State}
     */
    public enum State
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>STATE_INVALID = 0;</code>
       */
      STATE_INVALID(0),
      /**
       * <code>STATE_IN_PROGRESS = 1;</code>
       */
      STATE_IN_PROGRESS(1),
      /**
       * <code>STATE_COMPLETE = 2;</code>
       */
      STATE_COMPLETE(2),
      /**
       * <code>STATE_REWARD_TAKEN = 3;</code>
       */
      STATE_REWARD_TAKEN(3),
      UNRECOGNIZED(-1),
      ;

      /**
       * <code>STATE_INVALID = 0;</code>
       */
      public static final int STATE_INVALID_VALUE = 0;
      /**
       * <code>STATE_IN_PROGRESS = 1;</code>
       */
      public static final int STATE_IN_PROGRESS_VALUE = 1;
      /**
       * <code>STATE_COMPLETE = 2;</code>
       */
      public static final int STATE_COMPLETE_VALUE = 2;
      /**
       * <code>STATE_REWARD_TAKEN = 3;</code>
       */
      public static final int STATE_REWARD_TAKEN_VALUE = 3;


      public final int getNumber() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static State valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static State forNumber(int value) {
        switch (value) {
          case 0: return STATE_INVALID;
          case 1: return STATE_IN_PROGRESS;
          case 2: return STATE_COMPLETE;
          case 3: return STATE_REWARD_TAKEN;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<State>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          State> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<State>() {
              public State findValueByNumber(int number) {
                return State.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalStateException(
              "Can't get the descriptor of an unrecognized enum value.");
        }
        return getDescriptor().getValues().get(ordinal());
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.InvestigationOuterClass.Investigation.getDescriptor().getEnumTypes().get(0);
      }

      private static final State[] VALUES = values();

      public static State valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
          return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private State(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:Investigation.State)
    }

    public static final int ID_FIELD_NUMBER = 6;
    private int id_;
    /**
     * <code>uint32 id = 6;</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
    }

    public static final int TOTAL_PROGRESS_FIELD_NUMBER = 8;
    private int totalProgress_;
    /**
     * <code>uint32 total_progress = 8;</code>
     * @return The totalProgress.
     */
    @java.lang.Override
    public int getTotalProgress() {
      return totalProgress_;
    }

    public static final int STATE_FIELD_NUMBER = 9;
    private int state_;
    /**
     * <code>.Investigation.State state = 9;</code>
     * @return The enum numeric value on the wire for state.
     */
    @java.lang.Override public int getStateValue() {
      return state_;
    }
    /**
     * <code>.Investigation.State state = 9;</code>
     * @return The state.
     */
    @java.lang.Override public emu.grasscutter.net.proto.InvestigationOuterClass.Investigation.State getState() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.InvestigationOuterClass.Investigation.State result = emu.grasscutter.net.proto.InvestigationOuterClass.Investigation.State.valueOf(state_);
      return result == null ? emu.grasscutter.net.proto.InvestigationOuterClass.Investigation.State.UNRECOGNIZED : result;
    }

    public static final int PROGRESS_FIELD_NUMBER = 12;
    private int progress_;
    /**
     * <code>uint32 progress = 12;</code>
     * @return The progress.
     */
    @java.lang.Override
    public int getProgress() {
      return progress_;
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
      if (id_ != 0) {
        output.writeUInt32(6, id_);
      }
      if (totalProgress_ != 0) {
        output.writeUInt32(8, totalProgress_);
      }
      if (state_ != emu.grasscutter.net.proto.InvestigationOuterClass.Investigation.State.STATE_INVALID.getNumber()) {
        output.writeEnum(9, state_);
      }
      if (progress_ != 0) {
        output.writeUInt32(12, progress_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (id_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, id_);
      }
      if (totalProgress_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, totalProgress_);
      }
      if (state_ != emu.grasscutter.net.proto.InvestigationOuterClass.Investigation.State.STATE_INVALID.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(9, state_);
      }
      if (progress_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, progress_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.InvestigationOuterClass.Investigation)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.InvestigationOuterClass.Investigation other = (emu.grasscutter.net.proto.InvestigationOuterClass.Investigation) obj;

      if (getId()
          != other.getId()) return false;
      if (getTotalProgress()
          != other.getTotalProgress()) return false;
      if (state_ != other.state_) return false;
      if (getProgress()
          != other.getProgress()) return false;
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
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId();
      hash = (37 * hash) + TOTAL_PROGRESS_FIELD_NUMBER;
      hash = (53 * hash) + getTotalProgress();
      hash = (37 * hash) + STATE_FIELD_NUMBER;
      hash = (53 * hash) + state_;
      hash = (37 * hash) + PROGRESS_FIELD_NUMBER;
      hash = (53 * hash) + getProgress();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.InvestigationOuterClass.Investigation parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.InvestigationOuterClass.Investigation parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InvestigationOuterClass.Investigation parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.InvestigationOuterClass.Investigation parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InvestigationOuterClass.Investigation parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.InvestigationOuterClass.Investigation parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InvestigationOuterClass.Investigation parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.InvestigationOuterClass.Investigation parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InvestigationOuterClass.Investigation parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.InvestigationOuterClass.Investigation parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InvestigationOuterClass.Investigation parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.InvestigationOuterClass.Investigation parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.InvestigationOuterClass.Investigation prototype) {
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
     * Obfs: INJKDLOLFNC
     * </pre>
     *
     * Protobuf type {@code Investigation}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Investigation)
        emu.grasscutter.net.proto.InvestigationOuterClass.InvestigationOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.InvestigationOuterClass.internal_static_Investigation_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.InvestigationOuterClass.internal_static_Investigation_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.InvestigationOuterClass.Investigation.class, emu.grasscutter.net.proto.InvestigationOuterClass.Investigation.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.InvestigationOuterClass.Investigation.newBuilder()
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
        id_ = 0;

        totalProgress_ = 0;

        state_ = 0;

        progress_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.InvestigationOuterClass.internal_static_Investigation_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.InvestigationOuterClass.Investigation getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.InvestigationOuterClass.Investigation.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.InvestigationOuterClass.Investigation build() {
        emu.grasscutter.net.proto.InvestigationOuterClass.Investigation result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.InvestigationOuterClass.Investigation buildPartial() {
        emu.grasscutter.net.proto.InvestigationOuterClass.Investigation result = new emu.grasscutter.net.proto.InvestigationOuterClass.Investigation(this);
        result.id_ = id_;
        result.totalProgress_ = totalProgress_;
        result.state_ = state_;
        result.progress_ = progress_;
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
        if (other instanceof emu.grasscutter.net.proto.InvestigationOuterClass.Investigation) {
          return mergeFrom((emu.grasscutter.net.proto.InvestigationOuterClass.Investigation)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.InvestigationOuterClass.Investigation other) {
        if (other == emu.grasscutter.net.proto.InvestigationOuterClass.Investigation.getDefaultInstance()) return this;
        if (other.getId() != 0) {
          setId(other.getId());
        }
        if (other.getTotalProgress() != 0) {
          setTotalProgress(other.getTotalProgress());
        }
        if (other.state_ != 0) {
          setStateValue(other.getStateValue());
        }
        if (other.getProgress() != 0) {
          setProgress(other.getProgress());
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
        emu.grasscutter.net.proto.InvestigationOuterClass.Investigation parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.InvestigationOuterClass.Investigation) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int id_ ;
      /**
       * <code>uint32 id = 6;</code>
       * @return The id.
       */
      @java.lang.Override
      public int getId() {
        return id_;
      }
      /**
       * <code>uint32 id = 6;</code>
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(int value) {
        
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {
        
        id_ = 0;
        onChanged();
        return this;
      }

      private int totalProgress_ ;
      /**
       * <code>uint32 total_progress = 8;</code>
       * @return The totalProgress.
       */
      @java.lang.Override
      public int getTotalProgress() {
        return totalProgress_;
      }
      /**
       * <code>uint32 total_progress = 8;</code>
       * @param value The totalProgress to set.
       * @return This builder for chaining.
       */
      public Builder setTotalProgress(int value) {
        
        totalProgress_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 total_progress = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearTotalProgress() {
        
        totalProgress_ = 0;
        onChanged();
        return this;
      }

      private int state_ = 0;
      /**
       * <code>.Investigation.State state = 9;</code>
       * @return The enum numeric value on the wire for state.
       */
      @java.lang.Override public int getStateValue() {
        return state_;
      }
      /**
       * <code>.Investigation.State state = 9;</code>
       * @param value The enum numeric value on the wire for state to set.
       * @return This builder for chaining.
       */
      public Builder setStateValue(int value) {
        
        state_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.Investigation.State state = 9;</code>
       * @return The state.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.InvestigationOuterClass.Investigation.State getState() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.InvestigationOuterClass.Investigation.State result = emu.grasscutter.net.proto.InvestigationOuterClass.Investigation.State.valueOf(state_);
        return result == null ? emu.grasscutter.net.proto.InvestigationOuterClass.Investigation.State.UNRECOGNIZED : result;
      }
      /**
       * <code>.Investigation.State state = 9;</code>
       * @param value The state to set.
       * @return This builder for chaining.
       */
      public Builder setState(emu.grasscutter.net.proto.InvestigationOuterClass.Investigation.State value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        state_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.Investigation.State state = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearState() {
        
        state_ = 0;
        onChanged();
        return this;
      }

      private int progress_ ;
      /**
       * <code>uint32 progress = 12;</code>
       * @return The progress.
       */
      @java.lang.Override
      public int getProgress() {
        return progress_;
      }
      /**
       * <code>uint32 progress = 12;</code>
       * @param value The progress to set.
       * @return This builder for chaining.
       */
      public Builder setProgress(int value) {
        
        progress_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 progress = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearProgress() {
        
        progress_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Investigation)
    }

    // @@protoc_insertion_point(class_scope:Investigation)
    private static final emu.grasscutter.net.proto.InvestigationOuterClass.Investigation DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.InvestigationOuterClass.Investigation();
    }

    public static emu.grasscutter.net.proto.InvestigationOuterClass.Investigation getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Investigation>
        PARSER = new com.google.protobuf.AbstractParser<Investigation>() {
      @java.lang.Override
      public Investigation parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Investigation(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Investigation> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Investigation> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.InvestigationOuterClass.Investigation getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Investigation_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Investigation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023Investigation.proto\"\311\001\n\rInvestigation\022" +
      "\n\n\002id\030\006 \001(\r\022\026\n\016total_progress\030\010 \001(\r\022#\n\005s" +
      "tate\030\t \001(\0162\024.Investigation.State\022\020\n\010prog" +
      "ress\030\014 \001(\r\"]\n\005State\022\021\n\rSTATE_INVALID\020\000\022\025" +
      "\n\021STATE_IN_PROGRESS\020\001\022\022\n\016STATE_COMPLETE\020" +
      "\002\022\026\n\022STATE_REWARD_TAKEN\020\003B\033\n\031emu.grasscu" +
      "tter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Investigation_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Investigation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Investigation_descriptor,
        new java.lang.String[] { "Id", "TotalProgress", "State", "Progress", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
