package com.jagex;/* Class375 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.ConfigType;

public class OverlayDefinitionLoader {
    public int anInt4080 = 0;
    public int filesCount;
    SoftCache cache = new SoftCache(64);
    Js5FileSystem js5_OVERLAY;

    public OverlayDefinitionLoader(Js5FileSystem js5FileSystem) {
        this.js5_OVERLAY = js5FileSystem;
        filesCount = (this.js5_OVERLAY.getFileSystem((-1006924897 * (ConfigType.OVERLAYS.type))) * 1970250293);
    }

    public OverlayDefinition getOverlayDefinition(int fileID) {
        OverlayDefinition overlay;
        synchronized (this.cache) {
            overlay = (OverlayDefinition) this.cache.get((long) fileID);
        }
        if (null != overlay)
            return overlay;
        byte[] data;
        synchronized (this.js5_OVERLAY) {
            data = (this.js5_OVERLAY.getFileFromArchive(ConfigType.OVERLAYS.type * -1006924897, fileID));
        }
        overlay = new OverlayDefinition();
        overlay.aClass375_4065 = this;
        overlay.anInt4053 = 1723715693 * fileID;
        if (data != null)
            overlay.method4605(new Buffer(data), 690302848);
        overlay.method4603((byte) 75);
        synchronized (this.cache) {
            this.cache.put(overlay, (long) fileID);
        }
        return overlay;
    }

    public void sweep() {
        synchronized (this.cache) {
            this.cache.sweep();
        }
    }

    public void method4647(int i) {
        synchronized (this.cache) {
            this.cache.method4186(i);
        }
    }

    public void clear() {
        synchronized (this.cache) {
            this.cache.clear();
        }
    }

}
