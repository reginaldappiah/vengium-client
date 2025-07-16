package com.jagex.game.settings;/* Class422_Sub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.GameContext;
import com.jagex.SettingsManager;

public class TextureSetting extends GameSettings {

    public static final int OFF = 0;
    public static final int ON = 1;

    public TextureSetting(int value, SettingsManager settingsManager) {
        super(value, settingsManager);
    }

    public TextureSetting(SettingsManager settingsManager) {
        super(settingsManager);
    }

    public void validate() {
        if (settingsManager.getGame() != GameContext.VENGIUM)
            value = 1886334997;
        if (OFF != value * -1598873795 && 1 != -1598873795 * value)
            value = getDefault() * 1886334997;
    }

    int getDefault() {
        return ON;
    }

    public boolean isVengiumContext() {
        return settingsManager.getGame() == GameContext.VENGIUM;
    }

    void setValue(int i) {
        System.out.println("Texture Setting: " + (value/1886334997 == ON ? "ON" : "OFF"));
        value = 1886334997 * i;
    }

    public int getValue() {
        return -1598873795 * value;
    }

    public int getSupport(int value) {
        if (settingsManager.getGame() == GameContext.VENGIUM) {
            if (value == OFF || settingsManager.groundBlending.getValue() == GroundBlendingSetting.ON)
                return ON;
            return 2;
        }
        return 3;
    }
}
