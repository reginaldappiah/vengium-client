package com.jagex;/* Class47_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class47_Sub2 extends Class47 {
	static String aString6752 = "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.posX*wnNormal.wwww)+waveIntensity.posY, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n";
	boolean aBoolean6753;
	Class29 aClass29_6754;
	boolean aBoolean6755 = false;
	static String aString6756 = "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.posX = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.posY = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].posX = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].posY = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n";
	Class45 aClass45_6757;

    void method505(boolean bool) {
		Class30_Sub1 class30_sub1 = this.openGLGraphicsToolkit.method5280();
		if (this.aBoolean6753 && class30_sub1 != null) {
			float f = (1.0F + (1.0F - Math.abs(this.openGLGraphicsToolkit.aFloatArray8124[1])) * 2.0F);
			this.openGLGraphicsToolkit.method5255(1);
			this.openGLGraphicsToolkit.method5256(class30_sub1);
			this.openGLGraphicsToolkit.method5255(0);
			this.openGLGraphicsToolkit.method5256(this.aClass45_6757.aClass30_Sub4_485);
			int i = this.aClass29_6754.anInt365;
			OpenGL.glUseProgram(i);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "normalSampler"), 0);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "envMapSampler"), 1);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i, "sunDir"), -(this.openGLGraphicsToolkit.aFloatArray8124[0]), -(this.openGLGraphicsToolkit.aFloatArray8124[1]), -(this.openGLGraphicsToolkit.aFloatArray8124[2]));
			OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i, "sunColour"), (this.openGLGraphicsToolkit.red) * f, (this.openGLGraphicsToolkit.green) * f, (this.openGLGraphicsToolkit.blue) * f, 1.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i, "sunExponent"), 64.0F + Math.abs(this.openGLGraphicsToolkit.aFloatArray8124[1]) * 928.0F);
			this.aBoolean6755 = true;
		}
	}

    boolean method501() {
		return this.aBoolean6753;
	}

	void method503(int i, int i_16_) {
		if (this.aBoolean6755) {
			int i_17_ = 1 << (i & 0x3);
			float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
			int i_18_ = i_16_ & 0xffff;
			float f_19_ = (float) (i_16_ >> 16 & 0x3) / 8.0F;
			float f_20_ = (float) (i_16_ >> 19 & 0xf) / 16.0F;
			float f_21_ = (float) (i_16_ >> 23 & 0xf) / 16.0F;
			int i_22_ = i_16_ >> 27 & 0xf;
			int i_23_ = this.aClass29_6754.anInt365;
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_23_, "time"), (float) (i_17_ * this.openGLGraphicsToolkit.anInt8062 % 40000) / 40000.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_23_, "scale"), f);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_23_, "breakWaterDepth"), (float) i_18_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_23_, "breakWaterOffset"), f_19_);
			OpenGL.glUniform2f(OpenGL.glGetUniformLocation(i_23_, "waveIntensity"), f_21_, f_20_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_23_, "waveExponent"), (float) i_22_);
		}
	}

	void method500(Class30 class30, int i) {
		if (!this.aBoolean6755) {
			this.openGLGraphicsToolkit.method5256(class30);
			this.openGLGraphicsToolkit.method5243(i);
		}
	}

    Class47_Sub2(OpenGLGraphicsToolkit class_ra_sub2, Class45 class45) {
		super(class_ra_sub2);
		this.aBoolean6753 = false;
		this.aClass45_6757 = class45;
		if ((this.aClass45_6757.aClass30_Sub4_485 != null) && (this.openGLGraphicsToolkit.aBoolean8183) && (this.openGLGraphicsToolkit.aBoolean8093)) {
			Class48 class48 = (Class48.method526(this.openGLGraphicsToolkit, 35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.posX = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.posY = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].posX = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].posY = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n"));
			Class48 class48_24_ = (Class48.method526(this.openGLGraphicsToolkit, 35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.posX*wnNormal.wwww)+waveIntensity.posY, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n"));
			this.aClass29_6754 = Class29.method406(this.openGLGraphicsToolkit, new Class48[] { class48, class48_24_ });
			this.aBoolean6753 = this.aClass29_6754 != null;
		}
	}

    void method504() {
		if (this.aBoolean6755) {
			this.openGLGraphicsToolkit.method5255(1);
			this.openGLGraphicsToolkit.method5256(null);
			this.openGLGraphicsToolkit.method5255(0);
			this.openGLGraphicsToolkit.method5256(null);
			OpenGL.glUseProgram(0);
			this.aBoolean6755 = false;
		}
	}

	void method518(boolean bool) {
		/* empty */
	}

}
