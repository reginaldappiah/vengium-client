package com.jagex;/* Class257 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.Js5Configs;

public class Class257 {
	static int anInt2802;
	int anInt2803;
	int anInt2804;
	int[][] anIntArrayArray2805;
	static Class298_Sub39 aClass298_Sub39_2806 = new Class298_Sub39(0, 0);
	int anInt2807;
	int anInt2808 = 0;
	NodeCollection aClass458_2809;
	public boolean aBoolean2810;
	Class298_Sub39[] aClass298_Sub39Array2811;

	final void method2447() {
		try {
			for (int i_0_ = 0; i_0_ < this.anInt2804 * -1845310689; i_0_++)
				this.anIntArrayArray2805[i_0_] = null;
			this.aClass298_Sub39Array2811 = null;
			this.anIntArrayArray2805 = null;
			this.aClass458_2809.method5972(-1936025325);
			this.aClass458_2809 = null;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("kt.a(").append(')').toString());
		}
	}

	public final int[] method2448(int i) {
		try {
			if (this.anInt2804 * -1845310689 != this.anInt2803 * 1036538653) {
				if (this.anInt2804 * -1845310689 != 1) {
					Class298_Sub39 class298_sub39 = this.aClass298_Sub39Array2811[i];
					if (class298_sub39 == null) {
						aBoolean2810 = true;
						if (this.anInt2808 * 851327335 >= -1845310689 * this.anInt2804) {
							Class298_Sub39 class298_sub39_2_ = ((Class298_Sub39) this.aClass458_2809.method5964(975410288));
							class298_sub39 = new Class298_Sub39(i, ((class298_sub39_2_.anInt7419) * -1113693749));
							this.aClass298_Sub39Array2811[1544880463 * class298_sub39_2_.anInt7418] = null;
							class298_sub39_2_.unlink();
						} else {
							class298_sub39 = new Class298_Sub39(i, (this.anInt2808) * 851327335);
							this.anInt2808 += -1189293481;
						}
						this.aClass298_Sub39Array2811[i] = class298_sub39;
					} else
						aBoolean2810 = false;
					this.aClass458_2809.method5965(class298_sub39, 943102582);
					return (this.anIntArrayArray2805[(-1113693749 * class298_sub39.anInt7419)]);
				}
				aBoolean2810 = i != this.anInt2807 * -101586551;
				this.anInt2807 = i * 2063162553;
				return this.anIntArrayArray2805[0];
			}
			aBoolean2810 = null == this.aClass298_Sub39Array2811[i];
			this.aClass298_Sub39Array2811[i] = aClass298_Sub39_2806;
			return this.anIntArrayArray2805[i];
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("kt.f(").append(')').toString());
		}
	}

	public final int[][] method2449(int i) {
		try {
			if (1036538653 * this.anInt2803 != -1845310689 * this.anInt2804)
				throw new RuntimeException();
			for (int i_3_ = 0; i_3_ < -1845310689 * this.anInt2804; i_3_++)
				this.aClass298_Sub39Array2811[i_3_] = aClass298_Sub39_2806;
			return this.anIntArrayArray2805;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("kt.b(").append(')').toString());
		}
	}

	Class257(int i, int i_4_, int i_5_) {
		this.anInt2807 = -2063162553;
		this.aClass458_2809 = new NodeCollection();
		aBoolean2810 = false;
		this.anInt2803 = i_4_ * -1955264715;
		this.anInt2804 = i * -1906511649;
		this.anIntArrayArray2805 = new int[-1845310689 * this.anInt2804][i_5_];
		this.aClass298_Sub39Array2811 = new Class298_Sub39[this.anInt2803 * 1036538653];
	}

	static void method2450(ScriptRuntime runtime) {
		try {
			runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393 - 1)] = (Class316.aClass362_3318.getQuestType((runtime.integerStack[runtime.integerStackOffset * 681479919 - 2])).requiredVarpBitsText[(runtime.integerStack[681479919 * runtime.integerStackOffset - 1])]);
			runtime.integerStackOffset -= -783761378;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("kt.e(").append(')').toString());
		}
	}

	static final void method2451(IComponentDefinition componentDefinition, IComponentDefinitionCollection IComponentDefinitionCollection, ScriptRuntime runtime) {
		try {
			String string = (String) (runtime.objectStack[(runtime.objectArgs -= 969361751) * -203050393]);
			if (Class298_Sub6.method2863(string, runtime) != null)
				string = string.substring(0, string.length() - 1);
			componentDefinition.anObjectArray1271 = Class128_Sub2.method1441(string, runtime);
			componentDefinition.hasScript = true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("kt.ob(").append(')').toString());
		}
	}

	static final void method2452(ScriptRuntime runtime) {
		try {
			int i_6_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
			ItemDefinition class468 = Js5Configs.itemList.getItemDefinitions(i_6_);
			if (-1673957995 * class468.certTemplateID >= 0 && 809765849 * class468.certID >= 0)
				runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = class468.certID * 809765849;
			else
				runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = i_6_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("kt.aag(").append(')').toString());
		}
	}

	static final void method2453(boolean bool, byte i) {
		try {
			StaticMethods.method1033(GameClient.WINDOW_PANE_ID * -257444687, -2110394505 * GameShell.canvasWidth, GameShell.canvasHeight * -1111710645, bool);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("kt.kg(").append(')').toString());
		}
	}

	static final void method2454(ScriptRuntime runtime) {
		try {
			int i_7_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
			Class298_Sub37_Sub13 class298_sub37_sub13 = Class298_Sub7.method2864();
			if (null != class298_sub37_sub13) {
				boolean bool = class298_sub37_sub13.method3453(i_7_ >> 28 & 0x3, i_7_ >> 14 & 0x3fff, i_7_ & 0x3fff, Class388.anIntArray4156);
				if (bool) {
					runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = Class388.anIntArray4156[1];
					runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = Class388.anIntArray4156[2];
				} else {
					runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = -1;
					runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = -1;
				}
			} else {
				runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = -1;
				runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = -1;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("kt.aep(").append(')').toString());
		}
	}
}
