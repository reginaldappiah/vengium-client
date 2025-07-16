package com.jagex.game.cache.config.prefetch;

/**
 * Created by Krimsonowl on 7/20/2017.
 */
public class JS5PrefetchType {

    public static JSFPrefetch prefetch;

    public static boolean prefetchUnavailable() {
            return null != prefetch;
    }

    public static JSFPrefetch getPrefetch() {
            if (prefetch == null)
                throw new IllegalStateException("");
            return prefetch;
    }

    public static void setEmptyPrefetch(JSFPrefetch JSFPrefetch) {
            if (prefetch != null)
                throw new IllegalStateException("");
            prefetch = JSFPrefetch;
    }
}
