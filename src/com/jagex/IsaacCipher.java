package com.jagex;/* IsaacCipher - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class IsaacCipher {
	int anInt5622;
	static int anInt5623 = 8;
	static int anInt5624 = 1020;
	int anInt5625;
	static int anInt5626 = 256;
	int[] anIntArray5627 = new int[256];
	int anInt5628;
	int[] anIntArray5629 = new int[256];
	int anInt5630;

	public final int method5914(int i) {
		try {
			if (0 == 815637839 * this.anInt5625) {
				method5917((byte) 84);
				this.anInt5625 = -1303269632;
			}
			if (!Loader.useIsaac)
				return 0;
			return (this.anIntArray5629[(this.anInt5625 -= 1857180079) * 815637839]);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("sn.a(").append(')').toString());
		}
	}

	final void method5915(int i) {
		try {
			int i_0_ = -1640531527;
			int i_1_ = -1640531527;
			int i_2_ = -1640531527;
			int i_3_ = -1640531527;
			int i_4_ = -1640531527;
			int i_5_ = -1640531527;
			int i_6_ = -1640531527;
			int i_7_ = -1640531527;
			for (int i_8_ = 0; i_8_ < 4; i_8_++) {
				i_7_ ^= i_6_ << 11;
				i_4_ += i_7_;
				i_6_ += i_5_;
				i_6_ ^= i_5_ >>> 2;
				i_3_ += i_6_;
				i_5_ += i_4_;
				i_5_ ^= i_4_ << 8;
				i_2_ += i_5_;
				i_4_ += i_3_;
				i_4_ ^= i_3_ >>> 16;
				i_1_ += i_4_;
				i_3_ += i_2_;
				i_3_ ^= i_2_ << 10;
				i_0_ += i_3_;
				i_2_ += i_1_;
				i_2_ ^= i_1_ >>> 4;
				i_7_ += i_2_;
				i_1_ += i_0_;
				i_1_ ^= i_0_ << 8;
				i_6_ += i_1_;
				i_0_ += i_7_;
				i_0_ ^= i_7_ >>> 9;
				i_5_ += i_0_;
				i_7_ += i_6_;
			}
			for (int i_9_ = 0; i_9_ < 256; i_9_ += 8) {
				i_7_ += this.anIntArray5629[i_9_];
				i_6_ += this.anIntArray5629[i_9_ + 1];
				i_5_ += this.anIntArray5629[2 + i_9_];
				i_4_ += this.anIntArray5629[3 + i_9_];
				i_3_ += this.anIntArray5629[4 + i_9_];
				i_2_ += this.anIntArray5629[5 + i_9_];
				i_1_ += this.anIntArray5629[6 + i_9_];
				i_0_ += this.anIntArray5629[7 + i_9_];
				i_7_ ^= i_6_ << 11;
				i_4_ += i_7_;
				i_6_ += i_5_;
				i_6_ ^= i_5_ >>> 2;
				i_3_ += i_6_;
				i_5_ += i_4_;
				i_5_ ^= i_4_ << 8;
				i_2_ += i_5_;
				i_4_ += i_3_;
				i_4_ ^= i_3_ >>> 16;
				i_1_ += i_4_;
				i_3_ += i_2_;
				i_3_ ^= i_2_ << 10;
				i_0_ += i_3_;
				i_2_ += i_1_;
				i_2_ ^= i_1_ >>> 4;
				i_7_ += i_2_;
				i_1_ += i_0_;
				i_1_ ^= i_0_ << 8;
				i_6_ += i_1_;
				i_0_ += i_7_;
				i_0_ ^= i_7_ >>> 9;
				i_5_ += i_0_;
				i_7_ += i_6_;
				this.anIntArray5627[i_9_] = i_7_;
				this.anIntArray5627[1 + i_9_] = i_6_;
				this.anIntArray5627[i_9_ + 2] = i_5_;
				this.anIntArray5627[i_9_ + 3] = i_4_;
				this.anIntArray5627[i_9_ + 4] = i_3_;
				this.anIntArray5627[i_9_ + 5] = i_2_;
				this.anIntArray5627[i_9_ + 6] = i_1_;
				this.anIntArray5627[i_9_ + 7] = i_0_;
			}
			for (int i_10_ = 0; i_10_ < 256; i_10_ += 8) {
				i_7_ += this.anIntArray5627[i_10_];
				i_6_ += this.anIntArray5627[i_10_ + 1];
				i_5_ += this.anIntArray5627[i_10_ + 2];
				i_4_ += this.anIntArray5627[i_10_ + 3];
				i_3_ += this.anIntArray5627[i_10_ + 4];
				i_2_ += this.anIntArray5627[5 + i_10_];
				i_1_ += this.anIntArray5627[i_10_ + 6];
				i_0_ += this.anIntArray5627[7 + i_10_];
				i_7_ ^= i_6_ << 11;
				i_4_ += i_7_;
				i_6_ += i_5_;
				i_6_ ^= i_5_ >>> 2;
				i_3_ += i_6_;
				i_5_ += i_4_;
				i_5_ ^= i_4_ << 8;
				i_2_ += i_5_;
				i_4_ += i_3_;
				i_4_ ^= i_3_ >>> 16;
				i_1_ += i_4_;
				i_3_ += i_2_;
				i_3_ ^= i_2_ << 10;
				i_0_ += i_3_;
				i_2_ += i_1_;
				i_2_ ^= i_1_ >>> 4;
				i_7_ += i_2_;
				i_1_ += i_0_;
				i_1_ ^= i_0_ << 8;
				i_6_ += i_1_;
				i_0_ += i_7_;
				i_0_ ^= i_7_ >>> 9;
				i_5_ += i_0_;
				i_7_ += i_6_;
				this.anIntArray5627[i_10_] = i_7_;
				this.anIntArray5627[i_10_ + 1] = i_6_;
				this.anIntArray5627[i_10_ + 2] = i_5_;
				this.anIntArray5627[i_10_ + 3] = i_4_;
				this.anIntArray5627[i_10_ + 4] = i_3_;
				this.anIntArray5627[5 + i_10_] = i_2_;
				this.anIntArray5627[6 + i_10_] = i_1_;
				this.anIntArray5627[i_10_ + 7] = i_0_;
			}
			method5917((byte) -3);
			this.anInt5625 = -1303269632;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("sn.p(").append(')').toString());
		}
	}

	public final int method5916() {
		try {
			if (0 == 815637839 * this.anInt5625) {
				method5917((byte) -13);
				this.anInt5625 = -1303269632;
			}
			if (!Loader.useIsaac)
				return 0;
			return (this.anIntArray5629[815637839 * this.anInt5625 - 1]);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("sn.f(").append(')').toString());
		}
	}

	final void method5917(byte i) {
		try {
			this.anInt5622 += (this.anInt5630 += 1595041509) * 1987923423;
			for (int i_11_ = 0; i_11_ < 256; i_11_++) {
				int i_12_ = this.anIntArray5627[i_11_];
				if (0 == (i_11_ & 0x2)) {
					if (0 == (i_11_ & 0x1))
						this.anInt5628 = (-840519441 * this.anInt5628 ^ (this.anInt5628 * -840519441 << 13)) * 368737807;
					else
						this.anInt5628 = (368737807 * (-840519441 * this.anInt5628 ^ (-840519441 * this.anInt5628 >>> 6)));
				} else if (0 == (i_11_ & 0x1))
					this.anInt5628 = ((-840519441 * this.anInt5628 ^ this.anInt5628 * -840519441 << 2) * 368737807);
				else
					this.anInt5628 = 368737807 * (this.anInt5628 * -840519441 ^ (this.anInt5628 * -840519441) >>> 16);
				this.anInt5628 += 368737807 * (this.anIntArray5627[128 + i_11_ & 0xff]);
				int i_13_;
				this.anIntArray5627[i_11_] = i_13_ = (149032115 * this.anInt5622 + (-840519441 * this.anInt5628 + (this.anIntArray5627[(i_12_ & 0x3fc) >> 2])));
				this.anIntArray5629[i_11_] = (this.anInt5622 = 634094203 * ((this.anIntArray5627[(i_13_ >> 8 & 0x3fc) >> 2]) + i_12_)) * 149032115;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("sn.b(").append(')').toString());
		}
	}

	public IsaacCipher(int[] is) {
		for (int i = 0; i < is.length; i++)
			this.anIntArray5629[i] = is[i];
		method5915(-1926269976);
	}

	static final void method5918(ScriptRuntime class403, int i) {
		try {
			IComponentScripter IComponentScripter = (class403.currentInstrBool ? class403.aIComponentScripter_5247 : class403.aIComponentScripter_5246);
			IComponentDefinition class105 = IComponentScripter.componentDefinition;
			IComponentDefinitionCollection IComponentDefinitionCollection = IComponentScripter.IComponentDefinitionCollection;
			ToMoveIComponentScripts.set2DAngle(class105, class403);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("sn.df(").append(')').toString());
		}
	}

	static DirectXContext method5919(JavaGraphicsToolkit class_ra_sub1, Canvas canvas, int i, int i_14_, int i_15_) {
		try {
			Class52_Sub2_Sub1_Sub1 class52_sub2_sub1_sub1 = new Class52_Sub2_Sub1_Sub1(class_ra_sub1, canvas, i, i_14_);
			return class52_sub2_sub1_sub1;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("sn.n(").append(')').toString());
		}
	}

	static void method5920(int i) {
		try {
			try {
				File file = new File(Class83.userDirectory, "random.dat");
				if (file.exists())
					GameShell.aBufferedFile_6499 = new BufferedFile(new DiskFile(file, "rw", 25L), 24, 0);
				else {
					while_104_: for (int i_16_ = 0; i_16_ < EffectiveVertex.filestore_cache_location.length; i_16_++) {
						for (int i_17_ = 0; i_17_ < Class216.folder_localdrive_location.length; i_17_++) {
							File file_18_ = new File(new StringBuilder().append(Class216.folder_localdrive_location[i_17_]).append(EffectiveVertex.filestore_cache_location[i_16_]).append(File.separatorChar).append("random.dat").toString());
							if (file_18_.exists()) {
								GameShell.aBufferedFile_6499 = new BufferedFile(new DiskFile(file_18_, "rw", 25L), 24, 0);
								break while_104_;
							}
						}
					}
				}
				if (null == GameShell.aBufferedFile_6499) {
					RandomAccessFile randomaccessfile = new RandomAccessFile(file, "rw");
					int i_19_ = randomaccessfile.read();
					randomaccessfile.seek(0L);
					randomaccessfile.write(i_19_);
					randomaccessfile.seek(0L);
					randomaccessfile.close();
					GameShell.aBufferedFile_6499 = new BufferedFile(new DiskFile(file, "rw", 25L), 24, 0);
				}
			} catch (IOException ioexception) {
				/* empty */
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("sn.posX(").append(')').toString());
		}
	}
}
