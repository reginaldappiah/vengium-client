package com.jagex;/* Class509 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class509 {
	public Interface5[] anInterface5Array6217;

	Class509() {
		/* empty */
	}

	void method6283(Buffer buffer, int i) {
		try {
			anInterface5Array6217 = new Interface5[buffer.readUByte()];
			Class146[] class146s = Class521.method6323(1755655127);
			for (int i_0_ = 0; i_0_ < anInterface5Array6217.length; i_0_++)
				anInterface5Array6217[i_0_] = method6284(buffer, (class146s[buffer.readUByte()]), -1580077477);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("va.a(").append(')').toString());
		}
	}

	Interface5 method6284(Buffer buffer, Class146 class146, int i) {
		try {
			if (class146 == Class146.aClass146_1569)
				return Class145.method2052(buffer);
			if (class146 == Class146.aClass146_1565)
				return NPCDefinition.method6247(buffer);
			if (class146 == Class146.aClass146_1568)
				return StaticMethods.method695(buffer, -1734441948);
			if (class146 == Class146.aClass146_1573)
				return StaticMethods.method4899(buffer);
			if (Class146.aClass146_1572 == class146)
				return Class80.method853(buffer);
			if (Class146.aClass146_1566 == class146)
				return Class304.method3741(buffer, -970414625);
			if (Class146.aClass146_1567 == class146)
				return StaticMethods.method2524(buffer);
			if (Class146.aClass146_1564 == class146)
				return Class151.method1318(buffer);
			if (class146 == Class146.aClass146_1570)
				return StaticMethods.method4896(buffer);
			if (class146 == Class146.aClass146_1571)
				return Class24.method382(buffer, -24258340);
			return null;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("va.f(").append(')').toString());
		}
	}

}
