package com.jagex;/* Class136_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class136_Sub1 extends Class136 {
	int anInt8576 = 0;

    Class136_Sub1(Js5FileSystem class243, Class158_Sub1 class158_sub1) {
		super(class243, class158_sub1);
	}

	public void method58(boolean bool, byte i) {
		try {
			int i_1_ = ((this.aClass158_6386.aClass139_6360.method1545(this.aClass57_6385.getPaddedWidth(), GameClient.anInt8794 * 775068819, -2041461531)) + (this.aClass158_6386.anInt6362 * -245579987));
			int i_2_ = ((this.aClass158_6386.aClass133_6363.method1482(this.aClass57_6385.getPaddedHeight(), GameClient.anInt8803 * -791746413, -2132177466)) + (this.aClass158_6386.anInt6359 * -1426302101));
			this.aClass57_6385.drawRotatedScaled((float) (i_1_ + (this.aClass57_6385.getPaddedWidth() / 2)), (float) (i_2_ + (this.aClass57_6385.getPaddedHeight() / 2)), 4096, this.anInt8576 * -157704951);
			this.anInt8576 += 315105141 * (((Class158_Sub1) this.aClass158_6386).anInt8567);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("zh.f(").append(')').toString());
		}
	}

	static final void method1502(int capacity) {
			GameClient.anIntArray8793 = new int[capacity];
			GameClient.anIntArray8670 = new int[capacity];
			GameClient.anIntArray8795 = new int[capacity];
			GameClient.anIntArray8641 = new int[capacity];
			GameClient.anIntArray8797 = new int[capacity];
	}
}
