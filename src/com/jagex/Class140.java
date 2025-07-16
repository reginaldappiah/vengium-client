package com.jagex;/* Class140 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import com.jagex.utils.ColorUtils;
import com.jagex.utils.StringUtils;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

public class Class140 implements Runnable {
	volatile boolean aBoolean1549;
	Class142[] aClass142Array1550;
	Thread aThread1551;

	Class140() {
		/* empty */
	}

	Class142 method1552(int i, int i_0_) {
		try {
			if (this.aClass142Array1550 == null || i < 0 || i >= this.aClass142Array1550.length)
				return null;
			return this.aClass142Array1550[i];
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("fr.a(").append(')').toString());
		}
	}

	boolean method1553() {
		try {
			if (this.aBoolean1549)
				return true;
			if (null == this.aThread1551) {
				this.aThread1551 = new Thread(this);
				this.aThread1551.start();
			}
			return this.aBoolean1549;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("fr.f(").append(')').toString());
		}
	}

	public void run() {
		try {
			try {
				int i = (Class401.aClass401_6557 == StaticMethods.aClass401_2708 ? 80 : (1606920449 * Class474.aClass471_5976.worldID + 7000));
				BufferedReader bufferedreader = (new BufferedReader(new InputStreamReader(new DataInputStream(new URL(new StringBuilder().append("http://").append(Class474.aClass471_5976.host).append(":").append(i).append("/news.ws?game=").append(-937307905 * (GameClient.game.id)).toString()).openStream()))));
				String string = bufferedreader.readLine();
				ArrayList arraylist = new ArrayList();
				for (/**/; string != null; string = bufferedreader.readLine())
					arraylist.add(string);
				String[] strings = new String[arraylist.size()];
				arraylist.toArray(strings);
				if (0 != strings.length % 3)
					return;
				this.aClass142Array1550 = new Class142[strings.length / 3];
				for (int i_1_ = 0; i_1_ < strings.length; i_1_ += 3)
					this.aClass142Array1550[i_1_ / 3] = new Class142(strings[i_1_], strings[i_1_ + 1], strings[2 + i_1_]);
			} catch (IOException ioexception) {
				/* empty */
			}
			this.aBoolean1549 = true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("fr.run(").append(')').toString());
		}
	}

	public static Class190 method1554(int i) {
		try {
			Class190 class190 = (Class190) Class190.aClass348_1929.get((long) i);
			if (class190 != null)
				return class190;
			byte[] is = Class287.aClass243_3100.getFileFromArchive(1, i);
			class190 = new Class190();
			class190.anInt1930 = i * -1112552131;
			if (null != is)
				class190.method1853(new Buffer(is), 1143811540);
			class190.method1855(-1168443566);
			if (2 == class190.anInt1940 * -1955592777 && Class190.aClass437_1928.get((long) i) == null) {
				Class190.aClass437_1928.connect(new IntNode(Class190.anInt1932 * 1105746915), (long) i);
				Class190.aClass190Array1926[(Class190.anInt1932 += -34356789) * 1105746915 - 1] = class190;
			}
			Class190.aClass348_1929.put(class190, (long) i);
			return class190;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("fr.f(").append(')').toString());
		}
	}

	static void method1555(NPC npc, boolean bool) {
		try {
			if (Class436.menuOptionCount * -278777595 < 410) {
				NPCDefinition npcDefinition = npc.aClass503_10190;
				String name = npc.name;
				if (npcDefinition.morphisms != null) {
					npcDefinition = npcDefinition.morph(Class128.playerVarsProvider);
					if (null == npcDefinition)
						return;
					name = npcDefinition.name;
				}
				if (npcDefinition.isClickable) {
					if (1817570317 * npc.anInt10189 != 0) {
						String string_3_ = (GameClient.game == GameContext.stellardawn ? (Tradution.aClass470_5928.translate(GameLanguage.CURRENT_LANGUAGE)) : (Tradution.LEVEL.translate(GameLanguage.CURRENT_LANGUAGE)));
						name = new StringBuilder().append(name).append(Class18.method358(1817570317 * (npc.anInt10189), (Player.myPlayer.combat) * 696798311)).append(Class26.leftParenthesis).append(string_3_).append(1817570317 * npc.anInt10189).append(Class26.rightParenthesis).toString();
					}
					if (GameClient.interfaceSelected && !bool) {
						Class497 class497 = (831522399 * IdentityKitDefinition.anInt1508 != -1 ? (Class92.aClass504_905.get(831522399 * IdentityKitDefinition.anInt1508)) : null);
						if ((StaticMethods.anInt3192 * -112110875 & 0x2) != 0 && (null == class497 || (npcDefinition.method6239((IdentityKitDefinition.anInt1508 * 831522399), (-388931549 * class497.size), (byte) 47) != class497.size * -388931549)))
							MenuOption.add(GameClient.selectedInterfaceOption, new StringBuilder().append(GameClient.aString8754).append(" ").append(Class26.lambdaExpression).append(" ").append(ColorUtils.htmlToHex(16776960)).append(name).toString(), 697885143 * Class240.targetOverCursors, 8, -1, (long) (1888274983 * (npc.entityIndex)), 0, 0, true, false, (long) (1888274983 * (npc.entityIndex)), false);
					}
					if (!bool) {
						String[] options = npcDefinition.rightClickOptions;
						if (GameClient.rightClickedNPC)
							options = StaticMethods.getRightClickStrings(options);
						if (options != null) {
							for (int optionIndex = options.length - 1; optionIndex >= 0; optionIndex--) {
								if (options[optionIndex] != null && (npcDefinition.aByte6158 == 0|| (!(options[optionIndex].equalsIgnoreCase(Tradution.ATTACK.translate(GameLanguage.CURRENT_LANGUAGE))) && !(options[optionIndex].equalsIgnoreCase(Tradution.EXAMINE.translate(GameLanguage.CURRENT_LANGUAGE)))))) {
									int type = 0;
									int cursor = 1395924385 * GameClient.cursor;
									if (optionIndex == 0)
										type = 9;
									if (optionIndex == 1)
										type = 10;
									if (optionIndex == 2)
										type = 11;
									if (optionIndex == 3)
										type = 12;
									if (optionIndex == 4)
										type = 13;
									if (optionIndex == 5)
										type = 1003;
									if (npcDefinition.anInt6145 * 1095931419 == optionIndex)
										cursor = npcDefinition.anInt6128 * 846965703;
									if (npcDefinition.anInt6146 * -598113659 == optionIndex)
										cursor = npcDefinition.anInt6144 * -899602593;
									MenuOption.add(options[optionIndex], new StringBuilder().append(ColorUtils.htmlToHex(16776960)).append(name).toString(), ((options[optionIndex].equalsIgnoreCase(Tradution.ATTACK.translate(GameLanguage.CURRENT_LANGUAGE))) ? npcDefinition.attackCursor * 1183282735 : cursor), type, -1, (long) ((npc.entityIndex) * 1888274983), 0, 0, true, false, (long) ((npc.entityIndex) * 1888274983), false);
								}
							}
							if (npcDefinition.aByte6158 == 1) {
								for (int optionID = 0; optionID < options.length; optionID++) {
									if (options[optionID] != null && ((options[optionID].equalsIgnoreCase(Tradution.ATTACK.translate(GameLanguage.CURRENT_LANGUAGE))) || (options[optionID].equalsIgnoreCase(Tradution.EXAMINE.translate(GameLanguage.CURRENT_LANGUAGE))))) {
										short i_8_ = 0;
										if ((1817570317 * (npc.anInt10189)) > (Player.myPlayer.combat) * 696798311)
											i_8_ = (short) 2000;
										short i_9_ = 0;
										int i_10_ = 1395924385 * GameClient.cursor;
										if (0 == optionID)
											i_9_ = (short) 9;
										if (1 == optionID)
											i_9_ = (short) 10;
										if (2 == optionID)
											i_9_ = (short) 11;
										if (3 == optionID)
											i_9_ = (short) 12;
										if (optionID == 4)
											i_9_ = (short) 13;
										if (5 == optionID)
											i_9_ = (short) 1003;
										if (0 != i_9_)
											i_9_ += i_8_;
										if (optionID == npcDefinition.anInt6145 * 1095931419)
											i_10_ = (npcDefinition.anInt6128 * 846965703);
										if (-598113659 * npcDefinition.anInt6146 == optionID)
											i_10_ = (-899602593 * npcDefinition.anInt6144);
										MenuOption.add(options[optionID], new StringBuilder().append(ColorUtils.htmlToHex(16776960)).append(name).toString(), ((options[optionID].equalsIgnoreCase(Tradution.ATTACK.translate(GameLanguage.CURRENT_LANGUAGE))) ? npcDefinition.attackCursor * 1183282735 : i_10_), i_9_, -1, (long) ((npc.entityIndex) * 1888274983), 0, 0, true, false, (long) (1888274983 * (npc.entityIndex)), false);
									}
								}
							}
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("fr.bw(").append(')').toString());
		}
	}

	static final void method1556(ScriptRuntime class403, int i) {
		try {
			int i_11_ = (class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]);
			if (i_11_ < 0 || i_11_ > 1)
				i_11_ = 0;
			Class365_Sub1_Sub5_Sub1.method4525(i_11_ == 1);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("fr.ail(").append(')').toString());
		}
	}

	public static byte[] method1557(String string, byte i) {
		try {
			int i_12_ = string.length();
			if (0 == i_12_)
				return new byte[0];
			int i_13_ = 3 + i_12_ & ~0x3;
			int i_14_ = i_13_ / 4 * 3;
			if (i_13_ - 2 >= i_12_ || (StringUtils.method1773(string.charAt(i_13_ - 2)) == -1))
				i_14_ -= 2;
			else if (i_13_ - 1 >= i_12_ || StringUtils.method1773(string.charAt(i_13_ - 1)) == -1)
				i_14_--;
			byte[] is = new byte[i_14_];
			StaticMethods.method2121(string, is, 0);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("fr.b(").append(')').toString());
		}
	}

	static final boolean method1559(ObjectDefinitionLoader class433, int i, int i_17_, byte i_18_) {
		try {
			ObjectDefinition class432 = class433.get(i);
			if (11 == i_17_)
				i_17_ = 10;
			if (i_17_ >= 5 && i_17_ <= 8)
				i_17_ = 4;
			return class432.method5771(i_17_);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("fr.ct(").append(')').toString());
		}
	}
}
