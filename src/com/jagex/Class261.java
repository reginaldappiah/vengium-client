package com.jagex;/* Class261 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class261 implements Comparable {
	long aLong2821;
	Object anObject2822;
	long aLong2823;
	Object anObject2824;
	static int anInt2825;

	int method2462(Class261 class261_0_, int i) {
		try {
			if (-547428082756159857L * this.aLong2821 < -547428082756159857L * class261_0_.aLong2821)
				return -1;
			if (-547428082756159857L * this.aLong2821 > -547428082756159857L * class261_0_.aLong2821)
				return 1;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("kx.a(").append(')').toString());
		}
	}

	public int compareTo(Object object) {
		try {
			return method2462((Class261) object, -1964859807);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("kx.compareTo(").append(')').toString());
		}
	}

	Class261(Object object, Object object_1_) {
		this.anObject2822 = object;
		this.anObject2824 = object_1_;
	}

	public boolean equals(Object object) {
		try {
			if (object instanceof Class261)
				return this.anObject2824.equals(((Class261) object).anObject2824);
			throw new IllegalArgumentException();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("kx.equals(").append(')').toString());
		}
	}

	static final void method2463(IComponentDefinition class105, IComponentDefinitionCollection IComponentDefinitionCollection, ScriptRuntime class403, byte i) {
		try {
			String string = (String) (class403.objectStack[(class403.objectArgs -= 969361751) * -203050393]);
			if (Class298_Sub6.method2863(string, class403) != null)
				string = string.substring(0, string.length() - 1);
			class105.onTargetLeaveHook = Class128_Sub2.method1441(string, class403);
			class105.hasScript = true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("kx.lv(").append(')').toString());
		}
	}

	static final void method2464(ScriptRuntime runtime) {
		try {
			int i_2_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
			IComponentDefinition class105 = IComponentDefinition.getInterfaceComponent(i_2_);
			IComponentDefinitionCollection IComponentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[i_2_ >> 16];
			Class118.method1288(class105, runtime);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("kx.km(").append(')').toString());
		}
	}

}
