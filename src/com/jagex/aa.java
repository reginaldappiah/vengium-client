package com.jagex;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* aa - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class aa extends Class_na implements Interface25 {
	long nativeid;

	public native void ma(boolean bool);

	aa(SSEGraphicsToolkit var_SSEGraphicsToolkit) {
		/* empty */
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

	public native void z(boolean bool);
}
