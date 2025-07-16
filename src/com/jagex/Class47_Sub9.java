package com.jagex;/* Class47_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class47_Sub9 extends Class47 {
	static String aString6808 = "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n";
	boolean aBoolean6809;
	static String aString6810 = "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.posX = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.posY = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].posX = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].posY = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n";
	boolean aBoolean6811 = false;
	Class29 aClass29_6812;
	Class45 aClass45_6813;

    void method505(boolean bool) {
		Class30_Sub1 class30_sub1 = this.openGLGraphicsToolkit.method5280();
		if (this.aBoolean6809 && class30_sub1 != null) {
			this.openGLGraphicsToolkit.method5255(1);
			this.openGLGraphicsToolkit.method5256(class30_sub1);
			this.openGLGraphicsToolkit.method5255(0);
			this.openGLGraphicsToolkit.method5256(this.aClass45_6813.aClass30_Sub4_485);
			int i = this.aClass29_6812.anInt365;
			OpenGL.glUseProgram(i);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "normalSampler"), 0);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "envMapSampler"), 1);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i, "sunDir"), -(this.openGLGraphicsToolkit.aFloatArray8124[0]), -(this.openGLGraphicsToolkit.aFloatArray8124[1]), -(this.openGLGraphicsToolkit.aFloatArray8124[2]));
			OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i, "sunColour"), (this.openGLGraphicsToolkit.red), (this.openGLGraphicsToolkit.green), (this.openGLGraphicsToolkit.blue), 1.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i, "sunExponent"), 96.0F + Math.abs(this.openGLGraphicsToolkit.aFloatArray8124[1]) * 928.0F);
			this.aBoolean6811 = true;
		}
	}

	void method518(boolean bool) {
		/* empty */
	}

	void method504() {
		if (this.aBoolean6811) {
			this.openGLGraphicsToolkit.method5255(1);
			this.openGLGraphicsToolkit.method5256(null);
			this.openGLGraphicsToolkit.method5255(0);
			this.openGLGraphicsToolkit.method5256(null);
			OpenGL.glUseProgram(0);
			this.aBoolean6811 = false;
		}
	}

	void method503(int i, int i_0_) {
		if (this.aBoolean6811) {
			int i_1_ = 1 << (i & 0x3);
			float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
			int i_2_ = i_0_ & 0xffff;
			float f_3_ = (float) (i_0_ >> 16 & 0x3) / 8.0F;
			int i_4_ = this.aClass29_6812.anInt365;
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_4_, "time"), (float) (i_1_ * this.openGLGraphicsToolkit.anInt8062 % 40000) / 40000.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_4_, "scale"), f);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_4_, "breakWaterDepth"), (float) i_2_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_4_, "breakWaterOffset"), f_3_);
		}
	}

	void method500(Class30 class30, int i) {
		if (!this.aBoolean6811) {
			this.openGLGraphicsToolkit.method5256(class30);
			this.openGLGraphicsToolkit.method5243(i);
		}
	}

    boolean method501() {
		return this.aBoolean6809;
	}

    Class47_Sub9(OpenGLGraphicsToolkit class_ra_sub2, Class45 class45) {
		super(class_ra_sub2);
		this.aBoolean6809 = false;
		this.aClass45_6813 = class45;
		if ((this.aClass45_6813.aClass30_Sub4_485 != null) && (this.openGLGraphicsToolkit.aBoolean8183) && (this.openGLGraphicsToolkit.aBoolean8093)) {
			Class48 class48 = (Class48.method526(this.openGLGraphicsToolkit, 35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.posX = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.posY = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].posX = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].posY = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n"));
			Class48 class48_20_ = (Class48.method526(this.openGLGraphicsToolkit, 35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n"));
			this.aClass29_6812 = Class29.method406(this.openGLGraphicsToolkit, new Class48[] { class48, class48_20_ });
			this.aBoolean6809 = this.aClass29_6812 != null;
		}
	}

}
