package com.jagex;/* Class177 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class177 {
	public int anInt1787;
	public Class298_Sub37_Sub14 aClass298_Sub37_Sub14_1788;
	public int[] anIntArray1789;

	static final void method1831(ScriptRuntime class403, byte i) {
		try {
			int i_0_ = (class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]);
			IComponentDefinition class105 = IComponentDefinition.getInterfaceComponent(i_0_);
			IComponentDefinitionCollection IComponentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[i_0_ >> 16];
			ToMoveIComponentScripts.method5865(class105, class403);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("hj.kg(").append(')').toString());
		}
	}

	static final void method1832(ScriptRuntime class403, int i) {
		try {
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = SettingsManager.settingsManager.lighting.getValue() == 1 ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("hj.ajs(").append(')').toString());
		}
	}

	static final void method1833(ScriptRuntime runtime) {
		try {
			int i_1_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
			if (IComponentDefinition.getIComponentDefinitionCollections[i_1_] == null)
				runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = 0;
			else
				runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = (IComponentDefinition.getIComponentDefinitionCollections[i_1_].componentDefinitions).length;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("hj.alg(").append(')').toString());
		}
	}
}
