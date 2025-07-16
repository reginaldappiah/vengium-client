package com.jagex;/* Class213_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class213_Sub2_Sub1 extends Class213_Sub2 {
	byte[] aByteArray9168;

	byte[] method1977(int i, int i_0_, int i_1_) {
		this.aByteArray9168 = new byte[i * i_0_ * i_1_ * 2];
		method1958(i, i_0_, i_1_);
		return this.aByteArray9168;
	}

	void method1976(int i, byte i_2_) {
		int i_3_ = i * 2;
		int i_4_ = i_2_ & 0xff;
		this.aByteArray9168[i_3_++] = (byte) -1;
		this.aByteArray9168[i_3_] = (byte) (3 * i_4_ >> 5);
	}

	Class213_Sub2_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}
}
