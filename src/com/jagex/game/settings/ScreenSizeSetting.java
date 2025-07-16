package com.jagex.game.settings;/* Class422_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.Class357;
import com.jagex.GameClient;
import com.jagex.SettingsManager;

public class ScreenSizeSetting extends GameSettings {

    public static final int FIXED = 1;
    public static final int RESIZABLE = 2;
    public static final int FULLSCREEN = 3;

    public ScreenSizeSetting(int value, SettingsManager settingsManager) {
        super(value, settingsManager);
    }

    public ScreenSizeSetting(SettingsManager settingsManager) {
        super(settingsManager);
    }

    public static final void setFullscreen() {
        if (GameClient.fullscreen && GameClient.fullScreenFrame != null)
            Class357.method4276(SettingsManager.settingsManager.screenSize
                            .getValue(),
                    -1, -1, false);
    }

    int getDefault() {
        return (settingsManager.getEnvironment().method5593() ? FULLSCREEN : RESIZABLE);
    }

    int getSupport(int value) {
        return FIXED;
    }

    public int getValue() {
        return -1598873795 * value;
    }

    void setValue(int value) {
        System.out.println("Screen size: " + value);
        this.value = value * 1886334997;
    }

    public void validate() {
        if (value * -1598873795 < FIXED || -1598873795 * value > FULLSCREEN)
            value = getDefault() * 1886334997;
    }

}
