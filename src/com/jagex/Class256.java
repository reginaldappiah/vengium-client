package com.jagex;/* Class256 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.prefetch.Js5List;

public class Class256 {
	Js5FileSystem aClass243_2796;
	Js5FileSystem aClass243_2797;
	SoftCache aClass348_2798 = new SoftCache(64);
	static int anInt2799 = 0;
	static int anInt2800 = 32768;
	public static int anInt2801;

	public Class298_Sub37_Sub8 method2441(int i, int i_0_) {
		try {
			Class298_Sub37_Sub8 class298_sub37_sub8 = ((Class298_Sub37_Sub8) this.aClass348_2798.get((long) i));
			if (null != class298_sub37_sub8)
				return class298_sub37_sub8;
			byte[] is;
			if (i >= 32768)
				is = this.aClass243_2797.getFileFromArchive(0, i & 0x7fff);
			else
				is = this.aClass243_2796.getFileFromArchive(0, i);
			class298_sub37_sub8 = new Class298_Sub37_Sub8();
			if (is != null)
				class298_sub37_sub8.method3430(new Buffer(is), 754160666);
			if (i >= 32768)
				class298_sub37_sub8.method3432(-1787095576);
			this.aClass348_2798.put(class298_sub37_sub8, (long) i);
			return class298_sub37_sub8;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ks.a(").append(')').toString());
		}
	}

	public Class256(Js5FileSystem class243, Js5FileSystem class243_1_) {
		this.aClass243_2796 = class243;
		this.aClass243_2797 = class243_1_;
		if (this.aClass243_2796 != null)
			this.aClass243_2796.getFileSystem(0);
		if (this.aClass243_2797 != null)
			this.aClass243_2797.getFileSystem(0);
	}

	static final void method2442(ScriptRuntime class403, int i) {
		try {
			IComponentScripter IComponentScripter = (class403.currentInstrBool ? class403.aIComponentScripter_5247 : class403.aIComponentScripter_5246);
			IComponentDefinition class105 = IComponentScripter.componentDefinition;
			IComponentDefinitionCollection IComponentDefinitionCollection = IComponentScripter.IComponentDefinitionCollection;
			ToMoveIComponentScripts.method4891(class105, IComponentDefinitionCollection, class403);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ks.hf(").append(')').toString());
		}
	}

	static final void method2443(ScriptRuntime runtime) {
		try {
			int componentID = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
			IComponentDefinition component = IComponentDefinition.getInterfaceComponent(componentID);
			IComponentDefinitionCollection IComponentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[componentID >> 16];
			ToMoveIComponentScripts.SET_TARGET_OVER_AND_LEAVE(component, runtime);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ks.jv(").append(')').toString());
		}
	}

	static final void method2444(ScriptRuntime class403, int i) {
		try {
			int i_3_ = (class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]);
			IComponentDefinition class105 = IComponentDefinition.getInterfaceComponent(i_3_);
			IComponentDefinitionCollection IComponentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[i_3_ >> 16];
			ToMoveIComponentScripts.method1699(class105, class403);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ks.lo(").append(')').toString());
		}
	}

	static final void method2445(ScriptRuntime class403, int i) {
		try {
			String string = (String) (class403.objectStack[(class403.objectArgs -= 969361751) * -203050393]);
			class403.integerStackOffset -= -783761378;
			int i_4_ = (class403.integerStack[class403.integerStackOffset * 681479919]);
			int i_5_ = (class403.integerStack[1 + class403.integerStackOffset * 681479919]);
			RSFontMetrics class505 = Class322.getFontMetricFileData(Js5List.JS5_FONTMETRICS, i_5_, 0);
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = class505.method6262(string, i_4_, StaticMedia.nameIconSprites);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ks.zf(").append(')').toString());
		}
	}

	static int[] method2446(OutgoingPacketBuffer outgoingPacketBuffer, int i) {
		try {
			Buffer class298_sub53 = new Buffer(518);
			int[] is = new int[4];
			for (int i_6_ = 0; i_6_ < 4; i_6_++)
				is[i_6_] = (int) (Math.random() * 9.9999999E7);
			class298_sub53.writeByte(10);
			class298_sub53.writeInt(is[0]);
			class298_sub53.writeInt(is[1]);
			class298_sub53.writeInt(is[2]);
			class298_sub53.writeInt(is[3]);
			for (int i_7_ = 0; i_7_ < 10; i_7_++)
				class298_sub53.writeInt((int) (Math.random() * 9.9999999E7));
			class298_sub53.writeShort((int) (Math.random() * 9.9999999E7));
			class298_sub53.applyRSA(Class50.LOGIN_RSA_EXPONENT, Class50.LOGIN_RSA_MODULUS);
			outgoingPacketBuffer.payload.writeBytes(class298_sub53.buffer, 0, 385051775 * class298_sub53.offset);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ks.s(").append(')').toString());
		}
	}
}
