package com.jagex;/* Class517 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.ConfigType;

public class Class517 {
    public int capacity;
    SoftCache cache = new SoftCache(64);
    Js5FileSystem fileSystem;

    public Class517(Js5FileSystem fileSystem) {
        this.fileSystem = fileSystem;
        if (this.fileSystem != null)
            capacity = (this.fileSystem.getFileSystem(-1006924897 * ConfigType.aClass120_1452.type)) * 2084802537;
        else
            capacity = 0;
    }

    public void method6304(int i) {
        synchronized (this.cache) {
            this.cache.method4186(i);
        }
    }

    public void clear() {
        synchronized (this.cache) {
            this.cache.clear();
        }
    }

    public void sweep() {
        synchronized (this.cache) {
            this.cache.sweep();
        }
    }

    public Class520 method6307(int fileID) {
        Class520 class520;
        synchronized (this.cache) {
            class520 = (Class520) this.cache.get((long) fileID);
        }
        if (class520 != null)
            return class520;
        byte[] data;
        synchronized (this.fileSystem) {
            data = (this.fileSystem.getFileFromArchive(ConfigType.aClass120_1452.type * -1006924897, fileID));
        }
        class520 = new Class520();
        if (data != null)
            class520.method6321(new Buffer(data));
        synchronized (this.cache) {
            this.cache.put(class520, (long) fileID);
        }
        return class520;
    }
}
