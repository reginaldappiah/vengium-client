package com.jagex;/* Class74 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class74 {
    public static int anInt690;
    public static int anInt692;
    public static int anInt693;
    public static int anInt694;
    public static RSFontMetrics aClass505_695;
    public static int anInt696;
    public static int anInt697;
    public static int anInt698;
    public static SpriteToolkit aClass57_700;
    static int containerID;
    static SpriteToolkit[] arrowSprites;

    Class74() throws Throwable {
        throw new Error();
    }

    public static int method823(int i) {
        try {
            return Class288_Sub1.target.method2033(1397176668);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("d.p(").append(')').toString());
        }
    }

    static void method824(byte[] is, int i) {
        try {
            Buffer class298_sub53 = new Buffer(is);
            for (; ; ) {
                int i_0_ = class298_sub53.readUByte();
                if (0 == i_0_) {
                    if (i == -1819630218)
                        throw new IllegalStateException();
                    break;
                }
                if (1 == i_0_) {
                    int[] is_1_ = LightingDetails.direction = new int[6];
                    is_1_[0] = class298_sub53.readUShort();
                    is_1_[1] = class298_sub53.readUShort();
                    is_1_[2] = class298_sub53.readUShort();
                    is_1_[3] = class298_sub53.readUShort();
                    is_1_[4] = class298_sub53.readUShort();
                    is_1_[5] = class298_sub53.readUShort();
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("d.u(").append(')').toString());
        }
    }

    static Class320[] method825(int i) {
        try {
            return (new Class320[]{StaticMethods.aClass320_6548, Class320.aClass320_6547});
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("d.a(").append(')').toString());
        }
    }

    static final void method826(ScriptRuntime class403, int i) {
        try {
            IComponentScripter IComponentScripter = (class403.currentInstrBool ? class403.aIComponentScripter_5247 : class403.aIComponentScripter_5246);
            IComponentDefinition class105 = IComponentScripter.componentDefinition;
            IComponentDefinitionCollection IComponentDefinitionCollection = IComponentScripter.IComponentDefinitionCollection;
            Class301_Sub1.method3712(class105, IComponentDefinitionCollection, class403);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("d.dy(").append(')').toString());
        }
    }

    static final void method827(ScriptRuntime class403, int i) {
        try {
            class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = SettingsManager.settingsManager.modShadows.method5692((byte) 0) ? 1 : 0;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("d.anu(").append(')').toString());
        }
    }

    static final void method828(ScriptRuntime runtime) {
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = SettingsManager.settingsManager.fog.method5632() ? 1 : 0;
    }

    static final void method829(ScriptRuntime class403, int i) {
        try {
            class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = StaticMethods.method1902();
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("d.ajt(").append(')').toString());
        }
    }

    public static void method830(int i, int i_2_, int i_3_, boolean bool) {
        try {
            if (SettingsManager.settingsManager.toolkitSetting.getValue() != ToolkitOption.PUREJAVA) {
                Class301_Sub1.toolkitoption = SettingsManager.settingsManager.toolkitSetting.getValue() * 485258093;
                Class370.loadingPleaseWait(ToolkitOption.PUREJAVA, true);
            } else
                Class423.method5733(false);
            Class301_Sub1.anInt7629 = -1801430445 * i_2_;
            Class301_Sub1.anInt7623 = i_3_ * -1505298155;
            Class301_Sub1.aBoolean7631 = bool;
            Class301_Sub1.method3692(i);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("d.cd(").append(')').toString());
        }
    }

    static void drawWorldMap(int i, int i_5_, int i_6_, int i_7_, int i_8_) {
        try {
            float f = ((float) Class301_Sub1.anInt3240 / (float) Class301_Sub1.anInt3239);
            int i_9_ = i_6_;
            int i_10_ = i_7_;
            if (f < 1.0F)
                i_10_ = (int) (f * (float) i_6_);
            else
                i_9_ = (int) ((float) i_7_ / f);
            i -= (i_6_ - i_9_) / 2;
            i_5_ -= (i_7_ - i_10_) / 2;
            Class82_Sub14.anInt6875 = -2076584633 * (Class301_Sub1.anInt3239 * i / i_9_);
            Class376.anInt4090 = -435591305 * (Class301_Sub1.anInt3240 - Class301_Sub1.anInt3240 * i_5_ / i_10_);
            Class301_Sub1.anInt7632 = 433609607;
            Class301_Sub1.anInt7627 = 789877945;
            Class225.method2103(65536);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("d.cv(").append(')').toString());
        }
    }

    static void method832(int i, int i_11_, IComponentDefinition componentDefinition, Class117 class117, int i_12_, int i_13_) {
        HintIcon[] hintIcons = HintIcon.loadedIcons;
        for (int index = 0; index < hintIcons.length; index++) {
            HintIcon hintIcon = hintIcons[index];
            if (hintIcon != null && 0 != hintIcon.targetType * 958933333 && GameClient.clientTick * 443738891 % 20 < 10) {
                if (1 == 958933333 * hintIcon.targetType) {
                    ObjectNode node = ((ObjectNode) (GameClient.entityList.get((long) (-841622081 * hintIcon.targetIndex))));
                    if (null != node) {
                        NPC npc = ((NPC) node.nodeObject);
                        Vector3f class217 = (npc.getWorldTransform().trans);
                        int i_16_ = (int) class217.x / 128 - i / 128;
                        int i_17_ = ((int) class217.z / 128 - i_11_ / 128);
                        Class397.method4914(componentDefinition, class117, i_12_, i_13_, i_16_, i_17_, -92466201 * hintIcon.arrowType, 360000L);
                    }
                }
                if (hintIcon.targetType * 958933333 == 2) {
                    int i_18_ = hintIcon.coordX * -1338192389 / 128 - i / 128;
                    int i_19_ = (hintIcon.coordY * 1018128075 / 128 - i_11_ / 128);
                    long l = (long) (hintIcon.minimapAppearance * 2140036693 << 7);
                    l *= l;
                    Class397.method4914(componentDefinition, class117, i_12_, i_13_, i_18_, i_19_, (hintIcon.arrowType * -92466201), l);
                }
                if (10 == 958933333 * hintIcon.targetType && -841622081 * hintIcon.targetIndex >= 0 && (hintIcon.targetIndex * -841622081 < (GameClient.entities).length)) {
                    Player player = (GameClient.entities[-841622081 * hintIcon.targetIndex]);
                    if (null != player) {
                        Vector3f class217 = (player.getWorldTransform().trans);
                        int i_20_ = (int) class217.x / 128 - i / 128;
                        int i_21_ = ((int) class217.z / 128 - i_11_ / 128);
                        Class397.method4914(componentDefinition, class117, i_12_, i_13_, i_20_, i_21_, (hintIcon.arrowType * -92466201), 360000L);
                    }
                }
            }
        }
    }
}
