package com.jagex;/* Class82_Sub19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.Js5Configs;
import com.jagex.game.cache.definition.animation.AnimationDefinition;

public abstract class Class82_Sub19 extends Class82 {
	int anInt6893;
	int anInt6894;
	int anInt6895;

	Class82_Sub19(Buffer class298_sub53) {
		super(class298_sub53);
		this.anInt6895 = class298_sub53.readUShort() * -752019511;
		this.anInt6894 = class298_sub53.readUShort() * -1262871307;
		this.anInt6893 = class298_sub53.readUByte() * 1089946905;
	}

	boolean method870() {
		try {
			SpotType class398 = SpotTypeLoader.loader.get((720810617 * this.anInt6895));
			boolean bool = class398.method4919();
			AnimationDefinition class391 = Js5Configs.animsList.get(1505778629 * class398.animationID);
			bool &= class391.ready();
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ym.p(").append(')').toString());
		}
	}

	boolean method924() {
		SpotType class398 = (SpotTypeLoader.loader.get(720810617 * this.anInt6895));
		boolean bool = class398.method4919();
		AnimationDefinition class391 = Js5Configs.animsList.get(1505778629 * class398.animationID);
		bool &= class391.ready();
		return bool;
	}

	static final void method925(IComponentDefinition class105, IComponentDefinitionCollection IComponentDefinitionCollection, ScriptRuntime class403, int i) {
		try {
			class105.flipV = (class403.integerStack[(class403.integerStackOffset -= -391880689) * 681479919]) == 1;
			StaticMethods.updateComponentTick(class105);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ym.fo(").append(')').toString());
		}
	}

	public static void method926() {
		try {
			if (Class229.anInt6459 * 1100796341 != -1) {
				Class74.method830(Class229.anInt6459 * 1100796341, -1, -1, false);
				Class229.anInt6459 = -678712477;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ym.cx(").append(')').toString());
		}
	}

	static final void method927(ScriptRuntime runtime) {
		try {
			int i_0_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
			String string = (String) (runtime.objectStack[(runtime.objectArgs -= 969361751) * -203050393]);
			if (-1 == i_0_)
				throw new RuntimeException();
			ClientScriptMap class483 = Class51.aClass475_506.getClientScriptMap(i_0_);
			if ('s' != class483.aChar6037)
				throw new RuntimeException();
			int[] is = class483.method6128(string);
			int i_1_ = 0;
			if (null != is)
				i_1_ = is.length;
			runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = i_1_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ym.vf(").append(')').toString());
		}
	}

	static final void method928(ScriptRuntime runtime) {
		try {
			IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
			IComponentDefinition class105 = IComponentScripter.componentDefinition;
			IComponentDefinitionCollection IComponentDefinitionCollection = IComponentScripter.IComponentDefinitionCollection;
			ToMoveIComponentScripts.method3947(class105, IComponentDefinitionCollection, runtime);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ym.gr(").append(')').toString());
		}
	}

	static final void method929(ScriptRuntime class403, int i) {
		try {
			int i_2_ = (class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]);
			IComponentDefinition class105 = IComponentDefinition.getInterfaceComponent(i_2_);
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = 840270937 * class105.angle2D;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ym.rc(").append(')').toString());
		}
	}

	static final void method930(ScriptRuntime class403, int i) {
		try {
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = -1102843797 * class403.aClass162_5252.anInt1669;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ym.xg(").append(')').toString());
		}
	}
}
