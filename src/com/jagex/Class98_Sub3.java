package com.jagex;/* Class98_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class98_Sub3 extends Class98 {
    int anInt6933;
    int anInt6934;
    int anInt6935;
    int anInt6936;

    Class98_Sub3(int i, int i_16_, int i_17_, int i_18_, int i_19_, int i_20_, int i_21_) {
        super(i_19_, i_20_, i_21_);
        anInt6934 = i * -1350433011;
        anInt6936 = -1574966331 * i_16_;
        anInt6935 = 962222061 * i_17_;
        anInt6933 = -8417825 * i_18_;
    }

    static Class98_Sub3 method783(Buffer buffer) {
            return new Class98_Sub3(buffer.readShort(), buffer.readShort(), buffer.readShort(), buffer.readShort(), buffer.readUTriByte(), buffer.readUTriByte(), buffer.readUByte());
    }

    void method1054(int i, int i_5_, byte i_6_) {
        int i_7_ = i * (888020933 * anInt6934) >> 12;
        int i_8_ = i * (-2064671259 * anInt6935) >> 12;
        int i_9_ = i_5_ * (1550473997 * anInt6936) >> 12;
        int i_10_ = i_5_ * (anInt6933 * 577269279) >> 12;
        Class136.method1499(i_7_, i_8_, i_9_, i_10_, anInt947 * 1785836763, anInt946 * -759495821);
    }

    void method1047(int i, int i_32_, byte i_33_) {
        int i_34_ = 888020933 * anInt6934 * i >> 12;
        int i_35_ = -2064671259 * anInt6935 * i >> 12;
        int i_36_ = 1550473997 * anInt6936 * i_32_ >> 12;
        int i_37_ = i_32_ * (anInt6933 * 577269279) >> 12;
        Class270.method2539(i_34_, i_35_, i_36_, i_37_, anInt948 * 699194661);
    }

    void method1048(int i, int i_43_, byte i_44_) {
        int i_45_ = i * (anInt6934 * 888020933) >> 12;
        int i_46_ = -2064671259 * anInt6935 * i >> 12;
        int i_47_ = 1550473997 * anInt6936 * i_43_ >> 12;
        int i_48_ = 577269279 * anInt6933 * i_43_ >> 12;
        Class430.method5762(i_45_, i_46_, i_47_, i_48_, anInt948 * 699194661, anInt947 * 1785836763, anInt946 * -759495821);
    }

}
