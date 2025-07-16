package com.jagex;/* Class52_Sub1_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class52_Sub1_Sub3_Sub1 extends Class52_Sub1_Sub3 {
	int anInt9969;
	OpenGLXGraphicsToolkit aOpenGLJavaGraphicsToolkit_9970;
	static int anInt9971 = 16;
	int anInt9972;
	int anInt9973;
	int anInt9974;
	Interface8_Impl1_Impl1_Impl3 anInterface8_Impl1_Impl1_Impl3_9975;
	int anInt9976;
	Interface8_Impl1_Impl1_Impl3[] anInterface8_Impl1_Impl1_Impl3Array9977 = new Interface8_Impl1_Impl1_Impl3[4];

	public boolean method560() {
		int i = OpenGL.glCheckFramebufferStatusEXT(36160);
        return i == 36053;
    }

	public int getWidth() {
		return this.anInt9976;
	}

	public int getHeight() {
		return this.anInt9973;
	}

	public void method563(int i, Interface8_Impl1_Impl1 interface8_impl1_impl1) {
		int i_0_ = 1 << i;
		Interface8_Impl1_Impl1_Impl3 interface8_impl1_impl1_impl3 = (Interface8_Impl1_Impl1_Impl3) interface8_impl1_impl1;
		if (interface8_impl1_impl1 != null) {
			if (this.anInt9972 != 0) {
				if ((this.anInt9976 != interface8_impl1_impl1_impl3.a()) || (this.anInt9973 != interface8_impl1_impl1_impl3.f()))
					throw new RuntimeException();
			} else {
				this.anInt9973 = interface8_impl1_impl1_impl3.f();
				this.anInt9976 = interface8_impl1_impl1_impl3.a();
				method573();
			}
			this.anInt9972 |= i_0_;
			this.anInterface8_Impl1_Impl1_Impl3Array9977[i] = interface8_impl1_impl1_impl3;
		} else {
			this.anInt9972 &= i_0_ ^ 0xffffffff;
			this.anInterface8_Impl1_Impl1_Impl3Array9977[i] = null;
			if (this.anInt9972 == 0) {
				this.anInt9973 = 0;
				this.anInt9976 = 0;
			}
		}
		if (this == this.aOpenGLJavaGraphicsToolkit_9970.getFrameContext())
			method575(i);
		else
			this.anInt9969 |= i_0_;
	}

	void method574() {
		if (this.anInterface8_Impl1_Impl1_Impl3_9975 == null)
			OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
		else
			this.anInterface8_Impl1_Impl1_Impl3_9975.method167(36096);
	}

    Class52_Sub1_Sub3_Sub1(OpenGLXGraphicsToolkit openGLJavaGraphicsToolkit) {
		super(openGLJavaGraphicsToolkit);
		this.aOpenGLJavaGraphicsToolkit_9970 = openGLJavaGraphicsToolkit;
		int[] is = new int[1];
		OpenGL.glGenFramebuffersEXT(1, is, 0);
		this.anInt9974 = is[0];
	}

	public void destroy() {
		if (this.anInt9974 != 0) {
			this.aOpenGLJavaGraphicsToolkit_9970.method5528(this.anInt9974);
			this.anInt9974 = 0;
		}
	}

	boolean attach() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt9974);
		for (int i = 0; i < 4; i++) {
			if ((this.anInt9969 & 1 << i) != 0)
				method575(i);
		}
		if ((this.anInt9969 & 0x10) != 0)
			method574();
		this.anInt9969 = 0;
		return super.attach();
	}

	boolean detach() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

    void method575(int i) {
		Interface8_Impl1_Impl1_Impl3 interface8_impl1_impl1_impl3 = (this.anInterface8_Impl1_Impl1_Impl3Array9977[i]);
		if (interface8_impl1_impl1_impl3 == null)
			OpenGL.glFramebufferRenderbufferEXT(36160, 36064 + i, 36161, 0);
		else
			interface8_impl1_impl1_impl3.method167(36064 + i);
	}

    public void method561(int i, Interface8_Impl1_Impl1 interface8_impl1_impl1) {
		int i_1_ = 1 << i;
		Interface8_Impl1_Impl1_Impl3 interface8_impl1_impl1_impl3 = (Interface8_Impl1_Impl1_Impl3) interface8_impl1_impl1;
		if (interface8_impl1_impl1 != null) {
			if (this.anInt9972 != 0) {
				if ((this.anInt9976 != interface8_impl1_impl1_impl3.a()) || (this.anInt9973 != interface8_impl1_impl1_impl3.f()))
					throw new RuntimeException();
			} else {
				this.anInt9973 = interface8_impl1_impl1_impl3.f();
				this.anInt9976 = interface8_impl1_impl1_impl3.a();
				method573();
			}
			this.anInt9972 |= i_1_;
			this.anInterface8_Impl1_Impl1_Impl3Array9977[i] = interface8_impl1_impl1_impl3;
		} else {
			this.anInt9972 &= i_1_ ^ 0xffffffff;
			this.anInterface8_Impl1_Impl1_Impl3Array9977[i] = null;
			if (this.anInt9972 == 0) {
				this.anInt9973 = 0;
				this.anInt9976 = 0;
			}
		}
		if (this == this.aOpenGLJavaGraphicsToolkit_9970.getFrameContext())
			method575(i);
		else
			this.anInt9969 |= i_1_;
	}

	public void method562(int i, Interface8_Impl1_Impl1 interface8_impl1_impl1) {
		int i_2_ = 1 << i;
		Interface8_Impl1_Impl1_Impl3 interface8_impl1_impl1_impl3 = (Interface8_Impl1_Impl1_Impl3) interface8_impl1_impl1;
		if (interface8_impl1_impl1 != null) {
			if (this.anInt9972 != 0) {
				if ((this.anInt9976 != interface8_impl1_impl1_impl3.a()) || (this.anInt9973 != interface8_impl1_impl1_impl3.f()))
					throw new RuntimeException();
			} else {
				this.anInt9973 = interface8_impl1_impl1_impl3.f();
				this.anInt9976 = interface8_impl1_impl1_impl3.a();
				method573();
			}
			this.anInt9972 |= i_2_;
			this.anInterface8_Impl1_Impl1_Impl3Array9977[i] = interface8_impl1_impl1_impl3;
		} else {
			this.anInt9972 &= i_2_ ^ 0xffffffff;
			this.anInterface8_Impl1_Impl1_Impl3Array9977[i] = null;
			if (this.anInt9972 == 0) {
				this.anInt9973 = 0;
				this.anInt9976 = 0;
			}
		}
		if (this == this.aOpenGLJavaGraphicsToolkit_9970.getFrameContext())
			method575(i);
		else
			this.anInt9969 |= i_2_;
	}

	public void method564(Interface8_Impl1_Impl2 interface8_impl1_impl2) {
		Interface8_Impl1_Impl1_Impl3 interface8_impl1_impl1_impl3 = (Interface8_Impl1_Impl1_Impl3) interface8_impl1_impl2;
		if (interface8_impl1_impl2 != null) {
			if (this.anInt9972 != 0) {
				if ((this.anInt9976 != interface8_impl1_impl1_impl3.a()) || (this.anInt9973 != interface8_impl1_impl1_impl3.f()))
					throw new RuntimeException();
			} else {
				this.anInt9973 = interface8_impl1_impl1_impl3.f();
				this.anInt9976 = interface8_impl1_impl1_impl3.a();
				method573();
			}
			this.anInt9972 |= 0x10;
			this.anInterface8_Impl1_Impl1_Impl3_9975 = interface8_impl1_impl1_impl3;
		} else {
			this.anInt9972 &= ~0x10;
			this.anInterface8_Impl1_Impl1_Impl3_9975 = null;
			if (this.anInt9972 == 0) {
				this.anInt9973 = 0;
				this.anInt9976 = 0;
			}
		}
		if (this == this.aOpenGLJavaGraphicsToolkit_9970.getFrameContext())
			method574();
		else
			this.anInt9969 |= 0x10;
	}

	public boolean method557() {
		int i = OpenGL.glCheckFramebufferStatusEXT(36160);
        return i == 36053;
    }

	public boolean method559() {
		int i = OpenGL.glCheckFramebufferStatusEXT(36160);
        return i == 36053;
    }

    public void method558(Interface8_Impl1_Impl2 interface8_impl1_impl2) {
		Interface8_Impl1_Impl1_Impl3 interface8_impl1_impl1_impl3 = (Interface8_Impl1_Impl1_Impl3) interface8_impl1_impl2;
		if (interface8_impl1_impl2 != null) {
			if (this.anInt9972 != 0) {
				if ((this.anInt9976 != interface8_impl1_impl1_impl3.a()) || (this.anInt9973 != interface8_impl1_impl1_impl3.f()))
					throw new RuntimeException();
			} else {
				this.anInt9973 = interface8_impl1_impl1_impl3.f();
				this.anInt9976 = interface8_impl1_impl1_impl3.a();
				method573();
			}
			this.anInt9972 |= 0x10;
			this.anInterface8_Impl1_Impl1_Impl3_9975 = interface8_impl1_impl1_impl3;
		} else {
			this.anInt9972 &= ~0x10;
			this.anInterface8_Impl1_Impl1_Impl3_9975 = null;
			if (this.anInt9972 == 0) {
				this.anInt9973 = 0;
				this.anInt9976 = 0;
			}
		}
		if (this == this.aOpenGLJavaGraphicsToolkit_9970.getFrameContext())
			method574();
		else
			this.anInt9969 |= 0x10;
	}

    public boolean method565() {
		int i = OpenGL.glCheckFramebufferStatusEXT(36160);
        return i == 36053;
    }
}
