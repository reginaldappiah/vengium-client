package com.jagex.game.settings;/* Class422_Sub26 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.SettingsManager;

public class CPUUsageSetting extends GameSettings {

	public CPUUsageSetting(int value, SettingsManager settingsManager) {
		super(value, settingsManager);
	}

	int getDefault() {
			if (settingsManager.getEnvironment().getAvailableCPU() > 1)
				return 4;
			return 2;
	}

	int getSupport(int value) {
			return 1;
	}

	void setValue(int value) {
		System.out.println("CPU Usage: " + value);
			this.value = value * 1886334997;
	}

	public int getValue() {
			return -1598873795 * value;
	}

	public void validate() {
			if (value * -1598873795 < 0 && value * -1598873795 > 4)
				value = getDefault() * 1886334997;
	}

    public CPUUsageSetting(SettingsManager settingsManager) {
		super(settingsManager);
	}

}
