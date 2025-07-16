package com.jagex;/* Class328 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.utils.StringUtils;

public class Class328 {
	public static int anInt3473 = 1;
	short[] aShortArray3474;
	public static int anInt3475 = 4;
	public static int anInt3476 = 8;
	public static int anInt3477 = 16;
	public static int anInt3478 = 2;
	byte aByte3479;
	short aShort3480;
	short aShort3481;
	byte aByte3482;
	short aShort3483;
	int[] anIntArray3484;
	int[] anIntArray3485;
	int[] anIntArray3486;
	short aShort3487;
	short[] aShortArray3488;
	short[] aShortArray3489;

	Class328(Region class331, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_) {
		this.aByte3482 = (byte) i;
		this.aByte3479 = (byte) i_0_;
		this.anIntArray3484 = new int[4];
		this.anIntArray3485 = new int[4];
		this.anIntArray3486 = new int[4];
		this.anIntArray3484[0] = i_1_;
		this.anIntArray3484[1] = i_2_;
		this.anIntArray3484[2] = i_3_;
		this.anIntArray3484[3] = i_4_;
		this.anIntArray3485[0] = i_5_;
		this.anIntArray3485[1] = i_6_;
		this.anIntArray3485[2] = i_7_;
		this.anIntArray3485[3] = i_8_;
		this.anIntArray3486[0] = i_9_;
		this.anIntArray3486[1] = i_10_;
		this.anIntArray3486[2] = i_11_;
		this.anIntArray3486[3] = i_12_;
		this.aShort3487 = (short) (i_1_ >> -1688804109 * class331.positionHash);
		this.aShort3481 = (short) (i_3_ >> -1688804109 * class331.positionHash);
		this.aShort3480 = (short) (i_9_ >> -1688804109 * class331.positionHash);
		this.aShort3483 = (short) (i_11_ >> class331.positionHash * -1688804109);
		this.aShortArray3474 = new short[4];
		this.aShortArray3488 = new short[4];
		this.aShortArray3489 = new short[4];
	}

	static final void method3985(ScriptRuntime class403, byte i) {
		try {
			IComponentScripter IComponentScripter = (class403.currentInstrBool ? class403.aIComponentScripter_5247 : class403.aIComponentScripter_5246);
			IComponentDefinition class105 = IComponentScripter.componentDefinition;
			IComponentDefinitionCollection IComponentDefinitionCollection = IComponentScripter.IComponentDefinitionCollection;
			ToMoveIComponentScripts.method5865(class105, class403);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("nr.kz(").append(')').toString());
		}
	}

	static final void method3986(ScriptRuntime class403, byte i) {
		try {
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = GameClient.playerIndex * -442628795;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("nr.vd(").append(')').toString());
		}
	}

	static final void DIRECT_LOGIN(ScriptRuntime runtime) {
		try {
			runtime.objectArgs -= 1938723502;
			String username = (String) (runtime.objectStack[runtime.objectArgs * -203050393]);
			String password = ((String) (runtime.objectStack[-203050393 * runtime.objectArgs + 1]));
			Class63.directLogin(username, password);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("nr.agx(").append(')').toString());
		}
	}

	static final void method3988(ScriptRuntime runtime) {
		try {
			runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = SettingsManager.settingsManager.desiredToolkit.method5681() ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("nr.aot(").append(')').toString());
		}
	}

	public static String method3989(String string, int i) {
		try {
			StringBuilder stringbuilder = new StringBuilder();
			int i_14_ = string.length();
			for (int i_15_ = 0; i_15_ < i_14_; i_15_++) {
				char c = string.charAt(i_15_);
				if (37 == c && i_14_ > i_15_ + 2) {
					c = string.charAt(i_15_ + 1);
					boolean bool = false;
					int i_16_;
					if (c >= 48 && c <= 57)
						i_16_ = c - 48;
					else if (c >= 97 && c <= 102)
						i_16_ = 10 + c - 97;
					else if (c >= 65 && c <= 70)
						i_16_ = c + 10 - 65;
					else {
						stringbuilder.append('%');
						continue;
					}
					i_16_ *= 16;
					int i_17_ = string.charAt(i_15_ + 2);
					if (i_17_ >= 48 && i_17_ <= 57)
						i_16_ += i_17_ - 48;
					else if (i_17_ >= 97 && i_17_ <= 102)
						i_16_ += i_17_ + 10 - 97;
					else if (i_17_ >= 65 && i_17_ <= 70)
						i_16_ += i_17_ + 10 - 65;
					else {
						stringbuilder.append('%');
						continue;
					}
					if (0 != i_16_ && StringUtils.method5729((byte) i_16_))
						stringbuilder.append(Class485.keyCodeToSymbol((byte) i_16_));
					i_15_ += 2;
				} else if (c == 43)
					stringbuilder.append(' ');
				else
					stringbuilder.append(c);
			}
			return stringbuilder.toString();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("nr.a(").append(')').toString());
		}
	}

	static final void method3990(ScriptRuntime class403, int i) {
		try {
			IComponentScripter IComponentScripter = (class403.currentInstrBool ? class403.aIComponentScripter_5247 : class403.aIComponentScripter_5246);
			if (-1309843523 * IComponentScripter.componentDefinition.slot == -1) {
				if (class403.currentInstrBool)
					throw new RuntimeException("");
				throw new RuntimeException("");
			}
			IComponentDefinition class105 = IComponentScripter.componentExists();
			class105.sada[-1309843523 * IComponentScripter.componentDefinition.slot] = null;
			StaticMethods.updateComponentTick(class105);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("nr.bt(").append(')').toString());
		}
	}
}
