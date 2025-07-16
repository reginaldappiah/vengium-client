package com.jagex;/* Class322 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.utils.CameraUtils;

public class Class322 {
    static Class322 aClass322_3358;
    static int anInt3361 = 0;
    public Class365_Sub1_Sub1 aClass365_Sub1_Sub1_3359;
    public Class322 aClass322_3360;

    Class322() {
        /* empty */
    }

    static Class322 method2199(Class365_Sub1_Sub1 class365_sub1_sub1) {
        Class322 class322;
        if (null == aClass322_3358)
            class322 = new Class322();
        else {
            class322 = aClass322_3358;
            aClass322_3358 = aClass322_3358.aClass322_3360;
            class322.aClass322_3360 = null;
            anInt3361 -= -1998519535;
        }
        class322.aClass365_Sub1_Sub1_3359 = class365_sub1_sub1;
        return class322;
    }

    public static RSFontMetrics getFontMetricFileData(Js5FileSystem JS5_FONTMETRICS, int containerID, int fileID) {
        byte[] data = JS5_FONTMETRICS.getFileFromArchive(containerID, fileID);
        if (null == data)
            return null;
        return new RSFontMetrics(data);
    }

    static final void method3932(long key) {
        if (GameClient.myRegion.getRegion() != null) {
            if (4 == -863531439 * CameraUtils.cameraType || 5 == CameraUtils.cameraType * -863531439)
                CursorDefinitionLoader.stoppingCameraShake(key);
            else if (CameraUtils.cameraType * -863531439 == CameraUtils.FREE_FORM)
                StaticMethods.method4944(key);
        }
        Class152.method1652(GameClient.activeGraphicsToolkit, (long) (443738891 * GameClient.clientTick));
        if (-1 != -257444687 * GameClient.WINDOW_PANE_ID)
            StaticMethods.method5884(-257444687 * GameClient.WINDOW_PANE_ID);
        for (int i = 0; i < -112139815 * GameClient.anInt8686; i++) {
            GameClient.rectangleGreen[i] = GameClient.aBooleanArray8900[i];
            GameClient.aBooleanArray8900[i] = false;
        }
        GameClient.windowTick = GameClient.clientTick * -1390800553;
        StaticMethods.method3138(-1, -1);
        if (GameClient.WINDOW_PANE_ID * -257444687 != -1) {
            GameClient.anInt8686 = 0;
            Class104.updateWindowPane();
        }
        GameClient.activeGraphicsToolkit.L();
        StaticMedia.loadFonts(GameClient.activeGraphicsToolkit);
        int i = Class298_Sub17_Sub4.method2926(695848123);
        if (-1 == i)
            i = GameClient.targetLeaveCursor * -1808468501;
        if (i == -1)
            i = GameClient.anInt8831 * 1203044105;
        StaticMethods.method6314(i);
        int i_3_ = (Player.myPlayer.getSize() << 8);
        Vector3f class217 = (Player.myPlayer.getWorldTransform().trans);
        GameScene.method4144((Player.myPlayer.plane), i_3_ + (int) class217.x, (int) class217.z + i_3_, GameClient.animatorTick * 614680345);
        GameClient.animatorTick = 0;
    }

    static Buffer withXtea() {
        Buffer buffer = new Buffer(518);
        Buffer.xtea = new int[4];
        Buffer.xtea[0] = (int) (Math.random() * 9.9999999E7);
        Buffer.xtea[1] = (int) (Math.random() * 9.9999999E7);
        Buffer.xtea[2] = (int) (Math.random() * 9.9999999E7);
        Buffer.xtea[3] = (int) (Math.random() * 9.9999999E7);
        buffer.writeByte(10);
        buffer.writeInt(Buffer.xtea[0]);
        buffer.writeInt(Buffer.xtea[1]);
        buffer.writeInt(Buffer.xtea[2]);
        buffer.writeInt(Buffer.xtea[3]);
        return buffer;
    }

    void method3929() {
        if (anInt3361 * -1841279503 < 500) {
            aClass365_Sub1_Sub1_3359 = null;
            aClass322_3360 = aClass322_3358;
            aClass322_3358 = this;
            anInt3361 += -1998519535;
        }
    }
}
