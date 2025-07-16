package com.jagex;/* Class92 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class Class92 {
	static Map aMap901;
	public static long aLong902 = 1000L;
	static HashMap aHashMap903 = new HashMap();
    public static Class504 aClass504_905;

	public static String method1003(Date date, String string, int i) {
		try {
			return method1004(date, string, method1006(455698199), GameLanguage.english, 791568674);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("dt.a(").append(')').toString());
		}
	}

	static String method1004(Date date, String string, TimeZone timezone, GameLanguage class429, int i) {
		try {
			if (null == aMap901) {
				aMap901 = new HashMap(6);
				GameLanguage[] class429s = GameLanguage.getLanguages();
				for (int i_0_ = 0; i_0_ < class429s.length; i_0_++) {
					GameLanguage class429_1_ = class429s[i_0_];
					aMap901.put(class429_1_, new ConcurrentLinkedQueue());
				}
			}
			ConcurrentLinkedQueue concurrentlinkedqueue = (ConcurrentLinkedQueue) aMap901.get(class429);
			SimpleDateFormat simpledateformat = (SimpleDateFormat) concurrentlinkedqueue.poll();
			if (simpledateformat == null)
				simpledateformat = new SimpleDateFormat(string, class429.method5755(-734484116));
			else
				simpledateformat.applyPattern(string);
			simpledateformat.setTimeZone(timezone);
			String string_2_ = simpledateformat.format(date);
			concurrentlinkedqueue.add(simpledateformat);
			return string_2_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("dt.f(").append(')').toString());
		}
	}

	static TimeZone method1005(String string, int i) {
		try {
			synchronized (aHashMap903) {
				TimeZone timezone = (TimeZone) aHashMap903.get(string);
				if (null == timezone) {
					timezone = TimeZone.getTimeZone(string);
					aHashMap903.put(string, timezone);
				}
				TimeZone timezone_3_ = timezone;
				return timezone_3_;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("dt.p(").append(')').toString());
		}
	}

	static {
		Calendar.getInstance(method1005("Europe/London", -1482930137));
	}

	static TimeZone method1006(int i) {
		try {
			return method1005("Europe/London", -1697874218);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("dt.b(").append(')').toString());
		}
	}

	Class92() throws Throwable {
		throw new Error();
	}

	public static void method1007() {
			Class365_Sub1_Sub3_Sub2.method4512(1137952217);
			Class436.aClass57Array5501 = null;
	}

	static final void method1008(ScriptRuntime runtime) {
		try {
			runtime.integerStackOffset -= -783761378;
			int i_4_ = (runtime.integerStack[runtime.integerStackOffset * 681479919]);
			int i_5_ = (runtime.integerStack[1 + runtime.integerStackOffset * 681479919]);
			Class497 class497 = aClass504_905.get(i_5_);
			if (class497.method6206())
				runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393) - 1] = ItemDefinitionLoader.aClass500_6001.method6219(i_4_, 1811541401).method3427(i_5_, class497.aString6101);
			else
				runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = (ItemDefinitionLoader.aClass500_6001.method6219(i_4_, 685502248).method3425(i_5_, -388931549 * class497.size));
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("dt.abl(").append(')').toString());
		}
	}
}
