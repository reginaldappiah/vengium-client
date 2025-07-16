package com.jagex;/* Class82_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.utils.CameraUtils;

public class Class82_Sub7 extends Class82 {
    int anInt6847;
    int anInt6848;
    int anInt6849;
    int anInt6850;
    int anInt6851;
    int anInt6852;

    Class82_Sub7(Buffer buffer) {
        super(buffer);
        this.anInt6848 = buffer.readUShort() * 1053415677;
        this.anInt6851 = buffer.readUShort() * -289957137;
        this.anInt6849 = buffer.readUShort() * -1654642079;
        this.anInt6847 = buffer.readUShort() * 456781431;
        this.anInt6852 = buffer.readUShort() * -1191092803;
        this.anInt6850 = buffer.readUShort() * 512797893;
    }

    public void method866() {
        Class87.aClass75Array805[this.anInt6848 * 958596181].method833(0, -1291875097);
        Class87.aClass75Array805[this.anInt6851 * 940626959].method833(1, -853378806);
        GameClient.anInt8768 = 0;
        GameClient.anInt8770 = -1367521861 * this.anInt6849;
        GameClient.anInt8857 = 0;
        GameClient.anInt8852 = 2019692335 * this.anInt6852;
        GameClient.anInt8774 = -970762691 * this.anInt6850;
        GameClient.anInt8769 = -2694169;
        GameClient.anInt8771 = this.anInt6847 * -1957420531;
        CameraUtils.cameraType = -734758223 * CameraUtils.LIVE_GAME;
        Class397.method4913();
        GameClient.cameraGloballyUpdated = true;
    }

    public void method869() {
        Class87.aClass75Array805[this.anInt6848 * 958596181].method833(0, -577755381);
        Class87.aClass75Array805[this.anInt6851 * 940626959].method833(1, 1173943462);
        GameClient.anInt8768 = 0;
        GameClient.anInt8770 = -1367521861 * this.anInt6849;
        GameClient.anInt8857 = 0;
        GameClient.anInt8852 = 2019692335 * this.anInt6852;
        GameClient.anInt8774 = -970762691 * this.anInt6850;
        GameClient.anInt8769 = -2694169;
        GameClient.anInt8771 = this.anInt6847 * -1957420531;
        CameraUtils.cameraType = -734758223* CameraUtils.LIVE_GAME;
        Class397.method4913();
        GameClient.cameraGloballyUpdated = true;
    }

    public void method868() {
        Class87.aClass75Array805[this.anInt6848 * 958596181].method833(0, -2120641956);
        Class87.aClass75Array805[this.anInt6851 * 940626959].method833(1, -1465561982);
        GameClient.anInt8768 = 0;
        GameClient.anInt8770 = -1367521861 * this.anInt6849;
        GameClient.anInt8857 = 0;
        GameClient.anInt8852 = 2019692335 * this.anInt6852;
        GameClient.anInt8774 = -970762691 * this.anInt6850;
        GameClient.anInt8769 = -2694169;
        GameClient.anInt8771 = this.anInt6847 * -1957420531;
        CameraUtils.cameraType = -734758223* CameraUtils.LIVE_GAME;
        Class397.method4913();
        GameClient.cameraGloballyUpdated = true;
    }
}
