package com.jagex;/* Class298_Sub40_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub40_Sub12 extends Class298_Sub40 {
	int anInt9725;
	int anInt9726;
	Class160 aClass160_9727;
	int anInt9728;
	int anInt9729;

	void method3511(Class162 class162) {
		class162.method1762(-1639581401 * this.anInt9729, -668866515 * this.anInt9728, -730458547 * this.anInt9726, -1837171777 * this.anInt9725, 183101291);
	}

	void method3508(Buffer class298_sub53, int i) {
		try {
			this.anInt9729 = class298_sub53.readInt() * 1958209175;
			this.anInt9728 = class298_sub53.readInt() * 7382949;
			this.anInt9726 = class298_sub53.readUByte() * -1712778619;
			this.anInt9725 = class298_sub53.readUByte() * 548598847;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("agv.a(").append(')').toString());
		}
	}

	void method3510(Class162 class162, byte i) {
		try {
			class162.method1762(-1639581401 * this.anInt9729, -668866515 * this.anInt9728, -730458547 * this.anInt9726, -1837171777 * this.anInt9725, 183101291);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("agv.f(").append(')').toString());
		}
	}

	Class298_Sub40_Sub12(Class160 class160) {
		super();
		this.aClass160_9727 = class160;
	}

	void method3512(Buffer class298_sub53) {
		this.anInt9729 = class298_sub53.readInt() * 1958209175;
		this.anInt9728 = class298_sub53.readInt() * 7382949;
		this.anInt9726 = class298_sub53.readUByte() * -1712778619;
		this.anInt9725 = class298_sub53.readUByte() * 548598847;
	}

	void method3509(Buffer class298_sub53) {
		this.anInt9729 = class298_sub53.readInt() * 1958209175;
		this.anInt9728 = class298_sub53.readInt() * 7382949;
		this.anInt9726 = class298_sub53.readUByte() * -1712778619;
		this.anInt9725 = class298_sub53.readUByte() * 548598847;
	}

	static final int method3516(int i, int i_0_, int i_1_, int i_2_, byte i_3_) {
		try {
			int i_4_ = 65536 - CircleAngleTable.COSINE[8192 * i_1_ / i_2_] >> 1;
			return (i_4_ * i_0_ >> 16) + ((65536 - i_4_) * i >> 16);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("agv.j(").append(')').toString());
		}
	}
}
