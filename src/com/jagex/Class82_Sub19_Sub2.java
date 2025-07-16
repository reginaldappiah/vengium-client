package com.jagex;/* Class82_Sub19_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class82_Sub19_Sub2 extends Class82_Sub19 {
	int anInt9115;
	int anInt9116;
	int anInt9117;

	public void method869() {
		Class87.aClass94Array794[1417242443 * this.anInt9116].method1015().sendGraphics(this.anInt6895 * 720810617, this.anInt6893 * 1369196329 << 16, 87600989 * this.anInt6894, this.anInt9115 * -921351243, false, -1879057895 * this.anInt9117, 313723785);
	}

	public void method866() {
		try {
			Class87.aClass94Array794[1417242443 * this.anInt9116].method1015().sendGraphics(this.anInt6895 * 720810617, this.anInt6893 * 1369196329 << 16, 87600989 * this.anInt6894, this.anInt9115 * -921351243, false, -1879057895 * this.anInt9117, -428895124);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("afo.f(").append(')').toString());
		}
	}

	public void method868() {
		Class87.aClass94Array794[1417242443 * this.anInt9116].method1015().sendGraphics(this.anInt6895 * 720810617, this.anInt6893 * 1369196329 << 16, 87600989 * this.anInt6894, this.anInt9115 * -921351243, false, -1879057895 * this.anInt9117, -1194808341);
	}

	Class82_Sub19_Sub2(Buffer class298_sub53) {
		super(class298_sub53);
		this.anInt9116 = class298_sub53.readUShort() * 467167843;
		this.anInt9117 = class298_sub53.readUByte() * 1155326505;
		this.anInt9115 = class298_sub53.readUShort() * 624790173;
	}

	static void method932(ScriptRuntime runtime) {
		try {
			runtime.integerStack[runtime.integerStackOffset * 681479919 - 2] = (Class316.aClass362_3318.getQuestType((runtime.integerStack[runtime.integerStackOffset * 681479919 - 2])).requiredSkills[(runtime.integerStack[runtime.integerStackOffset * 681479919 - 1])][1]);
			runtime.integerStackOffset -= -391880689;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("afo.z(").append(')').toString());
		}
	}
}
