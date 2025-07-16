package com.jagex;/* Class356 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class356 {
    public static int anInt3827 = 48;
    public static int anInt3828 = -3;
    public static int anInt3829 = -4;
    public static int anInt3830 = 3;
    public static int anInt3831 = 1;
    public static int anInt3832 = 7;
    public static int anInt3833 = -2;
    public static int anInt3834 = 6;
    public static int anInt3835 = 2;
    public static int anInt3836 = 35;
    public static int anInt3837 = 15;
    public static int anInt3838 = 21;
    public static int anInt3839 = 45;
    public static int anInt3840 = 29;
    public static int anInt3841 = 23;
    public static int anInt3842 = 42;
    public static int anInt3843 = -5;
    public static int anInt3844 = 9;

    Class356() throws Throwable {
        throw new Error();
    }

    static final void method4266(ScriptRuntime runtime) {
        try {
            int componentID = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
            IComponentDefinition component = IComponentDefinition.getInterfaceComponent(componentID);
            IComponentDefinitionCollection IComponentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[componentID >> 16];
            Class241.method2248(component, runtime);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ow.kf(").append(')').toString());
        }
    }

    static final void method4267(ScriptRuntime class403, int i) {
        try {
            IComponentScripter IComponentScripter = (class403.currentInstrBool ? class403.aIComponentScripter_5247 : class403.aIComponentScripter_5246);
            IComponentDefinition class105 = IComponentScripter.componentDefinition;
            IComponentDefinitionCollection IComponentDefinitionCollection = IComponentScripter.IComponentDefinitionCollection;
            ToMoveIComponentScripts.method2728(class105, IComponentDefinitionCollection, class403);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ow.ey(").append(')').toString());
        }
    }

    public static int method4268() {
        if (588194557 * Js5ArchiveEnum.highest_index == -1) {
            Js5ArchiveEnum[] class111s = Js5ArchiveEnum.listAll((byte) -111);
            for (int i_1_ = 0; i_1_ < class111s.length; i_1_++) {
                Js5ArchiveEnum class111 = class111s[i_1_];
                if (class111.index * -1047699439 > 588194557 * Js5ArchiveEnum.highest_index)
                    Js5ArchiveEnum.highest_index = 510332837 * class111.index;
            }
            Js5ArchiveEnum.highest_index += -1700689323;
        }
        return 588194557 * Js5ArchiveEnum.highest_index;
    }

    static final void method4269(ScriptRuntime class403, int i) {
        try {
            IComponentScripter IComponentScripter = (class403.currentInstrBool ? class403.aIComponentScripter_5247 : class403.aIComponentScripter_5246);
            IComponentDefinition class105 = IComponentScripter.componentDefinition;
            int i_2_ = -1;
            int i_3_ = -1;
            Class117 class117 = class105.method1116(GameClient.activeGraphicsToolkit);
            if (class117 != null) {
                i_2_ = class117.anInt1393 * 1633695381;
                i_3_ = class117.anInt1394 * -60174999;
            }
            class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = i_2_;
            class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = i_3_;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ow.py(").append(')').toString());
        }
    }

    static final void method4270(IComponentDefinition componentDefinition, IComponentDefinitionCollection IComponentDefinitionCollection, ScriptRuntime runtime) {
        String string = (String) (runtime.objectStack[(runtime.objectArgs -= 969361751) * -203050393]);
        int[] is = Class298_Sub6.method2863(string, runtime);
        if (null != is)
            string = string.substring(0, string.length() - 1);
        componentDefinition.onVarpTransmitHook = Class128_Sub2.method1441(string, runtime);
        componentDefinition.varpTransmitList = is;
        componentDefinition.hasScript = true;
    }

    public static final int getAverageHeight(int worldX, int worldZ, int plane, int random) {
        if (GameClient.myRegion.getRegion() == null)
            return 0;
        int x = worldX >> 9;
        int z = worldZ >> 9;
        if (x < 0
                || z < 0 || x > GameClient.myRegion.getMapWidth() - 1
                || z > GameClient.myRegion.getMapLength() - 1)
            return 0;
        int y = plane;
        if (y < 3 && (GameClient.myRegion.method2654().flags[1][x][z] & 0x2) != 0)
            y++;
        return GameClient.myRegion.getRegion().aClass_xaArray3517[y].method6340(worldX, worldZ);
    }

    static final void method4272(ScriptRuntime class403, int i) {
        int i_10_ = (class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]);
        IComponentDefinition class105 = IComponentDefinition.getInterfaceComponent(i_10_);
        class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = class105.yOffset * -1523987341;
    }

    static final void method4273(ScriptRuntime class403, int i) {
        class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = GameClient.aBoolean8643 ? 1 : 0;
    }
}
