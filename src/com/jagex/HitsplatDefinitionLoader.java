package com.jagex;/* Class347 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.ConfigType;

public class HitsplatDefinitionLoader {
    public static HitsplatDefinitionLoader aClass347_6117;
    Js5FileSystem JS5_CONFIG;
    Js5FileSystem JS5_SPRITES;
    SoftCache cache = new SoftCache(20);
    SoftCache aClass348_3701 = new SoftCache(64);

    public HitsplatDefinitionLoader(Js5FileSystem JS5_CONFIG, Js5FileSystem JS5_SPRITES) {
        this.JS5_SPRITES = JS5_SPRITES;
        this.JS5_CONFIG = JS5_CONFIG;
        this.JS5_CONFIG.getFileSystem((ConfigType.HITSPLATS.type) * -1006924897);
    }

    public HitsplatDefinition method4176(int fileID) {
        HitsplatDefinition hitsplatDefinition;
        synchronized (this.aClass348_3701) {
            hitsplatDefinition = (HitsplatDefinition) this.aClass348_3701.get((long) fileID);
        }
        if (null != hitsplatDefinition)
            return hitsplatDefinition;
        byte[] data;
        synchronized (this.JS5_CONFIG) {
            data = (this.JS5_CONFIG.getFileFromArchive(-1006924897 * ConfigType.HITSPLATS.type, fileID));
        }
        hitsplatDefinition = new HitsplatDefinition();
        hitsplatDefinition.hitsplatDefinitionLoader = this;
        if (null != data)
            hitsplatDefinition.readValueLoop(new Buffer(data));
        synchronized (this.aClass348_3701) {
            this.aClass348_3701.put(hitsplatDefinition, (long) fileID);
        }
        return hitsplatDefinition;
    }

    public void clear() {
        synchronized (this.aClass348_3701) {
            this.aClass348_3701.clear();
        }
        synchronized (this.cache) {
            this.cache.clear();
        }
    }

    public void method4178(int key) {
        synchronized (this.aClass348_3701) {
            this.aClass348_3701.method4186(key);
        }
        synchronized (this.cache) {
            this.cache.method4186(key);
        }
    }

    public void sweep() {
        synchronized (this.aClass348_3701) {
            this.aClass348_3701.sweep();
        }
        synchronized (this.cache) {
            this.cache.sweep();
        }
    }
}
