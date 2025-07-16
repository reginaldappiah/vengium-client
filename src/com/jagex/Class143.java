package com.jagex;/* Class143 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class143 {
	Js5FileSystem aClass243_1555;
	Js5FileSystem aClass243_1556;
	Class140 aClass140_1557;
	static int anInt1558;

	public Interface6 method1572(Interface5 interface5, byte i) {
		try {
			if (interface5 == null)
				return null;
			Class146 class146 = interface5.method49(1551623871);
			if (class146 == Class146.aClass146_1569)
				return new Class141((Class145) interface5);
			if (Class146.aClass146_1568 == class146)
				return new Class129(method1573(597799285), (Class134) interface5);
			if (class146 == Class146.aClass146_1572)
				return new Class136(this.aClass243_1556, (Class158) interface5);
			if (class146 == Class146.aClass146_1573)
				return new Class136_Sub1(this.aClass243_1556, (Class158_Sub1) interface5);
			if (class146 == Class146.aClass146_1565)
				return new Class127_Sub3(this.aClass243_1556, this.aClass243_1555, (Class128_Sub2) interface5);
			if (Class146.aClass146_1566 == class146)
				return new Class127_Sub2(this.aClass243_1556, this.aClass243_1555, (Class128_Sub1) interface5);
			if (Class146.aClass146_1567 == class146)
				return new Class127_Sub1(this.aClass243_1556, this.aClass243_1555, (Class128_Sub3) interface5);
			if (class146 == Class146.aClass146_1564)
				return new Class126(this.aClass243_1556, this.aClass243_1555, (Class151) interface5);
			if (class146 == Class146.aClass146_1570)
				return new Class135(this.aClass243_1556, (Class165) interface5);
			if (class146 == Class146.aClass146_1571)
				return new Class127_Sub1_Sub1(this.aClass243_1556, this.aClass243_1555, (Class128_Sub3_Sub1) interface5);
			return null;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("fu.a(").append(')').toString());
		}
	}

	public Class143(Js5FileSystem class243, Js5FileSystem class243_0_) {
		this.aClass243_1556 = class243;
		this.aClass243_1555 = class243_0_;
	}

	Class140 method1573(int i) {
		try {
			if (null == this.aClass140_1557)
				this.aClass140_1557 = new Class140();
			return this.aClass140_1557;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("fu.f(").append(')').toString());
		}
	}

	static final void method1574(ScriptRuntime class403, int i) {
		try {
			int i_1_ = (class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]);
			IComponentDefinition class105 = IComponentDefinition.getInterfaceComponent(i_1_);
			IComponentDefinitionCollection IComponentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[i_1_ >> 16];
			ToMoveIComponentScripts.method1890(class105, class403);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("fu.kj(").append(')').toString());
		}
	}

	static final void method1575(ScriptRuntime class403, byte i) {
		try {
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = class403.aClass162_5252.anInt1661 * 2125429757;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("fu.xs(").append(')').toString());
		}
	}

	static final void method1576(ScriptRuntime class403, int i) {
		try {
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = GameLanguage.CURRENT_LANGUAGE.getID();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("fu.up(").append(')').toString());
		}
	}

	static final boolean method1577(Class326[][][] class326s, int i, int i_2_, int i_3_, boolean bool, int i_4_) {
		try {
			byte[][][] flags = GameClient.myRegion.getRoofFlags();
			byte i_5_ = (bool ? (byte) 1 : (byte) (-1953789277 * GameClient.flashTick & 0xff));
			if (i_5_ == flags[1855729883 * GameClient.plane][i_2_][i_3_])
				return false;
			Class244 class244 = GameClient.myRegion.method2654();
			if (((class244.flags[GameClient.plane * 1855729883][i_2_][i_3_]) & 0x4) == 0)
				return false;
			int i_6_ = 0;
			int i_7_ = 0;
			GameClient.anIntArray8735[i_6_] = i_2_;
			GameClient.anIntArray8847[i_6_++] = i_3_;
			flags[1855729883 * GameClient.plane][i_2_][i_3_] = i_5_;
			while (i_7_ != i_6_) {
				int i_8_ = GameClient.anIntArray8735[i_7_] & 0xffff;
				int i_9_ = GameClient.anIntArray8735[i_7_] >> 16 & 0xff;
				int i_10_ = GameClient.anIntArray8735[i_7_] >> 24 & 0xff;
				int i_11_ = GameClient.anIntArray8847[i_7_] & 0xffff;
				int i_12_ = GameClient.anIntArray8847[i_7_] >> 16 & 0xff;
				i_7_ = i_7_ + 1 & 0xfff;
				boolean bool_13_ = false;
				if (((class244.flags[1855729883 * GameClient.plane][i_8_][i_11_]) & 0x4) == 0)
					bool_13_ = true;
				boolean bool_14_ = false;
				if (null != class326s) {
					int i_15_ = GameClient.plane * 1855729883 + 1;
					while_63_: for (/**/; i_15_ <= 3; i_15_++) {
						if (null == class326s[i_15_]) {
							if (i_4_ != -777988087)
								throw new IllegalStateException();
						} else if (((class244.flags[i_15_][i_8_][i_11_]) & 0x8) == 0) {
							if (bool_13_ && null != class326s[i_15_][i_8_][i_11_]) {
								if (null != (class326s[i_15_][i_8_][i_11_].aClass365_Sub1_Sub5_3457)) {
									int i_16_ = StaticMethods.method1402(i_9_);
									if (i_16_ == (class326s[i_15_][i_8_][i_11_].aClass365_Sub1_Sub5_3457.aShort9814))
										continue;
									if (null != (class326s[i_15_][i_8_][i_11_].aClass365_Sub1_Sub5_3458) && i_16_ == (class326s[i_15_][i_8_][i_11_].aClass365_Sub1_Sub5_3458.aShort9814)) {
										if (i_4_ != -777988087)
											throw new IllegalStateException();
										continue;
									}
									if (i_10_ != 0) {
										int i_17_ = StaticMethods.method1402(i_10_);
										if ((class326s[i_15_][i_8_][i_11_].aClass365_Sub1_Sub5_3457.aShort9814) == i_17_)
											continue;
										if (null != (class326s[i_15_][i_8_][i_11_].aClass365_Sub1_Sub5_3458) && (class326s[i_15_][i_8_][i_11_].aClass365_Sub1_Sub5_3458.aShort9814) == i_17_) {
											if (i_4_ != -777988087) {
												/* empty */
											}
											continue;
										}
									}
									if (i_12_ != 0) {
										int i_18_ = StaticMethods.method1402(i_12_);
										if (i_18_ == (class326s[i_15_][i_8_][i_11_].aClass365_Sub1_Sub5_3457.aShort9814))
											continue;
										if ((class326s[i_15_][i_8_][i_11_].aClass365_Sub1_Sub5_3458) != null && (class326s[i_15_][i_8_][i_11_].aClass365_Sub1_Sub5_3458.aShort9814) == i_18_) {
											if (i_4_ != -777988087)
												throw new IllegalStateException();
											continue;
										}
									}
								}
								Class326 class326 = class326s[i_15_][i_8_][i_11_];
								if (null != class326.aClass322_3456) {
									for (Class322 class322 = class326.aClass322_3456; null != class322; class322 = class322.aClass322_3360) {
										Class365_Sub1_Sub1 class365_sub1_sub1 = (class322.aClass365_Sub1_Sub1_3359);
										if (class365_sub1_sub1 instanceof SceneObject) {
											SceneObject sceneObject = ((SceneObject) class365_sub1_sub1);
											int i_19_ = sceneObject.method29();
											int i_20_ = sceneObject.method30();
											if (21 == i_19_)
												i_19_ = 19;
											int i_21_ = i_19_ | i_20_ << 6;
											if (i_21_ == i_9_) {
												if (i_4_ != -777988087) {
													/* empty */
												}
												continue while_63_;
											}
											if (i_10_ != 0 && i_10_ == i_21_) {
												if (i_4_ != -777988087) {
													/* empty */
												}
												continue while_63_;
											}
											if (i_12_ != 0 && i_12_ == i_21_) {
												if (i_4_ != -777988087)
													throw new IllegalStateException();
												continue while_63_;
											}
										}
									}
								}
							}
							Class326 class326 = class326s[i_15_][i_8_][i_11_];
							if (null != class326 && class326.aClass322_3456 != null) {
								for (Class322 class322 = class326.aClass322_3456; class322 != null; class322 = class322.aClass322_3360) {
									Class365_Sub1_Sub1 class365_sub1_sub1 = class322.aClass365_Sub1_Sub1_3359;
									if ((class365_sub1_sub1.aShort9796 != class365_sub1_sub1.aShort9798) || (class365_sub1_sub1.aShort9795 != (class365_sub1_sub1.aShort9797))) {
										for (int i_22_ = (class365_sub1_sub1.aShort9798); i_22_ <= (class365_sub1_sub1.aShort9796); i_22_++) {
											for (int i_23_ = (class365_sub1_sub1.aShort9795); i_23_ <= (class365_sub1_sub1.aShort9797); i_23_++)
												flags[i_15_][i_22_][i_23_] = i_5_;
										}
									}
								}
							}
							flags[i_15_][i_8_][i_11_] = i_5_;
							bool_14_ = true;
						}
					}
				}
				if (bool_14_) {
					int i_24_ = GameClient.myRegion.getRegion().aClass_xaArray3517[1855729883 * GameClient.plane + 1].method6341(i_8_, i_11_);
					if (GameClient.anIntArray8793[i] < i_24_)
						GameClient.anIntArray8793[i] = i_24_;
					int i_25_ = i_8_ << 9;
					int i_26_ = i_11_ << 9;
					if (GameClient.anIntArray8670[i] > i_25_)
						GameClient.anIntArray8670[i] = i_25_;
					else if (GameClient.anIntArray8795[i] < i_25_)
						GameClient.anIntArray8795[i] = i_25_;
					if (GameClient.anIntArray8797[i] > i_26_)
						GameClient.anIntArray8797[i] = i_26_;
					else if (GameClient.anIntArray8641[i] < i_26_)
						GameClient.anIntArray8641[i] = i_26_;
				}
				if (bool_13_) {
					if (i_4_ != -777988087) {
						/* empty */
					}
				} else {
					if (i_8_ >= 1 && i_5_ != (flags[1855729883 * GameClient.plane][i_8_ - 1][i_11_])) {
						GameClient.anIntArray8735[i_6_] = i_8_ - 1 | 0x120000 | ~0x2cffffff;
						GameClient.anIntArray8847[i_6_] = i_11_ | 0x130000;
						i_6_ = i_6_ + 1 & 0xfff;
						flags[GameClient.plane * 1855729883][i_8_ - 1][i_11_] = i_5_;
					}
					if (++i_11_ < GameClient.myRegion.getMapLength()) {
						if (i_8_ - 1 >= 0 && i_5_ != (flags[GameClient.plane * 1855729883][i_8_ - 1][i_11_]) && 0 == ((class244.flags[1855729883 * GameClient.plane][i_8_][i_11_]) & 0x4) && 0 == ((class244.flags[GameClient.plane * 1855729883][i_8_ - 1][i_11_ - 1]) & 0x4)) {
							GameClient.anIntArray8735[i_6_] = i_8_ - 1 | 0x120000 | 0x52000000;
							GameClient.anIntArray8847[i_6_] = i_11_ | 0x130000;
							i_6_ = 1 + i_6_ & 0xfff;
							flags[GameClient.plane * 1855729883][i_8_ - 1][i_11_] = i_5_;
						}
						if (flags[1855729883 * GameClient.plane][i_8_][i_11_] != i_5_) {
							GameClient.anIntArray8735[i_6_] = i_8_ | 0x520000 | 0x13000000;
							GameClient.anIntArray8847[i_6_] = i_11_ | 0x530000;
							i_6_ = i_6_ + 1 & 0xfff;
							flags[1855729883 * GameClient.plane][i_8_][i_11_] = i_5_;
						}
						if ((1 + i_8_ < GameClient.myRegion.getMapWidth()) && i_5_ != (flags[GameClient.plane * 1855729883][1 + i_8_][i_11_]) && ((class244.flags[1855729883 * GameClient.plane][i_8_][i_11_]) & 0x4) == 0 && ((class244.flags[1855729883 * GameClient.plane][1 + i_8_][i_11_ - 1]) & 0x4) == 0) {
							GameClient.anIntArray8735[i_6_] = i_8_ + 1 | 0x520000 | ~0x6dffffff;
							GameClient.anIntArray8847[i_6_] = i_11_ | 0x530000;
							i_6_ = 1 + i_6_ & 0xfff;
							flags[1855729883 * GameClient.plane][i_8_ + 1][i_11_] = i_5_;
						}
					}
					i_11_--;
					if ((1 + i_8_ < GameClient.myRegion.getMapWidth()) && i_5_ != (flags[1855729883 * GameClient.plane][i_8_ + 1][i_11_])) {
						GameClient.anIntArray8735[i_6_] = 1 + i_8_ | 0x920000 | 0x53000000;
						GameClient.anIntArray8847[i_6_] = i_11_ | 0x930000;
						i_6_ = i_6_ + 1 & 0xfff;
						flags[GameClient.plane * 1855729883][i_8_ + 1][i_11_] = i_5_;
					}
					if (--i_11_ >= 0) {
						if (i_8_ - 1 >= 0 && i_5_ != (flags[1855729883 * GameClient.plane][i_8_ - 1][i_11_]) && ((class244.flags[1855729883 * GameClient.plane][i_8_][i_11_]) & 0x4) == 0 && ((class244.flags[1855729883 * GameClient.plane][i_8_ - 1][1 + i_11_]) & 0x4) == 0) {
							GameClient.anIntArray8735[i_6_] = i_8_ - 1 | 0xd20000 | 0x12000000;
							GameClient.anIntArray8847[i_6_] = i_11_ | 0xd30000;
							i_6_ = i_6_ + 1 & 0xfff;
							flags[1855729883 * GameClient.plane][i_8_ - 1][i_11_] = i_5_;
						}
						if (i_5_ != (flags[1855729883 * GameClient.plane][i_8_][i_11_])) {
							GameClient.anIntArray8735[i_6_] = i_8_ | 0xd20000 | ~0x6cffffff;
							GameClient.anIntArray8847[i_6_] = i_11_ | 0xd30000;
							i_6_ = i_6_ + 1 & 0xfff;
							flags[GameClient.plane * 1855729883][i_8_][i_11_] = i_5_;
						}
						if ((1 + i_8_ < GameClient.myRegion.getMapWidth()) && (flags[1855729883 * GameClient.plane][i_8_ + 1][i_11_]) != i_5_ && ((class244.flags[GameClient.plane * 1855729883][i_8_][i_11_]) & 0x4) == 0 && ((class244.flags[GameClient.plane * 1855729883][i_8_ + 1][i_11_ + 1]) & 0x4) == 0) {
							GameClient.anIntArray8735[i_6_] = 1 + i_8_ | 0x920000 | ~0x2dffffff;
							GameClient.anIntArray8847[i_6_] = i_11_ | 0x930000;
							i_6_ = i_6_ + 1 & 0xfff;
							flags[GameClient.plane * 1855729883][1 + i_8_][i_11_] = i_5_;
						}
					}
				}
			}
			if (-1000000 != GameClient.anIntArray8793[i]) {
				GameClient.anIntArray8793[i] += 40;
				GameClient.anIntArray8670[i] -= 512;
				GameClient.anIntArray8795[i] += 512;
				GameClient.anIntArray8641[i] += 512;
				GameClient.anIntArray8797[i] -= 512;
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("fu.iz(").append(')').toString());
		}
	}

	public static void clear() {
		try {
			Class190.aClass348_1929.clear();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("fu.k(").append(')').toString());
		}
	}
}
