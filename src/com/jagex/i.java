package com.jagex;/* i - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class i extends FloorToolkit implements Interface25 {
	SSEGraphicsToolkit aSSEGraphicsToolkit6678;
	long nativeid;
	Class453 aClass453_6679 = new Class453();

	i(SSEGraphicsToolkit var_SSEGraphicsToolkit, ba var_ba, int i, int i_0_, int[][] is, int[][] is_1_, int i_2_, int i_3_, int i_4_) {
		super(i, i_0_, i_2_, is);
		this.aSSEGraphicsToolkit6678 = var_SSEGraphicsToolkit;
		G(this.aSSEGraphicsToolkit6678, var_ba, i, i_0_, anIntArrayArray6290, is_1_, i_2_, i_3_, i_4_);
	}

    native void ay(int i, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_, int[] is);

	public native void ma(boolean bool);

	public native void LA(int i, int i_18_, int i_19_);

	public native void SA();

	native void ya(int i, int i_20_, int[] is, int[] is_21_, int[] is_22_, int[] is_23_, int[] is_24_, int[] is_25_, int[] is_26_, int[] is_27_, int i_28_, int i_29_, int i_30_, boolean bool);

	native void ab(int i, int i_31_, int[] is, int[] is_32_, int[] is_33_, int[] is_34_, int[] is_35_, int[] is_36_, int[] is_37_, int[] is_38_, int i_39_, int i_40_, int i_41_, boolean bool);

	public void method6336(int i, int i_42_, int[] is, int[] is_43_, int[] is_44_, int[] is_45_, int[] is_46_, int[] is_47_, int[] is_48_, int[] is_49_, int[] is_50_, int[] is_51_, int[] is_52_, Class78 class78, boolean bool) {
		boolean bool_53_ = false;
		if (is_49_ != null) {
			int[] is_54_ = is_49_;
			for (int i_55_ = 0; i_55_ < is_54_.length; i_55_++) {
				int i_56_ = is_54_[i_55_];
				if (i_56_ != -1) {
					bool_53_ = true;
					break;
				}
			}
		}
		int i_57_ = is_49_.length;
		int[] is_58_ = new int[i_57_ * 3];
		int[] is_59_ = new int[i_57_ * 3];
		int[] is_60_ = new int[i_57_ * 3];
		int[] is_61_ = new int[i_57_ * 3];
		int[] is_62_ = new int[i_57_ * 3];
		int[] is_63_ = is_50_ != null ? new int[i_57_ * 3] : null;
		int[] is_64_ = is_43_ != null ? new int[i_57_ * 3] : null;
		int[] is_65_ = is_45_ != null ? new int[i_57_ * 3] : null;
		int i_66_ = 0;
		for (int i_67_ = 0; i_67_ < i_57_; i_67_++) {
			int i_68_ = is_46_[i_67_];
			int i_69_ = is_47_[i_67_];
			int i_70_ = is_48_[i_67_];
			is_58_[i_66_] = is[i_68_];
			is_59_[i_66_] = is_44_[i_68_];
			is_60_[i_66_] = is_49_[i_67_];
			is_61_[i_66_] = is_51_[i_67_];
			is_62_[i_66_] = is_52_[i_67_];
			if (is_50_ != null)
				is_63_[i_66_] = is_50_[i_67_];
			if (is_43_ != null)
				is_64_[i_66_] = is_43_[i_68_];
			if (is_45_ != null)
				is_65_[i_66_] = is_45_[i_68_];
			i_66_++;
			is_58_[i_66_] = is[i_69_];
			is_59_[i_66_] = is_44_[i_69_];
			is_60_[i_66_] = is_49_[i_67_];
			is_61_[i_66_] = is_51_[i_67_];
			is_62_[i_66_] = is_52_[i_67_];
			if (is_50_ != null)
				is_63_[i_66_] = is_50_[i_67_];
			if (is_43_ != null)
				is_64_[i_66_] = is_43_[i_69_];
			if (is_45_ != null)
				is_65_[i_66_] = is_45_[i_69_];
			i_66_++;
			is_58_[i_66_] = is[i_70_];
			is_59_[i_66_] = is_44_[i_70_];
			is_60_[i_66_] = is_49_[i_67_];
			is_61_[i_66_] = is_51_[i_67_];
			is_62_[i_66_] = is_52_[i_67_];
			if (is_50_ != null)
				is_63_[i_66_] = is_50_[i_67_];
			if (is_43_ != null)
				is_64_[i_66_] = is_43_[i_70_];
			if (is_45_ != null)
				is_65_[i_66_] = is_45_[i_70_];
			i_66_++;
		}
		if (bool_53_ || is_63_ != null)
			ya(i, i_42_, is_58_, is_64_, is_59_, is_65_, is_60_, is_63_, is_61_, is_62_, class78.anInt726 * -1212608691, class78.anInt725 * 1996750669, class78.anInt727 * -1475891183, bool);
	}

	public void method6338(int i, int i_71_, int i_72_, boolean[][] bools, boolean bool, int i_73_) {
		int i_74_ = 0;
		float[] fs = new float[this.aClass453_6679.size2()];
		for (Light class298_sub10 = ((Light) this.aClass453_6679.method5939()); class298_sub10 != null; class298_sub10 = ((Light) this.aClass453_6679.method5944()))
			fs[i_74_++] = class298_sub10.method2901(608404512);
		t(fs);
		for (int i_75_ = 0; i_75_ < i_72_ + i_72_; i_75_++) {
			for (int i_76_ = 0; i_76_ < i_72_ + i_72_; i_76_++) {
				if (bools[i_75_][i_76_]) {
					int i_77_ = i - i_72_ + i_75_;
					int i_78_ = i_71_ - i_72_ + i_76_;
					if (i_77_ >= 0 && i_77_ < anInt6287 * -506105871 && i_78_ >= 0 && i_78_ < anInt6286 * -1148794921)
						this.aSSEGraphicsToolkit6678.method5571().method281(this, i_77_, i_78_);
				}
			}
		}
	}

	public void method6339(int i, int i_79_, int i_80_, int i_81_, int i_82_, int i_83_, int i_84_, boolean[][] bools) {
		this.aSSEGraphicsToolkit6678.method5571().method282(this, i, i_79_, i_80_, i_81_, i_82_, i_83_, i_84_, bools);
	}

	public native Class_na w(int i, int i_85_, Class_na class_na);

	public native void UA(Class_na class_na, int i, int i_86_, int i_87_, int i_88_, boolean bool);

    public boolean method6353(Class_na class_na, int i, int i_95_, int i_96_, int i_97_, boolean bool) {
		return true;
	}

	public void method6342(Light light, int[] is) {
		this.aClass453_6679.pushBack(light);
		A(light.hashCode(), light.method2895(823958259), light.method2894(-2119819308), light.method2897((byte) 45), light.method2900(-672312292), light.method2898(-2045432623), is);
	}

	native void A(int i, int i_98_, int i_99_, int i_100_, int i_101_, int i_102_, int[] is);

	native void t(float[] fs);

    public native void z(boolean bool);

    public final void method6335(int i, int i_114_, int[] is, int[] is_115_, int[] is_116_, int[] is_117_, int[] is_118_, int[] is_119_, int[] is_120_, int[] is_121_, Class78 class78, boolean bool) {
		ya(i, i_114_, is, is_115_, is_116_, is_117_, is_118_, is_119_, is_120_, is_121_, class78.anInt726 * -1212608691, class78.anInt725 * 1996750669, class78.anInt727 * -1475891183, bool);
	}

	native void an(float[] fs);

    public native void NA(Class_na class_na, int i, int i_231_, int i_232_, int i_233_, boolean bool);

    native void au(float[] fs);

	native void ap(SSEGraphicsToolkit var_SSEGraphicsToolkit, ba var_ba, int i, int i_266_, int[][] is, int[][] is_267_, int i_268_, int i_269_, int i_270_);

	native void af(SSEGraphicsToolkit var_SSEGraphicsToolkit, ba var_ba, int i, int i_271_, int[][] is, int[][] is_272_, int i_273_, int i_274_, int i_275_);

	native void aw(SSEGraphicsToolkit var_SSEGraphicsToolkit, ba var_ba, int i, int i_276_, int[][] is, int[][] is_277_, int i_278_, int i_279_, int i_280_);

    native void aj(int i, int i_287_, int[] is, int[] is_288_, int[] is_289_, int[] is_290_, int[] is_291_, int[] is_292_, int[] is_293_, int[] is_294_, int i_295_, int i_296_, int i_297_, boolean bool);

	native void G(SSEGraphicsToolkit var_SSEGraphicsToolkit, ba var_ba, int i, int i_298_, int[][] is, int[][] is_299_, int i_300_, int i_301_, int i_302_);

	native void aq(int i, int i_303_, int i_304_, int i_305_, int i_306_, int i_307_, int[] is);

	native void ag(float[] fs);

}
