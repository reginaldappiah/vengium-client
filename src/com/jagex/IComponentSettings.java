package com.jagex;/* Class298_Sub38 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.network.OutgoingPacket;

public final class IComponentSettings extends Node {
	static IComponentSettings aIComponentSettings_7415 = new IComponentSettings(0, -1);
	public int anInt7410;
	public int settings;

	public final boolean method3492() {
		try {
			return 0 != (-1266165749 * settings & 0x1);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("abw.a(").append(')').toString());
		}
	}

	public final int method3493() {
		try {
			return settings * -1266165749 >> 18 & 0x7;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("abw.i(").append(')').toString());
		}
	}

	public final boolean method3494() {
		try {
			return 0 != (-1266165749 * settings >> 21 & 0x1);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("abw.k(").append(')').toString());
		}
	}

	public final boolean method3495() {
		try {
			return 0 != (-1266165749 * settings >> 22 & 0x1);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("abw.d(").append(')').toString());
		}
	}

	public final boolean method3496() {
		try {
			return 0 != (-1266165749 * settings >> 23 & 0x1);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("abw.u(").append(')').toString());
		}
	}

	public final int method3497() {
		try {
			return StaticMethods.getTargetMask(settings * -1266165749);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("abw.b(").append(')').toString());
		}
	}

	public final boolean method3498(int i) {
		try {
			return 0 != (-1266165749 * settings >> i + 1 & 0x1);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("abw.f(").append(')').toString());
		}
	}

	public IComponentSettings(int settings, int i_1_) {
		this.settings = settings * -726797405;
		anInt7410 = -751469547 * i_1_;
	}

	static final void method3499(ScriptRuntime class403) {
		try {
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = -1289394455 * Class301_Sub1.anInt7624 == 100 ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("abw.aei(").append(')').toString());
		}
	}

	public static void method3500(int i) {
		try {
			MouseTracker.method3572(i);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("abw.f(").append(')').toString());
		}
	}

	static void method3501(ScriptRuntime class403) {
		try {
			class403.integerStack[681479919 * class403.integerStackOffset - 2] = (Class316.aClass362_3318.getQuestType((class403.integerStack[class403.integerStackOffset * 681479919 - 2])).method4566(Class128.playerVarsProvider, (class403.integerStack[class403.integerStackOffset * 681479919 - 1]))) ? 1 : 0;
			class403.integerStackOffset -= -391880689;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("abw.posX(").append(')').toString());
		}
	}

	public static final void sendChangeFriendChat(String string, int i) {
		try {
			ConnectionType connectionType = ConnectionType.getConnectionType();
			OutgoingPacketBuffer outgoingPacketBuffer = Class18.method359(OutgoingPacket.CHANGE_FRIEND_CHAT_PACKET, connectionType.encryptor);
			outgoingPacketBuffer.payload.writeByte(1 + StaticMethods.method693(string));
			outgoingPacketBuffer.payload.writeString(string);
			outgoingPacketBuffer.payload.writeByte128(i);
			connectionType.sendFrame(outgoingPacketBuffer);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("abw.mg(").append(')').toString());
		}
	}

	public static final void method3503() {
		try {
			Class360.loginStep = -395862839;
			Class360.anInt3871 = -988354658;
			Class360.anInt3892 = -946395782;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("abw.b(").append(')').toString());
		}
	}
}
