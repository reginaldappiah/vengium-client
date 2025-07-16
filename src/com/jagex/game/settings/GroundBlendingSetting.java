package com.jagex.game.settings;/* Class422_Sub28 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.GameContext;
import com.jagex.SettingsManager;

public class GroundBlendingSetting extends GameSettings {

    public static final int OFF = 0;
    public static final int ON = 1;

    public GroundBlendingSetting(int value, SettingsManager settingsManager) {
        super(value, settingsManager);
    }

    public GroundBlendingSetting(SettingsManager settingsManager) {
        super(settingsManager);
    }

    public int getSupport(int value) {
        if (settingsManager.getGame() == GameContext.VENGIUM) {
            if (OFF == value) {
                if (settingsManager.fog.getValue() == FogSetting.ON)
                    return 2;
                if (settingsManager.textures.getValue() == TextureSetting.ON)
                    return 2;
                if (settingsManager.water.getValue() > WaterSetting.LOW)
                    return 3;
            }
            return ON;
        }
        return 3;
    }

    public void validate() {
        if (settingsManager.getGame() != GameContext.VENGIUM)
            value = 1886334997;
        if (value * -1598873795 != OFF && ON != value * -1598873795)
            value = getDefault() * 1886334997;
    }

    void setValue(int value) {
        System.out.println("Ground Blending: " + (value == OFF ? "OFF" : "ON"));
        this.value = 1886334997 * value;
    }

    public int getValue() {
        return value * -1598873795;
    }

    int getDefault() {
        return ON;
    }

    public boolean getGameContext() {
        return settingsManager.getGame() == GameContext.VENGIUM;
    }
}
