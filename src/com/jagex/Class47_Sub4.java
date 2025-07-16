package com.jagex;/* Class47_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class47_Sub4 extends Class47 {
	Class30_Sub3 aClass30_Sub3_6769;
	static char aChar6770 = '\001';
	static char aChar6771 = '\0';
	Class28 aClass28_6772;
	Class45 aClass45_6773;
	static float[] aFloatArray6774 = { 0.0F, 0.0F, 0.0F, 0.0F };

    boolean method501() {
		return true;
	}

	void method518(boolean bool) {
		this.openGLGraphicsToolkit.method5258(260, 8448);
	}

	Class47_Sub4(OpenGLGraphicsToolkit class_ra_sub2, Class45 class45) {
		super(class_ra_sub2);
		this.aClass45_6773 = class45;
		method522();
		this.aClass30_Sub3_6769 = new Class30_Sub3(this.openGLGraphicsToolkit, Class55.aClass55_567, Class77.aClass77_717, 2, new byte[] { 0, -1 }, Class55.aClass55_567);
		this.aClass30_Sub3_6769.method430(false);
	}

	void method503(int i, int i_2_) {
		if ((i & 0x1) == 1) {
			if (this.aClass45_6773.aBoolean480) {
				this.openGLGraphicsToolkit.method5256(this.aClass45_6773.aClass30_Sub4_482);
				aFloatArray6774[0] = 0.0F;
				aFloatArray6774[1] = 0.0F;
				aFloatArray6774[2] = 0.0F;
				aFloatArray6774[3] = (float) ((this.openGLGraphicsToolkit.anInt8062) % 4000) / 4000.0F;
				OpenGL.glTexGenfv(8194, 9473, aFloatArray6774, 0);
			} else {
				int i_3_ = (this.openGLGraphicsToolkit.anInt8062 % 4000 * 16 / 4000);
				this.openGLGraphicsToolkit.method5256(this.aClass45_6773.aClass30_Sub2Array487[i_3_]);
			}
		} else if (this.aClass45_6773.aBoolean480) {
			this.openGLGraphicsToolkit.method5256(this.aClass45_6773.aClass30_Sub4_482);
			aFloatArray6774[0] = 0.0F;
			aFloatArray6774[1] = 0.0F;
			aFloatArray6774[2] = 0.0F;
			aFloatArray6774[3] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray6774, 0);
		} else
			this.openGLGraphicsToolkit.method5256(this.aClass45_6773.aClass30_Sub2Array487[0]);
	}

	void method500(Class30 class30, int i) {
		/* empty */
	}

    void method522() {
		this.aClass28_6772 = new Class28(this.openGLGraphicsToolkit, 2);
		this.aClass28_6772.method405(0);
		this.openGLGraphicsToolkit.method5255(1);
		this.openGLGraphicsToolkit.method5258(7681, 260);
		this.openGLGraphicsToolkit.method5259(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		this.openGLGraphicsToolkit.method5255(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass45_6773.aBoolean480) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass28_6772.method403();
		this.aClass28_6772.method405(1);
		this.openGLGraphicsToolkit.method5255(1);
		this.openGLGraphicsToolkit.method5258(8448, 8448);
		this.openGLGraphicsToolkit.method5259(0, 5890, 768);
		OpenGL.glDisable(3168);
		this.openGLGraphicsToolkit.method5255(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass45_6773.aBoolean480) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass28_6772.method403();
	}

	void method504() {
		this.aClass28_6772.method404('\001');
		if ((this.openGLGraphicsToolkit.anInt8007) > 0) {
			this.openGLGraphicsToolkit.method5255(1);
			this.openGLGraphicsToolkit.method5256(null);
			this.openGLGraphicsToolkit.method5238(1.0F, 0.0F);
			this.openGLGraphicsToolkit.method5255(0);
		}
		this.openGLGraphicsToolkit.method5258(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

    void method505(boolean bool) {
		if ((this.openGLGraphicsToolkit.anInt8007) > 0) {
			float f = -0.5F / (float) (this.openGLGraphicsToolkit.anInt8007);
			this.openGLGraphicsToolkit.method5255(1);
			aFloatArray6774[0] = 0.0F;
			aFloatArray6774[1] = 0.0F;
			aFloatArray6774[2] = f;
			aFloatArray6774[3] = (this.openGLGraphicsToolkit.aFloat8142) * f + 0.25F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, aFloatArray6774, 0);
			OpenGL.glPopMatrix();
			this.openGLGraphicsToolkit.method5238(0.5F, (float) this.openGLGraphicsToolkit.anInt8007);
			this.openGLGraphicsToolkit.method5256(this.aClass30_Sub3_6769);
			this.openGLGraphicsToolkit.method5255(0);
		}
		this.aClass28_6772.method404('\0');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

}
