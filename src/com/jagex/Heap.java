package com.jagex;/* Class_v - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Heap extends Node {

    Heap() {
		/* empty */
	}

	static final void method3669(ScriptRuntime runtime) {
		try {
			int i_0_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
			if (i_0_ >= 1 && i_0_ <= 2)
				Class357.method4276(i_0_, -1, -1, false);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("v.aff(").append(')').toString());
		}
	}

	public static void method3670(Player player) {
		try {
			NotDefinition class298_sub41 = ((NotDefinition) (NotDefinition.aClass437_7440.get((long) (1888274983 * player.entityIndex))));
			if (null != class298_sub41) {
				if (null != (class298_sub41.aClass298_Sub19_Sub2_7447)) {
					Class285.aClass298_Sub19_Sub4_3083.method3048(class298_sub41.aClass298_Sub19_Sub2_7447);
					class298_sub41.aClass298_Sub19_Sub2_7447 = null;
				}
				class298_sub41.unlink();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("v.d(").append(')').toString());
		}
	}

	static final void method3671(ScriptRuntime class403, int i) {
		try {
			class403.entity.method4431((class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]));
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("v.aoi(").append(')').toString());
		}
	}

	static void method3672(int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
		try {
			int i_7_ = StaticMethods.method6012(i_2_, Class372_Sub3.anInt4049 * 1155384281, Class372_Sub3.anInt4050 * -1062447355);
			int i_8_ = StaticMethods.method6012(i_3_, Class372_Sub3.anInt4049 * 1155384281, Class372_Sub3.anInt4050 * -1062447355);
			int i_9_ = StaticMethods.method6012(i, Class372_Sub3.anInt4051 * -1424479739, Class372_Sub3.anInt4048 * 1135094847);
			int i_10_ = StaticMethods.method6012(i_1_, -1424479739 * Class372_Sub3.anInt4051, Class372_Sub3.anInt4048 * 1135094847);
			int i_11_ = StaticMethods.method6012(i_2_ + i_5_, 1155384281 * Class372_Sub3.anInt4049, Class372_Sub3.anInt4050 * -1062447355);
			int i_12_ = StaticMethods.method6012(i_3_ - i_5_, Class372_Sub3.anInt4049 * 1155384281, -1062447355 * Class372_Sub3.anInt4050);
			for (int i_13_ = i_7_; i_13_ < i_11_; i_13_++)
				Class82_Sub22.method940((Class372_Sub3.anIntArrayArray4047[i_13_]), i_9_, i_10_, i_4_);
			for (int i_14_ = i_8_; i_14_ > i_12_; i_14_--)
				Class82_Sub22.method940((Class372_Sub3.anIntArrayArray4047[i_14_]), i_9_, i_10_, i_4_);
			int i_15_ = StaticMethods.method6012(i_5_ + i, -1424479739 * Class372_Sub3.anInt4051, Class372_Sub3.anInt4048 * 1135094847);
			int i_16_ = StaticMethods.method6012(i_1_ - i_5_, Class372_Sub3.anInt4051 * -1424479739, Class372_Sub3.anInt4048 * 1135094847);
			for (int i_17_ = i_11_; i_17_ <= i_12_; i_17_++) {
				int[] is = Class372_Sub3.anIntArrayArray4047[i_17_];
				Class82_Sub22.method940(is, i_9_, i_15_, i_4_);
				Class82_Sub22.method940(is, i_16_, i_10_, i_4_);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("v.t(").append(')').toString());
		}
	}

	static void method3673() {
		try {
			Class8.aBoolean108 = false;
			StaticMethods.method4301();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("v.p(").append(')').toString());
		}
	}
}
