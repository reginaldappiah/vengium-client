package com.jagex;/* Class365_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class365_Sub1 extends Class365 {
	Class365_Sub1 aClass365_Sub1_7721;
	public Region aClass331_7722;
	public byte plane;
	public byte aByte7724;
	int anInt7725;
	public Class302_Sub1[] aClass302_Sub1Array7726;

	abstract boolean method4350(GraphicsToolkit class_ra, int i, int i_0_, byte i_1_);

	abstract int method4354(Light[] lights, int i);

	abstract void method4355(GraphicsToolkit graphicsToolkit, Class365_Sub1 class365_sub1_3_, int i, int i_4_, int i_5_, boolean bool);

	int method4356() {
		try {
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("adp.dh(").append(')').toString());
		}
	}

	abstract void method4357(GraphicsToolkit class_ra, int i);

	public abstract Class334 method4358(GraphicsToolkit graphicsToolkit);

	abstract boolean method4360(int i);

	public abstract int method4361();

	void method4362(int i) {
		try {
			aClass302_Sub1Array7726 = new Class302_Sub1[i];
			for (int i_8_ = 0; i_8_ < aClass302_Sub1Array7726.length; i_8_++)
				aClass302_Sub1Array7726[i_8_] = new Class302_Sub1();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("adp.dx(").append(')').toString());
		}
	}

	public int method4363() {
		try {
			return -method4361();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("adp.bx(").append(')').toString());
		}
	}

	abstract boolean method4364(GraphicsToolkit graphicsToolkit);

	abstract boolean method4366();

	abstract boolean method4376();

	Class365_Sub1(Region class331) {
		aClass331_7722 = class331;
	}

	int method4392(int x, int z, Light[] class298_sub10s) {
		try {
			long l = (aClass331_7722.aLongArrayArrayArray3554[plane][x][z]);
			long l_19_ = 0L;
			int i_20_ = 0;
			for (/**/; l_19_ <= 48L; l_19_ += 16L) {
				int i_21_ = (int) (l >> (int) l_19_ & 0xffffL);
				if (i_21_ <= 0)
					break;
				class298_sub10s[i_20_++] = (aClass331_7722.aClass321Array3558[i_21_ - 1].light);
			}
			for (int i_22_ = i_20_; i_22_ < 4; i_22_++)
				class298_sub10s[i_22_] = null;
			return i_20_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("adp.ds(").append(')').toString());
		}
	}

	abstract Class335 method4394(GraphicsToolkit graphicsToolkit);

	abstract void method4398();

	abstract boolean method4399();

}
