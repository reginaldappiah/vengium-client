package com.jagex;/* Class57_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class57_Sub3 extends SpriteToolkit {
	int anInt9037;
	Class30_Sub2_Sub1 aClass30_Sub2_Sub1_9038;
	boolean aBoolean9039;
	int anInt9040 = 0;
	OpenGLGraphicsToolkit openGLGraphicsToolkit;
	int anInt9042;
	Class30_Sub2_Sub1 aClass30_Sub2_Sub1_9043;
	int anInt9044;
	int anInt9045;

    Class57_Sub3(OpenGLGraphicsToolkit class_ra_sub2, int i, int i_25_, int i_26_, int i_27_) {
		this.aBoolean9039 = false;
		this.anInt9042 = 0;
		this.anInt9037 = 0;
		this.anInt9044 = 0;
		this.anInt9045 = 0;
		this.openGLGraphicsToolkit = class_ra_sub2;
		this.aClass30_Sub2_Sub1_9043 = Class30_Sub2_Sub1.method427(class_ra_sub2, i, i_25_, i_26_, i_27_);
	}

	Class57_Sub3(OpenGLGraphicsToolkit openGLGraphicsToolkit, int width, int height, int[] pixels, int mode, int i_30_) {
		this.aBoolean9039 = false;
		this.anInt9042 = 0;
		this.anInt9037 = 0;
		this.anInt9044 = 0;
		this.anInt9045 = 0;
		this.openGLGraphicsToolkit = openGLGraphicsToolkit;
		this.aClass30_Sub2_Sub1_9043 = Class30_Sub2_Sub1.method425(openGLGraphicsToolkit, width, height, false, pixels, i_30_, mode);
	}

	public void method621(int i, int i_31_, int i_32_, int i_33_) {
		this.anInt9037 = i;
		this.anInt9042 = i_31_;
		this.anInt9045 = i_32_;
		this.anInt9044 = i_33_;
		this.aBoolean9039 = (this.anInt9037 != 0 || this.anInt9042 != 0 || this.anInt9045 != 0 || this.anInt9044 != 0);
	}

	public void method622(int[] is) {
		is[0] = this.anInt9037;
		is[1] = this.anInt9042;
		is[2] = this.anInt9045;
		is[3] = this.anInt9044;
	}

	public int getWidth() {
		return (this.aClass30_Sub2_Sub1_9043.width);
	}

	public int getPaddedHeight() {
		return (this.aClass30_Sub2_Sub1_9043.height + this.anInt9042 + this.anInt9044);
	}

	public int getHeight() {
		return (this.aClass30_Sub2_Sub1_9043.height);
	}

    public void method675(int i, int i_58_, int i_59_, int i_60_, int i_61_, int i_62_) {
		if (this.openGLGraphicsToolkit.aBoolean8166) {
			int[] is = this.openGLGraphicsToolkit.aq(i_61_, i_62_, i_59_, i_60_);
			if (is != null) {
				for (int i_63_ = 0; i_63_ < is.length; i_63_++)
					is[i_63_] |= ~0xffffff;
				method691(i, i_58_, i_59_, i_60_, is, 0, i_59_);
			}
		} else
			this.aClass30_Sub2_Sub1_9043.method419(i, i_58_, i_59_, i_60_, i_61_, i_62_);
	}

	public void method632(int i, int i_64_, int i_65_) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass30_Sub2_Sub1_9038 = (Class30_Sub2_Sub1.method427(this.openGLGraphicsToolkit, i, i_64_, this.aClass30_Sub2_Sub1_9043.width, this.aClass30_Sub2_Sub1_9043.height));
		this.anInt9040 = i_65_;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	Class57_Sub3(OpenGLGraphicsToolkit class_ra_sub2, int i, int i_66_, boolean bool) {
		this.aBoolean9039 = false;
		this.anInt9042 = 0;
		this.anInt9037 = 0;
		this.anInt9044 = 0;
		this.anInt9045 = 0;
		this.openGLGraphicsToolkit = class_ra_sub2;
		this.aClass30_Sub2_Sub1_9043 = Class30_Sub2_Sub1.method426(class_ra_sub2, (bool ? Class55.aClass55_557 : Class55.aClass55_560), Class77.aClass77_717, i, i_66_);
	}

	void method689(int i) {
		this.openGLGraphicsToolkit.method5255(1);
		this.openGLGraphicsToolkit.method5256(this.aClass30_Sub2_Sub1_9043);
		this.openGLGraphicsToolkit.method5258(this.openGLGraphicsToolkit.method5288(i), 7681);
		this.openGLGraphicsToolkit.method5259(1, 34167, 768);
		this.openGLGraphicsToolkit.method5286(0, 34168, 770);
		this.openGLGraphicsToolkit.method5255(0);
		this.openGLGraphicsToolkit.method5256(this.aClass30_Sub2_Sub1_9038);
		this.openGLGraphicsToolkit.method5258(34479, 7681);
		this.openGLGraphicsToolkit.method5259(1, 34166, 768);
		if (this.anInt9040 == 0)
			this.openGLGraphicsToolkit.method5260(1.0F, 0.5F, 0.5F, 0.0F);
		else if (this.anInt9040 == 1)
			this.openGLGraphicsToolkit.method5260(0.5F, 1.0F, 0.5F, 0.0F);
		else if (this.anInt9040 == 2)
			this.openGLGraphicsToolkit.method5260(0.5F, 0.5F, 1.0F, 0.0F);
		else if (this.anInt9040 == 3)
			this.openGLGraphicsToolkit.method5260(128.5F, 128.5F, 128.5F, 0.0F);
	}

	void method690() {
		this.openGLGraphicsToolkit.method5255(1);
		this.openGLGraphicsToolkit.method5256(null);
		this.openGLGraphicsToolkit.method5258(8448, 8448);
		this.openGLGraphicsToolkit.method5259(1, 34168, 768);
		this.openGLGraphicsToolkit.method5286(0, 5890, 770);
		this.openGLGraphicsToolkit.method5255(0);
		this.openGLGraphicsToolkit.method5259(1, 34168, 768);
	}

	public void draw(int i, int i_67_, int i_68_, int i_69_, int i_70_) {
		this.aClass30_Sub2_Sub1_9043.method410(false);
		this.openGLGraphicsToolkit.method5251();
		this.openGLGraphicsToolkit.method5266(i_70_);
		OpenGL.glColor4ub((byte) (i_69_ >> 16), (byte) (i_69_ >> 8), (byte) i_69_, (byte) (i_69_ >> 24));
		i += this.anInt9037;
		i_67_ += this.anInt9042;
		if (this.aClass30_Sub2_Sub1_9038 == null) {
			this.openGLGraphicsToolkit.method5256(this.aClass30_Sub2_Sub1_9043);
			this.openGLGraphicsToolkit.method5243(i_68_);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass30_Sub2_Sub1_9043.aFloat9051);
			OpenGL.glVertex2i(i, i_67_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_67_ + this.aClass30_Sub2_Sub1_9043.height);
			OpenGL.glTexCoord2f(this.aClass30_Sub2_Sub1_9043.aFloat9049, 0.0F);
			OpenGL.glVertex2i(i + this.aClass30_Sub2_Sub1_9043.width, i_67_ + this.aClass30_Sub2_Sub1_9043.height);
			OpenGL.glTexCoord2f(this.aClass30_Sub2_Sub1_9043.aFloat9049, this.aClass30_Sub2_Sub1_9043.aFloat9051);
			OpenGL.glVertex2i(i + this.aClass30_Sub2_Sub1_9043.width, i_67_);
			OpenGL.glEnd();
		} else {
			method689(i_68_);
			this.aClass30_Sub2_Sub1_9038.method410(false);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass30_Sub2_Sub1_9043.aFloat9051);
			OpenGL.glTexCoord2f(0.0F, this.aClass30_Sub2_Sub1_9043.aFloat9051);
			OpenGL.glVertex2i(i, i_67_);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_67_ + this.aClass30_Sub2_Sub1_9043.height);
			OpenGL.glMultiTexCoord2f(33985, this.aClass30_Sub2_Sub1_9043.aFloat9049, 0.0F);
			OpenGL.glTexCoord2f(this.aClass30_Sub2_Sub1_9043.aFloat9049, 0.0F);
			OpenGL.glVertex2i(i + this.aClass30_Sub2_Sub1_9043.width, i_67_ + this.aClass30_Sub2_Sub1_9043.height);
			OpenGL.glMultiTexCoord2f(33985, this.aClass30_Sub2_Sub1_9043.aFloat9049, this.aClass30_Sub2_Sub1_9043.aFloat9051);
			OpenGL.glTexCoord2f(this.aClass30_Sub2_Sub1_9043.aFloat9049, this.aClass30_Sub2_Sub1_9043.aFloat9051);
			OpenGL.glVertex2i(i + this.aClass30_Sub2_Sub1_9043.width, i_67_);
			OpenGL.glEnd();
			method690();
		}
	}

	public void method654(int i, int i_71_, ToolkitLoader toolkitLoader, int i_72_, int i_73_) {
		OpenGLToolkitLoader class_ta_sub1 = (OpenGLToolkitLoader) toolkitLoader;
		Class30_Sub2_Sub1 class30_sub2_sub1 = class_ta_sub1.aClass30_Sub2_Sub1_8441;
		this.aClass30_Sub2_Sub1_9043.method410(false);
		this.openGLGraphicsToolkit.method5251();
		this.openGLGraphicsToolkit.method5256(this.aClass30_Sub2_Sub1_9043);
		this.openGLGraphicsToolkit.method5243(1);
		this.openGLGraphicsToolkit.method5255(1);
		this.openGLGraphicsToolkit.method5256(class30_sub2_sub1);
		this.openGLGraphicsToolkit.method5258(7681, 8448);
		this.openGLGraphicsToolkit.method5259(0, 34168, 768);
		this.openGLGraphicsToolkit.method5266(1);
		i += this.anInt9037;
		i_71_ += this.anInt9042;
		int i_74_ = i + this.aClass30_Sub2_Sub1_9043.width;
		int i_75_ = i_71_ + (this.aClass30_Sub2_Sub1_9043.height);
		float f = (class30_sub2_sub1.aFloat9049 / (float) class30_sub2_sub1.width);
		float f_76_ = (class30_sub2_sub1.aFloat9051 / (float) class30_sub2_sub1.height);
		float f_77_ = (float) (i - i_72_) * f;
		float f_78_ = (float) (i_74_ - i_72_) * f;
		float f_79_ = (class30_sub2_sub1.aFloat9051 - (float) (i_71_ - i_73_) * f_76_);
		float f_80_ = (class30_sub2_sub1.aFloat9051 - (float) (i_75_ - i_73_) * f_76_);
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass30_Sub2_Sub1_9043.aFloat9051);
		OpenGL.glMultiTexCoord2f(33985, f_77_, f_79_);
		OpenGL.glVertex2i(i, i_71_);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_77_, f_80_);
		OpenGL.glVertex2i(i, i_71_ + this.aClass30_Sub2_Sub1_9043.height);
		OpenGL.glMultiTexCoord2f(33984, this.aClass30_Sub2_Sub1_9043.aFloat9049, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_78_, f_80_);
		OpenGL.glVertex2i(i + (this.aClass30_Sub2_Sub1_9043.width), i_71_ + this.aClass30_Sub2_Sub1_9043.height);
		OpenGL.glMultiTexCoord2f(33984, this.aClass30_Sub2_Sub1_9043.aFloat9049, this.aClass30_Sub2_Sub1_9043.aFloat9051);
		OpenGL.glMultiTexCoord2f(33985, f_78_, f_79_);
		OpenGL.glVertex2i(i + (this.aClass30_Sub2_Sub1_9043.width), i_71_);
		OpenGL.glEnd();
		this.openGLGraphicsToolkit.method5259(0, 5890, 768);
		this.openGLGraphicsToolkit.method5243(0);
		this.openGLGraphicsToolkit.method5256(null);
		this.openGLGraphicsToolkit.method5255(0);
	}

	void method635(int i, int i_81_, int i_82_, int i_83_, int i_84_, int i_85_, int i_86_, int i_87_) {
		this.aClass30_Sub2_Sub1_9043.method410((i_87_ & 0x1) != 0);
		this.openGLGraphicsToolkit.method5251();
		this.openGLGraphicsToolkit.method5266(i_86_);
		OpenGL.glColor4ub((byte) (i_85_ >> 16), (byte) (i_85_ >> 8), (byte) i_85_, (byte) (i_85_ >> 24));
		if (this.aBoolean9039) {
			float f = (float) i_82_ / (float) getPaddedWidth();
			float f_88_ = (float) i_83_ / (float) getPaddedHeight();
			float f_89_ = (float) i + (float) this.anInt9037 * f;
			float f_90_ = ((float) i_81_ + (float) this.anInt9042 * f_88_);
			float f_91_ = (f_89_ + (float) (this.aClass30_Sub2_Sub1_9043.width) * f);
			float f_92_ = (f_90_ + (float) (this.aClass30_Sub2_Sub1_9043.height) * f_88_);
			if (this.aClass30_Sub2_Sub1_9038 == null) {
				this.openGLGraphicsToolkit.method5256(this.aClass30_Sub2_Sub1_9043);
				this.openGLGraphicsToolkit.method5243(i_84_);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass30_Sub2_Sub1_9043.aFloat9051);
				OpenGL.glVertex2f(f_89_, f_90_);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(f_89_, f_92_);
				OpenGL.glTexCoord2f(this.aClass30_Sub2_Sub1_9043.aFloat9049, 0.0F);
				OpenGL.glVertex2f(f_91_, f_92_);
				OpenGL.glTexCoord2f(this.aClass30_Sub2_Sub1_9043.aFloat9049, this.aClass30_Sub2_Sub1_9043.aFloat9051);
				OpenGL.glVertex2f(f_91_, f_90_);
				OpenGL.glEnd();
			} else {
				method689(i_84_);
				this.aClass30_Sub2_Sub1_9038.method410(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, (this.aClass30_Sub2_Sub1_9043.aFloat9051));
				OpenGL.glTexCoord2f(0.0F, this.aClass30_Sub2_Sub1_9043.aFloat9051);
				OpenGL.glVertex2f(f_89_, f_90_);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(f_89_, f_92_);
				OpenGL.glMultiTexCoord2f(33985, (this.aClass30_Sub2_Sub1_9043.aFloat9049), 0.0F);
				OpenGL.glTexCoord2f(this.aClass30_Sub2_Sub1_9043.aFloat9049, 0.0F);
				OpenGL.glVertex2f(f_91_, f_92_);
				OpenGL.glMultiTexCoord2f(33985, (this.aClass30_Sub2_Sub1_9043.aFloat9049), (this.aClass30_Sub2_Sub1_9043.aFloat9051));
				OpenGL.glTexCoord2f(this.aClass30_Sub2_Sub1_9043.aFloat9049, this.aClass30_Sub2_Sub1_9043.aFloat9051);
				OpenGL.glVertex2f(f_91_, f_90_);
				OpenGL.glEnd();
				method690();
			}
		} else if (this.aClass30_Sub2_Sub1_9038 == null) {
			this.openGLGraphicsToolkit.method5256(this.aClass30_Sub2_Sub1_9043);
			this.openGLGraphicsToolkit.method5243(i_84_);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass30_Sub2_Sub1_9043.aFloat9051);
			OpenGL.glVertex2i(i, i_81_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_81_ + i_83_);
			OpenGL.glTexCoord2f(this.aClass30_Sub2_Sub1_9043.aFloat9049, 0.0F);
			OpenGL.glVertex2i(i + i_82_, i_81_ + i_83_);
			OpenGL.glTexCoord2f(this.aClass30_Sub2_Sub1_9043.aFloat9049, this.aClass30_Sub2_Sub1_9043.aFloat9051);
			OpenGL.glVertex2i(i + i_82_, i_81_);
			OpenGL.glEnd();
		} else {
			method689(i_84_);
			this.aClass30_Sub2_Sub1_9038.method410(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass30_Sub2_Sub1_9043.aFloat9051);
			OpenGL.glTexCoord2f(0.0F, this.aClass30_Sub2_Sub1_9043.aFloat9051);
			OpenGL.glVertex2i(i, i_81_);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_81_ + i_83_);
			OpenGL.glMultiTexCoord2f(33985, this.aClass30_Sub2_Sub1_9043.aFloat9049, 0.0F);
			OpenGL.glTexCoord2f(this.aClass30_Sub2_Sub1_9043.aFloat9049, 0.0F);
			OpenGL.glVertex2i(i + i_82_, i_81_ + i_83_);
			OpenGL.glMultiTexCoord2f(33985, this.aClass30_Sub2_Sub1_9043.aFloat9049, this.aClass30_Sub2_Sub1_9043.aFloat9051);
			OpenGL.glTexCoord2f(this.aClass30_Sub2_Sub1_9043.aFloat9049, this.aClass30_Sub2_Sub1_9043.aFloat9051);
			OpenGL.glVertex2i(i + i_82_, i_81_);
			OpenGL.glEnd();
			method690();
		}
	}

	public void method694(int i, int i_93_, int i_94_, int i_95_, int i_96_, int i_97_, int i_98_) {
		int i_99_ = i + i_94_;
		int i_100_ = i_93_ + i_95_;
		this.aClass30_Sub2_Sub1_9043.method410(false);
		this.openGLGraphicsToolkit.method5251();
		this.openGLGraphicsToolkit.method5256(this.aClass30_Sub2_Sub1_9043);
		this.openGLGraphicsToolkit.method5266(i_98_);
		this.openGLGraphicsToolkit.method5243(i_96_);
		OpenGL.glColor4ub((byte) (i_97_ >> 16), (byte) (i_97_ >> 8), (byte) i_97_, (byte) (i_97_ >> 24));
		if (this.aClass30_Sub2_Sub1_9043.aBoolean9050 && !this.aBoolean9039) {
			float f = (this.aClass30_Sub2_Sub1_9043.aFloat9051 * (float) i_95_ / (float) (this.aClass30_Sub2_Sub1_9043.height));
			float f_101_ = (this.aClass30_Sub2_Sub1_9043.aFloat9049 * (float) i_94_ / (float) (this.aClass30_Sub2_Sub1_9043.width));
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, f);
			OpenGL.glVertex2i(i, i_93_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_100_);
			OpenGL.glTexCoord2f(f_101_, 0.0F);
			OpenGL.glVertex2i(i_99_, i_100_);
			OpenGL.glTexCoord2f(f_101_, f);
			OpenGL.glVertex2i(i_99_, i_93_);
			OpenGL.glEnd();
		} else {
			OpenGL.glPushMatrix();
			OpenGL.glTranslatef((float) this.anInt9037, (float) this.anInt9042, 0.0F);
			int i_102_ = getPaddedWidth();
			int i_103_ = getPaddedHeight();
			int i_104_ = i_93_ + (this.aClass30_Sub2_Sub1_9043.height);
			OpenGL.glBegin(7);
			int i_105_ = i_93_;
			for (/**/; i_104_ <= i_100_; i_104_ += i_103_) {
				int i_106_ = i + (this.aClass30_Sub2_Sub1_9043.width);
				int i_107_ = i;
				while (i_106_ <= i_99_) {
					OpenGL.glTexCoord2f(0.0F, (this.aClass30_Sub2_Sub1_9043.aFloat9051));
					OpenGL.glVertex2i(i_107_, i_105_);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(i_107_, i_104_);
					OpenGL.glTexCoord2f((this.aClass30_Sub2_Sub1_9043.aFloat9049), 0.0F);
					OpenGL.glVertex2i(i_106_, i_104_);
					OpenGL.glTexCoord2f((this.aClass30_Sub2_Sub1_9043.aFloat9049), (this.aClass30_Sub2_Sub1_9043.aFloat9051));
					OpenGL.glVertex2i(i_106_, i_105_);
					i_106_ += i_102_;
					i_107_ += i_102_;
				}
				if (i_107_ < i_99_) {
					float f = ((this.aClass30_Sub2_Sub1_9043.aFloat9049) * (float) (i_99_ - i_107_) / (float) this.aClass30_Sub2_Sub1_9043.width);
					OpenGL.glTexCoord2f(0.0F, (this.aClass30_Sub2_Sub1_9043.aFloat9051));
					OpenGL.glVertex2i(i_107_, i_105_);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(i_107_, i_104_);
					OpenGL.glTexCoord2f(f, 0.0F);
					OpenGL.glVertex2i(i_99_, i_104_);
					OpenGL.glTexCoord2f(f, (this.aClass30_Sub2_Sub1_9043.aFloat9051));
					OpenGL.glVertex2i(i_99_, i_105_);
				}
				i_105_ += i_103_;
			}
			if (i_105_ < i_100_) {
				float f = ((this.aClass30_Sub2_Sub1_9043.aFloat9051) * (float) (this.aClass30_Sub2_Sub1_9043.height - (i_100_ - i_105_)) / (float) this.aClass30_Sub2_Sub1_9043.height);
				int i_108_ = i + (this.aClass30_Sub2_Sub1_9043.width);
				int i_109_ = i;
				while (i_108_ <= i_99_) {
					OpenGL.glTexCoord2f(0.0F, (this.aClass30_Sub2_Sub1_9043.aFloat9051));
					OpenGL.glVertex2i(i_109_, i_105_);
					OpenGL.glTexCoord2f(0.0F, f);
					OpenGL.glVertex2i(i_109_, i_100_);
					OpenGL.glTexCoord2f((this.aClass30_Sub2_Sub1_9043.aFloat9049), f);
					OpenGL.glVertex2i(i_108_, i_100_);
					OpenGL.glTexCoord2f((this.aClass30_Sub2_Sub1_9043.aFloat9049), (this.aClass30_Sub2_Sub1_9043.aFloat9051));
					OpenGL.glVertex2i(i_108_, i_105_);
					i_108_ += i_102_;
					i_109_ += i_102_;
				}
				if (i_109_ < i_99_) {
					float f_110_ = ((this.aClass30_Sub2_Sub1_9043.aFloat9049) * (float) (i_99_ - i_109_) / (float) this.aClass30_Sub2_Sub1_9043.width);
					OpenGL.glTexCoord2f(0.0F, (this.aClass30_Sub2_Sub1_9043.aFloat9051));
					OpenGL.glVertex2i(i_109_, i_105_);
					OpenGL.glTexCoord2f(0.0F, f);
					OpenGL.glVertex2i(i_109_, i_100_);
					OpenGL.glTexCoord2f(f_110_, f);
					OpenGL.glVertex2i(i_99_, i_100_);
					OpenGL.glTexCoord2f(f_110_, (this.aClass30_Sub2_Sub1_9043.aFloat9051));
					OpenGL.glVertex2i(i_99_, i_105_);
				}
			}
			OpenGL.glEnd();
			OpenGL.glPopMatrix();
		}
	}

	void method642(float f, float f_111_, float f_112_, float f_113_, float f_114_, float f_115_, int i, int i_116_, int i_117_, int i_118_) {
		if (this.aBoolean9039) {
			float f_119_ = (float) getPaddedWidth();
			float f_120_ = (float) getPaddedHeight();
			float f_121_ = (f_112_ - f) / f_119_;
			float f_122_ = (f_113_ - f_111_) / f_119_;
			float f_123_ = (f_114_ - f) / f_120_;
			float f_124_ = (f_115_ - f_111_) / f_120_;
			float f_125_ = f_123_ * (float) this.anInt9042;
			float f_126_ = f_124_ * (float) this.anInt9042;
			float f_127_ = f_121_ * (float) this.anInt9037;
			float f_128_ = f_122_ * (float) this.anInt9037;
			float f_129_ = -f_121_ * (float) this.anInt9045;
			float f_130_ = -f_122_ * (float) this.anInt9045;
			float f_131_ = -f_123_ * (float) this.anInt9044;
			float f_132_ = -f_124_ * (float) this.anInt9044;
			f = f + f_127_ + f_125_;
			f_111_ = f_111_ + f_128_ + f_126_;
			f_112_ = f_112_ + f_129_ + f_125_;
			f_113_ = f_113_ + f_130_ + f_126_;
			f_114_ = f_114_ + f_127_ + f_131_;
			f_115_ = f_115_ + f_128_ + f_132_;
		}
		float f_133_ = f_114_ + (f_112_ - f);
		float f_134_ = f_113_ + (f_115_ - f_111_);
		this.aClass30_Sub2_Sub1_9043.method410((i_118_ & 0x1) != 0);
		this.openGLGraphicsToolkit.method5251();
		this.openGLGraphicsToolkit.method5256(this.aClass30_Sub2_Sub1_9043);
		this.openGLGraphicsToolkit.method5266(i_117_);
		this.openGLGraphicsToolkit.method5243(i);
		OpenGL.glColor4ub((byte) (i_116_ >> 16), (byte) (i_116_ >> 8), (byte) i_116_, (byte) (i_116_ >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, (this.aClass30_Sub2_Sub1_9043.aFloat9051));
		OpenGL.glVertex2f(f, f_111_);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(f_114_, f_115_);
		OpenGL.glTexCoord2f((this.aClass30_Sub2_Sub1_9043.aFloat9049), 0.0F);
		OpenGL.glVertex2f(f_133_, f_134_);
		OpenGL.glTexCoord2f((this.aClass30_Sub2_Sub1_9043.aFloat9049), (this.aClass30_Sub2_Sub1_9043.aFloat9051));
		OpenGL.glVertex2f(f_112_, f_113_);
		OpenGL.glEnd();
	}

	void method644(float f, float f_135_, float f_136_, float f_137_, float f_138_, float f_139_, int i, ToolkitLoader toolkitLoader, int i_140_, int i_141_) {
		Class30_Sub2_Sub1 class30_sub2_sub1 = (((OpenGLToolkitLoader) toolkitLoader).aClass30_Sub2_Sub1_8441);
		if (this.aBoolean9039) {
			float f_142_ = (float) getPaddedWidth();
			float f_143_ = (float) getPaddedHeight();
			float f_144_ = (f_136_ - f) / f_142_;
			float f_145_ = (f_137_ - f_135_) / f_142_;
			float f_146_ = (f_138_ - f) / f_143_;
			float f_147_ = (f_139_ - f_135_) / f_143_;
			float f_148_ = f_146_ * (float) this.anInt9042;
			float f_149_ = f_147_ * (float) this.anInt9042;
			float f_150_ = f_144_ * (float) this.anInt9037;
			float f_151_ = f_145_ * (float) this.anInt9037;
			float f_152_ = -f_144_ * (float) this.anInt9045;
			float f_153_ = -f_145_ * (float) this.anInt9045;
			float f_154_ = -f_146_ * (float) this.anInt9044;
			float f_155_ = -f_147_ * (float) this.anInt9044;
			f = f + f_150_ + f_148_;
			f_135_ = f_135_ + f_151_ + f_149_;
			f_136_ = f_136_ + f_152_ + f_148_;
			f_137_ = f_137_ + f_153_ + f_149_;
			f_138_ = f_138_ + f_150_ + f_154_;
			f_139_ = f_139_ + f_151_ + f_155_;
		}
		float f_156_ = f_138_ + (f_136_ - f);
		float f_157_ = f_137_ + (f_139_ - f_135_);
		this.aClass30_Sub2_Sub1_9043.method410((i & 0x1) != 0);
		this.openGLGraphicsToolkit.method5251();
		this.openGLGraphicsToolkit.method5256(this.aClass30_Sub2_Sub1_9043);
		this.openGLGraphicsToolkit.method5243(1);
		this.openGLGraphicsToolkit.method5255(1);
		this.openGLGraphicsToolkit.method5256(class30_sub2_sub1);
		this.openGLGraphicsToolkit.method5258(7681, 8448);
		this.openGLGraphicsToolkit.method5259(0, 34168, 768);
		this.openGLGraphicsToolkit.method5266(1);
		float f_158_ = (class30_sub2_sub1.aFloat9049 / (float) class30_sub2_sub1.width);
		float f_159_ = (class30_sub2_sub1.aFloat9051 / (float) class30_sub2_sub1.height);
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass30_Sub2_Sub1_9043.aFloat9051);
		OpenGL.glMultiTexCoord2f(33985, f_158_ * (f - (float) i_140_), ((class30_sub2_sub1.aFloat9051) - f_159_ * (f_135_ - (float) i_141_)));
		OpenGL.glVertex2f(f, f_135_);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_158_ * (f_138_ - (float) i_140_), ((class30_sub2_sub1.aFloat9051) - f_159_ * (f_139_ - (float) i_141_)));
		OpenGL.glVertex2f(f_138_, f_139_);
		OpenGL.glMultiTexCoord2f(33984, this.aClass30_Sub2_Sub1_9043.aFloat9049, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_158_ * (f_156_ - (float) i_140_), ((class30_sub2_sub1.aFloat9051) - f_159_ * (f_157_ - (float) i_141_)));
		OpenGL.glVertex2f(f_156_, f_157_);
		OpenGL.glMultiTexCoord2f(33984, this.aClass30_Sub2_Sub1_9043.aFloat9049, this.aClass30_Sub2_Sub1_9043.aFloat9051);
		OpenGL.glMultiTexCoord2f(33985, f_158_ * (f_136_ - (float) i_140_), ((class30_sub2_sub1.aFloat9051) - f_159_ * (f_137_ - (float) i_141_)));
		OpenGL.glVertex2f(f_136_, f_137_);
		OpenGL.glEnd();
		this.openGLGraphicsToolkit.method5259(0, 5890, 768);
		this.openGLGraphicsToolkit.method5243(0);
		this.openGLGraphicsToolkit.method5256(null);
		this.openGLGraphicsToolkit.method5255(0);
	}

    void method691(int i, int i_244_, int i_245_, int i_246_, int[] is, int i_247_, int i_248_) {
		this.aClass30_Sub2_Sub1_9043.method422(i, i_244_, i_245_, i_246_, is, i_247_, i_248_, true);
	}

    public int getPaddedWidth() {
		return (this.aClass30_Sub2_Sub1_9043.width + this.anInt9037 + this.anInt9045);
	}

    public Interface8_Impl1_Impl1 method627() {
		return this.aClass30_Sub2_Sub1_9043.method423(0);
	}

}
