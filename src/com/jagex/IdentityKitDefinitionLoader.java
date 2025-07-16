package com.jagex;/* Class144 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.ConfigType;

public class IdentityKitDefinitionLoader {
    Js5FileSystem js5_CONFIGURATIONS;
    Js5FileSystem JS5_MODELS;
    SoftCache cache = new SoftCache(64);

    public IdentityKitDefinitionLoader(Js5FileSystem js5_CONFIGURATIONS, Js5FileSystem JS5_MODELS) {
        this.js5_CONFIGURATIONS = js5_CONFIGURATIONS;
        this.JS5_MODELS = JS5_MODELS;
        this.js5_CONFIGURATIONS.getFileSystem((-1006924897 * (ConfigType.IDENTIKITS.type)));
    }

    public IdentityKitDefinition get(int fileID) {
        try {
            IdentityKitDefinition identityKitDefinition;
            synchronized (this.cache) {
                identityKitDefinition = (IdentityKitDefinition) this.cache.get((long) fileID);
            }
            if (identityKitDefinition != null)
                return identityKitDefinition;
            byte[] data;
            synchronized (this.js5_CONFIGURATIONS) {
                data = (this.js5_CONFIGURATIONS.getFileFromArchive(ConfigType.IDENTIKITS.type * -1006924897, fileID));
            }
            identityKitDefinition = new IdentityKitDefinition();
            identityKitDefinition.loader = this;
            if (data != null)
                identityKitDefinition.readValueLoop(new Buffer(data), 1546025245);
            synchronized (this.cache) {
                this.cache.put(identityKitDefinition, (long) fileID);
            }
            return identityKitDefinition;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("fv.a(").append(')').toString());
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

    public void method1582(int i) {
        synchronized (this.cache) {
            this.cache.method4186(i);
        }
    }
}
