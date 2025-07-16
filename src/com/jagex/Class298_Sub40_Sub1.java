package com.jagex;/* Class298_Sub40_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub40_Sub1 extends Class298_Sub40 {
	long aLong9688;
	String aString9689;

	void method3511(Class162 class162) {
		class162.method1757((31082448682122173L * this.aLong9688), this.aString9689, 0, -783761378);
	}

	Class298_Sub40_Sub1(Class160 class160) {
		super();
		this.aLong9688 = 9050845699687573611L;
		this.aString9689 = null;
	}

	void method3510(Class162 class162, byte i) {
		try {
			class162.method1757((31082448682122173L * this.aLong9688), this.aString9689, 0, -783761378);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("afd.f(").append(')').toString());
		}
	}

	void method3508(Buffer class298_sub53, int i) {
		try {
			if (class298_sub53.readUByte() != 255) {
				class298_sub53.offset -= 116413311;
				this.aLong9688 = (class298_sub53.readLong() * -9050845699687573611L);
			}
			this.aString9689 = class298_sub53.readNullString();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("afd.a(").append(')').toString());
		}
	}

	void method3512(Buffer class298_sub53) {
		if (class298_sub53.readUByte() != 255) {
			class298_sub53.offset -= 116413311;
			this.aLong9688 = (class298_sub53.readLong() * -9050845699687573611L);
		}
		this.aString9689 = class298_sub53.readNullString();
	}

	void method3509(Buffer class298_sub53) {
		if (class298_sub53.readUByte() != 255) {
			class298_sub53.offset -= 116413311;
			this.aLong9688 = (class298_sub53.readLong() * -9050845699687573611L);
		}
		this.aString9689 = class298_sub53.readNullString();
	}

	static final void method3514(ScriptRuntime class403, int i) {
		try {
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = Class282.method2624(-333964684).getID();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("afd.ahc(").append(')').toString());
		}
	}
}
