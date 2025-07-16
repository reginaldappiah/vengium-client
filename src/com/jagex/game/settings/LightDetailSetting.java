package com.jagex.game.settings;/* Class422_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.SettingsManager;

public class LightDetailSetting extends GameSettings {

    public LightDetailSetting(int value, SettingsManager settingsManager) {
        super(value, settingsManager);
    }

    public LightDetailSetting(SettingsManager settingsManager) {
        super(settingsManager);
    }

    int getDefault() {
        return 1;
    }

    public void validate() {
        if (-1598873795 * value != 1 && value * -1598873795 != 0)
            value = getDefault() * 1886334997;
    }

    int getSupport(int value) {
        return 1;
    }

    void setValue(int value) {
        System.out.println("Lighting Detail: " + value);
        this.value = 1886334997 * value;
    }

    public int getValue() {
        return value * -1598873795;
    }

}
