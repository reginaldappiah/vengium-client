package com.jagex;/* Class407 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class407 {

	static int optimizeGraphicsMode() {
			int mode;
			if (1126040225 * GameShell.maximumMemory >= 96) {
				int loadingTime = StaticMethods.getSceneLoadingTime();
				if (loadingTime <= 101) {
					SettingsManager.loadHighSettings();
					mode = 4;
				} else if (loadingTime <= 503) {
					SettingsManager.loadMediumSettings();
					mode = 3;
				} else if (loadingTime <= 1003) {
					SettingsManager.loadLowSettings();
					mode = 2;
				} else {
					SettingsManager.loadMinimumSettings();
					mode = 1;
				}
			} else {
				SettingsManager.loadMinimumSettings();
				mode = 1;
			}
			if (SettingsManager.settingsManager.toolkitSetting.getValue() != ToolkitOption.PUREJAVA) {
				SettingsManager.settingsManager.setValue(SettingsManager.settingsManager.desiredToolkit, ToolkitOption.PUREJAVA);
				Class370.loadingPleaseWait(ToolkitOption.PUREJAVA, false);
			} else
				SettingsManager.settingsManager.setLive(SettingsManager.settingsManager.toolkitSetting, true);
			ToMoveSettings.encodeBuffer();
			return mode;
	}
}
