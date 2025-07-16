package com.jagex;/* Class298_Sub51_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class NPCWidget extends Widget {
	int entityIndex;

	public NPCWidget(int interfaceID, int clipped, int entityIndex) {
		super(interfaceID, clipped);
		this.entityIndex = entityIndex * -378595487;
	}

	public boolean method3573() {
			ObjectNode node = ((ObjectNode) (GameClient.entityList.get((long) (119655585 * this.entityIndex))));
			if (node != null) {
				Class62.method729(CS2Context.aClass502_6728, -1617025021 * interfaceID, -1, ((Entity) node.nodeObject), (this.entityIndex * 119655585));
				return true;
			}
			return false;
	}
}
