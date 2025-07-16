package com.jagex;/* Class342 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.network.OutgoingPacket;
import com.jagex.utils.StringUtils;

public class Class342 {
	int anInt3647;
	Class442 aClass442_3648;
	ParticleSystem aParticleSystem_3649;
	boolean aBoolean3650;
	int anInt3651;
	int anInt3652;
	long aLong3653;
	int anInt3654;
	Class363 aClass363_3655;
	Class182 aClass182_3656;
	int anInt3657;
	int anInt3658 = 0;
	int anInt3659;
	int anInt3660;
	Class363 aClass363_3661;
	EmissiveTriangle aEmissiveTriangle_3662;
	int anInt3663;
	boolean aBoolean3664 = false;
	boolean aBoolean3665;

	void method4146(byte i) {
		try {
			this.aClass363_3655.anInt3930 = this.aEmissiveTriangle_3662.anInt777 * 1670788257;
			this.aClass363_3655.anInt3920 = -477225237 * this.aEmissiveTriangle_3662.anInt783;
			this.aClass363_3655.anInt3921 = -1752367969 * this.aEmissiveTriangle_3662.anInt779;
			this.aClass363_3655.anInt3922 = 1328143831 * this.aEmissiveTriangle_3662.anInt772;
			this.aClass363_3655.anInt3923 = -24388153 * this.aEmissiveTriangle_3662.anInt781;
			this.aClass363_3655.anInt3924 = this.aEmissiveTriangle_3662.anInt782 * -413789161;
			this.aClass363_3655.anInt3925 = 1699665565 * this.aEmissiveTriangle_3662.anInt771;
			this.aClass363_3655.anInt3928 = this.aEmissiveTriangle_3662.anInt784 * -651869151;
			this.aClass363_3655.anInt3927 = this.aEmissiveTriangle_3662.anInt785 * -1739241385;
			if (((this.aClass363_3655.anInt3930 * 1408993757) == (this.aClass363_3655.anInt3922 * -505162977)) && ((348899357 * this.aClass363_3655.anInt3925) == (this.aClass363_3655.anInt3922 * -505162977)) && ((this.aClass363_3655.anInt3920 * 1833016095) == 1360159111 * this.aClass363_3655.anInt3923) && ((this.aClass363_3655.anInt3928 * 346337605) == 1360159111 * this.aClass363_3655.anInt3923) && ((-324341841 * this.aClass363_3655.anInt3924) == -1214543501 * this.aClass363_3655.anInt3921) && ((26754367 * this.aClass363_3655.anInt3927) == (this.aClass363_3655.anInt3924 * -324341841)))
				this.aBoolean3650 = true;
			else if (this.aBoolean3650) {
				this.aBoolean3650 = false;
				this.aClass363_3661.anInt3930 = (this.aClass363_3655.anInt3930 * 1);
				this.aClass363_3661.anInt3920 = (this.aClass363_3655.anInt3920 * 1);
				this.aClass363_3661.anInt3921 = 1 * (this.aClass363_3655.anInt3921);
				this.aClass363_3661.anInt3922 = 1 * (this.aClass363_3655.anInt3922);
				this.aClass363_3661.anInt3923 = 1 * (this.aClass363_3655.anInt3923);
				this.aClass363_3661.anInt3924 = 1 * (this.aClass363_3655.anInt3924);
				this.aClass363_3661.anInt3925 = 1 * (this.aClass363_3655.anInt3925);
				this.aClass363_3661.anInt3928 = (this.aClass363_3655.anInt3928 * 1);
				this.aClass363_3661.anInt3927 = 1 * (this.aClass363_3655.anInt3927);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("og.a(").append(')').toString());
		}
	}

	void method4147(GraphicsToolkit class_ra, long l, int i, boolean bool, byte i_0_) {
		try {
			if (this.aBoolean3664)
				bool = false;
			else if (1197525581 * Class344.anInt3675 < this.aClass182_3656.anInt1857 * 1485531559)
				bool = false;
			else if (Class344.anInt3677 * 576374579 > Class65.anIntArray663[Class344.anInt3675 * 1197525581])
				bool = false;
			else if (this.aBoolean3650)
				bool = false;
			else if (-1 != (930365163 * this.aClass182_3656.anInt1859)) {
				int i_1_ = (int) (l - (this.aLong3653 * -6585151960928456331L));
				if (!this.aClass182_3656.aBoolean1854 && i_1_ > (this.aClass182_3656.anInt1859 * 930365163))
					bool = false;
				else
					i_1_ %= (this.aClass182_3656.anInt1859 * 930365163);
				if (!this.aClass182_3656.aBoolean1836 && i_1_ < (383297615 * this.aClass182_3656.anInt1855))
					bool = false;
				if (this.aClass182_3656.aBoolean1836 && i_1_ >= (this.aClass182_3656.anInt1855 * 383297615))
					bool = false;
			}
			this.anInt3652 = 0;
			for (Class302_Sub3_Sub1_Sub1 class302_sub3_sub1_sub1 = (Class302_Sub3_Sub1_Sub1) this.aClass442_3648.method5868(); class302_sub3_sub1_sub1 != null; class302_sub3_sub1_sub1 = (Class302_Sub3_Sub1_Sub1) this.aClass442_3648.method5872()) {
				class302_sub3_sub1_sub1.method3728(l, i);
				this.anInt3652 += 57201609;
			}
			if (bool) {
				int i_2_ = ((348899357 * this.aClass363_3655.anInt3925 + ((this.aClass363_3655.anInt3930) * 1408993757 + (-505162977 * (this.aClass363_3655.anInt3922)))) / 3);
				int i_3_ = ((1360159111 * this.aClass363_3655.anInt3923 + (this.aClass363_3655.anInt3920) * 1833016095 + 346337605 * this.aClass363_3655.anInt3928) / 3);
				int i_4_ = (26754367 * this.aClass363_3655.anInt3927 + ((this.aClass363_3655.anInt3921) * -1214543501 + -324341841 * (this.aClass363_3655.anInt3924))) / 3;
				if (i_2_ != (this.aClass363_3655.anInt3926) * 60582813 || i_3_ != 915630045 * (this.aClass363_3655.anInt3929) || (this.aClass363_3655.anInt3919 * -1989166667) != i_4_ || !this.aBoolean3665) {
					this.aClass363_3655.anInt3926 = 1638691509 * i_2_;
					this.aClass363_3655.anInt3929 = i_3_ * 85141621;
					this.aClass363_3655.anInt3919 = -766497635 * i_4_;
					int i_5_ = ((this.aClass363_3655.anInt3922) * -505162977 - 1408993757 * (this.aClass363_3655.anInt3930));
					int i_6_ = (1360159111 * (this.aClass363_3655.anInt3923) - 1833016095 * (this.aClass363_3655.anInt3920));
					int i_7_ = (-324341841 * (this.aClass363_3655.anInt3924) - -1214543501 * (this.aClass363_3655.anInt3921));
					int i_8_ = (348899357 * this.aClass363_3655.anInt3925 - (1408993757 * (this.aClass363_3655.anInt3930)));
					int i_9_ = (346337605 * this.aClass363_3655.anInt3928 - (1833016095 * (this.aClass363_3655.anInt3920)));
					int i_10_ = ((this.aClass363_3655.anInt3927) * 26754367 - (this.aClass363_3655.anInt3921) * -1214543501);
					this.anInt3657 = 1879444343 * (i_6_ * i_10_ - i_9_ * i_7_);
					this.anInt3651 = (i_8_ * i_7_ - i_5_ * i_10_) * -1626545147;
					for (this.anInt3659 = (i_9_ * i_5_ - i_8_ * i_6_) * 2122438495; (265567815 * this.anInt3657 > 32767 || this.anInt3651 * 1780238541 > 32767 || 1067074719 * this.anInt3659 > 32767 || this.anInt3657 * 265567815 < -32767 || 1780238541 * this.anInt3651 < -32767 || (this.anInt3659 * 1067074719 < -32767)); this.anInt3659 = ((this.anInt3659 * 1067074719 >> 1) * 2122438495)) {
						this.anInt3657 = ((265567815 * this.anInt3657 >> 1) * 1879444343);
						this.anInt3651 = (-1626545147 * (1780238541 * this.anInt3651 >> 1));
					}
					int i_11_ = (int) (Math.sqrt((double) ((this.anInt3657 * 265567815 * (this.anInt3657 * 265567815)) + (1780238541 * this.anInt3651 * (this.anInt3651 * 1780238541)) + (this.anInt3659 * 1067074719 * (1067074719 * (this.anInt3659))))));
					if (i_11_ <= 0)
						i_11_ = 1;
					this.anInt3657 = (256852409 * this.anInt3657 / i_11_ * 1879444343);
					this.anInt3651 = (-1169541325 * this.anInt3651 / i_11_ * -1626545147);
					this.anInt3659 = 2122438495 * (this.anInt3659 * -491439263 / i_11_);
					if (this.aClass182_3656.aShort1853 > 0 || this.aClass182_3656.aShort1875 > 0) {
						int i_12_ = (int) (Math.atan2((double) (1067074719 * (this.anInt3659)), (double) (265567815 * (this.anInt3657))) * 2607.5945876176133);
						int i_13_ = (int) ((Math.atan2((double) (1780238541 * (this.anInt3651)), (Math.sqrt((double) ((this.anInt3657 * 265567815 * (265567815 * (this.anInt3657))) + (1067074719 * (this.anInt3659) * ((this.anInt3659) * 1067074719))))))) * 2607.5945876176133);
						this.anInt3654 = (-1142397795 * (this.aClass182_3656.aShort1853 - (this.aClass182_3656.aShort1820)));
						this.anInt3660 = (this.aClass182_3656.aShort1820 + i_12_ - (1042891189 * this.anInt3654 >> 1)) * 1909232123;
						this.anInt3663 = ((this.aClass182_3656.aShort1875 - this.aClass182_3656.aShort1822) * 1340947973);
						this.anInt3647 = (518391627 * (this.aClass182_3656.aShort1822 + i_13_ - (-1109795123 * this.anInt3663 >> 1)));
					}
					this.aBoolean3665 = true;
				}
				this.anInt3658 += ((int) ((double) i * ((double) (267143523 * (this.aClass182_3656.anInt1843)) + (Math.random() * (double) ((1479250687 * (this.aClass182_3656.anInt1844)) - ((this.aClass182_3656.anInt1843) * 267143523))))) * -97132715);
				if (this.anInt3658 * 1938761213 > 63) {
					int i_14_ = this.anInt3658 * 1938761213 >> 6;
					this.anInt3658 = -97132715 * (this.anInt3658 * 1938761213 & 0x3f);
					int i_15_ = (i << 8) / i_14_;
					int i_16_ = 0;
					int i_17_ = 0;
					while (i_17_ < i_14_) {
						int i_18_;
						int i_19_;
						int i_20_;
						if (this.aClass182_3656.aShort1853 > 0 || (this.aClass182_3656.aShort1875 > 0)) {
							int i_21_ = (this.anInt3660 * 123982131 + (int) ((double) ((this.anInt3654) * 1042891189) * Math.random()));
							i_21_ &= 0x3fff;
							int i_22_ = CircleAngleTable.SINE[i_21_];
							int i_23_ = CircleAngleTable.COSINE[i_21_];
							int i_24_ = (1100925539 * this.anInt3647 + (int) ((double) ((this.anInt3663) * -1109795123) * Math.random()));
							i_24_ &= 0x1fff;
							int i_25_ = CircleAngleTable.SINE[i_24_];
							int i_26_ = CircleAngleTable.COSINE[i_24_];
							int i_27_ = 13;
							i_18_ = i_23_ * i_25_ >> i_27_;
							i_19_ = (i_26_ << 1) * -1;
							i_20_ = i_25_ * i_22_ >> i_27_;
						} else {
							i_18_ = 265567815 * this.anInt3657;
							i_19_ = this.anInt3651 * 1780238541;
							i_20_ = 1067074719 * this.anInt3659;
						}
						float f = (float) Math.random();
						float f_28_ = (float) Math.random();
						if (f_28_ + f > 1.0F) {
							f = 1.0F - f;
							f_28_ = 1.0F - f_28_;
						}
						float f_29_ = 1.0F - (f_28_ + f);
						int i_30_ = (int) ((float) ((this.aClass363_3655.anInt3925) * 348899357) * f_29_ + ((float) (1408993757 * (this.aClass363_3655.anInt3930)) * f + (float) ((this.aClass363_3655.anInt3922) * -505162977) * f_28_));
						int i_31_ = (int) (f * (float) (this.aClass363_3655.anInt3920 * 1833016095) + f_28_ * (float) (1360159111 * (this.aClass363_3655.anInt3923)) + (float) ((this.aClass363_3655.anInt3928) * 346337605) * f_29_);
						int i_32_ = (int) ((float) ((this.aClass363_3655.anInt3927) * 26754367) * f_29_ + (f * (float) ((this.aClass363_3655.anInt3921) * -1214543501) + (float) ((this.aClass363_3655.anInt3924) * -324341841) * f_28_));
						int i_33_ = (373784419 * (this.aClass182_3656.anInt1824) + (int) (Math.random() * (double) ((-439251269 * (this.aClass182_3656.anInt1858)) - ((this.aClass182_3656.anInt1824) * 373784419))));
						int i_34_ = ((this.aClass182_3656.anInt1841 * -91166595) + (int) (Math.random() * (double) ((1940196053 * (this.aClass182_3656.anInt1842)) - ((this.aClass182_3656.anInt1841) * -91166595))));
						int i_35_ = ((-992661685 * this.aClass182_3656.anInt1869) + (int) (Math.random() * (double) ((this.aClass182_3656.anInt1831) * -769306129 - ((this.aClass182_3656.anInt1869) * -992661685))));
						int i_36_;
						if (this.aClass182_3656.aBoolean1860) {
							double d = Math.random();
							i_36_ = ((int) ((double) (-447935375 * (this.aClass182_3656.anInt1867)) * d + (double) ((this.aClass182_3656.anInt1865) * 1443995973)) << 16 | (int) ((double) ((this.aClass182_3656.anInt1870) * -1154628453) * d + (double) (-1237529867 * (this.aClass182_3656.anInt1868))) << 8 | (int) ((double) (-1297143849 * (this.aClass182_3656.anInt1871)) + d * (double) ((this.aClass182_3656.anInt1856) * -564637277)) | ((int) ((double) ((this.aClass182_3656.anInt1826) * 629527125) + (Math.random() * (double) (1235129497 * (this.aClass182_3656.anInt1876)))) << 24));
						} else
							i_36_ = ((int) ((double) (1443995973 * (this.aClass182_3656.anInt1865)) + (Math.random() * (double) ((this.aClass182_3656.anInt1867) * -447935375))) << 16 | ((int) ((double) (-1237529867 * (this.aClass182_3656.anInt1868)) + (Math.random() * (double) ((this.aClass182_3656.anInt1870) * -1154628453))) << 8) | (int) ((double) ((this.aClass182_3656.anInt1871) * -1297143849) + (Math.random() * (double) ((this.aClass182_3656.anInt1856) * -564637277))) | ((int) ((double) (629527125 * (this.aClass182_3656.anInt1826)) + (Math.random() * (double) ((this.aClass182_3656.anInt1876) * 1235129497))) << 24));
						int i_37_ = (-1138170857 * this.aClass182_3656.anInt1840);
						if (!class_ra.method5159() && !this.aClass182_3656.aBoolean1818)
							i_37_ = -1;
						Class302_Sub3_Sub1_Sub1 class302_sub3_sub1_sub1;
						if (-1331235643 * Class344.anInt3678 != 146335501 * Class344.anInt3686) {
							class302_sub3_sub1_sub1 = (Class344.aClass302_Sub3_Sub1_Sub1Array3676[Class344.anInt3678 * -1331235643]);
							Class344.anInt3678 = (-398693875 * (-1331235643 * Class344.anInt3678 + 1 & 0x3ff));
							class302_sub3_sub1_sub1.method3724(this, i_30_, i_31_, i_32_, i_18_, i_19_, i_20_, i_33_, i_34_, i_36_, i_35_, i_37_, this.aClass182_3656.aBoolean1877, (this.aClass182_3656.aBoolean1874));
						} else
							class302_sub3_sub1_sub1 = (new Class302_Sub3_Sub1_Sub1(this, i_30_, i_31_, i_32_, i_18_, i_19_, i_20_, i_33_, i_34_, i_36_, i_35_, i_37_, (this.aClass182_3656.aBoolean1877), (this.aClass182_3656.aBoolean1874)));
						if (i_16_ > 256)
							class302_sub3_sub1_sub1.method3728(l, i_16_ >> 8);
						this.anInt3652 += 57201609;
						i_17_++;
						i_16_ += i_15_;
					}
				}
			}
			if (!this.aClass363_3655.method4313((this.aClass363_3661), (byte) -35)) {
				Class363 class363 = this.aClass363_3661;
				this.aClass363_3661 = this.aClass363_3655;
				this.aClass363_3655 = class363;
				this.aClass363_3655.anInt3930 = 1670788257 * this.aEmissiveTriangle_3662.anInt777;
				this.aClass363_3655.anInt3920 = -477225237 * this.aEmissiveTriangle_3662.anInt783;
				this.aClass363_3655.anInt3921 = -1752367969 * this.aEmissiveTriangle_3662.anInt779;
				this.aClass363_3655.anInt3922 = this.aEmissiveTriangle_3662.anInt772 * 1328143831;
				this.aClass363_3655.anInt3923 = -24388153 * this.aEmissiveTriangle_3662.anInt781;
				this.aClass363_3655.anInt3924 = -413789161 * this.aEmissiveTriangle_3662.anInt782;
				this.aClass363_3655.anInt3925 = 1699665565 * this.aEmissiveTriangle_3662.anInt771;
				this.aClass363_3655.anInt3928 = this.aEmissiveTriangle_3662.anInt784 * -651869151;
				this.aClass363_3655.anInt3927 = -1739241385 * this.aEmissiveTriangle_3662.anInt785;
				this.aClass363_3655.anInt3926 = 1 * (this.aClass363_3661.anInt3926);
				this.aClass363_3655.anInt3929 = (this.aClass363_3661.anInt3929 * 1);
				this.aClass363_3655.anInt3919 = 1 * (this.aClass363_3661.anInt3919);
			}
			Class344.anInt3682 += this.anInt3652 * 634474159;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("og.f(").append(')').toString());
		}
	}

	void method4148(Region class331, GraphicsToolkit class_ra, long l) {
		try {
			for (Class302_Sub3_Sub1_Sub1 class302_sub3_sub1_sub1 = (Class302_Sub3_Sub1_Sub1) this.aClass442_3648.method5868(); null != class302_sub3_sub1_sub1; class302_sub3_sub1_sub1 = (Class302_Sub3_Sub1_Sub1) this.aClass442_3648.method5872())
				class302_sub3_sub1_sub1.method3727(class331, class_ra, l);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("og.b(").append(')').toString());
		}
	}

	Class342(GraphicsToolkit class_ra, EmissiveTriangle emissiveTriangle, ParticleSystem particleSystem, long l) {
		this.aClass363_3655 = new Class363();
		this.aClass363_3661 = new Class363();
		this.aBoolean3650 = false;
		this.aBoolean3665 = false;
		this.aEmissiveTriangle_3662 = emissiveTriangle;
		this.aParticleSystem_3649 = particleSystem;
		this.aLong3653 = -3564077160880531747L * l;
		this.aClass182_3656 = this.aEmissiveTriangle_3662.method953();
		if (!class_ra.method5159() && -1 != this.aClass182_3656.anInt1873 * -1133251589)
			this.aClass182_3656 = Class151.method1643(-1133251589 * (this.aClass182_3656.anInt1873));
		this.aClass442_3648 = new Class442();
		this.anInt3658 = (int) ((double) (this.anInt3658 * 1938761213) + Math.random() * 64.0) * -97132715;
		method4146((byte) 1);
		this.aClass363_3661.anInt3930 = this.aClass363_3655.anInt3930 * 1;
		this.aClass363_3661.anInt3920 = 1 * this.aClass363_3655.anInt3920;
		this.aClass363_3661.anInt3921 = this.aClass363_3655.anInt3921 * 1;
		this.aClass363_3661.anInt3922 = this.aClass363_3655.anInt3922 * 1;
		this.aClass363_3661.anInt3923 = this.aClass363_3655.anInt3923 * 1;
		this.aClass363_3661.anInt3924 = 1 * this.aClass363_3655.anInt3924;
		this.aClass363_3661.anInt3925 = 1 * this.aClass363_3655.anInt3925;
		this.aClass363_3661.anInt3928 = this.aClass363_3655.anInt3928 * 1;
		this.aClass363_3661.anInt3927 = this.aClass363_3655.anInt3927 * 1;
	}

	static final void method4149(ScriptRuntime class403, byte i) {
		try {
			int i_38_ = (class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]);
			IComponentDefinition class105 = IComponentDefinition.getInterfaceComponent(i_38_);
			IComponentDefinitionCollection IComponentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[i_38_ >> 16];
			ToMoveIComponentScripts.SET_DRAG_DEADZONE(class105, class403);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("og.ji(").append(')').toString());
		}
	}

	static final void method4150(ScriptRuntime runtime) {
		try {
			int i_39_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
			IComponentDefinition class105 = IComponentDefinition.getInterfaceComponent(i_39_);
			runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = class105.parentID;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("og.ra(").append(')').toString());
		}
	}

	static final void method4151(ScriptRuntime class403, int i) {
		try {
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = class403.aClass162_5252.aBoolean1656 ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("og.xn(").append(')').toString());
		}
	}

	public static final void method4152(String string, byte i) {
		try {
			if (string != null) {
				String string_40_ = Class173.method1824(string);
				if (null != string_40_) {
					for (int i_41_ = 0; i_41_ < GameClient.anInt8952 * -548972447; i_41_++) {
						String string_42_ = GameClient.aStringArray8859[i_41_];
						String string_43_ = Class173.method1824(string_42_);
						if (StringUtils.method4910(string, string_40_, string_42_, string_43_)) {
							GameClient.anInt8952 -= -765637727;
							for (int i_44_ = i_41_; i_44_ < -548972447 * GameClient.anInt8952; i_44_++) {
								GameClient.aStringArray8859[i_44_] = GameClient.aStringArray8859[i_44_ + 1];
								GameClient.aStringArray8954[i_44_] = GameClient.aStringArray8954[i_44_ + 1];
								GameClient.aStringArray8955[i_44_] = GameClient.aStringArray8955[i_44_ + 1];
								GameClient.aStringArray8773[i_44_] = GameClient.aStringArray8773[1 + i_44_];
								GameClient.aBooleanArray8957[i_44_] = GameClient.aBooleanArray8957[i_44_ + 1];
							}
							GameClient.anInt8883 = 754377557 * GameClient.anInt8933;
							ConnectionType connectionType = ConnectionType.getConnectionType();
							OutgoingPacketBuffer outgoingPacketBuffer = Class18.method359(OutgoingPacket.REMOVE_IGNORE_PACKET, connectionType.encryptor);
							outgoingPacketBuffer.payload.writeByte(StaticMethods.method693(string));
							outgoingPacketBuffer.payload.writeString(string);
							connectionType.sendFrame(outgoingPacketBuffer);
							break;
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("og.mx(").append(')').toString());
		}
	}

	static final void method4153(ScriptRuntime runtime) {
		try {
			runtime.objectArgs -= 1938723502;
			String string = (String) (runtime.objectStack[runtime.objectArgs * -203050393]);
			String string_45_ = ((String) (runtime.objectStack[1 + -203050393 * runtime.objectArgs]));
			if (0 != 1806357379 * GameClient.localPrivilege || ((!GameClient.aBoolean8811 || GameClient.aBoolean8812) && !GameClient.aBoolean8802)) {
				ConnectionType connectionType = ConnectionType.getConnectionType();
				OutgoingPacketBuffer outgoingPacketBuffer = Class18.method359(OutgoingPacket.SEND_FRIEND_MESSAGE_PACKET, connectionType.encryptor);
				outgoingPacketBuffer.payload.writeShort(0);
				int i_46_ = (outgoingPacketBuffer.payload.offset * 385051775);
				outgoingPacketBuffer.payload.writeString(string);
				Class23.method379(outgoingPacketBuffer.payload, string_45_);
				outgoingPacketBuffer.payload.writeSizeShort((outgoingPacketBuffer.payload.offset * 385051775) - i_46_);
				connectionType.sendFrame(outgoingPacketBuffer);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("og.abi(").append(')').toString());
		}
	}

	static final void method4154(ScriptRuntime class403, int i) {
		try {
			int i_47_ = (class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]);
			IComponentDefinition class105 = IComponentDefinition.getInterfaceComponent(i_47_);
			Class135.method1491(class105, class403, 2145679752);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("og.qd(").append(')').toString());
		}
	}
}
