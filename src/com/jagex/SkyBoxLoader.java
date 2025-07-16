package com.jagex;/* Class317 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.ConfigType;

public class SkyBoxLoader {
    Js5FileSystem filesCount;
    SoftCache cache = new SoftCache(16);

    public SkyBoxLoader(Js5FileSystem fileSystem) {
        this.filesCount = fileSystem;
        this.filesCount.getFileSystem((-1006924897 * (ConfigType.SKYBOX.type)));
    }

    Skybox method3845(int skyboxID, int a, int b, int c, Class131 config) {
        Class276[] class276s = null;
        Class325 skyBoxCache = getSkyBoxCache(skyboxID);
        if (skyBoxCache.anIntArray3451 != null) {
            class276s = (new Class276[skyBoxCache.anIntArray3451.length]);
            for (int i_4_ = 0; i_4_ < class276s.length; i_4_++) {
                Class125 class125 = config.method1467((skyBoxCache.anIntArray3451[i_4_]), -1248511043);
                class276s[i_4_] = new Class276(-865421291 * class125.anInt1491, class125.anInt1488 * -2045013891, class125.anInt1483 * -415148019, class125.anInt1489 * 1899082811, 257759203 * class125.anInt1481, class125.anInt1490 * 1872498707, 1242301535 * class125.anInt1487, class125.aBoolean1486, -535750953 * class125.anInt1485, 1283923105 * class125.anInt1484, -1054886537 * class125.anInt1482);
            }
        }
        return new Skybox(-1474936555 * skyBoxCache.anInt3450, class276s, -1877970137 * skyBoxCache.anInt3449, a, b, c, skyBoxCache.aClass320_3452, skyBoxCache.anInt3453 * -630450499);
    }

    public void clear() {
        synchronized (this.cache) {
            this.cache.clear();
        }
    }

    public void method3847(int i) {
        synchronized (this.cache) {
            this.cache.method4186(i);
        }
    }

    public void sweep() {
        synchronized (this.cache) {
            this.cache.sweep();
        }
    }

    Class325 getSkyBoxCache(int skyboxId) {
        Class325 skyboxCache;
        synchronized (this.cache) {
            skyboxCache = (Class325) this.cache.get((long) skyboxId);
        }
        if (skyboxCache != null)
            return skyboxCache;
        byte[] data;
        synchronized (this.filesCount) {
            data = (this.filesCount.getFileFromArchive(ConfigType.SKYBOX.type * -1006924897, skyboxId));
        }
        skyboxCache = new Class325();
        if (null != data)
            skyboxCache.method3962(new Buffer(data));
        synchronized (this.cache) {
            this.cache.put(skyboxCache, (long) skyboxId);
        }
        return skyboxCache;
    }

}
