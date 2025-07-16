package com.jagex;/* Class98_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class98_Sub4 extends Class98 {
    int anInt6939;
    int anInt6940;
    int anInt6941;
    int anInt6943;
    int anInt6944;
    int anInt6945;
    int anInt6946;
    int anInt6947;

    Class98_Sub4(int i, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_, int i_18_, int i_19_) {
        super(-1, i_18_, i_19_);
        this.anInt6940 = i * -1481748149;
        this.anInt6941 = i_11_ * 2083682305;
        this.anInt6947 = i_12_ * -581704253;
        this.anInt6943 = i_13_ * 860778625;
        this.anInt6944 = -324574013 * i_14_;
        this.anInt6945 = -1154276627 * i_15_;
        this.anInt6939 = -13418751 * i_16_;
        this.anInt6946 = -2055513343 * i_17_;
    }

    static Class98_Sub4 method1922(Buffer buffer) {
            return new Class98_Sub4(buffer.readShort(), buffer.readShort(), buffer.readShort(), buffer.readShort(), buffer.readShort(), buffer.readShort(), buffer.readShort(), buffer.readShort(), buffer.readUTriByte(), buffer.readUByte());
    }

    void method1054(int i, int i_1_, byte i_2_) {
        int i_3_ = i * (-499535773 * this.anInt6940) >> 12;
        int i_4_ = this.anInt6941 * -1676834815 * i_1_ >> 12;
        int i_5_ = this.anInt6947 * 1286877931 * i >> 12;
        int i_6_ = 1208078209 * this.anInt6943 * i_1_ >> 12;
        int i_7_ = 1616079851 * this.anInt6944 * i >> 12;
        int i_8_ = 1348897509 * this.anInt6945 * i_1_ >> 12;
        int i_9_ = 1800257793 * this.anInt6939 * i >> 12;
        int i_10_ = 1776133377 * this.anInt6946 * i_1_ >> 12;
        Class336.method4095(i_3_, i_4_, i_5_, i_6_, i_7_, i_8_, i_9_, i_10_, this.anInt947 * 1785836763);
    }

    void method1048(int i, int i_20_, byte i_21_) {

    }

    void method1047(int i, int i_35_, byte i_36_) {

    }

}
