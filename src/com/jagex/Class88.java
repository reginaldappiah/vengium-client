package com.jagex;/* Class88 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class88 {
    static int anInt806;
    static Class88 aClass88_807;
    static Class88 aClass88_808 = new Class88();
    static Class88 aClass88_809 = new Class88();
    static int anInt810;

    static {
        aClass88_807 = new Class88();
    }

    Class88() {
        /* empty */
    }

    static final void method972(ScriptRuntime runtime) {
        try {
            runtime.integerStackOffset -= -783761378;
            int i_0_ = (runtime.integerStack[runtime.integerStackOffset * 681479919]);
            int i_1_ = (runtime.integerStack[runtime.integerStackOffset * 681479919 + 1]);
            IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
            Class523.method6330(IComponentScripter.componentDefinition, i_0_, i_1_);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("do.sv(").append(')').toString());
        }
    }

    static final void method973(ScriptRuntime runtime) {
        try {
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = (Class12.systemInfo.cpuClockSpeed * 399637415 < 512 || GameClient.aBoolean8646 || GameClient.aBoolean8662) ? 1 : 0;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("do.akp(").append(')').toString());
        }
    }

    static final void method974(ScriptRuntime class403, int i) {
        try {
            int i_2_ = (class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]);
            if (-1 != i_2_)
                Class285.method2710(i_2_);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("do.anl(").append(')').toString());
        }
    }

    static final void method975(ScriptRuntime class403, int i) {
        try {
            IComponentScripter IComponentScripter = (class403.currentInstrBool ? class403.aIComponentScripter_5247 : class403.aIComponentScripter_5246);
            IComponentDefinition class105 = IComponentScripter.componentDefinition;
            IComponentDefinitionCollection IComponentDefinitionCollection = IComponentScripter.IComponentDefinitionCollection;
            ToMoveIComponentScripts.method4862(class105, class403);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("do.cp(").append(')').toString());
        }
    }

    static boolean isLoadingScreen(int gameState) {
        return gameState == 12 || gameState == 11 || 7 == gameState;
    }

    static String method977(IComponentDefinition class105, int i) {
        try {
            if (GameClient.getComponentSettings(class105).method3497() == 0)
                return null;
            if (null == class105.targetVerb || class105.targetVerb.trim().length() == 0) {
                if (GameClient.aBoolean8846)
                    return "Hidden-use";
                return null;
            }
            return class105.targetVerb;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("do.mn(").append(')').toString());
        }
    }

    static final void method978(ScriptRuntime runtime) {
        try {
            Class212.aClass212_2427.method1952();
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("do.afk(").append(')').toString());
        }
    }
}
