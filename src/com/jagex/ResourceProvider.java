package com.jagex;/* ResourceProvider - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class ResourceProvider {
	public static int anInt2709;
	public static int anInt2710;

    static final void method4213() {
            anInt2709 = 0;
    }

	abstract ReferenceTable getTable();

	abstract byte[] get(int file);

	abstract int getGroupProgress(int file);

	abstract void requestGroup(int i);

	ResourceProvider() {

	}

}
