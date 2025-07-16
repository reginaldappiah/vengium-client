package com.jagex;/* Class130_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.maths.Matrix4f;

public class Class130_Sub2 extends Class130 {
	ShaderProgram diffuseColor;
	ShaderProgram diffuseSampler;
	Matrix4f aMatrix4f_6956 = new Matrix4f();
	ShaderProgram wvpmMatrix;
	ShaderProgram textureCoords;
	Class123 particle;

	boolean method1464(int i) throws Exception_Sub2 {
		try {
			this.particle = aClass_ra_Sub3_1495.method5297("Particle");
			this.wvpmMatrix = this.particle.method1360("WVPMatrix");
			this.diffuseSampler = this.particle.method1360("DiffuseSampler");
			this.textureCoords = this.particle.method1360("TexCoordMatrix");
			this.diffuseColor = this.particle.method1360("DiffuseColour");
			this.particle.method1331(this.particle.method1330(-1437671487));
			return true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("yx.t(").append(')').toString());
		}
	}

	public void method1452(Matrix4f matrix4f) {
		try {
			this.aMatrix4f_6956.method2142(matrix4f);
			this.aMatrix4f_6956.method2144(aClass_ra_Sub3_1495.aMatrix4f_8251);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("yx.a(").append(')').toString());
		}
	}

	public void method1460() {
		method1465();
		aClass_ra_Sub3_1495.method5389();
	}

	public void method1451() {
		try {
			method1465();
			aClass_ra_Sub3_1495.method5389();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("yx.b(").append(')').toString());
		}
	}

	public void method1455(Matrix4f matrix4f) {
		this.aMatrix4f_6956.method2142(matrix4f);
		this.aMatrix4f_6956.method2144(aClass_ra_Sub3_1495.aMatrix4f_8251);
	}

	public void method1454(Matrix4f matrix4f) {
		this.aMatrix4f_6956.method2142(matrix4f);
		this.aMatrix4f_6956.method2144(aClass_ra_Sub3_1495.aMatrix4f_8251);
	}

	void method1465() {
			this.particle.method1331(this.particle.method1330(-1437671487));
			this.particle.method1340();
			this.particle.method1341(this.diffuseSampler, 0, anInterface9_Impl2_1492);
			this.particle.method1368(this.wvpmMatrix, this.aMatrix4f_6956, 600012267);
			this.particle.method1337(this.textureCoords, aMatrix4f_1494, (byte) 67);
			this.particle.setProgramColors(this.diffuseColor, colorValue);
	}

	public void method1458(Matrix4f matrix4f) {
		this.aMatrix4f_6956.method2142(matrix4f);
		this.aMatrix4f_6956.method2144(aClass_ra_Sub3_1495.aMatrix4f_8251);
	}

	public void method1457(int i) {
		method1465();
		aClass_ra_Sub3_1495.method5392(Class187.aClass187_1907, 0, 4 * i, 0, 2 * i);
	}

	public void method1449(int i) {
		method1465();
		aClass_ra_Sub3_1495.method5392(Class187.aClass187_1907, 0, 4 * i, 0, 2 * i);
	}

	public void method1453(int i) {
		method1465();
		aClass_ra_Sub3_1495.method5392(Class187.aClass187_1907, 0, 4 * i, 0, 2 * i);
	}

	public void method1459() {
		method1465();
		aClass_ra_Sub3_1495.method5389();
	}

	public void method1448(Matrix4f matrix4f) {
		this.aMatrix4f_6956.method2142(matrix4f);
		this.aMatrix4f_6956.method2144(aClass_ra_Sub3_1495.aMatrix4f_8251);
	}

	public void method1461() {
		method1465();
		aClass_ra_Sub3_1495.method5389();
	}

	public void method1462() {
		method1465();
		aClass_ra_Sub3_1495.method5389();
	}

	public Class130_Sub2(NativeToolkit class_ra_sub3) throws Exception_Sub2 {
		super(class_ra_sub3);
		method1464(34022465);
	}

	public void method1450(int i) {
		try {
			method1465();
			aClass_ra_Sub3_1495.method5392(Class187.aClass187_1907, 0, 4 * i, 0, 2 * i);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("yx.f(").append(')').toString());
		}
	}

	public void method1456(int i) {
		method1465();
		aClass_ra_Sub3_1495.method5392(Class187.aClass187_1907, 0, 4 * i, 0, 2 * i);
	}
}
