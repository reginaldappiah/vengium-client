package com.jagex;/* Class57 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class SpriteToolkit implements ISpriteMetrics {

	final void method620(float f, float f_0_, float f_1_, float f_2_, float f_3_, float f_4_, ToolkitLoader toolkitLoader, int i, int i_5_) {
		method644(f, f_0_, f_1_, f_2_, f_3_, f_4_, 1, toolkitLoader, i, i_5_);
	}

	public abstract void method621(int i, int i_6_, int i_7_, int i_8_);

	public abstract void method622(int[] is);

	public abstract int getWidth();

	public abstract int getHeight();

	public abstract int getPaddedHeight();

	public abstract Interface8_Impl1_Impl1 method627();

	public abstract void draw(int i, int i_24_, int i_25_, int i_26_, int i_27_);

	public abstract void method632(int i, int i_28_, int i_29_);

	public final void drawScaled(int i, int i_30_, int i_31_, int i_32_) {
		method635(i, i_30_, i_31_, i_32_, 1, 0, 1, 1);
	}

	public final void method691(int i, int i_33_, int i_34_, int i_35_, int i_36_, int i_37_, int i_38_) {
		method635(i, i_33_, i_34_, i_35_, i_36_, i_37_, i_38_, 1);
	}

	abstract void method635(int i, int i_39_, int i_40_, int i_41_, int i_42_, int i_43_, int i_44_, int i_45_);

	public final void drawRepeat(int i, int i_46_, int i_47_, int i_48_) {
		method694(i, i_46_, i_47_, i_48_, 1, 0, 1);
	}

	public abstract int getPaddedWidth();

	final void method637(float f, float f_49_, float f_50_, float f_51_, int i, int i_52_, int i_53_, int i_54_, int i_55_) {
		if (i != 0) {
			double d = (double) (i_52_ & 0xffff) * 9.587379924285257E-5;
			float f_56_ = (float) Math.sin(d) * (float) i;
			float f_57_ = (float) Math.cos(d) * (float) i;
			float f_58_ = (-f_50_ * f_57_ + -f_51_ * f_56_) / 4096.0F + f;
			float f_59_ = (--f_50_ * f_56_ + -f_51_ * f_57_) / 4096.0F + f_49_;
			float f_60_ = ((((float) getPaddedWidth() - f_50_) * f_57_ + -f_51_ * f_56_) / 4096.0F + f);
			float f_61_ = ((-((float) getPaddedWidth() - f_50_) * f_56_ + -f_51_ * f_57_) / 4096.0F + f_49_);
			float f_62_ = ((-f_50_ * f_57_ + ((float) getPaddedHeight() - f_51_) * f_56_) / 4096.0F + f);
			float f_63_ = ((--f_50_ * f_56_ + ((float) getPaddedHeight() - f_51_) * f_57_) / 4096.0F + f_49_);
			method641(f_58_, f_59_, f_60_, f_61_, f_62_, f_63_, i_53_, i_54_, i_55_);
		}
	}

	public final void method686(float f, float f_64_, int i, int i_65_, int i_66_, int i_67_, int i_68_) {
		method637(f, f_64_, (float) getPaddedWidth() / 2.0F, (float) getPaddedHeight() / 2.0F, i, i_65_, i_66_, i_67_, i_68_);
	}

	public final void method639(float f, float f_69_, int i, int i_70_, ToolkitLoader toolkitLoader, int i_71_, int i_72_) {
		method659(f, f_69_, (float) getPaddedWidth() / 2.0F, (float) getPaddedHeight() / 2.0F, i, i_70_, toolkitLoader, i_71_, i_72_);
	}

	public final void method641(float f, float f_73_, float f_74_, float f_75_, float f_76_, float f_77_, int i, int i_78_, int i_79_) {
		method642(f, f_73_, f_74_, f_75_, f_76_, f_77_, i, i_78_, i_79_, 1);
	}

	abstract void method642(float f, float f_80_, float f_81_, float f_82_, float f_83_, float f_84_, int i, int i_85_, int i_86_, int i_87_);

	abstract void method644(float f, float f_92_, float f_93_, float f_94_, float f_95_, float f_96_, int i, ToolkitLoader toolkitLoader, int i_97_, int i_98_);

	public final void draw(int i, int i_99_) {
		draw(i, i_99_, 1, 0, 1);
	}

	public abstract void method654(int i, int i_125_, ToolkitLoader toolkitLoader, int i_126_, int i_127_);

	public final void method659(float f, float f_139_, float f_140_, float f_141_, int i, int i_142_, ToolkitLoader toolkitLoader, int i_143_, int i_144_) {
		if (i != 0) {
			double d = (double) (i_142_ & 0xffff) * 9.587379924285257E-5;
			float f_145_ = (float) Math.sin(d) * (float) i;
			float f_146_ = (float) Math.cos(d) * (float) i;
			float f_147_ = (-f_140_ * f_146_ + -f_141_ * f_145_) / 4096.0F + f;
			float f_148_ = (--f_140_ * f_145_ + -f_141_ * f_146_) / 4096.0F + f_139_;
			float f_149_ = ((((float) getPaddedWidth() - f_140_) * f_146_ + -f_141_ * f_145_) / 4096.0F + f);
			float f_150_ = ((-((float) getPaddedWidth() - f_140_) * f_145_ + -f_141_ * f_146_) / 4096.0F + f_139_);
			float f_151_ = ((-f_140_ * f_146_ + ((float) getPaddedHeight() - f_141_) * f_145_) / 4096.0F + f);
			float f_152_ = ((--f_140_ * f_145_ + ((float) getPaddedHeight() - f_141_) * f_146_) / 4096.0F + f_139_);
			method620(f_147_, f_148_, f_149_, f_150_, f_151_, f_152_, toolkitLoader, i_143_, i_144_);
		}
	}

	public abstract void method694(int i, int i_165_, int i_166_, int i_167_, int i_168_, int i_169_, int i_170_);

	SpriteToolkit() {
		/* empty */
	}

	public final void drawRotatedScaled(float f, float f_221_, int i, int i_222_) {
		method637(f, f_221_, (float) getPaddedWidth() / 2.0F, (float) getPaddedHeight() / 2.0F, i, i_222_, 1, 0, 1);
	}

	public abstract void method675(int i, int i_227_, int i_228_, int i_229_, int i_230_, int i_231_);

}
