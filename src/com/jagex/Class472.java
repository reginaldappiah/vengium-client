package com.jagex;/* Class472 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class472 {
	int anInt5960;
	int anInt5961;
	int anInt5962;
	int anInt5963;
	int anInt5964;
	public static ConfigDefinitionLoader configLoader;

	public int hashCode() {
		try {
			return this.anInt5962 * -211035667;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("tl.hashCode(").append(')').toString());
		}
	}

	Class472(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		this.anInt5962 = i * -1875874843;
		this.anInt5961 = -1675562787 * i_0_;
		this.anInt5960 = i_1_ * -1764081097;
		this.anInt5963 = i_2_ * -531314479;
		this.anInt5964 = -2080773359 * i_3_;
	}

	static Class334 method6063(int i, int i_4_, int i_5_, ModelToolkit modelToolkit) {
		try {
			if (null == modelToolkit)
				return null;
			Class334 class334 = new Class334(i, i_4_, i_5_, modelToolkit.N(), modelToolkit.RA(), modelToolkit.ya(), modelToolkit.YA(), modelToolkit.o(), modelToolkit.AA(), modelToolkit.ha());
			return class334;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("tl.dp(").append(')').toString());
		}
	}

	public static int method6064(int i, int i_7_, int i_8_, byte i_9_) {
		try {
			i_8_ &= 0x3;
			if (i_8_ == 0)
				return i_7_;
			if (1 == i_8_)
				return 7 - i;
			if (i_8_ == 2)
				return 7 - i_7_;
			return i;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("tl.f(").append(')').toString());
		}
	}

	static final void method6065(IComponentDefinition class105, IComponentDefinitionCollection IComponentDefinitionCollection, ScriptRuntime class403, int i) {
		try {
			String string = (String) (class403.objectStack[(class403.objectArgs -= 969361751) * -203050393]);
			if (Class298_Sub6.method2863(string, class403) != null)
				string = string.substring(0, string.length() - 1);
			class105.anObjectArray1164 = Class128_Sub2.method1441(string, class403);
			class105.hasScript = true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("tl.nq(").append(')').toString());
		}
	}
}
