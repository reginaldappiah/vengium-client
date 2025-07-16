package com.jagex;/* Class335 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;
import java.util.Stack;

public class Class335 {
	public Class365_Sub1 aClass365_Sub1_3616;
	boolean aBoolean3617;
	Class324 aClass324_3618;
	static Stack stack = new Stack();

	public boolean method4084(GraphicsToolkit class_ra, int i, int i_0_, int i_1_) {
		try {
			int i_2_ = aClass365_Sub1_3616.method4356();
			if (null != aClass365_Sub1_3616.aClass302_Sub1Array7726) {
				for (int i_3_ = 0; i_3_ < aClass365_Sub1_3616.aClass302_Sub1Array7726.length; i_3_++) {
					aClass365_Sub1_3616.aClass302_Sub1Array7726[i_3_].anInt7645 <<= i_2_;
					if ((aClass365_Sub1_3616.aClass302_Sub1Array7726[i_3_].method3719((1152678761 * (this.aClass324_3618.anInt3447)) + i, (1804353071 * (this.aClass324_3618.anInt3445)) + i_0_)) && aClass365_Sub1_3616.method4350(class_ra, i, i_0_, (byte) 1)) {
						aClass365_Sub1_3616.aClass302_Sub1Array7726[i_3_].anInt7645 >>= i_2_;
						return true;
					}
					aClass365_Sub1_3616.aClass302_Sub1Array7726[i_3_].anInt7645 >>= i_2_;
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ny.p(").append(')').toString());
		}
	}

	public static void method764() {
			synchronized (stack) {
				stack = new Stack();
			}
	}

	Class335() {
		/* empty */
	}

	static final void method4085(ScriptRuntime runtime) {
		try {
			Class106.method1137(1451563513);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ny.agj(").append(')').toString());
		}
	}

	static void method4086() {
			if (GameClient.activeGraphicsToolkit.method5051()) {
				GameClient.activeGraphicsToolkit.detachRenderContext(DirectXContext.canvas);
				StaticMethods.method2528();
				Dimension dimension = DirectXContext.canvas.getSize();
				GameClient.activeGraphicsToolkit.attach((DirectXContext.canvas), dimension.width, dimension.height);
				GameClient.activeGraphicsToolkit.method5003(DirectXContext.canvas);
			} else
				Class370.loadingPleaseWait(SettingsManager.settingsManager.toolkitSetting.getValue(), false);
			StaticMethods.method4301();
	}

	static final void method4087(ScriptRuntime class403, int i) {
		try {
			int i_4_ = (class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]);
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = Character.toUpperCase((char) i_4_);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ny.aan(").append(')').toString());
		}
	}

	static final void method4088(ScriptRuntime class403, int i) {
		try {
			int i_5_ = (class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]);
			Class298_Sub37_Sub8 class298_sub37_sub8 = GraphicsToolkit.aClass256_5315.method2441(i_5_, -1382788353);
			if (class298_sub37_sub8.anIntArray9599 == null)
				class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919) - 1] = 0;
			else
				class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919) - 1] = class298_sub37_sub8.anIntArray9599.length;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ny.acj(").append(')').toString());
		}
	}
}
