package com.jagex;/* Class200_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVolumeTexture;

import java.nio.ByteBuffer;

public class Class200_Sub1 extends Class200 implements Interface9_Impl3 {
	int anInt8625;
	int anInt8626;
	int anInt8627;

	long method1894() {
		return this.aLong6407;
	}

	Class200_Sub1(DirectXGraphicsToolkit directXJavaGraphicsToolkit, Class55 class55, int i, int i_0_, int i_1_, boolean bool, byte[] is) {
		super(directXJavaGraphicsToolkit, class55, Class77.aClass77_717, false, i * i_0_ * i_1_);
		this.anInt8625 = i;
		this.anInt8626 = i_0_;
		this.anInt8627 = i_1_;
		this.aLong6407 = (IDirect3DDevice.CreateVolumeTexture(this.aDirectXJavaGraphicsToolkit_6410.aLong9847, i, i_0_, i_1_, 1, 0, DirectXGraphicsToolkit.method5546(class55, this.aClass77_6408), 1));
		ByteBuffer bytebuffer = this.aDirectXJavaGraphicsToolkit_6410.aByteBuffer8216;
		bytebuffer.clear();
		bytebuffer.put(is);
		IDirect3DVolumeTexture.Upload(this.aLong6407, 0, 0, 0, 0, this.anInt8625, this.anInt8626, this.anInt8627, (this.anInt8625 * (class55.anInt556 * 845115459)), 0, (this.aDirectXJavaGraphicsToolkit_6410.aLong8217));
	}

	public void method126() {
		this.aDirectXJavaGraphicsToolkit_6410.method5564(this);
	}

	public void method127(Class179 class179) {
		super.method122(class179);
	}

	public void b() {
		super.b();
	}

	public void d() {
		super.b();
	}

	public void u() {
		super.b();
	}

	public void x() {
		super.b();
	}

	public void method125() {
		this.aDirectXJavaGraphicsToolkit_6410.method5564(this);
	}

	public void method128() {
		this.aDirectXJavaGraphicsToolkit_6410.method5564(this);
	}

	public void method123() {
		this.aDirectXJavaGraphicsToolkit_6410.method5564(this);
	}

	long method1896() {
		return this.aLong6407;
	}

	public void method124(Class179 class179) {
		super.method122(class179);
	}

	public void method129(Class179 class179) {
		super.method122(class179);
	}

	public void method122(Class179 class179) {
		super.method122(class179);
	}

	long method1897() {
		return this.aLong6407;
	}
}
