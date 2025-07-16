package com.jagex;/* Class133 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.utils.CameraUtils;

public class Class133 {
	static Class133 aClass133_1509;
	static Class133 aClass133_1510 = new Class133();
	static Class133 aClass133_1511 = new Class133();

    public static Class133[] method1255() {
            return (new Class133[] {aClass133_1510, aClass133_1511, aClass133_1509});
    }

    public int method1482(int i, int i_0_, int i_1_) {
		try {
			int i_2_ = (GameShell.canvasHeight * -1111710645 > i_0_ ? -1111710645 * GameShell.canvasHeight : i_0_);
			if (this == aClass133_1510)
				return 0;
			if (aClass133_1509 == this)
				return i_2_ - i;
			if (aClass133_1511 == this)
				return (i_2_ - i) / 2;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("fj.f(").append(')').toString());
		}
	}

	Class133() {
		/* empty */
	}

	static {
		aClass133_1509 = new Class133();
	}

	static final void method1483(ScriptRuntime runtime) {
		try {
			NPC class365_sub1_sub1_sub2_sub1 = ((NPC) runtime.entity);
			boolean bool = false;
			NPCDefinition class503 = class365_sub1_sub1_sub2_sub1.aClass503_10190;
			if (class503.morphisms != null)
				class503 = class503.morph(Class128.playerVarsProvider);
			if (null != class503)
				bool = class503.isClickable;
			runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = bool ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("fj.apz(").append(')').toString());
		}
	}

	static final void method1484(ScriptRuntime runtime) {
		try {
			IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
			IComponentDefinition class105 = IComponentScripter.componentDefinition;
			IComponentDefinitionCollection IComponentDefinitionCollection = IComponentScripter.IComponentDefinitionCollection;
			Class372_Sub3.method4602(class105, IComponentDefinitionCollection, runtime, 1567634168);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("fj.hr(").append(')').toString());
		}
	}

	static final void method1485(ScriptRuntime runtime) {
		try {
			IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
			IComponentDefinition class105 = IComponentScripter.componentDefinition;
			IComponentDefinitionCollection IComponentDefinitionCollection = IComponentScripter.IComponentDefinitionCollection;
			ToMoveIComponentScripts.method1436(class105, IComponentDefinitionCollection, runtime);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("fj.hz(").append(')').toString());
		}
	}

	static final void method1486(ScriptRuntime class403, byte i) {
		try {
			int i_3_ = (class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]);
			int i_4_ = i_3_ >> 14 & 0x3fff;
			int i_5_ = i_3_ & 0x3fff;
			GameScene gameScene = GameClient.myRegion.getGameScene();
			i_4_ -= -1760580017 * gameScene.gameSceneBaseX;
			if (i_4_ < 0)
				i_4_ = 0;
			else if (i_4_ >= GameClient.myRegion.getMapWidth())
				i_4_ = GameClient.myRegion.getMapWidth();
			i_5_ -= gameScene.gameSceneBaseY * 283514611;
			if (i_5_ < 0)
				i_5_ = 0;
			else if (i_5_ >= GameClient.myRegion.getMapLength())
				i_5_ = GameClient.myRegion.getMapLength();
			GameClient.anInt8753 = 672497503 * ((i_4_ << 9) + 256);
			GameClient.anInt8755 = 957476733 * ((i_5_ << 9) + 256);
			CameraUtils.cameraType = -1469516446;
			Class418.anInt5339 = -1001372047;
			Class100.anInt1081 = 178575833;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("fj.agl(").append(')').toString());
		}
	}
}
