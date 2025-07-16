package com.jagex;/* Class323 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class KeyRecorder {

	public abstract boolean held(int index);

	public abstract KeyRecord getNext();

	public abstract void stop();

	KeyRecorder() {
	}

	public abstract void sync();

}
