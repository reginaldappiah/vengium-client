package com.jagex;/* Class82_Sub20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.network.OutgoingPacket;

public class Class82_Sub20 extends Class82 {
	int anInt6896;
	int anInt6897;
	String aString6898;
	int anInt6899;
	int anInt6900;

	Class82_Sub20(Buffer class298_sub53) {
		super(class298_sub53);
		this.anInt6900 = class298_sub53.readUShort() * -1972913347;
		this.anInt6896 = class298_sub53.readUShort() * 1250113173;
		this.aString6898 = class298_sub53.readString();
		this.anInt6897 = class298_sub53.readInt() * -1423918679;
		this.anInt6899 = class298_sub53.readUShort() * 1154354255;
	}

	public void method869() {
		StaticMethods.method3687(1855729883 * GameClient.plane, -1180797931 * this.anInt6900, -1854610243 * this.anInt6896, (Class356.getAverageHeight(-1180797931 * this.anInt6900, this.anInt6896 * -1854610243, 1855729883 * GameClient.plane, -2129149221)), this.anInt6899 * -745698641, this.anInt6897 * 1817377433, this.aString6898);
	}

	public void method868() {
		StaticMethods.method3687(1855729883 * GameClient.plane, -1180797931 * this.anInt6900, -1854610243 * this.anInt6896, (Class356.getAverageHeight(-1180797931 * this.anInt6900, this.anInt6896 * -1854610243, 1855729883 * GameClient.plane, -1605294967)), this.anInt6899 * -745698641, this.anInt6897 * 1817377433, this.aString6898);
	}

	public void method866() {
		try {
			StaticMethods.method3687(1855729883 * GameClient.plane, -1180797931 * this.anInt6900, -1854610243 * this.anInt6896, Class356.getAverageHeight((-1180797931 * this.anInt6900), (this.anInt6896 * -1854610243), 1855729883 * GameClient.plane, -1944886078), this.anInt6899 * -745698641, this.anInt6897 * 1817377433, this.aString6898);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("yn.f(").append(')').toString());
		}
	}

	static void method933() {
			OutgoingPacketBuffer outgoingPacketBuffer = Class18.method359(OutgoingPacket.RECEIVE_PACKET_COUNT_PACKET, ConnectionType.gameConnection.encryptor);
			outgoingPacketBuffer.payload.writeInt(GameClient.totalPacketCount * -2059460167);
			ConnectionType.gameConnection.sendFrame(outgoingPacketBuffer);
	}

}
