package com.jagex;/* Class298_Sub32_Sub32 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub32_Sub32 extends Class298_Sub32 {
	int anInt9511 = 0;
	static int anInt9512 = 0;
	static int anInt9513 = 4096;
	int anInt9514 = -1593028608;

	void method3340(int i, Buffer class298_sub53) {
		switch (i) {
		case 0:
			this.anInt9511 = class298_sub53.readUShort() * 1298582163;
			break;
		case 1:
			this.anInt9514 = class298_sub53.readUShort() * 2091520197;
			break;
		}
	}

	int[] method3131(int i, int i_0_) {
		try {
			int[] is = aClass257_7384.method2448(i);
			if (aClass257_7384.aBoolean2810) {
				int[] is_1_ = method3129(0, i);
				for (int i_2_ = 0; i_2_ < -1474554145 * Class250.anInt2755; i_2_++) {
					int i_3_ = is_1_[i_2_];
					is[i_2_] = (i_3_ < (this.anInt9511 * 1295115163) || i_3_ > 1628368397 * this.anInt9514) ? 0 : 4096;
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ahu.i(").append(')').toString());
		}
	}

	public Class298_Sub32_Sub32() {
		super(1, true);
	}

	int[] method3341(int i) {
		int[] is = aClass257_7384.method2448(i);
		if (aClass257_7384.aBoolean2810) {
			int[] is_4_ = method3129(0, i);
			for (int i_5_ = 0; i_5_ < -1474554145 * Class250.anInt2755; i_5_++) {
				int i_6_ = is_4_[i_5_];
				is[i_5_] = ((i_6_ < this.anInt9511 * 1295115163) || i_6_ > 1628368397 * (this.anInt9514)) ? 0 : 4096;
			}
		}
		return is;
	}

	int[] method3342(int i) {
		int[] is = aClass257_7384.method2448(i);
		if (aClass257_7384.aBoolean2810) {
			int[] is_7_ = method3129(0, i);
			for (int i_8_ = 0; i_8_ < -1474554145 * Class250.anInt2755; i_8_++) {
				int i_9_ = is_7_[i_8_];
				is[i_8_] = ((i_9_ < this.anInt9511 * 1295115163) || i_9_ > 1628368397 * (this.anInt9514)) ? 0 : 4096;
			}
		}
		return is;
	}

	void method3137(int i, Buffer buffer) {
		try {
			switch (i) {
			case 0:
				this.anInt9511 = buffer.readUShort() * 1298582163;
				break;
			case 1:
				this.anInt9514 = buffer.readUShort() * 2091520197;
				break;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ahu.r(").append(')').toString());
		}
	}

	void method3343(int i, Buffer class298_sub53) {
		switch (i) {
		case 0:
			this.anInt9511 = class298_sub53.readUShort() * 1298582163;
			break;
		case 1:
			this.anInt9514 = class298_sub53.readUShort() * 2091520197;
			break;
		}
	}

	static final void method3344(ScriptRuntime class403, byte i) {
		try {
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = StaticMethods.aBoolean8385 ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ahu.us(").append(')').toString());
		}
	}

	public static void method3345(String[] strings, int[] is) {
			Class361.method4306(strings, is, 0, strings.length - 1);
	}
}
