package com.jagex;/* Class522 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class522 {
	static Class453 aClass453_6283 = new Class453();
	static FontToolkit aClass264_6284;
	static GraphicsToolkit aClass_ra6285;

	Class522() throws Throwable {
		throw new Error();
	}

	static int method6324(int i) {
		try {
			int i_0_ = ClientLoadingScreenBar.currentLoadingScreen.anInt2548 * -861845079;
			if (i_0_ < Class230.aClass227Array2561.length - 1)
				ClientLoadingScreenBar.currentLoadingScreen = Class230.aClass227Array2561[i_0_ + 1];
			return 100;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("w.k(").append(')').toString());
		}
	}

	public static Class282[] method6325(byte i) {
		try {
			return (new Class282[] { Class282.aClass282_6540, Class282.aClass282_6543, Class282.aClass282_6541, Class282.aClass282_6545 });
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("w.a(").append(')').toString());
		}
	}

	static final void method6326(IComponentDefinition component, IComponentDefinitionCollection IComponentDefinitionCollection, ScriptRuntime runtime) {
		try {
			component.modelType = -590899066;
			component.aClass498_1307 = null;
			component.modelID = (runtime.integerStack[(runtime.integerStackOffset -= -391880689) * 681479919]) * -1825442367;
			if (-1 == -1309843523 * component.slot && !IComponentDefinitionCollection.accessed)
				IComponentUpdateNode.appendModelTypeUpdate(component.interfaceHash);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("w.hw(").append(')').toString());
		}
	}

	static final void method6327(ScriptRuntime class403, int i) {
		try {
			if (GameClient.aBoolean8638)
				Class212.aClass212_2421.method1952();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("w.anx(").append(')').toString());
		}
	}

	public static Class343_Sub1 method6328(byte i) {
		try {
			return StaticMethods.method2105((1606920449 * Class474.activeConnectionInfo.worldID));
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("w.d(").append(')').toString());
		}
	}
}
