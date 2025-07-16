package com.jagex;/* Class117 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class117 {
	public int anInt1393;
	public int anInt1394;
	public int[] anIntArray1395;
	public int[] anIntArray1396;
	public ToolkitLoader toolkitLoader;
	int graphicID;
	public static int anInt1399;

	public boolean method1274(int i, int i_0_) {
			if (i_0_ >= 0 && i_0_ < anIntArray1396.length) {
				int i_2_ = anIntArray1396[i_0_];
				if (i >= i_2_ && i <= anIntArray1395[i_0_] + i_2_)
					return true;
			}
			return false;
	}

	Class117(int i, int i_3_, int[] is, int[] is_4_, ToolkitLoader toolkitLoader, int graphicID) {
		anInt1393 = i * 1311761597;
		anInt1394 = i_3_ * 1702073049;
		anIntArray1395 = is;
		anIntArray1396 = is_4_;
		this.toolkitLoader = toolkitLoader;
		this.graphicID = -367449257 * graphicID;
	}

}
