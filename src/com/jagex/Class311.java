package com.jagex;/* Class311 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class311 {
	int anInt3283;
	String aString3284;
	int anInt3285;
	int anInt3286;
	int anInt3287;

	int method3811(byte i) {
		try {
			return 1497963413 * this.anInt3287;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("my.a(").append(')').toString());
		}
	}

	int method3812(byte i) {
		try {
			return -731303013 * this.anInt3285;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("my.b(").append(')').toString());
		}
	}

	int method3813(int i) {
		try {
			return 623816081 * this.anInt3286;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("my.p(").append(')').toString());
		}
	}

	String method3814(int i) {
		try {
			return this.aString3284;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("my.i(").append(')').toString());
		}
	}

	int method3815(int i) {
		try {
			return this.anInt3283 * -1285373955;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("my.f(").append(')').toString());
		}
	}

	public Class311(int i, int i_0_, int i_1_, int i_2_, String string) {
		this.anInt3287 = i * -2008328259;
		this.anInt3283 = i_0_ * -1378314923;
		this.anInt3285 = 28768915 * i_1_;
		this.anInt3286 = -1845906575 * i_2_;
		this.aString3284 = string;
	}

	static void method3816(ScriptRuntime class403, int i) {
		try {
			class403.integerStack[681479919 * class403.integerStackOffset - 2] = (Class316.aClass362_3318.getQuestType((class403.integerStack[class403.integerStackOffset * 681479919 - 2])).method4565(GameClient.anIntArray8828, (class403.integerStack[class403.integerStackOffset * 681479919 - 1]))) ? 1 : 0;
			class403.integerStackOffset -= -391880689;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("my.posY(").append(')').toString());
		}
	}

	public static void method3817(String string, boolean bool, int i) {
		try {
			string = string.toLowerCase();
			short[] is = new short[16];
			int i_3_ = 0;
			int i_4_ = bool ? 32768 : 0;
			int i_5_ = ((bool ? StaticMethods.aClass469_5618.anInt5777 * 1637004669 : StaticMethods.aClass469_5618.anInt5775 * 1143516897) + i_4_);
			for (int i_6_ = i_4_; i_6_ < i_5_; i_6_++) {
				Class298_Sub37_Sub14 class298_sub37_sub14 = StaticMethods.aClass469_5618.method6045(i_6_);
				if (!class298_sub37_sub14.aBoolean9655) {
					if (i <= -1272557020) {
						/* empty */
					}
				} else if (class298_sub37_sub14.method3462((byte) -92).toLowerCase().indexOf(string) == -1) {
					if (i <= -1272557020)
						return;
				} else {
					if (i_3_ >= 50) {
						Class344.itemIndex = -140296601;
						EffectiveVertex.aShortArray678 = null;
						return;
					}
					if (i_3_ >= is.length) {
						short[] is_7_ = new short[is.length * 2];
						for (int i_8_ = 0; i_8_ < i_3_; i_8_++)
							is_7_[i_8_] = is[i_8_];
						is = is_7_;
					}
					is[i_3_++] = (short) i_6_;
				}
			}
			EffectiveVertex.aShortArray678 = is;
			ResourceProvider.anInt2709 = 0;
			Class344.itemIndex = i_3_ * 140296601;
			String[] strings = new String[Class344.itemIndex * 367592105];
			for (int i_9_ = 0; i_9_ < Class344.itemIndex * 367592105; i_9_++)
				strings[i_9_] = StaticMethods.aClass469_5618.method6045(is[i_9_]).method3462((byte) -73);
			StaticMethods.method2085(strings, EffectiveVertex.aShortArray678);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("my.nc(").append(')').toString());
		}
	}

	static final void method3818(ScriptRuntime runtime) {
		try {
			Class82_Sub11.stopCameraShake();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("my.agf(").append(')').toString());
		}
	}

	static final void method3819(ScriptRuntime class403, int i) {
		try {
			int i_10_ = (class403.integerstack[class403.integerPos * 1883543357]);
			Class520 class520 = Class99.aClass517_951.method6307(i_10_);
			if ('\001' != class520.aChar6277)
				class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919) - 1] = 0;
			Integer integer = ((Integer) Class313.anObjectArray3298[class520.anInt6276 * 216249401]);
			if (integer == null)
				class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919) - 1] = 0;
			else {
				int i_11_ = (-1635784577 * class520.anInt6278 == 31 ? -1 : (1 << -1635784577 * class520.anInt6278 + 1) - 1);
				class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919) - 1] = ((integer.intValue() & i_11_) >>> -1673918633 * class520.anInt6275);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("my.bg(").append(')').toString());
		}
	}
}
