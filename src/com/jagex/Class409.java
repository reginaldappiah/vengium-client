package com.jagex;/* Class409 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class409 {
	int anInt5281;
	int anInt5282;
	GameScene gameScene;
	static int anInt5284;

	public Class409(GameScene gameScene, int i, int i_1_) {
		this.gameScene = gameScene;
		this.anInt5281 = 1975331269 * i;
		this.anInt5282 = i_1_ * -1576240641;
	}

	int method4970() {
			return (GameClient.anIntArray8739[this.anInt5281 * -1511232243]);
	}

	public SceneObject method4971() {
		try {
			SceneObject sceneObject = method4972();
			if (null == sceneObject)
				return null;
			if (sceneObject.getID() != -1949334017 * this.anInt5282)
				return null;
			return sceneObject;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("qz.f(").append(')').toString());
		}
	}

	SceneObject method4972() {
		try {
			int i_2_ = 1008331379 * this.gameScene.gameSceneBasePlane;
			GameScene gameScene = GameClient.myRegion.getGameScene();
			int gameSceneBaseX = (this.gameScene.gameSceneBaseX * -1760580017 - gameScene.gameSceneBaseX * -1760580017);
			int gameSceneBaseY = (this.gameScene.gameSceneBaseY * 283514611 - gameScene.gameSceneBaseY * 283514611);
			if (gameSceneBaseX < 0 || gameSceneBaseY < 0 || gameSceneBaseX >= GameClient.myRegion.getMapWidth() || gameSceneBaseY >= GameClient.myRegion.getMapLength())
				return null;
			switch (method4970()) {
			case 0:
				return ((SceneObject) GameClient.myRegion.getRegion().method4031(i_2_, gameSceneBaseX, gameSceneBaseY));
			case 1:
				return ((SceneObject) GameClient.myRegion.getRegion().method4033(i_2_, gameSceneBaseX, gameSceneBaseY));
			default:
				return null;
			case 2:
				return (SceneObject) (GameClient.myRegion.getRegion().method4035(i_2_, gameSceneBaseX, gameSceneBaseY, GameClient.anInterface17_8960));
			case 3:
				return ((SceneObject) GameClient.myRegion.getRegion().method4058(i_2_, gameSceneBaseX, gameSceneBaseY));
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("qz.b(").append(')').toString());
		}
	}

}
