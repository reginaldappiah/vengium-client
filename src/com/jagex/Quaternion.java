package com.jagex;/* Quaternion - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Quaternion {
	static int anInt2457;
	public float aFloat2458;
	static int anInt2459;
	static Quaternion[] aQuaternionArray2460 = new Quaternion[0];
	public float aFloat2461;
	public float aFloat2462;
	public float aFloat2463;

	public String toString() {
		return new StringBuilder().append(this.aFloat2461).append(",").append(this.aFloat2458).append(",").append(this.aFloat2462).append(",").append(this.aFloat2463).toString();
	}

	public static Quaternion method2019() {
		synchronized (aQuaternionArray2460) {
			if (anInt2459 == 0) {
				Quaternion quaternion = new Quaternion();
				return quaternion;
			}
			aQuaternionArray2460[--anInt2459].method2030();
			Quaternion quaternion = aQuaternionArray2460[anInt2459];
			return quaternion;
		}
	}

	static Quaternion method2020(float f, float f_0_, float f_1_, float f_2_) {
		synchronized (aQuaternionArray2460) {
			if (anInt2459 == 0) {
				Quaternion quaternion = new Quaternion(f, f_0_, f_1_, f_2_);
				return quaternion;
			}
			aQuaternionArray2460[--anInt2459].method2021(f, f_0_, f_1_, f_2_);
			Quaternion quaternion = aQuaternionArray2460[anInt2459];
			return quaternion;
		}
	}

	public Quaternion() {
		method2030();
	}

	Quaternion(float f, float f_3_, float f_4_, float f_5_) {
		method2021(f, f_3_, f_4_, f_5_);
	}

	Quaternion(Quaternion quaternion_6_) {
		method2022(quaternion_6_);
	}

	void method2021(float f, float f_7_, float f_8_, float f_9_) {
		this.aFloat2461 = f;
		this.aFloat2458 = f_7_;
		this.aFloat2462 = f_8_;
		this.aFloat2463 = f_9_;
	}

	public void method2022(Quaternion quaternion_10_) {
		this.aFloat2461 = quaternion_10_.aFloat2461;
		this.aFloat2458 = quaternion_10_.aFloat2458;
		this.aFloat2462 = quaternion_10_.aFloat2462;
		this.aFloat2463 = quaternion_10_.aFloat2463;
	}

	public void method2023(float f, float f_11_, float f_12_, float f_13_) {
		float f_14_ = (float) Math.sin((double) (f_13_ * 0.5F));
		float f_15_ = (float) Math.cos((double) (f_13_ * 0.5F));
		this.aFloat2461 = f * f_14_;
		this.aFloat2458 = f_11_ * f_14_;
		this.aFloat2462 = f_12_ * f_14_;
		this.aFloat2463 = f_15_;
	}

	final void method2024() {
		this.aFloat2461 = -this.aFloat2461;
		this.aFloat2458 = -this.aFloat2458;
		this.aFloat2462 = -this.aFloat2462;
	}

	static final Quaternion method2025(Quaternion quaternion) {
		Quaternion quaternion_16_ = method2031(quaternion);
		quaternion_16_.method2024();
		return quaternion_16_;
	}

	public final void method2026(Quaternion quaternion_17_) {
		method2021(((quaternion_17_.aFloat2463 * this.aFloat2461) + (quaternion_17_.aFloat2461 * this.aFloat2463) + (quaternion_17_.aFloat2458 * this.aFloat2462) - (quaternion_17_.aFloat2462 * this.aFloat2458)), ((quaternion_17_.aFloat2463 * this.aFloat2458) - (quaternion_17_.aFloat2461 * this.aFloat2462) + (quaternion_17_.aFloat2458 * this.aFloat2463) + (quaternion_17_.aFloat2462 * this.aFloat2461)), ((quaternion_17_.aFloat2463 * this.aFloat2462) + (quaternion_17_.aFloat2461 * this.aFloat2458) - (quaternion_17_.aFloat2458 * this.aFloat2461) + (quaternion_17_.aFloat2462 * this.aFloat2463)), ((quaternion_17_.aFloat2463 * this.aFloat2463) - (quaternion_17_.aFloat2461 * this.aFloat2461) - (quaternion_17_.aFloat2458 * this.aFloat2458) - (quaternion_17_.aFloat2462 * this.aFloat2462)));
	}

	public static void initializePool(int i) {
		anInt2457 = i;
		aQuaternionArray2460 = new Quaternion[i];
		anInt2459 = 0;
	}

	static final Quaternion method2028(Quaternion quaternion, Quaternion quaternion_18_) {
		Quaternion quaternion_19_ = method2031(quaternion);
		quaternion_19_.method2026(quaternion_18_);
		return quaternion_19_;
	}

	public void method2029() {
		synchronized (aQuaternionArray2460) {
			if (anInt2459 < anInt2457 - 1)
				aQuaternionArray2460[anInt2459++] = this;
		}
	}

	static {
		new Quaternion();
	}

	final void method2030() {
		this.aFloat2462 = 0.0F;
		this.aFloat2458 = 0.0F;
		this.aFloat2461 = 0.0F;
		this.aFloat2463 = 1.0F;
	}

	static Quaternion method2031(Quaternion quaternion) {
		synchronized (aQuaternionArray2460) {
			if (anInt2459 == 0) {
				Quaternion quaternion_20_ = new Quaternion(quaternion);
				return quaternion_20_;
			}
			aQuaternionArray2460[--anInt2459].method2022(quaternion);
			Quaternion quaternion_21_ = aQuaternionArray2460[anInt2459];
			return quaternion_21_;
		}
	}

	public void method2032(float f, float f_22_, float f_23_) {
		method2023(0.0F, 1.0F, 0.0F, f);
		Quaternion quaternion_24_ = method2019();
		quaternion_24_.method2023(1.0F, 0.0F, 0.0F, f_22_);
		method2026(quaternion_24_);
		quaternion_24_.method2023(0.0F, 0.0F, 1.0F, f_23_);
		method2026(quaternion_24_);
		quaternion_24_.method2029();
	}
}
