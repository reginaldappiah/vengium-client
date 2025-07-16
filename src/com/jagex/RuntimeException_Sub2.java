package com.jagex;/* RuntimeException_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.applet.Applet;

public class RuntimeException_Sub2 extends RuntimeException {
	static long aLong6304;
	public static Applet applet;
	String aString6308;
	Throwable aThrowable6309;

	RuntimeException_Sub2(Throwable throwable, String string) {
		this.aString6308 = string;
		this.aThrowable6309 = throwable;
		initCause(throwable);
	}
}
