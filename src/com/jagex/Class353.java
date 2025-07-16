package com.jagex;/* Class353 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class353 {
    public String aString3819;
    public int anInt3820;

    Class353() {
        /* empty */
    }

    static final void method4249(ScriptRuntime runtime) {
        int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceHash);
        IComponentDefinitionCollection IComponentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[interfaceHash >> 16];
        ToMoveIComponentScripts.method1436(componentDefinition, IComponentDefinitionCollection, runtime);
    }

    static final void method4250(ScriptRuntime class403, byte i) {
        try {
            class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = Class360.anInt3909 * -576042023;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("os.aha(").append(')').toString());
        }
    }

    static void getName(ScriptRuntime runtime) {
        runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393 - 1)] = (Class316.aClass362_3318.getQuestType((runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)])).title);
    }

    static int method4252(int i) {
        int i_2_;
        if (i > 12010) {
            SettingsManager.loadHighSettings();
            i_2_ = 4;
        } else if (i > 5033) {
            SettingsManager.loadMediumSettings();
            i_2_ = 3;
        } else if (i > 2018) {
            SettingsManager.loadLowSettings();
            i_2_ = 2;
        } else {
            SettingsManager.loadMinimumSettings();
            i_2_ = 1;
        }
        if (SettingsManager.settingsManager.toolkitSetting.getValue() != ToolkitOption.SSE) {
            SettingsManager.settingsManager.setValue(SettingsManager.settingsManager.desiredToolkit, ToolkitOption.SSE);
            Class370.loadingPleaseWait(ToolkitOption.SSE, false);
        } else
            SettingsManager.settingsManager.setLive(SettingsManager.settingsManager.toolkitSetting, true);
        ToMoveSettings.encodeBuffer();
        return i_2_;
    }
}
