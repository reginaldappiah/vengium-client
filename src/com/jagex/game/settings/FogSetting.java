package com.jagex.game.settings;/* Class422_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.SettingsManager;

public class FogSetting extends GameSettings {

    public static final int OFF = 0;
    public static final int ON = 1;

    public FogSetting(int value, SettingsManager settingsManager) {
        super(value, settingsManager);
    }

    public FogSetting(SettingsManager settingsManager) {
        super(settingsManager);
    }

    public boolean method5632() {
        return true;
    }

    public int getSupport(int value) {
        if (OFF != value && settingsManager.aClass422_Sub10_7548.getValue() == 2)
            return 3;
        if (value == OFF || settingsManager.groundBlending.getValue() == GroundBlendingSetting.ON)
            return ON;
        return 2;
    }

    public int getValue() {
        return -1598873795 * this.value;
    }

    void setValue(int value) {
        System.out.println("Fog Setting: " + (value == OFF ? "OFF" : "ON"));
        this.value = 1886334997 * value;
    }

    int getDefault() {
        return ON;
    }

    public void validate() {
        if (OFF != value * -1598873795 && settingsManager.groundBlending.getValue() != GroundBlendingSetting.ON)
            value = OFF;
        if (OFF != value * -1598873795 && settingsManager.aClass422_Sub10_7548.getValue() == 2)
            value = OFF;
        if (-1598873795 * value < OFF || -1598873795 * value > ON)
            value = getDefault() * 1886334997;
    }

}
