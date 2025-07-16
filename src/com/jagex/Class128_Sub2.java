package com.jagex;/* Class128_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class128_Sub2 extends Class128 {
    public int anInt8558;
    public int anInt8559;

    Class128_Sub2(Class139 class139, Class133 class133, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_) {
        super(class139, class133, i, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_);
        anInt8558 = i_6_ * 175032877;
        anInt8559 = i_7_ * 43687401;
    }

    static final Object[] method1441(String string, ScriptRuntime runtime) {
        Object[] objects = new Object[string.length() + 1];
        for (int i_8_ = objects.length - 1; i_8_ >= 1; i_8_--) {
            if (string.charAt(i_8_ - 1) == 's')
                objects[i_8_] = (runtime.objectStack[(runtime.objectArgs -= 969361751) * -203050393]);
            else if (string.charAt(i_8_ - 1) == '\u00a7')
                objects[i_8_] = new Long(runtime.longStacks[(runtime.longArgs -= -682569305) * 1685767703]);
            else
                objects[i_8_] = new Integer(runtime.integerStack[(runtime.integerStackOffset -= -391880689) * 681479919]);
        }
        int i_9_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        if (-1 != i_9_)
            objects[0] = new Integer(i_9_);
        else
            objects = null;
        return objects;
    }

    public Class146 method49(int i) {
        try {
            return Class146.aClass146_1565;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("zw.f(").append(')').toString());
        }
    }

    public Class146 method50() {
        return Class146.aClass146_1565;
    }

    public Class146 method51() {
        return Class146.aClass146_1565;
    }
}
