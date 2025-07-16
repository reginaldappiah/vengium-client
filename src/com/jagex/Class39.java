package com.jagex;/* Class39 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class39 {
	static int[] anIntArray428 = new int[1];
	OpenGLGraphicsToolkit openGLGraphicsToolkit;
	int program;
	static int anInt431 = 34336;

	static Class39 method477(OpenGLGraphicsToolkit openGLGraphicsToolkit, int target, String string) {
		int program = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(target, program);
		OpenGL.glProgramStringARB(target, 34933, string);
		OpenGL.glGetIntegerv(34379, anIntArray428, 0);
		if (anIntArray428[0] != -1) {
			OpenGL.glBindProgramARB(target, 0);
			return null;
		}
		OpenGL.glBindProgramARB(target, 0);
		return new Class39(openGLGraphicsToolkit, program);
	}

	Class39(OpenGLGraphicsToolkit openGLGraphicsToolkit, int program) {
		this.openGLGraphicsToolkit = openGLGraphicsToolkit;
		this.program = program;
	}
}
