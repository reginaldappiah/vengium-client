package com.jagex;/* Class298_Sub53_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class RsBitsBuffer extends Buffer {
	int anInt9780;
	IsaacCipher aClass449_9781;
	static int[] anIntArray9782 = { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1 };

	public int method3660(int i) {
		try {
			return i * 8 - 1560311085 * this.anInt9780;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ajm.hy(").append(')').toString());
		}
	}

	public boolean method3661() {
		try {
			int i_1_ = ((buffer[offset * 385051775] - this.aClass449_9781.method5916()) & 0xFF);
            return i_1_ >= 128;
        } catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ajm.hb(").append(')').toString());
		}
	}

	public void method3662(byte[] is, int i, int i_2_, byte i_3_) {
		try {
			for (int i_4_ = 0; i_4_ < i_2_; i_4_++)
				is[i + i_4_] = (byte) ((buffer[(offset += 116413311) * 385051775 - 1]) - this.aClass449_9781.method5914(223815758));
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ajm.hj(").append(')').toString());
		}
	}

	public int readBits(int numBits) {
		try {
			int i_6_ = 1560311085 * this.anInt9780 >> 3;
			int i_7_ = 8 - (this.anInt9780 * 1560311085 & 0x7);
			int i_8_ = 0;
			this.anInt9780 += numBits * -1954110811;
			for (/**/; numBits > i_7_; i_7_ = 8) {
				i_8_ += ((buffer[i_6_++] & anIntArray9782[i_7_]) << numBits - i_7_);
				numBits -= i_7_;
			}
			if (numBits == i_7_)
				i_8_ += buffer[i_6_] & anIntArray9782[i_7_];
			else
				i_8_ += buffer[i_6_] >> i_7_ - numBits & anIntArray9782[numBits];
			return i_8_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ajm.he(").append(')').toString());
		}
	}

	public void finishBitAccess() {
		try {
			offset = (this.anInt9780 * 1560311085 + 7) / 8 * 116413311;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ajm.hp(").append(')').toString());
		}
	}

	public RsBitsBuffer(int i) {
		super(i);
	}

	public void setCipher(IsaacCipher isaacCipher) {
		try {
			this.aClass449_9781 = isaacCipher;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ajm.hs(").append(')').toString());
		}
	}

	public int readUnsignedSmart() {
		try {
			int i_9_ = ((buffer[(offset += 116413311) * 385051775 - 1] - this.aClass449_9781.method5914(223815758)) & 0xff);
			if (i_9_ < 128)
				return i_9_;
			return ((i_9_ - 128 << 8) + (((buffer[(offset += 116413311) * 385051775 - 1]) - this.aClass449_9781.method5914(223815758)) & 0xff));
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ajm.hv(").append(')').toString());
		}
	}

	public void initBitAccess() {
		try {
			this.anInt9780 = offset * -1472569640;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ajm.hn(").append(')').toString());
		}
	}

	public void method3668(int i) {
			buffer[(offset += 116413311) * 385051775 - 1] = (byte) (i + this.aClass449_9781.method5914(223815758));
	}
}
