package com.jagex;/* Class298_Sub37_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub37_Sub2 extends Cacheable {
	Projectile aClass365_Sub1_Sub1_Sub1_9577;

	public Class298_Sub37_Sub2(Projectile class365_sub1_sub1_sub1) {
		this.aClass365_Sub1_Sub1_Sub1_9577 = class365_sub1_sub1_sub1;
	}

	static final void method3411(ScriptRuntime runtime) {
		try {
			IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
			IComponentDefinition class105 = IComponentScripter.componentDefinition;
			IComponentDefinitionCollection IComponentDefinitionCollection = IComponentScripter.IComponentDefinitionCollection;
			ToMoveIComponentScripts.method2230(class105, runtime);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aid.jy(").append(')').toString());
		}
	}
}
