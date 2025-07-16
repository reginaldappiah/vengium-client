package com.jagex;/* Class336_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.settings.TextureSetting;

public class Class336_Sub3 extends Class336 {
    int anInt7715;

    Class336_Sub3() {
        /* empty */
    }

    static final void method4101() {
        ResourceProvider.anInt2709 = 0;
    }

    public boolean method4089(int i, int i_0_, int i_1_, Class289 class289) {
        return class289.method2740(i_0_, i_1_, i, i, -1331662251 * toX, 1517720743 * toY, -1900284579 * sizeX, sizeY * 772610897, (this.anInt7715 * -1547195715), (byte) -126);
    }

    public boolean method4090(int i, int i_2_, int i_3_, Class289 class289, int i_4_) {
        try {
            return class289.method2740(i_2_, i_3_, i, i, -1331662251 * toX, 1517720743 * toY, -1900284579 * sizeX, sizeY * 772610897, (this.anInt7715 * -1547195715), (byte) -108);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("acg.a(").append(')').toString());
        }
    }

    public boolean method4091(int i, int i_5_, int i_6_, Class289 class289) {
        return class289.method2740(i_5_, i_6_, i, i, -1331662251 * toX, 1517720743 * toY, -1900284579 * sizeX, sizeY * 772610897, (this.anInt7715 * -1547195715), (byte) -11);
    }
}
