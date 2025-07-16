package com.jagex.game.settings;/* Class422_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.Class148;
import com.jagex.SettingsManager;

public class ParticleSetting extends GameSettings {

	public int getValue() {
			return -1598873795 * value;
	}

	public ParticleSetting(int value, SettingsManager settingsManager) {
		super(value, settingsManager);
		Class148.method1612(-1598873795 * this.value);
	}

	public void validate() {
			if (settingsManager.getEnvironment().getMaximumMemory() < 245)
				value = 0;
			if (-1598873795 * value < 0 || -1598873795 * value > 2)
				value = getDefault() * 1886334997;
		}

    public int getSupport(int value) {
			if (settingsManager.getEnvironment().getMaximumMemory() < 245)
				return 3;
			return 1;
	}

	void setValue(int value) {
		System.out.println("Particles: " + value);
			this.value = value * 1886334997;
			Class148.method1612(-1598873795 * this.value);
	}

	public ParticleSetting(SettingsManager settingsManager) {
		super(settingsManager);
		Class148.method1612(value * -1598873795);
	}

    int getDefault() {
			if (settingsManager.getEnvironment().getMaximumMemory() < 245)
				return 0;
			return 2;
	}

	public boolean hasExcessMemory() {
            return settingsManager.getEnvironment().getMaximumMemory() >= 245;
	}

}
