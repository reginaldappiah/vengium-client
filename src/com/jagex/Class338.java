package com.jagex;/* Class338 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;
import java.util.Arrays;

public class Class338 {

	public static byte[] unwrapBuffer(Object object, boolean bool) {
			if (object == null)
				return null;
			if (object instanceof byte[]) {
				byte[] is = (byte[]) object;
				if (bool)
					return Arrays.copyOf(is, is.length);
				return is;
			}
			if (object instanceof ByteBuffer) {
				ByteBuffer bytebuffer = (ByteBuffer) object;
				byte[] is = new byte[bytebuffer.capacity()];
				bytebuffer.position(0);
				bytebuffer.get(is);
				return is;
			}
			throw new IllegalArgumentException();
	}

}
