package com.jagex;/* Class298_Sub39 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub39 extends Node {
	int anInt7418;
	int anInt7419;

	Class298_Sub39(int i, int i_0_) {
		this.anInt7418 = 1518695855 * i;
		this.anInt7419 = -1654604829 * i_0_;
	}

	static void method3504(MenuOptionNode menuOptionNode, int i, int i_1_) {
		try {
			if (GameClient.menuOpen) {
				RSFontMetrics class505 = RSFontMetrics.getDefaultFont();
				int i_2_ = 0;
				for (MenuOption menuOption = ((MenuOption) menuOptionNode.circularDoubleLinkedList.first()); menuOption != null; menuOption = ((MenuOption) menuOptionNode.circularDoubleLinkedList.next())) {
					int i_3_ = Class127_Sub1.method1425(menuOption, class505, 692106883);
					if (i_3_ > i_2_)
						i_2_ = i_3_;
				}
				i_2_ += 8;
				int i_4_ = (21 + (menuOptionNode.getTotalMenus * -628325139 * (-411680299 * Class436.anInt5467)));
				SpotTypeLoader.anInt4166 = ((Class436.aBoolean5496 ? 26 : 22) + (-411680299 * Class436.anInt5467 * ((menuOptionNode.getTotalMenus) * -628325139))) * 1396848787;
				int i_5_ = (Class134.anInt6343 * 608683427 + -1347746885 * Class88.anInt806);
				if (i_5_ + i_2_ > -2110394505 * GameShell.canvasWidth)
					i_5_ = -1347746885 * Class88.anInt806 - i_2_;
				if (i_5_ < 0)
					i_5_ = 0;
				int i_6_ = (Class436.aBoolean5496 ? 20 + class505.anInt6202 * 1110385787 + 1 : 31);
				int i_7_ = 1 + (1110385787 * class505.anInt6202 + (i - i_6_));
				if (i_7_ + i_4_ > -1111710645 * GameShell.canvasHeight)
					i_7_ = GameShell.canvasHeight * -1111710645 - i_4_;
				if (i_7_ < 0)
					i_7_ = 0;
				StaticMethods.anInt5681 = 1353749359 * i_5_;
				ClassNotAnim.anInt6119 = i_7_ * -1998653171;
				MenuOption.anInt5345 = -847507893 * i_2_;
				Class436.aMenuOptionNode_5472 = menuOptionNode;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("abx.q(").append(')').toString());
		}
	}

	static void method3505(GraphicsToolkit class_ra, Class298_Sub52 class298_sub52, Class352 class352, int i, int i_8_, int i_9_, int i_10_, Class4 class4, int i_11_) {
		try {
			int i_12_ = i_8_ - i_10_ / 2 - 5;
			int i_13_ = i_9_ + 2;
			if (594838161 * class352.anInt3787 != 0)
				class_ra.fillRectangle(i_12_, i_13_, i_10_ + 10, i_9_ + i * class4.method309() - i_13_ + 1, 594838161 * class352.anInt3787);
			if (0 != class352.anInt3802 * -828737913)
				class_ra.drawRectangle(i_12_, i_13_, i_10_ + 10, i_9_ + i * class4.method309() - i_13_ + 1, class352.anInt3802 * -828737913);
			int i_14_ = -1836991893 * class352.anInt3781;
			if (class298_sub52.focused && 1364087215 * class352.anInt3782 != -1)
				i_14_ = 1364087215 * class352.anInt3782;
			for (int i_15_ = 0; i_15_ < i; i_15_++) {
				String string = Class301_Sub1.aStringArray7638[i_15_];
				if (i_15_ < i - 1)
					string = string.substring(0, string.length() - 4);
				class4.method308(class_ra, string, i_8_, i_9_, i_14_, true);
				i_9_ += class4.method309();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("abx.bj(").append(')').toString());
		}
	}

	static final void method3506() {
			int i_16_ = 256 + -712176128 * Class376.anInt4089;
			int i_17_ = 256 + Class82_Sub4.anInt6832 * 1953388032;
			int i_18_ = (Class356.getAverageHeight(i_16_, i_17_, 1855729883 * GameClient.plane, -1586416356) - -1439836243 * StaticMethods.anInt6938);
			if (1534163843 * Class21.speed >= 100) {
				GameClient.camPosX = -1475884800 + Class376.anInt4089 * -1222509056;
				GameClient.camPosZ = 2009399552 + Class82_Sub4.anInt6832 * 1453086208;
				GameClient.camPosY = (Class356.getAverageHeight(-1740717447 * GameClient.camPosX, -299812095 * GameClient.camPosZ, 1855729883 * GameClient.plane, -1881231282) - -1439836243 * StaticMethods.anInt6938) * 1078403147;
			} else {
				if (GameClient.camPosX * -1740717447 < i_16_) {
					GameClient.camPosX += ((1534163843 * Class21.speed * (i_16_ - -1740717447 * GameClient.camPosX) / 1000) + -170273947 * Class129.speed2) * 547882953;
					if (-1740717447 * GameClient.camPosX > i_16_)
						GameClient.camPosX = i_16_ * 547882953;
				}
				if (-1740717447 * GameClient.camPosX > i_16_) {
					GameClient.camPosX -= (547882953 * (Class129.speed2 * -170273947 + ((-1740717447 * GameClient.camPosX - i_16_) * (1534163843 * Class21.speed) / 1000)));
					if (-1740717447 * GameClient.camPosX < i_16_)
						GameClient.camPosX = 547882953 * i_16_;
				}
				if (1449634147 * GameClient.camPosY < i_18_) {
					GameClient.camPosY += (((i_18_ - 1449634147 * GameClient.camPosY) * (Class21.speed * 1534163843) / 1000) + Class129.speed2 * -170273947) * 1078403147;
					if (1449634147 * GameClient.camPosY > i_18_)
						GameClient.camPosY = 1078403147 * i_18_;
				}
				if (GameClient.camPosY * 1449634147 > i_18_) {
					GameClient.camPosY -= ((-170273947 * Class129.speed2 + ((GameClient.camPosY * 1449634147 - i_18_) * (1534163843 * Class21.speed) / 1000)) * 1078403147);
					if (GameClient.camPosY * 1449634147 < i_18_)
						GameClient.camPosY = i_18_ * 1078403147;
				}
				if (-299812095 * GameClient.camPosZ < i_17_) {
					GameClient.camPosZ += (309839105 * (-170273947 * Class129.speed2 + (1534163843 * Class21.speed * (i_17_ - GameClient.camPosZ * -299812095) / 1000)));
					if (GameClient.camPosZ * -299812095 > i_17_)
						GameClient.camPosZ = i_17_ * 309839105;
				}
				if (GameClient.camPosZ * -299812095 > i_17_) {
					GameClient.camPosZ -= (309839105 * (-170273947 * Class129.speed2 + ((GameClient.camPosZ * -299812095 - i_17_) * (Class21.speed * 1534163843) / 1000)));
					if (GameClient.camPosZ * -299812095 < i_17_)
						GameClient.camPosZ = i_17_ * 309839105;
				}
			}
			i_16_ = 256 + StaticMethods.anInt6292 * -589460992;
			i_17_ = 256 + IPAddress.anInt5959 * 1647476224;
			i_18_ = (Class356.getAverageHeight(i_16_, i_17_, 1855729883 * GameClient.plane, -1098953725) - 771695069 * Class18.anInt255);
			int i_19_ = i_16_ - GameClient.camPosX * -1740717447;
			int i_20_ = i_18_ - GameClient.camPosY * 1449634147;
			int i_21_ = i_17_ - -299812095 * GameClient.camPosZ;
			int i_22_ = (int) Math.sqrt((double) (i_21_ * i_21_ + i_19_ * i_19_));
			int cameraPitch = ((int) (Math.atan2((double) i_20_, (double) i_22_) * 2607.5945876176133) & 0x3fff);
			int cameraYaw = ((int) (Math.atan2((double) i_19_, (double) i_21_) * -2607.5945876176133) & 0x3fff);
			if (cameraPitch < 1024)
				cameraPitch = 1024;
			if (cameraPitch > 3072)
				cameraPitch = 3072;
			if (GameClient.camRotX * -104436553 < cameraPitch) {
				GameClient.camRotX += ((((cameraPitch - GameClient.camRotX * -104436553 >> 3) * (1179258959 * Class427.anInt5362) / 1000) + Class128_Sub1.anInt8556 * 298687157) << 3) * -648269561;
				if (GameClient.camRotX * -104436553 > cameraPitch)
					GameClient.camRotX = cameraPitch * -648269561;
			}
			if (-104436553 * GameClient.camRotX > cameraPitch) {
				GameClient.camRotX -= (-648269561 * ((1179258959 * Class427.anInt5362 * (GameClient.camRotX * -104436553 - cameraPitch >> 3) / 1000) + 298687157 * Class128_Sub1.anInt8556 << 3));
				if (-104436553 * GameClient.camRotX < cameraPitch)
					GameClient.camRotX = cameraPitch * -648269561;
			}
			int yaw = cameraYaw - -1847894591 * GameClient.camRotY;
			if (yaw > 8192)
				yaw -= 16384;
			if (yaw < -8192)
				yaw += 16384;
			yaw >>= 3;
			if (yaw > 0) {
				GameClient.camRotY += ((Class427.anInt5362 * 1179258959 * yaw / 1000 + Class128_Sub1.anInt8556 * 298687157) << 3) * -1587695039;
				GameClient.camRotY = -1587695039 * (GameClient.camRotY * -1847894591 & 0x3fff);
			}
			if (yaw < 0) {
				GameClient.camRotY -= -1587695039 * ((Class128_Sub1.anInt8556 * 298687157 + (-yaw * (1179258959 * Class427.anInt5362) / 1000)) << 3);
				GameClient.camRotY = (-1847894591 * GameClient.camRotY & 0x3fff) * -1587695039;
			}
			int i_26_ = cameraYaw - -1847894591 * GameClient.camRotY;
			if (i_26_ > 8192)
				i_26_ -= 16384;
			if (i_26_ < -8192)
				i_26_ += 16384;
			if (i_26_ < 0 && yaw > 0 || i_26_ > 0 && yaw < 0)
				GameClient.camRotY = cameraYaw * -1587695039;
			GameClient.camRotZ = 0;
	}

	static final void method3507(IComponentDefinition componentDefinition, IComponentDefinitionCollection IComponentDefinitionCollection, ScriptRuntime runtime) {
		try {
			String string = (String) (runtime.objectStack[(runtime.objectArgs -= 969361751) * -203050393]);
			if (Class298_Sub6.method2863(string, runtime) != null)
				string = string.substring(0, string.length() - 1);
			componentDefinition.onMouseRepeatHook = Class128_Sub2.method1441(string, runtime);
			componentDefinition.hasScript = true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("abx.lg(").append(')').toString());
		}
	}
}
