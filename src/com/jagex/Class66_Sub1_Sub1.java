package com.jagex;/* Class66_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class66_Sub1_Sub1 extends Class66_Sub1 {
	int anInt9088;
	Class30_Sub1 aClass30_Sub1_9089;
	int anInt9090;
	int anInt9091;
	OpenGLGraphicsToolkit aClass_ra_Sub2_9092;
	int anInt9093;
	int anInt9094;
	int anInt9095;
	static int[] anIntArray9096 = new int[6];
	static int[][] anIntArrayArray9097 = new int[6][];

	Class30_Sub1 method770() {
		if (this.aClass30_Sub1_9089 == null) {
			MaterialRawLoader interface_ma = (this.aClass_ra_Sub2_9092.textures);
			anIntArray9096[0] = this.anInt9094;
			anIntArray9096[1] = this.anInt9091;
			anIntArray9096[2] = this.anInt9095;
			anIntArray9096[3] = this.anInt9093;
			anIntArray9096[4] = this.anInt9088;
			anIntArray9096[5] = this.anInt9090;
			boolean bool = false;
			int i = 0;
			for (int i_0_ = 0; i_0_ < 6; i_0_++) {
				if (!interface_ma.method170(anIntArray9096[i_0_], (short) 19541))
					return null;
				Class53 class53 = interface_ma.method174(anIntArray9096[i_0_]);
				int i_1_ = class53.aBoolean518 ? 64 : 128;
				if (i_1_ > i)
					i = i_1_;
				if (class53.aByte537 > 0)
					bool = true;
			}
			for (int i_2_ = 0; i_2_ < 6; i_2_++)
				anIntArrayArray9097[i_2_] = interface_ma.method171(anIntArray9096[i_2_], 1.0F, i, i, false, -244439227);
			this.aClass30_Sub1_9089 = new Class30_Sub1((this.aClass_ra_Sub2_9092), Class55.aClass55_560, Class77.aClass77_717, i, bool, anIntArrayArray9097);
		}
		return this.aClass30_Sub1_9089;
	}

	Class66_Sub1_Sub1(OpenGLGraphicsToolkit class_ra_sub2, int i, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_) {
		this.aClass_ra_Sub2_9092 = class_ra_sub2;
		this.anInt9095 = i_4_;
		this.anInt9093 = i_5_;
		this.anInt9088 = i_6_;
		this.anInt9090 = i_7_;
		this.anInt9094 = i;
		this.anInt9091 = i_3_;
	}

	Class30_Sub1 method769() {
		if (this.aClass30_Sub1_9089 == null) {
			MaterialRawLoader interface_ma = (this.aClass_ra_Sub2_9092.textures);
			anIntArray9096[0] = this.anInt9094;
			anIntArray9096[1] = this.anInt9091;
			anIntArray9096[2] = this.anInt9095;
			anIntArray9096[3] = this.anInt9093;
			anIntArray9096[4] = this.anInt9088;
			anIntArray9096[5] = this.anInt9090;
			boolean bool = false;
			int i = 0;
			for (int i_8_ = 0; i_8_ < 6; i_8_++) {
				if (!interface_ma.method170(anIntArray9096[i_8_], (short) 24122))
					return null;
				Class53 class53 = interface_ma.method174(anIntArray9096[i_8_]);
				int i_9_ = class53.aBoolean518 ? 64 : 128;
				if (i_9_ > i)
					i = i_9_;
				if (class53.aByte537 > 0)
					bool = true;
			}
			for (int i_10_ = 0; i_10_ < 6; i_10_++)
				anIntArrayArray9097[i_10_] = interface_ma.method171(anIntArray9096[i_10_], 1.0F, i, i, false, 1735234411);
			this.aClass30_Sub1_9089 = new Class30_Sub1((this.aClass_ra_Sub2_9092), Class55.aClass55_560, Class77.aClass77_717, i, bool, anIntArrayArray9097);
		}
		return this.aClass30_Sub1_9089;
	}
}
