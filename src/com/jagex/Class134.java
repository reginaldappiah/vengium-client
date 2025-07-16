package com.jagex;/* Class134 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class134 implements Interface5 {
	public int anInt6332;
	public int anInt6333;
	public int anInt6334;
	public int anInt6335;
	public Class139 aClass139_6336;
	public Class133 aClass133_6337;
	public int anInt6338;
	public int anInt6339;
	public int anInt6340;
	public int anInt6341;
	public boolean aBoolean6342;
	static int anInt6343;

	public Class146 method49(int i) {
		try {
			return Class146.aClass146_1568;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("fk.f(").append(')').toString());
		}
	}

	public Class146 method50() {
		return Class146.aClass146_1568;
	}

	public Class146 method51() {
		return Class146.aClass146_1568;
	}

	Class134(int i, Class139 class139, Class133 class133, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, boolean bool) {
		anInt6341 = 846852233 * i;
		aClass139_6336 = class139;
		aClass133_6337 = class133;
		anInt6333 = 1894702875 * i_0_;
		anInt6335 = 943071961 * i_1_;
		anInt6339 = i_2_ * -415795561;
		anInt6340 = 245978315 * i_3_;
		anInt6332 = i_4_ * 337066221;
		anInt6334 = 236352403 * i_5_;
		anInt6338 = i_6_ * 680370675;
		aBoolean6342 = bool;
	}

	static final void method1487(ScriptRuntime runtime) {
		try {
			IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
			IComponentDefinition class105 = IComponentScripter.componentDefinition;
			IComponentDefinitionCollection IComponentDefinitionCollection = IComponentScripter.IComponentDefinitionCollection;
			ToMoveIComponentScripts.method365(class105, IComponentDefinitionCollection, true, 2, runtime);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("fk.hv(").append(')').toString());
		}
	}

	static final void method1488(ScriptRuntime class403, int i) {
		try {
			IComponentScripter IComponentScripter = (class403.currentInstrBool ? class403.aIComponentScripter_5247 : class403.aIComponentScripter_5246);
			IComponentDefinition class105 = IComponentScripter.componentDefinition;
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = GameClient.getComponentSettings(class105).method3497();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("fk.ph(").append(')').toString());
		}
	}

	public static void method1489(byte i) {
		try {
			Class79.aClass298_Sub19_Sub1_737.method2959();
			Class79.anInt734 = -1262101671;
			Class79.JS5_MUSIC = null;
			Class79.aClass298_Sub19_Sub1_748 = null;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("fk.posX(").append(')').toString());
		}
	}
}
