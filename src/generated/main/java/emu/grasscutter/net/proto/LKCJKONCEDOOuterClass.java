// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LKCJKONCEDO.proto

package emu.grasscutter.net.proto;

public final class LKCJKONCEDOOuterClass {
  private LKCJKONCEDOOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code LKCJKONCEDO}
   */
  public enum LKCJKONCEDO
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>LKCJKONCEDO_None = 0;</code>
     */
    LKCJKONCEDO_None(0),
    /**
     * <code>LKCJKONCEDO_ReachScore = 1;</code>
     */
    LKCJKONCEDO_ReachScore(1),
    /**
     * <code>LKCJKONCEDO_TimeUp = 2;</code>
     */
    LKCJKONCEDO_TimeUp(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>LKCJKONCEDO_None = 0;</code>
     */
    public static final int LKCJKONCEDO_None_VALUE = 0;
    /**
     * <code>LKCJKONCEDO_ReachScore = 1;</code>
     */
    public static final int LKCJKONCEDO_ReachScore_VALUE = 1;
    /**
     * <code>LKCJKONCEDO_TimeUp = 2;</code>
     */
    public static final int LKCJKONCEDO_TimeUp_VALUE = 2;


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
    public static LKCJKONCEDO valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static LKCJKONCEDO forNumber(int value) {
      switch (value) {
        case 0: return LKCJKONCEDO_None;
        case 1: return LKCJKONCEDO_ReachScore;
        case 2: return LKCJKONCEDO_TimeUp;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<LKCJKONCEDO>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        LKCJKONCEDO> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<LKCJKONCEDO>() {
            public LKCJKONCEDO findValueByNumber(int number) {
              return LKCJKONCEDO.forNumber(number);
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
      return emu.grasscutter.net.proto.LKCJKONCEDOOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final LKCJKONCEDO[] VALUES = values();

    public static LKCJKONCEDO valueOf(
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

    private LKCJKONCEDO(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:LKCJKONCEDO)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021LKCJKONCEDO.proto*W\n\013LKCJKONCEDO\022\024\n\020LK" +
      "CJKONCEDO_None\020\000\022\032\n\026LKCJKONCEDO_ReachSco" +
      "re\020\001\022\026\n\022LKCJKONCEDO_TimeUp\020\002B\033\n\031emu.gras" +
      "scutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}