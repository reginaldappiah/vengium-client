package com.jagex;/* Class103 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class103 {
	long aLong1095;
	int anInt1096;
	Buffer aClass298_Sub53_1097;
	int[] anIntArray1098;
	static int anInt1099 = 2;
	static int anInt1100 = 0;
	int[] anIntArray1101;
	static int anInt1102 = 500000;
	int[] anIntArray1103;
	static byte[] aByteArray1104 = { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
	int[] anIntArray1105;
	static int anInt1106 = 1;
	int anInt1107;
	static int anInt1108 = 3;

	void method1086(byte[] is) {
		this.aClass298_Sub53_1097.buffer = is;
		this.aClass298_Sub53_1097.offset = 1164133110;
		int i = this.aClass298_Sub53_1097.readUShort();
		this.anInt1096 = this.aClass298_Sub53_1097.readUShort();
		this.anInt1107 = 500000;
		this.anIntArray1103 = new int[i];
		int i_0_ = 0;
		while (i_0_ < i) {
			int i_1_ = this.aClass298_Sub53_1097.readInt();
			int i_2_ = this.aClass298_Sub53_1097.readInt();
			if (i_1_ == 1297379947) {
				this.anIntArray1103[i_0_] = (this.aClass298_Sub53_1097.offset * 385051775);
				i_0_++;
			}
			this.aClass298_Sub53_1097.offset += i_2_ * 116413311;
		}
		this.aLong1095 = 0L;
		this.anIntArray1098 = new int[i];
		for (i_0_ = 0; i_0_ < i; i_0_++)
			this.anIntArray1098[i_0_] = this.anIntArray1103[i_0_];
		this.anIntArray1105 = new int[i];
		this.anIntArray1101 = new int[i];
	}

	void method1087() {
		this.aClass298_Sub53_1097.buffer = null;
		this.anIntArray1103 = null;
		this.anIntArray1098 = null;
		this.anIntArray1105 = null;
		this.anIntArray1101 = null;
	}

	int method1088() {
		return this.anIntArray1098.length;
	}

	void method1089(int i) {
		this.aClass298_Sub53_1097.offset = this.anIntArray1098[i] * 116413311;
	}

	Class103(byte[] is) {
		this.aClass298_Sub53_1097 = new Buffer(null);
		method1086(is);
	}

	void method1090() {
		this.aClass298_Sub53_1097.offset = -116413311;
	}

	void method1091(int i) {
		int i_3_ = this.aClass298_Sub53_1097.method3609();
		this.anIntArray1105[i] += i_3_;
	}

	int method1092(int i) {
		int i_4_ = method1093(i);
		return i_4_;
	}

	int method1093(int i) {
		int i_5_ = (this.aClass298_Sub53_1097.buffer[this.aClass298_Sub53_1097.offset * 385051775]);
		if (i_5_ < 0) {
			i_5_ &= 0xff;
			this.anIntArray1101[i] = i_5_;
			this.aClass298_Sub53_1097.offset += 116413311;
		} else
			i_5_ = this.anIntArray1101[i];
		if (i_5_ == 240 || i_5_ == 247) {
			int i_6_ = this.aClass298_Sub53_1097.method3609();
			if (i_5_ == 247 && i_6_ > 0) {
				int i_7_ = ((this.aClass298_Sub53_1097.buffer[(this.aClass298_Sub53_1097.offset * 385051775)]) & 0xff);
				if (i_7_ >= 241 && i_7_ <= 243 || i_7_ == 246 || i_7_ == 248 || i_7_ >= 250 && i_7_ <= 252 || i_7_ == 254) {
					this.aClass298_Sub53_1097.offset += 116413311;
					this.anIntArray1101[i] = i_7_;
					return method1094(i, i_7_);
				}
			}
			this.aClass298_Sub53_1097.offset += i_6_ * 116413311;
			return 0;
		}
		return method1094(i, i_5_);
	}

	int method1094(int i, int i_8_) {
		if (i_8_ == 255) {
			int i_9_ = this.aClass298_Sub53_1097.readUByte();
			int i_10_ = this.aClass298_Sub53_1097.method3609();
			if (i_9_ == 47) {
				this.aClass298_Sub53_1097.offset += i_10_ * 116413311;
				return 1;
			}
			if (i_9_ == 81) {
				int i_11_ = this.aClass298_Sub53_1097.readUTriByte();
				i_10_ -= 3;
				int i_12_ = this.anIntArray1105[i];
				this.aLong1095 += (long) i_12_ * (long) (this.anInt1107 - i_11_);
				this.anInt1107 = i_11_;
				this.aClass298_Sub53_1097.offset += i_10_ * 116413311;
				return 2;
			}
			this.aClass298_Sub53_1097.offset += i_10_ * 116413311;
			return 3;
		}
		byte i_13_ = aByteArray1104[i_8_ - 128];
		int i_14_ = i_8_;
		if (i_13_ >= 1)
			i_14_ |= this.aClass298_Sub53_1097.readUByte() << 8;
		if (i_13_ >= 2)
			i_14_ |= this.aClass298_Sub53_1097.readUByte() << 16;
		return i_14_;
	}

	long method1095(int i) {
		return (this.aLong1095 + (long) i * (long) this.anInt1107);
	}

	int method1096() {
		int i = this.anIntArray1098.length;
		int i_15_ = -1;
		int i_16_ = 2147483647;
		for (int i_17_ = 0; i_17_ < i; i_17_++) {
			if (this.anIntArray1098[i_17_] >= 0 && this.anIntArray1105[i_17_] < i_16_) {
				i_15_ = i_17_;
				i_16_ = this.anIntArray1105[i_17_];
			}
		}
		return i_15_;
	}

	boolean method1097() {
		int i = this.anIntArray1098.length;
		for (int i_18_ = 0; i_18_ < i; i_18_++) {
			if (this.anIntArray1098[i_18_] >= 0)
				return false;
		}
		return true;
	}

	void method1098(int i) {
		this.anIntArray1098[i] = this.aClass298_Sub53_1097.offset * 385051775;
	}

	boolean method1099() {
		return this.aClass298_Sub53_1097.buffer != null;
	}

	Class103() {
		this.aClass298_Sub53_1097 = new Buffer(null);
	}

	void method1100(long l) {
		this.aLong1095 = l;
		int i = this.anIntArray1098.length;
		for (int i_19_ = 0; i_19_ < i; i_19_++) {
			this.anIntArray1105[i_19_] = 0;
			this.anIntArray1101[i_19_] = 0;
			this.aClass298_Sub53_1097.offset = this.anIntArray1103[i_19_] * 116413311;
			method1091(i_19_);
			this.anIntArray1098[i_19_] = this.aClass298_Sub53_1097.offset * 385051775;
		}
	}
}
