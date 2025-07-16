package com.jagex;/* Class208 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.network.OutgoingPacket;

public class Class208 {
	public static int anInt2360 = 32768;
	public static int anInt2361 = 15;
	public static int anInt2362 = 15;

	Class208() throws Throwable {
		throw new Error();
	}

	static void method1936(int i) {
		try {
			if (null != ItemContainerDefinition.aClass95_9602 && !ItemContainerDefinition.aClass95_9602.method1029() && ItemContainerDefinition.aClass95_9602.method1030()) {
				OutgoingPacketBuffer outgoingPacketBuffer = Class18.method359(OutgoingPacket.aClass198_2004, ConnectionType.gameConnection.encryptor);
				outgoingPacketBuffer.payload.writeInt(ItemContainerDefinition.aClass95_9602.anInt921 * 1941368041);
				ConnectionType.gameConnection.sendFrame(outgoingPacketBuffer);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("it.aa(").append(')').toString());
		}
	}

	static final void method1937(ScriptRuntime runtime) {
		try {
			runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = StaticMethods.anInt3190 * -1691245391;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("it.aml(").append(')').toString());
		}
	}
}
