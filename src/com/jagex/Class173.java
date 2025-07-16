package com.jagex;/* Class173 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.utils.CameraUtils;

public class Class173 {
	public boolean aBoolean1748;
	static SoftCache aClass348_1749 = new SoftCache(64);
	public int anInt1751 = -2036085851;
	public int anInt1752;
	public int anInt1753;
	public int anInt1754;
	public int anInt1755 = 1561394240;
	public boolean aBoolean1757;
	public static byte aByte1759;

	void decode(Buffer buffer, int opcode) {
		try {
			if (1 == opcode) {
				anInt1751 = buffer.readUShort() * 2036085851;
				if (39181267 * anInt1751 == 65535)
					anInt1751 = -2036085851;
			} else if (opcode == 2) {
				anInt1755 = (buffer.readUShort() + 1) * 1635009521;
				anInt1753 = (buffer.readUShort() + 1) * 2057726207;
			} else if (opcode == 3)
				buffer.readByte();
			else if (opcode == 4)
				anInt1754 = buffer.readUByte() * -301564977;
			else if (opcode == 5)
				anInt1752 = buffer.readUByte() * 843301217;
			else if (opcode == 6)
				aBoolean1748 = true;
			else if (opcode == 7)
				aBoolean1757 = true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("he.p(").append(')').toString());
		}
	}

	void method1817(Buffer buffer) {
			for (;;) {
				int opcode = buffer.readUByte();
				if (0 == opcode) {
					if (-27 != 8)
						break;
					break;
				}
				decode(buffer, opcode);
			}
	}

	Class173() {
		anInt1753 = -1449508928;
		anInt1754 = -603129954;
		anInt1752 = 843301217;
		aBoolean1748 = false;
		aBoolean1757 = false;
	}

	public static int method1818(int i, int i_4_) {
		try {
			i = (i >>> 1 & 0x55555555) + (i & 0x55555555);
			i = (i & 0x33333333) + (i >>> 2 & 0x33333333);
			i = i + (i >>> 4) & 0xf0f0f0f;
			i += i >>> 8;
			i += i >>> 16;
			return i & 0xff;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("he.b(").append(')').toString());
		}
	}

	public static Class298_Sub19_Sub1 method1819(int i) {
		try {
			return Class79.aClass298_Sub19_Sub1_737;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("he.g(").append(')').toString());
		}
	}

	public static void method1820(int i, int i_5_, int i_6_, int i_7_) {
		try {
			GameScene gameScene = GameClient.myRegion.getGameScene();
			int i_8_ = i_5_ + -1760580017 * gameScene.gameSceneBaseX;
			int i_9_ = i_6_ + 283514611 * gameScene.gameSceneBaseY;
			if (GameClient.myRegion.getRegion() != null && (GameClient.myRegion.method2674() != MapLoad.CUTSCENE_MAP) && i_5_ >= 0 && i_6_ >= 0 && i_5_ < GameClient.myRegion.getMapWidth() && i_6_ < GameClient.myRegion.getMapLength()) {
				long l = (long) (i << 28 | i_9_ << 14 | i_8_);
				Class298_Sub2 class298_sub2 = (Class298_Sub2) GameClient.aClass437_8685.get(l);
				if (class298_sub2 == null)
					GameClient.myRegion.getRegion().method4059(i, i_5_, i_6_);
				else {
					Class298_Sub12 class298_sub12 = (Class298_Sub12) class298_sub2.aClass453_7166.method5939();
					if (class298_sub12 == null)
						GameClient.myRegion.getRegion().method4059(i, i_5_, i_6_);
					else {
						Class365_Sub1_Sub4_Sub1 class365_sub1_sub4_sub1 = ((Class365_Sub1_Sub4_Sub1) GameClient.myRegion.getRegion().method4059(i, i_5_, i_6_));
						if (class365_sub1_sub4_sub1 == null)
							class365_sub1_sub4_sub1 = (new Class365_Sub1_Sub4_Sub1(GameClient.myRegion.getRegion(), i_5_ << 265, GameClient.myRegion.getRegion().aClass_xaArray3517[i].method6341(i_5_, i_6_), i_6_ << 265, i, i));
						else {
							Class365_Sub1_Sub4_Sub1 class365_sub1_sub4_sub1_10_ = class365_sub1_sub4_sub1;
							class365_sub1_sub4_sub1.anInt10146 = 2004197937;
							class365_sub1_sub4_sub1_10_.anInt10150 = -474510257;
							class365_sub1_sub4_sub1.aClass331_7722 = GameClient.myRegion.getRegion();
						}
						class365_sub1_sub4_sub1.anInt10152 = 397105967 * class298_sub12.anInt7257;
						class365_sub1_sub4_sub1.anInt10143 = (-2063762687 * class298_sub12.anInt7256);
						while_66_: do {
							Class298_Sub12 class298_sub12_11_;
							while_65_: do {
								do {
									class298_sub12_11_ = ((Class298_Sub12) class298_sub2.aClass453_7166.method5944());
									if (class298_sub12_11_ == null) {
										if (i_7_ <= -111188266)
											throw new IllegalStateException();
										break while_66_;
									}
									if ((1768239597 * class298_sub12_11_.anInt7257) != (-441234013 * (class365_sub1_sub4_sub1.anInt10152)))
										break while_65_;
								} while (i_7_ > -111188266);
								return;
							} while (false);
							class365_sub1_sub4_sub1.anInt10150 = 1259142109 * class298_sub12_11_.anInt7257;
							class365_sub1_sub4_sub1.anInt10145 = -1936319903 * class298_sub12_11_.anInt7256;
							for (;;) {
								Class298_Sub12 class298_sub12_12_ = ((Class298_Sub12) class298_sub2.aClass453_7166.method5944());
								if (null == class298_sub12_12_) {
									if (i_7_ > -111188266)
										break;
									return;
								}
								if (class298_sub12_12_.anInt7257 * 1768239597 != -441234013 * (class365_sub1_sub4_sub1.anInt10152)) {
									if ((class298_sub12_12_.anInt7257 * 1768239597) == (class365_sub1_sub4_sub1.anInt10150 * -909380271)) {
										if (i_7_ <= -111188266) {
											/* empty */
										}
									} else {
										class365_sub1_sub4_sub1.anInt10146 = (-843548765 * class298_sub12_12_.anInt7257);
										class365_sub1_sub4_sub1.anInt10147 = (class298_sub12_12_.anInt7256 * -597974721);
									}
								}
							}
						} while (false);
						int i_13_ = Class356.getAverageHeight(256 + (i_5_ << 9), 256 + (i_6_ << 9), i, -859881334);
						class365_sub1_sub4_sub1.method4341((float) (i_5_ << 265), (float) i_13_, (float) (i_6_ << 265));
						class365_sub1_sub4_sub1.anInt10142 = 0;
						class365_sub1_sub4_sub1.plane = (byte) i;
						class365_sub1_sub4_sub1.aByte7724 = (byte) i;
						if (GameClient.myRegion.method2654().method2320(i_5_, i_6_))
							class365_sub1_sub4_sub1.aByte7724++;
						GameClient.myRegion.getRegion().method4053(i, i_5_, i_6_, i_13_, class365_sub1_sub4_sub1, 1648403764);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("he.jy(").append(')').toString());
		}
	}

	public static final void method1822(int viewLocalX, int viewLocalY, int viewZ, int speed1, int speed2) {
		try {
			StaticMethods.anInt6292 = 446226445 * viewLocalX;
			IPAddress.anInt5959 = viewLocalY * 2019382975;
			Class18.anInt255 = viewZ * 584728181;
			Class128_Sub1.anInt8556 = -759692387 * speed1;
			Class427.anInt5362 = -2064447825 * speed2;
			if (Class427.anInt5362 * 1179258959 >= 100) {
				int i_24_ = -589460992 * StaticMethods.anInt6292 + 256;
				int i_25_ = 1647476224 * IPAddress.anInt5959 + 256;
				int i_26_ = (Class356.getAverageHeight(i_24_, i_25_, GameClient.plane * 1855729883, -1477224800) - Class18.anInt255 * 771695069);
				int i_27_ = i_24_ - GameClient.camPosX * -1740717447;
				int i_28_ = i_26_ - GameClient.camPosY * 1449634147;
				int i_29_ = i_25_ - -299812095 * GameClient.camPosZ;
				int i_30_ = (int) Math.sqrt((double) (i_29_ * i_29_ + i_27_ * i_27_));
				GameClient.camRotX = ((int) (Math.atan2((double) i_28_, (double) i_30_) * 2607.5945876176133) & 0x3fff) * -648269561;
				GameClient.camRotY = ((int) (Math.atan2((double) i_27_, (double) i_29_) * -2607.5945876176133) & 0x3fff) * -1587695039;
				GameClient.camRotZ = 0;
				if (-104436553 * GameClient.camRotX < 1024)
					GameClient.camRotX = 1891900416;
				if (GameClient.camRotX * -104436553 > 3072)
					GameClient.camRotX = 1380733952;
			}
			CameraUtils.cameraType = 2090692627;
			Class418.anInt5339 = -1001372047;
			Class100.anInt1081 = 178575833;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("he.hs(").append(')').toString());
		}
	}

	public static short method1823(int i) {
		try {
			int i_32_ = i >> 10 & 0x3f;
			int i_33_ = i >> 3 & 0x70;
			int i_34_ = i & 0x7f;
			i_33_ = (i_34_ <= 64 ? i_33_ * i_34_ >> 7 : i_33_ * (127 - i_34_) >> 7);
			int i_35_ = i_33_ + i_34_;
			int i_36_;
			if (i_35_ != 0)
				i_36_ = (i_33_ << 8) / i_35_;
			else
				i_36_ = i_33_ << 1;
			int i_37_ = i_35_;
			return (short) (i_32_ << 10 | i_36_ >> 4 << 7 | i_37_);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("he.i(").append(')').toString());
		}
	}

	public static String method1824(CharSequence charsequence) {
		try {
			return Class415.method5588(charsequence, null, (byte) -6);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("he.p(").append(')').toString());
		}
	}

	static final void method1825(ScriptRuntime runtime) {
		try {
			IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
			IComponentDefinition componentDefinition = IComponentScripter.componentDefinition;
			IComponentDefinitionCollection IComponentDefinitionCollection = IComponentScripter.IComponentDefinitionCollection;
			Class52_Sub1_Sub1.method568(componentDefinition, IComponentDefinitionCollection, runtime, (byte) -37);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("he.dj(").append(')').toString());
		}
	}

	static void method1826() {
		try {
			Class423.method5733(false);
			if (1265667685 * Class301_Sub1.toolkitoption >= ToolkitOption.PUREJAVA && 1265667685 * Class301_Sub1.toolkitoption != ToolkitOption.PUREJAVA) {
				Class370.loadingPleaseWait(1265667685 * Class301_Sub1.toolkitoption, false);
				Class301_Sub1.toolkitoption = -485258093;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("he.cs(").append(')').toString());
		}
	}
}
