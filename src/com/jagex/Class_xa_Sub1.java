package com.jagex;/* Class_xa_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.maths.Matrix43f;
import com.jagex.maths.Matrix4f;
import jaclib.memory.Stream;

import java.nio.ByteBuffer;

public class Class_xa_Sub1 extends FloorToolkit {
	float aFloat8447;
	static int anInt8448 = 74;
	Interface7_Impl1 anInterface7_Impl1_8449;
	int anInt8450;
	int anInt8451;
	Class169 aClass169_8452;
	static int anInt8453;
	int anInt8454;
	int anInt8455;
	short[][] aShortArrayArray8456;
	float aFloat8457 = 3.4028235E38F;
	int[][][] anIntArrayArrayArray8458;
	Class298_Sub16[][][] aClass298_Sub16ArrayArrayArray8459;
	int[][][] anIntArrayArrayArray8460;
	int[][][] anIntArrayArrayArray8461;
	int[][][] anIntArrayArrayArray8462;
	int anInt8463;
	static int anInt8464 = 1;
	int[][][] anIntArrayArrayArray8465;
	float[][] aFloatArrayArray8466;
	NativeToolkit aClass_ra_Sub3_8467;
	NodeCollection aClass458_8468;
	byte[][] aByteArrayArray8469;
	Interface7_Impl1 anInterface7_Impl1_8470;
	static int[] anIntArray8471;
	Class153 aClass153_8472;
	int anInt8473;
	int anInt8474;
	byte[][] aByteArrayArray8475;
	float[][] aFloatArrayArray8476;
	float[][] aFloatArrayArray8477;
	Node[] aClass298Array8478;
	Class440 aClass440_8479;
	static int[] anIntArray8480 = new int[1];
	static int[] anIntArray8481 = new int[1];
	int anInt8482;
	int[][][] anIntArrayArrayArray8483;

	public void method6335(int i, int i_88_, int[] is, int[] is_89_, int[] is_90_, int[] is_91_, int[] is_92_, int[] is_93_, int[] is_94_, int[] is_95_, Class78 class78, boolean bool) {
		MaterialRawLoader interface_ma = this.aClass_ra_Sub3_8467.textures;
		if (is_91_ != null && this.anIntArrayArrayArray8465 == null)
			this.anIntArrayArrayArray8465 = new int[anInt6287 * -506105871][anInt6286 * -1148794921][];
		if (is_89_ != null && this.anIntArrayArrayArray8460 == null)
			this.anIntArrayArrayArray8460 = new int[anInt6287 * -506105871][anInt6286 * -1148794921][];
		this.anIntArrayArrayArray8462[i][i_88_] = is;
		this.anIntArrayArrayArray8458[i][i_88_] = is_90_;
		this.anIntArrayArrayArray8483[i][i_88_] = is_92_;
		this.anIntArrayArrayArray8461[i][i_88_] = is_93_;
		if (this.anIntArrayArrayArray8465 != null)
			this.anIntArrayArrayArray8465[i][i_88_] = is_91_;
		if (this.anIntArrayArrayArray8460 != null)
			this.anIntArrayArrayArray8460[i][i_88_] = is_89_;
		Class298_Sub16[] class298_sub16s = (this.aClass298_Sub16ArrayArrayArray8459[i][i_88_] = new Class298_Sub16[is_92_.length]);
		for (int i_96_ = 0; i_96_ < is_92_.length; i_96_++) {
			int i_97_ = is_94_[i_96_];
			int i_98_ = is_95_[i_96_];
			if ((this.anInt8482 & 0x20) != 0 && i_97_ != -1 && interface_ma.method174(i_97_).aBoolean524) {
				i_98_ = 128;
				i_97_ = -1;
			}
			long l = ((long) (class78.anInt727 * -1475891183) << 48 | (long) (class78.anInt725 * 1996750669) << 42 | (long) (class78.anInt726 * -1212608691) << 28 | (long) (i_98_ << 14) | (long) i_97_);
			Node class298;
			for (class298 = this.aClass440_8479.method5852(l); class298 != null; class298 = this.aClass440_8479.method5853(-1979022775)) {
				Class298_Sub16 class298_sub16 = (Class298_Sub16) class298;
				if (class298_sub16.anInt7284 == i_97_ && (class298_sub16.aFloat7294 == (float) i_98_) && class298_sub16.aClass78_7286.method843(class78, (byte) 61))
					break;
			}
			if (class298 == null) {
				class298_sub16s[i_96_] = new Class298_Sub16(this, i_97_, i_98_, class78);
				this.aClass440_8479.method5858(class298_sub16s[i_96_], l);
			} else
				class298_sub16s[i_96_] = (Class298_Sub16) class298;
		}
		if (bool)
			this.aByteArrayArray8469[i][i_88_] |= 0x1;
		if (is_92_.length > this.anInt8474)
			this.anInt8474 = is_92_.length;
		this.anInt8473 += is_92_.length;
	}

	Class_xa_Sub1(NativeToolkit class_ra_sub3, int i, int i_102_, int i_103_, int i_104_, int[][] is, int[][] is_105_, int i_106_) {
		super(i_103_, i_104_, i_106_, is);
		this.aFloat8447 = -3.4028235E38F;
		this.aClass458_8468 = new NodeCollection();
		this.aClass_ra_Sub3_8467 = class_ra_sub3;
		this.anInt8450 = anInt6289 * -2137349879 - 2;
		this.anInt8451 = 1 << this.anInt8450;
		this.anInt8463 = i;
		this.anInt8482 = i_102_;
		this.anIntArrayArrayArray8460 = new int[i_103_][i_104_][];
		this.aClass298_Sub16ArrayArrayArray8459 = new Class298_Sub16[i_103_][i_104_][];
		this.anIntArrayArrayArray8462 = new int[i_103_][i_104_][];
		this.anIntArrayArrayArray8458 = new int[i_103_][i_104_][];
		this.anIntArrayArrayArray8483 = new int[i_103_][i_104_][];
		this.anIntArrayArrayArray8461 = new int[i_103_][i_104_][];
		this.aShortArrayArray8456 = new short[i_103_ * i_104_][];
		this.aByteArrayArray8469 = new byte[i_103_][i_104_];
		this.aByteArrayArray8475 = new byte[i_103_ + 1][i_104_ + 1];
		this.aFloatArrayArray8476 = (new float[anInt6287 * -506105871 + 1][anInt6286 * -1148794921 + 1]);
		this.aFloatArrayArray8477 = (new float[anInt6287 * -506105871 + 1][anInt6286 * -1148794921 + 1]);
		this.aFloatArrayArray8466 = (new float[anInt6287 * -506105871 + 1][anInt6286 * -1148794921 + 1]);
		for (int i_107_ = 0; i_107_ <= anInt6286 * -1148794921; i_107_++) {
			for (int i_108_ = 0; i_108_ <= anInt6287 * -506105871; i_108_++) {
				int i_109_ = anIntArrayArray6290[i_108_][i_107_];
				if ((float) i_109_ < this.aFloat8457)
					this.aFloat8457 = (float) i_109_;
				if ((float) i_109_ > this.aFloat8447)
					this.aFloat8447 = (float) i_109_;
				if (i_108_ > 0 && i_107_ > 0 && i_108_ < anInt6287 * -506105871 && i_107_ < anInt6286 * -1148794921) {
					int i_110_ = (is_105_[i_108_ + 1][i_107_] - is_105_[i_108_ - 1][i_107_]);
					int i_111_ = (is_105_[i_108_][i_107_ + 1] - is_105_[i_108_][i_107_ - 1]);
					float f = (float) (1.0 / Math.sqrt((double) (i_110_ * i_110_ + 4 * i_106_ * i_106_ + i_111_ * i_111_)));
					this.aFloatArrayArray8476[i_108_][i_107_] = (float) i_110_ * f;
					this.aFloatArrayArray8477[i_108_][i_107_] = (float) (-i_106_ * 2) * f;
					this.aFloatArrayArray8466[i_108_][i_107_] = (float) i_111_ * f;
				}
			}
		}
		this.aFloat8457--;
		this.aFloat8447++;
		this.aClass440_8479 = new Class440(128);
		if ((this.anInt8482 & 0x10) != 0)
			this.aClass169_8452 = new Class169(this.aClass_ra_Sub3_8467, this);
	}

	public void method6339(int i, int i_123_, int i_124_, int i_125_, int i_126_, int i_127_, int i_128_, boolean[][] bools) {
		if (this.anInt8473 > 0) {
			Interface7_Impl2 interface7_impl2 = this.aClass_ra_Sub3_8467.method5312(this.anInt8455);
			int i_129_ = 0;
			int i_130_ = 32767;
			int i_131_ = -32768;
			ByteBuffer bytebuffer = this.aClass_ra_Sub3_8467.aByteBuffer8216;
			bytebuffer.clear();
			for (int i_132_ = i_126_; i_132_ < i_128_; i_132_++) {
				int i_133_ = i_132_ * (anInt6287 * -506105871) + i_125_;
				for (int i_134_ = i_125_; i_134_ < i_127_; i_134_++) {
					if (bools[i_134_ - i_125_][i_132_ - i_126_]) {
						short[] is = (this.aShortArrayArray8456[i_133_]);
						if (is != null) {
							for (int i_135_ = 0; i_135_ < is.length; i_135_++) {
								int i_136_ = is[i_135_] & 0xffff;
								if (i_136_ > i_131_)
									i_131_ = i_136_;
								if (i_136_ < i_130_)
									i_130_ = i_136_;
								bytebuffer.putShort((short) i_136_);
								i_129_++;
							}
						}
					}
					i_133_++;
				}
			}
			interface7_impl2.method63(0, bytebuffer.position(), (this.aClass_ra_Sub3_8467.aLong8217));
			if (i_129_ > 0) {
				this.aClass_ra_Sub3_8467.method5393();
				Class137 class137 = (this.aClass_ra_Sub3_8467.aClass137_8316);
				this.aClass_ra_Sub3_8467.method5383(0, this.anInterface7_Impl1_8470);
				this.aClass_ra_Sub3_8467.method5383(1, this.anInterface7_Impl1_8449);
				this.aClass_ra_Sub3_8467.method5455(this.aClass153_8472);
				this.aClass_ra_Sub3_8467.method5384(interface7_impl2);
				this.aClass_ra_Sub3_8467.cw(Matrix43f.aClass222_2504);
				float f = (float) this.aClass_ra_Sub3_8467.getFrameContext().getWidth();
				float f_137_ = (float) this.aClass_ra_Sub3_8467.getFrameContext().getHeight();
				Matrix43f class222 = new Matrix43f();
				Matrix43f class222_138_ = new Matrix43f();
				class222.method2057(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F);
				class222_138_.method2065((float) i_124_ / (256.0F * (float) (anInt6288 * -1212653763)), (float) -i_124_ / (256.0F * (float) (anInt6288 * -1212653763)), 1.0F / (this.aFloat8447 - this.aFloat8457));
				class222_138_.translate((float) i - (float) (i_125_ * i_124_) / 256.0F, (float) i_123_ + (float) (i_128_ * i_124_) / 256.0F, (-this.aFloat8457 / (this.aFloat8447 - this.aFloat8457)));
				class222_138_.method2061(2.0F / f, 2.0F / f_137_, 1.0F);
				class222_138_.translate(-1.0F, -1.0F, 0.0F);
				this.aClass_ra_Sub3_8467.aClass222_8235.method2068(class222, class222_138_);
				this.aClass_ra_Sub3_8467.aMatrix4f_8236.method2145(this.aClass_ra_Sub3_8467.aClass222_8235);
				this.aClass_ra_Sub3_8467.ci(this.aClass_ra_Sub3_8467.aMatrix4f_8236);
				class137.method1506(Matrix4f.aMatrix4f_2595);
				class137.aClass232_1525.method2135(0.0F, 0.0F, 0.0F, 0.0F);
				class137.aClass217_1522.setVector3f(0.0F, 0.0F, 0.0F);
				class137.aClass232_1523.method2135(0.0F, 0.0F, 0.0F, 0.0F);
				class137.aClass217_1524.setVector3f(0.0F, 0.0F, 0.0F);
				class137.anInterface9_Impl2_1517 = (this.aClass_ra_Sub3_8467.anInterface9_Impl2_8310);
				class137.aMatrix4f_1519.method2172();
				class137.anInt1532 = i_130_;
				class137.anInt1533 = i_131_ - i_130_ + 1;
				class137.anInt1534 = 0;
				class137.anInt1514 = i_129_ / 3;
				class137.method1514(false);
			}
		}
	}

	public void method6336(int i, int i_139_, int[] is, int[] is_140_, int[] is_141_, int[] is_142_, int[] is_143_, int[] is_144_, int[] is_145_, int[] is_146_, int[] is_147_, int[] is_148_, int[] is_149_, Class78 class78, boolean bool) {
		int i_150_ = is_146_.length;
		int[] is_151_ = new int[i_150_ * 3];
		int[] is_152_ = new int[i_150_ * 3];
		int[] is_153_ = new int[i_150_ * 3];
		int[] is_154_ = new int[i_150_ * 3];
		int[] is_155_ = new int[i_150_ * 3];
		int[] is_156_ = new int[i_150_ * 3];
		int[] is_157_ = is_140_ != null ? new int[i_150_ * 3] : null;
		int[] is_158_ = is_142_ != null ? new int[i_150_ * 3] : null;
		int i_159_ = 0;
		for (int i_160_ = 0; i_160_ < i_150_; i_160_++) {
			int i_161_ = is_143_[i_160_];
			int i_162_ = is_144_[i_160_];
			int i_163_ = is_145_[i_160_];
			is_151_[i_159_] = is[i_161_];
			is_152_[i_159_] = is_141_[i_161_];
			is_153_[i_159_] = is_146_[i_160_];
			is_155_[i_159_] = is_148_[i_160_];
			is_156_[i_159_] = is_149_[i_160_];
			is_154_[i_159_] = is_147_ != null ? is_147_[i_160_] : is_146_[i_160_];
			if (is_140_ != null)
				is_157_[i_159_] = is_140_[i_161_];
			if (is_142_ != null)
				is_158_[i_159_] = is_142_[i_161_];
			i_159_++;
			is_151_[i_159_] = is[i_162_];
			is_152_[i_159_] = is_141_[i_162_];
			is_153_[i_159_] = is_146_[i_160_];
			is_155_[i_159_] = is_148_[i_160_];
			is_156_[i_159_] = is_149_[i_160_];
			is_154_[i_159_] = is_147_ != null ? is_147_[i_160_] : is_146_[i_160_];
			if (is_140_ != null)
				is_157_[i_159_] = is_140_[i_162_];
			if (is_142_ != null)
				is_158_[i_159_] = is_142_[i_162_];
			i_159_++;
			is_151_[i_159_] = is[i_163_];
			is_152_[i_159_] = is_141_[i_163_];
			is_153_[i_159_] = is_146_[i_160_];
			is_155_[i_159_] = is_148_[i_160_];
			is_156_[i_159_] = is_149_[i_160_];
			is_154_[i_159_] = is_147_ != null ? is_147_[i_160_] : is_146_[i_160_];
			if (is_140_ != null)
				is_157_[i_159_] = is_140_[i_163_];
			if (is_142_ != null)
				is_158_[i_159_] = is_142_[i_163_];
			i_159_++;
		}
		method6335(i, i_139_, is_151_, is_157_, is_152_, is_158_, is_153_, is_154_, is_155_, is_156_, class78, bool);
	}

	void method6365(Class_na_Sub2 class_na_sub2, int i, int i_164_) {
		int[] is = this.anIntArrayArrayArray8462[i][i_164_];
		int[] is_165_ = this.anIntArrayArrayArray8458[i][i_164_];
		int i_166_ = is.length;
		if (anIntArray8480.length < i_166_) {
			anIntArray8480 = new int[i_166_];
			anIntArray8481 = new int[i_166_];
		}
		for (int i_167_ = 0; i_167_ < i_166_; i_167_++) {
			anIntArray8480[i_167_] = is[i_167_] >> (this.aClass_ra_Sub3_8467.anInt8313);
			anIntArray8481[i_167_] = is_165_[i_167_] >> (this.aClass_ra_Sub3_8467.anInt8313);
		}
		int i_168_ = 0;
		while (i_168_ < i_166_) {
			int i_169_ = anIntArray8480[i_168_];
			int i_170_ = anIntArray8481[i_168_++];
			int i_171_ = anIntArray8480[i_168_];
			int i_172_ = anIntArray8481[i_168_++];
			int i_173_ = anIntArray8480[i_168_];
			int i_174_ = anIntArray8481[i_168_++];
			if (((i_169_ - i_171_) * (i_172_ - i_174_) - (i_172_ - i_170_) * (i_173_ - i_171_)) > 0)
				class_na_sub2.method3490(i_170_, i_172_, i_174_, i_169_, i_171_, i_173_);
		}
	}

	public boolean method6353(Class_na class_na, int i, int i_175_, int i_176_, int i_177_, boolean bool) {
		if (this.aClass169_8452 == null || class_na == null)
			return false;
		int i_178_ = (i - (i_175_ * this.aClass_ra_Sub3_8467.anInt8299 >> 8) >> (this.aClass_ra_Sub3_8467.anInt8313));
		int i_179_ = (i_176_ - (i_175_ * (this.aClass_ra_Sub3_8467.anInt8317) >> 8) >> (this.aClass_ra_Sub3_8467.anInt8313));
		return this.aClass169_8452.method1807(class_na, i_178_, i_179_);
	}

	public void UA(Class_na class_na, int i, int i_180_, int i_181_, int i_182_, boolean bool) {
		if (this.aClass169_8452 != null && class_na != null) {
			int i_183_ = (i - (i_180_ * (this.aClass_ra_Sub3_8467.anInt8299) >> 8) >> this.aClass_ra_Sub3_8467.anInt8313);
			int i_184_ = (i_181_ - (i_180_ * (this.aClass_ra_Sub3_8467.anInt8317) >> 8) >> this.aClass_ra_Sub3_8467.anInt8313);
			this.aClass169_8452.method1805(class_na, i_183_, i_184_);
		}
	}

	public void NA(Class_na class_na, int i, int i_185_, int i_186_, int i_187_, boolean bool) {
		if (this.aClass169_8452 != null && class_na != null) {
			int i_188_ = (i - (i_185_ * (this.aClass_ra_Sub3_8467.anInt8299) >> 8) >> this.aClass_ra_Sub3_8467.anInt8313);
			int i_189_ = (i_186_ - (i_185_ * (this.aClass_ra_Sub3_8467.anInt8317) >> 8) >> this.aClass_ra_Sub3_8467.anInt8313);
			this.aClass169_8452.method1801(class_na, i_188_, i_189_);
		}
	}

	static {
		anIntArray8471 = new int[1];
	}

	public Class_na w(int i, int i_279_, Class_na class_na) {
		if ((this.aByteArrayArray8469[i][i_279_] & 0x1) == 0)
			return null;
		int i_280_ = (anInt6288 * -1212653763 >> (this.aClass_ra_Sub3_8467.anInt8313));
		Class_na_Sub2 class_na_sub2 = (Class_na_Sub2) class_na;
		Class_na_Sub2 class_na_sub2_281_;
		if (class_na_sub2 != null && class_na_sub2.method3489(i_280_, i_280_)) {
			class_na_sub2_281_ = class_na_sub2;
			class_na_sub2_281_.method3487();
		} else
			class_na_sub2_281_ = new Class_na_Sub2(this.aClass_ra_Sub3_8467, i_280_, i_280_);
		class_na_sub2_281_.method3486(0, 0, i_280_, i_280_);
		method6365(class_na_sub2_281_, i, i_279_);
		return class_na_sub2_281_;
	}

	public void SA() {
		if (this.anInt8473 > 0) {
			byte[][] is = (new byte[anInt6287 * -506105871 + 1][anInt6286 * -1148794921 + 1]);
			for (int i = 1; i < anInt6287 * -506105871; i++) {
				for (int i_285_ = 1; i_285_ < anInt6286 * -1148794921; i_285_++)
					is[i][i_285_] = (byte) (((this.aByteArrayArray8475[i - 1][i_285_]) >> 2) + ((this.aByteArrayArray8475[i + 1][i_285_]) >> 3) + ((this.aByteArrayArray8475[i][i_285_ - 1]) >> 2) + ((this.aByteArrayArray8475[i][i_285_ + 1]) >> 3) + ((this.aByteArrayArray8475[i][i_285_]) >> 1));
			}
			Node[] class298s = new Node[this.aClass440_8479.method5855(1332224628)];
			this.aClass440_8479.method5854(class298s, 2094257346);
			for (int i = 0; i < class298s.length; i++)
				((Class298_Sub16) class298s[i]).method2910(this.anInt8473);
			int i = 20;
			if (this.anIntArrayArrayArray8465 != null)
				i += 4;
			if ((this.anInt8482 & 0x7) != 0)
				i += 12;
			jaclib.memory.heap.NativeHeapBuffer nativeheapbuffer = this.aClass_ra_Sub3_8467.aNativeHeap8221.f(this.anInt8473 * 4, false);
			jaclib.memory.heap.NativeHeapBuffer nativeheapbuffer_286_ = this.aClass_ra_Sub3_8467.aNativeHeap8221.f(this.anInt8473 * i, false);
			Stream stream = new Stream(nativeheapbuffer_286_);
			Stream stream_287_ = new Stream(nativeheapbuffer);
			Class298_Sub16[] class298_sub16s = new Class298_Sub16[this.anInt8473];
			int i_288_ = StaticMethods.method5639((this.anInt8473 / 4));
			if (i_288_ < 1)
				i_288_ = 1;
			Class440 class440 = new Class440(i_288_);
			Class298_Sub16[] class298_sub16s_289_ = new Class298_Sub16[this.anInt8474];
			for (int i_290_ = 0; i_290_ < anInt6287 * -506105871; i_290_++) {
				for (int i_291_ = 0; i_291_ < anInt6286 * -1148794921; i_291_++) {
					if ((this.anIntArrayArrayArray8483[i_290_][i_291_]) != null) {
						Class298_Sub16[] class298_sub16s_292_ = (this.aClass298_Sub16ArrayArrayArray8459[i_290_][i_291_]);
						int[] is_293_ = (this.anIntArrayArrayArray8462[i_290_][i_291_]);
						int[] is_294_ = (this.anIntArrayArrayArray8458[i_290_][i_291_]);
						int[] is_295_ = (this.anIntArrayArrayArray8461[i_290_][i_291_]);
						int[] is_296_ = (this.anIntArrayArrayArray8483[i_290_][i_291_]);
						int[] is_297_ = ((this.anIntArrayArrayArray8460 != null) ? (this.anIntArrayArrayArray8460[i_290_][i_291_]) : null);
						int[] is_298_ = ((this.anIntArrayArrayArray8465 != null) ? (this.anIntArrayArrayArray8465[i_290_][i_291_]) : null);
						if (is_295_ == null)
							is_295_ = is_296_;
						float f = (this.aFloatArrayArray8476[i_290_][i_291_]);
						float f_299_ = (this.aFloatArrayArray8477[i_290_][i_291_]);
						float f_300_ = (this.aFloatArrayArray8466[i_290_][i_291_]);
						float f_301_ = (this.aFloatArrayArray8476[i_290_][i_291_ + 1]);
						float f_302_ = (this.aFloatArrayArray8477[i_290_][i_291_ + 1]);
						float f_303_ = (this.aFloatArrayArray8466[i_290_][i_291_ + 1]);
						float f_304_ = (this.aFloatArrayArray8476[i_290_ + 1][i_291_ + 1]);
						float f_305_ = (this.aFloatArrayArray8477[i_290_ + 1][i_291_ + 1]);
						float f_306_ = (this.aFloatArrayArray8466[i_290_ + 1][i_291_ + 1]);
						float f_307_ = (this.aFloatArrayArray8476[i_290_ + 1][i_291_]);
						float f_308_ = (this.aFloatArrayArray8477[i_290_ + 1][i_291_]);
						float f_309_ = (this.aFloatArrayArray8466[i_290_ + 1][i_291_]);
						int i_310_ = is[i_290_][i_291_] & 0xff;
						int i_311_ = is[i_290_][i_291_ + 1] & 0xff;
						int i_312_ = is[i_290_ + 1][i_291_ + 1] & 0xff;
						int i_313_ = is[i_290_ + 1][i_291_] & 0xff;
						int i_314_ = 0;
						while_112_: for (int i_315_ = 0; i_315_ < is_296_.length; i_315_++) {
							Class298_Sub16 class298_sub16 = class298_sub16s_292_[i_315_];
							for (int i_316_ = 0; i_316_ < i_314_; i_316_++) {
								if (class298_sub16s_289_[i_316_] == class298_sub16)
									continue while_112_;
							}
							class298_sub16s_289_[i_314_++] = class298_sub16;
						}
						short[] is_317_ = (this.aShortArrayArray8456[i_291_ * (anInt6287 * -506105871) + i_290_] = new short[is_296_.length]);
						for (int i_318_ = 0; i_318_ < is_296_.length; i_318_++) {
							int i_319_ = ((i_290_ << anInt6289 * -2137349879) + is_293_[i_318_]);
							int i_320_ = ((i_291_ << anInt6289 * -2137349879) + is_294_[i_318_]);
							int i_321_ = i_319_ >> this.anInt8450;
							int i_322_ = i_320_ >> this.anInt8450;
							int i_323_ = is_296_[i_318_];
							int i_324_ = is_295_[i_318_];
							int i_325_ = is_297_ != null ? is_297_[i_318_] : 0;
							long l = ((long) i_324_ << 48 | (long) i_323_ << 32 | (long) (i_321_ << 16) | (long) i_322_);
							int i_326_ = is_293_[i_318_];
							int i_327_ = is_294_[i_318_];
							int i_328_ = 74;
							int i_329_ = 0;
							float f_330_ = 1.0F;
							float f_331_;
							float f_332_;
							float f_333_;
							if (i_326_ == 0 && i_327_ == 0) {
								f_331_ = f;
								f_332_ = f_299_;
								f_333_ = f_300_;
								i_328_ -= i_310_;
							} else if (i_326_ == 0 && i_327_ == anInt6288 * -1212653763) {
								f_331_ = f_301_;
								f_332_ = f_302_;
								f_333_ = f_303_;
								i_328_ -= i_311_;
							} else if (i_326_ == anInt6288 * -1212653763 && i_327_ == anInt6288 * -1212653763) {
								f_331_ = f_304_;
								f_332_ = f_305_;
								f_333_ = f_306_;
								i_328_ -= i_312_;
							} else if (i_326_ == anInt6288 * -1212653763 && i_327_ == 0) {
								f_331_ = f_307_;
								f_332_ = f_308_;
								f_333_ = f_309_;
								i_328_ -= i_313_;
							} else {
								float f_334_ = ((float) i_326_ / (float) (anInt6288 * -1212653763));
								float f_335_ = ((float) i_327_ / (float) (anInt6288 * -1212653763));
								float f_336_ = f + (f_307_ - f) * f_334_;
								float f_337_ = f_299_ + (f_308_ - f_299_) * f_334_;
								float f_338_ = f_300_ + (f_309_ - f_300_) * f_334_;
								float f_339_ = f_301_ + (f_304_ - f_301_) * f_334_;
								float f_340_ = f_302_ + (f_305_ - f_302_) * f_334_;
								float f_341_ = f_303_ + (f_306_ - f_303_) * f_334_;
								f_331_ = f_336_ + (f_339_ - f_336_) * f_335_;
								f_332_ = f_337_ + (f_340_ - f_337_) * f_335_;
								f_333_ = f_338_ + (f_341_ - f_338_) * f_335_;
								int i_342_ = i_310_ + ((i_313_ - i_310_) * i_326_ >> anInt6289 * -2137349879);
								int i_343_ = i_311_ + ((i_312_ - i_311_) * i_326_ >> anInt6289 * -2137349879);
								i_328_ -= i_342_ + ((i_343_ - i_342_) * i_327_ >> anInt6289 * -2137349879);
							}
							if (i_323_ != -1) {
								int i_344_ = (i_323_ & 0x7f) * i_328_ >> 7;
								if (i_344_ < 2)
									i_344_ = 2;
								else if (i_344_ > 126)
									i_344_ = 126;
								i_329_ = (Class294.anIntArray3165[i_323_ & 0xff80 | i_344_]);
								if ((this.anInt8482 & 0x7) == 0) {
									f_330_ = ((this.aClass_ra_Sub3_8467.aFloatArray8283[0]) * f_331_ + (this.aClass_ra_Sub3_8467.aFloatArray8283[1]) * f_332_ + (this.aClass_ra_Sub3_8467.aFloatArray8283[2]) * f_333_);
									f_330_ = ((this.aClass_ra_Sub3_8467.aFloat8291) + (f_330_ * (f_330_ > 0.0F ? (this.aClass_ra_Sub3_8467.aFloat8364) : (this.aClass_ra_Sub3_8467.aFloat8293))));
								}
							}
							Node class298 = null;
							if ((i_319_ & this.anInt8451 - 1) == 0 && ((i_320_ & this.anInt8451 - 1) == 0))
								class298 = class440.method5852(l);
							int i_345_;
							if (class298 == null) {
								int i_346_;
								if (i_324_ != i_323_) {
									int i_347_ = (i_324_ & 0x7f) * i_328_ >> 7;
									if (i_347_ < 2)
										i_347_ = 2;
									else if (i_347_ > 126)
										i_347_ = 126;
									i_346_ = (Class294.anIntArray3165[i_324_ & 0xff80 | i_347_]);
									if ((this.anInt8482 & 0x7) == 0) {
										float f_348_ = ((this.aClass_ra_Sub3_8467.aFloatArray8283[0]) * f_331_ + (this.aClass_ra_Sub3_8467.aFloatArray8283[1]) * f_332_ + ((this.aClass_ra_Sub3_8467.aFloatArray8283[2]) * f_333_));
										f_348_ = ((this.aClass_ra_Sub3_8467.aFloat8291) + (f_330_ * (f_330_ > 0.0F ? (this.aClass_ra_Sub3_8467.aFloat8364) : (this.aClass_ra_Sub3_8467.aFloat8293))));
										int i_349_ = i_346_ >> 16 & 0xff;
										int i_350_ = i_346_ >> 8 & 0xff;
										int i_351_ = i_346_ & 0xff;
										i_349_ *= f_348_;
										if (i_349_ < 0)
											i_349_ = 0;
										else if (i_349_ > 255)
											i_349_ = 255;
										i_350_ *= f_348_;
										if (i_350_ < 0)
											i_350_ = 0;
										else if (i_350_ > 255)
											i_350_ = 255;
										i_351_ *= f_348_;
										if (i_351_ < 0)
											i_351_ = 0;
										else if (i_351_ > 255)
											i_351_ = 255;
										i_346_ = (i_349_ << 16 | i_350_ << 8 | i_351_);
									}
								} else
									i_346_ = i_329_;
								if (Stream.r()) {
									stream.d((float) i_319_);
									stream.d((float) (method6340(i_319_, i_320_) + i_325_));
									stream.d((float) i_320_);
									stream.d((float) i_319_);
									stream.d((float) i_320_);
									if ((this.anIntArrayArrayArray8465) != null)
										stream.d(is_298_ != null ? (float) (is_298_[i_318_] - 1) : 0.0F);
									if ((this.anInt8482 & 0x7) != 0) {
										stream.d(f_331_);
										stream.d(f_332_);
										stream.d(f_333_);
									}
								} else {
									stream.u((float) i_319_);
									stream.u((float) (method6340(i_319_, i_320_) + i_325_));
									stream.u((float) i_320_);
									stream.u((float) i_319_);
									stream.u((float) i_320_);
									if ((this.anIntArrayArrayArray8465) != null)
										stream.u(is_298_ != null ? (float) (is_298_[i_318_] - 1) : 0.0F);
									if ((this.anInt8482 & 0x7) != 0) {
										stream.u(f_331_);
										stream.u(f_332_);
										stream.u(f_333_);
									}
								}
								if ((this.aClass_ra_Sub3_8467.samples) == 0)
									stream_287_.i(~0xffffff | i_346_);
								else
									stream_287_.k(~0xffffff | i_346_);
								i_345_ = this.anInt8454++;
								is_317_[i_318_] = (short) i_345_;
								if (i_323_ != -1)
									class298_sub16s[i_345_] = class298_sub16s_292_[i_318_];
								class440.method5858(new Class298_Sub20(is_317_[i_318_]), l);
							} else {
								is_317_[i_318_] = ((Class298_Sub20) class298).aShort7314;
								i_345_ = is_317_[i_318_] & 0xffff;
								if (i_323_ != -1 && ((class298_sub16s_292_[i_318_].key * 7051297995265073167L) < (class298_sub16s[i_345_].key * 7051297995265073167L)))
									class298_sub16s[i_345_] = class298_sub16s_292_[i_318_];
							}
							for (int i_352_ = 0; i_352_ < i_314_; i_352_++)
								class298_sub16s_289_[i_352_].method2913(i_345_, i_329_, i_328_, f_330_);
							this.anInt8455++;
						}
					}
				}
			}
			for (int i_353_ = 0; i_353_ < this.anInt8454; i_353_++) {
				Class298_Sub16 class298_sub16 = class298_sub16s[i_353_];
				if (class298_sub16 != null)
					class298_sub16.method2911(i_353_);
			}
			for (int i_354_ = 0; i_354_ < anInt6287 * -506105871; i_354_++) {
				for (int i_355_ = 0; i_355_ < anInt6286 * -1148794921; i_355_++) {
					short[] is_356_ = (this.aShortArrayArray8456[i_355_ * (anInt6287 * -506105871) + i_354_]);
					if (is_356_ != null) {
						int i_357_ = 0;
						int i_358_ = 0;
						while (i_358_ < is_356_.length) {
							int i_359_ = is_356_[i_358_++] & 0xffff;
							int i_360_ = is_356_[i_358_++] & 0xffff;
							int i_361_ = is_356_[i_358_++] & 0xffff;
							Class298_Sub16 class298_sub16 = class298_sub16s[i_359_];
							Class298_Sub16 class298_sub16_362_ = class298_sub16s[i_360_];
							Class298_Sub16 class298_sub16_363_ = class298_sub16s[i_361_];
							Class298_Sub16 class298_sub16_364_ = null;
							if (class298_sub16 != null) {
								class298_sub16.method2912(i_354_, i_355_, i_357_);
								class298_sub16_364_ = class298_sub16;
							}
							if (class298_sub16_362_ != null) {
								class298_sub16_362_.method2912(i_354_, i_355_, i_357_);
								if (class298_sub16_364_ == null || ((class298_sub16_362_.key * 7051297995265073167L) < (class298_sub16_364_.key * 7051297995265073167L)))
									class298_sub16_364_ = class298_sub16_362_;
							}
							if (class298_sub16_363_ != null) {
								class298_sub16_363_.method2912(i_354_, i_355_, i_357_);
								if (class298_sub16_364_ == null || ((class298_sub16_363_.key * 7051297995265073167L) < (class298_sub16_364_.key * 7051297995265073167L)))
									class298_sub16_364_ = class298_sub16_363_;
							}
							if (class298_sub16_364_ != null) {
								if (class298_sub16 != null)
									class298_sub16_364_.method2911(i_359_);
								if (class298_sub16_362_ != null)
									class298_sub16_364_.method2911(i_360_);
								if (class298_sub16_363_ != null)
									class298_sub16_364_.method2911(i_361_);
								class298_sub16_364_.method2912(i_354_, i_355_, i_357_);
							}
							i_357_++;
						}
					}
				}
			}
			stream.x();
			stream_287_.x();
			this.anInterface7_Impl1_8449 = this.aClass_ra_Sub3_8467.method5382(false);
			this.anInterface7_Impl1_8449.method71(this.anInt8454 * 4, 4, nativeheapbuffer);
			this.anInterface7_Impl1_8470 = this.aClass_ra_Sub3_8467.method5382(false);
			this.anInterface7_Impl1_8470.method71(this.anInt8454 * i, i, nativeheapbuffer_286_);
			if ((this.anInt8482 & 0x7) != 0) {
				if (this.anIntArrayArrayArray8465 != null)
					this.aClass153_8472 = (this.aClass_ra_Sub3_8467.method5404(new Class181[] { new Class181(new Class155[] { Class155.aClass155_1610, Class155.aClass155_1599, Class155.aClass155_1601, Class155.aClass155_1596 }), new Class181(Class155.aClass155_1597) }));
				else
					this.aClass153_8472 = (this.aClass_ra_Sub3_8467.method5404(new Class181[] { new Class181(new Class155[] { Class155.aClass155_1610, Class155.aClass155_1599, Class155.aClass155_1596 }), new Class181(Class155.aClass155_1597) }));
			} else if (this.anIntArrayArrayArray8465 != null)
				this.aClass153_8472 = (this.aClass_ra_Sub3_8467.method5404(new Class181[] { new Class181(new Class155[] { Class155.aClass155_1610, Class155.aClass155_1599, Class155.aClass155_1601 }), new Class181(Class155.aClass155_1597) }));
			else
				this.aClass153_8472 = (this.aClass_ra_Sub3_8467.method5404(new Class181[] { new Class181(new Class155[] { Class155.aClass155_1610, Class155.aClass155_1599 }), new Class181(Class155.aClass155_1597) }));
			int i_365_ = 0;
			for (int i_366_ = 0; i_366_ < class298s.length; i_366_++) {
				Class298_Sub16 class298_sub16 = (Class298_Sub16) class298s[i_366_];
				if (class298_sub16.anInt7290 > 0)
					class298s[i_365_++] = class298_sub16;
			}
			this.aClass298Array8478 = new Node[i_365_];
			long[] ls = new long[i_365_];
			for (int i_367_ = 0; i_367_ < i_365_; i_367_++) {
				Class298_Sub16 class298_sub16 = (Class298_Sub16) class298s[i_367_];
				ls[i_367_] = class298_sub16.key * 7051297995265073167L;
				this.aClass298Array8478[i_367_] = class298_sub16;
				class298_sub16.method2914(this.anInt8454);
			}
			Class365_Sub1_Sub3_Sub1.method4507(ls, (this.aClass298Array8478), (byte) -13);
			if (this.aClass169_8452 != null)
				this.aClass169_8452.method1799();
		} else
			this.aClass169_8452 = null;
		if ((this.anInt8463 & 0x2) == 0) {
			this.anIntArrayArrayArray8458 = null;
			this.anIntArrayArrayArray8462 = null;
			this.anIntArrayArrayArray8483 = null;
		}
		this.anIntArrayArrayArray8465 = null;
		this.anIntArrayArrayArray8461 = null;
		this.anIntArrayArrayArray8460 = null;
		this.aClass298_Sub16ArrayArrayArray8459 = null;
		this.aByteArrayArray8475 = null;
		this.aClass440_8479 = null;
		this.aFloatArrayArray8466 = null;
		this.aFloatArrayArray8477 = null;
		this.aFloatArrayArray8476 = null;
	}

	public void method6338(int i, int i_368_, int i_369_, boolean[][] bools, boolean bool, int i_370_) {
		if (this.aClass298Array8478 != null) {
			int i_371_ = i_369_ + i_369_ + 1;
			i_371_ *= i_371_;
			if (anIntArray8471.length < i_371_)
				anIntArray8471 = new int[i_371_];
			int i_372_ = i - i_369_;
			int i_373_ = i_372_;
			if (i_372_ < 0)
				i_372_ = 0;
			int i_374_ = i_368_ - i_369_;
			int i_375_ = i_374_;
			if (i_374_ < 0)
				i_374_ = 0;
			int i_376_ = i + i_369_;
			if (i_376_ > anInt6287 * -506105871 - 1)
				i_376_ = anInt6287 * -506105871 - 1;
			int i_377_ = i_368_ + i_369_;
			if (i_377_ > anInt6286 * -1148794921 - 1)
				i_377_ = anInt6286 * -1148794921 - 1;
			anInt8453 = 0;
			for (int i_378_ = i_372_; i_378_ <= i_376_; i_378_++) {
				boolean[] bools_379_ = bools[i_378_ - i_373_];
				for (int i_380_ = i_374_; i_380_ <= i_377_; i_380_++) {
					if (bools_379_[i_380_ - i_375_])
						anIntArray8471[anInt8453++] = i_380_ * (anInt6287 * -506105871) + i_378_;
				}
			}
			ByteBuffer bytebuffer = this.aClass_ra_Sub3_8467.aByteBuffer8216;
			bytebuffer.clear();
			for (int i_381_ = 0; i_381_ < this.aClass298Array8478.length; i_381_++) {
				Class298_Sub16 class298_sub16 = ((Class298_Sub16) this.aClass298Array8478[i_381_]);
				class298_sub16.method2915(anIntArray8471, anInt8453);
			}
			int i_382_ = bytebuffer.position();
			Class137 class137 = (this.aClass_ra_Sub3_8467.aClass137_8316);
			if (i_382_ != 0) {
				Interface7_Impl2 interface7_impl2 = this.aClass_ra_Sub3_8467.method5312(i_382_ / 2);
				interface7_impl2.method63(0, i_382_, (this.aClass_ra_Sub3_8467.aLong8217));
				this.aClass_ra_Sub3_8467.method5393();
				this.aClass_ra_Sub3_8467.method5383(0, this.anInterface7_Impl1_8470);
				this.aClass_ra_Sub3_8467.method5384(interface7_impl2);
				class137.method1506(Matrix4f.aMatrix4f_2595);
				if (this.aClass_ra_Sub3_8467.anInt8233 > 0) {
					class137.aClass232_1525.method2135(0.0F, 0.0F, 1.0F, -(this.aClass_ra_Sub3_8467.aFloat8292));
					class137.aClass217_1522.setVector3f((float) ((this.aClass_ra_Sub3_8467.anInt8332) >> 16 & 0xff) / 255.0F, (float) ((this.aClass_ra_Sub3_8467.anInt8332) >> 8 & 0xff) / 255.0F, (float) ((this.aClass_ra_Sub3_8467.anInt8332) >> 0 & 0xff) / 255.0F);
					this.aClass_ra_Sub3_8467.aMatrix4f_8236.method2142(this.aClass_ra_Sub3_8467.aMatrix4f_8230);
					this.aClass_ra_Sub3_8467.aMatrix4f_8236.method2159();
					class137.aClass232_1525.method2138(this.aClass_ra_Sub3_8467.aMatrix4f_8236);
					class137.aClass232_1525.method2139(1.0F / ((this.aClass_ra_Sub3_8467.aFloat8336) - (this.aClass_ra_Sub3_8467.aFloat8292)));
				} else {
					class137.aClass232_1525.method2135(0.0F, 0.0F, 0.0F, 0.0F);
					class137.aClass217_1522.setVector3f(0.0F, 0.0F, 0.0F);
				}
				if ((this.anInt8482 & 0x37) == 0) {
					int i_383_ = 0;
					for (int i_384_ = 0; (i_384_ < this.aClass298Array8478.length); i_384_++) {
						Class298_Sub16 class298_sub16 = (Class298_Sub16) (this.aClass298Array8478[i_384_]);
						if (class298_sub16.anInt7282 != 0) {
							if (this.aClass_ra_Sub3_8467.aBoolean8326) {
								this.aClass_ra_Sub3_8467.method5058(0, (class298_sub16.aClass78_7286));
								class137.aClass232_1523.method2135(0.0F, 1.0F, 0.0F, ((float) (this.aClass_ra_Sub3_8467.anInt8328) + ((float) ((class298_sub16.aClass78_7286.anInt727) * -1475891183) / 255.0F * (float) ((class298_sub16.aClass78_7286.anInt725) * 1996750669))));
								class137.aClass232_1523.method2139(1.0F / (float) ((class298_sub16.aClass78_7286.anInt725) * 1996750669));
								class137.aClass217_1524.setVector3f((float) (((class298_sub16.aClass78_7286.anInt726) * -1212608691) >> 16 & 0xff) / 255.0F, (float) (((class298_sub16.aClass78_7286.anInt726) * -1212608691) >> 8 & 0xff) / 255.0F, (float) (((class298_sub16.aClass78_7286.anInt726) * -1212608691) >> 0 & 0xff) / 255.0F);
							} else {
								class137.aClass232_1523.method2135(0.0F, 0.0F, 0.0F, 0.0F);
								class137.aClass217_1524.setVector3f(0.0F, 0.0F, 0.0F);
							}
							boolean bool_385_ = false;
							if (class298_sub16.anInt7284 != -1) {
								class137.anInterface9_Impl2_1517 = (this.aClass_ra_Sub3_8467.aClass157_8351.method1698(class298_sub16.anInt7284));
								Class53 class53 = (this.aClass_ra_Sub3_8467.textures.method174((class298_sub16.anInt7284)));
								bool_385_ = !(Class298_Sub32_Sub31.method3339(class53.aByte529, -596124611));
							} else
								class137.anInterface9_Impl2_1517 = (this.aClass_ra_Sub3_8467.anInterface9_Impl2_8310);
							this.aClass_ra_Sub3_8467.method5383(1, (class298_sub16.anInterface7_Impl1_7287));
							this.aClass_ra_Sub3_8467.method5455(this.aClass153_8472);
							class137.aMatrix4f_1519.method2147(1.0F / (class298_sub16.aFloat7294), 1.0F / (class298_sub16.aFloat7294), 1.0F, 1.0F);
							class137.anInt1532 = class298_sub16.anInt7291;
							class137.anInt1533 = (class298_sub16.anInt7292 - (class298_sub16.anInt7291) + 1);
							class137.anInt1534 = i_383_;
							class137.anInt1514 = (class298_sub16.anInt7282 / 3);
							class137.method1514(bool_385_);
							i_383_ += class298_sub16.anInt7282;
						}
					}
				} else {
					class137.aClass217_1527.setVector3f((this.aClass_ra_Sub3_8467.aFloatArray8283[0]), (this.aClass_ra_Sub3_8467.aFloatArray8283[1]), (this.aClass_ra_Sub3_8467.aFloatArray8283[2]));
					class137.aClass217_1528.setVector3f((this.aClass_ra_Sub3_8467.aFloat8364 * (this.aClass_ra_Sub3_8467.aFloat8362)), (this.aClass_ra_Sub3_8467.aFloat8364 * (this.aClass_ra_Sub3_8467.aFloat8289)), (this.aClass_ra_Sub3_8467.aFloat8364 * (this.aClass_ra_Sub3_8467.aFloat8290)));
					class137.aClass217_1529.setVector3f((-(this.aClass_ra_Sub3_8467.aFloat8293) * (this.aClass_ra_Sub3_8467.aFloat8362)), (-(this.aClass_ra_Sub3_8467.aFloat8293) * (this.aClass_ra_Sub3_8467.aFloat8289)), (-(this.aClass_ra_Sub3_8467.aFloat8293) * (this.aClass_ra_Sub3_8467.aFloat8290)));
					class137.aClass217_1515.setVector3f((this.aClass_ra_Sub3_8467.aFloat8291 * (this.aClass_ra_Sub3_8467.aFloat8362)), (this.aClass_ra_Sub3_8467.aFloat8291 * (this.aClass_ra_Sub3_8467.aFloat8289)), (this.aClass_ra_Sub3_8467.aFloat8291 * (this.aClass_ra_Sub3_8467.aFloat8290)));
					int i_386_ = 0;
					for (int i_387_ = 0; (i_387_ < this.aClass298Array8478.length); i_387_++) {
						Class298_Sub16 class298_sub16 = (Class298_Sub16) (this.aClass298Array8478[i_387_]);
						if (class298_sub16.anInt7282 > 0) {
							if (this.aClass_ra_Sub3_8467.aBoolean8326) {
								this.aClass_ra_Sub3_8467.method5058(0, (class298_sub16.aClass78_7286));
								float f = 0.15F;
								class137.aClass232_1523.method2135(0.0F, 1.0F / ((float) ((class298_sub16.aClass78_7286.anInt725) * 1996750669) * f), 0.0F, 256.0F / ((float) ((class298_sub16.aClass78_7286.anInt725) * 1996750669) * f));
								class137.aClass217_1524.setVector3f((float) (((class298_sub16.aClass78_7286.anInt726) * -1212608691) >> 16 & 0xff) / 255.0F, (float) (((class298_sub16.aClass78_7286.anInt726) * -1212608691) >> 8 & 0xff) / 255.0F, (float) (((class298_sub16.aClass78_7286.anInt726) * -1212608691) >> 0 & 0xff) / 255.0F);
							} else {
								class137.aClass232_1523.method2135(0.0F, 0.0F, 0.0F, 0.0F);
								class137.aClass217_1524.setVector3f(0.0F, 0.0F, 0.0F);
							}
							byte i_388_ = 11;
							if (class298_sub16.anInt7284 != -1) {
								Class53 class53 = (this.aClass_ra_Sub3_8467.textures.method174((class298_sub16.anInt7284)));
								i_388_ = class53.aByte529;
								class137.anInterface9_Impl2_1517 = (this.aClass_ra_Sub3_8467.aClass157_8351.method1698(class298_sub16.anInt7284));
								class137.method1509(class53);
							} else
								class137.anInterface9_Impl2_1517 = (this.aClass_ra_Sub3_8467.anInterface9_Impl2_8310);
							this.aClass_ra_Sub3_8467.method5383(1, (class298_sub16.anInterface7_Impl1_7287));
							this.aClass_ra_Sub3_8467.method5455(this.aClass153_8472);
							class137.aMatrix4f_1519.method2147(1.0F / (class298_sub16.aFloat7294), 1.0F / (class298_sub16.aFloat7294), 1.0F, 1.0F);
							class137.anInt1532 = class298_sub16.anInt7291;
							class137.anInt1533 = (class298_sub16.anInt7292 - (class298_sub16.anInt7291) + 1);
							class137.anInt1534 = i_386_;
							class137.anInt1514 = (class298_sub16.anInt7282 / 3);
							switch (i_388_) {
							case 7:
								class137.aClass217_1530.setVector3f((this.aClass_ra_Sub3_8467.aMatrix4f_8231.aFloatArray2594[12]), (this.aClass_ra_Sub3_8467.aMatrix4f_8231.aFloatArray2594[13]), (this.aClass_ra_Sub3_8467.aMatrix4f_8231.aFloatArray2594[14]));
								class137.aMatrix4f_1535.method2172();
								class137.anInterface9_Impl1_1518 = this.aClass_ra_Sub3_8467.method5321();
								class137.method1503(0);
								break;
							case 2:
							case 4:
							case 8:
							case 9:
								if (!(this.aClass_ra_Sub3_8467.aBoolean8214) && (this.anInt8482 & 0x8) != 0) {
									Class161_Sub1_Sub2 class161_sub1_sub2 = (this.aClass_ra_Sub3_8467.aClass161_Sub1_Sub2_8319);
									class161_sub1_sub2.aMatrix4f_9140.method2142(this.aClass_ra_Sub3_8467.aMatrix4f_8251);
									class161_sub1_sub2.aMatrix4f_9142.method2147(1.0F / (class298_sub16.aFloat7294 * (float) ((class298_sub16.aClass78_7286.anInt729) * -28774789)), 1.0F / (class298_sub16.aFloat7294 * (float) ((class298_sub16.aClass78_7286.anInt729) * -28774789)), 1.0F, 1.0F);
									class161_sub1_sub2.aClass217_9144.setVector3f((this.aClass_ra_Sub3_8467.aMatrix4f_8231.aFloatArray2594[12]), (this.aClass_ra_Sub3_8467.aMatrix4f_8231.aFloatArray2594[13]), (this.aClass_ra_Sub3_8467.aMatrix4f_8231.aFloatArray2594[14]));
									Class53 class53 = (this.aClass_ra_Sub3_8467.textures.method174((class298_sub16.anInt7284)));
									class161_sub1_sub2.anInt9145 = class53.aByte536 * -1021876967;
									class161_sub1_sub2.anInt9160 = (class298_sub16.anInt7291) * 1525453135;
									class161_sub1_sub2.anInt9158 = ((class298_sub16.anInt7292) - (class298_sub16.anInt7291) + 1) * 942867733;
									class161_sub1_sub2.anInt9162 = i_386_ * 771469949;
									class161_sub1_sub2.anInt9163 = (class298_sub16.anInt7282) / 3 * -745727859;
									class161_sub1_sub2.aClass232_9153.method2140(class137.aClass232_1523);
									class161_sub1_sub2.aClass217_9149.setVector3fOfficial(class137.aClass217_1524);
									class161_sub1_sub2.aClass232_9157.method2140(class137.aClass232_1525);
									class161_sub1_sub2.aClass217_9139.setVector3fOfficial(class137.aClass217_1522);
									class161_sub1_sub2.setShaders();
								} else
									class137.method1507(0);
								break;
							default:
								if (this.aClass_ra_Sub3_8467.aBoolean8326)
									class137.method1510();
								else
									class137.method1507(0);
								break;
							case 1:
								class137.aClass217_1530.setVector3f((this.aClass_ra_Sub3_8467.aMatrix4f_8231.aFloatArray2594[12]), (this.aClass_ra_Sub3_8467.aMatrix4f_8231.aFloatArray2594[13]), (this.aClass_ra_Sub3_8467.aMatrix4f_8231.aFloatArray2594[14]));
								class137.method1508(0);
								break;
							case 6:
								class137.method1514(!Class298_Sub32_Sub31.method3339(i_388_, -869988177));
							}
							i_386_ += class298_sub16.anInt7282;
						}
					}
				}
			}
			if (this.aClass169_8452 != null) {
				this.aClass_ra_Sub3_8467.method5383(0, this.anInterface7_Impl1_8470);
				this.aClass_ra_Sub3_8467.method5383(1, this.anInterface7_Impl1_8449);
				this.aClass_ra_Sub3_8467.method5455(this.aClass153_8472);
				Matrix4f matrix4f = (this.aClass_ra_Sub3_8467.aMatrix4f_8236);
				matrix4f.method2172();
				matrix4f.aFloatArray2594[13] = -1.0F;
				class137.method1506(matrix4f);
				this.aClass169_8452.method1800(class137, i, i_368_, i_369_, bools, bool);
			}
		}
	}

	public void method6342(Light light, int[] is) {
		this.aClass458_8468.pushBack(new Class298_Sub18(this.aClass_ra_Sub3_8467, this, light, is));
	}

	public void LA(int i, int i_532_, int i_533_) {
		if ((this.aByteArrayArray8475[i][i_532_] & 0xff) < i_533_)
			this.aByteArrayArray8475[i][i_532_] = (byte) i_533_;
	}

}
