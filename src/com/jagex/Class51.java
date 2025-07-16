package com.jagex;

import com.jagex.utils.StringUtils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* Class51 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class51 {
    public static MapsDefinitionsLoader aClass475_506;
    static short aShort504;

    Class51() throws Throwable {
        throw new Error();
    }

    static void method50123(int x) {
        try {
            Class var_class = java.lang.ClassLoader.class;
            Field field = var_class.getDeclaredField("nativeLibraries");
            Class var_class_124_ = java.lang.reflect.AccessibleObject.class;
            Method method = var_class_124_.getDeclaredMethod("setAccessible", (new Class[]{Boolean.TYPE}));
            method.invoke(field, Boolean.TRUE);
        } catch (Throwable throwable) {
            /* empty */
        }
    }

    static final void decodeLswp(RsBitsBuffer bitsBuffer, int i) {
        bitsBuffer.initBitAccess();
        int myPlayerIndex = GameClient.playerIndex * -442628795;
        Player player = (Player.myPlayer = GameClient.entities[myPlayerIndex] = (new Player(GameClient.myRegion.getRegion())));
        player.entityIndex = myPlayerIndex * 1714292119;
        int i_2_ = bitsBuffer.readBits(30);
        byte i_3_ = (byte) (i_2_ >> 28);
        int i_4_ = i_2_ >> 14 & 0x3fff;
        int i_5_ = i_2_ & 0x3fff;
        GameScene gameScene = GameClient.myRegion.getGameScene();
        player.scenePositionXQueue[0] = i_4_ - -1760580017 * gameScene.gameSceneBaseX;
        player.scenePositionYQueue[0] = i_5_ - gameScene.gameSceneBaseY * 283514611;
        player.method4341((float) ((player.scenePositionXQueue[0] << 9) + (player.getSize() << 8)), (player.method4343().trans.y), (float) ((player.scenePositionYQueue[0] << 9) + (player.getSize() << 8)));
        GameClient.plane = (player.plane = player.aByte7724 = i_3_) * -85701805;
        if (GameClient.myRegion.method2654().method2320(player.scenePositionXQueue[0], player.scenePositionYQueue[0]))
            player.aByte7724++;
        if (Class10.aClass298_Sub53Array133[myPlayerIndex] != null)
            player.sendAppearence(Class10.aClass298_Sub53Array133[myPlayerIndex], (byte) 3);
        Class10.entitiesInRegion = 0;
        Class10.players[(Class10.entitiesInRegion += -656365301) * 1168366243 - 1] = myPlayerIndex;
        Class10.aByteArray131[myPlayerIndex] = (byte) 0;
        Class10.anInt130 = 0;
        for (int i_6_ = 1; i_6_ < 2048; i_6_++) {
            if (myPlayerIndex == i_6_) {
                if (i == 987294394) {
						/* empty */
                }
            } else {
                int regionHash = bitsBuffer.readBits(18);
                int i_8_ = regionHash >> 16;
                int i_9_ = regionHash >> 8 & 0xff;
                int i_10_ = regionHash & 0xff;
                Class410 class410 = Class10.aClass410Array138[i_6_] = new Class410();
                class410.anInt5288 = ((i_9_ << 14) + (i_8_ << 28) + i_10_) * 1896571807;
                class410.anInt5286 = 0;
                class410.anInt5285 = -1908419961;
                class410.aBoolean5287 = false;
                class410.aBoolean5289 = false;
                Class10.entities[(Class10.anInt130 += 854162319) * 1430471535 - 1] = i_6_;
                Class10.aByteArray131[i_6_] = (byte) 0;
            }
        }
        bitsBuffer.finishBitAccess();
    }

    public static boolean method543(CharSequence charsequence) {
            return StringUtils.method4692(charsequence, 10, true, -1628070489);
    }
}
