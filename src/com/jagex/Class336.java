package com.jagex;/* Class336 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class336 {
	public int toY;
	public int toX;
	public int sizeX;
	public int sizeY;

    public static Class336 method3963(int i, int i_3_, int i_4_, int i_5_, int i_6_) {
            Class315.aClass336_Sub3_3310.toX = i * -760677635;
            Class315.aClass336_Sub3_3310.toY = i_3_ * 167105303;
            Class315.aClass336_Sub3_3310.sizeX = i_4_ * -1544157451;
            Class315.aClass336_Sub3_3310.sizeY = i_5_ * -1468199503;
            Class315.aClass336_Sub3_3310.anInt7715 = 89792661 * i_6_;
            return Class315.aClass336_Sub3_3310;
    }

    public abstract boolean method4089(int i, int i_0_, int i_1_, Class289 class289);

	Class336() {
		/* empty */
	}

	public abstract boolean method4090(int i, int i_2_, int i_3_, Class289 class289, int i_4_);

	public abstract boolean method4091(int i, int i_5_, int i_6_, Class289 class289);

	static final void method4092(ScriptRuntime class403, int i) {
		try {
			class403.objectArgs -= 1938723502;
			String string = (String) (class403.objectStack[class403.objectArgs * -203050393]);
			String string_7_ = ((String) (class403.objectStack[-203050393 * class403.objectArgs + 1]));
			if ((class403.integerStack[(class403.integerStackOffset -= -391880689) * 681479919]) == 1)
				class403.objectStack[((class403.objectArgs += 969361751) * -203050393) - 1] = string;
			else
				class403.objectStack[((class403.objectArgs += 969361751) * -203050393) - 1] = string_7_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("nz.zj(").append(')').toString());
		}
	}

	static void method4093(Class326[][][] class326s, int i) {
		try {
			for (int i_8_ = 0; i_8_ < class326s.length; i_8_++) {
				Class326[][] class326s_9_ = class326s[i_8_];
				for (int i_10_ = 0; i_10_ < class326s_9_.length; i_10_++) {
					for (int i_11_ = 0; i_11_ < class326s_9_[i_10_].length; i_11_++) {
						Class326 class326 = class326s_9_[i_10_][i_11_];
						if (null == class326) {
							if (i >= 257433765)
								return;
						} else {
							if (class326.aClass365_Sub1_Sub2_3461 instanceof SceneObject)
								((SceneObject) class326.aClass365_Sub1_Sub2_3461).method31();
							if (class326.aClass365_Sub1_Sub3_3459 instanceof SceneObject)
								((SceneObject) class326.aClass365_Sub1_Sub3_3459).method31();
							if (class326.aClass365_Sub1_Sub3_3460 instanceof SceneObject)
								((SceneObject) class326.aClass365_Sub1_Sub3_3460).method31();
							if (class326.aClass365_Sub1_Sub5_3457 instanceof SceneObject)
								((SceneObject) class326.aClass365_Sub1_Sub5_3457).method31();
							if (class326.aClass365_Sub1_Sub5_3458 instanceof SceneObject)
								((SceneObject) class326.aClass365_Sub1_Sub5_3458).method31();
							for (Class322 class322 = class326.aClass322_3456; class322 != null; class322 = class322.aClass322_3360) {
								Class365_Sub1_Sub1 class365_sub1_sub1 = class322.aClass365_Sub1_Sub1_3359;
								if (class365_sub1_sub1 instanceof SceneObject)
									((SceneObject) class365_sub1_sub1).method31();
							}
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("nz.f(").append(')').toString());
		}
	}

	static final void method4094(ScriptRuntime runtime) {
		try {
			int i_12_ = GameClient.linkedList.getSize();
			if (-1 != -257444687 * GameClient.WINDOW_PANE_ID)
				i_12_++;
			runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = i_12_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("nz.alp(").append(')').toString());
		}
	}

	public static void method4095(int i, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_, int i_18_, int i_19_, int i_20_) {
		try {
			if (i < Class372_Sub2_Sub1.anInt4051 * -1424479739 || i > Class372_Sub2_Sub1.anInt4048 * 1135094847 || i_14_ < Class372_Sub2_Sub1.anInt4051 * -1424479739 || i_14_ > Class372_Sub2_Sub1.anInt4048 * 1135094847 || i_16_ < -1424479739 * Class372_Sub2_Sub1.anInt4051 || i_16_ > Class372_Sub2_Sub1.anInt4048 * 1135094847 || i_18_ < -1424479739 * Class372_Sub2_Sub1.anInt4051 || i_18_ > 1135094847 * Class372_Sub2_Sub1.anInt4048 || i_13_ < 1155384281 * Class372_Sub2_Sub1.anInt4049 || i_13_ > -1062447355 * Class372_Sub2_Sub1.anInt4050 || i_15_ < Class372_Sub2_Sub1.anInt4049 * 1155384281 || i_15_ > Class372_Sub2_Sub1.anInt4050 * -1062447355 || i_17_ < Class372_Sub2_Sub1.anInt4049 * 1155384281 || i_17_ > Class372_Sub2_Sub1.anInt4050 * -1062447355 || i_19_ < Class372_Sub2_Sub1.anInt4049 * 1155384281 || i_19_ > Class372_Sub2_Sub1.anInt4050 * -1062447355)
				Class302.method3718(i, i_13_, i_14_, i_15_, i_16_, i_17_, i_18_, i_19_, i_20_, 1173232309);
			else
				Class293.method2824(i, i_13_, i_14_, i_15_, i_16_, i_17_, i_18_, i_19_, i_20_, (byte) -73);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("nz.l(").append(')').toString());
		}
	}
}
