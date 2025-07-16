package com.jagex;/* Class259 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.prefetch.JS5PrefetchType;
import jaggl.OpenGL;

import java.awt.*;

public class Class259 {
	public static GraphicsToolkit method2455(Canvas canvas, MaterialRawLoader interface_ma, Js5FileSystem class243, int i) {
		OpenGLXGraphicsToolkit openGLJavaGraphicsToolkit;
		try {
			boolean bool = NativeToolkit.libraryExists();
			if (!bool)
				throw new RuntimeException("");
			if (!JS5PrefetchType.getPrefetch().load("jaggl"))
				throw new RuntimeException("");
			TranslatedCanvas.setIgnoreRepaint(canvas);
			OpenGL opengl = new OpenGL();
			long l = opengl.init(canvas, 8, 8, 8, 24, 0, i);
			if (l == 0L)
				throw new RuntimeException("");
			OpenGLXGraphicsToolkit openGLJavaGraphicsToolkit_0_ = new OpenGLXGraphicsToolkit(opengl, canvas, l, interface_ma, class243, i);
			openGLJavaGraphicsToolkit_0_.method5302();
			openGLJavaGraphicsToolkit = openGLJavaGraphicsToolkit_0_;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		} catch (Throwable throwable) {
			throw new RuntimeException("");
		}
		return openGLJavaGraphicsToolkit;
	}

	Class259() throws Throwable {
		throw new Error();
	}
}
