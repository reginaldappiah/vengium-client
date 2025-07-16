package com.jagex;/* Class298_Sub37 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Cacheable extends Node {
    public Cacheable prev_cache;
    public Cacheable next_cache;
    public long cachedKey;

    public void unlinkCache() {
        if (prev_cache != null) {
            prev_cache.next_cache = next_cache;
            next_cache.prev_cache = prev_cache;
            next_cache = null;
            prev_cache = null;
        }
    }
}
