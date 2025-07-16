package com.jagex;/* Class30_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class30_Sub2_Sub1 extends Class30_Sub2 {
	boolean aBoolean9046;
	int height;
	int width;
	float aFloat9049;
	boolean aBoolean9050;
	float aFloat9051;

	static Class30_Sub2_Sub1 method425(OpenGLGraphicsToolkit openGLGraphicsToolkit, int width, int height, boolean bool, int[] pixels, int i_1_, int mode) {
		if (openGLGraphicsToolkit.aBoolean8031 || (StaticMethods.method6152(width) && StaticMethods.method6152(height)))
			return new Class30_Sub2_Sub1(openGLGraphicsToolkit, 3553, width, height, bool, pixels, i_1_, mode);
		if (openGLGraphicsToolkit.aBoolean8179)
			return new Class30_Sub2_Sub1(openGLGraphicsToolkit, 34037, width, height, bool, pixels, i_1_, mode);
		return new Class30_Sub2_Sub1(openGLGraphicsToolkit, width, height, LinkedList.getNextBitValue(width), LinkedList.getNextBitValue(height), pixels);
	}

	static Class30_Sub2_Sub1 method426(OpenGLGraphicsToolkit class_ra_sub2, Class55 class55, Class77 class77, int i, int i_3_) {
		if (class_ra_sub2.aBoolean8031 || (StaticMethods.method6152(i) && StaticMethods.method6152(i_3_)))
			return new Class30_Sub2_Sub1(class_ra_sub2, 3553, class55, class77, i, i_3_);
		if (class_ra_sub2.aBoolean8179)
			return new Class30_Sub2_Sub1(class_ra_sub2, 34037, class55, class77, i, i_3_);
		return new Class30_Sub2_Sub1(class_ra_sub2, class55, class77, i, i_3_, LinkedList.getNextBitValue(i), LinkedList.getNextBitValue(i_3_));
	}

	static Class30_Sub2_Sub1 method427(OpenGLGraphicsToolkit class_ra_sub2, int i, int i_4_, int i_5_, int i_6_) {
		if (class_ra_sub2.aBoolean8031 || (StaticMethods.method6152(i_5_) && StaticMethods.method6152(i_6_)))
			return new Class30_Sub2_Sub1(class_ra_sub2, 3553, i, i_4_, i_5_, i_6_);
		if (class_ra_sub2.aBoolean8179)
			return new Class30_Sub2_Sub1(class_ra_sub2, 34037, i, i_4_, i_5_, i_6_);
		return new Class30_Sub2_Sub1(class_ra_sub2, i, i_4_, i_5_, i_6_, LinkedList.getNextBitValue(i_5_), LinkedList.getNextBitValue(i_6_), true);
	}

	Class30_Sub2_Sub1(OpenGLGraphicsToolkit openGLGraphicsToolkit, int i, int width, int height, boolean bool, int[] pixels, int i_9_, int mode) {
		super(openGLGraphicsToolkit, i, width, height, bool, pixels, i_9_, mode, true);
		this.width = width;
		this.height = height;
		if (this.anInt372 == 34037) {
			this.aFloat9051 = (float) height;
			this.aFloat9049 = (float) width;
			this.aBoolean9050 = false;
		} else {
			this.aFloat9051 = 1.0F;
			this.aFloat9049 = 1.0F;
			this.aBoolean9050 = true;
		}
		this.aBoolean9046 = false;
	}

	Class30_Sub2_Sub1(OpenGLGraphicsToolkit openGLGraphicsToolkit, int i, Class55 class55, Class77 class77, int width, int height, boolean bool, byte[] pixels, Class55 class55_13_) {
		super(openGLGraphicsToolkit, i, class55, class77, width, height, bool, pixels, class55_13_, true);
		this.width = width;
		this.height = height;
		if (this.anInt372 == 34037) {
			this.aFloat9051 = (float) height;
			this.aFloat9049 = (float) width;
			this.aBoolean9050 = false;
		} else {
			this.aFloat9051 = 1.0F;
			this.aFloat9049 = 1.0F;
			this.aBoolean9050 = true;
		}
		this.aBoolean9046 = false;
	}

	Class30_Sub2_Sub1(OpenGLGraphicsToolkit openGLGraphicsToolkit, int i, int i_14_, int i_15_, int width, int height) {
		super(openGLGraphicsToolkit, i, i_14_, i_15_, width, height);
		this.width = width;
		this.height = height;
		if (this.anInt372 == 34037) {
			this.aFloat9051 = (float) height;
			this.aFloat9049 = (float) width;
			this.aBoolean9050 = false;
		} else {
			this.aFloat9051 = 1.0F;
			this.aFloat9049 = 1.0F;
			this.aBoolean9050 = true;
		}
		this.aBoolean9046 = false;
	}

	Class30_Sub2_Sub1(OpenGLGraphicsToolkit openGLGraphicsToolkit, int width, int height, int i_19_, int i_20_, int[] pixels) {
		super(openGLGraphicsToolkit, 3553, Class55.aClass55_557, Class77.aClass77_717, i_19_, i_20_);
		this.width = width;
		this.height = height;
		method422(0, i_20_ - height, width, height, pixels, 0, 0, true);
		this.aFloat9051 = (float) height / (float) i_20_;
		this.aFloat9049 = (float) width / (float) i_19_;
		this.aBoolean9050 = false;
		this.aBoolean9046 = true;
		method420(false, false);
	}

	Class30_Sub2_Sub1(OpenGLGraphicsToolkit class_ra_sub2, Class55 class55, Class77 class77, int i, int i_21_, int i_22_, int i_23_, byte[] is, Class55 class55_24_) {
		super(class_ra_sub2, 3553, class55, class77, i_22_, i_23_);
		this.width = i;
		this.height = i_21_;
		method421(0, i_23_ - i_21_, i, i_21_, is, class55_24_, 0, 0, true);
		this.aFloat9051 = (float) i_21_ / (float) i_23_;
		this.aFloat9049 = (float) i / (float) i_22_;
		this.aBoolean9050 = false;
		this.aBoolean9046 = true;
		method420(false, false);
	}

	Class30_Sub2_Sub1(OpenGLGraphicsToolkit class_ra_sub2, int i, int i_25_, int i_26_, int i_27_, int i_28_, int i_29_, boolean bool) {
		super(class_ra_sub2, 3553, i, i_25_, i_28_, i_29_);
		this.width = i_26_;
		this.height = i_27_;
		this.aFloat9051 = (float) i_27_ / (float) i_29_;
		this.aFloat9049 = (float) i_26_ / (float) i_28_;
		this.aBoolean9050 = false;
		this.aBoolean9046 = true;
		method420(false, false);
	}

	void method410(boolean bool) {
		super.method410(bool && !this.aBoolean9046);
	}

	Class30_Sub2_Sub1(OpenGLGraphicsToolkit class_ra_sub2, Class55 class55, Class77 class77, int i, int i_30_, int i_31_, int i_32_) {
		super(class_ra_sub2, 3553, class55, class77, i_31_, i_32_);
		this.width = i;
		this.height = i_30_;
		this.aFloat9051 = (float) i_30_ / (float) i_32_;
		this.aFloat9049 = (float) i / (float) i_31_;
		this.aBoolean9050 = false;
		this.aBoolean9046 = true;
		method420(false, false);
	}

	static Class30_Sub2_Sub1 method428(OpenGLGraphicsToolkit class_ra_sub2, Class55 class55, Class77 class77, int i, int i_33_, boolean bool, byte[] is, Class55 class55_34_) {
		if (class_ra_sub2.aBoolean8031 || (StaticMethods.method6152(i) && StaticMethods.method6152(i_33_)))
			return new Class30_Sub2_Sub1(class_ra_sub2, 3553, class55, class77, i, i_33_, bool, is, class55_34_);
		if (class_ra_sub2.aBoolean8179)
			return new Class30_Sub2_Sub1(class_ra_sub2, 34037, class55, class77, i, i_33_, bool, is, class55_34_);
		return new Class30_Sub2_Sub1(class_ra_sub2, class55, class77, i, i_33_, LinkedList.getNextBitValue(i), LinkedList.getNextBitValue(i_33_), is, class55_34_);
	}

	Class30_Sub2_Sub1(OpenGLGraphicsToolkit class_ra_sub2, int i, Class55 class55, Class77 class77, int i_35_, int i_36_) {
		super(class_ra_sub2, i, class55, class77, i_35_, i_36_);
		this.width = i_35_;
		this.height = i_36_;
		if (this.anInt372 == 34037) {
			this.aFloat9051 = (float) i_36_;
			this.aFloat9049 = (float) i_35_;
			this.aBoolean9050 = false;
		} else {
			this.aFloat9051 = 1.0F;
			this.aFloat9049 = 1.0F;
			this.aBoolean9050 = true;
		}
		this.aBoolean9046 = false;
	}

	void method429(boolean bool) {
		super.method410(bool && !this.aBoolean9046);
	}
}
