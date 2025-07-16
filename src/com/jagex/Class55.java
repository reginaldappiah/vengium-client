package com.jagex;/* Class55 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.utils.TimeUtils;

public class Class55 {
	public int anInt556;
	public static Class55 aClass55_557;
	public static Class55 aClass55_558;
	public static Class55 aClass55_559;
	public static Class55 aClass55_560 = new Class55(5, 3);
	public static Class55 aClass55_561;
	static Class55 aClass55_562;
	static Class55 aClass55_563;
	public static Class55 aClass55_564;
	public static Class55 aClass55_565;
	public int anInt566;
	public static Class55 aClass55_567;

	static {
		aClass55_557 = new Class55(9, 4);
		aClass55_567 = new Class55(7, 1);
		aClass55_559 = new Class55(1, 1);
		aClass55_565 = new Class55(3, 2);
		aClass55_561 = new Class55(2, 1);
		aClass55_562 = new Class55(6, 3);
		aClass55_563 = new Class55(4, 4);
		aClass55_564 = new Class55(8, 1);
		aClass55_558 = new Class55(0, 1);
	}

	Class55(int i, int i_0_) {
		anInt566 = i * -57892181;
		anInt556 = i_0_ * -1192469397;
	}

	static final void method603(ScriptRuntime class403, int i) {
		try {
			class403.integerStackOffset -= -783761378;
			Class386.method4725(Player.myPlayer, (class403.integerStack[(class403.integerStackOffset * 681479919)]), (class403.integerStack[(681479919 * class403.integerStackOffset + 1)]), -16777216);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ce.sm(").append(')').toString());
		}
	}

	static final void method604(ScriptRuntime runtime) {
		try {
			SettingsManager.settingsManager.setValue(SettingsManager.settingsManager.idleAnimations, (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]));
			ToMoveSettings.encodeBuffer();
			GameClient.sentPreferences = false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ce.aie(").append(')').toString());
		}
	}

	static final void method605(ScriptRuntime runtime) {
		try {
			IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
			IComponentDefinition class105 = IComponentScripter.componentDefinition;
			IComponentDefinitionCollection IComponentDefinitionCollection = IComponentScripter.IComponentDefinitionCollection;
			ToMoveIComponentScripts.method4292(class105, runtime);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ce.no(").append(')').toString());
		}
	}

	static void method606(String[] strings, int i) {
		try {
			if (strings.length > 1) {
				for (int i_1_ = 0; i_1_ < strings.length; i_1_++) {
					if (strings[i_1_].startsWith("pause")) {
						int i_2_ = 5;
						try {
							i_2_ = Integer.parseInt(strings[i_1_].substring(6));
						} catch (Exception exception) {
							/* empty */
						}
						StaticMethods.sendConsoleMessage(new StringBuilder().append("Pausing for ").append(i_2_).append(" seconds...").toString());
						Class8.consoleScript = strings;
						Class8.consoleScriptIndex = -1428832631 * (i_1_ + 1);
						Class146.consolePauseTime = (TimeUtils.getTime() + (long) (i_2_ * 1000)) * 6717445677357895093L;
						break;
					}
					Class8.consoleText = strings[i_1_];
					Class142.submitConsoleMessage(false);
				}
			} else {
				Class8.consoleText = new StringBuilder().append(Class8.consoleText).append(strings[0]).toString();
				Class8.consoleTextIndex += strings[0].length() * 1914783065;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ce.d(").append(')').toString());
		}
	}

	static void method607(int i) {
		try {
			if (-1217082313 * Class8.anInt105 > 0) {
				int i_3_ = 0;
				for (int i_4_ = 0; i_4_ < Class8.consoleMessages.length; i_4_++) {
					if (Class8.consoleMessages[i_4_].indexOf("--> ") != -1 && ++i_3_ == Class8.anInt105 * -1217082313) {
						Class8.consoleText = (Class8.consoleMessages[i_4_].substring(Class8.consoleMessages[i_4_].indexOf('>') + 2));
						break;
					}
				}
			} else
				Class8.consoleText = "";
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ce.posX(").append(')').toString());
		}
	}
}
