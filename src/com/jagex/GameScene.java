package com.jagex;/* GameScene - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class GameScene {
    public int gameSceneBaseX;
    public int gameSceneBaseY;
    public int gameSceneBasePlane;

    public GameScene(int plane, int baseX, int baseY) {
        gameSceneBasePlane = plane * 1306643131;
        gameSceneBaseX = baseX * 2061281455;
        gameSceneBaseY = baseY * 1901982267;
    }

    public GameScene(int hash) {
        if (-1 == hash)
            gameSceneBasePlane = -1306643131;
        else {
            gameSceneBasePlane = (hash >> 28 & 0x3) * 1306643131;
            gameSceneBaseX = (hash >> 14 & 0x3fff) * 2061281455;
            gameSceneBaseY = (hash & 0x3fff) * 1901982267;
        }
    }

    public GameScene() {
        gameSceneBasePlane = -1306643131;
    }

    public static void method4144(int plane, int i_43_, int i_44_, int i_45_) {
        for (NotDefinition class298_sub41 = ((NotDefinition) NotDefinition.aClass453_7421.method5939()); class298_sub41 != null; class298_sub41 = ((NotDefinition) NotDefinition.aClass453_7421.method5944()))
            StaticMethods.method5989(class298_sub41, plane, i_43_, i_44_, i_45_, -409300106);
        for (NotDefinition class298_sub41 = ((NotDefinition) NotDefinition.aClass453_7455.method5939()); null != class298_sub41; class298_sub41 = ((NotDefinition) NotDefinition.aClass453_7455.method5944())) {
            int i_47_ = 1;
            Class350 class350 = class298_sub41.npc.method4426();
            int i_48_ = class298_sub41.npc.aAnimator_10077.getAnimationID();
            if (-1 == i_48_ || (class298_sub41.npc.aBoolean10094))
                i_47_ = 0;
            else if (230243963 * class350.anInt3721 == i_48_ || class350.anInt3749 * 491753731 == i_48_ || -783166629 * class350.anInt3724 == i_48_ || i_48_ == class350.anInt3746 * -2054940183)
                i_47_ = 2;
            else if (328817727 * class350.anInt3755 == i_48_ || -1238642279 * class350.anInt3722 == i_48_ || class350.anInt3728 * 124010991 == i_48_ || -907666203 * class350.anInt3727 == i_48_)
                i_47_ = 3;
            if (i_47_ != (974385733 * class298_sub41.anInt7439)) {
                int i_49_ = (StaticMethods.method1398((class298_sub41.npc)));
                NPCDefinition class503 = (class298_sub41.npc.aClass503_10190);
                if (class503.morphisms != null)
                    class503 = class503.morph(Class128.playerVarsProvider);
                if (null == class503 || -1 == i_49_) {
                    class298_sub41.anInt7443 = -502744039;
                    class298_sub41.aBoolean7444 = false;
                    class298_sub41.anInt7439 = i_47_ * 636899469;
                } else if (i_49_ != 391847895 * class298_sub41.anInt7443 || (class298_sub41.aBoolean7444) != class503.aBoolean6180) {
                    boolean bool = false;
                    if ((class298_sub41.aClass298_Sub19_Sub2_7447) != null) {
                        class298_sub41.anInt7449 -= 584623616;
                        if ((43235291 * class298_sub41.anInt7449) <= 0) {
                            Class285.aClass298_Sub19_Sub4_3083.method3048(class298_sub41.aClass298_Sub19_Sub2_7447);
                            class298_sub41.aClass298_Sub19_Sub2_7447 = null;
                            bool = true;
                        }
                    } else
                        bool = true;
                    if (bool) {
                        class298_sub41.anInt7449 = -1283486135 * class503.anInt6179;
                        class298_sub41.aClass298_Sub26_Sub1_7446 = null;
                        class298_sub41.aClass298_Sub23_7445 = null;
                        class298_sub41.anInt7443 = 502744039 * i_49_;
                        class298_sub41.aBoolean7444 = class503.aBoolean6180;
                        class298_sub41.anInt7439 = 636899469 * i_47_;
                    }
                } else {
                    class298_sub41.anInt7439 = 636899469 * i_47_;
                    class298_sub41.anInt7449 = class503.anInt6179 * -1283486135;
                }
            }
            Vector3f vector3f = (class298_sub41.npc.getWorldTransform().trans);
            class298_sub41.anInt7425 = -7217919 * (int) vector3f.x;
            class298_sub41.anInt7427 = ((int) vector3f.x + (class298_sub41.npc.getSize() << 8)) * 305826635;
            class298_sub41.anInt7423 = 584186023 * (int) vector3f.z;
            class298_sub41.anInt7428 = ((int) vector3f.z + (class298_sub41.npc.getSize() << 8)) * -1647445571;
            class298_sub41.anInt7424 = ((class298_sub41.npc.plane) * 2135210127);
            StaticMethods.method5989(class298_sub41, plane, i_43_, i_44_, i_45_, -409300106);
        }
        for (NotDefinition class298_sub41 = ((NotDefinition) NotDefinition.aClass437_7440.method5816()); class298_sub41 != null; class298_sub41 = (NotDefinition) NotDefinition.aClass437_7440.method5815()) {
            int i_50_ = 1;
            Class350 class350 = class298_sub41.player.method4426();
            int i_51_ = class298_sub41.player.aAnimator_10077.getAnimationID();
            if (-1 == i_51_ || (class298_sub41.player.aBoolean10094))
                i_50_ = 0;
            else if (i_51_ == 230243963 * class350.anInt3721 || i_51_ == 491753731 * class350.anInt3749 || i_51_ == class350.anInt3724 * -783166629 || i_51_ == -2054940183 * class350.anInt3746)
                i_50_ = 2;
            else if (class350.anInt3755 * 328817727 == i_51_ || i_51_ == -1238642279 * class350.anInt3722 || 124010991 * class350.anInt3728 == i_51_ || i_51_ == class350.anInt3727 * -907666203)
                i_50_ = 3;
            if (i_50_ != (class298_sub41.anInt7439 * 974385733)) {
                int i_52_ = (StaticMethods.method4652((class298_sub41.player)));
                if (i_52_ != (class298_sub41.anInt7443 * 391847895) || (class298_sub41.aBoolean7444 != (class298_sub41.player.isNPCTransformed))) {
                    boolean bool = false;
                    if ((class298_sub41.aClass298_Sub19_Sub2_7447) != null) {
                        class298_sub41.anInt7449 -= 584623616;
                        if ((43235291 * class298_sub41.anInt7449) <= 0) {
                            Class285.aClass298_Sub19_Sub4_3083.method3048(class298_sub41.aClass298_Sub19_Sub2_7447);
                            class298_sub41.aClass298_Sub19_Sub2_7447 = null;
                            bool = true;
                        }
                    } else
                        bool = true;
                    if (bool) {
                        class298_sub41.anInt7449 = (-1138033583 * (class298_sub41.player.anInt10215));
                        class298_sub41.aClass298_Sub26_Sub1_7446 = null;
                        class298_sub41.aClass298_Sub23_7445 = null;
                        class298_sub41.anInt7443 = i_52_ * 502744039;
                        class298_sub41.aBoolean7444 = (class298_sub41.player.isNPCTransformed);
                        class298_sub41.anInt7439 = i_50_ * 636899469;
                    }
                } else {
                    class298_sub41.anInt7449 = (-1138033583 * (class298_sub41.player.anInt10215));
                    class298_sub41.anInt7439 = i_50_ * 636899469;
                }
            }
            Vector3f class217 = (class298_sub41.player.getWorldTransform().trans);
            class298_sub41.anInt7425 = -7217919 * (int) class217.x;
            class298_sub41.anInt7427 = ((int) class217.x + (class298_sub41.player.getSize() << 8)) * 305826635;
            class298_sub41.anInt7423 = 584186023 * (int) class217.z;
            class298_sub41.anInt7428 = ((int) class217.z + (class298_sub41.player.getSize() << 8)) * -1647445571;
            class298_sub41.anInt7424 = ((class298_sub41.player.plane) * 2135210127);
            StaticMethods.method5989(class298_sub41, plane, i_43_, i_44_, i_45_, -409300106);
        }
    }

    public String toString() {
        return new StringBuilder().append(gameSceneBasePlane * 1008331379).append(",").append(-1760580017 * gameSceneBaseX >> 6).append(",").append(283514611 * gameSceneBaseY >> 6).append(",").append(-1760580017 * gameSceneBaseX & 0x3f).append(",").append(283514611 * gameSceneBaseY & 0x3F).toString();

    }

}
