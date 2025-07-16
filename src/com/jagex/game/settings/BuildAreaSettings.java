package com.jagex.game.settings;/* Class422_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.Class115;
import com.jagex.SettingsManager;

public class BuildAreaSettings extends GameSettings {
    public BuildAreaSettings(int value, SettingsManager settingsManager) {
        super(value, settingsManager);
    }

    public BuildAreaSettings(SettingsManager settingsManager) {
        super(settingsManager);
    }

    int getDefault() {
        return -160182505 * Class115.aClass115_1383.anInt1387;
    }

    public void validate() {
        int i_0_ = settingsManager.getEnvironment().getMaximumMemory();
        if (i_0_ < 245)
            value = -917680925 * Class115.aClass115_1383.anInt1387;
        if ((-1598873795 * value == -160182505 * Class115.aClass115_1385.anInt1387) && i_0_ < 500)
            value = Class115.aClass115_1384.anInt1387 * -917680925;
        if ((-1598873795 * value < Class115.aClass115_1383.anInt1387 * -160182505) || (value * -1598873795 > -160182505 * Class115.aClass115_1388.anInt1387))
            value = getDefault() * 1886334997;
    }

    public int getSupport(int value) {
        int memory = settingsManager.getEnvironment().getMaximumMemory();
        if (memory < 245)
            return 3;
        if (Class115.aClass115_1385.anInt1387 * -160182505 == value && memory < 500)
            return 3;
        return 1;
    }

    void setValue(int value) {
        System.out.println("Build Area: " + value);
        this.value = 1886334997 * value;
    }

    public boolean method5666(int i) {
        int i_4_ = settingsManager.getEnvironment().getMaximumMemory();
        return i_4_ >= 245;
    }

    public int getValue() {
        return value * -1598873795;
    }

}
