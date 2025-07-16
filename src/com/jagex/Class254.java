package com.jagex;/* Class254 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class254 {
	static Class254 aClass254_2786;
	public static Class254 aClass254_2787 = new Class254(0);
	int anInt2788;
	public static boolean[] interfaceGC;

	Class254(int i) {
		this.anInt2788 = i * -2064479007;
	}

	static {
		aClass254_2786 = new Class254(1);
	}

	static final void method2423(ScriptRuntime runtime) {
		try {
			runtime.integerStackOffset -= -1175642067;
			int i_0_ = (runtime.integerStack[681479919 * runtime.integerStackOffset]);
			int i_1_ = (runtime.integerStack[runtime.integerStackOffset * 681479919 + 1]);
			int i_2_ = (runtime.integerStack[runtime.integerStackOffset * 681479919 + 2]);
			if (i_1_ == -1)
				throw new RuntimeException();
			ClientScriptMap class483 = Class51.aClass475_506.getClientScriptMap(i_1_);
			if (class483.aChar6037 != i_0_)
				throw new RuntimeException();
			runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = (class483.method6127(Integer.valueOf(i_2_), (byte) 94) ? 1 : 0);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("kq.vo(").append(')').toString());
		}
	}

	static final void method2424(ScriptRuntime runtime) {
		try {
			int i_3_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
			runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = GameLanguage.isLetter((char) i_3_, -401787251) ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("kq.aaz(").append(')').toString());
		}
	}

	static final void method2425(ScriptRuntime class403, int i) {
		try {
			class403.objectArgs -= -1386882043;
			Class23.method377((String) (class403.objectStack[class403.objectArgs * -203050393]), (String) (class403.objectStack[1 + -203050393 * class403.objectArgs]), (String) (class403.objectStack[-203050393 * class403.objectArgs + 2]), (class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]) == 1, true);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("kq.afy(").append(')').toString());
		}
	}

	static final void method2426(ScriptRuntime runtime) {
		try {
			runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = StaticMethods.method5977().getID();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("kq.ahl(").append(')').toString());
		}
	}

	static boolean method2427(String string, int i, byte i_4_) {
		try {
			return Class65.method762(string, i, "openjs");
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("kq.b(").append(')').toString());
		}
	}

	static final void method2428(ScriptRuntime runtime) {
		try {
			SettingsManager.loadLowSettings();
			GameClient.myRegion.method2667();
			ToMoveSettings.encodeBuffer();
			GameClient.sentPreferences = false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("kq.anq(").append(')').toString());
		}
	}
}
