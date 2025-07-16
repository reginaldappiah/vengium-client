package com.jagex;/* Class104 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.utils.ColorUtils;

public class Class104 {
    int anInt1109;
    byte[] aByteArray1110;
    int anInt1111;
    int anInt1112;
    int anInt1113;
    byte[] aByteArray1114;
    int anInt1115;
    int anInt1116;
    int anInt1117;

    Class104() {
        /* empty */
    }

    static final void method1101(ScriptRuntime runtime) {
        try {
            runtime.integerStackOffset -= -1175642067;
            long l = (long) (runtime.integerStack[681479919 * runtime.integerStackOffset]);
            long l_0_ = (long) (runtime.integerStack[681479919 * runtime.integerStackOffset + 1]);
            long l_1_ = (long) (runtime.integerStack[2 + runtime.integerStackOffset * 681479919]);
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = (int) (l_1_ * l / l_0_);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ef.zk(").append(')').toString());
        }
    }

    static final void method1102(ScriptRuntime runtime) {
            int htmlColorCode = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
            runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393 - 1)] = ColorUtils.htmlToHex(htmlColorCode);
    }

    static final void method1103(Entity entity) {
        try {
            Animator animator = entity.animator;
            if ((GameClient.clientTick * 443738891 == entity.anInt10103 * 1450943713) || !animator.hasAnimationDefinition() || animator.method5836(1, 2027501470)) {
                int i_3_ = (entity.anInt10103 * 1450943713 - entity.anInt10095 * -412225079);
                int i_4_ = (443738891 * GameClient.clientTick - -412225079 * entity.anInt10095);
                int i_5_ = (entity.anInt10098 * -719582720 + entity.getSize() * 256);
                int i_6_ = (1363846656 * entity.anInt10100 + entity.getSize() * 256);
                int i_7_ = (1613909504 * entity.anInt10099 + entity.getSize() * 256);
                int i_8_ = (entity.anInt10101 * 1970654720 + entity.getSize() * 256);
                Vector3f class217 = entity.getWorldTransform().trans;
                entity.method4341((float) ((i_5_ * (i_3_ - i_4_) + i_4_ * i_7_) / i_3_), (float) (int) class217.y, (float) ((i_4_ * i_8_ + (i_3_ - i_4_) * i_6_) / i_3_));
            }
            entity.anInt10124 = 0;
            entity.method4415((entity.anInt10104) * -251594591, false, 943014126);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ef.hp(").append(')').toString());
        }
    }

    static final void updateWindowPane() {
        Class83.updatingWidgetComponents = null;
        Class448.method5912(GameClient.WINDOW_PANE_ID * -257444687, 0, 0, GameShell.canvasWidth * -2110394505, GameShell.canvasHeight * -1111710645, 0, 0, -1);
        if (Class83.updatingWidgetComponents != null ) {
            IComponentDefinition.updateComponentType(Class83.updatingWidgetComponents, -1, 0, 0, GameShell.canvasWidth * -2110394505, -1111710645 * GameShell.canvasHeight, Class216.anInt6660 * -391533651, LinkedList.anInt5518 * -514549911, (IComponentDefinition.componentDefinition == GameClient.aClass105_8712 ? -1 : GameClient.aClass105_8712.anInt1303 * 91937559), true);
            Class83.updatingWidgetComponents = null;
        }
    }

    static final void method1105(ScriptRuntime runtime) {
        int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceHash);
        IComponentDefinitionCollection IComponentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[interfaceHash >> 16];
        Class75.method835(componentDefinition, IComponentDefinitionCollection, runtime);
    }

    static final void method1106(ScriptRuntime runtime) {
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = (runtime.integerLocals[(runtime.integerstack[1883543357 * runtime.integerPos])]);
    }

    public static String method1107(MenuOption menuOption) {
        if (GameClient.menuOpen || null == menuOption)
            return "";
        if (((menuOption.action == null) || menuOption.action.length() == 0) && null != (menuOption.aString9669) && menuOption.aString9669.length() > 0)
            return (menuOption.aString9669);
        return menuOption.action;
    }

    public static void method1108(int i) {
        Class79.anInt734 = -1262101671;
        Class79.JS5_MUSIC = null;
        Class79.anInt745 = 407545223;
        Class79.anInt746 = 956029523;
        Class79.aClass298_Sub19_Sub1_748 = null;
        Class79.anInt739 = 0;
        Class8.aBoolean114 = false;
        Class298_Sub24_Sub1.anInt9276 = 771950311 * i;
        Class313.aClass97_3300 = null;
    }
}
