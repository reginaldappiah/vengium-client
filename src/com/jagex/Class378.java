package com.jagex;/* Class378 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class378 {
	public static int anInt4093 = 6;
	static Class428 aClass428_4094;

	Class378() throws Throwable {
		throw new Error();
	}

	static final void method4669(ScriptRuntime runtime) {
		try {
			runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393 - 1)] = (runtime.objectLocals[(runtime.integerstack[1883543357 * runtime.integerPos])]);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ps.ap(").append(')').toString());
		}
	}

	public static short[] method4670(short[] is, byte i) {
		try {
			if (null == is)
				return null;
			short[] is_0_ = new short[is.length];
			System.arraycopy(is, 0, is_0_, 0, is.length);
			return is_0_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ps.f(").append(')').toString());
		}
	}

	public static boolean componentExists(int interfaceID, int[] keys) {
		try {
			if (IComponentDefinition.interfaceComponentsExists[interfaceID])
				return true;
			IComponentDefinition.getIComponentDefinitionCollections[interfaceID] = IComponentDefinitionCollection.get(interfaceID, keys, IComponentDefinition.getIComponentDefinitionCollections[interfaceID], false);
			if (null == IComponentDefinition.getIComponentDefinitionCollections[interfaceID])
				return false;
			IComponentDefinition.interfaceComponentsExists[interfaceID] = true;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ps.i(").append(')').toString());
		}
	}
}
