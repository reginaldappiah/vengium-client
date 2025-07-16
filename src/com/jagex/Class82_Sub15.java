package com.jagex;/* Class82_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class82_Sub15 extends Class82 {
	int anInt6876;
	int anInt6877;
	int anInt6878;
	int anInt6879;
	Class297 aClass297_6880;

	void method913() {
		if (this.aClass297_6880 != null) {
			StaticMethods.method4957(this.aClass297_6880);
			this.aClass297_6880 = null;
		}
	}

	public void method866() {
		try {
			this.aClass297_6880 = (ToMoveSettings.method3913(this.anInt6878 * 772949935, 190389055 * this.anInt6879, 0, 1498822233 * this.anInt6877, false, this.anInt6876 * -715391467));
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("yc.f(").append(')').toString());
		}
	}

	void method867(int i) {
		try {
			if (this.aClass297_6880 != null) {
				StaticMethods.method4957(this.aClass297_6880);
				this.aClass297_6880 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("yc.b(").append(')').toString());
		}
	}

	public void method868() {
		this.aClass297_6880 = (ToMoveSettings.method3913(this.anInt6878 * 772949935, 190389055 * this.anInt6879, 0, 1498822233 * this.anInt6877, false, this.anInt6876 * -715391467));
	}

	public void method869() {
		this.aClass297_6880 = (ToMoveSettings.method3913(this.anInt6878 * 772949935, 190389055 * this.anInt6879, 0, 1498822233 * this.anInt6877, false, this.anInt6876 * -715391467));
	}

	Class82_Sub15(Buffer class298_sub53) {
		super(class298_sub53);
		this.anInt6878 = class298_sub53.readUShort() * 1944678223;
		this.anInt6877 = class298_sub53.readUByte() * 2013114857;
		this.anInt6876 = class298_sub53.readUByte() * 146071869;
		this.anInt6879 = class298_sub53.readUByte() * -211004225;
	}

	static final void method914(ScriptRuntime runtime) {
		try {
			IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
			IComponentDefinition class105 = IComponentScripter.componentDefinition;
			runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = class105.xAngle * 7329457;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("yc.pj(").append(')').toString());
		}
	}

	static final void method916(ScriptRuntime runtime) {
		try {
			int i_0_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
			IComponentDefinition class105 = IComponentDefinition.getInterfaceComponent(i_0_);
			runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = class105.xOffset * -407676483;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("yc.rp(").append(')').toString());
		}
	}
}
