package com.jagex;/* Class137 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.maths.Matrix4f;

public abstract class Class137 {
	protected float aFloat1513;
	public int anInt1514;
	public Vector3f aClass217_1515;
	public float[] aFloatArray1516;
	public Interface9_Impl2 anInterface9_Impl2_1517;
	public Interface9_Impl1 anInterface9_Impl1_1518;
	public Matrix4f aMatrix4f_1519;
	protected NativeToolkit aClass_ra_Sub3_1520;
	protected float aFloat1521;
	public Vector3f aClass217_1522;
	public Class232 aClass232_1523;
	public Vector3f aClass217_1524;
	public Class232 aClass232_1525;
	public float[] aFloatArray1526 = new float[16];
	public Vector3f aClass217_1527;
	public Vector3f aClass217_1528;
	public Vector3f aClass217_1529;
	public Vector3f aClass217_1530;
	static int anInt1531 = 4;
	public int anInt1532;
	public int anInt1533;
	public int anInt1534;
	public Matrix4f aMatrix4f_1535;

	public abstract void method1503(int i);

	public abstract void method1504(boolean bool);

	public abstract void method1505(int i);

	public abstract void method1506(Matrix4f matrix4f);

	public abstract void method1507(int i);

	public abstract void method1508(int i);

	public void method1509(Class53 class53) {
		switch (class53.aByte536) {
		case 1:
			aFloat1521 = 32.0F;
			aFloat1513 = 0.5F;
			break;
		case 2:
			aFloat1521 = 4.0F;
			aFloat1513 = 0.65F;
			break;
		case 3:
			aFloat1521 = 2.0F;
			aFloat1513 = 0.8F;
			break;
		}
	}

	public abstract void method1510();

	public abstract void method1511(Matrix4f matrix4f);

	public abstract void method1512(Matrix4f matrix4f);

	public abstract void method1513(boolean bool);

	public abstract void method1514(boolean bool);

	public abstract void method1515(boolean bool);

	public abstract void method1516(int i);

	public abstract void method1517(int i);

	public abstract void method1518(int i);

	public abstract void method1519();

	public abstract void method1520(int i);

	public abstract void method1521(int i);

	Class137(NativeToolkit class_ra_sub3) {
		aFloatArray1516 = new float[16];
		aMatrix4f_1519 = new Matrix4f();
		aClass217_1530 = new Vector3f();
		aClass232_1523 = new Class232();
		aClass217_1524 = new Vector3f();
		aClass232_1525 = new Class232();
		aClass217_1522 = new Vector3f();
		aClass217_1527 = new Vector3f();
		aClass217_1528 = new Vector3f();
		aClass217_1529 = new Vector3f();
		aClass217_1515 = new Vector3f();
		aMatrix4f_1535 = new Matrix4f();
		aClass_ra_Sub3_1520 = class_ra_sub3;
	}
}
