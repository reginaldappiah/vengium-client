package com.jagex;/* Class384 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.Js5Configs;

public class Class384 {

    Class384() throws Throwable {
        throw new Error();
    }

    static void method4699(String string, boolean bool, int i, int i_6_, String string_7_, boolean bool_8_) {
        string = string.toLowerCase();
        short[] itemIDs = new short[16];
        int i_10_ = -1;
        String string_11_ = null;
        if (-1 != i) {
            Class497 class497 = Class92.aClass504_905.get(i);
            if (null == class497 || class497.method6206() != bool_8_)
                return;
            if (class497.method6206())
                string_11_ = class497.aString6101;
            else
                i_10_ = -388931549 * class497.size;
        }
        int itemIndex = 0;
        for (int itemID = 0; itemID < (Js5Configs.itemList.itemDefinitionsLength * -888767613); itemID++) {
            ItemDefinition itemDefinitions = Js5Configs.itemList.getItemDefinitions(itemID, true);
            if (bool && !itemDefinitions.unnoted) {

            } else if (-1 == itemDefinitions.certTemplateID * -1673957995 && -1 == 465190555 * itemDefinitions.lendTemplateID && 2083650097 * itemDefinitions.unknownValue1 == -1) {
                if (0 != 935029595 * itemDefinitions.unknownInt6) {

                } else if (itemDefinitions.name.toLowerCase().indexOf(string) == -1) {

                } else {
                    if (i != -1) {
                        if (bool_8_) {
                            if (!string_7_.equals(itemDefinitions.method6041(i, string_11_))) {
                                continue;
                            }
                        } else if (i_6_ != itemDefinitions.method6037(i, i_10_)) {
                            continue;
                        }
                    }
                    if (itemIndex >= 250) {
                        Class344.itemIndex = -140296601;
                        EffectiveVertex.aShortArray678 = null;
                        return;
                    }
                    if (itemIndex >= itemIDs.length) {
                        short[] is_14_ = new short[2 * itemIDs.length];
                        for (int i_15_ = 0; i_15_ < itemIndex; i_15_++)
                            is_14_[i_15_] = itemIDs[i_15_];
                        itemIDs = is_14_;
                    }
                    itemIDs[itemIndex++] = (short) itemID;
                }
            }
        }
        EffectiveVertex.aShortArray678 = itemIDs;
        ResourceProvider.anInt2709 = 0;
        Class344.itemIndex = itemIndex * 140296601;
        String[] strings = new String[367592105 * Class344.itemIndex];
        for (int index = 0; index < 367592105 * Class344.itemIndex; index++)
            strings[index] = (Js5Configs.itemList.getItemDefinitions(itemIDs[index]).name);
        StaticMethods.method2085(strings, EffectiveVertex.aShortArray678);
    }

}
