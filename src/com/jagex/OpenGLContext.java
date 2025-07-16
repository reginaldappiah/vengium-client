package com.jagex;/* OpenGLContext - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

import java.awt.*;

public class OpenGLContext extends RenderContext {
	OpenGLGraphicsToolkit openGLGraphicsToolkit;
	Canvas canvas;
	OpenGL openGL;
	long aLong9084;
	int width;
	int height;
	boolean aBoolean9087 = false;

	public int getWidth() {
		return this.width;
	}

	boolean attach() {
		if (this.aBoolean9087)
			throw new IllegalStateException();
		this.openGL.setSurface(this.aLong9084);
		this.openGLGraphicsToolkit.method5225();
		return true;
	}

	public int getHeight() {
		return this.height;
	}

	void updateDimension(int width, int height) {
		if (this.aBoolean9087)
			throw new IllegalStateException();
		this.openGL.surfaceResized(this.aLong9084);
		method597();
		if (this == this.openGLGraphicsToolkit.getFrameContext())
			this.openGLGraphicsToolkit.method5257();
	}

	void method597() {
		Dimension dimension = this.canvas.getSize();
		this.height = dimension.height;
		this.width = dimension.width;
	}

	public int method580() {
		if (this.aBoolean9087)
			throw new IllegalStateException();
		this.openGL.swapBuffers(this.aLong9084);
		return 0;
	}

	OpenGLContext(OpenGLGraphicsToolkit class_ra_sub2, Canvas canvas) {
		this(class_ra_sub2, canvas, class_ra_sub2.openGL.prepareSurface(canvas));
	}

	public int method581(int i, int i_1_) {
		return 0;
	}

	public void destroy() {
		if (this.aBoolean9087)
			throw new IllegalStateException();
		this.openGL.releaseSurface(this.canvas, this.aLong9084);
		this.aBoolean9087 = true;
	}

	boolean detach() {
		return true;
	}

	OpenGLContext(OpenGLGraphicsToolkit class_ra_sub2, Canvas canvas, long l) {
		this.openGLGraphicsToolkit = class_ra_sub2;
		this.canvas = canvas;
		this.openGL = class_ra_sub2.openGL;
		this.aLong9084 = l;
		method597();
	}

}
