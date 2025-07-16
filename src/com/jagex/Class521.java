package com.jagex;/* Class521 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class521 {
	boolean aBoolean6279;
	Class510[] aClass510Array6280;
    static int anInt6282;

	Class521(boolean bool, Class510[] class510s) {
		this.aBoolean6279 = bool;
		this.aClass510Array6280 = class510s;
	}

	static final void method6322(ScriptRuntime class403, byte i) {
		try {
			boolean bool = ((class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]) == 1);
			SettingsManager.settingsManager.setValue(SettingsManager.settingsManager.removeRoofs, bool ? 2 : 1);
			SettingsManager.settingsManager.setValue(SettingsManager.settingsManager.currentRoofs, bool ? 2 : 1);
			ToMoveSettings.updateRoofFlags();
			ToMoveSettings.encodeBuffer();
			GameClient.sentPreferences = false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("vz.ahh(").append(')').toString());
		}
	}

	public static Class146[] method6323(int i) {
		try {
			return (new Class146[] { Class146.aClass146_1569, Class146.aClass146_1565, Class146.aClass146_1566, Class146.aClass146_1567, Class146.aClass146_1568, Class146.aClass146_1572, Class146.aClass146_1573, Class146.aClass146_1564, Class146.aClass146_1570, Class146.aClass146_1571 });
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("vz.a(").append(')').toString());
		}
	}
}
