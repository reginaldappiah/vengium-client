package com.jagex.game.settings;/* Class422_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.SettingsManager;

public class Class422_Sub10 extends GameSettings {

	public Class422_Sub10(SettingsManager settingsManager) {
		super(settingsManager);
	}

	public void validate() {
			if (value * -1598873795 < 0 || -1598873795 * value > 2)
				value = getDefault() * 1886334997;
	}

	int getDefault() {
			return 0;
	}

	public boolean method5660() {
			return true;
	}

	public int getValue() {
			return -1598873795 * value;
	}

	public int getSupport(int value) {
			if (value == 2)
				return 2;
			return 1;
	}

	public Class422_Sub10(int value, SettingsManager settingsManager) {
		super(value, settingsManager);
	}

	void setValue(int value) {
		System.out.println("SUB10: " + value);
			this.value = 1886334997 * value;
	}

}
