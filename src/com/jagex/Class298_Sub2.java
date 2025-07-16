package com.jagex;/* Class298_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub2 extends Node {
    public Class453 aClass453_7166 = new Class453();
	static Class298_Sub19_Sub1 aClass298_Sub19_Sub1_7167;

	Class298_Sub2() {
		/* empty */
	}

	static final void method2847(int i, int i_0_, int i_1_, int i_2_, byte i_3_) {
		try {
			if (i - i_1_ >= Class372_Sub1.anInt4051 * -1424479739 && i_1_ + i <= Class372_Sub1.anInt4048 * 1135094847 && i_0_ - i_1_ >= Class372_Sub1.anInt4049 * 1155384281 && i_0_ + i_1_ <= Class372_Sub1.anInt4050 * -1062447355)
				StaticMethods.method5797(i, i_0_, i_1_, i_2_);
			else
				Class308.method3782(i, i_0_, i_1_, i_2_, 179222192);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aad.posX(").append(')').toString());
		}
	}

	static final void method2848(ScriptRuntime class403, int i) {
		try {
			IComponentScripter IComponentScripter = (class403.currentInstrBool ? class403.aIComponentScripter_5247 : class403.aIComponentScripter_5246);
			IComponentDefinition class105 = IComponentScripter.componentDefinition;
			IComponentDefinitionCollection IComponentDefinitionCollection = IComponentScripter.IComponentDefinitionCollection;
			Class194.method1870(class105, IComponentDefinitionCollection, class403, (byte) -5);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aad.jo(").append(')').toString());
		}
	}

	static final void method2849(ScriptRuntime runtime) {
		try {
			int i_4_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
			IComponentDefinition class105 = IComponentDefinition.getInterfaceComponent(i_4_);
			IComponentDefinitionCollection IComponentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[i_4_ >> 16];
			ScriptInstructions.method2393(class105, IComponentDefinitionCollection, runtime);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aad.ij(").append(')').toString());
		}
	}

	static final void method2850(ScriptRuntime class403, int i) {
		try {
			int i_5_ = (class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]);
			class403.objectStack[((class403.objectArgs += 969361751) * -203050393 - 1)] = Integer.toString(i_5_);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aad.ze(").append(')').toString());
		}
	}
}
