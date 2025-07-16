package com.jagex;/* Class406 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;
import java.awt.Graphics;
import java.util.Iterator;

public final class Class406 {
	public static boolean aBoolean5274;

	Class406() throws Throwable {
		throw new Error();
	}

	static final void method4960(ScriptRuntime class403, int i) {
		try {
			class403.integerStackOffset -= -783761378;
			long l = (long) (class403.integerStack[class403.integerStackOffset * 681479919]);
			long l_0_ = (long) (class403.integerStack[class403.integerStackOffset * 681479919 + 1]);
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = (int) (l + l * l_0_ / 100L);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("qw.yx(").append(')').toString());
		}
	}

	static final void method4961(ScriptRuntime class403, int i) {
		try {
			class403.integerStackOffset -= -783761378;
			int i_1_ = (class403.integerStack[681479919 * class403.integerStackOffset]);
			int i_2_ = (class403.integerStack[class403.integerStackOffset * 681479919 + 1]);
			if (null == IComponentDefinition.getIComponentDefinitionCollections[i_1_])
				class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919) - 1] = 0;
			else
				class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919) - 1] = (IComponentDefinition.getIComponentDefinitionCollections[i_1_].componentDefinitions[i_2_].anInt1141) * -914988669;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("qw.ale(").append(')').toString());
		}
	}

	static final void decodeNPCUpdate(boolean largeView, int i) {
		try {
			GameClient.anInt8708 = 0;
			GameClient.anInt8808 = 0;
			GameClient.anInt8707 += 1968119283;
			Class467.method6023(1694864911);
			Class508.method6279(largeView);
			Class481.decodeNPCsMasks((short) -6102);
			boolean bool_3_ = false;
			for (int i_4_ = 0; i_4_ < GameClient.anInt8708 * -1508392173; i_4_++) {
				int i_5_ = GameClient.anIntArray8709[i_4_];
				ObjectNode class298_sub29 = ((ObjectNode) GameClient.entityList.get((long) i_5_));
				NPC class365_sub1_sub1_sub2_sub1 = ((NPC) class298_sub29.nodeObject);
				if (-1402769421 * class365_sub1_sub1_sub2_sub1.anInt10075 != GameClient.anInt8707 * 440189755) {
					if (GameClient.menuOpen && StaticMethods.method6313(i_5_))
						Class194.closeMenus();
					if (class365_sub1_sub1_sub2_sub1.aClass503_10190.method6242())
						StaticMethods.method2330(class365_sub1_sub1_sub2_sub1);
					class365_sub1_sub1_sub2_sub1.method4464(null, 1734282756);
					class298_sub29.unlink();
					bool_3_ = true;
				}
			}
			if (bool_3_) {
				int i_6_ = 1962237353 * GameClient.anInt8772;
				GameClient.anInt8772 = (GameClient.entityList.getSize() * -118843751);
				int i_7_ = 0;
				Iterator iterator = GameClient.entityList.iterator();
				while (iterator.hasNext()) {
					ObjectNode class298_sub29 = (ObjectNode) iterator.next();
					GameClient.aClass298_Sub29Array8816[i_7_++] = class298_sub29;
				}
				for (int i_8_ = GameClient.anInt8772 * 1962237353; i_8_ < i_6_; i_8_++)
					GameClient.aClass298_Sub29Array8816[i_8_] = null;
			}
			if (385051775 * (ConnectionType.gameConnection.bitsBuffer.offset) != ConnectionType.gameConnection.population * -866602563) {
				/*
				 * throw new RuntimeException( new StringBuilder() .append(
				 * 385051775 * (((Class25)
				 * client.aClass25_8711).aClass298_Sub53_Sub2_333.entityIndex))
				 * .append(" ") .append( -866602563 ((Class25)
				 * client.aClass25_8711).population) .toString());
				 */
			}
			for (int i_9_ = 0; i_9_ < -1230451913 * GameClient.entitySize; i_9_++) {
				if (GameClient.entityList.get((long) GameClient.entityKeys[i_9_]) == null) {
					/*
					 * throw new RuntimeException(new
					 * StringBuilder().append(i_9_)
					 * .append(" ").append(client.entitySize * -1230451913)
					 * .toString());
					 */
				}
			}
			if (0 != (GameClient.anInt8772 * 1962237353 - -1230451913 * GameClient.entitySize)) {
				/*
				 * throw new RuntimeException(new StringBuilder().append("")
				 * .append( client.anInt8772 * 1962237353 - (-1230451913 *
				 * client.entitySize)) .toString());
				 */
			}
			for (int i_10_ = 0; i_10_ < GameClient.anInt8772 * 1962237353; i_10_++) {
				if (-1402769421 * ((Entity) (GameClient.aClass298_Sub29Array8816[i_10_].nodeObject)).anInt10075 != 440189755 * GameClient.anInt8707) {
					/*
					 * throw new RuntimeException( new StringBuilder()
					 * .append("") .append( ((Entity)
					 * (client.aClass298_Sub29Array8816
					 * [i_10_].anObject7366)).anInt10064 * 1888274983)
					 * .toString());
					 */
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("qw.jq(").append(')').toString());
		}
	}

	public static final void method4963(int percentage, String text, Color color, Color color_11_, Color color_12_) {
			do {
				try {
					Graphics graphics = DirectXContext.canvas.getGraphics();
					if (Class285.aFont3082 == null)
						Class285.aFont3082 = new Font("Helvetica", 1, 13);
					if (null == color)
						color = new Color(140, 17, 17);
					if (color_11_ == null)
						color_11_ = new Color(140, 17, 17);
					if (color_12_ == null)
						color_12_ = new Color(255, 255, 255);
					try {
						if (Class298_Sub32_Sub22.anImage9468 == null)
							Class298_Sub32_Sub22.anImage9468 = (DirectXContext.canvas.createImage(-2110394505 * GameShell.canvasWidth, (GameShell.canvasHeight * -1111710645)));
						Graphics loadingScreen = Class298_Sub32_Sub22.anImage9468.getGraphics();
						loadingScreen.setColor(Color.black);
						loadingScreen.fillRect(0, 0, -2110394505 * GameShell.canvasWidth, (GameShell.canvasHeight * -1111710645));
						int i_15_ = GameShell.canvasWidth * -2110394505 / 2 - 152;
						int i_16_ = (-1111710645 * GameShell.canvasHeight / 2 - 18);
						loadingScreen.setColor(color_11_);
						loadingScreen.drawRect(i_15_, i_16_, 303, 33);
						loadingScreen.setColor(color);
						loadingScreen.fillRect(i_15_ + 2, i_16_ + 2, percentage * 3, 30);
						loadingScreen.setColor(Color.black);
						loadingScreen.drawRect(i_15_ + 1, i_16_ + 1, 301, 31);
						loadingScreen.fillRect(percentage * 3 + (2 + i_15_), i_16_ + 2, 300 - 3 * percentage, 30);
						loadingScreen.setFont(Class285.aFont3082);
						loadingScreen.setColor(color_12_);
						loadingScreen.drawString(text, i_15_ + (304 - (text.length() * 6)) / 2, 22 + i_16_);
						if (GameShell.aString6485 != null) {
							loadingScreen.setFont(Class285.aFont3082);
							loadingScreen.setColor(color_12_);
							loadingScreen.drawString(GameShell.aString6485, (-2110394505 * GameShell.canvasWidth / 2 - GameShell.aString6485.length() * 6 / 2), (GameShell.canvasHeight * -1111710645 / 2) - 26);
						}
						graphics.drawImage(Class298_Sub32_Sub22.anImage9468, 0, 0, null);
					} catch (Exception exception) {
						graphics.setColor(Color.red);
						graphics.fillRect(0, 0, -2110394505 * GameShell.canvasWidth, (GameShell.canvasHeight * -1111710645));
						int i_17_ = -2110394505 * GameShell.canvasWidth / 2 - 152;
						int i_18_ = (GameShell.canvasHeight * -1111710645 / 2 - 18);
						graphics.setColor(color_11_);
						graphics.drawRect(i_17_, i_18_, 303, 33);
						graphics.setColor(color);
						graphics.fillRect(i_17_ + 2, i_18_ + 2, 3 * percentage, 30);
						graphics.setColor(Color.red);
						graphics.drawRect(i_17_ + 1, 1 + i_18_, 301, 31);
						graphics.fillRect(percentage * 3 + (i_17_ + 2), 2 + i_18_, 300 - percentage * 3, 30);
						graphics.setFont(Class285.aFont3082);
						graphics.setColor(color_12_);
						if (null != GameShell.aString6485) {
							graphics.setFont(Class285.aFont3082);
							graphics.setColor(color_12_);
							graphics.drawString(GameShell.aString6485, ((GameShell.canvasWidth * -2110394505 / 2) - GameShell.aString6485.length() * 6 / 2), (GameShell.canvasHeight * -1111710645 / 2) - 26);
						}
						graphics.drawString(text, i_17_ + ((304 - text.length() * 6) / 2), 22 + i_18_);
						break;
					}
					break;
				} catch (Exception exception) {
					DirectXContext.canvas.repaint();
					break;
				}
			} while (false);

	}
}
