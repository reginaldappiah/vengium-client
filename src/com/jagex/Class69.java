package com.jagex;/* Class69 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.network.OutgoingPacket;

public class Class69 {
	public Class448 aClass448_680 = new Class448();

	public static Class147 method787(int i) {
		try {
			Class147[] class147s = Class408.method4967((byte) 6);
			for (int i_1_ = 0; i_1_ < class147s.length; i_1_++) {
				Class147 class147 = class147s[i_1_];
				if (i == -999577713 * class147.anInt1580)
					return class147;
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("cu.f(").append(')').toString());
		}
	}

	public static Class297 method789(int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_) {
		try {
			if (SettingsManager.settingsManager.soundEffectsVolume.getValue() != 0 && 0 != i_2_ && Class300.anInt3213 * -991384187 < 50 && i != -1) {
				Class297 class297 = new Class297((byte) 1, i, i_2_, i_3_, i_4_, i_5_, i_6_, null);
				Class300.aClass297Array3214[(Class300.anInt3213 += -598588595) * -991384187 - 1] = class297;
				return class297;
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("cu.s(").append(')').toString());
		}
	}

	static Class367[] method790() {
		try {
			return (new Class367[] { Class367.aClass367_3989, Class367.aClass367_3999, Class367.aClass367_3995, Class367.aClass367_3994, Class367.aClass367_3992, Class367.aClass367_3984, Class367.aClass367_3997, Class367.aClass367_3991, Class367.aClass367_3993, Class367.aClass367_3982, Class367.aClass367_3987, Class367.aClass367_3983, Class367.aClass367_3988, Class367.aClass367_3990 });
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("cu.a(").append(')').toString());
		}
	}

	static final void method791(ScriptRuntime runtime) {
		try {
			int i_8_ = (runtime.integerstack[1883543357 * runtime.integerPos]);
			runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = ((NPC) runtime.entity).aClass73_10187.method815(i_8_);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("cu.ad(").append(')').toString());
		}
	}

	static final void method792(ScriptRuntime runtime) {
		try {
			runtime.objectArgs -= 1938723502;
			String string = (String) (runtime.objectStack[runtime.objectArgs * -203050393]);
			String string_9_ = ((String) (runtime.objectStack[-203050393 * runtime.objectArgs + 1]));
			StaticMethods.method2491(string, string_9_);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("cu.ahk(").append(')').toString());
		}
	}

	public static void method793(int buttonID, String string) {
			int i_11_ = Class10.entitiesInRegion * 1168366243;
			int[] is = Class10.players;
			boolean found = false;
			for (int i_12_ = 0; i_12_ < i_11_; i_12_++) {
				Player player = GameClient.entities[is[i_12_]];
				if (null != player && (Player.myPlayer != player) && player.accountName != null && player.accountName.equalsIgnoreCase(string)) {
					OutgoingPacket outgoingPacket = null;
					if (buttonID == 1)
						outgoingPacket = OutgoingPacket.PLAYER_OPTION_1_PACKET;
					else if (4 == buttonID)
						outgoingPacket = OutgoingPacket.PLAYER_OPTION_4_PACKET;
					else if (buttonID == 5)
						outgoingPacket = OutgoingPacket.PLAYER_OPTION_5_PACKET;
					else if (6 == buttonID)
						outgoingPacket = OutgoingPacket.PLAYER_OPTION_6_PACKET;
					else if (7 == buttonID)
						outgoingPacket = OutgoingPacket.PLAYER_OPTION_7_PACKET;
					else if (9 == buttonID)
						outgoingPacket = OutgoingPacket.PLAYER_OPTION_9_PACKET;
					if (outgoingPacket != null) {
						OutgoingPacketBuffer outgoingPacketBuffer = Class18.method359(outgoingPacket, (ConnectionType.gameConnection.encryptor));
						outgoingPacketBuffer.payload.writeByte(0);
						outgoingPacketBuffer.payload.writeShortLE128(is[i_12_]);
						ConnectionType.gameConnection.sendFrame(outgoingPacketBuffer);
					}
					found = true;
					break;
				}
			}
			if (!found)
				FontToolkit.sendMessage(4, new StringBuilder().append(Tradution.UNABLE_TO_FIND.translate(GameLanguage.CURRENT_LANGUAGE)).append(string).toString());
	}

	static int method794(IComponentDefinition class105, int i, int i_13_) {
		try {
			if (!GameClient.getComponentSettings(class105).method3498(i) && class105.onOptHook == null)
				return -1;
			return ((class105.optionCursors != null && class105.optionCursors.length > i) ? class105.optionCursors[i] : -1);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("cu.mb(").append(')').toString());
		}
	}

	public static boolean method795(int i) {
		try {
			do {
				boolean bool;
				try {
					if (Class79.anInt734 * 617004265 != 2)
						break;
					if (StaticMethods.aClass298_Sub13_5337 == null) {
						StaticMethods.aClass298_Sub13_5337 = Class298_Sub13.method2905(Class79.JS5_MUSIC, (-1022496823 * Class79.anInt745), (Class79.anInt746 * 2099676709));
						if (null == StaticMethods.aClass298_Sub13_5337)
							return false;
					}
					if (Class298_Sub32_Sub22.aClass272_9466 == null)
						Class298_Sub32_Sub22.aClass272_9466 = new Class272(Class79.aClass243_736, Class79.aClass243_735);
					Class298_Sub19_Sub1 class298_sub19_sub1 = Class79.aClass298_Sub19_Sub1_737;
					if (Class79.aClass298_Sub19_Sub1_748 != null)
						class298_sub19_sub1 = Class79.aClass298_Sub19_Sub1_748;
					if (!class298_sub19_sub1.method2955(StaticMethods.aClass298_Sub13_5337, Class79.aClass243_747, Class298_Sub32_Sub22.aClass272_9466, 22050, -1561598857))
						break;
					Class79.aClass298_Sub19_Sub1_737 = class298_sub19_sub1;
					Class79.aClass298_Sub19_Sub1_737.method2956(-389032580);
					if (604206485 * Class401.anInt6559 > 0) {
						Class79.anInt734 = 508662283;
						Class79.aClass298_Sub19_Sub1_737.method2961(((604206485 * Class401.anInt6559 > Class79.anInt739 * 643426275) ? Class79.anInt739 * 643426275 : 604206485 * Class401.anInt6559));
						for (int i_14_ = 0; i_14_ < Light.anIntArray7229.length; i_14_++) {
							Class79.aClass298_Sub19_Sub1_737.method2954(i_14_, Light.anIntArray7229[i_14_]);
							Light.anIntArray7229[i_14_] = 255;
						}
					} else {
						Class79.anInt734 = 0;
						Class79.aClass298_Sub19_Sub1_737.method2961(643426275 * Class79.anInt739);
						for (int i_15_ = 0; i_15_ < Light.anIntArray7229.length; i_15_++) {
							Class79.aClass298_Sub19_Sub1_737.method2954(i_15_, Light.anIntArray7229[i_15_]);
							Light.anIntArray7229[i_15_] = 255;
						}
					}
					if (null == Class79.aClass298_Sub19_Sub1_748) {
						if (1808968524435561429L * Class515.aLong6233 > 0L)
							Class79.aClass298_Sub19_Sub1_737.method2979(StaticMethods.aClass298_Sub13_5337, Class8.aBoolean114, true, 1808968524435561429L * Class515.aLong6233);
						else
							Class79.aClass298_Sub19_Sub1_737.method2958(StaticMethods.aClass298_Sub13_5337, Class8.aBoolean114, (byte) 22);
						if (null != Class313.aClass97_3300)
							Class313.aClass97_3300.method1037(983998013);
					}
					if (null != Class79.aClass284_738)
						Class79.aClass284_738.method2679(Class79.aClass298_Sub19_Sub1_737);
					StaticMethods.aClass298_Sub13_5337 = null;
					Class298_Sub32_Sub22.aClass272_9466 = null;
					Class79.JS5_MUSIC = null;
					Class515.aLong6233 = 0L;
					Class79.aClass298_Sub19_Sub1_748 = null;
					Class313.aClass97_3300 = null;
					bool = true;
				} catch (Exception exception) {
					exception.printStackTrace();
					Class79.aClass298_Sub19_Sub1_737.method2959();
					Class11.method329();
					break;
				}
				return bool;
			} while (false);
			return false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("cu.t(").append(')').toString());
		}
	}

	static final void method796(ScriptRuntime class403, int i) {
		try {
			Class63.method739(1193411158);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("cu.agq(").append(')').toString());
		}
	}
}
