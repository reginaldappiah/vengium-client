package com.jagex;

/* Class108 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class108 {
	public String aString1316;
	public String programName;
	public String aString1318;
	public Class122[] aClass122Array1319;
	public Class122[] aClass122Array1320;

	Class108() {

	}

	void method1145(Class101 class101) {
			programName = class101.getString();
			aString1316 = class101.getString();
			aString1318 = class101.getString();
			int size = class101.getLength();
			int i_1_ = class101.getLength();
			aClass122Array1319 = size == 0 ? null : new Class122[size];
			aClass122Array1320 = i_1_ == 0 ? null : new Class122[i_1_];
			for (int index = 0; index < size; index++) {
				aClass122Array1319[index] = new Class122();
				aClass122Array1319[index].method1317(class101);
			}
			for (int i_3_ = 0; i_3_ < i_1_; i_3_++) {
				aClass122Array1320[i_3_] = new Class122();
				aClass122Array1320[i_3_].method1317(class101);
			}
	}

}
