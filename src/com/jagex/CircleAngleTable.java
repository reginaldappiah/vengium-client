package com.jagex;/* CircleAngleTable - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class CircleAngleTable {
	public static int[] COSINE;
	public static int anInt2475 = 16383;
	public static int anInt2476 = 14;
	public static int anInt2477 = 8192;
	public static int anInt2478 = 16384;
	public static int anInt2479 = 16383;
	public static int anInt2480 = 14;
	public static int anInt2481 = 1024;
	public static int anInt2482 = 2048;
	public static int[] SINE = new int[16384];
	public static double aDouble2484 = 2607.5945876176133;
	public static int anInt2485 = 6144;
	public static int anInt2486 = 10240;
	public static int anInt2487 = 12288;
	public static int anInt2488 = 14336;
	public static int anInt2489 = 16384;
	public static int anInt2490 = 16384;
	public static int anInt2491 = 4096;

	public static float toDegrees(int i) {
		i &= 0x3fff;
		return (float) ((double) ((float) i / 16384.0F) * 6.283185307179586);
	}

	CircleAngleTable() throws Throwable {
		throw new Error();
	}

	static {
		COSINE = new int[16384];
		double d = 3.834951969714103E-4;
		for (int index = 0; index < 16384; index++) {
			SINE[index] = (int) (16384.0 * Math.sin((double) index * d));
			COSINE[index] = (int) (16384.0 * Math.cos((double) index * d));
		}
	}
}
