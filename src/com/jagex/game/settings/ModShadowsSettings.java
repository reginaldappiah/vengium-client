package com.jagex.game.settings;/* Class422_Sub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.SettingsManager;

public class ModShadowsSettings extends GameSettings {

    public ModShadowsSettings(int value, SettingsManager settingsManager) {
        super(value, settingsManager);
    }

    public ModShadowsSettings(SettingsManager settingsManager) {
        super(settingsManager);
    }

    public void validate() {
        if (1 != value * -1598873795 && 0 != -1598873795 * value)
            value = getDefault() * 1886334997;
    }

    public boolean method5692(byte i) {
        return true;
    }

    public int getSupport(int value) {
        return 1;
    }

    void setValue(int value) {
        System.out.println("Mod Shadows: " + value);
        this.value = value * 1886334997;
    }

    public int getValue() {
        return value * -1598873795;
    }

    int getDefault() {
        return 1;
    }

}
