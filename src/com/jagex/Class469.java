package com.jagex;/* Class469 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class469 {
	static int anInt5773 = 32768;
	static int anInt5774 = 1;
	public int anInt5775 = 0;
	Js5FileSystem aClass243_5776;
	public int anInt5777 = 0;
	Js5FileSystem aClass243_5778;
	SoftCache aClass348_5779 = new SoftCache(64);
	Interface20 anInterface20_5780 = null;

	public Class469(Js5FileSystem class243, Js5FileSystem class243_0_, Interface20 interface20) {
		aClass243_5778 = class243;
		aClass243_5776 = class243_0_;
		anInterface20_5780 = interface20;
		if (null != aClass243_5778) {
			anInt5775 = (aClass243_5778.getFileSystem(1) * -1970727647);
		}
		if (aClass243_5776 != null) {
			anInt5777 = (aClass243_5776.getFileSystem(1) * 1286548437);
		}
	}

	String method6044(Class367 class367, int[] is, long l) {
		try {
			if (anInterface20_5780 != null) {
				String string = anInterface20_5780.method241(class367, is, l);
				if (string != null) {
					return string;
				}
			}
			return Long.toString(l);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ti.f(").append(')').toString());
		}
	}

	public Class298_Sub37_Sub14 method6045(int i) {
		try {
			Class298_Sub37_Sub14 class298_sub37_sub14 = ((Class298_Sub37_Sub14) aClass348_5779.get(i));
			if (null != class298_sub37_sub14) {
				return class298_sub37_sub14;
			}
			byte[] data;
			if (i >= 32768) {
				data = aClass243_5776.getFileFromArchive(1, i & 0x7fff);
			} else {
				data = aClass243_5778.getFileFromArchive(1, i);
			}
			class298_sub37_sub14 = new Class298_Sub37_Sub14();
			class298_sub37_sub14.aClass469_9651 = this;
			if (data != null) {
				class298_sub37_sub14.method3457(new Buffer(data), 1219453152);
			}
			if (i >= 32768) {
				class298_sub37_sub14.method3456(-877048074);
			}
			aClass348_5779.put(class298_sub37_sub14, i);
			return class298_sub37_sub14;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ti.a(").append(')').toString());
		}
	}

	public static int method6046(int i, int i_2_, byte i_3_) {
		try {
			int i_4_ = 0;
			for (/**/; i_2_ > 0; i_2_--) {
				i_4_ = i_4_ << 1 | i & 0x1;
				i >>>= 1;
			}
			return i_4_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ti.u(").append(')').toString());
		}
	}

	static Class298_Sub37_Sub13 method6048(Js5FileSystem index, int archive, int file) {
			Buffer buffer = new Buffer(index.getFileFromArchive(archive, file));
			Class298_Sub37_Sub13 class298_sub37_sub13 = (new Class298_Sub37_Sub13(file, buffer.readString(), buffer.readString(), buffer.readInt(), buffer.readInt(), buffer.readUByte() == 1, buffer.readUByte(), buffer.readUByte()));
			int hotlinkCount = buffer.readUByte();
			for (int i_23_ = 0; i_23_ < hotlinkCount; i_23_++) {
				class298_sub37_sub13.aClass453_9642.pushBack(new Class298_Sub42(buffer.readUByte(), buffer.readUShort(), buffer.readUShort(), buffer.readUShort(), buffer.readUShort(), buffer.readUShort(), buffer.readUShort(), buffer.readUShort(), buffer.readUShort()));
			}
			class298_sub37_sub13.method3454();
			return class298_sub37_sub13;
	}
}
