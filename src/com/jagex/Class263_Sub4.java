package com.jagex;/* Class263_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class263_Sub4 extends Class263 implements Interface9_Impl2_Impl1 {
	int anInt9953;
	int anInt9954;

    Class263_Sub4(OpenGLXGraphicsToolkit openGLJavaGraphicsToolkit, Class55 class55, int i, int i_0_, byte[] is, int i_1_, int i_2_) {
		super(openGLJavaGraphicsToolkit, 34037, class55, Class77.aClass77_717, i * i_0_, false);
		this.anInt9954 = i;
		this.anInt9953 = i_0_;
		this.aOpenGLJavaGraphicsToolkit_6422.method5358(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, i_2_);
		OpenGL.glTexImage2Dub(this.anInt6415, 0, (OpenGLXGraphicsToolkit.method5533(this.aClass55_6419, this.aClass77_6420)), i, i_0_, 0, OpenGLXGraphicsToolkit.method5532(this.aClass55_6419), 5121, is, i_1_);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	Class263_Sub4(OpenGLXGraphicsToolkit openGLJavaGraphicsToolkit, Class55 class55, int i, int i_3_, float[] fs, int i_4_, int i_5_) {
		super(openGLJavaGraphicsToolkit, 34037, class55, Class77.aClass77_721, i * i_3_, false);
		this.anInt9954 = i;
		this.anInt9953 = i_3_;
		this.aOpenGLJavaGraphicsToolkit_6422.method5358(this);
		OpenGL.glPixelStorei(3314, i_5_);
		OpenGL.glTexImage2Df(this.anInt6415, 0, (OpenGLXGraphicsToolkit.method5533(this.aClass55_6419, this.aClass77_6420)), i, i_3_, 0, OpenGLXGraphicsToolkit.method5532(this.aClass55_6419), 5126, fs, i_4_ * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

    public void d() {
		super.b();
	}

	public float method77(float f) {
		return f;
	}

	public void method123() {
		super.method128();
	}

	public boolean method79() {
		return false;
	}

	public void method80(boolean bool, boolean bool_7_) {
		/* empty */
	}

	public void method81(int i, int i_8_, int i_9_, int i_10_, int[] is, int i_11_, int i_12_) {
		if (i_12_ == 0)
			i_12_ = i_9_;
		this.aOpenGLJavaGraphicsToolkit_6422.method5358(this);
		if (i_9_ != i_12_)
			OpenGL.glPixelStorei(3314, i_12_);
		OpenGL.glTexSubImage2Di(this.anInt6415, 0, i, i_8_, i_9_, i_10_, 32993, this.aOpenGLJavaGraphicsToolkit_6422.anInt9841, is, i_11_);
		if (i_9_ != i_12_)
			OpenGL.glPixelStorei(3314, 0);
	}

	public void b() {
		super.b();
	}

	public void method83(int i, int i_13_, int i_14_, int i_15_, int[] is, int i_16_) {
		int[] is_17_ = new int[(this.anInt9954 * this.anInt9953)];
		this.aOpenGLJavaGraphicsToolkit_6422.method5358(this);
		OpenGL.glGetTexImagei(this.anInt6415, 0, 32993, 5121, is_17_, 0);
		for (int i_18_ = 0; i_18_ < i_15_; i_18_++)
			System.arraycopy(is_17_, ((i_13_ + (i_15_ - 1) - i_18_) * this.anInt9954), is, i_16_ + i_18_ * i_14_, i_14_);
	}

	public Interface8_Impl1_Impl1 method117(int i) {
		return new Class258(this, i);
	}

	public void method128() {
		super.method128();
	}

	public void method122(Class179 class179) {
		super.method122(class179);
	}

    public void method127(Class179 class179) {
		super.method122(class179);
	}

	public void u() {
		super.b();
	}

	public void x() {
		super.b();
	}

    Class263_Sub4(OpenGLXGraphicsToolkit openGLJavaGraphicsToolkit, Class55 class55, Class77 class77, int i, int i_24_) {
		super(openGLJavaGraphicsToolkit, 34037, class55, class77, i * i_24_, false);
		this.anInt9954 = i;
		this.anInt9953 = i_24_;
		this.aOpenGLJavaGraphicsToolkit_6422.method5358(this);
		OpenGL.glTexImage2Dub(this.anInt6415, 0, OpenGLXGraphicsToolkit.method5533((this.aClass55_6419), (this.aClass77_6420)), i, i_24_, 0, OpenGLXGraphicsToolkit.method5532(this.aClass55_6419), OpenGLXGraphicsToolkit.method5537(this.aClass77_6420), null, 0);
	}

    public void method82(int i, int i_28_, int i_29_, int i_30_, byte[] is, Class55 class55, int i_31_, int i_32_) {
		if (i_32_ == 0)
			i_32_ = i_29_;
		this.aOpenGLJavaGraphicsToolkit_6422.method5358(this);
		OpenGL.glPixelStorei(3317, 1);
		if (i_32_ != i_29_)
			OpenGL.glPixelStorei(3314, i_32_);
		OpenGL.glTexSubImage2Dub(this.anInt6415, 0, i, i_28_, i_29_, i_30_, OpenGLXGraphicsToolkit.method5532(class55), 5121, is, i_31_);
		if (i_32_ != i_29_)
			OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	Class263_Sub4(OpenGLXGraphicsToolkit openGLJavaGraphicsToolkit, int i, int i_33_, int[] is, int i_34_, int i_35_) {
		super(openGLJavaGraphicsToolkit, 34037, Class55.aClass55_557, Class77.aClass77_717, i * i_33_, false);
		this.anInt9954 = i;
		this.anInt9953 = i_33_;
		this.aOpenGLJavaGraphicsToolkit_6422.method5358(this);
		OpenGL.glPixelStorei(3314, i_35_);
		OpenGL.glTexImage2Di(this.anInt6415, 0, 6408, this.anInt9954, this.anInt9953, 0, 32993, (this.aOpenGLJavaGraphicsToolkit_6422.anInt9841), is, i_34_ * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

    public int method92() {
		return this.anInt9954;
	}

    public void method129(Class179 class179) {
		super.method122(class179);
	}

	public void method125() {
		super.method128();
	}

	public void method126() {
		super.method128();
	}

	public int method76() {
		return this.anInt9953;
	}

	public void method124(Class179 class179) {
		super.method122(class179);
	}

	public boolean method103() {
		return super.method103();
	}

	public float method78(float f) {
		return f;
	}

}
