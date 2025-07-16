package com.jagex;/* Class47_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class47_Sub7 extends Class47 {
	static char aChar6794 = '\001';
	boolean aBoolean6795 = false;
	Class28 aClass28_6796;
	static char aChar6797 = '\0';

    boolean method501() {
		return true;
	}

	void method505(boolean bool) {
		Class30_Sub1 class30_sub1 = this.openGLGraphicsToolkit.method5280();
		if (this.aClass28_6796 != null && class30_sub1 != null && bool) {
			this.aClass28_6796.method404('\0');
			this.openGLGraphicsToolkit.method5255(1);
			this.openGLGraphicsToolkit.method5256(class30_sub1);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadMatrixf((this.openGLGraphicsToolkit.aMatrix4f_8089.method2160(this.openGLGraphicsToolkit.aFloatArray8106)), 0);
			OpenGL.glMatrixMode(5888);
			this.openGLGraphicsToolkit.method5255(0);
			this.aBoolean6795 = true;
		} else
			this.openGLGraphicsToolkit.method5286(0, 34168, 770);
	}

	void method518(boolean bool) {
		this.openGLGraphicsToolkit.method5258(8448, 7681);
	}

    void method503(int i, int i_0_) {
		/* empty */
	}

	void method500(Class30 class30, int i) {
		this.openGLGraphicsToolkit.method5256(class30);
		this.openGLGraphicsToolkit.method5243(i);
	}

    Class47_Sub7(OpenGLGraphicsToolkit class_ra_sub2) {
		super(class_ra_sub2);
		if (class_ra_sub2.aBoolean8178) {
			this.aClass28_6796 = new Class28(class_ra_sub2, 2);
			this.aClass28_6796.method405(0);
			this.openGLGraphicsToolkit.method5255(1);
			this.openGLGraphicsToolkit.method5258(34165, 7681);
			this.openGLGraphicsToolkit.method5259(2, 34168, 770);
			this.openGLGraphicsToolkit.method5286(0, 34167, 770);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			this.openGLGraphicsToolkit.method5255(0);
			this.aClass28_6796.method403();
			this.aClass28_6796.method405(1);
			this.openGLGraphicsToolkit.method5255(1);
			this.openGLGraphicsToolkit.method5258(8448, 8448);
			this.openGLGraphicsToolkit.method5259(2, 34166, 770);
			this.openGLGraphicsToolkit.method5286(0, 5890, 770);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.openGLGraphicsToolkit.method5255(0);
			this.aClass28_6796.method403();
		}
	}

    void method504() {
		if (this.aBoolean6795) {
			this.aClass28_6796.method404('\001');
			this.openGLGraphicsToolkit.method5255(1);
			this.openGLGraphicsToolkit.method5256(null);
			this.openGLGraphicsToolkit.method5255(0);
		} else
			this.openGLGraphicsToolkit.method5286(0, 5890, 770);
		this.openGLGraphicsToolkit.method5258(8448, 8448);
		this.aBoolean6795 = false;
	}

}
