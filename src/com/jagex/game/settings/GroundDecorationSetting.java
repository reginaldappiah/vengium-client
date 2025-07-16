package com.jagex.game.settings;/* Class422_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.GameContext;
import com.jagex.SettingsManager;

public class GroundDecorationSetting extends GameSettings {

    public GroundDecorationSetting(SettingsManager settingsManager) {
        super(settingsManager);
    }

    public GroundDecorationSetting(int value, SettingsManager settingsManager) {
        super(value, settingsManager);
    }

    public void validate() {
        if (settingsManager.getGame() != GameContext.VENGIUM)
            value = 1886334997;
        if (0 != -1598873795 * value && 1 != value * -1598873795)
            value = getDefault() * 1886334997;
    }

    public boolean method5628() {
        return settingsManager.getGame() == GameContext.VENGIUM;
    }

    public int getSupport(int value) {
        if (settingsManager.getGame() == GameContext.VENGIUM)
            return 1;
        return 3;
    }

    int getDefault() {
        return 1;
    }

    public int getValue() {
        return value * -1598873795;
    }

    void setValue(int i) {
        value = 1886334997 * i;
    }

}
