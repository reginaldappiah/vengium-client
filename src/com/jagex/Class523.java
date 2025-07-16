package com.jagex;/* Class523 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class523 implements Interface17 {
	public boolean method229(Class365_Sub1_Sub1 class365_sub1_sub1, int i) {
		try {
			return class365_sub1_sub1 instanceof SceneObject;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("posX.a(").append(')').toString());
		}
	}

	public boolean method228(Class365_Sub1_Sub1 class365_sub1_sub1) {
		return class365_sub1_sub1 instanceof SceneObject;
	}

	public boolean method230(Class365_Sub1_Sub1 class365_sub1_sub1) {
		return class365_sub1_sub1 instanceof SceneObject;
	}

	static final void method6329(IComponentDefinition componentDefinition, ScriptRuntime runtime) {
			int i_0_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
			int i_1_ = ((runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]) - 1);
			if (2 != 1548853569 * componentDefinition.modelType)
				throw new RuntimeException("");
			NPCDefinition class503 = NPCDefinitionLoader.npcList.load(componentDefinition.modelID * 572201537);
			if (componentDefinition.aClass498_1307 == null)
				componentDefinition.aClass498_1307 = new Class498(class503, false);
			componentDefinition.aClass498_1307.aLong6110 = StaticMethods.method4686() * 3177550440302969639L;
			if (i_1_ < 0 || i_1_ >= class503.models_2.length)
				throw new RuntimeException("");
			componentDefinition.aClass498_1307.anIntArray6108[i_1_] = i_0_;
			StaticMethods.updateComponentTick(componentDefinition);
	}

	public static final void method6330(IComponentDefinition componentDefinition, int i, int i_2_) {
			if (GameClient.fromIComponentDefinition == null && !GameClient.menuOpen && (componentDefinition !=  null && Class419.method5603(componentDefinition))) {
				GameClient.fromIComponentDefinition = componentDefinition;
				GameClient.aClass105_8712 = IComponentDefinition.method4063(componentDefinition);
				GameClient.anInt8734 = -344812543 * i;
				GameClient.anInt8853 = i_2_ * -1376922141;
				Class82_Sub22.anInt6917 = 0;
				GameClient.aBoolean8863 = false;
			}
	}

	public static void method6332() {
		try {
			if (null != Class300.aClass284_3212)
				Class300.aClass284_3212.method2690();
			if (null != Minimap.aClass284_68)
				Minimap.aClass284_68.method2690();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("posX.i(").append(')').toString());
		}
	}
}
