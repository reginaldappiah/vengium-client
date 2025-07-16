package com.jagex;/* m - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class m extends FontToolkit implements Interface25 {
	long nativeid;

	native void am(SSEGraphicsToolkit var_SSEGraphicsToolkit, ba var_ba, byte[][] is, int[] is_0_, int[] is_1_, int[] is_2_, int[] is_3_);

	void method2486(char c, int i, int i_4_, int i_5_, boolean bool, ToolkitLoader toolkitLoader, int i_6_, int i_7_) {
		MA(c, i, i_4_, i_5_, bool, toolkitLoader, i_6_, i_7_);
	}

	public native void ma(boolean bool);

    native void n(SSEGraphicsToolkit var_SSEGraphicsToolkit, ba var_ba, byte[][] is, int[] is_10_, int[] is_11_, int[] is_12_, int[] is_13_);

	native void MA(char c, int i, int i_14_, int i_15_, boolean bool, ToolkitLoader toolkitLoader, int i_16_, int i_17_);

    native void UA(char c, int i, int i_20_, int i_21_, boolean bool);

    public native void z(boolean bool);

	m(SSEGraphicsToolkit var_SSEGraphicsToolkit, ba var_ba, RSFontMetrics class505, Sprite[] class89s, SpriteToolkit[] class57s) {
		super(var_SSEGraphicsToolkit, class505);
		byte[][] is = new byte[class89s.length][];
		int[] is_26_ = new int[class89s.length];
		int[] is_27_ = new int[class89s.length];
		int[] is_28_ = new int[class89s.length];
		int[] is_29_ = new int[class89s.length];
		for (int i = 0; i < class89s.length; i++) {
			is[i] = class89s[i].raster;
			is_26_[i] = class89s[i].width;
			is_27_[i] = class89s[i].height;
			is_28_[i] = class89s[i].offsetX;
			is_29_[i] = class89s[i].offsetY;
		}
		n(var_SSEGraphicsToolkit, var_ba, is, is_26_, is_27_, is_28_, is_29_);
	}

	native void bd(SSEGraphicsToolkit var_SSEGraphicsToolkit, ba var_ba, byte[][] is, int[] is_30_, int[] is_31_, int[] is_32_, int[] is_33_);

	native void bf(char c, int i, int i_34_, int i_35_, boolean bool, ToolkitLoader toolkitLoader, int i_36_, int i_37_);

	native void be(char c, int i, int i_38_, int i_39_, boolean bool, ToolkitLoader toolkitLoader, int i_40_, int i_41_);
}
