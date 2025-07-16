package com.jagex;/* Class264_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.net.Socket;

public class Class264_Sub4 extends FontToolkit {
	int[] anIntArray7132;
	int[] anIntArray7133;
	int[] anIntArray7134;
	byte[][] aByteArrayArray7135;
	int[] anIntArray7136;
	JavaGraphicsToolkit aClass_ra_Sub1_7137;

	Class264_Sub4(JavaGraphicsToolkit class_ra_sub1, RSFontMetrics class505, Sprite[] class89s, int[] is, int[] is_0_) {
		super(class_ra_sub1, class505);
		this.aClass_ra_Sub1_7137 = class_ra_sub1;
		this.anIntArray7133 = is;
		this.anIntArray7132 = is_0_;
		this.aByteArrayArray7135 = new byte[class89s.length][];
		this.anIntArray7136 = new int[class89s.length];
		this.anIntArray7134 = new int[class89s.length];
		for (int i = 0; i < class89s.length; i++) {
			this.aByteArrayArray7135[i] = class89s[i].raster;
			this.anIntArray7136[i] = class89s[i].offsetY;
			this.anIntArray7134[i] = class89s[i].offsetX;
		}
	}

	void method2509(byte[] is, int[] is_1_, int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_) {
		int i_8_ = i >>> 24;
		int i_9_ = 255 - i_8_;
		for (int i_10_ = -i_5_; i_10_ < 0; i_10_++) {
			for (int i_11_ = -i_4_; i_11_ < 0; i_11_++) {
				if (is[i_2_++] != 0) {
					int i_12_ = ((((i & 0xff00) * i_8_ & 0xff0000) + (i_8_ * (i & 0xff00ff) & ~0xff00ff)) >> 8);
					int i_13_ = is_1_[i_3_];
					is_1_[i_3_++] = (((i_9_ * (i_13_ & 0xff00ff) & ~0xff00ff) + (i_9_ * (i_13_ & 0xff00) & 0xff0000)) >> 8) + i_12_;
				} else
					i_3_++;
			}
			i_3_ += i_6_;
			i_2_ += i_7_;
		}
	}

	void method2486(char c, int i, int i_14_, int i_15_, boolean bool, ToolkitLoader toolkitLoader, int i_16_, int i_17_) {
		if ((this.aClass_ra_Sub1_7137.anIntArray7967) != null) {
			if (null == toolkitLoader)
				UA(c, i, i_14_, i_15_, bool);
			else {
				i += this.anIntArray7134[c];
				i_14_ += this.anIntArray7136[c];
				int i_18_ = this.anIntArray7133[c];
				int i_19_ = this.anIntArray7132[c];
				int i_20_ = (692106883 * this.aClass_ra_Sub1_7137.width);
				int i_21_ = i + i_14_ * i_20_;
				int i_22_ = i_20_ - i_18_;
				int i_23_ = 0;
				int i_24_ = 0;
				if (i_14_ < -1278653805 * (this.aClass_ra_Sub1_7137.anInt7976)) {
					int i_25_ = ((this.aClass_ra_Sub1_7137.anInt7976) * -1278653805 - i_14_);
					i_19_ -= i_25_;
					i_14_ = -1278653805 * this.aClass_ra_Sub1_7137.anInt7976;
					i_24_ += i_25_ * i_18_;
					i_21_ += i_25_ * i_20_;
				}
				if (i_19_ + i_14_ > (this.aClass_ra_Sub1_7137.anInt7977) * 63686679)
					i_19_ -= i_19_ + i_14_ - 63686679 * (this.aClass_ra_Sub1_7137.anInt7977);
				if (i < -912871679 * (this.aClass_ra_Sub1_7137.anInt7974)) {
					int i_26_ = (-912871679 * this.aClass_ra_Sub1_7137.anInt7974 - i);
					i_18_ -= i_26_;
					i = -912871679 * (this.aClass_ra_Sub1_7137.anInt7974);
					i_24_ += i_26_;
					i_21_ += i_26_;
					i_23_ += i_26_;
					i_22_ += i_26_;
				}
				if (i_18_ + i > -1416794725 * (this.aClass_ra_Sub1_7137.anInt7991)) {
					int i_27_ = i_18_ + i - (this.aClass_ra_Sub1_7137.anInt7991) * -1416794725;
					i_18_ -= i_27_;
					i_23_ += i_27_;
					i_22_ += i_27_;
				}
				if (i_18_ > 0 && i_19_ > 0) {
					if (-16777216 == (i_15_ & ~0xffffff))
						method2510((this.aByteArrayArray7135[c]), (this.aClass_ra_Sub1_7137.anIntArray7967), i_15_, i_24_, i_21_, i_18_, i_19_, i_22_, i_23_, i, i_14_, this.anIntArray7133[c], toolkitLoader, i_16_, i_17_);
					else
						method2512((this.aByteArrayArray7135[c]), (this.aClass_ra_Sub1_7137.anIntArray7967), i_15_, i_24_, i_21_, i_18_, i_19_, i_22_, i_23_, i, i_14_, this.anIntArray7133[c], toolkitLoader, i_16_, i_17_);
				}
			}
		}
	}

	void method2510(byte[] is, int[] is_28_, int i, int i_29_, int i_30_, int i_31_, int i_32_, int i_33_, int i_34_, int i_35_, int i_36_, int i_37_, ToolkitLoader toolkitLoader, int i_38_, int i_39_) {
		Toolkit_Loader_Sub2 class_ta_sub2 = (Toolkit_Loader_Sub2) toolkitLoader;
		int[] is_40_ = class_ta_sub2.anIntArray8443;
		int[] is_41_ = class_ta_sub2.anIntArray8442;
		int i_42_ = i_36_;
		if (i_39_ > i_42_) {
			i_42_ = i_39_;
			i_30_ += (this.aClass_ra_Sub1_7137.width * 692106883 * (i_39_ - i_36_));
			i_29_ += (i_39_ - i_36_) * i_37_;
		}
		int i_43_ = (is_40_.length + i_39_ < i_32_ + i_36_ ? i_39_ + is_40_.length : i_36_ + i_32_);
		for (int i_44_ = i_42_; i_44_ < i_43_; i_44_++) {
			int i_45_ = is_40_[i_44_ - i_39_] + i_38_;
			int i_46_ = is_41_[i_44_ - i_39_];
			int i_47_ = i_31_;
			if (i_35_ > i_45_) {
				int i_48_ = i_35_ - i_45_;
				if (i_48_ >= i_46_) {
					i_29_ += i_31_ + i_34_;
					i_30_ += i_33_ + i_31_;
					continue;
				}
				i_46_ -= i_48_;
			} else {
				int i_49_ = i_45_ - i_35_;
				if (i_49_ >= i_31_) {
					i_29_ += i_31_ + i_34_;
					i_30_ += i_33_ + i_31_;
					continue;
				}
				i_29_ += i_49_;
				i_47_ -= i_49_;
				i_30_ += i_49_;
			}
			int i_50_ = 0;
			if (i_47_ < i_46_)
				i_46_ = i_47_;
			else
				i_50_ = i_47_ - i_46_;
			for (int i_51_ = 0; i_51_ < i_46_; i_51_++) {
				if (is[i_29_++] != 0)
					is_28_[i_30_++] = i;
				else
					i_30_++;
			}
			i_29_ += i_50_ + i_34_;
			i_30_ += i_33_ + i_50_;
		}
	}

	void method2511(byte[] is, int[] is_52_, int i, int i_53_, int i_54_, int i_55_, int i_56_, int i_57_, int i_58_) {
		int i_59_ = -(i_55_ >> 2);
		i_55_ = -(i_55_ & 0x3);
		for (int i_60_ = -i_56_; i_60_ < 0; i_60_++) {
			for (int i_61_ = i_59_; i_61_ < 0; i_61_++) {
				if (is[i_53_++] != 0)
					is_52_[i_54_++] = i;
				else
					i_54_++;
				if (is[i_53_++] != 0)
					is_52_[i_54_++] = i;
				else
					i_54_++;
				if (is[i_53_++] != 0)
					is_52_[i_54_++] = i;
				else
					i_54_++;
				if (is[i_53_++] != 0)
					is_52_[i_54_++] = i;
				else
					i_54_++;
			}
			for (int i_62_ = i_55_; i_62_ < 0; i_62_++) {
				if (is[i_53_++] != 0)
					is_52_[i_54_++] = i;
				else
					i_54_++;
			}
			i_54_ += i_57_;
			i_53_ += i_58_;
		}
	}

	void method2512(byte[] is, int[] is_63_, int i, int i_64_, int i_65_, int i_66_, int i_67_, int i_68_, int i_69_, int i_70_, int i_71_, int i_72_, ToolkitLoader toolkitLoader, int i_73_, int i_74_) {
		Toolkit_Loader_Sub2 class_ta_sub2 = (Toolkit_Loader_Sub2) toolkitLoader;
		int[] is_75_ = class_ta_sub2.anIntArray8443;
		int[] is_76_ = class_ta_sub2.anIntArray8442;
		int i_77_ = i_70_ - -912871679 * (this.aClass_ra_Sub1_7137.anInt7974);
		int i_78_ = i_71_;
		if (i_74_ > i_78_) {
			i_78_ = i_74_;
			i_65_ += ((i_74_ - i_71_) * (692106883 * (this.aClass_ra_Sub1_7137.width)));
			i_64_ += (i_74_ - i_71_) * i_72_;
		}
		int i_79_ = (i_74_ + is_75_.length < i_71_ + i_67_ ? is_75_.length + i_74_ : i_67_ + i_71_);
		int i_80_ = i >>> 24;
		int i_81_ = 255 - i_80_;
		for (int i_82_ = i_78_; i_82_ < i_79_; i_82_++) {
			int i_83_ = i_73_ + is_75_[i_82_ - i_74_];
			int i_84_ = is_76_[i_82_ - i_74_];
			int i_85_ = i_66_;
			if (i_77_ > i_83_) {
				int i_86_ = i_77_ - i_83_;
				if (i_86_ >= i_84_) {
					i_64_ += i_66_ + i_69_;
					i_65_ += i_66_ + i_68_;
					continue;
				}
				i_84_ -= i_86_;
			} else {
				int i_87_ = i_83_ - i_77_;
				if (i_87_ >= i_66_) {
					i_64_ += i_69_ + i_66_;
					i_65_ += i_68_ + i_66_;
					continue;
				}
				i_64_ += i_87_;
				i_85_ -= i_87_;
				i_65_ += i_87_;
			}
			int i_88_ = 0;
			if (i_85_ < i_84_)
				i_84_ = i_85_;
			else
				i_88_ = i_85_ - i_84_;
			for (int i_89_ = -i_84_; i_89_ < 0; i_89_++) {
				if (is[i_64_++] != 0) {
					int i_90_ = ((((i & 0xff00) * i_80_ & 0xff0000) + (i_80_ * (i & 0xff00ff) & ~0xff00ff)) >> 8);
					int i_91_ = is_63_[i_65_];
					is_63_[i_65_++] = i_90_ + (((i_81_ * (i_91_ & 0xff00ff) & ~0xff00ff) + ((i_91_ & 0xff00) * i_81_ & 0xff0000)) >> 8);
				} else
					i_65_++;
			}
			i_64_ += i_88_ + i_69_;
			i_65_ += i_88_ + i_68_;
		}
	}

    void UA(char c, int i, int i_104_, int i_105_, boolean bool) {
		if (null != (this.aClass_ra_Sub1_7137.anIntArray7967)) {
			i += this.anIntArray7134[c];
			i_104_ += this.anIntArray7136[c];
			int i_106_ = this.anIntArray7133[c];
			int i_107_ = this.anIntArray7132[c];
			int i_108_ = 692106883 * (this.aClass_ra_Sub1_7137.width);
			int i_109_ = i + i_104_ * i_108_;
			int i_110_ = i_108_ - i_106_;
			int i_111_ = 0;
			int i_112_ = 0;
			if (i_104_ < (this.aClass_ra_Sub1_7137.anInt7976) * -1278653805) {
				int i_113_ = (-1278653805 * (this.aClass_ra_Sub1_7137.anInt7976) - i_104_);
				i_107_ -= i_113_;
				i_104_ = (this.aClass_ra_Sub1_7137.anInt7976 * -1278653805);
				i_112_ += i_106_ * i_113_;
				i_109_ += i_113_ * i_108_;
			}
			if (i_107_ + i_104_ > 63686679 * (this.aClass_ra_Sub1_7137.anInt7977))
				i_107_ -= (i_104_ + i_107_ - (this.aClass_ra_Sub1_7137.anInt7977) * 63686679);
			if (i < (this.aClass_ra_Sub1_7137.anInt7974) * -912871679) {
				int i_114_ = (-912871679 * (this.aClass_ra_Sub1_7137.anInt7974) - i);
				i_106_ -= i_114_;
				i = (this.aClass_ra_Sub1_7137.anInt7974 * -912871679);
				i_112_ += i_114_;
				i_109_ += i_114_;
				i_111_ += i_114_;
				i_110_ += i_114_;
			}
			if (i_106_ + i > (this.aClass_ra_Sub1_7137.anInt7991) * -1416794725) {
				int i_115_ = (i_106_ + i - -1416794725 * this.aClass_ra_Sub1_7137.anInt7991);
				i_106_ -= i_115_;
				i_111_ += i_115_;
				i_110_ += i_115_;
			}
			if (i_106_ > 0 && i_107_ > 0) {
				if ((i_105_ & ~0xffffff) == -16777216)
					method2511(this.aByteArrayArray7135[c], (this.aClass_ra_Sub1_7137.anIntArray7967), i_105_, i_112_, i_109_, i_106_, i_107_, i_110_, i_111_);
				else if (0 != (i_105_ & ~0xffffff))
					method2509(this.aByteArrayArray7135[c], (this.aClass_ra_Sub1_7137.anIntArray7967), i_105_, i_112_, i_109_, i_106_, i_107_, i_110_, i_111_);
			}
		}
	}

    public static void method2513(boolean bool) {
		try {
			for (NotDefinition class298_sub41 = ((NotDefinition) NotDefinition.aClass453_7421.method5939()); null != class298_sub41; class298_sub41 = ((NotDefinition) NotDefinition.aClass453_7421.method5944())) {
				if (null != (class298_sub41.aClass298_Sub19_Sub2_7447)) {
					Class285.aClass298_Sub19_Sub4_3083.method3048(class298_sub41.aClass298_Sub19_Sub2_7447);
					class298_sub41.aClass298_Sub19_Sub2_7447 = null;
				}
				if (null != (class298_sub41.aClass298_Sub19_Sub2_7426)) {
					Class285.aClass298_Sub19_Sub4_3083.method3048(class298_sub41.aClass298_Sub19_Sub2_7426);
					class298_sub41.aClass298_Sub19_Sub2_7426 = null;
				}
				class298_sub41.unlink();
			}
			if (bool) {
				for (NotDefinition class298_sub41 = (NotDefinition) NotDefinition.aClass453_7455.method5939(); null != class298_sub41; class298_sub41 = ((NotDefinition) NotDefinition.aClass453_7455.method5944())) {
					if (null != (class298_sub41.aClass298_Sub19_Sub2_7447)) {
						Class285.aClass298_Sub19_Sub4_3083.method3048(class298_sub41.aClass298_Sub19_Sub2_7447);
						class298_sub41.aClass298_Sub19_Sub2_7447 = null;
					}
					class298_sub41.unlink();
				}
				for (NotDefinition class298_sub41 = (NotDefinition) NotDefinition.aClass437_7440.method5816(); class298_sub41 != null; class298_sub41 = (NotDefinition) NotDefinition.aClass437_7440.method5815()) {
					if ((class298_sub41.aClass298_Sub19_Sub2_7447) != null) {
						Class285.aClass298_Sub19_Sub4_3083.method3048(class298_sub41.aClass298_Sub19_Sub2_7447);
						class298_sub41.aClass298_Sub19_Sub2_7447 = null;
					}
					class298_sub41.unlink();
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("xw.a(").append(')').toString());
		}
	}

	public static int method2514(int i, int i_142_, int i_143_, short i_144_) {
		try {
			if (Class301_Sub1.anInt7624 * -1289394455 < 100)
				return -2;
			int i_145_ = -2;
			int i_146_ = 2147483647;
			int i_147_ = i_142_ - Class301_Sub1.mapX;
			int i_148_ = i_143_ - Class301_Sub1.mapY;
			for (Class298_Sub52 class298_sub52 = ((Class298_Sub52) Class301_Sub1.aClass453_3236.method5939()); class298_sub52 != null; class298_sub52 = (Class298_Sub52) Class301_Sub1.aClass453_3236.method5944()) {
				if (class298_sub52.anInt7608 * -530122905 != i) {
					if (i_144_ >= 128)
						throw new IllegalStateException();
				} else {
					int i_149_ = class298_sub52.anInt7607 * 2122110429;
					int i_150_ = class298_sub52.anInt7610 * -372920341;
					int i_151_ = (i_149_ + Class301_Sub1.mapX << 14 | i_150_ + Class301_Sub1.mapY);
					int i_152_ = ((i_147_ - i_149_) * (i_147_ - i_149_) + (i_148_ - i_150_) * (i_148_ - i_150_));
					if (i_145_ < 0 || i_152_ < i_146_) {
						i_145_ = i_151_;
						i_146_ = i_152_;
					}
				}
			}
			return i_145_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("xw.ck(").append(')').toString());
		}
	}

	public static Stream method2515(Socket socket, int i) throws IOException {
		try {
			return new Stream_Sub1(socket, i);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("xw.a(").append(')').toString());
		}
	}

	static final void method2516(ScriptRuntime class403, int i) {
		try {
			int i_154_ = (class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]);
			if (i_154_ != SettingsManager.settingsManager.skybox.getValue()) {
				SettingsManager.settingsManager.setValue(SettingsManager.settingsManager.skybox, i_154_);
				ToMoveSettings.encodeBuffer();
				GameClient.sentPreferences = false;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("xw.ajd(").append(')').toString());
		}
	}
}
