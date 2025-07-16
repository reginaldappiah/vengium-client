package com.jagex;/* Class298_Sub24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;

public abstract class Class298_Sub24 extends Node {
	OggStreamState anOggStreamState7351;
	int anInt7352;

	abstract void method3072();

	void method3073(OggPacket oggpacket, int i) {
		try {
			method3074(oggpacket, -441826665);
			this.anInt7352 += 1765581491;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("abi.a(").append(')').toString());
		}
	}

	abstract void method3074(OggPacket oggpacket, int i);

	abstract void method3075(int i);

	abstract void method3076(OggPacket oggpacket);

	abstract void method3077(OggPacket oggpacket);

	abstract void method3078(OggPacket oggpacket);

	Class298_Sub24(OggStreamState oggstreamstate) {
		this.anOggStreamState7351 = oggstreamstate;
	}

	abstract void method3079();
}
