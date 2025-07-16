package com.jagex;/* Class289 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class289 {
    public static int anInt3105 = 2883872;
    public static int anInt3123 = 262144;
    public static int anInt3127 = 8388608;
    public static int anInt3131 = 536870912;
    public static int anInt3134 = 1073741824;
    public static int anInt3135 = 2883842;
    public static int anInt3136 = 2883848;
    public static int anInt3138 = 2883968;
    public static int anInt3140 = 33554432;
    public static int anInt3141 = 134217728;
    public static int anInt3144 = 2097152;
    static int anInt3106 = 2;
    static int anInt3107 = 4;
    static int anInt3108 = 8;
    static int anInt3109 = 67108864;
    static int anInt3110 = 32;
    static int anInt3111 = 64;
    static int anInt3112 = 128;
    static int anInt3113 = 1109655552;
    static int anInt3114 = 512;
    static int anInt3115 = 1675886592;
    static int anInt3116 = 2048;
    static int anInt3117 = 4096;
    static int anInt3118 = 1134821376;
    static int anInt3119 = 16384;
    static int anInt3120 = 32768;
    static int anInt3121 = 65536;
    static int anInt3122 = 2116288512;
    static int anInt3124 = 524288;
    static int anInt3125 = 1625554944;
    static int anInt3126 = 256;
    static int anInt3128 = 16777216;
    static int anInt3129 = 131072;
    static int anInt3130 = 8192;
    static int anInt3132 = 1084489728;
    static int anInt3133 = 1612972032;
    static int anInt3137 = 1024;
    static int anInt3139 = 268435456;
    static int anInt3142 = 16;
    static int anInt3143 = 1310982144;
    static int anInt3145 = 2015625216;
    static int anInt3146 = 1;
    static int anInt3147 = 2028208128;
    static int anInt3148 = 1336147968;
    static int anInt3149 = 4194304;
    static int anInt3150 = 1210318848;
    public int anInt3151;
    public int anInt3152;
    public int[][] anIntArrayArray3155;
    int anInt3153;
    int anInt3154;

    Class289() {
        /* empty */
    }

    static final void method2745(ScriptRuntime runtime) {
        try {
            runtime.longArgs -= -1365138610;
            if ((runtime.longStacks[1685767703 * runtime.longArgs]) < (runtime.longStacks[1685767703 * runtime.longArgs + 1]))
                runtime.integerPos += ((runtime.integerstack[1883543357 * runtime.integerPos]) * 286750741);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lz.bo(").append(')').toString());
        }
    }

    static final void getClientScriptMap(ScriptRuntime runtime) {
        try {
            runtime.integerStackOffset -= -783761378;
            int scriptID = (runtime.integerStack[681479919 * runtime.integerStackOffset]);
            int key = (runtime.integerStack[1 + runtime.integerStackOffset * 681479919]);
            ClientScriptMap scriptMap = Class51.aClass475_506.getClientScriptMap(scriptID);
            if ('s' == scriptMap.aChar6037) {
				/* empty */
            }
            runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393 - 1)] = scriptMap.getMap(key);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lz.vy(").append(')').toString());
        }
    }

    public void method2731(int i) {
        try {
            for (int i_0_ = 0; i_0_ < this.anInt3153 * 843157589; i_0_++) {
                for (int i_1_ = 0; i_1_ < -16196483 * this.anInt3154; i_1_++) {
                    if (i_0_ == 0 || i_1_ == 0 || i_0_ >= this.anInt3153 * 843157589 - 5 || i_1_ >= -16196483 * this.anInt3154 - 5)
                        anIntArrayArray3155[i_0_][i_1_] = -1;
                    else
                        anIntArrayArray3155[i_0_][i_1_] = 2097152;
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lz.f(").append(')').toString());
        }
    }

    public void method2732(int i, int i_2_, int i_3_, int i_4_, boolean fly, boolean walkAlternative) {
        i -= 1487776559 * anInt3151;
        i_2_ -= anInt3152 * 1415525851;
        if (i_3_ == 0) {
            if (i_4_ == 0) {
                method2735(i, i_2_, 128);
                method2735(i - 1, i_2_, 8);
            }
            if (1 == i_4_) {
                method2735(i, i_2_, 2);
                method2735(i, i_2_ + 1, 32);
            }
            if (2 == i_4_) {
                method2735(i, i_2_, 8);
                method2735(i + 1, i_2_, 128);
            }
            if (i_4_ == 3) {
                method2735(i, i_2_, 32);
                method2735(i, i_2_ - 1, 2);
            }
        }
        if (i_3_ == 1 || 3 == i_3_) {
            if (0 == i_4_) {
                method2735(i, i_2_, 1);
                method2735(i - 1, 1 + i_2_, 16);
            }
            if (i_4_ == 1) {
                method2735(i, i_2_, 4);
                method2735(1 + i, 1 + i_2_, 64);
            }
            if (i_4_ == 2) {
                method2735(i, i_2_, 16);
                method2735(1 + i, i_2_ - 1, 1);
            }
            if (i_4_ == 3) {
                method2735(i, i_2_, 64);
                method2735(i - 1, i_2_ - 1, 4);
            }
        }
        if (2 == i_3_) {
            if (0 == i_4_) {
                method2735(i, i_2_, 130);
                method2735(i - 1, i_2_, 8);
                method2735(i, i_2_ + 1, 32);
            }
            if (1 == i_4_) {
                method2735(i, i_2_, 10);
                method2735(i, i_2_ + 1, 32);
                method2735(1 + i, i_2_, 128);
            }
            if (2 == i_4_) {
                method2735(i, i_2_, 40);
                method2735(i + 1, i_2_, 128);
                method2735(i, i_2_ - 1, 2);
            }
            if (i_4_ == 3) {
                method2735(i, i_2_, 160);
                method2735(i, i_2_ - 1, 2);
                method2735(i - 1, i_2_, 8);
            }
        }
        if (fly) {
            if (i_3_ == 0) {
                if (i_4_ == 0) {
                    method2735(i, i_2_, 65536);
                    method2735(i - 1, i_2_, 4096);
                }
                if (1 == i_4_) {
                    method2735(i, i_2_, 1024);
                    method2735(i, i_2_ + 1, 16384);
                }
                if (2 == i_4_) {
                    method2735(i, i_2_, 4096);
                    method2735(i + 1, i_2_, 65536);
                }
                if (i_4_ == 3) {
                    method2735(i, i_2_, 16384);
                    method2735(i, i_2_ - 1, 1024);
                }
            }
            if (i_3_ == 1 || i_3_ == 3) {
                if (0 == i_4_) {
                    method2735(i, i_2_, 512);
                    method2735(i - 1, 1 + i_2_, 8192);
                }
                if (1 == i_4_) {
                    method2735(i, i_2_, 2048);
                    method2735(i + 1, i_2_ + 1, 32768);
                }
                if (2 == i_4_) {
                    method2735(i, i_2_, 8192);
                    method2735(i + 1, i_2_ - 1, 512);
                }
                if (3 == i_4_) {
                    method2735(i, i_2_, 32768);
                    method2735(i - 1, i_2_ - 1, 2048);
                }
            }
            if (i_3_ == 2) {
                if (0 == i_4_) {
                    method2735(i, i_2_, 66560);
                    method2735(i - 1, i_2_, 4096);
                    method2735(i, 1 + i_2_, 16384);
                }
                if (i_4_ == 1) {
                    method2735(i, i_2_, 5120);
                    method2735(i, i_2_ + 1, 16384);
                    method2735(i + 1, i_2_, 65536);
                }
                if (i_4_ == 2) {
                    method2735(i, i_2_, 20480);
                    method2735(1 + i, i_2_, 65536);
                    method2735(i, i_2_ - 1, 1024);
                }
                if (i_4_ == 3) {
                    method2735(i, i_2_, 81920);
                    method2735(i, i_2_ - 1, 1024);
                    method2735(i - 1, i_2_, 4096);
                }
            }
        }
        if (walkAlternative) {
            if (0 == i_3_) {
                if (i_4_ == 0) {
                    method2735(i, i_2_, 536870912);
                    method2735(i - 1, i_2_, 33554432);
                }
                if (i_4_ == 1) {
                    method2735(i, i_2_, 8388608);
                    method2735(i, i_2_ + 1, 134217728);
                }
                if (2 == i_4_) {
                    method2735(i, i_2_, 33554432);
                    method2735(1 + i, i_2_, 536870912);
                }
                if (3 == i_4_) {
                    method2735(i, i_2_, 134217728);
                    method2735(i, i_2_ - 1, 8388608);
                }
            }
            if (i_3_ == 1 || i_3_ == 3) {
                if (i_4_ == 0) {
                    method2735(i, i_2_, 4194304);
                    method2735(i - 1, i_2_ + 1, 67108864);
                }
                if (i_4_ == 1) {
                    method2735(i, i_2_, 16777216);
                    method2735(1 + i, i_2_ + 1, 268435456);
                }
                if (2 == i_4_) {
                    method2735(i, i_2_, 67108864);
                    method2735(i + 1, i_2_ - 1, 4194304);
                }
                if (3 == i_4_) {
                    method2735(i, i_2_, 268435456);
                    method2735(i - 1, i_2_ - 1, 16777216);
                }
            }
            if (2 == i_3_) {
                if (i_4_ == 0) {
                    method2735(i, i_2_, 545259520);
                    method2735(i - 1, i_2_, 33554432);
                    method2735(i, 1 + i_2_, 134217728);
                }
                if (i_4_ == 1) {
                    method2735(i, i_2_, 41943040);
                    method2735(i, 1 + i_2_, 134217728);
                    method2735(1 + i, i_2_, 536870912);
                }
                if (i_4_ == 2) {
                    method2735(i, i_2_, 167772160);
                    method2735(i + 1, i_2_, 536870912);
                    method2735(i, i_2_ - 1, 8388608);
                }
                if (i_4_ == 3) {
                    method2735(i, i_2_, 671088640);
                    method2735(i, i_2_ - 1, 8388608);
                    method2735(i - 1, i_2_, 33554432);
                }
            }
        }
    }

    public void method2733(int i, int i_7_) {
        try {
            i -= 1487776559 * anInt3151;
            i_7_ -= 1415525851 * anInt3152;
            anIntArrayArray3155[i][i_7_] |= 0x200000;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lz.i(").append(')').toString());
        }
    }

    public void method2734(int i, int i_9_, byte i_10_) {
        try {
            i -= anInt3151 * 1487776559;
            i_9_ -= anInt3152 * 1415525851;
            anIntArrayArray3155[i][i_9_] |= 0x40000;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lz.k(").append(')').toString());
        }
    }

    void method2735(int i, int i_11_, int i_12_) {
            anIntArrayArray3155[i][i_11_] |= i_12_;
    }

    public void method2736(int i, int i_14_, int sizeX, int sizeY, int i_17_, boolean OBJ_BLOCKSFLY, boolean OBJ_BLOCKSWALK_ALTERNATIVE) {
        try {
            int hash = 256;
            if (OBJ_BLOCKSFLY)
                hash |= 0x20000;
            if (OBJ_BLOCKSWALK_ALTERNATIVE)
                hash |= 0x40000000;
            i -= anInt3151 * 1487776559;
            i_14_ -= anInt3152 * 1415525851;
            if (1 == i_17_ || 3 == i_17_) {
                int i_21_ = sizeX;
                sizeX = sizeY;
                sizeY = i_21_;
            }
            for (int i_22_ = i; i_22_ < i + sizeX; i_22_++) {
                if (i_22_ >= 0 && i_22_ < 843157589 * this.anInt3153) {
                    for (int i_23_ = i_14_; i_23_ < i_14_ + sizeY; i_23_++) {
                        if (i_23_ >= 0 && i_23_ < this.anInt3154 * -16196483)
                            method2737(i_22_, i_23_, hash, (byte) -13);
                    }
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lz.posX(").append(')').toString());
        }
    }

    void method2737(int i, int i_24_, int i_25_, byte i_26_) {
        try {
            anIntArrayArray3155[i][i_24_] &= i_25_ ^ 0xffffffff;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lz.r(").append(')').toString());
        }
    }

    public void method2738(int i, int i_27_, int i_28_) {
        try {
            i -= anInt3151 * 1487776559;
            i_27_ -= 1415525851 * anInt3152;
            anIntArrayArray3155[i][i_27_] &= ~0x40000;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lz.n(").append(')').toString());
        }
    }

    public boolean method2739(int i, int i_29_, int i_30_, int i_31_, int i_32_, int i_33_, int i_34_, int i_35_, int i_36_) {
        try {
            if (i_30_ > 1) {
                if (Class287.method2720(i, i_29_, i_30_, i_30_, i_31_, i_32_, i_33_, i_34_, -173263894))
                    return true;
                return method2740(i, i_29_, i_30_, i_30_, i_31_, i_32_, i_33_, i_34_, i_35_, (byte) -47);
            }
            int i_37_ = i_33_ + i_31_ - 1;
            int i_38_ = i_34_ + i_32_ - 1;
            if (i >= i_31_ && i <= i_37_ && i_29_ >= i_32_ && i_29_ <= i_38_)
                return true;
            if (i == i_31_ - 1 && i_29_ >= i_32_ && i_29_ <= i_38_ && 0 == ((anIntArrayArray3155[i - 1487776559 * anInt3151][i_29_ - 1415525851 * anInt3152]) & 0x8) && (i_35_ & 0x8) == 0)
                return true;
            if (1 + i_37_ == i && i_29_ >= i_32_ && i_29_ <= i_38_ && ((anIntArrayArray3155[i - anInt3151 * 1487776559][i_29_ - anInt3152 * 1415525851]) & 0x80) == 0 && (i_35_ & 0x2) == 0)
                return true;
            if (i_32_ - 1 == i_29_ && i >= i_31_ && i <= i_37_ && ((anIntArrayArray3155[i - anInt3151 * 1487776559][i_29_ - 1415525851 * anInt3152]) & 0x2) == 0 && 0 == (i_35_ & 0x4))
                return true;
            return i_29_ == i_38_ + 1 && i >= i_31_ && i <= i_37_ && 0 == ((anIntArrayArray3155[i - anInt3151 * 1487776559][i_29_ - 1415525851 * anInt3152]) & 0x20) && (i_35_ & 0x1) == 0;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lz.z(").append(')').toString());
        }
    }

    public boolean method2740(int i, int i_39_, int i_40_, int i_41_, int i_42_, int i_43_, int i_44_, int i_45_, int i_46_, byte i_47_) {
        try {
            int i_48_ = i + i_40_;
            int i_49_ = i_41_ + i_39_;
            int i_50_ = i_42_ + i_44_;
            int i_51_ = i_43_ + i_45_;
            if (i_50_ == i && 0 == (i_46_ & 0x2)) {
                int i_52_ = i_39_ > i_43_ ? i_39_ : i_43_;
                for (int i_53_ = i_49_ < i_51_ ? i_49_ : i_51_; i_52_ < i_53_; i_52_++) {
                    if (((anIntArrayArray3155[i_50_ - 1 - 1487776559 * anInt3151][i_52_ - anInt3152 * 1415525851]) & 0x8) == 0)
                        return true;
                }
            } else if (i_42_ == i_48_ && 0 == (i_46_ & 0x8)) {
                int i_54_ = i_39_ > i_43_ ? i_39_ : i_43_;
                for (int i_55_ = i_49_ < i_51_ ? i_49_ : i_51_; i_54_ < i_55_; i_54_++) {
                    if (0 == ((anIntArrayArray3155[i_42_ - 1487776559 * anInt3151][i_54_ - anInt3152 * 1415525851]) & 0x80))
                        return true;
                }
            } else if (i_51_ == i_39_ && (i_46_ & 0x1) == 0) {
                int i_56_ = i > i_42_ ? i : i_42_;
                for (int i_57_ = i_48_ < i_50_ ? i_48_ : i_50_; i_56_ < i_57_; i_56_++) {
                    if (((anIntArrayArray3155[i_56_ - 1487776559 * anInt3151][i_51_ - 1 - 1415525851 * anInt3152]) & 0x2) == 0)
                        return true;
                }
            } else if (i_43_ == i_49_ && (i_46_ & 0x4) == 0) {
                int i_58_ = i > i_42_ ? i : i_42_;
                for (int i_59_ = i_48_ < i_50_ ? i_48_ : i_50_; i_58_ < i_59_; i_58_++) {
                    if (((anIntArrayArray3155[i_58_ - 1487776559 * anInt3151][i_43_ - anInt3152 * 1415525851]) & 0x20) == 0)
                        return true;
                }
            }
            return false;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lz.posY(").append(')').toString());
        }
    }

    public void method2741(int i, int i_60_, int i_61_, int i_62_, boolean bool, boolean bool_63_, byte i_64_) {
        try {
            int i_65_ = 256;
            if (bool)
                i_65_ |= 0x20000;
            if (bool_63_)
                i_65_ |= 0x40000000;
            i -= anInt3151 * 1487776559;
            i_60_ -= 1415525851 * anInt3152;
            for (int i_66_ = i; i_66_ < i_61_ + i; i_66_++) {
                if (i_66_ >= 0 && i_66_ < 843157589 * this.anInt3153) {
                    for (int i_67_ = i_60_; i_67_ < i_62_ + i_60_; i_67_++) {
                        if (i_67_ >= 0 && i_67_ < -16196483 * this.anInt3154)
                            method2735(i_66_, i_67_, i_65_);
                    }
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lz.p(").append(')').toString());
        }
    }

    public boolean method2742(int i, int i_68_, int i_69_, int i_70_, int i_71_, int i_72_, int i_73_, int i_74_) {
        try {
            if (1 == i_69_) {
                if (i_70_ == i && i_71_ == i_68_)
                    return true;
            } else if (i_70_ >= i && i_70_ <= i_69_ + i - 1 && i_71_ >= i_71_ && i_71_ <= i_71_ + i_69_ - 1)
                return true;
            i -= 1487776559 * anInt3151;
            i_68_ -= anInt3152 * 1415525851;
            i_70_ -= anInt3151 * 1487776559;
            i_71_ -= anInt3152 * 1415525851;
            if (1 == i_69_) {
                if (i_72_ == 0) {
                    if (0 == i_73_) {
                        if (i == i_70_ - 1 && i_71_ == i_68_)
                            return true;
                        if (i == i_70_ && 1 + i_71_ == i_68_ && (anIntArrayArray3155[i][i_68_] & 0x2c0120) == 0)
                            return true;
                        if (i == i_70_ && i_68_ == i_71_ - 1 && (anIntArrayArray3155[i][i_68_] & 0x2c0102) == 0)
                            return true;
                    } else if (1 == i_73_) {
                        if (i_70_ == i && i_68_ == 1 + i_71_)
                            return true;
                        if (i_70_ - 1 == i && i_68_ == i_71_ && 0 == (anIntArrayArray3155[i][i_68_] & 0x2c0108))
                            return true;
                        if (1 + i_70_ == i && i_71_ == i_68_ && (anIntArrayArray3155[i][i_68_] & 0x2c0180) == 0)
                            return true;
                    } else if (2 == i_73_) {
                        if (1 + i_70_ == i && i_71_ == i_68_)
                            return true;
                        if (i == i_70_ && i_68_ == 1 + i_71_ && 0 == (anIntArrayArray3155[i][i_68_] & 0x2c0120))
                            return true;
                        if (i == i_70_ && i_68_ == i_71_ - 1 && (anIntArrayArray3155[i][i_68_] & 0x2c0102) == 0)
                            return true;
                    } else if (i_73_ == 3) {
                        if (i == i_70_ && i_71_ - 1 == i_68_)
                            return true;
                        if (i_70_ - 1 == i && i_68_ == i_71_ && 0 == (anIntArrayArray3155[i][i_68_] & 0x2c0108))
                            return true;
                        if (i == 1 + i_70_ && i_71_ == i_68_ && 0 == (anIntArrayArray3155[i][i_68_] & 0x2c0180))
                            return true;
                    }
                }
                if (i_72_ == 2) {
                    if (0 == i_73_) {
                        if (i_70_ - 1 == i && i_68_ == i_71_)
                            return true;
                        if (i == i_70_ && 1 + i_71_ == i_68_)
                            return true;
                        if (i == i_70_ + 1 && i_71_ == i_68_ && 0 == (anIntArrayArray3155[i][i_68_] & 0x2c0180))
                            return true;
                        if (i == i_70_ && i_71_ - 1 == i_68_ && (anIntArrayArray3155[i][i_68_] & 0x2c0102) == 0)
                            return true;
                    } else if (i_73_ == 1) {
                        if (i_70_ - 1 == i && i_71_ == i_68_ && (anIntArrayArray3155[i][i_68_] & 0x2c0108) == 0)
                            return true;
                        if (i == i_70_ && 1 + i_71_ == i_68_)
                            return true;
                        if (i == 1 + i_70_ && i_68_ == i_71_)
                            return true;
                        if (i == i_70_ && i_71_ - 1 == i_68_ && (anIntArrayArray3155[i][i_68_] & 0x2c0102) == 0)
                            return true;
                    } else if (2 == i_73_) {
                        if (i_70_ - 1 == i && i_68_ == i_71_ && 0 == (anIntArrayArray3155[i][i_68_] & 0x2c0108))
                            return true;
                        if (i == i_70_ && i_68_ == 1 + i_71_ && (anIntArrayArray3155[i][i_68_] & 0x2c0120) == 0)
                            return true;
                        if (i == i_70_ + 1 && i_71_ == i_68_)
                            return true;
                        if (i == i_70_ && i_68_ == i_71_ - 1)
                            return true;
                    } else if (3 == i_73_) {
                        if (i_70_ - 1 == i && i_68_ == i_71_)
                            return true;
                        if (i == i_70_ && i_71_ + 1 == i_68_ && (anIntArrayArray3155[i][i_68_] & 0x2c0120) == 0)
                            return true;
                        if (1 + i_70_ == i && i_71_ == i_68_ && 0 == (anIntArrayArray3155[i][i_68_] & 0x2c0180))
                            return true;
                        if (i == i_70_ && i_71_ - 1 == i_68_)
                            return true;
                    }
                }
                if (9 == i_72_) {
                    if (i_70_ == i && 1 + i_71_ == i_68_ && 0 == (anIntArrayArray3155[i][i_68_] & 0x20))
                        return true;
                    if (i == i_70_ && i_68_ == i_71_ - 1 && (anIntArrayArray3155[i][i_68_] & 0x2) == 0)
                        return true;
                    if (i_70_ - 1 == i && i_71_ == i_68_ && (anIntArrayArray3155[i][i_68_] & 0x8) == 0)
                        return true;
                    if (i == 1 + i_70_ && i_71_ == i_68_ && (anIntArrayArray3155[i][i_68_] & 0x80) == 0)
                        return true;
                }
            } else {
                int i_75_ = i_69_ + i - 1;
                int i_76_ = i_69_ + i_68_ - 1;
                if (0 == i_72_) {
                    if (i_73_ == 0) {
                        if (i_70_ - i_69_ == i && i_71_ >= i_68_ && i_71_ <= i_76_)
                            return true;
                        if (i_70_ >= i && i_70_ <= i_75_ && i_68_ == i_71_ + 1 && 0 == (anIntArrayArray3155[i_70_][i_68_] & 0x2c0120))
                            return true;
                        if (i_70_ >= i && i_70_ <= i_75_ && i_68_ == i_71_ - i_69_ && 0 == (anIntArrayArray3155[i_70_][i_76_] & 0x2c0102))
                            return true;
                    } else if (i_73_ == 1) {
                        if (i_70_ >= i && i_70_ <= i_75_ && i_68_ == 1 + i_71_)
                            return true;
                        if (i_70_ - i_69_ == i && i_71_ >= i_68_ && i_71_ <= i_76_ && ((anIntArrayArray3155[i_75_][i_71_] & 0x2c0108) == 0))
                            return true;
                        if (i_70_ + 1 == i && i_71_ >= i_68_ && i_71_ <= i_76_ && (anIntArrayArray3155[i][i_71_] & 0x2c0180) == 0)
                            return true;
                    } else if (i_73_ == 2) {
                        if (i == 1 + i_70_ && i_71_ >= i_68_ && i_71_ <= i_76_)
                            return true;
                        if (i_70_ >= i && i_70_ <= i_75_ && i_71_ + 1 == i_68_ && ((anIntArrayArray3155[i_70_][i_68_] & 0x2c0120) == 0))
                            return true;
                        if (i_70_ >= i && i_70_ <= i_75_ && i_71_ - i_69_ == i_68_ && 0 == (anIntArrayArray3155[i_70_][i_76_] & 0x2c0102))
                            return true;
                    } else if (3 == i_73_) {
                        if (i_70_ >= i && i_70_ <= i_75_ && i_71_ - i_69_ == i_68_)
                            return true;
                        if (i_70_ - i_69_ == i && i_71_ >= i_68_ && i_71_ <= i_76_ && ((anIntArrayArray3155[i_75_][i_71_] & 0x2c0108) == 0))
                            return true;
                        if (i == i_70_ + 1 && i_71_ >= i_68_ && i_71_ <= i_76_ && 0 == (anIntArrayArray3155[i][i_71_] & 0x2c0180))
                            return true;
                    }
                }
                if (2 == i_72_) {
                    if (0 == i_73_) {
                        if (i == i_70_ - i_69_ && i_71_ >= i_68_ && i_71_ <= i_76_)
                            return true;
                        if (i_70_ >= i && i_70_ <= i_75_ && i_68_ == 1 + i_71_)
                            return true;
                        if (i_70_ + 1 == i && i_71_ >= i_68_ && i_71_ <= i_76_ && 0 == (anIntArrayArray3155[i][i_71_] & 0x2c0180))
                            return true;
                        if (i_70_ >= i && i_70_ <= i_75_ && i_68_ == i_71_ - i_69_ && 0 == (anIntArrayArray3155[i_70_][i_76_] & 0x2c0102))
                            return true;
                    } else if (i_73_ == 1) {
                        if (i == i_70_ - i_69_ && i_71_ >= i_68_ && i_71_ <= i_76_ && 0 == (anIntArrayArray3155[i_75_][i_71_] & 0x2c0108))
                            return true;
                        if (i_70_ >= i && i_70_ <= i_75_ && 1 + i_71_ == i_68_)
                            return true;
                        if (i == 1 + i_70_ && i_71_ >= i_68_ && i_71_ <= i_76_)
                            return true;
                        if (i_70_ >= i && i_70_ <= i_75_ && i_68_ == i_71_ - i_69_ && ((anIntArrayArray3155[i_70_][i_76_] & 0x2c0102) == 0))
                            return true;
                    } else if (i_73_ == 2) {
                        if (i_70_ - i_69_ == i && i_71_ >= i_68_ && i_71_ <= i_76_ && 0 == (anIntArrayArray3155[i_75_][i_71_] & 0x2c0108))
                            return true;
                        if (i_70_ >= i && i_70_ <= i_75_ && i_71_ + 1 == i_68_ && ((anIntArrayArray3155[i_70_][i_68_] & 0x2c0120) == 0))
                            return true;
                        if (i == i_70_ + 1 && i_71_ >= i_68_ && i_71_ <= i_76_)
                            return true;
                        if (i_70_ >= i && i_70_ <= i_75_ && i_71_ - i_69_ == i_68_)
                            return true;
                    } else if (3 == i_73_) {
                        if (i == i_70_ - i_69_ && i_71_ >= i_68_ && i_71_ <= i_76_)
                            return true;
                        if (i_70_ >= i && i_70_ <= i_75_ && i_71_ + 1 == i_68_ && 0 == (anIntArrayArray3155[i_70_][i_68_] & 0x2c0120))
                            return true;
                        if (1 + i_70_ == i && i_71_ >= i_68_ && i_71_ <= i_76_ && (anIntArrayArray3155[i][i_71_] & 0x2c0180) == 0)
                            return true;
                        if (i_70_ >= i && i_70_ <= i_75_ && i_71_ - i_69_ == i_68_)
                            return true;
                    }
                }
                if (9 == i_72_) {
                    if (i_70_ >= i && i_70_ <= i_75_ && i_71_ + 1 == i_68_ && 0 == (anIntArrayArray3155[i_70_][i_68_] & 0x2c0120))
                        return true;
                    if (i_70_ >= i && i_70_ <= i_75_ && i_68_ == i_71_ - i_69_ && 0 == (anIntArrayArray3155[i_70_][i_76_] & 0x2c0102))
                        return true;
                    if (i_70_ - i_69_ == i && i_71_ >= i_68_ && i_71_ <= i_76_ && 0 == (anIntArrayArray3155[i_75_][i_71_] & 0x2c0108))
                        return true;
                    if (1 + i_70_ == i && i_71_ >= i_68_ && i_71_ <= i_76_ && (anIntArrayArray3155[i][i_71_] & 0x2c0180) == 0)
                        return true;
                }
            }
            return false;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lz.s(").append(')').toString());
        }
    }

    public void method2743(int i, int i_77_, int i_78_, int i_79_, boolean bool, boolean bool_80_) {
        try {
            i -= 1487776559 * anInt3151;
            i_77_ -= anInt3152 * 1415525851;
            if (0 == i_78_) {
                if (i_79_ == 0) {
                    method2737(i, i_77_, 128, (byte) -26);
                    method2737(i - 1, i_77_, 8, (byte) -13);
                }
                if (i_79_ == 1) {
                    method2737(i, i_77_, 2, (byte) 23);
                    method2737(i, i_77_ + 1, 32, (byte) -16);
                }
                if (i_79_ == 2) {
                    method2737(i, i_77_, 8, (byte) 5);
                    method2737(i + 1, i_77_, 128, (byte) -42);
                }
                if (i_79_ == 3) {
                    method2737(i, i_77_, 32, (byte) -12);
                    method2737(i, i_77_ - 1, 2, (byte) 81);
                }
            }
            if (i_78_ == 1 || 3 == i_78_) {
                if (i_79_ == 0) {
                    method2737(i, i_77_, 1, (byte) 93);
                    method2737(i - 1, i_77_ + 1, 16, (byte) -43);
                }
                if (i_79_ == 1) {
                    method2737(i, i_77_, 4, (byte) 92);
                    method2737(1 + i, i_77_ + 1, 64, (byte) 48);
                }
                if (i_79_ == 2) {
                    method2737(i, i_77_, 16, (byte) 13);
                    method2737(1 + i, i_77_ - 1, 1, (byte) -84);
                }
                if (i_79_ == 3) {
                    method2737(i, i_77_, 64, (byte) -11);
                    method2737(i - 1, i_77_ - 1, 4, (byte) -50);
                }
            }
            if (i_78_ == 2) {
                if (0 == i_79_) {
                    method2737(i, i_77_, 130, (byte) -105);
                    method2737(i - 1, i_77_, 8, (byte) -47);
                    method2737(i, i_77_ + 1, 32, (byte) 4);
                }
                if (i_79_ == 1) {
                    method2737(i, i_77_, 10, (byte) 53);
                    method2737(i, i_77_ + 1, 32, (byte) -27);
                    method2737(i + 1, i_77_, 128, (byte) 3);
                }
                if (i_79_ == 2) {
                    method2737(i, i_77_, 40, (byte) -72);
                    method2737(i + 1, i_77_, 128, (byte) 86);
                    method2737(i, i_77_ - 1, 2, (byte) -21);
                }
                if (i_79_ == 3) {
                    method2737(i, i_77_, 160, (byte) -31);
                    method2737(i, i_77_ - 1, 2, (byte) -20);
                    method2737(i - 1, i_77_, 8, (byte) -49);
                }
            }
            if (bool) {
                if (0 == i_78_) {
                    if (0 == i_79_) {
                        method2737(i, i_77_, 65536, (byte) 13);
                        method2737(i - 1, i_77_, 4096, (byte) 51);
                    }
                    if (1 == i_79_) {
                        method2737(i, i_77_, 1024, (byte) -68);
                        method2737(i, 1 + i_77_, 16384, (byte) -15);
                    }
                    if (2 == i_79_) {
                        method2737(i, i_77_, 4096, (byte) 76);
                        method2737(i + 1, i_77_, 65536, (byte) -79);
                    }
                    if (i_79_ == 3) {
                        method2737(i, i_77_, 16384, (byte) -30);
                        method2737(i, i_77_ - 1, 1024, (byte) -32);
                    }
                }
                if (1 == i_78_ || 3 == i_78_) {
                    if (i_79_ == 0) {
                        method2737(i, i_77_, 512, (byte) 109);
                        method2737(i - 1, i_77_ + 1, 8192, (byte) -18);
                    }
                    if (1 == i_79_) {
                        method2737(i, i_77_, 2048, (byte) 20);
                        method2737(i + 1, i_77_ + 1, 32768, (byte) 8);
                    }
                    if (i_79_ == 2) {
                        method2737(i, i_77_, 8192, (byte) -7);
                        method2737(i + 1, i_77_ - 1, 512, (byte) -35);
                    }
                    if (i_79_ == 3) {
                        method2737(i, i_77_, 32768, (byte) 23);
                        method2737(i - 1, i_77_ - 1, 2048, (byte) 85);
                    }
                }
                if (2 == i_78_) {
                    if (0 == i_79_) {
                        method2737(i, i_77_, 66560, (byte) -97);
                        method2737(i - 1, i_77_, 4096, (byte) 4);
                        method2737(i, i_77_ + 1, 16384, (byte) 9);
                    }
                    if (1 == i_79_) {
                        method2737(i, i_77_, 5120, (byte) -23);
                        method2737(i, 1 + i_77_, 16384, (byte) 24);
                        method2737(i + 1, i_77_, 65536, (byte) -1);
                    }
                    if (i_79_ == 2) {
                        method2737(i, i_77_, 20480, (byte) 83);
                        method2737(i + 1, i_77_, 65536, (byte) -79);
                        method2737(i, i_77_ - 1, 1024, (byte) -98);
                    }
                    if (i_79_ == 3) {
                        method2737(i, i_77_, 81920, (byte) 13);
                        method2737(i, i_77_ - 1, 1024, (byte) -67);
                        method2737(i - 1, i_77_, 4096, (byte) 75);
                    }
                }
            }
            if (bool_80_) {
                if (0 == i_78_) {
                    if (0 == i_79_) {
                        method2737(i, i_77_, 536870912, (byte) 79);
                        method2737(i - 1, i_77_, 33554432, (byte) -26);
                    }
                    if (1 == i_79_) {
                        method2737(i, i_77_, 8388608, (byte) 91);
                        method2737(i, i_77_ + 1, 134217728, (byte) -32);
                    }
                    if (i_79_ == 2) {
                        method2737(i, i_77_, 33554432, (byte) 78);
                        method2737(i + 1, i_77_, 536870912, (byte) 6);
                    }
                    if (i_79_ == 3) {
                        method2737(i, i_77_, 134217728, (byte) -27);
                        method2737(i, i_77_ - 1, 8388608, (byte) -52);
                    }
                }
                if (i_78_ == 1 || 3 == i_78_) {
                    if (i_79_ == 0) {
                        method2737(i, i_77_, 4194304, (byte) 12);
                        method2737(i - 1, 1 + i_77_, 67108864, (byte) -38);
                    }
                    if (i_79_ == 1) {
                        method2737(i, i_77_, 16777216, (byte) 33);
                        method2737(1 + i, i_77_ + 1, 268435456, (byte) 71);
                    }
                    if (2 == i_79_) {
                        method2737(i, i_77_, 67108864, (byte) -69);
                        method2737(i + 1, i_77_ - 1, 4194304, (byte) -66);
                    }
                    if (3 == i_79_) {
                        method2737(i, i_77_, 268435456, (byte) -29);
                        method2737(i - 1, i_77_ - 1, 16777216, (byte) -32);
                    }
                }
                if (i_78_ == 2) {
                    if (0 == i_79_) {
                        method2737(i, i_77_, 545259520, (byte) -72);
                        method2737(i - 1, i_77_, 33554432, (byte) 62);
                        method2737(i, 1 + i_77_, 134217728, (byte) 17);
                    }
                    if (1 == i_79_) {
                        method2737(i, i_77_, 41943040, (byte) -58);
                        method2737(i, 1 + i_77_, 134217728, (byte) -18);
                        method2737(1 + i, i_77_, 536870912, (byte) 95);
                    }
                    if (i_79_ == 2) {
                        method2737(i, i_77_, 167772160, (byte) 9);
                        method2737(1 + i, i_77_, 536870912, (byte) -34);
                        method2737(i, i_77_ - 1, 8388608, (byte) 51);
                    }
                    if (3 == i_79_) {
                        method2737(i, i_77_, 671088640, (byte) 71);
                        method2737(i, i_77_ - 1, 8388608, (byte) -23);
                        method2737(i - 1, i_77_, 33554432, (byte) 1);
                    }
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lz.u(").append(')').toString());
        }
    }

    public void method2744(int i, int i_82_, int i_83_) {
        try {
            i -= 1487776559 * anInt3151;
            i_82_ -= 1415525851 * anInt3152;
            anIntArrayArray3155[i][i_82_] &= ~0x200000;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lz.q(").append(')').toString());
        }
    }
}
