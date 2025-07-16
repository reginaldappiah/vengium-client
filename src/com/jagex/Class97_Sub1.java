package com.jagex;/* Class97_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.utils.CameraUtils;
import com.jagex.utils.TimeUtils;

final class Class97_Sub1 extends Class97 {

    void method1037(int i) {
		try {
			Class300.aClass303_3202 = Class300.aClass303_3215;
			Class300.aClass303_3215 = null;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("yz.a(").append(')').toString());
		}
	}

    public static final void moveCamera(int moveLocalX, int moveLocalY, int moveZ, int speed2, int speed1, boolean bool) {
			Class376.anInt4089 = moveLocalX * 2140348215;
			Class82_Sub4.anInt6832 = -2108764285 * moveLocalY;
			StaticMethods.anInt6938 = moveZ * 1219077157;
			Class129.speed2 = -346020243 * speed2;
			Class21.speed = speed1 * 1510337323;
			if (bool && Class21.speed * 1534163843 >= 100) {
				GameClient.camPosX = -1222509056 * Class376.anInt4089 + -1475884800;
				GameClient.camPosZ = 2009399552 + 1453086208 * Class82_Sub4.anInt6832;
				GameClient.camPosY = (Class356.getAverageHeight(-1740717447 * GameClient.camPosX, GameClient.camPosZ * -299812095, 1855729883 * GameClient.plane, -2087363822) - -1439836243 * StaticMethods.anInt6938) * 1078403147;
			}
			CameraUtils.cameraType = 2090692627;
			Class418.anInt5339 = -1001372047;
			Class100.anInt1081 = 178575833;
	}

	public static void method1044(Node class298, Node class298_5_, int i) {
		try {
			if (null != class298.next)
				class298.unlink();
			class298.next = class298_5_.next;
			class298.previous = class298_5_;
			class298.next.previous = class298;
			class298.previous.next = class298;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("yz.b(").append(')').toString());
		}
	}

	static IComponentUpdateNode method1045(byte i) {
		try {
			IComponentUpdateNode iComponentUpdateNode = ((IComponentUpdateNode) IComponentUpdateNode.doubleLinkedList.first());
			if (iComponentUpdateNode == null) {
				if (i != 12) {
					/* empty */
				}
			} else {
				iComponentUpdateNode.unlink();
				iComponentUpdateNode.unlinkCache();
				return iComponentUpdateNode;
			}
			do {
				iComponentUpdateNode = (IComponentUpdateNode) IComponentUpdateNode.circularDoubleLinkedList.first();
				if (iComponentUpdateNode == null)
					return null;
				if (iComponentUpdateNode.getCount() > TimeUtils.getTime())
					return null;
				iComponentUpdateNode.unlink();
				iComponentUpdateNode.unlinkCache();
			} while (0L == (iComponentUpdateNode.cachedKey * -5533549728640346679L & ~0x7fffffffffffffffL));
			return iComponentUpdateNode;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("yz.b(").append(')').toString());
		}
	}
}
