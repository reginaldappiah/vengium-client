package com.jagex;/* Class298_Sub40_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub40_Sub8 extends Class298_Sub40 {
	Class160 aClass160_9711;
	long aLong9712;
	int anInt9713;

	void method3510(Class162 class162, byte i) {
		try {
			class162.method1763((this.anInt9713 * -994398103), (1342935022598277865L * this.aLong9712));
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("agn.f(").append(')').toString());
		}
	}

	void method3509(Buffer class298_sub53) {
		this.anInt9713 = class298_sub53.readInt() * 1255006169;
		this.aLong9712 = class298_sub53.readLong() * 3352878270957006169L;
	}

	void method3508(Buffer class298_sub53, int i) {
		try {
			this.anInt9713 = class298_sub53.readInt() * 1255006169;
			this.aLong9712 = (class298_sub53.readLong() * 3352878270957006169L);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("agn.a(").append(')').toString());
		}
	}

	Class298_Sub40_Sub8(Class160 class160) {
		super();
		this.aClass160_9711 = class160;
	}

	void method3512(Buffer class298_sub53) {
		this.anInt9713 = class298_sub53.readInt() * 1255006169;
		this.aLong9712 = class298_sub53.readLong() * 3352878270957006169L;
	}

	void method3511(Class162 class162) {
		class162.method1763((this.anInt9713 * -994398103), (1342935022598277865L * this.aLong9712));
	}
}
