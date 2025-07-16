package com.jagex;/* Class346 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.utils.ColorUtils;

public class ErrorReporter {

    static {
        Math.sqrt(131072.0);
    }

    static final void method4170(ScriptRuntime class403, short i) {
        try {
            class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = SettingsManager.settingsManager.textures.isVengiumContext() ? 1 : 0;
        } catch (RuntimeException runtimeexception) {
            throw generateReport(runtimeexception, new StringBuilder().append("ol.anh(").append(')').toString());
        }
    }

    static void method4171(int i, int i_0_, IComponentDefinition class105, ToolkitLoader toolkitLoader, int i_1_, int i_2_, int i_3_) {
        try {
            int i_4_ = Class10.entitiesInRegion * 1168366243;
            int[] players = Class10.players;
            for (int index = 0; index < i_4_; index++) {
                Player player = GameClient.entities[players[index]];
                if (null != player && player.method4477() && !player.hidden && (player != Player.myPlayer) && (player.plane == (Player.myPlayer.plane))) {
                    Vector3f class217 = (player.getWorldTransform().trans);
                    int i_6_ = (int) class217.x / 128 - i / 128;
                    int i_7_ = (int) class217.z / 128 - i_0_ / 128;
                    boolean bool = false;
                    for (int i_8_ = 0; i_8_ < GameClient.anInt8941 * -1054937867; i_8_++) {
                        if (player.accountName.equals(GameClient.playerAccountNames[i_8_]) && GameClient.anIntArray8946[i_8_] != 0) {
                            bool = true;
                            break;
                        }
                    }
                    boolean bool_9_ = false;
                    for (int i_10_ = 0; i_10_ < -1801543887 * Class489.anInt6071; i_10_++) {
                        if (player.accountName.equals(StaticMethods.aClass7Array6846[i_10_].aString93)) {
                            bool_9_ = true;
                            break;
                        }
                    }
                    boolean bool_11_ = false;
                    if (0 != -1473655357 * (Player.myPlayer.team) && 0 != (-1473655357 * player.team) && ((player.team * -1473655357) == (Player.myPlayer.team) * -1473655357))
                        bool_11_ = true;
                    if (player.aBoolean10203)
                        StaticMethods.method5883(class105, toolkitLoader, i_1_, i_2_, i_6_, i_7_, SubIncommingPacket.aClass57Array2349[6]);
                    else if (bool_11_)
                        StaticMethods.method5883(class105, toolkitLoader, i_1_, i_2_, i_6_, i_7_, SubIncommingPacket.aClass57Array2349[4]);
                    else if (player.aBoolean10222)
                        StaticMethods.method5883(class105, toolkitLoader, i_1_, i_2_, i_6_, i_7_, SubIncommingPacket.aClass57Array2349[7]);
                    else if (bool)
                        StaticMethods.method5883(class105, toolkitLoader, i_1_, i_2_, i_6_, i_7_, SubIncommingPacket.aClass57Array2349[3]);
                    else if (bool_9_)
                        StaticMethods.method5883(class105, toolkitLoader, i_1_, i_2_, i_6_, i_7_, SubIncommingPacket.aClass57Array2349[5]);
                    else
                        StaticMethods.method5883(class105, toolkitLoader, i_1_, i_2_, i_6_, i_7_, SubIncommingPacket.aClass57Array2349[2]);
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw generateReport(runtimeexception, new StringBuilder().append("ol.n(").append(')').toString());
        }
    }

    public static void method4172(String string, boolean bool, boolean bool_12_, boolean bool_13_, boolean bool_14_, byte i) {
        try {
            Class273.method2559(string, bool, bool_12_, "openjs", bool_13_, bool_14_, -1892115895);
        } catch (RuntimeException runtimeexception) {
            throw generateReport(runtimeexception, new StringBuilder().append("ol.a(").append(')').toString());
        }
    }

    static String method4174(MenuOptionNode menuOptionNode, byte i) {
        try {
            return new StringBuilder().append(menuOptionNode.aString9585).append(ColorUtils.htmlToHex(16777215)).append(" >").toString();
        } catch (RuntimeException runtimeexception) {
            throw generateReport(runtimeexception, new StringBuilder().append("ol.be(").append(')').toString());
        }
    }

    public static RuntimeException_Sub2 generateReport(Throwable throwable, String string) {
        try {
            RuntimeException_Sub2 runtimeexception_sub2;
            if (throwable instanceof RuntimeException_Sub2) {
                runtimeexception_sub2 = (RuntimeException_Sub2) throwable;
                StringBuilder stringbuilder = new StringBuilder();
                RuntimeException_Sub2 runtimeexception_sub2_27_ = runtimeexception_sub2;
                runtimeexception_sub2_27_.aString6308 = stringbuilder.append(runtimeexception_sub2_27_.aString6308).append(' ').append(string).toString();
            } else
                runtimeexception_sub2 = new RuntimeException_Sub2(throwable, string);
            return runtimeexception_sub2;
        } catch (RuntimeException runtimeexception) {
            throw generateReport(runtimeexception, new StringBuilder().append("ol.f(").append(')').toString());
        }
    }

    static final void errorPrinter(String string) {
        System.out.println(new StringBuilder().append("Error: ").append(Class298_Sub31.method3115(string, "%0a", "\n", -2025331206)).toString());
    }
}
