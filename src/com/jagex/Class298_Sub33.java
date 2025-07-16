package com.jagex;/* Class298_Sub33 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub33 extends Node {
	public long aLong7385;

	public Class298_Sub33(long l) {
		aLong7385 = l * 2132790236050020951L;
	}

	static final void method3396(IComponentDefinition componentDefinition, IComponentDefinitionCollection IComponentDefinitionCollection, ScriptRuntime runtime) {
		try {
			componentDefinition.aBoolean1246 = (runtime.integerStack[(runtime.integerStackOffset -= -391880689) * 681479919]) == 1;
			StaticMethods.updateComponentTick(componentDefinition);
			if (-1309843523 * componentDefinition.slot == -1 && !IComponentDefinitionCollection.accessed)
				IComponentUpdateNode.method2750(componentDefinition.interfaceHash);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("abr.es(").append(')').toString());
		}
	}
}
