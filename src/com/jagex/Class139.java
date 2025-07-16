package com.jagex;/* Class139 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class139 {
	static Class139 aClass139_1545;
	static Class139 aClass139_1546;
	static Class139 aClass139_1547 = new Class139();
	static int anInt1548;

	public static Class139[] method6176() {
			return (new Class139[] {aClass139_1547, aClass139_1546, aClass139_1545});
	}

	public int method1545(int i, int i_0_, int i_1_) {
			int i_2_ = (GameShell.canvasWidth * -2110394505 > i_0_ ? -2110394505 * GameShell.canvasWidth : i_0_);
			if (aClass139_1547 == this)
				return 0;
			if (aClass139_1545 == this)
				return i_2_ - i;
			if (aClass139_1546 == this)
				return (i_2_ - i) / 2;
			return 0;
	}

	Class139() {

	}

	static {
		aClass139_1546 = new Class139();
		aClass139_1545 = new Class139();
	}

}
