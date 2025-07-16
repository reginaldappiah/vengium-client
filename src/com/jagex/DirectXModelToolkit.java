package com.jagex;/* DirectXModelToolkit - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.definition.animation.AnimationFrameBase;
import com.jagex.maths.Matrix43f;
import com.jagex.maths.Matrix4f;

public class DirectXModelToolkit extends ModelToolkit {
	boolean aBoolean7733;
	int[] anIntArray7734;
	Class15 aClass15_7735;
	Class15 aClass15_7736;
	Class2 aClass2_7737;
	float[][] aFloatArrayArray7738;
	short aShort7739;
	Class5[] aClass5Array7740;
	int anInt7742;
	short aShort7743;
	float[] aFloatArray7745;
	int animationFlag;
	int anInt7747;
	int anInt7748;
	EmissiveTriangle[] aEmissiveTriangleArray7750;
	int[] anIntArray7751;
	int[] anIntArray7752;
	int[] anIntArray7753;
	EffectiveVertex[] aEffectiveVertexArray7754;
	Class1[] aClass1Array7755;
	boolean aBoolean7756;
	int anInt7757;
	short[] aShortArray7758;
	short[] aShortArray7759;
	short[] aShortArray7760;
	int[] anIntArray7761;
	float[][] aFloatArrayArray7762;
	int[] anIntArray7763;
	int[] anIntArray7764;
	JavaGraphicsToolkit javaGraphicsToolkit;
	short aShort7770;
	byte[] aByteArray7771;
	byte[] aByteArray7772;
	byte[] aByteArray7773;
	short[] aShortArray7774;
	short[] aShortArray7775;
	short[] aShortArray7776;
	boolean aBoolean7777;
	int[][] anIntArrayArray7778;
	int[][] anIntArrayArray7779;
	boolean aBoolean7780;
	int anInt7781;
	int anInt7782;
	int anInt7783;
	float[] aFloatArray7784;
	boolean aBoolean7785;
	Class1[] aClass1Array7786;
	static int anInt7787;
	int anInt7788;
	Class16[] aClass16Array7789;
	Class18[] aClass18Array7790;
	int[][] anIntArrayArray7791;
	boolean aBoolean7792;
	int[] anIntArray7793;
	short aShort7794;
	short aShort7795;
	short aShort7796;
	short aShort7797;
	int anInt7799;
	short aShort7800;
	int[] anIntArray7801;
	short[] aShortArray7803;
	DirectXModelToolkit[] aDirectXModelToolkitArray7804;
	static int anInt7805;
	float[] aFloatArray7806;
	float[] aFloatArray7807;
	boolean aBoolean7808 = false;
	int[] anIntArray7809;
	static int anInt7810 = 4096;
	int[] anIntArray7811;
	int anInt7812;
	int[] anIntArray7813;
	int[] anIntArray7814;
	DirectXModelToolkit[] aDirectXModelToolkitArray7815;
	short[] aShortArray7816;

    DirectXModelToolkit(JavaGraphicsToolkit class_ra_sub1, BaseModel class64, int i, int i_0_, int i_1_, int i_2_) {
		this.anInt7799 = 0;
		this.anInt7742 = 0;
		this.anInt7757 = 0;
		this.anInt7812 = 0;
		this.aBoolean7780 = false;
		this.aBoolean7785 = false;
		this.aBoolean7792 = false;
		this.aBoolean7756 = false;
		this.aBoolean7777 = false;
		this.javaGraphicsToolkit = class_ra_sub1;
		this.animationFlag = i;
		this.anInt7747 = i_0_;
		this.anInt7748 = i_1_;
		MaterialRawLoader interface_ma = this.javaGraphicsToolkit.textures;
		this.anInt7799 = class64.anInt614;
		this.anInt7742 = class64.anInt626;
		this.anIntArray7751 = class64.anIntArray616;
		this.anIntArray7752 = class64.anIntArray642;
		this.anIntArray7753 = class64.anIntArray618;
		this.anInt7757 = class64.anInt621;
		this.aShortArray7758 = class64.aShortArray644;
		this.aShortArray7759 = class64.aShortArray646;
		this.aShortArray7760 = class64.aShortArray624;
		this.aByteArray7772 = class64.aByteArray633;
		this.aShortArray7775 = class64.aShortArray629;
		this.aByteArray7773 = class64.aByteArray627;
		this.aShortArray7776 = class64.aShortArray615;
		this.aByteArray7771 = class64.aByteArray625;
		this.aEmissiveTriangleArray7750 = class64.aEmissiveTriangleArray647;
		this.aEffectiveVertexArray7754 = class64.aEffectiveVertexArray613;
		this.aShortArray7816 = class64.aShortArray620;
		int[] is = new int[this.anInt7757];
		for (int i_3_ = 0; i_3_ < this.anInt7757; i_3_++)
			is[i_3_] = i_3_;
		long[] ls = new long[this.anInt7757];
		boolean bool = (this.animationFlag & 0x100) != 0;
		for (int i_4_ = 0; i_4_ < this.anInt7757; i_4_++) {
			int i_5_ = is[i_4_];
			Class53 class53 = null;
			int i_6_ = 0;
			int i_7_ = 0;
			int i_8_ = 0;
			int i_9_ = 0;
			if (class64.billboardConfigs != null) {
				boolean bool_10_ = false;
				for (int i_11_ = 0; i_11_ < class64.billboardConfigs.length; i_11_++) {
					BillboardConfig billboardConfig = class64.billboardConfigs[i_11_];
					if (i_5_ == billboardConfig.face * 1512514121) {
						Class173 class173 = BillboardConfig.method2844((billboardConfig.type * 1834782277));
						if (class173.aBoolean1757)
							bool_10_ = true;
						if (class173.anInt1751 * 39181267 != -1) {
							Class53 class53_12_ = interface_ma.method174((class173.anInt1751 * 39181267));
							if (class53_12_.anInt528 * -2138060883 == 2)
								this.aBoolean7756 = true;
						}
					}
				}
				if (bool_10_)
					ls[i_4_] = 9223372036854775807L;
			}
			int i_13_ = -1;
			if (class64.aShortArray617 != null) {
				i_13_ = class64.aShortArray617[i_5_];
				if (i_13_ != -1) {
					class53 = interface_ma.method174(i_13_ & 0xffff);
					if ((i_2_ & 0x40) == 0 || !class53.aBoolean524) {
						i_8_ = class53.aByte529;
						i_9_ = class53.aByte536;
					} else
						i_13_ = -1;
				}
			}
			boolean bool_14_ = ((this.aByteArray7773 != null && this.aByteArray7773[i_5_] != 0) || class53 != null && class53.anInt528 * -2138060883 == 2);
			if ((bool || bool_14_) && this.aByteArray7772 != null)
				i_6_ += this.aByteArray7772[i_5_] << 17;
			if (bool_14_)
				i_6_ += 65536;
			i_6_ += (i_8_ & 0xff) << 8;
			i_6_ += i_9_ & 0xff;
			i_7_ += (i_13_ & 0xffff) << 16;
			i_7_ += i_4_ & 0xffff;
			ls[i_4_] = ((long) i_6_ << 32) + (long) i_7_;
			this.aBoolean7756 |= bool_14_;
		}
		Skybox.method2598(ls, is);
		if (class64.billboardConfigs != null) {
			this.anInt7788 = class64.billboardConfigs.length;
			this.aClass16Array7789 = new Class16[this.anInt7788];
			this.aClass18Array7790 = new Class18[this.anInt7788];
			for (int i_15_ = 0; i_15_ < class64.billboardConfigs.length; i_15_++) {
				BillboardConfig billboardConfig = class64.billboardConfigs[i_15_];
				Class173 class173 = BillboardConfig.method2844(billboardConfig.type * 1834782277);
				int i_16_ = ((Class379.anIntArray4096[(class64.aShortArray629[billboardConfig.face * 1512514121] & 0xffff)]) & 0xffffff);
				i_16_ = i_16_ | 255 - (class64.aByteArray627 != null ? (class64.aByteArray627[billboardConfig.face * 1512514121]) & 0xff : 0) << 24;
				this.aClass16Array7789[i_15_] = (new Class16(billboardConfig.face * 1512514121, class64.aShortArray644[billboardConfig.face * 1512514121], class64.aShortArray646[billboardConfig.face * 1512514121], class64.aShortArray624[billboardConfig.face * 1512514121], class173.anInt1755 * 1951943953, class173.anInt1753 * 893949695, class173.anInt1751 * 39181267, class173.anInt1752 * -310074719, class173.anInt1754 * 1092922159, class173.aBoolean1757, billboardConfig.magnitude * 2010148771));
				this.aClass18Array7790[i_15_] = new Class18(i_16_);
			}
		}
		this.aFloatArrayArray7738 = new float[this.anInt7757][];
		this.aFloatArrayArray7762 = new float[this.anInt7757][];
		Class76 class76 = method4785(class64, is, this.anInt7757);
		Class15 class15 = this.javaGraphicsToolkit.method5202(Thread.currentThread());
		float[] fs = class15.aFloatArray210;
		boolean bool_17_ = false;
		for (int i_18_ = 0; i_18_ < this.anInt7757; i_18_++) {
			int i_19_ = is[i_18_];
			int i_20_;
			if (class64.aByteArray635 == null)
				i_20_ = -1;
			else
				i_20_ = class64.aByteArray635[i_19_];
			int i_21_ = (class64.aShortArray617 == null ? -1 : class64.aShortArray617[i_19_]);
			if (i_21_ != -1 && (i_2_ & 0x40) != 0) {
				Class53 class53 = interface_ma.method174(i_21_ & 0xffff);
				if (class53.aBoolean524)
					i_21_ = -1;
			}
			if (i_21_ != -1) {
				bool_17_ = true;
				float[] fs_22_ = (this.aFloatArrayArray7738[i_19_] = new float[3]);
				float[] fs_23_ = (this.aFloatArrayArray7762[i_19_] = new float[3]);
				boolean bool_24_ = false;
				if (i_20_ == -1) {
					fs_22_[0] = 0.0F;
					fs_23_[0] = 1.0F;
					fs_22_[1] = 1.0F;
					fs_23_[1] = 1.0F;
					fs_22_[2] = 0.0F;
					fs_23_[2] = 0.0F;
				} else {
					i_20_ &= 0xff;
					byte i_25_ = class64.aByteArray622[i_20_];
					if (i_25_ == 0) {
						short i_26_ = this.aShortArray7758[i_19_];
						short i_27_ = this.aShortArray7759[i_19_];
						short i_28_ = this.aShortArray7760[i_19_];
						short i_29_ = class64.aShortArray623[i_20_];
						short i_30_ = class64.aShortArray636[i_20_];
						short i_31_ = class64.aShortArray638[i_20_];
						float f = (float) (this.anIntArray7751[i_29_]);
						float f_32_ = (float) (this.anIntArray7752[i_29_]);
						float f_33_ = (float) (this.anIntArray7753[i_29_]);
						float f_34_ = ((float) (this.anIntArray7751[i_30_]) - f);
						float f_35_ = ((float) (this.anIntArray7752[i_30_]) - f_32_);
						float f_36_ = ((float) (this.anIntArray7753[i_30_]) - f_33_);
						float f_37_ = ((float) (this.anIntArray7751[i_31_]) - f);
						float f_38_ = ((float) (this.anIntArray7752[i_31_]) - f_32_);
						float f_39_ = ((float) (this.anIntArray7753[i_31_]) - f_33_);
						float f_40_ = ((float) (this.anIntArray7751[i_26_]) - f);
						float f_41_ = ((float) (this.anIntArray7752[i_26_]) - f_32_);
						float f_42_ = ((float) (this.anIntArray7753[i_26_]) - f_33_);
						float f_43_ = ((float) (this.anIntArray7751[i_27_]) - f);
						float f_44_ = ((float) (this.anIntArray7752[i_27_]) - f_32_);
						float f_45_ = ((float) (this.anIntArray7753[i_27_]) - f_33_);
						float f_46_ = ((float) (this.anIntArray7751[i_28_]) - f);
						float f_47_ = ((float) (this.anIntArray7752[i_28_]) - f_32_);
						float f_48_ = ((float) (this.anIntArray7753[i_28_]) - f_33_);
						float f_49_ = f_35_ * f_39_ - f_36_ * f_38_;
						float f_50_ = f_36_ * f_37_ - f_34_ * f_39_;
						float f_51_ = f_34_ * f_38_ - f_35_ * f_37_;
						float f_52_ = f_38_ * f_51_ - f_39_ * f_50_;
						float f_53_ = f_39_ * f_49_ - f_37_ * f_51_;
						float f_54_ = f_37_ * f_50_ - f_38_ * f_49_;
						float f_55_ = 1.0F / (f_52_ * f_34_ + f_53_ * f_35_ + f_54_ * f_36_);
						fs_22_[0] = (f_52_ * f_40_ + f_53_ * f_41_ + f_54_ * f_42_) * f_55_;
						fs_22_[1] = (f_52_ * f_43_ + f_53_ * f_44_ + f_54_ * f_45_) * f_55_;
						fs_22_[2] = (f_52_ * f_46_ + f_53_ * f_47_ + f_54_ * f_48_) * f_55_;
						f_52_ = f_35_ * f_51_ - f_36_ * f_50_;
						f_53_ = f_36_ * f_49_ - f_34_ * f_51_;
						f_54_ = f_34_ * f_50_ - f_35_ * f_49_;
						f_55_ = 1.0F / (f_52_ * f_37_ + f_53_ * f_38_ + f_54_ * f_39_);
						fs_23_[0] = (f_52_ * f_40_ + f_53_ * f_41_ + f_54_ * f_42_) * f_55_;
						fs_23_[1] = (f_52_ * f_43_ + f_53_ * f_44_ + f_54_ * f_45_) * f_55_;
						fs_23_[2] = (f_52_ * f_46_ + f_53_ * f_47_ + f_54_ * f_48_) * f_55_;
					} else {
						short i_56_ = this.aShortArray7758[i_19_];
						short i_57_ = this.aShortArray7759[i_19_];
						short i_58_ = this.aShortArray7760[i_19_];
						int i_59_ = class76.anIntArray713[i_20_];
						int i_60_ = class76.anIntArray710[i_20_];
						int i_61_ = class76.anIntArray709[i_20_];
						float[] fs_62_ = class76.aFloatArrayArray711[i_20_];
						byte i_63_ = class64.aByteArray628[i_20_];
						float f = (float) class64.anIntArray637[i_20_] / 256.0F;
						if (i_25_ == 1) {
							float f_64_ = ((float) class64.anIntArray641[i_20_] / 1024.0F);
							method4744(this.anIntArray7751[i_56_], this.anIntArray7752[i_56_], this.anIntArray7753[i_56_], i_59_, i_60_, i_61_, fs_62_, f_64_, i_63_, f, fs);
							fs_22_[0] = fs[0];
							fs_23_[0] = fs[1];
							method4744(this.anIntArray7751[i_57_], this.anIntArray7752[i_57_], this.anIntArray7753[i_57_], i_59_, i_60_, i_61_, fs_62_, f_64_, i_63_, f, fs);
							fs_22_[1] = fs[0];
							fs_23_[1] = fs[1];
							method4744(this.anIntArray7751[i_58_], this.anIntArray7752[i_58_], this.anIntArray7753[i_58_], i_59_, i_60_, i_61_, fs_62_, f_64_, i_63_, f, fs);
							fs_22_[2] = fs[0];
							fs_23_[2] = fs[1];
							float f_65_ = f_64_ / 2.0F;
							if ((i_63_ & 0x1) == 0) {
								if (fs_22_[1] - fs_22_[0] > f_65_)
									fs_22_[1] -= f_64_;
								else if (fs_22_[0] - fs_22_[1] > f_65_)
									fs_22_[1] += f_64_;
								if (fs_22_[2] - fs_22_[0] > f_65_)
									fs_22_[2] -= f_64_;
								else if (fs_22_[0] - fs_22_[2] > f_65_)
									fs_22_[2] += f_64_;
							} else {
								if (fs_23_[1] - fs_23_[0] > f_65_)
									fs_23_[1] -= f_64_;
								else if (fs_23_[0] - fs_23_[1] > f_65_)
									fs_23_[1] += f_64_;
								if (fs_23_[2] - fs_23_[0] > f_65_)
									fs_23_[2] -= f_64_;
								else if (fs_23_[0] - fs_23_[2] > f_65_)
									fs_23_[2] += f_64_;
							}
						} else if (i_25_ == 2) {
							float f_66_ = ((float) class64.anIntArray643[i_20_] / 256.0F);
							float f_67_ = ((float) class64.anIntArray648[i_20_] / 256.0F);
							int i_68_ = (this.anIntArray7751[i_57_] - (this.anIntArray7751[i_56_]));
							int i_69_ = (this.anIntArray7752[i_57_] - (this.anIntArray7752[i_56_]));
							int i_70_ = (this.anIntArray7753[i_57_] - (this.anIntArray7753[i_56_]));
							int i_71_ = (this.anIntArray7751[i_58_] - (this.anIntArray7751[i_56_]));
							int i_72_ = (this.anIntArray7752[i_58_] - (this.anIntArray7752[i_56_]));
							int i_73_ = (this.anIntArray7753[i_58_] - (this.anIntArray7753[i_56_]));
							int i_74_ = i_69_ * i_73_ - i_72_ * i_70_;
							int i_75_ = i_70_ * i_71_ - i_73_ * i_68_;
							int i_76_ = i_68_ * i_72_ - i_71_ * i_69_;
							float f_77_ = 64.0F / (float) class64.anIntArray639[i_20_];
							float f_78_ = 64.0F / (float) class64.anIntArray640[i_20_];
							float f_79_ = 64.0F / (float) class64.anIntArray641[i_20_];
							float f_80_ = (((float) i_74_ * fs_62_[0] + (float) i_75_ * fs_62_[1] + (float) i_76_ * fs_62_[2]) / f_77_);
							float f_81_ = (((float) i_74_ * fs_62_[3] + (float) i_75_ * fs_62_[4] + (float) i_76_ * fs_62_[5]) / f_78_);
							float f_82_ = (((float) i_74_ * fs_62_[6] + (float) i_75_ * fs_62_[7] + (float) i_76_ * fs_62_[8]) / f_79_);
							int i_83_ = method4729(f_80_, f_81_, f_82_);
							method4730(this.anIntArray7751[i_56_], this.anIntArray7752[i_56_], this.anIntArray7753[i_56_], i_59_, i_60_, i_61_, i_83_, fs_62_, i_63_, f, f_66_, f_67_, fs);
							fs_22_[0] = fs[0];
							fs_23_[0] = fs[1];
							method4730(this.anIntArray7751[i_57_], this.anIntArray7752[i_57_], this.anIntArray7753[i_57_], i_59_, i_60_, i_61_, i_83_, fs_62_, i_63_, f, f_66_, f_67_, fs);
							fs_22_[1] = fs[0];
							fs_23_[1] = fs[1];
							method4730(this.anIntArray7751[i_58_], this.anIntArray7752[i_58_], this.anIntArray7753[i_58_], i_59_, i_60_, i_61_, i_83_, fs_62_, i_63_, f, f_66_, f_67_, fs);
							fs_22_[2] = fs[0];
							fs_23_[2] = fs[1];
						} else if (i_25_ == 3) {
							method4780(this.anIntArray7751[i_56_], this.anIntArray7752[i_56_], this.anIntArray7753[i_56_], i_59_, i_60_, i_61_, fs_62_, i_63_, f, fs);
							fs_22_[0] = fs[0];
							fs_23_[0] = fs[1];
							method4780(this.anIntArray7751[i_57_], this.anIntArray7752[i_57_], this.anIntArray7753[i_57_], i_59_, i_60_, i_61_, fs_62_, i_63_, f, fs);
							fs_22_[1] = fs[0];
							fs_23_[1] = fs[1];
							method4780(this.anIntArray7751[i_58_], this.anIntArray7752[i_58_], this.anIntArray7753[i_58_], i_59_, i_60_, i_61_, fs_62_, i_63_, f, fs);
							fs_22_[2] = fs[0];
							fs_23_[2] = fs[1];
							if ((i_63_ & 0x1) == 0) {
								if (fs_22_[1] - fs_22_[0] > 0.5F)
									fs_22_[1]--;
								else if (fs_22_[0] - fs_22_[1] > 0.5F)
									fs_22_[1]++;
								if (fs_22_[2] - fs_22_[0] > 0.5F)
									fs_22_[2]--;
								else if (fs_22_[0] - fs_22_[2] > 0.5F)
									fs_22_[2]++;
							} else {
								if (fs_23_[1] - fs_23_[0] > 0.5F)
									fs_23_[1]--;
								else if (fs_23_[0] - fs_23_[1] > 0.5F)
									fs_23_[1]++;
								if (fs_23_[2] - fs_23_[0] > 0.5F)
									fs_23_[2]--;
								else if (fs_23_[0] - fs_23_[2] > 0.5F)
									fs_23_[2]++;
							}
						}
					}
				}
			}
		}
		if (!bool_17_) {
			this.aFloatArrayArray7762 = null;
			this.aFloatArrayArray7738 = null;
		}
		if (class64.anIntArray619 != null && (this.animationFlag & 0x20) != 0)
			this.anIntArrayArray7778 = class64.method749(true);
		if (class64.anIntArray631 != null && (this.animationFlag & 0x180) != 0)
			this.anIntArrayArray7779 = class64.method750();
		if (class64.billboardConfigs != null && (this.animationFlag & 0x400) != 0)
			this.anIntArrayArray7791 = class64.method759();
		if (class64.aShortArray617 != null) {
			this.aShortArray7774 = new short[this.anInt7757];
			boolean bool_84_ = false;
			for (int i_85_ = 0; i_85_ < this.anInt7757; i_85_++) {
				short i_86_ = class64.aShortArray617[i_85_];
				if (i_86_ != -1) {
					Class53 class53 = this.javaGraphicsToolkit.textures.method174(i_86_);
					if ((i_2_ & 0x40) == 0 || !class53.aBoolean524) {
						this.aShortArray7774[i_85_] = i_86_;
						bool_84_ = true;
						if (class53.anInt528 * -2138060883 == 2)
							this.aBoolean7756 = true;
						if (class53.aByte535 != 0 || class53.aByte509 != 0)
							this.aBoolean7777 = true;
					} else
						this.aShortArray7774[i_85_] = (short) -1;
				} else
					this.aShortArray7774[i_85_] = (short) -1;
			}
			if (!bool_84_)
				this.aShortArray7774 = null;
		} else
			this.aShortArray7774 = null;
		if (this.aBoolean7756 || this.aClass16Array7789 != null) {
			this.aShortArray7803 = new short[this.anInt7757];
			for (int i_87_ = 0; i_87_ < this.anInt7757; i_87_++)
				this.aShortArray7803[i_87_] = (short) is[i_87_];
		}
	}

	void method4789(Class15 class15) {
		this.aClass2_7737 = class15.aClass2_192;
		if (class15 != this.aClass15_7735) {
			this.aClass15_7735 = class15;
			this.anIntArray7734 = (this.aClass15_7735.anIntArray213);
			this.aFloatArray7784 = (this.aClass15_7735.aFloatArray197);
			this.aFloatArray7806 = (this.aClass15_7735.aFloatArray188);
			this.aFloatArray7807 = (this.aClass15_7735.aFloatArray199);
			this.aFloatArray7745 = (this.aClass15_7735.aFloatArray200);
			this.anIntArray7809 = (this.aClass15_7735.anIntArray201);
			this.anIntArray7761 = (this.aClass15_7735.anIntArray202);
			this.anIntArray7811 = (this.aClass15_7735.anIntArray203);
			this.anIntArray7793 = (this.aClass15_7735.anIntArray204);
			this.anIntArray7813 = (this.aClass15_7735.anIntArray178);
			this.anIntArray7814 = (this.aClass15_7735.anIntArray206);
		}
	}

    public boolean i() {
		return this.aBoolean7756;
	}

	void method4790(boolean bool) {
		if (this.anInt7812 == 1)
			method4792();
		else if (this.anInt7812 == 2) {
			if ((this.animationFlag & 0x97098) == 0 && this.aFloatArrayArray7738 == null)
				this.aShortArray7775 = null;
			if (bool)
				this.aByteArray7771 = null;
		} else {
			method4814();
			int i = (this.javaGraphicsToolkit.anInt7978) * 760881147;
			int i_91_ = (this.javaGraphicsToolkit.anInt7979) * -181413563;
			int i_92_ = (this.javaGraphicsToolkit.anInt7981) * -1601750017;
			int i_93_ = (this.javaGraphicsToolkit.anInt7983) * -697249431 >> 8;
			int i_94_ = 0;
			int i_95_ = 0;
			if (this.anInt7748 != 0) {
				i_94_ = (this.javaGraphicsToolkit.anInt7998 * -801738496 / this.anInt7748);
				i_95_ = (this.javaGraphicsToolkit.anInt7982 * -990251776 / this.anInt7748);
			}
			if (this.anIntArray7763 == null) {
				this.anIntArray7763 = new int[this.anInt7757];
				this.anIntArray7764 = new int[this.anInt7757];
				this.anIntArray7801 = new int[this.anInt7757];
			}
			for (int i_96_ = 0; i_96_ < this.anInt7757; i_96_++) {
				byte i_97_;
				if (this.aByteArray7771 == null)
					i_97_ = (byte) 0;
				else
					i_97_ = this.aByteArray7771[i_96_];
				byte i_98_;
				if (this.aByteArray7773 == null)
					i_98_ = (byte) 0;
				else
					i_98_ = this.aByteArray7773[i_96_];
				short i_99_;
				if (this.aShortArray7774 == null)
					i_99_ = (short) -1;
				else
					i_99_ = this.aShortArray7774[i_96_];
				if (i_98_ == -2)
					i_97_ = (byte) 3;
				if (i_98_ == -1)
					i_97_ = (byte) 2;
				if (i_99_ == -1) {
					if (i_97_ == 0) {
						int i_100_ = (this.aShortArray7775[i_96_] & 0xffff);
						int i_101_ = (((i_100_ & 0x7f) * this.anInt7747) >> 7);
						short i_102_ = Class173.method1823(i_100_ & ~0x7f | i_101_);
						Class1 class1;
						if (this.aClass1Array7786 != null && (this.aClass1Array7786[(this.aShortArray7758[i_96_])]) != null)
							class1 = (this.aClass1Array7786[(this.aShortArray7758[i_96_])]);
						else
							class1 = (this.aClass1Array7755[(this.aShortArray7758[i_96_])]);
						int i_103_ = (((i * class1.anInt13 + i_91_ * class1.anInt12 + i_92_ * class1.anInt14) / class1.anInt15) >> 16);
						int i_104_ = i_103_ > 256 ? i_94_ : i_95_;
						int i_105_ = (i_93_ >> 1) + (i_104_ * i_103_ >> 17);
						this.anIntArray7763[i_96_] = i_105_ << 17 | Class195.method1873(i_102_, i_105_);
						if (this.aClass1Array7786 != null && (this.aClass1Array7786[(this.aShortArray7759[i_96_])]) != null)
							class1 = (this.aClass1Array7786[(this.aShortArray7759[i_96_])]);
						else
							class1 = (this.aClass1Array7755[(this.aShortArray7759[i_96_])]);
						i_103_ = ((i * class1.anInt13 + i_91_ * class1.anInt12 + i_92_ * class1.anInt14) / class1.anInt15) >> 16;
						i_104_ = i_103_ > 256 ? i_94_ : i_95_;
						i_105_ = (i_93_ >> 1) + (i_104_ * i_103_ >> 17);
						this.anIntArray7764[i_96_] = i_105_ << 17 | Class195.method1873(i_102_, i_105_);
						if (this.aClass1Array7786 != null && (this.aClass1Array7786[(this.aShortArray7760[i_96_])]) != null)
							class1 = (this.aClass1Array7786[(this.aShortArray7760[i_96_])]);
						else
							class1 = (this.aClass1Array7755[(this.aShortArray7760[i_96_])]);
						i_103_ = ((i * class1.anInt13 + i_91_ * class1.anInt12 + i_92_ * class1.anInt14) / class1.anInt15) >> 16;
						i_104_ = i_103_ > 256 ? i_94_ : i_95_;
						i_105_ = (i_93_ >> 1) + (i_104_ * i_103_ >> 17);
						this.anIntArray7801[i_96_] = i_105_ << 17 | Class195.method1873(i_102_, i_105_);
					} else if (i_97_ == 1) {
						int i_106_ = (this.aShortArray7775[i_96_] & 0xffff);
						int i_107_ = (((i_106_ & 0x7f) * this.anInt7747) >> 7);
						short i_108_ = Class173.method1823(i_106_ & ~0x7f | i_107_);
						Class5 class5 = this.aClass5Array7740[i_96_];
						int i_109_ = ((i * class5.anInt78 + i_91_ * class5.anInt79 + i_92_ * class5.anInt80) >> 16);
						int i_110_ = i_109_ > 256 ? i_94_ : i_95_;
						int i_111_ = (i_93_ >> 1) + (i_110_ * i_109_ >> 17);
						this.anIntArray7763[i_96_] = i_111_ << 17 | Class195.method1873(i_108_, i_111_);
						this.anIntArray7801[i_96_] = -1;
					} else if (i_97_ == 3) {
						this.anIntArray7763[i_96_] = 128;
						this.anIntArray7801[i_96_] = -1;
					} else
						this.anIntArray7801[i_96_] = -2;
				} else {
					int i_112_ = (this.aShortArray7775[i_96_] & 0xffff);
					if (i_97_ == 0) {
						Class1 class1;
						if (this.aClass1Array7786 != null && (this.aClass1Array7786[(this.aShortArray7758[i_96_])]) != null)
							class1 = (this.aClass1Array7786[(this.aShortArray7758[i_96_])]);
						else
							class1 = (this.aClass1Array7755[(this.aShortArray7758[i_96_])]);
						int i_113_ = (((i * class1.anInt13 + i_91_ * class1.anInt12 + i_92_ * class1.anInt14) / class1.anInt15) >> 16);
						int i_114_ = i_113_ > 256 ? i_94_ : i_95_;
						int i_115_ = method4794((i_93_ >> 2) + (i_114_ * i_113_ >> 18));
						this.anIntArray7763[i_96_] = i_115_ << 24 | method4791(i_112_, i_99_, i_115_);
						if (this.aClass1Array7786 != null && (this.aClass1Array7786[(this.aShortArray7759[i_96_])]) != null)
							class1 = (this.aClass1Array7786[(this.aShortArray7759[i_96_])]);
						else
							class1 = (this.aClass1Array7755[(this.aShortArray7759[i_96_])]);
						i_113_ = ((i * class1.anInt13 + i_91_ * class1.anInt12 + i_92_ * class1.anInt14) / class1.anInt15) >> 16;
						i_114_ = i_113_ > 256 ? i_94_ : i_95_;
						i_115_ = method4794((i_93_ >> 2) + (i_114_ * i_113_ >> 18));
						this.anIntArray7764[i_96_] = i_115_ << 24 | method4791(i_112_, i_99_, i_115_);
						if (this.aClass1Array7786 != null && (this.aClass1Array7786[(this.aShortArray7760[i_96_])]) != null)
							class1 = (this.aClass1Array7786[(this.aShortArray7760[i_96_])]);
						else
							class1 = (this.aClass1Array7755[(this.aShortArray7760[i_96_])]);
						i_113_ = ((i * class1.anInt13 + i_91_ * class1.anInt12 + i_92_ * class1.anInt14) / class1.anInt15) >> 16;
						i_114_ = i_113_ > 256 ? i_94_ : i_95_;
						i_115_ = method4794((i_93_ >> 2) + (i_114_ * i_113_ >> 18));
						this.anIntArray7801[i_96_] = i_115_ << 24 | method4791(i_112_, i_99_, i_115_);
					} else if (i_97_ == 1) {
						Class5 class5 = this.aClass5Array7740[i_96_];
						int i_116_ = ((i * class5.anInt78 + i_91_ * class5.anInt79 + i_92_ * class5.anInt80) >> 16);
						int i_117_ = i_116_ > 256 ? i_94_ : i_95_;
						int i_118_ = method4794((i_93_ >> 2) + (i_117_ * i_116_ >> 18));
						this.anIntArray7763[i_96_] = i_118_ << 24 | method4791(i_112_, i_99_, i_118_);
						this.anIntArray7801[i_96_] = -1;
					} else
						this.anIntArray7801[i_96_] = -2;
				}
			}
			this.aClass1Array7755 = null;
			this.aClass1Array7786 = null;
			this.aClass5Array7740 = null;
			if ((this.animationFlag & 0x97098) == 0 && this.aFloatArrayArray7738 == null)
				this.aShortArray7775 = null;
			if (bool)
				this.aByteArray7771 = null;
			this.anInt7812 = 2;
		}
	}

	int method4791(int i, short i_119_, int i_120_) {
		int i_121_ = Class294.anIntArray3165[method4795(i, i_120_)];
		Class53 class53 = this.javaGraphicsToolkit.textures.method174(i_119_ & 0xffff);
		int i_122_ = class53.aByte533 & 0xff;
		if (i_122_ != 0) {
			int i_123_ = 131586 * i_120_;
			if (i_122_ == 256)
				i_121_ = i_123_;
			else {
				int i_124_ = i_122_;
				int i_125_ = 256 - i_122_;
				i_121_ = ((((i_123_ & 0xff00ff) * i_124_ + (i_121_ & 0xff00ff) * i_125_) & ~0xff00ff) + (((i_123_ & 0xff00) * i_124_ + (i_121_ & 0xff00) * i_125_) & 0xff0000)) >> 8;
			}
		}
		int i_126_ = class53.aByte534 & 0xff;
		if (i_126_ != 0) {
			i_126_ += 256;
			int i_127_ = ((i_121_ & 0xff0000) >> 16) * i_126_;
			if (i_127_ > 65535)
				i_127_ = 65535;
			int i_128_ = ((i_121_ & 0xff00) >> 8) * i_126_;
			if (i_128_ > 65535)
				i_128_ = 65535;
			int i_129_ = (i_121_ & 0xff) * i_126_;
			if (i_129_ > 65535)
				i_129_ = 65535;
			i_121_ = (i_127_ << 8 & 0xff0000) + (i_128_ & 0xff00) + (i_129_ >> 8);
		}
		return i_121_;
	}

    void method4792() {
		if (this.anInt7812 == 0)
			method4810(false);
		else {
			do {
				if ((this.javaGraphicsToolkit.anInt7999 * -922307687) > 1) {
					synchronized (this) {
						method4804();
						break;
					}
				}
				method4804();
			} while (false);
		}
	}

	public void method4745(ModelToolkit modelToolkit, int i, int i_130_, int i_131_, boolean bool) {
		DirectXModelToolkit directXModelToolkit_132_ = (DirectXModelToolkit) modelToolkit;
		if ((this.animationFlag & 0x10000) != 65536)
			throw new IllegalStateException("");
		if ((directXModelToolkit_132_.animationFlag & 0x10000) != 65536)
			throw new IllegalStateException("");
		method4789(this.javaGraphicsToolkit.method5202(Thread.currentThread()));
		method4807();
		method4814();
		directXModelToolkit_132_.method4807();
		directXModelToolkit_132_.method4814();
		anInt7805++;
		int i_133_ = 0;
		int[] is = directXModelToolkit_132_.anIntArray7751;
		int i_134_ = directXModelToolkit_132_.anInt7742;
		for (int i_135_ = 0; i_135_ < this.anInt7742; i_135_++) {
			Class1 class1 = this.aClass1Array7755[i_135_];
			if (class1.anInt15 != 0) {
				int i_136_ = this.anIntArray7752[i_135_] - i_130_;
				if (i_136_ >= directXModelToolkit_132_.aShort7770 && (i_136_ <= directXModelToolkit_132_.aShort7796)) {
					int i_137_ = this.anIntArray7751[i_135_] - i;
					if ((i_137_ >= directXModelToolkit_132_.aShort7797) && i_137_ <= (directXModelToolkit_132_.aShort7743)) {
						int i_138_ = (this.anIntArray7753[i_135_] - i_131_);
						if (i_138_ >= (directXModelToolkit_132_.aShort7795) && i_138_ <= (directXModelToolkit_132_.aShort7800)) {
							for (int i_139_ = 0; i_139_ < i_134_; i_139_++) {
								Class1 class1_140_ = (directXModelToolkit_132_.aClass1Array7755[i_139_]);
								if (i_137_ == is[i_139_] && i_138_ == (directXModelToolkit_132_.anIntArray7753[i_139_]) && i_136_ == (directXModelToolkit_132_.anIntArray7752[i_139_]) && class1_140_.anInt15 != 0) {
									if (this.aClass1Array7786 == null)
										this.aClass1Array7786 = new Class1[this.anInt7742];
									if ((directXModelToolkit_132_.aClass1Array7786) == null)
										directXModelToolkit_132_.aClass1Array7786 = new Class1[i_134_];
									Class1 class1_141_ = (this.aClass1Array7786[i_135_]);
									if (class1_141_ == null)
										class1_141_ = this.aClass1Array7786[i_135_] = new Class1(class1);
									Class1 class1_142_ = (directXModelToolkit_132_.aClass1Array7786[i_139_]);
									if (class1_142_ == null)
										class1_142_ = directXModelToolkit_132_.aClass1Array7786[i_139_] = new Class1(class1_140_);
									class1_141_.anInt13 += class1_140_.anInt13;
									class1_141_.anInt12 += class1_140_.anInt12;
									class1_141_.anInt14 += class1_140_.anInt14;
									class1_141_.anInt15 += class1_140_.anInt15;
									class1_142_.anInt13 += class1.anInt13;
									class1_142_.anInt12 += class1.anInt12;
									class1_142_.anInt14 += class1.anInt14;
									class1_142_.anInt15 += class1.anInt15;
									i_133_++;
									this.anIntArray7793[i_135_] = anInt7805;
									this.anIntArray7813[i_139_] = anInt7805;
								}
							}
						}
					}
				}
			}
		}
		if (i_133_ >= 3 && bool) {
			for (int i_143_ = 0; i_143_ < this.anInt7757; i_143_++) {
				if (((this.anIntArray7793[this.aShortArray7758[i_143_]]) == anInt7805) && ((this.anIntArray7793[this.aShortArray7759[i_143_]]) == anInt7805) && ((this.anIntArray7793[this.aShortArray7760[i_143_]]) == anInt7805)) {
					if (this.aByteArray7771 == null)
						this.aByteArray7771 = new byte[this.anInt7757];
					this.aByteArray7771[i_143_] = (byte) 2;
				}
			}
			for (int i_144_ = 0; i_144_ < directXModelToolkit_132_.anInt7757; i_144_++) {
				if ((this.anIntArray7813[(directXModelToolkit_132_.aShortArray7758[i_144_])]) == anInt7805 && (this.anIntArray7813[(directXModelToolkit_132_.aShortArray7759[i_144_])]) == anInt7805 && (this.anIntArray7813[(directXModelToolkit_132_.aShortArray7760[i_144_])]) == anInt7805) {
					if (directXModelToolkit_132_.aByteArray7771 == null)
						directXModelToolkit_132_.aByteArray7771 = new byte[(directXModelToolkit_132_.anInt7757)];
					directXModelToolkit_132_.aByteArray7771[i_144_] = (byte) 2;
				}
			}
		}
	}

	public ModelToolkit method4755(byte i, int i_145_, boolean bool) {
		method4815(Thread.currentThread());
		boolean bool_146_ = false;
		DirectXModelToolkit directXModelToolkit_147_;
		DirectXModelToolkit directXModelToolkit_148_;
		if (i > 0 && i <= 7) {
			directXModelToolkit_148_ = this.aDirectXModelToolkitArray7804[i - 1];
			directXModelToolkit_147_ = this.aDirectXModelToolkitArray7815[i - 1];
			bool_146_ = true;
		} else
			directXModelToolkit_147_ = directXModelToolkit_148_ = new DirectXModelToolkit(this.javaGraphicsToolkit);
		return method4793(directXModelToolkit_147_, directXModelToolkit_148_, i_145_, bool_146_, bool);
	}

	ModelToolkit method4793(DirectXModelToolkit directXModelToolkit_149_, DirectXModelToolkit directXModelToolkit_150_, int i, boolean bool, boolean bool_151_) {
		directXModelToolkit_149_.aBoolean7792 = this.aBoolean7792;
		if (this.aBoolean7792) {
			directXModelToolkit_149_.aShort7743 = this.aShort7743;
			directXModelToolkit_149_.aShort7796 = this.aShort7796;
			directXModelToolkit_149_.aShort7800 = this.aShort7800;
			directXModelToolkit_149_.aShort7797 = this.aShort7797;
			directXModelToolkit_149_.aShort7770 = this.aShort7770;
			directXModelToolkit_149_.aShort7795 = this.aShort7795;
			directXModelToolkit_149_.aShort7739 = this.aShort7739;
			directXModelToolkit_149_.aShort7794 = this.aShort7794;
		}
		directXModelToolkit_149_.anInt7747 = this.anInt7747;
		directXModelToolkit_149_.anInt7748 = this.anInt7748;
		directXModelToolkit_149_.anInt7799 = this.anInt7799;
		directXModelToolkit_149_.anInt7742 = this.anInt7742;
		directXModelToolkit_149_.anInt7757 = this.anInt7757;
		directXModelToolkit_149_.anInt7788 = this.anInt7788;
		if ((i & 0x100) != 0)
			directXModelToolkit_149_.aBoolean7756 = true;
		else
			directXModelToolkit_149_.aBoolean7756 = this.aBoolean7756;
		directXModelToolkit_149_.aBoolean7777 = this.aBoolean7777;
		boolean bool_152_ = (i & 0x7) == 7 | (i & 0x20) != 0;
		boolean bool_153_ = bool_152_ || (i & 0x1) != 0;
		boolean bool_154_ = bool_152_ || (i & 0x2) != 0;
		boolean bool_155_ = bool_152_ || (i & 0x4) != 0 || (i & 0x10) != 0;
		if (bool_153_ || bool_154_ || bool_155_) {
			if (bool_153_) {
				if (directXModelToolkit_150_.anIntArray7751 == null || ((directXModelToolkit_150_.anIntArray7751).length < this.anInt7799))
					directXModelToolkit_149_.anIntArray7751 = directXModelToolkit_150_.anIntArray7751 = new int[this.anInt7799];
				else
					directXModelToolkit_149_.anIntArray7751 = directXModelToolkit_150_.anIntArray7751;
				for (int i_156_ = 0; i_156_ < this.anInt7799; i_156_++)
					directXModelToolkit_149_.anIntArray7751[i_156_] = this.anIntArray7751[i_156_];
			} else
				directXModelToolkit_149_.anIntArray7751 = this.anIntArray7751;
			if (bool_154_) {
				if (directXModelToolkit_150_.anIntArray7752 == null || ((directXModelToolkit_150_.anIntArray7752).length < this.anInt7799))
					directXModelToolkit_149_.anIntArray7752 = directXModelToolkit_150_.anIntArray7752 = new int[this.anInt7799];
				else
					directXModelToolkit_149_.anIntArray7752 = directXModelToolkit_150_.anIntArray7752;
				for (int i_157_ = 0; i_157_ < this.anInt7799; i_157_++)
					directXModelToolkit_149_.anIntArray7752[i_157_] = this.anIntArray7752[i_157_];
			} else
				directXModelToolkit_149_.anIntArray7752 = this.anIntArray7752;
			if (bool_155_) {
				if (directXModelToolkit_150_.anIntArray7753 == null || ((directXModelToolkit_150_.anIntArray7753).length < this.anInt7799))
					directXModelToolkit_149_.anIntArray7753 = directXModelToolkit_150_.anIntArray7753 = new int[this.anInt7799];
				else
					directXModelToolkit_149_.anIntArray7753 = directXModelToolkit_150_.anIntArray7753;
				for (int i_158_ = 0; i_158_ < this.anInt7799; i_158_++)
					directXModelToolkit_149_.anIntArray7753[i_158_] = this.anIntArray7753[i_158_];
			} else
				directXModelToolkit_149_.anIntArray7753 = this.anIntArray7753;
		} else {
			directXModelToolkit_149_.anIntArray7751 = this.anIntArray7751;
			directXModelToolkit_149_.anIntArray7752 = this.anIntArray7752;
			directXModelToolkit_149_.anIntArray7753 = this.anIntArray7753;
		}
		if ((i & 0x84080) != 0) {
			if (directXModelToolkit_150_.aShortArray7775 == null || (directXModelToolkit_150_.aShortArray7775.length < this.anInt7757)) {
				int i_159_ = this.anInt7757;
				directXModelToolkit_149_.aShortArray7775 = directXModelToolkit_150_.aShortArray7775 = new short[i_159_];
			} else
				directXModelToolkit_149_.aShortArray7775 = directXModelToolkit_150_.aShortArray7775;
			for (int i_160_ = 0; i_160_ < this.anInt7757; i_160_++)
				directXModelToolkit_149_.aShortArray7775[i_160_] = this.aShortArray7775[i_160_];
		} else
			directXModelToolkit_149_.aShortArray7775 = this.aShortArray7775;
		if ((i & 0x97018) != 0) {
			directXModelToolkit_149_.anInt7812 = 0;
			DirectXModelToolkit directXModelToolkit_161_ = directXModelToolkit_149_;
			DirectXModelToolkit directXModelToolkit_162_ = directXModelToolkit_149_;
			directXModelToolkit_149_.anIntArray7801 = null;
			directXModelToolkit_162_.anIntArray7764 = null;
			directXModelToolkit_161_.anIntArray7763 = null;
		} else if ((i & 0x80) != 0) {
			if (bool_151_)
				method4810(false);
			if (this.anIntArray7763 != null) {
				if (directXModelToolkit_150_.anIntArray7763 == null || ((directXModelToolkit_150_.anIntArray7763).length < this.anInt7757)) {
					int i_163_ = this.anInt7757;
					directXModelToolkit_149_.anIntArray7763 = directXModelToolkit_150_.anIntArray7763 = new int[i_163_];
					directXModelToolkit_149_.anIntArray7764 = directXModelToolkit_150_.anIntArray7764 = new int[i_163_];
					directXModelToolkit_149_.anIntArray7801 = directXModelToolkit_150_.anIntArray7801 = new int[i_163_];
				} else {
					directXModelToolkit_149_.anIntArray7763 = directXModelToolkit_150_.anIntArray7763;
					directXModelToolkit_149_.anIntArray7764 = directXModelToolkit_150_.anIntArray7764;
					directXModelToolkit_149_.anIntArray7801 = directXModelToolkit_150_.anIntArray7801;
				}
				for (int i_164_ = 0; i_164_ < this.anInt7757; i_164_++) {
					directXModelToolkit_149_.anIntArray7763[i_164_] = this.anIntArray7763[i_164_];
					directXModelToolkit_149_.anIntArray7764[i_164_] = this.anIntArray7764[i_164_];
					directXModelToolkit_149_.anIntArray7801[i_164_] = this.anIntArray7801[i_164_];
				}
			}
			directXModelToolkit_149_.anInt7812 = this.anInt7812;
		} else {
			if (bool_151_)
				method4810(false);
			directXModelToolkit_149_.anIntArray7763 = this.anIntArray7763;
			directXModelToolkit_149_.anIntArray7764 = this.anIntArray7764;
			directXModelToolkit_149_.anIntArray7801 = this.anIntArray7801;
			directXModelToolkit_149_.anInt7812 = this.anInt7812;
		}
		if ((i & 0x100) != 0) {
			if (directXModelToolkit_150_.aByteArray7773 == null || (directXModelToolkit_150_.aByteArray7773.length < this.anInt7757)) {
				int i_165_ = this.anInt7757;
				directXModelToolkit_149_.aByteArray7773 = directXModelToolkit_150_.aByteArray7773 = new byte[i_165_];
			} else
				directXModelToolkit_149_.aByteArray7773 = directXModelToolkit_150_.aByteArray7773;
			if (this.aByteArray7773 != null) {
				for (int i_166_ = 0; i_166_ < this.anInt7757; i_166_++)
					directXModelToolkit_149_.aByteArray7773[i_166_] = this.aByteArray7773[i_166_];
			} else {
				for (int i_167_ = 0; i_167_ < this.anInt7757; i_167_++)
					directXModelToolkit_149_.aByteArray7773[i_167_] = (byte) 0;
			}
		} else
			directXModelToolkit_149_.aByteArray7773 = this.aByteArray7773;
		if ((i & 0x8) != 0 || (i & 0x10) != 0) {
			if (directXModelToolkit_150_.aClass1Array7755 == null || ((directXModelToolkit_150_.aClass1Array7755).length < this.anInt7742)) {
				int i_168_ = this.anInt7742;
				directXModelToolkit_149_.aClass1Array7755 = directXModelToolkit_150_.aClass1Array7755 = new Class1[i_168_];
			} else
				directXModelToolkit_149_.aClass1Array7755 = directXModelToolkit_150_.aClass1Array7755;
			if (this.aClass1Array7755 != null) {
				for (int i_169_ = 0; i_169_ < this.anInt7742; i_169_++)
					directXModelToolkit_149_.aClass1Array7755[i_169_] = new Class1(this.aClass1Array7755[i_169_]);
			} else
				directXModelToolkit_149_.aClass1Array7755 = null;
			if (this.aClass5Array7740 != null) {
				if ((directXModelToolkit_150_.aClass5Array7740 == null) || ((directXModelToolkit_150_.aClass5Array7740).length < this.anInt7757)) {
					int i_170_ = this.anInt7757;
					directXModelToolkit_149_.aClass5Array7740 = directXModelToolkit_150_.aClass5Array7740 = new Class5[i_170_];
				} else
					directXModelToolkit_149_.aClass5Array7740 = (directXModelToolkit_150_.aClass5Array7740);
				for (int i_171_ = 0; i_171_ < this.anInt7757; i_171_++)
					directXModelToolkit_149_.aClass5Array7740[i_171_] = ((this.aClass5Array7740[i_171_] != null) ? new Class5(this.aClass5Array7740[i_171_]) : null);
			} else
				directXModelToolkit_149_.aClass5Array7740 = null;
		} else {
			if (bool_151_)
				method4814();
			directXModelToolkit_149_.aClass1Array7755 = this.aClass1Array7755;
			directXModelToolkit_149_.aClass5Array7740 = this.aClass5Array7740;
		}
		if ((i & 0x8000) != 0) {
			if (this.aShortArray7774 == null)
				directXModelToolkit_149_.aShortArray7774 = null;
			else {
				if ((directXModelToolkit_150_.aShortArray7774 == null) || ((directXModelToolkit_150_.aShortArray7774).length < this.anInt7757)) {
					int i_172_ = this.anInt7757;
					directXModelToolkit_149_.aShortArray7774 = directXModelToolkit_150_.aShortArray7774 = new short[i_172_];
				} else
					directXModelToolkit_149_.aShortArray7774 = directXModelToolkit_150_.aShortArray7774;
				for (int i_173_ = 0; i_173_ < this.anInt7757; i_173_++)
					directXModelToolkit_149_.aShortArray7774[i_173_] = this.aShortArray7774[i_173_];
			}
		} else
			directXModelToolkit_149_.aShortArray7774 = this.aShortArray7774;
		if ((i & 0x10000) != 0) {
			if (this.aByteArray7771 == null)
				directXModelToolkit_149_.aByteArray7771 = null;
			else {
				if (directXModelToolkit_150_.aByteArray7771 == null || ((directXModelToolkit_150_.aByteArray7771).length < this.anInt7757)) {
					int i_174_ = (bool ? this.anInt7757 + 100 : this.anInt7757);
					directXModelToolkit_149_.aByteArray7771 = directXModelToolkit_150_.aByteArray7771 = new byte[i_174_];
				} else
					directXModelToolkit_149_.aByteArray7771 = directXModelToolkit_150_.aByteArray7771;
				for (int i_175_ = 0; i_175_ < this.anInt7757; i_175_++)
					directXModelToolkit_149_.aByteArray7771[i_175_] = this.aByteArray7771[i_175_];
			}
		} else
			directXModelToolkit_149_.aByteArray7771 = this.aByteArray7771;
		if ((i & 0xc580) != 0) {
			if (directXModelToolkit_150_.aClass18Array7790 == null || ((directXModelToolkit_150_.aClass18Array7790).length < this.anInt7788)) {
				int i_176_ = this.anInt7788;
				directXModelToolkit_149_.aClass18Array7790 = directXModelToolkit_150_.aClass18Array7790 = new Class18[i_176_];
				for (int i_177_ = 0; i_177_ < this.anInt7788; i_177_++)
					directXModelToolkit_149_.aClass18Array7790[i_177_] = this.aClass18Array7790[i_177_].method355();
			} else {
				directXModelToolkit_149_.aClass18Array7790 = directXModelToolkit_150_.aClass18Array7790;
				for (int i_178_ = 0; i_178_ < this.anInt7788; i_178_++)
					directXModelToolkit_149_.aClass18Array7790[i_178_].method356(this.aClass18Array7790[i_178_]);
			}
		} else
			directXModelToolkit_149_.aClass18Array7790 = this.aClass18Array7790;
		if (this.aFloatArrayArray7738 != null && (i & 0x10) != 0) {
			if ((directXModelToolkit_150_.aFloatArrayArray7738 == null) || ((directXModelToolkit_150_.aFloatArrayArray7738).length < this.anInt7757)) {
				int i_179_ = (bool ? this.anInt7757 + 100 : this.anInt7757);
				directXModelToolkit_149_.aFloatArrayArray7738 = directXModelToolkit_150_.aFloatArrayArray7738 = new float[i_179_][3];
			} else
				directXModelToolkit_149_.aFloatArrayArray7738 = (directXModelToolkit_150_.aFloatArrayArray7738);
			for (int i_180_ = 0; i_180_ < this.anInt7757; i_180_++) {
				if (this.aFloatArrayArray7738[i_180_] != null) {
					directXModelToolkit_149_.aFloatArrayArray7738[i_180_][0] = (this.aFloatArrayArray7738[i_180_][0]);
					directXModelToolkit_149_.aFloatArrayArray7738[i_180_][1] = (this.aFloatArrayArray7738[i_180_][1]);
					directXModelToolkit_149_.aFloatArrayArray7738[i_180_][2] = (this.aFloatArrayArray7738[i_180_][2]);
				}
			}
			if ((directXModelToolkit_150_.aFloatArrayArray7762 == null) || ((directXModelToolkit_150_.aFloatArrayArray7762).length < this.anInt7757)) {
				int i_181_ = (bool ? this.anInt7757 + 100 : this.anInt7757);
				directXModelToolkit_149_.aFloatArrayArray7762 = directXModelToolkit_150_.aFloatArrayArray7762 = new float[i_181_][3];
			} else
				directXModelToolkit_149_.aFloatArrayArray7762 = (directXModelToolkit_150_.aFloatArrayArray7762);
			for (int i_182_ = 0; i_182_ < this.anInt7757; i_182_++) {
				if (this.aFloatArrayArray7762[i_182_] != null) {
					directXModelToolkit_149_.aFloatArrayArray7762[i_182_][0] = (this.aFloatArrayArray7762[i_182_][0]);
					directXModelToolkit_149_.aFloatArrayArray7762[i_182_][1] = (this.aFloatArrayArray7762[i_182_][1]);
					directXModelToolkit_149_.aFloatArrayArray7762[i_182_][2] = (this.aFloatArrayArray7762[i_182_][2]);
				}
			}
		} else {
			directXModelToolkit_149_.aFloatArrayArray7738 = this.aFloatArrayArray7738;
			directXModelToolkit_149_.aFloatArrayArray7762 = this.aFloatArrayArray7762;
		}
		directXModelToolkit_149_.anIntArrayArray7778 = this.anIntArrayArray7778;
		directXModelToolkit_149_.anIntArrayArray7779 = this.anIntArrayArray7779;
		directXModelToolkit_149_.anIntArrayArray7791 = this.anIntArrayArray7791;
		directXModelToolkit_149_.aShortArray7816 = this.aShortArray7816;
		directXModelToolkit_149_.aShortArray7776 = this.aShortArray7776;
		directXModelToolkit_149_.aByteArray7772 = this.aByteArray7772;
		directXModelToolkit_149_.aShortArray7758 = this.aShortArray7758;
		directXModelToolkit_149_.aShortArray7759 = this.aShortArray7759;
		directXModelToolkit_149_.aShortArray7760 = this.aShortArray7760;
		directXModelToolkit_149_.aEmissiveTriangleArray7750 = this.aEmissiveTriangleArray7750;
		directXModelToolkit_149_.aEffectiveVertexArray7754 = this.aEffectiveVertexArray7754;
		directXModelToolkit_149_.aClass16Array7789 = this.aClass16Array7789;
		directXModelToolkit_149_.aShortArray7803 = this.aShortArray7803;
		directXModelToolkit_149_.animationFlag = i;
		return directXModelToolkit_149_;
	}

    int method4794(int i) {
		if (i < 2)
			i = 2;
		else if (i > 126)
			i = 126;
		return i;
	}

	public void method4784() {
		/* empty */
	}

	int method4795(int i, int i_289_) {
		i_289_ = i_289_ * (i & 0x7f) >> 7;
		if (i_289_ < 2)
			i_289_ = 2;
		else if (i_289_ > 126)
			i_289_ = 126;
		return (i & 0xff80) + i_289_;
	}

	public void S(int i) {
		if ((this.animationFlag & 0xd) != 13)
			throw new IllegalStateException();
		do {
			if (this.aClass1Array7755 != null) {
				if (i == 4096) {
					method4797();
					break;
				}
				if (i == 8192) {
					method4798();
					break;
				}
				if (i == 12288) {
					method4799();
					break;
				}
				int i_290_ = CircleAngleTable.SINE[i];
				int i_291_ = CircleAngleTable.COSINE[i];
				synchronized (this) {
					for (int i_292_ = 0; i_292_ < this.anInt7742; i_292_++) {
						int i_293_ = ((this.anIntArray7753[i_292_] * i_290_) + (this.anIntArray7751[i_292_] * i_291_)) >> 14;
						this.anIntArray7753[i_292_] = ((this.anIntArray7753[i_292_] * i_291_) - (this.anIntArray7751[i_292_] * i_290_)) >> 14;
						this.anIntArray7751[i_292_] = i_293_;
						if (this.aClass1Array7755[i_292_] != null) {
							i_293_ = ((this.aClass1Array7755[i_292_].anInt14) * i_290_ + (this.aClass1Array7755[i_292_].anInt13) * i_291_) >> 14;
							this.aClass1Array7755[i_292_].anInt14 = ((this.aClass1Array7755[i_292_].anInt14) * i_291_ - (this.aClass1Array7755[i_292_].anInt13) * i_290_) >> 14;
							this.aClass1Array7755[i_292_].anInt13 = i_293_;
						}
					}
					if (this.aClass5Array7740 != null) {
						for (int i_294_ = 0; i_294_ < this.anInt7757; i_294_++) {
							if (this.aClass5Array7740[i_294_] != null) {
								int i_295_ = (((this.aClass5Array7740[i_294_].anInt80) * i_290_ + (this.aClass5Array7740[i_294_].anInt78 * i_291_)) >> 14);
								this.aClass5Array7740[i_294_].anInt80 = ((this.aClass5Array7740[i_294_].anInt80) * i_291_ - (this.aClass5Array7740[i_294_].anInt78 * i_290_)) >> 14;
								this.aClass5Array7740[i_294_].anInt78 = i_295_;
							}
						}
					}
					for (int i_296_ = this.anInt7742; i_296_ < this.anInt7799; i_296_++) {
						int i_297_ = ((this.anIntArray7753[i_296_] * i_290_) + (this.anIntArray7751[i_296_] * i_291_)) >> 14;
						this.anIntArray7753[i_296_] = ((this.anIntArray7753[i_296_] * i_291_) - (this.anIntArray7751[i_296_] * i_290_)) >> 14;
						this.anIntArray7751[i_296_] = i_297_;
					}
					this.anInt7812 = 0;
					this.aBoolean7792 = false;
					break;
				}
			}
			f(i);
		} while (false);
	}

    void method4796() {
		synchronized (this) {
			for (int i = 0; i < this.anInt7799; i++) {
				this.anIntArray7751[i] = -this.anIntArray7751[i];
				this.anIntArray7753[i] = -this.anIntArray7753[i];
			}
			method4800();
		}
	}

	void method4797() {
		synchronized (this) {
			for (int i = 0; i < this.anInt7742; i++) {
				int i_298_ = this.anIntArray7751[i];
				this.anIntArray7751[i] = this.anIntArray7753[i];
				this.anIntArray7753[i] = -i_298_;
				if (this.aClass1Array7755[i] != null) {
					i_298_ = this.aClass1Array7755[i].anInt13;
					this.aClass1Array7755[i].anInt13 = this.aClass1Array7755[i].anInt14;
					this.aClass1Array7755[i].anInt14 = -i_298_;
				}
			}
			if (this.aClass5Array7740 != null) {
				for (int i = 0; i < this.anInt7757; i++) {
					if (this.aClass5Array7740[i] != null) {
						int i_299_ = (this.aClass5Array7740[i].anInt78);
						this.aClass5Array7740[i].anInt78 = this.aClass5Array7740[i].anInt80;
						this.aClass5Array7740[i].anInt80 = -i_299_;
					}
				}
			}
			for (int i = this.anInt7742; i < this.anInt7799; i++) {
				int i_300_ = this.anIntArray7751[i];
				this.anIntArray7751[i] = this.anIntArray7753[i];
				this.anIntArray7753[i] = -i_300_;
			}
			this.anInt7812 = 0;
			this.aBoolean7792 = false;
		}
	}

	void method4798() {
		synchronized (this) {
			for (int i = 0; i < this.anInt7742; i++) {
				this.anIntArray7751[i] = -this.anIntArray7751[i];
				this.anIntArray7753[i] = -this.anIntArray7753[i];
				if (this.aClass1Array7755[i] != null) {
					this.aClass1Array7755[i].anInt13 = -this.aClass1Array7755[i].anInt13;
					this.aClass1Array7755[i].anInt14 = -this.aClass1Array7755[i].anInt14;
				}
			}
			if (this.aClass5Array7740 != null) {
				for (int i = 0; i < this.anInt7757; i++) {
					if (this.aClass5Array7740[i] != null) {
						this.aClass5Array7740[i].anInt78 = -this.aClass5Array7740[i].anInt78;
						this.aClass5Array7740[i].anInt80 = -this.aClass5Array7740[i].anInt80;
					}
				}
			}
			for (int i = this.anInt7742; i < this.anInt7799; i++) {
				this.anIntArray7751[i] = -this.anIntArray7751[i];
				this.anIntArray7753[i] = -this.anIntArray7753[i];
			}
			this.anInt7812 = 0;
			this.aBoolean7792 = false;
		}
	}

	void method4799() {
		synchronized (this) {
			for (int i = 0; i < this.anInt7742; i++) {
				int i_301_ = this.anIntArray7753[i];
				this.anIntArray7753[i] = this.anIntArray7751[i];
				this.anIntArray7751[i] = -i_301_;
				if (this.aClass1Array7755[i] != null) {
					i_301_ = this.aClass1Array7755[i].anInt14;
					this.aClass1Array7755[i].anInt14 = this.aClass1Array7755[i].anInt13;
					this.aClass1Array7755[i].anInt13 = -i_301_;
				}
			}
			if (this.aClass5Array7740 != null) {
				for (int i = 0; i < this.anInt7757; i++) {
					if (this.aClass5Array7740[i] != null) {
						int i_302_ = (this.aClass5Array7740[i].anInt80);
						this.aClass5Array7740[i].anInt80 = this.aClass5Array7740[i].anInt78;
						this.aClass5Array7740[i].anInt78 = -i_302_;
					}
				}
			}
			for (int i = this.anInt7742; i < this.anInt7799; i++) {
				int i_303_ = this.anIntArray7753[i];
				this.anIntArray7753[i] = this.anIntArray7751[i];
				this.anIntArray7751[i] = -i_303_;
			}
			this.anInt7812 = 0;
			this.aBoolean7792 = false;
		}
	}

	public void t(int i) {
		if ((this.animationFlag & 0x6) != 6)
			throw new IllegalStateException();
		int i_304_ = CircleAngleTable.SINE[i];
		int i_305_ = CircleAngleTable.COSINE[i];
		synchronized (this) {
			for (int i_306_ = 0; i_306_ < this.anInt7799; i_306_++) {
				int i_307_ = ((this.anIntArray7752[i_306_] * i_305_ - (this.anIntArray7753[i_306_] * i_304_)) >> 14);
				this.anIntArray7753[i_306_] = (this.anIntArray7752[i_306_] * i_304_ + (this.anIntArray7753[i_306_] * i_305_)) >> 14;
				this.anIntArray7752[i_306_] = i_307_;
			}
			method4800();
		}
	}

	public void EA(int i) {
		if ((this.animationFlag & 0x3) != 3)
			throw new IllegalStateException();
		int i_308_ = CircleAngleTable.SINE[i];
		int i_309_ = CircleAngleTable.COSINE[i];
		synchronized (this) {
			for (int i_310_ = 0; i_310_ < this.anInt7799; i_310_++) {
				int i_311_ = ((this.anIntArray7752[i_310_] * i_308_ + (this.anIntArray7751[i_310_] * i_309_)) >> 14);
				this.anIntArray7752[i_310_] = (this.anIntArray7752[i_310_] * i_309_ - (this.anIntArray7751[i_310_] * i_308_)) >> 14;
				this.anIntArray7751[i_310_] = i_311_;
			}
			method4800();
		}
	}

    public void oa(int i, int i_312_, int i_313_) {
		if (i != 128 && (this.animationFlag & 0x1) != 1)
			throw new IllegalStateException();
		if (i_312_ != 128 && (this.animationFlag & 0x2) != 2)
			throw new IllegalStateException();
		if (i_313_ != 128 && (this.animationFlag & 0x4) != 4)
			throw new IllegalStateException();
		synchronized (this) {
			for (int i_314_ = 0; i_314_ < this.anInt7799; i_314_++) {
				this.anIntArray7751[i_314_] = this.anIntArray7751[i_314_] * i >> 7;
				this.anIntArray7752[i_314_] = (this.anIntArray7752[i_314_] * i_312_ >> 7);
				this.anIntArray7753[i_314_] = (this.anIntArray7753[i_314_] * i_313_ >> 7);
			}
			this.aBoolean7792 = false;
		}
	}

	public void pa(int i, int i_315_, FloorToolkit class_xa, FloorToolkit class_xa_316_, int i_317_, int i_318_, int i_319_) {
		if (i == 3) {
			if ((this.animationFlag & 0x7) != 7)
				throw new IllegalStateException();
		} else if ((this.animationFlag & 0x2) != 2)
			throw new IllegalStateException();
		if (!this.aBoolean7792)
			method4807();
		int i_320_ = i_317_ + this.aShort7797;
		int i_321_ = i_317_ + this.aShort7743;
		int i_322_ = i_319_ + this.aShort7795;
		int i_323_ = i_319_ + this.aShort7800;
		if (i == 4 || (i_320_ >= 0 && ((i_321_ + class_xa.anInt6288 * -1212653763 >> class_xa.anInt6289 * -2137349879) < class_xa.anInt6287 * -506105871) && i_322_ >= 0 && ((i_323_ + class_xa.anInt6288 * -1212653763 >> class_xa.anInt6289 * -2137349879) < class_xa.anInt6286 * -1148794921))) {
			int[][] is = class_xa.anIntArrayArray6290;
			int[][] is_324_ = null;
			if (class_xa_316_ != null)
				is_324_ = class_xa_316_.anIntArrayArray6290;
			if (i == 4 || i == 5) {
				if (class_xa_316_ == null || (i_320_ < 0 || ((i_321_ + class_xa_316_.anInt6288 * -1212653763 >> class_xa_316_.anInt6289 * -2137349879) >= class_xa_316_.anInt6287 * -506105871) || i_322_ < 0 || ((i_323_ + class_xa_316_.anInt6288 * -1212653763 >> class_xa_316_.anInt6289 * -2137349879) >= class_xa_316_.anInt6286 * -1148794921)))
					return;
			} else {
				i_320_ >>= class_xa.anInt6289 * -2137349879;
				i_321_ = (i_321_ + (class_xa.anInt6288 * -1212653763 - 1) >> class_xa.anInt6289 * -2137349879);
				i_322_ >>= class_xa.anInt6289 * -2137349879;
				i_323_ = (i_323_ + (class_xa.anInt6288 * -1212653763 - 1) >> class_xa.anInt6289 * -2137349879);
				if (is[i_320_][i_322_] == i_318_ && is[i_321_][i_322_] == i_318_ && is[i_320_][i_323_] == i_318_ && is[i_321_][i_323_] == i_318_)
					return;
			}
			synchronized (this) {
				if (i == 1) {
					int i_325_ = class_xa.anInt6288 * -1212653763 - 1;
					for (int i_326_ = 0; i_326_ < this.anInt7742; i_326_++) {
						int i_327_ = (this.anIntArray7751[i_326_] + i_317_);
						int i_328_ = (this.anIntArray7753[i_326_] + i_319_);
						int i_329_ = i_327_ & i_325_;
						int i_330_ = i_328_ & i_325_;
						int i_331_ = i_327_ >> class_xa.anInt6289 * -2137349879;
						int i_332_ = i_328_ >> class_xa.anInt6289 * -2137349879;
						int i_333_ = (((is[i_331_][i_332_] * (class_xa.anInt6288 * -1212653763 - i_329_)) + is[i_331_ + 1][i_332_] * i_329_) >> class_xa.anInt6289 * -2137349879);
						int i_334_ = (((is[i_331_][i_332_ + 1] * (class_xa.anInt6288 * -1212653763 - i_329_)) + is[i_331_ + 1][i_332_ + 1] * i_329_) >> class_xa.anInt6289 * -2137349879);
						int i_335_ = (i_333_ * (class_xa.anInt6288 * -1212653763 - i_330_) + i_334_ * i_330_ >> class_xa.anInt6289 * -2137349879);
						this.anIntArray7752[i_326_] = (this.anIntArray7752[i_326_] + i_335_ - i_318_);
					}
					for (int i_336_ = this.anInt7742; i_336_ < this.anInt7799; i_336_++) {
						int i_337_ = (this.anIntArray7751[i_336_] + i_317_);
						int i_338_ = (this.anIntArray7753[i_336_] + i_319_);
						int i_339_ = i_337_ & i_325_;
						int i_340_ = i_338_ & i_325_;
						int i_341_ = i_337_ >> class_xa.anInt6289 * -2137349879;
						int i_342_ = i_338_ >> class_xa.anInt6289 * -2137349879;
						if (i_341_ >= 0 && i_341_ < is.length - 1 && i_342_ >= 0 && i_342_ < is[0].length - 1) {
							int i_343_ = (((is[i_341_][i_342_] * (class_xa.anInt6288 * -1212653763 - i_339_)) + is[i_341_ + 1][i_342_] * i_339_) >> class_xa.anInt6289 * -2137349879);
							int i_344_ = (((is[i_341_][i_342_ + 1] * (class_xa.anInt6288 * -1212653763 - i_339_)) + is[i_341_ + 1][i_342_ + 1] * i_339_) >> class_xa.anInt6289 * -2137349879);
							int i_345_ = (i_343_ * (class_xa.anInt6288 * -1212653763 - i_340_) + i_344_ * i_340_ >> class_xa.anInt6289 * -2137349879);
							this.anIntArray7752[i_336_] = (this.anIntArray7752[i_336_]) + i_345_ - i_318_;
						}
					}
				} else if (i == 2) {
					int i_346_ = class_xa.anInt6288 * -1212653763 - 1;
					for (int i_347_ = 0; i_347_ < this.anInt7742; i_347_++) {
						int i_348_ = ((this.anIntArray7752[i_347_] << 16) / this.aShort7770);
						if (i_348_ < i_315_) {
							int i_349_ = ((this.anIntArray7751[i_347_]) + i_317_);
							int i_350_ = ((this.anIntArray7753[i_347_]) + i_319_);
							int i_351_ = i_349_ & i_346_;
							int i_352_ = i_350_ & i_346_;
							int i_353_ = i_349_ >> class_xa.anInt6289 * -2137349879;
							int i_354_ = i_350_ >> class_xa.anInt6289 * -2137349879;
							int i_355_ = (((is[i_353_][i_354_] * (class_xa.anInt6288 * -1212653763 - i_351_)) + is[i_353_ + 1][i_354_] * i_351_) >> class_xa.anInt6289 * -2137349879);
							int i_356_ = (((is[i_353_][i_354_ + 1] * (class_xa.anInt6288 * -1212653763 - i_351_)) + is[i_353_ + 1][i_354_ + 1] * i_351_) >> class_xa.anInt6289 * -2137349879);
							int i_357_ = (i_355_ * (class_xa.anInt6288 * -1212653763 - i_352_) + i_356_ * i_352_ >> class_xa.anInt6289 * -2137349879);
							this.anIntArray7752[i_347_] = ((this.anIntArray7752[i_347_]) + ((i_357_ - i_318_) * (i_315_ - i_348_) / i_315_));
						} else
							this.anIntArray7752[i_347_] = (this.anIntArray7752[i_347_]);
					}
					for (int i_358_ = this.anInt7742; i_358_ < this.anInt7799; i_358_++) {
						int i_359_ = ((this.anIntArray7752[i_358_] << 16) / this.aShort7770);
						if (i_359_ < i_315_) {
							int i_360_ = ((this.anIntArray7751[i_358_]) + i_317_);
							int i_361_ = ((this.anIntArray7753[i_358_]) + i_319_);
							int i_362_ = i_360_ & i_346_;
							int i_363_ = i_361_ & i_346_;
							int i_364_ = i_360_ >> class_xa.anInt6289 * -2137349879;
							int i_365_ = i_361_ >> class_xa.anInt6289 * -2137349879;
							if (i_364_ >= 0 && i_364_ < class_xa.anInt6287 * -506105871 - 1 && i_365_ >= 0 && (i_365_ < class_xa.anInt6286 * -1148794921 - 1)) {
								int i_366_ = (((is[i_364_][i_365_] * (class_xa.anInt6288 * -1212653763 - i_362_)) + is[i_364_ + 1][i_365_] * i_362_) >> class_xa.anInt6289 * -2137349879);
								int i_367_ = (((is[i_364_][i_365_ + 1] * (class_xa.anInt6288 * -1212653763 - i_362_)) + is[i_364_ + 1][i_365_ + 1] * i_362_) >> class_xa.anInt6289 * -2137349879);
								int i_368_ = ((i_366_ * (class_xa.anInt6288 * -1212653763 - i_363_)) + i_367_ * i_363_ >> class_xa.anInt6289 * -2137349879);
								this.anIntArray7752[i_358_] = ((this.anIntArray7752[i_358_]) + ((i_368_ - i_318_) * (i_315_ - i_359_) / i_315_));
							}
						} else
							this.anIntArray7752[i_358_] = (this.anIntArray7752[i_358_]);
					}
				} else if (i == 3) {
					int i_369_ = (i_315_ & 0xff) * 4;
					int i_370_ = (i_315_ >> 8 & 0xff) * 4;
					int i_371_ = (i_315_ >> 16 & 0xff) << 6;
					int i_372_ = (i_315_ >> 24 & 0xff) << 6;
					if (i_317_ - (i_369_ >> 1) < 0 || ((i_317_ + (i_369_ >> 1) + class_xa.anInt6288 * -1212653763) >= (class_xa.anInt6287 * -506105871 << class_xa.anInt6289 * -2137349879)) || i_319_ - (i_370_ >> 1) < 0 || ((i_319_ + (i_370_ >> 1) + class_xa.anInt6288 * -1212653763) >= (class_xa.anInt6286 * -1148794921 << class_xa.anInt6289 * -2137349879)))
						return;
					method4732(class_xa, i_317_, i_318_, i_319_, i_369_, i_370_, i_371_, i_372_);
				} else if (i == 4) {
					int i_373_ = class_xa_316_.anInt6288 * -1212653763 - 1;
					int i_374_ = (this.aShort7796 - this.aShort7770);
					for (int i_375_ = 0; i_375_ < this.anInt7742; i_375_++) {
						int i_376_ = (this.anIntArray7751[i_375_] + i_317_);
						int i_377_ = (this.anIntArray7753[i_375_] + i_319_);
						int i_378_ = i_376_ & i_373_;
						int i_379_ = i_377_ & i_373_;
						int i_380_ = i_376_ >> class_xa_316_.anInt6289 * -2137349879;
						int i_381_ = i_377_ >> class_xa_316_.anInt6289 * -2137349879;
						int i_382_ = (((is_324_[i_380_][i_381_] * (class_xa_316_.anInt6288 * -1212653763 - i_378_)) + is_324_[i_380_ + 1][i_381_] * i_378_) >> class_xa_316_.anInt6289 * -2137349879);
						int i_383_ = (((is_324_[i_380_][i_381_ + 1] * (class_xa_316_.anInt6288 * -1212653763 - i_378_)) + is_324_[i_380_ + 1][i_381_ + 1] * i_378_) >> class_xa_316_.anInt6289 * -2137349879);
						int i_384_ = (i_382_ * (class_xa_316_.anInt6288 * -1212653763 - i_379_) + i_383_ * i_379_ >> class_xa_316_.anInt6289 * -2137349879);
						this.anIntArray7752[i_375_] = (this.anIntArray7752[i_375_] + (i_384_ - i_318_) + i_374_);
					}
					for (int i_385_ = this.anInt7742; i_385_ < this.anInt7799; i_385_++) {
						int i_386_ = (this.anIntArray7751[i_385_] + i_317_);
						int i_387_ = (this.anIntArray7753[i_385_] + i_319_);
						int i_388_ = i_386_ & i_373_;
						int i_389_ = i_387_ & i_373_;
						int i_390_ = i_386_ >> class_xa_316_.anInt6289 * -2137349879;
						int i_391_ = i_387_ >> class_xa_316_.anInt6289 * -2137349879;
						if (i_390_ >= 0 && (i_390_ < class_xa_316_.anInt6287 * -506105871 - 1) && i_391_ >= 0 && (i_391_ < class_xa_316_.anInt6286 * -1148794921 - 1)) {
							int i_392_ = (((is_324_[i_390_][i_391_] * (class_xa_316_.anInt6288 * -1212653763 - i_388_)) + is_324_[i_390_ + 1][i_391_] * i_388_) >> class_xa_316_.anInt6289 * -2137349879);
							int i_393_ = (((is_324_[i_390_][i_391_ + 1] * (class_xa_316_.anInt6288 * -1212653763 - i_388_)) + is_324_[i_390_ + 1][i_391_ + 1] * i_388_) >> class_xa_316_.anInt6289 * -2137349879);
							int i_394_ = ((i_392_ * (class_xa_316_.anInt6288 * -1212653763 - i_389_)) + i_393_ * i_389_ >> class_xa_316_.anInt6289 * -2137349879);
							this.anIntArray7752[i_385_] = (this.anIntArray7752[i_385_]) + (i_394_ - i_318_) + i_374_;
						}
					}
				} else if (i == 5) {
					int i_395_ = class_xa_316_.anInt6288 * -1212653763 - 1;
					int i_396_ = (this.aShort7796 - this.aShort7770);
					for (int i_397_ = 0; i_397_ < this.anInt7742; i_397_++) {
						int i_398_ = (this.anIntArray7751[i_397_] + i_317_);
						int i_399_ = (this.anIntArray7753[i_397_] + i_319_);
						int i_400_ = i_398_ & i_395_;
						int i_401_ = i_399_ & i_395_;
						int i_402_ = i_398_ >> class_xa.anInt6289 * -2137349879;
						int i_403_ = i_399_ >> class_xa.anInt6289 * -2137349879;
						int i_404_ = (((is[i_402_][i_403_] * (class_xa.anInt6288 * -1212653763 - i_400_)) + is[i_402_ + 1][i_403_] * i_400_) >> class_xa.anInt6289 * -2137349879);
						int i_405_ = (((is[i_402_][i_403_ + 1] * (class_xa.anInt6288 * -1212653763 - i_400_)) + is[i_402_ + 1][i_403_ + 1] * i_400_) >> class_xa.anInt6289 * -2137349879);
						int i_406_ = (i_404_ * (class_xa.anInt6288 * -1212653763 - i_401_) + i_405_ * i_401_ >> class_xa.anInt6289 * -2137349879);
						i_404_ = (((is_324_[i_402_][i_403_] * (class_xa_316_.anInt6288 * -1212653763 - i_400_)) + is_324_[i_402_ + 1][i_403_] * i_400_) >> class_xa_316_.anInt6289 * -2137349879);
						i_405_ = ((is_324_[i_402_][i_403_ + 1] * ((class_xa_316_.anInt6288 * -1212653763) - i_400_)) + (is_324_[i_402_ + 1][i_403_ + 1] * i_400_)) >> (class_xa_316_.anInt6289 * -2137349879);
						int i_407_ = (i_404_ * (class_xa_316_.anInt6288 * -1212653763 - i_401_) + i_405_ * i_401_ >> class_xa_316_.anInt6289 * -2137349879);
						int i_408_ = i_406_ - i_407_ - i_315_;
						this.anIntArray7752[i_397_] = ((this.anIntArray7752[i_397_] << 8) / i_396_ * i_408_ >> 8) - (i_318_ - i_406_);
					}
					for (int i_409_ = this.anInt7742; i_409_ < this.anInt7799; i_409_++) {
						int i_410_ = (this.anIntArray7751[i_409_] + i_317_);
						int i_411_ = (this.anIntArray7753[i_409_] + i_319_);
						int i_412_ = i_410_ & i_395_;
						int i_413_ = i_411_ & i_395_;
						int i_414_ = i_410_ >> class_xa.anInt6289 * -2137349879;
						int i_415_ = i_411_ >> class_xa.anInt6289 * -2137349879;
						if (i_414_ >= 0 && i_414_ < class_xa.anInt6287 * -506105871 - 1 && (i_414_ < class_xa_316_.anInt6287 * -506105871 - 1) && i_415_ >= 0 && i_415_ < class_xa.anInt6286 * -1148794921 - 1 && (i_415_ < class_xa_316_.anInt6286 * -1148794921 - 1)) {
							int i_416_ = (((is[i_414_][i_415_] * (class_xa.anInt6288 * -1212653763 - i_412_)) + is[i_414_ + 1][i_415_] * i_412_) >> class_xa.anInt6289 * -2137349879);
							int i_417_ = (((is[i_414_][i_415_ + 1] * (class_xa.anInt6288 * -1212653763 - i_412_)) + is[i_414_ + 1][i_415_ + 1] * i_412_) >> class_xa.anInt6289 * -2137349879);
							int i_418_ = (i_416_ * (class_xa.anInt6288 * -1212653763 - i_413_) + i_417_ * i_413_ >> class_xa.anInt6289 * -2137349879);
							i_416_ = (((is_324_[i_414_][i_415_] * (class_xa_316_.anInt6288 * -1212653763 - i_412_)) + is_324_[i_414_ + 1][i_415_] * i_412_) >> class_xa_316_.anInt6289 * -2137349879);
							i_417_ = (((is_324_[i_414_][i_415_ + 1] * (class_xa_316_.anInt6288 * -1212653763 - i_412_)) + is_324_[i_414_ + 1][i_415_ + 1] * i_412_) >> class_xa_316_.anInt6289 * -2137349879);
							int i_419_ = ((i_416_ * (class_xa_316_.anInt6288 * -1212653763 - i_413_)) + i_417_ * i_413_ >> class_xa_316_.anInt6289 * -2137349879);
							int i_420_ = i_418_ - i_419_ - i_315_;
							this.anIntArray7752[i_409_] = (((this.anIntArray7752[i_409_]) << 8) / i_396_ * i_420_ >> 8) - (i_318_ - i_418_);
						}
					}
				}
				this.aBoolean7792 = false;
			}
		}
	}

	void method4800() {
		this.aClass1Array7755 = null;
		this.aClass1Array7786 = null;
		this.aClass5Array7740 = null;
		this.aBoolean7792 = false;
	}

	void method4734() {
		if ((this.javaGraphicsToolkit.anInt7999) * -922307687 > 1) {
			synchronized (this) {
				aBoolean4148 = false;
				this.notifyAll();
			}
		}
	}

	public int o() {
		if (!this.aBoolean7792)
			method4807();
		return this.aShort7796;
	}

	boolean method4801(int i, int i_421_, float f, float f_422_, float f_423_, float f_424_, float f_425_, float f_426_) {
		if ((float) i_421_ < f && (float) i_421_ < f_422_ && (float) i_421_ < f_423_)
			return false;
		if ((float) i_421_ > f && (float) i_421_ > f_422_ && (float) i_421_ > f_423_)
			return false;
		if ((float) i < f_424_ && (float) i < f_425_ && (float) i < f_426_)
			return false;
        return !((float) i > f_424_ && (float) i > f_425_ && (float) i > f_426_);
    }

    void e(int transformationType, int[] is, int i_427_, int i_428_, int i_429_, boolean bool, int i_430_, int[] is_431_) {
		int i_432_ = is.length;
		if (transformationType == AnimationFrameBase.UNKNOWN0) {
			i_427_ <<= 4;
			i_428_ <<= 4;
			i_429_ <<= 4;
			if (!this.aBoolean7780) {
				for (int i_433_ = 0; i_433_ < this.anInt7799; i_433_++) {
					this.anIntArray7751[i_433_] <<= 4;
					this.anIntArray7752[i_433_] <<= 4;
					this.anIntArray7753[i_433_] <<= 4;
				}
				this.aBoolean7780 = true;
			}
			int i_434_ = 0;
			this.anInt7782 = 0;
			this.anInt7783 = 0;
			this.anInt7781 = 0;
			for (int i_435_ = 0; i_435_ < i_432_; i_435_++) {
				int i_436_ = is[i_435_];
				if (i_436_ < this.anIntArrayArray7778.length) {
					int[] is_437_ = this.anIntArrayArray7778[i_436_];
					for (int i_438_ = 0; i_438_ < is_437_.length; i_438_++) {
						int i_439_ = is_437_[i_438_];
						if (this.aShortArray7816 == null || (i_430_ & (this.aShortArray7816[i_439_])) != 0) {
							this.anInt7782 += (this.anIntArray7751[i_439_]);
							this.anInt7783 += (this.anIntArray7752[i_439_]);
							this.anInt7781 += (this.anIntArray7753[i_439_]);
							i_434_++;
						}
					}
				}
			}
			if (i_434_ > 0) {
				this.anInt7782 = this.anInt7782 / i_434_ + i_427_;
				this.anInt7783 = this.anInt7783 / i_434_ + i_428_;
				this.anInt7781 = this.anInt7781 / i_434_ + i_429_;
				this.aBoolean7785 = true;
			} else {
				this.anInt7782 = i_427_;
				this.anInt7783 = i_428_;
				this.anInt7781 = i_429_;
			}
		} else if (transformationType == AnimationFrameBase.UNKNOWN1) {
			if (is_431_ != null) {
				int i_440_ = ((is_431_[0] * i_427_ + is_431_[1] * i_428_ + is_431_[2] * i_429_ + 8192) >> 14);
				int i_441_ = ((is_431_[3] * i_427_ + is_431_[4] * i_428_ + is_431_[5] * i_429_ + 8192) >> 14);
				int i_442_ = ((is_431_[6] * i_427_ + is_431_[7] * i_428_ + is_431_[8] * i_429_ + 8192) >> 14);
				i_427_ = i_440_;
				i_428_ = i_441_;
				i_429_ = i_442_;
			}
			i_427_ <<= 4;
			i_428_ <<= 4;
			i_429_ <<= 4;
			if (!this.aBoolean7780) {
				for (int i_443_ = 0; i_443_ < this.anInt7799; i_443_++) {
					this.anIntArray7751[i_443_] <<= 4;
					this.anIntArray7752[i_443_] <<= 4;
					this.anIntArray7753[i_443_] <<= 4;
				}
				this.aBoolean7780 = true;
			}
			for (int i_444_ = 0; i_444_ < i_432_; i_444_++) {
				int i_445_ = is[i_444_];
				if (i_445_ < this.anIntArrayArray7778.length) {
					int[] is_446_ = this.anIntArrayArray7778[i_445_];
					for (int i_447_ = 0; i_447_ < is_446_.length; i_447_++) {
						int i_448_ = is_446_[i_447_];
						if (this.aShortArray7816 == null || (i_430_ & (this.aShortArray7816[i_448_])) != 0) {
							this.anIntArray7751[i_448_] += i_427_;
							this.anIntArray7752[i_448_] += i_428_;
							this.anIntArray7753[i_448_] += i_429_;
						}
					}
				}
			}
		} else if (transformationType == AnimationFrameBase.UNKNOWN2) {
			if (is_431_ != null) {
				if (!this.aBoolean7780) {
					for (int i_449_ = 0; i_449_ < this.anInt7799; i_449_++) {
						this.anIntArray7751[i_449_] <<= 4;
						this.anIntArray7752[i_449_] <<= 4;
						this.anIntArray7753[i_449_] <<= 4;
					}
					this.aBoolean7780 = true;
				}
				int i_450_ = is_431_[9] << 4;
				int i_451_ = is_431_[10] << 4;
				int i_452_ = is_431_[11] << 4;
				int i_453_ = is_431_[12] << 4;
				int i_454_ = is_431_[13] << 4;
				int i_455_ = is_431_[14] << 4;
				if (this.aBoolean7785) {
					int i_456_ = ((is_431_[0] * this.anInt7782 + is_431_[3] * this.anInt7783 + is_431_[6] * this.anInt7781 + 8192) >> 14);
					int i_457_ = ((is_431_[1] * this.anInt7782 + is_431_[4] * this.anInt7783 + is_431_[7] * this.anInt7781 + 8192) >> 14);
					int i_458_ = ((is_431_[2] * this.anInt7782 + is_431_[5] * this.anInt7783 + is_431_[8] * this.anInt7781 + 8192) >> 14);
					i_456_ += i_453_;
					i_457_ += i_454_;
					i_458_ += i_455_;
					this.anInt7782 = i_456_;
					this.anInt7783 = i_457_;
					this.anInt7781 = i_458_;
					this.aBoolean7785 = false;
				}
				int[] is_459_ = new int[9];
				int i_460_ = CircleAngleTable.COSINE[i_427_];
				int i_461_ = CircleAngleTable.SINE[i_427_];
				int i_462_ = CircleAngleTable.COSINE[i_428_];
				int i_463_ = CircleAngleTable.SINE[i_428_];
				int i_464_ = CircleAngleTable.COSINE[i_429_];
				int i_465_ = CircleAngleTable.SINE[i_429_];
				int i_466_ = i_461_ * i_464_ + 8192 >> 14;
				int i_467_ = i_461_ * i_465_ + 8192 >> 14;
				is_459_[0] = i_462_ * i_464_ + i_463_ * i_467_ + 8192 >> 14;
				is_459_[1] = -i_462_ * i_465_ + i_463_ * i_466_ + 8192 >> 14;
				is_459_[2] = i_463_ * i_460_ + 8192 >> 14;
				is_459_[3] = i_460_ * i_465_ + 8192 >> 14;
				is_459_[4] = i_460_ * i_464_ + 8192 >> 14;
				is_459_[5] = -i_461_;
				is_459_[6] = -i_463_ * i_464_ + i_462_ * i_467_ + 8192 >> 14;
				is_459_[7] = i_463_ * i_465_ + i_462_ * i_466_ + 8192 >> 14;
				is_459_[8] = i_462_ * i_460_ + 8192 >> 14;
				int i_468_ = ((is_459_[0] * -this.anInt7782 + is_459_[1] * -this.anInt7783 + is_459_[2] * -this.anInt7781 + 8192) >> 14);
				int i_469_ = ((is_459_[3] * -this.anInt7782 + is_459_[4] * -this.anInt7783 + is_459_[5] * -this.anInt7781 + 8192) >> 14);
				int i_470_ = ((is_459_[6] * -this.anInt7782 + is_459_[7] * -this.anInt7783 + is_459_[8] * -this.anInt7781 + 8192) >> 14);
				int i_471_ = i_468_ + this.anInt7782;
				int i_472_ = i_469_ + this.anInt7783;
				int i_473_ = i_470_ + this.anInt7781;
				int[] is_474_ = new int[9];
				for (int i_475_ = 0; i_475_ < 3; i_475_++) {
					for (int i_476_ = 0; i_476_ < 3; i_476_++) {
						int i_477_ = 0;
						for (int i_478_ = 0; i_478_ < 3; i_478_++)
							i_477_ += (is_459_[i_475_ * 3 + i_478_] * is_431_[i_476_ * 3 + i_478_]);
						is_474_[i_475_ * 3 + i_476_] = i_477_ + 8192 >> 14;
					}
				}
				int i_479_ = ((is_459_[0] * i_453_ + is_459_[1] * i_454_ + is_459_[2] * i_455_ + 8192) >> 14);
				int i_480_ = ((is_459_[3] * i_453_ + is_459_[4] * i_454_ + is_459_[5] * i_455_ + 8192) >> 14);
				int i_481_ = ((is_459_[6] * i_453_ + is_459_[7] * i_454_ + is_459_[8] * i_455_ + 8192) >> 14);
				i_479_ += i_471_;
				i_480_ += i_472_;
				i_481_ += i_473_;
				int[] is_482_ = new int[9];
				for (int i_483_ = 0; i_483_ < 3; i_483_++) {
					for (int i_484_ = 0; i_484_ < 3; i_484_++) {
						int i_485_ = 0;
						for (int i_486_ = 0; i_486_ < 3; i_486_++)
							i_485_ += (is_431_[i_483_ * 3 + i_486_] * is_474_[i_484_ + i_486_ * 3]);
						is_482_[i_483_ * 3 + i_484_] = i_485_ + 8192 >> 14;
					}
				}
				int i_487_ = ((is_431_[0] * i_479_ + is_431_[1] * i_480_ + is_431_[2] * i_481_ + 8192) >> 14);
				int i_488_ = ((is_431_[3] * i_479_ + is_431_[4] * i_480_ + is_431_[5] * i_481_ + 8192) >> 14);
				int i_489_ = ((is_431_[6] * i_479_ + is_431_[7] * i_480_ + is_431_[8] * i_481_ + 8192) >> 14);
				i_487_ += i_450_;
				i_488_ += i_451_;
				i_489_ += i_452_;
				for (int i_490_ = 0; i_490_ < i_432_; i_490_++) {
					int i_491_ = is[i_490_];
					if (i_491_ < this.anIntArrayArray7778.length) {
						int[] is_492_ = (this.anIntArrayArray7778[i_491_]);
						for (int i_493_ = 0; i_493_ < is_492_.length; i_493_++) {
							int i_494_ = is_492_[i_493_];
							if (this.aShortArray7816 == null || ((i_430_ & (this.aShortArray7816[i_494_])) != 0)) {
								int i_495_ = (is_482_[0] * (this.anIntArray7751[i_494_]) + is_482_[1] * (this.anIntArray7752[i_494_]) + is_482_[2] * (this.anIntArray7753[i_494_]) + 8192) >> 14;
								int i_496_ = (is_482_[3] * (this.anIntArray7751[i_494_]) + is_482_[4] * (this.anIntArray7752[i_494_]) + is_482_[5] * (this.anIntArray7753[i_494_]) + 8192) >> 14;
								int i_497_ = (is_482_[6] * (this.anIntArray7751[i_494_]) + is_482_[7] * (this.anIntArray7752[i_494_]) + is_482_[8] * (this.anIntArray7753[i_494_]) + 8192) >> 14;
								i_495_ += i_487_;
								i_496_ += i_488_;
								i_497_ += i_489_;
								this.anIntArray7751[i_494_] = i_495_;
								this.anIntArray7752[i_494_] = i_496_;
								this.anIntArray7753[i_494_] = i_497_;
							}
						}
					}
				}
			} else {
				for (int i_498_ = 0; i_498_ < i_432_; i_498_++) {
					int i_499_ = is[i_498_];
					if (i_499_ < this.anIntArrayArray7778.length) {
						int[] is_500_ = (this.anIntArrayArray7778[i_499_]);
						for (int i_501_ = 0; i_501_ < is_500_.length; i_501_++) {
							int i_502_ = is_500_[i_501_];
							if (this.aShortArray7816 == null || ((i_430_ & (this.aShortArray7816[i_502_])) != 0)) {
								this.anIntArray7751[i_502_] -= this.anInt7782;
								this.anIntArray7752[i_502_] -= this.anInt7783;
								this.anIntArray7753[i_502_] -= this.anInt7781;
								if (i_429_ != 0) {
									int i_503_ = CircleAngleTable.SINE[i_429_];
									int i_504_ = CircleAngleTable.COSINE[i_429_];
									int i_505_ = ((this.anIntArray7752[i_502_]) * i_503_ + (this.anIntArray7751[i_502_]) * i_504_ + 16383) >> 14;
									this.anIntArray7752[i_502_] = ((this.anIntArray7752[i_502_]) * i_504_ - (this.anIntArray7751[i_502_]) * i_503_ + 16383) >> 14;
									this.anIntArray7751[i_502_] = i_505_;
								}
								if (i_427_ != 0) {
									int i_506_ = CircleAngleTable.SINE[i_427_];
									int i_507_ = CircleAngleTable.COSINE[i_427_];
									int i_508_ = ((this.anIntArray7752[i_502_]) * i_507_ - (this.anIntArray7753[i_502_]) * i_506_ + 16383) >> 14;
									this.anIntArray7753[i_502_] = ((this.anIntArray7752[i_502_]) * i_506_ + (this.anIntArray7753[i_502_]) * i_507_ + 16383) >> 14;
									this.anIntArray7752[i_502_] = i_508_;
								}
								if (i_428_ != 0) {
									int i_509_ = CircleAngleTable.SINE[i_428_];
									int i_510_ = CircleAngleTable.COSINE[i_428_];
									int i_511_ = ((this.anIntArray7753[i_502_]) * i_509_ + (this.anIntArray7751[i_502_]) * i_510_ + 16383) >> 14;
									this.anIntArray7753[i_502_] = ((this.anIntArray7753[i_502_]) * i_510_ - (this.anIntArray7751[i_502_]) * i_509_ + 16383) >> 14;
									this.anIntArray7751[i_502_] = i_511_;
								}
								this.anIntArray7751[i_502_] += this.anInt7782;
								this.anIntArray7752[i_502_] += this.anInt7783;
								this.anIntArray7753[i_502_] += this.anInt7781;
							}
						}
					}
				}
			}
		} else if (transformationType == AnimationFrameBase.UNKNOWN3) {
			if (is_431_ != null) {
				if (!this.aBoolean7780) {
					for (int i_512_ = 0; i_512_ < this.anInt7799; i_512_++) {
						this.anIntArray7751[i_512_] <<= 4;
						this.anIntArray7752[i_512_] <<= 4;
						this.anIntArray7753[i_512_] <<= 4;
					}
					this.aBoolean7780 = true;
				}
				int i_513_ = is_431_[9] << 4;
				int i_514_ = is_431_[10] << 4;
				int i_515_ = is_431_[11] << 4;
				int i_516_ = is_431_[12] << 4;
				int i_517_ = is_431_[13] << 4;
				int i_518_ = is_431_[14] << 4;
				if (this.aBoolean7785) {
					int i_519_ = ((is_431_[0] * this.anInt7782 + is_431_[3] * this.anInt7783 + is_431_[6] * this.anInt7781 + 8192) >> 14);
					int i_520_ = ((is_431_[1] * this.anInt7782 + is_431_[4] * this.anInt7783 + is_431_[7] * this.anInt7781 + 8192) >> 14);
					int i_521_ = ((is_431_[2] * this.anInt7782 + is_431_[5] * this.anInt7783 + is_431_[8] * this.anInt7781 + 8192) >> 14);
					i_519_ += i_516_;
					i_520_ += i_517_;
					i_521_ += i_518_;
					this.anInt7782 = i_519_;
					this.anInt7783 = i_520_;
					this.anInt7781 = i_521_;
					this.aBoolean7785 = false;
				}
				int i_522_ = i_427_ << 15 >> 7;
				int i_523_ = i_428_ << 15 >> 7;
				int i_524_ = i_429_ << 15 >> 7;
				int i_525_ = i_522_ * -this.anInt7782 + 8192 >> 14;
				int i_526_ = i_523_ * -this.anInt7783 + 8192 >> 14;
				int i_527_ = i_524_ * -this.anInt7781 + 8192 >> 14;
				int i_528_ = i_525_ + this.anInt7782;
				int i_529_ = i_526_ + this.anInt7783;
				int i_530_ = i_527_ + this.anInt7781;
				int[] is_531_ = new int[9];
				is_531_[0] = i_522_ * is_431_[0] + 8192 >> 14;
				is_531_[1] = i_522_ * is_431_[3] + 8192 >> 14;
				is_531_[2] = i_522_ * is_431_[6] + 8192 >> 14;
				is_531_[3] = i_523_ * is_431_[1] + 8192 >> 14;
				is_531_[4] = i_523_ * is_431_[4] + 8192 >> 14;
				is_531_[5] = i_523_ * is_431_[7] + 8192 >> 14;
				is_531_[6] = i_524_ * is_431_[2] + 8192 >> 14;
				is_531_[7] = i_524_ * is_431_[5] + 8192 >> 14;
				is_531_[8] = i_524_ * is_431_[8] + 8192 >> 14;
				int i_532_ = i_522_ * i_516_ + 8192 >> 14;
				int i_533_ = i_523_ * i_517_ + 8192 >> 14;
				int i_534_ = i_524_ * i_518_ + 8192 >> 14;
				i_532_ += i_528_;
				i_533_ += i_529_;
				i_534_ += i_530_;
				int[] is_535_ = new int[9];
				for (int i_536_ = 0; i_536_ < 3; i_536_++) {
					for (int i_537_ = 0; i_537_ < 3; i_537_++) {
						int i_538_ = 0;
						for (int i_539_ = 0; i_539_ < 3; i_539_++)
							i_538_ += (is_431_[i_536_ * 3 + i_539_] * is_531_[i_537_ + i_539_ * 3]);
						is_535_[i_536_ * 3 + i_537_] = i_538_ + 8192 >> 14;
					}
				}
				int i_540_ = ((is_431_[0] * i_532_ + is_431_[1] * i_533_ + is_431_[2] * i_534_ + 8192) >> 14);
				int i_541_ = ((is_431_[3] * i_532_ + is_431_[4] * i_533_ + is_431_[5] * i_534_ + 8192) >> 14);
				int i_542_ = ((is_431_[6] * i_532_ + is_431_[7] * i_533_ + is_431_[8] * i_534_ + 8192) >> 14);
				i_540_ += i_513_;
				i_541_ += i_514_;
				i_542_ += i_515_;
				for (int i_543_ = 0; i_543_ < i_432_; i_543_++) {
					int i_544_ = is[i_543_];
					if (i_544_ < this.anIntArrayArray7778.length) {
						int[] is_545_ = (this.anIntArrayArray7778[i_544_]);
						for (int i_546_ = 0; i_546_ < is_545_.length; i_546_++) {
							int i_547_ = is_545_[i_546_];
							if (this.aShortArray7816 == null || ((i_430_ & (this.aShortArray7816[i_547_])) != 0)) {
								int i_548_ = (is_535_[0] * (this.anIntArray7751[i_547_]) + is_535_[1] * (this.anIntArray7752[i_547_]) + is_535_[2] * (this.anIntArray7753[i_547_]) + 8192) >> 14;
								int i_549_ = (is_535_[3] * (this.anIntArray7751[i_547_]) + is_535_[4] * (this.anIntArray7752[i_547_]) + is_535_[5] * (this.anIntArray7753[i_547_]) + 8192) >> 14;
								int i_550_ = (is_535_[6] * (this.anIntArray7751[i_547_]) + is_535_[7] * (this.anIntArray7752[i_547_]) + is_535_[8] * (this.anIntArray7753[i_547_]) + 8192) >> 14;
								i_548_ += i_540_;
								i_549_ += i_541_;
								i_550_ += i_542_;
								this.anIntArray7751[i_547_] = i_548_;
								this.anIntArray7752[i_547_] = i_549_;
								this.anIntArray7753[i_547_] = i_550_;
							}
						}
					}
				}
			} else {
				for (int i_551_ = 0; i_551_ < i_432_; i_551_++) {
					int i_552_ = is[i_551_];
					if (i_552_ < this.anIntArrayArray7778.length) {
						int[] is_553_ = (this.anIntArrayArray7778[i_552_]);
						for (int i_554_ = 0; i_554_ < is_553_.length; i_554_++) {
							int i_555_ = is_553_[i_554_];
							if (this.aShortArray7816 == null || ((i_430_ & (this.aShortArray7816[i_555_])) != 0)) {
								this.anIntArray7751[i_555_] -= this.anInt7782;
								this.anIntArray7752[i_555_] -= this.anInt7783;
								this.anIntArray7753[i_555_] -= this.anInt7781;
								this.anIntArray7751[i_555_] = (this.anIntArray7751[i_555_]) * i_427_ / 128;
								this.anIntArray7752[i_555_] = (this.anIntArray7752[i_555_]) * i_428_ / 128;
								this.anIntArray7753[i_555_] = (this.anIntArray7753[i_555_]) * i_429_ / 128;
								this.anIntArray7751[i_555_] += this.anInt7782;
								this.anIntArray7752[i_555_] += this.anInt7783;
								this.anIntArray7753[i_555_] += this.anInt7781;
							}
						}
					}
				}
			}
		} else if (transformationType == AnimationFrameBase.UNKNOWN5) {
			if (this.anIntArrayArray7779 != null && this.aByteArray7773 != null) {
				for (int i_556_ = 0; i_556_ < i_432_; i_556_++) {
					int i_557_ = is[i_556_];
					if (i_557_ < this.anIntArrayArray7779.length) {
						int[] is_558_ = (this.anIntArrayArray7779[i_557_]);
						for (int i_559_ = 0; i_559_ < is_558_.length; i_559_++) {
							int i_560_ = is_558_[i_559_];
							if (this.aShortArray7776 == null || ((i_430_ & (this.aShortArray7776[i_560_])) != 0)) {
								int i_561_ = (((this.aByteArray7773[i_560_]) & 0xff) + i_427_ * 8);
								if (i_561_ < 0)
									i_561_ = 0;
								else if (i_561_ > 255)
									i_561_ = 255;
								this.aByteArray7773[i_560_] = (byte) i_561_;
							}
						}
					}
				}
				if (this.aClass16Array7789 != null) {
					for (int i_562_ = 0; i_562_ < this.anInt7788; i_562_++) {
						Class16 class16 = this.aClass16Array7789[i_562_];
						Class18 class18 = this.aClass18Array7790[i_562_];
						class18.anInt254 = ((class18.anInt254 * -1509687305 & 0xffffff) | 255 - ((this.aByteArray7773[(class16.anInt226 * -1295149283)]) & 0xff) << 24) * -564629049;
					}
				}
			}
		} else if (transformationType == AnimationFrameBase.UNKNOWN7) {
			if (this.anIntArrayArray7779 != null) {
				for (int i_563_ = 0; i_563_ < i_432_; i_563_++) {
					int i_564_ = is[i_563_];
					if (i_564_ < this.anIntArrayArray7779.length) {
						int[] is_565_ = (this.anIntArrayArray7779[i_564_]);
						for (int i_566_ = 0; i_566_ < is_565_.length; i_566_++) {
							int i_567_ = is_565_[i_566_];
							if (this.aShortArray7776 == null || ((i_430_ & (this.aShortArray7776[i_567_])) != 0)) {
								int i_568_ = ((this.aShortArray7775[i_567_]) & 0xffff);
								int i_569_ = i_568_ >> 10 & 0x3f;
								int i_570_ = i_568_ >> 7 & 0x7;
								int i_571_ = i_568_ & 0x7f;
								i_569_ = i_569_ + i_427_ & 0x3f;
								i_570_ += i_428_;
								if (i_570_ < 0)
									i_570_ = 0;
								else if (i_570_ > 7)
									i_570_ = 7;
								i_571_ += i_429_;
								if (i_571_ < 0)
									i_571_ = 0;
								else if (i_571_ > 127)
									i_571_ = 127;
								this.aShortArray7775[i_567_] = (short) (i_569_ << 10 | i_570_ << 7 | i_571_);
							}
						}
						this.aBoolean7733 = true;
					}
				}
				if (this.aClass16Array7789 != null) {
					for (int i_572_ = 0; i_572_ < this.anInt7788; i_572_++) {
						Class16 class16 = this.aClass16Array7789[i_572_];
						Class18 class18 = this.aClass18Array7790[i_572_];
						class18.anInt254 = (((class18.anInt254 * -1509687305 & ~0xffffff) | (Class379.anIntArray4096[(Class173.method1823((this.aShortArray7775[(class16.anInt226 * -1295149283)]) & 0xffff)) & 0xffff]) & 0xffffff) * -564629049);
					}
				}
			}
		} else if (transformationType == AnimationFrameBase.UNKNOWN8) {
			if (this.anIntArrayArray7791 != null) {
				for (int i_573_ = 0; i_573_ < i_432_; i_573_++) {
					int i_574_ = is[i_573_];
					if (i_574_ < this.anIntArrayArray7791.length) {
						int[] is_575_ = (this.anIntArrayArray7791[i_574_]);
						for (int i_576_ = 0; i_576_ < is_575_.length; i_576_++) {
							Class18 class18 = (this.aClass18Array7790[is_575_[i_576_]]);
							class18.anInt247 += i_427_ * 1747422061;
							class18.anInt244 += i_428_ * 1370325433;
						}
					}
				}
			}
		} else if (transformationType == AnimationFrameBase.UNKNOWN10) {
			if (this.anIntArrayArray7791 != null) {
				for (int i_577_ = 0; i_577_ < i_432_; i_577_++) {
					int i_578_ = is[i_577_];
					if (i_578_ < this.anIntArrayArray7791.length) {
						int[] is_579_ = (this.anIntArrayArray7791[i_578_]);
						for (int i_580_ = 0; i_580_ < is_579_.length; i_580_++) {
							Class18 class18 = (this.aClass18Array7790[is_579_[i_580_]]);
							class18.aFloat245 = (class18.aFloat245 * (float) i_427_ / 128.0F);
							class18.aFloat248 = (class18.aFloat248 * (float) i_428_ / 128.0F);
						}
					}
				}
			}
		} else if (transformationType == AnimationFrameBase.UNKNOWN9) {
			if (this.anIntArrayArray7791 != null) {
				for (int i_581_ = 0; i_581_ < i_432_; i_581_++) {
					int i_582_ = is[i_581_];
					if (i_582_ < this.anIntArrayArray7791.length) {
						int[] is_583_ = (this.anIntArrayArray7791[i_582_]);
						for (int i_584_ = 0; i_584_ < is_583_.length; i_584_++) {
							Class18 class18 = (this.aClass18Array7790[is_583_[i_584_]]);
							class18.anInt249 = ((class18.anInt249 * -988477815 + i_427_) & 0x3fff) * -839233607;
						}
					}
				}
			}
		}
	}

	void animate(int transformType, int transformX, int transformY, int transformZ) {
		if (transformType == AnimationFrameBase.UNKNOWN0) {
			int i_588_ = 0;
			this.anInt7782 = 0;
			this.anInt7783 = 0;
			this.anInt7781 = 0;
			for (int i_589_ = 0; i_589_ < this.anInt7799; i_589_++) {
				this.anInt7782 += this.anIntArray7751[i_589_];
				this.anInt7783 += this.anIntArray7752[i_589_];
				this.anInt7781 += this.anIntArray7753[i_589_];
				i_588_++;
			}
			if (i_588_ > 0) {
				this.anInt7782 = this.anInt7782 / i_588_ + transformX;
				this.anInt7783 = this.anInt7783 / i_588_ + transformY;
				this.anInt7781 = this.anInt7781 / i_588_ + transformZ;
			} else {
				this.anInt7782 = transformX;
				this.anInt7783 = transformY;
				this.anInt7781 = transformZ;
			}
		} else if (transformType == AnimationFrameBase.UNKNOWN1) {
			for (int i_590_ = 0; i_590_ < this.anInt7799; i_590_++) {
				this.anIntArray7751[i_590_] += transformX;
				this.anIntArray7752[i_590_] += transformY;
				this.anIntArray7753[i_590_] += transformZ;
			}
		} else if (transformType == AnimationFrameBase.UNKNOWN2) {
			for (int i_591_ = 0; i_591_ < this.anInt7799; i_591_++) {
				this.anIntArray7751[i_591_] -= this.anInt7782;
				this.anIntArray7752[i_591_] -= this.anInt7783;
				this.anIntArray7753[i_591_] -= this.anInt7781;
				if (transformZ != 0) {
					int i_592_ = CircleAngleTable.SINE[transformZ];
					int i_593_ = CircleAngleTable.COSINE[transformZ];
					int i_594_ = (((this.anIntArray7752[i_591_] * i_592_) + (this.anIntArray7751[i_591_] * i_593_) + 16383) >> 14);
					this.anIntArray7752[i_591_] = ((this.anIntArray7752[i_591_] * i_593_) - (this.anIntArray7751[i_591_] * i_592_) + 16383) >> 14;
					this.anIntArray7751[i_591_] = i_594_;
				}
				if (transformX != 0) {
					int i_595_ = CircleAngleTable.SINE[transformX];
					int i_596_ = CircleAngleTable.COSINE[transformX];
					int i_597_ = (((this.anIntArray7752[i_591_] * i_596_) - (this.anIntArray7753[i_591_] * i_595_) + 16383) >> 14);
					this.anIntArray7753[i_591_] = ((this.anIntArray7752[i_591_] * i_595_) + (this.anIntArray7753[i_591_] * i_596_) + 16383) >> 14;
					this.anIntArray7752[i_591_] = i_597_;
				}
				if (transformY != 0) {
					int i_598_ = CircleAngleTable.SINE[transformY];
					int i_599_ = CircleAngleTable.COSINE[transformY];
					int i_600_ = (((this.anIntArray7753[i_591_] * i_598_) + (this.anIntArray7751[i_591_] * i_599_) + 16383) >> 14);
					this.anIntArray7753[i_591_] = ((this.anIntArray7753[i_591_] * i_599_) - (this.anIntArray7751[i_591_] * i_598_) + 16383) >> 14;
					this.anIntArray7751[i_591_] = i_600_;
				}
				this.anIntArray7751[i_591_] += this.anInt7782;
				this.anIntArray7752[i_591_] += this.anInt7783;
				this.anIntArray7753[i_591_] += this.anInt7781;
			}
		} else if (transformType == AnimationFrameBase.UNKNOWN3) {
			for (int i_601_ = 0; i_601_ < this.anInt7799; i_601_++) {
				this.anIntArray7751[i_601_] -= this.anInt7782;
				this.anIntArray7752[i_601_] -= this.anInt7783;
				this.anIntArray7753[i_601_] -= this.anInt7781;
				this.anIntArray7751[i_601_] = (this.anIntArray7751[i_601_] * transformX / 128);
				this.anIntArray7752[i_601_] = (this.anIntArray7752[i_601_] * transformY / 128);
				this.anIntArray7753[i_601_] = (this.anIntArray7753[i_601_] * transformZ / 128);
				this.anIntArray7751[i_601_] += this.anInt7782;
				this.anIntArray7752[i_601_] += this.anInt7783;
				this.anIntArray7753[i_601_] += this.anInt7781;
			}
		} else if (transformType == AnimationFrameBase.UNKNOWN5) {
			for (int i_602_ = 0; i_602_ < this.anInt7757; i_602_++) {
				int i_603_ = ((this.aByteArray7773[i_602_] & 0xff) + transformX * 8);
				if (i_603_ < 0)
					i_603_ = 0;
				else if (i_603_ > 255)
					i_603_ = 255;
				this.aByteArray7773[i_602_] = (byte) i_603_;
			}
			if (this.aClass16Array7789 != null) {
				for (int i_604_ = 0; i_604_ < this.anInt7788; i_604_++) {
					Class16 class16 = this.aClass16Array7789[i_604_];
					Class18 class18 = this.aClass18Array7790[i_604_];
					class18.anInt254 = ((class18.anInt254 * -1509687305 & 0xffffff) | (255 - ((this.aByteArray7773[class16.anInt226 * -1295149283]) & 0xff)) << 24) * -564629049;
				}
			}
		} else if (transformType == AnimationFrameBase.UNKNOWN7) {
			for (int i_605_ = 0; i_605_ < this.anInt7757; i_605_++) {
				int i_606_ = this.aShortArray7775[i_605_] & 0xffff;
				int i_607_ = i_606_ >> 10 & 0x3f;
				int i_608_ = i_606_ >> 7 & 0x7;
				int i_609_ = i_606_ & 0x7f;
				i_607_ = i_607_ + transformX & 0x3f;
				i_608_ += transformY;
				if (i_608_ < 0)
					i_608_ = 0;
				else if (i_608_ > 7)
					i_608_ = 7;
				i_609_ += transformZ;
				if (i_609_ < 0)
					i_609_ = 0;
				else if (i_609_ > 127)
					i_609_ = 127;
				this.aShortArray7775[i_605_] = (short) (i_607_ << 10 | i_608_ << 7 | i_609_);
			}
			this.aBoolean7733 = true;
			if (this.aClass16Array7789 != null) {
				for (int i_610_ = 0; i_610_ < this.anInt7788; i_610_++) {
					Class16 class16 = this.aClass16Array7789[i_610_];
					Class18 class18 = this.aClass18Array7790[i_610_];
					class18.anInt254 = ((class18.anInt254 * -1509687305 & ~0xffffff) | ((Class379.anIntArray4096[Class173.method1823(((this.aShortArray7775[((class16.anInt226) * -1295149283)]) & 0xffff)) & 0xffff]) & 0xffffff)) * -564629049;
				}
			}
		} else if (transformType == AnimationFrameBase.UNKNOWN8) {
			for (int i_611_ = 0; i_611_ < this.anInt7788; i_611_++) {
				Class18 class18 = this.aClass18Array7790[i_611_];
				class18.anInt247 += transformX * 1747422061;
				class18.anInt244 += transformY * 1370325433;
			}
		} else if (transformType == AnimationFrameBase.UNKNOWN10) {
			for (int i_612_ = 0; i_612_ < this.anInt7788; i_612_++) {
				Class18 class18 = this.aClass18Array7790[i_612_];
				class18.aFloat245 = class18.aFloat245 * (float) transformX / 128.0F;
				class18.aFloat248 = class18.aFloat248 * (float) transformY / 128.0F;
			}
		} else if (transformType == AnimationFrameBase.UNKNOWN9) {
			for (int i_613_ = 0; i_613_ < this.anInt7788; i_613_++) {
				Class18 class18 = this.aClass18Array7790[i_613_];
				class18.anInt249 = (class18.anInt249 * -988477815 + transformX & 0x3fff) * -839233607;
			}
		}
	}

	public void render(Matrix43f class222, Class302_Sub1 class302_sub1, int i) {
		method4811(class222, class302_sub1, i);
	}

	void method4738(int transformationType, int[] is, int i_614_, int i_615_, int i_616_, int i_617_, boolean bool) {
		int i_618_ = is.length;
		if (transformationType == AnimationFrameBase.UNKNOWN0) {
			i_614_ <<= 4;
			i_615_ <<= 4;
			i_616_ <<= 4;
			if (!this.aBoolean7780) {
				for (int i_619_ = 0; i_619_ < this.anInt7799; i_619_++) {
					this.anIntArray7751[i_619_] <<= 4;
					this.anIntArray7752[i_619_] <<= 4;
					this.anIntArray7753[i_619_] <<= 4;
				}
				this.aBoolean7780 = true;
			}
			int i_620_ = 0;
			this.anInt7782 = 0;
			this.anInt7783 = 0;
			this.anInt7781 = 0;
			for (int i_621_ = 0; i_621_ < i_618_; i_621_++) {
				int i_622_ = is[i_621_];
				if (i_622_ < this.anIntArrayArray7778.length) {
					int[] is_623_ = this.anIntArrayArray7778[i_622_];
					for (int i_624_ = 0; i_624_ < is_623_.length; i_624_++) {
						int i_625_ = is_623_[i_624_];
						this.anInt7782 += this.anIntArray7751[i_625_];
						this.anInt7783 += this.anIntArray7752[i_625_];
						this.anInt7781 += this.anIntArray7753[i_625_];
						i_620_++;
					}
				}
			}
			if (i_620_ > 0) {
				this.anInt7782 = this.anInt7782 / i_620_ + i_614_;
				this.anInt7783 = this.anInt7783 / i_620_ + i_615_;
				this.anInt7781 = this.anInt7781 / i_620_ + i_616_;
			} else {
				this.anInt7782 = i_614_;
				this.anInt7783 = i_615_;
				this.anInt7781 = i_616_;
			}
		} else if (transformationType == AnimationFrameBase.UNKNOWN1) {
			i_614_ <<= 4;
			i_615_ <<= 4;
			i_616_ <<= 4;
			if (!this.aBoolean7780) {
				for (int i_626_ = 0; i_626_ < this.anInt7799; i_626_++) {
					this.anIntArray7751[i_626_] <<= 4;
					this.anIntArray7752[i_626_] <<= 4;
					this.anIntArray7753[i_626_] <<= 4;
				}
				this.aBoolean7780 = true;
			}
			for (int i_627_ = 0; i_627_ < i_618_; i_627_++) {
				int i_628_ = is[i_627_];
				if (i_628_ < this.anIntArrayArray7778.length) {
					int[] is_629_ = this.anIntArrayArray7778[i_628_];
					for (int i_630_ = 0; i_630_ < is_629_.length; i_630_++) {
						int i_631_ = is_629_[i_630_];
						this.anIntArray7751[i_631_] += i_614_;
						this.anIntArray7752[i_631_] += i_615_;
						this.anIntArray7753[i_631_] += i_616_;
					}
				}
			}
		} else if (transformationType == AnimationFrameBase.UNKNOWN2) {
			for (int i_632_ = 0; i_632_ < i_618_; i_632_++) {
				int i_633_ = is[i_632_];
				if (i_633_ < this.anIntArrayArray7778.length) {
					int[] is_634_ = this.anIntArrayArray7778[i_633_];
					if ((i_617_ & 0x1) == 0) {
						for (int i_635_ = 0; i_635_ < is_634_.length; i_635_++) {
							int i_636_ = is_634_[i_635_];
							this.anIntArray7751[i_636_] -= this.anInt7782;
							this.anIntArray7752[i_636_] -= this.anInt7783;
							this.anIntArray7753[i_636_] -= this.anInt7781;
							if (i_616_ != 0) {
								int i_637_ = CircleAngleTable.SINE[i_616_];
								int i_638_ = CircleAngleTable.COSINE[i_616_];
								int i_639_ = (((this.anIntArray7752[i_636_]) * i_637_ + (this.anIntArray7751[i_636_]) * i_638_ + 16383) >> 14);
								this.anIntArray7752[i_636_] = ((this.anIntArray7752[i_636_]) * i_638_ - (this.anIntArray7751[i_636_]) * i_637_ + 16383) >> 14;
								this.anIntArray7751[i_636_] = i_639_;
							}
							if (i_614_ != 0) {
								int i_640_ = CircleAngleTable.SINE[i_614_];
								int i_641_ = CircleAngleTable.COSINE[i_614_];
								int i_642_ = (((this.anIntArray7752[i_636_]) * i_641_ - (this.anIntArray7753[i_636_]) * i_640_ + 16383) >> 14);
								this.anIntArray7753[i_636_] = ((this.anIntArray7752[i_636_]) * i_640_ + (this.anIntArray7753[i_636_]) * i_641_ + 16383) >> 14;
								this.anIntArray7752[i_636_] = i_642_;
							}
							if (i_615_ != 0) {
								int i_643_ = CircleAngleTable.SINE[i_615_];
								int i_644_ = CircleAngleTable.COSINE[i_615_];
								int i_645_ = (((this.anIntArray7753[i_636_]) * i_643_ + (this.anIntArray7751[i_636_]) * i_644_ + 16383) >> 14);
								this.anIntArray7753[i_636_] = ((this.anIntArray7753[i_636_]) * i_644_ - (this.anIntArray7751[i_636_]) * i_643_ + 16383) >> 14;
								this.anIntArray7751[i_636_] = i_645_;
							}
							this.anIntArray7751[i_636_] += this.anInt7782;
							this.anIntArray7752[i_636_] += this.anInt7783;
							this.anIntArray7753[i_636_] += this.anInt7781;
						}
					} else {
						for (int i_646_ = 0; i_646_ < is_634_.length; i_646_++) {
							int i_647_ = is_634_[i_646_];
							this.anIntArray7751[i_647_] -= this.anInt7782;
							this.anIntArray7752[i_647_] -= this.anInt7783;
							this.anIntArray7753[i_647_] -= this.anInt7781;
							if (i_614_ != 0) {
								int i_648_ = CircleAngleTable.SINE[i_614_];
								int i_649_ = CircleAngleTable.COSINE[i_614_];
								int i_650_ = (((this.anIntArray7752[i_647_]) * i_649_ - (this.anIntArray7753[i_647_]) * i_648_ + 16383) >> 14);
								this.anIntArray7753[i_647_] = ((this.anIntArray7752[i_647_]) * i_648_ + (this.anIntArray7753[i_647_]) * i_649_ + 16383) >> 14;
								this.anIntArray7752[i_647_] = i_650_;
							}
							if (i_616_ != 0) {
								int i_651_ = CircleAngleTable.SINE[i_616_];
								int i_652_ = CircleAngleTable.COSINE[i_616_];
								int i_653_ = (((this.anIntArray7752[i_647_]) * i_651_ + (this.anIntArray7751[i_647_]) * i_652_ + 16383) >> 14);
								this.anIntArray7752[i_647_] = ((this.anIntArray7752[i_647_]) * i_652_ - (this.anIntArray7751[i_647_]) * i_651_ + 16383) >> 14;
								this.anIntArray7751[i_647_] = i_653_;
							}
							if (i_615_ != 0) {
								int i_654_ = CircleAngleTable.SINE[i_615_];
								int i_655_ = CircleAngleTable.COSINE[i_615_];
								int i_656_ = (((this.anIntArray7753[i_647_]) * i_654_ + (this.anIntArray7751[i_647_]) * i_655_ + 16383) >> 14);
								this.anIntArray7753[i_647_] = ((this.anIntArray7753[i_647_]) * i_655_ - (this.anIntArray7751[i_647_]) * i_654_ + 16383) >> 14;
								this.anIntArray7751[i_647_] = i_656_;
							}
							this.anIntArray7751[i_647_] += this.anInt7782;
							this.anIntArray7752[i_647_] += this.anInt7783;
							this.anIntArray7753[i_647_] += this.anInt7781;
						}
					}
				}
			}
		} else if (transformationType == AnimationFrameBase.UNKNOWN3) {
			for (int i_657_ = 0; i_657_ < i_618_; i_657_++) {
				int i_658_ = is[i_657_];
				if (i_658_ < this.anIntArrayArray7778.length) {
					int[] is_659_ = this.anIntArrayArray7778[i_658_];
					for (int i_660_ = 0; i_660_ < is_659_.length; i_660_++) {
						int i_661_ = is_659_[i_660_];
						this.anIntArray7751[i_661_] -= this.anInt7782;
						this.anIntArray7752[i_661_] -= this.anInt7783;
						this.anIntArray7753[i_661_] -= this.anInt7781;
						this.anIntArray7751[i_661_] = (this.anIntArray7751[i_661_] * i_614_ / 128);
						this.anIntArray7752[i_661_] = (this.anIntArray7752[i_661_] * i_615_ / 128);
						this.anIntArray7753[i_661_] = (this.anIntArray7753[i_661_] * i_616_ / 128);
						this.anIntArray7751[i_661_] += this.anInt7782;
						this.anIntArray7752[i_661_] += this.anInt7783;
						this.anIntArray7753[i_661_] += this.anInt7781;
					}
				}
			}
		} else if (transformationType == AnimationFrameBase.UNKNOWN5) {
			if (this.anIntArrayArray7779 != null && this.aByteArray7773 != null) {
				for (int i_662_ = 0; i_662_ < i_618_; i_662_++) {
					int i_663_ = is[i_662_];
					if (i_663_ < this.anIntArrayArray7779.length) {
						int[] is_664_ = (this.anIntArrayArray7779[i_663_]);
						for (int i_665_ = 0; i_665_ < is_664_.length; i_665_++) {
							int i_666_ = is_664_[i_665_];
							int i_667_ = (((this.aByteArray7773[i_666_]) & 0xff) + i_614_ * 8);
							if (i_667_ < 0)
								i_667_ = 0;
							else if (i_667_ > 255)
								i_667_ = 255;
							this.aByteArray7773[i_666_] = (byte) i_667_;
						}
					}
				}
				if (this.aClass16Array7789 != null) {
					for (int i_668_ = 0; i_668_ < this.anInt7788; i_668_++) {
						Class16 class16 = this.aClass16Array7789[i_668_];
						Class18 class18 = this.aClass18Array7790[i_668_];
						class18.anInt254 = ((class18.anInt254 * -1509687305 & 0xffffff) | 255 - ((this.aByteArray7773[(class16.anInt226 * -1295149283)]) & 0xff) << 24) * -564629049;
					}
				}
			}
		} else if (transformationType == AnimationFrameBase.UNKNOWN7) {
			if (this.anIntArrayArray7779 != null) {
				for (int i_669_ = 0; i_669_ < i_618_; i_669_++) {
					int i_670_ = is[i_669_];
					if (i_670_ < this.anIntArrayArray7779.length) {
						int[] is_671_ = (this.anIntArrayArray7779[i_670_]);
						for (int i_672_ = 0; i_672_ < is_671_.length; i_672_++) {
							int i_673_ = is_671_[i_672_];
							int i_674_ = ((this.aShortArray7775[i_673_]) & 0xffff);
							int i_675_ = i_674_ >> 10 & 0x3f;
							int i_676_ = i_674_ >> 7 & 0x7;
							int i_677_ = i_674_ & 0x7f;
							i_675_ = i_675_ + i_614_ & 0x3f;
							i_676_ += i_615_;
							if (i_676_ < 0)
								i_676_ = 0;
							else if (i_676_ > 7)
								i_676_ = 7;
							i_677_ += i_616_;
							if (i_677_ < 0)
								i_677_ = 0;
							else if (i_677_ > 127)
								i_677_ = 127;
							this.aShortArray7775[i_673_] = (short) (i_675_ << 10 | i_676_ << 7 | i_677_);
						}
						this.aBoolean7733 = true;
					}
				}
				if (this.aClass16Array7789 != null) {
					for (int i_678_ = 0; i_678_ < this.anInt7788; i_678_++) {
						Class16 class16 = this.aClass16Array7789[i_678_];
						Class18 class18 = this.aClass18Array7790[i_678_];
						class18.anInt254 = (((class18.anInt254 * -1509687305 & ~0xffffff) | (Class379.anIntArray4096[(Class173.method1823((this.aShortArray7775[(class16.anInt226 * -1295149283)]) & 0xffff)) & 0xffff]) & 0xffffff) * -564629049);
					}
				}
			}
		} else if (transformationType == AnimationFrameBase.UNKNOWN8) {
			if (this.anIntArrayArray7791 != null) {
				for (int i_679_ = 0; i_679_ < i_618_; i_679_++) {
					int i_680_ = is[i_679_];
					if (i_680_ < this.anIntArrayArray7791.length) {
						int[] is_681_ = (this.anIntArrayArray7791[i_680_]);
						for (int i_682_ = 0; i_682_ < is_681_.length; i_682_++) {
							Class18 class18 = (this.aClass18Array7790[is_681_[i_682_]]);
							class18.anInt247 += i_614_ * 1747422061;
							class18.anInt244 += i_615_ * 1370325433;
						}
					}
				}
			}
		} else if (transformationType == AnimationFrameBase.UNKNOWN10) {
			if (this.anIntArrayArray7791 != null) {
				for (int i_683_ = 0; i_683_ < i_618_; i_683_++) {
					int i_684_ = is[i_683_];
					if (i_684_ < this.anIntArrayArray7791.length) {
						int[] is_685_ = (this.anIntArrayArray7791[i_684_]);
						for (int i_686_ = 0; i_686_ < is_685_.length; i_686_++) {
							Class18 class18 = (this.aClass18Array7790[is_685_[i_686_]]);
							class18.aFloat245 = (class18.aFloat245 * (float) i_614_ / 128.0F);
							class18.aFloat248 = (class18.aFloat248 * (float) i_615_ / 128.0F);
						}
					}
				}
			}
		} else if (transformationType == AnimationFrameBase.UNKNOWN9) {
			if (this.anIntArrayArray7791 != null) {
				for (int i_687_ = 0; i_687_ < i_618_; i_687_++) {
					int i_688_ = is[i_687_];
					if (i_688_ < this.anIntArrayArray7791.length) {
						int[] is_689_ = (this.anIntArrayArray7791[i_688_]);
						for (int i_690_ = 0; i_690_ < is_689_.length; i_690_++) {
							Class18 class18 = (this.aClass18Array7790[is_689_[i_690_]]);
							class18.anInt249 = ((class18.anInt249 * -988477815 + i_614_) & 0x3fff) * -839233607;
						}
					}
				}
			}
		}
	}

    final boolean method4802(int i) {
		if (this.aByteArray7773 == null)
			return false;
        return this.aByteArray7773[i] != 0;
    }

	public void f(int i) {
		if ((this.animationFlag & 0x5) != 5)
			throw new IllegalStateException();
		if (i == 4096)
			method4809();
		else if (i == 8192)
			method4796();
		else if (i == 12288)
			method4806();
		else {
			int i_720_ = CircleAngleTable.SINE[i];
			int i_721_ = CircleAngleTable.COSINE[i];
			synchronized (this) {
				for (int i_722_ = 0; i_722_ < this.anInt7799; i_722_++) {
					int i_723_ = (((this.anIntArray7753[i_722_] * i_720_) + (this.anIntArray7751[i_722_] * i_721_)) >> 14);
					this.anIntArray7753[i_722_] = ((this.anIntArray7753[i_722_] * i_721_) - (this.anIntArray7751[i_722_] * i_720_)) >> 14;
					this.anIntArray7751[i_722_] = i_723_;
				}
				method4800();
			}
		}
	}

	final void method4803(boolean bool, boolean bool_724_, boolean bool_725_, int i, boolean bool_726_, boolean bool_727_) {
		if (this.anIntArray7801[i] != -2) {
			short i_728_ = this.aShortArray7758[i];
			short i_729_ = this.aShortArray7759[i];
			short i_730_ = this.aShortArray7760[i];
			float f = this.aFloatArray7784[i_728_];
			float f_731_ = this.aFloatArray7784[i_729_];
			float f_732_ = this.aFloatArray7784[i_730_];
			if (!bool_726_ || f != -5000.0F && f_731_ != -5000.0F && f_732_ != -5000.0F) {
				float f_733_ = this.aFloatArray7806[i_728_];
				float f_734_ = this.aFloatArray7806[i_729_];
				float f_735_ = this.aFloatArray7806[i_730_];
				if (this.anIntArray7814[i] != -1 || ((f - f_731_) * (f_735_ - f_734_) - (f_733_ - f_734_) * (f_732_ - f_731_)) > 0.0F) {
                    this.aClass2_7737.aBoolean20 = f < 0.0F || f_731_ < 0.0F || f_732_ < 0.0F || f > (float) (this.aClass15_7735.anInt214 * -638801903) || (f_731_ > (float) (this.aClass15_7735.anInt214 * -638801903)) || (f_732_ > (float) (this.aClass15_7735.anInt214 * -638801903));
					if (bool_727_) {
						int i_736_ = this.anIntArray7814[i];
						if (i_736_ == -1 || !(this.aClass16Array7789[i_736_].aBoolean225))
							method4805(bool, bool_724_, bool_725_, i);
					} else {
						int i_737_ = this.anIntArray7814[i];
						if (i_737_ != -1) {
							Class16 class16 = (this.aClass16Array7789[i_737_]);
							Class18 class18 = (this.aClass18Array7790[i_737_]);
							if (!class16.aBoolean225)
								method4812(bool, bool_724_, bool_725_, i);
							this.javaGraphicsToolkit.method5205(bool, bool_724_, bool_725_, class18.anInt252 * 1623109979, class18.anInt251 * 981534539, class18.aFloat250, class18.anInt246 * 1931942073, class18.anInt253 * 1894750037, class16.aShort228 & 0xffff, class18.anInt254 * -1509687305, class16.aByte230, class16.aByte227);
						} else
							method4812(bool, bool_724_, bool_725_, i);
					}
				}
			}
		}
	}

	void method4804() {
		for (int i = 0; i < this.anInt7757; i++) {
			short i_738_ = (this.aShortArray7774 != null ? this.aShortArray7774[i] : (short) -1);
			if (i_738_ == -1) {
				int i_739_ = this.aShortArray7775[i] & 0xffff;
				int i_740_ = (i_739_ & 0x7f) * this.anInt7747 >> 7;
				short i_741_ = Class173.method1823(i_739_ & ~0x7f | i_740_);
				if (this.anIntArray7801[i] == -1) {
					int i_742_ = this.anIntArray7763[i] & ~0x1ffff;
					this.anIntArray7763[i] = i_742_ | Class195.method1873(i_741_, i_742_ >> 17);
				} else if (this.anIntArray7801[i] != -2) {
					int i_743_ = this.anIntArray7763[i] & ~0x1ffff;
					this.anIntArray7763[i] = i_743_ | Class195.method1873(i_741_, i_743_ >> 17);
					i_743_ = this.anIntArray7764[i] & ~0x1ffff;
					this.anIntArray7764[i] = i_743_ | Class195.method1873(i_741_, i_743_ >> 17);
					i_743_ = this.anIntArray7801[i] & ~0x1ffff;
					this.anIntArray7801[i] = i_743_ | Class195.method1873(i_741_, i_743_ >> 17);
				}
			}
		}
		this.anInt7812 = 2;
	}

	final void method4805(boolean bool, boolean bool_744_, boolean bool_745_, int i) {
		if (!this.aClass15_7735.aBoolean186) {
			short i_746_ = this.aShortArray7758[i];
			short i_747_ = this.aShortArray7759[i];
			short i_748_ = this.aShortArray7760[i];
			Matrix4f matrix4f = (this.javaGraphicsToolkit.aMatrix4f_7986);
			float f = matrix4f.aFloatArray2594[10];
			float f_749_ = matrix4f.aFloatArray2594[14];
			float f_750_ = matrix4f.aFloatArray2594[11];
			float f_751_ = matrix4f.aFloatArray2594[15];
			float f_752_ = f_749_ * f_750_ - f * f_751_;
			float f_753_ = ((this.aFloatArray7807[i_746_] - (this.aClass15_7735.aFloat212)) * (this.aClass15_7735.aFloat191));
			float f_754_ = ((this.aFloatArray7807[i_747_] - (this.aClass15_7735.aFloat212)) * (this.aClass15_7735.aFloat191));
			float f_755_ = ((this.aFloatArray7807[i_748_] - (this.aClass15_7735.aFloat212)) * (this.aClass15_7735.aFloat191));
			float f_756_ = f_753_ * f_752_ / (f_753_ * f_750_ - f);
			float f_757_ = f_754_ * f_752_ / (f_754_ * f_750_ - f);
			float f_758_ = f_755_ * f_752_ / (f_755_ * f_750_ - f);
			float f_759_ = ((f_756_ - (this.aClass15_7735.aFloat205)) / (this.aClass15_7735.aFloat183));
			if (f_759_ > 1.0F)
				f_759_ = 1.0F;
			else if (f_759_ < 0.0F)
				f_759_ = 0.0F;
			float f_760_ = ((f_757_ - (this.aClass15_7735.aFloat205)) / (this.aClass15_7735.aFloat183));
			if (f_760_ > 1.0F)
				f_760_ = 1.0F;
			else if (f_760_ < 0.0F)
				f_760_ = 0.0F;
			float f_761_ = ((f_758_ - (this.aClass15_7735.aFloat205)) / (this.aClass15_7735.aFloat183));
			if (f_761_ > 1.0F)
				f_761_ = 1.0F;
			else if (f_761_ < 0.0F)
				f_761_ = 0.0F;
			float f_762_ = f_759_ + f_760_ + f_761_;
			if (!(f_762_ >= 3.0F)) {
				if (f_762_ <= 0.0F)
					method4812(bool, bool_744_, bool_745_, i);
				else {
					if (this.aByteArray7773 == null)
						this.aClass2_7737.anInt19 = 0;
					else
						this.aClass2_7737.anInt19 = this.aByteArray7773[i] & 0xff;
					if (this.aShortArray7774 == null || this.aShortArray7774[i] == -1) {
						if (this.anIntArray7801[i] == -1)
							this.aClass2_7737.method292(bool, bool_744_, bool_745_, (this.aFloatArray7806[i_746_]), (this.aFloatArray7806[i_747_]), (this.aFloatArray7806[i_748_]), (this.aFloatArray7784[i_746_]), (this.aFloatArray7784[i_747_]), (this.aFloatArray7784[i_748_]), (this.aFloatArray7807[i_746_]), (this.aFloatArray7807[i_747_]), (this.aFloatArray7807[i_748_]), StaticMethods.method4215((Class379.anIntArray4096[((this.anIntArray7763[i]) & 0xffff)]), (this.aClass15_7735.anInt184) * 688695183, f_759_ * 255.0F), StaticMethods.method4215((Class379.anIntArray4096[((this.anIntArray7763[i]) & 0xffff)]), (this.aClass15_7735.anInt184) * 688695183, f_760_ * 255.0F), StaticMethods.method4215((Class379.anIntArray4096[((this.anIntArray7763[i]) & 0xffff)]), (this.aClass15_7735.anInt184) * 688695183, f_761_ * 255.0F));
						else
							this.aClass2_7737.method292(bool, bool_744_, bool_745_, (this.aFloatArray7806[i_746_]), (this.aFloatArray7806[i_747_]), (this.aFloatArray7806[i_748_]), (this.aFloatArray7784[i_746_]), (this.aFloatArray7784[i_747_]), (this.aFloatArray7784[i_748_]), (this.aFloatArray7807[i_746_]), (this.aFloatArray7807[i_747_]), (this.aFloatArray7807[i_748_]), StaticMethods.method4215((Class379.anIntArray4096[((this.anIntArray7763[i]) & 0xffff)]), (this.aClass15_7735.anInt184) * 688695183, f_759_ * 255.0F), StaticMethods.method4215((Class379.anIntArray4096[((this.anIntArray7764[i]) & 0xffff)]), (this.aClass15_7735.anInt184) * 688695183, f_760_ * 255.0F), StaticMethods.method4215((Class379.anIntArray4096[((this.anIntArray7801[i]) & 0xffff)]), (this.aClass15_7735.anInt184) * 688695183, f_761_ * 255.0F));
					} else {
						int i_763_ = -16777216;
						if (this.aByteArray7773 != null)
							i_763_ = 255 - ((this.aByteArray7773[i]) & 0xff) << 24;
						if (this.anIntArray7801[i] == -1) {
							int i_764_ = (i_763_ | (this.anIntArray7763[i] & 0xffffff));
							this.aClass2_7737.method290(bool, bool_744_, bool_745_, (this.aFloatArray7806[i_746_]), (this.aFloatArray7806[i_747_]), (this.aFloatArray7806[i_748_]), (this.aFloatArray7784[i_746_]), (this.aFloatArray7784[i_747_]), (this.aFloatArray7784[i_748_]), (this.aFloatArray7807[i_746_]), (this.aFloatArray7807[i_747_]), (this.aFloatArray7807[i_748_]), (this.aFloatArray7745[i_746_]), (this.aFloatArray7745[i_747_]), (this.aFloatArray7745[i_748_]), (this.aFloatArrayArray7738[i][0]), (this.aFloatArrayArray7738[i][1]), (this.aFloatArrayArray7738[i][2]), (this.aFloatArrayArray7762[i][0]), (this.aFloatArrayArray7762[i][1]), (this.aFloatArrayArray7762[i][2]), i_764_, i_764_, i_764_, (this.aClass15_7735.anInt184 * 688695183), f_759_ * 255.0F, f_760_ * 255.0F, f_761_ * 255.0F, this.aShortArray7774[i]);
						} else
							this.aClass2_7737.method290(bool, bool_744_, bool_745_, (this.aFloatArray7806[i_746_]), (this.aFloatArray7806[i_747_]), (this.aFloatArray7806[i_748_]), (this.aFloatArray7784[i_746_]), (this.aFloatArray7784[i_747_]), (this.aFloatArray7784[i_748_]), (this.aFloatArray7807[i_746_]), (this.aFloatArray7807[i_747_]), (this.aFloatArray7807[i_748_]), (this.aFloatArray7745[i_746_]), (this.aFloatArray7745[i_747_]), (this.aFloatArray7745[i_748_]), (this.aFloatArrayArray7738[i][0]), (this.aFloatArrayArray7738[i][1]), (this.aFloatArrayArray7738[i][2]), (this.aFloatArrayArray7762[i][0]), (this.aFloatArrayArray7762[i][1]), (this.aFloatArrayArray7762[i][2]), i_763_ | (this.anIntArray7763[i]) & 0xffffff, i_763_ | (this.anIntArray7764[i]) & 0xffffff, i_763_ | (this.anIntArray7801[i]) & 0xffffff, (this.aClass15_7735.anInt184 * 688695183), f_759_ * 255.0F, f_760_ * 255.0F, f_761_ * 255.0F, this.aShortArray7774[i]);
					}
				}
			}
		} else {
			short i_765_ = this.aShortArray7758[i];
			short i_766_ = this.aShortArray7759[i];
			short i_767_ = this.aShortArray7760[i];
			float f = 0.0F;
			float f_768_ = 0.0F;
			float f_769_ = 0.0F;
			if (this.anIntArray7734[i_765_] > (this.aClass15_7735.anInt215 * 1084810731))
				f = 1.0F;
			else if (this.anIntArray7734[i_765_] > (this.aClass15_7735.anInt196) * -1395782407)
				f = ((float) ((this.aClass15_7735.anInt196) * -1395782407 - this.anIntArray7734[i_765_]) * 1.0F / (float) ((this.aClass15_7735.anInt196 * -1395782407) - (this.aClass15_7735.anInt215 * 1084810731)));
			if (this.anIntArray7734[i_766_] > (this.aClass15_7735.anInt215 * 1084810731))
				f_768_ = 1.0F;
			else if (this.anIntArray7734[i_766_] > (this.aClass15_7735.anInt196) * -1395782407)
				f_768_ = ((float) ((this.aClass15_7735.anInt196 * -1395782407) - (this.anIntArray7734[i_766_])) * 1.0F / (float) ((this.aClass15_7735.anInt196 * -1395782407) - (this.aClass15_7735.anInt215 * 1084810731)));
			if (this.anIntArray7734[i_767_] > (this.aClass15_7735.anInt215 * 1084810731))
				f_769_ = 1.0F;
			else if (this.anIntArray7734[i_767_] > (this.aClass15_7735.anInt196) * -1395782407)
				f_769_ = ((float) ((this.aClass15_7735.anInt196 * -1395782407) - (this.anIntArray7734[i_767_])) * 1.0F / (float) ((this.aClass15_7735.anInt196 * -1395782407) - (this.aClass15_7735.anInt215 * 1084810731)));
			if (this.aByteArray7773 == null)
				this.aClass2_7737.anInt19 = 0;
			else
				this.aClass2_7737.anInt19 = this.aByteArray7773[i] & 0xff;
			if (this.aShortArray7774 == null || this.aShortArray7774[i] == -1) {
				if (this.anIntArray7801[i] == -1)
					this.aClass2_7737.method292(bool, bool_744_, bool_745_, this.aFloatArray7806[i_765_], this.aFloatArray7806[i_766_], this.aFloatArray7806[i_767_], this.aFloatArray7784[i_765_], this.aFloatArray7784[i_766_], this.aFloatArray7784[i_767_], this.aFloatArray7807[i_765_], this.aFloatArray7807[i_766_], this.aFloatArray7807[i_767_], StaticMethods.method4215((Class379.anIntArray4096[(this.anIntArray7763[i]) & 0xffff]), (this.aClass15_7735.anInt184) * 688695183, f * 255.0F), StaticMethods.method4215((Class379.anIntArray4096[(this.anIntArray7763[i]) & 0xffff]), (this.aClass15_7735.anInt184) * 688695183, f_768_ * 255.0F), StaticMethods.method4215((Class379.anIntArray4096[(this.anIntArray7763[i]) & 0xffff]), (this.aClass15_7735.anInt184) * 688695183, f_769_ * 255.0F));
				else
					this.aClass2_7737.method292(bool, bool_744_, bool_745_, this.aFloatArray7806[i_765_], this.aFloatArray7806[i_766_], this.aFloatArray7806[i_767_], this.aFloatArray7784[i_765_], this.aFloatArray7784[i_766_], this.aFloatArray7784[i_767_], this.aFloatArray7807[i_765_], this.aFloatArray7807[i_766_], this.aFloatArray7807[i_767_], StaticMethods.method4215((Class379.anIntArray4096[(this.anIntArray7763[i]) & 0xffff]), (this.aClass15_7735.anInt184) * 688695183, f * 255.0F), StaticMethods.method4215((Class379.anIntArray4096[(this.anIntArray7764[i]) & 0xffff]), (this.aClass15_7735.anInt184) * 688695183, f_768_ * 255.0F), StaticMethods.method4215((Class379.anIntArray4096[(this.anIntArray7801[i]) & 0xffff]), (this.aClass15_7735.anInt184) * 688695183, f_769_ * 255.0F));
			} else {
				int i_770_ = -16777216;
				if (this.aByteArray7773 != null)
					i_770_ = 255 - (this.aByteArray7773[i] & 0xff) << 24;
				if (this.anIntArray7801[i] == -1) {
					int i_771_ = i_770_ | (this.anIntArray7763[i] & 0xffffff);
					this.aClass2_7737.method290(bool, bool_744_, bool_745_, this.aFloatArray7806[i_765_], this.aFloatArray7806[i_766_], this.aFloatArray7806[i_767_], this.aFloatArray7784[i_765_], this.aFloatArray7784[i_766_], this.aFloatArray7784[i_767_], this.aFloatArray7807[i_765_], this.aFloatArray7807[i_766_], this.aFloatArray7807[i_767_], this.aFloatArray7745[i_765_], this.aFloatArray7745[i_766_], this.aFloatArray7745[i_767_], this.aFloatArrayArray7738[i][0], this.aFloatArrayArray7738[i][1], this.aFloatArrayArray7738[i][2], this.aFloatArrayArray7762[i][0], this.aFloatArrayArray7762[i][1], this.aFloatArrayArray7762[i][2], i_771_, i_771_, i_771_, (this.aClass15_7735.anInt184) * 688695183, f * 255.0F, f_768_ * 255.0F, f_769_ * 255.0F, this.aShortArray7774[i]);
				} else
					this.aClass2_7737.method290(bool, bool_744_, bool_745_, this.aFloatArray7806[i_765_], this.aFloatArray7806[i_766_], this.aFloatArray7806[i_767_], this.aFloatArray7784[i_765_], this.aFloatArray7784[i_766_], this.aFloatArray7784[i_767_], this.aFloatArray7807[i_765_], this.aFloatArray7807[i_766_], this.aFloatArray7807[i_767_], this.aFloatArray7745[i_765_], this.aFloatArray7745[i_766_], this.aFloatArray7745[i_767_], this.aFloatArrayArray7738[i][0], this.aFloatArrayArray7738[i][1], this.aFloatArrayArray7738[i][2], this.aFloatArrayArray7762[i][0], this.aFloatArrayArray7762[i][1], this.aFloatArrayArray7762[i][2], i_770_ | (this.anIntArray7763[i] & 0xffffff), i_770_ | (this.anIntArray7764[i] & 0xffffff), i_770_ | (this.anIntArray7801[i] & 0xffffff), (this.aClass15_7735.anInt184) * 688695183, f * 255.0F, f_768_ * 255.0F, f_769_ * 255.0F, this.aShortArray7774[i]);
			}
		}
	}

	boolean ea() {
		if (this.anIntArrayArray7778 == null)
			return false;
		this.anInt7782 = 0;
		this.anInt7783 = 0;
		this.anInt7781 = 0;
		return true;
	}

	void method4806() {
		synchronized (this) {
			for (int i = 0; i < this.anInt7799; i++) {
				int i_772_ = this.anIntArray7753[i];
				this.anIntArray7753[i] = this.anIntArray7751[i];
				this.anIntArray7751[i] = -i_772_;
			}
			method4800();
		}
	}

	public void method4463(Matrix43f viewingAngles) {
		method4789(this.javaGraphicsToolkit.method5202(Thread.currentThread()));
		Matrix4f matrix4f = this.aClass15_7735.aMatrix4f_194;
		matrix4f.method2145(viewingAngles);
		if (this.aEmissiveTriangleArray7750 != null) {
			for (int i = 0; i < this.aEmissiveTriangleArray7750.length; i++) {
				EmissiveTriangle emissiveTriangle = this.aEmissiveTriangleArray7750[i];
				EmissiveTriangle emissiveTriangle_773_ = emissiveTriangle;
				if (emissiveTriangle.aEmissiveTriangle_776 != null)
					emissiveTriangle_773_ = emissiveTriangle.aEmissiveTriangle_776;
				emissiveTriangle_773_.anInt777 = ((int) (matrix4f.aFloatArray2594[12] + ((matrix4f.aFloatArray2594[0] * (float) (this.anIntArray7751[emissiveTriangle.anInt773 * -710317103])) + (matrix4f.aFloatArray2594[4] * (float) (this.anIntArray7752[(emissiveTriangle.anInt773 * -710317103)])) + (matrix4f.aFloatArray2594[8] * (float) (this.anIntArray7753[(emissiveTriangle.anInt773 * -710317103)])))) * -1879868075);
				emissiveTriangle_773_.anInt783 = ((int) (matrix4f.aFloatArray2594[13] + ((matrix4f.aFloatArray2594[1] * (float) (this.anIntArray7751[emissiveTriangle.anInt773 * -710317103])) + (matrix4f.aFloatArray2594[5] * (float) (this.anIntArray7752[(emissiveTriangle.anInt773 * -710317103)])) + (matrix4f.aFloatArray2594[9] * (float) (this.anIntArray7753[(emissiveTriangle.anInt773 * -710317103)])))) * -2041556771);
				emissiveTriangle_773_.anInt779 = ((int) (matrix4f.aFloatArray2594[14] + ((matrix4f.aFloatArray2594[2] * (float) (this.anIntArray7751[emissiveTriangle.anInt773 * -710317103])) + (matrix4f.aFloatArray2594[6] * (float) (this.anIntArray7752[(emissiveTriangle.anInt773 * -710317103)])) + (matrix4f.aFloatArray2594[10] * (float) (this.anIntArray7753[(emissiveTriangle.anInt773 * -710317103)])))) * -1434499227);
				emissiveTriangle_773_.anInt772 = ((int) (matrix4f.aFloatArray2594[12] + ((matrix4f.aFloatArray2594[0] * (float) (this.anIntArray7751[emissiveTriangle.anInt774 * 1705862021])) + (matrix4f.aFloatArray2594[4] * (float) (this.anIntArray7752[(emissiveTriangle.anInt774 * 1705862021)])) + (matrix4f.aFloatArray2594[8] * (float) (this.anIntArray7753[(emissiveTriangle.anInt774 * 1705862021)])))) * 1070341177);
				emissiveTriangle_773_.anInt781 = ((int) (matrix4f.aFloatArray2594[13] + ((matrix4f.aFloatArray2594[1] * (float) (this.anIntArray7751[emissiveTriangle.anInt774 * 1705862021])) + (matrix4f.aFloatArray2594[5] * (float) (this.anIntArray7752[(emissiveTriangle.anInt774 * 1705862021)])) + (matrix4f.aFloatArray2594[9] * (float) (this.anIntArray7753[(emissiveTriangle.anInt774 * 1705862021)])))) * 1802851857);
				emissiveTriangle_773_.anInt782 = (int) (matrix4f.aFloatArray2594[14] + ((matrix4f.aFloatArray2594[2] * (float) (this.anIntArray7751[emissiveTriangle.anInt774 * 1705862021])) + (matrix4f.aFloatArray2594[6] * (float) (this.anIntArray7752[emissiveTriangle.anInt774 * 1705862021])) + (matrix4f.aFloatArray2594[10] * (float) (this.anIntArray7753[(emissiveTriangle.anInt774 * 1705862021)])))) * 103846281;
				emissiveTriangle_773_.anInt771 = ((int) (matrix4f.aFloatArray2594[12] + ((matrix4f.aFloatArray2594[0] * (float) (this.anIntArray7751[emissiveTriangle.anInt775 * 1636170731])) + (matrix4f.aFloatArray2594[4] * (float) (this.anIntArray7752[(emissiveTriangle.anInt775 * 1636170731)])) + (matrix4f.aFloatArray2594[8] * (float) (this.anIntArray7753[(emissiveTriangle.anInt775 * 1636170731)])))) * -2103324039);
				emissiveTriangle_773_.anInt784 = ((int) (matrix4f.aFloatArray2594[13] + ((matrix4f.aFloatArray2594[1] * (float) (this.anIntArray7751[emissiveTriangle.anInt775 * 1636170731])) + (matrix4f.aFloatArray2594[5] * (float) (this.anIntArray7752[(emissiveTriangle.anInt775 * 1636170731)])) + (matrix4f.aFloatArray2594[9] * (float) (this.anIntArray7753[(emissiveTriangle.anInt775 * 1636170731)])))) * -526039059);
				emissiveTriangle_773_.anInt785 = (int) (matrix4f.aFloatArray2594[14] + ((matrix4f.aFloatArray2594[2] * (float) (this.anIntArray7751[emissiveTriangle.anInt775 * 1636170731])) + (matrix4f.aFloatArray2594[6] * (float) (this.anIntArray7752[emissiveTriangle.anInt775 * 1636170731])) + (matrix4f.aFloatArray2594[10] * (float) (this.anIntArray7753[(emissiveTriangle.anInt775 * 1636170731)])))) * 491030489;
			}
		}
		if (this.aEffectiveVertexArray7754 != null) {
			for (int i = 0; i < this.aEffectiveVertexArray7754.length; i++) {
				EffectiveVertex effectiveVertex = this.aEffectiveVertexArray7754[i];
				EffectiveVertex effectiveVertex_774_ = effectiveVertex;
				if (effectiveVertex.aEffectiveVertex_672 != null)
					effectiveVertex_774_ = effectiveVertex.aEffectiveVertex_672;
				if (effectiveVertex.aMatrix4f_677 != null)
					effectiveVertex.aMatrix4f_677.method2142(matrix4f);
				else
					effectiveVertex.aMatrix4f_677 = new Matrix4f(matrix4f);
				effectiveVertex_774_.anInt671 = ((int) (matrix4f.aFloatArray2594[12] + ((matrix4f.aFloatArray2594[0] * (float) (this.anIntArray7751[effectiveVertex.anInt674 * -180596249])) + (matrix4f.aFloatArray2594[4] * (float) (this.anIntArray7752[(effectiveVertex.anInt674 * -180596249)])) + (matrix4f.aFloatArray2594[8] * (float) (this.anIntArray7753[(effectiveVertex.anInt674 * -180596249)])))) * -1436341053);
				effectiveVertex_774_.anInt675 = (int) (matrix4f.aFloatArray2594[13] + ((matrix4f.aFloatArray2594[1] * (float) (this.anIntArray7751[effectiveVertex.anInt674 * -180596249])) + (matrix4f.aFloatArray2594[5] * (float) (this.anIntArray7752[effectiveVertex.anInt674 * -180596249])) + (matrix4f.aFloatArray2594[9] * (float) (this.anIntArray7753[(effectiveVertex.anInt674 * -180596249)])))) * 449866009;
				effectiveVertex_774_.anInt676 = ((int) (matrix4f.aFloatArray2594[14] + ((matrix4f.aFloatArray2594[2] * (float) (this.anIntArray7751[effectiveVertex.anInt674 * -180596249])) + (matrix4f.aFloatArray2594[6] * (float) (this.anIntArray7752[(effectiveVertex.anInt674 * -180596249)])) + (matrix4f.aFloatArray2594[10] * (float) (this.anIntArray7753[(effectiveVertex.anInt674 * -180596249)])))) * 1336328763);
			}
		}
	}

	public Class_na ga(Class_na class_na) {
		return null;
	}

	void method4807() {
		if (!this.aBoolean7792) {
			int i = 0;
			int i_775_ = 0;
			int i_776_ = 32767;
			int i_777_ = 32767;
			int i_778_ = 32767;
			int i_779_ = -32768;
			int i_780_ = -32768;
			int i_781_ = -32768;
			for (int i_782_ = 0; i_782_ < this.anInt7742; i_782_++) {
				int i_783_ = this.anIntArray7751[i_782_];
				int i_784_ = this.anIntArray7752[i_782_];
				int i_785_ = this.anIntArray7753[i_782_];
				if (i_783_ < i_776_)
					i_776_ = i_783_;
				if (i_783_ > i_779_)
					i_779_ = i_783_;
				if (i_784_ < i_777_)
					i_777_ = i_784_;
				if (i_784_ > i_780_)
					i_780_ = i_784_;
				if (i_785_ < i_778_)
					i_778_ = i_785_;
				if (i_785_ > i_781_)
					i_781_ = i_785_;
				int i_786_ = i_783_ * i_783_ + i_785_ * i_785_;
				if (i_786_ > i)
					i = i_786_;
				i_786_ += i_784_ * i_784_;
				if (i_786_ > i_775_)
					i_775_ = i_786_;
			}
			this.aShort7797 = (short) i_776_;
			this.aShort7743 = (short) i_779_;
			this.aShort7770 = (short) i_777_;
			this.aShort7796 = (short) i_780_;
			this.aShort7795 = (short) i_778_;
			this.aShort7800 = (short) i_781_;
			this.aShort7739 = (short) (int) (Math.sqrt((double) i) + 0.99);
			this.aShort7794 = (short) (int) (Math.sqrt((double) i_775_) + 0.99);
			this.aBoolean7792 = true;
		}
	}

	public int N() {
		if (!this.aBoolean7792)
			method4807();
		return this.aShort7739;
	}

	public int n() {
		if (!this.aBoolean7792)
			method4807();
		return this.aShort7794;
	}

	public int RA() {
		if (!this.aBoolean7792)
			method4807();
		return this.aShort7797;
	}

	public int ya() {
		if (!this.aBoolean7792)
			method4807();
		return this.aShort7743;
	}

	public int YA() {
		if (!this.aBoolean7792)
			method4807();
		return this.aShort7770;
	}

	void method4808() {
		this.aClass1Array7755 = new Class1[this.anInt7742];
		for (int i = 0; i < this.anInt7742; i++)
			this.aClass1Array7755[i] = new Class1();
		for (int i = 0; i < this.anInt7757; i++) {
			short i_787_ = this.aShortArray7758[i];
			short i_788_ = this.aShortArray7759[i];
			short i_789_ = this.aShortArray7760[i];
			int i_790_ = (this.anIntArray7751[i_788_] - this.anIntArray7751[i_787_]);
			int i_791_ = (this.anIntArray7752[i_788_] - this.anIntArray7752[i_787_]);
			int i_792_ = (this.anIntArray7753[i_788_] - this.anIntArray7753[i_787_]);
			int i_793_ = (this.anIntArray7751[i_789_] - this.anIntArray7751[i_787_]);
			int i_794_ = (this.anIntArray7752[i_789_] - this.anIntArray7752[i_787_]);
			int i_795_ = (this.anIntArray7753[i_789_] - this.anIntArray7753[i_787_]);
			int i_796_ = i_791_ * i_795_ - i_794_ * i_792_;
			int i_797_ = i_792_ * i_793_ - i_795_ * i_790_;
			int i_798_;
			for (i_798_ = i_790_ * i_794_ - i_793_ * i_791_; (i_796_ > 8192 || i_797_ > 8192 || i_798_ > 8192 || i_796_ < -8192 || i_797_ < -8192 || i_798_ < -8192); i_798_ >>= 1) {
				i_796_ >>= 1;
				i_797_ >>= 1;
			}
			int i_799_ = (int) Math.sqrt((double) (i_796_ * i_796_ + i_797_ * i_797_ + i_798_ * i_798_));
			if (i_799_ <= 0)
				i_799_ = 1;
			i_796_ = i_796_ * 256 / i_799_;
			i_797_ = i_797_ * 256 / i_799_;
			i_798_ = i_798_ * 256 / i_799_;
			byte i_800_;
			if (this.aByteArray7771 == null)
				i_800_ = (byte) 0;
			else
				i_800_ = this.aByteArray7771[i];
			if (i_800_ == 0) {
				Class1 class1 = this.aClass1Array7755[i_787_];
				class1.anInt13 += i_796_;
				class1.anInt12 += i_797_;
				class1.anInt14 += i_798_;
				class1.anInt15++;
				class1 = this.aClass1Array7755[i_788_];
				class1.anInt13 += i_796_;
				class1.anInt12 += i_797_;
				class1.anInt14 += i_798_;
				class1.anInt15++;
				class1 = this.aClass1Array7755[i_789_];
				class1.anInt13 += i_796_;
				class1.anInt12 += i_797_;
				class1.anInt14 += i_798_;
				class1.anInt15++;
			} else if (i_800_ == 1) {
				if (this.aClass5Array7740 == null)
					this.aClass5Array7740 = new Class5[this.anInt7757];
				Class5 class5 = (this.aClass5Array7740[i] = new Class5());
				class5.anInt78 = i_796_;
				class5.anInt79 = i_797_;
				class5.anInt80 = i_798_;
			}
		}
	}

	public int AA() {
		if (!this.aBoolean7792)
			method4807();
		return this.aShort7795;
	}

    public void p(int i) {
		if ((this.animationFlag & 0x1000) != 4096)
			throw new IllegalStateException();
		this.anInt7747 = i;
		this.anInt7812 = 0;
	}

	public boolean method4787(int i, int i_805_, Matrix43f class222, boolean bool, int i_806_) {
		method4789(this.javaGraphicsToolkit.method5202(Thread.currentThread()));
		Matrix4f matrix4f = this.aClass15_7735.aMatrix4f_194;
		matrix4f.method2145(class222);
		Matrix4f matrix4f_807_ = this.aClass15_7735.aMatrix4f_195;
		matrix4f_807_.method2142(matrix4f);
		matrix4f_807_.method2144(this.javaGraphicsToolkit.aMatrix4f_7987);
		boolean bool_808_ = false;
		int i_809_ = 2147483647;
		int i_810_ = -2147483648;
		int i_811_ = 2147483647;
		int i_812_ = -2147483648;
		if (!this.aBoolean7792)
			method4807();
		int i_813_ = ((this.aShort7743 - this.aShort7797) >> 1);
		int i_814_ = ((this.aShort7796 - this.aShort7770) >> 1);
		int i_815_ = ((this.aShort7800 - this.aShort7795) >> 1);
		int i_816_ = this.aShort7797 + i_813_;
		int i_817_ = this.aShort7770 + i_814_;
		int i_818_ = this.aShort7795 + i_815_;
		int i_819_ = i_816_ - (i_813_ << i_806_);
		int i_820_ = i_817_ - (i_814_ << i_806_);
		int i_821_ = i_818_ - (i_815_ << i_806_);
		int i_822_ = i_816_ + (i_813_ << i_806_);
		int i_823_ = i_817_ + (i_814_ << i_806_);
		int i_824_ = i_818_ + (i_815_ << i_806_);
		this.anIntArray7809[0] = i_819_;
		this.anIntArray7761[0] = i_820_;
		this.anIntArray7811[0] = i_821_;
		this.anIntArray7809[1] = i_822_;
		this.anIntArray7761[1] = i_820_;
		this.anIntArray7811[1] = i_821_;
		this.anIntArray7809[2] = i_819_;
		this.anIntArray7761[2] = i_823_;
		this.anIntArray7811[2] = i_821_;
		this.anIntArray7809[3] = i_822_;
		this.anIntArray7761[3] = i_823_;
		this.anIntArray7811[3] = i_821_;
		this.anIntArray7809[4] = i_819_;
		this.anIntArray7761[4] = i_820_;
		this.anIntArray7811[4] = i_824_;
		this.anIntArray7809[5] = i_822_;
		this.anIntArray7761[5] = i_820_;
		this.anIntArray7811[5] = i_824_;
		this.anIntArray7809[6] = i_819_;
		this.anIntArray7761[6] = i_823_;
		this.anIntArray7811[6] = i_824_;
		this.anIntArray7809[7] = i_822_;
		this.anIntArray7761[7] = i_823_;
		this.anIntArray7811[7] = i_824_;
		for (int i_825_ = 0; i_825_ < 8; i_825_++) {
			int i_826_ = this.anIntArray7809[i_825_];
			int i_827_ = this.anIntArray7761[i_825_];
			int i_828_ = this.anIntArray7811[i_825_];
			float f = (matrix4f_807_.aFloatArray2594[2] * (float) i_826_ + matrix4f_807_.aFloatArray2594[6] * (float) i_827_ + matrix4f_807_.aFloatArray2594[10] * (float) i_828_ + matrix4f_807_.aFloatArray2594[14]);
			float f_829_ = (matrix4f_807_.aFloatArray2594[3] * (float) i_826_ + matrix4f_807_.aFloatArray2594[7] * (float) i_827_ + matrix4f_807_.aFloatArray2594[11] * (float) i_828_ + matrix4f_807_.aFloatArray2594[15]);
			if (f >= -f_829_) {
				float f_830_ = (matrix4f_807_.aFloatArray2594[0] * (float) i_826_ + matrix4f_807_.aFloatArray2594[4] * (float) i_827_ + matrix4f_807_.aFloatArray2594[8] * (float) i_828_ + matrix4f_807_.aFloatArray2594[12]);
				float f_831_ = (matrix4f_807_.aFloatArray2594[1] * (float) i_826_ + matrix4f_807_.aFloatArray2594[5] * (float) i_827_ + matrix4f_807_.aFloatArray2594[9] * (float) i_828_ + matrix4f_807_.aFloatArray2594[13]);
				int i_832_ = (int) ((this.javaGraphicsToolkit.aFloat8005) + (this.javaGraphicsToolkit.aFloat7993) * f_830_ / f_829_);
				int i_833_ = (int) ((this.javaGraphicsToolkit.aFloat7996) + (this.javaGraphicsToolkit.aFloat7995) * f_831_ / f_829_);
				if (i_832_ < i_809_)
					i_809_ = i_832_;
				if (i_832_ > i_810_)
					i_810_ = i_832_;
				if (i_833_ < i_811_)
					i_811_ = i_833_;
				if (i_833_ > i_812_)
					i_812_ = i_833_;
				bool_808_ = true;
			}
		}
		if (bool_808_ && i > i_809_ && i < i_810_ && i_805_ > i_811_ && i_805_ < i_812_) {
			if (bool)
				return true;
			for (int i_834_ = 0; i_834_ < this.anInt7799; i_834_++) {
				int i_835_ = this.anIntArray7751[i_834_];
				int i_836_ = this.anIntArray7752[i_834_];
				int i_837_ = this.anIntArray7753[i_834_];
				float f = (matrix4f_807_.aFloatArray2594[2] * (float) i_835_ + matrix4f_807_.aFloatArray2594[6] * (float) i_836_ + matrix4f_807_.aFloatArray2594[10] * (float) i_837_ + matrix4f_807_.aFloatArray2594[14]);
				float f_838_ = (matrix4f_807_.aFloatArray2594[3] * (float) i_835_ + matrix4f_807_.aFloatArray2594[7] * (float) i_836_ + matrix4f_807_.aFloatArray2594[11] * (float) i_837_ + matrix4f_807_.aFloatArray2594[15]);
				if (f >= -f_838_) {
					float f_839_ = (matrix4f_807_.aFloatArray2594[0] * (float) i_835_ + matrix4f_807_.aFloatArray2594[4] * (float) i_836_ + matrix4f_807_.aFloatArray2594[8] * (float) i_837_ + matrix4f_807_.aFloatArray2594[12]);
					float f_840_ = (matrix4f_807_.aFloatArray2594[1] * (float) i_835_ + matrix4f_807_.aFloatArray2594[5] * (float) i_836_ + matrix4f_807_.aFloatArray2594[9] * (float) i_837_ + matrix4f_807_.aFloatArray2594[13]);
					this.aFloatArray7784[i_834_] = (float) (int) (this.javaGraphicsToolkit.aFloat8005 + (this.javaGraphicsToolkit.aFloat7993 * f_839_ / f_838_));
					this.aFloatArray7806[i_834_] = (float) (int) (this.javaGraphicsToolkit.aFloat7996 + (this.javaGraphicsToolkit.aFloat7995 * f_840_ / f_838_));
				} else
					this.aFloatArray7784[i_834_] = -999999.0F;
			}
			for (int i_841_ = 0; i_841_ < this.anInt7757; i_841_++) {
				if (((this.aFloatArray7784[this.aShortArray7758[i_841_]]) != -999999.0F) && ((this.aFloatArray7784[this.aShortArray7759[i_841_]]) != -999999.0F) && ((this.aFloatArray7784[this.aShortArray7760[i_841_]]) != -999999.0F) && (method4801(i, i_805_, (this.aFloatArray7806[this.aShortArray7758[i_841_]]), (this.aFloatArray7806[this.aShortArray7759[i_841_]]), (this.aFloatArray7806[this.aShortArray7760[i_841_]]), (this.aFloatArray7784[this.aShortArray7758[i_841_]]), (this.aFloatArray7784[this.aShortArray7759[i_841_]]), (this.aFloatArray7784[this.aShortArray7760[i_841_]]))))
					return true;
			}
		}
		return false;
	}

    public byte[] ah() {
		return this.aByteArray7773;
	}

	public void X(short i, short i_875_) {
		for (int i_876_ = 0; i_876_ < this.anInt7757; i_876_++) {
			if (this.aShortArray7775[i_876_] == i)
				this.aShortArray7775[i_876_] = i_875_;
		}
		if (this.aClass16Array7789 != null) {
			for (int i_877_ = 0; i_877_ < this.anInt7788; i_877_++) {
				Class16 class16 = this.aClass16Array7789[i_877_];
				Class18 class18 = this.aClass18Array7790[i_877_];
				class18.anInt254 = (class18.anInt254 * -1509687305 & ~0xffffff | ((Class379.anIntArray4096[Class173.method1823((this.aShortArray7775[(class16.anInt226 * -1295149283)])) & 0xffff]) & 0xffffff)) * -564629049;
			}
		}
		if (this.anInt7812 == 2)
			this.anInt7812 = 1;
	}

    public void method4742(byte i, byte[] is) {
		if ((this.animationFlag & 0x100000) == 0)
			throw new RuntimeException();
		if (this.aByteArray7773 == null)
			this.aByteArray7773 = new byte[this.anInt7757];
		if (is == null) {
			for (int i_878_ = 0; i_878_ < this.anInt7757; i_878_++)
				this.aByteArray7773[i_878_] = i;
		} else {
			for (int i_879_ = 0; i_879_ < this.anInt7757; i_879_++) {
				int i_880_ = 255 - ((255 - (is[i_879_] & 0xff)) * (255 - (i & 0xff)) / 255);
				this.aByteArray7773[i_879_] = (byte) i_880_;
			}
		}
		if (this.anInt7812 == 2)
			this.anInt7812 = 1;
	}

    void ka() {
		if (this.aBoolean7780) {
			for (int i = 0; i < this.anInt7799; i++) {
				this.anIntArray7751[i] = this.anIntArray7751[i] + 7 >> 4;
				this.anIntArray7752[i] = this.anIntArray7752[i] + 7 >> 4;
				this.anIntArray7753[i] = this.anIntArray7753[i] + 7 >> 4;
			}
			this.aBoolean7780 = false;
		}
		if (this.aBoolean7733) {
			method4792();
			this.aBoolean7733 = false;
		}
		this.aBoolean7792 = false;
	}

	public EffectiveVertex[] method4445() {
		return this.aEffectiveVertexArray7754;
	}

	public boolean method4743() {
		if (this.aShortArray7774 == null)
			return true;
		for (int i = 0; i < this.aShortArray7774.length; i++) {
			if (this.aShortArray7774[i] != -1 && !this.javaGraphicsToolkit.method5200(this.aShortArray7774[i]))
				return false;
		}
		return true;
	}

    public boolean u() {
		return this.aBoolean7777;
	}

	public void wa() {
		if ((this.animationFlag & 0x10) != 16)
			throw new IllegalStateException();
		synchronized (this) {
			for (int i = 0; i < this.anInt7799; i++)
				this.anIntArray7753[i] = -this.anIntArray7753[i];
			if (this.aClass1Array7755 != null) {
				for (int i = 0; i < this.anInt7742; i++) {
					if (this.aClass1Array7755[i] != null)
						this.aClass1Array7755[i].anInt14 = -this.aClass1Array7755[i].anInt14;
				}
			}
			if (this.aClass1Array7786 != null) {
				for (int i = 0; i < this.anInt7742; i++) {
					if (this.aClass1Array7786[i] != null)
						this.aClass1Array7786[i].anInt14 = -this.aClass1Array7786[i].anInt14;
				}
			}
			if (this.aClass5Array7740 != null) {
				for (int i = 0; i < this.anInt7757; i++) {
					if (this.aClass5Array7740[i] != null)
						this.aClass5Array7740[i].anInt80 = -this.aClass5Array7740[i].anInt80;
				}
			}
			short[] is = this.aShortArray7758;
			this.aShortArray7758 = this.aShortArray7760;
			this.aShortArray7760 = is;
			if (this.aFloatArrayArray7738 != null) {
				for (int i = 0; i < this.anInt7757; i++) {
					if (this.aFloatArrayArray7738[i] != null) {
						float f = (this.aFloatArrayArray7738[i][0]);
						this.aFloatArrayArray7738[i][0] = (this.aFloatArrayArray7738[i][2]);
						this.aFloatArrayArray7738[i][2] = f;
					}
					if (this.aFloatArrayArray7762[i] != null) {
						float f = (this.aFloatArrayArray7762[i][0]);
						this.aFloatArrayArray7762[i][0] = (this.aFloatArrayArray7762[i][2]);
						this.aFloatArrayArray7762[i][2] = f;
					}
				}
			}
			this.aBoolean7792 = false;
			this.anInt7812 = 0;
		}
	}

    public void PA(int i, int i_885_, int i_886_, int i_887_) {
		if ((this.animationFlag & 0x80000) != 524288)
			throw new IllegalStateException();
		for (int i_888_ = 0; i_888_ < this.anInt7757; i_888_++) {
			int i_889_ = this.aShortArray7775[i_888_] & 0xffff;
			int i_890_ = i_889_ >> 10 & 0x3f;
			int i_891_ = i_889_ >> 7 & 0x7;
			int i_892_ = i_889_ & 0x7f;
			if (i != -1)
				i_890_ += (i - i_890_) * i_887_ >> 7;
			if (i_885_ != -1)
				i_891_ += (i_885_ - i_891_) * i_887_ >> 7;
			if (i_886_ != -1)
				i_892_ += (i_886_ - i_892_) * i_887_ >> 7;
			this.aShortArray7775[i_888_] = (short) (i_890_ << 10 | i_891_ << 7 | i_892_);
		}
		if (this.aClass16Array7789 != null) {
			for (int i_893_ = 0; i_893_ < this.anInt7788; i_893_++) {
				Class16 class16 = this.aClass16Array7789[i_893_];
				Class18 class18 = this.aClass18Array7790[i_893_];
				class18.anInt254 = (class18.anInt254 * -1509687305 & ~0xffffff | ((Class379.anIntArray4096[Class173.method1823((this.aShortArray7775[(class16.anInt226 * -1295149283)]) & 0xffff) & 0xffff]) & 0xffffff)) * -564629049;
			}
		}
		if (this.anInt7812 == 2)
			this.anInt7812 = 1;
	}

    void method4809() {
		synchronized (this) {
			for (int i = 0; i < this.anInt7799; i++) {
				int i_894_ = this.anIntArray7751[i];
				this.anIntArray7751[i] = this.anIntArray7753[i];
				this.anIntArray7753[i] = -i_894_;
			}
			method4800();
		}
	}

	void method4810(boolean bool) {
		do {
			if ((this.javaGraphicsToolkit.anInt7999) * -922307687 > 1) {
				synchronized (this) {
					method4790(bool);
					break;
				}
			}
			method4790(bool);
		} while (false);
	}

	public void method4741(Matrix43f class222, int i, boolean bool) {
		if (this.aShortArray7816 != null) {
			Class15 class15 = this.javaGraphicsToolkit.method5202(Thread.currentThread());
			Matrix43f class222_895_ = class15.aClass222_189;
			class222_895_.copy(class222);
			if (bool)
				class222_895_.method2058();
			Matrix4f matrix4f = class15.aMatrix4f_194;
			matrix4f.method2145(class222_895_);
			float[] fs = new float[3];
			for (int i_896_ = 0; i_896_ < this.anInt7742; i_896_++) {
				if ((i & this.aShortArray7816[i_896_]) != 0) {
					matrix4f.method2149((float) this.anIntArray7751[i_896_], (float) this.anIntArray7752[i_896_], (float) this.anIntArray7753[i_896_], fs);
					this.anIntArray7751[i_896_] = (int) fs[0];
					this.anIntArray7752[i_896_] = (int) fs[1];
					this.anIntArray7753[i_896_] = (int) fs[2];
				}
			}
		}
	}

	public void ia(int i, int i_897_, int i_898_) {
		if (i != 0 && (this.animationFlag & 0x1) != 1)
			throw new IllegalStateException();
		if (i_897_ != 0 && (this.animationFlag & 0x2) != 2)
			throw new IllegalStateException();
		if (i_898_ != 0 && (this.animationFlag & 0x4) != 4)
			throw new IllegalStateException();
		synchronized (this) {
			for (int i_899_ = 0; i_899_ < this.anInt7799; i_899_++) {
				this.anIntArray7751[i_899_] += i;
				this.anIntArray7752[i_899_] += i_897_;
				this.anIntArray7753[i_899_] += i_898_;
			}
		}
	}

    void method4811(Matrix43f matrix, Class302_Sub1 class302_sub1, int i) {
		if (this.anInt7742 >= 1) {
			Class15 class15 = this.javaGraphicsToolkit.method5202(Thread.currentThread());
			Matrix4f matrix4f = class15.aMatrix4f_194;
			matrix4f.method2145(matrix);
			Matrix4f matrix4f_933_ = (this.javaGraphicsToolkit.aMatrix4f_8000);
			Matrix4f matrix4f_934_ = (this.javaGraphicsToolkit.aMatrix4f_7986);
			if (!this.aBoolean7792)
				method4807();
			boolean bool = matrix4f.method2148();
			float[] fs = class15.aFloatArray198;
			matrix4f.method2149(0.0F, (float) this.aShort7770, 0.0F, fs);
			float f = fs[0];
			float f_935_ = fs[1];
			float f_936_ = fs[2];
			matrix4f.method2149(0.0F, (float) this.aShort7796, 0.0F, fs);
			float f_937_ = fs[0];
			float f_938_ = fs[1];
			float f_939_ = fs[2];
			for (int i_940_ = 0; i_940_ < 6; i_940_++) {
				float[] fs_941_ = (this.javaGraphicsToolkit.aFloatArrayArray7988[i_940_]);
				float f_942_ = (fs_941_[0] * f + fs_941_[1] * f_935_ + fs_941_[2] * f_936_ + fs_941_[3] + (float) this.aShort7739);
				float f_943_ = (fs_941_[0] * f_937_ + fs_941_[1] * f_938_ + fs_941_[2] * f_939_ + fs_941_[3] + (float) this.aShort7739);
				if (f_942_ < 0.0F && f_943_ < 0.0F)
					return;
			}
			float f_944_;
			float f_945_;
			if (bool) {
				f_944_ = matrix4f_933_.aFloatArray2594[14];
				f_945_ = matrix4f_933_.aFloatArray2594[6];
			} else {
				f_944_ = ((matrix4f.aFloatArray2594[12] * matrix4f_933_.aFloatArray2594[2]) + (matrix4f.aFloatArray2594[13] * matrix4f_933_.aFloatArray2594[6]) + (matrix4f.aFloatArray2594[14] * matrix4f_933_.aFloatArray2594[10]) + matrix4f_933_.aFloatArray2594[14]);
				f_945_ = ((matrix4f.aFloatArray2594[4] * matrix4f_933_.aFloatArray2594[2]) + (matrix4f.aFloatArray2594[5] * matrix4f_933_.aFloatArray2594[6]) + (matrix4f.aFloatArray2594[6] * matrix4f_933_.aFloatArray2594[10]));
			}
			float f_946_ = f_944_ + (float) this.aShort7770 * f_945_;
			float f_947_ = f_944_ + (float) this.aShort7796 * f_945_;
			float f_948_ = (f_946_ > f_947_ ? f_946_ + (float) this.aShort7739 : f_947_ + (float) this.aShort7739);
			float f_949_ = (matrix4f_934_.aFloatArray2594[10] * f_948_ + matrix4f_934_.aFloatArray2594[14]);
			if ((this.javaGraphicsToolkit.anInt7999) * -922307687 > 1) {
				synchronized (this) {
					while (this.aBoolean7808) {
						try {
							this.wait();
						} catch (InterruptedException interruptedexception) {
							/* empty */
						}
					}
					this.aBoolean7808 = true;
				}
			}
			method4789(class15);
			Matrix4f matrix4f_950_ = (this.aClass15_7735.aMatrix4f_195);
			matrix4f_950_.method2142(matrix4f);
			matrix4f_950_.method2144(this.javaGraphicsToolkit.aMatrix4f_7987);
			if ((i & 0x2) != 0)
				this.aClass2_7737.method289(true);
			else
				this.aClass2_7737.method289(false);
			boolean bool_951_ = false;
			this.aClass15_7735.aFloat220 = this.aClass2_7737.aFloat17;
			this.aClass15_7735.aFloat209 = this.aClass2_7737.aFloat26;
			this.aClass15_7735.aFloat211 = this.aClass2_7737.aFloat46;
			this.aClass15_7735.aFloat191 = (1.0F / this.aClass2_7737.aFloat46);
			this.aClass15_7735.aFloat208 = this.aClass2_7737.aFloat23;
			this.aClass15_7735.aFloat193 = this.aClass2_7737.aFloat25;
			this.aClass15_7735.aFloat212 = this.aClass2_7737.aFloat27;
			this.aClass15_7735.anInt214 = (this.aClass2_7737.anInt22 * 1927366897);
			for (int i_952_ = 0; i_952_ < this.anInt7799; i_952_++) {
				int i_953_ = this.anIntArray7751[i_952_];
				int i_954_ = this.anIntArray7752[i_952_];
				int i_955_ = this.anIntArray7753[i_952_];
				float f_956_ = (matrix4f_950_.aFloatArray2594[0] * (float) i_953_ + matrix4f_950_.aFloatArray2594[4] * (float) i_954_ + matrix4f_950_.aFloatArray2594[8] * (float) i_955_ + matrix4f_950_.aFloatArray2594[12]);
				float f_957_ = (matrix4f_950_.aFloatArray2594[1] * (float) i_953_ + matrix4f_950_.aFloatArray2594[5] * (float) i_954_ + matrix4f_950_.aFloatArray2594[9] * (float) i_955_ + matrix4f_950_.aFloatArray2594[13]);
				float f_958_ = (matrix4f_950_.aFloatArray2594[2] * (float) i_953_ + matrix4f_950_.aFloatArray2594[6] * (float) i_954_ + matrix4f_950_.aFloatArray2594[10] * (float) i_955_ + matrix4f_950_.aFloatArray2594[14]);
				float f_959_ = (matrix4f_950_.aFloatArray2594[3] * (float) i_953_ + matrix4f_950_.aFloatArray2594[7] * (float) i_954_ + matrix4f_950_.aFloatArray2594[11] * (float) i_955_ + matrix4f_950_.aFloatArray2594[15]);
				this.aFloatArray7807[i_952_] = ((this.aClass15_7735.aFloat212) + (this.aClass15_7735.aFloat211) * f_958_ / f_959_);
				this.aFloatArray7745[i_952_] = f_959_;
				if (f_958_ >= -f_959_) {
					this.aFloatArray7784[i_952_] = (float) (int) (this.aClass15_7735.aFloat208 + (this.aClass15_7735.aFloat220) * f_956_ / f_959_);
					this.aFloatArray7806[i_952_] = (float) (int) (this.aClass15_7735.aFloat193 + (this.aClass15_7735.aFloat209) * f_957_ / f_959_);
				} else {
					this.aFloatArray7784[i_952_] = -5000.0F;
					bool_951_ = true;
				}
				if (this.aClass15_7735.aBoolean186)
					this.anIntArray7734[i_952_] = (int) (matrix4f.aFloatArray2594[13] + ((matrix4f.aFloatArray2594[1] * (float) i_953_) + (matrix4f.aFloatArray2594[5] * (float) i_954_) + (matrix4f.aFloatArray2594[9] * (float) i_955_)));
			}
			if (this.aClass16Array7789 != null) {
				for (int i_960_ = 0; i_960_ < this.anInt7788; i_960_++) {
					Class16 class16 = this.aClass16Array7789[i_960_];
					Class18 class18 = this.aClass18Array7790[i_960_];
					short i_961_ = (this.aShortArray7758[class16.anInt226 * -1295149283]);
					short i_962_ = (this.aShortArray7759[class16.anInt226 * -1295149283]);
					short i_963_ = (this.aShortArray7760[class16.anInt226 * -1295149283]);
					int i_964_ = ((this.anIntArray7751[i_961_] + this.anIntArray7751[i_962_] + this.anIntArray7751[i_963_]) / 3);
					int i_965_ = ((this.anIntArray7752[i_961_] + this.anIntArray7752[i_962_] + this.anIntArray7752[i_963_]) / 3);
					int i_966_ = ((this.anIntArray7753[i_961_] + this.anIntArray7753[i_962_] + this.anIntArray7753[i_963_]) / 3);
					float f_967_ = (matrix4f_950_.aFloatArray2594[0] * (float) i_964_ + matrix4f_950_.aFloatArray2594[4] * (float) i_965_ + matrix4f_950_.aFloatArray2594[8] * (float) i_966_ + matrix4f_950_.aFloatArray2594[12]);
					float f_968_ = (matrix4f_950_.aFloatArray2594[1] * (float) i_964_ + matrix4f_950_.aFloatArray2594[5] * (float) i_965_ + matrix4f_950_.aFloatArray2594[9] * (float) i_966_ + matrix4f_950_.aFloatArray2594[13]);
					float f_969_ = (matrix4f_950_.aFloatArray2594[2] * (float) i_964_ + matrix4f_950_.aFloatArray2594[6] * (float) i_965_ + matrix4f_950_.aFloatArray2594[10] * (float) i_966_ + matrix4f_950_.aFloatArray2594[14]);
					float f_970_ = (matrix4f_950_.aFloatArray2594[3] * (float) i_964_ + matrix4f_950_.aFloatArray2594[7] * (float) i_965_ + matrix4f_950_.aFloatArray2594[11] * (float) i_966_ + matrix4f_950_.aFloatArray2594[15]);
					f_969_ += ((matrix4f_934_.aFloatArray2594[2] * (float) (class18.anInt247 * -1848560027)) + (matrix4f_934_.aFloatArray2594[6] * (float) (class18.anInt244 * -1070844791)));
					f_970_ += ((matrix4f_934_.aFloatArray2594[3] * (float) (class18.anInt247 * -1848560027)) + (matrix4f_934_.aFloatArray2594[7] * (float) (class18.anInt244 * -1070844791)));
					if (f_969_ > -f_970_) {
						f_967_ += ((matrix4f_934_.aFloatArray2594[0] * (float) (class18.anInt247 * -1848560027)) + (matrix4f_934_.aFloatArray2594[4] * (float) (class18.anInt244 * -1070844791)));
						f_968_ += ((matrix4f_934_.aFloatArray2594[1] * (float) (class18.anInt247 * -1848560027)) + (matrix4f_934_.aFloatArray2594[5] * (float) (class18.anInt244 * -1070844791)));
						float f_971_ = ((this.javaGraphicsToolkit.aFloat8005) + (this.javaGraphicsToolkit.aFloat7993) * f_967_ / f_970_);
						float f_972_ = ((this.javaGraphicsToolkit.aFloat7996) + (this.javaGraphicsToolkit.aFloat7995) * f_968_ / f_970_);
						float f_973_ = (class18.aFloat245 * (float) class16.aShort229);
						float f_974_ = (class18.aFloat248 * (float) class16.aShort231);
						float f_975_ = (f_967_ + matrix4f_934_.aFloatArray2594[0] * f_973_ + matrix4f_934_.aFloatArray2594[4] * f_974_);
						float f_976_ = (f_968_ + matrix4f_934_.aFloatArray2594[1] * f_973_ + matrix4f_934_.aFloatArray2594[5] * f_974_);
						float f_977_ = (f_970_ + matrix4f_934_.aFloatArray2594[3] * f_973_ + matrix4f_934_.aFloatArray2594[7] * f_974_);
						float f_978_ = ((this.javaGraphicsToolkit.aFloat8005) + (this.javaGraphicsToolkit.aFloat7993) * f_975_ / f_977_);
						float f_979_ = ((this.javaGraphicsToolkit.aFloat7996) + (this.javaGraphicsToolkit.aFloat7995) * f_976_ / f_977_);
						class18.anInt252 = (int) f_971_ * 748820179;
						class18.anInt251 = (int) f_972_ * 208390755;
						class18.aFloat250 = ((this.javaGraphicsToolkit.aFloat8004) + ((this.javaGraphicsToolkit.aFloat7997) * (f_969_ - (matrix4f_934_.aFloatArray2594[10] * (float) (class16.anInt232 * 1540031241))) / f_970_));
						class18.anInt246 = (int) (f_978_ < f_971_ ? f_971_ - f_978_ : f_978_ - f_971_) * -562729591;
						class18.anInt253 = (int) (f_979_ < f_972_ ? f_972_ - f_979_ : f_979_ - f_972_) * -1138250243;
					} else {
						Class18 class18_980_ = class18;
						class18.anInt253 = 0;
						class18_980_.anInt246 = 0;
					}
				}
			}
			if (class302_sub1 != null) {
				boolean bool_981_ = false;
				boolean bool_982_ = true;
				int i_983_ = ((this.aShort7797 + this.aShort7743) >> 1);
				int i_984_ = ((this.aShort7795 + this.aShort7800) >> 1);
				int i_985_ = i_983_;
				short i_986_ = this.aShort7770;
				int i_987_ = i_984_;
				float f_988_ = (matrix4f_950_.aFloatArray2594[0] * (float) i_985_ + matrix4f_950_.aFloatArray2594[4] * (float) i_986_ + matrix4f_950_.aFloatArray2594[8] * (float) i_987_ + matrix4f_950_.aFloatArray2594[12]);
				float f_989_ = (matrix4f_950_.aFloatArray2594[1] * (float) i_985_ + matrix4f_950_.aFloatArray2594[5] * (float) i_986_ + matrix4f_950_.aFloatArray2594[9] * (float) i_987_ + matrix4f_950_.aFloatArray2594[13]);
				float f_990_ = (matrix4f_950_.aFloatArray2594[2] * (float) i_985_ + matrix4f_950_.aFloatArray2594[6] * (float) i_986_ + matrix4f_950_.aFloatArray2594[10] * (float) i_987_ + matrix4f_950_.aFloatArray2594[14]);
				float f_991_ = (matrix4f_950_.aFloatArray2594[3] * (float) i_985_ + matrix4f_950_.aFloatArray2594[7] * (float) i_986_ + matrix4f_950_.aFloatArray2594[11] * (float) i_987_ + matrix4f_950_.aFloatArray2594[15]);
				if (f_990_ >= -f_991_) {
					class302_sub1.anInt7641 = (int) ((this.javaGraphicsToolkit.aFloat8005) + (this.javaGraphicsToolkit.aFloat7993) * f_988_ / f_991_);
					class302_sub1.anInt7642 = (int) ((this.javaGraphicsToolkit.aFloat7996) + (this.javaGraphicsToolkit.aFloat7995) * f_989_ / f_991_);
				} else
					bool_981_ = true;
				i_985_ = i_983_;
				i_986_ = this.aShort7796;
				i_987_ = i_984_;
				float f_992_ = (matrix4f_950_.aFloatArray2594[0] * (float) i_985_ + matrix4f_950_.aFloatArray2594[4] * (float) i_986_ + matrix4f_950_.aFloatArray2594[8] * (float) i_987_ + matrix4f_950_.aFloatArray2594[12]);
				float f_993_ = (matrix4f_950_.aFloatArray2594[1] * (float) i_985_ + matrix4f_950_.aFloatArray2594[5] * (float) i_986_ + matrix4f_950_.aFloatArray2594[9] * (float) i_987_ + matrix4f_950_.aFloatArray2594[13]);
				float f_994_ = (matrix4f_950_.aFloatArray2594[2] * (float) i_985_ + matrix4f_950_.aFloatArray2594[6] * (float) i_986_ + matrix4f_950_.aFloatArray2594[10] * (float) i_987_ + matrix4f_950_.aFloatArray2594[14]);
				float f_995_ = (matrix4f_950_.aFloatArray2594[3] * (float) i_985_ + matrix4f_950_.aFloatArray2594[7] * (float) i_986_ + matrix4f_950_.aFloatArray2594[11] * (float) i_987_ + matrix4f_950_.aFloatArray2594[15]);
				if (f_994_ >= -f_995_) {
					class302_sub1.anInt7643 = (int) ((this.javaGraphicsToolkit.aFloat8005) + (this.javaGraphicsToolkit.aFloat7993) * f_992_ / f_995_);
					class302_sub1.anInt7640 = (int) ((this.javaGraphicsToolkit.aFloat7996) + (this.javaGraphicsToolkit.aFloat7995) * f_993_ / f_995_);
				} else
					bool_981_ = true;
				if (bool_981_) {
					if (f_990_ < -f_991_ && f_994_ < -f_995_)
						bool_982_ = false;
					else if (f_990_ < -f_991_) {
						float f_996_ = (f_990_ + f_991_) / (f_994_ + f_995_) - 1.0F;
						float f_997_ = f_988_ + f_996_ * (f_992_ - f_988_);
						float f_998_ = f_989_ + f_996_ * (f_993_ - f_989_);
						float f_999_ = f_991_ + f_996_ * (f_995_ - f_991_);
						class302_sub1.anInt7641 = (int) ((this.javaGraphicsToolkit.aFloat8005) + (this.javaGraphicsToolkit.aFloat7993 * f_997_ / f_999_));
						class302_sub1.anInt7642 = (int) ((this.javaGraphicsToolkit.aFloat7996) + (this.javaGraphicsToolkit.aFloat7995 * f_998_ / f_999_));
					} else if (f_994_ < -f_995_) {
						float f_1000_ = (f_994_ + f_995_) / (f_990_ + f_991_) - 1.0F;
						float f_1001_ = f_992_ + f_1000_ * (f_988_ - f_992_);
						float f_1002_ = f_993_ + f_1000_ * (f_989_ - f_993_);
						float f_1003_ = f_995_ + f_1000_ * (f_991_ - f_995_);
						class302_sub1.anInt7643 = (int) ((this.javaGraphicsToolkit.aFloat8005) + (this.javaGraphicsToolkit.aFloat7993 * f_1001_ / f_1003_));
						class302_sub1.anInt7640 = (int) ((this.javaGraphicsToolkit.aFloat7996) + (this.javaGraphicsToolkit.aFloat7995 * f_1002_ / f_1003_));
					}
				}
				if (bool_982_) {
					if (f_990_ / f_991_ > f_994_ / f_995_) {
						float f_1004_ = (f_988_ + (matrix4f_934_.aFloatArray2594[0] * (float) this.aShort7739) + matrix4f_934_.aFloatArray2594[12]);
						float f_1005_ = (f_991_ + (matrix4f_934_.aFloatArray2594[3] * (float) this.aShort7739) + matrix4f_934_.aFloatArray2594[15]);
						class302_sub1.anInt7645 = (int) ((this.javaGraphicsToolkit.aFloat8005) - (float) class302_sub1.anInt7641 + (this.javaGraphicsToolkit.aFloat7993 * f_1004_ / f_1005_));
					} else {
						float f_1006_ = (f_992_ + (matrix4f_934_.aFloatArray2594[0] * (float) this.aShort7739) + matrix4f_934_.aFloatArray2594[12]);
						float f_1007_ = (f_995_ + (matrix4f_934_.aFloatArray2594[3] * (float) this.aShort7739) + matrix4f_934_.aFloatArray2594[15]);
						class302_sub1.anInt7645 = (int) ((this.javaGraphicsToolkit.aFloat8005) - (float) class302_sub1.anInt7643 + (this.javaGraphicsToolkit.aFloat7993 * f_1006_ / f_1007_));
					}
					class302_sub1.aBoolean7644 = true;
				}
			}
			method4810(true);
			this.aClass2_7737.aBoolean16 = (i & 0x1) == 0;
			this.aClass2_7737.aBoolean48 = false;
			try {
				method4813((this.javaGraphicsToolkit.anIntArray7967) != null, (this.javaGraphicsToolkit.aFloatArray7973) != null, (i & 0x4) != 0, bool_951_, (((this.aClass15_7735.aBoolean216) && f_949_ > (this.aClass15_7735.aFloat205)) || this.aClass15_7735.aBoolean186));
			} catch (Exception exception) {
				/* empty */
			}
			if (this.aClass16Array7789 != null) {
				for (int i_1008_ = 0; i_1008_ < this.anInt7757; i_1008_++)
					this.anIntArray7814[i_1008_] = -1;
			}
			this.aClass2_7737 = null;
			if ((this.javaGraphicsToolkit.anInt7999) * -922307687 > 1) {
				synchronized (this) {
					this.aBoolean7808 = false;
					this.notifyAll();
				}
			}
		}
	}

	public EmissiveTriangle[] method4464() {
		return this.aEmissiveTriangleArray7750;
	}

    DirectXModelToolkit(JavaGraphicsToolkit class_ra_sub1) {
		this.anInt7799 = 0;
		this.anInt7742 = 0;
		this.anInt7757 = 0;
		this.anInt7812 = 0;
		this.aBoolean7780 = false;
		this.aBoolean7785 = false;
		this.aBoolean7792 = false;
		this.aBoolean7756 = false;
		this.aBoolean7777 = false;
		this.javaGraphicsToolkit = class_ra_sub1;
	}

	final void method4812(boolean bool, boolean bool_1021_, boolean bool_1022_, int i) {
		short i_1023_ = this.aShortArray7758[i];
		short i_1024_ = this.aShortArray7759[i];
		short i_1025_ = this.aShortArray7760[i];
		if (this.aShortArray7774 == null || this.aShortArray7774[i] == -1) {
			if (this.aByteArray7773 == null)
				this.aClass2_7737.anInt19 = 0;
			else
				this.aClass2_7737.anInt19 = this.aByteArray7773[i] & 0xff;
			if (this.anIntArray7801[i] == -1)
				this.aClass2_7737.method293(bool, bool_1021_, bool_1022_, this.aFloatArray7806[i_1023_], this.aFloatArray7806[i_1024_], this.aFloatArray7806[i_1025_], this.aFloatArray7784[i_1023_], this.aFloatArray7784[i_1024_], this.aFloatArray7784[i_1025_], this.aFloatArray7807[i_1023_], this.aFloatArray7807[i_1024_], this.aFloatArray7807[i_1025_], (Class379.anIntArray4096[this.anIntArray7763[i] & 0xffff]));
			else
				this.aClass2_7737.method299(bool, bool_1021_, bool_1022_, this.aFloatArray7806[i_1023_], this.aFloatArray7806[i_1024_], this.aFloatArray7806[i_1025_], this.aFloatArray7784[i_1023_], this.aFloatArray7784[i_1024_], this.aFloatArray7784[i_1025_], this.aFloatArray7807[i_1023_], this.aFloatArray7807[i_1024_], this.aFloatArray7807[i_1025_], (float) (this.anIntArray7763[i] & 0xffff), (float) (this.anIntArray7764[i] & 0xffff), (float) (this.anIntArray7801[i] & 0xffff));
		} else {
			int i_1026_ = -16777216;
			if (this.aByteArray7773 != null)
				i_1026_ = 255 - (this.aByteArray7773[i] & 0xff) << 24;
			if (this.anIntArray7801[i] == -1) {
				int i_1027_ = (i_1026_ | this.anIntArray7763[i] & 0xffffff);
				this.aClass2_7737.method290(bool, bool_1021_, bool_1022_, this.aFloatArray7806[i_1023_], this.aFloatArray7806[i_1024_], this.aFloatArray7806[i_1025_], this.aFloatArray7784[i_1023_], this.aFloatArray7784[i_1024_], this.aFloatArray7784[i_1025_], this.aFloatArray7807[i_1023_], this.aFloatArray7807[i_1024_], this.aFloatArray7807[i_1025_], this.aFloatArray7745[i_1023_], this.aFloatArray7745[i_1024_], this.aFloatArray7745[i_1025_], this.aFloatArrayArray7738[i][0], this.aFloatArrayArray7738[i][1], this.aFloatArrayArray7738[i][2], this.aFloatArrayArray7762[i][0], this.aFloatArrayArray7762[i][1], this.aFloatArrayArray7762[i][2], i_1027_, i_1027_, i_1027_, (this.aClass15_7735.anInt184 * 688695183), 0.0F, 0.0F, 0.0F, this.aShortArray7774[i]);
			} else
				this.aClass2_7737.method290(bool, bool_1021_, bool_1022_, this.aFloatArray7806[i_1023_], this.aFloatArray7806[i_1024_], this.aFloatArray7806[i_1025_], this.aFloatArray7784[i_1023_], this.aFloatArray7784[i_1024_], this.aFloatArray7784[i_1025_], this.aFloatArray7807[i_1023_], this.aFloatArray7807[i_1024_], this.aFloatArray7807[i_1025_], this.aFloatArray7745[i_1023_], this.aFloatArray7745[i_1024_], this.aFloatArray7745[i_1025_], this.aFloatArrayArray7738[i][0], this.aFloatArrayArray7738[i][1], this.aFloatArrayArray7738[i][2], this.aFloatArrayArray7762[i][0], this.aFloatArrayArray7762[i][1], this.aFloatArrayArray7762[i][2], (i_1026_ | this.anIntArray7763[i] & 0xffffff), (i_1026_ | this.anIntArray7764[i] & 0xffffff), (i_1026_ | this.anIntArray7801[i] & 0xffffff), (this.aClass15_7735.anInt184 * 688695183), 0.0F, 0.0F, 0.0F, this.aShortArray7774[i]);
		}
	}

    public void W(short i, short i_1058_) {
		if (this.aShortArray7774 != null) {
			if (!this.aBoolean7777 && i_1058_ >= 0) {
				Class53 class53 = this.javaGraphicsToolkit.textures.method174(i_1058_ & 0xffff);
				if (class53.aByte535 != 0 || class53.aByte509 != 0)
					this.aBoolean7777 = true;
			}
			for (int i_1059_ = 0; i_1059_ < this.anInt7757; i_1059_++) {
				if (this.aShortArray7774[i_1059_] == i)
					this.aShortArray7774[i_1059_] = i_1058_;
			}
		}
	}

    public int m() {
		return this.animationFlag;
	}

    static {
		anInt7787 = 4096;
		anInt7805 = 0;
	}

    public void Q(int i) {
		if ((this.animationFlag & 0x2000) != 8192)
			throw new IllegalStateException();
		this.anInt7748 = i;
		this.anInt7812 = 0;
	}

    final void method4813(boolean bool, boolean bool_1772_, boolean bool_1773_, boolean bool_1774_, boolean bool_1775_) {
		if (this.aClass16Array7789 != null) {
			for (int i = 0; i < this.anInt7788; i++) {
				Class16 class16 = this.aClass16Array7789[i];
				this.anIntArray7814[class16.anInt226 * -1295149283] = i;
			}
		}
		if (this.aBoolean7756 || this.aClass16Array7789 != null) {
			if ((this.animationFlag & 0x100) == 0 && this.aShortArray7803 != null) {
				for (int i = 0; i < this.anInt7757; i++) {
					short i_1776_ = this.aShortArray7803[i];
					method4803(bool, bool_1772_, bool_1773_, i_1776_, bool_1774_, bool_1775_);
				}
			} else {
				for (int i = 0; i < this.anInt7757; i++) {
					if (!method4802(i) && !method4816(i))
						method4803(bool, bool_1772_, bool_1773_, i, bool_1774_, bool_1775_);
				}
				if (this.aByteArray7772 == null) {
					for (int i = 0; i < this.anInt7757; i++) {
						if (method4802(i) || method4816(i))
							method4803(bool, bool_1772_, bool_1773_, i, bool_1774_, bool_1775_);
					}
				} else {
					for (int i = 0; i < 12; i++) {
						for (int i_1777_ = 0; i_1777_ < this.anInt7757; i_1777_++) {
							if ((this.aByteArray7772[i_1777_] == i) && (method4802(i_1777_) || method4816(i_1777_)))
								method4803(bool, bool_1772_, bool_1773_, i_1777_, bool_1774_, bool_1775_);
						}
					}
				}
			}
		} else {
			for (int i = 0; i < this.anInt7757; i++)
				method4803(bool, bool_1772_, bool_1773_, i, bool_1774_, bool_1775_);
		}
	}

	void method4814() {
		if (this.anInt7812 == 0 && this.aClass1Array7755 == null) {
			do {
				if ((this.javaGraphicsToolkit.anInt7999 * -922307687) > 1) {
					synchronized (this) {
						method4808();
						break;
					}
				}
				method4808();
			} while (false);
		}
	}

    public int c() {
		return this.anInt7747;
	}

    public int ha() {
		if (!this.aBoolean7792)
			method4807();
		return this.aShort7800;
	}

    void method4815(Thread thread) {
		Class15 class15 = this.javaGraphicsToolkit.method5202(thread);
		if (class15 != this.aClass15_7736) {
			this.aClass15_7736 = class15;
			this.aDirectXModelToolkitArray7815 = (this.aClass15_7736.aDirectXModelToolkitArray187);
			this.aDirectXModelToolkitArray7804 = (this.aClass15_7736.aDirectXModelToolkitArray217);
		}
	}

    public int Z() {
		return this.anInt7748;
	}

    void method4733() {
		if ((this.javaGraphicsToolkit.anInt7999) * -922307687 > 1) {
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

    final boolean method4816(int i) {
		if (this.anIntArray7814 == null)
			return false;
        return this.anIntArray7814[i] != -1;
    }

    public void KA(int animationFlag) {
		do {
			if ((this.javaGraphicsToolkit.anInt7999) * -922307687 > 1) {
				synchronized (this) {
					if ((this.animationFlag & 0x10000) == 65536 && (animationFlag & 0x10000) == 0)
						method4810(true);
					this.animationFlag = animationFlag;
					break;
				}
			}
			if ((this.animationFlag & 0x10000) == 65536 && (animationFlag & 0x10000) == 0)
				method4810(true);
			this.animationFlag = animationFlag;
		} while (false);
	}

}
