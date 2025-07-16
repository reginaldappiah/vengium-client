package com.jagex.game.settings;/* Class422_Sub24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.Class147;
import com.jagex.SettingsManager;

public class Class422_Sub24 extends GameSettings {

    public Class422_Sub24(int value, SettingsManager settingsManager) {
        super(value, settingsManager);
    }

    public Class422_Sub24(SettingsManager settingsManager) {
        super(settingsManager);
    }

    public void validate() {
        if ((-1598873795 * value < Class147.aClass147_1579.anInt1580 * -999577713) || (-1598873795 * value > (-999577713 * Class147.aClass147_1577.anInt1580)))
            value = getDefault() * 1886334997;
    }

    int getDefault() {
        return Class147.aClass147_1579.anInt1580 * -999577713;
    }

    int getSupport(int value) {
        return 1;
    }

    void setValue(int value) {
        System.out.println("SUB22: " + value);
        this.value = value * 1886334997;
    }

    public int getValue() {
        return -1598873795 * value;
    }

}
