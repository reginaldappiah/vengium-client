package com.jagex;/* Class240 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.underlay.UnderlayType;
import com.jagex.game.cache.config.underlay.UnderlayTypeLoader;
import com.jagex.game.settings.SceneryShadowsSettings;

public class Class240 {
    static int[][] anIntArrayArray2634;
    static int[][] anIntArrayArray2638;
    static int[][] anIntArrayArray2649;
    static int[] anIntArray2656;
    static int[] anIntArray2658;
    static int[] anIntArray2659;
    static int[] anIntArray2660;
    static int[] anIntArray2661;
    static int[][] anIntArrayArray2662;
    static int[] anIntArray2663;
    static int[] anIntArray2664;
    static boolean[][] aBooleanArrayArray2665;
    static boolean[][] aBooleanArrayArray2666;
    static int[][] anIntArrayArray2671;
    static int[][] anIntArrayArray2672;
    static int[][] anIntArrayArray2673;
    static int[][] anIntArrayArray2674;
    static boolean[][] aBooleanArrayArray2675;
    static int[][] anIntArrayArray2678;
    static int[][] anIntArrayArray2679;
    static int[][] anIntArrayArray2690;
    static int[] anIntArray2691 = {2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0};
    static boolean[][] aBooleanArrayArray2695;
    static int targetOverCursors;

    static {
        anIntArray2658 = new int[]{0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4};
        anIntArray2659 = new int[]{4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0};
        anIntArray2660 = new int[]{0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4};
        anIntArray2661 = new int[]{4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0};
        anIntArray2656 = new int[]{0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4};
        anIntArray2663 = new int[]{0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256};
        anIntArray2664 = new int[]{0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256};
        aBooleanArrayArray2665 = (new boolean[][]{{true, true, true, true, true, true, true, true, true, true, true, true, true}, {true, true, true, false, false, false, true, true, false, false, false, false, true}, {true, false, false, false, false, true, true, true, false, false, false, false, false}, {false, false, true, true, true, true, false, false, false, false, false, false, false}, {true, true, true, true, true, true, false, false, false, false, false, false, false}, {true, true, true, false, false, true, true, true, false, false, false, false, false}, {true, true, false, false, false, true, true, true, false, false, false, false, true}, {true, true, false, false, false, false, false, true, false, false, false, false, false}, {false, true, true, true, true, true, true, true, false, false, false, false, false}, {true, false, false, false, true, true, true, true, true, true, false, false, false}, {true, true, true, true, true, false, false, false, true, true, false, false, false}, {true, true, true, false, false, false, false, false, false, false, true, true, false}, {false, false, false, false, false, false, false, false, false, false, false, false, false}, {true, true, true, true, true, true, true, true, true, true, true, true, true}, {false, false, false, false, false, false, false, false, false, false, false, false, false}});
        aBooleanArrayArray2666 = (new boolean[][]{{false, false, false, false, false, false, false, false, false, false, false, false, false}, {false, false, true, true, true, true, true, false, false, false, false, false, true}, {true, true, true, true, true, true, false, false, false, false, false, false, false}, {true, true, true, false, false, true, true, true, false, false, false, false, false}, {true, false, false, false, false, true, true, true, false, false, false, false, false}, {false, false, true, true, true, true, false, false, false, false, false, false, false}, {false, true, true, true, true, true, false, false, false, false, false, false, true}, {false, true, true, true, true, true, true, true, false, false, false, false, true}, {true, true, false, false, false, false, false, true, false, false, false, false, false}, {true, true, true, true, true, false, false, false, true, true, false, false, false}, {true, false, false, false, true, true, true, true, true, true, false, false, false}, {true, false, true, true, true, true, true, true, false, false, true, true, false}, {true, true, true, true, true, true, true, true, true, true, true, true, true}, {false, false, false, false, false, false, false, false, false, false, false, false, false}, {true, true, true, true, true, true, true, true, true, true, true, true, true}});
        anIntArrayArray2638 = new int[][]{{0, 2}, {0, 2}, {0, 0, 2}, {2, 0, 0}, {0, 2, 0}, {0, 0, 2}, {0, 5, 1, 4}, {0, 4, 4, 4}, {4, 4, 4, 0}, {6, 6, 6, 2, 2, 2}, {2, 2, 2, 6, 6, 6}, {0, 11, 6, 6, 6, 4}, {0, 2}, {0, 4, 4, 4}, {0, 4, 4, 4}};
        anIntArrayArray2690 = new int[][]{{2, 4}, {2, 4}, {5, 2, 4}, {4, 5, 2}, {2, 4, 5}, {5, 2, 4}, {1, 6, 2, 5}, {1, 6, 7, 1}, {6, 7, 1, 1}, {0, 8, 9, 8, 9, 4}, {8, 9, 4, 0, 8, 9}, {2, 10, 0, 10, 11, 11}, {2, 4}, {1, 6, 7, 1}, {1, 6, 7, 1}};
        anIntArrayArray2634 = new int[][]{{6, 6}, {6, 6}, {6, 5, 5}, {5, 6, 5}, {5, 5, 6}, {6, 5, 5}, {5, 0, 4, 1}, {7, 7, 1, 2}, {7, 1, 2, 7}, {8, 9, 4, 0, 8, 9}, {0, 8, 9, 8, 9, 4}, {11, 0, 10, 11, 4, 2}, {6, 6}, {7, 7, 1, 2}, {7, 7, 1, 2}};
        aBooleanArrayArray2695 = (new boolean[][]{{false, false, false, false}, {false, false, false, false}, {false, false, true, false}, {false, false, true, false}, {false, false, true, false}, {false, false, true, false}, {true, false, true, false}, {true, false, false, true}, {true, false, false, true}, {false, false, false, false}, {false, false, false, false}, {false, false, false, false}, {false, false, false, false}});
        anIntArrayArray2671 = new int[][]{{0, 1, 2, 3}, {1, 2, 3, 0}, {1, 2, -1, 0}, {2, 0, -1, 1}, {0, 1, -1, 2}, {1, 2, -1, 0}, {-1, 4, -1, 1}, {-1, 1, 3, -1}, {-1, 0, 2, -1}, {3, 5, 2, 0}, {0, 2, 5, 3}, {0, 2, 3, 5}, {0, 1, 2, 3}};
        anIntArrayArray2672 = (new int[][]{{0, 2, 4, 6}, {6, 0, 2, 4}, {6, 0, 2}, {2, 6, 0}, {0, 2, 6}, {6, 0, 2}, {5, 6, 0, 1, 2, 4}, {7, 2, 4, 4}, {2, 4, 4, 7}, {6, 6, 4, 0, 2, 2}, {0, 2, 2, 6, 6, 4}, {0, 2, 2, 4, 6, 6}, {0, 2, 4, 6}});
        anIntArrayArray2673 = new int[][]{{2, 4, 6, 0}, {0, 2, 4, 6}, {0, 2, 4}, {4, 0, 2}, {2, 4, 0}, {0, 2, 4}, {6, 0, 1, 2, 4, 5}, {0, 4, 7, 6}, {4, 7, 6, 0}, {0, 8, 6, 2, 9, 4}, {2, 9, 4, 0, 8, 6}, {2, 11, 4, 6, 10, 0}, {2, 4, 6, 0}};
        anIntArrayArray2674 = new int[][]{{12, 12, 12, 12}, {12, 12, 12, 12}, {5, 5, 5}, {5, 5, 5}, {5, 5, 5}, {5, 5, 5}, {12, 12, 12, 12, 12, 12}, {1, 1, 1, 7}, {1, 1, 7, 1}, {8, 9, 9, 8, 8, 9}, {8, 8, 9, 8, 9, 9}, {10, 10, 11, 11, 11, 10}, {12, 12, 12, 12}};
        aBooleanArrayArray2675 = (new boolean[][]{{false, false, false, false}, {false, true, true, false}, {true, false, true, false}, {true, false, true, false}, {false, false, true, false}, {false, false, true, false}, {true, false, true, false}, {true, false, false, true}, {true, false, false, true}, {true, true, false, false}, {false, false, false, false}, {false, true, false, true}, {false, false, false, false}});
        anIntArrayArray2662 = new int[][]{{0, 1, 2, 3}, {1, -1, -1, 0}, {-1, 2, -1, 0}, {-1, 0, -1, 2}, {0, 1, -1, 2}, {1, 2, -1, 0}, {-1, 4, -1, 1}, {-1, 3, 4, -1}, {-1, 0, 2, -1}, {-1, -1, 2, 0}, {0, 2, 5, 3}, {0, -1, 6, -1}, {0, 1, 2, 3}};
        anIntArrayArray2649 = new int[][]{{0, 2, 4, 6}, {6, 0, 2, 3, 5, 3}, {6, 0, 2, 4}, {2, 5, 6, 1}, {0, 2, 6}, {6, 0, 2}, {5, 6, 0, 1, 2, 4}, {7, 7, 1, 2, 4, 6}, {2, 4, 4, 7}, {6, 6, 4, 0, 1, 1, 3, 3}, {0, 2, 2, 6, 6, 4}, {0, 2, 2, 3, 7, 0, 4, 3}, {0, 2, 4, 6}};
        anIntArrayArray2678 = new int[][]{{2, 4, 6, 0}, {0, 2, 3, 5, 6, 4}, {0, 1, 4, 5}, {4, 6, 0, 2}, {2, 4, 0}, {0, 2, 4}, {6, 0, 1, 2, 4, 5}, {0, 1, 2, 4, 6, 7}, {4, 7, 6, 0}, {0, 8, 6, 1, 9, 2, 9, 4}, {2, 9, 4, 0, 8, 6}, {2, 11, 3, 7, 10, 10, 6, 6}, {2, 4, 6, 0}};
        anIntArrayArray2679 = new int[][]{{12, 12, 12, 12}, {12, 12, 12, 12, 12, 5}, {5, 5, 1, 1}, {5, 1, 1, 5}, {5, 5, 5}, {5, 5, 5}, {12, 12, 12, 12, 12, 12}, {1, 12, 12, 12, 12, 12}, {1, 1, 7, 1}, {8, 9, 9, 8, 8, 3, 1, 9}, {8, 8, 9, 8, 9, 9}, {10, 10, 11, 11, 11, 7, 3, 7}, {12, 12, 12, 12}};
    }

    public int sceneryShadowsValue = 0;
    public boolean waterValue = false;
    public boolean groundBlendingValue;
    public boolean textureValue;
    public int anInt2626;
    public boolean underwater;
    public byte[][][] aByteArrayArrayArray2631;
    public int[][][] anIntArrayArrayArray2653;
    public boolean lightingValue = false;
    protected Region aClass331_2619;
    protected int anInt2627;
    protected int anInt2628;
    protected boolean aBoolean2632;
    protected Class244 aClass244_2635;
    protected byte[][][] aByteArrayArrayArray2637;
    UnderlayTypeLoader aClass451_2617;
    int[] anIntArray2618;
    int[] anIntArray2623;
    byte[][][] overlayHash;
    int[] anIntArray2639;
    int[] anIntArray2640;
    int[] anIntArray2641;
    int[] anIntArray2642;
    int[] anIntArray2647;
    OverlayDefinitionLoader overlayDefinitionLoader;
    byte[][][] aByteArrayArrayArray2668;
    int[] anIntArray2669;
    byte[][][] underlayHash;
    boolean aBoolean2676;
    boolean aBoolean2677;
    int[] anIntArray2680;
    int[] anIntArray2681;
    int[] anIntArray2682;
    int[] anIntArray2683;
    int[] anIntArray2684;
    int anInt2685;
    int[] anIntArray2686;
    int anInt2687;
    int anInt2688;
    int anInt2689;
    int anInt2692;
    int anInt2693;
    boolean aBoolean2694;
    boolean aBoolean2696;
    byte[][][] aByteArrayArrayArray2698;
    int anInt2699;
    int[] anIntArray2700;
    int anInt2701;
    int[] anIntArray2702;
    int anInt2703;

    Class240(Region class331, int i, int i_342_, int i_343_, boolean bool, OverlayDefinitionLoader overlayDefinitionLoader, UnderlayTypeLoader underlayTypeLoader, Class244 class244) {
        groundBlendingValue = false;
        textureValue = false;
        this.anIntArray2680 = new int[6];
        this.anIntArray2681 = new int[13];
        this.anIntArray2682 = new int[13];
        this.anIntArray2683 = new int[13];
        this.anIntArray2684 = new int[13];
        this.anIntArray2647 = new int[13];
        this.anIntArray2686 = new int[13];
        this.anInt2689 = 0;
        this.anInt2685 = 0;
        this.anIntArray2618 = null;
        aClass331_2619 = class331;
        anInt2626 = 142248255 * i;
        anInt2627 = i_342_ * 325279097;
        anInt2628 = i_343_ * 2072446815;
        underwater = bool;
        this.overlayDefinitionLoader = overlayDefinitionLoader;
        this.aClass451_2617 = underlayTypeLoader;
        aClass244_2635 = class244;
        this.underlayHash = (new byte[anInt2626 * 1551623871][anInt2627 * -954368823][181474463 * anInt2628]);
        this.overlayHash = (new byte[1551623871 * anInt2626][-954368823 * anInt2627][181474463 * anInt2628]);
        this.aByteArrayArrayArray2698 = (new byte[1551623871 * anInt2626][-954368823 * anInt2627][anInt2628 * 181474463]);
        this.aByteArrayArrayArray2668 = (new byte[anInt2626 * 1551623871][-954368823 * anInt2627][181474463 * anInt2628]);
        anIntArrayArrayArray2653 = (new int[anInt2626 * 1551623871][anInt2627 * -954368823 + 1][181474463 * anInt2628 + 1]);
        aByteArrayArrayArray2637 = (new byte[1551623871 * anInt2626][1 + -954368823 * anInt2627][181474463 * anInt2628 + 1]);
    }

    public static int method2233(int i, int i_487_, int i_488_, short i_489_) {
        try {
            i_488_ &= 0x3;
            if (0 == i_488_)
                return i_487_;
            if (i_488_ == 1)
                return 4095 - i;
            if (i_488_ == 2)
                return 4095 - i_487_;
            return i;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("kb.p(").append(')').toString());
        }
    }

    public final void method2211(int i, int[][] is, int i_0_) {
        try {
            int[][] is_1_ = anIntArrayArrayArray2653[i];
            for (int i_2_ = 0; i_2_ < anInt2627 * -954368823 + 1; i_2_++) {
                for (int i_3_ = 0; i_3_ < 1 + anInt2628 * 181474463; i_3_++)
                    is_1_[i_2_][i_3_] += is[i_2_][i_3_];
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("kb.u(").append(')').toString());
        }
    }

    public void method2212(int i) {
        try {
            aBoolean2632 = true;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("kb.a(").append(')').toString());
        }
    }

    public final void method2213(int i, int i_4_, int i_5_, int i_6_, byte i_7_) {
        try {
            for (int i_8_ = 0; i_8_ < anInt2626 * 1551623871; i_8_++)
                method2214(i_8_, i, i_4_, i_5_, i_6_, -994484260);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("kb.b(").append(')').toString());
        }
    }

    public final void method2214(int i, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_) {
        try {
            for (int i_14_ = i_10_; i_14_ < i_12_ + i_10_; i_14_++) {
                for (int i_15_ = i_9_; i_15_ < i_11_ + i_9_; i_15_++) {
                    if (i_15_ >= 0 && i_15_ < anInt2627 * -954368823 && i_14_ >= 0 && i_14_ < anInt2628 * 181474463)
                        anIntArrayArrayArray2653[i][i_15_][i_14_] = i > 0 ? (anIntArrayArrayArray2653[i - 1][i_15_][i_14_]) - 960 : 0;
                }
            }
            if (i_9_ > 0 && i_9_ < anInt2627 * -954368823) {
                for (int i_16_ = 1 + i_10_; i_16_ < i_10_ + i_12_; i_16_++) {
                    if (i_16_ >= 0 && i_16_ < 181474463 * anInt2628)
                        anIntArrayArrayArray2653[i][i_9_][i_16_] = anIntArrayArrayArray2653[i][i_9_ - 1][i_16_];
                }
            }
            if (i_10_ > 0 && i_10_ < 181474463 * anInt2628) {
                for (int i_17_ = 1 + i_9_; i_17_ < i_11_ + i_9_; i_17_++) {
                    if (i_17_ >= 0 && i_17_ < -954368823 * anInt2627)
                        anIntArrayArrayArray2653[i][i_17_][i_10_] = anIntArrayArrayArray2653[i][i_17_][i_10_ - 1];
                }
            }
            if (i_9_ >= 0 && i_10_ >= 0 && i_9_ < anInt2627 * -954368823 && i_10_ < anInt2628 * 181474463) {
                if (i == 0) {
                    if (i_9_ > 0 && anIntArrayArrayArray2653[i][i_9_ - 1][i_10_] != 0)
                        anIntArrayArrayArray2653[i][i_9_][i_10_] = anIntArrayArrayArray2653[i][i_9_ - 1][i_10_];
                    else if (i_10_ > 0 && 0 != (anIntArrayArrayArray2653[i][i_9_][i_10_ - 1]))
                        anIntArrayArrayArray2653[i][i_9_][i_10_] = anIntArrayArrayArray2653[i][i_9_][i_10_ - 1];
                    else if (i_9_ > 0 && i_10_ > 0 && 0 != (anIntArrayArrayArray2653[i][i_9_ - 1][i_10_ - 1]))
                        anIntArrayArrayArray2653[i][i_9_][i_10_] = anIntArrayArrayArray2653[i][i_9_ - 1][i_10_ - 1];
                } else if (i_9_ > 0 && (anIntArrayArrayArray2653[i][i_9_ - 1][i_10_] != (anIntArrayArrayArray2653[i - 1][i_9_ - 1][i_10_])))
                    anIntArrayArrayArray2653[i][i_9_][i_10_] = anIntArrayArrayArray2653[i][i_9_ - 1][i_10_];
                else if (i_10_ > 0 && (anIntArrayArrayArray2653[i][i_9_][i_10_ - 1] != (anIntArrayArrayArray2653[i - 1][i_9_][i_10_ - 1])))
                    anIntArrayArrayArray2653[i][i_9_][i_10_] = anIntArrayArrayArray2653[i][i_9_][i_10_ - 1];
                else if (i_9_ > 0 && i_10_ > 0 && (anIntArrayArrayArray2653[i][i_9_ - 1][i_10_ - 1] != (anIntArrayArrayArray2653[i - 1][i_9_ - 1][i_10_ - 1])))
                    anIntArrayArrayArray2653[i][i_9_][i_10_] = anIntArrayArrayArray2653[i][i_9_ - 1][i_10_ - 1];
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("kb.p(").append(')').toString());
        }
    }

    public final void method2215(Buffer buffer, int i, int i_18_, int i_19_, int i_20_, Class289[] class289s, int i_21_) {
        try {
            if (!underwater) {
                for (int i_22_ = 0; i_22_ < 4; i_22_++) {
                    Class289 class289 = class289s[i_22_];
                    for (int i_23_ = 0; i_23_ < 64; i_23_++) {
                        for (int i_24_ = 0; i_24_ < 64; i_24_++) {
                            int i_25_ = i + i_23_;
                            int i_26_ = i_24_ + i_18_;
                            if (i_25_ >= 0 && i_25_ < -954368823 * anInt2627 && i_26_ >= 0 && i_26_ < anInt2628 * 181474463)
                                class289.method2744(i_25_, i_26_, -1001372278);
                        }
                    }
                }
            }
            int i_27_ = i + i_19_;
            int i_28_ = i_20_ + i_18_;
            for (int i_29_ = 0; i_29_ < anInt2626 * 1551623871; i_29_++) {
                for (int i_30_ = 0; i_30_ < 64; i_30_++) {
                    for (int i_31_ = 0; i_31_ < 64; i_31_++)
                        method2228(buffer, i_29_, i_30_ + i, i_18_ + i_31_, 0, 0, i_30_ + i_27_, i_28_ + i_31_, 0, false, -2042161970);
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("kb.i(").append(')').toString());
        }
    }

    public final void method2216(Buffer class298_sub53, int i, int i_32_, int i_33_, int i_34_, int i_35_, int i_36_, int i_37_, Class289[] class289s, int i_38_) {
        try {
            int i_39_ = (i_35_ & 0x7) * 8;
            int i_40_ = 8 * (i_36_ & 0x7);
            if (!underwater) {
                Class289 class289 = class289s[i];
                for (int i_41_ = 0; i_41_ < 8; i_41_++) {
                    for (int i_42_ = 0; i_42_ < 8; i_42_++) {
                        int i_43_ = (i_32_ + CS2CallStackEntry.method4941(i_41_ & 0x7, i_42_ & 0x7, i_37_, -1280307862));
                        int i_44_ = (i_33_ + Class472.method6064(i_41_ & 0x7, i_42_ & 0x7, i_37_, (byte) -111));
                        if (i_43_ > 0 && i_43_ < anInt2627 * -954368823 - 1 && i_44_ > 0 && i_44_ < 181474463 * anInt2628 - 1)
                            class289.method2744(i_43_, i_44_, -1032370407);
                    }
                }
            }
            int i_45_ = (i_35_ & ~0x7) << 3;
            int i_46_ = (i_36_ & ~0x7) << 3;
            int i_47_ = 0;
            int i_48_ = 0;
            if (1 == i_37_)
                i_48_ = 1;
            else if (2 == i_37_) {
                i_47_ = 1;
                i_48_ = 1;
            } else if (i_37_ == 3)
                i_47_ = 1;
            for (int i_49_ = 0; i_49_ < 1551623871 * anInt2626; i_49_++) {
                for (int i_50_ = 0; i_50_ < 64; i_50_++) {
                    for (int i_51_ = 0; i_51_ < 64; i_51_++) {
                        if (i_49_ == i_34_ && i_50_ >= i_39_ && i_50_ <= i_39_ + 8 && i_51_ >= i_40_ && i_51_ <= i_40_ + 8) {
                            int i_52_;
                            int i_53_;
                            if (i_50_ == 8 + i_39_ || 8 + i_40_ == i_51_) {
                                if (0 == i_37_) {
                                    i_52_ = i_32_ + (i_50_ - i_39_);
                                    i_53_ = i_33_ + (i_51_ - i_40_);
                                } else if (1 == i_37_) {
                                    i_52_ = i_32_ + (i_51_ - i_40_);
                                    i_53_ = i_33_ + 8 - (i_50_ - i_39_);
                                } else if (2 == i_37_) {
                                    i_52_ = i_32_ + 8 - (i_50_ - i_39_);
                                    i_53_ = 8 + i_33_ - (i_51_ - i_40_);
                                } else {
                                    i_52_ = 8 + i_32_ - (i_51_ - i_40_);
                                    i_53_ = i_33_ + (i_50_ - i_39_);
                                }
                                method2228(class298_sub53, i, i_52_, i_53_, 0, 0, i_45_ + i_50_, i_51_ + i_46_, 0, true, -2042161970);
                            } else {
                                i_52_ = i_32_ + CS2CallStackEntry.method4941(i_50_ & 0x7, i_51_ & 0x7, i_37_, -1280307862);
                                i_53_ = i_33_ + Class472.method6064(i_50_ & 0x7, i_51_ & 0x7, i_37_, (byte) -33);
                                method2228(class298_sub53, i, i_52_, i_53_, i_47_, i_48_, i_50_ + i_45_, i_51_ + i_46_, i_37_, false, -2042161970);
                            }
                            if (63 == i_50_ || 63 == i_51_) {
                                int i_54_ = 1;
                                if (i_50_ == 63 && i_51_ == 63)
                                    i_54_ = 3;
                                for (int i_55_ = 0; i_55_ < i_54_; i_55_++) {
                                    int i_56_ = i_50_;
                                    int i_57_ = i_51_;
                                    if (0 == i_55_) {
                                        i_56_ = i_50_ == 63 ? 64 : i_50_;
                                        i_57_ = 63 == i_51_ ? 64 : i_51_;
                                    } else if (1 == i_55_)
                                        i_56_ = 64;
                                    else if (2 == i_55_)
                                        i_57_ = 64;
                                    int i_58_;
                                    int i_59_;
                                    if (i_37_ == 0) {
                                        i_58_ = i_32_ + (i_56_ - i_39_);
                                        i_59_ = i_33_ + (i_57_ - i_40_);
                                    } else if (i_37_ == 1) {
                                        i_58_ = i_57_ - i_40_ + i_32_;
                                        i_59_ = 8 + i_33_ - (i_56_ - i_39_);
                                    } else if (2 == i_37_) {
                                        i_58_ = i_32_ + 8 - (i_56_ - i_39_);
                                        i_59_ = i_33_ + 8 - (i_57_ - i_40_);
                                    } else {
                                        i_58_ = i_32_ + 8 - (i_57_ - i_40_);
                                        i_59_ = i_33_ + (i_56_ - i_39_);
                                    }
                                    if (i_58_ >= 0 && i_58_ < anInt2627 * -954368823 && i_59_ >= 0 && i_59_ < 181474463 * anInt2628)
                                        anIntArrayArrayArray2653[i][i_58_][i_59_] = (anIntArrayArrayArray2653[i][i_52_ + i_47_][i_53_ + i_48_]);
                                }
                            }
                        } else
                            method2228(class298_sub53, 0, -1, -1, 0, 0, 0, 0, 0, false, -2042161970);
                    }
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("kb.k(").append(')').toString());
        }
    }

    public void method2217(int i) {
        try {
            this.anIntArray2669 = null;
            this.anIntArray2639 = null;
            this.anIntArray2640 = null;
            this.anIntArray2641 = null;
            this.anIntArray2642 = null;
            aBoolean2632 = false;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("kb.f(").append(')').toString());
        }
    }

    public void sendLandscapeDrawData(GraphicsToolkit graphicsToolkit, int[][][] is, Class289[] class289s) {
        try {
            if (!underwater) {
                for (int plane = 0; plane < 4; plane++) {
                    for (int x = 0; x < anInt2627 * -954368823; x++) {
                        for (int y = 0; y < anInt2628 * 181474463; y++) {
                            if (((aClass244_2635.flags[plane][x][y]) & 0x1) != 0) {
                                int level = plane;
                                if (((aClass244_2635.flags[1][x][y]) & 0x2) != 0)
                                    level--;
                                if (level >= 0)
                                    class289s[level].method2733(x, y);
                            }
                        }
                    }
                }
            }
            for (int i_64_ = 0; i_64_ < 1551623871 * anInt2626; i_64_++) {
                int i_65_ = 0;
                int i_66_ = 0;
                if (!underwater) {
                    if (waterValue)
                        i_66_ |= 0x8;
                    if (lightingValue)
                        i_65_ |= 0x2;
                    if (917702315 * sceneryShadowsValue != SceneryShadowsSettings.NONE) {
                        i_65_ |= 0x1;
                        i_66_ |= 0x10;
                    }
                }
                if (lightingValue)
                    i_66_ |= 0x7;
                if (!textureValue)
                    i_66_ |= 0x20;
                int[][] is_67_ = (null != is && i_64_ < is.length ? is[i_64_] : anIntArrayArrayArray2653[i_64_]);
                aClass331_2619.method4056(i_64_, graphicsToolkit.createLandScapeRenderer(anInt2627 * -954368823, 181474463 * anInt2628, anIntArrayArrayArray2653[i_64_], is_67_, 512, i_65_, i_66_), (byte) 32);
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, "Error creating landscape");
        }
    }

    public final void method2219(GraphicsToolkit class_ra, FloorToolkit class_xa, FloorToolkit class_xa_68_, byte i) {
        try {
            int[][] is = new int[anInt2627 * -954368823][181474463 * anInt2628];
            if (null == this.anIntArray2669 || (this.anIntArray2669.length != 181474463 * anInt2628)) {
                this.anIntArray2669 = new int[181474463 * anInt2628];
                this.anIntArray2639 = new int[anInt2628 * 181474463];
                this.anIntArray2640 = new int[181474463 * anInt2628];
                this.anIntArray2641 = new int[anInt2628 * 181474463];
                this.anIntArray2642 = new int[181474463 * anInt2628];
            }
            for (int i_69_ = 0; i_69_ < 1551623871 * anInt2626; i_69_++) {
                for (int i_70_ = 0; i_70_ < anInt2628 * 181474463; i_70_++) {
                    this.anIntArray2669[i_70_] = 0;
                    this.anIntArray2639[i_70_] = 0;
                    this.anIntArray2640[i_70_] = 0;
                    this.anIntArray2641[i_70_] = 0;
                    this.anIntArray2642[i_70_] = 0;
                }
                for (int i_71_ = -5; i_71_ < anInt2627 * -954368823; i_71_++) {
                    for (int i_72_ = 0; i_72_ < anInt2628 * 181474463; i_72_++) {
                        int i_73_ = 5 + i_71_;
                        if (i_73_ < anInt2627 * -954368823) {
                            int i_74_ = ((this.underlayHash[i_69_][i_73_][i_72_]) & 0xff);
                            if (i_74_ > 0) {
                                UnderlayType underlayType = this.aClass451_2617.load(i_74_ - 1);
                                this.anIntArray2669[i_72_] += underlayType.hue * 838046775;
                                this.anIntArray2639[i_72_] += -620399085 * underlayType.saturation;
                                this.anIntArray2640[i_72_] += 656695887 * underlayType.lightness;
                                this.anIntArray2641[i_72_] += underlayType.chroma * -813159285;
                                this.anIntArray2642[i_72_]++;
                            }
                        }
                        int i_75_ = i_71_ - 5;
                        if (i_75_ >= 0) {
                            int i_76_ = ((this.underlayHash[i_69_][i_75_][i_72_]) & 0xff);
                            if (i_76_ > 0) {
                                UnderlayType underlayType = this.aClass451_2617.load(i_76_ - 1);
                                this.anIntArray2669[i_72_] -= underlayType.hue * 838046775;
                                this.anIntArray2639[i_72_] -= -620399085 * underlayType.saturation;
                                this.anIntArray2640[i_72_] -= underlayType.lightness * 656695887;
                                this.anIntArray2641[i_72_] -= underlayType.chroma * -813159285;
                                this.anIntArray2642[i_72_]--;
                            }
                        }
                    }
                    if (i_71_ >= 0) {
                        int i_77_ = 0;
                        int i_78_ = 0;
                        int i_79_ = 0;
                        int i_80_ = 0;
                        int i_81_ = 0;
                        for (int i_82_ = -5; i_82_ < 181474463 * anInt2628; i_82_++) {
                            int i_83_ = 5 + i_82_;
                            if (i_83_ < 181474463 * anInt2628) {
                                i_77_ += this.anIntArray2669[i_83_];
                                i_78_ += this.anIntArray2639[i_83_];
                                i_79_ += this.anIntArray2640[i_83_];
                                i_80_ += this.anIntArray2641[i_83_];
                                i_81_ += this.anIntArray2642[i_83_];
                            }
                            int i_84_ = i_82_ - 5;
                            if (i_84_ >= 0) {
                                i_77_ -= this.anIntArray2669[i_84_];
                                i_78_ -= this.anIntArray2639[i_84_];
                                i_79_ -= this.anIntArray2640[i_84_];
                                i_80_ -= this.anIntArray2641[i_84_];
                                i_81_ -= this.anIntArray2642[i_84_];
                            }
                            if (i_82_ >= 0 && i_80_ > 0 && i_81_ > 0)
                                is[i_71_][i_82_] = Class401.method4933(256 * i_77_ / i_80_, i_78_ / i_81_, i_79_ / i_81_, -1708993857);
                        }
                    }
                }
                if (groundBlendingValue)
                    utilizeGroundBlending(class_ra, aClass331_2619.aClass_xaArray3517[i_69_], i_69_, is, 0 == i_69_ ? class_xa : null, i_69_ == 0 ? class_xa_68_ : null, (byte) 114);
                else
                    omitGroundBlending(aClass331_2619.aClass_xaArray3517[i_69_], i_69_, is, 0 == i_69_ ? class_xa : null, 0 == i_69_ ? class_xa_68_ : null, (byte) -8);
                this.underlayHash[i_69_] = null;
                this.overlayHash[i_69_] = null;
                this.aByteArrayArrayArray2698[i_69_] = null;
                this.aByteArrayArrayArray2668[i_69_] = null;
            }
            if (!underwater) {
                if (917702315 * sceneryShadowsValue != SceneryShadowsSettings.NONE)
                    aClass331_2619.method4024((byte) -114);
                if (lightingValue)
                    aClass331_2619.method4049((byte) -116);
            }
            for (int i_85_ = 0; i_85_ < 1551623871 * anInt2626; i_85_++)
                aClass331_2619.aClass_xaArray3517[i_85_].SA();
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("kb.r(").append(')').toString());
        }
    }

    void omitGroundBlending(FloorToolkit floorToolkit, int plane, int[][] is, FloorToolkit class_xa_86_, FloorToolkit class_xa_87_, byte i_88_) {
        try {
            for (int x = 0; x < -954368823 * anInt2627; x++) {
                for (int y = 0; y < anInt2628 * 181474463; y++) {
                    byte i_91_ = (this.aByteArrayArrayArray2698[plane][x][y]);
                    byte i_92_ = (this.aByteArrayArrayArray2668[plane][x][y]);
                    int overlayID = ((this.overlayHash[plane][x][y]) & 0xFF);
                    int underlayID = ((this.underlayHash[plane][x][y]) & 0xFF);
                    OverlayDefinition overlayDefinition = (overlayID != 0 ? this.overlayDefinitionLoader.getOverlayDefinition(overlayID - 1) : null);
                    UnderlayType underlayType = (underlayID != 0 ? this.aClass451_2617.load(underlayID - 1) : null);
                    if (i_91_ == 0 && null == overlayDefinition)
                        i_91_ = (byte) 12;
                    OverlayDefinition class373_95_ = overlayDefinition;
                    if (overlayDefinition != null && overlayDefinition.color * -45966925 == -1 && -1 == overlayDefinition.blendColor * 1728947183) {
                        class373_95_ = overlayDefinition;
                        overlayDefinition = null;
                    }
                    if (overlayDefinition == null && underlayType == null) {
                        if (i_88_ == 0)
                            throw new IllegalStateException();
                    } else {
                        this.anInt2701 = 989325699 * anIntArray2658[i_91_];
                        this.anInt2699 = anIntArray2691[i_91_] * -786924081;
                        int i_96_ = ((overlayDefinition != null ? 1500080431 * this.anInt2699 : 0) + (underlayType != null ? -299537109 * this.anInt2701 : 0));
                        int i_97_ = 0;
                        this.anInt2688 = 0;
                        this.anInt2703 = ((overlayDefinition != null ? 324071475 * overlayDefinition.texture : -1) * -365069805);
                        int underlayTextureID = (underlayType != null ? underlayType.textureID * 2012295231 : -1);
                        int[] is_99_ = new int[i_96_];
                        int[] is_100_ = new int[i_96_];
                        int[] is_101_ = new int[i_96_];
                        int[] is_102_ = new int[i_96_];
                        int[] is_103_ = new int[i_96_];
                        int[] is_104_ = new int[i_96_];
                        int[] is_105_ = ((null != overlayDefinition && 1728947183 * overlayDefinition.blendColor != -1) ? new int[i_96_] : null);
                        if (overlayDefinition != null) {
                            for (int i_106_ = 0; (i_106_ < 1500080431 * this.anInt2699); i_106_++) {
                                is_99_[i_97_] = (anIntArrayArray2638[i_91_][(this.anInt2688 * -875169383)]);
                                is_100_[i_97_] = (anIntArrayArray2690[i_91_][(this.anInt2688 * -875169383)]);
                                is_101_[i_97_] = (anIntArrayArray2634[i_91_][(this.anInt2688 * -875169383)]);
                                is_103_[i_97_] = this.anInt2703 * 1659854875;
                                is_104_[i_97_] = -1551409901 * overlayDefinition.scale;
                                is_102_[i_97_] = -45966925 * overlayDefinition.color;
                                if (is_105_ != null)
                                    is_105_[i_97_] = overlayDefinition.blendColor * 1728947183;
                                i_97_++;
                                this.anInt2688 += -1319613783;
                            }
                            if (!underwater && 0 == plane)
                                aClass331_2619.method4019(x, y, 1987637503 * overlayDefinition.waterColor, 1104862312 * overlayDefinition.waterScale, 2077360047 * overlayDefinition.waterIntensity, overlayDefinition.anInt4067 * -986621081, overlayDefinition.anInt4068 * 171987805, -589660893 * overlayDefinition.anInt4069);
                        } else
                            this.anInt2688 += 640026119 * this.anInt2699;
                        if (underlayType != null) {
                            for (int i_107_ = 0; (i_107_ < this.anInt2701 * -299537109); i_107_++) {
                                is_99_[i_97_] = (anIntArrayArray2638[i_91_][(this.anInt2688 * -875169383)]);
                                is_100_[i_97_] = (anIntArrayArray2690[i_91_][(this.anInt2688 * -875169383)]);
                                is_101_[i_97_] = (anIntArrayArray2634[i_91_][(this.anInt2688 * -875169383)]);
                                is_103_[i_97_] = underlayTextureID;
                                is_104_[i_97_] = -1106852061 * underlayType.textureSize;
                                is_102_[i_97_] = is[x][y];
                                if (null != is_105_)
                                    is_105_[i_97_] = is_102_[i_97_];
                                i_97_++;
                                this.anInt2688 += -1319613783;
                            }
                        }
                        int i_108_ = anIntArray2663.length;
                        int[] is_109_ = new int[i_108_];
                        int[] is_110_ = new int[i_108_];
                        int[] is_111_ = null != class_xa_87_ ? new int[i_108_] : null;
                        int[] is_112_ = (class_xa_87_ != null || null != class_xa_86_ ? new int[i_108_] : null);
                        for (int i_113_ = 0; i_113_ < i_108_; i_113_++) {
                            int i_114_ = anIntArray2663[i_113_];
                            int i_115_ = anIntArray2664[i_113_];
                            if (0 == i_92_) {
                                is_109_[i_113_] = i_114_;
                                is_110_[i_113_] = i_115_;
                            } else if (i_92_ == 1) {
                                int i_116_ = i_114_;
                                is_109_[i_113_] = i_115_;
                                is_110_[i_113_] = 512 - i_116_;
                            } else if (i_92_ == 2) {
                                is_109_[i_113_] = 512 - i_114_;
                                is_110_[i_113_] = 512 - i_115_;
                            } else if (3 == i_92_) {
                                int i_117_ = i_114_;
                                is_109_[i_113_] = 512 - i_115_;
                                is_110_[i_113_] = i_117_;
                            }
                            if (is_111_ != null && aBooleanArrayArray2665[i_91_][i_113_]) {
                                int i_118_ = (x << 9) + is_109_[i_113_];
                                int i_119_ = (y << 9) + is_110_[i_113_];
                                is_111_[i_113_] = (class_xa_87_.method6340(i_118_, i_119_) - floorToolkit.method6340(i_118_, i_119_));
                            }
                            if (is_112_ != null) {
                                if (null != class_xa_87_ && !(aBooleanArrayArray2665[i_91_][i_113_])) {
                                    int i_120_ = is_109_[i_113_] + (x << 9);
                                    int i_121_ = (y << 9) + is_110_[i_113_];
                                    is_112_[i_113_] = (floorToolkit.method6340(i_120_, i_121_) - (class_xa_87_.method6340(i_120_, i_121_)));
                                } else if (null != class_xa_86_ && !(aBooleanArrayArray2666[i_91_][i_113_])) {
                                    int i_122_ = is_109_[i_113_] + (x << 9);
                                    int i_123_ = is_110_[i_113_] + (y << 9);
                                    is_112_[i_113_] = (class_xa_86_.method6340(i_122_, i_123_) - floorToolkit.method6340(i_122_, i_123_));
                                }
                            }
                        }
                        int i_124_ = floorToolkit.method6341(x, y);
                        int i_125_ = floorToolkit.method6341(1 + x, y);
                        int i_126_ = floorToolkit.method6341(1 + x, y + 1);
                        int i_127_ = floorToolkit.method6341(x, 1 + y);
                        boolean bool = aClass244_2635.method2320(x, y);
                        if (bool && plane > 1 || !bool && plane > 0) {
                            boolean bool_128_ = true;
                            if (underlayType != null && !underlayType.aBoolean5596)
                                bool_128_ = false;
                            else if (0 == underlayID && 0 != i_91_)
                                bool_128_ = false;
                            else if (overlayID > 0 && class373_95_ != null && !class373_95_.aBoolean4062)
                                bool_128_ = false;
                            if (bool_128_ && i_125_ == i_124_ && i_124_ == i_126_ && i_127_ == i_124_)
                                aByteArrayArrayArray2637[plane][x][y] |= 0x4;
                        }
                        Class78 class78 = new Class78();
                        if (underwater) {
                            class78.anInt726 = (aClass331_2619.method4015(x, y, (byte) 76) * 614121861);
                            class78.anInt725 = (aClass331_2619.method4014(x, y, (byte) 47) * -885436027);
                            class78.anInt727 = (aClass331_2619.method4016(x, y, (byte) -105) * 399458545);
                            class78.anInt729 = (aClass331_2619.method4017(x, y, (byte) 90) * 1507836083);
                            class78.anInt730 = (aClass331_2619.method4060(x, y) * -1927451111);
                            class78.anInt732 = (aClass331_2619.method4018(x, y, -1965414520) * -875460563);
                        }
                        floorToolkit.method6336(x, y, is_109_, is_111_, is_110_, is_112_, is_99_, is_100_, is_101_, is_102_, is_105_, is_103_, is_104_, class78, false);
                        aClass331_2619.method4013(plane, x, y);
                    }
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("kb.q(").append(')').toString());
        }
    }

    void utilizeGroundBlending(GraphicsToolkit graphicsToolkit, FloorToolkit floorToolkit, int i, int[][] is, FloorToolkit class_xa_129_, FloorToolkit class_xa_130_, byte i_131_) {
        try {
            byte[][] is_132_ = this.aByteArrayArrayArray2698[i];
            byte[][] is_133_ = this.aByteArrayArrayArray2668[i];
            byte[][] is_134_ = this.underlayHash[i];
            byte[][] is_135_ = this.overlayHash[i];
            boolean[] bools = new boolean[4];
            for (int i_136_ = 0; i_136_ < -954368823 * anInt2627; i_136_++) {
                int i_137_ = (i_136_ < anInt2627 * -954368823 - 1 ? 1 + i_136_ : i_136_);
                for (int i_138_ = 0; i_138_ < anInt2628 * 181474463; i_138_++) {
                    int i_139_ = (i_138_ < 181474463 * anInt2628 - 1 ? i_138_ + 1 : i_138_);
                    this.anInt2687 = is_132_[i_136_][i_138_] * 1375153633;
                    this.anInt2688 = -1319613783 * is_133_[i_136_][i_138_];
                    int overlayID = is_135_[i_136_][i_138_] & 0xff;
                    int underlayID = is_134_[i_136_][i_138_] & 0xff;
                    if (overlayID == 0 && 0 == underlayID) {
                        if (i_131_ <= -1)
                            return;
                    } else {
                        OverlayDefinition overlayDefinition = (0 != overlayID ? this.overlayDefinitionLoader.getOverlayDefinition(overlayID - 1) : null);
                        UnderlayType underlayType = (underlayID != 0 ? this.aClass451_2617.load(underlayID - 1) : null);
                        if (-1377184223 * this.anInt2687 == 0 && overlayDefinition == null)
                            this.anInt2687 = -678025588;
                        this.aBoolean2694 = false;
                        this.aBoolean2676 = false;
                        boolean[] bools_142_ = bools;
                        boolean[] bools_143_ = bools;
                        boolean[] bools_144_ = bools;
                        bools[3] = false;
                        bools_144_[2] = false;
                        bools_143_[1] = false;
                        bools_142_[0] = false;
                        OverlayDefinition class373_145_ = overlayDefinition;
                        if (null != overlayDefinition) {
                            if (overlayDefinition.color * -45966925 == -1 && overlayDefinition.blendColor * 1728947183 == -1) {
                                class373_145_ = overlayDefinition;
                                overlayDefinition = null;
                            } else if (null != underlayType && (-1377184223 * this.anInt2687) != 0)
                                this.aBoolean2676 = overlayDefinition.aBoolean4063;
                        }
                        this.anInt2688 = method2222(underlayID, i_136_, i_138_, i_137_, i_139_, floorToolkit, is_134_) * -1319613783;
                        for (int i_146_ = 0; i_146_ < 13; i_146_++) {
                            this.anIntArray2647[i_146_] = -1;
                            this.anIntArray2686[i_146_] = 1;
                        }
                        method2223(graphicsToolkit, overlayDefinition, underlayType, i_136_, i_138_, is_132_, is_133_, is_135_, bools);
                        this.aBoolean2696 = (!this.aBoolean2676 && !bools[0] && !bools[2] && !bools[1] && !bools[3]);
                        method2224(overlayDefinition, underlayType);
                        int i_147_ = (-299537109 * this.anInt2701 + 1500080431 * this.anInt2699);
                        if (i_147_ <= 0)
                            aClass331_2619.method4013(i, i_136_, i_138_);
                        else {
                            if (bools[0])
                                i_147_++;
                            if (bools[2])
                                i_147_++;
                            if (bools[1])
                                i_147_++;
                            if (bools[3])
                                i_147_++;
                            this.anInt2689 = 0;
                            this.anInt2685 = 0;
                            int i_148_ = 3 * i_147_;
                            int[] is_149_ = (this.aBoolean2677 ? new int[i_148_] : null);
                            int[] is_150_ = new int[i_148_];
                            int[] is_151_ = new int[i_148_];
                            int[] is_152_ = new int[i_148_];
                            int[] is_153_ = new int[i_148_];
                            int[] is_154_ = new int[i_148_];
                            int[] is_155_ = (class_xa_130_ != null ? new int[i_148_] : null);
                            int[] is_156_ = ((null != class_xa_130_ || class_xa_129_ != null) ? new int[i_148_] : null);
                            method2225(graphicsToolkit, i, i_136_, i_138_, overlayDefinition, bools, is_149_, is_150_, is_151_, is_152_, is_153_, is_154_, is_155_, is_156_, floorToolkit, class_xa_130_, class_xa_129_);
                            int i_157_ = is_134_[i_136_][i_139_] & 0xff;
                            int i_158_ = is_134_[i_137_][i_139_] & 0xff;
                            int i_159_ = is_134_[i_137_][i_138_] & 0xff;
                            method2226(i_136_, i_138_, i_137_, i_139_, underlayType, underlayID, i_157_, i_158_, i_159_, bools, is_149_, is_150_, is_151_, is_152_, is_153_, is_154_, is_155_, is_156_, is, floorToolkit, class_xa_130_, class_xa_129_);
                            method2229(floorToolkit, underlayType, class373_145_, i, i_136_, i_138_, i_137_, i_139_, underlayID, overlayID);
                            Class78 class78 = new Class78();
                            if (underwater) {
                                class78.anInt726 = (aClass331_2619.method4015(i_136_, i_138_, (byte) 60) * 614121861);
                                class78.anInt725 = (aClass331_2619.method4014(i_136_, i_138_, (byte) 89) * -885436027);
                                class78.anInt727 = (aClass331_2619.method4016(i_136_, i_138_, (byte) -43) * 399458545);
                                class78.anInt729 = (aClass331_2619.method4017(i_136_, i_138_, (byte) 2) * 1507836083);
                                class78.anInt730 = (aClass331_2619.method4060(i_136_, i_138_) * -1927451111);
                                class78.anInt732 = (aClass331_2619.method4018(i_136_, i_138_, -1965414520) * -875460563);
                            }
                            floorToolkit.method6335(i_136_, i_138_, is_150_, is_155_, is_151_, is_156_, is_152_, is_149_, is_153_, is_154_, class78, (this.aBoolean2694));
                            aClass331_2619.method4013(i, i_136_, i_138_);
                        }
                    }
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("kb.n(").append(')').toString());
        }
    }

    int method2222(int i, int i_160_, int i_161_, int i_162_, int i_163_, FloorToolkit floorToolkit, byte[][] is) {
        try {
            if ((0 == this.anInt2687 * -1377184223 || 12 == this.anInt2687 * -1377184223) && i_160_ > 0 && i_161_ > 0 && i_160_ < anInt2627 * -954368823 && i_161_ < anInt2628 * 181474463) {
                int i_165_ = 0;
                int i_166_ = 0;
                int i_167_ = 0;
                int i_168_ = 0;
                i_165_ = i_165_ + (i == is[i_160_ - 1][i_161_ - 1] ? 1 : -1);
                i_166_ = i_166_ + (is[i_162_][i_161_ - 1] == i ? 1 : -1);
                i_167_ = i_167_ + (i == is[i_162_][i_163_] ? 1 : -1);
                i_168_ = i_168_ + (i == is[i_160_ - 1][i_163_] ? 1 : -1);
                if (is[i_160_][i_161_ - 1] == i) {
                    i_165_++;
                    i_166_++;
                } else {
                    i_165_--;
                    i_166_--;
                }
                if (i == is[i_162_][i_161_]) {
                    i_166_++;
                    i_167_++;
                } else {
                    i_166_--;
                    i_167_--;
                }
                if (i == is[i_160_][i_163_]) {
                    i_167_++;
                    i_168_++;
                } else {
                    i_167_--;
                    i_168_--;
                }
                if (is[i_160_ - 1][i_161_] == i) {
                    i_168_++;
                    i_165_++;
                } else {
                    i_168_--;
                    i_165_--;
                }
                int i_169_ = i_165_ - i_167_;
                if (i_169_ < 0)
                    i_169_ = -i_169_;
                int i_170_ = i_166_ - i_168_;
                if (i_170_ < 0)
                    i_170_ = -i_170_;
                if (i_169_ == i_170_) {
                    i_169_ = (floorToolkit.method6341(i_160_, i_161_) - floorToolkit.method6341(i_162_, i_163_));
                    if (i_169_ < 0)
                        i_169_ = -i_169_;
                    i_170_ = (floorToolkit.method6341(i_162_, i_161_) - floorToolkit.method6341(i_160_, i_163_));
                    if (i_170_ < 0)
                        i_170_ = -i_170_;
                }
                return i_169_ < i_170_ ? 1 : 0;
            }
            return -875169383 * this.anInt2688;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("kb.s(").append(')').toString());
        }
    }

    void method2223(GraphicsToolkit graphicsToolkit, OverlayDefinition overlayDefinition, UnderlayType underlayType, int i, int i_171_, byte[][] is, byte[][] is_172_, byte[][] is_173_, boolean[] bools) {
        try {
            boolean[] bools_175_ = (overlayDefinition != null && overlayDefinition.aBoolean4063 ? (aBooleanArrayArray2675[-1377184223 * this.anInt2687]) : (aBooleanArrayArray2695[this.anInt2687 * -1377184223]));
            method2227(graphicsToolkit, overlayDefinition, underlayType, i, i_171_, -954368823 * anInt2627, 181474463 * anInt2628, is_173_, is, is_172_, bools, -2064335777);
            this.aBoolean2677 = null != overlayDefinition && (-45966925 * overlayDefinition.color != 1728947183 * overlayDefinition.blendColor);
            if (!this.aBoolean2677) {
                for (int i_176_ = 0; i_176_ < 8; i_176_++) {
                    if (this.anIntArray2647[i_176_] >= 0 && (this.anIntArray2682[i_176_] != this.anIntArray2681[i_176_])) {
                        this.aBoolean2677 = true;
                        break;
                    }
                }
            }
            if (!bools_175_[1 + this.anInt2688 * -875169383 & 0x3]) {
                boolean[] bools_177_ = bools;
                int i_178_ = 1;
                bools_177_[i_178_] = (bools_177_[i_178_] | (this.anIntArray2686[2] & this.anIntArray2686[4]) == 0);
            }
            if (!bools_175_[3 + this.anInt2688 * -875169383 & 0x3]) {
                boolean[] bools_179_ = bools;
                int i_180_ = 3;
                bools_179_[i_180_] = (bools_179_[i_180_] | (this.anIntArray2686[6] & this.anIntArray2686[0]) == 0);
            }
            if (!bools_175_[0 + -875169383 * this.anInt2688 & 0x3]) {
                boolean[] bools_181_ = bools;
                int i_182_ = 0;
                bools_181_[i_182_] = (bools_181_[i_182_] | 0 == (this.anIntArray2686[0] & this.anIntArray2686[2]));
            }
            if (!bools_175_[this.anInt2688 * -875169383 + 2 & 0x3]) {
                boolean[] bools_183_ = bools;
                int i_184_ = 2;
                bools_183_[i_184_] = (bools_183_[i_184_] | (this.anIntArray2686[4] & this.anIntArray2686[6]) == 0);
            }
            if (!this.aBoolean2676 && (this.anInt2687 * -1377184223 == 0 || -1377184223 * this.anInt2687 == 12)) {
                if (bools[0] && !bools[1] && !bools[2] && bools[3]) {
                    boolean[] bools_185_ = bools;
                    bools[3] = false;
                    bools_185_[0] = false;
                    this.anInt2687 = (1375153633 * (0 == this.anInt2687 * -1377184223 ? 13 : 14));
                    this.anInt2688 = 0;
                } else if (bools[0] && bools[1] && !bools[2] && !bools[3]) {
                    boolean[] bools_186_ = bools;
                    bools[1] = false;
                    bools_186_[0] = false;
                    this.anInt2687 = (1375153633 * (0 == -1377184223 * this.anInt2687 ? 13 : 14));
                    this.anInt2688 = 336125947;
                } else if (!bools[0] && bools[1] && bools[2] && !bools[3]) {
                    boolean[] bools_187_ = bools;
                    bools[2] = false;
                    bools_187_[1] = false;
                    this.anInt2687 = (0 == this.anInt2687 * -1377184223 ? 13 : 14) * 1375153633;
                    this.anInt2688 = 1655739730;
                } else if (!bools[0] && !bools[1] && bools[2] && bools[3]) {
                    boolean[] bools_188_ = bools;
                    bools[3] = false;
                    bools_188_[2] = false;
                    this.anInt2687 = (-1377184223 * this.anInt2687 == 0 ? 13 : 14) * 1375153633;
                    this.anInt2688 = -1319613783;
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("kb.z(").append(')').toString());
        }
    }

    void method2224(OverlayDefinition overlayDefinition, UnderlayType underlayType) {
        try {
            if (this.aBoolean2696) {
                this.anIntArray2700 = (anIntArrayArray2638[-1377184223 * this.anInt2687]);
                this.anIntArray2623 = (anIntArrayArray2690[-1377184223 * this.anInt2687]);
                this.anIntArray2702 = (anIntArrayArray2634[this.anInt2687 * -1377184223]);
                this.anInt2699 = (overlayDefinition != null ? (anIntArray2691[this.anInt2687 * -1377184223]) : 0) * -786924081;
                this.anInt2701 = 989325699 * (underlayType != null ? anIntArray2658[(this.anInt2687) * -1377184223] : 0);
            } else if (this.aBoolean2676) {
                this.anIntArray2700 = (anIntArrayArray2649[this.anInt2687 * -1377184223]);
                this.anIntArray2623 = (anIntArrayArray2678[-1377184223 * this.anInt2687]);
                this.anIntArray2702 = (anIntArrayArray2679[this.anInt2687 * -1377184223]);
                this.anInt2699 = (-786924081 * (overlayDefinition != null ? (anIntArray2661[this.anInt2687 * -1377184223]) : 0));
                this.anInt2701 = (null != underlayType ? (anIntArray2656[-1377184223 * this.anInt2687]) : 0) * 989325699;
                this.anIntArray2618 = (anIntArrayArray2662[this.anInt2687 * -1377184223]);
            } else {
                this.anIntArray2700 = (anIntArrayArray2672[this.anInt2687 * -1377184223]);
                this.anIntArray2623 = (anIntArrayArray2673[this.anInt2687 * -1377184223]);
                this.anIntArray2702 = (anIntArrayArray2674[-1377184223 * this.anInt2687]);
                this.anInt2699 = (-786924081 * (overlayDefinition != null ? (anIntArray2659[-1377184223 * this.anInt2687]) : 0));
                this.anInt2701 = 989325699 * (underlayType != null ? anIntArray2660[(this.anInt2687) * -1377184223] : 0);
                this.anIntArray2618 = (anIntArrayArray2671[-1377184223 * this.anInt2687]);
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("kb.posY(").append(')').toString());
        }
    }

    void method2225(GraphicsToolkit graphicsToolkit, int i, int i_189_, int i_190_, OverlayDefinition overlayDefinition, boolean[] bools, int[] is, int[] is_191_, int[] is_192_, int[] is_193_, int[] is_194_, int[] is_195_, int[] is_196_, int[] is_197_, FloorToolkit class_xa, FloorToolkit class_xa_198_, FloorToolkit class_xa_199_) {
        try {
            this.anInt2693 = -1010428415;
            this.anInt2703 = 365069805;
            this.anInt2692 = 1240828160;
            if (overlayDefinition != null) {
                this.anInt2693 = overlayDefinition.color * 269878349;
                this.anInt2703 = -610197047 * overlayDefinition.texture;
                this.anInt2692 = overlayDefinition.scale * -1360069077;
                int i_201_ = Class82_Sub9.method901(graphicsToolkit, overlayDefinition);
                for (int i_202_ = 0; i_202_ < this.anInt2699 * 1500080431; i_202_++) {
                    boolean bool = false;
                    int i_203_;
                    if ((bools[0 - this.anInt2688 * -875169383 & 0x3]) && (this.anIntArray2618[0] == -740850409 * this.anInt2689)) {
                        this.anIntArray2680[0] = (this.anIntArray2700[this.anInt2689 * -740850409]);
                        this.anIntArray2680[1] = 1;
                        this.anIntArray2680[2] = (this.anIntArray2702[this.anInt2689 * -740850409]);
                        this.anIntArray2680[3] = 1;
                        this.anIntArray2680[4] = (this.anIntArray2623[-740850409 * this.anInt2689]);
                        this.anIntArray2680[5] = (this.anIntArray2702[-740850409 * this.anInt2689]);
                        i_203_ = 6;
                    } else if (bools[2 - (-875169383 * this.anInt2688) & 0x3] && (-740850409 * this.anInt2689 == this.anIntArray2618[2])) {
                        this.anIntArray2680[0] = (this.anIntArray2700[this.anInt2689 * -740850409]);
                        this.anIntArray2680[1] = 5;
                        this.anIntArray2680[2] = (this.anIntArray2702[this.anInt2689 * -740850409]);
                        this.anIntArray2680[3] = 5;
                        this.anIntArray2680[4] = (this.anIntArray2623[this.anInt2689 * -740850409]);
                        this.anIntArray2680[5] = (this.anIntArray2702[this.anInt2689 * -740850409]);
                        i_203_ = 6;
                    } else if (bools[1 - (-875169383 * this.anInt2688) & 0x3] && (this.anIntArray2618[1] == (this.anInt2689 * -740850409))) {
                        this.anIntArray2680[0] = (this.anIntArray2700[this.anInt2689 * -740850409]);
                        this.anIntArray2680[1] = 3;
                        this.anIntArray2680[2] = (this.anIntArray2702[this.anInt2689 * -740850409]);
                        this.anIntArray2680[3] = 3;
                        this.anIntArray2680[4] = (this.anIntArray2623[-740850409 * this.anInt2689]);
                        this.anIntArray2680[5] = (this.anIntArray2702[-740850409 * this.anInt2689]);
                        i_203_ = 6;
                    } else if (bools[3 - (this.anInt2688 * -875169383) & 0x3] && (-740850409 * this.anInt2689 == this.anIntArray2618[3])) {
                        this.anIntArray2680[0] = (this.anIntArray2700[this.anInt2689 * -740850409]);
                        this.anIntArray2680[1] = 7;
                        this.anIntArray2680[2] = (this.anIntArray2702[-740850409 * this.anInt2689]);
                        this.anIntArray2680[3] = 7;
                        this.anIntArray2680[4] = (this.anIntArray2623[this.anInt2689 * -740850409]);
                        this.anIntArray2680[5] = (this.anIntArray2702[-740850409 * this.anInt2689]);
                        i_203_ = 6;
                    } else {
                        this.anIntArray2680[0] = (this.anIntArray2700[-740850409 * this.anInt2689]);
                        this.anIntArray2680[1] = (this.anIntArray2623[-740850409 * this.anInt2689]);
                        this.anIntArray2680[2] = (this.anIntArray2702[-740850409 * this.anInt2689]);
                        i_203_ = 3;
                    }
                    for (int i_204_ = 0; i_204_ < i_203_; i_204_++) {
                        int i_205_ = this.anIntArray2680[i_204_];
                        int i_206_ = (i_205_ - (-1750338766 * this.anInt2688) & 0x7);
                        int i_207_ = anIntArray2663[i_205_];
                        int i_208_ = anIntArray2664[i_205_];
                        int i_209_;
                        int i_210_;
                        if (1 == this.anInt2688 * -875169383) {
                            i_209_ = i_208_;
                            i_210_ = 512 - i_207_;
                        } else if (this.anInt2688 * -875169383 == 2) {
                            i_209_ = 512 - i_207_;
                            i_210_ = 512 - i_208_;
                        } else if (3 == (this.anInt2688 * -875169383)) {
                            i_209_ = 512 - i_208_;
                            i_210_ = i_207_;
                        } else {
                            i_209_ = i_207_;
                            i_210_ = i_208_;
                        }
                        is_191_[-1679056507 * this.anInt2685] = i_209_;
                        is_192_[-1679056507 * this.anInt2685] = i_210_;
                        if (is_196_ != null && (aBooleanArrayArray2665[this.anInt2687 * -1377184223][i_205_])) {
                            int i_211_ = (i_189_ << 9) + i_209_;
                            int i_212_ = (i_190_ << 9) + i_210_;
                            is_196_[this.anInt2685 * -1679056507] = (class_xa_198_.method6340(i_211_, i_212_) - class_xa.method6340(i_211_, i_212_));
                        }
                        if (null != is_197_) {
                            if (class_xa_198_ != null && !(aBooleanArrayArray2665[(this.anInt2687 * -1377184223)][i_205_])) {
                                int i_213_ = (i_189_ << 9) + i_209_;
                                int i_214_ = (i_190_ << 9) + i_210_;
                                is_197_[(-1679056507 * this.anInt2685)] = (class_xa.method6340(i_213_, i_214_) - (class_xa_198_.method6340(i_213_, i_214_)));
                            } else if (class_xa_199_ != null && !(aBooleanArrayArray2666[(-1377184223 * this.anInt2687)][i_205_])) {
                                int i_215_ = (i_189_ << 9) + i_209_;
                                int i_216_ = i_210_ + (i_190_ << 9);
                                is_197_[(-1679056507 * this.anInt2685)] = (class_xa_199_.method6340(i_215_, i_216_) - class_xa.method6340(i_215_, i_216_));
                            }
                        }
                        if (i_205_ < 8 && (this.anIntArray2647[i_206_] > 2109091647 * overlayDefinition.anInt4055)) {
                            if (is != null)
                                is[this.anInt2685 * -1679056507] = this.anIntArray2682[i_206_];
                            is_195_[-1679056507 * this.anInt2685] = this.anIntArray2684[i_206_];
                            is_194_[-1679056507 * this.anInt2685] = this.anIntArray2683[i_206_];
                            is_193_[this.anInt2685 * -1679056507] = this.anIntArray2681[i_206_];
                        } else {
                            if (null != is)
                                is[this.anInt2685 * -1679056507] = i_201_;
                            is_194_[this.anInt2685 * -1679056507] = 324071475 * overlayDefinition.texture;
                            is_195_[-1679056507 * this.anInt2685] = -1551409901 * overlayDefinition.scale;
                            is_193_[this.anInt2685 * -1679056507] = 1373771263 * this.anInt2693;
                        }
                        this.anInt2685 += 107294541;
                    }
                    this.anInt2689 += 844235431;
                }
                if (!underwater && 0 == i)
                    aClass331_2619.method4019(i_189_, i_190_, 1987637503 * overlayDefinition.waterColor, 1104862312 * overlayDefinition.waterScale, overlayDefinition.waterIntensity * 2077360047, -986621081 * overlayDefinition.anInt4067, 171987805 * overlayDefinition.anInt4068, -589660893 * overlayDefinition.anInt4069);
                if (this.anInt2687 * -1377184223 != 12 && -45966925 * overlayDefinition.color != -1 && overlayDefinition.blockShadow)
                    this.aBoolean2694 = true;
            } else if (this.aBoolean2696)
                this.anInt2689 += 844235431 * anIntArray2691[(this.anInt2687 * -1377184223)];
            else if (this.aBoolean2676)
                this.anInt2689 += 844235431 * anIntArray2661[(this.anInt2687 * -1377184223)];
            else
                this.anInt2689 += 844235431 * anIntArray2659[(this.anInt2687 * -1377184223)];
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("kb.t(").append(')').toString());
        }
    }

    void method2226(int i_217_, int i_218_, int i_219_, int i_220_, UnderlayType underlayType, int i_221_, int i_222_, int i_223_, int i_224_, boolean[] bools, int[] is, int[] is_225_, int[] is_226_, int[] is_227_, int[] is_228_, int[] is_229_, int[] is_230_, int[] is_231_, int[][] is_232_, FloorToolkit class_xa, FloorToolkit class_xa_233_, FloorToolkit class_xa_234_) {
        if (underlayType != null) {
            if (0 == i_222_)
                i_222_ = i_221_;
            if (i_223_ == 0)
                i_223_ = i_221_;
            if (i_224_ == 0)
                i_224_ = i_221_;
            UnderlayType underlayType_236_ = this.aClass451_2617.load(i_221_ - 1);
            UnderlayType underlayType_237_ = this.aClass451_2617.load(i_222_ - 1);
            UnderlayType underlayType_238_ = this.aClass451_2617.load(i_223_ - 1);
            UnderlayType underlayType_239_ = this.aClass451_2617.load(i_224_ - 1);
            for (int i_240_ = 0; i_240_ < this.anInt2701 * -299537109; i_240_++) {
                int length;
                if ((bools[0 - -875169383 * this.anInt2688 & 0x3]) && (-740850409 * this.anInt2689 == this.anIntArray2618[0])) {
                    this.anIntArray2680[0] = (this.anIntArray2700[-740850409 * this.anInt2689]);
                    this.anIntArray2680[1] = 1;
                    this.anIntArray2680[2] = (this.anIntArray2702[-740850409 * this.anInt2689]);
                    this.anIntArray2680[3] = 1;
                    this.anIntArray2680[4] = (this.anIntArray2623[this.anInt2689 * -740850409]);
                    this.anIntArray2680[5] = (this.anIntArray2702[-740850409 * this.anInt2689]);
                    length = 6;
                } else if (bools[2 - (this.anInt2688 * -875169383) & 0x3] && (-740850409 * this.anInt2689 == this.anIntArray2618[2])) {
                    this.anIntArray2680[0] = (this.anIntArray2700[-740850409 * this.anInt2689]);
                    this.anIntArray2680[1] = 5;
                    this.anIntArray2680[2] = (this.anIntArray2702[this.anInt2689 * -740850409]);
                    this.anIntArray2680[3] = 5;
                    this.anIntArray2680[4] = (this.anIntArray2623[this.anInt2689 * -740850409]);
                    this.anIntArray2680[5] = (this.anIntArray2702[this.anInt2689 * -740850409]);
                    length = 6;
                } else if (bools[1 - (-875169383 * this.anInt2688) & 0x3] && (-740850409 * this.anInt2689 == this.anIntArray2618[1])) {
                    this.anIntArray2680[0] = (this.anIntArray2700[-740850409 * this.anInt2689]);
                    this.anIntArray2680[1] = 3;
                    this.anIntArray2680[2] = (this.anIntArray2702[-740850409 * this.anInt2689]);
                    this.anIntArray2680[3] = 3;
                    this.anIntArray2680[4] = (this.anIntArray2623[this.anInt2689 * -740850409]);
                    this.anIntArray2680[5] = (this.anIntArray2702[this.anInt2689 * -740850409]);
                    length = 6;
                } else if (bools[3 - (this.anInt2688 * -875169383) & 0x3] && (this.anIntArray2618[3] == (this.anInt2689 * -740850409))) {
                    this.anIntArray2680[0] = (this.anIntArray2700[this.anInt2689 * -740850409]);
                    this.anIntArray2680[1] = 7;
                    this.anIntArray2680[2] = (this.anIntArray2702[this.anInt2689 * -740850409]);
                    this.anIntArray2680[3] = 7;
                    this.anIntArray2680[4] = (this.anIntArray2623[this.anInt2689 * -740850409]);
                    this.anIntArray2680[5] = (this.anIntArray2702[-740850409 * this.anInt2689]);
                    length = 6;
                } else {
                    this.anIntArray2680[0] = (this.anIntArray2700[-740850409 * this.anInt2689]);
                    this.anIntArray2680[1] = (this.anIntArray2623[this.anInt2689 * -740850409]);
                    this.anIntArray2680[2] = (this.anIntArray2702[-740850409 * this.anInt2689]);
                    length = 3;
                }
                for (int index = 0; index < length; index++) {
                    int i_243_ = this.anIntArray2680[index];
                    int i_244_ = (i_243_ - (this.anInt2688 * -1750338766) & 0x7);
                    int i_245_ = anIntArray2663[i_243_];
                    int i_246_ = anIntArray2664[i_243_];
                    int i_247_;
                    int i_248_;
                    if (-875169383 * this.anInt2688 == 1) {
                        i_247_ = i_246_;
                        i_248_ = 512 - i_245_;
                    } else if (2 == (this.anInt2688 * -875169383)) {
                        i_247_ = 512 - i_245_;
                        i_248_ = 512 - i_246_;
                    } else if (3 == (this.anInt2688 * -875169383)) {
                        i_247_ = 512 - i_246_;
                        i_248_ = i_245_;
                    } else {
                        i_247_ = i_245_;
                        i_248_ = i_246_;
                    }
                    is_225_[this.anInt2685 * -1679056507] = i_247_;
                    is_226_[-1679056507 * this.anInt2685] = i_248_;
                    if (null != is_230_ && (aBooleanArrayArray2665[this.anInt2687 * -1377184223][i_243_])) {
                        int i_249_ = (i_217_ << 9) + i_247_;
                        int i_250_ = (i_218_ << 9) + i_248_;
                        is_230_[this.anInt2685 * -1679056507] = (class_xa_233_.method6340(i_249_, i_250_) - class_xa.method6340(i_249_, i_250_));
                    }
                    if (is_231_ != null) {
                        if (null != class_xa_233_ && !(aBooleanArrayArray2665[(this.anInt2687 * -1377184223)][i_243_])) {
                            int i_251_ = (i_217_ << 9) + i_247_;
                            int i_252_ = (i_218_ << 9) + i_248_;
                            is_231_[(-1679056507 * this.anInt2685)] = (class_xa.method6340(i_251_, i_252_) - (class_xa_233_.method6340(i_251_, i_252_)));
                        } else if (null != class_xa_234_ && !(aBooleanArrayArray2666[(-1377184223 * this.anInt2687)][i_243_])) {
                            int i_253_ = i_247_ + (i_217_ << 9);
                            int i_254_ = i_248_ + (i_218_ << 9);
                            is_231_[(this.anInt2685 * -1679056507)] = (class_xa_234_.method6340(i_253_, i_254_) - class_xa.method6340(i_253_, i_254_));
                        }
                    }
                    if (i_243_ < 8 && this.anIntArray2647[i_244_] >= 0) {
                        if (null != is)
                            is[-1679056507 * this.anInt2685] = this.anIntArray2682[i_244_];
                        is_229_[this.anInt2685 * -1679056507] = this.anIntArray2684[i_244_];
                        is_228_[-1679056507 * this.anInt2685] = this.anIntArray2683[i_244_];
                        is_227_[this.anInt2685 * -1679056507] = this.anIntArray2681[i_244_];
                    } else {
                        if (this.aBoolean2676 && (aBooleanArrayArray2665[this.anInt2687 * -1377184223][i_243_])) {
                            is_228_[(-1679056507 * this.anInt2685)] = 1659854875 * this.anInt2703;
                            is_229_[(this.anInt2685 * -1679056507)] = (-2108878663 * this.anInt2692);
                            is_227_[(this.anInt2685 * -1679056507)] = this.anInt2693 * 1373771263;
                        } else if (0 == i_247_ && i_248_ == 0) {
                            is_227_[(this.anInt2685 * -1679056507)] = is_232_[i_217_][i_218_];
                            is_228_[(-1679056507 * this.anInt2685)] = underlayType_236_.textureID * 2012295231;
                            is_229_[(-1679056507 * this.anInt2685)] = underlayType_236_.textureSize * -1106852061;
                        } else if (0 == i_247_ && i_248_ == 512) {
                            is_227_[(this.anInt2685 * -1679056507)] = is_232_[i_217_][i_220_];
                            is_228_[(this.anInt2685 * -1679056507)] = 2012295231 * underlayType_237_.textureID;
                            is_229_[(this.anInt2685 * -1679056507)] = -1106852061 * underlayType_237_.textureSize;
                        } else if (i_247_ == 512 && 512 == i_248_) {
                            is_227_[(this.anInt2685 * -1679056507)] = is_232_[i_219_][i_220_];
                            is_228_[(this.anInt2685 * -1679056507)] = underlayType_238_.textureID * 2012295231;
                            is_229_[(-1679056507 * this.anInt2685)] = underlayType_238_.textureSize * -1106852061;
                        } else if (512 == i_247_ && 0 == i_248_) {
                            is_227_[(-1679056507 * this.anInt2685)] = is_232_[i_219_][i_218_];
                            is_228_[(-1679056507 * this.anInt2685)] = 2012295231 * underlayType_239_.textureID;
                            is_229_[(this.anInt2685 * -1679056507)] = underlayType_239_.textureSize * -1106852061;
                        } else {
                            if (i_247_ < 256) {
                                if (i_248_ < 256) {
                                    is_228_[-1679056507 * this.anInt2685] = (underlayType_236_.textureID * 2012295231);
                                    is_229_[-1679056507 * this.anInt2685] = (underlayType_236_.textureSize * -1106852061);
                                } else {
                                    is_228_[(this.anInt2685 * -1679056507)] = (2012295231 * underlayType_237_.textureID);
                                    is_229_[(this.anInt2685 * -1679056507)] = (underlayType_237_.textureSize * -1106852061);
                                }
                            } else if (i_248_ < 256) {
                                is_228_[(this.anInt2685 * -1679056507)] = underlayType_239_.textureID * 2012295231;
                                is_229_[(-1679056507 * this.anInt2685)] = (underlayType_239_.textureSize * -1106852061);
                            } else {
                                is_228_[(this.anInt2685 * -1679056507)] = underlayType_238_.textureID * 2012295231;
                                is_229_[(-1679056507 * this.anInt2685)] = (underlayType_238_.textureSize * -1106852061);
                            }
                            int i_255_ = StaticMethods.method1069((is_232_[i_217_][i_218_]), (is_232_[i_219_][i_218_]), i_247_ << 7 >> 9);
                            int i_256_ = StaticMethods.method1069((is_232_[i_217_][i_220_]), (is_232_[i_219_][i_220_]), i_247_ << 7 >> 9);
                            is_227_[(-1679056507 * this.anInt2685)] = StaticMethods.method1069(i_255_, i_256_, i_248_ << 7 >> 9);
                        }
                        if (is != null)
                            is[-1679056507 * this.anInt2685] = is_227_[(-1679056507 * this.anInt2685)];
                    }
                    this.anInt2685 += 107294541;
                }
                this.anInt2689 += 844235431;
            }
            if (-1377184223 * this.anInt2687 != 0 && underlayType.blockShadow)
                this.aBoolean2694 = true;
        }
    }

    final void method2227(GraphicsToolkit class_ra, OverlayDefinition class373, UnderlayType underlayType, int i, int i_257_, int i_258_, int i_259_, byte[][] is, byte[][] is_260_, byte[][] is_261_, boolean[] bools, int i_262_) {
        try {
            boolean[] bools_263_ = (null != class373 && class373.aBoolean4063 ? (aBooleanArrayArray2675[-1377184223 * this.anInt2687]) : (aBooleanArrayArray2695[-1377184223 * this.anInt2687]));
            if (i_257_ > 0) {
                if (i > 0) {
                    int i_264_ = is[i - 1][i_257_ - 1] & 0xff;
                    if (i_264_ > 0) {
                        OverlayDefinition class373_265_ = this.overlayDefinitionLoader.getOverlayDefinition(i_264_ - 1);
                        if (-1 != -45966925 * class373_265_.color && class373_265_.aBoolean4063) {
                            byte i_266_ = is_260_[i - 1][i_257_ - 1];
                            int i_267_ = 2 * is_261_[i - 1][i_257_ - 1] + 4 & 0x7;
                            int i_268_ = Class82_Sub9.method901(class_ra, class373_265_);
                            if (aBooleanArrayArray2665[i_266_][i_267_]) {
                                this.anIntArray2681[0] = class373_265_.color * -45966925;
                                this.anIntArray2682[0] = i_268_;
                                this.anIntArray2683[0] = class373_265_.texture * 324071475;
                                this.anIntArray2684[0] = -1551409901 * class373_265_.scale;
                                this.anIntArray2647[0] = 2109091647 * class373_265_.anInt4055;
                                this.anIntArray2686[0] = 256;
                            }
                        }
                    }
                }
                if (i < i_258_ - 1) {
                    int i_269_ = is[1 + i][i_257_ - 1] & 0xff;
                    if (i_269_ > 0) {
                        OverlayDefinition class373_270_ = this.overlayDefinitionLoader.getOverlayDefinition(i_269_ - 1);
                        if (-1 != class373_270_.color * -45966925 && class373_270_.aBoolean4063) {
                            byte i_271_ = is_260_[1 + i][i_257_ - 1];
                            int i_272_ = 6 + is_261_[i + 1][i_257_ - 1] * 2 & 0x7;
                            int i_273_ = Class82_Sub9.method901(class_ra, class373_270_);
                            if (aBooleanArrayArray2665[i_271_][i_272_]) {
                                this.anIntArray2681[2] = class373_270_.color * -45966925;
                                this.anIntArray2682[2] = i_273_;
                                this.anIntArray2683[2] = class373_270_.texture * 324071475;
                                this.anIntArray2684[2] = class373_270_.scale * -1551409901;
                                this.anIntArray2647[2] = class373_270_.anInt4055 * 2109091647;
                                this.anIntArray2686[2] = 512;
                            }
                        }
                    }
                }
            }
            if (i_257_ < i_259_ - 1) {
                if (i > 0) {
                    int i_274_ = is[i - 1][i_257_ + 1] & 0xff;
                    if (i_274_ > 0) {
                        OverlayDefinition class373_275_ = this.overlayDefinitionLoader.getOverlayDefinition(i_274_ - 1);
                        if (class373_275_.color * -45966925 != -1 && class373_275_.aBoolean4063) {
                            byte i_276_ = is_260_[i - 1][i_257_ + 1];
                            int i_277_ = 2 + is_261_[i - 1][1 + i_257_] * 2 & 0x7;
                            int i_278_ = Class82_Sub9.method901(class_ra, class373_275_);
                            if (aBooleanArrayArray2665[i_276_][i_277_]) {
                                this.anIntArray2681[6] = -45966925 * class373_275_.color;
                                this.anIntArray2682[6] = i_278_;
                                this.anIntArray2683[6] = class373_275_.texture * 324071475;
                                this.anIntArray2684[6] = -1551409901 * class373_275_.scale;
                                this.anIntArray2647[6] = 2109091647 * class373_275_.anInt4055;
                                this.anIntArray2686[6] = 64;
                            }
                        }
                    }
                }
                if (i < i_258_ - 1) {
                    int i_279_ = is[i + 1][i_257_ + 1] & 0xff;
                    if (i_279_ > 0) {
                        OverlayDefinition class373_280_ = this.overlayDefinitionLoader.getOverlayDefinition(i_279_ - 1);
                        if (class373_280_.color * -45966925 != -1 && class373_280_.aBoolean4063) {
                            byte i_281_ = is_260_[1 + i][i_257_ + 1];
                            int i_282_ = 0 + is_261_[1 + i][i_257_ + 1] * 2 & 0x7;
                            int i_283_ = Class82_Sub9.method901(class_ra, class373_280_);
                            if (aBooleanArrayArray2665[i_281_][i_282_]) {
                                this.anIntArray2681[4] = -45966925 * class373_280_.color;
                                this.anIntArray2682[4] = i_283_;
                                this.anIntArray2683[4] = 324071475 * class373_280_.texture;
                                this.anIntArray2684[4] = class373_280_.scale * -1551409901;
                                this.anIntArray2647[4] = 2109091647 * class373_280_.anInt4055;
                                this.anIntArray2686[4] = 128;
                            }
                        }
                    }
                }
            }
            if (i_257_ > 0) {
                int i_284_ = is[i][i_257_ - 1] & 0xff;
                if (i_284_ > 0) {
                    OverlayDefinition class373_285_ = this.overlayDefinitionLoader.getOverlayDefinition(i_284_ - 1);
                    if (-1 != class373_285_.color * -45966925) {
                        byte i_286_ = is_260_[i][i_257_ - 1];
                        int i_287_ = is_261_[i][i_257_ - 1];
                        if (class373_285_.aBoolean4063) {
                            int i_288_ = 2;
                            int i_289_ = 4 + i_287_ * 2;
                            int i_290_ = Class82_Sub9.method901(class_ra, class373_285_);
                            for (int i_291_ = 0; i_291_ < 3; i_291_++) {
                                i_289_ &= 0x7;
                                i_288_ &= 0x7;
                                if (aBooleanArrayArray2665[i_286_][i_289_] && ((this.anIntArray2647[i_288_]) <= (2109091647 * class373_285_.anInt4055))) {
                                    this.anIntArray2681[i_288_] = -45966925 * class373_285_.color;
                                    this.anIntArray2682[i_288_] = i_290_;
                                    this.anIntArray2683[i_288_] = class373_285_.texture * 324071475;
                                    this.anIntArray2684[i_288_] = (-1551409901 * class373_285_.scale);
                                    if ((this.anIntArray2647[i_288_]) == (class373_285_.anInt4055 * 2109091647))
                                        this.anIntArray2686[i_288_] |= 0x20;
                                    else
                                        this.anIntArray2686[i_288_] = 32;
                                    this.anIntArray2647[i_288_] = 2109091647 * class373_285_.anInt4055;
                                }
                                i_289_++;
                                i_288_--;
                            }
                            if (!bools_263_[(this.anInt2688 * -875169383 + 0 & 0x3)])
                                bools[0] = (aBooleanArrayArray2675[i_286_][i_287_ + 2 & 0x3]);
                        } else if (!bools_263_[(this.anInt2688 * -875169383) + 0 & 0x3])
                            bools[0] = (aBooleanArrayArray2695[i_286_][2 + i_287_ & 0x3]);
                    }
                }
            }
            if (i_257_ < i_259_ - 1) {
                int i_292_ = is[i][i_257_ + 1] & 0xff;
                if (i_292_ > 0) {
                    OverlayDefinition class373_293_ = this.overlayDefinitionLoader.getOverlayDefinition(i_292_ - 1);
                    if (class373_293_.color * -45966925 != -1) {
                        byte i_294_ = is_260_[i][1 + i_257_];
                        int i_295_ = is_261_[i][1 + i_257_];
                        if (class373_293_.aBoolean4063) {
                            int i_296_ = 4;
                            int i_297_ = 2 * i_295_ + 2;
                            int i_298_ = Class82_Sub9.method901(class_ra, class373_293_);
                            for (int i_299_ = 0; i_299_ < 3; i_299_++) {
                                i_297_ &= 0x7;
                                i_296_ &= 0x7;
                                if (aBooleanArrayArray2665[i_294_][i_297_] && ((this.anIntArray2647[i_296_]) <= (2109091647 * class373_293_.anInt4055))) {
                                    this.anIntArray2681[i_296_] = class373_293_.color * -45966925;
                                    this.anIntArray2682[i_296_] = i_298_;
                                    this.anIntArray2683[i_296_] = class373_293_.texture * 324071475;
                                    this.anIntArray2684[i_296_] = (class373_293_.scale * -1551409901);
                                    if (2109091647 * class373_293_.anInt4055 == (this.anIntArray2647[i_296_]))
                                        this.anIntArray2686[i_296_] |= 0x10;
                                    else
                                        this.anIntArray2686[i_296_] = 16;
                                    this.anIntArray2647[i_296_] = class373_293_.anInt4055 * 2109091647;
                                }
                                i_297_--;
                                i_296_++;
                            }
                            if (!bools_263_[(-875169383 * this.anInt2688 + 2 & 0x3)])
                                bools[2] = (aBooleanArrayArray2675[i_294_][0 + i_295_ & 0x3]);
                        } else if (!bools_263_[2 + (this.anInt2688 * -875169383) & 0x3])
                            bools[2] = (aBooleanArrayArray2695[i_294_][0 + i_295_ & 0x3]);
                    }
                }
            }
            if (i > 0) {
                int i_300_ = is[i - 1][i_257_] & 0xff;
                if (i_300_ > 0) {
                    OverlayDefinition class373_301_ = this.overlayDefinitionLoader.getOverlayDefinition(i_300_ - 1);
                    if (-1 != -45966925 * class373_301_.color) {
                        byte i_302_ = is_260_[i - 1][i_257_];
                        int i_303_ = is_261_[i - 1][i_257_];
                        if (class373_301_.aBoolean4063) {
                            int i_304_ = 6;
                            int i_305_ = 2 * i_303_ + 4;
                            int i_306_ = Class82_Sub9.method901(class_ra, class373_301_);
                            for (int i_307_ = 0; i_307_ < 3; i_307_++) {
                                i_305_ &= 0x7;
                                i_304_ &= 0x7;
                                if (aBooleanArrayArray2665[i_302_][i_305_] && ((this.anIntArray2647[i_304_]) <= (2109091647 * class373_301_.anInt4055))) {
                                    this.anIntArray2681[i_304_] = class373_301_.color * -45966925;
                                    this.anIntArray2682[i_304_] = i_306_;
                                    this.anIntArray2683[i_304_] = 324071475 * class373_301_.texture;
                                    this.anIntArray2684[i_304_] = (class373_301_.scale * -1551409901);
                                    if ((this.anIntArray2647[i_304_]) == (class373_301_.anInt4055 * 2109091647))
                                        this.anIntArray2686[i_304_] |= 0x8;
                                    else
                                        this.anIntArray2686[i_304_] = 8;
                                    this.anIntArray2647[i_304_] = class373_301_.anInt4055 * 2109091647;
                                }
                                i_305_--;
                                i_304_++;
                            }
                            if (!bools_263_[(-875169383 * this.anInt2688 + 3 & 0x3)])
                                bools[3] = (aBooleanArrayArray2675[i_302_][i_303_ + 1 & 0x3]);
                        } else if (!bools_263_[(this.anInt2688 * -875169383) + 3 & 0x3])
                            bools[3] = (aBooleanArrayArray2695[i_302_][1 + i_303_ & 0x3]);
                    }
                }
            }
            if (i < i_258_ - 1) {
                int i_308_ = is[1 + i][i_257_] & 0xff;
                if (i_308_ > 0) {
                    OverlayDefinition class373_309_ = this.overlayDefinitionLoader.getOverlayDefinition(i_308_ - 1);
                    if (-1 != class373_309_.color * -45966925) {
                        byte i_310_ = is_260_[i + 1][i_257_];
                        int i_311_ = is_261_[i + 1][i_257_];
                        if (class373_309_.aBoolean4063) {
                            int i_312_ = 4;
                            int i_313_ = 6 + 2 * i_311_;
                            int i_314_ = Class82_Sub9.method901(class_ra, class373_309_);
                            for (int i_315_ = 0; i_315_ < 3; i_315_++) {
                                i_313_ &= 0x7;
                                i_312_ &= 0x7;
                                if (aBooleanArrayArray2665[i_310_][i_313_] && ((this.anIntArray2647[i_312_]) <= (class373_309_.anInt4055 * 2109091647))) {
                                    this.anIntArray2681[i_312_] = -45966925 * class373_309_.color;
                                    this.anIntArray2682[i_312_] = i_314_;
                                    this.anIntArray2683[i_312_] = 324071475 * class373_309_.texture;
                                    this.anIntArray2684[i_312_] = (class373_309_.scale * -1551409901);
                                    if ((this.anIntArray2647[i_312_]) == (class373_309_.anInt4055 * 2109091647))
                                        this.anIntArray2686[i_312_] |= 0x4;
                                    else
                                        this.anIntArray2686[i_312_] = 4;
                                    this.anIntArray2647[i_312_] = 2109091647 * class373_309_.anInt4055;
                                }
                                i_313_++;
                                i_312_--;
                            }
                            if (!bools_263_[(-875169383 * this.anInt2688 + 1 & 0x3)])
                                bools[1] = (aBooleanArrayArray2675[i_310_][i_311_ + 3 & 0x3]);
                        } else if (!bools_263_[1 + (this.anInt2688 * -875169383) & 0x3])
                            bools[1] = (aBooleanArrayArray2695[i_310_][3 + i_311_ & 0x3]);
                    }
                }
            }
            if (null != class373 && class373.aBoolean4063) {
                int i_316_ = Class82_Sub9.method901(class_ra, class373);
                for (int i_317_ = 0; i_317_ < 8; i_317_++) {
                    int i_318_ = (i_317_ - -1750338766 * this.anInt2688 & 0x7);
                    if ((aBooleanArrayArray2665[-1377184223 * this.anInt2687][i_317_]) && (this.anIntArray2647[i_318_] <= class373.anInt4055 * 2109091647)) {
                        this.anIntArray2681[i_318_] = -45966925 * class373.color;
                        this.anIntArray2682[i_318_] = i_316_;
                        this.anIntArray2683[i_318_] = 324071475 * class373.texture;
                        this.anIntArray2684[i_318_] = class373.scale * -1551409901;
                        if (2109091647 * class373.anInt4055 == this.anIntArray2647[i_318_])
                            this.anIntArray2686[i_318_] |= 0x2;
                        else
                            this.anIntArray2686[i_318_] = 2;
                        this.anIntArray2647[i_318_] = class373.anInt4055 * 2109091647;
                    }
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("kb.g(").append(')').toString());
        }
    }

    final void method2228(Buffer buffer, int i, int i_319_, int i_320_, int i_321_, int i_322_, int i_323_, int i_324_, int i_325_, boolean bool, int i_326_) {
        try {
            if (i_325_ == 1)
                i_322_ = 1;
            else if (2 == i_325_) {
                i_321_ = 1;
                i_322_ = 1;
            } else if (3 == i_325_)
                i_321_ = 1;
            if (i_319_ >= 0 && i_319_ < -954368823 * anInt2627 && i_320_ >= 0 && i_320_ < 181474463 * anInt2628) {
                if (!underwater && !bool)
                    aClass244_2635.flags[i][i_319_][i_320_] = (byte) 0;
                for (; ; ) {
                    int i_327_ = buffer.readUByte();
                    if (0 == i_327_) {
                        if (underwater)
                            anIntArrayArrayArray2653[0][i_319_ + i_321_][i_320_ + i_322_] = 0;
                        else if (0 == i)
                            anIntArrayArrayArray2653[0][i_321_ + i_319_][i_322_ + i_320_] = -StaticMethods.method5581(i_323_ + 932731, i_324_ + 556238) * 8 << 2;
                        else
                            anIntArrayArrayArray2653[i][i_321_ + i_319_][i_320_ + i_322_] = (anIntArrayArrayArray2653[i - 1][i_321_ + i_319_][i_320_ + i_322_]) - 960;
                        break;
                    }
                    if (1 == i_327_) {
                        int i_328_ = buffer.readUByte();
                        if (!underwater) {
                            if (i_328_ == 1)
                                i_328_ = 0;
                            if (0 == i)
                                anIntArrayArrayArray2653[0][i_321_ + i_319_][i_322_ + i_320_] = -i_328_ * 8 << 2;
                            else
                                anIntArrayArrayArray2653[i][i_321_ + i_319_][i_322_ + i_320_] = ((anIntArrayArrayArray2653[i - 1][i_321_ + i_319_][i_322_ + i_320_]) - (i_328_ * 8 << 2));
                        } else
                            anIntArrayArrayArray2653[0][i_321_ + i_319_][i_320_ + i_322_] = 8 * i_328_ << 2;
                        break;
                    }
                    if (i_327_ <= 49) {
                        if (bool)
                            buffer.readUByte();
                        else {
                            this.overlayHash[i][i_319_][i_320_] = buffer.readByte();
                            this.aByteArrayArrayArray2698[i][i_319_][i_320_] = (byte) ((i_327_ - 2) / 4);
                            this.aByteArrayArrayArray2668[i][i_319_][i_320_] = (byte) (i_327_ - 2 + i_325_ & 0x3);
                        }
                    } else if (i_327_ <= 81) {
                        if (!underwater && !bool)
                            aClass244_2635.flags[i][i_319_][i_320_] = (byte) (i_327_ - 49);
                    } else if (bool) {
                        if (i_326_ != -2042161970) {
                            /* empty */
                        }
                    } else
                        this.underlayHash[i][i_319_][i_320_] = (byte) (i_327_ - 81);
                }
            } else {
                for (; ; ) {
                    int i_329_ = buffer.readUByte();
                    if (i_329_ == 0) {
                        if (i_326_ != -2042161970) {
							/* empty */
                        }
                        break;
                    }
                    if (i_329_ == 1) {
                        buffer.readUByte();
                        break;
                    }
                    if (i_329_ <= 49)
                        buffer.readUByte();
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("kb.d(").append(')').toString());
        }
    }

    void method2229(FloorToolkit class_xa, UnderlayType underlayType, OverlayDefinition overlayDefinition, int i, int i_330_, int i_331_, int i_332_, int i_333_, int i_334_, int i_335_) {
        try {
            int i_337_ = class_xa.method6341(i_330_, i_331_);
            int i_338_ = class_xa.method6341(i_332_, i_331_);
            int i_339_ = class_xa.method6341(i_332_, i_333_);
            int i_340_ = class_xa.method6341(i_330_, i_333_);
            boolean bool = aClass244_2635.method2320(i_330_, i_331_);
            if (bool && i > 1 || !bool && i > 0) {
                boolean bool_341_ = true;
                if (underlayType != null && !underlayType.aBoolean5596)
                    bool_341_ = false;
                else if (0 == i_334_ && 0 != -1377184223 * this.anInt2687)
                    bool_341_ = false;
                else if (i_335_ > 0 && null != overlayDefinition && !overlayDefinition.aBoolean4062)
                    bool_341_ = false;
                if (bool_341_ && i_338_ == i_337_ && i_337_ == i_339_ && i_337_ == i_340_)
                    aByteArrayArrayArray2637[i][i_330_][i_331_] |= 0x4;
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("kb.v(").append(')').toString());
        }
    }
}
