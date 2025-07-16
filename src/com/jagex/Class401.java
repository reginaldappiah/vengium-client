package com.jagex;/* Class401 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.network.OutgoingPacket;
import com.jagex.utils.ColorUtils;

public class Class401 implements Interface21 {
	int anInt6551;
	public static Class401 aClass401_6552 = new Class401("LOCAL", "", 4);
	public static Class401 aClass401_6553;
	public static Class401 aClass401_6554;
	public static Class401 aClass401_6555;
	static Class401 aClass401_6556;
	public static Class401 aClass401_6557;
	String aString6558;
	static int anInt6559;
	public static Class401 aClass401_6560 = new Class401("WTWIP", "", 3);
	static SpriteToolkit[] aClass57Array6561;
	static int anInt6562;

	Class401(String string, String string_0_, int i) {
		this.aString6558 = string;
		this.anInt6551 = i * 143252701;
	}

	public static boolean method4932(Class401 class401, int i) {
		try {
			return (aClass401_6555 == class401 || class401 == aClass401_6554 || aClass401_6560 == class401 || aClass401_6553 == class401 || aClass401_6556 == class401);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("qq.b(").append(')').toString());
		}
	}

	public int getID() {
		try {
			return this.anInt6551 * -504243339;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("qq.f(").append(')').toString());
		}
	}

	static {
		aClass401_6553 = new Class401("WTI", "", 5);
		aClass401_6554 = new Class401("WTQA", "", 2);
		aClass401_6555 = new Class401("WTRC", "", 1);
		aClass401_6556 = new Class401("INTBETA", "", 6);
		aClass401_6557 = new Class401("LIVE", "", 0);
		method4936(-2140357445);
	}

	public int method243() {
		return this.anInt6551 * -504243339;
	}

	public static final int method4933(int i, int i_1_, int i_2_, int i_3_) {
		try {
			if (i_2_ > 243)
				i_1_ >>= 4;
				else if (i_2_ > 217)
					i_1_ >>= 3;
					else if (i_2_ > 192)
						i_1_ >>= 2;
						else if (i_2_ > 179)
							i_1_ >>= 1;
							return (i_2_ >> 1) + (((i & 0xff) >> 2 << 10) + (i_1_ >> 5 << 7));
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("qq.s(").append(')').toString());
		}
	}

	public int method244() {
		return this.anInt6551 * -504243339;
	}

	static void clear() {
		try {
			HintIcon.cache.clear();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("qq.b(").append(')').toString());
		}
	}

	static final void method4935(ScriptRuntime runtime) {
		try {
			runtime.integerStackOffset -= -783761378;
			if ((runtime.integerStack[runtime.integerStackOffset * 681479919]) >= (runtime.integerStack[1 + 681479919 * runtime.integerStackOffset]))
				runtime.integerPos += ((runtime.integerstack[runtime.integerPos * 1883543357]) * 286750741);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("qq.al(").append(')').toString());
		}
	}

	public static Class401[] method4936(int i) {
		try {
			return (new Class401[] { aClass401_6556, aClass401_6552, aClass401_6553, aClass401_6557, aClass401_6555, aClass401_6560, aClass401_6554 });
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("qq.a(").append(')').toString());
		}
	}

	static void method4938(int i, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_, byte i_18_) {
		try {
			int i_19_ = StaticMethods.method6012(i_13_, 1155384281 * Class372_Sub3.anInt4049, -1062447355 * Class372_Sub3.anInt4050);
			int i_20_ = StaticMethods.method6012(i_14_, Class372_Sub3.anInt4049 * 1155384281, Class372_Sub3.anInt4050 * -1062447355);
			int i_21_ = StaticMethods.method6012(i, Class372_Sub3.anInt4051 * -1424479739, 1135094847 * Class372_Sub3.anInt4048);
			int i_22_ = StaticMethods.method6012(i_12_, -1424479739 * Class372_Sub3.anInt4051, Class372_Sub3.anInt4048 * 1135094847);
			int i_23_ = StaticMethods.method6012(i_13_ + i_17_, 1155384281 * Class372_Sub3.anInt4049, Class372_Sub3.anInt4050 * -1062447355);
			int i_24_ = StaticMethods.method6012(i_14_ - i_17_, Class372_Sub3.anInt4049 * 1155384281, -1062447355 * Class372_Sub3.anInt4050);
			for (int i_25_ = i_19_; i_25_ < i_23_; i_25_++)
				Class82_Sub22.method940((Class372_Sub3.anIntArrayArray4047[i_25_]), i_21_, i_22_, i_16_);
			for (int i_26_ = i_20_; i_26_ > i_24_; i_26_--)
				Class82_Sub22.method940((Class372_Sub3.anIntArrayArray4047[i_26_]), i_21_, i_22_, i_16_);
			int i_27_ = StaticMethods.method6012(i + i_17_, -1424479739 * Class372_Sub3.anInt4051, Class372_Sub3.anInt4048 * 1135094847);
			int i_28_ = StaticMethods.method6012(i_12_ - i_17_, Class372_Sub3.anInt4051 * -1424479739, Class372_Sub3.anInt4048 * 1135094847);
			for (int i_29_ = i_23_; i_29_ <= i_24_; i_29_++) {
				int[] is = Class372_Sub3.anIntArrayArray4047[i_29_];
				Class82_Sub22.method940(is, i_21_, i_27_, i_16_);
				Class82_Sub22.method940(is, i_27_, i_28_, i_15_);
				Class82_Sub22.method940(is, i_28_, i_22_, i_16_);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("qq.q(").append(')').toString());
		}
	}

	static void sendInterfaceOptionPacket(MenuOption menuOption, int i, int i_30_) {
		try {
			if (null != menuOption && (Class436.aClass453_5480.aClass298_5643 != menuOption)) {
				int dynamicChildIndex = (-887503319 * (menuOption.secondary));
				int interfaceHash = (menuOption.tertiary * -502720623);
				int optionID = (946432351 * (menuOption.componentID));
				int playerIndex = (int) ((menuOption.primary) * 2236412381003659263L);
				long l = (2236412381003659263L * (menuOption.primary));
				if (optionID >= 2000)
					optionID -= 2000;
				GameScene gameScene = GameClient.myRegion.getGameScene();
				if (23 == optionID) {
					if (1806357379 * GameClient.localPrivilege > 0 && Class434.method5802(1267311211))
						StaticMethods.method6083((Player.myPlayer.plane), dynamicChildIndex + -1760580017 * gameScene.gameSceneBaseX, interfaceHash + gameScene.gameSceneBaseY * 283514611);
					else {
						Skybox.sendWalkPacket(playerIndex, StaticMethods.method4214(dynamicChildIndex, interfaceHash));
						if (playerIndex == 0) {
							GameClient.anInt8784 = i * 143636043;
							GameClient.anInt8785 = i_30_ * 381532777;
							GameClient.mouseClickTargetType = 277162405;
							GameClient.mouseClickTicker = 0;
						}
						Class82_Sub21.method938(dynamicChildIndex, interfaceHash, true, StaticMethods.method4214(dynamicChildIndex, interfaceHash));

					}
				}
				OutgoingPacket itemOptionPacket = null;
				if (optionID == 18)
					itemOptionPacket = OutgoingPacket.aClass198_2002;
				else if (optionID == 19)
					itemOptionPacket = OutgoingPacket.aClass198_2050;
				else if (optionID == 20)
					itemOptionPacket = OutgoingPacket.ITEM_TAKE_PACKET;
				else if (21 == optionID)
					itemOptionPacket = OutgoingPacket.aClass198_2055;
				else if (22 == optionID)
					itemOptionPacket = OutgoingPacket.aClass198_2038;
				else if (1004 == optionID)
					itemOptionPacket = OutgoingPacket.ITEM_ON_FLOOR_EXAMINE;
				if (itemOptionPacket != null) {
					if (itemOptionPacket != OutgoingPacket.ITEM_ON_FLOOR_EXAMINE)
						Skybox.sendWalkPacket(Class282.method2619(dynamicChildIndex, interfaceHash, 1, 1));
					GameClient.anInt8784 = i * 143636043;
					GameClient.anInt8785 = i_30_ * 381532777;
					GameClient.mouseClickTargetType = 554324810;
					GameClient.mouseClickTicker = 0;
					OutgoingPacketBuffer outgoingPacketBuffer = Class18.method359(itemOptionPacket, ConnectionType.gameConnection.encryptor);
					outgoingPacketBuffer.payload.writeShort(283514611 * gameScene.gameSceneBaseY + interfaceHash);
					outgoingPacketBuffer.payload.writeShortLE(dynamicChildIndex + -1760580017 * gameScene.gameSceneBaseX);
					outgoingPacketBuffer.payload.writeShort(playerIndex);
					outgoingPacketBuffer.payload.write128Byte(Class151.method1644(984220338) ? 1 : 0);
					ConnectionType.gameConnection.sendFrame(outgoingPacketBuffer);
					StaticMethods.method4654(dynamicChildIndex, interfaceHash);
				}
				if (59 == optionID) {
					GameClient.anInt8784 = 143636043 * i;
					GameClient.anInt8785 = 381532777 * i_30_;
					GameClient.mouseClickTargetType = 277162405;
					GameClient.mouseClickTicker = 0;
					OutgoingPacketBuffer outgoingPacketBuffer = Class18.method359(OutgoingPacket.aClass198_2087, ConnectionType.gameConnection.encryptor);
					outgoingPacketBuffer.payload.writeInt(1262526353 * Class379.interfaceHash);
					outgoingPacketBuffer.payload.writeShort(392084321 * GameClient.containerComponent);
					outgoingPacketBuffer.payload.writeShort(gameScene.gameSceneBaseY * 283514611 + interfaceHash);
					outgoingPacketBuffer.payload.writeShort128(GameClient.itemID * 1408085039);
					outgoingPacketBuffer.payload.writeShortLE(gameScene.gameSceneBaseX * -1760580017 + dynamicChildIndex);
					ConnectionType.gameConnection.sendFrame(outgoingPacketBuffer);
					Class82_Sub21.method938(dynamicChildIndex, interfaceHash, true, StaticMethods.method4214(dynamicChildIndex, interfaceHash));
				}
				if (optionID == 57 || optionID == 1007)
					Class301_Sub1.method3713(playerIndex, interfaceHash, dynamicChildIndex, (menuOption.action));
				if (1008 == optionID || 1009 == optionID || optionID == 1010 || 1011 == optionID || optionID == 1012)
					StaticMethods.method6014(optionID, playerIndex, dynamicChildIndex);
				if (2 == optionID) {

					int i_3_ = (int) l >> 14 & 0x1f;
					int i_4_ = (int) l >> 20 & 0x3;
					int i_5_ = (int) (l >>> 32) & 0x7fffffff;
					Class424 class424 = ((Class424) StaticMethods.method5701(Class336_Sub6.method4108(), i_3_));
					Class336 class336;
					if (Class424.aClass424_6611 == class424 || Class424.aClass424_6604 == class424 || Class424.aClass424_6610 == class424) {
						ObjectDefinition class432 = GameClient.myRegion.getObjectDefinitionLoader().get(i_5_);
						int i_6_;
						int i_7_;
						if (0 == i_4_ || i_4_ == 2) {
							i_6_ = -1125834887 * class432.sizeX;
							i_7_ = -565161399 * class432.sizeY;
						} else {
							i_6_ = -565161399 * class432.sizeY;
							i_7_ = class432.sizeX * -1125834887;
						}
						if (i_4_ == 0) {
							/* empty */
						}
						class336 = Class336_Sub5.method4105(dynamicChildIndex, interfaceHash, i_6_, i_7_, Class424.aClass424_6614, 0, 1300552038);
					} else if (Class82_Sub9.method900(-1976050083 * class424.type, (byte) 28))
						class336 = Class336_Sub5.method4105(dynamicChildIndex, interfaceHash, 0, 0, class424, i_4_, 740164949);
					else
						class336 = Class194.method1867(dynamicChildIndex, interfaceHash, 0, 0, class424, i_4_, (byte) -22);
					Skybox.sendWalkPacket(class336);
					GameClient.anInt8784 = 143636043 * i;
					GameClient.anInt8785 = i_30_ * 381532777;
					GameClient.mouseClickTargetType = 554324810;
					GameClient.mouseClickTicker = 0;
					OutgoingPacketBuffer outgoingPacketBuffer = Class18.method359(OutgoingPacket.INTERFACE_ON_OBJECT, ConnectionType.gameConnection.encryptor);
					outgoingPacketBuffer.payload.write128Byte(Class151.method1644(-427290804) ? 1 : 0);
					outgoingPacketBuffer.payload.writeShortLE128(GameClient.itemID * 1408085039);
					outgoingPacketBuffer.payload.writeShortLE128(283514611 * gameScene.gameSceneBaseY + interfaceHash);
					outgoingPacketBuffer.payload.writeIntV2((int) (l >>> 32) & 0x7fffffff);
					outgoingPacketBuffer.payload.writeInt(1262526353 * Class379.interfaceHash);
					outgoingPacketBuffer.payload.writeShortLE(GameClient.containerComponent * 392084321);
					outgoingPacketBuffer.payload.writeShort128(dynamicChildIndex + -1760580017 * gameScene.gameSceneBaseX);
					ConnectionType.gameConnection.sendFrame(outgoingPacketBuffer);
					ComponentMouseRecorder.method1013(dynamicChildIndex, interfaceHash, l);
				}
				if (optionID == 30 && GameClient.loadingScreen == null) {
					ToMoveIComponentScripts.sendDialogueContinuePacket(interfaceHash, dynamicChildIndex);
					GameClient.loadingScreen = IComponentDefinition.getContainerComponent(interfaceHash, dynamicChildIndex);
					StaticMethods.updateComponentTick(GameClient.loadingScreen);
				}
				OutgoingPacket playerOptionPacket = null;
				if (optionID == 44)
					playerOptionPacket = OutgoingPacket.PLAYER_OPTION_1_PACKET;
				else if (optionID == 45)
					playerOptionPacket = OutgoingPacket.PLAYER_OPTION_2_PACKET;
				else if (optionID == 46)
					playerOptionPacket = OutgoingPacket.PLAYER_OPTION_3_PACKET;
				else if (optionID == 47)
					playerOptionPacket = OutgoingPacket.PLAYER_OPTION_4_PACKET;
				else if (48 == optionID)
					playerOptionPacket = OutgoingPacket.PLAYER_OPTION_5_PACKET;
				else if (optionID == 49)
					playerOptionPacket = OutgoingPacket.PLAYER_OPTION_6_PACKET;
				else if (50 == optionID)
					playerOptionPacket = OutgoingPacket.PLAYER_OPTION_7_PACKET;
				else if (51 == optionID)
					playerOptionPacket = OutgoingPacket.PLAYER_OPTION_8_PACKET;
				else if (optionID == 52)
					playerOptionPacket = OutgoingPacket.PLAYER_OPTION_9_PACKET;
				else if (optionID == 53)
					playerOptionPacket = OutgoingPacket.PLAYER_OPTION_10_PACKET;
				if (playerOptionPacket != null) {
					Player player = GameClient.entities[playerIndex];
					if (null != player) {
						Skybox.sendWalkPacket(Class336.method3963((player.scenePositionXQueue[0]), (player.scenePositionYQueue[0]), player.getSize(), player.getSize(), 0));
						GameClient.anInt8784 = i * 143636043;
						GameClient.anInt8785 = 381532777 * i_30_;
						GameClient.mouseClickTargetType = 554324810;
						GameClient.mouseClickTicker = 0;
						OutgoingPacketBuffer outgoingPacketBuffer = Class18.method359(playerOptionPacket, (ConnectionType.gameConnection.encryptor));
						outgoingPacketBuffer.payload.writeByte(Class151.method1644(1625676244) ? 1 : 0);
						outgoingPacketBuffer.payload.writeShortLE128(playerIndex);
						ConnectionType.gameConnection.sendFrame(outgoingPacketBuffer);
						Class82_Sub21.method938(player.scenePositionXQueue[0], player.scenePositionYQueue[0], true, Class336.method3963((player.scenePositionXQueue[0]), (player.scenePositionYQueue[0]), player.getSize(), player.getSize(), 0));
					}
				}
				if (optionID == 16) {
					GameClient.anInt8784 = 143636043 * i;
					GameClient.anInt8785 = 381532777 * i_30_;
					GameClient.mouseClickTargetType = 554324810;
					GameClient.mouseClickTicker = 0;
					OutgoingPacketBuffer outgoingPacketBuffer = Class18.method359(OutgoingPacket.INTERFACE_ON_PLAYER, ConnectionType.gameConnection.encryptor);
					outgoingPacketBuffer.payload.writeShort(1408085039 * GameClient.itemID);
					outgoingPacketBuffer.payload.writeShort((Player.myPlayer.entityIndex) * 1888274983);
					outgoingPacketBuffer.payload.writeIntV2(Class379.interfaceHash * 1262526353);
					outgoingPacketBuffer.payload.writeShortLE128(GameClient.containerComponent * 392084321);
					outgoingPacketBuffer.payload.write128Byte(Class151.method1644(-1804963392) ? 1 : 0);
					ConnectionType.gameConnection.sendFrame(outgoingPacketBuffer);
				}
				if (optionID == 17) {
					GameClient.anInt8784 = 143636043 * i;
					GameClient.anInt8785 = i_30_ * 381532777;
					GameClient.mouseClickTargetType = 554324810;
					GameClient.mouseClickTicker = 0;
					OutgoingPacketBuffer outgoingPacketBuffer = Class18.method359(OutgoingPacket.aClass198_2062, ConnectionType.gameConnection.encryptor);
					outgoingPacketBuffer.payload.method3617(Class151.method1644(1934855379) ? 1 : 0);
					outgoingPacketBuffer.payload.writeShortLE128(1408085039 * GameClient.itemID);
					outgoingPacketBuffer.payload.writeShortLE128(dynamicChildIndex + gameScene.gameSceneBaseX * -1760580017);
					outgoingPacketBuffer.payload.writeShort128(283514611 * gameScene.gameSceneBaseY + interfaceHash);
					outgoingPacketBuffer.payload.writeIntLE(1262526353 * Class379.interfaceHash);
					outgoingPacketBuffer.payload.writeShort128(GameClient.containerComponent * 392084321);
					outgoingPacketBuffer.payload.writeShortLE128(playerIndex);
					ConnectionType.gameConnection.sendFrame(outgoingPacketBuffer);
					StaticMethods.method4654(dynamicChildIndex, interfaceHash);
				}
				if (58 == optionID) {
					IComponentDefinition component = IComponentDefinition.getContainerComponent(interfaceHash, dynamicChildIndex);
					if (component != null)
						StaticMethods.method5643(component);
				}
				OutgoingPacket class198_37_ = null;
				if (9 == optionID)
					class198_37_ = OutgoingPacket.NPC_CLICK1_PACKET;
				else if (optionID == 10)
					class198_37_ = OutgoingPacket.ATTACK_NPC_PACKET;
				else if (11 == optionID)
					class198_37_ = OutgoingPacket.NPC_CLICK2_PACKET;
				else if (12 == optionID)
					class198_37_ = OutgoingPacket.NPC_CLICK3_PACKET;
				else if (optionID == 13)
					class198_37_ = OutgoingPacket.NPC_CLICK4_PACKET;
				else if (optionID == 1003)
					class198_37_ = OutgoingPacket.NPC_EXAMINE_PACKET;
				if (null != class198_37_) {
					ObjectNode class298_sub29 = ((ObjectNode) GameClient.entityList.get((long) playerIndex));
					if (null != class298_sub29) {
						NPC npc = ((NPC) class298_sub29.nodeObject);
						if (class198_37_ != OutgoingPacket.NPC_EXAMINE_PACKET) {
							Skybox.sendWalkPacket(Class336.method3963((npc.scenePositionXQueue[0]), (npc.scenePositionYQueue[0]), npc.getSize(), npc.getSize(), 0));
						}
						GameClient.anInt8784 = 143636043 * i;
						GameClient.anInt8785 = i_30_ * 381532777;
						GameClient.mouseClickTargetType = 554324810;
						GameClient.mouseClickTicker = 0;
						OutgoingPacketBuffer outgoingPacketBuffer = Class18.method359(class198_37_, (ConnectionType.gameConnection.encryptor));
						outgoingPacketBuffer.payload.writeShort128(playerIndex);
						outgoingPacketBuffer.payload.write128Byte(Class151.method1644(1824393579) ? 1 : 0);
						ConnectionType.gameConnection.sendFrame(outgoingPacketBuffer);
						Class82_Sub21.method938(npc.scenePositionXQueue[0], npc.scenePositionYQueue[0], true, Class336.method3963((npc.scenePositionXQueue[0]), (npc.scenePositionYQueue[0]), npc.getSize(), npc.getSize(), 0));
					}
				}
				OutgoingPacket packet = null;
				if (3 == optionID)
					packet = OutgoingPacket.OBJECT_CLICK1_PACKET;
				else if (4 == optionID)
					packet = OutgoingPacket.OBJECT_CLICK2_PACKET;
				else if (5 == optionID)
					packet = OutgoingPacket.OBJECT_CLICK3_PACKET;
				else if (6 == optionID)
					packet = OutgoingPacket.OBJECT_CLICK4_PACKET;
				else if (1001 == optionID)
					packet = OutgoingPacket.OBJECT_CLICK5_PACKET;
				else if (1002 == optionID)
					packet = OutgoingPacket.EXAMINE_OBJECT_PACKET;
				if (packet != null) {
					GameClient.anInt8784 = 143636043 * i;
					GameClient.anInt8785 = i_30_ * 381532777;
					GameClient.mouseClickTargetType = 554324810;
					GameClient.mouseClickTicker = 0;

					if (OutgoingPacket.EXAMINE_OBJECT_PACKET != packet) {
						int i_3_ = (int) l >> 14 & 0x1f;
						int i_4_ = (int) l >> 20 & 0x3;
						int i_5_ = (int) (l >>> 32) & 0x7fffffff;
						Class424 class424 = ((Class424) StaticMethods.method5701(Class336_Sub6.method4108(), i_3_));
						Class336 class336;
						if (Class424.aClass424_6611 == class424 || Class424.aClass424_6604 == class424 || Class424.aClass424_6610 == class424) {
							ObjectDefinition class432 = GameClient.myRegion.getObjectDefinitionLoader().get(i_5_);
							int i_6_;
							int i_7_;
							if (0 == i_4_ || i_4_ == 2) {
								i_6_ = -1125834887 * class432.sizeX;
								i_7_ = -565161399 * class432.sizeY;
							} else {
								i_6_ = -565161399 * class432.sizeY;
								i_7_ = class432.sizeX * -1125834887;
							}
							if (i_4_ == 0) {
								/* empty */
							}
							class336 = Class336_Sub5.method4105(dynamicChildIndex, interfaceHash, i_6_, i_7_, Class424.aClass424_6614, 0, 1300552038);
						} else if (Class82_Sub9.method900(-1976050083 * class424.type, (byte) 28))
							class336 = Class336_Sub5.method4105(dynamicChildIndex, interfaceHash, 0, 0, class424, i_4_, 740164949);
						else
							class336 = Class194.method1867(dynamicChildIndex, interfaceHash, 0, 0, class424, i_4_, (byte) -22);
						Skybox.sendWalkPacket(class336);
					}
					OutgoingPacketBuffer outgoingPacketBuffer = Class18.method359(packet, ConnectionType.gameConnection.encryptor);
					outgoingPacketBuffer.payload.writeByte128(Class151.method1644(1030396767) ? 1 : 0);
					outgoingPacketBuffer.payload.writeIntLE((int) (l >>> 32) & 0x7fffffff);
					outgoingPacketBuffer.payload.writeShortLE(dynamicChildIndex + gameScene.gameSceneBaseX * -1760580017);
					outgoingPacketBuffer.payload.writeShortLE128(gameScene.gameSceneBaseY * 283514611 + interfaceHash);
					ConnectionType.gameConnection.sendFrame(outgoingPacketBuffer);
					ComponentMouseRecorder.method1013(dynamicChildIndex, interfaceHash, l);
				}
				if (8 == optionID) {
					ObjectNode class298_sub29 = ((ObjectNode) GameClient.entityList.get((long) playerIndex));
					if (class298_sub29 != null) {
						NPC npc = ((NPC) class298_sub29.nodeObject);
						Skybox.sendWalkPacket(Class336.method3963((npc.scenePositionXQueue[0]), (npc.scenePositionYQueue[0]), npc.getSize(), npc.getSize(), 0));
						GameClient.anInt8784 = 143636043 * i;
						GameClient.anInt8785 = i_30_ * 381532777;
						GameClient.mouseClickTargetType = 554324810;
						GameClient.mouseClickTicker = 0;
						OutgoingPacketBuffer outgoingPacketBuffer = Class18.method359(OutgoingPacket.INTERFACE_ON_NPC, (ConnectionType.gameConnection.encryptor));
						outgoingPacketBuffer.payload.writeByte(Class151.method1644(-510062351) ? 1 : 0);
						outgoingPacketBuffer.payload.writeInt(1262526353 * Class379.interfaceHash);
						outgoingPacketBuffer.payload.writeShortLE(playerIndex);
						outgoingPacketBuffer.payload.writeShortLE128(GameClient.containerComponent * 392084321);
						outgoingPacketBuffer.payload.writeShortLE(1408085039 * GameClient.itemID);
						ConnectionType.gameConnection.sendFrame(outgoingPacketBuffer);
						Class82_Sub21.method938(npc.scenePositionXQueue[0], npc.scenePositionYQueue[0], true, Class336.method3963((npc.scenePositionXQueue[0]), (npc.scenePositionYQueue[0]), npc.getSize(), npc.getSize(), 0));
					}
				}
				if (25 == optionID) {
					IComponentDefinition class105 = IComponentDefinition.getContainerComponent(interfaceHash, dynamicChildIndex);
					if (class105 != null) {
						IComponentDefinition.method1587();
						IComponentSettings IComponentSettings = GameClient.getComponentSettings(class105);
						StaticMethods.method1600(class105, IComponentSettings.method3497(), (IComponentSettings.anInt7410 * -1133219011));
						GameClient.selectedInterfaceOption = Class88.method977(class105, -447348156);
						if (null == GameClient.selectedInterfaceOption)
							GameClient.selectedInterfaceOption = "Null";
						GameClient.aString8754 = new StringBuilder().append(class105.opBase).append(ColorUtils.htmlToHex(16777215)).toString();
					}
				} else {
					if (15 == optionID) {
						Player player = (GameClient.entities[playerIndex]);
						if (null != player) {
							Skybox.sendWalkPacket(Class336.method3963((player.scenePositionXQueue[0]), (player.scenePositionYQueue[0]), player.getSize(), player.getSize(), 0));
							GameClient.anInt8784 = i * 143636043;
							GameClient.anInt8785 = i_30_ * 381532777;
							GameClient.mouseClickTargetType = 554324810;
							GameClient.mouseClickTicker = 0;
							OutgoingPacketBuffer outgoingPacketBuffer = Class18.method359(OutgoingPacket.INTERFACE_ON_PLAYER, (ConnectionType.gameConnection.encryptor));
							outgoingPacketBuffer.payload.writeShort(GameClient.itemID * 1408085039);
							outgoingPacketBuffer.payload.writeShort(playerIndex);
							outgoingPacketBuffer.payload.writeIntV2(Class379.interfaceHash * 1262526353);
							outgoingPacketBuffer.payload.writeShortLE128(392084321 * GameClient.containerComponent);
							outgoingPacketBuffer.payload.write128Byte(Class151.method1644(1486448273) ? 1 : 0);
							ConnectionType.gameConnection.sendFrame(outgoingPacketBuffer);
							Class82_Sub21.method938((player.scenePositionXQueue[0]), (player.scenePositionYQueue[0]), true, (Class336.method3963((player.scenePositionXQueue[0]), (player.scenePositionYQueue[0]), player.getSize(), player.getSize(), 0)));
						}
					}
					if (optionID == 60) {
						if (GameClient.localPrivilege * 1806357379 > 0 && Class434.method5802(838408640))
							StaticMethods.method6083((Player.myPlayer.plane), gameScene.gameSceneBaseX * -1760580017 + dynamicChildIndex, 283514611 * gameScene.gameSceneBaseY + interfaceHash);
						else {
							GameClient.anInt8784 = i * 143636043;
							GameClient.anInt8785 = 381532777 * i_30_;
							GameClient.mouseClickTargetType = 277162405;
							GameClient.mouseClickTicker = 0;
							OutgoingPacketBuffer outgoingPacketBuffer = Class18.method359(OutgoingPacket.aClass198_2082, (ConnectionType.gameConnection.encryptor));
							outgoingPacketBuffer.payload.writeShort(gameScene.gameSceneBaseY * 283514611 + interfaceHash);
							outgoingPacketBuffer.payload.writeShort128(-1760580017 * gameScene.gameSceneBaseX + dynamicChildIndex);
							ConnectionType.gameConnection.sendFrame(outgoingPacketBuffer);
						}
					}
					if (GameClient.interfaceSelected)
						IComponentDefinition.method1587();
					if (null != Class236.aClass105_2606 && 0 == -2018194505 * GameClient.anInt8788)
						StaticMethods.updateComponentTick(Class236.aClass105_2606);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("qq.bs(").append(')').toString());
		}
	}

	static final void method4940(ScriptRuntime runtime) {
		try {
			runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = -1372893999 * Class360.anInt3871;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("qq.aho(").append(')').toString());
		}
	}
}
