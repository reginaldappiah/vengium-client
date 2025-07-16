package com.jagex;/* Class410 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class410 {
	int anInt5285;
	int anInt5286;
	boolean aBoolean5287;
	int anInt5288;
	boolean aBoolean5289;
	static int anInt5290;

	Class410() {
		/* empty */
	}

	static final void method4980() {
			Class151.method1648(-283526771);
	}

	static final void method4981(IComponentDefinition componentDefinition, IComponentDefinitionCollection IComponentDefinitionCollection, ScriptRuntime runtime) {
			componentDefinition.color = (runtime.integerStack[(runtime.integerStackOffset -= -391880689) * 681479919]) * -695431873;
			StaticMethods.updateComponentTick(componentDefinition);
			if (componentDefinition.slot * -1309843523 == -1 && !IComponentDefinitionCollection.accessed)
				IComponentUpdateNode.appendColorUpdate(componentDefinition.interfaceHash);
	}

	static final void method4982(ScriptRuntime runtime) {
			if (ShaderProgramToolkit.aClass459_6404 == null)
				runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = -1;
			else
				runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = 1790024195 * ShaderProgramToolkit.aClass459_6404.anInt5673;
	}

	static final void method4983(ScriptRuntime runtime) {
			int i_0_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
			Class83.method944(i_0_, -1700743284);
	}

	static final void method4984(IComponentDefinition componentDefinition, ScriptRuntime runtime) {
			String string = (String) (runtime.objectStack[(runtime.objectArgs -= 969361751) * -203050393]);
			if (Class298_Sub6.method2863(string, runtime) != null)
				string = string.substring(0, string.length() - 1);
			componentDefinition.onUseOnObjHook = Class128_Sub2.method1441(string, runtime);
			componentDefinition.hasScript = true;
	}

}
