package com.jagex;/* JavaGraphicsModelTookit - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.definition.animation.AnimationFrameBase;
import com.jagex.maths.Matrix43f;
import com.jagex.maths.Matrix4f;
import sun.misc.Unsafe;

import java.nio.ByteBuffer;

public class JavaGraphicsModelTookit extends ModelToolkit {
	Class166[] aClass166Array7892;
	boolean aBoolean7893;
	NativeToolkit nativeToolkit;
	int[] anIntArray7895;
	int anInt7896;
	short aShort7897;
	short aShort7898;
	int anInt7899 = 0;
	int anInt7900 = 0;
	int[] anIntArray7901;
	static int anInt7902;
	boolean aBoolean7903;
	EffectiveVertex[] aEffectiveVertexArray7904;
	static boolean aBoolean7905;
	int anInt7906 = 0;
	short[] aShortArray7907;
	short[] aShortArray7908;
	short[] aShortArray7909;
	short[] aShortArray7910;
	Class186 aClass186_7911;
	int anInt7912;
	int[] anIntArray7913;
	float[] aFloatArray7914;
	Class185 aClass185_7915;
	int anInt7916 = 0;
	int anInt7917 = 0;
	int[][] anIntArrayArray7918;
	short[] aShortArray7919;
	short[] aShortArray7920;
	short[] aShortArray7921;
	short[] aShortArray7922;
	short[] aShortArray7923;
	int[][] anIntArrayArray7924;
	short[] aShortArray7925;
	Class167 aClass167_7926;
	Class186 aClass186_7927;
	int anInt7928;
	static int[] anIntArray7929;
	Class186 aClass186_7930;
	boolean aBoolean7931 = false;
	boolean aBoolean7932 = true;
	static int[] anIntArray7933;
	Class186 aClass186_7934;
	short[] aShortArray7935;
	int anInt7936;
	static int anInt7937;
	int anInt7938;
	int anInt7939;
	int anInt7940;
	int anInt7941;
	int anInt7942;
	int anInt7943;
	int[] anIntArray7944;
	int[] anIntArray7945;
	int[][] anIntArrayArray7946;
	int[] anIntArray7947;
	short[] aShortArray7948;
	EmissiveTriangle[] aEmissiveTriangleArray7949;
	boolean aBoolean7950;
	int anInt7951;
	Class191[] aClass191Array7952;
	float[] aFloatArray7953;
	static int anInt7954 = 7;
	static long[] aLongArray7955;
	static int anInt7956;
	static int anInt7957 = 4;
	byte[] aByteArray7958;
	static int[] anIntArray7959;
	static int[] anIntArray7960;
	static int[] anIntArray7961;
	static float[] aFloatArray7962 = new float[2];
	byte[] aByteArray7963;
	short[] aShortArray7964;
	int[] anIntArray7965;
	static Class156 aClass156_7966;

	public int ya() {
		if (!this.aBoolean7950)
			method4832();
		return this.anInt7941;
	}

    void method4832() {
		int i = 32767;
		int i_0_ = 32767;
		int i_1_ = 32767;
		int i_2_ = -32768;
		int i_3_ = -32768;
		int i_4_ = -32768;
		int i_5_ = 0;
		int i_6_ = 0;
		for (int i_7_ = 0; i_7_ < this.anInt7900; i_7_++) {
			int i_8_ = this.anIntArray7901[i_7_];
			int i_9_ = this.anIntArray7895[i_7_];
			int i_10_ = this.anIntArray7965[i_7_];
			if (i_8_ < i)
				i = i_8_;
			if (i_8_ > i_2_)
				i_2_ = i_8_;
			if (i_9_ < i_0_)
				i_0_ = i_9_;
			if (i_9_ > i_3_)
				i_3_ = i_9_;
			if (i_10_ < i_1_)
				i_1_ = i_10_;
			if (i_10_ > i_4_)
				i_4_ = i_10_;
			int i_11_ = i_8_ * i_8_ + i_10_ * i_10_;
			if (i_11_ > i_5_)
				i_5_ = i_11_;
			i_11_ = i_8_ * i_8_ + i_10_ * i_10_ + i_9_ * i_9_;
			if (i_11_ > i_6_)
				i_6_ = i_11_;
		}
		this.anInt7940 = i;
		this.anInt7941 = i_2_;
		this.anInt7938 = i_0_;
		this.anInt7939 = i_3_;
		this.anInt7942 = i_1_;
		this.anInt7943 = i_4_;
		this.anInt7936 = (int) (Math.sqrt((double) i_5_) + 0.99);
		this.anInt7928 = (int) (Math.sqrt((double) i_6_) + 0.99);
		this.aBoolean7950 = true;
	}

	static byte[] method4833(byte[] is, int i) {
		byte[] is_12_ = new byte[i];
		System.arraycopy(is, 0, is_12_, 0, i);
		return is_12_;
	}

	static short[] method4834(short[] is, int i) {
		short[] is_13_ = new short[i];
		System.arraycopy(is, 0, is_13_, 0, i);
		return is_13_;
	}

	boolean method4835() {
		if (this.aClass167_7926.aBoolean1710)
			return true;
		if ((this.aClass167_7926.anInterface7_Impl2_1709) == null)
			this.aClass167_7926.anInterface7_Impl2_1709 = this.nativeToolkit.method5381(false);
		Interface7_Impl2 interface7_impl2 = (this.aClass167_7926.anInterface7_Impl2_1709);
		interface7_impl2.method113(this.anInt7917 * 6);
		Unsafe unsafe = this.nativeToolkit.anUnsafe8219;
		if (unsafe != null) {
			int i = this.anInt7917 * 6;
			long l = interface7_impl2.method62(0, i);
			if (l == 0L)
				return false;
			for (int i_14_ = 0; i_14_ < this.anInt7917; i_14_++) {
				unsafe.putShort(l, this.aShortArray7920[i_14_]);
				l += 2L;
				unsafe.putShort(l, this.aShortArray7921[i_14_]);
				l += 2L;
				unsafe.putShort(l, this.aShortArray7922[i_14_]);
				l += 2L;
			}
			interface7_impl2.method69();
			this.aClass167_7926.anInterface7_Impl2_1707 = interface7_impl2;
			this.aClass167_7926.aBoolean1710 = true;
			this.aBoolean7932 = true;
			return true;
		}
		ByteBuffer bytebuffer = this.nativeToolkit.aByteBuffer8216;
		bytebuffer.clear();
		for (int i = 0; i < this.anInt7917; i++) {
			bytebuffer.putShort(this.aShortArray7920[i]);
			bytebuffer.putShort(this.aShortArray7921[i]);
			bytebuffer.putShort(this.aShortArray7922[i]);
		}
		if (interface7_impl2.method63(0, bytebuffer.position(), (this.nativeToolkit.aLong8217))) {
			this.aClass167_7926.anInterface7_Impl2_1707 = interface7_impl2;
			this.aClass167_7926.aBoolean1710 = true;
			this.aBoolean7932 = true;
			return true;
		}
		return false;
	}

    void method4738(int transformationType, int[] is, int i_15_, int i_16_, int i_17_, int i_18_, boolean bool) {
		int i_19_ = is.length;
		if (transformationType == AnimationFrameBase.UNKNOWN0) {
			i_15_ <<= 4;
			i_16_ <<= 4;
			i_17_ <<= 4;
			int i_20_ = 0;
			anInt7902 = 0;
			anInt7937 = 0;
			anInt7956 = 0;
			for (int i_21_ = 0; i_21_ < i_19_; i_21_++) {
				int i_22_ = is[i_21_];
				if (i_22_ < this.anIntArrayArray7918.length) {
					int[] is_23_ = this.anIntArrayArray7918[i_22_];
					for (int i_24_ = 0; i_24_ < is_23_.length; i_24_++) {
						int i_25_ = is_23_[i_24_];
						anInt7902 += this.anIntArray7901[i_25_];
						anInt7937 += this.anIntArray7895[i_25_];
						anInt7956 += this.anIntArray7965[i_25_];
						i_20_++;
					}
				}
			}
			if (i_20_ > 0) {
				anInt7902 = anInt7902 / i_20_ + i_15_;
				anInt7937 = anInt7937 / i_20_ + i_16_;
				anInt7956 = anInt7956 / i_20_ + i_17_;
			} else {
				anInt7902 = i_15_;
				anInt7937 = i_16_;
				anInt7956 = i_17_;
			}
		} else if (transformationType == AnimationFrameBase.UNKNOWN1) {
			i_15_ <<= 4;
			i_16_ <<= 4;
			i_17_ <<= 4;
			for (int i_26_ = 0; i_26_ < i_19_; i_26_++) {
				int i_27_ = is[i_26_];
				if (i_27_ < this.anIntArrayArray7918.length) {
					int[] is_28_ = this.anIntArrayArray7918[i_27_];
					for (int i_29_ = 0; i_29_ < is_28_.length; i_29_++) {
						int i_30_ = is_28_[i_29_];
						this.anIntArray7901[i_30_] += i_15_;
						this.anIntArray7895[i_30_] += i_16_;
						this.anIntArray7965[i_30_] += i_17_;
					}
				}
			}
		} else if (transformationType == AnimationFrameBase.UNKNOWN2) {
			for (int i_31_ = 0; i_31_ < i_19_; i_31_++) {
				int i_32_ = is[i_31_];
				if (i_32_ < this.anIntArrayArray7918.length) {
					int[] is_33_ = this.anIntArrayArray7918[i_32_];
					if ((i_18_ & 0x1) == 0) {
						for (int i_34_ = 0; i_34_ < is_33_.length; i_34_++) {
							int i_35_ = is_33_[i_34_];
							this.anIntArray7901[i_35_] -= anInt7902;
							this.anIntArray7895[i_35_] -= anInt7937;
							this.anIntArray7965[i_35_] -= anInt7956;
							if (i_17_ != 0) {
								int i_36_ = CircleAngleTable.SINE[i_17_];
								int i_37_ = CircleAngleTable.COSINE[i_17_];
								int i_38_ = ((this.anIntArray7895[i_35_]) * i_36_ + (this.anIntArray7901[i_35_]) * i_37_ + 16383) >> 14;
								this.anIntArray7895[i_35_] = ((this.anIntArray7895[i_35_]) * i_37_ - (this.anIntArray7901[i_35_]) * i_36_ + 16383) >> 14;
								this.anIntArray7901[i_35_] = i_38_;
							}
							if (i_15_ != 0) {
								int i_39_ = CircleAngleTable.SINE[i_15_];
								int i_40_ = CircleAngleTable.COSINE[i_15_];
								int i_41_ = ((this.anIntArray7895[i_35_]) * i_40_ - (this.anIntArray7965[i_35_]) * i_39_ + 16383) >> 14;
								this.anIntArray7965[i_35_] = ((this.anIntArray7895[i_35_]) * i_39_ + (this.anIntArray7965[i_35_]) * i_40_ + 16383) >> 14;
								this.anIntArray7895[i_35_] = i_41_;
							}
							if (i_16_ != 0) {
								int i_42_ = CircleAngleTable.SINE[i_16_];
								int i_43_ = CircleAngleTable.COSINE[i_16_];
								int i_44_ = ((this.anIntArray7965[i_35_]) * i_42_ + (this.anIntArray7901[i_35_]) * i_43_ + 16383) >> 14;
								this.anIntArray7965[i_35_] = ((this.anIntArray7965[i_35_]) * i_43_ - (this.anIntArray7901[i_35_]) * i_42_ + 16383) >> 14;
								this.anIntArray7901[i_35_] = i_44_;
							}
							this.anIntArray7901[i_35_] += anInt7902;
							this.anIntArray7895[i_35_] += anInt7937;
							this.anIntArray7965[i_35_] += anInt7956;
						}
					} else {
						for (int i_45_ = 0; i_45_ < is_33_.length; i_45_++) {
							int i_46_ = is_33_[i_45_];
							this.anIntArray7901[i_46_] -= anInt7902;
							this.anIntArray7895[i_46_] -= anInt7937;
							this.anIntArray7965[i_46_] -= anInt7956;
							if (i_15_ != 0) {
								int i_47_ = CircleAngleTable.SINE[i_15_];
								int i_48_ = CircleAngleTable.COSINE[i_15_];
								int i_49_ = ((this.anIntArray7895[i_46_]) * i_48_ - (this.anIntArray7965[i_46_]) * i_47_ + 16383) >> 14;
								this.anIntArray7965[i_46_] = ((this.anIntArray7895[i_46_]) * i_47_ + (this.anIntArray7965[i_46_]) * i_48_ + 16383) >> 14;
								this.anIntArray7895[i_46_] = i_49_;
							}
							if (i_17_ != 0) {
								int i_50_ = CircleAngleTable.SINE[i_17_];
								int i_51_ = CircleAngleTable.COSINE[i_17_];
								int i_52_ = ((this.anIntArray7895[i_46_]) * i_50_ + (this.anIntArray7901[i_46_]) * i_51_ + 16383) >> 14;
								this.anIntArray7895[i_46_] = ((this.anIntArray7895[i_46_]) * i_51_ - (this.anIntArray7901[i_46_]) * i_50_ + 16383) >> 14;
								this.anIntArray7901[i_46_] = i_52_;
							}
							if (i_16_ != 0) {
								int i_53_ = CircleAngleTable.SINE[i_16_];
								int i_54_ = CircleAngleTable.COSINE[i_16_];
								int i_55_ = ((this.anIntArray7965[i_46_]) * i_53_ + (this.anIntArray7901[i_46_]) * i_54_ + 16383) >> 14;
								this.anIntArray7965[i_46_] = ((this.anIntArray7965[i_46_]) * i_54_ - (this.anIntArray7901[i_46_]) * i_53_ + 16383) >> 14;
								this.anIntArray7901[i_46_] = i_55_;
							}
							this.anIntArray7901[i_46_] += anInt7902;
							this.anIntArray7895[i_46_] += anInt7937;
							this.anIntArray7965[i_46_] += anInt7956;
						}
					}
				}
			}
			if (bool) {
				for (int i_56_ = 0; i_56_ < i_19_; i_56_++) {
					int i_57_ = is[i_56_];
					if (i_57_ < this.anIntArrayArray7918.length) {
						int[] is_58_ = (this.anIntArrayArray7918[i_57_]);
						for (int i_59_ = 0; i_59_ < is_58_.length; i_59_++) {
							int i_60_ = is_58_[i_59_];
							int i_61_ = this.anIntArray7947[i_60_];
							int i_62_ = (this.anIntArray7947[i_60_ + 1]);
							for (int i_63_ = i_61_; i_63_ < i_62_; i_63_++) {
								int i_64_ = ((this.aShortArray7948[i_63_]) - 1);
								if (i_64_ == -1)
									break;
								if (i_17_ != 0) {
									int i_65_ = CircleAngleTable.SINE[i_17_];
									int i_66_ = CircleAngleTable.COSINE[i_17_];
									int i_67_ = (((this.aShortArray7910[i_64_]) * i_65_ + (this.aShortArray7909[i_64_]) * i_66_ + 16383) >> 14);
									this.aShortArray7910[i_64_] = (short) ((((this.aShortArray7910[i_64_]) * i_66_) - (this.aShortArray7909[i_64_]) * i_65_ + 16383) >> 14);
									this.aShortArray7909[i_64_] = (short) i_67_;
								}
								if (i_15_ != 0) {
									int i_68_ = CircleAngleTable.SINE[i_15_];
									int i_69_ = CircleAngleTable.COSINE[i_15_];
									int i_70_ = (((this.aShortArray7910[i_64_]) * i_69_ - (this.aShortArray7919[i_64_]) * i_68_ + 16383) >> 14);
									this.aShortArray7919[i_64_] = (short) ((((this.aShortArray7910[i_64_]) * i_68_) + (this.aShortArray7919[i_64_]) * i_69_ + 16383) >> 14);
									this.aShortArray7910[i_64_] = (short) i_70_;
								}
								if (i_16_ != 0) {
									int i_71_ = CircleAngleTable.SINE[i_16_];
									int i_72_ = CircleAngleTable.COSINE[i_16_];
									int i_73_ = (((this.aShortArray7919[i_64_]) * i_71_ + (this.aShortArray7909[i_64_]) * i_72_ + 16383) >> 14);
									this.aShortArray7919[i_64_] = (short) ((((this.aShortArray7919[i_64_]) * i_72_) - (this.aShortArray7909[i_64_]) * i_71_ + 16383) >> 14);
									this.aShortArray7909[i_64_] = (short) i_73_;
								}
							}
						}
					}
				}
				method4839();
			}
		} else if (transformationType == AnimationFrameBase.UNKNOWN3) {
			for (int i_74_ = 0; i_74_ < i_19_; i_74_++) {
				int i_75_ = is[i_74_];
				if (i_75_ < this.anIntArrayArray7918.length) {
					int[] is_76_ = this.anIntArrayArray7918[i_75_];
					for (int i_77_ = 0; i_77_ < is_76_.length; i_77_++) {
						int i_78_ = is_76_[i_77_];
						this.anIntArray7901[i_78_] -= anInt7902;
						this.anIntArray7895[i_78_] -= anInt7937;
						this.anIntArray7965[i_78_] -= anInt7956;
						this.anIntArray7901[i_78_] = (this.anIntArray7901[i_78_] * i_15_) >> 7;
						this.anIntArray7895[i_78_] = (this.anIntArray7895[i_78_] * i_16_) >> 7;
						this.anIntArray7965[i_78_] = (this.anIntArray7965[i_78_] * i_17_) >> 7;
						this.anIntArray7901[i_78_] += anInt7902;
						this.anIntArray7895[i_78_] += anInt7937;
						this.anIntArray7965[i_78_] += anInt7956;
					}
				}
			}
		} else if (transformationType == AnimationFrameBase.UNKNOWN5) {
			if (this.anIntArrayArray7924 != null) {
				boolean bool_79_ = false;
				for (int i_80_ = 0; i_80_ < i_19_; i_80_++) {
					int i_81_ = is[i_80_];
					if (i_81_ < this.anIntArrayArray7924.length) {
						int[] is_82_ = (this.anIntArrayArray7924[i_81_]);
						for (int i_83_ = 0; i_83_ < is_82_.length; i_83_++) {
							int i_84_ = is_82_[i_83_];
							int i_85_ = (this.aByteArray7963[i_84_] & 0xff) + i_15_ * 8;
							if (i_85_ < 0)
								i_85_ = 0;
							else if (i_85_ > 255)
								i_85_ = 255;
							this.aByteArray7963[i_84_] = (byte) i_85_;
						}
						bool_79_ = bool_79_ | is_82_.length > 0;
					}
				}
				if (bool_79_) {
					if (this.aClass191Array7952 != null) {
						for (int i_86_ = 0; i_86_ < this.anInt7951; i_86_++) {
							Class191 class191 = (this.aClass191Array7952[i_86_]);
							Class166 class166 = (this.aClass166Array7892[i_86_]);
							class166.anInt1703 = (class166.anInt1703 & 0xffffff | 255 - ((this.aByteArray7963[class191.anInt1947]) & 0xff) << 24);
						}
					}
					method4838();
				}
			}
		} else if (transformationType == AnimationFrameBase.UNKNOWN7) {
			if (this.anIntArrayArray7924 != null) {
				boolean bool_87_ = false;
				for (int i_88_ = 0; i_88_ < i_19_; i_88_++) {
					int i_89_ = is[i_88_];
					if (i_89_ < this.anIntArrayArray7924.length) {
						int[] is_90_ = (this.anIntArrayArray7924[i_89_]);
						for (int i_91_ = 0; i_91_ < is_90_.length; i_91_++) {
							int i_92_ = is_90_[i_91_];
							int i_93_ = ((this.aShortArray7935[i_92_]) & 0xffff);
							int i_94_ = i_93_ >> 10 & 0x3f;
							int i_95_ = i_93_ >> 7 & 0x7;
							int i_96_ = i_93_ & 0x7f;
							i_94_ = i_94_ + i_15_ & 0x3f;
							i_95_ += i_16_ / 4;
							if (i_95_ < 0)
								i_95_ = 0;
							else if (i_95_ > 7)
								i_95_ = 7;
							i_96_ += i_17_;
							if (i_96_ < 0)
								i_96_ = 0;
							else if (i_96_ > 127)
								i_96_ = 127;
							this.aShortArray7935[i_92_] = (short) (i_94_ << 10 | i_95_ << 7 | i_96_);
						}
						bool_87_ = bool_87_ | is_90_.length > 0;
					}
				}
				if (bool_87_) {
					if (this.aClass191Array7952 != null) {
						for (int i_97_ = 0; i_97_ < this.anInt7951; i_97_++) {
							Class191 class191 = (this.aClass191Array7952[i_97_]);
							Class166 class166 = (this.aClass166Array7892[i_97_]);
							class166.anInt1703 = (class166.anInt1703 & ~0xffffff | (Class294.anIntArray3165[((this.aShortArray7935[class191.anInt1947]) & 0xffff)]) & 0xffffff);
						}
					}
					method4838();
				}
			}
		} else if (transformationType == AnimationFrameBase.UNKNOWN9) {
			if (this.anIntArrayArray7946 != null) {
				for (int i_98_ = 0; i_98_ < i_19_; i_98_++) {
					int i_99_ = is[i_98_];
					if (i_99_ < this.anIntArrayArray7946.length) {
						int[] is_100_ = (this.anIntArrayArray7946[i_99_]);
						for (int i_101_ = 0; i_101_ < is_100_.length; i_101_++) {
							Class166 class166 = (this.aClass166Array7892[is_100_[i_101_]]);
							class166.anInt1704 += i_15_;
							class166.anInt1705 += i_16_;
						}
					}
				}
			}
		} else if (transformationType == AnimationFrameBase.UNKNOWN10) {
			if (this.anIntArrayArray7946 != null) {
				for (int i_102_ = 0; i_102_ < i_19_; i_102_++) {
					int i_103_ = is[i_102_];
					if (i_103_ < this.anIntArrayArray7946.length) {
						int[] is_104_ = (this.anIntArrayArray7946[i_103_]);
						for (int i_105_ = 0; i_105_ < is_104_.length; i_105_++) {
							Class166 class166 = (this.aClass166Array7892[is_104_[i_105_]]);
							class166.anInt1702 = class166.anInt1702 * i_15_ >> 7;
							class166.anInt1701 = class166.anInt1701 * i_16_ >> 7;
						}
					}
				}
			}
		} else if (transformationType == AnimationFrameBase.UNKNOWN9) {
			if (this.anIntArrayArray7946 != null) {
				for (int i_106_ = 0; i_106_ < i_19_; i_106_++) {
					int i_107_ = is[i_106_];
					if (i_107_ < this.anIntArrayArray7946.length) {
						int[] is_108_ = (this.anIntArrayArray7946[i_107_]);
						for (int i_109_ = 0; i_109_ < is_108_.length; i_109_++) {
							Class166 class166 = (this.aClass166Array7892[is_108_[i_109_]]);
							class166.anInt1706 = (class166.anInt1706 + i_15_ & 0x3fff);
						}
					}
				}
			}
		}
	}

	public void method4784() {
		if (this.anInt7906 > 0 && this.anInt7917 > 0) {
			method4844();
			method4835();
			method4837();
		}
	}

	public ModelToolkit method4755(byte i, int i_110_, boolean bool) {
		boolean bool_111_ = false;
		JavaGraphicsModelTookit javaGraphicsModelTookit_112_;
		JavaGraphicsModelTookit javaGraphicsModelTookit_113_;
		if (i > 0 && i <= 7) {
			javaGraphicsModelTookit_113_ = (this.nativeToolkit.javaGraphicsModelTookits2[i - 1]);
			javaGraphicsModelTookit_112_ = (this.nativeToolkit.javaGraphicsModelTookits[i - 1]);
			bool_111_ = true;
		} else
			javaGraphicsModelTookit_112_ = javaGraphicsModelTookit_113_ = new JavaGraphicsModelTookit(this.nativeToolkit, 0, 0, true, false);
		return method4836(javaGraphicsModelTookit_112_, javaGraphicsModelTookit_113_, i_110_, bool_111_, bool);
	}

	ModelToolkit method4836(JavaGraphicsModelTookit javaGraphicsModelTookit_114_, JavaGraphicsModelTookit javaGraphicsModelTookit_115_, int i, boolean bool, boolean bool_116_) {
		javaGraphicsModelTookit_114_.anInt7912 = i;
		javaGraphicsModelTookit_114_.anInt7896 = this.anInt7896;
		javaGraphicsModelTookit_114_.aShort7897 = this.aShort7897;
		javaGraphicsModelTookit_114_.aShort7898 = this.aShort7898;
		javaGraphicsModelTookit_114_.anInt7899 = this.anInt7899;
		javaGraphicsModelTookit_114_.anInt7900 = this.anInt7900;
		javaGraphicsModelTookit_114_.anInt7906 = this.anInt7906;
		javaGraphicsModelTookit_114_.anInt7916 = this.anInt7916;
		javaGraphicsModelTookit_114_.anInt7917 = this.anInt7917;
		javaGraphicsModelTookit_114_.anInt7951 = this.anInt7951;
		if ((i & 0x100) != 0)
			javaGraphicsModelTookit_114_.aBoolean7893 = true;
		else
			javaGraphicsModelTookit_114_.aBoolean7893 = this.aBoolean7893;
		javaGraphicsModelTookit_114_.aBoolean7903 = this.aBoolean7903;
		boolean bool_117_ = Class154.method1659(i, this.anInt7896);
		boolean bool_118_ = Class154.method1670(i, this.anInt7896);
		boolean bool_119_ = Class154.method1660(i, this.anInt7896);
		boolean bool_120_ = bool_117_ | bool_118_ | bool_119_;
		if (bool_120_) {
			if (bool_117_) {
				if (javaGraphicsModelTookit_115_.anIntArray7901 == null || ((javaGraphicsModelTookit_115_.anIntArray7901).length < this.anInt7899))
					javaGraphicsModelTookit_114_.anIntArray7901 = javaGraphicsModelTookit_115_.anIntArray7901 = new int[this.anInt7899];
				else
					javaGraphicsModelTookit_114_.anIntArray7901 = javaGraphicsModelTookit_115_.anIntArray7901;
			} else
				javaGraphicsModelTookit_114_.anIntArray7901 = this.anIntArray7901;
			if (bool_118_) {
				if (javaGraphicsModelTookit_115_.anIntArray7895 == null || ((javaGraphicsModelTookit_115_.anIntArray7895).length < this.anInt7899))
					javaGraphicsModelTookit_114_.anIntArray7895 = javaGraphicsModelTookit_115_.anIntArray7895 = new int[this.anInt7899];
				else
					javaGraphicsModelTookit_114_.anIntArray7895 = javaGraphicsModelTookit_115_.anIntArray7895;
			} else
				javaGraphicsModelTookit_114_.anIntArray7895 = this.anIntArray7895;
			if (bool_119_) {
				if (javaGraphicsModelTookit_115_.anIntArray7965 == null || ((javaGraphicsModelTookit_115_.anIntArray7965).length < this.anInt7899))
					javaGraphicsModelTookit_114_.anIntArray7965 = javaGraphicsModelTookit_115_.anIntArray7965 = new int[this.anInt7899];
				else
					javaGraphicsModelTookit_114_.anIntArray7965 = javaGraphicsModelTookit_115_.anIntArray7965;
			} else
				javaGraphicsModelTookit_114_.anIntArray7965 = this.anIntArray7965;
			for (int i_121_ = 0; i_121_ < this.anInt7899; i_121_++) {
				if (bool_117_)
					javaGraphicsModelTookit_114_.anIntArray7901[i_121_] = this.anIntArray7901[i_121_];
				if (bool_118_)
					javaGraphicsModelTookit_114_.anIntArray7895[i_121_] = this.anIntArray7895[i_121_];
				if (bool_119_)
					javaGraphicsModelTookit_114_.anIntArray7965[i_121_] = this.anIntArray7965[i_121_];
			}
		} else {
			javaGraphicsModelTookit_114_.anIntArray7901 = this.anIntArray7901;
			javaGraphicsModelTookit_114_.anIntArray7895 = this.anIntArray7895;
			javaGraphicsModelTookit_114_.anIntArray7965 = this.anIntArray7965;
		}
		if (Class154.method1685(i, this.anInt7896)) {
			javaGraphicsModelTookit_114_.aClass186_7927 = javaGraphicsModelTookit_115_.aClass186_7927;
			javaGraphicsModelTookit_114_.aClass186_7927.anInterface7_Impl1_1902 = (this.aClass186_7927.anInterface7_Impl1_1902);
			javaGraphicsModelTookit_114_.aClass186_7927.aBoolean1900 = (this.aClass186_7927.aBoolean1900);
			javaGraphicsModelTookit_114_.aClass186_7927.aBoolean1901 = true;
		} else if (Class154.method1671(i, this.anInt7896))
			javaGraphicsModelTookit_114_.aClass186_7927 = this.aClass186_7927;
		else
			javaGraphicsModelTookit_114_.aClass186_7927 = null;
		if (Class154.method1662(i, this.anInt7896)) {
			if (javaGraphicsModelTookit_115_.aShortArray7935 == null || (javaGraphicsModelTookit_115_.aShortArray7935.length < this.anInt7916))
				javaGraphicsModelTookit_114_.aShortArray7935 = javaGraphicsModelTookit_115_.aShortArray7935 = new short[this.anInt7916];
			else
				javaGraphicsModelTookit_114_.aShortArray7935 = javaGraphicsModelTookit_115_.aShortArray7935;
			for (int i_122_ = 0; i_122_ < this.anInt7916; i_122_++)
				javaGraphicsModelTookit_114_.aShortArray7935[i_122_] = this.aShortArray7935[i_122_];
		} else
			javaGraphicsModelTookit_114_.aShortArray7935 = this.aShortArray7935;
		if (Class154.method1663(i, this.anInt7896)) {
			if (javaGraphicsModelTookit_115_.aByteArray7963 == null || (javaGraphicsModelTookit_115_.aByteArray7963.length < this.anInt7916))
				javaGraphicsModelTookit_114_.aByteArray7963 = javaGraphicsModelTookit_115_.aByteArray7963 = new byte[this.anInt7916];
			else
				javaGraphicsModelTookit_114_.aByteArray7963 = javaGraphicsModelTookit_115_.aByteArray7963;
			for (int i_123_ = 0; i_123_ < this.anInt7916; i_123_++)
				javaGraphicsModelTookit_114_.aByteArray7963[i_123_] = this.aByteArray7963[i_123_];
		} else
			javaGraphicsModelTookit_114_.aByteArray7963 = this.aByteArray7963;
		if (Class154.method1680(i, this.anInt7896)) {
			javaGraphicsModelTookit_114_.aClass186_7911 = javaGraphicsModelTookit_115_.aClass186_7911;
			javaGraphicsModelTookit_114_.aClass186_7911.anInterface7_Impl1_1902 = (this.aClass186_7911.anInterface7_Impl1_1902);
			javaGraphicsModelTookit_114_.aClass186_7911.aBoolean1900 = (this.aClass186_7911.aBoolean1900);
			javaGraphicsModelTookit_114_.aClass186_7911.aBoolean1901 = true;
		} else if (Class154.method1667(i, this.anInt7896))
			javaGraphicsModelTookit_114_.aClass186_7911 = this.aClass186_7911;
		else
			javaGraphicsModelTookit_114_.aClass186_7911 = null;
		if (Class154.method1661(i, this.anInt7896)) {
			if (javaGraphicsModelTookit_115_.aShortArray7909 == null || (javaGraphicsModelTookit_115_.aShortArray7909.length < this.anInt7906)) {
				int i_124_ = this.anInt7906;
				javaGraphicsModelTookit_114_.aShortArray7909 = javaGraphicsModelTookit_115_.aShortArray7909 = new short[i_124_];
				javaGraphicsModelTookit_114_.aShortArray7910 = javaGraphicsModelTookit_115_.aShortArray7910 = new short[i_124_];
				javaGraphicsModelTookit_114_.aShortArray7919 = javaGraphicsModelTookit_115_.aShortArray7919 = new short[i_124_];
			} else {
				javaGraphicsModelTookit_114_.aShortArray7909 = javaGraphicsModelTookit_115_.aShortArray7909;
				javaGraphicsModelTookit_114_.aShortArray7910 = javaGraphicsModelTookit_115_.aShortArray7910;
				javaGraphicsModelTookit_114_.aShortArray7919 = javaGraphicsModelTookit_115_.aShortArray7919;
			}
			if (this.aClass185_7915 != null) {
				if (javaGraphicsModelTookit_115_.aClass185_7915 == null)
					javaGraphicsModelTookit_115_.aClass185_7915 = new Class185();
				Class185 class185 = (javaGraphicsModelTookit_114_.aClass185_7915 = javaGraphicsModelTookit_115_.aClass185_7915);
				if (class185.aShortArray1899 == null || (class185.aShortArray1899.length < this.anInt7906)) {
					int i_125_ = this.anInt7906;
					class185.aShortArray1899 = new short[i_125_];
					class185.aShortArray1897 = new short[i_125_];
					class185.aShortArray1896 = new short[i_125_];
					class185.aByteArray1898 = new byte[i_125_];
				}
				for (int i_126_ = 0; i_126_ < this.anInt7906; i_126_++) {
					javaGraphicsModelTookit_114_.aShortArray7909[i_126_] = this.aShortArray7909[i_126_];
					javaGraphicsModelTookit_114_.aShortArray7910[i_126_] = this.aShortArray7910[i_126_];
					javaGraphicsModelTookit_114_.aShortArray7919[i_126_] = this.aShortArray7919[i_126_];
					class185.aShortArray1899[i_126_] = (this.aClass185_7915.aShortArray1899[i_126_]);
					class185.aShortArray1897[i_126_] = (this.aClass185_7915.aShortArray1897[i_126_]);
					class185.aShortArray1896[i_126_] = (this.aClass185_7915.aShortArray1896[i_126_]);
					class185.aByteArray1898[i_126_] = (this.aClass185_7915.aByteArray1898[i_126_]);
				}
			} else {
				javaGraphicsModelTookit_114_.aClass185_7915 = null;
				for (int i_127_ = 0; i_127_ < this.anInt7906; i_127_++) {
					javaGraphicsModelTookit_114_.aShortArray7909[i_127_] = this.aShortArray7909[i_127_];
					javaGraphicsModelTookit_114_.aShortArray7910[i_127_] = this.aShortArray7910[i_127_];
					javaGraphicsModelTookit_114_.aShortArray7919[i_127_] = this.aShortArray7919[i_127_];
				}
			}
			javaGraphicsModelTookit_114_.aByteArray7958 = this.aByteArray7958;
		} else {
			javaGraphicsModelTookit_114_.aClass185_7915 = this.aClass185_7915;
			javaGraphicsModelTookit_114_.aShortArray7909 = this.aShortArray7909;
			javaGraphicsModelTookit_114_.aShortArray7910 = this.aShortArray7910;
			javaGraphicsModelTookit_114_.aShortArray7919 = this.aShortArray7919;
			javaGraphicsModelTookit_114_.aByteArray7958 = this.aByteArray7958;
		}
		if (Class154.method1669(i, this.anInt7896)) {
			javaGraphicsModelTookit_114_.aClass186_7934 = javaGraphicsModelTookit_115_.aClass186_7934;
			javaGraphicsModelTookit_114_.aClass186_7934.anInterface7_Impl1_1902 = (this.aClass186_7934.anInterface7_Impl1_1902);
			javaGraphicsModelTookit_114_.aClass186_7934.aBoolean1900 = (this.aClass186_7934.aBoolean1900);
			javaGraphicsModelTookit_114_.aClass186_7934.aBoolean1901 = true;
		} else if (Class154.method1690(i, this.anInt7896))
			javaGraphicsModelTookit_114_.aClass186_7934 = this.aClass186_7934;
		else
			javaGraphicsModelTookit_114_.aClass186_7934 = null;
		if (Class154.method1664(i, this.anInt7896)) {
			if (javaGraphicsModelTookit_115_.aFloatArray7953 == null || (javaGraphicsModelTookit_115_.aFloatArray7953.length < this.anInt7916)) {
				int i_128_ = this.anInt7906;
				javaGraphicsModelTookit_114_.aFloatArray7953 = javaGraphicsModelTookit_115_.aFloatArray7953 = new float[i_128_];
				javaGraphicsModelTookit_114_.aFloatArray7914 = javaGraphicsModelTookit_115_.aFloatArray7914 = new float[i_128_];
			} else {
				javaGraphicsModelTookit_114_.aFloatArray7953 = javaGraphicsModelTookit_115_.aFloatArray7953;
				javaGraphicsModelTookit_114_.aFloatArray7914 = javaGraphicsModelTookit_115_.aFloatArray7914;
			}
			for (int i_129_ = 0; i_129_ < this.anInt7906; i_129_++) {
				javaGraphicsModelTookit_114_.aFloatArray7953[i_129_] = this.aFloatArray7953[i_129_];
				javaGraphicsModelTookit_114_.aFloatArray7914[i_129_] = this.aFloatArray7914[i_129_];
			}
		} else {
			javaGraphicsModelTookit_114_.aFloatArray7953 = this.aFloatArray7953;
			javaGraphicsModelTookit_114_.aFloatArray7914 = this.aFloatArray7914;
		}
		if (Class154.method1692(i, this.anInt7896)) {
			javaGraphicsModelTookit_114_.aClass186_7930 = javaGraphicsModelTookit_115_.aClass186_7930;
			javaGraphicsModelTookit_114_.aClass186_7930.anInterface7_Impl1_1902 = (this.aClass186_7930.anInterface7_Impl1_1902);
			javaGraphicsModelTookit_114_.aClass186_7930.aBoolean1900 = (this.aClass186_7930.aBoolean1900);
			javaGraphicsModelTookit_114_.aClass186_7930.aBoolean1901 = true;
		} else if (Class154.method1683(i, this.anInt7896))
			javaGraphicsModelTookit_114_.aClass186_7930 = this.aClass186_7930;
		else
			javaGraphicsModelTookit_114_.aClass186_7930 = null;
		if (Class154.method1682(i, this.anInt7896)) {
			if (javaGraphicsModelTookit_115_.aShortArray7920 == null || (javaGraphicsModelTookit_115_.aShortArray7920.length < this.anInt7916)) {
				int i_130_ = this.anInt7916;
				javaGraphicsModelTookit_114_.aShortArray7920 = javaGraphicsModelTookit_115_.aShortArray7920 = new short[i_130_];
				javaGraphicsModelTookit_114_.aShortArray7921 = javaGraphicsModelTookit_115_.aShortArray7921 = new short[i_130_];
				javaGraphicsModelTookit_114_.aShortArray7922 = javaGraphicsModelTookit_115_.aShortArray7922 = new short[i_130_];
			} else {
				javaGraphicsModelTookit_114_.aShortArray7920 = javaGraphicsModelTookit_115_.aShortArray7920;
				javaGraphicsModelTookit_114_.aShortArray7921 = javaGraphicsModelTookit_115_.aShortArray7921;
				javaGraphicsModelTookit_114_.aShortArray7922 = javaGraphicsModelTookit_115_.aShortArray7922;
			}
			for (int i_131_ = 0; i_131_ < this.anInt7916; i_131_++) {
				javaGraphicsModelTookit_114_.aShortArray7920[i_131_] = this.aShortArray7920[i_131_];
				javaGraphicsModelTookit_114_.aShortArray7921[i_131_] = this.aShortArray7921[i_131_];
				javaGraphicsModelTookit_114_.aShortArray7922[i_131_] = this.aShortArray7922[i_131_];
			}
		} else {
			javaGraphicsModelTookit_114_.aShortArray7920 = this.aShortArray7920;
			javaGraphicsModelTookit_114_.aShortArray7921 = this.aShortArray7921;
			javaGraphicsModelTookit_114_.aShortArray7922 = this.aShortArray7922;
		}
		if (Class154.method1686(i, this.anInt7896)) {
			javaGraphicsModelTookit_114_.aClass167_7926 = javaGraphicsModelTookit_115_.aClass167_7926;
			javaGraphicsModelTookit_114_.aClass167_7926.anInterface7_Impl2_1707 = (this.aClass167_7926.anInterface7_Impl2_1707);
			javaGraphicsModelTookit_114_.aClass167_7926.aBoolean1710 = (this.aClass167_7926.aBoolean1710);
			javaGraphicsModelTookit_114_.aClass167_7926.aBoolean1708 = true;
		} else if (Class154.method1668(i, this.anInt7896))
			javaGraphicsModelTookit_114_.aClass167_7926 = this.aClass167_7926;
		else
			javaGraphicsModelTookit_114_.aClass167_7926 = null;
		if (Class154.method1665(i, this.anInt7896)) {
			if (javaGraphicsModelTookit_115_.aShortArray7923 == null || (javaGraphicsModelTookit_115_.aShortArray7923.length < this.anInt7916)) {
				int i_132_ = this.anInt7916;
				javaGraphicsModelTookit_114_.aShortArray7923 = javaGraphicsModelTookit_115_.aShortArray7923 = new short[i_132_];
			} else
				javaGraphicsModelTookit_114_.aShortArray7923 = javaGraphicsModelTookit_115_.aShortArray7923;
			for (int i_133_ = 0; i_133_ < this.anInt7916; i_133_++)
				javaGraphicsModelTookit_114_.aShortArray7923[i_133_] = this.aShortArray7923[i_133_];
		} else
			javaGraphicsModelTookit_114_.aShortArray7923 = this.aShortArray7923;
		if (Class154.method1666(i, this.anInt7896)) {
			if (javaGraphicsModelTookit_115_.aClass166Array7892 == null || ((javaGraphicsModelTookit_115_.aClass166Array7892).length < this.anInt7951)) {
				int i_134_ = this.anInt7951;
				javaGraphicsModelTookit_114_.aClass166Array7892 = javaGraphicsModelTookit_115_.aClass166Array7892 = new Class166[i_134_];
				for (int i_135_ = 0; i_135_ < this.anInt7951; i_135_++)
					javaGraphicsModelTookit_114_.aClass166Array7892[i_135_] = this.aClass166Array7892[i_135_].method1785();
			} else {
				javaGraphicsModelTookit_114_.aClass166Array7892 = javaGraphicsModelTookit_115_.aClass166Array7892;
				for (int i_136_ = 0; i_136_ < this.anInt7951; i_136_++)
					javaGraphicsModelTookit_114_.aClass166Array7892[i_136_].method1786(this.aClass166Array7892[i_136_]);
			}
		} else
			javaGraphicsModelTookit_114_.aClass166Array7892 = this.aClass166Array7892;
		javaGraphicsModelTookit_114_.aClass191Array7952 = this.aClass191Array7952;
		if (this.aBoolean7950) {
			javaGraphicsModelTookit_114_.anInt7928 = this.anInt7928;
			javaGraphicsModelTookit_114_.anInt7936 = this.anInt7936;
			javaGraphicsModelTookit_114_.anInt7940 = this.anInt7940;
			javaGraphicsModelTookit_114_.anInt7941 = this.anInt7941;
			javaGraphicsModelTookit_114_.anInt7938 = this.anInt7938;
			javaGraphicsModelTookit_114_.anInt7939 = this.anInt7939;
			javaGraphicsModelTookit_114_.anInt7942 = this.anInt7942;
			javaGraphicsModelTookit_114_.anInt7943 = this.anInt7943;
			javaGraphicsModelTookit_114_.aBoolean7950 = true;
		} else
			javaGraphicsModelTookit_114_.aBoolean7950 = false;
		javaGraphicsModelTookit_114_.anIntArrayArray7918 = this.anIntArrayArray7918;
		javaGraphicsModelTookit_114_.anIntArrayArray7924 = this.anIntArrayArray7924;
		javaGraphicsModelTookit_114_.anIntArrayArray7946 = this.anIntArrayArray7946;
		javaGraphicsModelTookit_114_.aShortArray7948 = this.aShortArray7948;
		javaGraphicsModelTookit_114_.anIntArray7947 = this.anIntArray7947;
		javaGraphicsModelTookit_114_.aShortArray7907 = this.aShortArray7907;
		javaGraphicsModelTookit_114_.aShortArray7908 = this.aShortArray7908;
		javaGraphicsModelTookit_114_.aShortArray7964 = this.aShortArray7964;
		javaGraphicsModelTookit_114_.aShortArray7925 = this.aShortArray7925;
		javaGraphicsModelTookit_114_.anIntArray7944 = this.anIntArray7944;
		javaGraphicsModelTookit_114_.anIntArray7913 = this.anIntArray7913;
		javaGraphicsModelTookit_114_.anIntArray7945 = this.anIntArray7945;
		javaGraphicsModelTookit_114_.aEmissiveTriangleArray7949 = this.aEmissiveTriangleArray7949;
		javaGraphicsModelTookit_114_.aEffectiveVertexArray7904 = this.aEffectiveVertexArray7904;
		return javaGraphicsModelTookit_114_;
	}

	void method4837() {
		if (this.aBoolean7932) {
			this.aBoolean7932 = false;
			if (this.aEmissiveTriangleArray7949 == null && this.aEffectiveVertexArray7904 == null && this.aClass191Array7952 == null && !Class154.method1689(this.anInt7912, this.anInt7896)) {
				boolean bool = false;
				boolean bool_137_ = false;
				boolean bool_138_ = false;
				if (this.anIntArray7901 != null && !Class154.method1672(this.anInt7912, (this.anInt7896))) {
					if (this.aClass186_7927 == null || this.aClass186_7927.method1848()) {
						if (!this.aBoolean7950)
							method4832();
						bool = true;
					} else
						this.aBoolean7932 = true;
				}
				if (this.anIntArray7895 != null && !Class154.method1673(this.anInt7912, (this.anInt7896))) {
					if (this.aClass186_7927 == null || this.aClass186_7927.method1848()) {
						if (!this.aBoolean7950)
							method4832();
						bool_137_ = true;
					} else
						this.aBoolean7932 = true;
				}
				if (this.anIntArray7965 != null && !Class154.method1674(this.anInt7912, (this.anInt7896))) {
					if (this.aClass186_7927 == null || this.aClass186_7927.method1848()) {
						if (!this.aBoolean7950)
							method4832();
						bool_138_ = true;
					} else
						this.aBoolean7932 = true;
				}
				if (bool)
					this.anIntArray7901 = null;
				if (bool_137_)
					this.anIntArray7895 = null;
				if (bool_138_)
					this.anIntArray7965 = null;
			}
			if (this.aShortArray7948 != null && this.anIntArray7901 == null && this.anIntArray7895 == null && this.anIntArray7965 == null) {
				this.aShortArray7948 = null;
				this.anIntArray7947 = null;
			}
			while_121_: do {
				if (this.aByteArray7958 != null && !Class154.method1675(this.anInt7912, (this.anInt7896))) {
					do {
						if ((this.anInt7896 & 0x37) != 0) {
							if (this.aClass186_7934 != null && !this.aClass186_7934.method1848())
								break;
						} else if ((this.aClass186_7911 != null) && !this.aClass186_7911.method1848())
							break;
						this.aShortArray7919 = null;
						this.aShortArray7910 = null;
						this.aShortArray7909 = null;
						this.aByteArray7958 = null;
						break while_121_;
					} while (false);
					this.aBoolean7932 = true;
				}
			} while (false);
			if (this.aShortArray7935 != null && !Class154.method1688(this.anInt7912, this.anInt7896)) {
				if (this.aClass186_7911 == null || this.aClass186_7911.method1848())
					this.aShortArray7935 = null;
				else
					this.aBoolean7932 = true;
			}
			if (this.aByteArray7963 != null && !Class154.method1687(this.anInt7912, this.anInt7896)) {
				if (this.aClass186_7911 == null || this.aClass186_7911.method1848())
					this.aByteArray7963 = null;
				else
					this.aBoolean7932 = true;
			}
			if (this.aFloatArray7953 != null && !Class154.method1676(this.anInt7912, this.anInt7896)) {
				if (this.aClass186_7930 == null || this.aClass186_7930.method1848()) {
					this.aFloatArray7914 = null;
					this.aFloatArray7953 = null;
				} else
					this.aBoolean7932 = true;
			}
			if (this.aShortArray7923 != null && !Class154.method1681(this.anInt7912, this.anInt7896)) {
				if (this.aClass186_7911 == null || this.aClass186_7911.method1848())
					this.aShortArray7923 = null;
				else
					this.aBoolean7932 = true;
			}
			if (this.aShortArray7920 != null && !Class154.method1691(this.anInt7912, this.anInt7896)) {
				if ((this.aClass167_7926 == null || this.aClass167_7926.method1787()) && (this.aClass186_7911 == null || this.aClass186_7911.method1848())) {
					this.aShortArray7922 = null;
					this.aShortArray7921 = null;
					this.aShortArray7920 = null;
				} else
					this.aBoolean7932 = true;
			}
			if (this.aShortArray7907 != null) {
				if (this.aClass186_7927 == null || this.aClass186_7927.method1848())
					this.aShortArray7907 = null;
				else
					this.aBoolean7932 = true;
			}
			if (this.aShortArray7908 != null) {
				if (this.aClass186_7911 == null || this.aClass186_7911.method1848())
					this.aShortArray7908 = null;
				else
					this.aBoolean7932 = true;
			}
			if (this.anIntArrayArray7924 != null && !Class154.method1677(this.anInt7912, this.anInt7896)) {
				this.anIntArrayArray7924 = null;
				this.aShortArray7925 = null;
			}
			if (this.anIntArrayArray7918 != null && !Class154.method1678(this.anInt7912, this.anInt7896)) {
				this.anIntArrayArray7918 = null;
				this.aShortArray7964 = null;
			}
			if (this.anIntArrayArray7946 != null && !Class154.method1679(this.anInt7912, this.anInt7896))
				this.anIntArrayArray7946 = null;
			if (this.anIntArray7944 != null && (this.anInt7912 & 0x800) == 0 && (this.anInt7912 & 0x40000) == 0) {
				this.anIntArray7944 = null;
				this.anIntArray7913 = null;
				this.anIntArray7945 = null;
			}
		}
	}

    void method4838() {
		if (this.aClass186_7911 != null)
			this.aClass186_7911.aBoolean1900 = false;
	}

	void method4839() {
		if ((this.anInt7896 & 0x37) != 0) {
			if (this.aClass186_7934 != null)
				this.aClass186_7934.aBoolean1900 = false;
		} else if (this.aClass186_7911 != null)
			this.aClass186_7911.aBoolean1900 = false;
	}

    public void f(int i) {
		int i_145_ = CircleAngleTable.SINE[i];
		int i_146_ = CircleAngleTable.COSINE[i];
		for (int i_147_ = 0; i_147_ < this.anInt7900; i_147_++) {
			int i_148_ = ((this.anIntArray7965[i_147_] * i_145_ + this.anIntArray7901[i_147_] * i_146_) >> 14);
			this.anIntArray7965[i_147_] = ((this.anIntArray7965[i_147_] * i_146_ - this.anIntArray7901[i_147_] * i_145_) >> 14);
			this.anIntArray7901[i_147_] = i_148_;
		}
		method4851();
		this.aBoolean7950 = false;
	}

	public void t(int i) {
		int i_149_ = CircleAngleTable.SINE[i];
		int i_150_ = CircleAngleTable.COSINE[i];
		for (int i_151_ = 0; i_151_ < this.anInt7900; i_151_++) {
			int i_152_ = ((this.anIntArray7895[i_151_] * i_150_ - this.anIntArray7965[i_151_] * i_149_) >> 14);
			this.anIntArray7965[i_151_] = ((this.anIntArray7895[i_151_] * i_149_ + this.anIntArray7965[i_151_] * i_150_) >> 14);
			this.anIntArray7895[i_151_] = i_152_;
		}
		method4851();
		this.aBoolean7950 = false;
	}

	public void EA(int i) {
		int i_153_ = CircleAngleTable.SINE[i];
		int i_154_ = CircleAngleTable.COSINE[i];
		for (int i_155_ = 0; i_155_ < this.anInt7900; i_155_++) {
			int i_156_ = ((this.anIntArray7895[i_155_] * i_153_ + this.anIntArray7901[i_155_] * i_154_) >> 14);
			this.anIntArray7895[i_155_] = ((this.anIntArray7895[i_155_] * i_154_ - this.anIntArray7901[i_155_] * i_153_) >> 14);
			this.anIntArray7901[i_155_] = i_156_;
		}
		method4851();
		this.aBoolean7950 = false;
	}

	public void ia(int i, int i_157_, int i_158_) {
		for (int i_159_ = 0; i_159_ < this.anInt7900; i_159_++) {
			if (i != 0)
				this.anIntArray7901[i_159_] += i;
			if (i_157_ != 0)
				this.anIntArray7895[i_159_] += i_157_;
			if (i_158_ != 0)
				this.anIntArray7965[i_159_] += i_158_;
		}
		method4851();
		this.aBoolean7950 = false;
	}

	public byte[] ah() {
		return this.aByteArray7963;
	}

	public void oa(int i, int i_160_, int i_161_) {
		for (int i_162_ = 0; i_162_ < this.anInt7900; i_162_++) {
			if (i != 128)
				this.anIntArray7901[i_162_] = this.anIntArray7901[i_162_] * i >> 7;
			if (i_160_ != 128)
				this.anIntArray7895[i_162_] = (this.anIntArray7895[i_162_] * i_160_ >> 7);
			if (i_161_ != 128)
				this.anIntArray7965[i_162_] = (this.anIntArray7965[i_162_] * i_161_ >> 7);
		}
		method4851();
		this.aBoolean7950 = false;
	}

    public void pa(int i, int i_167_, FloorToolkit class_xa, FloorToolkit class_xa_168_, int i_169_, int i_170_, int i_171_) {
		if (!this.aBoolean7950)
			method4832();
		int i_172_ = i_169_ + this.anInt7940;
		int i_173_ = i_169_ + this.anInt7941;
		int i_174_ = i_171_ + this.anInt7942;
		int i_175_ = i_171_ + this.anInt7943;
		if (i != 1 && i != 2 && i != 3 && i != 5 || (i_172_ >= 0 && ((i_173_ + class_xa.anInt6288 * -1212653763 >> class_xa.anInt6289 * -2137349879) < class_xa.anInt6287 * -506105871) && i_174_ >= 0 && ((i_175_ + class_xa.anInt6288 * -1212653763 >> class_xa.anInt6289 * -2137349879) < class_xa.anInt6286 * -1148794921))) {
			if (i == 4 || i == 5) {
				if (class_xa_168_ == null || (i_172_ < 0 || ((i_173_ + class_xa_168_.anInt6288 * -1212653763 >> class_xa_168_.anInt6289 * -2137349879) >= class_xa_168_.anInt6287 * -506105871) || i_174_ < 0 || ((i_175_ + class_xa_168_.anInt6288 * -1212653763 >> class_xa_168_.anInt6289 * -2137349879) >= class_xa_168_.anInt6286 * -1148794921)))
					return;
			} else {
				i_172_ >>= class_xa.anInt6289 * -2137349879;
				i_173_ = (i_173_ + (class_xa.anInt6288 * -1212653763 - 1) >> class_xa.anInt6289 * -2137349879);
				i_174_ >>= class_xa.anInt6289 * -2137349879;
				i_175_ = (i_175_ + (class_xa.anInt6288 * -1212653763 - 1) >> class_xa.anInt6289 * -2137349879);
				if (class_xa.method6341(i_172_, i_174_) == i_170_ && (class_xa.method6341(i_173_, i_174_) == i_170_) && (class_xa.method6341(i_172_, i_175_) == i_170_) && (class_xa.method6341(i_173_, i_175_) == i_170_))
					return;
			}
			if (i == 1) {
				for (int i_176_ = 0; i_176_ < this.anInt7900; i_176_++)
					this.anIntArray7895[i_176_] = (this.anIntArray7895[i_176_] + class_xa.method6340(((this.anIntArray7901[i_176_]) + i_169_), ((this.anIntArray7965[i_176_]) + i_171_)) - i_170_);
			} else if (i == 2) {
				int i_177_ = this.anInt7938;
				if (i_177_ == 0)
					return;
				for (int i_178_ = 0; i_178_ < this.anInt7900; i_178_++) {
					int i_179_ = (this.anIntArray7895[i_178_] << 16) / i_177_;
					if (i_179_ < i_167_)
						this.anIntArray7895[i_178_] = (this.anIntArray7895[i_178_] + (class_xa.method6340((this.anIntArray7901[i_178_]) + i_169_, (this.anIntArray7965[i_178_]) + i_171_) - i_170_) * (i_167_ - i_179_) / i_167_);
				}
			} else if (i == 3) {
				int i_180_ = (i_167_ & 0xff) * 4;
				int i_181_ = (i_167_ >> 8 & 0xff) * 4;
				int i_182_ = (i_167_ >> 16 & 0xff) << 6;
				int i_183_ = (i_167_ >> 24 & 0xff) << 6;
				if (i_169_ - (i_180_ >> 1) < 0 || ((i_169_ + (i_180_ >> 1) + class_xa.anInt6288 * -1212653763) >= (class_xa.anInt6287 * -506105871 << class_xa.anInt6289 * -2137349879)) || i_171_ - (i_181_ >> 1) < 0 || ((i_171_ + (i_181_ >> 1) + class_xa.anInt6288 * -1212653763) >= (class_xa.anInt6286 * -1148794921 << class_xa.anInt6289 * -2137349879)))
					return;
				method4732(class_xa, i_169_, i_170_, i_171_, i_180_, i_181_, i_182_, i_183_);
			} else if (i == 4) {
				int i_184_ = (this.anInt7939 - this.anInt7938);
				for (int i_185_ = 0; i_185_ < this.anInt7900; i_185_++)
					this.anIntArray7895[i_185_] = (this.anIntArray7895[i_185_] + (class_xa_168_.method6340((this.anIntArray7901[i_185_]) + i_169_, (this.anIntArray7965[i_185_]) + i_171_) - i_170_) + i_184_);
			} else if (i == 5) {
				int i_186_ = (this.anInt7939 - this.anInt7938);
				for (int i_187_ = 0; i_187_ < this.anInt7900; i_187_++) {
					int i_188_ = (this.anIntArray7901[i_187_] + i_169_);
					int i_189_ = (this.anIntArray7965[i_187_] + i_171_);
					int i_190_ = class_xa.method6340(i_188_, i_189_);
					int i_191_ = class_xa_168_.method6340(i_188_, i_189_);
					int i_192_ = i_190_ - i_191_ - i_167_;
					this.anIntArray7895[i_187_] = ((this.anIntArray7895[i_187_] << 8) / i_186_ * i_192_ >> 8) - (i_170_ - i_190_);
				}
			}
			method4851();
			this.aBoolean7950 = false;
		}
	}

	void method4840() {
		if (this.aClass167_7926 != null)
			this.aClass167_7926.aBoolean1710 = false;
	}

	JavaGraphicsModelTookit(NativeToolkit class_ra_sub3, int i, int i_193_, boolean bool, boolean bool_194_) {
		this.aBoolean7893 = false;
		this.aBoolean7903 = false;
		this.aBoolean7950 = false;
		this.nativeToolkit = class_ra_sub3;
		this.anInt7912 = i;
		this.anInt7896 = i_193_;
		this.aBoolean7931 = bool_194_;
		if (bool || Class154.method1671(this.anInt7912, this.anInt7896))
			this.aClass186_7927 = new Class186(Class154.method1685((this.anInt7912), (this.anInt7896)));
		if (bool || Class154.method1683(this.anInt7912, this.anInt7896))
			this.aClass186_7930 = new Class186(Class154.method1692((this.anInt7912), (this.anInt7896)));
		if (bool || Class154.method1667(this.anInt7912, this.anInt7896))
			this.aClass186_7911 = new Class186(Class154.method1680((this.anInt7912), (this.anInt7896)));
		if (bool || Class154.method1690(this.anInt7912, this.anInt7896))
			this.aClass186_7934 = new Class186(Class154.method1669((this.anInt7912), (this.anInt7896)));
		if (bool || Class154.method1668(this.anInt7912, this.anInt7896))
			this.aClass167_7926 = new Class167(Class154.method1686((this.anInt7912), (this.anInt7896)));
		if (bool && bool_194_) {
			this.aClass186_7927.anInterface7_Impl1_1903 = this.aClass186_7927.anInterface7_Impl1_1902 = this.nativeToolkit.method5382(this.aBoolean7931);
			this.aClass186_7930.anInterface7_Impl1_1903 = this.aClass186_7930.anInterface7_Impl1_1902 = this.nativeToolkit.method5382(this.aBoolean7931);
			this.aClass186_7911.anInterface7_Impl1_1903 = this.aClass186_7911.anInterface7_Impl1_1902 = this.nativeToolkit.method5382(this.aBoolean7931);
			this.aClass186_7934.anInterface7_Impl1_1903 = this.aClass186_7934.anInterface7_Impl1_1902 = this.nativeToolkit.method5382(this.aBoolean7931);
		}
	}

	public int YA() {
		if (!this.aBoolean7950)
			method4832();
		return this.anInt7938;
	}

    public int AA() {
		if (!this.aBoolean7950)
			method4832();
		return this.anInt7942;
	}

    public void method4745(ModelToolkit modelToolkit, int i, int i_240_, int i_241_, boolean bool) {
		JavaGraphicsModelTookit javaGraphicsModelTookit_242_ = (JavaGraphicsModelTookit) modelToolkit;
		if (this.anInt7916 != 0 && javaGraphicsModelTookit_242_.anInt7916 != 0) {
			int i_243_ = javaGraphicsModelTookit_242_.anInt7900;
			int[] is = javaGraphicsModelTookit_242_.anIntArray7901;
			int[] is_244_ = javaGraphicsModelTookit_242_.anIntArray7895;
			int[] is_245_ = javaGraphicsModelTookit_242_.anIntArray7965;
			short[] is_246_ = javaGraphicsModelTookit_242_.aShortArray7909;
			short[] is_247_ = javaGraphicsModelTookit_242_.aShortArray7910;
			short[] is_248_ = javaGraphicsModelTookit_242_.aShortArray7919;
			byte[] is_249_ = javaGraphicsModelTookit_242_.aByteArray7958;
			short[] is_250_;
			short[] is_251_;
			short[] is_252_;
			byte[] is_253_;
			if (this.aClass185_7915 != null) {
				is_250_ = (this.aClass185_7915.aShortArray1899);
				is_251_ = (this.aClass185_7915.aShortArray1897);
				is_252_ = (this.aClass185_7915.aShortArray1896);
				is_253_ = (this.aClass185_7915.aByteArray1898);
			} else {
				is_250_ = null;
				is_251_ = null;
				is_252_ = null;
				is_253_ = null;
			}
			short[] is_254_;
			short[] is_255_;
			short[] is_256_;
			byte[] is_257_;
			if (javaGraphicsModelTookit_242_.aClass185_7915 != null) {
				is_254_ = javaGraphicsModelTookit_242_.aClass185_7915.aShortArray1899;
				is_255_ = javaGraphicsModelTookit_242_.aClass185_7915.aShortArray1897;
				is_256_ = javaGraphicsModelTookit_242_.aClass185_7915.aShortArray1896;
				is_257_ = javaGraphicsModelTookit_242_.aClass185_7915.aByteArray1898;
			} else {
				is_254_ = null;
				is_255_ = null;
				is_256_ = null;
				is_257_ = null;
			}
			int[] is_258_ = javaGraphicsModelTookit_242_.anIntArray7947;
			short[] is_259_ = javaGraphicsModelTookit_242_.aShortArray7948;
			if (!javaGraphicsModelTookit_242_.aBoolean7950)
				javaGraphicsModelTookit_242_.method4832();
			int i_260_ = javaGraphicsModelTookit_242_.anInt7938;
			int i_261_ = javaGraphicsModelTookit_242_.anInt7939;
			int i_262_ = javaGraphicsModelTookit_242_.anInt7940;
			int i_263_ = javaGraphicsModelTookit_242_.anInt7941;
			int i_264_ = javaGraphicsModelTookit_242_.anInt7942;
			int i_265_ = javaGraphicsModelTookit_242_.anInt7943;
			for (int i_266_ = 0; i_266_ < this.anInt7900; i_266_++) {
				int i_267_ = this.anIntArray7895[i_266_] - i_240_;
				if (i_267_ >= i_260_ && i_267_ <= i_261_) {
					int i_268_ = this.anIntArray7901[i_266_] - i;
					if (i_268_ >= i_262_ && i_268_ <= i_263_) {
						int i_269_ = (this.anIntArray7965[i_266_] - i_241_);
						if (i_269_ >= i_264_ && i_269_ <= i_265_) {
							int i_270_ = -1;
							int i_271_ = (this.anIntArray7947[i_266_]);
							int i_272_ = (this.anIntArray7947[i_266_ + 1]);
							for (int i_273_ = i_271_; i_273_ < i_272_; i_273_++) {
								i_270_ = (this.aShortArray7948[i_273_]) - 1;
								if (i_270_ == -1 || (this.aByteArray7958[i_270_]) != 0)
									break;
							}
							if (i_270_ != -1) {
								for (int i_274_ = 0; i_274_ < i_243_; i_274_++) {
									if (i_268_ == is[i_274_] && i_269_ == is_245_[i_274_] && i_267_ == is_244_[i_274_]) {
										int i_275_ = -1;
										i_271_ = is_258_[i_274_];
										i_272_ = is_258_[i_274_ + 1];
										for (int i_276_ = i_271_; i_276_ < i_272_; i_276_++) {
											i_275_ = is_259_[i_276_] - 1;
											if (i_275_ == -1 || is_249_[i_275_] != 0)
												break;
										}
										if (i_275_ != -1) {
											if (is_250_ == null) {
												this.aClass185_7915 = new Class185();
												is_250_ = this.aClass185_7915.aShortArray1899 = (Class378.method4670((this.aShortArray7909), (byte) -55));
												is_251_ = this.aClass185_7915.aShortArray1897 = (Class378.method4670((this.aShortArray7910), (byte) -99));
												is_252_ = this.aClass185_7915.aShortArray1896 = (Class378.method4670((this.aShortArray7919), (byte) -32));
												is_253_ = this.aClass185_7915.aByteArray1898 = (StaticMethods.method4978((this.aByteArray7958), 1194497584));
											}
											if (is_254_ == null) {
												Class185 class185 = (javaGraphicsModelTookit_242_.aClass185_7915 = new Class185());
												is_254_ = class185.aShortArray1899 = (Class378.method4670(is_246_, (byte) -56));
												is_255_ = class185.aShortArray1897 = (Class378.method4670(is_247_, (byte) -81));
												is_256_ = class185.aShortArray1896 = (Class378.method4670(is_248_, (byte) -45));
												is_257_ = class185.aByteArray1898 = (StaticMethods.method4978(is_249_, 1194497584));
											}
											short i_277_ = (this.aShortArray7909[i_270_]);
											short i_278_ = (this.aShortArray7910[i_270_]);
											short i_279_ = (this.aShortArray7919[i_270_]);
											byte i_280_ = (this.aByteArray7958[i_270_]);
											i_271_ = is_258_[i_274_];
											i_272_ = is_258_[i_274_ + 1];
											for (int i_281_ = i_271_; i_281_ < i_272_; i_281_++) {
												int i_282_ = is_259_[i_281_] - 1;
												if (i_282_ == -1)
													break;
												if (is_257_[i_282_] != 0) {
													is_254_[i_282_] += i_277_;
													is_255_[i_282_] += i_278_;
													is_256_[i_282_] += i_279_;
													is_257_[i_282_] += i_280_;
												}
											}
											i_277_ = is_246_[i_275_];
											i_278_ = is_247_[i_275_];
											i_279_ = is_248_[i_275_];
											i_280_ = is_249_[i_275_];
											i_271_ = (this.anIntArray7947[i_266_]);
											i_272_ = (this.anIntArray7947[i_266_ + 1]);
											for (int i_283_ = i_271_; i_283_ < i_272_; i_283_++) {
												int i_284_ = ((this.aShortArray7948[i_283_]) - 1);
												if (i_284_ == -1)
													break;
												if (is_253_[i_284_] != 0) {
													is_250_[i_284_] += i_277_;
													is_251_[i_284_] += i_278_;
													is_252_[i_284_] += i_279_;
													is_253_[i_284_] += i_280_;
												}
											}
											javaGraphicsModelTookit_242_.method4839();
											method4839();
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

	void e(int transformationType, int[] is, int i_285_, int i_286_, int i_287_, boolean bool, int i_288_, int[] is_289_) {
		int i_290_ = is.length;
		if (transformationType == AnimationFrameBase.UNKNOWN0) {
			i_285_ <<= 4;
			i_286_ <<= 4;
			i_287_ <<= 4;
			int i_291_ = 0;
			anInt7902 = 0;
			anInt7937 = 0;
			anInt7956 = 0;
			for (int i_292_ = 0; i_292_ < i_290_; i_292_++) {
				int i_293_ = is[i_292_];
				if (i_293_ < this.anIntArrayArray7918.length) {
					int[] is_294_ = this.anIntArrayArray7918[i_293_];
					for (int i_295_ = 0; i_295_ < is_294_.length; i_295_++) {
						int i_296_ = is_294_[i_295_];
						if (this.aShortArray7964 == null || (i_288_ & (this.aShortArray7964[i_296_])) != 0) {
							anInt7902 += (this.anIntArray7901[i_296_]);
							anInt7937 += (this.anIntArray7895[i_296_]);
							anInt7956 += (this.anIntArray7965[i_296_]);
							i_291_++;
						}
					}
				}
			}
			if (i_291_ > 0) {
				anInt7902 = anInt7902 / i_291_ + i_285_;
				anInt7937 = anInt7937 / i_291_ + i_286_;
				anInt7956 = anInt7956 / i_291_ + i_287_;
				aBoolean7905 = true;
			} else {
				anInt7902 = i_285_;
				anInt7937 = i_286_;
				anInt7956 = i_287_;
			}
		} else if (transformationType == AnimationFrameBase.UNKNOWN1) {
			if (is_289_ != null) {
				int i_297_ = ((is_289_[0] * i_285_ + is_289_[1] * i_286_ + is_289_[2] * i_287_ + 8192) >> 14);
				int i_298_ = ((is_289_[3] * i_285_ + is_289_[4] * i_286_ + is_289_[5] * i_287_ + 8192) >> 14);
				int i_299_ = ((is_289_[6] * i_285_ + is_289_[7] * i_286_ + is_289_[8] * i_287_ + 8192) >> 14);
				i_285_ = i_297_;
				i_286_ = i_298_;
				i_287_ = i_299_;
			}
			i_285_ <<= 4;
			i_286_ <<= 4;
			i_287_ <<= 4;
			for (int i_300_ = 0; i_300_ < i_290_; i_300_++) {
				int i_301_ = is[i_300_];
				if (i_301_ < this.anIntArrayArray7918.length) {
					int[] is_302_ = this.anIntArrayArray7918[i_301_];
					for (int i_303_ = 0; i_303_ < is_302_.length; i_303_++) {
						int i_304_ = is_302_[i_303_];
						if (this.aShortArray7964 == null || (i_288_ & (this.aShortArray7964[i_304_])) != 0) {
							this.anIntArray7901[i_304_] += i_285_;
							this.anIntArray7895[i_304_] += i_286_;
							this.anIntArray7965[i_304_] += i_287_;
						}
					}
				}
			}
		} else if (transformationType == AnimationFrameBase.UNKNOWN2) {
			if (is_289_ != null) {
				int i_305_ = is_289_[9] << 4;
				int i_306_ = is_289_[10] << 4;
				int i_307_ = is_289_[11] << 4;
				int i_308_ = is_289_[12] << 4;
				int i_309_ = is_289_[13] << 4;
				int i_310_ = is_289_[14] << 4;
				if (aBoolean7905) {
					int i_311_ = ((is_289_[0] * anInt7902 + is_289_[3] * anInt7937 + is_289_[6] * anInt7956 + 8192) >> 14);
					int i_312_ = ((is_289_[1] * anInt7902 + is_289_[4] * anInt7937 + is_289_[7] * anInt7956 + 8192) >> 14);
					int i_313_ = ((is_289_[2] * anInt7902 + is_289_[5] * anInt7937 + is_289_[8] * anInt7956 + 8192) >> 14);
					i_311_ += i_308_;
					i_312_ += i_309_;
					i_313_ += i_310_;
					anInt7902 = i_311_;
					anInt7937 = i_312_;
					anInt7956 = i_313_;
					aBoolean7905 = false;
				}
				int[] is_314_ = new int[9];
				int i_315_ = CircleAngleTable.COSINE[i_285_];
				int i_316_ = CircleAngleTable.SINE[i_285_];
				int i_317_ = CircleAngleTable.COSINE[i_286_];
				int i_318_ = CircleAngleTable.SINE[i_286_];
				int i_319_ = CircleAngleTable.COSINE[i_287_];
				int i_320_ = CircleAngleTable.SINE[i_287_];
				int i_321_ = i_316_ * i_319_ + 8192 >> 14;
				int i_322_ = i_316_ * i_320_ + 8192 >> 14;
				is_314_[0] = i_317_ * i_319_ + i_318_ * i_322_ + 8192 >> 14;
				is_314_[1] = -i_317_ * i_320_ + i_318_ * i_321_ + 8192 >> 14;
				is_314_[2] = i_318_ * i_315_ + 8192 >> 14;
				is_314_[3] = i_315_ * i_320_ + 8192 >> 14;
				is_314_[4] = i_315_ * i_319_ + 8192 >> 14;
				is_314_[5] = -i_316_;
				is_314_[6] = -i_318_ * i_319_ + i_317_ * i_322_ + 8192 >> 14;
				is_314_[7] = i_318_ * i_320_ + i_317_ * i_321_ + 8192 >> 14;
				is_314_[8] = i_317_ * i_315_ + 8192 >> 14;
				int i_323_ = (is_314_[0] * -anInt7902 + is_314_[1] * -anInt7937 + is_314_[2] * -anInt7956 + 8192) >> 14;
				int i_324_ = (is_314_[3] * -anInt7902 + is_314_[4] * -anInt7937 + is_314_[5] * -anInt7956 + 8192) >> 14;
				int i_325_ = (is_314_[6] * -anInt7902 + is_314_[7] * -anInt7937 + is_314_[8] * -anInt7956 + 8192) >> 14;
				int i_326_ = i_323_ + anInt7902;
				int i_327_ = i_324_ + anInt7937;
				int i_328_ = i_325_ + anInt7956;
				int[] is_329_ = new int[9];
				for (int i_330_ = 0; i_330_ < 3; i_330_++) {
					for (int i_331_ = 0; i_331_ < 3; i_331_++) {
						int i_332_ = 0;
						for (int i_333_ = 0; i_333_ < 3; i_333_++)
							i_332_ += (is_314_[i_330_ * 3 + i_333_] * is_289_[i_331_ * 3 + i_333_]);
						is_329_[i_330_ * 3 + i_331_] = i_332_ + 8192 >> 14;
					}
				}
				int i_334_ = ((is_314_[0] * i_308_ + is_314_[1] * i_309_ + is_314_[2] * i_310_ + 8192) >> 14);
				int i_335_ = ((is_314_[3] * i_308_ + is_314_[4] * i_309_ + is_314_[5] * i_310_ + 8192) >> 14);
				int i_336_ = ((is_314_[6] * i_308_ + is_314_[7] * i_309_ + is_314_[8] * i_310_ + 8192) >> 14);
				i_334_ += i_326_;
				i_335_ += i_327_;
				i_336_ += i_328_;
				int[] is_337_ = new int[9];
				for (int i_338_ = 0; i_338_ < 3; i_338_++) {
					for (int i_339_ = 0; i_339_ < 3; i_339_++) {
						int i_340_ = 0;
						for (int i_341_ = 0; i_341_ < 3; i_341_++)
							i_340_ += (is_289_[i_338_ * 3 + i_341_] * is_329_[i_339_ + i_341_ * 3]);
						is_337_[i_338_ * 3 + i_339_] = i_340_ + 8192 >> 14;
					}
				}
				int i_342_ = ((is_289_[0] * i_334_ + is_289_[1] * i_335_ + is_289_[2] * i_336_ + 8192) >> 14);
				int i_343_ = ((is_289_[3] * i_334_ + is_289_[4] * i_335_ + is_289_[5] * i_336_ + 8192) >> 14);
				int i_344_ = ((is_289_[6] * i_334_ + is_289_[7] * i_335_ + is_289_[8] * i_336_ + 8192) >> 14);
				i_342_ += i_305_;
				i_343_ += i_306_;
				i_344_ += i_307_;
				for (int i_345_ = 0; i_345_ < i_290_; i_345_++) {
					int i_346_ = is[i_345_];
					if (i_346_ < this.anIntArrayArray7918.length) {
						int[] is_347_ = (this.anIntArrayArray7918[i_346_]);
						for (int i_348_ = 0; i_348_ < is_347_.length; i_348_++) {
							int i_349_ = is_347_[i_348_];
							if (this.aShortArray7964 == null || ((i_288_ & (this.aShortArray7964[i_349_])) != 0)) {
								int i_350_ = (is_337_[0] * (this.anIntArray7901[i_349_]) + is_337_[1] * (this.anIntArray7895[i_349_]) + is_337_[2] * (this.anIntArray7965[i_349_]) + 8192) >> 14;
								int i_351_ = (is_337_[3] * (this.anIntArray7901[i_349_]) + is_337_[4] * (this.anIntArray7895[i_349_]) + is_337_[5] * (this.anIntArray7965[i_349_]) + 8192) >> 14;
								int i_352_ = (is_337_[6] * (this.anIntArray7901[i_349_]) + is_337_[7] * (this.anIntArray7895[i_349_]) + is_337_[8] * (this.anIntArray7965[i_349_]) + 8192) >> 14;
								i_350_ += i_342_;
								i_351_ += i_343_;
								i_352_ += i_344_;
								this.anIntArray7901[i_349_] = i_350_;
								this.anIntArray7895[i_349_] = i_351_;
								this.anIntArray7965[i_349_] = i_352_;
							}
						}
					}
				}
			} else {
				for (int i_353_ = 0; i_353_ < i_290_; i_353_++) {
					int i_354_ = is[i_353_];
					if (i_354_ < this.anIntArrayArray7918.length) {
						int[] is_355_ = (this.anIntArrayArray7918[i_354_]);
						for (int i_356_ = 0; i_356_ < is_355_.length; i_356_++) {
							int i_357_ = is_355_[i_356_];
							if (this.aShortArray7964 == null || ((i_288_ & (this.aShortArray7964[i_357_])) != 0)) {
								this.anIntArray7901[i_357_] -= anInt7902;
								this.anIntArray7895[i_357_] -= anInt7937;
								this.anIntArray7965[i_357_] -= anInt7956;
								if (i_287_ != 0) {
									int i_358_ = CircleAngleTable.SINE[i_287_];
									int i_359_ = CircleAngleTable.COSINE[i_287_];
									int i_360_ = ((this.anIntArray7895[i_357_]) * i_358_ + (this.anIntArray7901[i_357_]) * i_359_ + 16383) >> 14;
									this.anIntArray7895[i_357_] = ((this.anIntArray7895[i_357_]) * i_359_ - (this.anIntArray7901[i_357_]) * i_358_ + 16383) >> 14;
									this.anIntArray7901[i_357_] = i_360_;
								}
								if (i_285_ != 0) {
									int i_361_ = CircleAngleTable.SINE[i_285_];
									int i_362_ = CircleAngleTable.COSINE[i_285_];
									int i_363_ = ((this.anIntArray7895[i_357_]) * i_362_ - (this.anIntArray7965[i_357_]) * i_361_ + 16383) >> 14;
									this.anIntArray7965[i_357_] = ((this.anIntArray7895[i_357_]) * i_361_ + (this.anIntArray7965[i_357_]) * i_362_ + 16383) >> 14;
									this.anIntArray7895[i_357_] = i_363_;
								}
								if (i_286_ != 0) {
									int i_364_ = CircleAngleTable.SINE[i_286_];
									int i_365_ = CircleAngleTable.COSINE[i_286_];
									int i_366_ = ((this.anIntArray7965[i_357_]) * i_364_ + (this.anIntArray7901[i_357_]) * i_365_ + 16383) >> 14;
									this.anIntArray7965[i_357_] = ((this.anIntArray7965[i_357_]) * i_365_ - (this.anIntArray7901[i_357_]) * i_364_ + 16383) >> 14;
									this.anIntArray7901[i_357_] = i_366_;
								}
								this.anIntArray7901[i_357_] += anInt7902;
								this.anIntArray7895[i_357_] += anInt7937;
								this.anIntArray7965[i_357_] += anInt7956;
							}
						}
					}
				}
				if (bool) {
					for (int i_367_ = 0; i_367_ < i_290_; i_367_++) {
						int i_368_ = is[i_367_];
						if (i_368_ < (this.anIntArrayArray7918).length) {
							int[] is_369_ = (this.anIntArrayArray7918[i_368_]);
							for (int i_370_ = 0; i_370_ < is_369_.length; i_370_++) {
								int i_371_ = is_369_[i_370_];
								if ((this.aShortArray7964 == null) || ((i_288_ & (this.aShortArray7964[i_371_])) != 0)) {
									int i_372_ = (this.anIntArray7947[i_371_]);
									int i_373_ = (this.anIntArray7947[i_371_ + 1]);
									for (int i_374_ = i_372_; i_374_ < i_373_; i_374_++) {
										int i_375_ = ((this.aShortArray7948[i_374_]) - 1);
										if (i_375_ == -1)
											break;
										if (i_287_ != 0) {
											int i_376_ = (CircleAngleTable.SINE[i_287_]);
											int i_377_ = (CircleAngleTable.COSINE[i_287_]);
											int i_378_ = ((((this.aShortArray7910[i_375_]) * i_376_) + (this.aShortArray7909[i_375_]) * i_377_ + 16383) >> 14);
											this.aShortArray7910[i_375_] = (short) (((this.aShortArray7910[i_375_]) * i_377_ - (this.aShortArray7909[i_375_]) * i_376_ + 16383) >> 14);
											this.aShortArray7909[i_375_] = (short) i_378_;
										}
										if (i_285_ != 0) {
											int i_379_ = (CircleAngleTable.SINE[i_285_]);
											int i_380_ = (CircleAngleTable.COSINE[i_285_]);
											int i_381_ = ((((this.aShortArray7910[i_375_]) * i_380_) - (this.aShortArray7919[i_375_]) * i_379_ + 16383) >> 14);
											this.aShortArray7919[i_375_] = (short) (((this.aShortArray7910[i_375_]) * i_379_ + (this.aShortArray7919[i_375_]) * i_380_ + 16383) >> 14);
											this.aShortArray7910[i_375_] = (short) i_381_;
										}
										if (i_286_ != 0) {
											int i_382_ = (CircleAngleTable.SINE[i_286_]);
											int i_383_ = (CircleAngleTable.COSINE[i_286_]);
											int i_384_ = ((((this.aShortArray7919[i_375_]) * i_382_) + (this.aShortArray7909[i_375_]) * i_383_ + 16383) >> 14);
											this.aShortArray7919[i_375_] = (short) (((this.aShortArray7919[i_375_]) * i_383_ - (this.aShortArray7909[i_375_]) * i_382_ + 16383) >> 14);
											this.aShortArray7909[i_375_] = (short) i_384_;
										}
									}
								}
							}
						}
					}
					method4839();
				}
			}
		} else if (transformationType == AnimationFrameBase.UNKNOWN3) {
			if (is_289_ != null) {
				int i_385_ = is_289_[9] << 4;
				int i_386_ = is_289_[10] << 4;
				int i_387_ = is_289_[11] << 4;
				int i_388_ = is_289_[12] << 4;
				int i_389_ = is_289_[13] << 4;
				int i_390_ = is_289_[14] << 4;
				if (aBoolean7905) {
					int i_391_ = ((is_289_[0] * anInt7902 + is_289_[3] * anInt7937 + is_289_[6] * anInt7956 + 8192) >> 14);
					int i_392_ = ((is_289_[1] * anInt7902 + is_289_[4] * anInt7937 + is_289_[7] * anInt7956 + 8192) >> 14);
					int i_393_ = ((is_289_[2] * anInt7902 + is_289_[5] * anInt7937 + is_289_[8] * anInt7956 + 8192) >> 14);
					i_391_ += i_388_;
					i_392_ += i_389_;
					i_393_ += i_390_;
					anInt7902 = i_391_;
					anInt7937 = i_392_;
					anInt7956 = i_393_;
					aBoolean7905 = false;
				}
				int i_394_ = i_285_ << 15 >> 7;
				int i_395_ = i_286_ << 15 >> 7;
				int i_396_ = i_287_ << 15 >> 7;
				int i_397_ = i_394_ * -anInt7902 + 8192 >> 14;
				int i_398_ = i_395_ * -anInt7937 + 8192 >> 14;
				int i_399_ = i_396_ * -anInt7956 + 8192 >> 14;
				int i_400_ = i_397_ + anInt7902;
				int i_401_ = i_398_ + anInt7937;
				int i_402_ = i_399_ + anInt7956;
				int[] is_403_ = new int[9];
				is_403_[0] = i_394_ * is_289_[0] + 8192 >> 14;
				is_403_[1] = i_394_ * is_289_[3] + 8192 >> 14;
				is_403_[2] = i_394_ * is_289_[6] + 8192 >> 14;
				is_403_[3] = i_395_ * is_289_[1] + 8192 >> 14;
				is_403_[4] = i_395_ * is_289_[4] + 8192 >> 14;
				is_403_[5] = i_395_ * is_289_[7] + 8192 >> 14;
				is_403_[6] = i_396_ * is_289_[2] + 8192 >> 14;
				is_403_[7] = i_396_ * is_289_[5] + 8192 >> 14;
				is_403_[8] = i_396_ * is_289_[8] + 8192 >> 14;
				int i_404_ = i_394_ * i_388_ + 8192 >> 14;
				int i_405_ = i_395_ * i_389_ + 8192 >> 14;
				int i_406_ = i_396_ * i_390_ + 8192 >> 14;
				i_404_ += i_400_;
				i_405_ += i_401_;
				i_406_ += i_402_;
				int[] is_407_ = new int[9];
				for (int i_408_ = 0; i_408_ < 3; i_408_++) {
					for (int i_409_ = 0; i_409_ < 3; i_409_++) {
						int i_410_ = 0;
						for (int i_411_ = 0; i_411_ < 3; i_411_++)
							i_410_ += (is_289_[i_408_ * 3 + i_411_] * is_403_[i_409_ + i_411_ * 3]);
						is_407_[i_408_ * 3 + i_409_] = i_410_ + 8192 >> 14;
					}
				}
				int i_412_ = ((is_289_[0] * i_404_ + is_289_[1] * i_405_ + is_289_[2] * i_406_ + 8192) >> 14);
				int i_413_ = ((is_289_[3] * i_404_ + is_289_[4] * i_405_ + is_289_[5] * i_406_ + 8192) >> 14);
				int i_414_ = ((is_289_[6] * i_404_ + is_289_[7] * i_405_ + is_289_[8] * i_406_ + 8192) >> 14);
				i_412_ += i_385_;
				i_413_ += i_386_;
				i_414_ += i_387_;
				for (int i_415_ = 0; i_415_ < i_290_; i_415_++) {
					int i_416_ = is[i_415_];
					if (i_416_ < this.anIntArrayArray7918.length) {
						int[] is_417_ = (this.anIntArrayArray7918[i_416_]);
						for (int i_418_ = 0; i_418_ < is_417_.length; i_418_++) {
							int i_419_ = is_417_[i_418_];
							if (this.aShortArray7964 == null || ((i_288_ & (this.aShortArray7964[i_419_])) != 0)) {
								int i_420_ = (is_407_[0] * (this.anIntArray7901[i_419_]) + is_407_[1] * (this.anIntArray7895[i_419_]) + is_407_[2] * (this.anIntArray7965[i_419_]) + 8192) >> 14;
								int i_421_ = (is_407_[3] * (this.anIntArray7901[i_419_]) + is_407_[4] * (this.anIntArray7895[i_419_]) + is_407_[5] * (this.anIntArray7965[i_419_]) + 8192) >> 14;
								int i_422_ = (is_407_[6] * (this.anIntArray7901[i_419_]) + is_407_[7] * (this.anIntArray7895[i_419_]) + is_407_[8] * (this.anIntArray7965[i_419_]) + 8192) >> 14;
								i_420_ += i_412_;
								i_421_ += i_413_;
								i_422_ += i_414_;
								this.anIntArray7901[i_419_] = i_420_;
								this.anIntArray7895[i_419_] = i_421_;
								this.anIntArray7965[i_419_] = i_422_;
							}
						}
					}
				}
			} else {
				for (int i_423_ = 0; i_423_ < i_290_; i_423_++) {
					int i_424_ = is[i_423_];
					if (i_424_ < this.anIntArrayArray7918.length) {
						int[] is_425_ = (this.anIntArrayArray7918[i_424_]);
						for (int i_426_ = 0; i_426_ < is_425_.length; i_426_++) {
							int i_427_ = is_425_[i_426_];
							if (this.aShortArray7964 == null || ((i_288_ & (this.aShortArray7964[i_427_])) != 0)) {
								this.anIntArray7901[i_427_] -= anInt7902;
								this.anIntArray7895[i_427_] -= anInt7937;
								this.anIntArray7965[i_427_] -= anInt7956;
								this.anIntArray7901[i_427_] = (this.anIntArray7901[i_427_]) * i_285_ >> 7;
								this.anIntArray7895[i_427_] = (this.anIntArray7895[i_427_]) * i_286_ >> 7;
								this.anIntArray7965[i_427_] = (this.anIntArray7965[i_427_]) * i_287_ >> 7;
								this.anIntArray7901[i_427_] += anInt7902;
								this.anIntArray7895[i_427_] += anInt7937;
								this.anIntArray7965[i_427_] += anInt7956;
							}
						}
					}
				}
			}
		} else if (transformationType == AnimationFrameBase.UNKNOWN5) {
			if (this.anIntArrayArray7924 != null) {
				boolean bool_428_ = false;
				for (int i_429_ = 0; i_429_ < i_290_; i_429_++) {
					int i_430_ = is[i_429_];
					if (i_430_ < this.anIntArrayArray7924.length) {
						int[] is_431_ = (this.anIntArrayArray7924[i_430_]);
						for (int i_432_ = 0; i_432_ < is_431_.length; i_432_++) {
							int i_433_ = is_431_[i_432_];
							if (this.aShortArray7925 == null || ((i_288_ & (this.aShortArray7925[i_433_])) != 0)) {
								int i_434_ = (((this.aByteArray7963[i_433_]) & 0xff) + i_285_ * 8);
								if (i_434_ < 0)
									i_434_ = 0;
								else if (i_434_ > 255)
									i_434_ = 255;
								this.aByteArray7963[i_433_] = (byte) i_434_;
							}
						}
						bool_428_ = bool_428_ | is_431_.length > 0;
					}
				}
				if (bool_428_) {
					if (this.aClass191Array7952 != null) {
						for (int i_435_ = 0; i_435_ < this.anInt7951; i_435_++) {
							Class191 class191 = (this.aClass191Array7952[i_435_]);
							Class166 class166 = (this.aClass166Array7892[i_435_]);
							class166.anInt1703 = (class166.anInt1703 & 0xffffff | 255 - ((this.aByteArray7963[class191.anInt1947]) & 0xff) << 24);
						}
					}
					method4838();
				}
			}
		} else if (transformationType == AnimationFrameBase.UNKNOWN7) {
			if (this.anIntArrayArray7924 != null) {
				boolean bool_436_ = false;
				for (int i_437_ = 0; i_437_ < i_290_; i_437_++) {
					int i_438_ = is[i_437_];
					if (i_438_ < this.anIntArrayArray7924.length) {
						int[] is_439_ = (this.anIntArrayArray7924[i_438_]);
						for (int i_440_ = 0; i_440_ < is_439_.length; i_440_++) {
							int i_441_ = is_439_[i_440_];
							if (this.aShortArray7925 == null || ((i_288_ & (this.aShortArray7925[i_441_])) != 0)) {
								int i_442_ = ((this.aShortArray7935[i_441_]) & 0xffff);
								int i_443_ = i_442_ >> 10 & 0x3f;
								int i_444_ = i_442_ >> 7 & 0x7;
								int i_445_ = i_442_ & 0x7f;
								i_443_ = i_443_ + i_285_ & 0x3f;
								i_444_ += i_286_ / 4;
								if (i_444_ < 0)
									i_444_ = 0;
								else if (i_444_ > 7)
									i_444_ = 7;
								i_445_ += i_287_;
								if (i_445_ < 0)
									i_445_ = 0;
								else if (i_445_ > 127)
									i_445_ = 127;
								this.aShortArray7935[i_441_] = (short) (i_443_ << 10 | i_444_ << 7 | i_445_);
							}
						}
						bool_436_ = bool_436_ | is_439_.length > 0;
					}
				}
				if (bool_436_) {
					if (this.aClass191Array7952 != null) {
						for (int i_446_ = 0; i_446_ < this.anInt7951; i_446_++) {
							Class191 class191 = (this.aClass191Array7952[i_446_]);
							Class166 class166 = (this.aClass166Array7892[i_446_]);
							class166.anInt1703 = (class166.anInt1703 & ~0xffffff | (Class294.anIntArray3165[((this.aShortArray7935[class191.anInt1947]) & 0xffff)]) & 0xffffff);
						}
					}
					method4838();
				}
			}
		} else if (transformationType == AnimationFrameBase.UNKNOWN8) {
			if (this.anIntArrayArray7946 != null) {
				for (int i_447_ = 0; i_447_ < i_290_; i_447_++) {
					int i_448_ = is[i_447_];
					if (i_448_ < this.anIntArrayArray7946.length) {
						int[] is_449_ = (this.anIntArrayArray7946[i_448_]);
						for (int i_450_ = 0; i_450_ < is_449_.length; i_450_++) {
							Class166 class166 = (this.aClass166Array7892[is_449_[i_450_]]);
							class166.anInt1704 += i_285_;
							class166.anInt1705 += i_286_;
						}
					}
				}
			}
		} else if (transformationType == AnimationFrameBase.UNKNOWN10) {
			if (this.anIntArrayArray7946 != null) {
				for (int i_451_ = 0; i_451_ < i_290_; i_451_++) {
					int i_452_ = is[i_451_];
					if (i_452_ < this.anIntArrayArray7946.length) {
						int[] is_453_ = (this.anIntArrayArray7946[i_452_]);
						for (int i_454_ = 0; i_454_ < is_453_.length; i_454_++) {
							Class166 class166 = (this.aClass166Array7892[is_453_[i_454_]]);
							class166.anInt1702 = (class166.anInt1702 * i_285_ >> 7);
							class166.anInt1701 = (class166.anInt1701 * i_286_ >> 7);
						}
					}
				}
			}
		} else if (transformationType == AnimationFrameBase.UNKNOWN9) {
			if (this.anIntArrayArray7946 != null) {
				for (int i_455_ = 0; i_455_ < i_290_; i_455_++) {
					int i_456_ = is[i_455_];
					if (i_456_ < this.anIntArrayArray7946.length) {
						int[] is_457_ = (this.anIntArrayArray7946[i_456_]);
						for (int i_458_ = 0; i_458_ < is_457_.length; i_458_++) {
							Class166 class166 = (this.aClass166Array7892[is_457_[i_458_]]);
							class166.anInt1706 = (class166.anInt1706 + i_285_ & 0x3fff);
						}
					}
				}
			}
		}
	}

	public void Q(int i) {
		this.aShort7898 = (short) i;
		method4851();
		method4839();
	}

	public int c() {
		return this.aShort7897;
	}

	public int Z() {
		return this.aShort7898;
	}

    public void W(short i, short i_465_) {
		MaterialRawLoader interface_ma = this.nativeToolkit.textures;
		for (int i_466_ = 0; i_466_ < this.anInt7916; i_466_++) {
			if (this.aShortArray7923[i_466_] == i)
				this.aShortArray7923[i_466_] = i_465_;
		}
		byte i_467_ = 0;
		byte i_468_ = 0;
		if (i != -1) {
			Class53 class53 = interface_ma.method174(i & 0xffff);
			i_467_ = class53.aByte533;
			i_468_ = class53.aByte534;
		}
		byte i_469_ = 0;
		byte i_470_ = 0;
		if (i_465_ != -1) {
			Class53 class53 = interface_ma.method174(i_465_ & 0xffff);
			i_469_ = class53.aByte533;
			i_470_ = class53.aByte534;
			if (class53.aByte535 != 0 || class53.aByte509 != 0)
				this.aBoolean7903 = true;
		}
		if (i_467_ != i_469_ | i_468_ != i_470_) {
			if (this.aClass191Array7952 != null) {
				for (int i_471_ = 0; i_471_ < this.anInt7951; i_471_++) {
					Class191 class191 = this.aClass191Array7952[i_471_];
					Class166 class166 = this.aClass166Array7892[i_471_];
					class166.anInt1703 = (class166.anInt1703 & ~0xffffff | ((Class294.anIntArray3165[(this.aShortArray7935[class191.anInt1947]) & 0xffff]) & 0xffffff));
				}
			}
			method4838();
		}
	}

	public void PA(int i, int i_472_, int i_473_, int i_474_) {
		for (int i_475_ = 0; i_475_ < this.anInt7916; i_475_++) {
			int i_476_ = this.aShortArray7935[i_475_] & 0xffff;
			int i_477_ = i_476_ >> 10 & 0x3f;
			int i_478_ = i_476_ >> 7 & 0x7;
			int i_479_ = i_476_ & 0x7f;
			if (i != -1)
				i_477_ += (i - i_477_) * i_474_ >> 7;
			if (i_472_ != -1)
				i_478_ += (i_472_ - i_478_) * i_474_ >> 7;
			if (i_473_ != -1)
				i_479_ += (i_473_ - i_479_) * i_474_ >> 7;
			this.aShortArray7935[i_475_] = (short) (i_477_ << 10 | i_478_ << 7 | i_479_);
		}
		if (this.aClass191Array7952 != null) {
			for (int i_480_ = 0; i_480_ < this.anInt7951; i_480_++) {
				Class191 class191 = this.aClass191Array7952[i_480_];
				Class166 class166 = this.aClass166Array7892[i_480_];
				class166.anInt1703 = (class166.anInt1703 & ~0xffffff | ((Class294.anIntArray3165[(this.aShortArray7935[class191.anInt1947]) & 0xffff]) & 0xffffff));
			}
		}
		method4838();
	}

	public boolean method4743() {
		if (this.aShortArray7923 == null)
			return true;
		for (int i = 0; i < this.aShortArray7923.length; i++) {
			if (this.aShortArray7923[i] != -1 && !(this.nativeToolkit.textures.method170(this.aShortArray7923[i], (short) 10294)))
				return false;
		}
		return true;
	}

	public boolean i() {
		return this.aBoolean7893;
	}

	public boolean u() {
		return this.aBoolean7903;
	}

	static {
		anIntArray7933 = new int[1];
		anIntArray7929 = new int[1];
		anIntArray7959 = new int[8];
		anIntArray7960 = new int[8];
		anIntArray7961 = new int[8];
	}

	void method4734() {
		/* empty */
	}

    void animate(int transformType, int transformX, int transformY, int transformZ) {
		if (transformType == 0) {
			int i_488_ = 0;
			anInt7902 = 0;
			anInt7937 = 0;
			anInt7956 = 0;
			for (int i_489_ = 0; i_489_ < this.anInt7900; i_489_++) {
				anInt7902 += this.anIntArray7901[i_489_];
				anInt7937 += this.anIntArray7895[i_489_];
				anInt7956 += this.anIntArray7965[i_489_];
				i_488_++;
			}
			if (i_488_ > 0) {
				anInt7902 = anInt7902 / i_488_ + transformX;
				anInt7937 = anInt7937 / i_488_ + transformY;
				anInt7956 = anInt7956 / i_488_ + transformZ;
			} else {
				anInt7902 = transformX;
				anInt7937 = transformY;
				anInt7956 = transformZ;
			}
		} else if (transformType == 1) {
			for (int i_490_ = 0; i_490_ < this.anInt7900; i_490_++) {
				this.anIntArray7901[i_490_] += transformX;
				this.anIntArray7895[i_490_] += transformY;
				this.anIntArray7965[i_490_] += transformZ;
			}
		} else if (transformType == 2) {
			for (int i_491_ = 0; i_491_ < this.anInt7900; i_491_++) {
				this.anIntArray7901[i_491_] -= anInt7902;
				this.anIntArray7895[i_491_] -= anInt7937;
				this.anIntArray7965[i_491_] -= anInt7956;
				if (transformZ != 0) {
					int i_492_ = CircleAngleTable.SINE[transformZ];
					int i_493_ = CircleAngleTable.COSINE[transformZ];
					int i_494_ = (((this.anIntArray7895[i_491_] * i_492_) + (this.anIntArray7901[i_491_] * i_493_) + 16383) >> 14);
					this.anIntArray7895[i_491_] = ((this.anIntArray7895[i_491_] * i_493_) - (this.anIntArray7901[i_491_] * i_492_) + 16383) >> 14;
					this.anIntArray7901[i_491_] = i_494_;
				}
				if (transformX != 0) {
					int i_495_ = CircleAngleTable.SINE[transformX];
					int i_496_ = CircleAngleTable.COSINE[transformX];
					int i_497_ = (((this.anIntArray7895[i_491_] * i_496_) - (this.anIntArray7965[i_491_] * i_495_) + 16383) >> 14);
					this.anIntArray7965[i_491_] = ((this.anIntArray7895[i_491_] * i_495_) + (this.anIntArray7965[i_491_] * i_496_) + 16383) >> 14;
					this.anIntArray7895[i_491_] = i_497_;
				}
				if (transformY != 0) {
					int i_498_ = CircleAngleTable.SINE[transformY];
					int i_499_ = CircleAngleTable.COSINE[transformY];
					int i_500_ = (((this.anIntArray7965[i_491_] * i_498_) + (this.anIntArray7901[i_491_] * i_499_) + 16383) >> 14);
					this.anIntArray7965[i_491_] = ((this.anIntArray7965[i_491_] * i_499_) - (this.anIntArray7901[i_491_] * i_498_) + 16383) >> 14;
					this.anIntArray7901[i_491_] = i_500_;
				}
				this.anIntArray7901[i_491_] += anInt7902;
				this.anIntArray7895[i_491_] += anInt7937;
				this.anIntArray7965[i_491_] += anInt7956;
			}
		} else if (transformType == 3) {
			for (int i_501_ = 0; i_501_ < this.anInt7900; i_501_++) {
				this.anIntArray7901[i_501_] -= anInt7902;
				this.anIntArray7895[i_501_] -= anInt7937;
				this.anIntArray7965[i_501_] -= anInt7956;
				this.anIntArray7901[i_501_] = (this.anIntArray7901[i_501_] * transformX / 128);
				this.anIntArray7895[i_501_] = (this.anIntArray7895[i_501_] * transformY / 128);
				this.anIntArray7965[i_501_] = (this.anIntArray7965[i_501_] * transformZ / 128);
				this.anIntArray7901[i_501_] += anInt7902;
				this.anIntArray7895[i_501_] += anInt7937;
				this.anIntArray7965[i_501_] += anInt7956;
			}
		} else if (transformType == 5) {
			for (int i_502_ = 0; i_502_ < this.anInt7916; i_502_++) {
				int i_503_ = ((this.aByteArray7963[i_502_] & 0xff) + transformX * 8);
				if (i_503_ < 0)
					i_503_ = 0;
				else if (i_503_ > 255)
					i_503_ = 255;
				this.aByteArray7963[i_502_] = (byte) i_503_;
			}
			if (this.aClass191Array7952 != null) {
				for (int i_504_ = 0; i_504_ < this.anInt7951; i_504_++) {
					Class191 class191 = this.aClass191Array7952[i_504_];
					Class166 class166 = this.aClass166Array7892[i_504_];
					class166.anInt1703 = (class166.anInt1703 & 0xffffff | 255 - ((this.aByteArray7963[class191.anInt1947]) & 0xff) << 24);
				}
			}
			method4838();
		} else if (transformType == 7) {
			for (int i_505_ = 0; i_505_ < this.anInt7916; i_505_++) {
				int i_506_ = this.aShortArray7935[i_505_] & 0xffff;
				int i_507_ = i_506_ >> 10 & 0x3f;
				int i_508_ = i_506_ >> 7 & 0x7;
				int i_509_ = i_506_ & 0x7f;
				i_507_ = i_507_ + transformX & 0x3f;
				i_508_ += transformY / 4;
				if (i_508_ < 0)
					i_508_ = 0;
				else if (i_508_ > 7)
					i_508_ = 7;
				i_509_ += transformZ;
				if (i_509_ < 0)
					i_509_ = 0;
				else if (i_509_ > 127)
					i_509_ = 127;
				this.aShortArray7935[i_505_] = (short) (i_507_ << 10 | i_508_ << 7 | i_509_);
			}
			if (this.aClass191Array7952 != null) {
				for (int i_510_ = 0; i_510_ < this.anInt7951; i_510_++) {
					Class191 class191 = this.aClass191Array7952[i_510_];
					Class166 class166 = this.aClass166Array7892[i_510_];
					class166.anInt1703 = (class166.anInt1703 & ~0xffffff | ((Class294.anIntArray3165[(this.aShortArray7935[class191.anInt1947]) & 0xffff]) & 0xffffff));
				}
			}
			method4838();
		} else if (transformType == 8) {
			for (int i_511_ = 0; i_511_ < this.anInt7951; i_511_++) {
				Class166 class166 = this.aClass166Array7892[i_511_];
				class166.anInt1704 += transformX;
				class166.anInt1705 += transformY;
			}
		} else if (transformType == 10) {
			for (int i_512_ = 0; i_512_ < this.anInt7951; i_512_++) {
				Class166 class166 = this.aClass166Array7892[i_512_];
				class166.anInt1702 = class166.anInt1702 * transformX >> 7;
				class166.anInt1701 = class166.anInt1701 * transformY >> 7;
			}
		} else if (transformType == 9) {
			for (int i_513_ = 0; i_513_ < this.anInt7951; i_513_++) {
				Class166 class166 = this.aClass166Array7892[i_513_];
				class166.anInt1706 = class166.anInt1706 + transformX & 0x3fff;
			}
		}
	}

	void ka() {
		for (int i = 0; i < this.anInt7899; i++) {
			this.anIntArray7901[i] = this.anIntArray7901[i] + 7 >> 4;
			this.anIntArray7895[i] = this.anIntArray7895[i] + 7 >> 4;
			this.anIntArray7965[i] = this.anIntArray7965[i] + 7 >> 4;
		}
		method4851();
		this.aBoolean7950 = false;
	}

	public void method4741(Matrix43f class222, int i, boolean bool) {
		if (this.aShortArray7964 != null) {
			Matrix43f class222_514_ = class222;
			if (bool) {
				class222_514_ = this.nativeToolkit.aClass222_8235;
				class222_514_.method2074(class222);
			}
			float[] fs = new float[3];
			for (int i_515_ = 0; i_515_ < this.anInt7900; i_515_++) {
				if ((i & this.aShortArray7964[i_515_]) != 0) {
					class222_514_.method2077((float) this.anIntArray7901[i_515_], (float) this.anIntArray7895[i_515_], (float) this.anIntArray7965[i_515_], fs);
					this.anIntArray7901[i_515_] = (int) fs[0];
					this.anIntArray7895[i_515_] = (int) fs[1];
					this.anIntArray7965[i_515_] = (int) fs[2];
				}
			}
		}
	}

	public EffectiveVertex[] method4445() {
		return this.aEffectiveVertexArray7904;
	}

	public EmissiveTriangle[] method4464() {
		return this.aEmissiveTriangleArray7949;
	}

	public void method4463(Matrix43f viewingAngles) {
		Matrix4f matrix4f = this.nativeToolkit.aMatrix4f_8236;
		matrix4f.method2145(viewingAngles);
		if (this.aEmissiveTriangleArray7949 != null) {
			for (int i = 0; i < this.aEmissiveTriangleArray7949.length; i++) {
				EmissiveTriangle emissiveTriangle = this.aEmissiveTriangleArray7949[i];
				EmissiveTriangle emissiveTriangle_516_ = emissiveTriangle;
				if (emissiveTriangle.aEmissiveTriangle_776 != null)
					emissiveTriangle_516_ = emissiveTriangle.aEmissiveTriangle_776;
				emissiveTriangle_516_.anInt777 = ((int) (matrix4f.aFloatArray2594[12] + ((matrix4f.aFloatArray2594[0] * (float) (this.anIntArray7901[emissiveTriangle.anInt773 * -710317103])) + (matrix4f.aFloatArray2594[4] * (float) (this.anIntArray7895[(emissiveTriangle.anInt773 * -710317103)])) + (matrix4f.aFloatArray2594[8] * (float) (this.anIntArray7965[(emissiveTriangle.anInt773 * -710317103)])))) * -1879868075);
				emissiveTriangle_516_.anInt783 = ((int) (matrix4f.aFloatArray2594[13] + ((matrix4f.aFloatArray2594[1] * (float) (this.anIntArray7901[emissiveTriangle.anInt773 * -710317103])) + (matrix4f.aFloatArray2594[5] * (float) (this.anIntArray7895[(emissiveTriangle.anInt773 * -710317103)])) + (matrix4f.aFloatArray2594[9] * (float) (this.anIntArray7965[(emissiveTriangle.anInt773 * -710317103)])))) * -2041556771);
				emissiveTriangle_516_.anInt779 = ((int) (matrix4f.aFloatArray2594[14] + ((matrix4f.aFloatArray2594[2] * (float) (this.anIntArray7901[emissiveTriangle.anInt773 * -710317103])) + (matrix4f.aFloatArray2594[6] * (float) (this.anIntArray7895[(emissiveTriangle.anInt773 * -710317103)])) + (matrix4f.aFloatArray2594[10] * (float) (this.anIntArray7965[(emissiveTriangle.anInt773 * -710317103)])))) * -1434499227);
				emissiveTriangle_516_.anInt772 = ((int) (matrix4f.aFloatArray2594[12] + ((matrix4f.aFloatArray2594[0] * (float) (this.anIntArray7901[emissiveTriangle.anInt774 * 1705862021])) + (matrix4f.aFloatArray2594[4] * (float) (this.anIntArray7895[(emissiveTriangle.anInt774 * 1705862021)])) + (matrix4f.aFloatArray2594[8] * (float) (this.anIntArray7965[(emissiveTriangle.anInt774 * 1705862021)])))) * 1070341177);
				emissiveTriangle_516_.anInt781 = ((int) (matrix4f.aFloatArray2594[13] + ((matrix4f.aFloatArray2594[1] * (float) (this.anIntArray7901[emissiveTriangle.anInt774 * 1705862021])) + (matrix4f.aFloatArray2594[5] * (float) (this.anIntArray7895[(emissiveTriangle.anInt774 * 1705862021)])) + (matrix4f.aFloatArray2594[9] * (float) (this.anIntArray7965[(emissiveTriangle.anInt774 * 1705862021)])))) * 1802851857);
				emissiveTriangle_516_.anInt782 = (int) (matrix4f.aFloatArray2594[14] + ((matrix4f.aFloatArray2594[2] * (float) (this.anIntArray7901[emissiveTriangle.anInt774 * 1705862021])) + (matrix4f.aFloatArray2594[6] * (float) (this.anIntArray7895[emissiveTriangle.anInt774 * 1705862021])) + (matrix4f.aFloatArray2594[10] * (float) (this.anIntArray7965[(emissiveTriangle.anInt774 * 1705862021)])))) * 103846281;
				emissiveTriangle_516_.anInt771 = ((int) (matrix4f.aFloatArray2594[12] + ((matrix4f.aFloatArray2594[0] * (float) (this.anIntArray7901[emissiveTriangle.anInt775 * 1636170731])) + (matrix4f.aFloatArray2594[4] * (float) (this.anIntArray7895[(emissiveTriangle.anInt775 * 1636170731)])) + (matrix4f.aFloatArray2594[8] * (float) (this.anIntArray7965[(emissiveTriangle.anInt775 * 1636170731)])))) * -2103324039);
				emissiveTriangle_516_.anInt784 = ((int) (matrix4f.aFloatArray2594[13] + ((matrix4f.aFloatArray2594[1] * (float) (this.anIntArray7901[emissiveTriangle.anInt775 * 1636170731])) + (matrix4f.aFloatArray2594[5] * (float) (this.anIntArray7895[(emissiveTriangle.anInt775 * 1636170731)])) + (matrix4f.aFloatArray2594[9] * (float) (this.anIntArray7965[(emissiveTriangle.anInt775 * 1636170731)])))) * -526039059);
				emissiveTriangle_516_.anInt785 = (int) (matrix4f.aFloatArray2594[14] + ((matrix4f.aFloatArray2594[2] * (float) (this.anIntArray7901[emissiveTriangle.anInt775 * 1636170731])) + (matrix4f.aFloatArray2594[6] * (float) (this.anIntArray7895[emissiveTriangle.anInt775 * 1636170731])) + (matrix4f.aFloatArray2594[10] * (float) (this.anIntArray7965[(emissiveTriangle.anInt775 * 1636170731)])))) * 491030489;
			}
		}
		if (this.aEffectiveVertexArray7904 != null) {
			for (int i = 0; i < this.aEffectiveVertexArray7904.length; i++) {
				EffectiveVertex effectiveVertex = this.aEffectiveVertexArray7904[i];
				EffectiveVertex effectiveVertex_517_ = effectiveVertex;
				if (effectiveVertex.aEffectiveVertex_672 != null)
					effectiveVertex_517_ = effectiveVertex.aEffectiveVertex_672;
				if (effectiveVertex.aMatrix4f_677 != null)
					effectiveVertex.aMatrix4f_677.method2142(matrix4f);
				else
					effectiveVertex.aMatrix4f_677 = new Matrix4f(matrix4f);
				effectiveVertex_517_.anInt671 = ((int) (matrix4f.aFloatArray2594[12] + ((matrix4f.aFloatArray2594[0] * (float) (this.anIntArray7901[effectiveVertex.anInt674 * -180596249])) + (matrix4f.aFloatArray2594[4] * (float) (this.anIntArray7895[(effectiveVertex.anInt674 * -180596249)])) + (matrix4f.aFloatArray2594[8] * (float) (this.anIntArray7965[(effectiveVertex.anInt674 * -180596249)])))) * -1436341053);
				effectiveVertex_517_.anInt675 = (int) (matrix4f.aFloatArray2594[13] + ((matrix4f.aFloatArray2594[1] * (float) (this.anIntArray7901[effectiveVertex.anInt674 * -180596249])) + (matrix4f.aFloatArray2594[5] * (float) (this.anIntArray7895[effectiveVertex.anInt674 * -180596249])) + (matrix4f.aFloatArray2594[9] * (float) (this.anIntArray7965[(effectiveVertex.anInt674 * -180596249)])))) * 449866009;
				effectiveVertex_517_.anInt676 = ((int) (matrix4f.aFloatArray2594[14] + ((matrix4f.aFloatArray2594[2] * (float) (this.anIntArray7901[effectiveVertex.anInt674 * -180596249])) + (matrix4f.aFloatArray2594[6] * (float) (this.anIntArray7895[(effectiveVertex.anInt674 * -180596249)])) + (matrix4f.aFloatArray2594[10] * (float) (this.anIntArray7965[(effectiveVertex.anInt674 * -180596249)])))) * 1336328763);
			}
		}
	}

	public boolean method4787(int i, int i_518_, Matrix43f class222, boolean bool, int i_519_) {
		Matrix4f matrix4f = this.nativeToolkit.aMatrix4f_8236;
		matrix4f.method2145(class222);
		matrix4f.method2144(this.nativeToolkit.aMatrix4f_8205);
		boolean bool_520_ = false;
		float f = 3.4028235E38F;
		float f_521_ = -3.4028235E38F;
		float f_522_ = 3.4028235E38F;
		float f_523_ = -3.4028235E38F;
		if (!this.aBoolean7950)
			method4832();
		int i_524_ = ((this.anInt7941 - this.anInt7940) >> 1);
		int i_525_ = ((this.anInt7939 - this.anInt7938) >> 1);
		int i_526_ = ((this.anInt7943 - this.anInt7942) >> 1);
		int i_527_ = this.anInt7940 + i_524_;
		int i_528_ = this.anInt7938 + i_525_;
		int i_529_ = this.anInt7942 + i_526_;
		int i_530_ = i_527_ - (i_524_ << i_519_);
		int i_531_ = i_528_ - (i_525_ << i_519_);
		int i_532_ = i_529_ - (i_526_ << i_519_);
		int i_533_ = i_527_ + (i_524_ << i_519_);
		int i_534_ = i_528_ + (i_525_ << i_519_);
		int i_535_ = i_529_ + (i_526_ << i_519_);
		anIntArray7959[0] = i_530_;
		anIntArray7960[0] = i_531_;
		anIntArray7961[0] = i_532_;
		anIntArray7959[1] = i_533_;
		anIntArray7960[1] = i_531_;
		anIntArray7961[1] = i_532_;
		anIntArray7959[2] = i_530_;
		anIntArray7960[2] = i_534_;
		anIntArray7961[2] = i_532_;
		anIntArray7959[3] = i_533_;
		anIntArray7960[3] = i_534_;
		anIntArray7961[3] = i_532_;
		anIntArray7959[4] = i_530_;
		anIntArray7960[4] = i_531_;
		anIntArray7961[4] = i_535_;
		anIntArray7959[5] = i_533_;
		anIntArray7960[5] = i_531_;
		anIntArray7961[5] = i_535_;
		anIntArray7959[6] = i_530_;
		anIntArray7960[6] = i_534_;
		anIntArray7961[6] = i_535_;
		anIntArray7959[7] = i_533_;
		anIntArray7960[7] = i_534_;
		anIntArray7961[7] = i_535_;
		for (int i_536_ = 0; i_536_ < 8; i_536_++) {
			float f_537_ = (float) anIntArray7959[i_536_];
			float f_538_ = (float) anIntArray7960[i_536_];
			float f_539_ = (float) anIntArray7961[i_536_];
			float f_540_ = (matrix4f.aFloatArray2594[2] * f_537_ + matrix4f.aFloatArray2594[6] * f_538_ + matrix4f.aFloatArray2594[10] * f_539_ + matrix4f.aFloatArray2594[14]);
			float f_541_ = (matrix4f.aFloatArray2594[3] * f_537_ + matrix4f.aFloatArray2594[7] * f_538_ + matrix4f.aFloatArray2594[11] * f_539_ + matrix4f.aFloatArray2594[15]);
			if (f_540_ >= -f_541_) {
				float f_542_ = (matrix4f.aFloatArray2594[0] * f_537_ + matrix4f.aFloatArray2594[4] * f_538_ + matrix4f.aFloatArray2594[8] * f_539_ + matrix4f.aFloatArray2594[12]);
				float f_543_ = (matrix4f.aFloatArray2594[1] * f_537_ + matrix4f.aFloatArray2594[5] * f_538_ + matrix4f.aFloatArray2594[9] * f_539_ + matrix4f.aFloatArray2594[13]);
				float f_544_ = (this.nativeToolkit.aFloat8253 + (this.nativeToolkit.aFloat8329 * f_542_ / f_541_));
				float f_545_ = (this.nativeToolkit.aFloat8255 + (this.nativeToolkit.aFloat8256 * f_543_ / f_541_));
				if (f_544_ < f)
					f = f_544_;
				if (f_544_ > f_521_)
					f_521_ = f_544_;
				if (f_545_ < f_522_)
					f_522_ = f_545_;
				if (f_545_ > f_523_)
					f_523_ = f_545_;
				bool_520_ = true;
			}
		}
		if (bool_520_ && (float) i > f && (float) i < f_521_ && (float) i_518_ > f_522_ && (float) i_518_ < f_523_) {
			if (bool)
				return true;
			if (anIntArray7933.length < this.anInt7906) {
				anIntArray7933 = new int[this.anInt7906];
				anIntArray7929 = new int[this.anInt7906];
			}
			for (int i_546_ = 0; i_546_ < this.anInt7900; i_546_++) {
				float f_547_ = (float) this.anIntArray7901[i_546_];
				float f_548_ = (float) this.anIntArray7895[i_546_];
				float f_549_ = (float) this.anIntArray7965[i_546_];
				float f_550_ = (matrix4f.aFloatArray2594[2] * f_547_ + matrix4f.aFloatArray2594[6] * f_548_ + matrix4f.aFloatArray2594[10] * f_549_ + matrix4f.aFloatArray2594[14]);
				float f_551_ = (matrix4f.aFloatArray2594[3] * f_547_ + matrix4f.aFloatArray2594[7] * f_548_ + matrix4f.aFloatArray2594[11] * f_549_ + matrix4f.aFloatArray2594[15]);
				if (f_550_ >= -f_551_) {
					float f_552_ = (matrix4f.aFloatArray2594[0] * f_547_ + matrix4f.aFloatArray2594[4] * f_548_ + matrix4f.aFloatArray2594[8] * f_549_ + matrix4f.aFloatArray2594[12]);
					float f_553_ = (matrix4f.aFloatArray2594[1] * f_547_ + matrix4f.aFloatArray2594[5] * f_548_ + matrix4f.aFloatArray2594[9] * f_549_ + matrix4f.aFloatArray2594[13]);
					int i_554_ = this.anIntArray7947[i_546_];
					int i_555_ = this.anIntArray7947[i_546_ + 1];
					for (int i_556_ = i_554_; i_556_ < i_555_; i_556_++) {
						int i_557_ = (this.aShortArray7948[i_556_] - 1);
						if (i_557_ == -1)
							break;
						anIntArray7933[i_557_] = (int) ((this.nativeToolkit.aFloat8253) + (this.nativeToolkit.aFloat8329 * f_552_ / f_551_));
						anIntArray7929[i_557_] = (int) ((this.nativeToolkit.aFloat8255) + (this.nativeToolkit.aFloat8256 * f_553_ / f_551_));
					}
				} else {
					int i_558_ = this.anIntArray7947[i_546_];
					int i_559_ = this.anIntArray7947[i_546_ + 1];
					for (int i_560_ = i_558_; i_560_ < i_559_; i_560_++) {
						int i_561_ = (this.aShortArray7948[i_560_] - 1);
						if (i_561_ == -1)
							break;
						anIntArray7933[(this.aShortArray7948[i_560_]) - 1] = -999999;
					}
				}
			}
			for (int i_562_ = 0; i_562_ < this.anInt7916; i_562_++) {
				if (anIntArray7933[(this.aShortArray7920[i_562_])] != -999999 && anIntArray7933[(this.aShortArray7921[i_562_])] != -999999 && anIntArray7933[(this.aShortArray7922[i_562_])] != -999999 && method4841(i, i_518_, anIntArray7929[(this.aShortArray7920[i_562_])], anIntArray7929[(this.aShortArray7921[i_562_])], anIntArray7929[(this.aShortArray7922[i_562_])], anIntArray7933[(this.aShortArray7920[i_562_])], anIntArray7933[(this.aShortArray7921[i_562_])], anIntArray7933[(this.aShortArray7922[i_562_])]))
					return true;
			}
		}
		return false;
	}

	boolean method4841(int i, int i_563_, int i_564_, int i_565_, int i_566_, int i_567_, int i_568_, int i_569_) {
		if (i_563_ < i_564_ && i_563_ < i_565_ && i_563_ < i_566_)
			return false;
		if (i_563_ > i_564_ && i_563_ > i_565_ && i_563_ > i_566_)
			return false;
		if (i < i_567_ && i < i_568_ && i < i_569_)
			return false;
        return !(i > i_567_ && i > i_568_ && i > i_569_);
    }

    void method4842(Class_na_Sub2 class_na_sub2) {
		if (anIntArray7933.length < this.anInt7906) {
			anIntArray7933 = new int[this.anInt7906];
			anIntArray7929 = new int[this.anInt7906];
		}
		for (int i = 0; i < this.anInt7900; i++) {
			int i_573_ = (((this.anIntArray7901[i] - ((this.anIntArray7895[i] * this.nativeToolkit.anInt8299) >> 8)) >> this.nativeToolkit.anInt8313) - class_na_sub2.anInt10018);
			int i_574_ = (((this.anIntArray7965[i] - ((this.anIntArray7895[i] * this.nativeToolkit.anInt8317) >> 8)) >> this.nativeToolkit.anInt8313) - class_na_sub2.anInt10022);
			int i_575_ = this.anIntArray7947[i];
			int i_576_ = this.anIntArray7947[i + 1];
			for (int i_577_ = i_575_; i_577_ < i_576_; i_577_++) {
				int i_578_ = this.aShortArray7948[i_577_] - 1;
				if (i_578_ == -1)
					break;
				anIntArray7933[i_578_] = i_573_;
				anIntArray7929[i_578_] = i_574_;
			}
		}
		for (int i = 0; i < this.anInt7917; i++) {
			if (this.aByteArray7963 == null || this.aByteArray7963[i] <= 128) {
				short i_579_ = this.aShortArray7920[i];
				short i_580_ = this.aShortArray7921[i];
				short i_581_ = this.aShortArray7922[i];
				int i_582_ = anIntArray7933[i_579_];
				int i_583_ = anIntArray7933[i_580_];
				int i_584_ = anIntArray7933[i_581_];
				int i_585_ = anIntArray7929[i_579_];
				int i_586_ = anIntArray7929[i_580_];
				int i_587_ = anIntArray7929[i_581_];
				if (((i_582_ - i_583_) * (i_586_ - i_587_) - (i_586_ - i_585_) * (i_584_ - i_583_)) > 0)
					class_na_sub2.method3490(i_585_, i_586_, i_587_, i_582_, i_583_, i_584_);
			}
		}
	}

	public void render(Matrix43f class222, Class302_Sub1 class302_sub1, int i) {
		if (aClass156_7966 != null)
			aClass156_7966.method1694();
		if (this.anInt7906 != 0) {
			Matrix4f matrix4f = (this.nativeToolkit.aMatrix4f_8246);
			Matrix4f matrix4f_588_ = this.nativeToolkit.aMatrix4f_8236;
			Matrix4f matrix4f_589_ = (this.nativeToolkit.aMatrix4f_8204);
			matrix4f_588_.method2145(class222);
			matrix4f_589_.method2142(matrix4f_588_);
			matrix4f_589_.method2144(this.nativeToolkit.aMatrix4f_8205);
			if (!this.aBoolean7950)
				method4832();
			float[] fs = (this.nativeToolkit.aFloatArray8312);
			matrix4f_588_.method2149(0.0F, (float) this.anInt7938, 0.0F, fs);
			float f = fs[0];
			float f_590_ = fs[1];
			float f_591_ = fs[2];
			matrix4f_588_.method2149(0.0F, (float) this.anInt7939, 0.0F, fs);
			float f_592_ = fs[0];
			float f_593_ = fs[1];
			float f_594_ = fs[2];
			for (int i_595_ = 0; i_595_ < 6; i_595_++) {
				float[] fs_596_ = (this.nativeToolkit.aFloatArrayArray8252[i_595_]);
				float f_597_ = (fs_596_[0] * f + fs_596_[1] * f_590_ + fs_596_[2] * f_591_ + fs_596_[3] + (float) this.anInt7936);
				float f_598_ = (fs_596_[0] * f_592_ + fs_596_[1] * f_593_ + fs_596_[2] * f_594_ + fs_596_[3] + (float) this.anInt7936);
				if (f_597_ < 0.0F && f_598_ < 0.0F)
					return;
			}
			if (class302_sub1 != null) {
				boolean bool = false;
				boolean bool_599_ = true;
				int i_600_ = ((this.anInt7940 + this.anInt7941) >> 1);
				int i_601_ = ((this.anInt7942 + this.anInt7943) >> 1);
				int i_602_ = i_600_;
				int i_603_ = this.anInt7938;
				int i_604_ = i_601_;
				float f_605_ = (matrix4f_589_.aFloatArray2594[0] * (float) i_602_ + matrix4f_589_.aFloatArray2594[4] * (float) i_603_ + matrix4f_589_.aFloatArray2594[8] * (float) i_604_ + matrix4f_589_.aFloatArray2594[12]);
				float f_606_ = (matrix4f_589_.aFloatArray2594[1] * (float) i_602_ + matrix4f_589_.aFloatArray2594[5] * (float) i_603_ + matrix4f_589_.aFloatArray2594[9] * (float) i_604_ + matrix4f_589_.aFloatArray2594[13]);
				float f_607_ = (matrix4f_589_.aFloatArray2594[2] * (float) i_602_ + matrix4f_589_.aFloatArray2594[6] * (float) i_603_ + matrix4f_589_.aFloatArray2594[10] * (float) i_604_ + matrix4f_589_.aFloatArray2594[14]);
				float f_608_ = (matrix4f_589_.aFloatArray2594[3] * (float) i_602_ + matrix4f_589_.aFloatArray2594[7] * (float) i_603_ + matrix4f_589_.aFloatArray2594[11] * (float) i_604_ + matrix4f_589_.aFloatArray2594[15]);
				if (f_607_ >= -f_608_) {
					class302_sub1.anInt7641 = (int) ((this.nativeToolkit.aFloat8253) + (this.nativeToolkit.aFloat8329) * f_605_ / f_608_);
					class302_sub1.anInt7642 = (int) ((this.nativeToolkit.aFloat8255) + (this.nativeToolkit.aFloat8256) * f_606_ / f_608_);
				} else
					bool = true;
				i_602_ = i_600_;
				i_603_ = this.anInt7939;
				i_604_ = i_601_;
				float f_609_ = (matrix4f_589_.aFloatArray2594[0] * (float) i_602_ + matrix4f_589_.aFloatArray2594[4] * (float) i_603_ + matrix4f_589_.aFloatArray2594[8] * (float) i_604_ + matrix4f_589_.aFloatArray2594[12]);
				float f_610_ = (matrix4f_589_.aFloatArray2594[1] * (float) i_602_ + matrix4f_589_.aFloatArray2594[5] * (float) i_603_ + matrix4f_589_.aFloatArray2594[9] * (float) i_604_ + matrix4f_589_.aFloatArray2594[13]);
				float f_611_ = (matrix4f_589_.aFloatArray2594[2] * (float) i_602_ + matrix4f_589_.aFloatArray2594[6] * (float) i_603_ + matrix4f_589_.aFloatArray2594[10] * (float) i_604_ + matrix4f_589_.aFloatArray2594[14]);
				float f_612_ = (matrix4f_589_.aFloatArray2594[3] * (float) i_602_ + matrix4f_589_.aFloatArray2594[7] * (float) i_603_ + matrix4f_589_.aFloatArray2594[11] * (float) i_604_ + matrix4f_589_.aFloatArray2594[15]);
				if (f_611_ >= -f_612_) {
					class302_sub1.anInt7643 = (int) ((this.nativeToolkit.aFloat8253) + (this.nativeToolkit.aFloat8329) * f_609_ / f_612_);
					class302_sub1.anInt7640 = (int) ((this.nativeToolkit.aFloat8255) + (this.nativeToolkit.aFloat8256) * f_610_ / f_612_);
				} else
					bool = true;
				if (bool) {
					if (f_607_ < -f_608_ && f_611_ < -f_612_)
						bool_599_ = false;
					else if (f_607_ < -f_608_) {
						float f_613_ = (f_607_ + f_608_) / (f_611_ + f_612_) - 1.0F;
						float f_614_ = f_605_ + f_613_ * (f_609_ - f_605_);
						float f_615_ = f_606_ + f_613_ * (f_610_ - f_606_);
						float f_616_ = f_608_ + f_613_ * (f_612_ - f_608_);
						class302_sub1.anInt7641 = (int) ((this.nativeToolkit.aFloat8253) + (this.nativeToolkit.aFloat8329 * f_614_ / f_616_));
						class302_sub1.anInt7642 = (int) ((this.nativeToolkit.aFloat8255) + (this.nativeToolkit.aFloat8256 * f_615_ / f_616_));
					} else if (f_611_ < -f_612_) {
						float f_617_ = (f_611_ + f_612_) / (f_607_ + f_608_) - 1.0F;
						float f_618_ = f_609_ + f_617_ * (f_605_ - f_609_);
						float f_619_ = f_610_ + f_617_ * (f_606_ - f_610_);
						float f_620_ = f_612_ + f_617_ * (f_608_ - f_612_);
						class302_sub1.anInt7643 = (int) ((this.nativeToolkit.aFloat8253) + (this.nativeToolkit.aFloat8329 * f_618_ / f_620_));
						class302_sub1.anInt7640 = (int) ((this.nativeToolkit.aFloat8255) + (this.nativeToolkit.aFloat8256 * f_619_ / f_620_));
					}
				}
				if (bool_599_) {
					if (f_607_ / f_608_ > f_611_ / f_612_) {
						float f_621_ = (f_605_ + (matrix4f.aFloatArray2594[0] * (float) this.anInt7936) + matrix4f.aFloatArray2594[12]);
						float f_622_ = (f_608_ + (matrix4f.aFloatArray2594[3] * (float) this.anInt7936) + matrix4f.aFloatArray2594[15]);
						class302_sub1.anInt7645 = (int) ((this.nativeToolkit.aFloat8253) - (float) class302_sub1.anInt7641 + (this.nativeToolkit.aFloat8329 * f_621_ / f_622_));
					} else {
						float f_623_ = (f_609_ + (matrix4f.aFloatArray2594[0] * (float) this.anInt7936) + matrix4f.aFloatArray2594[12]);
						float f_624_ = (f_612_ + (matrix4f.aFloatArray2594[3] * (float) this.anInt7936) + matrix4f.aFloatArray2594[15]);
						class302_sub1.anInt7645 = (int) ((this.nativeToolkit.aFloat8253) - (float) class302_sub1.anInt7643 + (this.nativeToolkit.aFloat8329 * f_623_ / f_624_));
					}
					class302_sub1.aBoolean7644 = true;
				}
			}
			this.nativeToolkit.method5394(i);
			method4843(class222);
			this.nativeToolkit.method5394(0);
			matrix4f_588_.method2145(class222);
			matrix4f_588_.method2144(this.nativeToolkit.aMatrix4f_8230);
			method4849(matrix4f_588_);
		}
	}

	void method4843(Matrix43f class222) {
		if (this.anInt7917 != 0 && (method4844() && method4835())) {
			if (aClass156_7966 == null) {
				/* empty */
			}
			this.nativeToolkit.method5393();
			Class137 class137 = (this.nativeToolkit.aClass137_8316);
			this.nativeToolkit.method5383(0, (this.aClass186_7927.anInterface7_Impl1_1902));
			this.nativeToolkit.method5383(1, (this.aClass186_7911.anInterface7_Impl1_1902));
			this.nativeToolkit.method5383(2, (this.aClass186_7930.anInterface7_Impl1_1902));
			this.nativeToolkit.method5384(this.aClass167_7926.anInterface7_Impl2_1707);
			this.nativeToolkit.aMatrix4f_8236.method2145(class222);
			class137.method1506(this.nativeToolkit.aMatrix4f_8236);
			class137.aMatrix4f_1519.method2172();
			if (this.nativeToolkit.aBoolean8326) {
				Class78 class78 = this.nativeToolkit.method5373();
				class137.aClass232_1523.method2135(0.0F, 1.0F, 0.0F, (float) -(this.nativeToolkit.anInt8328));
				class137.aClass232_1523.method2139(3.0F / (float) (class78.anInt725 * 1996750669));
				class137.aClass217_1524.setVector3f(((float) (class78.anInt726 * -1212608691 >> 16 & 0xff) / 255.0F), ((float) (class78.anInt726 * -1212608691 >> 8 & 0xff) / 255.0F), ((float) (class78.anInt726 * -1212608691 >> 0 & 0xff) / 255.0F));
			} else {
				class137.aClass232_1523.method2135(0.0F, 0.0F, 0.0F, 0.0F);
				class137.aClass217_1524.setVector3f(0.0F, 0.0F, 0.0F);
			}
			if (this.nativeToolkit.anInt8233 > 0) {
				class137.aClass232_1525.method2135(0.0F, 0.0F, 1.0F, -(this.nativeToolkit.aFloat8292));
				class137.aClass217_1522.setVector3f((float) ((this.nativeToolkit.anInt8332) >> 16 & 0xff) / 255.0F, (float) ((this.nativeToolkit.anInt8332) >> 8 & 0xff) / 255.0F, (float) ((this.nativeToolkit.anInt8332) >> 0 & 0xff) / 255.0F);
				this.nativeToolkit.aMatrix4f_8236.method2145(class222);
				this.nativeToolkit.aMatrix4f_8236.method2159();
				class137.aClass232_1523.method2138(this.nativeToolkit.aMatrix4f_8236);
				this.nativeToolkit.aMatrix4f_8236.method2145(class222);
				this.nativeToolkit.aMatrix4f_8236.method2144(this.nativeToolkit.aMatrix4f_8230);
				this.nativeToolkit.aMatrix4f_8236.method2159();
				class137.aClass232_1525.method2138(this.nativeToolkit.aMatrix4f_8236);
				class137.aClass232_1525.method2139(1.0F / ((this.nativeToolkit.aFloat8336) - (this.nativeToolkit.aFloat8292)));
			} else {
				class137.aClass232_1525.method2135(0.0F, 0.0F, 0.0F, 0.0F);
				class137.aClass217_1522.setVector3f(0.0F, 0.0F, 0.0F);
			}
			if ((this.anInt7896 & 0x37) == 0) {
				this.nativeToolkit.method5455(this.nativeToolkit.aClass153_8306);
				if (this.nativeToolkit.aBoolean8214)
					this.nativeToolkit.method5417(false);
				for (int i = 0; i < this.anIntArray7945.length; i++) {
					int i_625_ = this.anIntArray7944[i];
					int i_626_ = this.anIntArray7944[i + 1];
					int i_627_ = (this.aShortArray7923[i_625_] & 0xffff);
					boolean bool = false;
					if (i_627_ != 65535) {
						class137.anInterface9_Impl2_1517 = this.nativeToolkit.aClass157_8351.method1698(i_627_);
						Class53 class53 = this.nativeToolkit.textures.method174(i_627_);
						bool = !Class298_Sub32_Sub31.method3339(class53.aByte529, -1764580449);
						class137.aMatrix4f_1519.aFloatArray2594[12] = ((float) ((this.nativeToolkit.anInt8342) % 128000) / 1000.0F * (float) class53.aByte535 / 64.0F % 1.0F);
						class137.aMatrix4f_1519.aFloatArray2594[13] = ((float) ((this.nativeToolkit.anInt8342) % 128000) / 1000.0F * (float) class53.aByte509 / 64.0F % 1.0F);
					} else {
						class137.anInterface9_Impl2_1517 = (this.nativeToolkit.anInterface9_Impl2_8310);
						float[] fs = class137.aMatrix4f_1519.aFloatArray2594;
						class137.aMatrix4f_1519.aFloatArray2594[13] = 0.0F;
						fs[12] = 0.0F;
					}
					class137.anInt1532 = this.anIntArray7945[i];
					class137.anInt1533 = this.anIntArray7913[i];
					class137.anInt1534 = i_625_ * 3;
					class137.anInt1514 = i_626_ - i_625_;
					class137.method1514(bool);
				}
			} else {
				this.nativeToolkit.method5383(3, (this.aClass186_7934.anInterface7_Impl1_1902));
				this.nativeToolkit.method5455(this.nativeToolkit.aClass153_8358);
				Matrix43f class222_628_ = (this.nativeToolkit.aClass222_8235);
				class222_628_.copy(class222);
				class222_628_.method2058();
				int i = 0;
				if (this.nativeToolkit.aBoolean8214)
					this.nativeToolkit.method5417(true);
				else {
					class137.aClass217_1527.setVector3f((this.nativeToolkit.aFloatArray8283[0]), (this.nativeToolkit.aFloatArray8283[1]), (this.nativeToolkit.aFloatArray8283[2]));
					class137.aClass217_1527.method2018(class222_628_);
					class137.aClass217_1528.setVector3f((this.nativeToolkit.aFloat8364 * (this.nativeToolkit.aFloat8362)), (this.nativeToolkit.aFloat8364 * (this.nativeToolkit.aFloat8289)), (this.nativeToolkit.aFloat8364 * (this.nativeToolkit.aFloat8290)));
					class137.aClass217_1529.setVector3f((-(this.nativeToolkit.aFloat8293) * (this.nativeToolkit.aFloat8362)), (-(this.nativeToolkit.aFloat8293) * (this.nativeToolkit.aFloat8289)), (-(this.nativeToolkit.aFloat8293) * (this.nativeToolkit.aFloat8290)));
					class137.aClass217_1515.setVector3f((this.nativeToolkit.aFloat8291 * (this.nativeToolkit.aFloat8362)), (this.nativeToolkit.aFloat8291 * (this.nativeToolkit.aFloat8289)), (this.nativeToolkit.aFloat8291 * (this.nativeToolkit.aFloat8290)));
					if (this.nativeToolkit.anInt8295 > 0) {
						i = (this.nativeToolkit.anInt8295);
						Vector3f class217 = (this.nativeToolkit.aClass217_8238);
						for (int i_629_ = 0; i_629_ < i; i_629_++) {
							Light class298_sub10 = (this.nativeToolkit.aClass298_Sub10Array8286[i_629_]);
							int i_630_ = class298_sub10.method2898(-1700557017);
							class217.setVector3fOfficial(class298_sub10.aClass217_7231);
							class217.method2016(class222_628_);
							class137.aFloatArray1516[i_629_ * 4 + 0] = class217.x;
							class137.aFloatArray1516[i_629_ * 4 + 1] = class217.y;
							class137.aFloatArray1516[i_629_ * 4 + 2] = class217.z;
							class137.aFloatArray1516[i_629_ * 4 + 3] = (float) (class298_sub10.method2900(-516677016) * class298_sub10.method2900(-969209529));
							float f = (class298_sub10.method2901(608404512) / 255.0F);
							class137.aFloatArray1526[i_629_ * 4 + 0] = (float) (i_630_ >> 16 & 0xff) * f;
							class137.aFloatArray1526[i_629_ * 4 + 1] = (float) (i_630_ >> 8 & 0xff) * f;
							class137.aFloatArray1526[i_629_ * 4 + 2] = (float) (i_630_ & 0xff) * f;
							class137.aFloatArray1526[i_629_ * 4 + 3] = 1.0F;
						}
					}
				}
				for (int i_631_ = 0; i_631_ < this.anIntArray7945.length; i_631_++) {
					int i_632_ = this.anIntArray7944[i_631_];
					int i_633_ = this.anIntArray7944[i_631_ + 1];
					int i_634_ = (this.aShortArray7923[i_632_] & 0xffff);
					byte i_635_ = 11;
					if (i_634_ != 65535) {
						class137.anInterface9_Impl2_1517 = this.nativeToolkit.aClass157_8351.method1698(i_634_);
						Class53 class53 = this.nativeToolkit.textures.method174(i_634_);
						i_635_ = class53.aByte529;
						class137.method1509(class53);
						class137.aMatrix4f_1519.aFloatArray2594[12] = ((float) ((this.nativeToolkit.anInt8342) % 128000) / 1000.0F * (float) class53.aByte535 / 64.0F % 1.0F);
						class137.aMatrix4f_1519.aFloatArray2594[13] = ((float) ((this.nativeToolkit.anInt8342) % 128000) / 1000.0F * (float) class53.aByte509 / 64.0F % 1.0F);
					} else {
						class137.anInterface9_Impl2_1517 = (this.nativeToolkit.anInterface9_Impl2_8310);
						float[] fs = class137.aMatrix4f_1519.aFloatArray2594;
						class137.aMatrix4f_1519.aFloatArray2594[13] = 0.0F;
						fs[12] = 0.0F;
					}
					class137.anInt1532 = this.anIntArray7945[i_631_];
					class137.anInt1533 = this.anIntArray7913[i_631_];
					class137.anInt1534 = i_632_ * 3;
					class137.anInt1514 = i_633_ - i_632_;
					switch (i_635_) {
					case 6:
						class137.method1514(!Class298_Sub32_Sub31.method3339(i_635_, -2085193350));
						break;
					default:
						class137.method1507(i);
						break;
					case 5:
						if (!this.nativeToolkit.aBoolean8214) {
							Class161_Sub1_Sub1 class161_sub1_sub1 = (this.nativeToolkit.aClass161_Sub1_Sub1_8266);
							Class53 class53 = this.nativeToolkit.textures.method174(i_634_);
							class161_sub1_sub1.method1738(class53.aByte536, (class53.anInt531 * 1616831825), (byte) 19);
							class161_sub1_sub1.aMatrix4f_9121.method2145(class222);
							class161_sub1_sub1.aMatrix4f_9124.method2145(class222);
							class161_sub1_sub1.aMatrix4f_9124.method2144(this.nativeToolkit.aMatrix4f_8251);
							class161_sub1_sub1.anInt9132 = (this.anIntArray7945[i_631_]) * 1459484499;
							class161_sub1_sub1.anInt9133 = (this.anIntArray7913[i_631_]) * -2143476445;
							class161_sub1_sub1.anInt9134 = i_632_ * 1595616125;
							class161_sub1_sub1.anInt9135 = (i_633_ - i_632_) * -1212285161;
							class161_sub1_sub1.method1739(-1182747927);
						} else
							class137.method1507(i);
						break;
					case 7:
						class137.aClass217_1530.setVector3f((this.nativeToolkit.aMatrix4f_8231.aFloatArray2594[12]), (this.nativeToolkit.aMatrix4f_8231.aFloatArray2594[13]), (this.nativeToolkit.aMatrix4f_8231.aFloatArray2594[14]));
						class137.aClass217_1530.method2016(class222_628_);
						class137.aMatrix4f_1535.method2145(class222);
						class137.anInterface9_Impl1_1518 = this.nativeToolkit.method5321();
						class137.method1503(i);
						break;
					case 1:
						class137.aClass217_1530.setVector3f((this.nativeToolkit.aMatrix4f_8231.aFloatArray2594[12]), (this.nativeToolkit.aMatrix4f_8231.aFloatArray2594[13]), (this.nativeToolkit.aMatrix4f_8231.aFloatArray2594[14]));
						class137.aClass217_1530.method2016(class222_628_);
						class137.method1508(i);
					}
				}
			}
			method4837();
		}
	}

    boolean method4844() {
		boolean bool = !this.aClass186_7911.aBoolean1900;
		boolean bool_636_ = ((this.anInt7896 & 0x37) != 0 && !(this.aClass186_7934.aBoolean1900));
		boolean bool_637_ = !this.aClass186_7927.aBoolean1900;
		boolean bool_638_ = !this.aClass186_7930.aBoolean1900;
		if (!bool_637_ && !bool && !bool_636_ && !bool_638_)
			return true;
		boolean bool_639_ = true;
		if (bool_637_ && this.aShortArray7907 != null) {
			if ((this.aClass186_7927.anInterface7_Impl1_1903) == null)
				this.aClass186_7927.anInterface7_Impl1_1903 = this.nativeToolkit.method5382(this.aBoolean7931);
			Interface7_Impl1 interface7_impl1 = (this.aClass186_7927.anInterface7_Impl1_1903);
			interface7_impl1.method72(this.anInt7906 * 12, 12);
			Unsafe unsafe = this.nativeToolkit.anUnsafe8219;
			if (unsafe != null) {
				int i = this.anInt7906 * 12;
				long l = interface7_impl1.method62(0, i);
				for (int i_640_ = 0; i_640_ < this.anInt7906; i_640_++) {
					short i_641_ = this.aShortArray7907[i_640_];
					unsafe.putFloat(l, (float) (this.anIntArray7901[i_641_]));
					l += 4L;
					unsafe.putFloat(l, (float) (this.anIntArray7895[i_641_]));
					l += 4L;
					unsafe.putFloat(l, (float) (this.anIntArray7965[i_641_]));
					l += 4L;
				}
				interface7_impl1.method69();
			} else {
				ByteBuffer bytebuffer = (this.nativeToolkit.aByteBuffer8216);
				bytebuffer.clear();
				for (int i = 0; i < this.anInt7906; i++) {
					bytebuffer.putFloat((float) this.anIntArray7901[(this.aShortArray7907[i])]);
					bytebuffer.putFloat((float) this.anIntArray7895[(this.aShortArray7907[i])]);
					bytebuffer.putFloat((float) this.anIntArray7965[(this.aShortArray7907[i])]);
				}
				interface7_impl1.method63(0, bytebuffer.position(), (this.nativeToolkit.aLong8217));
			}
			this.aClass186_7927.anInterface7_Impl1_1902 = interface7_impl1;
			this.aClass186_7927.aBoolean1900 = true;
		}
		if (bool) {
			if ((this.aClass186_7911.anInterface7_Impl1_1903) == null)
				this.aClass186_7911.anInterface7_Impl1_1903 = this.nativeToolkit.method5382(this.aBoolean7931);
			Interface7_Impl1 interface7_impl1 = (this.aClass186_7911.anInterface7_Impl1_1903);
			interface7_impl1.method72(this.anInt7906 * 4, 4);
			Unsafe unsafe = this.nativeToolkit.anUnsafe8219;
			if (unsafe != null) {
				int i = this.anInt7906 * 4;
				long l = interface7_impl1.method62(0, i);
				if ((this.anInt7896 & 0x37) == 0) {
					short[] is;
					short[] is_642_;
					short[] is_643_;
					byte[] is_644_;
					if (this.aClass185_7915 != null) {
						is = this.aClass185_7915.aShortArray1899;
						is_642_ = this.aClass185_7915.aShortArray1897;
						is_643_ = this.aClass185_7915.aShortArray1896;
						is_644_ = this.aClass185_7915.aByteArray1898;
					} else {
						is = this.aShortArray7909;
						is_642_ = this.aShortArray7910;
						is_643_ = this.aShortArray7919;
						is_644_ = this.aByteArray7958;
					}
					float f = ((this.nativeToolkit.aFloat8364) * 768.0F / (float) this.aShort7898);
					float f_645_ = ((this.nativeToolkit.aFloat8293) * 768.0F / (float) this.aShort7898);
					for (int i_646_ = 0; i_646_ < this.anInt7906; i_646_++) {
						short i_647_ = this.aShortArray7908[i_646_];
						int i_648_ = method4846((this.aShortArray7935[i_647_]) & 0xffff, (this.aShortArray7923[i_647_]), this.aShort7897);
						float f_649_ = ((float) (i_648_ >> 16 & 0xff) * (this.nativeToolkit.aFloat8362));
						float f_650_ = ((float) (i_648_ >> 8 & 0xff) * (this.nativeToolkit.aFloat8289));
						float f_651_ = ((float) (i_648_ & 0xff) * (this.nativeToolkit.aFloat8290));
						byte i_652_ = is_644_[i_646_];
						float f_653_;
						if (i_652_ == 0)
							f_653_ = (((this.nativeToolkit.aFloatArray8283[0]) * (float) is[i_646_] + (this.nativeToolkit.aFloatArray8283[1]) * (float) is_642_[i_646_] + (this.nativeToolkit.aFloatArray8283[2]) * (float) is_643_[i_646_]) * 0.0026041667F);
						else
							f_653_ = (((this.nativeToolkit.aFloatArray8283[0]) * (float) is[i_646_] + (this.nativeToolkit.aFloatArray8283[1]) * (float) is_642_[i_646_] + (this.nativeToolkit.aFloatArray8283[2]) * (float) is_643_[i_646_]) / ((float) i_652_ * 256.0F));
						float f_654_ = ((this.nativeToolkit.aFloat8291) + f_653_ * (f_653_ < 0.0F ? f_645_ : f));
						int i_655_ = (int) (f_649_ * f_654_);
						if (i_655_ < 0)
							i_655_ = 0;
						else if (i_655_ > 255)
							i_655_ = 255;
						int i_656_ = (int) (f_650_ * f_654_);
						if (i_656_ < 0)
							i_656_ = 0;
						else if (i_656_ > 255)
							i_656_ = 255;
						int i_657_ = (int) (f_651_ * f_654_);
						if (i_657_ < 0)
							i_657_ = 0;
						else if (i_657_ > 255)
							i_657_ = 255;
						unsafe.putInt(l, (255 - (this.aByteArray7963[i_647_]) << 24 | i_655_ << 16 | i_656_ << 8 | i_657_));
						l += 4L;
					}
				} else {
					for (int i_658_ = 0; i_658_ < this.anInt7906; i_658_++) {
						short i_659_ = this.aShortArray7908[i_658_];
						int i_660_ = (255 - (this.aByteArray7963[i_659_]) << 24 | method4846(((this.aShortArray7935[i_659_]) & 0xffff), (this.aShortArray7923[i_659_]), (this.aShort7897)));
						unsafe.putInt(l, i_660_);
						l += 4L;
					}
				}
				interface7_impl1.method69();
			} else {
				ByteBuffer bytebuffer = (this.nativeToolkit.aByteBuffer8216);
				bytebuffer.clear();
				if ((this.anInt7896 & 0x37) == 0) {
					short[] is;
					short[] is_661_;
					short[] is_662_;
					byte[] is_663_;
					if (this.aClass185_7915 != null) {
						is = this.aClass185_7915.aShortArray1899;
						is_661_ = this.aClass185_7915.aShortArray1897;
						is_662_ = this.aClass185_7915.aShortArray1896;
						is_663_ = this.aClass185_7915.aByteArray1898;
					} else {
						is = this.aShortArray7909;
						is_661_ = this.aShortArray7910;
						is_662_ = this.aShortArray7919;
						is_663_ = this.aByteArray7958;
					}
					float f = ((this.nativeToolkit.aFloat8364) * 768.0F / (float) this.aShort7898);
					float f_664_ = ((this.nativeToolkit.aFloat8293) * 768.0F / (float) this.aShort7898);
					for (int i = 0; i < this.anInt7906; i++) {
						short i_665_ = this.aShortArray7908[i];
						int i_666_ = method4846((this.aShortArray7935[i_665_]) & 0xffff, (this.aShortArray7923[i_665_]), this.aShort7897);
						float f_667_ = ((float) (i_666_ >> 16 & 0xff) * (this.nativeToolkit.aFloat8362));
						float f_668_ = ((float) (i_666_ >> 8 & 0xff) * (this.nativeToolkit.aFloat8289));
						float f_669_ = ((float) (i_666_ & 0xff) * (this.nativeToolkit.aFloat8290));
						byte i_670_ = is_663_[i];
						float f_671_;
						if (i_670_ == 0)
							f_671_ = ((this.nativeToolkit.aFloatArray8283[0]) * (float) is[i] + ((this.nativeToolkit.aFloatArray8283[1]) * (float) is_661_[i]) + ((this.nativeToolkit.aFloatArray8283[2]) * (float) is_662_[i])) * 0.0026041667F;
						else
							f_671_ = (((this.nativeToolkit.aFloatArray8283[0]) * (float) is[i] + (this.nativeToolkit.aFloatArray8283[1]) * (float) is_661_[i] + (this.nativeToolkit.aFloatArray8283[2]) * (float) is_662_[i]) / ((float) i_670_ * 256.0F));
						float f_672_ = ((this.nativeToolkit.aFloat8291) + f_671_ * (f_671_ < 0.0F ? f_664_ : f));
						int i_673_ = (int) (f_667_ * f_672_);
						if (i_673_ < 0)
							i_673_ = 0;
						else if (i_673_ > 255)
							i_673_ = 255;
						int i_674_ = (int) (f_668_ * f_672_);
						if (i_674_ < 0)
							i_674_ = 0;
						else if (i_674_ > 255)
							i_674_ = 255;
						int i_675_ = (int) (f_669_ * f_672_);
						if (i_675_ < 0)
							i_675_ = 0;
						else if (i_675_ > 255)
							i_675_ = 255;
						bytebuffer.putInt(255 - (this.aByteArray7963[i_665_]) << 24 | i_673_ << 16 | i_674_ << 8 | i_675_);
					}
				} else {
					for (int i = 0; i < this.anInt7906; i++) {
						short i_676_ = this.aShortArray7908[i];
						int i_677_ = (255 - (this.aByteArray7963[i_676_]) << 24 | method4846(((this.aShortArray7935[i_676_]) & 0xffff), (this.aShortArray7923[i_676_]), (this.aShort7897)));
						bytebuffer.putInt(i_677_);
					}
				}
				interface7_impl1.method63(0, bytebuffer.position(), (this.nativeToolkit.aLong8217));
			}
			this.aClass186_7911.anInterface7_Impl1_1902 = interface7_impl1;
			this.aClass186_7911.aBoolean1900 = true;
		}
		if (bool_636_) {
			if ((this.aClass186_7934.anInterface7_Impl1_1903) == null)
				this.aClass186_7934.anInterface7_Impl1_1903 = this.nativeToolkit.method5382(this.aBoolean7931);
			Interface7_Impl1 interface7_impl1 = (this.aClass186_7934.anInterface7_Impl1_1903);
			interface7_impl1.method72(this.anInt7906 * 12, 12);
			short[] is;
			short[] is_678_;
			short[] is_679_;
			byte[] is_680_;
			if (this.aClass185_7915 != null) {
				is = (this.aClass185_7915.aShortArray1899);
				is_678_ = (this.aClass185_7915.aShortArray1897);
				is_679_ = (this.aClass185_7915.aShortArray1896);
				is_680_ = (this.aClass185_7915.aByteArray1898);
			} else {
				is = this.aShortArray7909;
				is_678_ = this.aShortArray7910;
				is_679_ = this.aShortArray7919;
				is_680_ = this.aByteArray7958;
			}
			float f = 3.0F / (float) this.aShort7898;
			float f_681_ = 3.0F / (float) (this.aShort7898 + this.aShort7898 / 2);
			Unsafe unsafe = this.nativeToolkit.anUnsafe8219;
			if (unsafe != null) {
				int i = this.anInt7906 * 12;
				long l = interface7_impl1.method62(0, i);
				for (int i_682_ = 0; i_682_ < this.anInt7906; i_682_++) {
					float f_683_ = (is_680_[i_682_] == 0 ? f_681_ : f / (float) is_680_[i_682_]);
					float f_684_ = (float) is[i_682_] * f_683_;
					float f_685_ = (float) is_678_[i_682_] * f_683_;
					float f_686_ = (float) is_679_[i_682_] * f_683_;
					unsafe.putFloat(l, f_684_);
					l += 4L;
					unsafe.putFloat(l, f_685_);
					l += 4L;
					unsafe.putFloat(l, f_686_);
					l += 4L;
				}
				interface7_impl1.method69();
			} else {
				ByteBuffer bytebuffer = (this.nativeToolkit.aByteBuffer8216);
				bytebuffer.clear();
				for (int i = 0; i < this.anInt7906; i++) {
					float f_687_ = is_680_[i] == 0 ? f_681_ : f / (float) is_680_[i];
					float f_688_ = (float) is[i] * f_687_;
					float f_689_ = (float) is_678_[i] * f_687_;
					float f_690_ = (float) is_679_[i] * f_687_;
					bytebuffer.putFloat(f_688_);
					bytebuffer.putFloat(f_689_);
					bytebuffer.putFloat(f_690_);
				}
				interface7_impl1.method63(0, bytebuffer.position(), (this.nativeToolkit.aLong8217));
			}
			this.aClass186_7934.anInterface7_Impl1_1902 = interface7_impl1;
			this.aClass186_7934.aBoolean1900 = true;
		}
		if (bool_638_) {
			if ((this.aClass186_7930.anInterface7_Impl1_1903) == null)
				this.aClass186_7930.anInterface7_Impl1_1903 = this.nativeToolkit.method5382(this.aBoolean7931);
			Interface7_Impl1 interface7_impl1 = (this.aClass186_7930.anInterface7_Impl1_1903);
			interface7_impl1.method72(this.anInt7906 * 8, 8);
			Unsafe unsafe = this.nativeToolkit.anUnsafe8219;
			if (unsafe != null) {
				int i = this.anInt7906 * 8;
				long l = interface7_impl1.method62(0, i);
				for (int i_691_ = 0; i_691_ < this.anInt7906; i_691_++) {
					unsafe.putFloat(l, (this.aFloatArray7953[i_691_]));
					l += 4L;
					unsafe.putFloat(l, (this.aFloatArray7914[i_691_]));
					l += 4L;
				}
				interface7_impl1.method69();
			} else {
				ByteBuffer bytebuffer = (this.nativeToolkit.aByteBuffer8216);
				bytebuffer.clear();
				for (int i = 0; i < this.anInt7906; i++) {
					bytebuffer.putFloat(this.aFloatArray7953[i]);
					bytebuffer.putFloat(this.aFloatArray7914[i]);
				}
				interface7_impl1.method63(0, bytebuffer.position(), (this.nativeToolkit.aLong8217));
			}
			this.aClass186_7930.anInterface7_Impl1_1902 = interface7_impl1;
			this.aClass186_7930.aBoolean1900 = true;
		}
		return bool_639_;
	}

	public int m() {
		return this.anInt7912;
	}

	int method4845(int i, int i_692_) {
		i_692_ = i_692_ * (i & 0x7f) >> 7;
		if (i_692_ < 2)
			i_692_ = 2;
		else if (i_692_ > 126)
			i_692_ = 126;
		return (i & 0xff80) + i_692_;
	}

	int method4846(int i, short i_693_, int i_694_) {
		int i_695_ = (this.nativeToolkit.anIntArray8215[method4845(i, i_694_)]);
		if (i_693_ != -1) {
			Class53 class53 = this.nativeToolkit.textures.method174(i_693_ & 0xffff);
			int i_696_ = class53.aByte533 & 0xff;
			if (i_696_ != 0) {
				int i_697_ = 131586 * i_694_;
				if (i_696_ == 256)
					i_695_ = i_697_;
				else {
					int i_698_ = i_696_;
					int i_699_ = 256 - i_696_;
					i_695_ = ((((i_697_ & 0xff00ff) * i_698_ + (i_695_ & 0xff00ff) * i_699_) & ~0xff00ff) + (((i_697_ & 0xff00) * i_698_ + (i_695_ & 0xff00) * i_699_) & 0xff0000)) >> 8;
				}
			}
			int i_700_ = class53.aByte534 & 0xff;
			if (i_700_ != 0) {
				i_700_ += 256;
				int i_701_ = ((i_695_ & 0xff0000) >> 16) * i_700_;
				if (i_701_ > 65535)
					i_701_ = 65535;
				int i_702_ = ((i_695_ & 0xff00) >> 8) * i_700_;
				if (i_702_ > 65535)
					i_702_ = 65535;
				int i_703_ = (i_695_ & 0xff) * i_700_;
				if (i_703_ > 65535)
					i_703_ = 65535;
				i_695_ = (i_701_ << 8 & 0xff0000) + (i_702_ & 0xff00) + (i_703_ >> 8);
			}
		}
		return i_695_ & 0xffffff;
	}

    public void method4742(byte i, byte[] is) {
		if (is == null) {
			for (int i_704_ = 0; i_704_ < this.anInt7916; i_704_++)
				this.aByteArray7963[i_704_] = i;
		} else {
			for (int i_705_ = 0; i_705_ < this.anInt7916; i_705_++) {
				int i_706_ = 255 - ((255 - (is[i_705_] & 0xff)) * (255 - (i & 0xff)) / 255);
				this.aByteArray7963[i_705_] = (byte) i_706_;
			}
		}
		method4838();
	}

    public int n() {
		if (!this.aBoolean7950)
			method4832();
		return this.anInt7928;
	}

    static float[] method4847(float[] fs, int i) {
		float[] fs_720_ = new float[i];
		System.arraycopy(fs, 0, fs_720_, 0, i);
		return fs_720_;
	}

    short method4848(BaseModel class64, int i, int i_735_, long l, int i_736_, int i_737_, int i_738_, int i_739_, float f, float f_740_) {
		int i_741_ = this.anIntArray7947[i];
		int i_742_ = this.anIntArray7947[i + 1];
		int i_743_ = 0;
		for (int i_744_ = i_741_; i_744_ < i_742_; i_744_++) {
			short i_745_ = this.aShortArray7948[i_744_];
			if (i_745_ == 0) {
				i_743_ = i_744_;
				break;
			}
			if (aLongArray7955[i_744_] == l)
				return (short) (i_745_ - 1);
		}
		this.aShortArray7948[i_743_] = (short) (this.anInt7906 + 1);
		aLongArray7955[i_743_] = l;
		this.aShortArray7908[(this.anInt7906)] = (short) i_735_;
		this.aShortArray7907[(this.anInt7906)] = (short) i;
		this.aShortArray7909[(this.anInt7906)] = (short) i_736_;
		this.aShortArray7910[(this.anInt7906)] = (short) i_737_;
		this.aShortArray7919[(this.anInt7906)] = (short) i_738_;
		this.aByteArray7958[this.anInt7906] = (byte) i_739_;
		this.aFloatArray7953[(this.anInt7906)] = f;
		this.aFloatArray7914[(this.anInt7906)] = f_740_;
		return (short) this.anInt7906++;
	}

	void method4849(Matrix4f matrix4f) {
		if (this.aClass191Array7952 != null) {
			this.nativeToolkit.RA(!this.aBoolean7893);
			Matrix43f class222 = (this.nativeToolkit.aClass222_8235);
			Class130 class130 = (this.nativeToolkit.aClass130_8249);
			for (int i = 0; i < this.anInt7951; i++) {
				Class191 class191 = this.aClass191Array7952[i];
				Class166 class166 = this.aClass166Array7892[i];
				if (!class191.aBoolean1945 || !this.nativeToolkit.method5054()) {
					float f = ((float) ((this.anIntArray7901[class191.anInt1951]) + (this.anIntArray7901[class191.anInt1946]) + (this.anIntArray7901[class191.anInt1944])) * 0.3333333F);
					float f_746_ = ((float) ((this.anIntArray7895[class191.anInt1951]) + (this.anIntArray7895[class191.anInt1946]) + (this.anIntArray7895[class191.anInt1944])) * 0.3333333F);
					float f_747_ = ((float) ((this.anIntArray7965[class191.anInt1951]) + (this.anIntArray7965[class191.anInt1946]) + (this.anIntArray7965[class191.anInt1944])) * 0.3333333F);
					float f_748_ = (matrix4f.aFloatArray2594[0] * f + matrix4f.aFloatArray2594[4] * f_746_ + matrix4f.aFloatArray2594[8] * f_747_ + matrix4f.aFloatArray2594[12]);
					float f_749_ = (matrix4f.aFloatArray2594[1] * f + matrix4f.aFloatArray2594[5] * f_746_ + matrix4f.aFloatArray2594[9] * f_747_ + matrix4f.aFloatArray2594[13]);
					float f_750_ = (matrix4f.aFloatArray2594[2] * f + matrix4f.aFloatArray2594[6] * f_746_ + matrix4f.aFloatArray2594[10] * f_747_ + matrix4f.aFloatArray2594[14]);
					float f_751_ = ((float) (1.0 / Math.sqrt((double) (f_748_ * f_748_ + f_749_ * f_749_ + f_750_ * f_750_))) * (float) class191.anInt1952);
					class222.method2056(class166.anInt1706, (class166.anInt1702 * class191.aShort1948) >> 7, (class166.anInt1701 * class191.aShort1949) >> 7, (f_748_ + (float) class166.anInt1704 - f_748_ * f_751_), (f_749_ + (float) class166.anInt1705 - f_749_ * f_751_), f_750_ - f_750_ * f_751_);
					class222.method2073(this.nativeToolkit.aClass222_8229);
					this.nativeToolkit.aMatrix4f_8204.method2145(class222);
					class130.method1452(this.nativeToolkit.aMatrix4f_8204);
					class130.aMatrix4f_1494.method2172();
					class130.colorValue = class166.anInt1703;
					class130.anInterface9_Impl2_1492 = this.nativeToolkit.aClass157_8351.method1698(class191.aShort1950);
					class130.method1451();
				}
			}
			this.nativeToolkit.RA(true);
		}
	}

    boolean ea() {
		if (this.anIntArrayArray7918 == null)
			return false;
		for (int i = 0; i < this.anInt7899; i++) {
			this.anIntArray7901[i] <<= 4;
			this.anIntArray7895[i] <<= 4;
			this.anIntArray7965[i] <<= 4;
		}
		anInt7902 = 0;
		anInt7937 = 0;
		anInt7956 = 0;
		return true;
	}

    public int ha() {
		if (!this.aBoolean7950)
			method4832();
		return this.anInt7943;
	}

    public int RA() {
		if (!this.aBoolean7950)
			method4832();
		return this.anInt7940;
	}

    public void S(int i) {
		int i_1718_ = CircleAngleTable.SINE[i];
		int i_1719_ = CircleAngleTable.COSINE[i];
		for (int i_1720_ = 0; i_1720_ < this.anInt7900; i_1720_++) {
			int i_1721_ = ((this.anIntArray7965[i_1720_] * i_1718_ + this.anIntArray7901[i_1720_] * i_1719_) >> 14);
			this.anIntArray7965[i_1720_] = ((this.anIntArray7965[i_1720_] * i_1719_ - this.anIntArray7901[i_1720_] * i_1718_) >> 14);
			this.anIntArray7901[i_1720_] = i_1721_;
		}
		for (int i_1722_ = 0; i_1722_ < this.anInt7906; i_1722_++) {
			int i_1723_ = ((this.aShortArray7919[i_1722_] * i_1718_ + (this.aShortArray7909[i_1722_] * i_1719_)) >> 14);
			this.aShortArray7919[i_1722_] = (short) (((this.aShortArray7919[i_1722_] * i_1719_) - (this.aShortArray7909[i_1722_] * i_1718_)) >> 14);
			this.aShortArray7909[i_1722_] = (short) i_1723_;
		}
		method4851();
		method4839();
		this.aBoolean7950 = false;
	}

    public void KA(int animationFlag) {
		if (this.aClass186_7927 != null)
			this.aClass186_7927.aBoolean1901 = Class154.method1685(animationFlag, this.anInt7896);
		if (this.aClass186_7930 != null)
			this.aClass186_7930.aBoolean1901 = Class154.method1692(animationFlag, this.anInt7896);
		if (this.aClass186_7911 != null)
			this.aClass186_7911.aBoolean1901 = Class154.method1680(animationFlag, this.anInt7896);
		if (this.aClass186_7934 != null)
			this.aClass186_7934.aBoolean1901 = Class154.method1669(animationFlag, this.anInt7896);
		this.anInt7912 = animationFlag;
		if (this.aClass185_7915 != null && (this.anInt7912 & 0x10000) == 0) {
			this.aShortArray7909 = (this.aClass185_7915.aShortArray1899);
			this.aShortArray7910 = (this.aClass185_7915.aShortArray1897);
			this.aShortArray7919 = (this.aClass185_7915.aShortArray1896);
			this.aByteArray7958 = (this.aClass185_7915.aByteArray1898);
			this.aClass185_7915 = null;
		}
		this.aBoolean7932 = true;
		method4837();
	}

    JavaGraphicsModelTookit(NativeToolkit class_ra_sub3, BaseModel class64, int i, int i_1831_, int i_1832_, int i_1833_) {
		this(class_ra_sub3, i, i_1833_, true, false);
		MaterialRawLoader interface_ma = class_ra_sub3.textures;
		int[] is = new int[class64.anInt621];
		this.anIntArray7947 = new int[class64.anInt626 + 1];
		for (int i_1834_ = 0; i_1834_ < class64.anInt621; i_1834_++) {
			if (class64.aByteArray625 == null || class64.aByteArray625[i_1834_] != 2) {
				if (class64.aShortArray617 != null && class64.aShortArray617[i_1834_] != -1) {
					Class53 class53 = interface_ma.method174((class64.aShortArray617[i_1834_]) & 0xffff);
					if (((this.anInt7896 & 0x40) == 0 || !class53.aBoolean524) && class53.aBoolean538)
						continue;
				}
				is[this.anInt7916++] = i_1834_;
				this.anIntArray7947[(class64.aShortArray644[i_1834_])]++;
				this.anIntArray7947[(class64.aShortArray646[i_1834_])]++;
				this.anIntArray7947[(class64.aShortArray624[i_1834_])]++;
			}
		}
		this.anInt7917 = this.anInt7916;
		long[] ls = new long[this.anInt7916];
		boolean bool = (this.anInt7912 & 0x100) != 0;
		for (int i_1835_ = 0; i_1835_ < this.anInt7916; i_1835_++) {
			int i_1836_ = is[i_1835_];
			Class53 class53 = null;
			int i_1837_ = 0;
			int i_1838_ = 0;
			int i_1839_ = 0;
			int i_1840_ = 0;
			if (class64.billboardConfigs != null) {
				boolean bool_1841_ = false;
				for (int i_1842_ = 0; i_1842_ < class64.billboardConfigs.length; i_1842_++) {
					BillboardConfig billboardConfig = class64.billboardConfigs[i_1842_];
					if (i_1836_ == billboardConfig.face * 1512514121) {
						Class173 class173 = BillboardConfig.method2844((billboardConfig.type * 1834782277));
						if (class173.aBoolean1757)
							bool_1841_ = true;
						if (class173.anInt1751 * 39181267 != -1) {
							Class53 class53_1843_ = interface_ma.method174((class173.anInt1751 * 39181267));
							if (class53_1843_.anInt528 * -2138060883 == 2)
								this.aBoolean7893 = true;
						}
					}
				}
				if (bool_1841_) {
					ls[i_1835_] = 9223372036854775807L;
					this.anInt7917--;
					continue;
				}
			}
			int i_1844_ = -1;
			if (class64.aShortArray617 != null) {
				i_1844_ = class64.aShortArray617[i_1836_];
				if (i_1844_ != -1) {
					class53 = interface_ma.method174(i_1844_ & 0xffff);
					if ((this.anInt7896 & 0x40) == 0 || !class53.aBoolean524) {
						i_1839_ = class53.aByte529;
						i_1840_ = class53.aByte536;
					} else {
						i_1844_ = -1;
						class53 = null;
					}
				}
			}
			boolean bool_1845_ = ((class64.aByteArray627 != null && class64.aByteArray627[i_1836_] != 0) || class53 != null && class53.anInt528 * -2138060883 != 0);
			if ((bool || bool_1845_) && class64.aByteArray633 != null)
				i_1837_ += class64.aByteArray633[i_1836_] << 17;
			if (bool_1845_)
				i_1837_ += 65536;
			i_1837_ += (i_1839_ & 0xff) << 8;
			i_1837_ += i_1840_ & 0xff;
			i_1838_ += (i_1844_ & 0xffff) << 16;
			i_1838_ += i_1835_ & 0xffff;
			ls[i_1835_] = ((long) i_1837_ << 32) + (long) i_1838_;
			this.aBoolean7893 |= bool_1845_;
			JavaGraphicsModelTookit javaGraphicsModelTookit_1846_ = this;
			javaGraphicsModelTookit_1846_.aBoolean7903 = (javaGraphicsModelTookit_1846_.aBoolean7903 | (class53 != null && (class53.aByte535 != 0 || class53.aByte509 != 0)));
		}
		Skybox.method2598(ls, is);
		this.anInt7899 = class64.anInt614;
		this.anInt7900 = class64.anInt626;
		this.anIntArray7901 = class64.anIntArray616;
		this.anIntArray7895 = class64.anIntArray642;
		this.anIntArray7965 = class64.anIntArray618;
		this.aShortArray7964 = class64.aShortArray620;
		Class184[] class184s = new Class184[this.anInt7900];
		this.aEmissiveTriangleArray7949 = class64.aEmissiveTriangleArray647;
		this.aEffectiveVertexArray7904 = class64.aEffectiveVertexArray613;
		if (class64.billboardConfigs != null) {
			this.anInt7951 = class64.billboardConfigs.length;
			this.aClass191Array7952 = new Class191[this.anInt7951];
			this.aClass166Array7892 = new Class166[this.anInt7951];
			for (int i_1847_ = 0; i_1847_ < this.anInt7951; i_1847_++) {
				BillboardConfig billboardConfig = class64.billboardConfigs[i_1847_];
				Class173 class173 = BillboardConfig.method2844(billboardConfig.type * 1834782277);
				int i_1848_ = -1;
				for (int i_1849_ = 0; i_1849_ < this.anInt7916; i_1849_++) {
					if (is[i_1849_] == billboardConfig.face * 1512514121) {
						i_1848_ = i_1849_;
						break;
					}
				}
				int i_1850_ = ((Class294.anIntArray3165[(class64.aShortArray629[billboardConfig.face * 1512514121] & 0xffff)]) & 0xffffff);
				i_1850_ = i_1850_ | 255 - (class64.aByteArray627 != null ? (class64.aByteArray627[billboardConfig.face * 1512514121]) : 0) << 24;
				this.aClass191Array7952[i_1847_] = (new Class191(i_1848_, class64.aShortArray644[billboardConfig.face * 1512514121], class64.aShortArray646[billboardConfig.face * 1512514121], class64.aShortArray624[billboardConfig.face * 1512514121], class173.anInt1755 * 1951943953, class173.anInt1753 * 893949695, class173.anInt1751 * 39181267, class173.anInt1752 * -310074719, class173.anInt1754 * 1092922159, class173.aBoolean1757, class173.aBoolean1748, billboardConfig.magnitude * 2010148771));
				this.aClass166Array7892[i_1847_] = new Class166(i_1850_);
			}
		}
		int i_1851_ = this.anInt7916 * 3;
		this.aShortArray7907 = new short[i_1851_];
		this.aShortArray7908 = new short[i_1851_];
		this.aShortArray7909 = new short[i_1851_];
		this.aShortArray7910 = new short[i_1851_];
		this.aShortArray7919 = new short[i_1851_];
		this.aByteArray7958 = new byte[i_1851_];
		this.aFloatArray7953 = new float[i_1851_];
		this.aFloatArray7914 = new float[i_1851_];
		this.aShortArray7935 = new short[this.anInt7916];
		this.aByteArray7963 = new byte[this.anInt7916];
		this.aShortArray7920 = new short[this.anInt7916];
		this.aShortArray7921 = new short[this.anInt7916];
		this.aShortArray7922 = new short[this.anInt7916];
		this.aShortArray7923 = new short[this.anInt7916];
		if (class64.aShortArray615 != null)
			this.aShortArray7925 = new short[this.anInt7916];
		this.aShort7897 = (short) i_1831_;
		this.aShort7898 = (short) i_1832_;
		this.aShortArray7948 = new short[i_1851_];
		aLongArray7955 = new long[i_1851_];
		int i_1852_ = 0;
		for (int i_1853_ = 0; i_1853_ < class64.anInt626; i_1853_++) {
			int i_1854_ = this.anIntArray7947[i_1853_];
			this.anIntArray7947[i_1853_] = i_1852_;
			i_1852_ += i_1854_;
			class184s[i_1853_] = new Class184();
		}
		this.anIntArray7947[class64.anInt626] = i_1852_;
		Class76 class76 = method4785(class64, is, this.anInt7916);
		Class189[] class189s = new Class189[class64.anInt621];
		for (int i_1855_ = 0; i_1855_ < class64.anInt621; i_1855_++) {
			short i_1856_ = class64.aShortArray644[i_1855_];
			short i_1857_ = class64.aShortArray646[i_1855_];
			short i_1858_ = class64.aShortArray624[i_1855_];
			int i_1859_ = (this.anIntArray7901[i_1857_] - this.anIntArray7901[i_1856_]);
			int i_1860_ = (this.anIntArray7895[i_1857_] - this.anIntArray7895[i_1856_]);
			int i_1861_ = (this.anIntArray7965[i_1857_] - this.anIntArray7965[i_1856_]);
			int i_1862_ = (this.anIntArray7901[i_1858_] - this.anIntArray7901[i_1856_]);
			int i_1863_ = (this.anIntArray7895[i_1858_] - this.anIntArray7895[i_1856_]);
			int i_1864_ = (this.anIntArray7965[i_1858_] - this.anIntArray7965[i_1856_]);
			int i_1865_ = i_1860_ * i_1864_ - i_1863_ * i_1861_;
			int i_1866_ = i_1861_ * i_1862_ - i_1864_ * i_1859_;
			int i_1867_;
			for (i_1867_ = i_1859_ * i_1863_ - i_1862_ * i_1860_; (i_1865_ > 8192 || i_1866_ > 8192 || i_1867_ > 8192 || i_1865_ < -8192 || i_1866_ < -8192 || i_1867_ < -8192); i_1867_ >>= 1) {
				i_1865_ >>= 1;
				i_1866_ >>= 1;
			}
			int i_1868_ = (int) Math.sqrt((double) (i_1865_ * i_1865_ + i_1866_ * i_1866_ + i_1867_ * i_1867_));
			if (i_1868_ <= 0)
				i_1868_ = 1;
			i_1865_ = i_1865_ * 256 / i_1868_;
			i_1866_ = i_1866_ * 256 / i_1868_;
			i_1867_ = i_1867_ * 256 / i_1868_;
			byte i_1869_ = (class64.aByteArray625 == null ? (byte) 0 : class64.aByteArray625[i_1855_]);
			if (i_1869_ == 0) {
				Class184 class184 = class184s[i_1856_];
				class184.anInt1894 += i_1865_;
				class184.anInt1893 += i_1866_;
				class184.anInt1892 += i_1867_;
				class184.anInt1895++;
				class184 = class184s[i_1857_];
				class184.anInt1894 += i_1865_;
				class184.anInt1893 += i_1866_;
				class184.anInt1892 += i_1867_;
				class184.anInt1895++;
				class184 = class184s[i_1858_];
				class184.anInt1894 += i_1865_;
				class184.anInt1893 += i_1866_;
				class184.anInt1892 += i_1867_;
				class184.anInt1895++;
			} else if (i_1869_ == 1) {
				Class189 class189 = class189s[i_1855_] = new Class189();
				class189.anInt1915 = i_1865_;
				class189.anInt1916 = i_1866_;
				class189.anInt1914 = i_1867_;
			}
		}
		for (int i_1870_ = 0; i_1870_ < this.anInt7916; i_1870_++) {
			int i_1871_ = is[i_1870_];
			int i_1872_ = class64.aShortArray629[i_1871_] & 0xffff;
			int i_1873_;
			if (class64.aByteArray635 == null)
				i_1873_ = -1;
			else
				i_1873_ = class64.aByteArray635[i_1871_];
			int i_1874_;
			if (class64.aByteArray627 == null)
				i_1874_ = 0;
			else
				i_1874_ = class64.aByteArray627[i_1871_] & 0xff;
			short i_1875_ = (class64.aShortArray617 == null ? (short) -1 : class64.aShortArray617[i_1871_]);
			if (i_1875_ != -1 && (this.anInt7896 & 0x40) != 0) {
				Class53 class53 = interface_ma.method174(i_1875_ & 0xffff);
				if (class53.aBoolean524)
					i_1875_ = (short) -1;
			}
			float f = 0.0F;
			float f_1876_ = 0.0F;
			float f_1877_ = 0.0F;
			float f_1878_ = 0.0F;
			float f_1879_ = 0.0F;
			float f_1880_ = 0.0F;
			int i_1881_ = 0;
			int i_1882_ = 0;
			int i_1883_ = 0;
			if (i_1875_ != -1) {
				if (i_1873_ == -1) {
					f = 0.0F;
					f_1876_ = 1.0F;
					f_1877_ = 1.0F;
					f_1878_ = 1.0F;
					i_1881_ = 1;
					f_1879_ = 0.0F;
					f_1880_ = 0.0F;
					i_1882_ = 2;
				} else {
					i_1873_ &= 0xff;
					byte i_1884_ = class64.aByteArray622[i_1873_];
					if (i_1884_ == 0) {
						short i_1885_ = class64.aShortArray644[i_1871_];
						short i_1886_ = class64.aShortArray646[i_1871_];
						short i_1887_ = class64.aShortArray624[i_1871_];
						short i_1888_ = class64.aShortArray623[i_1873_];
						short i_1889_ = class64.aShortArray636[i_1873_];
						short i_1890_ = class64.aShortArray638[i_1873_];
						float f_1891_ = (float) class64.anIntArray616[i_1888_];
						float f_1892_ = (float) class64.anIntArray642[i_1888_];
						float f_1893_ = (float) class64.anIntArray618[i_1888_];
						float f_1894_ = (float) class64.anIntArray616[i_1889_] - f_1891_;
						float f_1895_ = (float) class64.anIntArray642[i_1889_] - f_1892_;
						float f_1896_ = (float) class64.anIntArray618[i_1889_] - f_1893_;
						float f_1897_ = (float) class64.anIntArray616[i_1890_] - f_1891_;
						float f_1898_ = (float) class64.anIntArray642[i_1890_] - f_1892_;
						float f_1899_ = (float) class64.anIntArray618[i_1890_] - f_1893_;
						float f_1900_ = (float) class64.anIntArray616[i_1885_] - f_1891_;
						float f_1901_ = (float) class64.anIntArray642[i_1885_] - f_1892_;
						float f_1902_ = (float) class64.anIntArray618[i_1885_] - f_1893_;
						float f_1903_ = (float) class64.anIntArray616[i_1886_] - f_1891_;
						float f_1904_ = (float) class64.anIntArray642[i_1886_] - f_1892_;
						float f_1905_ = (float) class64.anIntArray618[i_1886_] - f_1893_;
						float f_1906_ = (float) class64.anIntArray616[i_1887_] - f_1891_;
						float f_1907_ = (float) class64.anIntArray642[i_1887_] - f_1892_;
						float f_1908_ = (float) class64.anIntArray618[i_1887_] - f_1893_;
						float f_1909_ = f_1895_ * f_1899_ - f_1896_ * f_1898_;
						float f_1910_ = f_1896_ * f_1897_ - f_1894_ * f_1899_;
						float f_1911_ = f_1894_ * f_1898_ - f_1895_ * f_1897_;
						float f_1912_ = f_1898_ * f_1911_ - f_1899_ * f_1910_;
						float f_1913_ = f_1899_ * f_1909_ - f_1897_ * f_1911_;
						float f_1914_ = f_1897_ * f_1910_ - f_1898_ * f_1909_;
						float f_1915_ = 1.0F / (f_1912_ * f_1894_ + f_1913_ * f_1895_ + f_1914_ * f_1896_);
						f = (f_1912_ * f_1900_ + f_1913_ * f_1901_ + f_1914_ * f_1902_) * f_1915_;
						f_1877_ = (f_1912_ * f_1903_ + f_1913_ * f_1904_ + f_1914_ * f_1905_) * f_1915_;
						f_1879_ = (f_1912_ * f_1906_ + f_1913_ * f_1907_ + f_1914_ * f_1908_) * f_1915_;
						f_1912_ = f_1895_ * f_1911_ - f_1896_ * f_1910_;
						f_1913_ = f_1896_ * f_1909_ - f_1894_ * f_1911_;
						f_1914_ = f_1894_ * f_1910_ - f_1895_ * f_1909_;
						f_1915_ = 1.0F / (f_1912_ * f_1897_ + f_1913_ * f_1898_ + f_1914_ * f_1899_);
						f_1876_ = (f_1912_ * f_1900_ + f_1913_ * f_1901_ + f_1914_ * f_1902_) * f_1915_;
						f_1878_ = (f_1912_ * f_1903_ + f_1913_ * f_1904_ + f_1914_ * f_1905_) * f_1915_;
						f_1880_ = (f_1912_ * f_1906_ + f_1913_ * f_1907_ + f_1914_ * f_1908_) * f_1915_;
					} else {
						short i_1916_ = class64.aShortArray644[i_1871_];
						short i_1917_ = class64.aShortArray646[i_1871_];
						short i_1918_ = class64.aShortArray624[i_1871_];
						int i_1919_ = class76.anIntArray713[i_1873_];
						int i_1920_ = class76.anIntArray710[i_1873_];
						int i_1921_ = class76.anIntArray709[i_1873_];
						float[] fs = class76.aFloatArrayArray711[i_1873_];
						byte i_1922_ = class64.aByteArray628[i_1873_];
						float f_1923_ = (float) class64.anIntArray637[i_1873_] / 256.0F;
						if (i_1884_ == 1) {
							float f_1924_ = ((float) class64.anIntArray641[i_1873_] / 1024.0F);
							method4744(class64.anIntArray616[i_1916_], class64.anIntArray642[i_1916_], class64.anIntArray618[i_1916_], i_1919_, i_1920_, i_1921_, fs, f_1924_, i_1922_, f_1923_, aFloatArray7962);
							f = aFloatArray7962[0];
							f_1876_ = aFloatArray7962[1];
							method4744(class64.anIntArray616[i_1917_], class64.anIntArray642[i_1917_], class64.anIntArray618[i_1917_], i_1919_, i_1920_, i_1921_, fs, f_1924_, i_1922_, f_1923_, aFloatArray7962);
							f_1877_ = aFloatArray7962[0];
							f_1878_ = aFloatArray7962[1];
							method4744(class64.anIntArray616[i_1918_], class64.anIntArray642[i_1918_], class64.anIntArray618[i_1918_], i_1919_, i_1920_, i_1921_, fs, f_1924_, i_1922_, f_1923_, aFloatArray7962);
							f_1879_ = aFloatArray7962[0];
							f_1880_ = aFloatArray7962[1];
							float f_1925_ = f_1924_ / 2.0F;
							if ((i_1922_ & 0x1) == 0) {
								if (f_1877_ - f > f_1925_) {
									f_1877_ -= f_1924_;
									i_1881_ = 1;
								} else if (f - f_1877_ > f_1925_) {
									f_1877_ += f_1924_;
									i_1881_ = 2;
								}
								if (f_1879_ - f > f_1925_) {
									f_1879_ -= f_1924_;
									i_1882_ = 1;
								} else if (f - f_1879_ > f_1925_) {
									f_1879_ += f_1924_;
									i_1882_ = 2;
								}
							} else {
								if (f_1878_ - f_1876_ > f_1925_) {
									f_1878_ -= f_1924_;
									i_1881_ = 1;
								} else if (f_1876_ - f_1878_ > f_1925_) {
									f_1878_ += f_1924_;
									i_1881_ = 2;
								}
								if (f_1880_ - f_1876_ > f_1925_) {
									f_1880_ -= f_1924_;
									i_1882_ = 1;
								} else if (f_1876_ - f_1880_ > f_1925_) {
									f_1880_ += f_1924_;
									i_1882_ = 2;
								}
							}
						} else if (i_1884_ == 2) {
							float f_1926_ = ((float) class64.anIntArray643[i_1873_] / 256.0F);
							float f_1927_ = ((float) class64.anIntArray648[i_1873_] / 256.0F);
							int i_1928_ = (class64.anIntArray616[i_1917_] - class64.anIntArray616[i_1916_]);
							int i_1929_ = (class64.anIntArray642[i_1917_] - class64.anIntArray642[i_1916_]);
							int i_1930_ = (class64.anIntArray618[i_1917_] - class64.anIntArray618[i_1916_]);
							int i_1931_ = (class64.anIntArray616[i_1918_] - class64.anIntArray616[i_1916_]);
							int i_1932_ = (class64.anIntArray642[i_1918_] - class64.anIntArray642[i_1916_]);
							int i_1933_ = (class64.anIntArray618[i_1918_] - class64.anIntArray618[i_1916_]);
							int i_1934_ = i_1929_ * i_1933_ - i_1932_ * i_1930_;
							int i_1935_ = i_1930_ * i_1931_ - i_1933_ * i_1928_;
							int i_1936_ = i_1928_ * i_1932_ - i_1931_ * i_1929_;
							float f_1937_ = (64.0F / (float) class64.anIntArray639[i_1873_]);
							float f_1938_ = (64.0F / (float) class64.anIntArray640[i_1873_]);
							float f_1939_ = (64.0F / (float) class64.anIntArray641[i_1873_]);
							float f_1940_ = (((float) i_1934_ * fs[0] + (float) i_1935_ * fs[1] + (float) i_1936_ * fs[2]) / f_1937_);
							float f_1941_ = (((float) i_1934_ * fs[3] + (float) i_1935_ * fs[4] + (float) i_1936_ * fs[5]) / f_1938_);
							float f_1942_ = (((float) i_1934_ * fs[6] + (float) i_1935_ * fs[7] + (float) i_1936_ * fs[8]) / f_1939_);
							i_1883_ = method4729(f_1940_, f_1941_, f_1942_);
							method4730(class64.anIntArray616[i_1916_], class64.anIntArray642[i_1916_], class64.anIntArray618[i_1916_], i_1919_, i_1920_, i_1921_, i_1883_, fs, i_1922_, f_1923_, f_1926_, f_1927_, aFloatArray7962);
							f = aFloatArray7962[0];
							f_1876_ = aFloatArray7962[1];
							method4730(class64.anIntArray616[i_1917_], class64.anIntArray642[i_1917_], class64.anIntArray618[i_1917_], i_1919_, i_1920_, i_1921_, i_1883_, fs, i_1922_, f_1923_, f_1926_, f_1927_, aFloatArray7962);
							f_1877_ = aFloatArray7962[0];
							f_1878_ = aFloatArray7962[1];
							method4730(class64.anIntArray616[i_1918_], class64.anIntArray642[i_1918_], class64.anIntArray618[i_1918_], i_1919_, i_1920_, i_1921_, i_1883_, fs, i_1922_, f_1923_, f_1926_, f_1927_, aFloatArray7962);
							f_1879_ = aFloatArray7962[0];
							f_1880_ = aFloatArray7962[1];
						} else if (i_1884_ == 3) {
							method4780(class64.anIntArray616[i_1916_], class64.anIntArray642[i_1916_], class64.anIntArray618[i_1916_], i_1919_, i_1920_, i_1921_, fs, i_1922_, f_1923_, aFloatArray7962);
							f = aFloatArray7962[0];
							f_1876_ = aFloatArray7962[1];
							method4780(class64.anIntArray616[i_1917_], class64.anIntArray642[i_1917_], class64.anIntArray618[i_1917_], i_1919_, i_1920_, i_1921_, fs, i_1922_, f_1923_, aFloatArray7962);
							f_1877_ = aFloatArray7962[0];
							f_1878_ = aFloatArray7962[1];
							method4780(class64.anIntArray616[i_1918_], class64.anIntArray642[i_1918_], class64.anIntArray618[i_1918_], i_1919_, i_1920_, i_1921_, fs, i_1922_, f_1923_, aFloatArray7962);
							f_1879_ = aFloatArray7962[0];
							f_1880_ = aFloatArray7962[1];
							if ((i_1922_ & 0x1) == 0) {
								if (f_1877_ - f > 0.5F) {
									f_1877_--;
									i_1881_ = 1;
								} else if (f - f_1877_ > 0.5F) {
									f_1877_++;
									i_1881_ = 2;
								}
								if (f_1879_ - f > 0.5F) {
									f_1879_--;
									i_1882_ = 1;
								} else if (f - f_1879_ > 0.5F) {
									f_1879_++;
									i_1882_ = 2;
								}
							} else {
								if (f_1878_ - f_1876_ > 0.5F) {
									f_1878_--;
									i_1881_ = 1;
								} else if (f_1876_ - f_1878_ > 0.5F) {
									f_1878_++;
									i_1881_ = 2;
								}
								if (f_1880_ - f_1876_ > 0.5F) {
									f_1880_--;
									i_1882_ = 1;
								} else if (f_1876_ - f_1880_ > 0.5F) {
									f_1880_++;
									i_1882_ = 2;
								}
							}
						}
					}
				}
			}
			byte i_1943_;
			if (class64.aByteArray625 == null)
				i_1943_ = (byte) 0;
			else
				i_1943_ = class64.aByteArray625[i_1871_];
			if (i_1943_ == 0) {
				long l = ((long) (i_1873_ << 2) + (((long) (i_1883_ << 24) + (long) (i_1872_ << 8) + (long) i_1874_) << 32));
				short i_1944_ = class64.aShortArray644[i_1871_];
				short i_1945_ = class64.aShortArray646[i_1871_];
				short i_1946_ = class64.aShortArray624[i_1871_];
				Class184 class184 = class184s[i_1944_];
				this.aShortArray7920[i_1870_] = method4848(class64, i_1944_, i_1870_, l, class184.anInt1894, class184.anInt1893, class184.anInt1892, class184.anInt1895, f, f_1876_);
				class184 = class184s[i_1945_];
				this.aShortArray7921[i_1870_] = method4848(class64, i_1945_, i_1870_, l + (long) i_1881_, class184.anInt1894, class184.anInt1893, class184.anInt1892, class184.anInt1895, f_1877_, f_1878_);
				class184 = class184s[i_1946_];
				this.aShortArray7922[i_1870_] = method4848(class64, i_1946_, i_1870_, l + (long) i_1882_, class184.anInt1894, class184.anInt1893, class184.anInt1892, class184.anInt1895, f_1879_, f_1880_);
			} else if (i_1943_ == 1) {
				Class189 class189 = class189s[i_1871_];
				long l = ((long) ((i_1873_ << 2) + (class189.anInt1915 > 0 ? 1024 : 2048) + (class189.anInt1916 + 256 << 12) + (class189.anInt1914 + 256 << 22)) + (((long) (i_1883_ << 24) + (long) (i_1872_ << 8) + (long) i_1874_) << 32));
				this.aShortArray7920[i_1870_] = method4848(class64, class64.aShortArray644[i_1871_], i_1870_, l, class189.anInt1915, class189.anInt1916, class189.anInt1914, 0, f, f_1876_);
				this.aShortArray7921[i_1870_] = method4848(class64, class64.aShortArray646[i_1871_], i_1870_, l + (long) i_1881_, class189.anInt1915, class189.anInt1916, class189.anInt1914, 0, f_1877_, f_1878_);
				this.aShortArray7922[i_1870_] = method4848(class64, class64.aShortArray624[i_1871_], i_1870_, l + (long) i_1882_, class189.anInt1915, class189.anInt1916, class189.anInt1914, 0, f_1879_, f_1880_);
			}
			if (class64.aByteArray627 != null)
				this.aByteArray7963[i_1870_] = class64.aByteArray627[i_1871_];
			if (class64.aShortArray615 != null)
				this.aShortArray7925[i_1870_] = class64.aShortArray615[i_1871_];
			this.aShortArray7935[i_1870_] = class64.aShortArray629[i_1871_];
			this.aShortArray7923[i_1870_] = i_1875_;
		}
		if (this.anInt7917 > 0) {
			int i_1947_ = 1;
			short i_1948_ = this.aShortArray7923[0];
			for (int i_1949_ = 0; i_1949_ < this.anInt7917; i_1949_++) {
				short i_1950_ = this.aShortArray7923[i_1949_];
				if (i_1950_ != i_1948_) {
					i_1947_++;
					i_1948_ = i_1950_;
				}
			}
			this.anIntArray7945 = new int[i_1947_];
			this.anIntArray7913 = new int[i_1947_];
			this.anIntArray7944 = new int[i_1947_ + 1];
			this.anIntArray7944[0] = 0;
			int i_1951_ = this.anInt7906;
			int i_1952_ = 0;
			i_1947_ = 0;
			i_1948_ = this.aShortArray7923[0];
			for (int i_1953_ = 0; i_1953_ < this.anInt7917; i_1953_++) {
				short i_1954_ = this.aShortArray7923[i_1953_];
				if (i_1954_ != i_1948_) {
					this.anIntArray7945[i_1947_] = i_1951_;
					this.anIntArray7913[i_1947_] = i_1952_ - i_1951_ + 1;
					this.anIntArray7944[++i_1947_] = i_1953_;
					i_1951_ = this.anInt7906;
					i_1952_ = 0;
					i_1948_ = i_1954_;
				}
				int i_1955_ = this.aShortArray7920[i_1953_];
				if (i_1955_ < i_1951_)
					i_1951_ = i_1955_;
				if (i_1955_ > i_1952_)
					i_1952_ = i_1955_;
				i_1955_ = this.aShortArray7921[i_1953_];
				if (i_1955_ < i_1951_)
					i_1951_ = i_1955_;
				if (i_1955_ > i_1952_)
					i_1952_ = i_1955_;
				i_1955_ = this.aShortArray7922[i_1953_];
				if (i_1955_ < i_1951_)
					i_1951_ = i_1955_;
				if (i_1955_ > i_1952_)
					i_1952_ = i_1955_;
			}
			this.anIntArray7945[i_1947_] = i_1951_;
			this.anIntArray7913[i_1947_] = i_1952_ - i_1951_ + 1;
			this.anIntArray7944[++i_1947_] = this.anInt7917;
		}
		aLongArray7955 = null;
		this.aShortArray7907 = method4834(this.aShortArray7907, this.anInt7906);
		this.aShortArray7908 = method4834(this.aShortArray7908, this.anInt7906);
		this.aShortArray7909 = method4834(this.aShortArray7909, this.anInt7906);
		this.aShortArray7910 = method4834(this.aShortArray7910, this.anInt7906);
		this.aShortArray7919 = method4834(this.aShortArray7919, this.anInt7906);
		this.aByteArray7958 = method4833(this.aByteArray7958, this.anInt7906);
		this.aFloatArray7953 = method4847(this.aFloatArray7953, this.anInt7906);
		this.aFloatArray7914 = method4847(this.aFloatArray7914, this.anInt7906);
		if (class64.anIntArray619 != null && Class154.method1678(i, this.anInt7896))
			this.anIntArrayArray7918 = class64.method749(false);
		if (class64.billboardConfigs != null && Class154.method1679(i, this.anInt7896))
			this.anIntArrayArray7946 = class64.method759();
		if (class64.anIntArray631 != null && Class154.method1677(i, this.anInt7896)) {
			int i_1956_ = 0;
			int[] is_1957_ = new int[256];
			for (int i_1958_ = 0; i_1958_ < this.anInt7916; i_1958_++) {
				int i_1959_ = class64.anIntArray631[is[i_1958_]];
				if (i_1959_ >= 0) {
					is_1957_[i_1959_]++;
					if (i_1959_ > i_1956_)
						i_1956_ = i_1959_;
				}
			}
			this.anIntArrayArray7924 = new int[i_1956_ + 1][];
			for (int i_1960_ = 0; i_1960_ <= i_1956_; i_1960_++) {
				this.anIntArrayArray7924[i_1960_] = new int[is_1957_[i_1960_]];
				is_1957_[i_1960_] = 0;
			}
			for (int i_1961_ = 0; i_1961_ < this.anInt7916; i_1961_++) {
				int i_1962_ = class64.anIntArray631[is[i_1961_]];
				if (i_1962_ >= 0)
					this.anIntArrayArray7924[i_1962_][is_1957_[i_1962_]++] = i_1961_;
			}
		}
	}

    public Class_na ga(Class_na class_na) {
		if (this.anInt7906 == 0)
			return null;
		if (!this.aBoolean7950)
			method4832();
		int i;
		int i_1963_;
		if ((this.nativeToolkit.anInt8299) > 0) {
			i = ((this.anInt7940 - ((this.anInt7939 * this.nativeToolkit.anInt8299) >> 8)) >> this.nativeToolkit.anInt8313);
			i_1963_ = ((this.anInt7941 - ((this.anInt7938 * this.nativeToolkit.anInt8299) >> 8)) >> this.nativeToolkit.anInt8313);
		} else {
			i = ((this.anInt7940 - ((this.anInt7938 * this.nativeToolkit.anInt8299) >> 8)) >> this.nativeToolkit.anInt8313);
			i_1963_ = ((this.anInt7941 - ((this.anInt7939 * this.nativeToolkit.anInt8299) >> 8)) >> this.nativeToolkit.anInt8313);
		}
		int i_1964_;
		int i_1965_;
		if ((this.nativeToolkit.anInt8317) > 0) {
			i_1964_ = ((this.anInt7942 - ((this.anInt7939 * this.nativeToolkit.anInt8317) >> 8)) >> this.nativeToolkit.anInt8313);
			i_1965_ = ((this.anInt7943 - ((this.anInt7938 * this.nativeToolkit.anInt8317) >> 8)) >> this.nativeToolkit.anInt8313);
		} else {
			i_1964_ = ((this.anInt7942 - ((this.anInt7938 * this.nativeToolkit.anInt8317) >> 8)) >> this.nativeToolkit.anInt8313);
			i_1965_ = ((this.anInt7943 - ((this.anInt7939 * this.nativeToolkit.anInt8317) >> 8)) >> this.nativeToolkit.anInt8313);
		}
		int i_1966_ = i_1963_ - i + 1;
		int i_1967_ = i_1965_ - i_1964_ + 1;
		Class_na_Sub2 class_na_sub2 = (Class_na_Sub2) class_na;
		Class_na_Sub2 class_na_sub2_1968_;
		if (class_na_sub2 != null && class_na_sub2.method3489(i_1966_, i_1967_)) {
			class_na_sub2_1968_ = class_na_sub2;
			class_na_sub2_1968_.method3487();
		} else
			class_na_sub2_1968_ = new Class_na_Sub2(this.nativeToolkit, i_1966_, i_1967_);
		class_na_sub2_1968_.method3486(i, i_1964_, i_1963_, i_1965_);
		method4842(class_na_sub2_1968_);
		return class_na_sub2_1968_;
	}

    public int N() {
		if (!this.aBoolean7950)
			method4832();
		return this.anInt7936;
	}

    public void X(short i, short i_1984_) {
		for (int i_1985_ = 0; i_1985_ < this.anInt7916; i_1985_++) {
			if (this.aShortArray7935[i_1985_] == i)
				this.aShortArray7935[i_1985_] = i_1984_;
		}
		if (this.aClass191Array7952 != null) {
			for (int i_1986_ = 0; i_1986_ < this.anInt7951; i_1986_++) {
				Class191 class191 = this.aClass191Array7952[i_1986_];
				Class166 class166 = this.aClass166Array7892[i_1986_];
				class166.anInt1703 = (class166.anInt1703 & ~0xffffff | ((Class294.anIntArray3165[(this.aShortArray7935[class191.anInt1947]) & 0xffff]) & 0xffffff));
			}
		}
		method4838();
	}

    void method4733() {
		/* empty */
	}

    void method4850() {
		if (this.aClass186_7927 != null)
			this.aClass186_7927.method1849();
		if (this.aClass186_7930 != null)
			this.aClass186_7930.method1849();
		if (this.aClass186_7911 != null)
			this.aClass186_7911.method1849();
		if (this.aClass186_7934 != null)
			this.aClass186_7934.method1849();
		if (this.aClass167_7926 != null)
			this.aClass167_7926.method1788();
	}

	public void p(int i) {
		this.aShort7897 = (short) i;
		method4838();
	}

	public int o() {
		if (!this.aBoolean7950)
			method4832();
		return this.anInt7939;
	}

	void method4851() {
		if (this.aClass186_7927 != null)
			this.aClass186_7927.aBoolean1900 = false;
	}

    public void wa() {
		for (int i = 0; i < this.anInt7900; i++)
			this.anIntArray7965[i] = -this.anIntArray7965[i];
		for (int i = 0; i < this.anInt7906; i++)
			this.aShortArray7919[i] = (short) -this.aShortArray7919[i];
		for (int i = 0; i < this.anInt7916; i++) {
			short i_2045_ = this.aShortArray7920[i];
			this.aShortArray7920[i] = this.aShortArray7922[i];
			this.aShortArray7922[i] = i_2045_;
		}
		method4851();
		method4839();
		method4840();
		this.aBoolean7950 = false;
	}

}
