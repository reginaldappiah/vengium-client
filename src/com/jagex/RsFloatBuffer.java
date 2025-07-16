package com.jagex;/* Class298_Sub53_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Stream;

public class RsFloatBuffer extends Buffer {
	void method3658(float f) {
		int i = Stream.floatToRawIntBits(f);
		buffer[(offset += 116413311) * 385051775 - 1] = (byte) (i >> 24);
		buffer[(offset += 116413311) * 385051775 - 1] = (byte) (i >> 16);
		buffer[(offset += 116413311) * 385051775 - 1] = (byte) (i >> 8);
		buffer[(offset += 116413311) * 385051775 - 1] = (byte) i;
	}

	RsFloatBuffer(int i) {
		super(i);
	}

	void method3659(float f) {
		int i = Stream.floatToRawIntBits(f);
		buffer[(offset += 116413311) * 385051775 - 1] = (byte) i;
		buffer[(offset += 116413311) * 385051775 - 1] = (byte) (i >> 8);
		buffer[(offset += 116413311) * 385051775 - 1] = (byte) (i >> 16);
		buffer[(offset += 116413311) * 385051775 - 1] = (byte) (i >> 24);
	}
}
