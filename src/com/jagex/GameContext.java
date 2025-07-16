package com.jagex;/* Class411 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class GameContext {
	public static GameContext stellardawn = new GameContext("stellardawn", "Stellar Dawn", 1);
	public String BUILD_NAME;
	static GameContext game3 = new GameContext("game3", "Game 3", 2);
	static GameContext game4  = new GameContext("game4", "Game 4", 3);
	public static GameContext VENGIUM = new GameContext("vengium", "Vengium", 0);
	static GameContext game5 = new GameContext("game5", "Game 5", 4);
	public String name;
	public int id;
	static MenuOption menuOption;
	static int anInt5325;

	GameContext(String string, String name, int gameType) {
		this.BUILD_NAME = string;
		this.name = name;
		this.id = gameType * 977088255;
	}
	public static long method5574(int i) {
		try {
			return 86400000L * (long) (11745 + i);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("rb.r(").append(')').toString());
		}
	}

	static void method5575(Entity class365_sub1_sub1_sub2, int i, int i_2_) {
		try {
			if (null != class365_sub1_sub1_sub2.anIntArray10093) {
				Class282 class282 = ((Class282) StaticMethods.method5701(Class522.method6325((byte) -26), i));
				int i_3_ = (class365_sub1_sub1_sub2.anIntArray10093[class282.method2617((byte) -118)]);
				if (i_3_ != class365_sub1_sub1_sub2.animator.getAnimationID()) {
					class365_sub1_sub1_sub2.animator.method5833(i_3_, class365_sub1_sub1_sub2.animator.method5827());
					class365_sub1_sub1_sub2.anInt10125 = class365_sub1_sub1_sub2.anInt10120 * -526956429;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("rb.hk(").append(')').toString());
		}
	}

	static void method5577(IComponentDefinition componentDefinition) {
			if (-1215239439 * componentDefinition.type == IComponentDefinition.GRAPHIC && -1 != componentDefinition.itemID * -1232467723)
				Class230.drawItemComponent(GameClient.activeGraphicsToolkit, componentDefinition);
	}

	static void method5579(int i) {
		try {
			if (13 == GameClient.gameState * -1233866115)
				Class264_Sub2.method2506();
			StaticMethods.method3751();
			ConnectionType.lobbyConnection.stopConnection();
			StaticMethods.aBoolean8385 = true;
			ComponentMouseRecorder.method1011();
			for (int index = 0; index < HintIcon.loadedIcons.length; index++)
				HintIcon.loadedIcons[index] = null;
			GameClient.interfaceSelected = false;
			Class127_Sub3.method1434();
			GameClient.anInt8817 = ((int) (Math.random() * 100.0) - 50) * 1640262285;
			GameClient.anInt8742 = ((int) (Math.random() * 110.0) - 55) * 974956735;
			GameClient.cameraXOffset = ((int) (Math.random() * 80.0) - 40) * -1010535049;
			GameClient.anInt8801 = ((int) (Math.random() * 120.0) - 60) * -1216239003;
			GameClient.anInt8749 = ((int) (Math.random() * 30.0) - 20) * -852543493;
			GameClient.cameraXAngle = (float) ((int) (Math.random() * 160.0) - 80 & 0x3fff);
			Class21.method369();
			for (int playerIndex = 0; playerIndex < 2048; playerIndex++)
				GameClient.entities[playerIndex] = null;
			Player.myPlayer = null;
			GameClient.entitySize = 0;
			GameClient.anInt8772 = 0;
			GameClient.entityList.clear();
			GameClient.aClass453_8824.clean();
			GameClient.aClass437_8825.clear();
			GameClient.aClass442_8650.method5869(585418023);
			GameClient.aClass437_8685.clear();
			ObjectDeque.aClass453_7152 = new Class453();
			ObjectDeque.aClass453_7162 = new Class453();
			Class128.playerVarsProvider.method1603(-1549621575);
			Class182.method1847();
			Class376.anInt4089 = 0;
			Class82_Sub4.anInt6832 = 0;
			StaticMethods.anInt6938 = 0;
			Class129.speed2 = 0;
			Class21.speed = 0;
			StaticMethods.anInt6292 = 0;
			IPAddress.anInt5959 = 0;
			Class18.anInt255 = 0;
			Class128_Sub1.anInt8556 = 0;
			Class427.anInt5362 = 0;
			for (int i_14_ = 0; i_14_ < Class374.interfaceGCValue.length; i_14_++) {
				if (!Class254.interfaceGC[i_14_])
					Class374.interfaceGCValue[i_14_] = -1;
			}
			if (-257444687 * GameClient.WINDOW_PANE_ID != -1)
				Class82_Sub8.deactivateComponents(-257444687 * GameClient.WINDOW_PANE_ID);
			for (Widget class298_sub51 = ((Widget) GameClient.linkedList.method5816()); null != class298_sub51; class298_sub51 = ((Widget) GameClient.linkedList.method5815())) {
				if (!class298_sub51.isNextAvailable()) {
					class298_sub51 = ((Widget) GameClient.linkedList.method5816());
					if (null == class298_sub51) {
						if (i != -2092028687) {
							/* empty */
						}
						break;
					}
				}
				Widget.closeInterface(class298_sub51, true, false);
			}
			GameClient.WINDOW_PANE_ID = -1785861201;
			GameClient.linkedList = new LinkedList(8);
			IComponentDefinitionCollection.setInterfaceDefinitionSize();
			GameClient.loadingScreen = null;
			for (int index = 0; index < 8; index++) {
				GameClient.aStringArray8820[index] = null;
				GameClient.aBooleanArray8821[index] = false;
				GameClient.anIntArray8904[index] = -1;
			}
			Class418.method5601((byte) -40);
			GameClient.isLoading = true;
			for (int i_16_ = 0; i_16_ < 113; i_16_++)
				GameClient.aBooleanArray8900[i_16_] = true;
			for (int i_17_ = 0; i_17_ < 6; i_17_++)
				GameClient.stockMarketListing[i_17_] = new StockMarketListing();
			GameClient.myRegion.getLightningDetails().method4324();
			GameClient.aBoolean8763 = true;
			Class107.aShortArray1315 = ObjectDefinition.aShortArray5423 = NPCDefinition.aShortArray6182 = ItemDefinition.aShortArray5757 = new short[256];
			StaticMethods.mouseHoverString = Tradution.WALK_HERE.translate(GameLanguage.CURRENT_LANGUAGE);
			SettingsManager.settingsManager.setValue(SettingsManager.settingsManager.currentRoofs, SettingsManager.settingsManager.removeRoofs.getValue());
			GameClient.totalPacketCount = 0;
			StaticMethods.method5905();
			StaticMethods.method3974();
			StaticMethods.aClass396_6291 = null;
			Class365_Sub1_Sub2_Sub1.aLong9911 = 0L;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("rb.ak(").append(')').toString());
		}
	}

}
