package com.jagex;/* Class114 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class114 {
	int anInt1374 = -811445531;
	Class100 aClass100_1375;
	Class100 aClass100_1376;
	String aString1377;
	String aString1378;
	public int[] anIntArray1379;
	public int[] anIntArray1380;

    void method1256(Class101 class101, byte i) {
		try {
			int i_0_ = class101.getLength();
			this.aClass100_1375 = Class100.method5799()[i_0_];
			if (this.aClass100_1375 == Class100.aClass100_1076) {
				int i_1_ = class101.getLength();
				this.aClass100_1376 = Class100.method5799()[i_1_];
				this.anInt1374 = class101.getLength() * 811445531;
			}
			this.aString1377 = class101.getString();
			this.aString1378 = class101.getString();
			int i_2_ = class101.getLength();
			anIntArray1379 = new int[i_2_];
			anIntArray1380 = new int[i_2_];
			for (int i_3_ = 0; i_3_ < i_2_; i_3_++) {
				anIntArray1379[i_3_] = class101.getLength();
				anIntArray1380[i_3_] = class101.getLength();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("eq.a(").append(')').toString());
		}
	}

	Class114() {
		/* empty */
	}

	public static void sweep() {
		try {
			synchronized (PlayerAppearance.cache) {
				PlayerAppearance.cache.sweep();
			}
			synchronized (PlayerAppearance.toolkitCache) {
				PlayerAppearance.toolkitCache.sweep();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("eq.z(").append(')').toString());
		}
	}

	static final void method1258(ScriptRuntime runtime) {
		try {
			int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
			IComponentDefinition class105 = IComponentDefinition.getInterfaceComponent(interfaceHash);
			IComponentDefinitionCollection IComponentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[interfaceHash >> 16];
			Class261.method2463(class105, IComponentDefinitionCollection, runtime, (byte) -113);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("eq.lj(").append(')').toString());
		}
	}

}
