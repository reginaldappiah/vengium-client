package com.jagex;/* Class367 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class367 {
    public static Class367 aClass367_3982;
    public static Class367 aClass367_3983;
    public static Class367 aClass367_3987 = new Class367(0, 2, 2, 1);
    public static Class367 aClass367_3991;
    public static Class367 aClass367_3997;
    public static Class367 aClass367_3999 = new Class367(1, 2, 2, 0);
    public static SpriteToolkit aClass57_4001;
    static Class367 aClass367_3984;
    static Class367 aClass367_3988;
    static Class367 aClass367_3989;
    static Class367 aClass367_3990;
    static Class367 aClass367_3992;
    static Class367 aClass367_3993;
    static Class367 aClass367_3994;
    static Class367 aClass367_3995;

    static {
        aClass367_3994 = new Class367(2, 4, 4, 0);
        aClass367_3990 = new Class367(4, 1, 1, 1);
        aClass367_3982 = new Class367(6, 0, 4, 2);
        aClass367_3983 = new Class367(7, 0, 1, 1);
        aClass367_3988 = new Class367(8, 0, 4, 1);
        aClass367_3989 = new Class367(9, 0, 4, 1);
        aClass367_3997 = new Class367(10, 2, 2, 0);
        aClass367_3991 = new Class367(11, 0, 1, 2);
        aClass367_3992 = new Class367(12, 0, 1, 0);
        aClass367_3993 = new Class367(13, 0, 1, 0);
        aClass367_3984 = new Class367(14, 0, 4, 1);
        aClass367_3995 = new Class367(15, 0, 1, 0);
    }

    public int anInt3985;
    public int anInt3986;
    public int anInt3996;
    public int anInt3998;

    Class367(int i, int i_0_, int i_1_, int i_2_) {
        anInt3996 = i * 1137854245;
        anInt3986 = -1437469861 * i_0_;
        anInt3998 = -1982815013 * i_1_;
        anInt3985 = -138487417 * i_2_;
    }

    static void method4551(IComponentDefinition componentDefinition, int i, int i_5_) {
        Class117 class117 = componentDefinition.method1116(GameClient.activeGraphicsToolkit);
        if (null != class117) {
            GameClient.activeGraphicsToolkit.setClip(i, i_5_, -2093041337 * componentDefinition.aspectWidth + i, (i_5_ + componentDefinition.aspectHeight * 457937409));
            if (Minimap.anInt56 * -64305285 < 3) {
                int i_7_ = (int) -GameClient.cameraXAngle;
                i_7_ = i_7_ + -1840255270 * GameClient.anInt8801 & 0x3fff;
                i_7_ <<= 2;
                StaticMethods.activeSpriteToolkit.method639(((float) i + (float) (componentDefinition.aspectWidth * -2093041337) / 2.0F), ((float) i_5_ + (float) (componentDefinition.aspectHeight * 457937409) / 2.0F), 4135, i_7_, class117.toolkitLoader, i, i_5_);
            } else
                GameClient.activeGraphicsToolkit.DA(-16777216, class117.toolkitLoader, i, i_5_);
        }
    }

}
