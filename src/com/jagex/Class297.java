package com.jagex;/* Class297 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.Js5Configs;
import com.jagex.game.cache.config.prefetch.Js5List;
import com.jagex.game.settings.BloomSettings;

public class Class297 {
    static byte aByte3172 = 3;
    static byte aByte3174 = 1;
    static byte aByte3179 = 2;
    int anInt3171;
    int anInt3173;
    int anInt3175;
    byte aByte3176;
    int anInt3177;
    int anInt3178;
    int anInt3180;
    Class278 aClass278_3181;
    int anInt3182;
    Class298_Sub26_Sub1 aClass298_Sub26_Sub1_3183;
    Class298_Sub19_Sub2 aClass298_Sub19_Sub2_3184;
    int anInt3185 = -1381628957;
    Class298_Sub23 aClass298_Sub23_3186;

    public Class297(byte i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, Class365_Sub1 class365_sub1) {
        this.anInt3173 = -1996485639;
        this.aByte3176 = i;
        this.anInt3175 = 74897619 * i_0_;
        this.anInt3171 = i_1_ * -155194551;
        this.anInt3177 = i_2_ * -1463623301;
        this.anInt3182 = 1215243635 * i_3_;
        this.anInt3178 = i_4_ * 877520607;
        this.anInt3180 = 184873165 * i_5_;
        if (class365_sub1 != null && class365_sub1 instanceof Class365_Sub1_Sub1) {
            Class365_Sub1_Sub1 class365_sub1_sub1 = (Class365_Sub1_Sub1) class365_sub1;
            this.anInt3185 = class365_sub1_sub1.aShort9798 * 1381628957;
            this.anInt3173 = class365_sub1_sub1.aShort9795 * 1996485639;
        }
    }

    public static int method2836() {
        synchronized (PlayerAppearance.cache) {
            int i_6_ = PlayerAppearance.cache.method4183();
            return i_6_;
        }
    }

    static final void decodePlayerMasks(RsBitsBuffer stream, int playerIndex, Player player, int mask) {
        byte movementType = Class282.aClass282_6543.aByte6542;
        if ((mask & 0x4) != 0) { // gfx 1
            int i_10_ = stream.readUShort();
            int i_11_ = stream.readIntLE();
            if (65535 == i_10_)
                i_10_ = -1;
            int i_12_ = stream.readUnsignedByte128();
            int i_13_ = i_12_ & 0x7;
            int i_14_ = i_12_ >> 3 & 0xf;
            if (i_14_ == 15)
                i_14_ = -1;
            boolean bool = 1 == (i_12_ >> 7 & 0x1);
            player.sendGraphics(i_10_, i_11_, i_13_, i_14_, bool, 0, 831413227);
        }
        if ((mask & 0x40) != 0) { // face direction
            player.anInt10221 = stream.readUShort() * -1530078181;
            if (2050671733 * player.anInt10120 == 0) {
                player.method4414(player.anInt10221 * 1208589843, (byte) 1);
                player.anInt10221 = 1530078181;
            }
        }
        if (0 != (mask & 0x8000)) { // gfx 2
            int i_15_ = stream.readUnsignedShort128();
            int i_16_ = stream.readIntV1();
            if (65535 == i_15_)
                i_15_ = -1;
            int i_17_ = stream.readUnsignedByte128();
            int i_18_ = i_17_ & 0x7;
            int i_19_ = i_17_ >> 3 & 0xf;
            if (15 == i_19_)
                i_19_ = -1;
            boolean bool = 1 == (i_17_ >> 7 & 0x1);
            player.sendGraphics(i_15_, i_16_, i_18_, i_19_, bool, 1, -589042001);
        }
        if (0 != (mask & 0x8)) { // hits
            int i_20_ = stream.readUnsignedByteC();
            if (i_20_ > 0) {
                for (int i_21_ = 0; i_21_ < i_20_; i_21_++) {
                    int i_22_ = -1;
                    int i_23_ = -1;
                    int i_24_ = -1;
                    int i_25_ = stream.readUnsignedSmart();
                    if (32767 == i_25_) {
                        i_25_ = stream.readUnsignedSmart();
                        i_23_ = stream.readUnsignedSmart();
                        i_22_ = stream.readUnsignedSmart();
                        i_24_ = stream.readUnsignedSmart();
                    } else if (32766 != i_25_)
                        i_23_ = stream.readUnsignedSmart();
                    else
                        i_25_ = -1;
                    int i_26_ = stream.readUnsignedSmart();
                    int i_27_ = stream.readUnsigned128Byte();
                    player.method4420(i_25_, i_23_, i_22_, i_24_, 443738891 * GameClient.clientTick, i_26_, i_27_, (byte) 121);
                }
            }
        }
        if (0 != (mask & 0x400000)) { // gfx 3
            int i_28_ = stream.readUnsignedShort128();
            int i_29_ = stream.readInt();
            if (i_28_ == 65535)
                i_28_ = -1;
            int i_30_ = stream.readUnsignedByte128();
            int i_31_ = i_30_ & 0x7;
            int i_32_ = i_30_ >> 3 & 0xf;
            if (15 == i_32_)
                i_32_ = -1;
            boolean bool = (i_30_ >> 7 & 0x1) == 1;
            player.sendGraphics(i_28_, i_29_, i_31_, i_32_, bool, 2, 1066291785);
        }
        if (0 != (mask & 0x800000)) { // gfx 4
            int i_33_ = stream.readUnsignedShort128();
            int i_34_ = stream.readIntV1();
            if (65535 == i_33_)
                i_33_ = -1;
            int i_35_ = stream.readUnsignedByte128();
            int i_36_ = i_35_ & 0x7;
            int i_37_ = i_35_ >> 3 & 0xf;
            if (i_37_ == 15)
                i_37_ = -1;
            boolean bool = 1 == (i_35_ >> 7 & 0x1);
            player.sendGraphics(i_33_, i_34_, i_36_, i_37_, bool, 3, 305107810);
        }
        if ((mask & 0x10) != 0) { // appearence
            int length = stream.readUnsignedByte128();
            byte[] is = new byte[length];
            Buffer class298_sub53 = new Buffer(is);
            stream.readBytes(is, 0, length);
            Class10.aClass298_Sub53Array133[playerIndex] = class298_sub53;
            player.sendAppearence(class298_sub53, (byte) 3);
        }
        if (0 != (mask & 0x1)) {
            int i_39_ = stream.readUnsignedShort128();
            if (65535 == i_39_)
                i_39_ = -1;
            player.setNextFaceEntity = i_39_ * 283914955;
        }
        if (0 != (mask & 0x800)) // temporay movement type
            movementType = stream.readByte128();
        if ((mask & 0x40000) != 0)
            player.aBoolean10222 = stream.readUnsignedByteC() == 1;
        if ((mask & 0x20000) != 0) {
            String rawPublicMessage = stream.readString();
            int messageType = stream.readUByte();

            if ((messageType & 0x1) != 0)
                PublicMessage.sendPublicMessage(2, messageType, player.getPlayerName(true), player.getPlayerMessageRights(false), player.displayName, rawPublicMessage);
            player.sendGameMessage(rawPublicMessage, 0, 0, -1714990450);
        }
        if ((mask & 0x2000) != 0) {
            int i_41_ = stream.readUnsignedShortLE();
            player.anInt10088 = stream.readUByte() * 918505277;
            player.anInt10096 = (stream.readUnsignedByteC() * -494980103);
            player.aBoolean10119 = (i_41_ & 0x8000) != 0;
            player.anInt10087 = -257621575 * (i_41_ & 0x7fff);
            player.anInt10086 = (1208636921 * GameClient.clientTick + -1132907677 * player.anInt10087 + 1195117671 * player.anInt10088);
        }
        if ((mask & 0x1000) != 0) { // forcemovement
            player.anInt10098 = stream.readByteC() * 1925713613;
            player.anInt10100 = stream.readByte() * 516351707;
            player.anInt10099 = stream.readByte() * 1712047767;
            player.anInt10101 = stream.readByte128() * 2089924823;
            player.anInt10095 = (stream.readUShort() + GameClient.clientTick * 443738891) * 996079737;
            player.anInt10103 = (stream.readUShort() + GameClient.clientTick * 443738891) * 1000906529;
            player.anInt10104 = stream.readUShort() * 1386670945;
            if (player.aBoolean10217) {
                player.anInt10098 += 259583125 * player.anInt10218;
                player.anInt10100 += (player.anInt10219 * -611622223);
                player.anInt10099 += (-1551443089 * player.anInt10218);
                player.anInt10101 += (1804486437 * player.anInt10219);
                player.anInt10120 = 0;
            } else {
                player.anInt10098 += (1925713613 * player.scenePositionXQueue[0]);
                player.anInt10100 += (player.scenePositionYQueue[0] * 516351707);
                player.anInt10099 += (player.scenePositionXQueue[0] * 1712047767);
                player.anInt10101 += (2089924823 * player.scenePositionYQueue[0]);
                player.anInt10120 = -1013322787;
            }
            player.anInt10125 = 0;
        }
        if ((mask & 0x80) != 0) // movement type
            Class10.playersMovementTypes[playerIndex] = stream.read128Byte();
        if (0 != (mask & 0x4000)) {
            int i_42_ = stream.readUByte();
            int[] is = new int[i_42_];
            int[] is_43_ = new int[i_42_];
            int[] is_44_ = new int[i_42_];
            for (int i_45_ = 0; i_45_ < i_42_; i_45_++) {
                is[i_45_] = stream.readBigSmart();
                is_43_[i_45_] = stream.readUnsignedByte128();
                is_44_[i_45_] = stream.readUnsignedShortLE128();
            }
            StaticMethods.method3428(player, is, is_43_, is_44_, 1644064563);
        }
        if (0 != (mask & 0x20)) { // emotes
            int[] is = new int[Class522.method6325((byte) -10).length];
            for (int i_46_ = 0; i_46_ < Class522.method6325((byte) 0).length; i_46_++)
                is[i_46_] = stream.readBigSmart();
            int i_47_ = stream.readUByte();
            Class431.method5768(player, is, i_47_, false);
        }
        if ((mask & 0x200) != 0)
            player.aBoolean10203 = stream.readUByte() == 1;
        if (0 != (mask & 0x100000)) {
            int i_48_ = stream.readUByte();
            int[] is = new int[i_48_];
            int[] is_49_ = new int[i_48_];
            for (int i_50_ = 0; i_50_ < i_48_; i_50_++) {
                int i_51_ = stream.readUShort();
                if (49152 == (i_51_ & 0xc000)) {
                    int i_52_ = stream.readUnsignedShortLE128();
                    is[i_50_] = i_51_ << 16 | i_52_;
                } else
                    is[i_50_] = i_51_;
                is_49_[i_50_] = stream.readUShort();
            }
            player.method4451(is, is_49_, -305715436);
        }
        if ((mask & 0x10000) != 0) {
            int i_53_ = ((stream.buffer[((stream.offset += 116413311) * 385051775) - 1]) & 0xff);
            for (int i_54_ = 0; i_54_ < i_53_; i_54_++) {
                int i_55_ = stream.readUnsignedShortLE();
                int i_56_ = stream.readInt();
                player.aClass70_10223.method800(i_55_, i_56_, (byte) 1);
            }
        }
        if (0 != (mask & 0x100)) { // forcetalk
            String string = stream.readString();
            if (player == Player.myPlayer)
                PublicMessage.sendPublicMessage(2, 0, player.getPlayerName(true), player.getPlayerMessageRights(false), player.displayName, string);
            player.sendGameMessage(string, 0, 0, -1278251821);
        }
        if ((mask & 0x200000) != 0) {
            player.aByte10117 = stream.readByte();
            player.aByte10108 = stream.readByteC();
            player.aByte10109 = stream.readByte128();
            player.aByte10130 = (byte) stream.readUnsignedByteC();
            player.anInt10105 = ((443738891 * GameClient.clientTick + stream.readUShort()) * 1828453179);
            player.anInt10106 = ((GameClient.clientTick * 443738891 + stream.readUShort()) * -473408095);
        }
        if ((mask & 0x80000) != 0) {
            player.aClass70_10223.method797((byte) -63);
            int i_57_ = ((stream.buffer[((stream.offset += 116413311) * 385051775) - 1]) & 0xff);
            for (int i_58_ = 0; i_58_ < i_57_; i_58_++) {
                int i_59_ = stream.readUnsignedShort128();
                int i_60_ = stream.readIntV1();
                player.aClass70_10223.method800(i_59_, i_60_, (byte) 1);
            }
        }
        if (player.aBoolean10217) {
            if (movementType == 127)
                player.method4472(659113193 * player.anInt10218, -504032157 * player.anInt10219);
            else {
                byte i_61_;
                if (Class282.aClass282_6543.aByte6542 != movementType)
                    i_61_ = movementType;
                else
                    i_61_ = Class10.playersMovementTypes[playerIndex];
                GameContext.method5575(player, i_61_, 1037382874);
                player.method4471(659113193 * player.anInt10218, -504032157 * player.anInt10219, i_61_);
            }
        }
    }

    public static void method2968(int toolkitMode, String string, boolean live) {
            while_108_:
            do {
                if (toolkitMode == ToolkitOption.PUREJAVA) {
                    GameClient.activeGraphicsToolkit = GraphicsToolkit.getCreatedToolkit(ToolkitOption.PUREJAVA, DirectXContext.canvas, Js5Configs.texturesList, Js5List.JS5_SHADERS, SettingsManager.settingsManager.multisample.getValue() * 2);
                    if (null != string) {
                        GameClient.activeGraphicsToolkit.clear(1, 0);
                        RSFontMetrics rsFontMetrics = Class322.getFontMetricFileData(Js5List.JS5_FONTMETRICS, (Class74.anInt690 * 1178461027), 0);
                        FontToolkit fontToolkit = (GameClient.activeGraphicsToolkit.createFontToolkit(rsFontMetrics, Sprite.load(Js5List.JS5_SPRITES, (1178461027 * Class74.anInt690), 0), true));
                        Class148.clearAWT();
                        StaticMethods.drawCornerLoadingBox(string, true, GameClient.activeGraphicsToolkit, fontToolkit, rsFontMetrics);
                    }
                } else {
                    GraphicsToolkit graphicsToolkit = null;
                    if (null != string) {
                        graphicsToolkit = GraphicsToolkit.getCreatedToolkit(ToolkitOption.PUREJAVA, (DirectXContext.canvas), Js5Configs.texturesList, Js5List.JS5_SHADERS, 0);
                        graphicsToolkit.clear(1, 0);
                        RSFontMetrics fontMetrics = Class322.getFontMetricFileData(Js5List.JS5_FONTMETRICS, (Class74.anInt690 * 1178461027), 0);
                        FontToolkit fontToolkit = (graphicsToolkit.createFontToolkit(fontMetrics, Sprite.load(Js5List.JS5_SPRITES, (Class74.anInt690 * 1178461027), 0), true));
                        Class148.clearAWT();
                        StaticMethods.drawCornerLoadingBox(string, true, graphicsToolkit, fontToolkit, fontMetrics);
                    }
                    do {
                        try {
                            try {
                                GameClient.activeGraphicsToolkit = (GraphicsToolkit.getCreatedToolkit(toolkitMode, DirectXContext.canvas, Js5Configs.texturesList, Js5List.JS5_SHADERS, SettingsManager.settingsManager.multisample.getValue() * 2));
                                if (string != null) {
                                    graphicsToolkit.clear(1, 0);
                                    RSFontMetrics fontMetrics = (Class322.getFontMetricFileData(Js5List.JS5_FONTMETRICS, Class74.anInt690 * 1178461027, 0));
                                    FontToolkit fontToolkit = (graphicsToolkit.createFontToolkit(fontMetrics, (Sprite.load(Js5List.JS5_SPRITES, Class74.anInt690 * 1178461027, 0)), true));
                                    Class148.clearAWT();
                                    StaticMethods.drawCornerLoadingBox(string, true, graphicsToolkit, fontToolkit, fontMetrics);
                                }
                                if (GameClient.activeGraphicsToolkit.method5001()) {
                                    boolean bool_27_ = true;
                                    try {
                                        bool_27_ = (Class12.systemInfo.cpuClockSpeed) * 399637415 > 256;
                                    } catch (Throwable throwable) {
										/* empty */
                                    }
                                    Heap heap;
                                    if (bool_27_)
                                        heap = GameClient.activeGraphicsToolkit.createNativeHeap(146800640);
                                    else
                                        heap = GameClient.activeGraphicsToolkit.createNativeHeap(104857600);
                                    GameClient.activeGraphicsToolkit.setBufferHeap(heap);
                                }
                            } catch (Throwable throwable) {
                                int toolkitValue = SettingsManager.settingsManager.toolkitSetting.getValue();
                                if (toolkitValue == 0)
                                    GameClient.aBoolean8662 = true;
                                SettingsManager.settingsManager.setValue((SettingsManager.settingsManager.toolkitSetting), 0);
                                method2968(toolkitValue, string, live);
                                break;
                            }
                            if (graphicsToolkit != null) {
                                try {
                                    graphicsToolkit.destroy();
                                } catch (Throwable throwable) {
									/* empty */
                                }
                            }
                            break while_108_;
                        } catch (RuntimeException object) {
                            if (graphicsToolkit != null) {
                                try {
                                    graphicsToolkit.destroy();
                                } catch (Throwable throwable) {
									/* empty */
                                }
                            }
                            throw object;
                        }
                    } while (false);
                    if (graphicsToolkit != null) {
                        try {
                            graphicsToolkit.destroy();
                        } catch (Throwable throwable) {
							/* empty */
                        }
                    }
                    return;
                }
            } while (false);
            if (live)
                SettingsManager.settingsManager.setLive(SettingsManager.settingsManager.toolkitSetting, !live);
            SettingsManager.settingsManager.setValue(SettingsManager.settingsManager.toolkitSetting, toolkitMode);
            if (!live)
                SettingsManager.settingsManager.setLive(SettingsManager.settingsManager.toolkitSetting, !live);
            Class513.method6293();
            GameClient.activeGraphicsToolkit.method5169(10000);
            GameClient.activeGraphicsToolkit.J(32);
            GameClient.myRegion.method2648();
            GameClient.activeGraphicsToolkit.method4787(true);
            if (GameClient.activeGraphicsToolkit.hasBloomToolkits())
                Class365_Sub1_Sub5_Sub1.method4525(SettingsManager.settingsManager.bloom.getValue() == BloomSettings.BLOOMON);
            GameClient.myRegion.createLightingDetails();
            GameClient.myRegion.getLightningDetails().method4324();
            GameClient.sentPreferences = false;
            GameClient.aBoolean8676 = true;
            Class100.aClass456Array1080 = null;
            GameClient.activeGraphicsToolkit.GA(0.0F, 1.0F);
    }

    boolean method2835(byte i) {
        return (this.aByte3176 == 2 || this.aByte3176 == 3);
    }

}
