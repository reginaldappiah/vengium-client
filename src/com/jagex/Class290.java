package com.jagex;/* Class290 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class290 {
	static int anInt3156 = 62;
	static int anInt3157 = 2;
	static int anInt3158 = 16;
	static int anInt3159 = 1;
	static int anInt3160 = 8;
	static int anInt3161 = 63;

	Class290() throws Throwable {
		throw new Error();
	}

	static final void method2747(ScriptRuntime runtime) {
		try {
			IComponentDefinition class105 = IComponentDefinition.getInterfaceComponent((runtime.integerStack[(runtime.integerStackOffset -= -391880689) * 681479919]));
			if (-1232467723 * class105.itemID != -1)
				runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = -66163287 * class105.itemQuantity;
			else
				runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("mb.rw(").append(')').toString());
		}
	}

	static final void method2748(ScriptRuntime class403, byte i) {
		try {
			class403.integerStackOffset -= -783761378;
			int i_0_ = (class403.integerStack[681479919 * class403.integerStackOffset]);
			int i_1_ = (class403.integerStack[1 + class403.integerStackOffset * 681479919]);
			class403.aClass177_5243.anIntArray1789[i_0_] = i_1_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("mb.adb(").append(')').toString());
		}
	}

	public static final int method2749(int i, int i_2_, int i_3_) {
		try {
			if (-1 == i)
				return 12345678;
			i_2_ = (i & 0x7f) * i_2_ >> 7;
			if (i_2_ < 2)
				i_2_ = 2;
			else if (i_2_ > 126)
				i_2_ = 126;
			return (i & 0xff80) + i_2_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("mb.q(").append(')').toString());
		}
	}

}
