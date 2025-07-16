package com.jagex.game.settings;/* Class422_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.SettingsManager;

public class AntiAliasingSetting extends GameSettings {

    public static final int NONE = 0;
    public static final int TWOX = 1;
    public static final int FOURX = 2;

    public AntiAliasingSetting(int value, SettingsManager settingsManager) {
        super(value, settingsManager);
    }

    public AntiAliasingSetting(SettingsManager settingsManager) {
        super(settingsManager);
    }

    public void validate() {
        if (settingsManager.toolkitSetting.method5679() && !GraphicsLevelSetting.isAPI(settingsManager.toolkitSetting.getValue()))
            value = NONE;
        if (value * -1598873795 < NONE || value * -1598873795 > FOURX)
            value = getDefault() * 1886334997;
    }

    public boolean isAPI() {
        return GraphicsLevelSetting.isAPI(settingsManager.toolkitSetting.getValue());
    }

    int getDefault() {
        return NONE;
    }

    void setValue(int value) {
        this.value = value * 1886334997;
    }

    public int getValue() {
        return value * -1598873795;
    }

    public int getSupport(int value) {
        if (!GraphicsLevelSetting.isAPI(settingsManager.toolkitSetting.getValue()))
            return 3;
        return TWOX;
    }

}
