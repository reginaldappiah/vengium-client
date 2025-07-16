package com.jagex;/* Class397 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.utils.CameraUtils;

public class Class397 {

    public static final void method4913() {
        if (-1 != -591434031 * GameClient.anInt8768 && GameClient.anInt8769 * -839811113 != -1) {
            int i_0_ = (((GameClient.anInt8857 * 892197957 * (GameClient.anInt8774 * 1714001937 - 1049339515 * GameClient.anInt8852)) >> 16) + 1049339515 * GameClient.anInt8852);
            GameClient.anInt8857 += 283956877 * i_0_;
            if (GameClient.anInt8857 * 892197957 >= 65535) {
                GameClient.anInt8857 = -979359373;
                GameClient.aBoolean8775 = !GameClient.aBoolean8776;
                GameClient.aBoolean8776 = true;
            } else {
                GameClient.aBoolean8775 = false;
                GameClient.aBoolean8776 = false;
            }
            float f = (float) (GameClient.anInt8857 * 892197957) / 65535.0F;
            float[] keys = new float[3];
            int i_1_ = GameClient.anInt8770 * 1872262310;
            for (int i_2_ = 0; i_2_ < 3; i_2_++) {
                int i_3_ = 3 * (GameClient.anIntArrayArrayArray8767[GameClient.anInt8768 * -591434031][i_1_][i_2_]);
                int i_4_ = ((GameClient.anIntArrayArrayArray8767[-591434031 * GameClient.anInt8768][1 + i_1_][i_2_]) * 3);
                int i_5_ = ((GameClient.anIntArrayArrayArray8767[GameClient.anInt8768 * -591434031][2 + i_1_][i_2_]) - ((GameClient.anIntArrayArrayArray8767[GameClient.anInt8768 * -591434031][3 + i_1_][i_2_]) - (GameClient.anIntArrayArrayArray8767[-591434031 * GameClient.anInt8768][i_1_ + 2][i_2_]))) * 3;
                int i_6_ = (GameClient.anIntArrayArrayArray8767[-591434031 * GameClient.anInt8768][i_1_][i_2_]);
                int i_7_ = i_4_ - i_3_;
                int i_8_ = i_3_ - 2 * i_4_ + i_5_;
                int i_9_ = i_4_ + ((GameClient.anIntArrayArrayArray8767[GameClient.anInt8768 * -591434031][i_1_ + 2][i_2_]) - i_6_) - i_5_;
                keys[i_2_] = (f * ((float) i_7_ + ((float) i_8_ + (float) i_9_ * f) * f) + (float) i_6_);
            }
            GameScene gameScene = GameClient.myRegion.getGameScene();
            GameClient.camPosX = 547882953 * ((int) keys[0] - 526163456 * gameScene.gameSceneBaseX);
            GameClient.camPosY = (int) keys[1] * -1078403147;
            GameClient.camPosZ = 309839105 * ((int) keys[2] - gameScene.gameSceneBaseY * -869407232);
            float[] fs_10_ = new float[3];
            int i_11_ = GameClient.anInt8771 * 977380166;
            for (int i_12_ = 0; i_12_ < 3; i_12_++) {
                int i_13_ = ((GameClient.anIntArrayArrayArray8767[-839811113 * GameClient.anInt8769][i_11_][i_12_]) * 3);
                int i_14_ = ((GameClient.anIntArrayArrayArray8767[GameClient.anInt8769 * -839811113][1 + i_11_][i_12_]) * 3);
                int i_15_ = 3 * ((GameClient.anIntArrayArrayArray8767[GameClient.anInt8769 * -839811113][2 + i_11_][i_12_]) - ((GameClient.anIntArrayArrayArray8767[-839811113 * GameClient.anInt8769][3 + i_11_][i_12_]) - (GameClient.anIntArrayArrayArray8767[-839811113 * GameClient.anInt8769][2 + i_11_][i_12_])));
                int i_16_ = (GameClient.anIntArrayArrayArray8767[-839811113 * GameClient.anInt8769][i_11_][i_12_]);
                int i_17_ = i_14_ - i_13_;
                int i_18_ = i_15_ + (i_13_ - i_14_ * 2);
                int i_19_ = i_14_ + ((GameClient.anIntArrayArrayArray8767[GameClient.anInt8769 * -839811113][2 + i_11_][i_12_]) - i_16_) - i_15_;
                fs_10_[i_12_] = (((float) i_17_ + (f * (float) i_19_ + (float) i_18_) * f) * f + (float) i_16_);
            }
            float f_20_ = fs_10_[0] - keys[0];
            float f_21_ = (fs_10_[1] - keys[1]) * -1.0F;
            float f_22_ = fs_10_[2] - keys[2];
            double d = Math.sqrt((double) (f_22_ * f_22_ + f_20_ * f_20_));
            GameClient.camRotX = ((int) (Math.atan2((double) f_21_, d) * 2607.5945876176133) & 0x3fff) * -648269561;
            GameClient.camRotY = ((int) (-Math.atan2((double) f_20_, (double) f_22_) * 2607.5945876176133) & 0x3fff) * -1587695039;
            GameClient.camRotZ = ((GameClient.anIntArrayArrayArray8767[-591434031 * GameClient.anInt8768][i_1_][3]) + ((((GameClient.anIntArrayArrayArray8767[-591434031 * GameClient.anInt8768][2 + i_1_][3]) - (GameClient.anIntArrayArrayArray8767[GameClient.anInt8768 * -591434031][i_1_][3])) * (892197957 * GameClient.anInt8857)) >> 16)) * -851711283;
        }
    }

    static void method4914(IComponentDefinition componentDefinition, Class117 class117, int i, int i_23_, int i_24_, int i_25_, int arrowType, long time) {
            int i_27_ = i_25_ * i_25_ + i_24_ * i_24_;
            if ((long) i_27_ <= time) {
                int i_28_;
                if (CameraUtils.cameraType * -863531439 == CameraUtils.FREE_FORM)
                    i_28_ = (int) GameClient.cameraXAngle & 0x3fff;
                else
                    i_28_ = (1227356013 * GameClient.anInt8801 + (int) GameClient.cameraXAngle) & 0x3fff;
                int i_29_ = CircleAngleTable.SINE[i_28_];
                int i_30_ = CircleAngleTable.COSINE[i_28_];
                if (CameraUtils.cameraType * -863531439 != CameraUtils.FREE_FORM) {
                    i_29_ = 256 * i_29_ / (256 + GameClient.anInt8749 * 356727603);
                    i_30_ = i_30_ * 256 / (356727603 * GameClient.anInt8749 + 256);
                }
                int i_31_ = i_30_ * i_24_ + i_25_ * i_29_ >> 14;
                int i_32_ = i_30_ * i_25_ - i_24_ * i_29_ >> 14;
                SpriteToolkit spriteToolkit = Class74.arrowSprites[arrowType];
                int i_33_ = spriteToolkit.getWidth();
                int i_34_ = spriteToolkit.getHeight();
                int i_35_ = i_31_ + -2093041337 * componentDefinition.aspectWidth / 2 - i_33_ / 2;
                int i_36_ = i_35_ + i_33_;
                int i_37_ = componentDefinition.aspectHeight * 457937409 / 2 + -i_32_ - i_34_;
                int i_38_ = i_34_ + i_37_;
                if (!class117.method1274(i_35_, i_37_) || !class117.method1274(i_36_, i_37_) || !class117.method1274(i_35_, i_38_) || !class117.method1274(i_36_, i_38_)) {
                    double d = Math.atan2((double) i_31_, (double) i_32_);
                    int i_39_ = Math.min(componentDefinition.aspectWidth * -2093041337 / 2, componentDefinition.aspectHeight * 457937409 / 2);
                    i_39_ -= 6;
                    int i_40_ = (int) (Math.sin(d) * (double) i_39_);
                    int i_41_ = (int) (Math.cos(d) * (double) i_39_);
                    Class250.aClass57Array2766[arrowType].drawRotatedScaled(((float) (-2093041337 * componentDefinition.aspectWidth) / 2.0F + (float) i + (float) i_40_), ((float) i_23_ + (float) (componentDefinition.aspectHeight * 457937409) / 2.0F - (float) i_41_), 4096, (int) (-d / 6.283185307179586 * 65535.0));
                } else
                    spriteToolkit.method654(i_35_ + i, i_37_ + i_23_, class117.toolkitLoader, i, i_23_);
            }
    }
}
