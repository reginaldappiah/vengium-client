package com.jagex;/* Class298_Sub32_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub32_Sub2 extends Class298_Sub32 {
	Class98[] aClass98Array9321;

	final void method3143(int[][] is, byte i) {
		try {
			int i_0_ = Class250.anInt2755 * -1474554145;
			int i_1_ = 461985445 * Class250.anInt2756;
			StaticMethods.method4685(is);
			StaticMethods.method6009(0, 0, Class250.anInt2753 * -901777799, Class250.anInt2758 * -289063255);
			if (null != this.aClass98Array9321) {
				for (int index = 0; (index < this.aClass98Array9321.length); index++) {
					Class98 class98 = this.aClass98Array9321[index];
					int i_3_ = class98.anInt948 * 699194661;
					int i_4_ = 1785836763 * class98.anInt947;
					if (i_3_ >= 0) {
						if (i_4_ >= 0)
							class98.method1048(i_0_, i_1_, (byte) 1);
						else
							class98.method1047(i_0_, i_1_, (byte) 1);
					} else if (i_4_ >= 0)
						class98.method1054(i_0_, i_1_, (byte) 88);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("agd.ac(").append(')').toString());
		}
	}

	int[] method3131(int i, int i_5_) {
		try {
			int[] is = aClass257_7384.method2448(i);
			if (aClass257_7384.aBoolean2810)
				method3143(aClass257_7384.method2449(-45371310), (byte) 24);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("agd.i(").append(')').toString());
		}
	}

	int[][] method3132(int i) {
		try {
			int[][] is = aClass239_7380.method2205(i);
			if (aClass239_7380.aBoolean2607) {
				int i_7_ = -1474554145 * Class250.anInt2755;
				int i_8_ = Class250.anInt2756 * 461985445;
				int[][] is_9_ = new int[i_8_][i_7_];
				int[][][] is_10_ = aClass239_7380.method2204((byte) 53);
				method3143(is_9_, (byte) 121);
				for (int i_11_ = 0; i_11_ < 461985445 * Class250.anInt2756; i_11_++) {
					int[] is_12_ = is_9_[i_11_];
					int[][] is_13_ = is_10_[i_11_];
					int[] is_14_ = is_13_[0];
					int[] is_15_ = is_13_[1];
					int[] is_16_ = is_13_[2];
					for (int i_17_ = 0; i_17_ < Class250.anInt2755 * -1474554145; i_17_++) {
						int i_18_ = is_12_[i_17_];
						is_16_[i_17_] = (i_18_ & 0xff) << 4;
						is_15_[i_17_] = (i_18_ & 0xff00) >> 4;
						is_14_[i_17_] = (i_18_ & 0xff0000) >> 12;
					}
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("agd.k(").append(')').toString());
		}
	}

	void method3137(int i, Buffer buffer) {
		try {
			if (0 == i) {
				this.aClass98Array9321 = new Class98[buffer.readUByte()];
				for (int index = 0; (index < this.aClass98Array9321.length); index++) {
					int i_21_ = buffer.readUByte();
					switch (i_21_) {
					case 0:
						this.aClass98Array9321[index] = Class98_Sub2.method3405(buffer);
						break;
					case 3:
						this.aClass98Array9321[index] = Class98_Sub1.method313(buffer);
						break;
					case 1:
						this.aClass98Array9321[index] = Class98_Sub4.method1922(buffer);
						break;
					case 2:
						this.aClass98Array9321[index] = Class98_Sub3.method783(buffer);
						break;
					}
				}
			} else if (i == 1)
				aBoolean7382 = buffer.readUByte() == 1;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("agd.r(").append(')').toString());
		}
	}

	public Class298_Sub32_Sub2() {
		super(0, true);
	}

}
