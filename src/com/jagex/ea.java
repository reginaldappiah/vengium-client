package com.jagex;/* ea - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class ea extends FontToolkit implements Interface25 {
	long nativeid;

	native void bf(SSEGraphicsToolkit var_SSEGraphicsToolkit, ba var_ba, byte[][] is, int[] is_0_, int[] is_1_, int[] is_2_, int[] is_3_);

	native void n(SSEGraphicsToolkit var_SSEGraphicsToolkit, ba var_ba, byte[][] is, int[] is_4_, int[] is_5_, int[] is_6_, int[] is_7_);

	public native void ma(boolean bool);

	native void UA(char c, int i, int i_8_, int i_9_, boolean bool);

	void method2486(char c, int i, int i_10_, int i_11_, boolean bool, ToolkitLoader toolkitLoader, int i_12_, int i_13_) {
		P(c, i, i_10_, i_11_, bool, toolkitLoader, i_12_, i_13_);
	}

	native void P(char c, int i, int i_14_, int i_15_, boolean bool, ToolkitLoader toolkitLoader, int i_16_, int i_17_);

    public native void z(boolean bool);

	native void am(SSEGraphicsToolkit var_SSEGraphicsToolkit, ba var_ba, byte[][] is, int[] is_26_, int[] is_27_, int[] is_28_, int[] is_29_);

	ea(SSEGraphicsToolkit var_SSEGraphicsToolkit, ba var_ba, RSFontMetrics class505, Sprite[] class89s, SpriteToolkit[] class57s) {
		super(var_SSEGraphicsToolkit, class505);
		byte[][] is = new byte[class89s.length][];
		int[] is_30_ = new int[class89s.length];
		int[] is_31_ = new int[class89s.length];
		int[] is_32_ = new int[class89s.length];
		int[] is_33_ = new int[class89s.length];
		for (int i = 0; i < class89s.length; i++) {
			Sprite class89 = class89s[i];
			if (class89.alpha != null)
				is[i] = class89.alpha;
			else {
				byte[] is_34_ = class89.raster;
				byte[] is_35_ = is[i] = new byte[is_34_.length];
				for (int i_36_ = 0; i_36_ < is_34_.length; i_36_++)
					is_35_[i_36_] = (byte) (is_34_[i_36_] == 0 ? 0 : -1);
			}
			is_30_[i] = class89.width;
			is_31_[i] = class89.height;
			is_32_[i] = class89.offsetX;
			is_33_[i] = class89.offsetY;
		}
		n(var_SSEGraphicsToolkit, var_ba, is, is_30_, is_31_, is_32_, is_33_);
	}

	native void bd(SSEGraphicsToolkit var_SSEGraphicsToolkit, ba var_ba, byte[][] is, int[] is_37_, int[] is_38_, int[] is_39_, int[] is_40_);

	native void be(SSEGraphicsToolkit var_SSEGraphicsToolkit, ba var_ba, byte[][] is, int[] is_41_, int[] is_42_, int[] is_43_, int[] is_44_);

	native void by(char c, int i, int i_45_, int i_46_, boolean bool, ToolkitLoader toolkitLoader, int i_47_, int i_48_);
}
