package com.jagex;/* Class374_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.network.OutgoingPacket;
import com.jagex.utils.TimeUtils;

public class Class374_Sub1 extends Class374 {

    boolean method4619(int i) {
		try {
			return (method4639((short) 10071) != null || (this.aLong4075 * 8383148474145196457L < TimeUtils.getTime() - 2000L));
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("adi.u(").append(')').toString());
		}
	}

	Class374_Sub1() {
		/* empty */
	}

	MouseRecord method4639(short i) {
		try {
			return ((MouseRecord) GameClient.mouseRecords.method5939());
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("adi.az(").append(')').toString());
		}
	}

	OutgoingPacketBuffer method4633(byte i) {
		try {
			return Class18.method359(OutgoingPacket.aClass198_1995, ConnectionType.gameConnection.encryptor);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("adi.posX(").append(')').toString());
		}
	}

	void method4617(Buffer class298_sub53, MouseRecord class298_sub50, byte i) {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("adi.k(").append(')').toString());
		}
	}

    void method4618(byte i) {
		try {
			MouseRecord class298_sub50 = method4639((short) 12232);
			if (class298_sub50 != null) {
				int i_6_ = method4615(class298_sub50, 32767, (byte) 9);
				int i_7_ = class298_sub50.getMouseY();
				if (i_7_ < 0)
					i_7_ = 0;
				else if (i_7_ > 65535)
					i_7_ = 65535;
				int i_8_ = class298_sub50.getMouseX();
				if (i_8_ < 0)
					i_8_ = 0;
				else if (i_8_ > 65535)
					i_8_ = 65535;
				int i_9_ = 0;
				if (class298_sub50.getMouseType() == 2)
					i_9_ = 1;
				OutgoingPacketBuffer outgoingPacketBuffer = Class18.method359(OutgoingPacket.aClass198_2008, ConnectionType.gameConnection.encryptor);
				outgoingPacketBuffer.payload.writeInt(i_8_ | i_7_ << 16);
				outgoingPacketBuffer.payload.writeShort128(i_6_ | i_9_ << 15);
				ConnectionType.gameConnection.sendFrame(outgoingPacketBuffer);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("adi.d(").append(')').toString());
		}
	}

    int method4616(int i) {
		try {
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("adi.i(").append(')').toString());
		}
	}

	public static void method4640(boolean bool, boolean bool_13_, int i) {
		try {
			if (bool) {
				Class379.anInt4097 += 1929855733;
				StaticMethods.method3968(-1915881134);
			}
			if (bool_13_) {
				Class379.anInt4095 += -1931699395;
				ResourceCache.method3994((byte) 1);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("adi.a(").append(')').toString());
		}
	}

	static final void method4641(ScriptRuntime class403, byte i) {
		try {
			class403.integerStackOffset -= -783761378;
			GameClient.anInt8831 = (class403.integerStack[class403.integerStackOffset * 681479919]) * 443563833;
			GameClient.cursor = ((class403.integerStack[1 + class403.integerStackOffset * 681479919]) * -802224543);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("adi.afv(").append(')').toString());
		}
	}
}
