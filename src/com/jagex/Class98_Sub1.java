package com.jagex;/* Class98_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class98_Sub1 extends Class98 {
    int anInt6923;
    int anInt6924;
    int anInt6925;
    int anInt6926;

    Class98_Sub1(int i, int i_35_, int i_36_, int i_37_, int i_38_, int i_39_, int i_40_) {
        super(i_38_, i_39_, i_40_);
        this.anInt6923 = i * 857007627;
        this.anInt6924 = 578579675 * i_35_;
        this.anInt6925 = -655913541 * i_36_;
        this.anInt6926 = 851394765 * i_37_;
    }

    static Class98_Sub1 method313(Buffer buffer) {
        return new Class98_Sub1(buffer.readShort(), buffer.readShort(), buffer.readShort(), buffer.readShort(), buffer.readUTriByte(), buffer.readUTriByte(), buffer.readUByte());
    }

    void method1048(int i, int i_0_, byte i_1_) {
        int i_2_ = i * (this.anInt6923 * 2134635939) >> 12;
        int i_3_ = i * (this.anInt6925 * -58577037) >> 12;
        int i_4_ = this.anInt6924 * 1584246611 * i_0_ >> 12;
        int i_5_ = i_0_ * (-2052936699 * this.anInt6926) >> 12;
        Class455.method5957(i_2_, i_4_, i_3_, i_5_, 699194661 * this.anInt948, 1785836763 * this.anInt947, -759495821 * this.anInt946);
    }

    void method1054(int i, int i_6_, byte i_7_) {

    }

    void method1047(int i, int i_8_, byte i_9_) {
        int i_10_ = i * (2134635939 * this.anInt6923) >> 12;
        int i_11_ = i * (this.anInt6925 * -58577037) >> 12;
        int i_12_ = i_8_ * (this.anInt6924 * 1584246611) >> 12;
        int i_13_ = this.anInt6926 * -2052936699 * i_8_ >> 12;
        Class82_Sub1.method877(i_10_, i_12_, i_11_, i_13_, this.anInt948 * 699194661);
    }

}
