package com.jagex;/* Class_xa - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class FloorToolkit {
    public int anInt6286;
    public int anInt6287;
    public int anInt6288;
    public int anInt6289;
    public int[][] anIntArrayArray6290;

    FloorToolkit(int i, int i_61_, int i_62_, int[][] is) {
        anInt6287 = -1455578863 * i;
        anInt6286 = i_61_ * 1046617063;
        int i_63_ = 0;
        for (; i_62_ > 1; i_62_ >>= 1)
            i_63_++;
        anInt6288 = (1 << i_63_) * 1080291349;
        anInt6289 = i_63_ * -816104135;
        anIntArrayArray6290 = is;
    }

    public abstract void LA(int i, int i_3_, int i_4_);

    public abstract void method6335(int i, int i_5_, int[] is, int[] is_6_, int[] is_7_, int[] is_8_, int[] is_9_, int[] is_10_, int[] is_11_, int[] is_12_, Class78 class78, boolean bool);

    public abstract void method6336(int i, int i_13_, int[] is, int[] is_14_, int[] is_15_, int[] is_16_, int[] is_17_, int[] is_18_, int[] is_19_, int[] is_20_, int[] is_21_, int[] is_22_, int[] is_23_, Class78 class78, boolean bool);

    public abstract void method6338(int i, int i_35_, int i_36_, boolean[][] bools, boolean bool, int i_37_);

    public abstract void method6339(int i, int i_38_, int i_39_, int i_40_, int i_41_, int i_42_, int i_43_, boolean[][] bools);

    public final int method6340(int i, int i_44_) {
        int i_46_ = i >> -2137349879 * anInt6289;
        int i_47_ = i_44_ >> -2137349879 * anInt6289;
        if (i_46_ < 0 || i_47_ < 0 || i_46_ > anInt6287 * -506105871 - 1 || i_47_ > anInt6286 * -1148794921 - 1)
            return 0;
        int i_48_ = i & anInt6288 * -1212653763 - 1;
        int i_49_ = i_44_ & anInt6288 * -1212653763 - 1;
        int i_50_ = ((((anInt6288 * -1212653763 - i_48_) * anIntArrayArray6290[i_46_][i_47_]) + i_48_ * anIntArrayArray6290[i_46_ + 1][i_47_]) >> anInt6289 * -2137349879);
        int i_51_ = ((i_48_ * anIntArrayArray6290[1 + i_46_][1 + i_47_] + ((anInt6288 * -1212653763 - i_48_) * anIntArrayArray6290[i_46_][i_47_ + 1])) >> anInt6289 * -2137349879);
        return (i_50_ * (anInt6288 * -1212653763 - i_49_) + i_51_ * i_49_ >> anInt6289 * -2137349879);
    }

    public final int method6341(int i, int i_52_) {
        return anIntArrayArray6290[i][i_52_];
    }

    public abstract Class_na w(int i, int i_54_, Class_na class_na);

    public abstract void UA(Class_na class_na, int i, int i_55_, int i_56_, int i_57_, boolean bool);

    public abstract void NA(Class_na class_na, int i, int i_58_, int i_59_, int i_60_, boolean bool);

    public abstract void method6342(Light light, int[] is);

    public abstract void SA();

    public abstract boolean method6353(Class_na class_na, int i, int i_129_, int i_130_, int i_131_, boolean bool);

}
