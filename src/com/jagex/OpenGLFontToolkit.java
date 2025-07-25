package com.jagex;/* OpenGLFontToolkit - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class OpenGLFontToolkit extends FontToolkit {
	Class30_Sub2_Sub1 aClass30_Sub2_Sub1_7128;
	OpenGLGraphicsToolkit aClass_ra_Sub2_7129;
	Class28 aClass28_7130;
	boolean aBoolean7131;

    void method2486(char c, int i, int i_7_, int i_8_, boolean bool, ToolkitLoader toolkitLoader, int i_9_, int i_10_) {
		OpenGLToolkitLoader class_ta_sub1 = (OpenGLToolkitLoader) toolkitLoader;
		Class30_Sub2_Sub1 class30_sub2_sub1 = class_ta_sub1.aClass30_Sub2_Sub1_8441;
		this.aClass_ra_Sub2_7129.method5270();
		this.aClass_ra_Sub2_7129.method5256(this.aClass30_Sub2_Sub1_7128);
		if (this.aBoolean7131 || bool) {
			this.aClass_ra_Sub2_7129.method5258(7681, 8448);
			this.aClass_ra_Sub2_7129.method5259(0, 34168, 768);
		} else
			this.aClass_ra_Sub2_7129.method5258(7681, 7681);
		this.aClass_ra_Sub2_7129.method5255(1);
		this.aClass_ra_Sub2_7129.method5256(class30_sub2_sub1);
		this.aClass_ra_Sub2_7129.method5258(7681, 8448);
		this.aClass_ra_Sub2_7129.method5259(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		float f = (class30_sub2_sub1.aFloat9049 / (float) class30_sub2_sub1.width);
		float f_11_ = (class30_sub2_sub1.aFloat9051 / (float) class30_sub2_sub1.height);
		OpenGL.glTexGenfv(8192, 9474, new float[] { f, 0.0F, 0.0F, (float) -i_9_ * f }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, f_11_, 0.0F, (float) -i_10_ * f_11_ }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (i_8_ >> 16), (byte) (i_8_ >> 8), (byte) i_8_, (byte) (i_8_ >> 24));
		OpenGL.glTranslatef((float) i, (float) i_7_, 0.0F);
		this.aClass28_7130.method404(c);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		this.aClass_ra_Sub2_7129.method5259(0, 5890, 768);
		this.aClass_ra_Sub2_7129.method5258(8448, 8448);
		this.aClass_ra_Sub2_7129.method5256(null);
		this.aClass_ra_Sub2_7129.method5255(0);
		if (this.aBoolean7131 || bool)
			this.aClass_ra_Sub2_7129.method5259(0, 5890, 768);
	}

	void UA(char c, int i, int i_12_, int i_13_, boolean bool) {
		this.aClass_ra_Sub2_7129.method5270();
		this.aClass_ra_Sub2_7129.method5256(this.aClass30_Sub2_Sub1_7128);
		if (this.aBoolean7131 || bool) {
			this.aClass_ra_Sub2_7129.method5258(7681, 8448);
			this.aClass_ra_Sub2_7129.method5259(0, 34168, 768);
		} else
			this.aClass_ra_Sub2_7129.method5258(7681, 7681);
		OpenGL.glColor4ub((byte) (i_13_ >> 16), (byte) (i_13_ >> 8), (byte) i_13_, (byte) (i_13_ >> 24));
		OpenGL.glTranslatef((float) i, (float) i_12_, 0.0F);
		this.aClass28_7130.method404(c);
		OpenGL.glLoadIdentity();
		if (this.aBoolean7131 || bool)
			this.aClass_ra_Sub2_7129.method5259(0, 5890, 768);
	}

    OpenGLFontToolkit(OpenGLGraphicsToolkit class_ra_sub2, RSFontMetrics class505, Sprite[] class89s, boolean loaded) {
		super(class_ra_sub2, class505);
		this.aClass_ra_Sub2_7129 = class_ra_sub2;
		int i = 0;
		for (int i_16_ = 0; i_16_ < 256; i_16_++) {
			Sprite class89 = class89s[i_16_];
			if (class89.height > i)
				i = class89.height;
			if (class89.width > i)
				i = class89.width;
		}
		int i_17_ = i * 16;
		if (loaded) {
			byte[] is = new byte[i_17_ * i_17_];
			for (int i_18_ = 0; i_18_ < 256; i_18_++) {
				Sprite class89 = class89s[i_18_];
				int i_19_ = class89.height;
				int i_20_ = class89.width;
				int i_21_ = i_18_ % 16 * i;
				int i_22_ = i_18_ / 16 * i;
				int i_23_ = i_22_ * i_17_ + i_21_;
				int i_24_ = 0;
				if (class89.alpha == null) {
					byte[] is_25_ = class89.raster;
					for (int i_26_ = 0; i_26_ < i_19_; i_26_++) {
						for (int i_27_ = 0; i_27_ < i_20_; i_27_++)
							is[i_23_++] = (byte) (is_25_[i_24_++] == 0 ? 0 : -1);
						i_23_ += i_17_ - i_20_;
					}
				} else {
					byte[] is_28_ = class89.alpha;
					for (int i_29_ = 0; i_29_ < i_19_; i_29_++) {
						for (int i_30_ = 0; i_30_ < i_20_; i_30_++)
							is[i_23_++] = is_28_[i_24_++];
						i_23_ += i_17_ - i_20_;
					}
				}
			}
			this.aClass30_Sub2_Sub1_7128 = Class30_Sub2_Sub1.method428(class_ra_sub2, Class55.aClass55_567, Class77.aClass77_717, i_17_, i_17_, false, is, Class55.aClass55_567);
			this.aBoolean7131 = true;
		} else {
			int[] is = new int[i_17_ * i_17_];
			for (int i_31_ = 0; i_31_ < 256; i_31_++) {
				Sprite class89 = class89s[i_31_];
				int[] is_32_ = class89.palette;
				byte[] is_33_ = class89.alpha;
				byte[] is_34_ = class89.raster;
				int i_35_ = class89.height;
				int i_36_ = class89.width;
				int i_37_ = i_31_ % 16 * i;
				int i_38_ = i_31_ / 16 * i;
				int i_39_ = i_38_ * i_17_ + i_37_;
				int i_40_ = 0;
				if (is_33_ != null) {
					for (int i_41_ = 0; i_41_ < i_35_; i_41_++) {
						for (int i_42_ = 0; i_42_ < i_36_; i_42_++) {
							is[i_39_++] = (is_33_[i_40_] << 24 | is_32_[is_34_[i_40_] & 0xff]);
							i_40_++;
						}
						i_39_ += i_17_ - i_36_;
					}
				} else {
					for (int i_43_ = 0; i_43_ < i_35_; i_43_++) {
						for (int i_44_ = 0; i_44_ < i_36_; i_44_++) {
							int i_45_;
							if ((i_45_ = is_34_[i_40_++]) != 0)
								is[i_39_++] = ~0xffffff | is_32_[i_45_ & 0xff];
							else
								i_39_++;
						}
						i_39_ += i_17_ - i_36_;
					}
				}
			}
			this.aClass30_Sub2_Sub1_7128 = Class30_Sub2_Sub1.method425(class_ra_sub2, i_17_, i_17_, false, is, 0, 0);
			this.aBoolean7131 = false;
		}
		this.aClass30_Sub2_Sub1_7128.method410(false);
		this.aClass28_7130 = new Class28(class_ra_sub2, 256);
		float f = (this.aClass30_Sub2_Sub1_7128.aFloat9049 / (float) (this.aClass30_Sub2_Sub1_7128.width));
		float f_46_ = (this.aClass30_Sub2_Sub1_7128.aFloat9051 / (float) (this.aClass30_Sub2_Sub1_7128.height));
		for (int i_47_ = 0; i_47_ < 256; i_47_++) {
			Sprite class89 = class89s[i_47_];
			int i_48_ = class89.height;
			int i_49_ = class89.width;
			int i_50_ = class89.offsetY;
			int i_51_ = class89.offsetX;
			float f_52_ = (float) (i_47_ % 16 * i);
			float f_53_ = (float) (i_47_ / 16 * i);
			float f_54_ = f_52_ * f;
			float f_55_ = f_53_ * f_46_;
			float f_56_ = (f_52_ + (float) i_49_) * f;
			float f_57_ = (f_53_ + (float) i_48_) * f_46_;
			this.aClass28_7130.method405(i_47_);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(f_54_, (this.aClass30_Sub2_Sub1_7128.aFloat9051 - f_55_));
			OpenGL.glVertex2i(i_51_, i_50_);
			OpenGL.glTexCoord2f(f_54_, (this.aClass30_Sub2_Sub1_7128.aFloat9051 - f_57_));
			OpenGL.glVertex2i(i_51_, i_50_ + i_48_);
			OpenGL.glTexCoord2f(f_56_, (this.aClass30_Sub2_Sub1_7128.aFloat9051 - f_57_));
			OpenGL.glVertex2i(i_51_ + i_49_, i_50_ + i_48_);
			OpenGL.glTexCoord2f(f_56_, (this.aClass30_Sub2_Sub1_7128.aFloat9051 - f_55_));
			OpenGL.glVertex2i(i_51_ + i_49_, i_50_);
			OpenGL.glEnd();
			this.aClass28_7130.method403();
		}
	}
}
