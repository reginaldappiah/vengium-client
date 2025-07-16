package com.jagex;/* EffectiveVertex - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.prefetch.Js5List;
import com.jagex.maths.Matrix4f;
import com.jagex.utils.TimeUtils;

public class EffectiveVertex {
    public static short[] aShortArray678;
    static String[] filestore_cache_location;
    public int anInt671;
    public EffectiveVertex aEffectiveVertex_672;
    public int anInt673;
    public int anInt674;
    public int anInt675;
    public int anInt676;
    public Matrix4f aMatrix4f_677;

    EffectiveVertex(int i, int i_1_) {
        anInt673 = i * -1460732981;
        anInt674 = i_1_ * -356109865;
    }

    static void method777(boolean bool, Class298_Sub19_Sub1 class298_sub19_sub1) {
        Class300.aClass284_3212.method2679(class298_sub19_sub1);
        if (bool)
            StaticMethods.method5897(Js5List.JS5_SOUND_EFFECTS3, Js5List.JS5_SOUND_EFFECTS2, Js5List.JS5_SOUND_EFFECTS, class298_sub19_sub1, Class300.aClass284_3212);
    }

    static final void resetCamera() {
        Class_na.resetCamera();
    }

    static final void method780() {
        StaticMethods.method1947();
    }

    public static boolean method781() {
        if (0 != Class79.anInt734 * 617004265)
            return true;
        return Class79.aClass298_Sub19_Sub1_737.method2985();
    }

    public static MouseTracker createMouseTracker(int mouseX, int mouseY, int type, int rotation) {
        synchronized (MouseTracker.aClass298_Sub50_Sub2Array9770) {
            MouseTracker mouseTracker;
            if (Class446.anInt5614 * 656179585 == 0)
                mouseTracker = new MouseTracker();
            else
                mouseTracker = (MouseTracker.aClass298_Sub50_Sub2Array9770[(Class446.anInt5614 -= 453361281) * 656179585]);
            mouseTracker.mouseX = mouseX * 1060004021;
            mouseTracker.mouseY = mouseY * 1196163649;
            mouseTracker.type = type * -398953071;
            mouseTracker.rotation = rotation * 1960569825;
            mouseTracker.time = TimeUtils.getTime() * -212908250700906157L;
            MouseTracker mouseTracker1 = mouseTracker;
            return mouseTracker1;
        }
    }

    public Class190 method775() {
        return Class140.method1554(617796067 * anInt673);
    }

    EffectiveVertex method776(int i) {
        return new EffectiveVertex(anInt673 * 617796067, i);
    }

}
