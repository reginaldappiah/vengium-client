package com.jagex;/* Class439 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.prefetch.Js5List;
import com.jagex.network.OutgoingPacket;

public final class Class439 {
    static int[] anIntArray5560;
    byte[] aByteArray5536;
    int anInt5537 = 16;
    int anInt5538 = 258;
    int anInt5539 = 6;
    int[][] anIntArrayArray5540;
    int anInt5541 = 18002;
    int anInt5542;
    int anInt5543;
    int anInt5544;
    int anInt5545 = 4096;
    int anInt5546;
    int anInt5547;
    int anInt5548;
    byte[][] aByteArrayArray5549;
    byte[] aByteArray5550;
    int anInt5551;
    int anInt5552;
    int anInt5553;
    int anInt5554;
    int anInt5555;
    int anInt5556;
    int[] anIntArray5557;
    int anInt5558 = 50;
    int[] anIntArray5559;
    int anInt5561;
    byte[] aByteArray5562;
    boolean[] aBooleanArray5563;
    byte[] aByteArray5564;
    int[][] anIntArrayArray5565;
    int[] anIntArray5566;
    byte[] aByteArray5567;
    byte[] aByteArray5568;
    int[] anIntArray5569;
    byte aByte5570;
    int anInt5571;
    int[][] anIntArrayArray5572;
    boolean[] aBooleanArray5573;
    int anInt5574;

    Class439() {
        this.anInt5537 = 16;
        this.anInt5538 = 258;
        this.anInt5539 = 6;
        this.anInt5558 = 50;
        this.anInt5541 = 18002;
        this.anInt5543 = 0;
        this.anInt5546 = 0;
        this.anIntArray5557 = new int[256];
        this.anIntArray5559 = new int[257];
        this.aBooleanArray5573 = new boolean[256];
        this.aBooleanArray5563 = new boolean[16];
        this.aByteArray5564 = new byte[256];
        this.aByteArray5568 = new byte[4096];
        this.anIntArray5569 = new int[16];
        this.aByteArray5567 = new byte[18002];
        this.aByteArray5562 = new byte[18002];
        this.aByteArrayArray5549 = new byte[6][258];
        this.anIntArrayArray5565 = new int[6][258];
        this.anIntArrayArray5540 = new int[6][258];
        this.anIntArrayArray5572 = new int[6][258];
        this.anIntArray5566 = new int[6];
    }

    public static final void method5850(String string, int i) {
        try {
            if (null != string) {
                if ((-1054937867 * GameClient.anInt8941 >= 200 && !GameClient.aBoolean8807) || -1054937867 * GameClient.anInt8941 >= 200)
                    FontToolkit.sendMessage(4, (Tradution.friendlistFull.translate(GameLanguage.CURRENT_LANGUAGE)));
                else {
                    String string_0_ = Class173.method1824(string);
                    if (null != string_0_) {
                        for (int i_1_ = 0; i_1_ < GameClient.anInt8941 * -1054937867; i_1_++) {
                            String string_2_ = Class173.method1824((GameClient.playerAccountNames[i_1_]));
                            if (null != string_2_ && string_2_.equals(string_0_)) {
                                FontToolkit.sendMessage(4, new StringBuilder().append(string).append(Tradution.aClass470_5923.translate((GameLanguage.CURRENT_LANGUAGE))).toString());
                                return;
                            }
                            if (GameClient.aStringArray8945[i_1_] != null) {
                                String string_3_ = Class173.method1824((GameClient.aStringArray8945[i_1_]));
                                if (string_3_ != null && string_3_.equals(string_0_)) {
                                    FontToolkit.sendMessage(4, new StringBuilder().append(string).append(Tradution.aClass470_5923.translate(GameLanguage.CURRENT_LANGUAGE)).toString());
                                    return;
                                }
                            }
                        }
                        for (int i_4_ = 0; i_4_ < -548972447 * GameClient.anInt8952; i_4_++) {
                            String string_5_ = Class173.method1824((GameClient.aStringArray8859[i_4_]));
                            if (null != string_5_ && string_5_.equals(string_0_)) {
                                FontToolkit.sendMessage(4, new StringBuilder().append(Tradution.aClass470_5929.translate(GameLanguage.CURRENT_LANGUAGE)).append(string).append(Tradution.aClass470_5930.translate(GameLanguage.CURRENT_LANGUAGE)).toString());
                                return;
                            }
                            if (null != GameClient.aStringArray8955[i_4_]) {
                                String string_6_ = Class173.method1824((GameClient.aStringArray8955[i_4_]));
                                if (string_6_ != null && string_6_.equals(string_0_)) {
                                    FontToolkit.sendMessage(4, new StringBuilder().append(Tradution.aClass470_5929.translate(GameLanguage.CURRENT_LANGUAGE)).append(string).append(Tradution.aClass470_5930.translate(GameLanguage.CURRENT_LANGUAGE)).toString());
                                    return;
                                }
                            }
                        }
                        if (Class173.method1824((Player.myPlayer.accountName)).equals(string_0_))
                            FontToolkit.sendMessage(4, (Tradution.aClass470_5919.translate(GameLanguage.CURRENT_LANGUAGE)));
                        else {
                            ConnectionType connectionType = ConnectionType.getConnectionType();
                            OutgoingPacketBuffer outgoingPacketBuffer = Class18.method359(OutgoingPacket.ADD_FRIEND_PACKET, connectionType.encryptor);
                            outgoingPacketBuffer.payload.writeByte(StaticMethods.method693(string));
                            outgoingPacketBuffer.payload.writeString(string);
                            connectionType.sendFrame(outgoingPacketBuffer);
                        }
                    }
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("sc.mk(").append(')').toString());
        }
    }

    public static void loadGameState(int gameState) {
        if (gameState != GameClient.gameState * -1233866115) {
            GameClient.stateTicks = 0;
            if (gameState == 5 || 13 == gameState)
                Class473.method6070(760519077);
            if (gameState != 5 && StaticMethods.aStream_8414 != null) {
                StaticMethods.aStream_8414.close();
                StaticMethods.aStream_8414 = null;
            }
            if (19 == gameState)
                ClassNotAnim.method6227((8 == -1233866115 * GameClient.gameState || -1233866115 * GameClient.gameState == 2 || (747461259 * (Js5List.JS5_DEFAULTS.backgroundInterface) != (GameClient.WINDOW_PANE_ID * -257444687))));
            if (gameState == 14)
                IcmpService_Sub1.method6382((GameClient.WINDOW_PANE_ID * -257444687 != (Js5List.JS5_DEFAULTS.defaultRootInter) * 1349088077), -687019075);
            if (gameState == 4 || 6 == gameState)
                StaticMethods.method1601();
            else if (3 == gameState || gameState == 18 && -1233866115 * GameClient.gameState != 16)
                Class473.method6070(1162411214);
            else if (gameState == 2)
                Class70.method805((byte) 0);
            if (StaticMethods.method4287(gameState)) {
                GameClient.myRegion.method2673((byte) 75);
                Class423.method5733(true);
            }
            if (17 == gameState || gameState == 19)
                Class141.method1567();
            boolean loadSet = (7 == gameState || Class413.method5584(gameState) || GameClient.isLobbyConnected(gameState));
            boolean gameSet = (7 == -1233866115 * GameClient.gameState || Class413.method5584(GameClient.gameState * -1233866115) || GameClient.isLobbyConnected(-1233866115 * GameClient.gameState));
            if (loadSet != gameSet) {
                if (loadSet) {
                    Class300.anInt3207 = Class300.anInt3210 * 1701432991;
                    if (SettingsManager.settingsManager.themeMusicVolume.getValue() != 0) {
                        Class431.method5767(2, Js5List.JS5_MUSIC, 782166935 * Class300.anInt3210, 0, SettingsManager.settingsManager.themeMusicVolume.getValue(), false, 1118626209);
                        StaticMethods.method344();
                    } else
                        Class104.method1108(2);
                    PaddedResourceWorker.protocol.method2343(false, -1153302935);
                } else {
                    Class104.method1108(2);
                    PaddedResourceWorker.protocol.method2343(true, -1469822226);
                }
            }
            if (StaticMethods.method4287(gameState) || gameState == 5 || 13 == gameState)
                GameClient.activeGraphicsToolkit.method5176();
            GameClient.gameState = -705702187 * gameState;
        }
    }
}
