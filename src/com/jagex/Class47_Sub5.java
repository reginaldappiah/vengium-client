package com.jagex;/* Class47_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import com.jagex.maths.Matrix4f;
import jaggl.OpenGL;

public class Class47_Sub5 extends Class47 {
	static String aString6775 = "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.posX, mvMatrix[0], iPos;\nDP4   viewPos.posY, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.posX, viewPos.z, fogParams.posX;\nMUL   fogFactor.posX, fogFactor.posX, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.posY, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.posY;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.posX, pMatrix[0], viewPos;\nDP4   oPos.posY, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.posX, viewPos.z;\nDP4   oTexCoord0.posX, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.posY, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n";
	static String aString6776 = "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.posX, mvMatrix[0], iPos;\nDP4   viewPos.posY, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.posX, viewPos.z, fogParams.posX;\nMUL   fogFactor.posX, fogFactor.posX, 0.001953125;\nMAD   fogFactor.posY, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.posY;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.posX, fogFactor.posX, fogFactor.posY;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.posX, pMatrix[0], viewPos;\nDP4   oPos.posY, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.posX, viewPos.z;\nDP3   oTexCoord0.posX, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.posY, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n";
	Class39 aClass39_6777;
	static String aString6778 = "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.posX, mvMatrix[0], iPos;\nDP4   viewPos.posY, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.posX, viewPos.z, fogParams.posX;\nMUL   fogFactor.posX, fogFactor.posX, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.posY, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.posY;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.posX, mvMatrix[0], iNormal;\nDP3   viewNormal.posY, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.posX, viewNormal, state.light[0].position;\nDP3   ndotl.posY, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.posX, pMatrix[0], viewPos;\nDP4   oPos.posY, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.posX, viewPos.z;\nDP4   oTexCoord0.posX, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.posY, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n";
	boolean aBoolean6779;
	boolean aBoolean6780;
	boolean aBoolean6781;
	static String aString6782 = "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.posX, mvMatrix[0], iPos;\nDP4   viewPos.posY, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.posX, viewPos.z, fogParams.posX;\nMUL   fogFactor.posX, fogFactor.posX, 0.001953125;\nMAD   fogFactor.posY, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.posY;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.posX, fogFactor.posX, fogFactor.posY;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.posX, mvMatrix[0], iNormal;\nDP3   viewNormal.posY, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.posX, viewNormal, state.light[0].position;\nDP3   ndotl.posY, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.posX, pMatrix[0], viewPos;\nDP4   oPos.posY, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.posX, viewPos.z;\nDP3   oTexCoord0.posX, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.posY, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n";
	Class30_Sub2 aClass30_Sub2_6783;
	boolean aBoolean6784 = false;
	Class39 aClass39_6785;
	Class39 aClass39_6786;
	Class39 aClass39_6787;
	static float[] aFloatArray6788 = { 0.0F, -1.0F, 0.0F, 0.0F };

	void method518(boolean bool) {
		/* empty */
	}

	void method504() {
		if (this.aBoolean6780) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean6780 = false;
		}
		this.openGLGraphicsToolkit.method5255(1);
		this.openGLGraphicsToolkit.method5256(null);
		this.openGLGraphicsToolkit.method5258(8448, 8448);
		this.openGLGraphicsToolkit.method5259(0, 5890, 768);
		this.openGLGraphicsToolkit.method5259(2, 34166, 770);
		this.openGLGraphicsToolkit.method5286(0, 5890, 770);
		this.openGLGraphicsToolkit.method5255(0);
		if (this.aBoolean6784) {
			this.openGLGraphicsToolkit.method5259(0, 5890, 768);
			this.openGLGraphicsToolkit.method5286(0, 5890, 770);
			this.aBoolean6784 = false;
		}
	}

	void method523() {
		if (this.aBoolean6780) {
			float f = (this.openGLGraphicsToolkit.aFloat8102);
			float f_1_ = (this.openGLGraphicsToolkit.aFloat8134);
			float f_2_ = f - (f - f_1_) * 0.125F;
			float f_3_ = f - (f - f_1_) * 0.25F;
			OpenGL.glProgramLocalParameter4fARB(34336, 0, f_3_, f_2_, 256.0F / (float) ((this.openGLGraphicsToolkit.aClass78_8149.anInt725) * 1996750669), (float) ((this.openGLGraphicsToolkit.aClass78_8149.anInt727) * -1475891183) / 255.0F);
			this.openGLGraphicsToolkit.method5255(1);
			this.openGLGraphicsToolkit.method5273((this.openGLGraphicsToolkit.aClass78_8149.anInt726) * -1212608691);
			this.openGLGraphicsToolkit.method5255(0);
		}
	}

	void method500(Class30 class30, int i) {
		if (class30 == null) {
			if (!this.aBoolean6784) {
				this.openGLGraphicsToolkit.method5256(this.openGLGraphicsToolkit.aClass30_Sub2_8140);
				this.openGLGraphicsToolkit.method5243(1);
				this.openGLGraphicsToolkit.method5259(0, 34168, 768);
				this.openGLGraphicsToolkit.method5286(0, 34168, 770);
				this.aBoolean6784 = true;
			}
		} else {
			if (this.aBoolean6784) {
				this.openGLGraphicsToolkit.method5259(0, 5890, 768);
				this.openGLGraphicsToolkit.method5286(0, 5890, 770);
				this.aBoolean6784 = false;
			}
			this.openGLGraphicsToolkit.method5256(class30);
			this.openGLGraphicsToolkit.method5243(i);
		}
	}

	boolean method501() {
		return this.aBoolean6779;
	}

	Class47_Sub5(OpenGLGraphicsToolkit openGLGraphicsToolkit) {
		super(openGLGraphicsToolkit);
		if (this.openGLGraphicsToolkit.aBoolean8039) {
			this.aClass39_6787 = (Class39.method477(this.openGLGraphicsToolkit, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.posX, mvMatrix[0], iPos;\nDP4   viewPos.posY, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.posX, viewPos.z, fogParams.posX;\nMUL   fogFactor.posX, fogFactor.posX, 0.001953125;\nMAD   fogFactor.posY, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.posY;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.posX, fogFactor.posX, fogFactor.posY;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.posX, pMatrix[0], viewPos;\nDP4   oPos.posY, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.posX, viewPos.z;\nDP3   oTexCoord0.posX, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.posY, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n"));
			this.aClass39_6786 = (Class39.method477(this.openGLGraphicsToolkit, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.posX, mvMatrix[0], iPos;\nDP4   viewPos.posY, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.posX, viewPos.z, fogParams.posX;\nMUL   fogFactor.posX, fogFactor.posX, 0.001953125;\nMAD   fogFactor.posY, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.posY;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.posX, fogFactor.posX, fogFactor.posY;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.posX, mvMatrix[0], iNormal;\nDP3   viewNormal.posY, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.posX, viewNormal, state.light[0].position;\nDP3   ndotl.posY, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.posX, pMatrix[0], viewPos;\nDP4   oPos.posY, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.posX, viewPos.z;\nDP3   oTexCoord0.posX, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.posY, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n"));
			this.aClass39_6785 = (Class39.method477(this.openGLGraphicsToolkit, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.posX, mvMatrix[0], iPos;\nDP4   viewPos.posY, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.posX, viewPos.z, fogParams.posX;\nMUL   fogFactor.posX, fogFactor.posX, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.posY, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.posY;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.posX, pMatrix[0], viewPos;\nDP4   oPos.posY, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.posX, viewPos.z;\nDP4   oTexCoord0.posX, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.posY, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n"));
			this.aClass39_6777 = (Class39.method477(this.openGLGraphicsToolkit, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.posX, mvMatrix[0], iPos;\nDP4   viewPos.posY, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.posX, viewPos.z, fogParams.posX;\nMUL   fogFactor.posX, fogFactor.posX, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.posY, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.posY;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.posX, mvMatrix[0], iNormal;\nDP3   viewNormal.posY, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.posX, viewNormal, state.light[0].position;\nDP3   ndotl.posY, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.posX, pMatrix[0], viewPos;\nDP4   oPos.posY, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.posX, viewPos.z;\nDP4   oTexCoord0.posX, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.posY, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n"));
			if (this.aClass39_6787 != null & this.aClass39_6786 != null & this.aClass39_6785 != null & this.aClass39_6777 != null) {
				this.aClass30_Sub2_6783 = new Class30_Sub2(openGLGraphicsToolkit, 3553, Class55.aClass55_567, Class77.aClass77_717, 2, 1, false, new byte[] { 0, -1 }, Class55.aClass55_567, false);
				this.aClass30_Sub2_6783.method420(false, false);
				this.aBoolean6779 = true;
			} else
				this.aBoolean6779 = false;
		} else
			this.aBoolean6779 = false;
	}

	void method503(int i, int i_6_) {
		/* empty */
	}

	void method524() {
		Matrix4f matrix4f = (this.openGLGraphicsToolkit.aMatrix4f_8110);
		if (this.aBoolean6781)
			OpenGL.glBindProgramARB(34336, ((this.openGLGraphicsToolkit.anInt8155) == 2147483647 ? this.aClass39_6786.program : this.aClass39_6777.program));
		else
			OpenGL.glBindProgramARB(34336, ((this.openGLGraphicsToolkit.anInt8155) == 2147483647 ? this.aClass39_6787.program : this.aClass39_6785.program));
		float f = (float) this.openGLGraphicsToolkit.anInt8155;
		float f_9_ = matrix4f.aFloatArray2594[4] * f + matrix4f.aFloatArray2594[12];
		float f_10_ = matrix4f.aFloatArray2594[5] * f + matrix4f.aFloatArray2594[13];
		float f_11_ = matrix4f.aFloatArray2594[6] * f + matrix4f.aFloatArray2594[14];
		aFloatArray6788[0] = -matrix4f.aFloatArray2594[4];
		aFloatArray6788[1] = -matrix4f.aFloatArray2594[5];
		aFloatArray6788[2] = -matrix4f.aFloatArray2594[6];
		aFloatArray6788[3] = -(aFloatArray6788[0] * f_9_ + aFloatArray6788[1] * f_10_ + aFloatArray6788[2] * f_11_);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, aFloatArray6788[0], aFloatArray6788[1], aFloatArray6788[2], aFloatArray6788[3]);
		OpenGL.glEnable(34336);
		this.aBoolean6780 = true;
		method523();
	}

	void method505(boolean bool) {
		this.aBoolean6781 = bool;
		this.openGLGraphicsToolkit.method5255(1);
		this.openGLGraphicsToolkit.method5256(this.aClass30_Sub2_6783);
		this.openGLGraphicsToolkit.method5258(34165, 7681);
		this.openGLGraphicsToolkit.method5259(0, 34166, 768);
		this.openGLGraphicsToolkit.method5259(2, 5890, 770);
		this.openGLGraphicsToolkit.method5286(0, 34168, 770);
		this.openGLGraphicsToolkit.method5255(0);
		method524();
	}
}
