package com.jagex.game.cache.config.prefetch;

public interface JSFPrefetch {

	boolean isLoaded(String string);

	boolean destroy();

	boolean load(String name);

}
