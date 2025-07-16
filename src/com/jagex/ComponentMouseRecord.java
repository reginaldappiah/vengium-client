package com.jagex;/* Class298_Sub50_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class ComponentMouseRecord extends MouseRecord {
	static int cacheSize;
	static int cacheCapacity;
	static ComponentMouseRecord[] cache = new ComponentMouseRecord[0];
	int type;
	int mouseX;
	int mouseY;
	long timeMs;
	int rotation;

	public int getMouseType() {
		return this.type * -959647937;
	}

	public int getMouseX() {
		return this.mouseX * 658623775;
	}

	public int getMousRotation() {
		return -1495835541 * this.rotation;
	}

	public long getTimeMs() {
		return (this.timeMs * 3438655524500841893L);
	}

	public void resizeCache() {
		synchronized (cache) {
			if (2017906303 * cacheSize < cacheCapacity * 2020209463 - 1)
				cache[(cacheSize += 1787228543) * 2017906303 - 1] = this;
		}
	}

	public int getMouseY() {
		return -660333015 * this.mouseY;
	}

	ComponentMouseRecord() {
		/* empty */
	}

	static ComponentMouseRecord create(int type, int mouseX, int mouseY, long timeMs, int mouseRot) {
		synchronized (cache) {
			ComponentMouseRecord record;
			if (0 == 2017906303 * cacheSize)
				record = new ComponentMouseRecord();
			else
				record = (cache[((cacheSize -= 1787228543) * 2017906303)]);
			record.type = -435781441 * type;
			record.mouseX = mouseX * -871010593;
			record.mouseY = mouseY * -25797095;
			record.timeMs = -8923914877553624531L * timeMs;
			record.rotation = mouseRot * 1687973955;
			return record;
		}
	}
}
