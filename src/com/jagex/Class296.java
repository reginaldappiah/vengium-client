package com.jagex;/* Class296 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.utils.StringUtils;

public class Class296 {
	public int[] anIntArray3168;
	public int anInt3169;
	public int[] anIntArray3170;

	public Class296(int i) {
		anInt3169 = 526813095 * i;
		anIntArray3168 = new int[anInt3169 * -1407078377];
		anIntArray3170 = new int[anInt3169 * -1407078377];
	}

	static final void method2829(ScriptRuntime class403, byte i) {
		try {
			int i_0_ = (class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]);
			Class298_Sub37_Sub14 class298_sub37_sub14 = StaticMethods.aClass469_5618.method6045(i_0_);
			if (class298_sub37_sub14.anIntArray9653 == null)
				class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919) - 1] = 0;
			else
				class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919) - 1] = class298_sub37_sub14.anIntArray9653.length;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("mi.acn(").append(')').toString());
		}
	}

	public static long method2830(int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, byte i_6_) {
		try {
			Class490.calendar.clear();
			Class490.calendar.set(i_5_, i_4_, i_3_, i_2_, i_1_, i);
			return Class490.calendar.getTime().getTime();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("mi.posX(").append(')').toString());
		}
	}

	static final void method2831(ScriptRuntime class403, int i) {
		try {
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = SettingsManager.settingsManager.modShadows.getValue() == 1 ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("mi.ajl(").append(')').toString());
		}
	}

	static final void method2832(ScriptRuntime runtime) {
		try {
			int i_7_ = (runtime.integerstack[runtime.integerPos * 1883543357]);
			runtime.objectArgs -= i_7_ * 969361751;
			String string = StringUtils.method5996(runtime.objectStack, (-203050393 * runtime.objectArgs), i_7_, (byte) 0);
			runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393 - 1)] = string;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("mi.aw(").append(')').toString());
		}
	}

	static final void method2833(ScriptRuntime runtime) {
		try {
			runtime.objectArgs -= 1938723502;
			runtime.integerStackOffset -= -783761378;
			Class18.method362((String) (runtime.objectStack[runtime.objectArgs * -203050393]), (String) (runtime.objectStack[-203050393 * runtime.objectArgs + 1]), (runtime.integerStack[runtime.integerStackOffset * 681479919]), 1 == (runtime.integerStack[1 + 681479919 * runtime.integerStackOffset]));
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("mi.age(").append(')').toString());
		}
	}

	static void method2834(int i, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_) {
		try {
			int i_13_ = 0;
			int i_14_ = i_10_;
			int i_15_ = i_9_ * i_9_;
			int i_16_ = i_10_ * i_10_;
			int i_17_ = i_16_ << 1;
			int i_18_ = i_15_ << 1;
			int i_19_ = i_10_ << 1;
			int i_20_ = (1 - i_19_) * i_15_ + i_17_;
			int i_21_ = i_16_ - i_18_ * (i_19_ - 1);
			int i_22_ = i_15_ << 2;
			int i_23_ = i_16_ << 2;
			int i_24_ = i_17_ * ((i_13_ << 1) + 3);
			int i_25_ = i_18_ * ((i_14_ << 1) - 3);
			int i_26_ = i_23_ * (1 + i_13_);
			int i_27_ = i_22_ * (i_14_ - 1);
			if (i_8_ >= Class372_Sub1_Sub1.anInt4049 * 1155384281 && i_8_ <= Class372_Sub1_Sub1.anInt4050 * -1062447355) {
				int i_28_ = StaticMethods.method6012(i_9_ + i, (Class372_Sub1_Sub1.anInt4051 * -1424479739), (Class372_Sub1_Sub1.anInt4048 * 1135094847));
				int i_29_ = StaticMethods.method6012(i - i_9_, (Class372_Sub1_Sub1.anInt4051 * -1424479739), (Class372_Sub1_Sub1.anInt4048 * 1135094847));
				Class82_Sub22.method940((Class372_Sub1_Sub1.anIntArrayArray4047[i_8_]), i_29_, i_28_, i_11_);
			}
			while (i_14_ > 0) {
				if (i_20_ < 0) {
					while (i_20_ < 0) {
						i_20_ += i_24_;
						i_21_ += i_26_;
						i_24_ += i_23_;
						i_26_ += i_23_;
						i_13_++;
					}
				}
				if (i_21_ < 0) {
					i_20_ += i_24_;
					i_21_ += i_26_;
					i_24_ += i_23_;
					i_26_ += i_23_;
					i_13_++;
				}
				i_20_ += -i_27_;
				i_21_ += -i_25_;
				i_25_ -= i_22_;
				i_27_ -= i_22_;
				i_14_--;
				int i_30_ = i_8_ - i_14_;
				int i_31_ = i_14_ + i_8_;
				if (i_31_ >= Class372_Sub1_Sub1.anInt4049 * 1155384281 && i_30_ <= Class372_Sub1_Sub1.anInt4050 * -1062447355) {
					int i_32_ = StaticMethods.method6012(i + i_13_, (-1424479739 * Class372_Sub1_Sub1.anInt4051), (1135094847 * Class372_Sub1_Sub1.anInt4048));
					int i_33_ = StaticMethods.method6012(i - i_13_, (-1424479739 * Class372_Sub1_Sub1.anInt4051), (Class372_Sub1_Sub1.anInt4048 * 1135094847));
					if (i_30_ >= 1155384281 * Class372_Sub1_Sub1.anInt4049)
						Class82_Sub22.method940((Class372_Sub1_Sub1.anIntArrayArray4047[i_30_]), i_33_, i_32_, i_11_);
					if (i_31_ <= -1062447355 * Class372_Sub1_Sub1.anInt4050)
						Class82_Sub22.method940((Class372_Sub1_Sub1.anIntArrayArray4047[i_31_]), i_33_, i_32_, i_11_);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("mi.ah(").append(')').toString());
		}
	}
}
