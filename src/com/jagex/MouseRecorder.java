package com.jagex;/* MouseRecorder - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */


public abstract class MouseRecorder {

	public abstract boolean method3878();

	public abstract MouseRecord nextSubmission();

	public abstract boolean method3880();

	public boolean method3881() {
			return (method3878() || method3887() || method3880());
	}

	public abstract void stop();

	public abstract int getLastY();

	MouseRecorder() {

	}

	public abstract void sync();

	public abstract boolean method3887();

	public abstract int getLastX();

}
