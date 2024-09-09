// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChangeHpDebts.proto

package emu.grasscutter.net.proto;

public final class ChangeHpDebtsOuterClass {
  private ChangeHpDebtsOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code ChangeHpDebts}
   */
  public enum ChangeHpDebts
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>CHANGE_HP_DEBTS_NONE = 0;</code>
     */
    CHANGE_HP_DEBTS_NONE(0),
    /**
     * <code>CHANGE_HP_DEBTS_PAY = 1;</code>
     */
    CHANGE_HP_DEBTS_PAY(1),
    /**
     * <code>CHANGE_HP_DEBTS_PAY_FINISH = 2;</code>
     */
    CHANGE_HP_DEBTS_PAY_FINISH(2),
    /**
     * <code>CHANGE_HP_DEBTS_CLEAR = 21;</code>
     */
    CHANGE_HP_DEBTS_CLEAR(21),
    /**
     * <code>CHANGE_HP_DEBTS_REDUCE_ABILITY = 41;</code>
     */
    CHANGE_HP_DEBTS_REDUCE_ABILITY(41),
    /**
     * <code>CHANGE_HP_DEBTS_ADD_ABILITY = 51;</code>
     */
    CHANGE_HP_DEBTS_ADD_ABILITY(51),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>CHANGE_HP_DEBTS_NONE = 0;</code>
     */
    public static final int CHANGE_HP_DEBTS_NONE_VALUE = 0;
    /**
     * <code>CHANGE_HP_DEBTS_PAY = 1;</code>
     */
    public static final int CHANGE_HP_DEBTS_PAY_VALUE = 1;
    /**
     * <code>CHANGE_HP_DEBTS_PAY_FINISH = 2;</code>
     */
    public static final int CHANGE_HP_DEBTS_PAY_FINISH_VALUE = 2;
    /**
     * <code>CHANGE_HP_DEBTS_CLEAR = 21;</code>
     */
    public static final int CHANGE_HP_DEBTS_CLEAR_VALUE = 21;
    /**
     * <code>CHANGE_HP_DEBTS_REDUCE_ABILITY = 41;</code>
     */
    public static final int CHANGE_HP_DEBTS_REDUCE_ABILITY_VALUE = 41;
    /**
     * <code>CHANGE_HP_DEBTS_ADD_ABILITY = 51;</code>
     */
    public static final int CHANGE_HP_DEBTS_ADD_ABILITY_VALUE = 51;


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
    public static ChangeHpDebts valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ChangeHpDebts forNumber(int value) {
      switch (value) {
        case 0: return CHANGE_HP_DEBTS_NONE;
        case 1: return CHANGE_HP_DEBTS_PAY;
        case 2: return CHANGE_HP_DEBTS_PAY_FINISH;
        case 21: return CHANGE_HP_DEBTS_CLEAR;
        case 41: return CHANGE_HP_DEBTS_REDUCE_ABILITY;
        case 51: return CHANGE_HP_DEBTS_ADD_ABILITY;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ChangeHpDebts>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ChangeHpDebts> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ChangeHpDebts>() {
            public ChangeHpDebts findValueByNumber(int number) {
              return ChangeHpDebts.forNumber(number);
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
      return emu.grasscutter.net.proto.ChangeHpDebtsOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final ChangeHpDebts[] VALUES = values();

    public static ChangeHpDebts valueOf(
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

    private ChangeHpDebts(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:ChangeHpDebts)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023ChangeHpDebts.proto*\302\001\n\rChangeHpDebts\022" +
      "\030\n\024CHANGE_HP_DEBTS_NONE\020\000\022\027\n\023CHANGE_HP_D" +
      "EBTS_PAY\020\001\022\036\n\032CHANGE_HP_DEBTS_PAY_FINISH" +
      "\020\002\022\031\n\025CHANGE_HP_DEBTS_CLEAR\020\025\022\"\n\036CHANGE_" +
      "HP_DEBTS_REDUCE_ABILITY\020)\022\037\n\033CHANGE_HP_D" +
      "EBTS_ADD_ABILITY\0203B\033\n\031emu.grasscutter.ne" +
      "t.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
