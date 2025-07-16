package com.jagex;/* Class101 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class101 {
	byte[] bytes;
	int offset;

	Class101(byte[] bytes) {
		this.bytes = bytes;
		this.offset = 0;
	}

	String getString() {
			int length = getLength();
			if (length == -1)
				return null;
			if (length > 256)
				throw new RuntimeException_Sub3();
			String string = new String(this.bytes, this.offset * -999234057, length);
			this.offset += length * -786863161;
			return string;
	}

	int getLength() {
			short length = 0;
			for (int index = 0; index < 2; index++)
				length |= ((this.bytes[((this.offset += -786863161) * -999234057) - 1]) & 0xff) << index * 8;
			return length;
	}

	static final void method1081() {
			Class212.aClass212_2423.method1952();
	}
}
