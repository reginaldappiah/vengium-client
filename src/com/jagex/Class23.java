package com.jagex;/* Class23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.network.OutgoingPacket;

public class Class23 {

	static final void method375(ScriptRuntime runtime) {
		try {
			int i_0_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
			Class352 class352 = Class363.aClass339_3931.method4116(i_0_);
			runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = class352.anInt3817 * -804513353;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ax.ama(").append(')').toString());
		}
	}

	public static SpriteToolkit method376(GraphicsToolkit graphicsToolkit, int key) {
			Class298_Sub49 class298_sub49 = ((Class298_Sub49) Class423.aClass437_5354.get((long) key));
			if (class298_sub49 != null) {
				Class298_Sub24_Sub3 class298_sub24_sub3 = class298_sub49.aClass308_Sub1_7591.method3770();
				class298_sub49.aBoolean7594 = true;
				if (class298_sub24_sub3 != null) {
					Class423.aClass431_5352.aClass_ra6503 = graphicsToolkit;
					return ((SpriteToolkit) class298_sub24_sub3.method3088((Class423.aClass431_5352)));
				}
			}
			return null;
	}

	static void method377(String string, String string_2_, String string_3_, boolean bool, boolean bool_4_) {
		try {
			ConnectionType connectionType = ConnectionType.getConnectionType();
			if (connectionType.getStream() != null) {
				OutgoingPacketBuffer outgoingPacketBuffer = Class18.method359(OutgoingPacket.aClass198_2084, connectionType.encryptor);
				outgoingPacketBuffer.payload.writeShort((StaticMethods.method693(string) + StaticMethods.method693(string_2_) + StaticMethods.method693(string_3_) + 1));
				outgoingPacketBuffer.payload.writeString(string);
				outgoingPacketBuffer.payload.writeString(string_2_);
				outgoingPacketBuffer.payload.writeString(string_3_);
				int i_5_ = 0;
				if (bool)
					i_5_ |= 0x1;
				if (bool_4_)
					i_5_ |= 0x2;
				outgoingPacketBuffer.payload.writeByte(i_5_);
				connectionType.sendFrame(outgoingPacketBuffer);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ax.h(").append(')').toString());
		}
	}

	static final void method378(ScriptRuntime runtime) {
		try {
			runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = -278777595 * Class436.menuOptionCount;
			runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = 1592446965 * Class436.anInt5479;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ax.ua(").append(')').toString());
		}
	}

	public static int method379(Buffer class298_sub53, String string) {
		try {
			int i_6_ = 385051775 * class298_sub53.offset;
			byte[] is = Class77.method840(string, 1241279576);
			class298_sub53.method3594(is.length);
			class298_sub53.offset += ((Class106.aClass113_1308.method1246(is, 0, is.length, class298_sub53.buffer, 385051775 * class298_sub53.offset, (byte) -45)) * 116413311);
			return 385051775 * class298_sub53.offset - i_6_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ax.f(").append(')').toString());
		}
	}
}
