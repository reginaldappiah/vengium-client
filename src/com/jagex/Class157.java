package com.jagex;/* Class157 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class157 {
	MaterialRawLoader anInterface_ma1614;
	NativeToolkit aClass_ra_Sub3_1615;
	SoftCache aClass348_1616 = new SoftCache(256);

	Class157(NativeToolkit class_ra_sub3, MaterialRawLoader interface_ma) {
		this.aClass_ra_Sub3_1615 = class_ra_sub3;
		this.anInterface_ma1614 = interface_ma;
	}

	Interface9_Impl2 method1695(int i, int i_0_) {
		long l = (long) (i_0_ << 16 | i);
		Object object = this.aClass348_1616.get(l);
		if (object != null)
			return (Interface9_Impl2) object;
		if (!this.anInterface_ma1614.method170(i, (short) 28916))
			return null;
		Class53 class53 = this.anInterface_ma1614.method174(i);
		if (i_0_ == -1)
			i_0_ = (class53.aBoolean518 ? 64 : (this.aClass_ra_Sub3_1615.anInt8271));
		Interface9_Impl2 interface9_impl2;
		if (!class53.aBoolean543 || !this.aClass_ra_Sub3_1615.method5054()) {
			int[] is;
			if (class53.anInt528 * -2138060883 == 2 || !Class298_Sub32_Sub31.method3339(class53.aByte529, -2037069646))
				is = this.anInterface_ma1614.method172(i, 0.7F, i_0_, i_0_, false, (byte) 2);
			else
				is = this.anInterface_ma1614.method171(i, 0.7F, i_0_, i_0_, true, -470804931);
			interface9_impl2 = this.aClass_ra_Sub3_1615.method5350(i_0_, i_0_, true, is);
		} else {
			float[] fs = this.anInterface_ma1614.method181(i, 0.7F, i_0_, i_0_, false, (byte) -110);
			interface9_impl2 = this.aClass_ra_Sub3_1615.method5352(Class55.aClass55_557, i_0_, i_0_, true, fs);
		}
		interface9_impl2.method80(class53.aBoolean540, class53.aBoolean541);
		this.aClass348_1616.put(interface9_impl2, l);
		return interface9_impl2;
	}

	void method1696() {
		this.aClass348_1616.method4186(5);
	}

	void method1697() {
		this.aClass348_1616.clear();
	}

	Interface9_Impl2 method1698(int i) {
		return method1695(i, -1);
	}
}
