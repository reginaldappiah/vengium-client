package com.jagex;/* Class298_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub14 extends Node {
	int anInt7260;
	int anInt7261;
	int anInt7262;
	int anInt7263;
	int anInt7264;
	boolean aBoolean7265;

	Class298_Sub14(int i, int i_0_, int i_1_, int i_2_, int i_3_, boolean bool) {
		this.anInt7264 = i * -998689589;
		this.anInt7261 = -131267575 * i_0_;
		this.anInt7263 = 1972175283 * i_1_;
		this.anInt7260 = -1090405737 * i_2_;
		this.anInt7262 = i_3_ * -250335207;
		this.aBoolean7265 = bool;
	}

	static final void method2907(IComponentDefinition componentDefinition, IComponentDefinitionCollection IComponentDefinitionCollection, ScriptRuntime runtime) {
		try {
			String string = (String) (runtime.objectStack[(runtime.objectArgs -= 969361751) * -203050393]);
			if (Class298_Sub6.method2863(string, runtime) != null)
				string = string.substring(0, string.length() - 1);
			componentDefinition.anObjectArray1261 = Class128_Sub2.method1441(string, runtime);
			componentDefinition.hasScript = true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aaw.ol(").append(')').toString());
		}
	}

	static void method2908(ScriptRuntime class403, byte i) {
		try {
			int i_4_ = (class403.integerStack[681479919 * class403.integerStackOffset - 3]);
			int i_5_ = (class403.integerStack[class403.integerStackOffset * 681479919 - 2]);
			int i_6_ = (class403.integerStack[class403.integerStackOffset * 681479919 - 1]);
			class403.integerStackOffset -= -1175642067;
			if (i_4_ > class403.arrayLengths[i_5_])
				throw new RuntimeException();
			if (i_4_ > class403.arrayLengths[i_6_])
				throw new RuntimeException();
			if (i_5_ == i_6_)
				throw new RuntimeException();
			Class82_Sub17.method920((class403.arrays[i_5_]), (class403.arrays[i_6_]), 0, i_4_ - 1, -8746626);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aaw.apb(").append(')').toString());
		}
	}
}
