package com.jagex;/* Class207 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class VarDefinition {
	public char aChar2358;
	public int anInt2359 = 0;

	void decode(Buffer buffer) {
		try {
			for (;;) {
				int op = buffer.readUByte();
				if (op == 0) {
					break;
				}
				decode(buffer, op);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("is.a(").append(')').toString());
		}
	}

	void decode(Buffer buffer, int i) {
		try {
			if (1 == i)
				aChar2358 = Class485.keyCodeToSymbol(buffer.readByte());
			else if (5 == i)
				anInt2359 = buffer.readUShort() * 1981336427;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("is.f(").append(')').toString());
		}
	}

	VarDefinition() {
		/* empty */
	}

	public static boolean method1930(int i) {
		try {
			return (i >= Class424.aClass424_6608.type * -1976050083 && i <= -1976050083 * Class424.aClass424_6606.type);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("is.u(").append(')').toString());
		}
	}

	static int method1931(Class343_Sub1 class343_sub1, Class343_Sub1 class343_sub1_3_, int i, boolean bool, int i_4_) {
		try {
			if (1 == i) {
				int i_5_ = class343_sub1.anInt3666 * -945794709;
				int i_6_ = class343_sub1_3_.anInt3666 * -945794709;
				if (!bool) {
					if (-1 == i_5_)
						i_5_ = 2001;
					if (i_6_ == -1)
						i_6_ = 2001;
				}
				return i_5_ - i_6_;
			}
			if (i == 2)
				return StaticMethods.method397((class343_sub1.method4163().aString3819), (class343_sub1_3_.method4163().aString3819), GameLanguage.CURRENT_LANGUAGE, -1018238154);
			if (3 == i) {
				if (class343_sub1.aString7719.equals("-")) {
					if (class343_sub1_3_.aString7719.equals("-"))
						return 0;
					return bool ? -1 : 1;
				}
				if (class343_sub1_3_.aString7719.equals("-"))
					return bool ? 1 : -1;
				return StaticMethods.method397(class343_sub1.aString7719, class343_sub1_3_.aString7719, GameLanguage.CURRENT_LANGUAGE, -1275230374);
			}
			if (i == 4)
				return (class343_sub1.method4157(-963368374) ? class343_sub1_3_.method4157(740881863) ? 0 : 1 : class343_sub1_3_.method4157(229552705) ? -1 : 0);
			if (i == 5)
				return (class343_sub1.method4155((byte) -26) ? class343_sub1_3_.method4155((byte) 52) ? 0 : 1 : class343_sub1_3_.method4155((byte) -31) ? -1 : 0);
			if (i == 6)
				return (class343_sub1.method4156(1077942153) ? class343_sub1_3_.method4156(1938157273) ? 0 : 1 : class343_sub1_3_.method4156(807716549) ? -1 : 0);
			if (i == 7)
				return (class343_sub1.method4158(1154945223) ? class343_sub1_3_.method4158(1235018049) ? 0 : 1 : class343_sub1_3_.method4158(2089010141) ? -1 : 0);
			if (i == 8) {
				int i_7_ = class343_sub1.address * 512449113;
				int i_8_ = 512449113 * class343_sub1_3_.address;
				if (bool) {
					if (1000 == i_7_)
						i_7_ = -1;
					if (1000 == i_8_)
						i_8_ = -1;
				} else {
					if (i_7_ == -1)
						i_7_ = 1000;
					if (i_8_ == -1)
						i_8_ = 1000;
				}
				return i_7_ - i_8_;
			}
			return (-15394297 * class343_sub1.anInt7717 - -15394297 * class343_sub1_3_.anInt7717);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("is.q(").append(')').toString());
		}
	}

	public static String method1933(MenuOption menuOption) {
			if (GameClient.menuOpen || null == menuOption)
				return "";
			int[] is = Class313.method3821(menuOption);
			if (is == null)
				return "";
			return StaticMethods.method1999(is);
	}

}
