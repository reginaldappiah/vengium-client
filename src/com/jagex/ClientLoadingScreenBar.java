package com.jagex;/* Class227 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.Js5Configs;
import com.jagex.game.cache.config.prefetch.JS5PrefetchType;
import com.jagex.game.cache.config.prefetch.Js5List;
import com.jagex.game.cache.config.quest.QuestTypeLoader;
import com.jagex.game.cache.definition.animation.AnimationDefinitionLoader;
import com.jagex.game.cache.config.ConfigType;
import com.jagex.game.cache.config.underlay.UnderlayTypeLoader;
import com.jagex.utils.TimeUtils;

public class ClientLoadingScreenBar {

	static ClientLoadingScreenBar loadingScreenVisuals = new ClientLoadingScreenBar(0, Tradution.gatheringUpdates, 2);
	static ClientLoadingScreenBar loadingFont = new ClientLoadingScreenBar(1, Tradution.gatheringUpdates, new Tradution("Loading Font "), 2, 3);
	static ClientLoadingScreenBar aClass227_2532 = new ClientLoadingScreenBar(2, Tradution.gatheringUpdates, 3);
	static ClientLoadingScreenBar loadingProgress = new ClientLoadingScreenBar(3, Tradution.gatheringUpdates, Tradution.gatheringUpdates, 3, 4);
	static ClientLoadingScreenBar loadingGraphicsToolkit = new ClientLoadingScreenBar(4, new Tradution("Loading Graphics Toolkit "), 4);
	static ClientLoadingScreenBar loadingCacheIndicies = new ClientLoadingScreenBar(5, Tradution.gatheringUpdates, Tradution.gatheringUpdates, 4, 5);
	static ClientLoadingScreenBar aClass227_2536 = new ClientLoadingScreenBar(6, Tradution.gatheringUpdates, Tradution.gatheringUpdates, 5, 98, true, true);
	static ClientLoadingScreenBar loadingGameDefaults = new ClientLoadingScreenBar(7, new Tradution("Loading Game Defaults "), 99);
	static ClientLoadingScreenBar loadingNativeLibraries = new ClientLoadingScreenBar(8, new Tradution("Loading Native Libraries "), 100);
	static ClientLoadingScreenBar loadingDefaults = new ClientLoadingScreenBar(9, Tradution.updatingSystem, new Tradution("Loading Defaults "), 0, 92, true, true);
	static ClientLoadingScreenBar loadingConfigurations = new ClientLoadingScreenBar(10, Tradution.updatingSystem, Tradution.updatingSystem, 92, 93);
	static ClientLoadingScreenBar loading94to95 = new ClientLoadingScreenBar(11, Tradution.updatingSystem, Tradution.updatingSystem, 94, 95);
	static ClientLoadingScreenBar loading96to97 = new ClientLoadingScreenBar(12, Tradution.updatingSystem, Tradution.updatingSystem, 96, 97);
	static ClientLoadingScreenBar updating97 = new ClientLoadingScreenBar(13, Tradution.updatingSystem, 97);
	static ClientLoadingScreenBar aClass227_2544 = new ClientLoadingScreenBar(14, Tradution.updatingSystem, 97);
	static ClientLoadingScreenBar aClass227_2545 = new ClientLoadingScreenBar(15, Tradution.updatingSystem, 100);
	static ClientLoadingScreenBar aClass227_2546 = new ClientLoadingScreenBar(16, Tradution.updatingSystem, 100);
	static ClientLoadingScreenBar aClass227_2547 = new ClientLoadingScreenBar(17, new Tradution("RSMV Away "), 100);
	static ClientLoadingScreenBar currentLoadingScreen;
	static String loadingScreenText;
	static int currentPercentage;
    static Class515 aClass515_5344;

    public int anInt2548;
	Tradution secondaryText;
	Tradution primaryText;
	boolean aBoolean2550;
	boolean finished;
	int startPercentage;
	int finishPercentage;

    ClientLoadingScreenBar(int i, Tradution class470, int i_0_) {
		this(i, class470, class470, i_0_, i_0_, true, false);
	}

	ClientLoadingScreenBar(int i, Tradution class470, Tradution class470_1_, int startPercentage, int finishPercentage) {
		this(i, class470, class470_1_, startPercentage, finishPercentage, true, false);
	}

	ClientLoadingScreenBar(int i, Tradution tradution, Tradution class470_1, int startPercentage, int finishPercentage, boolean bool, boolean bool_7_) {
		anInt2548 = i * -1323079015;
		this.primaryText = tradution;
		this.secondaryText = class470_1;
		this.startPercentage = startPercentage * -931220425;
		this.finishPercentage = finishPercentage * 774291301;
		this.finished = bool;
		this.aBoolean2550 = bool_7_;
	}

	static ClientLoadingScreenBar[] method2109() {
			return (new ClientLoadingScreenBar[] {loadingScreenVisuals, loadingFont, aClass227_2532, loadingProgress, loadingGraphicsToolkit, loadingCacheIndicies, aClass227_2536, loadingGameDefaults, loadingNativeLibraries, loadingDefaults, loadingConfigurations, loading94to95, loading96to97, updating97, aClass227_2544, aClass227_2545, aClass227_2546, aClass227_2547 });
	}

	static int pushLoadingBarProgress() {
			if (SettingsManager.settingsManager.safeMode.getValue() == 0) {
				for (int index = 0; index < GameClient.keyRecordsSize * 1351936279; index++) {
					if (GameClient.lastKeyRecords[index].getCharacter() == 's' || GameClient.lastKeyRecords[index].getCharacter() == 'S') {
						SettingsManager.settingsManager.setValue((SettingsManager.settingsManager.safeMode), 1);
						GameClient.safeMode = true;
						break;
					}
				}
			}
			if (currentLoadingScreen == loadingScreenVisuals) {
				if (StaticMethods.aClass225_2337 == null)
					StaticMethods.aClass225_2337 = new Class225(PaddedResourceWorker.protocol, Class365_Sub1_Sub3.aCacheResourceWorker_9804, Class50.aBigInteger502, Class50.aBigInteger501);
				if (!StaticMethods.aClass225_2337.method2094())
					return 0;
				Class297.method2968(0, null, true);
				Class230.aBoolean2567 = !Class78.method844((byte) 3);
				Js5List.JS5_LOADING_SPRITES_RAW = Class372.loadIndex((Class230.aBoolean2567 ? Js5ArchiveEnum.JS5_LOADING_SPRITES_RAW : Js5ArchiveEnum.JS5_LOADING_SPRITES), false, 1);
				Js5List.JS5_LOADING_SCREENS = Class372.loadIndex(Js5ArchiveEnum.JS5_LOADING_SCREENS, false, 1);
				Js5List.JS5_FONTMETRICS = Class372.loadIndex(Js5ArchiveEnum.JS5_FONTMETRICS, false, 1);
			}
			if (loadingFont == currentLoadingScreen) {
				boolean archiveFilled = Js5List.JS5_LOADING_SCREENS.archiveFilled();
				int i_19_ = OverlayDefinition.aJs5IndexSystemArray4072[Js5ArchiveEnum.JS5_LOADING_SCREENS.getIndex()].method2270();
				i_19_ = i_19_ + OverlayDefinition.aJs5IndexSystemArray4072[(Class230.aBoolean2567 ? Js5ArchiveEnum.JS5_LOADING_SPRITES_RAW.getIndex() : Js5ArchiveEnum.JS5_LOADING_SPRITES.getIndex())].method2270();
				i_19_ += OverlayDefinition.aJs5IndexSystemArray4072[Js5ArchiveEnum.JS5_FONTMETRICS.getIndex()].method2270();
				i_19_ = i_19_ + (archiveFilled ? 100 : Js5List.JS5_LOADING_SCREENS.getProgress());
				if (i_19_ != 400)
					return i_19_ / 4;
				Class386.anInt4145 = (Js5List.JS5_LOADING_SPRITES_RAW.getCRC() * -1650604707);
				Class118.anInt1401 = (Js5List.JS5_LOADING_SCREENS.getCRC() * 1003249155);
				Class70.method806(Js5List.JS5_LOADING_SPRITES_RAW, (byte) 13);
				int i_20_ = SettingsManager.settingsManager.aClass422_Sub20_7578.getValue();
				aClass515_5344 = new Class515(GameClient.game, GameLanguage.CURRENT_LANGUAGE, Js5List.JS5_LOADING_SCREENS);
				Class510[] class510s = aClass515_5344.method6294(i_20_);
				if (class510s.length == 0)
					class510s = aClass515_5344.method6294(0);
				Class143 class143 = new Class143(Js5List.JS5_LOADING_SPRITES_RAW, Js5List.JS5_FONTMETRICS);
				if (class510s.length > 0) {
					Class230.anInterface12Array2562 = new Interface12[class510s.length];
					for (int i_21_ = 0; i_21_ < Class230.anInterface12Array2562.length; i_21_++)
						Class230.anInterface12Array2562[i_21_] = new Class229((aClass515_5344.method6295((-872036857 * class510s[i_21_].anInt6220), (byte) 89)), (722190409 * class510s[i_21_].anInt6218), (class510s[i_21_].anInt6219 * -1852131045), class143);
				}
			}
			if (aClass227_2532 == currentLoadingScreen)
				StaticMethods5.fonts = new FontManager(Js5List.JS5_LOADING_SPRITES_RAW, Js5List.JS5_FONTMETRICS, StaticMethods.getFontIds());
			if (currentLoadingScreen == loadingProgress) {
				int i_22_ = StaticMethods5.fonts.method1877();
				int i_23_ = StaticMethods5.fonts.method1878();
				if (i_22_ < i_23_)
					return 100 * i_22_ / i_23_;
			}
			if (currentLoadingScreen == loadingGraphicsToolkit) {
				if (Class230.anInterface12Array2562 != null && Class230.anInterface12Array2562.length > 0) {
					if (Class230.anInterface12Array2562[0].method159((byte) 54) < 100)
						return 0;
					if (Class230.anInterface12Array2562.length > 1 && aClass515_5344.method6296((byte) -52) && Class230.anInterface12Array2562[1].method159((byte) 126) < 100)
						return 0;
				}
				StaticMethods5.fonts.load(GameClient.defaultFontRenderProvider);
				FontToolkit.method5744();
				Class439.loadGameState(11);
			}
			if (loadingCacheIndicies == currentLoadingScreen) {
				Js5List.JS5_ANIMSKINS = Class372.loadIndex(Js5ArchiveEnum.JS5_ANIMSKINS, false, 1);
				Js5List.JS5_BASES = Class372.loadIndex(Js5ArchiveEnum.JS5_BASES, false, 1);
				Js5List.JS5_CONFIG = Class372.loadIndex(Js5ArchiveEnum.JS5_CONFIG, false, 1);
				Js5List.JS5_INTERFACES = Class372.loadIndex(Js5ArchiveEnum.JS5_INTERFACES, false, 1);
				Js5List.JS5_SOUND_EFFECTS = Class372.loadIndex(Js5ArchiveEnum.JS5_SOUND_EFFECTS, false, 1);
				Js5List.JS5_MAPS = Class372.loadIndex(Js5ArchiveEnum.JS5_MAPS, true, 1);
				Js5List.JS5_MUSIC = Class372.loadIndex(Js5ArchiveEnum.JS5_MUSIC, true, 1);
				Js5List.JS5_MDOELS = Class372.loadIndex(Js5ArchiveEnum.JS5_MDOELS, false, 1);
				Js5List.JS5_SPRITES = Class372.loadIndex(Js5ArchiveEnum.JS5_SPRITES, false, 1);
				Js5List.JS5_TEXTURES = Class372.loadIndex(Js5ArchiveEnum.JS5_TEXTURES, false, 1);
				Js5List.JS5_BINARY = Class372.loadIndex(Js5ArchiveEnum.JS5_BINARY, false, 1);
				Js5List.JS5_MUSIC2 = Class372.loadIndex(Js5ArchiveEnum.JS5_MUSIC2, false, 1);
				Js5List.JS5_CLIENTSCRIPTS = Class372.loadIndex(Js5ArchiveEnum.JS5_CLIENTSCRIPTS, false, 1);
				Js5List.JS5_SOUND_EFFECTS2 = Class372.loadIndex(Js5ArchiveEnum.JS5_SOUND_EFFECTS2, false, 1);
				Js5List.JS5_SOUND_EFFECTS3 = Class372.loadIndex(Js5ArchiveEnum.JS5_SOUND_EFFECTS3, false, 1);
				Js5List.JS5_CONFIG_OBJECTS = Class372.loadIndex(Js5ArchiveEnum.JS5_CONFIG_OBJECTS, false, 1);
				Js5List.JS5_CONFIG_ENUM = Class372.loadIndex(Js5ArchiveEnum.JS5_CONFIG_ENUM, false, 1);
				Js5List.JS5_CONFIG_NPC = Class372.loadIndex(Js5ArchiveEnum.JS5_CONFIG_NPC, false, 1);
				Js5List.JS5_CONFIG_ITEMS = Class372.loadIndex(Js5ArchiveEnum.JS5_CONFIG_ITEMS, false, 1);
				Js5List.JS5_CONFIG_SEQ = Class372.loadIndex(Js5ArchiveEnum.JS5_CONFIG_SEQ, false, 1);
				Js5List.JS5_CONFIG_SPOT = Class372.loadIndex(Js5ArchiveEnum.JS5_CONFIG_SPOT, false, 1);
				Js5List.JS5_CONFIG_SCRIPT = Class372.loadIndex(Js5ArchiveEnum.JS5_CONFIG_SCRIPT, false, 1);
				Js5List.JS5_WORLDMAPDATA = Class372.loadIndex(Js5ArchiveEnum.JS5_WORLDMAPDATA, true, 1);
				Js5List.JS5_QUICKCHAT = Class372.loadIndex(Js5ArchiveEnum.JS5_QUICKCHAT, false, 1);
				Js5List.JS5_QUICKCHAT_GLOBAL = Class372.loadIndex(Js5ArchiveEnum.JS5_QUICKCHAT_GLOBAL, false, 1);
				Js5List.JS5_MATERIALS = Class372.loadIndex(Js5ArchiveEnum.JS5_MATERIALS, true, 1);
				Js5List.JS5_CONFIG_PARTICLE = Class372.loadIndex(Js5ArchiveEnum.JS5_CONFIG_PARTICLE, false, 1);
				Js5List.JS5_DEFAULTS_FILE = Class372.loadIndex(Js5ArchiveEnum.JS5_DEFAULTS, true, 1);
				Js5List.JS5_CONFIG_BILLBOARD = Class372.loadIndex(Js5ArchiveEnum.JS5_CONFIG_BILLBOARD, false, 1);
				Js5List.JS5_NATIVE_LIBRARIES = Class372.loadIndex(Js5ArchiveEnum.JS5_DLLS, true, 1);
				Js5List.JS5_SHADERS = Class372.loadIndex(Js5ArchiveEnum.JS5_SHADERS, true, 1);
				Js5List.JS5_CUTSCENES = Class372.loadIndex(Js5ArchiveEnum.JS5_CUTSCENES, true, 1);
				Js5List.JS5_VORBIS = Class372.loadIndex(Js5ArchiveEnum.JS5_VORBIS, true, 2);
			}
			if (currentLoadingScreen == aClass227_2536) {
				int progress = 0;
				for (int index = 0; index < OverlayDefinition.aJs5IndexSystemArray4072.length; index++) {
					if (null != OverlayDefinition.aJs5IndexSystemArray4072[index])
						progress += (OverlayDefinition.aJs5IndexSystemArray4072[index].method2270() * Class230.anIntArray2568[index] / 100);
				}
				if (progress != 100) {
					if (Class230.anInt2565 * -1347166103 < 0)
						Class230.anInt2565 = 1430761433 * progress;
					return (100 * (progress - Class230.anInt2565 * -1347166103) / (100 - Class230.anInt2565 * -1347166103));
				}
				StaticMethods.loadFontIDs(Js5List.JS5_SPRITES);
				StaticMethods5.fonts = new FontManager(Js5List.JS5_SPRITES, Js5List.JS5_FONTMETRICS, StaticMethods.getFontIds());
			}
			if (currentLoadingScreen == loadingGameDefaults) {
				byte[] data = Js5List.JS5_DEFAULTS_FILE.get((-363169051 * (Class380.aClass380_4102.anInt4108)));
				if (data == null)
					return 0;
				GameDefaults.readValueLoop(data);
				ToMoveSettings.setDefaultAudio();
				Class439.loadGameState(7);
			}
			if (loadingNativeLibraries == currentLoadingScreen) {
				JS5NativeManager.nativeManager = new JS5NativeManager(Js5List.JS5_NATIVE_LIBRARIES);
				JS5PrefetchType.setEmptyPrefetch(JS5NativeManager.nativeManager);
			}
			if (loadingDefaults == currentLoadingScreen) {
				int i_26_ = Class354.method4259();
				if (i_26_ < 100)
					return i_26_;
				Class74.method824((Js5List.JS5_DEFAULTS_FILE.get((Class380.aClass380_4103.anInt4108 * -363169051))), 745625463);
				Js5List.JS5_DEFAULTS = new GameDefaults(Js5List.JS5_DEFAULTS_FILE);
				PlayerAppearance.originalBodyColours = Js5List.JS5_DEFAULTS.aShortArrayArray4039;
				PlayerAppearance.replacementBodyColors = Js5List.JS5_DEFAULTS.aShortArrayArrayArray4044;
				if (-1 != 1352949337 * Js5List.JS5_DEFAULTS.loadScreenXOffset && -1 != 133542095 * Js5List.JS5_DEFAULTS.loadScreenYOffset) {
					GameClient.anInt8794 = -2081728285 * Js5List.JS5_DEFAULTS.loadScreenXOffset;
					GameClient.anInt8803 = Js5List.JS5_DEFAULTS.loadScreenYOffset * 437692501;
				}
				EquipmentDefaults.defaults = new EquipmentDefaults(Js5List.JS5_DEFAULTS_FILE);
				StaticMethods.aClass381_1563 = new Class381(Js5List.JS5_DEFAULTS_FILE);
				StaticMethods.aClass377_5519 = new Class377(Js5List.JS5_DEFAULTS_FILE);
			}
			if (loadingConfigurations == currentLoadingScreen) {
				if (-1919698893 * Js5List.JS5_DEFAULTS.anInt4035 != -1 && !Js5List.JS5_MDOELS.fileExists((-1919698893 * (Js5List.JS5_DEFAULTS.anInt4035)), 0))
					return 99;
				Js5Configs.texturesList = new ScriptInstructions(Js5List.JS5_MATERIALS, Js5List.JS5_TEXTURES, Js5List.JS5_SPRITES);
				Class92.aClass504_905 = new Class504(Js5List.JS5_CONFIG);
				Class94.aClass349_913 = new Class349(Js5List.JS5_CONFIG, EquipmentDefaults.defaults);
				Class_na.cursorDefLoader = new CursorDefinitionLoader(Js5List.JS5_CONFIG, Js5List.JS5_SPRITES);
				Class51.aClass475_506 = new MapsDefinitionsLoader(Js5List.JS5_CONFIG_ENUM);
				StaticMethods.aClass375_6196 = new OverlayDefinitionLoader(Js5List.JS5_CONFIG);
				Class151.aClass451_6358 = new UnderlayTypeLoader(Js5List.JS5_CONFIG);
				HitsplatDefinitionLoader.aClass347_6117 = new HitsplatDefinitionLoader(Js5List.JS5_CONFIG, Js5List.JS5_SPRITES);
				Js5Configs.idkList = new IdentityKitDefinitionLoader(Js5List.JS5_CONFIG, Js5List.JS5_MDOELS);
				Class300.itemContainerDefinitionLoader = new ItemContainerDefinitionLoader(Js5List.JS5_CONFIG);
				StaticMethods.aClass499_6668 = new Class499(Js5List.JS5_CONFIG);
				ObjectDefinitionLoader.objectDefinitionLoader = new ObjectDefinitionLoader(GameClient.game, GameLanguage.CURRENT_LANGUAGE, true, Js5List.JS5_CONFIG_OBJECTS, Js5List.JS5_MDOELS);
				GameClient.myRegion.setObjectDefinitionLoader(ObjectDefinitionLoader.objectDefinitionLoader);
				Class62.aClass248_612.setObjectDefinitionLoader(new ObjectDefinitionLoader(GameClient.game, GameLanguage.CURRENT_LANGUAGE, true, Js5List.JS5_CONFIG_OBJECTS, Js5List.JS5_MDOELS));
				Class363.aClass339_3931 = new Class339(Js5List.JS5_CONFIG, Js5List.JS5_SPRITES);
				ConfigType.aClass487_1463 = new Class487(Js5List.JS5_CONFIG, Js5List.JS5_SPRITES);
				NPCDefinitionLoader.npcList = new NPCDefinitionLoader(GameClient.game, GameLanguage.CURRENT_LANGUAGE, true, Js5List.JS5_CONFIG_NPC, Js5List.JS5_MDOELS);
				Js5Configs.itemList = new ItemDefinitionLoader(GameClient.game, GameLanguage.CURRENT_LANGUAGE, true, Class92.aClass504_905, Js5List.JS5_CONFIG_ITEMS, Js5List.JS5_MDOELS);//
				Class316.aClass362_3318 = new QuestTypeLoader(Js5List.JS5_CONFIG, true);
				Js5Configs.animsList = new AnimationDefinitionLoader(Js5List.JS5_CONFIG_SEQ, Js5List.JS5_ANIMSKINS, Js5List.JS5_BASES);//
				Js5Configs.configList = new SkyBoxLoader(Js5List.JS5_CONFIG);
				Class138_Sub1.configs = new Class131(Js5List.JS5_CONFIG);
				SpotTypeLoader.loader = new SpotTypeLoader(Js5List.JS5_CONFIG_SPOT, Js5List.JS5_MDOELS);
				ItemDefinitionLoader.aClass500_6001 = new Class500(Js5List.JS5_CONFIG, true);
				Class412.aClass508_6574 = new Class508(Js5List.JS5_CONFIG);
				StaticMethods.aClass494_6550 = new Class494(Js5List.JS5_CONFIG);
				Class472.configLoader = new ConfigDefinitionLoader(Js5List.JS5_CONFIG_SCRIPT);
				Class440.aClass205_5582 = new Class205(Js5List.JS5_CONFIG);
				StaticMethods.aClass445_8384 = new Class445(Js5List.JS5_CONFIG);
				Class82_Sub16.aClass427_6886 = new Class427(Js5List.JS5_CONFIG);
				Class99.aClass517_951 = new Class517(Js5List.JS5_CONFIG);
				Class299.aClass370_3199 = new Class370(Js5List.JS5_CONFIG);
				IComponentDefinition.method3080(Js5List.JS5_INTERFACES, Js5List.JS5_MDOELS, Js5List.JS5_SPRITES);
				StaticMethods.setBillboardConfig(Js5List.JS5_CONFIG_BILLBOARD);
				GraphicsToolkit.aClass256_5315 = new Class256(Js5List.JS5_QUICKCHAT, Js5List.JS5_QUICKCHAT_GLOBAL);
				StaticMethods.aClass469_5618 = new Class469(Js5List.JS5_QUICKCHAT, Js5List.JS5_QUICKCHAT_GLOBAL, new Class180());
				Class165.method1783();
				Class128.playerVarsProvider = new Class148();
				StaticMethods.method4294();
				AnimationDefinitionLoader.setAnimationDefinitionLoader(Js5Configs.animsList);
				StaticMethods.method6188(Js5List.JS5_CONFIG_PARTICLE);
				Class62.method727(Js5List.JS5_MDOELS, Js5Configs.texturesList);
				HuffmanCodec huffman = new HuffmanCodec(Js5List.JS5_BINARY.getFile("huffman", ""));
				Class336_Sub6.method4107(huffman);
				GameShell.frameBase = GameShell.createFrameTimeBase();
				Class12.systemInfo = new Class298_Sub44(true);
			}
			if (loading94to95 == currentLoadingScreen) {
				int i_27_ = (Class298_Sub32_Sub30.method3334(Js5List.JS5_SPRITES, (byte) 34) + StaticMethods5.fonts.method1875(true));
				int i_28_ = (Class273.method2565((short) 7611) + StaticMethods5.fonts.method1878());
				if (i_27_ < i_28_)
					return i_27_ * 100 / i_28_;
			}
			if (loading96to97 == currentLoadingScreen)
				WorldMapHandler.method3690(Js5List.JS5_WORLDMAPDATA, StaticMethods.aClass375_6196, Class151.aClass451_6358, GameClient.myRegion.getObjectDefinitionLoader(), Class363.aClass339_3931, ConfigType.aClass487_1463, Class128.playerVarsProvider);
			if (currentLoadingScreen == updating97) {
				Class374.interfaceGCValue = new int[-2088092255 * StaticMethods.aClass494_6550.anInt6090];
				Class254.interfaceGC = (new boolean[StaticMethods.aClass494_6550.anInt6090 * -2088092255]);
				StaticMethods.interfaceGCString = (new String[1127111807 * Class412.aClass508_6574.configArchiveSize]);
				for (int i_29_ = 0; i_29_ < StaticMethods.aClass494_6550.anInt6090 * -2088092255; i_29_++) {
					if ((StaticMethods.aClass494_6550.load(i_29_).anInt5969) * 1043657149 == 0) {
						Class254.interfaceGC[i_29_] = true;
						GameClient.anInt8890 += 1273319593;
					}
					Class374.interfaceGCValue[i_29_] = -1;
				}
				SubIncommingPacket.method1919();
				Js5List.JS5_MAPS.clearNames(false, true);
				Js5List.JS5_MUSIC.clearNames(true, true);
				Js5List.JS5_SPRITES.clearNames(true, true);
				Js5List.JS5_FONTMETRICS.clearNames(true, true);
				Js5List.JS5_BINARY.clearNames(true, true);
				GameClient.aBoolean8672 = true;
			}
			if (aClass227_2544 == currentLoadingScreen) {
				if (!Class378.componentExists((Js5List.JS5_DEFAULTS.backgroundInterface * 747461259), null))

					return 0;
				boolean bool = true;
				for (int componentID = 0; componentID < (IComponentDefinition.getIComponentDefinitionCollections[747461259 * Js5List.JS5_DEFAULTS.backgroundInterface].componentDefinitions).length; componentID++) {
					IComponentDefinition componentDefinition = (IComponentDefinition.getIComponentDefinitionCollections[Js5List.JS5_DEFAULTS.backgroundInterface * 747461259].componentDefinitions[componentID]);
					if (-1215239439 * componentDefinition.type == IComponentDefinition.GRAPHIC && -1 != componentDefinition.graphicID * 1411971043 && !(Js5List.JS5_SPRITES.fileExists(1411971043 * componentDefinition.graphicID, 0)))
						bool = false;
				}
				if (!bool)
					return 0;
			}
			if (aClass227_2545 == currentLoadingScreen)
				ClassNotAnim.method6227(true);
			if (aClass227_2546 == currentLoadingScreen) {
				Class288_Sub1.target.method2042();
				try {
					GameClient.thread.join();
				} catch (InterruptedException interruptedexception) {
					return 0;
				}
				Class288_Sub1.target = null;
				GameClient.thread = null;
				Js5List.JS5_LOADING_SPRITES_RAW = null;
				Js5List.JS5_LOADING_SCREENS = null;
				aClass515_5344 = null;
				Class230.anInterface12Array2562 = null;
				NPCDefinitionLoader.method6276();
				GameClient.aBoolean8646 = SettingsManager.settingsManager.safeMode.getValue() == 1;
				SettingsManager.settingsManager.setValue(SettingsManager.settingsManager.safeMode, 1);
				if (GameClient.aBoolean8646)
					SettingsManager.settingsManager.setValue((SettingsManager.settingsManager.desiredToolkit), 0);
				else if ((SettingsManager.settingsManager.desiredToolkit.defaultValue) && (399637415 * Class12.systemInfo.cpuClockSpeed < 512) && (399637415 * Class12.systemInfo.cpuClockSpeed != 0))
					SettingsManager.settingsManager.setValue((SettingsManager.settingsManager.desiredToolkit), 0);
				ToMoveSettings.encodeBuffer();
				if (GameClient.aBoolean8646)
					Class370.loadingPleaseWait(ToolkitOption.PUREJAVA, false);
				else
					Class370.loadingPleaseWait(SettingsManager.settingsManager.desiredToolkit.getValue(), false);
				Class357.method4276(SettingsManager.settingsManager.screenSize.getValue(), -1, -1, false);
				StaticMethods5.fonts.load(GameClient.defaultFontRenderProvider);
				FontToolkit.method5744();
				StaticMedia.loadSprites(GameClient.activeGraphicsToolkit, Js5List.JS5_SPRITES);
				StaticMethods5.method1755(StaticMedia.nameIconSprites);
			}
			return Class522.method6324(205846067);
	}

	public static void startLoadingBar() {
			if (null == Class230.aClass227Array2561) {
				Class230.aClass227Array2561 = method2109();
				currentLoadingScreen = Class230.aClass227Array2561[0];
				Class230.time = TimeUtils.getTime() * 3538585047679075717L;
			}
			if (null == Class288_Sub1.target)
				Class288_Sub1.method5191();
			ClientLoadingScreenBar loadingScreen = currentLoadingScreen;
			int progress = pushLoadingBarProgress();
			if (currentLoadingScreen == loadingScreen) {
				loadingScreenText = currentLoadingScreen.primaryText.translate(GameLanguage.CURRENT_LANGUAGE);
				if (currentLoadingScreen.aBoolean2550)
					currentPercentage = (360399239 * currentLoadingScreen.startPercentage + ((-1620354451 * (currentLoadingScreen.finishPercentage)) - (360399239 * (currentLoadingScreen.startPercentage))) * progress / 100) * -1030314565;
				if (currentLoadingScreen.finished)
					loadingScreenText = new StringBuilder().append(loadingScreenText).append(currentPercentage * 1131632499).append("%").toString();
			} else if (currentLoadingScreen == aClass227_2547) {
				Class288_Sub1.target = null;
				Class439.loadGameState(19);
			} else {
				loadingScreenText = loadingScreen.secondaryText.translate(GameLanguage.CURRENT_LANGUAGE);
				if (currentLoadingScreen.finished)
					loadingScreenText = new StringBuilder().append(loadingScreenText).append(loadingScreen.finishPercentage * -1620354451).append("%").toString();
				currentPercentage = 982601375 * loadingScreen.finishPercentage;
				if (currentLoadingScreen.aBoolean2550 || loadingScreen.aBoolean2550)
					Class230.time = TimeUtils.getTime() * 3538585047679075717L;
			}
			if (Class288_Sub1.target != null) {
				Class288_Sub1.target.updateLoadingBarPercentage(-4360787748556788915L * Class230.time, loadingScreenText, 1131632499 * currentPercentage, currentLoadingScreen);
				if (null != Class230.anInterface12Array2562) {
					for (int i_4_ = 1 + -1936794913 * Class230.anInt2563; i_4_ < Class230.anInterface12Array2562.length; i_4_++) {
						if (Class230.anInterface12Array2562[i_4_].method159((byte) 31) >= 100 && -1936794913 * Class230.anInt2563 == i_4_ - 1 && 12 != -1233866115 * GameClient.gameState && Class288_Sub1.target.method2035(-1321940215)) {
							try {
								Class230.anInterface12Array2562[i_4_].method150(-1481032979);
							} catch (Exception exception) {
								Class230.anInterface12Array2562 = null;
								break;
							}
							Class288_Sub1.target.method2036(Class230.anInterface12Array2562[i_4_]);
							Class230.anInt2563 += 64708895;
							if ((Class230.anInt2563 * -1936794913 >= Class230.anInterface12Array2562.length - 1) && Class230.anInterface12Array2562.length > 1)
								Class230.anInt2563 = (aClass515_5344.method6296((byte) 7) ? 0 : -1) * 64708895;
						}
					}
				}
			}

	}
}
