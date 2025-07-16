package com.jagex;/* Class298_Sub17_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub17_Sub4 extends Class298_Sub17 {
	byte aByte9202;
	String aString9203;
	byte aByte9204;
	Class152 aClass152_9205;

	void method2918(ClanChannelChat clanChannelChat) {
		try {
			clanChannelChat.channelName = this.aString9203;
			if (null != this.aString9203) {
				clanChannelChat.minimumRankToChat = this.aByte9204;
				clanChannelChat.minimumRankToKick = this.aByte9202;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ags.f(").append(')').toString());
		}
	}

	Class298_Sub17_Sub4(Class152 class152) {
		super();
	}

	void method2917(Buffer buffer) {
		try {
			this.aString9203 = buffer.readNullString();
			if (this.aString9203 != null) {
				buffer.readUByte();
				this.aByte9204 = buffer.readByte();
				this.aByte9202 = buffer.readByte();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ags.a(").append(')').toString());
		}
	}

	static final void method2925(ScriptRuntime runtime) {
		try {
			int i_0_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
			Class298_Sub37_Sub13 class298_sub37_sub13 = WorldMapHandler.method3705(i_0_);
			if (class298_sub37_sub13 == null)
				runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = -1;
			else
				runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = 1110271707 * class298_sub37_sub13.anInt9645;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ags.aeq(").append(')').toString());
		}
	}

	static int method2926(int i) {
		try {
			if (GameClient.fromIComponentDefinition == null) {
				if (!GameClient.menuOpen) {
					if (StaticMethods.aClass381_1563.aBoolean4118) {
						if (StaticMethods.aMenuOption_3322 != null)
							return ((StaticMethods.aMenuOption_3322.cursor) * -1988795597);
					} else if (Class298_Sub45.aMenuOption_7522 != null)
						return ((Class298_Sub45.aMenuOption_7522.cursor) * -1988795597);
				} else {
					RSFontMetrics class505 = RSFontMetrics.getDefaultFont();
					int i_1_ = AwtMouse.mouse.getLastX();
					int i_2_ = AwtMouse.mouse.getLastY();
					if (!Class436.aBoolean5471) {
						if (i_1_ > Class88.anInt806 * -1347746885 && i_1_ < (608683427 * Class134.anInt6343 + Class88.anInt806 * -1347746885)) {
							int i_3_ = -1;
							for (int i_4_ = 0; i_4_ < Class436.menuOptionCount * -278777595; i_4_++) {
								if (Class436.aBoolean5496) {
									int i_5_ = ((-411680299 * Class436.anInt5467 * (-278777595 * Class436.menuOptionCount - 1 - i_4_)) + (1 + ((class505.anInt6202 * 1110385787) + (20 + (TileMessage.anInt7658 * 1089948687)))));
									if (i_2_ > i_5_ - (class505.anInt6202 * 1110385787) - 1 && i_2_ < (class505.anInt6197 * -1883958527) + i_5_)
										i_3_ = i_4_;
								} else {
									int i_6_ = (((Class436.menuOptionCount * -278777595 - 1 - i_4_) * (Class436.anInt5467 * -411680299)) + ((1089948687 * TileMessage.anInt7658) + 31));
									if (i_2_ > i_6_ - (class505.anInt6202 * 1110385787) - 1 && i_2_ < (class505.anInt6197 * -1883958527) + i_6_)
										i_3_ = i_4_;
								}
							}
							if (-1 != i_3_) {
								int i_7_ = 0;
								Class446 class446 = new Class446(Class436.aClass453_5480);
								for (MenuOption menuOption = ((MenuOption) class446.getNext(446818813)); null != menuOption; menuOption = ((MenuOption) class446.next())) {
									if (i_7_++ == i_3_)
										return (-1988795597 * (menuOption.cursor));
								}
							}
						}
					} else if (i_1_ > -1347746885 * Class88.anInt806 && i_1_ < (-1347746885 * Class88.anInt806 + Class134.anInt6343 * 608683427)) {
						int i_8_ = -1;
						for (int i_9_ = 0; i_9_ < 1592446965 * Class436.anInt5479; i_9_++) {
							if (Class436.aBoolean5496) {
								int i_10_ = (i_9_ * (Class436.anInt5467 * -411680299) + (1 + ((TileMessage.anInt7658 * 1089948687) + 20 + (class505.anInt6202 * 1110385787))));
								if (i_2_ > (i_10_ - class505.anInt6202 * 1110385787 - 1) && i_2_ < (class505.anInt6197 * -1883958527 + i_10_))
									i_8_ = i_9_;
							} else {
								int i_11_ = (TileMessage.anInt7658 * 1089948687 + 31 + i_9_ * (-411680299 * Class436.anInt5467));
								if (i_2_ > (i_11_ - class505.anInt6202 * 1110385787 - 1) && i_2_ < (-1883958527 * class505.anInt6197 + i_11_))
									i_8_ = i_9_;
							}
						}
						if (-1 != i_8_) {
							int i_12_ = 0;
							CircularDoubleLinkedListIterator circularDoubleLinkedListIterator = new CircularDoubleLinkedListIterator(Class436.aClass461_5482);
							for (MenuOptionNode menuOptionNode = ((MenuOptionNode) circularDoubleLinkedListIterator.first()); null != menuOptionNode; menuOptionNode = (MenuOptionNode) circularDoubleLinkedListIterator.next()) {
								if (i_12_++ == i_8_)
									return (-1988795597 * (((MenuOption) menuOptionNode.circularDoubleLinkedList.DELIMETER.next_cache).cursor));
							}
						}
					} else if (null != Class436.aMenuOptionNode_5472 && i_1_ > 805710735 * StaticMethods.anInt5681 && i_1_ < (StaticMethods.anInt5681 * 805710735 + 2054409059 * MenuOption.anInt5345)) {
						int i_13_ = -1;
						for (int i_14_ = 0; i_14_ < (Class436.aMenuOptionNode_5472.getTotalMenus) * -628325139; i_14_++) {
							if (Class436.aBoolean5496) {
								int i_15_ = (1 + (1110385787 * class505.anInt6202 + (-1370784315 * ClassNotAnim.anInt6119 + 20)) + i_14_ * (Class436.anInt5467 * -411680299));
								if (i_2_ > (i_15_ - 1110385787 * class505.anInt6202 - 1) && i_2_ < (-1883958527 * class505.anInt6197 + i_15_))
									i_13_ = i_14_;
							} else {
								int i_16_ = (-411680299 * Class436.anInt5467 * i_14_ + (31 + -1370784315 * ClassNotAnim.anInt6119));
								if (i_2_ > (i_16_ - class505.anInt6202 * 1110385787 - 1) && i_2_ < (-1883958527 * class505.anInt6197 + i_16_))
									i_13_ = i_14_;
							}
						}
						if (i_13_ != -1) {
							int i_17_ = 0;
							CircularDoubleLinkedListIterator circularDoubleLinkedListIterator = new CircularDoubleLinkedListIterator(Class436.aMenuOptionNode_5472.circularDoubleLinkedList);
							for (MenuOption menuOption = ((MenuOption) circularDoubleLinkedListIterator.first()); null != menuOption; menuOption = ((MenuOption) circularDoubleLinkedListIterator.next())) {
								if (i_17_++ == i_13_)
									return (menuOption.cursor * -1988795597);
							}
						}
					}
				}
			}
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ags.at(").append(')').toString());
		}
	}
}
