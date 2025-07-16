package com.jagex;/* Class359 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class359 implements Recorder {
    int anInt6526;
    int anInt6527;

    Class359(int i, int i_0_) {
        this.anInt6526 = -1416816271 * i;
        this.anInt6527 = i_0_ * 1741492491;
    }

    public boolean record(MouseRecord mouseRecord, KeyRecord[] keyRecords, int maxHeld, KeyRecorder keyRecorder) {
        for (int i_2_ = 0; i_2_ < maxHeld && i_2_ < keyRecords.length; i_2_++) {
            KeyRecord interface16 = keyRecords[i_2_];
            if (interface16 == null) {

            } else if ((interface16.getKeyCode() == 843745169 * this.anInt6526) && (interface16.getFlags() == this.anInt6527 * -1785843037))
                return true;
        }
        return false;
    }

}
