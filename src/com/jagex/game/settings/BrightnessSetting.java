package com.jagex.game.settings;/* Class422_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.SettingsManager;

public class BrightnessSetting extends GameSettings {

    public BrightnessSetting(SettingsManager settingsManager) {
        super(settingsManager);
    }

    public BrightnessSetting(int value, SettingsManager settingsManager) {
        super(value, settingsManager);
    }

    int getSupport(int value) {
        return 1;
    }

    void setValue(int value) {
        this.value = 1886334997 * value;
    }

    public void validate() {
        if (value * -1598873795 < 0 || value * -1598873795 > 4)
            value = getDefault() * 1886334997;
    }

    int getDefault() {
        return 3;
    }

    public int getValue() {
        return -1598873795 * value;
    }

}
