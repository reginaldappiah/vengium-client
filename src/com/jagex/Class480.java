package com.jagex;/* Class480 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class480 {
	public long method6108(int i) {
		try {
			return System.nanoTime();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("tu.a(").append(')').toString());
		}
	}

	public Class480() {
		System.nanoTime();
	}

	static final void method6109(ScriptRuntime class403, byte i) {
		try {
			int i_0_ = (class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]);
			IComponentDefinition class105 = IComponentDefinition.getInterfaceComponent(i_0_);
			Class523.method6329(class105, class403);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("tu.qc(").append(')').toString());
		}
	}
}
