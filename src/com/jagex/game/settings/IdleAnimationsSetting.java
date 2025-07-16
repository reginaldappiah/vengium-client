package com.jagex.game.settings;/* Class422_Sub25 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.GameContext;
import com.jagex.SettingsManager;

public class IdleAnimationsSetting extends GameSettings {

    public static final int FEW = 0;
    public static final int MANY = 1;
    public static final int ALL = 2;

    public IdleAnimationsSetting(int value, SettingsManager settingsManager) {
        super(value, settingsManager);
    }

    public IdleAnimationsSetting(SettingsManager settingsManager) {
        super(settingsManager);
    }

    public int getValue() {
        return -1598873795 * value;
    }

    public void validate() {
        if (settingsManager.getGame() == GameContext.stellardawn)
            value = -522297302;
        if (value * -1598873795 < FEW || value * -1598873795 > ALL)
            value = getDefault() * 1886334997;
    }

    int getDefault() {
        return MANY;
    }

    int getSupport(int value) {
        return MANY;
    }

    void setValue(int value) {
        System.out.println("Idle Animation: " + (value == ALL ? "ALL" : value == MANY ? "MANY" : "FEW"));
        this.value = 1886334997 * value;
    }


}
