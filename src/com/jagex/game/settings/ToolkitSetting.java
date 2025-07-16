package com.jagex.game.settings;/* Class422_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.SettingsManager;
import com.jagex.ToolkitOption;
import com.jagex.game.cache.config.prefetch.JS5PrefetchType;

public class ToolkitSetting extends GameSettings {
	public boolean defaultValue;
	public boolean live = true;

	public ToolkitSetting(int value, SettingsManager settingsManager) {
		super(value, settingsManager);
		defaultValue = false;
	}

	int getDefault() {
			defaultValue = true;
			return ToolkitOption.SSE;
	}

	public int getValue() {
			return value * -1598873795;
	}

	public int getSupport(int value) {
			if (value == ToolkitOption.DIRECTXSPECIAL && !JS5PrefetchType.getPrefetch().isLoaded("jagdx"))
				return ToolkitOption.DIRECTXSPECIAL;
			return ToolkitOption.SSE;
	}

	void setValue(int value) {
		System.out.println("Toolkit: " + value);
			defaultValue = false;
			this.value = value * 1886334997;
	}

	public void validate() {
			if (value * -1598873795 < ToolkitOption.PUREJAVA || -1598873795 * value > ToolkitOption.OPENGLSPECIAL)
				value = getDefault() * 1886334997;
	}

	public boolean method5679() {
			return this.live;
	}

	public void setLive(boolean live) {
			this.live = live;
	}

	public ToolkitSetting(SettingsManager settingsManager) {
		super(settingsManager);
		defaultValue = false;
	}

	public boolean method5681() {
			return true;
	}

}
