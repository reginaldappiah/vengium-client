package com.jagex;/* Class52_Sub1_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class52_Sub1_Sub4 extends FrameBufferContext {
	SSEGraphicsToolkit aSSEGraphicsToolkit9067;
	fa aFa9068 = null;
	int anInt9069;
	oa anOa9070 = null;
	int anInt9071;

	public void method561(int i, Interface8_Impl1_Impl1 interface8_impl1_impl1) {
		if (i != 0)
			throw new RuntimeException();
		if (this.anOa9070 != null && interface8_impl1_impl1 != null && ((this.anOa9070.a() != interface8_impl1_impl1.a()) || (this.anOa9070.f() != interface8_impl1_impl1.f())))
			throw new RuntimeException();
		this.aFa9068 = (fa) interface8_impl1_impl1;
		if (interface8_impl1_impl1 != null) {
			this.anInt9069 = interface8_impl1_impl1.a();
			this.anInt9071 = interface8_impl1_impl1.f();
		} else if (this.anOa9070 == null) {
			this.anInt9069 = 0;
			this.anInt9071 = 0;
		}
		if (this.aSSEGraphicsToolkit9067.getFrameContext() == this)
			attach();
	}

	public int getWidth() {
		return this.anInt9069;
	}

	public int getHeight() {
		return this.anInt9071;
	}

    public void method563(int i, Interface8_Impl1_Impl1 interface8_impl1_impl1) {
		if (i != 0)
			throw new RuntimeException();
		if (this.anOa9070 != null && interface8_impl1_impl1 != null && ((this.anOa9070.a() != interface8_impl1_impl1.a()) || (this.anOa9070.f() != interface8_impl1_impl1.f())))
			throw new RuntimeException();
		this.aFa9068 = (fa) interface8_impl1_impl1;
		if (interface8_impl1_impl1 != null) {
			this.anInt9069 = interface8_impl1_impl1.a();
			this.anInt9071 = interface8_impl1_impl1.f();
		} else if (this.anOa9070 == null) {
			this.anInt9069 = 0;
			this.anInt9071 = 0;
		}
		if (this.aSSEGraphicsToolkit9067.getFrameContext() == this)
			attach();
	}

    public void method558(Interface8_Impl1_Impl2 interface8_impl1_impl2) {
		if (this.aFa9068 != null && interface8_impl1_impl2 != null && ((this.aFa9068.a() != interface8_impl1_impl2.a()) || (this.aFa9068.f() != interface8_impl1_impl2.f())))
			throw new RuntimeException();
		this.anOa9070 = (oa) interface8_impl1_impl2;
		if (interface8_impl1_impl2 != null) {
			this.anInt9069 = interface8_impl1_impl2.a();
			this.anInt9071 = interface8_impl1_impl2.f();
		} else if (this.aFa9068 == null) {
			this.anInt9069 = 0;
			this.anInt9071 = 0;
		}
		if (this.aSSEGraphicsToolkit9067.getFrameContext() == this)
			attach();
	}

	boolean detach() {
		return true;
	}

	public void destroy() {
		/* empty */
	}

	boolean attach() {
		this.aSSEGraphicsToolkit9067.d((this.aFa9068 == null ? 0L : this.aFa9068.nativeid), (this.anOa9070 == null ? 0L : this.anOa9070.nativeid));
		return true;
	}

	Class52_Sub1_Sub4(SSEGraphicsToolkit var_SSEGraphicsToolkit) {
		this.anInt9069 = 0;
		this.anInt9071 = 0;
		this.aSSEGraphicsToolkit9067 = var_SSEGraphicsToolkit;
	}

	public void method562(int i, Interface8_Impl1_Impl1 interface8_impl1_impl1) {
		if (i != 0)
			throw new RuntimeException();
		if (this.anOa9070 != null && interface8_impl1_impl1 != null && ((this.anOa9070.a() != interface8_impl1_impl1.a()) || (this.anOa9070.f() != interface8_impl1_impl1.f())))
			throw new RuntimeException();
		this.aFa9068 = (fa) interface8_impl1_impl1;
		if (interface8_impl1_impl1 != null) {
			this.anInt9069 = interface8_impl1_impl1.a();
			this.anInt9071 = interface8_impl1_impl1.f();
		} else if (this.anOa9070 == null) {
			this.anInt9069 = 0;
			this.anInt9071 = 0;
		}
		if (this.aSSEGraphicsToolkit9067.getFrameContext() == this)
			attach();
	}

	public void method564(Interface8_Impl1_Impl2 interface8_impl1_impl2) {
		if (this.aFa9068 != null && interface8_impl1_impl2 != null && ((this.aFa9068.a() != interface8_impl1_impl2.a()) || (this.aFa9068.f() != interface8_impl1_impl2.f())))
			throw new RuntimeException();
		this.anOa9070 = (oa) interface8_impl1_impl2;
		if (interface8_impl1_impl2 != null) {
			this.anInt9069 = interface8_impl1_impl2.a();
			this.anInt9071 = interface8_impl1_impl2.f();
		} else if (this.aFa9068 == null) {
			this.anInt9069 = 0;
			this.anInt9071 = 0;
		}
		if (this.aSSEGraphicsToolkit9067.getFrameContext() == this)
			attach();
	}

	public boolean method557() {
		return true;
	}

	public boolean method559() {
		return true;
	}

	public boolean method565() {
		return true;
	}

    public boolean method560() {
		return true;
	}

}
