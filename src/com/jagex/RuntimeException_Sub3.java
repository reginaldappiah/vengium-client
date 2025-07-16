package com.jagex;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* RuntimeException_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class RuntimeException_Sub3 extends RuntimeException {

	RuntimeException_Sub3() {

	}

	static void method50123() {
		try {
			Class var_class = java.lang.ClassLoader.class;
			Field field = var_class.getDeclaredField("nativeLibraries");
			Class var_class_124_ = java.lang.reflect.AccessibleObject.class;
			Method method = var_class_124_.getDeclaredMethod("setAccessible", (new Class[] { Boolean.TYPE }));
			method.invoke(field, Boolean.TRUE);
		} catch (Throwable throwable) {

		}
	}
}
