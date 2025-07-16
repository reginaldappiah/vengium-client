package com.jagex;/* Class493 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class493 {
	public int anInt6085;
	public int anInt6086;
	public int anInt6087;
	public int anInt6088 = 0;

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
			if (opcode == 1)
				anInt6088 = buffer.readUByte() * 248827265;
			else if (2 == opcode)
				anInt6087 = buffer.readUShort() * 258319417;
			else if (3 == opcode)
				anInt6085 = buffer.readUShort() * -819060847;
			else if (opcode == 4)
				anInt6086 = buffer.readShort() * -1244481247;
	}

	Class493() {
		anInt6086 = 0;
		anInt6085 = 1895598080;
		anInt6087 = 757188608;
	}

}
