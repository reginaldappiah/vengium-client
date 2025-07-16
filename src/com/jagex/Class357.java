package com.jagex;/* Class357 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.settings.ScreenSizeSetting;

public class Class357 {
	static Class413 aClass413_3845;

	Class357() throws Throwable {
		throw new Error();
	}

	public static void method4276(int screenSizeMode, int width, int height, boolean fullscreen) {
			GameClient.lastResized = 0L;
			int windowMode = Class190.windowMode();
			if (ScreenSizeSetting.FULLSCREEN == screenSizeMode || windowMode == ScreenSizeSetting.FULLSCREEN)
				fullscreen = true;
			if (!GameClient.activeGraphicsToolkit.isResizable())
				fullscreen = true;
			StaticMethods.resize(screenSizeMode, width, height, fullscreen);
	}
}
