package com.jagex;/* Class109 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;

public class Class109 {
	static int anInt1322 = 4;
	Class114[] aClass114Array1323;
	static int anInt1324 = 256;
	String aString1325;
	Class114[] aClass114Array1326;
	Class108[] aClass108Array1327;
	static int anInt1328 = 2;

	void method1154(byte[] is, int i) throws Exception_Sub3 {
		try {
			Class101 class101 = new Class101(is);
			int i_0_ = class101.getLength();
			if (i_0_ != 4)
				throw new Exception_Sub3(this, i_0_, 4);
			this.aString1325 = class101.getString();
			this.aClass114Array1323 = new Class114[class101.getLength()];
			this.aClass114Array1326 = new Class114[class101.getLength()];
			this.aClass108Array1327 = new Class108[class101.getLength()];
			for (int i_1_ = 0; i_1_ < this.aClass114Array1323.length; i_1_++) {
				this.aClass114Array1323[i_1_] = new Class114();
				this.aClass114Array1323[i_1_].method1256(class101, (byte) 107);
			}
			for (int i_2_ = 0; i_2_ < this.aClass114Array1326.length; i_2_++) {
				this.aClass114Array1326[i_2_] = new Class114();
				this.aClass114Array1326[i_2_].method1256(class101, (byte) 107);
			}
			for (int i_3_ = 0; i_3_ < this.aClass108Array1327.length; i_3_++) {
				this.aClass108Array1327[i_3_] = new Class108();
				this.aClass108Array1327[i_3_].method1145(class101);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("el.a(").append(')').toString());
		}
	}

	public Class109(byte[] is) throws Exception_Sub3 {
		method1154(is, 1575472907);
	}

	static final void method1155(ScriptRuntime class403, int i) {
		try {
			String string = (String) (class403.objectStack[(class403.objectArgs -= 969361751) * -203050393]);
			boolean bool = GameClient.gameClient.method2754(new File(string), -714101418);
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = bool ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("el.agp(").append(')').toString());
		}
	}

	static final void method1156(ScriptRuntime class403, byte i) {
		try {
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = SettingsManager.settingsManager.skybox.getValue();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("el.aks(").append(')').toString());
		}
	}

	static final void method1157(ScriptRuntime class403, int i) {
		try {
			int i_4_ = Player.myPlayer.plane;
			Vector3f class217 = (Player.myPlayer.getWorldTransform().trans);
			GameScene gameScene = GameClient.myRegion.getGameScene();
			int i_5_ = (((int) class217.x >> 9) + -1760580017 * gameScene.gameSceneBaseX);
			int i_6_ = (((int) class217.z >> 9) + 283514611 * gameScene.gameSceneBaseY);
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = (i_5_ << 14) + (i_4_ << 28) + i_6_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("el.tt(").append(')').toString());
		}
	}
}
