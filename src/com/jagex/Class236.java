package com.jagex;/* Class236 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class236 {
	static IComponentDefinition aClass105_2606;

	Class236() throws Throwable {
		throw new Error();
	}

	static final void method2189(ScriptRuntime runtime) {
		try {
			runtime.integerStackOffset -= -1175642067;
			int i_5_ = (runtime.integerStack[681479919 * runtime.integerStackOffset]);
			int i_6_ = (runtime.integerStack[runtime.integerStackOffset * 681479919 + 1]);
			int i_7_ = (runtime.integerStack[runtime.integerStackOffset * 681479919 + 2]);
			Class301_Sub1.method3713(8, i_5_ << 16 | i_6_, i_7_, "");
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("jy.all(").append(')').toString());
		}
	}

	public static Class298_Sub52 method2190() {
		try {
			if (Class301_Sub1.aClass453_3236 == null || null == Class301_Sub1.aClass446_7634)
				return null;
			Class301_Sub1.aClass446_7634.method5898(Class301_Sub1.aClass453_3236, 1595014600);
			Class298_Sub52 class298_sub52 = ((Class298_Sub52) Class301_Sub1.aClass446_7634.getNext(1453357547));
			if (class298_sub52 == null)
				return null;
			Class352 class352 = Class301_Sub1.aClass339_3251.method4116((-530122905 * (class298_sub52.anInt7608)));
			if (null == class352 || !class352.aBoolean3816 || !class352.method4237(Class301_Sub1.anInterface23_3223))
				return FrameBufferContext.method567(-20548648);
			return class298_sub52;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("jy.cn(").append(')').toString());
		}
	}

	static final void method2191(ScriptRuntime runtime) {
		try {
			IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
			IComponentDefinition component = IComponentScripter.componentDefinition;
			IComponentDefinitionCollection IComponentDefinitionCollection = IComponentScripter.IComponentDefinitionCollection;
			ToMoveIComponentScripts.method2787(component, runtime);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("jy.fh(").append(')').toString());
		}
	}
}
