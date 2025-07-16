package com.jagex;/* Class303 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class303 {
	int anInt3260;
	int anInt3261;
	int anInt3262;
	int anInt3263;
	int anInt3264;

	Class303(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		this.anInt3264 = -727927571 * i_0_;
		this.anInt3261 = 1245468715 * i_1_;
		this.anInt3262 = i_2_ * -75483929;
		this.anInt3263 = i_3_ * -821826869;
		this.anInt3260 = (-1374344735 * this.anInt3263 - this.anInt3262 * -193549091);
	}

	static final void method3732(ScriptRuntime class403, byte i) {
		try {
			IComponentScripter IComponentScripter = (class403.currentInstrBool ? class403.aIComponentScripter_5247 : class403.aIComponentScripter_5246);
			IComponentDefinition class105 = IComponentScripter.componentDefinition;
			int i_4_ = (class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]);
			i_4_--;
			if (class105.rightClickOptions == null || i_4_ >= class105.rightClickOptions.length || class105.rightClickOptions[i_4_] == null)
				class403.objectStack[((class403.objectArgs += 969361751) * -203050393) - 1] = "";
			else
				class403.objectStack[((class403.objectArgs += 969361751) * -203050393) - 1] = class105.rightClickOptions[i_4_];
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("mp.pu(").append(')').toString());
		}
	}

	static final void method3733(ScriptRuntime class403, byte i) {
		try {
			class403.integerStackOffset -= -1567522756;
			Class239.method2210((class403.integerStack[class403.integerStackOffset * 681479919]), (class403.integerStack[681479919 * class403.integerStackOffset + 1]), (class403.integerStack[681479919 * class403.integerStackOffset + 2]), (class403.integerStack[3 + 681479919 * class403.integerStackOffset]), 256);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("mp.tz(").append(')').toString());
		}
	}

	static final void method3734(ScriptRuntime class403, int i) {
		try {
			int i_5_ = (class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]);
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = GameClient.stockMarketListing[i_5_].anInt2771 * 5713347;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("mp.yu(").append(')').toString());
		}
	}

	static final void method3735(ScriptRuntime class403, byte i) {
		try {
			class403.integerStackOffset -= -783761378;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("mp.afs(").append(')').toString());
		}
	}

	static final void method3736(ScriptRuntime runtime) {
		try {
			int componentID = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
			IComponentScripter IComponentScripter;
			if (runtime.currentInstrBool)
				IComponentScripter = runtime.aIComponentScripter_5247;
			else
				IComponentScripter = runtime.aIComponentScripter_5246;
			runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = IComponentScripter.clearComponent((runtime.entity.IComponentDefinitionCollection), componentID) ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("mp.aob(").append(')').toString());
		}
	}

	public static final void method3737(Player class365_sub1_sub1_sub2_sub2, int i, int i_7_, byte i_8_, byte i_9_) {
		try {
			int i_10_ = class365_sub1_sub1_sub2_sub2.scenePositionXQueue[0];
			int i_11_ = class365_sub1_sub1_sub2_sub2.scenePositionYQueue[0];
			if (i_10_ >= 0 && i_10_ < GameClient.myRegion.getMapWidth() && i_11_ >= 0 && i_11_ < GameClient.myRegion.getMapLength() && (i >= 0 && i < GameClient.myRegion.getMapWidth() && i_7_ >= 0 && i_7_ < GameClient.myRegion.getMapLength())) {
				int i_12_ = (StaticMethods.calculateRoute(i_10_, i_11_, class365_sub1_sub1_sub2_sub2.getSize(), StaticMethods.method4214(i, i_7_), (GameClient.myRegion.getSceneClipDataPlane(class365_sub1_sub1_sub2_sub2.plane)), true, GameClient.calculatedScenePositionXs, GameClient.calculatedScenePositionYs));
				if (i_12_ >= 1 && i_12_ <= 3) {
					for (int i_13_ = 0; i_13_ < i_12_ - 1; i_13_++)
						class365_sub1_sub1_sub2_sub2.method4473(GameClient.calculatedScenePositionXs[i_13_], GameClient.calculatedScenePositionYs[i_13_], i_8_, (byte) 55);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("mp.jl(").append(')').toString());
		}
	}
}
