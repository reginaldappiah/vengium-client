package com.jagex;/* Class343 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class343 {
	public int anInt3666;
	public int anInt3670;
	int anInt3672;

	Class343() {

	}

	public boolean method4155(byte i) {
		try {
			return 0 != (-877023375 * anInt3670 & 0x2);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("oh.f(").append(')').toString());
		}
	}

	public boolean method4156(int i) {
		try {
			return 0 != (anInt3670 * -877023375 & 0x4);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("oh.b(").append(')').toString());
		}
	}

	public boolean method4157(int i) {
		try {
			return (-877023375 * anInt3670 & 0x8) != 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("oh.p(").append(')').toString());
		}
	}

	public boolean method4158(int i) {
		try {
			return 0 != (-877023375 * anInt3670 & 0x1);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("oh.a(").append(')').toString());
		}
	}

}
