package com.jagex;/* Class310 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class310 implements Interface17 {
	Class365_Sub1_Sub1_Sub4 aClass365_Sub1_Sub1_Sub4_6511;
	static int anInt6512;

	public boolean method228(Class365_Sub1_Sub1 class365_sub1_sub1) {
		return (this.aClass365_Sub1_Sub1_Sub4_6511 == class365_sub1_sub1);
	}

	Class310(Class365_Sub1_Sub1_Sub4 class365_sub1_sub1_sub4) {
		this.aClass365_Sub1_Sub1_Sub4_6511 = class365_sub1_sub1_sub4;
	}

	public boolean method229(Class365_Sub1_Sub1 class365_sub1_sub1, int i) {
		try {
			return (this.aClass365_Sub1_Sub1_Sub4_6511 == class365_sub1_sub1);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("mw.a(").append(')').toString());
		}
	}

	public boolean method230(Class365_Sub1_Sub1 class365_sub1_sub1) {
		return (this.aClass365_Sub1_Sub1_Sub4_6511 == class365_sub1_sub1);
	}

	static int method3809(Class343_Sub1 class343_sub1, Class343_Sub1 class343_sub1_0_, int i, boolean bool, int i_1_, boolean bool_2_, int i_3_) {
		try {
			int i_4_ = VarDefinition.method1931(class343_sub1, class343_sub1_0_, i, bool, -1657159001);
			if (i_4_ != 0) {
				if (bool)
					return -i_4_;
				return i_4_;
			}
			if (-1 == i_1_)
				return 0;
			int i_5_ = VarDefinition.method1931(class343_sub1, class343_sub1_0_, i_1_, bool_2_, -552551191);
			if (bool_2_)
				return -i_5_;
			return i_5_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("mw.r(").append(')').toString());
		}
	}

	static void method3810(GraphicsToolkit graphicsToolkit) {
		try {
			int i_6_ = -10660793;
			StaticMethods.method3948(graphicsToolkit, -1347746885 * Class88.anInt806, TileMessage.anInt7658 * 1089948687, Class134.anInt6343 * 608683427, Class448.anInt5619 * 1396607435, i_6_, -16777216, (byte) 123);
			StaticMethods.b12_full_monochrome.method2488(Tradution.CHOOSE_OPTION.translate(GameLanguage.CURRENT_LANGUAGE), -1347746885 * Class88.anInt806 + 3, 1089948687 * TileMessage.anInt7658 + 14, i_6_, -1);
			int i_7_ = AwtMouse.mouse.getLastX();
			int i_8_ = AwtMouse.mouse.getLastY();
			if (!Class436.aBoolean5471) {
				int i_9_ = 0;
				for (MenuOption menuOption = ((MenuOption) Class436.aClass453_5480.method5939()); menuOption != null; menuOption = ((MenuOption) Class436.aClass453_5480.method5944())) {
					int i_10_ = (31 + 1089948687 * TileMessage.anInt7658 + (-411680299 * Class436.anInt5467 * (-278777595 * Class436.menuOptionCount - 1 - i_9_)));
					StaticMethods.method5192(i_7_, i_8_, -1347746885 * Class88.anInt806, 608683427 * Class134.anInt6343, i_10_, menuOption, StaticMethods.b12_full_monochrome, Class82_Sub19_Sub1.aClass505_9111, -1, -256);
					i_9_++;
				}
			} else {
				int i_11_ = 0;
				for (MenuOptionNode menuOptionNode = ((MenuOptionNode) Class436.aClass461_5482.first()); null != menuOptionNode; menuOptionNode = ((MenuOptionNode) Class436.aClass461_5482.next())) {
					int i_12_ = (TileMessage.anInt7658 * 1089948687 + 31 + i_11_ * (-411680299 * Class436.anInt5467));
					if (1 == (menuOptionNode.getTotalMenus) * -628325139)
						StaticMethods.method5192(i_7_, i_8_, -1347746885 * Class88.anInt806, 608683427 * Class134.anInt6343, i_12_, ((MenuOption) (menuOptionNode.circularDoubleLinkedList.DELIMETER.next_cache)), StaticMethods.b12_full_monochrome, Class82_Sub19_Sub1.aClass505_9111, -1, -256);
					else
						RSFontMetrics.method763(i_7_, i_8_, Class88.anInt806 * -1347746885, 1089948687 * TileMessage.anInt7658, Class134.anInt6343 * 608683427, Class448.anInt5619 * 1396607435, i_12_, menuOptionNode, StaticMethods.b12_full_monochrome, Class82_Sub19_Sub1.aClass505_9111, -1, -256);
					i_11_++;
				}
				if (null != Class436.aMenuOptionNode_5472) {
					StaticMethods.method3948(graphicsToolkit, StaticMethods.anInt5681 * 805710735, -1370784315 * ClassNotAnim.anInt6119, 2054409059 * MenuOption.anInt5345, -1855216229 * SpotTypeLoader.anInt4166, i_6_, -16777216, (byte) 111);
					StaticMethods.b12_full_monochrome.method2488(Class436.aMenuOptionNode_5472.aString9585, 805710735 * StaticMethods.anInt5681 + 3, -1370784315 * ClassNotAnim.anInt6119 + 14, i_6_, -1);
					i_11_ = 0;
					for (MenuOption menuOption = ((MenuOption) Class436.aMenuOptionNode_5472.circularDoubleLinkedList.first()); null != menuOption; menuOption = ((MenuOption) Class436.aMenuOptionNode_5472.circularDoubleLinkedList.next())) {
						int i_13_ = (i_11_ * (-411680299 * Class436.anInt5467) + (ClassNotAnim.anInt6119 * -1370784315 + 31));
						StaticMethods.method5192(i_7_, i_8_, 805710735 * StaticMethods.anInt5681, 2054409059 * MenuOption.anInt5345, i_13_, menuOption, StaticMethods.b12_full_monochrome, Class82_Sub19_Sub1.aClass505_9111, -1, -256);
						i_11_++;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("mw.ar(").append(')').toString());
		}
	}
}
