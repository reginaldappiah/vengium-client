package com.jagex;/* Class83 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class83 {
	static IComponentDefinition[] updatingWidgetComponents;
	static String userDirectory;

	Class83() throws Throwable {
		throw new Error();
	}

	static final void method942(ScriptRuntime class403, byte i) {
		try {
			IComponentScripter IComponentScripter = (class403.currentInstrBool ? class403.aIComponentScripter_5247 : class403.aIComponentScripter_5246);
			IComponentDefinition class105 = IComponentScripter.componentDefinition;
			IComponentDefinitionCollection IComponentDefinitionCollection = IComponentScripter.IComponentDefinitionCollection;
			Class257.method2451(class105, IComponentDefinitionCollection, class403);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("dj.on(").append(')').toString());
		}
	}

	static final void method943(ScriptRuntime class403, int i) {
		try {
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = class403.aClass162_5252.anInt1649 * -2079715533;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("dj.xz(").append(')').toString());
		}
	}

	public static void method944(int i, int i_0_) {
		try {
			Class301_Sub1.anInt7633 = -2138103821;
			Class301_Sub1.anInt7630 = i * 1998014133;
			Class137_Sub1.anInt6991 = -189172599;
			Class88.anInt810 = -338630500;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("dj.cg(").append(')').toString());
		}
	}
}
