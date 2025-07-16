package com.jagex;/* Class90 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class90 {
	Class90() throws Throwable {
		throw new Error();
	}

	static final void method995(ScriptRuntime class403, int i) {
		try {
			int i_0_ = (class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]);
			IComponentDefinition class105 = IComponentDefinition.getInterfaceComponent(i_0_);
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = class105.graphicID * 1411971043;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("dr.ru(").append(')').toString());
		}
	}

	static final void method996(ScriptRuntime runtime) {
		try {
			SettingsManager.settingsManager.setValue(SettingsManager.settingsManager.stereoSound, (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]) == 1 ? 1 : 0);
			StaticMethods.method2196();
			ToMoveSettings.encodeBuffer();
			GameClient.sentPreferences = false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("dr.aig(").append(')').toString());
		}
	}

	static final void method997(ScriptRuntime class403, int i) {
		try {
			int i_1_ = (class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]);
			String string = (String) (class403.objectStack[(class403.objectArgs -= 969361751) * -203050393]);
			if (GameClient.gameState * -1233866115 != 14 || Class315.method3837())
				class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919) - 1] = 0;
			else
				class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919) - 1] = Class372.method4589(i_1_, string) ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("dr.als(").append(')').toString());
		}
	}
}
