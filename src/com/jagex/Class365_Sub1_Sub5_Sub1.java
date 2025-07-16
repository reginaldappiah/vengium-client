package com.jagex;/* Class365_Sub1_Sub5_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.settings.BloomSettings;
import com.jagex.game.settings.SceneryShadowsSettings;
import com.jagex.maths.Matrix43f;

public class Class365_Sub1_Sub5_Sub1 extends Class365_Sub1_Sub5 implements SceneObject {
    boolean aBoolean9892;
    ModelToolkit modelToolkit;
    Class_na aClass_na9894;
    Class334 aClass334_9895;
    int anInt9896;
    byte aByte9897;
    ObjectDefinitionLoader objectDefinitionLoader;
    byte aByte9899;
    boolean aBoolean9900;
    boolean aBoolean9901;
    boolean aBoolean9902;

    public Class365_Sub1_Sub5_Sub1(Region class331, GraphicsToolkit graphicsToolkit, ObjectDefinitionLoader objectDefinitionLoader, ObjectDefinition class432, int i, int i_9_, int i_10_, int plane, int i_12_, boolean bool, int i_13_, int i_14_, boolean bool_15_) {
        super(class331, i_10_, plane, i_12_, i, i_9_, StaticMethods.method952(i_13_, i_14_));
        this.objectDefinitionLoader = objectDefinitionLoader;
        this.anInt9896 = class432.objectID * 584655573;
        this.aBoolean9901 = bool;
        this.aByte9899 = (byte) i_13_;
        this.aByte9897 = (byte) i_14_;
        this.aBoolean9900 = 0 != 1532834983 * class432.anInt5382 && !bool;
        this.aBoolean9892 = bool_15_;
        this.aBoolean9902 = (graphicsToolkit.method5082() && class432.aBoolean5433 && !this.aBoolean9901 && SettingsManager.settingsManager.sceneryShadows.getValue() != SceneryShadowsSettings.NONE);
        int i_16_ = 2048;
        if (this.aBoolean9892)
            i_16_ |= 0x10000;
        if (class432.aBoolean5441)
            i_16_ |= 0x80000;
        FontMetricsDefinitionLoader fontMetricsDefinitionLoader = method4524(graphicsToolkit, i_16_, this.aBoolean9902);
        if (fontMetricsDefinitionLoader != null) {
            this.modelToolkit = (ModelToolkit) fontMetricsDefinitionLoader.toolkit;
            this.aClass_na9894 = (Class_na) fontMetricsDefinitionLoader.anObject5646;
            if (this.aBoolean9892 || class432.aBoolean5441) {
                this.modelToolkit = this.modelToolkit.method4755((byte) 0, i_16_, false);
                if (class432.aBoolean5441) {
                    Class287 class287 = GameClient.myRegion.method2632();
                    this.modelToolkit.PA(class287.anInt3096 * 1599271859, 1630923113 * class287.anInt3097, class287.anInt3098 * -1560648831, class287.anInt3099 * -57569897);
                }
            }
        }
        method4362(1);
    }

    public static boolean method4525(boolean bloomOn) {
        boolean toolkitBloom = GameClient.activeGraphicsToolkit.method5054();
        if (bloomOn != toolkitBloom) {
            if (bloomOn) {
                if (!GameClient.activeGraphicsToolkit.method5052())
                    bloomOn = false;
            } else
                GameClient.activeGraphicsToolkit.bloomSmn();
            if (bloomOn != toolkitBloom) {
                SettingsManager.settingsManager.setValue((SettingsManager.settingsManager.bloom), bloomOn ? BloomSettings.BLOOMON : BloomSettings.BLOOMOFF);
                ToMoveSettings.encodeBuffer();
                return true;
            }
            return false;
        }
        return true;
    }

    boolean method4399() {
        if (null != this.modelToolkit)
            return !this.modelToolkit.u();
        return true;
    }

    boolean method4376() {
        if (null != this.modelToolkit)
            return this.modelToolkit.i();
        return false;
    }

    public int method4361() {
        return (this.modelToolkit != null ? this.modelToolkit.YA() : 0);
    }

    ModelToolkit method4523(GraphicsToolkit graphicsToolkit, int i) {
        if (null != this.modelToolkit && graphicsToolkit.method5017(this.modelToolkit.m(), i) == 0)
            return this.modelToolkit;
        FontMetricsDefinitionLoader fontMetricsDefinitionLoader = method4524(graphicsToolkit, i, false);
        if (null != fontMetricsDefinitionLoader)
            return (ModelToolkit) fontMetricsDefinitionLoader.toolkit;
        return null;
    }

    FontMetricsDefinitionLoader method4524(GraphicsToolkit graphicsToolkit, int i, boolean bool) {
        ObjectDefinition class432 = (this.objectDefinitionLoader.get(1940788231 * this.anInt9896));
        FloorToolkit class_xa;
        FloorToolkit class_xa_2_;
        if (this.aBoolean9901) {
            class_xa = aClass331_7722.aClass_xaArray3521[aByte7724];
            class_xa_2_ = aClass331_7722.aClass_xaArray3519[0];
        } else {
            class_xa = aClass331_7722.aClass_xaArray3519[aByte7724];
            if (aByte7724 < 3)
                class_xa_2_ = aClass331_7722.aClass_xaArray3519[aByte7724 + 1];
            else
                class_xa_2_ = null;
        }
        Vector3f class217 = getWorldTransform().trans;
        return (class432.method5785(graphicsToolkit, i, this.aByte9899, this.aByte9897, class_xa, class_xa_2_, (int) class217.x, (int) class217.y, (int) class217.z, bool, null, 566759128));
    }

    public boolean method39() {
        return this.aBoolean9902;
    }

    Class335 method4394(GraphicsToolkit graphicsToolkit) {
        if (this.modelToolkit == null)
            return null;
        Matrix43f class222 = method4347();
        Class335 class335 = StaticMethods.method818((this.aBoolean9900));
        this.modelToolkit.render(class222, aClass302_Sub1Array7726[0], 0);
        return class335;
    }

    boolean method4366() {
        return this.aBoolean9892;
    }

    void method4355(GraphicsToolkit graphicsToolkit, Class365_Sub1 class365_sub1, int i, int i_3_, int i_4_, boolean bool) {
        if (class365_sub1 instanceof Class365_Sub1_Sub5_Sub1) {
            Class365_Sub1_Sub5_Sub1 class365_sub1_sub5_sub1_6_ = (Class365_Sub1_Sub5_Sub1) class365_sub1;
            if (this.modelToolkit != null && (class365_sub1_sub5_sub1_6_.modelToolkit) != null)
                this.modelToolkit.method4745(class365_sub1_sub5_sub1_6_.modelToolkit, i, i_3_, i_4_, bool);
        } else if (class365_sub1 instanceof Class365_Sub1_Sub1_Sub6) {
            Class365_Sub1_Sub1_Sub6 class365_sub1_sub1_sub6 = (Class365_Sub1_Sub1_Sub6) class365_sub1;
            if (this.modelToolkit != null && (class365_sub1_sub1_sub6.aClass387_9879) != null)
                this.modelToolkit.method4745((class365_sub1_sub1_sub6.aClass387_9879), i, i_3_, i_4_, bool);
        }
    }

    void method4398() {
        this.aBoolean9892 = false;
        if (this.modelToolkit != null)
            this.modelToolkit.KA(this.modelToolkit.m() & ~0x10000);
    }

    public int method29() {
        return this.aByte9899;
    }

    public int method30() {
        return this.aByte9897;
    }

    boolean method4350(GraphicsToolkit graphicsToolkit, int i, int i_7_, byte i_8_) {
        ModelToolkit class387 = method4523(graphicsToolkit, 131072);
        if (class387 != null) {
            Matrix43f class222 = method4347();
            return class387.method4787(i, i_7_, class222, false, 0);
        }
        return false;
    }

    public int getID() {
        return 1940788231 * this.anInt9896;
    }

    public void method37(GraphicsToolkit toolkit) {
        Class_na class_na;
        if (null == this.aClass_na9894 && this.aBoolean9902) {
            FontMetricsDefinitionLoader fontMetricsDefinitionLoader = method4524(toolkit, 262144, true);
            class_na = (Class_na) (fontMetricsDefinitionLoader != null ? fontMetricsDefinitionLoader.anObject5646 : null);
        } else {
            class_na = this.aClass_na9894;
            this.aClass_na9894 = null;
        }
        Vector3f class217 = getWorldTransform().trans;
        if (null != class_na)
            aClass331_7722.method4047(class_na, aByte7724, (int) class217.x, (int) class217.z, null, 580390895);
    }

    public void method33(GraphicsToolkit toolkit) {
        Class_na class_na;
        if (null == this.aClass_na9894 && this.aBoolean9902) {
            FontMetricsDefinitionLoader fontMetricsDefinitionLoader = method4524(toolkit, 262144, true);
            class_na = (Class_na) (null != fontMetricsDefinitionLoader ? fontMetricsDefinitionLoader.anObject5646 : null);
        } else {
            class_na = this.aClass_na9894;
            this.aClass_na9894 = null;
        }
        Vector3f class217 = getWorldTransform().trans;
        if (null != class_na)
            aClass331_7722.method4055(class_na, aByte7724, (int) class217.x, (int) class217.z, null, 2001227588);
    }

    public Class334 method4358(GraphicsToolkit graphicsToolkit) {
        Vector3f class217 = getWorldTransform().trans;
        if (null == this.aClass334_9895)
            this.aClass334_9895 = Class472.method6063((int) class217.x, (int) class217.y, (int) class217.z, method4523(graphicsToolkit, 0));
        return this.aClass334_9895;
    }

    void method4357(GraphicsToolkit graphicsToolkit, int i) {

    }

    public void method31() {
        if (null != this.modelToolkit)
            this.modelToolkit.method4784();
    }

}
