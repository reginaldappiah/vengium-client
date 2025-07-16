package com.jagex;/* Class298_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub6 extends Node {
	int anInt7203;
	int anInt7204;
	int anInt7205;
	Class298_Sub52 mapFunctionNode;
	int anInt7207;
	int anInt7208;
	int anInt7209 = -1621269427;
	int anInt7210;
	int anInt7211;

	boolean method2862(int i, int i_0_) {
		try {
			if (i >= this.anInt7209 * -321418373 && i <= -236078983 * this.anInt7204 && i_0_ >= 2086933977 * this.anInt7205 && i_0_ <= -1810755143 * this.anInt7210)
				return true;
            return i >= this.anInt7211 * 1150354879 && i <= 957695249 * this.anInt7208 && i_0_ >= this.anInt7207 * -38089737 && i_0_ <= this.anInt7203 * -1024506197;
        } catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aaj.a(").append(')').toString());
		}
	}

	Class298_Sub6(Class298_Sub52 class298_sub52) {
		this.anInt7204 = -2147483648;
		this.anInt7205 = -447945321;
		this.anInt7210 = -2147483648;
		this.anInt7211 = 390993345;
		this.anInt7208 = -2147483648;
		this.anInt7207 = 1232771641;
		this.anInt7203 = -2147483648;
		this.mapFunctionNode = class298_sub52;
	}

	static final int[] method2863(String string, ScriptRuntime runtime) {
		try {
			int[] is = null;
			if (string.length() > 0 && string.charAt(string.length() - 1) == 'Y') {
				int i_2_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
				if (i_2_ > 0) {
					is = new int[i_2_];
					while (i_2_-- > 0)
						is[i_2_] = (runtime.integerStack[(runtime.integerStackOffset -= -391880689) * 681479919]);
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aaj.kl(").append(')').toString());
		}
	}
}
