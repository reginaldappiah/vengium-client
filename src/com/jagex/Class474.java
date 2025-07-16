package com.jagex;/* Class474 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class474 {
	public static boolean aBoolean5970;
	static int anInt5971;
	public static IPAddress aClass471_5972;
	public static boolean aBoolean5973;
	public static boolean aBoolean5974 = false;
	static Class343_Sub1[] aClass343_Sub1Array5975 = new Class343_Sub1[0];
	public static IPAddress aClass471_5976;
	static int anInt5977 = 1105886704;
	static Class396 aClass396_5978;
	public static IPAddress activeConnectionInfo;
	public static int anInt5980;

	static {
		anInt5971 = 0;
		aClass396_5978 = null;
		aBoolean5970 = false;
	}

	Class474() throws Throwable {
		throw new Error();
	}

	static final void method6071(ScriptRuntime runtime) {
		try {
			String string = (String) (runtime.objectStack[(runtime.objectArgs -= 969361751) * -203050393]);
			Class12.method338(string, false, (short) 32562);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("tn.vi(").append(')').toString());
		}
	}

	static final void method6072(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		try {
			if (i > i_0_)
				Class82_Sub22.method940((Class372_Sub2.anIntArrayArray4047[i_1_]), i_0_, i, i_2_);
			else
				Class82_Sub22.method940((Class372_Sub2.anIntArrayArray4047[i_1_]), i, i_0_, i_2_);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("tn.n(").append(')').toString());
		}
	}

	static final void method6073(ScriptRuntime class403, short i) {
		try {
			SettingsManager.settingsManager.setValue(SettingsManager.settingsManager.soundEffectsVolume, (class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]));
			ToMoveSettings.encodeBuffer();
			GameClient.sentPreferences = false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("tn.ais(").append(')').toString());
		}
	}
}
