package com.jagex;/* Class82_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.Js5Configs;
import com.jagex.game.cache.definition.animation.AnimationDefinition;

import java.util.Arrays;

public class RSAKeys extends Class82 {
    int anInt6838;
    int animationID;
    int anInt6840;
    int[] anIntArray6841;

    RSAKeys(Buffer buffer) {
        super(buffer);
        this.anInt6840 = buffer.readUShort() * 838347599;
        this.anIntArray6841 = new int[Class522.method6325((byte) -63).length];
        this.animationID = buffer.readBigSmart() * 1100678783;
        Arrays.fill(this.anIntArray6841, 0, this.anIntArray6841.length, this.animationID * 2090514815);
        this.anInt6838 = buffer.readInt() * -1086817115;
    }

    public void method866() {
        Entity entity = Class87.aClass94Array794[this.anInt6840 * -2094920785].method1015();
        if (0 == 237701933 * this.anInt6838)
            Class431.method5768(entity, this.anIntArray6841, 0, false);
        else
            StaticMethods.method3428(entity, (new int[]{this.animationID * 2090514815}), new int[]{0}, new int[]{this.anInt6838 * 237701933}, 1644064563);
    }

    boolean method870() {
        AnimationDefinition animationDefinition = Js5Configs.animsList.get((2090514815 * (this.animationID)));
        return animationDefinition.ready();
    }

    public void method869() {
        Entity entity = Class87.aClass94Array794[this.anInt6840 * -2094920785].method1015();
        if (0 == 237701933 * this.anInt6838)
            Class431.method5768(entity, this.anIntArray6841, 0, false);
        else
            StaticMethods.method3428(entity, new int[]{this.animationID * 2090514815}, new int[]{0}, new int[]{this.anInt6838 * 237701933}, 1644064563);
    }

    public void method868() {
        Entity entity = Class87.aClass94Array794[this.anInt6840 * -2094920785].method1015();
        if (0 == 237701933 * this.anInt6838)
            Class431.method5768(entity, this.anIntArray6841, 0, false);
        else
            StaticMethods.method3428(entity, new int[]{this.animationID * 2090514815}, new int[]{0}, new int[]{this.anInt6838 * 237701933}, 1644064563);
    }
}
