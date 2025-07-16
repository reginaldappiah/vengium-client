package com.jagex;/* Class234 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Class234 {
	static int anInt2596 = 0;
	static int anInt2597 = 0;
	static SpriteToolkit[] aClass57Array2598;

	Class234() throws Throwable {
		throw new Error();
	}

	public static void method2175() {
			if (Class230.anInterface12Array2562 != null) {
				Interface12[] interface12s = Class230.anInterface12Array2562;
				for (int i_9_ = 0; i_9_ < interface12s.length; i_9_++) {
					Interface12 interface12 = interface12s[i_9_];
					interface12.method150(-1773131058);
				}
			}
	}

	static final void method2176(ScriptRuntime class403, int i) {
		try {
			int i_10_ = (class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]);
			IComponentDefinition class105 = IComponentDefinition.getInterfaceComponent(i_10_);
			IComponentDefinitionCollection IComponentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[i_10_ >> 16];
			ToMoveIComponentScripts.method782(class105, class403);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("jw.nm(").append(')').toString());
		}
	}

	static final void method2177(ScriptRuntime class403, int i) {
		try {
			int i_11_ = (class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]);
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = GameClient.stockMarketListing[i_11_].anInt2768 * 535421071;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("jw.ya(").append(')').toString());
		}
	}

	static final void method2178(ScriptRuntime class403, int i) {
		try {
			class403.integerStackOffset -= -783761378;
			int i_12_ = (class403.integerStack[class403.integerStackOffset * 681479919]);
			int i_13_ = (class403.integerStack[1 + 681479919 * class403.integerStackOffset]);
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = i_12_ % i_13_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("jw.zu(").append(')').toString());
		}
	}

	static final void method2179(ScriptRuntime runtime) {
		try {
			Class74.method830((runtime.integerStack[(runtime.integerStackOffset -= -391880689) * 681479919]), -1, -1, false);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("jw.adl(").append(')').toString());
		}
	}

	static final void method2180(ScriptRuntime runtime) {
		try {
			runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = SettingsManager.settingsManager.soundEffectsVolume.getValue();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("jw.ajz(").append(')').toString());
		}
	}

	public static void method2181(RsBitsBuffer class298_sub53_sub2, int i) {
		try {
			Class298_Sub47 class298_sub47 = ((Class298_Sub47) Class478.aClass453_6002.method5939());
			if (null != class298_sub47) {
				int i_14_ = 385051775 * class298_sub53_sub2.offset;
				class298_sub53_sub2.writeInt(-1886044647 * (class298_sub47.anInt7542));
				for (int i_15_ = 0; i_15_ < (719522345 * class298_sub47.anInt7538); i_15_++) {
					if (0 != (class298_sub47.anIntArray7536[i_15_]))
						class298_sub53_sub2.writeByte((class298_sub47.anIntArray7536[i_15_]));
					else {
						try {
							int i_16_ = (class298_sub47.anIntArray7537[i_15_]);
							if (0 == i_16_) {
								Field field = (class298_sub47.aFieldArray7539[i_15_]);
								int i_17_ = field.getInt(null);
								class298_sub53_sub2.writeByte(0);
								class298_sub53_sub2.writeInt(i_17_);
							} else if (i_16_ == 1) {
								Field field = (class298_sub47.aFieldArray7539[i_15_]);
								field.setInt(null, (class298_sub47.anIntArray7535[i_15_]));
								class298_sub53_sub2.writeByte(0);
							} else if (i_16_ == 2) {
								Field field = (class298_sub47.aFieldArray7539[i_15_]);
								int i_18_ = field.getModifiers();
								class298_sub53_sub2.writeByte(0);
								class298_sub53_sub2.writeInt(i_18_);
							}
							if (i_16_ == 3) {
								Method method = (class298_sub47.aMethodArray7541[i_15_]);
								byte[][] is = (class298_sub47.aByteArrayArrayArray7540[i_15_]);
								Object[] objects = new Object[is.length];
								for (int i_19_ = 0; i_19_ < is.length; i_19_++) {
									ObjectInputStream objectinputstream = (new ObjectInputStream(new ByteArrayInputStream(is[i_19_])));
									objects[i_19_] = objectinputstream.readObject();
								}
								Object object = method.invoke(null, objects);
								if (object == null)
									class298_sub53_sub2.writeByte(0);
								else if (object instanceof Number) {
									class298_sub53_sub2.writeByte(1);
									class298_sub53_sub2.writeLong(((Number) object).longValue());
								} else if (object instanceof String) {
									class298_sub53_sub2.writeByte(2);
									class298_sub53_sub2.writeString(((String) object));
								} else
									class298_sub53_sub2.writeByte(4);
							} else if (i_16_ == 4) {
								Method method = (class298_sub47.aMethodArray7541[i_15_]);
								int i_20_ = method.getModifiers();
								class298_sub53_sub2.writeByte(0);
								class298_sub53_sub2.writeInt(i_20_);
							}
						} catch (ClassNotFoundException classnotfoundexception) {
							class298_sub53_sub2.writeByte(-10);
						} catch (InvalidClassException invalidclassexception) {
							class298_sub53_sub2.writeByte(-11);
						} catch (StreamCorruptedException streamcorruptedexception) {
							class298_sub53_sub2.writeByte(-12);
						} catch (OptionalDataException optionaldataexception) {
							class298_sub53_sub2.writeByte(-13);
						} catch (IllegalAccessException illegalaccessexception) {
							class298_sub53_sub2.writeByte(-14);
						} catch (IllegalArgumentException illegalargumentexception) {
							class298_sub53_sub2.writeByte(-15);
						} catch (InvocationTargetException invocationtargetexception) {
							class298_sub53_sub2.writeByte(-16);
						} catch (SecurityException securityexception) {
							class298_sub53_sub2.writeByte(-17);
						} catch (IOException ioexception) {
							class298_sub53_sub2.writeByte(-18);
						} catch (NullPointerException nullpointerexception) {
							class298_sub53_sub2.writeByte(-19);
						} catch (Exception exception) {
							class298_sub53_sub2.writeByte(-20);
						} catch (Throwable throwable) {
							class298_sub53_sub2.writeByte(-21);
						}
					}
				}
				class298_sub53_sub2.method3614(i_14_);
				class298_sub47.unlink();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("jw.b(").append(')').toString());
		}
	}

	static Class298_Sub32 method2182(int i, byte i_21_) {
		try {
			switch (i) {
			case 0:
				return new Class298_Sub32_Sub27();
			case 17:
				return new Class298_Sub32_Sub4();
			case 8:
				return new Class298_Sub32_Sub3();
			case 18:
				return new Class298_Sub32_Sub11_Sub1();
			case 25:
				return new Class298_Sub32_Sub6();
			case 12:
				return new Class298_Sub32_Sub18();
			case 24:
				return new Class298_Sub32_Sub7();
			case 6:
				return new Class298_Sub32_Sub22();
			case 34:
				return new Class298_Sub32_Sub34();
			case 32:
				return new Class298_Sub32_Sub23();
			case 7:
				return new Class298_Sub32_Sub26();
			case 36:
				return new Class298_Sub32_Sub29();
			case 2:
				return new Class298_Sub32_Sub12();
			case 14:
				return new Class298_Sub32_Sub37();
			case 28:
				return new Class298_Sub32_Sub33();
			case 38:
				return new Class298_Sub32_Sub5();
			case 20:
				return new Class298_Sub32_Sub16();
			case 26:
				return new Class298_Sub32_Sub32();
			case 9:
				return new Class298_Sub32_Sub9();
			case 33:
				return new Class298_Sub32_Sub35();
			case 23:
				return new Class298_Sub32_Sub25();
			case 31:
				return new Class298_Sub32_Sub31();
			case 30:
				return new Class298_Sub32_Sub15();
			case 11:
				return new Class298_Sub32_Sub36();
			case 27:
				return new Class298_Sub32_Sub39();
			case 19:
				return new Class298_Sub32_Sub19();
			case 29:
				return new Class298_Sub32_Sub2();
			case 37:
				return new Class298_Sub32_Sub38();
			case 16:
				return new Class298_Sub32_Sub20();
			case 35:
				return new Class298_Sub32_Sub1();
			case 21:
				return new Class298_Sub32_Sub24();
			case 15:
				return new Class298_Sub32_Sub17();
			case 10:
				return new Class298_Sub32_Sub21();
			case 3:
				return new Class298_Sub32_Sub30();
			case 4:
				return new Class298_Sub32_Sub8();
			case 13:
				return new Class298_Sub32_Sub13();
			case 5:
				return new Class298_Sub32_Sub28();
			case 39:
				return new Class298_Sub32_Sub11();
			case 1:
				return new Class298_Sub32_Sub10();
			case 22:
				return new Class298_Sub32_Sub14();
			default:
				return null;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("jw.d(").append(')').toString());
		}
	}

	public static void method2183() {
		try {
			if (!Class21.aBoolean274) {
				Class336.method4093((GameClient.myRegion.getRegion().aClass326ArrayArrayArray3518), 234916861);
				if ((GameClient.myRegion.getRegion().aClass326ArrayArrayArray3520) != null)
					Class336.method4093((GameClient.myRegion.getRegion().aClass326ArrayArrayArray3520), -1747837187);
				Class21.aBoolean274 = true;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("jw.a(").append(')').toString());
		}
	}

}
