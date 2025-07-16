package com.jagex;

/**
 * Created by Krimsonowl on 8/11/2017.
 */
public class StaticMethods5 {
    public static FontManager fonts;

    public static void method1755(SpriteToolkit[] spriteToolkits) {
        Skybox.anInt2964 = -1283115375 * spriteToolkits.length;
        Class436.aClass57Array5501 = new SpriteToolkit[Skybox.anInt2964 * -232961423 + 10];
        StaticMethods.anIntArray8372 = new int[-232961423 * Skybox.anInt2964 + 10];
        System.arraycopy(spriteToolkits, 0, Class436.aClass57Array5501, 0, -232961423 * Skybox.anInt2964);
        for (int index = 0; index < -232961423 * Skybox.anInt2964; index++)
            StaticMethods.anIntArray8372[index] = Class436.aClass57Array5501[index].getPaddedHeight();
        for (int index = Skybox.anInt2964 * -232961423; index < Class436.aClass57Array5501.length; index++)
            StaticMethods.anIntArray8372[index] = 12;
    }
}
