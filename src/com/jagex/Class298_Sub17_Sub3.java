package com.jagex;/* Class298_Sub17_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub17_Sub3 extends Class298_Sub17 {
	Class152 aClass152_9200;
	int anInt9201;

	Class298_Sub17_Sub3(Class152 class152) {
		super();
		this.anInt9201 = -2081754389;
	}

	void method2917(Buffer buffer) {
		try {
			this.anInt9201 = buffer.readUShort() * 2081754389;
			buffer.readUByte();
			if (buffer.readUByte() != 255) {
				buffer.offset -= 116413311;
				buffer.readLong();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("agk.a(").append(')').toString());
		}
	}

	void method2918(ClanChannelChat clanChannelChat) {
		try {
			clanChannelChat.method3100((this.anInt9201 * -528950723));
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("agk.f(").append(')').toString());
		}
	}

	static final void method2924(ScriptRuntime class403, short i) {
		try {
			class403.longStacks[((class403.longArgs += -682569305) * 1685767703 - 1)] = (class403.longLocals[(class403.integerstack[1883543357 * class403.integerPos])]);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("agk.by(").append(')').toString());
		}
	}
}
