package com.jagex;/* Class164 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

public class Class164 {
	Interface9_Impl2 anInterface9_Impl2_1686;
	static int anInt1687 = 128;
	int anInt1688;
	Class169 aClass169_1689;
	int anInt1690;
	static byte[] aByteArray1691;
	boolean aBoolean1692 = true;
	int anInt1693 = -1;
	int anInt1694;
	Interface7_Impl2 anInterface7_Impl2_1695;
	NativeToolkit aClass_ra_Sub3_1696;
	int anInt1697;
	int anInt1698;
	static int[] anIntArray1699;
	static int anInt1700 = 7;

	void method1778(Class137 class137) {
		method1779(class137, this.anInterface7_Impl2_1695, 0, this.anInt1694);
	}

	void method1779(Class137 class137, Interface7_Impl2 interface7_impl2, int i, int i_0_) {
		if (i_0_ > 0) {
			method1780();
			this.aClass_ra_Sub3_1696.method5384(interface7_impl2);
			class137.anInterface9_Impl2_1517 = this.anInterface9_Impl2_1686;
			class137.anInt1532 = this.anInt1697;
			class137.anInt1533 = (this.anInt1698 - this.anInt1697 + 1);
			class137.anInt1534 = i;
			class137.anInt1514 = i_0_;
			class137.method1507(0);
		}
	}

	Class164(NativeToolkit class_ra_sub3, Class169 class169, Class_xa_Sub1 class_xa_sub1, int i, int i_1_, int i_2_, int i_3_, int i_4_) {
		this.aClass_ra_Sub3_1696 = class_ra_sub3;
		this.aClass169_1689 = class169;
		this.anInt1690 = i_3_;
		this.anInt1688 = i_4_;
		int i_5_ = 1 << i_2_;
		int i_6_ = 0;
		int i_7_ = i << i_2_;
		int i_8_ = i_1_ << i_2_;
		for (int i_9_ = 0; i_9_ < i_5_; i_9_++) {
			int i_10_ = ((i_8_ + i_9_) * (class_xa_sub1.anInt6287 * -506105871) + i_7_);
			for (int i_11_ = 0; i_11_ < i_5_; i_11_++) {
				short[] is = (class_xa_sub1.aShortArrayArray8456[i_10_++]);
				if (is != null)
					i_6_ += is.length;
			}
		}
		if (i_6_ > 0) {
			this.anInt1698 = -2147483648;
			this.anInt1697 = 2147483647;
			this.anInterface7_Impl2_1695 = this.aClass_ra_Sub3_1696.method5381(false);
			this.anInterface7_Impl2_1695.method113(i_6_);
			ByteBuffer bytebuffer = this.aClass_ra_Sub3_1696.aByteBuffer8216;
			bytebuffer.clear();
			for (int i_12_ = 0; i_12_ < i_5_; i_12_++) {
				int i_13_ = ((i_8_ + i_12_) * (class_xa_sub1.anInt6287 * -506105871) + i_7_);
				for (int i_14_ = 0; i_14_ < i_5_; i_14_++) {
					short[] is = (class_xa_sub1.aShortArrayArray8456[i_13_++]);
					if (is != null) {
						for (int i_15_ = 0; i_15_ < is.length; i_15_++) {
							int i_16_ = is[i_15_] & 0xffff;
							if (i_16_ < this.anInt1697)
								this.anInt1697 = i_16_;
							if (i_16_ > this.anInt1698)
								this.anInt1698 = i_16_;
							bytebuffer.putShort((short) i_16_);
						}
					}
				}
			}
			this.anInterface7_Impl2_1695.method63(0, bytebuffer.position(), this.aClass_ra_Sub3_1696.aLong8217);
			this.anInt1694 = i_6_ / 3;
		} else {
			this.anInt1694 = 0;
			this.anInterface9_Impl2_1686 = null;
		}
	}

	void method1780() {
		if (this.aBoolean1692) {
			this.aBoolean1692 = false;
			byte[] is = this.aClass169_1689.aByteArray1734;
			int i = 0;
			int i_17_ = this.aClass169_1689.anInt1730;
			int i_18_ = (this.anInt1690 + (this.anInt1688 * (this.aClass169_1689.anInt1730)));
			for (int i_19_ = -128; i_19_ < 0; i_19_++) {
				i = (i << 8) - i;
				for (int i_20_ = -128; i_20_ < 0; i_20_++) {
					if (is[i_18_++] != 0)
						i++;
				}
				i_18_ += i_17_ - 128;
			}
			if (this.anInterface9_Impl2_1686 != null && this.anInt1693 == i)
				this.aBoolean1692 = false;
			else {
				this.anInt1693 = i;
				int i_21_ = 0;
				i_18_ = (this.anInt1690 + this.anInt1688 * i_17_);
				if (this.aClass_ra_Sub3_1696.method5348(Class55.aClass55_567, Class77.aClass77_717)) {
					if (aByteArray1691 == null)
						aByteArray1691 = new byte[16384];
					byte[] is_22_ = aByteArray1691;
					for (int i_23_ = -128; i_23_ < 0; i_23_++) {
						for (int i_24_ = -128; i_24_ < 0; i_24_++) {
							if (is[i_18_] != 0)
								is_22_[i_21_++] = (byte) 68;
							else {
								int i_25_ = 0;
								if (is[i_18_ - 1] != 0)
									i_25_++;
								if (is[i_18_ + 1] != 0)
									i_25_++;
								if (is[i_18_ - i_17_] != 0)
									i_25_++;
								if (is[i_18_ + i_17_] != 0)
									i_25_++;
								is_22_[i_21_++] = (byte) (17 * i_25_);
							}
							i_18_++;
						}
						i_18_ += (this.aClass169_1689.anInt1730) - 128;
					}
					if (this.anInterface9_Impl2_1686 == null) {
						this.anInterface9_Impl2_1686 = (this.aClass_ra_Sub3_1696.method5351(Class55.aClass55_567, 128, 128, false, aByteArray1691));
						this.anInterface9_Impl2_1686.method80(false, false);
					} else
						this.anInterface9_Impl2_1686.method82(0, 0, 128, 128, aByteArray1691, Class55.aClass55_567, 0, 128);
				} else {
					if (anIntArray1699 == null)
						anIntArray1699 = new int[16384];
					int[] is_26_ = anIntArray1699;
					for (int i_27_ = -128; i_27_ < 0; i_27_++) {
						for (int i_28_ = -128; i_28_ < 0; i_28_++) {
							if (is[i_18_] != 0)
								is_26_[i_21_++] = 1140850688;
							else {
								int i_29_ = 0;
								if (is[i_18_ - 1] != 0)
									i_29_++;
								if (is[i_18_ + 1] != 0)
									i_29_++;
								if (is[i_18_ - i_17_] != 0)
									i_29_++;
								if (is[i_18_ + i_17_] != 0)
									i_29_++;
								is_26_[i_21_++] = 17 * i_29_ << 24;
							}
							i_18_++;
						}
						i_18_ += (this.aClass169_1689.anInt1730) - 128;
					}
					if (this.anInterface9_Impl2_1686 == null) {
						this.anInterface9_Impl2_1686 = this.aClass_ra_Sub3_1696.method5350(128, 128, false, anIntArray1699);
						this.anInterface9_Impl2_1686.method80(false, false);
					} else
						this.anInterface9_Impl2_1686.method81(0, 0, 128, 128, anIntArray1699, 0, 128);
				}
			}
		}
	}
}
