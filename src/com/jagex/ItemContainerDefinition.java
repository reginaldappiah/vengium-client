package com.jagex;/* Class298_Sub37_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class ItemContainerDefinition extends Cacheable {
	public int[] itemIds;
	static Class95 aClass95_9602;
	public int[] itemAmts;
	public int size;
	public int itemsCount = 0;

	void readOpcode(Buffer buffer, int opcode) {
		try {
			if (2 == opcode)
				size = buffer.readUShort() * -1816799395;
			else if (4 == opcode) {
				itemsCount = buffer.readUByte() * 2106966585;
				itemIds = new int[-408056823 * itemsCount];
				itemAmts = new int[-408056823 * itemsCount];
				for (int i_1_ = 0; i_1_ < itemsCount * -408056823; i_1_++) {
					itemIds[i_1_] = buffer.readUShort();
					itemAmts[i_1_] = buffer.readUShort();
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aiq.f(").append(')').toString());
		}
	}

	void unpack(Buffer buffer) {
		try {
			for (;;) {
				int opc = buffer.readUByte();
				if (0 == opc) {
					break;
				}
				readOpcode(buffer, opc);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aiq.a(").append(')').toString());
		}
	}

	ItemContainerDefinition() {
		size = 0;
	}
}
