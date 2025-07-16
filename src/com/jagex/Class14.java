package com.jagex;/* Class14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.prefetch.Js5List;

public class Class14 {
	static int anInt168;
	static Sprite[] aClass89Array169;
	static int anInt170;
	static Class139 aClass139_171;
	static int anInt172;
	static int anInt173;
	static int anInt174;
	static int anInt175;
	static RSFontMetrics aClass505_176;
	static Class133 aClass133_177;

	Class14() throws Throwable {
		throw new Error();
	}

	public static void method341(int interfaceID, int[] keys) {
			if (interfaceID != -1 && Class378.componentExists(interfaceID, keys)) {
				IComponentDefinition[] original = IComponentDefinition.getIComponentDefinitionCollections[interfaceID].componentDefinitions;
				Graphics.checkOnLoodHook(original);
			}
	}

	static boolean isFullyLoaded() {
            boolean loaded = true;
            if (null == StaticMethods.aClass89_6932) {
                if (Js5List.JS5_SPRITES.exists((Class410.anInt5290 * 2131310071)))
                    StaticMethods.aClass89_6932 = Sprite.loadFirst(Js5List.JS5_SPRITES, Class410.anInt5290 * 2131310071);
                else
                    loaded = false;
            }
            if (StaticMethods.aClass89_8437 == null) {
                if (Js5List.JS5_SPRITES.exists(1636425877 * anInt174))
                    StaticMethods.aClass89_8437 = Sprite.loadFirst(Js5List.JS5_SPRITES, 1636425877 * anInt174);
                else
                    loaded = false;
            }
            if (null == StaticMethods.aClass89_4142) {
                if (Js5List.JS5_SPRITES.exists((1475733439 * StaticMethods.anInt3323)))
                    StaticMethods.aClass89_4142 = Sprite.loadFirst(Js5List.JS5_SPRITES, StaticMethods.anInt3323 * 1475733439);
                else
                    loaded = false;
            }
            if (aClass505_176 == null) {
                if (Js5List.JS5_FONTMETRICS.exists(anInt168 * -227610265))
                    aClass505_176 = RSFontMetrics.decodeFontData(Js5List.JS5_FONTMETRICS, anInt168 * -227610265);
                else
                    loaded = false;
            }
            if (aClass89Array169 == null) {
                if (Js5List.JS5_SPRITES.exists(-227610265 * anInt168))
                    aClass89Array169 = Sprite.load(Js5List.JS5_SPRITES, -227610265 * anInt168);
                else
                    loaded = false;
            }
            return loaded;
    }

	public static void method2200(Class139 class139, Class133 class133, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_) {
			aClass139_171 = class139;
			aClass133_177 = class133;
			anInt170 = i * 295365919;
			anInt173 = -1224770727 * i_0_;
			anInt172 = i_1_ * -1586864867;
			anInt175 = 1104541761 * i_2_;
			Class410.anInt5290 = 1351228359 * i_3_;
			anInt174 = 838462141 * i_4_;
			StaticMethods.anInt3323 = i_5_ * 339871807;
			StaticMethods.aClass89_6932 = null;
			StaticMethods.aClass89_8437 = null;
			StaticMethods.aClass89_4142 = null;
			Class428.anInt6623 = i_6_ * 1589600979;
			anInt168 = i_7_ * -674457001;
			isFullyLoaded();
			Class372_Sub3.aBoolean7730 = true;
	}
}
