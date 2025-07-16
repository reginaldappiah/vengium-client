package com.jagex;/* Class264 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.utils.StringUtils;

import java.util.Random;

public abstract class FontToolkit {
    public static FontToolkit fontToolkit;
    static int anInt2826;
    static int color;
    static int string = -2103918561;
    static int anInt2832;
    static int glow;
    static int shadow;
    static int anInt2836;
    static int underline = 1869530301;
    static String[] aStringArray2838;

    static {
        anInt2826 = 0;
        color = 0;
        glow = 0;
        shadow = 0;
        anInt2836 = 0;
        anInt2832 = 0;
        aStringArray2838 = new String[100];
    }

    GraphicsToolkit graphicsToolkit;
    RSFontMetrics fontMetrics;

    FontToolkit(GraphicsToolkit graphicsToolkit, RSFontMetrics RSFontMetrics) {
        this.graphicsToolkit = graphicsToolkit;
        this.fontMetrics = RSFontMetrics;
    }

    public static void sendMessage(int rights, String message) {
        PublicMessage.sendPublicMessage(rights, 0, "", "", "", message);
    }

    public static void method5744() {
        fontToolkit = ((FontToolkit) StaticMethods5.fonts.loadOther((GameClient.defaultFontRenderProvider), (399302739 * Class74.containerID), true, true));
        Class74.aClass505_695 = StaticMethods5.fonts.method1879(GameClient.defaultFontRenderProvider, (399302739 * Class74.containerID));
        StaticMethods.aClass264_3673 = ((FontToolkit) StaticMethods5.fonts.loadOther((GameClient.defaultFontRenderProvider), (1178461027 * Class74.anInt690), true, true));
        StaticMethods.aClass505_8369 = StaticMethods5.fonts.method1879(GameClient.defaultFontRenderProvider, (1178461027 * Class74.anInt690));
        StaticMethods.b12_full_monochrome = ((FontToolkit) StaticMethods5.fonts.loadOther((GameClient.defaultFontRenderProvider), (-1372765471 * Class74.anInt698), true, true));
        Class82_Sub19_Sub1.aClass505_9111 = StaticMethods5.fonts.method1879(GameClient.defaultFontRenderProvider, (Class74.anInt698 * -1372765471));
    }

    public void method2474(String string, int i, int i_0_, int color, int shadow) {
        if (null != string) {
            method2481(color, shadow);
            method2484(string, i - this.fontMetrics.method6264(string), i_0_, null, null, null, 0, 0);
        }
    }

    public int method2475(String string, int i, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, SpriteToolkit[] spriteToolkits, int[] is, ToolkitLoader toolkitLoader, int i_12_, int i_13_) {
        return drawText(string, i, i_4_, i_5_, i_6_, i_7_, i_8_, i_9_, i_10_, i_11_, 0, spriteToolkits, is, toolkitLoader, i_12_, i_13_);
    }

    public int drawText(String string, int i, int i_15_, int i_16_, int i_17_, int i_18_, int i_19_, int i_20_, int i_21_, int i_22_, int i_23_, SpriteToolkit[] class57s, int[] is, ToolkitLoader toolkitLoader, int i_24_, int i_25_) {
        if (null == string)
            return 0;
        method2481(i_18_, i_19_);
        if (0 == i_22_)
            i_22_ = this.fontMetrics.anInt6200 * -2028004825;
        int[] is_27_;
        if (i_17_ < i_22_ + ((1110385787 * this.fontMetrics.anInt6202) + -1883958527 * (this.fontMetrics.anInt6197)) && i_17_ < i_22_ + i_22_)
            is_27_ = null;
        else
            is_27_ = new int[]{i_16_};
        int i_28_ = this.fontMetrics.method6257(string, is_27_, aStringArray2838, class57s);
        if (-1 == i_23_) {
            i_23_ = i_17_ / i_22_;
            if (i_23_ <= 0)
                i_23_ = 1;
        }
        if (i_23_ > 0 && i_28_ >= i_23_) {
            aStringArray2838[i_23_ - 1] = (this.fontMetrics.method6256(aStringArray2838[i_23_ - 1], i_16_, class57s));
            i_28_ = i_23_;
        }
        if (3 == i_21_ && 1 == i_28_)
            i_21_ = 1;
        int i_29_;
        if (0 == i_21_)
            i_29_ = i_15_ + (1110385787 * this.fontMetrics.anInt6202);
        else if (1 == i_21_)
            i_29_ = ((i_17_ - (this.fontMetrics.anInt6202 * 1110385787) - (-1883958527 * this.fontMetrics.anInt6197) - i_22_ * (i_28_ - 1)) / 2 + ((this.fontMetrics.anInt6202 * 1110385787) + i_15_));
        else if (i_21_ == 2)
            i_29_ = (i_17_ + i_15_ - (this.fontMetrics.anInt6197 * -1883958527) - i_22_ * (i_28_ - 1));
        else {
            int i_30_ = ((i_17_ - (this.fontMetrics.anInt6202 * 1110385787) - (-1883958527 * this.fontMetrics.anInt6197) - (i_28_ - 1) * i_22_) / (i_28_ + 1));
            if (i_30_ < 0)
                i_30_ = 0;
            i_29_ = i_30_ + (i_15_ + 1110385787 * (this.fontMetrics.anInt6202));
            i_22_ += i_30_;
        }
        for (int i_31_ = 0; i_31_ < i_28_; i_31_++) {
            if (0 == i_20_)
                method2484(aStringArray2838[i_31_], i, i_29_, class57s, is, toolkitLoader, i_24_, i_25_);
            else if (i_20_ == 1)
                method2484(aStringArray2838[i_31_], i + (i_16_ - (this.fontMetrics.method6264(aStringArray2838[i_31_]))) / 2, i_29_, class57s, is, toolkitLoader, i_24_, i_25_);
            else if (2 == i_20_)
                method2484(aStringArray2838[i_31_], (i + i_16_ - (this.fontMetrics.method6264(aStringArray2838[i_31_]))), i_29_, class57s, is, toolkitLoader, i_24_, i_25_);
            else if (i_28_ - 1 == i_31_)
                method2484(aStringArray2838[i_31_], i, i_29_, class57s, is, toolkitLoader, i_24_, i_25_);
            else {
                method2483(aStringArray2838[i_31_], i_16_);
                method2484(aStringArray2838[i_31_], i, i_29_, class57s, is, toolkitLoader, i_24_, i_25_);
                anInt2836 = 0;
            }
            i_29_ += i_22_;
        }
        return i_28_;
    }

    public void method2477(String string, int i, int i_32_, int i_33_, int i_34_, int i_35_) {
        if (null != string) {
            method2481(i_33_, i_34_);
            int i_37_ = string.length();
            int[] is = new int[i_37_];
            for (int i_38_ = 0; i_38_ < i_37_; i_38_++)
                is[i_38_] = (int) (Math.sin((double) i_35_ / 5.0 + (double) i_38_ / 2.0) * 5.0);
            method2487(string, i - this.fontMetrics.method6264(string) / 2, i_32_, null, null, null, is);
        }
    }

    public void method2478(String string, int i, int i_39_, int i_40_, int i_41_, int i_42_) {
        if (string != null) {
            method2481(i_40_, i_41_);
            int i_44_ = string.length();
            int[] is = new int[i_44_];
            int[] is_45_ = new int[i_44_];
            for (int i_46_ = 0; i_46_ < i_44_; i_46_++) {
                is[i_46_] = (int) (Math.sin((double) i_46_ / 5.0 + (double) i_42_ / 5.0) * 5.0);
                is_45_[i_46_] = (int) (Math.sin((double) i_46_ / 3.0 + (double) i_42_ / 5.0) * 5.0);
            }
            method2487(string, i - this.fontMetrics.method6264(string) / 2, i_39_, null, null, is, is_45_);
        }
    }

    public void method2479(String string, int i, int i_47_, int i_48_, int i_49_, int i_50_, int i_51_) {
        if (null != string) {
            method2481(i_48_, i_49_);
            double d = 7.0 - (double) i_51_ / 8.0;
            if (d < 0.0)
                d = 0.0;
            int i_53_ = string.length();
            int[] is = new int[i_53_];
            for (int i_54_ = 0; i_54_ < i_53_; i_54_++)
                is[i_54_] = (int) (Math.sin((double) i_50_ / 1.0 + (double) i_54_ / 1.5) * d);
            method2487(string, i - this.fontMetrics.method6264(string) / 2, i_47_, null, null, null, is);
        }
    }

    public int method2480(String string, int i, int i_55_, int i_56_, int i_57_, Random random, int i_58_, SpriteToolkit[] spriteToolkits, int[] is) {
        if (null == string)
            return 0;
        random.setSeed((long) i_58_);
        int i_60_ = 192 + (random.nextInt() & 0x1f);
        method2481(i_60_ << 24 | i_56_ & 0xffffff, i_60_ << 24 | i_57_ & 0xffffff);
        int i_61_ = string.length();
        int[] is_62_ = new int[i_61_];
        int i_63_ = 0;
        for (int i_64_ = 0; i_64_ < i_61_; i_64_++) {
            is_62_[i_64_] = i_63_;
            if ((random.nextInt() & 0x3) == 0)
                i_63_++;
        }
        method2487(string, i, i_55_, spriteToolkits, is, is_62_, null);
        return i_63_;
    }

    void method2481(int color, int shadow) {
        string = -2103918561;
        underline = 1869530301;
        FontToolkit.color = (anInt2826 = -1857413169 * color) * -134884105;
        anInt2836 = 0;
        anInt2832 = 0;
        if (shadow == -1)
            shadow = 0;
        FontToolkit.shadow = (FontToolkit.glow = shadow * -1568224037) * -860187975;
    }

    void method2482(String string) {
        try {
            if (string.startsWith("col="))
                color = (-882366071 * color & ~0xffffff | (StaticMethods.method4924(string.substring(4), 16) & 0xffffff)) * -1158210375;
            else if (string.equals("/col"))
                color = -1158210375 * (-882366071 * color & ~0xffffff | 1929545519 * anInt2826 & 0xffffff);
            if (string.startsWith("argb="))
                color = StaticMethods.method4924(string.substring(5), 16) * -1158210375;
            else if (string.equals("/argb"))
                color = anInt2826 * -134884105;
            else if (string.startsWith("str="))
                FontToolkit.string = (color * -882366071 & ~0xffffff | StaticMethods.method4924(string.substring(4), 16)) * 2103918561;
            else if (string.equals("str"))
                FontToolkit.string = (color * -882366071 & ~0xffffff | 0x800000) * 2103918561;
            else if (string.equals("/str"))
                FontToolkit.string = -2103918561;
            else if (string.startsWith("u="))
                underline = (color * -882366071 & ~0xffffff | StaticMethods.method4924(string.substring(2), 16)) * -1869530301;
            else if (string.equals("u"))
                underline = -1869530301 * (color * -882366071 & ~0xffffff);
            else if (string.equals("/u"))
                underline = 1869530301;
            else if (string.equalsIgnoreCase("shad=-1"))
                shadow = 0;
            else if (string.startsWith("shad="))
                shadow = (color * -882366071 & ~0xffffff | StaticMethods.method4924(string.substring(5), 16)) * -1352863677;
            else if (string.equals("shad"))
                shadow = (color * -882366071 & ~0xffffff) * -1352863677;
            else if (string.equals("/shad"))
                shadow = -860187975 * glow;
            else if (string.equals("br"))
                method2481(1929545519 * anInt2826, glow * -511946925);
        } catch (Exception exception) {

        }
    }

    void method2483(String string, int i) {
        int i_68_ = 0;
        boolean bool = false;
        for (int i_69_ = 0; i_69_ < string.length(); i_69_++) {
            char c = string.charAt(i_69_);
            if (c == '<')
                bool = true;
            else if ('>' == c)
                bool = false;
            else if (!bool && c == ' ')
                i_68_++;
        }
        if (i_68_ > 0)
            anInt2836 = (i - this.fontMetrics.method6264(string) << 8) / i_68_ * -1196619179;
    }

    void method2484(String string, int i, int i_70_, SpriteToolkit[] spriteToolkits, int[] keys, ToolkitLoader toolkitLoader, int i_71_, int i_72_) {
        i_70_ -= this.fontMetrics.anInt6200 * -2028004825;
        int i_74_ = -1;
        int i_75_ = -1;
        int i_76_ = string.length();
        for (int i_77_ = 0; i_77_ < i_76_; i_77_++) {
            char c = (char) (Class124.method1387(string.charAt(i_77_)) & 0xff);
            if (60 == c)
                i_74_ = i_77_;
            else {
                if (c == 62 && -1 != i_74_) {
                    String shortcut = string.substring(1 + i_74_, i_77_);
                    i_74_ = -1;
                    if (shortcut.equals("lt"))
                        c = '<';
                    else if (shortcut.equals("gt"))
                        c = '>';
                    else if (shortcut.equals("nbsp"))
                        c = '\u00a0';
                    else if (shortcut.equals("shy"))
                        c = '\u00ad';
                    else if (shortcut.equals("times"))
                        c = '\u00d7';
                    else if (shortcut.equals("euro"))
                        c = '\u20ac';
                    else if (shortcut.equals("copy"))
                        c = '\u00a9';
                    else if (shortcut.equals("reg"))
                        c = '\u00ae';
                    else {
                        if (shortcut.startsWith("img=")) {
                            try {
                                int index = (StringUtils.method1998(shortcut.substring(4)));
                                SpriteToolkit spriteToolkit = spriteToolkits[index];
                                int i_80_ = (keys != null ? keys[index] : spriteToolkit.getPaddedHeight());
                                if ((color * -882366071 & ~0xffffff) == -16777216)
                                    spriteToolkit.draw(i, (i_70_ + ((this.fontMetrics.anInt6200) * -2028004825) - i_80_), 1, 0, 1);
                                else
                                    spriteToolkit.draw(i, (((this.fontMetrics.anInt6200) * -2028004825) + i_70_ - i_80_), 0, (((-882366071 * color) & ~0xffffff) | 0xffffff), 1);
                                i += spriteToolkits[index].getPaddedWidth();
                                i_75_ = -1;
                            } catch (Exception exception) {
                                    /* empty */
                            }
                        } else
                            method2482(shortcut);
                        continue;
                    }
                }
                if (i_74_ == -1) {
                    if (i_75_ != -1)
                        i += this.fontMetrics.method6253(i_75_, c);
                    if (32 != c) {
                        if (toolkitLoader == null) {
                            if (0 != (-675619733 * shadow & ~0xffffff))
                                UA(c, i + 1, i_70_ + 1, shadow * -675619733, true);
                            UA(c, i, i_70_, color * -882366071, false);
                        } else {
                            if ((-675619733 * shadow & ~0xffffff) != 0)
                                method2486(c, 1 + i, i_70_ + 1, shadow * -675619733, true, toolkitLoader, i_71_, i_72_);
                            method2486(c, i, i_70_, color * -882366071, false, toolkitLoader, i_71_, i_72_);
                        }
                    } else if (anInt2836 * 1135059709 > 0) {
                        anInt2832 += anInt2836 * -1910373915;
                        i += anInt2832 * 1199106873 >> 8;
                        anInt2832 = (anInt2832 * 1199106873 & 0xff) * 1696502537;
                    }
                    int i_81_ = this.fontMetrics.method6255(c);
                    if (FontToolkit.string * -1546042335 != -1)
                        this.graphicsToolkit.method4990(i, i_70_ + (int) ((double) ((this.fontMetrics.anInt6200) * -2028004825) * 0.7), i_81_, -1546042335 * FontToolkit.string);
                    if (-1731221141 * underline != -1)
                        this.graphicsToolkit.method4990(i, (-2028004825 * (this.fontMetrics.anInt6200) + i_70_ + 1), i_81_, -1731221141 * underline);
                    i += i_81_;
                    i_75_ = c;
                }
            }
        }
    }

    public int drawClientText(String string, int i, int i_82_, int i_83_, int i_84_, int i_85_, int i_86_, int i_87_, int i_88_, Random random, int i_89_, int[] is, SpriteToolkit[] spriteToolkits, int[] is_90_) {
        if (null == string)
            return 0;
        random.setSeed((long) i_89_);
        int i_92_ = 192 + (random.nextInt() & 0x1f);
        method2481(i_92_ << 24 | i_85_ & 0xffffff, i_86_ == -1 ? 0 : i_92_ << 24 | i_86_ & 0xffffff);
        int i_93_ = string.length();
        int[] is_94_ = new int[i_93_];
        int i_95_ = 0;
        for (int i_96_ = 0; i_96_ < i_93_; i_96_++) {
            is_94_[i_96_] = i_95_;
            if ((random.nextInt() & 0x3) == 0)
                i_95_++;
        }
        int i_97_ = i;
        int i_98_ = (this.fontMetrics.anInt6202 * 1110385787 + i_82_);
        int i_99_ = -1;
        if (1 == i_88_)
            i_98_ += (i_84_ - (1110385787 * this.fontMetrics.anInt6202) - -1883958527 * (this.fontMetrics.anInt6197)) / 2;
        else if (2 == i_88_)
            i_98_ = i_84_ + i_82_ - (this.fontMetrics.anInt6197) * -1883958527;
        if (1 == i_87_) {
            i_99_ = (this.fontMetrics.method6264(string) + i_95_);
            i_97_ += (i_83_ - i_99_) / 2;
        } else if (i_87_ == 2) {
            i_99_ = (this.fontMetrics.method6264(string) + i_95_);
            i_97_ += i_83_ - i_99_;
        }
        method2487(string, i_97_, i_98_, spriteToolkits, is_90_, is_94_, null);
        if (is != null) {
            if (-1 == i_99_)
                i_99_ = this.fontMetrics.method6264(string) + i_95_;
            is[0] = i_97_;
            is[1] = i_98_ - (1110385787 * this.fontMetrics.anInt6202);
            is[2] = i_99_;
            is[3] = (-1883958527 * this.fontMetrics.anInt6197 + (1110385787 * this.fontMetrics.anInt6202));
        }
        return i_95_;
    }

    abstract void method2486(char c, int i, int i_100_, int i_101_, boolean bool, ToolkitLoader toolkitLoader, int i_102_, int i_103_);

    void method2487(String string, int i, int i_108_, SpriteToolkit[] spriteToolkits, int[] is, int[] is_109_, int[] is_110_) {
        i_108_ -= -2028004825 * this.fontMetrics.anInt6200;
        int i_112_ = -1;
        int i_113_ = -1;
        int i_114_ = 0;
        int i_115_ = string.length();
        for (int i_116_ = 0; i_116_ < i_115_; i_116_++) {
            char c = (char) (Class124.method1387(string.charAt(i_116_)) & 0xff);
            if (c == 60)
                i_112_ = i_116_;
            else {
                if (c == 62 && -1 != i_112_) {
                    String string_117_ = string.substring(1 + i_112_, i_116_);
                    i_112_ = -1;
                    if (string_117_.equals("lt"))
                        c = '<';
                    else if (string_117_.equals("gt"))
                        c = '>';
                    else if (string_117_.equals("nbsp"))
                        c = '\u00a0';
                    else if (string_117_.equals("shy"))
                        c = '\u00ad';
                    else if (string_117_.equals("times"))
                        c = '\u00d7';
                    else if (string_117_.equals("euro"))
                        c = '\u20ac';
                    else if (string_117_.equals("copy"))
                        c = '\u00a9';
                    else if (string_117_.equals("reg"))
                        c = '\u00ae';
                    else {
                        if (string_117_.startsWith("img=")) {
                            try {
                                int i_118_;
                                if (is_109_ != null)
                                    i_118_ = is_109_[i_114_];
                                else
                                    i_118_ = 0;
                                int i_119_;
                                if (is_110_ != null)
                                    i_119_ = is_110_[i_114_];
                                else
                                    i_119_ = 0;
                                i_114_++;
                                int i_120_ = (StringUtils.method1998(string_117_.substring(4)));
                                SpriteToolkit class57 = spriteToolkits[i_120_];
                                int i_121_ = (null != is ? is[i_120_] : class57.getPaddedHeight());
                                class57.draw(i + i_118_, (i_108_ + ((this.fontMetrics.anInt6200) * -2028004825) - i_121_ + i_119_), 1, 0, 1);
                                i += spriteToolkits[i_120_].getPaddedWidth();
                                i_113_ = -1;
                            } catch (Exception exception) {
                                    /* empty */
                            }
                        } else
                            method2482(string_117_);
                        continue;
                    }
                }
                if (i_112_ == -1) {
                    if (-1 != i_113_)
                        i += this.fontMetrics.method6253(i_113_, c);
                    int i_122_;
                    if (null != is_109_)
                        i_122_ = is_109_[i_114_];
                    else
                        i_122_ = 0;
                    int i_123_;
                    if (null != is_110_)
                        i_123_ = is_110_[i_114_];
                    else
                        i_123_ = 0;
                    i_114_++;
                    if (c != 32) {
                        if ((shadow * -675619733 & ~0xffffff) != 0)
                            UA(c, 1 + i + i_122_, i_123_ + (i_108_ + 1), -675619733 * shadow, true);
                        UA(c, i_122_ + i, i_108_ + i_123_, color * -882366071, false);
                    } else if (anInt2836 * 1135059709 > 0) {
                        anInt2832 += -1910373915 * anInt2836;
                        i += anInt2832 * 1199106873 >> 8;
                        anInt2832 = (anInt2832 * 1199106873 & 0xff) * 1696502537;
                    }
                    int i_124_ = this.fontMetrics.method6255(c);
                    if (-1 != -1546042335 * FontToolkit.string)
                        this.graphicsToolkit.method4990(i, (int) (0.7 * (double) ((this.fontMetrics.anInt6200) * -2028004825)) + i_108_, i_124_, -1546042335 * FontToolkit.string);
                    if (underline * -1731221141 != -1)
                        this.graphicsToolkit.method4990(i, i_108_ + -2028004825 * (this.fontMetrics.anInt6200), i_124_, -1731221141 * underline);
                    i += i_124_;
                    i_113_ = c;
                }
            }
        }
    }

    public void method2488(String string, int i, int i_125_, int i_126_, int i_127_) {
        if (null != string) {
            method2481(i_126_, i_127_);
            method2484(string, i, i_125_, null, null, null, 0, 0);
        }
    }

    abstract void UA(char c, int i, int i_133_, int i_134_, boolean bool);

    public void drawTextCentered(String string, int i, int i_135_, int i_136_, int i_137_) {
        if (string != null) {
            method2481(i_136_, i_137_);
            method2484(string, i - this.fontMetrics.method6264(string) / 2, i_135_, null, null, null, 0, 0);
        }
    }

}
