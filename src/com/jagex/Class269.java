package com.jagex;/* Class269 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class269 {
	int anInt2884;
	int anInt2885;
	int[] anIntArray2886;
	int[] anIntArray2887;

	Class269() {
		Class298_Sub23.method3070(16);
		this.anInt2885 = (Class298_Sub23.method3063() != 0 ? Class298_Sub23.method3070(4) + 1 : 1);
		if (Class298_Sub23.method3063() != 0)
			Class298_Sub23.method3070(8);
		Class298_Sub23.method3070(2);
		if (this.anInt2885 > 1)
			this.anInt2884 = Class298_Sub23.method3070(4);
		this.anIntArray2886 = new int[this.anInt2885];
		this.anIntArray2887 = new int[this.anInt2885];
		for (int i = 0; i < this.anInt2885; i++) {
			Class298_Sub23.method3070(8);
			this.anIntArray2886[i] = Class298_Sub23.method3070(8);
			this.anIntArray2887[i] = Class298_Sub23.method3070(8);
		}
	}
}
