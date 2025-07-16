package com.jagex;/* Class264_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class264_Sub2 extends FontToolkit {
	JavaGraphicsToolkit aClass_ra_Sub1_7122;
	byte[][] aByteArrayArray7123;
	int[] anIntArray7124;
	int[] anIntArray7125;
	int[] anIntArray7126;
	int[] anIntArray7127;

	void method2504(byte[] is, int[] is_0_, int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, ToolkitLoader toolkitLoader, int i_10_, int i_11_) {
		Toolkit_Loader_Sub2 class_ta_sub2 = (Toolkit_Loader_Sub2) toolkitLoader;
		int[] is_12_ = class_ta_sub2.anIntArray8443;
		int[] is_13_ = class_ta_sub2.anIntArray8442;
		int i_14_ = i_7_ - -912871679 * (this.aClass_ra_Sub1_7122.anInt7974);
		int i_15_ = i_8_;
		if (i_11_ > i_15_) {
			i_15_ = i_11_;
			i_2_ += (this.aClass_ra_Sub1_7122.width * 692106883 * (i_11_ - i_8_));
			i_1_ += (i_11_ - i_8_) * i_9_;
		}
		int i_16_ = (is_12_.length + i_11_ < i_8_ + i_4_ ? i_11_ + is_12_.length : i_8_ + i_4_);
		for (int i_17_ = i_15_; i_17_ < i_16_; i_17_++) {
			int i_18_ = is_12_[i_17_ - i_11_] + i_10_;
			int i_19_ = is_13_[i_17_ - i_11_];
			int i_20_ = i_3_;
			if (i_14_ > i_18_) {
				int i_21_ = i_14_ - i_18_;
				if (i_21_ >= i_19_) {
					i_1_ += i_6_ + i_3_;
					i_2_ += i_3_ + i_5_;
					continue;
				}
				i_19_ -= i_21_;
			} else {
				int i_22_ = i_18_ - i_14_;
				if (i_22_ >= i_3_) {
					i_1_ += i_6_ + i_3_;
					i_2_ += i_5_ + i_3_;
					continue;
				}
				i_1_ += i_22_;
				i_20_ -= i_22_;
				i_2_ += i_22_;
			}
			int i_23_ = 0;
			if (i_20_ < i_19_)
				i_19_ = i_20_;
			else
				i_23_ = i_20_ - i_19_;
			for (int i_24_ = -i_19_; i_24_ < 0; i_24_++) {
				int i_25_ = is[i_1_++] & 0xff;
				if (0 != i_25_) {
					int i_26_ = ((((i & 0xff00) * i_25_ & 0xff0000) + ((i & 0xff00ff) * i_25_ & ~0xff00ff)) >> 8);
					i_25_ = 256 - i_25_;
					int i_27_ = is_0_[i_2_];
					is_0_[i_2_++] = ((((i_27_ & 0xff00ff) * i_25_ & ~0xff00ff) + (i_25_ * (i_27_ & 0xff00) & 0xff0000)) >> 8) + i_26_;
				} else
					i_2_++;
			}
			i_1_ += i_6_ + i_23_;
			i_2_ += i_5_ + i_23_;
		}
	}

	void method2505(byte[] is, int[] is_28_, int i, int i_29_, int i_30_, int i_31_, int i_32_, int i_33_, int i_34_) {
		for (int i_35_ = -i_32_; i_35_ < 0; i_35_++) {
			for (int i_36_ = -i_31_; i_36_ < 0; i_36_++) {
				int i_37_ = is[i_29_++] & 0xff;
				if (0 != i_37_) {
					int i_38_ = ((((i & 0xff00) * i_37_ & 0xff0000) + (i_37_ * (i & 0xff00ff) & ~0xff00ff)) >> 8);
					i_37_ = 256 - i_37_;
					int i_39_ = is_28_[i_30_];
					is_28_[i_30_++] = (((i_37_ * (i_39_ & 0xff00ff) & ~0xff00ff) + ((i_39_ & 0xff00) * i_37_ & 0xff0000)) >> 8) + i_38_;
				} else
					i_30_++;
			}
			i_30_ += i_33_;
			i_29_ += i_34_;
		}
	}

	Class264_Sub2(JavaGraphicsToolkit class_ra_sub1, RSFontMetrics class505, Sprite[] class89s, int[] is, int[] is_40_) {
		super(class_ra_sub1, class505);
		this.aClass_ra_Sub1_7122 = class_ra_sub1;
		this.aClass_ra_Sub1_7122 = class_ra_sub1;
		this.anIntArray7124 = is;
		this.anIntArray7125 = is_40_;
		this.aByteArrayArray7123 = new byte[class89s.length][];
		this.anIntArray7126 = new int[class89s.length];
		this.anIntArray7127 = new int[class89s.length];
		for (int i = 0; i < class89s.length; i++) {
			Sprite class89 = class89s[i];
			if (class89.alpha != null)
				this.aByteArrayArray7123[i] = class89.alpha;
			else {
				byte[] is_41_ = class89.raster;
				byte[] is_42_ = (this.aByteArrayArray7123[i] = new byte[is_41_.length]);
				for (int i_43_ = 0; i_43_ < is_41_.length; i_43_++)
					is_42_[i_43_] = (byte) (is_41_[i_43_] == 0 ? 0 : -1);
			}
			this.anIntArray7126[i] = class89.offsetY;
			this.anIntArray7127[i] = class89.offsetX;
		}
	}

	void method2486(char c, int i, int i_44_, int i_45_, boolean bool, ToolkitLoader toolkitLoader, int i_46_, int i_47_) {
		if ((this.aClass_ra_Sub1_7122.anIntArray7967) != null) {
			if (null == toolkitLoader)
				UA(c, i, i_44_, i_45_, bool);
			else {
				i += this.anIntArray7127[c];
				i_44_ += this.anIntArray7126[c];
				int i_48_ = this.anIntArray7124[c];
				int i_49_ = this.anIntArray7125[c];
				int i_50_ = (692106883 * this.aClass_ra_Sub1_7122.width);
				int i_51_ = i_44_ * i_50_ + i;
				int i_52_ = i_50_ - i_48_;
				int i_53_ = 0;
				int i_54_ = 0;
				if (i_44_ < -1278653805 * (this.aClass_ra_Sub1_7122.anInt7976)) {
					int i_55_ = (-1278653805 * this.aClass_ra_Sub1_7122.anInt7976 - i_44_);
					i_49_ -= i_55_;
					i_44_ = (this.aClass_ra_Sub1_7122.anInt7976 * -1278653805);
					i_54_ += i_48_ * i_55_;
					i_51_ += i_55_ * i_50_;
				}
				if (i_44_ + i_49_ > (this.aClass_ra_Sub1_7122.anInt7977) * 63686679)
					i_49_ -= (i_49_ + i_44_ - (this.aClass_ra_Sub1_7122.anInt7977) * 63686679);
				if (i < (this.aClass_ra_Sub1_7122.anInt7974 * -912871679)) {
					int i_56_ = (-912871679 * this.aClass_ra_Sub1_7122.anInt7974 - i);
					i_48_ -= i_56_;
					i = (this.aClass_ra_Sub1_7122.anInt7974 * -912871679);
					i_54_ += i_56_;
					i_51_ += i_56_;
					i_53_ += i_56_;
					i_52_ += i_56_;
				}
				if (i + i_48_ > -1416794725 * (this.aClass_ra_Sub1_7122.anInt7991)) {
					int i_57_ = i_48_ + i - (this.aClass_ra_Sub1_7122.anInt7991) * -1416794725;
					i_48_ -= i_57_;
					i_53_ += i_57_;
					i_52_ += i_57_;
				}
				if (i_48_ > 0 && i_49_ > 0)
					method2504(this.aByteArrayArray7123[c], (this.aClass_ra_Sub1_7122.anIntArray7967), i_45_, i_54_, i_51_, i_48_, i_49_, i_52_, i_53_, i, i_44_, this.anIntArray7124[c], toolkitLoader, i_46_, i_47_);
			}
		}
	}

	void UA(char c, int i, int i_58_, int i_59_, boolean bool) {
		if ((this.aClass_ra_Sub1_7122.anIntArray7967) != null) {
			i += this.anIntArray7127[c];
			i_58_ += this.anIntArray7126[c];
			int i_60_ = this.anIntArray7124[c];
			int i_61_ = this.anIntArray7125[c];
			int i_62_ = (this.aClass_ra_Sub1_7122.width) * 692106883;
			int i_63_ = i_58_ * i_62_ + i;
			int i_64_ = i_62_ - i_60_;
			int i_65_ = 0;
			int i_66_ = 0;
			if (i_58_ < -1278653805 * (this.aClass_ra_Sub1_7122.anInt7976)) {
				int i_67_ = ((this.aClass_ra_Sub1_7122.anInt7976) * -1278653805 - i_58_);
				i_61_ -= i_67_;
				i_58_ = (this.aClass_ra_Sub1_7122.anInt7976 * -1278653805);
				i_66_ += i_60_ * i_67_;
				i_63_ += i_62_ * i_67_;
			}
			if (i_61_ + i_58_ > 63686679 * (this.aClass_ra_Sub1_7122.anInt7977))
				i_61_ -= i_61_ + i_58_ - 63686679 * (this.aClass_ra_Sub1_7122.anInt7977);
			if (i < (this.aClass_ra_Sub1_7122.anInt7974) * -912871679) {
				int i_68_ = ((this.aClass_ra_Sub1_7122.anInt7974) * -912871679 - i);
				i_60_ -= i_68_;
				i = (this.aClass_ra_Sub1_7122.anInt7974 * -912871679);
				i_66_ += i_68_;
				i_63_ += i_68_;
				i_65_ += i_68_;
				i_64_ += i_68_;
			}
			if (i_60_ + i > (this.aClass_ra_Sub1_7122.anInt7991) * -1416794725) {
				int i_69_ = i_60_ + i - (this.aClass_ra_Sub1_7122.anInt7991) * -1416794725;
				i_60_ -= i_69_;
				i_65_ += i_69_;
				i_64_ += i_69_;
			}
			if (i_60_ > 0 && i_61_ > 0)
				method2505(this.aByteArrayArray7123[c], (this.aClass_ra_Sub1_7122.anIntArray7967), i_59_, i_66_, i_63_, i_60_, i_61_, i_64_, i_65_);
		}
	}

	static final void method2506() {
		try {
			StaticMethods.resetCutscene();
			GameClient.myRegion.method2666();
			for (int i_108_ = 0; i_108_ < HintIcon.loadedIcons.length; i_108_++)
				HintIcon.loadedIcons[i_108_] = null;
			for (int i_109_ = 0; i_109_ < GameClient.aClass299Array8671.length; i_109_++)
				GameClient.aClass299Array8671[i_109_] = null;
			Class372.method4592();
			for (int i_110_ = 0; i_110_ < 2048; i_110_++)
				GameClient.entities[i_110_] = null;
			GameClient.entitySize = 0;
			GameClient.entityList.clear();
			GameClient.anInt8772 = 0;
			GameClient.aClass437_8685.clear();
			Class82_Sub11.stopCameraShake();
			GameClient.totalPacketCount = 0;
			Class128.playerVarsProvider.method1603(-1863575253);
			Class508.aClass162_6216 = null;
			Class225.aClass162_2512 = null;
			StaticMethods.aClanChannelChat_4084 = null;
			ClanChannelChat.clanManager = null;
			StaticMethods.aClass396_6291 = null;
			Class365_Sub1_Sub2_Sub1.aLong9911 = 0L;
			Class194.closeMenus();
			StaticMethods.closeMenus();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("xk.gs(").append(')').toString());
		}
	}

	static void method2507(Class334 class334, int i, int i_111_, int i_112_, ModelToolkit modelToolkit) {
		try {
			if (null != modelToolkit)
				class334.method4083(i, i_111_, i_112_, modelToolkit.N(), modelToolkit.RA(), modelToolkit.ya(), modelToolkit.YA(), modelToolkit.o(), modelToolkit.AA(), modelToolkit.ha());
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("xk.dd(").append(')').toString());
		}
	}

	static final int method2508(int i, int i_114_, short i_115_) {
		try {
			int i_116_ = (StaticMethods.method1447(i - 1, i_114_ - 1) + StaticMethods.method1447(1 + i, i_114_ - 1) + StaticMethods.method1447(i - 1, i_114_ + 1) + StaticMethods.method1447(1 + i, 1 + i_114_));
			int i_117_ = (StaticMethods.method1447(i - 1, i_114_) + StaticMethods.method1447(i + 1, i_114_) + StaticMethods.method1447(i, i_114_ - 1) + StaticMethods.method1447(i, 1 + i_114_));
			int i_118_ = StaticMethods.method1447(i, i_114_);
			return i_118_ / 4 + (i_117_ / 8 + i_116_ / 16);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("xk.o(").append(')').toString());
		}
	}
}
