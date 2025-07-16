package com.jagex;/* Class129 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class129 implements Interface6 {
	Class134 aClass134_6378;
	Class140 aClass140_6379;
	static int speed2;

	Class129(Class140 class140, Class134 class134) {
		this.aClass134_6378 = class134;
		this.aClass140_6379 = class140;
	}

	public boolean method52(int i) {
			return this.aClass140_6379.method1553();
	}

	public void method58(boolean bool, byte i) {
		try {
			Class142 class142 = (this.aClass140_6379.method1552(this.aClass134_6378.anInt6341 * 1310361017, -257545820));
			if (class142 != null) {
				int i_0_ = ((this.aClass134_6378.aClass139_6336.method1545((-1635817177 * this.aClass134_6378.anInt6339), GameClient.anInt8794 * 775068819, -2108328767)) + (-740662509 * this.aClass134_6378.anInt6333));
				int i_1_ = ((this.aClass134_6378.aClass133_6337.method1482((-1725730589 * this.aClass134_6378.anInt6340), GameClient.anInt8803 * -791746413, -1943367798)) + (this.aClass134_6378.anInt6335 * -1129431703));
				if (this.aClass134_6378.aBoolean6342)
					GameClient.activeGraphicsToolkit.drawRectangle(i_0_, i_1_, (-1635817177 * this.aClass134_6378.anInt6339), (this.aClass134_6378.anInt6340 * -1725730589), 80994107 * this.aClass134_6378.anInt6338, 0);
				i_1_ += method1443(StaticMethods.b12_full_monochrome, class142.aString1553, i_0_, i_1_, 5) * 12;
				i_1_ += 8;
				if (this.aClass134_6378.aBoolean6342)
					GameClient.activeGraphicsToolkit.drawDiagonalLine(i_0_, i_1_, (this.aClass134_6378.anInt6339 * -1635817177) + i_0_ - 1, i_1_, 80994107 * this.aClass134_6378.anInt6338, 0);
				i_1_ = ++i_1_ + method1443(StaticMethods.b12_full_monochrome, class142.aString1554, i_0_, i_1_, 5) * 12;
				i_1_ += 5;
				i_1_ += method1443(StaticMethods.b12_full_monochrome, class142.aString1552, i_0_, i_1_, 5) * 12;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ff.f(").append(')').toString());
		}
	}

	int method1443(FontToolkit toolkit, String string, int i, int i_2_, int i_3_) {
		try {
			return (toolkit.method2475(string, i + i_3_, i_2_ + i_3_, (this.aClass134_6378.anInt6339 * -1635817177 - 2 * i_3_), (-1725730589 * this.aClass134_6378.anInt6340 - i_3_ * 2), this.aClass134_6378.anInt6332 * 1824777445, this.aClass134_6378.anInt6334 * 1690804891, 0, 0, 0, null, null, null, 0, 0));
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ff.posX(").append(')').toString());
		}
	}

	public void method53() {
	}

}
