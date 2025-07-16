package com.jagex;/* Class498 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class498 {
	public short[] aShortArray6107;
	public int[] anIntArray6108;
	public short[] aShortArray6109;
	public long aLong6110;

	public Class498(NPCDefinition npcDefinition, boolean isNPCType) {
		if (isNPCType) {
			anIntArray6108 = new int[npcDefinition.modelIDs.length];
			System.arraycopy(npcDefinition.modelIDs, 0, anIntArray6108, 0, anIntArray6108.length);
		} else {
			anIntArray6108 = new int[npcDefinition.models_2.length];
			System.arraycopy(npcDefinition.models_2, 0, anIntArray6108, 0, anIntArray6108.length);
		}
		if (null != npcDefinition.recolorToReplace) {
			aShortArray6109 = new short[npcDefinition.recolorToReplace.length];
			System.arraycopy(npcDefinition.recolorToReplace, 0, aShortArray6109, 0, aShortArray6109.length);
		}
		if (null != npcDefinition.retextureToReplace) {
			aShortArray6107 = new short[npcDefinition.retextureToReplace.length];
			System.arraycopy(npcDefinition.retextureToReplace, 0, aShortArray6107, 0, aShortArray6107.length);
		}
	}

	public Class498(long l, int[] is, short[] is_0_, short[] is_1_) {
		aLong6110 = 3177550440302969639L * l;
		anIntArray6108 = is;
		aShortArray6109 = is_0_;
		aShortArray6107 = is_1_;
	}

	public static Class177 method6209(Buffer class298_sub53, byte i) {
		try {
			Class177 class177 = new Class177();
			class177.anInt1787 = class298_sub53.readUShort() * -1496580327;
			class177.aClass298_Sub37_Sub14_1788 = StaticMethods.aClass469_5618.method6045((class177.anInt1787 * -2034569943));
			return class177;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("up.a(").append(')').toString());
		}
	}

	static final void method6210(ScriptRuntime class403, byte i) {
		try {
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = SettingsManager.settingsManager.themeMusicVolume.getValue();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("up.akq(").append(')').toString());
		}
	}

	static final void method6211(ScriptRuntime class403, int i) {
		try {
			class403.objectArgs -= 1938723502;
			String string = (String) (class403.objectStack[-203050393 * class403.objectArgs]);
			String string_2_ = ((String) (class403.objectStack[-203050393 * class403.objectArgs + 1]));
			int i_3_ = (class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]);
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = string.indexOf(string_2_, i_3_);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("up.aay(").append(')').toString());
		}
	}
}
