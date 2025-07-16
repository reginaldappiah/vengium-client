package com.jagex;/* Class479 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class479 {
    public static Class479 JS5_INTERFACES;
    public static Class479 DLL_JACLIB;
    public static Class479 DLL_JAGGL;
    public static Class479 DLL_SW3D;
    public static Class479 JS5_CONFIGS;
    public static Class479 DLL_HW3D;
    public static Class479 DLL_THEORA;
    public static Class479 JS5_SHADERS2;
    public static Class479 DLL_JAGDX;
    public static Class479 JS5_CONFIG_OBJECTS;
    public static Class479 JS5_CONFIG_ENUM;
    public static Class479 JS5_CONFIG_SEQ;
    public static Class479 JS5_CONFIG_ITEMS;
    public static Class479 JS5_CONFIG_NPC;
    public static Class479 JS5_CONFIG_SPOT;
    public static Class479 JS5_CONFIG_SCRIPT;
    public static Class479 JS5_QUICKCHAT;
    public static Class479 JS5_QUICKCHAT_GLOBAL;
    public static Class479 JS5_BINARY;
    public static Class479 JS5_DEFAULTS;
    public static Class479 JS5_CONFIG_PARTICLE2;
    public static Class479 JS5_CONFIG_PARTICLE;
    public static Class479 JS5_CLIENTSCRIPTS;
    public static Class479 JS5_FONTMETRICS;
    public static Class479 JS5_WORLDMAPDATA;
    public static Class479 JS5_TEXTURES;
    public static Class479 JS5_SHADERS;

    static {
        JS5_DEFAULTS = new Class479(FileType.ARCHIVE);
        DLL_JACLIB = new Class479(FileType.NATIVE);
        DLL_JAGGL = new Class479(FileType.NATIVE);
        DLL_JAGDX = new Class479(FileType.NATIVE);
        DLL_SW3D = new Class479(FileType.NATIVE);
        DLL_HW3D = new Class479(FileType.NATIVE);
        DLL_THEORA = new Class479(FileType.NATIVE);
        JS5_SHADERS = new Class479(FileType.ARCHIVE);
        JS5_SHADERS2 = new Class479(FileType.ARCHIVE);
        JS5_CONFIGS = new Class479(FileType.ARCHIVE);
        JS5_CONFIG_OBJECTS = new Class479(FileType.ARCHIVE);
        JS5_CONFIG_ENUM = new Class479(FileType.ARCHIVE);
        JS5_CONFIG_NPC = new Class479(FileType.ARCHIVE);
        JS5_CONFIG_ITEMS = new Class479(FileType.ARCHIVE);
        JS5_CONFIG_SEQ = new Class479(FileType.ARCHIVE);
        JS5_CONFIG_SPOT = new Class479(FileType.ARCHIVE);
        JS5_CONFIG_SCRIPT = new Class479(FileType.ARCHIVE);
        JS5_QUICKCHAT = new Class479(FileType.ARCHIVE);
        JS5_QUICKCHAT_GLOBAL = new Class479(FileType.ARCHIVE);
        JS5_TEXTURES = new Class479(FileType.ARCHIVE);
        JS5_CONFIG_PARTICLE = new Class479(FileType.ARCHIVE);
        JS5_CONFIG_PARTICLE2 = new Class479(FileType.ARCHIVE);
        JS5_BINARY = new Class479(FileType.GROUP);
        JS5_INTERFACES = new Class479(FileType.ARCHIVE);
        JS5_CLIENTSCRIPTS = new Class479(FileType.ARCHIVE);
        JS5_FONTMETRICS = new Class479(FileType.ARCHIVE);
        JS5_WORLDMAPDATA = new Class479(FileType.FILE);
    }

    FileType fileType;
    FileLoader fileLoader;
    int anInt6031;

    Class479(FileType fileType) {
        this.fileType = fileType;
        this.anInt6031 = -427537929;
    }

    public static Class479[] getFile() {
        return (new Class479[]{JS5_DEFAULTS, DLL_JACLIB, DLL_JAGGL, DLL_JAGDX, DLL_SW3D, DLL_HW3D, DLL_THEORA, JS5_SHADERS, JS5_SHADERS2, JS5_CONFIGS, JS5_CONFIG_OBJECTS, JS5_CONFIG_ENUM, JS5_CONFIG_NPC, JS5_CONFIG_ITEMS, JS5_CONFIG_SEQ, JS5_CONFIG_SPOT, JS5_CONFIG_SCRIPT, JS5_QUICKCHAT, JS5_QUICKCHAT_GLOBAL, JS5_TEXTURES, JS5_CONFIG_PARTICLE, JS5_CONFIG_PARTICLE2, JS5_BINARY, JS5_INTERFACES, JS5_CLIENTSCRIPTS, JS5_FONTMETRICS, JS5_WORLDMAPDATA});
    }

    public int method6100() {
        return this.anInt6031 * 617695175;
    }

    public FileLoader getFileLoader() {
        return this.fileLoader;
    }

    public void setLoadingFile(FileLoader file) {
        if (file.getFileType() != this.fileType) {
            throw new IllegalArgumentException();
        }
        this.fileLoader = file;
    }

    public void method6103(int i) {
        this.anInt6031 = i * -427537929;
    }

}
