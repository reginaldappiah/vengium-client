package com.jagex;/* Class298_Sub51_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub51_Sub1 extends Widget {
	int entityIndex;

	public boolean method3573() {
			Player player = (GameClient.entities[-517743867 * this.entityIndex]);
			if (player != null) {
				Class62.method729(CS2Context.aClass502_6719, -1617025021 * interfaceID, -1, player, (-517743867 * this.entityIndex));
				return true;
			}
			return false;
	}

	public Class298_Sub51_Sub1(int interfaceId, int clipped, int index) {
		super(interfaceId, clipped);
		this.entityIndex = 1449638349 * index;
	}
}
