package com.jagex;/* Class98_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class98_Sub2 extends Class98 {
    int anInt6927;
    int anInt6929;
    int anInt6930;
    int anInt6931;

    Class98_Sub2(int i, int i_17_, int i_18_, int i_19_, int i_20_, int i_21_) {
        super(-1, i_20_, i_21_);
        this.anInt6930 = 388331117 * i;
        this.anInt6927 = i_17_ * -1813324469;
        this.anInt6929 = i_18_ * -2080243163;
        this.anInt6931 = 1437683907 * i_19_;
    }

    static void method1061() {

    }

    static Class98_Sub2 method3405(Buffer buffer) {
            return new Class98_Sub2(buffer.readShort(), buffer.readShort(), buffer.readShort(), buffer.readShort(), buffer.readUTriByte(), buffer.readUByte());
        }

    void method1054(int i, int i_1_, byte i_2_) {
        int i_3_ = i * (this.anInt6930 * -737606811) >> 12;
        int i_4_ = i * (this.anInt6929 * 627591597) >> 12;
        int i_5_ = i_1_ * (870171747 * this.anInt6927) >> 12;
        int i_6_ = i_1_ * (this.anInt6931 * 1837883371) >> 12;
        Class264_Sub1.method2503(i_3_, i_5_, i_4_, i_6_, (1785836763 * this.anInt947));
    }

    void method1047(int i, int i_7_, byte i_8_) {

    }

    void method1048(int i, int i_10_, byte i_11_) {

    }

}
