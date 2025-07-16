package com.jagex.game.settings;/* Class422_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.SettingsManager;

public class SceneryShadowsSettings extends GameSettings {

    public static final int NONE = 0;
    public static final int STATIC = 1;
    public static final int DYNAMIC = 2;

    public SceneryShadowsSettings(int i, SettingsManager class298_sub48) {
        super(i, class298_sub48);
    }

    public SceneryShadowsSettings(SettingsManager settingsManager) {
        super(settingsManager);
    }

    public int getSupport(int value) {
        if (settingsManager.textures.getValue() == TextureSetting.OFF)
            return 3;
        return STATIC;
    }

    int getDefault() {
        return DYNAMIC;
    }

    public boolean isActivated() {
        return settingsManager.textures.getValue() != TextureSetting.OFF;
    }

    public void validate() {
        if (settingsManager.textures.getValue() == TextureSetting.OFF)
            value = NONE;
        if (-1598873795 * value < NONE || -1598873795 * value > DYNAMIC)
            value = getDefault() * 1886334997;
    }

    public int getValue() {
        return value * -1598873795;
    }

    void setValue(int value) {
        System.out.println("Scenery Shadows: " + (value == DYNAMIC ? "DYNAMIC" : value == STATIC ? "STATIC" : "NONE"));
        this.value = 1886334997 * value;
    }

}
