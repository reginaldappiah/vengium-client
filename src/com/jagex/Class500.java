package com.jagex;/* Class500 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.ConfigType;

public class Class500 {
    Js5FileSystem JS5_CONFIGS;
    int anInt6115;
    Class298_Sub37_Sub7[] aClass298_Sub37_Sub7Array6116;

    public Class500(Js5FileSystem fileSystem, boolean bool) {
        JS5_CONFIGS = fileSystem;
        anInt6115 = (JS5_CONFIGS.getFileSystem((-1006924897 * (ConfigType.MAPS.type))) * 1005943745);
        if (bool) {
            aClass298_Sub37_Sub7Array6116 = (new Class298_Sub37_Sub7[anInt6115 * 589337665]);
            for (int fileID = 0; fileID < anInt6115 * 589337665; fileID++) {
                byte[] data;
                synchronized (JS5_CONFIGS) {
                    data = (JS5_CONFIGS.getFileFromArchive(-1006924897 * ConfigType.MAPS.type, fileID));
                }
                Class298_Sub37_Sub7 class298_sub37_sub7 = new Class298_Sub37_Sub7();
                if (null != data) {
                    class298_sub37_sub7.readValueLoop(new Buffer(data));
                }
                aClass298_Sub37_Sub7Array6116[fileID] = class298_sub37_sub7;
            }
        }
    }

    public Class298_Sub37_Sub7 method6219(int i, int i_0_) {
        try {
            if (i < 0) {
                return new Class298_Sub37_Sub7();
            }
            return aClass298_Sub37_Sub7Array6116[i];
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ur.a(").append(')').toString());
        }
    }
}
