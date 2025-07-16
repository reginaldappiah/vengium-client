package com.jagex;/* Class298_Sub40_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub40_Sub9 extends Class298_Sub40 {
	byte aByte9714;
	Class160 aClass160_9715;
	int anInt9717;

	void method3509(Buffer class298_sub53) {
		this.anInt9717 = class298_sub53.readUShort() * 203579807;
		this.aByte9714 = class298_sub53.readByte();
	}

	void method3508(Buffer class298_sub53, int i) {
		try {
			this.anInt9717 = class298_sub53.readUShort() * 203579807;
			this.aByte9714 = class298_sub53.readByte();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ago.a(").append(')').toString());
		}
	}

	Class298_Sub40_Sub9(Class160 class160) {
		super();
		this.aClass160_9715 = class160;
		this.anInt9717 = -203579807;
	}

	void method3511(Class162 class162) {
		class162.method1769((1481144927 * this.anInt9717), this.aByte9714, (byte) -65);
	}

	void method3512(Buffer class298_sub53) {
		this.anInt9717 = class298_sub53.readUShort() * 203579807;
		this.aByte9714 = class298_sub53.readByte();
	}

	void method3510(Class162 class162, byte i) {
		try {
			class162.method1769((1481144927 * this.anInt9717), this.aByte9714, (byte) -101);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ago.f(").append(')').toString());
		}
	}
}
