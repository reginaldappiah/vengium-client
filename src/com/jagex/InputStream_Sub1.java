package com.jagex;/* InputStream_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.InputStream;

public class InputStream_Sub1 extends InputStream {
	public int read() {
		try {
			IPAddress.method6060(30000L);
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aey.read(").append(')').toString());
		}
	}

	InputStream_Sub1() {
		/* empty */
	}

	public static void method273() {
		try {
			StaticMethods.spriteToolkit = null;
			Minimap.anInt57 = 955770805;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aey.b(").append(')').toString());
		}
	}
}
