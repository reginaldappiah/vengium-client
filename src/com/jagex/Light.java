package com.jagex;/* Class298_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Light extends Node {
	static int[] anIntArray7229;
	int anInt7230;
	public Vector3f aClass217_7231 = new Vector3f();
	float aFloat7232;
	int anInt7233;

	public final int method2894(int i) {
		try {
			return (int) aClass217_7231.y;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aao.f(").append(')').toString());
		}
	}

	public final int method2895(int i) {
		try {
			return (int) aClass217_7231.x;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aao.a(").append(')').toString());
		}
	}

	public void method2896(float f, byte i) {
		try {
			this.aFloat7232 = f;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aao.d(").append(')').toString());
		}
	}

	public final int method2897(byte i) {
		try {
			return (int) aClass217_7231.z;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aao.b(").append(')').toString());
		}
	}

	public final int method2898(int i) {
		try {
			return this.anInt7233 * 2038595173;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aao.i(").append(')').toString());
		}
	}

	Light(int i, int i_0_, int i_1_, int i_2_, int i_3_, float f) {
		aClass217_7231.setVector3f((float) i, (float) i_0_, (float) i_1_);
		this.anInt7230 = 465610783 * i_2_;
		this.anInt7233 = i_3_ * -430898323;
		this.aFloat7232 = f;
	}

	public void method2899(int i, int i_4_, int i_5_, byte i_6_) {
		try {
			aClass217_7231.setVector3f((float) i, (float) i_4_, (float) i_5_);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aao.u(").append(')').toString());
		}
	}

	public final int method2900(int i) {
		try {
			return this.anInt7230 * 333763551;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aao.p(").append(')').toString());
		}
	}

	public final float method2901(int i) {
		try {
			return this.aFloat7232;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aao.k(").append(')').toString());
		}
	}
}
