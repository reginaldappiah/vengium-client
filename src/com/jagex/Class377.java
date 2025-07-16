package com.jagex;/* Class377 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.utils.StringUtils;

public class Class377 {
	public Recorder anRecorder_4091;

	public Class377(Js5FileSystem class243) {
		byte[] is = class243.get((Class380.aClass380_4100.anInt4108 * -363169051));
		method4661(new Buffer(is), 1724191904);
	}

	void method4661(Buffer class298_sub53, int i) {
		try {
			for (;;) {
				int i_0_ = class298_sub53.readUByte();
				if (i_0_ == 0) {
					if (i != 1724191904)
						throw new IllegalStateException();
					break;
				}
				if (1 == i_0_)
					anRecorder_4091 = ObjectDefinition.method5786(class298_sub53, (byte) -47);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("pr.a(").append(')').toString());
		}
	}

	static final void method4662(ScriptRuntime class403, int i) {
		try {
			int i_1_ = (class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]);
			IComponentDefinition class105 = IComponentDefinition.getInterfaceComponent(i_1_);
			IComponentDefinitionCollection IComponentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[i_1_ >> 16];
			Class135.method1490(class105, IComponentDefinitionCollection, class403, 1344346794);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("pr.gl(").append(')').toString());
		}
	}

	static final void method4663(ScriptRuntime class403, int i) {
		try {
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = SettingsManager.settingsManager.aClass422_Sub10_7548.method5660() ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("pr.anr(").append(')').toString());
		}
	}

	public static String method4664(long l) {
		try {
			if (l <= 0L || l >= 6582952005840035281L)
				return null;
			if (l % 37L == 0L)
				return null;
			int i = 0;
			for (long l_2_ = l; 0L != l_2_; l_2_ /= 37L)
				i++;
			StringBuilder stringbuilder = new StringBuilder(i);
			while (0L != l) {
				long l_3_ = l;
				l /= 37L;
				stringbuilder.append(StringUtils.aCharArray5342[(int) (l_3_ - 37L * l)]);
			}
			return stringbuilder.reverse().toString();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("pr.f(").append(')').toString());
		}
	}

	static final void method4665(IComponentDefinition class105, IComponentDefinitionCollection IComponentDefinitionCollection, ScriptRuntime runtime) {
		try {
			class105.alpha = (runtime.integerStack[(runtime.integerStackOffset -= -391880689) * 681479919]) == 1;
			StaticMethods.updateComponentTick(class105);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("pr.fs(").append(')').toString());
		}
	}

	static final void method4666(ScriptRuntime class403, byte i) {
		try {
			int i_4_ = (class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]);
			IComponentDefinition class105 = IComponentDefinition.getInterfaceComponent(i_4_);
			IComponentDefinitionCollection IComponentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[i_4_ >> 16];
			ToMoveIComponentScripts.method4891(class105, IComponentDefinitionCollection, class403);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("pr.hd(").append(')').toString());
		}
	}

	static final void method4667(ScriptRuntime class403, int i) {
		try {
			int i_5_ = (class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]);
			if (2 == 1131012101 * GameClient.anInt8942 && i_5_ >= 0 && i_5_ < GameClient.anInt8941 * -1054937867)
				class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919) - 1] = GameClient.aBooleanArray8722[i_5_] ? 1 : 0;
			else
				class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919) - 1] = 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("pr.wt(").append(')').toString());
		}
	}

	static final void method4668(ScriptRuntime class403, byte i) {
		try {
			int i_6_ = (class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]);
			class403.objectStack[((class403.objectArgs += 969361751) * -203050393 - 1)] = class403.aClass162_5252.aStringArray1668[i_6_];
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("pr.xw(").append(')').toString());
		}
	}
}
