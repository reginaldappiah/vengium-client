package com.jagex;/* Class161_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.maths.Matrix4f;

public class Class161_Sub1_Sub1 extends Class161_Sub1 {
	ShaderProgramToolkit waterfall2D;
	ShaderProgram time;
	ShaderProgram billowSampler3D;
	public Matrix4f aMatrix4f_9121;
	Class159 aClass159_9122;
	ShaderProgram wvpMatrix;
	public Matrix4f aMatrix4f_9124 = new Matrix4f();
	ShaderProgram worldMatrix;
	ShaderProgram vGenerationPlane;
	ShaderProgram uGenerationPlane;
	float[] aFloatArray9128;
	float[] aFloatArray9129;
	ShaderProgramToolkit waterfall3D;
	float aFloat9131;
	public int anInt9132;
	public int anInt9133;
	public int anInt9134;
	public int anInt9135;

	public void method1738(int i, int i_0_, byte i_1_) {
		try {
			float f = -5.0E-4F * (float) (1 + (i & 0x3));
			float f_2_ = 5.0E-4F * (float) ((i >> 3 & 0x3) + 1);
			float f_3_ = 0 == (i & 0x40) ? 4.8828125E-4F : 9.765625E-4F;
			boolean bool = (i & 0x80) != 0;
			if (bool) {
				this.aFloatArray9128[0] = f_3_;
				this.aFloatArray9128[1] = 0.0F;
				this.aFloatArray9128[2] = 0.0F;
				this.aFloatArray9128[3] = 0.0F;
			} else {
				this.aFloatArray9128[0] = 0.0F;
				this.aFloatArray9128[1] = 0.0F;
				this.aFloatArray9128[2] = f_3_;
				this.aFloatArray9128[3] = 0.0F;
			}
			this.aFloatArray9129[0] = 0.0F;
			this.aFloatArray9129[1] = f_3_;
			this.aFloatArray9129[2] = 0.0F;
			this.aFloatArray9129[3] = f * (float) toolkit.anInt8342 % 1.0F;
			if (!this.aClass159_9122.aBoolean1621) {
				int i_4_ = (int) ((float) toolkit.anInt8342 * f_2_ * 16.0F);
				toolkit.method5358(this.aClass159_9122.anInterface9_Impl2Array1624[i_4_ % 16]);
			} else
				this.aFloat9131 = (float) ((double) f_2_ * (double) toolkit.anInt8342 % 1.0);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("afj.ac(").append(')').toString());
		}
	}

	boolean method1736() throws Exception_Sub2 {
		this.worldMatrix = program.method1360("WorldMatrix");
		this.wvpMatrix = program.method1360("WVPMatrix");
		this.uGenerationPlane = program.method1360("UGenerationPlane");
		this.vGenerationPlane = program.method1360("VGenerationPlane");
		this.time = program.method1360("Time");
		this.billowSampler3D = program.method1360("billowSampler3D");
		if (this.aClass159_9122.aBoolean1621) {
			this.waterfall3D = program.method1327("Waterfall3D");
			program.method1331(this.waterfall3D);
		} else {
			this.waterfall2D = program.method1327("Waterfall2D");
			program.method1331(this.waterfall2D);
		}
		return true;
	}

	public void method1739(int i) {
		try {
			if (this.aClass159_9122.aBoolean1621)
				program.method1331(this.waterfall3D);
			else
				program.method1331(this.waterfall2D);
			program.method1340();
			if (this.aClass159_9122.aBoolean1621)
				program.method1341((this.billowSampler3D), 0, (this.aClass159_9122.anInterface9_Impl3_1625));
			program.method1368((this.worldMatrix), aMatrix4f_9121, 600012267);
			program.method1368((this.wvpMatrix), aMatrix4f_9124, 600012267);
			program.method1339(this.uGenerationPlane, new Class232(this.aFloatArray9128[0], this.aFloatArray9128[1], this.aFloatArray9128[2], this.aFloatArray9128[3]), 1385384483);
			program.method1339(this.vGenerationPlane, new Class232(this.aFloatArray9129[0], this.aFloatArray9129[1], this.aFloatArray9129[2], this.aFloatArray9129[3]), 560835049);
			program.method1339((this.time), new Class232((this.aFloat9131), 0.0F, 0.0F, 0.0F), -247168453);
			toolkit.method5392(Class187.aClass187_1907, anInt9132 * 540763355, anInt9133 * -754699637, anInt9134 * -863719041, anInt9135 * 507848871);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("afj.am(").append(')').toString());
		}
	}

	public Class161_Sub1_Sub1(NativeToolkit class_ra_sub3, Class159 class159) throws Exception_Sub2 {
		super(class_ra_sub3);
		aMatrix4f_9121 = new Matrix4f();
		this.aFloatArray9128 = new float[4];
		this.aFloatArray9129 = new float[4];
		this.aClass159_9122 = class159;
		if (this.aClass159_9122.method1704() && class_ra_sub3.method5295())
			method1725("Waterfall");
	}

	boolean method1726() throws Exception_Sub2 {
		try {
			this.worldMatrix = program.method1360("WorldMatrix");
			this.wvpMatrix = program.method1360("WVPMatrix");
			this.uGenerationPlane = program.method1360("UGenerationPlane");
			this.vGenerationPlane = program.method1360("VGenerationPlane");
			this.time = program.method1360("Time");
			this.billowSampler3D = program.method1360("billowSampler3D");
			if (this.aClass159_9122.aBoolean1621) {
				this.waterfall3D = program.method1327("Waterfall3D");
				program.method1331(this.waterfall3D);
			} else {
				this.waterfall2D = program.method1327("Waterfall2D");
				program.method1331(this.waterfall2D);
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("afj.e(").append(')').toString());
		}
	}

	static Class82 method1740(Buffer buffer) {
			int i_5_ = buffer.readUByte();
			Class516 class516 = Class516.method2436(i_5_);
			Class82 class82 = null;
			switch (class516.anInt6266 * -1646556509) {
			case 30:
				class82 = new Class82_Sub16(buffer);
				break;
			case 28:
				class82 = new Class82_Sub5(buffer);
				break;
			case 11:
				class82 = new Class82_Sub8(buffer, false);
				break;
			case 1:
				class82 = new Class82_Sub7(buffer);
				break;
			case 23:
				class82 = new Class82_Sub23(buffer);
				break;
			case 21:
				class82 = new Class82_Sub22(buffer, 0, 1);
				break;
			case 16:
				class82 = new Class82_Sub13(buffer);
				break;
			case 26:
				class82 = new Class82_Sub19_Sub2(buffer);
				break;
			case 9:
				class82 = new Class82_Sub14(buffer);
				break;
			case 12:
				class82 = new RSAKeys(buffer);
				break;
			case 8:
				class82 = new Class82_Sub22(buffer, 1, 0);
				break;
			case 2:
				class82 = new Class82_Sub12(buffer);
				break;
			case 6:
				class82 = new Class82_Sub2(buffer);
				break;
			case 14:
				class82 = new Class82_Sub22(buffer, 0, 0);
				break;
			case 4:
				class82 = new Class82_Sub20(buffer);
				break;
			case 17:
				class82 = new Class82_Sub15(buffer);
				break;
			case 10:
				class82 = new Class82_Sub3(buffer);
				break;
			case 20:
				class82 = new Class82_Sub18(buffer);
				break;
			case 13:
				class82 = new Class82_Sub22(buffer, 1, 1);
				break;
			case 25:
				class82 = new Class82_Sub21(buffer);
				break;
			case 22:
				class82 = new Class82_Sub9(buffer);
				break;
			case 29:
				class82 = new Class82_Sub17(buffer);
				break;
			case 3:
				class82 = new Class82_Sub4(buffer);
				break;
			case 5:
				class82 = new Class82_Sub8(buffer, true);
				break;
			case 24:
				class82 = new Class82_Sub10(buffer);
				break;
			case 19:
				class82 = new Class82_Sub1(buffer);
				break;
			default:
				break;
			case 15:
				class82 = new Class82_Sub11(buffer);
				break;
			case 27:
				class82 = new Class82_Sub19_Sub1(buffer);
			}
			return class82;
	}
}
