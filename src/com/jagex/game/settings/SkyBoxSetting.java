package com.jagex.game.settings;/* Class422_Sub19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.SettingsManager;

public class SkyBoxSetting extends GameSettings {

	public SkyBoxSetting(int value, SettingsManager settingsManager) {
		super(value, settingsManager);
	}

	public int getValue() {
		return -1598873795 * value;
	}

	int getDefault() {
		return 1;
	}

	int getSupport(int value) {
		return 0;
	}

	public boolean compatibleMode() {
        return GraphicsLevelSetting.isAPI(settingsManager.toolkitSetting.getValue());
    }

	public void validate() {
		if (-1598873795 * value < 0 || value * -1598873795 > 1)
			value = getDefault() * 1886334997;
	}

	public int getSupport() {
		if (!GraphicsLevelSetting.isAPI(settingsManager.toolkitSetting.getValue()))
			return 3;
		return 1;
	}

    void setValue(int value) {
		System.out.println("Skybox: " + value);
		this.value = value * 1886334997;
	}

	public SkyBoxSetting(SettingsManager settingsManager) {
		super(settingsManager);
	}

}
