package com.jagex;/* Class465 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import com.jagex.utils.TimeUtils;

import java.util.Calendar;

public class Class465 implements Interface18 {
	boolean hasAppearance;
	int anInt6514;
	int anInt6515;
	int anInt6516;
	int anInt6517;
	int anInt6518;
	int anInt6519;
	static Js5FileSystem aClass243_6520;

	public boolean method235(Interface18 interface18) {
		if (!(interface18 instanceof Class465))
			return false;
		Class465 class465_0_ = (Class465) interface18;
		if (696186641 * class465_0_.anInt6519 != 696186641 * this.anInt6519)
			return false;
		if (this.anInt6514 * 1776279405 != 1776279405 * class465_0_.anInt6514)
			return false;
		if (this.anInt6515 * 793126543 != 793126543 * class465_0_.anInt6515)
			return false;
		if (-2052168577 * this.anInt6516 != class465_0_.anInt6516 * -2052168577)
			return false;
		if (-2128765879 * class465_0_.anInt6518 != this.anInt6518 * -2128765879)
			return false;
		if (-1527694577 * this.anInt6517 != class465_0_.anInt6517 * -1527694577)
			return false;
        return this.hasAppearance == class465_0_.hasAppearance;
    }

	public boolean method232(Interface18 interface18) {
		try {
			if (!(interface18 instanceof Class465))
				return false;
			Class465 class465_1_ = (Class465) interface18;
			if (696186641 * class465_1_.anInt6519 != 696186641 * this.anInt6519)
				return false;
			if (this.anInt6514 * 1776279405 != 1776279405 * class465_1_.anInt6514)
				return false;
			if (this.anInt6515 * 793126543 != 793126543 * class465_1_.anInt6515)
				return false;
			if (-2052168577 * this.anInt6516 != class465_1_.anInt6516 * -2052168577)
				return false;
			if (-2128765879 * class465_1_.anInt6518 != this.anInt6518 * -2128765879)
				return false;
			if (-1527694577 * this.anInt6517 != class465_1_.anInt6517 * -1527694577)
				return false;
            return this.hasAppearance == class465_1_.hasAppearance;
        } catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("te.f(").append(')').toString());
		}
	}

	public long method231() {
		try {
			long[] ls = Buffer.CRC_64;
			long l = -1L;
			l = l >>> 8 ^ ls[(int) ((l ^ (long) (696186641 * this.anInt6519)) & 0xffL)];
			l = l >>> 8 ^ ls[(int) ((l ^ (long) ((1776279405 * this.anInt6514) >> 8)) & 0xffL)];
			l = l >>> 8 ^ ls[(int) ((l ^ (long) (this.anInt6514 * 1776279405)) & 0xffL)];
			l = l >>> 8 ^ ls[(int) ((l ^ (long) (793126543 * (this.anInt6515) >> 24)) & 0xffL)];
			l = l >>> 8 ^ ls[(int) ((l ^ (long) (793126543 * (this.anInt6515) >> 16)) & 0xffL)];
			l = l >>> 8 ^ ls[(int) ((l ^ (long) (793126543 * (this.anInt6515) >> 8)) & 0xffL)];
			l = l >>> 8 ^ ls[(int) ((l ^ (long) (793126543 * this.anInt6515)) & 0xffL)];
			l = l >>> 8 ^ ls[(int) ((l ^ (long) (-2052168577 * this.anInt6516)) & 0xffL)];
			l = l >>> 8 ^ ls[(int) ((l ^ (long) ((-2128765879 * this.anInt6518) >> 24)) & 0xffL)];
			l = l >>> 8 ^ ls[(int) ((l ^ (long) ((this.anInt6518 * -2128765879) >> 16)) & 0xffL)];
			l = l >>> 8 ^ ls[(int) ((l ^ (long) ((-2128765879 * this.anInt6518) >> 8)) & 0xffL)];
			l = l >>> 8 ^ ls[(int) ((l ^ (long) (this.anInt6518 * -2128765879)) & 0xffL)];
			l = l >>> 8 ^ ls[(int) ((l ^ (long) (-1527694577 * this.anInt6517)) & 0xffL)];
			l = l >>> 8 ^ ls[(int) ((l ^ (long) (this.hasAppearance ? 1 : 0)) & 0xffL)];
			return l;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("te.a(").append(')').toString());
		}
	}

	public long method233() {
		long[] ls = Buffer.CRC_64;
		long l = -1L;
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (696186641 * this.anInt6519)) & 0xffL)];
		l = (l >>> 8 ^ ls[(int) ((l ^ (long) (1776279405 * this.anInt6514 >> 8)) & 0xffL)]);
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (this.anInt6514 * 1776279405)) & 0xffL)];
		l = (l >>> 8 ^ ls[(int) ((l ^ (long) (793126543 * this.anInt6515 >> 24)) & 0xffL)]);
		l = (l >>> 8 ^ ls[(int) ((l ^ (long) (793126543 * this.anInt6515 >> 16)) & 0xffL)]);
		l = (l >>> 8 ^ ls[(int) ((l ^ (long) (793126543 * this.anInt6515 >> 8)) & 0xffL)]);
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (793126543 * this.anInt6515)) & 0xffL)];
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (-2052168577 * this.anInt6516)) & 0xffL)];
		l = (l >>> 8 ^ ls[(int) ((l ^ (long) (-2128765879 * this.anInt6518 >> 24)) & 0xffL)]);
		l = (l >>> 8 ^ ls[(int) ((l ^ (long) (this.anInt6518 * -2128765879 >> 16)) & 0xffL)]);
		l = (l >>> 8 ^ ls[(int) ((l ^ (long) (-2128765879 * this.anInt6518 >> 8)) & 0xffL)]);
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (this.anInt6518 * -2128765879)) & 0xffL)];
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (-1527694577 * this.anInt6517)) & 0xffL)];
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (this.hasAppearance ? 1 : 0)) & 0xffL)];
		return l;
	}

	public long method234() {
		long[] ls = Buffer.CRC_64;
		long l = -1L;
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (696186641 * this.anInt6519)) & 0xffL)];
		l = (l >>> 8 ^ ls[(int) ((l ^ (long) (1776279405 * this.anInt6514 >> 8)) & 0xffL)]);
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (this.anInt6514 * 1776279405)) & 0xffL)];
		l = (l >>> 8 ^ ls[(int) ((l ^ (long) (793126543 * this.anInt6515 >> 24)) & 0xffL)]);
		l = (l >>> 8 ^ ls[(int) ((l ^ (long) (793126543 * this.anInt6515 >> 16)) & 0xffL)]);
		l = (l >>> 8 ^ ls[(int) ((l ^ (long) (793126543 * this.anInt6515 >> 8)) & 0xffL)]);
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (793126543 * this.anInt6515)) & 0xffL)];
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (-2052168577 * this.anInt6516)) & 0xffL)];
		l = (l >>> 8 ^ ls[(int) ((l ^ (long) (-2128765879 * this.anInt6518 >> 24)) & 0xffL)]);
		l = (l >>> 8 ^ ls[(int) ((l ^ (long) (this.anInt6518 * -2128765879 >> 16)) & 0xffL)]);
		l = (l >>> 8 ^ ls[(int) ((l ^ (long) (-2128765879 * this.anInt6518 >> 8)) & 0xffL)]);
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (this.anInt6518 * -2128765879)) & 0xffL)];
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (-1527694577 * this.anInt6517)) & 0xffL)];
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (this.hasAppearance ? 1 : 0)) & 0xffL)];
		return l;
	}

	Class465() {
		/* empty */
	}

	public boolean method236(Interface18 interface18) {
		if (!(interface18 instanceof Class465))
			return false;
		Class465 class465_2_ = (Class465) interface18;
		if (696186641 * class465_2_.anInt6519 != 696186641 * this.anInt6519)
			return false;
		if (this.anInt6514 * 1776279405 != 1776279405 * class465_2_.anInt6514)
			return false;
		if (this.anInt6515 * 793126543 != 793126543 * class465_2_.anInt6515)
			return false;
		if (-2052168577 * this.anInt6516 != class465_2_.anInt6516 * -2052168577)
			return false;
		if (-2128765879 * class465_2_.anInt6518 != this.anInt6518 * -2128765879)
			return false;
		if (-1527694577 * this.anInt6517 != class465_2_.anInt6517 * -1527694577)
			return false;
        return this.hasAppearance == class465_2_.hasAppearance;
    }

	public static String method6017(long l, int i, boolean bool, int i_3_) {
		try {
			Calendar calendar;
			if (bool) {
				StaticMethods.method3686(l);
				calendar = Class490.calendar;
			} else {
				TimeUtils.method5658(l);
				calendar = Class490.aCalendar6073;
			}
			int i_4_ = calendar.get(5);
			int i_5_ = calendar.get(2);
			int i_6_ = calendar.get(1);
			int i_7_ = calendar.get(11);
			int i_8_ = calendar.get(12);
			if (i == 3)
				return StaticMethods.method5631(l, i, bool);
			return new StringBuilder().append(Integer.toString(i_4_ / 10)).append(i_4_ % 10).append("-").append(Class490.monthLanguages[i][i_5_]).append("-").append(i_6_).append(" ").append(i_7_ / 10).append(i_7_ % 10).append(":").append(i_8_ / 10).append(i_8_ % 10).toString();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("te.f(").append(')').toString());
		}
	}

	static final void method6018(IComponentDefinition class105, IComponentDefinitionCollection IComponentDefinitionCollection, ScriptRuntime class403, int i) {
		try {
			String string = (String) (class403.objectStack[(class403.objectArgs -= 969361751) * -203050393]);
			if (Class298_Sub6.method2863(string, class403) != null)
				string = string.substring(0, string.length() - 1);
			class105.onClickRepeatHook = Class128_Sub2.method1441(string, class403);
			class105.hasScript = true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("te.ld(").append(')').toString());
		}
	}

	static final void method6019(ScriptRuntime class403, short i) {
		try {
			int i_9_ = (class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]);
			Class350 class350 = Class94.aClass349_913.method4202(i_9_, (byte) 24);
			if (null != class350.keys && class350.keys.length > 0) {
				int i_10_ = 0;
				int i_11_ = class350.anIntArray3713[0];
				for (int i_12_ = 1; i_12_ < class350.keys.length; i_12_++) {
					if (class350.anIntArray3713[i_12_] > i_11_) {
						i_10_ = i_12_;
						i_11_ = class350.anIntArray3713[i_12_];
					}
				}
				class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919) - 1] = class350.keys[i_10_];
			} else
				class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919) - 1] = -809747019 * class350.key;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("te.abx(").append(')').toString());
		}
	}
}
