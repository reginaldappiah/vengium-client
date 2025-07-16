package com.jagex;/* Class418 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.quest.QuestType;

public final class Class418 {
	public static int anInt5339;

	Class418() throws Throwable {
		throw new Error();
	}

	static final void method5596(ScriptRuntime class403, byte i) {
		try {
			IComponentDefinition class105 = IComponentDefinition.getInterfaceComponent((class403.integerStack[(class403.integerStackOffset -= -391880689) * 681479919]));
			if (null == class105.sada)
				class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919) - 1] = 0;
			else {
				int i_0_ = class105.sada.length;
				for (int i_1_ = 0; i_1_ < class105.sada.length; i_1_++) {
					if (class105.sada[i_1_] == null) {
						i_0_ = i_1_;
						break;
					}
				}
				class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919) - 1] = i_0_;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ri.ro(").append(')').toString());
		}
	}

	static void method5597(ScriptRuntime runtime) {
		try {
			QuestType questType = Class316.aClass362_3318.getQuestType((runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]));
			runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = (questType.requiredSkills == null ? 0 : questType.requiredSkills.length);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ri.n(").append(')').toString());
		}
	}

	static void method5598(byte i) {
		try {
			Class360.loginType = 471358088;
			Class360.activeConnection = ConnectionType.gameConnection;
			if (null != GameClient.aByteArray8843) {
				Buffer class298_sub53 = new Buffer(GameClient.aByteArray8843);
				Class360.accountName = (class298_sub53.readLong() * -2742373017286080113L);
				Class360.serverKey = (class298_sub53.readLong() * 3207425516430892907L);
			}
			if (Class360.accountName * 122690138525332847L < 0L)
				Class78.method845(35);
			else
				Class460.method5981(false, true, "", "", Class360.accountName * 122690138525332847L);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ri.h(").append(')').toString());
		}
	}

	static final void method5599(ScriptRuntime class403, int i) {
		try {
			int i_2_ = (class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]);
			IComponentDefinition class105 = IComponentDefinition.getInterfaceComponent(i_2_);
			IComponentDefinitionCollection IComponentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[i_2_ >> 16];
			Class372_Sub1.method4597(class105, class403);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ri.ne(").append(')').toString());
		}
	}

	static void method5601(byte i) {
		try {
			Class298_Sub9.aClass437_7224.clear();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ri.r(").append(')').toString());
		}
	}
}
