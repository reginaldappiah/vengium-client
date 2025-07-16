package com.jagex;/* h - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.maths.Matrix43f;
import com.jagex.maths.Matrix4f;

public class h extends ModelToolkit implements Interface25 {
	long nativeid;
	SSEGraphicsToolkit aSSEGraphicsToolkit6674;
	ba aBa6675;
	EffectiveVertex[] aEffectiveVertexArray6676;
	EmissiveTriangle[] aEmissiveTriangleArray6677;

    h(SSEGraphicsToolkit var_SSEGraphicsToolkit) {
		this.aSSEGraphicsToolkit6674 = var_SSEGraphicsToolkit;
		this.aBa6675 = null;
		ba(var_SSEGraphicsToolkit);
	}

    native void ba(SSEGraphicsToolkit var_SSEGraphicsToolkit);

	public native void ma(boolean bool);

	public void method4463(Matrix43f viewingAngles) {
		method4852(SSEGraphicsToolkit.anIntArray6681, viewingAngles);
		int i = 0;
		if (this.aEmissiveTriangleArray6677 != null) {
			for (int i_0_ = 0; i_0_ < this.aEmissiveTriangleArray6677.length; i_0_++) {
				EmissiveTriangle emissiveTriangle = this.aEmissiveTriangleArray6677[i_0_];
				emissiveTriangle.anInt777 = SSEGraphicsToolkit.anIntArray6681[i++] * -1879868075;
				emissiveTriangle.anInt783 = SSEGraphicsToolkit.anIntArray6681[i++] * -2041556771;
				emissiveTriangle.anInt779 = SSEGraphicsToolkit.anIntArray6681[i++] * -1434499227;
				emissiveTriangle.anInt772 = SSEGraphicsToolkit.anIntArray6681[i++] * 1070341177;
				emissiveTriangle.anInt781 = SSEGraphicsToolkit.anIntArray6681[i++] * 1802851857;
				emissiveTriangle.anInt782 = SSEGraphicsToolkit.anIntArray6681[i++] * 103846281;
				emissiveTriangle.anInt771 = SSEGraphicsToolkit.anIntArray6681[i++] * -2103324039;
				emissiveTriangle.anInt784 = SSEGraphicsToolkit.anIntArray6681[i++] * -526039059;
				emissiveTriangle.anInt785 = SSEGraphicsToolkit.anIntArray6681[i++] * 491030489;
			}
		}
		if (this.aEffectiveVertexArray6676 != null) {
			for (int i_1_ = 0; i_1_ < this.aEffectiveVertexArray6676.length; i_1_++) {
				EffectiveVertex effectiveVertex = this.aEffectiveVertexArray6676[i_1_];
				EffectiveVertex effectiveVertex_2_ = effectiveVertex;
				if (effectiveVertex.aEffectiveVertex_672 != null)
					effectiveVertex_2_ = effectiveVertex.aEffectiveVertex_672;
				if (effectiveVertex.aMatrix4f_677 == null)
					effectiveVertex.aMatrix4f_677 = new Matrix4f();
				effectiveVertex.aMatrix4f_677.method2145(viewingAngles);
				effectiveVertex_2_.anInt671 = SSEGraphicsToolkit.anIntArray6681[i++] * -1436341053;
				effectiveVertex_2_.anInt675 = SSEGraphicsToolkit.anIntArray6681[i++] * 449866009;
				effectiveVertex_2_.anInt676 = SSEGraphicsToolkit.anIntArray6681[i++] * 1336328763;
			}
		}
	}

	void method4852(int[] is, Matrix43f class222) {
		this.aSSEGraphicsToolkit6674.method5571().method280(this, is, class222);
	}

	public ModelToolkit method4755(byte i, int i_3_, boolean bool) {
		return this.aSSEGraphicsToolkit6674.method5571().method276(this, i, i_3_, bool);
	}

	native void BA(h var_h_4_, h var_h_5_, int i, boolean bool, boolean bool_6_);

	public void method4784() {
		/* empty */
	}

	public native int m();

	public void method4745(ModelToolkit modelToolkit, int i, int i_7_, int i_8_, boolean bool) {
		this.aSSEGraphicsToolkit6674.method5571().method285(this, modelToolkit, i, i_7_, i_8_, bool);
	}

	public native void f(int i);

	public native void S(int i);

	public native void t(int i);

	public native void EA(int i);

	public native void ia(int i, int i_9_, int i_10_);

	public native void wa();

    public native void pa(int i, int i_11_, FloorToolkit class_xa, FloorToolkit class_xa_12_, int i_13_, int i_14_, int i_15_);

	public native int ya();

	public native int o();

	native boolean ea();

	final void method4738(int transformationType, int[] is, int i_16_, int i_17_, int i_18_, int i_19_, boolean bool) {
		J(this.nativeid, transformationType, is, i_16_, i_17_, i_18_, i_19_, bool);
	}

    native void e(int transformationType, int[] is, int i_20_, int i_21_, int i_22_, boolean bool, int i_23_, int[] is_24_);

    public void method4741(Matrix43f class222, int i, boolean bool) {
		Matrix4f matrix4f = this.aSSEGraphicsToolkit6674.method5571().aMatrix4f_6673;
		matrix4f.method2145(class222);
		aa(matrix4f.aFloatArray2594, i, bool);
	}

	native void aa(float[] fs, int i, boolean bool);

	native void fq(long l, int i, int[] is, int i_32_, int i_33_, int i_34_, int i_35_, boolean bool);

	public boolean method4787(int i, int i_36_, Matrix43f class222, boolean bool, int i_37_) {
		return this.aSSEGraphicsToolkit6674.method5571().method284(this, i, i_36_, class222, bool);
	}

    public native int N();

	public native int n();

    public native int YA();

    public native int ha();

	public native void p(int i);

	public native void Q(int i);

	public native int c();

	native void ka();

	public native byte[] ah();

	public native void X(short i, short i_43_);

	native void fp(h var_h_44_, h var_h_45_, int i, boolean bool, boolean bool_46_);

	native void IA(byte i, byte[] is);

    public native void PA(int i, int i_47_, int i_48_, int i_49_);

	public boolean method4743() {
		return true;
	}

    void method4734() {
		if (this.aSSEGraphicsToolkit6674.anInt6692 > 1) {
			synchronized (this) {
				aBoolean4148 = false;
				this.notifyAll();
			}
		}
	}

	public EmissiveTriangle[] method4464() {
		return this.aEmissiveTriangleArray6677;
	}

	public EffectiveVertex[] method4445() {
		return this.aEffectiveVertexArray6676;
	}

    native void U(SSEGraphicsToolkit var_SSEGraphicsToolkit, ba var_ba, int i, int i_52_, int[] is, int[] is_53_, int[] is_54_, int[] is_55_, short[] is_56_, int i_57_, short[] is_58_, short[] is_59_, short[] is_60_, byte[] is_61_, byte[] is_62_, byte[] is_63_, byte[] is_64_, short[] is_65_, short[] is_66_, int[] is_67_, byte i_68_, short[] is_69_, int i_70_, byte[] is_71_, short[] is_72_, short[] is_73_, short[] is_74_, int[] is_75_, int[] is_76_, int[] is_77_, byte[] is_78_, byte[] is_79_, int[] is_80_, int[] is_81_, int[] is_82_, int[] is_83_, int i_84_, int i_85_, int i_86_, int i_87_, int i_88_, int i_89_, int[] is_90_);

    public native boolean i();

    public native void W(short i, short i_99_);

    public native int RA();

    public void render(Matrix43f class222, Class302_Sub1 class302_sub1, int i) {
		if (class302_sub1 == null)
			this.aSSEGraphicsToolkit6674.method5571().method279(this, class222, null, i);
		else {
			SSEGraphicsToolkit.anIntArray6704[5] = 0;
			this.aSSEGraphicsToolkit6674.method5571().method279(this, class222, SSEGraphicsToolkit.anIntArray6704, i);
			class302_sub1.anInt7641 = SSEGraphicsToolkit.anIntArray6704[0];
			class302_sub1.anInt7642 = SSEGraphicsToolkit.anIntArray6704[1];
			class302_sub1.anInt7643 = SSEGraphicsToolkit.anIntArray6704[2];
			class302_sub1.anInt7640 = SSEGraphicsToolkit.anIntArray6704[3];
			class302_sub1.anInt7645 = SSEGraphicsToolkit.anIntArray6704[4];
			class302_sub1.aBoolean7644 = SSEGraphicsToolkit.anIntArray6704[5] != 0;
		}
	}

    native void fe(SSEGraphicsToolkit var_SSEGraphicsToolkit);

    native void gc(float[] fs, int i, boolean bool);

    native void J(long l, int i, int[] is, int i_128_, int i_129_, int i_130_, int i_131_, boolean bool);

    native void gn(byte i, byte[] is);

	h(SSEGraphicsToolkit var_SSEGraphicsToolkit, ba var_ba, BaseModel class64, int i, int i_135_, int i_136_, int i_137_) {
		this.aSSEGraphicsToolkit6674 = var_SSEGraphicsToolkit;
		this.aBa6675 = var_ba;
		this.aEmissiveTriangleArray6677 = class64.aEmissiveTriangleArray647;
		this.aEffectiveVertexArray6676 = class64.aEffectiveVertexArray613;
		int i_138_ = (class64.aEmissiveTriangleArray647 == null ? 0 : class64.aEmissiveTriangleArray647.length);
		int i_139_ = (class64.aEffectiveVertexArray613 == null ? 0 : class64.aEffectiveVertexArray613.length);
		int i_140_ = 0;
		int[] is = new int[i_138_ * 3 + i_139_];
		for (int i_141_ = 0; i_141_ < i_138_; i_141_++) {
			is[i_140_++] = this.aEmissiveTriangleArray6677[i_141_].anInt773 * -710317103;
			is[i_140_++] = this.aEmissiveTriangleArray6677[i_141_].anInt774 * 1705862021;
			is[i_140_++] = this.aEmissiveTriangleArray6677[i_141_].anInt775 * 1636170731;
		}
		for (int i_142_ = 0; i_142_ < i_139_; i_142_++)
			is[i_140_++] = this.aEffectiveVertexArray6676[i_142_].anInt674 * -180596249;
		int i_143_ = (class64.billboardConfigs == null ? 0 : class64.billboardConfigs.length);
		int[] is_144_ = new int[i_143_ * 8];
		int i_145_ = 0;
		for (int i_146_ = 0; i_146_ < i_143_; i_146_++) {
			BillboardConfig billboardConfig = class64.billboardConfigs[i_146_];
			Class173 class173 = BillboardConfig.method2844(billboardConfig.type * 1834782277);
			is_144_[i_145_++] = billboardConfig.face * 1512514121;
			is_144_[i_145_++] = class173.anInt1755 * 1951943953;
			is_144_[i_145_++] = class173.anInt1753 * 893949695;
			is_144_[i_145_++] = class173.anInt1751 * 39181267;
			is_144_[i_145_++] = class173.anInt1752 * -310074719;
			is_144_[i_145_++] = class173.anInt1754 * 1092922159;
			is_144_[i_145_++] = class173.aBoolean1757 ? -1 : 0;
		}
		for (int i_147_ = 0; i_147_ < i_143_; i_147_++) {
			BillboardConfig billboardConfig = class64.billboardConfigs[i_147_];
			is_144_[i_145_++] = billboardConfig.priority * -1606786303;
		}
		U(this.aSSEGraphicsToolkit6674, this.aBa6675, class64.anInt614, class64.anInt626, class64.anIntArray616, class64.anIntArray642, class64.anIntArray618, class64.anIntArray619, class64.aShortArray620, class64.anInt621, class64.aShortArray644, class64.aShortArray646, class64.aShortArray624, class64.aByteArray625, class64.aByteArray633, class64.aByteArray627, class64.aByteArray635, class64.aShortArray629, class64.aShortArray617, class64.anIntArray631, class64.aByte632, class64.aShortArray615, class64.anInt634, class64.aByteArray622, class64.aShortArray623, class64.aShortArray636, class64.aShortArray638, class64.anIntArray639, class64.anIntArray640, class64.anIntArray641, class64.aByteArray645, class64.aByteArray628, class64.anIntArray637, class64.anIntArray643, class64.anIntArray648, is, i_138_, i_139_, i, i_135_, i_136_, i_137_, is_144_);
	}

    public native void KA(int animationFlag);

    native void animate(int transformType, int transformX, int transformY, int transformZ);

    native void fk(SSEGraphicsToolkit var_SSEGraphicsToolkit);

    native void fx(long l, int i, int[] is, int i_157_, int i_158_, int i_159_, int i_160_, boolean bool);

    public native void oa(int i, int i_161_, int i_162_);

    public void method4742(byte i, byte[] is) {
		IA(i, is);
	}

    public native Class_na ga(Class_na class_na);

	void method4733() {
		if (this.aSSEGraphicsToolkit6674.anInt6692 > 1) {
			synchronized (this) {
				while (aBoolean4148) {
					try {
						this.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
				aBoolean4148 = true;
			}
		}
	}

    public native int AA();

    native void fc(SSEGraphicsToolkit var_SSEGraphicsToolkit, ba var_ba, int i, int i_189_, int[] is, int[] is_190_, int[] is_191_, int[] is_192_, short[] is_193_, int i_194_, short[] is_195_, short[] is_196_, short[] is_197_, byte[] is_198_, byte[] is_199_, byte[] is_200_, byte[] is_201_, short[] is_202_, short[] is_203_, int[] is_204_, byte i_205_, short[] is_206_, int i_207_, byte[] is_208_, short[] is_209_, short[] is_210_, short[] is_211_, int[] is_212_, int[] is_213_, int[] is_214_, byte[] is_215_, byte[] is_216_, int[] is_217_, int[] is_218_, int[] is_219_, int[] is_220_, int i_221_, int i_222_, int i_223_, int i_224_, int i_225_, int i_226_, int[] is_227_);

	native void fw(SSEGraphicsToolkit var_SSEGraphicsToolkit);

	public native void z(boolean bool);

	public native boolean u();

    public native int Z();

    native void gt(float[] fs, int i, boolean bool);

    native void gl(float[] fs, int i, boolean bool);

	native void gq(float[] fs, int i, boolean bool);

	native void gp(byte i, byte[] is);

    native void ge(byte i, byte[] is);
}
