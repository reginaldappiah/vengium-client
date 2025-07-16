package com.jagex;/* Class123_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class123_Sub2 extends Class123 {
	int anInt6951;
	OpenGLXGraphicsToolkit aOpenGLJavaGraphicsToolkit_6952;
	OpenGLShaderToolkit aClass110_Sub2_6953;

	public void method1355() {
		if ((this.aOpenGLJavaGraphicsToolkit_6952.aClass110_Sub2_9832) != this.aClass110_Sub2_6953) {
			if (this.aClass110_Sub2_6953 == null)
				throw new RuntimeException_Sub1();
			OpenGL.glUseProgram(this.anInt6951);
			this.aOpenGLJavaGraphicsToolkit_6952.aClass110_Sub2_9832 = this.aClass110_Sub2_6953;
		}
	}

	void method1353() {
		for (int i = 0; i < method1328(); i++)
			method1369(i, 862535051).b();
		super.method1353();
	}

	public boolean method1331(ShaderProgramToolkit shaderProgramToolkit) {
		if (this.aClass110_Sub2_6953 == shaderProgramToolkit)
			return true;
		if (!shaderProgramToolkit.method1221())
			return false;
		boolean bool = method1374();
		this.aClass110_Sub2_6953 = (OpenGLShaderToolkit) shaderProgramToolkit;
		anInt1475 = method1329(shaderProgramToolkit, -180449856) * -1776466383;
		if (anInt1475 * -33664303 == -1)
			throw new IllegalArgumentException();
		this.anInt6951 = (this.aClass110_Sub2_6953.anInt8608);
		if (bool) {
			OpenGL.glUseProgram(this.anInt6951);
			this.aOpenGLJavaGraphicsToolkit_6952.aClass110_Sub2_9832 = this.aClass110_Sub2_6953;
		}
		return true;
	}

	ShaderProgram method1367(Class114 class114) {
		return new Class298_Sub31_Sub1_Sub1(this, class114);
	}

	public void method1340() {
		if ((this.aOpenGLJavaGraphicsToolkit_6952.aClass110_Sub2_9832) != this.aClass110_Sub2_6953) {
			if (this.aClass110_Sub2_6953 == null)
				throw new RuntimeException_Sub1();
			OpenGL.glUseProgram(this.anInt6951);
			this.aOpenGLJavaGraphicsToolkit_6952.aClass110_Sub2_9832 = this.aClass110_Sub2_6953;
		}
	}

	public void method1372() {
		/* empty */
	}

	public boolean method1374() {
		return ((this.aOpenGLJavaGraphicsToolkit_6952.aClass110_Sub2_9832) == this.aClass110_Sub2_6953);
	}

	public void method1358() {
		/* empty */
	}

	public void method1354() {
		if ((this.aOpenGLJavaGraphicsToolkit_6952.aClass110_Sub2_9832) != this.aClass110_Sub2_6953) {
			if (this.aClass110_Sub2_6953 == null)
				throw new RuntimeException_Sub1();
			OpenGL.glUseProgram(this.anInt6951);
			this.aOpenGLJavaGraphicsToolkit_6952.aClass110_Sub2_9832 = this.aClass110_Sub2_6953;
		}
	}

	ShaderProgramToolkit method1362(NativeToolkit class_ra_sub3, Class108 class108) {
		return new OpenGLShaderToolkit((OpenGLXGraphicsToolkit) class_ra_sub3, this, class108);
	}

	public void method1373() {
		if ((this.aOpenGLJavaGraphicsToolkit_6952.aClass110_Sub2_9832) != this.aClass110_Sub2_6953) {
			if (this.aClass110_Sub2_6953 == null)
				throw new RuntimeException_Sub1();
			OpenGL.glUseProgram(this.anInt6951);
			this.aOpenGLJavaGraphicsToolkit_6952.aClass110_Sub2_9832 = this.aClass110_Sub2_6953;
		}
	}

	public boolean method1349(ShaderProgramToolkit shaderProgramToolkit) {
		if (this.aClass110_Sub2_6953 == shaderProgramToolkit)
			return true;
		if (!shaderProgramToolkit.method1221())
			return false;
		boolean bool = method1374();
		this.aClass110_Sub2_6953 = (OpenGLShaderToolkit) shaderProgramToolkit;
		anInt1475 = method1329(shaderProgramToolkit, -180449856) * -1776466383;
		if (anInt1475 * -33664303 == -1)
			throw new IllegalArgumentException();
		this.anInt6951 = (this.aClass110_Sub2_6953.anInt8608);
		if (bool) {
			OpenGL.glUseProgram(this.anInt6951);
			this.aOpenGLJavaGraphicsToolkit_6952.aClass110_Sub2_9832 = this.aClass110_Sub2_6953;
		}
		return true;
	}

	public void method1357() {
		/* empty */
	}

	public boolean method1375(ShaderProgramToolkit shaderProgramToolkit) {
		if (this.aClass110_Sub2_6953 == shaderProgramToolkit)
			return true;
		if (!shaderProgramToolkit.method1221())
			return false;
		boolean bool = method1374();
		this.aClass110_Sub2_6953 = (OpenGLShaderToolkit) shaderProgramToolkit;
		anInt1475 = method1329(shaderProgramToolkit, -180449856) * -1776466383;
		if (anInt1475 * -33664303 == -1)
			throw new IllegalArgumentException();
		this.anInt6951 = (this.aClass110_Sub2_6953.anInt8608);
		if (bool) {
			OpenGL.glUseProgram(this.anInt6951);
			this.aOpenGLJavaGraphicsToolkit_6952.aClass110_Sub2_9832 = this.aClass110_Sub2_6953;
		}
		return true;
	}

	void method1380() {
		for (int i = 0; i < method1328(); i++)
			method1369(i, 1695242016).b();
		super.method1353();
	}

	public boolean method1371() {
		return ((this.aOpenGLJavaGraphicsToolkit_6952.aClass110_Sub2_9832) == this.aClass110_Sub2_6953);
	}

	public void method1356() {
		/* empty */
	}

	ShaderProgramToolkit method1361(NativeToolkit class_ra_sub3, Class108 class108) {
		return new OpenGLShaderToolkit((OpenGLXGraphicsToolkit) class_ra_sub3, this, class108);
	}

	ShaderProgram method1364(Class114 class114) {
		return new Class298_Sub31_Sub1_Sub1(this, class114);
	}

	Class123_Sub2(OpenGLXGraphicsToolkit openGLJavaGraphicsToolkit, Class109 class109) {
		super(openGLJavaGraphicsToolkit, class109);
		this.aOpenGLJavaGraphicsToolkit_6952 = openGLJavaGraphicsToolkit;
	}

	ShaderProgramToolkit method1326(NativeToolkit class_ra_sub3, Class108 class108) {
		return new OpenGLShaderToolkit((OpenGLXGraphicsToolkit) class_ra_sub3, this, class108);
	}

	public boolean method1359() {
		return ((this.aOpenGLJavaGraphicsToolkit_6952.aClass110_Sub2_9832) == this.aClass110_Sub2_6953);
	}

	public boolean method1376(ShaderProgramToolkit shaderProgramToolkit) {
		if (this.aClass110_Sub2_6953 == shaderProgramToolkit)
			return true;
		if (!shaderProgramToolkit.method1221())
			return false;
		boolean bool = method1374();
		this.aClass110_Sub2_6953 = (OpenGLShaderToolkit) shaderProgramToolkit;
		anInt1475 = method1329(shaderProgramToolkit, -180449856) * -1776466383;
		if (anInt1475 * -33664303 == -1)
			throw new IllegalArgumentException();
		this.anInt6951 = (this.aClass110_Sub2_6953.anInt8608);
		if (bool) {
			OpenGL.glUseProgram(this.anInt6951);
			this.aOpenGLJavaGraphicsToolkit_6952.aClass110_Sub2_9832 = this.aClass110_Sub2_6953;
		}
		return true;
	}
}
