package com.jagex;/* Class33 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class33 implements Interface8_Impl1_Impl1_Impl2 {
	int anInt10161;
	int anInt10162;
	Class30_Sub1 aClass30_Sub1_10163;

	Class33(Class30_Sub1 class30_sub1, int i, int i_0_) {
		this.anInt10162 = i_0_;
		this.aClass30_Sub1_10163 = class30_sub1;
		this.anInt10161 = i;
	}

	public void method1(int i) {
		OpenGL.glFramebufferTexture2DEXT(36160, i, this.anInt10161, this.aClass30_Sub1_10163.anInt376, this.anInt10162);
	}

	public int i() {
		return this.aClass30_Sub1_10163.anInt6745;
	}

	public void method3(int i) {
		OpenGL.glFramebufferTexture2DEXT(36160, i, this.anInt10161, this.aClass30_Sub1_10163.anInt376, this.anInt10162);
	}

	public void b() {
		/* empty */
	}

	public int p() {
		return this.aClass30_Sub1_10163.anInt6745;
	}

	public int f() {
		return this.aClass30_Sub1_10163.anInt6745;
	}

	public int k() {
		return this.aClass30_Sub1_10163.anInt6745;
	}

	public void d() {
		/* empty */
	}

	public void u() {
		/* empty */
	}

	public void x() {
		/* empty */
	}

	public void method2(int i) {
		OpenGL.glFramebufferTexture2DEXT(36160, i, this.anInt10161, this.aClass30_Sub1_10163.anInt376, this.anInt10162);
	}

	public int a() {
		return this.aClass30_Sub1_10163.anInt6745;
	}

	public void method4(int i) {
		OpenGL.glFramebufferTexture2DEXT(36160, i, this.anInt10161, this.aClass30_Sub1_10163.anInt376, this.anInt10162);
	}
}
