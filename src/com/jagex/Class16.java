package com.jagex;/* Class16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class16 {
    boolean aBoolean225;
    int anInt226;
    byte aByte227;
    short aShort228;
    short aShort229;
    byte aByte230;
    short aShort231;
    int anInt232;

    Class16(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, boolean bool, int i_8_) {
        this.anInt226 = 1348854581 * i;
        this.aShort229 = (short) i_3_;
        this.aShort231 = (short) i_4_;
        this.aShort228 = (short) i_5_;
        this.aByte230 = (byte) i_6_;
        this.aByte227 = (byte) i_7_;
        this.aBoolean225 = bool;
        this.anInt232 = -44074183 * i_8_;
    }

    public static void method352() {
        if (null != Class288_Sub1.target)
            Class288_Sub1.target.method2042();
        if (null != GameClient.thread) {
            for (; ; ) {
                try {
                    GameClient.thread.join();
                    break;
                } catch (InterruptedException interruptedexception) {

                }
            }
        }
    }

    public static Class289 method354(int i, int i_25_) {
        Class289 class289 = new Class289();
        class289.anInt3151 = -1780317135;
        class289.anInt3152 = 599015853;
        class289.anInt3153 = (1 + i + 5) * -2121339651;
        class289.anInt3154 = (5 + (i_25_ + 1)) * -1973125931;
        class289.anIntArrayArray3155 = (new int[843157589 * class289.anInt3153][class289.anInt3154 * -16196483]);
        class289.method2731(-1639552658);
        return class289;
    }
}
