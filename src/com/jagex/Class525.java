package com.jagex;/* Class525 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class525 {
	static int anInt6295 = 0;
	static int anInt6296 = 3;
	static int anInt6297 = 0;
	static Js5CacheWrite aClass486_6298;
	static Class412 aClass412_6299;
	public static boolean aBoolean6300;

	Class525() throws Throwable {
		throw new Error();
	}

	static final void method6378(ScriptRuntime class403, int i) {
		try {
			IComponentScripter IComponentScripter = (class403.currentInstrBool ? class403.aIComponentScripter_5247 : class403.aIComponentScripter_5246);
			IComponentDefinition class105 = IComponentScripter.componentDefinition;
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = class105.yOffset * -1523987341;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("z.pa(").append(')').toString());
		}
	}

	public static int method6379(CharSequence charsequence) {
			int length = charsequence.length();
			int i_1_ = 0;
			for (int index = 0; index < length; index++)
				i_1_ = (i_1_ << 5) - i_1_ + charsequence.charAt(index);
			return i_1_;
	}

	static final void method6380(ScriptRuntime class403, int i) {
		try {
			int i_3_ = (class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]);
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = SettingsManager.settingsManager.modShadows.getSupport(i_3_);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("z.aoe(").append(')').toString());
		}
	}
}
