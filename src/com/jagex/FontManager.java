package com.jagex;/* Fonts - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.util.HashMap;
import java.util.Map;

public class FontManager {
    static int anInt1992;
    Js5FileSystem JS5_SPRITES;
    Js5FileSystem JS5_FONTMETRICS;
    SoftCache cache = new SoftCache(20);
    Map map = null;
    int[] spritesCache;

    public FontManager(Js5FileSystem JS5_SPRITES, Js5FileSystem JS5_FONTMETRICS, int[] is) {
        this.JS5_SPRITES = JS5_SPRITES;
        this.JS5_FONTMETRICS = JS5_FONTMETRICS;
        if (null != is)
            this.spritesCache = is;
        else
            this.spritesCache = null;
    }

    static void method1888(int i, boolean bool) {
        Class298_Sub9 class298_sub9 = StaticMethods.method2437(i, bool);
        if (class298_sub9 != null)
            class298_sub9.unlink();
    }

    public int method1875(boolean bool) {
        if (this.spritesCache == null)
            return 0;
        if (!bool && null != this.map)
            return this.spritesCache.length * 2;
        int i_0_ = 0;
        for (int i_1_ = 0; i_1_ < this.spritesCache.length; i_1_++) {
            int i_2_ = this.spritesCache[i_1_];
            if (this.JS5_SPRITES.exists(i_2_))
                i_0_++;
            if (this.JS5_FONTMETRICS.exists(i_2_))
                i_0_++;
        }
        return i_0_;
    }

    public void reset() {
        this.map = null;
    }

    public int method1877() {
        return method1875(false);
    }

    public int method1878() {
        if (this.spritesCache == null)
            return 0;
        return this.spritesCache.length * 2;
    }

    public RSFontMetrics method1879(FontRenderProvider fontRenderProvider, int i) {
        FontMetricsDefinitionLoader fontMetricsDefinitionLoader = fetch(fontRenderProvider, i, true, true);
        if (null == fontMetricsDefinitionLoader)
            return null;
        return (RSFontMetrics) fontMetricsDefinitionLoader.anObject5646;
    }

    public void clear() {
        this.cache.clear();
    }

    public void method1881(int i) {
        this.cache.method4186(i);
    }

    public void load(FontRenderProvider fontRenderProvider) {
        this.map = new HashMap(this.spritesCache.length);
        for (int index = 0; index < this.spritesCache.length; index++) {
            int containerID = this.spritesCache[index];
            RSFontMetrics fontMetrics = RSFontMetrics.decodeFontData(this.JS5_FONTMETRICS, containerID);
            byte[] spritetData = this.JS5_SPRITES.get(containerID);
            Object object = fontRenderProvider.provideFont(spritetData, true, fontMetrics);
            this.map.put(Integer.valueOf(index), new FontMetricsDefinitionLoader(object, fontMetrics));
        }
    }

    public Object loadOther(FontRenderProvider fontRenderProvider, int fontID, boolean bool, boolean fontMonochrome) {
        FontMetricsDefinitionLoader loader = fetch(fontRenderProvider, fontID, bool, fontMonochrome);
        if (loader == null)
            return null;
        return loader.toolkit;
    }

    public void sweep() {
        this.cache.sweep();
    }

    FontMetricsDefinitionLoader fetch(FontRenderProvider fontRenderProvider, int fontID, boolean bool, boolean fontMonochrome) {
        if (-1 == fontID)
            return null;
        if (this.spritesCache != null) {
            for (int index = 0; index < this.spritesCache.length; index++) {
                if (fontID == this.spritesCache[index])
                    return (FontMetricsDefinitionLoader) this.map.get(Integer.valueOf(index));
            }
        }
        FontMetricsDefinitionLoader loader = ((FontMetricsDefinitionLoader) this.cache.get((long) (fontID << 1 | (fontMonochrome ? 1 : 0))));
        if (null != loader) {
            if (bool && loader.anObject5646 == null) {
                RSFontMetrics fontMetrics = RSFontMetrics.decodeFontData(this.JS5_FONTMETRICS, fontID);
                if (null == fontMetrics)
                    return null;
                loader.anObject5646 = fontMetrics;
            }
            return loader;
        }
        byte[] spriteData = this.JS5_SPRITES.get(fontID);
        if (null == spriteData)
            return null;
        RSFontMetrics fontMetrics = RSFontMetrics.decodeFontData(this.JS5_FONTMETRICS, fontID);
        if (fontMetrics == null)
            return null;
        if (bool)
            loader = new FontMetricsDefinitionLoader(fontRenderProvider.provideFont(spriteData, fontMonochrome, fontMetrics), fontMetrics);
        else
            loader = new FontMetricsDefinitionLoader(fontRenderProvider.provideFont(spriteData, fontMonochrome, fontMetrics), null);
        this.cache.put(loader, (long) (fontID << 1 | (fontMonochrome ? 1 : 0)));
        return loader;
    }
}
