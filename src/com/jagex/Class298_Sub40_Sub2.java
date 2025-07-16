package com.jagex;/* Class298_Sub40_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub40_Sub2 extends Class298_Sub40 {
	Class160 aClass160_9690;
	String aString9691;
	long aLong9692;
	public static int anInt9693;

	void method3510(Class162 class162, byte i) {
		try {
			class162.method1759((5516397286925612321L * this.aLong9692), this.aString9691, 534643319);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("afp.f(").append(')').toString());
		}
	}

	void method3508(Buffer class298_sub53, int i) {
		try {
			if (class298_sub53.readUByte() != 255) {
				class298_sub53.offset -= 116413311;
				this.aLong9692 = (class298_sub53.readLong() * 6229729792981765857L);
			}
			this.aString9691 = class298_sub53.readNullString();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("afp.a(").append(')').toString());
		}
	}

	void method3509(Buffer class298_sub53) {
		if (class298_sub53.readUByte() != 255) {
			class298_sub53.offset -= 116413311;
			this.aLong9692 = (class298_sub53.readLong() * 6229729792981765857L);
		}
		this.aString9691 = class298_sub53.readNullString();
	}

	void method3511(Class162 class162) {
		class162.method1759((5516397286925612321L * this.aLong9692), this.aString9691, 1643740294);
	}

	void method3512(Buffer class298_sub53) {
		if (class298_sub53.readUByte() != 255) {
			class298_sub53.offset -= 116413311;
			this.aLong9692 = (class298_sub53.readLong() * 6229729792981765857L);
		}
		this.aString9691 = class298_sub53.readNullString();
	}

	Class298_Sub40_Sub2(Class160 class160) {
		super();
		this.aClass160_9690 = class160;
		this.aLong9692 = -6229729792981765857L;
		this.aString9691 = null;
	}
}
