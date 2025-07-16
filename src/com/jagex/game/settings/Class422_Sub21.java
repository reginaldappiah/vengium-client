package com.jagex.game.settings;/* Class422_Sub21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.SettingsManager;
import com.jagex.ToolkitOption;

public class Class422_Sub21 extends GameSettings {

	int getSupport(int value) {
			if (value == ToolkitOption.PUREJAVA)
				return ToolkitOption.OPENGL;
			if (settingsManager.getEnvironment().getAvailableCPU() < 2)
				return ToolkitOption.DIRECTXSPECIAL;
			int toolkitID = settingsManager.desiredToolkit.getValue();
			if (ToolkitOption.DIRECTXSPECIAL != toolkitID && toolkitID != ToolkitOption.OPENGLSPECIAL)
				return ToolkitOption.DIRECTXSPECIAL;
			return 1;
	}

	public Class422_Sub21(int value, SettingsManager settingsManager) {
		super(value, settingsManager);
	}

    int getDefault() {
			int value = settingsManager.desiredToolkit.getValue();
			if (3 != value && value != 5)
				return 0;
			return 0;
	}

	public void validate() {
			int toolkitID = settingsManager.desiredToolkit.getValue();
			if (toolkitID != ToolkitOption.DIRECTXSPECIAL && toolkitID != ToolkitOption.OPENGLSPECIAL)
				this.value = 0;
			if (settingsManager.getEnvironment().getAvailableCPU() < 2)
				this.value = 0;
			if (this.value * -1598873795 != 0 && 1 != this.value * -1598873795)
				this.value = getDefault() * 1886334997;
	}

	void setValue(int value) {
		System.out.println("SUB21: " + value);
			this.value = value * 1886334997;
	}

	public Class422_Sub21(SettingsManager settingsManager) {
		super(settingsManager);
	}

	public int getValue() {
			return value * -1598873795;
	}

}
