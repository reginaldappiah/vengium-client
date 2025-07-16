package com.jagex;/* Interface16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public interface KeyRecord {

	int KEY_TYPED_TYPE = 3;
	int KEY_RELEASED_TYPE = 1;
	int KEY_PRESSED_TYPE = 0;

	long getTime();

	char getCharacter();

	int getKeyCode();

	int getFlags();

	int getType();
}
