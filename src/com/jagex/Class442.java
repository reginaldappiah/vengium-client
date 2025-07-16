package com.jagex;/* Class442 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.Js5Configs;
import com.jagex.game.cache.config.ConfigType;

public class Class442 {
	Class302 aClass302_5591 = new Class302();
	Class302 aClass302_5592;

	public Class302 method5868() {
		try {
			Class302 class302 = this.aClass302_5591.aClass302_3258;
			if (this.aClass302_5591 == class302) {
				this.aClass302_5592 = null;
				return null;
			}
			this.aClass302_5592 = class302.aClass302_3258;
			return class302;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("sg.p(").append(')').toString());
		}
	}

	public void method5869(int i) {
		try {
			for (;;) {
				Class302 class302 = this.aClass302_5591.aClass302_3258;
				if (class302 == this.aClass302_5591) {
					if (i == -827035610) {
						/* empty */
					}
					break;
				}
				class302.unlink();
			}
			this.aClass302_5592 = null;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("sg.a(").append(')').toString());
		}
	}

	public void method5870(Class302 class302, int i) {
		try {
			if (class302.aClass302_3259 != null)
				class302.unlink();
			class302.aClass302_3259 = this.aClass302_5591.aClass302_3259;
			class302.aClass302_3258 = this.aClass302_5591;
			class302.aClass302_3259.aClass302_3258 = class302;
			class302.aClass302_3258.aClass302_3259 = class302;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("sg.f(").append(')').toString());
		}
	}

	public Class302 method5871(byte i) {
		try {
			Class302 class302 = this.aClass302_5591.aClass302_3258;
			if (class302 == this.aClass302_5591)
				return null;
			class302.unlink();
			return class302;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("sg.b(").append(')').toString());
		}
	}

	public Class442() {
		this.aClass302_5591.aClass302_3258 = this.aClass302_5591;
		this.aClass302_5591.aClass302_3259 = this.aClass302_5591;
	}

	public Class302 method5872() {
		try {
			Class302 class302 = this.aClass302_5592;
			if (class302 == this.aClass302_5591) {
				this.aClass302_5592 = null;
				return null;
			}
			this.aClass302_5592 = class302.aClass302_3258;
			return class302;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("sg.i(").append(')').toString());
		}
	}

	static final void method5873(ScriptRuntime class403, byte i) {
		try {
			class403.integerStackOffset -= -783761378;
			int i_0_ = (class403.integerStack[681479919 * class403.integerStackOffset]);
			boolean bool = 1 == (class403.integerStack[681479919 * class403.integerStackOffset + 1]);
			if (null != Class301_Sub1.aClass437_7637) {
				Node class298 = Class301_Sub1.aClass437_7637.get((long) i_0_);
				if (class298 != null && !bool)
					class298.unlink();
				else if (null == class298 && bool) {
					class298 = new Node();
					Class301_Sub1.aClass437_7637.connect(class298, (long) i_0_);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("sg.aes(").append(')').toString());
		}
	}

	static final void method5874(ScriptRuntime runtime) {
		try {
			runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = ((Class365_Sub1) runtime.anSceneObject_5233).method4363();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("sg.apc(").append(')').toString());
		}
	}

	static final void method5875(ScriptRuntime class403, byte i) {
		try {
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = GameClient.aBoolean8646 ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("sg.ako(").append(')').toString());
		}
	}

	static final void method5876(ScriptRuntime class403, int i) {
		try {
			int i_1_ = (class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]);
			Class352 class352 = Class363.aClass339_3931.method4116(i_1_);
			if (null == class352.aString3792)
				class403.objectStack[((class403.objectArgs += 969361751) * -203050393) - 1] = "";
			else
				class403.objectStack[((class403.objectArgs += 969361751) * -203050393) - 1] = class352.aString3792;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("sg.ame(").append(')').toString());
		}
	}

	static final void method5877(ScriptRuntime class403, int i) {
		try {
			IComponentScripter IComponentScripter = (class403.currentInstrBool ? class403.aIComponentScripter_5247 : class403.aIComponentScripter_5246);
			IComponentDefinition class105 = IComponentScripter.componentDefinition;
			int i_2_ = (class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]);
			Class497 class497 = Class92.aClass504_905.get(i_2_);
			if (class497.method6206())
				class403.objectStack[((class403.objectArgs += 969361751) * -203050393) - 1] = class105.getString(i_2_, class497.aString6101);
			else
				class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919) - 1] = class105.method1117(i_2_, -388931549 * class497.size);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("sg.pi(").append(')').toString());
		}
	}

	static final void method5878(ScriptRuntime class403, int i) {
		try {
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = Class190.windowMode();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("sg.aex(").append(')').toString());
		}
	}

	static final void method5879() {
		try {
			StaticMethods.aClass375_6196.method4647(5);
			Class151.aClass451_6358.method5930(5);
			Js5Configs.idkList.method1582(5);
			GameClient.myRegion.getObjectDefinitionLoader().method5794(5, (byte) 49);
			NPCDefinitionLoader.npcList.method6275(5);
			Js5Configs.itemList.method6090(5);
			Js5Configs.animsList.method4904(5);
			SpotTypeLoader.loader.method4859(5);
			Class472.configLoader.method3826(5);
			Class440.aClass205_5582.method1916(5, (byte) 0);
			StaticMethods.aClass445_8384.method5894(5);
			Class82_Sub16.aClass427_6886.method5746(5, 1584837468);
			Class99.aClass517_951.method6304(5);
			Class299.aClass370_3199.method4573(5, 181310577);
			Class94.aClass349_913.method4200(5, (byte) -101);
			Class363.aClass339_3931.method4117(5);
			ConfigType.aClass487_1463.method6163(5, -718074838);
			Class92.aClass504_905.method6249(5, (byte) 46);
			Js5Configs.configList.method3847(5);
			Class138_Sub1.configs.method1469(5, (short) -24291);
			StaticMethods.aClass499_6668.method6215(5, -1366340541);
			Class_na.cursorDefLoader.method6174(5, (byte) 1);
			HitsplatDefinitionLoader.aClass347_6117.method4178(5);
			Class284.method2692(5);
			StaticMethods.method2197(50);
			StaticMethods5.fonts.method1881(50);
			HintIcon.method6141(5);
			Class462.method2496(5);
			GameClient.aClass348_8780.method4186(5);
			GameClient.aClass348_8898.method4186(5);
			GameClient.aClass348_8697.method4186(5);
			Class436.aClass348_5500.method4186(5);
			Class388.cache.method4186(5);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("sg.gf(").append(')').toString());
		}
	}
}
