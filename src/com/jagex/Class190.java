package com.jagex;/* Class190 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class190 {
	public static int anInt1917 = 1;
	static int anInt1918 = 2;
	static int anInt1919 = 0;
	public int anInt1920;
	public static int anInt1921 = 2;
	int anInt1922;
	static int anInt1923 = 1;
	public static int anInt1924 = 0;
	static int anInt1925 = 1;
	public static Class190[] aClass190Array1926 = new Class190[16];
	boolean aBoolean1927;
	public static LinkedList aClass437_1928;
	static SoftCache aClass348_1929;
	public int anInt1930;
	public long aLong1931;
	static int anInt1932 = 0;
	public int anInt1933;
	public int anInt1934;
	public int anInt1935;
	public int anInt1936;
	public static int anInt1937 = 1;
	public static int anInt1938 = 0;
	public int anInt1939;
	public int anInt1940;
	public int anInt1941;
	public int anInt1942 = 0;
	public int anInt1943;

	static {
		aClass437_1928 = new LinkedList(16);
		aClass348_1929 = new SoftCache(64);
	}

	void method1853(Buffer class298_sub53, int i) {
		try {
			for (;;) {
				int i_0_ = class298_sub53.readUByte();
				if (i_0_ == 0) {
					if (i == -1336450331)
						throw new IllegalStateException();
					break;
				}
				method1854(class298_sub53, i_0_, 1980463854);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("hy.b(").append(')').toString());
		}
	}

	void method1854(Buffer class298_sub53, int i, int i_1_) {
		try {
			if (1 == i)
				this.anInt1922 = class298_sub53.readUShort() * 631997191;
			else if (2 == i)
				class298_sub53.readUByte();
			else if (i == 3) {
				anInt1933 = class298_sub53.readInt() * 2057106809;
				anInt1934 = class298_sub53.readInt() * 2073554425;
				anInt1935 = class298_sub53.readInt() * 659772455;
			} else if (4 == i) {
				anInt1936 = class298_sub53.readUByte() * -1434113687;
				anInt1920 = class298_sub53.readInt() * 1749954193;
			} else if (6 == i)
				anInt1940 = class298_sub53.readUByte() * 2068768775;
			else if (i == 8)
				anInt1942 = 652557667;
			else if (9 == i)
				anInt1939 = -1270173587;
			else if (i == 10)
				this.aBoolean1927 = true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("hy.p(").append(')').toString());
		}
	}

	void method1855(int i) {
		try {
			anInt1943 = (-738467127 * (CircleAngleTable.COSINE[this.anInt1922 * -1184073033 << 3]));
			long l = (long) (anInt1933 * 1776313545);
			long l_2_ = (long) (-739294135 * anInt1934);
			long l_3_ = (long) (anInt1935 * -1849369705);
			anInt1941 = (int) Math.sqrt((double) (l * l + l_2_ * l_2_ + l_3_ * l_3_)) * -1363693449;
			if (-1595714959 * anInt1920 == 0)
				anInt1920 = 1749954193;
			if (anInt1936 * -1660029223 == 0)
				aLong1931 = -5755520316440321689L;
			else if (anInt1936 * -1660029223 == 1) {
				aLong1931 = ((long) (-1570158024 * anInt1941 / (anInt1920 * -1595714959)) * 8888916578422759065L);
				aLong1931 *= aLong1931 * 6688605316592129449L;
			} else if (-1660029223 * anInt1936 == 2)
				aLong1931 = ((long) (-1570158024 * anInt1941 / (-1595714959 * anInt1920)) * 8888916578422759065L);
			if (this.aBoolean1927)
				anInt1941 *= -1;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("hy.i(").append(')').toString());
		}
	}

	Class190() {
		anInt1939 = 0;
		this.aBoolean1927 = false;
	}

	static final void method1856(ScriptRuntime class403, int i) {
		try {
			int i_4_ = (class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]);
			IComponentDefinition class105 = IComponentDefinition.getInterfaceComponent(i_4_);
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = -2093041337 * class105.aspectWidth;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("hy.qh(").append(')').toString());
		}
	}

	static final void method1857(ScriptRuntime class403, int i) {
		try {
			int i_5_ = (class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]);
			if (GameClient.anInt8942 * 1131012101 != 0 && i_5_ < -548972447 * GameClient.anInt8952) {
				class403.objectStack[((class403.objectArgs += 969361751) * -203050393) - 1] = GameClient.aStringArray8859[i_5_];
				if (null != GameClient.aStringArray8955[i_5_])
					class403.objectStack[((class403.objectArgs += 969361751) * -203050393) - 1] = GameClient.aStringArray8955[i_5_];
				else
					class403.objectStack[((class403.objectArgs += 969361751) * -203050393) - 1] = "";
			} else {
				class403.objectStack[((class403.objectArgs += 969361751) * -203050393) - 1] = "";
				class403.objectStack[((class403.objectArgs += 969361751) * -203050393) - 1] = "";
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("hy.wr(").append(')').toString());
		}
	}

	static final void method1858(ScriptRuntime class403, int i) {
		try {
			int i_6_ = (class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]);
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = SettingsManager.settingsManager.particles.getSupport(i_6_);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("hy.aos(").append(')').toString());
		}
	}

	public static int windowMode() {
			if (GameClient.fullscreen && GameClient.fullScreenFrame != null)
				return 3;
			return GameClient.resizable ? 2 : 1;
	}

	static final void method1860(ScriptRuntime class403, int i) {
		try {
			class403.integerPos += ((class403.integerstack[class403.integerPos * 1883543357]) * 286750741);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("hy.j(").append(')').toString());
		}
	}
}
