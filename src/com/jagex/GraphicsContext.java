package com.jagex;/* Class52 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class GraphicsContext {
	static Class4 aClass4_508;

	static Class4 method555(int i) {
        try {
            if (i == 0) {
                if (3.0 == (double) Class301_Sub1.aFloat3233)
                    return Class381.aClass4_4119;
                if (4.0 == (double) Class301_Sub1.aFloat3233)
                    return StaticMethods.aClass4_2795;
                if (6.0 == (double) Class301_Sub1.aFloat3233)
                    return aClass4_508;
                if ((double) Class301_Sub1.aFloat3233 >= 8.0)
                    return Class414.aClass4_5326;
            } else if (1 == i) {
                if (3.0 == (double) Class301_Sub1.aFloat3233)
                    return aClass4_508;
                if (4.0 == (double) Class301_Sub1.aFloat3233)
                    return Class414.aClass4_5326;
                if ((double) Class301_Sub1.aFloat3233 == 6.0)
                    return StaticMethods.aClass4_6525;
                if ((double) Class301_Sub1.aFloat3233 >= 8.0)
                    return Class400.aClass4_5224;
            } else if (2 == i) {
                if (3.0 == (double) Class301_Sub1.aFloat3233)
                    return StaticMethods.aClass4_6525;
                if ((double) Class301_Sub1.aFloat3233 == 4.0)
                    return Class400.aClass4_5224;
                if (6.0 == (double) Class301_Sub1.aFloat3233)
                    return Class152.aClass4_1594;
                if ((double) Class301_Sub1.aFloat3233 >= 8.0)
                    return Class241.aClass4_2707;
            }
            return null;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("cb.bt(").append(')').toString());
        }
    }

	public abstract int getWidth();

	abstract boolean detach();

	abstract boolean attach();

	GraphicsContext() {
	}

	public abstract void destroy();

	public abstract int getHeight();

}
