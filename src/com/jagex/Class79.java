package com.jagex;/* Class79 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.utils.TimeUtils;

public class Class79 {
	static int anInt734 = 0;
	static Js5FileSystem aClass243_735;
	static Js5FileSystem aClass243_736;
	static Class298_Sub19_Sub1 aClass298_Sub19_Sub1_737;
	static Class284 aClass284_738;
	static int anInt739;
	static int anInt740 = 1;
	static int anInt741 = 2;
	static int anInt742 = 3;
	static int anInt743 = 0;
	static Js5FileSystem JS5_MUSIC;
	static int anInt745;
	static int anInt746;
	static Js5FileSystem aClass243_747;
	static Class298_Sub19_Sub1 aClass298_Sub19_Sub1_748;

	Class79() throws Throwable {
		throw new Error();
	}

	public static String method847(long l, int i, int i_0_) {
		try {
			TimeUtils.method5658(l);
			int i_1_ = Class490.aCalendar6073.get(5);
			int i_2_ = Class490.aCalendar6073.get(2);
			int i_3_ = Class490.aCalendar6073.get(1);
			if (3 == i)
				return TimeUtils.method4275(l);
			return new StringBuilder().append(Integer.toString(i_1_ / 10)).append(i_1_ % 10).append("-").append(Class490.monthLanguages[i][i_2_]).append("-").append(i_3_).toString();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("de.a(").append(')').toString());
		}
	}

	static byte method848(int i, int i_4_, byte i_5_) {
			if (-1976050083 * Class424.aClass424_6595.type != i)
				return (byte) 0;
			if ((i_4_ & 0x1) == 0)
				return (byte) 1;
			return (byte) 2;
	}

	public static final void method850(Class365_Sub1 class365_sub1, int i) {
			Class82_Sub21.method936(class365_sub1, i, true);
	}

}
