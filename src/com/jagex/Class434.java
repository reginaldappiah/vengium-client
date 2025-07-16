package com.jagex;/* Class434 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class434 {
	public int anInt5457;
	public int anInt5458;
	public int anInt5459;

	void method5800(Buffer class298_sub53, int i, int i_0_) {
		try {
			if (i == 1) {
				anInt5458 = class298_sub53.readUShort() * -361098111;
				anInt5459 = class298_sub53.readUByte() * 709302387;
				anInt5457 = class298_sub53.readUByte() * 1322614137;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ry.f(").append(')').toString());
		}
	}

	void method5801(Buffer class298_sub53, int i) {
		try {
			for (;;) {
				int i_1_ = class298_sub53.readUByte();
				if (0 == i_1_) {
					if (i > 1941304655)
						break;
					break;
				}
				method5800(class298_sub53, i_1_, 33985);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ry.a(").append(')').toString());
		}
	}

	Class434() {
		/* empty */
	}

	static boolean method5802(int i) {
		try {
			return Class492.method6184(StaticMethods.aClass381_1563.aClass355_4115);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ry.b(").append(')').toString());
		}
	}
}
