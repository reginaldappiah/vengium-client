package com.jagex;/* Class405 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class EquipmentDefaults {
    public static EquipmentDefaults defaults;
    public int offhandSlot = 636252365;
    public int[] hidden;
    public int weaponSlot = 78914705;
    public int[] defaultSlots;
    public int[] hiddenAnimationOffhandSlots;

    public EquipmentDefaults(Js5FileSystem fileSystem) {
        byte[] data = fileSystem.get((-363169051 * Class380.aClass380_4105.anInt4108));
        decode(new Buffer(data));
        if (hidden == null)
            throw new RuntimeException("");
    }

    void decode(Buffer buffer) {
        for (;;) {
            int opcode = buffer.readUByte();
            if (opcode == 0) {
                break;
            }
            if (opcode == 1) {
                int count = buffer.readUByte();
                hidden = new int[count];
                int index = 0;
                for (; index < hidden.length; index++) {
                    hidden[index] = buffer.readUByte();
                    if (hidden[index] == 0) {

                    } else if (2 == hidden[index])
                        continue;
                }
            } else if (opcode == 3)
                offhandSlot = buffer.readUByte() * -636252365;
            else if (opcode == 4)
                weaponSlot = buffer.readUByte() * -78914705;
            else if (opcode == 5) {
                defaultSlots = new int[buffer.readUByte()];
                for (int index = 0; index < defaultSlots.length; index++)
                    defaultSlots[index] = buffer.readUByte();
            } else if (opcode == 6) {
                hiddenAnimationOffhandSlots = new int[buffer.readUByte()];
                for (int index = 0; index < hiddenAnimationOffhandSlots.length; index++)
                    hiddenAnimationOffhandSlots[index] = buffer.readUByte();
            }
        }
    }

}
