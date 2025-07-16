package com.jagex;/* Class298_Sub17_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub17_Sub1 extends Class298_Sub17 {
	int anInt9191;
	byte aByte9192;
	String username;

	Class298_Sub17_Sub1() {
		super();
		this.username = null;
	}

	void method2918(ClanChannelChat clanChannelChat) {
		try {
			ClanMember clanMember = new ClanMember();
			clanMember.playerDisplayName = this.username;
			clanMember.playerWorldID = this.anInt9191 * 1934144191;
			clanMember.playerRank = this.aByte9192;
			clanChannelChat.method3096(clanMember);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("agh.f(").append(')').toString());
		}
	}

	void method2917(Buffer buffer) {
		try {
			if (buffer.readUByte() != 255) {
				buffer.offset -= 116413311;
				buffer.readLong();
			}
			this.username = buffer.readNullString();
			this.anInt9191 = buffer.readUShort() * -1467351539;
			this.aByte9192 = buffer.readByte();
			buffer.readLong();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("agh.a(").append(')').toString());
		}
	}

}
