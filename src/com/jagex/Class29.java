package com.jagex;/* Class29 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class29 {
	int anInt365;
	OpenGLGraphicsToolkit aClass_ra_Sub2_366;
	static int[] anIntArray367 = new int[2];

	static Class29 method406(OpenGLGraphicsToolkit class_ra_sub2, Class48[] class48s) {
		for (int i = 0; i < class48s.length; i++) {
			if (class48s[i] == null || class48s[i].shaderType <= 0)
				return null;
		}
		int i = OpenGL.glCreateProgram();
		for (int i_0_ = 0; i_0_ < class48s.length; i_0_++)
			OpenGL.glAttachShader(i, class48s[i_0_].shaderType);
		OpenGL.glLinkProgram(i);
		OpenGL.glGetProgramiv(i, 35714, anIntArray367, 0);
		if (anIntArray367[0] == 0) {
			OpenGL.glGetProgramiv(i, 35716, anIntArray367, 1);
			if (anIntArray367[1] > 1) {
				byte[] is = new byte[anIntArray367[1]];
				OpenGL.glGetProgramInfoLog(i, anIntArray367[1], anIntArray367, 0, is, 0);
				System.out.println(new String(is));
			}
			if (anIntArray367[0] == 0) {
				for (int i_1_ = 0; i_1_ < class48s.length; i_1_++)
					OpenGL.glDetachShader(i, class48s[i_1_].shaderType);
				OpenGL.glDeleteProgram(i);
				return null;
			}
		}
		return new Class29(class_ra_sub2, i, class48s);
	}

	Class29(OpenGLGraphicsToolkit class_ra_sub2, int i, Class48[] class48s) {
		this.aClass_ra_Sub2_366 = class_ra_sub2;
		this.anInt365 = i;
	}
}
