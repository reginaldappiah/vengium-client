package com.jagex;/* Class298_Sub32_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub32_Sub14 extends Class298_Sub32 {
	static boolean aBoolean9399 = false;
	void method3137(int i, Buffer buffer) {
		try {
			if (0 == i)
				aBoolean7382 = buffer.readUByte() == 1;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ahc.r(").append(')').toString());
		}
	}

	void method3214(int i, Buffer class298_sub53) {
		if (0 == i)
			aBoolean7382 = class298_sub53.readUByte() == 1;
	}

	int[][] method3132(int i) {
		try {
			int[][] is = aClass239_7380.method2205(i);
			if (aClass239_7380.aBoolean2607) {
				int[][] is_2_ = method3134(0, i);
				int[] is_3_ = is_2_[0];
				int[] is_4_ = is_2_[1];
				int[] is_5_ = is_2_[2];
				int[] is_6_ = is[0];
				int[] is_7_ = is[1];
				int[] is_8_ = is[2];
				for (int i_9_ = 0; i_9_ < -1474554145 * Class250.anInt2755; i_9_++) {
					is_6_[i_9_] = 4096 - is_3_[i_9_];
					is_7_[i_9_] = 4096 - is_4_[i_9_];
					is_8_[i_9_] = 4096 - is_5_[i_9_];
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ahc.k(").append(')').toString());
		}
	}

	int[] method3215(int i) {
		int[] is = aClass257_7384.method2448(i);
		if (aClass257_7384.aBoolean2810) {
			int[] is_10_ = method3129(0, i);
			for (int i_11_ = 0; i_11_ < Class250.anInt2755 * -1474554145; i_11_++)
				is[i_11_] = 4096 - is_10_[i_11_];
		}
		return is;
	}

	public Class298_Sub32_Sub14() {
		super(1, false);
	}

	int[] method3216(int i) {
		int[] is = aClass257_7384.method2448(i);
		if (aClass257_7384.aBoolean2810) {
			int[] is_12_ = method3129(0, i);
			for (int i_13_ = 0; i_13_ < Class250.anInt2755 * -1474554145; i_13_++)
				is[i_13_] = 4096 - is_12_[i_13_];
		}
		return is;
	}

	int[] method3131(int i, int i_14_) {
		try {
			int[] is = aClass257_7384.method2448(i);
			if (aClass257_7384.aBoolean2810) {
				int[] is_15_ = method3129(0, i);
				for (int i_16_ = 0; i_16_ < Class250.anInt2755 * -1474554145; i_16_++)
					is[i_16_] = 4096 - is_15_[i_16_];
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ahc.i(").append(')').toString());
		}
	}

	void method3217(int i, Buffer class298_sub53) {
		if (0 == i)
			aBoolean7382 = class298_sub53.readUByte() == 1;
	}

	int[][] method3218(int i) {
		int[][] is = aClass239_7380.method2205(i);
		if (aClass239_7380.aBoolean2607) {
			int[][] is_17_ = method3134(0, i);
			int[] is_18_ = is_17_[0];
			int[] is_19_ = is_17_[1];
			int[] is_20_ = is_17_[2];
			int[] is_21_ = is[0];
			int[] is_22_ = is[1];
			int[] is_23_ = is[2];
			for (int i_24_ = 0; i_24_ < -1474554145 * Class250.anInt2755; i_24_++) {
				is_21_[i_24_] = 4096 - is_18_[i_24_];
				is_22_[i_24_] = 4096 - is_19_[i_24_];
				is_23_[i_24_] = 4096 - is_20_[i_24_];
			}
		}
		return is;
	}

	int[][] method3219(int i) {
		int[][] is = aClass239_7380.method2205(i);
		if (aClass239_7380.aBoolean2607) {
			int[][] is_25_ = method3134(0, i);
			int[] is_26_ = is_25_[0];
			int[] is_27_ = is_25_[1];
			int[] is_28_ = is_25_[2];
			int[] is_29_ = is[0];
			int[] is_30_ = is[1];
			int[] is_31_ = is[2];
			for (int i_32_ = 0; i_32_ < -1474554145 * Class250.anInt2755; i_32_++) {
				is_29_[i_32_] = 4096 - is_26_[i_32_];
				is_30_[i_32_] = 4096 - is_27_[i_32_];
				is_31_[i_32_] = 4096 - is_28_[i_32_];
			}
		}
		return is;
	}
}
