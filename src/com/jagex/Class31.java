package com.jagex;/* Class31 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class31 {
	int anInt383;
	static int anInt384 = 7;
	int anInt385;
	OpenGLGraphicsToolkit aClass_ra_Sub2_386;
	Class44 aClass44_387;
	static int anInt388 = 128;
	boolean aBoolean389 = true;
	int anInt390 = -1;
	int anInt391;
	Interface2 anInterface2_392;
	Class46_Sub1 aClass46_Sub1_393;
	Class30_Sub2 aClass30_Sub2_394;

	void method432() {
		method433(this.anInterface2_392, this.anInt391);
	}

	void method433(Interface2 interface2, int i) {
		if (i != 0) {
			method434();
			this.aClass_ra_Sub2_386.method5256(this.aClass30_Sub2_394);
			this.aClass_ra_Sub2_386.method5254(interface2, 4, 0, i);
		}
	}

	void method434() {
		if (this.aBoolean389) {
			this.aBoolean389 = false;
			byte[] is = this.aClass44_387.aByteArray471;
			byte[] is_0_ = (this.aClass_ra_Sub2_386.aByteArray8201);
			int i = 0;
			int i_1_ = this.aClass44_387.anInt469;
			int i_2_ = (this.anInt383 + (this.anInt385 * this.aClass44_387.anInt469));
			for (int i_3_ = -128; i_3_ < 0; i_3_++) {
				i = (i << 8) - i;
				for (int i_4_ = -128; i_4_ < 0; i_4_++) {
					if (is[i_2_++] != 0)
						i++;
				}
				i_2_ += i_1_ - 128;
			}
			if (this.aClass30_Sub2_394 != null && this.anInt390 == i)
				this.aBoolean389 = false;
			else {
				this.anInt390 = i;
				int i_5_ = 0;
				i_2_ = (this.anInt383 + this.anInt385 * i_1_);
				for (int i_6_ = -128; i_6_ < 0; i_6_++) {
					for (int i_7_ = -128; i_7_ < 0; i_7_++) {
						if (is[i_2_] != 0)
							is_0_[i_5_++] = (byte) 68;
						else {
							int i_8_ = 0;
							if (is[i_2_ - 1] != 0)
								i_8_++;
							if (is[i_2_ + 1] != 0)
								i_8_++;
							if (is[i_2_ - i_1_] != 0)
								i_8_++;
							if (is[i_2_ + i_1_] != 0)
								i_8_++;
							is_0_[i_5_++] = (byte) (17 * i_8_);
						}
						i_2_++;
					}
					i_2_ += (this.aClass44_387.anInt469 - 128);
				}
				if (this.aClass30_Sub2_394 == null) {
					this.aClass30_Sub2_394 = new Class30_Sub2(this.aClass_ra_Sub2_386, 3553, Class55.aClass55_567, Class77.aClass77_717, 128, 128, false, (this.aClass_ra_Sub2_386.aByteArray8201), Class55.aClass55_567, false);
					this.aClass30_Sub2_394.method420(false, false);
					this.aClass30_Sub2_394.method410(true);
				} else
					this.aClass30_Sub2_394.method421(0, 0, 128, 128, (this.aClass_ra_Sub2_386.aByteArray8201), Class55.aClass55_567, 0, 0, false);
			}
		}
	}

	Class31(OpenGLGraphicsToolkit class_ra_sub2, Class44 class44, Class_xa_Sub3 class_xa_sub3, int i, int i_9_, int i_10_, int i_11_, int i_12_) {
		this.aClass_ra_Sub2_386 = class_ra_sub2;
		this.aClass44_387 = class44;
		this.anInt383 = i_11_;
		this.anInt385 = i_12_;
		int i_13_ = 1 << i_10_;
		int i_14_ = 0;
		int i_15_ = i << i_10_;
		int i_16_ = i_9_ << i_10_;
		for (int i_17_ = 0; i_17_ < i_13_; i_17_++) {
			int i_18_ = ((i_16_ + i_17_) * (class_xa_sub3.anInt6287 * -506105871) + i_15_);
			for (int i_19_ = 0; i_19_ < i_13_; i_19_++) {
				short[] is = (class_xa_sub3.aShortArrayArray8550[i_18_++]);
				if (is != null)
					i_14_ += is.length;
			}
		}
		this.anInt391 = i_14_;
		if (i_14_ > 0) {
			Buffer class298_sub53 = new Buffer(i_14_ * 2);
			if (this.aClass_ra_Sub2_386.aBoolean8143) {
				for (int i_20_ = 0; i_20_ < i_13_; i_20_++) {
					int i_21_ = ((i_16_ + i_20_) * (class_xa_sub3.anInt6287 * -506105871) + i_15_);
					for (int i_22_ = 0; i_22_ < i_13_; i_22_++) {
						short[] is = (class_xa_sub3.aShortArrayArray8550[i_21_++]);
						if (is != null) {
							for (int i_23_ = 0; i_23_ < is.length; i_23_++)
								class298_sub53.writeShort(is[i_23_] & 0xffff);
						}
					}
				}
			} else {
				for (int i_24_ = 0; i_24_ < i_13_; i_24_++) {
					int i_25_ = ((i_16_ + i_24_) * (class_xa_sub3.anInt6287 * -506105871) + i_15_);
					for (int i_26_ = 0; i_26_ < i_13_; i_26_++) {
						short[] is = (class_xa_sub3.aShortArrayArray8550[i_25_++]);
						if (is != null) {
							for (int i_27_ = 0; i_27_ < is.length; i_27_++)
								class298_sub53.method3587(is[i_27_] & 0xffff);
						}
					}
				}
			}
			this.anInterface2_392 = (this.aClass_ra_Sub2_386.method5284(5123, class298_sub53.buffer, class298_sub53.offset * 385051775, false));
			this.aClass46_Sub1_393 = new Class46_Sub1(this.aClass_ra_Sub2_386, 5123, null, 1);
		} else
			this.aClass30_Sub2_394 = null;
	}

	void method435(byte[] is, int i) {
		this.aClass46_Sub1_393.method19(5123, is, i * 2);
		method433(this.aClass46_Sub1_393, i);
	}
}
