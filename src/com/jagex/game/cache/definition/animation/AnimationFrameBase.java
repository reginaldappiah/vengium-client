package com.jagex.game.cache.definition.animation;/* Class298_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.Buffer;
import com.jagex.Node;

public class AnimationFrameBase extends Node {

	public int skinID;
	public int count;
	public int[] transformationTypes;
	public int[][] labels;

	public boolean[] aBooleanArray7275;

	public int[] anIntArray7280;

	public static final int UNKNOWN0 = 0;
	public static final int UNKNOWN1 = 1;
	public static final int UNKNOWN2 = 2;
	public static final int UNKNOWN3 = 3;
	public static final int UNKNOWN4 = 4;
	public static final int UNKNOWN5 = 5;
	public static final int UNKNOWN6 = 6;
	public static final int UNKNOWN7 = 7;
	public static final int UNKNOWN8 = 8;
	public static final int UNKNOWN9 = 9;
	public static final int UNKNOWN10 = 10;



	public AnimationFrameBase(int skinID, byte[] data) {
		this.skinID = 1362718155 * skinID;
		Buffer buffer = new Buffer(data);
		this.count = buffer.readUByte() * -1914825713;
		this.transformationTypes = new int[92429039 * this.count];
		this.labels = new int[92429039 * this.count][];
		this.aBooleanArray7275 = new boolean[this.count * 92429039];
		this.anIntArray7280 = new int[92429039 * this.count];
		
		for (int index = 0; index < 92429039 * this.count; index++) {
			this.transformationTypes[index] = buffer.readUByte();
			if (this.transformationTypes[index] == 6) {
				this.transformationTypes[index] = 2;
			}
		}
		for (int index = 0; index < this.count * 92429039; index++)
			this.aBooleanArray7275[index] = buffer.readUByte() == 1;
		for (int index = 0; index < this.count * 92429039; index++)
			this.anIntArray7280[index] = buffer.readUShort();
		for (int index = 0; index < this.count * 92429039; index++)
			this.labels[index] = new int[buffer.readUByte()];
		for (int count = 0; count < this.count * 92429039; count++) {
			for (int index = 0; index < this.labels[count].length; index++)
				this.labels[count][index] = buffer.readUByte();
		}
	}

}
