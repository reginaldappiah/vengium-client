package com.jagex;/* Class372_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class372_Sub3 extends Class372 {
	static boolean aBoolean7730;

	Class372_Sub3() throws Throwable {
		throw new Error();
	}

	static void method4599() {
		try {
			Class8.anInt106 = (-445162670 + (-123784141 * Class82_Sub19_Sub1.aClass505_9111.anInt6202 + (Class82_Sub19_Sub1.aClass505_9111.anInt6197 * -1877198679)));
			Class8.anInt110 = (524676266 + (StaticMethods.aClass505_8369.anInt6202 * 294342359 + 1292125525 * StaticMethods.aClass505_8369.anInt6197));
			Class8.consoleMessages = new String[500];
			for (int i_0_ = 0; i_0_ < Class8.consoleMessages.length; i_0_++)
				Class8.consoleMessages[i_0_] = "";
			StaticMethods.sendConsoleMessage(Tradution.aClass470_5950.translate(GameLanguage.CURRENT_LANGUAGE));
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("adx.b(").append(')').toString());
		}
	}

	static final void method4600(ScriptRuntime class403, int i) {
		try {
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = -560594807 * Class388.iterations;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("adx.amp(").append(')').toString());
		}
	}

	static final void method4601(ScriptRuntime class403, short i) {
		try {
			IComponentScripter IComponentScripter = (class403.currentInstrBool ? class403.aIComponentScripter_5247 : class403.aIComponentScripter_5246);
			IComponentDefinition class105 = IComponentScripter.componentDefinition;
			IComponentDefinitionCollection IComponentDefinitionCollection = IComponentScripter.IComponentDefinitionCollection;
			Class298_Sub45.method3533(class105, IComponentDefinitionCollection, class403);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("adx.dk(").append(')').toString());
		}
	}

	static final void method4602(IComponentDefinition class105, IComponentDefinitionCollection IComponentDefinitionCollection, ScriptRuntime class403, int i) {
		try {
			class105.modelType = -295449533;
			class105.modelID = 1825442367;
			if (-1309843523 * class105.slot == -1 && !IComponentDefinitionCollection.accessed)
				IComponentUpdateNode.appendModelTypeUpdate(class105.interfaceHash);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("adx.hq(").append(')').toString());
		}
	}
}
