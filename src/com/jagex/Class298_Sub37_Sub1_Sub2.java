package com.jagex;/* Class298_Sub37_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.ref.SoftReference;

public class Class298_Sub37_Sub1_Sub2 extends Class298_Sub37_Sub1 {
	SoftReference aSoftReference9999;

    Class298_Sub37_Sub1_Sub2(Interface18 interface18, Object object, int i) {
		super(interface18, i);
		this.aSoftReference9999 = new SoftReference(object);
	}

	boolean method3407() {
		return true;
	}

    Object method3406() {
		return this.aSoftReference9999.get();
	}

}
