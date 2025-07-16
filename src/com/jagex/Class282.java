package com.jagex;/* Class282 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.quest.QuestType;

public class Class282 implements Interface21 {
	public static Class282 aClass282_6540;
	public static Class282 aClass282_6541;
	public byte aByte6542;
	public static Class282 aClass282_6543 = new Class282((byte) -1);
	public static int anInt6544 = 4;
	public static Class282 aClass282_6545 = new Class282((byte) 0);
	static Class270 aClass270_6546;

	public int method2617(byte i) {
		try {
			return 1 + aByte6542;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ls.b(").append(')').toString());
		}
	}

	public int getID() {
		try {
			return aByte6542;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ls.f(").append(')').toString());
		}
	}

	public int method243() {
		return aByte6542;
	}

	Class282(byte i) {
		aByte6542 = i;
	}

	public int method244() {
		return aByte6542;
	}

	static {
		aClass282_6540 = new Class282((byte) 1);
		aClass282_6541 = new Class282((byte) 2);
	}

	static void method2618(MenuOption menuOption, int i) {
		try {
			if (menuOption != null) {
				Class436.aClass453_5480.pushBack(menuOption);
				Class436.menuOptionCount += -970198067;
				Object object = null;
				MenuOptionNode menuOptionNode;
				if (!menuOption.independent && !"".equals(menuOption.action)) {
					long key = ((menuOption.unlocker) * 6619564980435866523L);
					for (menuOptionNode = ((MenuOptionNode) Class436.aClass437_5470.get(key)); menuOptionNode != null; menuOptionNode = ((MenuOptionNode) Class436.aClass437_5470.poll())) {
						if (menuOptionNode.aString9585.equals(menuOption.action)) {
							if (i <= 1583252452)
								throw new IllegalStateException();
							break;
						}
					}
					if (menuOptionNode == null) {
						menuOptionNode = ((MenuOptionNode) Class436.aClass348_5464.get(key));
						if (menuOptionNode != null && !(menuOptionNode.aString9585.equals(menuOption.action)))
							menuOptionNode = null;
						if (menuOptionNode == null)
							menuOptionNode = (new MenuOptionNode(menuOption.action));
						Class436.aClass437_5470.connect(menuOptionNode, key);
						Class436.anInt5479 += -1658575779;
					}
				} else {
					menuOptionNode = new MenuOptionNode(menuOption.action);
					Class436.anInt5479 += -1658575779;
				}
				if (menuOptionNode.method3416(menuOption))
					Class75.method837(menuOptionNode);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ls.t(").append(')').toString());
		}
	}

	public static Class336 method2619(int i, int i_0_, int i_1_, int i_2_) {
		try {
			Class315.aClass336_Sub4_3305.toX = i * -760677635;
			Class315.aClass336_Sub4_3305.toY = i_0_ * 167105303;
			Class315.aClass336_Sub4_3305.sizeX = -1544157451 * i_1_;
			Class315.aClass336_Sub4_3305.sizeY = i_2_ * -1468199503;
			return Class315.aClass336_Sub4_3305;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ls.f(").append(')').toString());
		}
	}

	static void method2620(ScriptRuntime class403, byte i) {
		try {
			QuestType questType = Class316.aClass362_3318.getQuestType((class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]));
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = (questType.requiredVarpBitsID == null ? 0 : questType.requiredVarpBitsID.length);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ls.g(").append(')').toString());
		}
	}

	static final void method2621(ScriptRuntime runtime) {
		try {
			String string = (StaticMethods.interfaceGCString[(runtime.integerstack[runtime.integerPos * 1883543357])]);
			if (null == string)
				string = "";
			runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393 - 1)] = string;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ls.ac(").append(')').toString());
		}
	}

	public static void sweep() {
		try {
			IComponentDefinition.spriteCache.sweep();
			IComponentDefinition.modelsCache.sweep();
			IComponentDefinition.aClass348_1136.sweep();
			IComponentDefinition.aClass348_1296.sweep();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ls.c(").append(')').toString());
		}
	}

	static final void method2623(int i, int i_4_, int i_5_, int i_6_, int i_7_) {
		try {
			if (i >= -1424479739 * Class372_Sub2.anInt4051 && i <= 1135094847 * Class372_Sub2.anInt4048) {
				i_4_ = StaticMethods.method6012(i_4_, 1155384281 * Class372_Sub2.anInt4049, (Class372_Sub2.anInt4050 * -1062447355));
				i_5_ = StaticMethods.method6012(i_5_, 1155384281 * Class372_Sub2.anInt4049, (-1062447355 * Class372_Sub2.anInt4050));
				Class492.method6183(i, i_4_, i_5_, i_6_, -1450466434);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ls.posX(").append(')').toString());
		}
	}

	public static Class413 method2624(int i) {
		try {
			if (Class357.aClass413_3845 == null)
				return Class413.aClass413_6584;
			return Class357.aClass413_3845;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ls.u(").append(')').toString());
		}
	}

	static void method2625(int i) {
		try {
			Class360.loginType = 471358088;
			Class360.activeConnection = ConnectionType.gameConnection;
			Class460.method5981((122690138525332847L * Class360.accountName == -1L), true, "", "", Class360.accountName * 122690138525332847L);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ls.v(").append(')').toString());
		}
	}

	static final void method2626(ScriptRuntime runtime) {
		try {
			int i_8_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
			IComponentDefinition class105 = IComponentDefinition.getInterfaceComponent(i_8_);
			IComponentDefinitionCollection IComponentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[i_8_ >> 16];
			GameDefaults.method4582(class105, runtime);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ls.lx(").append(')').toString());
		}
	}
}
