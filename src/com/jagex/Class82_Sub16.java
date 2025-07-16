package com.jagex;/* Class82_Sub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class82_Sub16 extends Class82 {
	int anInt6881;
	int anInt6882;
	int anInt6883;
	int anInt6884;
	Class297 aClass297_6885;
	public static Class427 aClass427_6886;

	public void method866() {
		try {
			this.aClass297_6885 = (Class239.method2210(-105889067 * this.anInt6882, -1362481351 * this.anInt6884, 0, -331142053 * this.anInt6881, this.anInt6883 * 743412087));
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("yd.f(").append(')').toString());
		}
	}

	public void method869() {
		this.aClass297_6885 = (Class239.method2210(-105889067 * this.anInt6882, -1362481351 * this.anInt6884, 0, -331142053 * this.anInt6881, this.anInt6883 * 743412087));
	}

	Class82_Sub16(Buffer class298_sub53) {
		super(class298_sub53);
		this.anInt6882 = class298_sub53.readUShort() * 525657725;
		this.anInt6881 = class298_sub53.readUByte() * -1118428205;
		this.anInt6883 = class298_sub53.readUByte() * -1460627385;
		this.anInt6884 = class298_sub53.readUByte() * -216002807;
	}

	public void method868() {
		this.aClass297_6885 = (Class239.method2210(-105889067 * this.anInt6882, -1362481351 * this.anInt6884, 0, -331142053 * this.anInt6881, this.anInt6883 * 743412087));
	}

	void method867(int i) {
		try {
			if (this.aClass297_6885 != null) {
				StaticMethods.method4957(this.aClass297_6885);
				this.aClass297_6885 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("yd.b(").append(')').toString());
		}
	}

	void method917() {
		if (this.aClass297_6885 != null) {
			StaticMethods.method4957(this.aClass297_6885);
			this.aClass297_6885 = null;
		}
	}
}
