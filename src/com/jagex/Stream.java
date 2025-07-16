package com.jagex;/* Class318 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.IOException;

public abstract class Stream {

	public abstract boolean isAvailable(int length) throws IOException;

	public abstract int method3857(int i) throws IOException;

	public abstract int readBytes(byte[] is, int i, int i_1_) throws IOException;

	public abstract void close();

	Stream() {

	}

	public abstract void method3867(byte i);

	public abstract void method3868(byte[] is, int i, int i_7_) throws IOException;

}
