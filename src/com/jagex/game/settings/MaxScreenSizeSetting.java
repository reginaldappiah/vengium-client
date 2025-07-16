package com.jagex.game.settings;/* Class422_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.Graphics;
import com.jagex.SettingsManager;

public class MaxScreenSizeSetting extends GameSettings {


    public MaxScreenSizeSetting(int value, SettingsManager settingsManager) {
        super(value, settingsManager);
    }

    public MaxScreenSizeSetting(SettingsManager settingsManager) {
        super(settingsManager);
    }

    public void validate() {
        if (value * -1598873795 < 0 || value * -1598873795 > 2)
            value = getDefault() * 1886334997;
    }

    int getDefault() {
        if (settingsManager.toolkitSetting.method5679() && Graphics.method616(settingsManager.toolkitSetting.getValue(), 855449683))
            return 1;
        return 0;
    }

    public boolean method5653() {
        return true;
    }

    public int getSupport(int value) {
        return 1;
    }

    void setValue(int value) {
        System.out.println("Max Screen: " + value);
        this.value = 1886334997 * value;
    }

    public int getValue() {
        return -1598873795 * value;
    }
}
