package com.jagex;/* Class217 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.maths.Matrix43f;

public class Vector3f {
	public float x;
	static int anInt2452;
	static int anInt2453;
	public float z;
	public float y;
	static Vector3f[] vector;

	static {
		new Vector3f(0.0F, 0.0F, 0.0F);
		vector = new Vector3f[0];
	}

	public static Vector3f createVector3f(float x, float y, float z) {
		synchronized (vector) {
			if (anInt2453 == 0) {
				Vector3f vector3f = new Vector3f(x, y, z);
				return vector3f;
			}
			vector[--anInt2453].setVector3f(x, y, z);
			Vector3f vector3f = vector[anInt2453];
			return vector3f;
		}
	}

	public static Vector3f method2005(Vector3f vector3f) {
		synchronized (vector) {
			if (anInt2453 == 0) {
				Vector3f class217_2_ = new Vector3f(vector3f);
				return class217_2_;
			}
			vector[--anInt2453].setVector3fOfficial(vector3f);
			Vector3f class217_3_ = vector[anInt2453];
			return class217_3_;
		}
	}

	public void cache() {
		synchronized (vector) {
			if (anInt2453 < anInt2452 - 1)
				vector[anInt2453++] = this;
		}
	}

	public Vector3f(float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public void setVector3f(float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	final void getNegativeVector3f() {
		this.x = -x;
		this.y = -y;
		this.z = -z;
	}

	final void addVector3f(Vector3f vector3f) {
		this.x += vector3f.x;
		this.y += vector3f.y;
		this.z += vector3f.z;
	}

	public final void negateVector3f(float x, float y, float z) {
		this.x -= x;
		this.y -= y;
		this.z -= z;
	}

	public static final Vector3f method2011(Vector3f class217, Vector3f class217_11_) {
		Vector3f class217_12_ = method2005(class217);
		class217_12_.method2015(class217_11_);
		return class217_12_;
	}

	public final float method2012() {
		return (float) Math.sqrt((double) (x * x + y * y + z * z));
	}

	public Vector3f() {
		/* empty */
	}

	Vector3f(Vector3f class217_13_) {
		x = class217_13_.x;
		y = class217_13_.y;
		z = class217_13_.z;
	}

	public void setVector3fOfficial(Vector3f vector3f) {
		setVector3f(vector3f.x, vector3f.y, vector3f.z);
	}

	public String toString() {
		return new StringBuilder().append(x).append(", ").append(y).append(", ").append(z).toString();
	}

	final void method2014(Quaternion quaternion) {
		Quaternion quaternion_15_ = Quaternion.method2020(x, y, z, 0.0F);
		Quaternion quaternion_16_ = Quaternion.method2025(quaternion);
		Quaternion quaternion_17_ = Quaternion.method2028(quaternion_16_, quaternion_15_);
		quaternion_17_.method2026(quaternion);
		setVector3f(quaternion_17_.aFloat2461, quaternion_17_.aFloat2458, quaternion_17_.aFloat2462);
		quaternion_15_.method2029();
		quaternion_16_.method2029();
		quaternion_17_.method2029();
	}

	final void method2015(Vector3f class217_18_) {
		x -= class217_18_.x;
		y -= class217_18_.y;
		z -= class217_18_.z;
	}

	public final void method2016(Matrix43f matrix43f) {
		float f = x;
		float f_19_ = y;
		x = (matrix43f.aFloat2494 * f + matrix43f.aFloat2496 * f_19_ + matrix43f.aFloat2499 * z + matrix43f.aFloat2492);
		y = (matrix43f.aFloat2502 * f + matrix43f.aFloat2497 * f_19_ + matrix43f.aFloat2500 * z + matrix43f.aFloat2503);
		z = (matrix43f.aFloat2495 * f + matrix43f.aFloat2498 * f_19_ + matrix43f.aFloat2501 * z + matrix43f.aFloat2493);
	}

	public static void initPool(int i) {
		anInt2452 = i;
		vector = new Vector3f[i];
		anInt2453 = 0;
	}

	public final void method2018(Matrix43f class222) {
		float f = x;
		float f_20_ = y;
		x = (class222.aFloat2494 * f + class222.aFloat2496 * f_20_ + class222.aFloat2499 * z);
		y = (class222.aFloat2502 * f + class222.aFloat2497 * f_20_ + class222.aFloat2500 * z);
		z = (class222.aFloat2495 * f + class222.aFloat2498 * f_20_ + class222.aFloat2501 * z);
	}
}
