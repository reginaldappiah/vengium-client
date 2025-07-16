package com.jagex;/* Class128_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class128_Sub1 extends Class128 {
	public int anInt8553;
	public int anInt8554;
	public static Buffer playerAppearence;
	static int anInt8556;
	public static int anInt8557;

	public Class146 method49(int i) {
		try {
			return Class146.aClass146_1566;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("zp.f(").append(')').toString());
		}
	}

	Class128_Sub1(Class139 class139, Class133 class133, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_) {
		super(class139, class133, i, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_);
		anInt8554 = i_7_ * -1922246779;
		anInt8553 = i_8_ * 957497283;
	}

	public Class146 method51() {
		return Class146.aClass146_1566;
	}

	public Class146 method50() {
		return Class146.aClass146_1566;
	}

	static int method1439(int toolkitMode, int i_9_) {
		System.out.println("RAM?: " + i_9_);
			int i_11_;
			if (i_9_ > 20074) {
				SettingsManager.loadHighSettings();
				i_11_ = 4;
			} else if (i_9_ > 10033) {
				SettingsManager.loadMediumSettings();
				i_11_ = 3;
			} else if (i_9_ > 5030) {
				SettingsManager.loadLowSettings();
				i_11_ = 2;
			} else {
				SettingsManager.loadMinimumSettings();
				i_11_ = 1;
			}
			if (SettingsManager.settingsManager.toolkitSetting.getValue() != toolkitMode) {
				SettingsManager.settingsManager.setValue(SettingsManager.settingsManager.desiredToolkit, toolkitMode);
				Class370.loadingPleaseWait(toolkitMode, false);
			} else
				SettingsManager.settingsManager.setLive(SettingsManager.settingsManager.toolkitSetting, true);
			ToMoveSettings.encodeBuffer();
			return i_11_;
	}

	public static String method1440(int i, boolean bool, byte i_12_) {
		try {
			if (!bool || i < 0)
				return Integer.toString(i);
			return Class321.method3923(i, 10, bool);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("zp.u(").append(')').toString());
		}
	}
}
