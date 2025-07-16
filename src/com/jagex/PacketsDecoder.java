package com.jagex;

import com.jagex.game.cache.config.Js5Configs;
import com.jagex.game.cache.config.prefetch.Js5List;
import com.jagex.game.cache.definition.animation.AnimationDefinition;
import com.jagex.network.IncommingPacket;
import com.jagex.network.OutgoingPacket;
import com.jagex.utils.StringUtils;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PacketsDecoder {

    static void method50123() {
        try {
            Class var_class = java.lang.ClassLoader.class;
            Field field = var_class.getDeclaredField("nativeLibraries");
            Class var_class_124_ = java.lang.reflect.AccessibleObject.class;
            Method method = var_class_124_.getDeclaredMethod("setAccessible", (new Class[]{Boolean.TYPE}));
            method.invoke(field, Boolean.TRUE);
        } catch (Throwable throwable) {

        }
    }

    static final boolean decodeIncommingPacket(ConnectionType connectionType) throws IOException {
        Stream stream = connectionType.getStream();
        RsBitsBuffer buffer = connectionType.bitsBuffer;
        if (stream == null)
            return false;
        if (connectionType.INCOMMING_PACKET == null) {
            if (connectionType.aBoolean337) {
                if (!stream.isAvailable(1))
                    return false;
                stream.readBytes((connectionType.bitsBuffer.buffer), 0, 1);
                connectionType.anInt341 += 655103753;
                connectionType.anInt338 = 0;
                connectionType.aBoolean337 = false;
            }
            buffer.offset = 0;
            if (buffer.method3661()) {
                if (!stream.isAvailable(1))
                    return false;
                stream.readBytes((connectionType.bitsBuffer.buffer), 1, 1);
                connectionType.anInt341 += 655103753;
                connectionType.anInt338 = 0;
            }
            connectionType.aBoolean337 = true;
            IncommingPacket[] packets = IncommingPacket.getIncommingPackets();
            int packetID = buffer.readUnsignedSmart();
            if (packetID < 0 || packetID >= packets.length)
                throw new IOException(new StringBuilder().append(packetID).append(" ").append(385051775 * buffer.offset).toString());
            connectionType.INCOMMING_PACKET = packets[packetID];
            connectionType.population = connectionType.INCOMMING_PACKET.packetSize * -80186869;
        }
        if (-1 == -866602563 * connectionType.population) {
            if (!stream.isAvailable(1))
                return false;
            stream.readBytes(buffer.buffer, 0, 1);
            connectionType.population = ((buffer.buffer[0] & 0xff) * -1265692267);
            connectionType.anInt341 += 655103753;
            connectionType.anInt338 = 0;
        }
        if (-2 == -866602563 * connectionType.population) {
            if (!stream.isAvailable(2))
                return false;
            stream.readBytes(buffer.buffer, 0, 2);
            buffer.offset = 0;
            connectionType.population = buffer.readUShort() * -1265692267;
            connectionType.anInt341 += 1310207506;
            connectionType.anInt338 = 0;
        }
        if (-866602563 * connectionType.population > 0) {
            if (!stream.isAvailable((-866602563 * connectionType.population)))
                return false;
            buffer.offset = 0;
            stream.readBytes(buffer.buffer, 0, -866602563 * connectionType.population);
            connectionType.anInt341 += 1190279845 * connectionType.population;
            connectionType.anInt338 = 0;
        }
        connectionType.aClass202_348 = connectionType.aClass202_345;
        connectionType.aClass202_345 = connectionType.aClass202_344;
        connectionType.aClass202_344 = connectionType.INCOMMING_PACKET;
        if (connectionType.INCOMMING_PACKET == IncommingPacket.aClass202_2162) {
            GameClient.aByte8959 = buffer.readByteC();
            if (GameClient.aByte8959 == 0 || GameClient.aByte8959 == 1)
                GameClient.aBoolean8640 = true;
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (connectionType.INCOMMING_PACKET == IncommingPacket.aClass202_2261) {
            GameClient.anInt8885 = 887090299 * GameClient.anInt8933;
            boolean bool = buffer.readUByte() == 1;
            Class160 class160 = new Class160(buffer);
            Class162 class162;
            if (bool)
                class162 = Class225.aClass162_2512;
            else
                class162 = Class508.aClass162_6216;
            class160.method1707(class162, (byte) -89);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (connectionType.INCOMMING_PACKET == IncommingPacket.MEMORY_MANAGEMENT) {
            int manageCode = buffer.readUShort();
            Class321.memoryManage(manageCode);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (IncommingPacket.MESSAGE_PACKET == connectionType.INCOMMING_PACKET) {
            int rights = buffer.readUnsignedSmart();
            int messageType = buffer.readInt();
            int playerRights = buffer.readUByte();
            String playerName = "";
            String playerMessageRights = playerName;
            if ((playerRights & 0x1) != 0) {
                playerName = buffer.readString();
                if ((playerRights & 0x2) != 0)
                    playerMessageRights = buffer.readString();
                else
                    playerMessageRights = playerName;
            }
            String rawPublicMessage = buffer.readString();
            if (rights == 99)
                StaticMethods.sendConsoleMessage(rawPublicMessage);
            else if (rights == 98)
                StaticMethods.method5694(rawPublicMessage);
            else {
                if (!playerMessageRights.equals("") && Class287.method2722(playerMessageRights)) {
                    connectionType.INCOMMING_PACKET = null;
                    return true;
                }

                PublicMessage.sendPublicMessage(rights, messageType, playerName, playerMessageRights, playerName, rawPublicMessage);
            }
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (connectionType.INCOMMING_PACKET == IncommingPacket.aClass202_2309) {
            GameClient.anInt8845 = buffer.readShort() * 2043410797;
            GameClient.anInt8888 = GameClient.anInt8933 * 1991119277;
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (connectionType.INCOMMING_PACKET == IncommingPacket.KEEP_ALIVE_PACKET) {
            connectionType.INCOMMING_PACKET = null;
            return false;
        }
        if (connectionType.INCOMMING_PACKET == IncommingPacket.NPC_ICOMPONENT_PACKET) {
            int npcID = buffer.readInt();
            int interfaceHash = buffer.readInt();
            GameClient.incrementPacketCount();
            IComponentUpdateNode.setModelOnIComponent(interfaceHash, IComponentDefinition.MODELTYPE_NPC, npcID, -1);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (IncommingPacket.FULL_PLAYER_ON_ICOMPONENT_PACKET == connectionType.INCOMMING_PACKET) {
            int interfaceHash = buffer.readInt();
            int modelAttribute = buffer.readUShort();
            int modelZoom = buffer.readInt();
            GameClient.incrementPacketCount();
            IComponentUpdateNode.setModelOnIComponent(interfaceHash, IComponentDefinition.MODELTYPE_PLAYER, modelAttribute, modelZoom);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (connectionType.INCOMMING_PACKET == IncommingPacket.aClass202_2209) {
            int addressHash = buffer.readInt();
            StockMarketListing.aClass524_2773 = new Class524(addressHash);
            Thread thread = new Thread(StockMarketListing.aClass524_2773);
            thread.setPriority(1);
            thread.start();
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (IncommingPacket.aClass202_2270 == connectionType.INCOMMING_PACKET) {
            int i_91_ = buffer.readUShort();
            int i_92_ = buffer.readIntV1();
            GameClient.incrementPacketCount();
            IComponentUpdateNode.method5600(i_92_, i_91_);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (connectionType.INCOMMING_PACKET == IncommingPacket.aClass202_2204) {
            Class313.anObjectArray3298 = null;
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (connectionType.INCOMMING_PACKET == IncommingPacket.GRAPHICS_PACKET) {
            int graphicsID = buffer.readUShort();
            if (65535 == graphicsID)
                graphicsID = -1;
            int slotID = buffer.readUnsignedByte128();
            int speed = buffer.readUShort();
            int hash = buffer.readUnsignedByte128();
            int graphicsHeight = buffer.readUShort();
            int targetHash = buffer.readIntLE();
            int rotation = hash & 0x7;
            int i_100_ = hash >> 3 & 0xf;
            if (15 == i_100_)
                i_100_ = -1;
            boolean bool = (hash >> 7 & 0x1) == 1;
            if (targetHash >> 30 != 0) {
                GameScene gameScene = GameClient.myRegion.getGameScene();
                int i_101_ = targetHash >> 28 & 0x3;
                int i_102_ = ((targetHash >> 14 & 0x3fff) - -1760580017 * gameScene.gameSceneBaseX);
                int i_103_ = (targetHash & 0x3fff) - 283514611 * gameScene.gameSceneBaseY;
                if (i_102_ >= 0 && i_103_ >= 0 && (i_102_ < GameClient.myRegion.getMapWidth()) && (i_103_ < GameClient.myRegion.getMapLength())) {
                    if (graphicsID == -1) {
                        Class298_Sub37_Sub3 class298_sub37_sub3 = ((Class298_Sub37_Sub3) (GameClient.aClass437_8825.get((long) (i_102_ << 16 | i_103_))));
                        if (class298_sub37_sub3 != null) {
                            class298_sub37_sub3.aClass365_Sub1_Sub1_Sub3_9578.method4480((byte) 12);
                            class298_sub37_sub3.unlink();
                        }
                    } else {
                        int i_104_ = 256 + i_102_ * 512;
                        int i_105_ = 256 + 512 * i_103_;
                        int i_106_ = i_101_;
                        if (i_106_ < 3 && (GameClient.myRegion.method2654().method2320(i_102_, i_103_)))
                            i_106_++;
                        Class365_Sub1_Sub1_Sub3 class365_sub1_sub1_sub3 = (new Class365_Sub1_Sub1_Sub3(GameClient.myRegion.getRegion(), graphicsID, speed, i_101_, i_106_, i_104_, Class356.getAverageHeight(i_104_, i_105_, i_101_, -1215922012) - graphicsHeight, i_105_, i_102_, i_102_, i_103_, i_103_, rotation, bool));
                        GameClient.aClass437_8825.connect((new Class298_Sub37_Sub3(class365_sub1_sub1_sub3)), (long) (i_102_ << 16 | i_103_));
                    }
                }
            } else if (targetHash >> 29 != 0) {
                int npcIndex = targetHash & 0xffff;
                ObjectNode node = ((ObjectNode) GameClient.entityList.get((long) npcIndex));
                if (null != node) {
                    NPC npc = ((NPC) node.nodeObject);
                    Graphics currentGraphic = (npc.currentGraphics[slotID]);
                    if (graphicsID == 65535)
                        graphicsID = -1;
                    boolean repeat = true;
                    int graphicID2 = -967533709 * currentGraphic.graphicID;
                    if (-1 != graphicsID && graphicID2 != -1) {
                        if (graphicsID == graphicID2) {
                            SpotType spotType = SpotTypeLoader.loader.get(graphicsID);
                            if (spotType.aBoolean5215 && -1 != spotType.animationID * 1505778629) {
                                AnimationDefinition animationDefinition = (Js5Configs.animsList.get(spotType.animationID * 1505778629));
                                int resetType = animationDefinition.resetType * -1117238071;
                                if (resetType == 0 || 2 == resetType)
                                    repeat = false;
                                else if (resetType == 1)
                                    repeat = true;
                            }
                        } else {
                            SpotType spotType1 = SpotTypeLoader.loader.get(graphicsID);
                            SpotType spotType2 = SpotTypeLoader.loader.get(graphicID2);
                            if (spotType1.animationID * 1505778629 != -1 && (spotType2.animationID * 1505778629 != -1)) {
                                AnimationDefinition animationDefinition1 = (Js5Configs.animsList.get(spotType1.animationID * 1505778629));
                                AnimationDefinition animationDefinition2 = (Js5Configs.animsList.get((1505778629 * spotType2.animationID)));
                                if (-1445588039 * animationDefinition1.priority < (-1445588039 * animationDefinition2.priority))
                                    repeat = false;
                            }
                        }
                    }
                    if (repeat) {
                        currentGraphic.graphicID = 1313669563 * graphicsID;
                        currentGraphic.height = graphicsHeight * 1755371497;
                        currentGraphic.anInt568 = i_100_ * 1533439965;
                        if (-1 != graphicsID) {
                            SpotType spotType = SpotTypeLoader.loader.get(graphicsID);
                            int i_113_ = spotType.aBoolean5215 ? 0 : 2;
                            if (bool)
                                i_113_ = 1;
                            currentGraphic.animator.method5824(1505778629 * spotType.animationID, speed, i_113_, false);
                        } else
                            currentGraphic.animator.load(-1);
                    }
                }
            } else if (targetHash >> 28 != 0) {
                int playerIndex = targetHash & 0xffff;
                Player player;
                if (playerIndex == -442628795 * GameClient.playerIndex)
                    player = Player.myPlayer;
                else
                    player = (GameClient.entities[playerIndex]);
                if (player != null) {
                    Graphics currentGraphic = (player.currentGraphics[slotID]);
                    if (65535 == graphicsID)
                        graphicsID = -1;
                    boolean reset = true;
                    int i_116_ = -967533709 * currentGraphic.graphicID;
                    if (graphicsID != -1 && -1 != i_116_) {
                        if (graphicsID == i_116_) {
                            SpotType spotType = SpotTypeLoader.loader.get(graphicsID);
                            if (spotType.aBoolean5215 && spotType.animationID * 1505778629 != -1) {
                                AnimationDefinition animationDefinition = (Js5Configs.animsList.get(spotType.animationID * 1505778629));
                                int resetType = -1117238071 * animationDefinition.resetType;
                                if (0 == resetType || 2 == resetType)
                                    reset = false;
                                else if (resetType == 1)
                                    reset = true;
                            }
                        } else {
                            SpotType class398 = SpotTypeLoader.loader.get(graphicsID);
                            SpotType class398_118_ = SpotTypeLoader.loader.get(i_116_);
                            if (-1 != class398.animationID * 1505778629 && -1 != (1505778629 * class398_118_.animationID)) {
                                AnimationDefinition class391 = (Js5Configs.animsList.get(1505778629 * class398.animationID));
                                AnimationDefinition class391_119_ = (Js5Configs.animsList.get((class398_118_.animationID * 1505778629)));
                                if (class391.priority * -1445588039 < (-1445588039 * class391_119_.priority))
                                    reset = false;
                            }
                        }
                    }
                    if (reset) {
                        currentGraphic.graphicID = graphicsID * 1313669563;
                        currentGraphic.height = graphicsHeight * 1755371497;
                        currentGraphic.anInt568 = i_100_ * 1533439965;
                        currentGraphic.rotation = 1949040559 * rotation;
                        if (graphicsID != -1) {
                            SpotType spotType = SpotTypeLoader.loader.get(graphicsID);
                            int i_120_ = spotType.aBoolean5215 ? 0 : 2;
                            if (bool)
                                i_120_ = 1;
                            currentGraphic.animator.method5824(1505778629 * spotType.animationID, speed, i_120_, false);
                        } else
                            currentGraphic.animator.load(-1);
                    }
                }
            }
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (IncommingPacket.OPEN_INTERFACE_OBJECT == connectionType.INCOMMING_PACKET) {
            int xtea2 = buffer.readIntV2();
            int clipped = buffer.readUByte();
            int xtea3 = buffer.readIntLE();
            int objectId = buffer.readIntV1();
            int objectHash = buffer.readUnsignedByte128();
            int type = objectHash >> 2;
            int rotation = objectHash & 0x3;
            GameScene coordinateHash = new GameScene(buffer.readInt());
            int parentHash = buffer.readIntV2();
            int interfaceId = buffer.readUShort();
            int xtea4 = buffer.readInt();
            int xtea1 = buffer.readInt();
            GameClient.incrementPacketCount();
            Widget.connectComponent(parentHash, new Class298_Sub51_Sub3(interfaceId, clipped, new Class409(coordinateHash, type, objectId)), new int[]{xtea1, xtea2, xtea3, xtea4}, false);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (IncommingPacket.aClass202_2186 == connectionType.INCOMMING_PACKET) {
            int i_132_ = buffer.readUnsignedShortLE128();
            GameClient.incrementPacketCount();
            StaticMethods.method1300(i_132_);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (connectionType.INCOMMING_PACKET == IncommingPacket.PRIVATE_GAME_BAR_STAGE_PACKET) {
            ShaderProgramToolkit.aClass459_6404 = StaticMethods.method2571(buffer.readUByte(), 413652738);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (IncommingPacket.GLOBAL_STRING_LONG_PACKET == connectionType.INCOMMING_PACKET) {
            String string = buffer.readString();
            int configID = buffer.readUShort();
            GameClient.incrementPacketCount();
            IComponentUpdateNode.setIComponentGlobalString(configID, string);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (IncommingPacket.aClass202_2182 == connectionType.INCOMMING_PACKET) {
            Class315.method3834(SubIncommingPacket.aClass206_2347);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (IncommingPacket.CONFIG1_PACKET == connectionType.INCOMMING_PACKET) {
            int i_134_ = buffer.readUnsignedShortLE128();
            byte i_135_ = buffer.readByte128();
            Class128.playerVarsProvider.method1605(i_134_, i_135_);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (connectionType.INCOMMING_PACKET == IncommingPacket.aClass202_2166) {
            Class128.playerVarsProvider.method1603(-1701505848);
            GameClient.anInt8783 += -612656928;
            connectionType.INCOMMING_PACKET = null;
            return true;
        }


        if (IncommingPacket.aClass202_2199 == connectionType.INCOMMING_PACKET) {
            String string = buffer.readString();
            boolean bool = buffer.readUByte() == 1;
            String string_136_;
            if (bool)
                string_136_ = buffer.readString();
            else
                string_136_ = string;
            int i_137_ = buffer.readUShort();
            byte i_138_ = buffer.readByte();
            boolean bool_139_ = false;
            if (i_138_ == -128)
                bool_139_ = true;
            if (bool_139_) {
                if (-1801543887 * Class489.anInt6071 == 0) {
                    connectionType.INCOMMING_PACKET = null;
                    return true;
                }
                boolean bool_140_ = false;
                int i_141_;
                for (i_141_ = 0; i_141_ < Class489.anInt6071 * -1801543887; i_141_++) {
                    if (StaticMethods.aClass7Array6846[i_141_].aString93.equals(string_136_) && (StaticMethods.aClass7Array6846[i_141_].anInt95 * -1071570519) == i_137_) {
                        break;
                    }
                }
                if (i_141_ < -1801543887 * Class489.anInt6071) {
                    for (/**/; i_141_ < -1801543887 * Class489.anInt6071 - 1; i_141_++)
                        StaticMethods.aClass7Array6846[i_141_] = StaticMethods.aClass7Array6846[1 + i_141_];
                    Class489.anInt6071 -= -1649911343;
                    StaticMethods.aClass7Array6846[(Class489.anInt6071 * -1801543887)] = null;
                }
            } else {
                String string_142_ = buffer.readString();
                Class7 class7 = new Class7();
                class7.aString92 = string;
                class7.aString93 = string_136_;
                class7.aString94 = Class173.method1824(class7.aString93);
                class7.anInt95 = i_137_ * -129166695;
                class7.aByte97 = i_138_;
                class7.aString96 = string_142_;
                int i_143_;
                for (i_143_ = -1801543887 * Class489.anInt6071 - 1; i_143_ >= 0; i_143_--) {
                    int i_144_ = StaticMethods.aClass7Array6846[i_143_].aString94.compareTo(class7.aString94);
                    if (0 == i_144_) {
                        StaticMethods.aClass7Array6846[i_143_].anInt95 = -129166695 * i_137_;
                        StaticMethods.aClass7Array6846[i_143_].aByte97 = i_138_;
                        StaticMethods.aClass7Array6846[i_143_].aString96 = string_142_;
                        if (string_136_.equals(Player.myPlayer.accountName))
                            Class173.aByte1759 = i_138_;
                        GameClient.anInt8912 = GameClient.anInt8933 * 1348241137;
                        connectionType.INCOMMING_PACKET = null;
                        return true;
                    }
                    if (i_144_ < 0) {
                        break;
                    }
                }
                if (-1801543887 * Class489.anInt6071 >= StaticMethods.aClass7Array6846.length) {
                    connectionType.INCOMMING_PACKET = null;
                    return true;
                }
                for (int i_145_ = -1801543887 * Class489.anInt6071 - 1; i_145_ > i_143_; i_145_--)
                    StaticMethods.aClass7Array6846[i_145_ + 1] = StaticMethods.aClass7Array6846[i_145_];
                if (0 == Class489.anInt6071 * -1801543887)
                    StaticMethods.aClass7Array6846 = new Class7[100];
                StaticMethods.aClass7Array6846[1 + i_143_] = class7;
                Class489.anInt6071 += -1649911343;
                if (string_136_.equals(Player.myPlayer.accountName))
                    Class173.aByte1759 = i_138_;
            }
            GameClient.anInt8912 = GameClient.anInt8933 * 1348241137;
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (IncommingPacket.SYSTEM_UPDATE_PACKET == connectionType.INCOMMING_PACKET) {
            if (GameClient.isLobbyConnected(GameClient.gameState * -1233866115))
                GameClient.shutdownDelay = (int) ((float) buffer.readUShort() * 2.5F) * -2090750423;
            else
                GameClient.shutdownDelay = (buffer.readUShort() * 1701996750);
            GameClient.anInt8888 = GameClient.anInt8933 * 1991119277;
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (connectionType.INCOMMING_PACKET == IncommingPacket.CLANCHAT_MANAGER) {
            GameClient.anInt8886 = -1469951735 * GameClient.anInt8933;
            boolean myClan = buffer.readUByte() == 1;
            if (connectionType.population * -866602563 == 1) {
                if (myClan)
                    ClanChannelChat.clanManager = null;
                else
                    StaticMethods.aClanChannelChat_4084 = null;
                connectionType.INCOMMING_PACKET = null;
                return true;
            }
            if (myClan)
                ClanChannelChat.clanManager = new ClanChannelChat(buffer);
            else
                StaticMethods.aClanChannelChat_4084 = new ClanChannelChat(buffer);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (IncommingPacket.aClass202_2237 == connectionType.INCOMMING_PACKET) {
            int i_146_ = buffer.readUnsignedByte128();
            int i_147_ = buffer.readUShort();
            GameClient.incrementPacketCount();
            Class313.method3820(i_147_, i_146_, true, 2135177684);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (IncommingPacket.aClass202_2184 == connectionType.INCOMMING_PACKET) {
            int soundId = buffer.readUShort();
            if (65535 == soundId)
                soundId = -1;
            int i_149_ = buffer.readUByte();
            int i_150_ = buffer.readUShort();
            int i_151_ = buffer.readUByte();
            int i_152_ = buffer.readUShort();
            ToMoveSettings.method3913(soundId, i_149_, i_150_, i_151_, false, i_152_);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (IncommingPacket.aClass202_2307 == connectionType.INCOMMING_PACKET) {
            int i_153_ = buffer.readIntV2();
            boolean bool = buffer.readUnsignedByte128() == 1;
            if (bool != Class525.aBoolean6300 || i_153_ != Class100.anInt1079 * -1537941929) {
                Class525.aBoolean6300 = bool;
                Class100.anInt1079 = i_153_ * -442700441;
                ToMoveScripts.method1405(CS2Context.aClass502_6725, -1, -1);
            }
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (IncommingPacket.ICOMPONENT_MODEL_PACKET == connectionType.INCOMMING_PACKET) {
            int modelID = buffer.readIntV1();
            int interfaceHash = buffer.readIntV1();
            GameClient.incrementPacketCount();
            IComponentUpdateNode.setModelOnIComponent(interfaceHash, IComponentDefinition.MODELTYPE_DEFAULT , modelID, -1);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (connectionType.INCOMMING_PACKET == IncommingPacket.aClass202_2236) {
            int i_156_ = buffer.readUByte();
            int i_157_ = buffer.readBigSmart();
            if (null != GameClient.aClass299Array8671[i_156_]) {
                GameClient.aClass299Array8671[i_156_].method3677(GameClient.myRegion.getRegion(), -1127737066);
                GameClient.aClass299Array8671[i_156_] = null;
            }
            if (i_157_ != -1) {
                GameClient.aClass299Array8671[i_156_] = new Class299(GameClient.activeGraphicsToolkit, buffer, i_157_);
                GameClient.aClass299Array8671[i_156_].method3676(GameClient.myRegion.getRegion(), 2021897283);
            }
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (connectionType.INCOMMING_PACKET == IncommingPacket.aClass202_2177) {
            buffer.offset += -1035394588;
            if (buffer.method3615())
                ScriptInstructions.method2391(buffer, (385051775 * buffer.offset) - 28);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (connectionType.INCOMMING_PACKET == IncommingPacket.SET_MOUSE_PACKET) {
            StaticMethods.mouseHoverString = (-866602563 * connectionType.population > 2 ? buffer.readString() : Tradution.WALK_HERE.translate(GameLanguage.CURRENT_LANGUAGE));
            GameClient.anInt8822 = ((connectionType.population * -866602563 > 0 ? buffer.readUShort() : -1) * 812630591);
            if (GameClient.anInt8822 * -1471730241 == 65535)
                GameClient.anInt8822 = -812630591;
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (IncommingPacket.aClass202_2160 == connectionType.INCOMMING_PACKET) {
            int clipped = buffer.readUnsigned128Byte();
            int key2 = buffer.readIntV2();
            int parenthash = buffer.readIntLE();
            int key1 = buffer.readIntV1();
            int i_162_ = buffer.readUShort();
            int key4 = buffer.readIntV1();
            int key3 = buffer.readInt();
            int interfaceID = buffer.readUnsignedShortLE();
            GameScene scene = new GameScene(buffer.readInt());
            GameClient.incrementPacketCount();
            Widget.connectComponent(parenthash, new Class298_Sub51_Sub4(interfaceID, clipped, new Class400(scene, i_162_)), new int[]{key1, key2, key3, key4}, false);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (IncommingPacket.RECIEVE_CLAN_CHAT_MESSAGE == connectionType.INCOMMING_PACKET) {
            boolean bool = buffer.readUByte() == 1;
            String string = buffer.readString();
            long l = (long) buffer.readUShort();
            long l_166_ = (long) buffer.readUTriByte();
            int i_167_ = buffer.readUByte();
            long l_168_ = (l << 32) + l_166_;
            boolean bool_169_ = false;
            Object object = null;
            ClanChannelChat clanChannelChat = (bool ? ClanChannelChat.clanManager : StaticMethods.aClanChannelChat_4084);
            while_86_:
            do {
                if (null == clanChannelChat)
                    bool_169_ = true;
                else {
                    for (int i_170_ = 0; i_170_ < 100; i_170_++) {
                        if (GameClient.aLongArray8915[i_170_] == l_168_) {
                            bool_169_ = true;
                            break while_86_;
                        }
                    }
                    if (i_167_ <= 1) {
                        if (GameClient.aBoolean8811 && !GameClient.aBoolean8812 || GameClient.aBoolean8802)
                            bool_169_ = true;
                        else if (Class287.method2722(string))
                            bool_169_ = true;
                    }
                }
            } while (false);
            if (!bool_169_) {
                GameClient.aLongArray8915[1594173071 * GameClient.anInt8916] = l_168_;
                GameClient.anInt8916 = ((1 + 1594173071 * GameClient.anInt8916) % 100 * 1356544111);
                String string_171_ = (StringUtils.decryptStringMessage(Class127_Sub1.huffManDecryption(buffer)));
                int i_172_ = bool ? 41 : 44;
                if (2 == i_167_ || i_167_ == 3)
                    PublicMessage.createPublicMessage(i_172_, 0, new StringBuilder().append(StaticMethods.method2368(1)).append(string).toString(), new StringBuilder().append(StaticMethods.method2368(1)).append(string).toString(), string, string_171_, clanChannelChat.channelName, -1);
                else if (i_167_ == 1)
                    PublicMessage.createPublicMessage(i_172_, 0, new StringBuilder().append(StaticMethods.method2368(0)).append(string).toString(), new StringBuilder().append(StaticMethods.method2368(0)).append(string).toString(), string, string_171_, clanChannelChat.channelName, -1);
                else
                    PublicMessage.createPublicMessage(i_172_, 0, string, string, string, string_171_, clanChannelChat.channelName, -1);
            }
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (IncommingPacket.ICOMPONENT_SETTINGS_PACKET == connectionType.INCOMMING_PACKET) {
            int settingsHash = buffer.readIntV2();
            int icomponentHash = buffer.readInt();
            int fromSlot = buffer.readUnsignedShort128();
            if (65535 == fromSlot)
                fromSlot = -1;
            int toSlot = buffer.readUnsignedShortLE();
            if (toSlot == 65535)
                toSlot = -1;
            GameClient.incrementPacketCount();
            for (int slot = fromSlot; slot <= toSlot; slot++) {
                long l = (long) slot + ((long) icomponentHash << 32);
                IComponentSettings IComponentSettings = (IComponentSettings) GameClient.aClass437_8896.get(l);
                IComponentSettings IComponentSettings_178_;
                if (IComponentSettings == null) {
                    if (-1 == slot)
                        IComponentSettings_178_ = new IComponentSettings(settingsHash, ((IComponentDefinition.getInterfaceComponent(icomponentHash).activeProperties.anInt7410) * -1133219011));
                    else
                        IComponentSettings_178_ = new IComponentSettings(settingsHash, -1);
                } else {
                    IComponentSettings_178_ = new IComponentSettings(settingsHash, (-1133219011 * IComponentSettings.anInt7410));
                    IComponentSettings.unlink();
                }
                GameClient.aClass437_8896.connect(IComponentSettings_178_, l);
            }
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (connectionType.INCOMMING_PACKET == IncommingPacket.SEND_FRIEND_QUICK_CHAT_MESSAGE_PACKET) {
            String string = buffer.readString();
            int i_179_ = buffer.readUShort();
            String string_180_ = StaticMethods.aClass469_5618.method6045(i_179_).method3459(buffer, -734708119);
            PublicMessage.createPublicMessage(19, 0, string, string, string, string_180_, null, i_179_);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (IncommingPacket.aClass202_2223 == connectionType.INCOMMING_PACKET) {
            int i_181_ = buffer.readIntV1();
            GameClient.incrementPacketCount();
            if (i_181_ == -1) {
                Class100.anInt1081 = 178575833;
                Class418.anInt5339 = -1001372047;
            } else {
                GameScene gameScene = GameClient.myRegion.getGameScene();
                int i_182_ = i_181_ >> 14 & 0x3fff;
                int i_183_ = i_181_ & 0x3fff;
                i_182_ -= -1760580017 * gameScene.gameSceneBaseX;
                if (i_182_ < 0)
                    i_182_ = 0;
                else if (i_182_ >= GameClient.myRegion.getMapWidth())
                    i_182_ = GameClient.myRegion.getMapWidth();
                i_183_ -= 283514611 * gameScene.gameSceneBaseY;
                if (i_183_ < 0)
                    i_183_ = 0;
                else if (i_183_ >= GameClient.myRegion.getMapLength())
                    i_183_ = GameClient.myRegion.getMapLength();
                Class100.anInt1081 = -178575833 * ((i_182_ << 9) + 256);
                Class418.anInt5339 = 1001372047 * (256 + (i_183_ << 9));
            }
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (connectionType.INCOMMING_PACKET == IncommingPacket.CONFIG_BY_FILE2_PACKET) {
            int i_184_ = buffer.readIntV1();
            int configID = buffer.readUnsignedShort128();
            Class128.playerVarsProvider.setConfigByFileValue(configID, i_184_);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (connectionType.INCOMMING_PACKET == IncommingPacket.aClass202_2274) {
            int interfaceHash = buffer.readIntV1();
            int componentID = buffer.readUnsignedShortLE();
            int interfaceID = buffer.readUnsignedShortLE128();
            GameClient.incrementPacketCount();
            IComponentUpdateNode.method2269(interfaceHash, componentID + (interfaceID << 16));
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (connectionType.INCOMMING_PACKET == IncommingPacket.aClass202_2193) {
            Class315.method3834(SubIncommingPacket.aClass206_2354);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (connectionType.INCOMMING_PACKET == IncommingPacket.OBJECT_ANIMATION_PACKET) {
            int animationID = buffer.readInt();
            int typeHash = buffer.readUnsignedByteC();
            int type = typeHash >> 2;
            int rotation = typeHash & 0x3;
            int i_193_ = GameClient.anIntArray8739[type];
            int locationHash = buffer.readIntLE();
            int plane = locationHash >> 28 & 0x3;
            int localX = locationHash >> 14 & 0x3FFF;
            int localY = locationHash & 0x3FFF;
            GameScene gameScene = GameClient.myRegion.getGameScene();
            localX -= -1760580017 * gameScene.gameSceneBaseX;
            localY -= 283514611 * gameScene.gameSceneBaseY;
            StaticMethods.sendObjectAnimation(plane, localX, localY, i_193_, type, rotation, animationID);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (IncommingPacket.PUBLIC_MESSAGE_PACKET == connectionType.INCOMMING_PACKET) {
            int i_198_ = buffer.readUShort();
            Player player;
            if (-442628795 * GameClient.playerIndex == i_198_)
                player = Player.myPlayer;
            else
                player = (GameClient.entities[i_198_]);
            if (null == player) {
                connectionType.INCOMMING_PACKET = null;
                return true;
            }
            int i_199_ = buffer.readUShort();
            int rights = buffer.readUByte();
            boolean bool = 0 != (i_199_ & 0x8000);
            if (null != player.accountName && null != player.appearance) {
                boolean bool_201_ = false;
                if (rights != 2) {
                    if (!bool && (GameClient.aBoolean8811 && !GameClient.aBoolean8812 || GameClient.aBoolean8802))
                        bool_201_ = true;
                    else if (Class287.method2722(player.accountName))
                        bool_201_ = true;
                }
                if (!bool_201_) {
                    int i_202_ = -1;
                    String string;
                    if (bool) {
                        i_199_ &= 0x7fff;
                        Class177 class177 = Class498.method6209(buffer, (byte) 25);
                        i_202_ = -2034569943 * class177.anInt1787;
                        string = (class177.aClass298_Sub37_Sub14_1788.method3459(buffer, -734708119));
                    } else
                        string = StringUtils.decryptStringMessage((Class127_Sub1.huffManDecryption(buffer)));

                    System.out.println("messageType: " + string.trim());
                    player.sendGameMessage(string.trim(), i_199_ >> 8, i_199_ & 0xff, 1232670584);
                    int i_203_;
                    if (rights == 1 || 2 == rights)
                        i_203_ = bool ? 17 : 1;
                    else
                        i_203_ = bool ? 17 : 2;
                    if (rights == 2)
                        PublicMessage.createPublicMessage(i_203_, 0, new StringBuilder().append(StaticMethods.method2368(1)).append(player.getPlayerName(true)).toString(), new StringBuilder().append(StaticMethods.method2368(1)).append(player.getPlayerMessageRights(false)).toString(), player.displayName, string, null, i_202_);
                    else if (rights == 1)
                        PublicMessage.createPublicMessage(i_203_, 0, new StringBuilder().append(StaticMethods.method2368(0)).append(player.getPlayerName(true)).toString(), new StringBuilder().append(StaticMethods.method2368(0)).append(player.getPlayerMessageRights(false)).toString(), player.displayName, string, null, i_202_);
                    else if (rights != 0)
                        PublicMessage.createPublicMessage(i_203_, 0, "<img=" + rights + ">" + player.getPlayerName(true), "<img=" + rights + ">" + player.getPlayerMessageRights(false), player.displayName, string, null, i_202_);
                    else
                        PublicMessage.createPublicMessage(i_203_, 0, player.getPlayerName(true), player.getPlayerMessageRights(false), player.displayName, string, null, i_202_);
                }
            }
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (connectionType.INCOMMING_PACKET == IncommingPacket.aClass202_2298) {
            if (GameClient.fullscreen && GameClient.fullScreenFrame != null)
                Class357.method4276(SettingsManager.settingsManager.screenSize.getValue(), -1, -1, false);
            byte[] is = new byte[connectionType.population * -866602563];
            buffer.method3662(is, 0, -866602563 * connectionType.population, (byte) 1);
            String string = StringUtils.method556(is, 0, (connectionType.population * -866602563), 1174912789);
            String string_204_ = "opensn";
            if (!GameClient.aBoolean8638 || !Class65.method762(string, 1, string_204_))
                Class273.method2559(string, true, SettingsManager.settingsManager.toolkitSetting.getValue() == ToolkitOption.OPENGLSPECIAL, string_204_, GameClient.useJs, GameClient.aBoolean8651, -1865929375);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (connectionType.INCOMMING_PACKET == IncommingPacket.ICOMPONENT_ANIMATION_PACKET) {
            int animationID = buffer.readIntV2();
            int interfaceHash = buffer.readInt();
            GameClient.incrementPacketCount();
            IComponentUpdateNode.setIComponentAnimation(interfaceHash, animationID);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (IncommingPacket.aClass202_2178 == connectionType.INCOMMING_PACKET) {
            StaticMethods.method4908(buffer.readString());
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (connectionType.INCOMMING_PACKET == IncommingPacket.ICOMPONENT_HIDE_PACKET) {
            int componentID = buffer.readIntV2();
            int hidden = buffer.readUByte();
            GameClient.incrementPacketCount();
            IComponentUpdateNode.setIComponentHidden(componentID, hidden);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (connectionType.INCOMMING_PACKET == IncommingPacket.WORLD_LIST_PACKET) {
            boolean bool = buffer.readUByte() == 1;
            byte[] data = new byte[-866602563 * connectionType.population - 1];
            buffer.readBytes(data, 0, -866602563 * connectionType.population - 1);
            ConfigDefinitions.method3979(bool, data);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (connectionType.INCOMMING_PACKET == IncommingPacket.INTERFACE_PACKET) {
            int interfaceID = buffer.readUShort();
            int key1 = buffer.readInt();
            int key2 = buffer.readIntV2();
            int parentHash = buffer.readIntV1();
            int clipped = buffer.readUByte();
            int key4 = buffer.readIntV1();
            int key3 = buffer.readIntV2();
            GameClient.incrementPacketCount();
            Widget.connectComponent(parentHash, new Widget(interfaceID, clipped), new int[]{key1, key2, key3, key4}, false);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (connectionType.INCOMMING_PACKET == IncommingPacket.RUN_SCRIPT_PACKET) {
            String string = buffer.readString();
            Object[] objects = new Object[string.length() + 1];
            for (int i_216_ = string.length() - 1; i_216_ >= 0; i_216_--) {
                if (string.charAt(i_216_) == 's')
                    objects[i_216_ + 1] = buffer.readString();
                else
                    objects[i_216_ + 1] = new Integer(buffer.readInt());
            }
            objects[0] = new Integer(buffer.readInt());
            GameClient.incrementPacketCount();
            ScriptNode scriptNode = new ScriptNode();
            scriptNode.parameters = objects;
            Class444.method5889(scriptNode);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (connectionType.INCOMMING_PACKET == IncommingPacket.SYNCBOT_PANEL_INITIALIZER) {
            System.out.println("lIT");
            GameClient.incrementPacketCount();
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (connectionType.INCOMMING_PACKET == IncommingPacket.SYNCBOT_INFORMATON) {
            String string = buffer.readString();
            System.out.println(string);
            GameClient.incrementPacketCount();
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (IncommingPacket.LOAD_MAP_SCENE_PACKET == connectionType.INCOMMING_PACKET) {
            RsBitsBuffer class298_sub53_sub2_217_ = new RsBitsBuffer(connectionType.population * -866602563);
            System.arraycopy((connectionType.bitsBuffer.buffer), 385051775 * (connectionType.bitsBuffer.offset), class298_sub53_sub2_217_.buffer, 0, -866602563 * connectionType.population);
            StaticMethods.resetCutscene();
            if (SettingsManager.settingsManager.aClass422_Sub21_7580.getValue() == 1)
                Class62.aClass248_612.method2385(new MapLoadBuffer(MapLoad.LOAD_MAP_SCENE_NORMAL, class298_sub53_sub2_217_), 1122139565);
            else
                GameClient.myRegion.sendMapScene(new MapLoadBuffer(MapLoad.LOAD_MAP_SCENE_NORMAL, class298_sub53_sub2_217_));
            connectionType.INCOMMING_PACKET = null;
            return false;
        }
        if (connectionType.INCOMMING_PACKET == IncommingPacket.aClass202_2234) {
            GameClient.anInt8886 = GameClient.anInt8933 * -1469951735;
            boolean myClan = buffer.readUByte() == 1;
            Class152 class152 = new Class152(buffer);
            ClanChannelChat clanManager;
            if (myClan)
                clanManager = ClanChannelChat.clanManager;
            else
                clanManager = StaticMethods.aClanChannelChat_4084;
            class152.method1651(clanManager);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (IncommingPacket.LOBBY_LOGOUT_PACKET == connectionType.INCOMMING_PACKET) {
            StaticMethods.method2001(Class360.aBoolean3912);
            connectionType.INCOMMING_PACKET = null;
            return false;
        }
        if (connectionType.INCOMMING_PACKET == IncommingPacket.ICOMPONENT_CLICKABLE_PACKET) {
            int interfaceHash = buffer.readIntLE();
            boolean clickable = buffer.readUnsigned128Byte() == 1;
            GameClient.incrementPacketCount();
            IComponentUpdateNode.setIComponentClickable(interfaceHash, clickable);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (IncommingPacket.RUN_ENERGY_PACKET == connectionType.INCOMMING_PACKET) {
            GameClient.anInt8844 = buffer.readUByte() * -1985989501;
            GameClient.anInt8888 = GameClient.anInt8933 * 1991119277;
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (connectionType.INCOMMING_PACKET == IncommingPacket.PLAYER_OPTION_PACKET) {
            int slot = buffer.readUnsignedByte128();
            String optionName = buffer.readString();
            int cursor = buffer.readUnsignedShortLE128();
            if (65535 == cursor)
                cursor = -1;
            int onTop = buffer.readUnsignedByteC();
            if (slot >= 1 && slot <= 8) {
                if (optionName.equalsIgnoreCase("null"))
                    optionName = null;
                GameClient.aStringArray8820[slot - 1] = optionName;
                GameClient.anIntArray8904[slot - 1] = cursor;
                GameClient.aBooleanArray8821[slot - 1] = 0 == onTop;
            }
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (connectionType.INCOMMING_PACKET == IncommingPacket.ITEMS_PACKET) {
            int i_222_ = buffer.readUShort();
            int i_223_ = buffer.readUByte();
            boolean bool = (i_223_ & 0x1) == 1;
            Class293.method2823(i_222_, bool, (byte) 106);
            int i_224_ = buffer.readUShort();
            for (int i_225_ = 0; i_225_ < i_224_; i_225_++) {
                int i_226_ = buffer.readUnsignedShortLE128();
                int i_227_ = buffer.readUnsignedByte128();
                if (i_227_ == 255)
                    i_227_ = buffer.readIntV1();
                Class82_Sub8.method896(i_222_, i_225_, i_226_ - 1, i_227_, bool, 1471693915);
            }
            GameClient.anIntArray8823[(GameClient.anInt8873 += 1524000797) * 1610062389 - 1 & 0x1f] = i_222_;
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (IncommingPacket.aClass202_2217 == connectionType.INCOMMING_PACKET) {
            Class313.anObjectArray3298 = new Object[2143828057 * Class99.aClass517_951.capacity];
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (connectionType.INCOMMING_PACKET == IncommingPacket.SET_CAMERA_LOOK_PACKET) {
            int viewLocalY = buffer.readUnsignedByte128();
            int speed1 = buffer.readUByte();
            int viewLocalX = buffer.readUnsignedByteC();
            int speed2 = buffer.readUByte();
            int viewZ = buffer.readUnsignedShort128() << 2;
            GameClient.incrementPacketCount();
            Class173.method1822(viewLocalX, viewLocalY, viewZ, speed1, speed2);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (IncommingPacket.RECEIVE_PRIVATE_QUICK_CHAT_MESSAGE_PACKET == connectionType.INCOMMING_PACKET) {
            boolean bool = buffer.readUByte() == 1;
            String string = buffer.readString();
            String string_233_ = string;
            if (bool)
                string_233_ = buffer.readString();
            long l = (long) buffer.readUShort();
            long l_234_ = (long) buffer.readUTriByte();
            int rights = buffer.readUByte();
            int i_236_ = buffer.readUShort();
            long l_237_ = l_234_ + (l << 32);
            boolean bool_238_ = false;
            while_87_:
            do {
                for (int i_239_ = 0; i_239_ < 100; i_239_++) {
                    if (GameClient.aLongArray8915[i_239_] == l_237_) {
                        bool_238_ = true;
                        break while_87_;
                    }
                }
                if (rights != 2 && Class287.method2722(string_233_))
                    bool_238_ = true;
            } while (false);
            if (!bool_238_) {
                GameClient.aLongArray8915[GameClient.anInt8916 * 1594173071] = l_237_;
                GameClient.anInt8916 = 1356544111 * ((1594173071 * GameClient.anInt8916 + 1) % 100);
                String string_240_ = StaticMethods.aClass469_5618.method6045(i_236_).method3459(buffer, -734708119);
                if (2 == rights)
                    PublicMessage.createPublicMessage(18, 0, new StringBuilder().append(StaticMethods.method2368(1)).append(string).toString(), new StringBuilder().append(StaticMethods.method2368(1)).append(string_233_).toString(), string, string_240_, null, i_236_);
                else if (rights == 1)
                    PublicMessage.createPublicMessage(18, 0, new StringBuilder().append(StaticMethods.method2368(0)).append(string).toString(), new StringBuilder().append(StaticMethods.method2368(0)).append(string_233_).toString(), string, string_240_, null, i_236_);
                else if (rights != 0)
                    PublicMessage.createPublicMessage(18, 0, "<img=" + rights + ">" + string, "<img=" + rights + ">" + string_233_, string, string_240_, null, i_236_);
                else
                    PublicMessage.createPublicMessage(18, 0, string, string_233_, string, string_240_, null, i_236_);
            }
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (IncommingPacket.aClass202_2259 == connectionType.INCOMMING_PACKET) {
            int i_241_ = buffer.readIntV2();
            if (-821031539 * StaticMethods.anInt4128 != i_241_) {
                StaticMethods.anInt4128 = -1704395451 * i_241_;
                ToMoveScripts.method1405(CS2Context.aClass502_6723, -1, -1);
            }
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (connectionType.INCOMMING_PACKET == IncommingPacket.aClass202_2293) {
            int index = buffer.readUShort();
            byte value = buffer.readByte();
            if (null == Class313.anObjectArray3298)
                Class313.anObjectArray3298 = (new Object[2143828057 * Class99.aClass517_951.capacity]);
            Class313.anObjectArray3298[index] = new Integer(value);
            GameClient.anIntArray8880[((GameClient.anInt8881 += -1965237945) * -1653538697) - 1 & 0x1F] = index;
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (IncommingPacket.aClass202_2249 == connectionType.INCOMMING_PACKET) {
            int fromSlot = buffer.readUnsignedShort128();
            if (65535 == fromSlot)
                fromSlot = -1;
            int i_245_ = buffer.readUnsignedShort128();
            int interfaceHash = buffer.readIntLE();
            int i_247_ = buffer.readUnsignedShort128();
            if (65535 == i_247_)
                i_247_ = -1;
            GameClient.incrementPacketCount();
            for (int i_248_ = fromSlot; i_248_ <= i_247_; i_248_++) {
                long l = (long) i_248_ + ((long) interfaceHash << 32);
                IComponentSettings IComponentSettings = (IComponentSettings) GameClient.aClass437_8896.get(l);
                IComponentSettings IComponentSettings_249_;
                if (IComponentSettings == null) {
                    if (i_248_ == -1)
                        IComponentSettings_249_ = new IComponentSettings(((IComponentDefinition.getInterfaceComponent(interfaceHash).activeProperties.settings) * -1266165749), i_245_);
                    else
                        IComponentSettings_249_ = new IComponentSettings(0, i_245_);
                } else {
                    IComponentSettings_249_ = new IComponentSettings((-1266165749 * IComponentSettings.settings), i_245_);
                    IComponentSettings.unlink();
                }
                GameClient.aClass437_8896.connect(IComponentSettings_249_, l);
            }
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (IncommingPacket.aClass202_2276 == connectionType.INCOMMING_PACKET) {
            Class162.baseTileX = (buffer.readByteC() << 3) * 1536927433;
            GameMap.basePlane = buffer.readUByte() * -1217120325;
            Class216.baseTileY = ((buffer.readByteC() << 3) * 2091861441);
            while (385051775 * buffer.offset < connectionType.population * -866602563) {
                SubIncommingPacket class206 = (Class309_Sub1.method3807((byte) -52)[buffer.readUByte()]);
                Class315.method3834(class206);
            }
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (connectionType.INCOMMING_PACKET == IncommingPacket.aClass202_2248) {
            int i_250_ = buffer.readUByte();
            Class428 class428 = ((Class428) StaticMethods.method5701(Class440.method5861(-810032943), i_250_));
            if (class428 == null)
                class428 = Class428.aClass428_6619;
            Class386.method4721(class428, (byte) -10);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (IncommingPacket.MUSIC_PACKET == connectionType.INCOMMING_PACKET) {
            int i_251_ = buffer.readUByte();
            int i_252_ = buffer.readUnsignedShortLE128();
            if (i_252_ == 65535)
                i_252_ = -1;
            int i_253_ = buffer.readUnsignedByte128();
            StaticMethods.method967(i_252_, i_253_, i_251_);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (IncommingPacket.SHAKE_CAMERA_PACKET == connectionType.INCOMMING_PACKET) {
            int i_254_ = buffer.readUnsignedByte128();
            int slotId = buffer.readUnsignedByte128();
            int i_256_ = buffer.readUnsignedByte128();
            int i_257_ = buffer.readUnsignedByte128();
            int i_258_ = buffer.readUnsignedShortLE();
            GameClient.incrementPacketCount();
            GameClient.enabledCameraShakeSlots[slotId] = true;
            GameClient.anIntArray8860[slotId] = i_257_;
            GameClient.cameraShakeDistance[slotId] = i_256_;
            GameClient.anIntArray8926[slotId] = i_254_;
            GameClient.anIntArray8790[slotId] = i_258_;
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (IncommingPacket.aClass202_2195 == connectionType.INCOMMING_PACKET) {
            int i_259_ = buffer.readUByte();
            Class413 class413 = ((Class413) StaticMethods.method5701(SoftCache.method4196(), i_259_));
            if (class413 == null)
                class413 = Class413.aClass413_6587;
            Class298_Sub30.method3113(class413, (byte) -102);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (IncommingPacket.RECEIVE_FRIEND_CHAT_QUICK_MESSAGE_PACKET == connectionType.INCOMMING_PACKET) {
            boolean bool = buffer.readUByte() == 1;
            String string = buffer.readString();
            String string_260_ = string;
            if (bool)
                string_260_ = buffer.readString();
            long l = buffer.readLong();
            long l_261_ = (long) buffer.readUShort();
            long l_262_ = (long) buffer.readUTriByte();
            int rights = buffer.readUByte();
            int i_264_ = buffer.readUShort();
            long l_265_ = (l_261_ << 32) + l_262_;
            boolean bool_266_ = false;
            while_88_:
            do {
                for (int i_267_ = 0; i_267_ < 100; i_267_++) {
                    if (l_265_ == GameClient.aLongArray8915[i_267_]) {
                        bool_266_ = true;
                        break while_88_;
                    }
                }
                if (rights != 2 && Class287.method2722(string_260_))
                    bool_266_ = true;
            } while (false);
            if (!bool_266_) {
                GameClient.aLongArray8915[1594173071 * GameClient.anInt8916] = l_265_;
                GameClient.anInt8916 = ((GameClient.anInt8916 * 1594173071 + 1) % 100 * 1356544111);
                String string_268_ = StaticMethods.aClass469_5618.method6045(i_264_).method3459(buffer, -734708119);
                if (2 == rights)
                    PublicMessage.createPublicMessage(20, 0, new StringBuilder().append(StaticMethods.method2368(1)).append(string).toString(), new StringBuilder().append(StaticMethods.method2368(1)).append(string_260_).toString(), string, string_268_, Class404.method4952(l), i_264_);
                else if (rights == 1)
                    PublicMessage.createPublicMessage(20, 0, new StringBuilder().append(StaticMethods.method2368(0)).append(string).toString(), new StringBuilder().append(StaticMethods.method2368(0)).append(string_260_).toString(), string, string_268_, Class404.method4952(l), i_264_);
                else if (rights != 0)
                    PublicMessage.createPublicMessage(20, 0, "<img=" + rights + ">" + string, "<img=" + rights + ">" + string_260_, string, string_268_, Class404.method4952(l), i_264_);
                else
                    PublicMessage.createPublicMessage(20, 0, string, string_260_, string, string_268_, Class404.method4952(l), i_264_);
            }
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (connectionType.INCOMMING_PACKET == IncommingPacket.aClass202_2242) {
            boolean bool = buffer.readUByte() == 1;
            GameClient.incrementPacketCount();
            StaticMethods.aBoolean5196 = bool;
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (connectionType.INCOMMING_PACKET == IncommingPacket.FRIENDS_PACKET) {
            while (buffer.offset * 385051775 < connectionType.population * -866602563) {
                boolean bool = buffer.readUByte() == 1;
                String string = buffer.readString();
                String string_269_ = buffer.readString();
                int i_270_ = buffer.readUShort();
                int i_271_ = buffer.readUByte();
                boolean bool_272_ = buffer.readUByte() == 1;
                String string_273_ = "";
                boolean bool_274_ = false;
                if (i_270_ > 0) {
                    string_273_ = buffer.readString();
                    bool_274_ = buffer.readUByte() == 1;
                }
                for (int i_275_ = 0; i_275_ < GameClient.anInt8941 * -1054937867; i_275_++) {
                    if (!bool) {
                        if (string.equals(GameClient.playerAccountNames[i_275_])) {
                            if (GameClient.anIntArray8946[i_275_] != i_270_) {
                                boolean bool_276_ = true;
                                for (Class302_Sub2 class302_sub2 = ((Class302_Sub2) GameClient.aClass442_8951.method5868()); null != class302_sub2; class302_sub2 = ((Class302_Sub2) GameClient.aClass442_8951.method5872())) {
                                    if (class302_sub2.aString7648.equals(string)) {
                                        if (i_270_ != 0 && (class302_sub2.aShort7646 == 0)) {
                                            class302_sub2.unlink();
                                            bool_276_ = false;
                                        } else if (i_270_ == 0 && (0 != (class302_sub2.aShort7646))) {
                                            class302_sub2.unlink();
                                            bool_276_ = false;
                                        }
                                    }
                                }
                                if (bool_276_)
                                    GameClient.aClass442_8951.method5870(new Class302_Sub2(string, i_270_), 1940667363);
                                GameClient.anIntArray8946[i_275_] = i_270_;
                            }
                            GameClient.aStringArray8945[i_275_] = string_269_;
                            GameClient.aStringArray8947[i_275_] = string_273_;
                            GameClient.anIntArray8705[i_275_] = i_271_;
                            GameClient.aBooleanArray8722[i_275_] = bool_274_;
                            GameClient.aBooleanArray8950[i_275_] = bool_272_;
                            string = null;
                            break;
                        }
                    } else if (string_269_.equals(GameClient.playerAccountNames[i_275_])) {
                        GameClient.playerAccountNames[i_275_] = string;
                        GameClient.aStringArray8945[i_275_] = string_269_;
                        string = null;
                        break;
                    }
                }
                if (string != null && GameClient.anInt8941 * -1054937867 < 200) {
                    GameClient.playerAccountNames[-1054937867 * GameClient.anInt8941] = string;
                    GameClient.aStringArray8945[-1054937867 * GameClient.anInt8941] = string_269_;
                    GameClient.anIntArray8946[-1054937867 * GameClient.anInt8941] = i_270_;
                    GameClient.aStringArray8947[GameClient.anInt8941 * -1054937867] = string_273_;
                    GameClient.anIntArray8705[-1054937867 * GameClient.anInt8941] = i_271_;
                    GameClient.aBooleanArray8722[(-1054937867 * GameClient.anInt8941)] = bool_274_;
                    GameClient.aBooleanArray8950[(GameClient.anInt8941 * -1054937867)] = bool_272_;
                    GameClient.anInt8941 += 560029533;
                }
            }
            GameClient.anInt8942 = 1353701786;
            GameClient.anInt8883 = 754377557 * GameClient.anInt8933;
            boolean bool = false;
            int i_277_ = -1054937867 * GameClient.anInt8941;
            while_89_:
            do {
                do {
                    if (i_277_ <= 0)
                        break while_89_;
                    bool = true;
                    i_277_--;
                    for (int i_278_ = 0; i_278_ < i_277_; i_278_++) {
                        boolean bool_279_ = false;
                        if ((Class474.activeConnectionInfo.worldID * 1606920449 != GameClient.anIntArray8946[i_278_]) && ((1606920449 * Class474.activeConnectionInfo.worldID) == GameClient.anIntArray8946[i_278_ + 1]))
                            bool_279_ = true;
                        if (!bool_279_ && GameClient.anIntArray8946[i_278_] == 0 && GameClient.anIntArray8946[i_278_ + 1] != 0)
                            bool_279_ = true;
                        if (!bool_279_ && !GameClient.aBooleanArray8950[i_278_] && GameClient.aBooleanArray8950[1 + i_278_])
                            bool_279_ = true;
                        if (bool_279_) {
                            int i_280_ = GameClient.anIntArray8946[i_278_];
                            GameClient.anIntArray8946[i_278_] = GameClient.anIntArray8946[i_278_ + 1];
                            GameClient.anIntArray8946[1 + i_278_] = i_280_;
                            String string = GameClient.aStringArray8947[i_278_];
                            GameClient.aStringArray8947[i_278_] = GameClient.aStringArray8947[i_278_ + 1];
                            GameClient.aStringArray8947[1 + i_278_] = string;
                            String string_281_ = GameClient.playerAccountNames[i_278_];
                            GameClient.playerAccountNames[i_278_] = GameClient.playerAccountNames[i_278_ + 1];
                            GameClient.playerAccountNames[1 + i_278_] = string_281_;
                            String string_282_ = GameClient.aStringArray8945[i_278_];
                            GameClient.aStringArray8945[i_278_] = GameClient.aStringArray8945[1 + i_278_];
                            GameClient.aStringArray8945[1 + i_278_] = string_282_;
                            int i_283_ = GameClient.anIntArray8705[i_278_];
                            GameClient.anIntArray8705[i_278_] = GameClient.anIntArray8705[i_278_ + 1];
                            GameClient.anIntArray8705[1 + i_278_] = i_283_;
                            boolean bool_284_ = GameClient.aBooleanArray8722[i_278_];
                            GameClient.aBooleanArray8722[i_278_] = GameClient.aBooleanArray8722[i_278_ + 1];
                            GameClient.aBooleanArray8722[1 + i_278_] = bool_284_;
                            boolean bool_285_ = GameClient.aBooleanArray8950[i_278_];
                            GameClient.aBooleanArray8950[i_278_] = GameClient.aBooleanArray8950[1 + i_278_];
                            GameClient.aBooleanArray8950[1 + i_278_] = bool_285_;
                            bool = false;
                        }
                    }
                } while (!bool);
            } while (false);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (connectionType.INCOMMING_PACKET == IncommingPacket.aClass202_2283) {
            GameClient.anInt8885 = 887090299 * GameClient.anInt8933;
            boolean bool = buffer.readUByte() == 1;
            if (-866602563 * connectionType.population == 1) {
                if (bool)
                    Class225.aClass162_2512 = null;
                else
                    Class508.aClass162_6216 = null;
                connectionType.INCOMMING_PACKET = null;
                return true;
            }
            if (bool)
                Class225.aClass162_2512 = new Class162(buffer);
            else
                Class508.aClass162_6216 = new Class162(buffer);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (IncommingPacket.SPAWN_OBJECT_PACKET == connectionType.INCOMMING_PACKET) {
            Class315.method3834(SubIncommingPacket.SPAWN_OBJECT_PACKET);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (connectionType.INCOMMING_PACKET == IncommingPacket.SET_CAMERA_POS_PACKET) {
            int speed2 = buffer.readUnsignedByte128();
            int speed1 = buffer.readUnsignedByte128();
            int moveLocalY = buffer.readUByte();
            int moveZ = buffer.readUShort() << 2;
            int moveLocalX = buffer.readUByte();
            GameClient.incrementPacketCount();
            Class97_Sub1.moveCamera(moveLocalX, moveLocalY, moveZ, speed2, speed1, true);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (IncommingPacket.aClass202_2228 == connectionType.INCOMMING_PACKET) {
            if (-1 != GameClient.WINDOW_PANE_ID * -257444687)
                IComponentDefinition.method903(GameClient.WINDOW_PANE_ID * -257444687, 0);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (IncommingPacket.aClass202_2198 == connectionType.INCOMMING_PACKET) {
            int i_291_ = buffer.readUShort();
            long l = buffer.readLong();
            if (null == Class313.anObjectArray3298)
                Class313.anObjectArray3298 = (new Object[Class99.aClass517_951.capacity * 2143828057]);
            Class313.anObjectArray3298[i_291_] = new Long(l);
            GameClient.anIntArray8880[((GameClient.anInt8881 += -1965237945) * -1653538697) - 1 & 0x1f] = i_291_;
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (IncommingPacket.OPEN_INTERFACE_NPC == connectionType.INCOMMING_PACKET) {
            int key1 = buffer.readIntV2();
            int npcIndex = buffer.readUnsignedShortLE128();
            int clipped = buffer.readUnsignedByte128();
            int key4 = buffer.readInt();
            int interfaceID = buffer.readUnsignedShortLE128();
            int key3 = buffer.readIntLE();
            int key2 = buffer.readIntV2();
            int parentHash = buffer.readIntV1();
            GameClient.incrementPacketCount();
            Widget.connectComponent(parentHash, new NPCWidget(interfaceID, clipped, npcIndex), new int[]{key1, key2, key3, key4}, false);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (connectionType.INCOMMING_PACKET == IncommingPacket.aClass202_2239) {
            GameClient.anInt8913 = buffer.readUnsigned128Byte() * -1777248765;
            GameClient.anInt8837 = buffer.readUByte() * 1583527743;
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (IncommingPacket.aClass202_2267 == connectionType.INCOMMING_PACKET) {
            int i_300_ = buffer.readUnsignedShortLE();
            int interfaceHash = buffer.readIntV1();
            int i_302_ = buffer.readInt();
            GameClient.incrementPacketCount();
            IComponentUpdateNode.setModelOnIComponent(interfaceHash, 5, i_300_, i_302_);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (IncommingPacket.CAMERA_ROTATION_PACKET == connectionType.INCOMMING_PACKET) {
            int yaw = buffer.readUShort();
            int pitch = buffer.readUnsignedShortLE();
            GameClient.incrementPacketCount();
            StaticMethods.setMiddleMouseCameraRotation(pitch, yaw, 0);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (connectionType.INCOMMING_PACKET == IncommingPacket.SEND_PRIVATE_MESSAGE_PACKET) {
            String string = buffer.readString();
            String string_305_ = (StringUtils.decryptStringMessage(Class127_Sub1.huffManDecryption(buffer)));
            PublicMessage.sendPublicMessage(6, 0, string, string, string, string_305_);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (IncommingPacket.aClass202_2299 == connectionType.INCOMMING_PACKET) {
            int i_306_ = buffer.readUnsignedByte128();
            byte i_307_ = buffer.readByteC();
            GameClient.incrementPacketCount();
            Class239.method2207(i_307_, i_306_, (byte) 59);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (connectionType.INCOMMING_PACKET == IncommingPacket.GLOBAL_CONFIG_INTVAL_PACKET) {
            int configID = buffer.readUnsignedShort128();
            int value = buffer.readInt();
            GameClient.incrementPacketCount();
            IComponentUpdateNode.setIComponentGlobalConfig(configID, value);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (IncommingPacket.aClass202_2201 == connectionType.INCOMMING_PACKET) {
            int i_310_ = buffer.readUnsignedShort128();
            GameClient.incrementPacketCount();
            Class285.method2710(i_310_);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (IncommingPacket.CONFIG_BY_FILE1_PACKET == connectionType.INCOMMING_PACKET) {
            int i_311_ = buffer.readUnsignedShort128();
            int i_312_ = buffer.readUnsignedByteC();
            Class128.playerVarsProvider.setConfigByFileValue(i_311_, i_312_);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (connectionType.INCOMMING_PACKET == IncommingPacket.aClass202_2185) {
            for (int i_313_ = 0; (i_313_ < GameClient.entities.length); i_313_++) {
                if (GameClient.entities[i_313_] != null) {
                    GameClient.entities[i_313_].anIntArray10093 = null;
                    GameClient.entities[i_313_].animator.load(-1);
                }
            }
            for (int i_314_ = 0; i_314_ < GameClient.anInt8772 * 1962237353; i_314_++) {
                ((Entity) GameClient.aClass298_Sub29Array8816[i_314_].nodeObject).anIntArray10093 = null;
                ((Entity) GameClient.aClass298_Sub29Array8816[i_314_].nodeObject).animator.load(-1);
            }
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (connectionType.INCOMMING_PACKET == IncommingPacket.aClass202_2251) {
            int interfaceHash1 = buffer.readInt();
            int interfaceHash2 = buffer.readInt();
            GameClient.incrementPacketCount();
            Widget widget1 = ((Widget) GameClient.linkedList.get((long) interfaceHash1));
            Widget widget2 = ((Widget) GameClient.linkedList.get((long) interfaceHash2));
            if (widget2 != null)
                Widget.closeInterface(widget2, (widget1 == null || ((widget2.interfaceID * -1617025021) != (-1617025021 * widget1.interfaceID))), false);
            if (widget1 != null) {
                widget1.unlink();
                GameClient.linkedList.connect(widget1, (long) interfaceHash2);
            }
            IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceHash1);
            if (componentDefinition != null)
                StaticMethods.updateComponentTick(componentDefinition);
            componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceHash2);
            if (componentDefinition != null) {
                StaticMethods.updateComponentTick(componentDefinition);
                Class65.method761((IComponentDefinition.getIComponentDefinitionCollections[(componentDefinition.interfaceHash >>> 16)]), componentDefinition, true);
            }
            if (GameClient.WINDOW_PANE_ID * -257444687 != -1)
                IComponentDefinition.method903(GameClient.WINDOW_PANE_ID * -257444687, 1);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (connectionType.INCOMMING_PACKET == IncommingPacket.TILE_MESSAGE_PACKET) {
            Class315.method3834(SubIncommingPacket.TILE_MESSAGE_PACKET);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (IncommingPacket.MUSIC_EFFECT_PACKET == connectionType.INCOMMING_PACKET) {
            int i_318_ = buffer.readUnsigned128Byte();
            int i_319_ = buffer.read24BitUnsignedIntegerV2();
            int i_320_ = buffer.readUShort();
            if (i_320_ == 65535)
                i_320_ = -1;
            System.out.println("called: " + i_318_ + ", " + i_319_ + ", " + i_320_);
            Class136.method1495(i_320_, i_319_, i_318_, -649427988);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (connectionType.INCOMMING_PACKET == IncommingPacket.GAME_PANE_PACKET) {
            int type = buffer.readUnsigned128Byte();
            int windowID = buffer.readUnsignedShort128();
            int secondXteaKey = buffer.readIntLE();
            int firstXteaKey = buffer.readIntV2();
            int fourthXteaKey = buffer.readInt();
            int thirdXteaKey = buffer.readInt();
            GameClient.incrementPacketCount();
            if (2 == type)
                Class365_Sub1_Sub2_Sub1.method4499((byte) 84);
            int[] keySet = {firstXteaKey, secondXteaKey, thirdXteaKey, fourthXteaKey};
            GameClient.WINDOW_PANE_ID = 1785861201 * windowID;
            StaticMethods.method321(windowID, keySet);
            Class257.method2453(false, (byte) 8);
            Class14.method341(GameClient.WINDOW_PANE_ID * -257444687, keySet);
            for (int i_327_ = 0; i_327_ < 113; i_327_++)
                GameClient.aBooleanArray8900[i_327_] = true;
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (connectionType.INCOMMING_PACKET == IncommingPacket.aClass202_2176) {
            int i_328_ = buffer.readUShort();
            if (65535 == i_328_)
                i_328_ = -1;
            int i_329_ = buffer.readUByte();
            int i_330_ = buffer.readUShort();
            int i_331_ = buffer.readUByte();
            int i_332_ = buffer.readUShort();
            Class239.method2210(i_328_, i_329_, i_330_, i_331_, i_332_);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (connectionType.INCOMMING_PACKET == IncommingPacket.ITEMS_UPDATE_PACKET) {
            int key = buffer.readUShort();
            int keyCheck = buffer.readUByte();
            boolean negativekeyCheck = (keyCheck & 0x1) == 1;
            while (385051775 * buffer.offset < connectionType.population * -866602563) {
                int slotId = buffer.readUnsignedSmart();
                int id = buffer.readUShort();
                int i_337_ = 0;
                if (0 != id) {
                    i_337_ = buffer.readUByte();
                    if (255 == i_337_)
                        i_337_ = buffer.readInt();
                }
                Class82_Sub8.method896(key, slotId, id - 1, i_337_, negativekeyCheck, -540593777);
            }
            GameClient.anIntArray8823[(GameClient.anInt8873 += 1524000797) * 1610062389 - 1 & 0x1f] = key;
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (connectionType.INCOMMING_PACKET == IncommingPacket.ICOMPONENT_COLOR_PACKET) {
            int colorID = buffer.readUnsignedShort128();
            int interfaceHash = buffer.readIntV2();
            GameClient.incrementPacketCount();
            IComponentUpdateNode.setIComponentColor(interfaceHash, colorID);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (IncommingPacket.GLOBAL_CONFIG_BYTEVAL_PACKET == connectionType.INCOMMING_PACKET) {
            byte value = buffer.readByteC();
            int configID = buffer.readUnsignedShort128();
            GameClient.incrementPacketCount();
            IComponentUpdateNode.setIComponentGlobalConfig(configID, value);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (IncommingPacket.aClass202_2250 == connectionType.INCOMMING_PACKET) {
            int interfaceHash = buffer.readInt();
            GameClient.incrementPacketCount();
            IComponentUpdateNode.setModelOnIComponent(interfaceHash, 5, GameClient.playerIndex * -442628795, 0);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (connectionType.INCOMMING_PACKET == IncommingPacket.PLAYER_UNDER_NPC_PRIORITY_PACKET) {
            int priority = buffer.readUnsignedByteC();
            GameClient.incrementPacketCount();
            GameClient.fightPriority = priority * -1149402483;
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (connectionType.INCOMMING_PACKET == IncommingPacket.ICOMPONENT_ITEM_MODEL_ROTATION_PACKET) {
            int interfaceHash = buffer.readIntLE();
            int secondaryRotation = buffer.readUnsignedShort128();
            int modelZoom = buffer.readUnsignedShort128();
            int primaryRotation = buffer.readUnsignedShortLE();
            GameClient.incrementPacketCount();
            IComponentUpdateNode.setItemModelRotation(interfaceHash, primaryRotation, secondaryRotation, modelZoom);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (IncommingPacket.aClass202_2290 == connectionType.INCOMMING_PACKET) {
            int graphicID = buffer.readUnsignedShortLE128();
            int senderIndex = buffer.readShort();
            int initialDisplacement = buffer.readUnsignedShort128();
            int i_351_ = buffer.readByteC();
            int verticalPitch = buffer.readUnsignedByte128();
            if (verticalPitch == 255)
                verticalPitch = -1;
            int targetIndex = buffer.method3651();
            int i_354_ = buffer.readUShort();
            int i_355_ = buffer.readUnsigned128Byte() * 4;
            int i_356_ = buffer.readUByte();
            int i_357_ = buffer.readUnsignedShort128();
            int initialHeight = buffer.readUnsigned128Byte();
            int endTickOffset = buffer.readUnsignedShort128();
            int startTickOffset = buffer.readUShort();
            int i_361_ = buffer.readByteC();
            boolean bool = 0 != (i_356_ & 0x1);
            boolean bool_362_ = (i_356_ & 0x2) != 0;
            int slot = bool_362_ ? i_356_ >> 2 : -1;
            if (bool_362_)
                initialHeight = (byte) initialHeight;
            else
                initialHeight *= 4;
            GameScene gameScene = GameClient.myRegion.getGameScene();
            int worldX = i_354_ - gameScene.gameSceneBaseX * 773807262;
            int worldY = i_357_ - 567029222 * gameScene.gameSceneBaseY;
            i_351_ += worldX;
            i_361_ += worldY;
            if (worldX >= 0 && worldY >= 0 && (worldX < GameClient.myRegion.getMapWidth() * 2) && (worldY < GameClient.myRegion.getMapWidth() * 2) && i_351_ >= 0 && i_361_ >= 0 && (i_351_ < GameClient.myRegion.getMapLength() * 2) && (i_361_ < GameClient.myRegion.getMapLength() * 2) && 65535 != graphicID) {
                worldX *= 256;
                worldY *= 256;
                i_351_ = 256 * i_351_;
                i_361_ = 256 * i_361_;
                initialHeight <<= 2;
                i_355_ <<= 2;
                initialDisplacement <<= 2;
                StaticMethods.method5818(graphicID, senderIndex, targetIndex, slot, initialHeight, i_355_, worldX, worldY, i_351_, i_361_, startTickOffset, endTickOffset, verticalPitch, initialDisplacement, bool);
            }
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (IncommingPacket.RESET_SOUNDS_PACKET == connectionType.INCOMMING_PACKET) {
            StaticMethods.resetSounds();
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (IncommingPacket.RECEIVE_PERSONAL_MESSAGE_PACKET == connectionType.INCOMMING_PACKET) {
            boolean bool = buffer.readUByte() == 1;
            String string = buffer.readString();
            String string_366_ = string;
            if (bool)
                string_366_ = buffer.readString();
            int rights = buffer.readUByte();
            boolean bool_368_ = false;
            if (rights != 2) {
                if (GameClient.aBoolean8811 && !GameClient.aBoolean8812 || GameClient.aBoolean8802)
                    bool_368_ = true;
                else if (rights != 2 && Class287.method2722(string_366_))
                    bool_368_ = true;
            }
            if (!bool_368_) {
                String string_369_ = (StringUtils.decryptStringMessage(Class127_Sub1.huffManDecryption(buffer)));
                if (2 == rights)
                    PublicMessage.createPublicMessage(24, 0, new StringBuilder().append(StaticMethods.method2368(1)).append(string).toString(), new StringBuilder().append(StaticMethods.method2368(1)).append(string_366_).toString(), string, string_369_, null, -1);
                else if (rights == 1)
                    PublicMessage.createPublicMessage(24, 0, new StringBuilder().append(StaticMethods.method2368(0)).append(string).toString(), new StringBuilder().append(StaticMethods.method2368(0)).append(string_366_).toString(), string, string_369_, null, -1);
                else if (rights != 0)
                    PublicMessage.createPublicMessage(24, 0, "<img=" + rights + ">" + string, "<img=" + rights + ">" + string_366_, string, string_369_, null, -1);
                else
                    PublicMessage.createPublicMessage(24, 0, string, string_366_, string, string_369_, null, -1);
            }
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (IncommingPacket.NPC_UPDATE_PACKET == connectionType.INCOMMING_PACKET) {
            Class406.decodeNPCUpdate(false, -1542019143);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (connectionType.INCOMMING_PACKET == IncommingPacket.ICOMPONENT_FONTID_PACKET) {
            int fontID = buffer.readIntV2();
            int interfaceHash = buffer.readIntV1();
            GameClient.incrementPacketCount();
            IComponentUpdateNode.setIComponentFontID(interfaceHash, fontID);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (connectionType.INCOMMING_PACKET == IncommingPacket.aClass202_2168) {
            // Probably some chat packet?
            GameClient.anInt8942 = -1470632755;
            GameClient.anInt8883 = GameClient.anInt8933 * 754377557;
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (connectionType.INCOMMING_PACKET == IncommingPacket.LOGOUT_PACKET) {
            StaticMethods.method2001(false);
            connectionType.INCOMMING_PACKET = null;
            return false;
        }
        if (IncommingPacket.aClass202_2179 == connectionType.INCOMMING_PACKET) {
            int i_372_ = buffer.readUnsignedShortLE();
            int i_373_ = buffer.readIntV1();
            int i_374_ = buffer.readUnsignedShortLE128();
            int i_375_ = buffer.readUByte();
            GameClient.incrementPacketCount();
            IComponentUpdateNode.method2198(i_373_, i_375_, i_372_, i_374_);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (IncommingPacket.aClass202_2297 == connectionType.INCOMMING_PACKET) {
            GameClient.aBoolean8815 = buffer.readUnsignedByteC() == 1;
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (IncommingPacket.aClass202_2221 == connectionType.INCOMMING_PACKET) {
            int i_376_ = buffer.readUShort();
            int i_377_ = buffer.readIntV2();
            int i_378_ = buffer.readUnsignedShortLE();
            int i_379_ = buffer.readUnsignedByte128();
            GameClient.incrementPacketCount();
            IComponentUpdateNode.method935(i_377_, i_379_, i_378_, i_376_);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (IncommingPacket.SEND_GROUND_ITEM_PACKET == connectionType.INCOMMING_PACKET) {
            Class315.method3834(SubIncommingPacket.SEND_GROUND_ITEM_PACKET);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (IncommingPacket.CUTSCENE_PACKET == connectionType.INCOMMING_PACKET) {
            int cutsceneID = buffer.readUShort();
            GameClient.anInt8726 = 733205975;
            GameClient.cutsceneID = 221729505 * cutsceneID;
            GameClient.anInt8724 = 986798515;
            Js5List.JS5_CUTSCENES.exists(577335585 * GameClient.cutsceneID);
            Class194.closeMenus();
            StaticMethods.closeMenus();
            int xteaLength = buffer.readUShort();
            StaticMethods.cutsceneXTEAS = new int[xteaLength][4];
            for (int count = 0; count < xteaLength; count++) {
                for (int index = 0; index < 4; index++)
                    StaticMethods.cutsceneXTEAS[count][index] = buffer.readInt();
            }
            int appearenceLength = buffer.readUByte();
            Class128_Sub1.playerAppearence = new Buffer(appearenceLength);
            Class128_Sub1.playerAppearence.writeBytes(buffer.buffer, 385051775 * buffer.offset, appearenceLength);
            buffer.offset += appearenceLength * 116413311;
            connectionType.INCOMMING_PACKET = null;
            return false;
        }
        if (connectionType.INCOMMING_PACKET == IncommingPacket.DESTROY_OBJECT_PACKET) {
            Class315.method3834(SubIncommingPacket.DESTROY_OBJECT_PACKET);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (IncommingPacket.aClass202_2203 == connectionType.INCOMMING_PACKET) {
            int index = buffer.readUByte();
            if (buffer.readUByte() == 0)
                GameClient.stockMarketListing[index] = new StockMarketListing();
            else {
                buffer.offset -= 116413311;
                GameClient.stockMarketListing[index] = new StockMarketListing(buffer);
            }
            GameClient.anInt8796 = GameClient.anInt8933 * 1729482221;
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (connectionType.INCOMMING_PACKET == IncommingPacket.ITEM_ON_ICOMPONENT_PACKET) {
            int itemID = buffer.readUnsignedShort128();
            if (65535 == itemID)
                itemID = -1;
            int amount = buffer.readIntV1();
            int interfaceHash = buffer.readIntV2();
            GameClient.incrementPacketCount();
            IComponentUpdateNode.setItemOnIComponent(interfaceHash, itemID, amount);
            ItemDefinition itemDefinition = Js5Configs.itemList.getItemDefinitions(itemID);
            IComponentUpdateNode.setItemModelRotation(interfaceHash, 330519029 * itemDefinition.primaryModelRotation, -3355859 * itemDefinition.secondaryModelRotation, itemDefinition.secondaryModelZoom * 1396167403);
            IComponentUpdateNode.setItemModelOffset(interfaceHash, 252709809 * itemDefinition.primaryModelOffset, -1811316489 * itemDefinition.secondaryModelOffset, itemDefinition.primaryModelZoom * -1368639199);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (IncommingPacket.ICOMPONENT_SCROLL_PACKET == connectionType.INCOMMING_PACKET) {
            int interfaceHash = buffer.readIntLE();
            int scrollSize = buffer.readUnsignedShortLE128();
            GameClient.incrementPacketCount();
            IComponentUpdateNode.setIComponentScroll(interfaceHash, scrollSize);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (IncommingPacket.aClass202_2231 == connectionType.INCOMMING_PACKET) {
            Class315.method3834(SubIncommingPacket.aClass206_2346);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (IncommingPacket.aClass202_2284 == connectionType.INCOMMING_PACKET) {
            Class315.method3834(SubIncommingPacket.aClass206_2357);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (connectionType.INCOMMING_PACKET == IncommingPacket.ICOMPONENT_SPRITE_PAKCET) {
            int spriteID = buffer.readInt();
            int interfaceHash = buffer.readIntV2();
            GameClient.incrementPacketCount();
            IComponentUpdateNode.setIComponentGraphicID(interfaceHash, spriteID);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (connectionType.INCOMMING_PACKET == IncommingPacket.CLIENT_CONSOLE_COMMAND_PACKET) {
            String string = buffer.readString();
            Class419.executeCommand(string, false, false);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (IncommingPacket.ICOMPONENT_TEXT_PACKET == connectionType.INCOMMING_PACKET) {
            String string = buffer.readString();
            int i_393_ = buffer.readInt();
            GameClient.incrementPacketCount();
            IComponentUpdateNode.setIComponentText(i_393_, string);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (connectionType.INCOMMING_PACKET == IncommingPacket.RECEIVE_QUICK_PRIVATE_MESSAGE) {
            boolean bool = buffer.readUByte() == 1;
            String string = buffer.readString();
            long l = (long) buffer.readUShort();
            long l_394_ = (long) buffer.readUTriByte();
            int rights = buffer.readUByte();
            int i_396_ = buffer.readUShort();
            long l_397_ = (l << 32) + l_394_;
            boolean bool_398_ = false;
            Object object = null;
            ClanChannelChat clanChannelChat = (bool ? ClanChannelChat.clanManager : StaticMethods.aClanChannelChat_4084);
            while_90_:
            do {
                if (clanChannelChat == null)
                    bool_398_ = true;
                else {
                    for (int i_399_ = 0; i_399_ < 100; i_399_++) {
                        if (l_397_ == GameClient.aLongArray8915[i_399_]) {
                            bool_398_ = true;
                            break while_90_;
                        }
                    }
                    if (rights != 2 && Class287.method2722(string))
                        bool_398_ = true;
                }
            } while (false);
            if (!bool_398_) {
                GameClient.aLongArray8915[1594173071 * GameClient.anInt8916] = l_397_;
                GameClient.anInt8916 = ((1594173071 * GameClient.anInt8916 + 1) % 100 * 1356544111);
                String string_400_ = StaticMethods.aClass469_5618.method6045(i_396_).method3459(buffer, -734708119);
                int i_401_ = bool ? 42 : 45;
                if (rights == 2 || 3 == rights)
                    PublicMessage.createPublicMessage(i_401_, 0, new StringBuilder().append(StaticMethods.method2368(1)).append(string).toString(), new StringBuilder().append(StaticMethods.method2368(1)).append(string).toString(), string, string_400_, clanChannelChat.channelName, i_396_);
                else if (1 == rights)
                    PublicMessage.createPublicMessage(i_401_, 0, new StringBuilder().append(StaticMethods.method2368(0)).append(string).toString(), new StringBuilder().append(StaticMethods.method2368(0)).append(string).toString(), string, string_400_, clanChannelChat.channelName, i_396_);
                else if (rights != 0)
                    PublicMessage.createPublicMessage(i_401_, 0, "<img=" + rights + ">" + string, "<img=" + rights + ">" + string, string, string_400_, clanChannelChat.channelName, i_396_);
                else
                    PublicMessage.createPublicMessage(i_401_, 0, string, string, string, string_400_, clanChannelChat.channelName, i_396_);
            }
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (IncommingPacket.aClass202_2174 == connectionType.INCOMMING_PACKET) {
            boolean bool = buffer.readUByte() == 1;
            String string = buffer.readString();
            String string_402_ = string;
            if (bool)
                string_402_ = buffer.readString();
            int i_403_ = buffer.readUByte();
            int i_404_ = buffer.readUShort();
            boolean bool_405_ = false;
            if (i_403_ <= 1 && Class287.method2722(string_402_))
                bool_405_ = true;
            if (!bool_405_) {
                String string_406_ = StaticMethods.aClass469_5618.method6045(i_404_).method3459(buffer, -734708119);
                if (2 == i_403_)
                    PublicMessage.createPublicMessage(25, 0, new StringBuilder().append(StaticMethods.method2368(1)).append(string).toString(), new StringBuilder().append(StaticMethods.method2368(1)).append(string_402_).toString(), string, string_406_, null, i_404_);
                else if (1 == i_403_)
                    PublicMessage.createPublicMessage(25, 0, new StringBuilder().append(StaticMethods.method2368(0)).append(string).toString(), new StringBuilder().append(StaticMethods.method2368(0)).append(string_402_).toString(), string, string_406_, null, i_404_);
                else
                    PublicMessage.createPublicMessage(25, 0, string, string_402_, string, string_406_, null, i_404_);
            }
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (connectionType.INCOMMING_PACKET == IncommingPacket.SOUND_INDEX15) {
            int soundId = buffer.readUShort();
            if (soundId == 65535)
                soundId = -1;
            int i_408_ = buffer.readUByte();
            int i_409_ = buffer.readUShort();
            int i_410_ = buffer.readUByte();
            ToMoveSettings.method3913(soundId, i_408_, i_409_, i_410_, true, 256);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (IncommingPacket.aClass202_2305 == connectionType.INCOMMING_PACKET) {
            Class315.method3834(SubIncommingPacket.aClass206_2356);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (connectionType.INCOMMING_PACKET == IncommingPacket.aClass202_2163) {
            int i_411_ = buffer.readUnsignedByte128();
            int i_412_ = buffer.readUnsignedByte128();
            if (i_412_ == 255) {
                i_412_ = -1;
                i_411_ = -1;
            }
            IComponentUpdateNode.setIComponentScenePosition(i_412_, i_411_);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (connectionType.INCOMMING_PACKET == IncommingPacket.REMOVE_GROUND_ITEM_PACKET) {
            Class315.method3834(SubIncommingPacket.REMOVE_GROUND_ITEM_PACKET);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (connectionType.INCOMMING_PACKET == IncommingPacket.aClass202_2232) {
            int i_413_ = buffer.readInt();
            int i_414_ = buffer.readInt();
            OutgoingPacketBuffer outgoingPacketBuffer = Class18.method359(OutgoingPacket.aClass198_1998, connectionType.encryptor);
            outgoingPacketBuffer.payload.write128Byte(914379507 * GameClient.fps);
            outgoingPacketBuffer.payload.writeInt(i_413_);
            outgoingPacketBuffer.payload.writeIntV1(i_414_);
            connectionType.sendFrame(outgoingPacketBuffer);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (IncommingPacket.OPEN_INTERFACE_PLAYER == connectionType.INCOMMING_PACKET) {// interface
            // defs?
            int index = buffer.readUnsignedShort128();
            int firstXtea = buffer.readInt();
            int interfaceId = buffer.readUnsignedShort128();
            int thirdXtea = buffer.readIntV1();
            int parentHash = buffer.readIntV2();
            int clipped = buffer.readUnsigned128Byte();
            int secondXtea = buffer.readIntV2();
            int fourthXtea = buffer.readIntV1();
            GameClient.incrementPacketCount();
            Widget.connectComponent(parentHash, new Class298_Sub51_Sub1(interfaceId, clipped, index), new int[]{firstXtea, secondXtea, thirdXtea, fourthXtea}, false);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (IncommingPacket.SECURITY_PACKET == connectionType.INCOMMING_PACKET) {
            Class273.method2566(buffer, connectionType.population * -866602563);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (connectionType.INCOMMING_PACKET == IncommingPacket.aClass202_2154) {// emote

            int[] is = new int[Class522.method6325((byte) -31).length];
            for (int i_423_ = 0; i_423_ < Class522.method6325((byte) -48).length; i_423_++)
                is[i_423_] = buffer.readInt();
            int i_424_ = buffer.readUByte();
            int i_425_ = buffer.readUShort();
            ObjectNode class298_sub29 = ((ObjectNode) GameClient.entityList.get((long) i_425_));
            if (class298_sub29 != null)
                Class431.method5768(((Entity) class298_sub29.nodeObject), is, i_424_, true);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (IncommingPacket.aClass202_2220 == connectionType.INCOMMING_PACKET) {
            Class216.baseTileY = ((buffer.read128Byte() << 3) * 2091861441);
            GameMap.basePlane = buffer.readUnsigned128Byte() * -1217120325;
            Class162.baseTileX = (buffer.readByteC() << 3) * 1536927433;
            GameScene gameScene = GameClient.myRegion.getGameScene();
            for (Class298_Sub2 class298_sub2 = ((Class298_Sub2) GameClient.aClass437_8685.method5816()); class298_sub2 != null; class298_sub2 = ((Class298_Sub2) GameClient.aClass437_8685.method5815())) {
                int i_426_ = (int) ((class298_sub2.key * 7051297995265073167L) >> 28 & 0x3L);
                int i_427_ = (int) (7051297995265073167L * class298_sub2.key & 0x3fffL);
                int i_428_ = i_427_ - -1760580017 * gameScene.gameSceneBaseX;
                int i_429_ = (int) ((7051297995265073167L * class298_sub2.key) >> 14 & 0x3fffL);
                int i_430_ = i_429_ - 283514611 * gameScene.gameSceneBaseY;
                if (i_426_ == GameMap.basePlane * -191892109 && i_428_ >= 134435705 * Class162.baseTileX && i_428_ < 8 + 134435705 * Class162.baseTileX && i_430_ >= -105526719 * Class216.baseTileY && i_430_ < 8 + Class216.baseTileY * -105526719) {
                    class298_sub2.unlink();
                    if (i_428_ >= 0 && i_430_ >= 0 && i_428_ < GameClient.myRegion.getMapWidth() && i_430_ < GameClient.myRegion.getMapLength())
                        Class173.method1820((GameMap.basePlane * -191892109), i_428_, i_430_, 1641680263);
                }
            }
            for (ObjectDeque objectDeque = (ObjectDeque) ObjectDeque.aClass453_7152.method5939(); objectDeque != null; objectDeque = ((ObjectDeque) ObjectDeque.aClass453_7152.method5944())) {
                if ((objectDeque.localX * 634196087 >= 134435705 * Class162.baseTileX) && (634196087 * objectDeque.localX < 8 + 134435705 * Class162.baseTileX) && (-2146829167 * objectDeque.localY >= -105526719 * Class216.baseTileY) && (-2146829167 * objectDeque.localY < Class216.baseTileY * -105526719 + 8) && (objectDeque.plane * 2108312995) == -191892109 * GameMap.basePlane)
                    objectDeque.aBoolean7160 = true;
            }
            for (ObjectDeque objectDeque = (ObjectDeque) ObjectDeque.aClass453_7162.method5939(); null != objectDeque; objectDeque = ((ObjectDeque) ObjectDeque.aClass453_7162.method5944())) {
                if ((634196087 * objectDeque.localX >= 134435705 * Class162.baseTileX) && (634196087 * objectDeque.localX < Class162.baseTileX * 134435705 + 8) && (objectDeque.localY * -2146829167 >= -105526719 * Class216.baseTileY) && (objectDeque.localY * -2146829167 < -105526719 * Class216.baseTileY + 8) && ((2108312995 * objectDeque.plane) == -191892109 * GameMap.basePlane))
                    objectDeque.aBoolean7160 = true;
            }
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (IncommingPacket.GLOBAL_STRING_SHORT_PACKET == connectionType.INCOMMING_PACKET) {
            int i_431_ = buffer.readUShort();
            String string = buffer.readString();
            GameClient.incrementPacketCount();
            IComponentUpdateNode.setIComponentGlobalString(i_431_, string);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (connectionType.INCOMMING_PACKET == IncommingPacket.STOP_CAMERA_SHAKE_PACKET) {
            GameClient.incrementPacketCount();
            Class82_Sub11.stopCameraShake();
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (connectionType.INCOMMING_PACKET == IncommingPacket.aClass202_2227) {
            int i_432_ = buffer.readUShort();
            int i_433_ = buffer.readUShort();
            int i_434_ = buffer.readUShort();
            GameClient.incrementPacketCount();
            if (IComponentDefinition.getIComponentDefinitionCollections[i_432_] != null) {
                for (int i_435_ = i_433_; i_435_ < i_434_; i_435_++) {
                    int i_436_ = buffer.readUTriByte();
                    if (i_435_ < (IComponentDefinition.getIComponentDefinitionCollections[i_432_].componentDefinitions).length && (IComponentDefinition.getIComponentDefinitionCollections[i_432_].componentDefinitions[i_435_]) != null)
                        IComponentDefinition.getIComponentDefinitionCollections[i_432_].componentDefinitions[i_435_].anInt1141 = i_436_ * -177949397;
                }
            }
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (IncommingPacket.SWITCH_ITEMS_LOOK_PACKET == connectionType.INCOMMING_PACKET) {
            ItemDefinitionLoader.switchItems(buffer.readUByte() == 1);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (IncommingPacket.WORLD_TILE_PACKET == connectionType.INCOMMING_PACKET) {
            Class216.baseTileY = (buffer.readByte128() << 3) * 2091861441;
            GameMap.basePlane = (buffer.readUnsignedByteC() * -1217120325);
            Class162.baseTileX = ((buffer.read128Byte() << 3) * 1536927433);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (connectionType.INCOMMING_PACKET == IncommingPacket.aClass202_2188) {
            int i_437_ = buffer.readUShort();
            int i_438_ = buffer.readInt();
            if (Class313.anObjectArray3298 == null)
                Class313.anObjectArray3298 = (new Object[Class99.aClass517_951.capacity * 2143828057]);
            Class313.anObjectArray3298[i_437_] = new Integer(i_438_);
            GameClient.anIntArray8880[((GameClient.anInt8881 += -1965237945) * -1653538697) - 1 & 0x1f] = i_437_;
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (IncommingPacket.aClass202_2158 == connectionType.INCOMMING_PACKET) {
            // seems to switch world
            int i_439_ = buffer.readUShort();
            String string = buffer.readString();
            boolean bool = buffer.readUByte() == 1;
            Class474.aClass471_5972 = Class474.activeConnectionInfo;
            Class474.aBoolean5973 = bool;
            Class372.method4589(i_439_, string);
            Object object = null;
            Class439.loadGameState(13);
            connectionType.INCOMMING_PACKET = null;
            return false;
        }
        if (connectionType.INCOMMING_PACKET == IncommingPacket.SKILL_LEVEL_PACKET) {
            int skillId = buffer.readUnsigned128Byte();
            int xp = buffer.readInt();
            int level = buffer.readUnsignedByte128();
            GameClient.anIntArray8829[skillId] = xp;
            GameClient.anIntArray8924[skillId] = level;
            GameClient.anIntArray8828[skillId] = 1;
            int i_443_ = Class368.anIntArray4002[skillId] - 1;
            for (int i_444_ = 0; i_444_ < i_443_; i_444_++) {
                if (xp >= Class368.anIntArray4003[i_444_])
                    GameClient.anIntArray8828[skillId] = 2 + i_444_;
            }
            GameClient.anIntArray8833[(GameClient.anInt8875 += 1972492301) * -1048955195 - 1 & 0x1f] = skillId;
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (connectionType.INCOMMING_PACKET == IncommingPacket.FRIENDS_CHAT_CHANNEL_PACKET) {
            GameClient.anInt8912 = 1348241137 * GameClient.anInt8933;
            if (connectionType.population * -866602563 == 0) {
                GameClient.aString8804 = null;
                GameClient.aString8919 = null;
                Class489.anInt6071 = 0;
                StaticMethods.aClass7Array6846 = null;
                connectionType.INCOMMING_PACKET = null;
                return true;
            }
            GameClient.aString8919 = buffer.readString();
            boolean bool = buffer.readUByte() == 1;
            if (bool)
                buffer.readString();
            long l = buffer.readLong();
            GameClient.aString8804 = Class377.method4664(l);
            Class514.aByte6228 = buffer.readByte();
            int i_445_ = buffer.readUByte();
            if (255 == i_445_) {
                connectionType.INCOMMING_PACKET = null;
                return true;
            }
            Class489.anInt6071 = -1649911343 * i_445_;
            Class7[] class7s = new Class7[100];
            for (int i_446_ = 0; i_446_ < Class489.anInt6071 * -1801543887; i_446_++) {
                class7s[i_446_] = new Class7();
                class7s[i_446_].aString92 = buffer.readString();
                bool = buffer.readUByte() == 1;
                if (bool)
                    class7s[i_446_].aString93 = buffer.readString();
                else
                    class7s[i_446_].aString93 = class7s[i_446_].aString92;
                class7s[i_446_].aString94 = Class173.method1824(class7s[i_446_].aString93);
                class7s[i_446_].anInt95 = (buffer.readUShort() * -129166695);
                class7s[i_446_].aByte97 = buffer.readByte();
                class7s[i_446_].aString96 = buffer.readString();
                if (class7s[i_446_].aString93.equals(Player.myPlayer.accountName))
                    Class173.aByte1759 = class7s[i_446_].aByte97;
            }
            boolean bool_447_ = false;
            int i_448_ = Class489.anInt6071 * -1801543887;
            while_91_:
            do {
                do {
                    if (i_448_ <= 0)
                        break while_91_;
                    bool_447_ = true;
                    i_448_--;
                    for (int i_449_ = 0; i_449_ < i_448_; i_449_++) {
                        if ((class7s[i_449_].aString94.compareTo(class7s[1 + i_449_].aString94)) > 0) {
                            Class7 class7 = class7s[i_449_];
                            class7s[i_449_] = class7s[1 + i_449_];
                            class7s[1 + i_449_] = class7;
                            bool_447_ = false;
                        }
                    }
                } while (!bool_447_);
            } while (false);
            StaticMethods.aClass7Array6846 = class7s;
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (connectionType.INCOMMING_PACKET == IncommingPacket.LARGE_NPC_UPDATE_PACKET) {
            Class406.decodeNPCUpdate(true, -1463103982);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (connectionType.INCOMMING_PACKET == IncommingPacket.RESET_CAMERA_PACKET) {
            GameClient.incrementPacketCount();
            Class_na.resetCamera();
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (connectionType.INCOMMING_PACKET == IncommingPacket.HINT_ICON_PACKET) {
            int mask = buffer.readUByte();
            int index = mask >> 5;
            int targetType = mask & 0x1F;
            if (0 == targetType) {
                HintIcon.loadedIcons[index] = null;
                connectionType.INCOMMING_PACKET = null;
                return true;
            }
            HintIcon hintIcon = new HintIcon();
            hintIcon.targetType = 1231457277 * targetType;
            hintIcon.arrowType = buffer.readUByte() * -1078964265;
            if (hintIcon.arrowType * -92466201 >= 0 && (hintIcon.arrowType * -92466201 < HintIcon.arrowTypeSprites.length)) {
                if (hintIcon.targetType * 958933333 == HintIcon.NPC || HintIcon.PLAYER == hintIcon.targetType * 958933333) {
                    hintIcon.targetIndex = (buffer.readUShort() * 1626935871);
                    hintIcon.arrowFlashRate = (buffer.readUShort() * -571637617);
                    buffer.offset += 465653244;
                } else if (hintIcon.targetType * 958933333 >= 2 && hintIcon.targetType * 958933333 <= 6) {
                    if (958933333 * hintIcon.targetType == 2) {
                        hintIcon.coordX = 1513435904;
                        hintIcon.coordY = -1303452928;
                    }
                    if (958933333 * hintIcon.targetType == 3) {
                        hintIcon.coordX = 0;
                        hintIcon.coordY = -1303452928;
                    }
                    if (958933333 * hintIcon.targetType == 4) {
                        hintIcon.coordX = -1268095488;
                        hintIcon.coordY = -1303452928;
                    }
                    if (958933333 * hintIcon.targetType == 5) {
                        hintIcon.coordX = 1513435904;
                        hintIcon.coordY = 0;
                    }
                    if (hintIcon.targetType * 958933333 == 6) {
                        hintIcon.coordX = 1513435904;
                        hintIcon.coordY = 1688061440;
                    }
                    hintIcon.targetType = -1832052742;
                    hintIcon.plane = (buffer.readUByte() * -1962848411);
                    GameScene gameScene = GameClient.myRegion.getGameScene();
                    hintIcon.coordX += ((buffer.readUShort() - -1760580017 * gameScene.gameSceneBaseX) << 9) * 962213171;
                    hintIcon.coordY += ((buffer.readUShort() - gameScene.gameSceneBaseY * 283514611) << 9) * 313675491;
                    hintIcon.arrowHeight = ((buffer.readUByte() << 2) * -2098711205);
                    hintIcon.minimapAppearance = (buffer.readUShort() * -1670140163);
                }
                hintIcon.modelID = (buffer.readInt() * -698073157);
                HintIcon.loadedIcons[index] = hintIcon;
            }
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (IncommingPacket.PLAYER_ON_ICOMPONENT_PACKET == connectionType.INCOMMING_PACKET) {
            int interfaceHash = buffer.readIntV2();
            GameClient.incrementPacketCount();
            IComponentUpdateNode.setModelOnIComponent(interfaceHash, IComponentDefinition.MODELTYPE_PLAYER, GameClient.playerIndex * -442628795, 0);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (connectionType.INCOMMING_PACKET == IncommingPacket.BLACK_OUT_PACKET) {
            Minimap.anInt56 = buffer.readUByte() * -986054733;
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (IncommingPacket.aClass202_2247 == connectionType.INCOMMING_PACKET) {
            int i_454_ = buffer.readUShort();
            String string = buffer.readString();
            if (null == Class313.anObjectArray3298)
                Class313.anObjectArray3298 = (new Object[2143828057 * Class99.aClass517_951.capacity]);
            Class313.anObjectArray3298[i_454_] = string;
            GameClient.anIntArray8880[((GameClient.anInt8881 += -1965237945) * -1653538697) - 1 & 0x1f] = i_454_;
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (connectionType.INCOMMING_PACKET == IncommingPacket.LOAD_MAP_SCENE_DYNAMIC_PACKET) {
            RsBitsBuffer bitsBuffer = new RsBitsBuffer(connectionType.population * -866602563);
            System.arraycopy((connectionType.bitsBuffer.buffer), (connectionType.bitsBuffer.offset) * 385051775, bitsBuffer.buffer, 0, connectionType.population * -866602563);
            StaticMethods.resetCutscene();
            if (SettingsManager.settingsManager.aClass422_Sub21_7580.getValue() == 1)
                Class62.aClass248_612.method2385(new MapLoadBuffer(MapLoad.LOAD_MAP_SCENE_DYNAMIC, bitsBuffer), 1563574437);
            else
                GameClient.myRegion.sendMapScene(new MapLoadBuffer(MapLoad.LOAD_MAP_SCENE_DYNAMIC, bitsBuffer));
            connectionType.INCOMMING_PACKET = null;
            return false;
        }
        if (connectionType.INCOMMING_PACKET == IncommingPacket.aClass202_2306) {
            int i_456_ = buffer.readUnsignedShort128();
            int i_457_ = buffer.readUnsigned128Byte();
            boolean bool = (i_457_ & 0x1) == 1;
            FontManager.method1888(i_456_, bool);
            GameClient.anIntArray8823[(GameClient.anInt8873 += 1524000797) * 1610062389 - 1 & 0x1f] = i_456_;
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (IncommingPacket.aClass202_2194 == connectionType.INCOMMING_PACKET) {
            int i_458_ = buffer.readInt();
            int i_459_ = buffer.readUnsignedByte128();
            int i_460_ = buffer.readInt();
            int i_461_ = buffer.readUByte();
            int i_462_ = buffer.readUnsignedByteC();
            int i_463_ = i_460_ >> 28;
            int i_464_ = i_460_ >> 14 & 0x3fff;
            int i_465_ = i_460_ & 0x3fff;
            StaticMethods.method5743(i_463_, i_464_, i_465_, i_459_, i_462_, i_458_, i_461_);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (IncommingPacket.aClass202_2215 == connectionType.INCOMMING_PACKET) {
            Class315.method3834(SubIncommingPacket.aClass206_2343);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (IncommingPacket.aClass202_2287 == connectionType.INCOMMING_PACKET) {
            Class315.method3834(SubIncommingPacket.aClass206_2348);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (connectionType.INCOMMING_PACKET == IncommingPacket.OPEN_URL_PACKET) {
            if (GameClient.fullscreen && GameClient.fullScreenFrame != null)
                Class357.method4276(SettingsManager.settingsManager.screenSize.getValue(), -1, -1, false);
            byte[] is = new byte[connectionType.population * -866602563 - 1];
            boolean bool = buffer.readUByte() == 1;
            buffer.method3662(is, 0, (connectionType.population * -866602563) - 1, (byte) 1);
            Buffer class298_sub53 = new Buffer(is);
            String string = class298_sub53.readString();
            if (bool) {
                String string_466_ = class298_sub53.readString();
                if (string_466_.length() == 0)
                    string_466_ = string;
                if (!GameClient.aBoolean8638 || Class82_Sub8.operatingSystem.startsWith("mac") || !Class65.method762(string, 1, Class212.aClass212_2424.method1951()))
                    ErrorReporter.method4172(string_466_, true, SettingsManager.settingsManager.toolkitSetting.getValue() == ToolkitOption.OPENGLSPECIAL, GameClient.useJs, GameClient.aBoolean8651, (byte) 13);
            } else
                ErrorReporter.method4172(string, true, SettingsManager.settingsManager.toolkitSetting.getValue() == ToolkitOption.OPENGLSPECIAL, GameClient.useJs, GameClient.aBoolean8651, (byte) 54);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (connectionType.INCOMMING_PACKET == IncommingPacket.CONFIG2_PACKET) {
            int configId = buffer.readUnsignedShort128();
            int value = buffer.readIntLE();
            Class128.playerVarsProvider.method1605(configId, value);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (IncommingPacket.aClass202_2238 == connectionType.INCOMMING_PACKET) {
            int componentID = buffer.readUnsignedShortLE();
            int interfaceID = buffer.readUnsignedShort128();
            int interfaceHash = buffer.readIntV1();
            int playerIndex = buffer.readUShort();
            GameClient.incrementPacketCount();
            IComponentUpdateNode.setModelOnIComponent(interfaceHash, IComponentDefinition.MODELTYPE_OTHER_PLAYER, interfaceID << 16 | componentID, playerIndex);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (IncommingPacket.PLAYER_UPDATE_PACKET == connectionType.INCOMMING_PACKET) {
            StaticMethods.decodePlayerUpdate(buffer, connectionType.population * -866602563);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (IncommingPacket.PROJECTILE_PACKET == connectionType.INCOMMING_PACKET) {
            Class315.method3834(SubIncommingPacket.PROJECTILE_PACKET);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (IncommingPacket.RECEIVE_FRIEND_CHAT_MESSAGE_PACKET == connectionType.INCOMMING_PACKET) {
            boolean bool = buffer.readUByte() == 1;
            String string = buffer.readString();
            String string_473_ = string;
            if (bool)
                string_473_ = buffer.readString();
            long l = buffer.readLong();
            long l_474_ = (long) buffer.readUShort();
            long l_475_ = (long) buffer.readUTriByte();
            int rights = buffer.readUByte();
            long l_477_ = l_475_ + (l_474_ << 32);
            boolean bool_478_ = false;
            while_92_:
            do {
                for (int i_479_ = 0; i_479_ < 100; i_479_++) {
                    if (l_477_ == GameClient.aLongArray8915[i_479_]) {
                        bool_478_ = true;
                        break while_92_;
                    }
                }
                if (rights != 2) {
                    if (GameClient.aBoolean8811 && !GameClient.aBoolean8812 || GameClient.aBoolean8802)
                        bool_478_ = true;
                    else if (Class287.method2722(string_473_))
                        bool_478_ = true;
                }
            } while (false);
            if (!bool_478_) {
                GameClient.aLongArray8915[1594173071 * GameClient.anInt8916] = l_477_;
                GameClient.anInt8916 = 1356544111 * ((1 + 1594173071 * GameClient.anInt8916) % 100);
                String string_480_ = (StringUtils.decryptStringMessage(Class127_Sub1.huffManDecryption(buffer)));
                if (rights == 2 || rights == 3)
                    PublicMessage.createPublicMessage(9, 0, new StringBuilder().append(StaticMethods.method2368(1)).append(string).toString(), new StringBuilder().append(StaticMethods.method2368(1)).append(string_473_).toString(), string, string_480_, Class404.method4952(l), -1);
                else if (1 == rights)
                    PublicMessage.createPublicMessage(9, 0, new StringBuilder().append(StaticMethods.method2368(0)).append(string).toString(), new StringBuilder().append(StaticMethods.method2368(0)).append(string_473_).toString(), string, string_480_, Class404.method4952(l), -1);
                else if (rights != 0)
                    PublicMessage.createPublicMessage(9, 0, "<img=" + rights + ">" + string, "<img=" + rights + ">" + string_473_, string, string_480_, Class404.method4952(l), -1);
                else
                    PublicMessage.createPublicMessage(9, 0, string, string_473_, string, string_480_, Class404.method4952(l), -1);
            }
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (connectionType.INCOMMING_PACKET == IncommingPacket.CLOSE_INTERFACE_PACKET) {
            int interfaceHash = buffer.readIntLE();
            GameClient.incrementPacketCount();
            Widget widget = ((Widget) GameClient.linkedList.get((long) interfaceHash));
            if (widget != null)
                Widget.closeInterface(widget, true, false);
            if (GameClient.loadingScreen != null) {
                StaticMethods.updateComponentTick(GameClient.loadingScreen);
                GameClient.loadingScreen = null;
            }
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (connectionType.INCOMMING_PACKET == IncommingPacket.aClass202_2208) {
            int i_482_ = buffer.readUnsignedShort128();
            if (i_482_ == 65535)
                i_482_ = -1;
            StaticMethods.method530(i_482_);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (IncommingPacket.IGNORES_PACKET == connectionType.INCOMMING_PACKET) {
            GameClient.anInt8952 = buffer.readUByte() * -765637727;
            for (int i_483_ = 0; i_483_ < GameClient.anInt8952 * -548972447; i_483_++) {
                GameClient.aStringArray8859[i_483_] = buffer.readString();
                GameClient.aStringArray8954[i_483_] = buffer.readString();
                if (GameClient.aStringArray8954[i_483_].equals(""))
                    GameClient.aStringArray8954[i_483_] = GameClient.aStringArray8859[i_483_];
                GameClient.aStringArray8955[i_483_] = buffer.readString();
                GameClient.aStringArray8773[i_483_] = buffer.readString();
                if (GameClient.aStringArray8773[i_483_].equals(""))
                    GameClient.aStringArray8773[i_483_] = GameClient.aStringArray8955[i_483_];
                GameClient.aBooleanArray8957[i_483_] = false;
            }
            GameClient.anInt8883 = 754377557 * GameClient.anInt8933;
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (IncommingPacket.aClass202_2157 == connectionType.INCOMMING_PACKET) {
            NotDefinition.anInt7456 = buffer.read24BitInteger() * 777394511;
            GameClient.aBoolean8811 = buffer.readUByte() == 1;
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (IncommingPacket.aClass202_2151 == connectionType.INCOMMING_PACKET) {
            Class315.method3834(SubIncommingPacket.aClass206_2353);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (IncommingPacket.aClass202_2265 == connectionType.INCOMMING_PACKET) {
            int i_484_ = buffer.readIntV2();
            boolean bool = buffer.readUnsigned128Byte() == 1;
            GameClient.incrementPacketCount();
            IComponentUpdateNode.method6282(i_484_, bool);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (connectionType.INCOMMING_PACKET == IncommingPacket.SET_ICOMPONENT_POSITION) {
            int y = buffer.readShort();
            int x = buffer.readShort();
            int interfaceHash = buffer.readIntLE();
            GameClient.incrementPacketCount();
            IComponentUpdateNode.setIComponentScenePosition(interfaceHash, x, y);
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (IncommingPacket.RECEIVE_PRIVATE_MESSAGE_PACKET == connectionType.INCOMMING_PACKET) {
            boolean bool = buffer.readUByte() == 1;
            String string = buffer.readString();
            String string_488_ = string;
            if (bool)
                string_488_ = buffer.readString();
            long l = (long) buffer.readUShort();
            long l_489_ = (long) buffer.readUTriByte();
            int rights = buffer.readUByte();
            long l_491_ = l_489_ + (l << 32);
            boolean bool_492_ = false;
            while_93_:
            do {
                for (int i_493_ = 0; i_493_ < 100; i_493_++) {
                    if (l_491_ == GameClient.aLongArray8915[i_493_]) {
                        bool_492_ = true;
                        break while_93_;
                    }
                }
                if (rights != 2) {
                    if (GameClient.aBoolean8811 && !GameClient.aBoolean8812 || GameClient.aBoolean8802)
                        bool_492_ = true;
                    else if (Class287.method2722(string_488_))
                        bool_492_ = true;
                }
            } while (false);
            if (!bool_492_) {
                GameClient.aLongArray8915[GameClient.anInt8916 * 1594173071] = l_491_;
                GameClient.anInt8916 = 1356544111 * ((1 + GameClient.anInt8916 * 1594173071) % 100);
                String string_494_ = (StringUtils.decryptStringMessage(Class127_Sub1.huffManDecryption(buffer)));
                if (2 == rights)
                    PublicMessage.createPublicMessage(7, 0, new StringBuilder().append(StaticMethods.method2368(1)).append(string).toString(), new StringBuilder().append(StaticMethods.method2368(1)).append(string_488_).toString(), string, string_494_, null, -1);
                else if (rights == 1)
                    PublicMessage.createPublicMessage(7, 0, new StringBuilder().append(StaticMethods.method2368(0)).append(string).toString(), new StringBuilder().append(StaticMethods.method2368(0)).append(string_488_).toString(), string, string_494_, null, -1);
                else if (rights != 0)
                    PublicMessage.createPublicMessage(3, 0, "<img=" + rights + ">" + string, "<img=" + rights + ">" + string_488_, string, string_494_, null, -1);
                else
                    PublicMessage.createPublicMessage(3, 0, string, string_488_, string, string_494_, null, -1);
            }
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        if (connectionType.INCOMMING_PACKET == IncommingPacket.IGNORE_PACKET) {
            int i_495_ = buffer.readUByte();
            boolean bool = (i_495_ & 0x1) == 1;
            String string = buffer.readString();
            String string_496_ = buffer.readString();
            if (string_496_.equals(""))
                string_496_ = string;
            String string_497_ = buffer.readString();
            String string_498_ = buffer.readString();
            if (string_498_.equals(""))
                string_498_ = string_497_;
            if (!bool) {
                GameClient.aStringArray8859[GameClient.anInt8952 * -548972447] = string;
                GameClient.aStringArray8954[GameClient.anInt8952 * -548972447] = string_496_;
                GameClient.aStringArray8955[GameClient.anInt8952 * -548972447] = string_497_;
                GameClient.aStringArray8773[-548972447 * GameClient.anInt8952] = string_498_;
                GameClient.aBooleanArray8957[-548972447 * GameClient.anInt8952] = 2 == (i_495_ & 0x2);
                GameClient.anInt8952 += -765637727;
            } else {
                for (int i_499_ = 0; i_499_ < GameClient.anInt8952 * -548972447; i_499_++) {
                    if (GameClient.aStringArray8954[i_499_].equals(string_498_)) {
                        GameClient.aStringArray8859[i_499_] = string;
                        GameClient.aStringArray8954[i_499_] = string_496_;
                        GameClient.aStringArray8955[i_499_] = string_497_;
                        GameClient.aStringArray8773[i_499_] = string_498_;
                        break;
                    }
                }
            }
            GameClient.anInt8883 = GameClient.anInt8933 * 754377557;
            connectionType.INCOMMING_PACKET = null;
            return true;
        }
        IPAddress.reportError(new StringBuilder().append(connectionType.INCOMMING_PACKET != null ? 2075990793 * (connectionType.INCOMMING_PACKET.packetID) : -1).append(Class26.comma).append(null != connectionType.aClass202_345 ? (connectionType.aClass202_345.packetID) * 2075990793 : -1).append(Class26.comma).append(null != connectionType.aClass202_348 ? (connectionType.aClass202_348.packetID) * 2075990793 : -1).append(" ").append(connectionType.population * -866602563).toString(), new RuntimeException());
        StaticMethods.method2001(false);
        return true;
    }

    static final boolean packetSentSuccessfully(ConnectionType connectionType) {
        boolean packetSent;
        try {
            packetSent = decodeIncommingPacket(connectionType);
        } catch (IOException ioexception) {
            if (18 == -1233866115 * GameClient.gameState) {
                connectionType.closeConnection();
                return false;
            }
            SubIncommingPacket.method1923();
            return true;
        } catch (Exception exception) {
            GameScene gameScene = GameClient.myRegion.getGameScene();
            String string = new StringBuilder().append(connectionType.INCOMMING_PACKET != null ? (2075990793 * connectionType.INCOMMING_PACKET.packetID) : -1).append(Class26.comma).append(connectionType.aClass202_345 != null ? (2075990793 * connectionType.aClass202_345.packetID) : -1).append(Class26.comma).append(null != connectionType.aClass202_348 ? (2075990793 * connectionType.aClass202_348.packetID) : -1).append(" ").append(connectionType.population * -866602563).append(Class26.comma).append(-1760580017 * gameScene.gameSceneBaseX + (Player.myPlayer.scenePositionXQueue[0])).append(Class26.comma).append(283514611 * gameScene.gameSceneBaseY + (Player.myPlayer.scenePositionYQueue[0])).append(" ").toString();
            for (int i_8_ = 0; (i_8_ < -866602563 * connectionType.population && i_8_ < 50); i_8_++)
                string = new StringBuilder().append(string).append(connectionType.bitsBuffer.buffer[i_8_]).append(Class26.comma).toString();
            IPAddress.reportError(string, exception);
            StaticMethods.method2001(false);
            return true;
        }
        return packetSent;
    }
}
