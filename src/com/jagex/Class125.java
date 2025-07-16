package com.jagex;/* Class125 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class125 {
    public int anInt1481;
    public int anInt1482;
    public int anInt1483;
    public int anInt1484;
    public int anInt1485;
    public boolean aBoolean1486;
    public int anInt1487;
    public int anInt1488;
    public int anInt1489;
    public int anInt1490 = -233713448;
    public int anInt1491;

    Class125() {
        anInt1487 = -118708127;
    }

    void readValueLoop(Buffer buffer) {
        for (; ; ) {
            int opcode = buffer.readUByte();
            if (opcode == 0) {
                break;
            }
            decode(buffer, opcode);
        }
    }

    void decode(Buffer buffer, int opcode) {
        if (1 == opcode)
            anInt1490 = buffer.readUShort() * -1639826917;
        else if (2 == opcode)
            aBoolean1486 = true;
        else if (3 == opcode) {
            anInt1483 = buffer.readShort() * -652822843;
            anInt1489 = buffer.readShort() * -369949453;
            anInt1481 = buffer.readShort() * 586212811;
        } else if (4 == opcode)
            anInt1491 = buffer.readUByte() * 1941395261;
        else if (5 == opcode)
            anInt1488 = buffer.readBigSmart() * 372664533;
        else if (opcode == 6)
            anInt1487 = buffer.readUTriByte() * -1508681825;
        else if (opcode == 7) {
            anInt1485 = buffer.readShort() * -1789510425;
            anInt1484 = buffer.readShort() * 695060321;
            anInt1482 = buffer.readShort() * -1953778617;
        }
    }

}
