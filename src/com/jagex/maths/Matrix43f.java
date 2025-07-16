package com.jagex.maths;/* Class222 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.Class215;
import com.jagex.Quaternion;
import com.jagex.Class235;
import com.jagex.Vector3f;

public class Matrix43f {
	public float aFloat2492;
	public float aFloat2493;
	public float aFloat2494;
	public float aFloat2495;
	public float aFloat2496;
	public float aFloat2497;
	public float aFloat2498;
	public float aFloat2499;
	public float aFloat2500;
	public float aFloat2501;
	public float aFloat2502;
	public float aFloat2503;
	public static Matrix43f aClass222_2504 = new Matrix43f();

	public Matrix43f(Matrix43f class222_0_) {
		copy(class222_0_);
	}

	public void method2054(Class235 class235) {
		method2072(class235.aQuaternion_2600);
		method2063(class235.trans);
	}

	public void method2460() {
		this.aFloat2493 = 0.0F;
		this.aFloat2503 = 0.0F;
		this.aFloat2492 = 0.0F;
		this.aFloat2500 = 0.0F;
		this.aFloat2499 = 0.0F;
		this.aFloat2498 = 0.0F;
		this.aFloat2496 = 0.0F;
		this.aFloat2495 = 0.0F;
		this.aFloat2502 = 0.0F;
		this.aFloat2501 = 1.0F;
		this.aFloat2497 = 1.0F;
		this.aFloat2494 = 1.0F;
		
	}

	public void method2056(int i, int i_1_, int i_2_, float f, float f_3_, float f_4_) {
		if (i != 0) {
			float f_5_ = Class215.aFloatArray2450[i & 0x3fff];
			float f_6_ = Class215.aFloatArray2449[i & 0x3fff];
			this.aFloat2501 = 1.0F;
			this.aFloat2500 = 0.0F;
			this.aFloat2499 = 0.0F;
			this.aFloat2498 = 0.0F;
			this.aFloat2495 = 0.0F;
			this.aFloat2494 = 2.0F * f_5_ * (float) i_1_;
			this.aFloat2497 = 2.0F * f_5_ * (float) i_2_;
			this.aFloat2502 = 2.0F * f_6_ * (float) i_1_;
			this.aFloat2496 = -2.0F * f_6_ * (float) i_2_;
			this.aFloat2492 = (float) (2 * i_1_) * (0.5F * f_6_ - 0.5F * f_5_) + f;
			this.aFloat2503 = (float) (2 * i_2_) * (-0.5F * f_6_ - 0.5F * f_5_) + f_3_;
			this.aFloat2493 = f_4_;
		} else {
			this.aFloat2500 = 0.0F;
			this.aFloat2499 = 0.0F;
			this.aFloat2498 = 0.0F;
			this.aFloat2496 = 0.0F;
			this.aFloat2495 = 0.0F;
			this.aFloat2502 = 0.0F;
			this.aFloat2494 = (float) (2 * i_1_);
			this.aFloat2497 = (float) (2 * i_2_);
			this.aFloat2501 = 1.0F;
			this.aFloat2492 = f - (float) i_1_;
			this.aFloat2503 = f_3_ - (float) i_2_;
			this.aFloat2493 = f_4_;
		}
	}

	public void method2057(float f, float f_7_, float f_8_, float f_9_, float f_10_, float f_11_, float f_12_, float f_13_, float f_14_) {
		this.aFloat2494 = f;
		this.aFloat2496 = f_9_;
		this.aFloat2499 = f_12_;
		this.aFloat2492 = 0.0F;
		this.aFloat2502 = f_7_;
		this.aFloat2497 = f_10_;
		this.aFloat2500 = f_13_;
		this.aFloat2503 = 0.0F;
		this.aFloat2495 = f_8_;
		this.aFloat2498 = f_11_;
		this.aFloat2501 = f_14_;
		this.aFloat2493 = 0.0F;
	}

	public void method2058() {
		float f = this.aFloat2492;
		float f_15_ = this.aFloat2503;
		float f_16_ = this.aFloat2496;
		this.aFloat2496 = this.aFloat2502;
		this.aFloat2502 = f_16_;
		float f_17_ = this.aFloat2499;
		this.aFloat2499 = this.aFloat2495;
		this.aFloat2495 = f_17_;
		float f_18_ = this.aFloat2500;
		this.aFloat2500 = this.aFloat2498;
		this.aFloat2498 = f_18_;
		this.aFloat2492 = -(f * this.aFloat2494 + f_15_ * this.aFloat2496 + this.aFloat2493 * this.aFloat2499);
		this.aFloat2503 = -(f * this.aFloat2502 + f_15_ * this.aFloat2497 + this.aFloat2493 * this.aFloat2500);
		this.aFloat2493 = -(f * this.aFloat2495 + f_15_ * this.aFloat2498 + this.aFloat2493 * this.aFloat2501);
	}

	public void method2473(float f, float f_19_, float f_20_, float f_21_) {
		float f_22_ = (float) Math.cos((double) f_21_);
		float f_23_ = (float) Math.sin((double) f_21_);
		this.aFloat2494 = f_22_ + f * f * (1.0F - f_22_);
		this.aFloat2502 = f_20_ * f_23_ + f_19_ * f * (1.0F - f_22_);
		this.aFloat2495 = -f_19_ * f_23_ + f_20_ * f * (1.0F - f_22_);
		this.aFloat2496 = -f_20_ * f_23_ + f * f_19_ * (1.0F - f_22_);
		this.aFloat2497 = f_22_ + f_19_ * f_19_ * (1.0F - f_22_);
		this.aFloat2498 = f * f_23_ + f_20_ * f_19_ * (1.0F - f_22_);
		this.aFloat2499 = f_19_ * f_23_ + f * f_20_ * (1.0F - f_22_);
		this.aFloat2500 = -f * f_23_ + f_19_ * f_20_ * (1.0F - f_22_);
		this.aFloat2501 = f_22_ + f_20_ * f_20_ * (1.0F - f_22_);
		this.aFloat2493 = 0.0F;
		this.aFloat2503 = 0.0F;
		this.aFloat2492 = 0.0F;
	}

	public Matrix43f() {
		method2460();
	}

	void method2060(float f, float f_24_, float f_25_, float f_26_) {
		float f_27_ = f * f;
		float f_28_ = f * f_24_;
		float f_29_ = f * f_25_;
		float f_30_ = f * f_26_;
		float f_31_ = f_24_ * f_24_;
		float f_32_ = f_24_ * f_25_;
		float f_33_ = f_24_ * f_26_;
		float f_34_ = f_25_ * f_25_;
		float f_35_ = f_25_ * f_26_;
		this.aFloat2494 = 1.0F - 2.0F * (f_31_ + f_34_);
		this.aFloat2496 = 2.0F * (f_28_ - f_35_);
		this.aFloat2499 = 2.0F * (f_29_ + f_33_);
		this.aFloat2502 = 2.0F * (f_28_ + f_35_);
		this.aFloat2497 = 1.0F - 2.0F * (f_27_ + f_34_);
		this.aFloat2500 = 2.0F * (f_32_ - f_30_);
		this.aFloat2495 = 2.0F * (f_29_ - f_33_);
		this.aFloat2498 = 2.0F * (f_32_ + f_30_);
		this.aFloat2501 = 1.0F - 2.0F * (f_27_ + f_31_);
		this.aFloat2493 = 0.0F;
		this.aFloat2503 = 0.0F;
		this.aFloat2492 = 0.0F;
	}

	public void method2061(float f, float f_36_, float f_37_) {
		this.aFloat2494 *= f;
		this.aFloat2496 *= f;
		this.aFloat2499 *= f;
		this.aFloat2492 *= f;
		this.aFloat2502 *= f_36_;
		this.aFloat2497 *= f_36_;
		this.aFloat2500 *= f_36_;
		this.aFloat2503 *= f_36_;
		this.aFloat2495 *= f_37_;
		this.aFloat2498 *= f_37_;
		this.aFloat2501 *= f_37_;
		this.aFloat2493 *= f_37_;
	}

	public void setMatrix(float f, float f_38_, float f_39_) {
		this.aFloat2500 = 0.0F;
		this.aFloat2499 = 0.0F;
		this.aFloat2498 = 0.0F;
		this.aFloat2496 = 0.0F;
		this.aFloat2495 = 0.0F;
		this.aFloat2502 = 0.0F;
		this.aFloat2501 = 1.0F;
		this.aFloat2497 = 1.0F;
		this.aFloat2494 = 1.0F;
		this.aFloat2492 = f;
		this.aFloat2503 = f_38_;
		this.aFloat2493 = f_39_;
	}

	void method2063(Vector3f class217) {
		translate(class217.x, class217.y, class217.z);
	}

	public void translate(float f, float f_40_, float f_41_) {
		this.aFloat2492 += f;
		this.aFloat2503 += f_40_;
		this.aFloat2493 += f_41_;
	}

	public void method2065(float f, float f_42_, float f_43_) {
		this.aFloat2494 = f;
		this.aFloat2496 = 0.0F;
		this.aFloat2499 = 0.0F;
		this.aFloat2492 = 0.0F;
		this.aFloat2502 = 0.0F;
		this.aFloat2497 = f_42_;
		this.aFloat2500 = 0.0F;
		this.aFloat2503 = 0.0F;
		this.aFloat2495 = 0.0F;
		this.aFloat2498 = 0.0F;
		this.aFloat2501 = f_43_;
		this.aFloat2493 = 0.0F;
	}

	public void method2066(float f, float f_44_, float f_45_, float[] fs) {
		f -= this.aFloat2492;
		f_44_ -= this.aFloat2503;
		f_45_ -= this.aFloat2493;
		fs[0] = (float) (int) (this.aFloat2494 * f + this.aFloat2502 * f_44_ + this.aFloat2495 * f_45_);
		fs[1] = (float) (int) (this.aFloat2496 * f + this.aFloat2497 * f_44_ + this.aFloat2498 * f_45_);
		fs[2] = (float) (int) (this.aFloat2499 * f + this.aFloat2500 * f_44_ + this.aFloat2501 * f_45_);
	}

	public float[] method2067(float[] fs) {
		fs[0] = this.aFloat2492;
		fs[1] = this.aFloat2503;
		fs[2] = this.aFloat2493;
		return fs;
	}

	public void method2068(Matrix43f class222_46_, Matrix43f class222_47_) {
		this.aFloat2494 = ((class222_46_.aFloat2494 * class222_47_.aFloat2494) + (class222_46_.aFloat2502 * class222_47_.aFloat2496) + (class222_46_.aFloat2495 * class222_47_.aFloat2499));
		this.aFloat2502 = ((class222_46_.aFloat2494 * class222_47_.aFloat2502) + (class222_46_.aFloat2502 * class222_47_.aFloat2497) + (class222_46_.aFloat2495 * class222_47_.aFloat2500));
		this.aFloat2495 = ((class222_46_.aFloat2494 * class222_47_.aFloat2495) + (class222_46_.aFloat2502 * class222_47_.aFloat2498) + (class222_46_.aFloat2495 * class222_47_.aFloat2501));
		this.aFloat2496 = ((class222_46_.aFloat2496 * class222_47_.aFloat2494) + (class222_46_.aFloat2497 * class222_47_.aFloat2496) + (class222_46_.aFloat2498 * class222_47_.aFloat2499));
		this.aFloat2497 = ((class222_46_.aFloat2496 * class222_47_.aFloat2502) + (class222_46_.aFloat2497 * class222_47_.aFloat2497) + (class222_46_.aFloat2498 * class222_47_.aFloat2500));
		this.aFloat2498 = ((class222_46_.aFloat2496 * class222_47_.aFloat2495) + (class222_46_.aFloat2497 * class222_47_.aFloat2498) + (class222_46_.aFloat2498 * class222_47_.aFloat2501));
		this.aFloat2499 = ((class222_46_.aFloat2499 * class222_47_.aFloat2494) + (class222_46_.aFloat2500 * class222_47_.aFloat2496) + (class222_46_.aFloat2501 * class222_47_.aFloat2499));
		this.aFloat2500 = ((class222_46_.aFloat2499 * class222_47_.aFloat2502) + (class222_46_.aFloat2500 * class222_47_.aFloat2497) + (class222_46_.aFloat2501 * class222_47_.aFloat2500));
		this.aFloat2501 = ((class222_46_.aFloat2499 * class222_47_.aFloat2495) + (class222_46_.aFloat2500 * class222_47_.aFloat2498) + (class222_46_.aFloat2501 * class222_47_.aFloat2501));
		this.aFloat2492 = ((class222_46_.aFloat2492 * class222_47_.aFloat2494) + (class222_46_.aFloat2503 * class222_47_.aFloat2496) + (class222_46_.aFloat2493 * class222_47_.aFloat2499) + class222_47_.aFloat2492);
		this.aFloat2503 = ((class222_46_.aFloat2492 * class222_47_.aFloat2502) + (class222_46_.aFloat2503 * class222_47_.aFloat2497) + (class222_46_.aFloat2493 * class222_47_.aFloat2500) + class222_47_.aFloat2503);
		this.aFloat2493 = ((class222_46_.aFloat2492 * class222_47_.aFloat2495) + (class222_46_.aFloat2503 * class222_47_.aFloat2498) + (class222_46_.aFloat2493 * class222_47_.aFloat2501) + class222_47_.aFloat2493);
	}

	public void method2069(float[] fs) {
		float f = fs[0] - this.aFloat2492;
		float f_48_ = fs[1] - this.aFloat2503;
		float f_49_ = fs[2] - this.aFloat2493;
		fs[0] = (float) (int) (this.aFloat2494 * f + this.aFloat2502 * f_48_ + this.aFloat2495 * f_49_);
		fs[1] = (float) (int) (this.aFloat2496 * f + this.aFloat2497 * f_48_ + this.aFloat2498 * f_49_);
		fs[2] = (float) (int) (this.aFloat2499 * f + this.aFloat2500 * f_48_ + this.aFloat2501 * f_49_);
	}

	public void copy(Matrix43f class222_50_) {
		this.aFloat2494 = class222_50_.aFloat2494;
		this.aFloat2496 = class222_50_.aFloat2496;
		this.aFloat2499 = class222_50_.aFloat2499;
		this.aFloat2492 = class222_50_.aFloat2492;
		this.aFloat2502 = class222_50_.aFloat2502;
		this.aFloat2497 = class222_50_.aFloat2497;
		this.aFloat2500 = class222_50_.aFloat2500;
		this.aFloat2503 = class222_50_.aFloat2503;
		this.aFloat2495 = class222_50_.aFloat2495;
		this.aFloat2498 = class222_50_.aFloat2498;
		this.aFloat2501 = class222_50_.aFloat2501;
		this.aFloat2493 = class222_50_.aFloat2493;
	}

	public void rotate(float f, float f_51_, float f_52_, float f_53_) {
		float f_54_ = (float) Math.cos((double) f_53_);
		float f_55_ = (float) Math.sin((double) f_53_);
		float f_56_ = f_54_ + f * f * (1.0F - f_54_);
		float f_57_ = f_52_ * f_55_ + f_51_ * f * (1.0F - f_54_);
		float f_58_ = -f_51_ * f_55_ + f_52_ * f * (1.0F - f_54_);
		float f_59_ = -f_52_ * f_55_ + f * f_51_ * (1.0F - f_54_);
		float f_60_ = f_54_ + f_51_ * f_51_ * (1.0F - f_54_);
		float f_61_ = f * f_55_ + f_52_ * f_51_ * (1.0F - f_54_);
		float f_62_ = f_51_ * f_55_ + f * f_52_ * (1.0F - f_54_);
		float f_63_ = -f * f_55_ + f_51_ * f_52_ * (1.0F - f_54_);
		float f_64_ = f_54_ + f_52_ * f_52_ * (1.0F - f_54_);
		float f_65_ = this.aFloat2494;
		float f_66_ = this.aFloat2502;
		float f_67_ = this.aFloat2496;
		float f_68_ = this.aFloat2497;
		float f_69_ = this.aFloat2499;
		float f_70_ = this.aFloat2500;
		float f_71_ = this.aFloat2492;
		float f_72_ = this.aFloat2503;
		this.aFloat2494 = (f_65_ * f_56_ + f_66_ * f_59_ + this.aFloat2495 * f_62_);
		this.aFloat2502 = (f_65_ * f_57_ + f_66_ * f_60_ + this.aFloat2495 * f_63_);
		this.aFloat2495 = (f_65_ * f_58_ + f_66_ * f_61_ + this.aFloat2495 * f_64_);
		this.aFloat2496 = (f_67_ * f_56_ + f_68_ * f_59_ + this.aFloat2498 * f_62_);
		this.aFloat2497 = (f_67_ * f_57_ + f_68_ * f_60_ + this.aFloat2498 * f_63_);
		this.aFloat2498 = (f_67_ * f_58_ + f_68_ * f_61_ + this.aFloat2498 * f_64_);
		this.aFloat2499 = (f_69_ * f_56_ + f_70_ * f_59_ + this.aFloat2501 * f_62_);
		this.aFloat2500 = (f_69_ * f_57_ + f_70_ * f_60_ + this.aFloat2501 * f_63_);
		this.aFloat2501 = (f_69_ * f_58_ + f_70_ * f_61_ + this.aFloat2501 * f_64_);
		this.aFloat2492 = (f_71_ * f_56_ + f_72_ * f_59_ + this.aFloat2493 * f_62_);
		this.aFloat2503 = (f_71_ * f_57_ + f_72_ * f_60_ + this.aFloat2493 * f_63_);
		this.aFloat2493 = (f_71_ * f_58_ + f_72_ * f_61_ + this.aFloat2493 * f_64_);
	}

	void method2072(Quaternion quaternion) {
		method2060(quaternion.aFloat2461, quaternion.aFloat2458, quaternion.aFloat2462, quaternion.aFloat2463);
	}

	public void method2073(Matrix43f class222_73_) {
		float f = this.aFloat2494;
		float f_74_ = this.aFloat2502;
		float f_75_ = this.aFloat2496;
		float f_76_ = this.aFloat2497;
		float f_77_ = this.aFloat2499;
		float f_78_ = this.aFloat2500;
		float f_79_ = this.aFloat2492;
		float f_80_ = this.aFloat2503;
		float f_81_ = this.aFloat2495;
		float f_82_ = this.aFloat2498;
		float f_83_ = this.aFloat2501;
		float f_84_ = this.aFloat2493;
		this.aFloat2494 = (f * class222_73_.aFloat2494 + f_74_ * class222_73_.aFloat2496 + f_81_ * class222_73_.aFloat2499);
		this.aFloat2502 = (f * class222_73_.aFloat2502 + f_74_ * class222_73_.aFloat2497 + f_81_ * class222_73_.aFloat2500);
		this.aFloat2495 = (f * class222_73_.aFloat2495 + f_74_ * class222_73_.aFloat2498 + f_81_ * class222_73_.aFloat2501);
		this.aFloat2496 = (f_75_ * class222_73_.aFloat2494 + f_76_ * class222_73_.aFloat2496 + f_82_ * class222_73_.aFloat2499);
		this.aFloat2497 = (f_75_ * class222_73_.aFloat2502 + f_76_ * class222_73_.aFloat2497 + f_82_ * class222_73_.aFloat2500);
		this.aFloat2498 = (f_75_ * class222_73_.aFloat2495 + f_76_ * class222_73_.aFloat2498 + f_82_ * class222_73_.aFloat2501);
		this.aFloat2499 = (f_77_ * class222_73_.aFloat2494 + f_78_ * class222_73_.aFloat2496 + f_83_ * class222_73_.aFloat2499);
		this.aFloat2500 = (f_77_ * class222_73_.aFloat2502 + f_78_ * class222_73_.aFloat2497 + f_83_ * class222_73_.aFloat2500);
		this.aFloat2501 = (f_77_ * class222_73_.aFloat2495 + f_78_ * class222_73_.aFloat2498 + f_83_ * class222_73_.aFloat2501);
		this.aFloat2492 = (f_79_ * class222_73_.aFloat2494 + f_80_ * class222_73_.aFloat2496 + f_84_ * class222_73_.aFloat2499 + class222_73_.aFloat2492);
		this.aFloat2503 = (f_79_ * class222_73_.aFloat2502 + f_80_ * class222_73_.aFloat2497 + f_84_ * class222_73_.aFloat2500 + class222_73_.aFloat2503);
		this.aFloat2493 = (f_79_ * class222_73_.aFloat2495 + f_80_ * class222_73_.aFloat2498 + f_84_ * class222_73_.aFloat2501 + class222_73_.aFloat2493);
	}

	public void method2074(Matrix43f class222_85_) {
		if (class222_85_ == this)
			method2058();
		else {
			this.aFloat2494 = class222_85_.aFloat2494;
			this.aFloat2496 = class222_85_.aFloat2502;
			this.aFloat2499 = class222_85_.aFloat2495;
			this.aFloat2502 = class222_85_.aFloat2496;
			this.aFloat2497 = class222_85_.aFloat2497;
			this.aFloat2500 = class222_85_.aFloat2498;
			this.aFloat2495 = class222_85_.aFloat2499;
			this.aFloat2498 = class222_85_.aFloat2500;
			this.aFloat2501 = class222_85_.aFloat2501;
			this.aFloat2492 = -((class222_85_.aFloat2492 * this.aFloat2494) + (class222_85_.aFloat2503 * this.aFloat2496) + (class222_85_.aFloat2493 * this.aFloat2499));
			this.aFloat2503 = -((class222_85_.aFloat2492 * this.aFloat2502) + (class222_85_.aFloat2503 * this.aFloat2497) + (class222_85_.aFloat2493 * this.aFloat2500));
			this.aFloat2493 = -((class222_85_.aFloat2492 * this.aFloat2495) + (class222_85_.aFloat2503 * this.aFloat2498) + (class222_85_.aFloat2493 * this.aFloat2501));
		}
	}

	public void method2075(float[] fs) {
		float f = fs[0];
		float f_86_ = fs[1];
		float f_87_ = fs[2];
		fs[0] = (this.aFloat2494 * f + this.aFloat2502 * f_86_ + this.aFloat2495 * f_87_);
		fs[1] = (this.aFloat2496 * f + this.aFloat2497 * f_86_ + this.aFloat2498 * f_87_);
		fs[2] = (this.aFloat2499 * f + this.aFloat2500 * f_86_ + this.aFloat2501 * f_87_);
	}

	public void method2076(Class235 class235) {
		float f = (class235.aQuaternion_2600.aFloat2463 * class235.aQuaternion_2600.aFloat2463);
		float f_88_ = (class235.aQuaternion_2600.aFloat2463 * class235.aQuaternion_2600.aFloat2461);
		float f_89_ = (class235.aQuaternion_2600.aFloat2463 * class235.aQuaternion_2600.aFloat2458);
		float f_90_ = (class235.aQuaternion_2600.aFloat2463 * class235.aQuaternion_2600.aFloat2462);
		float f_91_ = (class235.aQuaternion_2600.aFloat2461 * class235.aQuaternion_2600.aFloat2461);
		float f_92_ = (class235.aQuaternion_2600.aFloat2461 * class235.aQuaternion_2600.aFloat2458);
		float f_93_ = (class235.aQuaternion_2600.aFloat2461 * class235.aQuaternion_2600.aFloat2462);
		float f_94_ = (class235.aQuaternion_2600.aFloat2458 * class235.aQuaternion_2600.aFloat2458);
		float f_95_ = (class235.aQuaternion_2600.aFloat2458 * class235.aQuaternion_2600.aFloat2462);
		float f_96_ = (class235.aQuaternion_2600.aFloat2462 * class235.aQuaternion_2600.aFloat2462);
		this.aFloat2494 = f_91_ + f - f_96_ - f_94_;
		this.aFloat2502 = f_92_ + f_90_ + f_92_ + f_90_;
		this.aFloat2495 = f_93_ - f_89_ - f_89_ + f_93_;
		this.aFloat2496 = f_92_ - f_90_ - f_90_ + f_92_;
		this.aFloat2497 = f_94_ + f - f_91_ - f_96_;
		this.aFloat2498 = f_95_ + f_88_ + f_95_ + f_88_;
		this.aFloat2499 = f_93_ + f_89_ + f_93_ + f_89_;
		this.aFloat2500 = f_95_ - f_88_ - f_88_ + f_95_;
		this.aFloat2501 = f_96_ + f - f_94_ - f_91_;
		this.aFloat2492 = class235.trans.x;
		this.aFloat2503 = class235.trans.y;
		this.aFloat2493 = class235.trans.z;
	}

	public void method2077(float x, float y, float z, float[] verticies) {
		verticies[0] = (this.aFloat2494 * x + this.aFloat2496 * y + this.aFloat2499 * z + this.aFloat2492);
		verticies[1] = (this.aFloat2502 * x + this.aFloat2497 * y + this.aFloat2500 * z + this.aFloat2503);
		verticies[2] = (this.aFloat2495 * x + this.aFloat2498 * y + this.aFloat2501 * z + this.aFloat2493);
	}
}
