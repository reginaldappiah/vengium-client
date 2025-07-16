package com.jagex.game.settings;/* Class422_Sub27 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.SettingsManager;

public class SafeModeSetting extends GameSettings {

	public SafeModeSetting(int value, SettingsManager settingsManager) {
		super(value, settingsManager);
	}

	public SafeModeSetting(SettingsManager settingsManager) {
		super(settingsManager);
	}

    int getSupport(int value) {
			return 1;
	}

	void setValue(int value) {
		System.out.println("SafeMode: " + value);
			this.value = value * 1886334997;
	}

	public int getValue() {
			return -1598873795 * value;
	}

    int getDefault() {
			return 0;
	}

	public void validate() {
			if (1 != -1598873795 * value && value * -1598873795 != 0)
				value = getDefault() * 1886334997;
	}

}
