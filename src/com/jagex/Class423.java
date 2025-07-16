package com.jagex;/* Class423 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.net.Socket;

public class Class423 {
	static Class431 aClass431_5352;
	static int anInt5353 = 4096;
	static LinkedList aClass437_5354 = new LinkedList(4);
	static Socket aSocket5355;
	public static SpriteToolkit aClass57_5356;

	static {
		aClass431_5352 = new Class431();
	}

	Class423() throws Throwable {
		throw new Error();
	}

	public static void method5733(boolean bool) {
		try {
			if (bool && Class301_Sub1.aClass298_Sub37_Sub13_3218 != null)
				Class229.anInt6459 = (704948247 * Class301_Sub1.aClass298_Sub37_Sub13_3218.anInt9643);
			else
				Class229.anInt6459 = -678712477;
			Class301_Sub1.aClass298_Sub37_Sub13_3218 = null;
			DiskFile.aClass453_5986 = null;
			Class301_Sub1.anInt7624 = 0;
			StaticMethods.aClass105_1373 = null;
			Class301_Sub1.method3691();
			Class301_Sub1.aClass453_3236.clean();
			Class301_Sub1.aClass296_3235 = null;
			Class274.aClass57_6539 = null;
			Class301_Sub1.anInt7632 = 433609607;
			Class301_Sub1.anInt7627 = 789877945;
			Class381.aClass4_4119 = null;
			StaticMethods.aClass4_2795 = null;
			GraphicsContext.aClass4_508 = null;
			Class414.aClass4_5326 = null;
			StaticMethods.aClass4_6525 = null;
			Class400.aClass4_5224 = null;
			Class152.aClass4_1594 = null;
			Class241.aClass4_2707 = null;
			if (null != Class301_Sub1.aClass339_3251) {
				Class301_Sub1.aClass339_3251.clear();
				Class301_Sub1.aClass339_3251.method4119(128, 64);
			}
			if (Class301_Sub1.aClass487_3225 != null)
				Class301_Sub1.aClass487_3225.method6160(64, 64, -1144646938);
			if (null != Class301_Sub1.aClass433_3220)
				Class301_Sub1.aClass433_3220.setCacheCapacity(256);
			Class472.configLoader.clear(64);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("rn.bs(").append(')').toString());
		}
	}

	static boolean method5734() {
		try {
			return Class8.aBoolean108;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("rn.k(").append(')').toString());
		}
	}
}
