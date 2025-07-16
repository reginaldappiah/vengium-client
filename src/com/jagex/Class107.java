package com.jagex;/* Class107 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.network.OutgoingPacket;

public class Class107 {
	static int anInt1313 = 0;
	public static short[] aShortArray1315;

	Class107() throws Throwable {
		throw new Error();
	}

	public static void method1144(boolean bool) {
			if (1596783995 * GameClient.anInt8724 != 2 && 1596783995 * GameClient.anInt8724 != 3) {
				if (!bool) {
					Class82[] class82s = Class87.aClass82Array797;
					for (int i_7_ = 0; i_7_ < class82s.length; i_7_++) {
						Class82 class82 = class82s[i_7_];
						class82.method867(-2077321818);
					}
				}
				GameClient.anInt8724 = 1973597030;
				StaticMethods.cutsceneXTEAS = null;
				Class128_Sub1.playerAppearence = null;
				GameClient.cameraGloballyUpdated = false;
				Class87.reset();
				OutgoingPacketBuffer outgoingPacketBuffer = Class18.method359(OutgoingPacket.aClass198_2011, ConnectionType.gameConnection.encryptor);
				outgoingPacketBuffer.payload.writeByte(bool ? 1 : 0);
				ConnectionType.gameConnection.sendFrame(outgoingPacketBuffer);
			}
	}

	static int method1403() {
            return (anInt1313 += 1968838043) * -239712109 - 1;
    }
}
