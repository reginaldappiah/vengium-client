package com.jagex.game.settings;/* Class422_Sub23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.SettingsManager;
import com.jagex.ToolkitOption;

public class GraphicsLevelSetting extends GameSettings {

    public GraphicsLevelSetting(int value, SettingsManager settingsManager) {
        super(value, settingsManager);
    }

    public GraphicsLevelSetting(SettingsManager settingsManager) {
        super(settingsManager);
    }

    public static boolean isAPI(int toolkitID) {
        return toolkitID == ToolkitOption.OPENGL || toolkitID == ToolkitOption.DIRECTXSPECIAL || toolkitID == ToolkitOption.OPENGLSPECIAL;
    }

    int getSupport(int value) {
        return 1;
    }

    public void validate() {
        if (-1598873795 * value < 0 || -1598873795 * value > 4)
            value = getDefault() * 1886334997;
    }

    int getDefault() {
        return 0;
    }

    public int getValue() {
        return value * -1598873795;
    }

    void setValue(int value) {
        System.out.println("Graphics Level: " + value);
        this.value = 1886334997 * value;
    }

}
