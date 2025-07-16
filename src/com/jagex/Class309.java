package com.jagex;/* Class309 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class309 {
	public final int waitForNextFrame(long updateInterval) {
			long key = method3789();
			if (key > 0L)
				IPAddress.method6060(key);
			return method3791(updateInterval);
	}

	abstract void method3788();

	abstract long method3789();

	abstract int method3791(long updateInterval);

	abstract long method3794(int i);

	Class309() {
		/* empty */
	}

}
