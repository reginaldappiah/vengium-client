package com.jagex;/* Class30_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class30_Sub1 extends Class30 {
	static int anInt6739 = 34074;
	static int anInt6740 = 34069;
	static int anInt6741 = 34071;
	static int anInt6742 = 34072;
	static int anInt6743 = 34073;
	static int anInt6744 = 34070;
	int anInt6745;

	Class30_Sub1(OpenGLGraphicsToolkit class_ra_sub2, Class55 class55, Class77 class77, int i) {
		super(class_ra_sub2, 34067, class55, class77, i * i * 6, false);
		this.anInt6745 = i;
		this.aClass_ra_Sub2_381.method5256(this);
		for (int i_0_ = 0; i_0_ < 6; i_0_++)
			OpenGL.glTexImage2Dub(34069 + i_0_, 0, OpenGLGraphicsToolkit.method5274(this.aClass55_377, this.aClass77_378), i, i, 0, OpenGLGraphicsToolkit.method5228(this.aClass55_377), 5121, null, 0);
		method410(true);
	}

	Class30_Sub1(OpenGLGraphicsToolkit class_ra_sub2, Class55 class55, Class77 class77, int i, boolean bool, byte[][] is, Class55 class55_1_) {
		super(class_ra_sub2, 34067, class55, class77, i * i * 6, bool);
		this.anInt6745 = i;
		this.aClass_ra_Sub2_381.method5256(this);
		for (int i_2_ = 0; i_2_ < 6; i_2_++)
			OpenGL.glTexImage2Dub(34069 + i_2_, 0, OpenGLGraphicsToolkit.method5274(this.aClass55_377, this.aClass77_378), i, i, 0, OpenGLGraphicsToolkit.method5228(class55_1_), 5121, is[i_2_], 0);
		method410(true);
	}

	Interface8_Impl1_Impl1 method418(int i, int i_3_) {
		return new Class33(this, i, i_3_);
	}

	Class30_Sub1(OpenGLGraphicsToolkit class_ra_sub2, Class55 class55, Class77 class77, int i, boolean bool, int[][] is) {
		super(class_ra_sub2, 34067, class55, class77, i * i * 6, bool);
		this.anInt6745 = i;
		this.aClass_ra_Sub2_381.method5256(this);
		if (bool) {
			for (int i_4_ = 0; i_4_ < 6; i_4_++)
				method411(34069 + i_4_, OpenGLGraphicsToolkit.method5274((this.aClass55_377), (this.aClass77_378)), i, i, 32993, this.aClass_ra_Sub2_381.anInt8186, is[i_4_]);
		} else {
			for (int i_5_ = 0; i_5_ < 6; i_5_++)
				OpenGL.glTexImage2Di(34069 + i_5_, 0, (OpenGLGraphicsToolkit.method5274(this.aClass55_377, this.aClass77_378)), i, i, 0, 32993, (this.aClass_ra_Sub2_381.anInt8186), is[i_5_], 0);
		}
		method410(true);
	}
}
