package com.jagex;/* Class127_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class127_Sub1_Sub1 extends Class127_Sub1 {
	void method1424(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		try {
			int i_4_ = this.aClass57_8572.getPaddedWidth();
			int i_5_ = (((Class128_Sub3_Sub1) this.aClass128_6375).anInt9942 * 851871347 * Class74.method823(1139144319) / 10 % i_4_);
			this.aClass57_8572.drawRepeat(i_5_ + (i - i_4_), i_0_, i_4_ + i_1_ - i_5_, i_2_);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("afw.c(").append(')').toString());
		}
	}

	void method1429(int i, int i_6_, int i_7_, int i_8_) {
		int i_9_ = this.aClass57_8572.getPaddedWidth();
		int i_10_ = (((Class128_Sub3_Sub1) this.aClass128_6375).anInt9942 * 851871347 * Class74.method823(1139144319) / 10 % i_9_);
		this.aClass57_8572.drawRepeat(i_10_ + (i - i_9_), i_6_, i_9_ + i_7_ - i_10_, i_8_);
	}

	void method1430(int i, int i_11_, int i_12_, int i_13_) {
		int i_14_ = this.aClass57_8572.getPaddedWidth();
		int i_15_ = (((Class128_Sub3_Sub1) this.aClass128_6375).anInt9942 * 851871347 * Class74.method823(1139144319) / 10 % i_14_);
		this.aClass57_8572.drawRepeat(i_15_ + (i - i_14_), i_11_, i_14_ + i_12_ - i_15_, i_13_);
	}

	Class127_Sub1_Sub1(Js5FileSystem class243, Js5FileSystem class243_16_, Class128_Sub3_Sub1 class128_sub3_sub1) {
		super(class243, class243_16_, class128_sub3_sub1);
	}
}
