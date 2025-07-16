package com.jagex;/* Class298_Sub43 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class ComponentKeyRecord extends Node implements KeyRecord {
	static int anInt6505 = -1;//TODO
	int type;
	int flags;
	int keycode;
	long time;
	char character;

    public int getType() {
			return this.type * 1490207653;
	}

	public char getCharacter() {
			return this.character;
	}

	public int getKeyCode() {
			return 122236875 * this.keycode;
	}

	public long getTime() {
			return 4761371342045314899L * this.time;
	}

	public int getFlags() {
			return 1312925659 * this.flags;
	}

    ComponentKeyRecord() {

	}

}
