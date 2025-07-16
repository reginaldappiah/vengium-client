package com.jagex;/* Class94 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.Js5Configs;

public final class Class94 {
	int anInt906;
	int[] anIntArray907;
	static int anInt908 = 25;
	public int anInt909;
	NPC aClass365_Sub1_Sub1_Sub2_Sub1_910;
	Player aClass365_Sub1_Sub1_Sub2_Sub2_911;
	public boolean aBoolean912 = false;
	public static Class349 aClass349_913;

	Class94(Buffer class298_sub53, int i) {
		this.aClass365_Sub1_Sub1_Sub2_Sub1_910 = null;
		this.aClass365_Sub1_Sub1_Sub2_Sub2_911 = null;
		this.anInt906 = i * 1288449687;
		int i_0_ = class298_sub53.readUByte();
		switch (i_0_) {
		case 0:
			anInt909 = class298_sub53.readBigSmart() * -44295909;
			break;
		default:
			anInt909 = 44295909;
			break;
		case 1:
			anInt909 = 44295909;
		}
		class298_sub53.readString();
	}

	public Entity method1015() {
		try {
			if (null != this.aClass365_Sub1_Sub1_Sub2_Sub1_910)
				return this.aClass365_Sub1_Sub1_Sub2_Sub1_910;
			return this.aClass365_Sub1_Sub1_Sub2_Sub2_911;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("dv.p(").append(')').toString());
		}
	}

	void method1016(byte i) {
		try {
			this.aClass365_Sub1_Sub1_Sub2_Sub1_910 = null;
			this.aClass365_Sub1_Sub1_Sub2_Sub2_911 = null;
			aBoolean912 = false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("dv.f(").append(')').toString());
		}
	}

	void method1017(int i, int i_1_, int i_2_, int i_3_) {
		try {
			if (this.aClass365_Sub1_Sub1_Sub2_Sub1_910 != null)
				this.aClass365_Sub1_Sub1_Sub2_Sub1_910.method4456(i, i_1_, i_2_, true, this.aClass365_Sub1_Sub1_Sub2_Sub1_910.getSize());
			else {
				this.aClass365_Sub1_Sub1_Sub2_Sub2_911.plane = this.aClass365_Sub1_Sub1_Sub2_Sub2_911.aByte7724 = (byte) i;
				this.aClass365_Sub1_Sub1_Sub2_Sub2_911.method4472(i_1_, i_2_);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("dv.b(").append(')').toString());
		}
	}

	void method1018(int i, int i_4_, int i_5_, int i_6_, int i_7_) {
		try {
			if (!aBoolean912) {
				aBoolean912 = true;
				if (1762367763 * anInt909 >= 0) {
					this.aClass365_Sub1_Sub1_Sub2_Sub1_910 = (new NPC(GameClient.myRegion.getRegion(), 25));
					this.aClass365_Sub1_Sub1_Sub2_Sub1_910.entityIndex = this.anInt906 * 302956801;
					this.aClass365_Sub1_Sub1_Sub2_Sub1_910.anInt10075 = GameClient.clientTick * -128551287;
					this.aClass365_Sub1_Sub1_Sub2_Sub1_910.method4464(NPCDefinitionLoader.npcList.load(anInt909 * 1762367763), 2139515630);
					this.aClass365_Sub1_Sub1_Sub2_Sub1_910.method4421(-2095128707 * (this.aClass365_Sub1_Sub1_Sub2_Sub1_910.aClass503_10190.tileSpacesOccupied), -1254496694);
					this.aClass365_Sub1_Sub1_Sub2_Sub1_910.anInt10115 = -1186616623 * (((this.aClass365_Sub1_Sub1_Sub2_Sub1_910.aClass503_10190.anInt6181) * -1927065533) << 3);
					this.aClass365_Sub1_Sub1_Sub2_Sub1_910.anInt10071 = (((Class87.anInt803 += 2029434363) * -132903629 - 1) * -689024993);
				} else {
					this.aClass365_Sub1_Sub1_Sub2_Sub2_911 = (new Player(GameClient.myRegion.getRegion(), 25));
					this.aClass365_Sub1_Sub1_Sub2_Sub2_911.sendAppearence(Class128_Sub1.playerAppearence, (byte) 3);
					this.aClass365_Sub1_Sub1_Sub2_Sub2_911.entityIndex = 302956801 * this.anInt906;
					this.aClass365_Sub1_Sub1_Sub2_Sub2_911.anInt10075 = -128551287 * GameClient.clientTick;
					this.aClass365_Sub1_Sub1_Sub2_Sub2_911.anInt10071 = (((Class87.anInt803 += 2029434363) * -132903629 - 1) * -689024993);
				}
			}
			if (1762367763 * anInt909 >= 0) {
				this.aClass365_Sub1_Sub1_Sub2_Sub1_910.method4456(i_5_, i, i_4_, true, this.aClass365_Sub1_Sub1_Sub2_Sub1_910.getSize());
				this.aClass365_Sub1_Sub1_Sub2_Sub1_910.method4415(i_6_, true, 43552435);
			} else {
				this.aClass365_Sub1_Sub1_Sub2_Sub2_911.plane = this.aClass365_Sub1_Sub1_Sub2_Sub2_911.aByte7724 = (byte) i_5_;
				this.aClass365_Sub1_Sub1_Sub2_Sub2_911.method4472(i, i_4_);
				this.aClass365_Sub1_Sub1_Sub2_Sub2_911.method4415(i_6_, true, 1586583742);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("dv.a(").append(')').toString());
		}
	}

	boolean method1019() {
		try {
			if (anInt909 * 1762367763 >= 0) {
				NPCDefinition npcDef = NPCDefinitionLoader.npcList.load(1762367763 * anInt909);
				boolean bool = npcDef.method6238(-1621243143);
				if (this.anIntArray907 == null) {
					Class350 class350 = aClass349_913.method4202((npcDef.renderEmote * 525312939), (byte) 47);
					this.anIntArray907 = class350.method4210();
				}
				int[] is = this.anIntArray907;
				for (int index = 0; index < is.length; index++) {
					int i_9_ = is[index];
					bool &= Js5Configs.animsList.get(i_9_).ready();
				}
				return bool;
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("dv.i(").append(')').toString());
		}
	}

	public static Class115 method1020(int mapSize) {
		try {
			Class115[] class115s = Class22.method370();
			for (int i_11_ = 0; i_11_ < class115s.length; i_11_++) {
				Class115 class115 = class115s[i_11_];
				if (mapSize == -160182505 * class115.anInt1387)
					return class115;
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("dv.f(").append(')').toString());
		}
	}

	static final void method1021(ScriptRuntime runtime) {
		try {
			IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
			IComponentDefinition class105 = IComponentScripter.componentDefinition;
			IComponentDefinitionCollection IComponentDefinitionCollection = IComponentScripter.IComponentDefinitionCollection;
			ToMoveIComponentScripts.method1419(class105, IComponentDefinitionCollection, runtime);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("dv.gb(").append(')').toString());
		}
	}

	static final void method1022(ScriptRuntime class403, int i) {
		try {
			IComponentScripter IComponentScripter = (class403.currentInstrBool ? class403.aIComponentScripter_5247 : class403.aIComponentScripter_5246);
			IComponentDefinition class105 = IComponentScripter.componentDefinition;
			IComponentDefinitionCollection IComponentDefinitionCollection = IComponentScripter.IComponentDefinitionCollection;
			ToMoveIComponentScripts.method365(class105, IComponentDefinitionCollection, true, 0, class403);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("dv.hn(").append(')').toString());
		}
	}

	static final void method1023(ScriptRuntime class403, int i) {
		try {
			SettingsManager.settingsManager.setValue(SettingsManager.settingsManager.lighting, (class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]) == 1 ? 1 : 0);
			StaticMethods.method4294();
			GameClient.myRegion.getLightningDetails().method4324();
			ToMoveSettings.encodeBuffer();
			GameClient.sentPreferences = false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("dv.aif(").append(')').toString());
		}
	}

	static final void method1024(ScriptRuntime class403, int i) {
		try {
			ToMoveScripts.method1135(((Class365_Sub1) class403.anSceneObject_5233), class403);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("dv.apd(").append(')').toString());
		}
	}

	static final void method1025(ScriptRuntime runtime) {
		try {
			if (GameClient.localPrivilege * 1806357379 >= 2)
				runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = 1806357379 * GameClient.localPrivilege;
			else
				runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("dv.tb(").append(')').toString());
		}
	}

	static final void method1026(ScriptRuntime class403, int i) {
		try {
			int i_12_ = (class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]);
			if (-257444687 * GameClient.WINDOW_PANE_ID != -1) {
				if (i_12_ == 0) {
					class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919) - 1] = GameClient.WINDOW_PANE_ID * -257444687;
					return;
				}
				i_12_--;
			}
			Widget class298_sub51 = ((Widget) GameClient.linkedList.method5816());
			while (i_12_-- > 0)
				class298_sub51 = (Widget) GameClient.linkedList.method5815();
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = -1617025021 * class298_sub51.interfaceID;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("dv.alc(").append(')').toString());
		}
	}
}
