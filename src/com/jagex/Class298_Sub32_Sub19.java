package com.jagex;/* Class298_Sub32_Sub19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub32_Sub19 extends Class298_Sub32 {
	static boolean aBoolean9443 = false;
	static int anInt9444 = 32768;
	int anInt9445 = 1905754112;

	void method3250(int i, Buffer class298_sub53) {
		switch (i) {
		case 1:
			aBoolean7382 = class298_sub53.readUByte() == 1;
			break;
		case 0:
			this.anInt9445 = (class298_sub53.readUShort() << 4) * 2104812335;
			break;
		}
	}

	void method3137(int i, Buffer buffer) {
		try {
			switch (i) {
			case 1:
				aBoolean7382 = buffer.readUByte() == 1;
				break;
			case 0:
				this.anInt9445 = (buffer.readUShort() << 4) * 2104812335;
				break;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ahh.r(").append(')').toString());
		}
	}

	int[][] method3132(int i) {
		try {
			int[][] is = aClass239_7380.method2205(i);
			if (aClass239_7380.aBoolean2607) {
				int[] is_2_ = method3129(1, i);
				int[] is_3_ = method3129(2, i);
				int[] is_4_ = is[0];
				int[] is_5_ = is[1];
				int[] is_6_ = is[2];
				for (int i_7_ = 0; i_7_ < Class250.anInt2755 * -1474554145; i_7_++) {
					int i_8_ = 255 * is_2_[i_7_] >> 12 & 0xff;
					int i_9_ = ((is_3_[i_7_] * (-1817623601 * this.anInt9445)) >> 12);
					int i_10_ = Class250.anIntArray2763[i_8_] * i_9_ >> 12;
					int i_11_ = Class250.anIntArray2761[i_8_] * i_9_ >> 12;
					int i_12_ = (i_7_ + (i_10_ >> 12) & -901777799 * Class250.anInt2753);
					int i_13_ = (i_11_ >> 12) + i & Class250.anInt2758 * -289063255;
					int[][] is_14_ = method3134(0, i_13_);
					is_4_[i_7_] = is_14_[0][i_12_];
					is_5_[i_7_] = is_14_[1][i_12_];
					is_6_[i_7_] = is_14_[2][i_12_];
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ahh.k(").append(')').toString());
		}
	}

	void method3133(int i) {
		try {
			Class250.method2396((byte) 90);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ahh.posX(").append(')').toString());
		}
	}

	int[] method3251(int i) {
		int[] is = aClass257_7384.method2448(i);
		if (aClass257_7384.aBoolean2810) {
			int[] is_15_ = method3129(1, i);
			int[] is_16_ = method3129(2, i);
			for (int i_17_ = 0; i_17_ < Class250.anInt2755 * -1474554145; i_17_++) {
				int i_18_ = is_15_[i_17_] >> 4 & 0xff;
				int i_19_ = (is_16_[i_17_] * (this.anInt9445 * -1817623601) >> 12);
				int i_20_ = i_19_ * Class250.anIntArray2763[i_18_] >> 12;
				int i_21_ = Class250.anIntArray2761[i_18_] * i_19_ >> 12;
				int i_22_ = (i_20_ >> 12) + i_17_ & -901777799 * Class250.anInt2753;
				int i_23_ = i + (i_21_ >> 12) & -289063255 * Class250.anInt2758;
				int[] is_24_ = method3129(0, i_23_);
				is[i_17_] = is_24_[i_22_];
			}
		}
		return is;
	}

	void method3252(int i, Buffer class298_sub53) {
		switch (i) {
		case 1:
			aBoolean7382 = class298_sub53.readUByte() == 1;
			break;
		case 0:
			this.anInt9445 = (class298_sub53.readUShort() << 4) * 2104812335;
			break;
		}
	}

	int[] method3253(int i) {
		int[] is = aClass257_7384.method2448(i);
		if (aClass257_7384.aBoolean2810) {
			int[] is_25_ = method3129(1, i);
			int[] is_26_ = method3129(2, i);
			for (int i_27_ = 0; i_27_ < Class250.anInt2755 * -1474554145; i_27_++) {
				int i_28_ = is_25_[i_27_] >> 4 & 0xff;
				int i_29_ = (is_26_[i_27_] * (this.anInt9445 * -1817623601) >> 12);
				int i_30_ = i_29_ * Class250.anIntArray2763[i_28_] >> 12;
				int i_31_ = Class250.anIntArray2761[i_28_] * i_29_ >> 12;
				int i_32_ = (i_30_ >> 12) + i_27_ & -901777799 * Class250.anInt2753;
				int i_33_ = i + (i_31_ >> 12) & -289063255 * Class250.anInt2758;
				int[] is_34_ = method3129(0, i_33_);
				is[i_27_] = is_34_[i_32_];
			}
		}
		return is;
	}

	void method3254() {
		Class250.method2396((byte) 11);
	}

	void method3255() {
		Class250.method2396((byte) -98);
	}

	int[][] method3256(int i) {
		int[][] is = aClass239_7380.method2205(i);
		if (aClass239_7380.aBoolean2607) {
			int[] is_35_ = method3129(1, i);
			int[] is_36_ = method3129(2, i);
			int[] is_37_ = is[0];
			int[] is_38_ = is[1];
			int[] is_39_ = is[2];
			for (int i_40_ = 0; i_40_ < Class250.anInt2755 * -1474554145; i_40_++) {
				int i_41_ = 255 * is_35_[i_40_] >> 12 & 0xff;
				int i_42_ = ((is_36_[i_40_] * (-1817623601 * this.anInt9445)) >> 12);
				int i_43_ = Class250.anIntArray2763[i_41_] * i_42_ >> 12;
				int i_44_ = Class250.anIntArray2761[i_41_] * i_42_ >> 12;
				int i_45_ = i_40_ + (i_43_ >> 12) & -901777799 * Class250.anInt2753;
				int i_46_ = (i_44_ >> 12) + i & Class250.anInt2758 * -289063255;
				int[][] is_47_ = method3134(0, i_46_);
				is_37_[i_40_] = is_47_[0][i_45_];
				is_38_[i_40_] = is_47_[1][i_45_];
				is_39_[i_40_] = is_47_[2][i_45_];
			}
		}
		return is;
	}

	int[] method3131(int i, int i_48_) {
		try {
			int[] is = aClass257_7384.method2448(i);
			if (aClass257_7384.aBoolean2810) {
				int[] is_49_ = method3129(1, i);
				int[] is_50_ = method3129(2, i);
				for (int i_51_ = 0; i_51_ < Class250.anInt2755 * -1474554145; i_51_++) {
					int i_52_ = is_49_[i_51_] >> 4 & 0xff;
					int i_53_ = ((is_50_[i_51_] * (this.anInt9445 * -1817623601)) >> 12);
					int i_54_ = i_53_ * Class250.anIntArray2763[i_52_] >> 12;
					int i_55_ = Class250.anIntArray2761[i_52_] * i_53_ >> 12;
					int i_56_ = ((i_54_ >> 12) + i_51_ & -901777799 * Class250.anInt2753);
					int i_57_ = i + (i_55_ >> 12) & -289063255 * Class250.anInt2758;
					int[] is_58_ = method3129(0, i_57_);
					is[i_51_] = is_58_[i_56_];
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ahh.i(").append(')').toString());
		}
	}

	void method3257() {
		Class250.method2396((byte) 46);
	}

	public Class298_Sub32_Sub19() {
		super(3, false);
	}

	int[][] method3258(int i) {
		int[][] is = aClass239_7380.method2205(i);
		if (aClass239_7380.aBoolean2607) {
			int[] is_59_ = method3129(1, i);
			int[] is_60_ = method3129(2, i);
			int[] is_61_ = is[0];
			int[] is_62_ = is[1];
			int[] is_63_ = is[2];
			for (int i_64_ = 0; i_64_ < Class250.anInt2755 * -1474554145; i_64_++) {
				int i_65_ = 255 * is_59_[i_64_] >> 12 & 0xff;
				int i_66_ = ((is_60_[i_64_] * (-1817623601 * this.anInt9445)) >> 12);
				int i_67_ = Class250.anIntArray2763[i_65_] * i_66_ >> 12;
				int i_68_ = Class250.anIntArray2761[i_65_] * i_66_ >> 12;
				int i_69_ = i_64_ + (i_67_ >> 12) & -901777799 * Class250.anInt2753;
				int i_70_ = (i_68_ >> 12) + i & Class250.anInt2758 * -289063255;
				int[][] is_71_ = method3134(0, i_70_);
				is_61_[i_64_] = is_71_[0][i_69_];
				is_62_[i_64_] = is_71_[1][i_69_];
				is_63_[i_64_] = is_71_[2][i_69_];
			}
		}
		return is;
	}
}
