package com.jagex;/* Class111 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Js5ArchiveEnum {

	public static Js5ArchiveEnum JS5_ANIMSKINS = new Js5ArchiveEnum(0);
	public static Js5ArchiveEnum JS5_BASES = new Js5ArchiveEnum(1);
	public static Js5ArchiveEnum JS5_CONFIG = new Js5ArchiveEnum(2);
	public static Js5ArchiveEnum JS5_INTERFACES = new Js5ArchiveEnum(3);
	public static Js5ArchiveEnum JS5_SOUND_EFFECTS = new Js5ArchiveEnum(4);
	public static Js5ArchiveEnum JS5_MAPS = new Js5ArchiveEnum(5);
	public static Js5ArchiveEnum JS5_MUSIC = new Js5ArchiveEnum(6);
	public static Js5ArchiveEnum JS5_MDOELS = new Js5ArchiveEnum(7);
	public static Js5ArchiveEnum JS5_SPRITES = new Js5ArchiveEnum(8);
	public static Js5ArchiveEnum JS5_TEXTURES = new Js5ArchiveEnum(9);
	public static Js5ArchiveEnum JS5_BINARY = new Js5ArchiveEnum(10);
	public static Js5ArchiveEnum JS5_MUSIC2 = new Js5ArchiveEnum(11);
	public static Js5ArchiveEnum JS5_CLIENTSCRIPTS = new Js5ArchiveEnum(12);
	public static Js5ArchiveEnum JS5_FONTMETRICS = new Js5ArchiveEnum(13);
	public static Js5ArchiveEnum JS5_SOUND_EFFECTS2 = new Js5ArchiveEnum(14);
	public static Js5ArchiveEnum JS5_SOUND_EFFECTS3 = new Js5ArchiveEnum(15);
	public static Js5ArchiveEnum JS5_CONFIG_OBJECTS = new Js5ArchiveEnum(16);
	public static Js5ArchiveEnum JS5_CONFIG_ENUM = new Js5ArchiveEnum(17);
	public static Js5ArchiveEnum JS5_CONFIG_NPC = new Js5ArchiveEnum(18);
	public static Js5ArchiveEnum JS5_CONFIG_ITEMS = new Js5ArchiveEnum(19);
	public static Js5ArchiveEnum JS5_CONFIG_SEQ = new Js5ArchiveEnum(20);
	public static Js5ArchiveEnum JS5_CONFIG_SPOT = new Js5ArchiveEnum(21);
	public static Js5ArchiveEnum JS5_CONFIG_SCRIPT = new Js5ArchiveEnum(22);
	public static Js5ArchiveEnum JS5_WORLDMAPDATA = new Js5ArchiveEnum(23);
	public static Js5ArchiveEnum JS5_QUICKCHAT = new Js5ArchiveEnum(24);
	public static Js5ArchiveEnum JS5_QUICKCHAT_GLOBAL = new Js5ArchiveEnum(25);
	public static Js5ArchiveEnum JS5_MATERIALS = new Js5ArchiveEnum(26);
	public static Js5ArchiveEnum JS5_CONFIG_PARTICLE = new Js5ArchiveEnum(27);
	public static Js5ArchiveEnum JS5_DEFAULTS = new Js5ArchiveEnum(28);
	public static Js5ArchiveEnum JS5_CONFIG_BILLBOARD = new Js5ArchiveEnum(29);
	public static Js5ArchiveEnum JS5_DLLS = new Js5ArchiveEnum(30);
	public static Js5ArchiveEnum JS5_SHADERS = new Js5ArchiveEnum(31);
	public static Js5ArchiveEnum JS5_LOADING_SPRITES = new Js5ArchiveEnum(32);
	public static Js5ArchiveEnum JS5_LOADING_SCREENS = new Js5ArchiveEnum(33);
	public static Js5ArchiveEnum JS5_LOADING_SPRITES_RAW = new Js5ArchiveEnum(34);
	public static Js5ArchiveEnum JS5_CUTSCENES = new Js5ArchiveEnum(35);
	public static Js5ArchiveEnum JS5_VORBIS = new Js5ArchiveEnum(36);
	int index;
	static int highest_index = 1700689323;


	static Js5ArchiveEnum[] listAll(byte i) {
		try {
			return (new Js5ArchiveEnum[] { Js5ArchiveEnum.JS5_CONFIG_ENUM, Js5ArchiveEnum.JS5_LOADING_SPRITES_RAW, Js5ArchiveEnum.JS5_QUICKCHAT, Js5ArchiveEnum.JS5_WORLDMAPDATA, Js5ArchiveEnum.JS5_CONFIG_ITEMS, Js5ArchiveEnum.JS5_MUSIC, Js5ArchiveEnum.JS5_DEFAULTS, Js5ArchiveEnum.JS5_CONFIG_NPC, Js5ArchiveEnum.JS5_CONFIG_PARTICLE, Js5ArchiveEnum.JS5_SOUND_EFFECTS2, Js5ArchiveEnum.JS5_SOUND_EFFECTS3, Js5ArchiveEnum.JS5_CLIENTSCRIPTS, Js5ArchiveEnum.JS5_CONFIG_SEQ, Js5ArchiveEnum.JS5_CONFIG_OBJECTS, Js5ArchiveEnum.JS5_LOADING_SCREENS, Js5ArchiveEnum.JS5_DLLS, Js5ArchiveEnum.JS5_BINARY, Js5ArchiveEnum.JS5_SHADERS, Js5ArchiveEnum.JS5_MATERIALS, Js5ArchiveEnum.JS5_VORBIS, Js5ArchiveEnum.JS5_INTERFACES, Js5ArchiveEnum.JS5_MAPS, Js5ArchiveEnum.JS5_SOUND_EFFECTS, Js5ArchiveEnum.JS5_CONFIG_SCRIPT, Js5ArchiveEnum.JS5_LOADING_SPRITES, Js5ArchiveEnum.JS5_CONFIG_SPOT, Js5ArchiveEnum.JS5_CUTSCENES, Js5ArchiveEnum.JS5_ANIMSKINS, Js5ArchiveEnum.JS5_SPRITES, Js5ArchiveEnum.JS5_CONFIG_BILLBOARD, Js5ArchiveEnum.JS5_BASES, Js5ArchiveEnum.JS5_QUICKCHAT_GLOBAL, Js5ArchiveEnum.JS5_FONTMETRICS, Js5ArchiveEnum.JS5_CONFIG, Js5ArchiveEnum.JS5_MDOELS, Js5ArchiveEnum.JS5_TEXTURES, Js5ArchiveEnum.JS5_MUSIC2 });
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("fb.a(").append(')').toString());
		}
	}

	Js5ArchiveEnum(int index) {
		this.index = index * 1424986353;
	}

	public int getIndex() {
			return this.index * -1047699439;
	}

	static final void isOfferFinished(ScriptRuntime runtime) {
			int slot = runtime.integerStack[(runtime.integerStackOffset -= -391880689) * 681479919];
			int status = GameClient.stockMarketListing[slot].getListingStatus();
			runtime.integerStack[(runtime.integerStackOffset += -391880689) * 681479919 - 1] = status == 5 ? 1 : 0;
	}

	static final void method1235(IComponentDefinition componentDefinition, ScriptRuntime runtime) {
			RSFontMetrics RSFontMetrics = componentDefinition.method1113(StaticMethods5.fonts, GameClient.defaultFontRenderProvider);
			int i_2_ = runtime.integerStack[(runtime.integerStackOffset -= -391880689) * 681479919];
			int i_3_ = runtime.integerStack[(runtime.integerStackOffset -= -391880689) * 681479919];
			int i_4_ = RSFontMetrics.method6261(componentDefinition.text, componentDefinition.aspectWidth * -2093041337, componentDefinition.lineHeight * 418216501, i_3_, i_2_, StaticMedia.nameIconSprites);
			runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = i_4_;
	}

	public static boolean method1236(int i, int i_5_) {
		try {
			return (i >= -1976050083 * Class424.aClass424_6612.type && i <= Class424.aClass424_6597.type * -1976050083);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("en.d(").append(')').toString());
		}
	}

	static final void method1237(ScriptRuntime runtime) {
		try {
			SettingsManager.settingsManager.setValue(SettingsManager.settingsManager.antiAliasing, runtime.integerStack[(runtime.integerStackOffset -= -391880689) * 681479919]);
			ToMoveSettings.encodeBuffer();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("en.aix(").append(')').toString());
		}
	}

	public static Class456[] method1238(Display display) {
		try {
			int[] is = display.method5961();
			Class456[] class456s = new Class456[is.length >> 2];
			for (int i_6_ = 0; i_6_ < class456s.length; i_6_++) {
				Class456 class456 = new Class456();
				class456s[i_6_] = class456;
				class456.anInt5663 = -1110150949 * is[i_6_ << 2];
				class456.anInt5665 = is[1 + (i_6_ << 2)] * 1756912603;
				class456.anInt5664 = 1912690475 * is[2 + (i_6_ << 2)];
				class456.anInt5662 = 2041694879 * is[(i_6_ << 2) + 3];
			}
			return class456s;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("en.a(").append(')').toString());
		}
	}
}
