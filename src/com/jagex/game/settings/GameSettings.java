package com.jagex.game.settings;

import com.jagex.SettingsManager;
import com.jagex.ToolkitOption;

public abstract class GameSettings {
	protected SettingsManager settingsManager;
	protected int value;

	abstract int getDefault();

	abstract int getSupport(int value);

	public void set(int value) {
			if (getSupport(value) != 3)
				setValue(value);
	}

	abstract void setValue(int value);
	
	public GameSettings(SettingsManager settingsManager) {
		this.settingsManager = settingsManager;
		value = getDefault() * 1886334997;
	}

	public GameSettings(int value, SettingsManager settingsManager) {
		this.value = value * 1886334997;
		this.settingsManager = settingsManager;
	}

}
