package com.jagex;/* Class315 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class315 {
	static Class336_Sub5 aClass336_Sub5_3304 = new Class336_Sub5();
	static Class336_Sub4 aClass336_Sub4_3305 = new Class336_Sub4();
	static short aShort3306;
	static Class336_Sub6 aClass336_Sub6_3307 = new Class336_Sub6();
	static Class336_Sub1 aClass336_Sub1_3308 = new Class336_Sub1();
	static Class336_Sub2 aClass336_Sub2_3309 = new Class336_Sub2();
	static Class336_Sub3 aClass336_Sub3_3310 = new Class336_Sub3();

	Class315() throws Throwable {
		throw new Error();
	}

	public static int method3833(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
		try {
			if (1 == (i_4_ & 0x1)) {
				int i_6_ = i_2_;
				i_2_ = i_3_;
				i_3_ = i_6_;
			}
			i_1_ &= 0x3;
			if (0 == i_1_)
				return i_0_;
			if (i_1_ == 1)
				return 7 - i - (i_2_ - 1);
			if (i_1_ == 2)
				return 7 - i_0_ - (i_3_ - 1);
			return i;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("nd.k(").append(')').toString());
		}
	}

	static final void method3834(SubIncommingPacket subIncommingPacket) {
		try {
			RsBitsBuffer buffer = ConnectionType.gameConnection.bitsBuffer;
			if (SubIncommingPacket.aClass206_2347 == subIncommingPacket) {
				int animationID = buffer.readIntV2();
				int i_8_ = buffer.readUnsignedByte128();
				int type = i_8_ >> 2;
				int rotation = i_8_ & 0x3;
				int i_11_ = GameClient.anIntArray8739[type];
				int tileHash = buffer.readUnsignedByteC();
				int localX = 134435705 * Class162.baseTileX + (tileHash >> 4 & 0x7);
				int localY = (tileHash & 0x7) + -105526719 * Class216.baseTileY;
				if (GameClient.myRegion.method2674() != MapLoad.CUTSCENE_MAP)
					StaticMethods.sendObjectAnimation(GameMap.basePlane * -191892109, localX, localY, i_11_, type, rotation, animationID);
			} else if (SubIncommingPacket.aClass206_2354 == subIncommingPacket) {
				int i_15_ = buffer.readUnsigned128Byte();
				int size_Models = i_15_ >> 2;
				int i_17_ = GameClient.anIntArray8739[size_Models];
				int i_18_ = buffer.readUnsigned128Byte();
				int i_19_ = (i_18_ >> 4 & 0x7) + 134435705 * Class162.baseTileX;
				int i_20_ = (i_18_ & 0x7) + Class216.baseTileY * -105526719;
				int objectID = buffer.readIntLE();
				ObjectDefinition objectDefinition = GameClient.myRegion.getObjectDefinitionLoader().get(objectID);
				int i_22_ = buffer.readUnsignedByte128();
				if (size_Models == -1976050083 * Class424.aClass424_6604.type)
					size_Models = Class424.aClass424_6611.type * -1976050083;
				int modelAmt = 0;
				if (objectDefinition.types != null) {
					int i_24_ = -1;
					for (int index = 0; index < objectDefinition.types.length; index++) {
						if (size_Models == objectDefinition.types[index]) {
							i_24_ = index;
							break;
						}
					}
					modelAmt = objectDefinition.modelIDs[i_24_].length;
				}
				int i_26_ = 0;
				if (null != objectDefinition.aShortArray5367)
					i_26_ = objectDefinition.aShortArray5367.length;
				int i_27_ = 0;
				if (null != objectDefinition.aShortArray5373)
					i_27_ = objectDefinition.aShortArray5373.length;
				if (1 == (i_22_ & 0x1))
					Class370.method4579(-191892109 * GameMap.basePlane, i_19_, i_20_, i_17_, objectID, size_Models, null, (byte) -43);
				else {
					int[] is = null;
					if ((i_22_ & 0x2) == 2) {
						is = new int[modelAmt];
						for (int i_28_ = 0; i_28_ < modelAmt; i_28_++)
							is[i_28_] = buffer.readInt();
					}
					short[] is_29_ = null;
					if (4 == (i_22_ & 0x4)) {
						is_29_ = new short[i_26_];
						for (int i_30_ = 0; i_30_ < i_26_; i_30_++)
							is_29_[i_30_] = (short) buffer.readUShort();
					}
					short[] is_31_ = null;
					if (8 == (i_22_ & 0x8)) {
						is_31_ = new short[i_27_];
						for (int i_32_ = 0; i_32_ < i_27_; i_32_++)
							is_31_[i_32_] = (short) buffer.readUShort();
					}
					Class370.method4579(-191892109 * GameMap.basePlane, i_19_, i_20_, i_17_, objectID, size_Models, new Class435((ObjectDeque.objectKey * -5796734886992507517L), is, is_29_, is_31_), (byte) 8);
					ObjectDeque.objectKey += 2843605614692854059L;
				}
			} else if (subIncommingPacket == SubIncommingPacket.DESTROY_OBJECT_PACKET) {
				int typeHash = buffer.readUnsignedByteC();
				int type = typeHash >> 2;
				int rotation = typeHash & 0x3;
				int i_36_ = GameClient.anIntArray8739[type];
				int posHash = buffer.readUnsignedByte128();
				int localX = (posHash >> 4 & 0x7) + 134435705 * Class162.baseTileX;
				int localY = (posHash & 0x7) + Class216.baseTileY * -105526719;
				if (GameClient.myRegion.method2674().isNormalMapScene() || (localX >= 0 && localY >= 0 && (localX < GameClient.myRegion.getMapWidth()) && (localY < GameClient.myRegion.getMapLength())))
					Class420.spawnObject(-191892109 * GameMap.basePlane, localX, localY, i_36_, -1, type, rotation);
			} else if (SubIncommingPacket.PROJECTILE_PACKET == subIncommingPacket) {
				int senderIndex = buffer.readUByte();
				boolean isNotSame = (senderIndex & 0x80) != 0;
				int startX = Class162.baseTileX * 134435705 + (senderIndex >> 3 & 0x7);
				int startY = (senderIndex & 0x7) + Class216.baseTileY * -105526719;
				int endX = startX + buffer.readByte();
				int endY = startY + buffer.readByte();
				int i_45_ = buffer.readShort();
				int i_46_ = buffer.readUShort();
				int i_47_ = buffer.readUByte() * 4;
				int i_48_ = buffer.readUByte() * 4;
				int i_49_ = buffer.readUShort();
				int i_50_ = buffer.readUShort();
				int i_51_ = buffer.readUByte();
				int i_52_ = buffer.readUShort();
				if (i_51_ == 255)
					i_51_ = -1;
				if (GameClient.myRegion.method2674() != MapLoad.CUTSCENE_MAP) {
					if (startX >= 0 && startY >= 0 && (startX < GameClient.myRegion.getMapWidth()) && startY < GameClient.myRegion.getMapLength() && endX >= 0 && endY >= 0 && (endX < GameClient.myRegion.getMapWidth()) && (endY < GameClient.myRegion.getMapLength()) && i_46_ != 65535) {
						startX = 256 + 512 * startX;
						startY = 256 + 512 * startY;
						endX = 256 + endX * 512;
						endY = endY * 512 + 256;
						i_47_ <<= 2;
						i_48_ <<= 2;
						i_52_ <<= 2;
						Projectile projectile = (new Projectile(GameClient.myRegion.getRegion(), i_46_, -191892109 * GameMap.basePlane, GameMap.basePlane * -191892109, startX, startY, i_47_, i_49_ + GameClient.clientTick * 443738891, GameClient.clientTick * 443738891 + i_50_, i_51_, i_52_, 0, i_45_, i_48_, isNotSame, -1));
						projectile.method4405(endX, endY, Class356.getAverageHeight(endX, endY, (-191892109 * GameMap.basePlane), -1671970391) - i_48_, 443738891 * GameClient.clientTick + i_49_);
						GameClient.aClass453_8824.pushBack(new Class298_Sub37_Sub2(projectile));
					}
				}
			} else if (subIncommingPacket == SubIncommingPacket.SEND_GROUND_ITEM_PACKET) {
				int i_53_ = buffer.readUnsignedByte128();
				GameScene gameScene = GameClient.myRegion.getGameScene();
				int i_54_ = (i_53_ & 0x7) + -105526719 * Class216.baseTileY;
				int i_55_ = i_54_ + gameScene.gameSceneBaseY * 283514611;
				int i_56_ = Class162.baseTileX * 134435705 + (i_53_ >> 4 & 0x7);
				int i_57_ = gameScene.gameSceneBaseX * -1760580017 + i_56_;
				int i_58_ = buffer.readUnsignedShortLE128();
				int i_59_ = buffer.readUnsignedShortLE();
				boolean bool = (i_56_ >= 0 && i_54_ >= 0 && i_56_ < GameClient.myRegion.getMapWidth() && (i_54_ < GameClient.myRegion.getMapLength()));
				if (bool || GameClient.myRegion.method2674().isNormalMapScene()) {
					ItemDefinition.method5576(GameMap.basePlane * -191892109, i_57_, i_55_, new Class298_Sub12(i_59_, i_58_), -369193084);
					if (bool)
						Class173.method1820(-191892109 * GameMap.basePlane, i_56_, i_54_, 1649431547);
				}
			} else if (subIncommingPacket == SubIncommingPacket.aClass206_2348) {
				int i_60_ = buffer.readInt();
				int i_61_ = buffer.readUByte();
				GameClient.myRegion.getObjectDefinitionLoader().get(i_60_).method5771(i_61_);
			} else if (SubIncommingPacket.aClass206_2357 == subIncommingPacket) {
				int i_62_ = buffer.readUByte();
				GameScene gameScene = GameClient.myRegion.getGameScene();
				int i_63_ = -105526719 * Class216.baseTileY + (i_62_ & 0x7);
				int i_64_ = 283514611 * gameScene.gameSceneBaseY + i_63_;
				int i_65_ = (i_62_ >> 4 & 0x7) + 134435705 * Class162.baseTileX;
				int i_66_ = i_65_ + -1760580017 * gameScene.gameSceneBaseX;
				int i_67_ = buffer.readUShort();
				int i_68_ = buffer.readUShort();
				int i_69_ = buffer.readUShort();
				if (null != GameClient.aClass437_8685) {
					Class298_Sub2 class298_sub2 = ((Class298_Sub2) (GameClient.aClass437_8685.get((long) (-191892109 * GameMap.basePlane << 28 | i_64_ << 14 | i_66_))));
					if (class298_sub2 != null) {
						for (Class298_Sub12 class298_sub12 = ((Class298_Sub12) class298_sub2.aClass453_7166.method5939()); null != class298_sub12; class298_sub12 = (Class298_Sub12) class298_sub2.aClass453_7166.method5944()) {
							if ((class298_sub12.anInt7257 * 1768239597 == (i_67_ & 0x7fff)) && (567630807 * class298_sub12.anInt7256 == i_68_)) {
								class298_sub12.unlink();
								class298_sub12.anInt7256 = i_69_ * -1076181017;
								ItemDefinition.method5576((GameMap.basePlane * -191892109), i_66_, i_64_, class298_sub12, -2035381169);
								break;
							}
						}
						if (i_65_ >= 0 && i_63_ >= 0 && i_65_ < GameClient.myRegion.getMapWidth() && i_63_ < GameClient.myRegion.getMapLength())
							Class173.method1820((-191892109 * GameMap.basePlane), i_65_, i_63_, 1760601086);
					}
				}
			} else if (subIncommingPacket == SubIncommingPacket.TILE_MESSAGE_PACKET) {
				buffer.readUByte();
				int i_70_ = buffer.readUByte();
				int i_71_ = (i_70_ >> 4 & 0x7) + Class162.baseTileX * 134435705;
				int i_72_ = (i_70_ & 0x7) + -105526719 * Class216.baseTileY;
				int i_73_ = buffer.readUShort();
				int i_74_ = buffer.readUByte();
				int i_75_ = buffer.readUTriByte();
				String string = buffer.readString();
				if (GameClient.myRegion.method2674() != MapLoad.CUTSCENE_MAP)
					StaticMethods.method3687(-191892109 * GameMap.basePlane, i_71_, i_72_, i_74_, i_73_, i_75_, string);
			} else if (subIncommingPacket == SubIncommingPacket.SPAWN_OBJECT_PACKET) {
				int posHash = buffer.readUByte();
				int localX = 134435705 * Class162.baseTileX + (posHash >> 4 & 0x7);
				int localY = -105526719 * Class216.baseTileY + (posHash & 0x7);
				int typeHash = buffer.readUByte();
				int type = typeHash >> 2;
				int rotation = typeHash & 0x3;
				int i_82_ = GameClient.anIntArray8739[type];
				int objectID = buffer.readIntLE();
				if (GameClient.myRegion.method2674().isNormalMapScene() || (localX >= 0 && localY >= 0 && (localX < GameClient.myRegion.getMapWidth()) && (localY < GameClient.myRegion.getMapLength())))
					Class420.spawnObject(-191892109 * GameMap.basePlane, localX, localY, i_82_, objectID, type, rotation);
			} else if (SubIncommingPacket.aClass206_2343 == subIncommingPacket) {
				int targetIndex = buffer.readUnsignedShort128();
				int i_85_ = buffer.readUnsignedShortLE();
				int i_86_ = buffer.readUShort();
				int i_87_ = buffer.readUByte();
				GameScene gameScene = GameClient.myRegion.getGameScene();
				int baseTileY = -105526719 * Class216.baseTileY + (i_87_ & 0x7);
				int gameSceneBaseY = gameScene.gameSceneBaseY * 283514611 + baseTileY;
				int baseTileX = Class162.baseTileX * 134435705 + (i_87_ >> 4 & 0x7);
				int gameSceneBaseX = -1760580017 * gameScene.gameSceneBaseX + baseTileX;
				if (targetIndex != -442628795 * GameClient.playerIndex) {
					boolean bool = (baseTileX >= 0 && baseTileY >= 0 && baseTileX < GameClient.myRegion.getMapWidth() && baseTileY < GameClient.myRegion.getMapLength());
					if (bool || GameClient.myRegion.method2674().isNormalMapScene()) {
						ItemDefinition.method5576(-191892109 * GameMap.basePlane, gameSceneBaseX, gameSceneBaseY, new Class298_Sub12(i_85_, i_86_), 1214818737);
						if (bool)
							Class173.method1820((GameMap.basePlane * -191892109), baseTileX, baseTileY, 1328737922);
					}
				}
			} else if (SubIncommingPacket.aClass206_2346 == subIncommingPacket) {
				int i_92_ = buffer.readUByte();
				int i_93_ = 268871410 * Class162.baseTileX + (i_92_ >> 4 & 0xf);
				int i_94_ = -211053438 * Class216.baseTileY + (i_92_ & 0xf);
				int i_95_ = buffer.readUByte();
				boolean bool = (i_95_ & 0x1) != 0;
				boolean bool_96_ = (i_95_ & 0x2) != 0;
				int i_97_ = bool_96_ ? i_95_ >> 2 : -1;
				int i_98_ = i_93_ + buffer.readByte();
				int i_99_ = i_94_ + buffer.readByte();
				int i_100_ = buffer.readShort();
				int i_101_ = buffer.readShort();
				int i_102_ = buffer.readUShort();
				int i_103_ = buffer.readUByte();
				if (bool_96_)
					i_103_ = (byte) i_103_;
				else
					i_103_ *= 4;
				int i_104_ = buffer.readUByte() * 4;
				int i_105_ = buffer.readUShort();
				int i_106_ = buffer.readUShort();
				int i_107_ = buffer.readUByte();
				int i_108_ = buffer.readUShort();
				if (i_107_ == 255)
					i_107_ = -1;
				if (GameClient.myRegion.method2674() != MapLoad.CUTSCENE_MAP) {
					if (i_93_ >= 0 && i_94_ >= 0 && i_93_ < GameClient.myRegion.getMapWidth() * 2 && i_94_ < GameClient.myRegion.getMapWidth() * 2 && i_98_ >= 0 && i_99_ >= 0 && i_98_ < GameClient.myRegion.getMapLength() * 2 && (i_99_ < GameClient.myRegion.getMapLength() * 2) && 65535 != i_102_) {
						i_93_ *= 256;
						i_94_ = 256 * i_94_;
						i_98_ = 256 * i_98_;
						i_99_ *= 256;
						i_103_ <<= 2;
						i_104_ <<= 2;
						i_108_ <<= 2;
						StaticMethods.method5818(i_102_, i_100_, i_101_, i_97_, i_103_, i_104_, i_93_, i_94_, i_98_, i_99_, i_105_, i_106_, i_107_, i_108_, bool);
					}
				}
			} else if (SubIncommingPacket.aClass206_2353 == subIncommingPacket) {
				int i_109_ = buffer.readUByte();
				int i_110_ = Class162.baseTileX * 134435705 + (i_109_ >> 4 & 0x7);
				int i_111_ = Class216.baseTileY * -105526719 + (i_109_ & 0x7);
				int i_112_ = buffer.readUShort();
				if (65535 == i_112_)
					i_112_ = -1;
				int i_113_ = buffer.readUByte();
				int i_114_ = i_113_ >> 4 & 0xf;
				int i_115_ = i_113_ & 0x7;
				int i_116_ = buffer.readUByte();
				int i_117_ = buffer.readUByte();
				int i_118_ = buffer.readUShort();
				if (GameClient.myRegion.method2674() != MapLoad.CUTSCENE_MAP) {
					if (i_110_ >= 0 && i_111_ >= 0 && (i_110_ < GameClient.myRegion.getMapWidth()) && (i_111_ < GameClient.myRegion.getMapLength())) {
						int i_119_ = 1 + i_114_;
						if ((Player.myPlayer.scenePositionXQueue[0]) >= i_110_ - i_119_ && (Player.myPlayer.scenePositionXQueue[0]) <= i_119_ + i_110_ && (Player.myPlayer.scenePositionYQueue[0]) >= i_111_ - i_119_ && (Player.myPlayer.scenePositionYQueue[0]) <= i_119_ + i_111_)
							Class69.method789(i_112_, i_115_, i_116_, i_117_, ((-191892109 * GameMap.basePlane << 24) + (i_110_ << 16) + (i_111_ << 8) + i_114_), i_118_, -1062229425);
					}
				}
			} else if (subIncommingPacket == SubIncommingPacket.aClass206_2356) {
				int i_120_ = buffer.readUByte();
				int i_121_ = 134435705 * Class162.baseTileX + (i_120_ >> 4 & 0x7);
				int i_122_ = (i_120_ & 0x7) + -105526719 * Class216.baseTileY;
				int i_123_ = buffer.readUShort();
				if (i_123_ == 65535)
					i_123_ = -1;
				int i_124_ = buffer.readUShort();
				int i_125_ = buffer.readUShort();
				int i_126_ = buffer.readUByte();
				if (GameClient.myRegion.method2674() != MapLoad.CUTSCENE_MAP) {
					if (i_121_ >= 0 && i_122_ >= 0 && (i_121_ < GameClient.myRegion.getMapWidth()) && (i_122_ < GameClient.myRegion.getMapLength())) {
						if (-1 == i_123_) {
							Class298_Sub37_Sub3 class298_sub37_sub3 = ((Class298_Sub37_Sub3) (GameClient.aClass437_8825.get((long) (i_121_ << 16 | i_122_))));
							if (class298_sub37_sub3 != null) {
								class298_sub37_sub3.aClass365_Sub1_Sub1_Sub3_9578.method4480((byte) 26);
								class298_sub37_sub3.unlink();
							}
						} else {
							int i_127_ = 256 + i_121_ * 512;
							int i_128_ = i_122_ * 512 + 256;
							int i_129_ = GameMap.basePlane * -191892109;
							if (i_129_ < 3 && GameClient.myRegion.method2654().method2320(i_121_, i_122_))
								i_129_++;
							Class365_Sub1_Sub1_Sub3 class365_sub1_sub1_sub3 = (new Class365_Sub1_Sub1_Sub3(GameClient.myRegion.getRegion(), i_123_, i_125_, -191892109 * GameMap.basePlane, i_129_, i_127_, Class356.getAverageHeight(i_127_, i_128_, (GameMap.basePlane * -191892109), -1861382449) - i_124_, i_128_, i_121_, i_121_, i_122_, i_122_, i_126_, false));
							GameClient.aClass437_8825.connect((new Class298_Sub37_Sub3(class365_sub1_sub1_sub3)), (long) (i_121_ << 16 | i_122_));
						}
					}
				}
			} else if (SubIncommingPacket.aClass206_2342 == subIncommingPacket) {
				int i_130_ = buffer.readUByte();
				int i_131_ = (i_130_ >> 4 & 0x7) + 134435705 * Class162.baseTileX;
				int i_132_ = (i_130_ & 0x7) + -105526719 * Class216.baseTileY;
				int i_133_ = buffer.readUShort();
				if (65535 == i_133_)
					i_133_ = -1;
				int i_134_ = buffer.readUByte();
				int i_135_ = i_134_ >> 4 & 0xf;
				int i_136_ = i_134_ & 0x7;
				int i_137_ = buffer.readUByte();
				int i_138_ = buffer.readUByte();
				int i_139_ = buffer.readUShort();
				boolean bool = buffer.readUByte() == 1;
				if (GameClient.myRegion.method2674() != MapLoad.CUTSCENE_MAP) {
					if (i_131_ >= 0 && i_132_ >= 0 && (i_131_ < GameClient.myRegion.getMapWidth()) && (i_132_ < GameClient.myRegion.getMapLength())) {
						int i_140_ = i_135_ + 1;
						if ((Player.myPlayer.scenePositionXQueue[0]) >= i_131_ - i_140_ && (Player.myPlayer.scenePositionXQueue[0]) <= i_140_ + i_131_ && (Player.myPlayer.scenePositionYQueue[0]) >= i_132_ - i_140_ && (Player.myPlayer.scenePositionYQueue[0]) <= i_140_ + i_132_)
							Class336_Sub4.method4103(i_133_, i_136_, i_137_, i_138_, ((i_131_ << 16) + ((-191892109 * GameMap.basePlane) << 24) + (i_132_ << 8) + i_135_), bool, i_139_, -889648047);
					}
				}
			} else if (subIncommingPacket == SubIncommingPacket.REMOVE_GROUND_ITEM_PACKET) {
				int i_141_ = buffer.readUnsignedShortLE();
				int i_142_ = buffer.readUnsigned128Byte();
				GameScene gameScene = GameClient.myRegion.getGameScene();
				int i_143_ = Class216.baseTileY * -105526719 + (i_142_ & 0x7);
				int i_144_ = 283514611 * gameScene.gameSceneBaseY + i_143_;
				int i_145_ = 134435705 * Class162.baseTileX + (i_142_ >> 4 & 0x7);
				int i_146_ = i_145_ + -1760580017 * gameScene.gameSceneBaseX;
				Class298_Sub2 class298_sub2 = ((Class298_Sub2) (GameClient.aClass437_8685.get((long) (GameMap.basePlane * -191892109 << 28 | i_144_ << 14 | i_146_))));
				if (class298_sub2 != null) {
					for (Class298_Sub12 class298_sub12 = (Class298_Sub12) class298_sub2.aClass453_7166.method5939(); class298_sub12 != null; class298_sub12 = (Class298_Sub12) class298_sub2.aClass453_7166.method5944()) {
						if ((i_141_ & 0x7fff) == class298_sub12.anInt7257 * 1768239597) {
							class298_sub12.unlink();
							break;
						}
					}
					if (class298_sub2.aClass453_7166.method5946())
						class298_sub2.unlink();
					if (i_145_ >= 0 && i_143_ >= 0 && (i_145_ < GameClient.myRegion.getMapWidth()) && (i_143_ < GameClient.myRegion.getMapLength()))
						Class173.method1820(GameMap.basePlane * -191892109, i_145_, i_143_, 547814341);
				}
			} else {
				IPAddress.reportError(new StringBuilder().append("").append(subIncommingPacket).toString(), new RuntimeException());
				StaticMethods.method2001(false);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("nd.jh(").append(')').toString());
		}
	}

	static void method3835(int i, int i_147_, int i_148_, int i_149_, int i_150_, byte i_151_) {
		try {
			if (i_148_ <= Class372_Sub3.anInt4050 * -1062447355 && i_149_ >= 1155384281 * Class372_Sub3.anInt4049) {
				boolean bool;
				if (i < Class372_Sub3.anInt4051 * -1424479739) {
					i = Class372_Sub3.anInt4051 * -1424479739;
					bool = false;
				} else if (i > Class372_Sub3.anInt4048 * 1135094847) {
					i = 1135094847 * Class372_Sub3.anInt4048;
					bool = false;
				} else
					bool = true;
				boolean bool_152_;
				if (i_147_ < -1424479739 * Class372_Sub3.anInt4051) {
					i_147_ = -1424479739 * Class372_Sub3.anInt4051;
					bool_152_ = false;
				} else if (i_147_ > Class372_Sub3.anInt4048 * 1135094847) {
					i_147_ = 1135094847 * Class372_Sub3.anInt4048;
					bool_152_ = false;
				} else
					bool_152_ = true;
				if (i_148_ >= Class372_Sub3.anInt4049 * 1155384281)
					Class82_Sub22.method940((Class372_Sub3.anIntArrayArray4047[i_148_++]), i, i_147_, i_150_);
				else
					i_148_ = Class372_Sub3.anInt4049 * 1155384281;
				if (i_149_ <= -1062447355 * Class372_Sub3.anInt4050)
					Class82_Sub22.method940((Class372_Sub3.anIntArrayArray4047[i_149_--]), i, i_147_, i_150_);
				else
					i_149_ = -1062447355 * Class372_Sub3.anInt4050;
				if (bool && bool_152_) {
					for (int i_153_ = i_148_; i_153_ <= i_149_; i_153_++) {
						int[] is = Class372_Sub3.anIntArrayArray4047[i_153_];
						is[i] = is[i_147_] = i_150_;
					}
				} else if (bool) {
					for (int i_154_ = i_148_; i_154_ <= i_149_; i_154_++)
						Class372_Sub3.anIntArrayArray4047[i_154_][i] = i_150_;
				} else if (bool_152_) {
					for (int i_155_ = i_148_; i_155_ <= i_149_; i_155_++)
						Class372_Sub3.anIntArrayArray4047[i_155_][i_147_] = i_150_;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("nd.h(").append(')').toString());
		}
	}

	static final void method3836(int i, int i_156_, int i_157_, int i_158_, int i_159_, int i_160_, byte i_161_) {
		try {
			StaticMethods.method1041(i_157_);
			int i_162_ = 0;
			int i_163_ = i_157_ - i_160_;
			if (i_163_ < 0)
				i_163_ = 0;
			int i_164_ = i_157_;
			int i_165_ = -i_157_;
			int i_166_ = i_163_;
			int i_167_ = -i_163_;
			int i_168_ = -1;
			int i_169_ = -1;
			if (i_156_ >= Class372_Sub1.anInt4049 * 1155384281 && i_156_ <= Class372_Sub1.anInt4050 * -1062447355) {
				int[] is = Class372_Sub1.anIntArrayArray4047[i_156_];
				int i_170_ = StaticMethods.method6012(i - i_157_, (-1424479739 * Class372_Sub1.anInt4051), 1135094847 * Class372_Sub1.anInt4048);
				int i_171_ = StaticMethods.method6012(i + i_157_, (Class372_Sub1.anInt4051 * -1424479739), 1135094847 * Class372_Sub1.anInt4048);
				int i_172_ = StaticMethods.method6012(i - i_163_, (-1424479739 * Class372_Sub1.anInt4051), Class372_Sub1.anInt4048 * 1135094847);
				int i_173_ = StaticMethods.method6012(i + i_163_, (Class372_Sub1.anInt4051 * -1424479739), 1135094847 * Class372_Sub1.anInt4048);
				Class82_Sub22.method940(is, i_170_, i_172_, i_159_);
				Class82_Sub22.method940(is, i_172_, i_173_, i_158_);
				Class82_Sub22.method940(is, i_173_, i_171_, i_159_);
			}
			while (i_164_ > i_162_) {
				i_168_ += 2;
				i_169_ += 2;
				i_165_ += i_168_;
				i_167_ += i_169_;
				if (i_167_ >= 0 && i_166_ >= 1) {
					i_166_--;
					i_167_ -= i_166_ << 1;
					Class372_Sub1.anIntArray7727[i_166_] = i_162_;
				}
				i_162_++;
				if (i_165_ >= 0) {
					i_164_--;
					i_165_ -= i_164_ << 1;
					int i_174_ = i_156_ - i_164_;
					int i_175_ = i_156_ + i_164_;
					if (i_175_ >= Class372_Sub1.anInt4049 * 1155384281 && i_174_ <= -1062447355 * Class372_Sub1.anInt4050) {
						if (i_164_ >= i_163_) {
							int i_176_ = (StaticMethods.method6012(i_162_ + i, Class372_Sub1.anInt4051 * -1424479739, 1135094847 * Class372_Sub1.anInt4048));
							int i_177_ = (StaticMethods.method6012(i - i_162_, Class372_Sub1.anInt4051 * -1424479739, 1135094847 * Class372_Sub1.anInt4048));
							if (i_175_ <= -1062447355 * Class372_Sub1.anInt4050)
								Class82_Sub22.method940((Class372_Sub1.anIntArrayArray4047[i_175_]), i_177_, i_176_, i_159_);
							if (i_174_ >= 1155384281 * Class372_Sub1.anInt4049)
								Class82_Sub22.method940((Class372_Sub1.anIntArrayArray4047[i_174_]), i_177_, i_176_, i_159_);
						} else {
							int i_178_ = Class372_Sub1.anIntArray7727[i_164_];
							int i_179_ = (StaticMethods.method6012(i_162_ + i, Class372_Sub1.anInt4051 * -1424479739, 1135094847 * Class372_Sub1.anInt4048));
							int i_180_ = StaticMethods.method6012(i - i_162_, (Class372_Sub1.anInt4051 * -1424479739), (Class372_Sub1.anInt4048 * 1135094847));
							int i_181_ = StaticMethods.method6012(i_178_ + i, (Class372_Sub1.anInt4051 * -1424479739), (Class372_Sub1.anInt4048 * 1135094847));
							int i_182_ = (StaticMethods.method6012(i - i_178_, -1424479739 * Class372_Sub1.anInt4051, 1135094847 * Class372_Sub1.anInt4048));
							if (i_175_ <= Class372_Sub1.anInt4050 * -1062447355) {
								int[] is = (Class372_Sub1.anIntArrayArray4047[i_175_]);
								Class82_Sub22.method940(is, i_180_, i_182_, i_159_);
								Class82_Sub22.method940(is, i_182_, i_181_, i_158_);
								Class82_Sub22.method940(is, i_181_, i_179_, i_159_);
							}
							if (i_174_ >= 1155384281 * Class372_Sub1.anInt4049) {
								int[] is = (Class372_Sub1.anIntArrayArray4047[i_174_]);
								Class82_Sub22.method940(is, i_180_, i_182_, i_159_);
								Class82_Sub22.method940(is, i_182_, i_181_, i_158_);
								Class82_Sub22.method940(is, i_181_, i_179_, i_159_);
							}
						}
					}
				}
				int i_183_ = i_156_ - i_162_;
				int i_184_ = i_156_ + i_162_;
				if (i_184_ >= Class372_Sub1.anInt4049 * 1155384281 && i_183_ <= -1062447355 * Class372_Sub1.anInt4050) {
					int i_185_ = i_164_ + i;
					int i_186_ = i - i_164_;
					if (i_185_ >= -1424479739 * Class372_Sub1.anInt4051 && i_186_ <= 1135094847 * Class372_Sub1.anInt4048) {
						i_185_ = StaticMethods.method6012(i_185_, (-1424479739 * Class372_Sub1.anInt4051), (1135094847 * Class372_Sub1.anInt4048));
						i_186_ = StaticMethods.method6012(i_186_, (Class372_Sub1.anInt4051 * -1424479739), (Class372_Sub1.anInt4048 * 1135094847));
						if (i_162_ < i_163_) {
							int i_187_ = (i_166_ < i_162_ ? Class372_Sub1.anIntArray7727[i_162_] : i_166_);
							int i_188_ = (StaticMethods.method6012(i + i_187_, Class372_Sub1.anInt4051 * -1424479739, 1135094847 * Class372_Sub1.anInt4048));
							int i_189_ = (StaticMethods.method6012(i - i_187_, -1424479739 * Class372_Sub1.anInt4051, Class372_Sub1.anInt4048 * 1135094847));
							if (i_184_ <= Class372_Sub1.anInt4050 * -1062447355) {
								int[] is = (Class372_Sub1.anIntArrayArray4047[i_184_]);
								Class82_Sub22.method940(is, i_186_, i_189_, i_159_);
								Class82_Sub22.method940(is, i_189_, i_188_, i_158_);
								Class82_Sub22.method940(is, i_188_, i_185_, i_159_);
							}
							if (i_183_ >= Class372_Sub1.anInt4049 * 1155384281) {
								int[] is = (Class372_Sub1.anIntArrayArray4047[i_183_]);
								Class82_Sub22.method940(is, i_186_, i_189_, i_159_);
								Class82_Sub22.method940(is, i_189_, i_188_, i_158_);
								Class82_Sub22.method940(is, i_188_, i_185_, i_159_);
							}
						} else {
							if (i_184_ <= Class372_Sub1.anInt4050 * -1062447355)
								Class82_Sub22.method940((Class372_Sub1.anIntArrayArray4047[i_184_]), i_186_, i_185_, i_159_);
							if (i_183_ >= Class372_Sub1.anInt4049 * 1155384281)
								Class82_Sub22.method940((Class372_Sub1.anIntArrayArray4047[i_183_]), i_186_, i_185_, i_159_);
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("nd.q(").append(')').toString());
		}
	}

	public static final boolean method3837() {
		try {
			return Class360.loginStep * -707576455 != 1;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("nd.k(").append(')').toString());
		}
	}

	public static void method3838(int i, int i_190_) {
		try {
			Class521.anInt6282 = -1444280763 * i;
			MouseTracker.aClass298_Sub50_Sub2Array9770 = new MouseTracker[i];
			Class446.anInt5614 = 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("nd.ad(").append(')').toString());
		}
	}
}
