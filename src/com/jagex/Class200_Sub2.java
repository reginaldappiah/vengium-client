package com.jagex;/* Class200_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jagdx.IDirect3DCubeTexture;
import jagdx.IDirect3DDevice;

import java.nio.ByteBuffer;

public class Class200_Sub2 extends Class200 implements Interface9_Impl1 {
	int anInt8628;

	public void method122(Class179 class179) {
		super.method122(class179);
	}

	public void method128() {
		this.aDirectXJavaGraphicsToolkit_6410.method5544(this);
	}

	public void b() {
		super.b();
	}

	public void method126() {
		this.aDirectXJavaGraphicsToolkit_6410.method5544(this);
	}

	public void d() {
		super.b();
	}

	public void method125() {
		this.aDirectXJavaGraphicsToolkit_6410.method5544(this);
	}

	Class200_Sub2(DirectXGraphicsToolkit directXJavaGraphicsToolkit, int i, boolean bool, int[][] is) {
		super(directXJavaGraphicsToolkit, Class55.aClass55_557, Class77.aClass77_717, bool && directXJavaGraphicsToolkit.aBoolean9857, i * i * 6);
		this.anInt8628 = i;
		if (this.aBoolean6406)
			this.aLong6407 = (IDirect3DDevice.CreateCubeTexture((this.aDirectXJavaGraphicsToolkit_6410.aLong9847), this.anInt8628, 0, 1024, 21, 1));
		else
			this.aLong6407 = (IDirect3DDevice.CreateCubeTexture((this.aDirectXJavaGraphicsToolkit_6410.aLong9847), this.anInt8628, 1, 0, 21, 1));
		ByteBuffer bytebuffer = this.aDirectXJavaGraphicsToolkit_6410.aByteBuffer8216;
		for (int i_0_ = 0; i_0_ < 6; i_0_++) {
			bytebuffer.clear();
			bytebuffer.asIntBuffer().put(is[i_0_]);
			IDirect3DCubeTexture.Upload(this.aLong6407, i_0_, 0, 0, 0, this.anInt8628, this.anInt8628, this.anInt8628 * 4, 0, (this.aDirectXJavaGraphicsToolkit_6410.aLong8217));
		}
	}

	public void x() {
		super.b();
	}

	public void u() {
		super.b();
	}

	public void method123() {
		this.aDirectXJavaGraphicsToolkit_6410.method5544(this);
	}

	public void method127(Class179 class179) {
		super.method122(class179);
	}

	public void method124(Class179 class179) {
		super.method122(class179);
	}

	public void method129(Class179 class179) {
		super.method122(class179);
	}
}
