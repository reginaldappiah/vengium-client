package com.jagex;/* Class408 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.network.OutgoingPacket;

public class Class408 {
	public static int anInt5277 = 1;
	public static int anInt5278 = 3;
	public static int anInt5279 = 2;
	public static int anInt5280 = 4;

	Class408() throws Throwable {
		throw new Error();
	}

	static Class444[] method4965(byte i) {
		try {
			return (new Class444[] { Class444.aClass444_5605, Class444.aClass444_5604, Class444.aClass444_5602, Class444.aClass444_5606, Class444.aClass444_5603 });
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("qy.a(").append(')').toString());
		}
	}

	public static int method4966(long l) {
		try {
			return (int) (l / 86400000L) - 11745;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("qy.i(").append(')').toString());
		}
	}

	static Class147[] method4967(byte i) {
		try {
			return (new Class147[] { Class147.aClass147_1579, Class147.aClass147_1578, Class147.aClass147_1577 });
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("qy.a(").append(')').toString());
		}
	}

	static final void method4968(ScriptRuntime runtime) {
		try {
			int i_0_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
			IComponentDefinition class105 = IComponentDefinition.getInterfaceComponent(i_0_);
			IComponentDefinitionCollection IComponentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[i_0_ >> 16];
			Class82_Sub19.method925(class105, IComponentDefinitionCollection, runtime, -535116520);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("qy.fi(").append(')').toString());
		}
	}

	static final void method4969(ScriptRuntime class403, int i) {
		try {
			ConnectionType connectionType = ConnectionType.getConnectionType();
			OutgoingPacketBuffer outgoingPacketBuffer = Class18.method359(OutgoingPacket.PUBLIC_QUICK_CHAT_PACKET, connectionType.encryptor);
			outgoingPacketBuffer.payload.writeByte(0);
			int i_1_ = (outgoingPacketBuffer.payload.offset * 385051775);
			outgoingPacketBuffer.payload.writeByte(0);
			outgoingPacketBuffer.payload.writeShort(class403.aClass177_5243.anInt1787 * -2034569943);
			class403.aClass177_5243.aClass298_Sub37_Sub14_1788.method3464(outgoingPacketBuffer.payload, class403.aClass177_5243.anIntArray1789, 1127792065);
			outgoingPacketBuffer.payload.method3649((385051775 * outgoingPacketBuffer.payload.offset) - i_1_);
			connectionType.sendFrame(outgoingPacketBuffer);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("qy.acg(").append(')').toString());
		}
	}
}
