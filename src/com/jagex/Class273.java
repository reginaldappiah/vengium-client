package com.jagex;/* Class273 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URI;

public class Class273 {
	public static Class273 aClass273_2904;
	static Class273 aClass273_2905 = new Class273();
	public static Class273 aClass273_2906 = new Class273();
	static Class273 aClass273_2907;

	static {
		aClass273_2904 = new Class273();
		aClass273_2907 = new Class273();
	}

	Class273() {
		/* empty */
	}

	public static void method2559(String string, boolean bool, boolean bool_0_, String string_1_, boolean bool_2_, boolean bool_3_, int i) {
			if (bool) {
				do {
					if (!bool_2_ && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
						try {
							Desktop.getDesktop().browse(new URI(string));
						} catch (Exception exception) {
							break;
						}
						return;
					}
				} while (false);
				if (Class82_Sub8.operatingSystem.startsWith("win") && !bool_2_)
					Class254.method2427(string, 0, (byte) 23);
				else if (Class82_Sub8.operatingSystem.startsWith("mac"))
					Class65.method762(string, 1, string_1_);
				else
					Class254.method2427(string, 2, (byte) 77);
			} else
				Class254.method2427(string, 3, (byte) 71);
	}

	static final void method2560(ScriptRuntime runtime) {
		try {
			runtime.objectArgs -= 1938723502;
			runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = StaticMethods.method397((String) (runtime.objectStack[(runtime.objectArgs * -203050393)]), ((String) (runtime.objectStack[-203050393 * (runtime.objectArgs) + 1])), GameLanguage.CURRENT_LANGUAGE, -1813623072);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("li.zz(").append(')').toString());
		}
	}

	static final void method2561(ScriptRuntime runtime) {
		try {
			boolean bool = false;
			if (GameClient.aBoolean8638) {
				try {
					Object object = (Class212.aClass212_2426.method1953((new Object[] { Integer.valueOf(NotDefinition.anInt7456 * 1914527151), (Boolean.valueOf(1 == (Player.myPlayer.isMale))), Integer.valueOf(runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]) })));
					if (null != object)
						bool = ((Boolean) object).booleanValue();
				} catch (Throwable throwable) {
					/* empty */
				}
			}
			runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = bool ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("li.ant(").append(')').toString());
		}
	}

	static void method2562(int i, int i_4_, int i_5_, boolean bool, int i_6_, boolean bool_7_, byte i_8_) {
		try {
			if (i < i_4_) {
				int i_9_ = (i + i_4_) / 2;
				int i_10_ = i;
				Class343_Sub1 class343_sub1 = Class474.aClass343_Sub1Array5975[i_9_];
				Class474.aClass343_Sub1Array5975[i_9_] = Class474.aClass343_Sub1Array5975[i_4_];
				Class474.aClass343_Sub1Array5975[i_4_] = class343_sub1;
				for (int i_11_ = i; i_11_ < i_4_; i_11_++) {
					if (Class310.method3809((Class474.aClass343_Sub1Array5975[i_11_]), class343_sub1, i_5_, bool, i_6_, bool_7_, -279850410) <= 0) {
						Class343_Sub1 class343_sub1_12_ = Class474.aClass343_Sub1Array5975[i_11_];
						Class474.aClass343_Sub1Array5975[i_11_] = Class474.aClass343_Sub1Array5975[i_10_];
						Class474.aClass343_Sub1Array5975[i_10_++] = class343_sub1_12_;
					}
				}
				Class474.aClass343_Sub1Array5975[i_4_] = Class474.aClass343_Sub1Array5975[i_10_];
				Class474.aClass343_Sub1Array5975[i_10_] = class343_sub1;
				method2562(i, i_10_ - 1, i_5_, bool, i_6_, bool_7_, (byte) -43);
				method2562(1 + i_10_, i_4_, i_5_, bool, i_6_, bool_7_, (byte) 54);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("li.posX(").append(')').toString());
		}
	}

	static final void method2564(ScriptRuntime class403, short i) {
		try {
			class403.integerStackOffset -= -1175642067;
			int i_15_ = (class403.integerStack[class403.integerStackOffset * 681479919]);
			int i_16_ = (class403.integerStack[class403.integerStackOffset * 681479919 + 1]);
			int i_17_ = (class403.integerStack[681479919 * class403.integerStackOffset + 2]);
			Class301_Sub1.method3713(9, i_15_ << 16 | i_16_, i_17_, "");
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("li.alx(").append(')').toString());
		}
	}

	public static int method2565(short i) {
		try {
			return 14;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("li.k(").append(')').toString());
		}
	}

	public static void method2566(Buffer buffer, int i) {
			Class298_Sub47 class298_sub47 = new Class298_Sub47();
			class298_sub47.anInt7538 = buffer.readUByte() * -468176359;
			class298_sub47.anInt7542 = buffer.readInt() * -530104791;
			class298_sub47.anIntArray7537 = (new int[class298_sub47.anInt7538 * 719522345]);
			class298_sub47.anIntArray7536 = (new int[class298_sub47.anInt7538 * 719522345]);
			class298_sub47.aFieldArray7539 = (new Field[719522345 * class298_sub47.anInt7538]);
			class298_sub47.anIntArray7535 = (new int[class298_sub47.anInt7538 * 719522345]);
			class298_sub47.aMethodArray7541 = (new Method[719522345 * class298_sub47.anInt7538]);
			class298_sub47.aByteArrayArrayArray7540 = (new byte[class298_sub47.anInt7538 * 719522345][][]);
			for (int i_19_ = 0; (i_19_ < class298_sub47.anInt7538 * 719522345); i_19_++) {
				try {
					int i_20_ = buffer.readUByte();
					if (i_20_ == 0 || i_20_ == 1 || 2 == i_20_) {
						String string = buffer.readString();
						String string_21_ = buffer.readString();
						int i_22_ = 0;
						if (1 == i_20_)
							i_22_ = buffer.readInt();
						class298_sub47.anIntArray7537[i_19_] = i_20_;
						class298_sub47.anIntArray7535[i_19_] = i_22_;
						if (Class136.method1498(string, (byte) 67).getClassLoader() == null)
							throw new SecurityException();
						class298_sub47.aFieldArray7539[i_19_] = Class136.method1498(string, (byte) 81).getDeclaredField(string_21_);
					} else if (i_20_ == 3 || 4 == i_20_) {
						String string = buffer.readString();
						String string_23_ = buffer.readString();
						int i_24_ = buffer.readUByte();
						String[] strings = new String[i_24_];
						for (int i_25_ = 0; i_25_ < i_24_; i_25_++)
							strings[i_25_] = buffer.readString();
						String string_26_ = buffer.readString();
						byte[][] is = new byte[i_24_][];
						if (i_20_ == 3) {
							for (int i_27_ = 0; i_27_ < i_24_; i_27_++) {
								int i_28_ = buffer.readInt();
								is[i_27_] = new byte[i_28_];
								buffer.readBytes(is[i_27_], 0, i_28_);
							}
						}
						class298_sub47.anIntArray7537[i_19_] = i_20_;
						Class[] var_classes = new Class[i_24_];
						for (int i_29_ = 0; i_29_ < i_24_; i_29_++)
							var_classes[i_29_] = Class136.method1498(strings[i_29_], (byte) 64);
						Class var_class = Class136.method1498(string_26_, (byte) 5);
						if (Class136.method1498(string, (byte) 23).getClassLoader() == null)
							throw new SecurityException();
						Method[] methods = Class136.method1498(string, (byte) 42).getDeclaredMethods();
						Method[] methods_30_ = methods;
						for (int i_31_ = 0; i_31_ < methods_30_.length; i_31_++) {
							Method method = methods_30_[i_31_];
							if (method.getName().equals(string_23_)) {
								Class[] var_classes_32_ = method.getParameterTypes();
								if (var_classes.length == var_classes_32_.length) {
									boolean bool = true;
									for (int i_33_ = 0; i_33_ < var_classes.length; i_33_++) {
										if (var_classes[i_33_] != var_classes_32_[i_33_]) {
											bool = false;
											break;
										}
									}
									if (bool && var_class == method.getReturnType())
										class298_sub47.aMethodArray7541[i_19_] = method;
								}
							}
						}
						class298_sub47.aByteArrayArrayArray7540[i_19_] = is;
					}
				} catch (ClassNotFoundException classnotfoundexception) {
					class298_sub47.anIntArray7536[i_19_] = -1;
				} catch (SecurityException securityexception) {
					class298_sub47.anIntArray7536[i_19_] = -2;
				} catch (NullPointerException nullpointerexception) {
					class298_sub47.anIntArray7536[i_19_] = -3;
				} catch (Exception exception) {
					class298_sub47.anIntArray7536[i_19_] = -4;
				} catch (Throwable throwable) {
					class298_sub47.anIntArray7536[i_19_] = -5;
				}
			}
			Class478.aClass453_6002.pushBack(class298_sub47);
	}
}
