package com.jagex;/* Class47_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class47_Sub6 extends Class47 {
	Class45 aClass45_6789;
	Class28 aClass28_6790;
	static char aChar6791 = '\0';
	static char aChar6792 = '\001';
	static float[] aFloatArray6793 = new float[4];

    Class47_Sub6(OpenGLGraphicsToolkit class_ra_sub2, Class45 class45) {
		super(class_ra_sub2);
		this.aClass45_6789 = class45;
		this.aClass28_6790 = new Class28(class_ra_sub2, 2);
		this.aClass28_6790.method405(0);
		this.openGLGraphicsToolkit.method5255(1);
		if (this.aClass45_6789.aBoolean480) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		this.openGLGraphicsToolkit.method5255(0);
		this.aClass28_6790.method403();
		this.aClass28_6790.method405(1);
		this.openGLGraphicsToolkit.method5255(1);
		if (this.aClass45_6789.aBoolean480)
			OpenGL.glDisable(3170);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		this.openGLGraphicsToolkit.method5255(0);
		this.aClass28_6790.method403();
	}

	void method505(boolean bool) {
		this.aClass28_6790.method404('\0');
		if (this.aClass45_6789.aBoolean480) {
			this.openGLGraphicsToolkit.method5255(1);
			this.openGLGraphicsToolkit.method5256(this.aClass45_6789.aClass30_Sub4_484);
			this.openGLGraphicsToolkit.method5255(0);
		}
	}

	void method518(boolean bool) {
		/* empty */
	}

	void method500(Class30 class30, int i) {
		this.openGLGraphicsToolkit.method5256(class30);
		this.openGLGraphicsToolkit.method5243(i);
	}

	void method503(int i, int i_4_) {
		float f = -5.0E-4F * (float) ((i & 0x3) + 1);
		float f_5_ = 5.0E-4F * (float) ((i >> 3 & 0x3) + 1);
		float f_6_ = (i & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		boolean bool = (i & 0x80) != 0;
		this.openGLGraphicsToolkit.method5255(1);
		if (bool) {
			aFloatArray6793[0] = f_6_;
			aFloatArray6793[1] = 0.0F;
			aFloatArray6793[2] = 0.0F;
			aFloatArray6793[3] = 0.0F;
		} else {
			aFloatArray6793[0] = 0.0F;
			aFloatArray6793[1] = 0.0F;
			aFloatArray6793[2] = f_6_;
			aFloatArray6793[3] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, aFloatArray6793, 0);
		aFloatArray6793[0] = 0.0F;
		aFloatArray6793[1] = f_6_;
		aFloatArray6793[2] = 0.0F;
		aFloatArray6793[3] = (float) (this.openGLGraphicsToolkit.anInt8062) * f % 1.0F;
		OpenGL.glTexGenfv(8193, 9474, aFloatArray6793, 0);
		if (!this.aClass45_6789.aBoolean480) {
			int i_7_ = (int) (f_5_ * (float) (this.openGLGraphicsToolkit.anInt8062) * 16.0F);
			this.openGLGraphicsToolkit.method5256(this.aClass45_6789.aClass30_Sub2Array483[i_7_ % 16]);
		} else {
			aFloatArray6793[0] = 0.0F;
			aFloatArray6793[1] = 0.0F;
			aFloatArray6793[2] = 0.0F;
			aFloatArray6793[3] = ((float) this.openGLGraphicsToolkit.anInt8062 * f_5_ % 1.0F);
			OpenGL.glTexGenfv(8194, 9473, aFloatArray6793, 0);
		}
		this.openGLGraphicsToolkit.method5255(0);
	}

    void method504() {
		this.aClass28_6790.method404('\001');
		this.openGLGraphicsToolkit.method5255(1);
		this.openGLGraphicsToolkit.method5256(null);
		this.openGLGraphicsToolkit.method5255(0);
	}

    boolean method501() {
		return true;
	}

}
