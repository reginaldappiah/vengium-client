package com.jagex;/* Class314 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.ConfigType;

public class ConfigDefinitionLoader {

    Js5FileSystem JS5_CONFIGURATIONS;
    SoftCache cache = new SoftCache(64);

    public ConfigDefinitionLoader(Js5FileSystem class243) {
        JS5_CONFIGURATIONS = class243;
        if (JS5_CONFIGURATIONS != null) {
            int i = JS5_CONFIGURATIONS.getContainerLength() - 1;
            ConfigType.unkown.filesPerContainer();
            JS5_CONFIGURATIONS.getFileSystem(i);
        }
    }

    public void clear() {
        synchronized (cache) {
            cache.clear();
        }
    }

    public void sweep() {
        synchronized (cache) {
            cache.sweep();
        }
    }

    public void clear(int i) {
        synchronized (cache) {
            cache.clear();
            cache = new SoftCache(i);
        }
    }

    public void method3826(int i) {
        synchronized (cache) {
            cache.method4186(i);
        }
    }

    public ConfigDefinitions getConfigDefinitions(int fileID) {
        ConfigDefinitions definition;
        synchronized (cache) {
            definition = (ConfigDefinitions) cache.get(fileID);
        }
        if (definition != null) {
            return definition;
        }
        byte[] data;
        synchronized (JS5_CONFIGURATIONS) {
            data = (JS5_CONFIGURATIONS.getFileFromArchive(ConfigType.unkown.getType(fileID), ConfigType.unkown.getFile(fileID)));
        }
        definition = new ConfigDefinitions();
        if (data != null) {
            definition.parseBuffer(new Buffer(data));
        }
        synchronized (cache) {
            cache.put(definition, fileID);
        }
        return definition;
    }

}
