package com.jagex;/* Class78 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.FileOutputStream;

public class Class78 {
	public int anInt725;
	public int anInt726;
	public int anInt727;
	int anInt728;
	public int anInt729;
	public int anInt730;
	static FileOutputStream aFileOutputStream731;
	public int anInt732;
	public Class78(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
		anInt726 = 614121861 * i;
		anInt725 = -885436027 * i_0_;
		anInt727 = i_1_ * 399458545;
		this.anInt728 = i_2_ * -2122084815;
		anInt729 = 1507836083 * i_3_;
		anInt730 = i_4_ * -1927451111;
		anInt732 = -875460563 * i_5_;
	}

	public boolean method843(Class78 class78_6_, byte i) {
		try {
			return (class78_6_.anInt726 * -1212608691 == -1212608691 * anInt726 && (1996750669 * class78_6_.anInt725 == anInt725 * 1996750669) && (anInt727 * -1475891183 == -1475891183 * class78_6_.anInt727) && (this.anInt728 * -1761932591 == class78_6_.anInt728 * -1761932591) && anInt729 * -28774789 == -28774789 * class78_6_.anInt729 && 484707881 * anInt730 == 484707881 * class78_6_.anInt730 && (class78_6_.anInt732 * -1637742683 == anInt732 * -1637742683));
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("dd.a(").append(')').toString());
		}
	}

	public Class78() {
		/* empty */
	}

	static boolean method844(byte i) {
		try {
			boolean bool;
			try {
				FileInflater fileInflater = new FileInflater();
				byte[] is = fileInflater.method6317(Class229.aByteArray6457);
				StaticMethods.getSprite(is);
				bool = true;
			} catch (Exception exception) {
				return false;
			}
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("dd.p(").append(')').toString());
		}
	}

	static void method845(int i) {
		try {
			if (!Loader.LOBBY_ENABLED || 136 == Class360.loginType * -122629167)
				Class360.anInt3892 = i * -1674285757;
			else if (Loader.LOBBY_ENABLED && 264 == Class360.loginType * -122629167)
				Class360.anInt3871 = i * -1653306319;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("dd.j(").append(')').toString());
		}
	}

	static final void method846(ScriptRuntime class403, short i) {
		try {
			int i_8_ = (class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]);
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = GameClient.anIntArray8829[i_8_];
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("dd.tr(").append(')').toString());
		}
	}
}
