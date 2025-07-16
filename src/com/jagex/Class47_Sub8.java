package com.jagex;/* Class47_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class47_Sub8 extends Class47 {
	float aFloat6798;
	int anInt6799;
	Class39 aClass39_6802;
	float[] aFloatArray6803;
	Class28 aClass28_6805;
	Class45 aClass45_6806;
	static float[] aFloatArray6807 = new float[4];

	boolean method501() {
		return true;
	}

	void method525() {
		this.aClass28_6805 = new Class28(this.openGLGraphicsToolkit, 2);
		this.aClass28_6805.method405(0);
		this.openGLGraphicsToolkit.method5255(1);
		this.openGLGraphicsToolkit.method5273(-16777216);
		this.openGLGraphicsToolkit.method5258(260, 7681);
		this.openGLGraphicsToolkit.method5286(0, 34166, 770);
		this.openGLGraphicsToolkit.method5255(0);
		OpenGL.glBindProgramARB(34336, this.aClass39_6802.program);
		OpenGL.glEnable(34336);
		this.aClass28_6805.method403();
		this.aClass28_6805.method405(1);
		this.openGLGraphicsToolkit.method5255(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		this.openGLGraphicsToolkit.method5243(0);
		this.openGLGraphicsToolkit.method5286(0, 5890, 770);
		this.openGLGraphicsToolkit.method5255(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.aClass28_6805.method403();
	}

	void method505(boolean bool) {
		if (this.aClass28_6805 != null) {
			this.aClass28_6805.method404('\0');
			this.openGLGraphicsToolkit.method5255(1);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadMatrixf((this.openGLGraphicsToolkit.aMatrix4f_8089.aFloatArray2594), 0);
			OpenGL.glMatrixMode(5888);
			this.openGLGraphicsToolkit.method5255(0);
			if (this.anInt6799 != (this.openGLGraphicsToolkit.anInt8062)) {
				int i = (this.openGLGraphicsToolkit.anInt8062 % 5000 * 128 / 5000);
				for (int i_0_ = 0; i_0_ < 64; i_0_++) {
					OpenGL.glProgramLocalParameter4fvARB(34336, i_0_, (this.aFloatArray6803), i);
					i += 2;
				}
				if (this.aClass45_6806.aBoolean480)
					this.aFloat6798 = (float) ((this.openGLGraphicsToolkit.anInt8062) % 4000) / 4000.0F;
				else
					OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
				this.anInt6799 = this.openGLGraphicsToolkit.anInt8062;
			}
		}
	}

	void method504() {
		if (this.aClass28_6805 != null) {
			this.aClass28_6805.method404('\001');
			this.openGLGraphicsToolkit.method5255(1);
			this.openGLGraphicsToolkit.method5256(null);
			this.openGLGraphicsToolkit.method5255(0);
		}
	}

	void method503(int i, int i_1_) {
		if (this.aClass28_6805 != null) {
			this.openGLGraphicsToolkit.method5255(1);
			if ((i & 0x80) == 0) {
				if ((i_1_ & 0x1) == 1) {
					if (!this.aClass45_6806.aBoolean480) {
						int i_2_ = ((this.openGLGraphicsToolkit.anInt8062) % 4000 * 16 / 4000);
						this.openGLGraphicsToolkit.method5256(this.aClass45_6806.aClass30_Sub2Array487[i_2_]);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
					} else {
						this.openGLGraphicsToolkit.method5256(this.aClass45_6806.aClass30_Sub4_482);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat6798, 0.0F, 0.0F, 1.0F);
					}
				} else {
					if (this.aClass45_6806.aBoolean480)
						this.openGLGraphicsToolkit.method5256(this.aClass45_6806.aClass30_Sub4_482);
					else
						this.openGLGraphicsToolkit.method5256(this.aClass45_6806.aClass30_Sub2Array487[0]);
					OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
				}
			} else
				this.openGLGraphicsToolkit.method5256(null);
			this.openGLGraphicsToolkit.method5255(0);
			if ((i & 0x40) == 0) {
				aFloatArray6807[0] = (this.openGLGraphicsToolkit.aFloat8130 * this.openGLGraphicsToolkit.red);
				aFloatArray6807[1] = (this.openGLGraphicsToolkit.aFloat8130 * this.openGLGraphicsToolkit.green);
				aFloatArray6807[2] = (this.openGLGraphicsToolkit.aFloat8130 * this.openGLGraphicsToolkit.blue);
				OpenGL.glProgramLocalParameter4fvARB(34336, 66, aFloatArray6807, 0);
			} else
				OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
			int i_3_ = i & 0x3;
			if (i_3_ == 2)
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
			else if (i_3_ == 3)
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
			else
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	void method518(boolean bool) {
		/* empty */
	}

	void method500(Class30 class30, int i) {
		this.openGLGraphicsToolkit.method5256(class30);
		this.openGLGraphicsToolkit.method5243(i);
	}

	Class47_Sub8(OpenGLGraphicsToolkit openGLGraphicsToolkit, Class45 class45) {
		super(openGLGraphicsToolkit);
		this.aClass45_6806 = class45;
		if ((this.openGLGraphicsToolkit.aBoolean8039) && (this.openGLGraphicsToolkit.anInt8165) >= 2) {
			this.aClass39_6802 = (Class39.method477(this.openGLGraphicsToolkit, 34336, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.posX, mvMatrix[0], iPos;\nDP4   viewPos.posY, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.posX, viewPos.z;\nDP4   worldPos.posX, ivMatrix[0], viewPos;\nDP4   worldPos.posY, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.posX, worldPos.posX, worldPos.z;SUB   noise.posY, worldPos.z, worldPos.posX;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.posX, noise.posX;\nMOV   noise.posX, fNoise[noiseAddr.posX].posX;\nARL   noiseAddr.posX, noise.posY;\nMOV   noise.posY, fNoise[noiseAddr.posX].posY;\nMUL   noise, noise, turbulence.posX;\nDP4   texCoord.posX, texMatrix[0], iTexCoord;\nDP4   texCoord.posY, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND"));
			if (this.aClass39_6802 != null) {
				int[][] is = Class381.method4684(64, 256, 0, 4, 4, 3, 0.4F, false);
				int[][] is_10_ = Class381.method4684(64, 256, 8, 4, 4, 3, 0.4F, false);
				int i = 0;
				this.aFloatArray6803 = new float[32768];
				for (int i_11_ = 0; i_11_ < 256; i_11_++) {
					int[] is_12_ = is[i_11_];
					int[] is_13_ = is_10_[i_11_];
					for (int i_14_ = 0; i_14_ < 64; i_14_++) {
						this.aFloatArray6803[i++] = (float) is_12_[i_14_] / 4096.0F;
						this.aFloatArray6803[i++] = (float) is_13_[i_14_] / 4096.0F;
					}
				}
				method525();
			}
		}
	}

}
