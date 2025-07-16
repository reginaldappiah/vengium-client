package com.jagex;/* Class492 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class492 {
    public int anInt6081;
    public int anInt6084;
    CursorDefinitionLoader aClass491_6082;
    int anInt6083;

    Class492() {
        /* empty */
    }

    static final void method6183(int i, int i_11_, int i_12_, int i_13_, int i_14_) {
        try {
            if (i_11_ > i_12_) {
                for (int i_15_ = i_12_; i_15_ < i_11_; i_15_++)
                    Class372_Sub2.anIntArrayArray4047[i_15_][i] = i_13_;
            } else {
                for (int i_16_ = i_11_; i_16_ < i_12_; i_16_++)
                    Class372_Sub2.anIntArrayArray4047[i_16_][i] = i_13_;
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ug.r(").append(')').toString());
        }
    }

    static boolean method6184(Class355 class355) {
        try {
            return Class170.method1814(class355, null);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ug.p(").append(')').toString());
        }
    }

    void method6179(Buffer class298_sub53, int i, byte i_0_) {
        try {
            if (i == 1)
                this.anInt6083 = class298_sub53.readBigSmart() * -1732871629;
            else if (2 == i) {
                anInt6084 = class298_sub53.readUByte() * -1845194875;
                anInt6081 = class298_sub53.readUByte() * -1430050043;
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ug.f(").append(')').toString());
        }
    }

    void method6180(Buffer class298_sub53, int i) {
        try {
            for (; ; ) {
                int i_1_ = class298_sub53.readUByte();
                if (i_1_ == 0) {
                    if (i == 1638036980)
                        break;
                    break;
                }
                method6179(class298_sub53, i_1_, (byte) -92);
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ug.a(").append(')').toString());
        }
    }

    public synchronized Sprite method6181(int i) {
        try {
            Sprite class89 = ((Sprite) (this.aClass491_6082.aClass348_6078.get((long) (this.anInt6083 * 1338052859))));
            if (class89 != null)
                return class89;
            class89 = Sprite.loadFirst((this.aClass491_6082.aClass243_6077), 1338052859 * this.anInt6083, 0);
            if (class89 != null)
                this.aClass491_6082.aClass348_6078.put(class89, (long) (1338052859 * this.anInt6083));
            return class89;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ug.b(").append(')').toString());
        }
    }

}
