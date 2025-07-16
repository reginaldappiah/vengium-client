package com.jagex;/* Class283 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import com.jagex.game.cache.config.prefetch.Js5List;
import com.jagex.game.settings.GroundBlendingSetting;
import com.jagex.game.settings.TextureSetting;
import com.jagex.game.settings.WaterSetting;
import com.jagex.network.OutgoingPacket;
import com.jagex.utils.CameraUtils;
import com.jagex.utils.TimeUtils;

import java.util.Iterator;

//XXX IMPORTANT!
public class GameMap {
    static int basePlane;
    Class240_Sub1 aClass240_Sub1_3000;
	MapLoad map;
	byte[][] aByteArrayArray3002;
	Class115 aClass115_3003;
	MapLoad aClass266_3004;
	Class296 aClass296_3005;
	GameScene aGameScene_3006 = new GameScene();
	GameScene gameScene = new GameScene();
	public boolean aBoolean3008;
	int anInt3009;
	int[] anIntArray3010;
	int mapLength;
	Class244 aClass244_3012;
	LightingDetails lightingDetails;
	byte[][] aByteArrayArray3014;
	int zNear;
	int zFar;
	Class298_Sub37_Sub13 aClass298_Sub37_Sub13_3017;
	boolean aBoolean3018;
	Class287 aClass287_3019 = new Class287(0, 0, 0, 0);
	float aFloat3020;
	int anInt3021;
	Class289[] SCENE_CLIP_DATA_PLANES = new Class289[4];
	int[][] anIntArrayArray3023;
	int anInt3024;
	Class273 aClass273_3025;
	int[][] anIntArrayArray3026;
	int nulledMaps = 0;
	int anInt3028 = 255626399;
	Class240_Sub1 aClass240_Sub1_3029;
	int anInt3030;
	int[] regionIDs;
	byte[][][] roofFlags;
	int[] anIntArray3033;
	int[] anIntArray3034;
	int[] anIntArray3035;
	int[] anIntArray3036;
	Region aClass331_3037;
	byte[][] aByteArrayArray3038;
	int mapWidth;
	ObjectDefinitionLoader objectDefinitionLoader;
	byte[][] loadedMaps;
	int[][] anIntArrayArray3042;
	int[][][] regionData;
	byte[][] aByteArrayArray3044;
	public long aLong3045;

	public Class273 method2627() {
			return aClass273_3025;
	}

	public GameScene getGameScene() {
			return aGameScene_3006;
	}

	public int getMapWidth() {
			return mapWidth * -991330803;
	}

	public int getMapLength() {
			return mapLength * -1456212765;
	}

	public Class296 method2631() {
			return aClass296_3005;
	}

	public Class287 method2632() {
			return aClass287_3019;

	}

	public float method2633() {
			return aFloat3020;
	}

	public int getZNear() {
			return zNear * -2091897981;
	}

	public int getZFar() {
			return 2073578817 * zFar;
	}

	void method2636(Class240_Sub1 class240_sub1, byte[][] is) {
			for (int i_0_ = 0; i_0_ < 1551623871 * class240_sub1.anInt2626; i_0_++) {
				if (!aBoolean3018) {
					StaticMethods.method2365();
				}
				for (int i_1_ = 0; i_1_ < -991330803 * mapWidth >> 3; i_1_++) {
					for (int i_2_ = 0; i_2_ < mapLength * -1456212765 >> 3; i_2_++) {
						int i_3_ = (regionData[i_0_][i_1_][i_2_]);
						if (-1 != i_3_) {
							int i_4_ = i_3_ >> 24 & 0x3;
							if (!class240_sub1.underwater || i_4_ == 0) {
								int i_5_ = i_3_ >> 1 & 0x3;
								int i_6_ = i_3_ >> 14 & 0x3ff;
								int i_7_ = i_3_ >> 3 & 0x7ff;
								int i_8_ = i_7_ / 8 + (i_6_ / 8 << 8);
								for (int i_9_ = 0; i_9_ < (regionIDs).length; i_9_++) {
									if (i_8_ == (regionIDs[i_9_]) && null != is[i_9_]) {
										Buffer class298_sub53 = new Buffer(is[i_9_]);
										class240_sub1.method2216(class298_sub53, i_0_, i_1_ * 8, i_2_ * 8, i_4_, i_6_, i_7_, i_5_, (SCENE_CLIP_DATA_PLANES), -828677341);
										class240_sub1.method2236(GameClient.activeGraphicsToolkit, class298_sub53, i_0_, 8 * i_1_, 8 * i_2_, i_4_, i_6_, i_7_, i_5_, -2145736118);
										break;
									}
								}
							}
						}
					}
				}
			}
			for (int i_10_ = 0; i_10_ < 1551623871 * class240_sub1.anInt2626; i_10_++) {
				if (!aBoolean3018) {
					StaticMethods.method2365();
				}
				for (int i_11_ = 0; i_11_ < -991330803 * mapWidth >> 3; i_11_++) {
					for (int i_12_ = 0; (i_12_ < mapLength * -1456212765 >> 3); i_12_++) {
						int i_13_ = (regionData[i_10_][i_11_][i_12_]);
						if (-1 == i_13_) {//XXX
							class240_sub1.method2214(i_10_, 8 * i_11_, 8 * i_12_, 8, 8, 335584387);
						}
					}
				}
			}
	}

	public byte[][] method2637(int i) {
			if (null != aClass240_Sub1_3029 && (aClass240_Sub1_3029.aByteArrayArrayArray2631) != null && (aClass240_Sub1_3029.aByteArrayArrayArray2631[i]) != null) {
				return (aClass240_Sub1_3029.aByteArrayArrayArray2631[i]);
			}
			return null;
	}

	public int[][] method2638() {
			return anIntArrayArray3026;
	}

	public Class289 getSceneClipDataPlane(int i) {
			return SCENE_CLIP_DATA_PLANES[i];
	}

	public LightingDetails getLightningDetails() {
			return lightingDetails;
	}

	public ObjectDefinitionLoader getObjectDefinitionLoader() {
			return objectDefinitionLoader;
	}

	public byte[][][] getRoofFlags() {
			return roofFlags;
	}

	public void setRoofFlags(byte[][][] roofFlags) {
			this.roofFlags = roofFlags;
	}

	public Class240_Sub1 method2644() {
			return aClass240_Sub1_3029;
	}

	public void setObjectDefinitionLoader(ObjectDefinitionLoader objectDefinitionLoader) {
		try {
			this.objectDefinitionLoader = objectDefinitionLoader;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, "Error setting object definition.");
		}
	}

	public void method2646() {
		try {
			if (null != aClass331_3037) {
				Class335.method764();
				aClass331_3037.aClass324_3528.method3956();
				aClass331_3037 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lt.l(").append(')').toString());
		}
	}

	public void createLightingDetails() {
			lightingDetails = new LightingDetails(GameClient.activeGraphicsToolkit, -991330803 * mapWidth >> 3, mapLength * -1456212765 >> 3);
	}

	public void method2648() {
			zNear = -896386664;
			zFar = ((int) (34.46 * (-991330803 * mapWidth)) * -2038218047);
			zFar = ((2073578817 * zFar << 2) * -2038218047);
			if (GameClient.activeGraphicsToolkit.at()) {
				zFar += 109412864;
			}
	}

	void method2649() {
		try {
			if (map != MapLoad.CUTSCENE_MAP && (MapLoad.CUTSCENE_MAP != aClass266_3004)) {
				if (map == MapLoad.LOAD_MAP_SCENE_DYNAMIC || (map == MapLoad.aClass266_2845) || ((aClass266_3004 != map) && ((MapLoad.LOAD_MAP_SCENE_NORMAL == map) || (aClass266_3004 == MapLoad.LOAD_MAP_SCENE_NORMAL)))) {
					GameClient.entitySize = 0;
					GameClient.anInt8772 = 0;
					GameClient.entityList.clear();
				}
				aClass266_3004 = map;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lt.as(").append(')').toString());
		}
	}

	public void sendMapScene(MapLoadBuffer MapLoadBuffer) {
		try {
			map = MapLoadBuffer.mapLoad;
			if (map == MapLoad.aClass266_2848) {
				method2651();
			} else if (map == MapLoad.LOAD_MAP_SCENE_NORMAL) {
				loadMapSceneNormal(MapLoadBuffer.buffer);
			} else if (map == MapLoad.CUTSCENE_MAP) {
				method2665((byte) -112);
			} else if (map.isDynamicMapScene()) {
				loadMapSceneDynamic(MapLoadBuffer.buffer);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, "Error loading map scene");
		}
	}

	void method2651() {
		try {
			method2655(Class94.method1020(SettingsManager.settingsManager.buildArea.getValue()));
			int sceneX = aGameScene_3006.gameSceneBaseX * -1760580017;
			int sceneY = aGameScene_3006.gameSceneBaseY * 283514611;
			int cameraX = (GameClient.camPosX * -1740717447 >> 12) + (sceneX >> 3);
			int cameraY = (GameClient.camPosZ * -299812095 >> 12) + (sceneY >> 3);
			Player.myPlayer.plane = (byte) 0;
			GameClient.plane = 0;
			Player.myPlayer.method4472(8, 8);
			int regionIndex = 18;
			anIntArrayArray3042 = new int[regionIndex][4];
			regionIDs = new int[regionIndex];
			anIntArray3010 = new int[regionIndex];
			anIntArray3033 = new int[regionIndex];
			anIntArray3034 = new int[regionIndex];
			aByteArrayArray3038 = new byte[regionIndex][];
			aByteArrayArray3014 = new byte[regionIndex][];
			aByteArrayArray3044 = new byte[regionIndex][];
			anIntArray3035 = new int[regionIndex];
			anIntArray3036 = new int[regionIndex];
			loadedMaps = new byte[regionIndex][];
			aByteArrayArray3002 = new byte[regionIndex][];
			regionIndex = 0;
			for (int localX = (cameraX - (this.mapWidth * -991330803 >> 4)) / 8; localX <= ((-991330803 * this.mapWidth >> 4) + cameraX) / 8; localX++) {
				for (int localY = (cameraY - (mapLength * -1456212765 >> 4)) / 8; localY <= ((-1456212765 * mapLength >> 4) + cameraY) / 8; localY++) {
					int regionID = (localX << 8) + localY;
					regionIDs[regionIndex] = regionID;
					anIntArray3010[regionIndex] = (Js5List.JS5_MAPS.getArchiveIdByName(appendMapData(true, false, localX, localY)));
					anIntArray3033[regionIndex] = (Js5List.JS5_MAPS.getArchiveIdByName(appendMapData(false, false, localX, localY)));
					anIntArray3034[regionIndex] = Js5List.JS5_MAPS.getArchiveIdByName(new StringBuilder().append("n").append(localX).append('_').append(localY).toString());
					anIntArray3035[regionIndex] = (Js5List.JS5_MAPS.getArchiveIdByName(appendMapData(true, true, localX, localY)));
					anIntArray3036[regionIndex] = (Js5List.JS5_MAPS.getArchiveIdByName(appendMapData(false, true, localX, localY)));
					if (anIntArray3034[regionIndex] == -1) {
						anIntArray3010[regionIndex] = -1;
						anIntArray3033[regionIndex] = -1;
						anIntArray3035[regionIndex] = -1;
						anIntArray3036[regionIndex] = -1;
					}
					regionIndex++;
				}
			}
			for (int index = regionIndex; index < anIntArray3034.length; index++) {
				anIntArray3034[index] = -1;
				anIntArray3010[index] = -1;
				anIntArray3033[index] = -1;
				anIntArray3035[index] = -1;
				anIntArray3036[index] = -1;
			}
			int i_25_;
			if (GameClient.gameState * -1233866115 == 19) {
				i_25_ = 1;
			} else if (18 == -1233866115 * GameClient.gameState) {
				i_25_ = 16;
			} else if (14 == GameClient.gameState * -1233866115) {
				i_25_ = 15;
			} else if (GameClient.gameState * -1233866115 == 8) {
				i_25_ = 9;
			} else {
				throw new RuntimeException(new StringBuilder().append("").append(-1233866115 * GameClient.gameState).toString());
			}
			method2657(cameraX, cameraY, i_25_, false);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lt.av(").append(')').toString());
		}
	}

	void loadMapSceneNormal(RsBitsBuffer bitsBuffer) {
		try {
			int mapSize = bitsBuffer.readUnsignedByteC();
			boolean forceRefresh = bitsBuffer.readUByte() == 1;
			int chunkX = bitsBuffer.readUShort();
			int chunkY = bitsBuffer.readUShort();
			if (!aBoolean3018) {
				method2649();
			}
			method2655(Class94.method1020(mapSize));
			int regionIndex = ((bitsBuffer.buffer.length - bitsBuffer.offset * 385051775) / 16);
			anIntArrayArray3042 = new int[regionIndex][4];
			for (int x = 0; x < regionIndex; x++) {
				for (int y = 0; y < 4; y++) {
					anIntArrayArray3042[x][y] = bitsBuffer.readInt();
				}
			}
			regionIDs = new int[regionIndex];
			anIntArray3010 = new int[regionIndex];
			anIntArray3033 = new int[regionIndex];
			anIntArray3034 = null;
			aByteArrayArray3038 = new byte[regionIndex][];
			aByteArrayArray3014 = new byte[regionIndex][];
			aByteArrayArray3044 = null;
			anIntArray3035 = new int[regionIndex];
			anIntArray3036 = new int[regionIndex];
			loadedMaps = new byte[regionIndex][];
			aByteArrayArray3002 = new byte[regionIndex][];
			regionIndex = 0;
			for (int i_32_ = (chunkX - (mapWidth * -991330803 >> 4)) / 8; i_32_ <= (chunkX + (mapWidth * -991330803 >> 4)) / 8; i_32_++) {
				for (int i_33_ = (chunkY - (-1456212765 * mapLength >> 4)) / 8; i_33_ <= ((mapLength * -1456212765 >> 4) + chunkY) / 8; i_33_++) {
					regionIDs[regionIndex] = i_33_ + (i_32_ << 8);
					anIntArray3010[regionIndex] = (Js5List.JS5_MAPS.getArchiveIdByName(appendMapData(true, false, i_32_, i_33_)));
					anIntArray3033[regionIndex] = (Js5List.JS5_MAPS.getArchiveIdByName(appendMapData(false, false, i_32_, i_33_)));
					anIntArray3035[regionIndex] = (Js5List.JS5_MAPS.getArchiveIdByName(appendMapData(true, true, i_32_, i_33_)));
					anIntArray3036[regionIndex] = (Js5List.JS5_MAPS.getArchiveIdByName(appendMapData(false, true, i_32_, i_33_)));
					regionIndex++;
				}
			}
			method2657(chunkX, chunkY, 17, forceRefresh);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lt.at(").append(')').toString());
		}
	}

	void loadMapSceneDynamic(RsBitsBuffer stream) {
		try {
			int loadType = stream.readUnsigned128Byte();
			if (1 == loadType) {
				map = MapLoad.LOAD_MAP_SCENE_DYNAMIC;
			} else if (2 == loadType) {
				map = MapLoad.aClass266_2849;
			} else if (loadType == 3) {
				map = MapLoad.aClass266_2845;
			} else if (4 == loadType) {
				map = MapLoad.aClass266_2850;
			}
			int chunkY = stream.readUnsignedShortLE();
			//System.out.println("chunkY: " + chunkY);
			int chunkX = stream.readUnsignedShortLE128();
			//System.out.println("chunkX: " + chunkX);
			int forceRefreshMask = stream.readUnsigned128Byte();
			boolean forceRefresh = (forceRefreshMask & 0x1) != 0;
			int mapSize = stream.readUnsignedByteC();
			if (!aBoolean3018) {
				method2649();
			}
			method2655(Class94.method1020(mapSize));
			stream.initBitAccess();
			for (int i_39_ = 0; i_39_ < 4; i_39_++) {
				for (int i_40_ = 0; i_40_ < -991330803 * mapWidth >> 3; i_40_++) {
					for (int i_41_ = 0; (i_41_ < -1456212765 * mapLength >> 3); i_41_++) {
						int i_42_ = stream.readBits(1);
						if (1 == i_42_) {
							regionData[i_39_][i_40_][i_41_] = stream.readBits(26);
						} else {
							regionData[i_39_][i_40_][i_41_] = -1;
						}
					}
				}
			}
			stream.finishBitAccess();
			int index = ((stream.buffer.length - stream.offset * 385051775) / 16);
			anIntArrayArray3042 = new int[index][4];
			for (int i_44_ = 0; i_44_ < index; i_44_++) {
				for (int i_45_ = 0; i_45_ < 4; i_45_++) {
					anIntArrayArray3042[i_44_][i_45_] = stream.readInt();
				}
			}
			regionIDs = new int[index];
			anIntArray3010 = new int[index];
			anIntArray3033 = new int[index];
			anIntArray3034 = null;
			aByteArrayArray3038 = new byte[index][];
			aByteArrayArray3014 = new byte[index][];
			aByteArrayArray3044 = null;
			anIntArray3035 = new int[index];
			anIntArray3036 = new int[index];
			loadedMaps = new byte[index][];
			aByteArrayArray3002 = new byte[index][];
			index = 0;
			for (int i_46_ = 0; i_46_ < 4; i_46_++) {
				for (int i_47_ = 0; i_47_ < -991330803 * mapWidth >> 3; i_47_++) {
					for (int i_48_ = 0; (i_48_ < -1456212765 * mapLength >> 3); i_48_++) {
						int i_49_ = (regionData[i_46_][i_47_][i_48_]);
						if (i_49_ != -1) {
							int i_50_ = i_49_ >> 14 & 0x3ff;
							int i_51_ = i_49_ >> 3 & 0x7ff;
							int region = (i_50_ / 8 << 8) + i_51_ / 8;
							for (int i_53_ = 0; i_53_ < index; i_53_++) {
								if (region == (regionIDs[i_53_])) {
									region = -1;
									break;
								}
							}
							if (-1 != region) {
								regionIDs[index] = region;
								int i_54_ = region >> 8 & 0xff;
								int i_55_ = region & 0xff;
								anIntArray3010[index] = (Js5List.JS5_MAPS.getArchiveIdByName(appendMapData(true, false, i_54_, i_55_)));
								anIntArray3033[index] = (Js5List.JS5_MAPS.getArchiveIdByName(appendMapData(false, false, i_54_, i_55_)));
								anIntArray3035[index] = (Js5List.JS5_MAPS.getArchiveIdByName(appendMapData(true, true, i_54_, i_55_)));
								anIntArray3036[index] = (Js5List.JS5_MAPS.getArchiveIdByName(appendMapData(false, true, i_54_, i_55_)));
								index++;
							}
						}
					}
				}
			}
			method2657(chunkX, chunkY, 17, forceRefresh);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lt.ah(").append(')').toString());
		}
	}

	public Class244 method2654() {
			return aClass244_3012;
	}

	void method2655(Class115 class115) {
		try {
			if (class115 != aClass115_3003) {
				mapWidth = (mapLength = class115.regionSize * 723673737) * -116821329;
				regionData = (new int[4][-991330803 * mapWidth >> 3][-1456212765 * mapLength >> 3]);
				anIntArrayArray3023 = (new int[mapWidth * -991330803][-1456212765 * mapLength]);
				anIntArrayArray3026 = (new int[-991330803 * mapWidth][-1456212765 * mapLength]);
				for (int plane = 0; plane < 4; plane++) {
					SCENE_CLIP_DATA_PLANES[plane] = Class16.method354((-991330803 * mapWidth), (mapLength * -1456212765));
				}
				roofFlags = (new byte[4][-991330803 * mapWidth][mapLength * -1456212765]);
				aClass244_3012 = new Class244(4, -991330803 * mapWidth, mapLength * -1456212765);
				createLightingDetails();
				aClass115_3003 = class115;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lt.az(").append(')').toString());
		}
	}

	public int[][] method2656() {
		try {
			return anIntArrayArray3023;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lt.g(").append(')').toString());
		}
	}

	void method2657(int i, int i_57_, int i_58_, boolean bool) {
			if (1596783995 * GameClient.anInt8724 == 2) {
				if (aBoolean3018) {
					throw new IllegalStateException();
				}
				GameClient.anInt8724 = -1334571751;
				GameClient.cutsceneID = -221729505;
			}
			if (bool || anInt3030 * 19679283 != i || i_57_ != anInt3009 * 306966675) {
				anInt3030 = i * -1135086853;
				anInt3009 = i_57_ * -1928942181;
				if (!aBoolean3018) {
					Class439.loadGameState(i_58_);
					StaticMethods.drawCornerLoadingBox(Tradution.LOADING_PLEASE_WAIT.translate(GameLanguage.CURRENT_LANGUAGE), true, GameClient.activeGraphicsToolkit, StaticMethods.aClass264_3673, StaticMethods.aClass505_8369);
				}
				if (aGameScene_3006 != null) {
					gameScene = aGameScene_3006;
				} else {
					gameScene = new GameScene(0, 0, 0);
				}
				aGameScene_3006 = new GameScene(0, 8 * (anInt3030 * 19679283 - ((-991330803 * mapWidth) >> 4)), 8 * (306966675 * anInt3009 - ((mapLength * -1456212765) >> 4)));
				aClass298_Sub37_Sub13_3017 = WorldMapHandler.method3708(-1760580017 * (aGameScene_3006.gameSceneBaseX), (aGameScene_3006.gameSceneBaseY) * 283514611);
				aClass296_3005 = null;
				if (!aBoolean3018) {
					method2663(i_58_);
				}
			}
	}

	public GameMap(boolean bool) {
		anInt3021 = 0;
		anInt3024 = -861507225;
		aBoolean3008 = false;
		aBoolean3018 = bool;
	}

	void method2658(int i, byte i_60_) {
		try {
			try {
				Thread.sleep(i);
			} catch (InterruptedException interruptedexception) {
				/* empty */
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lt.aj(").append(')').toString());
		}
	}

	void forceDynamicMapScene(Class240_Sub1 class240_sub1, byte[][] regionData, short i) {
			int dataSize = regionData.length;
			for (int index = 0; index < dataSize; index++) {
				byte[] data = regionData[index];
				if (null != data) {
					Buffer buffer = new Buffer(data);
					int i_64_ = regionIDs[index] >> 8;
					int i_65_ = regionIDs[index] & 0xff;
					int i_66_ = (64 * i_64_ - (aGameScene_3006.gameSceneBaseX * -1760580017));
					int i_67_ = 64 * i_65_ - 283514611 * (aGameScene_3006.gameSceneBaseY);
					if (!aBoolean3018) {
						StaticMethods.method2365();
					}
					class240_sub1.method2215(buffer, i_66_, i_67_, -1760580017 * (aGameScene_3006.gameSceneBaseX), (aGameScene_3006.gameSceneBaseY) * 283514611, (SCENE_CLIP_DATA_PLANES), -391880689);
					class240_sub1.resetAtmosphere(GameClient.activeGraphicsToolkit, buffer, i_66_, i_67_);
				}
			}
			for (int index = 0; index < dataSize; index++) {
				int gameSceneBaseX = ((regionIDs[index] >> 8) * 64 - (aGameScene_3006.gameSceneBaseX * -1760580017));
				int gameSceneBaseY = ((regionIDs[index] & 0xff) * 64 - (aGameScene_3006.gameSceneBaseY * 283514611));
				byte[] is_71_ = regionData[index];
				if (is_71_ == null && anInt3009 * 306966675 < 800) {
					if (!aBoolean3018) {
						StaticMethods.method2365();
					}
					class240_sub1.method2213(gameSceneBaseX, gameSceneBaseY, 64, 64, (byte) 0);
				}
			}
	}

	void method2660(Class240_Sub1 class240_sub1, byte[][] is, byte i) {
		try {
			int i_72_ = aByteArrayArray3038.length;
			for (int i_73_ = 0; i_73_ < i_72_; i_73_++) {
				byte[] data = is[i_73_];
				if (data != null) {
					int i_75_ = (64 * (regionIDs[i_73_] >> 8) - (-1760580017 * aGameScene_3006.gameSceneBaseX));
					int i_76_ = ((regionIDs[i_73_] & 0xff) * 64 - 283514611 * (aGameScene_3006.gameSceneBaseY));
					if (!aBoolean3018) {
						StaticMethods.method2365();
					}
					class240_sub1.method2237(GameClient.activeGraphicsToolkit, data, i_75_, i_76_, (SCENE_CLIP_DATA_PLANES), 1861855341);
					if (aBoolean3018) {
						method2658(10, (byte) 22);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lt.ag(").append(')').toString());
		}
	}

	void method2661(int i) {
		try {
			int i_77_ = aByteArrayArray3044.length;
			for (int i_78_ = 0; i_78_ < i_77_; i_78_++) {
				if (aByteArrayArray3044[i_78_] == null) {
					if (i <= -1776092464) {
						/* empty */
					}
				} else {
					int i_79_ = -1;
					for (int i_80_ = 0; i_80_ < GameClient.anInt8721 * -160072615; i_80_++) {
						if (regionIDs[i_78_] == GameClient.anIntArray8751[i_80_]) {
							i_79_ = i_80_;
							break;
						}
					}
					if (i_79_ == -1) {
						GameClient.anIntArray8751[GameClient.anInt8721 * -160072615] = regionIDs[i_78_];
						i_79_ = (GameClient.anInt8721 += 424283113) * -160072615 - 1;
					}
					Buffer class298_sub53 = new Buffer(aByteArrayArray3044[i_78_]);
					int i_81_ = 0;
					while ((385051775 * class298_sub53.offset < (aByteArrayArray3044[i_78_]).length) && i_81_ < 511) {
						if (GameClient.entitySize * -1230451913 >= 1023) {
							if (i <= -1776092464) {
								/* empty */
							}
							break;
						}
						int i_82_ = i_79_ | i_81_++ << 6;
						int i_83_ = class298_sub53.readUShort();
						int i_84_ = i_83_ >> 14;
						int i_85_ = i_83_ >> 7 & 0x3f;
						int i_86_ = i_83_ & 0x3f;
						int i_87_ = (64 * (regionIDs[i_78_] >> 8) - (aGameScene_3006.gameSceneBaseX * -1760580017) + i_85_);
						int i_88_ = (i_86_ + (64 * (regionIDs[i_78_] & 0xff) - (aGameScene_3006.gameSceneBaseY * 283514611)));
						NPCDefinition class503 = (NPCDefinitionLoader.npcList.load(class298_sub53.readUShort()));
						ObjectNode class298_sub29 = ((ObjectNode) GameClient.entityList.get(i_82_));
						if (class298_sub29 == null && (class503.walkMask & 0x1) > 0 && i_87_ >= 0 && (-2095128707 * class503.tileSpacesOccupied + i_87_ < -991330803 * mapWidth) && i_88_ >= 0 && (i_88_ + class503.tileSpacesOccupied * -2095128707 < mapLength * -1456212765)) {
							NPC class365_sub1_sub1_sub2_sub1 = (new NPC(aClass331_3037));
							class365_sub1_sub1_sub2_sub1.entityIndex = i_82_ * 1714292119;
							ObjectNode class298_sub29_89_ = (new ObjectNode(class365_sub1_sub1_sub2_sub1));
							GameClient.entityList.connect(class298_sub29_89_, i_82_);
							GameClient.aClass298_Sub29Array8816[((GameClient.anInt8772 += -118843751) * 1962237353) - 1] = class298_sub29_89_;
							GameClient.entityKeys[((GameClient.entitySize += -409937273) * -1230451913) - 1] = i_82_;
							class365_sub1_sub1_sub2_sub1.anInt10075 = GameClient.clientTick * -128551287;
							class365_sub1_sub1_sub2_sub1.method4464(class503, 1908625985);
							class365_sub1_sub1_sub2_sub1.method4421((class365_sub1_sub1_sub2_sub1.aClass503_10190.tileSpacesOccupied) * -2095128707, -948262466);
							class365_sub1_sub1_sub2_sub1.anInt10115 = (-1927065533 * (class365_sub1_sub1_sub2_sub1.aClass503_10190.anInt6181) << 3) * -1186616623;
							class365_sub1_sub1_sub2_sub1.method4415((class365_sub1_sub1_sub2_sub1.aClass503_10190.aClass274_6183.method2567((byte) 73).getID() << 11 & 0x3fff), true, 822135678);
							class365_sub1_sub1_sub2_sub1.method4456(i_84_, i_87_, i_88_, true, class365_sub1_sub1_sub2_sub1.getSize());
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lt.au(").append(')').toString());
		}
	}

	public int calculateLoadingProgress() {
			return 100 - (-1285506348 * nulledMaps / (anInt3028 * -316305569));
	}

	void method2663(int i) {
		try {
			int coordX = (aGameScene_3006.gameSceneBaseX * -1760580017 - gameScene.gameSceneBaseX * -1760580017);
			int coordY = (aGameScene_3006.gameSceneBaseY * 283514611 - 283514611 * gameScene.gameSceneBaseY);
			if (17 == i) {
				for (int i_93_ = 0; i_93_ < 1962237353 * GameClient.anInt8772; i_93_++) {
					ObjectNode node = GameClient.aClass298_Sub29Array8816[i_93_];
					if (null != node) {
						NPC npc = ((NPC) node.nodeObject);
						for (int i_94_ = 0; i_94_ < (npc.scenePositionXQueue).length; i_94_++) {
							npc.scenePositionXQueue[i_94_] -= coordX;
							npc.scenePositionYQueue[i_94_] -= coordY;
						}
						Vector3f vector3f = Vector3f.method2005(npc.getWorldTransform().trans);
						vector3f.x -= 512 * coordX;
						vector3f.z -= coordY * 512;
						npc.method4340(vector3f);
						vector3f.cache();
					}
				}
			} else {
				boolean bool = false;
				GameClient.entitySize = 0;
				int i_95_ = -755230208 * mapWidth - 512;
				int i_96_ = mapLength * 1743373824 - 512;
				for (int i_97_ = 0; i_97_ < GameClient.anInt8772 * 1962237353; i_97_++) {
					ObjectNode class298_sub29 = GameClient.aClass298_Sub29Array8816[i_97_];
					if (null != class298_sub29) {
						NPC npc = ((NPC) class298_sub29.nodeObject);
						Vector3f vector3f = Vector3f.method2005(npc.getWorldTransform().trans);
						vector3f.x -= 512 * coordX;
						vector3f.z -= 512 * coordY;
						npc.method4340(vector3f);
						if ((int) vector3f.x < 0 || (int) vector3f.x > i_95_ || (int) vector3f.z < 0 || (int) vector3f.z > i_96_) {
							npc.method4464(null, 1741344135);
							class298_sub29.unlink();
							bool = true;
						} else {
							boolean bool_98_ = true;
							for (int i_99_ = 0; i_99_ < (npc.scenePositionXQueue).length; i_99_++) {
								npc.scenePositionXQueue[i_99_] -= coordX;
								npc.scenePositionYQueue[i_99_] -= coordY;
								if ((npc.scenePositionXQueue[i_99_]) < 0 || ((npc.scenePositionXQueue[i_99_]) >= (mapWidth * -991330803)) || (npc.scenePositionYQueue[i_99_]) < 0 || ((npc.scenePositionYQueue[i_99_]) >= (mapLength * -1456212765))) {
									bool_98_ = false;
								}
							}
							if (bool_98_) {
								GameClient.entityKeys[((GameClient.entitySize += -409937273) * -1230451913) - 1] = (npc.entityIndex * 1888274983);
							} else {
								npc.method4464(null, 2025506166);
								class298_sub29.unlink();
								bool = true;
							}
						}
						vector3f.cache();
					}
				}
				if (bool) {
					GameClient.anInt8772 = (GameClient.entityList.getSize() * -118843751);
					int i_100_ = 0;
					Iterator iterator = GameClient.entityList.iterator();
					while (iterator.hasNext()) {
						ObjectNode class298_sub29 = (ObjectNode) iterator.next();
						GameClient.aClass298_Sub29Array8816[i_100_++] = class298_sub29;
					}
				}
			}
			for (int i_101_ = 0; i_101_ < 2048; i_101_++) {
				Player class365_sub1_sub1_sub2_sub2 = GameClient.entities[i_101_];
				if (class365_sub1_sub1_sub2_sub2 != null) {
					for (int i_102_ = 0; i_102_ < (class365_sub1_sub1_sub2_sub2.scenePositionXQueue).length; i_102_++) {
						class365_sub1_sub1_sub2_sub2.scenePositionXQueue[i_102_] -= coordX;
						class365_sub1_sub1_sub2_sub2.scenePositionYQueue[i_102_] -= coordY;
					}
					Vector3f class217 = Vector3f.method2005(class365_sub1_sub1_sub2_sub2.getWorldTransform().trans);
					class217.x -= 512 * coordX;
					class217.z -= coordY * 512;
					class365_sub1_sub1_sub2_sub2.method4340(class217);
					class217.cache();
				}
			}
			HintIcon[] hintIcons = HintIcon.loadedIcons;
			for (int i_103_ = 0; i_103_ < hintIcons.length; i_103_++) {
				HintIcon hintIcon = hintIcons[i_103_];
				if (hintIcon != null) {
					hintIcon.coordX -= coordX * -1268095488;
					hintIcon.coordY -= coordY * 1688061440;
				}
			}
			for (ObjectDeque objectDeque = ((ObjectDeque) ObjectDeque.aClass453_7152.method5939()); null != objectDeque; objectDeque = (ObjectDeque) ObjectDeque.aClass453_7152.method5944()) {
				objectDeque.localX -= coordX * 656787783;
				objectDeque.localY -= coordY * 284247153;
				if (map != MapLoad.aClass266_2850 && (objectDeque.localX * 634196087 < 0 || -2146829167 * objectDeque.localY < 0 || (634196087 * objectDeque.localX >= mapWidth * -991330803) || (-2146829167 * objectDeque.localY >= mapLength * -1456212765))) {
					objectDeque.unlink();
				}
			}
			for (ObjectDeque objectDeque = ((ObjectDeque) ObjectDeque.aClass453_7162.method5939()); null != objectDeque; objectDeque = (ObjectDeque) ObjectDeque.aClass453_7162.method5944()) {
				objectDeque.localX -= coordX * 656787783;
				objectDeque.localY -= 284247153 * coordY;
				if (map != MapLoad.aClass266_2850 && (634196087 * objectDeque.localX < 0 || -2146829167 * objectDeque.localY < 0 || (objectDeque.localX * 634196087 >= mapWidth * -991330803) || (-2146829167 * objectDeque.localY >= -1456212765 * mapLength))) {
					objectDeque.unlink();
				}
			}
			for (Class298_Sub2 class298_sub2 = ((Class298_Sub2) GameClient.aClass437_8685.method5816()); null != class298_sub2; class298_sub2 = (Class298_Sub2) GameClient.aClass437_8685.method5815()) {
				int i_104_ = (int) ((class298_sub2.key * 7051297995265073167L >> 28) & 0x3L);
				int i_105_ = (int) (7051297995265073167L * class298_sub2.key & 0x3fffL);
				int i_106_ = i_105_ - (-1760580017 * aGameScene_3006.gameSceneBaseX);
				int i_107_ = (int) ((class298_sub2.key * 7051297995265073167L >> 14) & 0x3fffL);
				int i_108_ = i_107_ - 283514611 * (aGameScene_3006.gameSceneBaseY);
				if (null != aClass331_3037) {
					if (i_106_ < 0 || i_108_ < 0 || i_106_ >= -991330803 * mapWidth || i_108_ >= mapLength * -1456212765 || i_106_ >= (aClass331_3037.cameraXLimit) * 1988988347 || i_108_ >= 1340714547 * (aClass331_3037.cameraYLimit)) {
						if (map != MapLoad.aClass266_2850) {
							class298_sub2.unlink();
						}
					} else if ((aClass331_3037.gameSceneBase) != null) {
						aClass331_3037.method4059(i_104_, i_106_, i_108_);
					}
				}
			}
			if (2076926079 * Minimap.flagX != 0) {
				Minimap.flagX -= coordX * -1129029761;
				Minimap.flagY -= -1835291189 * coordY;
			}
			Class127_Sub3.method1434();
			Class264_Sub4.method2513(false);
			if (17 == i) {
				GameClient.anInt8753 -= coordX * 721337856;
				GameClient.anInt8755 -= coordY * 601815552;
				Class75.anInt708 -= -1853832704 * coordX;
				Class106.anInt1309 -= 1181634048 * coordY;
				if (CameraUtils.FREE_FORM != -863531439 * CameraUtils.cameraType) {
					CameraUtils.cameraType = 1355934404;
					Class418.anInt5339 = -1001372047;
					Class100.anInt1081 = 178575833;
				}
			} else {
				Class376.anInt4089 -= coordX * 2140348215;
				Class82_Sub4.anInt6832 -= -2108764285 * coordY;
				StaticMethods.anInt6292 -= 446226445 * coordX;
				IPAddress.anInt5959 -= coordY * 2019382975;
				GameClient.camPosX -= coordX * 1343197696;
				GameClient.camPosZ -= coordY * -276168192;
				if (Math.abs(coordX) > -991330803 * mapWidth || (Math.abs(coordY) > mapLength * -1456212765)) {
					lightingDetails.method4324();
				}
			}
			StaticMethods.method5905();
			InputStream_Sub1.method273();
			GameClient.aClass437_8825.clear();
			GameClient.aClass453_8824.clean();
			GameClient.aClass442_8650.method5869(268098313);
			Class298_Sub27.method3105((short) 255);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lt.af(").append(')').toString());
		}
	}

	void method2664() {
		try {
			aClass240_Sub1_3000 = null;
			aClass240_Sub1_3029 = null;
			for (int i_109_ = 0; i_109_ < 4; i_109_++) {
				if (null != SCENE_CLIP_DATA_PLANES[i_109_]) {
					SCENE_CLIP_DATA_PLANES[i_109_].method2731(-2096339600);
				}
			}
			if (aClass244_3012 != null) {
				aClass244_3012.method2319();
			}
			if (null != lightingDetails) {
				lightingDetails.method4320();
			}
			if (null != aClass331_3037) {
				aClass331_3037.aClass324_3528.method3956();
				aClass331_3037 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lt.aw(").append(')').toString());
		}
	}

	void method2665(byte i) {
			aClass266_3004 = map;
			method2655(Class115.aClass115_1383);
			for (int i_110_ = 0; i_110_ < 4; i_110_++) {
				for (int i_111_ = 0; i_111_ < mapWidth * -991330803 >> 3; i_111_++) {
					for (int i_112_ = 0; (i_112_ < -1456212765 * mapLength >> 3); i_112_++) {
						regionData[i_110_][i_111_][i_112_] = -1;
					}
				}
			}
			for (Class298_Sub7 class298_sub7 = ((Class298_Sub7) Class87.aClass453_799.method5939()); null != class298_sub7; class298_sub7 = ((Class298_Sub7) Class87.aClass453_799.method5944())) {
				int i_113_ = -1895845629 * class298_sub7.anInt7220;
				boolean bool = (i_113_ & 0x1) == 1;
				int i_114_ = 783342041 * class298_sub7.anInt7218 >> 3;
				int i_115_ = class298_sub7.anInt7212 * -1769464355 >> 3;
				int i_116_ = class298_sub7.anInt7216 * -815575585;
				int i_117_ = 35898435 * class298_sub7.anInt7217;
				int i_118_ = -802955793 * class298_sub7.anInt7214;
				int i_119_ = 25889883 * class298_sub7.anInt7215;
				int i_120_ = -60744569 * class298_sub7.anInt7219;
				int i_121_ = 1016983439 * class298_sub7.anInt7213;
				int i_122_ = 0;
				int i_123_ = 0;
				int i_124_ = 1;
				int i_125_ = 1;
				if (1 == i_113_) {
					i_123_ = i_120_ - 1;
					i_124_ = -1;
				} else if (2 == i_113_) {
					i_123_ = i_120_ - 1;
					i_122_ = i_121_ - 1;
					i_124_ = -1;
					i_125_ = -1;
				} else if (i_113_ == 3) {
					i_122_ = i_121_ - 1;
					i_124_ = 1;
					i_125_ = -1;
				}
				int i_126_ = i_115_;
				while (i_126_ < i_121_ + i_115_) {
					int i_127_ = i_123_;
					int i_128_ = i_114_;
					while (i_128_ < i_114_ + i_120_) {
						if (bool) {
							regionData[i_119_][i_116_ + i_122_][i_117_ + i_127_] = ((i_126_ << 3) + ((i_128_ << 14) + (i_118_ << 24)) + (i_113_ << 1));
						} else {
							regionData[i_119_][i_116_ + i_127_][i_122_ + i_117_] = (i_113_ << 1) + ((i_126_ << 3) + ((i_128_ << 14) + (i_118_ << 24)));
						}
						i_128_++;
						i_127_ += i_124_;
					}
					i_126_++;
					i_122_ += i_125_;
				}
			}
			int i_129_ = StaticMethods.cutsceneXTEAS.length;
			regionIDs = new int[i_129_];
			anIntArray3010 = new int[i_129_];
			anIntArray3033 = new int[i_129_];
			anIntArray3034 = null;
			aByteArrayArray3038 = new byte[i_129_][];
			aByteArrayArray3014 = new byte[i_129_][];
			aByteArrayArray3044 = null;
			anIntArray3035 = new int[i_129_];
			anIntArray3036 = new int[i_129_];
			loadedMaps = new byte[i_129_][];
			aByteArrayArray3002 = new byte[i_129_][];
			i_129_ = 0;
			for (Class298_Sub7 class298_sub7 = ((Class298_Sub7) Class87.aClass453_799.method5939()); class298_sub7 != null; class298_sub7 = ((Class298_Sub7) Class87.aClass453_799.method5944())) {
				int i_130_ = class298_sub7.anInt7218 * 783342041 >>> 3;
				int i_131_ = -1769464355 * class298_sub7.anInt7212 >>> 3;
				int i_132_ = i_130_ + class298_sub7.anInt7219 * -60744569;
				if ((i_132_ & 0x7) == 0) {
					i_132_--;
				}
				i_132_ >>>= 3;
				int i_133_ = class298_sub7.anInt7213 * 1016983439 + i_131_;
				if ((i_133_ & 0x7) == 0) {
					i_133_--;
				}
				i_133_ >>>= 3;
				for (int i_134_ = i_130_ >>> 3; i_134_ <= i_132_; i_134_++) {
					while_71_: for (int i_135_ = i_131_ >>> 3; i_135_ <= i_133_; i_135_++) {
						int i_136_ = i_134_ << 8 | i_135_;
						for (int i_137_ = 0; i_137_ < i_129_; i_137_++) {
							if (regionIDs[i_137_] == i_136_) {
								if (i >= 0) {
									/* empty */
								}
								continue while_71_;
							}
						}
						regionIDs[i_129_] = i_136_;
						anIntArray3010[i_129_] = (Js5List.JS5_MAPS.getArchiveIdByName(appendMapData(true, false, i_134_, i_135_)));
						anIntArray3033[i_129_] = (Js5List.JS5_MAPS.getArchiveIdByName(appendMapData(false, false, i_134_, i_135_)));
						anIntArray3035[i_129_] = (Js5List.JS5_MAPS.getArchiveIdByName(appendMapData(true, true, i_134_, i_135_)));
						anIntArray3036[i_129_] = (Js5List.JS5_MAPS.getArchiveIdByName(appendMapData(false, true, i_134_, i_135_)));
						i_129_++;
					}
				}
			}
			anIntArrayArray3042 = StaticMethods.cutsceneXTEAS;
			StaticMethods.cutsceneXTEAS = null;
			method2657(-991330803 * mapWidth >> 4, -1456212765 * mapLength >> 4, 17, false);
	}

	public void method2666() {
		try {
			aGameScene_3006 = new GameScene();
			anInt3009 = 0;
			anInt3030 = 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lt.o(").append(')').toString());
		}
	}

	public void method2667() {
		try {
			if (aBoolean3018) {
				method2673((byte) 2);
				Class423.method5733(true);
				GameMap map = GameClient.myRegion;
				regionIDs = map.regionIDs;
				anIntArray3010 = map.anIntArray3010;
				anIntArray3033 = map.anIntArray3033;
				anIntArray3034 = map.anIntArray3034;
				anIntArray3035 = map.anIntArray3035;
				anIntArray3036 = map.anIntArray3036;
				anIntArrayArray3042 = map.anIntArrayArray3042;
				aByteArrayArray3038 = map.aByteArrayArray3038;
				aByteArrayArray3014 = map.aByteArrayArray3014;
				aByteArrayArray3044 = map.aByteArrayArray3044;
				loadedMaps = map.loadedMaps;
				aByteArrayArray3002 = map.aByteArrayArray3002;
				SCENE_CLIP_DATA_PLANES = map.SCENE_CLIP_DATA_PLANES;
				aClass244_3012 = map.aClass244_3012;
				lightingDetails = map.lightingDetails;
				regionData = map.regionData;
				zNear = 1 * map.zNear;
				zFar = 1 * map.zFar;
				aClass298_Sub37_Sub13_3017 = map.aClass298_Sub37_Sub13_3017;
				aClass296_3005 = map.aClass296_3005;
				anIntArrayArray3023 = map.anIntArrayArray3023;
				anIntArrayArray3026 = map.anIntArrayArray3026;
				roofFlags = map.roofFlags;
				this.map = map.map;
				aClass115_3003 = map.aClass115_3003;
				aGameScene_3006 = map.aGameScene_3006;
				gameScene = map.gameScene;
				anInt3030 = map.anInt3030 * 1;
				anInt3009 = 1 * map.anInt3009;
				mapWidth = map.mapWidth * 1;
				mapLength = map.mapLength * 1;
			} else if (19 == -1233866115 * GameClient.gameState) {
				Class439.loadGameState(1);
			} else if (GameClient.gameState * -1233866115 == 14) {
				Class439.loadGameState(15);
			} else if (GameClient.gameState * -1233866115 == 18) {
				Class439.loadGameState(16);
			} else if (0 == -1233866115 * GameClient.gameState) {
				Class439.loadGameState(17);
			} else if (8 == GameClient.gameState * -1233866115) {
				Class439.loadGameState(9);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lt.ao(").append(')').toString());
		}
	}

	void method2668(GameMap map) {
			boolean bool = map.aBoolean3018;
			map.aBoolean3018 = aBoolean3018;
			aBoolean3018 = bool;
			MapLoad mapLoad = map.aClass266_3004;
			map.aClass266_3004 = aClass266_3004;
			aClass266_3004 = mapLoad;
			map.gameScene = aGameScene_3006;
			gameScene = map.aGameScene_3006;
			lightingDetails.method4327(map.getLightningDetails());
	}

	String appendMapData(boolean locations, boolean underworld, int containerID, int fileID) {
			String archiveName = "";
			if (locations) {
				archiveName = new StringBuilder().append(archiveName).append("m").append(containerID).append('_').append(fileID).toString();
			} else {
				archiveName = new StringBuilder().append(archiveName).append("l").append(containerID).append('_').append(fileID).toString();
			}
			if (underworld) {
				archiveName = new StringBuilder().append('u').append(archiveName).toString();
			}
			return archiveName;
	}

	public int method2670(byte i) {
		try {
			return 100 - (anInt3021 * -1732877004 / (1792875095 * anInt3024));
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lt.p(").append(')').toString());
		}
	}

	void method2671(Class240_Sub1 class240_sub1, byte[][] is, int i) {
			for (int i_143_ = 0; i_143_ < class240_sub1.anInt2626 * 1551623871; i_143_++) {
				if (!aBoolean3018) {
					StaticMethods.method2365();
				}
				for (int i_144_ = 0; i_144_ < -991330803 * mapWidth >> 3; i_144_++) {
					for (int i_145_ = 0; (i_145_ < -1456212765 * mapLength >> 3); i_145_++) {
						int i_146_ = (regionData[i_143_][i_144_][i_145_]);
						if (-1 != i_146_) {
							int i_147_ = i_146_ >> 24 & 0x3;
							if (!class240_sub1.underwater || 0 == i_147_) {
								int i_148_ = i_146_ >> 1 & 0x3;
								int i_149_ = i_146_ >> 14 & 0x3ff;
								int i_150_ = i_146_ >> 3 & 0x7ff;
								int i_151_ = (i_149_ / 8 << 8) + i_150_ / 8;
								for (int i_152_ = 0; i_152_ < (regionIDs).length; i_152_++) {
									if ((regionIDs[i_152_]) == i_151_ && null != is[i_152_]) {
										class240_sub1.method2238(GameClient.activeGraphicsToolkit, is[i_152_], i_143_, 8 * i_144_, i_145_ * 8, i_147_, 8 * (i_149_ & 0x7), (i_150_ & 0x7) * 8, i_148_, (SCENE_CLIP_DATA_PLANES), -174685332);
										break;
									}
								}
							}
						}
						if (aBoolean3018) {
							method2658(5, (byte) 22);
						}
					}
				}
			}
	}

	public boolean loadMapSettings(int i) {
		try {
			if (!aBoolean3018) {
				StaticMethods.method6310(false, -583672467);
			}
			nulledMaps = 0;
			for (int index = 0; index < aByteArrayArray3038.length; index++) {
				if (-1 != anIntArray3010[index] && aByteArrayArray3038[index] == null) {
					aByteArrayArray3038[index] = Js5List.JS5_MAPS.getFileFromArchive((anIntArray3010[index]), 0);
					if (null == aByteArrayArray3038[index]) {
						nulledMaps += -427342251;
					}
				}
				if (-1 != anIntArray3033[index] && null == aByteArrayArray3014[index]) {
					aByteArrayArray3014[index] = (Js5List.JS5_MAPS.getFile(anIntArray3033[index], 0, anIntArrayArray3042[index]));
					if (null == aByteArrayArray3014[index]) {
						nulledMaps += -427342251;
					}
				}
				if (anIntArray3035[index] != -1 && null == loadedMaps[index]) {
					loadedMaps[index] = Js5List.JS5_MAPS.getFileFromArchive((anIntArray3035[index]), 0);
					if (loadedMaps[index] == null) {
						nulledMaps += -427342251;
					}
				}
				if (anIntArray3036[index] != -1 && aByteArrayArray3002[index] == null) {
					aByteArrayArray3002[index] = Js5List.JS5_MAPS.getFileFromArchive((anIntArray3036[index]), 0);
					if (null == aByteArrayArray3002[index]) {
						nulledMaps += -427342251;
					}
				}
				if (anIntArray3034 != null && aByteArrayArray3044[index] == null && anIntArray3034[index] != -1) {
					aByteArrayArray3044[index] = (Js5List.JS5_MAPS.getFile(anIntArray3034[index], 0, anIntArrayArray3042[index]));
					if (null == aByteArrayArray3044[index]) {
						nulledMaps += -427342251;
					}
				}
			}
			if (aClass296_3005 == null) {
				if (null != aClass298_Sub37_Sub13_3017 && (Js5List.JS5_WORLDMAPDATA.method2295(new StringBuilder().append(aClass298_Sub37_Sub13_3017.locationName).append("_staticelements").toString(), -400372089))) {
					if (!Js5List.JS5_WORLDMAPDATA.method2312(new StringBuilder().append(aClass298_Sub37_Sub13_3017.locationName).append("_staticelements").toString())) {
						nulledMaps += -427342251;
					} else {
						aClass296_3005 = (StaticMethods.method2192(Js5List.JS5_WORLDMAPDATA, new StringBuilder().append(aClass298_Sub37_Sub13_3017.locationName).append("_staticelements").toString(), GameClient.isMemberWorld));
					}
				} else {
					aClass296_3005 = new Class296(0);
				}
			}
			if (-528251139 * nulledMaps > 0) {
				if (-316305569 * anInt3028 < nulledMaps * -528251139) {
					anInt3028 = nulledMaps * -707841245;
				}
				aClass273_3025 = Class273.aClass273_2906;
				return false;
			}
			anInt3021 = 0;
			for (int i_154_ = 0; i_154_ < aByteArrayArray3038.length; i_154_++) {
				byte[] is = aByteArrayArray3014[i_154_];
				if (is != null) {
					int i_155_ = ((regionIDs[i_154_] >> 8) * 64 - (-1760580017 * aGameScene_3006.gameSceneBaseX));
					int i_156_ = ((regionIDs[i_154_] & 0xff) * 64 - (aGameScene_3006.gameSceneBaseY * 283514611));
					if (map.isDynamicMapScene()) {
						i_155_ = 10;
						i_156_ = 10;
					}
					int i_157_ = (Class82_Sub13.method910(objectDefinitionLoader, is, i_155_, i_156_, mapWidth * -991330803, -1456212765 * mapLength, (byte) -75));
					if (i_157_ > 0) {
						anInt3021 += i_157_ * 94764029;
					}
				}
				is = aByteArrayArray3002[i_154_];
				if (is != null) {
					int i_158_ = (64 * (regionIDs[i_154_] >> 8) - (aGameScene_3006.gameSceneBaseX * -1760580017));
					int i_159_ = (64 * (regionIDs[i_154_] & 0xff) - (aGameScene_3006.gameSceneBaseY * 283514611));
					if (map.isDynamicMapScene()) {
						i_158_ = 10;
						i_159_ = 10;
					}
					int i_160_ = (Class82_Sub13.method910(objectDefinitionLoader, is, i_158_, i_159_, mapWidth * -991330803, -1456212765 * mapLength, (byte) 54));
					if (i_160_ > 0) {
						anInt3021 += 94764029 * i_160_;
					}
				}
			}
			if (-1134020267 * anInt3021 > 0) {
				if (1792875095 * anInt3024 < anInt3021 * -1134020267) {
					anInt3024 = anInt3021 * -1201957325;
				}
				aClass273_3025 = Class273.aClass273_2904;
				return false;
			}
			if (!aBoolean3018 && aClass273_3025 != Class273.aClass273_2905) {
				StaticMethods.drawCornerLoadingBox(new StringBuilder().append(Tradution.LOADING_PLEASE_WAIT.translate(GameLanguage.CURRENT_LANGUAGE)).append(Class26.breakMessage).append("(100%)").toString(), true, GameClient.activeGraphicsToolkit, StaticMethods.aClass264_3673, StaticMethods.aClass505_8369);
			}
			aClass273_3025 = Class273.aClass273_2907;
			if (!aBoolean3018) {
				StaticMethods.method2365();
			}
			if (!aBoolean3018) {
				for (int i_161_ = 0; i_161_ < 2048; i_161_++) {
					Player class365_sub1_sub1_sub2_sub2 = (GameClient.entities[i_161_]);
					if (class365_sub1_sub1_sub2_sub2 != null) {
						class365_sub1_sub1_sub2_sub2.aClass331_7722 = null;
					}
				}
				for (int i_162_ = 0; i_162_ < GameClient.aClass298_Sub29Array8816.length; i_162_++) {
					ObjectNode class298_sub29 = GameClient.aClass298_Sub29Array8816[i_162_];
					if (class298_sub29 != null) {
						((Class365_Sub1) class298_sub29.nodeObject).aClass331_7722 = null;
					}
				}
			}
			if (!aBoolean3018) {
				JS5FileSystemLoader.method2082(true);
			}
			if (!aBoolean3018) {
				StaticMethods.method1278();
			}
			boolean bool = false;
			if (SettingsManager.settingsManager.water.getValue() == WaterSetting.HIGH) {
				for (int index = 0; index < aByteArrayArray3038.length; index++) {
					if (aByteArrayArray3002[index] != null || (loadedMaps[index] != null)) {
						bool = true;
						break;
					}
				}
			}
			int i_164_ = (Class69.method787(SettingsManager.settingsManager.aClass422_Sub24_7554.getValue()).anInt1581 * 2098573928);
			if (GameClient.activeGraphicsToolkit.at()) {
				i_164_++;
			}
			method2648();
			method2664();
			aClass331_3037 = new Region(GameClient.activeGraphicsToolkit, 9, 4, mapWidth * -991330803, mapLength * -1456212765, i_164_, bool, GameClient.activeGraphicsToolkit.method5048() > 0);
			aClass331_3037.method4052(false, -740850409);
			aClass331_3037.method4007(GameClient.anInt8814 * -2081556469, (byte) -26);
			if (0 != GameClient.anInt8814 * -2081556469) {
				aClass331_3037.method4008(FontToolkit.fontToolkit, -972568309);
			} else {
				aClass331_3037.method4008(null, 1333003580);
			}
			aClass287_3019 = new Class287();
			aFloat3020 = -0.05F + (float) (Math.random() / 10.0);
			aClass240_Sub1_3029 = new Class240_Sub1(aClass331_3037, objectDefinitionLoader, 4, -991330803 * mapWidth, -1456212765 * mapLength, false, aClass244_3012, lightingDetails);
			aClass240_Sub1_3029.method2212(-403694446);
			aClass240_Sub1_3029.sceneryShadowsValue = SettingsManager.settingsManager.sceneryShadows.getValue() * 275039235;
			aClass240_Sub1_3029.waterValue = SettingsManager.settingsManager.water.getValue() == WaterSetting.HIGH;
			aClass240_Sub1_3029.lightingValue = SettingsManager.settingsManager.lighting.getValue() == 1;
			aClass240_Sub1_3029.groundBlendingValue = SettingsManager.settingsManager.groundBlending.getValue() == GroundBlendingSetting.ON;
			aClass240_Sub1_3029.textureValue = SettingsManager.settingsManager.textures.getValue() == TextureSetting.ON;
			if (!map.isDynamicMapScene()) {
				forceDynamicMapScene(aClass240_Sub1_3029, aByteArrayArray3038, (short) 821);//?
			} else {
				method2636(aClass240_Sub1_3029, aByteArrayArray3038);
			}
			if (aBoolean3018) {
				method2658(50, (byte) -75);
			}
			lightingDetails.method4321(mapWidth * -991330803 >> 4, -1456212765 * mapLength >> 4);
			lightingDetails.method4323(this);
			if (bool) {
				aClass331_3037.method4052(true, -740850409);
				aClass240_Sub1_3000 = new Class240_Sub1(aClass331_3037, objectDefinitionLoader, 1, (-991330803 * mapWidth), (-1456212765 * mapLength), true, aClass244_3012, lightingDetails);
				aClass240_Sub1_3000.method2212(-1978540544);
				aClass240_Sub1_3000.sceneryShadowsValue = SettingsManager.settingsManager.sceneryShadows.getValue() * 275039235;
				aClass240_Sub1_3000.waterValue = SettingsManager.settingsManager.water.getValue() == WaterSetting.HIGH;
				aClass240_Sub1_3000.lightingValue = SettingsManager.settingsManager.lighting.getValue() == 1;
				aClass240_Sub1_3000.groundBlendingValue = SettingsManager.settingsManager.groundBlending.getValue() == GroundBlendingSetting.ON;
				aClass240_Sub1_3000.textureValue = SettingsManager.settingsManager.textures.getValue() == TextureSetting.ON;
				if (!map.isDynamicMapScene()) {
					forceDynamicMapScene(aClass240_Sub1_3000, loadedMaps, (short) 5882);
					if (!aBoolean3018) {
						StaticMethods.method6310(true, 1696867322);
					}
				} else {
					method2636(aClass240_Sub1_3000, loadedMaps);
					if (!aBoolean3018) {
						StaticMethods.method6310(true, -428383733);
					}
				}
				aClass240_Sub1_3000.method2211(0, (aClass240_Sub1_3029.anIntArrayArrayArray2653[0]), -1177013471);
				aClass240_Sub1_3000.sendLandscapeDrawData(GameClient.activeGraphicsToolkit, null, null);
				aClass331_3037.method4052(false, -740850409);
				if (aBoolean3018) {
					method2658(50, (byte) 33);
				}
			}
			aClass240_Sub1_3029.sendLandscapeDrawData(GameClient.activeGraphicsToolkit, bool ? (aClass240_Sub1_3000.anIntArrayArrayArray2653) : null, SCENE_CLIP_DATA_PLANES);
			if (!map.isDynamicMapScene()) {
				if (!aBoolean3018) {
					StaticMethods.method6310(true, 1723627031);
				}
				method2660(aClass240_Sub1_3029, aByteArrayArray3014, (byte) -90);
				if (null != aByteArrayArray3044) {
					method2661(-388258926);
				}
			} else {
				if (!aBoolean3018) {
					StaticMethods.method6310(true, 2071599739);
				}
				method2671(aClass240_Sub1_3029, aByteArrayArray3014, 1378612829);
			}
			if (!aBoolean3018) {
				StaticMethods.method6310(true, -741926161);
			}
			aClass240_Sub1_3029.method2219(GameClient.activeGraphicsToolkit, (bool ? aClass331_3037.aClass_xaArray3521[0] : null), null, (byte) -119);
			if (aBoolean3018) {
				method2658(75, (byte) 18);
			}
			aClass240_Sub1_3029.method2242(GameClient.activeGraphicsToolkit, false, 1773155741);
			if (aBoolean3018) {
				method2658(75, (byte) 61);
			}
			if (!aBoolean3018) {
				StaticMethods.method6310(true, 1278015476);
			}
			if (bool) {
				aClass331_3037.method4052(true, -740850409);
				if (!aBoolean3018) {
					StaticMethods.method6310(true, -2085672109);
				}
				if (!map.isDynamicMapScene()) {
					method2660(aClass240_Sub1_3000, aByteArrayArray3002, (byte) -36);
				} else {
					method2671(aClass240_Sub1_3000, aByteArrayArray3002, -957252436);
				}
				if (!aBoolean3018) {
					StaticMethods.method6310(true, 1319323091);
				}
				aClass240_Sub1_3000.method2219(GameClient.activeGraphicsToolkit, null, aClass331_3037.aClass_xaArray3519[0], (byte) 43);
				aClass240_Sub1_3000.method2242(GameClient.activeGraphicsToolkit, true, 1773155741);
				if (!aBoolean3018) {
					StaticMethods.method6310(true, 1345203008);
				}
				aClass331_3037.method4052(false, -740850409);
				if (aBoolean3018) {
					method2658(50, (byte) -40);
				}
			}
			aClass240_Sub1_3029.method2217(-702552699);
			if (aClass240_Sub1_3000 != null) {
				aClass240_Sub1_3000.method2217(-702552699);
			}
			aClass331_3037.method4050(-1802988635);
			if (aBoolean3018) {
				TimeUtils.getTime();
				while (!GameClient.activeGraphicsToolkit.method5041()) {
					method2658(1, (byte) -1);
				}
			}
			boolean bool_165_ = false;
			if (aBoolean3018) {
				GameMap map = GameClient.myRegion;
				method2668(map);
				Class62.aClass248_612.method2381(map);
				bool_165_ = true;
				TimeUtils.getTime();
				synchronized (GameClient.anObject8661) {
					GameClient.aBoolean8717 = true;
					try {
						GameClient.anObject8661.wait();
					} catch (InterruptedException interruptedexception) {

					}
				}
				GameClient.myRegion = this;
				map.method2664();
				method2663(17);
				method2649();
			} else {
				StaticMethods.method2365();
				lightingDetails.setFogIntensity();
				StaticMethods.method1247();
			}
			for (int i_167_ = 0; i_167_ < 4; i_167_++) {
				for (int i_168_ = 0; i_168_ < mapWidth * -991330803; i_168_++) {
					for (int i_169_ = 0; i_169_ < -1456212765 * mapLength; i_169_++) {
						Class173.method1820(i_167_, i_168_, i_169_, 814827061);
					}
				}
			}
			for (int i_170_ = 0; i_170_ < GameClient.aClass299Array8671.length; i_170_++) {
				if (GameClient.aClass299Array8671[i_170_] != null) {
					GameClient.aClass299Array8671[i_170_].method3676(aClass331_3037, 1790221759);
				}
			}
			ToMoveSettings.updateRoofFlags();
			Class420.method5608();
			if (StaticMethods.method4865() == Class292.aClass292_3162 && ConnectionType.gameConnection.getStream() != null && 17 == GameClient.gameState * -1233866115) {
				OutgoingPacketBuffer outgoingPacketBuffer = Class18.method359(OutgoingPacket.aClass198_2040, ConnectionType.gameConnection.encryptor);
				outgoingPacketBuffer.payload.writeInt(1057001181);
				ConnectionType.gameConnection.sendFrame(outgoingPacketBuffer);
			}
			if (!map.isDynamicMapScene()) {
				int i_171_ = ((19679283 * anInt3030 - (mapWidth * -991330803 >> 4)) / 8);
				int i_172_ = ((19679283 * anInt3030 + (mapWidth * -991330803 >> 4)) / 8);
				int i_173_ = ((306966675 * anInt3009 - (mapLength * -1456212765 >> 4)) / 8);
				int i_174_ = ((306966675 * anInt3009 + (-1456212765 * mapLength >> 4)) / 8);
				for (int i_175_ = i_171_ - 1; i_175_ <= 1 + i_172_; i_175_++) {
					for (int i_176_ = i_173_ - 1; i_176_ <= i_174_ + 1; i_176_++) {
						if (i_175_ >= i_171_ && i_175_ <= i_172_ && i_176_ >= i_173_ && i_176_ <= i_174_) {
							if (i >= 1047709682) {
								throw new IllegalStateException();
							}
						} else {
							Js5List.JS5_MAPS.method2304(appendMapData(true, false, i_175_, i_176_), -1752946353);
							Js5List.JS5_MAPS.method2304(appendMapData(false, false, i_175_, i_176_), -1482810579);
							Js5List.JS5_MAPS.method2304(appendMapData(true, true, i_175_, i_176_), -1377878894);
							Js5List.JS5_MAPS.method2304(appendMapData(false, true, i_175_, i_176_), -180643080);
						}
					}
				}
			}
			if (-1233866115 * GameClient.gameState == 1) {
				Class439.loadGameState(19);
			} else if (GameClient.gameState * -1233866115 == 15) {
				Class439.loadGameState(14);
			} else if (16 == GameClient.gameState * -1233866115) {
				Class439.loadGameState(18);
			} else if (-1233866115 * GameClient.gameState == 9) {
				Class439.loadGameState(8);
			} else {
				Class439.loadGameState(0);
				if (ConnectionType.gameConnection.getStream() != null) {
					OutgoingPacketBuffer outgoingPacketBuffer = Class18.method359(OutgoingPacket.DONE_LOADING_REGION_PACKET, ConnectionType.gameConnection.encryptor);
					ConnectionType.gameConnection.sendFrame(outgoingPacketBuffer);
				}
			}
			Class82_Sub19.method926();
			if (aBoolean3008) {
				StaticMethods.sendConsoleMessage(Long.toString(TimeUtils.getTime() - (aLong3045 * 4917044907588821591L)));
				aBoolean3008 = false;
			}
			if (bool_165_) {
				synchronized (GameClient.anObject8718) {
					GameClient.anObject8718.notify();
				}
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lt.ab(").append(')').toString());
		}
	}

	public void method2673(byte i) {
		try {
			aClass273_3025 = Class273.aClass273_2905;
			nulledMaps = 0;
			anInt3028 = 255626399;
			anInt3021 = 0;
			anInt3024 = -861507225;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lt.ax(").append(')').toString());
		}
	}

	public MapLoad method2674() {
		try {
			return map;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lt.a(").append(')').toString());
		}
	}

	public Region getRegion() {
			return aClass331_3037;
	}

	static final void method2676(ScriptRuntime runtime) {
		try {
			int i_177_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
			IComponentDefinition class105 = IComponentDefinition.getInterfaceComponent(i_177_);
			IComponentDefinitionCollection IComponentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[i_177_ >> 16];
			Class225.method2101(class105, IComponentDefinitionCollection, runtime, -1146943352);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lt.ea(").append(')').toString());
		}
	}

	static final void method2677(IComponentDefinition componentDefinition, IComponentDefinitionCollection IComponentDefinitionCollection, ScriptRuntime runtime) {
		try {
			String string = (String) (runtime.objectStack[(runtime.objectArgs -= 969361751) * -203050393]);
			int[] is = Class298_Sub6.method2863(string, runtime);
			if (null != is) {
				string = string.substring(0, string.length() - 1);
			}
			componentDefinition.onStatTransmitHook = Class128_Sub2.method1441(string, runtime);
			componentDefinition.statTransmitList = is;
			componentDefinition.hasScript = true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lt.ml(").append(')').toString());
		}
	}

}
