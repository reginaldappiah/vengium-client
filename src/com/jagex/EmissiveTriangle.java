package com.jagex;/* EmissiveTriangle - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class EmissiveTriangle {
	public int anInt771;
	public int anInt772;
	public int anInt773;
	public int anInt774;
	public int anInt775;
	public EmissiveTriangle aEmissiveTriangle_776;
	public int anInt777;
	int fileID;
	public int anInt779;
	public byte aByte780;
	public int anInt781;
	public int anInt782;
	public int anInt783;
	public int anInt784;
	public int anInt785;

	EmissiveTriangle(int fileID, int i_0_, int i_1_, int i_2_, byte i_3_) {
		this.fileID = fileID * 2033948917;
		anInt773 = 1451019569 * i_0_;
		anInt774 = i_1_ * 1631001933;
		anInt775 = 383276227 * i_2_;
		aByte780 = i_3_;
	}

	public Class182 method953() {
			return Class151.method1643(this.fileID * 108680029);
	}

	EmissiveTriangle create(int i, int i_4_, int i_5_) {
			return new EmissiveTriangle(108680029 * this.fileID, i, i_4_, i_5_, aByte780);
	}

}
