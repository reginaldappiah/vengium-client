package com.jagex;/* Class497 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class497 {
	char aChar6099;
	public int size;
	public String aString6101;
	public boolean aBoolean6102 = true;

	void readValueLoop(Buffer buffer) {
			for (;;) {
				int opcode = buffer.readUByte();
				if (opcode == 0) {
					break;
				}
				decode(buffer, opcode);
			}
	}

	void decode(Buffer buffer, int opcode) {
			if (1 == opcode)
				this.aChar6099 = Class485.keyCodeToSymbol(buffer.readByte());
			else if (2 == opcode)
				size = buffer.readInt() * -954052725;
			else if (opcode == 4)
				aBoolean6102 = false;
			else if (opcode == 5)
				aString6101 = buffer.readString();
	}

	Class497() {

	}

	public boolean method6206() {
			return this.aChar6099 == 's';
	}

}
