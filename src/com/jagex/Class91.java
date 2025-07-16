package com.jagex;/* Class91 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class91 {
    public static int anInt820 = 1;
    public static int anInt821 = 2;
    public static int anInt822 = 4;
    public static int anInt823 = 16;
    public static int anInt824 = 15;
    public static int anInt825 = 64;
    public static int anInt826 = 1;
    public static int anInt827 = 2;
    public static int anInt828 = 2;
    public static int anInt829 = 7;
    public static int anInt830 = 8;
    public static int anInt831 = 16;
    public static int anInt832 = 32;
    public static int anInt833 = 128;
    public static int anInt834 = 256;
    public static int anInt835 = 512;
    public static int anInt836 = 1024;
    public static int anInt837 = 32;
    public static int anInt838 = 4096;
    public static int anInt839 = 8192;
    public static int anInt840 = 16384;
    public static int anInt841 = 32768;
    public static int anInt843 = 7;
    public static int anInt844 = 262144;
    public static int anInt845 = 524288;
    public static int anInt846 = 3;
    public static int anInt847 = 1;
    public static int anInt848 = 2;
    public static int anInt849 = 4;
    public static int anInt850 = 0;
    public static int anInt851 = 1;
    public static int anInt852 = 2;
    public static int anInt853 = 0;
    public static int anInt854 = 8;
    public static int anInt855 = 3;
    public static int anInt856 = 65536;
    public static int anInt857 = 1;
    public static int anInt858 = 4;
    public static int anInt859 = 1;
    public static int anInt860 = 1;
    public static int anInt861 = 2;
    public static int anInt862 = 2;
    public static int anInt863 = 4;
    public static int anInt864 = 0;
    public static int anInt865 = 1;
    public static int anInt866 = 2;
    public static int anInt867 = 4;
    public static int anInt868 = 0;
    public static int anInt869 = 2;
    public static int anInt870 = 4;
    public static int anInt871 = 1;
    public static int anInt872 = 2;
    public static int anInt873 = 3;
    public static int anInt874 = 2;
    public static int anInt875 = 1;
    public static int anInt876 = 2;
    public static int anInt877 = 3;
    public static float aFloat878 = 1.0F;
    public static int anInt879 = 5;
    public static int anInt880 = 0;
    public static int anInt881 = 1;
    public static int anInt882 = 4;
    public static float aFloat883 = 1.0F;
    public static int anInt884 = 32;
    public static int anInt885 = 5;
    public static int anInt886 = 131072;
    public static float aFloat887 = 0.25F;
    public static float aFloat888 = 1.0F;
    public static int anInt889 = 2048;
    public static int anInt891 = 1;
    public static int anInt892 = 1;
    public static int anInt893 = 16;
    public static int anInt894 = 4;
    public static int anInt895 = 1048576;
    public static int anInt896 = 0;
    public static int anInt897 = 4;
    public static int anInt898 = 8;
    public static int anInt899 = 2;
    public static int anInt900 = 1;
    static float aFloat842 = 0.0F;
    static float aFloat890 = 1.0F;

    Class91() throws Throwable {
        throw new Error();
    }

    static final void method998(ScriptRuntime runtime) {
        try {
            IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
            IComponentDefinition class105 = IComponentScripter.componentDefinition;
            IComponentDefinitionCollection IComponentDefinitionCollection = IComponentScripter.IComponentDefinitionCollection;
            ToMoveIComponentScripts.method6315(class105, runtime);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ds.fa(").append(')').toString());
        }
    }

    static final void method999(ScriptRuntime class403, byte i) {
        try {
            class403.integerStackOffset -= -783761378;
            int i_0_ = (class403.integerStack[681479919 * class403.integerStackOffset]);
            int i_1_ = (class403.integerStack[1 + 681479919 * class403.integerStackOffset]);
            class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = i_0_ & i_1_;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ds.zx(").append(')').toString());
        }
    }

    static final void method1000(ScriptRuntime runtime) {
        try {
            int i_2_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
            IComponentDefinition class105 = IComponentDefinition.getInterfaceComponent(i_2_);
            IComponentDefinitionCollection IComponentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[i_2_ >> 16];
            Class410.method4984(class105, runtime);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ds.ox(").append(')').toString());
        }
    }

    static void method1001(Entity entity) {
            if (entity instanceof NPC) {
                NPC npc = (NPC) entity;
                if (npc.aClass503_10190 != null)
                    Class140.method1555(npc, (npc.plane != (Player.myPlayer.plane)));
            } else if (entity instanceof Player) {
                Player player = (Player) entity;
                Class298_Sub47.method3535(player, ((Player.myPlayer.plane) != (player.plane)));
            }
    }

    static final void adjustCamera() {
        if (GameClient.cameraYAngle < 1093.0F)
            GameClient.cameraYAngle = 1093.0F;
        if (GameClient.cameraYAngle > 2971.0F)
            GameClient.cameraYAngle = 2971.0F;
        for (/**/; GameClient.cameraXAngle >= 16384.0F; GameClient.cameraXAngle -= 16384.0F) {
                /* empty */
        }
        for (/**/; GameClient.cameraXAngle < 0.0F; GameClient.cameraXAngle += 16384.0F) {
				/* empty */
        }
        Class244 class244 = GameClient.myRegion.method2654();
        Region region = GameClient.myRegion.getRegion();
        int i_3_ = 1103750049 * Class75.anInt708 >> 9;
        int i_4_ = 1346160791 * Class106.anInt1309 >> 9;
        int i_5_ = Class356.getAverageHeight(Class75.anInt708 * 1103750049, Class106.anInt1309 * 1346160791, GameClient.plane * 1855729883, -737895541);
        int i_6_ = 0;
        if (i_3_ > 3 && i_4_ > 3 && i_3_ < GameClient.myRegion.getMapWidth() - 4 && i_4_ < GameClient.myRegion.getMapLength() - 4) {
            for (int i_7_ = i_3_ - 4; i_7_ <= 4 + i_3_; i_7_++) {
                for (int i_8_ = i_4_ - 4; i_8_ <= 4 + i_4_; i_8_++) {
                    int i_9_ = GameClient.plane * 1855729883;
                    if (i_9_ < 3 && class244.method2320(i_7_, i_8_))
                        i_9_++;
                    int i_10_ = 0;
                    byte[][] is = GameClient.myRegion.method2637(i_9_);
                    if (null != is)
                        i_10_ = (is[i_7_][i_8_] & 0xff) * 8 << 2;
                    if (null != region.aClass_xaArray3517 && region.aClass_xaArray3517[i_9_] != null) {
                        int i_11_ = (i_5_ - (region.aClass_xaArray3517[i_9_].method6341(i_7_, i_8_) - i_10_));
                        if (i_11_ > i_6_)
                            i_6_ = i_11_;
                    }
                }
            }
        }
        int i_12_ = (i_6_ >> 2) * 1536;
        if (i_12_ > 786432)
            i_12_ = 786432;
        if (i_12_ < 262144)
            i_12_ = 262144;
        if (i_12_ > GameClient.cameraYOffset * -523207831)
            GameClient.cameraYOffset += ((i_12_ - -523207831 * GameClient.cameraYOffset) / 24 * 1746126041);
        else if (i_12_ < -523207831 * GameClient.cameraYOffset)
            GameClient.cameraYOffset += 1746126041 * ((i_12_ - GameClient.cameraYOffset * -523207831) / 80);
    }
}
