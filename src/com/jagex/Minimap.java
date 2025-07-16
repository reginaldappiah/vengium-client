package com.jagex;/* Minimap - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.utils.TimeUtils;

public class Minimap {
    public static int flagY;
    public static int flagX;
    static boolean aBoolean55;
    static int anInt56;
    static int anInt57;
    static int[] anIntArray58;
    static int[] anIntArray59;
    static int[] anIntArray60;
    static Class453 aClass453_61;
    static boolean aBoolean63;
    static boolean aBoolean64 = false;
    static boolean aBoolean65;
    static int anInt66 = 48;
    static int anInt67;
    static Class284 aClass284_68;

    static {
        aBoolean55 = false;
        anInt57 = 955770805;
        anInt67 = 0;
        anIntArray58 = new int[1003];
        anIntArray59 = new int[1004];
        anIntArray60 = new int[1005];
        aClass453_61 = new Class453();
        flagX = 1129029761;
        flagY = 1835291189;
        aBoolean63 = true;
        aBoolean65 = false;
        anInt56 = 0;
    }

    Minimap() throws Throwable {
        throw new Error();
    }

    static boolean drawMinimap(GraphicsToolkit toolkit, int plane) {
        TimeUtils.getTime();
        if (!toolkit.method5041())
            return false;
        int i_4_ = GameClient.myRegion.getMapWidth();
        int i_5_ = GameClient.myRegion.getMapLength();
        Class244 class244 = GameClient.myRegion.method2654();
        Region class331 = GameClient.myRegion.getRegion();
        int i_6_ = i_4_ / 2;
        int i_7_ = 0;
        int i_8_ = 0;
        boolean bool = true;
        for (int i_9_ = i_7_; i_9_ < i_7_ + i_4_; i_9_++) {
            for (int i_10_ = i_8_; i_10_ < i_8_ + i_5_; i_10_++) {
                for (int i_11_ = plane; i_11_ <= 3; i_11_++) {
                    if (class244.method2321(plane, i_11_, i_9_, i_10_)) {
                        int i_12_ = i_11_;
                        if (class244.method2320(i_9_, i_10_))
                            i_12_--;
                        if (i_12_ >= 0)
                            bool &= Class271.method2543(i_12_, i_9_, i_10_, -1955757694);
                    }
                }
            }
        }
        if (!bool)
            return false;
        int i_13_ = i_4_ * 4 + 48 + 48;
        int[] is = new int[i_13_ * i_13_];
        for (int i_14_ = 0; i_14_ < is.length; i_14_++)
            is[i_14_] = -16777216;
        FrameBufferContext frameBufferContext = null;
        int i_15_ = 0;
        int i_16_ = 0;
        if (aBoolean55) {
            StaticMethods.spriteToolkit = toolkit.method5029(i_13_, i_13_, false, true);
            frameBufferContext = toolkit.method5094();
            frameBufferContext.method563(0, StaticMethods.spriteToolkit.method627());
            Interface8_Impl1_Impl2 interface8_impl1_impl2 = toolkit.method5186(i_13_, i_13_);
            frameBufferContext.method558(interface8_impl1_impl2);
            toolkit.switchContext(frameBufferContext);
            i_6_ = i_4_;
            i_15_ = 48;
            i_16_ = 48;
            toolkit.clear(1, 0);
        } else
            StaticMethods.spriteToolkit = toolkit.createRenderSprite(is, 0, i_13_, i_13_, i_13_);
        GameClient.myRegion.getLightningDetails().setDefaults();
        int i_17_ = ~0xffffff | ((238 + (int) (Math.random() * 20.0) - 10 << 16) + (238 + (int) (Math.random() * 20.0) - 10 << 8) + (238 + (int) (Math.random() * 20.0) - 10));
        int i_18_ = ~0xffffff | 238 + (int) (Math.random() * 20.0) - 10 << 16;
        int i_19_ = ((int) (Math.random() * 8.0) << 16 | (int) (Math.random() * 8.0) << 8 | (int) (Math.random() * 8.0));
        boolean[][] bools = new boolean[1 + i_6_ + 2][2 + (i_6_ + 1)];
        for (int i_20_ = i_7_; i_20_ < i_4_ + i_7_; i_20_ += i_6_) {
            for (int i_21_ = i_8_; i_21_ < i_5_ + i_8_; i_21_ += i_6_) {
                int i_22_ = i_15_;
                int i_23_ = i_16_;
                int i_24_ = i_20_;
                if (i_24_ > 0) {
                    i_24_--;
                    i_22_ += 4;
                }
                int i_25_ = i_21_;
                if (i_25_ > 0)
                    i_25_--;
                int i_26_ = i_6_ + i_20_;
                if (i_26_ < i_4_)
                    i_26_++;
                int i_27_ = i_21_ + i_6_;
                if (i_27_ < i_5_) {
                    i_27_++;
                    i_23_ += 4;
                }
                if (aBoolean64)
                    toolkit.L();
                else
                    toolkit.setClip(0, 0, i_6_ * 4 + i_22_, i_23_ + 4 * i_6_);
                toolkit.clear(3, -16777216);
                int i_28_ = i_6_;
                if (i_28_ > i_4_ - 1)
                    i_28_ = i_4_ - 1;
                for (int i_29_ = plane; i_29_ <= 3; i_29_++) {
                    for (int i_30_ = 0; i_30_ <= i_28_; i_30_++) {
                        for (int i_31_ = 0; i_31_ <= i_28_; i_31_++)
                            bools[i_30_][i_31_] = class244.method2321(plane, i_29_, i_24_ + i_30_, i_25_ + i_31_);
                    }
                    class331.aClass_xaArray3519[i_29_].method6339(i_15_, i_16_, 1024, i_24_, i_25_, i_26_, i_27_, bools);
                    if (!aBoolean65) {
                        for (int i_32_ = -4; i_32_ < i_6_; i_32_++) {
                            for (int i_33_ = -4; i_33_ < i_6_; i_33_++) {
                                int i_34_ = i_32_ + i_20_;
                                int i_35_ = i_21_ + i_33_;
                                if (i_34_ >= i_7_ && i_35_ >= i_8_ && class244.method2321(plane, i_29_, i_34_, i_35_)) {
                                    int i_36_ = i_29_;
                                    if (class244.method2320(i_34_, i_35_))
                                        i_36_--;
                                    if (i_36_ >= 0)
                                        Class70.method802(toolkit, i_36_, i_34_, i_35_, i_32_ * 4 + i_22_, (i_23_ + (i_6_ - i_33_) * 4 - 4), i_17_, i_18_, -2020733164);
                                }
                            }
                        }
                    }
                }
                if (aBoolean65) {
                    Class289 class289 = GameClient.myRegion.getSceneClipDataPlane(plane);
                    for (int i_37_ = 0; i_37_ < i_6_; i_37_++) {
                        for (int i_38_ = 0; i_38_ < i_6_; i_38_++) {
                            int i_39_ = i_20_ + i_37_;
                            int i_40_ = i_21_ + i_38_;
                            int i_41_ = (class289.anIntArrayArray3155[i_39_ - (class289.anInt3151 * 1487776559)][i_40_ - (1415525851 * class289.anInt3152)]);
                            if (0 != (i_41_ & 0x40240000))
                                toolkit.fillRectangle(4 * i_37_ + i_22_, (i_23_ + 4 * (i_6_ - i_38_) - 4), 4, 4, -1713569622);
                            else if (0 != (i_41_ & 0x800000))
                                toolkit.method4990(i_37_ * 4 + i_22_, (i_23_ + 4 * (i_6_ - i_38_) - 4), 4, -1713569622);
                            else if (0 != (i_41_ & 0x2000000))
                                toolkit.method5035(i_37_ * 4 + i_22_ + 3, (i_23_ + (i_6_ - i_38_) * 4 - 4), 4, -1713569622);
                            else if (0 != (i_41_ & 0x8000000))
                                toolkit.method4990(4 * i_37_ + i_22_, (i_23_ + 4 * (i_6_ - i_38_) - 4 + 3), 4, -1713569622);
                            else if (0 != (i_41_ & 0x20000000))
                                toolkit.method5035(i_22_ + 4 * i_37_, ((i_6_ - i_38_) * 4 + i_23_ - 4), 4, -1713569622);
                        }
                    }
                }
                toolkit.drawFilledRectangle(i_22_, i_23_, i_6_ * 4, 4 * i_6_, i_19_, 2);
                if (!aBoolean55) {
                    StaticMethods.spriteToolkit.method675((i_20_ - i_7_) * 4 + 48, 4 * i_5_ + 48 - (i_21_ - i_8_) * 4 - i_6_ * 4, i_6_ * 4, 4 * i_6_, i_22_, i_23_);
                    if (aBoolean64) {
                        StaticMethods.spriteToolkit.draw(256, 0);
                        try {
                            toolkit.renderFrame();
                            IPAddress.method6060(2000L);
                        } catch (Exception exception) {
                                /* empty */
                        }
                    }
                }
            }
        }
        if (aBoolean55) {
            toolkit.method5005(frameBufferContext);
            if (aBoolean64) {
                StaticMethods.spriteToolkit.draw(256, 0);
                try {
                    toolkit.renderFrame();
                    IPAddress.method6060(2000L);
                } catch (Exception exception) {
						/* empty */
                }
            }
        }
        toolkit.L();
        toolkit.clear(1, 1);
        StaticMethods.method4301();
        ObjectDefinitionLoader class433 = GameClient.myRegion.getObjectDefinitionLoader();
        anInt67 = 0;
        aClass453_61.clean();
        if (!aBoolean65) {
            for (int i_42_ = i_7_; i_42_ < i_4_ + i_7_; i_42_++) {
                for (int i_43_ = i_8_; i_43_ < i_5_ + i_8_; i_43_++) {
                    for (int i_44_ = plane; i_44_ <= 1 + plane && i_44_ <= 3; i_44_++) {
                        if (class244.method2321(plane, i_44_, i_42_, i_43_)) {
                            SceneObject sceneObject = ((SceneObject) class331.method4058(i_44_, i_42_, i_43_));
                            if (sceneObject == null)
                                sceneObject = ((SceneObject) (class331.method4035(i_44_, i_42_, i_43_, GameClient.anInterface17_8960)));
                            if (sceneObject == null)
                                sceneObject = ((SceneObject) class331.method4031(i_44_, i_42_, i_43_));
                            if (sceneObject == null)
                                sceneObject = ((SceneObject) class331.method4033(i_44_, i_42_, i_43_));
                            if (sceneObject != null) {
                                ObjectDefinition class432 = (class433.get(sceneObject.getID()));
                                if (class432.aBoolean5434 && !GameClient.isMemberWorld) {
                                } else {
                                    int i_45_ = -1422593103 * class432.anInt5399;
                                    if (null != class432.objectIDs) {
                                        for (int i_46_ = 0; (i_46_ < (class432.objectIDs).length); i_46_++) {
                                            if ((class432.objectIDs[i_46_]) != -1) {
                                                ObjectDefinition class432_47_ = (class433.get((class432.objectIDs[i_46_])));
                                                if ((class432_47_.anInt5399 * -1422593103) >= 0)
                                                    i_45_ = (-1422593103 * (class432_47_.anInt5399));
                                            }
                                        }
                                    }
                                    if (i_45_ >= 0) {
                                        boolean bool_48_ = false;
                                        if (i_45_ >= 0) {
                                            Class352 class352 = (Class363.aClass339_3931.method4116(i_45_));
                                            if (class352 != null && class352.aBoolean3791)
                                                bool_48_ = true;
                                        }
                                        int i_49_ = i_42_;
                                        int i_50_ = i_43_;
                                        if (bool_48_) {
                                            int[][] is_51_ = (GameClient.myRegion.getSceneClipDataPlane(i_44_).anIntArrayArray3155);
                                            int i_52_ = ((GameClient.myRegion.getSceneClipDataPlane(i_44_).anInt3151) * 1487776559);
                                            int i_53_ = ((GameClient.myRegion.getSceneClipDataPlane(i_44_).anInt3152) * 1415525851);
                                            for (int i_54_ = 0; i_54_ < 10; i_54_++) {
                                                int i_55_ = (int) (Math.random() * 4.0);
                                                if (i_55_ == 0 && i_49_ > i_7_ && i_49_ > i_42_ - 3 && 0 == ((is_51_[(i_49_ - 1 - i_52_)][(i_50_ - i_53_)]) & 0x2c0108))
                                                    i_49_--;
                                                if (1 == i_55_ && (i_49_ < i_4_ + i_7_ - 1) && i_49_ < i_42_ + 3 && 0 == ((is_51_[(1 + i_49_ - i_52_)][(i_50_ - i_53_)]) & 0x2c0180))
                                                    i_49_++;
                                                if (i_55_ == 2 && i_50_ > i_8_ && i_50_ > i_43_ - 3 && 0 == ((is_51_[(i_49_ - i_52_)][(i_50_ - 1 - i_53_)]) & 0x2c0102))
                                                    i_50_--;
                                                if (i_55_ == 3 && (i_50_ < i_5_ + i_8_ - 1) && i_50_ < 3 + i_43_ && 0 == ((is_51_[(i_49_ - i_52_)][(1 + i_50_ - i_53_)]) & 0x2c0120))
                                                    i_50_++;
                                            }
                                        }
                                        anIntArray60[(anInt67 * 1659101557)] = (class432.objectID * 1181652947);
                                        anIntArray58[1659101557 * anInt67] = i_49_;
                                        anIntArray59[1659101557 * anInt67] = i_50_;
                                        anInt67 += 1706239709;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            Class296 class296 = GameClient.myRegion.method2631();
            if (null != class296) {
                Class363.aClass339_3931.method4119(1024, 64);
                GameScene gameScene = GameClient.myRegion.getGameScene();
                for (int i_56_ = 0; i_56_ < class296.anInt3169 * -1407078377; i_56_++) {
                    int i_57_ = class296.anIntArray3168[i_56_];
                    if ((Player.myPlayer.plane) == i_57_ >> 28) {
                        int i_58_ = ((i_57_ >> 14 & 0x3fff) - gameScene.gameSceneBaseX * -1760580017);
                        int i_59_ = ((i_57_ & 0x3fff) - gameScene.gameSceneBaseY * 283514611);
                        if (i_58_ >= 0 && i_58_ < i_4_ && i_59_ >= 0 && i_59_ < i_5_)
                            aClass453_61.pushBack(new IntNode(i_56_));
                        else {
                            Class352 class352 = (Class363.aClass339_3931.method4116(class296.anIntArray3170[i_56_]));
                            if (null != class352.anIntArray3803 && (i_58_ + 968926443 * class352.anInt3793 >= 0)) {
                                if (i_58_ + 1281846757 * class352.anInt3804 >= i_4_) {

                                } else if (i_59_ + (-1294057761 * class352.anInt3807) >= 0) {
                                    if (i_59_ + (class352.anInt3805 * -1901940595) >= i_5_) {

                                    } else
                                        aClass453_61.pushBack(new IntNode(i_56_));
                                }
                            }
                        }
                    }
                }
                Class363.aClass339_3931.method4119(128, 64);
            }
        }
        return true;
    }

}
