package com.jagex;/* Class336_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class336_Sub2 extends Class336 {
	Class424 aClass424_7713;
	int anInt7714;

	public boolean method4089(int i, int i_0_, int i_1_, Class289 class289) {
		return class289.method2742(i_0_, i_1_, i, -1331662251 * toX, toY * 1517720743, this.aClass424_7713.getID(), (this.anInt7714 * -472184325), 1632228208);
	}

	public boolean method4090(int i, int i_2_, int i_3_, Class289 class289, int i_4_) {
		try {
			return class289.method2742(i_2_, i_3_, i, -1331662251 * toX, toY * 1517720743, this.aClass424_7713.getID(), (this.anInt7714 * -472184325), 2085306850);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ace.a(").append(')').toString());
		}
	}

	Class336_Sub2() {
		/* empty */
	}

	public boolean method4091(int i, int i_5_, int i_6_, Class289 class289) {
		return class289.method2742(i_5_, i_6_, i, -1331662251 * toX, toY * 1517720743, this.aClass424_7713.getID(), (this.anInt7714 * -472184325), 1073937483);
	}

	static final void method4096(ScriptRuntime class403, int i) {
		try {
			IComponentScripter IComponentScripter = (class403.currentInstrBool ? class403.aIComponentScripter_5247 : class403.aIComponentScripter_5246);
			IComponentDefinition class105 = IComponentScripter.componentDefinition;
			IComponentDefinitionCollection IComponentDefinitionCollection = IComponentScripter.IComponentDefinitionCollection;
			StaticMethods.method1298(class105, IComponentDefinitionCollection);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ace.ii(").append(')').toString());
		}
	}

	static void method4097(ScriptRuntime class403, short i) {
		try {
			class403.integerStack[class403.integerStackOffset * 681479919 - 1] = Class316.aClass362_3318.getQuestType((class403.integerStack[681479919 * class403.integerStackOffset - 1])).method4561(Class128.playerVarsProvider) ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ace.w(").append(')').toString());
		}
	}
}
