package com.jagex.game.settings;
import com.jagex.SettingsManager;

public class CustomCursorSetting extends GameSettings {

	public CustomCursorSetting(SettingsManager settingsManager) {
		super(settingsManager);
	}

	int getDefault() {
			return 1;
	}

	int getSupport(int value) {
		return 0;
	}

	void setValue(int value) {
		System.out.println("Custom Cursor: " + value);
			this.value = value * 1886334997;
	}

	public int getValue() {
			return -1598873795 * value;
	}

	public void validate() {
			if (value * -1598873795 != 1 && -1598873795 * value != 0)
				value = getDefault() * 1886334997;
	}

	public CustomCursorSetting(int value, SettingsManager settingsManager) {
		super(value, settingsManager);
	}

}
