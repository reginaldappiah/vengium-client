package com.jagex;/* Class325 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class325 {
    int anInt3449;
    int anInt3450 = -192677437;
    int[] anIntArray3451;
    Class320 aClass320_3452;
    int anInt3453;

    Class325() {
        this.anInt3449 = 2100310889;
        this.aClass320_3452 = StaticMethods.aClass320_6548;
        this.anInt3453 = 544205675;
    }

    void method3961(Buffer buffer, int opcode) {
        if (1 == opcode)
            this.anInt3450 = buffer.readUShort() * 192677437;
        else if (2 == opcode) {
            this.anIntArray3451 = new int[buffer.readUByte()];
            for (int i_1_ = 0; i_1_ < this.anIntArray3451.length; i_1_++)
                this.anIntArray3451[i_1_] = buffer.readUShort();
        } else if (3 == opcode)
            this.anInt3449 = buffer.readUByte() * -2100310889;
        else if (4 == opcode)
            this.aClass320_3452 = ((Class320) StaticMethods.method5701(Class74.method825(-151911925), buffer.readUByte()));
        else if (5 == opcode)
            this.anInt3453 = buffer.readBigSmart() * -544205675;
    }

    void method3962(Buffer buffer) {
        for (; ; ) {
            int opcode = buffer.readUByte();
            if (0 == opcode) {
                break;
            }
            method3961(buffer, opcode);
        }
    }

}
