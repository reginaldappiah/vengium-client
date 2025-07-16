package com.jagex;/* Class266 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class MapLoad {
	static MapLoad aClass266_2845;
	public static MapLoad CUTSCENE_MAP;
	public static MapLoad LOAD_MAP_SCENE_NORMAL;
	public static MapLoad aClass266_2848 = new MapLoad(false, false);
	static MapLoad aClass266_2849;
	static MapLoad aClass266_2850;
	boolean allowNormalMap;
	public static MapLoad aClass266_2852;
	boolean allowDynamicMap;
	public static MapLoad LOAD_MAP_SCENE_DYNAMIC;

    boolean isDynamicMapScene() {
			return this.allowDynamicMap;
	}

	public boolean isNormalMapScene() {
			return this.allowNormalMap;
	}

	static {
		CUTSCENE_MAP = new MapLoad(true, false);
		LOAD_MAP_SCENE_NORMAL = new MapLoad(false, false);
		LOAD_MAP_SCENE_DYNAMIC = new MapLoad(true, false);
		aClass266_2849 = new MapLoad(true, false);
		aClass266_2845 = new MapLoad(true, true);
		aClass266_2850 = new MapLoad(true, true);
		aClass266_2852 = new MapLoad(false, false);
	}

	MapLoad(boolean allowDynamicMap, boolean allowNormalMap) {
		this.allowDynamicMap = allowDynamicMap;
		this.allowNormalMap = allowNormalMap;
	}

}
