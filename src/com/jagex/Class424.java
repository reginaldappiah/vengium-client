package com.jagex;/* Class424 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class424 implements Interface21 {
	static Class424 aClass424_6591;
	public static Class424 aClass424_6592;
	public static Class424 aClass424_6593;
	public static Class424 aClass424_6594;
	public static Class424 aClass424_6595;
	public static Class424 aClass424_6596;
	static Class424 aClass424_6597;
	public static Class424 aClass424_6598;
	public static Class424 aClass424_6599;
	public static Class424 aClass424_6600;
	public static Class424 aClass424_6601;
	public static Class424 aClass424_6602;
	static Class424 aClass424_6603;
	public static Class424 aClass424_6604;
	static Class424 aClass424_6605;
	static Class424 aClass424_6606;
	static Class424 aClass424_6607;
	static Class424 aClass424_6608;
	static Class424 aClass424_6609;
	public static Class424 aClass424_6610;
	public static Class424 aClass424_6611;
	static Class424 aClass424_6612;
	public int type;
	public static Class424 aClass424_6614 = new Class424(0, 0);
	public int anInt6615;

	public int method244() {
		return -1976050083 * type;
	}

	Class424(int i, int i_0_) {
		type = -1456740875 * i;
		anInt6615 = 341764099 * i_0_;
	}

	static {
		aClass424_6592 = new Class424(1, 0);
		aClass424_6593 = new Class424(2, 0);
		aClass424_6594 = new Class424(3, 0);
		aClass424_6595 = new Class424(9, 2);
		aClass424_6596 = new Class424(4, 1);
		aClass424_6601 = new Class424(5, 1);
		aClass424_6598 = new Class424(6, 1);
		aClass424_6599 = new Class424(7, 1);
		aClass424_6600 = new Class424(8, 1);
		aClass424_6612 = new Class424(12, 2);
		aClass424_6602 = new Class424(13, 2);
		aClass424_6603 = new Class424(14, 2);
		aClass424_6605 = new Class424(15, 2);
		aClass424_6591 = new Class424(16, 2);
		aClass424_6597 = new Class424(17, 2);
		aClass424_6608 = new Class424(18, 2);
		aClass424_6607 = new Class424(19, 2);
		aClass424_6609 = new Class424(20, 2);
		aClass424_6606 = new Class424(21, 2);
		aClass424_6611 = new Class424(10, 2);
		aClass424_6604 = new Class424(11, 2);
		aClass424_6610 = new Class424(22, 3);
	}

	public int method243() {
		return -1976050083 * type;
	}

	public int getID() {
		try {
			return -1976050083 * type;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ro.f(").append(')').toString());
		}
	}

	static final void method5735(ScriptRuntime class403, int i) {
		try {
			String string = (String) (class403.objectStack[(class403.objectArgs -= 969361751) * -203050393]);
			int i_1_ = (class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]);
			StaticMethods.method911(string, i_1_ == 1);
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = 367592105 * Class344.itemIndex;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ro.abs(").append(')').toString());
		}
	}
}
