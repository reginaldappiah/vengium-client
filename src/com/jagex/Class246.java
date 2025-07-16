package com.jagex;/* Class246 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;

public abstract class Class246 implements Interface7 {
	NativeHeapBuffer aNativeHeapBuffer6390;
	static int anInt6391 = 34963;
	OpenGLXGraphicsToolkit aOpenGLJavaGraphicsToolkit_6392;
	int anInt6393;
	int anInt6394;
	int anInt6395 = -1;
	boolean aBoolean6396;
	int anInt6397;
	static int anInt6398 = 34962;
	static int[] anIntArray6399 = new int[1];

	public boolean method67(int i, int i_0_, long l) {
		method2331();
		if (this.anInt6395 > 0) {
			OpenGL.glBindBufferARB(this.anInt6393, this.anInt6395);
			OpenGL.glBufferSubDataARBa(this.anInt6393, i, i_0_, l);
		} else
			this.aNativeHeapBuffer6390.f.copy(this.aNativeHeapBuffer6390.f() + (long) i, l, i_0_);
		return true;
	}

	void method2331() {
		if (this.anInt6395 < 0) {
			if (this.aOpenGLJavaGraphicsToolkit_6392.aBoolean9825) {
				OpenGL.glGenBuffersARB(1, anIntArray6399, 0);
				this.anInt6395 = anIntArray6399[0];
				OpenGL.glBindBufferARB(this.anInt6393, this.anInt6395);
			} else
				this.anInt6395 = 0;
		}
	}

	long method2332() {
		return (this.anInt6395 == 0 ? this.aNativeHeapBuffer6390.f() : 0L);
	}

	void method113(int i) {
		if (i > this.anInt6397) {
			method2331();
			if (this.anInt6395 > 0) {
				OpenGL.glBindBufferARB(this.anInt6393, this.anInt6395);
				OpenGL.glBufferDataARBub(this.anInt6393, i, null, 0, (this.aBoolean6396 ? 35040 : 35044));
				this.aOpenGLJavaGraphicsToolkit_6392.anInt8224 += i - this.anInt6397;
			} else
				this.aNativeHeapBuffer6390 = this.aOpenGLJavaGraphicsToolkit_6392.method5517(i, false);
			this.anInt6397 = i;
		}
		this.anInt6394 = i;
	}

	public int method60() {
		return this.anInt6394;
	}

	public long method62(int i, int i_1_) {
		OpenGL.glBindBufferARB(this.anInt6393, this.anInt6395);
		return (OpenGL.glMapBufferARB(this.anInt6393, 35001) + (long) i);
	}

	public void method69() {
		OpenGL.glUnmapBufferARB(this.anInt6393);
	}

	Class246(OpenGLXGraphicsToolkit openGLJavaGraphicsToolkit, int i, boolean bool) {
		this.aOpenGLJavaGraphicsToolkit_6392 = openGLJavaGraphicsToolkit;
		this.anInt6393 = i;
		this.aBoolean6396 = bool;
	}

	public boolean method63(int i, int i_2_, long l) {
		method2331();
		if (this.anInt6395 > 0) {
			OpenGL.glBindBufferARB(this.anInt6393, this.anInt6395);
			OpenGL.glBufferSubDataARBa(this.anInt6393, i, i_2_, l);
		} else
			this.aNativeHeapBuffer6390.f.copy(this.aNativeHeapBuffer6390.f() + (long) i, l, i_2_);
		return true;
	}

	void method2333() {
		if (this.aOpenGLJavaGraphicsToolkit_6392.aBoolean9825)
			OpenGL.glBindBufferARB(this.anInt6393, this.anInt6395);
	}

	boolean method2334(int i, Source source) {
		if (i > this.anInt6397) {
			method2331();
			if (this.anInt6395 > 0) {
				OpenGL.glBindBufferARB(this.anInt6393, this.anInt6395);
				OpenGL.glBufferDataARBa(this.anInt6393, i, source.f(), (this.aBoolean6396 ? 35040 : 35044));
				this.aOpenGLJavaGraphicsToolkit_6392.anInt8224 += i - this.anInt6394;
			} else {
				this.aNativeHeapBuffer6390 = this.aOpenGLJavaGraphicsToolkit_6392.method5517(i, false);
				this.aNativeHeapBuffer6390.z(source);
			}
			this.anInt6397 = i;
		} else if (this.anInt6395 > 0) {
			OpenGL.glBindBufferARB(this.anInt6393, this.anInt6395);
			OpenGL.glBufferSubDataARBa(this.anInt6393, 0, this.anInt6394, source.f());
			this.aOpenGLJavaGraphicsToolkit_6392.anInt8224 += i - this.anInt6394;
		} else {
			this.aNativeHeapBuffer6390 = this.aOpenGLJavaGraphicsToolkit_6392.method5517(i, false);
			this.aNativeHeapBuffer6390.z(source);
		}
		this.anInt6394 = i;
		return true;
	}

	public int method64() {
		return this.anInt6394;
	}

	public boolean method61(int i, int i_3_, long l) {
		method2331();
		if (this.anInt6395 > 0) {
			OpenGL.glBindBufferARB(this.anInt6393, this.anInt6395);
			OpenGL.glBufferSubDataARBa(this.anInt6393, i, i_3_, l);
		} else
			this.aNativeHeapBuffer6390.f.copy(this.aNativeHeapBuffer6390.f() + (long) i, l, i_3_);
		return true;
	}

	public int method65() {
		return this.anInt6394;
	}

	public long method68(int i, int i_4_) {
		OpenGL.glBindBufferARB(this.anInt6393, this.anInt6395);
		return (OpenGL.glMapBufferARB(this.anInt6393, 35001) + (long) i);
	}

	public void method66() {
		OpenGL.glUnmapBufferARB(this.anInt6393);
	}

	void b() {
		if (this.anInt6395 > 0) {
			this.aOpenGLJavaGraphicsToolkit_6392.method5536(this.anInt6395, this.anInt6394);
			this.anInt6395 = -1;
		}
	}
}
