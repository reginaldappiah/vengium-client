package com.jagex;/* Class293 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class293 {
	Class293() throws Throwable {
		throw new Error();
	}

	static final void method2818(ScriptRuntime class403, byte i) {
		try {
			class403.integerStackOffset -= -783761378;
			if ((class403.integerStack[681479919 * class403.integerStackOffset]) > (class403.integerStack[class403.integerStackOffset * 681479919 + 1]))
				class403.integerPos += (286750741 * (class403.integerstack[class403.integerPos * 1883543357]));
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("me.aa(").append(')').toString());
		}
	}

	static final void method2819(ScriptRuntime class403, int i) {
		try {
			class403.integerStackOffset -= -783761378;
			int i_0_ = (class403.integerStack[681479919 * class403.integerStackOffset]);
			int i_1_ = (class403.integerStack[681479919 * class403.integerStackOffset + 1]);
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = SoftCache.method4197(i_0_, i_1_, true);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("me.tw(").append(')').toString());
		}
	}

	static final void method2820(ScriptRuntime class403, int i) {
		try {
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = 816811163 * StaticMethods.anInt689;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("me.wc(").append(')').toString());
		}
	}

	static final void method2821(ScriptRuntime runtime) {
		try {
			runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = runtime.aClass162_5252.aByte1658;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("me.xu(").append(')').toString());
		}
	}

	static final void method2822(ScriptRuntime class403, int i) {
		try {
			int i_2_ = (class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]);
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = SettingsManager.settingsManager.skybox.getSupport();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("me.aon(").append(')').toString());
		}
	}

	static void method2823(int i, boolean bool, byte i_3_) {
		try {
			Class298_Sub9 class298_sub9 = StaticMethods.method2437(i, bool);
			if (class298_sub9 != null) {
				for (int i_4_ = 0; (i_4_ < class298_sub9.anIntArray7226.length); i_4_++) {
					class298_sub9.anIntArray7226[i_4_] = -1;
					class298_sub9.anIntArray7227[i_4_] = 0;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("me.u(").append(')').toString());
		}
	}

	static void method2824(int i, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_, byte i_13_) {
		try {
			if (i != i_6_ || i_7_ != i_5_ || i_8_ != i_10_ || i_9_ != i_11_) {
				int i_14_ = i;
				int i_15_ = i_5_;
				int i_16_ = 3 * i;
				int i_17_ = 3 * i_5_;
				int i_18_ = i_6_ * 3;
				int i_19_ = i_7_ * 3;
				int i_20_ = 3 * i_8_;
				int i_21_ = 3 * i_9_;
				int i_22_ = i_10_ - i_20_ + i_18_ - i;
				int i_23_ = i_11_ - i_21_ + i_19_ - i_5_;
				int i_24_ = i_16_ + (i_20_ - i_18_ - i_18_);
				int i_25_ = i_21_ - i_19_ - i_19_ + i_17_;
				int i_26_ = i_18_ - i_16_;
				int i_27_ = i_19_ - i_17_;
				for (int i_28_ = 128; i_28_ <= 4096; i_28_ += 128) {
					int i_29_ = i_28_ * i_28_ >> 12;
					int i_30_ = i_28_ * i_29_ >> 12;
					int i_31_ = i_22_ * i_30_;
					int i_32_ = i_30_ * i_23_;
					int i_33_ = i_29_ * i_24_;
					int i_34_ = i_29_ * i_25_;
					int i_35_ = i_28_ * i_26_;
					int i_36_ = i_27_ * i_28_;
					int i_37_ = i + (i_31_ + i_33_ + i_35_ >> 12);
					int i_38_ = (i_36_ + (i_32_ + i_34_) >> 12) + i_5_;
					StaticMethods.method2093(i_14_, i_15_, i_37_, i_38_, i_12_);
					i_14_ = i_37_;
					i_15_ = i_38_;
				}
			} else
				StaticMethods.method2093(i, i_5_, i_10_, i_11_, i_12_);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("me.aa(").append(')').toString());
		}
	}
}
