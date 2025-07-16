package com.jagex;/* Class421 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class421 {
	Class421() throws Throwable {
		throw new Error();
	}

	static final void method5609(ScriptRuntime class403, byte i) {
		try {
			IComponentScripter IComponentScripter = (class403.currentInstrBool ? class403.aIComponentScripter_5247 : class403.aIComponentScripter_5246);
			IComponentDefinition class105 = IComponentScripter.componentDefinition;
			IComponentDefinitionCollection IComponentDefinitionCollection = IComponentScripter.IComponentDefinitionCollection;
			ToMoveIComponentScripts.method2317(class105, class403);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("rl.nn(").append(')').toString());
		}
	}
}
