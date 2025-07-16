package com.jagex;/* RsByteBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import com.jagex.utils.StringUtils;

import java.math.BigInteger;

public class Buffer extends Node {
	public byte[] buffer;
	public int offset;
	static int[] xtea;
	static int[] anIntArray7614 = new int[256];
	public static long[] CRC_64;

	public void method3584(long l) {
			buffer[(offset += 116413311) * 385051775 - 1] = (byte) (int) (l >> 32);
			buffer[(offset += 116413311) * 385051775 - 1] = (byte) (int) (l >> 24);
			buffer[(offset += 116413311) * 385051775 - 1] = (byte) (int) (l >> 16);
			buffer[(offset += 116413311) * 385051775 - 1] = (byte) (int) (l >> 8);
			buffer[(offset += 116413311) * 385051775 - 1] = (byte) (int) l;
	}

	public void writeByte(int i) {
			buffer[(offset += 116413311) * 385051775 - 1] = (byte) i;
	}

	public void writeShort(int i) {
			buffer[(offset += 116413311) * 385051775 - 1] = (byte) (i >> 8);
			buffer[(offset += 116413311) * 385051775 - 1] = (byte) i;
	}

	public void method3587(int i) {
			buffer[(offset += 116413311) * 385051775 - 1] = (byte) i;
			buffer[(offset += 116413311) * 385051775 - 1] = (byte) (i >> 8);
	}

	public void writeInt(int i) {
			buffer[(offset += 116413311) * 385051775 - 1] = (byte) (i >> 24);
			buffer[(offset += 116413311) * 385051775 - 1] = (byte) (i >> 16);
			buffer[(offset += 116413311) * 385051775 - 1] = (byte) (i >> 8);
			buffer[(offset += 116413311) * 385051775 - 1] = (byte) i;
	}

	public void writeLEInt(int i) {
			buffer[(offset += 116413311) * 385051775 - 1] = (byte) i;
			buffer[(offset += 116413311) * 385051775 - 1] = (byte) (i >> 8);
			buffer[(offset += 116413311) * 385051775 - 1] = (byte) (i >> 16);
			buffer[(offset += 116413311) * 385051775 - 1] = (byte) (i >> 24);
	}

	public void writeString(String string) {
			int invalidCharacter = string.indexOf('\0');
			if (invalidCharacter >= 0)
				throw new IllegalArgumentException("");
			offset += Class361.translateSymbolOffsets(string, 0, string.length(), buffer, 385051775 * offset) * 116413311;
			buffer[(offset += 116413311) * 385051775 - 1] = (byte) 0;
	}

	public int readShort() {
			offset += 232826622;
			int i_6_ = (((buffer[offset * 385051775 - 2] & 0xff) << 8) + (buffer[385051775 * offset - 1] & 0xff));
			if (i_6_ > 32767)
				i_6_ -= 65536;
			return i_6_;
	}

	public void writeIntV1(int i) {
			buffer[(offset += 116413311) * 385051775 - 1] = (byte) (i >> 8);
			buffer[(offset += 116413311) * 385051775 - 1] = (byte) i;
			buffer[(offset += 116413311) * 385051775 - 1] = (byte) (i >> 24);
			buffer[(offset += 116413311) * 385051775 - 1] = (byte) (i >> 16);
	}

	public void writeSizeShort(int i) {
			buffer[385051775 * offset - i - 2] = (byte) (i >> 8);
			buffer[385051775 * offset - i - 1] = (byte) i;
	}

	public void method3594(int i) {
			if (i >= 0 && i < 128)
				writeByte(i);
			else if (i >= 0 && i < 32768)
				writeShort(32768 + i);
			else
				throw new IllegalArgumentException();
	}

	public int readUByte() {
			return (buffer[(offset += 116413311) * 385051775 - 1] & 0xFF);
	}

	public byte readByte() {
			return buffer[(offset += 116413311) * 385051775 - 1];
	}

	final int readCustomUnsignedShort() {
		int v = readUShort();
		if (v == 65535)
			return -1;
		return v;
	}



	public int readUShort() {
			offset += 232826622;
			int val = ((buffer[offset * 385051775 - 1] & 0xFF) + ((buffer[offset * 385051775 - 2] & 0xFF) << 8));
			return val;
	}

	public long readLong() {
			long l = (long) readInt() & 0xFFFFFFFFL;
			long l_10_ = (long) readInt() & 0xFFFFFFFFL;
			return (l << 32) + l_10_;
	}

	public void method3599(int i) {
			buffer[385051775 * offset - i - 4] = (byte) (i >> 24);
			buffer[offset * 385051775 - i - 3] = (byte) (i >> 16);
			buffer[385051775 * offset - i - 2] = (byte) (i >> 8);
			buffer[385051775 * offset - i - 1] = (byte) i;
	}

	public int method3600() {
			offset += 465653244;
			return (((buffer[offset * 385051775 - 1] & 0xFF) << 24) + ((buffer[offset * 385051775 - 2] & 0xFF) << 16) + ((buffer[offset * 385051775 - 3] & 0xFF) << 8) + (buffer[385051775 * offset - 4] & 0xFF));
	}

	public long method3601() {
			long l = (long) readUByte() & 0xffffffffL;
			long l_12_ = (long) readInt() & 0xffffffffL;
			return (l << 32) + l_12_;
	}

	public String readString() {
			int i_13_ = 385051775 * offset;
			while (buffer[(offset += 116413311) * 385051775 - 1] != 0) {
			}
			int i_14_ = offset * 385051775 - i_13_ - 1;
			if (i_14_ == 0)
				return "";
			return StringUtils.method556(buffer, i_13_, i_14_, 964250329);
	}

	public void method3603(long l, int i) {
			if (--i < 0 || i > 7)
				throw new IllegalArgumentException();
			for (int i_16_ = i * 8; i_16_ >= 0; i_16_ -= 8)
				buffer[(offset += 116413311) * 385051775 - 1] = (byte) (int) (l >> i_16_);
	}

	public void readBytes(byte[] is, int i, int i_17_) {
			for (int i_19_ = i; i_19_ < i + i_17_; i_19_++)
				is[i_19_] = buffer[(offset += 116413311) * 385051775 - 1];
	}

	public int readUnsignedSmart() {
			int i_20_ = buffer[offset * 385051775] & 0xff;
			if (i_20_ < 128)
				return readUByte();
			return readUShort() - 32768;
	}

	public int readSmart() {
			int i_21_ = 0;
			int i_22_;
			for (i_22_ = readUnsignedSmart(); 32767 == i_22_; i_22_ = readUnsignedSmart())
				i_21_ += 32767;
			i_21_ += i_22_;
			return i_21_;
	}

	public int readLargeSmart() {
			if (buffer[offset * 385051775] < 0)
				return readInt() & 0x7fffffff;
			return readUShort();
	}

	public void writeLong(long l) {
			buffer[(offset += 116413311) * 385051775 - 1] = (byte) (int) (l >> 56);
			buffer[(offset += 116413311) * 385051775 - 1] = (byte) (int) (l >> 48);
			buffer[(offset += 116413311) * 385051775 - 1] = (byte) (int) (l >> 40);
			buffer[(offset += 116413311) * 385051775 - 1] = (byte) (int) (l >> 32);
			buffer[(offset += 116413311) * 385051775 - 1] = (byte) (int) (l >> 24);
			buffer[(offset += 116413311) * 385051775 - 1] = (byte) (int) (l >> 16);
			buffer[(offset += 116413311) * 385051775 - 1] = (byte) (int) (l >> 8);
			buffer[(offset += 116413311) * 385051775 - 1] = (byte) (int) l;
	}

	public int method3609() {
			int i_23_ = buffer[(offset += 116413311) * 385051775 - 1];
			int i_24_ = 0;
			for (/**/; i_23_ < 0; i_23_ = (buffer[(offset += 116413311) * 385051775 - 1]))
				i_24_ = (i_24_ | i_23_ & 0x7f) << 7;
			return i_24_ | i_23_;
	}

	public void decodeXtea(int[] is) {
			int i_25_ = 385051775 * offset / 8;
			offset = 0;
			for (int i_26_ = 0; i_26_ < i_25_; i_26_++) {
				int i_27_ = readInt();
				int i_28_ = readInt();
				int i_29_ = -957401312;
				int i_30_ = -1640531527;
				int i_31_ = 32;
				while (i_31_-- > 0) {
					i_28_ -= (i_27_ + (i_27_ << 4 ^ i_27_ >>> 5) ^ is[i_29_ >>> 11 & 0x3] + i_29_);
					i_29_ -= i_30_;
					i_27_ -= (i_28_ + (i_28_ << 4 ^ i_28_ >>> 5) ^ i_29_ + is[i_29_ & 0x3]);
				}
				offset -= 931306488;
				writeInt(i_27_);
				writeInt(i_28_);
			}
	}

	public void encodeXtea(int[] is, int i, int i_32_) {
			int i_34_ = 385051775 * offset;
			offset = i * 116413311;
			int i_35_ = (i_32_ - i) / 8;
			for (int i_36_ = 0; i_36_ < i_35_; i_36_++) {
				int i_37_ = readInt();
				int i_38_ = readInt();
				int i_39_ = 0;
				int i_40_ = -1640531527;
				int i_41_ = 32;
				while (i_41_-- > 0) {
					i_37_ += ((i_38_ << 4 ^ i_38_ >>> 5) + i_38_ ^ is[i_39_ & 0x3] + i_39_);
					i_39_ += i_40_;
					i_38_ += ((i_37_ << 4 ^ i_37_ >>> 5) + i_37_ ^ i_39_ + is[i_39_ >>> 11 & 0x3]);
				}
				offset -= 931306488;
				writeInt(i_37_);
				writeInt(i_38_);
			}
			offset = 116413311 * i_34_;
	}

	public void decrypt(int[] keys, int i, int i_42_) {
			int i_44_ = offset * 385051775;
			offset = i * 116413311;
			int i_45_ = (i_42_ - i) / 8;
			for (int i_46_ = 0; i_46_ < i_45_; i_46_++) {
				int i_47_ = readInt();
				int i_48_ = readInt();
				int i_49_ = -957401312;
				int i_50_ = -1640531527;
				int i_51_ = 32;
				while (i_51_-- > 0) {
					i_48_ -= (i_47_ + (i_47_ << 4 ^ i_47_ >>> 5) ^ i_49_ + keys[i_49_ >>> 11 & 0x3]);
					i_49_ -= i_50_;
					i_47_ -= (i_48_ + (i_48_ << 4 ^ i_48_ >>> 5) ^ keys[i_49_ & 0x3] + i_49_);
				}
				offset -= 931306488;
				writeInt(i_47_);
				writeInt(i_48_);
			}
			offset = i_44_ * 116413311;
	}

	public int readUTriByte() {
			offset += 349239933;
			return ((buffer[385051775 * offset - 1] & 0xff) + (((buffer[offset * 385051775 - 3] & 0xff) << 16) + ((buffer[385051775 * offset - 2] & 0xff) << 8)));
	}

	public int method3614(int i) {
			int i_53_ = Class11.method328(buffer, i, offset * 385051775);
			writeInt(i_53_);
			return i_53_;
	}

	public boolean method3615() {
			offset -= 465653244;
			int i_54_ = Class11.method328(buffer, 0, 385051775 * offset);
			int i_55_ = readInt();
            return i_55_ == i_54_;
	}

	public void writeByte128(int i) {
			buffer[(offset += 116413311) * 385051775 - 1] = (byte) (128 + i);
	}

	public void method3617(int i) {
			buffer[(offset += 116413311) * 385051775 - 1] = (byte) (0 - i);
	}

	public int readUnsignedByte128() {
			return ((buffer[(offset += 116413311) * 385051775 - 1] - 128) & 0xff);
	}

	public int readUnsignedByteC() {
			return (0 - (buffer[(offset += 116413311) * 385051775 - 1]) & 0xff);
	}

	public int readUnsigned128Byte() {
			return (128 - (buffer[(offset += 116413311) * 385051775 - 1]) & 0xff);
	}

	public byte readByteC() {
			return (byte) (0 - (buffer[(offset += 116413311) * 385051775 - 1]));
	}

	public byte read128Byte() {
			return (byte) (128 - (buffer[(offset += 116413311) * 385051775 - 1]));
	}

	public void writeShortLE128(int i) {
			buffer[(offset += 116413311) * 385051775 - 1] = (byte) (i + 128);
			buffer[(offset += 116413311) * 385051775 - 1] = (byte) (i >> 8);
	}

	public int readUnsignedShortLE() {
			offset += 232826622;
			return ((buffer[385051775 * offset - 2] & 0xff) + ((buffer[offset * 385051775 - 1] & 0xff) << 8));
	}

	public int readUnsignedShort128() {
			offset += 232826622;
			return (((buffer[385051775 * offset - 2] & 0xff) << 8) + (buffer[offset * 385051775 - 1] - 128 & 0xff));
	}

	public int readUnsignedShortLE128() {
			offset += 232826622;
			return (((buffer[385051775 * offset - 1] & 0xff) << 8) + (buffer[385051775 * offset - 2] - 128 & 0xff));
	}

	public int read24BitInteger() {
			offset += 349239933;
			int i_59_ = (((buffer[offset * 385051775 - 3] & 0xff) << 16) + ((buffer[offset * 385051775 - 2] & 0xff) << 8) + (buffer[385051775 * offset - 1] & 0xff));
			if (i_59_ > 8388607)
				i_59_ -= 16777216;
			return i_59_;
	}

	public int read24BitUnsignedIntegerV2() {
			offset += 349239933;
			return ((buffer[385051775 * offset - 2] & 0xff) + (((buffer[offset * 385051775 - 3] & 0xff) << 16) + ((buffer[385051775 * offset - 1] & 0xff) << 8)));
	}

	public void writeIntLE(int i) {
			buffer[(offset += 116413311) * 385051775 - 1] = (byte) i;
			buffer[(offset += 116413311) * 385051775 - 1] = (byte) (i >> 8);
			buffer[(offset += 116413311) * 385051775 - 1] = (byte) (i >> 16);
			buffer[(offset += 116413311) * 385051775 - 1] = (byte) (i >> 24);
	}

	public byte readByte128() {
			return (byte) ((buffer[(offset += 116413311) * 385051775 - 1]) - 128);
	}

	public void writeIntV2(int i) {
		try {
			buffer[(offset += 116413311) * 385051775 - 1] = (byte) (i >> 16);
			buffer[(offset += 116413311) * 385051775 - 1] = (byte) (i >> 24);
			buffer[(offset += 116413311) * 385051775 - 1] = (byte) i;
			buffer[(offset += 116413311) * 385051775 - 1] = (byte) (i >> 8);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("acx.bt(").append(')').toString());
		}
	}

	public int readIntLE() {
			offset += 465653244;
			return (((buffer[offset * 385051775 - 3] & 0xff) << 8) + (((buffer[offset * 385051775 - 1] & 0xff) << 24) + ((buffer[offset * 385051775 - 2] & 0xff) << 16)) + (buffer[offset * 385051775 - 4] & 0xff));
	}

	public int readIntV2() {
			offset += 465653244;
			return ((buffer[385051775 * offset - 2] & 0xff) + (((buffer[offset * 385051775 - 1] & 0xff) << 8) + (((buffer[offset * 385051775 - 4] & 0xff) << 16) + ((buffer[385051775 * offset - 3] & 0xff) << 24))));
	}

	static {
		for (int i = 0; i < 256; i++) {
			int i_62_ = i;
			for (int i_63_ = 0; i_63_ < 8; i_63_++) {
				if ((i_62_ & 0x1) == 1)
					i_62_ = i_62_ >>> 1 ^ ~0x12477cdf;
				else
					i_62_ >>>= 1;
			}
			anIntArray7614[i] = i_62_;
		}
		CRC_64 = new long[256];
		for (int i = 0; i < 256; i++) {
			long l = (long) i;
			for (int i_64_ = 0; i_64_ < 8; i_64_++) {
				if ((l & 0x1L) == 1L)
					l = l >>> 1 ^ ~0x3693a86a2878f0bdL;
				else
					l >>>= 1;
			}
			CRC_64[i] = l;
		}
	}

	public void putTriByte(int i) {
			buffer[(offset += 116413311) * 385051775 - 1] = (byte) (i >> 16);
			buffer[(offset += 116413311) * 385051775 - 1] = (byte) (i >> 8);
			buffer[(offset += 116413311) * 385051775 - 1] = (byte) i;
	}

	public void applyRSA(BigInteger biginteger, BigInteger biginteger_66_) {
			int i_67_ = offset * 385051775;
			offset = 0;
			byte[] is = new byte[i_67_];
			readBytes(is, 0, i_67_);
			BigInteger biginteger_68_ = new BigInteger(is);
			BigInteger biginteger_69_ = Loader.DISABLE_RSA ? biginteger_68_ : biginteger_68_.modPow(biginteger, biginteger_66_);
			byte[] is_70_ = biginteger_69_.toByteArray();
			offset = 0;
			writeShort(is_70_.length);
			writeBytes(is_70_, 0, is_70_.length);
	}

	public Buffer(int capacity) {
		buffer = Class416.method5589(capacity);
		offset = 0;
	}

	public String readJagString() {
			byte i_71_ = buffer[(offset += 116413311) * 385051775 - 1];
			if (0 != i_71_)
				throw new IllegalStateException("");
			int i_72_ = offset * 385051775;
			while_13_: do {
				do {
					if ((buffer[(offset += 116413311) * 385051775 - 1]) == 0)
						break while_13_;
				} while (true);
			} while (false);
			int i_73_ = offset * 385051775 - i_72_ - 1;
			if (0 == i_73_)
				return "";
			return StringUtils.method556(buffer, i_72_, i_73_, -1673599026);
	}

	public int readIntV1() {
			offset += 465653244;
			return (((buffer[385051775 * offset - 1] & 0xff) << 16) + ((buffer[385051775 * offset - 2] & 0xff) << 24) + ((buffer[offset * 385051775 - 4] & 0xff) << 8) + (buffer[offset * 385051775 - 3] & 0xff));
	}

	public void write128Byte(int i) {
			buffer[(offset += 116413311) * 385051775 - 1] = (byte) (128 - i);
	}

	public void method3639(int i) {
			if ((i & ~0x7f) != 0) {
				if ((i & ~0x3fff) != 0) {
					if ((i & ~0x1fffff) != 0) {
						if (0 != (i & ~0xfffffff))
							writeByte(i >>> 28 | 0x80);
						writeByte(i >>> 21 | 0x80);
					}
					writeByte(i >>> 14 | 0x80);
				}
				writeByte(i >>> 7 | 0x80);
			}
			writeByte(i & 0x7f);
	}

	public long method3640() {
			long l = (long) method3600() & 0xffffffffL;
			long l_76_ = (long) method3600() & 0xffffffffL;
			return (l_76_ << 32) + l;
	}

	public void putJagString(String string) {
			int i_77_ = string.indexOf('\0');
			if (i_77_ >= 0)
				throw new IllegalArgumentException("");
			buffer[(offset += 116413311) * 385051775 - 1] = (byte) 0;
			offset += Class361.translateSymbolOffsets(string, 0, string.length(), buffer, 385051775 * offset) * 116413311;
			buffer[(offset += 116413311) * 385051775 - 1] = (byte) 0;
	}

	public void writeShort128(int i) {
			buffer[(offset += 116413311) * 385051775 - 1] = (byte) (i >> 8);
			buffer[(offset += 116413311) * 385051775 - 1] = (byte) (i + 128);
	}

	public int readInt() {
			offset += 465653244;
			return (((buffer[385051775 * offset - 3] & 0xff) << 16) + ((buffer[385051775 * offset - 4] & 0xff) << 24) + ((buffer[offset * 385051775 - 2] & 0xff) << 8) + (buffer[385051775 * offset - 1] & 0xff));
	}

	public void writeShortLE(int i) {
			buffer[(offset += 116413311) * 385051775 - 1] = (byte) i;
			buffer[(offset += 116413311) * 385051775 - 1] = (byte) (i >> 8);
	}

	public Buffer(byte[] buffer) {
		this.buffer = buffer;
		offset = 0;
	}

	public int readSmartShort() {
			int i_80_ = buffer[385051775 * offset] & 0xff;
			if (i_80_ < 128)
				return readUByte() - 64;
			return readUShort() - 49152;
	}

	public int readBigSmart() {
			if (buffer[385051775 * offset] < 0)
				return readInt() & 0x7FFFFFFF; //MASK: 0111 1111, BYTE, BYTE, BYTE
			int i_81_ = readUShort();
			if (32767 == i_81_)
				return -1;
			return i_81_;
	}

	public long method3647(int i) {
			if (--i < 0 || i > 7)
				throw new IllegalArgumentException();
			int i_83_ = 8 * i;
			long l = 0L;
			for (/**/; i_83_ >= 0; i_83_ -= 8)
				l |= ((long) (buffer[(offset += 116413311) * 385051775 - 1]) & 0xffL) << i_83_;
			return l;
	}

	public void writeBytes(byte[] is, int i, int i_84_) {
			for (int i_86_ = i; i_86_ < i_84_ + i; i_86_++)
				buffer[(offset += 116413311) * 385051775 - 1] = is[i_86_];
	}

	public void method3649(int i) {
			buffer[offset * 385051775 - i - 1] = (byte) i;
	}

	public void reset() {
			if (null != buffer)
				Class201.retrieve(buffer);
			buffer = null;
	}

	public int method3651() {
			offset += 232826622;
			int i_88_ = ((buffer[offset * 385051775 - 2] & 0xff) + ((buffer[offset * 385051775 - 1] & 0xff) << 8));
			if (i_88_ > 32767)
				i_88_ -= 65536;
			return i_88_;
	}

	public String readNullString() {
			if (buffer[385051775 * offset] == 0) {
				offset += 116413311;
				return null;
			}
			return readString();
	}

}
