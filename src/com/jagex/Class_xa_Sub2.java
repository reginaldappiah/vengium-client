package com.jagex;/* Class_xa_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.maths.Matrix4f;

public class Class_xa_Sub2 extends FloorToolkit {
	JavaGraphicsToolkit aClass_ra_Sub1_8484;
	float aFloat8485;
	float aFloat8486;
	static boolean aBoolean8487 = false;
	static int anInt8488 = 4;
	static int anInt8489 = 1;
	static boolean aBoolean8490 = true;
	Class20[][] aClass20ArrayArray8491;
	int anInt8492;
	Class6[][] aClass6ArrayArray8493;
	Class13[][] aClass13ArrayArray8494;
	Class9[][] aClass9ArrayArray8495;
	static int anInt8496 = -1694498816;
	float aFloat8497;
	float aFloat8498;
	float aFloat8499;
	float aFloat8500;
	float aFloat8501;
	float aFloat8502;
	static int anInt8503 = 64;
	float aFloat8504;
	float aFloat8505;
	float aFloat8506;
	float aFloat8507;
	float aFloat8508;
	float aFloat8509;
	float aFloat8510;
	float aFloat8511;
	byte[][] aByteArrayArray8512;
	byte[][] aByteArrayArray8513;
	static boolean aBoolean8514 = true;
	Class17[][] aClass17ArrayArray8515;
	static int anInt8516 = 2;

	public void LA(int i, int i_3_, int i_4_) {
		if (this.aByteArrayArray8513[i][i_3_] < i_4_)
			this.aByteArrayArray8513[i][i_3_] = (byte) i_4_;
	}

	public void method6336(int i, int i_5_, int[] is, int[] is_6_, int[] is_7_, int[] is_8_, int[] is_9_, int[] is_10_, int[] is_11_, int[] is_12_, int[] is_13_, int[] is_14_, int[] is_15_, Class78 class78, boolean bool) {
		if (this.aClass20ArrayArray8491 == null) {
			this.aClass20ArrayArray8491 = new Class20[anInt6287 * -506105871][anInt6286 * -1148794921];
			this.aClass9ArrayArray8495 = new Class9[anInt6287 * -506105871][anInt6286 * -1148794921];
		} else if (this.aClass6ArrayArray8493 != null || this.aClass17ArrayArray8515 != null)
			throw new IllegalStateException();
		boolean bool_16_ = false;
		if (is_12_.length == 2 && is_9_.length == 2 && (is_12_[0] == is_12_[1] || is_14_[0] != -1 && is_14_[0] == is_14_[1])) {
			bool_16_ = true;
			for (int i_17_ = 1; i_17_ < 2; i_17_++) {
				int i_18_ = is[is_9_[i_17_]];
				int i_19_ = is_7_[is_9_[i_17_]];
				if (i_18_ != 0 && i_18_ != anInt6288 * -1212653763 || i_19_ != 0 && i_19_ != anInt6288 * -1212653763) {
					bool_16_ = false;
					break;
				}
			}
		}
		if (!bool_16_) {
			Class9 class9 = new Class9();
			short i_20_ = (short) is.length;
			int i_21_ = (short) is_12_.length;
			class9.aShort115 = i_20_;
			class9.aShortArray121 = new short[i_20_];
			class9.aShortArray118 = new short[i_20_];
			class9.aShortArray119 = new short[i_20_];
			class9.aShortArray120 = new short[i_20_];
			for (int i_22_ = 0; i_22_ < i_20_; i_22_++) {
				int i_23_ = is[i_22_];
				int i_24_ = is_7_[i_22_];
				if (i_23_ == 0 && i_24_ == 0)
					class9.aShortArray121[i_22_] = (short) ((this.aByteArrayArray8512[i][i_5_]) - (this.aByteArrayArray8513[i][i_5_]));
				else if (i_23_ == 0 && i_24_ == anInt6288 * -1212653763)
					class9.aShortArray121[i_22_] = (short) ((this.aByteArrayArray8512[i][i_5_ + 1]) - (this.aByteArrayArray8513[i][i_5_ + 1]));
				else if (i_23_ == anInt6288 * -1212653763 && i_24_ == anInt6288 * -1212653763)
					class9.aShortArray121[i_22_] = (short) ((this.aByteArrayArray8512[i + 1][i_5_ + 1]) - (this.aByteArrayArray8513[i + 1][i_5_ + 1]));
				else if (i_23_ == anInt6288 * -1212653763 && i_24_ == 0)
					class9.aShortArray121[i_22_] = (short) ((this.aByteArrayArray8512[i + 1][i_5_]) - (this.aByteArrayArray8513[i + 1][i_5_]));
				else {
					int i_25_ = ((this.aByteArrayArray8512[i][i_5_] - (this.aByteArrayArray8513[i][i_5_])) * (anInt6288 * -1212653763 - i_23_) + ((this.aByteArrayArray8512[i + 1][i_5_]) - (this.aByteArrayArray8513[i + 1][i_5_])) * i_23_);
					int i_26_ = (((this.aByteArrayArray8512[i][i_5_ + 1]) - (this.aByteArrayArray8513[i][i_5_ + 1])) * (anInt6288 * -1212653763 - i_23_) + ((this.aByteArrayArray8512[i + 1][i_5_ + 1]) - (this.aByteArrayArray8513[i + 1][i_5_ + 1])) * i_23_);
					class9.aShortArray121[i_22_] = (short) ((i_25_ * (anInt6288 * -1212653763 - i_24_) + i_26_ * i_24_) >> anInt6289 * 20267538);
				}
				int i_27_ = (i << anInt6289 * -2137349879) + i_23_;
				int i_28_ = (i_5_ << anInt6289 * -2137349879) + i_24_;
				class9.aShortArray118[i_22_] = (short) i_23_;
				class9.aShortArray120[i_22_] = (short) i_24_;
				class9.aShortArray119[i_22_] = (short) (method6340(i_27_, i_28_) + (is_6_ != null ? is_6_[i_22_] : 0));
				if (class9.aShortArray121[i_22_] < 2)
					class9.aShortArray121[i_22_] = (short) 2;
			}
			boolean bool_29_ = false;
			int i_30_ = 0;
			for (int i_31_ = 0; i_31_ < i_21_; i_31_++) {
				if (is_12_[i_31_] >= 0 || is_13_ != null && is_13_[i_31_] >= 0)
					i_30_++;
				int i_32_ = is_14_[i_31_];
				if (i_32_ != -1) {
					Class53 class53 = this.aClass_ra_Sub1_8484.textures.method174(i_32_);
					if (!class53.aBoolean524) {
						bool_29_ = true;
						if (method6366(class53.aByte529) || class53.aByte535 != 0 || class53.aByte509 != 0)
							class9.aByte126 |= 0x4;
					}
				}
			}
			class9.anIntArray127 = new int[i_30_];
			if (is_13_ != null)
				class9.anIntArray128 = new int[i_30_];
			class9.aShortArray122 = new short[i_30_];
			class9.aShortArray117 = new short[i_30_];
			class9.aShortArray124 = new short[i_30_];
			if (bool_29_) {
				class9.aShortArray125 = new short[i_30_];
				class9.aShortArray116 = new short[i_30_];
			}
			for (int i_33_ = 0; i_33_ < i_21_; i_33_++) {
				if (is_12_[i_33_] >= 0 || is_13_ != null && is_13_[i_33_] >= 0) {
					if (is_12_[i_33_] >= 0)
						class9.anIntArray127[(class9.aShort123)] = Class173.method1823(is_12_[i_33_]);
					else
						class9.anIntArray127[(class9.aShort123)] = -1;
					if (is_13_ != null) {
						if (is_13_[i_33_] != -1)
							class9.anIntArray128[(class9.aShort123)] = Class173.method1823(is_13_[i_33_]);
						else
							class9.anIntArray128[(class9.aShort123)] = -1;
					}
					class9.aShortArray122[(class9.aShort123)] = (short) is_9_[i_33_];
					class9.aShortArray117[(class9.aShort123)] = (short) is_10_[i_33_];
					class9.aShortArray124[(class9.aShort123)] = (short) is_11_[i_33_];
					if (bool_29_) {
						if (is_14_[i_33_] != -1 && !(this.aClass_ra_Sub1_8484.textures.method174(is_14_[i_33_]).aBoolean524)) {
							class9.aShortArray125[(class9.aShort123)] = (short) is_14_[i_33_];
							class9.aShortArray116[(class9.aShort123)] = (short) is_15_[i_33_];
						} else
							class9.aShortArray125[(class9.aShort123)] = (short) -1;
					}
					class9.aShort123++;
				}
			}
			this.aClass9ArrayArray8495[i][i_5_] = class9;
		} else if (is_12_[0] >= 0 || is_13_ != null && is_13_[0] >= 0) {
			Class20 class20 = new Class20();
			int i_34_ = is_12_[0];
			int i_35_ = is_14_[0];
			if (is_13_ != null) {
				class20.anInt271 = Class195.method1873(Class173.method1823(is_13_[0]), ((this.aByteArrayArray8512[i][i_5_]) - (this.aByteArrayArray8513[i][i_5_])));
				if (i_34_ == -1)
					class20.aByte268 |= 0x2;
			}
			if ((anIntArrayArray6290[i][i_5_] == anIntArrayArray6290[i + 1][i_5_]) && (anIntArrayArray6290[i][i_5_] == anIntArrayArray6290[i + 1][i_5_ + 1]) && (anIntArrayArray6290[i][i_5_] == anIntArrayArray6290[i][i_5_ + 1]))
				class20.aByte268 |= 0x1;
			Class53 class53 = null;
			if (i_35_ != -1)
				class53 = this.aClass_ra_Sub1_8484.textures.method174(i_35_);
			if (class53 != null && (class20.aByte268 & 0x2) == 0 && !class53.aBoolean524) {
				class20.aShort272 = (short) ((this.aByteArrayArray8512[i][i_5_]) - (this.aByteArrayArray8513[i][i_5_]));
				class20.aShort269 = (short) ((this.aByteArrayArray8512[i + 1][i_5_]) - (this.aByteArrayArray8513[i + 1][i_5_]));
				class20.aShort270 = (short) ((this.aByteArrayArray8512[i + 1][i_5_ + 1]) - (this.aByteArrayArray8513[i + 1][i_5_ + 1]));
				class20.aShort267 = (short) ((this.aByteArrayArray8512[i][i_5_ + 1]) - (this.aByteArrayArray8513[i][i_5_ + 1]));
				class20.aShort273 = (short) i_35_;
				if (method6366(class53.aByte529) || class53.aByte535 != 0 || class53.aByte509 != 0)
					class20.aByte268 |= 0x4;
			} else {
				short i_36_ = Class173.method1823(i_34_);
				class20.aShort272 = (short) Class195.method1873(i_36_, ((this.aByteArrayArray8512[i][i_5_]) - (this.aByteArrayArray8513[i][i_5_])));
				class20.aShort269 = (short) Class195.method1873(i_36_, ((this.aByteArrayArray8512[i + 1][i_5_]) - (this.aByteArrayArray8513[i + 1][i_5_])));
				class20.aShort270 = (short) Class195.method1873(i_36_, ((this.aByteArrayArray8512[i + 1][i_5_ + 1]) - (this.aByteArrayArray8513[i + 1][i_5_ + 1])));
				class20.aShort267 = (short) Class195.method1873(i_36_, ((this.aByteArrayArray8512[i][i_5_ + 1]) - (this.aByteArrayArray8513[i][i_5_ + 1])));
				class20.aShort273 = (short) -1;
			}
			this.aClass20ArrayArray8491[i][i_5_] = class20;
		}
	}

	boolean method6366(int i) {
		if ((this.anInt8492 & 0x8) == 0)
			return false;
		if (i == 4)
			return true;
		if (i == 8)
			return true;
        return i == 9;
    }

	static int method6367(int i, int i_37_) {
		int i_38_ = (i & 0xff0000) * i_37_ >> 23;
		if (i_38_ < 2)
			i_38_ = 2;
		else if (i_38_ > 253)
			i_38_ = 253;
		int i_39_ = (i & 0xff00) * i_37_ >> 15;
		if (i_39_ < 2)
			i_39_ = 2;
		else if (i_39_ > 253)
			i_39_ = 253;
		int i_40_ = (i & 0xff) * i_37_ >> 7;
		if (i_40_ < 2)
			i_40_ = 2;
		else if (i_40_ > 253)
			i_40_ = 253;
		return i_38_ << 16 | i_39_ << 8 | i_40_;
	}

	public void SA() {
		this.aByteArrayArray8512 = null;
		this.aByteArrayArray8513 = null;
	}

	public void method6335(int i, int i_41_, int[] is, int[] is_42_, int[] is_43_, int[] is_44_, int[] is_45_, int[] is_46_, int[] is_47_, int[] is_48_, Class78 class78, boolean bool) {
		boolean bool_49_ = (this.anInt8492 & 0x20) == 0;
		if (this.aClass6ArrayArray8493 == null && !bool_49_) {
			this.aClass6ArrayArray8493 = new Class6[anInt6287 * -506105871][anInt6286 * -1148794921];
			this.aClass13ArrayArray8494 = new Class13[anInt6287 * -506105871][anInt6286 * -1148794921];
		} else if (this.aClass17ArrayArray8515 == null && bool_49_)
			this.aClass17ArrayArray8515 = new Class17[anInt6287 * -506105871][anInt6286 * -1148794921];
		else if (this.aClass20ArrayArray8491 != null)
			throw new IllegalStateException();
		if (is != null && is.length != 0) {
			for (int i_50_ = 0; i_50_ < is_45_.length; i_50_++) {
				if (is_45_[i_50_] == -1)
					is_45_[i_50_] = 0;
				else
					is_45_[i_50_] = (Class379.anIntArray4096[(Class173.method1823(is_45_[i_50_]) & 0xffff)]) << 8 | 0xff;
			}
			if (is_46_ != null) {
				for (int i_51_ = 0; i_51_ < is_46_.length; i_51_++) {
					if (is_46_[i_51_] == -1)
						is_46_[i_51_] = 0;
					else
						is_46_[i_51_] = (Class379.anIntArray4096[(Class173.method1823(is_46_[i_51_]) & 0xffff)]) << 8 | 0xff;
				}
			}
			if (bool_49_) {
				Class17 class17 = new Class17();
				class17.aShort234 = (short) is.length;
				class17.aShort236 = (short) (is.length / 3);
				class17.aShortArray235 = new short[class17.aShort234];
				class17.aShortArray241 = new short[class17.aShort234];
				class17.aShortArray243 = new short[class17.aShort234];
				class17.anIntArray237 = new int[class17.aShort234];
				class17.aShortArray239 = new short[class17.aShort234];
				class17.aShortArray240 = new short[class17.aShort234];
				class17.aByteArray242 = new byte[class17.aShort234];
				if (is_44_ != null)
					class17.aShortArray238 = new short[class17.aShort234];
				for (int i_52_ = 0; i_52_ < class17.aShort234; i_52_++) {
					int i_53_ = is[i_52_];
					int i_54_ = is_43_[i_52_];
					boolean bool_55_ = false;
					int i_56_;
					if (i_53_ == 0 && i_54_ == 0)
						i_56_ = ((this.aByteArrayArray8512[i][i_41_]) - (this.aByteArrayArray8513[i][i_41_]));
					else if (i_53_ == 0 && i_54_ == anInt6288 * -1212653763)
						i_56_ = ((this.aByteArrayArray8512[i][i_41_ + 1]) - (this.aByteArrayArray8513[i][i_41_ + 1]));
					else if (i_53_ == anInt6288 * -1212653763 && i_54_ == anInt6288 * -1212653763)
						i_56_ = ((this.aByteArrayArray8512[i + 1][i_41_ + 1]) - (this.aByteArrayArray8513[i + 1][i_41_ + 1]));
					else if (i_53_ == anInt6288 * -1212653763 && i_54_ == 0)
						i_56_ = ((this.aByteArrayArray8512[i + 1][i_41_]) - (this.aByteArrayArray8513[i + 1][i_41_]));
					else {
						int i_57_ = ((((this.aByteArrayArray8512[i][i_41_]) - (this.aByteArrayArray8513[i][i_41_])) * (anInt6288 * -1212653763 - i_53_)) + ((this.aByteArrayArray8512[i + 1][i_41_]) - (this.aByteArrayArray8513[i + 1][i_41_])) * i_53_);
						int i_58_ = ((((this.aByteArrayArray8512[i][i_41_ + 1]) - (this.aByteArrayArray8513[i][i_41_ + 1])) * (anInt6288 * -1212653763 - i_53_)) + ((this.aByteArrayArray8512[i + 1][i_41_ + 1]) - (this.aByteArrayArray8513[i + 1][i_41_ + 1])) * i_53_);
						i_56_ = (i_57_ * (anInt6288 * -1212653763 - i_54_) + i_58_ * i_54_) >> anInt6289 * 20267538;
					}
					int i_59_ = (i << anInt6289 * -2137349879) + i_53_;
					int i_60_ = (i_41_ << anInt6289 * -2137349879) + i_54_;
					class17.aShortArray235[i_52_] = (short) i_53_;
					class17.aShortArray243[i_52_] = (short) i_54_;
					class17.aShortArray241[i_52_] = (short) (method6340(i_59_, i_60_) + (is_42_ != null ? is_42_[i_52_] : 0));
					if (i_56_ < 0)
						i_56_ = 0;
					if (is_45_[i_52_] == 0) {
						class17.anIntArray237[i_52_] = 0;
						if (is_46_ != null)
							class17.aByteArray242[i_52_] = (byte) i_56_;
					} else {
						int i_61_ = 0;
						if (is_44_ != null) {
							int i_62_ = (class17.aShortArray238[i_52_] = (short) is_44_[i_52_]);
							if (class78.anInt725 * 1996750669 != 0) {
								i_61_ = 255 * i_62_ / (class78.anInt725 * 1996750669);
								if (i_61_ < 0)
									i_61_ = 0;
								else if (i_61_ > 255)
									i_61_ = 255;
							}
						}
						int i_63_ = -16777216;
						if (is_47_[i_52_] != -1 && method6366(this.aClass_ra_Sub1_8484.textures.method174(is_47_[i_52_]).aByte529))
							i_63_ = -1694498816;
						class17.anIntArray237[i_52_] = i_63_ | (Class298_Sub32_Sub38.method3387(method6367(is_45_[i_52_] >> 8, i_56_), class78.anInt726 * -1212608691, i_61_));
						if (is_46_ != null)
							class17.aByteArray242[i_52_] = (byte) i_56_;
					}
					class17.aShortArray239[i_52_] = (short) is_47_[i_52_];
					class17.aShortArray240[i_52_] = (short) is_48_[i_52_];
				}
				if (is_46_ != null)
					class17.anIntArray233 = new int[class17.aShort236];
				for (int i_64_ = 0; i_64_ < class17.aShort236; i_64_++) {
					int i_65_ = i_64_ * 3;
					if (is_46_ != null && is_46_[i_65_] != 0)
						class17.anIntArray233[i_64_] = ~0xffffff | is_46_[i_65_] >> 8;
				}
				this.aClass17ArrayArray8515[i][i_41_] = class17;
			} else {
				boolean bool_66_ = true;
				int i_67_ = -1;
				int i_68_ = -1;
				int i_69_ = -1;
				int i_70_ = -1;
				if (is.length == 6) {
					for (int i_71_ = 0; i_71_ < 6; i_71_++) {
						if (is[i_71_] == 0 && is_43_[i_71_] == 0) {
							if (i_67_ != -1 && is_45_[i_67_] != is_45_[i_71_]) {
								bool_66_ = false;
								break;
							}
							i_67_ = i_71_;
						} else if (is[i_71_] == anInt6288 * -1212653763 && is_43_[i_71_] == 0) {
							if (i_68_ != -1 && is_45_[i_68_] != is_45_[i_71_]) {
								bool_66_ = false;
								break;
							}
							i_68_ = i_71_;
						} else if (is[i_71_] == anInt6288 * -1212653763 && (is_43_[i_71_] == anInt6288 * -1212653763)) {
							if (i_69_ != -1 && is_45_[i_69_] != is_45_[i_71_]) {
								bool_66_ = false;
								break;
							}
							i_69_ = i_71_;
						} else if (is[i_71_] == 0 && (is_43_[i_71_] == anInt6288 * -1212653763)) {
							if (i_70_ != -1 && is_45_[i_70_] != is_45_[i_71_]) {
								bool_66_ = false;
								break;
							}
							i_70_ = i_71_;
						}
					}
					if (i_67_ == -1 || i_68_ == -1 || i_69_ == -1 || i_70_ == -1)
						bool_66_ = false;
					if (bool_66_) {
						if (is_42_ != null) {
							for (int i_72_ = 0; i_72_ < 4; i_72_++) {
								if (is_42_[i_72_] != 0) {
									bool_66_ = false;
									break;
								}
							}
						}
						if (bool_66_) {
							for (int i_73_ = 1; i_73_ < 4; i_73_++) {
								if (is[i_73_] != is[0] && (is[i_73_] != is[0] + anInt6288 * -1212653763) && (is[i_73_] != is[0] - anInt6288 * -1212653763)) {
									bool_66_ = false;
									break;
								}
								if (is_43_[i_73_] != is_43_[0] && (is_43_[i_73_] != is_43_[0] + anInt6288 * -1212653763) && (is_43_[i_73_] != (is_43_[0] - anInt6288 * -1212653763))) {
									bool_66_ = false;
									break;
								}
							}
						}
					}
				} else
					bool_66_ = false;
				if (bool_66_) {
					Class6 class6 = new Class6();
					int i_74_ = is_45_[0];
					int i_75_ = is_47_[0];
					if (is_46_ != null) {
						class6.anInt90 = is_46_[0] >> 8;
						if (i_74_ == 0)
							class6.aByte85 |= 0x2;
					} else if (i_74_ == 0)
						return;
					if ((anIntArrayArray6290[i][i_41_] == anIntArrayArray6290[i + 1][i_41_]) && (anIntArrayArray6290[i][i_41_] == anIntArrayArray6290[i + 1][i_41_ + 1]) && (anIntArrayArray6290[i][i_41_] == anIntArrayArray6290[i][i_41_ + 1]))
						class6.aByte85 |= 0x1;
					if (i_75_ != -1 && (class6.aByte85 & 0x2) == 0 && !(this.aClass_ra_Sub1_8484.textures.method174(i_75_).aBoolean524)) {
						int i_76_;
						if (is_44_ != null && class78.anInt725 * 1996750669 != 0) {
							i_76_ = 255 * is_44_[i_67_] / (class78.anInt725 * 1996750669);
							if (i_76_ < 0)
								i_76_ = 0;
							else if (i_76_ > 255)
								i_76_ = 255;
						} else
							i_76_ = 0;
						class6.anInt82 = (Class298_Sub32_Sub38.method3387(method6367(is_45_[i_67_] >> 8, ((this.aByteArrayArray8512[i][i_41_]) - (this.aByteArrayArray8513[i][i_41_]))), class78.anInt726 * -1212608691, i_76_));
						if (class6.anInt90 != 0)
							class6.anInt82 |= (255 - ((this.aByteArrayArray8512[i][i_41_]) - (this.aByteArrayArray8513[i][i_41_])) << 25);
						if (is_44_ != null && class78.anInt725 * 1996750669 != 0) {
							i_76_ = 255 * is_44_[i_68_] / (class78.anInt725 * 1996750669);
							if (i_76_ < 0)
								i_76_ = 0;
							else if (i_76_ > 255)
								i_76_ = 255;
						} else
							i_76_ = 0;
						class6.anInt83 = (Class298_Sub32_Sub38.method3387(method6367(is_45_[i_68_] >> 8, ((this.aByteArrayArray8512[i + 1][i_41_]) - (this.aByteArrayArray8513[i + 1][i_41_]))), class78.anInt726 * -1212608691, i_76_));
						if (class6.anInt90 != 0)
							class6.anInt83 |= 255 - ((this.aByteArrayArray8512[i + 1][i_41_]) - (this.aByteArrayArray8513[i + 1][i_41_])) << 25;
						if (is_44_ != null && class78.anInt725 * 1996750669 != 0) {
							i_76_ = 255 * is_44_[i_69_] / (class78.anInt725 * 1996750669);
							if (i_76_ < 0)
								i_76_ = 0;
							else if (i_76_ > 255)
								i_76_ = 255;
						} else
							i_76_ = 0;
						class6.anInt81 = (Class298_Sub32_Sub38.method3387(method6367(is_45_[i_69_] >> 8, ((this.aByteArrayArray8512[i + 1][i_41_ + 1]) - (this.aByteArrayArray8513[i + 1][i_41_ + 1]))), class78.anInt726 * -1212608691, i_76_));
						if (class6.anInt90 != 0)
							class6.anInt81 |= 255 - ((this.aByteArrayArray8512[i + 1][i_41_ + 1]) - (this.aByteArrayArray8513[i + 1][i_41_ + 1])) << 25;
						if (is_44_ != null && class78.anInt725 * 1996750669 != 0) {
							i_76_ = 255 * is_44_[i_70_] / (class78.anInt725 * 1996750669);
							if (i_76_ < 0)
								i_76_ = 0;
							else if (i_76_ > 255)
								i_76_ = 255;
						} else
							i_76_ = 0;
						class6.anInt89 = (Class298_Sub32_Sub38.method3387(method6367(is_45_[i_70_] >> 8, ((this.aByteArrayArray8512[i][i_41_ + 1]) - (this.aByteArrayArray8513[i][i_41_ + 1]))), class78.anInt726 * -1212608691, i_76_));
						class6.aShort91 = (short) i_75_;
					} else {
						int i_77_;
						if (is_44_ != null && class78.anInt725 * 1996750669 != 0) {
							i_77_ = 255 * is_44_[i_67_] / (class78.anInt725 * 1996750669);
							if (i_77_ < 0)
								i_77_ = 0;
							else if (i_77_ > 255)
								i_77_ = 255;
						} else
							i_77_ = 0;
						class6.anInt82 = (Class298_Sub32_Sub38.method3387(method6367(is_45_[i_67_] >> 8, ((this.aByteArrayArray8512[i][i_41_]) - (this.aByteArrayArray8513[i][i_41_]))), class78.anInt726 * -1212608691, i_77_));
						if (class6.anInt90 != 0)
							class6.anInt82 |= (255 - ((this.aByteArrayArray8512[i][i_41_]) - (this.aByteArrayArray8513[i][i_41_])) << 25);
						if (is_44_ != null && class78.anInt725 * 1996750669 != 0) {
							i_77_ = 255 * is_44_[i_68_] / (class78.anInt725 * 1996750669);
							if (i_77_ < 0)
								i_77_ = 0;
							else if (i_77_ > 255)
								i_77_ = 255;
						} else
							i_77_ = 0;
						class6.anInt83 = (Class298_Sub32_Sub38.method3387(method6367(is_45_[i_68_] >> 8, ((this.aByteArrayArray8512[i + 1][i_41_]) - (this.aByteArrayArray8513[i + 1][i_41_]))), class78.anInt726 * -1212608691, i_77_));
						if (class6.anInt90 != 0)
							class6.anInt83 |= 255 - ((this.aByteArrayArray8512[i + 1][i_41_]) - (this.aByteArrayArray8513[i + 1][i_41_])) << 25;
						if (is_44_ != null && class78.anInt725 * 1996750669 != 0) {
							i_77_ = 255 * is_44_[i_69_] / (class78.anInt725 * 1996750669);
							if (i_77_ < 0)
								i_77_ = 0;
							else if (i_77_ > 255)
								i_77_ = 255;
						} else
							i_77_ = 0;
						class6.anInt81 = (Class298_Sub32_Sub38.method3387(method6367(is_45_[i_69_] >> 8, ((this.aByteArrayArray8512[i + 1][i_41_ + 1]) - (this.aByteArrayArray8513[i + 1][i_41_ + 1]))), class78.anInt726 * -1212608691, i_77_));
						if (class6.anInt90 != 0)
							class6.anInt81 |= 255 - ((this.aByteArrayArray8512[i + 1][i_41_ + 1]) - (this.aByteArrayArray8513[i + 1][i_41_ + 1])) << 25;
						if (is_44_ != null && class78.anInt725 * 1996750669 != 0) {
							i_77_ = 255 * is_44_[i_70_] / (class78.anInt725 * 1996750669);
							if (i_77_ < 0)
								i_77_ = 0;
							else if (i_77_ > 255)
								i_77_ = 255;
						} else
							i_77_ = 0;
						class6.anInt89 = (Class298_Sub32_Sub38.method3387(method6367(is_45_[i_70_] >> 8, ((this.aByteArrayArray8512[i][i_41_ + 1]) - (this.aByteArrayArray8513[i][i_41_ + 1]))), class78.anInt726 * -1212608691, i_77_));
						if (class6.anInt90 != 0)
							class6.anInt89 |= 255 - ((this.aByteArrayArray8512[i][i_41_ + 1]) - (this.aByteArrayArray8513[i][i_41_ + 1])) << 25;
						class6.aShort91 = (short) -1;
					}
					if (is_44_ != null) {
						class6.aShort88 = (short) is_44_[i_69_];
						class6.aShort86 = (short) is_44_[i_70_];
						class6.aShort87 = (short) is_44_[i_68_];
						class6.aShort84 = (short) is_44_[i_67_];
					}
					this.aClass6ArrayArray8493[i][i_41_] = class6;
				} else {
					Class13 class13 = new Class13();
					class13.aShort158 = (short) is.length;
					class13.aShort167 = (short) (is.length / 3);
					class13.aShortArray157 = new short[class13.aShort158];
					class13.aShortArray161 = new short[class13.aShort158];
					class13.aShortArray162 = new short[class13.aShort158];
					class13.anIntArray164 = new int[class13.aShort158];
					if (is_44_ != null)
						class13.aShortArray165 = new short[class13.aShort158];
					for (int i_78_ = 0; i_78_ < class13.aShort158; i_78_++) {
						int i_79_ = is[i_78_];
						int i_80_ = is_43_[i_78_];
						boolean bool_81_ = false;
						int i_82_;
						if (i_79_ == 0 && i_80_ == 0)
							i_82_ = ((this.aByteArrayArray8512[i][i_41_]) - (this.aByteArrayArray8513[i][i_41_]));
						else if (i_79_ == 0 && i_80_ == anInt6288 * -1212653763)
							i_82_ = ((this.aByteArrayArray8512[i][i_41_ + 1]) - (this.aByteArrayArray8513[i][i_41_ + 1]));
						else if (i_79_ == anInt6288 * -1212653763 && i_80_ == anInt6288 * -1212653763)
							i_82_ = ((this.aByteArrayArray8512[i + 1][i_41_ + 1]) - (this.aByteArrayArray8513[i + 1][i_41_ + 1]));
						else if (i_79_ == anInt6288 * -1212653763 && i_80_ == 0)
							i_82_ = ((this.aByteArrayArray8512[i + 1][i_41_]) - (this.aByteArrayArray8513[i + 1][i_41_]));
						else {
							int i_83_ = ((((this.aByteArrayArray8512[i][i_41_]) - (this.aByteArrayArray8513[i][i_41_])) * (anInt6288 * -1212653763 - i_79_)) + (((this.aByteArrayArray8512[i + 1][i_41_]) - (this.aByteArrayArray8513[i + 1][i_41_])) * i_79_));
							int i_84_ = ((((this.aByteArrayArray8512[i][i_41_ + 1]) - (this.aByteArrayArray8513[i][i_41_ + 1])) * (anInt6288 * -1212653763 - i_79_)) + ((this.aByteArrayArray8512[i + 1][i_41_ + 1]) - (this.aByteArrayArray8513[i + 1][i_41_ + 1])) * i_79_);
							i_82_ = (i_83_ * (anInt6288 * -1212653763 - i_80_) + i_84_ * i_80_) >> anInt6289 * 20267538;
						}
						int i_85_ = (i << anInt6289 * -2137349879) + i_79_;
						int i_86_ = (i_41_ << anInt6289 * -2137349879) + i_80_;
						class13.aShortArray157[i_78_] = (short) i_79_;
						class13.aShortArray162[i_78_] = (short) i_80_;
						class13.aShortArray161[i_78_] = (short) (method6340(i_85_, i_86_) + (is_42_ != null ? is_42_[i_78_] : 0));
						if (i_82_ < 0)
							i_82_ = 0;
						if (is_45_[i_78_] == 0) {
							if (is_46_ != null)
								class13.anIntArray164[i_78_] = i_82_ << 25;
							else
								class13.anIntArray164[i_78_] = 0;
						} else {
							int i_87_ = 0;
							if (is_44_ != null) {
								int i_88_ = (class13.aShortArray165[i_78_] = (short) is_44_[i_78_]);
								if (class78.anInt725 * 1996750669 != 0) {
									i_87_ = 255 * i_88_ / (class78.anInt725 * 1996750669);
									if (i_87_ < 0)
										i_87_ = 0;
									else if (i_87_ > 255)
										i_87_ = 255;
								}
							}
							class13.anIntArray164[i_78_] = (Class298_Sub32_Sub38.method3387(method6367(is_45_[i_78_] >> 8, i_82_), class78.anInt726 * -1212608691, i_87_));
							if (is_46_ != null)
								class13.anIntArray164[i_78_] |= i_82_ << 25;
						}
					}
					boolean bool_89_ = false;
					for (int i_90_ = 0; i_90_ < class13.aShort167; i_90_++) {
						if (is_47_[i_90_ * 3] != -1 && !(this.aClass_ra_Sub1_8484.textures.method174(is_47_[i_90_ * 3]).aBoolean524))
							bool_89_ = true;
					}
					if (is_46_ != null)
						class13.anIntArray163 = new int[class13.aShort167];
					if (bool_89_) {
						class13.aShortArray166 = new short[class13.aShort167];
						class13.aShortArray160 = new short[class13.aShort167];
					}
					for (int i_91_ = 0; i_91_ < class13.aShort167; i_91_++) {
						int i_92_ = i_91_ * 3;
						if (is_46_ != null && is_46_[i_92_] != 0)
							class13.anIntArray163[i_91_] = is_46_[i_92_] >> 8;
						if (bool_89_) {
							int i_93_ = i_92_ + 1;
							int i_94_ = i_93_ + 1;
							boolean bool_95_ = false;
							boolean bool_96_ = true;
							int i_97_ = is_47_[i_92_];
							if (i_97_ == -1 || (this.aClass_ra_Sub1_8484.textures.method174(i_97_).aBoolean524))
								bool_96_ = false;
							else
								bool_95_ = true;
							i_97_ = is_47_[i_93_];
							if (i_97_ == -1 || (this.aClass_ra_Sub1_8484.textures.method174(i_97_).aBoolean524))
								bool_96_ = false;
							else
								bool_95_ = true;
							i_97_ = is_47_[i_94_];
							if (i_97_ == -1 || (this.aClass_ra_Sub1_8484.textures.method174(i_97_).aBoolean524))
								bool_96_ = false;
							else
								bool_95_ = true;
							if (bool_96_) {
								class13.aShortArray166[i_91_] = (short) i_97_;
								class13.aShortArray160[i_91_] = (short) is_48_[i_92_];
							} else {
								if (bool_95_) {
									i_97_ = is_47_[i_92_];
									if (i_97_ != -1 && !(this.aClass_ra_Sub1_8484.textures.method174(i_97_).aBoolean524))
										class13.anIntArray164[i_92_] = (Class379.anIntArray4096[(Class173.method1823((this.aClass_ra_Sub1_8484.textures.method174(i_97_).aShort532) & 0xffff)) & 0xffff]);
									i_97_ = is_47_[i_93_];
									if (i_97_ != -1 && !(this.aClass_ra_Sub1_8484.textures.method174(i_97_).aBoolean524))
										class13.anIntArray164[i_93_] = (Class379.anIntArray4096[(Class173.method1823((this.aClass_ra_Sub1_8484.textures.method174(i_97_).aShort532) & 0xffff)) & 0xffff]);
									i_97_ = is_47_[i_94_];
									if (i_97_ != -1 && !(this.aClass_ra_Sub1_8484.textures.method174(i_97_).aBoolean524))
										class13.anIntArray164[i_94_] = (Class379.anIntArray4096[(Class173.method1823((this.aClass_ra_Sub1_8484.textures.method174(i_97_).aShort532) & 0xffff)) & 0xffff]);
								}
								class13.aShortArray166[i_91_] = (short) -1;
							}
						}
					}
					this.aClass13ArrayArray8494[i][i_41_] = class13;
				}
			}
		}
	}

	void method6368(int i, int i_98_, int i_99_) {
		Class15 class15 = this.aClass_ra_Sub1_8484.method5202(Thread.currentThread());
		class15.aClass2_192.anInt19 = 0;
		if (this.aClass6ArrayArray8493 != null)
			method6369(i, i_98_, class15.aBoolean186, class15, class15.aClass2_192, class15.aFloatArray218, class15.aFloatArray181, class15.aFloatArray223, class15.aFloatArray221, class15.aFloatArray222, i_99_);
		else if (this.aClass20ArrayArray8491 != null)
			method6372(i, i_98_, class15.aClass2_192, class15.aFloatArray218, class15.aFloatArray181, class15.aFloatArray223, class15.aFloatArray221, class15.aFloatArray222, i_99_);
		else if (this.aClass17ArrayArray8515 != null)
			method6370(i, i_98_, class15.aBoolean186, class15, class15.aClass2_192, class15.aFloatArray218, class15.aFloatArray181, class15.aFloatArray223, class15.aFloatArray221, class15.aFloatArray222, i_99_);
	}

	void method6369(int i, int i_132_, boolean bool, Class15 class15, Class2 class2, float[] fs, float[] fs_133_, float[] fs_134_, float[] fs_135_, float[] fs_136_, int i_137_) {
		Class6 class6 = this.aClass6ArrayArray8493[i][i_132_];
		if (class6 != null) {
			if ((class6.aByte85 & 0x2) == 0) {
				if (i_137_ != 0) {
					if ((class6.aByte85 & 0x4) != 0) {
						if ((i_137_ & 0x1) != 0)
							return;
					} else if ((i_137_ & 0x2) != 0)
						return;
				}
				int i_138_ = i * (anInt6288 * -1212653763);
				int i_139_ = i_138_ + anInt6288 * -1212653763;
				int i_140_ = i_132_ * (anInt6288 * -1212653763);
				int i_141_ = i_140_ + anInt6288 * -1212653763;
				float f = 0.0F;
				float f_142_ = 0.0F;
				float f_143_ = 0.0F;
				float f_144_ = 0.0F;
				float f_145_;
				float f_146_;
				float f_147_;
				float f_148_;
				float f_149_;
				float f_150_;
				float f_151_;
				float f_152_;
				float f_153_;
				float f_154_;
				float f_155_;
				float f_156_;
				float f_157_;
				float f_158_;
				float f_159_;
				float f_160_;
				if ((class6.aByte85 & 0x1) != 0 && !bool) {
					int i_161_ = anIntArrayArray6290[i][i_132_];
					float f_162_ = this.aFloat8502 * (float) i_161_;
					float f_163_ = this.aFloat8486 * (float) i_161_;
					float f_164_ = (this.aFloat8510 + ((this.aFloat8498 * (float) i_138_) + f_162_ + (this.aFloat8506 * (float) i_140_)));
					f_145_ = (this.aFloat8511 + ((this.aFloat8485 * (float) i_138_) + f_163_ + (this.aFloat8507 * (float) i_140_)));
					if (f_164_ < -f_145_)
						return;
					float f_165_ = (this.aFloat8510 + ((this.aFloat8498 * (float) i_139_) + f_162_ + (this.aFloat8506 * (float) i_140_)));
					f_146_ = (this.aFloat8511 + ((this.aFloat8485 * (float) i_139_) + f_163_ + (this.aFloat8507 * (float) i_140_)));
					if (f_165_ < -f_146_)
						return;
					float f_166_ = (this.aFloat8510 + ((this.aFloat8498 * (float) i_139_) + f_162_ + (this.aFloat8506 * (float) i_141_)));
					f_147_ = (this.aFloat8511 + ((this.aFloat8485 * (float) i_139_) + f_163_ + (this.aFloat8507 * (float) i_141_)));
					if (f_166_ < -f_147_)
						return;
					float f_167_ = (this.aFloat8510 + ((this.aFloat8498 * (float) i_138_) + f_162_ + (this.aFloat8506 * (float) i_141_)));
					f_148_ = (this.aFloat8511 + ((this.aFloat8485 * (float) i_138_) + f_163_ + (this.aFloat8507 * (float) i_141_)));
					if (f_167_ < -f_148_)
						return;
					f_149_ = (class2.aFloat27 + class2.aFloat46 * f_164_ / f_145_);
					f_150_ = (class2.aFloat27 + class2.aFloat46 * f_165_ / f_146_);
					f_151_ = (class2.aFloat27 + class2.aFloat46 * f_166_ / f_147_);
					f_152_ = (class2.aFloat27 + class2.aFloat46 * f_167_ / f_148_);
					if (class15.aBoolean216) {
						float f_168_ = f_164_ - class15.aFloat205;
						if (f_168_ > 0.0F) {
							f = f_168_ / class15.aFloat183;
							if (f > 1.0F)
								f = 1.0F;
						}
						f_168_ = f_165_ - class15.aFloat205;
						if (f_168_ > 0.0F) {
							f_142_ = f_168_ / class15.aFloat183;
							if (f_142_ > 1.0F)
								f_142_ = 1.0F;
						}
						f_168_ = f_166_ - class15.aFloat205;
						if (f_168_ > 0.0F) {
							f_143_ = f_168_ / class15.aFloat183;
							if (f_143_ > 1.0F)
								f_143_ = 1.0F;
						}
						f_168_ = f_167_ - class15.aFloat205;
						if (f_168_ > 0.0F) {
							f_144_ = f_168_ / class15.aFloat183;
							if (f_144_ > 1.0F)
								f_144_ = 1.0F;
						}
					}
					float f_169_ = this.aFloat8500 * (float) i_161_;
					float f_170_ = this.aFloat8501 * (float) i_161_;
					float f_171_ = (this.aFloat8508 + ((this.aFloat8499 * (float) i_138_) + f_169_ + (this.aFloat8504 * (float) i_140_)));
					f_153_ = (class2.aFloat23 + class2.aFloat17 * f_171_ / f_145_);
					float f_172_ = (this.aFloat8509 + ((this.aFloat8497 * (float) i_138_) + f_170_ + (this.aFloat8505 * (float) i_140_)));
					f_154_ = (class2.aFloat25 + class2.aFloat26 * f_172_ / f_145_);
					float f_173_ = (this.aFloat8508 + ((this.aFloat8499 * (float) i_139_) + f_169_ + (this.aFloat8504 * (float) i_140_)));
					f_155_ = (class2.aFloat23 + class2.aFloat17 * f_173_ / f_146_);
					float f_174_ = (this.aFloat8509 + ((this.aFloat8497 * (float) i_139_) + f_170_ + (this.aFloat8505 * (float) i_140_)));
					f_156_ = (class2.aFloat25 + class2.aFloat26 * f_174_ / f_146_);
					float f_175_ = (this.aFloat8508 + ((this.aFloat8499 * (float) i_139_) + f_169_ + (this.aFloat8504 * (float) i_141_)));
					f_157_ = (class2.aFloat23 + class2.aFloat17 * f_175_ / f_147_);
					float f_176_ = (this.aFloat8509 + ((this.aFloat8497 * (float) i_139_) + f_170_ + (this.aFloat8505 * (float) i_141_)));
					f_158_ = (class2.aFloat25 + class2.aFloat26 * f_176_ / f_147_);
					float f_177_ = (this.aFloat8508 + ((this.aFloat8499 * (float) i_138_) + f_169_ + (this.aFloat8504 * (float) i_141_)));
					f_159_ = (class2.aFloat23 + class2.aFloat17 * f_177_ / f_148_);
					float f_178_ = (this.aFloat8509 + ((this.aFloat8497 * (float) i_138_) + f_170_ + (this.aFloat8505 * (float) i_141_)));
					f_160_ = (class2.aFloat25 + class2.aFloat26 * f_178_ / f_148_);
				} else {
					int i_179_ = anIntArrayArray6290[i][i_132_];
					int i_180_ = anIntArrayArray6290[i + 1][i_132_];
					int i_181_ = anIntArrayArray6290[i + 1][i_132_ + 1];
					int i_182_ = anIntArrayArray6290[i][i_132_ + 1];
					float f_183_ = (this.aFloat8510 + ((this.aFloat8498 * (float) i_138_) + (this.aFloat8502 * (float) i_179_) + (this.aFloat8506 * (float) i_140_)));
					f_145_ = (this.aFloat8511 + ((this.aFloat8485 * (float) i_138_) + (this.aFloat8486 * (float) i_179_) + (this.aFloat8507 * (float) i_140_)));
					if (f_183_ < -f_145_)
						return;
					float f_184_ = (this.aFloat8510 + ((this.aFloat8498 * (float) i_139_) + (this.aFloat8502 * (float) i_180_) + (this.aFloat8506 * (float) i_140_)));
					f_146_ = (this.aFloat8511 + ((this.aFloat8485 * (float) i_139_) + (this.aFloat8486 * (float) i_180_) + (this.aFloat8507 * (float) i_140_)));
					if (f_184_ < -f_146_)
						return;
					float f_185_ = (this.aFloat8510 + ((this.aFloat8498 * (float) i_139_) + (this.aFloat8502 * (float) i_181_) + (this.aFloat8506 * (float) i_141_)));
					f_147_ = (this.aFloat8511 + ((this.aFloat8485 * (float) i_139_) + (this.aFloat8486 * (float) i_181_) + (this.aFloat8507 * (float) i_141_)));
					if (f_185_ < -f_147_)
						return;
					float f_186_ = (this.aFloat8510 + ((this.aFloat8498 * (float) i_138_) + (this.aFloat8502 * (float) i_182_) + (this.aFloat8506 * (float) i_141_)));
					f_148_ = (this.aFloat8511 + ((this.aFloat8485 * (float) i_138_) + (this.aFloat8486 * (float) i_182_) + (this.aFloat8507 * (float) i_141_)));
					if (f_186_ < -f_148_)
						return;
					f_149_ = (class2.aFloat27 + class2.aFloat46 * f_183_ / f_145_);
					f_150_ = (class2.aFloat27 + class2.aFloat46 * f_184_ / f_146_);
					f_151_ = (class2.aFloat27 + class2.aFloat46 * f_185_ / f_147_);
					f_152_ = (class2.aFloat27 + class2.aFloat46 * f_186_ / f_148_);
					if (bool) {
						float f_187_ = f_183_ - class15.aFloat205;
						if (f_187_ > 0.0F) {
							f_187_ /= class15.aFloat183;
							if (f_187_ > 1.0F)
								f_187_ = 1.0F;
							f = f_187_;
							int i_188_ = (int) ((float) class6.aShort84 * f_187_);
							if (i_188_ > 0)
								i_179_ -= i_188_;
						}
						f_187_ = f_184_ - class15.aFloat205;
						if (f_187_ > 0.0F) {
							f_187_ /= class15.aFloat183;
							if (f_187_ > 1.0F)
								f_187_ = 1.0F;
							f_142_ = f_187_;
							int i_189_ = (int) ((float) class6.aShort87 * f_187_);
							if (i_189_ > 0)
								i_180_ -= i_189_;
						}
						f_187_ = f_185_ - class15.aFloat205;
						if (f_187_ > 0.0F) {
							f_187_ /= class15.aFloat183;
							if (f_187_ > 1.0F)
								f_187_ = 1.0F;
							f_143_ = f_187_;
							int i_190_ = (int) ((float) class6.aShort88 * f_187_);
							if (i_190_ > 0)
								i_181_ -= i_190_;
						}
						f_187_ = f_186_ - class15.aFloat205;
						if (f_187_ > 0.0F) {
							f_187_ /= class15.aFloat183;
							if (f_187_ > 1.0F)
								f_187_ = 1.0F;
							f_144_ = f_187_;
							int i_191_ = (int) ((float) class6.aShort86 * f_187_);
							if (i_191_ > 0)
								i_182_ -= i_191_;
						}
					} else if (class15.aBoolean216) {
						float f_192_ = f_183_ - class15.aFloat205;
						if (f_192_ > 0.0F) {
							f = f_192_ / class15.aFloat183;
							if (f > 1.0F)
								f = 1.0F;
						}
						f_192_ = f_184_ - class15.aFloat205;
						if (f_192_ > 0.0F) {
							f_142_ = f_192_ / class15.aFloat183;
							if (f_142_ > 1.0F)
								f_142_ = 1.0F;
						}
						f_192_ = f_185_ - class15.aFloat205;
						if (f_192_ > 0.0F) {
							f_143_ = f_192_ / class15.aFloat183;
							if (f_143_ > 1.0F)
								f_143_ = 1.0F;
						}
						f_192_ = f_186_ - class15.aFloat205;
						if (f_192_ > 0.0F) {
							f_144_ = f_192_ / class15.aFloat183;
							if (f_144_ > 1.0F)
								f_144_ = 1.0F;
						}
					}
					float f_193_ = (this.aFloat8508 + ((this.aFloat8499 * (float) i_138_) + (this.aFloat8500 * (float) i_179_) + (this.aFloat8504 * (float) i_140_)));
					f_153_ = (class2.aFloat23 + class2.aFloat17 * f_193_ / f_145_);
					float f_194_ = (this.aFloat8509 + ((this.aFloat8497 * (float) i_138_) + (this.aFloat8501 * (float) i_179_) + (this.aFloat8505 * (float) i_140_)));
					f_154_ = (class2.aFloat25 + class2.aFloat26 * f_194_ / f_145_);
					float f_195_ = (this.aFloat8508 + ((this.aFloat8499 * (float) i_139_) + (this.aFloat8500 * (float) i_180_) + (this.aFloat8504 * (float) i_140_)));
					f_155_ = (class2.aFloat23 + class2.aFloat17 * f_195_ / f_146_);
					float f_196_ = (this.aFloat8509 + ((this.aFloat8497 * (float) i_139_) + (this.aFloat8501 * (float) i_180_) + (this.aFloat8505 * (float) i_140_)));
					f_156_ = (class2.aFloat25 + class2.aFloat26 * f_196_ / f_146_);
					float f_197_ = (this.aFloat8508 + ((this.aFloat8499 * (float) i_139_) + (this.aFloat8500 * (float) i_181_) + (this.aFloat8504 * (float) i_141_)));
					f_157_ = (class2.aFloat23 + class2.aFloat17 * f_197_ / f_147_);
					float f_198_ = (this.aFloat8509 + ((this.aFloat8497 * (float) i_139_) + (this.aFloat8501 * (float) i_181_) + (this.aFloat8505 * (float) i_141_)));
					f_158_ = (class2.aFloat25 + class2.aFloat26 * f_198_ / f_147_);
					float f_199_ = (this.aFloat8508 + ((this.aFloat8499 * (float) i_138_) + (this.aFloat8500 * (float) i_182_) + (this.aFloat8504 * (float) i_141_)));
					f_159_ = (class2.aFloat23 + class2.aFloat17 * f_199_ / f_148_);
					float f_200_ = (this.aFloat8509 + ((this.aFloat8497 * (float) i_138_) + (this.aFloat8501 * (float) i_182_) + (this.aFloat8505 * (float) i_141_)));
					f_160_ = (class2.aFloat25 + class2.aFloat26 * f_200_ / f_148_);
				}
				boolean bool_201_ = (class6.aShort91 != -1 && method6366(this.aClass_ra_Sub1_8484.textures.method174(class6.aShort91).aByte529));
				float f_202_ = f_142_ + f_143_ + f_144_;
				if (((f_157_ - f_159_) * (f_156_ - f_160_) - (f_158_ - f_160_) * (f_155_ - f_159_)) > 0.0F) {
					class2.aBoolean20 = (f_157_ < 0.0F || f_159_ < 0.0F || f_155_ < 0.0F || f_157_ > (float) class2.anInt22 || f_159_ > (float) class2.anInt22 || f_155_ > (float) class2.anInt22);
					if (f_202_ < 3.0F) {
						if (f_202_ > 0.0F) {
							if (class6.aShort91 >= 0) {
								int i_203_ = -16777216;
								if (bool_201_)
									i_203_ = -1694498816;
								class2.method290(true, true, false, f_158_, f_160_, f_156_, f_157_, f_159_, f_155_, f_151_, f_152_, f_150_, f_147_, f_148_, f_146_, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, (i_203_ | class6.anInt81 & 0xffffff), (i_203_ | class6.anInt89 & 0xffffff), (i_203_ | class6.anInt83 & 0xffffff), class15.anInt184 * 688695183, f_143_ * 255.0F, f_144_ * 255.0F, f_142_ * 255.0F, class6.aShort91);
							} else {
								if (bool_201_)
									class2.anInt19 = 100;
								class2.method292(true, true, false, f_158_, f_160_, f_156_, f_157_, f_159_, f_155_, f_151_, f_152_, f_150_, StaticMethods.method692((class6.anInt81), ((int) (f_143_ * 255.0F) << 24 | ((class15.anInt184) * 688695183))), StaticMethods.method692((class6.anInt89), ((int) (f_144_ * 255.0F) << 24 | ((class15.anInt184) * 688695183))), StaticMethods.method692((class6.anInt83), ((int) (f_142_ * 255.0F) << 24 | ((class15.anInt184) * 688695183))));
								class2.anInt19 = 0;
							}
						} else if (class6.aShort91 >= 0) {
							int i_204_ = -16777216;
							if (bool_201_)
								i_204_ = -1694498816;
							class2.method290(true, true, false, f_158_, f_160_, f_156_, f_157_, f_159_, f_155_, f_151_, f_152_, f_150_, f_147_, f_148_, f_146_, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, i_204_ | class6.anInt81 & 0xffffff, i_204_ | class6.anInt89 & 0xffffff, i_204_ | class6.anInt83 & 0xffffff, 0, 0.0F, 0.0F, 0.0F, class6.aShort91);
						} else {
							if (bool_201_)
								class2.anInt19 = 100;
							class2.method292(true, true, false, f_158_, f_160_, f_156_, f_157_, f_159_, f_155_, f_151_, f_152_, f_150_, class6.anInt81, class6.anInt89, class6.anInt83);
							class2.anInt19 = 0;
						}
					} else
						class2.method293(true, true, false, f_158_, f_160_, f_156_, f_157_, f_159_, f_155_, f_151_, f_152_, f_150_, (class15.anInt184 * 688695183));
				}
				f_202_ = f + f_142_ + f_144_;
				if (((f_153_ - f_155_) * (f_160_ - f_156_) - (f_154_ - f_156_) * (f_159_ - f_155_)) > 0.0F) {
					class2.aBoolean20 = (f_153_ < 0.0F || f_155_ < 0.0F || f_159_ < 0.0F || f_153_ > (float) class2.anInt22 || f_155_ > (float) class2.anInt22 || f_159_ > (float) class2.anInt22);
					if (f_202_ < 3.0F) {
						if (bool_201_)
							class2.anInt19 = -1694498816;
						if (f_202_ > 0.0F) {
							if (class6.aShort91 >= 0) {
								int i_205_ = -16777216;
								if (bool_201_)
									i_205_ = -1694498816;
								class2.method290(true, true, false, f_154_, f_156_, f_160_, f_153_, f_155_, f_159_, f_149_, f_150_, f_152_, f_145_, f_146_, f_148_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, (i_205_ | class6.anInt82 & 0xffffff), (i_205_ | class6.anInt83 & 0xffffff), (i_205_ | class6.anInt89 & 0xffffff), class15.anInt184 * 688695183, f * 255.0F, f_142_ * 255.0F, f_144_ * 255.0F, class6.aShort91);
							} else {
								if (bool_201_)
									class2.anInt19 = 100;
								class2.method292(true, true, false, f_154_, f_156_, f_160_, f_153_, f_155_, f_159_, f_149_, f_150_, f_152_, StaticMethods.method692((class6.anInt82), (((int) (f * 255.0F) << 24) | ((class15.anInt184) * 688695183))), StaticMethods.method692((class6.anInt83), ((int) (f_142_ * 255.0F) << 24 | ((class15.anInt184) * 688695183))), StaticMethods.method692((class6.anInt89), ((int) (f_144_ * 255.0F) << 24 | ((class15.anInt184) * 688695183))));
								class2.anInt19 = 0;
							}
						} else if (class6.aShort91 >= 0) {
							int i_206_ = -16777216;
							if (bool_201_)
								i_206_ = -1694498816;
							class2.method290(true, true, false, f_154_, f_156_, f_160_, f_153_, f_155_, f_159_, f_149_, f_150_, f_152_, f_145_, f_146_, f_148_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, i_206_ | class6.anInt82 & 0xffffff, i_206_ | class6.anInt83 & 0xffffff, i_206_ | class6.anInt89 & 0xffffff, 0, 0.0F, 0.0F, 0.0F, class6.aShort91);
						} else {
							if (bool_201_)
								class2.anInt19 = 100;
							class2.method292(true, true, false, f_154_, f_156_, f_160_, f_153_, f_155_, f_159_, f_149_, f_150_, f_152_, class6.anInt82, class6.anInt83, class6.anInt89);
							class2.anInt19 = 0;
						}
					} else
						class2.method293(true, true, false, f_154_, f_156_, f_160_, f_153_, f_155_, f_159_, f_149_, f_150_, f_152_, (class15.anInt184 * 688695183));
				}
			}
		} else {
			Class13 class13 = this.aClass13ArrayArray8494[i][i_132_];
			if (class13 != null) {
				if (i_137_ != 0) {
					if ((class13.aByte159 & 0x4) != 0) {
						if ((i_137_ & 0x1) != 0)
							return;
					} else if ((i_137_ & 0x2) != 0)
						return;
				}
				for (int i_207_ = 0; i_207_ < class13.aShort158; i_207_++) {
					int i_208_ = (class13.aShortArray157[i_207_] + (i << anInt6289 * -2137349879));
					int i_209_ = class13.aShortArray161[i_207_];
					int i_210_ = (class13.aShortArray162[i_207_] + (i_132_ << anInt6289 * -2137349879));
					float f = (this.aFloat8510 + ((this.aFloat8498 * (float) i_208_) + (this.aFloat8502 * (float) i_209_) + (this.aFloat8506 * (float) i_210_)));
					float f_211_ = (this.aFloat8511 + ((this.aFloat8485 * (float) i_208_) + (this.aFloat8486 * (float) i_209_) + (this.aFloat8507 * (float) i_210_)));
					if (f < -f_211_)
						return;
					float f_212_ = (class2.aFloat27 + class2.aFloat46 * f / f_211_);
					fs_136_[i_207_] = 0.0F;
					if (bool) {
						float f_213_ = f - class15.aFloat205;
						if (f_213_ > 0.0F) {
							f_213_ /= class15.aFloat183;
							if (f_213_ > 1.0F)
								f_213_ = 1.0F;
							fs_136_[i_207_] = f_213_;
							int i_214_ = (int) ((float) (class13.aShortArray165[i_207_]) * f_213_);
							if (i_214_ > 0)
								i_209_ -= i_214_;
						}
					} else if (class15.aBoolean216) {
						float f_215_ = f - class15.aFloat205;
						if (f_215_ > 0.0F) {
							fs_136_[i_207_] = f_215_ / class15.aFloat183;
							if (fs_136_[i_207_] > 1.0F)
								fs_136_[i_207_] = 1.0F;
						}
					}
					float f_216_ = (this.aFloat8508 + ((this.aFloat8499 * (float) i_208_) + (this.aFloat8500 * (float) i_209_) + (this.aFloat8504 * (float) i_210_)));
					float f_217_ = (this.aFloat8509 + ((this.aFloat8497 * (float) i_208_) + (this.aFloat8501 * (float) i_209_) + (this.aFloat8505 * (float) i_210_)));
					fs[i_207_] = (class2.aFloat23 + class2.aFloat17 * f_216_ / f_211_);
					fs_133_[i_207_] = (class2.aFloat25 + class2.aFloat26 * f_217_ / f_211_);
					fs_134_[i_207_] = f_212_;
					fs_135_[i_207_] = f_211_;
				}
				if (class13.aShortArray166 != null) {
					for (int i_218_ = 0; i_218_ < class13.aShort167; i_218_++) {
						int i_219_ = i_218_ * 3;
						int i_220_ = i_219_ + 1;
						int i_221_ = i_220_ + 1;
						float f = fs[i_219_];
						float f_222_ = fs[i_220_];
						float f_223_ = fs[i_221_];
						float f_224_ = fs_133_[i_219_];
						float f_225_ = fs_133_[i_220_];
						float f_226_ = fs_133_[i_221_];
						float f_227_ = (fs_136_[i_219_] + fs_136_[i_220_] + fs_136_[i_221_]);
						if (((f - f_222_) * (f_226_ - f_225_) - (f_224_ - f_225_) * (f_223_ - f_222_)) > 0.0F) {
							class2.aBoolean20 = (f < 0.0F || f_222_ < 0.0F || f_223_ < 0.0F || f > (float) class2.anInt22 || (f_222_ > (float) class2.anInt22) || (f_223_ > (float) class2.anInt22));
							short i_228_ = class13.aShortArray166[i_218_];
							if (f_227_ < 3.0F) {
								if (f_227_ > 0.0F) {
									if (i_228_ != -1) {
										int i_229_ = -16777216;
										if (i_228_ != -1 && (method6366(this.aClass_ra_Sub1_8484.textures.method174(i_228_).aByte529)))
											i_229_ = -1694498816;
										class2.method290(true, true, false, f_224_, f_225_, f_226_, f, f_222_, f_223_, fs_134_[i_219_], fs_134_[i_220_], fs_134_[i_221_], fs_135_[i_219_], fs_135_[i_220_], fs_135_[i_221_], ((float) (class13.aShortArray157[i_219_]) / (float) (anInt6288 * -1212653763)), ((float) (class13.aShortArray157[i_220_]) / (float) (anInt6288 * -1212653763)), ((float) (class13.aShortArray157[i_221_]) / (float) (anInt6288 * -1212653763)), ((float) (class13.aShortArray162[i_219_]) / (float) (anInt6288 * -1212653763)), ((float) (class13.aShortArray162[i_220_]) / (float) (anInt6288 * -1212653763)), ((float) (class13.aShortArray162[i_221_]) / (float) (anInt6288 * -1212653763)), i_229_ | ((class13.anIntArray164[i_219_]) & 0xffffff), i_229_ | ((class13.anIntArray164[i_220_]) & 0xffffff), i_229_ | ((class13.anIntArray164[i_221_]) & 0xffffff), (class15.anInt184 * 688695183), fs_136_[i_219_] * 255.0F, fs_136_[i_220_] * 255.0F, fs_136_[i_221_] * 255.0F, i_228_);
									} else if (((class13.anIntArray164[i_219_]) & 0xffffff) != 0) {
										if (i_228_ != -1 && (method6366(this.aClass_ra_Sub1_8484.textures.method174(i_228_).aByte529)))
											class2.anInt19 = -1694498816;
										class2.method292(true, true, false, f_224_, f_225_, f_226_, f, f_222_, f_223_, fs_134_[i_219_], fs_134_[i_220_], fs_134_[i_221_], (StaticMethods.method692((class13.anIntArray164[i_219_]), ((int) (fs_136_[i_219_] * 255.0F) << 24 | (class15.anInt184 * 688695183)))), (StaticMethods.method692((class13.anIntArray164[i_220_]), ((int) (fs_136_[i_220_] * 255.0F) << 24 | (class15.anInt184 * 688695183)))), (StaticMethods.method692((class13.anIntArray164[i_221_]), ((int) (fs_136_[i_221_] * 255.0F) << 24 | (class15.anInt184 * 688695183)))));
										class2.anInt19 = 0;
									}
								} else if (i_228_ != -1) {
									int i_230_ = -16777216;
									if (i_228_ != -1 && method6366(this.aClass_ra_Sub1_8484.textures.method174(i_228_).aByte529))
										i_230_ = -1694498816;
									class2.method290(true, true, false, f_224_, f_225_, f_226_, f, f_222_, f_223_, fs_134_[i_219_], fs_134_[i_220_], fs_134_[i_221_], fs_135_[i_219_], fs_135_[i_220_], fs_135_[i_221_], ((float) (class13.aShortArray157[i_219_]) / (float) (anInt6288 * -1212653763)), ((float) (class13.aShortArray157[i_220_]) / (float) (anInt6288 * -1212653763)), ((float) (class13.aShortArray157[i_221_]) / (float) (anInt6288 * -1212653763)), ((float) (class13.aShortArray162[i_219_]) / (float) (anInt6288 * -1212653763)), ((float) (class13.aShortArray162[i_220_]) / (float) (anInt6288 * -1212653763)), ((float) (class13.aShortArray162[i_221_]) / (float) (anInt6288 * -1212653763)), i_230_ | ((class13.anIntArray164[i_219_]) & 0xffffff), i_230_ | ((class13.anIntArray164[i_220_]) & 0xffffff), i_230_ | ((class13.anIntArray164[i_221_]) & 0xffffff), 0, 0.0F, 0.0F, 0.0F, i_228_);
								} else if (((class13.anIntArray164[i_219_]) & 0xffffff) != 0) {
									if (i_228_ != -1 && method6366(this.aClass_ra_Sub1_8484.textures.method174(i_228_).aByte529))
										class2.anInt19 = -1694498816;
									class2.method292(true, true, false, f_224_, f_225_, f_226_, f, f_222_, f_223_, fs_134_[i_219_], fs_134_[i_220_], fs_134_[i_221_], (class13.anIntArray164[i_219_]), (class13.anIntArray164[i_220_]), (class13.anIntArray164[i_221_]));
									class2.anInt19 = 0;
								}
							} else
								class2.method293(true, true, false, f_224_, f_225_, f_226_, f, f_222_, f_223_, fs_134_[i_219_], fs_134_[i_220_], fs_134_[i_221_], (class15.anInt184 * 688695183));
						}
					}
				} else {
					for (int i_231_ = 0; i_231_ < class13.aShort167; i_231_++) {
						int i_232_ = i_231_ * 3;
						int i_233_ = i_232_ + 1;
						int i_234_ = i_233_ + 1;
						float f = fs[i_232_];
						float f_235_ = fs[i_233_];
						float f_236_ = fs[i_234_];
						float f_237_ = fs_133_[i_232_];
						float f_238_ = fs_133_[i_233_];
						float f_239_ = fs_133_[i_234_];
						float f_240_ = (fs_136_[i_232_] + fs_136_[i_233_] + fs_136_[i_234_]);
						if (((f - f_235_) * (f_239_ - f_238_) - (f_237_ - f_238_) * (f_236_ - f_235_)) > 0.0F) {
							class2.aBoolean20 = (f < 0.0F || f_235_ < 0.0F || f_236_ < 0.0F || f > (float) class2.anInt22 || (f_235_ > (float) class2.anInt22) || (f_236_ > (float) class2.anInt22));
							if (f_240_ < 3.0F) {
								if (f_240_ > 0.0F) {
									if (((class13.anIntArray164[i_232_]) & 0xffffff) != 0)
										class2.method292(true, true, false, f_237_, f_238_, f_239_, f, f_235_, f_236_, fs_134_[i_232_], fs_134_[i_233_], fs_134_[i_234_], (StaticMethods.method4215((class13.anIntArray164[i_232_]), (class15.anInt184 * 688695183), fs_136_[i_232_] * 255.0F)), (StaticMethods.method4215((class13.anIntArray164[i_233_]), (class15.anInt184 * 688695183), fs_136_[i_233_] * 255.0F)), (StaticMethods.method4215((class13.anIntArray164[i_234_]), (class15.anInt184 * 688695183), fs_136_[i_234_] * 255.0F)));
								} else if (((class13.anIntArray164[i_232_]) & 0xffffff) != 0)
									class2.method292(true, true, false, f_237_, f_238_, f_239_, f, f_235_, f_236_, fs_134_[i_232_], fs_134_[i_233_], fs_134_[i_234_], (class13.anIntArray164[i_232_]), (class13.anIntArray164[i_233_]), (class13.anIntArray164[i_234_]));
							} else
								class2.method293(true, true, false, f_237_, f_238_, f_239_, f, f_235_, f_236_, fs_134_[i_232_], fs_134_[i_233_], fs_134_[i_234_], (class15.anInt184 * 688695183));
						}
					}
				}
			}
		}
	}

	void method6370(int i, int i_241_, boolean bool, Class15 class15, Class2 class2, float[] fs, float[] fs_242_, float[] fs_243_, float[] fs_244_, float[] fs_245_, int i_246_) {
		Class17 class17 = this.aClass17ArrayArray8515[i][i_241_];
		if (i_246_ == 0 || (i_246_ & 0x2) == 0) {
			if (class17 != null) {
				for (int i_247_ = 0; i_247_ < class17.aShort234; i_247_++) {
					int i_248_ = (class17.aShortArray235[i_247_] + (i << anInt6289 * -2137349879));
					int i_249_ = class17.aShortArray241[i_247_];
					int i_250_ = (class17.aShortArray243[i_247_] + (i_241_ << anInt6289 * -2137349879));
					float f = (this.aFloat8510 + ((this.aFloat8498 * (float) i_248_) + (this.aFloat8502 * (float) i_249_) + (this.aFloat8506 * (float) i_250_)));
					float f_251_ = (this.aFloat8511 + ((this.aFloat8485 * (float) i_248_) + (this.aFloat8486 * (float) i_249_) + (this.aFloat8507 * (float) i_250_)));
					if (f < -f_251_)
						return;
					fs_245_[i_247_] = 0.0F;
					if (bool) {
						float f_252_ = f - class15.aFloat205;
						if (f_252_ > 0.0F) {
							f_252_ /= class15.aFloat183;
							if (f_252_ > 1.0F)
								f_252_ = 1.0F;
							fs_245_[i_247_] = f_252_;
							int i_253_ = (int) ((float) (class17.aShortArray238[i_247_]) * f_252_);
							if (i_253_ > 0)
								i_249_ -= i_253_;
						}
					} else if (class15.aBoolean216) {
						float f_254_ = f - class15.aFloat205;
						if (f_254_ > 0.0F) {
							fs_245_[i_247_] = f_254_ / class15.aFloat183;
							if (fs_245_[i_247_] > 1.0F)
								fs_245_[i_247_] = 1.0F;
						}
					}
					float f_255_ = (this.aFloat8508 + ((this.aFloat8499 * (float) i_248_) + (this.aFloat8500 * (float) i_249_) + (this.aFloat8504 * (float) i_250_)));
					float f_256_ = (this.aFloat8509 + ((this.aFloat8497 * (float) i_248_) + (this.aFloat8501 * (float) i_249_) + (this.aFloat8505 * (float) i_250_)));
					fs[i_247_] = (class2.aFloat23 + class2.aFloat17 * f_255_ / f_251_);
					fs_242_[i_247_] = (class2.aFloat25 + class2.aFloat26 * f_256_ / f_251_);
					fs_243_[i_247_] = (class2.aFloat27 + class2.aFloat46 * f / f_251_);
					fs_244_[i_247_] = f_251_;
				}
				float f = (float) (anInt6288 * -1212653763);
				for (int i_257_ = 0; i_257_ < class17.aShort236; i_257_++) {
					int i_258_ = i_257_ * 3;
					int i_259_ = i_258_ + 1;
					int i_260_ = i_259_ + 1;
					float f_261_ = fs[i_258_];
					float f_262_ = fs[i_259_];
					float f_263_ = fs[i_260_];
					float f_264_ = fs_242_[i_258_];
					float f_265_ = fs_242_[i_259_];
					float f_266_ = fs_242_[i_260_];
					if (((f_261_ - f_262_) * (f_266_ - f_265_) - (f_264_ - f_265_) * (f_263_ - f_262_)) > 0.0F) {
						class2.aBoolean20 = (f_261_ < 0.0F || f_262_ < 0.0F || f_263_ < 0.0F || f_261_ > (float) class2.anInt22 || f_262_ > (float) class2.anInt22 || f_263_ > (float) class2.anInt22);
						if (fs_245_[i_258_] + fs_245_[i_259_] + fs_245_[i_260_] < 3.0F) {
							int i_267_ = i << anInt6289 * -2137349879;
							int i_268_ = i_241_ << anInt6289 * -2137349879;
							if ((class17.anIntArray237[i_258_] & 0xffffff) != 0) {
								if ((class17.aShortArray239[i_258_] == (class17.aShortArray239[i_259_])) && ((class17.aShortArray239[i_258_]) == (class17.aShortArray239[i_260_])) && ((class17.aShortArray240[i_258_]) == (class17.aShortArray240[i_259_])) && ((class17.aShortArray240[i_258_]) == (class17.aShortArray240[i_260_])))
									class2.method290(true, true, false, f_264_, f_265_, f_266_, f_261_, f_262_, f_263_, fs_243_[i_258_], fs_243_[i_259_], fs_243_[i_260_], fs_244_[i_258_], fs_244_[i_259_], fs_244_[i_260_], ((float) (i_267_ + (class17.aShortArray235[i_258_])) / (float) (class17.aShortArray240[i_258_])), ((float) (i_267_ + (class17.aShortArray235[i_259_])) / (float) (class17.aShortArray240[i_259_])), ((float) (i_267_ + (class17.aShortArray235[i_260_])) / (float) (class17.aShortArray240[i_260_])), ((float) (i_268_ + (class17.aShortArray243[i_258_])) / (float) (class17.aShortArray240[i_258_])), ((float) (i_268_ + (class17.aShortArray243[i_259_])) / (float) (class17.aShortArray240[i_259_])), ((float) (i_268_ + (class17.aShortArray243[i_260_])) / (float) (class17.aShortArray240[i_260_])), (class17.anIntArray237[i_258_]), (class17.anIntArray237[i_259_]), (class17.anIntArray237[i_260_]), (class15.anInt184 * 688695183), fs_245_[i_258_] * 255.0F, fs_245_[i_259_] * 255.0F, fs_245_[i_260_] * 255.0F, (class17.aShortArray239[i_258_]));
								else
									class2.method296(true, true, false, f_264_, f_265_, f_266_, f_261_, f_262_, f_263_, fs_243_[i_258_], fs_243_[i_259_], fs_243_[i_260_], fs_244_[i_258_], fs_244_[i_259_], fs_244_[i_260_], (float) (i_267_ + (class17.aShortArray235[i_258_])) / f, (float) (i_267_ + (class17.aShortArray235[i_259_])) / f, (float) (i_267_ + (class17.aShortArray235[i_260_])) / f, (float) (i_268_ + (class17.aShortArray243[i_258_])) / f, (float) (i_268_ + (class17.aShortArray243[i_259_])) / f, (float) (i_268_ + (class17.aShortArray243[i_260_])) / f, (class17.anIntArray237[i_258_]), (class17.anIntArray237[i_259_]), (class17.anIntArray237[i_260_]), (class15.anInt184 * 688695183), fs_245_[i_258_] * 255.0F, fs_245_[i_259_] * 255.0F, fs_245_[i_260_] * 255.0F, (class17.aShortArray239[i_258_]), f / (float) (class17.aShortArray240[i_258_]), (class17.aShortArray239[i_259_]), f / (float) (class17.aShortArray240[i_259_]), (class17.aShortArray239[i_260_]), f / (float) (class17.aShortArray240[i_260_]));
							}
						} else
							class2.method293(true, true, false, f_264_, f_265_, f_266_, f_261_, f_262_, f_263_, fs_243_[i_258_], fs_243_[i_259_], fs_243_[i_260_], (class15.anInt184 * 688695183));
					}
				}
			}
		}
	}

	void method6371(int i, int i_274_, int i_275_, int i_276_, int i_277_, int i_278_, int i_279_, boolean[][] bools, Class15 class15, Class2 class2, float[] fs, float[] fs_280_) {
		int i_281_ = (i_279_ - i_277_) * i_275_ / 256;
		int i_282_ = i_275_ >> 8;
		boolean bool = class15.aBoolean207;
		this.aClass_ra_Sub1_8484.RA(false);
		class2.aBoolean16 = false;
		class2.aBoolean48 = false;
		int i_283_ = i;
		int i_284_ = i_274_ + i_281_;
		for (int i_285_ = i_276_; i_285_ < i_278_; i_285_++) {
			for (int i_286_ = i_277_; i_286_ < i_279_; i_286_++) {
				if (bools[i_285_ - i_276_][i_286_ - i_277_]) {
					if ((this.aClass20ArrayArray8491[i_285_][i_286_]) != null) {
						Class20 class20 = (this.aClass20ArrayArray8491[i_285_][i_286_]);
						if (class20.aShort273 != -1 && (class20.aByte268 & 0x2) == 0 && class20.anInt271 == -1) {
							int i_287_ = (this.aClass_ra_Sub1_8484.method5206(class20.aShort273));
							class2.method299(true, true, false, (float) (i_284_ - i_282_), (float) (i_284_ - i_282_), (float) i_284_, (float) (i_283_ + i_282_), (float) i_283_, (float) (i_283_ + i_282_), 100.0F, 100.0F, 100.0F, (float) Class195.method1873(i_287_, ((class20.aShort270) & 0xffff)), (float) Class195.method1873(i_287_, ((class20.aShort267) & 0xffff)), (float) Class195.method1873(i_287_, ((class20.aShort269) & 0xffff)));
							class2.method299(true, true, false, (float) i_284_, (float) i_284_, (float) (i_284_ - i_282_), (float) i_283_, (float) (i_283_ + i_282_), (float) i_283_, 100.0F, 100.0F, 100.0F, (float) Class195.method1873(i_287_, ((class20.aShort272) & 0xffff)), (float) Class195.method1873(i_287_, ((class20.aShort269) & 0xffff)), (float) Class195.method1873(i_287_, ((class20.aShort267) & 0xffff)));
						} else if (class20.anInt271 == -1) {
							class2.method299(true, true, false, (float) (i_284_ - i_282_), (float) (i_284_ - i_282_), (float) i_284_, (float) (i_283_ + i_282_), (float) i_283_, (float) (i_283_ + i_282_), 100.0F, 100.0F, 100.0F, (float) (class20.aShort270 & 0xffff), (float) (class20.aShort267 & 0xffff), (float) (class20.aShort269 & 0xffff));
							class2.method299(true, true, false, (float) i_284_, (float) i_284_, (float) (i_284_ - i_282_), (float) i_283_, (float) (i_283_ + i_282_), (float) i_283_, 100.0F, 100.0F, 100.0F, (float) (class20.aShort272 & 0xffff), (float) (class20.aShort269 & 0xffff), (float) (class20.aShort267 & 0xffff));
						} else {
							int i_288_ = class20.anInt271;
							class2.method299(true, true, false, (float) (i_284_ - i_282_), (float) (i_284_ - i_282_), (float) i_284_, (float) (i_283_ + i_282_), (float) i_283_, (float) (i_283_ + i_282_), 100.0F, 100.0F, 100.0F, (float) i_288_, (float) i_288_, (float) i_288_);
							class2.method299(true, true, false, (float) i_284_, (float) i_284_, (float) (i_284_ - i_282_), (float) i_283_, (float) (i_283_ + i_282_), (float) i_283_, 100.0F, 100.0F, 100.0F, (float) i_288_, (float) i_288_, (float) i_288_);
						}
					} else if ((this.aClass9ArrayArray8495[i_285_][i_286_]) != null) {
						Class9 class9 = (this.aClass9ArrayArray8495[i_285_][i_286_]);
						for (int i_289_ = 0; i_289_ < class9.aShort115; i_289_++) {
							fs[i_289_] = (float) (i_283_ + ((class9.aShortArray118[i_289_]) * i_282_ / (anInt6288 * -1212653763)));
							fs_280_[i_289_] = (float) (i_284_ - ((class9.aShortArray120[i_289_]) * i_282_ / (anInt6288 * -1212653763)));
						}
						for (int i_290_ = 0; i_290_ < class9.aShort123; i_290_++) {
							short i_291_ = class9.aShortArray122[i_290_];
							short i_292_ = class9.aShortArray117[i_290_];
							short i_293_ = class9.aShortArray124[i_290_];
							float f = fs[i_291_];
							float f_294_ = fs[i_292_];
							float f_295_ = fs[i_293_];
							float f_296_ = fs_280_[i_291_];
							float f_297_ = fs_280_[i_292_];
							float f_298_ = fs_280_[i_293_];
							if (class9.anIntArray128 != null && (class9.anIntArray128[i_290_] != -1)) {
								int i_299_ = class9.anIntArray128[i_290_];
								class2.method299(true, true, false, f_296_, f_297_, f_298_, f, f_294_, f_295_, 100.0F, 100.0F, 100.0F, (float) (Class195.method1873(i_299_, (class9.aShortArray121[i_291_]))), (float) (Class195.method1873(i_299_, (class9.aShortArray121[i_292_]))), (float) (Class195.method1873(i_299_, (class9.aShortArray121[i_293_]))));
							} else if (class9.aShortArray125 != null && (class9.aShortArray125[i_290_]) != -1) {
								int i_300_ = (this.aClass_ra_Sub1_8484.method5206(class9.aShortArray125[i_290_]));
								class2.method299(true, true, false, f_296_, f_297_, f_298_, f, f_294_, f_295_, 100.0F, 100.0F, 100.0F, (float) (Class195.method1873(i_300_, (class9.aShortArray121[i_291_]))), (float) (Class195.method1873(i_300_, (class9.aShortArray121[i_292_]))), (float) (Class195.method1873(i_300_, (class9.aShortArray121[i_293_]))));
							} else {
								int i_301_ = class9.anIntArray127[i_290_];
								class2.method299(true, true, false, f_296_, f_297_, f_298_, f, f_294_, f_295_, 100.0F, 100.0F, 100.0F, (float) (Class195.method1873(i_301_, (class9.aShortArray121[i_291_]))), (float) (Class195.method1873(i_301_, (class9.aShortArray121[i_292_]))), (float) (Class195.method1873(i_301_, (class9.aShortArray121[i_293_]))));
							}
						}
					}
				}
				i_284_ -= i_282_;
			}
			i_284_ = i_274_ + i_281_;
			i_283_ += i_282_;
		}
		class2.aBoolean16 = true;
		this.aClass_ra_Sub1_8484.RA(bool);
	}

	public Class_na w(int i, int i_308_, Class_na class_na) {
		return null;
	}

	public void UA(Class_na class_na, int i, int i_309_, int i_310_, int i_311_, boolean bool) {
		/* empty */
	}

	public void NA(Class_na class_na, int i, int i_312_, int i_313_, int i_314_, boolean bool) {
		/* empty */
	}

	public void method6342(Light light, int[] is) {
		/* empty */
	}

	public void method6339(int i, int i_550_, int i_551_, int i_552_, int i_553_, int i_554_, int i_555_, boolean[][] bools) {
		Class15 class15 = this.aClass_ra_Sub1_8484.method5202(Thread.currentThread());
		Class2 class2 = class15.aClass2_192;
		class2.anInt19 = 0;
		class2.aBoolean20 = true;
		this.aClass_ra_Sub1_8484.method5198();
		if (this.aClass6ArrayArray8493 != null || this.aClass17ArrayArray8515 != null)
			method6373(i, i_550_, i_551_, i_552_, i_553_, i_554_, i_555_, bools, class15, class2, class15.aFloatArray218, class15.aFloatArray181);
		else if (this.aClass20ArrayArray8491 != null)
			method6371(i, i_550_, i_551_, i_552_, i_553_, i_554_, i_555_, bools, class15, class2, class15.aFloatArray218, class15.aFloatArray181);
	}

	Class_xa_Sub2(JavaGraphicsToolkit class_ra_sub1, int i, int i_566_, int i_567_, int i_568_, int[][] is, int[][] is_569_, int i_570_) {
		super(i_567_, i_568_, i_570_, is);
		this.aClass_ra_Sub1_8484 = class_ra_sub1;
		this.anInt8492 = i_566_;
		this.aByteArrayArray8512 = new byte[i_567_ + 1][i_568_ + 1];
		int i_571_ = ((this.aClass_ra_Sub1_8484.anInt7983) * -697249431 >> 9);
		for (int i_572_ = 1; i_572_ < i_568_; i_572_++) {
			for (int i_573_ = 1; i_573_ < i_567_; i_573_++) {
				int i_574_ = i_571_;
				int i_575_ = (is_569_[i_573_ + 1][i_572_] - is_569_[i_573_ - 1][i_572_]);
				int i_576_ = (is_569_[i_573_][i_572_ + 1] - is_569_[i_573_][i_572_ - 1]);
				int i_577_ = (int) Math.sqrt((double) (i_575_ * i_575_ + 512 * i_570_ + i_576_ * i_576_));
				int i_578_ = (i_575_ << 8) / i_577_;
				int i_579_ = -512 * i_570_ / i_577_;
				int i_580_ = (i_576_ << 8) / i_577_;
				i_574_ += ((this.aClass_ra_Sub1_8484.anInt7978 * 760881147 * i_578_) + (this.aClass_ra_Sub1_8484.anInt7979) * -181413563 * i_579_ + (this.aClass_ra_Sub1_8484.anInt7981) * -1601750017 * i_580_) >> 17;
				i_574_ >>= 1;
				if (i_574_ < 2)
					i_574_ = 2;
				else if (i_574_ > 126)
					i_574_ = 126;
				this.aByteArrayArray8512[i_573_][i_572_] = (byte) i_574_;
			}
		}
		this.aByteArrayArray8513 = new byte[i_567_ + 1][i_568_ + 1];
	}

	public void method6338(int i, int i_581_, int i_582_, boolean[][] bools, boolean bool, int i_583_) {
		if ((this.aClass_ra_Sub1_8484.anIntArray7967) == null || (this.aClass_ra_Sub1_8484.aFloatArray7973) == null)
			throw new IllegalStateException("");
		Matrix4f matrix4f = (this.aClass_ra_Sub1_8484.aMatrix4f_7987);
		this.aFloat8499 = matrix4f.aFloatArray2594[0];
		this.aFloat8497 = matrix4f.aFloatArray2594[1];
		this.aFloat8498 = matrix4f.aFloatArray2594[2];
		this.aFloat8485 = matrix4f.aFloatArray2594[3];
		this.aFloat8500 = matrix4f.aFloatArray2594[4];
		this.aFloat8501 = matrix4f.aFloatArray2594[5];
		this.aFloat8502 = matrix4f.aFloatArray2594[6];
		this.aFloat8486 = matrix4f.aFloatArray2594[7];
		this.aFloat8504 = matrix4f.aFloatArray2594[8];
		this.aFloat8505 = matrix4f.aFloatArray2594[9];
		this.aFloat8506 = matrix4f.aFloatArray2594[10];
		this.aFloat8507 = matrix4f.aFloatArray2594[11];
		this.aFloat8508 = matrix4f.aFloatArray2594[12];
		this.aFloat8509 = matrix4f.aFloatArray2594[13];
		this.aFloat8510 = matrix4f.aFloatArray2594[14];
		this.aFloat8511 = matrix4f.aFloatArray2594[15];
		for (int i_584_ = 0; i_584_ < i_582_ + i_582_; i_584_++) {
			for (int i_585_ = 0; i_585_ < i_582_ + i_582_; i_585_++) {
				if (bools[i_584_][i_585_]) {
					int i_586_ = i - i_582_ + i_584_;
					int i_587_ = i_581_ - i_582_ + i_585_;
					if (i_586_ >= 0 && i_586_ < anInt6287 * -506105871 && i_587_ >= 0 && i_587_ < anInt6286 * -1148794921)
						method6368(i_586_, i_587_, i_583_);
				}
			}
		}
	}

	void method6372(int i, int i_588_, Class2 class2, float[] fs, float[] fs_589_, float[] fs_590_, float[] fs_591_, float[] fs_592_, int i_593_) {
		Class20 class20 = this.aClass20ArrayArray8491[i][i_588_];
		if (class20 != null) {
			if ((class20.aByte268 & 0x2) == 0) {
				if (i_593_ != 0) {
					if ((class20.aByte268 & 0x4) != 0) {
						if ((i_593_ & 0x1) != 0)
							return;
					} else if ((i_593_ & 0x2) != 0)
						return;
				}
				int i_594_ = i * (anInt6288 * -1212653763);
				int i_595_ = i_594_ + anInt6288 * -1212653763;
				int i_596_ = i_588_ * (anInt6288 * -1212653763);
				int i_597_ = i_596_ + anInt6288 * -1212653763;
				float f;
				float f_598_;
				float f_599_;
				float f_600_;
				float f_601_;
				float f_602_;
				float f_603_;
				float f_604_;
				float f_605_;
				float f_606_;
				float f_607_;
				float f_608_;
				float f_609_;
				float f_610_;
				float f_611_;
				float f_612_;
				if ((class20.aByte268 & 0x1) != 0) {
					int i_613_ = anIntArrayArray6290[i][i_588_];
					float f_614_ = this.aFloat8502 * (float) i_613_;
					float f_615_ = this.aFloat8486 * (float) i_613_;
					float f_616_ = (this.aFloat8510 + ((this.aFloat8498 * (float) i_594_) + f_614_ + (this.aFloat8506 * (float) i_596_)));
					f = (this.aFloat8511 + (this.aFloat8485 * (float) i_594_ + f_615_ + (this.aFloat8507 * (float) i_596_)));
					if (f_616_ < -f)
						return;
					float f_617_ = (this.aFloat8510 + ((this.aFloat8498 * (float) i_595_) + f_614_ + (this.aFloat8506 * (float) i_596_)));
					f_598_ = (this.aFloat8511 + ((this.aFloat8485 * (float) i_595_) + f_615_ + (this.aFloat8507 * (float) i_596_)));
					if (f_617_ < -f_598_)
						return;
					float f_618_ = (this.aFloat8510 + ((this.aFloat8498 * (float) i_595_) + f_614_ + (this.aFloat8506 * (float) i_597_)));
					f_599_ = (this.aFloat8511 + ((this.aFloat8485 * (float) i_595_) + f_615_ + (this.aFloat8507 * (float) i_597_)));
					if (f_618_ < -f_599_)
						return;
					float f_619_ = (this.aFloat8510 + ((this.aFloat8498 * (float) i_594_) + f_614_ + (this.aFloat8506 * (float) i_597_)));
					f_600_ = (this.aFloat8511 + ((this.aFloat8485 * (float) i_594_) + f_615_ + (this.aFloat8507 * (float) i_597_)));
					if (f_619_ < -f_600_)
						return;
					float f_620_ = this.aFloat8500 * (float) i_613_;
					float f_621_ = this.aFloat8501 * (float) i_613_;
					float f_622_ = (this.aFloat8508 + ((this.aFloat8499 * (float) i_594_) + f_620_ + (this.aFloat8504 * (float) i_596_)));
					f_601_ = (class2.aFloat23 + class2.aFloat17 * f_622_ / f);
					float f_623_ = (this.aFloat8509 + ((this.aFloat8497 * (float) i_594_) + f_621_ + (this.aFloat8505 * (float) i_596_)));
					f_602_ = (class2.aFloat25 + class2.aFloat26 * f_623_ / f);
					f_603_ = (class2.aFloat27 + class2.aFloat46 * f_616_ / f);
					float f_624_ = (this.aFloat8508 + ((this.aFloat8499 * (float) i_595_) + f_620_ + (this.aFloat8504 * (float) i_596_)));
					f_604_ = (class2.aFloat23 + class2.aFloat17 * f_624_ / f_598_);
					float f_625_ = (this.aFloat8509 + ((this.aFloat8497 * (float) i_595_) + f_621_ + (this.aFloat8505 * (float) i_596_)));
					f_605_ = (class2.aFloat25 + class2.aFloat26 * f_625_ / f_598_);
					f_606_ = (class2.aFloat27 + class2.aFloat46 * f_617_ / f_598_);
					float f_626_ = (this.aFloat8508 + ((this.aFloat8499 * (float) i_595_) + f_620_ + (this.aFloat8504 * (float) i_597_)));
					f_607_ = (class2.aFloat23 + class2.aFloat17 * f_626_ / f_599_);
					float f_627_ = (this.aFloat8509 + ((this.aFloat8497 * (float) i_595_) + f_621_ + (this.aFloat8505 * (float) i_597_)));
					f_608_ = (class2.aFloat25 + class2.aFloat26 * f_627_ / f_599_);
					f_609_ = (class2.aFloat27 + class2.aFloat46 * f_618_ / f_599_);
					float f_628_ = (this.aFloat8508 + ((this.aFloat8499 * (float) i_594_) + f_620_ + (this.aFloat8504 * (float) i_597_)));
					f_610_ = (class2.aFloat23 + class2.aFloat17 * f_628_ / f_600_);
					float f_629_ = (this.aFloat8509 + ((this.aFloat8497 * (float) i_594_) + f_621_ + (this.aFloat8505 * (float) i_597_)));
					f_611_ = (class2.aFloat25 + class2.aFloat26 * f_629_ / f_600_);
					f_612_ = (class2.aFloat27 + class2.aFloat46 * f_619_ / f_600_);
				} else {
					int i_630_ = anIntArrayArray6290[i][i_588_];
					int i_631_ = anIntArrayArray6290[i + 1][i_588_];
					int i_632_ = anIntArrayArray6290[i + 1][i_588_ + 1];
					int i_633_ = anIntArrayArray6290[i][i_588_ + 1];
					float f_634_ = (this.aFloat8510 + ((this.aFloat8498 * (float) i_594_) + (this.aFloat8502 * (float) i_630_) + (this.aFloat8506 * (float) i_596_)));
					f = (this.aFloat8511 + (this.aFloat8485 * (float) i_594_ + (this.aFloat8486 * (float) i_630_) + (this.aFloat8507 * (float) i_596_)));
					if (f_634_ < -f)
						return;
					float f_635_ = (this.aFloat8510 + ((this.aFloat8498 * (float) i_595_) + (this.aFloat8502 * (float) i_631_) + (this.aFloat8506 * (float) i_596_)));
					f_598_ = (this.aFloat8511 + ((this.aFloat8485 * (float) i_595_) + (this.aFloat8486 * (float) i_631_) + (this.aFloat8507 * (float) i_596_)));
					if (f_635_ < -f_598_)
						return;
					float f_636_ = (this.aFloat8510 + ((this.aFloat8498 * (float) i_595_) + (this.aFloat8502 * (float) i_632_) + (this.aFloat8506 * (float) i_597_)));
					f_599_ = (this.aFloat8511 + ((this.aFloat8485 * (float) i_595_) + (this.aFloat8486 * (float) i_632_) + (this.aFloat8507 * (float) i_597_)));
					if (f_636_ < -f_599_)
						return;
					float f_637_ = (this.aFloat8510 + ((this.aFloat8498 * (float) i_594_) + (this.aFloat8502 * (float) i_633_) + (this.aFloat8506 * (float) i_597_)));
					f_600_ = (this.aFloat8511 + ((this.aFloat8485 * (float) i_594_) + (this.aFloat8486 * (float) i_633_) + (this.aFloat8507 * (float) i_597_)));
					if (f_637_ < -f_600_)
						return;
					float f_638_ = (this.aFloat8508 + ((this.aFloat8499 * (float) i_594_) + (this.aFloat8500 * (float) i_630_) + (this.aFloat8504 * (float) i_596_)));
					f_601_ = (class2.aFloat23 + class2.aFloat17 * f_638_ / f);
					float f_639_ = (this.aFloat8509 + ((this.aFloat8497 * (float) i_594_) + (this.aFloat8501 * (float) i_630_) + (this.aFloat8505 * (float) i_596_)));
					f_602_ = (class2.aFloat25 + class2.aFloat26 * f_639_ / f);
					f_603_ = (class2.aFloat27 + class2.aFloat46 * f_634_ / f);
					float f_640_ = (this.aFloat8508 + ((this.aFloat8499 * (float) i_595_) + (this.aFloat8500 * (float) i_631_) + (this.aFloat8504 * (float) i_596_)));
					f_604_ = (class2.aFloat23 + class2.aFloat17 * f_640_ / f_598_);
					float f_641_ = (this.aFloat8509 + ((this.aFloat8497 * (float) i_595_) + (this.aFloat8501 * (float) i_631_) + (this.aFloat8505 * (float) i_596_)));
					f_605_ = (class2.aFloat25 + class2.aFloat26 * f_641_ / f_598_);
					f_606_ = (class2.aFloat27 + class2.aFloat46 * f_635_ / f_598_);
					float f_642_ = (this.aFloat8508 + ((this.aFloat8499 * (float) i_595_) + (this.aFloat8500 * (float) i_632_) + (this.aFloat8504 * (float) i_597_)));
					f_607_ = (class2.aFloat23 + class2.aFloat17 * f_642_ / f_599_);
					float f_643_ = (this.aFloat8509 + ((this.aFloat8497 * (float) i_595_) + (this.aFloat8501 * (float) i_632_) + (this.aFloat8505 * (float) i_597_)));
					f_608_ = (class2.aFloat25 + class2.aFloat26 * f_643_ / f_599_);
					f_609_ = (class2.aFloat27 + class2.aFloat46 * f_636_ / f_599_);
					float f_644_ = (this.aFloat8508 + ((this.aFloat8499 * (float) i_594_) + (this.aFloat8500 * (float) i_633_) + (this.aFloat8504 * (float) i_597_)));
					f_610_ = (class2.aFloat23 + class2.aFloat17 * f_644_ / f_600_);
					float f_645_ = (this.aFloat8509 + ((this.aFloat8497 * (float) i_594_) + (this.aFloat8501 * (float) i_633_) + (this.aFloat8505 * (float) i_597_)));
					f_611_ = (class2.aFloat25 + class2.aFloat26 * f_645_ / f_600_);
					f_612_ = (class2.aFloat27 + class2.aFloat46 * f_637_ / f_600_);
				}
				if (((f_607_ - f_610_) * (f_605_ - f_611_) - (f_608_ - f_611_) * (f_604_ - f_610_)) > 0.0F) {
					class2.aBoolean20 = (f_607_ < 0.0F || f_610_ < 0.0F || f_604_ < 0.0F || f_607_ > (float) class2.anInt22 || f_610_ > (float) class2.anInt22 || f_604_ > (float) class2.anInt22);
					if (class20.aShort273 >= 0)
						class2.method290(true, true, false, f_608_, f_611_, f_605_, f_607_, f_610_, f_604_, f_609_, f_612_, f_606_, f_599_, f_600_, f_598_, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, ~0xffffff | (Class379.anIntArray4096[(class20.aShort270 & 0xffff)]) & 0xffffff, ~0xffffff | (Class379.anIntArray4096[(class20.aShort267 & 0xffff)]) & 0xffffff, ~0xffffff | (Class379.anIntArray4096[(class20.aShort269 & 0xffff)]) & 0xffffff, 0, 0.0F, 0.0F, 0.0F, class20.aShort273);
					else
						class2.method299(true, true, false, f_608_, f_611_, f_605_, f_607_, f_610_, f_604_, f_609_, f_612_, f_606_, (float) (class20.aShort270 & 0xffff), (float) (class20.aShort267 & 0xffff), (float) (class20.aShort269 & 0xffff));
				}
				if (((f_601_ - f_604_) * (f_611_ - f_605_) - (f_602_ - f_605_) * (f_610_ - f_604_)) > 0.0F) {
					class2.aBoolean20 = (f_601_ < 0.0F || f_604_ < 0.0F || f_610_ < 0.0F || f_601_ > (float) class2.anInt22 || f_604_ > (float) class2.anInt22 || f_610_ > (float) class2.anInt22);
					if (class20.aShort273 >= 0)
						class2.method290(true, true, false, f_602_, f_605_, f_611_, f_601_, f_604_, f_610_, f_603_, f_606_, f_612_, f, f_598_, f_600_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, ~0xffffff | (Class379.anIntArray4096[(class20.aShort272 & 0xffff)]) & 0xffffff, ~0xffffff | (Class379.anIntArray4096[(class20.aShort269 & 0xffff)]) & 0xffffff, ~0xffffff | (Class379.anIntArray4096[(class20.aShort267 & 0xffff)]) & 0xffffff, 0, 0.0F, 0.0F, 0.0F, class20.aShort273);
					else
						class2.method299(true, true, false, f_602_, f_605_, f_611_, f_601_, f_604_, f_610_, f_603_, f_606_, f_612_, (float) (class20.aShort272 & 0xffff), (float) (class20.aShort269 & 0xffff), (float) (class20.aShort267 & 0xffff));
				}
			}
		} else {
			Class9 class9 = this.aClass9ArrayArray8495[i][i_588_];
			if (class9 != null) {
				if (i_593_ != 0) {
					if ((class9.aByte126 & 0x4) != 0) {
						if ((i_593_ & 0x1) != 0)
							return;
					} else if ((i_593_ & 0x2) != 0)
						return;
				}
				for (int i_646_ = 0; i_646_ < class9.aShort115; i_646_++) {
					int i_647_ = (class9.aShortArray118[i_646_] + (i << anInt6289 * -2137349879));
					short i_648_ = class9.aShortArray119[i_646_];
					int i_649_ = (class9.aShortArray120[i_646_] + (i_588_ << anInt6289 * -2137349879));
					float f = (this.aFloat8510 + ((this.aFloat8498 * (float) i_647_) + (this.aFloat8502 * (float) i_648_) + (this.aFloat8506 * (float) i_649_)));
					float f_650_ = (this.aFloat8511 + ((this.aFloat8485 * (float) i_647_) + (this.aFloat8486 * (float) i_648_) + (this.aFloat8507 * (float) i_649_)));
					if (f < -f_650_)
						return;
					float f_651_ = (this.aFloat8508 + ((this.aFloat8499 * (float) i_647_) + (this.aFloat8500 * (float) i_648_) + (this.aFloat8504 * (float) i_649_)));
					float f_652_ = (this.aFloat8509 + ((this.aFloat8497 * (float) i_647_) + (this.aFloat8501 * (float) i_648_) + (this.aFloat8505 * (float) i_649_)));
					fs[i_646_] = (class2.aFloat23 + class2.aFloat17 * f_651_ / f_650_);
					fs_589_[i_646_] = (class2.aFloat25 + class2.aFloat26 * f_652_ / f_650_);
					fs_590_[i_646_] = (class2.aFloat27 + class2.aFloat46 * f / f_650_);
					fs_591_[i_646_] = f_650_;
				}
				if (class9.aShortArray125 != null) {
					for (int i_653_ = 0; i_653_ < class9.aShort123; i_653_++) {
						short i_654_ = class9.aShortArray122[i_653_];
						short i_655_ = class9.aShortArray117[i_653_];
						short i_656_ = class9.aShortArray124[i_653_];
						float f = fs[i_654_];
						float f_657_ = fs[i_655_];
						float f_658_ = fs[i_656_];
						float f_659_ = fs_589_[i_654_];
						float f_660_ = fs_589_[i_655_];
						float f_661_ = fs_589_[i_656_];
						if (((f - f_657_) * (f_661_ - f_660_) - (f_659_ - f_660_) * (f_658_ - f_657_)) > 0.0F) {
							class2.aBoolean20 = (f < 0.0F || f_657_ < 0.0F || f_658_ < 0.0F || f > (float) class2.anInt22 || (f_657_ > (float) class2.anInt22) || (f_658_ > (float) class2.anInt22));
							short i_662_ = class9.aShortArray125[i_653_];
							if (i_662_ != -1)
								class2.method290(true, true, false, f_659_, f_660_, f_661_, f, f_657_, f_658_, fs_590_[i_654_], fs_590_[i_655_], fs_590_[i_656_], fs_591_[i_654_], fs_591_[i_655_], fs_591_[i_656_], ((float) (class9.aShortArray118[i_654_]) / (float) (anInt6288 * -1212653763)), ((float) (class9.aShortArray118[i_655_]) / (float) (anInt6288 * -1212653763)), ((float) (class9.aShortArray118[i_656_]) / (float) (anInt6288 * -1212653763)), ((float) (class9.aShortArray120[i_654_]) / (float) (anInt6288 * -1212653763)), ((float) (class9.aShortArray120[i_655_]) / (float) (anInt6288 * -1212653763)), ((float) (class9.aShortArray120[i_656_]) / (float) (anInt6288 * -1212653763)), ~0xffffff | (Class379.anIntArray4096[((class9.aShortArray121[i_654_]) & 0xffff)]) & 0xffffff, ~0xffffff | (Class379.anIntArray4096[((class9.aShortArray121[i_655_]) & 0xffff)]) & 0xffffff, ~0xffffff | (Class379.anIntArray4096[((class9.aShortArray121[i_656_]) & 0xffff)]) & 0xffffff, 0, 0.0F, 0.0F, 0.0F, i_662_);
							else {
								int i_663_ = class9.anIntArray127[i_653_];
								if (i_663_ != -1)
									class2.method299(true, true, false, f_659_, f_660_, f_661_, f, f_657_, f_658_, fs_590_[i_654_], fs_590_[i_655_], fs_590_[i_656_], (float) (Class195.method1873(i_663_, (class9.aShortArray121[i_654_]))), (float) (Class195.method1873(i_663_, (class9.aShortArray121[i_655_]))), (float) (Class195.method1873(i_663_, (class9.aShortArray121[i_656_]))));
							}
						}
					}
				} else {
					for (int i_664_ = 0; i_664_ < class9.aShort123; i_664_++) {
						short i_665_ = class9.aShortArray122[i_664_];
						short i_666_ = class9.aShortArray117[i_664_];
						short i_667_ = class9.aShortArray124[i_664_];
						float f = fs[i_665_];
						float f_668_ = fs[i_666_];
						float f_669_ = fs[i_667_];
						float f_670_ = fs_589_[i_665_];
						float f_671_ = fs_589_[i_666_];
						float f_672_ = fs_589_[i_667_];
						if (((f - f_668_) * (f_672_ - f_671_) - (f_670_ - f_671_) * (f_669_ - f_668_)) > 0.0F) {
							int i_673_ = class9.anIntArray127[i_664_];
							if (i_673_ != -1) {
								class2.aBoolean20 = (f < 0.0F || f_668_ < 0.0F || f_669_ < 0.0F || f > (float) class2.anInt22 || (f_668_ > (float) class2.anInt22) || f_669_ > (float) (class2.anInt22));
								class2.method299(true, true, false, f_670_, f_671_, f_672_, f, f_668_, f_669_, fs_590_[i_665_], fs_590_[i_666_], fs_590_[i_667_], (float) (Class195.method1873(i_673_, (class9.aShortArray121[i_665_]))), (float) (Class195.method1873(i_673_, (class9.aShortArray121[i_666_]))), (float) (Class195.method1873(i_673_, (class9.aShortArray121[i_667_]))));
							}
						}
					}
				}
			}
		}
	}

	public boolean method6353(Class_na class_na, int i, int i_674_, int i_675_, int i_676_, boolean bool) {
		return false;
	}

	void method6373(int i, int i_706_, int i_707_, int i_708_, int i_709_, int i_710_, int i_711_, boolean[][] bools, Class15 class15, Class2 class2, float[] fs, float[] fs_712_) {
		int i_713_ = (i_711_ - i_709_) * i_707_ / 256;
		int i_714_ = i_707_ >> 8;
		boolean bool = class15.aBoolean207;
		this.aClass_ra_Sub1_8484.RA(false);
		class2.aBoolean16 = false;
		class2.aBoolean48 = false;
		int i_715_ = i;
		int i_716_ = i_706_ + i_713_;
		for (int i_717_ = i_708_; i_717_ < i_710_; i_717_++) {
			for (int i_718_ = i_709_; i_718_ < i_711_; i_718_++) {
				if (bools[i_717_ - i_708_][i_718_ - i_709_]) {
					if (this.aClass6ArrayArray8493 != null) {
						if ((this.aClass6ArrayArray8493[i_717_][i_718_]) != null) {
							Class6 class6 = (this.aClass6ArrayArray8493[i_717_][i_718_]);
							if (class6.aShort91 != -1 && (class6.aByte85 & 0x2) == 0 && class6.anInt90 == 0) {
								int i_719_ = (this.aClass_ra_Sub1_8484.method5206(class6.aShort91));
								class2.method299(true, true, false, (float) (i_716_ - i_714_), (float) (i_716_ - i_714_), (float) i_716_, (float) (i_715_ + i_714_), (float) i_715_, (float) (i_715_ + i_714_), 100.0F, 100.0F, 100.0F, (float) Class195.method1873(i_719_, (class6.anInt81)), (float) Class195.method1873(i_719_, (class6.anInt89)), (float) Class195.method1873(i_719_, (class6.anInt83)));
								class2.method299(true, true, false, (float) i_716_, (float) i_716_, (float) (i_716_ - i_714_), (float) i_715_, (float) (i_715_ + i_714_), (float) i_715_, 100.0F, 100.0F, 100.0F, (float) Class195.method1873(i_719_, (class6.anInt82)), (float) Class195.method1873(i_719_, (class6.anInt83)), (float) Class195.method1873(i_719_, (class6.anInt89)));
							} else if (class6.anInt90 == 0) {
								class2.method292(true, true, false, (float) (i_716_ - i_714_), (float) (i_716_ - i_714_), (float) i_716_, (float) (i_715_ + i_714_), (float) i_715_, (float) (i_715_ + i_714_), 100.0F, 100.0F, 100.0F, class6.anInt81, class6.anInt89, class6.anInt83);
								class2.method292(true, true, false, (float) i_716_, (float) i_716_, (float) (i_716_ - i_714_), (float) i_715_, (float) (i_715_ + i_714_), (float) i_715_, 100.0F, 100.0F, 100.0F, class6.anInt82, class6.anInt83, class6.anInt89);
							} else {
								int i_720_ = class6.anInt90;
								class2.method292(true, true, false, (float) (i_716_ - i_714_), (float) (i_716_ - i_714_), (float) i_716_, (float) (i_715_ + i_714_), (float) i_715_, (float) (i_715_ + i_714_), 100.0F, 100.0F, 100.0F, StaticMethods.method692(i_720_, (class6.anInt81) & ~0xffffff), StaticMethods.method692(i_720_, (class6.anInt89) & ~0xffffff), StaticMethods.method692(i_720_, (class6.anInt83) & ~0xffffff));
								class2.method292(true, true, false, (float) i_716_, (float) i_716_, (float) (i_716_ - i_714_), (float) i_715_, (float) (i_715_ + i_714_), (float) i_715_, 100.0F, 100.0F, 100.0F, StaticMethods.method692(i_720_, (class6.anInt82) & ~0xffffff), StaticMethods.method692(i_720_, (class6.anInt83) & ~0xffffff), StaticMethods.method692(i_720_, (class6.anInt89) & ~0xffffff));
							}
						} else if ((this.aClass13ArrayArray8494[i_717_][i_718_]) != null) {
							Class13 class13 = (this.aClass13ArrayArray8494[i_717_][i_718_]);
							for (int i_721_ = 0; i_721_ < class13.aShort158; i_721_++) {
								fs[i_721_] = (float) (i_715_ + ((class13.aShortArray157[i_721_]) * i_714_ / (anInt6288 * -1212653763)));
								fs_712_[i_721_] = (float) (i_716_ - ((class13.aShortArray162[i_721_]) * i_714_ / (anInt6288 * -1212653763)));
							}
							for (int i_722_ = 0; i_722_ < class13.aShort167; i_722_++) {
								int i_723_ = i_722_ * 3;
								int i_724_ = i_723_ + 1;
								int i_725_ = i_724_ + 1;
								float f = fs[i_723_];
								float f_726_ = fs[i_724_];
								float f_727_ = fs[i_725_];
								float f_728_ = fs_712_[i_723_];
								float f_729_ = fs_712_[i_724_];
								float f_730_ = fs_712_[i_725_];
								if (class13.anIntArray163 != null && (class13.anIntArray163[i_722_]) != 0 && ((class13.aShortArray166 == null) || ((class13.aShortArray166 != null) && ((class13.aShortArray166[i_722_]) == -1)))) {
									int i_731_ = (class13.anIntArray163[i_722_]);
									class2.method292(true, true, false, f_728_, f_729_, f_730_, f, f_726_, f_727_, 100.0F, 100.0F, 100.0F, StaticMethods.method692(i_731_, (-16777216 - ((class13.anIntArray164[i_723_]) & ~0xffffff))), StaticMethods.method692(i_731_, (-16777216 - ((class13.anIntArray164[i_724_]) & ~0xffffff))), StaticMethods.method692(i_731_, (-16777216 - ((class13.anIntArray164[i_725_]) & ~0xffffff))));
								} else if ((class13.aShortArray166 != null) && ((class13.aShortArray166[i_722_]) != -1)) {
									int i_732_ = (this.aClass_ra_Sub1_8484.method5206(class13.aShortArray166[i_722_]));
									class2.method299(true, true, false, f_728_, f_729_, f_730_, f, f_726_, f_727_, 100.0F, 100.0F, 100.0F, (float) i_732_, (float) i_732_, (float) i_732_);
								} else
									class2.method292(true, true, false, f_728_, f_729_, f_730_, f, f_726_, f_727_, 100.0F, 100.0F, 100.0F, (class13.anIntArray164[i_723_]), (class13.anIntArray164[i_724_]), (class13.anIntArray164[i_725_]));
							}
						}
					} else if ((this.aClass17ArrayArray8515[i_717_][i_718_]) != null) {
						Class17 class17 = (this.aClass17ArrayArray8515[i_717_][i_718_]);
						for (int i_733_ = 0; i_733_ < class17.aShort234; i_733_++) {
							fs[i_733_] = (float) (i_715_ + ((class17.aShortArray235[i_733_]) * i_714_ / (anInt6288 * -1212653763)));
							fs_712_[i_733_] = (float) (i_716_ - ((class17.aShortArray243[i_733_]) * i_714_ / (anInt6288 * -1212653763)));
						}
						for (int i_734_ = 0; i_734_ < class17.aShort236; i_734_++) {
							int i_735_ = i_734_ * 3;
							int i_736_ = i_735_ + 1;
							int i_737_ = i_736_ + 1;
							float f = fs[i_735_];
							float f_738_ = fs[i_736_];
							float f_739_ = fs[i_737_];
							float f_740_ = fs_712_[i_735_];
							float f_741_ = fs_712_[i_736_];
							float f_742_ = fs_712_[i_737_];
							if (class17.anIntArray233 != null && (class17.anIntArray233[i_734_] != 0)) {
								int i_743_ = (class17.anIntArray233[i_734_]);
								class2.method292(true, true, false, f_740_, f_741_, f_742_, f, f_738_, f_739_, 100.0F, 100.0F, 100.0F, i_743_, i_743_, i_743_);
							} else
								class2.method292(true, true, false, f_740_, f_741_, f_742_, f, f_738_, f_739_, 100.0F, 100.0F, 100.0F, class17.anIntArray237[i_735_], class17.anIntArray237[i_736_], (class17.anIntArray237[i_737_]));
						}
					}
				}
				i_716_ -= i_714_;
			}
			i_716_ = i_706_ + i_713_;
			i_715_ += i_714_;
		}
		class2.aBoolean16 = true;
		this.aClass_ra_Sub1_8484.RA(bool);
	}

}
