package com.jagex;/* Class298_Sub20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub20 extends Node {
	public short aShort7314;

	public Class298_Sub20(short i) {
		aShort7314 = i;
	}

	static void method3052(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
		try {
			int i_5_ = StaticMethods.method6012(i_1_, 1155384281 * Class372_Sub3.anInt4049, Class372_Sub3.anInt4050 * -1062447355);
			int i_6_ = StaticMethods.method6012(i_2_, Class372_Sub3.anInt4049 * 1155384281, Class372_Sub3.anInt4050 * -1062447355);
			int i_7_ = StaticMethods.method6012(i, -1424479739 * Class372_Sub3.anInt4051, 1135094847 * Class372_Sub3.anInt4048);
			int i_8_ = StaticMethods.method6012(i_0_, Class372_Sub3.anInt4051 * -1424479739, 1135094847 * Class372_Sub3.anInt4048);
			for (int i_9_ = i_5_; i_9_ <= i_6_; i_9_++)
				Class82_Sub22.method940((Class372_Sub3.anIntArrayArray4047[i_9_]), i_7_, i_8_, i_3_);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("abe.s(").append(')').toString());
		}
	}

	static final void method3053(ScriptRuntime runtime) {
		try {
			runtime.integerStackOffset -= -783761378;
			Class136.method1495((runtime.integerStack[(681479919 * runtime.integerStackOffset)]), (runtime.integerStack[(681479919 * runtime.integerStackOffset + 1)]), 255, -649427988);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("abe.sj(").append(')').toString());
		}
	}
}
