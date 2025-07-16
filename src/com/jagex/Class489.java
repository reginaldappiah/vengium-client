package com.jagex;/* Class489 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class489 {
	static int anInt6070 = 3;
	public static int anInt6071;

	Class489() throws Throwable {
		throw new Error();
	}

	static boolean method6167() {
		try {
			return null != Class525.aClass486_6298;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ud.b(").append(')').toString());
		}
	}

	static final void method6168(ScriptRuntime class403, int i) {
		try {
			IComponentScripter IComponentScripter = (class403.currentInstrBool ? class403.aIComponentScripter_5247 : class403.aIComponentScripter_5246);
			IComponentDefinition class105 = IComponentScripter.componentDefinition;
			IComponentDefinitionCollection IComponentDefinitionCollection = IComponentScripter.IComponentDefinitionCollection;
			ToMoveIComponentScripts.method714(class105, IComponentDefinitionCollection, class403);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ud.gj(").append(')').toString());
		}
	}
}
