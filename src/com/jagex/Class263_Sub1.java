package com.jagex;/* Class263_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class263_Sub1 extends Class263 implements Interface9_Impl2_Impl1 {
	int anInt9951;
	int anInt9952;

    Class263_Sub1(OpenGLXGraphicsToolkit openGLJavaGraphicsToolkit, int i, int i_0_, boolean bool, int[] is, int i_1_, int i_2_) {
		super(openGLJavaGraphicsToolkit, 3553, Class55.aClass55_557, Class77.aClass77_717, i * i_0_, bool);
		this.anInt9952 = i;
		this.anInt9951 = i_0_;
		this.aOpenGLJavaGraphicsToolkit_6422.method5358(this);
		if (!bool || i_2_ != 0 || i_1_ != 0) {
			OpenGL.glPixelStorei(3314, i_2_);
			OpenGL.glTexImage2Di(this.anInt6415, 0, 6408, this.anInt9952, this.anInt9951, 0, 32993, this.aOpenGLJavaGraphicsToolkit_6422.anInt9841, is, i_1_ * 4);
			OpenGL.glPixelStorei(3314, 0);
		} else
			method2468(this.anInt6415, i, i_0_, is);
	}

	Class263_Sub1(OpenGLXGraphicsToolkit openGLJavaGraphicsToolkit, Class55 class55, int i, int i_3_, boolean bool, byte[] is, int i_4_, int i_5_) {
		super(openGLJavaGraphicsToolkit, 3553, class55, Class77.aClass77_717, i * i_3_, bool);
		this.anInt9952 = i;
		this.anInt9951 = i_3_;
		this.aOpenGLJavaGraphicsToolkit_6422.method5358(this);
		OpenGL.glPixelStorei(3317, 1);
		if (!bool || i_5_ != 0 || i_4_ != 0) {
			OpenGL.glPixelStorei(3314, i_5_);
			Class55 class55_6_ = this.aClass55_6419;
			if (this.aClass55_6419 != null) {
				/* empty */
			}
			if (class55_6_ == Class55.aClass55_564)
				OpenGL.glCompressedTexImage2Dub((this.anInt6415), 0, 33777, i, i_3_, 0, i * i_3_ / 2, is, i_4_);
			else {
				Class55 class55_7_ = this.aClass55_6419;
				if (this.aClass55_6419 != null) {
					/* empty */
				}
				if (class55_7_ == Class55.aClass55_558)
					OpenGL.glCompressedTexImage2Dub((this.anInt6415), 0, 33779, i, i_3_, 0, i * i_3_, is, i_4_);
				else
					OpenGL.glTexImage2Dub(this.anInt6415, 0, OpenGLXGraphicsToolkit.method5533((this.aClass55_6419), (this.aClass77_6420)), i, i_3_, 0, OpenGLXGraphicsToolkit.method5532(this.aClass55_6419), 5121, is, i_4_);
			}
			OpenGL.glPixelStorei(3314, 0);
		} else
			method2472(this.anInt6415, i, i_3_, is);
		OpenGL.glPixelStorei(3317, 4);
	}

	public void method122(Class179 class179) {
		super.method122(class179);
	}

	public void method126() {
		super.method128();
	}

	public int method76() {
		return this.anInt9951;
	}

    public float method78(float f) {
		return f / (float) this.anInt9951;
	}

	public boolean method79() {
		return true;
	}

    public void method82(int i, int i_13_, int i_14_, int i_15_, byte[] is, Class55 class55, int i_16_, int i_17_) {
		this.aOpenGLJavaGraphicsToolkit_6422.method5358(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, i_17_);
		OpenGL.glTexSubImage2Dub(this.anInt6415, 0, i, i_13_, i_14_, i_15_, OpenGLXGraphicsToolkit.method5532(class55), 5121, is, i_16_);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	public void method81(int i, int i_18_, int i_19_, int i_20_, int[] is, int i_21_, int i_22_) {
		this.aOpenGLJavaGraphicsToolkit_6422.method5358(this);
		OpenGL.glPixelStorei(3314, i_22_);
		OpenGL.glTexSubImage2Di(this.anInt6415, 0, i, i_18_, i_19_, i_20_, 32993, this.aOpenGLJavaGraphicsToolkit_6422.anInt9841, is, i_21_);
		OpenGL.glPixelStorei(3314, 0);
	}

	public void method83(int i, int i_23_, int i_24_, int i_25_, int[] is, int i_26_) {
		int[] is_27_ = new int[(this.anInt9952 * this.anInt9951)];
		this.aOpenGLJavaGraphicsToolkit_6422.method5358(this);
		OpenGL.glGetTexImagei(this.anInt6415, 0, 32993, 5121, is_27_, 0);
		for (int i_28_ = 0; i_28_ < i_25_; i_28_++)
			System.arraycopy(is_27_, ((i_23_ + (i_25_ - 1) - i_28_) * this.anInt9952), is, i_26_ + i_28_ * i_24_, i_24_);
	}

	public Interface8_Impl1_Impl1 method117(int i) {
		return new Class245(this, i);
	}

    public void method125() {
		super.method128();
	}

	public void b() {
		super.b();
	}

    public void u() {
		super.b();
	}

	public void x() {
		super.b();
	}

    public float method77(float f) {
		return f / (float) this.anInt9952;
	}

    public void d() {
		super.b();
	}

    public void method129(Class179 class179) {
		super.method122(class179);
	}

	public void method127(Class179 class179) {
		super.method122(class179);
	}

	Class263_Sub1(OpenGLXGraphicsToolkit openGLJavaGraphicsToolkit, Class55 class55, Class77 class77, int i, int i_50_) {
		super(openGLJavaGraphicsToolkit, 3553, class55, class77, i * i_50_, false);
		this.anInt9952 = i;
		this.anInt9951 = i_50_;
		this.aOpenGLJavaGraphicsToolkit_6422.method5358(this);
		OpenGL.glTexImage2Dub(this.anInt6415, 0, OpenGLXGraphicsToolkit.method5533((this.aClass55_6419), (this.aClass77_6420)), i, i_50_, 0, OpenGLXGraphicsToolkit.method5532(this.aClass55_6419), OpenGLXGraphicsToolkit.method5537(this.aClass77_6420), null, 0);
	}

    public void method80(boolean bool, boolean bool_56_) {
		this.aOpenGLJavaGraphicsToolkit_6422.method5358(this);
		OpenGL.glTexParameteri(this.anInt6415, 10242, bool ? 10497 : 33071);
		OpenGL.glTexParameteri(this.anInt6415, 10243, bool_56_ ? 10497 : 33071);
	}

    void method2473(int i, int i_63_, int i_64_, int i_65_, float[] fs, Class55 class55, int i_66_, int i_67_) {
		this.aOpenGLJavaGraphicsToolkit_6422.method5358(this);
		OpenGL.glPixelStorei(3314, i_67_);
		OpenGL.glTexSubImage2Df(this.anInt6415, 0, i, i_63_, i_64_, i_65_, OpenGLXGraphicsToolkit.method5532(class55), 5121, fs, i_66_);
		OpenGL.glPixelStorei(3314, 0);
	}

	public void method123() {
		super.method128();
	}

	public void method128() {
		super.method128();
	}

	public void method124(Class179 class179) {
		super.method122(class179);
	}

	Class263_Sub1(OpenGLXGraphicsToolkit openGLJavaGraphicsToolkit, Class55 class55, int i, int i_73_, boolean bool, float[] fs, int i_74_, int i_75_) {
		super(openGLJavaGraphicsToolkit, 3553, class55, Class77.aClass77_721, i * i_73_, bool);
		this.anInt9952 = i;
		this.anInt9951 = i_73_;
		this.aOpenGLJavaGraphicsToolkit_6422.method5358(this);
		if (!bool || i_75_ != 0 || i_74_ != 0) {
			OpenGL.glPixelStorei(3314, i_75_);
			OpenGL.glTexImage2Df(this.anInt6415, 0, (OpenGLXGraphicsToolkit.method5533(this.aClass55_6419, this.aClass77_6420)), i, i_73_, 0, OpenGLXGraphicsToolkit.method5532(this.aClass55_6419), 5126, fs, i_74_ * 4);
			OpenGL.glPixelStorei(3314, 0);
		} else
			method2469(this.anInt6415, i, i_73_, fs);
	}

	public boolean method103() {
		return super.method103();
	}

	public int method92() {
		return this.anInt9952;
	}
}
