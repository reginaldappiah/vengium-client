package com.jagex;/* Class52_Sub1_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class52_Sub1_Sub3 extends FrameBufferContext {
	NativeToolkit aClass_ra_Sub3_9066;

	boolean attach() {
		this.aClass_ra_Sub3_9066.method5332();
		return true;
	}

    Class52_Sub1_Sub3(NativeToolkit class_ra_sub3) {
		this.aClass_ra_Sub3_9066 = class_ra_sub3;
	}

	void method573() {
		if (this == this.aClass_ra_Sub3_9066.getFrameContext())
			this.aClass_ra_Sub3_9066.method5317();
	}
}
