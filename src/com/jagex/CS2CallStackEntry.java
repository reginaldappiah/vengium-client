package com.jagex;/* Class402 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class CS2CallStackEntry {
	int integerPos = 377229199;
	static int anInt5227;
	int[] integerLocals;
	CS2ScriptDefinition script;
	long[] longLocals;
	Object[] objectLocals;
	static int anInt5232;

	CS2CallStackEntry() {
		/* empty */
	}

	public static int method4941(int i, int i_0_, int i_1_, int i_2_) {
		try {
			i_1_ &= 0x3;
			if (i_1_ == 0)
				return i;
			if (i_1_ == 1)
				return i_0_;
			if (2 == i_1_)
				return 7 - i;
			return 7 - i_0_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("qr.a(").append(')').toString());
		}
	}
}
