package com.jagex;/* Class57_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class57_Sub1 extends SpriteToolkit {
	static int anInt8987;
	static int anInt8988;
	int anInt8989;
	int anInt8990;
	static int anInt8991;
	static int anInt8992;
	int anInt8993;
	static int anInt8994;
	static int anInt8995 = 4;
	static int anInt8996 = 8;
	int anInt8997;
	static int anInt8998;
	static int anInt8999;
	int anInt9000;
	static int anInt9001;
	static int anInt9002 = 12;
	static int anInt9003;
	static int anInt9004;
	static int anInt9005;
	JavaGraphicsToolkit aClass_ra_Sub1_9006;
	static int anInt9007;
	static int anInt9008;
	static int anInt9009;
	int anInt9010;
	static int anInt9011;
	static int anInt9012;
	static int anInt9013;
	static int anInt9014;
	static int anInt9015 = 0;
	static int anInt9016 = 0;
	int[] anIntArray9017;
	static int anInt9018;
	static int anInt9019;
	static int anInt9020;
	static int anInt9021;
	static int anInt9022;

	Class57_Sub1(JavaGraphicsToolkit class_ra_sub1, int i, int i_0_) {
		this.aClass_ra_Sub1_9006 = class_ra_sub1;
		this.anInt9010 = i;
		this.anInt8989 = i_0_;
	}

    public int getWidth() {
		return this.anInt9010;
	}

	public int getHeight() {
		return this.anInt8989;
	}

	public int getPaddedHeight() {
		return (this.anInt9000 + this.anInt8989 + this.anInt8993);
	}

	public abstract void draw(int i, int i_5_, int i_6_, int i_7_, int i_8_);

    abstract void method635(int i, int i_19_, int i_20_, int i_21_, int i_22_, int i_23_, int i_24_, int i_25_);

    abstract void method678(boolean bool, boolean bool_33_, boolean bool_34_, int i, int i_35_, float f, int i_36_, int i_37_, int i_38_, int i_39_, int i_40_, int i_41_, boolean bool_42_);

	boolean method679(float f, float f_43_, float f_44_, float f_45_, float f_46_, float f_47_) {
		int i = (this.anInt8990 + this.anInt9010 + this.anInt8997);
		int i_48_ = (this.anInt9000 + this.anInt8989 + this.anInt8993);
		if (i != this.anInt9010 || i_48_ != this.anInt8989) {
			float f_49_ = (f_44_ - f) / (float) i;
			float f_50_ = (f_45_ - f_43_) / (float) i;
			float f_51_ = (f_46_ - f) / (float) i_48_;
			float f_52_ = (f_47_ - f_43_) / (float) i_48_;
			float f_53_ = f_51_ * (float) this.anInt9000;
			float f_54_ = f_52_ * (float) this.anInt9000;
			float f_55_ = f_49_ * (float) this.anInt8990;
			float f_56_ = f_50_ * (float) this.anInt8990;
			float f_57_ = -f_49_ * (float) this.anInt8997;
			float f_58_ = -f_50_ * (float) this.anInt8997;
			float f_59_ = -f_51_ * (float) this.anInt8993;
			float f_60_ = -f_52_ * (float) this.anInt8993;
			f += f_55_ + f_53_;
			f_43_ += f_56_ + f_54_;
			f_44_ += f_57_ + f_53_;
			f_45_ += f_58_ + f_54_;
			f_46_ += f_55_ + f_59_;
			f_47_ += f_56_ + f_60_;
		}
		float f_61_ = f_46_ + (f_44_ - f);
		float f_62_ = f_45_ + (f_47_ - f_43_);
		float f_63_;
		float f_64_;
		if (f < f_44_) {
			f_63_ = f;
			f_64_ = f_44_;
		} else {
			f_63_ = f_44_;
			f_64_ = f;
		}
		if (f_46_ < f_63_)
			f_63_ = f_46_;
		if (f_61_ < f_63_)
			f_63_ = f_61_;
		if (f_46_ > f_64_)
			f_64_ = f_46_;
		if (f_61_ > f_64_)
			f_64_ = f_61_;
		float f_65_;
		float f_66_;
		if (f_43_ < f_45_) {
			f_65_ = f_43_;
			f_66_ = f_45_;
		} else {
			f_65_ = f_45_;
			f_66_ = f_43_;
		}
		if (f_47_ < f_65_)
			f_65_ = f_47_;
		if (f_62_ < f_65_)
			f_65_ = f_62_;
		if (f_47_ > f_66_)
			f_66_ = f_47_;
		if (f_62_ > f_66_)
			f_66_ = f_62_;
		if (f_63_ < (float) (this.aClass_ra_Sub1_9006.anInt7974 * -912871679))
			f_63_ = (float) (this.aClass_ra_Sub1_9006.anInt7974 * -912871679);
		if (f_64_ > (float) (this.aClass_ra_Sub1_9006.anInt7991 * -1416794725))
			f_64_ = (float) (this.aClass_ra_Sub1_9006.anInt7991 * -1416794725);
		if (f_65_ < (float) (this.aClass_ra_Sub1_9006.anInt7976 * -1278653805))
			f_65_ = (float) (this.aClass_ra_Sub1_9006.anInt7976 * -1278653805);
		if (f_66_ > (float) (this.aClass_ra_Sub1_9006.anInt7977 * 63686679))
			f_66_ = (float) (this.aClass_ra_Sub1_9006.anInt7977 * 63686679);
		f_64_ = f_63_ - f_64_;
		if (f_64_ >= 0.0F)
			return false;
		f_66_ = f_65_ - f_66_;
		if (f_66_ >= 0.0F)
			return false;
		anInt9020 = (this.aClass_ra_Sub1_9006.width) * 692106883;
		anInt9003 = (int) ((float) ((int) f_65_ * anInt9020) + f_63_);
		float f_67_ = (f_44_ - f) * (f_47_ - f_43_) - (f_45_ - f_43_) * (f_46_ - f);
		float f_68_ = (f_46_ - f) * (f_45_ - f_43_) - (f_47_ - f_43_) * (f_44_ - f);
		anInt9004 = (int) ((f_47_ - f_43_) * 4096.0F * (float) this.anInt9010 / f_67_);
		anInt8991 = (int) ((f_45_ - f_43_) * 4096.0F * (float) this.anInt8989 / f_68_);
		anInt9005 = (int) ((f_46_ - f) * 4096.0F * (float) this.anInt9010 / f_68_);
		anInt9007 = (int) ((f_44_ - f) * 4096.0F * (float) this.anInt8989 / f_67_);
		anInt9008 = (int) (f_63_ * 16.0F + 8.0F - (f + f_44_ + f_46_ + f_61_) / 4.0F * 16.0F);
		anInt8987 = (int) (f_65_ * 16.0F + 8.0F - (f_43_ + f_45_ + f_47_ + f_62_) / 4.0F * 16.0F);
		anInt8988 = ((this.anInt9010 >> 1 << 12) + (anInt8987 * anInt9005 >> 4));
		anInt9011 = ((this.anInt8989 >> 1 << 12) + (anInt8987 * anInt9007 >> 4));
		anInt9012 = anInt9008 * anInt9004 >> 4;
		anInt9013 = anInt9008 * anInt8991 >> 4;
		anInt8998 = (int) f_63_;
		anInt8999 = (int) f_64_;
		anInt8994 = (int) f_65_;
		anInt9001 = (int) f_66_;
		return true;
	}

	void method642(float f, float f_69_, float f_70_, float f_71_, float f_72_, float f_73_, int i, int i_74_, int i_75_, int i_76_) {
		if (this.aClass_ra_Sub1_9006.method5196())
			throw new IllegalStateException();
		if (method679(f, f_69_, f_70_, f_71_, f_72_, f_73_)) {
			anInt9014 = i_74_;
			if (i != 1) {
				anInt9015 = i_74_ >>> 24;
				anInt9016 = 256 - anInt9015;
				if (i == 0) {
					anInt9009 = (i_74_ & 0xff0000) >> 16;
					anInt9018 = (i_74_ & 0xff00) >> 8;
					anInt9019 = i_74_ & 0xff;
				} else if (i == 2) {
					anInt8992 = i_74_ >>> 24;
					anInt9021 = 256 - anInt8992;
					int i_77_ = (i_74_ & 0xff00ff) * anInt9021 & ~0xff00ff;
					int i_78_ = (i_74_ & 0xff00) * anInt9021 & 0xff0000;
					anInt9022 = (i_77_ | i_78_) >>> 8;
				}
			}
			if (i == 1) {
				if (i_75_ == 0)
					method680(1, 0);
				else if (i_75_ == 1)
					method680(1, 1);
				else if (i_75_ == 2)
					method680(1, 2);
			} else if (i == 0) {
				if (i_75_ == 0)
					method680(0, 0);
				else if (i_75_ == 1)
					method680(0, 1);
				else if (i_75_ == 2)
					method680(0, 2);
			} else if (i == 3) {
				if (i_75_ == 0)
					method680(3, 0);
				else if (i_75_ == 1)
					method680(3, 1);
				else if (i_75_ == 2)
					method680(3, 2);
			} else if (i == 2) {
				if (i_75_ == 0)
					method680(2, 0);
				else if (i_75_ == 1)
					method680(2, 1);
				else if (i_75_ == 2)
					method680(2, 2);
			}
		}
	}

	abstract void method680(int i, int i_79_);

    abstract void method681(int[] is, int[] is_80_, int i, int i_81_);

	static {
		anInt9009 = 0;
		anInt9018 = 0;
		anInt9019 = 0;
		anInt8992 = 0;
		anInt9021 = 0;
		anInt9022 = 0;
	}

    abstract void method682(boolean bool, boolean bool_121_, boolean bool_122_, int i, int i_123_, float f, int i_124_, int i_125_, int i_126_, int i_127_, int i_128_, int i_129_, boolean bool_130_);

	public void method621(int i, int i_131_, int i_132_, int i_133_) {
		this.anInt8990 = i;
		this.anInt9000 = i_131_;
		this.anInt8997 = i_132_;
		this.anInt8993 = i_133_;
	}

    abstract void method683(int[] is, int[] is_134_, int i, int i_135_);

	abstract void method684(int[] is, int[] is_136_, int i, int i_137_);

	abstract void method685(int[] is, int[] is_138_, int i, int i_139_);

    public void method622(int[] is) {
		is[0] = this.anInt8990;
		is[1] = this.anInt9000;
		is[2] = this.anInt8997;
		is[3] = this.anInt8993;
	}

    abstract void method686(int i, int i_206_);

	abstract void method687(int i, int i_207_);

	void method644(float f, float f_208_, float f_209_, float f_210_, float f_211_, float f_212_, int i, ToolkitLoader toolkitLoader, int i_213_, int i_214_) {
		if (this.aClass_ra_Sub1_9006.method5196())
			throw new IllegalStateException();
		if (method679(f, f_208_, f_209_, f_210_, f_211_, f_212_)) {
			Toolkit_Loader_Sub2 class_ta_sub2 = (Toolkit_Loader_Sub2) toolkitLoader;
			method681(class_ta_sub2.anIntArray8443, class_ta_sub2.anIntArray8442, anInt8998 - i_213_, -i_214_ - (anInt9001 - anInt8994));
		}
	}

    public abstract void method654(int i, int i_225_, ToolkitLoader toolkitLoader, int i_226_, int i_227_);

    public void method694(int i, int i_228_, int i_229_, int i_230_, int i_231_, int i_232_, int i_233_) {
		if (this.aClass_ra_Sub1_9006.method5196())
			throw new IllegalStateException();
		if (this.anIntArray9017 == null)
			this.anIntArray9017 = new int[4];
		this.aClass_ra_Sub1_9006.qa(this.anIntArray9017);
		this.aClass_ra_Sub1_9006.constrainClip((this.aClass_ra_Sub1_9006.anInt7974) * -912871679, (this.aClass_ra_Sub1_9006.anInt7976) * -1278653805, i + i_229_, i_228_ + i_230_);
		int i_234_ = getPaddedWidth();
		int i_235_ = getPaddedHeight();
		int i_236_ = (i_229_ + i_234_ - 1) / i_234_;
		int i_237_ = (i_230_ + i_235_ - 1) / i_235_;
		for (int i_238_ = 0; i_238_ < i_237_; i_238_++) {
			int i_239_ = i_238_ * i_235_;
			for (int i_240_ = 0; i_240_ < i_236_; i_240_++)
				draw(i + i_240_ * i_234_, i_228_ + i_239_, i_231_, i_232_, i_233_);
		}
		this.aClass_ra_Sub1_9006.setClip(this.anIntArray9017[0], this.anIntArray9017[1], this.anIntArray9017[2], this.anIntArray9017[3]);
	}

	public int getPaddedWidth() {
		return (this.anInt8990 + this.anInt9010 + this.anInt8997);
	}

}
