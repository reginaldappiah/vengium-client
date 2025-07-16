package com.jagex;/* Class52_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.utils.TimeUtils;

public abstract class FrameBufferContext extends GraphicsContext {
	protected static int anInt6814 = 4;

	public abstract boolean method557();

	public abstract void method558(Interface8_Impl1_Impl2 interface8_impl1_impl2);

	public abstract boolean method559();

	public abstract boolean method560();

	public abstract void method561(int i, Interface8_Impl1_Impl1 interface8_impl1_impl1);

	public abstract void method562(int i, Interface8_Impl1_Impl1 interface8_impl1_impl1);

	FrameBufferContext() {
		/* empty */
	}

	public abstract void method563(int i, Interface8_Impl1_Impl1 interface8_impl1_impl1);

	public abstract void method564(Interface8_Impl1_Impl2 interface8_impl1_impl2);

	public abstract boolean method565();

	public static void method566(byte i) {
		try {
			if (StaticMethods.method4865() != Class292.aClass292_3162) {
				try {
					String string = GameClient.applet.getParameter(AppletParameter.aAppletParameter_2382.id);
					int i_0_ = ((int) (TimeUtils.getTime() / 86400000L) - 11745);
					String string_1_ = new StringBuilder().append("usrdob=").append(i_0_).append("; version=1; path=/; domain=").append(string).toString();
					Class466.method6020(GameClient.applet, new StringBuilder().append("document.cookie=\"").append(string_1_).append("\"").toString(), -1921482054);
				} catch (Throwable throwable) {
					/* empty */
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("we.ni(").append(')').toString());
		}
	}

	public static Class298_Sub52 method567(int i) {
		try {
			if (null == Class301_Sub1.aClass453_3236 || Class301_Sub1.aClass446_7634 == null)
				return null;
			for (Class298_Sub52 class298_sub52 = (Class298_Sub52) Class301_Sub1.aClass446_7634.next(); class298_sub52 != null; class298_sub52 = (Class298_Sub52) Class301_Sub1.aClass446_7634.next()) {
				Class352 class352 = Class301_Sub1.aClass339_3251.method4116(((class298_sub52.anInt7608) * -530122905));
				if (class352 != null && class352.aBoolean3816 && class352.method4237(Class301_Sub1.anInterface23_3223))
					return class298_sub52;
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("we.ch(").append(')').toString());
		}
	}
}
