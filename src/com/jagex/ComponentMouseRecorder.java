package com.jagex;/* Class93 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.utils.StringUtils;

import java.awt.*;

final class ComponentMouseRecorder implements Interface23 {

    public int method252(int i) {
		try {
			IntNode class298_sub35 = (IntNode) Class87.linkedList.get((long) i);
			if (class298_sub35 == null)
				return Class128.playerVarsProvider.method252(i);
			return class298_sub35.capacity * -774922497;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("du.d(").append(')').toString());
		}
	}

    public int method250(int i) {
		try {
			IntNode class298_sub35 = ((IntNode) Class87.linkedList.get(0x100000000L | (long) i));
			if (class298_sub35 == null)
				return Class128.playerVarsProvider.method250(i);
			return -774922497 * class298_sub35.capacity;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("du.u(").append(')').toString());
		}
	}

    static final void method1009(ScriptRuntime class403, int i) {
		try {
			if (null != GameClient.aString8804)
				class403.objectStack[((class403.objectArgs += 969361751) * -203050393) - 1] = StringUtils.method2114(GameClient.aString8804, 864183945);
			else
				class403.objectStack[((class403.objectArgs += 969361751) * -203050393) - 1] = "";
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("du.wy(").append(')').toString());
		}
	}

	public static void method1010(Display display, Frame frame, int i) {
		try {
			display.method5960();
			frame.setVisible(false);
			frame.dispose();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("du.b(").append(')').toString());
		}
	}

	public static void method1011() {
		try {
			Class478.aClass453_6002 = new Class453();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("du.a(").append(')').toString());
		}
	}

	public static void record(MouseRecord class298_sub50) {
		try {
			if (!StaticMethods.method5804(GameClient.gameState * -1233866115))
				class298_sub50.resizeCache();
			else
				StaticMethods.aClass374_Sub1_4125.method4620(class298_sub50);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("du.p(").append(')').toString());
		}
	}

	static final void method1013(int i, int i_2_, long l) {
		try {
			int i_3_ = (int) l >> 14 & 0x1f;
			int i_4_ = (int) l >> 20 & 0x3;
			int i_5_ = (int) (l >>> 32) & 0x7fffffff;
			Class424 class424 = ((Class424) StaticMethods.method5701(Class336_Sub6.method4108(), i_3_));
			Class336 class336;
			if (Class424.aClass424_6611 == class424 || Class424.aClass424_6604 == class424 || Class424.aClass424_6610 == class424) {
				ObjectDefinition class432 = GameClient.myRegion.getObjectDefinitionLoader().get(i_5_);
				int i_6_;
				int i_7_;
				if (0 == i_4_ || i_4_ == 2) {
					i_6_ = -1125834887 * class432.sizeX;
					i_7_ = -565161399 * class432.sizeY;
				} else {
					i_6_ = -565161399 * class432.sizeY;
					i_7_ = class432.sizeX * -1125834887;
				}
				if (i_4_ == 0) {
					/* empty */
				}
				class336 = Class336_Sub5.method4105(i, i_2_, i_6_, i_7_, Class424.aClass424_6614, 0, 1300552038);
			} else if (Class82_Sub9.method900(-1976050083 * class424.type, (byte) 28))
				class336 = Class336_Sub5.method4105(i, i_2_, 0, 0, class424, i_4_, 740164949);
			else
				class336 = Class194.method1867(i, i_2_, 0, 0, class424, i_4_, (byte) -22);
			Class82_Sub21.method938(i, i_2_, true, class336);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("du.jd(").append(')').toString());
		}
	}

	public static boolean method1014() {
		try {
			do {
				boolean bool;
				try {
					if (IcmpService_Sub1.available())
						break;
					bool = false;
				} catch (Throwable throwable) {
					return false;
				}
				return bool;
			} while (false);
			if (null != IcmpService_Sub1.anIcmpService_Sub1_8551)
				throw new IllegalStateException("");
			IcmpService_Sub1.anIcmpService_Sub1_8551 = new IcmpService_Sub1();
			Thread thread = new Thread(new Class393());
			thread.setDaemon(true);
			thread.start();
			return true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("du.k(").append(')').toString());
		}
	}
}
