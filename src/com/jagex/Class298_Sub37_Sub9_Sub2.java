package com.jagex;/* Class298_Sub37_Sub9_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.ref.SoftReference;

public class Class298_Sub37_Sub9_Sub2 extends Class298_Sub37_Sub9 {
	public static byte[][][] packetPool;
	SoftReference aSoftReference10002;

    Object method3437(int i) {
		try {
			return this.aSoftReference10002.get();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("akt.a(").append(')').toString());
		}
	}

	boolean method3438() {
		try {
			return true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("akt.f(").append(')').toString());
		}
	}

    Class298_Sub37_Sub9_Sub2(Object object, int i) {
		super(i);
		this.aSoftReference10002 = new SoftReference(object);
	}
}
