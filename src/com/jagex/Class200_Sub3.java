package com.jagex;/* Class200_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jagdx.IDirect3DDevice;
import jagdx.IDirect3DTexture;

import java.nio.ByteBuffer;

public class Class200_Sub3 extends Class200 implements Interface9_Impl2 {
	int anInt8629;
	int anInt8630;
	boolean aBoolean8631;
	boolean aBoolean8632;

    public boolean method103() {
		return false;
	}

	Class200_Sub3(DirectXGraphicsToolkit directXJavaGraphicsToolkit, int i, int i_0_, boolean bool, int[] is, int i_1_, int i_2_) {
		super(directXJavaGraphicsToolkit, Class55.aClass55_557, Class77.aClass77_717, bool && directXJavaGraphicsToolkit.aBoolean9846, i * i_0_);
		if (!this.aDirectXJavaGraphicsToolkit_6410.aBoolean9865) {
			this.anInt8629 = LinkedList.getNextBitValue(i);
			this.anInt8630 = LinkedList.getNextBitValue(i_0_);
		} else {
			this.anInt8629 = i;
			this.anInt8630 = i_0_;
		}
		if (bool)
			this.aLong6407 = (IDirect3DDevice.CreateTexture((this.aDirectXJavaGraphicsToolkit_6410.aLong9847), this.anInt8629, this.anInt8630, 0, 1024, 21, 1));
		else
			this.aLong6407 = (IDirect3DDevice.CreateTexture((this.aDirectXJavaGraphicsToolkit_6410.aLong9847), this.anInt8629, this.anInt8630, 1, 0, 21, 1));
		if (i_2_ == 0)
			i_2_ = i;
		ByteBuffer bytebuffer = this.aDirectXJavaGraphicsToolkit_6410.aByteBuffer8216;
		bytebuffer.clear();
		bytebuffer.asIntBuffer().put(is, i_1_, i_2_ * i_0_);
		IDirect3DTexture.Upload(this.aLong6407, 0, 0, 0, i, i_0_, i_2_ * (this.aClass55_6409.anInt556 * 845115459), 0, this.aDirectXJavaGraphicsToolkit_6410.aLong8217);
	}

	Class200_Sub3(DirectXGraphicsToolkit directXJavaGraphicsToolkit, Class55 class55, int i, int i_3_, boolean bool, byte[] is, int i_4_, int i_5_) {
		super(directXJavaGraphicsToolkit, class55, Class77.aClass77_717, bool && directXJavaGraphicsToolkit.aBoolean9846, i * i_3_);
		if (!this.aDirectXJavaGraphicsToolkit_6410.aBoolean9865) {
			this.anInt8629 = LinkedList.getNextBitValue(i);
			this.anInt8630 = LinkedList.getNextBitValue(i_3_);
		} else {
			this.anInt8629 = i;
			this.anInt8630 = i_3_;
		}
		if (bool)
			this.aLong6407 = (IDirect3DDevice.CreateTexture((this.aDirectXJavaGraphicsToolkit_6410.aLong9847), this.anInt8629, this.anInt8630, 0, 1024, DirectXGraphicsToolkit.method5546((this.aClass55_6409), Class77.aClass77_717), 1));
		else
			this.aLong6407 = (IDirect3DDevice.CreateTexture((this.aDirectXJavaGraphicsToolkit_6410.aLong9847), this.anInt8629, this.anInt8630, 1, 0, DirectXGraphicsToolkit.method5546((this.aClass55_6409), Class77.aClass77_717), 1));
		if (i_5_ == 0)
			i_5_ = i;
		ByteBuffer bytebuffer = this.aDirectXJavaGraphicsToolkit_6410.aByteBuffer8216;
		bytebuffer.clear();
		Class55 class55_6_ = this.aClass55_6409;
		if (this.aClass55_6409 != null) {
			/* empty */
		}
		if (class55_6_ == Class55.aClass55_564) {
			bytebuffer.put(is, i_4_, i_3_ * i / 2);
			IDirect3DTexture.Upload(this.aLong6407, 0, 0, 0, i, i_3_ / 4, i / 4 * 8, 0, (this.aDirectXJavaGraphicsToolkit_6410.aLong8217));
		} else {
			Class55 class55_7_ = this.aClass55_6409;
			if (this.aClass55_6409 != null) {
				/* empty */
			}
			if (class55_7_ == Class55.aClass55_558) {
				bytebuffer.put(is, i_4_, i_3_ * i);
				IDirect3DTexture.Upload(this.aLong6407, 0, 0, 0, i, i_3_ / 4, i / 4 * 16, 0, (this.aDirectXJavaGraphicsToolkit_6410.aLong8217));
			} else {
				bytebuffer.put(is, i_4_, i_5_ * i_3_);
				IDirect3DTexture.Upload(this.aLong6407, 0, 0, 0, i, i_3_, i_5_ * ((this.aClass55_6409.anInt556) * 845115459), 0, (this.aDirectXJavaGraphicsToolkit_6410.aLong8217));
			}
		}
	}

	Class200_Sub3(DirectXGraphicsToolkit directXJavaGraphicsToolkit, Class55 class55, int i, int i_8_, boolean bool, float[] fs, int i_9_, int i_10_) {
		super(directXJavaGraphicsToolkit, class55, Class77.aClass77_717, bool && directXJavaGraphicsToolkit.aBoolean9846, i * i_8_);
		if (!this.aDirectXJavaGraphicsToolkit_6410.aBoolean9865) {
			this.anInt8629 = LinkedList.getNextBitValue(i);
			this.anInt8630 = LinkedList.getNextBitValue(i_8_);
		} else {
			this.anInt8629 = i;
			this.anInt8630 = i_8_;
		}
		if (bool)
			this.aLong6407 = (IDirect3DDevice.CreateTexture((this.aDirectXJavaGraphicsToolkit_6410.aLong9847), this.anInt8629, this.anInt8630, 0, 1024, DirectXGraphicsToolkit.method5546((this.aClass55_6409), Class77.aClass77_721), 1));
		else
			this.aLong6407 = (IDirect3DDevice.CreateTexture((this.aDirectXJavaGraphicsToolkit_6410.aLong9847), this.anInt8629, this.anInt8630, 1, 0, DirectXGraphicsToolkit.method5546((this.aClass55_6409), Class77.aClass77_721), 1));
		if (i_10_ == 0)
			i_10_ = i;
		ByteBuffer bytebuffer = this.aDirectXJavaGraphicsToolkit_6410.aByteBuffer8216;
		bytebuffer.clear();
		bytebuffer.asFloatBuffer().put(fs, i_9_, i_10_ * i_8_ * ((this.aClass55_6409.anInt556) * 845115459));
		IDirect3DTexture.Upload(this.aLong6407, 0, 0, 0, i, i_8_, i_10_ * (this.aClass55_6409.anInt556 * 845115459) * 4, 0, this.aDirectXJavaGraphicsToolkit_6410.aLong8217);
	}

	public int method92() {
		return this.anInt8629;
	}

	public void method126() {
		this.aDirectXJavaGraphicsToolkit_6410.method5562(this);
	}

	public float method77(float f) {
		return f / (float) this.anInt8629;
	}

	public float method78(float f) {
		return f / (float) this.anInt8630;
	}

    long method1894() {
		return this.aLong6407;
	}

	public boolean method79() {
		return true;
	}

	public void method80(boolean bool, boolean bool_12_) {
		this.aBoolean8631 = bool;
		this.aBoolean8632 = bool_12_;
	}

    public void method82(int i, int i_18_, int i_19_, int i_20_, byte[] is, Class55 class55, int i_21_, int i_22_) {
		if (this.aClass55_6409 != class55 || this.aClass77_6408 != Class77.aClass77_717)
			throw new RuntimeException();
		if (i_22_ == 0)
			i_22_ = i_19_;
		ByteBuffer bytebuffer = this.aDirectXJavaGraphicsToolkit_6410.aByteBuffer8216;
		bytebuffer.clear();
		bytebuffer.put(is, i_21_, i_22_ * i_20_);
		IDirect3DTexture.Upload(this.aLong6407, 0, i, i_18_, i_19_, i_20_, i_22_ * (this.aClass55_6409.anInt556 * 845115459), 0, this.aDirectXJavaGraphicsToolkit_6410.aLong8217);
	}

	public void method83(int i, int i_23_, int i_24_, int i_25_, int[] is, int i_26_) {
		if (this.aClass55_6409 != Class55.aClass55_557 || this.aClass77_6408 != Class77.aClass77_717)
			throw new RuntimeException();
		ByteBuffer bytebuffer = this.aDirectXJavaGraphicsToolkit_6410.aByteBuffer8216;
		bytebuffer.clear();
		IDirect3DTexture.Download(this.aLong6407, 0, i, i_23_, i_24_, i_25_, i_24_ * 4, 0, (this.aDirectXJavaGraphicsToolkit_6410.aLong8217));
		bytebuffer.asIntBuffer().get(is, i_26_, i_24_ * i_25_);
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

	long method1898() {
		return this.aLong6407;
	}

    public void method127(Class179 class179) {
		super.method122(class179);
	}

    public void method129(Class179 class179) {
		super.method122(class179);
	}

	public void method128() {
		this.aDirectXJavaGraphicsToolkit_6410.method5562(this);
	}

    Class200_Sub3(DirectXGraphicsToolkit directXJavaGraphicsToolkit, Class55 class55, Class77 class77, int i, int i_38_) {
		this(directXJavaGraphicsToolkit, class55, class77, i, i_38_, 0, 1);
	}

	public int method76() {
		return this.anInt8630;
	}

	public void method122(Class179 class179) {
		super.method122(class179);
	}

    Class200_Sub3(DirectXGraphicsToolkit directXJavaGraphicsToolkit, Class55 class55, Class77 class77, int i, int i_54_, int i_55_, int i_56_) {
		super(directXJavaGraphicsToolkit, class55, class77, false, i * i_54_);
		if (!this.aDirectXJavaGraphicsToolkit_6410.aBoolean9865) {
			this.anInt8629 = LinkedList.getNextBitValue(i);
			this.anInt8630 = LinkedList.getNextBitValue(i_54_);
		} else {
			this.anInt8629 = i;
			this.anInt8630 = i_54_;
		}
		this.aLong6407 = (IDirect3DDevice.CreateTexture(this.aDirectXJavaGraphicsToolkit_6410.aLong9847, i, i_54_, 0, i_55_, DirectXGraphicsToolkit.method5546((this.aClass55_6409), (this.aClass77_6408)), i_56_));
	}

    public void method125() {
		this.aDirectXJavaGraphicsToolkit_6410.method5562(this);
	}

	public void x() {
		super.b();
	}

	public void method123() {
		this.aDirectXJavaGraphicsToolkit_6410.method5562(this);
	}

    public void method124(Class179 class179) {
		super.method122(class179);
	}

	public void method81(int i, int i_63_, int i_64_, int i_65_, int[] is, int i_66_, int i_67_) {
		if (this.aClass55_6409 != Class55.aClass55_557 || this.aClass77_6408 != Class77.aClass77_717)
			throw new RuntimeException();
		if (i_67_ == 0)
			i_67_ = i_64_;
		ByteBuffer bytebuffer = this.aDirectXJavaGraphicsToolkit_6410.aByteBuffer8216;
		bytebuffer.clear();
		bytebuffer.asIntBuffer().put(is, i_66_, i_67_ * i_65_);
		IDirect3DTexture.Upload(this.aLong6407, 0, i, i_63_, i_64_, i_65_, i_67_ * (this.aClass55_6409.anInt556 * 845115459), 0, this.aDirectXJavaGraphicsToolkit_6410.aLong8217);
	}

    long method1899() {
		return this.aLong6407;
	}

}
