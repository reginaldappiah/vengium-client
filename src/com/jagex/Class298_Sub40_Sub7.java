package com.jagex;/* Class298_Sub40_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub40_Sub7 extends Class298_Sub40 {
	Class160 aClass160_9709;
	int anInt9710;

	void method3512(Buffer class298_sub53) {
		this.anInt9710 = class298_sub53.readUShort() * -489279757;
	}

	void method3508(Buffer class298_sub53, int i) {
		try {
			this.anInt9710 = class298_sub53.readUShort() * -489279757;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("agm.a(").append(')').toString());
		}
	}

	void method3510(Class162 class162, byte i) {
		try {
			class162.method1768((2034735675 * this.anInt9710), (byte) -37);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("agm.f(").append(')').toString());
		}
	}

	void method3511(Class162 class162) {
		class162.method1768((2034735675 * this.anInt9710), (byte) 51);
	}

	Class298_Sub40_Sub7(Class160 class160) {
		super();
		this.aClass160_9709 = class160;
		this.anInt9710 = 489279757;
	}

	void method3509(Buffer class298_sub53) {
		this.anInt9710 = class298_sub53.readUShort() * -489279757;
	}
}
