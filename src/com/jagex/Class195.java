package com.jagex;/* Class195 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class195 {
	public static int anInt1985 = 718;
	public static int anInt1986 = 1;

	Class195() throws Throwable {
		throw new Error();
	}

	static final void method1871(ScriptRuntime class403, int i) {
		try {
			class403.integerStackOffset -= -783761378;
			if ((class403.integerStack[1 + class403.integerStackOffset * 681479919]) != (class403.integerStack[class403.integerStackOffset * 681479919]))
				class403.integerPos += (286750741 * (class403.integerstack[class403.integerPos * 1883543357]));
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ig.o(").append(')').toString());
		}
	}

	static final void method1872(ScriptRuntime runtime) {
		try {
			IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
			IComponentDefinition class105 = IComponentScripter.componentDefinition;
			IComponentDefinitionCollection IComponentDefinitionCollection = IComponentScripter.IComponentDefinitionCollection;
			ScriptInstructions.method2393(class105, IComponentDefinitionCollection, runtime);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ig.ix(").append(')').toString());
		}
	}

	public static int method1873(int i, int i_0_) {
		try {
			i_0_ = i_0_ * (i & 0x7f) >> 7;
			if (i_0_ < 2)
				i_0_ = 2;
			else if (i_0_ > 126)
				i_0_ = 126;
			return (i & 0xff80) + i_0_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ig.k(").append(')').toString());
		}
	}
}
