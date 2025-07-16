package com.jagex;/* Class298_Sub40_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub40_Sub10 extends Class298_Sub40 {
	int anInt9718;
	int anInt9719;
	int anInt9720;
	int anInt9721;
	Class160 aClass160_9722;

	void method3509(Buffer class298_sub53) {
		this.anInt9721 = class298_sub53.readUShort() * 703557345;
		this.anInt9719 = class298_sub53.readInt() * -2070878551;
		this.anInt9718 = class298_sub53.readUByte() * 1472973945;
		this.anInt9720 = class298_sub53.readUByte() * -2026849051;
	}

	void method3508(Buffer class298_sub53, int i) {
		try {
			this.anInt9721 = class298_sub53.readUShort() * 703557345;
			this.anInt9719 = class298_sub53.readInt() * -2070878551;
			this.anInt9718 = class298_sub53.readUByte() * 1472973945;
			this.anInt9720 = class298_sub53.readUByte() * -2026849051;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("agp.a(").append(')').toString());
		}
	}

	void method3510(Class162 class162, byte i) {
		try {
			class162.method1767(this.anInt9721 * 1553093921, 1564286361 * this.anInt9719, -549921335 * this.anInt9718, -815095571 * this.anInt9720, 1468096534);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("agp.f(").append(')').toString());
		}
	}

	void method3511(Class162 class162) {
		class162.method1767(this.anInt9721 * 1553093921, 1564286361 * this.anInt9719, -549921335 * this.anInt9718, -815095571 * this.anInt9720, 1036720965);
	}

	void method3512(Buffer class298_sub53) {
		this.anInt9721 = class298_sub53.readUShort() * 703557345;
		this.anInt9719 = class298_sub53.readInt() * -2070878551;
		this.anInt9718 = class298_sub53.readUByte() * 1472973945;
		this.anInt9720 = class298_sub53.readUByte() * -2026849051;
	}

	Class298_Sub40_Sub10(Class160 class160) {
		super();
		this.anInt9721 = -703557345;
	}

	static final void method3515(ScriptRuntime class403, byte i) {
		try {
			class403.integerStackOffset -= -783761378;
			int i_0_ = (class403.integerStack[class403.integerStackOffset * 681479919]);
			boolean bool = 1 == (class403.integerStack[class403.integerStackOffset * 681479919 + 1]);
			SettingsManager.settingsManager.setValue(SettingsManager.settingsManager.desiredToolkit, i_0_);
			if (!bool)
				SettingsManager.settingsManager.setValue(SettingsManager.settingsManager.graphics, 0);
			ToMoveSettings.encodeBuffer();
			GameClient.sentPreferences = false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("agp.aiz(").append(')').toString());
		}
	}
}
