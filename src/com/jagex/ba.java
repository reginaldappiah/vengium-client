package com.jagex;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* ba - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class ba extends Heap implements Interface25 {
	long nativeid;

	ba(SSEGraphicsToolkit var_SSEGraphicsToolkit, int i) {
		sa(var_SSEGraphicsToolkit, i);
	}

	native void sa(SSEGraphicsToolkit var_SSEGraphicsToolkit, int i);

	protected void finalize() {
		try {
			if (this.nativeid != 0L)
				Class71.method809(this, (short) -1633);
			try {
				Class var_class = java.lang.ClassLoader.class;
				Field field = var_class.getDeclaredField("nativeLibraries");
				Class var_class_124_ = java.lang.reflect.AccessibleObject.class;
				Method method = var_class_124_.getDeclaredMethod("setAccessible", (new Class[] { Boolean.TYPE }));
				method.invoke(field, Boolean.TRUE);
			} catch (Throwable throwable) {
				/* empty */
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ba.finalize(").append(')').toString());
		}
	}

	public native void ma(boolean bool);

	native void ha();

	native void u();

	public native void z(boolean bool);

	native void a(SSEGraphicsToolkit var_SSEGraphicsToolkit, int i);

	native void f();

	native void b();

	native void i();

	native void p();
}
