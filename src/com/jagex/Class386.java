package com.jagex;/* Class386 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Arrays;

public class Class386 {
	int anInt4143;
	public int anInt4144;
	static int anInt4145;
	public static IPAddress autoWorld;

	public boolean method4717(int i, int i_0_, int i_1_, byte i_2_) {
		try {
			int i_3_ = this.anInt4143 * -559061353;
			if (i == anInt4144 * 259411823 && -559061353 * this.anInt4143 == 0)
				return false;
			boolean bool;
			if (0 == this.anInt4143 * -559061353) {
				if ((i > 259411823 * anInt4144 && i <= i_0_ + anInt4144 * 259411823) || (i < anInt4144 * 259411823 && i >= 259411823 * anInt4144 - i_0_)) {
					anInt4144 = 852488079 * i;
					return false;
				}
				bool = true;
			} else if (this.anInt4143 * -559061353 > 0 && i > 259411823 * anInt4144) {
				int i_4_ = (-559061353 * this.anInt4143 * (-559061353 * this.anInt4143) / (i_0_ * 2));
				int i_5_ = i_4_ + 259411823 * anInt4144;
                bool = !(i_5_ >= i || i_5_ < anInt4144 * 259411823);
			} else if (-559061353 * this.anInt4143 < 0 && i < 259411823 * anInt4144) {
				int i_6_ = (-559061353 * this.anInt4143 * (this.anInt4143 * -559061353) / (2 * i_0_));
				int i_7_ = 259411823 * anInt4144 - i_6_;
                bool = !(i_7_ <= i || i_7_ > anInt4144 * 259411823);
			} else
				bool = false;
			if (bool) {
				if (i > anInt4144 * 259411823) {
					this.anInt4143 += -307726041 * i_0_;
					if (i_1_ != 0 && -559061353 * this.anInt4143 > i_1_)
						this.anInt4143 = i_1_ * -307726041;
				} else {
					this.anInt4143 -= -307726041 * i_0_;
					if (i_1_ != 0 && this.anInt4143 * -559061353 < -i_1_)
						this.anInt4143 = -i_1_ * -307726041;
				}
				if (i_3_ != this.anInt4143 * -559061353) {
					int i_8_ = (-559061353 * this.anInt4143 * (-559061353 * this.anInt4143) / (i_0_ * 2));
					if (i > anInt4144 * 259411823) {
						if (i_8_ + anInt4144 * 259411823 > i)
							this.anInt4143 = i_3_ * -307726041;
					} else if (i < 259411823 * anInt4144 && anInt4144 * 259411823 - i_8_ < i)
						this.anInt4143 = -307726041 * i_3_;
				}
			} else if (this.anInt4143 * -559061353 > 0) {
				this.anInt4143 -= -307726041 * i_0_;
				if (-559061353 * this.anInt4143 < 0)
					this.anInt4143 = 0;
			} else {
				this.anInt4143 += i_0_ * -307726041;
				if (this.anInt4143 * -559061353 > 0)
					this.anInt4143 = 0;
			}
			anInt4144 += (this.anInt4143 * -559061353 + i_3_ >> 1) * 852488079;
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("q.a(").append(')').toString());
		}
	}

	public void method4718(int i, int i_9_) {
		try {
			anInt4144 = 852488079 * i;
			this.anInt4143 = 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("q.f(").append(')').toString());
		}
	}

	public int method4719(byte i) {
		try {
			return 259411823 * anInt4144 & 0x3fff;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("q.b(").append(')').toString());
		}
	}

	public void method4720(byte i) {
		try {
			anInt4144 = 852488079 * (259411823 * anInt4144 & 0x3fff);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("q.p(").append(')').toString());
		}
	}

	static void method4721(Class428 class428, byte i) {
		try {
			Class378.aClass428_4094 = class428;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("q.q(").append(')').toString());
		}
	}

	static void method4722(ScriptRuntime runtime) {
		try {
			runtime.integerStack[681479919 * runtime.integerStackOffset - 1] = (Class316.aClass362_3318.getQuestType((runtime.integerStack[runtime.integerStackOffset * 681479919 - 1])).aBoolean4027) ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("q.i(").append(')').toString());
		}
	}

	static final void method4723(ScriptRuntime class403, int i) {
		try {
			int i_10_ = (class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]);
			IComponentDefinition class105 = IComponentDefinition.getInterfaceComponent(i_10_);
			IComponentDefinitionCollection IComponentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[i_10_ >> 16];
			ToMoveIComponentScripts.method365(class105, IComponentDefinitionCollection, false, 0, class403);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("q.hs(").append(')').toString());
		}
	}

	static final void method4724(ScriptRuntime runtime) {
		try {
			if (AwtKeyboard.keyboard.held(86))
				runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = 1;
			else
				runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("q.add(").append(')').toString());
		}
	}

	public static void method4725(Player class365_sub1_sub1_sub2_sub2, int i, int i_11_, int i_12_) {
		try {
			int[] is = new int[Class522.method6325((byte) -113).length];
			Arrays.fill(is, 0, is.length, i);
			Class431.method5768(class365_sub1_sub1_sub2_sub2, is, i_11_, false);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("q.ij(").append(')').toString());
		}
	}

	static boolean method4726(GraphicsToolkit graphicsToolkit, Class298_Sub52 class298_sub52, Class352 class352, int i, int i_13_, int i_14_) {
		try {
			int i_15_ = 2147483647;
			int i_16_ = -2147483648;
			int i_17_ = 2147483647;
			int i_18_ = -2147483648;
			if (null != class352.anIntArray3803) {
				i_15_ = (Class301_Sub1.anInt3221 + ((class298_sub52.anInt7607 * 2122110429 + class352.anInt3804 * 1281846757 - Class301_Sub1.anInt3230) * (Class301_Sub1.anInt3256 - Class301_Sub1.anInt3221) / (Class301_Sub1.anInt3252 - Class301_Sub1.anInt3230)));
				i_16_ = (((class352.anInt3793 * 968926443 + class298_sub52.anInt7607 * 2122110429 - Class301_Sub1.anInt3230) * (Class301_Sub1.anInt3256 - Class301_Sub1.anInt3221) / (Class301_Sub1.anInt3252 - Class301_Sub1.anInt3230)) + Class301_Sub1.anInt3221);
				i_18_ = (Class301_Sub1.anInt3257 - ((class352.anInt3805 * -1901940595 + class298_sub52.anInt7610 * -372920341 - Class301_Sub1.anInt3242) * (Class301_Sub1.anInt3257 - Class301_Sub1.anInt3255) / (Class301_Sub1.anInt3241 - Class301_Sub1.anInt3242)));
				i_17_ = (Class301_Sub1.anInt3257 - ((-1294057761 * class352.anInt3807 + -372920341 * class298_sub52.anInt7610 - Class301_Sub1.anInt3242) * (Class301_Sub1.anInt3257 - Class301_Sub1.anInt3255) / (Class301_Sub1.anInt3241 - Class301_Sub1.anInt3242)));
			}
			SpriteToolkit class57 = null;
			int i_19_ = 0;
			int i_20_ = 0;
			int i_21_ = 0;
			int i_22_ = 0;
			if (-1 != class352.anInt3785 * 715019623) {
				if (class298_sub52.focused && -1 != class352.anInt3779 * -1413078901)
					class57 = class352.method4238(graphicsToolkit, true);
				else
					class57 = class352.method4238(graphicsToolkit, false);
				if (null != class57) {
					i_19_ = (1333098669 * class298_sub52.anInt7609 - (class57.getPaddedWidth() + 1 >> 1));
					if (i_19_ < i_15_)
						i_15_ = i_19_;
					i_20_ = (class298_sub52.anInt7609 * 1333098669 + (class57.getPaddedWidth() + 1 >> 1));
					if (i_20_ > i_16_)
						i_16_ = i_20_;
					i_21_ = (-685779893 * class298_sub52.anInt7606 - (class57.getPaddedHeight() + 1 >> 1));
					if (i_21_ < i_17_)
						i_17_ = i_21_;
					i_22_ = (class298_sub52.anInt7606 * -685779893 + (class57.getPaddedHeight() + 1 >> 1));
					if (i_22_ > i_18_)
						i_18_ = i_22_;
				}
			}
			Class4 class4 = null;
			int i_23_ = 0;
			int i_24_ = 0;
			int i_25_ = 0;
			int i_26_ = 0;
			int i_27_ = 0;
			int i_28_ = 0;
			int i_29_ = 0;
			int i_30_ = 0;
			if (class352.aString3792 != null) {
				class4 = GraphicsContext.method555(class352.anInt3783 * 1023000389);
				if (class4 != null) {
					i_23_ = Class74.aClass505_695.method6257((class352.aString3792), null, (Class301_Sub1.aStringArray7638), null);
					i_24_ = ((-366520063 * class352.anInt3812 * (Class301_Sub1.anInt3256 - Class301_Sub1.anInt3221) / (Class301_Sub1.anInt3252 - Class301_Sub1.anInt3230)) + class298_sub52.anInt7609 * 1333098669);
					i_25_ = (-685779893 * class298_sub52.anInt7606 - (60900013 * class352.anInt3813 * (Class301_Sub1.anInt3257 - Class301_Sub1.anInt3255) / (Class301_Sub1.anInt3241 - Class301_Sub1.anInt3242)));
					if (null == class57)
						i_25_ -= class4.method306() * i_23_ / 2;
					else
						i_25_ -= ((class57.getPaddedHeight() >> 1) + class4.method309() * i_23_);
					for (int i_31_ = 0; i_31_ < i_23_; i_31_++) {
						String string = Class301_Sub1.aStringArray7638[i_31_];
						if (i_31_ < i_23_ - 1)
							string = string.substring(0, string.length() - 4);
						int i_32_ = class4.method307(string);
						if (i_32_ > i_26_)
							i_26_ = i_32_;
					}
					i_27_ = i_24_ - i_26_ / 2 + i;
					if (i_27_ < i_15_)
						i_15_ = i_27_;
					i_28_ = i + (i_24_ + i_26_ / 2);
					if (i_28_ > i_16_)
						i_16_ = i_28_;
					i_29_ = i_13_ + i_25_;
					if (i_29_ < i_17_)
						i_17_ = i_29_;
					i_30_ = i_25_ + i_23_ * class4.method309() + i_13_;
					if (i_30_ > i_18_)
						i_18_ = i_30_;
				}
			}
			if (i_16_ < Class301_Sub1.anInt3221 || i_15_ > Class301_Sub1.anInt3256 || i_18_ < Class301_Sub1.anInt3255 || i_17_ > Class301_Sub1.anInt3257)
				return true;
			Class301_Sub1.method3711(graphicsToolkit, class298_sub52, class352);
			if (null != class57) {
				if (Class137_Sub1.anInt6991 * -1983068885 > 0 && ((-271159611 * Class301_Sub1.anInt7633 != -1 && (Class301_Sub1.anInt7633 * -271159611 == class298_sub52.anInt7608 * -530122905)) || (-484575331 * Class301_Sub1.anInt7630 != -1 && (Class301_Sub1.anInt7630 * -484575331 == class352.anInt3817 * -804513353)))) {
					int i_33_;
					if (Class88.anInt810 * -1581933633 > 50)
						i_33_ = 200 - 1131100030 * Class88.anInt810;
					else
						i_33_ = Class88.anInt810 * 1131100030;
					int i_34_ = i_33_ << 24 | 0xffff00;
					graphicsToolkit.method5016(class298_sub52.anInt7609 * 1333098669, -685779893 * class298_sub52.anInt7606, class57.getWidth() / 2 + 7, i_34_);
					graphicsToolkit.method5016(class298_sub52.anInt7609 * 1333098669, -685779893 * class298_sub52.anInt7606, class57.getWidth() / 2 + 5, i_34_);
					graphicsToolkit.method5016(1333098669 * class298_sub52.anInt7609, -685779893 * class298_sub52.anInt7606, class57.getWidth() / 2 + 3, i_34_);
					graphicsToolkit.method5016(1333098669 * class298_sub52.anInt7609, -685779893 * class298_sub52.anInt7606, class57.getWidth() / 2 + 1, i_34_);
					graphicsToolkit.method5016(class298_sub52.anInt7609 * 1333098669, -685779893 * class298_sub52.anInt7606, class57.getWidth() / 2, i_34_);
				}
				class57.draw((1333098669 * class298_sub52.anInt7609 - (class57.getPaddedWidth() >> 1)), (class298_sub52.anInt7606 * -685779893 - (class57.getPaddedHeight() >> 1)));
			}
			if (class352.aString3792 != null && class4 != null)
				Class298_Sub39.method3505(graphicsToolkit, class298_sub52, class352, i_23_, i_24_, i_25_, i_26_, class4, -1957009990);
			if (-1 != 715019623 * class352.anInt3785 || null != class352.aString3792) {
				Class298_Sub6 class298_sub6 = new Class298_Sub6(class298_sub52);
				class298_sub6.anInt7209 = i_19_ * -526214221;
				class298_sub6.anInt7204 = 262353353 * i_20_;
				class298_sub6.anInt7205 = i_21_ * -1699538327;
				class298_sub6.anInt7210 = i_22_ * 1271571593;
				class298_sub6.anInt7211 = 1756490303 * i_27_;
				class298_sub6.anInt7208 = -203535375 * i_28_;
				class298_sub6.anInt7207 = i_29_ * 914712007;
				class298_sub6.anInt7203 = i_30_ * 205947907;
				DiskFile.aClass453_5986.pushBack(class298_sub6);
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("q.bi(").append(')').toString());
		}
	}

	static void method4727(ScriptRuntime class403, int i) {
		try {
			class403.integerStack[681479919 * class403.integerStackOffset - 1] = (Class316.aClass362_3318.getQuestType((class403.integerStack[681479919 * class403.integerStackOffset - 1])).rewardPoints) * 1646094589;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("q.k(").append(')').toString());
		}
	}
}
