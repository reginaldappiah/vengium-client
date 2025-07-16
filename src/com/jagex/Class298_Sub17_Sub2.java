package com.jagex;/* Class298_Sub17_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub17_Sub2 extends Class298_Sub17 {
	byte aByte9195;
	String aString9196;
	int anInt9197;
	int anInt9198;

	void method2917(Buffer buffer) {
		try {
			this.anInt9197 = buffer.readUShort() * 857287155;
			this.aByte9195 = buffer.readByte();
			this.anInt9198 = buffer.readUShort() * -1333007471;
			buffer.readLong();
			this.aString9196 = buffer.readString();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("agj.a(").append(')').toString());
		}
	}

	void method2918(ClanChannelChat clanChannelChat) {
		try {
			ClanMember clanMember = (clanChannelChat.clanMembers[this.anInt9197 * 2029492027]);
			clanMember.playerRank = this.aByte9195;
			clanMember.playerWorldID = this.anInt9198 * -1537662205;
			clanMember.playerDisplayName = this.aString9196;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("agj.f(").append(')').toString());
		}
	}

	Class298_Sub17_Sub2(Class152 class152) {
		super();
		this.anInt9197 = -857287155;
	}

}
