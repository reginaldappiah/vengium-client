package com.jagex;/* Class374_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import com.jagex.network.OutgoingPacket;
import com.jagex.utils.TimeUtils;

import java.util.LinkedList;
import java.util.Queue;

public class Class374_Sub2 extends Class374 {
	Queue aQueue7732 = new LinkedList();

	void method4618(byte i) {
		try {
			MouseTracker class298_sub50_sub2 = ((MouseTracker) this.aQueue7732.poll());
			if (class298_sub50_sub2 != null) {
				OutgoingPacketBuffer outgoingPacketBuffer = Class18.method359(OutgoingPacket.MINI_UNWALKABLE, ConnectionType.gameConnection.encryptor);
				outgoingPacketBuffer.payload.writeInt((class298_sub50_sub2.getMouseX() | class298_sub50_sub2.getMouseY() << 16));
				outgoingPacketBuffer.payload.writeShortLE128(method4615(class298_sub50_sub2, 65535, (byte) 33));
				outgoingPacketBuffer.payload.method3617((class298_sub50_sub2.method3569() << 1 | class298_sub50_sub2.method3568() & 0x1));
				ConnectionType.gameConnection.sendFrame(outgoingPacketBuffer);
				class298_sub50_sub2.resizeCache();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("adt.d(").append(')').toString());
		}
	}

	void method4642(MouseTracker class298_sub50_sub2, byte i) {
		try {
			this.aQueue7732.add(class298_sub50_sub2);
			if (this.aQueue7732.size() > 10)
				this.aQueue7732.poll();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("adt.az(").append(')').toString());
		}
	}

	OutgoingPacketBuffer method4633(byte i) {
		try {
			return Class18.method359(OutgoingPacket.aClass198_2059, ConnectionType.gameConnection.encryptor);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("adt.posX(").append(')').toString());
		}
	}

	boolean method4619(int i) {
		try {
			return (!this.aQueue7732.isEmpty() || (this.aLong4075 * 8383148474145196457L < TimeUtils.getTime() - 2000L));
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("adt.u(").append(')').toString());
		}
	}

	void method4643(Buffer class298_sub53, MouseTracker class298_sub50_sub2, int i) {
		try {
			class298_sub53.writeByte(class298_sub50_sub2.method3568());
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("adt.as(").append(')').toString());
		}
	}

    Class374_Sub2() {
		/* empty */
	}

    void method4617(Buffer class298_sub53, MouseRecord class298_sub50, byte i) {
		try {
			method4643(class298_sub53, (MouseTracker) class298_sub50, -1392580670);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("adt.k(").append(')').toString());
		}
	}

	int method4616(int i) {
		try {
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("adt.i(").append(')').toString());
		}
	}

    static final void method4644(ScriptRuntime runtime) {
		try {
			int i_0_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
			if (StaticMethods.aClass7Array6846 != null && i_0_ < -1801543887 * Class489.anInt6071 && (StaticMethods.aClass7Array6846[i_0_].aString93.equalsIgnoreCase(Player.myPlayer.accountName)))
				runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = 1;
			else
				runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("adt.wa(").append(')').toString());
		}
	}
}
