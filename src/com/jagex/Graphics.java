package com.jagex;

import com.jagex.game.cache.config.Js5Configs;
import com.jagex.game.cache.config.prefetch.Js5List;
import com.jagex.network.OutgoingPacket;

import java.awt.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* Graphics - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Graphics {
	public int anInt568;
	public Animator animator;
	public int graphicID = -1313669563;
	public int rotation;
	public int height;
	static SpriteToolkit aClass57_573;

	Graphics(Entity class365_sub1_sub1_sub2) {
		animator = new Animator_Sub2(class365_sub1_sub1_sub2, false);
	}

	static void method50123(int x) {
		try {
			Class var_class = java.lang.ClassLoader.class;
			Field field = var_class.getDeclaredField("nativeLibraries");
			Class var_class_124_ = java.lang.reflect.AccessibleObject.class;
			Method method = var_class_124_.getDeclaredMethod("setAccessible", (new Class[] { Boolean.TYPE }));
			method.invoke(field, Boolean.TRUE);
		} catch (Throwable throwable) {
			/* empty */
		}
	}

	static Class128 method608(Buffer buffer) {
		try {
			Class139 class139 = (Class139.method6176()[buffer.readUByte()]);
			Class133 class133 = (Class133.method1255()[buffer.readUByte()]);
			int i_0_ = buffer.readShort();
			int i_1_ = buffer.readShort();
			int i_2_ = buffer.readUShort();
			int i_3_ = buffer.readUShort();
			int i_4_ = buffer.readShort();
			int i_5_ = buffer.readBigSmart();
			int i_6_ = buffer.readInt();
			return new Class128(class139, class133, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_, i_6_);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("cg.a(").append(')').toString());
		}
	}

	public static final void method609(short i) {
		try {
			Class208.method1936(1548853569);
			for (int i_7_ = 0; i_7_ < Class300.anInt3213 * -991384187; i_7_++) {
				Class297 class297 = Class300.aClass297Array3214[i_7_];
				boolean bool = false;
				if (null == class297.aClass298_Sub19_Sub2_3184) {
					class297.anInt3177 -= -1463623301;
					if (-99363405 * class297.anInt3177 >= (class297.method2835((byte) -38) ? -1500 : -10)) {
						if (class297.aByte3176 == 1 && class297.aClass278_3181 == null) {
							class297.aClass278_3181 = Class278.method2604(Js5List.JS5_SOUND_EFFECTS, (-320389285 * (class297.anInt3175)), 0);
							if (null == class297.aClass278_3181) {
								if (i >= 16385)
									throw new IllegalStateException();
								continue;
							}
							class297.anInt3177 += class297.aClass278_3181.method2602() * -1463623301;
						} else if (class297.method2835((byte) -25) && ((class297.aClass298_Sub23_3186) == null || (null == (class297.aClass298_Sub26_Sub1_3183)))) {
							if (class297.aClass298_Sub23_3186 == null)
								class297.aClass298_Sub23_3186 = (Class298_Sub23.method3066(Js5List.JS5_SOUND_EFFECTS2, (class297.anInt3175 * -320389285)));
							if (class297.aClass298_Sub23_3186 == null) {
								if (i >= 16385)
									throw new IllegalStateException();
								continue;
							}
							if (class297.aClass298_Sub26_Sub1_3183 == null) {
								class297.aClass298_Sub26_Sub1_3183 = class297.aClass298_Sub23_3186.method3067(new int[] { 22050 });
								if ((class297.aClass298_Sub26_Sub1_3183) == null) {
									if (i >= 16385) {
										/* empty */
									}
									continue;
								}
							}
						}
						if (-99363405 * class297.anInt3177 < 0) {
							int i_8_ = 8192;
							int i_9_;
							if (0 != (class297.anInt3178 * 758600991)) {
								int i_10_ = ((class297.anInt3178 * 758600991) >> 24 & 0x3);
								if (i_10_ == (Player.myPlayer.plane)) {
									int i_11_ = (((class297.anInt3178 * 758600991) & 0xff) << 9);
									int i_12_ = Player.myPlayer.getSize() << 8;
									Vector3f class217 = Player.myPlayer.getWorldTransform().trans;
									int i_13_ = ((class297.anInt3178 * 758600991) >> 16 & 0xff);
									int i_14_ = (i_12_ + (256 + (i_13_ << 9) - (int) class217.x));
									int i_15_ = (758600991 * (class297.anInt3178) >> 8 & 0xff);
									int i_16_ = ((i_15_ << 9) + 256 - (int) class217.z + i_12_);
									int i_17_ = (Math.abs(i_14_) + Math.abs(i_16_) - 512);
									if (i_17_ > i_11_) {
										class297.anInt3177 = 1265930907;
										continue;
									}
									if (i_17_ < 0)
										i_17_ = 0;
									i_9_ = ((i_11_ - i_17_) * SettingsManager.settingsManager.areaSoundsVolume.getValue() * (class297.anInt3182 * -1716484165) / i_11_) >> 2;
									if (-1 != (class297.anInt3185 * -1271617995)) {
										i_13_ = (class297.anInt3185 * -1271617995);
										i_15_ = (class297.anInt3173 * -1577764425);
									}
									if (i_14_ != 0 || i_16_ != 0) {
										int i_18_ = ((-(-1847894591 * GameClient.camRotY) - (int) ((Math.atan2((double) i_14_, (double) i_16_)) * 2607.5945876176133) - 4096) & 0x3fff);
										if (i_18_ > 8192)
											i_18_ = 16384 - i_18_;
										int i_19_;
										if (i_17_ <= 0)
											i_19_ = 8192;
										else if (i_17_ >= 4096)
											i_19_ = 16384;
										else
											i_19_ = 8192 + (8192 - i_17_) / 4096;
										i_8_ = (i_18_ * i_19_ / 8192 + (16384 - i_19_ >> 1));
									}
								} else
									i_9_ = 0;
							} else
								i_9_ = ((class297.anInt3182 * -1716484165 * (3 == class297.aByte3176 ? SettingsManager.settingsManager.voiceOverVolume.getValue() : SettingsManager.settingsManager.soundEffectsVolume.getValue())) >> 2);
							if (i_9_ > 0) {
								Class298_Sub26_Sub1 class298_sub26_sub1 = null;
								if (1 == class297.aByte3176)
									class298_sub26_sub1 = (class297.aClass278_3181.method2601().method3104(Class282.aClass270_6546));
								else if (class297.method2835((byte) -17))
									class298_sub26_sub1 = (class297.aClass298_Sub26_Sub1_3183);
								Class298_Sub19_Sub2 class298_sub19_sub2 = (class297.aClass298_Sub19_Sub2_3184 = (Class298_Sub19_Sub2.method3027(class298_sub26_sub1, (class297.anInt3180 * -447448059), i_9_, i_8_)));
								class298_sub19_sub2.method2991(((class297.anInt3171) * -581110023) - 1);
								Class285.aClass298_Sub19_Sub4_3083.method3043(class298_sub19_sub2);
							}
						}
					} else
						bool = true;
				} else if (!class297.aClass298_Sub19_Sub2_3184.isNextAvailable())
					bool = true;
				if (bool) {
					Class300.anInt3213 -= -598588595;
					for (int i_20_ = i_7_; i_20_ < -991384187 * Class300.anInt3213; i_20_++)
						Class300.aClass297Array3214[i_20_] = Class300.aClass297Array3214[i_20_ + 1];
					i_7_--;
				}
			}
			if (Class300.aBoolean3208 && !EffectiveVertex.method781()) {
				if (SettingsManager.settingsManager.musicVolume.getValue() != 0 && Class300.anInt3207 * -1256171511 != -1) {
					if (null != Class298_Sub2.aClass298_Sub19_Sub1_7167)
						Class21.method364(Js5List.JS5_MUSIC, -1256171511 * Class300.anInt3207, 0, SettingsManager.settingsManager.musicVolume.getValue(), false, (Class298_Sub2.aClass298_Sub19_Sub1_7167));
					else
						ItemDefinitionLoader.method6096(Js5List.JS5_MUSIC, Class300.anInt3207 * -1256171511, 0, SettingsManager.settingsManager.musicVolume.getValue(), false);
				}
				Class300.aBoolean3208 = false;
				Class298_Sub2.aClass298_Sub19_Sub1_7167 = null;
			} else if (SettingsManager.settingsManager.musicVolume.getValue() != 0 && -1 != -1256171511 * Class300.anInt3207 && !EffectiveVertex.method781()) {
				OutgoingPacketBuffer outgoingPacketBuffer = Class18.method359(OutgoingPacket.aClass198_2032, ConnectionType.gameConnection.encryptor);
				outgoingPacketBuffer.payload.writeInt(-1256171511 * Class300.anInt3207);
				ConnectionType.gameConnection.sendFrame(outgoingPacketBuffer);
				Class300.anInt3207 = 184109511;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("cg.posX(").append(')').toString());
		}
	}

	static void method610(int i) {
		try {
			if (GameClient.cutsceneID * 577335585 < 0) {
				RSFontMetrics fontMetrics = RSFontMetrics.getDefaultFont();
				if (!GameClient.menuOpen)
					Class436.aBoolean5471 = ((Class436.anInt5499 * -1914913203 != -1 && (Class436.menuOptionCount * -278777595 >= -1914913203 * Class436.anInt5499)) || (((Class436.aBoolean5496 ? 26 : 22) + (-278777595 * Class436.menuOptionCount * (Class436.anInt5467 * -411680299))) > -1111710645 * GameShell.canvasHeight));
				Class436.aClass453_5511.clean();
				Class436.aClass453_5505.clean();
				for (MenuOption menuOption = ((MenuOption) Class436.aClass453_5480.method5939()); menuOption != null; menuOption = ((MenuOption) Class436.aClass453_5480.method5944())) {
					int i_21_ = 946432351 * menuOption.componentID;
					if (i_21_ < 1000) {
						menuOption.unlink();
						if (59 == i_21_ || i_21_ == 2 || 8 == i_21_ || i_21_ == 17 || i_21_ == 15 || 16 == i_21_ || i_21_ == 58)
							Class436.aClass453_5505.pushBack(menuOption);
						else
							Class436.aClass453_5511.pushBack(menuOption);
					}
				}
				Class436.aClass453_5511.method5938(Class436.aClass453_5480);
				Class436.aClass453_5505.method5938(Class436.aClass453_5480);
				if (Class436.menuOptionCount * -278777595 > 1) {
					if (StaticMethods.method1275() && -278777595 * Class436.menuOptionCount > 2)
						Class298_Sub45.aMenuOption_7522 = ((MenuOption) (Class436.aClass453_5480.aClass298_5643.next.next));
					else
						Class298_Sub45.aMenuOption_7522 = (MenuOption) (Class436.aClass453_5480.aClass298_5643.next);
					Class436.aMenuOption_5477 = (MenuOption) (Class436.aClass453_5480.aClass298_5643.next);
					if (-278777595 * Class436.menuOptionCount > 2)
						StaticMethods.aMenuOption_3322 = ((MenuOption) (Class436.aMenuOption_5477.next));
					else
						StaticMethods.aMenuOption_3322 = null;
				} else {
					Class298_Sub45.aMenuOption_7522 = null;
					Class436.aMenuOption_5477 = null;
					StaticMethods.aMenuOption_3322 = null;
				}
				MouseRecord class298_sub50 = ((MouseRecord) GameClient.mouseRecords.method5939());
				int i_22_;
				int i_23_;
				if (null != class298_sub50) {
					i_22_ = class298_sub50.getMouseX();
					i_23_ = class298_sub50.getMouseY();
				} else {
					i_22_ = AwtMouse.mouse.getLastX();
					i_23_ = AwtMouse.mouse.getLastY();
				}
				if (GameClient.menuOpen) {
					if (Class170.method1814((StaticMethods.aClass381_1563.anRecorder_4112), class298_sub50)) {
						if (null != Class436.aMenuOptionNode_5472 && i_22_ >= StaticMethods.anInt5681 * 805710735 && i_22_ <= (805710735 * StaticMethods.anInt5681 + 2054409059 * MenuOption.anInt5345) && i_23_ >= ClassNotAnim.anInt6119 * -1370784315 && i_23_ <= (ClassNotAnim.anInt6119 * -1370784315 + SpotTypeLoader.anInt4166 * -1855216229)) {
							int i_24_ = -1;
							for (int i_25_ = 0; (i_25_ < (-628325139 * (Class436.aMenuOptionNode_5472.getTotalMenus))); i_25_++) {
								if (Class436.aBoolean5496) {
									int i_26_ = (fontMetrics.anInt6202 * 1110385787 + (-1370784315 * ClassNotAnim.anInt6119 + 20) + 1 + i_25_ * (Class436.anInt5467 * -411680299));
									if (i_23_ > i_26_ - (fontMetrics.anInt6202 * 1110385787) - 1 && (i_23_ < (-1883958527 * fontMetrics.anInt6197 + i_26_)))
										i_24_ = i_25_;
								} else {
									int i_27_ = (-1370784315 * ClassNotAnim.anInt6119 + 31 + (-411680299 * Class436.anInt5467 * i_25_));
									if (i_23_ > i_27_ - 13 && i_23_ < i_27_ + 3)
										i_24_ = i_25_;
								}
							}
							if (-1 != i_24_) {
								int i_28_ = 0;
								CircularDoubleLinkedListIterator circularDoubleLinkedListIterator = (new CircularDoubleLinkedListIterator(Class436.aMenuOptionNode_5472.circularDoubleLinkedList));
								for (MenuOption menuOption = ((MenuOption) circularDoubleLinkedListIterator.first()); menuOption != null; menuOption = ((MenuOption) circularDoubleLinkedListIterator.next())) {
									if (i_24_ == i_28_) {
										Class401.sendInterfaceOptionPacket(menuOption, i_22_, i_23_);
										break;
									}
									i_28_++;
								}
							}
							Class194.closeMenus();
						} else if (i_22_ >= Class88.anInt806 * -1347746885 && (i_22_ <= (608683427 * Class134.anInt6343 + Class88.anInt806 * -1347746885)) && (i_23_ >= TileMessage.anInt7658 * 1089948687) && i_23_ <= (Class448.anInt5619 * 1396607435 + (TileMessage.anInt7658 * 1089948687))) {
							if (!Class436.aBoolean5471) {
								int i_29_ = -1;
								for (int i_30_ = 0; i_30_ < -278777595 * Class436.menuOptionCount; i_30_++) {
									if (Class436.aBoolean5496) {
										int i_31_ = ((Class436.anInt5467 * -411680299 * ((-278777595 * Class436.menuOptionCount) - 1 - i_30_)) + (1 + ((fontMetrics.anInt6202 * 1110385787) + (20 + ((TileMessage.anInt7658) * 1089948687)))));
										if (i_23_ > i_31_ - (fontMetrics.anInt6202 * 1110385787) - 1 && i_23_ < ((-1883958527 * fontMetrics.anInt6197) + i_31_))
											i_29_ = i_30_;
									} else {
										int i_32_ = ((-411680299 * Class436.anInt5467 * ((Class436.menuOptionCount * -278777595) - 1 - i_30_)) + ((TileMessage.anInt7658 * 1089948687) + 31));
										if (i_23_ > i_32_ - 13 && i_23_ < i_32_ + 3)
											i_29_ = i_30_;
									}
								}
								if (-1 != i_29_) {
									int i_33_ = 0;
									Class446 class446 = new Class446(Class436.aClass453_5480);
									for (MenuOption menuOption = ((MenuOption) class446.getNext(1073452729)); menuOption != null; menuOption = ((MenuOption) class446.next())) {
										if (i_33_ == i_29_) {
											Class401.sendInterfaceOptionPacket(menuOption, i_22_, i_23_);
											break;
										}
										i_33_++;
									}
								}
								Class194.closeMenus();
							} else {
								int i_34_ = -1;
								for (int i_35_ = 0; i_35_ < 1592446965 * Class436.anInt5479; i_35_++) {
									if (Class436.aBoolean5496) {
										int i_36_ = ((Class436.anInt5467 * -411680299 * i_35_) + (1 + (20 + (TileMessage.anInt7658 * 1089948687) + (fontMetrics.anInt6202 * 1110385787))));
										if (i_23_ > (i_36_ - (1110385787 * fontMetrics.anInt6202) - 1) && i_23_ < ((fontMetrics.anInt6197 * -1883958527) + i_36_)) {
											i_34_ = i_35_;
											break;
										}
									} else {
										int i_37_ = ((Class436.anInt5467 * -411680299 * i_35_) + ((1089948687 * TileMessage.anInt7658) + 31));
										if (i_23_ > i_37_ - 13 && i_23_ < i_37_ + 3) {
											i_34_ = i_35_;
											break;
										}
									}
								}
								if (-1 != i_34_) {
									int i_38_ = 0;
									CircularDoubleLinkedListIterator circularDoubleLinkedListIterator = new CircularDoubleLinkedListIterator(Class436.aClass461_5482);
									for (MenuOptionNode menuOptionNode = ((MenuOptionNode) circularDoubleLinkedListIterator.first()); null != menuOptionNode; menuOptionNode = ((MenuOptionNode) circularDoubleLinkedListIterator.next())) {
										if (i_38_ == i_34_) {
											Class401.sendInterfaceOptionPacket(((MenuOption) (menuOptionNode.circularDoubleLinkedList.DELIMETER.next_cache)), i_22_, i_23_);
											Class194.closeMenus();
											break;
										}
										i_38_++;
									}
								}
							}
						}
					} else {
						boolean bool = false;
						if (null != Class436.aMenuOptionNode_5472) {
							if (i_22_ < StaticMethods.anInt5681 * 805710735 - 10 || (i_22_ > 10 + (MenuOption.anInt5345 * 2054409059 + StaticMethods.anInt5681 * 805710735)) || (i_23_ < -1370784315 * ClassNotAnim.anInt6119 - 10) || (i_23_ > 10 + (SpotTypeLoader.anInt4166 * -1855216229 + (ClassNotAnim.anInt6119 * -1370784315))))
								Class170.method1808();
							else
								bool = true;
						}
						if (!bool) {
							if (i_22_ < -1347746885 * Class88.anInt806 - 10 || (i_22_ > 10 + (Class88.anInt806 * -1347746885 + Class134.anInt6343 * 608683427)) || i_23_ < (TileMessage.anInt7658 * 1089948687) - 10 || (i_23_ > (1396607435 * Class448.anInt5619 + 1089948687 * TileMessage.anInt7658 + 10)))
								Class194.closeMenus();
							else if (Class436.aBoolean5471) {
								int i_39_ = -1;
								int i_40_ = -1;
								for (int i_41_ = 0; i_41_ < 1592446965 * Class436.anInt5479; i_41_++) {
									if (Class436.aBoolean5496) {
										int i_42_ = (20 + (TileMessage.anInt7658 * 1089948687) + (1110385787 * fontMetrics.anInt6202) + 1 + (i_41_ * (-411680299 * Class436.anInt5467)));
										if (i_23_ > (i_42_ - (1110385787 * fontMetrics.anInt6202) - 1) && i_23_ < ((fontMetrics.anInt6197 * -1883958527) + i_42_)) {
											i_39_ = i_41_;
											i_40_ = i_42_ - (fontMetrics.anInt6202 * 1110385787) - 1;
											break;
										}
									} else {
										int i_43_ = (31 + (TileMessage.anInt7658 * 1089948687) + (Class436.anInt5467 * -411680299 * i_41_));
										if (i_23_ > i_43_ - 13 && i_23_ < i_43_ + 3) {
											i_39_ = i_41_;
											i_40_ = i_43_ - 13;
											break;
										}
									}
								}
								if (i_39_ != -1) {
									int i_44_ = 0;
									CircularDoubleLinkedListIterator circularDoubleLinkedListIterator = new CircularDoubleLinkedListIterator(Class436.aClass461_5482);
									for (MenuOptionNode menuOptionNode = ((MenuOptionNode) (circularDoubleLinkedListIterator.first())); null != menuOptionNode; menuOptionNode = ((MenuOptionNode) circularDoubleLinkedListIterator.next())) {
										if (i_39_ == i_44_) {
											if ((menuOptionNode.getTotalMenus) * -628325139 > 1)
												Class298_Sub39.method3504(menuOptionNode, i_40_, 967296483);
											break;
										}
										i_44_++;
									}
								}
							}
						}
					}
				} else {
					boolean bool = Class170.method1814((StaticMethods.aClass381_1563.anRecorder_4113), class298_sub50);
					boolean bool_45_ = Class170.method1814((StaticMethods.aClass381_1563.anRecorder_4109), class298_sub50);
					boolean bool_46_ = Class170.method1814((StaticMethods.aClass381_1563.anRecorder_4111), class298_sub50);
					if ((bool || bool_45_) && ((1 == 2089115297 * GameClient.anInt8830 && -278777595 * Class436.menuOptionCount > 2) || StaticMethods.method694(-1173724343)))
						bool_46_ = true;
					if (bool_46_ && -278777595 * Class436.menuOptionCount > 0) {
						if (null == GameClient.fromIComponentDefinition && GameClient.anInt8864 * -651858367 == 0)
							StaticMethods.method1226(i_22_, i_23_);
						else
							Class436.anInt5476 = -1808822290;
					} else if (bool_45_) {
						if (null != StaticMethods.aMenuOption_3322)
							Class401.sendInterfaceOptionPacket((StaticMethods.aMenuOption_3322), i_22_, i_23_);
					} else if (bool) {
						if (null != Class298_Sub45.aMenuOption_7522) {
							boolean bool_47_ = (GameClient.fromIComponentDefinition != null || GameClient.anInt8864 * -651858367 > 0);
							if (bool_47_) {
								Class436.anInt5476 = 1243072503;
								GameContext.menuOption = (Class298_Sub45.aMenuOption_7522);
							} else
								Class401.sendInterfaceOptionPacket(Class298_Sub45.aMenuOption_7522, i_22_, i_23_);
						} else if (GameClient.interfaceSelected)
							IComponentDefinition.method1587();
					}
					if (GameClient.fromIComponentDefinition == null && GameClient.anInt8864 * -651858367 == 0) {
						Class436.anInt5476 = 0;
						GameContext.menuOption = null;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("cg.d(").append(')').toString());
		}
	}

	public static void checkOnLoodHook(IComponentDefinition[] componentDefinitions) {
			for (int componentID = 0; componentID < componentDefinitions.length; componentID++) {
				IComponentDefinition componentDefinition = componentDefinitions[componentID];
				if (componentDefinition.onLoadHookParameters != null) {
					ScriptNode scriptNode = new ScriptNode();
					scriptNode.aClass105_7525 = componentDefinition;
					scriptNode.parameters = componentDefinition.onLoadHookParameters;
					ToMoveScripts.onLoadHook(scriptNode, 2000000);
				}
			}
	}

	static final void method612(ScriptRuntime class403, byte i) {
		try {
			int i_49_ = (class403.integerstack[1883543357 * class403.integerPos]);
			class403.integerStackOffset -= -783761378;
			int i_50_ = (class403.integerStack[class403.integerStackOffset * 681479919]);
			if (i_50_ < 0 || i_50_ >= class403.arrayLengths[i_49_])
				throw new RuntimeException();
			class403.arrays[i_49_][i_50_] = (class403.integerStack[681479919 * class403.integerStackOffset + 1]);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("cg.ar(").append(')').toString());
		}
	}

	static final void method614(ScriptRuntime runtime) {
		try {
			IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
			IComponentDefinition class105 = IComponentScripter.componentDefinition;
			runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = 457937409 * class105.aspectHeight;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("cg.ow(").append(')').toString());
		}
	}

	static final void method615(ScriptRuntime runtime) {
		try {
			IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
			IComponentDefinition class105 = IComponentScripter.componentDefinition;
			runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = class105.parentID;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("cg.oi(").append(')').toString());
		}
	}

	public static boolean method616(int toolkitID, int i_53_) {
		try {
			return toolkitID == ToolkitOption.PUREJAVA || ToolkitOption.SSE == toolkitID;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("cg.p(").append(')').toString());
		}
	}

	static final void setItemOptionColor(ScriptRuntime runtime) {
		try {
			int itemID = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
			ItemDefinition item = Js5Configs.itemList.getItemDefinitions(itemID);
			int htmlColorCode;
			if (item.hasCustomColor)
				htmlColorCode = item.htmlColorCode * 292187293;
			else if (item.membersOnly)
				htmlColorCode = StaticMethods.aClass381_1563.htmlColorCode * 1295181471;
			else
				htmlColorCode = 363537303 * StaticMethods.aClass381_1563.anInt4117;
			runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = htmlColorCode;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("cg.abc(").append(')').toString());
		}
	}

	static final void method618(ScriptRuntime runtime) {
		try {
			IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
			IComponentDefinition class105 = IComponentScripter.componentDefinition;
			IComponentDefinitionCollection IComponentDefinitionCollection = IComponentScripter.IComponentDefinitionCollection;
			Class465.method6018(class105, IComponentDefinitionCollection, runtime, -735997058);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("cg.lp(").append(')').toString());
		}
	}

	static final void method619(ScriptRuntime class403, int i) {
		try {
			String string = (String) (class403.objectStack[(class403.objectArgs -= 969361751) * -203050393]);
			StaticMethods.method1042(string);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("cg.agu(").append(')').toString());
		}
	}

	public void drawImage(Image img, int i, int j, Object object) {
		return;
		
	}
}
