package com.jagex;/* Class30_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class30_Sub4 extends Class30 {
	int anInt6749;
	int anInt6750;
	int anInt6751;

	Class30_Sub4(OpenGLGraphicsToolkit class_ra_sub2, Class55 class55, Class77 class77, int i, int i_0_, int i_1_) {
		super(class_ra_sub2, 32879, class55, class77, i * i_0_ * i_1_, false);
		this.anInt6750 = i;
		this.anInt6751 = i_0_;
		this.anInt6749 = i_1_;
		this.aClass_ra_Sub2_381.method5256(this);
		OpenGL.glTexImage3Dub(this.anInt372, 0, OpenGLGraphicsToolkit.method5274(this.aClass55_377, this.aClass77_378), this.anInt6750, this.anInt6751, this.anInt6749, 0, OpenGLGraphicsToolkit.method5228(this.aClass55_377), 5121, null, 0);
		method410(true);
	}

	void method431(int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_) {
		this.aClass_ra_Sub2_381.method5256(this);
		OpenGL.glCopyTexSubImage3D(this.anInt372, 0, i, i_2_, i_3_, i_6_, i_7_, i_4_, i_5_);
		OpenGL.glFlush();
	}

	Class30_Sub4(OpenGLGraphicsToolkit class_ra_sub2, Class55 class55, Class77 class77, int i, int i_8_, int i_9_, byte[] is, Class55 class55_10_) {
		super(class_ra_sub2, 32879, class55, class77, i * i_8_ * i_9_, false);
		this.anInt6750 = i;
		this.anInt6751 = i_8_;
		this.anInt6749 = i_9_;
		this.aClass_ra_Sub2_381.method5256(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(this.anInt372, 0, OpenGLGraphicsToolkit.method5274(this.aClass55_377, this.aClass77_378), this.anInt6750, this.anInt6751, this.anInt6749, 0, OpenGLGraphicsToolkit.method5228(class55_10_), 5121, is, 0);
		OpenGL.glPixelStorei(3317, 4);
		method410(true);
	}
}
