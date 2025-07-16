package com.jagex;/* ja - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.prefetch.JS5PrefetchType;
import com.jagex.maths.Matrix43f;
import com.jagex.maths.Matrix4f;

import java.awt.*;

public class SSEGraphicsToolkit extends GraphicsToolkit implements Interface25 {
	Class453 aClass453_6680;
	static int[] anIntArray6681;
	ba aBa6682;
	Matrix4f aMatrix4f_6683;
	boolean aBoolean6684 = false;
	int anInt6685;
	Matrix4f aMatrix4f_6686;
	float aFloat6687;
	Matrix43f aClass222_6688;
	Matrix4f aMatrix4f_6689;
	Matrix4f aMatrix4f_6690;
	float aFloat6691;
	int anInt6692;
	static int[] anIntArray6693 = new int[Math.max(Math.max(104, 20), 24573)];
	float aFloat6694;
	float aFloat6695;
	Matrix43f aClass222_6696;
	a[] anAArray6697;
	long nativeid = 0L;
	static float[] aFloatArray6703 = new float[20];
	static int[] anIntArray6704 = new int[6];
	static int[] anIntArray6705 = anIntArray6693;
	static float[] aFloatArray6706 = aFloatArray6703;
	static int[] anIntArray6707;
	static int[] anIntArray6708;
	int anInt6709;
	static int[] anIntArray6710;
	static short[] aShortArray6711;
	static byte[] aByteArray6712;
	boolean aBoolean6713;

    public static GraphicsToolkit create(Canvas canvas, MaterialRawLoader materialRawLoader, int width, int height) {
        return new SSEGraphicsToolkit(canvas, materialRawLoader, width, height);
    }

    native void Q(int i, int[] is, float[] fs);

	native void q(MaterialRawLoader interface_ma, int i, int i_0_);

	native void oo(float[] fs);

	native void R(int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, ToolkitLoader toolkitLoader, int i_6_, int i_7_);

	native void da();

	native void Y(int i);

	native void n(Heap class_v);

	public native void ea(int i, int i_8_, int i_9_, int i_10_);

	protected void finalize() {
		destroy();
		if (this.nativeid != 0L)
			Class71.method809(this, (short) 18758);
	}

	void method5568(Class69 class69, boolean bool) {
		int i = 0;
		int i_24_ = 0;
		int i_25_ = 0;
		int i_26_ = 0;
		int i_27_ = 0;
		for (Class302_Sub3_Sub1 class302_sub3_sub1 = ((Class302_Sub3_Sub1) class69.aClass448_680.method5911(-1980678448)); class302_sub3_sub1 != null; class302_sub3_sub1 = ((Class302_Sub3_Sub1) class69.aClass448_680.method5909(-1594607978))) {
			anIntArray6708[i++] = class302_sub3_sub1.anInt9785;
			anIntArray6708[i++] = class302_sub3_sub1.anInt9789;
			anIntArray6708[i++] = class302_sub3_sub1.anInt9790;
			anIntArray6707[i_24_++] = class302_sub3_sub1.anInt9792;
			aShortArray6711[i_26_++] = (short) class302_sub3_sub1.anInt9794;
			anIntArray6710[i_25_++] = class302_sub3_sub1.anInt9791;
			if (bool)
				aByteArray6712[i_27_++] = class302_sub3_sub1.aByte9793;
		}
	}

	public ToolkitDesciption getDescription() {
		return new ToolkitDesciption(ToolkitDesciption.SSE, "SSE", 1, "CPU", 0L);
	}

	public void resetClip() {
		this.aFloat6695 = (float) getFrameContext().getWidth() / 2.0F;
		this.aFloat6694 = (float) getFrameContext().getHeight() / 2.0F;
		this.aFloat6687 = this.aFloat6695;
		this.aFloat6691 = this.aFloat6694;
		k();
	}

	public void method5075() {
		/* empty */
	}

	void method5023() {
		if (!this.aBoolean6684) {
			this.anAArray6697 = null;
			this.aBa6682 = null;
			this.aMatrix4f_6686 = null;
			for (ba var_ba = (ba) this.aClass453_6680.method5939(); var_ba != null; var_ba = (ba) this.aClass453_6680.method5944())
				var_ba.ha();
			this.aClass453_6680.clean();
			da();
			if (this.aBoolean6713) {
				StaticMethods.method2000(false, true);
				this.aBoolean6713 = false;
			}
			h();
			Class71.method812(-1408959178);
			this.aBoolean6684 = true;
		}
	}

	public void clean(int i) {
		Class71.method810((byte) 3);
		Y(i);
		for (ba var_ba = (ba) this.aClass453_6680.method5939(); var_ba != null; var_ba = (ba) this.aClass453_6680.method5944())
			var_ba.u();
	}

	public boolean method5001() {
		return true;
	}

	public native void z(boolean bool);

	native void nf(short i, short i_33_, int i_34_, byte i_35_, byte i_36_, int i_37_, boolean bool, byte i_38_, byte i_39_, byte i_40_, byte i_41_, boolean bool_42_, boolean bool_43_, boolean bool_44_, boolean bool_45_, boolean bool_46_, byte i_47_, boolean bool_48_, boolean bool_49_, int i_50_);

	public boolean hasBloomToolkits() {
		return false;
	}

	public boolean method4996() {
		return false;
	}

	public boolean method5082() {
		return true;
	}

	public boolean isMultisampled() {
		return false;
	}

	native void ns();

	native void fm(int i, int i_51_, int i_52_, int i_53_, int i_54_);

	public boolean method5051() {
		return true;
	}

	public native void G(int i, int i_55_, int i_56_, int i_57_, int i_58_);

	public boolean method5159() {
		return true;
	}

	public native int[] aq(int i, int i_59_, int i_60_, int i_61_);

	public native void gv(int i, ToolkitLoader toolkitLoader, int i_62_, int i_63_);

	public native void L();

	native void d(long l, long l_64_);

	native void k();

	public void method5187(int i, int i_67_, int i_68_, int i_69_) {
		this.aFloat6695 = (float) i_68_ / 2.0F;
		this.aFloat6694 = (float) i_69_ / 2.0F;
		this.aFloat6687 = (float) i + this.aFloat6695;
		this.aFloat6691 = (float) i_67_ + this.aFloat6694;
		A(i, i_67_, i_68_, i_69_);
	}

	public native void fl(int i, int i_70_, int i_71_, int i_72_, int i_73_);

	public native void GA(float f, float f_74_);

	public native int du();

	public native void constrainClip(int x, int y, int width, int height);

	public native void qa(int[] is);

	public native void clear(int i, int i_80_);

	public native void drawFilledRectangle(int startX, int startY, int endX, int endY, int rgba, int mode);

	public native void N(int i, int i_86_, int i_87_, int i_88_, int i_89_, int i_90_, byte[] is, int i_91_, int i_92_);

	public void method5020(int i, int i_93_, float f, int i_94_, int i_95_, float f_96_, int i_97_, int i_98_, float f_99_, int i_100_, int i_101_, int i_102_, int i_103_) {
		throw new IllegalStateException();
	}

	public native void XA(int i, int i_104_, int i_105_, int i_106_, int i_107_);

	native void op(float[] fs);

	public void drawDiagonalLine(int startX, int startY, int endX, int endY, int rgba, int mode) {
		YA(startX, startY, endX, endY, rgba, mode);
	}

	public void method5022(int i, int i_113_, int i_114_, int i_115_, int i_116_, int i_117_, ToolkitLoader toolkitLoader, int i_118_, int i_119_) {
		R(i, i_113_, i_114_, i_115_, i_116_, i_117_, toolkitLoader, i_118_, i_119_);
	}

	native void CA(int i, int i_120_, int i_121_, int i_122_, int i_123_);

	public void method5007(int i, int i_124_, int i_125_, int i_126_, int i_127_, int i_128_, ToolkitLoader toolkitLoader, int i_129_, int i_130_, int i_131_, int i_132_, int i_133_) {
		/* empty */
	}

	public void drawDashedLine(int i, int i_134_, int i_135_, int i_136_, int i_137_, int i_138_, int i_139_, int i_140_, int i_141_) {
		/* empty */
	}

	public FontToolkit createFontToolkit(RSFontMetrics class505, Sprite[] sprites, boolean loaded) {
		int[] is = new int[sprites.length];
		int[] is_142_ = new int[sprites.length];
		boolean bool_143_ = false;
		for (int i = 0; i < sprites.length; i++) {
			is[i] = sprites[i].width;
			is_142_[i] = sprites[i].height;
			if (sprites[i].alpha != null)
				bool_143_ = true;
		}
		if (loaded) {
			if (bool_143_)
				return new ea(this, this.aBa6682, class505, sprites, null);
			return new m(this, this.aBa6682, class505, sprites, null);
		}
		if (bool_143_)
			throw new IllegalArgumentException("");
		return new ia(this, this.aBa6682, class505, sprites, null);
	}

	public void dr(float f, float f_144_, float f_145_, float[] fs) {
		float f_146_ = (this.aMatrix4f_6683.aFloatArray2594[14] + this.aMatrix4f_6683.aFloatArray2594[2] * f + this.aMatrix4f_6683.aFloatArray2594[6] * f_144_ + this.aMatrix4f_6683.aFloatArray2594[10] * f_145_);
		float f_147_ = (this.aMatrix4f_6683.aFloatArray2594[15] + this.aMatrix4f_6683.aFloatArray2594[3] * f + this.aMatrix4f_6683.aFloatArray2594[7] * f_144_ + this.aMatrix4f_6683.aFloatArray2594[11] * f_145_);
		if (f_146_ < -f_147_ || f_146_ > f_147_) {
			float[] fs_148_ = fs;
			float[] fs_149_ = fs;
			fs[2] = Float.NaN;
			fs_149_[1] = Float.NaN;
			fs_148_[0] = Float.NaN;
		} else {
			float f_150_ = (this.aMatrix4f_6683.aFloatArray2594[12] + this.aMatrix4f_6683.aFloatArray2594[0] * f + this.aMatrix4f_6683.aFloatArray2594[4] * f_144_ + this.aMatrix4f_6683.aFloatArray2594[8] * f_145_);
			if (f_150_ < -f_147_ || f_150_ > f_147_) {
				float[] fs_151_ = fs;
				float[] fs_152_ = fs;
				fs[2] = Float.NaN;
				fs_152_[1] = Float.NaN;
				fs_151_[0] = Float.NaN;
			} else {
				float f_153_ = (this.aMatrix4f_6683.aFloatArray2594[13] + this.aMatrix4f_6683.aFloatArray2594[1] * f + this.aMatrix4f_6683.aFloatArray2594[5] * f_144_ + (this.aMatrix4f_6683.aFloatArray2594[9] * f_145_));
				if (f_153_ < -f_147_ || f_153_ > f_147_) {
					float[] fs_154_ = fs;
					float[] fs_155_ = fs;
					fs[2] = Float.NaN;
					fs_155_[1] = Float.NaN;
					fs_154_[0] = Float.NaN;
				} else {
					float f_156_ = (this.aMatrix4f_6689.aFloatArray2594[14] + this.aMatrix4f_6689.aFloatArray2594[2] * f + (this.aMatrix4f_6689.aFloatArray2594[6] * f_144_) + (this.aMatrix4f_6689.aFloatArray2594[10] * f_145_));
					fs[0] = (this.aFloat6687 + this.aFloat6695 * f_150_ / f_147_);
					fs[1] = (this.aFloat6691 + this.aFloat6694 * f_153_ / f_147_);
					fs[2] = f_156_;
				}
			}
		}
	}

	public Heap createNativeHeap(int i) {
		ba var_ba = new ba(this, i);
		this.aClass453_6680.pushBack(var_ba);
		return var_ba;
	}

	public void setBufferHeap(Heap class_v) {
		this.aBa6682 = (ba) class_v;
		n(class_v);
	}

	public SpriteToolkit method5029(int i, int i_157_, boolean bool, boolean bool_158_) {
		return new fa(this, i, i_157_, bool_158_);
	}

	public SpriteToolkit bu(int[] is, int i, int i_159_, int i_160_, int i_161_, boolean bool) {
		return new fa(this, is, i, i_159_, i_160_, i_161_, false);
	}

	public SpriteToolkit createSpriteToolkit(Sprite sprite, boolean loaded) {
		fa var_fa = new fa(this, sprite.palette, sprite.raster, sprite.alpha, 0, sprite.width, sprite.width, sprite.height);
		var_fa.method621(sprite.offsetX, sprite.offsetY, sprite.deltaWidth, sprite.deltaHeight);
		return var_fa;
	}

	public SpriteToolkit method5033(int i, int i_162_, int i_163_, int i_164_, boolean bool) {
		return new fa(this, i, i_162_, i_163_, i_164_, !bool);
	}

	native void V(short i, short i_165_, int i_166_, byte i_167_, byte i_168_, int i_169_, boolean bool, byte i_170_, byte i_171_, byte i_172_, byte i_173_, boolean bool_174_, boolean bool_175_, boolean bool_176_, boolean bool_177_, boolean bool_178_, byte i_179_, boolean bool_180_, boolean bool_181_, int i_182_);

	public native void DA(int i, ToolkitLoader toolkitLoader, int i_183_, int i_184_);

	public native void ej(int i, int i_185_, int i_186_, int i_187_);

	public ModelToolkit creatModelToolkit(BaseModel class64, int i, int i_194_, int i_195_, int i_196_) {
		return new h(this, this.aBa6682, class64, i, i_194_, i_195_, i_196_);
	}

	public int method5017(int i, int i_197_) {
		int i_198_ = i & 0xfffff;
		int i_199_ = i_197_ & 0xfffff;
		return i_198_ & i_199_ ^ i_199_;
	}

	public int method5004(int i, int i_200_) {
		return i | i_200_;
	}

	public native void gg(int i, ToolkitLoader toolkitLoader, int i_201_, int i_202_);

	public Matrix4f cz() {
		return this.aMatrix4f_6686;
	}

	public Matrix43f getTransformationMatrix() {
		return this.aClass222_6696;
	}

	void method5569(int i) {
		this.anInt6692 = i;
		this.anAArray6697 = new a[this.anInt6692];
		for (int i_203_ = 0; i_203_ < this.anInt6692; i_203_++)
			this.anAArray6697[i_203_] = new a(this, this.anInt6709, this.anInt6685);
	}

	void method5570(int i) {
		this.anAArray6697[i].method283();
	}

	a method5571() {
		for (int i = 0; i < this.anInt6692; i++) {
			if (this.anAArray6697[i].aRunnable6669 == Thread.currentThread())
				return this.anAArray6697[i];
		}
		return null;
	}

	public void renderParticles(Class69 class69) {
		if (class69.aClass448_680.method5910((short) -13342) != 0) {
			method5568(class69, false);
			method5571().method278(this, anIntArray6708, anIntArray6707, anIntArray6710, aShortArray6711, class69.aClass448_680.method5910((short) -17134));
		}
	}

	public void cw(Matrix43f class222) {
		this.aClass222_6688 = class222;
		this.aMatrix4f_6689.method2145(class222);
		AA(this.aMatrix4f_6689.aFloatArray2594);
		this.aMatrix4f_6683.method2143(this.aMatrix4f_6689, this.aMatrix4f_6690);
	}

	public Matrix43f method5044() {
		return this.aClass222_6688;
	}

	public void ci(Matrix4f matrix4f) {
		this.aMatrix4f_6690 = matrix4f;
		wa(this.aMatrix4f_6690.aFloatArray2594);
		this.aMatrix4f_6683.method2143(this.aMatrix4f_6689, this.aMatrix4f_6690);
	}

	native void JA(int i, int i_204_, int i_205_, int i_206_);

	native void nm(long l, long l_207_);

	public native void J(int i);

	public native void drawFog(int color, int intensity, int i_209_);

	public native void RA(boolean bool);

	public void setLights(int i, Light[] class298_sub10s) {
		int i_210_ = 0;
		for (int i_211_ = 0; i_211_ < i; i_211_++) {
			anIntArray6705[i_210_++] = class298_sub10s[i_211_].method2895(823958259);
			anIntArray6705[i_210_++] = class298_sub10s[i_211_].method2894(-2035778581);
			anIntArray6705[i_210_++] = class298_sub10s[i_211_].method2897((byte) 52);
			anIntArray6705[i_210_++] = class298_sub10s[i_211_].method2900(34190041);
			aFloatArray6706[i_211_] = class298_sub10s[i_211_].method2901(608404512);
			anIntArray6705[i_210_++] = class298_sub10s[i_211_].method2898(-1429005837);
		}
		Q(i, anIntArray6705, aFloatArray6706);
	}

	native void mt(MaterialRawLoader interface_ma, int i, int i_212_);

	public EnvironmentMap createEnvironmentMap(int i, int i_213_, int i_214_, int i_215_, int i_216_, int i_217_) {
		return null;
	}

	public EnvironmentMap method5179(EnvironmentMap class66, EnvironmentMap class66_218_, float f, EnvironmentMap class66_219_) {
		return null;
	}

	public void a(EnvironmentMap class66) {
		/* empty */
	}

	void renderFrame(int i, int i_221_) throws GraphicsFrameException {
		za var_za = (za) getRenderContext();
		if (var_za == null)
			throw new IllegalStateException();
		var_za.method581(i, i_221_);
		if (textures != null)
			textures.method176(1305525906);
	}

	public boolean isResizable() {
		return true;
	}

	public void bloomSmn() {
		/* empty */
	}

	public boolean method5054() {
		return false;
	}

	public void method5176() {
		/* empty */
	}

	public Matrix4f method5045() {
		return this.aMatrix4f_6690;
	}

	public final void method5057(int i, Class78 class78) {
		M(i, class78.anInt726 * -1212608691, class78.anInt725 * 1996750669, class78.anInt727 * -1475891183);
	}

	native void M(int i, int i_228_, int i_229_, int i_230_);

	public FrameBufferContext method5094() {
		return new Class52_Sub1_Sub4(this);
	}

	public Interface8_Impl1_Impl2 method5186(int i, int i_231_) {
		return new oa(i, i_231_);
	}

	static {
		anIntArray6681 = anIntArray6693;
		anIntArray6708 = anIntArray6693;
		anIntArray6707 = new int[8191];
		anIntArray6710 = new int[8191];
		aShortArray6711 = new short[8191];
		aByteArray6712 = new byte[8191];
	}

	public native void es(int[] is);

	public native void fu(int i, int i_232_, int i_233_, int i_234_, int i_235_);

	public native int za();

	public native void fh(int i, int i_237_);

	public native int dm();

	public SSEGraphicsToolkit(Canvas canvas, MaterialRawLoader interface_ma, int i, int i_238_) {
		super(interface_ma);
		this.aClass453_6680 = new Class453();
		this.anInt6709 = 4096;
		this.anInt6685 = 4096;
		this.aBoolean6713 = false;
		try {
			if (!JS5PrefetchType.getPrefetch().load("sw3d"))
				throw new RuntimeException("");
			Class71.method811(-1686477693);
			q(textures, textures.method177(452373566), 0);
			Class374_Sub1.method4640(false, true, -162450455);
			this.aBoolean6713 = true;
			this.aMatrix4f_6686 = new Matrix4f();
			new Vector3f();
			this.aClass222_6696 = new Matrix43f();
			new Quaternion();
			this.aMatrix4f_6689 = new Matrix4f();
			this.aMatrix4f_6690 = new Matrix4f();
			this.aMatrix4f_6683 = new Matrix4f();
			cw(new Matrix43f());
			ci(new Matrix4f());
			method5569(1);
			method5570(0);
			if (canvas != null) {
				attach(canvas, i, i_238_);
				method5003(canvas);
			}
			int i_239_ = textures.method177(468739561);
			for (short i_240_ = 0; i_240_ < i_239_; i_240_++) {
				Class53 class53 = textures.method174(i_240_);
				if (class53 != null)
					V(i_240_, class53.aShort532, class53.anInt528 * -2138060883, class53.aByte529, class53.aByte536, class53.anInt531 * 1616831825, class53.aBoolean518, class53.aByte533, class53.aByte534, class53.aByte535, class53.aByte509, class53.aBoolean524, class53.aBoolean538, class53.aBoolean527, class53.aBoolean540, class53.aBoolean541, class53.aByte537, class53.aBoolean543, class53.aBoolean544, class53.anInt519 * -490972023);
			}
		} catch (Throwable throwable) {
			destroy();
			throw new RuntimeException();
		}
	}

	public native void ed(int i, int i_241_, int i_242_, int i_243_);

	native void mu(int i, int i_244_, int i_245_, int i_246_, int i_247_, int i_248_);

	public native void fa(int i, int i_249_, int i_250_, int i_251_, int i_252_, int i_253_);

	public int method5048() {
		return 4;
	}

	public native int[] ev(int i, int i_255_, int i_256_, int i_257_);

	public native int[] eg(int i, int i_258_, int i_259_, int i_260_);

	public native void hb(int i);

	public native void em(boolean bool);

	public native void ec(boolean bool);

	public native void ey(float f, float f_261_);

	public native void ez(float f, float f_262_);

	public native void el(float f, float f_263_);

	public void method_do(float f, float f_264_, float f_265_, float[] fs) {
		float f_266_ = (this.aMatrix4f_6683.aFloatArray2594[15] + this.aMatrix4f_6683.aFloatArray2594[3] * f + this.aMatrix4f_6683.aFloatArray2594[7] * f_264_ + this.aMatrix4f_6683.aFloatArray2594[11] * f_265_);
		float f_267_ = (this.aMatrix4f_6683.aFloatArray2594[12] + this.aMatrix4f_6683.aFloatArray2594[0] * f + this.aMatrix4f_6683.aFloatArray2594[4] * f_264_ + this.aMatrix4f_6683.aFloatArray2594[8] * f_265_);
		float f_268_ = (this.aMatrix4f_6683.aFloatArray2594[13] + this.aMatrix4f_6683.aFloatArray2594[1] * f + this.aMatrix4f_6683.aFloatArray2594[5] * f_264_ + this.aMatrix4f_6683.aFloatArray2594[9] * f_265_);
		float f_269_ = (this.aMatrix4f_6689.aFloatArray2594[14] + this.aMatrix4f_6689.aFloatArray2594[2] * f + this.aMatrix4f_6689.aFloatArray2594[6] * f_264_ + this.aMatrix4f_6689.aFloatArray2594[10] * f_265_);
		fs[0] = (this.aFloat6687 + this.aFloat6695 * f_267_ / f_266_);
		fs[1] = (this.aFloat6691 + this.aFloat6694 * f_268_ / f_266_);
		fs[2] = f_269_;
	}

	public native void ep();

	public native void ei();

	public void method5112() {
		/* empty */
	}

	public native void setClip(int x, int y, int width, int height);

	public native void eh(int i, int i_273_, int i_274_, int i_275_);

	public void drawRectangle(int startX, int startY, int endX, int endY, int rgba, int mode) {
		XA(startX, startY, endX, rgba, mode);
		XA(startX, startY + endY - 1, endX, rgba, mode);
		G(startX, startY + 1, endY - 1, rgba, mode);
		G(startX + endX - 1, startY + 1, endY - 1, rgba, mode);
	}

	public native void eo(int[] is);

	public native void er(int[] is);

	public native void fy(int i, int i_281_);

	public native void fb(int i, int i_282_);

	public native void fn(int i, int i_283_);

	native void A(int i, int i_289_, int i_290_, int i_291_);

	public void method5169(int i) {
		this.anInt6709 = this.anInt6685 = i;
		if (this.anInt6692 > 1)
			throw new IllegalStateException();
		method5569(this.anInt6692);
		method5570(0);
	}

	public native void fi(int i, int i_292_, int i_293_, int i_294_, int i_295_, int i_296_, byte[] is, int i_297_, int i_298_);

	native void fv(int i, int i_299_, int i_300_, int i_301_, int i_302_);

	native void or(float[] fs);

	public native void ff(int i, int i_303_, int i_304_, int i_305_, int i_306_);

	public native void fd(int i, int i_307_, int i_308_, int i_309_, int i_310_);

	public native void ft(int i, int i_311_, int i_312_, int i_313_, int i_314_);

	public void drawThickDiagonalLine(int startX, int startY, int endX, int endY, int rgba, int lineWidth, int mode) {
		method5571().method286(this, startX, startY, endX, endY, rgba, lineWidth, mode);
	}

	public native void eq();

	public native void hg(int i, float f, float f_336_, float f_337_, float f_338_, float f_339_);

	native void AA(float[] fs);

	public void method4787(boolean bool) {
		/* empty */
	}

	public native void fo(int i, int i_383_, int i_384_, int i_385_, int i_386_, int i_387_, byte[] is, int i_388_, int i_389_);

	public boolean method5074() {
		return true;
	}

	public native void updateSun(int i, float f, float f_392_, float f_393_, float f_394_, float f_395_);

	public boolean method5052() {
		return false;
	}

	public void method5056(int i, int i_396_, int i_397_, int i_398_) {
		/* empty */
	}

	native void PA(za var_za);

	native void YA(int i, int i_440_, int i_441_, int i_442_, int i_443_, int i_444_);

	RenderContext createRenderFrameContext(Canvas canvas, int i, int i_445_) {
		return new za(this, canvas, i, i_445_);
	}

	public native void hv(int i, int i_451_, int i_452_);

	public native void hj(int i, int i_453_, int i_454_);

	public native void hn(int i, int i_455_, int i_456_);

	public native void he(int i, int i_457_, int i_458_);

	void h() {
		System.gc();
		System.runFinalization();
		Class71.method810((byte) 3);
	}

	public native void setModelAmbient(float f);

	native void om(float[] fs);

	public int method5025(int i, int i_481_, int i_482_, int i_483_, int i_484_, int i_485_) {
		int i_486_ = 0;
		float f = (this.aMatrix4f_6683.aFloatArray2594[14] + this.aMatrix4f_6683.aFloatArray2594[2] * (float) i + this.aMatrix4f_6683.aFloatArray2594[6] * (float) i_481_ + (this.aMatrix4f_6683.aFloatArray2594[10] * (float) i_482_));
		float f_487_ = (this.aMatrix4f_6683.aFloatArray2594[14] + this.aMatrix4f_6683.aFloatArray2594[2] * (float) i_483_ + this.aMatrix4f_6683.aFloatArray2594[6] * (float) i_484_ + (this.aMatrix4f_6683.aFloatArray2594[10] * (float) i_485_));
		float f_488_ = (this.aMatrix4f_6683.aFloatArray2594[15] + this.aMatrix4f_6683.aFloatArray2594[3] * (float) i + this.aMatrix4f_6683.aFloatArray2594[7] * (float) i_481_ + (this.aMatrix4f_6683.aFloatArray2594[11] * (float) i_482_));
		float f_489_ = (this.aMatrix4f_6683.aFloatArray2594[15] + this.aMatrix4f_6683.aFloatArray2594[3] * (float) i_483_ + this.aMatrix4f_6683.aFloatArray2594[7] * (float) i_484_ + (this.aMatrix4f_6683.aFloatArray2594[11] * (float) i_485_));
		if (f < -f_488_ && f_487_ < -f_489_)
			i_486_ |= 0x10;
		else if (f > f_488_ && f_487_ > f_489_)
			i_486_ |= 0x20;
		float f_490_ = (this.aMatrix4f_6683.aFloatArray2594[12] + this.aMatrix4f_6683.aFloatArray2594[0] * (float) i + this.aMatrix4f_6683.aFloatArray2594[4] * (float) i_481_ + (this.aMatrix4f_6683.aFloatArray2594[8] * (float) i_482_));
		float f_491_ = (this.aMatrix4f_6683.aFloatArray2594[12] + this.aMatrix4f_6683.aFloatArray2594[0] * (float) i_483_ + this.aMatrix4f_6683.aFloatArray2594[4] * (float) i_484_ + (this.aMatrix4f_6683.aFloatArray2594[8] * (float) i_485_));
		if (f_490_ < -f_488_ && f_491_ < -f_489_)
			i_486_ |= 0x1;
		if (f_490_ > f_488_ && f_491_ > f_489_)
			i_486_ |= 0x2;
		float f_492_ = (this.aMatrix4f_6683.aFloatArray2594[13] + this.aMatrix4f_6683.aFloatArray2594[1] * (float) i + this.aMatrix4f_6683.aFloatArray2594[5] * (float) i_481_ + (this.aMatrix4f_6683.aFloatArray2594[9] * (float) i_482_));
		float f_493_ = (this.aMatrix4f_6683.aFloatArray2594[13] + this.aMatrix4f_6683.aFloatArray2594[1] * (float) i_483_ + this.aMatrix4f_6683.aFloatArray2594[5] * (float) i_484_ + (this.aMatrix4f_6683.aFloatArray2594[9] * (float) i_485_));
		if (f_492_ < -f_488_ && f_493_ < -f_489_)
			i_486_ |= 0x4;
		if (f_492_ > f_488_ && f_493_ > f_489_)
			i_486_ |= 0x8;
		return i_486_;
	}

	native void mi(int i, int i_494_, int i_495_, int i_496_, int i_497_, int i_498_, ToolkitLoader toolkitLoader, int i_499_, int i_500_);

	void method5188(float f, float f_501_, float f_502_, float f_503_, float f_504_, float f_505_) {
		/* empty */
	}

	public native void hu(float f);

	public native void iv();

	native void od(int i, int i_539_, int i_540_, int i_541_);

	public native void ih();

	public boolean at() {
		return true;
	}

	public native void O();

	native void ox(int i, int i_579_, int i_580_, int i_581_);

	public native void hs(float f);

	public native void go(int i, ToolkitLoader toolkitLoader, int i_592_, int i_593_);

	native void ms(MaterialRawLoader interface_ma, int i, int i_594_);

	native void mx(MaterialRawLoader interface_ma, int i, int i_595_);

	native void me(int i, int i_596_, int i_597_, int i_598_, int i_599_, int i_600_);

	native void mz(int i, int i_601_, int i_602_, int i_603_, int i_604_, int i_605_, ToolkitLoader toolkitLoader, int i_606_, int i_607_);

	native void mn();

	native void ne();

	native void ng(int i);

	native void nt(Heap class_v);

	native void nl(Heap class_v);

	native void nh(int i, int[] is, float[] fs);

	public void method5061(boolean bool) {
		/* empty */
	}

	native void no(short i, short i_611_, int i_612_, byte i_613_, byte i_614_, int i_615_, boolean bool, byte i_616_, byte i_617_, byte i_618_, byte i_619_, boolean bool_620_, boolean bool_621_, boolean bool_622_, boolean bool_623_, boolean bool_624_, byte i_625_, boolean bool_626_, boolean bool_627_, int i_628_);

	public ToolkitLoader createClippingMask(int i, int i_629_, int[] is, int[] is_630_) {
		return new wa(this, this.aBa6682, i, i_629_, is, is_630_);
	}

	native void ni(short i, short i_631_, int i_632_, byte i_633_, byte i_634_, int i_635_, boolean bool, byte i_636_, byte i_637_, byte i_638_, byte i_639_, boolean bool_640_, boolean bool_641_, boolean bool_642_, boolean bool_643_, boolean bool_644_, byte i_645_, boolean bool_646_, boolean bool_647_, int i_648_);

	native void nu(za var_za);

	native void np(long l, long l_649_);

	native void ny(long l, long l_650_);

	native void mb(int i, int i_651_, int i_652_, int i_653_, int i_654_, int i_655_, ToolkitLoader toolkitLoader, int i_656_, int i_657_);

	native void nj();

	native void nw();

	native void nx(int i, int i_658_, int i_659_, int i_660_);

	native void nk(int i, int i_661_, int i_662_, int i_663_);

	native void nc(int i, int[] is, float[] fs);

	public FloorToolkit createLandScapeRenderer(int i, int i_664_, int[][] is, int[][] is_665_, int i_666_, int i_667_, int i_668_) {
		return new i(this, this.aBa6682, i, i_664_, is, is_665_, i_666_, i_667_, i_668_);
	}

	public final void method5058(int i, Class78 class78) {
		JA(i, class78.anInt726 * -1212608691, class78.anInt725 * 1996750669, class78.anInt727 * -1475891183);
	}

	native void wa(float[] fs);

	native void ou(int i, int i_710_, int i_711_, int i_712_);

	native void oj(int i, int i_713_, int i_714_, int i_715_);

	public native void ma(boolean bool);

	native void oz(int i, int i_716_, int i_717_, int i_718_);
}
