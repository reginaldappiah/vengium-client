package com.jagex;/* Class417 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class EnvironmentContext {
	int maximumMemory;
	int availableCPU;
	boolean aBoolean5338;

	EnvironmentContext(int maximumMemory, int availableCPU, boolean bool) {
		this.maximumMemory = 752250551 * maximumMemory;
		this.availableCPU = availableCPU * 1840099775;
		this.aBoolean5338 = bool;
	}

	public int getAvailableCPU() {
			return 839597631 * this.availableCPU;
	}

	public boolean method5593() {
			return this.aBoolean5338;
	}

	public int getMaximumMemory() {
			return -1521758457 * this.maximumMemory;
	}

}
