package com.jagex;/* Class126 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.network.OutgoingPacket;
import com.jagex.utils.CameraUtils;
import com.jagex.utils.TimeUtils;

import java.io.IOException;

public class Class126 implements Interface6 {
    Js5FileSystem aClass243_6367;
    Class151 aClass151_6368;
    Js5FileSystem JS5_FONT_SPRITES;
    FontToolkit aClass264_6370;

    Class126(Js5FileSystem class243, Js5FileSystem class243_3_, Class151 class151) {
        this.aClass151_6368 = class151;
        this.JS5_FONT_SPRITES = class243;
        this.aClass243_6367 = class243_3_;
    }

    static char method1406(char c, int i) {
        try {
            switch (c) {
                case '\u00d9':
                case '\u00da':
                case '\u00db':
                case '\u00dc':
                case '\u00f9':
                case '\u00fa':
                case '\u00fb':
                case '\u00fc':
                    return 'u';
                case '\u00cd':
                case '\u00ce':
                case '\u00cf':
                case '\u00ed':
                case '\u00ee':
                case '\u00ef':
                    return 'i';
                case '\u00d1':
                case '\u00f1':
                    return 'n';
                case '\u00c8':
                case '\u00c9':
                case '\u00ca':
                case '\u00cb':
                case '\u00e8':
                case '\u00e9':
                case '\u00ea':
                case '\u00eb':
                    return 'e';
                case '#':
                case '[':
                case ']':
                    return c;
                case '\u00c7':
                case '\u00e7':
                    return 'c';
                case '\u00c0':
                case '\u00c1':
                case '\u00c2':
                case '\u00c3':
                case '\u00c4':
                case '\u00e0':
                case '\u00e1':
                case '\u00e2':
                case '\u00e3':
                case '\u00e4':
                    return 'a';
                default:
                    return Character.toLowerCase(c);
                case '\u00ff':
                case '\u0178':
                    return 'y';
                case '\u00d2':
                case '\u00d3':
                case '\u00d4':
                case '\u00d5':
                case '\u00d6':
                case '\u00f2':
                case '\u00f3':
                case '\u00f4':
                case '\u00f5':
                case '\u00f6':
                    return 'o';
                case ' ':
                case '-':
                case '_':
                case '\u00a0':
                    return '_';
                case '\u00df':
                    return 'b';
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("fc.k(").append(')').toString());
        }
    }

    static final void method1407() {
        if (1592380953 * GameClient.shutdownDelay > 1) {
            GameClient.shutdownDelay -= -2090750423;
            GameClient.anInt8888 = 1991119277 * GameClient.anInt8933;
        }
        if (ConnectionType.gameConnection.aBoolean347) {
            ConnectionType.gameConnection.aBoolean347 = false;
            SubIncommingPacket.method1923();
        } else {
            if (!GameClient.menuOpen)
                StaticMethods.closeMenus();
            for (int index = 0; index < 100; index++) {
                if (!PacketsDecoder.packetSentSuccessfully(ConnectionType.gameConnection)) {
                    break;
                }
            }
            if (GameClient.gameState * -1233866115 == 0) {
                while (Class370.method4577()) {
                    OutgoingPacketBuffer outgoingPacketBuffer = Class18.method359(OutgoingPacket.aClass198_2005, (ConnectionType.gameConnection.encryptor));
                    outgoingPacketBuffer.payload.writeByte(0);
                    int i_8_ = ((outgoingPacketBuffer.payload.offset) * 385051775);
                    Class234.method2181((outgoingPacketBuffer.payload), -1720754748);
                    outgoingPacketBuffer.payload.method3649((outgoingPacketBuffer.payload.offset) * 385051775 - i_8_);
                    ConnectionType.gameConnection.sendFrame(outgoingPacketBuffer);
                }
                if (null != StaticMethods.aClass396_6291) {
                    if (StaticMethods.aClass396_6291.address * -747638219 != -1) {
                        OutgoingPacketBuffer outgoingPacketBuffer = Class18.method359(OutgoingPacket.REPORT_ABUSE, (ConnectionType.gameConnection.encryptor));
                        outgoingPacketBuffer.payload.writeShort((-747638219 * StaticMethods.aClass396_6291.address));
                        ConnectionType.gameConnection.sendFrame(outgoingPacketBuffer);
                        StaticMethods.aClass396_6291 = null;
                        Class365_Sub1_Sub2_Sub1.aLong9911 = ((TimeUtils.getTime() + 30000L) * -5619030756491206545L);
                    }
                } else if (TimeUtils.getTime() >= (Class365_Sub1_Sub2_Sub1.aLong9911 * 416520701245947535L))
                    StaticMethods.aClass396_6291 = GameClient.aClass404_8715.method4946((Class474.activeConnectionInfo.host), (byte) 25);
                if (!Loader.DISABLE_USELESS_PACKETS)
                    StaticMethods.method2371();
                MouseRecord mouseRecord = ((MouseRecord) GameClient.mouseRecords.method5939());
                if (GameClient.myRegion.getRegion() != null) {
                    if (3 == CameraUtils.cameraType * -863531439)
                        Class298_Sub39.method3506();
                    else if (CameraUtils.LIVE_GAME == -863531439 * CameraUtils.cameraType)
                        Class397.method4913();
                }
                if (GameClient.aBoolean8761)
                    GameClient.aBoolean8761 = false;
                else
                    GameClient.aFloat8760 /= 2.0F;
                if (GameClient.aBoolean8762)
                    GameClient.aBoolean8762 = false;
                else
                    GameClient.aFloat8759 /= 2.0F;
                SubIncommingPacket.updateMinimap();
                if (0 == -1233866115 * GameClient.gameState) {
                    GameClient.myRegion.getLightningDetails().method4323(GameClient.myRegion);
                    Class271.method2546(-2124691803);
                    Graphics.method609((short) -26190);
                    if (596487115 * GameClient.stateTicks > 10)
                        ConnectionType.gameConnection.anInt338 += 157945923;
                    if ((ConnectionType.gameConnection.anInt338 * 1237236843) > 2250)
                        SubIncommingPacket.method1923();
                    else {
                        if (GameClient.anInt8724 * 1596783995 == 3) {
                            Class162.method1771();
                            TranslatedCanvas.method3037();
                        } else if (StaticMethods.aClass377_5519.anRecorder_4091.record(mouseRecord, GameClient.lastHeldKeys, -1625219821 * GameClient.maximumHeldKeys, AwtKeyboard.keyboard))
                            Class107.method1144(false);
                        else {
                            if (GameClient.anInt8724 * 1596783995 == 1 && (Class298_Sub24_Sub3.method3090(577335585 * GameClient.cutsceneID))) {
                                GameClient.myRegion.sendMapScene(new MapLoadBuffer(MapLoad.CUTSCENE_MAP, null));
                                GameClient.anInt8724 = -347773236;
                            }
                            if (4 == 1596783995 * GameClient.anInt8724 && 17 != GameClient.gameState * -1233866115) {
                                Class87.linkedList.clear();
                                GameClient.anInt8724 = 0;
                                GameClient.anInt8726 = -96767293 * GameClient.clientTick;
                                GameClient.anInt8930 = 0;
                                StaticMethods.method3575();
                            }
                            if (0 == 1596783995 * GameClient.anInt8724) {
                                int i_9_ = (443738891 * GameClient.clientTick - GameClient.anInt8726 * -1846472167);
                                while_61_:
                                do {
                                    if (1247173565 * GameClient.anInt8930 < (Class87.aClass82Array797).length) {
                                        do {
                                            Class82 class82 = (Class87.aClass82Array797[(1247173565 * GameClient.anInt8930)]);
                                            if ((class82.anInt761 * 1147432229) > i_9_) {
                                                break while_61_;
                                            }
                                            class82.method866();
                                            if (0 != (1596783995 * GameClient.anInt8724))
                                                break while_61_;
                                        }
                                        while (((GameClient.anInt8930 += 1259550613) * 1247173565) < (Class87.aClass82Array797).length);
                                        break;
                                    }
                                } while (false);
                                if (GameClient.anInt8724 * 1596783995 == 0) {
                                    for (int i_10_ = 0; (i_10_ < (Class87.aClass94Array794).length); i_10_++) {
                                        Class94 class94 = (Class87.aClass94Array794[i_10_]);
                                        if (!class94.aBoolean912) {

                                        } else {
                                            Entity class365_sub1_sub1_sub2 = (class94.method1015());
                                            Class135.method1494(class365_sub1_sub1_sub2, true);
                                        }
                                    }
                                }
                            }
                        }
                        StaticMethods.method5635(-1841664621);
                        if (!GameClient.aBoolean8917) {
                            StaticMethods.method5732(1446435433);
                            GameClient.aBoolean8917 = true;
                        }
                        IComponentUpdateNode.checkComponentUpdateNodes();
                        GameClient.animatorTick += 512435497;
                        if (0 != -392325587 * GameClient.mouseClickTargetType) {
                            GameClient.mouseClickTicker += -421126628;
                            if (GameClient.mouseClickTicker * 1347929875 >= 400)
                                GameClient.mouseClickTargetType = 0;
                        }
                        if (null != Class236.aClass105_2606) {
                            GameClient.anInt8788 += 289473031;
                            if (GameClient.anInt8788 * -2018194505 >= 15) {
                                StaticMethods.updateComponentTick((Class236.aClass105_2606));
                                Class236.aClass105_2606 = null;
                            }
                        }
                        GameClient.toIComponentDefinition = null;
                        GameClient.aBoolean8938 = false;
                        GameClient.aBoolean8855 = false;
                        StaticMethods.aClass105_1373 = null;
                        Class82_Sub17.method918(null, -1, -1, -6089367);
                        if (!GameClient.interfaceSelected)
                            GameClient.targetLeaveCursor = 280458557;
                        Class62.method732();
                        GameClient.anInt8933 += -908761385;
                        if (GameClient.aBoolean8866) {
                            OutgoingPacketBuffer outgoingPacketBuffer = Class18.method359((OutgoingPacket.WORLD_MAP_CLICK_PACKET), (ConnectionType.gameConnection.encryptor));
                            outgoingPacketBuffer.payload.writeInt((924378211 * StaticMethods.anInt2706 << 28 | StaticMethods.anInt950 * -537916961 << 14 | StaticMethods.anInt6663 * -605610561));
                            ConnectionType.gameConnection.sendFrame(outgoingPacketBuffer);
                            GameClient.aBoolean8866 = false;
                        }
                        for (; ; ) {
                            ScriptNode scriptNode = ((ScriptNode) GameClient.aClass453_8660.popHead());
                            if (scriptNode == null) {
                                break;
                            }
                            IComponentDefinition componentDefinition = scriptNode.aClass105_7525;
                            if (-1309843523 * componentDefinition.slot >= 0) {
                                IComponentDefinition class105_11_ = IComponentDefinition.getInterfaceComponent((componentDefinition.parentID));
                                if (class105_11_ == null || (class105_11_.sada == null) || (componentDefinition.slot * -1309843523 >= (class105_11_.sada).length))
                                    continue;
                                if ((class105_11_.sada[componentDefinition.slot * -1309843523]) != componentDefinition) {
                                    continue;
                                }
                            }
                            Class444.method5889(scriptNode);
                        }
                        for (; ; ) {
                            ScriptNode scriptNode = ((ScriptNode) GameClient.aClass453_8895.popHead());
                            if (scriptNode == null) {
                                break;
                            }
                            IComponentDefinition componentDefinition = scriptNode.aClass105_7525;
                            if (-1309843523 * componentDefinition.slot >= 0) {
                                IComponentDefinition class105_12_ = IComponentDefinition.getInterfaceComponent((componentDefinition.parentID));
                                if (null == class105_12_ || (class105_12_.sada == null) || (componentDefinition.slot * -1309843523 >= (class105_12_.sada).length))
                                    continue;
                                if ((class105_12_.sada[componentDefinition.slot * -1309843523]) != componentDefinition) {
                                    continue;
                                }
                            }
                            Class444.method5889(scriptNode);
                        }
                        for (; ; ) {
                            ScriptNode scriptNode = ((ScriptNode) GameClient.aClass453_8893.popHead());
                            if (null == scriptNode) {
                                break;
                            }
                            IComponentDefinition componentDefinition = scriptNode.aClass105_7525;
                            if (componentDefinition.slot * -1309843523 >= 0) {
                                IComponentDefinition class105_13_ = IComponentDefinition.getInterfaceComponent((componentDefinition.parentID));
                                if (null == class105_13_ || (null == class105_13_.sada) || (-1309843523 * componentDefinition.slot >= (class105_13_.sada).length))
                                    continue;
                                if ((class105_13_.sada[componentDefinition.slot * -1309843523]) != componentDefinition) {
                                    continue;
                                }
                            }
                            Class444.method5889(scriptNode);
                        }
                        if (StaticMethods.aClass105_1373 == null)
                            GameClient.anInt8864 = 0;
                        if (null != GameClient.fromIComponentDefinition)
                            Class53.method602();
                        if (GameClient.localPrivilege * 1806357379 > 0 && AwtKeyboard.keyboard.held(82) && AwtKeyboard.keyboard.held(81) && GameClient.anInt8682 * 1170859143 != 0) {
                            int i_14_ = ((Player.myPlayer.plane) - GameClient.anInt8682 * 1170859143);
                            if (i_14_ < 0)
                                i_14_ = 0;
                            else if (i_14_ > 3)
                                i_14_ = 3;
                            GameScene gameScene = GameClient.myRegion.getGameScene();
                            StaticMethods.method6083(i_14_, ((Player.myPlayer.scenePositionXQueue[0]) + -1760580017 * gameScene.gameSceneBaseX), ((Player.myPlayer.scenePositionYQueue[0]) + 283514611 * gameScene.gameSceneBaseY));
                        }
                        Graphics.method610(187981678);
                        for (int i_15_ = 0; i_15_ < 5; i_15_++)
                            GameClient.anIntArray8790[i_15_]++;
                        if (GameClient.aBoolean8736 && (GameClient.aLong8892 * -4876927317316500383L < TimeUtils.getTime() - 60000L))
                            StaticMethods.method589();
                        for (Class302_Sub2 class302_sub2 = ((Class302_Sub2) GameClient.aClass442_8951.method5868()); null != class302_sub2; class302_sub2 = ((Class302_Sub2) GameClient.aClass442_8951.method5872())) {
                            if ((long) (-1505693583 * (class302_sub2.anInt7647)) < (TimeUtils.getTime() / 1000L - 5L)) {
                                if ((class302_sub2.aShort7646) > 0)
                                    PublicMessage.sendPublicMessage(5, 0, "", "", "", new StringBuilder().append(class302_sub2.aString7648).append(Tradution.LOGGED_IN.translate(GameLanguage.CURRENT_LANGUAGE)).toString());
                                if ((class302_sub2.aShort7646) == 0)
                                    PublicMessage.sendPublicMessage(5, 0, "", "", "", new StringBuilder().append(class302_sub2.aString7648).append(Tradution.LOGGED_OUT.translate(GameLanguage.CURRENT_LANGUAGE)).toString());
                                class302_sub2.unlink();
                            }
                        }
                        GameClient.anInt8746 += -447320539;
                        if (-1380319827 * GameClient.anInt8746 > 506) {
                            GameClient.anInt8746 = 0;
                            int i_16_ = (int) (Math.random() * 8.0);
                            if ((i_16_ & 0x1) == 1)
                                GameClient.anInt8817 += GameClient.anInt8741 * -969022135;
                            if ((i_16_ & 0x2) == 2)
                                GameClient.anInt8742 += GameClient.anInt8826 * 200330303;
                            if (4 == (i_16_ & 0x4))
                                GameClient.cameraXOffset += -284639445 * GameClient.anInt8745;
                        }
                        if (1734240325 * GameClient.anInt8817 < -51)
                            GameClient.anInt8741 = -57270710;
                        if (GameClient.anInt8817 * 1734240325 > 55)
                            GameClient.anInt8741 = 57270710;
                        if (GameClient.anInt8742 * 1874511679 < -62)
                            GameClient.anInt8826 = -792852734;
                        if (GameClient.anInt8742 * 1874511679 > 64)
                            GameClient.anInt8826 = 792852734;
                        if (GameClient.cameraXOffset * -1419578297 < -44)
                            GameClient.anInt8745 = 901405925;
                        if (GameClient.cameraXOffset * -1419578297 > 42)
                            GameClient.anInt8745 = -901405925;
                        GameClient.anInt8810 += -1075811357;
                        if (1061958091 * GameClient.anInt8810 > 505) {
                            GameClient.anInt8810 = 0;
                            int i_17_ = (int) (Math.random() * 8.0);
                            if ((i_17_ & 0x1) == 1)
                                GameClient.anInt8801 += -996860861 * GameClient.anInt8878;
                            if (2 == (i_17_ & 0x2))
                                GameClient.anInt8749 += -2133918149 * GameClient.anInt8972;
                        }
                        if (1227356013 * GameClient.anInt8801 < -67)
                            GameClient.anInt8878 = -640741266;
                        if (1227356013 * GameClient.anInt8801 > 67)
                            GameClient.anInt8878 = 640741266;
                        if (356727603 * GameClient.anInt8749 < -21)
                            GameClient.anInt8972 = 999313729;
                        if (GameClient.anInt8749 * 356727603 > 10)
                            GameClient.anInt8972 = -999313729;
                        ConnectionType.gameConnection.anInt339 += 1797987493;
                        if (2033675053 * ConnectionType.gameConnection.anInt339 > 50) {
                            OutgoingPacketBuffer outgoingPacketBuffer = Class18.method359((OutgoingPacket.PING_PACKET), (ConnectionType.gameConnection.encryptor));
                            ConnectionType.gameConnection.sendFrame(outgoingPacketBuffer);
                        }
                        if (GameClient.packetSent) {
                            Class82_Sub20.method933();
                            GameClient.packetSent = false;
                        }
                        try {
                            ConnectionType.gameConnection.flush();
                        } catch (IOException ioexception) {
                            SubIncommingPacket.method1923();
                        }
                    }
                }
            }
        }
    }

    static final void method1408(ScriptRuntime runtime) {
        try {
            int i_18_ = (runtime.integerstack[1883543357 * runtime.integerPos]);
            Class376 class376 = Class299.aClass370_3199.method4576(i_18_, -1368678783);
            if (class376 == null)
                throw new RuntimeException();
            Integer integer = (runtime.aClass162_5252.method1753(GameClient.game.id * -937307905 << 16 | i_18_, (byte) -31));
            int i_19_;
            if (integer == null) {
                if (class376.aChar4085 == 'i' || class376.aChar4085 == '1')
                    i_19_ = 0;
                else
                    i_19_ = -1;
            } else
                i_19_ = integer.intValue();
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = i_19_;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("fc.bv(").append(')').toString());
        }
    }

    public boolean method52(int i) {
        try {
            boolean bool = true;
            if (!this.JS5_FONT_SPRITES.exists(this.aClass151_6368.fontID * 180759529))
                bool = false;
            if (!this.aClass243_6367.exists(this.aClass151_6368.fontID * 180759529))
                bool = false;
            return bool;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("fc.b(").append(')').toString());
        }
    }

    public void method58(boolean bool, byte i) {
        if (bool) {
            int i_0_ = ((this.aClass151_6368.aClass139_6352.method1545((1296783199 * this.aClass151_6368.anInt6346), GameClient.anInt8794 * 775068819, -2104401433)) + (this.aClass151_6368.anInt6348 * -591189315));
            int i_1_ = ((this.aClass151_6368.aClass133_6351.method1482((-1025867285 * this.aClass151_6368.anInt6347), GameClient.anInt8803 * -791746413, -1504826584)) + (-842094713 * this.aClass151_6368.anInt6349));
            this.aClass264_6370.method2475(this.aClass151_6368.string, i_0_, i_1_, this.aClass151_6368.anInt6346 * 1296783199, this.aClass151_6368.anInt6347 * -1025867285, 1046344713 * this.aClass151_6368.anInt6356, -122178497 * this.aClass151_6368.anInt6357, this.aClass151_6368.anInt6350 * -434174461, this.aClass151_6368.anInt6345 * -1329622453, 35264187 * this.aClass151_6368.anInt6354, null, null, null, 0, 0);
        }
    }

    public void method53() {
        RSFontMetrics fontMetrics = RSFontMetrics.decodeFontData(this.aClass243_6367, 180759529 * (this.aClass151_6368.fontID));
        this.aClass264_6370 = (GameClient.activeGraphicsToolkit.createFontToolkit(fontMetrics, Sprite.load(this.JS5_FONT_SPRITES, (this.aClass151_6368.fontID) * 180759529), true));
    }
}
