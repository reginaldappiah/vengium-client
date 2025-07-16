package com.jagex.game.settings;/* Class422_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import com.jagex.SettingsManager;

public class FlickeringEffectsSetting extends GameSettings {

    public FlickeringEffectsSetting(SettingsManager settingsManager) {
		super(settingsManager);
	}


	void setValue(int i) {
		System.out.println("Flickering: " + value);
			value = i * 1886334997;
	}

	public int getValue() {
			return -1598873795 * value;
	}

	public void validate() {
			if (1 != -1598873795 * value && -1598873795 * value != 0)
				value = getDefault() * 1886334997;
	}

	public FlickeringEffectsSetting(int i, SettingsManager settingsManager) {
		super(i, settingsManager);
	}

	int getDefault() {
			return 1;
	}

	int getSupport(int value) {
		return 1;
	}

}
