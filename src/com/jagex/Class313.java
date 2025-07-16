package com.jagex;/* Class313 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.Js5Configs;
import com.jagex.game.cache.config.prefetch.Js5List;

public class Class313 {
	static int anInt3295 = 63;
	static int anInt3296 = 7;
	public static int anInt3297;
	public static Object[] anObjectArray3298;
	public static SpriteToolkit aClass57_3299;
	static Class97 aClass97_3300;

	Class313() throws Throwable {
		throw new Error();
	}

	public static void method3820(int i, int i_0_, boolean bool, int i_1_) {
		try {
			if (Class423.aClass437_5354.get((long) i) == null) {
				if (!GameClient.aBoolean8806)
					StaticMethods.method1395(i, bool);
				else {
					Class298_Sub49 class298_sub49 = (new Class298_Sub49(i, new Class308_Sub1(4096, Js5List.JS5_VORBIS, i), i_0_, bool));
					class298_sub49.aClass308_Sub1_7591.method3764(GameLanguage.CURRENT_LANGUAGE.method5753(), (byte) 104);
					Class423.aClass437_5354.connect(class298_sub49, (long) i);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("n.a(").append(')').toString());
		}
	}

	static int[] method3821(MenuOption menuOption) {
		try {
			int[] is = null;
			if (StaticMethods.method4920(946432351 * (menuOption.componentID), (short) 300))
				is = (Js5Configs.itemList.getItemDefinitions((int) ((menuOption.primary) * 2236412381003659263L)).unknownArray2);
			else if (-1 != (menuOption.item) * -149710173)
				is = (Js5Configs.itemList.getItemDefinitions((menuOption.item * -149710173)).unknownArray2);
			else if (Class302.method3716(946432351 * (menuOption.componentID))) {
				ObjectNode class298_sub29 = ((ObjectNode) (GameClient.entityList.get((long) (int) (2236412381003659263L * menuOption.primary))));
				if (class298_sub29 != null) {
					NPC class365_sub1_sub1_sub2_sub1 = ((NPC) class298_sub29.nodeObject);
					NPCDefinition class503 = class365_sub1_sub1_sub2_sub1.aClass503_10190;
					if (null != class503.morphisms)
						class503 = class503.morph(Class128.playerVarsProvider);
					if (class503 != null)
						is = class503.anIntArray6131;
				}
			} else if (StaticMethods.method4907((menuOption.componentID * 946432351))) {
				ObjectDefinition class432 = (GameClient.myRegion.getObjectDefinitionLoader().get((int) (2236412381003659263L * (menuOption.primary) >>> 32 & 0x7fffffffL)));
				if (class432.objectIDs != null)
					class432 = class432.method5777(Class128.playerVarsProvider);
				if (null != class432)
					is = class432.anIntArray5370;
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("n.ag(").append(')').toString());
		}
	}

	static final void method3822(ScriptRuntime runtime) {
		try {
			IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
			IComponentDefinition class105 = IComponentScripter.componentDefinition;
			Class523.method6329(class105, runtime);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("n.qm(").append(')').toString());
		}
	}
}
