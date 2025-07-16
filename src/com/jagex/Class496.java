package com.jagex;/* Class496 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class496 {
	Class487 aClass487_6095;
	public int anInt6096;
	public int anInt6097;
	public boolean aBoolean6098 = false;

	void method6196(Buffer class298_sub53, int i) {
		try {
			for (;;) {
				int i_0_ = class298_sub53.readUByte();
				if (i_0_ == 0) {
					if (i != -1377008682) {
						/* empty */
					}
					break;
				}
				method6199(class298_sub53, i_0_, 227910133);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ul.a(").append(')').toString());
		}
	}

	public boolean method6197() {
		try {
			return this.aClass487_6095.aClass243_6068.exists(anInt6097 * 1690480405);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ul.p(").append(')').toString());
		}
	}

	public SpriteToolkit method6198(GraphicsToolkit graphicsToolkit, int i, boolean bool) {
		try {
			long l = (long) (anInt6097 * 1690480405 | i << 16 | (bool ? 262144 : 0) | graphicsToolkit.id * 580915349 << 19);
			SpriteToolkit class57 = (SpriteToolkit) this.aClass487_6095.aClass348_6065.get(l);
			if (class57 != null)
				return class57;
			if (!this.aClass487_6095.aClass243_6068.exists(anInt6097 * 1690480405))
				return null;
			Sprite class89 = Sprite.loadFirst((this.aClass487_6095.aClass243_6068), 1690480405 * anInt6097, 0);
			if (null != class89) {
				Sprite class89_2_ = class89;
				Sprite class89_3_ = class89;
				Sprite class89_4_ = class89;
				class89.offsetY = 0;
				class89_4_.deltaWidth = 0;
				class89_3_.offsetX = 0;
				class89_2_.deltaHeight = 0;
				if (bool)
					class89.flipVertically();
				for (int i_5_ = 0; i_5_ < i; i_5_++)
					class89.rotateClockwise();
			}
			class57 = graphicsToolkit.createSpriteToolkit(class89, true);
			if (class57 != null)
				this.aClass487_6095.aClass348_6065.put(class57, l);
			return class57;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ul.b(").append(')').toString());
		}
	}

	void method6199(Buffer class298_sub53, int i, int i_6_) {
		try {
			if (i == 1)
				anInt6097 = class298_sub53.readBigSmart() * 24979517;
			else if (2 == i)
				anInt6096 = class298_sub53.readUTriByte() * 1870808461;
			else if (3 == i)
				aBoolean6098 = true;
			else if (i == 4)
				anInt6097 = -24979517;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ul.f(").append(')').toString());
		}
	}

	Class496() {
		/* empty */
	}

	static final void method6200(ScriptRuntime class403, int i) {
		try {
			int i_7_ = (class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]);
			if (null != Class301_Sub1.aClass437_7636) {
				Node class298 = Class301_Sub1.aClass437_7636.get((long) i_7_);
				class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919) - 1] = class298 != null ? 1 : 0;
			} else
				class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919) - 1] = 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ul.aeo(").append(')').toString());
		}
	}

	static final void method6201(ScriptRuntime class403, int i) {
		try {
			int i_8_ = (class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]);
			if (i_8_ >= 1 && i_8_ <= 2) {
				SettingsManager.settingsManager.setValue(SettingsManager.settingsManager.screenSize, i_8_);
				SettingsManager.settingsManager.setValue(SettingsManager.settingsManager.currentScreen, i_8_);
				ToMoveSettings.encodeBuffer();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ul.afu(").append(')').toString());
		}
	}

	static void method6202(double d) {
		try {
			if (Class298_Sub37_Sub6.aDouble9587 != d) {
				for (int i = 0; i < 256; i++) {
					int i_9_ = (int) (Math.pow((double) i / 255.0, d) * 255.0);
					Class298_Sub37_Sub6.anIntArray9586[i] = i_9_ > 255 ? 255 : i_9_;
				}
				Class298_Sub37_Sub6.aDouble9587 = d;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ul.i(").append(')').toString());
		}
	}

	static final void method6203(ScriptRuntime runtime) {
		try {
			int i_10_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
			IComponentDefinition icomponenetDefinition = IComponentDefinition.getInterfaceComponent(i_10_);
			int generalOptions = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
			generalOptions--;
			if (icomponenetDefinition.rightClickOptions == null || generalOptions >= icomponenetDefinition.rightClickOptions.length || icomponenetDefinition.rightClickOptions[generalOptions] == null)
				runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393) - 1] = "";
			else
				runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393) - 1] = icomponenetDefinition.rightClickOptions[generalOptions];
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ul.sg(").append(')').toString());
		}
	}
}
