package com.jagex;/* Class82_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class82_Sub4 extends Class82 {
	int anInt6826;
	int anInt6827;
	int anInt6828;
	int anInt6829;
	int anInt6830;
	int anInt6831;
	public static int anInt6832;
	public static int anInt6833;

	public void method869() {
		Class87.aClass94Array794[this.anInt6831 * 1062834473].method1015().method4420(this.anInt6827 * 537594387, this.anInt6830 * -1750222503, -172156501 * this.anInt6828, this.anInt6826 * 376713895, GameClient.clientTick * 443738891, 0, -1529152547 * this.anInt6829, (byte) 4);
	}

	public void method866() {
		try {
			Class87.aClass94Array794[this.anInt6831 * 1062834473].method1015().method4420(this.anInt6827 * 537594387, this.anInt6830 * -1750222503, -172156501 * this.anInt6828, this.anInt6826 * 376713895, GameClient.clientTick * 443738891, 0, -1529152547 * this.anInt6829, (byte) 73);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("xe.f(").append(')').toString());
		}
	}

	public void method868() {
		Class87.aClass94Array794[this.anInt6831 * 1062834473].method1015().method4420(this.anInt6827 * 537594387, this.anInt6830 * -1750222503, -172156501 * this.anInt6828, this.anInt6826 * 376713895, GameClient.clientTick * 443738891, 0, -1529152547 * this.anInt6829, (byte) 9);
	}

	Class82_Sub4(Buffer class298_sub53) {
		super(class298_sub53);
		this.anInt6831 = class298_sub53.readUShort() * -451568871;
		int i = class298_sub53.readUByte();
		if ((i & 0x1) != 0) {
			this.anInt6827 = class298_sub53.readUShort() * -1685041125;
			this.anInt6830 = class298_sub53.readUShort() * -1587740951;
		} else {
			this.anInt6827 = 1685041125;
			this.anInt6830 = 1587740951;
		}
		if ((i & 0x2) != 0) {
			this.anInt6828 = class298_sub53.readUShort() * -455796477;
			this.anInt6826 = class298_sub53.readUShort() * 1360155927;
		} else {
			this.anInt6828 = 455796477;
			this.anInt6826 = -1360155927;
		}
		if ((i & 0x4) != 0) {
			int i_0_ = class298_sub53.readUShort();
			int i_1_ = class298_sub53.readUShort();
			int i_2_ = 255 * i_0_ / i_1_;
			if (i_0_ > 0 && i_2_ < 1)
				i_2_ = 1;
			this.anInt6829 = i_2_ * -592825227;
		} else
			this.anInt6829 = 592825227;
	}
}
