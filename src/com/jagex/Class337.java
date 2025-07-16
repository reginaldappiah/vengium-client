package com.jagex;/* Class337 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.Js5Configs;

public class Class337 {
	static Class337 aClass337_3624;
	static Class337 aClass337_3625;
	int anInt3626;
	static Class337 aClass337_3627 = new Class337(0);

	static {
		aClass337_3625 = new Class337(1);
		aClass337_3624 = new Class337(2);
	}

	Class337(int i) {
		this.anInt3626 = i * 11911155;
	}

	static final void method4109(ScriptRuntime class403, int i) {
		try {
			int i_0_ = (class403.integerstack[class403.integerPos * 1883543357]);
			Class376 class376 = Class299.aClass370_3199.method4576(i_0_, -1387183809);
			if (null == class376)
				throw new RuntimeException();
			Integer integer = (class403.aClass162_5252.method1754((GameClient.game.id * -937307905 << 16 | class376.anInt4086 * -1808461691), class376.anInt4087 * -2047408817, class376.anInt4088 * -530058953, -1943222730));
			int i_1_;
			if (integer == null)
				i_1_ = 0;
			else
				i_1_ = integer.intValue();
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = i_1_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ob.bh(").append(')').toString());
		}
	}

	static final void method4110(ScriptRuntime runtime) {
		try {
			IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
			IComponentDefinition class105 = IComponentScripter.componentDefinition;
			IComponentDefinitionCollection IComponentDefinitionCollection = IComponentScripter.IComponentDefinitionCollection;
			ToMoveIComponentScripts.setIComponentHiddenInstruction(class105, IComponentDefinitionCollection, runtime);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ob.ca(").append(')').toString());
		}
	}

	static final void method4111(ScriptRuntime class403, byte i) {
		try {
			int i_2_ = (class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]);
			IComponentDefinition class105 = IComponentDefinition.getInterfaceComponent(i_2_);
			IComponentDefinitionCollection IComponentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[i_2_ >> 16];
			ToMoveIComponentScripts.method2787(class105, class403);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ob.fb(").append(')').toString());
		}
	}

	static final void method4112(ScriptRuntime class403, int i) {
		try {
			int i_3_ = (class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]);
			ItemDefinition class468 = Js5Configs.itemList.getItemDefinitions(i_3_);
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = class468.hasCustomColor ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ob.aba(").append(')').toString());
		}
	}

	static Class337 method2789(int i) {
        Class337[] class337s = SubIncommingPacket.method1920(-1851883668);
        for (int i_43_ = 0; i_43_ < class337s.length; i_43_++) {
            Class337 class337 = class337s[i_43_];
            if (class337.anInt3626 * 1161031995 == i) return class337;
        }
        return null;
    }
}
