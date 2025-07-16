package com.jagex;/* Class298_Sub40_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub40_Sub5 extends Class298_Sub40 {
	long aLong9699;
	int anInt9700;
	String aString9701;
	Class160 aClass160_9702;

	Class298_Sub40_Sub5(Class160 class160) {
		super();
		this.aClass160_9702 = class160;
		this.aLong9699 = 2714659426994184815L;
		this.aString9701 = null;
		this.anInt9700 = 0;
	}

	void method3508(Buffer class298_sub53, int i) {
		try {
			if (class298_sub53.readUByte() != 255) {
				class298_sub53.offset -= 116413311;
				this.aLong9699 = (class298_sub53.readLong() * -2714659426994184815L);
			}
			this.aString9701 = class298_sub53.readNullString();
			this.anInt9700 = class298_sub53.readUShort() * 70895925;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("agf.a(").append(')').toString());
		}
	}

	void method3510(Class162 class162, byte i) {
		try {
			class162.method1757((this.aLong9699 * -1747233514558995599L), this.aString9701, (this.anInt9700 * 1029636381), -783761378);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("agf.f(").append(')').toString());
		}
	}

	void method3511(Class162 class162) {
		class162.method1757((this.aLong9699 * -1747233514558995599L), this.aString9701, (this.anInt9700 * 1029636381), -783761378);
	}

	void method3512(Buffer class298_sub53) {
		if (class298_sub53.readUByte() != 255) {
			class298_sub53.offset -= 116413311;
			this.aLong9699 = (class298_sub53.readLong() * -2714659426994184815L);
		}
		this.aString9701 = class298_sub53.readNullString();
		this.anInt9700 = class298_sub53.readUShort() * 70895925;
	}

	void method3509(Buffer class298_sub53) {
		if (class298_sub53.readUByte() != 255) {
			class298_sub53.offset -= 116413311;
			this.aLong9699 = (class298_sub53.readLong() * -2714659426994184815L);
		}
		this.aString9701 = class298_sub53.readNullString();
		this.anInt9700 = class298_sub53.readUShort() * 70895925;
	}
}
