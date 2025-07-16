package com.jagex;/* Class57_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.maths.Matrix4f;

public class Class57_Sub2 extends SpriteToolkit {
	int anInt9023;
	Interface9_Impl2 anInterface9_Impl2_9024;
	Interface8_Impl1_Impl1 anInterface8_Impl1_Impl1_9025;
	int anInt9026;
	boolean aBoolean9027;
	boolean aBoolean9028 = false;
	int anInt9029 = 0;
	int anInt9030;
	int anInt9031;
	int anInt9032;
	NativeToolkit aClass_ra_Sub3_9033;
	boolean aBoolean9034;
	boolean aBoolean9035;
	boolean aBoolean9036;

	public int getWidth() {
		return this.anInt9023;
	}

	Class57_Sub2(NativeToolkit class_ra_sub3, int i, int i_0_, int[] is, int i_1_, int i_2_) {
		this.anInt9026 = 0;
		this.anInt9031 = 0;
		this.anInt9032 = 0;
		this.aClass_ra_Sub3_9033 = class_ra_sub3;
		this.anInt9023 = i;
		this.anInt9030 = i_0_;
		this.anInterface8_Impl1_Impl1_9025 = null;
		this.anInterface9_Impl2_9024 = class_ra_sub3.method5355(i, i_0_, false, is, i_1_, i_2_);
		this.anInterface9_Impl2_9024.method80(true, true);
		this.aBoolean9036 = this.anInterface9_Impl2_9024.method92() != i;
		this.aBoolean9034 = this.anInterface9_Impl2_9024.method76() != i_0_;
		this.aBoolean9035 = (!this.aBoolean9036 && this.anInterface9_Impl2_9024.method79());
		this.aBoolean9027 = (!this.aBoolean9034 && this.anInterface9_Impl2_9024.method79());
		this.aClass_ra_Sub3_9033.method5304(12);
	}

    public void method675(int i, int i_30_, int i_31_, int i_32_, int i_33_, int i_34_) {
		int[] is = this.aClass_ra_Sub3_9033.aq(i_33_, i_34_, i_31_, i_32_);
		if (is != null) {
			for (int i_35_ = 0; i_35_ < is.length; i_35_++)
				is[i_35_] |= ~0xffffff;
			method688(i, i_30_, i_31_, i_32_, is, 0, i_31_);
		}
	}

	public void method632(int i, int i_36_, int i_37_) {
		int[] is = (this.aClass_ra_Sub3_9033.aq(i, i_36_, this.anInt9023, this.anInt9030));
		int[] is_38_ = new int[(this.anInt9023 * this.anInt9030)];
		this.anInterface9_Impl2_9024.method83(0, 0, this.anInt9023, this.anInt9030, is_38_, 0);
		if (i_37_ == 0) {
			for (int i_39_ = 0; i_39_ < this.anInt9030; i_39_++) {
				int i_40_ = i_39_ * this.anInt9023;
				for (int i_41_ = 0; i_41_ < this.anInt9023; i_41_++)
					is_38_[i_40_ + i_41_] = (is_38_[i_40_ + i_41_] & 0xffffff | is[i_40_ + i_41_] << 8 & ~0xffffff);
			}
		} else if (i_37_ == 1) {
			for (int i_42_ = 0; i_42_ < this.anInt9030; i_42_++) {
				int i_43_ = i_42_ * this.anInt9023;
				for (int i_44_ = 0; i_44_ < this.anInt9023; i_44_++)
					is_38_[i_43_ + i_44_] = (is_38_[i_43_ + i_44_] & 0xffffff | is[i_43_ + i_44_] << 16 & ~0xffffff);
			}
		} else if (i_37_ == 2) {
			for (int i_45_ = 0; i_45_ < this.anInt9030; i_45_++) {
				int i_46_ = i_45_ * this.anInt9023;
				for (int i_47_ = 0; i_47_ < this.anInt9023; i_47_++)
					is_38_[i_46_ + i_47_] = (is_38_[i_46_ + i_47_] & 0xffffff | is[i_46_ + i_47_] << 24 & ~0xffffff);
			}
		} else if (i_37_ == 3) {
			for (int i_48_ = 0; i_48_ < this.anInt9030; i_48_++) {
				int i_49_ = i_48_ * this.anInt9023;
				for (int i_50_ = 0; i_50_ < this.anInt9023; i_50_++)
					is_38_[i_49_ + i_50_] = (is_38_[i_49_ + i_50_] & 0xffffff | (is[i_49_ + i_50_] != 0 ? -16777216 : 0));
			}
		}
		method688(0, 0, this.anInt9023, this.anInt9030, is_38_, 0, this.anInt9023);
	}

	public void method621(int i, int i_51_, int i_52_, int i_53_) {
		this.anInt9026 = i;
		this.anInt9029 = i_51_;
		this.anInt9032 = i_52_;
		this.anInt9031 = i_53_;
		this.aBoolean9028 = (this.anInt9026 != 0 || this.anInt9029 != 0 || this.anInt9032 != 0 || this.anInt9031 != 0);
	}

    public int getPaddedWidth() {
		return (this.anInt9023 + this.anInt9026 + this.anInt9032);
	}

	public int getHeight() {
		return this.anInt9030;
	}

	public int getPaddedHeight() {
		return (this.anInt9030 + this.anInt9029 + this.anInt9031);
	}

	public Interface8_Impl1_Impl1 method627() {
		return this.anInterface8_Impl1_Impl1_9025;
	}

    public void draw(int i, int i_80_, int i_81_, int i_82_, int i_83_) {
		this.aClass_ra_Sub3_9033.method5337();
		this.aClass_ra_Sub3_9033.method5374(i_83_);
		Class138 class138 = (this.aClass_ra_Sub3_9033.aClass138_8257);
		class138.anInterface9_Impl2_1537 = this.anInterface9_Impl2_9024;
		class138.method1526(i_81_, i_82_);
		i += this.anInt9026;
		i_80_ += this.anInt9029;
		float f = (float) this.aClass_ra_Sub3_9033.getFrameContext().getWidth();
		float f_84_ = (float) this.aClass_ra_Sub3_9033.getFrameContext().getHeight();
		class138.aMatrix4f_1540.method2147((float) this.anInt9023 * 2.0F / f, (float) this.anInt9030 * 2.0F / f_84_, 1.0F, 1.0F);
		class138.aMatrix4f_1540.aFloatArray2594[12] = (((float) i + this.aClass_ra_Sub3_9033.method5315()) * 2.0F / f) - 1.0F;
		class138.aMatrix4f_1540.aFloatArray2594[13] = (((float) i_80_ + this.aClass_ra_Sub3_9033.method5315()) * 2.0F / f_84_) - 1.0F;
		class138.aMatrix4f_1540.aFloatArray2594[14] = -1.0F;
		class138.aMatrix4f_1541.method2147(this.anInterface9_Impl2_9024.method77((float) this.anInt9023), this.anInterface9_Impl2_9024.method78((float) this.anInt9030), 1.0F, 1.0F);
		class138.anInterface7_Impl1_1538 = (this.aClass_ra_Sub3_9033.anInterface7_Impl1_8202);
		class138.anInt1543 = 0;
		class138.aClass153_1544 = (this.aClass_ra_Sub3_9033.aClass153_8356);
		class138.method1527();
	}

    void method635(int i, int i_89_, int i_90_, int i_91_, int i_92_, int i_93_, int i_94_, int i_95_) {
		this.aClass_ra_Sub3_9033.method5337();
		this.aClass_ra_Sub3_9033.method5374(i_94_);
		Class138 class138 = (this.aClass_ra_Sub3_9033.aClass138_8257);
		class138.anInterface9_Impl2_1537 = this.anInterface9_Impl2_9024;
		class138.method1526(i_92_, i_93_);
		if (this.aBoolean9028) {
			i_90_ = i_90_ * this.anInt9023 / getPaddedWidth();
			i_91_ = i_91_ * this.anInt9030 / getPaddedHeight();
			i += (this.anInt9026 * i_90_ / this.anInt9023);
			i_89_ += (this.anInt9029 * i_91_ / this.anInt9030);
		}
		float f = (float) this.aClass_ra_Sub3_9033.getFrameContext().getWidth();
		float f_96_ = (float) this.aClass_ra_Sub3_9033.getFrameContext().getHeight();
		class138.aMatrix4f_1540.method2147((float) i_90_ * 2.0F / f, (float) i_91_ * 2.0F / f_96_, 1.0F, 1.0F);
		class138.aMatrix4f_1540.aFloatArray2594[12] = (((float) i + this.aClass_ra_Sub3_9033.method5315()) * 2.0F / f) - 1.0F;
		class138.aMatrix4f_1540.aFloatArray2594[13] = (((float) i_89_ + this.aClass_ra_Sub3_9033.method5315()) * 2.0F / f_96_) - 1.0F;
		class138.aMatrix4f_1540.aFloatArray2594[14] = -1.0F;
		class138.aMatrix4f_1541.method2147(this.anInterface9_Impl2_9024.method77((float) this.anInt9023), this.anInterface9_Impl2_9024.method78((float) this.anInt9030), 1.0F, 1.0F);
		class138.anInterface7_Impl1_1538 = (this.aClass_ra_Sub3_9033.anInterface7_Impl1_8202);
		class138.anInt1543 = 0;
		class138.aClass153_1544 = (this.aClass_ra_Sub3_9033.aClass153_8356);
		class138.method1527();
	}

	public void method622(int[] is) {
		is[0] = this.anInt9026;
		is[1] = this.anInt9029;
		is[2] = this.anInt9032;
		is[3] = this.anInt9031;
	}

	void method642(float f, float f_97_, float f_98_, float f_99_, float f_100_, float f_101_, int i, int i_102_, int i_103_, int i_104_) {
		this.aClass_ra_Sub3_9033.method5337();
		this.aClass_ra_Sub3_9033.method5374(i_103_);
		if (this.aBoolean9028) {
			float f_105_ = (float) getPaddedWidth();
			float f_106_ = (float) getPaddedHeight();
			float f_107_ = (f_98_ - f) / f_105_;
			float f_108_ = (f_99_ - f_97_) / f_105_;
			float f_109_ = (f_100_ - f) / f_106_;
			float f_110_ = (f_101_ - f_97_) / f_106_;
			float f_111_ = f_109_ * (float) this.anInt9029;
			float f_112_ = f_110_ * (float) this.anInt9029;
			float f_113_ = f_107_ * (float) this.anInt9026;
			float f_114_ = f_108_ * (float) this.anInt9026;
			float f_115_ = -f_107_ * (float) this.anInt9032;
			float f_116_ = -f_108_ * (float) this.anInt9032;
			float f_117_ = -f_109_ * (float) this.anInt9031;
			float f_118_ = -f_110_ * (float) this.anInt9031;
			f = f + f_113_ + f_111_;
			f_97_ = f_97_ + f_114_ + f_112_;
			f_98_ = f_98_ + f_115_ + f_111_;
			f_99_ = f_99_ + f_116_ + f_112_;
			f_100_ = f_100_ + f_113_ + f_117_;
			f_101_ = f_101_ + f_114_ + f_118_;
		}
		Class138 class138 = (this.aClass_ra_Sub3_9033.aClass138_8257);
		class138.anInterface9_Impl2_1537 = this.anInterface9_Impl2_9024;
		class138.method1526(i, i_102_);
		float f_119_ = (float) this.aClass_ra_Sub3_9033.getFrameContext().getWidth();
		float f_120_ = (float) this.aClass_ra_Sub3_9033.getFrameContext().getHeight();
		class138.aMatrix4f_1540.method2172();
		class138.aMatrix4f_1540.aFloatArray2594[0] = (f_98_ - f) * 2.0F / f_119_;
		class138.aMatrix4f_1540.aFloatArray2594[1] = (f_99_ - f_97_) * 2.0F / f_120_;
		class138.aMatrix4f_1540.aFloatArray2594[4] = (f_100_ - f) * 2.0F / f_119_;
		class138.aMatrix4f_1540.aFloatArray2594[5] = (f_101_ - f_97_) * 2.0F / f_120_;
		class138.aMatrix4f_1540.aFloatArray2594[12] = ((f + this.aClass_ra_Sub3_9033.method5315()) * 2.0F / f_119_) - 1.0F;
		class138.aMatrix4f_1540.aFloatArray2594[13] = ((f_97_ + this.aClass_ra_Sub3_9033.method5315()) * 2.0F / f_120_) - 1.0F;
		class138.aMatrix4f_1540.aFloatArray2594[14] = -1.0F;
		class138.aMatrix4f_1541.method2147(this.anInterface9_Impl2_9024.method77((float) this.anInt9023), this.anInterface9_Impl2_9024.method78((float) this.anInt9030), 1.0F, 1.0F);
		class138.anInterface7_Impl1_1538 = (this.aClass_ra_Sub3_9033.anInterface7_Impl1_8202);
		class138.anInt1543 = 0;
		class138.aClass153_1544 = (this.aClass_ra_Sub3_9033.aClass153_8356);
		class138.method1527();
	}

	void method644(float f, float f_121_, float f_122_, float f_123_, float f_124_, float f_125_, int i, ToolkitLoader toolkitLoader, int i_126_, int i_127_) {
		this.aClass_ra_Sub3_9033.method5337();
		Class138 class138 = (this.aClass_ra_Sub3_9033.aClass138_8257);
		class138.anInterface9_Impl2_1537 = this.anInterface9_Impl2_9024;
		class138.method1526(1, -1);
		float f_128_ = (float) this.aClass_ra_Sub3_9033.getFrameContext().getWidth();
		float f_129_ = (float) this.aClass_ra_Sub3_9033.getFrameContext().getHeight();
		class138.aMatrix4f_1540.method2172();
		if (this.aBoolean9028) {
			float f_130_ = ((float) this.anInt9023 / (float) getPaddedWidth());
			float f_131_ = ((float) this.anInt9030 / (float) getPaddedHeight());
			class138.aMatrix4f_1540.aFloatArray2594[0] = (f_122_ - f) * f_130_;
			class138.aMatrix4f_1540.aFloatArray2594[1] = (f_123_ - f_121_) * f_130_;
			class138.aMatrix4f_1540.aFloatArray2594[4] = (f_124_ - f) * f_131_;
			class138.aMatrix4f_1540.aFloatArray2594[5] = (f_125_ - f_121_) * f_131_;
			class138.aMatrix4f_1540.aFloatArray2594[12] = ((f + (float) this.anInt9026) * f_130_ + this.aClass_ra_Sub3_9033.method5315());
			class138.aMatrix4f_1540.aFloatArray2594[13] = ((f_121_ + (float) this.anInt9029) * f_131_ + this.aClass_ra_Sub3_9033.method5315());
		} else {
			class138.aMatrix4f_1540.aFloatArray2594[0] = f_122_ - f;
			class138.aMatrix4f_1540.aFloatArray2594[1] = f_123_ - f_121_;
			class138.aMatrix4f_1540.aFloatArray2594[4] = f_124_ - f;
			class138.aMatrix4f_1540.aFloatArray2594[5] = f_125_ - f_121_;
			class138.aMatrix4f_1540.aFloatArray2594[12] = f + this.aClass_ra_Sub3_9033.method5315();
			class138.aMatrix4f_1540.aFloatArray2594[13] = (f_121_ + this.aClass_ra_Sub3_9033.method5315());
		}
		Matrix4f matrix4f = this.aClass_ra_Sub3_9033.aMatrix4f_8236;
		matrix4f.method2172();
		matrix4f.aFloatArray2594[0] = 2.0F / f_128_;
		matrix4f.aFloatArray2594[5] = 2.0F / f_129_;
		matrix4f.aFloatArray2594[12] = -1.0F;
		matrix4f.aFloatArray2594[13] = -1.0F;
		matrix4f.aFloatArray2594[14] = -1.0F;
		class138.aMatrix4f_1540.method2144(matrix4f);
		class138.aMatrix4f_1541.method2147(this.anInterface9_Impl2_9024.method77((float) this.anInt9023), this.anInterface9_Impl2_9024.method78((float) this.anInt9030), 1.0F, 1.0F);
		class138.anInterface7_Impl1_1538 = (this.aClass_ra_Sub3_9033.anInterface7_Impl1_8202);
		class138.anInt1543 = 0;
		class138.aClass153_1544 = (this.aClass_ra_Sub3_9033.aClass153_8356);
		Interface9_Impl2 interface9_impl2 = (((JavaGraphicsToolkitLoader) toolkitLoader).anInterface9_Impl2_8444);
		class138.anInterface9_Impl2_1536 = interface9_impl2;
		class138.aMatrix4f_1542.method2172();
		class138.aMatrix4f_1542.aFloatArray2594[0] = (f_122_ - f) * interface9_impl2.method77(1.0F);
		class138.aMatrix4f_1542.aFloatArray2594[1] = (f_123_ - f_121_) * interface9_impl2.method77(1.0F);
		class138.aMatrix4f_1542.aFloatArray2594[4] = (f_124_ - f) * interface9_impl2.method78(1.0F);
		class138.aMatrix4f_1542.aFloatArray2594[5] = (f_125_ - f_121_) * interface9_impl2.method78(1.0F);
		class138.aMatrix4f_1542.aFloatArray2594[12] = (f - (float) i_126_) * interface9_impl2.method77(1.0F);
		class138.aMatrix4f_1542.aFloatArray2594[13] = (f_121_ - (float) i_127_) * interface9_impl2.method78(1.0F);
		class138.method1528();
	}

	Class57_Sub2(NativeToolkit class_ra_sub3, Interface9_Impl2 interface9_impl2, int i, int i_132_) {
		this.anInt9026 = 0;
		this.anInt9031 = 0;
		this.anInt9032 = 0;
		this.aClass_ra_Sub3_9033 = class_ra_sub3;
		this.anInt9023 = i;
		this.anInt9030 = i_132_;
		this.anInterface9_Impl2_9024 = interface9_impl2;
		this.anInterface8_Impl1_Impl1_9025 = null;
		this.aBoolean9036 = this.anInterface9_Impl2_9024.method92() != i;
		this.aBoolean9034 = (this.anInterface9_Impl2_9024.method76() != i_132_);
		this.aBoolean9035 = (!this.aBoolean9036 && this.anInterface9_Impl2_9024.method79());
		this.aBoolean9027 = (!this.aBoolean9034 && this.anInterface9_Impl2_9024.method79());
		this.aClass_ra_Sub3_9033.method5304(12);
	}

    Class57_Sub2(NativeToolkit class_ra_sub3, Interface9_Impl2 interface9_impl2) {
		this(class_ra_sub3, interface9_impl2, interface9_impl2.method92(), interface9_impl2.method76());
	}

    Class57_Sub2(NativeToolkit class_ra_sub3, int i, int i_205_, boolean bool, boolean bool_206_) {
		this.anInt9026 = 0;
		this.anInt9031 = 0;
		this.anInt9032 = 0;
		this.aClass_ra_Sub3_9033 = class_ra_sub3;
		this.anInt9023 = i;
		this.anInt9030 = i_205_;
		if (bool_206_) {
			Interface9_Impl2_Impl1 interface9_impl2_impl1 = class_ra_sub3.method5356((bool ? Class55.aClass55_557 : Class55.aClass55_560), Class77.aClass77_717, i, i_205_);
			this.anInterface8_Impl1_Impl1_9025 = interface9_impl2_impl1.method117(0);
			this.anInterface9_Impl2_9024 = interface9_impl2_impl1;
		} else {
			this.anInterface9_Impl2_9024 = class_ra_sub3.method5353((bool ? Class55.aClass55_557 : Class55.aClass55_560), Class77.aClass77_717, i, i_205_);
			this.anInterface8_Impl1_Impl1_9025 = null;
		}
		this.anInterface9_Impl2_9024.method80(true, true);
		this.aBoolean9036 = this.anInterface9_Impl2_9024.method92() != i;
		this.aBoolean9034 = (this.anInterface9_Impl2_9024.method76() != i_205_);
		this.aBoolean9035 = (!this.aBoolean9036 && this.anInterface9_Impl2_9024.method79());
		this.aBoolean9027 = (!this.aBoolean9034 && this.anInterface9_Impl2_9024.method79());
		this.aClass_ra_Sub3_9033.method5304(12);
	}

	public void method694(int i, int i_207_, int i_208_, int i_209_, int i_210_, int i_211_, int i_212_) {
		this.aClass_ra_Sub3_9033.method5337();
		this.aClass_ra_Sub3_9033.method5374(i_212_);
		Class138 class138 = (this.aClass_ra_Sub3_9033.aClass138_8257);
		class138.anInterface9_Impl2_1537 = this.anInterface9_Impl2_9024;
		class138.method1526(i_210_, i_211_);
		float f = (float) this.aClass_ra_Sub3_9033.getFrameContext().getWidth();
		float f_213_ = (float) this.aClass_ra_Sub3_9033.getFrameContext().getHeight();
		class138.anInterface7_Impl1_1538 = (this.aClass_ra_Sub3_9033.anInterface7_Impl1_8202);
		class138.anInt1543 = 0;
		class138.aClass153_1544 = (this.aClass_ra_Sub3_9033.aClass153_8356);
		boolean bool = (this.aBoolean9027 && this.anInt9029 == 0 && this.anInt9031 == 0);
		boolean bool_214_ = (this.aBoolean9035 && this.anInt9026 == 0 && this.anInt9032 == 0);
		if (bool_214_ & bool) {
			class138.aMatrix4f_1540.method2147((float) i_208_ * 2.0F / f, (float) i_209_ * 2.0F / f_213_, 1.0F, 1.0F);
			class138.aMatrix4f_1540.aFloatArray2594[12] = (((float) i + this.aClass_ra_Sub3_9033.method5315()) * 2.0F / f) - 1.0F;
			class138.aMatrix4f_1540.aFloatArray2594[13] = (((float) i_207_ + this.aClass_ra_Sub3_9033.method5315()) * 2.0F / f_213_) - 1.0F;
			class138.aMatrix4f_1540.aFloatArray2594[14] = -1.0F;
			class138.aMatrix4f_1541.method2147(this.anInterface9_Impl2_9024.method77((float) i_208_), this.anInterface9_Impl2_9024.method78((float) i_209_), 1.0F, 1.0F);
			class138.method1527();
		} else if (bool_214_) {
			int i_215_ = i_207_ + i_209_;
			int i_216_ = getPaddedHeight();
			class138.aMatrix4f_1541.method2147(this.anInterface9_Impl2_9024.method77((float) i_208_), this.anInterface9_Impl2_9024.method78((float) this.anInt9030), 1.0F, 1.0F);
			int i_217_ = i_207_ + this.anInt9029;
			for (int i_218_ = i_217_ + this.anInt9030; i_218_ <= i_215_; i_218_ += i_216_) {
				class138.aMatrix4f_1540.method2147((float) i_208_ * 2.0F / f, ((float) this.anInt9030 * 2.0F / f_213_), 1.0F, 1.0F);
				class138.aMatrix4f_1540.aFloatArray2594[12] = ((float) i + this.aClass_ra_Sub3_9033.method5315()) * 2.0F / f - 1.0F;
				class138.aMatrix4f_1540.aFloatArray2594[13] = (((float) i_217_ + this.aClass_ra_Sub3_9033.method5315()) * 2.0F / f_213_) - 1.0F;
				class138.aMatrix4f_1540.aFloatArray2594[14] = -1.0F;
				class138.method1527();
				i_217_ += i_216_;
			}
			if (i_217_ < i_215_) {
				int i_219_ = i_215_ - i_217_;
				class138.aMatrix4f_1541.method2147(this.anInterface9_Impl2_9024.method77((float) i_208_), this.anInterface9_Impl2_9024.method78((float) i_219_), 1.0F, 1.0F);
				class138.aMatrix4f_1540.method2147((float) i_208_ * 2.0F / f, ((float) i_219_ * 2.0F / f_213_), 1.0F, 1.0F);
				class138.aMatrix4f_1540.aFloatArray2594[12] = ((float) i + this.aClass_ra_Sub3_9033.method5315()) * 2.0F / f - 1.0F;
				class138.aMatrix4f_1540.aFloatArray2594[13] = (((float) i_217_ + this.aClass_ra_Sub3_9033.method5315()) * 2.0F / f_213_) - 1.0F;
				class138.aMatrix4f_1540.aFloatArray2594[14] = -1.0F;
				class138.method1527();
			}
		} else if (bool) {
			int i_220_ = i + i_208_;
			int i_221_ = getPaddedWidth();
			class138.aMatrix4f_1541.method2147(this.anInterface9_Impl2_9024.method77((float) this.anInt9023), this.anInterface9_Impl2_9024.method78((float) i_209_), 1.0F, 1.0F);
			int i_222_ = i + this.anInt9026;
			for (int i_223_ = i_222_ + this.anInt9023; i_223_ <= i_220_; i_223_ += i_221_) {
				class138.aMatrix4f_1540.method2147((float) this.anInt9023 * 2.0F / f, (float) i_209_ * 2.0F / f_213_, 1.0F, 1.0F);
				class138.aMatrix4f_1540.aFloatArray2594[12] = (((float) i_222_ + this.aClass_ra_Sub3_9033.method5315()) * 2.0F / f) - 1.0F;
				class138.aMatrix4f_1540.aFloatArray2594[13] = (((float) i_207_ + this.aClass_ra_Sub3_9033.method5315()) * 2.0F / f_213_) - 1.0F;
				class138.aMatrix4f_1540.aFloatArray2594[14] = -1.0F;
				class138.method1527();
				i_222_ += i_221_;
			}
			if (i_222_ < i_220_) {
				int i_224_ = i_220_ - i_222_;
				class138.aMatrix4f_1541.method2147(this.anInterface9_Impl2_9024.method77((float) i_224_), this.anInterface9_Impl2_9024.method78((float) i_209_), 1.0F, 1.0F);
				class138.aMatrix4f_1540.method2147((float) i_224_ * 2.0F / f, ((float) i_209_ * 2.0F / f_213_), 1.0F, 1.0F);
				class138.aMatrix4f_1540.aFloatArray2594[12] = (((float) i_222_ + this.aClass_ra_Sub3_9033.method5315()) * 2.0F / f) - 1.0F;
				class138.aMatrix4f_1540.aFloatArray2594[13] = (((float) i_207_ + this.aClass_ra_Sub3_9033.method5315()) * 2.0F / f_213_) - 1.0F;
				class138.aMatrix4f_1540.aFloatArray2594[14] = -1.0F;
				class138.method1527();
			}
		} else {
			int i_225_ = i_207_ + i_209_;
			int i_226_ = i + i_208_;
			int i_227_ = getPaddedWidth();
			int i_228_ = getPaddedHeight();
			int i_229_ = i_207_ + this.anInt9029;
			for (int i_230_ = i_229_ + this.anInt9030; i_230_ <= i_225_; i_230_ += i_228_) {
				class138.aMatrix4f_1541.method2147(this.anInterface9_Impl2_9024.method77((float) this.anInt9023), this.anInterface9_Impl2_9024.method78((float) this.anInt9030), 1.0F, 1.0F);
				int i_231_ = i + this.anInt9026;
				for (int i_232_ = i_231_ + this.anInt9023; i_232_ <= i_226_; i_232_ += i_227_) {
					class138.aMatrix4f_1540.method2147((float) this.anInt9023 * 2.0F / f, ((float) this.anInt9030 * 2.0F / f_213_), 1.0F, 1.0F);
					class138.aMatrix4f_1540.aFloatArray2594[12] = ((float) i_231_ + this.aClass_ra_Sub3_9033.method5315()) * 2.0F / f - 1.0F;
					class138.aMatrix4f_1540.aFloatArray2594[13] = ((float) i_229_ + this.aClass_ra_Sub3_9033.method5315()) * 2.0F / f_213_ - 1.0F;
					class138.aMatrix4f_1540.aFloatArray2594[14] = -1.0F;
					class138.method1527();
					i_231_ += i_227_;
				}
				if (i_231_ < i_226_) {
					int i_233_ = i_226_ - i_231_;
					class138.aMatrix4f_1541.method2147(this.anInterface9_Impl2_9024.method77((float) i_233_), (this.anInterface9_Impl2_9024.method78((float) this.anInt9030)), 1.0F, 1.0F);
					class138.aMatrix4f_1540.method2147((float) i_233_ * 2.0F / f, ((float) this.anInt9030 * 2.0F / f_213_), 1.0F, 1.0F);
					class138.aMatrix4f_1540.aFloatArray2594[12] = ((float) i_231_ + this.aClass_ra_Sub3_9033.method5315()) * 2.0F / f - 1.0F;
					class138.aMatrix4f_1540.aFloatArray2594[13] = ((float) i_229_ + this.aClass_ra_Sub3_9033.method5315()) * 2.0F / f_213_ - 1.0F;
					class138.aMatrix4f_1540.aFloatArray2594[14] = -1.0F;
					class138.method1527();
				}
				i_229_ += i_228_;
			}
			if (i_229_ < i_225_) {
				int i_234_ = i_225_ - i_229_;
				class138.aMatrix4f_1541.method2147(this.anInterface9_Impl2_9024.method77((float) this.anInt9023), this.anInterface9_Impl2_9024.method78((float) i_234_), 1.0F, 1.0F);
				int i_235_ = i + this.anInt9026;
				for (int i_236_ = i_235_ + this.anInt9023; i_236_ <= i_226_; i_236_ += i_227_) {
					class138.aMatrix4f_1540.method2147((float) this.anInt9023 * 2.0F / f, (float) i_234_ * 2.0F / f_213_, 1.0F, 1.0F);
					class138.aMatrix4f_1540.aFloatArray2594[12] = ((float) i_235_ + this.aClass_ra_Sub3_9033.method5315()) * 2.0F / f - 1.0F;
					class138.aMatrix4f_1540.aFloatArray2594[13] = ((float) i_229_ + this.aClass_ra_Sub3_9033.method5315()) * 2.0F / f_213_ - 1.0F;
					class138.aMatrix4f_1540.aFloatArray2594[14] = -1.0F;
					class138.method1527();
					i_235_ += i_227_;
				}
				if (i_235_ < i_226_) {
					int i_237_ = i_226_ - i_235_;
					class138.aMatrix4f_1541.method2147(this.anInterface9_Impl2_9024.method77((float) i_237_), this.anInterface9_Impl2_9024.method78((float) i_234_), 1.0F, 1.0F);
					class138.aMatrix4f_1540.method2147(((float) i_237_ * 2.0F / f), ((float) i_234_ * 2.0F / f_213_), 1.0F, 1.0F);
					class138.aMatrix4f_1540.aFloatArray2594[12] = ((float) i_235_ + this.aClass_ra_Sub3_9033.method5315()) * 2.0F / f - 1.0F;
					class138.aMatrix4f_1540.aFloatArray2594[13] = ((float) i_229_ + this.aClass_ra_Sub3_9033.method5315()) * 2.0F / f_213_ - 1.0F;
					class138.aMatrix4f_1540.aFloatArray2594[14] = -1.0F;
					class138.method1527();
				}
			}
		}
	}

    void method688(int i, int i_348_, int i_349_, int i_350_, int[] is, int i_351_, int i_352_) {
		this.anInterface9_Impl2_9024.method81(i, i_348_, i_349_, i_350_, is, i_351_, i_352_);
	}

    public void method654(int i, int i_377_, ToolkitLoader toolkitLoader, int i_378_, int i_379_) {
		this.aClass_ra_Sub3_9033.method5337();
		Class138 class138 = (this.aClass_ra_Sub3_9033.aClass138_8257);
		class138.anInterface9_Impl2_1537 = this.anInterface9_Impl2_9024;
		class138.method1526(1, -1);
		i += this.anInt9026;
		i_377_ += this.anInt9029;
		float f = (float) this.aClass_ra_Sub3_9033.getFrameContext().getWidth();
		float f_380_ = (float) this.aClass_ra_Sub3_9033.getFrameContext().getHeight();
		class138.aMatrix4f_1540.method2147((float) this.anInt9023 * 2.0F / f, (float) this.anInt9030 * 2.0F / f_380_, 1.0F, 1.0F);
		class138.aMatrix4f_1540.aFloatArray2594[12] = (((float) i + this.aClass_ra_Sub3_9033.method5315()) * 2.0F / f) - 1.0F;
		class138.aMatrix4f_1540.aFloatArray2594[13] = (((float) i_377_ + this.aClass_ra_Sub3_9033.method5315()) * 2.0F / f_380_) - 1.0F;
		class138.aMatrix4f_1540.aFloatArray2594[14] = -1.0F;
		class138.aMatrix4f_1541.method2147(this.anInterface9_Impl2_9024.method77((float) this.anInt9023), this.anInterface9_Impl2_9024.method78((float) this.anInt9030), 1.0F, 1.0F);
		class138.anInterface7_Impl1_1538 = (this.aClass_ra_Sub3_9033.anInterface7_Impl1_8202);
		class138.anInt1543 = 0;
		class138.aClass153_1544 = (this.aClass_ra_Sub3_9033.aClass153_8356);
		Interface9_Impl2 interface9_impl2 = (((JavaGraphicsToolkitLoader) toolkitLoader).anInterface9_Impl2_8444);
		class138.anInterface9_Impl2_1536 = interface9_impl2;
		class138.aMatrix4f_1542.method2147(interface9_impl2.method77((float) this.anInt9023), interface9_impl2.method78((float) this.anInt9030), 1.0F, 1.0F);
		class138.aMatrix4f_1542.aFloatArray2594[12] = interface9_impl2.method77((float) (i - i_378_));
		class138.aMatrix4f_1542.aFloatArray2594[13] = interface9_impl2.method78((float) (i_377_ - i_379_));
		class138.method1528();
	}

}
