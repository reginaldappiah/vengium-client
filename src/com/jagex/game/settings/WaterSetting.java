package com.jagex.game.settings;/* Class422_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.SettingsManager;

public class WaterSetting extends GameSettings {

    public static final int LOW = 0;
    public static final int MEDIUM = 1;
    public static final int HIGH = 2;

    public WaterSetting(int value, SettingsManager settingsManager) {
        super(value, settingsManager);
    }

    public WaterSetting(SettingsManager settingsManager) {
        super(settingsManager);
    }

    public void validate() {
        if (-1598873795 * value < LOW && value * -1598873795 > HIGH)
            value = getDefault() * 1886334997;
    }

    public boolean method5641() {
        return true;
    }

    public int getValue() {
        return -1598873795 * value;
    }

    void setValue(int value) {
        System.out.println("Water Setting: " + (value == HIGH ? "HIGH" : value == MEDIUM ? "MEDIUM" : "LOW"));
        this.value = 1886334997 * value;
    }

    public int getSupport(int value) {
        if (value == LOW || settingsManager.groundBlending.getValue() == GroundBlendingSetting.ON)
            return 1;
        return HIGH;
    }

    int getDefault() {
        return MEDIUM;
    }

}
