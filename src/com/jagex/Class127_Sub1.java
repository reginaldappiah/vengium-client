package com.jagex;/* Class127_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class127_Sub1 extends Class127 {
	SpriteToolkit aClass57_8569;
	SpriteToolkit aClass57_8570;
	SpriteToolkit aClass57_8571;
	SpriteToolkit aClass57_8572;
	SpriteToolkit aClass57_8573;
	SpriteToolkit aClass57_8574;

    void method1409(boolean bool, int i, int i_0_) {
		if (bool) {
			int[] is = new int[4];
			GameClient.activeGraphicsToolkit.qa(is);
			GameClient.activeGraphicsToolkit.setClip(i, i_0_, (this.aClass128_6375.anInt6326) * -944287579 + i, (this.aClass128_6375.anInt6330) * -1387457793 + i_0_);
			int i_1_ = this.aClass57_8571.getPaddedWidth();
			int i_2_ = this.aClass57_8571.getPaddedHeight();
			int i_3_ = this.aClass57_8570.getPaddedWidth();
			int i_4_ = this.aClass57_8570.getPaddedHeight();
			this.aClass57_8571.draw(i, (this.aClass128_6375.anInt6330 * -1387457793 - i_2_) / 2 + i_0_);
			this.aClass57_8570.draw(i + (this.aClass128_6375.anInt6326 * -944287579) - i_3_, (-1387457793 * this.aClass128_6375.anInt6330 - i_4_) / 2 + i_0_);
			GameClient.activeGraphicsToolkit.setClip(i, i_0_, (-944287579 * (this.aClass128_6375.anInt6326) + i), i_0_ + this.aClass57_8573.getPaddedHeight());
			this.aClass57_8573.drawRepeat(i_1_ + i, i_0_, (this.aClass128_6375.anInt6326 * -944287579 - i_1_ - i_3_), (this.aClass128_6375.anInt6330 * -1387457793));
			int i_5_ = this.aClass57_8574.getPaddedHeight();
			GameClient.activeGraphicsToolkit.setClip(i, (this.aClass128_6375.anInt6330) * -1387457793 + i_0_ - i_5_, i + -944287579 * (this.aClass128_6375.anInt6326), i_0_ + ((this.aClass128_6375.anInt6330) * -1387457793));
			this.aClass57_8574.drawRepeat(i_1_ + i, i_0_ + (this.aClass128_6375.anInt6330 * -1387457793) - i_5_, (this.aClass128_6375.anInt6326 * -944287579 - i_1_ - i_3_), (this.aClass128_6375.anInt6330 * -1387457793));
			GameClient.activeGraphicsToolkit.setClip(is[0], is[1], is[2], is[3]);
		}
	}

	void method1412(boolean bool, int i, int i_6_, int i_7_) {
		try {
			if (bool) {
				int[] is = new int[4];
				GameClient.activeGraphicsToolkit.qa(is);
				GameClient.activeGraphicsToolkit.setClip(i, i_6_, (this.aClass128_6375.anInt6326) * -944287579 + i, (this.aClass128_6375.anInt6330) * -1387457793 + i_6_);
				int i_8_ = this.aClass57_8571.getPaddedWidth();
				int i_9_ = this.aClass57_8571.getPaddedHeight();
				int i_10_ = this.aClass57_8570.getPaddedWidth();
				int i_11_ = this.aClass57_8570.getPaddedHeight();
				this.aClass57_8571.draw(i, ((this.aClass128_6375.anInt6330 * -1387457793) - i_9_) / 2 + i_6_);
				this.aClass57_8570.draw(i + (this.aClass128_6375.anInt6326 * -944287579) - i_10_, ((-1387457793 * this.aClass128_6375.anInt6330) - i_11_) / 2 + i_6_);
				GameClient.activeGraphicsToolkit.setClip(i, i_6_, -944287579 * (this.aClass128_6375.anInt6326) + i, i_6_ + this.aClass57_8573.getPaddedHeight());
				this.aClass57_8573.drawRepeat(i_8_ + i, i_6_, (this.aClass128_6375.anInt6326 * -944287579) - i_8_ - i_10_, (this.aClass128_6375.anInt6330 * -1387457793));
				int i_12_ = this.aClass57_8574.getPaddedHeight();
				GameClient.activeGraphicsToolkit.setClip(i, (this.aClass128_6375.anInt6330 * -1387457793) + i_6_ - i_12_, i + (-944287579 * this.aClass128_6375.anInt6326), i_6_ + (this.aClass128_6375.anInt6330 * -1387457793));
				this.aClass57_8574.drawRepeat(i_8_ + i, i_6_ + (this.aClass128_6375.anInt6330 * -1387457793) - i_12_, (this.aClass128_6375.anInt6326 * -944287579) - i_8_ - i_10_, (this.aClass128_6375.anInt6330 * -1387457793));
				GameClient.activeGraphicsToolkit.setClip(is[0], is[1], is[2], is[3]);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("zb.posX(").append(')').toString());
		}
	}

	void method1413(boolean bool, int i, int i_13_) {
		int i_14_ = i + this.aClass57_8571.getPaddedWidth();
		int i_15_ = (-944287579 * this.aClass128_6375.anInt6326 + i - this.aClass57_8570.getPaddedWidth());
		int i_16_ = i_13_ + this.aClass57_8573.getPaddedHeight();
		int i_17_ = (this.aClass128_6375.anInt6330 * -1387457793 + i_13_ - this.aClass57_8574.getPaddedHeight());
		int i_18_ = i_15_ - i_14_;
		int i_19_ = i_17_ - i_16_;
		int i_20_ = method1418(652896143) * i_18_ / 10000;
		int[] is = new int[4];
		GameClient.activeGraphicsToolkit.qa(is);
		GameClient.activeGraphicsToolkit.setClip(i_14_, i_16_, i_14_ + i_20_, i_17_);
		method1424(i_14_, i_16_, i_18_, i_19_, 1789961003);
		GameClient.activeGraphicsToolkit.setClip(i_20_ + i_14_, i_16_, i_15_, i_17_);
		this.aClass57_8569.drawRepeat(i_14_, i_16_, i_18_, i_19_);
		GameClient.activeGraphicsToolkit.setClip(is[0], is[1], is[2], is[3]);
	}

	void method1424(int i, int i_21_, int i_22_, int i_23_, int i_24_) {
		try {
			this.aClass57_8572.drawRepeat(i, i_21_, i_22_, i_23_);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("zb.c(").append(')').toString());
		}
	}

	public boolean method52(int i) {
		try {
			if (!super.method52(-571978774))
				return false;
			Class128_Sub3 class128_sub3 = (Class128_Sub3) this.aClass128_6375;
			if (!this.aClass243_6372.exists(class128_sub3.anInt8563 * -876812375))
				return false;
			if (!this.aClass243_6372.exists(1551490597 * class128_sub3.anInt8562))
				return false;
			if (!this.aClass243_6372.exists(578265259 * class128_sub3.anInt8566))
				return false;
			if (!this.aClass243_6372.exists(class128_sub3.anInt8564 * 861652881))
				return false;
			if (!this.aClass243_6372.exists(class128_sub3.anInt8565 * -1259370861))
				return false;
			return this.aClass243_6372.exists(class128_sub3.anInt8561 * 356687159);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("zb.b(").append(')').toString());
		}
	}

    void method1417(boolean bool, int i, int i_25_) {
		if (bool) {
			int[] is = new int[4];
			GameClient.activeGraphicsToolkit.qa(is);
			GameClient.activeGraphicsToolkit.setClip(i, i_25_, (this.aClass128_6375.anInt6326) * -944287579 + i, (this.aClass128_6375.anInt6330) * -1387457793 + i_25_);
			int i_26_ = this.aClass57_8571.getPaddedWidth();
			int i_27_ = this.aClass57_8571.getPaddedHeight();
			int i_28_ = this.aClass57_8570.getPaddedWidth();
			int i_29_ = this.aClass57_8570.getPaddedHeight();
			this.aClass57_8571.draw(i, (this.aClass128_6375.anInt6330 * -1387457793 - i_27_) / 2 + i_25_);
			this.aClass57_8570.draw(i + (this.aClass128_6375.anInt6326 * -944287579) - i_28_, (-1387457793 * this.aClass128_6375.anInt6330 - i_29_) / 2 + i_25_);
			GameClient.activeGraphicsToolkit.setClip(i, i_25_, (-944287579 * (this.aClass128_6375.anInt6326) + i), i_25_ + this.aClass57_8573.getPaddedHeight());
			this.aClass57_8573.drawRepeat(i_26_ + i, i_25_, (this.aClass128_6375.anInt6326 * -944287579 - i_26_ - i_28_), (this.aClass128_6375.anInt6330 * -1387457793));
			int i_30_ = this.aClass57_8574.getPaddedHeight();
			GameClient.activeGraphicsToolkit.setClip(i, (this.aClass128_6375.anInt6330 * -1387457793 + i_25_ - i_30_), i + (-944287579 * this.aClass128_6375.anInt6326), i_25_ + (this.aClass128_6375.anInt6330 * -1387457793));
			this.aClass57_8574.drawRepeat(i_26_ + i, i_25_ + (this.aClass128_6375.anInt6330 * -1387457793) - i_30_, (this.aClass128_6375.anInt6326 * -944287579 - i_26_ - i_28_), (this.aClass128_6375.anInt6330 * -1387457793));
			GameClient.activeGraphicsToolkit.setClip(is[0], is[1], is[2], is[3]);
		}
	}

	void method1411(boolean bool, int i, int i_31_, int i_32_) {
		try {
			int i_33_ = i + this.aClass57_8571.getPaddedWidth();
			int i_34_ = (-944287579 * this.aClass128_6375.anInt6326 + i - this.aClass57_8570.getPaddedWidth());
			int i_35_ = i_31_ + this.aClass57_8573.getPaddedHeight();
			int i_36_ = ((this.aClass128_6375.anInt6330 * -1387457793) + i_31_ - this.aClass57_8574.getPaddedHeight());
			int i_37_ = i_34_ - i_33_;
			int i_38_ = i_36_ - i_35_;
			int i_39_ = method1418(1969642247) * i_37_ / 10000;
			int[] is = new int[4];
			GameClient.activeGraphicsToolkit.qa(is);
			GameClient.activeGraphicsToolkit.setClip(i_33_, i_35_, i_33_ + i_39_, i_36_);
			method1424(i_33_, i_35_, i_37_, i_38_, -1231781770);
			GameClient.activeGraphicsToolkit.setClip(i_39_ + i_33_, i_35_, i_34_, i_36_);
			this.aClass57_8569.drawRepeat(i_33_, i_35_, i_37_, i_38_);
			GameClient.activeGraphicsToolkit.setClip(is[0], is[1], is[2], is[3]);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("zb.r(").append(')').toString());
		}
	}

	void method1414(boolean bool, int i, int i_40_) {
		int i_41_ = i + this.aClass57_8571.getPaddedWidth();
		int i_42_ = (-944287579 * this.aClass128_6375.anInt6326 + i - this.aClass57_8570.getPaddedWidth());
		int i_43_ = i_40_ + this.aClass57_8573.getPaddedHeight();
		int i_44_ = (this.aClass128_6375.anInt6330 * -1387457793 + i_40_ - this.aClass57_8574.getPaddedHeight());
		int i_45_ = i_42_ - i_41_;
		int i_46_ = i_44_ - i_43_;
		int i_47_ = method1418(-573228636) * i_45_ / 10000;
		int[] is = new int[4];
		GameClient.activeGraphicsToolkit.qa(is);
		GameClient.activeGraphicsToolkit.setClip(i_41_, i_43_, i_41_ + i_47_, i_44_);
		method1424(i_41_, i_43_, i_45_, i_46_, -672953345);
		GameClient.activeGraphicsToolkit.setClip(i_47_ + i_41_, i_43_, i_42_, i_44_);
		this.aClass57_8569.drawRepeat(i_41_, i_43_, i_45_, i_46_);
		GameClient.activeGraphicsToolkit.setClip(is[0], is[1], is[2], is[3]);
	}

	void method1415(boolean bool, int i, int i_48_) {
		int i_49_ = i + this.aClass57_8571.getPaddedWidth();
		int i_50_ = (-944287579 * this.aClass128_6375.anInt6326 + i - this.aClass57_8570.getPaddedWidth());
		int i_51_ = i_48_ + this.aClass57_8573.getPaddedHeight();
		int i_52_ = (this.aClass128_6375.anInt6330 * -1387457793 + i_48_ - this.aClass57_8574.getPaddedHeight());
		int i_53_ = i_50_ - i_49_;
		int i_54_ = i_52_ - i_51_;
		int i_55_ = method1418(898782840) * i_53_ / 10000;
		int[] is = new int[4];
		GameClient.activeGraphicsToolkit.qa(is);
		GameClient.activeGraphicsToolkit.setClip(i_49_, i_51_, i_49_ + i_55_, i_52_);
		method1424(i_49_, i_51_, i_53_, i_54_, 2053935529);
		GameClient.activeGraphicsToolkit.setClip(i_55_ + i_49_, i_51_, i_50_, i_52_);
		this.aClass57_8569.drawRepeat(i_49_, i_51_, i_53_, i_54_);
		GameClient.activeGraphicsToolkit.setClip(is[0], is[1], is[2], is[3]);
	}

	void method1416(boolean bool, int i, int i_56_) {
		int i_57_ = i + this.aClass57_8571.getPaddedWidth();
		int i_58_ = (-944287579 * this.aClass128_6375.anInt6326 + i - this.aClass57_8570.getPaddedWidth());
		int i_59_ = i_56_ + this.aClass57_8573.getPaddedHeight();
		int i_60_ = (this.aClass128_6375.anInt6330 * -1387457793 + i_56_ - this.aClass57_8574.getPaddedHeight());
		int i_61_ = i_58_ - i_57_;
		int i_62_ = i_60_ - i_59_;
		int i_63_ = method1418(2121135602) * i_61_ / 10000;
		int[] is = new int[4];
		GameClient.activeGraphicsToolkit.qa(is);
		GameClient.activeGraphicsToolkit.setClip(i_57_, i_59_, i_57_ + i_63_, i_60_);
		method1424(i_57_, i_59_, i_61_, i_62_, 1166821857);
		GameClient.activeGraphicsToolkit.setClip(i_63_ + i_57_, i_59_, i_58_, i_60_);
		this.aClass57_8569.drawRepeat(i_57_, i_59_, i_61_, i_62_);
		GameClient.activeGraphicsToolkit.setClip(is[0], is[1], is[2], is[3]);
	}

	void method1410(boolean bool, int i, int i_64_) {
		if (bool) {
			int[] is = new int[4];
			GameClient.activeGraphicsToolkit.qa(is);
			GameClient.activeGraphicsToolkit.setClip(i, i_64_, (this.aClass128_6375.anInt6326) * -944287579 + i, (this.aClass128_6375.anInt6330) * -1387457793 + i_64_);
			int i_65_ = this.aClass57_8571.getPaddedWidth();
			int i_66_ = this.aClass57_8571.getPaddedHeight();
			int i_67_ = this.aClass57_8570.getPaddedWidth();
			int i_68_ = this.aClass57_8570.getPaddedHeight();
			this.aClass57_8571.draw(i, (this.aClass128_6375.anInt6330 * -1387457793 - i_66_) / 2 + i_64_);
			this.aClass57_8570.draw(i + (this.aClass128_6375.anInt6326 * -944287579) - i_67_, (-1387457793 * this.aClass128_6375.anInt6330 - i_68_) / 2 + i_64_);
			GameClient.activeGraphicsToolkit.setClip(i, i_64_, (-944287579 * (this.aClass128_6375.anInt6326) + i), i_64_ + this.aClass57_8573.getPaddedHeight());
			this.aClass57_8573.drawRepeat(i_65_ + i, i_64_, (this.aClass128_6375.anInt6326 * -944287579 - i_65_ - i_67_), (this.aClass128_6375.anInt6330 * -1387457793));
			int i_69_ = this.aClass57_8574.getPaddedHeight();
			GameClient.activeGraphicsToolkit.setClip(i, (this.aClass128_6375.anInt6330 * -1387457793 + i_64_ - i_69_), i + (-944287579 * this.aClass128_6375.anInt6326), i_64_ + (this.aClass128_6375.anInt6330 * -1387457793));
			this.aClass57_8574.drawRepeat(i_65_ + i, i_64_ + (this.aClass128_6375.anInt6330 * -1387457793) - i_69_, (this.aClass128_6375.anInt6326 * -944287579 - i_65_ - i_67_), (this.aClass128_6375.anInt6330 * -1387457793));
			GameClient.activeGraphicsToolkit.setClip(is[0], is[1], is[2], is[3]);
		}
	}

	Class127_Sub1(Js5FileSystem class243, Js5FileSystem class243_70_, Class128_Sub3 class128_sub3) {
		super(class243, class243_70_, class128_sub3);
	}

	public void method53() {
		try {
			super.method53();
			Class128_Sub3 class128_sub3 = (Class128_Sub3) this.aClass128_6375;
			this.aClass57_8572 = StaticMethods.method5663((this.aClass243_6372), (class128_sub3.anInt8563 * -876812375));
			this.aClass57_8569 = StaticMethods.method5663((this.aClass243_6372), (class128_sub3.anInt8562 * 1551490597));
			this.aClass57_8571 = StaticMethods.method5663((this.aClass243_6372), (578265259 * class128_sub3.anInt8566));
			this.aClass57_8570 = StaticMethods.method5663((this.aClass243_6372), (861652881 * class128_sub3.anInt8564));
			this.aClass57_8573 = StaticMethods.method5663((this.aClass243_6372), (-1259370861 * class128_sub3.anInt8565));
			this.aClass57_8574 = StaticMethods.method5663((this.aClass243_6372), (356687159 * class128_sub3.anInt8561));
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("zb.a(").append(')').toString());
		}
	}

	static int method1425(MenuOption menuOption, RSFontMetrics class505, int i) {
		try {
			String string = Class8.method315(menuOption);
			int[] is = Class313.method3821(menuOption);
			if (null != is)
				string = new StringBuilder().append(string).append(StaticMethods.method1999(is)).toString();
			int i_71_ = class505.method6254(string, Class436.aClass57Array5501);
			if (menuOption.aBoolean9665)
				i_71_ += Graphics.aClass57_573.getWidth() + 4;
			return i_71_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("zb.bm(").append(')').toString());
		}
	}

	public static String huffManDecryption(Buffer buffer) {
		try {
			return Class436.method5808(buffer, 32767, 116620582);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("zb.b(").append(')').toString());
		}
	}

	static void method1427() {
		try {
			Class301_Sub1.aClass437_7636.clear();
			Class301_Sub1.aClass437_7637.clear();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("zb.bp(").append(')').toString());
		}
	}

	static final void method1428(ScriptRuntime runtime) {
		try {
			runtime.integerStackOffset -= -783761378;
			int parentHash = (runtime.integerStack[681479919 * runtime.integerStackOffset]);
			int interfaceId = (runtime.integerStack[681479919 * runtime.integerStackOffset + 1]);
			Widget.connectComponent(parentHash, new Widget(interfaceId, 3), null, true);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("zb.sp(").append(')').toString());
		}
	}
}
