package com.jagex;/* Class298_Sub32_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public class Class298_Sub32_Sub8 extends Class298_Sub32 {
	static int anInt9363 = 8;
	int[][] anIntArrayArray9364;
	static int anInt9365 = 1024;
	static int anInt9366 = 204;
	static int anInt9367 = 1024;
	int anInt9368;
	static int anInt9369 = 4;
	static int anInt9370 = 81;
	int anInt9371 = 1711388372;
	int anInt9372;
	int anInt9373;
	static int anInt9374 = 409;
	int anInt9375;
	int anInt9376 = -481147336;
	int anInt9377;
	int anInt9378;
	int anInt9379;
	int[] anIntArray9380;
	int[][] anIntArrayArray9381;
	int anInt9382;
	int anInt9383;
	static int anInt9384 = 0;

	void method3181(int i, Buffer class298_sub53) {
		switch (i) {
		case 6:
			this.anInt9379 = class298_sub53.readUShort() * 216958721;
			break;
		case 1:
			this.anInt9376 = class298_sub53.readUByte() * 2087340231;
			break;
		case 0:
			this.anInt9371 = class298_sub53.readUByte() * 427847093;
			break;
		case 5:
			this.anInt9373 = class298_sub53.readUShort() * -83830103;
			break;
		case 4:
			this.anInt9383 = class298_sub53.readUShort() * 414558029;
			break;
		case 3:
			this.anInt9377 = class298_sub53.readUShort() * -984012539;
			break;
		case 2:
			this.anInt9378 = class298_sub53.readUShort() * 1949794091;
			break;
		case 7:
			this.anInt9375 = class298_sub53.readUShort() * 1258867389;
			break;
		}
	}

	int[] method3131(int i, int i_0_) {
		try {
			int[] is = aClass257_7384.method2448(i);
			if (aClass257_7384.aBoolean2810) {
				int i_1_ = 0;
				int i_2_;
				for (i_2_ = (this.anInt9373 * -887199335 + Class250.anIntArray2760[i]); i_2_ < 0; i_2_ += 4096) {
					/* empty */
				}
				for (/**/; i_2_ > 4096; i_2_ -= 4096) {
					/* empty */
				}
				for (/**/; (i_1_ < this.anInt9376 * 1685453047); i_1_++) {
					if (i_2_ < this.anIntArray9380[i_1_]) {
						if (i_0_ == -484575331)
							throw new IllegalStateException();
						break;
					}
				}
				int i_3_ = i_1_ - 1;
				boolean bool = 0 == (i_1_ & 0x1);
				int i_4_ = this.anIntArray9380[i_1_];
				int i_5_ = this.anIntArray9380[i_1_ - 1];
				if (i_2_ > i_5_ + (this.anInt9382 * -387493705) && i_2_ < i_4_ - -387493705 * (this.anInt9382)) {
					for (int i_6_ = 0; i_6_ < Class250.anInt2755 * -1474554145; i_6_++) {
						int i_7_ = 0;
						int i_8_ = (bool ? (this.anInt9383 * 642247045) : -(642247045 * this.anInt9383));
						int i_9_;
						for (i_9_ = (Class250.anIntArray2762[i_6_] + (i_8_ * ((this.anInt9368) * -934471691) >> 12)); i_9_ < 0; i_9_ += 4096) {
							/* empty */
						}
						for (/**/; i_9_ > 4096; i_9_ -= 4096) {
							/* empty */
						}
						for (/**/; i_7_ < (this.anInt9371 * -327362403); i_7_++) {
							if (i_9_ < (this.anIntArrayArray9381[i_3_][i_7_])) {
								if (i_0_ == -484575331)
									throw new IllegalStateException();
								break;
							}
						}
						int i_10_ = i_7_ - 1;
						int i_11_ = (this.anIntArrayArray9381[i_3_][i_10_]);
						int i_12_ = (this.anIntArrayArray9381[i_3_][i_7_]);
						if (i_9_ > -387493705 * (this.anInt9382) + i_11_ && i_9_ < i_12_ - (-387493705 * (this.anInt9382)))
							is[i_6_] = (this.anIntArrayArray9364[i_3_][i_10_]);
						else
							is[i_6_] = 0;
					}
				} else
					Class425.method5740(is, 0, Class250.anInt2755 * -1474554145, 0);
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("agu.i(").append(')').toString());
		}
	}

	public Class298_Sub32_Sub8() {
		super(0, true);
		this.anInt9373 = 0;
		this.anInt9383 = -694340608;
		this.anInt9375 = 590017536;
		this.anInt9378 = -1398133837;
		this.anInt9377 = 1124904956;
		this.anInt9379 = 393787217;
	}

	void method3133(int i) {
		try {
			method3183((short) 917);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("agu.posX(").append(')').toString());
		}
	}

	void method3137(int i, Buffer buffer) {
		try {
			switch (i) {
			case 6:
				this.anInt9379 = buffer.readUShort() * 216958721;
				break;
			case 1:
				this.anInt9376 = buffer.readUByte() * 2087340231;
				break;
			case 0:
				this.anInt9371 = buffer.readUByte() * 427847093;
				break;
			case 5:
				this.anInt9373 = buffer.readUShort() * -83830103;
				break;
			case 4:
				this.anInt9383 = buffer.readUShort() * 414558029;
				break;
			case 3:
				this.anInt9377 = buffer.readUShort() * -984012539;
				break;
			case 2:
				this.anInt9378 = buffer.readUShort() * 1949794091;
				break;
			case 7:
				this.anInt9375 = buffer.readUShort() * 1258867389;
				break;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("agu.r(").append(')').toString());
		}
	}

	int[] method3182(int i) {
		int[] is = aClass257_7384.method2448(i);
		if (aClass257_7384.aBoolean2810) {
			int i_14_ = 0;
			int i_15_;
			for (i_15_ = (this.anInt9373 * -887199335 + Class250.anIntArray2760[i]); i_15_ < 0; i_15_ += 4096) {
				/* empty */
			}
			for (/**/; i_15_ > 4096; i_15_ -= 4096) {
				/* empty */
			}
			for (/**/; (i_14_ < this.anInt9376 * 1685453047 && (i_15_ >= this.anIntArray9380[i_14_])); i_14_++) {
				/* empty */
			}
			int i_16_ = i_14_ - 1;
			boolean bool = 0 == (i_14_ & 0x1);
			int i_17_ = this.anIntArray9380[i_14_];
			int i_18_ = this.anIntArray9380[i_14_ - 1];
			if ((i_15_ > i_18_ + this.anInt9382 * -387493705) && i_15_ < i_17_ - -387493705 * (this.anInt9382)) {
				for (int i_19_ = 0; i_19_ < Class250.anInt2755 * -1474554145; i_19_++) {
					int i_20_ = 0;
					int i_21_ = (bool ? this.anInt9383 * 642247045 : -(642247045 * this.anInt9383));
					int i_22_;
					for (i_22_ = (Class250.anIntArray2762[i_19_] + ((i_21_ * (this.anInt9368 * -934471691)) >> 12)); i_22_ < 0; i_22_ += 4096) {
						/* empty */
					}
					for (/**/; i_22_ > 4096; i_22_ -= 4096) {
						/* empty */
					}
					for (/**/; (i_20_ < (this.anInt9371 * -327362403) && i_22_ >= (this.anIntArrayArray9381[i_16_][i_20_])); i_20_++) {
						/* empty */
					}
					int i_23_ = i_20_ - 1;
					int i_24_ = (this.anIntArrayArray9381[i_16_][i_23_]);
					int i_25_ = (this.anIntArrayArray9381[i_16_][i_20_]);
					if (i_22_ > -387493705 * (this.anInt9382) + i_24_ && i_22_ < i_25_ - -387493705 * this.anInt9382)
						is[i_19_] = (this.anIntArrayArray9364[i_16_][i_23_]);
					else
						is[i_19_] = 0;
				}
			} else
				Class425.method5740(is, 0, Class250.anInt2755 * -1474554145, 0);
		}
		return is;
	}

	void method3183(short i) {
		try {
			Random random = new Random((long) (1685453047 * (this.anInt9376)));
			this.anInt9382 = 1871219975 * (1732409601 * this.anInt9379 / 2);
			this.anInt9368 = (4096 / (-327362403 * this.anInt9371) * 1303485533);
			this.anInt9372 = (4096 / (1685453047 * this.anInt9376) * -1986852725);
			int i_26_ = -934471691 * this.anInt9368 / 2;
			int i_27_ = this.anInt9372 * 1194794787 / 2;
			this.anIntArray9380 = (new int[1 + 1685453047 * this.anInt9376]);
			this.anIntArrayArray9381 = (new int[this.anInt9376 * 1685453047][1 + this.anInt9371 * -327362403]);
			this.anIntArrayArray9364 = (new int[1685453047 * this.anInt9376][this.anInt9371 * -327362403]);
			this.anIntArray9380[0] = 0;
			for (int i_28_ = 0; i_28_ < 1685453047 * this.anInt9376; i_28_++) {
				if (i_28_ > 0) {
					int i_29_ = this.anInt9372 * 1194794787;
					int i_30_ = (((TranslatedCanvas.method3039(random, 4096, (byte) -30) - 2048) * (this.anInt9377 * -1888601139)) >> 12);
					i_29_ += i_30_ * i_27_ >> 12;
					this.anIntArray9380[i_28_] = i_29_ + (this.anIntArray9380[i_28_ - 1]);
				}
				this.anIntArrayArray9381[i_28_][0] = 0;
				for (int i_31_ = 0; (i_31_ < this.anInt9371 * -327362403); i_31_++) {
					if (i_31_ > 0) {
						int i_32_ = (-934471691 * this.anInt9368);
						int i_33_ = (((TranslatedCanvas.method3039(random, 4096, (byte) -82) - 2048) * (this.anInt9378 * -1484830845)) >> 12);
						i_32_ += i_33_ * i_26_ >> 12;
						this.anIntArrayArray9381[i_28_][i_31_] = i_32_ + (this.anIntArrayArray9381[i_28_][i_31_ - 1]);
					}
					this.anIntArrayArray9364[i_28_][i_31_] = ((this.anInt9375 * -762707819 > 0) ? 4096 - (TranslatedCanvas.method3039(random, (this.anInt9375 * -762707819), (byte) 23)) : 4096);
				}
				this.anIntArrayArray9381[i_28_][-327362403 * this.anInt9371] = 4096;
			}
			this.anIntArray9380[1685453047 * this.anInt9376] = 4096;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("agu.ac(").append(')').toString());
		}
	}

	void method3184() {
		method3183((short) 917);
	}

	void method3185() {
		method3183((short) 917);
	}

	void method3186() {
		method3183((short) 917);
	}

	void method3187(int i, Buffer class298_sub53) {
		switch (i) {
		case 6:
			this.anInt9379 = class298_sub53.readUShort() * 216958721;
			break;
		case 1:
			this.anInt9376 = class298_sub53.readUByte() * 2087340231;
			break;
		case 0:
			this.anInt9371 = class298_sub53.readUByte() * 427847093;
			break;
		case 5:
			this.anInt9373 = class298_sub53.readUShort() * -83830103;
			break;
		case 4:
			this.anInt9383 = class298_sub53.readUShort() * 414558029;
			break;
		case 3:
			this.anInt9377 = class298_sub53.readUShort() * -984012539;
			break;
		case 2:
			this.anInt9378 = class298_sub53.readUShort() * 1949794091;
			break;
		case 7:
			this.anInt9375 = class298_sub53.readUShort() * 1258867389;
			break;
		}
	}

	int[] method3188(int i) {
		int[] is = aClass257_7384.method2448(i);
		if (aClass257_7384.aBoolean2810) {
			int i_34_ = 0;
			int i_35_;
			for (i_35_ = (this.anInt9373 * -887199335 + Class250.anIntArray2760[i]); i_35_ < 0; i_35_ += 4096) {
				/* empty */
			}
			for (/**/; i_35_ > 4096; i_35_ -= 4096) {
				/* empty */
			}
			for (/**/; (i_34_ < this.anInt9376 * 1685453047 && (i_35_ >= this.anIntArray9380[i_34_])); i_34_++) {
				/* empty */
			}
			int i_36_ = i_34_ - 1;
			boolean bool = 0 == (i_34_ & 0x1);
			int i_37_ = this.anIntArray9380[i_34_];
			int i_38_ = this.anIntArray9380[i_34_ - 1];
			if ((i_35_ > i_38_ + this.anInt9382 * -387493705) && i_35_ < i_37_ - -387493705 * (this.anInt9382)) {
				for (int i_39_ = 0; i_39_ < Class250.anInt2755 * -1474554145; i_39_++) {
					int i_40_ = 0;
					int i_41_ = (bool ? this.anInt9383 * 642247045 : -(642247045 * this.anInt9383));
					int i_42_;
					for (i_42_ = (Class250.anIntArray2762[i_39_] + ((i_41_ * (this.anInt9368 * -934471691)) >> 12)); i_42_ < 0; i_42_ += 4096) {
						/* empty */
					}
					for (/**/; i_42_ > 4096; i_42_ -= 4096) {
						/* empty */
					}
					for (/**/; (i_40_ < (this.anInt9371 * -327362403) && i_42_ >= (this.anIntArrayArray9381[i_36_][i_40_])); i_40_++) {
						/* empty */
					}
					int i_43_ = i_40_ - 1;
					int i_44_ = (this.anIntArrayArray9381[i_36_][i_43_]);
					int i_45_ = (this.anIntArrayArray9381[i_36_][i_40_]);
					if (i_42_ > -387493705 * (this.anInt9382) + i_44_ && i_42_ < i_45_ - -387493705 * this.anInt9382)
						is[i_39_] = (this.anIntArrayArray9364[i_36_][i_43_]);
					else
						is[i_39_] = 0;
				}
			} else
				Class425.method5740(is, 0, Class250.anInt2755 * -1474554145, 0);
		}
		return is;
	}
}
