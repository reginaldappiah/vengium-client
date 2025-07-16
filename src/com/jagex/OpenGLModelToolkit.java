package com.jagex;/* OpenGLModelToolkit - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.definition.animation.AnimationFrameBase;
import com.jagex.maths.Matrix43f;
import com.jagex.maths.Matrix4f;
import jaclib.memory.Stream;
import jaggl.OpenGL;

public class OpenGLModelToolkit extends ModelToolkit {
	static boolean aBoolean7817;
	static int anInt7818 = 7;
	static int anInt7819 = 1;
	Interface2 anInterface2_7820;
	static int anInt7821 = 4;
	static int anInt7822 = 8;
	static int anInt7823 = 16;
	OpenGLGraphicsToolkit openGLGraphicsToolkit;
	EmissiveTriangle[] aEmissiveTriangleArray7825;
	int anInt7826;
	byte aByte7827;
	short aShort7828;
	short[] aShortArray7829;
	short[] aShortArray7830;
	Class32 aClass32_7831;
	int anInt7832;
	int anInt7833;
	int[] anIntArray7834;
	int[] anIntArray7835;
	int[] anIntArray7836;
	int[][] anIntArrayArray7837;
	short[] aShortArray7838;
	int anInt7839;
	boolean aBoolean7840 = false;
	short[] aShortArray7841;
	short[] aShortArray7842;
	boolean aBoolean7843;
	Class67 aClass67_7844;
	float[] aFloatArray7845;
	float[] aFloatArray7846;
	int anInt7847;
	static int[] anIntArray7848;
	short[] aShortArray7849;
	byte[] aByteArray7850;
	short[] aShortArray7851;
	short[] aShortArray7852;
	short[] aShortArray7853;
	int[] anIntArray7854;
	int[][] anIntArrayArray7855;
	short[] aShortArray7856;
	EffectiveVertex[] aEffectiveVertexArray7857;
	Class32 aClass32_7858;
	int[] anIntArray7859;
	Class32 aClass32_7860;
	short[] aShortArray7861;
	boolean aBoolean7862 = false;
	int modelMask;
	boolean aBoolean7864;
	int anInt7865;
	static int anInt7866;
	static int[] anIntArray7867;
	short aShort7868;
	short aShort7869;
	short aShort7870;
	short aShort7871;
	short aShort7872;
	Interface1 anInterface1_7873;
	short aShort7874;
	Class36[] aClass36Array7875;
	short aShort7876;
	int anInt7877;
	static int anInt7878 = 2;
	Class41 aClass41_7879;
	Class54[] aClass54Array7880;
	static int anInt7881 = 4;
	int[][] anIntArrayArray7882;
	static long[] aLongArray7883;
	static float[] aFloatArray7884 = new float[2];
	int anInt7885;
	static int[] anIntArray7886;
	byte[] aByteArray7887;
	static int anInt7888;
	Class32 aClass32_7889;
	static int anInt7890;
	int anInt7891;

	public void pa(int i, int i_0_, FloorToolkit class_xa, FloorToolkit class_xa_1_, int i_2_, int i_3_, int i_4_) {
		if (!this.aBoolean7843)
			method4831();
		int i_5_ = i_2_ + this.aShort7870;
		int i_6_ = i_2_ + this.aShort7871;
		int i_7_ = i_4_ + this.aShort7872;
		int i_8_ = i_4_ + this.aShort7876;
		if (i != 1 && i != 2 && i != 3 && i != 5 || (i_5_ >= 0 && ((i_6_ + class_xa.anInt6288 * -1212653763 >> class_xa.anInt6289 * -2137349879) < class_xa.anInt6287 * -506105871) && i_7_ >= 0 && ((i_8_ + class_xa.anInt6288 * -1212653763 >> class_xa.anInt6289 * -2137349879) < class_xa.anInt6286 * -1148794921))) {
			if (i == 4 || i == 5) {
				if (class_xa_1_ == null || (i_5_ < 0 || ((i_6_ + class_xa_1_.anInt6288 * -1212653763 >> class_xa_1_.anInt6289 * -2137349879) >= class_xa_1_.anInt6287 * -506105871) || i_7_ < 0 || ((i_8_ + class_xa_1_.anInt6288 * -1212653763 >> class_xa_1_.anInt6289 * -2137349879) >= class_xa_1_.anInt6286 * -1148794921)))
					return;
			} else {
				i_5_ >>= class_xa.anInt6289 * -2137349879;
				i_6_ = (i_6_ + (class_xa.anInt6288 * -1212653763 - 1) >> class_xa.anInt6289 * -2137349879);
				i_7_ >>= class_xa.anInt6289 * -2137349879;
				i_8_ = (i_8_ + (class_xa.anInt6288 * -1212653763 - 1) >> class_xa.anInt6289 * -2137349879);
				if (class_xa.method6341(i_5_, i_7_) == i_3_ && class_xa.method6341(i_6_, i_7_) == i_3_ && class_xa.method6341(i_5_, i_8_) == i_3_ && class_xa.method6341(i_6_, i_8_) == i_3_)
					return;
			}
			if (i == 1) {
				for (int i_9_ = 0; i_9_ < this.anInt7833; i_9_++)
					this.anIntArray7835[i_9_] = (this.anIntArray7835[i_9_] + class_xa.method6340(((this.anIntArray7834[i_9_]) + i_2_), ((this.anIntArray7836[i_9_]) + i_4_)) - i_3_);
			} else if (i == 2) {
				int i_10_ = this.aShort7868;
				if (i_10_ == 0)
					return;
				for (int i_11_ = 0; i_11_ < this.anInt7833; i_11_++) {
					int i_12_ = ((this.anIntArray7835[i_11_] << 16) / i_10_);
					if (i_12_ < i_0_)
						this.anIntArray7835[i_11_] = (this.anIntArray7835[i_11_] + (class_xa.method6340(((this.anIntArray7834[i_11_]) + i_2_), ((this.anIntArray7836[i_11_]) + i_4_)) - i_3_) * (i_0_ - i_12_) / i_0_);
				}
			} else if (i == 3) {
				int i_13_ = (i_0_ & 0xff) * 4;
				int i_14_ = (i_0_ >> 8 & 0xff) * 4;
				int i_15_ = (i_0_ >> 16 & 0xff) << 6;
				int i_16_ = (i_0_ >> 24 & 0xff) << 6;
				if (i_2_ - (i_13_ >> 1) < 0 || (i_2_ + (i_13_ >> 1) + class_xa.anInt6288 * -1212653763 >= (class_xa.anInt6287 * -506105871 << class_xa.anInt6289 * -2137349879)) || i_4_ - (i_14_ >> 1) < 0 || (i_4_ + (i_14_ >> 1) + class_xa.anInt6288 * -1212653763 >= (class_xa.anInt6286 * -1148794921 << class_xa.anInt6289 * -2137349879)))
					return;
				method4732(class_xa, i_2_, i_3_, i_4_, i_13_, i_14_, i_15_, i_16_);
			} else if (i == 4) {
				int i_17_ = (this.aShort7874 - this.aShort7868);
				for (int i_18_ = 0; i_18_ < this.anInt7833; i_18_++)
					this.anIntArray7835[i_18_] = (this.anIntArray7835[i_18_] + (class_xa_1_.method6340(((this.anIntArray7834[i_18_]) + i_2_), ((this.anIntArray7836[i_18_]) + i_4_)) - i_3_) + i_17_);
			} else if (i == 5) {
				int i_19_ = (this.aShort7874 - this.aShort7868);
				for (int i_20_ = 0; i_20_ < this.anInt7833; i_20_++) {
					int i_21_ = this.anIntArray7834[i_20_] + i_2_;
					int i_22_ = this.anIntArray7836[i_20_] + i_4_;
					int i_23_ = class_xa.method6340(i_21_, i_22_);
					int i_24_ = class_xa_1_.method6340(i_21_, i_22_);
					int i_25_ = i_23_ - i_24_ - i_0_;
					this.anIntArray7835[i_20_] = (((this.anIntArray7835[i_20_] << 8) / i_19_ * i_25_) >> 8) - (i_3_ - i_23_);
				}
			}
			if (this.aClass32_7831 != null)
				this.aClass32_7831.anInterface1_397 = null;
			this.aBoolean7843 = false;
		}
	}

	public int AA() {
		if (!this.aBoolean7843)
			method4831();
		return this.aShort7872;
	}

	static byte[] method4817(byte[] is, int i) {
		byte[] is_71_ = new byte[i];
		System.arraycopy(is, 0, is_71_, 0, i);
		return is_71_;
	}

	static float[] method4818(float[] fs, int i) {
		float[] fs_78_ = new float[i];
		System.arraycopy(fs, 0, fs_78_, 0, i);
		return fs_78_;
	}

	public int m() {
		return this.modelMask;
	}

	public void KA(int animationFlag) {
		this.modelMask = animationFlag;
		if (this.aClass67_7844 != null && (this.modelMask & 0x10000) == 0) {
			this.aShortArray7829 = (this.aClass67_7844.aShortArray669);
			this.aShortArray7841 = (this.aClass67_7844.aShortArray668);
			this.aShortArray7842 = (this.aClass67_7844.aShortArray667);
			this.aByteArray7887 = (this.aClass67_7844.aByteArray670);
			this.aClass67_7844 = null;
		}
		this.aBoolean7864 = true;
		method4820();
	}

	ModelToolkit method4819(OpenGLModelToolkit openGLModelToolkit_79_, OpenGLModelToolkit openGLModelToolkit_80_, int i, boolean bool, boolean bool_81_) {
		openGLModelToolkit_79_.aByte7827 = (byte) 0;
		openGLModelToolkit_79_.modelMask = i;
		openGLModelToolkit_79_.anInt7826 = this.anInt7826;
		openGLModelToolkit_79_.aShort7828 = this.aShort7828;
		openGLModelToolkit_79_.aShort7869 = this.aShort7869;
		openGLModelToolkit_79_.anInt7832 = this.anInt7832;
		openGLModelToolkit_79_.anInt7833 = this.anInt7833;
		openGLModelToolkit_79_.anInt7839 = this.anInt7839;
		openGLModelToolkit_79_.anInt7847 = this.anInt7847;
		openGLModelToolkit_79_.anInt7885 = this.anInt7885;
		openGLModelToolkit_79_.anInt7877 = this.anInt7877;
		if ((i & 0x100) != 0)
			openGLModelToolkit_79_.aBoolean7840 = true;
		else
			openGLModelToolkit_79_.aBoolean7840 = this.aBoolean7840;
		openGLModelToolkit_79_.aBoolean7862 = this.aBoolean7862;
		boolean bool_82_ = Class38.method443(i, this.anInt7826);
		boolean bool_83_ = Class38.method444(i, this.anInt7826);
		boolean bool_84_ = Class38.method445(i, this.anInt7826);
		boolean bool_85_ = bool_82_ | bool_83_ | bool_84_;
		if (bool_85_) {
			if (bool_82_) {
				if (openGLModelToolkit_80_.anIntArray7834 == null || ((openGLModelToolkit_80_.anIntArray7834).length < this.anInt7832))
					openGLModelToolkit_79_.anIntArray7834 = openGLModelToolkit_80_.anIntArray7834 = new int[this.anInt7832];
				else
					openGLModelToolkit_79_.anIntArray7834 = openGLModelToolkit_80_.anIntArray7834;
			} else
				openGLModelToolkit_79_.anIntArray7834 = this.anIntArray7834;
			if (bool_83_) {
				if (openGLModelToolkit_80_.anIntArray7835 == null || ((openGLModelToolkit_80_.anIntArray7835).length < this.anInt7832))
					openGLModelToolkit_79_.anIntArray7835 = openGLModelToolkit_80_.anIntArray7835 = new int[this.anInt7832];
				else
					openGLModelToolkit_79_.anIntArray7835 = openGLModelToolkit_80_.anIntArray7835;
			} else
				openGLModelToolkit_79_.anIntArray7835 = this.anIntArray7835;
			if (bool_84_) {
				if (openGLModelToolkit_80_.anIntArray7836 == null || ((openGLModelToolkit_80_.anIntArray7836).length < this.anInt7832))
					openGLModelToolkit_79_.anIntArray7836 = openGLModelToolkit_80_.anIntArray7836 = new int[this.anInt7832];
				else
					openGLModelToolkit_79_.anIntArray7836 = openGLModelToolkit_80_.anIntArray7836;
			} else
				openGLModelToolkit_79_.anIntArray7836 = this.anIntArray7836;
			for (int i_86_ = 0; i_86_ < this.anInt7832; i_86_++) {
				if (bool_82_)
					openGLModelToolkit_79_.anIntArray7834[i_86_] = this.anIntArray7834[i_86_];
				if (bool_83_)
					openGLModelToolkit_79_.anIntArray7835[i_86_] = this.anIntArray7835[i_86_];
				if (bool_84_)
					openGLModelToolkit_79_.anIntArray7836[i_86_] = this.anIntArray7836[i_86_];
			}
		} else {
			openGLModelToolkit_79_.anIntArray7834 = this.anIntArray7834;
			openGLModelToolkit_79_.anIntArray7835 = this.anIntArray7835;
			openGLModelToolkit_79_.anIntArray7836 = this.anIntArray7836;
		}
		if (Class38.method457(i, this.anInt7826)) {
			if (bool)
				openGLModelToolkit_79_.aByte7827 |= 0x1;
			openGLModelToolkit_79_.aClass32_7831 = openGLModelToolkit_80_.aClass32_7831;
			openGLModelToolkit_79_.aClass32_7831.aByte398 = this.aClass32_7831.aByte398;
			openGLModelToolkit_79_.aClass32_7831.anInterface1_397 = (this.aClass32_7831.anInterface1_397);
		} else if (Class38.method471(i))
			openGLModelToolkit_79_.aClass32_7831 = this.aClass32_7831;
		else
			openGLModelToolkit_79_.aClass32_7831 = null;
		if (Class38.method448(i, this.anInt7826)) {
			if (openGLModelToolkit_80_.aShortArray7849 == null || (openGLModelToolkit_80_.aShortArray7849.length < this.anInt7847))
				openGLModelToolkit_79_.aShortArray7849 = openGLModelToolkit_80_.aShortArray7849 = new short[this.anInt7847];
			else
				openGLModelToolkit_79_.aShortArray7849 = openGLModelToolkit_80_.aShortArray7849;
			for (int i_87_ = 0; i_87_ < this.anInt7847; i_87_++)
				openGLModelToolkit_79_.aShortArray7849[i_87_] = this.aShortArray7849[i_87_];
		} else
			openGLModelToolkit_79_.aShortArray7849 = this.aShortArray7849;
		if (Class38.method467(i, this.anInt7826)) {
			if (openGLModelToolkit_80_.aByteArray7850 == null || (openGLModelToolkit_80_.aByteArray7850.length < this.anInt7847))
				openGLModelToolkit_79_.aByteArray7850 = openGLModelToolkit_80_.aByteArray7850 = new byte[this.anInt7847];
			else
				openGLModelToolkit_79_.aByteArray7850 = openGLModelToolkit_80_.aByteArray7850;
			for (int i_88_ = 0; i_88_ < this.anInt7847; i_88_++)
				openGLModelToolkit_79_.aByteArray7850[i_88_] = this.aByteArray7850[i_88_];
		} else
			openGLModelToolkit_79_.aByteArray7850 = this.aByteArray7850;
		if (Class38.method470(i, this.anInt7826)) {
			if (bool)
				openGLModelToolkit_79_.aByte7827 |= 0x2;
			openGLModelToolkit_79_.aClass32_7858 = openGLModelToolkit_80_.aClass32_7858;
			openGLModelToolkit_79_.aClass32_7858.aByte398 = this.aClass32_7858.aByte398;
			openGLModelToolkit_79_.aClass32_7858.anInterface1_397 = (this.aClass32_7858.anInterface1_397);
		} else if (Class38.method458(i, this.anInt7826))
			openGLModelToolkit_79_.aClass32_7858 = this.aClass32_7858;
		else
			openGLModelToolkit_79_.aClass32_7858 = null;
		if (Class38.method474(i, this.anInt7826)) {
			if (openGLModelToolkit_80_.aShortArray7829 == null || (openGLModelToolkit_80_.aShortArray7829.length < this.anInt7839)) {
				int i_89_ = this.anInt7839;
				openGLModelToolkit_79_.aShortArray7829 = openGLModelToolkit_80_.aShortArray7829 = new short[i_89_];
				openGLModelToolkit_79_.aShortArray7841 = openGLModelToolkit_80_.aShortArray7841 = new short[i_89_];
				openGLModelToolkit_79_.aShortArray7842 = openGLModelToolkit_80_.aShortArray7842 = new short[i_89_];
			} else {
				openGLModelToolkit_79_.aShortArray7829 = openGLModelToolkit_80_.aShortArray7829;
				openGLModelToolkit_79_.aShortArray7841 = openGLModelToolkit_80_.aShortArray7841;
				openGLModelToolkit_79_.aShortArray7842 = openGLModelToolkit_80_.aShortArray7842;
			}
			if (this.aClass67_7844 != null) {
				if (openGLModelToolkit_80_.aClass67_7844 == null)
					openGLModelToolkit_80_.aClass67_7844 = new Class67();
				Class67 class67 = (openGLModelToolkit_79_.aClass67_7844 = openGLModelToolkit_80_.aClass67_7844);
				if (class67.aShortArray669 == null || (class67.aShortArray669.length < this.anInt7839)) {
					int i_90_ = this.anInt7839;
					class67.aShortArray669 = new short[i_90_];
					class67.aShortArray668 = new short[i_90_];
					class67.aShortArray667 = new short[i_90_];
					class67.aByteArray670 = new byte[i_90_];
				}
				for (int i_91_ = 0; i_91_ < this.anInt7839; i_91_++) {
					openGLModelToolkit_79_.aShortArray7829[i_91_] = this.aShortArray7829[i_91_];
					openGLModelToolkit_79_.aShortArray7841[i_91_] = this.aShortArray7841[i_91_];
					openGLModelToolkit_79_.aShortArray7842[i_91_] = this.aShortArray7842[i_91_];
					class67.aShortArray669[i_91_] = (this.aClass67_7844.aShortArray669[i_91_]);
					class67.aShortArray668[i_91_] = (this.aClass67_7844.aShortArray668[i_91_]);
					class67.aShortArray667[i_91_] = (this.aClass67_7844.aShortArray667[i_91_]);
					class67.aByteArray670[i_91_] = (this.aClass67_7844.aByteArray670[i_91_]);
				}
			} else {
				for (int i_92_ = 0; i_92_ < this.anInt7839; i_92_++) {
					openGLModelToolkit_79_.aShortArray7829[i_92_] = this.aShortArray7829[i_92_];
					openGLModelToolkit_79_.aShortArray7841[i_92_] = this.aShortArray7841[i_92_];
					openGLModelToolkit_79_.aShortArray7842[i_92_] = this.aShortArray7842[i_92_];
				}
			}
			openGLModelToolkit_79_.aByteArray7887 = this.aByteArray7887;
		} else {
			openGLModelToolkit_79_.aClass67_7844 = this.aClass67_7844;
			openGLModelToolkit_79_.aShortArray7829 = this.aShortArray7829;
			openGLModelToolkit_79_.aShortArray7841 = this.aShortArray7841;
			openGLModelToolkit_79_.aShortArray7842 = this.aShortArray7842;
			openGLModelToolkit_79_.aByteArray7887 = this.aByteArray7887;
		}
		if (Class38.method464(i, this.anInt7826)) {
			if (bool)
				openGLModelToolkit_79_.aByte7827 |= 0x4;
			openGLModelToolkit_79_.aClass32_7889 = openGLModelToolkit_80_.aClass32_7889;
			openGLModelToolkit_79_.aClass32_7889.aByte398 = this.aClass32_7889.aByte398;
			openGLModelToolkit_79_.aClass32_7889.anInterface1_397 = (this.aClass32_7889.anInterface1_397);
		} else if (Class38.method475(i, this.anInt7826))
			openGLModelToolkit_79_.aClass32_7889 = this.aClass32_7889;
		else
			openGLModelToolkit_79_.aClass32_7889 = null;
		if (Class38.method450(i, this.anInt7826)) {
			if (openGLModelToolkit_80_.aFloatArray7845 == null || (openGLModelToolkit_80_.aFloatArray7845.length < this.anInt7847)) {
				int i_93_ = this.anInt7839;
				openGLModelToolkit_79_.aFloatArray7845 = openGLModelToolkit_80_.aFloatArray7845 = new float[i_93_];
				openGLModelToolkit_79_.aFloatArray7846 = openGLModelToolkit_80_.aFloatArray7846 = new float[i_93_];
			} else {
				openGLModelToolkit_79_.aFloatArray7845 = openGLModelToolkit_80_.aFloatArray7845;
				openGLModelToolkit_79_.aFloatArray7846 = openGLModelToolkit_80_.aFloatArray7846;
			}
			for (int i_94_ = 0; i_94_ < this.anInt7839; i_94_++) {
				openGLModelToolkit_79_.aFloatArray7845[i_94_] = this.aFloatArray7845[i_94_];
				openGLModelToolkit_79_.aFloatArray7846[i_94_] = this.aFloatArray7846[i_94_];
			}
		} else {
			openGLModelToolkit_79_.aFloatArray7845 = this.aFloatArray7845;
			openGLModelToolkit_79_.aFloatArray7846 = this.aFloatArray7846;
		}
		if (Class38.method476(i, this.anInt7826)) {
			if (bool)
				openGLModelToolkit_79_.aByte7827 |= 0x8;
			openGLModelToolkit_79_.aClass32_7860 = openGLModelToolkit_80_.aClass32_7860;
			openGLModelToolkit_79_.aClass32_7860.aByte398 = this.aClass32_7860.aByte398;
			openGLModelToolkit_79_.aClass32_7860.anInterface1_397 = (this.aClass32_7860.anInterface1_397);
		} else if (Class38.method455(i, this.anInt7826))
			openGLModelToolkit_79_.aClass32_7860 = this.aClass32_7860;
		else
			openGLModelToolkit_79_.aClass32_7860 = null;
		if (Class38.method468(i, this.anInt7826)) {
			if (openGLModelToolkit_80_.aShortArray7851 == null || (openGLModelToolkit_80_.aShortArray7851.length < this.anInt7847)) {
				int i_95_ = this.anInt7847;
				openGLModelToolkit_79_.aShortArray7851 = openGLModelToolkit_80_.aShortArray7851 = new short[i_95_];
				openGLModelToolkit_79_.aShortArray7852 = openGLModelToolkit_80_.aShortArray7852 = new short[i_95_];
				openGLModelToolkit_79_.aShortArray7853 = openGLModelToolkit_80_.aShortArray7853 = new short[i_95_];
			} else {
				openGLModelToolkit_79_.aShortArray7851 = openGLModelToolkit_80_.aShortArray7851;
				openGLModelToolkit_79_.aShortArray7852 = openGLModelToolkit_80_.aShortArray7852;
				openGLModelToolkit_79_.aShortArray7853 = openGLModelToolkit_80_.aShortArray7853;
			}
			for (int i_96_ = 0; i_96_ < this.anInt7847; i_96_++) {
				openGLModelToolkit_79_.aShortArray7851[i_96_] = this.aShortArray7851[i_96_];
				openGLModelToolkit_79_.aShortArray7852[i_96_] = this.aShortArray7852[i_96_];
				openGLModelToolkit_79_.aShortArray7853[i_96_] = this.aShortArray7853[i_96_];
			}
		} else {
			openGLModelToolkit_79_.aShortArray7851 = this.aShortArray7851;
			openGLModelToolkit_79_.aShortArray7852 = this.aShortArray7852;
			openGLModelToolkit_79_.aShortArray7853 = this.aShortArray7853;
		}
		if (Class38.method447(i, this.anInt7826)) {
			if (bool)
				openGLModelToolkit_79_.aByte7827 |= 0x10;
			openGLModelToolkit_79_.aClass41_7879 = openGLModelToolkit_80_.aClass41_7879;
			openGLModelToolkit_79_.aClass41_7879.anInterface2_441 = (this.aClass41_7879.anInterface2_441);
		} else if (Class38.method456(i, this.anInt7826))
			openGLModelToolkit_79_.aClass41_7879 = this.aClass41_7879;
		else
			openGLModelToolkit_79_.aClass41_7879 = null;
		if (Class38.method451(i, this.anInt7826)) {
			if (openGLModelToolkit_80_.aShortArray7861 == null || (openGLModelToolkit_80_.aShortArray7861.length < this.anInt7847)) {
				int i_97_ = this.anInt7847;
				openGLModelToolkit_79_.aShortArray7861 = openGLModelToolkit_80_.aShortArray7861 = new short[i_97_];
			} else
				openGLModelToolkit_79_.aShortArray7861 = openGLModelToolkit_80_.aShortArray7861;
			for (int i_98_ = 0; i_98_ < this.anInt7847; i_98_++)
				openGLModelToolkit_79_.aShortArray7861[i_98_] = this.aShortArray7861[i_98_];
		} else
			openGLModelToolkit_79_.aShortArray7861 = this.aShortArray7861;
		if (Class38.method452(i, this.anInt7826)) {
			if (openGLModelToolkit_80_.aClass36Array7875 == null || ((openGLModelToolkit_80_.aClass36Array7875).length < this.anInt7877)) {
				int i_99_ = this.anInt7877;
				openGLModelToolkit_79_.aClass36Array7875 = openGLModelToolkit_80_.aClass36Array7875 = new Class36[i_99_];
				for (int i_100_ = 0; i_100_ < this.anInt7877; i_100_++)
					openGLModelToolkit_79_.aClass36Array7875[i_100_] = this.aClass36Array7875[i_100_].method442();
			} else {
				openGLModelToolkit_79_.aClass36Array7875 = openGLModelToolkit_80_.aClass36Array7875;
				for (int i_101_ = 0; i_101_ < this.anInt7877; i_101_++)
					openGLModelToolkit_79_.aClass36Array7875[i_101_].method441(this.aClass36Array7875[i_101_]);
			}
		} else
			openGLModelToolkit_79_.aClass36Array7875 = this.aClass36Array7875;
		openGLModelToolkit_79_.aClass54Array7880 = this.aClass54Array7880;
		if (this.aBoolean7843) {
			openGLModelToolkit_79_.anInt7865 = this.anInt7865;
			openGLModelToolkit_79_.anInt7891 = this.anInt7891;
			openGLModelToolkit_79_.aShort7870 = this.aShort7870;
			openGLModelToolkit_79_.aShort7871 = this.aShort7871;
			openGLModelToolkit_79_.aShort7868 = this.aShort7868;
			openGLModelToolkit_79_.aShort7874 = this.aShort7874;
			openGLModelToolkit_79_.aShort7872 = this.aShort7872;
			openGLModelToolkit_79_.aShort7876 = this.aShort7876;
			openGLModelToolkit_79_.aBoolean7843 = true;
		} else
			openGLModelToolkit_79_.aBoolean7843 = false;
		openGLModelToolkit_79_.anIntArrayArray7837 = this.anIntArrayArray7837;
		openGLModelToolkit_79_.anIntArrayArray7855 = this.anIntArrayArray7855;
		openGLModelToolkit_79_.anIntArrayArray7882 = this.anIntArrayArray7882;
		openGLModelToolkit_79_.aShortArray7830 = this.aShortArray7830;
		openGLModelToolkit_79_.anIntArray7854 = this.anIntArray7854;
		openGLModelToolkit_79_.aShortArray7838 = this.aShortArray7838;
		openGLModelToolkit_79_.aShortArray7856 = this.aShortArray7856;
		openGLModelToolkit_79_.anIntArray7859 = this.anIntArray7859;
		openGLModelToolkit_79_.aEmissiveTriangleArray7825 = this.aEmissiveTriangleArray7825;
		openGLModelToolkit_79_.aEffectiveVertexArray7857 = this.aEffectiveVertexArray7857;
		return openGLModelToolkit_79_;
	}

	void method4820() {
		if (this.aBoolean7864) {
			this.aBoolean7864 = false;
			if (this.aEmissiveTriangleArray7825 == null && this.aEffectiveVertexArray7857 == null && this.aClass54Array7880 == null && !Class38.method446(this.modelMask, this.anInt7826)) {
				boolean bool = false;
				boolean bool_102_ = false;
				boolean bool_103_ = false;
				if (this.anIntArray7834 != null && !Class38.method469(this.modelMask, this.anInt7826)) {
					if (this.aClass32_7831 == null || (this.aClass32_7831.anInterface1_397) != null) {
						if (!this.aBoolean7843)
							method4831();
						bool = true;
					} else
						this.aBoolean7864 = true;
				}
				if (this.anIntArray7835 != null && !Class38.method460(this.modelMask, this.anInt7826)) {
					if (this.aClass32_7831 == null || (this.aClass32_7831.anInterface1_397) != null) {
						if (!this.aBoolean7843)
							method4831();
						bool_102_ = true;
					} else
						this.aBoolean7864 = true;
				}
				if (this.anIntArray7836 != null && !Class38.method473(this.modelMask, this.anInt7826)) {
					if (this.aClass32_7831 == null || (this.aClass32_7831.anInterface1_397) != null) {
						if (!this.aBoolean7843)
							method4831();
						bool_103_ = true;
					} else
						this.aBoolean7864 = true;
				}
				if (bool)
					this.anIntArray7834 = null;
				if (bool_102_)
					this.anIntArray7835 = null;
				if (bool_103_)
					this.anIntArray7836 = null;
			}
			if (this.aShortArray7830 != null && this.anIntArray7834 == null && this.anIntArray7835 == null && this.anIntArray7836 == null) {
				this.aShortArray7830 = null;
				this.anIntArray7854 = null;
			}
			if (this.aByteArray7887 != null && !Class38.method461(this.modelMask, this.anInt7826)) {
				if (this.aClass32_7889 != null) {
					if ((this.aClass32_7889.anInterface1_397) != null) {
						this.aShortArray7842 = null;
						this.aShortArray7841 = null;
						this.aShortArray7829 = null;
						this.aByteArray7887 = null;
					} else
						this.aBoolean7864 = true;
				} else if (this.aClass32_7858 == null || (this.aClass32_7858.anInterface1_397) != null) {
					this.aShortArray7842 = null;
					this.aShortArray7841 = null;
					this.aShortArray7829 = null;
					this.aByteArray7887 = null;
				} else
					this.aBoolean7864 = true;
			}
			if (this.aShortArray7849 != null && !Class38.method472(this.modelMask, this.anInt7826)) {
				if (this.aClass32_7858 == null || (this.aClass32_7858.anInterface1_397) != null)
					this.aShortArray7849 = null;
				else
					this.aBoolean7864 = true;
			}
			if (this.aByteArray7850 != null && !Class38.method453(this.modelMask, this.anInt7826)) {
				if (this.aClass32_7858 == null || (this.aClass32_7858.anInterface1_397) != null)
					this.aByteArray7850 = null;
				else
					this.aBoolean7864 = true;
			}
			if (this.aFloatArray7845 != null && !Class38.method462(this.modelMask, this.anInt7826)) {
				if (this.aClass32_7860 == null || (this.aClass32_7860.anInterface1_397) != null) {
					this.aFloatArray7846 = null;
					this.aFloatArray7845 = null;
				} else
					this.aBoolean7864 = true;
			}
			if (this.aShortArray7861 != null && !Class38.method466(this.modelMask, this.anInt7826)) {
				if (this.aClass32_7858 == null || (this.aClass32_7858.anInterface1_397) != null)
					this.aShortArray7861 = null;
				else
					this.aBoolean7864 = true;
			}
			if (this.aShortArray7851 != null && !Class38.method449(this.modelMask, this.anInt7826)) {
				if ((this.aClass41_7879 == null || (this.aClass41_7879.anInterface2_441) != null) && (this.aClass32_7858 == null || (this.aClass32_7858.anInterface1_397) != null)) {
					this.aShortArray7853 = null;
					this.aShortArray7852 = null;
					this.aShortArray7851 = null;
				} else
					this.aBoolean7864 = true;
			}
			if (this.anIntArrayArray7855 != null && !Class38.method463(this.modelMask, this.anInt7826)) {
				this.anIntArrayArray7855 = null;
				this.aShortArray7856 = null;
			}
			if (this.anIntArrayArray7837 != null && !Class38.method459(this.modelMask, this.anInt7826)) {
				this.anIntArrayArray7837 = null;
				this.aShortArray7838 = null;
			}
			if (this.anIntArrayArray7882 != null && !Class38.method465(this.modelMask, this.anInt7826))
				this.anIntArrayArray7882 = null;
			if (this.anIntArray7859 != null && (this.modelMask & 0x800) == 0 && (this.modelMask & 0x40000) == 0)
				this.anIntArray7859 = null;
		}
	}

	public byte[] ah() {
		return this.aByteArray7850;
	}

	public void S(int i) {
		int i_104_ = CircleAngleTable.SINE[i];
		int i_105_ = CircleAngleTable.COSINE[i];
		for (int i_106_ = 0; i_106_ < this.anInt7833; i_106_++) {
			int i_107_ = ((this.anIntArray7836[i_106_] * i_104_ + this.anIntArray7834[i_106_] * i_105_) >> 14);
			this.anIntArray7836[i_106_] = ((this.anIntArray7836[i_106_] * i_105_ - this.anIntArray7834[i_106_] * i_104_) >> 14);
			this.anIntArray7834[i_106_] = i_107_;
		}
		for (int i_108_ = 0; i_108_ < this.anInt7839; i_108_++) {
			int i_109_ = ((this.aShortArray7842[i_108_] * i_104_ + this.aShortArray7829[i_108_] * i_105_) >> 14);
			this.aShortArray7842[i_108_] = (short) (((this.aShortArray7842[i_108_] * i_105_) - (this.aShortArray7829[i_108_] * i_104_)) >> 14);
			this.aShortArray7829[i_108_] = (short) i_109_;
		}
		if (this.aClass32_7889 == null && this.aClass32_7858 != null)
			this.aClass32_7858.anInterface1_397 = null;
		if (this.aClass32_7889 != null)
			this.aClass32_7889.anInterface1_397 = null;
		if (this.aClass32_7831 != null)
			this.aClass32_7831.anInterface1_397 = null;
		this.aBoolean7843 = false;
	}

	public void render(Matrix43f class222, Class302_Sub1 class302_sub1, int i) {
		if ((i & 0x2) != 0)
			OpenGL.glPolygonMode(1032, 6913);
		if (this.anInt7839 != 0) {
			Matrix4f matrix4f = (this.openGLGraphicsToolkit.aMatrix4f_8041);
			Matrix4f matrix4f_110_ = (this.openGLGraphicsToolkit.aMatrix4f_8104);
			Matrix4f matrix4f_111_ = (this.openGLGraphicsToolkit.aMatrix4f_8184);
			matrix4f_110_.method2145(class222);
			matrix4f_111_.method2142(matrix4f_110_);
			matrix4f_111_.method2144(this.openGLGraphicsToolkit.aMatrix4f_8069);
			if (!this.aBoolean7843)
				method4831();
			float[] fs = (this.openGLGraphicsToolkit.aFloatArray8094);
			matrix4f_110_.method2149(0.0F, (float) this.aShort7868, 0.0F, fs);
			float f = fs[0];
			float f_112_ = fs[1];
			float f_113_ = fs[2];
			matrix4f_110_.method2149(0.0F, (float) this.aShort7874, 0.0F, fs);
			float f_114_ = fs[0];
			float f_115_ = fs[1];
			float f_116_ = fs[2];
			for (int i_117_ = 0; i_117_ < 6; i_117_++) {
				float[] fs_118_ = (this.openGLGraphicsToolkit.aFloatArrayArray8077[i_117_]);
				float f_119_ = (fs_118_[0] * f + fs_118_[1] * f_112_ + fs_118_[2] * f_113_ + fs_118_[3] + (float) this.anInt7891);
				float f_120_ = (fs_118_[0] * f_114_ + fs_118_[1] * f_115_ + fs_118_[2] * f_116_ + fs_118_[3] + (float) this.anInt7891);
				if (f_119_ < 0.0F && f_120_ < 0.0F)
					return;
			}
			if (class302_sub1 != null) {
				boolean bool = false;
				boolean bool_121_ = true;
				int i_122_ = ((this.aShort7870 + this.aShort7871) >> 1);
				int i_123_ = ((this.aShort7872 + this.aShort7876) >> 1);
				int i_124_ = i_122_;
				short i_125_ = this.aShort7868;
				int i_126_ = i_123_;
				float f_127_ = (matrix4f_111_.aFloatArray2594[0] * (float) i_124_ + matrix4f_111_.aFloatArray2594[4] * (float) i_125_ + matrix4f_111_.aFloatArray2594[8] * (float) i_126_ + matrix4f_111_.aFloatArray2594[12]);
				float f_128_ = (matrix4f_111_.aFloatArray2594[1] * (float) i_124_ + matrix4f_111_.aFloatArray2594[5] * (float) i_125_ + matrix4f_111_.aFloatArray2594[9] * (float) i_126_ + matrix4f_111_.aFloatArray2594[13]);
				float f_129_ = (matrix4f_111_.aFloatArray2594[2] * (float) i_124_ + matrix4f_111_.aFloatArray2594[6] * (float) i_125_ + matrix4f_111_.aFloatArray2594[10] * (float) i_126_ + matrix4f_111_.aFloatArray2594[14]);
				float f_130_ = (matrix4f_111_.aFloatArray2594[3] * (float) i_124_ + matrix4f_111_.aFloatArray2594[7] * (float) i_125_ + matrix4f_111_.aFloatArray2594[11] * (float) i_126_ + matrix4f_111_.aFloatArray2594[15]);
				if (f_129_ >= -f_130_) {
					class302_sub1.anInt7641 = (int) ((this.openGLGraphicsToolkit.aFloat8095) + (this.openGLGraphicsToolkit.aFloat8096) * f_127_ / f_130_);
					class302_sub1.anInt7642 = (int) ((this.openGLGraphicsToolkit.aFloat8097) + (this.openGLGraphicsToolkit.aFloat8098) * f_128_ / f_130_);
				} else
					bool = true;
				i_124_ = i_122_;
				i_125_ = this.aShort7874;
				i_126_ = i_123_;
				float f_131_ = (matrix4f_111_.aFloatArray2594[0] * (float) i_124_ + matrix4f_111_.aFloatArray2594[4] * (float) i_125_ + matrix4f_111_.aFloatArray2594[8] * (float) i_126_ + matrix4f_111_.aFloatArray2594[12]);
				float f_132_ = (matrix4f_111_.aFloatArray2594[1] * (float) i_124_ + matrix4f_111_.aFloatArray2594[5] * (float) i_125_ + matrix4f_111_.aFloatArray2594[9] * (float) i_126_ + matrix4f_111_.aFloatArray2594[13]);
				float f_133_ = (matrix4f_111_.aFloatArray2594[2] * (float) i_124_ + matrix4f_111_.aFloatArray2594[6] * (float) i_125_ + matrix4f_111_.aFloatArray2594[10] * (float) i_126_ + matrix4f_111_.aFloatArray2594[14]);
				float f_134_ = (matrix4f_111_.aFloatArray2594[3] * (float) i_124_ + matrix4f_111_.aFloatArray2594[7] * (float) i_125_ + matrix4f_111_.aFloatArray2594[11] * (float) i_126_ + matrix4f_111_.aFloatArray2594[15]);
				if (f_133_ >= -f_134_) {
					class302_sub1.anInt7643 = (int) ((this.openGLGraphicsToolkit.aFloat8095) + (this.openGLGraphicsToolkit.aFloat8096) * f_131_ / f_134_);
					class302_sub1.anInt7640 = (int) ((this.openGLGraphicsToolkit.aFloat8097) + (this.openGLGraphicsToolkit.aFloat8098) * f_132_ / f_134_);
				} else
					bool = true;
				if (bool) {
					if (f_129_ < -f_130_ && f_133_ < -f_134_)
						bool_121_ = false;
					else if (f_129_ < -f_130_) {
						float f_135_ = (f_129_ + f_130_) / (f_133_ + f_134_) - 1.0F;
						float f_136_ = f_127_ + f_135_ * (f_131_ - f_127_);
						float f_137_ = f_128_ + f_135_ * (f_132_ - f_128_);
						float f_138_ = f_130_ + f_135_ * (f_134_ - f_130_);
						class302_sub1.anInt7641 = (int) ((this.openGLGraphicsToolkit.aFloat8095) + (this.openGLGraphicsToolkit.aFloat8096 * f_136_ / f_138_));
						class302_sub1.anInt7642 = (int) ((this.openGLGraphicsToolkit.aFloat8097) + (this.openGLGraphicsToolkit.aFloat8098 * f_137_ / f_138_));
					} else if (f_133_ < -f_134_) {
						float f_139_ = (f_133_ + f_134_) / (f_129_ + f_130_) - 1.0F;
						float f_140_ = f_131_ + f_139_ * (f_127_ - f_131_);
						float f_141_ = f_132_ + f_139_ * (f_128_ - f_132_);
						float f_142_ = f_134_ + f_139_ * (f_130_ - f_134_);
						class302_sub1.anInt7643 = (int) ((this.openGLGraphicsToolkit.aFloat8095) + (this.openGLGraphicsToolkit.aFloat8096 * f_140_ / f_142_));
						class302_sub1.anInt7640 = (int) ((this.openGLGraphicsToolkit.aFloat8097) + (this.openGLGraphicsToolkit.aFloat8098 * f_141_ / f_142_));
					}
				}
				if (bool_121_) {
					if (f_129_ / f_130_ > f_133_ / f_134_) {
						float f_143_ = (f_127_ + (matrix4f.aFloatArray2594[0] * (float) this.anInt7891) + matrix4f.aFloatArray2594[12]);
						float f_144_ = (f_130_ + (matrix4f.aFloatArray2594[3] * (float) this.anInt7891) + matrix4f.aFloatArray2594[15]);
						class302_sub1.anInt7645 = (int) ((this.openGLGraphicsToolkit.aFloat8095) - (float) class302_sub1.anInt7641 + (this.openGLGraphicsToolkit.aFloat8096 * f_143_ / f_144_));
					} else {
						float f_145_ = (f_131_ + (matrix4f.aFloatArray2594[0] * (float) this.anInt7891) + matrix4f.aFloatArray2594[12]);
						float f_146_ = (f_134_ + (matrix4f.aFloatArray2594[3] * (float) this.anInt7891) + matrix4f.aFloatArray2594[15]);
						class302_sub1.anInt7645 = (int) ((this.openGLGraphicsToolkit.aFloat8095) - (float) class302_sub1.anInt7643 + (this.openGLGraphicsToolkit.aFloat8096 * f_145_ / f_146_));
					}
					class302_sub1.aBoolean7644 = true;
				}
			}
			this.openGLGraphicsToolkit.method5252();
			this.openGLGraphicsToolkit.method5283(matrix4f_110_);
			method4823();
			this.openGLGraphicsToolkit.method5287();
			matrix4f_110_.method2144(this.openGLGraphicsToolkit.aMatrix4f_8110);
			method4824(matrix4f_110_);
			if ((i & 0x2) != 0)
				OpenGL.glPolygonMode(1028, 6914);
		}
	}

	public void EA(int i) {
		int i_147_ = CircleAngleTable.SINE[i];
		int i_148_ = CircleAngleTable.COSINE[i];
		for (int i_149_ = 0; i_149_ < this.anInt7833; i_149_++) {
			int i_150_ = ((this.anIntArray7835[i_149_] * i_147_ + this.anIntArray7834[i_149_] * i_148_) >> 14);
			this.anIntArray7835[i_149_] = ((this.anIntArray7835[i_149_] * i_148_ - this.anIntArray7834[i_149_] * i_147_) >> 14);
			this.anIntArray7834[i_149_] = i_150_;
		}
		if (this.aClass32_7831 != null)
			this.aClass32_7831.anInterface1_397 = null;
		this.aBoolean7843 = false;
	}

	public void PA(int i, int i_180_, int i_181_, int i_182_) {
		for (int i_183_ = 0; i_183_ < this.anInt7847; i_183_++) {
			int i_184_ = this.aShortArray7849[i_183_] & 0xffff;
			int i_185_ = i_184_ >> 10 & 0x3f;
			int i_186_ = i_184_ >> 7 & 0x7;
			int i_187_ = i_184_ & 0x7f;
			if (i != -1)
				i_185_ += (i - i_185_) * i_182_ >> 7;
			if (i_180_ != -1)
				i_186_ += (i_180_ - i_186_) * i_182_ >> 7;
			if (i_181_ != -1)
				i_187_ += (i_181_ - i_187_) * i_182_ >> 7;
			this.aShortArray7849[i_183_] = (short) (i_185_ << 10 | i_186_ << 7 | i_187_);
		}
		if (this.aClass54Array7880 != null) {
			for (int i_188_ = 0; i_188_ < this.anInt7877; i_188_++) {
				Class54 class54 = this.aClass54Array7880[i_188_];
				Class36 class36 = this.aClass36Array7875[i_188_];
				class36.anInt424 = (class36.anInt424 & ~0xffffff | ((Class294.anIntArray3165[(this.aShortArray7849[class54.anInt549]) & 0xffff]) & 0xffffff));
			}
		}
		if (this.aClass32_7858 != null)
			this.aClass32_7858.anInterface1_397 = null;
	}

	public int N() {
		if (!this.aBoolean7843)
			method4831();
		return this.anInt7891;
	}

	public int RA() {
		if (!this.aBoolean7843)
			method4831();
		return this.aShort7870;
	}

	public int ya() {
		if (!this.aBoolean7843)
			method4831();
		return this.aShort7871;
	}

	public int YA() {
		if (!this.aBoolean7843)
			method4831();
		return this.aShort7868;
	}

	public int o() {
		if (!this.aBoolean7843)
			method4831();
		return this.aShort7874;
	}

	public void wa() {
		for (int i = 0; i < this.anInt7833; i++)
			this.anIntArray7836[i] = -this.anIntArray7836[i];
		for (int i = 0; i < this.anInt7839; i++)
			this.aShortArray7842[i] = (short) -this.aShortArray7842[i];
		for (int i = 0; i < this.anInt7847; i++) {
			short i_189_ = this.aShortArray7851[i];
			this.aShortArray7851[i] = this.aShortArray7853[i];
			this.aShortArray7853[i] = i_189_;
		}
		if (this.aClass32_7889 == null && this.aClass32_7858 != null)
			this.aClass32_7858.anInterface1_397 = null;
		if (this.aClass32_7889 != null)
			this.aClass32_7889.anInterface1_397 = null;
		if (this.aClass32_7831 != null)
			this.aClass32_7831.anInterface1_397 = null;
		if (this.aClass41_7879 != null)
			this.aClass41_7879.anInterface2_441 = null;
		this.aBoolean7843 = false;
	}

	public int ha() {
		if (!this.aBoolean7843)
			method4831();
		return this.aShort7876;
	}

	public void method4745(ModelToolkit modelToolkit, int i, int i_190_, int i_191_, boolean bool) {
		OpenGLModelToolkit glModelToolkit = (OpenGLModelToolkit) modelToolkit;
		if (this.anInt7847 != 0 && glModelToolkit.anInt7847 != 0) {
			int i_193_ = glModelToolkit.anInt7833;
			int[] is = glModelToolkit.anIntArray7834;
			int[] is_194_ = glModelToolkit.anIntArray7835;
			int[] is_195_ = glModelToolkit.anIntArray7836;
			short[] is_196_ = glModelToolkit.aShortArray7829;
			short[] is_197_ = glModelToolkit.aShortArray7841;
			short[] is_198_ = glModelToolkit.aShortArray7842;
			byte[] is_199_ = glModelToolkit.aByteArray7887;
			short[] is_200_;
			short[] is_201_;
			short[] is_202_;
			byte[] is_203_;
			if (this.aClass67_7844 != null) {
				is_200_ = (this.aClass67_7844.aShortArray669);
				is_201_ = (this.aClass67_7844.aShortArray668);
				is_202_ = (this.aClass67_7844.aShortArray667);
				is_203_ = (this.aClass67_7844.aByteArray670);
			} else {
				is_200_ = null;
				is_201_ = null;
				is_202_ = null;
				is_203_ = null;
			}
			short[] is_204_;
			short[] is_205_;
			short[] is_206_;
			byte[] is_207_;
			if (glModelToolkit.aClass67_7844 != null) {
				is_204_ = glModelToolkit.aClass67_7844.aShortArray669;
				is_205_ = glModelToolkit.aClass67_7844.aShortArray668;
				is_206_ = glModelToolkit.aClass67_7844.aShortArray667;
				is_207_ = glModelToolkit.aClass67_7844.aByteArray670;
			} else {
				is_204_ = null;
				is_205_ = null;
				is_206_ = null;
				is_207_ = null;
			}
			int[] is_208_ = glModelToolkit.anIntArray7854;
			short[] is_209_ = glModelToolkit.aShortArray7830;
			if (!glModelToolkit.aBoolean7843)
				glModelToolkit.method4831();
			int i_210_ = glModelToolkit.aShort7868;
			int i_211_ = glModelToolkit.aShort7874;
			int i_212_ = glModelToolkit.aShort7870;
			int i_213_ = glModelToolkit.aShort7871;
			int i_214_ = glModelToolkit.aShort7872;
			int i_215_ = glModelToolkit.aShort7876;
			for (int i_216_ = 0; i_216_ < this.anInt7833; i_216_++) {
				int i_217_ = this.anIntArray7835[i_216_] - i_190_;
				if (i_217_ >= i_210_ && i_217_ <= i_211_) {
					int i_218_ = this.anIntArray7834[i_216_] - i;
					if (i_218_ >= i_212_ && i_218_ <= i_213_) {
						int i_219_ = (this.anIntArray7836[i_216_] - i_191_);
						if (i_219_ >= i_214_ && i_219_ <= i_215_) {
							int i_220_ = -1;
							int i_221_ = (this.anIntArray7854[i_216_]);
							int i_222_ = (this.anIntArray7854[i_216_ + 1]);
							for (int i_223_ = i_221_; i_223_ < i_222_; i_223_++) {
								i_220_ = (this.aShortArray7830[i_223_]) - 1;
								if (i_220_ == -1 || (this.aByteArray7887[i_220_]) != 0)
									break;
							}
							if (i_220_ != -1) {
								for (int i_224_ = 0; i_224_ < i_193_; i_224_++) {
									if (i_218_ == is[i_224_] && i_219_ == is_195_[i_224_] && i_217_ == is_194_[i_224_]) {
										int i_225_ = -1;
										i_221_ = is_208_[i_224_];
										i_222_ = is_208_[i_224_ + 1];
										for (int i_226_ = i_221_; i_226_ < i_222_; i_226_++) {
											i_225_ = is_209_[i_226_] - 1;
											if (i_225_ == -1 || is_199_[i_225_] != 0)
												break;
										}
										if (i_225_ != -1) {
											if (is_200_ == null) {
												this.aClass67_7844 = new Class67();
												is_200_ = this.aClass67_7844.aShortArray669 = (Class378.method4670((this.aShortArray7829), (byte) -19));
												is_201_ = this.aClass67_7844.aShortArray668 = (Class378.method4670((this.aShortArray7841), (byte) -121));
												is_202_ = this.aClass67_7844.aShortArray667 = (Class378.method4670((this.aShortArray7842), (byte) -76));
												is_203_ = this.aClass67_7844.aByteArray670 = (StaticMethods.method4978((this.aByteArray7887), 1194497584));
											}
											if (is_204_ == null) {
												Class67 class67 = (glModelToolkit.aClass67_7844 = new Class67());
												is_204_ = class67.aShortArray669 = (Class378.method4670(is_196_, (byte) -74));
												is_205_ = class67.aShortArray668 = (Class378.method4670(is_197_, (byte) -6));
												is_206_ = class67.aShortArray667 = (Class378.method4670(is_198_, (byte) -5));
												is_207_ = class67.aByteArray670 = (StaticMethods.method4978(is_199_, 1194497584));
											}
											short i_227_ = (this.aShortArray7829[i_220_]);
											short i_228_ = (this.aShortArray7841[i_220_]);
											short i_229_ = (this.aShortArray7842[i_220_]);
											byte i_230_ = (this.aByteArray7887[i_220_]);
											i_221_ = is_208_[i_224_];
											i_222_ = is_208_[i_224_ + 1];
											for (int i_231_ = i_221_; i_231_ < i_222_; i_231_++) {
												int i_232_ = is_209_[i_231_] - 1;
												if (i_232_ == -1)
													break;
												if (is_207_[i_232_] != 0) {
													is_204_[i_232_] += i_227_;
													is_205_[i_232_] += i_228_;
													is_206_[i_232_] += i_229_;
													is_207_[i_232_] += i_230_;
												}
											}
											i_227_ = is_196_[i_225_];
											i_228_ = is_197_[i_225_];
											i_229_ = is_198_[i_225_];
											i_230_ = is_199_[i_225_];
											i_221_ = (this.anIntArray7854[i_216_]);
											i_222_ = (this.anIntArray7854[i_216_ + 1]);
											for (int i_233_ = i_221_; i_233_ < i_222_; i_233_++) {
												int i_234_ = ((this.aShortArray7830[i_233_]) - 1);
												if (i_234_ == -1)
													break;
												if (is_203_[i_234_] != 0) {
													is_200_[i_234_] += i_227_;
													is_201_[i_234_] += i_228_;
													is_202_[i_234_] += i_229_;
													is_203_[i_234_] += i_230_;
												}
											}
											if ((this.aClass32_7889) == null && (this.aClass32_7858) != null)
												this.aClass32_7858.anInterface1_397 = null;
											if ((this.aClass32_7889) != null)
												this.aClass32_7889.anInterface1_397 = null;
											if ((glModelToolkit.aClass32_7889) == null && (glModelToolkit.aClass32_7858) != null)
												glModelToolkit.aClass32_7858.anInterface1_397 = null;
											if ((glModelToolkit.aClass32_7889) != null)
												glModelToolkit.aClass32_7889.anInterface1_397 = null;
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	public void p(int i) {
		this.aShort7828 = (short) i;
		if (this.aClass32_7858 != null)
			this.aClass32_7858.anInterface1_397 = null;
	}

	public void Q(int i) {
		this.aShort7869 = (short) i;
		if (this.aClass32_7858 != null)
			this.aClass32_7858.anInterface1_397 = null;
		if (this.aClass32_7889 != null)
			this.aClass32_7889.anInterface1_397 = null;
	}

	public int c() {
		return this.aShort7828;
	}

	public int Z() {
		return this.aShort7869;
	}

	public void method4784() {
		if (this.anInt7839 > 0 && this.anInt7885 > 0) {
			method4825(false);
			if ((this.aByte7827 & 0x10) == 0 && (this.aClass41_7879.anInterface2_441) == null)
				method4830(false);
			method4820();
		}
	}

	boolean ea() {
		if (this.anIntArrayArray7837 == null)
			return false;
		for (int i = 0; i < this.anInt7832; i++) {
			this.anIntArray7834[i] <<= 4;
			this.anIntArray7835[i] <<= 4;
			this.anIntArray7836[i] <<= 4;
		}
		anInt7888 = 0;
		anInt7866 = 0;
		anInt7890 = 0;
		return true;
	}

	public void method4742(byte i, byte[] is) {
		if (is == null) {
			for (int i_235_ = 0; i_235_ < this.anInt7847; i_235_++)
				this.aByteArray7850[i_235_] = i;
		} else {
			for (int i_236_ = 0; i_236_ < this.anInt7847; i_236_++) {
				int i_237_ = 255 - ((255 - (is[i_236_] & 0xff)) * (255 - (i & 0xff)) / 255);
				this.aByteArray7850[i_236_] = (byte) i_237_;
			}
		}
		if (this.aClass32_7858 != null)
			this.aClass32_7858.anInterface1_397 = null;
	}

	public boolean method4743() {
		if (this.aShortArray7861 == null)
			return true;
		for (int i = 0; i < this.aShortArray7861.length; i++) {
			if (this.aShortArray7861[i] != -1 && !(this.openGLGraphicsToolkit.textures.method170(this.aShortArray7861[i], (short) 29809)))
				return false;
		}
		return true;
	}

	public boolean i() {
		return this.aBoolean7840;
	}

	public boolean u() {
		return this.aBoolean7862;
	}

	void method4734() {
		/* empty */
	}

	void animate(int transformType, int transformX, int transformY, int transformZ) {
		if (transformType == AnimationFrameBase.UNKNOWN0) {
			int i_247_ = 0;
			anInt7888 = 0;
			anInt7866 = 0;
			anInt7890 = 0;
			for (int i_248_ = 0; i_248_ < this.anInt7833; i_248_++) {
				anInt7888 += this.anIntArray7834[i_248_];
				anInt7866 += this.anIntArray7835[i_248_];
				anInt7890 += this.anIntArray7836[i_248_];
				i_247_++;
			}
			if (i_247_ > 0) {
				anInt7888 = anInt7888 / i_247_ + transformX;
				anInt7866 = anInt7866 / i_247_ + transformY;
				anInt7890 = anInt7890 / i_247_ + transformZ;
			} else {
				anInt7888 = transformX;
				anInt7866 = transformY;
				anInt7890 = transformZ;
			}
		} else if (transformType == AnimationFrameBase.UNKNOWN1) {
			for (int i_249_ = 0; i_249_ < this.anInt7833; i_249_++) {
				this.anIntArray7834[i_249_] += transformX;
				this.anIntArray7835[i_249_] += transformY;
				this.anIntArray7836[i_249_] += transformZ;
			}
		} else if (transformType == AnimationFrameBase.UNKNOWN2) {
			for (int i_250_ = 0; i_250_ < this.anInt7833; i_250_++) {
				this.anIntArray7834[i_250_] -= anInt7888;
				this.anIntArray7835[i_250_] -= anInt7866;
				this.anIntArray7836[i_250_] -= anInt7890;
				if (transformZ != 0) {
					int i_251_ = CircleAngleTable.SINE[transformZ];
					int i_252_ = CircleAngleTable.COSINE[transformZ];
					int i_253_ = (((this.anIntArray7835[i_250_] * i_251_) + (this.anIntArray7834[i_250_] * i_252_) + 16383) >> 14);
					this.anIntArray7835[i_250_] = ((this.anIntArray7835[i_250_] * i_252_) - (this.anIntArray7834[i_250_] * i_251_) + 16383) >> 14;
					this.anIntArray7834[i_250_] = i_253_;
				}
				if (transformX != 0) {
					int i_254_ = CircleAngleTable.SINE[transformX];
					int i_255_ = CircleAngleTable.COSINE[transformX];
					int i_256_ = (((this.anIntArray7835[i_250_] * i_255_) - (this.anIntArray7836[i_250_] * i_254_) + 16383) >> 14);
					this.anIntArray7836[i_250_] = ((this.anIntArray7835[i_250_] * i_254_) + (this.anIntArray7836[i_250_] * i_255_) + 16383) >> 14;
					this.anIntArray7835[i_250_] = i_256_;
				}
				if (transformY != 0) {
					int i_257_ = CircleAngleTable.SINE[transformY];
					int i_258_ = CircleAngleTable.COSINE[transformY];
					int i_259_ = (((this.anIntArray7836[i_250_] * i_257_) + (this.anIntArray7834[i_250_] * i_258_) + 16383) >> 14);
					this.anIntArray7836[i_250_] = ((this.anIntArray7836[i_250_] * i_258_) - (this.anIntArray7834[i_250_] * i_257_) + 16383) >> 14;
					this.anIntArray7834[i_250_] = i_259_;
				}
				this.anIntArray7834[i_250_] += anInt7888;
				this.anIntArray7835[i_250_] += anInt7866;
				this.anIntArray7836[i_250_] += anInt7890;
			}
		} else if (transformType == AnimationFrameBase.UNKNOWN3) {
			for (int i_260_ = 0; i_260_ < this.anInt7833; i_260_++) {
				this.anIntArray7834[i_260_] -= anInt7888;
				this.anIntArray7835[i_260_] -= anInt7866;
				this.anIntArray7836[i_260_] -= anInt7890;
				this.anIntArray7834[i_260_] = (this.anIntArray7834[i_260_] * transformX / 128);
				this.anIntArray7835[i_260_] = (this.anIntArray7835[i_260_] * transformY / 128);
				this.anIntArray7836[i_260_] = (this.anIntArray7836[i_260_] * transformZ / 128);
				this.anIntArray7834[i_260_] += anInt7888;
				this.anIntArray7835[i_260_] += anInt7866;
				this.anIntArray7836[i_260_] += anInt7890;
			}
		} else if (transformType == AnimationFrameBase.UNKNOWN5) {
			for (int i_261_ = 0; i_261_ < this.anInt7847; i_261_++) {
				int i_262_ = ((this.aByteArray7850[i_261_] & 0xff) + transformX * 8);
				if (i_262_ < 0)
					i_262_ = 0;
				else if (i_262_ > 255)
					i_262_ = 255;
				this.aByteArray7850[i_261_] = (byte) i_262_;
			}
			if (this.aClass32_7858 != null)
				this.aClass32_7858.anInterface1_397 = null;
			if (this.aClass54Array7880 != null) {
				for (int i_263_ = 0; i_263_ < this.anInt7877; i_263_++) {
					Class54 class54 = this.aClass54Array7880[i_263_];
					Class36 class36 = this.aClass36Array7875[i_263_];
					class36.anInt424 = (class36.anInt424 & 0xffffff | 255 - ((this.aByteArray7850[class54.anInt549]) & 0xff) << 24);
				}
			}
		} else if (transformType == AnimationFrameBase.UNKNOWN7) {
			for (int i_264_ = 0; i_264_ < this.anInt7847; i_264_++) {
				int i_265_ = this.aShortArray7849[i_264_] & 0xffff;
				int i_266_ = i_265_ >> 10 & 0x3f;
				int i_267_ = i_265_ >> 7 & 0x7;
				int i_268_ = i_265_ & 0x7f;
				i_266_ = i_266_ + transformX & 0x3f;
				i_267_ += transformY / 4;
				if (i_267_ < 0)
					i_267_ = 0;
				else if (i_267_ > 7)
					i_267_ = 7;
				i_268_ += transformZ;
				if (i_268_ < 0)
					i_268_ = 0;
				else if (i_268_ > 127)
					i_268_ = 127;
				this.aShortArray7849[i_264_] = (short) (i_266_ << 10 | i_267_ << 7 | i_268_);
			}
			if (this.aClass32_7858 != null)
				this.aClass32_7858.anInterface1_397 = null;
			if (this.aClass54Array7880 != null) {
				for (int i_269_ = 0; i_269_ < this.anInt7877; i_269_++) {
					Class54 class54 = this.aClass54Array7880[i_269_];
					Class36 class36 = this.aClass36Array7875[i_269_];
					class36.anInt424 = (class36.anInt424 & ~0xffffff | ((Class294.anIntArray3165[(this.aShortArray7849[class54.anInt549]) & 0xffff]) & 0xffffff));
				}
			}
		} else if (transformType == AnimationFrameBase.UNKNOWN8) {
			for (int i_270_ = 0; i_270_ < this.anInt7877; i_270_++) {
				Class36 class36 = this.aClass36Array7875[i_270_];
				class36.anInt422 += transformX;
				class36.anInt419 += transformY;
			}
		} else if (transformType == AnimationFrameBase.UNKNOWN10) {
			for (int i_271_ = 0; i_271_ < this.anInt7877; i_271_++) {
				Class36 class36 = this.aClass36Array7875[i_271_];
				class36.anInt420 = class36.anInt420 * transformX >> 7;
				class36.anInt421 = class36.anInt421 * transformY >> 7;
			}
		} else if (transformType == AnimationFrameBase.UNKNOWN9) {
			for (int i_272_ = 0; i_272_ < this.anInt7877; i_272_++) {
				Class36 class36 = this.aClass36Array7875[i_272_];
				class36.anInt423 = class36.anInt423 + transformX & 0x3fff;
			}
		}
	}

	void method4738(int transformationType, int[] is, int i_273_, int i_274_, int i_275_, int i_276_, boolean bool) {
		int i_277_ = is.length;
		if (transformationType == AnimationFrameBase.UNKNOWN0) {
			i_273_ <<= 4;
			i_274_ <<= 4;
			i_275_ <<= 4;
			int i_278_ = 0;
			anInt7888 = 0;
			anInt7866 = 0;
			anInt7890 = 0;
			for (int i_279_ = 0; i_279_ < i_277_; i_279_++) {
				int i_280_ = is[i_279_];
				if (i_280_ < this.anIntArrayArray7837.length) {
					int[] is_281_ = this.anIntArrayArray7837[i_280_];
					for (int i_282_ = 0; i_282_ < is_281_.length; i_282_++) {
						int i_283_ = is_281_[i_282_];
						anInt7888 += this.anIntArray7834[i_283_];
						anInt7866 += this.anIntArray7835[i_283_];
						anInt7890 += this.anIntArray7836[i_283_];
						i_278_++;
					}
				}
			}
			if (i_278_ > 0) {
				anInt7888 = anInt7888 / i_278_ + i_273_;
				anInt7866 = anInt7866 / i_278_ + i_274_;
				anInt7890 = anInt7890 / i_278_ + i_275_;
			} else {
				anInt7888 = i_273_;
				anInt7866 = i_274_;
				anInt7890 = i_275_;
			}
		} else if (transformationType == AnimationFrameBase.UNKNOWN1) {
			i_273_ <<= 4;
			i_274_ <<= 4;
			i_275_ <<= 4;
			for (int i_284_ = 0; i_284_ < i_277_; i_284_++) {
				int i_285_ = is[i_284_];
				if (i_285_ < this.anIntArrayArray7837.length) {
					int[] is_286_ = this.anIntArrayArray7837[i_285_];
					for (int i_287_ = 0; i_287_ < is_286_.length; i_287_++) {
						int i_288_ = is_286_[i_287_];
						this.anIntArray7834[i_288_] += i_273_;
						this.anIntArray7835[i_288_] += i_274_;
						this.anIntArray7836[i_288_] += i_275_;
					}
				}
			}
		} else if (transformationType == AnimationFrameBase.UNKNOWN2) {
			for (int i_289_ = 0; i_289_ < i_277_; i_289_++) {
				int i_290_ = is[i_289_];
				if (i_290_ < this.anIntArrayArray7837.length) {
					int[] is_291_ = this.anIntArrayArray7837[i_290_];
					if ((i_276_ & 0x1) == 0) {
						for (int i_292_ = 0; i_292_ < is_291_.length; i_292_++) {
							int i_293_ = is_291_[i_292_];
							this.anIntArray7834[i_293_] -= anInt7888;
							this.anIntArray7835[i_293_] -= anInt7866;
							this.anIntArray7836[i_293_] -= anInt7890;
							if (i_275_ != 0) {
								int i_294_ = CircleAngleTable.SINE[i_275_];
								int i_295_ = CircleAngleTable.COSINE[i_275_];
								int i_296_ = (((this.anIntArray7835[i_293_]) * i_294_ + (this.anIntArray7834[i_293_]) * i_295_ + 16383) >> 14);
								this.anIntArray7835[i_293_] = ((this.anIntArray7835[i_293_]) * i_295_ - (this.anIntArray7834[i_293_]) * i_294_ + 16383) >> 14;
								this.anIntArray7834[i_293_] = i_296_;
							}
							if (i_273_ != 0) {
								int i_297_ = CircleAngleTable.SINE[i_273_];
								int i_298_ = CircleAngleTable.COSINE[i_273_];
								int i_299_ = (((this.anIntArray7835[i_293_]) * i_298_ - (this.anIntArray7836[i_293_]) * i_297_ + 16383) >> 14);
								this.anIntArray7836[i_293_] = ((this.anIntArray7835[i_293_]) * i_297_ + (this.anIntArray7836[i_293_]) * i_298_ + 16383) >> 14;
								this.anIntArray7835[i_293_] = i_299_;
							}
							if (i_274_ != 0) {
								int i_300_ = CircleAngleTable.SINE[i_274_];
								int i_301_ = CircleAngleTable.COSINE[i_274_];
								int i_302_ = (((this.anIntArray7836[i_293_]) * i_300_ + (this.anIntArray7834[i_293_]) * i_301_ + 16383) >> 14);
								this.anIntArray7836[i_293_] = ((this.anIntArray7836[i_293_]) * i_301_ - (this.anIntArray7834[i_293_]) * i_300_ + 16383) >> 14;
								this.anIntArray7834[i_293_] = i_302_;
							}
							this.anIntArray7834[i_293_] += anInt7888;
							this.anIntArray7835[i_293_] += anInt7866;
							this.anIntArray7836[i_293_] += anInt7890;
						}
					} else {
						for (int i_303_ = 0; i_303_ < is_291_.length; i_303_++) {
							int i_304_ = is_291_[i_303_];
							this.anIntArray7834[i_304_] -= anInt7888;
							this.anIntArray7835[i_304_] -= anInt7866;
							this.anIntArray7836[i_304_] -= anInt7890;
							if (i_273_ != 0) {
								int i_305_ = CircleAngleTable.SINE[i_273_];
								int i_306_ = CircleAngleTable.COSINE[i_273_];
								int i_307_ = (((this.anIntArray7835[i_304_]) * i_306_ - (this.anIntArray7836[i_304_]) * i_305_ + 16383) >> 14);
								this.anIntArray7836[i_304_] = ((this.anIntArray7835[i_304_]) * i_305_ + (this.anIntArray7836[i_304_]) * i_306_ + 16383) >> 14;
								this.anIntArray7835[i_304_] = i_307_;
							}
							if (i_275_ != 0) {
								int i_308_ = CircleAngleTable.SINE[i_275_];
								int i_309_ = CircleAngleTable.COSINE[i_275_];
								int i_310_ = (((this.anIntArray7835[i_304_]) * i_308_ + (this.anIntArray7834[i_304_]) * i_309_ + 16383) >> 14);
								this.anIntArray7835[i_304_] = ((this.anIntArray7835[i_304_]) * i_309_ - (this.anIntArray7834[i_304_]) * i_308_ + 16383) >> 14;
								this.anIntArray7834[i_304_] = i_310_;
							}
							if (i_274_ != 0) {
								int i_311_ = CircleAngleTable.SINE[i_274_];
								int i_312_ = CircleAngleTable.COSINE[i_274_];
								int i_313_ = (((this.anIntArray7836[i_304_]) * i_311_ + (this.anIntArray7834[i_304_]) * i_312_ + 16383) >> 14);
								this.anIntArray7836[i_304_] = ((this.anIntArray7836[i_304_]) * i_312_ - (this.anIntArray7834[i_304_]) * i_311_ + 16383) >> 14;
								this.anIntArray7834[i_304_] = i_313_;
							}
							this.anIntArray7834[i_304_] += anInt7888;
							this.anIntArray7835[i_304_] += anInt7866;
							this.anIntArray7836[i_304_] += anInt7890;
						}
					}
				}
			}
			if (bool) {
				for (int i_314_ = 0; i_314_ < i_277_; i_314_++) {
					int i_315_ = is[i_314_];
					if (i_315_ < this.anIntArrayArray7837.length) {
						int[] is_316_ = (this.anIntArrayArray7837[i_315_]);
						for (int i_317_ = 0; i_317_ < is_316_.length; i_317_++) {
							int i_318_ = is_316_[i_317_];
							int i_319_ = (this.anIntArray7854[i_318_]);
							int i_320_ = (this.anIntArray7854[i_318_ + 1]);
							for (int i_321_ = i_319_; i_321_ < i_320_; i_321_++) {
								int i_322_ = ((this.aShortArray7830[i_321_]) - 1);
								if (i_322_ == -1)
									break;
								if (i_275_ != 0) {
									int i_323_ = CircleAngleTable.SINE[i_275_];
									int i_324_ = CircleAngleTable.COSINE[i_275_];
									int i_325_ = (((this.aShortArray7841[i_322_]) * i_323_ + ((this.aShortArray7829[i_322_]) * i_324_) + 16383) >> 14);
									this.aShortArray7841[i_322_] = (short) ((((this.aShortArray7841[i_322_]) * i_324_) - (this.aShortArray7829[i_322_]) * i_323_ + 16383) >> 14);
									this.aShortArray7829[i_322_] = (short) i_325_;
								}
								if (i_273_ != 0) {
									int i_326_ = CircleAngleTable.SINE[i_273_];
									int i_327_ = CircleAngleTable.COSINE[i_273_];
									int i_328_ = (((this.aShortArray7841[i_322_]) * i_327_ - ((this.aShortArray7842[i_322_]) * i_326_) + 16383) >> 14);
									this.aShortArray7842[i_322_] = (short) ((((this.aShortArray7841[i_322_]) * i_326_) + (this.aShortArray7842[i_322_]) * i_327_ + 16383) >> 14);
									this.aShortArray7841[i_322_] = (short) i_328_;
								}
								if (i_274_ != 0) {
									int i_329_ = CircleAngleTable.SINE[i_274_];
									int i_330_ = CircleAngleTable.COSINE[i_274_];
									int i_331_ = (((this.aShortArray7842[i_322_]) * i_329_ + ((this.aShortArray7829[i_322_]) * i_330_) + 16383) >> 14);
									this.aShortArray7842[i_322_] = (short) ((((this.aShortArray7842[i_322_]) * i_330_) - (this.aShortArray7829[i_322_]) * i_329_ + 16383) >> 14);
									this.aShortArray7829[i_322_] = (short) i_331_;
								}
							}
						}
					}
				}
				if (this.aClass32_7889 == null && this.aClass32_7858 != null)
					this.aClass32_7858.anInterface1_397 = null;
				if (this.aClass32_7889 != null)
					this.aClass32_7889.anInterface1_397 = null;
			}
		} else if (transformationType == AnimationFrameBase.UNKNOWN3) {
			for (int i_332_ = 0; i_332_ < i_277_; i_332_++) {
				int i_333_ = is[i_332_];
				if (i_333_ < this.anIntArrayArray7837.length) {
					int[] is_334_ = this.anIntArrayArray7837[i_333_];
					for (int i_335_ = 0; i_335_ < is_334_.length; i_335_++) {
						int i_336_ = is_334_[i_335_];
						this.anIntArray7834[i_336_] -= anInt7888;
						this.anIntArray7835[i_336_] -= anInt7866;
						this.anIntArray7836[i_336_] -= anInt7890;
						this.anIntArray7834[i_336_] = (this.anIntArray7834[i_336_] * i_273_) >> 7;
						this.anIntArray7835[i_336_] = (this.anIntArray7835[i_336_] * i_274_) >> 7;
						this.anIntArray7836[i_336_] = (this.anIntArray7836[i_336_] * i_275_) >> 7;
						this.anIntArray7834[i_336_] += anInt7888;
						this.anIntArray7835[i_336_] += anInt7866;
						this.anIntArray7836[i_336_] += anInt7890;
					}
				}
			}
		} else if (transformationType == AnimationFrameBase.UNKNOWN5) {
			if (this.anIntArrayArray7855 != null) {
				for (int i_337_ = 0; i_337_ < i_277_; i_337_++) {
					int i_338_ = is[i_337_];
					if (i_338_ < this.anIntArrayArray7855.length) {
						int[] is_339_ = (this.anIntArrayArray7855[i_338_]);
						for (int i_340_ = 0; i_340_ < is_339_.length; i_340_++) {
							int i_341_ = is_339_[i_340_];
							int i_342_ = (((this.aByteArray7850[i_341_]) & 0xff) + i_273_ * 8);
							if (i_342_ < 0)
								i_342_ = 0;
							else if (i_342_ > 255)
								i_342_ = 255;
							this.aByteArray7850[i_341_] = (byte) i_342_;
						}
						if (is_339_.length > 0 && this.aClass32_7858 != null)
							this.aClass32_7858.anInterface1_397 = null;
					}
				}
				if (this.aClass54Array7880 != null) {
					for (int i_343_ = 0; i_343_ < this.anInt7877; i_343_++) {
						Class54 class54 = this.aClass54Array7880[i_343_];
						Class36 class36 = this.aClass36Array7875[i_343_];
						class36.anInt424 = (class36.anInt424 & 0xffffff | 255 - ((this.aByteArray7850[class54.anInt549]) & 0xff) << 24);
					}
				}
			}
		} else if (transformationType == AnimationFrameBase.UNKNOWN7) {
			if (this.anIntArrayArray7855 != null) {
				for (int i_344_ = 0; i_344_ < i_277_; i_344_++) {
					int i_345_ = is[i_344_];
					if (i_345_ < this.anIntArrayArray7855.length) {
						int[] is_346_ = (this.anIntArrayArray7855[i_345_]);
						for (int i_347_ = 0; i_347_ < is_346_.length; i_347_++) {
							int i_348_ = is_346_[i_347_];
							int i_349_ = ((this.aShortArray7849[i_348_]) & 0xffff);
							int i_350_ = i_349_ >> 10 & 0x3f;
							int i_351_ = i_349_ >> 7 & 0x7;
							int i_352_ = i_349_ & 0x7f;
							i_350_ = i_350_ + i_273_ & 0x3f;
							i_351_ += i_274_ / 4;
							if (i_351_ < 0)
								i_351_ = 0;
							else if (i_351_ > 7)
								i_351_ = 7;
							i_352_ += i_275_;
							if (i_352_ < 0)
								i_352_ = 0;
							else if (i_352_ > 127)
								i_352_ = 127;
							this.aShortArray7849[i_348_] = (short) (i_350_ << 10 | i_351_ << 7 | i_352_);
						}
						if (is_346_.length > 0 && this.aClass32_7858 != null)
							this.aClass32_7858.anInterface1_397 = null;
					}
				}
				if (this.aClass54Array7880 != null) {
					for (int i_353_ = 0; i_353_ < this.anInt7877; i_353_++) {
						Class54 class54 = this.aClass54Array7880[i_353_];
						Class36 class36 = this.aClass36Array7875[i_353_];
						class36.anInt424 = (class36.anInt424 & ~0xffffff | ((Class294.anIntArray3165[(this.aShortArray7849[class54.anInt549]) & 0xffff]) & 0xffffff));
					}
				}
			}
		} else if (transformationType == AnimationFrameBase.UNKNOWN8) {
			if (this.anIntArrayArray7882 != null) {
				for (int i_354_ = 0; i_354_ < i_277_; i_354_++) {
					int i_355_ = is[i_354_];
					if (i_355_ < this.anIntArrayArray7882.length) {
						int[] is_356_ = (this.anIntArrayArray7882[i_355_]);
						for (int i_357_ = 0; i_357_ < is_356_.length; i_357_++) {
							Class36 class36 = (this.aClass36Array7875[is_356_[i_357_]]);
							class36.anInt422 += i_273_;
							class36.anInt419 += i_274_;
						}
					}
				}
			}
		} else if (transformationType == AnimationFrameBase.UNKNOWN10) {
			if (this.anIntArrayArray7882 != null) {
				for (int i_358_ = 0; i_358_ < i_277_; i_358_++) {
					int i_359_ = is[i_358_];
					if (i_359_ < this.anIntArrayArray7882.length) {
						int[] is_360_ = (this.anIntArrayArray7882[i_359_]);
						for (int i_361_ = 0; i_361_ < is_360_.length; i_361_++) {
							Class36 class36 = (this.aClass36Array7875[is_360_[i_361_]]);
							class36.anInt420 = class36.anInt420 * i_273_ >> 7;
							class36.anInt421 = class36.anInt421 * i_274_ >> 7;
						}
					}
				}
			}
		} else if (transformationType == AnimationFrameBase.UNKNOWN9) {
			if (this.anIntArrayArray7882 != null) {
				for (int i_362_ = 0; i_362_ < i_277_; i_362_++) {
					int i_363_ = is[i_362_];
					if (i_363_ < this.anIntArrayArray7882.length) {
						int[] is_364_ = (this.anIntArrayArray7882[i_363_]);
						for (int i_365_ = 0; i_365_ < is_364_.length; i_365_++) {
							Class36 class36 = (this.aClass36Array7875[is_364_[i_365_]]);
							class36.anInt423 = (class36.anInt423 + i_273_ & 0x3fff);
						}
					}
				}
			}
		}
	}

	void ka() {
		for (int i = 0; i < this.anInt7832; i++) {
			this.anIntArray7834[i] = this.anIntArray7834[i] + 7 >> 4;
			this.anIntArray7835[i] = this.anIntArray7835[i] + 7 >> 4;
			this.anIntArray7836[i] = this.anIntArray7836[i] + 7 >> 4;
		}
		if (this.aClass32_7831 != null)
			this.aClass32_7831.anInterface1_397 = null;
		this.aBoolean7843 = false;
	}

	public void f(int i) {
		int i_366_ = CircleAngleTable.SINE[i];
		int i_367_ = CircleAngleTable.COSINE[i];
		for (int i_368_ = 0; i_368_ < this.anInt7833; i_368_++) {
			int i_369_ = ((this.anIntArray7836[i_368_] * i_366_ + this.anIntArray7834[i_368_] * i_367_) >> 14);
			this.anIntArray7836[i_368_] = ((this.anIntArray7836[i_368_] * i_367_ - this.anIntArray7834[i_368_] * i_366_) >> 14);
			this.anIntArray7834[i_368_] = i_369_;
		}
		if (this.aClass32_7831 != null)
			this.aClass32_7831.anInterface1_397 = null;
		this.aBoolean7843 = false;
	}

	public EffectiveVertex[] method4445() {
		return this.aEffectiveVertexArray7857;
	}

	public boolean method4787(int i, int i_376_, Matrix43f class222, boolean bool, int i_377_) {
		Matrix4f matrix4f = (this.openGLGraphicsToolkit.aMatrix4f_8104);
		matrix4f.method2145(class222);
		matrix4f.method2144(this.openGLGraphicsToolkit.aMatrix4f_8069);
		boolean bool_378_ = false;
		int i_379_ = 2147483647;
		int i_380_ = -2147483648;
		int i_381_ = 2147483647;
		int i_382_ = -2147483648;
		if (!this.aBoolean7843)
			method4831();
		int i_383_ = ((this.aShort7871 - this.aShort7870) >> 1);
		int i_384_ = ((this.aShort7874 - this.aShort7868) >> 1);
		int i_385_ = ((this.aShort7876 - this.aShort7872) >> 1);
		int i_386_ = this.aShort7870 + i_383_;
		int i_387_ = this.aShort7868 + i_384_;
		int i_388_ = this.aShort7872 + i_385_;
		int i_389_ = i_386_ - (i_383_ << i_377_);
		int i_390_ = i_387_ - (i_384_ << i_377_);
		int i_391_ = i_388_ - (i_385_ << i_377_);
		int i_392_ = i_386_ + (i_383_ << i_377_);
		int i_393_ = i_387_ + (i_384_ << i_377_);
		int i_394_ = i_388_ + (i_385_ << i_377_);
		anIntArray7867[0] = i_389_;
		anIntArray7886[0] = i_390_;
		anIntArray7848[0] = i_391_;
		anIntArray7867[1] = i_392_;
		anIntArray7886[1] = i_390_;
		anIntArray7848[1] = i_391_;
		anIntArray7867[2] = i_389_;
		anIntArray7886[2] = i_393_;
		anIntArray7848[2] = i_391_;
		anIntArray7867[3] = i_392_;
		anIntArray7886[3] = i_393_;
		anIntArray7848[3] = i_391_;
		anIntArray7867[4] = i_389_;
		anIntArray7886[4] = i_390_;
		anIntArray7848[4] = i_394_;
		anIntArray7867[5] = i_392_;
		anIntArray7886[5] = i_390_;
		anIntArray7848[5] = i_394_;
		anIntArray7867[6] = i_389_;
		anIntArray7886[6] = i_393_;
		anIntArray7848[6] = i_394_;
		anIntArray7867[7] = i_392_;
		anIntArray7886[7] = i_393_;
		anIntArray7848[7] = i_394_;
		for (int i_395_ = 0; i_395_ < 8; i_395_++) {
			int i_396_ = anIntArray7867[i_395_];
			int i_397_ = anIntArray7886[i_395_];
			int i_398_ = anIntArray7848[i_395_];
			float f = (matrix4f.aFloatArray2594[2] * (float) i_396_ + matrix4f.aFloatArray2594[6] * (float) i_397_ + matrix4f.aFloatArray2594[10] * (float) i_398_ + matrix4f.aFloatArray2594[14]);
			float f_399_ = (matrix4f.aFloatArray2594[3] * (float) i_396_ + matrix4f.aFloatArray2594[7] * (float) i_397_ + matrix4f.aFloatArray2594[11] * (float) i_398_ + matrix4f.aFloatArray2594[15]);
			if (f >= -f_399_) {
				float f_400_ = (matrix4f.aFloatArray2594[0] * (float) i_396_ + matrix4f.aFloatArray2594[4] * (float) i_397_ + matrix4f.aFloatArray2594[8] * (float) i_398_ + matrix4f.aFloatArray2594[12]);
				float f_401_ = (matrix4f.aFloatArray2594[1] * (float) i_396_ + matrix4f.aFloatArray2594[5] * (float) i_397_ + matrix4f.aFloatArray2594[9] * (float) i_398_ + matrix4f.aFloatArray2594[13]);
				int i_402_ = (int) ((this.openGLGraphicsToolkit.aFloat8095) + (this.openGLGraphicsToolkit.aFloat8096) * f_400_ / f_399_);
				int i_403_ = (int) ((this.openGLGraphicsToolkit.aFloat8097) + (this.openGLGraphicsToolkit.aFloat8098) * f_401_ / f_399_);
				if (i_402_ < i_379_)
					i_379_ = i_402_;
				if (i_402_ > i_380_)
					i_380_ = i_402_;
				if (i_403_ < i_381_)
					i_381_ = i_403_;
				if (i_403_ > i_382_)
					i_382_ = i_403_;
				bool_378_ = true;
			}
		}
		if (bool_378_ && i > i_379_ && i < i_380_ && i_376_ > i_381_ && i_376_ < i_382_) {
			if (bool)
				return true;
			if ((this.openGLGraphicsToolkit.anIntArray8198).length < this.anInt7839) {
				this.openGLGraphicsToolkit.anIntArray8198 = new int[this.anInt7839];
				this.openGLGraphicsToolkit.anIntArray8199 = new int[this.anInt7839];
			}
			int[] is = (this.openGLGraphicsToolkit.anIntArray8198);
			int[] is_404_ = (this.openGLGraphicsToolkit.anIntArray8199);
			for (int i_405_ = 0; i_405_ < this.anInt7833; i_405_++) {
				int i_406_ = this.anIntArray7834[i_405_];
				int i_407_ = this.anIntArray7835[i_405_];
				int i_408_ = this.anIntArray7836[i_405_];
				float f = (matrix4f.aFloatArray2594[2] * (float) i_406_ + matrix4f.aFloatArray2594[6] * (float) i_407_ + matrix4f.aFloatArray2594[10] * (float) i_408_ + matrix4f.aFloatArray2594[14]);
				float f_409_ = (matrix4f.aFloatArray2594[3] * (float) i_406_ + matrix4f.aFloatArray2594[7] * (float) i_407_ + matrix4f.aFloatArray2594[11] * (float) i_408_ + matrix4f.aFloatArray2594[15]);
				if (f >= -f_409_) {
					float f_410_ = (matrix4f.aFloatArray2594[0] * (float) i_406_ + matrix4f.aFloatArray2594[4] * (float) i_407_ + matrix4f.aFloatArray2594[8] * (float) i_408_ + matrix4f.aFloatArray2594[12]);
					float f_411_ = (matrix4f.aFloatArray2594[1] * (float) i_406_ + matrix4f.aFloatArray2594[5] * (float) i_407_ + matrix4f.aFloatArray2594[9] * (float) i_408_ + matrix4f.aFloatArray2594[13]);
					int i_412_ = this.anIntArray7854[i_405_];
					int i_413_ = this.anIntArray7854[i_405_ + 1];
					for (int i_414_ = i_412_; i_414_ < i_413_; i_414_++) {
						int i_415_ = (this.aShortArray7830[i_414_] - 1);
						if (i_415_ == -1)
							break;
						is[i_415_] = (int) ((this.openGLGraphicsToolkit.aFloat8095) + (this.openGLGraphicsToolkit.aFloat8096 * f_410_ / f_409_));
						is_404_[i_415_] = (int) ((this.openGLGraphicsToolkit.aFloat8097) + (this.openGLGraphicsToolkit.aFloat8098 * f_411_ / f_409_));
					}
				} else {
					int i_416_ = this.anIntArray7854[i_405_];
					int i_417_ = this.anIntArray7854[i_405_ + 1];
					for (int i_418_ = i_416_; i_418_ < i_417_; i_418_++) {
						int i_419_ = (this.aShortArray7830[i_418_] - 1);
						if (i_419_ == -1)
							break;
						is[this.aShortArray7830[i_418_] - 1] = -999999;
					}
				}
			}
			for (int i_420_ = 0; i_420_ < this.anInt7847; i_420_++) {
				if ((is[this.aShortArray7851[i_420_]] != -999999) && (is[this.aShortArray7852[i_420_]] != -999999) && (is[this.aShortArray7853[i_420_]] != -999999) && method4821(i, i_376_, is_404_[(this.aShortArray7851[i_420_])], is_404_[(this.aShortArray7852[i_420_])], is_404_[(this.aShortArray7853[i_420_])], is[(this.aShortArray7851[i_420_])], is[(this.aShortArray7852[i_420_])], is[(this.aShortArray7853[i_420_])]))
					return true;
			}
		}
		return false;
	}

	boolean method4821(int i, int i_421_, int i_422_, int i_423_, int i_424_, int i_425_, int i_426_, int i_427_) {
		if (i_421_ < i_422_ && i_421_ < i_423_ && i_421_ < i_424_)
			return false;
		if (i_421_ > i_422_ && i_421_ > i_423_ && i_421_ > i_424_)
			return false;
		if (i < i_425_ && i < i_426_ && i < i_427_)
			return false;
        return !(i > i_425_ && i > i_426_ && i > i_427_);
    }

	public Class_na ga(Class_na class_na) {
		if (this.anInt7839 == 0)
			return null;
		if (!this.aBoolean7843)
			method4831();
		int i;
		int i_428_;
		if ((this.openGLGraphicsToolkit.anInt8066) > 0) {
			i = ((this.aShort7870 - ((this.aShort7874 * this.openGLGraphicsToolkit.anInt8066) >> 8)) >> this.openGLGraphicsToolkit.anInt8064);
			i_428_ = ((this.aShort7871 - ((this.aShort7868 * this.openGLGraphicsToolkit.anInt8066) >> 8)) >> this.openGLGraphicsToolkit.anInt8064);
		} else {
			i = ((this.aShort7870 - ((this.aShort7868 * this.openGLGraphicsToolkit.anInt8066) >> 8)) >> this.openGLGraphicsToolkit.anInt8064);
			i_428_ = ((this.aShort7871 - ((this.aShort7874 * this.openGLGraphicsToolkit.anInt8066) >> 8)) >> this.openGLGraphicsToolkit.anInt8064);
		}
		int i_429_;
		int i_430_;
		if ((this.openGLGraphicsToolkit.anInt8026) > 0) {
			i_429_ = ((this.aShort7872 - ((this.aShort7874 * this.openGLGraphicsToolkit.anInt8026) >> 8)) >> this.openGLGraphicsToolkit.anInt8064);
			i_430_ = ((this.aShort7876 - ((this.aShort7868 * this.openGLGraphicsToolkit.anInt8026) >> 8)) >> this.openGLGraphicsToolkit.anInt8064);
		} else {
			i_429_ = ((this.aShort7872 - ((this.aShort7868 * this.openGLGraphicsToolkit.anInt8026) >> 8)) >> this.openGLGraphicsToolkit.anInt8064);
			i_430_ = ((this.aShort7876 - ((this.aShort7874 * this.openGLGraphicsToolkit.anInt8026) >> 8)) >> this.openGLGraphicsToolkit.anInt8064);
		}
		int i_431_ = i_428_ - i + 1;
		int i_432_ = i_430_ - i_429_ + 1;
		Class_na_Sub1 class_na_sub1 = (Class_na_Sub1) class_na;
		Class_na_Sub1 class_na_sub1_433_;
		if (class_na_sub1 != null && class_na_sub1.method3481(i_431_, i_432_)) {
			class_na_sub1_433_ = class_na_sub1;
			class_na_sub1_433_.method3482();
		} else
			class_na_sub1_433_ = new Class_na_Sub1(this.openGLGraphicsToolkit, i_431_, i_432_);
		class_na_sub1_433_.method3485(i, i_429_, i_428_, i_430_);
		method4822(class_na_sub1_433_);
		return class_na_sub1_433_;
	}

	void method4822(Class_na_Sub1 class_na_sub1) {
		if ((this.openGLGraphicsToolkit.anIntArray8198).length < this.anInt7839) {
			this.openGLGraphicsToolkit.anIntArray8198 = new int[this.anInt7839];
			this.openGLGraphicsToolkit.anIntArray8199 = new int[this.anInt7839];
		}
		int[] is = (this.openGLGraphicsToolkit.anIntArray8198);
		int[] is_434_ = (this.openGLGraphicsToolkit.anIntArray8199);
		for (int i = 0; i < this.anInt7833; i++) {
			int i_435_ = (((this.anIntArray7834[i] - ((this.anIntArray7835[i] * this.openGLGraphicsToolkit.anInt8066) >> 8)) >> this.openGLGraphicsToolkit.anInt8064) - class_na_sub1.anInt10012);
			int i_436_ = (((this.anIntArray7836[i] - ((this.anIntArray7835[i] * this.openGLGraphicsToolkit.anInt8026) >> 8)) >> this.openGLGraphicsToolkit.anInt8064) - class_na_sub1.anInt10016);
			int i_437_ = this.anIntArray7854[i];
			int i_438_ = this.anIntArray7854[i + 1];
			for (int i_439_ = i_437_; i_439_ < i_438_; i_439_++) {
				int i_440_ = ((this.aShortArray7830[i_439_] & 0xffff) - 1);
				if (i_440_ == -1)
					break;
				is[i_440_] = i_435_;
				is_434_[i_440_] = i_436_;
			}
		}
		for (int i = 0; i < this.anInt7885; i++) {
			if (this.aByteArray7850 == null || this.aByteArray7850[i] <= 128) {
				int i_441_ = this.aShortArray7851[i] & 0xffff;
				int i_442_ = this.aShortArray7852[i] & 0xffff;
				int i_443_ = this.aShortArray7853[i] & 0xffff;
				int i_444_ = is[i_441_];
				int i_445_ = is[i_442_];
				int i_446_ = is[i_443_];
				int i_447_ = is_434_[i_441_];
				int i_448_ = is_434_[i_442_];
				int i_449_ = is_434_[i_443_];
				if (((i_444_ - i_445_) * (i_448_ - i_449_) - (i_448_ - i_447_) * (i_446_ - i_445_)) > 0)
					class_na_sub1.method3483(i_447_, i_448_, i_449_, i_444_, i_445_, i_446_);
			}
		}
	}

	void method4823() {
		if (this.anInt7885 != 0) {
			if (this.aByte7827 != 0)
				method4825(true);
			method4825(false);
			if (this.aClass41_7879 != null) {
				if ((this.aClass41_7879.anInterface2_441) == null)
					method4830((this.aByte7827 & 0x10) != 0);
				if ((this.aClass41_7879.anInterface2_441) != null) {
					this.openGLGraphicsToolkit.method5262(this.aClass32_7889 != null);
					this.openGLGraphicsToolkit.method5248(this.aClass32_7831, this.aClass32_7889, this.aClass32_7858, this.aClass32_7860);
					int i = this.anIntArray7859.length - 1;
					for (int i_456_ = 0; i_456_ < i; i_456_++) {
						int i_457_ = this.anIntArray7859[i_456_];
						int i_458_ = (this.anIntArray7859[i_456_ + 1]);
						int i_459_ = (this.aShortArray7861[i_457_] & 0xffff);
						if (i_459_ == 65535)
							i_459_ = -1;
						this.openGLGraphicsToolkit.method5253(i_459_, this.aClass32_7889 != null);
						this.openGLGraphicsToolkit.method5254((this.aClass41_7879.anInterface2_441), 4, i_457_ * 3, (i_458_ - i_457_) * 3);
					}
				}
			}
			method4820();
		}
	}

	void method4824(Matrix4f matrix4f) {
		if (this.aClass54Array7880 != null) {
			Matrix4f matrix4f_460_ = (this.openGLGraphicsToolkit.aMatrix4f_8030);
			this.openGLGraphicsToolkit.method5236();
			this.openGLGraphicsToolkit.RA(!this.aBoolean7840);
			this.openGLGraphicsToolkit.method5262(false);
			this.openGLGraphicsToolkit.method5248((this.openGLGraphicsToolkit.aClass32_8092), null, null, (this.openGLGraphicsToolkit.aClass32_8193));
			for (int i = 0; i < this.anInt7877; i++) {
				Class54 class54 = this.aClass54Array7880[i];
				Class36 class36 = this.aClass36Array7875[i];
				if (!class54.aBoolean554 || !this.openGLGraphicsToolkit.method5054()) {
					float f = ((float) ((this.anIntArray7834[class54.anInt555]) + (this.anIntArray7834[class54.anInt547]) + (this.anIntArray7834[class54.anInt548])) * 0.3333333F);
					float f_461_ = ((float) ((this.anIntArray7835[class54.anInt555]) + (this.anIntArray7835[class54.anInt547]) + (this.anIntArray7835[class54.anInt548])) * 0.3333333F);
					float f_462_ = ((float) ((this.anIntArray7836[class54.anInt555]) + (this.anIntArray7836[class54.anInt547]) + (this.anIntArray7836[class54.anInt548])) * 0.3333333F);
					float f_463_ = (matrix4f.aFloatArray2594[0] * f + matrix4f.aFloatArray2594[4] * f_461_ + matrix4f.aFloatArray2594[8] * f_462_ + matrix4f.aFloatArray2594[12]);
					float f_464_ = (matrix4f.aFloatArray2594[1] * f + matrix4f.aFloatArray2594[5] * f_461_ + matrix4f.aFloatArray2594[9] * f_462_ + matrix4f.aFloatArray2594[13]);
					float f_465_ = (matrix4f.aFloatArray2594[2] * f + matrix4f.aFloatArray2594[6] * f_461_ + matrix4f.aFloatArray2594[10] * f_462_ + matrix4f.aFloatArray2594[14]);
					float f_466_ = ((float) (1.0 / Math.sqrt((double) (f_463_ * f_463_ + f_464_ * f_464_ + f_465_ * f_465_))) * (float) class54.anInt546);
					matrix4f_460_.method2164(class36.anInt423, (class36.anInt420 * class54.aShort550) >> 7, (class36.anInt421 * class54.aShort551) >> 7, (f_463_ + (float) class36.anInt422 - f_463_ * f_466_), (f_464_ + (float) class36.anInt419 - f_464_ * f_466_), f_465_ - f_465_ * f_466_);
					this.openGLGraphicsToolkit.method5233(matrix4f_460_);
					int i_467_ = class36.anInt424;
					OpenGL.glColor4ub((byte) (i_467_ >> 16), (byte) (i_467_ >> 8), (byte) i_467_, (byte) (i_467_ >> 24));
					this.openGLGraphicsToolkit.method5275(class54.aShort552);
					this.openGLGraphicsToolkit.method5266(class54.aByte553);
					this.openGLGraphicsToolkit.method5285(7, 0, 4);
				}
			}
			this.openGLGraphicsToolkit.RA(true);
			this.openGLGraphicsToolkit.method5287();
		}
	}

	void method4733() {
		/* empty */
	}

	void method4825(boolean bool) {
		boolean bool_468_ = (this.aClass32_7858 != null && (this.aClass32_7858.anInterface1_397) == null);
		boolean bool_469_ = (this.aClass32_7889 != null && (this.aClass32_7889.anInterface1_397) == null);
		boolean bool_470_ = (this.aClass32_7831 != null && (this.aClass32_7831.anInterface1_397) == null);
		boolean bool_471_ = (this.aClass32_7860 != null && (this.aClass32_7860.anInterface1_397) == null);
		if (bool) {
			bool_468_ = bool_468_ & (this.aByte7827 & 0x2) != 0;
			bool_469_ = bool_469_ & (this.aByte7827 & 0x4) != 0;
			bool_470_ = bool_470_ & (this.aByte7827 & 0x1) != 0;
			bool_471_ = bool_471_ & (this.aByte7827 & 0x8) != 0;
		}
		byte i = 0;
		byte i_472_ = 0;
		byte i_473_ = 0;
		byte i_474_ = 0;
		byte i_475_ = 0;
		if (bool_470_) {
			i_472_ = i;
			i += 12;
		}
		if (bool_468_) {
			i_473_ = i;
			i += 4;
		}
		if (bool_469_) {
			i_474_ = i;
			i += 12;
		}
		if (bool_471_) {
			i_475_ = i;
			i += 8;
		}
		if (i != 0) {
			if ((this.openGLGraphicsToolkit.aClass298_Sub53_Sub1_8197.buffer).length < this.anInt7839 * i)
				this.openGLGraphicsToolkit.aClass298_Sub53_Sub1_8197 = new RsFloatBuffer((this.anInt7839 + 100) * i);
			else
				this.openGLGraphicsToolkit.aClass298_Sub53_Sub1_8197.offset = 0;
			RsFloatBuffer class298_sub53_sub1 = (this.openGLGraphicsToolkit.aClass298_Sub53_Sub1_8197);
			if (bool_470_) {
				if (this.openGLGraphicsToolkit.aBoolean8143) {
					for (int i_476_ = 0; i_476_ < this.anInt7833; i_476_++) {
						int i_477_ = Stream.floatToRawIntBits((float) this.anIntArray7834[i_476_]);
						int i_478_ = Stream.floatToRawIntBits((float) this.anIntArray7835[i_476_]);
						int i_479_ = Stream.floatToRawIntBits((float) this.anIntArray7836[i_476_]);
						int i_480_ = this.anIntArray7854[i_476_];
						int i_481_ = (this.anIntArray7854[i_476_ + 1]);
						for (int i_482_ = i_480_; i_482_ < i_481_; i_482_++) {
							int i_483_ = ((this.aShortArray7830[i_482_]) - 1);
							if (i_483_ == -1)
								break;
							class298_sub53_sub1.offset = i_483_ * i * 116413311;
							class298_sub53_sub1.writeInt(i_477_);
							class298_sub53_sub1.writeInt(i_478_);
							class298_sub53_sub1.writeInt(i_479_);
						}
					}
				} else {
					for (int i_484_ = 0; i_484_ < this.anInt7833; i_484_++) {
						int i_485_ = Stream.floatToRawIntBits((float) this.anIntArray7834[i_484_]);
						int i_486_ = Stream.floatToRawIntBits((float) this.anIntArray7835[i_484_]);
						int i_487_ = Stream.floatToRawIntBits((float) this.anIntArray7836[i_484_]);
						int i_488_ = this.anIntArray7854[i_484_];
						int i_489_ = (this.anIntArray7854[i_484_ + 1]);
						for (int i_490_ = i_488_; i_490_ < i_489_; i_490_++) {
							int i_491_ = (((this.aShortArray7830[i_490_]) & 0xffff) - 1);
							if (i_491_ == -1)
								break;
							class298_sub53_sub1.offset = i_491_ * i * 116413311;
							class298_sub53_sub1.writeLEInt(i_485_);
							class298_sub53_sub1.writeLEInt(i_486_);
							class298_sub53_sub1.writeLEInt(i_487_);
						}
					}
				}
			}
			if (bool_468_) {
				if (this.aClass32_7889 == null) {
					short[] is;
					short[] is_492_;
					short[] is_493_;
					byte[] is_494_;
					if (this.aClass67_7844 != null) {
						is = (this.aClass67_7844.aShortArray669);
						is_492_ = (this.aClass67_7844.aShortArray668);
						is_493_ = (this.aClass67_7844.aShortArray667);
						is_494_ = (this.aClass67_7844.aByteArray670);
					} else {
						is = this.aShortArray7829;
						is_492_ = this.aShortArray7841;
						is_493_ = this.aShortArray7842;
						is_494_ = this.aByteArray7887;
					}
					float f = (this.openGLGraphicsToolkit.aFloatArray8124[0]);
					float f_495_ = (this.openGLGraphicsToolkit.aFloatArray8124[1]);
					float f_496_ = (this.openGLGraphicsToolkit.aFloatArray8124[2]);
					float f_497_ = (this.openGLGraphicsToolkit.aFloat8130);
					float f_498_ = (this.openGLGraphicsToolkit.aFloat8131 * 768.0F / (float) this.aShort7869);
					float f_499_ = (this.openGLGraphicsToolkit.aFloat8132 * 768.0F / (float) this.aShort7869);
					for (int i_500_ = 0; i_500_ < this.anInt7847; i_500_++) {
						int i_501_ = method4826((this.aShortArray7849[i_500_]), (this.aShortArray7861[i_500_]), this.aShort7828, (this.aByteArray7850[i_500_]));
						float f_502_ = ((float) (i_501_ >>> 24) * (this.openGLGraphicsToolkit.red));
						float f_503_ = ((float) (i_501_ >> 16 & 0xff) * (this.openGLGraphicsToolkit.green));
						float f_504_ = ((float) (i_501_ >> 8 & 0xff) * (this.openGLGraphicsToolkit.blue));
						int i_505_ = this.aShortArray7851[i_500_];
						short i_506_ = (short) is_494_[i_505_];
						float f_507_;
						if (i_506_ == 0)
							f_507_ = ((f * (float) is[i_505_] + f_495_ * (float) is_492_[i_505_] + f_496_ * (float) is_493_[i_505_]) * 0.0026041667F);
						else
							f_507_ = ((f * (float) is[i_505_] + f_495_ * (float) is_492_[i_505_] + f_496_ * (float) is_493_[i_505_]) / (float) (i_506_ * 256));
						float f_508_ = f_497_ + f_507_ * (f_507_ < 0.0F ? f_499_ : f_498_);
						int i_509_ = (int) (f_502_ * f_508_);
						if (i_509_ < 0)
							i_509_ = 0;
						else if (i_509_ > 255)
							i_509_ = 255;
						int i_510_ = (int) (f_503_ * f_508_);
						if (i_510_ < 0)
							i_510_ = 0;
						else if (i_510_ > 255)
							i_510_ = 255;
						int i_511_ = (int) (f_504_ * f_508_);
						if (i_511_ < 0)
							i_511_ = 0;
						else if (i_511_ > 255)
							i_511_ = 255;
						class298_sub53_sub1.offset = (i_473_ + i_505_ * i) * 116413311;
						class298_sub53_sub1.writeByte(i_509_);
						class298_sub53_sub1.writeByte(i_510_);
						class298_sub53_sub1.writeByte(i_511_);
						class298_sub53_sub1.writeByte(255 - ((this.aByteArray7850[i_500_]) & 0xff));
						i_505_ = this.aShortArray7852[i_500_];
						i_506_ = (short) is_494_[i_505_];
						if (i_506_ == 0)
							f_507_ = ((f * (float) is[i_505_] + f_495_ * (float) is_492_[i_505_] + f_496_ * (float) is_493_[i_505_]) * 0.0026041667F);
						else
							f_507_ = ((f * (float) is[i_505_] + f_495_ * (float) is_492_[i_505_] + f_496_ * (float) is_493_[i_505_]) / (float) (i_506_ * 256));
						f_508_ = f_497_ + f_507_ * (f_507_ < 0.0F ? f_499_ : f_498_);
						i_509_ = (int) (f_502_ * f_508_);
						if (i_509_ < 0)
							i_509_ = 0;
						else if (i_509_ > 255)
							i_509_ = 255;
						i_510_ = (int) (f_503_ * f_508_);
						if (i_510_ < 0)
							i_510_ = 0;
						else if (i_510_ > 255)
							i_510_ = 255;
						i_511_ = (int) (f_504_ * f_508_);
						if (i_511_ < 0)
							i_511_ = 0;
						else if (i_511_ > 255)
							i_511_ = 255;
						class298_sub53_sub1.offset = (i_473_ + i_505_ * i) * 116413311;
						class298_sub53_sub1.writeByte(i_509_);
						class298_sub53_sub1.writeByte(i_510_);
						class298_sub53_sub1.writeByte(i_511_);
						class298_sub53_sub1.writeByte(255 - ((this.aByteArray7850[i_500_]) & 0xff));
						i_505_ = this.aShortArray7853[i_500_];
						i_506_ = (short) is_494_[i_505_];
						if (i_506_ == 0)
							f_507_ = ((f * (float) is[i_505_] + f_495_ * (float) is_492_[i_505_] + f_496_ * (float) is_493_[i_505_]) * 0.0026041667F);
						else
							f_507_ = ((f * (float) is[i_505_] + f_495_ * (float) is_492_[i_505_] + f_496_ * (float) is_493_[i_505_]) / (float) (i_506_ * 256));
						f_508_ = f_497_ + f_507_ * (f_507_ < 0.0F ? f_499_ : f_498_);
						i_509_ = (int) (f_502_ * f_508_);
						if (i_509_ < 0)
							i_509_ = 0;
						else if (i_509_ > 255)
							i_509_ = 255;
						i_510_ = (int) (f_503_ * f_508_);
						if (i_510_ < 0)
							i_510_ = 0;
						else if (i_510_ > 255)
							i_510_ = 255;
						i_511_ = (int) (f_504_ * f_508_);
						if (i_511_ < 0)
							i_511_ = 0;
						else if (i_511_ > 255)
							i_511_ = 255;
						class298_sub53_sub1.offset = (i_473_ + i_505_ * i) * 116413311;
						class298_sub53_sub1.writeByte(i_509_);
						class298_sub53_sub1.writeByte(i_510_);
						class298_sub53_sub1.writeByte(i_511_);
						class298_sub53_sub1.writeByte(255 - ((this.aByteArray7850[i_500_]) & 0xff));
					}
				} else {
					for (int i_512_ = 0; i_512_ < this.anInt7847; i_512_++) {
						int i_513_ = method4826((this.aShortArray7849[i_512_]), (this.aShortArray7861[i_512_]), this.aShort7828, (this.aByteArray7850[i_512_]));
						class298_sub53_sub1.offset = (i_473_ + ((this.aShortArray7851[i_512_]) & 0xffff) * i) * 116413311;
						class298_sub53_sub1.writeInt(i_513_);
						class298_sub53_sub1.offset = (i_473_ + ((this.aShortArray7852[i_512_]) & 0xffff) * i) * 116413311;
						class298_sub53_sub1.writeInt(i_513_);
						class298_sub53_sub1.offset = (i_473_ + ((this.aShortArray7853[i_512_]) & 0xffff) * i) * 116413311;
						class298_sub53_sub1.writeInt(i_513_);
					}
				}
			}
			if (bool_469_) {
				short[] is;
				short[] is_514_;
				short[] is_515_;
				byte[] is_516_;
				if (this.aClass67_7844 != null) {
					is = (this.aClass67_7844.aShortArray669);
					is_514_ = (this.aClass67_7844.aShortArray668);
					is_515_ = (this.aClass67_7844.aShortArray667);
					is_516_ = (this.aClass67_7844.aByteArray670);
				} else {
					is = this.aShortArray7829;
					is_514_ = this.aShortArray7841;
					is_515_ = this.aShortArray7842;
					is_516_ = this.aByteArray7887;
				}
				float f = 3.0F / (float) this.aShort7869;
				float f_517_ = 3.0F / (float) (this.aShort7869 + this.aShort7869 / 2);
				class298_sub53_sub1.offset = i_474_ * 116413311;
				if (this.openGLGraphicsToolkit.aBoolean8143) {
					for (int i_518_ = 0; i_518_ < this.anInt7839; i_518_++) {
						int i_519_ = is_516_[i_518_] & 0xff;
						if (i_519_ == 0) {
							class298_sub53_sub1.method3658((float) is[i_518_] * f_517_);
							class298_sub53_sub1.method3658((float) is_514_[i_518_] * f_517_);
							class298_sub53_sub1.method3658((float) is_515_[i_518_] * f_517_);
						} else {
							float f_520_ = f / (float) i_519_;
							class298_sub53_sub1.method3658((float) is[i_518_] * f_520_);
							class298_sub53_sub1.method3658((float) is_514_[i_518_] * f_520_);
							class298_sub53_sub1.method3658((float) is_515_[i_518_] * f_520_);
						}
						class298_sub53_sub1.offset += (i - 12) * 116413311;
					}
				} else {
					for (int i_521_ = 0; i_521_ < this.anInt7839; i_521_++) {
						int i_522_ = is_516_[i_521_] & 0xff;
						if (i_522_ == 0) {
							class298_sub53_sub1.method3659((float) is[i_521_] * f_517_);
							class298_sub53_sub1.method3659((float) is_514_[i_521_] * f_517_);
							class298_sub53_sub1.method3659((float) is_515_[i_521_] * f_517_);
						} else {
							float f_523_ = f / (float) i_522_;
							class298_sub53_sub1.method3659((float) is[i_521_] * f_523_);
							class298_sub53_sub1.method3659((float) is_514_[i_521_] * f_523_);
							class298_sub53_sub1.method3659((float) is_515_[i_521_] * f_523_);
						}
						class298_sub53_sub1.offset += (i - 12) * 116413311;
					}
				}
			}
			if (bool_471_) {
				class298_sub53_sub1.offset = i_475_ * 116413311;
				if (this.openGLGraphicsToolkit.aBoolean8143) {
					for (int i_524_ = 0; i_524_ < this.anInt7839; i_524_++) {
						class298_sub53_sub1.method3658(this.aFloatArray7845[i_524_]);
						class298_sub53_sub1.method3658(this.aFloatArray7846[i_524_]);
						class298_sub53_sub1.offset += (i - 8) * 116413311;
					}
				} else {
					for (int i_525_ = 0; i_525_ < this.anInt7839; i_525_++) {
						class298_sub53_sub1.method3659(this.aFloatArray7845[i_525_]);
						class298_sub53_sub1.method3659(this.aFloatArray7846[i_525_]);
						class298_sub53_sub1.offset += (i - 8) * 116413311;
					}
				}
			}
			class298_sub53_sub1.offset = i * this.anInt7839 * 116413311;
			Interface1 interface1;
			if (bool) {
				if (this.anInterface1_7873 == null)
					this.anInterface1_7873 = (this.openGLGraphicsToolkit.method5244(i, class298_sub53_sub1.buffer, class298_sub53_sub1.offset * 385051775, true));
				else
					this.anInterface1_7873.method8(i, class298_sub53_sub1.buffer, class298_sub53_sub1.offset * 385051775);
				interface1 = this.anInterface1_7873;
				this.aByte7827 = (byte) 0;
			} else {
				interface1 = (this.openGLGraphicsToolkit.method5244(i, class298_sub53_sub1.buffer, class298_sub53_sub1.offset * 385051775, false));
				this.aBoolean7864 = true;
			}
			if (bool_470_) {
				this.aClass32_7831.anInterface1_397 = interface1;
				this.aClass32_7831.aByte398 = i_472_;
			}
			if (bool_471_) {
				this.aClass32_7860.anInterface1_397 = interface1;
				this.aClass32_7860.aByte398 = i_475_;
			}
			if (bool_468_) {
				this.aClass32_7858.anInterface1_397 = interface1;
				this.aClass32_7858.aByte398 = i_473_;
			}
			if (bool_469_) {
				this.aClass32_7889.anInterface1_397 = interface1;
				this.aClass32_7889.aByte398 = i_474_;
			}
		}
	}

	int method4826(int i, short i_526_, int i_527_, byte i_528_) {
		int i_529_ = Class294.anIntArray3165[method4827(i, i_527_)];
		if (i_526_ != -1) {
			Class53 class53 = this.openGLGraphicsToolkit.textures.method174(i_526_ & 0xffff);
			int i_530_ = class53.aByte533 & 0xff;
			if (i_530_ != 0) {
				int i_531_;
				if (i_527_ < 0)
					i_531_ = 0;
				else if (i_527_ > 127)
					i_531_ = 16777215;
				else
					i_531_ = 131586 * i_527_;
				if (i_530_ == 256)
					i_529_ = i_531_;
				else {
					int i_532_ = i_530_;
					int i_533_ = 256 - i_530_;
					i_529_ = ((((i_531_ & 0xff00ff) * i_532_ + (i_529_ & 0xff00ff) * i_533_) & ~0xff00ff) + (((i_531_ & 0xff00) * i_532_ + (i_529_ & 0xff00) * i_533_) & 0xff0000)) >> 8;
				}
			}
			int i_534_ = class53.aByte534 & 0xff;
			if (i_534_ != 0) {
				i_534_ += 256;
				int i_535_ = ((i_529_ & 0xff0000) >> 16) * i_534_;
				if (i_535_ > 65535)
					i_535_ = 65535;
				int i_536_ = ((i_529_ & 0xff00) >> 8) * i_534_;
				if (i_536_ > 65535)
					i_536_ = 65535;
				int i_537_ = (i_529_ & 0xff) * i_534_;
				if (i_537_ > 65535)
					i_537_ = 65535;
				i_529_ = (i_535_ << 8 & 0xff0000) + (i_536_ & 0xff00) + (i_537_ >> 8);
			}
		}
		return i_529_ << 8 | 255 - (i_528_ & 0xff);
	}

	static final int method4827(int i, int i_538_) {
		i_538_ = i_538_ * (i & 0x7f) >> 7;
		if (i_538_ < 2)
			i_538_ = 2;
		else if (i_538_ > 126)
			i_538_ = 126;
		return (i & 0xff80) + i_538_;
	}

	static {
		anIntArray7867 = new int[8];
		anIntArray7886 = new int[8];
		anIntArray7848 = new int[8];
	}

	public void method4463(Matrix43f viewingAngles) {
		Matrix4f matrix4f = (this.openGLGraphicsToolkit.aMatrix4f_8104);
		matrix4f.method2145(viewingAngles);
		if (this.aEmissiveTriangleArray7825 != null) {
			for (int i = 0; i < this.aEmissiveTriangleArray7825.length; i++) {
				EmissiveTriangle emissiveTriangle = this.aEmissiveTriangleArray7825[i];
				EmissiveTriangle emissiveTriangle_689_ = emissiveTriangle;
				if (emissiveTriangle.aEmissiveTriangle_776 != null)
					emissiveTriangle_689_ = emissiveTriangle.aEmissiveTriangle_776;
				emissiveTriangle_689_.anInt777 = ((int) (matrix4f.aFloatArray2594[12] + ((matrix4f.aFloatArray2594[0] * (float) (this.anIntArray7834[emissiveTriangle.anInt773 * -710317103])) + (matrix4f.aFloatArray2594[4] * (float) (this.anIntArray7835[(emissiveTriangle.anInt773 * -710317103)])) + (matrix4f.aFloatArray2594[8] * (float) (this.anIntArray7836[(emissiveTriangle.anInt773 * -710317103)])))) * -1879868075);
				emissiveTriangle_689_.anInt783 = ((int) (matrix4f.aFloatArray2594[13] + ((matrix4f.aFloatArray2594[1] * (float) (this.anIntArray7834[emissiveTriangle.anInt773 * -710317103])) + (matrix4f.aFloatArray2594[5] * (float) (this.anIntArray7835[(emissiveTriangle.anInt773 * -710317103)])) + (matrix4f.aFloatArray2594[9] * (float) (this.anIntArray7836[(emissiveTriangle.anInt773 * -710317103)])))) * -2041556771);
				emissiveTriangle_689_.anInt779 = ((int) (matrix4f.aFloatArray2594[14] + ((matrix4f.aFloatArray2594[2] * (float) (this.anIntArray7834[emissiveTriangle.anInt773 * -710317103])) + (matrix4f.aFloatArray2594[6] * (float) (this.anIntArray7835[(emissiveTriangle.anInt773 * -710317103)])) + (matrix4f.aFloatArray2594[10] * (float) (this.anIntArray7836[(emissiveTriangle.anInt773 * -710317103)])))) * -1434499227);
				emissiveTriangle_689_.anInt772 = ((int) (matrix4f.aFloatArray2594[12] + ((matrix4f.aFloatArray2594[0] * (float) (this.anIntArray7834[emissiveTriangle.anInt774 * 1705862021])) + (matrix4f.aFloatArray2594[4] * (float) (this.anIntArray7835[(emissiveTriangle.anInt774 * 1705862021)])) + (matrix4f.aFloatArray2594[8] * (float) (this.anIntArray7836[(emissiveTriangle.anInt774 * 1705862021)])))) * 1070341177);
				emissiveTriangle_689_.anInt781 = ((int) (matrix4f.aFloatArray2594[13] + ((matrix4f.aFloatArray2594[1] * (float) (this.anIntArray7834[emissiveTriangle.anInt774 * 1705862021])) + (matrix4f.aFloatArray2594[5] * (float) (this.anIntArray7835[(emissiveTriangle.anInt774 * 1705862021)])) + (matrix4f.aFloatArray2594[9] * (float) (this.anIntArray7836[(emissiveTriangle.anInt774 * 1705862021)])))) * 1802851857);
				emissiveTriangle_689_.anInt782 = (int) (matrix4f.aFloatArray2594[14] + ((matrix4f.aFloatArray2594[2] * (float) (this.anIntArray7834[emissiveTriangle.anInt774 * 1705862021])) + (matrix4f.aFloatArray2594[6] * (float) (this.anIntArray7835[emissiveTriangle.anInt774 * 1705862021])) + (matrix4f.aFloatArray2594[10] * (float) (this.anIntArray7836[(emissiveTriangle.anInt774 * 1705862021)])))) * 103846281;
				emissiveTriangle_689_.anInt771 = ((int) (matrix4f.aFloatArray2594[12] + ((matrix4f.aFloatArray2594[0] * (float) (this.anIntArray7834[emissiveTriangle.anInt775 * 1636170731])) + (matrix4f.aFloatArray2594[4] * (float) (this.anIntArray7835[(emissiveTriangle.anInt775 * 1636170731)])) + (matrix4f.aFloatArray2594[8] * (float) (this.anIntArray7836[(emissiveTriangle.anInt775 * 1636170731)])))) * -2103324039);
				emissiveTriangle_689_.anInt784 = ((int) (matrix4f.aFloatArray2594[13] + ((matrix4f.aFloatArray2594[1] * (float) (this.anIntArray7834[emissiveTriangle.anInt775 * 1636170731])) + (matrix4f.aFloatArray2594[5] * (float) (this.anIntArray7835[(emissiveTriangle.anInt775 * 1636170731)])) + (matrix4f.aFloatArray2594[9] * (float) (this.anIntArray7836[(emissiveTriangle.anInt775 * 1636170731)])))) * -526039059);
				emissiveTriangle_689_.anInt785 = (int) (matrix4f.aFloatArray2594[14] + ((matrix4f.aFloatArray2594[2] * (float) (this.anIntArray7834[emissiveTriangle.anInt775 * 1636170731])) + (matrix4f.aFloatArray2594[6] * (float) (this.anIntArray7835[emissiveTriangle.anInt775 * 1636170731])) + (matrix4f.aFloatArray2594[10] * (float) (this.anIntArray7836[(emissiveTriangle.anInt775 * 1636170731)])))) * 491030489;
			}
		}
		if (this.aEffectiveVertexArray7857 != null) {
			for (int i = 0; i < this.aEffectiveVertexArray7857.length; i++) {
				EffectiveVertex effectiveVertex = this.aEffectiveVertexArray7857[i];
				EffectiveVertex effectiveVertex_690_ = effectiveVertex;
				if (effectiveVertex.aEffectiveVertex_672 != null)
					effectiveVertex_690_ = effectiveVertex.aEffectiveVertex_672;
				if (effectiveVertex.aMatrix4f_677 != null)
					effectiveVertex.aMatrix4f_677.method2142(matrix4f);
				else
					effectiveVertex.aMatrix4f_677 = new Matrix4f(matrix4f);
				effectiveVertex_690_.anInt671 = ((int) (matrix4f.aFloatArray2594[12] + ((matrix4f.aFloatArray2594[0] * (float) (this.anIntArray7834[effectiveVertex.anInt674 * -180596249])) + (matrix4f.aFloatArray2594[4] * (float) (this.anIntArray7835[(effectiveVertex.anInt674 * -180596249)])) + (matrix4f.aFloatArray2594[8] * (float) (this.anIntArray7836[(effectiveVertex.anInt674 * -180596249)])))) * -1436341053);
				effectiveVertex_690_.anInt675 = (int) (matrix4f.aFloatArray2594[13] + ((matrix4f.aFloatArray2594[1] * (float) (this.anIntArray7834[effectiveVertex.anInt674 * -180596249])) + (matrix4f.aFloatArray2594[5] * (float) (this.anIntArray7835[effectiveVertex.anInt674 * -180596249])) + (matrix4f.aFloatArray2594[9] * (float) (this.anIntArray7836[(effectiveVertex.anInt674 * -180596249)])))) * 449866009;
				effectiveVertex_690_.anInt676 = ((int) (matrix4f.aFloatArray2594[14] + ((matrix4f.aFloatArray2594[2] * (float) (this.anIntArray7834[effectiveVertex.anInt674 * -180596249])) + (matrix4f.aFloatArray2594[6] * (float) (this.anIntArray7835[(effectiveVertex.anInt674 * -180596249)])) + (matrix4f.aFloatArray2594[10] * (float) (this.anIntArray7836[(effectiveVertex.anInt674 * -180596249)])))) * 1336328763);
			}
		}
	}

	short method4828(BaseModel class64, int i, long l, int i_704_, int i_705_, int i_706_, int i_707_, float f, float f_708_) {
		int i_709_ = this.anIntArray7854[i];
		int i_710_ = this.anIntArray7854[i + 1];
		int i_711_ = 0;
		for (int i_712_ = i_709_; i_712_ < i_710_; i_712_++) {
			short i_713_ = this.aShortArray7830[i_712_];
			if (i_713_ == 0) {
				i_711_ = i_712_;
				break;
			}
			if (aLongArray7883[i_712_] == l)
				return (short) (i_713_ - 1);
		}
		this.aShortArray7830[i_711_] = (short) (this.anInt7839 + 1);
		aLongArray7883[i_711_] = l;
		this.aShortArray7829[(this.anInt7839)] = (short) i_704_;
		this.aShortArray7841[(this.anInt7839)] = (short) i_705_;
		this.aShortArray7842[(this.anInt7839)] = (short) i_706_;
		this.aByteArray7887[this.anInt7839] = (byte) i_707_;
		this.aFloatArray7845[(this.anInt7839)] = f;
		this.aFloatArray7846[(this.anInt7839)] = f_708_;
		return (short) this.anInt7839++;
	}

	public void ia(int i, int i_978_, int i_979_) {
		for (int i_980_ = 0; i_980_ < this.anInt7833; i_980_++) {
			if (i != 0)
				this.anIntArray7834[i_980_] += i;
			if (i_978_ != 0)
				this.anIntArray7835[i_980_] += i_978_;
			if (i_979_ != 0)
				this.anIntArray7836[i_980_] += i_979_;
		}
		if (this.aClass32_7831 != null)
			this.aClass32_7831.anInterface1_397 = null;
		this.aBoolean7843 = false;
	}

	public ModelToolkit method4755(byte i, int i_1450_, boolean bool) {
		boolean bool_1451_ = false;
		OpenGLModelToolkit openGLModelToolkit_1452_;
		OpenGLModelToolkit openGLModelToolkit_1453_;
		if (i > 0 && i <= 7) {
			openGLModelToolkit_1453_ = (this.openGLGraphicsToolkit.aOpenGLModelToolkitArray8084[i - 1]);
			openGLModelToolkit_1452_ = (this.openGLGraphicsToolkit.aOpenGLModelToolkitArray8189[i - 1]);
			bool_1451_ = true;
		} else
			openGLModelToolkit_1452_ = openGLModelToolkit_1453_ = new OpenGLModelToolkit(this.openGLGraphicsToolkit);
		return method4819(openGLModelToolkit_1452_, openGLModelToolkit_1453_, i_1450_, bool_1451_, bool);
	}

	static short[] method4829(short[] is, int i) {
		short[] is_1485_ = new short[i];
		System.arraycopy(is, 0, is_1485_, 0, i);
		return is_1485_;
	}

	OpenGLModelToolkit(OpenGLGraphicsToolkit class_ra_sub2) {
		this.anInt7832 = 0;
		this.anInt7833 = 0;
		this.anInt7839 = 0;
		this.anInt7847 = 0;
		this.anInt7885 = 0;
		this.aBoolean7864 = true;
		this.aBoolean7843 = false;
		this.openGLGraphicsToolkit = class_ra_sub2;
		this.aClass32_7831 = new Class32(null, 5126, 3, 0);
		this.aClass32_7860 = new Class32(null, 5126, 2, 0);
		this.aClass32_7889 = new Class32(null, 5126, 3, 0);
		this.aClass32_7858 = new Class32(null, 5121, 4, 0);
		this.aClass41_7879 = new Class41();
	}

	public void W(short i, short i_1613_) {
		MaterialRawLoader interface_ma = this.openGLGraphicsToolkit.textures;
		for (int i_1614_ = 0; i_1614_ < this.anInt7847; i_1614_++) {
			if (this.aShortArray7861[i_1614_] == i)
				this.aShortArray7861[i_1614_] = i_1613_;
		}
		byte i_1615_ = 0;
		byte i_1616_ = 0;
		if (i != -1) {
			Class53 class53 = interface_ma.method174(i & 0xffff);
			i_1615_ = class53.aByte533;
			i_1616_ = class53.aByte534;
		}
		byte i_1617_ = 0;
		byte i_1618_ = 0;
		if (i_1613_ != -1) {
			Class53 class53 = interface_ma.method174(i_1613_ & 0xffff);
			i_1617_ = class53.aByte533;
			i_1618_ = class53.aByte534;
			if (class53.aByte535 != 0 || class53.aByte509 != 0)
				this.aBoolean7862 = true;
		}
		if (i_1615_ != i_1617_ | i_1616_ != i_1618_) {
			if (this.aClass54Array7880 != null) {
				for (int i_1619_ = 0; i_1619_ < this.anInt7877; i_1619_++) {
					Class54 class54 = this.aClass54Array7880[i_1619_];
					Class36 class36 = this.aClass36Array7875[i_1619_];
					class36.anInt424 = (class36.anInt424 & ~0xffffff | ((Class294.anIntArray3165[(this.aShortArray7849[class54.anInt549]) & 0xffff]) & 0xffffff));
				}
			}
			if (this.aClass32_7858 != null)
				this.aClass32_7858.anInterface1_397 = null;
		}
	}

	public int n() {
		if (!this.aBoolean7843)
			method4831();
		return this.anInt7865;
	}

	void e(int transformationType, int[] is, int i_1634_, int i_1635_, int i_1636_, boolean bool, int i_1637_, int[] is_1638_) {
		int i_1639_ = is.length;
		if (transformationType == 0) {
			i_1634_ <<= 4;
			i_1635_ <<= 4;
			i_1636_ <<= 4;
			int i_1640_ = 0;
			anInt7888 = 0;
			anInt7866 = 0;
			anInt7890 = 0;
			for (int i_1641_ = 0; i_1641_ < i_1639_; i_1641_++) {
				int i_1642_ = is[i_1641_];
				if (i_1642_ < this.anIntArrayArray7837.length) {
					int[] is_1643_ = this.anIntArrayArray7837[i_1642_];
					for (int i_1644_ = 0; i_1644_ < is_1643_.length; i_1644_++) {
						int i_1645_ = is_1643_[i_1644_];
						if (this.aShortArray7838 == null || (i_1637_ & (this.aShortArray7838[i_1645_])) != 0) {
							anInt7888 += (this.anIntArray7834[i_1645_]);
							anInt7866 += (this.anIntArray7835[i_1645_]);
							anInt7890 += (this.anIntArray7836[i_1645_]);
							i_1640_++;
						}
					}
				}
			}
			if (i_1640_ > 0) {
				anInt7888 = anInt7888 / i_1640_ + i_1634_;
				anInt7866 = anInt7866 / i_1640_ + i_1635_;
				anInt7890 = anInt7890 / i_1640_ + i_1636_;
				aBoolean7817 = true;
			} else {
				anInt7888 = i_1634_;
				anInt7866 = i_1635_;
				anInt7890 = i_1636_;
			}
		} else if (transformationType == 1) {
			if (is_1638_ != null) {
				int i_1646_ = ((is_1638_[0] * i_1634_ + is_1638_[1] * i_1635_ + is_1638_[2] * i_1636_ + 8192) >> 14);
				int i_1647_ = ((is_1638_[3] * i_1634_ + is_1638_[4] * i_1635_ + is_1638_[5] * i_1636_ + 8192) >> 14);
				int i_1648_ = ((is_1638_[6] * i_1634_ + is_1638_[7] * i_1635_ + is_1638_[8] * i_1636_ + 8192) >> 14);
				i_1634_ = i_1646_;
				i_1635_ = i_1647_;
				i_1636_ = i_1648_;
			}
			i_1634_ <<= 4;
			i_1635_ <<= 4;
			i_1636_ <<= 4;
			for (int i_1649_ = 0; i_1649_ < i_1639_; i_1649_++) {
				int i_1650_ = is[i_1649_];
				if (i_1650_ < this.anIntArrayArray7837.length) {
					int[] is_1651_ = this.anIntArrayArray7837[i_1650_];
					for (int i_1652_ = 0; i_1652_ < is_1651_.length; i_1652_++) {
						int i_1653_ = is_1651_[i_1652_];
						if (this.aShortArray7838 == null || (i_1637_ & (this.aShortArray7838[i_1653_])) != 0) {
							this.anIntArray7834[i_1653_] += i_1634_;
							this.anIntArray7835[i_1653_] += i_1635_;
							this.anIntArray7836[i_1653_] += i_1636_;
						}
					}
				}
			}
		} else if (transformationType == 2) {
			if (is_1638_ != null) {
				int i_1654_ = is_1638_[9] << 4;
				int i_1655_ = is_1638_[10] << 4;
				int i_1656_ = is_1638_[11] << 4;
				int i_1657_ = is_1638_[12] << 4;
				int i_1658_ = is_1638_[13] << 4;
				int i_1659_ = is_1638_[14] << 4;
				if (aBoolean7817) {
					int i_1660_ = ((is_1638_[0] * anInt7888 + is_1638_[3] * anInt7866 + is_1638_[6] * anInt7890 + 8192) >> 14);
					int i_1661_ = ((is_1638_[1] * anInt7888 + is_1638_[4] * anInt7866 + is_1638_[7] * anInt7890 + 8192) >> 14);
					int i_1662_ = ((is_1638_[2] * anInt7888 + is_1638_[5] * anInt7866 + is_1638_[8] * anInt7890 + 8192) >> 14);
					i_1660_ += i_1657_;
					i_1661_ += i_1658_;
					i_1662_ += i_1659_;
					anInt7888 = i_1660_;
					anInt7866 = i_1661_;
					anInt7890 = i_1662_;
					aBoolean7817 = false;
				}
				int[] is_1663_ = new int[9];
				int i_1664_ = CircleAngleTable.COSINE[i_1634_];
				int i_1665_ = CircleAngleTable.SINE[i_1634_];
				int i_1666_ = CircleAngleTable.COSINE[i_1635_];
				int i_1667_ = CircleAngleTable.SINE[i_1635_];
				int i_1668_ = CircleAngleTable.COSINE[i_1636_];
				int i_1669_ = CircleAngleTable.SINE[i_1636_];
				int i_1670_ = i_1665_ * i_1668_ + 8192 >> 14;
				int i_1671_ = i_1665_ * i_1669_ + 8192 >> 14;
				is_1663_[0] = i_1666_ * i_1668_ + i_1667_ * i_1671_ + 8192 >> 14;
				is_1663_[1] = -i_1666_ * i_1669_ + i_1667_ * i_1670_ + 8192 >> 14;
				is_1663_[2] = i_1667_ * i_1664_ + 8192 >> 14;
				is_1663_[3] = i_1664_ * i_1669_ + 8192 >> 14;
				is_1663_[4] = i_1664_ * i_1668_ + 8192 >> 14;
				is_1663_[5] = -i_1665_;
				is_1663_[6] = -i_1667_ * i_1668_ + i_1666_ * i_1671_ + 8192 >> 14;
				is_1663_[7] = i_1667_ * i_1669_ + i_1666_ * i_1670_ + 8192 >> 14;
				is_1663_[8] = i_1666_ * i_1664_ + 8192 >> 14;
				int i_1672_ = ((is_1663_[0] * -anInt7888 + is_1663_[1] * -anInt7866 + is_1663_[2] * -anInt7890 + 8192) >> 14);
				int i_1673_ = ((is_1663_[3] * -anInt7888 + is_1663_[4] * -anInt7866 + is_1663_[5] * -anInt7890 + 8192) >> 14);
				int i_1674_ = ((is_1663_[6] * -anInt7888 + is_1663_[7] * -anInt7866 + is_1663_[8] * -anInt7890 + 8192) >> 14);
				int i_1675_ = i_1672_ + anInt7888;
				int i_1676_ = i_1673_ + anInt7866;
				int i_1677_ = i_1674_ + anInt7890;
				int[] is_1678_ = new int[9];
				for (int i_1679_ = 0; i_1679_ < 3; i_1679_++) {
					for (int i_1680_ = 0; i_1680_ < 3; i_1680_++) {
						int i_1681_ = 0;
						for (int i_1682_ = 0; i_1682_ < 3; i_1682_++)
							i_1681_ += (is_1663_[i_1679_ * 3 + i_1682_] * is_1638_[i_1680_ * 3 + i_1682_]);
						is_1678_[i_1679_ * 3 + i_1680_] = i_1681_ + 8192 >> 14;
					}
				}
				int i_1683_ = ((is_1663_[0] * i_1657_ + is_1663_[1] * i_1658_ + is_1663_[2] * i_1659_ + 8192) >> 14);
				int i_1684_ = ((is_1663_[3] * i_1657_ + is_1663_[4] * i_1658_ + is_1663_[5] * i_1659_ + 8192) >> 14);
				int i_1685_ = ((is_1663_[6] * i_1657_ + is_1663_[7] * i_1658_ + is_1663_[8] * i_1659_ + 8192) >> 14);
				i_1683_ += i_1675_;
				i_1684_ += i_1676_;
				i_1685_ += i_1677_;
				int[] is_1686_ = new int[9];
				for (int i_1687_ = 0; i_1687_ < 3; i_1687_++) {
					for (int i_1688_ = 0; i_1688_ < 3; i_1688_++) {
						int i_1689_ = 0;
						for (int i_1690_ = 0; i_1690_ < 3; i_1690_++)
							i_1689_ += (is_1638_[i_1687_ * 3 + i_1690_] * is_1678_[i_1688_ + i_1690_ * 3]);
						is_1686_[i_1687_ * 3 + i_1688_] = i_1689_ + 8192 >> 14;
					}
				}
				int i_1691_ = ((is_1638_[0] * i_1683_ + is_1638_[1] * i_1684_ + is_1638_[2] * i_1685_ + 8192) >> 14);
				int i_1692_ = ((is_1638_[3] * i_1683_ + is_1638_[4] * i_1684_ + is_1638_[5] * i_1685_ + 8192) >> 14);
				int i_1693_ = ((is_1638_[6] * i_1683_ + is_1638_[7] * i_1684_ + is_1638_[8] * i_1685_ + 8192) >> 14);
				i_1691_ += i_1654_;
				i_1692_ += i_1655_;
				i_1693_ += i_1656_;
				for (int i_1694_ = 0; i_1694_ < i_1639_; i_1694_++) {
					int i_1695_ = is[i_1694_];
					if (i_1695_ < this.anIntArrayArray7837.length) {
						int[] is_1696_ = (this.anIntArrayArray7837[i_1695_]);
						for (int i_1697_ = 0; i_1697_ < is_1696_.length; i_1697_++) {
							int i_1698_ = is_1696_[i_1697_];
							if (this.aShortArray7838 == null || ((i_1637_ & (this.aShortArray7838[i_1698_])) != 0)) {
								int i_1699_ = (is_1686_[0] * (this.anIntArray7834[i_1698_]) + is_1686_[1] * (this.anIntArray7835[i_1698_]) + is_1686_[2] * (this.anIntArray7836[i_1698_]) + 8192) >> 14;
								int i_1700_ = (is_1686_[3] * (this.anIntArray7834[i_1698_]) + is_1686_[4] * (this.anIntArray7835[i_1698_]) + is_1686_[5] * (this.anIntArray7836[i_1698_]) + 8192) >> 14;
								int i_1701_ = (is_1686_[6] * (this.anIntArray7834[i_1698_]) + is_1686_[7] * (this.anIntArray7835[i_1698_]) + is_1686_[8] * (this.anIntArray7836[i_1698_]) + 8192) >> 14;
								i_1699_ += i_1691_;
								i_1700_ += i_1692_;
								i_1701_ += i_1693_;
								this.anIntArray7834[i_1698_] = i_1699_;
								this.anIntArray7835[i_1698_] = i_1700_;
								this.anIntArray7836[i_1698_] = i_1701_;
							}
						}
					}
				}
			} else {
				for (int i_1702_ = 0; i_1702_ < i_1639_; i_1702_++) {
					int i_1703_ = is[i_1702_];
					if (i_1703_ < this.anIntArrayArray7837.length) {
						int[] is_1704_ = (this.anIntArrayArray7837[i_1703_]);
						for (int i_1705_ = 0; i_1705_ < is_1704_.length; i_1705_++) {
							int i_1706_ = is_1704_[i_1705_];
							if (this.aShortArray7838 == null || ((i_1637_ & (this.aShortArray7838[i_1706_])) != 0)) {
								this.anIntArray7834[i_1706_] -= anInt7888;
								this.anIntArray7835[i_1706_] -= anInt7866;
								this.anIntArray7836[i_1706_] -= anInt7890;
								if (i_1636_ != 0) {
									int i_1707_ = CircleAngleTable.SINE[i_1636_];
									int i_1708_ = CircleAngleTable.COSINE[i_1636_];
									int i_1709_ = ((this.anIntArray7835[i_1706_]) * i_1707_ + ((this.anIntArray7834[i_1706_]) * i_1708_) + 16383) >> 14;
									this.anIntArray7835[i_1706_] = ((this.anIntArray7835[i_1706_]) * i_1708_ - ((this.anIntArray7834[i_1706_]) * i_1707_) + 16383) >> 14;
									this.anIntArray7834[i_1706_] = i_1709_;
								}
								if (i_1634_ != 0) {
									int i_1710_ = CircleAngleTable.SINE[i_1634_];
									int i_1711_ = CircleAngleTable.COSINE[i_1634_];
									int i_1712_ = ((this.anIntArray7835[i_1706_]) * i_1711_ - ((this.anIntArray7836[i_1706_]) * i_1710_) + 16383) >> 14;
									this.anIntArray7836[i_1706_] = ((this.anIntArray7835[i_1706_]) * i_1710_ + ((this.anIntArray7836[i_1706_]) * i_1711_) + 16383) >> 14;
									this.anIntArray7835[i_1706_] = i_1712_;
								}
								if (i_1635_ != 0) {
									int i_1713_ = CircleAngleTable.SINE[i_1635_];
									int i_1714_ = CircleAngleTable.COSINE[i_1635_];
									int i_1715_ = ((this.anIntArray7836[i_1706_]) * i_1713_ + ((this.anIntArray7834[i_1706_]) * i_1714_) + 16383) >> 14;
									this.anIntArray7836[i_1706_] = ((this.anIntArray7836[i_1706_]) * i_1714_ - ((this.anIntArray7834[i_1706_]) * i_1713_) + 16383) >> 14;
									this.anIntArray7834[i_1706_] = i_1715_;
								}
								this.anIntArray7834[i_1706_] += anInt7888;
								this.anIntArray7835[i_1706_] += anInt7866;
								this.anIntArray7836[i_1706_] += anInt7890;
							}
						}
					}
				}
				if (bool) {
					for (int i_1716_ = 0; i_1716_ < i_1639_; i_1716_++) {
						int i_1717_ = is[i_1716_];
						if (i_1717_ < (this.anIntArrayArray7837).length) {
							int[] is_1718_ = (this.anIntArrayArray7837[i_1717_]);
							for (int i_1719_ = 0; i_1719_ < is_1718_.length; i_1719_++) {
								int i_1720_ = is_1718_[i_1719_];
								if ((this.aShortArray7838 == null) || ((i_1637_ & (this.aShortArray7838[i_1720_])) != 0)) {
									int i_1721_ = (this.anIntArray7854[i_1720_]);
									int i_1722_ = (this.anIntArray7854[i_1720_ + 1]);
									for (int i_1723_ = i_1721_; i_1723_ < i_1722_; i_1723_++) {
										int i_1724_ = ((this.aShortArray7830[i_1723_]) - 1);
										if (i_1724_ == -1)
											break;
										if (i_1636_ != 0) {
											int i_1725_ = (CircleAngleTable.SINE[i_1636_]);
											int i_1726_ = (CircleAngleTable.COSINE[i_1636_]);
											int i_1727_ = (((this.aShortArray7841[i_1724_]) * i_1725_ + (this.aShortArray7829[i_1724_]) * i_1726_ + 16383) >> 14);
											this.aShortArray7841[i_1724_] = (short) ((((this.aShortArray7841[i_1724_]) * i_1726_) - ((this.aShortArray7829[i_1724_]) * i_1725_) + 16383) >> 14);
											this.aShortArray7829[i_1724_] = (short) i_1727_;
										}
										if (i_1634_ != 0) {
											int i_1728_ = (CircleAngleTable.SINE[i_1634_]);
											int i_1729_ = (CircleAngleTable.COSINE[i_1634_]);
											int i_1730_ = (((this.aShortArray7841[i_1724_]) * i_1729_ - (this.aShortArray7842[i_1724_]) * i_1728_ + 16383) >> 14);
											this.aShortArray7842[i_1724_] = (short) ((((this.aShortArray7841[i_1724_]) * i_1728_) + ((this.aShortArray7842[i_1724_]) * i_1729_) + 16383) >> 14);
											this.aShortArray7841[i_1724_] = (short) i_1730_;
										}
										if (i_1635_ != 0) {
											int i_1731_ = (CircleAngleTable.SINE[i_1635_]);
											int i_1732_ = (CircleAngleTable.COSINE[i_1635_]);
											int i_1733_ = (((this.aShortArray7842[i_1724_]) * i_1731_ + (this.aShortArray7829[i_1724_]) * i_1732_ + 16383) >> 14);
											this.aShortArray7842[i_1724_] = (short) ((((this.aShortArray7842[i_1724_]) * i_1732_) - ((this.aShortArray7829[i_1724_]) * i_1731_) + 16383) >> 14);
											this.aShortArray7829[i_1724_] = (short) i_1733_;
										}
									}
								}
							}
						}
					}
					if (this.aClass32_7889 == null && this.aClass32_7858 != null)
						this.aClass32_7858.anInterface1_397 = null;
					if (this.aClass32_7889 != null)
						this.aClass32_7889.anInterface1_397 = null;
				}
			}
		} else if (transformationType == 3) {
			if (is_1638_ != null) {
				int i_1734_ = is_1638_[9] << 4;
				int i_1735_ = is_1638_[10] << 4;
				int i_1736_ = is_1638_[11] << 4;
				int i_1737_ = is_1638_[12] << 4;
				int i_1738_ = is_1638_[13] << 4;
				int i_1739_ = is_1638_[14] << 4;
				if (aBoolean7817) {
					int i_1740_ = ((is_1638_[0] * anInt7888 + is_1638_[3] * anInt7866 + is_1638_[6] * anInt7890 + 8192) >> 14);
					int i_1741_ = ((is_1638_[1] * anInt7888 + is_1638_[4] * anInt7866 + is_1638_[7] * anInt7890 + 8192) >> 14);
					int i_1742_ = ((is_1638_[2] * anInt7888 + is_1638_[5] * anInt7866 + is_1638_[8] * anInt7890 + 8192) >> 14);
					i_1740_ += i_1737_;
					i_1741_ += i_1738_;
					i_1742_ += i_1739_;
					anInt7888 = i_1740_;
					anInt7866 = i_1741_;
					anInt7890 = i_1742_;
					aBoolean7817 = false;
				}
				int i_1743_ = i_1634_ << 15 >> 7;
				int i_1744_ = i_1635_ << 15 >> 7;
				int i_1745_ = i_1636_ << 15 >> 7;
				int i_1746_ = i_1743_ * -anInt7888 + 8192 >> 14;
				int i_1747_ = i_1744_ * -anInt7866 + 8192 >> 14;
				int i_1748_ = i_1745_ * -anInt7890 + 8192 >> 14;
				int i_1749_ = i_1746_ + anInt7888;
				int i_1750_ = i_1747_ + anInt7866;
				int i_1751_ = i_1748_ + anInt7890;
				int[] is_1752_ = new int[9];
				is_1752_[0] = i_1743_ * is_1638_[0] + 8192 >> 14;
				is_1752_[1] = i_1743_ * is_1638_[3] + 8192 >> 14;
				is_1752_[2] = i_1743_ * is_1638_[6] + 8192 >> 14;
				is_1752_[3] = i_1744_ * is_1638_[1] + 8192 >> 14;
				is_1752_[4] = i_1744_ * is_1638_[4] + 8192 >> 14;
				is_1752_[5] = i_1744_ * is_1638_[7] + 8192 >> 14;
				is_1752_[6] = i_1745_ * is_1638_[2] + 8192 >> 14;
				is_1752_[7] = i_1745_ * is_1638_[5] + 8192 >> 14;
				is_1752_[8] = i_1745_ * is_1638_[8] + 8192 >> 14;
				int i_1753_ = i_1743_ * i_1737_ + 8192 >> 14;
				int i_1754_ = i_1744_ * i_1738_ + 8192 >> 14;
				int i_1755_ = i_1745_ * i_1739_ + 8192 >> 14;
				i_1753_ += i_1749_;
				i_1754_ += i_1750_;
				i_1755_ += i_1751_;
				int[] is_1756_ = new int[9];
				for (int i_1757_ = 0; i_1757_ < 3; i_1757_++) {
					for (int i_1758_ = 0; i_1758_ < 3; i_1758_++) {
						int i_1759_ = 0;
						for (int i_1760_ = 0; i_1760_ < 3; i_1760_++)
							i_1759_ += (is_1638_[i_1757_ * 3 + i_1760_] * is_1752_[i_1758_ + i_1760_ * 3]);
						is_1756_[i_1757_ * 3 + i_1758_] = i_1759_ + 8192 >> 14;
					}
				}
				int i_1761_ = ((is_1638_[0] * i_1753_ + is_1638_[1] * i_1754_ + is_1638_[2] * i_1755_ + 8192) >> 14);
				int i_1762_ = ((is_1638_[3] * i_1753_ + is_1638_[4] * i_1754_ + is_1638_[5] * i_1755_ + 8192) >> 14);
				int i_1763_ = ((is_1638_[6] * i_1753_ + is_1638_[7] * i_1754_ + is_1638_[8] * i_1755_ + 8192) >> 14);
				i_1761_ += i_1734_;
				i_1762_ += i_1735_;
				i_1763_ += i_1736_;
				for (int i_1764_ = 0; i_1764_ < i_1639_; i_1764_++) {
					int i_1765_ = is[i_1764_];
					if (i_1765_ < this.anIntArrayArray7837.length) {
						int[] is_1766_ = (this.anIntArrayArray7837[i_1765_]);
						for (int i_1767_ = 0; i_1767_ < is_1766_.length; i_1767_++) {
							int i_1768_ = is_1766_[i_1767_];
							if (this.aShortArray7838 == null || ((i_1637_ & (this.aShortArray7838[i_1768_])) != 0)) {
								int i_1769_ = (is_1756_[0] * (this.anIntArray7834[i_1768_]) + is_1756_[1] * (this.anIntArray7835[i_1768_]) + is_1756_[2] * (this.anIntArray7836[i_1768_]) + 8192) >> 14;
								int i_1770_ = (is_1756_[3] * (this.anIntArray7834[i_1768_]) + is_1756_[4] * (this.anIntArray7835[i_1768_]) + is_1756_[5] * (this.anIntArray7836[i_1768_]) + 8192) >> 14;
								int i_1771_ = (is_1756_[6] * (this.anIntArray7834[i_1768_]) + is_1756_[7] * (this.anIntArray7835[i_1768_]) + is_1756_[8] * (this.anIntArray7836[i_1768_]) + 8192) >> 14;
								i_1769_ += i_1761_;
								i_1770_ += i_1762_;
								i_1771_ += i_1763_;
								this.anIntArray7834[i_1768_] = i_1769_;
								this.anIntArray7835[i_1768_] = i_1770_;
								this.anIntArray7836[i_1768_] = i_1771_;
							}
						}
					}
				}
			} else {
				for (int i_1772_ = 0; i_1772_ < i_1639_; i_1772_++) {
					int i_1773_ = is[i_1772_];
					if (i_1773_ < this.anIntArrayArray7837.length) {
						int[] is_1774_ = (this.anIntArrayArray7837[i_1773_]);
						for (int i_1775_ = 0; i_1775_ < is_1774_.length; i_1775_++) {
							int i_1776_ = is_1774_[i_1775_];
							if (this.aShortArray7838 == null || ((i_1637_ & (this.aShortArray7838[i_1776_])) != 0)) {
								this.anIntArray7834[i_1776_] -= anInt7888;
								this.anIntArray7835[i_1776_] -= anInt7866;
								this.anIntArray7836[i_1776_] -= anInt7890;
								this.anIntArray7834[i_1776_] = (this.anIntArray7834[i_1776_]) * i_1634_ >> 7;
								this.anIntArray7835[i_1776_] = (this.anIntArray7835[i_1776_]) * i_1635_ >> 7;
								this.anIntArray7836[i_1776_] = (this.anIntArray7836[i_1776_]) * i_1636_ >> 7;
								this.anIntArray7834[i_1776_] += anInt7888;
								this.anIntArray7835[i_1776_] += anInt7866;
								this.anIntArray7836[i_1776_] += anInt7890;
							}
						}
					}
				}
			}
		} else if (transformationType == 5) {
			if (this.anIntArrayArray7855 != null) {
				for (int i_1777_ = 0; i_1777_ < i_1639_; i_1777_++) {
					int i_1778_ = is[i_1777_];
					if (i_1778_ < this.anIntArrayArray7855.length) {
						int[] is_1779_ = (this.anIntArrayArray7855[i_1778_]);
						for (int i_1780_ = 0; i_1780_ < is_1779_.length; i_1780_++) {
							int i_1781_ = is_1779_[i_1780_];
							if (this.aShortArray7856 == null || ((i_1637_ & (this.aShortArray7856[i_1781_])) != 0)) {
								int i_1782_ = (((this.aByteArray7850[i_1781_]) & 0xff) + i_1634_ * 8);
								if (i_1782_ < 0)
									i_1782_ = 0;
								else if (i_1782_ > 255)
									i_1782_ = 255;
								this.aByteArray7850[i_1781_] = (byte) i_1782_;
								if (this.aClass32_7858 != null)
									this.aClass32_7858.anInterface1_397 = null;
							}
						}
					}
				}
				if (this.aClass54Array7880 != null) {
					for (int i_1783_ = 0; i_1783_ < this.anInt7877; i_1783_++) {
						Class54 class54 = (this.aClass54Array7880[i_1783_]);
						Class36 class36 = (this.aClass36Array7875[i_1783_]);
						class36.anInt424 = (class36.anInt424 & 0xffffff | 255 - ((this.aByteArray7850[class54.anInt549]) & 0xff) << 24);
					}
				}
			}
		} else if (transformationType == 7) {
			if (this.anIntArrayArray7855 != null) {
				for (int i_1784_ = 0; i_1784_ < i_1639_; i_1784_++) {
					int i_1785_ = is[i_1784_];
					if (i_1785_ < this.anIntArrayArray7855.length) {
						int[] is_1786_ = (this.anIntArrayArray7855[i_1785_]);
						for (int i_1787_ = 0; i_1787_ < is_1786_.length; i_1787_++) {
							int i_1788_ = is_1786_[i_1787_];
							if (this.aShortArray7856 == null || ((i_1637_ & (this.aShortArray7856[i_1788_])) != 0)) {
								int i_1789_ = ((this.aShortArray7849[i_1788_]) & 0xffff);
								int i_1790_ = i_1789_ >> 10 & 0x3f;
								int i_1791_ = i_1789_ >> 7 & 0x7;
								int i_1792_ = i_1789_ & 0x7f;
								i_1790_ = i_1790_ + i_1634_ & 0x3f;
								i_1791_ += i_1635_ / 4;
								if (i_1791_ < 0)
									i_1791_ = 0;
								else if (i_1791_ > 7)
									i_1791_ = 7;
								i_1792_ += i_1636_;
								if (i_1792_ < 0)
									i_1792_ = 0;
								else if (i_1792_ > 127)
									i_1792_ = 127;
								this.aShortArray7849[i_1788_] = (short) (i_1790_ << 10 | i_1791_ << 7 | i_1792_);
								if (this.aClass32_7858 != null)
									this.aClass32_7858.anInterface1_397 = null;
							}
						}
					}
				}
				if (this.aClass54Array7880 != null) {
					for (int i_1793_ = 0; i_1793_ < this.anInt7877; i_1793_++) {
						Class54 class54 = (this.aClass54Array7880[i_1793_]);
						Class36 class36 = (this.aClass36Array7875[i_1793_]);
						class36.anInt424 = (class36.anInt424 & ~0xffffff | ((Class294.anIntArray3165[(this.aShortArray7849[class54.anInt549]) & 0xffff]) & 0xffffff));
					}
				}
			}
		} else if (transformationType == 8) {
			if (this.anIntArrayArray7882 != null) {
				for (int i_1794_ = 0; i_1794_ < i_1639_; i_1794_++) {
					int i_1795_ = is[i_1794_];
					if (i_1795_ < this.anIntArrayArray7882.length) {
						int[] is_1796_ = (this.anIntArrayArray7882[i_1795_]);
						for (int i_1797_ = 0; i_1797_ < is_1796_.length; i_1797_++) {
							Class36 class36 = (this.aClass36Array7875[is_1796_[i_1797_]]);
							class36.anInt422 += i_1634_;
							class36.anInt419 += i_1635_;
						}
					}
				}
			}
		} else if (transformationType == 10) {
			if (this.anIntArrayArray7882 != null) {
				for (int i_1798_ = 0; i_1798_ < i_1639_; i_1798_++) {
					int i_1799_ = is[i_1798_];
					if (i_1799_ < this.anIntArrayArray7882.length) {
						int[] is_1800_ = (this.anIntArrayArray7882[i_1799_]);
						for (int i_1801_ = 0; i_1801_ < is_1800_.length; i_1801_++) {
							Class36 class36 = (this.aClass36Array7875[is_1800_[i_1801_]]);
							class36.anInt420 = class36.anInt420 * i_1634_ >> 7;
							class36.anInt421 = class36.anInt421 * i_1635_ >> 7;
						}
					}
				}
			}
		} else if (transformationType == 9) {
			if (this.anIntArrayArray7882 != null) {
				for (int i_1802_ = 0; i_1802_ < i_1639_; i_1802_++) {
					int i_1803_ = is[i_1802_];
					if (i_1803_ < this.anIntArrayArray7882.length) {
						int[] is_1804_ = (this.anIntArrayArray7882[i_1803_]);
						for (int i_1805_ = 0; i_1805_ < is_1804_.length; i_1805_++) {
							Class36 class36 = (this.aClass36Array7875[is_1804_[i_1805_]]);
							class36.anInt423 = (class36.anInt423 + i_1634_ & 0x3fff);
						}
					}
				}
			}
		}
	}

	public void X(short i, short i_1812_) {
		for (int i_1813_ = 0; i_1813_ < this.anInt7847; i_1813_++) {
			if (this.aShortArray7849[i_1813_] == i)
				this.aShortArray7849[i_1813_] = i_1812_;
		}
		if (this.aClass54Array7880 != null) {
			for (int i_1814_ = 0; i_1814_ < this.anInt7877; i_1814_++) {
				Class54 class54 = this.aClass54Array7880[i_1814_];
				Class36 class36 = this.aClass36Array7875[i_1814_];
				class36.anInt424 = (class36.anInt424 & ~0xffffff | ((Class294.anIntArray3165[(this.aShortArray7849[class54.anInt549]) & 0xffff]) & 0xffffff));
			}
		}
		if (this.aClass32_7858 != null)
			this.aClass32_7858.anInterface1_397 = null;
	}

	void method4830(boolean bool) {
		if ((this.openGLGraphicsToolkit.aClass298_Sub53_Sub1_8197.buffer).length < this.anInt7885 * 6)
			this.openGLGraphicsToolkit.aClass298_Sub53_Sub1_8197 = new RsFloatBuffer((this.anInt7885 + 100) * 6);
		else
			this.openGLGraphicsToolkit.aClass298_Sub53_Sub1_8197.offset = 0;
		RsFloatBuffer class298_sub53_sub1 = (this.openGLGraphicsToolkit.aClass298_Sub53_Sub1_8197);
		if (this.openGLGraphicsToolkit.aBoolean8143) {
			for (int i = 0; i < this.anInt7885; i++) {
				class298_sub53_sub1.writeShort((this.aShortArray7851[i]));
				class298_sub53_sub1.writeShort((this.aShortArray7852[i]));
				class298_sub53_sub1.writeShort((this.aShortArray7853[i]));
			}
		} else {
			for (int i = 0; i < this.anInt7885; i++) {
				class298_sub53_sub1.method3587((this.aShortArray7851[i]));
				class298_sub53_sub1.method3587((this.aShortArray7852[i]));
				class298_sub53_sub1.method3587((this.aShortArray7853[i]));
			}
		}
		if (class298_sub53_sub1.offset * 385051775 != 0) {
			if (bool) {
				if (this.anInterface2_7820 == null)
					this.anInterface2_7820 = (this.openGLGraphicsToolkit.method5284(5123, class298_sub53_sub1.buffer, class298_sub53_sub1.offset * 385051775, true));
				else
					this.anInterface2_7820.method19(5123, class298_sub53_sub1.buffer, class298_sub53_sub1.offset * 385051775);
				this.aClass41_7879.anInterface2_441 = this.anInterface2_7820;
			} else
				this.aClass41_7879.anInterface2_441 = (this.openGLGraphicsToolkit.method5284(5123, class298_sub53_sub1.buffer, class298_sub53_sub1.offset * 385051775, false));
			if (!bool)
				this.aBoolean7864 = true;
		}
	}

	void method4831() {
		int i = 32767;
		int i_1855_ = 32767;
		int i_1856_ = 32767;
		int i_1857_ = -32768;
		int i_1858_ = -32768;
		int i_1859_ = -32768;
		int i_1860_ = 0;
		int i_1861_ = 0;
		for (int i_1862_ = 0; i_1862_ < this.anInt7833; i_1862_++) {
			int i_1863_ = this.anIntArray7834[i_1862_];
			int i_1864_ = this.anIntArray7835[i_1862_];
			int i_1865_ = this.anIntArray7836[i_1862_];
			if (i_1863_ < i)
				i = i_1863_;
			if (i_1863_ > i_1857_)
				i_1857_ = i_1863_;
			if (i_1864_ < i_1855_)
				i_1855_ = i_1864_;
			if (i_1864_ > i_1858_)
				i_1858_ = i_1864_;
			if (i_1865_ < i_1856_)
				i_1856_ = i_1865_;
			if (i_1865_ > i_1859_)
				i_1859_ = i_1865_;
			int i_1866_ = i_1863_ * i_1863_ + i_1865_ * i_1865_;
			if (i_1866_ > i_1860_)
				i_1860_ = i_1866_;
			i_1866_ = i_1863_ * i_1863_ + i_1865_ * i_1865_ + i_1864_ * i_1864_;
			if (i_1866_ > i_1861_)
				i_1861_ = i_1866_;
		}
		this.aShort7870 = (short) i;
		this.aShort7871 = (short) i_1857_;
		this.aShort7868 = (short) i_1855_;
		this.aShort7874 = (short) i_1858_;
		this.aShort7872 = (short) i_1856_;
		this.aShort7876 = (short) i_1859_;
		this.anInt7891 = (int) (Math.sqrt((double) i_1860_) + 0.99);
		this.anInt7865 = (int) (Math.sqrt((double) i_1861_) + 0.99);
		this.aBoolean7843 = true;
	}

	public EmissiveTriangle[] method4464() {
		return this.aEmissiveTriangleArray7825;
	}

	public void t(int i) {
		int i_1867_ = CircleAngleTable.SINE[i];
		int i_1868_ = CircleAngleTable.COSINE[i];
		for (int i_1869_ = 0; i_1869_ < this.anInt7833; i_1869_++) {
			int i_1870_ = ((this.anIntArray7835[i_1869_] * i_1868_ - this.anIntArray7836[i_1869_] * i_1867_) >> 14);
			this.anIntArray7836[i_1869_] = ((this.anIntArray7835[i_1869_] * i_1867_ + this.anIntArray7836[i_1869_] * i_1868_) >> 14);
			this.anIntArray7835[i_1869_] = i_1870_;
		}
		if (this.aClass32_7831 != null)
			this.aClass32_7831.anInterface1_397 = null;
		this.aBoolean7843 = false;
	}

	public void oa(int i, int i_1893_, int i_1894_) {
		for (int i_1895_ = 0; i_1895_ < this.anInt7833; i_1895_++) {
			if (i != 128)
				this.anIntArray7834[i_1895_] = this.anIntArray7834[i_1895_] * i >> 7;
			if (i_1893_ != 128)
				this.anIntArray7835[i_1895_] = (this.anIntArray7835[i_1895_] * i_1893_ >> 7);
			if (i_1894_ != 128)
				this.anIntArray7836[i_1895_] = (this.anIntArray7836[i_1895_] * i_1894_ >> 7);
		}
		if (this.aClass32_7831 != null)
			this.aClass32_7831.anInterface1_397 = null;
		this.aBoolean7843 = false;
	}

	public void method4741(Matrix43f class222, int i, boolean bool) {
		if (this.aShortArray7838 != null) {
			Matrix43f class222_1896_ = class222;
			if (bool) {
				class222_1896_ = this.openGLGraphicsToolkit.aClass222_8103;
				class222_1896_.method2074(class222);
			}
			float[] fs = new float[3];
			for (int i_1897_ = 0; i_1897_ < this.anInt7833; i_1897_++) {
				if ((i & this.aShortArray7838[i_1897_]) != 0) {
					class222_1896_.method2077((float) (this.anIntArray7834[i_1897_]), (float) (this.anIntArray7835[i_1897_]), (float) (this.anIntArray7836[i_1897_]), fs);
					this.anIntArray7834[i_1897_] = (int) fs[0];
					this.anIntArray7835[i_1897_] = (int) fs[1];
					this.anIntArray7836[i_1897_] = (int) fs[2];
				}
			}
		}
	}

	OpenGLModelToolkit(OpenGLGraphicsToolkit class_ra_sub2, BaseModel model, int mask, int width, int height, int i_1900_) {
		this.anInt7832 = 0;
		this.anInt7833 = 0;
		this.anInt7839 = 0;
		this.anInt7847 = 0;
		this.anInt7885 = 0;
		this.aBoolean7864 = true;
		this.aBoolean7843 = false;
		this.openGLGraphicsToolkit = class_ra_sub2;
		this.modelMask = mask;
		this.anInt7826 = i_1900_;
		if (Class38.method471(mask))
			this.aClass32_7831 = new Class32(null, 5126, 3, 0);
		if (Class38.method455(mask, i_1900_))
			this.aClass32_7860 = new Class32(null, 5126, 2, 0);
		if (Class38.method475(mask, i_1900_))
			this.aClass32_7889 = new Class32(null, 5126, 3, 0);
		if (Class38.method458(mask, i_1900_))
			this.aClass32_7858 = new Class32(null, 5121, 4, 0);
		if (Class38.method456(mask, i_1900_))
			this.aClass41_7879 = new Class41();
		MaterialRawLoader interface_ma = class_ra_sub2.textures;
		int[] is = new int[model.anInt621];
		this.anIntArray7854 = new int[model.anInt626 + 1];
		for (int i_1901_ = 0; i_1901_ < model.anInt621; i_1901_++) {
			if (model.aByteArray625 == null || model.aByteArray625[i_1901_] != 2) {
				if (model.aShortArray617 != null && model.aShortArray617[i_1901_] != -1) {
					Class53 class53 = interface_ma.method174((model.aShortArray617[i_1901_]) & 0xffff);
					if (((this.anInt7826 & 0x40) == 0 || !class53.aBoolean524) && class53.aBoolean538)
						continue;
				}
				is[this.anInt7847++] = i_1901_;
				this.anIntArray7854[(model.aShortArray644[i_1901_])]++;
				this.anIntArray7854[(model.aShortArray646[i_1901_])]++;
				this.anIntArray7854[(model.aShortArray624[i_1901_])]++;
			}
		}
		this.anInt7885 = this.anInt7847;
		long[] ls = new long[this.anInt7847];
		boolean bool = (this.modelMask & 0x100) != 0;
		for (int i_1902_ = 0; i_1902_ < this.anInt7847; i_1902_++) {
			int i_1903_ = is[i_1902_];
			Class53 class53 = null;
			int i_1904_ = 0;
			int i_1905_ = 0;
			int i_1906_ = 0;
			int i_1907_ = 0;
			if (model.billboardConfigs != null) {
				boolean bool_1908_ = false;
				for (int i_1909_ = 0; i_1909_ < model.billboardConfigs.length; i_1909_++) {
					BillboardConfig billboardConfig = model.billboardConfigs[i_1909_];
					if (i_1903_ == billboardConfig.face * 1512514121) {
						Class173 class173 = BillboardConfig.method2844((billboardConfig.type * 1834782277));
						if (class173.aBoolean1757)
							bool_1908_ = true;
						if (class173.anInt1751 * 39181267 != -1) {
							Class53 class53_1910_ = interface_ma.method174((class173.anInt1751 * 39181267));
							if (class53_1910_.anInt528 * -2138060883 == 2)
								this.aBoolean7840 = true;
						}
					}
				}
				if (bool_1908_) {
					ls[i_1902_] = 9223372036854775807L;
					this.anInt7885--;
					continue;
				}
			}
			int i_1911_ = -1;
			if (model.aShortArray617 != null) {
				i_1911_ = model.aShortArray617[i_1903_];
				if (i_1911_ != -1) {
					class53 = interface_ma.method174(i_1911_ & 0xffff);
					if ((this.anInt7826 & 0x40) == 0 || !class53.aBoolean524) {
						i_1906_ = class53.aByte529;
						i_1907_ = class53.aByte536;
						if (class53.aByte535 != 0 || class53.aByte509 != 0)
							this.aBoolean7862 = true;
					} else {
						i_1911_ = -1;
						class53 = null;
					}
				}
			}
			boolean bool_1912_ = ((model.aByteArray627 != null && model.aByteArray627[i_1903_] != 0) || class53 != null && class53.anInt528 * -2138060883 != 0);
			if ((bool || bool_1912_) && model.aByteArray633 != null)
				i_1904_ += model.aByteArray633[i_1903_] << 17;
			if (bool_1912_)
				i_1904_ += 65536;
			i_1904_ += (i_1906_ & 0xff) << 8;
			i_1904_ += i_1907_ & 0xff;
			i_1905_ += (i_1911_ & 0xffff) << 16;
			i_1905_ += i_1902_ & 0xffff;
			ls[i_1902_] = ((long) i_1904_ << 32) + (long) i_1905_;
			this.aBoolean7840 |= bool_1912_;
			OpenGLModelToolkit openGLModelToolkit_1913_ = this;
			openGLModelToolkit_1913_.aBoolean7862 = (openGLModelToolkit_1913_.aBoolean7862 | (class53 != null && (class53.aByte535 != 0 || class53.aByte509 != 0)));
		}
		Skybox.method2598(ls, is);
		this.anInt7832 = model.anInt614;
		this.anInt7833 = model.anInt626;
		this.anIntArray7834 = model.anIntArray616;
		this.anIntArray7835 = model.anIntArray642;
		this.anIntArray7836 = model.anIntArray618;
		this.aShortArray7838 = model.aShortArray620;
		Class43[] class43s = new Class43[this.anInt7833];
		this.aEmissiveTriangleArray7825 = model.aEmissiveTriangleArray647;
		this.aEffectiveVertexArray7857 = model.aEffectiveVertexArray613;
		if (model.billboardConfigs != null) {
			this.anInt7877 = model.billboardConfigs.length;
			this.aClass54Array7880 = new Class54[this.anInt7877];
			this.aClass36Array7875 = new Class36[this.anInt7877];
			for (int i_1914_ = 0; i_1914_ < this.anInt7877; i_1914_++) {
				BillboardConfig billboardConfig = model.billboardConfigs[i_1914_];
				Class173 class173 = BillboardConfig.method2844(billboardConfig.type * 1834782277);
				int i_1915_ = -1;
				for (int i_1916_ = 0; i_1916_ < this.anInt7847; i_1916_++) {
					if (is[i_1916_] == billboardConfig.face * 1512514121) {
						i_1915_ = i_1916_;
						break;
					}
				}
				int i_1917_ = ((Class294.anIntArray3165[(model.aShortArray629[billboardConfig.face * 1512514121] & 0xffff)]) & 0xffffff);
				i_1917_ = i_1917_ | 255 - (model.aByteArray627 != null ? (model.aByteArray627[billboardConfig.face * 1512514121]) : 0) << 24;
				this.aClass54Array7880[i_1914_] = (new Class54(i_1915_, model.aShortArray644[billboardConfig.face * 1512514121], model.aShortArray646[billboardConfig.face * 1512514121], model.aShortArray624[billboardConfig.face * 1512514121], class173.anInt1755 * 1951943953, class173.anInt1753 * 893949695, class173.anInt1751 * 39181267, class173.anInt1752 * -310074719, class173.anInt1754 * 1092922159, class173.aBoolean1757, class173.aBoolean1748, billboardConfig.magnitude * 2010148771));
				this.aClass36Array7875[i_1914_] = new Class36(i_1917_);
			}
		}
		int i_1918_ = this.anInt7847 * 3;
		this.aShortArray7829 = new short[i_1918_];
		this.aShortArray7841 = new short[i_1918_];
		this.aShortArray7842 = new short[i_1918_];
		this.aByteArray7887 = new byte[i_1918_];
		this.aFloatArray7845 = new float[i_1918_];
		this.aFloatArray7846 = new float[i_1918_];
		this.aShortArray7849 = new short[this.anInt7847];
		this.aByteArray7850 = new byte[this.anInt7847];
		this.aShortArray7851 = new short[this.anInt7847];
		this.aShortArray7852 = new short[this.anInt7847];
		this.aShortArray7853 = new short[this.anInt7847];
		this.aShortArray7861 = new short[this.anInt7847];
		if (model.aShortArray615 != null)
			this.aShortArray7856 = new short[this.anInt7847];
		this.aShort7828 = (short) width;
		this.aShort7869 = (short) height;
		this.aShortArray7830 = new short[i_1918_];
		aLongArray7883 = new long[i_1918_];
		int i_1919_ = 0;
		for (int i_1920_ = 0; i_1920_ < model.anInt626; i_1920_++) {
			int i_1921_ = this.anIntArray7854[i_1920_];
			this.anIntArray7854[i_1920_] = i_1919_;
			i_1919_ += i_1921_;
			class43s[i_1920_] = new Class43();
		}
		this.anIntArray7854[model.anInt626] = i_1919_;
		Class76 class76 = method4785(model, is, this.anInt7847);
		Class37[] class37s = new Class37[model.anInt621];
		for (int i_1922_ = 0; i_1922_ < model.anInt621; i_1922_++) {
			short i_1923_ = model.aShortArray644[i_1922_];
			short i_1924_ = model.aShortArray646[i_1922_];
			short i_1925_ = model.aShortArray624[i_1922_];
			int i_1926_ = (this.anIntArray7834[i_1924_] - this.anIntArray7834[i_1923_]);
			int i_1927_ = (this.anIntArray7835[i_1924_] - this.anIntArray7835[i_1923_]);
			int i_1928_ = (this.anIntArray7836[i_1924_] - this.anIntArray7836[i_1923_]);
			int i_1929_ = (this.anIntArray7834[i_1925_] - this.anIntArray7834[i_1923_]);
			int i_1930_ = (this.anIntArray7835[i_1925_] - this.anIntArray7835[i_1923_]);
			int i_1931_ = (this.anIntArray7836[i_1925_] - this.anIntArray7836[i_1923_]);
			int i_1932_ = i_1927_ * i_1931_ - i_1930_ * i_1928_;
			int i_1933_ = i_1928_ * i_1929_ - i_1931_ * i_1926_;
			int i_1934_;
			for (i_1934_ = i_1926_ * i_1930_ - i_1929_ * i_1927_; (i_1932_ > 8192 || i_1933_ > 8192 || i_1934_ > 8192 || i_1932_ < -8192 || i_1933_ < -8192 || i_1934_ < -8192); i_1934_ >>= 1) {
				i_1932_ >>= 1;
				i_1933_ >>= 1;
			}
			int i_1935_ = (int) Math.sqrt((double) (i_1932_ * i_1932_ + i_1933_ * i_1933_ + i_1934_ * i_1934_));
			if (i_1935_ <= 0)
				i_1935_ = 1;
			i_1932_ = i_1932_ * 256 / i_1935_;
			i_1933_ = i_1933_ * 256 / i_1935_;
			i_1934_ = i_1934_ * 256 / i_1935_;
			byte i_1936_ = (model.aByteArray625 == null ? (byte) 0 : model.aByteArray625[i_1922_]);
			if (i_1936_ == 0) {
				Class43 class43 = class43s[i_1923_];
				class43.anInt464 += i_1932_;
				class43.anInt463 += i_1933_;
				class43.anInt465 += i_1934_;
				class43.anInt466++;
				class43 = class43s[i_1924_];
				class43.anInt464 += i_1932_;
				class43.anInt463 += i_1933_;
				class43.anInt465 += i_1934_;
				class43.anInt466++;
				class43 = class43s[i_1925_];
				class43.anInt464 += i_1932_;
				class43.anInt463 += i_1933_;
				class43.anInt465 += i_1934_;
				class43.anInt466++;
			} else if (i_1936_ == 1) {
				Class37 class37 = class37s[i_1922_] = new Class37();
				class37.anInt426 = i_1932_;
				class37.anInt425 = i_1933_;
				class37.anInt427 = i_1934_;
			}
		}
		for (int i_1937_ = 0; i_1937_ < this.anInt7847; i_1937_++) {
			int i_1938_ = is[i_1937_];
			int i_1939_ = model.aShortArray629[i_1938_] & 0xffff;
			int i_1940_;
			if (model.aByteArray635 == null)
				i_1940_ = -1;
			else
				i_1940_ = model.aByteArray635[i_1938_];
			int i_1941_;
			if (model.aByteArray627 == null)
				i_1941_ = 0;
			else
				i_1941_ = model.aByteArray627[i_1938_] & 0xff;
			short i_1942_ = (model.aShortArray617 == null ? (short) -1 : model.aShortArray617[i_1938_]);
			if (i_1942_ != -1 && (this.anInt7826 & 0x40) != 0) {
				Class53 class53 = interface_ma.method174(i_1942_ & 0xffff);
				if (class53.aBoolean524)
					i_1942_ = (short) -1;
			}
			float f = 0.0F;
			float f_1943_ = 0.0F;
			float f_1944_ = 0.0F;
			float f_1945_ = 0.0F;
			float f_1946_ = 0.0F;
			float f_1947_ = 0.0F;
			int i_1948_ = 0;
			int i_1949_ = 0;
			int i_1950_ = 0;
			if (i_1942_ != -1) {
				if (i_1940_ == -1) {
					f = 0.0F;
					f_1943_ = 1.0F;
					f_1944_ = 1.0F;
					f_1945_ = 1.0F;
					i_1948_ = 1;
					f_1946_ = 0.0F;
					f_1947_ = 0.0F;
					i_1949_ = 2;
				} else {
					i_1940_ &= 0xff;
					byte i_1951_ = model.aByteArray622[i_1940_];
					if (i_1951_ == 0) {
						short i_1952_ = model.aShortArray644[i_1938_];
						short i_1953_ = model.aShortArray646[i_1938_];
						short i_1954_ = model.aShortArray624[i_1938_];
						short i_1955_ = model.aShortArray623[i_1940_];
						short i_1956_ = model.aShortArray636[i_1940_];
						short i_1957_ = model.aShortArray638[i_1940_];
						float f_1958_ = (float) model.anIntArray616[i_1955_];
						float f_1959_ = (float) model.anIntArray642[i_1955_];
						float f_1960_ = (float) model.anIntArray618[i_1955_];
						float f_1961_ = (float) model.anIntArray616[i_1956_] - f_1958_;
						float f_1962_ = (float) model.anIntArray642[i_1956_] - f_1959_;
						float f_1963_ = (float) model.anIntArray618[i_1956_] - f_1960_;
						float f_1964_ = (float) model.anIntArray616[i_1957_] - f_1958_;
						float f_1965_ = (float) model.anIntArray642[i_1957_] - f_1959_;
						float f_1966_ = (float) model.anIntArray618[i_1957_] - f_1960_;
						float f_1967_ = (float) model.anIntArray616[i_1952_] - f_1958_;
						float f_1968_ = (float) model.anIntArray642[i_1952_] - f_1959_;
						float f_1969_ = (float) model.anIntArray618[i_1952_] - f_1960_;
						float f_1970_ = (float) model.anIntArray616[i_1953_] - f_1958_;
						float f_1971_ = (float) model.anIntArray642[i_1953_] - f_1959_;
						float f_1972_ = (float) model.anIntArray618[i_1953_] - f_1960_;
						float f_1973_ = (float) model.anIntArray616[i_1954_] - f_1958_;
						float f_1974_ = (float) model.anIntArray642[i_1954_] - f_1959_;
						float f_1975_ = (float) model.anIntArray618[i_1954_] - f_1960_;
						float f_1976_ = f_1962_ * f_1966_ - f_1963_ * f_1965_;
						float f_1977_ = f_1963_ * f_1964_ - f_1961_ * f_1966_;
						float f_1978_ = f_1961_ * f_1965_ - f_1962_ * f_1964_;
						float f_1979_ = f_1965_ * f_1978_ - f_1966_ * f_1977_;
						float f_1980_ = f_1966_ * f_1976_ - f_1964_ * f_1978_;
						float f_1981_ = f_1964_ * f_1977_ - f_1965_ * f_1976_;
						float f_1982_ = 1.0F / (f_1979_ * f_1961_ + f_1980_ * f_1962_ + f_1981_ * f_1963_);
						f = (f_1979_ * f_1967_ + f_1980_ * f_1968_ + f_1981_ * f_1969_) * f_1982_;
						f_1944_ = (f_1979_ * f_1970_ + f_1980_ * f_1971_ + f_1981_ * f_1972_) * f_1982_;
						f_1946_ = (f_1979_ * f_1973_ + f_1980_ * f_1974_ + f_1981_ * f_1975_) * f_1982_;
						f_1979_ = f_1962_ * f_1978_ - f_1963_ * f_1977_;
						f_1980_ = f_1963_ * f_1976_ - f_1961_ * f_1978_;
						f_1981_ = f_1961_ * f_1977_ - f_1962_ * f_1976_;
						f_1982_ = 1.0F / (f_1979_ * f_1964_ + f_1980_ * f_1965_ + f_1981_ * f_1966_);
						f_1943_ = (f_1979_ * f_1967_ + f_1980_ * f_1968_ + f_1981_ * f_1969_) * f_1982_;
						f_1945_ = (f_1979_ * f_1970_ + f_1980_ * f_1971_ + f_1981_ * f_1972_) * f_1982_;
						f_1947_ = (f_1979_ * f_1973_ + f_1980_ * f_1974_ + f_1981_ * f_1975_) * f_1982_;
					} else {
						short i_1983_ = model.aShortArray644[i_1938_];
						short i_1984_ = model.aShortArray646[i_1938_];
						short i_1985_ = model.aShortArray624[i_1938_];
						int i_1986_ = class76.anIntArray713[i_1940_];
						int i_1987_ = class76.anIntArray710[i_1940_];
						int i_1988_ = class76.anIntArray709[i_1940_];
						float[] fs = class76.aFloatArrayArray711[i_1940_];
						byte i_1989_ = model.aByteArray628[i_1940_];
						float f_1990_ = (float) model.anIntArray637[i_1940_] / 256.0F;
						if (i_1951_ == 1) {
							float f_1991_ = ((float) model.anIntArray641[i_1940_] / 1024.0F);
							method4744(model.anIntArray616[i_1983_], model.anIntArray642[i_1983_], model.anIntArray618[i_1983_], i_1986_, i_1987_, i_1988_, fs, f_1991_, i_1989_, f_1990_, aFloatArray7884);
							f = aFloatArray7884[0];
							f_1943_ = aFloatArray7884[1];
							method4744(model.anIntArray616[i_1984_], model.anIntArray642[i_1984_], model.anIntArray618[i_1984_], i_1986_, i_1987_, i_1988_, fs, f_1991_, i_1989_, f_1990_, aFloatArray7884);
							f_1944_ = aFloatArray7884[0];
							f_1945_ = aFloatArray7884[1];
							method4744(model.anIntArray616[i_1985_], model.anIntArray642[i_1985_], model.anIntArray618[i_1985_], i_1986_, i_1987_, i_1988_, fs, f_1991_, i_1989_, f_1990_, aFloatArray7884);
							f_1946_ = aFloatArray7884[0];
							f_1947_ = aFloatArray7884[1];
							float f_1992_ = f_1991_ / 2.0F;
							if ((i_1989_ & 0x1) == 0) {
								if (f_1944_ - f > f_1992_) {
									f_1944_ -= f_1991_;
									i_1948_ = 1;
								} else if (f - f_1944_ > f_1992_) {
									f_1944_ += f_1991_;
									i_1948_ = 2;
								}
								if (f_1946_ - f > f_1992_) {
									f_1946_ -= f_1991_;
									i_1949_ = 1;
								} else if (f - f_1946_ > f_1992_) {
									f_1946_ += f_1991_;
									i_1949_ = 2;
								}
							} else {
								if (f_1945_ - f_1943_ > f_1992_) {
									f_1945_ -= f_1991_;
									i_1948_ = 1;
								} else if (f_1943_ - f_1945_ > f_1992_) {
									f_1945_ += f_1991_;
									i_1948_ = 2;
								}
								if (f_1947_ - f_1943_ > f_1992_) {
									f_1947_ -= f_1991_;
									i_1949_ = 1;
								} else if (f_1943_ - f_1947_ > f_1992_) {
									f_1947_ += f_1991_;
									i_1949_ = 2;
								}
							}
						} else if (i_1951_ == 2) {
							float f_1993_ = ((float) model.anIntArray643[i_1940_] / 256.0F);
							float f_1994_ = ((float) model.anIntArray648[i_1940_] / 256.0F);
							int i_1995_ = (model.anIntArray616[i_1984_] - model.anIntArray616[i_1983_]);
							int i_1996_ = (model.anIntArray642[i_1984_] - model.anIntArray642[i_1983_]);
							int i_1997_ = (model.anIntArray618[i_1984_] - model.anIntArray618[i_1983_]);
							int i_1998_ = (model.anIntArray616[i_1985_] - model.anIntArray616[i_1983_]);
							int i_1999_ = (model.anIntArray642[i_1985_] - model.anIntArray642[i_1983_]);
							int i_2000_ = (model.anIntArray618[i_1985_] - model.anIntArray618[i_1983_]);
							int i_2001_ = i_1996_ * i_2000_ - i_1999_ * i_1997_;
							int i_2002_ = i_1997_ * i_1998_ - i_2000_ * i_1995_;
							int i_2003_ = i_1995_ * i_1999_ - i_1998_ * i_1996_;
							float f_2004_ = (64.0F / (float) model.anIntArray639[i_1940_]);
							float f_2005_ = (64.0F / (float) model.anIntArray640[i_1940_]);
							float f_2006_ = (64.0F / (float) model.anIntArray641[i_1940_]);
							float f_2007_ = (((float) i_2001_ * fs[0] + (float) i_2002_ * fs[1] + (float) i_2003_ * fs[2]) / f_2004_);
							float f_2008_ = (((float) i_2001_ * fs[3] + (float) i_2002_ * fs[4] + (float) i_2003_ * fs[5]) / f_2005_);
							float f_2009_ = (((float) i_2001_ * fs[6] + (float) i_2002_ * fs[7] + (float) i_2003_ * fs[8]) / f_2006_);
							i_1950_ = method4729(f_2007_, f_2008_, f_2009_);
							method4730(model.anIntArray616[i_1983_], model.anIntArray642[i_1983_], model.anIntArray618[i_1983_], i_1986_, i_1987_, i_1988_, i_1950_, fs, i_1989_, f_1990_, f_1993_, f_1994_, aFloatArray7884);
							f = aFloatArray7884[0];
							f_1943_ = aFloatArray7884[1];
							method4730(model.anIntArray616[i_1984_], model.anIntArray642[i_1984_], model.anIntArray618[i_1984_], i_1986_, i_1987_, i_1988_, i_1950_, fs, i_1989_, f_1990_, f_1993_, f_1994_, aFloatArray7884);
							f_1944_ = aFloatArray7884[0];
							f_1945_ = aFloatArray7884[1];
							method4730(model.anIntArray616[i_1985_], model.anIntArray642[i_1985_], model.anIntArray618[i_1985_], i_1986_, i_1987_, i_1988_, i_1950_, fs, i_1989_, f_1990_, f_1993_, f_1994_, aFloatArray7884);
							f_1946_ = aFloatArray7884[0];
							f_1947_ = aFloatArray7884[1];
						} else if (i_1951_ == 3) {
							method4780(model.anIntArray616[i_1983_], model.anIntArray642[i_1983_], model.anIntArray618[i_1983_], i_1986_, i_1987_, i_1988_, fs, i_1989_, f_1990_, aFloatArray7884);
							f = aFloatArray7884[0];
							f_1943_ = aFloatArray7884[1];
							method4780(model.anIntArray616[i_1984_], model.anIntArray642[i_1984_], model.anIntArray618[i_1984_], i_1986_, i_1987_, i_1988_, fs, i_1989_, f_1990_, aFloatArray7884);
							f_1944_ = aFloatArray7884[0];
							f_1945_ = aFloatArray7884[1];
							method4780(model.anIntArray616[i_1985_], model.anIntArray642[i_1985_], model.anIntArray618[i_1985_], i_1986_, i_1987_, i_1988_, fs, i_1989_, f_1990_, aFloatArray7884);
							f_1946_ = aFloatArray7884[0];
							f_1947_ = aFloatArray7884[1];
							if ((i_1989_ & 0x1) == 0) {
								if (f_1944_ - f > 0.5F) {
									f_1944_--;
									i_1948_ = 1;
								} else if (f - f_1944_ > 0.5F) {
									f_1944_++;
									i_1948_ = 2;
								}
								if (f_1946_ - f > 0.5F) {
									f_1946_--;
									i_1949_ = 1;
								} else if (f - f_1946_ > 0.5F) {
									f_1946_++;
									i_1949_ = 2;
								}
							} else {
								if (f_1945_ - f_1943_ > 0.5F) {
									f_1945_--;
									i_1948_ = 1;
								} else if (f_1943_ - f_1945_ > 0.5F) {
									f_1945_++;
									i_1948_ = 2;
								}
								if (f_1947_ - f_1943_ > 0.5F) {
									f_1947_--;
									i_1949_ = 1;
								} else if (f_1943_ - f_1947_ > 0.5F) {
									f_1947_++;
									i_1949_ = 2;
								}
							}
						}
					}
				}
			}
			byte i_2010_;
			if (model.aByteArray625 == null)
				i_2010_ = (byte) 0;
			else
				i_2010_ = model.aByteArray625[i_1938_];
			if (i_2010_ == 0) {
				long l = ((long) (i_1940_ << 2) + (((long) (i_1950_ << 24) + (long) (i_1939_ << 8) + (long) i_1941_) << 32));
				short i_2011_ = model.aShortArray644[i_1938_];
				short i_2012_ = model.aShortArray646[i_1938_];
				short i_2013_ = model.aShortArray624[i_1938_];
				Class43 class43 = class43s[i_2011_];
				this.aShortArray7851[i_1937_] = method4828(model, i_2011_, l, class43.anInt464, class43.anInt463, class43.anInt465, class43.anInt466, f, f_1943_);
				class43 = class43s[i_2012_];
				this.aShortArray7852[i_1937_] = method4828(model, i_2012_, l + (long) i_1948_, class43.anInt464, class43.anInt463, class43.anInt465, class43.anInt466, f_1944_, f_1945_);
				class43 = class43s[i_2013_];
				this.aShortArray7853[i_1937_] = method4828(model, i_2013_, l + (long) i_1949_, class43.anInt464, class43.anInt463, class43.anInt465, class43.anInt466, f_1946_, f_1947_);
			} else if (i_2010_ == 1) {
				Class37 class37 = class37s[i_1938_];
				long l = ((long) ((i_1940_ << 2) + (class37.anInt426 > 0 ? 1024 : 2048) + (class37.anInt425 + 256 << 12) + (class37.anInt427 + 256 << 22)) + (((long) (i_1950_ << 24) + (long) (i_1939_ << 8) + (long) i_1941_) << 32));
				this.aShortArray7851[i_1937_] = method4828(model, model.aShortArray644[i_1938_], l, class37.anInt426, class37.anInt425, class37.anInt427, 0, f, f_1943_);
				this.aShortArray7852[i_1937_] = method4828(model, model.aShortArray646[i_1938_], l + (long) i_1948_, class37.anInt426, class37.anInt425, class37.anInt427, 0, f_1944_, f_1945_);
				this.aShortArray7853[i_1937_] = method4828(model, model.aShortArray624[i_1938_], l + (long) i_1949_, class37.anInt426, class37.anInt425, class37.anInt427, 0, f_1946_, f_1947_);
			}
			if (model.aByteArray627 != null)
				this.aByteArray7850[i_1937_] = model.aByteArray627[i_1938_];
			if (model.aShortArray615 != null)
				this.aShortArray7856[i_1937_] = model.aShortArray615[i_1938_];
			this.aShortArray7849[i_1937_] = model.aShortArray629[i_1938_];
			this.aShortArray7861[i_1937_] = i_1942_;
		}
		int i_2014_ = 0;
		short i_2015_ = -10000;
		for (int i_2016_ = 0; i_2016_ < this.anInt7885; i_2016_++) {
			short i_2017_ = this.aShortArray7861[i_2016_];
			if (i_2017_ != i_2015_) {
				i_2014_++;
				i_2015_ = i_2017_;
			}
		}
		this.anIntArray7859 = new int[i_2014_ + 1];
		i_2014_ = 0;
		i_2015_ = (short) -10000;
		for (int i_2018_ = 0; i_2018_ < this.anInt7885; i_2018_++) {
			short i_2019_ = this.aShortArray7861[i_2018_];
			if (i_2019_ != i_2015_) {
				this.anIntArray7859[i_2014_++] = i_2018_;
				i_2015_ = i_2019_;
			}
		}
		this.anIntArray7859[i_2014_] = this.anInt7885;
		aLongArray7883 = null;
		this.aShortArray7829 = method4829(this.aShortArray7829, this.anInt7839);
		this.aShortArray7841 = method4829(this.aShortArray7841, this.anInt7839);
		this.aShortArray7842 = method4829(this.aShortArray7842, this.anInt7839);
		this.aByteArray7887 = method4817(this.aByteArray7887, this.anInt7839);
		this.aFloatArray7845 = method4818(this.aFloatArray7845, this.anInt7839);
		this.aFloatArray7846 = method4818(this.aFloatArray7846, this.anInt7839);
		if (model.anIntArray619 != null && Class38.method459(mask, this.anInt7826))
			this.anIntArrayArray7837 = model.method749(false);
		if (model.billboardConfigs != null && Class38.method465(mask, this.anInt7826))
			this.anIntArrayArray7882 = model.method759();
		if (model.anIntArray631 != null && Class38.method463(mask, this.anInt7826)) {
			int i_2020_ = 0;
			int[] is_2021_ = new int[256];
			for (int i_2022_ = 0; i_2022_ < this.anInt7847; i_2022_++) {
				int i_2023_ = model.anIntArray631[is[i_2022_]];
				if (i_2023_ >= 0) {
					is_2021_[i_2023_]++;
					if (i_2023_ > i_2020_)
						i_2020_ = i_2023_;
				}
			}
			this.anIntArrayArray7855 = new int[i_2020_ + 1][];
			for (int i_2024_ = 0; i_2024_ <= i_2020_; i_2024_++) {
				this.anIntArrayArray7855[i_2024_] = new int[is_2021_[i_2024_]];
				is_2021_[i_2024_] = 0;
			}
			for (int i_2025_ = 0; i_2025_ < this.anInt7847; i_2025_++) {
				int i_2026_ = model.anIntArray631[is[i_2025_]];
				if (i_2026_ >= 0)
					this.anIntArrayArray7855[i_2026_][is_2021_[i_2026_]++] = i_2025_;
			}
		}
	}

}
