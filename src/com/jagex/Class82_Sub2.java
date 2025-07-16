package com.jagex;/* Class82_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class82_Sub2 extends Class82 {
    static int anInt6822;
    int moveLocalX;
    int moveZ;
    int moveLocalY;
    int pitch;
    int yaw;

    Class82_Sub2(Buffer buffer) {
        super(buffer);
        this.moveLocalX = buffer.readUShort() * -1170941763;
        this.moveZ = buffer.readUShort() * -1109088207;
        this.moveLocalY = buffer.readUShort() * -1180452465;
        this.pitch = buffer.readUShort() * 1885378101;
        this.yaw = buffer.readUShort() * -1386950147;
    }

    public static int method878(int i, int i_0_, boolean bool) {
        Class298_Sub9 class298_sub9 = StaticMethods.method2437(i, bool);
        if (null == class298_sub9)
            return 0;
        if (i_0_ < 0 || i_0_ >= (class298_sub9.anIntArray7227).length)
            return 0;
        return class298_sub9.anIntArray7227[i_0_];
    }

    public void method869() {
        Class97_Sub1.moveCamera(930341525 * this.moveLocalX, this.moveLocalY * -913226385, 1149350097 * this.moveZ, 100, 100, false);
        StaticMethods.setMiddleMouseCameraRotation(this.pitch * -58553315, 300585813 * this.yaw, 0);
        GameClient.cameraGloballyUpdated = true;
    }

    public void method868() {
        Class97_Sub1.moveCamera(930341525 * this.moveLocalX, this.moveLocalY * -913226385, 1149350097 * this.moveZ, 100, 100, false);
        StaticMethods.setMiddleMouseCameraRotation(this.pitch * -58553315, 300585813 * this.yaw, 0);
        GameClient.cameraGloballyUpdated = true;
    }

    public void method866() {
        Class97_Sub1.moveCamera(930341525 * this.moveLocalX, this.moveLocalY * -913226385, 1149350097 * this.moveZ, 100, 100, false);
        StaticMethods.setMiddleMouseCameraRotation(this.pitch * -58553315, 300585813 * this.yaw, 0);
        GameClient.cameraGloballyUpdated = true;
    }
}
