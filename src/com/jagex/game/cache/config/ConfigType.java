package com.jagex.game.cache.config;/* Class120 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.Class487;

public class ConfigType {
    public static ConfigType unkown;
    public static ConfigType ANIMATION;
    public static ConfigType NPC;
    public static ConfigType aClass120_1411;
    public static ConfigType ENUMERATIONS;
    public static ConfigType aClass120_1414;
    public static ConfigType PARAMETERS;
    public static ConfigType SUNS;
    public static ConfigType MAP_SCENES;
    public static ConfigType aClass120_1420;
    public static ConfigType DOMAIN_TYPE;
    public static ConfigType aClass120_1424;
    public static ConfigType IDENTIKITS;
    public static ConfigType INVENTORIES;
    public static ConfigType UNDERLAYS;
    public static ConfigType ITEMS;
    public static ConfigType aClass120_1430;
    public static ConfigType MAPS;
    public static ConfigType SKYBOX;
    public static ConfigType aClass120_1436;
    public static ConfigType REMOTE_ANIMATIONS;
    public static ConfigType CURSORS;
    public static ConfigType OVERLAYS;
    public static ConfigType QUESTS;
    public static ConfigType WORLD_MAP_INFO;
    public static ConfigType OBJECTS;
    public static ConfigType GRAPHICS;
    public static ConfigType HITSPLATS;
    public static ConfigType aClass120_1452;
    public static String aString1462;
    public static Class487 aClass487_1463;
    static ConfigType aClass120_1407;
    static ConfigType aClass120_1408;
    static ConfigType aClass120_1412;
    static ConfigType aClass120_1415;
    static ConfigType aClass120_1418;
    static ConfigType aClass120_1422;
    static ConfigType aClass120_1423;
    static ConfigType aClass120_1426;
    static ConfigType aClass120_1432;
    static ConfigType aClass120_1433;
    static ConfigType aClass120_1435;
    static ConfigType aClass120_1442;
    static ConfigType aClass120_1444;
    static ConfigType aClass120_1445;
    static ConfigType aClass120_1446;
    static ConfigType aClass120_1447;
    static ConfigType UNKOWN2;
    static ConfigType aClass120_1450;
    static ConfigType aClass120_1453;
    static ConfigType aClass120_1454;
    static ConfigType aClass120_1455;
    static ConfigType aClass120_1456;
    static ConfigType aClass120_1457;
    static ConfigType aClass120_1458;
    static ConfigType configsPlayer;

    static {
        UNDERLAYS = new ConfigType(1);
        aClass120_1415 = new ConfigType(2);
        IDENTIKITS = new ConfigType(3);
        OVERLAYS = new ConfigType(4);
        INVENTORIES = new ConfigType(5);
        OBJECTS = new ConfigType(6, 8);
        UNKOWN2 = new ConfigType(7);
        ENUMERATIONS = new ConfigType(8, 8);
        NPC = new ConfigType(9, 7);
        ITEMS = new ConfigType(10, 8);
        PARAMETERS = new ConfigType(11);
        ANIMATION = new ConfigType(12, 7);
        GRAPHICS = new ConfigType(13, 8);
        unkown = new ConfigType(14, 10);
        aClass120_1420 = new ConfigType(15);
        DOMAIN_TYPE = new ConfigType(16);
        aClass120_1408 = new ConfigType(17);
        aClass120_1423 = new ConfigType(18);
        aClass120_1424 = new ConfigType(19);
        aClass120_1435 = new ConfigType(20);
        aClass120_1426 = new ConfigType(21);
        aClass120_1407 = new ConfigType(22);
        aClass120_1458 = new ConfigType(23);
        aClass120_1411 = new ConfigType(24);
        aClass120_1430 = new ConfigType(25);
        MAPS = new ConfigType(26);
        aClass120_1432 = new ConfigType(27);
        aClass120_1433 = new ConfigType(28);
        SKYBOX = new ConfigType(29);
        SUNS = new ConfigType(30);
        aClass120_1436 = new ConfigType(31);
        REMOTE_ANIMATIONS = new ConfigType(32);
        CURSORS = new ConfigType(33);
        MAP_SCENES = new ConfigType(34);
        QUESTS = new ConfigType(35);
        WORLD_MAP_INFO = new ConfigType(36);
        aClass120_1442 = new ConfigType(37);
        aClass120_1412 = new ConfigType(38);
        aClass120_1444 = new ConfigType(39);
        aClass120_1445 = new ConfigType(40);
        aClass120_1446 = new ConfigType(41);
        aClass120_1447 = new ConfigType(42);
        aClass120_1418 = new ConfigType(43);
        aClass120_1422 = new ConfigType(44);
        aClass120_1450 = new ConfigType(45);
        HITSPLATS = new ConfigType(46);
        aClass120_1452 = new ConfigType(47);
        aClass120_1453 = new ConfigType(48);
        aClass120_1454 = new ConfigType(49);
        aClass120_1455 = new ConfigType(50);
        aClass120_1456 = new ConfigType(51);
        aClass120_1457 = new ConfigType(53);
        aClass120_1414 = new ConfigType(54);
        configsPlayer = new ConfigType(70);
    }

    public int type;
    int fileID;

    ConfigType(int type, int fileID) {
        this.type = type * -1878339489;
        this.fileID = fileID * -1094244023;
    }

    ConfigType(int type) {
        this(type, 0);
    }

    public int getFile(int hash) {
        return hash & (1 << this.fileID * -82175751) - 1;
    }

    public int filesPerContainer() {
            return 1 << -82175751 * this.fileID;
    }

    public int getType(int hash) {
        return hash >>> -82175751 * this.fileID;
    }
}
