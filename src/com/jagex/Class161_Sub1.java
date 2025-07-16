package com.jagex;/* Class161_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.maths.Matrix43f;
import com.jagex.maths.Matrix4f;

public abstract class Class161_Sub1 extends Class161 {
	ShaderProgram viewMatrix;
	ShaderProgram textureMatrix;
	static int anInt7031 = 16;
	static int anInt7032 = 4;
	protected Class123 program;
	ShaderProgram aClass298_Sub31_Sub1_7034;
	float[] aFloatArray7035 = new float[3];
	ShaderProgram modeViewProjectionMatrix;
	ShaderProgram viewProjectionMatrix;
	ShaderProgram eyePosition;
	ShaderProgram eyePositionOS;
	ShaderProgram sunDirectionOS;
	ShaderProgram ambientColor;
	ShaderProgram sunColor;
	ShaderProgram modelViewMatrix;
	ShaderProgram sunDirection;
	ShaderProgram antiSunColor;
	static int anInt7046 = 1;
	static int anInt7047 = 2;
	ShaderProgram projectionMatrix;
	int[] anIntArray7049;
	static int anInt7050 = 8;
	static int anInt7051 = 32;
	ShaderProgram sunExponent;
	static int anInt7053 = 128;
	int anInt7054;
	ShaderProgram modelMatrix;
	static Matrix4f aMatrix4f_7056 = new Matrix4f();
	Matrix4f[] aMatrix4fArray7057;
	static int anInt7058 = 64;

	boolean method1725(String string) throws Exception_Sub2 {
		program = toolkit.method5297(string);
		if (program == null)
			throw new Exception_Sub2("");
		this.textureMatrix = program.method1351("textureMatrix");
		this.modelMatrix = program.method1351("modelMatrix");
		this.viewMatrix = program.method1351("viewMatrix");
		this.projectionMatrix = program.method1351("projectionMatrix");
		this.modelViewMatrix = program.method1351("modelViewMatrix");
		this.modeViewProjectionMatrix = program.method1351("modelViewProjectionMatrix");
		this.viewProjectionMatrix = program.method1351("viewProjectionMatrix");
		this.ambientColor= program.method1351("ambientColour");
		this.sunDirection = program.method1351("sunDirection");
		this.sunColor = program.method1351("sunColour");
		this.antiSunColor = program.method1351("antiSunColour");
		this.sunExponent = program.method1351("sunExponent");
		this.eyePosition = program.method1351("eyePosition");
		this.eyePositionOS = program.method1351("eyePositionOS");
		this.sunDirectionOS = program.method1351("sunDirectionOS");
		if (!method1726()) {
			program = null;
			this.textureMatrix = null;
			this.modelMatrix = null;
			this.viewMatrix = null;
			this.projectionMatrix = null;
			this.modelViewMatrix = null;
			this.modeViewProjectionMatrix = null;
			this.viewProjectionMatrix = null;
			this.ambientColor = null;
			this.sunDirection = null;
			this.sunColor = null;
			this.antiSunColor = null;
			this.sunExponent = null;
			this.eyePosition = null;
			this.eyePositionOS = null;
			this.sunDirectionOS = null;
			return false;
		}
		if (program.method1332() == null) {
			ShaderProgramToolkit shaderProgramToolkit = program.method1330(-1437671487);
			if (shaderProgramToolkit == null)
				throw new Exception_Sub2(new StringBuilder().append(program.method1325(232845756)).append("").toString());
			program.method1331(shaderProgramToolkit);
		}
		this.anInt7054 = program.method1328();
		this.anIntArray7049 = new int[this.anInt7054];
		return true;
	}

	abstract boolean method1726() throws Exception_Sub2;

	void method1713() {
		program.method1340();
		this.anIntArray7049[program.method1333(1713213788)] = -1;
		method1733(0);
		method1735();
	}

	Class161_Sub1(NativeToolkit toolkit) {
		super(toolkit);
		new Matrix43f();
		this.aMatrix4fArray7057 = new Matrix4f[this.toolkit.anInt8347];
		for (int i = 0; i < this.toolkit.anInt8347; i++)
			this.aMatrix4fArray7057[i] = new Matrix4f();
	}

	void method1727(Matrix4f matrix4f) {
		if (program != null && program.method1374() && toolkit.method5386() == 0) {
			int i = program.method1333(1799039973);
			if ((this.anIntArray7049[i] & 0x80) != 0 && this.textureMatrix != null) {
				program.method1337((this.textureMatrix), matrix4f, (byte) 61);
				this.anIntArray7049[i] &= ~0x80;
			}
		}
	}

	void method1718() {
		method1731(Matrix43f.aClass222_2504);
	}

	void method1714() {
		if (program != null)
			program.method1372();
	}

	void method1728(int i, Matrix43f class222) {
		if (this.sunDirectionOS != null) {
			float[] fs = { toolkit.aFloatArray8283[0], toolkit.aFloatArray8283[1], toolkit.aFloatArray8283[2] };
			class222.method2075(fs);
			program.method1334((this.sunDirectionOS), fs[0], fs[1], fs[2]);
		}
	}

	void method1729(boolean bool) {
		if (program != null && program.method1374()) {
			if (this.ambientColor != null)
				program.method1334((this.ambientColor), (toolkit.aFloat8362 * toolkit.aFloat8291), (toolkit.aFloat8289 * toolkit.aFloat8291), (toolkit.aFloat8290 * toolkit.aFloat8291));
			if (this.sunDirection != null)
				program.method1334(this.sunDirection, toolkit.aFloatArray8283[0], toolkit.aFloatArray8283[1], toolkit.aFloatArray8283[2]);
			if (this.sunColor != null)
				program.method1334((this.sunColor), (toolkit.aFloat8362 * toolkit.aFloat8364), (toolkit.aFloat8289 * toolkit.aFloat8364), (toolkit.aFloat8290 * toolkit.aFloat8364));
			if (this.antiSunColor != null)
				program.method1334((this.antiSunColor), (-toolkit.aFloat8362 * toolkit.aFloat8293), (-toolkit.aFloat8289 * toolkit.aFloat8293), (-toolkit.aFloat8290 * toolkit.aFloat8293));
			if (this.sunExponent != null)
				program.method1335((this.sunExponent), 64.0F + Math.abs(toolkit.aFloatArray8283[1]) * 928.0F, 1825088849);
		}
	}

	void method1723() {
		/* empty */
	}

	void method1730(int i) {
		for (int i_0_ = 0; i_0_ < this.anInt7054; i_0_++)
			this.anIntArray7049[i_0_] |= 128 << i;
	}

	void method1731(Matrix43f class222) {
		Matrix4f matrix4f = toolkit.aMatrix4f_8236;
		matrix4f.method2145(class222);
		int i = program.method1333(1366764376);
		if (this.modelMatrix != null) {
			program.method1368((this.modelMatrix), matrix4f, 600012267);
			this.anIntArray7049[i] &= ~0x1;
		}
		if (this.modelViewMatrix != null) {
			aMatrix4f_7056.method2143(matrix4f, toolkit.method5328());
			program.method1368((this.modelViewMatrix), aMatrix4f_7056, 600012267);
			this.anIntArray7049[i] &= ~0x10;
		}
		if (this.modeViewProjectionMatrix != null) {
			aMatrix4f_7056.method2143(matrix4f, toolkit.method5334());
			program.method1368((this.modeViewProjectionMatrix), aMatrix4f_7056, 600012267);
			this.anIntArray7049[i] &= ~0x20;
		}
		method1737(i, class222);
		method1728(i, class222);
	}

	void method1732() {
		if (program != null && program.method1374()) {
			int i = program.method1333(1999891583);
			int i_1_ = this.anIntArray7049[i];
			if ((i_1_ & 0x1) != 0 && this.modelMatrix != null)
				program.method1368((this.modelMatrix), toolkit.method5431(), 600012267);
			if ((i_1_ & 0x2) != 0) {
				if (this.viewMatrix != null)
					program.method1368((this.viewMatrix), toolkit.method5328(), 600012267);
				if (this.eyePosition != null) {
					this.aFloatArray7035[0] = 0.0F;
					this.aFloatArray7035[1] = 0.0F;
					this.aFloatArray7035[2] = 0.0F;
					toolkit.method5044().method2066(this.aFloatArray7035[0], this.aFloatArray7035[1], this.aFloatArray7035[2], this.aFloatArray7035);
					program.method1334(this.eyePosition, this.aFloatArray7035[0], this.aFloatArray7035[1], this.aFloatArray7035[2]);
				}
			}
			if ((i_1_ & 0x10) != 0 && this.modelViewMatrix != null)
				program.method1368((this.modelViewMatrix), toolkit.method5387(), 600012267);
			if ((i_1_ & 0x8) != 0 && this.aClass298_Sub31_Sub1_7034 != null)
				program.method1368((this.aClass298_Sub31_Sub1_7034), toolkit.method5329(), 600012267);
			if ((i_1_ & 0x4) != 0 && this.projectionMatrix != null)
				program.method1368((this.projectionMatrix), toolkit.method5301(), 600012267);
			if ((i_1_ & 0x20) != 0 && this.modeViewProjectionMatrix != null) {
				aMatrix4f_7056.method2143(toolkit.method5387(), toolkit.method5301());
				program.method1368((this.modeViewProjectionMatrix), aMatrix4f_7056, 600012267);
			}
			if ((i_1_ & 0x40) != 0 && this.viewProjectionMatrix != null) {
				aMatrix4f_7056.method2143(toolkit.method5328(), toolkit.method5301());
				program.method1368((this.viewProjectionMatrix), aMatrix4f_7056, 600012267);
			}
			if (toolkit.method5386() == 0 && (this.anIntArray7049[i] & 0x80) != 0 && this.textureMatrix != null) {
				program.method1337((this.textureMatrix), toolkit.method5316(), (byte) 14);
				this.anIntArray7049[i] &= ~0x80;
			}
			this.anIntArray7049[i] = 0;
		}
	}

	void method1733(int i) {
		this.aMatrix4fArray7057[0].method2172();
		method1730(i);
	}

	void method1719() {
		program.method1340();
		this.anIntArray7049[program.method1333(1318478189)] = -1;
		method1733(0);
		method1735();
	}

	void method1720() {
		if (program != null)
			program.method1372();
	}

	void method1717() {
		if (program != null)
			program.method1372();
	}

	void method1721() {
		if (program != null)
			program.method1372();
	}

	void method1734() {
		/* empty */
	}

	void method1735() {
		method1729(toolkit.aBoolean8264);
		method1727(toolkit.method5316());
		method1732();
		method1723();
	}

	abstract boolean method1736() throws Exception_Sub2;

	void method1737(int i, Matrix43f class222) {
		if (this.eyePositionOS != null) {
			Matrix4f matrix4f = toolkit.method5329();
			float[] fs = { matrix4f.aFloatArray2594[12], matrix4f.aFloatArray2594[13], matrix4f.aFloatArray2594[14] };
			float[] fs_2_ = { 0.0F, 0.0F, 0.0F };
			matrix4f.method2168(fs_2_);
			float[] fs_3_ = { 0.0F, 0.0F, 0.0F };
			toolkit.method5044().method2077(0.0F, 0.0F, 0.0F, fs_3_);
			class222.method2069(fs);
			program.method1334((this.eyePositionOS), fs[0], fs[1], fs[2]);
		}
	}

	void method1722() {
		method1731(Matrix43f.aClass222_2504);
	}

	void method1724() {
		method1731(Matrix43f.aClass222_2504);
	}
}
