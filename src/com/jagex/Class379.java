package com.jagex;/* Class379 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class379 {
    public static int[] anIntArray4096;
    public static int[] anIntArray4098;
    static int anInt4095;
    static int anInt4097 = 0;
    static int interfaceHash;

    static {
        anInt4095 = 0;
    }

    Class379() throws Throwable {
        throw new Error();
    }

    static final void method4674() {
        int plane = 0;
        Region class331 = GameClient.myRegion.getRegion();
        for (int regionX = 0; regionX < GameClient.myRegion.getMapWidth(); regionX++) {
            for (int regionY = 0; regionY < GameClient.myRegion.getMapLength(); regionY++) {
                if (Class143.method1577((class331.gameSceneBase), plane, regionX, regionY, true, -777988087))
                    plane++;
                if (plane >= 512)
                    return;
            }
        }
    }

}
