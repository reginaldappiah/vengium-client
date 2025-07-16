package com.jagex;/* DirectXJavaGraphicsContext - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DSwapChain;
import jagdx.IUnknown;

import java.awt.*;

public class DirectXJavaGraphicsContext extends JavaGraphicsContext implements Context {
	boolean aBoolean9955;
	Canvas canvas;
	long aLong9957;
	DirectXGraphicsToolkit aDirectXJavaGraphicsToolkit_9958;
	boolean aBoolean9959 = false;
	int width;
	int height;
	long aLong9962;
	long aLong9963;
	D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS9964;

	void updateDimension(int width, int height) {
		destroy();
		this.width = width;
		this.height = height;
		if (this.aBoolean9955)
			this.aDirectXJavaGraphicsToolkit_9958.method5539();
		method133();
		super.updateDimension(width, height);
	}

	public void method133() {
		destroy();
		this.aD3DPRESENT_PARAMETERS9964 = new D3DPRESENT_PARAMETERS(this.canvas);
		this.aD3DPRESENT_PARAMETERS9964.Windowed = true;
		this.aD3DPRESENT_PARAMETERS9964.BackBufferCount = 1;
		this.aD3DPRESENT_PARAMETERS9964.BackBufferWidth = this.width;
		this.aD3DPRESENT_PARAMETERS9964.BackBufferHeight = this.height;
		if (this.aBoolean9955) {
			this.aLong9957 = IDirect3DDevice.GetSwapChain((this.aDirectXJavaGraphicsToolkit_9958.aLong9847), 0);
			this.aLong9963 = IDirect3DSwapChain.GetBackBuffer(this.aLong9957, 0, 0);
			this.aLong9962 = (IDirect3DDevice.GetDepthStencilSurface(this.aDirectXJavaGraphicsToolkit_9958.aLong9847));
		} else {
			if (!DirectXGraphicsToolkit.method5551(this.aDirectXJavaGraphicsToolkit_9958.flags, this.aDirectXJavaGraphicsToolkit_9958.anInt9871, this.aDirectXJavaGraphicsToolkit_9958.adpater, (this.aDirectXJavaGraphicsToolkit_9958.multisample), this.aD3DPRESENT_PARAMETERS9964))
				throw new RuntimeException();
			int i = (this.aD3DPRESENT_PARAMETERS9964.AutoDepthStencilFormat);
			this.aLong9957 = (IDirect3DDevice.CreateAdditionalSwapChain((this.aDirectXJavaGraphicsToolkit_9958.aLong9847), (this.aD3DPRESENT_PARAMETERS9964)));
			this.aLong9963 = IDirect3DSwapChain.GetBackBuffer(this.aLong9957, 0, 0);
			this.aLong9962 = (IDirect3DDevice.CreateDepthStencilSurface((this.aDirectXJavaGraphicsToolkit_9958.aLong9847), this.width, this.height, i, (this.aD3DPRESENT_PARAMETERS9964.MultiSampleType), (this.aD3DPRESENT_PARAMETERS9964.MultiSampleQuality), false));
		}
		if (this.aBoolean9959)
			attach();
	}

	public int getHeight() {
		return this.height;
	}

	public int method581(int i, int i_1_) {
		return IDirect3DSwapChain.Present(this.aLong9957, 0);
	}

	public int method580() {
		return IDirect3DSwapChain.Present(this.aLong9957, 0);
	}

	public int getWidth() {
		return this.width;
	}

	DirectXJavaGraphicsContext(DirectXGraphicsToolkit directXJavaGraphicsToolkit, Canvas canvas, int width, int height, boolean bool) {
		super(directXJavaGraphicsToolkit);
		this.aBoolean9955 = false;
		this.canvas = canvas;
		this.aDirectXJavaGraphicsToolkit_9958 = directXJavaGraphicsToolkit;
		this.width = width;
		this.height = height;
		this.aBoolean9955 = bool;
		method133();
		this.aDirectXJavaGraphicsToolkit_9958.method5542(this);
	}

	public boolean attach() {
		this.aBoolean9959 = true;
		if (jagdx.a.a(IDirect3DDevice.SetRenderTarget((this.aDirectXJavaGraphicsToolkit_9958.aLong9847), 0, this.aLong9963)))
			return false;
		if (jagdx.a.a(IDirect3DDevice.SetDepthStencilSurface((this.aDirectXJavaGraphicsToolkit_9958.aLong9847), this.aLong9962)))
			return false;
		return super.attach();
	}

	boolean detach() {
		this.aBoolean9959 = false;
		return jagdx.a.f(IDirect3DDevice.SetDepthStencilSurface(this.aDirectXJavaGraphicsToolkit_9958.aLong9847, 0L));
	}

	public void destroy() {
		if (this.aLong9963 != 0L) {
			IUnknown.Release(this.aLong9963);
			this.aLong9963 = 0L;
		}
		if (this.aLong9962 != 0L) {
			IUnknown.Release(this.aLong9962);
			this.aLong9962 = 0L;
		}
		if (this.aLong9957 != 0L) {
			IUnknown.Release(this.aLong9957);
			this.aLong9957 = 0L;
		}
		this.aDirectXJavaGraphicsToolkit_9958.method5565(this);
	}

}
