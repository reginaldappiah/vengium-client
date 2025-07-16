package com.jagex;/* Class170 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class170 {
	int anInt1737;
	Object anObject1738;

	Class170(Object object, int i) {
		this.anObject1738 = object;
		this.anInt1737 = i * 533229453;
	}

	static void method1808() {
		try {
			if (Class436.aMenuOptionNode_5472 != null) {
				Class436.aMenuOptionNode_5472 = null;
				StaticMethods.method2112(805710735 * StaticMethods.anInt5681, ClassNotAnim.anInt6119 * -1370784315, MenuOption.anInt5345 * 2054409059, SpotTypeLoader.anInt4166 * -1855216229);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ha.z(").append(')').toString());
		}
	}

	static final void method1809(ScriptRuntime class403, int i) {
		try {
			IComponentScripter IComponentScripter = (class403.currentInstrBool ? class403.aIComponentScripter_5247 : class403.aIComponentScripter_5246);
			IComponentDefinition class105 = IComponentScripter.componentDefinition;
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = class105.graphicID * 1411971043;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ha.pb(").append(')').toString());
		}
	}

	static final void method1810(ScriptRuntime runtime) {
		try {
			runtime.integerStackOffset -= -783761378;
			int i_0_ = (runtime.integerStack[runtime.integerStackOffset * 681479919]);
			int i_1_ = (runtime.integerStack[1 + runtime.integerStackOffset * 681479919]);
			runtime.aClass177_5243.anIntArray1789[i_0_] = i_1_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ha.adx(").append(')').toString());
		}
	}

	public static void method1811(int i, Js5FileSystem class243, int i_2_, int i_3_, int i_4_, boolean bool, Class97 class97, byte i_5_) {
		try {
			if (i > 0) {
				Class79.anInt734 = -1262101671;
				Class79.JS5_MUSIC = class243;
				Class79.anInt745 = i_2_ * -407545223;
				Class79.anInt746 = i_3_ * -956029523;
				Class79.aClass298_Sub19_Sub1_748 = null;
				Class79.anInt739 = i_4_ * -2102749749;
				Class8.aBoolean114 = bool;
				Class298_Sub24_Sub1.anInt9276 = (Class79.aClass298_Sub19_Sub1_737.method2953() / i * 771950311);
				if (-1503744809 * Class298_Sub24_Sub1.anInt9276 < 1)
					Class298_Sub24_Sub1.anInt9276 = 771950311;
				Class313.aClass97_3300 = class97;
			} else {
				if (class97 != null)
					class97.method1037(1056339184);
				ItemDefinitionLoader.method6096(class243, i_2_, i_3_, i_4_, bool);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ha.n(").append(')').toString());
		}
	}

	static final void method1812(IComponentDefinition[] componentDefinitions, int i) {
		try {
			for (int componentID = 0; componentID < componentDefinitions.length; componentID++) {
				IComponentDefinition componentDefinition = componentDefinitions[componentID];
				if (null == componentDefinition) {

				} else {
					if (-1215239439 * componentDefinition.type == IComponentDefinition.CONTAINER) {
						if (null != componentDefinition.containedComponents)
							method1812(componentDefinition.containedComponents, i);
						Widget widget = ((Widget) (GameClient.linkedList.get((long) (componentDefinition.interfaceHash))));
						if (widget != null)
							IComponentDefinition.method903((widget.interfaceID * -1617025021), i);
					}
					if (i == 0 && null != componentDefinition.anObjectArray1275) {
						ScriptNode scriptNode = new ScriptNode();
						scriptNode.aClass105_7525 = componentDefinition;
						scriptNode.parameters = componentDefinition.anObjectArray1275;
						Class444.method5889(scriptNode);
					}
					if (1 == i && componentDefinition.anObjectArray1250 != null) {
						if (componentDefinition.slot * -1309843523 >= 0) {
							IComponentDefinition class105_8_ = IComponentDefinition.getInterfaceComponent((componentDefinition.interfaceHash));
							if (class105_8_ == null || class105_8_.sada == null || (-1309843523 * componentDefinition.slot >= class105_8_.sada.length))
								continue;
							if ((class105_8_.sada[-1309843523 * componentDefinition.slot]) != componentDefinition) {
								continue;
							}
						}
						ScriptNode scriptNode = new ScriptNode();
						scriptNode.aClass105_7525 = componentDefinition;
						scriptNode.parameters = componentDefinition.anObjectArray1250;
						Class444.method5889(scriptNode);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ha.lj(").append(')').toString());
		}
	}

	static final void method1813(ScriptRuntime runtime) {
		try {
			int i_9_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
			if (-1 != i_9_)
				StaticMethods.method1300(i_9_);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ha.anj(").append(')').toString());
		}
	}

	static boolean method1814(Recorder recorder, MouseRecord mouseRecord) {
			return (recorder != null && recorder.record(mouseRecord, GameClient.lastHeldKeys, GameClient.maximumHeldKeys * -1625219821, AwtKeyboard.keyboard));
	}

	static final void method1815(ScriptRuntime runtime) {
		try {
			int i_10_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
			runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = StaticMethods.method882(i_10_, false);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ha.ui(").append(')').toString());
		}
	}
}
