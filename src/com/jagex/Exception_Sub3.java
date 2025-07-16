package com.jagex;/* Exception_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Exception_Sub3 extends Exception {

	Exception_Sub3(Class109 class109, int i, int i_0_) {
		super();
	}

	public static IComponentDefinitionCollection method275(int i, byte i_1_) {
		try {
			return IComponentDefinition.getIComponentDefinitionCollections[i >> 16];
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aev.b(").append(')').toString());
		}
	}
}
