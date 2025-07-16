package com.jagex;/* DirectXGraphicsToolkit - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.prefetch.JS5PrefetchType;
import com.jagex.maths.Matrix43f;
import com.jagex.maths.Matrix4f;
import jagdx.*;

import java.awt.*;

public class DirectXGraphicsToolkit extends NativeToolkit {
	int flags;
	boolean[] aBooleanArray9845;
	boolean aBoolean9846;
	long aLong9847;
	D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS9848;
	long aLong9849;
	int anInt9850;
	NodeCollection aClass458_9851;
	long adpater = 0L;
	long aLong9853;
	boolean aBoolean9854;
	long[] aLongArray9855;
	boolean[] aBooleanArray9856;
	boolean aBoolean9857;
	boolean[] aBooleanArray9858;
	Class179[] aClass179Array9859;
	DirectXShaderToolkit aClass110_Sub1_9860;
	Matrix4f aMatrix4f_9861;
	boolean[] aBooleanArray9862;
	long aLong9863;
	D3DCAPS aD3DCAPS9864;
	boolean aBoolean9865;
	int[] anIntArray9866;
	long aLong9867;
	float[] aFloatArray9868;
	int anInt9869;
	int anInt9870;
	int anInt9871;
	static int[] anIntArray9872 = { 77, 80 };
	static int[] anIntArray9873 = { 22, 23 };

    public static GraphicsToolkit create(Canvas canvas, MaterialRawLoader materialRawLoader, Js5FileSystem js5FileSystem, int samples) {
        GraphicsToolkit toolkit;
        try {
            boolean exists = libraryExists();
            if (!exists)
                throw new RuntimeException("");
            if (!JS5PrefetchType.getPrefetch().load("jagdx"))
                throw new RuntimeException("");
            toolkit = method5545(canvas, materialRawLoader, js5FileSystem, Integer.valueOf(samples));
        } catch (RuntimeException runtimeexception) {
            throw runtimeexception;
        } catch (Throwable throwable) {
            throw new RuntimeException("");
        }
        return toolkit;
    }

    Interface9_Impl2 method5439(Class55 class55, int i, int i_0_, boolean bool, byte[] is, int i_1_, int i_2_) {
		return new Class200_Sub3(this, class55, i, i_0_, bool, is, i_1_, i_2_);
	}

	public boolean method5483() {
		return ((this.aD3DCAPS9864.PixelShaderVersion & 0xffff) >= 257);
	}

	DirectXGraphicsToolkit(int i, int i_3_, long l, long l_4_, D3DPRESENT_PARAMETERS d3dpresent_parameters, D3DCAPS d3dcaps, MaterialRawLoader interface_ma, Js5FileSystem class243, int samples) {
		super(interface_ma, class243, samples, 0);
		this.aLong9847 = 0L;
		this.aClass458_9851 = new NodeCollection();
		this.anInt9850 = 0;
		this.aLong9853 = 0L;
		this.aLong9867 = 0L;
		this.aLong9863 = 0L;
		this.aBoolean9854 = false;
		this.aFloatArray9868 = new float[16];
		this.anInt9869 = 128;
		this.anInt9870 = 0;
		this.aLongArray9855 = new long[this.anInt9869];
		try {
			this.flags = i;
			this.anInt9871 = i_3_;
			this.adpater = l;
			this.aLong9847 = l_4_;
			this.aD3DPRESENT_PARAMETERS9848 = d3dpresent_parameters;
			this.aD3DCAPS9864 = d3dcaps;
			this.aLong9853 = D3DLIGHT.Create();
			this.aLong9867 = D3DLIGHT.Create();
			this.aLong9863 = D3DLIGHT.Create();
			anInt8347 = (this.aD3DCAPS9864.MaxSimultaneousTextures);
			anInt8348 = (this.aD3DCAPS9864.MaxActiveLights > 0 ? this.aD3DCAPS9864.MaxActiveLights : 8);
			this.aBoolean9865 = ((this.aD3DCAPS9864.TextureCaps & 0x2) == 0);
			aBoolean8365 = (this.aD3DCAPS9864.TextureCaps & 0x2000) != 0;
			this.aBoolean9857 = (this.aD3DCAPS9864.TextureCaps & 0x10000) != 0;
			this.aBoolean9846 = (this.aD3DCAPS9864.TextureCaps & 0x4000) != 0;
			aBoolean8349 = true;
			multisampled = multisample > 0 || (IDirect3D.CheckDeviceMultiSampleType(this.adpater, this.flags, this.anInt9871, (this.aD3DPRESENT_PARAMETERS9848.BackBufferFormat), true, 2)) == 0;
			this.aBooleanArray9862 = new boolean[anInt8347];
			this.aBooleanArray9856 = new boolean[anInt8347];
			this.aBooleanArray9845 = new boolean[anInt8347];
			this.aClass179Array9859 = new Class179[anInt8347];
			this.aBooleanArray9858 = new boolean[anInt8347];
			this.anIntArray9866 = new int[anInt8347];
			Matrix43f class222 = new Matrix43f();
			class222.method2065(1.0F, -1.0F, 0.5F);
			class222.translate(0.0F, 0.0F, 0.5F);
			this.aMatrix4f_9861 = new Matrix4f();
			this.aMatrix4f_9861.method2145(class222);
			IDirect3DDevice.BeginScene(this.aLong9847);
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			destroy();
			throw new RuntimeException("");
		}
	}

	void method5307() {
		for (Node class298 = this.aClass458_9851.head(); class298 != null; class298 = this.aClass458_9851.next()) {
			Class298_Sub21 class298_sub21 = (Class298_Sub21) class298;
			Context interface11 = class298_sub21.anInterface11_7315;
			interface11.method133();
			if (interface11 == frameContext)
				interface11.attach();
		}
		super.method5307();
	}

	boolean method5539() {
		int i = IDirect3DDevice.TestCooperativeLevel(this.aLong9847);
		if (i == 0 || i == -2005530519) {
			IDirect3DDevice.SetDepthStencilSurface((this.aLong9847), 0L);
			for (int i_8_ = 0; i_8_ < 4; i_8_++)
				IDirect3DDevice.SetRenderTarget((this.aLong9847), i_8_, 0L);
			for (int i_9_ = 0; i_9_ < 4; i_9_++)
				IDirect3DDevice.SetStreamSource((this.aLong9847), i_9_, 0L, 0, 0);
			for (int i_10_ = 0; i_10_ < 4; i_10_++)
				IDirect3DDevice.SetTexture((this.aLong9847), i_10_, 0L);
			IDirect3DDevice.SetIndices(this.aLong9847, 0L);
			method5306();
			this.aD3DPRESENT_PARAMETERS9848.BackBufferWidth = 0;
			this.aD3DPRESENT_PARAMETERS9848.BackBufferHeight = 0;
			if (method5551(this.flags, this.anInt9871, this.adpater, multisample, (this.aD3DPRESENT_PARAMETERS9848))) {
				int i_11_ = IDirect3DDevice.Reset((this.aLong9847), (this.aD3DPRESENT_PARAMETERS9848));
				if (jagdx.a.f(i_11_)) {
					method5307();
					method5463();
					return true;
				}
				System.exit(0);
			}
		}
		return false;
	}

	public ToolkitDesciption getDescription() {
		D3DADAPTER_IDENTIFIER d3dadapter_identifier = new D3DADAPTER_IDENTIFIER();
		IDirect3D.GetAdapterIdentifier(this.adpater, this.flags, 0, d3dadapter_identifier);
		return new ToolkitDesciption(d3dadapter_identifier.vendorID, "Direct3D", 9, d3dadapter_identifier.device, d3dadapter_identifier.driverVersion);
	}

	public void method5075() {
		long l = IDirect3DDevice.CreateEventQuery(this.aLong9847);
		if (jagdx.a.f(IDirect3DEventQuery.Issue(l))) {
			for (;;) {
				int i = IDirect3DEventQuery.IsSignaled(l);
				if (i != 1)
					break;
				Thread.yield();
			}
		}
		IUnknown.Release(l);
	}

	void method5023() {
		super.method5023();
		if (this.aLong9853 != 0L) {
			D3DLIGHT.Destroy(this.aLong9853);
			this.aLong9853 = 0L;
		}
		if (this.aLong9867 != 0L) {
			D3DLIGHT.Destroy(this.aLong9867);
			this.aLong9867 = 0L;
		}
		if (this.aLong9863 != 0L) {
			D3DLIGHT.Destroy(this.aLong9863);
			this.aLong9863 = 0L;
		}
		if (this.aLong9847 != 0L) {
			IDirect3DDevice.Destroy(this.aLong9847);
			this.aLong9847 = 0L;
		}
		if (this.adpater != 0L) {
			IUnknown.Release(this.adpater);
			this.adpater = 0L;
		}
	}

	public float method5315() {
		return -0.5F;
	}

	RenderContext createRenderFrameContext(Canvas canvas, int i, int i_15_) {
		return new DirectXJavaGraphicsContext(this, canvas, i, i_15_, false);
	}

	void method5343() {
		if (aBoolean8214) {
			float f = aBoolean8281 ? aFloat8364 : 0.0F;
			float f_16_ = aBoolean8281 ? -aFloat8293 : 0.0F;
			D3DLIGHT.SetDiffuse(this.aLong9853, f * aFloat8362, f * aFloat8289, f * aFloat8290, 0.0F);
			D3DLIGHT.SetDiffuse(this.aLong9867, f_16_ * aFloat8362, f_16_ * aFloat8289, f_16_ * aFloat8290, 0.0F);
			this.aBoolean9854 = false;
		}
	}

	Class298_Sub21 method5541(Context interface11) {
		for (Node class298 = this.aClass458_9851.head(); class298 != null; class298 = this.aClass458_9851.next()) {
			Class298_Sub21 class298_sub21 = (Class298_Sub21) class298;
			if (class298_sub21.anInterface11_7315 == interface11)
				return class298_sub21;
		}
		return null;
	}

	void method5542(Context interface11) {
		if (method5541(interface11) == null)
			this.aClass458_9851.pushBack(new Class298_Sub21(interface11));
	}

	void method5347() {
		int i;
		for (i = 0; i < anInt8296; i++) {
			Light class298_sub10 = aClass298_Sub10Array8286[i];
			int i_17_ = i + 2;
			int i_18_ = class298_sub10.method2898(-1167524098);
			float f = class298_sub10.method2901(608404512) / 255.0F;
			D3DLIGHT.SetPosition(this.aLong9863, (float) class298_sub10.method2895(823958259), (float) class298_sub10.method2894(-1488448874), (float) class298_sub10.method2897((byte) 58));
			D3DLIGHT.SetDiffuse(this.aLong9863, (float) (i_18_ >> 16 & 0xff) * f, (float) (i_18_ >> 8 & 0xff) * f, (float) (i_18_ & 0xff) * f, 0.0F);
			D3DLIGHT.SetAttenuation(this.aLong9863, 0.0F, 0.0F, 1.0F / (float) (class298_sub10.method2900(-426177774) * class298_sub10.method2900(-311447466)));
			D3DLIGHT.SetRange(this.aLong9863, (float) class298_sub10.method2900(-949255616));
			IDirect3DDevice.SetLight(this.aLong9847, i_17_, this.aLong9863);
			IDirect3DDevice.LightEnable(this.aLong9847, i_17_, true);
		}
		for (/**/; i < anInt8295; i++)
			IDirect3DDevice.LightEnable(this.aLong9847, i + 2, false);
	}

	public int[] aq(int i, int i_19_, int i_20_, int i_21_) {
		int[] is = null;
		long l = IDirect3DDevice.GetRenderTarget(this.aLong9847, 0);
		long l_22_ = IDirect3DDevice.CreateRenderTarget((this.aLong9847), i_20_, i_21_, 21, 0, 0, true);
		if (jagdx.a.f(IDirect3DDevice.StretchRect((this.aLong9847), l, i, i_19_, i_20_, i_21_, l_22_, 0, 0, i_20_, i_21_, 1))) {
			is = new int[i_20_ * i_21_];
			IDirect3DSurface.Download(l_22_, 0, 0, i_20_, i_21_, i_20_ * 4, 16, aLong8217);
			aByteBuffer8216.clear();
			aByteBuffer8216.asIntBuffer().get(is);
		}
		IUnknown.Release(l);
		IUnknown.Release(l_22_);
		return is;
	}

	public void method5176() {
		/* empty */
	}

	public void clear(int i, int i_23_) {
		IDirect3DDevice.Clear(this.aLong9847, i, i_23_, 1.0F, 0);
	}

	void method5325() {
		if (frameContext != null)
			IDirect3DDevice.SetViewport(this.aLong9847, anInt8275 + anInt8339, anInt8276 + anInt8272, anInt8273, anInt8239, aFloat8335, aFloat8258);
	}

	void method5326() {
		IDirect3DDevice.SetScissorRect(this.aLong9847, anInt8275 + anInt8265, anInt8276 + anInt8263, anInt8234, anInt8241);
	}

	void method5327() {
		IDirect3DDevice.f(this.aLong9847, 174, aBoolean8254);
	}

	public void method5300(Matrix4f matrix4f, Matrix4f matrix4f_27_, Matrix4f matrix4f_28_) {
		IDirect3DDevice.SetTransform(this.aLong9847, 256, matrix4f.aFloatArray2594);
		IDirect3DDevice.SetTransform(this.aLong9847, 2, matrix4f_27_.aFloatArray2594);
		IDirect3DDevice.SetTransform(this.aLong9847, 3, matrix4f_28_.aFloatArray2594);
	}

	void method5340() {
		IDirect3DDevice.f(this.aLong9847, 7, aBoolean8279);
	}

	void method5341() {
		if (aBoolean8214)
			IDirect3DDevice.f(this.aLong9847, 137, aBoolean8264 && !aBoolean8282);
	}

	void method5411() {
		if (aBoolean8214) {
			D3DLIGHT.SetAmbient(this.aLong9853, aFloat8362 * aFloat8291, aFloat8289 * aFloat8291, aFloat8290 * aFloat8291, 0.0F);
			this.aBoolean9854 = false;
		}
	}

	Interface9_Impl1 method5415(int i, boolean bool, int[][] is) {
		return new Class200_Sub2(this, i, bool, is);
	}

	void method5345() {
		method5343();
		method5320();
	}

	void method5320() {
		if (aBoolean8214 && !this.aBoolean9854) {
			IDirect3DDevice.LightEnable(this.aLong9847, 0, false);
			IDirect3DDevice.LightEnable(this.aLong9847, 1, false);
			IDirect3DDevice.SetLight(this.aLong9847, 0, this.aLong9853);
			IDirect3DDevice.SetLight(this.aLong9847, 1, this.aLong9867);
			IDirect3DDevice.LightEnable(this.aLong9847, 0, true);
			IDirect3DDevice.LightEnable(this.aLong9847, 1, true);
			this.aBoolean9854 = true;
		}
	}

	boolean method5348(Class55 class55, Class77 class77) {
		D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
		return (jagdx.a.f(IDirect3D.GetAdapterDisplayMode(this.adpater, this.flags, d3ddisplaymode)) && jagdx.a.f(IDirect3D.CheckDeviceFormat(this.adpater, this.flags, this.anInt9871, d3ddisplaymode.Format, 0, 3, method5546(class55, class77))));
	}

	boolean method5349(Class55 class55, Class77 class77) {
		D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
		return (jagdx.a.f(IDirect3D.GetAdapterDisplayMode(this.adpater, this.flags, d3ddisplaymode)) && jagdx.a.f(IDirect3D.CheckDeviceFormat(this.adpater, this.flags, this.anInt9871, d3ddisplaymode.Format, 0, 4, method5546(class55, class77))));
	}

	Interface9_Impl2 method5353(Class55 class55, Class77 class77, int i, int i_31_) {
		return new Class200_Sub3(this, class55, class77, i, i_31_);
	}

	Interface9_Impl2 method5355(int i, int i_32_, boolean bool, int[] is, int i_33_, int i_34_) {
		return new Class200_Sub3(this, i, i_32_, bool, is, i_33_, i_34_);
	}

	Interface9_Impl2 method5453(Class55 class55, int i, int i_35_, boolean bool, float[] fs, int i_36_, int i_37_) {
		return new Class200_Sub3(this, class55, i, i_35_, bool, fs, i_36_, i_37_);
	}

	Interface9_Impl2_Impl1 method5356(Class55 class55, Class77 class77, int i, int i_38_) {
		return new Class200_Sub3_Sub1(this, class55, class77, i, i_38_);
	}

	final void method5543(long l) {
		this.aLong9849 = l;
		IDirect3DDevice.SetVertexShader(this.aLong9847, l);
	}

	final void method5544(Class200 class200) {
		IDirect3DDevice.SetTexture(this.aLong9847, anInt8325, class200.method1894());
		if (aBoolean8214 && !this.aBooleanArray9845[anInt8325]) {
			this.aBooleanArray9845[anInt8325] = true;
			method5444();
			method5372();
		}
	}

	public void method5455(Class153 class153) {
		Class153_Sub2 class153_sub2 = (Class153_Sub2) class153;
		IDirect3DDevice.SetVertexDeclaration((this.aLong9847), (class153_sub2.aLong8623));
	}

	static GraphicsToolkit method5545(Canvas canvas, MaterialRawLoader interface_ma, Js5FileSystem class243, Integer samples) {
		DirectXGraphicsToolkit toolkit = null;
		DirectXGraphicsToolkit directXJavaGraphicsToolkit_41_;
		try {
			int i = 0;
			int i_42_ = 1;
			long l = IDirect3D.Direct3DCreate();
			D3DCAPS d3dcaps = new D3DCAPS();
			IDirect3D.GetDeviceCaps(l, i, i_42_, d3dcaps);
			if ((d3dcaps.RasterCaps & 0x1000000) == 0)
				throw new RuntimeException("");
			if (d3dcaps.MaxSimultaneousTextures < 2)
				throw new RuntimeException("");
			if ((d3dcaps.TextureOpCaps & 0x2) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.TextureOpCaps & 0x8) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.TextureOpCaps & 0x40) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.TextureOpCaps & 0x200) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.TextureOpCaps & 0x2000000) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.SrcBlendCaps & d3dcaps.DestBlendCaps & 0x10) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.SrcBlendCaps & d3dcaps.DestBlendCaps & 0x20) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.SrcBlendCaps & d3dcaps.DestBlendCaps & 0x2) == 0)
				throw new RuntimeException("");
			if (d3dcaps.MaxActiveLights > 0 && d3dcaps.MaxActiveLights < 2)
				throw new RuntimeException("");
			if (d3dcaps.MaxStreams < 5)
				throw new RuntimeException("");
			D3DPRESENT_PARAMETERS parameters = new D3DPRESENT_PARAMETERS(canvas);
			parameters.Windowed = true;
			parameters.EnableAutoDepthStencil = true;
			parameters.BackBufferWidth = canvas.getWidth();
			parameters.BackBufferHeight = canvas.getHeight();
			parameters.BackBufferCount = 1;
			parameters.PresentationInterval = -2147483648;
			if (!method5551(i, i_42_, l, samples.intValue(), parameters))
				throw new RuntimeException("");
			int i_43_ = 0;
			if ((d3dcaps.DevCaps & 0x100000) != 0)
				i_43_ |= 0x10;
			long l_44_ = 0L;
			try {
				l_44_ = IDirect3D.CreateDeviceContext(l, i, i_42_, canvas, i_43_ | 0x40, parameters);
			} catch (u var_u) {
				l_44_ = IDirect3D.CreateDeviceContext(l, i, i_42_, canvas, i_43_ & ~0x100000 | 0x20, parameters);
			}
			toolkit = new DirectXGraphicsToolkit(i, i_42_, l, l_44_, parameters, d3dcaps, interface_ma, class243, samples.intValue());
			if (!toolkit.contextsMap.containsKey(canvas)) {
				TranslatedCanvas.setIgnoreRepaint(canvas);
				toolkit.attachRenderContext(canvas, new DirectXJavaGraphicsContext(toolkit, canvas, canvas.getWidth(), canvas.getHeight(), true));
			}
			toolkit.method5003(canvas);
			toolkit.method5302();
			directXJavaGraphicsToolkit_41_ = toolkit;
		} catch (RuntimeException runtimeexception) {
			if (toolkit != null)
				toolkit.method5023();
			throw runtimeexception;
		}
		return directXJavaGraphicsToolkit_41_;
	}

	void method5422() {
		if (aBoolean8214) {
			D3DLIGHT.SetDirection(this.aLong9853, -aFloatArray8283[0], -aFloatArray8283[1], -aFloatArray8283[2]);
			D3DLIGHT.SetDirection(this.aLong9867, -aFloatArray8248[0], -aFloatArray8248[1], -aFloatArray8248[2]);
			this.aBoolean9854 = false;
		}
	}

	void method5486() {
		if (this.aLong9849 == 0L && aClass171Array8305[anInt8325] != Class171.aClass171_1742) {
			if (aClass171Array8305[anInt8325] == Class171.aClass171_1741)
				IDirect3DDevice.SetTransform(this.aLong9847, 16 + anInt8325, (aMatrix4fArray8304[anInt8325].method2166(this.aFloatArray9868)));
			else
				IDirect3DDevice.SetTransform(this.aLong9847, 16 + anInt8325, (aMatrix4fArray8304[anInt8325].method2173(this.aFloatArray9868)));
			int i = method5548(aClass171Array8305[anInt8325]);
			if (i != this.anIntArray9866[anInt8325]) {
				IDirect3DDevice.SetTextureStageState(this.aLong9847, anInt8325, 24, i);
				this.anIntArray9866[anInt8325] = i;
			}
		} else {
			IDirect3DDevice.SetTextureStageState((this.aLong9847), anInt8325, 24, 0);
			this.anIntArray9866[anInt8325] = 0;
		}
	}

	void method5371() {
		/* empty */
	}

	public EnvironmentMap method5179(EnvironmentMap class66, EnvironmentMap class66_45_, float f, EnvironmentMap class66_46_) {
		return f < 0.5F ? class66 : class66_45_;
	}

	void method5444() {
		if (aBoolean8214) {
			int i = (this.aBooleanArray9845[anInt8325] ? method5561(aClass175Array8307[anInt8325]) : 1);
			IDirect3DDevice.SetTextureStageState((this.aLong9847), anInt8325, 4, i);
		}
	}

	final void method5427(int i, Class183 class183, boolean bool, boolean bool_47_) {
		if (aBoolean8214) {
			int i_48_ = 0;
			int i_49_;
			switch (i) {
			case 1:
				i_49_ = 3;
				break;
			default:
				i_49_ = 2;
				break;
			case 2:
				i_49_ = 26;
			}
			if (bool)
				i_48_ |= 0x20;
			if (bool_47_)
				i_48_ |= 0x10;
			IDirect3DDevice.SetTextureStageState((this.aLong9847), anInt8325, i_49_, method5547(class183) | i_48_);
		}
	}

	final void method5364(int i, Class183 class183, boolean bool) {
		if (aBoolean8214) {
			int i_50_ = 0;
			int i_51_;
			switch (i) {
			case 2:
				i_51_ = 27;
				break;
			case 1:
				i_51_ = 6;
				break;
			default:
				i_51_ = 5;
			}
			if (bool)
				i_50_ |= 0x10;
			IDirect3DDevice.SetTextureStageState((this.aLong9847), anInt8325, i_51_, method5547(class183) | i_50_);
		}
	}

	final void method5369() {
		if (aBoolean8214)
			IDirect3DDevice.SetRenderState((this.aLong9847), 60, anInt8274);
	}

	static final int method5546(Class55 class55, Class77 class77) {
		switch (class77.anInt723 * -1857088243) {
		case 4:
			if (class55 == Class55.aClass55_557)
				return 113;
			break;
		case 1:
			switch (class55.anInt566 * -976336893) {
			case 2:
				return 77;
			case 1:
				return 50;
			case 9:
				return 21;
			case 5:
				return 22;
			case 0:
				return b.y * 285928237;
			case 7:
				return 28;
			case 3:
				return 51;
			case 8:
				return b.z * 368340649;
			default:
				break;
			}
			break;
		case 3:
			if (class55 == Class55.aClass55_557)
				return 116;
			break;
		}
		throw new IllegalArgumentException("");
	}

	static final int method5547(Class183 class183) {
		switch (class183.anInt1891) {
		case 0:
			return 1;
		case 1:
			return 3;
		default:
			throw new IllegalArgumentException();
		case 3:
			return 0;
		case 2:
			return 2;
		}
	}

	static final int method5548(Class171 class171) {
		switch (class171.anInt1745) {
		default:
			return 0;
		case 5:
			return 4;
		case 3:
			return 256;
		case 4:
			return 3;
		case 0:
			return 2;
		case 1:
			return 1;
		}
	}

	void method5292(int i) {
		IDirect3DDevice.SetRenderState(this.aLong9847, 168, i);
	}

	void method5375() {
		IDirect3DDevice.f(this.aLong9847, 15, aBoolean8309);
	}

	void method5376() {
		switch (aClass174_8268.anInt1764) {
		case 3:
			IDirect3DDevice.SetRenderState(this.aLong9847, 19, 2);
			IDirect3DDevice.SetRenderState(this.aLong9847, 20, 1);
			break;
		case 0:
			IDirect3DDevice.SetRenderState(this.aLong9847, 19, 5);
			IDirect3DDevice.SetRenderState(this.aLong9847, 20, 6);
			break;
		case 1:
			IDirect3DDevice.SetRenderState(this.aLong9847, 19, 2);
			IDirect3DDevice.SetRenderState(this.aLong9847, 20, 2);
			break;
		case 2:
			IDirect3DDevice.SetRenderState(this.aLong9847, 19, 9);
			IDirect3DDevice.SetRenderState(this.aLong9847, 20, 2);
			break;
		}
		switch (anInt8366) {
		case 2:
			IDirect3DDevice.SetRenderState(this.aLong9847, 207, 2);
			IDirect3DDevice.SetRenderState(this.aLong9847, 208, 2);
			break;
		case 0:
			IDirect3DDevice.SetRenderState(this.aLong9847, 207, 1);
			IDirect3DDevice.SetRenderState(this.aLong9847, 208, 1);
			break;
		case 1:
			IDirect3DDevice.SetRenderState(this.aLong9847, 207, 2);
			IDirect3DDevice.SetRenderState(this.aLong9847, 208, 1);
			break;
		}
	}

	void method5305() {
		IDirect3DDevice.f(this.aLong9847, 27, aBoolean8245);
	}

	void method5379() {
		if (aBoolean8214)
			IDirect3DDevice.f(this.aLong9847, 28, aBoolean8331 && aBoolean8278 && anInt8233 >= 0);
	}

	void method5378() {
		aFloat8336 = aFloat8308 - (float) anInt8334;
		aFloat8292 = aFloat8336 - (float) anInt8233;
		if (aFloat8292 < aFloat8261)
			aFloat8292 = aFloat8261;
		if (aBoolean8214) {
			IDirect3DDevice.a(this.aLong9847, 36, aFloat8292);
			IDirect3DDevice.a(this.aLong9847, 37, aFloat8336);
			IDirect3DDevice.SetRenderState((this.aLong9847), 34, anInt8332);
		}
	}

	void method5380(boolean bool) {
		IDirect3DDevice.f(this.aLong9847, 161, bool);
	}

	final Interface7_Impl2 method5381(boolean bool) {
		return new Class196(this, Class77.aClass77_718, bool);
	}

	final Interface7_Impl1 method5382(boolean bool) {
		return new Class193(this, bool);
	}

	Class153 method5404(Class181[] class181s) {
		return new Class153_Sub2(this, class181s);
	}

	public void method5383(int i, Interface7_Impl1 interface7_impl1) {
		Class193 class193 = (Class193) interface7_impl1;
		IDirect3DDevice.SetStreamSource(this.aLong9847, i, class193.aLong8584, 0, class193.method1861());
	}

	void method5384(Interface7_Impl2 interface7_impl2) {
		IDirect3DDevice.SetIndices(this.aLong9847, (((Class196) interface7_impl2).aLong8590));
	}

	public final void method5398(Class187 class187, int i, int i_52_) {
		if (this.aClass110_Sub1_9860 != null)
			this.aClass110_Sub1_9860.method1229();
		IDirect3DDevice.DrawPrimitive(this.aLong9847, method5567(class187), i, i_52_);
	}

	public final void method5392(Class187 class187, int i, int i_53_, int i_54_, int i_55_) {
		if (this.aClass110_Sub1_9860 != null)
			this.aClass110_Sub1_9860.method1229();
		IDirect3DDevice.DrawIndexedPrimitive((this.aLong9847), method5567(class187), 0, i, i_53_, i_54_, i_55_);
	}

	byte[] method5549(String string) {
		return method5298("dx", string);
	}

	public Class123 method5297(String string) {
		byte[] is = method5549(string);
		if (is == null)
			return null;
		Class109 class109 = method5299(is);
		return new Class123_Sub1(this, class109);
	}

	public final synchronized void clean(int i) {
		for (int i_56_ = 0; i_56_ < this.anInt9870; i_56_++)
			IUnknown.Release(this.aLongArray9855[i_56_]);
		this.anInt9870 = 0;
		super.clean(i);
	}

	void renderFrame(int i, int i_57_) throws GraphicsFrameException {
		IDirect3DDevice.EndScene(this.aLong9847);
		int i_58_ = renderContext.method580();
		if (jagdx.a.a(i_58_)) {
			if (i_58_ != -2005530520) {
				if (++this.anInt9850 > 50)
					throw new GraphicsFrameException();
			} else {
				renderContext.destroy();
				method5539();
				((DirectXJavaGraphicsContext) renderContext).method133();
			}
		} else
			this.anInt9850 = 0;
		IDirect3DDevice.BeginScene(this.aLong9847);
		if (textures != null)
			textures.method176(1832776927);
	}

	static final int method5550(Class77 class77) {
		if (class77 == Class77.aClass77_718)
			return 80;
		if (class77 == Class77.aClass77_719)
			return 77;
		throw new IllegalArgumentException("");
	}

	void method5394(int i) {
		int i_60_ = (i & 0x2) != 0 ? 2 : 3;
		IDirect3DDevice.SetRenderState(this.aLong9847, 8, i_60_);
	}

	static boolean method5551(int i, int i_61_, long l, int i_62_, D3DPRESENT_PARAMETERS d3dpresent_parameters) {
		int i_63_ = 0;
		int i_64_ = 0;
		int i_65_ = 0;
		boolean bool;
		try {
			D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
			if (jagdx.a.a(IDirect3D.GetAdapterDisplayMode(l, i, d3ddisplaymode)))
				return false;
			while_16_: for (/**/; i_62_ >= 0; i_62_--) {
				if (i_62_ != 1) {
					i_65_ = 0 + i_62_;
					for (int i_66_ = 0; i_66_ < anIntArray9873.length; i_66_++) {
						if (IDirect3D.CheckDeviceType(l, i, i_61_, d3ddisplaymode.Format, anIntArray9873[i_66_], true) == 0 && IDirect3D.CheckDeviceFormat(l, i, i_61_, (d3ddisplaymode.Format), 1, 1, (anIntArray9873[i_66_])) == 0 && (i_62_ == 0 || (IDirect3D.CheckDeviceMultiSampleType(l, i, i_61_, anIntArray9873[i_66_], true, i_65_)) == 0)) {
							for (int i_67_ = 0; i_67_ < anIntArray9872.length; i_67_++) {
								if (IDirect3D.CheckDeviceFormat(l, i, i_61_, (d3ddisplaymode.Format), 2, 1, (anIntArray9872[i_67_])) == 0 && (IDirect3D.CheckDepthStencilMatch(l, i, i_61_, d3ddisplaymode.Format, anIntArray9873[i_66_], anIntArray9872[i_67_])) == 0 && (i_62_ == 0 || (IDirect3D.CheckDeviceMultiSampleType(l, i, i_61_, anIntArray9872[i_66_], true, i_65_)) == 0)) {
									i_64_ = anIntArray9873[i_66_];
									i_63_ = anIntArray9872[i_67_];
									break while_16_;
								}
							}
						}
					}
				}
			}
			if (i_62_ < 0 || i_64_ == 0 || i_63_ == 0)
				return false;
			d3dpresent_parameters.BackBufferFormat = i_64_;
			d3dpresent_parameters.AutoDepthStencilFormat = i_63_;
			d3dpresent_parameters.MultiSampleType = i_65_;
			d3dpresent_parameters.MultiSampleQuality = 0;
			bool = true;
		} catch (Throwable throwable) {
			return false;
		}
		return bool;
	}

	synchronized void method5552(long l) {
		if (this.anInt9870 == this.anInt9869) {
			this.anInt9869 *= 2;
			long[] ls = new long[this.anInt9869];
			System.arraycopy(this.aLongArray9855, 0, ls, 0, this.anInt9870);
			this.aLongArray9855 = ls;
		}
		this.aLongArray9855[(this.anInt9870)] = l;
		this.anInt9870++;
	}

	void method5372() {
		if (aBoolean8214) {
			int i = (this.aBooleanArray9845[anInt8325] ? method5561(aClass175Array8294[anInt8325]) : 1);
			IDirect3DDevice.SetTextureStageState((this.aLong9847), anInt8325, 1, i);
		}
	}

	public FrameBufferContext method5094() {
		return new Class52_Sub1_Sub3_Sub2(this);
	}

	void method5410() {
		IDirect3DDevice.f(this.aLong9847, 14, aBoolean8277 && aBoolean8237);
	}

	public boolean method5295() {
		return ((this.aD3DCAPS9864.VertexShaderVersion & 0xffff) >= 257);
	}

	protected void finalize() {
		super.finalize();
	}

	static final int method5561(Class175 class175) {
		switch (class175.anInt1766) {
		case 3:
			return 2;
		default:
			throw new IllegalArgumentException();
		case 2:
			return 10;
		case 4:
			return 7;
		case 0:
			return 26;
		case 1:
			return 4;
		}
	}

	void method5306() {
		for (Node class298 = this.aClass458_9851.head(); class298 != null; class298 = this.aClass458_9851.next()) {
			Class298_Sub21 class298_sub21 = (Class298_Sub21) class298;
			Context interface11 = class298_sub21.anInterface11_7315;
			interface11.destroy();
		}
		super.method5306();
	}

	final void method5562(Class200_Sub3 class200_sub3) {
		method5544(class200_sub3);
		if (this.aBooleanArray9862[anInt8325] != class200_sub3.aBoolean8631) {
			IDirect3DDevice.SetSamplerState(this.aLong9847, anInt8325, 1, class200_sub3.aBoolean8631 ? 1 : 3);
			this.aBooleanArray9862[anInt8325] = class200_sub3.aBoolean8631;
		}
		if (this.aBooleanArray9856[anInt8325] != class200_sub3.aBoolean8632) {
			IDirect3DDevice.SetSamplerState(this.aLong9847, anInt8325, 2, class200_sub3.aBoolean8632 ? 1 : 3);
			this.aBooleanArray9856[anInt8325] = class200_sub3.aBoolean8632;
		}
	}

	void method5463() {
		for (int i = 0; i < anInt8347; i++) {
			IDirect3DDevice.SetSamplerState((this.aLong9847), i, 7, 2);
			IDirect3DDevice.SetSamplerState((this.aLong9847), i, 6, 2);
			IDirect3DDevice.SetSamplerState((this.aLong9847), i, 5, 2);
			IDirect3DDevice.SetSamplerState((this.aLong9847), i, 1, 1);
			IDirect3DDevice.SetSamplerState((this.aLong9847), i, 2, 1);
			this.aClass179Array9859[i] = Class179.aClass179_1812;
			boolean[] bools = this.aBooleanArray9862;
			int i_129_ = i;
			this.aBooleanArray9856[i] = true;
			bools[i_129_] = true;
			this.aBooleanArray9858[i] = false;
			this.anIntArray9866[i] = 0;
		}
		IDirect3DDevice.SetTextureStageState((this.aLong9847), 0, 6, 1);
		IDirect3DDevice.SetRenderState(this.aLong9847, 9, 2);
		IDirect3DDevice.SetRenderState(this.aLong9847, 23, 4);
		IDirect3DDevice.SetRenderState(this.aLong9847, 25, 5);
		IDirect3DDevice.SetRenderState(this.aLong9847, 24, 0);
		IDirect3DDevice.SetRenderState(this.aLong9847, 22, 2);
		IDirect3DDevice.SetRenderState(this.aLong9847, 147, 1);
		IDirect3DDevice.SetRenderState(this.aLong9847, 145, 1);
		IDirect3DDevice.a(this.aLong9847, 38, 0.95F);
		IDirect3DDevice.SetRenderState(this.aLong9847, 35, 3);
		IDirect3DDevice.a(this.aLong9847, 154, 1.0F);
		D3DLIGHT.SetType(this.aLong9853, 3);
		D3DLIGHT.SetType(this.aLong9867, 3);
		D3DLIGHT.SetType(this.aLong9863, 1);
		IDirect3DDevice.SetRenderState(this.aLong9847, 206, 1);
		this.aBoolean9854 = false;
		super.method5463();
	}

	public void method5061(boolean bool) {
		/* empty */
	}

	Interface9_Impl3 method5416(Class55 class55, int i, int i_132_, int i_133_, boolean bool, byte[] is) {
		return new Class200_Sub1(this, class55, i, i_132_, i_133_, bool, is);
	}

	final void method5564(Class200_Sub1 class200_sub1) {
		method5544(class200_sub1);
		if (!this.aBooleanArray9862[anInt8325]) {
			IDirect3DDevice.SetSamplerState((this.aLong9847), anInt8325, 1, 1);
			this.aBooleanArray9862[anInt8325] = true;
		}
		if (!this.aBooleanArray9856[anInt8325]) {
			IDirect3DDevice.SetSamplerState((this.aLong9847), anInt8325, 2, 1);
			this.aBooleanArray9856[anInt8325] = true;
		}
	}

	void method5565(Context interface11) {
		Class298_Sub21 class298_sub21 = method5541(interface11);
		if (class298_sub21 != null)
			class298_sub21.unlink();
	}

	public void method5335(Matrix4f matrix4f) {
		matrix4f.method2144(this.aMatrix4f_9861);
	}

	public void method5359() {
		if (this.aBooleanArray9845[anInt8325]) {
			this.aBooleanArray9845[anInt8325] = false;
			IDirect3DDevice.SetTexture(this.aLong9847, anInt8325, 0L);
			method5444();
			method5372();
		}
	}

	public Interface8_Impl1_Impl2 method5186(int i, int i_155_) {
		return new Class199(this, Class77.aClass77_719, i, i_155_);
	}

	final void method5566(long l) {
		IDirect3DDevice.SetPixelShader(this.aLong9847, l);
	}

	static final int method5567(Class187 class187) {
		switch (class187.anInt1909) {
		case 1:
			return 6;
		case 0:
			return 1;
		case 2:
			return 2;
		case 5:
			return 4;
		case 4:
			return 3;
		case 3:
			return 5;
		default:
			throw new IllegalArgumentException("");
		}
	}

}
