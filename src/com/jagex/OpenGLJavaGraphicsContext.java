package com.jagex;/* OpenGLJavaGraphicsContext - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

import java.awt.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class OpenGLJavaGraphicsContext extends JavaGraphicsContext {
	OpenGL anOpenGL9988;
	long aLong9989;
	int anInt9990;
	Canvas aCanvas9991;
	int anInt9992;

	OpenGLJavaGraphicsContext(OpenGLXGraphicsToolkit openGLJavaGraphicsToolkit, Canvas canvas, long l) {
		super(openGLJavaGraphicsToolkit);
		this.aCanvas9991 = canvas;
		this.anOpenGL9988 = openGLJavaGraphicsToolkit.openGL;
		this.aLong9989 = l;
		method595();
	}

	static void method50123(int x) {
		try {
			Class var_class = java.lang.ClassLoader.class;
			Field field = var_class.getDeclaredField("nativeLibraries");
			Class var_class_124_ = java.lang.reflect.AccessibleObject.class;
			Method method = var_class_124_.getDeclaredMethod("setAccessible", (new Class[] { Boolean.TYPE }));
			method.invoke(field, Boolean.TRUE);
		} catch (Throwable throwable) {
			/* empty */
		}
	}

	public int getHeight() {
		return this.anInt9992;
	}

    void method595() {
		Dimension dimension = this.aCanvas9991.getSize();
		this.anInt9992 = dimension.height;
		this.anInt9990 = dimension.width;
	}

	public int method581(int i, int i_1_) {
		return 0;
	}

	boolean attach() {
		return (this.anOpenGL9988.setSurface(this.aLong9989) && super.attach());
	}

	boolean detach() {
		return true;
	}

	public void destroy() {
		this.anOpenGL9988.releaseSurface(this.aCanvas9991, this.aLong9989);
	}

	void updateDimension(int width, int height) {
		this.anOpenGL9988.surfaceResized(this.aLong9989);
		method595();
		super.updateDimension(width, height);
	}

	public int method580() {
		this.anOpenGL9988.swapBuffers(this.aLong9989);
		return 0;
	}

	public int getWidth() {
		return this.anInt9990;
	}

	OpenGLJavaGraphicsContext(OpenGLXGraphicsToolkit openGLJavaGraphicsToolkit, Canvas canvas) {
		this(openGLJavaGraphicsToolkit, canvas, openGLJavaGraphicsToolkit.openGL.prepareSurface(canvas));
	}

}
