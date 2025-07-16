package com.jagex;/* Class298_Sub40_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub40_Sub4 extends Class298_Sub40 {
	Class160 aClass160_9697;
	String aString9698;

	void method3508(Buffer class298_sub53, int i) {
		try {
			this.aString9698 = class298_sub53.readString();
			class298_sub53.readInt();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("agc.a(").append(')').toString());
		}
	}

	void method3511(Class162 class162) {
		class162.aString1654 = this.aString9698;
	}

	void method3510(Class162 class162, byte i) {
		try {
			class162.aString1654 = this.aString9698;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("agc.f(").append(')').toString());
		}
	}

	Class298_Sub40_Sub4(Class160 class160) {
		super();
		this.aClass160_9697 = class160;
	}

	void method3512(Buffer class298_sub53) {
		this.aString9698 = class298_sub53.readString();
		class298_sub53.readInt();
	}

	void method3509(Buffer class298_sub53) {
		this.aString9698 = class298_sub53.readString();
		class298_sub53.readInt();
	}
}
