package com.jagex;/* Class304 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;
import java.util.Date;
import java.util.Hashtable;

public class Class304 {
	static File aFile3265;
	static boolean aBoolean3266 = false;
	static Hashtable aHashtable3267 = new Hashtable(16);

	Class304() throws Throwable {
		throw new Error();
	}

	static final void method3738(ScriptRuntime class403, int i) {
		try {
			int i_0_ = (class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]);
			IComponentDefinition class105 = IComponentDefinition.getInterfaceComponent(i_0_);
			IComponentDefinitionCollection IComponentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[i_0_ >> 16];
			ToMoveIComponentScripts.method6142(class105, IComponentDefinitionCollection, class403);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("mq.ee(").append(')').toString());
		}
	}

	static final void method3739(ScriptRuntime runtime) {
		try {
			int i_1_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
			IComponentDefinition class105 = IComponentDefinition.getInterfaceComponent(i_1_);
			IComponentDefinitionCollection IComponentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[i_1_ >> 16];
			ToMoveIComponentScripts.method365(class105, IComponentDefinitionCollection, true, 0, runtime);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("mq.hj(").append(')').toString());
		}
	}

	public static int method3740(int i, int i_2_, int i_3_) {
		try {
			int i_4_ = i >>> 31;
			return (i + i_4_) / i_2_ - i_4_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("mq.posX(").append(')').toString());
		}
	}

	public static Class128 method3741(Buffer class298_sub53, int i) {
		try {
			Class128 class128 = Graphics.method608(class298_sub53);
			int i_5_ = class298_sub53.readInt();
			int i_6_ = class298_sub53.readInt();
			int i_7_ = class298_sub53.readBigSmart();
			return new Class128_Sub1(class128.aClass139_6322, class128.aClass133_6323, class128.anInt6327 * -39975161, class128.anInt6325 * 1886882435, class128.anInt6326 * -944287579, class128.anInt6330 * -1387457793, -684094775 * class128.anInt6328, 955568089 * class128.anInt6329, class128.anInt6324 * 782326281, i_5_, i_6_, i_7_);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("mq.i(").append(')').toString());
		}
	}

	static String method3742(long l) {
		try {
			return Class92.method1003(new Date(l), "EEE dd-MMM-yyyy HH:mm:ss zzz", -1799547908);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("mq.no(").append(')').toString());
		}
	}
}
