package com.jagex.game.settings;/* Class422_Sub29 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.SettingsManager;

public class VolumeSetting extends GameSettings {

    public VolumeSetting(int value, SettingsManager settingsManager) {
        super(value, settingsManager);
    }

    public VolumeSetting(SettingsManager settingsManager) {
        super(settingsManager);
    }

    int getDefault() {
        return 127;
    }

    int getSupport(int value) {
        return 1;
    }

    void setValue(int value) {
        System.out.println("Volume: " + value);
        this.value = 1886334997 * value;
    }

    public int getValue() {
        return -1598873795 * value;
    }

    public void validate() {
        if (value * -1598873795 < 0 && value * -1598873795 > 127)
            value = getDefault() * 1886334997;
    }

}
