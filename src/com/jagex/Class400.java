package com.jagex;/* Class400 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class400 {
	GameScene scene;
	int anInt5222;
	public static int anInt5223;
	static Class4 aClass4_5224;

	public Class400(GameScene scene, int i) {
		this.scene = scene;
		this.anInt5222 = -2062685815 * i;
	}

	public Class365_Sub1_Sub4_Sub1 method4927() {
			Class298_Sub2 class298_sub2 = ((Class298_Sub2) (GameClient.aClass437_8685.get((long) ((this.scene.gameSceneBasePlane * 1008331379) << 28 | 283514611 * (this.scene.gameSceneBaseY) << 14 | -1760580017 * (this.scene.gameSceneBaseX)))));
			if (class298_sub2 == null)
				return null;
			GameScene scene = GameClient.myRegion.getGameScene();
			int baseX = (-1760580017 * this.scene.gameSceneBaseX - scene.gameSceneBaseX * -1760580017);
			int baseY = (283514611 * this.scene.gameSceneBaseY - 283514611 * scene.gameSceneBaseY);
			if (baseX >= 0 && baseY >= 0 && baseX < GameClient.myRegion.getMapWidth() && baseY < GameClient.myRegion.getMapLength()) {
				for (Class298_Sub12 class298_sub12 = (Class298_Sub12) class298_sub2.aClass453_7166.method5939(); class298_sub12 != null; class298_sub12 = ((Class298_Sub12) class298_sub2.aClass453_7166.method5944())) {
					if (-1600299847 * this.anInt5222 == class298_sub12.anInt7257 * 1768239597)
						return ((Class365_Sub1_Sub4_Sub1) (GameClient.myRegion.getRegion().method4034((this.scene.gameSceneBasePlane * 1008331379), baseX, baseY)));
				}
			}
			return null;
	}

}
