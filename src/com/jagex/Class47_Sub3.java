package com.jagex;/* Class47_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class47_Sub3 extends Class47 {
	Class30_Sub1[] aClass30_Sub1Array6761;
	Class28 aClass28_6765;
	boolean aBoolean6766;
	boolean aBoolean6768 = false;

	void method503(int i, int i_0_) {
		if (this.aBoolean6768) {
			this.openGLGraphicsToolkit.method5255(1);
			this.openGLGraphicsToolkit.method5256(this.aClass30_Sub1Array6761[i - 1]);
			this.openGLGraphicsToolkit.method5255(0);
		}
	}

    boolean method501() {
		return true;
	}

	void method505(boolean bool) {
		if (this.aClass28_6765 != null && bool) {
			if (!this.aBoolean6766) {
				this.openGLGraphicsToolkit.method5255(2);
				this.openGLGraphicsToolkit.method5256(this.openGLGraphicsToolkit.aClass30_Sub2_8140);
				this.openGLGraphicsToolkit.method5255(0);
			}
			this.aClass28_6765.method404('\0');
			this.aBoolean6768 = true;
		} else
			this.openGLGraphicsToolkit.method5286(0, 34168, 770);
	}

    void method504() {
		if (this.aBoolean6768) {
			if (!this.aBoolean6766) {
				this.openGLGraphicsToolkit.method5255(2);
				this.openGLGraphicsToolkit.method5256(null);
			}
			this.openGLGraphicsToolkit.method5255(1);
			this.openGLGraphicsToolkit.method5256(null);
			this.openGLGraphicsToolkit.method5255(0);
			this.aClass28_6765.method404('\001');
			this.aBoolean6768 = false;
		} else
			this.openGLGraphicsToolkit.method5286(0, 5890, 770);
		this.openGLGraphicsToolkit.method5258(8448, 8448);
	}

    void method500(Class30 class30, int i) {
		this.openGLGraphicsToolkit.method5256(class30);
		this.openGLGraphicsToolkit.method5243(i);
	}

    Class47_Sub3(OpenGLGraphicsToolkit class_ra_sub2) {
		super(class_ra_sub2);
		if (class_ra_sub2.aBoolean8178) {
			this.aBoolean6766 = class_ra_sub2.anInt8165 < 3;
			int i = this.aBoolean6766 ? 48 : 127;
			byte[][] is = new byte[6][4096];
			byte[][] is_2_ = new byte[6][4096];
			byte[][] is_3_ = new byte[6][4096];
			int i_4_ = 0;
			for (int i_5_ = 0; i_5_ < 64; i_5_++) {
				for (int i_6_ = 0; i_6_ < 64; i_6_++) {
					float f = 2.0F * (float) i_6_ / 64.0F - 1.0F;
					float f_7_ = 2.0F * (float) i_5_ / 64.0F - 1.0F;
					float f_8_ = (float) (1.0 / Math.sqrt((double) (f * f + 1.0F + f_7_ * f_7_)));
					f *= f_8_;
					f_7_ *= f_8_;
					for (int i_9_ = 0; i_9_ < 6; i_9_++) {
						float f_10_;
						if (i_9_ == 0)
							f_10_ = -f;
						else if (i_9_ == 1)
							f_10_ = f;
						else if (i_9_ == 2)
							f_10_ = f_7_;
						else if (i_9_ == 3)
							f_10_ = -f_7_;
						else if (i_9_ == 4)
							f_10_ = -f_8_;
						else
							f_10_ = f_8_;
						int i_11_;
						int i_12_;
						int i_13_;
						if (f_10_ > 0.0F) {
							i_13_ = (int) (Math.pow((double) f_10_, 96.0) * (double) i);
							i_12_ = (int) (Math.pow((double) f_10_, 36.0) * (double) i);
							i_11_ = (int) (Math.pow((double) f_10_, 12.0) * (double) i);
						} else {
							i_11_ = 0;
							i_12_ = 0;
							i_13_ = 0;
						}
						is_2_[i_9_][i_4_] = (byte) i_13_;
						is_3_[i_9_][i_4_] = (byte) i_12_;
						is[i_9_][i_4_] = (byte) i_11_;
					}
					i_4_++;
				}
			}
			this.aClass30_Sub1Array6761 = new Class30_Sub1[3];
			this.aClass30_Sub1Array6761[0] = new Class30_Sub1(this.openGLGraphicsToolkit, Class55.aClass55_567, Class77.aClass77_717, 64, false, is_2_, Class55.aClass55_567);
			this.aClass30_Sub1Array6761[1] = new Class30_Sub1(this.openGLGraphicsToolkit, Class55.aClass55_567, Class77.aClass77_717, 64, false, is_3_, Class55.aClass55_567);
			this.aClass30_Sub1Array6761[2] = new Class30_Sub1(this.openGLGraphicsToolkit, Class55.aClass55_567, Class77.aClass77_717, 64, false, is, Class55.aClass55_567);
			method521();
		}
	}

    void method518(boolean bool) {
		this.openGLGraphicsToolkit.method5258(8448, 7681);
	}

	void method521() {
		this.aClass28_6765 = new Class28(this.openGLGraphicsToolkit, 2);
		this.aClass28_6765.method405(0);
		this.openGLGraphicsToolkit.method5255(1);
		OpenGL.glTexGeni(8192, 9472, 34065);
		OpenGL.glTexGeni(8193, 9472, 34065);
		OpenGL.glTexGeni(8194, 9472, 34065);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glEnable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glRotatef(22.5F, 1.0F, 0.0F, 0.0F);
		
		OpenGL.glMatrixMode(5888);
		if (!this.aBoolean6766) {
			this.openGLGraphicsToolkit.method5258(7681, 8448);
			this.openGLGraphicsToolkit.method5259(0, 34168, 768);
			this.openGLGraphicsToolkit.method5255(2);
			this.openGLGraphicsToolkit.method5258(260, 7681);
			this.openGLGraphicsToolkit.method5259(0, 34168, 768);
			this.openGLGraphicsToolkit.method5259(1, 34168, 770);
			this.openGLGraphicsToolkit.method5286(0, 34167, 770);
		} else {
			this.openGLGraphicsToolkit.method5258(260, 7681);
			this.openGLGraphicsToolkit.method5259(0, 5890, 770);
			this.openGLGraphicsToolkit.method5286(0, 34167, 770);
		}
		this.openGLGraphicsToolkit.method5255(0);
		this.aClass28_6765.method403();
		this.aClass28_6765.method405(1);
		this.openGLGraphicsToolkit.method5255(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (!this.aBoolean6766) {
			this.openGLGraphicsToolkit.method5258(8448, 8448);
			this.openGLGraphicsToolkit.method5259(0, 5890, 768);
			this.openGLGraphicsToolkit.method5255(2);
			this.openGLGraphicsToolkit.method5258(8448, 8448);
			this.openGLGraphicsToolkit.method5259(0, 5890, 768);
			this.openGLGraphicsToolkit.method5259(1, 34168, 768);
			this.openGLGraphicsToolkit.method5286(0, 5890, 770);
		} else {
			this.openGLGraphicsToolkit.method5258(8448, 8448);
			this.openGLGraphicsToolkit.method5259(0, 5890, 768);
			this.openGLGraphicsToolkit.method5286(0, 5890, 770);
		}
		this.openGLGraphicsToolkit.method5255(0);
		this.aClass28_6765.method403();
	}

}
