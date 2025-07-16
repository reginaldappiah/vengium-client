package com.jagex.game.settings;/* Class422_Sub22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.SettingsManager;

public class StereoSoundSetting extends GameSettings {

    public static final int MONO = 0;
    public static final int STEREO = 1;

    public StereoSoundSetting(SettingsManager settingsManager) {
        super(settingsManager);
    }

    public StereoSoundSetting(int value, SettingsManager settingsManager) {
        super(value, settingsManager);
    }

    public int getValue() {
        return -1598873795 * value;
    }

    void setValue(int value) {
        System.out.println("Sound Setting: " + (value == 0 ? "MONO" : "STEREO"));
        this.value = value * 1886334997;
    }

    public void validate() {
        if (-1598873795 * value != 1 && -1598873795 * value != MONO)
            value = getDefault() * 1886334997;
    }

    int getDefault() {
        return STEREO;
    }

    @Override
    int getSupport(int value) {
        return MONO;
    }

    /*
        for (Field f : this.getClass().getDeclaredFields()) {
            try {
                if (f.getInt(null) == value) {
                    System.out.println("Sound Setting: " + f.getName());
                    return;
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
     */
}
