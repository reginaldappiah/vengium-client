package com.jagex;/* Class365_Sub1_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class365_Sub1_Sub5 extends Class365_Sub1 {
    static int[] anIntArray9808 = {19, 55, 38, 155, 255, 110, 137, 205, 76};
    public short aShort9814;

    Class365_Sub1_Sub5(Region class331, int i, int i_7_, int i_8_, int plane, int i_10_, int i_11_) {
        super(class331);
        this.plane = (byte) plane;
        aByte7724 = (byte) i_10_;
        aShort9814 = (short) i_11_;
        method4340(new Vector3f((float) i, (float) i_7_, (float) i_8_));
    }

    int method4354(Light[] lights, int i) {
        Vector3f class217 = getWorldTransform().trans;
        int x = ((int) class217.x >> -1688804109 * aClass331_7722.positionHash);
        int i_1_ = ((int) class217.z >> -1688804109 * aClass331_7722.positionHash);
        int i_2_ = 0;
        if (aClass331_7722.anInt3553 * -804213305 == x)
            i_2_++;
        else if (-804213305 * aClass331_7722.anInt3553 < x)
            i_2_ += 2;
        if (465603579 * aClass331_7722.anInt3513 == i_1_)
            i_2_ += 3;
        else if (465603579 * aClass331_7722.anInt3513 > i_1_)
            i_2_ += 6;
        int i_3_ = anIntArray9808[i_2_];
        if (0 != (aShort9814 & i_3_))
            return method4392(x, i_1_, lights);
        if (1 == aShort9814 && x > 0)
            return method4392(x - 1, i_1_, lights);
        if (4 == aShort9814 && x <= 1988988347 * aClass331_7722.cameraXLimit)
            return method4392(x + 1, i_1_, lights);
        if (aShort9814 == 8 && i_1_ > 0)
            return method4392(x, i_1_ - 1, lights);
        if (2 == aShort9814 && i_1_ <= aClass331_7722.cameraYLimit * 1340714547)
            return method4392(x, i_1_ + 1, lights);
        if (16 == aShort9814 && x > 0 && i_1_ <= 1340714547 * aClass331_7722.cameraYLimit)
            return method4392(x - 1, 1 + i_1_, lights);
        if (32 == aShort9814 && x <= aClass331_7722.cameraXLimit * 1988988347 && i_1_ <= aClass331_7722.cameraYLimit * 1340714547)
            return method4392(x + 1, i_1_ + 1, lights);
        if (aShort9814 == 128 && x > 0 && i_1_ > 0)
            return method4392(x - 1, i_1_ - 1, lights);
        if (aShort9814 == 64 && x <= aClass331_7722.cameraXLimit * 1988988347 && i_1_ > 0)
            return method4392(x + 1, i_1_ - 1, lights);
        throw new RuntimeException("");
    }

    boolean method4364(GraphicsToolkit graphicsToolkit) {
        Vector3f class217 = getWorldTransform().trans;
        return (aClass331_7722.aClass333_3512.method4072(this, aByte7724, ((int) class217.x >> aClass331_7722.positionHash * -1688804109), ((int) class217.z >> -1688804109 * aClass331_7722.positionHash)));
    }

    boolean method4360(int i) {
        Vector3f class217 = getWorldTransform().trans;
        return (aClass331_7722.aBooleanArrayArray3563[(583010427 * aClass331_7722.anInt3538 + (((int) class217.x >> -1688804109 * aClass331_7722.positionHash) - (-804213305 * aClass331_7722.anInt3553)))][(aClass331_7722.anInt3538 * 583010427 + (((int) class217.z >> -1688804109 * aClass331_7722.positionHash) - (aClass331_7722.anInt3513 * 465603579)))]);
    }

}
