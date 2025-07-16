package com.jagex;/* Class127 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.utils.TimeUtils;

public abstract class Class127 implements Interface6 {
	int anInt6371;
	Js5FileSystem aClass243_6372;
	FontToolkit fontToolkit;
	Js5FileSystem aClass243_6374;
	Class128 aClass128_6375;
	long aLong6376;

	abstract void method1409(boolean bool, int i, int i_0_);

	abstract void method1410(boolean bool, int i, int i_1_);

	public boolean method52(int i) {
			boolean bool = true;
			if (!this.aClass243_6372.exists(this.aClass128_6375.anInt6329 * 955568089))
				bool = false;
			if (!this.aClass243_6374.exists(955568089 * this.aClass128_6375.anInt6329))
				bool = false;
			return bool;
	}

	abstract void method1411(boolean bool, int i, int i_2_, int i_3_);

	public void method58(boolean bool, byte i) {
		try {
			int i_4_ = ((this.aClass128_6375.aClass139_6322.method1545(-944287579 * this.aClass128_6375.anInt6326, GameClient.anInt8794 * 775068819, -2137791831)) + this.aClass128_6375.anInt6327 * -39975161);
			int i_5_ = ((this.aClass128_6375.aClass133_6323.method1482(-1387457793 * this.aClass128_6375.anInt6330, -791746413 * GameClient.anInt8803, -1715218341)) + this.aClass128_6375.anInt6325 * 1886882435);
			method1412(bool, i_4_, i_5_, 589039750);
			method1411(bool, i_4_, i_5_, -2096633602);
			String string = Class288_Sub1.target.getLoadingScreenText();
			if ((TimeUtils.getTime() - this.aLong6376 * 109366757865047727L) > 10000L)
				string = new StringBuilder().append(string).append(" (").append((Class288_Sub1.target.getLoadingScreenBar().anInt2548) * -861845079).append(")").toString();
			this.fontToolkit.drawTextCentered(string, (-944287579 * this.aClass128_6375.anInt6326 / 2 + i_4_), (4 + ((-1387457793 * this.aClass128_6375.anInt6330 / 2) + i_5_) + this.aClass128_6375.anInt6328 * -684094775), this.aClass128_6375.anInt6324 * 782326281, -1);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("fd.f(").append(')').toString());
		}
	}

	abstract void method1412(boolean bool, int i, int i_6_, int i_7_);

	abstract void method1413(boolean bool, int i, int i_9_);

	abstract void method1414(boolean bool, int i, int i_10_);

	abstract void method1415(boolean bool, int i, int i_11_);

	abstract void method1416(boolean bool, int i, int i_12_);

	Class127(Js5FileSystem class243, Js5FileSystem class243_13_, Class128 class128) {
		this.aClass243_6372 = class243;
		this.aClass243_6374 = class243_13_;
		this.aClass128_6375 = class128;
	}

	public void method53() {
			RSFontMetrics class505 = RSFontMetrics.decodeFontData(this.aClass243_6374, 955568089 * (this.aClass128_6375.anInt6329));
			this.fontToolkit = (GameClient.activeGraphicsToolkit.createFontToolkit(class505, Sprite.load(this.aClass243_6372, 955568089 * (this.aClass128_6375.anInt6329)), true));
	}

	abstract void method1417(boolean bool, int i, int i_14_);

	int method1418(int i) {
		try {
			int i_15_ = Class288_Sub1.target.getCurrentPercentage();
			int i_16_ = i_15_ * 100;
			if (-1729871315 * this.anInt6371 == i_15_ && i_15_ != 0) {
				int i_17_ = Class288_Sub1.target.method2041();
				if (i_17_ > i_15_) {
					long l = (109366757865047727L * this.aLong6376 - Class288_Sub1.target.getTime());
					if (l > 0L) {
						long l_18_ = (l * 10000L / (long) i_15_ * (long) (i_17_ - i_15_));
						long l_19_ = ((TimeUtils.getTime() - (this.aLong6376 * 109366757865047727L)) * 10000L);
						if (l_19_ < l_18_)
							i_16_ = (int) ((100L * (l_19_ * (long) (i_17_ - i_15_)) / l_18_) + (long) (100 * i_15_));
						else
							i_16_ = 100 * i_17_;
					}
				}
			} else {
				this.anInt6371 = 1301503397 * i_15_;
				this.aLong6376 = TimeUtils.getTime() * -1063467934392987569L;
			}
			return i_16_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("fd.q(").append(')').toString());
		}
	}

	static final void method1421(ScriptRuntime runtime) {
			runtime.integerStackOffset -= -1175642067;
			int i_20_ = (runtime.integerStack[runtime.integerStackOffset * 681479919]);
			int i_21_ = (runtime.integerStack[1 + runtime.integerStackOffset * 681479919]);
			int i_22_ = (runtime.integerStack[681479919 * runtime.integerStackOffset + 2]);
			Class301_Sub1.method3713(2, i_20_ << 16 | i_21_, i_22_, "");
	}

	static final void method1423(IComponentDefinition component, int optionsLength, int i_24_, int i_25_) {
			if (null == component.aByteArray1185) {
				if (0 != i_24_) {
					component.aByteArray1185 = new byte[11];
					component.aByteArray1222 = new byte[11];
					component.anIntArray1276 = new int[11];
				} else
					return;
			}
			component.aByteArray1185[optionsLength] = (byte) i_24_;
			if (0 != i_24_)
				component.aBoolean1220 = true;
			else {
				component.aBoolean1220 = false;
				for (int i_27_ = 0; i_27_ < component.aByteArray1185.length; i_27_++) {
					if (component.aByteArray1185[i_27_] != 0) {
						component.aBoolean1220 = true;
						break;
					}
				}
			}
			component.aByteArray1222[optionsLength] = (byte) i_25_;
	}
}
