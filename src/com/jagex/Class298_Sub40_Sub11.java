package com.jagex;/* Class298_Sub40_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub40_Sub11 extends Class298_Sub40 {
	int anInt9723;
	Class160 aClass160_9724;

	Class298_Sub40_Sub11(Class160 class160) {
		super();
		this.aClass160_9724 = class160;
		this.anInt9723 = 977594491;
	}

	void method3508(Buffer class298_sub53, int i) {
		try {
			this.anInt9723 = class298_sub53.readUShort() * -977594491;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("agr.a(").append(')').toString());
		}
	}

	void method3511(Class162 class162) {
		class162.method1765((-142522035 * this.anInt9723), 1943804872);
	}

	void method3510(Class162 class162, byte i) {
		try {
			class162.method1765((-142522035 * this.anInt9723), 1995709305);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("agr.f(").append(')').toString());
		}
	}

	void method3512(Buffer class298_sub53) {
		this.anInt9723 = class298_sub53.readUShort() * -977594491;
	}

	void method3509(Buffer class298_sub53) {
		this.anInt9723 = class298_sub53.readUShort() * -977594491;
	}
}
