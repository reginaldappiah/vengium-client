package com.jagex;/* Class238 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class238 implements FontRenderProvider {

	public Object provideFont(byte[] spriteData, boolean loaded, RSFontMetrics RSFontMetrics) {
			return GameClient.activeGraphicsToolkit.createFontToolkit(RSFontMetrics, Sprite.decode(spriteData), loaded);
	}

}
