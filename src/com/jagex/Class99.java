package com.jagex;/* Class99 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class99 {
	public static Class517 aClass517_951;
	Class99() throws Throwable {
		throw new Error();
	}

	static final void method1070(ScriptRuntime runtime) {
		try {
			runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393 - 1)] = (runtime.script.objectOperands[1883543357 * runtime.integerPos]);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("e.w(").append(')').toString());
		}
	}

	static final void method1071(ScriptRuntime runtime) {
		try {
			runtime.integerStackOffset -= -783761378;
			if ((runtime.integerStack[runtime.integerStackOffset * 681479919 + 1]) == (runtime.integerStack[runtime.integerStackOffset * 681479919]))
				runtime.integerPos += ((runtime.integerstack[1883543357 * runtime.integerPos]) * 286750741);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("e.l(").append(')').toString());
		}
	}

	static final void method1072(ScriptRuntime class403, byte i) {
		try {
			SettingsManager.settingsManager.setValue(SettingsManager.settingsManager.water, (class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]) == 1 ? 2 : 0);
			GameClient.myRegion.method2667();
			ToMoveSettings.encodeBuffer();
			GameClient.sentPreferences = false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("e.aik(").append(')').toString());
		}
	}
}
