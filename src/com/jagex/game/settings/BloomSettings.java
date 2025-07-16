package com.jagex.game.settings;/* Class422_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.SettingsManager;

public class BloomSettings extends GameSettings {

    public static final int BLOOMOFF = 0;
    public static final int BLOOMON = 1;


    public BloomSettings(int value, SettingsManager settingsManager) {
        super(value, settingsManager);
    }

    public BloomSettings(SettingsManager settingsManager) {
        super(settingsManager);
    }

    public void validate() {
        if (settingsManager.toolkitSetting.method5679() && !GraphicsLevelSetting.isAPI(settingsManager.toolkitSetting.getValue()))
            value = BLOOMOFF;
        if (-1598873795 * value < BLOOMOFF || -1598873795 * value > BLOOMON)
            value = getDefault() * 1886334997;
    }

    public boolean method5646() {
        return GraphicsLevelSetting.isAPI(settingsManager.toolkitSetting.getValue());
    }

    public int getSupport(int value) {
        if (!GraphicsLevelSetting.isAPI(settingsManager.toolkitSetting.getValue()))
            return 3;
        return BLOOMON;
    }

    public void setValue(int value) {
        System.out.println("Bloom: " + (value == BLOOMON ? "ON" : "OFF"));
        this.value = value * 1886334997;
    }

    public int getValue() {
        return -1598873795 * value;
    }

    public int getDefault() {
        return BLOOMOFF;
    }
}
