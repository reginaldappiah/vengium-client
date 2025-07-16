package com.jagex;/* Class82_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class82_Sub9 extends Class82 {
	int anInt6857;
	int anInt6858;

	Class82_Sub9(Buffer class298_sub53) {
		super(class298_sub53);
		this.anInt6858 = class298_sub53.readUShort() * 1855434323;
		this.anInt6857 = class298_sub53.readUShort() * -1535090649;
	}

	public void method866() {
		try {
			Class87.aClass94Array794[this.anInt6858 * -712456741].method1015().method4415(1246957463 * this.anInt6857, true, -2120305810);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("xt.f(").append(')').toString());
		}
	}

	public void method868() {
		Class87.aClass94Array794[this.anInt6858 * -712456741].method1015().method4415(1246957463 * this.anInt6857, true, -841249302);
	}

	public void method869() {
		Class87.aClass94Array794[this.anInt6858 * -712456741].method1015().method4415(1246957463 * this.anInt6857, true, -384852587);
	}

	static final void method898(ScriptRuntime runtime) {
		try {
			runtime.integerStackOffset -= -1175642067;
			Class239.method2210((runtime.integerStack[681479919 * runtime.integerStackOffset]), (runtime.integerStack[runtime.integerStackOffset * 681479919 + 1]), (runtime.integerStack[2 + runtime.integerStackOffset * 681479919]), 255, 256);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("xt.st(").append(')').toString());
		}
	}

	public static boolean method899(byte i) {
		try {
			return 0 != Class79.anInt734 * 617004265;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("xt.z(").append(')').toString());
		}
	}

	public static boolean method900(int i, byte i_0_) {
		try {
			return ((i >= -1976050083 * Class424.aClass424_6614.type && i <= Class424.aClass424_6594.type * -1976050083) || Class424.aClass424_6595.type * -1976050083 == i);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("xt.b(").append(')').toString());
		}
	}

	static final int method901(GraphicsToolkit graphicsToolkit, OverlayDefinition overlayDefinition) {
		try {
			if (1728947183 * overlayDefinition.blendColor != -1)
				return 1728947183 * overlayDefinition.blendColor;
			if (overlayDefinition.texture * 324071475 != -1) {
				Class53 class53 = graphicsToolkit.textures.method174((overlayDefinition.texture * 324071475));
				if (!class53.aBoolean524)
					return class53.aShort532;
			}
			return -45966925 * overlayDefinition.color;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("xt.e(").append(')').toString());
		}
	}

	static final void method902(ScriptRuntime class403, byte i) {
		try {
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = SettingsManager.settingsManager.customCursors.getValue() == 1 ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("xt.ajc(").append(')').toString());
		}
	}
}
