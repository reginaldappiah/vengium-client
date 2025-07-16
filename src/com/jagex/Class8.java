package com.jagex;/* Class8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class8 {
	static int anInt98;
	static int consoleTextIndex;
	static int anInt100 = 350;
	static String consoleText;
	static int anInt102 = 0;
	static int anInt103 = 0;
	static int consoleScriptIndex;
	static int anInt105;
	static int anInt106;
	static String[] consoleMessages;
	static boolean aBoolean108;
	static String[] consoleScript;
	static int anInt110;
	static String aString111 = "\\/.:, _-+[]~@";
	static String aString112 = "Success";
	static String aString113 = "Failure";
	static boolean aBoolean114;

	static {
		consoleText = "";
		anInt105 = 0;
		consoleTextIndex = 0;
		anInt98 = 0;
		aBoolean108 = false;
		consoleScriptIndex = 1428832631;
	}

	Class8() throws Throwable {
		throw new Error();
	}

	static String method315(MenuOption menuOption) {
		try {
			if ((menuOption.aString9669 == null) || menuOption.aString9669.length() == 0) {
				if (null != (menuOption.action) && menuOption.action.length() > 0)
					return new StringBuilder().append(menuOption.target).append(Tradution.aClass470_5916.translate(GameLanguage.CURRENT_LANGUAGE)).append(menuOption.action).toString();
				return (menuOption.target);
			}
			if ((null != menuOption.action) && menuOption.action.length() > 0)
				return new StringBuilder().append(menuOption.target).append(Tradution.aClass470_5916.translate(GameLanguage.CURRENT_LANGUAGE)).append(menuOption.action).append(Tradution.aClass470_5916.translate(GameLanguage.CURRENT_LANGUAGE)).append(menuOption.aString9669).toString();
			return new StringBuilder().append(menuOption.target).append(Tradution.aClass470_5916.translate(GameLanguage.CURRENT_LANGUAGE)).append(menuOption.aString9669).toString();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ai.bf(").append(')').toString());
		}
	}

	static final void method316(ScriptRuntime class403, byte i) {
		try {
			String string = (String) (class403.objectStack[(class403.objectArgs -= 969361751) * -203050393]);
			Class439.method5850(string, 1986272342);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ai.vh(").append(')').toString());
		}
	}

	static final void method317(ScriptRuntime class403, int i) {
		try {
			class403.objectStack[((class403.objectArgs += 969361751) * -203050393 - 1)] = class403.clanChannelChat.channelName;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ai.xj(").append(')').toString());
		}
	}

	static Class298_Sub19_Sub1 method318(Class298_Sub19_Sub1 class298_sub19_sub1, int i) {
		try {
			Class298_Sub19_Sub1 class298_sub19_sub1_0_ = (null == class298_sub19_sub1 ? new Class298_Sub19_Sub1() : new Class298_Sub19_Sub1(class298_sub19_sub1));
			class298_sub19_sub1_0_.method2962(9, 128, 346222187);
			return class298_sub19_sub1_0_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ai.f(").append(')').toString());
		}
	}

	public static void clear() {
		try {
			IComponentDefinition.spriteCache.clear();
			IComponentDefinition.modelsCache.clear();
			IComponentDefinition.aClass348_1136.clear();
			IComponentDefinition.aClass348_1296.clear();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ai.g(").append(')').toString());
		}
	}

	static final void method320(ScriptRuntime class403, int i) {
		try {
			Class62 class62 = class403.entity.method4437(658355638);
			if (null == class62)
				class403.objectStack[((class403.objectArgs += 969361751) * -203050393) - 1] = "";
			else
				class403.objectStack[((class403.objectArgs += 969361751) * -203050393) - 1] = class62.method721();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ai.aok(").append(')').toString());
		}
	}

}
