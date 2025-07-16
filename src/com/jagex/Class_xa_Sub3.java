package com.jagex;/* Class_xa_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;

public class Class_xa_Sub3 extends FloorToolkit {
	Class32 aClass32_8517;
	static int anInt8518 = 74;
	Class32 aClass32_8519;
	int anInt8520;
	int anInt8521;
	int anInt8522;
	int anInt8523;
	static float[] aFloatArray8524 = new float[16];
	int anInt8525;
	int anInt8526;
	Class298_Sub5[][][] aClass298_Sub5ArrayArrayArray8527;
	int[][][] anIntArrayArrayArray8528;
	int[][][] anIntArrayArrayArray8529;
	float[][] aFloatArrayArray8530;
	int[][][] anIntArrayArrayArray8531;
	int[][][] anIntArrayArrayArray8532;
	int[][][] anIntArrayArrayArray8533;
	Node[] aClass298Array8534;
	OpenGLGraphicsToolkit aClass_ra_Sub2_8535;
	NodeCollection aClass458_8536 = new NodeCollection();
	int[][][] anIntArrayArrayArray8537;
	Interface1 anInterface1_8538;
	Class32 aClass32_8539;
	Class32 aClass32_8540;
	Class44 aClass44_8541;
	static int anInt8542 = 1;
	int anInt8543;
	int anInt8544;
	byte[][] aByteArrayArray8545;
	byte[][] aByteArrayArray8546;
	float[][] aFloatArrayArray8547;
	float[][] aFloatArrayArray8548;
	Class440 aClass440_8549;
	short[][] aShortArrayArray8550;

	public void LA(int i, int i_0_, int i_1_) {
		if ((this.aByteArrayArray8545[i][i_0_] & 0xff) < i_1_)
			this.aByteArrayArray8545[i][i_0_] = (byte) i_1_;
	}

	public void SA() {
		if (this.anInt8543 > 0) {
			byte[][] is = (new byte[anInt6287 * -506105871 + 1][anInt6286 * -1148794921 + 1]);
			for (int i = 1; i < anInt6287 * -506105871; i++) {
				for (int i_10_ = 1; i_10_ < anInt6286 * -1148794921; i_10_++)
					is[i][i_10_] = (byte) (((this.aByteArrayArray8545[i - 1][i_10_]) >> 2) + ((this.aByteArrayArray8545[i + 1][i_10_]) >> 3) + ((this.aByteArrayArray8545[i][i_10_ - 1]) >> 2) + ((this.aByteArrayArray8545[i][i_10_ + 1]) >> 3) + ((this.aByteArrayArray8545[i][i_10_]) >> 1));
			}
			this.aClass298Array8534 = new Node[this.aClass440_8549.method5855(1429819619)];
			this.aClass440_8549.method5854(this.aClass298Array8534, 2105233647);
			for (int i = 0; i < this.aClass298Array8534.length; i++)
				((Class298_Sub5) this.aClass298Array8534[i]).method2859(this.anInt8543);
			int i = 24;
			if (this.anIntArrayArrayArray8533 != null)
				i += 4;
			if ((this.anInt8523 & 0x7) != 0)
				i += 12;
			NativeHeapBuffer nativeheapbuffer = this.aClass_ra_Sub2_8535.aNativeHeap8181.f(this.anInt8543 * i, false);
			Stream stream = new Stream(nativeheapbuffer);
			Class298_Sub5[] class298_sub5s = new Class298_Sub5[this.anInt8543];
			int i_11_ = StaticMethods.method5639((this.anInt8543 / 4));
			if (i_11_ < 1)
				i_11_ = 1;
			Class440 class440 = new Class440(i_11_);
			Class298_Sub5[] class298_sub5s_12_ = new Class298_Sub5[this.anInt8544];
			for (int i_13_ = 0; i_13_ < anInt6287 * -506105871; i_13_++) {
				for (int i_14_ = 0; i_14_ < anInt6286 * -1148794921; i_14_++) {
					if ((this.anIntArrayArrayArray8528[i_13_][i_14_]) != null) {
						Class298_Sub5[] class298_sub5s_15_ = (this.aClass298_Sub5ArrayArrayArray8527[i_13_][i_14_]);
						int[] is_16_ = (this.anIntArrayArrayArray8537[i_13_][i_14_]);
						int[] is_17_ = (this.anIntArrayArrayArray8531[i_13_][i_14_]);
						int[] is_18_ = (this.anIntArrayArrayArray8529[i_13_][i_14_]);
						int[] is_19_ = (this.anIntArrayArrayArray8528[i_13_][i_14_]);
						int[] is_20_ = ((this.anIntArrayArrayArray8532 != null) ? (this.anIntArrayArrayArray8532[i_13_][i_14_]) : null);
						int[] is_21_ = ((this.anIntArrayArrayArray8533 != null) ? (this.anIntArrayArrayArray8533[i_13_][i_14_]) : null);
						if (is_18_ == null)
							is_18_ = is_19_;
						float f = (this.aFloatArrayArray8530[i_13_][i_14_]);
						float f_22_ = (this.aFloatArrayArray8547[i_13_][i_14_]);
						float f_23_ = (this.aFloatArrayArray8548[i_13_][i_14_]);
						float f_24_ = (this.aFloatArrayArray8530[i_13_][i_14_ + 1]);
						float f_25_ = (this.aFloatArrayArray8547[i_13_][i_14_ + 1]);
						float f_26_ = (this.aFloatArrayArray8548[i_13_][i_14_ + 1]);
						float f_27_ = (this.aFloatArrayArray8530[i_13_ + 1][i_14_ + 1]);
						float f_28_ = (this.aFloatArrayArray8547[i_13_ + 1][i_14_ + 1]);
						float f_29_ = (this.aFloatArrayArray8548[i_13_ + 1][i_14_ + 1]);
						float f_30_ = (this.aFloatArrayArray8530[i_13_ + 1][i_14_]);
						float f_31_ = (this.aFloatArrayArray8547[i_13_ + 1][i_14_]);
						float f_32_ = (this.aFloatArrayArray8548[i_13_ + 1][i_14_]);
						int i_33_ = is[i_13_][i_14_] & 0xff;
						int i_34_ = is[i_13_][i_14_ + 1] & 0xff;
						int i_35_ = is[i_13_ + 1][i_14_ + 1] & 0xff;
						int i_36_ = is[i_13_ + 1][i_14_] & 0xff;
						int i_37_ = 0;
						while_114_: for (int i_38_ = 0; i_38_ < is_19_.length; i_38_++) {
							Class298_Sub5 class298_sub5 = class298_sub5s_15_[i_38_];
							for (int i_39_ = 0; i_39_ < i_37_; i_39_++) {
								if (class298_sub5s_12_[i_39_] == class298_sub5)
									continue while_114_;
							}
							class298_sub5s_12_[i_37_++] = class298_sub5;
						}
						short[] is_40_ = (this.aShortArrayArray8550[i_14_ * (anInt6287 * -506105871) + i_13_] = new short[is_19_.length]);
						for (int i_41_ = 0; i_41_ < is_19_.length; i_41_++) {
							int i_42_ = ((i_13_ << anInt6289 * -2137349879) + is_16_[i_41_]);
							int i_43_ = ((i_14_ << anInt6289 * -2137349879) + is_17_[i_41_]);
							int i_44_ = i_42_ >> this.anInt8520;
							int i_45_ = i_43_ >> this.anInt8520;
							int i_46_ = is_19_[i_41_];
							int i_47_ = is_18_[i_41_];
							int i_48_ = is_20_ != null ? is_20_[i_41_] : 0;
							long l = ((long) i_47_ << 48 | (long) i_46_ << 32 | (long) (i_44_ << 16) | (long) i_45_);
							int i_49_ = is_16_[i_41_];
							int i_50_ = is_17_[i_41_];
							int i_51_ = 74;
							int i_52_ = 0;
							float f_53_ = 1.0F;
							float f_54_;
							float f_55_;
							float f_56_;
							if (i_49_ == 0 && i_50_ == 0) {
								f_54_ = f;
								f_55_ = f_22_;
								f_56_ = f_23_;
								i_51_ -= i_33_;
							} else if (i_49_ == 0 && i_50_ == anInt6288 * -1212653763) {
								f_54_ = f_24_;
								f_55_ = f_25_;
								f_56_ = f_26_;
								i_51_ -= i_34_;
							} else if (i_49_ == anInt6288 * -1212653763 && i_50_ == anInt6288 * -1212653763) {
								f_54_ = f_27_;
								f_55_ = f_28_;
								f_56_ = f_29_;
								i_51_ -= i_35_;
							} else if (i_49_ == anInt6288 * -1212653763 && i_50_ == 0) {
								f_54_ = f_30_;
								f_55_ = f_31_;
								f_56_ = f_32_;
								i_51_ -= i_36_;
							} else {
								float f_57_ = ((float) i_49_ / (float) (anInt6288 * -1212653763));
								float f_58_ = ((float) i_50_ / (float) (anInt6288 * -1212653763));
								float f_59_ = f + (f_30_ - f) * f_57_;
								float f_60_ = f_22_ + (f_31_ - f_22_) * f_57_;
								float f_61_ = f_23_ + (f_32_ - f_23_) * f_57_;
								float f_62_ = f_24_ + (f_27_ - f_24_) * f_57_;
								float f_63_ = f_25_ + (f_28_ - f_25_) * f_57_;
								float f_64_ = f_26_ + (f_29_ - f_26_) * f_57_;
								f_54_ = f_59_ + (f_62_ - f_59_) * f_58_;
								f_55_ = f_60_ + (f_63_ - f_60_) * f_58_;
								f_56_ = f_61_ + (f_64_ - f_61_) * f_58_;
								int i_65_ = i_33_ + ((i_36_ - i_33_) * i_49_ >> anInt6289 * -2137349879);
								int i_66_ = i_34_ + ((i_35_ - i_34_) * i_49_ >> anInt6289 * -2137349879);
								i_51_ -= i_65_ + ((i_66_ - i_65_) * i_50_ >> anInt6289 * -2137349879);
							}
							if (i_46_ != -1) {
								int i_67_ = (i_46_ & 0x7f) * i_51_ >> 7;
								if (i_67_ < 2)
									i_67_ = 2;
								else if (i_67_ > 126)
									i_67_ = 126;
								i_52_ = (Class294.anIntArray3165[i_46_ & 0xff80 | i_67_]);
								if ((this.anInt8523 & 0x7) == 0) {
									f_53_ = ((this.aClass_ra_Sub2_8535.aFloatArray8124[0]) * f_54_ + (this.aClass_ra_Sub2_8535.aFloatArray8124[1]) * f_55_ + (this.aClass_ra_Sub2_8535.aFloatArray8124[2]) * f_56_);
									f_53_ = (this.aClass_ra_Sub2_8535.aFloat8130 + (f_53_ * (f_53_ > 0.0F ? (this.aClass_ra_Sub2_8535.aFloat8131) : (this.aClass_ra_Sub2_8535.aFloat8132))));
								}
							}
							Node class298 = null;
							if (((i_42_ & this.anInt8521 - 1) == 0) && ((i_43_ & this.anInt8521 - 1) == 0))
								class298 = class440.method5852(l);
							int i_68_;
							if (class298 == null) {
								int i_69_;
								if (i_47_ != i_46_) {
									int i_70_ = (i_47_ & 0x7f) * i_51_ >> 7;
									if (i_70_ < 2)
										i_70_ = 2;
									else if (i_70_ > 126)
										i_70_ = 126;
									i_69_ = (Class294.anIntArray3165[i_47_ & 0xff80 | i_70_]);
									if ((this.anInt8523 & 0x7) == 0) {
										float f_71_ = ((this.aClass_ra_Sub2_8535.aFloatArray8124[0]) * f_54_ + (this.aClass_ra_Sub2_8535.aFloatArray8124[1]) * f_55_ + ((this.aClass_ra_Sub2_8535.aFloatArray8124[2]) * f_56_));
										f_71_ = ((this.aClass_ra_Sub2_8535.aFloat8130) + (f_53_ * (f_53_ > 0.0F ? (this.aClass_ra_Sub2_8535.aFloat8131) : (this.aClass_ra_Sub2_8535.aFloat8132))));
										int i_72_ = i_69_ >> 16 & 0xff;
										int i_73_ = i_69_ >> 8 & 0xff;
										int i_74_ = i_69_ & 0xff;
										i_72_ *= f_71_;
										if (i_72_ < 0)
											i_72_ = 0;
										else if (i_72_ > 255)
											i_72_ = 255;
										i_73_ *= f_71_;
										if (i_73_ < 0)
											i_73_ = 0;
										else if (i_73_ > 255)
											i_73_ = 255;
										i_74_ *= f_71_;
										if (i_74_ < 0)
											i_74_ = 0;
										else if (i_74_ > 255)
											i_74_ = 255;
										i_69_ = i_72_ << 16 | i_73_ << 8 | i_74_;
									}
								} else
									i_69_ = i_52_;
								if (this.aClass_ra_Sub2_8535.aBoolean8143) {
									stream.d((float) i_42_);
									stream.d((float) (method6340(i_42_, i_43_) + i_48_));
									stream.d((float) i_43_);
									stream.p((byte) (i_69_ >> 16));
									stream.p((byte) (i_69_ >> 8));
									stream.p((byte) i_69_);
									stream.p(-1);
									stream.d((float) i_42_);
									stream.d((float) i_43_);
									if ((this.anIntArrayArrayArray8533) != null)
										stream.d(is_21_ != null ? (float) (is_21_[i_41_] - 1) : 0.0F);
									if ((this.anInt8523 & 0x7) != 0) {
										stream.d(f_54_);
										stream.d(f_55_);
										stream.d(f_56_);
									}
								} else {
									stream.u((float) i_42_);
									stream.u((float) (method6340(i_42_, i_43_) + i_48_));
									stream.u((float) i_43_);
									stream.p((byte) (i_69_ >> 16));
									stream.p((byte) (i_69_ >> 8));
									stream.p((byte) i_69_);
									stream.p(-1);
									stream.u((float) i_42_);
									stream.u((float) i_43_);
									if ((this.anIntArrayArrayArray8533) != null)
										stream.u(is_21_ != null ? (float) (is_21_[i_41_] - 1) : 0.0F);
									if ((this.anInt8523 & 0x7) != 0) {
										stream.u(f_54_);
										stream.u(f_55_);
										stream.u(f_56_);
									}
								}
								i_68_ = this.anInt8526++;
								is_40_[i_41_] = (short) i_68_;
								if (i_46_ != -1)
									class298_sub5s[i_68_] = class298_sub5s_15_[i_41_];
								class440.method5858(new Class298_Sub20(is_40_[i_41_]), l);
							} else {
								is_40_[i_41_] = ((Class298_Sub20) class298).aShort7314;
								i_68_ = is_40_[i_41_] & 0xffff;
								if (i_46_ != -1 && ((class298_sub5s_15_[i_41_].key * 7051297995265073167L) < (class298_sub5s[i_68_].key * 7051297995265073167L)))
									class298_sub5s[i_68_] = class298_sub5s_15_[i_41_];
							}
							for (int i_75_ = 0; i_75_ < i_37_; i_75_++)
								class298_sub5s_12_[i_75_].method2857(i_68_, i_52_, i_51_, f_53_);
							this.anInt8525++;
						}
					}
				}
			}
			for (int i_76_ = 0; i_76_ < this.anInt8526; i_76_++) {
				Class298_Sub5 class298_sub5 = class298_sub5s[i_76_];
				if (class298_sub5 != null)
					class298_sub5.method2858(i_76_);
			}
			for (int i_77_ = 0; i_77_ < anInt6287 * -506105871; i_77_++) {
				for (int i_78_ = 0; i_78_ < anInt6286 * -1148794921; i_78_++) {
					short[] is_79_ = (this.aShortArrayArray8550[i_78_ * (anInt6287 * -506105871) + i_77_]);
					if (is_79_ != null) {
						int i_80_ = 0;
						int i_81_ = 0;
						while (i_81_ < is_79_.length) {
							int i_82_ = is_79_[i_81_++] & 0xffff;
							int i_83_ = is_79_[i_81_++] & 0xffff;
							int i_84_ = is_79_[i_81_++] & 0xffff;
							Class298_Sub5 class298_sub5 = class298_sub5s[i_82_];
							Class298_Sub5 class298_sub5_85_ = class298_sub5s[i_83_];
							Class298_Sub5 class298_sub5_86_ = class298_sub5s[i_84_];
							Class298_Sub5 class298_sub5_87_ = null;
							if (class298_sub5 != null) {
								class298_sub5.method2856(i_77_, i_78_, i_80_);
								class298_sub5_87_ = class298_sub5;
							}
							if (class298_sub5_85_ != null) {
								class298_sub5_85_.method2856(i_77_, i_78_, i_80_);
								if (class298_sub5_87_ == null || ((class298_sub5_85_.key * 7051297995265073167L) < (class298_sub5_87_.key * 7051297995265073167L)))
									class298_sub5_87_ = class298_sub5_85_;
							}
							if (class298_sub5_86_ != null) {
								class298_sub5_86_.method2856(i_77_, i_78_, i_80_);
								if (class298_sub5_87_ == null || ((class298_sub5_86_.key * 7051297995265073167L) < (class298_sub5_87_.key * 7051297995265073167L)))
									class298_sub5_87_ = class298_sub5_86_;
							}
							if (class298_sub5_87_ != null) {
								if (class298_sub5 != null)
									class298_sub5_87_.method2858(i_82_);
								if (class298_sub5_85_ != null)
									class298_sub5_87_.method2858(i_83_);
								if (class298_sub5_86_ != null)
									class298_sub5_87_.method2858(i_84_);
								class298_sub5_87_.method2856(i_77_, i_78_, i_80_);
							}
							i_80_++;
						}
					}
				}
			}
			stream.x();
			this.anInterface1_8538 = this.aClass_ra_Sub2_8535.method5245(i, nativeheapbuffer, stream.f(), false);
			if (this.anInterface1_8538 instanceof Class40_Sub2)
				nativeheapbuffer.t();
			this.aClass32_8539 = new Class32(this.anInterface1_8538, 5126, 3, 0);
			this.aClass32_8540 = new Class32(this.anInterface1_8538, 5121, 4, 12);
			int i_88_;
			if (this.anIntArrayArrayArray8533 != null) {
				this.aClass32_8517 = new Class32(this.anInterface1_8538, 5126, 3, 16);
				i_88_ = 28;
			} else {
				this.aClass32_8517 = new Class32(this.anInterface1_8538, 5126, 2, 16);
				i_88_ = 24;
			}
			if ((this.anInt8523 & 0x7) != 0)
				this.aClass32_8519 = new Class32(this.anInterface1_8538, 5126, 3, i_88_);
			long[] ls = new long[this.aClass298Array8534.length];
			for (int i_89_ = 0; i_89_ < this.aClass298Array8534.length; i_89_++) {
				Class298_Sub5 class298_sub5 = ((Class298_Sub5) this.aClass298Array8534[i_89_]);
				ls[i_89_] = class298_sub5.key * 7051297995265073167L;
				class298_sub5.method2860(this.anInt8526);
			}
			Class365_Sub1_Sub3_Sub1.method4507(ls, (this.aClass298Array8534), (byte) -115);
			if (this.aClass44_8541 != null)
				this.aClass44_8541.method489();
		} else
			this.aClass44_8541 = null;
		if ((this.anInt8522 & 0x2) == 0) {
			this.anIntArrayArrayArray8531 = null;
			this.anIntArrayArrayArray8537 = null;
			this.anIntArrayArrayArray8528 = null;
		}
		this.anIntArrayArrayArray8533 = null;
		this.anIntArrayArrayArray8529 = null;
		this.anIntArrayArrayArray8532 = null;
		this.aClass298_Sub5ArrayArrayArray8527 = null;
		this.aByteArrayArray8545 = null;
		this.aClass440_8549 = null;
		this.aFloatArrayArray8548 = null;
		this.aFloatArrayArray8547 = null;
		this.aFloatArrayArray8530 = null;
	}

	void method6374(int i, int i_105_, int i_106_, boolean[][] bools, boolean bool, int i_107_) {
		if (this.aClass298Array8534 != null) {
			int i_108_ = i_106_ + i_106_ + 1;
			i_108_ *= i_108_;
			if ((this.aClass_ra_Sub2_8535.anIntArray8200).length < i_108_)
				this.aClass_ra_Sub2_8535.anIntArray8200 = new int[i_108_];
			if ((this.aClass_ra_Sub2_8535.aClass298_Sub53_Sub1_8197.buffer).length < this.anInt8525 * 2)
				this.aClass_ra_Sub2_8535.aClass298_Sub53_Sub1_8197 = new RsFloatBuffer(this.anInt8525 * 2);
			int i_109_ = i - i_106_;
			int i_110_ = i_109_;
			if (i_109_ < 0)
				i_109_ = 0;
			int i_111_ = i_105_ - i_106_;
			int i_112_ = i_111_;
			if (i_111_ < 0)
				i_111_ = 0;
			int i_113_ = i + i_106_;
			if (i_113_ > anInt6287 * -506105871 - 1)
				i_113_ = anInt6287 * -506105871 - 1;
			int i_114_ = i_105_ + i_106_;
			if (i_114_ > anInt6286 * -1148794921 - 1)
				i_114_ = anInt6286 * -1148794921 - 1;
			int i_115_ = 0;
			int[] is = (this.aClass_ra_Sub2_8535.anIntArray8200);
			for (int i_116_ = i_109_; i_116_ <= i_113_; i_116_++) {
				boolean[] bools_117_ = bools[i_116_ - i_110_];
				for (int i_118_ = i_111_; i_118_ <= i_114_; i_118_++) {
					if (bools_117_[i_118_ - i_112_])
						is[i_115_++] = i_118_ * (anInt6287 * -506105871) + i_116_;
				}
			}
			this.aClass_ra_Sub2_8535.method5252();
			this.aClass_ra_Sub2_8535.method5262((this.anInt8523 & 0x7) != 0);
			for (int i_119_ = 0; i_119_ < this.aClass298Array8534.length - 0; i_119_++)
				((Class298_Sub5) this.aClass298Array8534[i_119_]).method2861(is, i_115_);
			if (!this.aClass458_8536.method5970((byte) 115)) {
				int i_120_ = (this.aClass_ra_Sub2_8535.anInt8139);
				int i_121_ = (this.aClass_ra_Sub2_8535.anInt8007);
				this.aClass_ra_Sub2_8535.drawFog(0, i_121_, this.aClass_ra_Sub2_8535.anInt8195);
				this.aClass_ra_Sub2_8535.method5262(false);
				this.aClass_ra_Sub2_8535.method5281(false);
				this.aClass_ra_Sub2_8535.method5266(128);
				this.aClass_ra_Sub2_8535.method5275(-2);
				this.aClass_ra_Sub2_8535.method5256(this.aClass_ra_Sub2_8535.aClass30_Sub2_8140);
				this.aClass_ra_Sub2_8535.method5258(8448, 7681);
				this.aClass_ra_Sub2_8535.method5259(0, 34166, 770);
				this.aClass_ra_Sub2_8535.method5286(0, 34167, 770);
				for (Node class298 = this.aClass458_8536.head(); class298 != null; class298 = this.aClass458_8536.next()) {
					Class298_Sub3 class298_sub3 = (Class298_Sub3) class298;
					class298_sub3.method2852(i, i_105_, i_106_, bools);
				}
				this.aClass_ra_Sub2_8535.method5259(0, 5890, 768);
				this.aClass_ra_Sub2_8535.method5286(0, 5890, 770);
				this.aClass_ra_Sub2_8535.method5256(null);
				this.aClass_ra_Sub2_8535.drawFog(i_120_, i_121_, this.aClass_ra_Sub2_8535.anInt8195);
			}
			if (this.aClass44_8541 != null) {
				OpenGL.glPushMatrix();
				OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
				this.aClass_ra_Sub2_8535.method5248(this.aClass32_8539, null, null, this.aClass32_8517);
				this.aClass44_8541.method490(i, i_105_, i_106_, bools, bool);
				OpenGL.glPopMatrix();
			}
		}
	}

	public void method6339(int i, int i_122_, int i_123_, int i_124_, int i_125_, int i_126_, int i_127_, boolean[][] bools) {
		GraphicsContext class52 = this.aClass_ra_Sub2_8535.getFrameContext();
		if (this.anInt8543 > 0 && class52 != null) {
			this.aClass_ra_Sub2_8535.method5291();
			this.aClass_ra_Sub2_8535.method5226(false);
			this.aClass_ra_Sub2_8535.method5262(false);
			this.aClass_ra_Sub2_8535.method5264(false);
			this.aClass_ra_Sub2_8535.method5281(false);
			this.aClass_ra_Sub2_8535.method5266(0);
			this.aClass_ra_Sub2_8535.method5275(-2);
			this.aClass_ra_Sub2_8535.method5256(null);
			aFloatArray8524[0] = (float) i_123_ / (128.0F * (float) (anInt6288 * -1212653763) * (float) class52.getWidth());
			aFloatArray8524[1] = 0.0F;
			aFloatArray8524[2] = 0.0F;
			aFloatArray8524[3] = 0.0F;
			aFloatArray8524[4] = 0.0F;
			aFloatArray8524[5] = (float) i_123_ / (128.0F * (float) (anInt6288 * -1212653763) * (float) class52.getHeight());
			aFloatArray8524[6] = 0.0F;
			aFloatArray8524[7] = 0.0F;
			aFloatArray8524[8] = 0.0F;
			aFloatArray8524[9] = 0.0F;
			aFloatArray8524[10] = 0.0F;
			aFloatArray8524[11] = 0.0F;
			aFloatArray8524[12] = -1.0F - ((float) (i_124_ * i_123_) / 128.0F - (float) (i * 2)) / (float) class52.getWidth();
			aFloatArray8524[13] = 1.0F - (((float) (2 * i_122_) + (float) (i_127_ * i_123_) / 128.0F) / (float) class52.getHeight());
			aFloatArray8524[14] = 0.0F;
			aFloatArray8524[15] = 1.0F;
			OpenGL.glMatrixMode(5889);
			OpenGL.glLoadMatrixf(aFloatArray8524, 0);
			aFloatArray8524[0] = 1.0F;
			aFloatArray8524[1] = 0.0F;
			aFloatArray8524[2] = 0.0F;
			aFloatArray8524[3] = 0.0F;
			aFloatArray8524[4] = 0.0F;
			aFloatArray8524[5] = 0.0F;
			aFloatArray8524[6] = 1.0F;
			aFloatArray8524[7] = 0.0F;
			aFloatArray8524[8] = 0.0F;
			aFloatArray8524[9] = 1.0F;
			aFloatArray8524[10] = 0.0F;
			aFloatArray8524[11] = 0.0F;
			aFloatArray8524[12] = 0.0F;
			aFloatArray8524[13] = 0.0F;
			aFloatArray8524[14] = 0.0F;
			aFloatArray8524[15] = 1.0F;
			OpenGL.glMatrixMode(5888);
			OpenGL.glLoadMatrixf(aFloatArray8524, 0);
			if ((this.anInt8523 & 0x7) != 0) {
				this.aClass_ra_Sub2_8535.method5262(true);
				this.aClass_ra_Sub2_8535.method5279();
			} else
				this.aClass_ra_Sub2_8535.method5262(false);
			this.aClass_ra_Sub2_8535.method5248(this.aClass32_8539, this.aClass32_8519, this.aClass32_8540, this.aClass32_8517);
			if ((this.aClass_ra_Sub2_8535.aClass298_Sub53_Sub1_8197.buffer).length < this.anInt8525 * 2)
				this.aClass_ra_Sub2_8535.aClass298_Sub53_Sub1_8197 = new RsFloatBuffer(this.anInt8525 * 2);
			else
				this.aClass_ra_Sub2_8535.aClass298_Sub53_Sub1_8197.offset = 0;
			int i_128_ = 0;
			RsFloatBuffer class298_sub53_sub1 = (this.aClass_ra_Sub2_8535.aClass298_Sub53_Sub1_8197);
			if (this.aClass_ra_Sub2_8535.aBoolean8143) {
				for (int i_129_ = i_125_; i_129_ < i_127_; i_129_++) {
					int i_130_ = i_129_ * (anInt6287 * -506105871) + i_124_;
					for (int i_131_ = i_124_; i_131_ < i_126_; i_131_++) {
						if (bools[i_131_ - i_124_][i_129_ - i_125_]) {
							short[] is = (this.aShortArrayArray8550[i_130_]);
							if (is != null) {
								for (int i_132_ = 0; i_132_ < is.length; i_132_++) {
									class298_sub53_sub1.writeShort((is[i_132_] & 0xffff));
									i_128_++;
								}
							}
						}
						i_130_++;
					}
				}
			} else {
				for (int i_133_ = i_125_; i_133_ < i_127_; i_133_++) {
					int i_134_ = i_133_ * (anInt6287 * -506105871) + i_124_;
					for (int i_135_ = i_124_; i_135_ < i_126_; i_135_++) {
						if (bools[i_135_ - i_124_][i_133_ - i_125_]) {
							short[] is = (this.aShortArrayArray8550[i_134_]);
							if (is != null) {
								for (int i_136_ = 0; i_136_ < is.length; i_136_++) {
									class298_sub53_sub1.method3587((is[i_136_] & 0xffff));
									i_128_++;
								}
							}
						}
						i_134_++;
					}
				}
			}
			if (i_128_ > 0) {
				Class46_Sub1 class46_sub1 = new Class46_Sub1((this.aClass_ra_Sub2_8535), 5123, class298_sub53_sub1.buffer, (class298_sub53_sub1.offset * 385051775));
				this.aClass_ra_Sub2_8535.method5254(class46_sub1, 4, 0, i_128_);
			}
		}
	}

	public Class_na w(int i, int i_137_, Class_na class_na) {
		if ((this.aByteArrayArray8546[i][i_137_] & 0x1) == 0)
			return null;
		int i_138_ = (anInt6288 * -1212653763 >> (this.aClass_ra_Sub2_8535.anInt8064));
		Class_na_Sub1 class_na_sub1 = (Class_na_Sub1) class_na;
		Class_na_Sub1 class_na_sub1_139_;
		if (class_na_sub1 != null && class_na_sub1.method3481(i_138_, i_138_)) {
			class_na_sub1_139_ = class_na_sub1;
			class_na_sub1_139_.method3482();
		} else
			class_na_sub1_139_ = new Class_na_Sub1(this.aClass_ra_Sub2_8535, i_138_, i_138_);
		class_na_sub1_139_.method3485(0, 0, i_138_, i_138_);
		method6375(class_na_sub1_139_, i, i_137_);
		return class_na_sub1_139_;
	}

	void method6375(Class_na_Sub1 class_na_sub1, int i, int i_140_) {
		int[] is = this.anIntArrayArrayArray8537[i][i_140_];
		int[] is_141_ = this.anIntArrayArrayArray8531[i][i_140_];
		int i_142_ = is.length;
		if ((this.aClass_ra_Sub2_8535.anIntArray8198).length < i_142_) {
			this.aClass_ra_Sub2_8535.anIntArray8198 = new int[i_142_];
			this.aClass_ra_Sub2_8535.anIntArray8199 = new int[i_142_];
		}
		int[] is_143_ = (this.aClass_ra_Sub2_8535.anIntArray8198);
		int[] is_144_ = (this.aClass_ra_Sub2_8535.anIntArray8199);
		for (int i_145_ = 0; i_145_ < i_142_; i_145_++) {
			is_143_[i_145_] = is[i_145_] >> (this.aClass_ra_Sub2_8535.anInt8064);
			is_144_[i_145_] = is_141_[i_145_] >> (this.aClass_ra_Sub2_8535.anInt8064);
		}
		int i_146_ = 0;
		while (i_146_ < i_142_) {
			int i_147_ = is_143_[i_146_];
			int i_148_ = is_144_[i_146_++];
			int i_149_ = is_143_[i_146_];
			int i_150_ = is_144_[i_146_++];
			int i_151_ = is_143_[i_146_];
			int i_152_ = is_144_[i_146_++];
			if (((i_147_ - i_149_) * (i_150_ - i_152_) - (i_150_ - i_148_) * (i_151_ - i_149_)) > 0)
				class_na_sub1.method3483(i_148_, i_150_, i_152_, i_147_, i_149_, i_151_);
		}
	}

	public void method6338(int i, int i_153_, int i_154_, boolean[][] bools, boolean bool, int i_155_) {
		method6374(i, i_153_, i_154_, bools, bool, i_155_);
	}

	public void method6335(int i, int i_156_, int[] is, int[] is_157_, int[] is_158_, int[] is_159_, int[] is_160_, int[] is_161_, int[] is_162_, int[] is_163_, Class78 class78, boolean bool) {
		MaterialRawLoader interface_ma = this.aClass_ra_Sub2_8535.textures;
		if (is_159_ != null && this.anIntArrayArrayArray8533 == null)
			this.anIntArrayArrayArray8533 = new int[anInt6287 * -506105871][anInt6286 * -1148794921][];
		if (is_157_ != null && this.anIntArrayArrayArray8532 == null)
			this.anIntArrayArrayArray8532 = new int[anInt6287 * -506105871][anInt6286 * -1148794921][];
		this.anIntArrayArrayArray8537[i][i_156_] = is;
		this.anIntArrayArrayArray8531[i][i_156_] = is_158_;
		this.anIntArrayArrayArray8528[i][i_156_] = is_160_;
		this.anIntArrayArrayArray8529[i][i_156_] = is_161_;
		if (this.anIntArrayArrayArray8533 != null)
			this.anIntArrayArrayArray8533[i][i_156_] = is_159_;
		if (this.anIntArrayArrayArray8532 != null)
			this.anIntArrayArrayArray8532[i][i_156_] = is_157_;
		Class298_Sub5[] class298_sub5s = (this.aClass298_Sub5ArrayArrayArray8527[i][i_156_] = new Class298_Sub5[is_160_.length]);
		for (int i_164_ = 0; i_164_ < is_160_.length; i_164_++) {
			int i_165_ = is_162_[i_164_];
			int i_166_ = is_163_[i_164_];
			if ((this.anInt8523 & 0x20) != 0 && i_165_ != -1 && interface_ma.method174(i_165_).aBoolean524) {
				i_166_ = 128;
				i_165_ = -1;
			}
			long l = ((long) (class78.anInt727 * -1475891183) << 48 | (long) (class78.anInt725 * 1996750669) << 42 | (long) (class78.anInt726 * -1212608691) << 28 | (long) (i_166_ << 14) | (long) i_165_);
			Node class298;
			for (class298 = this.aClass440_8549.method5852(l); class298 != null; class298 = this.aClass440_8549.method5853(-1829773748)) {
				Class298_Sub5 class298_sub5 = (Class298_Sub5) class298;
				if (class298_sub5.anInt7199 == i_165_ && (class298_sub5.aFloat7196 == (float) i_166_) && class298_sub5.aClass78_7198.method843(class78, (byte) -48))
					break;
			}
			if (class298 == null) {
				class298_sub5s[i_164_] = new Class298_Sub5(this, i_165_, i_166_, class78);
				this.aClass440_8549.method5858(class298_sub5s[i_164_], l);
			} else
				class298_sub5s[i_164_] = (Class298_Sub5) class298;
		}
		if (bool)
			this.aByteArrayArray8546[i][i_156_] |= 0x1;
		if (is_160_.length > this.anInt8544)
			this.anInt8544 = is_160_.length;
		this.anInt8543 += is_160_.length;
	}

	public void NA(Class_na class_na, int i, int i_167_, int i_168_, int i_169_, boolean bool) {
		if (this.aClass44_8541 != null && class_na != null) {
			int i_170_ = (i - (i_167_ * (this.aClass_ra_Sub2_8535.anInt8066) >> 8) >> this.aClass_ra_Sub2_8535.anInt8064);
			int i_171_ = (i_168_ - (i_167_ * (this.aClass_ra_Sub2_8535.anInt8026) >> 8) >> this.aClass_ra_Sub2_8535.anInt8064);
			this.aClass44_8541.method491(class_na, i_170_, i_171_);
		}
	}

	public void method6342(Light light, int[] is) {
		this.aClass458_8536.pushBack(new Class298_Sub3(this.aClass_ra_Sub2_8535, this, light, is));
	}

	public boolean method6353(Class_na class_na, int i, int i_386_, int i_387_, int i_388_, boolean bool) {
		if (this.aClass44_8541 == null || class_na == null)
			return false;
		int i_389_ = (i - (i_386_ * this.aClass_ra_Sub2_8535.anInt8066 >> 8) >> (this.aClass_ra_Sub2_8535.anInt8064));
		int i_390_ = (i_387_ - (i_386_ * (this.aClass_ra_Sub2_8535.anInt8026) >> 8) >> (this.aClass_ra_Sub2_8535.anInt8064));
		return this.aClass44_8541.method492(class_na, i_389_, i_390_);
	}

	Class_xa_Sub3(OpenGLGraphicsToolkit toolkit, int i, int i_434_, int i_435_, int i_436_, int[][] is, int[][] is_437_, int i_438_) {
		super(i_435_, i_436_, i_438_, is);
		this.aClass_ra_Sub2_8535 = toolkit;
		this.anInt8520 = anInt6289 * -2137349879 - 2;
		this.anInt8521 = 1 << this.anInt8520;
		this.anInt8522 = i;
		this.anInt8523 = i_434_;
		this.anIntArrayArrayArray8532 = new int[i_435_][i_436_][];
		this.aClass298_Sub5ArrayArrayArray8527 = new Class298_Sub5[i_435_][i_436_][];
		this.anIntArrayArrayArray8537 = new int[i_435_][i_436_][];
		this.anIntArrayArrayArray8531 = new int[i_435_][i_436_][];
		this.anIntArrayArrayArray8528 = new int[i_435_][i_436_][];
		this.anIntArrayArrayArray8529 = new int[i_435_][i_436_][];
		this.aShortArrayArray8550 = new short[i_435_ * i_436_][];
		this.aByteArrayArray8546 = new byte[i_435_][i_436_];
		this.aByteArrayArray8545 = new byte[i_435_ + 1][i_436_ + 1];
		this.aFloatArrayArray8530 = (new float[anInt6287 * -506105871 + 1][anInt6286 * -1148794921 + 1]);
		this.aFloatArrayArray8547 = (new float[anInt6287 * -506105871 + 1][anInt6286 * -1148794921 + 1]);
		this.aFloatArrayArray8548 = (new float[anInt6287 * -506105871 + 1][anInt6286 * -1148794921 + 1]);
		for (int i_439_ = 1; i_439_ < anInt6286 * -1148794921; i_439_++) {
			for (int i_440_ = 1; i_440_ < anInt6287 * -506105871; i_440_++) {
				int i_441_ = (is_437_[i_440_ + 1][i_439_] - is_437_[i_440_ - 1][i_439_]);
				int i_442_ = (is_437_[i_440_][i_439_ + 1] - is_437_[i_440_][i_439_ - 1]);
				float f = (float) (1.0 / Math.sqrt((double) (i_441_ * i_441_ + 4 * i_438_ * i_438_ + i_442_ * i_442_)));
				this.aFloatArrayArray8530[i_440_][i_439_] = (float) i_441_ * f;
				this.aFloatArrayArray8547[i_440_][i_439_] = (float) (-i_438_ * 2) * f;
				this.aFloatArrayArray8548[i_440_][i_439_] = (float) i_442_ * f;
			}
		}
		this.aClass440_8549 = new Class440(128);
		if ((this.anInt8523 & 0x10) != 0)
			this.aClass44_8541 = new Class44(this.aClass_ra_Sub2_8535, this);
	}

	public void method6336(int i, int i_458_, int[] is, int[] is_459_, int[] is_460_, int[] is_461_, int[] is_462_, int[] is_463_, int[] is_464_, int[] is_465_, int[] is_466_, int[] is_467_, int[] is_468_, Class78 class78, boolean bool) {
		int i_469_ = is_465_.length;
		int[] is_470_ = new int[i_469_ * 3];
		int[] is_471_ = new int[i_469_ * 3];
		int[] is_472_ = new int[i_469_ * 3];
		int[] is_473_ = is_466_ != null ? new int[i_469_ * 3] : null;
		int[] is_474_ = new int[i_469_ * 3];
		int[] is_475_ = new int[i_469_ * 3];
		int[] is_476_ = is_459_ != null ? new int[i_469_ * 3] : null;
		int[] is_477_ = is_461_ != null ? new int[i_469_ * 3] : null;
		int i_478_ = 0;
		for (int i_479_ = 0; i_479_ < i_469_; i_479_++) {
			int i_480_ = is_462_[i_479_];
			int i_481_ = is_463_[i_479_];
			int i_482_ = is_464_[i_479_];
			is_470_[i_478_] = is[i_480_];
			is_471_[i_478_] = is_460_[i_480_];
			is_472_[i_478_] = is_465_[i_479_];
			is_474_[i_478_] = is_467_[i_479_];
			is_475_[i_478_] = is_468_[i_479_];
			if (is_466_ != null)
				is_473_[i_478_] = is_466_[i_479_];
			if (is_459_ != null)
				is_476_[i_478_] = is_459_[i_480_];
			if (is_461_ != null)
				is_477_[i_478_] = is_461_[i_480_];
			i_478_++;
			is_470_[i_478_] = is[i_481_];
			is_471_[i_478_] = is_460_[i_481_];
			is_472_[i_478_] = is_465_[i_479_];
			is_474_[i_478_] = is_467_[i_479_];
			is_475_[i_478_] = is_468_[i_479_];
			if (is_466_ != null)
				is_473_[i_478_] = is_466_[i_479_];
			if (is_459_ != null)
				is_476_[i_478_] = is_459_[i_481_];
			if (is_461_ != null)
				is_477_[i_478_] = is_461_[i_481_];
			i_478_++;
			is_470_[i_478_] = is[i_482_];
			is_471_[i_478_] = is_460_[i_482_];
			is_472_[i_478_] = is_465_[i_479_];
			is_474_[i_478_] = is_467_[i_479_];
			is_475_[i_478_] = is_468_[i_479_];
			if (is_466_ != null)
				is_473_[i_478_] = is_466_[i_479_];
			if (is_459_ != null)
				is_476_[i_478_] = is_459_[i_482_];
			if (is_461_ != null)
				is_477_[i_478_] = is_461_[i_482_];
			i_478_++;
		}
		method6335(i, i_458_, is_470_, is_476_, is_471_, is_477_, is_472_, is_473_, is_474_, is_475_, class78, bool);
	}

	public void UA(Class_na class_na, int i, int i_493_, int i_494_, int i_495_, boolean bool) {
		if (this.aClass44_8541 != null && class_na != null) {
			int i_496_ = (i - (i_493_ * (this.aClass_ra_Sub2_8535.anInt8066) >> 8) >> this.aClass_ra_Sub2_8535.anInt8064);
			int i_497_ = (i_494_ - (i_493_ * (this.aClass_ra_Sub2_8535.anInt8026) >> 8) >> this.aClass_ra_Sub2_8535.anInt8064);
			this.aClass44_8541.method496(class_na, i_496_, i_497_);
		}
	}
}
