package com.jagex;/* Class438_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.ConfigType;
import com.jagex.game.cache.definition.animation.AnimationDefinition;

public class Animator_Sub2 extends Animator {

    Class365_Sub1 aClass365_Sub1_8440;

    Animator_Sub2(Class365_Sub1 class365_sub1, boolean bool) {
        super(bool);
        this.aClass365_Sub1_8440 = class365_sub1;
    }

    static boolean method5849(SceneObject sceneObject) {
        ObjectDefinition objectDefinition = GameClient.myRegion.getObjectDefinitionLoader().get(sceneObject.getID());
        if (-1 == -1204256389 * objectDefinition.anInt5400)
            return true;
        Class496 class496 = ConfigType.aClass487_1463.method6159((objectDefinition.anInt5400 * -1204256389));
        if (-1 == 1690480405 * class496.anInt6097)
            return true;
        return class496.method6197();
    }

    void method5837(AnimationDefinition animationDefinitions, int i) {
        StaticMethods.handleAnimationSound(animationDefinitions, i, this.aClass365_Sub1_8440);
    }
}
