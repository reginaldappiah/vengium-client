package com.jagex;/* Class264_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

public class Class264_Sub5 extends FontToolkit {
	Interface9_Impl2 anInterface9_Impl2_7138;
	NativeToolkit aClass_ra_Sub3_7139;
	Interface7_Impl1 anInterface7_Impl1_7140;

    void UA(char c, int i, int i_3_, int i_4_, boolean bool) {
		this.aClass_ra_Sub3_7139.method5337();
		this.aClass_ra_Sub3_7139.method5374(1);
		Class138 class138 = (this.aClass_ra_Sub3_7139.aClass138_8257);
		class138.anInterface9_Impl2_1537 = this.anInterface9_Impl2_7138;
		class138.method1526(3, i_4_);
		float f = (float) this.aClass_ra_Sub3_7139.getFrameContext().getWidth();
		float f_5_ = (float) this.aClass_ra_Sub3_7139.getFrameContext().getHeight();
		class138.aMatrix4f_1540.method2147(2.0F / f, 2.0F / f_5_, 1.0F, 1.0F);
		class138.aMatrix4f_1540.aFloatArray2594[12] = (((float) i + this.aClass_ra_Sub3_7139.method5315()) * 2.0F / f) - 1.0F;
		class138.aMatrix4f_1540.aFloatArray2594[13] = (((float) i_3_ + this.aClass_ra_Sub3_7139.method5315()) * 2.0F / f_5_) - 1.0F;
		class138.aMatrix4f_1540.aFloatArray2594[14] = -1.0F;
		class138.aMatrix4f_1541.method2172();
		class138.anInterface7_Impl1_1538 = this.anInterface7_Impl1_7140;
		class138.anInt1543 = c * '\004';
		class138.aClass153_1544 = (this.aClass_ra_Sub3_7139.aClass153_8359);
		class138.method1527();
	}

    void method2486(char c, int i, int i_13_, int i_14_, boolean bool, ToolkitLoader toolkitLoader, int i_15_, int i_16_) {
		/* empty */
	}

	Class264_Sub5(NativeToolkit class_ra_sub3, RSFontMetrics class505, Sprite[] class89s, boolean bool) {
		super(class_ra_sub3, class505);
		this.aClass_ra_Sub3_7139 = class_ra_sub3;
		int i = 0;
		for (int i_17_ = 0; i_17_ < 256; i_17_++) {
			Sprite class89 = class89s[i_17_];
			if (class89.height > i)
				i = class89.height;
			if (class89.width > i)
				i = class89.width;
		}
		int i_18_ = i * 16;
		if (bool) {
			byte[] is = new byte[i_18_ * i_18_];
			for (int i_19_ = 0; i_19_ < 256; i_19_++) {
				Sprite class89 = class89s[i_19_];
				int i_20_ = class89.height;
				int i_21_ = class89.width;
				int i_22_ = i_19_ % 16 * i;
				int i_23_ = i_19_ / 16 * i;
				int i_24_ = i_23_ * i_18_ + i_22_;
				int i_25_ = 0;
				if (class89.alpha == null) {
					byte[] is_26_ = class89.raster;
					for (int i_27_ = 0; i_27_ < i_20_; i_27_++) {
						for (int i_28_ = 0; i_28_ < i_21_; i_28_++)
							is[i_24_++] = (byte) (is_26_[i_25_++] == 0 ? 0 : -1);
						i_24_ += i_18_ - i_21_;
					}
				} else {
					byte[] is_29_ = class89.alpha;
					for (int i_30_ = 0; i_30_ < i_20_; i_30_++) {
						for (int i_31_ = 0; i_31_ < i_21_; i_31_++)
							is[i_24_++] = is_29_[i_25_++];
						i_24_ += i_18_ - i_21_;
					}
				}
			}
			if (!class_ra_sub3.method5348(Class55.aClass55_567, Class77.aClass77_717)) {
				int[] is_32_ = new int[is.length];
				for (int i_33_ = 0; i_33_ < is.length; i_33_++)
					is_32_[i_33_] = is[i_33_] << 24;
				this.anInterface9_Impl2_7138 = class_ra_sub3.method5350(i_18_, i_18_, false, is_32_);
			} else
				this.anInterface9_Impl2_7138 = class_ra_sub3.method5351(Class55.aClass55_567, i_18_, i_18_, false, is);
		} else {
			int[] is = new int[i_18_ * i_18_];
			for (int i_34_ = 0; i_34_ < 256; i_34_++) {
				Sprite class89 = class89s[i_34_];
				int[] is_35_ = class89.palette;
				byte[] is_36_ = class89.alpha;
				byte[] is_37_ = class89.raster;
				int i_38_ = class89.height;
				int i_39_ = class89.width;
				int i_40_ = i_34_ % 16 * i;
				int i_41_ = i_34_ / 16 * i;
				int i_42_ = i_41_ * i_18_ + i_40_;
				int i_43_ = 0;
				if (is_36_ != null) {
					for (int i_44_ = 0; i_44_ < i_38_; i_44_++) {
						for (int i_45_ = 0; i_45_ < i_39_; i_45_++) {
							is[i_42_++] = (is_36_[i_43_] << 24 | is_35_[is_37_[i_43_] & 0xff]);
							i_43_++;
						}
						i_42_ += i_18_ - i_39_;
					}
				} else {
					for (int i_46_ = 0; i_46_ < i_38_; i_46_++) {
						for (int i_47_ = 0; i_47_ < i_39_; i_47_++) {
							int i_48_;
							if ((i_48_ = is_37_[i_43_++]) != 0)
								is[i_42_++] = ~0xffffff | is_35_[i_48_ & 0xff];
							else
								i_42_++;
						}
						i_42_ += i_18_ - i_39_;
					}
				}
			}
			this.anInterface9_Impl2_7138 = class_ra_sub3.method5350(i_18_, i_18_, false, is);
		}
		this.anInterface9_Impl2_7138.method122(Class179.aClass179_1811);
		this.anInterface7_Impl1_7140 = class_ra_sub3.method5382(false);
		this.anInterface7_Impl1_7140.method72(20480, 20);
		ByteBuffer bytebuffer = this.aClass_ra_Sub3_7139.aByteBuffer8216;
		bytebuffer.clear();
		float f = (this.anInterface9_Impl2_7138.method77((float) i_18_) / (float) i_18_);
		float f_49_ = (this.anInterface9_Impl2_7138.method78((float) i_18_) / (float) i_18_);
		for (int i_50_ = 0; i_50_ < 256; i_50_++) {
			Sprite class89 = class89s[i_50_];
			int i_51_ = class89.height;
			int i_52_ = class89.width;
			int i_53_ = class89.offsetY;
			int i_54_ = class89.offsetX;
			float f_55_ = (float) (i_50_ % 16 * i);
			float f_56_ = (float) (i_50_ / 16 * i);
			float f_57_ = f_55_ * f;
			float f_58_ = f_56_ * f_49_;
			float f_59_ = (f_55_ + (float) i_52_) * f;
			float f_60_ = (f_56_ + (float) i_51_) * f_49_;
			bytebuffer.putFloat((float) i_54_);
			bytebuffer.putFloat((float) i_53_);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(f_57_);
			bytebuffer.putFloat(f_58_);
			bytebuffer.putFloat((float) i_54_);
			bytebuffer.putFloat((float) (i_53_ + i_51_));
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(f_57_);
			bytebuffer.putFloat(f_60_);
			bytebuffer.putFloat((float) (i_54_ + i_52_));
			bytebuffer.putFloat((float) (i_53_ + i_51_));
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(f_59_);
			bytebuffer.putFloat(f_60_);
			bytebuffer.putFloat((float) (i_54_ + i_52_));
			bytebuffer.putFloat((float) i_53_);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(f_59_);
			bytebuffer.putFloat(f_58_);
		}
		this.anInterface7_Impl1_7140.method63(0, bytebuffer.position(), this.aClass_ra_Sub3_7139.aLong8217);
		class_ra_sub3.method5304(12);
	}
}
