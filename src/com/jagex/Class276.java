package com.jagex;/* Class276 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.maths.Matrix43f;
import com.jagex.maths.Matrix4f;

public class Class276 {
	static int anInt2908 = 0;
	int anInt2909;
	static int anInt2910 = 1;
	static int anInt2911 = 2;
	static int anInt2912 = 192;
	boolean aBoolean2913;
	int anInt2914;
	int anInt2915;
	int anInt2916;
	int anInt2917;
	int anInt2918;
	int anInt2919;
	int anInt2920;
	int anInt2921;
	static SpriteToolkit aClass57_2922;
	int anInt2923;
	static int anInt2924 = 512;
	SpriteToolkit aClass57_2925;
	int anInt2926;
	int anInt2927;
	int anInt2928;
	static int anInt2929 = 24;
	static int anInt2930 = 24;
	int anInt2931;
	static int anInt2932 = 128;
	static int anInt2933 = 13;
	static int anInt2934 = 16;
	int anInt2935;
	static ModelToolkit aClass387_2936;
	static SpriteToolkit aClass57_2937;
	static int[] anIntArray2938 = new int[4];

	static void method2574() {
		aClass387_2936 = null;
		aClass57_2937 = null;
	}

	boolean method2575(GraphicsToolkit class_ra, Class276 class276_0_) {
		return (this.aClass57_2925 != null || method2578(class_ra, class276_0_));
	}

	static void method2576(GraphicsToolkit class_ra) {
		if (aClass387_2936 == null) {
			BaseModel class64 = new BaseModel(580, 1104, 1);
			class64.method757((short) 0, (short) 32767, (short) 0, (short) 1024, (short) 1024, (short) 1024, (byte) 0, (byte) 0, (byte) 0);
			class64.method747(0, 128, 0);
			class64.method747(0, -128, 0);
			for (int i = 0; i <= 24; i++) {
				int i_1_ = i * 8192 / 24;
				int i_2_ = CircleAngleTable.SINE[i_1_];
				int i_3_ = CircleAngleTable.COSINE[i_1_];
				for (int i_4_ = 1; i_4_ < 24; i_4_++) {
					int i_5_ = i_4_ * 8192 / 24;
					int i_6_ = CircleAngleTable.COSINE[i_5_] >> 7;
					int i_7_ = CircleAngleTable.SINE[i_5_] * i_2_ >> 21;
					int i_8_ = CircleAngleTable.SINE[i_5_] * i_3_ >> 21;
					class64.method747(i_8_, i_6_, -i_7_);
				}
				if (i > 0) {
					int i_9_ = i * 23 + 2;
					int i_10_ = i_9_ - 23;
					class64.method748(0, i_10_, i_9_, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
					for (int i_11_ = 1; i_11_ < 23; i_11_++) {
						int i_12_ = i_10_ + 1;
						int i_13_ = i_9_ + 1;
						class64.method748(i_10_, i_12_, i_9_, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
						class64.method748(i_12_, i_13_, i_9_, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
						i_10_ = i_12_;
						i_9_ = i_13_;
					}
					class64.method748(i_9_, i_10_, 1, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
				}
			}
			class64.anInt626 = class64.anInt614;
			class64.anIntArray631 = null;
			class64.anIntArray619 = null;
			class64.aByteArray633 = null;
			aClass387_2936 = class_ra.creatModelToolkit(class64, 51200, 33, 64, 768);
		}
	}

	void method2577(GraphicsToolkit class_ra, int i, int i_14_, int i_15_, int i_16_, int i_17_, int i_18_, int i_19_, int i_20_, int i_21_, int i_22_) {
		if (this.aClass57_2925 != null) {
			float[] fs = new float[3];
			float f = (float) -(this.anInt2914 - i_19_ << 16);
			float f_23_ = (float) (this.anInt2909 - i_20_ << 15);
			float f_24_ = (float) -(this.anInt2916 - i_21_ << 16);
			float[] fs_25_ = new float[3];
			class_ra.method5044().method2067(fs_25_);
			f += fs_25_[0];
			f_23_ += fs_25_[1];
			f_24_ += fs_25_[2];
			class_ra.method_do(f, f_23_, f_24_, fs);
			if (!(fs[2] < 0.0F)) {
				int i_26_ = (int) (fs[0] - (float) (this.anInt2920 / 2));
				int i_27_ = (int) (fs[1] - (float) (this.anInt2920 / 2));
				if (i_27_ < i_16_ && i_27_ + this.anInt2920 > 0 && i_26_ < i_15_ && i_26_ + this.anInt2920 > 0)
					this.aClass57_2925.method691(i_26_, i_27_, this.anInt2920, this.anInt2920, 0, i_22_ << 24 | 0xffffff, 1);
			}
		}
	}

	boolean method2578(GraphicsToolkit class_ra, Class276 class276_28_) {
		if (this.aClass57_2925 == null) {
			if (this.anInt2928 == 0) {
				if (Skybox.anInterface_ma2955.method170((this.anInt2918), (short) 14716)) {
					int[] is = (Skybox.anInterface_ma2955.method172(this.anInt2918, 0.7F, this.anInt2923, this.anInt2923, false, (byte) 2));
					this.aClass57_2925 = class_ra.createRenderSprite(is, 0, this.anInt2923, this.anInt2923, this.anInt2923);
				}
			} else if (this.anInt2928 == 2)
				method2582(class_ra, class276_28_);
			else if (this.anInt2928 == 1)
				method2580(class_ra, class276_28_);
		}
		return this.aClass57_2925 != null;
	}

	boolean method2579(int a, int b, int c, int i_31_) {
		int i_32_;
		int i_33_;
		int i_34_;
		if (!this.aBoolean2913) {
			i_32_ = this.anInt2914 - a;
			i_33_ = this.anInt2909 - b;
			i_34_ = this.anInt2916 - c;
			this.anInt2919 = (int) Math.sqrt((double) (i_32_ * i_32_ + i_33_ * i_33_ + i_34_ * i_34_));
			if (this.anInt2919 == 0)
				this.anInt2919 = 1;
			i_32_ = (i_32_ << 8) / this.anInt2919;
			i_33_ = (i_33_ << 8) / this.anInt2919;
			i_34_ = (i_34_ << 8) / this.anInt2919;
		} else {
			this.anInt2919 = 1073741823;
			i_32_ = this.anInt2914;
			i_33_ = this.anInt2909;
			i_34_ = this.anInt2916;
		}
		int i_35_ = (int) (Math.sqrt((double) (i_32_ * i_32_ + i_33_ * i_33_ + i_34_ * i_34_)) * 256.0);
		if (i_35_ > 128) {
			i_32_ = (i_32_ << 16) / i_35_;
			i_33_ = (i_33_ << 16) / i_35_;
			i_34_ = (i_34_ << 16) / i_35_;
			this.anInt2920 = (this.anInt2931 * i_31_ / (this.aBoolean2913 ? 1024 : this.anInt2919));
		} else
			this.anInt2920 = 0;
		if (this.anInt2920 < 8) {
			this.aClass57_2925 = null;
			return false;
		}
		int i_36_ = LinkedList.getNextBitValue(this.anInt2920);
		if (i_36_ > i_31_)
			i_36_ = StaticMethods.method5639(i_31_);
		if (i_36_ > 512)
			i_36_ = 512;
		if (i_36_ != this.anInt2923)
			this.anInt2923 = i_36_;
		this.anInt2927 = (int) (Math.asin((double) ((float) i_33_ / 256.0F)) * 2607.5945876176133) & 0x3fff;
		this.anInt2921 = (int) (Math.atan2((double) i_32_, (double) -i_34_) * 2607.5945876176133) & 0x3fff;
		this.aClass57_2925 = null;
		return true;
	}

	void method2580(GraphicsToolkit class_ra, Class276 class276_37_) {
		method2576(class_ra);
		method2581(class_ra);
		class_ra.qa(anIntArray2938);
		class_ra.setClip(0, 0, this.anInt2923, this.anInt2923);
		class_ra.clear(2, 0);
		class_ra.drawFilledRectangle(0, 0, this.anInt2923, this.anInt2923, ~0xffffff | this.anInt2935, 0);
		int i = 0;
		int i_38_ = 0;
		int i_39_ = 256;
		if (class276_37_ != null) {
			if (class276_37_.aBoolean2913) {
				i = -class276_37_.anInt2914;
				i_38_ = -class276_37_.anInt2909;
				i_39_ = -class276_37_.anInt2916;
			} else {
				i = (class276_37_.anInt2914 - this.anInt2914);
				i_38_ = (class276_37_.anInt2909 - this.anInt2909);
				i_39_ = (class276_37_.anInt2916 - this.anInt2916);
			}
		}
		if (this.anInt2927 != 0) {
			int i_40_ = CircleAngleTable.SINE[this.anInt2927];
			int i_41_ = CircleAngleTable.COSINE[this.anInt2927];
			int i_42_ = i_38_ * i_41_ - i_39_ * i_40_ >> 14;
			i_39_ = i_38_ * i_40_ + i_39_ * i_41_ >> 14;
			i_38_ = i_42_;
		}
		if (this.anInt2921 != 0) {
			int i_43_ = CircleAngleTable.SINE[this.anInt2921];
			int i_44_ = CircleAngleTable.COSINE[this.anInt2921];
			int i_45_ = i_39_ * i_43_ + i * i_44_ >> 14;
			i_39_ = i_39_ * i_44_ - i * i_43_ >> 14;
			i = i_45_;
		}
		ModelToolkit class387 = aClass387_2936.method4755((byte) 0, 51200, true);
		class387.W((short) 0, (short) this.anInt2918);
		class_ra.setModelAmbient(1.0F);
		class_ra.updateSun(16777215, 1.0F, 1.0F, (float) i, (float) i_38_, (float) i_39_);
		int i_46_ = (1024 * this.anInt2923 / (class387.ya() - class387.RA()));
		if (this.anInt2935 != 0)
			i_46_ = i_46_ * 13 / 16;
		Matrix4f matrix4f = class_ra.method5045();
		Matrix4f matrix4f_47_ = class_ra.cz();
		matrix4f_47_.setOrthographic((float) (this.anInt2923 / 2), (float) (this.anInt2923 / 2), (float) i_46_, (float) i_46_, 50.0F, 50000.0F, (float) class_ra.getFrameContext().getWidth(), (float) class_ra.getFrameContext().getHeight(), 1024.0F);
		class_ra.ci(matrix4f_47_);
		class_ra.cw(new Matrix43f());
		Matrix43f class222 = new Matrix43f();
		class222.setMatrix(0.0F, 0.0F, (float) (50 - class387.AA()));
		class387.render(class222, null, 1);
		int i_48_ = this.anInt2923 * 13 / 16;
		int i_49_ = (this.anInt2923 - i_48_) / 2;
		aClass57_2922.method691(i_49_, i_49_, i_48_, i_48_, 0, ~0xffffff | this.anInt2935, 1);
		this.aClass57_2925 = class_ra.method5033(0, 0, this.anInt2923, this.anInt2923, true);
		class_ra.clear(2, 0);
		class_ra.drawFilledRectangle(0, 0, this.anInt2923, this.anInt2923, 0, 0);
		aClass57_2937.method691(0, 0, this.anInt2923, this.anInt2923, 1, 0, 0);
		this.aClass57_2925.method632(0, 0, 3);
		class_ra.ci(matrix4f);
		class_ra.setClip(anIntArray2938[0], anIntArray2938[1], anIntArray2938[2], anIntArray2938[3]);
	}

	static void method2581(GraphicsToolkit class_ra) {
		if (aClass57_2937 == null) {
			int[] is = new int[16384];
			int[] is_50_ = new int[16384];
			for (int i = 0; i < 64; i++) {
				int i_51_ = 64 - i;
				i_51_ *= i_51_;
				int i_52_ = 128 - i - 1;
				int i_53_ = i * 128;
				int i_54_ = i_52_ * 128;
				for (int i_55_ = 0; i_55_ < 64; i_55_++) {
					int i_56_ = 64 - i_55_;
					i_56_ *= i_56_;
					int i_57_ = 128 - i_55_ - 1;
					int i_58_ = 256 - (i_56_ + i_51_ << 8) / 4096;
					i_58_ = i_58_ * 3072 / 1536;
					if (i_58_ < 0)
						i_58_ = 0;
					else if (i_58_ > 255)
						i_58_ = 255;
					int i_59_ = i_58_ / 2;
					is_50_[i_53_ + i_55_] = is_50_[i_53_ + i_57_] = is_50_[i_54_ + i_55_] = is_50_[i_54_ + i_57_] = ~0xffffff | i_58_ << 16;
					is[i_53_ + i_55_] = is[i_53_ + i_57_] = is[i_54_ + i_55_] = is[i_54_ + i_57_] = 127 - i_59_ << 24 | 0xffffff;
				}
			}
			aClass57_2937 = class_ra.createRenderSprite(is_50_, 0, 128, 128, 128);
			aClass57_2922 = class_ra.createRenderSprite(is, 0, 128, 128, 128);
		}
	}

	void method2582(GraphicsToolkit class_ra, Class276 class276_60_) {
		BaseModel class64 = BaseModel.load(Class465.aClass243_6520, this.anInt2918, 0);
		if (class64 != null) {
			class_ra.qa(anIntArray2938);
			class_ra.setClip(0, 0, this.anInt2923, this.anInt2923);
			class_ra.clear(2, 0);
			class_ra.drawFilledRectangle(0, 0, this.anInt2923, this.anInt2923, 0, 0);
			int i = 0;
			int i_61_ = 0;
			int i_62_ = 256;
			if (class276_60_ != null) {
				if (class276_60_.aBoolean2913) {
					i = -class276_60_.anInt2914;
					i_61_ = -class276_60_.anInt2909;
					i_62_ = -class276_60_.anInt2916;
				} else {
					i = (this.anInt2914 - class276_60_.anInt2914);
					i_61_ = (this.anInt2909 - class276_60_.anInt2909);
					i_62_ = (this.anInt2916 - class276_60_.anInt2916);
				}
			}
			if (this.anInt2927 != 0) {
				int i_63_ = -this.anInt2927 & 0x3fff;
				int i_64_ = CircleAngleTable.SINE[i_63_];
				int i_65_ = CircleAngleTable.COSINE[i_63_];
				int i_66_ = i_61_ * i_65_ - i_62_ * i_64_ >> 14;
				i_62_ = i_61_ * i_64_ + i_62_ * i_65_ >> 14;
				i_61_ = i_66_;
			}
			if (this.anInt2921 != 0) {
				int i_67_ = -this.anInt2921 & 0x3fff;
				int i_68_ = CircleAngleTable.SINE[i_67_];
				int i_69_ = CircleAngleTable.COSINE[i_67_];
				int i_70_ = i_62_ * i_68_ + i * i_69_ >> 14;
				i_62_ = i_62_ * i_69_ - i * i_68_ >> 14;
				i = i_70_;
			}
			class_ra.setModelAmbient(1.0F);
			class_ra.updateSun(this.anInt2935, 1.0F, 1.0F, (float) i, (float) i_61_, (float) i_62_);
			class64.method754(this.anInt2926 & 0x3fff, this.anInt2917 & 0x3fff, this.anInt2915 & 0x3fff);
			ModelToolkit class387 = class_ra.creatModelToolkit(class64, 2048, 0, 64, 768);
			int i_71_ = class387.ya() - class387.RA();
			int i_72_ = class387.o() - class387.YA();
			int i_73_ = i_71_ > i_72_ ? i_71_ : i_72_;
			int i_74_ = 1024 * this.anInt2923 / i_73_;
			Matrix4f matrix4f = class_ra.method5045();
			Matrix4f matrix4f_75_ = class_ra.cz();
			matrix4f_75_.setOrthographic((float) (this.anInt2923 / 2), (float) (this.anInt2923 / 2), (float) i_74_, (float) i_74_, 50.0F, 50000.0F, (float) class_ra.getFrameContext().getWidth(), (float) class_ra.getFrameContext().getHeight(), 1024.0F);
			class_ra.ci(matrix4f_75_);
			Matrix43f class222 = new Matrix43f();
			class_ra.cw(class222);
			Matrix43f class222_76_ = class_ra.getTransformationMatrix();
			class222_76_.setMatrix(0.0F, 0.0F, (float) (50 - class387.AA()));
			class387.render(class222_76_, null, 1);
			this.aClass57_2925 = class_ra.method5033(0, 0, this.anInt2923, this.anInt2923, true);
			this.aClass57_2925.method632(0, 0, 3);
			class_ra.ci(matrix4f);
			class_ra.setClip(anIntArray2938[0], anIntArray2938[1], anIntArray2938[2], anIntArray2938[3]);
		}
	}

	public Class276(int i, int i_77_, int i_78_, int i_79_, int i_80_, int i_81_, int i_82_, boolean bool, int i_83_, int i_84_, int i_85_) {
		this.anInt2914 = i_78_;
		this.anInt2909 = i_79_;
		this.anInt2916 = i_80_;
		this.aBoolean2913 = bool;
		this.anInt2918 = i_77_;
		this.anInt2935 = i_82_;
		this.anInt2931 = i_81_;
		this.anInt2928 = i;
		this.anInt2926 = i_83_;
		this.anInt2917 = i_84_;
		this.anInt2915 = i_85_;
	}
}
