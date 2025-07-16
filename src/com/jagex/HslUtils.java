package com.jagex;/* Class86 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.Js5Configs;

public class HslUtils {
    int objectID;
    Class424 aClass424_787;
    int plane;
    int localX;
    int localY;
    int rotation;

    HslUtils(Buffer buffer) {
        this.objectID = buffer.readBigSmart() * 368471857;
        this.aClass424_787 = ((Class424) StaticMethods.method5701(Class336_Sub6.method4108(), buffer.readUByte()));
    }

    void method959() {
        Class420.spawnObject(-637425735 * this.plane, this.localX * -123379955, 1400706617 * this.localY, -6749525 * this.aClass424_787.anInt6615, -1, this.aClass424_787.type * -1976050083, this.rotation * 1067426701);
    }

    boolean method960() {
        if (766413265 * this.objectID >= 0) {
            ObjectDefinition objectDefinitions = ObjectDefinitionLoader.objectDefinitionLoader.get(((this.objectID) * 766413265));
            boolean bool = objectDefinitions.method5771((this.aClass424_787.type) * -1976050083);
            int[] objectAnimations = objectDefinitions.getObjectAnimations();
            if (objectAnimations != null) {
                int[] animationIDs = objectAnimations;
                for (int index = 0; index < animationIDs.length; index++) {
                    int animationID = animationIDs[index];
                    bool &= Js5Configs.animsList.get(animationID).ready();
                }
            }
            return bool;
        }
        return true;
    }

    void method961(int plane, int localX, int localY, int rotation) {
        Class420.spawnObject(plane, localX, localY, (-6749525 * this.aClass424_787.anInt6615), 766413265 * this.objectID, (this.aClass424_787.type * -1976050083), rotation);
        this.plane = plane * -1177932151;
        this.localX = 1251379141 * localX;
        this.localY = 1672214537 * localY;
        this.rotation = 1408522053 * rotation;
    }
}
