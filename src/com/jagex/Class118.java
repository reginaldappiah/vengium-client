package com.jagex;/* Class118 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.Js5Configs;

public final class Class118 {
	static String aString1400 = "#";
	static int anInt1401;
	static Class88 aClass88_1402;

	Class118() throws Throwable {
		throw new Error();
	}

	static final void method1286(ScriptRuntime class403, int i) {
		try {
			class403.integerStackOffset -= -783761378;
			if ((class403.integerStack[681479919 * class403.integerStackOffset]) < (class403.integerStack[681479919 * class403.integerStackOffset + 1]))
				class403.integerPos += (286750741 * (class403.integerstack[1883543357 * class403.integerPos]));
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("eu.ax(").append(')').toString());
		}
	}

	static final void method1287(ScriptRuntime class403, int i) {
		try {
			IComponentScripter IComponentScripter = (class403.currentInstrBool ? class403.aIComponentScripter_5247 : class403.aIComponentScripter_5246);
			IComponentDefinition class105 = IComponentScripter.componentDefinition;
			IComponentDefinitionCollection IComponentDefinitionCollection = IComponentScripter.IComponentDefinitionCollection;
			Class410.method4981(class105, IComponentDefinitionCollection, class403);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("eu.dq(").append(')').toString());
		}
	}

	static final void method1288(IComponentDefinition component, ScriptRuntime runtime) {
			String string = (String) (runtime.objectStack[(runtime.objectArgs -= 969361751) * -203050393]);
			if (Class298_Sub6.method2863(string, runtime) != null)
				string = string.substring(0, string.length() - 1);
			component.onClickHook = Class128_Sub2.method1441(string, runtime);
			component.hasScript = true;
	}

	static final void method1289(ScriptRuntime class403, int i) {
		try {
			class403.integerStackOffset -= -783761378;
			int i_0_ = (class403.integerStack[class403.integerStackOffset * 681479919]);
			int i_1_ = (class403.integerStack[class403.integerStackOffset * 681479919 + 1]);
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = i_0_ | i_1_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("eu.zp(").append(')').toString());
		}
	}

	static final void method1290(ScriptRuntime runtime) {
		try {
			int i_2_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
			runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = (Js5Configs.itemList.getItemDefinitions(i_2_).unknown2) * 1671807857;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("eu.aao(").append(')').toString());
		}
	}

	static final void method1291(ScriptRuntime class403, byte i) {
		try {
			Class343_Sub1 class343_sub1 = Class343_Sub1.method4716();
			if (class343_sub1 != null) {
				class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919) - 1] = class343_sub1.anInt7717 * -15394297;
				class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919) - 1] = -877023375 * class343_sub1.anInt3670;
				class403.objectStack[((class403.objectArgs += 969361751) * -203050393) - 1] = class343_sub1.aString7719;
				Class353 class353 = class343_sub1.method4163();
				class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919) - 1] = 1675394033 * class353.anInt3820;
				class403.objectStack[((class403.objectArgs += 969361751) * -203050393) - 1] = class353.aString3819;
				class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919) - 1] = class343_sub1.anInt3666 * -945794709;
				class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919) - 1] = class343_sub1.address * 512449113;
				class403.objectStack[((class403.objectArgs += 969361751) * -203050393) - 1] = class343_sub1.aString7718;
			} else {
				class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919) - 1] = -1;
				class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919) - 1] = 0;
				class403.objectStack[((class403.objectArgs += 969361751) * -203050393) - 1] = "";
				class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919) - 1] = 0;
				class403.objectStack[((class403.objectArgs += 969361751) * -203050393) - 1] = "";
				class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919) - 1] = 0;
				class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919) - 1] = 0;
				class403.objectStack[((class403.objectArgs += 969361751) * -203050393) - 1] = "";
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("eu.alb(").append(')').toString());
		}
	}

	static final void method1292(ScriptRuntime class403, byte i) {
		try {
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = (class403.aClass162_5252.method1751((String) (class403.objectStack[((class403.objectArgs -= 969361751) * -203050393)]), 131072));
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("eu.xt(").append(')').toString());
		}
	}

	public static void method1293(int i, int i_3_, int i_4_) {
		try {
			Class301_Sub1.anInt7632 = (i - Class301_Sub1.mapX) * -433609607;
			Class301_Sub1.anInt7627 = (i_3_ - Class301_Sub1.mapY) * -789877945;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("eu.ct(").append(')').toString());
		}
	}

	static final void method1294(ScriptRuntime class403, int i) {
		try {
			IComponentScripter IComponentScripter = (class403.currentInstrBool ? class403.aIComponentScripter_5247 : class403.aIComponentScripter_5246);
			IComponentDefinition class105 = IComponentScripter.componentDefinition;
			IComponentDefinitionCollection IComponentDefinitionCollection = IComponentScripter.IComponentDefinitionCollection;
			Class135.method1490(class105, IComponentDefinitionCollection, class403, 852607331);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("eu.gq(").append(')').toString());
		}
	}
}
