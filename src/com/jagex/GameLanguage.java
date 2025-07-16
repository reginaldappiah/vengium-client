package com.jagex;/* Class429 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import com.jagex.game.cache.config.prefetch.Js5List;
import com.jagex.network.OutgoingPacket;
import com.jagex.utils.TimeUtils;

import java.util.Locale;

public class GameLanguage implements Interface21 {
	public static GameLanguage english = new GameLanguage("EN", "en", 0, "GB");
	public static GameLanguage german = new GameLanguage("DE", "de", 1, "DE");
	public static GameLanguage french = new GameLanguage("FR", "fr", 2, "FR");
	public static GameLanguage portugese = new GameLanguage("PT", "pt", 3, "BR");
	public static GameLanguage CURRENT_LANGUAGE;
	static GameLanguage dutch = new GameLanguage("NL", "nl", 4, "NL");
	public static GameLanguage spanish = new GameLanguage("ES", "es", 5, "ES");
	String aString6629;
	int anInt6630;
	public static int anInt6631 = 6;
	
	String aString6633;
	Locale aLocale6634;
	static GameLanguage[] languages;

	static {
		GameLanguage[] class429s = getLanguages();
		languages = new GameLanguage[class429s.length];
		GameLanguage[] class429s_0_ = class429s;
		for (int i = 0; i < class429s_0_.length; i++) {
			GameLanguage class429 = class429s_0_[i];
			if ((languages[-1719637847 * class429.anInt6630]) != null)
				throw new IllegalStateException();
			languages[-1719637847 * class429.anInt6630] = class429;
		}
	}

	public String method5753() {
			return this.aString6629;
	}

	public static GameLanguage getLanguage(int languageID) {
			if (languageID < 0 || languageID >= languages.length)
				return null;
			return languages[languageID];
	}

	GameLanguage(String string, String string_2_, int i, String string_4_) {
		this.aString6633 = string;
		this.aString6629 = string_2_;
		this.anInt6630 = -501302375 * i;
		Locale locale = null;
		if (null != string_4_)
			locale = new Locale(method5753(), string_4_);
		if (null != locale)
			this.aLocale6634 = locale;
		else
			this.aLocale6634 = new Locale(method5753());
	}

	public String toString() {
			return method5753().toLowerCase(Locale.ENGLISH);
	}

	public Locale method5755(int i) {
		try {
			return this.aLocale6634;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("rt.p(").append(')').toString());
		}
	}

	public int getID() {
		try {
			return this.anInt6630 * -1719637847;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("rt.f(").append(')').toString());
		}
	}

	public int method244() {
		return this.anInt6630 * -1719637847;
	}

	public static GameLanguage[] getLanguages() {
			return (new GameLanguage[] { spanish, french, dutch, german, english, portugese });
	}

	static final void method5757(ScriptRuntime class403, byte i) {
		try {
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = SettingsManager.settingsManager.groundDecoration.method5628() ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("rt.ans(").append(')').toString());
		}
	}

	static final void method5758(IComponentDefinition component) {
		try {
			if (GameClient.getComponentSettings(component).method3492() && null == GameClient.loadingScreen) {
				ToMoveIComponentScripts.sendDialogueContinuePacket(component.interfaceHash, component.slot * -1309843523);
				GameClient.loadingScreen = IComponentDefinition.getContainerComponent(component.interfaceHash, component.slot * -1309843523);
				StaticMethods.updateComponentTick(GameClient.loadingScreen);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("rt.cl(").append(')').toString());
		}
	}

	public int method243() {
		return this.anInt6630 * -1719637847;
	}

	public static boolean isLetter(char c, int i) {
			return c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z';
	}

	static final void method4332(ScriptRuntime runtime) {
			String string = (String) (runtime.objectStack[(runtime.objectArgs -= 969361751) * -203050393]);
			ConnectionType connectionType = ConnectionType.getConnectionType();
			OutgoingPacketBuffer outgoingPacketBuffer = Class18.method359(OutgoingPacket.SEND_FRIEND_QUICK_CHAT_PACKET, connectionType.encryptor);
			outgoingPacketBuffer.payload.writeByte(0);
			int i_25_ = (385051775 * outgoingPacketBuffer.payload.offset);
			outgoingPacketBuffer.payload.writeString(string);
			outgoingPacketBuffer.payload.writeShort(runtime.aClass177_5243.anInt1787 * -2034569943);
			runtime.aClass177_5243.aClass298_Sub37_Sub14_1788.method3464(outgoingPacketBuffer.payload, runtime.aClass177_5243.anIntArray1789, 535185989);
			outgoingPacketBuffer.payload.method3649((outgoingPacketBuffer.payload.offset * 385051775) - i_25_);
			connectionType.sendFrame(outgoingPacketBuffer);
	}

	static char method767(char c, GameLanguage gameLanguage) {
		try {
			if (c >= '\u00c0' && c <= '\u00ff') {
				if (c >= '\u00c0' && c <= '\u00c6')
					return 'A';
				if (c == '\u00c7')
					return 'C';
				if (c >= '\u00c8' && c <= '\u00cb')
					return 'E';
				if (c >= '\u00cc' && c <= '\u00cf')
					return 'I';
				if ('\u00d1' == c && gameLanguage != spanish)
					return 'N';
				if (c >= '\u00d2' && c <= '\u00d6')
					return 'O';
				if (c >= '\u00d9' && c <= '\u00dc')
					return 'U';
				if ('\u00dd' == c)
					return 'Y';
				if (c == '\u00df')
					return 's';
				if (c >= '\u00e0' && c <= '\u00e6')
					return 'a';
				if (c == '\u00e7')
					return 'c';
				if (c >= '\u00e8' && c <= '\u00eb')
					return 'e';
				if (c >= '\u00ec' && c <= '\u00ef')
					return 'i';
				if (c == '\u00f1' && gameLanguage != spanish)
					return 'n';
				if (c >= '\u00f2' && c <= '\u00f6')
					return 'o';
				if (c >= '\u00f9' && c <= '\u00fc')
					return 'u';
				if (c == '\u00fd' || '\u00ff' == c)
					return 'y';
			}
			if ('\u0152' == c)
				return 'O';
			if (c == '\u0153')
				return 'o';
			if ('\u0178' == c)
				return 'Y';
			return c;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("cr.f(").append(')').toString());
		}
	}

	static final void method5759(ScriptRuntime runtime) {
		try {
			runtime.integerStackOffset -= -783761378;
			int i_5_ = (runtime.integerStack[runtime.integerStackOffset * 681479919]);
			int i_6_ = (runtime.integerStack[681479919 * runtime.integerStackOffset + 1]);
			runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = i_5_ - i_6_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("rt.yp(").append(')').toString());
		}
	}


	static final void method5761(GraphicsToolkit class_ra, MaterialRawLoader interface_ma, byte i) {
		try {
			if (null != Class301_Sub1.aClass298_Sub37_Sub13_3218) {
				TimeUtils.getTime();
				TimeUtils.getTime();
				if (Class301_Sub1.anInt7624 * -1289394455 < 10) {
					if (!Class301_Sub1.worldMapIndex.method2312(Class301_Sub1.aClass298_Sub37_Sub13_3218.locationName)) {
						Class301_Sub1.anInt7624 = (Js5List.JS5_WORLDMAPDATA.getGroupProgress((Class301_Sub1.aClass298_Sub37_Sub13_3218.locationName))) / 10 * 1078186329;
						return;
					}
					StaticMethods.method3873();
					Class301_Sub1.anInt7624 = -2103038598;
				}
				if (10 == Class301_Sub1.anInt7624 * -1289394455) {
					Class301_Sub1.mapX = (Class301_Sub1.aClass298_Sub37_Sub13_3218.anInt9650 * 1364716801) >> 6 << 6;
					Class301_Sub1.mapY = (1345239131 * (Class301_Sub1.aClass298_Sub37_Sub13_3218.anInt9649) >> 6 << 6);
					Class301_Sub1.anInt3239 = ((Class301_Sub1.aClass298_Sub37_Sub13_3218.anInt9647 * -2052483955) >> 6 << 6) - Class301_Sub1.mapX + 64;
					Class301_Sub1.anInt3240 = 64 + (((Class301_Sub1.aClass298_Sub37_Sub13_3218.anInt9646) * 929385381 >> 6 << 6) - Class301_Sub1.mapY);
					int[] is = new int[3];
					int i_7_ = -1;
					int i_8_ = -1;
					Vector3f class217 = (Player.myPlayer.getWorldTransform().trans);
					GameScene gameScene = GameClient.myRegion.getGameScene();
					if (Class301_Sub1.aClass298_Sub37_Sub13_3218.method3453(Player.myPlayer.plane, (((int) class217.x >> 9) + -1760580017 * gameScene.gameSceneBaseX), (283514611 * gameScene.gameSceneBaseY + ((int) class217.z >> 9)), is)) {
						i_7_ = is[1] - Class301_Sub1.mapX;
						i_8_ = is[2] - Class301_Sub1.mapY;
					}
					if (!Class301_Sub1.aBoolean7631 && i_7_ >= 0 && i_7_ < Class301_Sub1.anInt3239 && i_8_ >= 0 && i_8_ < Class301_Sub1.anInt3240) {
						i_7_ += (int) (Math.random() * 10.0) - 5;
						i_8_ += (int) (Math.random() * 10.0) - 5;
						Class82_Sub14.anInt6875 = i_7_ * -2076584633;
						Class376.anInt4090 = -435591305 * i_8_;
					} else if (1646852571 * Class301_Sub1.anInt7629 != -1 && -1 != Class301_Sub1.anInt7623 * 679054909) {
						Class301_Sub1.aClass298_Sub37_Sub13_3218.method3452(1646852571 * Class301_Sub1.anInt7629, Class301_Sub1.anInt7623 * 679054909, is);
						if (null != is) {
							Class82_Sub14.anInt6875 = -2076584633 * (is[1] - Class301_Sub1.mapX);
							Class376.anInt4090 = ((is[2] - Class301_Sub1.mapY) * -435591305);
						}
						Class301_Sub1.anInt7623 = 1505298155;
						Class301_Sub1.anInt7629 = 1801430445;
						Class301_Sub1.aBoolean7631 = false;
					} else {
						Class301_Sub1.aClass298_Sub37_Sub13_3218.method3452((Class301_Sub1.aClass298_Sub37_Sub13_3218.anInt9644) * -1973484731 >> 14 & 0x3fff, -1973484731 * (Class301_Sub1.aClass298_Sub37_Sub13_3218.anInt9644) & 0x3fff, is);
						Class82_Sub14.anInt6875 = (is[1] - Class301_Sub1.mapX) * -2076584633;
						Class376.anInt4090 = (is[2] - Class301_Sub1.mapY) * -435591305;
					}
					if ((1110271707 * Class301_Sub1.aClass298_Sub37_Sub13_3218.anInt9645) == 37) {
						Class301_Sub1.aFloat3233 = 3.0F;
						Class301_Sub1.aFloat3234 = 3.0F;
					} else if ((Class301_Sub1.aClass298_Sub37_Sub13_3218.anInt9645) * 1110271707 == 50) {
						Class301_Sub1.aFloat3233 = 4.0F;
						Class301_Sub1.aFloat3234 = 4.0F;
					} else if ((Class301_Sub1.aClass298_Sub37_Sub13_3218.anInt9645) * 1110271707 == 75) {
						Class301_Sub1.aFloat3233 = 6.0F;
						Class301_Sub1.aFloat3234 = 6.0F;
					} else if (1110271707 * (Class301_Sub1.aClass298_Sub37_Sub13_3218.anInt9645) == 100) {
						Class301_Sub1.aFloat3233 = 8.0F;
						Class301_Sub1.aFloat3234 = 8.0F;
					} else if (1110271707 * (Class301_Sub1.aClass298_Sub37_Sub13_3218.anInt9645) == 200) {
						Class301_Sub1.aFloat3233 = 16.0F;
						Class301_Sub1.aFloat3234 = 16.0F;
					} else {
						Class301_Sub1.aFloat3233 = 8.0F;
						Class301_Sub1.aFloat3234 = 8.0F;
					}
					Class301_Sub1.anInt3254 = (int) Class301_Sub1.aFloat3233 >> 1;
					Class301_Sub1.aByteArrayArrayArray3229 = IcmpService_Sub1.method6381(Class301_Sub1.anInt3254);
					Class225.method2103(65536);
					Class301_Sub1.method3706();
					DiskFile.aClass453_5986 = new Class453();
					Class301_Sub1.anInt3227 += (int) (Math.random() * 5.0) - 2;
					if (Class301_Sub1.anInt3227 < -8)
						Class301_Sub1.anInt3227 = -8;
					if (Class301_Sub1.anInt3227 > 8)
						Class301_Sub1.anInt3227 = 8;
					Class301_Sub1.anInt3228 += (int) (Math.random() * 5.0) - 2;
					if (Class301_Sub1.anInt3228 < -16)
						Class301_Sub1.anInt3228 = -16;
					if (Class301_Sub1.anInt3228 > 16)
						Class301_Sub1.anInt3228 = 16;
					Class301_Sub1.method3707(interface_ma, (Class301_Sub1.anInt3227 >> 2 << 10), Class301_Sub1.anInt3228 >> 1);
					Class301_Sub1.aClass339_3251.method4119(1024, 256);
					Class301_Sub1.aClass487_3225.method6160(256, 256, -1144646938);
					Class301_Sub1.aClass433_3220.setCacheCapacity(4096);
					Class472.configLoader.clear(256);
					Class301_Sub1.anInt7624 = 88890100;
				} else if (20 == Class301_Sub1.anInt7624 * -1289394455) {
					StaticMethods.method6310(true, 1135939269);
					Class301_Sub1.openingMapInterface(class_ra, Class301_Sub1.anInt3227, Class301_Sub1.anInt3228);
					Class301_Sub1.anInt7624 = 266670300;
					StaticMethods.method6310(true, -167716120);
					StaticMethods.method1247();
				} else if (60 == -1289394455 * Class301_Sub1.anInt7624) {
					if (Class301_Sub1.worldMapIndex.method2295(new StringBuilder().append(Class301_Sub1.aClass298_Sub37_Sub13_3218.locationName).append("_staticelements").toString(), -400372089)) {
						if (!Class301_Sub1.worldMapIndex.method2312(new StringBuilder().append(Class301_Sub1.aClass298_Sub37_Sub13_3218.locationName).append("_staticelements").toString()))
							return;
						Class301_Sub1.aClass296_3235 = (StaticMethods.method2192(Class301_Sub1.worldMapIndex, new StringBuilder().append(Class301_Sub1.aClass298_Sub37_Sub13_3218.locationName).append("_staticelements").toString(), GameClient.isMemberWorld));
					} else
						Class301_Sub1.aClass296_3235 = new Class296(0);
					Class301_Sub1.method3697();
					Class301_Sub1.anInt7624 = -1836368298;
					StaticMethods.method6310(true, -425949519);
					StaticMethods.method1247();
				} else if (70 == -1289394455 * Class301_Sub1.anInt7624) {
					Class381.aClass4_4119 = new Class4(class_ra, 11, true, DirectXContext.canvas);
					Class301_Sub1.anInt7624 = 1398190689;
					StaticMethods.method6310(true, 2032737613);
					StaticMethods.method1247();
				} else if (Class301_Sub1.anInt7624 * -1289394455 == 73) {
					StaticMethods.aClass4_2795 = new Class4(class_ra, 12, true, DirectXContext.canvas);
					Class301_Sub1.anInt7624 = 337782380;
					StaticMethods.method6310(true, -1803108343);
					StaticMethods.method1247();
				} else if (76 == Class301_Sub1.anInt7624 * -1289394455) {
					GraphicsContext.aClass4_508 = new Class4(class_ra, 14, true, DirectXContext.canvas);
					Class301_Sub1.anInt7624 = -722625929;
					StaticMethods.method6310(true, 116445632);
					StaticMethods.method1247();
				} else if (79 == -1289394455 * Class301_Sub1.anInt7624) {
					Class414.aClass4_5326 = new Class4(class_ra, 17, true, DirectXContext.canvas);
					Class301_Sub1.anInt7624 = -1783034238;
					StaticMethods.method6310(true, 325987584);
					StaticMethods.method1247();
				} else if (Class301_Sub1.anInt7624 * -1289394455 == 82) {
					StaticMethods.aClass4_6525 = new Class4(class_ra, 19, true, DirectXContext.canvas);
					Class301_Sub1.anInt7624 = 1451524749;
					StaticMethods.method6310(true, -828062204);
					StaticMethods.method1247();
				} else if (Class301_Sub1.anInt7624 * -1289394455 == 85) {
					Class400.aClass4_5224 = new Class4(class_ra, 22, true, DirectXContext.canvas);
					Class301_Sub1.anInt7624 = 391116440;
					StaticMethods.method6310(true, -315961699);
					StaticMethods.method1247();
				} else if (88 == -1289394455 * Class301_Sub1.anInt7624) {
					Class152.aClass4_1594 = new Class4(class_ra, 26, true, DirectXContext.canvas);
					Class301_Sub1.anInt7624 = -669291869;
					StaticMethods.method6310(true, 1357229880);
					StaticMethods.method1247();
				} else {
					Class241.aClass4_2707 = new Class4(class_ra, 30, true, DirectXContext.canvas);
					Class301_Sub1.anInt7624 = 444450500;
					StaticMethods.method6310(true, 1961372940);
					StaticMethods.method1247();
					System.gc();
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("rt.bq(").append(')').toString());
		}
	}
}
