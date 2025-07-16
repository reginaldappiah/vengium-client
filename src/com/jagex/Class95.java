package com.jagex;/* Class95 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class95 {
	Class298_Sub13 aClass298_Sub13_914;
	Class298_Sub19_Sub1 aClass298_Sub19_Sub1_916;
	Js5FileSystem aClass243_917;
	Class272 aClass272_920 = null;
	public int anInt921;
	int anInt922 = 0;
	public static int anInt923;
	public static int anInt924;

	Class298_Sub13 method1027() {
			return this.aClass298_Sub13_914;
	}

	Class298_Sub19_Sub1 method1028() {
			return this.aClass298_Sub19_Sub1_916;
	}

	public boolean method1029() {
			return 1285026069 * this.anInt922 == 2;
	}

	public boolean method1030() {
			Class11.method329();
			if (this.anInt922 * 1285026069 == 0) {
				this.aClass298_Sub13_914 = Class298_Sub13.method2905(this.aClass243_917, anInt921 * 1941368041, 0);
				if (this.aClass298_Sub13_914 == null)
					return false;
				this.aClass272_920 = new Class272(Class79.aClass243_736, Class79.aClass243_735);
				this.anInt922 = -1271605699;
			}
			if (1 == 1285026069 * this.anInt922) {
				if (!this.aClass298_Sub19_Sub1_916.method2955(this.aClass298_Sub13_914, Class79.aClass243_747, this.aClass272_920, 22050, -1303478218))
					return false;
				this.anInt922 = 1751755898;
			}
			return true;
	}

	public Class95(Js5FileSystem class243, int i) {
		this.aClass243_917 = class243;
		anInt921 = -1830245543 * i;
		this.aClass298_Sub19_Sub1_916 = new Class298_Sub19_Sub1();
		this.aClass298_Sub19_Sub1_916.method2962(9, 128, 346222187);
	}

}
