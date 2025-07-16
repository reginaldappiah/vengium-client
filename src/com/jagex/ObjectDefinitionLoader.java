package com.jagex;/* Class433 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.ConfigType;

public class ObjectDefinitionLoader {
    public static ObjectDefinitionLoader objectDefinitionLoader;
    public static int anInt5448 = 256;
    BaseModel[] aClass64Array5443;
    GameLanguage language;
    boolean member;
    Js5FileSystem objectCache;
    Js5FileSystem modelsCache;
    SoftCache cache = new SoftCache(256);
    SoftCache aClass348_5450 = new SoftCache(500);
    SoftCache aClass348_5451;
    SoftCache aClass348_5452 = new SoftCache(30);
    int anInt5453;
    String[] defaultOptions;
    GameContext game;
    FontMetricsDefinitionLoader aFontMetricsDefinitionLoader_5456;

    public ObjectDefinitionLoader(GameContext game, GameLanguage language, boolean bool, Js5FileSystem class243, Js5FileSystem class243_3_) {
        this.aClass348_5451 = new SoftCache(50);
        this.aClass64Array5443 = new BaseModel[4];
        this.aFontMetricsDefinitionLoader_5456 = new FontMetricsDefinitionLoader(null, null);
        this.game = game;
        this.language = language;
        this.member = bool;
        this.objectCache = class243;
        this.modelsCache = class243_3_;
        if (null != this.objectCache) {
            int i = this.objectCache.getContainerLength() - 1;
            ConfigType.OBJECTS.filesPerContainer();
            this.objectCache.getFileSystem(i);
        }
        if (this.game == GameContext.VENGIUM)
            this.defaultOptions = (new String[]{null, null, null, null, null, Tradution.EXAMINE.translate((this.language))});
        else
            this.defaultOptions = new String[]{null, null, null, null, null, null};
    }

    public void method5790(boolean bool, int i) {
        if (this.member != bool) {
            this.member = bool;
            clear();
        }
    }

    public void method5791(int i) {
        this.anInt5453 = -570701637 * i;
        synchronized (this.aClass348_5450) {
            this.aClass348_5450.clear();
        }
        synchronized (this.aClass348_5452) {
            this.aClass348_5452.clear();
        }
        synchronized (this.aClass348_5451) {
            this.aClass348_5451.clear();
        }
    }

    public void setCacheCapacity(int capacity) {
        this.cache = new SoftCache(capacity);
    }

    public void clear() {
        try {
            synchronized (this.cache) {
                this.cache.clear();
            }
            synchronized (this.aClass348_5450) {
                this.aClass348_5450.clear();
            }
            synchronized (this.aClass348_5452) {
                this.aClass348_5452.clear();
            }
            synchronized (this.aClass348_5451) {
                this.aClass348_5451.clear();
            }
            this.aClass64Array5443 = new BaseModel[4];
            this.aFontMetricsDefinitionLoader_5456 = new FontMetricsDefinitionLoader(null, null);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("rx.i(").append(')').toString());
        }
    }

    public void method5794(int i, byte i_2_) {
        try {
            synchronized (this.cache) {
                this.cache.method4186(i);
            }
            synchronized (this.aClass348_5450) {
                this.aClass348_5450.method4186(i);
            }
            synchronized (this.aClass348_5452) {
                this.aClass348_5452.method4186(i);
            }
            synchronized (this.aClass348_5451) {
                this.aClass348_5451.method4186(i);
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("rx.k(").append(')').toString());
        }
    }

    public void sweep() {
        try {
            synchronized (this.cache) {
                this.cache.sweep();
            }
            synchronized (this.aClass348_5450) {
                this.aClass348_5450.sweep();
            }
            synchronized (this.aClass348_5452) {
                this.aClass348_5452.sweep();
            }
            synchronized (this.aClass348_5451) {
                this.aClass348_5451.sweep();
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("rx.d(").append(')').toString());
        }
    }

    public ObjectDefinition get(int objectID) {
        ObjectDefinition definition;
        synchronized (this.cache) {
            definition = (ObjectDefinition) this.cache.get((long) objectID);
        }
        if (definition != null)
            return definition;
        byte[] data;
        synchronized (this.objectCache) {
            data = (this.objectCache.getFileFromArchive(ConfigType.OBJECTS.getType(objectID), ConfigType.OBJECTS.getFile(objectID)));
        }
        definition = new ObjectDefinition();
        definition.objectID = objectID * -950871973;
        definition.loader = this;
        definition.options = this.defaultOptions.clone();
        if (null != data)
            definition.method5783(new Buffer(data), -1780393822);
        definition.method5778();
        if (definition.objectBlocksWalkAlternative) {
            definition.clipType = 0;
            definition.objectBlocksFly = false;
        }
        if (!this.member && definition.aBoolean5434) {
            definition.options = null;
            definition.anIntArray5370 = null;
        }
        synchronized (this.cache) {
            this.cache.put(definition, (long) objectID);
        }
        return definition;
    }

}
