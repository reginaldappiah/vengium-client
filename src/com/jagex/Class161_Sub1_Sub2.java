package com.jagex;/* Class161_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.maths.Matrix4f;

public class Class161_Sub1_Sub2 extends Class161_Sub1 {
	ShaderProgram sunDirection;
	ShaderProgram normalSampler;
	ShaderProgram wvp;
	public Vector3f aClass217_9139;
	public Matrix4f aMatrix4f_9140 = new Matrix4f();
	ShaderProgram textureCoordinates;
	public Matrix4f aMatrix4f_9142 = new Matrix4f();
	ShaderProgram eye;
	public Vector3f aClass217_9144 = new Vector3f();
	public int anInt9145;
	Class232 aClass232_9146;
	Class232 aClass232_9147 = new Class232();
	ShaderProgram sunColor;
	public Vector3f aClass217_9149;
	ShaderProgram wave;
	Class232 aClass232_9151;
	ShaderProgram distanceFogColor;
	public Class232 aClass232_9153;
	ShaderProgram heightFogPlane;
	Class159 aClass159_9155;
	ShaderProgram distanceFogPlane;
	public Class232 aClass232_9157;
	public int anInt9158;
	ShaderProgram heightFogColor;
	public int anInt9160;
	float aFloat9161;
	public int anInt9162;
	public int anInt9163;
	ShaderProgram environmentSampler;
	boolean sea;

	void method1741(Matrix4f matrix4f) {
		Matrix4f matrix4f_0_ = new Matrix4f();
		matrix4f_0_.method2147(this.aFloat9161, this.aFloat9161, 1.0F, 1.0F);
		matrix4f_0_.method2143(matrix4f, matrix4f_0_);
		super.method1727(matrix4f_0_);
	}

	void method1729(boolean bool) {
		try {
			float f = 1.0F + (1.0F - Math.abs(toolkit.aFloatArray8283[1])) * 2.0F;
			float f_1_ = toolkit.aFloat8364;
			toolkit.aFloat8364 *= f;
			super.method1729(bool);
			toolkit.aFloat8364 = f_1_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("afv.l(").append(')').toString());
		}
	}

	void method1727(Matrix4f matrix4f) {
		try {
			Matrix4f matrix4f_2_ = new Matrix4f();
			matrix4f_2_.method2147(this.aFloat9161, this.aFloat9161, 1.0F, 1.0F);
			matrix4f_2_.method2143(matrix4f, matrix4f_2_);
			super.method1727(matrix4f_2_);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("afv.m(").append(')').toString());
		}
	}

	void method1742(boolean bool) {
		float f = 1.0F + ((1.0F - Math.abs(toolkit.aFloatArray8283[1])) * 2.0F);
		float f_3_ = toolkit.aFloat8364;
		toolkit.aFloat8364 *= f;
		super.method1729(bool);
		toolkit.aFloat8364 = f_3_;
	}

	void method1743(int i) {
		try {
			this.aFloat9161 = 2.4414062E-4F;
			int i_4_ = 256;
			float f = 0.3F;
			float f_5_ = 0.4F;
			float f_6_ = 0.1F;
			int i_7_ = 5;
			aMatrix4f_9142.method2147(this.aFloat9161, this.aFloat9161, this.aFloat9161, this.aFloat9161);
			this.aClass232_9147.method2135(-toolkit.aFloatArray8283[0], -toolkit.aFloatArray8283[1], -toolkit.aFloatArray8283[2], 32.0F);
			this.aClass232_9146.method2135(toolkit.aFloat8362, toolkit.aFloat8289, toolkit.aFloat8290, (float) i_7_);
			this.aClass232_9151.method2135(f_6_, f_5_, (float) i_4_, f);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("afv.am(").append(')').toString());
		}
	}

	boolean method1736() throws Exception_Sub2 {
		if (!this.aClass159_9155.method1705())
			return false;
		this.normalSampler = program.method1360("NormalSampler");
		this.environmentSampler = program.method1360("EnvMapSampler");
		this.wvp = program.method1360("WVPMatrix");
		this.textureCoordinates = program.method1360("TexCoordMatrix");
		this.eye = program.method1360("EyePosAndTime");
		this.sunDirection = program.method1360("SunDirectionAndExponent");
		this.sunColor = program.method1360("SunColourAndWaveExponent");
		this.wave = (program.method1360("WaveIntensityAndBreakWaterDepthAndOffset"));
		this.heightFogPlane = program.method1360("HeightFogPlane");
		this.heightFogColor = program.method1360("HeightFogColour");
		this.distanceFogPlane = program.method1360("DistanceFogPlane");
		this.distanceFogColor = program.method1360("DistanceFogColour");
		ShaderProgramToolkit environmentMap = program.method1327(((this.sea) ? "EnvMappedSea" : "EnvMappedWater"));
		program.method1331(environmentMap);
		return true;
	}

	void method1744(Matrix4f matrix4f) {
		Matrix4f matrix4f_8_ = new Matrix4f();
		matrix4f_8_.method2147(this.aFloat9161, this.aFloat9161, 1.0F, 1.0F);
		matrix4f_8_.method2143(matrix4f, matrix4f_8_);
		super.method1727(matrix4f_8_);
	}

	void method1745(Matrix4f matrix4f) {
		Matrix4f matrix4f_9_ = new Matrix4f();
		matrix4f_9_.method2147(this.aFloat9161, this.aFloat9161, 1.0F, 1.0F);
		matrix4f_9_.method2143(matrix4f, matrix4f_9_);
		super.method1727(matrix4f_9_);
	}

	void method1746(boolean bool) {
		float f = 1.0F + ((1.0F - Math.abs(toolkit.aFloatArray8283[1])) * 2.0F);
		float f_10_ = toolkit.aFloat8364;
		toolkit.aFloat8364 *= f;
		super.method1729(bool);
		toolkit.aFloat8364 = f_10_;
	}

	public Class161_Sub1_Sub2(NativeToolkit nativeToolkit, Class159 class159, boolean bool) throws Exception_Sub2 {
		super(nativeToolkit);
		this.aClass232_9146 = new Class232();
		this.aClass232_9151 = new Class232();
		aClass232_9153 = new Class232();
		aClass217_9149 = new Vector3f();
		aClass232_9157 = new Class232();
		aClass217_9139 = new Vector3f();
		this.aFloat9161 = 0.0F;
		new Matrix4f();
		this.aClass159_9155 = class159;
		this.sea = bool;
		if (nativeToolkit.method5295() && nativeToolkit.method5483())
			method1725("EnvMappedWater");
	}

	void method1747(boolean bool) {
		float f = 1.0F + ((1.0F - Math.abs(toolkit.aFloatArray8283[1])) * 2.0F);
		float f_11_ = toolkit.aFloat8364;
		toolkit.aFloat8364 *= f;
		super.method1729(bool);
		toolkit.aFloat8364 = f_11_;
	}

	public void setShaders() {
		method1743(1985693745);
		program.method1331(program.method1330(-1437671487));
		program.method1340();
		program.method1341((this.normalSampler), 0, (this.aClass159_9155.anInterface9_Impl3_1626));
		program.method1341((this.environmentSampler), 1, toolkit.method5321());
		program.method1368((this.wvp), aMatrix4f_9140, 600012267);
		program.method1337((this.textureCoordinates), aMatrix4f_9142, (byte) 17);
		int i_12_ = 1 << (149563177 * anInt9145 & 0x3);
		program.glColor4f((this.eye), aClass217_9144.x, aClass217_9144.y, aClass217_9144.z, (float) (i_12_ * toolkit.anInt8342 % 40000) / 40000.0F);
		program.method1339((this.sunDirection), (this.aClass232_9147), -1051400568);
		program.method1339((this.sunColor), (this.aClass232_9146), -1384576078);
		program.method1339((this.wave), (this.aClass232_9151), 642247137);
		program.method1339((this.heightFogPlane), aClass232_9153, -1615535867);
		program.method1338((this.heightFogColor), aClass217_9149, -386546877);
		program.method1339((this.distanceFogPlane), aClass232_9157, 221024078);
		program.method1338((this.distanceFogColor), aClass217_9139, -386546877);
		toolkit.method5392(Class187.aClass187_1907, -1146886737 * anInt9160, anInt9158 * -2126568899, anInt9162 * 501274325, anInt9163 * -913937851);
	}

	boolean method1726() throws Exception_Sub2 {
		if (!this.aClass159_9155.method1705())
			return false;
		this.normalSampler = program.method1360("NormalSampler");
		this.environmentSampler = program.method1360("EnvMapSampler");
		this.wvp = program.method1360("WVPMatrix");
		this.textureCoordinates = program.method1360("TexCoordMatrix");
		this.eye = program.method1360("EyePosAndTime");
		this.sunDirection = program.method1360("SunDirectionAndExponent");
		this.sunColor = program.method1360("SunColourAndWaveExponent");
		this.wave = (program.method1360("WaveIntensityAndBreakWaterDepthAndOffset"));
		this.heightFogPlane = program.method1360("HeightFogPlane");
		this.heightFogColor = program.method1360("HeightFogColour");
		this.distanceFogPlane = program.method1360("DistanceFogPlane");
		this.distanceFogColor = program.method1360("DistanceFogColour");
		ShaderProgramToolkit shaderProgramToolkit = program.method1327(((this.sea) ? "EnvMappedSea" : "EnvMappedWater"));
		program.method1331(shaderProgramToolkit);
		return true;
	}
}
