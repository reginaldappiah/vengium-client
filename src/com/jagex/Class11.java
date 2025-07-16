package com.jagex;/* Class11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.utils.TimeUtils;

public class Class11 {
	static int anInt141 = 20074;
	static int anInt142 = 5030;
	static int anInt143 = 503;
	static long aLong144 = 64425238954L;
	static int anInt145 = 12010;
	static int anInt146 = 5033;
	static int anInt147 = 2018;
	static float aFloat148 = 1.1F;
	static int anInt149 = 10033;
	static int anInt150 = 1003;
	static int anInt151 = 101;
	static long aLong152 = 60129613779L;
	public static boolean aBoolean153 = false;
	public static boolean aBoolean154 = false;
	public static boolean aBoolean155 = false;
	public static int anInt156;

	Class11() throws Throwable {
		throw new Error();
	}

	static final void method326(ScriptRuntime runtime) {
			int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
			IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceHash);
			IComponentDefinitionCollection IComponentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[interfaceHash >> 16];
			ToMoveIComponentScripts.setModelZoom(componentDefinition, IComponentDefinitionCollection, runtime);
	}

	static final void method327(ScriptRuntime runtime) {
		try {
			runtime.integerStackOffset -= -783761378;
			int i_1_ = (runtime.integerStack[681479919 * runtime.integerStackOffset]);
			int i_2_ = (runtime.integerStack[1 + runtime.integerStackOffset * 681479919]);
			Class497 class497 = Class92.aClass504_905.get(i_2_);
			if (class497.method6206())
				runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393) - 1] = Class363.aClass339_3931.method4116(i_1_).method4239(i_2_, class497.aString6101);
			else
				runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = (Class363.aClass339_3931.method4116(i_1_).method4241(i_2_, -388931549 * class497.size));
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("al.amg(").append(')').toString());
		}
	}

	static int method328(byte[] is, int i, int i_3_) {
		try {
			int i_5_ = -1;
			for (int i_6_ = i; i_6_ < i_3_; i_6_++)
				i_5_ = i_5_ >>> 8 ^ (Buffer.anIntArray7614[(i_5_ ^ is[i_6_]) & 0xff]);
			i_5_ ^= 0xffffffff;
			return i_5_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("al.a(").append(')').toString());
		}
	}

	static void method329() {
		try {
			Class79.anInt734 = 0;
			StaticMethods.aClass298_Sub13_5337 = null;
			Class298_Sub32_Sub22.aClass272_9466 = null;
			Class79.JS5_MUSIC = null;
			Class79.aClass298_Sub19_Sub1_748 = null;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("al.v(").append(')').toString());
		}
	}

	static final void method330(ScriptRuntime class403, byte i) {
		try {
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = (null != WorldMapHandler.aClass298_Sub37_Sub13_3218 ? -947282109 * WorldMapHandler.aClass298_Sub37_Sub13_3218.anInt9643 : -1);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("al.aea(").append(')').toString());
		}
	}

	static final void method331(ScriptRuntime class403, int i) {
		try {
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = (int) (PaddedResourceWorker.aLong2748 * -536549149186981023L / 60000L);
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = (int) ((PaddedResourceWorker.aLong2748 * -536549149186981023L - TimeUtils.getTime() - IntNode.intNodeKey * -7323824110069770829L) / 60000L);
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = Class510.aBoolean6222 ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("al.amh(").append(')').toString());
		}
	}
}
