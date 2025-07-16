package com.jagex;/* Class141 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class141 implements Interface6 {
	Class145 aClass145_6389;

	public boolean method52(int i) {
		try {
			return true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("fs.b(").append(')').toString());
		}
	}

	Class141(Class145 class145) {
		this.aClass145_6389 = class145;
	}

	public void method53() {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("fs.a(").append(')').toString());
		}
	}

	public void method58(boolean bool, byte i) {
		try {
			if (bool)
				GameClient.activeGraphicsToolkit.drawFilledRectangle(0, 0, GameShell.canvasWidth * -2110394505, -1111710645 * GameShell.canvasHeight, 1751631615 * this.aClass145_6389.anInt6344, 0);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("fs.f(").append(')').toString());
		}
	}

	static void method1561(int i) {
		try {
			if (null != Class300.aClass303_3202) {
				Vector3f class217 = (Vector3f.method2005(Player.myPlayer.getWorldTransform().trans));
				GameScene gameScene = GameClient.myRegion.getGameScene();
				class217.x += (float) (gameScene.gameSceneBaseX * -1760580017 << 9);
				class217.z += (float) (gameScene.gameSceneBaseY * 283514611 << 9);
				class217.negateVector3f((float) (Class300.aClass303_3202.anInt3264 * -1640118043), class217.y, (float) (Class300.aClass303_3202.anInt3261 * 827958915));
				float f = class217.method2012();
				class217.cache();
				float f_0_ = 0.0F;
				if (f < (float) (-1052008745 * (Class300.aClass303_3202.anInt3262)))
					f_0_ = 1.0F;
				else if (f > (float) (22325987 * (Class300.aClass303_3202.anInt3263)))
					f_0_ = 0.0F;
				else {
					f -= (float) (-1052008745 * (Class300.aClass303_3202.anInt3262));
					f_0_ = 1.0F - f / (float) ((Class300.aClass303_3202.anInt3260) * 356734275);
				}
				StaticMethods.method1136((int) (256.0F * f_0_));
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("fs.h(").append(')').toString());
		}
	}

	static void method1567() {
			if (StaticMethods.aClass401_2708 != Class401.aClass401_6552)
				Class212.aClass212_2431.method1952();
	}
}
