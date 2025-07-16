package com.jagex;/* Class298_Sub40 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class298_Sub40 extends Node {
	abstract void method3508(Buffer class298_sub53, int i);

	abstract void method3509(Buffer class298_sub53);

	abstract void method3510(Class162 class162, byte i);

	abstract void method3511(Class162 class162);

	abstract void method3512(Buffer class298_sub53);

	Class298_Sub40() {
		/* empty */
	}

	static final void method3513(ScriptRuntime class403, byte i) {
		try {
			class403.integerStackOffset -= -1175642067;
			int i_0_ = (class403.integerStack[class403.integerStackOffset * 681479919]);
			int i_1_ = (class403.integerStack[681479919 * class403.integerStackOffset + 1]);
			int i_2_ = (class403.integerStack[2 + class403.integerStackOffset * 681479919]);
			IComponentDefinition class105 = IComponentDefinition.getInterfaceComponent(i_2_);
			Class523.method6330(class105, i_0_, i_1_);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aby.sq(").append(')').toString());
		}
	}
}
