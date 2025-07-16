package com.jagex.game.settings;/* Class422_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.SettingsManager;

public class RemoveRoofsSetting extends GameSettings {

	public static final int ALWAYS = 1;
	public static final int SELECTIVELY = 2;

    public RemoveRoofsSetting(int value, SettingsManager settingsManager) {
		super(value, settingsManager);
	}

	public void validate() {
			if (settingsManager.aClass422_Sub10_7548.getValue() == SELECTIVELY && -1598873795 * value == 2)
				value = 1886334997;
			if (value * -1598873795 < 0 || value * -1598873795 > SELECTIVELY)
				value = getDefault() * 1886334997;
	}

	public int getValue() {
			return value * -1598873795;
	}

	int getDefault() {
			return SELECTIVELY;
	}

	public RemoveRoofsSetting(SettingsManager settingsManager) {
		super(settingsManager);
	}

    int getSupport(int value) {
			return ALWAYS;
	}

	void setValue(int value) {
		System.out.println("Remove Roof Setting: " + (value == 1 ? "ALWAYS" : "SELECTIVELY"));
    	this.value = value * 1886334997;
	}

}
