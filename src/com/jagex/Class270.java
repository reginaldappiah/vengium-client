package com.jagex;/* Class270 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class270 {
	int anInt2888;
	int anInt2892;
	int[][] anIntArrayArray2893;

	byte[] method2532(byte[] is, int i) {
		try {
			if (this.anIntArrayArray2893 != null) {
				int i_0_ = (int) ((long) is.length * (long) (this.anInt2892 * 278980631) / (long) (this.anInt2888 * -931883257)) + 14;
				int[] is_1_ = new int[i_0_];
				int i_2_ = 0;
				int i_3_ = 0;
				for (int i_4_ = 0; i_4_ < is.length; i_4_++) {
					int i_5_ = is[i_4_];
					int[] is_6_ = this.anIntArrayArray2893[i_3_];
					for (int i_7_ = 0; i_7_ < 14; i_7_++)
						is_1_[i_2_ + i_7_] += is_6_[i_7_] * i_5_;
					i_3_ += this.anInt2892 * 278980631;
					int i_8_ = i_3_ / (-931883257 * this.anInt2888);
					i_2_ += i_8_;
					i_3_ -= i_8_ * (-931883257 * this.anInt2888);
				}
				is = new byte[i_0_];
				for (int i_9_ = 0; i_9_ < i_0_; i_9_++) {
					int i_10_ = is_1_[i_9_] + 32768 >> 16;
					if (i_10_ < -128)
						is[i_9_] = (byte) -128;
					else if (i_10_ > 127)
						is[i_9_] = (byte) 127;
					else
						is[i_9_] = (byte) i_10_;
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lf.a(").append(')').toString());
		}
	}

	public short[] method2533(short[] is, byte i) {
		try {
			if (null != this.anIntArrayArray2893) {
				int i_11_ = ((int) ((long) (this.anInt2892 * 278980631) * (long) is.length / (long) (this.anInt2888 * -931883257)) + 14);
				int[] is_12_ = new int[i_11_];
				int i_13_ = 0;
				int i_14_ = 0;
				for (int i_15_ = 0; i_15_ < is.length; i_15_++) {
					int i_16_ = is[i_15_];
					int[] is_17_ = this.anIntArrayArray2893[i_14_];
					for (int i_18_ = 0; i_18_ < 14; i_18_++)
						is_12_[i_18_ + i_13_] += is_17_[i_18_] * i_16_ >> 2;
					i_14_ += this.anInt2892 * 278980631;
					int i_19_ = i_14_ / (-931883257 * this.anInt2888);
					i_13_ += i_19_;
					i_14_ -= i_19_ * (this.anInt2888 * -931883257);
				}
				is = new short[i_11_];
				for (int i_20_ = 0; i_20_ < i_11_; i_20_++) {
					int i_21_ = 8192 + is_12_[i_20_] >> 14;
					if (i_21_ < -32768)
						is[i_20_] = (short) -32768;
					else if (i_21_ > 32767)
						is[i_20_] = (short) 32767;
					else
						is[i_20_] = (short) i_21_;
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lf.f(").append(')').toString());
		}
	}

	int method2534(int i, int i_22_) {
		try {
			if (null != this.anIntArrayArray2893)
				i = (int) ((long) (278980631 * this.anInt2892) * (long) i / (long) (-931883257 * this.anInt2888));
			return i;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lf.b(").append(')').toString());
		}
	}

	int method2535(int i, int i_23_) {
		try {
			if (this.anIntArrayArray2893 != null)
				i = (int) ((long) (278980631 * this.anInt2892) * (long) i / (long) (-931883257 * this.anInt2888)) + 6;
			return i;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lf.p(").append(')').toString());
		}
	}

	public Class270(int i, int i_24_) {
		if (i_24_ != i) {
			int i_25_ = Class285.method2713(i, i_24_, -2115860934);
			i /= i_25_;
			i_24_ /= i_25_;
			this.anInt2888 = i * 597370551;
			this.anInt2892 = 1817366439 * i_24_;
			this.anIntArrayArray2893 = new int[i][14];
			for (int i_26_ = 0; i_26_ < i; i_26_++) {
				int[] is = this.anIntArrayArray2893[i_26_];
				double d = 6.0 + (double) i_26_ / (double) i;
				int i_27_ = (int) Math.floor(d - 7.0 + 1.0);
				if (i_27_ < 0)
					i_27_ = 0;
				int i_28_ = (int) Math.ceil(d + 7.0);
				if (i_28_ > 14)
					i_28_ = 14;
				double d_29_ = (double) i_24_ / (double) i;
				for (/**/; i_27_ < i_28_; i_27_++) {
					double d_30_ = ((double) i_27_ - d) * 3.141592653589793;
					double d_31_ = d_29_;
					if (d_30_ < -1.0E-4 || d_30_ > 1.0E-4)
						d_31_ *= Math.sin(d_30_) / d_30_;
					d_31_ *= 0.54 + 0.46 * Math.cos(((double) i_27_ - d) * 0.2243994752564138);
					is[i_27_] = (int) Math.floor(65536.0 * d_31_ + 0.5);
				}
			}
		}
	}

	public static final void method2539(int i, int i_37_, int i_38_, int i_39_, int i_40_) {
		try {
			if (i >= Class372_Sub3.anInt4051 * -1424479739 && i_37_ <= 1135094847 * Class372_Sub3.anInt4048 && i_38_ >= Class372_Sub3.anInt4049 * 1155384281 && i_39_ <= -1062447355 * Class372_Sub3.anInt4050)
				StaticMethods.method4873(i, i_37_, i_38_, i_39_, i_40_);
			else
				Class298_Sub20.method3052(i, i_37_, i_38_, i_39_, i_40_, 1926849708);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lf.posX(").append(')').toString());
		}
	}

}
