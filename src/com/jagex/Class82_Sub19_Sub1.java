package com.jagex;/* Class82_Sub19_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class82_Sub19_Sub1 extends Class82_Sub19 {
	static RSFontMetrics aClass505_9111;
	int anInt9112;
	int anInt9113;
	int anInt9114;

	public void method866() {
		try {
			int i_0_ = this.anInt9114 * -1355807232 + 256;
			int i_1_ = this.anInt9112 * -1356000768 + 256;
			int i_2_ = -1099766029 * this.anInt9113;
			if (i_2_ < 3 && (GameClient.myRegion.method2654().method2320(this.anInt9114 * 467113987, -1269328247 * this.anInt9112)))
				i_2_++;
			Class365_Sub1_Sub1_Sub3 class365_sub1_sub1_sub3 = (new Class365_Sub1_Sub1_Sub3(GameClient.myRegion.getRegion(), 720810617 * this.anInt6895, 0, -1099766029 * this.anInt9113, i_2_, i_0_, (Class356.getAverageHeight(i_0_, i_1_, -1099766029 * this.anInt9113, -1690985874) - 1369196329 * this.anInt6893), i_1_, this.anInt9114 * 467113987, this.anInt9114 * 467113987, -1269328247 * this.anInt9112, this.anInt9112 * -1269328247, this.anInt6894 * 87600989, false));
			GameClient.aClass437_8825.connect(new Class298_Sub37_Sub3(class365_sub1_sub1_sub3), (long) ((467113987 * this.anInt9114 << 16) | (this.anInt9112 * -1269328247)));
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("afh.f(").append(')').toString());
		}
	}

	Class82_Sub19_Sub1(Buffer class298_sub53) {
		super(class298_sub53);
		int i = class298_sub53.readInt();
		this.anInt9114 = 1008325291 * (i >>> 16);
		this.anInt9112 = (i & 0xffff) * -549142599;
		this.anInt9113 = class298_sub53.readUByte() * 2061869627;
	}

	public void method868() {
		int i = this.anInt9114 * -1355807232 + 256;
		int i_3_ = this.anInt9112 * -1356000768 + 256;
		int i_4_ = -1099766029 * this.anInt9113;
		if (i_4_ < 3 && (GameClient.myRegion.method2654().method2320(this.anInt9114 * 467113987, -1269328247 * this.anInt9112)))
			i_4_++;
		Class365_Sub1_Sub1_Sub3 class365_sub1_sub1_sub3 = (new Class365_Sub1_Sub1_Sub3(GameClient.myRegion.getRegion(), 720810617 * this.anInt6895, 0, -1099766029 * this.anInt9113, i_4_, i, (Class356.getAverageHeight(i, i_3_, (-1099766029 * this.anInt9113), -1315401128) - 1369196329 * this.anInt6893), i_3_, this.anInt9114 * 467113987, this.anInt9114 * 467113987, -1269328247 * this.anInt9112, this.anInt9112 * -1269328247, this.anInt6894 * 87600989, false));
		GameClient.aClass437_8825.connect(new Class298_Sub37_Sub3(class365_sub1_sub1_sub3), (long) (467113987 * this.anInt9114 << 16 | this.anInt9112 * -1269328247));
	}

	public void method869() {
		int i = this.anInt9114 * -1355807232 + 256;
		int i_5_ = this.anInt9112 * -1356000768 + 256;
		int i_6_ = -1099766029 * this.anInt9113;
		if (i_6_ < 3 && (GameClient.myRegion.method2654().method2320(this.anInt9114 * 467113987, -1269328247 * this.anInt9112)))
			i_6_++;
		Class365_Sub1_Sub1_Sub3 class365_sub1_sub1_sub3 = (new Class365_Sub1_Sub1_Sub3(GameClient.myRegion.getRegion(), 720810617 * this.anInt6895, 0, -1099766029 * this.anInt9113, i_6_, i, (Class356.getAverageHeight(i, i_5_, (-1099766029 * this.anInt9113), -984496033) - 1369196329 * this.anInt6893), i_5_, this.anInt9114 * 467113987, this.anInt9114 * 467113987, -1269328247 * this.anInt9112, this.anInt9112 * -1269328247, this.anInt6894 * 87600989, false));
		GameClient.aClass437_8825.connect(new Class298_Sub37_Sub3(class365_sub1_sub1_sub3), (long) (467113987 * this.anInt9114 << 16 | this.anInt9112 * -1269328247));
	}

	static final void method931(ScriptRuntime class403, byte i) {
		try {
			Class380.method4678();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("afh.alk(").append(')').toString());
		}
	}
}
