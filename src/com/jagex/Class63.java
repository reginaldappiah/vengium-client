package com.jagex;/* Class63 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class63 {
	Class63() throws Throwable {
		throw new Error();
	}

	static final void method733(ScriptRuntime class403, int i) {
		try {
			IComponentScripter IComponentScripter = (class403.currentInstrBool ? class403.aIComponentScripter_5247 : class403.aIComponentScripter_5246);
			IComponentDefinition class105 = IComponentScripter.componentDefinition;
			IComponentDefinitionCollection IComponentDefinitionCollection = IComponentScripter.IComponentDefinitionCollection;
			ToMoveIComponentScripts.method5668(class105, class403);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("co.me(").append(')').toString());
		}
	}

	static final void method734(ScriptRuntime class403, byte i) {
		try {
			IComponentScripter IComponentScripter = (class403.currentInstrBool ? class403.aIComponentScripter_5247 : class403.aIComponentScripter_5246);
			IComponentDefinition class105 = IComponentScripter.componentDefinition;
			IComponentDefinitionCollection IComponentDefinitionCollection = IComponentScripter.IComponentDefinitionCollection;
			Class298_Sub14.method2907(class105, IComponentDefinitionCollection, class403);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("co.oe(").append(')').toString());
		}
	}

	static final void method735(ScriptRuntime runtime) {
		try {
			int i_0_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
			runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393 - 1)] = runtime.aClass162_5252.aStringArray1671[i_0_];
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("co.xk(").append(')').toString());
		}
	}

	static final void method736(ScriptRuntime class403, int i) {
			String string;
			if (Player.myPlayer != null && null != (Player.myPlayer.displayName))
				string = Player.myPlayer.getPlayerName(true);
			else
				string = "";
			class403.objectStack[((class403.objectArgs += 969361751) * -203050393 - 1)] = string;
	}

	static void method738(int i, int i_2_) {
			if (-1909773881 * Class436.anInt5476 == 1)
				Class401.sendInterfaceOptionPacket(GameContext.menuOption, i, i_2_);
			else if (2 == Class436.anInt5476 * -1909773881)
				StaticMethods.method1226(i, i_2_);
			Class436.anInt5476 = 0;
			GameContext.menuOption = null;
	}

	public static void method739(int i) {
			if (Class360.loginStep * -707576455 == 100)
				Class360.loginStep = 928688093;

	}

	static boolean method740(int i) {
			return Class436.menuOptionCount * -278777595 > 0;

	}

	public static void directLogin(String username, String password) {
			if (username.length() <= 320 && StaticMethods.method4931()) {
				StaticMethods.method957();
				Class360.username = username;
				Class360.password = password;
				Class439.loadGameState(3);
			}
	}

	public static void method742(Cacheable class298_sub37, Cacheable class298_sub37_5_) {
			if (null != class298_sub37.prev_cache)
				class298_sub37.unlinkCache();
			class298_sub37.prev_cache = class298_sub37_5_.prev_cache;
			class298_sub37.next_cache = class298_sub37_5_;
			class298_sub37.prev_cache.next_cache = class298_sub37;
			class298_sub37.next_cache.prev_cache = class298_sub37;
	}
}
