package com.jagex;/* Class285 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

public final class Class285 {
	static int[] routeFinderYArray;
	static int anInt3075 = 128;
	static int[][] anIntArrayArray3076 = new int[128][128];
	static int[] routeFinderXArray;
	static int anInt3078;
	static int anInt3079 = 128;
	static int[][] anIntArrayArray3080 = new int[128][128];
	static int anInt3081 = 4095;
	static Font aFont3082;
	public static Class298_Sub19_Sub4 aClass298_Sub19_Sub4_3083;

	static {
		routeFinderXArray = new int[4096];
		routeFinderYArray = new int[4096];
	}

	Class285() throws Throwable {
		throw new Error();
	}

	public static void method2710(int i) {
		try {
			Class298_Sub49 class298_sub49 = ((Class298_Sub49) Class423.aClass437_5354.get((long) i));
			if (class298_sub49 != null) {
				class298_sub49.aClass308_Sub1_7591.method3771((byte) 57);
				StaticMethods.method1395(1566028323 * class298_sub49.anInt7589, (class298_sub49.aBoolean7588));
				class298_sub49.unlink();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lv.b(").append(')').toString());
		}
	}

	static final void method2711(ScriptRuntime class403, byte i) {
		try {
			IComponentScripter IComponentScripter = (class403.currentInstrBool ? class403.aIComponentScripter_5247 : class403.aIComponentScripter_5246);
			IComponentDefinition class105 = IComponentScripter.componentDefinition;
			GameLanguage.method5758(class105);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lv.cx(").append(')').toString());
		}
	}

	static final void method2712(int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_) {
		try {
			if (i - i_3_ >= Class372_Sub1.anInt4051 * -1424479739 && i + i_3_ <= Class372_Sub1.anInt4048 * 1135094847 && i_2_ - i_3_ >= Class372_Sub1.anInt4049 * 1155384281 && i_3_ + i_2_ <= -1062447355 * Class372_Sub1.anInt4050)
				Class487.method6165(i, i_2_, i_3_, i_4_, i_5_, i_6_, 1691112571);
			else
				Class315.method3836(i, i_2_, i_3_, i_4_, i_5_, i_6_, (byte) 55);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lv.u(").append(')').toString());
		}
	}

	public static int method2713(int i, int i_8_, int i_9_) {
		try {
			if (i_8_ > i) {
				int i_10_ = i;
				i = i_8_;
				i_8_ = i_10_;
			}
			int i_11_;
			for (/**/; 0 != i_8_; i_8_ = i_11_) {
				i_11_ = i % i_8_;
				i = i_8_;
			}
			return i;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lv.f(").append(')').toString());
		}
	}

	static void method2714(MenuOption menuOption, byte i) {
		try {
			if (!GameClient.menuOpen) {
				menuOption.unlink();
				Class436.menuOptionCount -= -970198067;
				if (!menuOption.independent) {
					long l = (6619564980435866523L * (menuOption.unlocker));
					MenuOptionNode menuOptionNode;
					for (menuOptionNode = ((MenuOptionNode) Class436.aClass437_5470.get(l)); menuOptionNode != null; menuOptionNode = ((MenuOptionNode) Class436.aClass437_5470.poll())) {
						if (menuOptionNode.aString9585.equals(menuOption.action)) {
							if (i == 2) {
								/* empty */
							}
							break;
						}
					}
					if (null != menuOptionNode && menuOptionNode.method3418(menuOption))
						Class75.method837(menuOptionNode);
				} else {
					for (MenuOptionNode menuOptionNode = ((MenuOptionNode) Class436.aClass461_5482.first()); menuOptionNode != null; menuOptionNode = ((MenuOptionNode) Class436.aClass461_5482.next())) {
						if (menuOptionNode.aString9585.equals(menuOption.action)) {
							boolean bool = false;
							for (MenuOption menuOption_12_ = ((MenuOption) menuOptionNode.circularDoubleLinkedList.first()); menuOption_12_ != null; menuOption_12_ = ((MenuOption) menuOptionNode.circularDoubleLinkedList.next())) {
								if (menuOption_12_ == menuOption) {
									if (menuOptionNode.method3418(menuOption))
										Class75.method837(menuOptionNode);
									bool = true;
									break;
								}
							}
							if (bool) {
								if (i != 2)
									break;
								break;
							}
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lv.m(").append(')').toString());
		}
	}
}
