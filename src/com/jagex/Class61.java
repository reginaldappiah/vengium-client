package com.jagex;/* Class61 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class61 {
	MaterialRawLoader anInterface_ma604;
	SoftCache aClass348_605 = new SoftCache(256);
	OpenGLGraphicsToolkit aClass_ra_Sub2_606;

	Class30_Sub2 method715(int i) {
		return method716(i, -1);
	}

	Class30_Sub2 method716(int i, int i_0_) {
		Object object = this.aClass348_605.get((long) i);
		if (object != null)
			return (Class30_Sub2) object;
		if (!this.anInterface_ma604.method170(i, (short) 25920))
			return null;
		Class53 class53 = this.anInterface_ma604.method174(i);
		if (i_0_ == -1)
			i_0_ = (class53.aBoolean518 ? 64 : (this.aClass_ra_Sub2_606.anInt8118));
		Class30_Sub2 class30_sub2;
		if (!class53.aBoolean543 || !this.aClass_ra_Sub2_606.method5054()) {
			int[] is;
			if (class53.anInt528 * -2138060883 == 2 || !Class298_Sub32_Sub31.method3339(class53.aByte529, -769385379))
				is = this.anInterface_ma604.method172(i, 0.7F, i_0_, i_0_, false, (byte) 2);
			else
				is = this.anInterface_ma604.method171(i, 0.7F, i_0_, i_0_, true, 1090878298);
			class30_sub2 = new Class30_Sub2(this.aClass_ra_Sub2_606, 3553, i_0_, i_0_, class53.aByte537 != 0, is, 0, 0, false);
		} else {
			float[] fs = this.anInterface_ma604.method181(i, 0.7F, i_0_, i_0_, false, (byte) -119);
			class30_sub2 = new Class30_Sub2(this.aClass_ra_Sub2_606, 3553, Class55.aClass55_557, Class77.aClass77_714, i_0_, i_0_, class53.aByte537 != 0, fs, Class55.aClass55_557);
		}
		class30_sub2.method420(class53.aBoolean540, class53.aBoolean541);
		this.aClass348_605.put(class30_sub2, (long) i);
		return class30_sub2;
	}

	void method717() {
		this.aClass348_605.method4186(5);
	}

	void method718() {
		this.aClass348_605.clear();
	}

	Class61(OpenGLGraphicsToolkit class_ra_sub2, MaterialRawLoader interface_ma) {
		this.aClass_ra_Sub2_606 = class_ra_sub2;
		this.anInterface_ma604 = interface_ma;
	}
}
