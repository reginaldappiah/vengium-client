package com.jagex;/* Class66_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class66_Sub2_Sub1 extends Class66_Sub2 {
	static int[][] anIntArrayArray9101;
	Interface9_Impl1 anInterface9_Impl1_9102;
	int anInt9103;
	int anInt9104;
	int anInt9105;
	NativeToolkit aClass_ra_Sub3_9106;
	int anInt9107;
	int anInt9108;
	static int[] anIntArray9109 = new int[6];
	int anInt9110;

	Interface9_Impl1 method774() {
		if (this.anInterface9_Impl1_9102 == null) {
			MaterialRawLoader interface_ma = (this.aClass_ra_Sub3_9106.textures);
			anIntArray9109[0] = this.anInt9103;
			anIntArray9109[1] = this.anInt9104;
			anIntArray9109[2] = this.anInt9105;
			anIntArray9109[3] = this.anInt9110;
			anIntArray9109[4] = this.anInt9107;
			anIntArray9109[5] = this.anInt9108;
			boolean bool = false;
			int i = 0;
			for (int i_0_ = 0; i_0_ < 6; i_0_++) {
				if (!interface_ma.method170(anIntArray9109[i_0_], (short) 4664))
					return null;
				Class53 class53 = interface_ma.method174(anIntArray9109[i_0_]);
				int i_1_ = class53.aBoolean518 ? 64 : 128;
				if (i_1_ > i)
					i = i_1_;
				if (class53.aByte537 > 0)
					bool = true;
			}
			for (int i_2_ = 0; i_2_ < 6; i_2_++)
				anIntArrayArray9101[i_2_] = interface_ma.method171(anIntArray9109[i_2_], 1.0F, i, i, false, 1504533027);
			this.anInterface9_Impl1_9102 = this.aClass_ra_Sub3_9106.method5415(i, bool, anIntArrayArray9101);
		}
		return this.anInterface9_Impl1_9102;
	}

	Class66_Sub2_Sub1(NativeToolkit class_ra_sub3, int i, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_) {
		this.aClass_ra_Sub3_9106 = class_ra_sub3;
		this.anInt9105 = i_4_;
		this.anInt9110 = i_5_;
		this.anInt9107 = i_6_;
		this.anInt9108 = i_7_;
		this.anInt9103 = i;
		this.anInt9104 = i_3_;
	}

	static {
		anIntArrayArray9101 = new int[6][];
	}

	Interface9_Impl1 method773() {
		if (this.anInterface9_Impl1_9102 == null) {
			MaterialRawLoader interface_ma = (this.aClass_ra_Sub3_9106.textures);
			anIntArray9109[0] = this.anInt9103;
			anIntArray9109[1] = this.anInt9104;
			anIntArray9109[2] = this.anInt9105;
			anIntArray9109[3] = this.anInt9110;
			anIntArray9109[4] = this.anInt9107;
			anIntArray9109[5] = this.anInt9108;
			boolean bool = false;
			int i = 0;
			for (int i_8_ = 0; i_8_ < 6; i_8_++) {
				if (!interface_ma.method170(anIntArray9109[i_8_], (short) 30897))
					return null;
				Class53 class53 = interface_ma.method174(anIntArray9109[i_8_]);
				int i_9_ = class53.aBoolean518 ? 64 : 128;
				if (i_9_ > i)
					i = i_9_;
				if (class53.aByte537 > 0)
					bool = true;
			}
			for (int i_10_ = 0; i_10_ < 6; i_10_++)
				anIntArrayArray9101[i_10_] = interface_ma.method171(anIntArray9109[i_10_], 1.0F, i, i, false, -1308282836);
			this.anInterface9_Impl1_9102 = this.aClass_ra_Sub3_9106.method5415(i, bool, anIntArrayArray9101);
		}
		return this.anInterface9_Impl1_9102;
	}
}
