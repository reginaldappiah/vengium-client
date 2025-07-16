package com.jagex;/* LookupTable - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class LookupTable {
    int[] anIntArray1368;

    public LookupTable(int[] is) {
        int i;
        for (i = 1; i <= (is.length >> 1) + is.length; i <<= 1) {
			/* empty */
        }
        this.anIntArray1368 = new int[i + i];
        for (int i_4_ = 0; i_4_ < i + i; i_4_++)
            this.anIntArray1368[i_4_] = -1;
        for (int i_5_ = 0; i_5_ < is.length; i_5_++) {
            int i_6_;
            for (i_6_ = is[i_5_] & i - 1; this.anIntArray1368[1 + (i_6_ + i_6_)] != -1; i_6_ = i_6_ + 1 & i - 1) {
				/* empty */
            }
            this.anIntArray1368[i_6_ + i_6_] = is[i_5_];
            this.anIntArray1368[1 + (i_6_ + i_6_)] = i_5_;
        }
    }

    public int getId(int i) {
        int i_1_ = (this.anIntArray1368.length >> 1) - 1;
        int i_2_ = i & i_1_;
        for (; ; ) {
            int i_3_ = this.anIntArray1368[i_2_ + i_2_ + 1];
            if (i_3_ == -1) {
                return -1;
            }
            if (i == this.anIntArray1368[i_2_ + i_2_]) {
                return i_3_;
            }
            i_2_ = i_2_ + 1 & i_1_;
        }
    }

}
