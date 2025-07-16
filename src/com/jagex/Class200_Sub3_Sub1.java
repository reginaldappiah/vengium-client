package com.jagex;/* Class200_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DSurface;
import jagdx.IDirect3DTexture;
import jagdx.IUnknown;

public class Class200_Sub3_Sub1 extends Class200_Sub3 implements Interface9_Impl2_Impl1 {

    public Interface8_Impl1_Impl1 method117(int i) {
		return new Class192(this, i);
	}

	public void method83(int i, int i_0_, int i_1_, int i_2_, int[] is, int i_3_) {
		long l = IDirect3DTexture.GetSurfaceLevel(this.aLong6407, 0);
		long l_4_ = IDirect3DDevice.CreateRenderTarget((this.aDirectXJavaGraphicsToolkit_6410.aLong9847), i_1_, i_2_, 21, 0, 0, true);
		if (jagdx.a.f(IDirect3DDevice.StretchRect((this.aDirectXJavaGraphicsToolkit_6410.aLong9847), l, i, i_0_, i_1_, i_2_, l_4_, 0, 0, i_1_, i_2_, 1))) {
			IDirect3DSurface.Download(l_4_, 0, 0, i_1_, i_2_, i_1_ * 4, 16, (this.aDirectXJavaGraphicsToolkit_6410.aLong8217));
			this.aDirectXJavaGraphicsToolkit_6410.aByteBuffer8216.clear();
			this.aDirectXJavaGraphicsToolkit_6410.aByteBuffer8216.asIntBuffer().get(is);
		}
		IUnknown.Release(l);
		IUnknown.Release(l_4_);
	}

	public int method92() {
		return super.method92();
	}

	public int method76() {
		return super.method76();
	}

	public void method129(Class179 class179) {
		super.method122(class179);
	}

	public float method78(float f) {
		return super.method78(f);
	}

	public boolean method79() {
		return super.method79();
	}

	public void method81(int i, int i_5_, int i_6_, int i_7_, int[] is, int i_8_, int i_9_) {
		super.method81(i, i_5_, i_6_, i_7_, is, i_8_, i_9_);
	}

    public void method128() {
		super.method128();
	}

	public void method122(Class179 class179) {
		super.method122(class179);
	}

	public void b() {
		super.b();
	}

	public void method82(int i, int i_15_, int i_16_, int i_17_, byte[] is, Class55 class55, int i_18_, int i_19_) {
		super.method82(i, i_15_, i_16_, i_17_, is, class55, i_18_, i_19_);
	}

    public void x() {
		super.b();
	}

    public float method77(float f) {
		return super.method77(f);
	}

	public void method123() {
		super.method128();
	}

	public void d() {
		super.b();
	}

    public boolean method103() {
		return super.method103();
	}

    public void method80(boolean bool, boolean bool_30_) {
		super.method80(bool, bool_30_);
	}

    public void method125() {
		super.method128();
	}

	public void u() {
		super.b();
	}

    public void method126() {
		super.method128();
	}

    public void method127(Class179 class179) {
		super.method122(class179);
	}

	public void method124(Class179 class179) {
		super.method122(class179);
	}

	Class200_Sub3_Sub1(DirectXGraphicsToolkit directXJavaGraphicsToolkit, Class55 class55, Class77 class77, int i, int i_56_) {
		super(directXJavaGraphicsToolkit, class55, class77, i, i_56_, 1025, 0);
	}

}
