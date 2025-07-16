package com.jagex;/* Class513 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class513 implements Interface21 {
	static Class513 aClass513_6636;
	static Class513 aClass513_6637;
	int anInt6638;
	static Class513 aClass513_6639;
	static Class513 aClass513_6640;
	static Class513 aClass513_6641;
	static Class513 aClass513_6642;
	static Class513 aClass513_6643;
	static Class513 aClass513_6644 = new Class513(0, 0, "", "");
	int anInt6645;
	String aString6646;

	public int method244() {
		return 1711922743 * this.anInt6645;
	}

	Class513(int i, int i_0_, String string, String string_1_, boolean bool, Class513[] class513s) {
		this.anInt6638 = 1902085065 * i;
		this.anInt6645 = -2023606393 * i_0_;
		this.aString6646 = string_1_;
	}

	public int getID() {
		try {
			return 1711922743 * this.anInt6645;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("vg.f(").append(')').toString());
		}
	}

	Class513(int i, int i_2_, String string, String string_3_) {
		this.anInt6638 = i * 1902085065;
		this.anInt6645 = i_2_ * -2023606393;
		this.aString6646 = string_3_;
	}

	static {
		aClass513_6637 = new Class513(1, 1, "", "");
		aClass513_6641 = new Class513(2, 2, "", "");
		aClass513_6639 = new Class513(5, 3, "", "");
		aClass513_6640 = new Class513(4, 4, "", "");
		aClass513_6636 = new Class513(3, 5, "", "");
		aClass513_6642 = new Class513(6, 6, "", "");
		aClass513_6643 = new Class513(7, -1, "", "", true, new Class513[] { aClass513_6644, aClass513_6637, aClass513_6641, aClass513_6640, aClass513_6639 });
	}

	public String toString() {
		try {
			return this.aString6646;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("vg.toString(").append(')').toString());
		}
	}

	public int method243() {
		return 1711922743 * this.anInt6645;
	}

	static final void method6292(ScriptRuntime class403, int i) {
		try {
			IComponentScripter IComponentScripter = (class403.currentInstrBool ? class403.aIComponentScripter_5247 : class403.aIComponentScripter_5246);
			IComponentDefinition class105 = IComponentScripter.componentDefinition;
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = class105.y * -749038817;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("vg.oh(").append(')').toString());
		}
	}

	static void method6293() {
		try {
			if (Class522.aClass_ra6285 != null) {
				Class522.aClass_ra6285.destroy();
				Class522.aClass_ra6285 = null;
				Class522.aClass264_6284 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("vg.b(").append(')').toString());
		}
	}
}
