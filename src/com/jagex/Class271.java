package com.jagex;/* Class271 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class271 {
	static int anInt2895 = 3;
	static int anInt2896 = 0;
	static int anInt2897 = 2;
	public static int anInt2898 = 1;

	Class271() throws Throwable {
		throw new Error();
	}

	static final void method2542(ScriptRuntime runtime) {
		try {
			if (AwtKeyboard.keyboard.held(81))
				runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = 1;
			else
				runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lg.ade(").append(')').toString());
		}
	}

	static boolean method2543(int i, int i_0_, int i_1_, int i_2_) {
		try {
			Region class331 = GameClient.myRegion.getRegion();
			boolean bool = true;
			SceneObject sceneObject = (SceneObject) class331.method4031(i, i_0_, i_1_);
			if (null != sceneObject)
				bool &= Animator_Sub2.method5849(sceneObject);
			sceneObject = (SceneObject) class331.method4035(i, i_0_, i_1_, GameClient.anInterface17_8960);
			if (sceneObject != null)
				bool &= Animator_Sub2.method5849(sceneObject);
			sceneObject = (SceneObject) class331.method4058(i, i_0_, i_1_);
			if (sceneObject != null)
				bool &= Animator_Sub2.method5849(sceneObject);
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lg.k(").append(')').toString());
		}
	}

	static final void method2544(ScriptRuntime runtime) {
		try {
			Class436.anInt5499 = (runtime.integerStack[(runtime.integerStackOffset -= -391880689) * 681479919]) * 985311877;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lg.afn(").append(')').toString());
		}
	}

	public static Class456[] method2545(byte i) {
		try {
			if (null == Class100.aClass456Array1080) {
				Class456[] class456s = Js5ArchiveEnum.method1238(GameClient.display);
				Class456[] class456s_3_ = new Class456[class456s.length];
				int i_4_ = 0;
				int i_5_ = SettingsManager.settingsManager.maxScreenSize.getValue();
				while_69_: for (int i_6_ = 0; i_6_ < class456s.length; i_6_++) {
					Class456 class456 = class456s[i_6_];
					if (class456.anInt5664 * -1087459453 > 0 && -1087459453 * class456.anInt5664 < 24) {
						if (i == 0)
							throw new IllegalStateException();
					} else if (class456.anInt5663 * 28445523 >= 800) {
						if (class456.anInt5665 * 262154323 < 600) {
							if (i == 0) {
								/* empty */
							}
						} else {
							if (i_5_ == 2) {
								if (class456.anInt5663 * 28445523 > 800)
									continue;
								if (class456.anInt5665 * 262154323 > 600) {
									if (i == 0)
										throw new IllegalStateException();
									continue;
								}
							}
							if (1 == i_5_) {
								if (class456.anInt5663 * 28445523 > 1024)
									continue;
								if (class456.anInt5665 * 262154323 > 768) {
									if (i == 0) {
										/* empty */
									}
									continue;
								}
							}
							for (int i_7_ = 0; i_7_ < i_4_; i_7_++) {
								Class456 class456_8_ = class456s_3_[i_7_];
								if ((class456.anInt5663 * 28445523 == 28445523 * class456_8_.anInt5663) && (262154323 * class456_8_.anInt5665 == 262154323 * class456.anInt5665)) {
									if (-1087459453 * class456.anInt5664 > -1087459453 * class456_8_.anInt5664)
										class456s_3_[i_7_] = class456;
									continue while_69_;
								}
							}
							class456s_3_[i_4_] = class456;
							i_4_++;
						}
					}
				}
				Class100.aClass456Array1080 = new Class456[i_4_];
				System.arraycopy(class456s_3_, 0, Class100.aClass456Array1080, 0, i_4_);
				int[] is = new int[Class100.aClass456Array1080.length];
				for (int i_9_ = 0; i_9_ < Class100.aClass456Array1080.length; i_9_++) {
					Class456 class456 = Class100.aClass456Array1080[i_9_];
					is[i_9_] = (28445523 * class456.anInt5663 * (262154323 * class456.anInt5665));
				}
				StaticMethods.method1129(is, Class100.aClass456Array1080);
			}
			return Class100.aClass456Array1080;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lg.hm(").append(')').toString());
		}
	}

	static final void method2546(int i) {
		try {
			for (ObjectDeque objectDeque = ((ObjectDeque) ObjectDeque.aClass453_7152.method5939()); null != objectDeque; objectDeque = (ObjectDeque) ObjectDeque.aClass453_7152.method5944())
				Class225.method2099(objectDeque, false);
			for (ObjectDeque objectDeque = ((ObjectDeque) ObjectDeque.aClass453_7162.method5939()); objectDeque != null; objectDeque = (ObjectDeque) ObjectDeque.aClass453_7162.method5944())
				Class225.method2099(objectDeque, true);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lg.i(").append(')').toString());
		}
	}

	static void method2547(int i) {
		try {
			Minimap.anInt56 = 0;
			Minimap.flagX = 1129029761;
			Minimap.flagY = 1835291189;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lg.f(").append(')').toString());
		}
	}

	public static int method2548(byte[] is, int i) {
		try {
			return Class11.method328(is, 0, i);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lg.f(").append(')').toString());
		}
	}
}
