package com.jagex.game.cache.config.underlay;/* Class451 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.Buffer;
import com.jagex.Js5FileSystem;
import com.jagex.SoftCache;
import com.jagex.game.cache.config.ConfigType;

public class UnderlayTypeLoader {
    Js5FileSystem fileSystem;
    SoftCache cache = new SoftCache(128);

    public UnderlayTypeLoader(Js5FileSystem class243) {
        this.fileSystem = class243;
        this.fileSystem.getFileSystem((-1006924897 * (ConfigType.UNDERLAYS.type)));
    }

    public void clear() {
        synchronized (this.cache) {
            this.cache.clear();
        }
    }

    public void method5930(int i) {
        synchronized (this.cache) {
            this.cache.method4186(i);
        }
    }

    public void sweep() {
        synchronized (this.cache) {
            this.cache.sweep();
        }
    }

    public UnderlayType load(int fileID) {
            UnderlayType underlayType;
            synchronized (this.cache) {
                underlayType = (UnderlayType) this.cache.get((long) fileID);
            }
            if (underlayType != null)
                return underlayType;
            byte[] data;
            synchronized (this.fileSystem) {
                data = this.fileSystem.getFileFromArchive(-1006924897 * ConfigType.UNDERLAYS.type, fileID);
            }
            underlayType = new UnderlayType();
            if (data != null)
                underlayType.readValueLoop(new Buffer(data));
            synchronized (this.cache) {
                this.cache.put(underlayType, (long) fileID);
            }
            return underlayType;
    }
}
