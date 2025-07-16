package com.jagex;/* Class180 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import com.jagex.game.cache.config.Js5Configs;
import com.jagex.utils.TimeUtils;

import java.io.File;

public class Class180 implements Interface20 {
	static File aFile6528;

	public String method241(Class367 class367, int[] is, long l) {
		try {
			if (class367 == Class367.aClass367_3987) {
				ClientScriptMap class483 = Class51.aClass475_506.getClientScriptMap(is[0]);
				return class483.getMap((int) l);
			}
			if (class367 == Class367.aClass367_3999 || Class367.aClass367_3997 == class367) {
				ItemDefinition class468 = Js5Configs.itemList.getItemDefinitions((int) l);
				return class468.name;
			}
			if (class367 == Class367.aClass367_3982 || Class367.aClass367_3983 == class367 || class367 == Class367.aClass367_3991)
				return Class51.aClass475_506.getClientScriptMap(is[0]).getMap((int) l);
			return null;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("hn.a(").append(')').toString());
		}
	}

	public String method240(Class367 class367, int[] is, long l) {
		if (class367 == Class367.aClass367_3987) {
			ClientScriptMap class483 = Class51.aClass475_506.getClientScriptMap(is[0]);
			return class483.getMap((int) l);
		}
		if (class367 == Class367.aClass367_3999 || Class367.aClass367_3997 == class367) {
			ItemDefinition class468 = Js5Configs.itemList.getItemDefinitions((int) l);
			return class468.name;
		}
		if (class367 == Class367.aClass367_3982 || Class367.aClass367_3983 == class367 || class367 == Class367.aClass367_3991)
			return Class51.aClass475_506.getClientScriptMap(is[0]).getMap((int) l);
		return null;
	}

	static final void method1836(ScriptRuntime runtime) {
		try {
			runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = GameClient.safeMode ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("hn.akv(").append(')').toString());
		}
	}

	static final void method1837(ScriptRuntime runtime) {
		try {
			runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = AwtMouse.mouse.getLastX();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("hn.un(").append(')').toString());
		}
	}

	static final void method1838(ScriptRuntime runtime) {
		try {
			runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = Class352.method4245(TimeUtils.getTime());
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("hn.akx(").append(')').toString());
		}
	}
}
