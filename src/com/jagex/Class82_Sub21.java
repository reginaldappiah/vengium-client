package com.jagex;/* Class82_Sub21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class82_Sub21 extends Class82 {
    int anInt6901;

    Class82_Sub21(Buffer class298_sub53) {
        super(class298_sub53);
        this.anInt6901 = class298_sub53.readUShort() * 855211779;
    }

    static final void method936(Class365_Sub1 class365_sub1, int i, boolean bool) {
        int i_1_;
        int i_2_;
        if (class365_sub1 instanceof Class365_Sub1_Sub1 && class365_sub1 instanceof SceneObject) {
            Class365_Sub1_Sub1 class365_sub1_sub1 = (Class365_Sub1_Sub1) class365_sub1;
            int i_3_ = ((class365_sub1_sub1.aShort9796 - class365_sub1_sub1.aShort9798 + 1) << 9);
            int i_4_ = (1 + (class365_sub1_sub1.aShort9797 - class365_sub1_sub1.aShort9795) << 9);
            i_1_ = (class365_sub1_sub1.aShort9798 << 9) + i_3_ / 2;
            i_2_ = i_4_ / 2 + (class365_sub1_sub1.aShort9795 << 9);
        } else {
            Vector3f class217 = class365_sub1.getWorldTransform().trans;
            i_1_ = (int) class217.x;
            i_2_ = (int) class217.z;
        }
        StaticMethods.method1400(class365_sub1.plane, i_1_, i_2_, 0, i, bool);
    }

    static final void method937(ScriptRuntime runtime) {
        int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceHash);
        ToMoveIComponentScripts.method2694(componentDefinition, runtime);
    }

    static final boolean method938(int i, int i_6_, boolean bool, Class336 class336) {
        int i_8_ = (Player.myPlayer.scenePositionXQueue[0]);
        int i_9_ = (Player.myPlayer.scenePositionYQueue[0]);
        if (i_8_ < 0 || i_8_ >= GameClient.myRegion.getMapWidth() || i_9_ < 0 || i_9_ >= GameClient.myRegion.getMapLength())
            return false;
        if (i < 0 || i >= GameClient.myRegion.getMapWidth() || i_6_ < 0 || i_6_ >= GameClient.myRegion.getMapLength())
            return false;
        int i_10_ = (StaticMethods.calculateRoute(i_8_, i_9_, Player.myPlayer.getSize(), class336, (GameClient.myRegion.getSceneClipDataPlane(Player.myPlayer.plane)), bool, GameClient.calculatedScenePositionXs, GameClient.calculatedScenePositionYs));
        if (i_10_ < 1)
            return false;
        Minimap.flagX = GameClient.calculatedScenePositionXs[i_10_ - 1] * -1129029761;
        Minimap.flagY = -1835291189 * GameClient.calculatedScenePositionYs[i_10_ - 1];
        Minimap.aBoolean63 = false;
        IComponentUpdateNode.createResetWalkingEdit();
        return true;
    }

    public void method866() {
        try {
            Class87.aClass86Array798[this.anInt6901 * 297690027].method959();
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("yt.f(").append(')').toString());
        }
    }

    public void method868() {
        Class87.aClass86Array798[this.anInt6901 * 297690027].method959();
    }

    public void method869() {
        Class87.aClass86Array798[this.anInt6901 * 297690027].method959();
    }
}
