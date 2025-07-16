package com.jagex.utils;

import com.jagex.*;

/**
 * Created by Krimsonowl on 7/11/2017.
 */
public class StringUtils {
    public static char[] symbolSet = {'\u20ac', '\0', '\u201a', '\u0192', '\u201e', '\u2026', '\u2020', '\u2021', '\u02c6', '\u2030', '\u0160', '\u2039', '\u0152', '\0', '\u017d', '\0', '\0', '\u2018', '\u2019', '\u201c', '\u201d', '\u2022', '\u2013', '\u2014', '\u02dc', '\u2122', '\u0161', '\u203a', '\u0153', '\0', '\u017e', '\u0178'};
    public static char[] aCharArray5342 = {'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

    public static int method5619(CharSequence charsequence, int length, boolean bool, int i_4_) {
        if (length < 2 || length > 36)
            throw new IllegalArgumentException(new StringBuilder().append("").append(length).toString());
        boolean bool_5_ = false;
        boolean bool_6_ = false;
        int i_7_ = 0;
        int i_8_ = charsequence.length();
        for (int i_9_ = 0; i_9_ < i_8_; i_9_++) {
            int i_10_ = charsequence.charAt(i_9_);
            if (0 == i_9_) {
                if (45 == i_10_) {
                    bool_5_ = true;
                    continue;
                }
                if (43 == i_10_ && bool) {
                    if (i_4_ >= 543732116) {
                            /* empty */
                    }
                    continue;
                }
            }
            if (i_10_ >= 48 && i_10_ <= 57)
                i_10_ -= 48;
            else if (i_10_ >= 65 && i_10_ <= 90)
                i_10_ -= 55;
            else if (i_10_ >= 97 && i_10_ <= 122)
                i_10_ -= 87;
            else
                throw new NumberFormatException();
            if (i_10_ >= length)
                throw new NumberFormatException();
            if (bool_5_)
                i_10_ = -i_10_;
            int i_11_ = i_7_ * length + i_10_;
            if (i_11_ / length != i_7_)
                throw new NumberFormatException();
            i_7_ = i_11_;
            bool_6_ = true;
        }
        if (!bool_6_)
            throw new NumberFormatException();
        return i_7_;

    }

    public static String method3685(long l, int i, boolean bool, GameLanguage language) {
        char c = ',';
        char c_2_ = '.';
        if (language == GameLanguage.english) {
            c = '.';
            c_2_ = ',';
        }
        if (language == GameLanguage.french)
            c_2_ = '\u00a0';
        boolean bool_3_ = false;
        if (l < 0L) {
            bool_3_ = true;
            l = -l;
        }
        StringBuilder stringbuilder = new StringBuilder(26);
        if (i > 0) {
            for (int i_4_ = 0; i_4_ < i; i_4_++) {
                int i_5_ = (int) l;
                l /= 10L;
                stringbuilder.append((char) (i_5_ + 48 - 10 * (int) l));
            }
            stringbuilder.append(c);
        }
        int i_6_ = 0;
        for (; ; ) {
            int i_7_ = (int) l;
            l /= 10L;
            stringbuilder.append((char) (48 + i_7_ - (int) l * 10));
            if (l == 0L) {
                break;
            }
            if (bool) {
                i_6_++;
                if (0 == i_6_ % 3)
                    stringbuilder.append(c_2_);
            }
        }
        if (bool_3_)
            stringbuilder.append('-');
        return stringbuilder.reverse().toString();
    }

    public static int method1773(char c) {
        try {
            if (c >= 0 && c < Class426.anIntArray5359.length)
                return Class426.anIntArray5359[c];
            return -1;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("gq.a(").append(')').toString());
        }
    }

    public static long method5194(CharSequence charsequence) {
        try {
            long l = 0L;
            int i_494_ = charsequence.length();
            for (int i_495_ = 0; i_495_ < i_494_; i_495_++) {
                l *= 37L;
                char c = charsequence.charAt(i_495_);
                if (c >= 'A' && c <= 'Z')
                    l += (long) ('\001' + c - 'A');
                else if (c >= 'a' && c <= 'z')
                    l += (long) ('\001' + c - 'a');
                else if (c >= '0' && c <= '9')
                    l += (long) (c + '\033' - '0');
                if (l >= 177917621779460413L) {
                    if (-97 == 0)
                        throw new IllegalStateException();
                    break;
                }
            }
            for (/**/; l % 37L == 0L && l != 0L; l /= 37L) {
                /* empty */
            }
            return l;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ra.a(").append(')').toString());
        }
    }

    public static int hash(CharSequence charsequence) {
            int i_18_ = charsequence.length();
            int i_19_ = 0;
            for (int i_20_ = 0; i_20_ < i_18_; i_20_++)
                i_19_ = ((i_19_ << 5) - i_19_ + Class124.method1387(charsequence.charAt(i_20_)));
            return i_19_;
    }

    public static String decryptStringMessage(String string) {
        try {
            int i_2_ = string.length();
            int i_3_ = 0;
            for (int i_4_ = 0; i_4_ < i_2_; i_4_++) {
                char c = string.charAt(i_4_);
                if ('<' == c || c == '>')
                    i_3_ += 3;
            }
            StringBuilder stringbuilder = new StringBuilder(i_2_ + i_3_);
            for (int i_5_ = 0; i_5_ < i_2_; i_5_++) {
                char c = string.charAt(i_5_);
                if ('<' == c)
                    stringbuilder.append("<lt>");
                else if ('>' == c)
                    stringbuilder.append("<gt>");
                else
                    stringbuilder.append(c);
            }
            return stringbuilder.toString();
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("kj.a(").append(')').toString());
        }
    }

    public static String method5996(Object[] objects, int i, int i_0_, byte i_1_) {
        try {
            if (i_0_ == 0)
                return "";
            if (1 == i_0_) {
                CharSequence charsequence = (CharSequence) objects[i];
                if (null == charsequence)
                    return "null";
                return charsequence.toString();
            }
            int i_2_ = i_0_ + i;
            int i_3_ = 0;
            for (int i_4_ = i; i_4_ < i_2_; i_4_++) {
                CharSequence charsequence = (CharSequence) objects[i_4_];
                if (null == charsequence)
                    i_3_ += 4;
                else
                    i_3_ += charsequence.length();
            }
            StringBuilder stringbuilder = new StringBuilder(i_3_);
            for (int i_5_ = i; i_5_ < i_2_; i_5_++) {
                CharSequence charsequence = (CharSequence) objects[i_5_];
                if (charsequence == null)
                    stringbuilder.append("null");
                else
                    stringbuilder.append(charsequence);
            }
            return stringbuilder.toString();
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ta.f(").append(')').toString());
        }
    }

    public static String method1276(String string) {
        try {
            String string_6_ = null;
            int i_7_ = string.indexOf("--> ");
            if (i_7_ >= 0) {
                string_6_ = string.substring(0, 4 + i_7_);
                string = string.substring(i_7_ + 4);
            }
            if (string.startsWith("directlogin ")) {
                int i_8_ = string.indexOf(" ", "directlogin ".length());
                if (i_8_ >= 0) {
                    int i_9_ = string.length();
                    string = new StringBuilder().append(string.substring(0, i_8_)).append(" ").toString();
                    for (int i_10_ = i_8_ + 1; i_10_ < i_9_; i_10_++)
                        string = new StringBuilder().append(string).append("*").toString();
                }
            }
            if (null != string_6_)
                return new StringBuilder().append(string_6_).append(string).toString();
            return string;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("et.z(").append(')').toString());
        }
    }

    public static int method3831(CharSequence charsequence, char c, int i) {
        try {
            int i_5_ = 0;
            int i_6_ = charsequence.length();
            for (int i_7_ = 0; i_7_ < i_6_; i_7_++) {
                if (charsequence.charAt(i_7_) == c) {
                    i_5_++;
                }
            }
            return i_5_;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("nb.a(").append(')').toString());
        }
    }

    public static void method946(String[] strings, short[] is, int i, int i_4_) {
        try {
            if (i < i_4_) {
                int i_6_ = (i_4_ + i) / 2;
                int i_7_ = i;
                String string = strings[i_6_];
                strings[i_6_] = strings[i_4_];
                strings[i_4_] = string;
                short i_8_ = is[i_6_];
                is[i_6_] = is[i_4_];
                is[i_4_] = i_8_;
                for (int i_9_ = i; i_9_ < i_4_; i_9_++) {
                    if (null == string || (null != strings[i_9_] && strings[i_9_].compareTo(string) < (i_9_ & 0x1))) {
                        String string_10_ = strings[i_9_];
                        strings[i_9_] = strings[i_7_];
                        strings[i_7_] = string_10_;
                        short i_11_ = is[i_9_];
                        is[i_9_] = is[i_7_];
                        is[i_7_++] = i_11_;
                    }
                }
                strings[i_4_] = strings[i_7_];
                strings[i_7_] = string;
                is[i_4_] = is[i_7_];
                is[i_7_] = i_8_;
                method946(strings, is, i, i_7_ - 1);
                method946(strings, is, i_7_ + 1, i_4_);
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("dk.f(").append(')').toString());
        }
    }

    public static String method556(byte[] is, int offset, int character, int i_2_) {
        try {
            char[] cs = new char[character];
            int i_3_ = 0;
            for (int i_4_ = 0; i_4_ < character; i_4_++) {
                int i_5_ = is[i_4_ + offset] & 0xff;
                if (0 == i_5_) {
                    if (i_2_ == 1825442367)
                        throw new IllegalStateException();
                } else {
                    if (i_5_ >= 128 && i_5_ < 160) {
                        int i_6_ = symbolSet[i_5_ - 128];
                        if (0 == i_6_)
                            i_6_ = 63;
                        i_5_ = i_6_;
                    }
                    cs[i_3_++] = (char) i_5_;
                }
            }
            return new String(cs, 0, i_3_);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("cb.u(").append(')').toString());
        }
    }

    public static final boolean method5621(char c) {
        if (Character.isISOControl(c))
            return false;
        if (isAlphabetic(c))
            return true;
        char[] cs = Class511.aCharArray6225;
        for (int i_12_ = 0; i_12_ < cs.length; i_12_++) {
            char c_13_ = cs[i_12_];
            if (c_13_ == c)
                return true;
        }
        cs = Class511.aCharArray6223;
        for (int i_14_ = 0; i_14_ < cs.length; i_14_++) {
            char c_15_ = cs[i_14_];
            if (c_15_ == c)
                return true;
        }
        return false;
    }

    public static boolean isAlphabetic(char c) {
            return (c >= '0' && c <= '9' || c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z');
    }

    public static boolean isSymbol(char keyCharacter) {
        if (keyCharacter > 0 && keyCharacter < '\u0080' || keyCharacter >= '\u00a0' && keyCharacter <= '\u00ff')
            return true;
        if (keyCharacter != 0) {
            char[] charSet = symbolSet;
            for (int index = 0; index < charSet.length; index++) {
                char character = charSet[index];
                if (character == keyCharacter)
                    return true;
            }
        }
        return false;
    }

    public static boolean method4692(CharSequence charsequence, int i, boolean bool, int i_2_) {
            if (i < 2 || i > 36)
                throw new IllegalArgumentException(new StringBuilder().append("").append(i).toString());
            boolean bool_3_ = false;
            boolean bool_4_ = false;
            int i_5_ = 0;
            int i_6_ = charsequence.length();
            for (int i_7_ = 0; i_7_ < i_6_; i_7_++) {
                int i_8_ = charsequence.charAt(i_7_);
                if (i_7_ == 0) {
                    if (45 == i_8_) {
                        bool_3_ = true;
                        continue;
                    }
                    if (i_8_ == 43 && bool) {
                        if (i_2_ != -1628070489)
                            throw new IllegalStateException();
                        continue;
                    }
                }
                if (i_8_ >= 48 && i_8_ <= 57)
                    i_8_ -= 48;
                else if (i_8_ >= 65 && i_8_ <= 90)
                    i_8_ -= 55;
                else if (i_8_ >= 97 && i_8_ <= 122)
                    i_8_ -= 87;
                else
                    return false;
                if (i_8_ >= i)
                    return false;
                if (bool_3_)
                    i_8_ = -i_8_;
                int i_9_ = i_5_ * i + i_8_;
                if (i_9_ / i != i_5_)
                    return false;
                i_5_ = i_9_;
                bool_4_ = true;
            }
            return bool_4_;
    }

    public static boolean method5729(byte code) {
        int keycode = code & 0xFF;
        if (keycode == 0)
            return false;
        return !(keycode >= 128 && keycode < 160 && '\0' == symbolSet[keycode - 128]);
    }

    public static final boolean method4910(String string, String string_3_, String string_4_, String string_5_) {
        if (string == null || null == string_4_)
            return false;
        if (string.startsWith("#") || string_4_.startsWith("#"))
            return string.equals(string_4_);
        return string_3_.equals(string_5_);
    }

    public static int addLengthByTwo(String string) {
        return string.length() + 2;
    }

    public static String method2114(CharSequence charsequence, int i) {
            String string = Class404.method4952(method5194(charsequence));
            if (null == string)
                string = "";
            return string;
    }

    public static int method1998(CharSequence charsequence) {
            return method5619(charsequence, 10, true, -1228221916);
    }

    public static int method4550(char c) {
        int i_3_ = c << 4;
        if (Character.isUpperCase(c) || Character.isTitleCase(c)) {
            int i_4_ = Character.toLowerCase(c);
            i_3_ = (i_4_ << 4) + 1;
        }
        return i_3_;
    }

    public static char method2403(char c) {
        if ('\u00c6' == c)
            return 'E';
        if (c == '\u00e6')
            return 'e';
        if (c == '\u00df')
            return 's';
        if ('\u0152' == c)
            return 'E';
        if ('\u0153' == c)
            return 'e';
        return '\0';
    }
}
