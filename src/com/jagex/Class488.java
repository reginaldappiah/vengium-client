package com.jagex;/* Class488 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class488 {
	Class488() throws Throwable {
		throw new Error();
	}

	static final void method6166(ScriptRuntime class403, int i) {
		try {
			IComponentScripter IComponentScripter = (class403.currentInstrBool ? class403.aIComponentScripter_5247 : class403.aIComponentScripter_5246);
			IComponentDefinition class105 = IComponentScripter.componentDefinition;
			IComponentDefinitionCollection IComponentDefinitionCollection = IComponentScripter.IComponentDefinitionCollection;
			Class298_Sub33.method3396(class105, IComponentDefinitionCollection, class403);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("uc.er(").append(')').toString());
		}
	}
}
