package com.jagex;/* Class52_Sub1_Sub3_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DDevice;

public class Class52_Sub1_Sub3_Sub2 extends Class52_Sub1_Sub3 {
	boolean aBoolean9978;
	Interface8_Impl1_Impl1_Impl1[] anInterface8_Impl1_Impl1_Impl1Array9979;
	int anInt9980;
	int anInt9981;
	int anInt9982;
	DirectXGraphicsToolkit aDirectXJavaGraphicsToolkit_9983;
	Interface8_Impl1_Impl2_Impl1 anInterface8_Impl1_Impl2_Impl1_9984 = null;
	static int anInt9985 = 16;

	boolean method576(long l) {
		return jagdx.a.f(IDirect3DDevice.SetDepthStencilSurface(this.aDirectXJavaGraphicsToolkit_9983.aLong9847, l));
	}

	public int getWidth() {
		return this.anInt9980;
	}

	public int getHeight() {
		return this.anInt9981;
	}

	public void method558(Interface8_Impl1_Impl2 interface8_impl1_impl2) {
		Interface8_Impl1_Impl2_Impl1 interface8_impl1_impl2_impl1 = (Interface8_Impl1_Impl2_Impl1) interface8_impl1_impl2;
		if (interface8_impl1_impl2 != null) {
			if (this.anInt9982 != 0) {
				if ((this.anInt9980 != interface8_impl1_impl2_impl1.a()) || (this.anInt9981 != interface8_impl1_impl2_impl1.f()))
					throw new RuntimeException();
			} else {
				this.anInt9981 = interface8_impl1_impl2_impl1.f();
				this.anInt9980 = interface8_impl1_impl2_impl1.a();
				method573();
			}
			this.anInt9982 |= 0x10;
			this.anInterface8_Impl1_Impl2_Impl1_9984 = interface8_impl1_impl2_impl1;
			if (this.aBoolean9978)
				method576(interface8_impl1_impl2_impl1.method144());
		} else {
			this.anInt9982 &= ~0x10;
			this.anInterface8_Impl1_Impl2_Impl1_9984 = null;
			if (this.aBoolean9978)
				method576(0L);
			if (this.anInt9982 == 0) {
				this.anInt9981 = 0;
				this.anInt9980 = 0;
			}
		}
	}

	public void method563(int i, Interface8_Impl1_Impl1 interface8_impl1_impl1) {
		int i_0_ = 1 << i;
		Interface8_Impl1_Impl1_Impl1 interface8_impl1_impl1_impl1 = (Interface8_Impl1_Impl1_Impl1) interface8_impl1_impl1;
		if (interface8_impl1_impl1 != null) {
			if (this.anInt9982 != 0) {
				if ((this.anInt9980 != interface8_impl1_impl1_impl1.a()) || (this.anInt9981 != interface8_impl1_impl1_impl1.f()))
					throw new RuntimeException();
			} else {
				this.anInt9981 = interface8_impl1_impl1_impl1.f();
				this.anInt9980 = interface8_impl1_impl1_impl1.a();
				method573();
			}
			this.anInt9982 |= i_0_;
			this.anInterface8_Impl1_Impl1_Impl1Array9979[i] = interface8_impl1_impl1_impl1;
			if (this.aBoolean9978)
				method578(i, interface8_impl1_impl1_impl1.method144());
		} else {
			this.anInt9982 &= i_0_ ^ 0xffffffff;
			this.anInterface8_Impl1_Impl1_Impl1Array9979[i] = null;
			if (this.aBoolean9978)
				method578(i, 0L);
			if (this.anInt9982 == 0) {
				this.anInt9981 = 0;
				this.anInt9980 = 0;
			}
		}
	}

    public boolean method560() {
		return ((this.anInterface8_Impl1_Impl1_Impl1Array9979[0]) != null);
	}

	boolean detach() {
		for (int i = 1; i < 4; i++) {
			Interface8_Impl1_Impl1_Impl1 interface8_impl1_impl1_impl1 = (this.anInterface8_Impl1_Impl1_Impl1Array9979[i]);
			if (interface8_impl1_impl1_impl1 != null)
				method578(i, 0L);
		}
		if (this.anInterface8_Impl1_Impl2_Impl1_9984 != null)
			method576(0L);
		this.aBoolean9978 = false;
		return true;
	}

	public void destroy() {
		if (this.anInterface8_Impl1_Impl2_Impl1_9984 != null)
			this.anInterface8_Impl1_Impl2_Impl1_9984.b();
		for (int i = 0; i < (this.anInterface8_Impl1_Impl1_Impl1Array9979).length; i++) {
			if ((this.anInterface8_Impl1_Impl1_Impl1Array9979[i]) != null)
				this.anInterface8_Impl1_Impl1_Impl1Array9979[i].b();
		}
	}

	void method577() {
		if (this.anInterface8_Impl1_Impl2_Impl1_9984 != null)
			this.anInterface8_Impl1_Impl2_Impl1_9984.method141();
		for (int i = 0; i < (this.anInterface8_Impl1_Impl1_Impl1Array9979).length; i++) {
			if ((this.anInterface8_Impl1_Impl1_Impl1Array9979[i]) != null)
				this.anInterface8_Impl1_Impl1_Impl1Array9979[i].method141();
		}
	}

	Class52_Sub1_Sub3_Sub2(DirectXGraphicsToolkit directXJavaGraphicsToolkit) {
		super(directXJavaGraphicsToolkit);
		this.anInterface8_Impl1_Impl1_Impl1Array9979 = new Interface8_Impl1_Impl1_Impl1[4];
		this.aDirectXJavaGraphicsToolkit_9983 = directXJavaGraphicsToolkit;
	}

	public void method561(int i, Interface8_Impl1_Impl1 interface8_impl1_impl1) {
		int i_1_ = 1 << i;
		Interface8_Impl1_Impl1_Impl1 interface8_impl1_impl1_impl1 = (Interface8_Impl1_Impl1_Impl1) interface8_impl1_impl1;
		if (interface8_impl1_impl1 != null) {
			if (this.anInt9982 != 0) {
				if ((this.anInt9980 != interface8_impl1_impl1_impl1.a()) || (this.anInt9981 != interface8_impl1_impl1_impl1.f()))
					throw new RuntimeException();
			} else {
				this.anInt9981 = interface8_impl1_impl1_impl1.f();
				this.anInt9980 = interface8_impl1_impl1_impl1.a();
				method573();
			}
			this.anInt9982 |= i_1_;
			this.anInterface8_Impl1_Impl1_Impl1Array9979[i] = interface8_impl1_impl1_impl1;
			if (this.aBoolean9978)
				method578(i, interface8_impl1_impl1_impl1.method144());
		} else {
			this.anInt9982 &= i_1_ ^ 0xffffffff;
			this.anInterface8_Impl1_Impl1_Impl1Array9979[i] = null;
			if (this.aBoolean9978)
				method578(i, 0L);
			if (this.anInt9982 == 0) {
				this.anInt9981 = 0;
				this.anInt9980 = 0;
			}
		}
	}

	public void method564(Interface8_Impl1_Impl2 interface8_impl1_impl2) {
		Interface8_Impl1_Impl2_Impl1 interface8_impl1_impl2_impl1 = (Interface8_Impl1_Impl2_Impl1) interface8_impl1_impl2;
		if (interface8_impl1_impl2 != null) {
			if (this.anInt9982 != 0) {
				if ((this.anInt9980 != interface8_impl1_impl2_impl1.a()) || (this.anInt9981 != interface8_impl1_impl2_impl1.f()))
					throw new RuntimeException();
			} else {
				this.anInt9981 = interface8_impl1_impl2_impl1.f();
				this.anInt9980 = interface8_impl1_impl2_impl1.a();
				method573();
			}
			this.anInt9982 |= 0x10;
			this.anInterface8_Impl1_Impl2_Impl1_9984 = interface8_impl1_impl2_impl1;
			if (this.aBoolean9978)
				method576(interface8_impl1_impl2_impl1.method144());
		} else {
			this.anInt9982 &= ~0x10;
			this.anInterface8_Impl1_Impl2_Impl1_9984 = null;
			if (this.aBoolean9978)
				method576(0L);
			if (this.anInt9982 == 0) {
				this.anInt9981 = 0;
				this.anInt9980 = 0;
			}
		}
	}

	public boolean method557() {
		return ((this.anInterface8_Impl1_Impl1_Impl1Array9979[0]) != null);
	}

	public void method562(int i, Interface8_Impl1_Impl1 interface8_impl1_impl1) {
		int i_2_ = 1 << i;
		Interface8_Impl1_Impl1_Impl1 interface8_impl1_impl1_impl1 = (Interface8_Impl1_Impl1_Impl1) interface8_impl1_impl1;
		if (interface8_impl1_impl1 != null) {
			if (this.anInt9982 != 0) {
				if ((this.anInt9980 != interface8_impl1_impl1_impl1.a()) || (this.anInt9981 != interface8_impl1_impl1_impl1.f()))
					throw new RuntimeException();
			} else {
				this.anInt9981 = interface8_impl1_impl1_impl1.f();
				this.anInt9980 = interface8_impl1_impl1_impl1.a();
				method573();
			}
			this.anInt9982 |= i_2_;
			this.anInterface8_Impl1_Impl1_Impl1Array9979[i] = interface8_impl1_impl1_impl1;
			if (this.aBoolean9978)
				method578(i, interface8_impl1_impl1_impl1.method144());
		} else {
			this.anInt9982 &= i_2_ ^ 0xffffffff;
			this.anInterface8_Impl1_Impl1_Impl1Array9979[i] = null;
			if (this.aBoolean9978)
				method578(i, 0L);
			if (this.anInt9982 == 0) {
				this.anInt9981 = 0;
				this.anInt9980 = 0;
			}
		}
	}

	public boolean method565() {
		return ((this.anInterface8_Impl1_Impl1_Impl1Array9979[0]) != null);
	}

	public boolean method559() {
		return ((this.anInterface8_Impl1_Impl1_Impl1Array9979[0]) != null);
	}

    boolean method578(int i, long l) {
		return jagdx.a.f(IDirect3DDevice.SetRenderTarget(this.aDirectXJavaGraphicsToolkit_9983.aLong9847, i, l));
	}

    boolean attach() {
		for (int i = 0; i < 4; i++) {
			Interface8_Impl1_Impl1_Impl1 interface8_impl1_impl1_impl1 = (this.anInterface8_Impl1_Impl1_Impl1Array9979[i]);
			if (interface8_impl1_impl1_impl1 != null) {
				long l = interface8_impl1_impl1_impl1.method144();
				method578(i, l);
			}
		}
		if (this.anInterface8_Impl1_Impl2_Impl1_9984 != null)
			method576(this.anInterface8_Impl1_Impl2_Impl1_9984.method144());
		this.aBoolean9978 = true;
		return super.attach();
	}

}
