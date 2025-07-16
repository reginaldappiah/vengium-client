package com.jagex;/* Class363 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class363 {
	int anInt3919;
	int anInt3920;
	int anInt3921;
	int anInt3922;
	int anInt3923;
	int anInt3924;
	int anInt3925;
	int anInt3926;
	int anInt3927;
	int anInt3928;
	int anInt3929;
	int anInt3930;
	public static Class339 aClass339_3931;

	Class363() {
		/* empty */
	}

	boolean method4313(Class363 class363_0_, byte i) {
		try {
            return (60582813 * this.anInt3926 == class363_0_.anInt3926 * 60582813) && (this.anInt3929 * 915630045 == class363_0_.anInt3929 * 915630045) && (this.anInt3919 * -1989166667 == class363_0_.anInt3919 * -1989166667);
        } catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("pc.a(").append(')').toString());
		}
	}

	static final void method4314(IComponentDefinition componentDefinition, IComponentDefinitionCollection IComponentDefinitionCollection, ScriptRuntime runtime) {
		try {
			runtime.integerStackOffset -= -783761378;
			int i_1_ = (runtime.integerStack[runtime.integerStackOffset * 681479919]);
			int i_2_ = (runtime.integerStack[1 + runtime.integerStackOffset * 681479919]);
			if (-1 == i_1_ && i_2_ == -1)
				componentDefinition.aClass105_1233 = null;
			else
				componentDefinition.aClass105_1233 = IComponentDefinition.getContainerComponent(i_1_, i_2_);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("pc.iv(").append(')').toString());
		}
	}

	static boolean method4315(int i, int i_3_) {
		try {
			return i == 14 || i == 18;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("pc.fm(").append(')').toString());
		}
	}
}
