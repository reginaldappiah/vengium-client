package com.jagex;/* Class520 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class520 {
	public int anInt6275;
	public int anInt6276;
	public char aChar6277;
	public int anInt6278;

	void method6320(Buffer buffer, int opcode) {
		try {
			if (opcode == 1)
				aChar6277 = Class485.keyCodeToSymbol(buffer.readByte());
			else if (3 == opcode) {
				anInt6276 = buffer.readUShort() * -1544029687;
				anInt6275 = buffer.readUByte() * -786049945;
				anInt6278 = buffer.readUByte() * -2127046785;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("vy.f(").append(')').toString());
		}
	}

	Class520() {
		/* empty */
	}

	void method6321(Buffer buffer) {
			for (;;) {
				int opcode = buffer.readUByte();
				if (0 == opcode) {
					break;
				}
				method6320(buffer, opcode);
			}
	}
}
