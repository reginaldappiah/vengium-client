package com.jagex;/* Class136 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.prefetch.Js5List;

public class Class136 implements Interface6 {
	SpriteToolkit aClass57_6385;
	Class158 aClass158_6386;
	Js5FileSystem aClass243_6387;
	public static int[] anIntArray6388;

    public void method53() {
		try {
			this.aClass57_6385 = StaticMethods.method5663(this.aClass243_6387, -610589451 * (this.aClass158_6386.anInt6361));
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("fm.a(").append(')').toString());
		}
	}

	public void method58(boolean bool, byte i) {
		try {
			if (bool) {
				int i_0_ = ((this.aClass158_6386.aClass139_6360.method1545(this.aClass57_6385.getPaddedWidth(), GameClient.anInt8794 * 775068819, -2059315000)) + (-245579987 * this.aClass158_6386.anInt6362));
				int i_1_ = ((this.aClass158_6386.aClass133_6363.method1482(this.aClass57_6385.getPaddedHeight(), GameClient.anInt8803 * -791746413, -1363619703)) + (this.aClass158_6386.anInt6359 * -1426302101));
				this.aClass57_6385.draw(i_0_, i_1_);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("fm.f(").append(')').toString());
		}
	}

	public boolean method52(int i) {
		try {
			return (this.aClass243_6387.exists(-610589451 * this.aClass158_6386.anInt6361));
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("fm.b(").append(')').toString());
		}
	}

    Class136(Js5FileSystem class243, Class158 class158) {
		this.aClass243_6387 = class243;
		this.aClass158_6386 = class158;
	}

    public static void method1495(int i, int i_3_, int i_4_, int i_5_) {
		try {
			i_4_ = (i_4_ * SettingsManager.settingsManager.musicVolume.getValue() >> 8);
			if (0 != i_4_ && i != -1) {
				if (!Class300.aBoolean3208 && -1256171511 * Class300.anInt3207 != -1 && EffectiveVertex.method781() && !Class82_Sub9.method899((byte) 9)) {
					Class298_Sub2.aClass298_Sub19_Sub1_7167 = Class173.method1819(34386078);
					Class368.method4555((short) 1644);
					Class298_Sub19_Sub1 class298_sub19_sub1 = Class8.method318((Class298_Sub2.aClass298_Sub19_Sub1_7167), -1213425929);
					EffectiveVertex.method777(true, class298_sub19_sub1);
				}
				ItemDefinitionLoader.method6096(Js5List.JS5_MUSIC2, i, 0, i_4_, false);
				StaticMethods.method3955(-1, 255);
				Class300.aBoolean3208 = true;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("fm.c(").append(')').toString());
		}
	}

	static final void method1496(ScriptRuntime class403, int i) {
		try {
			IComponentScripter IComponentScripter = (class403.currentInstrBool ? class403.aIComponentScripter_5247 : class403.aIComponentScripter_5246);
			IComponentDefinition class105 = IComponentScripter.componentDefinition;
			IComponentDefinitionCollection IComponentDefinitionCollection = IComponentScripter.IComponentDefinitionCollection;
			ToMoveIComponentScripts.method912(class105, class403);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("fm.in(").append(')').toString());
		}
	}

	static final void method1497(ScriptRuntime class403, int i) {
		try {
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = GameClient.aShort8928;
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = GameClient.aShort8929;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("fm.akc(").append(')').toString());
		}
	}

	static Class method1498(String string, byte i) throws ClassNotFoundException {
		try {
			if (string.equals("B"))
				return Byte.TYPE;
			if (string.equals("I"))
				return Integer.TYPE;
			if (string.equals("S"))
				return Short.TYPE;
			if (string.equals("J"))
				return Long.TYPE;
			if (string.equals("Z"))
				return Boolean.TYPE;
			if (string.equals("F"))
				return Float.TYPE;
			if (string.equals("D"))
				return Double.TYPE;
			if (string.equals("C"))
				return Character.TYPE;
			if (string.equals("void"))
				return Void.TYPE;
			return string.getClass();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("fm.i(").append(')').toString());
		}
	}

	public static final void method1499(int i, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_) {
		try {
			if (i >= Class372_Sub3.anInt4051 * -1424479739 && i_6_ <= Class372_Sub3.anInt4048 * 1135094847 && i_7_ >= 1155384281 * Class372_Sub3.anInt4049 && i_8_ <= Class372_Sub3.anInt4050 * -1062447355) {
				if (1 == i_10_)
					StaticMethods.method4529(i, i_6_, i_7_, i_8_, i_9_);
				else
					Class365_Sub1_Sub3_Sub2.method4514(i, i_6_, i_7_, i_8_, i_9_, i_10_, 1228342009);
			} else if (1 == i_10_)
				Class315.method3835(i, i_6_, i_7_, i_8_, i_9_, (byte) 16);
			else
				Heap.method3672(i, i_6_, i_7_, i_8_, i_9_, i_10_, 630835292);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("fm.r(").append(')').toString());
		}
	}

	static final void method1500(ScriptRuntime runtime) {
		try {
			boolean bool = ((runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]) != 0);
			if (Player.myPlayer.appearance != null)
				Player.myPlayer.appearance.setMale(bool);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("fm.cw(").append(')').toString());
		}
	}

	static final void method1501(ScriptRuntime class403, byte i) {
		try {
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = ItemDefinition.method6043(SettingsManager.settingsManager.toolkitSetting.getValue(), 200, -564822941);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("fm.akd(").append(')').toString());
		}
	}
}
