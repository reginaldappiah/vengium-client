package com.jagex;/* Class445 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.ConfigType;

public class Class445 {
    Js5FileSystem fileSystem;
    SoftCache cache = new SoftCache(64);

    public Class445(Js5FileSystem fileSystem) {
        this.fileSystem = fileSystem;
        if (null != this.fileSystem)
            this.fileSystem.getFileSystem(ConfigType.aClass120_1411.type * -1006924897);
    }

    public void sweep() {
        synchronized (this.cache) {
            this.cache.sweep();
        }
    }

    public Class485 get(int fileID) {
        Class485 class485;
        synchronized (this.cache) {
            class485 = (Class485) this.cache.get((long) fileID);
        }
        if (null != class485)
            return class485;
        byte[] data = this.fileSystem.getFileFromArchive(((ConfigType.aClass120_1411.type) * -1006924897), fileID);
        class485 = new Class485();
        if (null != data)
            class485.readValueLoop(new Buffer(data));
        synchronized (this.cache) {
            this.cache.put(class485, (long) fileID);
        }
        return class485;
    }

    public void clear() {
        synchronized (this.cache) {
            this.cache.clear();
        }
    }

    public void method5894(int i) {
        synchronized (this.cache) {
            this.cache.method4186(i);
        }
    }
}
