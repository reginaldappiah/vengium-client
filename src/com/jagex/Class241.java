package com.jagex;/* Class241 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class241 {
	public static IPAddress lobbyConnectionInfo;
    static Class4 aClass4_2707;

	Class241() throws Throwable {
		throw new Error();
	}

	static final void method2247(IComponentDefinition componentDefinition, IComponentDefinitionCollection IComponentDefinitionCollection, ScriptRuntime runtime) {
		try {
			componentDefinition.orthogonal = (runtime.integerStack[(runtime.integerStackOffset -= -391880689) * 681479919]) == 1;
			StaticMethods.updateComponentTick(componentDefinition);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("kc.et(").append(')').toString());
		}
	}

	static final void method2248(IComponentDefinition component, ScriptRuntime runtime) {
		try {
			runtime.integerStackOffset -= -783761378;
			int optionsLength = 10;
			int i_1_ = (runtime.integerStack[runtime.integerStackOffset * 681479919]);
			int i_2_ = (runtime.integerStack[1 + runtime.integerStackOffset * 681479919]);
			Class127.method1423(component, optionsLength, i_1_, i_2_);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("kc.ki(").append(')').toString());
		}
	}
}
