package com.jagex;/* Class298_Sub30 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub30 extends Node {
	double aDouble7367;
	short[][] aShortArrayArray7368;

	long method3112(int i) {
		try {
			return (long) ((this.aShortArrayArray7368.length << 32) | (this.aShortArrayArray7368[0]).length);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("abo.a(").append(')').toString());
		}
	}

	Class298_Sub30(short[][] is, double d) {
		this.aShortArrayArray7368 = is;
		this.aDouble7367 = d;
	}

	static void method3113(Class413 class413, byte i) {
		try {
			Class357.aClass413_3845 = class413;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("abo.r(").append(')').toString());
		}
	}
}
