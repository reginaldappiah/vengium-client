package com.jagex;/* Class165 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.Js5Configs;

public class Class165 implements Interface5 {
	public int anInt6365;

	public Class146 method49(int i) {
		try {
			return Class146.aClass146_1570;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("gt.f(").append(')').toString());
		}
	}

	public Class146 method50() {
		return Class146.aClass146_1570;
	}

	public Class146 method51() {
		return Class146.aClass146_1570;
	}

	Class165(int i) {
		anInt6365 = i * -1617371261;
	}

	static final void method1781(IComponentDefinition class105, IComponentDefinitionCollection IComponentDefinitionCollection, ScriptRuntime class403, short i) {
		try {
			int i_0_ = (class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]);
			if (class105.anInt1289 * -324971993 != i_0_) {
				class105.anInt1289 = 1025047959 * i_0_;
				StaticMethods.updateComponentTick(class105);
			}
			if (-1 == class105.slot * -1309843523 && !IComponentDefinitionCollection.accessed)
				IComponentUpdateNode.method3720(class105.interfaceHash);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("gt.gs(").append(')').toString());
		}
	}

	static void method1782(long[] ls, Object[] objects, int i, int i_1_, int i_2_) {
		try {
			if (i < i_1_) {
				int i_3_ = (i + i_1_) / 2;
				int i_4_ = i;
				long l = ls[i_3_];
				ls[i_3_] = ls[i_1_];
				ls[i_1_] = l;
				Object object = objects[i_3_];
				objects[i_3_] = objects[i_1_];
				objects[i_1_] = object;
				int i_5_ = 9223372036854775807L == l ? 0 : 1;
				for (int i_6_ = i; i_6_ < i_1_; i_6_++) {
					if (ls[i_6_] < l + (long) (i_6_ & i_5_)) {
						long l_7_ = ls[i_6_];
						ls[i_6_] = ls[i_4_];
						ls[i_4_] = l_7_;
						Object object_8_ = objects[i_6_];
						objects[i_6_] = objects[i_4_];
						objects[i_4_++] = object_8_;
					}
				}
				ls[i_1_] = ls[i_4_];
				ls[i_4_] = l;
				objects[i_1_] = objects[i_4_];
				objects[i_4_] = object;
				method1782(ls, objects, i, i_4_ - 1, 975453798);
				method1782(ls, objects, i_4_ + 1, i_1_, -1825686782);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("gt.q(").append(')').toString());
		}
	}

	static void method1783() {
		try {
			int[] is = new int[(Js5Configs.itemList.itemDefinitionsLength * -888767613)];
			int i_9_ = 0;
			for (int i_10_ = 0; i_10_ < (-888767613 * Js5Configs.itemList.itemDefinitionsLength); i_10_++) {
				ItemDefinition class468 = Js5Configs.itemList.getItemDefinitions(i_10_, true);
				if (1343198193 * class468.maleEquip1 >= 0 || 1585491093 * class468.femaleEquip1 >= 0)
					is[i_9_++] = i_10_;
			}
			FileInflater.anIntArray6274 = new int[i_9_];
			for (int i_11_ = 0; i_11_ < i_9_; i_11_++)
				FileInflater.anIntArray6274[i_11_] = is[i_11_];
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("gt.n(").append(')').toString());
		}
	}

	static final void method1784(ScriptRuntime runtime) {
		try {
			int i_12_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
			IComponentDefinition class105 = IComponentDefinition.getInterfaceComponent(i_12_);
			int i_13_ = -1;
			int i_14_ = -1;
			Class117 class117 = class105.method1116(GameClient.activeGraphicsToolkit);
			if (null != class117) {
				i_13_ = class117.anInt1393 * 1633695381;
				i_14_ = -60174999 * class117.anInt1394;
			}
			runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = i_13_;
			runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = i_14_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("gt.rm(").append(')').toString());
		}
	}
}
