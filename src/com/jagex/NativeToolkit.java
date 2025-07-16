package com.jagex;/* Class_ra_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.prefetch.JS5PrefetchType;
import com.jagex.maths.Matrix43f;
import com.jagex.maths.Matrix4f;
import jaclib.memory.DirectBufferHelper;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeap;
import jaclib.memory.heap.NativeHeapBuffer;
import sun.misc.Unsafe;

import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class NativeToolkit extends GraphicsToolkit {
	Interface7_Impl1 anInterface7_Impl1_8202;
	ClassNotAnim aClass501_8203 = new ClassNotAnim();
	Matrix4f aMatrix4f_8204;
	Matrix4f aMatrix4f_8205;
	Matrix4f aMatrix4f_8209;
	Class78 aClass78_8213;
	protected boolean aBoolean8214;
	int[] anIntArray8215;
	public ByteBuffer aByteBuffer8216;
	public long aLong8217;
	public Unsafe anUnsafe8219;
	Class159 aClass159_8220;
	NativeHeap aNativeHeap8221;
	NodeCollection nodeCollection = new NodeCollection();
	public int anInt8223;
	public int anInt8224;
	static Matrix4f aMatrix4f_8225;
	Matrix43f aClass222_8226 = new Matrix43f();
	Matrix4f aMatrix4f_8227 = new Matrix4f();
	Matrix43f aClass222_8228 = new Matrix43f();
	Matrix43f aClass222_8229 = new Matrix43f();
	public Matrix4f aMatrix4f_8230 = new Matrix4f();
	Matrix4f aMatrix4f_8231 = new Matrix4f();
	Matrix43f aClass222_8232 = new Matrix43f();
	protected int anInt8233;
	protected int anInt8234;
	Matrix43f aClass222_8235;
	protected Matrix4f aMatrix4f_8236;
	protected boolean aBoolean8237;
	Vector3f aClass217_8238;
	protected int anInt8239;
	boolean aBoolean8240;
	protected int anInt8241;
	boolean aBoolean8242;
	Matrix4f aMatrix4f_8243;
	Matrix4f aMatrix4f_8244;
	protected boolean aBoolean8245;
	Matrix4f aMatrix4f_8246;
	Matrix4f aMatrix4f_8247;
	protected float[] aFloatArray8248;
	Class130 aClass130_8249;
	Matrix43f aClass222_8250;
	public Matrix4f aMatrix4f_8251;
	float[][] aFloatArrayArray8252;
	float aFloat8253;
	protected boolean aBoolean8254;
	float aFloat8255;
	float aFloat8256;
	Class138 aClass138_8257;
	protected float aFloat8258;
	float aFloat8259;
	float aFloat8260;
	protected float aFloat8261;
	Class149 aClass149_8262;
	protected int anInt8263;
	protected boolean aBoolean8264;
	protected int anInt8265;
	Class161_Sub1_Sub1 aClass161_Sub1_Sub1_8266;
	JavaGraphicsModelTookit[] javaGraphicsModelTookits2;
	protected Class174 aClass174_8268;
	int anInt8269;
	int anInt8270;
	int anInt8271;
	protected int anInt8272;
	protected int anInt8273;
	protected int anInt8274;
	protected int anInt8275;
	protected int anInt8276;
	protected boolean aBoolean8277;
	protected boolean aBoolean8278;
	protected boolean aBoolean8279;
	Class57_Sub2 aClass57_Sub2_8280;
	protected boolean aBoolean8281;
	protected boolean aBoolean8282;
	public float[] aFloatArray8283;
	Class66_Sub2 aClass66_Sub2_8284;
	float[] aFloatArray8285;
	protected Light[] aClass298_Sub10Array8286;
	int anInt8287;
	JavaGraphicsModelTookit[] javaGraphicsModelTookits;
	public float aFloat8289;
	public float aFloat8290;
	protected float aFloat8291;
	protected float aFloat8292;
	protected float aFloat8293;
	protected Class175[] aClass175Array8294;
	protected int anInt8295;
	protected int anInt8296;
	int anInt8297;
	int anInt8298;
	int anInt8299;
	static Object anObject8300 = new Object();
	Interface9_Impl2 anInterface9_Impl2_8301;
	Interface9[] anInterface9Array8303;
	protected Matrix4f[] aMatrix4fArray8304;
	protected Class171[] aClass171Array8305;
	Class153 aClass153_8306;
	protected Class175[] aClass175Array8307;
	protected float aFloat8308;
	protected boolean aBoolean8309;
	public Interface9_Impl2 anInterface9_Impl2_8310;
	int anInt8311;
	float[] aFloatArray8312;
	int anInt8313;
	Class161 aClass161_8314;
	Class161[] aClass161Array8315;
	Class137 aClass137_8316;
	int anInt8317;
	protected int anInt8318;
	Class161_Sub1_Sub2 aClass161_Sub1_Sub2_8319;
	Class57_Sub2 aClass57_Sub2_8320;
	Class168 aClass168_8321;
	BloomToolkit[] bloomToolkits;
	protected int anInt8325;
	boolean aBoolean8326;
	boolean aBoolean8327;
	int anInt8328;
	float aFloat8329;
	boolean aBoolean8330;
	protected boolean aBoolean8331;
	protected int anInt8332;
	public Matrix4f aMatrix4f_8333;
	protected int anInt8334;
	protected float aFloat8335;
	protected float aFloat8336;
	Class153 aClass153_8337;
	Matrix4f aMatrix4f_8338 = new Matrix4f();
	protected int anInt8339;
	float[] aFloatArray8340;
	public int multisample;
	public int anInt8342;
	Interface7_Impl1 anInterface7_Impl1_8343;
	boolean cleaned;
	Class176 aClass176_8345;
	int samples;
	public int anInt8347;
	protected int anInt8348;
	public boolean aBoolean8349;
	protected boolean multisampled;
	Class157 aClass157_8351;
	int anInt8353;
	Interface7_Impl1 anInterface7_Impl1_8354;
	Class153 aClass153_8356;
	int anInt8357;
	Class153 aClass153_8358;
	Class153 aClass153_8359;
	Interface7_Impl2 anInterface7_Impl2_8360;
	Js5FileSystem aClass243_8361;
	public float aFloat8362;
	Matrix4f aMatrix4f_8363;
	public float aFloat8364;
	protected boolean aBoolean8365;
	protected int anInt8366;

	abstract void method5292(int i);

	public void method5293(InterfaceWithTheB interface8) {
		this.aClass501_8203.method6225(interface8, -1339142220);
	}

	void method5294() {
		ArrayList arraylist = this.aClass501_8203.method6224(500882138);
		Iterator iterator = arraylist.iterator();
		while (iterator.hasNext()) {
			InterfaceWithTheB interface8 = (InterfaceWithTheB) iterator.next();
			interface8.b();
		}
	}

	public abstract boolean method5295();

	public final void method5296(int i, Class183 class183) {
		method5427(i, class183, false, false);
	}

	public abstract Class123 method5297(String string);

	byte[] method5298(String string, String string_0_) {
		return this.aClass243_8361.getFile(string, string_0_);
	}

	Class109 method5299(byte[] is) {
		if (is == null)
			return null;
		Class109 class109;
		try {
			class109 = new Class109(is);
		} catch (Exception exception) {
			return null;
		}
		return class109;
	}

	public abstract void method5300(Matrix4f matrix4f, Matrix4f matrix4f_1_, Matrix4f matrix4f_2_);

	final Matrix4f method5301() {
		return aMatrix4f_8333;
	}

	public final void method5302() {
		this.anInterface9Array8303 = new Interface9[anInt8347];
		aMatrix4fArray8304 = new Matrix4f[anInt8347];
		aClass171Array8305 = new Class171[anInt8347];
		aClass175Array8294 = new Class175[anInt8347];
		aClass175Array8307 = new Class175[anInt8347];
		for (int i = 0; i < anInt8347; i++) {
			aClass175Array8307[i] = Class175.aClass175_1765;
			aClass175Array8294[i] = Class175.aClass175_1765;
			aClass171Array8305[i] = Class171.aClass171_1742;
			aMatrix4fArray8304[i] = new Matrix4f();
		}
		aClass298_Sub10Array8286 = new Light[anInt8348 - 2];
		int[] is = { -1 };
		anInterface9_Impl2_8310 = method5355(1, 1, false, is, 0, 0);
		is[0] = -16777216;
		this.anInterface9_Impl2_8301 = method5355(1, 1, false, is, 0, 0);
		setBufferHeap(new Class_v_Sub2(262144));
		this.aClass153_8359 = method5404(new Class181[] { new Class181(new Class155[] { Class155.aClass155_1610, Class155.aClass155_1599 }) });
		method5404(new Class181[] { new Class181(new Class155[] { Class155.aClass155_1610, Class155.aClass155_1597 }) });
		this.aClass153_8358 = method5404(new Class181[] { new Class181(Class155.aClass155_1610), new Class181(Class155.aClass155_1597), new Class181(Class155.aClass155_1599), new Class181(Class155.aClass155_1596) });
		this.aClass153_8306 = method5404(new Class181[] { new Class181(Class155.aClass155_1610), new Class181(Class155.aClass155_1597), new Class181(Class155.aClass155_1599) });
		for (int i = 0; i < 7; i++) {
			this.javaGraphicsModelTookits[i] = new JavaGraphicsModelTookit(this, 0, 0, false, false);
			this.javaGraphicsModelTookits2[i] = new JavaGraphicsModelTookit(this, 0, 0, true, true);
		}
		method5402();
		this.anInterface7_Impl2_8360 = method5381(true);
		method5463();
		method5094();
		L();
		method5176();
		this.aClass57_Sub2_8320 = new Class57_Sub2(this, anInterface9_Impl2_8310);
		this.aClass57_Sub2_8280 = new Class57_Sub2(this, this.anInterface9_Impl2_8301);
		clear(3, 0);
	}

	Class161 method5304(int i) {
		return this.aClass161Array8315[i];
	}

	abstract void method5305();

    void method5306() {
		this.aClass168_8321.method1796();
		this.anInterface7_Impl1_8202.b();
		this.anInterface7_Impl1_8343.b();
		this.anInterface7_Impl1_8354.b();
		for (int i = 0; i < 7; i++)
			this.javaGraphicsModelTookits2[i].method4850();
		this.aClass176_8345.method1828();
		this.anInterface7_Impl2_8360.b();
	}

	void method5307() {
		this.aClass168_8321.method1791();
		for (int i = 0; i < this.bloomToolkits.length; i++) {
			if (this.bloomToolkits[i] != null && this.bloomToolkits[i].method1626())
				this.bloomToolkits[i].method1619();
		}
		this.aClass176_8345 = new Class176(this);
		method5308();
		method5309();
		method5420();
		this.aClass176_8345.method1827(this);
	}

	final void method5308() {
		this.anInterface7_Impl1_8202 = method5382(false);
		int i = 160;
		this.anInterface7_Impl1_8202.method72(i, 32);
		aByteBuffer8216.clear();
		aByteBuffer8216.putFloat(0.0F);
		aByteBuffer8216.putFloat(0.0F);
		aByteBuffer8216.putFloat(0.0F);
		aByteBuffer8216.putInt(-1);
		aByteBuffer8216.putFloat(0.0F);
		aByteBuffer8216.putFloat(0.0F);
		aByteBuffer8216.putFloat(0.0F);
		aByteBuffer8216.putFloat(0.0F);
		aByteBuffer8216.putFloat(0.0F);
		aByteBuffer8216.putFloat(1.0F);
		aByteBuffer8216.putFloat(0.0F);
		aByteBuffer8216.putInt(-1);
		aByteBuffer8216.putFloat(0.0F);
		aByteBuffer8216.putFloat(1.0F);
		aByteBuffer8216.putFloat(0.0F);
		aByteBuffer8216.putFloat(1.0F);
		aByteBuffer8216.putFloat(1.0F);
		aByteBuffer8216.putFloat(1.0F);
		aByteBuffer8216.putFloat(0.0F);
		aByteBuffer8216.putInt(-1);
		aByteBuffer8216.putFloat(1.0F);
		aByteBuffer8216.putFloat(1.0F);
		aByteBuffer8216.putFloat(1.0F);
		aByteBuffer8216.putFloat(1.0F);
		aByteBuffer8216.putFloat(1.0F);
		aByteBuffer8216.putFloat(0.0F);
		aByteBuffer8216.putFloat(0.0F);
		aByteBuffer8216.putInt(-1);
		aByteBuffer8216.putFloat(1.0F);
		aByteBuffer8216.putFloat(0.0F);
		aByteBuffer8216.putFloat(1.0F);
		aByteBuffer8216.putFloat(0.0F);
		aByteBuffer8216.putFloat(0.0F);
		aByteBuffer8216.putFloat(0.0F);
		aByteBuffer8216.putFloat(0.0F);
		aByteBuffer8216.putInt(-1);
		aByteBuffer8216.putFloat(0.0F);
		aByteBuffer8216.putFloat(0.0F);
		aByteBuffer8216.putFloat(0.0F);
		aByteBuffer8216.putFloat(0.0F);
		this.anInterface7_Impl1_8202.method63(0, aByteBuffer8216.position(), aLong8217);
		this.aClass153_8356 = method5404(new Class181[] { new Class181(new Class155[] { Class155.aClass155_1610, Class155.aClass155_1597, Class155.aClass155_1599, Class155.aClass155_1599 }) });
	}

	final void method5309() {
		this.anInterface7_Impl1_8343 = method5382(true);
		this.anInterface7_Impl1_8343.method72(24, 12);
		this.aClass153_8337 = method5404(new Class181[] { new Class181(Class155.aClass155_1610) });
	}

	boolean method5311(float f, float f_6_, float f_7_, float f_8_, float f_9_, float f_10_) {
		aByteBuffer8216.clear();
		aByteBuffer8216.putFloat(f);
		aByteBuffer8216.putFloat(f_6_);
		aByteBuffer8216.putFloat(f_7_);
		aByteBuffer8216.putFloat(f_8_);
		aByteBuffer8216.putFloat(f_9_);
		aByteBuffer8216.putFloat(f_10_);
		return this.anInterface7_Impl1_8343.method63(0, aByteBuffer8216.position(), aLong8217);
	}

	void method5023() {
		if (!this.cleaned) {
			method5306();
			this.aClass157_8351.method1697();
			for (Node node = this.nodeCollection.head(); node != null; node = this.nodeCollection.next())
				((Class_v_Sub2) node).method3675();
			StaticMethods.method2000(false, true);
			for (int index = 0; index < this.aClass161Array8315.length; index++) {
				if (this.aClass161Array8315[index] != null) {
					this.aClass161Array8315[index].method1712();
					this.aClass161Array8315[index] = null;
				}
			}
			for (int index = 0; index < this.bloomToolkits.length; index++) {
				if (this.bloomToolkits[index] != null) {
					this.bloomToolkits[index].method1627();
					this.bloomToolkits[index] = null;
				}
			}
			method5294();
			clean(0);
			this.cleaned = true;
		}
	}

	public final boolean method5001() {
		return true;
	}

	public final boolean method5074() {
		return true;
	}

	final Interface7_Impl2 method5312(int i) {
		if (this.anInterface7_Impl2_8360.method60() < i * 2)
			this.anInterface7_Impl2_8360.method113(i);
		return this.anInterface7_Impl2_8360;
	}

	public final boolean hasBloomToolkits() {
		return this.bloomToolkits[1] != null;
	}

	public final boolean method4996() {
		return true;
	}

	public final boolean method5159() {
		return true;
	}

	final void method5314() {
		aMatrix4f_8333.method2142(this.aMatrix4f_8209);
		method5335(aMatrix4f_8333);
		aFloat8308 = ((aMatrix4f_8333.aFloatArray2594[14] - aMatrix4f_8333.aFloatArray2594[15]) / (aMatrix4f_8333.aFloatArray2594[11] - aMatrix4f_8333.aFloatArray2594[10]));
		aFloat8261 = (-aMatrix4f_8333.aFloatArray2594[14] / aMatrix4f_8333.aFloatArray2594[10]);
		method5377();
	}

	public final boolean method5051() {
		return false;
	}

	public final boolean isMultisampled() {
		return multisampled;
	}

	public abstract float method5315();

	public void clean(int i) {
		if (this.aClass157_8351 != null)
			this.aClass157_8351.method1696();
		anInt8342 = i & 0x7fffffff;
	}

	final Matrix4f method5316() {
		return aMatrix4fArray8304[anInt8325];
	}

	void method5317() {
		method5419();
		method5318();
		method5336();
		resetClip();
		L();
	}

	public final boolean method5052() {
		if (this.bloomToolkits[1] != null && !this.bloomToolkits[1].method1626()) {
			boolean bool = (this.aClass168_8321.method1792(this.bloomToolkits[1]));
			if (bool)
				this.aClass157_8351.method1697();
			return bool;
		}
		return false;
	}

	public final void bloomSmn() {
		if (this.bloomToolkits[1] != null && this.bloomToolkits[1].method1626()) {
			this.aClass168_8321.method1795(this.bloomToolkits[1]);
			this.aClass157_8351.method1697();
		}
	}

	public final boolean method5054() {
		return (this.bloomToolkits[1] != null && this.bloomToolkits[1].method1626());
	}

	final void method5188(float f, float f_11_, float f_12_, float f_13_, float f_14_, float f_15_) {
		BloomEffect.aFloat7011 = f;
		BloomEffect.aFloat7013 = f_11_;
		BloomEffect.aFloat7012 = f_12_;
		BloomEffect.aFloat7015 = f_15_;
	}

	public final void method5056(int i, int i_16_, int i_17_, int i_18_) {
		this.aClass168_8321.method1798(i, i_16_, i_17_, i_18_);
	}

	public final void method5112() {
		this.aClass168_8321.method1794();
	}

	public final Heap createNativeHeap(int i) {
		Class_v_Sub2 class_v_sub2 = new Class_v_Sub2(i);
		this.nodeCollection.pushBack(class_v_sub2);
		return class_v_sub2;
	}

	final void method5318() {
		this.aBoolean8330 = false;
		method5407();
		if (this.aClass149_8262 == Class149.aClass149_1584)
			method5314();
	}

	public final int za() {
		return anInt8224 + anInt8223 + anInt8318;
	}

	public final SpriteToolkit method5029(int i, int i_19_, boolean bool, boolean bool_20_) {
		return new Class57_Sub2(this, i, i_19_, bool, bool_20_);
	}

	public final SpriteToolkit createSpriteToolkit(Sprite sprite, boolean loaded) {
		SpriteToolkit class57;
		if (sprite.width != 0 && sprite.height != 0) {
			int[] is = new int[sprite.width * sprite.height];
			int i = 0;
			int i_21_ = 0;
			if (sprite.alpha != null) {
				for (int i_22_ = 0; i_22_ < sprite.height; i_22_++) {
					for (int i_23_ = 0; i_23_ < sprite.width; i_23_++) {
						is[i_21_++] = (sprite.alpha[i] << 24 | (sprite.palette[sprite.raster[i] & 0xff]));
						i++;
					}
				}
			} else {
				for (int i_24_ = 0; i_24_ < sprite.height; i_24_++) {
					for (int i_25_ = 0; i_25_ < sprite.width; i_25_++) {
						int i_26_ = (sprite.palette[sprite.raster[i++] & 0xff]);
						is[i_21_++] = i_26_ != 0 ? ~0xffffff | i_26_ : 0;
					}
				}
			}
			class57 = createRenderSprite(is, 0, sprite.width, sprite.width, sprite.height);
		} else
			class57 = createRenderSprite(new int[] { 0 }, 0, 1, 1, 1);
		class57.method621(sprite.offsetX, sprite.offsetY, sprite.deltaWidth, sprite.deltaHeight);
		return class57;
	}

	public final SpriteToolkit bu(int[] is, int i, int i_27_, int i_28_, int i_29_, boolean bool) {
		return new Class57_Sub2(this, i_28_, i_29_, is, i, i_27_);
	}

	public final ToolkitLoader createClippingMask(int i, int i_31_, int[] is, int[] is_32_) {
		return JavaGraphicsToolkitLoader.method6007(this, i, i_31_, is, is_32_);
	}

	public final void method5169(int i) {
		/* empty */
	}

	abstract void method5320();

	public final FloorToolkit createLandScapeRenderer(int i, int i_49_, int[][] is, int[][] is_50_, int i_51_, int i_52_, int i_53_) {
		return new Class_xa_Sub1(this, i_52_, i_53_, i, i_49_, is, is_50_, i_51_);
	}

	public final Matrix4f cz() {
		return this.aMatrix4f_8363;
	}

	public final Matrix43f getTransformationMatrix() {
		return this.aClass222_8250;
	}

	public final EnvironmentMap createEnvironmentMap(int i, int i_54_, int i_55_, int i_56_, int i_57_, int i_58_) {
		return new Class66_Sub2_Sub1(this, i, i_54_, i_55_, i_56_, i_57_, i_58_);
	}

	public final Interface9_Impl1 method5321() {
		return (this.aClass66_Sub2_8284 != null ? this.aClass66_Sub2_8284.method773() : null);
	}

	public void resetClip() {
		this.anInt8298 = 0;
		this.anInt8357 = 0;
		this.anInt8269 = frameContext.getWidth();
		this.anInt8270 = frameContext.getHeight();
		method5322();
	}

	final void method5322() {
		if (this.aClass149_8262 == Class149.aClass149_1584) {
			anInt8339 = this.anInt8298;
			anInt8272 = this.anInt8357;
			anInt8273 = this.anInt8269;
			anInt8239 = this.anInt8270;
			aFloat8335 = this.aFloat8259;
			aFloat8258 = this.aFloat8260;
		} else {
			anInt8339 = 0;
			anInt8272 = 0;
			anInt8273 = frameContext.getWidth();
			anInt8239 = frameContext.getHeight();
			aFloat8335 = 0.0F;
			aFloat8258 = 1.0F;
		}
		method5325();
		this.aFloat8329 = (float) this.anInt8269 / 2.0F;
		this.aFloat8256 = (float) this.anInt8270 / 2.0F;
		this.aFloat8253 = ((float) this.anInt8298 + this.aFloat8329);
		this.aFloat8255 = ((float) this.anInt8357 + this.aFloat8256);
	}

	public void method5323(InterfaceWithTheB interface8) {
		this.aClass501_8203.method6222(interface8, anObject8300, -391880689);
	}

	final void method5324(int i, int i_72_) {
		anInt8275 = i;
		anInt8276 = i_72_;
		method5325();
		method5326();
	}

	abstract void method5325();

	abstract void method5326();

	abstract void method5327();

	final Matrix4f method5328() {
		if (this.aClass149_8262 == Class149.aClass149_1584)
			return aMatrix4f_8230;
		return aMatrix4f_8225;
	}

	final Matrix4f method5329() {
		if (this.aClass149_8262 == Class149.aClass149_1584)
			return this.aMatrix4f_8231;
		return aMatrix4f_8225;
	}

	public final void cw(Matrix43f class222) {
		this.aClass222_8228 = class222;
		aMatrix4f_8230.method2145(this.aClass222_8228);
		this.aClass222_8229.copy(class222);
		this.aClass222_8229.method2058();
		this.aMatrix4f_8231.method2145(this.aClass222_8229);
		method5503();
		if (this.aClass149_8262 == Class149.aClass149_1584)
			method5331();
	}

	public final void ci(Matrix4f matrix4f) {
		this.aMatrix4f_8246.method2142(matrix4f);
		method5503();
		if (this.aClass149_8262 == Class149.aClass149_1584)
			method5314();
	}

	final void method5330(boolean bool) {
		if (bool != aBoolean8278) {
			aBoolean8278 = bool;
			method5379();
			this.anInt8311 &= ~0xf;
		}
	}

	public final Matrix4f method5045() {
		return this.aMatrix4f_8246;
	}

	final void method5331() {
		this.aBoolean8240 = false;
	}

	void method5332() {
		method5317();
	}

	final Matrix4f method5334() {
		return aMatrix4f_8251;
	}

	public abstract void method5335(Matrix4f matrix4f);

	final void method5336() {
		if (this.aClass149_8262 != Class149.aClass149_1582) {
			Class149 class149 = this.aClass149_8262;
			this.aClass149_8262 = Class149.aClass149_1582;
			if (class149 == Class149.aClass149_1584)
				method5331();
			this.aMatrix4f_8209 = this.aMatrix4f_8247;
			method5314();
			method5322();
			this.anInt8311 &= ~0xf;
		}
	}

	final void method5337() {
		if (this.aClass149_8262 != Class149.aClass149_1583) {
			Class149 class149 = this.aClass149_8262;
			this.aClass149_8262 = Class149.aClass149_1583;
			if (class149 == Class149.aClass149_1584)
				method5331();
			method5443();
			this.aMatrix4f_8209 = this.aMatrix4f_8243;
			method5314();
			method5322();
			this.anInt8311 &= ~0x8;
		}
	}

	final void method5338() {
		if (this.aClass149_8262 != Class149.aClass149_1584) {
			this.aClass149_8262 = Class149.aClass149_1584;
			method5331();
			method5407();
			this.aMatrix4f_8209 = this.aMatrix4f_8246;
			method5314();
			method5322();
			this.anInt8311 &= ~0x7;
		}
	}

	public final FontToolkit createFontToolkit(RSFontMetrics class505, Sprite[] sprites, boolean loaded) {
		return new Class264_Sub5(this, class505, sprites, loaded);
	}

	public final void RA(boolean bool) {
		aBoolean8277 = bool;
		method5410();
	}

	final void method5339(boolean bool) {
		if (bool != aBoolean8279) {
			aBoolean8279 = bool;
			method5340();
			this.anInt8311 &= ~0xf;
		}
	}

	abstract void method5340();

	public void method_do(float f, float f_82_, float f_83_, float[] fs) {
		float f_84_ = (this.aMatrix4f_8205.aFloatArray2594[15] + this.aMatrix4f_8205.aFloatArray2594[3] * f + (this.aMatrix4f_8205.aFloatArray2594[7] * f_82_) + (this.aMatrix4f_8205.aFloatArray2594[11] * f_83_));
		float f_85_ = (this.aMatrix4f_8205.aFloatArray2594[12] + this.aMatrix4f_8205.aFloatArray2594[0] * f + (this.aMatrix4f_8205.aFloatArray2594[4] * f_82_) + (this.aMatrix4f_8205.aFloatArray2594[8] * f_83_));
		float f_86_ = (this.aMatrix4f_8205.aFloatArray2594[13] + this.aMatrix4f_8205.aFloatArray2594[1] * f + (this.aMatrix4f_8205.aFloatArray2594[5] * f_82_) + (this.aMatrix4f_8205.aFloatArray2594[9] * f_83_));
		float f_87_ = (aMatrix4f_8230.aFloatArray2594[14] + aMatrix4f_8230.aFloatArray2594[2] * f + aMatrix4f_8230.aFloatArray2594[6] * f_82_ + aMatrix4f_8230.aFloatArray2594[10] * f_83_);
		fs[0] = (this.aFloat8253 + this.aFloat8329 * f_85_ / f_84_);
		fs[1] = (this.aFloat8255 + this.aFloat8256 * f_86_ / f_84_);
		fs[2] = f_87_;
	}

	public int method5025(int i, int i_88_, int i_89_, int i_90_, int i_91_, int i_92_) {
		int i_93_ = 0;
		float f = (this.aMatrix4f_8205.aFloatArray2594[14] + (this.aMatrix4f_8205.aFloatArray2594[2] * (float) i) + (this.aMatrix4f_8205.aFloatArray2594[6] * (float) i_88_) + (this.aMatrix4f_8205.aFloatArray2594[10] * (float) i_89_));
		float f_94_ = (this.aMatrix4f_8205.aFloatArray2594[14] + (this.aMatrix4f_8205.aFloatArray2594[2] * (float) i_90_) + (this.aMatrix4f_8205.aFloatArray2594[6] * (float) i_91_) + (this.aMatrix4f_8205.aFloatArray2594[10] * (float) i_92_));
		float f_95_ = (this.aMatrix4f_8205.aFloatArray2594[15] + (this.aMatrix4f_8205.aFloatArray2594[3] * (float) i) + (this.aMatrix4f_8205.aFloatArray2594[7] * (float) i_88_) + (this.aMatrix4f_8205.aFloatArray2594[11] * (float) i_89_));
		float f_96_ = (this.aMatrix4f_8205.aFloatArray2594[15] + (this.aMatrix4f_8205.aFloatArray2594[3] * (float) i_90_) + (this.aMatrix4f_8205.aFloatArray2594[7] * (float) i_91_) + (this.aMatrix4f_8205.aFloatArray2594[11] * (float) i_92_));
		if (f < -f_95_ && f_94_ < -f_96_)
			i_93_ |= 0x10;
		else if (f > f_95_ && f_94_ > f_96_)
			i_93_ |= 0x20;
		float f_97_ = (this.aMatrix4f_8205.aFloatArray2594[12] + (this.aMatrix4f_8205.aFloatArray2594[0] * (float) i) + (this.aMatrix4f_8205.aFloatArray2594[4] * (float) i_88_) + (this.aMatrix4f_8205.aFloatArray2594[8] * (float) i_89_));
		float f_98_ = (this.aMatrix4f_8205.aFloatArray2594[12] + (this.aMatrix4f_8205.aFloatArray2594[0] * (float) i_90_) + (this.aMatrix4f_8205.aFloatArray2594[4] * (float) i_91_) + (this.aMatrix4f_8205.aFloatArray2594[8] * (float) i_92_));
		if (f_97_ < -f_95_ && f_98_ < -f_96_)
			i_93_ |= 0x1;
		if (f_97_ > f_95_ && f_98_ > f_96_)
			i_93_ |= 0x2;
		float f_99_ = (this.aMatrix4f_8205.aFloatArray2594[13] + (this.aMatrix4f_8205.aFloatArray2594[1] * (float) i) + (this.aMatrix4f_8205.aFloatArray2594[5] * (float) i_88_) + (this.aMatrix4f_8205.aFloatArray2594[9] * (float) i_89_));
		float f_100_ = (this.aMatrix4f_8205.aFloatArray2594[13] + (this.aMatrix4f_8205.aFloatArray2594[1] * (float) i_90_) + (this.aMatrix4f_8205.aFloatArray2594[5] * (float) i_91_) + (this.aMatrix4f_8205.aFloatArray2594[9] * (float) i_92_));
		if (f_99_ < -f_95_ && f_100_ < -f_96_)
			i_93_ |= 0x4;
		if (f_99_ > f_95_ && f_100_ > f_96_)
			i_93_ |= 0x8;
		return i_93_;
	}

	public final int method5048() {
		return anInt8348 - 2;
	}

	public final void constrainClip(int x, int y, int width, int height) {
		int frameHeight;
		int frameWidth;
		if (frameContext != null) {
			frameWidth = frameContext.getWidth();
			frameHeight = frameContext.getHeight();
		} else {
			frameHeight = 0;
			frameWidth = 0;
		}
		x = x >= 0 ? x : 0;
		width = width <= frameWidth ? width : frameWidth;
		y = y >= 0 ? y : 0;
		height = height <= frameHeight ? height : frameHeight;
		boolean bool = false;
		if (anInt8265 < x) {
			anInt8265 = x;
			bool = true;
		}
		if (anInt8234 > width) {
			anInt8234 = width;
			bool = true;
		}
		if (anInt8263 < y) {
			anInt8263 = y;
			bool = true;
		}
		if (anInt8241 > height) {
			anInt8241 = height;
			bool = true;
		}
		if (bool) {
			if (!aBoolean8254) {
				aBoolean8254 = true;
				method5327();
			}
			method5326();
		}
	}

	public final void setLights(int i, Light[] class298_sub10s) {
		for (int i_106_ = 0; i_106_ < i; i_106_++)
			aClass298_Sub10Array8286[i_106_] = class298_sub10s[i_106_];
		anInt8296 = i;
		if (this.aClass149_8262 == Class149.aClass149_1584)
			method5346();
	}

	public final void setModelAmbient(float f) {
		if (aFloat8291 != f) {
			aFloat8291 = f;
			method5411();
			method5320();
		}
	}

	public final void updateSun(int i, float f, float f_107_, float f_108_, float f_109_, float f_110_) {
		boolean bool = this.anInt8287 != i;
		if (bool || aFloat8364 != f || aFloat8293 != f_107_) {
			this.anInt8287 = i;
			aFloat8364 = f;
			aFloat8293 = f_107_;
			if (bool) {
				aFloat8362 = (float) (this.anInt8287 & 0xff0000) / 1.671168E7F;
				aFloat8289 = (float) (this.anInt8287 & 0xff00) / 65280.0F;
				aFloat8290 = ((float) (this.anInt8287 & 0xff) / 255.0F);
				method5411();
			}
			method5343();
		}
		if (this.aFloatArray8285[0] != f_108_ || this.aFloatArray8285[1] != f_109_ || this.aFloatArray8285[2] != f_110_) {
			this.aFloatArray8285[0] = f_108_;
			this.aFloatArray8285[1] = f_109_;
			this.aFloatArray8285[2] = f_110_;
			this.aFloatArray8340[0] = -f_108_;
			this.aFloatArray8340[1] = -f_109_;
			this.aFloatArray8340[2] = -f_110_;
			float f_111_ = (float) (1.0 / Math.sqrt((double) (f_108_ * f_108_ + f_109_ * f_109_ + f_110_ * f_110_)));
			aFloatArray8283[0] = f_108_ * f_111_;
			aFloatArray8283[1] = f_109_ * f_111_;
			aFloatArray8283[2] = f_110_ * f_111_;
			aFloatArray8248[0] = -aFloatArray8283[0];
			aFloatArray8248[1] = -aFloatArray8283[1];
			aFloatArray8248[2] = -aFloatArray8283[2];
			method5422();
			this.anInt8299 = (int) (f_108_ * 256.0F / f_109_);
			this.anInt8317 = (int) (f_110_ * 256.0F / f_109_);
		}
		method5320();
	}

	public final void J(int i) {
		this.anInt8313 = 0;
		for (/**/; i > 1; i >>= 1)
			this.anInt8313++;
		this.anInt8297 = 1 << this.anInt8313;
	}

	abstract void method5341();

	abstract void method5343();

	abstract void method5345();

	final void method5346() {
		if (method5438())
			method5347();
		anInt8295 = anInt8296;
		anInt8296 = 0;
	}

	abstract void method5347();

	abstract boolean method5348(Class55 class55, Class77 class77);

	abstract boolean method5349(Class55 class55, Class77 class77);

	final Interface9_Impl2 method5350(int i, int i_114_, boolean bool, int[] is) {
		return method5355(i, i_114_, bool, is, 0, 0);
	}

	final Interface9_Impl2 method5351(Class55 class55, int i, int i_115_, boolean bool, byte[] is) {
		return method5439(class55, i, i_115_, bool, is, 0, 0);
	}

	final Interface9_Impl2 method5352(Class55 class55, int i, int i_116_, boolean bool, float[] fs) {
		return method5453(class55, i, i_116_, bool, fs, 0, 0);
	}

	abstract Interface9_Impl2 method5353(Class55 class55, Class77 class77, int i, int i_117_);

	abstract Interface9_Impl2 method5355(int i, int i_121_, boolean bool, int[] is, int i_122_, int i_123_);

	abstract Interface9_Impl2_Impl1 method5356(Class55 class55, Class77 class77, int i, int i_124_);

	public final void method4787(boolean bool) {
		/* empty */
	}

	public final void method5357(int i) {
		if (anInt8325 != i) {
			anInt8325 = i;
			method5371();
		}
	}

	public final void method5358(Interface9 interface9) {
		if (this.anInterface9Array8303[anInt8325] != interface9) {
			this.anInterface9Array8303[anInt8325] = interface9;
			if (interface9 != null)
				interface9.method128();
			else
				anInterface9_Impl2_8310.method128();
			this.anInt8311 &= ~0x1;
		}
	}

	public abstract void method5359();

	public final void method5360(int i) {
		switch (i) {
		case 3:
			method5361(Class175.aClass175_1767, Class175.aClass175_1765);
			break;
		case 1:
			method5361(Class175.aClass175_1770, Class175.aClass175_1770);
			break;
		case 4:
			method5361(Class175.aClass175_1768, Class175.aClass175_1768);
			break;
		case 0:
			method5361(Class175.aClass175_1765, Class175.aClass175_1765);
			break;
		case 2:
			method5361(Class175.aClass175_1769, Class175.aClass175_1770);
			break;
		}
	}

	public final void method5361(Class175 class175, Class175 class175_125_) {
		boolean bool = false;
		if (aClass175Array8294[anInt8325] != class175) {
			aClass175Array8294[anInt8325] = class175;
			method5372();
			bool = true;
		}
		if (aClass175Array8307[anInt8325] != class175_125_) {
			aClass175Array8307[anInt8325] = class175_125_;
			method5444();
			bool = true;
		}
		if (bool)
			this.anInt8311 &= ~0xd;
	}

	public final void method5363(int i, Class183 class183) {
		method5364(i, class183, false);
	}

	abstract void method5364(int i, Class183 class183, boolean bool);

	public final Matrix4f method5365() {
		return aMatrix4fArray8304[anInt8325];
	}

	public final void method5366(Class171 class171) {
		aClass171Array8305[anInt8325] = class171;
		method5368();
	}

	final void method5367() {
		if (aClass171Array8305[anInt8325] != Class171.aClass171_1742) {
			aClass171Array8305[anInt8325] = Class171.aClass171_1742;
			aMatrix4fArray8304[anInt8325].method2172();
			method5368();
		}
	}

	final void method5368() {
		method5486();
	}

	abstract void method5369();

	abstract void method5371();

	abstract void method5372();

	public final int method5004(int i, int i_132_) {
		return i | i_132_;
	}

	Class78 method5373() {
		return this.aClass78_8213;
	}

	public final void O() {
		this.aBoolean8326 = false;
	}

	final void method5374(int i) {
		if (this.anInt8353 != i) {
			Class174 class174;
			boolean bool;
			boolean bool_142_;
			if (i == 1) {
				class174 = Class174.aClass174_1762;
				bool = true;
				bool_142_ = true;
			} else if (i == 2) {
				class174 = Class174.aClass174_1760;
				bool = false;
				bool_142_ = true;
			} else if (i == 128) {
				class174 = Class174.aClass174_1761;
				bool = true;
				bool_142_ = true;
			} else {
				class174 = Class174.aClass174_1763;
				bool = false;
				bool_142_ = false;
			}
			if (bool != aBoolean8309) {
				aBoolean8309 = bool;
				method5375();
			}
			if (bool_142_ != aBoolean8245) {
				aBoolean8245 = bool_142_;
				method5305();
			}
			if (class174 != aClass174_8268) {
				aClass174_8268 = class174;
				method5376();
			}
			this.anInt8353 = i;
			this.anInt8311 &= ~0xc;
		}
	}

	abstract void method5375();

	abstract void method5376();

	public final void drawFog(int color, int intensity, int i_144_) {
		if (anInt8332 != color || anInt8233 != intensity || anInt8334 != i_144_) {
			anInt8332 = color;
			anInt8233 = intensity;
			anInt8334 = i_144_;
			method5377();
			method5379();
		}
	}

	final void method5377() {
		if (this.aClass161_8314 != null)
			this.aClass161_8314.method1723();
		method5378();
	}

	abstract void method5378();

	abstract void method5379();

	abstract void method5380(boolean bool);

	abstract Interface7_Impl2 method5381(boolean bool);

	abstract Interface7_Impl1 method5382(boolean bool);

	public abstract void method5383(int i, Interface7_Impl1 interface7_impl1);

	abstract void method5384(Interface7_Impl2 interface7_impl2);

	public final void drawRectangle(int startX, int startY, int endX, int endY, int rgba, int mode) {
		drawDiagonalLine(startX, startY, startX + endX, startY, rgba, mode);
		drawDiagonalLine(startX, startY + endY, startX + endX, startY + endY, rgba, mode);
		drawDiagonalLine(startX, startY, startX, startY + endY, rgba, mode);
		drawDiagonalLine(startX + endX, startY, startX + endX, startY + endY, rgba, mode);
	}

	public final void N(int i, int i_163_, int i_164_, int i_165_, int i_166_, int i_167_, byte[] is, int i_168_, int i_169_) {
		/* empty */
	}

	public final void method5020(int i, int i_170_, float f, int i_171_, int i_172_, float f_173_, int i_174_, int i_175_, float f_176_, int i_177_, int i_178_, int i_179_, int i_180_) {
		/* empty */
	}

	public final int method5386() {
		return anInt8325;
	}

	public final void XA(int i, int i_181_, int i_182_, int i_183_, int i_184_) {
		drawDiagonalLine(i, i_181_, i + i_182_, i_181_, i_183_, i_184_);
	}

	public final void G(int i, int i_185_, int i_186_, int i_187_, int i_188_) {
		drawDiagonalLine(i, i_185_, i, i_185_ + i_186_, i_187_, i_188_);
	}

	public final void drawDiagonalLine(int startX, int startY, int endX, int endY, int rgba, int mode) {
		drawThickDiagonalLine(startX, startY, endX, endY, rgba, 1, mode);
	}

	public void drawDashedLine(int i, int i_194_, int i_195_, int i_196_, int i_197_, int i_198_, int i_199_, int i_200_, int i_201_) {
		float f = (float) i_195_ - (float) i;
		float f_202_ = (float) i_196_ - (float) i_194_;
		if (f == 0.0F && f_202_ == 0.0F)
			f = 1.0F;
		else {
			float f_203_ = (float) (1.0 / Math.sqrt((double) (f * f + f_202_ * f_202_)));
			f *= f_203_;
			f_202_ *= f_203_;
		}
		method5337();
		Class161 class161 = this.aClass161Array8315[13];
		class161.method1713();
		class161.method1715(i_197_);
		method5374(i_198_);
		class161.method1718();
		method5380(false);
		i_201_ %= i_200_ + i_199_;
		float f_204_ = f * (float) i_199_;
		float f_205_ = f_202_ * (float) i_199_;
		float f_206_ = 0.0F;
		float f_207_ = 0.0F;
		float f_208_ = f_204_;
		float f_209_ = f_205_;
		if (i_201_ > i_199_) {
			f_206_ = f * (float) (i_199_ + i_200_ - i_201_);
			f_207_ = f_202_ * (float) (i_199_ + i_200_ - i_201_);
		} else {
			f_208_ = f * (float) (i_199_ - i_201_);
			f_209_ = f_202_ * (float) (i_199_ - i_201_);
		}
		float f_210_ = (float) i + f_206_;
		float f_211_ = (float) i_194_ + f_207_;
		float f_212_ = f * (float) i_200_;
		float f_213_ = f_202_ * (float) i_200_;
		for (;;) {
			if (i_195_ > i) {
				if (f_210_ > (float) i_195_)
					break;
				if (f_210_ + f_208_ > (float) i_195_)
					f_208_ = (float) i_195_ - f_210_;
			} else {
				if (f_210_ < (float) i_195_)
					break;
				if (f_210_ + f_208_ < (float) i_195_)
					f_208_ = (float) i_195_ - f_210_;
			}
			if (i_196_ > i_194_) {
				if (f_211_ > (float) i_196_)
					break;
				if (f_211_ + f_209_ > (float) i_196_)
					f_209_ = (float) i_196_ - f_211_;
			} else {
				if (f_211_ < (float) i_196_)
					break;
				if (f_211_ + f_209_ < (float) i_196_)
					f_209_ = (float) i_196_ - f_211_;
			}
			if (!method5311(f_210_, f_211_, 0.0F, f_210_ + f_208_, f_211_ + f_209_, 0.0F))
				return;
			method5388();
			f_210_ += f_212_ + f_208_;
			f_211_ += f_213_ + f_209_;
			f_208_ = f_204_;
			f_209_ = f_205_;
		}
		method5380(true);
		class161.method1714();
	}

	public void method5007(int i, int i_214_, int i_215_, int i_216_, int i_217_, int i_218_, ToolkitLoader toolkitLoader, int i_219_, int i_220_, int i_221_, int i_222_, int i_223_) {
		/* empty */
	}

	public final void method5022(int i, int i_224_, int i_225_, int i_226_, int i_227_, int i_228_, ToolkitLoader toolkitLoader, int i_229_, int i_230_) {
		/* empty */
	}

	Matrix4f method5387() {
		if (this.aClass149_8262 == Class149.aClass149_1584) {
			if (!this.aBoolean8240)
				method5477();
			return this.aMatrix4f_8338;
		}
		return this.aMatrix4f_8227;
	}

	public final void renderParticles(Class69 class69) {
		this.aClass176_8345.method1829(this, class69);
	}

	final void method5388() {
		method5383(0, this.anInterface7_Impl1_8343);
		method5455(this.aClass153_8337);
		method5398(Class187.aClass187_1908, 0, 1);
	}

	public final void method5389() {
		method5390(Class187.aClass187_1906, 2);
	}

	final void method5390(Class187 class187, int i) {
		method5383(0, this.anInterface7_Impl1_8202);
		method5455(this.aClass153_8356);
		method5398(class187, 0, i);
	}

	public abstract void method5392(Class187 class187, int i, int i_232_, int i_233_, int i_234_);

	final void method5393() {
		if (this.anInt8311 != 8) {
			method5338();
			method5330(true);
			method5339(true);
			method5399(true);
			method5374(1);
			this.anInt8311 = 8;
		}
	}

	abstract void method5394(int i);

	public final boolean isResizable() {
		return true;
	}

	public final void qa(int[] is) {
		is[0] = anInt8265;
		is[1] = anInt8263;
		is[2] = anInt8234;
		is[3] = anInt8241;
	}

	final void method5397(int i) {
		if (anInt8366 != i) {
			anInt8366 = i;
			method5376();
		}
	}

	public abstract void method5398(Class187 class187, int i, int i_247_);

	final void method5399(boolean bool) {
		if (bool != aBoolean8237) {
			aBoolean8237 = bool;
			method5410();
			this.anInt8311 &= ~0xf;
		}
	}

	final void method5402() {
		this.aClass159_8220 = new Class159(this);
		aBoolean8214 = false;
		try {
			this.aClass137_8316 = new Class137_Sub1(this);
			this.aClass138_8257 = new Class138_Sub1(this);
			this.aClass130_8249 = new Class130_Sub2(this);
			this.aClass161_Sub1_Sub2_8319 = new Class161_Sub1_Sub2(this, this.aClass159_8220, true);
			this.aClass161_Sub1_Sub1_8266 = new Class161_Sub1_Sub1(this, (this.aClass159_8220));
		} catch (Exception exception) {
			exception.printStackTrace();
			this.aClass137_8316 = new Class137_Sub2(this);
			this.aClass138_8257 = new Class138_Sub2(this);
			this.aClass130_8249 = new Class130_Sub1(this);
			this.aClass161_Sub1_Sub2_8319 = null;
			this.aClass161_Sub1_Sub1_8266 = null;
			aBoolean8214 = true;
		}
		int i;
		int i_274_;
		if (frameContext != null) {
			i_274_ = frameContext.getWidth();
			i = frameContext.getHeight();
		} else {
			i = 0;
			i_274_ = 0;
		}
		this.aClass168_8321 = new Class168(this, i_274_, i);
		if (!aBoolean8214) {
			this.bloomToolkits[1] = new BloomEffect(this);
			this.aClass168_8321.method1792(this.bloomToolkits[1]);
		}
		if (this.aClass161_8314 != null) {
			this.aClass161_8314.method1714();
			this.aClass161_8314 = null;
		}
		method5307();
	}

	abstract Class153 method5404(Class181[] class181s);

	static {
		aMatrix4f_8225 = new Matrix4f();
	}

	final void CA(int i, int i_318_, int i_319_, int i_320_, int i_321_) {
		/* empty */
	}

	public void GA(float f, float f_335_) {
		this.aFloat8259 = f;
		this.aFloat8260 = f_335_;
		method5322();
	}

	final void method5407() {
		if (!this.aBoolean8330)
			this.aBoolean8330 = true;
	}

	public void dr(float f, float f_339_, float f_340_, float[] fs) {
		float f_341_ = (this.aMatrix4f_8205.aFloatArray2594[14] + this.aMatrix4f_8205.aFloatArray2594[2] * f + (this.aMatrix4f_8205.aFloatArray2594[6] * f_339_) + (this.aMatrix4f_8205.aFloatArray2594[10] * f_340_));
		float f_342_ = (this.aMatrix4f_8205.aFloatArray2594[15] + this.aMatrix4f_8205.aFloatArray2594[3] * f + (this.aMatrix4f_8205.aFloatArray2594[7] * f_339_) + (this.aMatrix4f_8205.aFloatArray2594[11] * f_340_));
		if (f_341_ < -f_342_ || f_341_ > f_342_) {
			float[] fs_343_ = fs;
			float[] fs_344_ = fs;
			fs[2] = Float.NaN;
			fs_344_[1] = Float.NaN;
			fs_343_[0] = Float.NaN;
		} else {
			float f_345_ = (this.aMatrix4f_8205.aFloatArray2594[12] + (this.aMatrix4f_8205.aFloatArray2594[0] * f) + (this.aMatrix4f_8205.aFloatArray2594[4] * f_339_) + (this.aMatrix4f_8205.aFloatArray2594[8] * f_340_));
			if (f_345_ < -f_342_ || f_345_ > f_342_) {
				float[] fs_346_ = fs;
				float[] fs_347_ = fs;
				fs[2] = Float.NaN;
				fs_347_[1] = Float.NaN;
				fs_346_[0] = Float.NaN;
			} else {
				float f_348_ = ((this.aMatrix4f_8205.aFloatArray2594[13]) + (this.aMatrix4f_8205.aFloatArray2594[1]) * f + (this.aMatrix4f_8205.aFloatArray2594[5]) * f_339_ + (this.aMatrix4f_8205.aFloatArray2594[9]) * f_340_);
				if (f_348_ < -f_342_ || f_348_ > f_342_) {
					float[] fs_349_ = fs;
					float[] fs_350_ = fs;
					fs[2] = Float.NaN;
					fs_350_[1] = Float.NaN;
					fs_349_[0] = Float.NaN;
				} else {
					float f_351_ = (aMatrix4f_8230.aFloatArray2594[14] + aMatrix4f_8230.aFloatArray2594[2] * f + aMatrix4f_8230.aFloatArray2594[6] * f_339_ + aMatrix4f_8230.aFloatArray2594[10] * f_340_);
					fs[0] = (this.aFloat8253 + (this.aFloat8329 * f_345_ / f_342_));
					fs[1] = (this.aFloat8255 + (this.aFloat8256 * f_348_ / f_342_));
					fs[2] = f_351_;
				}
			}
		}
	}

	public Matrix43f method5044() {
		return this.aClass222_8228;
	}

	abstract void method5410();

	abstract void method5411();

	public final void setClip(int x, int y, int width, int height) {
		int i_361_;
		int frameWidth;
		if (frameContext != null) {
			frameWidth = frameContext.getWidth();
			i_361_ = frameContext.getHeight();
		} else {
			i_361_ = 0;
			frameWidth = 0;
		}
		if (x <= 0 && width >= frameWidth - 1 && y <= 0 && height >= i_361_ - 1)
			L();
		else {
			anInt8265 = x >= 0 ? x : 0;
			anInt8234 = width <= frameWidth ? width : frameWidth;
			anInt8263 = y >= 0 ? y : 0;
			anInt8241 = height <= i_361_ ? height : i_361_;
			if (!aBoolean8254) {
				aBoolean8254 = true;
				method5327();
			}
			method5326();
		}
	}

	public void method5414(int i) {
		if (i != anInt8274) {
			anInt8274 = i;
			method5369();
		}
	}

	abstract Interface9_Impl1 method5415(int i, boolean bool, int[][] is);

	abstract Interface9_Impl3 method5416(Class55 class55, int i, int i_396_, int i_397_, boolean bool, byte[] is);

	public final boolean method5082() {
		return true;
	}

	public final void setBufferHeap(Heap class_v) {
		this.aNativeHeap8221 = ((Class_v_Sub2) class_v).aNativeHeap9784;
	}

	final void method5417(boolean bool) {
		if (bool != aBoolean8264) {
			aBoolean8264 = bool;
			method5341();
			this.anInt8311 &= ~0x7;
		}
	}

	final void method5419() {
		this.aBoolean8242 = false;
		if (this.aClass149_8262 == Class149.aClass149_1583) {
			method5443();
			method5314();
		}
	}

	final void method5420() {
		this.anInterface7_Impl1_8354 = method5382(false);
		this.anInterface7_Impl1_8354.method72(3096, 12);
		aByteBuffer8216.clear();
		aByteBuffer8216.putFloat(0.0F);
		aByteBuffer8216.putFloat(0.0F);
		aByteBuffer8216.putFloat(0.0F);
		for (int i = 0; i <= 256; i++) {
			double d = (double) (i * 2) * 3.141592653589793 / 256.0;
			float f = (float) Math.cos(d);
			float f_455_ = (float) Math.sin(d);
			aByteBuffer8216.putFloat(f_455_);
			aByteBuffer8216.putFloat(f);
			aByteBuffer8216.putFloat(0.0F);
		}
		this.anInterface7_Impl1_8354.method63(0, aByteBuffer8216.position(), aLong8217);
	}

	public static boolean libraryExists() {
		return JS5PrefetchType.getPrefetch().load("jaclib");
	}

	abstract void method5422();

	public final int method5017(int i, int i_474_) {
		return i & i_474_ ^ i_474_;
	}

	abstract void method5427(int i, Class183 class183, boolean bool, boolean bool_475_);

	public final void L() {
		if (frameContext != null) {
			anInt8263 = 0;
			anInt8265 = 0;
			anInt8234 = frameContext.getWidth();
			anInt8241 = frameContext.getHeight();
		} else {
			anInt8241 = 0;
			anInt8234 = 0;
			anInt8263 = 0;
			anInt8265 = 0;
		}
		if (aBoolean8254) {
			aBoolean8254 = false;
			method5327();
		}
	}

	Matrix4f method5431() {
		return this.aMatrix4f_8227;
	}

	final boolean method5438() {
		return aBoolean8214;
	}

	abstract Interface9_Impl2 method5439(Class55 class55, int i, int i_482_, boolean bool, byte[] is, int i_483_, int i_484_);

	public final void method5058(int i, Class78 class78) {
		if (!this.aBoolean8326)
			throw new RuntimeException("");
		this.anInt8328 = i;
		this.aClass78_8213 = class78;
		if (this.aBoolean8327) {
			this.aClass161Array8315[3].method1716();
			this.aClass161Array8315[3].method1723();
		}
	}

	final void method5443() {
		if (!this.aBoolean8242) {
			int i;
			int i_490_;
			if (frameContext != null) {
				i_490_ = frameContext.getWidth();
				i = frameContext.getHeight();
			} else {
				i = 0;
				i_490_ = 0;
			}
			Matrix4f matrix4f = this.aMatrix4f_8243;
			if (i_490_ != 0 && i != 0)
				matrix4f.method2151(0.0F, (float) i_490_, 0.0F, (float) i, -1.0F, 1.0F);
			else
				matrix4f.method2172();
			this.aMatrix4f_8244.method2142(matrix4f);
			method5335(this.aMatrix4f_8244);
			this.aBoolean8242 = true;
		}
	}

	abstract void method5444();

	public final void drawFilledRectangle(int startX, int startY, int endX, int endY, int rgba, int mode) {
		if (aBoolean8277) {
			RA(false);
			this.aClass57_Sub2_8320.method691(startX, startY, endX, endY, 0, rgba, mode);
			RA(true);
		} else
			this.aClass57_Sub2_8320.method691(startX, startY, endX, endY, 0, rgba, mode);
	}

	public void method5187(int i, int i_526_, int i_527_, int i_528_) {
		this.anInt8298 = i;
		this.anInt8357 = i_526_;
		this.anInt8269 = i_527_;
		this.anInt8270 = i_528_;
		method5322();
	}

	public final SpriteToolkit method5033(int i, int i_529_, int i_530_, int i_531_, boolean bool) {
		Class57_Sub2 class57_sub2 = new Class57_Sub2(this, i_530_, i_531_, bool, false);
		class57_sub2.method675(0, 0, i_530_, i_531_, i, i_529_);
		return class57_sub2;
	}

	final void method5450() {
		method5411();
		method5343();
		method5341();
		method5346();
		method5422();
		method5320();
		method5345();
		method5340();
		method5410();
		method5379();
		method5378();
		method5305();
		method5376();
		method5375();
		for (int i = anInt8347 - 1; i >= 0; i--) {
			method5357(i);
			method5372();
			method5444();
			method5367();
		}
		method5369();
		method5325();
	}

	abstract Interface9_Impl2 method5453(Class55 class55, int i, int i_540_, boolean bool, float[] fs, int i_541_, int i_542_);

	public abstract void method5455(Class153 class153);

	NativeToolkit(MaterialRawLoader interface_ma, Js5FileSystem fileSystem, int i, int samples) {
		super(interface_ma);
		this.aClass222_8235 = new Matrix43f();
		aMatrix4f_8236 = new Matrix4f();
		this.aMatrix4f_8204 = new Matrix4f();
		this.aClass217_8238 = new Vector3f();
		this.aFloatArray8312 = new float[4];
		this.aBoolean8240 = false;
		this.aClass149_8262 = Class149.aClass149_1582;
		this.aBoolean8242 = false;
		this.aMatrix4f_8243 = new Matrix4f();
		this.aMatrix4f_8244 = new Matrix4f();
		this.aBoolean8330 = false;
		this.aMatrix4f_8246 = new Matrix4f();
		this.aMatrix4f_8247 = new Matrix4f();
		this.aMatrix4f_8209 = this.aMatrix4f_8247;
		aMatrix4f_8333 = new Matrix4f();
		this.aMatrix4f_8205 = new Matrix4f();
		aMatrix4f_8251 = new Matrix4f();
		this.aFloatArrayArray8252 = new float[6][4];
		aFloat8335 = 0.0F;
		aFloat8258 = 1.0F;
		this.aFloat8259 = 0.0F;
		this.aFloat8260 = 1.0F;
		aFloat8261 = 50.0F;
		aFloat8308 = 3584.0F;
		anInt8263 = 0;
		anInt8241 = 0;
		anInt8265 = 0;
		anInt8234 = 0;
		this.anInt8298 = 0;
		this.anInt8357 = 0;
		this.anInt8269 = 0;
		this.anInt8270 = 0;
		anInt8339 = 0;
		anInt8272 = 0;
		anInt8273 = 0;
		anInt8239 = 0;
		anInt8275 = 0;
		anInt8276 = 0;
		aBoolean8277 = true;
		aBoolean8237 = false;
		aBoolean8279 = false;
		aBoolean8264 = false;
		aBoolean8281 = true;
		aBoolean8282 = false;
		aFloatArray8283 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };
		aFloatArray8248 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };
		this.aFloatArray8285 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };
		this.aFloatArray8340 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };
		this.anInt8287 = 16777215;
		aFloat8362 = 1.0F;
		aFloat8289 = 1.0F;
		aFloat8290 = 1.0F;
		aFloat8291 = 1.0F;
		aFloat8364 = -1.0F;
		aFloat8293 = -1.0F;
		this.anInt8297 = 8;
		this.anInt8313 = 3;
		this.anInt8271 = 128;
		anInt8325 = 0;
		this.aClass161Array8315 = new Class161[16];
		this.bloomToolkits = new BloomToolkit[2];
		this.aBoolean8327 = false;
		aBoolean8331 = true;
		anInt8332 = -1;
		anInt8233 = -1;
		anInt8334 = 0;
		this.anInt8353 = 1;
		aClass174_8268 = Class174.aClass174_1762;
		aBoolean8245 = true;
		aBoolean8309 = true;
		this.cleaned = false;
		new Stream();
		this.javaGraphicsModelTookits = new JavaGraphicsModelTookit[7];
		this.javaGraphicsModelTookits2 = new JavaGraphicsModelTookit[7];
		this.aMatrix4f_8363 = new Matrix4f();
		this.aClass222_8250 = new Matrix43f();
		anInt8366 = -1;
		try {
			this.aClass243_8361 = fileSystem;
			multisample = i;
			this.samples = samples;
			Class374_Sub1.method4640(false, true, -162450455);
			if (textures != null)
				this.aClass157_8351 = new Class157(this, textures);
			else
				this.aClass157_8351 = null;
			if (this.samples == 0)
				this.anIntArray8215 = Class294.anIntArray3165;
			else
				this.anIntArray8215 = Class379.anIntArray4098;
			try {
				Field field = sun.misc.Unsafe.class.getDeclaredField("theUnsafe");
				field.setAccessible(true);
				anUnsafe8219 = (Unsafe) field.get(null);
			} catch (Exception exception) {
				/* empty */
			}
			aByteBuffer8216 = ByteBuffer.allocateDirect(4194304);
			aByteBuffer8216.order(ByteOrder.nativeOrder());
			aLong8217 = DirectBufferHelper.getDirectBufferAddress(aByteBuffer8216);
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			destroy();
			if (throwable instanceof OutOfMemoryError)
				throw (OutOfMemoryError) throwable;
			throw new RuntimeException("");
		}
		setBufferHeap(createNativeHeap(131072));
	}

	public final void drawThickDiagonalLine(int startX, int startY, int endX, int endY, int rgba, int lineWidth, int mode) {
		startX += 1.0F;
		startY += 1.0F;
		endX += 1.0F;
		endY += 1.0F;
		float f = (float) (endX - startX);
		float f_565_ = (float) (endY - startY);
		float f_566_ = 1.0F / (float) Math.sqrt((double) (f * f + f_565_ * f_565_));
		f *= f_566_;
		f_565_ *= f_566_;
		startX -= f;
		startY -= f_565_;
		float f_567_ = -f_565_;
		float f_568_ = f;
		f_567_ *= 0.5F * (float) lineWidth;
		f_568_ *= 0.5F * (float) lineWidth;
		this.aClass57_Sub2_8320.method641((float) startX - f_567_, (float) startY - f_568_, (float) endX - f_567_, (float) endY - f_568_, (float) startX + f_567_, (float) startY + f_568_, 0, rgba, mode);
	}

	void method5463() {
		method5292(7);
		method5450();
	}

	public final void method5467() {
		if (this.anInt8311 != 2) {
			method5337();
			method5330(false);
			method5417(false);
			method5339(false);
			method5399(false);
			this.anInt8311 = 2;
		}
	}

	public final boolean at() {
		return true;
	}

	Matrix43f method5477() {
		if (this.aClass149_8262 == Class149.aClass149_1584) {
			if (!this.aBoolean8240) {
				this.aClass222_8232.copy(this.aClass222_8226);
				this.aClass222_8232.method2073(this.aClass222_8228);
				this.aMatrix4f_8338.method2145(this.aClass222_8232);
				this.aBoolean8240 = true;
			}
			return this.aClass222_8232;
		}
		return this.aClass222_8226;
	}

	public abstract boolean method5483();

	abstract void method5486();

	final void method5503() {
		this.aMatrix4f_8205.method2142(aMatrix4f_8230);
		this.aMatrix4f_8205.method2144(this.aMatrix4f_8246);
		this.aMatrix4f_8205.method2157(this.aFloatArrayArray8252[0]);
		this.aMatrix4f_8205.method2158(this.aFloatArrayArray8252[1]);
		this.aMatrix4f_8205.method2156(this.aFloatArrayArray8252[2]);
		this.aMatrix4f_8205.method2170(this.aFloatArrayArray8252[3]);
		this.aMatrix4f_8205.method2171(this.aFloatArrayArray8252[4]);
		this.aMatrix4f_8205.method2163(this.aFloatArrayArray8252[5]);
		aMatrix4f_8251.method2142(this.aMatrix4f_8205);
		method5335(aMatrix4f_8251);
	}

	public final void method5057(int i, Class78 class78) {
		this.anInt8328 = i;
		this.aClass78_8213 = class78;
		this.aBoolean8326 = true;
	}

	public final void DA(int i, ToolkitLoader toolkitLoader, int i_625_, int i_626_) {
		RA(false);
		this.aClass57_Sub2_8280.method644(0.0F, 0.0F, (float) getFrameContext().getWidth(), 0.0F, 0.0F, (float) getFrameContext().getHeight(), 0, toolkitLoader, i_625_, i_626_);
		RA(true);
	}

	public final void a(EnvironmentMap class66) {
		this.aClass66_Sub2_8284 = (Class66_Sub2) class66;
	}

	public final ModelToolkit creatModelToolkit(BaseModel class64, int i, int i_639_, int i_640_, int i_641_) {
		return new JavaGraphicsModelTookit(this, class64, i, i_640_, i_641_, i_639_);
	}

	public final NativeHeapBuffer method5517(int i, boolean bool) {
		return this.aNativeHeap8221.f(i, bool);
	}

}
