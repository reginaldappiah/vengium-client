package com.jagex;/* Class487 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.ConfigType;

public class Class487 {
	SoftCache aClass348_6064 = new SoftCache(64);
	SoftCache aClass348_6065 = new SoftCache(64);
	public static int anInt6066 = 64;
	Js5FileSystem aClass243_6067;
	Js5FileSystem aClass243_6068;
	public static int anInt6069 = 64;

	public Class496 method6159(int i) {
		try {
			Class496 class496;
			synchronized (this.aClass348_6064) {
				class496 = (Class496) this.aClass348_6064.get((long) i);
			}
			if (class496 != null)
				return class496;
			byte[] is;
			synchronized (this.aClass243_6067) {
				is = (this.aClass243_6067.getFileFromArchive(ConfigType.MAP_SCENES.type * -1006924897, i));
			}
			class496 = new Class496();
			class496.aClass487_6095 = this;
			if (is != null)
				class496.method6196(new Buffer(is), -1377008682);
			synchronized (this.aClass348_6064) {
				this.aClass348_6064.put(class496, (long) i);
			}
			return class496;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ub.a(").append(')').toString());
		}
	}

	public void method6160(int i, int i_1_, int i_2_) {
		try {
			this.aClass348_6064 = new SoftCache(i);
			this.aClass348_6065 = new SoftCache(i_1_);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ub.f(").append(')').toString());
		}
	}

	public void clear() {
		try {
			synchronized (this.aClass348_6064) {
				this.aClass348_6064.clear();
			}
			synchronized (this.aClass348_6065) {
				this.aClass348_6065.clear();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ub.b(").append(')').toString());
		}
	}

	public void sweep() {
		try {
			synchronized (this.aClass348_6064) {
				this.aClass348_6064.sweep();
			}
			synchronized (this.aClass348_6065) {
				this.aClass348_6065.sweep();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ub.i(").append(')').toString());
		}
	}

	public Class487(Js5FileSystem class243, Js5FileSystem class243_3_) {
		this.aClass243_6067 = class243;
		this.aClass243_6068 = class243_3_;
		this.aClass243_6067.getFileSystem((ConfigType.MAP_SCENES.type) * -1006924897);
		Math.random();
		Math.random();
		Math.random();
		Math.random();
	}

	public void method6163(int i, int i_4_) {
		try {
			synchronized (this.aClass348_6064) {
				this.aClass348_6064.method4186(i);
			}
			synchronized (this.aClass348_6065) {
				this.aClass348_6065.method4186(i);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ub.p(").append(')').toString());
		}
	}

	static final void method6164(ScriptRuntime class403, int i) {
		try {
			String string = (String) (class403.objectStack[(class403.objectArgs -= 969361751) * -203050393]);
			if (string != null)
				class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919) - 1] = string.length();
			else
				class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919) - 1] = 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ub.aaa(").append(')').toString());
		}
	}

	static final void method6165(int i, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_) {
		try {
			StaticMethods.method1041(i_6_);
			int i_11_ = 0;
			int i_12_ = i_6_ - i_9_;
			if (i_12_ < 0)
				i_12_ = 0;
			int i_13_ = i_6_;
			int i_14_ = -i_6_;
			int i_15_ = i_12_;
			int i_16_ = -i_12_;
			int i_17_ = -1;
			int i_18_ = -1;
			int[] is = Class372_Sub1.anIntArrayArray4047[i_5_];
			int i_19_ = i - i_12_;
			int i_20_ = i + i_12_;
			Class82_Sub22.method940(is, i - i_6_, i_19_, i_8_);
			Class82_Sub22.method940(is, i_19_, i_20_, i_7_);
			Class82_Sub22.method940(is, i_20_, i_6_ + i, i_8_);
			while (i_13_ > i_11_) {
				i_17_ += 2;
				i_18_ += 2;
				i_14_ += i_17_;
				i_16_ += i_18_;
				if (i_16_ >= 0 && i_15_ >= 1) {
					Class372_Sub1.anIntArray7727[i_15_] = i_11_;
					i_15_--;
					i_16_ -= i_15_ << 1;
				}
				i_11_++;
				if (i_14_ >= 0) {
					i_13_--;
					i_14_ -= i_13_ << 1;
					if (i_13_ >= i_12_) {
						int[] is_21_ = Class372_Sub1.anIntArrayArray4047[i_5_ + i_13_];
						int[] is_22_ = Class372_Sub1.anIntArrayArray4047[i_5_ - i_13_];
						int i_23_ = i + i_11_;
						int i_24_ = i - i_11_;
						Class82_Sub22.method940(is_21_, i_24_, i_23_, i_8_);
						Class82_Sub22.method940(is_22_, i_24_, i_23_, i_8_);
					} else {
						int[] is_25_ = Class372_Sub1.anIntArrayArray4047[i_5_ + i_13_];
						int[] is_26_ = Class372_Sub1.anIntArrayArray4047[i_5_ - i_13_];
						int i_27_ = Class372_Sub1.anIntArray7727[i_13_];
						int i_28_ = i + i_11_;
						int i_29_ = i - i_11_;
						int i_30_ = i_27_ + i;
						int i_31_ = i - i_27_;
						Class82_Sub22.method940(is_25_, i_29_, i_31_, i_8_);
						Class82_Sub22.method940(is_25_, i_31_, i_30_, i_7_);
						Class82_Sub22.method940(is_25_, i_30_, i_28_, i_8_);
						Class82_Sub22.method940(is_26_, i_29_, i_31_, i_8_);
						Class82_Sub22.method940(is_26_, i_31_, i_30_, i_7_);
						Class82_Sub22.method940(is_26_, i_30_, i_28_, i_8_);
					}
				}
				int[] is_32_ = Class372_Sub1.anIntArrayArray4047[i_5_ + i_11_];
				int[] is_33_ = Class372_Sub1.anIntArrayArray4047[i_5_ - i_11_];
				int i_34_ = i + i_13_;
				int i_35_ = i - i_13_;
				if (i_11_ < i_12_) {
					int i_36_ = (i_15_ < i_11_ ? Class372_Sub1.anIntArray7727[i_11_] : i_15_);
					int i_37_ = i_36_ + i;
					int i_38_ = i - i_36_;
					Class82_Sub22.method940(is_32_, i_35_, i_38_, i_8_);
					Class82_Sub22.method940(is_32_, i_38_, i_37_, i_7_);
					Class82_Sub22.method940(is_32_, i_37_, i_34_, i_8_);
					Class82_Sub22.method940(is_33_, i_35_, i_38_, i_8_);
					Class82_Sub22.method940(is_33_, i_38_, i_37_, i_7_);
					Class82_Sub22.method940(is_33_, i_37_, i_34_, i_8_);
				} else {
					Class82_Sub22.method940(is_32_, i_35_, i_34_, i_8_);
					Class82_Sub22.method940(is_33_, i_35_, i_34_, i_8_);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ub.r(").append(')').toString());
		}
	}
}
