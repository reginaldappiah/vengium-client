package com.jagex;/* Class80 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class80 {
	static int anInt749 = 0;
	int[] anIntArray750;
	static int anInt751 = 2;
	int[] anIntArray752;

	Class80(Buffer class298_sub53) {
		int i = class298_sub53.readUnsignedSmart();
		this.anIntArray750 = new int[i];
		this.anIntArray752 = new int[i];
		for (int i_0_ = 0; i_0_ < i; i_0_++) {
			int i_1_ = class298_sub53.readUByte();
			this.anIntArray750[i_0_] = i_1_;
			int i_2_ = class298_sub53.readUShort();
			int i_3_ = class298_sub53.readUShort();
			this.anIntArray752[i_0_] = i_3_ + (i_2_ << 16);
		}
	}

	void method852(Class94 class94, int i, int i_4_) {
		try {
			int i_5_ = this.anIntArray752[0];
			class94.method1017(i, i_5_ >>> 16, i_5_ & 0xffff, -1002380279);
			Entity class365_sub1_sub1_sub2 = class94.method1015();
			class365_sub1_sub1_sub2.anInt10120 = 0;
			for (int i_6_ = this.anIntArray750.length - 1; i_6_ >= 0; i_6_--) {
				int i_7_ = this.anIntArray750[i_6_];
				int i_8_ = this.anIntArray752[i_6_];
				class365_sub1_sub1_sub2.scenePositionXQueue[class365_sub1_sub1_sub2.anInt10120 * 2050671733] = i_8_ >> 16;
				class365_sub1_sub1_sub2.scenePositionYQueue[2050671733 * class365_sub1_sub1_sub2.anInt10120] = i_8_ & 0xffff;
				byte i_9_ = Class282.aClass282_6540.aByte6542;
				if (0 == i_7_)
					i_9_ = Class282.aClass282_6545.aByte6542;
				else if (2 == i_7_)
					i_9_ = Class282.aClass282_6541.aByte6542;
				class365_sub1_sub1_sub2.aByteArray10110[class365_sub1_sub1_sub2.anInt10120 * 2050671733] = i_9_;
				class365_sub1_sub1_sub2.anInt10120 += -1013322787;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("df.a(").append(')').toString());
		}
	}

	public static Class158 method853(Buffer buffer) {
		try {
			int i_10_ = buffer.readBigSmart();
			Class139 class139 = (Class139.method6176()[buffer.readUByte()]);
			Class133 class133 = (Class133.method1255()[buffer.readUByte()]);
			int i_11_ = buffer.readShort();
			int i_12_ = buffer.readShort();
			return new Class158(i_10_, class139, class133, i_11_, i_12_);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("df.a(").append(')').toString());
		}
	}

	static final void method855() {
			for (Class302_Sub5 class302_sub5 = ((Class302_Sub5) GameClient.aClass442_8781.method5871((byte) 3)); null != class302_sub5; class302_sub5 = ((Class302_Sub5) GameClient.aClass442_8781.method5871((byte) 3)))
				Class152.method1655(class302_sub5, -1638035740);
			int startOffset = 0;
			int end = 3;
			if (0 == GameClient.anInt8724 * 1596783995) {
				for (int index = startOffset; index <= end; index++)
					GameClient.method2797(index);
				GameClient.method2799();
			} else {
				GameClient.method2795();
				for (int index = startOffset; index <= end; index++) {
					GameClient.method2807();
					GameClient.method2796(index);
					GameClient.method2797(index);
				}
				GameClient.method2798();
				GameClient.method2799();
			}
	}

}
