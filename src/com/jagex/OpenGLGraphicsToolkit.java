package com.jagex;/* Class_ra_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.prefetch.JS5PrefetchType;
import com.jagex.maths.Matrix43f;
import com.jagex.maths.Matrix4f;
import com.jagex.utils.StringUtils;
import com.jagex.utils.TimeUtils;
import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeap;
import jaggl.OpenGL;

import java.awt.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class OpenGLGraphicsToolkit extends GraphicsToolkit {
	int anInt8007;
	int anInt8010;
	static float[] aFloatArray8017;
	String gpuName;
	int width;
	int anInt8026;
	boolean aBoolean8027;
	Matrix4f aMatrix4f_8030;
	boolean aBoolean8031;
	int color;
	Interface1 anInterface1_8037;
	boolean aBoolean8038;
	boolean aBoolean8039;
	Matrix4f aMatrix4f_8041;
	boolean aBoolean8050;
	int samples;
	Class61 aClass61_8052;
	Class27 aClass27_8054;
	Class42 aClass42_8055;
	Class298_Sub8_Sub1 aClass298_Sub8_Sub1_8056;
	Class34 aClass34_8057;
	Matrix4f aMatrix4f_8058;
	int height;
	Matrix43f aClass222_8060;
	Class49 aClass49_8061;
	int anInt8062;
	int anInt8063;
	int anInt8064;
	boolean aBoolean8065;
	int anInt8066;
	NodeCollection aClass458_8067;
	NodeCollection aClass458_8068;
	Matrix4f aMatrix4f_8069;
	int anInt8070;
	NodeCollection aClass458_8071;
	NodeCollection aClass458_8073;
	NodeCollection aClass458_8075;
	NodeCollection aClass458_8076;
	float[][] aFloatArrayArray8077;
	long aLong8078;
	static int[] anIntArray8079 = new int[1000];
	int anInt8080;
	int x;
	int anInt8082;
	boolean aBoolean8083;
	OpenGLModelToolkit[] aOpenGLModelToolkitArray8084;
	boolean aBoolean8086;
	Matrix43f aClass222_8087;
	Matrix4f aMatrix4f_8089;
	boolean aBoolean8090;
	Matrix4f aMatrix4f_8091;
	Class32 aClass32_8092;
	boolean aBoolean8093;
	float[] aFloatArray8094;
	float aFloat8095;
	float aFloat8096;
	float aFloat8097;
	float aFloat8098;
	float aFloat8099;
	float aFloat8100;
	int anInt8101;
	float aFloat8102;
	Matrix43f aClass222_8103;
	Matrix4f aMatrix4f_8104;
	float[] aFloatArray8106;
	int anInt8107;
	boolean aBoolean8108;
	int y;
	Matrix4f aMatrix4f_8110;
	Class30_Sub2_Sub1 aClass30_Sub2_Sub1_8111;
	int anInt8112;
	int anInt8113;
	int anInt8114;
	int anInt8115;
	OpenGL openGL;
	int anInt8117;
	int anInt8118 = 128;
	static int anInt8119 = 4;
	boolean aBoolean8121;
	float[] aFloatArray8122;
	float[] aFloatArray8123;
	float[] aFloatArray8124;
	float red;
	boolean aBoolean8126;
	int anInt8127;
	float green;
	float aFloat8130;
	float aFloat8131;
	float aFloat8132;
	boolean aBoolean8133;
	float aFloat8134;
	int anInt8135;
	int anInt8136;
	boolean aBoolean8137;
	boolean aBoolean8138;
	int anInt8139;
	Class30_Sub2 aClass30_Sub2_8140;
	float aFloat8142;
	boolean aBoolean8143;
	float aFloat8144;
	float aFloat8145;
	boolean aBoolean8146;
	boolean aBoolean8147;
	Class52_Sub1_Sub2 aClass52_Sub1_Sub2_8148;
	Class78 aClass78_8149;
	Interface2 anInterface2_8150;
	Interface1 anInterface1_8151;
	int anInt8152;
	NodeCollection aClass458_8153;
	int anInt8155;
	int anInt8156;
	float[] aFloatArray8157;
	Class66_Sub1 aClass66_Sub1_8159;
	float aFloat8160;
	NodeCollection aClass458_8161;
	String aString8162;
	static float[] aFloatArray8163 = new float[4];
	Light[] aClass298_Sub10Array8164;
	int anInt8165;
	boolean aBoolean8166;
	int anInt8168;
	int anInt8169;
	boolean aBoolean8170;
	boolean aBoolean8171;
	boolean aBoolean8172;
	boolean aBoolean8173;
	boolean aBoolean8174;
	int anInt8175;
	boolean aBoolean8176;
	boolean aBoolean8177;
	boolean aBoolean8178;
	boolean aBoolean8179;
	int anInt8180;
	NativeHeap aNativeHeap8181;
	Class30[] aClass30Array8182;
	boolean aBoolean8183;
	Matrix4f aMatrix4f_8184;
	boolean aBoolean8185;
	int anInt8186;
	float aFloat8187;
	float aFloat8188;
	OpenGLModelToolkit[] aOpenGLModelToolkitArray8189;
	float blue;
	Class32 aClass32_8193;
	int anInt8194;
	int anInt8195;
	int anInt8196;
	RsFloatBuffer aClass298_Sub53_Sub1_8197;
	int[] anIntArray8198;
	int[] anIntArray8199;
	int[] anIntArray8200;
	byte[] aByteArray8201;

    public static GraphicsToolkit create(Canvas canvas, MaterialRawLoader materialRawLoader, int samples) {
        return new OpenGLGraphicsToolkit(canvas, materialRawLoader, samples);
    }

    public SpriteToolkit bu(int[] pixels, int mode, int i_0_, int width, int height, boolean bool) {
		return new Class57_Sub3(this, width, height, pixels, mode, i_0_);
	}

	void method5220() {
		int i = 0;
		while (!this.openGL.f()) {
			if (i++ > 5)
				throw new RuntimeException("");
			IPAddress.method6060(1000L);
		}
	}

	int method5221() {
		int flag = 0;
		this.gpuName = OpenGL.glGetString(7936).toLowerCase();
		this.aString8162 = OpenGL.glGetString(7937).toLowerCase();
		if (this.gpuName.indexOf("microsoft") != -1)
			flag |= 0x1;
		if (this.gpuName.indexOf("brian paul") != -1 || this.gpuName.indexOf("mesa") != -1)
			flag |= 0x1;
		String string = OpenGL.glGetString(7938);
		String[] strings = Class365_Sub1_Sub3_Sub1.method4508(string.replace('.', ' '), ' ');
		if (strings.length >= 2) {
			try {
				int i_3_ = StringUtils.method1998(strings[0]);
				int i_4_ = StringUtils.method1998(strings[1]);
				this.anInt8101 = i_3_ * 10 + i_4_;
			} catch (NumberFormatException numberformatexception) {
				flag |= 0x4;
			}
		} else
			flag |= 0x4;
		if (this.anInt8101 < 12)
			flag |= 0x2;
		if (!this.openGL.a("GL_ARB_multitexture"))
			flag |= 0x8;
		if (!this.openGL.a("GL_ARB_texture_env_combine"))
			flag |= 0x20;
		int[] is = new int[1];
		OpenGL.glGetIntegerv(34018, is, 0);
		this.anInt8165 = is[0];
		OpenGL.glGetIntegerv(34929, is, 0);
		this.anInt8168 = is[0];
		OpenGL.glGetIntegerv(34930, is, 0);
		this.anInt8169 = is[0];
		if (this.anInt8165 < 2 || this.anInt8168 < 2 || this.anInt8169 < 2)
			flag |= 0x10;
		this.aBoolean8143 = Stream.r();
		this.aBoolean8126 = this.openGL.a("GL_ARB_vertex_buffer_object");
		this.aBoolean8173 = this.openGL.a("GL_ARB_multisample");
		this.aBoolean8039 = this.openGL.a("GL_ARB_vertex_program");
		this.openGL.a("GL_ARB_fragment_program");
		this.aBoolean8183 = this.openGL.a("GL_ARB_vertex_shader");
		this.aBoolean8093 = this.openGL.a("GL_ARB_fragment_shader");
		this.aBoolean8177 = this.openGL.a("GL_EXT_texture3D");
		this.aBoolean8179 = this.openGL.a("GL_ARB_texture_rectangle");
		this.aBoolean8178 = this.openGL.a("GL_ARB_texture_cube_map");
		this.aBoolean8133 = this.openGL.a("GL_ARB_texture_float");
		this.aBoolean8031 = false;
		this.aBoolean8170 = this.openGL.a("GL_EXT_framebuffer_object");
		this.aBoolean8171 = this.openGL.a("GL_EXT_framebuffer_blit");
		this.aBoolean8137 = this.openGL.a("GL_EXT_framebuffer_multisample");
		this.aBoolean8174 = (this.aBoolean8171 & this.aBoolean8137);
		this.aBoolean8166 = SystemTools.osName.startsWith("mac");
		OpenGL.glGetFloatv(2834, aFloatArray8163, 0);
		this.aFloat8188 = aFloatArray8163[0];
		this.aFloat8187 = aFloatArray8163[1];
		return flag;
	}

	void method5222() {
		this.aClass30Array8182 = new Class30[this.anInt8165];
		this.aClass30_Sub2_8140 = new Class30_Sub2(this, 3553, Class55.aClass55_557, Class77.aClass77_717, 1, 1);
		new Class30_Sub2(this, 3553, Class55.aClass55_557, Class77.aClass77_717, 1, 1);
		new Class30_Sub2(this, 3553, Class55.aClass55_557, Class77.aClass77_717, 1, 1);
		for (int i = 0; i < 7; i++) {
			this.aOpenGLModelToolkitArray8189[i] = new OpenGLModelToolkit(this);
			this.aOpenGLModelToolkitArray8084[i] = new OpenGLModelToolkit(this);
		}
		if (this.aBoolean8170) {
			this.aClass52_Sub1_Sub2_8148 = new Class52_Sub1_Sub2(this);
			new Class52_Sub1_Sub2(this);
		}
	}

	public final void updateSun(int color, float f, float f_5_, float f_6_, float f_7_, float f_8_) {
		boolean bool = this.color != color;
		if (bool || this.aFloat8131 != f || this.aFloat8132 != f_5_) {
			this.color = color;
			this.aFloat8131 = f;
			this.aFloat8132 = f_5_;
			if (bool) {
				this.red = ((float) (this.color & 0xff0000) / 1.671168E7F);
				this.green = ((float) (this.color & 0xff00) / 65280.0F);
				this.blue = ((float) (this.color & 0xff) / 255.0F);
				method5239();
			}
			method5230();
		}
		if (this.aFloatArray8122[0] != f_6_ || this.aFloatArray8122[1] != f_7_ || this.aFloatArray8122[2] != f_8_) {
			this.aFloatArray8122[0] = f_6_;
			this.aFloatArray8122[1] = f_7_;
			this.aFloatArray8122[2] = f_8_;
			this.aFloatArray8123[0] = -f_6_;
			this.aFloatArray8123[1] = -f_7_;
			this.aFloatArray8123[2] = -f_8_;
			float f_9_ = (float) (1.0 / Math.sqrt((double) (f_6_ * f_6_ + f_7_ * f_7_ + f_8_ * f_8_)));
			this.aFloatArray8124[0] = f_6_ * f_9_;
			this.aFloatArray8124[1] = f_7_ * f_9_;
			this.aFloatArray8124[2] = f_8_ * f_9_;
			this.aFloatArray8157[0] = -this.aFloatArray8124[0];
			this.aFloatArray8157[1] = -this.aFloatArray8124[1];
			this.aFloatArray8157[2] = -this.aFloatArray8124[2];
			method5279();
			this.anInt8066 = (int) (f_6_ * 256.0F / f_7_);
			this.anInt8026 = (int) (f_8_ * 256.0F / f_7_);
		}
	}

	public ToolkitDesciption getDescription() {
		int vendor = ToolkitDesciption.DEFAULT;
		if (this.gpuName.indexOf("nvidia") != -1)
			vendor = ToolkitDesciption.NVIDIA;
		else if (this.gpuName.indexOf("intel") != -1)
			vendor = ToolkitDesciption.INTEL;
		else if (this.gpuName.indexOf("ati") != -1)
			vendor = ToolkitDesciption.ATI;
		return new ToolkitDesciption(vendor, "OpenGL", this.anInt8101, this.aString8162, 0L);
	}

	void renderFrame(int i, int i_10_) throws GraphicsFrameException {
		try {
			renderContext.method580();
		} catch (Exception exception) {
			/* empty */
		}
		if (textures != null)
			textures.method176(185441622);
	}

	public void method5075() {
		OpenGL.glFinish();
	}

	void method5023() {
		for (Node class298 = this.aClass458_8067.head(); class298 != null; class298 = this.aClass458_8067.next())
			((Class_v_Sub1) class298).method3674();
		if (this.aClass42_8055 != null)
			this.aClass42_8055.method486();
		if (this.aBoolean8065) {
			StaticMethods.method2000(false, true);
			this.aBoolean8065 = false;
		}
	}

	final void method5223() {
		if (this.anInt8107 != 1) {
			this.anInt8107 = 1;
			method5240();
			method5231();
			method5276();
			OpenGL.glMatrixMode(5888);
			OpenGL.glLoadIdentity();
			this.anInt8080 &= ~0x8;
		}
	}

	public boolean method5074() {
		return true;
	}

	public boolean isResizable() {
		return true;
	}

	public boolean hasBloomToolkits() {
		return (this.aClass298_Sub8_Sub1_8056 != null && (this.samples <= 1 || this.aBoolean8174));
	}

	public boolean method4996() {
		return true;
	}

	public boolean method5082() {
		return true;
	}

	public boolean method5159() {
		return true;
	}

	boolean method5224() {
		return this.aClass27_8054.method400(3);
	}

	public boolean at() {
		return true;
	}

	public boolean method5051() {
		return false;
	}

	public void method4787(boolean bool) {
		/* empty */
	}

	void method5225() {
		method5257();
	}

	public void drawDiagonalLine(int startX, int startY, int endX, int endY, int rgba, int mode) {
		method5250();
		method5266(mode);
		float distanceX = (float) endX - (float) startX;
		float distanceY = (float) endY - (float) startY;
		if (distanceX == 0.0F && distanceY == 0.0F)
			distanceX = 1.0F;
		else {
			float f_17_ = (float) (1.0 / Math.sqrt((double) (distanceX * distanceX + distanceY * distanceY)));
			distanceX *= f_17_;
			distanceY *= f_17_;
		}
		OpenGL.glColor4ub((byte) (rgba >> 16), (byte) (rgba >> 8), (byte) rgba, (byte) (rgba >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) startX + 0.35F, (float) startY + 0.35F);
		OpenGL.glVertex2f((float) endX + distanceX + 0.35F, (float) endY + distanceY + 0.35F);
		OpenGL.glEnd();
	}

	public int[] aq(int i, int i_18_, int i_19_, int i_20_) {
		if (frameContext != null) {
			int[] is = new int[i_19_ * i_20_];
			int i_21_ = frameContext.getHeight();
			for (int i_22_ = 0; i_22_ < i_20_; i_22_++)
				OpenGL.glReadPixels(i, i_21_ - i_18_ - i_22_ - 1, i_19_, 1, 32993, this.anInt8186, is, i_22_ * i_19_);
			return is;
		}
		return null;
	}

	public void method5176() {
		if (this.aBoolean8185 && frameContext != null) {
			int i = this.x;
			int i_23_ = this.width;
			int i_24_ = this.y;
			int i_25_ = this.height;
			L();
			int i_26_ = this.anInt8115;
			int i_27_ = this.anInt8194;
			int i_28_ = this.anInt8117;
			int i_29_ = this.anInt8180;
			resetClip();
			OpenGL.glReadBuffer(1028);
			OpenGL.glDrawBuffer(1029);
			method5291();
			method5226(false);
			method5262(false);
			method5264(false);
			method5281(false);
			method5256(null);
			method5275(-2);
			method5243(1);
			method5266(0);
			OpenGL.glMatrixMode(5889);
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
			OpenGL.glMatrixMode(5888);
			OpenGL.glLoadIdentity();
			OpenGL.glRasterPos2i(0, 0);
			OpenGL.glCopyPixels(0, 0, frameContext.getWidth(), frameContext.getHeight(), 6144);
			OpenGL.glFlush();
			OpenGL.glReadBuffer(1029);
			OpenGL.glDrawBuffer(1029);
			setClip(i, i_24_, i_23_, i_25_);
			method5187(i_26_, i_27_, i_28_, i_29_);
		}
	}

	public void clear(int i, int i_30_) {
		int i_31_ = 0;
		if ((i & 0x1) != 0) {
			OpenGL.glClearColor((float) (i_30_ & 0xff0000) / 1.671168E7F, (float) (i_30_ & 0xff00) / 65280.0F, (float) (i_30_ & 0xff) / 255.0F, (float) (i_30_ >>> 24) / 255.0F);
			i_31_ = 16384;
		}
		if ((i & 0x2) != 0) {
			method5281(true);
			i_31_ |= 0x100;
		}
		if ((i & 0x4) != 0)
			i_31_ |= 0x400;
		OpenGL.glClear(i_31_);
	}

	public void drawRectangle(int startX, int startY, int endX, int endY, int rgba, int mode) {
		float f = (float) startX + 0.35F;
		float f_37_ = (float) startY + 0.35F;
		float f_38_ = f + (float) endX - 1.0F;
		float f_39_ = f_37_ + (float) endY - 1.0F;
		method5250();
		method5266(mode);
		OpenGL.glColor4ub((byte) (rgba >> 16), (byte) (rgba >> 8), (byte) rgba, (byte) (rgba >> 24));
		if (this.aBoolean8173)
			OpenGL.glDisable(32925);
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(f, f_37_);
		OpenGL.glVertex2f(f, f_39_);
		OpenGL.glVertex2f(f_38_, f_39_);
		OpenGL.glVertex2f(f_38_, f_37_);
		OpenGL.glEnd();
		if (this.aBoolean8173)
			OpenGL.glEnable(32925);
	}

	public void method5020(int i, int i_40_, float f, int i_41_, int i_42_, float f_43_, int i_44_, int i_45_, float f_46_, int i_47_, int i_48_, int i_49_, int i_50_) {
		method5250();
		method5266(i_50_);
		OpenGL.glBegin(4);
		OpenGL.glColor4ub((byte) (i_47_ >> 16), (byte) (i_47_ >> 8), (byte) i_47_, (byte) (i_47_ >> 24));
		OpenGL.glVertex3f((float) i + 0.35F, (float) i_40_ + 0.35F, f);
		OpenGL.glColor4ub((byte) (i_48_ >> 16), (byte) (i_48_ >> 8), (byte) i_48_, (byte) (i_48_ >> 24));
		OpenGL.glVertex3f((float) i_41_ + 0.35F, (float) i_42_ + 0.35F, f_43_);
		OpenGL.glColor4ub((byte) (i_49_ >> 16), (byte) (i_49_ >> 8), (byte) i_49_, (byte) (i_49_ >> 24));
		OpenGL.glVertex3f((float) i_44_ + 0.35F, (float) i_45_ + 0.35F, f_46_);
		OpenGL.glEnd();
	}

	final void method5226(boolean bool) {
		if (bool != this.aBoolean8138) {
			this.aBoolean8138 = bool;
			method5241();
			this.anInt8080 &= ~0xf;
		}
	}

	public void method5022(int i, int i_56_, int i_57_, int i_58_, int i_59_, int i_60_, ToolkitLoader toolkitLoader, int i_61_, int i_62_) {
		OpenGLToolkitLoader class_ta_sub1 = (OpenGLToolkitLoader) toolkitLoader;
		Class30_Sub2_Sub1 class30_sub2_sub1 = class_ta_sub1.aClass30_Sub2_Sub1_8441;
		method5251();
		method5256(class_ta_sub1.aClass30_Sub2_Sub1_8441);
		method5266(i_60_);
		method5258(7681, 8448);
		method5259(0, 34167, 768);
		float f = (class30_sub2_sub1.aFloat9049 / (float) class30_sub2_sub1.width);
		float f_63_ = (class30_sub2_sub1.aFloat9051 / (float) class30_sub2_sub1.height);
		float f_64_ = (float) i_57_ - (float) i;
		float f_65_ = (float) i_58_ - (float) i_56_;
		float f_66_ = (float) (1.0 / Math.sqrt((double) (f_64_ * f_64_ + f_65_ * f_65_)));
		f_64_ *= f_66_;
		f_65_ *= f_66_;
		OpenGL.glColor4ub((byte) (i_59_ >> 16), (byte) (i_59_ >> 8), (byte) i_59_, (byte) (i_59_ >> 24));
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f(f * (float) (i - i_61_), f_63_ * (float) (i_56_ - i_62_));
		OpenGL.glVertex2f((float) i + 0.35F, (float) i_56_ + 0.35F);
		OpenGL.glTexCoord2f(f * (float) (i_57_ - i_61_), f_63_ * (float) (i_58_ - i_62_));
		OpenGL.glVertex2f((float) i_57_ + f_64_ + 0.35F, (float) i_58_ + f_65_ + 0.35F);
		OpenGL.glEnd();
		method5259(0, 5890, 768);
	}

	public void method5007(int i, int i_67_, int i_68_, int i_69_, int i_70_, int i_71_, ToolkitLoader toolkitLoader, int i_72_, int i_73_, int i_74_, int i_75_, int i_76_) {
		if (i != i_68_ || i_67_ != i_69_) {
			OpenGLToolkitLoader class_ta_sub1 = (OpenGLToolkitLoader) toolkitLoader;
			Class30_Sub2_Sub1 class30_sub2_sub1 = class_ta_sub1.aClass30_Sub2_Sub1_8441;
			method5251();
			method5256(class_ta_sub1.aClass30_Sub2_Sub1_8441);
			method5266(i_71_);
			method5258(7681, 8448);
			method5259(0, 34167, 768);
			float f = (class30_sub2_sub1.aFloat9049 / (float) (class30_sub2_sub1.width));
			float f_77_ = (class30_sub2_sub1.aFloat9051 / (float) (class30_sub2_sub1.height));
			float f_78_ = (float) i_68_ - (float) i;
			float f_79_ = (float) i_69_ - (float) i_67_;
			float f_80_ = (float) (1.0 / Math.sqrt((double) (f_78_ * f_78_ + f_79_ * f_79_)));
			f_78_ *= f_80_;
			f_79_ *= f_80_;
			OpenGL.glColor4ub((byte) (i_70_ >> 16), (byte) (i_70_ >> 8), (byte) i_70_, (byte) (i_70_ >> 24));
			i_76_ %= i_75_ + i_74_;
			float f_81_ = f_78_ * (float) i_74_;
			float f_82_ = f_79_ * (float) i_74_;
			float f_83_ = 0.0F;
			float f_84_ = 0.0F;
			float f_85_ = f_81_;
			float f_86_ = f_82_;
			if (i_76_ > i_74_) {
				f_83_ = f_78_ * (float) (i_74_ + i_75_ - i_76_);
				f_84_ = f_79_ * (float) (i_74_ + i_75_ - i_76_);
			} else {
				f_85_ = f_78_ * (float) (i_74_ - i_76_);
				f_86_ = f_79_ * (float) (i_74_ - i_76_);
			}
			float f_87_ = (float) i + 0.35F + f_83_;
			float f_88_ = (float) i_67_ + 0.35F + f_84_;
			float f_89_ = f_78_ * (float) i_75_;
			float f_90_ = f_79_ * (float) i_75_;
			for (;;) {
				if (i_68_ > i) {
					if (f_87_ > (float) i_68_ + 0.35F)
						break;
					if (f_87_ + f_85_ > (float) i_68_)
						f_85_ = (float) i_68_ - f_87_;
				} else {
					if (f_87_ < (float) i_68_ + 0.35F)
						break;
					if (f_87_ + f_85_ < (float) i_68_)
						f_85_ = (float) i_68_ - f_87_;
				}
				if (i_69_ > i_67_) {
					if (f_88_ > (float) i_69_ + 0.35F)
						break;
					if (f_88_ + f_86_ > (float) i_69_)
						f_86_ = (float) i_69_ - f_88_;
				} else {
					if (f_88_ < (float) i_69_ + 0.35F)
						break;
					if (f_88_ + f_86_ < (float) i_69_)
						f_86_ = (float) i_69_ - f_88_;
				}
				OpenGL.glBegin(1);
				OpenGL.glTexCoord2f(f * (f_87_ - (float) i_72_), f_77_ * (f_88_ - (float) i_73_));
				OpenGL.glVertex2f(f_87_, f_88_);
				OpenGL.glTexCoord2f(f * (f_87_ + f_85_ - (float) i_72_), f_77_ * (f_88_ + f_86_ - (float) i_73_));
				OpenGL.glVertex2f(f_87_ + f_85_, f_88_ + f_86_);
				OpenGL.glEnd();
				f_87_ += f_89_ + f_85_;
				f_88_ += f_90_ + f_86_;
				f_85_ = f_81_;
				f_86_ = f_82_;
			}
			try {
				Class var_class = java.lang.ClassLoader.class;
				Field field = var_class.getDeclaredField("nativeLibraries");
				Class var_class_124_ = java.lang.reflect.AccessibleObject.class;
				Method method = var_class_124_.getDeclaredMethod("setAccessible", (new Class[] { Boolean.TYPE }));
				method.invoke(field, Boolean.TRUE);
			} catch (Throwable throwable) {
				/* empty */
			}
			method5259(0, 5890, 768);
		}
	}

	public void dr(float f, float f_91_, float f_92_, float[] fs) {
		float f_93_ = (this.aMatrix4f_8069.aFloatArray2594[14] + this.aMatrix4f_8069.aFloatArray2594[2] * f + (this.aMatrix4f_8069.aFloatArray2594[6] * f_91_) + (this.aMatrix4f_8069.aFloatArray2594[10] * f_92_));
		float f_94_ = (this.aMatrix4f_8069.aFloatArray2594[15] + this.aMatrix4f_8069.aFloatArray2594[3] * f + (this.aMatrix4f_8069.aFloatArray2594[7] * f_91_) + (this.aMatrix4f_8069.aFloatArray2594[11] * f_92_));
		if (f_93_ < -f_94_ || f_93_ > f_94_) {
			float[] fs_95_ = fs;
			float[] fs_96_ = fs;
			fs[2] = Float.NaN;
			fs_96_[1] = Float.NaN;
			fs_95_[0] = Float.NaN;
		} else {
			float f_97_ = (this.aMatrix4f_8069.aFloatArray2594[12] + (this.aMatrix4f_8069.aFloatArray2594[0] * f) + (this.aMatrix4f_8069.aFloatArray2594[4] * f_91_) + (this.aMatrix4f_8069.aFloatArray2594[8] * f_92_));
			if (f_97_ < -f_94_ || f_97_ > f_94_) {
				float[] fs_98_ = fs;
				float[] fs_99_ = fs;
				fs[2] = Float.NaN;
				fs_99_[1] = Float.NaN;
				fs_98_[0] = Float.NaN;
			} else {
				float f_100_ = ((this.aMatrix4f_8069.aFloatArray2594[13]) + (this.aMatrix4f_8069.aFloatArray2594[1]) * f + (this.aMatrix4f_8069.aFloatArray2594[5]) * f_91_ + (this.aMatrix4f_8069.aFloatArray2594[9]) * f_92_);
				if (f_100_ < -f_94_ || f_100_ > f_94_) {
					float[] fs_101_ = fs;
					float[] fs_102_ = fs;
					fs[2] = Float.NaN;
					fs_102_[1] = Float.NaN;
					fs_101_[0] = Float.NaN;
				} else {
					float f_103_ = ((this.aMatrix4f_8110.aFloatArray2594[14]) + (this.aMatrix4f_8110.aFloatArray2594[2]) * f + (this.aMatrix4f_8110.aFloatArray2594[6]) * f_91_ + (this.aMatrix4f_8110.aFloatArray2594[10]) * f_92_);
					fs[0] = (this.aFloat8095 + (this.aFloat8096 * f_97_ / f_94_));
					fs[1] = (this.aFloat8097 + (this.aFloat8098 * f_100_ / f_94_));
					fs[2] = f_103_;
				}
			}
		}
	}

	public int method5025(int i, int i_104_, int i_105_, int i_106_, int i_107_, int i_108_) {
		int i_109_ = 0;
		float f = (this.aMatrix4f_8069.aFloatArray2594[14] + (this.aMatrix4f_8069.aFloatArray2594[2] * (float) i) + (this.aMatrix4f_8069.aFloatArray2594[6] * (float) i_104_) + (this.aMatrix4f_8069.aFloatArray2594[10] * (float) i_105_));
		float f_110_ = (this.aMatrix4f_8069.aFloatArray2594[14] + (this.aMatrix4f_8069.aFloatArray2594[2] * (float) i_106_) + (this.aMatrix4f_8069.aFloatArray2594[6] * (float) i_107_) + (this.aMatrix4f_8069.aFloatArray2594[10] * (float) i_108_));
		float f_111_ = (this.aMatrix4f_8069.aFloatArray2594[15] + (this.aMatrix4f_8069.aFloatArray2594[3] * (float) i) + (this.aMatrix4f_8069.aFloatArray2594[7] * (float) i_104_) + (this.aMatrix4f_8069.aFloatArray2594[11] * (float) i_105_));
		float f_112_ = (this.aMatrix4f_8069.aFloatArray2594[15] + (this.aMatrix4f_8069.aFloatArray2594[3] * (float) i_106_) + (this.aMatrix4f_8069.aFloatArray2594[7] * (float) i_107_) + (this.aMatrix4f_8069.aFloatArray2594[11] * (float) i_108_));
		if (f < -f_111_ && f_110_ < -f_112_)
			i_109_ |= 0x10;
		else if (f > f_111_ && f_110_ > f_112_)
			i_109_ |= 0x20;
		float f_113_ = (this.aMatrix4f_8069.aFloatArray2594[12] + (this.aMatrix4f_8069.aFloatArray2594[0] * (float) i) + (this.aMatrix4f_8069.aFloatArray2594[4] * (float) i_104_) + (this.aMatrix4f_8069.aFloatArray2594[8] * (float) i_105_));
		float f_114_ = (this.aMatrix4f_8069.aFloatArray2594[12] + (this.aMatrix4f_8069.aFloatArray2594[0] * (float) i_106_) + (this.aMatrix4f_8069.aFloatArray2594[4] * (float) i_107_) + (this.aMatrix4f_8069.aFloatArray2594[8] * (float) i_108_));
		if (f_113_ < -f_111_ && f_114_ < -f_112_)
			i_109_ |= 0x1;
		if (f_113_ > f_111_ && f_114_ > f_112_)
			i_109_ |= 0x2;
		float f_115_ = (this.aMatrix4f_8069.aFloatArray2594[13] + (this.aMatrix4f_8069.aFloatArray2594[1] * (float) i) + (this.aMatrix4f_8069.aFloatArray2594[5] * (float) i_104_) + (this.aMatrix4f_8069.aFloatArray2594[9] * (float) i_105_));
		float f_116_ = (this.aMatrix4f_8069.aFloatArray2594[13] + (this.aMatrix4f_8069.aFloatArray2594[1] * (float) i_106_) + (this.aMatrix4f_8069.aFloatArray2594[5] * (float) i_107_) + (this.aMatrix4f_8069.aFloatArray2594[9] * (float) i_108_));
		if (f_115_ < -f_111_ && f_116_ < -f_112_)
			i_109_ |= 0x4;
		if (f_115_ > f_111_ && f_116_ > f_112_)
			i_109_ |= 0x8;
		return i_109_;
	}

	public Heap createNativeHeap(int i) {
		Class_v_Sub1 class_v_sub1 = new Class_v_Sub1(i);
		this.aClass458_8067.pushBack(class_v_sub1);
		return class_v_sub1;
	}

	public void setBufferHeap(Heap class_v) {
		this.aNativeHeap8181 = ((Class_v_Sub1) class_v).aNativeHeap9783;
		if (this.anInterface1_8037 == null) {
			RsFloatBuffer class298_sub53_sub1 = new RsFloatBuffer(80);
			if (this.aBoolean8143) {
				class298_sub53_sub1.method3658(-1.0F);
				class298_sub53_sub1.method3658(-1.0F);
				class298_sub53_sub1.method3658(0.0F);
				class298_sub53_sub1.method3658(0.0F);
				class298_sub53_sub1.method3658(0.0F);
				class298_sub53_sub1.method3658(-1.0F);
				class298_sub53_sub1.method3658(1.0F);
				class298_sub53_sub1.method3658(0.0F);
				class298_sub53_sub1.method3658(0.0F);
				class298_sub53_sub1.method3658(1.0F);
				class298_sub53_sub1.method3658(1.0F);
				class298_sub53_sub1.method3658(1.0F);
				class298_sub53_sub1.method3658(0.0F);
				class298_sub53_sub1.method3658(1.0F);
				class298_sub53_sub1.method3658(1.0F);
				class298_sub53_sub1.method3658(1.0F);
				class298_sub53_sub1.method3658(-1.0F);
				class298_sub53_sub1.method3658(0.0F);
				class298_sub53_sub1.method3658(1.0F);
				class298_sub53_sub1.method3658(0.0F);
			} else {
				class298_sub53_sub1.method3659(-1.0F);
				class298_sub53_sub1.method3659(-1.0F);
				class298_sub53_sub1.method3659(0.0F);
				class298_sub53_sub1.method3659(0.0F);
				class298_sub53_sub1.method3659(0.0F);
				class298_sub53_sub1.method3659(-1.0F);
				class298_sub53_sub1.method3659(1.0F);
				class298_sub53_sub1.method3659(0.0F);
				class298_sub53_sub1.method3659(0.0F);
				class298_sub53_sub1.method3659(1.0F);
				class298_sub53_sub1.method3659(1.0F);
				class298_sub53_sub1.method3659(1.0F);
				class298_sub53_sub1.method3659(0.0F);
				class298_sub53_sub1.method3659(1.0F);
				class298_sub53_sub1.method3659(1.0F);
				class298_sub53_sub1.method3659(1.0F);
				class298_sub53_sub1.method3659(-1.0F);
				class298_sub53_sub1.method3659(0.0F);
				class298_sub53_sub1.method3659(1.0F);
				class298_sub53_sub1.method3659(0.0F);
			}
			this.anInterface1_8037 = method5244(20, class298_sub53_sub1.buffer, class298_sub53_sub1.offset * 385051775, false);
			this.aClass32_8092 = new Class32(this.anInterface1_8037, 5126, 3, 0);
			this.aClass32_8193 = new Class32(this.anInterface1_8037, 5126, 2, 12);
			this.aClass34_8057.method439(this);
		}
	}

	final void method5227(float[] fs) {
		float[] fs_117_ = new float[16];
		System.arraycopy(fs, 0, fs_117_, 0, 16);
		fs_117_[1] = -fs_117_[1];
		fs_117_[5] = -fs_117_[5];
		fs_117_[9] = -fs_117_[9];
		fs_117_[13] = -fs_117_[13];
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(fs_117_, 0);
		OpenGL.glMatrixMode(5888);
	}

	public SpriteToolkit createSpriteToolkit(Sprite sprite, boolean loaded) {
		int[] is = new int[sprite.width * sprite.height];
		int i = 0;
		int i_118_ = 0;
		if (sprite.alpha != null) {
			for (int i_119_ = 0; i_119_ < sprite.height; i_119_++) {
				for (int i_120_ = 0; i_120_ < sprite.width; i_120_++) {
					is[i_118_++] = (sprite.alpha[i] << 24 | (sprite.palette[sprite.raster[i] & 0xff]));
					i++;
				}
			}
		} else {
			for (int i_121_ = 0; i_121_ < sprite.height; i_121_++) {
				for (int i_122_ = 0; i_122_ < sprite.width; i_122_++) {
					int i_123_ = (sprite.palette[sprite.raster[i++] & 0xff]);
					is[i_118_++] = i_123_ != 0 ? ~0xffffff | i_123_ : 0;
				}
			}
		}
		SpriteToolkit class57 = createRenderSprite(is, 0, sprite.width, sprite.width, sprite.height);
		class57.method621(sprite.offsetX, sprite.offsetY, sprite.deltaWidth, sprite.deltaHeight);
		return class57;
	}

	public SpriteToolkit method5033(int i, int i_124_, int i_125_, int i_126_, boolean bool) {
		return new Class57_Sub3(this, i, i_124_, i_125_, i_126_);
	}

	static int method5228(Class55 class55) {
		switch (class55.anInt566 * -976336893) {
		case 5:
			return 6407;
		case 2:
			return 6402;
		case 1:
			return 6409;
		case 9:
			return 6408;
		default:
			throw new IllegalStateException();
		case 7:
			return 6406;
		case 3:
			return 6410;
		}
	}

	public FontToolkit createFontToolkit(RSFontMetrics RSFontMetrics, Sprite[] sprites, boolean loaded) {
		return new OpenGLFontToolkit(this, RSFontMetrics, sprites, loaded);
	}

	public void method5169(int i) {
		/* empty */
	}

	public ModelToolkit creatModelToolkit(BaseModel model, int mask, int i_127_, int width, int height) {
		return new OpenGLModelToolkit(this, model, mask, width, height, i_127_);
	}

	final synchronized void method5229(int i, int i_130_) {
		IntNode class298_sub35 = new IntNode(i_130_);
		class298_sub35.key = (long) i * 4191220306876042991L;
		this.aClass458_8073.pushBack(class298_sub35);
	}

	public int method5004(int i, int i_131_) {
		return i | i_131_;
	}

	public Matrix4f cz() {
		return this.aMatrix4f_8058;
	}

	public Matrix43f getTransformationMatrix() {
		return this.aClass222_8060;
	}

	public void setLights(int i, Light[] class298_sub10s) {
		for (int i_137_ = 0; i_137_ < i; i_137_++)
			this.aClass298_Sub10Array8164[i_137_] = class298_sub10s[i_137_];
		this.anInt8135 = i;
		if (this.anInt8107 != 1)
			method5277();
	}

	public void method5058(int i, Class78 class78) {
		if (!this.aBoolean8146)
			throw new RuntimeException("");
		this.anInt8155 = i;
		this.aClass78_8149 = class78;
		if (this.aBoolean8147) {
			this.aClass27_8054.aClass47_Sub5_358.method524();
			this.aClass27_8054.aClass47_Sub5_358.method523();
		}
	}

	public void O() {
		this.aBoolean8146 = false;
	}

	public void method5187(int i, int i_144_, int i_145_, int i_146_) {
		this.anInt8115 = i;
		this.anInt8194 = i_144_;
		this.anInt8117 = i_145_;
		this.anInt8180 = i_146_;
		method5231();
	}

	void method5230() {
		aFloatArray8163[0] = (this.aFloat8131 * this.red);
		aFloatArray8163[1] = (this.aFloat8131 * this.green);
		aFloatArray8163[2] = (this.aFloat8131 * this.blue);
		aFloatArray8163[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, aFloatArray8163, 0);
		aFloatArray8163[0] = (-this.aFloat8132 * this.red);
		aFloatArray8163[1] = (-this.aFloat8132 * this.green);
		aFloatArray8163[2] = (-this.aFloat8132 * this.blue);
		aFloatArray8163[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, aFloatArray8163, 0);
	}

	public final void setClip(int x, int y, int width, int height) {
		if (frameContext != null) {
			if (x < 0)
				x = 0;
			if (width > frameContext.getWidth())
				width = frameContext.getWidth();
			if (y < 0)
				y = 0;
			if (height > frameContext.getHeight())
				height = frameContext.getHeight();
			this.x = x;
			this.y = y;
			this.width = width;
			this.height = height;
			OpenGL.glEnable(3089);
			method5232();
		}
	}

	public final void constrainClip(int x, int y, int width, int height) {
		if (this.x < x)
			this.x = x;
		if (this.width > width)
			this.width = width;
		if (this.y < y)
			this.y = y;
		if (this.height > height)
			this.height = height;
		OpenGL.glEnable(3089);
		method5232();
	}

	public final void a(EnvironmentMap class66) {
		this.aClass66_Sub1_8159 = (Class66_Sub1) class66;
	}

	final void method5231() {
		if (frameContext != null) {
			int i;
			int i_165_;
			int i_166_;
			int i_167_;
			if (this.anInt8107 == 2) {
				i = this.anInt8115;
				i_165_ = this.anInt8194;
				i_166_ = this.anInt8117;
				i_167_ = this.anInt8180;
			} else {
				i = 0;
				i_165_ = 0;
				i_166_ = frameContext.getWidth();
				i_167_ = frameContext.getHeight();
			}
			if (i_166_ < 1)
				i_166_ = 1;
			if (i_167_ < 1)
				i_167_ = 1;
			OpenGL.glViewport(this.anInt8113 + i, (this.anInt8114 + frameContext.getHeight() - i_165_ - i_167_), i_166_, i_167_);
			this.aFloat8096 = (float) this.anInt8117 / 2.0F;
			this.aFloat8098 = (float) this.anInt8180 / 2.0F;
			this.aFloat8095 = ((float) this.anInt8115 + this.aFloat8096);
			this.aFloat8097 = ((float) this.anInt8194 + this.aFloat8098);
		}
	}

	final void method5232() {
		if (frameContext != null && (this.x < this.width) && (this.y < this.height))
			OpenGL.glScissor((this.anInt8113 + this.x), (this.anInt8114 + frameContext.getHeight() - this.height), (this.width - this.x), (this.height - this.y));
		else
			OpenGL.glScissor(0, 0, 0, 0);
	}

	final void method5233(Matrix4f matrix4f) {
		OpenGL.glLoadMatrixf(matrix4f.aFloatArray2594, 0);
	}

	public final void cw(Matrix43f class222) {
		this.aClass222_8087.copy(class222);
		this.aMatrix4f_8110.method2145(this.aClass222_8087);
		this.aClass222_8103.copy(class222);
		this.aClass222_8103.method2058();
		this.aMatrix4f_8089.method2145(this.aClass222_8103);
		method5235();
		if (this.anInt8107 != 1)
			method5234();
	}

	public Matrix43f method5044() {
		return new Matrix43f(this.aClass222_8087);
	}

	final void method5234() {
		OpenGL.glLoadIdentity();
		OpenGL.glMultMatrixf((this.aMatrix4f_8110.aFloatArray2594), 0);
		if (this.aBoolean8147)
			this.aClass27_8054.aClass47_Sub5_358.method524();
		method5279();
		method5277();
	}

	public final void ci(Matrix4f matrix4f) {
		this.aMatrix4f_8041.method2142(matrix4f);
		method5235();
		method5240();
	}

	final void method5235() {
		this.aMatrix4f_8069.method2142(this.aMatrix4f_8110);
		this.aMatrix4f_8069.method2144(this.aMatrix4f_8041);
		this.aMatrix4f_8069.method2157(this.aFloatArrayArray8077[0]);
		this.aMatrix4f_8069.method2158(this.aFloatArrayArray8077[1]);
		this.aMatrix4f_8069.method2156(this.aFloatArrayArray8077[2]);
		this.aMatrix4f_8069.method2170(this.aFloatArrayArray8077[3]);
		this.aMatrix4f_8069.method2171(this.aFloatArrayArray8077[4]);
		this.aMatrix4f_8069.method2163(this.aFloatArrayArray8077[5]);
	}

	public void drawThickDiagonalLine(int startX, int startY, int endX, int endY, int rgba, int lineWidth, int mode) {
		OpenGL.glLineWidth((float) lineWidth);
		drawDiagonalLine(startX, startY, endX, endY, rgba, mode);
		OpenGL.glLineWidth(1.0F);
	}

	public void RA(boolean bool) {
		this.aBoolean8108 = bool;
		method5265();
	}

	public int method5048() {
		return 4;
	}

	final void method5236() {
		OpenGL.glPushMatrix();
	}

	final void method5237() {
		if (this.anInt8107 != 2) {
			this.anInt8107 = 2;
			method5227(this.aMatrix4f_8041.aFloatArray2594);
			method5234();
			method5231();
			method5276();
			this.anInt8080 &= ~0x7;
		}
	}

	public boolean isMultisampled() {
		return (this.aBoolean8173 && (!method5054() || this.aBoolean8174));
	}

	public final void drawFog(int color, int intensity, int i_207_) {
		if (this.anInt8139 != color || this.anInt8007 != intensity || this.anInt8195 != i_207_) {
			this.anInt8139 = color;
			this.anInt8007 = intensity;
			this.anInt8195 = i_207_;
			method5242();
			method5241();
		}
	}

	final void method5238(float f, float f_208_) {
		this.aFloat8144 = f;
		this.aFloat8145 = f_208_;
		method5242();
	}

	void method5239() {
		aFloatArray8163[0] = (this.aFloat8130 * this.red);
		aFloatArray8163[1] = (this.aFloat8130 * this.green);
		aFloatArray8163[2] = (this.aFloat8130 * this.blue);
		aFloatArray8163[3] = 1.0F;
		OpenGL.glLightModelfv(2899, aFloatArray8163, 0);
	}

	final void method5240() {
		this.aFloat8102 = this.aMatrix4f_8041.method2155();
		this.aFloat8134 = this.aMatrix4f_8041.method2154();
		method5242();
		if (this.anInt8107 == 2)
			method5227(this.aMatrix4f_8041.aFloatArray2594);
		else if (this.anInt8107 == 1)
			method5227(this.aMatrix4f_8091.aFloatArray2594);
	}

	void method5241() {
		if (this.aBoolean8138 && this.anInt8007 >= 0)
			OpenGL.glEnable(2912);
		else
			OpenGL.glDisable(2912);
	}

	void method5242() {
		this.aFloat8160 = (this.aFloat8102 - (float) this.anInt8195 - this.aFloat8145);
		this.aFloat8142 = (this.aFloat8160 - ((float) this.anInt8007 * this.aFloat8144));
		if (this.aFloat8142 < this.aFloat8134)
			this.aFloat8142 = this.aFloat8134;
		OpenGL.glFogf(2915, this.aFloat8142);
		OpenGL.glFogf(2916, this.aFloat8160);
		aFloatArray8163[0] = (float) (this.anInt8139 & 0xff0000) / 1.671168E7F;
		aFloatArray8163[1] = (float) (this.anInt8139 & 0xff00) / 65280.0F;
		aFloatArray8163[2] = (float) (this.anInt8139 & 0xff) / 255.0F;
		OpenGL.glFogfv(2918, aFloatArray8163, 0);
	}

	final void method5243(int i) {
		if (i == 1)
			method5258(7681, 7681);
		else if (i == 0)
			method5258(8448, 8448);
		else if (i == 2)
			method5258(34165, 7681);
		else if (i == 3)
			method5258(260, 8448);
		else if (i == 4)
			method5258(34023, 34023);
	}

	public EnvironmentMap createEnvironmentMap(int i, int i_209_, int i_210_, int i_211_, int i_212_, int i_213_) {
		return (this.aBoolean8178 ? new Class66_Sub1_Sub1(this, i, i_209_, i_210_, i_211_, i_212_, i_213_) : null);
	}

	public EnvironmentMap method5179(EnvironmentMap class66, EnvironmentMap class66_214_, float f, EnvironmentMap class66_215_) {
		if (class66 != null && class66_214_ != null && this.aBoolean8178 && this.aBoolean8170) {
			Class66_Sub1_Sub2 class66_sub1_sub2 = null;
			Class66_Sub1 class66_sub1 = (Class66_Sub1) class66;
			Class66_Sub1 class66_sub1_216_ = (Class66_Sub1) class66_214_;
			Class30_Sub1 class30_sub1 = class66_sub1.method769();
			Class30_Sub1 class30_sub1_217_ = class66_sub1_216_.method769();
			if (class30_sub1 != null && class30_sub1_217_ != null) {
				int i = ((class30_sub1.anInt6745 > class30_sub1_217_.anInt6745) ? class30_sub1.anInt6745 : class30_sub1_217_.anInt6745);
				if (class66 != class66_215_ && class66_214_ != class66_215_ && class66_215_ instanceof Class66_Sub1_Sub2) {
					Class66_Sub1_Sub2 class66_sub1_sub2_218_ = (Class66_Sub1_Sub2) class66_215_;
					if (class66_sub1_sub2_218_.method771() == i)
						class66_sub1_sub2 = class66_sub1_sub2_218_;
				}
				if (class66_sub1_sub2 == null)
					class66_sub1_sub2 = new Class66_Sub1_Sub2(this, i);
				if (class66_sub1_sub2.method772(class30_sub1, class30_sub1_217_, f))
					return class66_sub1_sub2;
			}
		}
		return f < 0.5F ? class66 : class66_214_;
	}

	public ToolkitLoader createClippingMask(int i, int i_232_, int[] is, int[] is_233_) {
		return OpenGLToolkitLoader.method5999(this, i, i_232_, is, is_233_);
	}

	public final boolean method5054() {
		return (this.aClass298_Sub8_Sub1_8056 != null && this.aClass298_Sub8_Sub1_8056.method2886());
	}

	final void method5188(float f, float f_234_, float f_235_, float f_236_, float f_237_, float f_238_) {
		Class298_Sub8_Sub1.aFloat9173 = f;
		Class298_Sub8_Sub1.aFloat9172 = f_234_;
		Class298_Sub8_Sub1.aFloat9171 = f_235_;
	}

	public final void method5056(int i, int i_239_, int i_240_, int i_241_) {
		this.aClass42_8055.method481(i, i_239_, i_240_, i_241_);
	}

	public final void method5112() {
		this.aClass42_8055.method483();
	}

	public FrameBufferContext method5094() {
		return new Class52_Sub1_Sub2(this);
	}

	final Interface1 method5244(int i, byte[] is, int i_242_, boolean bool) {
		if (this.aBoolean8126 && (!bool || this.aBoolean8176))
			return new Class40_Sub2(this, i, is, i_242_, bool);
		return new Class46_Sub2(this, i, is, i_242_);
	}

	final Interface1 method5245(int i, Buffer buffer, int i_243_, boolean bool) {
		if (this.aBoolean8126 && (!bool || this.aBoolean8176))
			return new Class40_Sub2(this, i, buffer, i_243_, bool);
		return new Class46_Sub2(this, i, buffer);
	}

	final void method5246(Interface1 interface1) {
		if (this.anInterface1_8151 != interface1) {
			if (this.aBoolean8126)
				OpenGL.glBindBufferARB(34962, interface1.method10());
			this.anInterface1_8151 = interface1;
		}
	}

	final void method5247(Interface2 interface2) {
		if (this.anInterface2_8150 != interface2) {
			if (this.aBoolean8126)
				OpenGL.glBindBufferARB(34963, interface2.method26());
			this.anInterface2_8150 = interface2;
		}
	}

	final void method5248(Class32 class32, Class32 class32_244_, Class32 class32_245_, Class32 class32_246_) {
		if (class32 != null) {
			method5246(class32.anInterface1_397);
			OpenGL.glVertexPointer(class32.aByte396, class32.aShort395, this.anInterface1_8151.method15(), (this.anInterface1_8151.method16() + (long) class32.aByte398));
			OpenGL.glEnableClientState(32884);
		} else
			OpenGL.glDisableClientState(32884);
		if (class32_244_ != null) {
			method5246(class32_244_.anInterface1_397);
			OpenGL.glNormalPointer(class32_244_.aShort395, this.anInterface1_8151.method15(), (this.anInterface1_8151.method16() + (long) class32_244_.aByte398));
			OpenGL.glEnableClientState(32885);
		} else
			OpenGL.glDisableClientState(32885);
		if (class32_245_ != null) {
			method5246(class32_245_.anInterface1_397);
			OpenGL.glColorPointer(class32_245_.aByte396, class32_245_.aShort395, this.anInterface1_8151.method15(), (this.anInterface1_8151.method16() + (long) class32_245_.aByte398));
			OpenGL.glEnableClientState(32886);
		} else
			OpenGL.glDisableClientState(32886);
		if (class32_246_ != null) {
			method5246(class32_246_.anInterface1_397);
			OpenGL.glTexCoordPointer(class32_246_.aByte396, class32_246_.aShort395, this.anInterface1_8151.method15(), (this.anInterface1_8151.method16() + (long) class32_246_.aByte398));
			OpenGL.glEnableClientState(32888);
		} else
			OpenGL.glDisableClientState(32888);
	}

	final synchronized void method5249(int i) {
		IntNode class298_sub35 = new IntNode(i);
		this.aClass458_8068.pushBack(class298_sub35);
	}

	final void method5250() {
		if (this.anInt8080 != 1) {
			method5223();
			method5226(false);
			method5262(false);
			method5264(false);
			method5281(false);
			method5256(null);
			method5275(-2);
			method5243(1);
			this.anInt8080 = 1;
		}
	}

	final void method5251() {
		if (this.anInt8080 != 2) {
			method5223();
			method5226(false);
			method5262(false);
			method5264(false);
			method5281(false);
			method5275(-2);
			this.anInt8080 = 2;
		}
	}

	final void method5252() {
		if (this.anInt8080 != 8) {
			method5237();
			method5226(true);
			method5264(true);
			method5281(true);
			method5266(1);
			this.anInt8080 = 8;
		}
	}

	final void method5253(int i, boolean bool) {
		method5278(i, bool, true);
	}

	final void method5254(Interface2 interface2, int mode, int i_252_, int count) {
		method5247(interface2);
		/*
		 * GL_UNSIGNED_SHORT INT16ARRAY
		 */
		OpenGL.glDrawElements(mode, count, 5123, interface2.method20() + (long) (i_252_ * 2));
	}

	final void method5255(int i) {
		if (this.anInt8156 != i) {
			OpenGL.glActiveTexture(33984 + i);
			this.anInt8156 = i;
		}
	}

	/**
	 * @author - David
	 * @edited - Reggie
	 */
	final void method5256(Class30 class30) {
		Class30 class30_254_ = (this.aClass30Array8182[this.anInt8156]);
		if (class30_254_ != class30) {
			if (class30 != null) {
				if (class30_254_ != null) {
					if (class30.anInt372 != class30_254_.anInt372) {
						OpenGL.glDisable(class30_254_.anInt372);
						OpenGL.glEnable(class30.anInt372);
					}
				} else
					OpenGL.glEnable(class30.anInt372);
				OpenGL.glBindTexture(class30.anInt372, class30.anInt376);
			} else
				OpenGL.glDisable(class30_254_.anInt372);
			this.aClass30Array8182[(this.anInt8156)] = class30;
		}
		this.anInt8080 &= ~0x1;
	}

	void method5257() {
		int i = frameContext.getWidth();
		int i_255_ = frameContext.getHeight();
		this.aMatrix4f_8091.method2151(0.0F, (float) i, 0.0F, (float) i_255_, -1.0F, 1.0F);
		resetClip();
		method5291();
		L();
	}

	public final void qa(int[] is) {
		is[0] = this.x;
		is[1] = this.y;
		is[2] = this.width;
		is[3] = this.height;
	}

	final void method5258(int i, int i_256_) {
		if (this.anInt8156 == 0) {
			boolean bool = false;
			if (this.anInt8136 != i) {
				OpenGL.glTexEnvi(8960, 34161, i);
				this.anInt8136 = i;
				bool = true;
			}
			if (this.anInt8010 != i_256_) {
				OpenGL.glTexEnvi(8960, 34162, i_256_);
				this.anInt8010 = i_256_;
				bool = true;
			}
			if (bool)
				this.anInt8080 &= ~0xd;
		} else {
			OpenGL.glTexEnvi(8960, 34161, i);
			OpenGL.glTexEnvi(8960, 34162, i_256_);
		}
	}

	final void method5259(int i, int i_257_, int i_258_) {
		OpenGL.glTexEnvi(8960, 34176 + i, i_257_);
		OpenGL.glTexEnvi(8960, 34192 + i, i_258_);
	}

	final void method5260(float f, float f_271_, float f_272_, float f_273_) {
		aFloatArray8163[0] = f;
		aFloatArray8163[1] = f_271_;
		aFloatArray8163[2] = f_272_;
		aFloatArray8163[3] = f_273_;
		OpenGL.glTexEnvfv(8960, 8705, aFloatArray8163, 0);
	}

	final void method5261(float f, float f_274_, float f_275_) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean8090)
			OpenGL.glLoadIdentity();
		OpenGL.glTranslatef(f, f_274_, f_275_);
		OpenGL.glMatrixMode(5888);
		this.aBoolean8090 = true;
	}

	public void method_do(float f, float f_276_, float f_277_, float[] fs) {
		float f_278_ = (this.aMatrix4f_8069.aFloatArray2594[15] + this.aMatrix4f_8069.aFloatArray2594[3] * f + (this.aMatrix4f_8069.aFloatArray2594[7] * f_276_) + (this.aMatrix4f_8069.aFloatArray2594[11] * f_277_));
		float f_279_ = (this.aMatrix4f_8069.aFloatArray2594[12] + this.aMatrix4f_8069.aFloatArray2594[0] * f + (this.aMatrix4f_8069.aFloatArray2594[4] * f_276_) + (this.aMatrix4f_8069.aFloatArray2594[8] * f_277_));
		float f_280_ = (this.aMatrix4f_8069.aFloatArray2594[13] + this.aMatrix4f_8069.aFloatArray2594[1] * f + (this.aMatrix4f_8069.aFloatArray2594[5] * f_276_) + (this.aMatrix4f_8069.aFloatArray2594[9] * f_277_));
		float f_281_ = (this.aMatrix4f_8110.aFloatArray2594[14] + this.aMatrix4f_8110.aFloatArray2594[2] * f + (this.aMatrix4f_8110.aFloatArray2594[6] * f_276_) + (this.aMatrix4f_8110.aFloatArray2594[10] * f_277_));
		fs[0] = (this.aFloat8095 + this.aFloat8096 * f_279_ / f_278_);
		fs[1] = (this.aFloat8097 + this.aFloat8098 * f_280_ / f_278_);
		fs[2] = f_281_;
	}

	final void method5262(boolean bool) {
		if (bool != this.aBoolean8050) {
			this.aBoolean8050 = bool;
			method5290();
			this.anInt8080 &= ~0x7;
		}
	}

	final void method5263(boolean bool) {
		if (bool != this.aBoolean8027) {
			this.aBoolean8027 = bool;
			method5290();
		}
	}

	final void method5264(boolean bool) {
		if (bool != this.aBoolean8121) {
			if (bool)
				OpenGL.glEnable(2929);
			else
				OpenGL.glDisable(2929);
			this.aBoolean8121 = bool;
			this.anInt8080 &= ~0xf;
		}
	}

	public final synchronized void clean(int i) {
		int i_282_ = 0;
		i &= 0x7fffffff;
		while (!this.aClass458_8153.method5970((byte) 109)) {
			IntNode class298_sub35 = (IntNode) this.aClass458_8153.method5971(1624694038);
			anIntArray8079[i_282_++] = (int) (class298_sub35.key * 7051297995265073167L);
			this.anInt8112 -= class298_sub35.capacity * -774922497;
			if (i_282_ == 1000) {
				OpenGL.glDeleteBuffersARB(i_282_, anIntArray8079, 0);
				i_282_ = 0;
			}
		}
		if (i_282_ > 0) {
			OpenGL.glDeleteBuffersARB(i_282_, anIntArray8079, 0);
			i_282_ = 0;
		}
		while (!this.aClass458_8073.method5970((byte) 109)) {
			IntNode class298_sub35 = (IntNode) this.aClass458_8073.method5971(1990742795);
			anIntArray8079[i_282_++] = (int) (class298_sub35.key * 7051297995265073167L);
			this.anInt8175 -= class298_sub35.capacity * -774922497;
			if (i_282_ == 1000) {
				OpenGL.glDeleteTextures(i_282_, anIntArray8079, 0);
				i_282_ = 0;
			}
		}
		if (i_282_ > 0) {
			OpenGL.glDeleteTextures(i_282_, anIntArray8079, 0);
			i_282_ = 0;
		}
		while (!this.aClass458_8068.method5970((byte) 124)) {
			IntNode class298_sub35 = (IntNode) this.aClass458_8068.method5971(1696221823);
			anIntArray8079[i_282_++] = class298_sub35.capacity * -774922497;
			if (i_282_ == 1000) {
				OpenGL.glDeleteFramebuffersEXT(i_282_, anIntArray8079, 0);
				i_282_ = 0;
			}
		}
		if (i_282_ > 0) {
			OpenGL.glDeleteFramebuffersEXT(i_282_, anIntArray8079, 0);
			i_282_ = 0;
		}
		while (!this.aClass458_8075.method5970((byte) 109)) {
			IntNode class298_sub35 = (IntNode) this.aClass458_8075.method5971(1834890584);
			anIntArray8079[i_282_++] = (int) (class298_sub35.key * 7051297995265073167L);
			this.anInt8070 -= class298_sub35.capacity * -774922497;
			if (i_282_ == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(i_282_, anIntArray8079, 0);
				i_282_ = 0;
			}
		}
		if (i_282_ > 0) {
			OpenGL.glDeleteRenderbuffersEXT(i_282_, anIntArray8079, 0);
		}
		while (!this.aClass458_8071.method5970((byte) 104)) {
			IntNode class298_sub35 = (IntNode) this.aClass458_8071.method5971(1957497379);
			OpenGL.glDeleteLists((int) (class298_sub35.key * 7051297995265073167L), class298_sub35.capacity * -774922497);
		}
		while (!this.aClass458_8076.method5970((byte) 76)) {
			Node class298 = this.aClass458_8076.method5971(1672075374);
			OpenGL.glDeleteProgramARB((int) (class298.key * 7051297995265073167L));
		}
		while (!this.aClass458_8161.method5970((byte) 105)) {
			Node class298 = this.aClass458_8161.method5971(1793950137);
			OpenGL.glDeleteShader((int) (class298.key * 7051297995265073167L));
		}
		while (!this.aClass458_8071.method5970((byte) 88)) {
			IntNode class298_sub35 = (IntNode) this.aClass458_8071.method5971(1623809962);
			OpenGL.glDeleteLists((int) (class298_sub35.key * 7051297995265073167L), class298_sub35.capacity * -774922497);
		}
		this.aClass61_8052.method717();
		if (za() > 100663296 && (TimeUtils.getTime() > this.aLong8078 + 60000L)) {
			System.gc();
			this.aLong8078 = TimeUtils.getTime();
		}
		this.anInt8062 = i;
	}

	final void method5265() {
		OpenGL.glDepthMask(this.aBoolean8086 && this.aBoolean8108);
	}

	final void method5266(int mode) {
		if (this.anInt8196 != mode) {
			int i_283_;
			boolean bool;
			boolean bool_284_;
			if (mode == 1) {
				i_283_ = 1;
				bool = true;
				bool_284_ = true;
			} else if (mode == 2) {
				i_283_ = 2;
				bool = true;
				bool_284_ = false;
			} else if (mode == 128) {
				i_283_ = 3;
				bool = true;
				bool_284_ = true;
			} else {
				i_283_ = 0;
				bool = true;
				bool_284_ = false;
			}
			if (bool != this.aBoolean8083) {
				OpenGL.glColorMask(bool, bool, bool, true);
				this.aBoolean8083 = bool;
			}
			if (bool_284_ != this.aBoolean8038) {
				if (bool_284_)
					OpenGL.glEnable(3008);
				else
					OpenGL.glDisable(3008);
				this.aBoolean8038 = bool_284_;
			}
			if (i_283_ != this.anInt8082) {
				if (i_283_ == 1) {
					OpenGL.glEnable(3042);
					OpenGL.glBlendFunc(770, 771);
				} else if (i_283_ == 2) {
					OpenGL.glEnable(3042);
					OpenGL.glBlendFunc(1, 1);
				} else if (i_283_ == 3) {
					OpenGL.glEnable(3042);
					OpenGL.glBlendFunc(774, 1);
				} else
					OpenGL.glDisable(3042);
				this.anInt8082 = i_283_;
			}
			this.anInt8196 = mode;
			this.anInt8080 &= ~0xc;
		}
	}

	public final int za() {
		return (this.anInt8112 + this.anInt8175 + this.anInt8070);
	}

	public void renderParticles(Class69 class69) {
		this.aClass34_8057.method436(this, class69);
	}

	final synchronized void method5268(int i, int i_286_) {
		IntNode class298_sub35 = new IntNode(i_286_);
		class298_sub35.key = (long) i * 4191220306876042991L;
		this.aClass458_8075.pushBack(class298_sub35);
	}

	public void DA(int i, ToolkitLoader toolkitLoader, int i_287_, int i_288_) {
		OpenGLToolkitLoader class_ta_sub1 = (OpenGLToolkitLoader) toolkitLoader;
		Class30_Sub2_Sub1 class30_sub2_sub1 = class_ta_sub1.aClass30_Sub2_Sub1_8441;
		method5251();
		method5256(class_ta_sub1.aClass30_Sub2_Sub1_8441);
		method5266(1);
		method5258(7681, 8448);
		method5259(0, 34167, 768);
		float f = (class30_sub2_sub1.aFloat9049 / (float) class30_sub2_sub1.width);
		float f_289_ = (class30_sub2_sub1.aFloat9051 / (float) class30_sub2_sub1.height);
		OpenGL.glColor4ub((byte) (i >> 16), (byte) (i >> 8), (byte) i, (byte) (i >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(f * (float) (this.x - i_287_), f_289_ * (float) (this.y - i_288_));
		OpenGL.glVertex2i(this.x, this.y);
		OpenGL.glTexCoord2f(f * (float) (this.x - i_287_), f_289_ * (float) (this.height - i_288_));
		OpenGL.glVertex2i(this.x, this.height);
		OpenGL.glTexCoord2f(f * (float) (this.width - i_287_), f_289_ * (float) (this.height - i_288_));
		OpenGL.glVertex2i(this.width, this.height);
		OpenGL.glTexCoord2f(f * (float) (this.width - i_287_), f_289_ * (float) (this.y - i_288_));
		OpenGL.glVertex2i(this.width, this.y);
		OpenGL.glEnd();
		method5259(0, 5890, 768);
	}

	public void method5061(boolean bool) {
		/* empty */
	}

	static {
		aFloatArray8017 = new float[4];
	}

	final void method5270() {
		if (this.anInt8080 != 4) {
			method5223();
			method5226(false);
			method5262(false);
			method5264(false);
			method5281(false);
			method5275(-2);
			method5266(1);
			this.anInt8080 = 4;
		}
	}

	public final Matrix4f method5045() {
		return new Matrix4f(this.aMatrix4f_8041);
	}

	public SpriteToolkit method5029(int i, int i_305_, boolean bool, boolean bool_306_) {
		return new Class57_Sub3(this, i, i_305_, bool);
	}

	public boolean method5001() {
		return true;
	}

	final void method5271() {
		if (this.aBoolean8090) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean8090 = false;
		}
	}

	OpenGLGraphicsToolkit(Canvas canvas, MaterialRawLoader textures, int samples) {
		super(textures);
		this.aClass34_8057 = new Class34();
		this.aMatrix4f_8058 = new Matrix4f();
		this.aMatrix4f_8030 = new Matrix4f();
		this.aClass222_8060 = new Matrix43f();
		this.anInt8063 = 8;
		this.anInt8064 = 3;
		this.aBoolean8065 = false;
		this.aClass458_8067 = new NodeCollection();
		this.aClass458_8071 = new NodeCollection();
		this.aClass458_8153 = new NodeCollection();
		this.aClass458_8073 = new NodeCollection();
		this.aClass458_8068 = new NodeCollection();
		this.aClass458_8075 = new NodeCollection();
		this.aClass458_8076 = new NodeCollection();
		this.aClass458_8161 = new NodeCollection();
		this.aClass222_8087 = new Matrix43f();
		this.aMatrix4f_8110 = new Matrix4f();
		this.aMatrix4f_8089 = new Matrix4f();
		this.aMatrix4f_8041 = new Matrix4f();
		this.aMatrix4f_8091 = new Matrix4f();
		this.aMatrix4f_8069 = new Matrix4f();
		this.aFloatArrayArray8077 = new float[6][4];
		this.aFloatArray8094 = new float[4];
		this.aFloat8099 = 0.0F;
		this.aFloat8100 = 1.0F;
		this.aFloat8134 = 0.0F;
		this.aFloat8102 = -1.0F;
		this.aClass222_8103 = new Matrix43f();
		this.aMatrix4f_8104 = new Matrix4f();
		this.aMatrix4f_8184 = new Matrix4f();
		this.aFloatArray8106 = new float[16];
		this.aBoolean8108 = true;
		this.y = 0;
		this.height = 0;
		this.x = 0;
		this.width = 0;
		this.anInt8113 = 0;
		this.anInt8114 = 0;
		this.aFloatArray8122 = new float[4];
		this.aFloatArray8123 = new float[4];
		this.aFloatArray8124 = new float[4];
		this.aFloatArray8157 = new float[4];
		this.color = -1;
		this.red = 1.0F;
		this.green = 1.0F;
		this.blue = 1.0F;
		this.aFloat8131 = -1.0F;
		this.aFloat8132 = -1.0F;
		this.aClass298_Sub10Array8164 = new Light[anInt8119];
		this.anInt8139 = -1;
		this.anInt8007 = -1;
		this.anInt8195 = 0;
		this.aFloat8144 = 1.0F;
		this.aFloat8145 = 0.0F;
		this.aBoolean8147 = false;
		this.anInt8136 = 8448;
		this.anInt8010 = 8448;
		this.aFloat8187 = -1.0F;
		this.aFloat8188 = -1.0F;
		this.aOpenGLModelToolkitArray8189 = new OpenGLModelToolkit[7];
		this.aOpenGLModelToolkitArray8084 = new OpenGLModelToolkit[7];
		this.aClass298_Sub53_Sub1_8197 = new RsFloatBuffer(8192);
		this.anIntArray8198 = new int[1];
		this.anIntArray8199 = new int[1];
		this.anIntArray8200 = new int[1];
		this.aByteArray8201 = new byte[16384];
		try {
			this.samples = samples;
			if (!JS5PrefetchType.getPrefetch().load("jaclib"))
				throw new RuntimeException("");
			if (!JS5PrefetchType.getPrefetch().load("jaggl"))
				throw new RuntimeException("");
			this.openGL = new OpenGL();
			long time = this.openGL.init(canvas, 8, 8, 8, 24, 0, this.samples);
			if (time == 0L)
				throw new RuntimeException("");
			method5220();
			int i_330_ = method5221();
			if (i_330_ != 0)
				throw new RuntimeException("");
			this.anInt8186 = this.aBoolean8143 ? 33639 : 5121;
			if (this.aString8162.indexOf("radeon") != -1) {
				int i_331_ = 0;
				boolean highDef = false;
				boolean bool_332_ = false;
				String[] strings = (Class365_Sub1_Sub3_Sub1.method4508(this.aString8162.replace('/', ' '), ' '));
				for (int i_333_ = 0; i_333_ < strings.length; i_333_++) {
					String string = strings[i_333_];
					try {
						if (string.length() <= 0)
							continue;
						if (string.charAt(0) == 'x' && string.length() >= 3 && Class51.method543(string.substring(1, 3))) {
							string = string.substring(1);
							bool_332_ = true;
						}
						if (string.equals("hd")) {
							highDef = true;
							continue;
						}
						if (string.startsWith("hd")) {
							string = string.substring(2);
							highDef = true;
						}
						if (string.length() < 4 || !Class51.method543(string.substring(0, 4)))
							continue;
						i_331_ = StringUtils.method1998(string.substring(0, 4));
					} catch (Exception exception) {
						continue;
					}
					break;
				}
				if (!bool_332_ && !highDef) {
					if (i_331_ >= 7000 && i_331_ <= 7999)
						this.aBoolean8126 = false;
					if (i_331_ >= 7000 && i_331_ <= 9250)
						this.aBoolean8177 = false;
				}
				if (!highDef || i_331_ < 4000)
					this.aBoolean8133 = false;
				this.aBoolean8179 &= this.openGL.a("GL_ARB_half_float_pixel");
				this.aBoolean8176 = this.aBoolean8126;
				this.aBoolean8172 = true;
			}
			if (this.gpuName.indexOf("intel") != -1)
				this.aBoolean8170 = false;
			this.aBoolean8185 = !this.gpuName.equals("s3 graphics");
			if (this.aBoolean8126) {
				try {
					int[] is = new int[1];
					OpenGL.glGenBuffersARB(1, is, 0);
				} catch (Throwable throwable) {
					throw new RuntimeException("");
				}
			}
			Class374_Sub1.method4640(false, true, -162450455);
			this.aBoolean8065 = true;
			this.aClass61_8052 = new Class61(this, this.textures);
			method5222();
			this.aClass49_8061 = new Class49(this);
			this.aClass42_8055 = new Class42(this);
			if (this.aClass42_8055.method482()) {
				this.aClass298_Sub8_Sub1_8056 = new Class298_Sub8_Sub1(this);
				if (!this.aClass298_Sub8_Sub1_8056.method2890()) {
					this.aClass298_Sub8_Sub1_8056.method2870();
					this.aClass298_Sub8_Sub1_8056 = null;
				}
			}
			attachRenderContext(canvas, new OpenGLContext(this, canvas, time));
			method5003(canvas);
			this.aClass27_8054 = new Class27(this);
			method5282();
			method5176();
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			destroy();
			if (throwable instanceof OutOfMemoryError)
				throw (OutOfMemoryError) throwable;
			throw new RuntimeException("");
		}
	}

	public void resetClip() {
		this.anInt8115 = 0;
		this.anInt8194 = 0;
		this.anInt8117 = frameContext.getWidth();
		this.anInt8180 = frameContext.getHeight();
		method5231();
	}

	public Interface8_Impl1_Impl2 method5186(int i, int i_350_) {
		return new Class298_Sub37_Sub18(this, Class55.aClass55_561, Class77.aClass77_719, i, i_350_);
	}

	public final void L() {
		if (frameContext != null) {
			this.x = 0;
			this.y = 0;
			this.width = frameContext.getWidth();
			this.height = frameContext.getHeight();
			OpenGL.glDisable(3089);
		}
	}

	public void XA(int i, int i_417_, int i_418_, int rgba, int i_420_) {
		method5250();
		method5266(i_420_);
		float f = (float) i + 0.35F;
		float f_421_ = (float) i_417_ + 0.35F;
		OpenGL.glColor4ub((byte) (rgba >> 16), (byte) (rgba >> 8), (byte) rgba, (byte) (rgba >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(f, f_421_);
		OpenGL.glVertex2f(f + (float) i_418_, f_421_);
		OpenGL.glEnd();
	}

	RenderContext createRenderFrameContext(Canvas canvas, int i, int i_502_) {
		return new OpenGLContext(this, canvas);
	}

	final void method5273(int i) {
		aFloatArray8163[0] = (float) (i & 0xff0000) / 1.671168E7F;
		aFloatArray8163[1] = (float) (i & 0xff00) / 65280.0F;
		aFloatArray8163[2] = (float) (i & 0xff) / 255.0F;
		aFloatArray8163[3] = (float) (i >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, aFloatArray8163, 0);
	}

	static int method5274(Class55 class55, Class77 class77) {
		if (class77 == Class77.aClass77_717) {
			switch (class55.anInt566 * -976336893) {
			case 9:
				return 6408;
			case 7:
				return 6406;
			case 5:
				return 6407;
			case 3:
				return 6410;
			default:
				throw new IllegalArgumentException();
			case 1:
				return 6409;
			}
		}
		if (class77 == Class77.aClass77_718) {
			switch (class55.anInt566 * -976336893) {
			case 5:
				return 32852;
			case 2:
				return 33189;
			default:
				throw new IllegalArgumentException();
			case 3:
				return 36219;
			case 7:
				return 32830;
			case 9:
				return 32859;
			case 1:
				return 32834;
			}
		}
		if (class77 == Class77.aClass77_719) {
			switch (class55.anInt566 * -976336893) {
			case 2:
				return 33190;
			default:
				throw new IllegalArgumentException();
			}
		}
		if (class77 == Class77.aClass77_714) {
			switch (class55.anInt566 * -976336893) {
			default:
				throw new IllegalArgumentException();
			case 1:
				return 34846;
			case 3:
				return 34847;
			case 7:
				return 34844;
			case 5:
				return 34843;
			case 9:
				return 34842;
			}
		}
		if (class77 == Class77.aClass77_721) {
			switch (class55.anInt566 * -976336893) {
			case 7:
				return 34838;
			default:
				throw new IllegalArgumentException();
			case 3:
				return 34841;
			case 9:
				return 34836;
			case 1:
				return 34840;
			case 5:
				return 34837;
			}
		}
		throw new IllegalArgumentException();
	}

	void CA(int i, int i_533_, int i_534_, int i_535_, int i_536_) {
		if (i_534_ < 0)
			i_534_ = -i_534_;
		if (i + i_534_ >= this.x && i - i_534_ <= this.width && i_533_ + i_534_ >= this.y && i_533_ - i_534_ <= this.height) {
			method5250();
			method5266(i_536_);
			OpenGL.glColor4ub((byte) (i_535_ >> 16), (byte) (i_535_ >> 8), (byte) i_535_, (byte) (i_535_ >> 24));
			float f = (float) i + 0.35F;
			float f_537_ = (float) i_533_ + 0.35F;
			int i_538_ = i_534_ << 1;
			if ((float) i_538_ < this.aFloat8188) {
				OpenGL.glBegin(7);
				OpenGL.glVertex2f(f + 1.0F, f_537_ + 1.0F);
				OpenGL.glVertex2f(f + 1.0F, f_537_ - 1.0F);
				OpenGL.glVertex2f(f - 1.0F, f_537_ - 1.0F);
				OpenGL.glVertex2f(f - 1.0F, f_537_ + 1.0F);
				OpenGL.glEnd();
			} else if ((float) i_538_ <= this.aFloat8187) {
				OpenGL.glEnable(2832);
				OpenGL.glPointSize((float) i_538_);
				OpenGL.glBegin(0);
				OpenGL.glVertex2f(f, f_537_);
				OpenGL.glEnd();
				OpenGL.glDisable(2832);
			} else {
				OpenGL.glBegin(6);
				OpenGL.glVertex2f(f, f_537_);
				int i_539_ = 262144 / (6 * i_534_);
				if (i_539_ <= 64)
					i_539_ = 64;
				else if (i_539_ > 512)
					i_539_ = 512;
				i_539_ = StaticMethods.method5639(i_539_);
				OpenGL.glVertex2f(f + (float) i_534_, f_537_);
				for (int i_540_ = 16384 - i_539_; i_540_ > 0; i_540_ -= i_539_)
					OpenGL.glVertex2f(f + (Class35.aFloatArray417[i_540_] * (float) i_534_), f_537_ + (Class35.aFloatArray418[i_540_] * (float) i_534_));
				OpenGL.glVertex2f(f + (float) i_534_, f_537_);
				OpenGL.glEnd();
			}
		}
	}

	final void method5275(int i) {
		method5253(i, true);
	}

	public void drawDashedLine(int i, int i_552_, int i_553_, int i_554_, int i_555_, int i_556_, int i_557_, int i_558_, int i_559_) {
		if (i != i_553_ || i_552_ != i_554_) {
			method5250();
			method5266(i_556_);
			float f = (float) i_553_ - (float) i;
			float f_560_ = (float) i_554_ - (float) i_552_;
			float f_561_ = (float) (1.0 / Math.sqrt((double) (f * f + f_560_ * f_560_)));
			f *= f_561_;
			f_560_ *= f_561_;
			OpenGL.glColor4ub((byte) (i_555_ >> 16), (byte) (i_555_ >> 8), (byte) i_555_, (byte) (i_555_ >> 24));
			i_559_ %= i_558_ + i_557_;
			float f_562_ = f * (float) i_557_;
			float f_563_ = f_560_ * (float) i_557_;
			float f_564_ = 0.0F;
			float f_565_ = 0.0F;
			float f_566_ = f_562_;
			float f_567_ = f_563_;
			if (i_559_ > i_557_) {
				f_564_ = f * (float) (i_557_ + i_558_ - i_559_);
				f_565_ = f_560_ * (float) (i_557_ + i_558_ - i_559_);
			} else {
				f_566_ = f * (float) (i_557_ - i_559_);
				f_567_ = f_560_ * (float) (i_557_ - i_559_);
			}
			float f_568_ = (float) i + 0.35F + f_564_;
			float f_569_ = (float) i_552_ + 0.35F + f_565_;
			float f_570_ = f * (float) i_558_;
			float f_571_ = f_560_ * (float) i_558_;
			for (;;) {
				if (i_553_ > i) {
					if (f_568_ > (float) i_553_ + 0.35F)
						break;
					if (f_568_ + f_566_ > (float) i_553_)
						f_566_ = (float) i_553_ - f_568_;
				} else {
					if (f_568_ < (float) i_553_ + 0.35F)
						break;
					if (f_568_ + f_566_ < (float) i_553_)
						f_566_ = (float) i_553_ - f_568_;
				}
				if (i_554_ > i_552_) {
					if (f_569_ > (float) i_554_ + 0.35F)
						break;
					if (f_569_ + f_567_ > (float) i_554_)
						f_567_ = (float) i_554_ - f_569_;
				} else {
					if (f_569_ < (float) i_554_ + 0.35F)
						break;
					if (f_569_ + f_567_ < (float) i_554_)
						f_567_ = (float) i_554_ - f_569_;
				}
				OpenGL.glBegin(1);
				OpenGL.glVertex2f(f_568_, f_569_);
				OpenGL.glVertex2f(f_568_ + f_566_, f_569_ + f_567_);
				OpenGL.glEnd();
				f_568_ += f_570_ + f_566_;
				f_569_ += f_571_ + f_567_;
				f_566_ = f_562_;
				f_567_ = f_563_;
			}
		}
	}

	public void GA(float f, float f_585_) {
		this.aFloat8099 = f;
		this.aFloat8100 = f_585_;
		method5276();
	}

	public FloorToolkit createLandScapeRenderer(int i, int i_616_, int[][] is, int[][] is_617_, int i_618_, int i_619_, int i_620_) {
		return new Class_xa_Sub3(this, i_619_, i_620_, i, i_616_, is, is_617_, i_618_);
	}

	final void method5276() {
		if (this.anInt8107 == 2)
			OpenGL.glDepthRange(this.aFloat8099, this.aFloat8100);
		else
			OpenGL.glDepthRange(0.0F, 1.0F);
	}

	public final void bloomSmn() {
		if (this.aClass298_Sub8_Sub1_8056 != null && this.aClass298_Sub8_Sub1_8056.method2886()) {
			this.aClass42_8055.method485(this.aClass298_Sub8_Sub1_8056);
			this.aClass61_8052.method718();
		}
	}

	void method5277() {
		int i;
		for (i = 0; i < this.anInt8135; i++) {
			Light class298_sub10 = this.aClass298_Sub10Array8164[i];
			int i_672_ = 16386 + i;
			aFloatArray8017[0] = (float) class298_sub10.method2895(823958259);
			aFloatArray8017[1] = (float) class298_sub10.method2894(-525522007);
			aFloatArray8017[2] = (float) class298_sub10.method2897((byte) 107);
			aFloatArray8017[3] = 1.0F;
			OpenGL.glLightfv(i_672_, 4611, aFloatArray8017, 0);
			int i_673_ = class298_sub10.method2898(-1921592398);
			float f = class298_sub10.method2901(608404512) / 255.0F;
			aFloatArray8017[0] = (float) (i_673_ >> 16 & 0xff) * f;
			aFloatArray8017[1] = (float) (i_673_ >> 8 & 0xff) * f;
			aFloatArray8017[2] = (float) (i_673_ & 0xff) * f;
			OpenGL.glLightfv(i_672_, 4609, aFloatArray8017, 0);
			OpenGL.glLightf(i_672_, 4617, (1.0F / (float) (class298_sub10.method2900(-2060003405) * class298_sub10.method2900(-1382135040))));
			OpenGL.glEnable(i_672_);
		}
		for (/**/; i < this.anInt8127; i++)
			OpenGL.glDisable(16386 + i);
		this.anInt8127 = this.anInt8135;
	}

	final void method5278(int i, boolean bool, boolean bool_674_) {
		if (i != this.anInt8152 || (this.aBoolean8147 != this.aBoolean8146)) {
			Class30_Sub2 class30_sub2 = null;
			int i_675_ = 0;
			byte i_676_ = 0;
			int i_677_ = 0;
			byte i_678_ = this.aBoolean8146 ? (byte) 3 : (byte) 0;
			if (i >= 0) {
				class30_sub2 = this.aClass61_8052.method715(i);
				Class53 class53 = textures.method174(i);
				if (class53.aByte535 != 0 || class53.aByte509 != 0)
					method5261(((float) (this.anInt8062 % 128000) / 1000.0F * (float) class53.aByte535 / 64.0F % 1.0F), ((float) (this.anInt8062 % 128000) / 1000.0F * (float) class53.aByte509 / 64.0F % 1.0F), 0.0F);
				else
					method5271();
				if (!this.aBoolean8146) {
					i_676_ = class53.aByte536;
					i_677_ = class53.anInt531 * 1616831825;
					i_678_ = class53.aByte529;
				}
				i_675_ = class53.anInt519 * -490972023;
			} else
				method5271();
			this.aClass27_8054.method401(i_678_, i_676_, i_677_, bool, bool_674_);
			if (!this.aClass27_8054.method402(class30_sub2, i_675_)) {
				method5256(class30_sub2);
				method5243(i_675_);
			}
			this.aBoolean8147 = this.aBoolean8146;
			this.anInt8152 = i;
		}
		this.anInt8080 &= ~0x7;
	}

	public void method5057(int i, Class78 class78) {
		this.anInt8155 = i;
		this.aClass78_8149 = class78;
		this.aBoolean8146 = true;
	}

	void method5279() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray8124, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray8157, 0);
	}

	final Class30_Sub1 method5280() {
		return (this.aClass66_Sub1_8159 != null ? this.aClass66_Sub1_8159.method769() : null);
	}

	final void method5281(boolean bool) {
		if (bool != this.aBoolean8086) {
			this.aBoolean8086 = bool;
			method5265();
			this.anInt8080 &= ~0xf;
		}
	}

	public int method5017(int i, int i_690_) {
		return i & i_690_ ^ i_690_;
	}

	public final void J(int i) {
		this.anInt8064 = 0;
		for (/**/; i > 1; i >>= 1)
			this.anInt8064++;
		this.anInt8063 = 1 << this.anInt8064;
	}

	void method5282() {
		method5275(-2);
		for (int i = this.anInt8165 - 1; i >= 0; i--) {
			method5255(i);
			method5256(null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		method5258(8448, 8448);
		method5259(2, 34168, 770);
		method5271();
		this.anInt8196 = 1;
		OpenGL.glEnable(3042);
		OpenGL.glBlendFunc(770, 771);
		this.anInt8082 = 1;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, 0.0F);
		this.aBoolean8038 = true;
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean8083 = true;
		method5226(true);
		method5262(true);
		method5264(true);
		method5281(true);
		GA(0.0F, 1.0F);
		method5291();
		this.openGL.setSwapInterval(0);
		OpenGL.glShadeModel(7425);
		OpenGL.glClearDepth(1.0F);
		OpenGL.glDepthFunc(515);
		OpenGL.glPolygonMode(1028, 6914);
		OpenGL.glEnable(2884);
		OpenGL.glCullFace(1029);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glColorMaterial(1028, 5634);
		OpenGL.glEnable(2903);
		float[] fs = { 0.0F, 0.0F, 0.0F, 1.0F };
		for (int i = 0; i < 8; i++) {
			int i_693_ = 16384 + i;
			OpenGL.glLightfv(i_693_, 4608, fs, 0);
			OpenGL.glLightf(i_693_, 4615, 0.0F);
			OpenGL.glLightf(i_693_, 4616, 0.0F);
		}
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anInt8139 = -1;
		this.color = -1;
		resetClip();
		L();
	}

	final void method5283(Matrix4f matrix4f) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(matrix4f.aFloatArray2594, 0);
	}

	final Interface2 method5284(int i, byte[] is, int i_702_, boolean bool) {
		if (this.aBoolean8126 && (!bool || this.aBoolean8176))
			return new Class40_Sub1(this, i, is, i_702_, bool);
		return new Class46_Sub1(this, i, is, i_702_);
	}

	public final boolean method5052() {
		if (this.aClass298_Sub8_Sub1_8056 != null) {
			if (!this.aClass298_Sub8_Sub1_8056.method2886()) {
				if (this.aClass42_8055.method484(this.aClass298_Sub8_Sub1_8056))
					this.aClass61_8052.method718();
				else
					return false;
			}
			return true;
		}
		return false;
	}

	final void method5285(int i, int i_710_, int i_711_) {
		OpenGL.glDrawArrays(i, i_710_, i_711_);
	}

	public void drawFilledRectangle(int startX, int startY, int endX, int endY, int rgba, int mode) {
		float f = (float) startX + 0.35F;
		float f_717_ = (float) startY + 0.35F;
		float f_718_ = f + (float) endX;
		float f_719_ = f_717_ + (float) endY;
		method5250();
		method5266(mode);
		OpenGL.glColor4ub((byte) (rgba >> 16), (byte) (rgba >> 8), (byte) rgba, (byte) (rgba >> 24));
		if (this.aBoolean8173)
			OpenGL.glDisable(32925);
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(f, f_717_);
		OpenGL.glVertex2f(f, f_719_);
		OpenGL.glVertex2f(f_718_, f_719_);
		OpenGL.glVertex2f(f_718_, f_717_);
		OpenGL.glEnd();
		if (this.aBoolean8173)
			OpenGL.glEnable(32925);
	}

	final void method5286(int i, int i_720_, int i_721_) {
		OpenGL.glTexEnvi(8960, 34184 + i, i_720_);
		OpenGL.glTexEnvi(8960, 34200 + i, i_721_);
	}

	public void G(int i, int i_722_, int i_723_, int i_724_, int i_725_) {
		method5250();
		method5266(i_725_);
		float f = (float) i + 0.35F;
		float f_726_ = (float) i_722_ + 0.35F;
		OpenGL.glColor4ub((byte) (i_724_ >> 16), (byte) (i_724_ >> 8), (byte) i_724_, (byte) (i_724_ >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(f, f_726_);
		OpenGL.glVertex2f(f, f_726_ + (float) i_723_);
		OpenGL.glEnd();
	}

	final void method5287() {
		OpenGL.glPopMatrix();
	}

	public void N(int i, int i_727_, int i_728_, int i_729_, int i_730_, int i_731_, byte[] is, int i_732_, int i_733_) {
		float f;
		float f_734_;
		if (this.aClass30_Sub2_Sub1_8111 == null || (this.aClass30_Sub2_Sub1_8111.anInt6746 < i_728_) || (this.aClass30_Sub2_Sub1_8111.anInt6747 < i_729_)) {
			this.aClass30_Sub2_Sub1_8111 = Class30_Sub2_Sub1.method428(this, Class55.aClass55_567, Class77.aClass77_717, i_728_, i_729_, false, is, Class55.aClass55_567);
			this.aClass30_Sub2_Sub1_8111.method420(false, false);
			f = this.aClass30_Sub2_Sub1_8111.aFloat9051;
			f_734_ = this.aClass30_Sub2_Sub1_8111.aFloat9049;
		} else {
			this.aClass30_Sub2_Sub1_8111.method421(0, 0, i_728_, i_729_, is, Class55.aClass55_567, 0, 0, false);
			f = (this.aClass30_Sub2_Sub1_8111.aFloat9051 * (float) i_729_ / (float) (this.aClass30_Sub2_Sub1_8111.anInt6747));
			f_734_ = (this.aClass30_Sub2_Sub1_8111.aFloat9049 * (float) i_728_ / (float) (this.aClass30_Sub2_Sub1_8111.anInt6746));
		}
		method5251();
		method5256(this.aClass30_Sub2_Sub1_8111);
		method5266(i_733_);
		OpenGL.glColor4ub((byte) (i_730_ >> 16), (byte) (i_730_ >> 8), (byte) i_730_, (byte) (i_730_ >> 24));
		method5273(i_731_);
		method5258(34165, 34165);
		method5259(0, 34166, 768);
		method5259(2, 5890, 770);
		method5286(0, 34166, 770);
		method5286(2, 5890, 770);
		float f_735_ = (float) i;
		float f_736_ = (float) i_727_;
		float f_737_ = f_735_ + (float) i_728_;
		float f_738_ = f_736_ + (float) i_729_;
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(f_735_, f_736_);
		OpenGL.glTexCoord2f(0.0F, f_734_);
		OpenGL.glVertex2f(f_735_, f_738_);
		OpenGL.glTexCoord2f(f, f_734_);
		OpenGL.glVertex2f(f_737_, f_738_);
		OpenGL.glTexCoord2f(f, 0.0F);
		OpenGL.glVertex2f(f_737_, f_736_);
		OpenGL.glEnd();
		method5259(0, 5890, 768);
		method5259(2, 34166, 770);
		method5286(0, 5890, 770);
		method5286(2, 34166, 770);
	}

	final int method5288(int i) {
		if (i == 1)
			return 7681;
		if (i == 0)
			return 8448;
		if (i == 2)
			return 34165;
		if (i == 3)
			return 260;
		if (i == 4)
			return 34023;
		throw new IllegalArgumentException();
	}

	public final void setModelAmbient(float f) {
		if (this.aFloat8130 != f) {
			this.aFloat8130 = f;
			method5239();
		}
	}

	final void method5289(int i, int i_739_) {
		this.anInt8113 = i;
		this.anInt8114 = i_739_;
		method5231();
		method5232();
	}

	void method5290() {
		if (this.aBoolean8050 && !this.aBoolean8027)
			OpenGL.glEnable(2896);
		else
			OpenGL.glDisable(2896);
	}

	final void method5291() {
		if (this.anInt8107 != 0) {
			this.anInt8107 = 0;
			method5231();
			method5276();
			this.anInt8080 &= ~0xf;
		}
	}
}
