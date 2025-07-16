package com.jagex;/* OpenGLXGraphicsToolkit - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.prefetch.JS5PrefetchType;
import com.jagex.maths.Matrix4f;
import com.jagex.utils.StringUtils;
import com.jagex.utils.TimeUtils;
import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;

import java.awt.*;

public final class OpenGLXGraphicsToolkit extends NativeToolkit {
	NodeCollection aClass458_9815;
	NodeCollection aClass458_9816 = new NodeCollection();
	NodeCollection aClass458_9817 = new NodeCollection();
	NodeCollection aClass458_9818 = new NodeCollection();
	NodeCollection aClass458_9819 = new NodeCollection();
	NodeCollection aClass458_9820 = new NodeCollection();
	NodeCollection aClass458_9821 = new NodeCollection();
	float[] aFloatArray9822;
	long aLong9823;
	int[] anIntArray9824;
	boolean aBoolean9825;
	OpenGL openGL;
	Class246_Sub1 aClass246_Sub1_9827;
	int anInt9828;
	Class246_Sub2[] aClass246_Sub2Array9829;
	boolean aBoolean9830;
	int[] anIntArray9831;
	OpenGLShaderToolkit aClass110_Sub2_9832;
	String aString9833;
	String aString9834;
	int anInt9835;
	boolean aBoolean9836;
	boolean aBoolean9837;
	boolean aBoolean9838;
	boolean aBoolean9839;
	boolean aBoolean9840;
	int anInt9841;
	boolean aBoolean9842;
	float[] aFloatArray9843;

	public static GraphicsToolkit create(Canvas canvas, MaterialRawLoader materialRawLoader, Js5FileSystem js5FileSystem, int samples) {
        OpenGLXGraphicsToolkit toolkit;
        try {
            boolean exists = libraryExists();
            if (!exists)
                throw new RuntimeException("");
            if (!JS5PrefetchType.getPrefetch().load("jaggl"))
                throw new RuntimeException("");
            TranslatedCanvas.setIgnoreRepaint(canvas);
            OpenGL opengl = new OpenGL();
            long time = opengl.init(canvas, 8, 8, 8, 24, 0, samples);
            if (time == 0L)
                throw new RuntimeException("");
            OpenGLXGraphicsToolkit openGLXToolkit = new OpenGLXGraphicsToolkit(opengl, canvas, time, materialRawLoader, js5FileSystem, samples);
            openGLXToolkit.method5302();
            toolkit = openGLXToolkit;
        } catch (RuntimeException runtimeexception) {
            throw runtimeexception;
        } catch (Throwable throwable) {
            throw new RuntimeException("");
        }
        return toolkit;
    }

	public Class123 method5297(String string) {
		byte[] is = method5535(string);
		if (is == null)
			return null;
		Class109 class109 = method5299(is);
		return new Class123_Sub2(this, class109);
	}

	public boolean method5295() {
		return this.aBoolean9839;
	}

	public boolean method5483() {
		return this.aBoolean9840;
	}

	OpenGLXGraphicsToolkit(OpenGL opengl, Canvas canvas, long time, MaterialRawLoader interface_ma, Js5FileSystem class243, int i) {
		super(interface_ma, class243, i, 1);
		this.aClass458_9815 = new NodeCollection();
		this.anIntArray9824 = new int[1000];
		this.aClass246_Sub2Array9829 = new Class246_Sub2[16];
		new MapBuffer();
		new MapBuffer();
		this.aFloatArray9822 = new float[4];
		this.aFloatArray9843 = new float[16];
		int[] is = new int[1];
		try {
			this.openGL = opengl;
			this.openGL.f();
			this.aString9833 = OpenGL.glGetString(7936).toLowerCase();
			this.aString9834 = OpenGL.glGetString(7937).toLowerCase();
			if ((this.aString9833.indexOf("microsoft") != -1) || this.aString9833.indexOf("brian paul") != -1 || (this.aString9833.indexOf("mesa") != -1))
				throw new RuntimeException("");
			String string = OpenGL.glGetString(7938);
			String[] strings = Class365_Sub1_Sub3_Sub1.method4508(string.replace('.', ' '), ' ');
			if (strings.length >= 2) {
				try {
					int i_0_ = StringUtils.method1998(strings[0]);
					int i_1_ = StringUtils.method1998(strings[1]);
					this.anInt9835 = i_0_ * 10 + i_1_;
				} catch (NumberFormatException numberformatexception) {
					throw new RuntimeException("");
				}
			} else
				throw new RuntimeException("");
			if (this.anInt9835 < 12)
				throw new RuntimeException("");
			OpenGL.glGetIntegerv(34018, is, 0);
			anInt8347 = is[0];
			if (anInt8347 < 2)
				throw new RuntimeException("");
			anInt8348 = 8;
			this.aBoolean9825 = this.openGL.a("GL_ARB_vertex_buffer_object");
			multisampled = this.openGL.a("GL_ARB_multisample");
			this.aBoolean9837 = this.openGL.a("GL_ARB_texture_rectangle");
			this.openGL.a("GL_ARB_texture_cube_map");
			this.aBoolean9838 = this.openGL.a("GL_ARB_texture_non_power_of_two");
			aBoolean8365 = this.openGL.a("GL_EXT_texture3D");
			this.aBoolean9839 = this.openGL.a("GL_ARB_vertex_shader");
			this.openGL.a("GL_ARB_vertex_program");
			this.aBoolean9840 = this.openGL.a("GL_ARB_fragment_shader");
			this.openGL.a("GL_ARB_fragment_program");
			this.openGL.a("GL_EXT_framebuffer_object");
			this.anIntArray9831 = new int[anInt8347];
			aBoolean8349 = this.openGL.a("GL_EXT_framebuffer_object");
			this.openGL.a("GL_EXT_framebuffer_blit");
			this.openGL.a("GL_EXT_framebuffer_multisample");
			if (!method5295() || !method5483()) {
				if (!this.openGL.a("GL_ARB_multitexture"))
					throw new RuntimeException("");
				if (!this.openGL.a("GL_ARB_texture_env_combine"))
					throw new RuntimeException("");
			}
			this.anInt9841 = Stream.r() ? 33639 : 5121;
			if (this.aString9834.indexOf("radeon") != -1) {
				int i_2_ = 0;
				boolean bool = false;
				boolean bool_3_ = false;
				String[] strings_4_ = (Class365_Sub1_Sub3_Sub1.method4508(this.aString9834.replace('/', ' '), ' '));
				for (int i_5_ = 0; i_5_ < strings_4_.length; i_5_++) {
					String string_6_ = strings_4_[i_5_];
					try {
						if (string_6_.length() <= 0)
							continue;
						if (string_6_.charAt(0) == 'x' && string_6_.length() >= 3 && Class51.method543(string_6_.substring(1, 3))) {
							string_6_ = string_6_.substring(1);
							bool_3_ = true;
						}
						if (string_6_.equals("hd")) {
							bool = true;
							continue;
						}
						if (string_6_.startsWith("hd")) {
							string_6_ = string_6_.substring(2);
							bool = true;
						}
						if (string_6_.length() < 4 || !Class51.method543(string_6_.substring(0, 4)))
							continue;
						i_2_ = StringUtils.method1998(string_6_.substring(0, 4));
					} catch (Exception exception) {
						continue;
					}
					break;
				}
				if (!bool_3_ && !bool) {
					if (i_2_ >= 7000 && i_2_ <= 7999)
						this.aBoolean9825 = false;
					if (i_2_ >= 7000 && i_2_ <= 9250)
						aBoolean8365 = false;
				}
				this.aBoolean9837 &= this.openGL.a("GL_ARB_half_float_pixel");
			}
			if (this.aString9833.indexOf("intel") == -1) {
				/* empty */
			}
			if (this.aBoolean9825) {
				try {
					int[] is_7_ = new int[1];
					OpenGL.glGenBuffersARB(1, is_7_, 0);
				} catch (Throwable throwable) {
					throw new RuntimeException("");
				}
			}
			attachRenderContext(canvas, new OpenGLJavaGraphicsContext(this, canvas, time));
			method5003(canvas);
			method5517(32768, false);
			method5517(32768, false);
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			destroy();
			if (throwable instanceof OutOfMemoryError)
				throw (OutOfMemoryError) throwable;
			throw new RuntimeException("");
		}
	}

	public void method5075() {
		OpenGL.glFinish();
	}

	void method5023() {
		super.method5023();
		if (this.openGL != null) {
			this.openGL.b();
			this.openGL.release();
			this.openGL = null;
		}
	}

	public float method5315() {
		return 0.0F;
	}

	RenderContext createRenderFrameContext(Canvas canvas, int i, int i_10_) {
		return new OpenGLJavaGraphicsContext(this, canvas);
	}

	public FrameBufferContext method5094() {
		return new Class52_Sub1_Sub3_Sub1(this);
	}

	public Interface8_Impl1_Impl2 method5186(int i, int i_11_) {
		return new Class262(this, Class55.aClass55_561, Class77.aClass77_719, i, i_11_);
	}

	public int[] aq(int i, int i_12_, int i_13_, int i_14_) {
		int[] is = new int[i_13_ * i_14_];
		int i_15_ = frameContext.getHeight();
		for (int i_16_ = 0; i_16_ < i_14_; i_16_++)
			OpenGL.glReadPixels(i, i_15_ - i_12_ - i_16_ - 1, i_13_, 1, 32993, this.anInt9841, is, i_16_ * i_13_);
		return is;
	}

	void renderFrame(int i, int i_17_) throws GraphicsFrameException {
		renderContext.method580();
		if (textures != null)
			textures.method176(1673401622);
	}

	public void clear(int i, int rgb) {
		int i_19_ = 0;
		if ((i & 0x1) != 0) {
			OpenGL.glClearColor((float) (rgb & 0xFF0000) / 1.671168E7F, (float) (rgb & 0xFF00) / 65280.0F, (float) (rgb & 0xFF) / 255.0F, (float) (rgb >>> 24) / 255.0F);
			i_19_ = 16384;
		}
		if ((i & 0x2) != 0) {
			method5399(true);
			i_19_ |= 0x100;
		}
		if ((i & 0x4) != 0)
			i_19_ |= 0x400;
		OpenGL.glClear(i_19_);
	}

	void method5325() {
		if (frameContext != null)
			OpenGL.glViewport(anInt8275 + anInt8339, (anInt8276 + frameContext.getHeight() - anInt8272 - anInt8239), anInt8273, anInt8239);
		OpenGL.glDepthRange(aFloat8335, aFloat8258);
	}

	void method5326() {
		if (frameContext != null) {
			int i = anInt8275 + anInt8265;
			int i_20_ = anInt8276 + frameContext.getHeight() - anInt8241;
			int i_21_ = anInt8234 - anInt8265;
			int i_22_ = anInt8241 - anInt8263;
			if (i_21_ < 0)
				i_21_ = 0;
			if (i_22_ < 0)
				i_22_ = 0;
			OpenGL.glScissor(i, i_20_, i_21_, i_22_);
		}
	}

	void method5327() {
		if (aBoolean8254)
			OpenGL.glEnable(3089);
		else
			OpenGL.glDisable(3089);
	}

	public void method5300(Matrix4f matrix4f, Matrix4f matrix4f_23_, Matrix4f matrix4f_24_) {
		OpenGL.glMatrixMode(5888);
		aMatrix4f_8236.method2143(matrix4f, matrix4f_23_);
		OpenGL.glLoadMatrixf(aMatrix4f_8236.aFloatArray2594, 0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(matrix4f_24_.aFloatArray2594, 0);
	}

	public EnvironmentMap method5142(EnvironmentMap class66, EnvironmentMap class66_25_, float f, EnvironmentMap class66_26_) {
		return f < 0.5F ? class66 : class66_25_;
	}

	void method5340() {
		if (aBoolean8279)
			OpenGL.glEnable(2929);
		else
			OpenGL.glDisable(2929);
	}

	void method5422() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(aMatrix4f_8230.aFloatArray2594, 0);
		OpenGL.glLightfv(16384, 4611, aFloatArray8283, 0);
		OpenGL.glLightfv(16385, 4611, aFloatArray8248, 0);
	}

	void method5320() {
		/* empty */
	}

	void method5347() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(aMatrix4f_8230.aFloatArray2594, 0);
		int i;
		for (i = 0; i < anInt8296; i++) {
			Light class298_sub10 = aClass298_Sub10Array8286[i];
			int i_30_ = class298_sub10.method2898(-1132212405);
			int i_31_ = 16386 + i;
			float f = class298_sub10.method2901(608404512) / 255.0F;
			this.aFloatArray9822[0] = (float) class298_sub10.method2895(823958259);
			this.aFloatArray9822[1] = (float) class298_sub10.method2894(32231990);
			this.aFloatArray9822[2] = (float) class298_sub10.method2897((byte) 56);
			this.aFloatArray9822[3] = 1.0F;
			OpenGL.glLightfv(i_31_, 4611, this.aFloatArray9822, 0);
			this.aFloatArray9822[0] = (float) (i_30_ >> 16 & 0xff) * f;
			this.aFloatArray9822[1] = (float) (i_30_ >> 8 & 0xff) * f;
			this.aFloatArray9822[2] = (float) (i_30_ & 0xff) * f;
			this.aFloatArray9822[3] = 1.0F;
			OpenGL.glLightfv(i_31_, 4609, this.aFloatArray9822, 0);
			OpenGL.glLightf(i_31_, 4617, (1.0F / (float) (class298_sub10.method2900(-1643829054) * class298_sub10.method2900(-1735214490))));
			OpenGL.glEnable(i_31_);
		}
		for (/**/; i < anInt8295; i++)
			OpenGL.glDisable(16386 + i);
	}

	boolean method5348(Class55 class55, Class77 class77) {
		return true;
	}

	boolean method5349(Class55 class55, Class77 class77) {
		return aBoolean8365;
	}

	Interface9_Impl2 method5355(int i, int i_32_, boolean bool, int[] is, int i_33_, int i_34_) {
		if (this.aBoolean9838 || (StaticMethods.method6152(i) && StaticMethods.method6152(i_32_)))
			return new Class263_Sub1(this, i, i_32_, bool, is, i_33_, i_34_);
		if (this.aBoolean9837)
			return new Class263_Sub4(this, i, i_32_, is, i_33_, i_34_);
		Class263_Sub1 class263_sub1 = new Class263_Sub1(this, Class55.aClass55_557, Class77.aClass77_717, LinkedList.getNextBitValue(i), LinkedList.getNextBitValue(i_32_));
		class263_sub1.method81(0, 0, i, i_32_, is, i_33_, i_34_);
		return class263_sub1;
	}

	Interface9_Impl2 method5439(Class55 class55, int i, int i_35_, boolean bool, byte[] is, int i_36_, int i_37_) {
		if (this.aBoolean9838 || (StaticMethods.method6152(i) && StaticMethods.method6152(i_35_)))
			return new Class263_Sub1(this, class55, i, i_35_, bool, is, i_36_, i_37_);
		if (this.aBoolean9837)
			return new Class263_Sub4(this, class55, i, i_35_, is, i_36_, i_37_);
		Class263_Sub1 class263_sub1 = new Class263_Sub1(this, class55, Class77.aClass77_717, LinkedList.getNextBitValue(i), LinkedList.getNextBitValue(i_35_));
		class263_sub1.method82(0, 0, i, i_35_, is, class55, i_36_, i_37_);
		return class263_sub1;
	}

	Interface9_Impl2_Impl1 method5356(Class55 class55, Class77 class77, int i, int i_38_) {
		if (this.aBoolean9838 || (StaticMethods.method6152(i) && StaticMethods.method6152(i_38_)))
			return new Class263_Sub1(this, class55, class77, i, i_38_);
		if (this.aBoolean9837)
			return new Class263_Sub4(this, class55, class77, i, i_38_);
		return new Class263_Sub1(this, class55, class77, LinkedList.getNextBitValue(i), LinkedList.getNextBitValue(i_38_));
	}

	Interface9_Impl1 method5415(int i, boolean bool, int[][] is) {
		return new Class263_Sub3(this, i, bool, is);
	}

	Interface9_Impl3 method5416(Class55 class55, int i, int i_39_, int i_40_, boolean bool, byte[] is) {
		return new Class263_Sub2(this, class55, i, i_39_, i_40_, bool, is);
	}

	public void method5359() {
		int i = this.anIntArray9831[anInt8325];
		if (i != 0) {
			this.anIntArray9831[anInt8325] = 0;
			OpenGL.glBindTexture(i, 0);
			OpenGL.glDisable(i);
		}
	}

	void method5486() {
		OpenGL.glMatrixMode(5890);
		if (aClass171Array8305[anInt8325] != Class171.aClass171_1742)
			OpenGL.glLoadMatrixf(aMatrix4fArray8304[anInt8325].method2173(this.aFloatArray9843), 0);
		else
			OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	void method5371() {
		OpenGL.glActiveTexture(33984 + anInt8325);
	}

	void method5372() {
		OpenGL.glTexEnvi(8960, 34161, method5526(aClass175Array8294[anInt8325]));
	}

	void method5444() {
		OpenGL.glTexEnvi(8960, 34162, method5526(aClass175Array8307[anInt8325]));
	}

	final void method5427(int i, Class183 class183, boolean bool, boolean bool_41_) {
		OpenGL.glTexEnvi(8960, 34176 + i, method5527(class183));
		if (bool)
			OpenGL.glTexEnvi(8960, 34192 + i, bool_41_ ? 771 : 770);
		else
			OpenGL.glTexEnvi(8960, 34192 + i, bool_41_ ? 769 : 768);
	}

	final void method5364(int i, Class183 class183, boolean bool) {
		OpenGL.glTexEnvi(8960, 34184 + i, method5527(class183));
		OpenGL.glTexEnvi(8960, 34200 + i, bool ? 771 : 770);
	}

	static final int method5526(Class175 class175) {
		if (class175 == Class175.aClass175_1770)
			return 7681;
		if (class175 == Class175.aClass175_1765)
			return 8448;
		if (class175 == Class175.aClass175_1769)
			return 34165;
		if (class175 == Class175.aClass175_1767)
			return 260;
		if (class175 == Class175.aClass175_1768)
			return 34023;
		throw new IllegalArgumentException();
	}

	static final int method5527(Class183 class183) {
		if (class183 == Class183.aClass183_1888)
			return 5890;
		if (class183 == Class183.aClass183_1889)
			return 34167;
		if (class183 == Class183.aClass183_1887)
			return 34168;
		if (class183 == Class183.aClass183_1890)
			return 34166;
		throw new IllegalArgumentException();
	}

	void method5292(int i) {
		OpenGL.glColorMask((i & 0x1) != 0, (i & 0x2) != 0, (i & 0x4) != 0, (i & 0x8) != 0);
	}

	public void fh(int i, int i_42_) {
		int i_43_ = 0;
		if ((i & 0x1) != 0) {
			OpenGL.glClearColor((float) (i_42_ & 0xff0000) / 1.671168E7F, (float) (i_42_ & 0xff00) / 65280.0F, (float) (i_42_ & 0xff) / 255.0F, (float) (i_42_ >>> 24) / 255.0F);
			i_43_ = 16384;
		}
		if ((i & 0x2) != 0) {
			method5399(true);
			i_43_ |= 0x100;
		}
		if ((i & 0x4) != 0)
			i_43_ |= 0x400;
		OpenGL.glClear(i_43_);
	}

	void method5379() {
		if (aBoolean8331 && aBoolean8278 && anInt8233 >= 0)
			OpenGL.glEnable(2912);
		else
			OpenGL.glDisable(2912);
	}

	public EnvironmentMap method5179(EnvironmentMap class66, EnvironmentMap class66_44_, float f, EnvironmentMap class66_45_) {
		return f < 0.5F ? class66 : class66_44_;
	}

	void method5380(boolean bool) {
		if (bool)
			OpenGL.glEnable(32925);
		else
			OpenGL.glDisable(32925);
	}

	final Interface7_Impl1 method5382(boolean bool) {
		return new Class246_Sub2(this, bool);
	}

	public void method5383(int i, Interface7_Impl1 interface7_impl1) {
		this.aClass246_Sub2Array9829[i] = (Class246_Sub2) interface7_impl1;
	}

	void method5384(Interface7_Impl2 interface7_impl2) {
		this.aClass246_Sub1_9827 = (Class246_Sub1) interface7_impl2;
		this.aClass246_Sub1_9827.method2333();
	}

	final synchronized void method5528(int i) {
		IntNode class298_sub35 = new IntNode(i);
		this.aClass458_9819.pushBack(class298_sub35);
	}

	public final void method5392(Class187 class187, int i, int i_46_, int i_47_, int i_48_) {
		int i_49_;
		int i_50_;
		if (class187 == Class187.aClass187_1908) {
			i_49_ = 1;
			i_50_ = i_48_ * 2;
		} else if (class187 == Class187.aClass187_1905) {
			i_49_ = 3;
			i_50_ = i_48_ + 1;
		} else if (class187 == Class187.aClass187_1907) {
			i_49_ = 4;
			i_50_ = i_48_ * 3;
		} else if (class187 == Class187.aClass187_1906) {
			i_49_ = 6;
			i_50_ = i_48_ + 2;
		} else if (class187 == Class187.aClass187_1904) {
			i_49_ = 5;
			i_50_ = i_48_ + 2;
		} else {
			i_49_ = 0;
			i_50_ = i_48_;
		}
		Class77 class77 = this.aClass246_Sub1_9827.method2335();
		OpenGL.glDrawElements(i_49_, i_50_, method5537(class77), (this.aClass246_Sub1_9827.method2332() + (long) (i_47_ * (class77.anInt724 * 685647847))));
	}

	final synchronized void method5529(int i, int i_53_) {
		IntNode class298_sub35 = new IntNode(i_53_);
		class298_sub35.key = (long) i * 4191220306876042991L;
		this.aClass458_9818.pushBack(class298_sub35);
	}

	public int[] ev(int i, int i_54_, int i_55_, int i_56_) {
		int[] is = new int[i_55_ * i_56_];
		int i_57_ = frameContext.getHeight();
		for (int i_58_ = 0; i_58_ < i_56_; i_58_++)
			OpenGL.glReadPixels(i, i_57_ - i_54_ - i_58_ - 1, i_55_, 1, 32993, this.anInt9841, is, i_58_ * i_55_);
		return is;
	}

	final synchronized void method5530(int i, int i_59_) {
		IntNode class298_sub35 = new IntNode(i_59_);
		class298_sub35.key = (long) i * 4191220306876042991L;
		this.aClass458_9820.pushBack(class298_sub35);
	}

	final synchronized void method5531(long l) {
		Node class298 = new Node();
		class298.key = l * 4191220306876042991L;
		this.aClass458_9815.pushBack(class298);
	}

	public void method5455(Class153 class153) {
		Class181[] class181s = class153.aClass181Array6405;
		int i = 0;
		boolean bool = false;
		boolean bool_60_ = false;
		boolean bool_61_ = false;
		for (int i_62_ = 0; i_62_ < class181s.length; i_62_++) {
			Class181 class181 = class181s[i_62_];
			Class246_Sub2 class246_sub2 = this.aClass246_Sub2Array9829[i_62_];
			int i_63_ = 0;
			int i_64_ = class246_sub2.method2336();
			long l = class246_sub2.method2332();
			class246_sub2.method2333();
			for (int i_65_ = 0; i_65_ < class181.method1842(); i_65_++) {
				Class155 class155 = class181.method1839(i_65_);
				switch (class155.anInt1604) {
				case 5:
					OpenGL.glClientActiveTexture(33984 + i++);
					OpenGL.glTexCoordPointer(3, 5126, i_64_, l + (long) i_63_);
					break;
				case 10:
					OpenGL.glClientActiveTexture(33984 + i++);
					OpenGL.glTexCoordPointer(2, 5126, i_64_, l + (long) i_63_);
					break;
				case 8:
					OpenGL.glClientActiveTexture(33984 + i++);
					OpenGL.glTexCoordPointer(4, 5126, i_64_, l + (long) i_63_);
					break;
				case 0:
					OpenGL.glVertexPointer(3, 5126, i_64_, l + (long) i_63_);
					bool_61_ = true;
					break;
				case 11:
					OpenGL.glNormalPointer(5126, i_64_, l + (long) i_63_);
					bool_60_ = true;
					break;
				case 3:
					OpenGL.glColorPointer(4, 5121, i_64_, l + (long) i_63_);
					bool = true;
					break;
				case 9:
					OpenGL.glClientActiveTexture(33984 + i++);
					OpenGL.glTexCoordPointer(1, 5126, i_64_, l + (long) i_63_);
					break;
				}
				i_63_ += class155.anInt1611;
			}
		}
		if (this.aBoolean9836 != bool_61_) {
			if (bool_61_)
				OpenGL.glEnableClientState(32884);
			else
				OpenGL.glDisableClientState(32884);
			this.aBoolean9836 = bool_61_;
		}
		if (this.aBoolean9842 != bool_60_) {
			if (bool_60_)
				OpenGL.glEnableClientState(32885);
			else
				OpenGL.glDisableClientState(32885);
			this.aBoolean9842 = bool_60_;
		}
		if (this.aBoolean9830 != bool) {
			if (bool)
				OpenGL.glEnableClientState(32886);
			else
				OpenGL.glDisableClientState(32886);
			this.aBoolean9830 = bool;
		}
		if (this.anInt9828 < i) {
			for (int i_66_ = this.anInt9828; i_66_ < i; i_66_++) {
				OpenGL.glClientActiveTexture(33984 + i_66_);
				OpenGL.glEnableClientState(32888);
			}
			this.anInt9828 = i;
		} else if (this.anInt9828 > i) {
			for (int i_67_ = i; i_67_ < this.anInt9828; i_67_++) {
				OpenGL.glClientActiveTexture(33984 + i_67_);
				OpenGL.glDisableClientState(32888);
			}
			this.anInt9828 = i;
		}
	}

	final Interface7_Impl2 method5381(boolean bool) {
		return new Class246_Sub1(this, Class77.aClass77_718, bool);
	}

	static int method5532(Class55 class55) {
		switch (class55.anInt566 * -976336893) {
		case 3:
			return 6410;
		case 9:
			return 6408;
		case 1:
			return 6409;
		case 5:
			return 6407;
		case 7:
			return 6406;
		default:
			throw new IllegalStateException();
		case 2:
			return 6402;
		}
	}

	static int method5533(Class55 class55, Class77 class77) {
		if (class77 == Class77.aClass77_717) {
			switch (class55.anInt566 * -976336893) {
			case 8:
				return 33777;
			case 5:
				return 6407;
			case 0:
				return 33779;
			case 3:
				return 6410;
			default:
				throw new IllegalArgumentException();
			case 9:
				return 6408;
			case 7:
				return 6406;
			case 1:
				return 6409;
			}
		}
		if (class77 == Class77.aClass77_718) {
			switch (class55.anInt566 * -976336893) {
			case 9:
				return 32859;
			case 2:
				return 33189;
			case 3:
				return 36219;
			case 1:
				return 32834;
			default:
				throw new IllegalArgumentException();
			case 5:
				return 32852;
			case 7:
				return 32830;
			}
		}
		if (class77 == Class77.aClass77_719) {
			switch (class55.anInt566 * -976336893) {
			default:
				throw new IllegalArgumentException();
			case 2:
				return 33190;
			}
		}
		if (class77 == Class77.aClass77_714) {
			switch (class55.anInt566 * -976336893) {
			case 1:
				return 34846;
			case 7:
				return 34844;
			default:
				throw new IllegalArgumentException();
			case 9:
				return 34842;
			case 5:
				return 34843;
			case 3:
				return 34847;
			}
		}
		if (class77 == Class77.aClass77_721) {
			switch (class55.anInt566 * -976336893) {
			case 5:
				return 34837;
			case 1:
				return 34840;
			default:
				throw new IllegalArgumentException();
			case 3:
				return 34841;
			case 7:
				return 34838;
			case 9:
				return 34836;
			}
		}
		throw new IllegalArgumentException();
	}

	public void method5061(boolean bool) {
		/* empty */
	}

	void method5394(int i) {
		OpenGL.glPolygonMode(1028, (i & 0x2) != 0 ? 6913 : 6914);
	}

	public final void method5398(Class187 class187, int i, int i_68_) {
		int i_69_;
		int i_70_;
		if (class187 == Class187.aClass187_1908) {
			i_69_ = 1;
			i_70_ = i_68_ * 2;
		} else if (class187 == Class187.aClass187_1905) {
			i_69_ = 3;
			i_70_ = i_68_ + 1;
		} else if (class187 == Class187.aClass187_1907) {
			i_69_ = 4;
			i_70_ = i_68_ * 3;
		} else if (class187 == Class187.aClass187_1906) {
			i_69_ = 6;
			i_70_ = i_68_ + 2;
		} else if (class187 == Class187.aClass187_1904) {
			i_69_ = 5;
			i_70_ = i_68_ + 2;
		} else {
			i_69_ = 0;
			i_70_ = i_68_;
		}
		OpenGL.glDrawArrays(i_69_, i, i_70_);
	}

	void method5410() {
		OpenGL.glDepthMask(aBoolean8277 && aBoolean8237);
	}

	void method5411() {
		this.aFloatArray9822[0] = aFloat8291 * aFloat8362;
		this.aFloatArray9822[1] = aFloat8291 * aFloat8289;
		this.aFloatArray9822[2] = aFloat8291 * aFloat8290;
		this.aFloatArray9822[3] = 1.0F;
		OpenGL.glLightModelfv(2899, this.aFloatArray9822, 0);
	}

	Class153 method5404(Class181[] class181s) {
		return new Class153_Sub1(class181s);
	}

	void method5345() {
		if (aBoolean8281) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	public void method5067() {
		OpenGL.glFinish();
	}

	public void method5012(boolean bool) {
		/* empty */
	}

	RenderContext method5117(Canvas canvas, int i, int i_72_) {
		return new OpenGLJavaGraphicsContext(this, canvas);
	}

	void method5463() {
		OpenGL.glDepthFunc(515);
		OpenGL.glEnable(2884);
		OpenGL.glCullFace(1029);
		OpenGL.glClearDepth(1.0F);
		OpenGL.glAlphaFunc(516, 0.0F);
		OpenGL.glPolygonMode(1028, 6914);
		for (int i = anInt8347 - 1; i >= 0; i--) {
			OpenGL.glActiveTexture(33984 + i);
			OpenGL.glTexEnvi(8960, 8704, 34160);
			OpenGL.glTexEnvi(8960, 34161, 8448);
			OpenGL.glTexEnvi(8960, 34178, 34166);
			OpenGL.glTexEnvi(8960, 34162, 8448);
			OpenGL.glTexEnvi(8960, 34186, 34166);
		}
		OpenGL.glTexEnvi(8960, 34186, 34168);
		OpenGL.glShadeModel(7425);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glColorMaterial(1028, 5634);
		OpenGL.glEnable(2903);
		float[] fs = { 0.0F, 0.0F, 0.0F, 1.0F };
		for (int i = 0; i < 8; i++) {
			int i_73_ = 16384 + i;
			OpenGL.glLightfv(i_73_, 4608, fs, 0);
			OpenGL.glLightf(i_73_, 4615, 0.0F);
			OpenGL.glLightf(i_73_, 4616, 0.0F);
		}
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.openGL.setSwapInterval(0);
		super.method5463();
	}

	public int[] eg(int i, int i_74_, int i_75_, int i_76_) {
		int[] is = new int[i_75_ * i_76_];
		int i_77_ = frameContext.getHeight();
		for (int i_78_ = 0; i_78_ < i_76_; i_78_++)
			OpenGL.glReadPixels(i, i_77_ - i_74_ - i_78_ - 1, i_75_, 1, 32993, this.anInt9841, is, i_78_ * i_75_);
		return is;
	}

	public void method5080() {
		if (frameContext != null) {
			int i = frameContext.getWidth();
			int i_79_ = frameContext.getHeight();
			if (i > 0 || i_79_ > 0) {
				int i_80_ = anInt8339;
				int i_81_ = anInt8272;
				int i_82_ = anInt8273;
				int i_83_ = anInt8239;
				resetClip();
				int i_84_ = anInt8265;
				int i_85_ = anInt8234;
				int i_86_ = anInt8263;
				int i_87_ = anInt8241;
				L();
				OpenGL.glReadBuffer(1028);
				OpenGL.glDrawBuffer(1029);
				method5336();
				method5330(false);
				method5417(false);
				method5339(false);
				method5399(false);
				method5358(null);
				method5360(1);
				method5374(0);
				OpenGL.glMatrixMode(5889);
				OpenGL.glLoadIdentity();
				OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
				OpenGL.glMatrixMode(5888);
				OpenGL.glLoadIdentity();
				OpenGL.glRasterPos2i(0, 0);
				OpenGL.glCopyPixels(0, 0, i, i_79_, 6144);
				OpenGL.glFlush();
				OpenGL.glReadBuffer(1029);
				OpenGL.glDrawBuffer(1029);
				setClip(i_84_, i_86_, i_85_, i_87_);
				method5187(i_80_, i_81_, i_82_, i_83_);
			}
		}
	}

	public void fy(int i, int i_88_) {
		int i_89_ = 0;
		if ((i & 0x1) != 0) {
			OpenGL.glClearColor((float) (i_88_ & 0xff0000) / 1.671168E7F, (float) (i_88_ & 0xff00) / 65280.0F, (float) (i_88_ & 0xff) / 255.0F, (float) (i_88_ >>> 24) / 255.0F);
			i_89_ = 16384;
		}
		if ((i & 0x2) != 0) {
			method5399(true);
			i_89_ |= 0x100;
		}
		if ((i & 0x4) != 0)
			i_89_ |= 0x400;
		OpenGL.glClear(i_89_);
	}

	public void fb(int i, int i_90_) {
		int i_91_ = 0;
		if ((i & 0x1) != 0) {
			OpenGL.glClearColor((float) (i_90_ & 0xff0000) / 1.671168E7F, (float) (i_90_ & 0xff00) / 65280.0F, (float) (i_90_ & 0xff) / 255.0F, (float) (i_90_ >>> 24) / 255.0F);
			i_91_ = 16384;
		}
		if ((i & 0x2) != 0) {
			method5399(true);
			i_91_ |= 0x100;
		}
		if ((i & 0x4) != 0)
			i_91_ |= 0x400;
		OpenGL.glClear(i_91_);
	}

	Interface9_Impl2 method5453(Class55 class55, int i, int i_92_, boolean bool, float[] fs, int i_93_, int i_94_) {
		if (this.aBoolean9838 || (StaticMethods.method6152(i) && StaticMethods.method6152(i_92_)))
			return new Class263_Sub1(this, class55, i, i_92_, bool, fs, i_93_, i_94_);
		if (this.aBoolean9837)
			return new Class263_Sub4(this, class55, i, i_92_, fs, i_93_, i_94_);
		Class263_Sub1 class263_sub1 = new Class263_Sub1(this, class55, Class77.aClass77_721, LinkedList.getNextBitValue(i), LinkedList.getNextBitValue(i_92_));
		class263_sub1.method2473(0, 0, i, i_92_, fs, class55, i_93_, i_94_);
		return class263_sub1;
	}

	public void fn(int i, int i_95_) {
		int i_96_ = 0;
		if ((i & 0x1) != 0) {
			OpenGL.glClearColor((float) (i_95_ & 0xff0000) / 1.671168E7F, (float) (i_95_ & 0xff00) / 65280.0F, (float) (i_95_ & 0xff) / 255.0F, (float) (i_95_ >>> 24) / 255.0F);
			i_96_ = 16384;
		}
		if ((i & 0x2) != 0) {
			method5399(true);
			i_96_ |= 0x100;
		}
		if ((i & 0x4) != 0)
			i_96_ |= 0x400;
		OpenGL.glClear(i_96_);
	}

	public FrameBufferContext method5138() {
		return new Class52_Sub1_Sub3_Sub1(this);
	}

	public Interface8_Impl1_Impl2 method5165(int i, int i_103_) {
		return new Class262(this, Class55.aClass55_561, Class77.aClass77_719, i, i_103_);
	}

	void method5534() {
		OpenGL.glDepthFunc(515);
		OpenGL.glEnable(2884);
		OpenGL.glCullFace(1029);
		OpenGL.glClearDepth(1.0F);
		OpenGL.glAlphaFunc(516, 0.0F);
		OpenGL.glPolygonMode(1028, 6914);
		for (int i = anInt8347 - 1; i >= 0; i--) {
			OpenGL.glActiveTexture(33984 + i);
			OpenGL.glTexEnvi(8960, 8704, 34160);
			OpenGL.glTexEnvi(8960, 34161, 8448);
			OpenGL.glTexEnvi(8960, 34178, 34166);
			OpenGL.glTexEnvi(8960, 34162, 8448);
			OpenGL.glTexEnvi(8960, 34186, 34166);
		}
		OpenGL.glTexEnvi(8960, 34186, 34168);
		OpenGL.glShadeModel(7425);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glColorMaterial(1028, 5634);
		OpenGL.glEnable(2903);
		float[] fs = { 0.0F, 0.0F, 0.0F, 1.0F };
		for (int i = 0; i < 8; i++) {
			int i_104_ = 16384 + i;
			OpenGL.glLightfv(i_104_, 4608, fs, 0);
			OpenGL.glLightf(i_104_, 4615, 0.0F);
			OpenGL.glLightf(i_104_, 4616, 0.0F);
		}
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.openGL.setSwapInterval(0);
		super.method5463();
	}

	byte[] method5535(String string) {
		return method5298("gl", string);
	}

	public void method5176() {
		if (frameContext != null) {
			int i = frameContext.getWidth();
			int i_105_ = frameContext.getHeight();
			if (i > 0 || i_105_ > 0) {
				int i_106_ = anInt8339;
				int i_107_ = anInt8272;
				int i_108_ = anInt8273;
				int i_109_ = anInt8239;
				resetClip();
				int i_110_ = anInt8265;
				int i_111_ = anInt8234;
				int i_112_ = anInt8263;
				int i_113_ = anInt8241;
				L();
				OpenGL.glReadBuffer(1028);
				OpenGL.glDrawBuffer(1029);
				method5336();
				method5330(false);
				method5417(false);
				method5339(false);
				method5399(false);
				method5358(null);
				method5360(1);
				method5374(0);
				OpenGL.glMatrixMode(5889);
				OpenGL.glLoadIdentity();
				OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
				OpenGL.glMatrixMode(5888);
				OpenGL.glLoadIdentity();
				OpenGL.glRasterPos2i(0, 0);
				OpenGL.glCopyPixels(0, 0, i, i_105_, 6144);
				OpenGL.glFlush();
				OpenGL.glReadBuffer(1029);
				OpenGL.glDrawBuffer(1029);
				setClip(i_110_, i_112_, i_111_, i_113_);
				method5187(i_106_, i_107_, i_108_, i_109_);
			}
		}
	}

	void method5375() {
		if (aBoolean8309)
			OpenGL.glEnable(3008);
		else
			OpenGL.glDisable(3008);
	}

	final synchronized void method5536(int i, int i_114_) {
		IntNode class298_sub35 = new IntNode(i_114_);
		class298_sub35.key = (long) i * 4191220306876042991L;
		this.aClass458_9817.pushBack(class298_sub35);
	}

	public final synchronized void clean(int i) {
		int i_129_ = 0;
		i &= 0x7fffffff;
		while (!this.aClass458_9817.method5970((byte) 48)) {
			IntNode class298_sub35 = (IntNode) this.aClass458_9817.method5971(1595707002);
			this.anIntArray9824[i_129_++] = (int) (class298_sub35.key * 7051297995265073167L);
			anInt8224 -= class298_sub35.capacity * -774922497;
			if (i_129_ == 1000) {
				OpenGL.glDeleteBuffersARB(i_129_, (this.anIntArray9824), 0);
				i_129_ = 0;
			}
		}
		if (i_129_ > 0) {
			OpenGL.glDeleteBuffersARB(i_129_, (this.anIntArray9824), 0);
			i_129_ = 0;
		}
		while (!this.aClass458_9818.method5970((byte) 112)) {
			IntNode class298_sub35 = (IntNode) this.aClass458_9818.method5971(1563710334);
			this.anIntArray9824[i_129_++] = (int) (class298_sub35.key * 7051297995265073167L);
			anInt8223 -= class298_sub35.capacity * -774922497;
			if (i_129_ == 1000) {
				OpenGL.glDeleteTextures(i_129_, (this.anIntArray9824), 0);
				i_129_ = 0;
			}
		}
		if (i_129_ > 0) {
			OpenGL.glDeleteTextures(i_129_, this.anIntArray9824, 0);
			i_129_ = 0;
		}
		while (!this.aClass458_9819.method5970((byte) 78)) {
			IntNode class298_sub35 = (IntNode) this.aClass458_9819.method5971(1735812614);
			this.anIntArray9824[i_129_++] = class298_sub35.capacity * -774922497;
			if (i_129_ == 1000) {
				OpenGL.glDeleteFramebuffersEXT(i_129_, (this.anIntArray9824), 0);
				i_129_ = 0;
			}
		}
		if (i_129_ > 0) {
			OpenGL.glDeleteFramebuffersEXT(i_129_, (this.anIntArray9824), 0);
			i_129_ = 0;
		}
		while (!this.aClass458_9820.method5970((byte) 88)) {
			IntNode class298_sub35 = (IntNode) this.aClass458_9820.method5971(2070970334);
			this.anIntArray9824[i_129_++] = (int) (class298_sub35.key * 7051297995265073167L);
			anInt8318 -= class298_sub35.capacity * -774922497;
			if (i_129_ == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(i_129_, (this.anIntArray9824), 0);
				i_129_ = 0;
			}
		}
		if (i_129_ > 0) {
			OpenGL.glDeleteRenderbuffersEXT(i_129_, (this.anIntArray9824), 0);
			boolean bool = false;
		}
		while (!this.aClass458_9816.method5970((byte) 72)) {
			IntNode class298_sub35 = (IntNode) this.aClass458_9816.method5971(1996234534);
			OpenGL.glDeleteLists((int) (class298_sub35.key * 7051297995265073167L), class298_sub35.capacity * -774922497);
		}
		while (!this.aClass458_9821.method5970((byte) 121)) {
			Node class298 = this.aClass458_9821.method5971(1584885862);
			OpenGL.glDeleteProgram((int) (class298.key * 7051297995265073167L));
		}
		while (!this.aClass458_9815.method5970((byte) 47)) {
			Node class298 = this.aClass458_9815.method5971(1940978688);
			OpenGL.glDeleteShader((int) (class298.key * 7051297995265073167L));
		}
		while (!this.aClass458_9816.method5970((byte) 39)) {
			IntNode class298_sub35 = (IntNode) this.aClass458_9816.method5971(1755537674);
			OpenGL.glDeleteLists((int) (class298_sub35.key * 7051297995265073167L), class298_sub35.capacity * -774922497);
		}
		if (za() > 100663296 && (TimeUtils.getTime() > this.aLong9823 + 60000L)) {
			System.gc();
			this.aLong9823 = TimeUtils.getTime();
		}
		super.clean(i);
	}

	void method5376() {
		int i = 0;
		int i_139_ = 0;
		if (anInt8366 == 0) {
			i = 0;
			i_139_ = 0;
		} else if (anInt8366 == 1) {
			i = 1;
			i_139_ = 0;
		} else if (anInt8366 == 2) {
			i = 1;
			i_139_ = 1;
		}
		if (aClass174_8268 == Class174.aClass174_1762)
			OpenGL.glBlendFuncSeparate(770, 771, i, i_139_);
		else if (aClass174_8268 == Class174.aClass174_1760)
			OpenGL.glBlendFuncSeparate(1, 1, i, i_139_);
		else if (aClass174_8268 == Class174.aClass174_1761)
			OpenGL.glBlendFuncSeparate(774, 1, i, i_139_);
	}

	public ToolkitDesciption getDescription() {
		int mode = ToolkitDesciption.DEFAULT;
		if (this.aString9833.indexOf("nvidia") != -1)
			mode = ToolkitDesciption.NVIDIA;
		else if (this.aString9833.indexOf("intel") != -1)
			mode = ToolkitDesciption.INTEL;
		else if (this.aString9833.indexOf("ati") != -1)
			mode = ToolkitDesciption.ATI;
		return new ToolkitDesciption(mode, "OpenGL", this.anInt9835, this.aString9834, 0L);
	}

	public void method5066() {
		OpenGL.glFinish();
	}

	void method5343() {
		this.aFloatArray9822[0] = aFloat8364 * aFloat8362;
		this.aFloatArray9822[1] = aFloat8364 * aFloat8289;
		this.aFloatArray9822[2] = aFloat8364 * aFloat8290;
		this.aFloatArray9822[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, this.aFloatArray9822, 0);
		this.aFloatArray9822[0] = -aFloat8293 * aFloat8362;
		this.aFloatArray9822[1] = -aFloat8293 * aFloat8289;
		this.aFloatArray9822[2] = -aFloat8293 * aFloat8290;
		this.aFloatArray9822[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, this.aFloatArray9822, 0);
	}

	Interface9_Impl2 method5353(Class55 class55, Class77 class77, int i, int i_149_) {
		return method5356(class55, class77, i, i_149_);
	}

	void method5378() {
		aFloat8336 = aFloat8308 - (float) anInt8334;
		aFloat8292 = aFloat8336 - (float) anInt8233;
		if (aFloat8292 < aFloat8261)
			aFloat8292 = aFloat8261;
		if (aBoolean8214) {
			OpenGL.glFogf(2915, aFloat8292);
			OpenGL.glFogf(2916, aFloat8336);
			this.aFloatArray9822[0] = (float) (anInt8332 & 0xff0000) / 1.671168E7F;
			this.aFloatArray9822[1] = (float) (anInt8332 & 0xff00) / 65280.0F;
			this.aFloatArray9822[2] = (float) (anInt8332 & 0xff) / 255.0F;
			OpenGL.glFogfv(2918, this.aFloatArray9822, 0);
		}
	}

	void method5341() {
		if (aBoolean8264 && !aBoolean8282)
			OpenGL.glEnable(2896);//HEXCODE: 0x0B50
		else
			OpenGL.glDisable(2896);
	}

	public void method5335(Matrix4f matrix4f) {
		float[] fs = matrix4f.aFloatArray2594;
		fs[1] = -fs[1];
		fs[5] = -fs[5];
		fs[9] = -fs[9];
		fs[13] = -fs[13];
	}

	void method5305() {
		if (aBoolean8245)
			OpenGL.glEnable(3042);
		else
			OpenGL.glDisable(3042);
	}

	static final int method5537(Class77 class77) {
		switch (class77.anInt723 * -1857088243) {
		case 3:
			return 5126;
		case 5:
			return 5122;
		case 2:
			return 5120;
		case 0:
			return 5125;
		case 1:
			return 5121;
		default:
			return 5121;
		case 6:
			return 5123;
		case 8:
			return 5124;
		case 4:
			return 5131;
		}
	}

	final synchronized void method5538(int i) {
		Node class298 = new Node();
		class298.key = (long) i * 4191220306876042991L;
		this.aClass458_9821.pushBack(class298);
	}

	final void method5369() {
		this.aFloatArray9822[0] = (float) (anInt8274 & 0xff0000) / 1.671168E7F;
		this.aFloatArray9822[1] = (float) (anInt8274 & 0xff00) / 65280.0F;
		this.aFloatArray9822[2] = (float) (anInt8274 & 0xff) / 255.0F;
		this.aFloatArray9822[3] = (float) (anInt8274 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, this.aFloatArray9822, 0);
	}
}
