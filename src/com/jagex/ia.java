package com.jagex;/* ia - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class ia extends FontToolkit implements Interface25 {
	long nativeid;

	native void am(SSEGraphicsToolkit var_SSEGraphicsToolkit, ba var_ba, byte[][] is, int[] is_0_, int[] is_1_, int[] is_2_, int[] is_3_, int[] is_4_);

    native void UA(char c, int i, int i_11_, int i_12_, boolean bool);

	void method2486(char c, int i, int i_13_, int i_14_, boolean bool, ToolkitLoader toolkitLoader, int i_15_, int i_16_) {
		GA(c, i, i_13_, i_14_, bool, toolkitLoader, i_15_, i_16_);
	}

	native void GA(char c, int i, int i_17_, int i_18_, boolean bool, ToolkitLoader toolkitLoader, int i_19_, int i_20_);

    ia(SSEGraphicsToolkit var_SSEGraphicsToolkit, ba var_ba, RSFontMetrics class505, Sprite[] class89s, SpriteToolkit[] class57s) {
		super(var_SSEGraphicsToolkit, class505);
		byte[][] is = new byte[class89s.length][];
		int[] is_23_ = new int[class89s.length];
		int[] is_24_ = new int[class89s.length];
		int[] is_25_ = new int[class89s.length];
		int[] is_26_ = new int[class89s.length];
		for (int i = 0; i < class89s.length; i++) {
			is[i] = class89s[i].raster;
			is_23_[i] = class89s[i].width;
			is_24_[i] = class89s[i].height;
			is_25_[i] = class89s[i].offsetX;
			is_26_[i] = class89s[i].offsetY;
		}
		EA(var_SSEGraphicsToolkit, var_ba, is, class89s[0].palette, is_23_, is_24_, is_25_, is_26_);
	}

	native void bm(char c, int i, int i_27_, int i_28_, boolean bool, ToolkitLoader toolkitLoader, int i_29_, int i_30_);

	public native void z(boolean bool);

	native void n(SSEGraphicsToolkit var_SSEGraphicsToolkit, ba var_ba, byte[][] is, int[] is_31_, int[] is_32_, int[] is_33_, int[] is_34_, int[] is_35_);

	public native void ma(boolean bool);

	native void bd(SSEGraphicsToolkit var_SSEGraphicsToolkit, ba var_ba, byte[][] is, int[] is_36_, int[] is_37_, int[] is_38_, int[] is_39_, int[] is_40_);

	native void bf(char c, int i, int i_41_, int i_42_, boolean bool, ToolkitLoader toolkitLoader, int i_43_, int i_44_);

	native void EA(SSEGraphicsToolkit var_SSEGraphicsToolkit, ba var_ba, byte[][] is, int[] is_45_, int[] is_46_, int[] is_47_, int[] is_48_, int[] is_49_);

	native void by(char c, int i, int i_50_, int i_51_, boolean bool, ToolkitLoader toolkitLoader, int i_52_, int i_53_);

	native void be(char c, int i, int i_54_, int i_55_, boolean bool, ToolkitLoader toolkitLoader, int i_56_, int i_57_);
}
