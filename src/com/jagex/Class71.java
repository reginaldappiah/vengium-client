package com.jagex;/* Class71 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class71 {
	static boolean aBoolean684;
	static int anInt685 = 0;
	static Class453 aClass453_686;

	static synchronized void method809(Interface25 interface25, short i) {
		try {
			if (!aBoolean684) {
				if (830010277 * anInt685 > 0) {
					ObjectNode class298_sub29 = new ObjectNode(interface25);
					aClass453_686.pushBack(class298_sub29);
				} else
					interface25.ma(false);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("cw.a(").append(')').toString());
		}
	}

	static synchronized void method810(byte i) {
		try {
			for (;;) {
				ObjectNode class298_sub29 = (ObjectNode) aClass453_686.popHead();
				if (null == class298_sub29) {
					if (i != 3) {
						/* empty */
					}
					break;
				}
				((Interface25) class298_sub29.nodeObject).ma(true);
				class298_sub29.unlink();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("cw.f(").append(')').toString());
		}
	}

	static synchronized void method811(int i) {
		try {
			anInt685 += 1452325933;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("cw.b(").append(')').toString());
		}
	}

	static synchronized void method812(int i) {
		try {
			anInt685 -= 1452325933;
			if (0 == 830010277 * anInt685)
				method810((byte) 3);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("cw.p(").append(')').toString());
		}
	}

	public static synchronized void method813(boolean bool, int i) {
		try {
			aBoolean684 = bool;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("cw.i(").append(')').toString());
		}
	}

	static {
		aBoolean684 = false;
		aClass453_686 = new Class453();
	}

	Class71() throws Throwable {
		throw new Error();
	}
}
