package com.jagex;/* Class336_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class336_Sub4 extends Class336 {
	Class336_Sub4() {
		/* empty */
	}

	public boolean method4090(int i, int i_0_, int i_1_, Class289 class289, int i_2_) {
		try {
			return Class287.method2720(i_0_, i_1_, i, i, toX * -1331662251, toY * 1517720743, sizeX * -1900284579, sizeY * 772610897, -173263894);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ack.a(").append(')').toString());
		}
	}

	public boolean method4089(int i, int i_3_, int i_4_, Class289 class289) {
		return Class287.method2720(i_3_, i_4_, i, i, toX * -1331662251, toY * 1517720743, sizeX * -1900284579, sizeY * 772610897, -173263894);
	}

	public boolean method4091(int i, int i_5_, int i_6_, Class289 class289) {
		return Class287.method2720(i_5_, i_6_, i, i, toX * -1331662251, toY * 1517720743, sizeX * -1900284579, sizeY * 772610897, -173263894);
	}

	public static Class297 method4103(int i, int i_7_, int i_8_, int i_9_, int i_10_, boolean bool, int i_11_, int i_12_) {
		try {
			if ((bool ? SettingsManager.settingsManager.voiceOverVolume.getValue() : SettingsManager.settingsManager.soundEffectsVolume.getValue()) != 0 && i_7_ != 0 && -991384187 * Class300.anInt3213 < 50 && i != -1) {
				Class297 class297 = new Class297(bool ? (byte) 3 : (byte) 2, i, i_7_, i_8_, i_9_, i_10_, i_11_, null);
				Class300.aClass297Array3214[(Class300.anInt3213 += -598588595) * -991384187 - 1] = class297;
				return class297;
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ack.posY(").append(')').toString());
		}
	}

	public static void method4104(int i) {
		try {
			synchronized (StaticMethods.mouseRecordsQueue) {
				for (;;) {
					MouseTracker class298_sub50_sub2 = (MouseTracker) StaticMethods.mouseRecordsQueue.poll();
					if (null == class298_sub50_sub2) {
						if (i != -320472795) {
							/* empty */
						}
						break;
					}
					class298_sub50_sub2.resizeCache();
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ack.k(").append(')').toString());
		}
	}
}
