package com.jagex;/* HintIcon - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class HintIcon {
	public static HintIcon[] loadedIcons;
	static SpriteToolkit[] arrowTypeSprites;
	public int targetIndex;
	public int minimapAppearance;
	int arrowType;
	int plane;
	public int coordX;
	public int coordY;
	int arrowHeight;
	public int modelID = 698073157;
	static SoftCache cache = new SoftCache(4);
	int arrowFlashRate;
	public int targetType;

	public static final int PLAYER = 10;
	public static final int NPC = 1;

	HintIcon() {
	}

	static void sweep() {
			cache.sweep();
	}

    static void method6141(int i) {
            cache.method4186(i);
    }
}
